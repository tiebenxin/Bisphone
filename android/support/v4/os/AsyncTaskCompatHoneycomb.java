package android.support.v4.os;

import android.os.AsyncTask;

class AsyncTaskCompatHoneycomb {
    static <Params, Progress, Result> void m692a(AsyncTask<Params, Progress, Result> asyncTask, Params... paramsArr) {
        asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, paramsArr);
    }
}
