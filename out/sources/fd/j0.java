package fd;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes3.dex */
public class j0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Executor f61280e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<e0<T>> f61281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<e0<Throwable>> f61282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f61283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile h0<T> f61284d;

    private static class a<T> extends FutureTask<h0<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private j0<T> f61285a;

        a(j0<T> j0Var, Callable<h0<T>> callable) {
            super(callable);
            this.f61285a = j0Var;
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.f61285a.i(get());
                } catch (InterruptedException | ExecutionException e15) {
                    this.f61285a.i(new h0(e15));
                }
            } finally {
                this.f61285a = null;
            }
        }
    }

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            f61280e = new ma.b();
        } else {
            f61280e = Executors.newCachedThreadPool(new td.f());
        }
    }

    public j0(Callable<h0<T>> callable) {
        this(callable, false);
    }

    private synchronized void e(Throwable th4) {
        ArrayList arrayList = new ArrayList(this.f61282b);
        if (arrayList.isEmpty()) {
            td.e.d("Lottie encountered an error but no failure listener was added:", th4);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((e0) it.next()).onResult(th4);
        }
    }

    private void f() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            g();
        } else {
            this.f61283c.post(new Runnable() { // from class: fd.i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f61277a.g();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        h0<T> h0Var = this.f61284d;
        if (h0Var == null) {
            return;
        }
        if (h0Var.b() != null) {
            h(h0Var.b());
        } else {
            e(h0Var.a());
        }
    }

    private synchronized void h(T t15) {
        Iterator it = new ArrayList(this.f61281a).iterator();
        while (it.hasNext()) {
            ((e0) it.next()).onResult(t15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(h0<T> h0Var) {
        if (this.f61284d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f61284d = h0Var;
        f();
    }

    public synchronized j0<T> c(e0<Throwable> e0Var) {
        try {
            h0<T> h0Var = this.f61284d;
            if (h0Var != null && h0Var.a() != null) {
                e0Var.onResult(h0Var.a());
            }
            this.f61282b.add(e0Var);
        } catch (Throwable th4) {
            throw th4;
        }
        return this;
    }

    public synchronized j0<T> d(e0<T> e0Var) {
        try {
            h0<T> h0Var = this.f61284d;
            if (h0Var != null && h0Var.b() != null) {
                e0Var.onResult(h0Var.b());
            }
            this.f61281a.add(e0Var);
        } catch (Throwable th4) {
            throw th4;
        }
        return this;
    }

    public j0(T t15) {
        this.f61281a = new LinkedHashSet(1);
        this.f61282b = new LinkedHashSet(1);
        this.f61283c = new Handler(Looper.getMainLooper());
        this.f61284d = null;
        i(new h0<>(t15));
    }

    j0(Callable<h0<T>> callable, boolean z15) {
        this.f61281a = new LinkedHashSet(1);
        this.f61282b = new LinkedHashSet(1);
        this.f61283c = new Handler(Looper.getMainLooper());
        this.f61284d = null;
        if (z15) {
            try {
                i(callable.call());
                return;
            } catch (Throwable th4) {
                i(new h0<>(th4));
                return;
            }
        }
        f61280e.execute(new a(this, callable));
    }
}
