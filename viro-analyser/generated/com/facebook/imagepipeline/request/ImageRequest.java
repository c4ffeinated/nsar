// https://frescolib.org/javadoc/reference/com/facebook/imagepipeline/request/ImageRequest.html
// Used in :
//   - viro_bridge\src\main\java\com\viromedia\bridge\utility\ImageDownloader.java

/* 

    used in :
    - ImageRequest request = ImageRequestBuilder.newBuilderWithSource(uri).build();
    - DataSource<CloseableReference<CloseableImage>> dataSource = imagePipeline.fetchDecodedImage(request, mContext);
    - DataSource<CloseableReference<CloseableImage>> dataSource = imagePipeline.fetchDecodedImage(request, mContext);

*/