package eu.ase.ro.lab2_1108.network;

import java.util.concurrent.Callable;

public class DownloadCallableTask implements Callable<String> {

    private HttpConnection httpConnection;

    public DownloadCallableTask(HttpConnection httpConnection) {
        this.httpConnection = httpConnection;
    }

    @Override
    public String call() throws Exception {
        return httpConnection.readHttp();
    }
}
