package ub;

import android.content.Context;
import androidx.work.WorkerParameters;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lub/u0;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "", "workerClassName", "Landroidx/work/WorkerParameters;", "workerParameters", "Landroidx/work/c;", "a", "(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/c;", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class u0 {
    private static final androidx.work.c c(Context context, String str, WorkerParameters workerParameters) {
        try {
            return d(str).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
        } catch (Throwable th4) {
            w.e().d(v0.f197186a, "Could not instantiate " + str, th4);
            throw th4;
        }
    }

    private static final Class<? extends androidx.work.c> d(String str) {
        try {
            return Class.forName(str).asSubclass(androidx.work.c.class);
        } catch (Throwable th4) {
            w.e().d(v0.f197186a, "Invalid class: " + str, th4);
            throw th4;
        }
    }

    public abstract androidx.work.c a(Context appContext, String workerClassName, WorkerParameters workerParameters);

    public final androidx.work.c b(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        androidx.work.c cVarA = a(appContext, workerClassName, workerParameters);
        if (cVarA == null) {
            cVarA = c(appContext, workerClassName, workerParameters);
        }
        if (!cVarA.f()) {
            return cVarA;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + workerClassName + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
