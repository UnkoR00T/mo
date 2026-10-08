package v;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class r2<T> implements x2<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final androidx.p016lifecycle.b0<a<T>> f202834a = new androidx.p016lifecycle.b0<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<x2.a<? super T>, Executor> f202835b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.p016lifecycle.c0<a<T>> f202836c;

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f202837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Throwable f202838b;

        private a(T t15, Throwable th4) {
            this.f202837a = t15;
            this.f202838b = th4;
        }

        static <T> a<T> b(T t15) {
            return new a<>(t15, null);
        }

        public boolean a() {
            return this.f202838b == null;
        }

        public Throwable c() {
            return this.f202838b;
        }

        public T d() {
            if (a()) {
                return this.f202837a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        public String toString() {
            String str;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("[Result: <");
            if (a()) {
                str = "Value: " + this.f202837a;
            } else {
                str = "Error: " + this.f202838b;
            }
            sb5.append(str);
            sb5.append(">]");
            return sb5.toString();
        }
    }

    public static /* synthetic */ void d(r2 r2Var, final a aVar) {
        HashMap map;
        synchronized (r2Var.f202835b) {
            map = new HashMap(r2Var.f202835b);
        }
        for (final Map.Entry entry : map.entrySet()) {
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: v.q2
                @Override // java.lang.Runnable
                public final void run() {
                    r2.e(entry, aVar);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(Map.Entry entry, a aVar) {
        x2.a aVar2 = (x2.a) entry.getKey();
        if (aVar.a()) {
            aVar2.a(aVar.d());
        } else {
            i6.i.g(aVar.c());
            aVar2.onError(aVar.c());
        }
    }

    public static /* synthetic */ Object f(final r2 r2Var, final androidx.concurrent.futures.c.a aVar) {
        r2Var.getClass();
        z.a.d().execute(new Runnable() { // from class: v.o2
            @Override // java.lang.Runnable
            public final void run() {
                r2.j(this.f202741a, aVar);
            }
        });
        return r2Var + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    public static /* synthetic */ void g(final r2 r2Var) {
        if (r2Var.f202836c == null) {
            r2Var.f202836c = new androidx.p016lifecycle.c0() { // from class: v.p2
                @Override // androidx.p016lifecycle.c0
                public final void a(Object obj) {
                    r2.d(this.f202759a, (r2.a) obj);
                }
            };
        }
        r2Var.f202834a.j(r2Var.f202836c);
    }

    public static /* synthetic */ void h(r2 r2Var) {
        androidx.p016lifecycle.c0<a<T>> c0Var = r2Var.f202836c;
        if (c0Var != null) {
            r2Var.f202834a.n(c0Var);
        }
    }

    public static /* synthetic */ void i(r2 r2Var, x2.a aVar) {
        a<T> aVarF = r2Var.f202834a.f();
        if (aVarF == null) {
            return;
        }
        if (aVarF.a()) {
            aVar.a(aVarF.d());
        } else {
            i6.i.g(aVarF.c());
            aVar.onError(aVarF.c());
        }
    }

    public static /* synthetic */ void j(r2 r2Var, androidx.concurrent.futures.c.a aVar) {
        a<T> aVarF = r2Var.f202834a.f();
        if (aVarF == null) {
            aVar.f(new IllegalStateException("Observable has not yet been initialized with a value."));
        } else if (aVarF.a()) {
            aVar.c(aVarF.d());
        } else {
            i6.i.g(aVarF.c());
            aVar.f(aVarF.c());
        }
    }

    private void k() {
        z.a.d().execute(new Runnable() { // from class: v.m2
            @Override // java.lang.Runnable
            public final void run() {
                r2.h(this.f202681a);
            }
        });
    }

    private void l() {
        z.a.d().execute(new Runnable() { // from class: v.n2
            @Override // java.lang.Runnable
            public final void run() {
                r2.g(this.f202726a);
            }
        });
    }

    @Override // v.x2
    public void a(Executor executor, final x2.a<? super T> aVar) {
        synchronized (this.f202835b) {
            try {
                boolean zIsEmpty = this.f202835b.isEmpty();
                this.f202835b.put(aVar, executor);
                if (zIsEmpty) {
                    l();
                } else {
                    executor.execute(new Runnable() { // from class: v.k2
                        @Override // java.lang.Runnable
                        public final void run() {
                            r2.i(this.f202655a, aVar);
                        }
                    });
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // v.x2
    public com.google.common.util.concurrent.q<T> b() {
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: v.l2
            @Override // androidx.concurrent.futures.c.InterfaceC0250c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return r2.f(this.f202670a, aVar);
            }
        });
    }

    @Override // v.x2
    public void c(x2.a<? super T> aVar) {
        synchronized (this.f202835b) {
            try {
                this.f202835b.remove(aVar);
                if (this.f202835b.isEmpty()) {
                    k();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public void m(T t15) {
        this.f202834a.m(a.b(t15));
    }
}
