#!/usr/bin/env python

# This Python script is dirty. We just need it to study the ReactNative dependencies that Viro uses to check the
# the coverage needed for our potential compatibility tool. Hence, we can't allow not to parse but just to use regexes.
# Generates a folder next to this script, containing files for each import listing all the files that imported it.

import os.path
import re
import pathlib


root_dir = "../packages/nsar/ns-viro/android/"


def print_dict(d):  # More configurable than pprint
    for k, v in d.items():
        print(f"{k} :")
        for l in v:
            print(f"    {l}")


def lineregex(base_dir, reg):
    rdict = {}
    for subdir, dirs, files in os.walk(base_dir):
        for file in files:
            if not file.endswith(".java"):
                continue
            file_path = os.path.join(subdir, file)
            with open(file_path) as file:
                rlines = []
                for line in file.readlines():
                    if re.match(reg, line):
                        rlines += [line[:-1]]
                if rlines != []:
                    rdict[file_path] = rlines
    return rdict


def get_url(package_name):
    if package_name.startswith("com/facebook/react"):
        return f"https://github.com/facebook/react-native/tree/main/ReactAndroid/src/main/java/{package_name}.java"
    # Shouldn't reimplement actually, it's frescolib.org
    if re.match("^com/facebook/[common/datasource/imagepipeline]", package_name):
        return f"https://frescolib.org/javadoc/reference/{package_name}.html"
    # See https://github.com/facebook/yoga
    if package_name.startswith("com/facebook/yoga"):
        return "https://github.com/facebook/yoga"
    raise Exception(f"BAD PACKAGE {package_name}")


os.chdir(os.path.dirname(__file__))
facebook_imports = lineregex(root_dir, "import com\\.facebook")
facebook_imports_curated = {}
for k, v in facebook_imports.items():
    for l in v:
        if l not in facebook_imports_curated:
            facebook_imports_curated[l] = []
        facebook_imports_curated[l].append(k[33:])
pathlib.Path("generated").mkdir(parents=True, exist_ok=True)
for k, v in facebook_imports_curated.items():
    path = k[7:-1].split(".")
    for c in "".join(path):
        if ord(c) not in (*range(ord("A"), ord("Z") + 1), *range(ord("a"), ord("z") + 1)):
            raise Exception("Unsecure char: " + c + " ord " + str(ord(c)))
    pathlib.Path("generated/" + "/".join(path[:-1])).mkdir(parents=True, exist_ok=True)
    java_path = "/".join(path)
    with open("generated/" + java_path + ".java", "w") as f:
        f.write(f"// {get_url(java_path)}\n")
        f.write("// Used in :\n")
        for l in v:
            f.write(f"//   - {l}\n")
