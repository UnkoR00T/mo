package io.sentry.android.core;

import io.sentry.e3;
import io.sentry.g3;
import io.sentry.i7;
import io.sentry.n5;
import java.util.Comparator;
import java.util.Date;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class e2 implements io.sentry.y0, io.sentry.android.core.internal.util.a0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f93794h = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final i7 f93795i = new i7(new Date(0), 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f93796a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.android.core.internal.util.a0 f93798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile String f93799d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final io.sentry.util.a f93797b = new io.sentry.util.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SortedSet<io.sentry.j1> f93800e = new TreeSet(new Comparator() { // from class: io.sentry.android.core.d2
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return e2.f((io.sentry.j1) obj, (io.sentry.j1) obj2);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ConcurrentSkipListSet<a> f93801f = new ConcurrentSkipListSet<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f93802g = 16666666;

    private static class a implements Comparable<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f93803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f93804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f93805c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f93806d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f93807e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f93808f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f93809g;

        a(long j15) {
            this(j15, j15, 0L, 0L, false, false, 0L);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Long.compare(this.f93804b, aVar.f93804b);
        }

        a(long j15, long j16, long j17, long j18, boolean z15, boolean z16, long j19) {
            this.f93803a = j15;
            this.f93804b = j16;
            this.f93805c = j17;
            this.f93806d = j18;
            this.f93807e = z15;
            this.f93808f = z16;
            this.f93809g = j19;
        }
    }

    public e2(SentryAndroidOptions sentryAndroidOptions, io.sentry.android.core.internal.util.a0 a0Var) {
        this.f93798c = a0Var;
        this.f93796a = sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking();
    }

    public static /* synthetic */ int f(io.sentry.j1 j1Var, io.sentry.j1 j1Var2) {
        if (j1Var == j1Var2) {
            return 0;
        }
        int iCompareTo = j1Var.A().compareTo(j1Var2.A());
        return iCompareTo != 0 ? iCompareTo : j1Var.w().k().toString().compareTo(j1Var2.w().k().toString());
    }

    private static int g(b2 b2Var, long j15, long j16, long j17) {
        long jMax = Math.max(0L, j16 - j17);
        if (!io.sentry.android.core.internal.util.a0.j(jMax, j15)) {
            return 0;
        }
        b2Var.a(jMax, Math.max(0L, jMax - j15), true, io.sentry.android.core.internal.util.a0.i(jMax));
        return 1;
    }

    private void h(io.sentry.j1 j1Var) {
        io.sentry.g1 g1VarA = this.f93797b.a();
        try {
            if (!this.f93800e.remove(j1Var)) {
                if (g1VarA != null) {
                    g1VarA.close();
                    return;
                }
                return;
            }
            n5 n5VarX = j1Var.x();
            if (n5VarX == null) {
                if (g1VarA != null) {
                    g1VarA.close();
                    return;
                }
                return;
            }
            long j15 = j(j1Var.A());
            long j16 = j(n5VarX);
            long j17 = j16 - j15;
            long j18 = 0;
            if (j17 <= 0) {
                if (g1VarA != null) {
                    g1VarA.close();
                    return;
                }
                return;
            }
            b2 b2Var = new b2();
            long j19 = this.f93802g;
            if (!this.f93801f.isEmpty()) {
                for (a aVar : this.f93801f.tailSet(new a(j15))) {
                    if (aVar.f93803a > j16) {
                        break;
                    }
                    if (aVar.f93803a >= j15 && aVar.f93804b <= j16) {
                        b2Var.a(aVar.f93805c, aVar.f93806d, aVar.f93807e, aVar.f93808f);
                    } else if ((j15 > aVar.f93803a && j15 < aVar.f93804b) || (j16 > aVar.f93803a && j16 < aVar.f93804b)) {
                        long jMin = Math.min(aVar.f93806d - Math.max(j18, Math.max(j18, j15 - aVar.f93803a) - aVar.f93809g), j17);
                        long jMin2 = Math.min(j16, aVar.f93804b) - Math.max(j15, aVar.f93803a);
                        b2Var.a(jMin2, jMin, io.sentry.android.core.internal.util.a0.j(jMin2, aVar.f93809g), io.sentry.android.core.internal.util.a0.i(jMin2));
                    }
                    j19 = aVar.f93809g;
                    j18 = 0;
                }
            }
            long j25 = j19;
            int iF = b2Var.f();
            long jH = this.f93798c.h();
            if (jH != -1) {
                iF = iF + g(b2Var, j25, j16, jH) + i(b2Var, j25, j17);
            }
            double dE = (b2Var.e() + b2Var.c()) / 1.0E9d;
            j1Var.m("frames.total", Integer.valueOf(iF));
            j1Var.m("frames.slow", Integer.valueOf(b2Var.d()));
            j1Var.m("frames.frozen", Integer.valueOf(b2Var.b()));
            j1Var.m("frames.delay", Double.valueOf(dE));
            if (j1Var instanceof io.sentry.l1) {
                j1Var.k("frames_total", Integer.valueOf(iF));
                j1Var.k("frames_slow", Integer.valueOf(b2Var.d()));
                j1Var.k("frames_frozen", Integer.valueOf(b2Var.b()));
                j1Var.k("frames_delay", Double.valueOf(dE));
            }
            if (g1VarA != null) {
                g1VarA.close();
            }
        } catch (Throwable th4) {
            if (g1VarA == null) {
                throw th4;
            }
            try {
                g1VarA.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    private static int i(b2 b2Var, long j15, long j16) {
        long jG = j16 - b2Var.g();
        if (jG > 0) {
            return (int) Math.ceil(jG / j15);
        }
        return 0;
    }

    private static long j(n5 n5Var) {
        if (n5Var instanceof i7) {
            return n5Var.e(f93795i);
        }
        return System.nanoTime() - (io.sentry.m.i(System.currentTimeMillis()) - n5Var.l());
    }

    @Override // io.sentry.y0
    public void a(io.sentry.j1 j1Var) {
        if (!this.f93796a || (j1Var instanceof e3) || (j1Var instanceof g3)) {
            return;
        }
        io.sentry.g1 g1VarA = this.f93797b.a();
        try {
            if (!this.f93800e.contains(j1Var)) {
                if (g1VarA != null) {
                    g1VarA.close();
                    return;
                }
                return;
            }
            if (g1VarA != null) {
                g1VarA.close();
            }
            h(j1Var);
            io.sentry.g1 g1VarA2 = this.f93797b.a();
            try {
                if (this.f93800e.isEmpty()) {
                    clear();
                } else {
                    this.f93801f.headSet(new a(j(this.f93800e.first().A()))).clear();
                }
                if (g1VarA2 != null) {
                    g1VarA2.close();
                }
            } catch (Throwable th4) {
                if (g1VarA2 != null) {
                    try {
                        g1VarA2.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (Throwable th6) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    @Override // io.sentry.y0
    public void b(io.sentry.j1 j1Var) {
        if (!this.f93796a || (j1Var instanceof e3) || (j1Var instanceof g3)) {
            return;
        }
        io.sentry.g1 g1VarA = this.f93797b.a();
        try {
            this.f93800e.add(j1Var);
            if (this.f93799d == null) {
                this.f93799d = this.f93798c.l(this);
            }
            if (g1VarA != null) {
                g1VarA.close();
            }
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    @Override // io.sentry.y0
    public void clear() {
        io.sentry.g1 g1VarA = this.f93797b.a();
        try {
            if (this.f93799d != null) {
                this.f93798c.m(this.f93799d);
                this.f93799d = null;
            }
            this.f93801f.clear();
            this.f93800e.clear();
            if (g1VarA != null) {
                g1VarA.close();
            }
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    @Override // io.sentry.android.core.internal.util.a0.b
    public void e(long j15, long j16, long j17, long j18, boolean z15, boolean z16, float f15) {
        if (this.f93801f.size() > 3600) {
            return;
        }
        long j19 = (long) (f93794h / ((double) f15));
        this.f93802g = j19;
        if (z15 || z16) {
            this.f93801f.add(new a(j15, j16, j17, j18, z15, z16, j19));
        }
    }
}
