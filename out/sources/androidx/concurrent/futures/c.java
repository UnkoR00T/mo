package androidx.concurrent.futures;

import com.google.common.util.concurrent.q;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f11190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d<T> f11191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f<Void> f11192c = f.B();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f11193d;

        a() {
        }

        private void e() {
            this.f11190a = null;
            this.f11191b = null;
            this.f11192c = null;
        }

        public void a(Runnable runnable, Executor executor) {
            f<Void> fVar = this.f11192c;
            if (fVar != null) {
                fVar.b(runnable, executor);
            }
        }

        void b() {
            this.f11190a = null;
            this.f11191b = null;
            this.f11192c.x(null);
        }

        public boolean c(T t15) {
            this.f11193d = true;
            d<T> dVar = this.f11191b;
            boolean z15 = dVar != null && dVar.c(t15);
            if (z15) {
                e();
            }
            return z15;
        }

        public boolean d() {
            this.f11193d = true;
            d<T> dVar = this.f11191b;
            boolean z15 = dVar != null && dVar.a(true);
            if (z15) {
                e();
            }
            return z15;
        }

        public boolean f(Throwable th4) {
            this.f11193d = true;
            d<T> dVar = this.f11191b;
            boolean z15 = dVar != null && dVar.d(th4);
            if (z15) {
                e();
            }
            return z15;
        }

        protected void finalize() {
            f<Void> fVar;
            d<T> dVar = this.f11191b;
            if (dVar != null && !dVar.isDone()) {
                dVar.d(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f11190a));
            }
            if (this.f11193d || (fVar = this.f11192c) == null) {
                return;
            }
            fVar.x(null);
        }
    }

    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.c$c, reason: collision with other inner class name */
    public interface InterfaceC0250c<T> {
        Object a(a<T> aVar);
    }

    private static final class d<T> implements q<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final WeakReference<a<T>> f11194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.concurrent.futures.a<T> f11195b = new a();

        class a extends androidx.concurrent.futures.a<T> {
            a() {
            }

            @Override // androidx.concurrent.futures.a
            protected String t() {
                a<T> aVar = d.this.f11194a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f11190a + "]";
            }
        }

        d(a<T> aVar) {
            this.f11194a = new WeakReference<>(aVar);
        }

        boolean a(boolean z15) {
            return this.f11195b.cancel(z15);
        }

        @Override // com.google.common.util.concurrent.q
        public void b(Runnable runnable, Executor executor) {
            this.f11195b.b(runnable, executor);
        }

        boolean c(T t15) {
            return this.f11195b.x(t15);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z15) {
            a<T> aVar = this.f11194a.get();
            boolean zCancel = this.f11195b.cancel(z15);
            if (zCancel && aVar != null) {
                aVar.b();
            }
            return zCancel;
        }

        boolean d(Throwable th4) {
            return this.f11195b.y(th4);
        }

        @Override // java.util.concurrent.Future
        public T get() {
            return this.f11195b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f11195b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f11195b.isDone();
        }

        public String toString() {
            return this.f11195b.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j15, TimeUnit timeUnit) {
            return this.f11195b.get(j15, timeUnit);
        }
    }

    public static <T> q<T> a(InterfaceC0250c<T> interfaceC0250c) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.f11191b = dVar;
        aVar.f11190a = interfaceC0250c.getClass();
        try {
            Object objA = interfaceC0250c.a(aVar);
            if (objA == null) {
                return dVar;
            }
            aVar.f11190a = objA;
            return dVar;
        } catch (Exception e15) {
            dVar.d(e15);
            return dVar;
        }
    }
}
