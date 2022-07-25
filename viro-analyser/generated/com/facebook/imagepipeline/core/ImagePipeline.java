// https://frescolib.org/javadoc/reference/com/facebook/imagepipeline/core/ImagePipeline.html
// Used in :
//   - viro_bridge\src\main\java\com\viromedia\bridge\utility\ImageDownloader.java

/*

    used in :
    - ImagePipeline pipeline = Fresco.getImagePipeline();
    - pipeline.evictFromCache(uri);
    - DataSource<CloseableReference<CloseableImage>> dataSource = imagePipeline.fetchDecodedImage(request, mContext);

*/