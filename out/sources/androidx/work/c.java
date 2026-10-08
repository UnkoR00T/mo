package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.q;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import ub.k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f13826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WorkerParameters f13827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicInteger f13828c = new AtomicInteger(-256);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f13829d;

    public static abstract class a {

        /* JADX INFO: renamed from: androidx.work.c$a$a, reason: collision with other inner class name */
        public static final class C0295a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final androidx.work.b f13830a;

            public C0295a() {
                this(androidx.work.b.f13823c);
            }

            public androidx.work.b c() {
                return this.f13830a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0295a.class != obj.getClass()) {
                    return false;
                }
                return this.f13830a.equals(((C0295a) obj).f13830a);
            }

            public int hashCode() {
                return (C0295a.class.getName().hashCode() * 31) + this.f13830a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f13830a + '}';
            }

            public C0295a(androidx.work.b bVar) {
                this.f13830a = bVar;
            }
        }

        public static final class b extends a {
        }

        /* JADX INFO: renamed from: androidx.work.c$a$c, reason: collision with other inner class name */
        public static final class C0296c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final androidx.work.b f13831a;

            public C0296c() {
                this(androidx.work.b.f13823c);
            }

            public androidx.work.b c() {
                return this.f13831a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0296c.class != obj.getClass()) {
                    return false;
                }
                return this.f13831a.equals(((C0296c) obj).f13831a);
            }

            public int hashCode() {
                return (C0296c.class.getName().hashCode() * 31) + this.f13831a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f13831a + '}';
            }

            public C0296c(androidx.work.b bVar) {
                this.f13831a = bVar;
            }
        }

        a() {
        }

        public static a a() {
            return new C0295a();
        }

        public static a b() {
            return new C0296c();
        }
    }

    public c(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f13826a = context;
        this.f13827b = workerParameters;
    }

    public static /* synthetic */ Object a(androidx.concurrent.futures.c.a aVar) {
        aVar.f(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
        return "default failing getForegroundInfoAsync";
    }

    public final Context b() {
        return this.f13826a;
    }

    public Executor c() {
        return this.f13827b.a();
    }

    public q<k> d() {
        return androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: ub.v
            @Override // androidx.concurrent.futures.c.InterfaceC0250c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return androidx.work.c.a(aVar);
            }
        });
    }

    public final UUID e() {
        return this.f13827b.c();
    }

    public final boolean f() {
        return this.f13829d;
    }

    public void g() {
    }

    public final void h() {
        this.f13829d = true;
    }

    public abstract q<a> i();

    public final void j(int i15) {
        if (this.f13828c.compareAndSet(-256, i15)) {
            g();
        }
    }
}
