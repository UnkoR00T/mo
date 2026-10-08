package vh;

import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class o {
    public static <TResult> TResult a(l<TResult> lVar) throws InterruptedException {
        jg.s.j();
        jg.s.h();
        jg.s.m(lVar, "Task must not be null");
        if (lVar.p()) {
            return (TResult) h(lVar);
        }
        q qVar = new q(null);
        i(lVar, qVar);
        qVar.d();
        return (TResult) h(lVar);
    }

    public static <TResult> TResult b(l<TResult> lVar, long j15, TimeUnit timeUnit) throws TimeoutException {
        jg.s.j();
        jg.s.h();
        jg.s.m(lVar, "Task must not be null");
        jg.s.m(timeUnit, "TimeUnit must not be null");
        if (lVar.p()) {
            return (TResult) h(lVar);
        }
        q qVar = new q(null);
        i(lVar, qVar);
        if (qVar.e(j15, timeUnit)) {
            return (TResult) h(lVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    public static <TResult> l<TResult> c(Executor executor, Callable<TResult> callable) {
        jg.s.m(executor, "Executor must not be null");
        jg.s.m(callable, "Callback must not be null");
        o0 o0Var = new o0();
        executor.execute(new p0(o0Var, callable));
        return o0Var;
    }

    public static <TResult> l<TResult> d() {
        o0 o0Var = new o0();
        o0Var.x();
        return o0Var;
    }

    public static <TResult> l<TResult> e(Exception exc) {
        o0 o0Var = new o0();
        o0Var.v(exc);
        return o0Var;
    }

    public static <TResult> l<TResult> f(TResult tresult) {
        o0 o0Var = new o0();
        o0Var.t(tresult);
        return o0Var;
    }

    public static <T> l<T> g(l<T> lVar, long j15, TimeUnit timeUnit) {
        jg.s.m(lVar, "Task must not be null");
        jg.s.b(j15 > 0, "Timeout must be positive");
        jg.s.m(timeUnit, "TimeUnit must not be null");
        final u uVar = new u();
        final m mVar = new m(uVar);
        final ih.a aVar = new ih.a(Looper.getMainLooper());
        aVar.postDelayed(new Runnable() { // from class: vh.t
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                mVar.d(new TimeoutException());
            }
        }, timeUnit.toMillis(j15));
        lVar.c(new f() { // from class: vh.s
            @Override // vh.f
            public final /* synthetic */ void a(l lVar2) {
                aVar.removeCallbacksAndMessages(null);
                m mVar2 = mVar;
                if (lVar2.q()) {
                    mVar2.e(lVar2.m());
                } else {
                    if (lVar2.o()) {
                        uVar.c();
                        return;
                    }
                    Exception excL = lVar2.l();
                    Objects.requireNonNull(excL);
                    mVar2.d(excL);
                }
            }
        });
        return mVar.a();
    }

    private static Object h(l lVar) throws ExecutionException {
        if (lVar.q()) {
            return lVar.m();
        }
        if (lVar.o()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(lVar.l());
    }

    private static void i(l lVar, r rVar) {
        Executor executor = n.f206829b;
        lVar.f(executor, rVar);
        lVar.d(executor, rVar);
        lVar.a(executor, rVar);
    }
}
