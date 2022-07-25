// https://frescolib.org/javadoc/reference/com/facebook/imagepipeline/image/CloseableImage.html
// Used in :
//   - viro_bridge\src\main\java\com\viromedia\bridge\utility\ImageDownloader.java

/*

    used in :
    - DataSource<CloseableReference<CloseableImage>> dataSource = imagePipeline.fetchDecodedImage(request, mContext);
    - DataSubscriber<CloseableReference<CloseableImage>> dataSubscriber =
        new BaseDataSubscriber<CloseableReference<CloseableImage>>()
    - CloseableReference<CloseableImage> result = dataSource.getResult();
    - CloseableImage image = result.get();
    - Throwable t = dataSource.getFailureCause();
    - dataSource.subscribe(dataSubscriber, mExecutorSupplier.forBackgroundTasks());

*/