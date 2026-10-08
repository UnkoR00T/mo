package pm;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f160822b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static g f160823c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f160824a;

    private g(Looper looper) {
        this.f160824a = new bh.a(looper);
    }

    public static g a() {
        g gVar;
        synchronized (f160822b) {
            try {
                if (f160823c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f160823c = new g(handlerThread.getLooper());
                }
                gVar = f160823c;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return gVar;
    }

    public static Executor d() {
        return u.f160886a;
    }

    public <ResultT> vh.l<ResultT> b(final Callable<ResultT> callable) {
        final vh.m mVar = new vh.m();
        c(new Runnable() { // from class: pm.t
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                vh.m mVar2 = mVar;
                try {
                    mVar2.c(callable2.call());
                } catch (lm.a e15) {
                    mVar2.b(e15);
                } catch (Exception e16) {
                    mVar2.b(new lm.a("Internal error has occurred when executing ML Kit tasks", 13, e16));
                }
            }
        });
        return mVar.a();
    }

    public void c(Runnable runnable) {
        d().execute(runnable);
    }
}
