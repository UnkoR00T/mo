package v;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class u1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Size f202859k = new Size(0, 0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final boolean f202860l = o.e1.f("DeferrableSurface");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final AtomicInteger f202861m = new AtomicInteger(0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final AtomicInteger f202862n = new AtomicInteger(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f202863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f202864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f202865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.concurrent.futures.c.a<Void> f202866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.common.util.concurrent.q<Void> f202867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.concurrent.futures.c.a<Void> f202868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.common.util.concurrent.q<Void> f202869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Size f202870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f202871i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Class<?> f202872j;

    public static final class a extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        u1 f202873a;

        public a(String str, u1 u1Var) {
            super(str);
            this.f202873a = u1Var;
        }

        public u1 a() {
            return this.f202873a;
        }
    }

    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public u1() {
        this(f202859k, 0);
    }

    public static /* synthetic */ Object a(u1 u1Var, androidx.concurrent.futures.c.a aVar) {
        synchronized (u1Var.f202863a) {
            u1Var.f202866d = aVar;
        }
        return "DeferrableSurface-termination(" + u1Var + ")";
    }

    public static /* synthetic */ Object b(u1 u1Var, androidx.concurrent.futures.c.a aVar) {
        synchronized (u1Var.f202863a) {
            u1Var.f202868f = aVar;
        }
        return "DeferrableSurface-close(" + u1Var + ")";
    }

    public static /* synthetic */ void c(u1 u1Var, String str) {
        u1Var.getClass();
        try {
            u1Var.f202867e.get();
            u1Var.n("Surface terminated", f202862n.decrementAndGet(), f202861m.get());
        } catch (Exception e15) {
            o.e1.c("DeferrableSurface", "Unexpected surface termination for " + u1Var + "\nStack Trace:\n" + str);
            synchronized (u1Var.f202863a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", u1Var, Boolean.valueOf(u1Var.f202865c), Integer.valueOf(u1Var.f202864b)), e15);
            }
        }
    }

    private void n(String str, int i15, int i16) {
        if (!f202860l && o.e1.f("DeferrableSurface")) {
            o.e1.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        o.e1.a("DeferrableSurface", str + "[total_surfaces=" + i15 + ", used_surfaces=" + i16 + "](" + this + "}");
    }

    public void d() {
        androidx.concurrent.futures.c.a<Void> aVar;
        synchronized (this.f202863a) {
            try {
                if (this.f202865c) {
                    aVar = null;
                } else {
                    this.f202865c = true;
                    this.f202868f.c(null);
                    if (this.f202864b == 0) {
                        aVar = this.f202866d;
                        this.f202866d = null;
                    } else {
                        aVar = null;
                    }
                    if (o.e1.f("DeferrableSurface")) {
                        o.e1.a("DeferrableSurface", "surface closed,  useCount=" + this.f202864b + " closed=true " + this);
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public void e() {
        androidx.concurrent.futures.c.a<Void> aVar;
        synchronized (this.f202863a) {
            try {
                int i15 = this.f202864b;
                if (i15 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i16 = i15 - 1;
                this.f202864b = i16;
                if (i16 == 0 && this.f202865c) {
                    aVar = this.f202866d;
                    this.f202866d = null;
                } else {
                    aVar = null;
                }
                if (o.e1.f("DeferrableSurface")) {
                    o.e1.a("DeferrableSurface", "use count-1,  useCount=" + this.f202864b + " closed=" + this.f202865c + " " + this);
                    if (this.f202864b == 0) {
                        n("Surface no longer in use", f202862n.get(), f202861m.decrementAndGet());
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public com.google.common.util.concurrent.q<Void> f() {
        return a0.f.i(this.f202869g);
    }

    public Class<?> g() {
        return this.f202872j;
    }

    public Size h() {
        return this.f202870h;
    }

    public int i() {
        return this.f202871i;
    }

    public final com.google.common.util.concurrent.q<Surface> j() {
        synchronized (this.f202863a) {
            try {
                if (this.f202865c) {
                    return a0.f.f(new a("DeferrableSurface already closed.", this));
                }
                return o();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public com.google.common.util.concurrent.q<Void> k() {
        return a0.f.i(this.f202867e);
    }

    public void l() {
        synchronized (this.f202863a) {
            try {
                int i15 = this.f202864b;
                if (i15 == 0 && this.f202865c) {
                    throw new a("Cannot begin use on a closed surface.", this);
                }
                this.f202864b = i15 + 1;
                if (o.e1.f("DeferrableSurface")) {
                    if (this.f202864b == 1) {
                        n("New surface in use", f202862n.get(), f202861m.incrementAndGet());
                    }
                    o.e1.a("DeferrableSurface", "use count+1, useCount=" + this.f202864b + " " + this);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public boolean m() {
        boolean z15;
        synchronized (this.f202863a) {
            z15 = this.f202865c;
        }
        return z15;
    }

    protected abstract com.google.common.util.concurrent.q<Surface> o();

    public void p(Class<?> cls) {
        this.f202872j = cls;
    }

    public u1(Size size, int i15) {
        this.f202863a = new Object();
        this.f202864b = 0;
        this.f202865c = false;
        this.f202870h = size;
        this.f202871i = i15;
        com.google.common.util.concurrent.q<Void> qVarA = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: v.r1
            @Override // androidx.concurrent.futures.c.InterfaceC0250c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return u1.a(this.f202833a, aVar);
            }
        });
        this.f202867e = qVarA;
        this.f202869g = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: v.s1
            @Override // androidx.concurrent.futures.c.InterfaceC0250c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return u1.b(this.f202842a, aVar);
            }
        });
        if (o.e1.f("DeferrableSurface")) {
            n("Surface created", f202862n.incrementAndGet(), f202861m.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            qVarA.b(new Runnable() { // from class: v.t1
                @Override // java.lang.Runnable
                public final void run() {
                    u1.c(this.f202850a, stackTraceString);
                }
            }, z.a.a());
        }
    }
}
