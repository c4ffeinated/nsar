// https://frescolib.org/javadoc/reference/com/facebook/datasource/DataSource.html
// Used in :
//   - viro_bridge\src\main\java\com\viromedia\bridge\utility\ImageDownloader.java

/*

    used in :
    - DataSource<CloseableReference<CloseableImage>> dataSource = imagePipeline.fetchDecodedImage(request, mContext);
    - dataSource.isFinished()
    - dataSource.getResult()
    - dataSource.close()
    - dataSource.subscribe(dataSubscriber, mExecutorSupplier.forBackgroundTasks());
*/