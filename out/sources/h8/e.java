package h8;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends l1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f81524m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f81525n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f81526o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f81527p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f81528q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f81529r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f81530s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ArrayList<h8.d> f81531t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final t7.e0.c f81532u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private c f81533v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private d f81534w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f81535x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f81536y;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c0 f81537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f81538b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f81541e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f81542f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f81543g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f81544h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f81545i;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f81540d = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f81539c = Long.MIN_VALUE;

        public b(c0 c0Var) {
            this.f81537a = (c0) zj.p.q(c0Var);
        }

        public e i() {
            this.f81545i = true;
            return new e(this);
        }

        public b j(boolean z15) {
            zj.p.w(!this.f81545i);
            this.f81541e = z15;
            return this;
        }

        public b k(boolean z15) {
            zj.p.w(!this.f81545i);
            this.f81543g = z15;
            return this;
        }

        public b l(boolean z15) {
            zj.p.w(!this.f81545i);
            this.f81544h = z15;
            return this;
        }

        public b m(boolean z15) {
            zj.p.w(!this.f81545i);
            this.f81540d = z15;
            return this;
        }

        public b n(long j15) {
            zj.p.w(!this.f81545i);
            this.f81539c = j15;
            return this;
        }

        public b o(boolean z15) {
            zj.p.w(!this.f81545i);
            this.f81542f = z15;
            return this;
        }

        public b p(long j15) {
            zj.p.d(j15 >= 0);
            zj.p.w(!this.f81545i);
            this.f81538b = j15;
            return this;
        }
    }

    private static final class c extends v {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f81546f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f81547g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f81548h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f81549i;

        public c(t7.e0 e0Var, long j15, long j16, boolean z15) throws d {
            super(e0Var);
            if (j16 != Long.MIN_VALUE && j16 < j15) {
                throw new d(2, j15, j16);
            }
            boolean z16 = false;
            if (e0Var.i() != 1) {
                throw new d(0);
            }
            t7.e0.c cVarN = e0Var.n(0, new t7.e0.c());
            long jMax = Math.max(0L, j15);
            if (!z15 && !cVarN.f188163k && jMax != 0 && !cVarN.f188160h) {
                throw new d(1);
            }
            long jMax2 = j16 == Long.MIN_VALUE ? cVarN.f188165m : Math.max(0L, j16);
            long j17 = cVarN.f188165m;
            if (j17 != -9223372036854775807L) {
                jMax2 = jMax2 > j17 ? j17 : jMax2;
                if (jMax > jMax2) {
                    jMax = jMax2;
                }
            }
            this.f81546f = jMax;
            this.f81547g = jMax2;
            this.f81548h = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
            if (cVarN.f188161i && (jMax2 == -9223372036854775807L || (j17 != -9223372036854775807L && jMax2 == j17))) {
                z16 = true;
            }
            this.f81549i = z16;
        }

        @Override // h8.v, t7.e0
        public t7.e0.b g(int i15, t7.e0.b bVar, boolean z15) {
            this.f81800e.g(0, bVar, z15);
            long jO = bVar.o() - this.f81546f;
            long j15 = this.f81548h;
            return bVar.t(bVar.f188136a, bVar.f188137b, 0, j15 != -9223372036854775807L ? j15 - jO : -9223372036854775807L, jO);
        }

        @Override // h8.v, t7.e0
        public t7.e0.c o(int i15, t7.e0.c cVar, long j15) {
            this.f81800e.o(0, cVar, 0L);
            long j16 = cVar.f188168p;
            long j17 = this.f81546f;
            cVar.f188168p = j16 + j17;
            cVar.f188165m = this.f81548h;
            cVar.f188161i = this.f81549i;
            long j18 = cVar.f188164l;
            if (j18 != -9223372036854775807L) {
                long jMax = Math.max(j18, j17);
                cVar.f188164l = jMax;
                long j19 = this.f81547g;
                if (j19 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j19);
                }
                cVar.f188164l = jMax - this.f81546f;
            }
            long jG1 = w7.o0.g1(this.f81546f);
            long j25 = cVar.f188157e;
            if (j25 != -9223372036854775807L) {
                cVar.f188157e = j25 + jG1;
            }
            long j26 = cVar.f188158f;
            if (j26 != -9223372036854775807L) {
                cVar.f188158f = j26 + jG1;
            }
            return cVar;
        }
    }

    public static final class d extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f81550a;

        public d(int i15) {
            this(i15, -9223372036854775807L, -9223372036854775807L);
        }

        private static String a(int i15, long j15, long j16) {
            if (i15 == 0) {
                return "invalid period count";
            }
            if (i15 == 1) {
                return "not seekable to start";
            }
            if (i15 != 2) {
                return "unknown";
            }
            zj.p.w((j15 == -9223372036854775807L || j16 == -9223372036854775807L) ? false : true);
            return "start exceeds end. Start time: " + j15 + ", End time: " + j16;
        }

        public d(int i15, long j15, long j16) {
            super("Illegal clipping: " + a(i15, j15, j16));
            this.f81550a = i15;
        }
    }

    private void R(t7.e0 e0Var) {
        long j15;
        e0Var.n(0, this.f81532u);
        long jE = this.f81532u.e();
        long j16 = Long.MIN_VALUE;
        if (this.f81533v == null || this.f81531t.isEmpty() || this.f81527p) {
            j15 = this.f81524m;
            long j17 = this.f81525n;
            if (this.f81528q) {
                long jC = this.f81532u.c();
                j15 += jC;
                j17 += jC;
            }
            this.f81535x = jE + j15;
            this.f81536y = this.f81525n != Long.MIN_VALUE ? jE + j17 : Long.MIN_VALUE;
            int size = this.f81531t.size();
            for (int i15 = 0; i15 < size; i15++) {
                this.f81531t.get(i15).A(this.f81535x, this.f81536y);
            }
            j16 = j17;
        } else {
            j15 = this.f81535x - jE;
            if (this.f81525n != Long.MIN_VALUE) {
                j16 = this.f81536y - jE;
            }
        }
        try {
            c cVar = new c(e0Var, j15, j16, this.f81529r);
            this.f81533v = cVar;
            z(cVar);
        } catch (d e15) {
            this.f81534w = e15;
            for (int i16 = 0; i16 < this.f81531t.size(); i16++) {
                this.f81531t.get(i16).y(this.f81534w);
            }
        }
    }

    @Override // h8.g, h8.a
    protected void A() {
        super.A();
        this.f81534w = null;
        this.f81533v = null;
    }

    @Override // h8.l1
    protected void O(t7.e0 e0Var) {
        if (this.f81534w != null) {
            return;
        }
        R(e0Var);
    }

    @Override // h8.c0
    public b0 e(c0.b bVar, k8.b bVar2, long j15) {
        h8.d dVar = new h8.d(this.f81627k.e(bVar, bVar2, j15), this.f81526o, this.f81535x, this.f81536y, this.f81530s);
        this.f81531t.add(dVar);
        return dVar;
    }

    @Override // h8.g, h8.c0
    public void j() throws d {
        d dVar = this.f81534w;
        if (dVar != null) {
            throw dVar;
        }
        super.j();
    }

    @Override // h8.c0
    public void p(b0 b0Var) {
        zj.p.w(this.f81531t.remove(b0Var));
        this.f81627k.p(((h8.d) b0Var).f81488a);
        if (!this.f81531t.isEmpty() || this.f81527p) {
            return;
        }
        R(((c) zj.p.q(this.f81533v)).f81800e);
    }

    private e(b bVar) {
        super(bVar.f81537a);
        this.f81524m = bVar.f81538b;
        this.f81525n = bVar.f81539c;
        this.f81526o = bVar.f81540d;
        this.f81527p = bVar.f81541e;
        this.f81528q = bVar.f81542f;
        this.f81529r = bVar.f81543g;
        this.f81530s = bVar.f81544h;
        this.f81531t = new ArrayList<>();
        this.f81532u = new t7.e0.c();
    }
}
