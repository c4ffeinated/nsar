// https://frescolib.org/javadoc/reference/com/facebook/common/references/CloseableReference.html
// Used in :
//   - viro_bridge\src\main\java\com\viromedia\bridge\utility\ImageDownloader.java

/*

    used in :
    - DataSource<CloseableReference<CloseableImage>> dataSource = imagePipeline.fetchDecodedImage(request, mContext);
    - CloseableReference<CloseableImage> result = dataSource.getResult();

*/