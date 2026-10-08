package h8;

import android.util.Pair;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends l1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f81866m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final t7.e0.c f81867n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final t7.e0.b f81868o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a f81869p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private y f81870q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f81871r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f81872s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f81873t;

    private static final class a extends v {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Object f81874h = new Object();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Object f81875f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Object f81876g;

        private a(t7.e0 e0Var, Object obj, Object obj2) {
            super(e0Var);
            this.f81875f = obj;
            this.f81876g = obj2;
        }

        public static a u(t7.s sVar) {
            return new a(new b(sVar), t7.e0.c.f188143q, f81874h);
        }

        public static a v(t7.e0 e0Var, Object obj, Object obj2) {
            return new a(e0Var, obj, obj2);
        }

        @Override // h8.v, t7.e0
        public int b(Object obj) {
            Object obj2;
            t7.e0 e0Var = this.f81800e;
            if (f81874h.equals(obj) && (obj2 = this.f81876g) != null) {
                obj = obj2;
            }
            return e0Var.b(obj);
        }

        @Override // h8.v, t7.e0
        public t7.e0.b g(int i15, t7.e0.b bVar, boolean z15) {
            this.f81800e.g(i15, bVar, z15);
            if (Objects.equals(bVar.f188137b, this.f81876g) && z15) {
                bVar.f188137b = f81874h;
            }
            return bVar;
        }

        @Override // h8.v, t7.e0
        public Object m(int i15) {
            Object objM = this.f81800e.m(i15);
            return Objects.equals(objM, this.f81876g) ? f81874h : objM;
        }

        @Override // h8.v, t7.e0
        public t7.e0.c o(int i15, t7.e0.c cVar, long j15) {
            this.f81800e.o(i15, cVar, j15);
            if (Objects.equals(cVar.f188153a, this.f81875f)) {
                cVar.f188153a = t7.e0.c.f188143q;
            }
            return cVar;
        }

        public a t(t7.e0 e0Var) {
            return new a(e0Var, this.f81875f, this.f81876g);
        }
    }

    public static final class b extends t7.e0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final t7.s f81877e;

        public b(t7.s sVar) {
            this.f81877e = sVar;
        }

        @Override // t7.e0
        public int b(Object obj) {
            return obj == a.f81874h ? 0 : -1;
        }

        @Override // t7.e0
        public t7.e0.b g(int i15, t7.e0.b bVar, boolean z15) {
            bVar.u(z15 ? 0 : null, z15 ? a.f81874h : null, 0, -9223372036854775807L, 0L, t7.a.f188028g, true);
            return bVar;
        }

        @Override // t7.e0
        public int i() {
            return 1;
        }

        @Override // t7.e0
        public Object m(int i15) {
            return a.f81874h;
        }

        @Override // t7.e0
        public t7.e0.c o(int i15, t7.e0.c cVar, long j15) {
            cVar.g(t7.e0.c.f188143q, this.f81877e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            cVar.f188163k = true;
            return cVar;
        }

        @Override // t7.e0
        public int p() {
            return 1;
        }
    }

    public z(c0 c0Var, boolean z15) {
        super(c0Var);
        this.f81866m = z15 && c0Var.k();
        this.f81867n = new t7.e0.c();
        this.f81868o = new t7.e0.b();
        t7.e0 e0VarM = c0Var.m();
        if (e0VarM == null) {
            this.f81869p = a.u(c0Var.b());
        } else {
            this.f81869p = a.v(e0VarM, null, null);
            this.f81873t = true;
        }
    }

    private Object S(Object obj) {
        return (this.f81869p.f81876g == null || !this.f81869p.f81876g.equals(obj)) ? obj : a.f81874h;
    }

    private Object T(Object obj) {
        return (this.f81869p.f81876g == null || !obj.equals(a.f81874h)) ? obj : this.f81869p.f81876g;
    }

    private boolean V(long j15) {
        y yVar = this.f81870q;
        int iB = this.f81869p.b(yVar.f81826a.f81468a);
        if (iB == -1) {
            return false;
        }
        long j16 = this.f81869p.f(iB, this.f81868o).f188139d;
        if (j16 != -9223372036854775807L && j15 >= j16) {
            j15 = Math.max(0L, j16 - 1);
        }
        yVar.s(j15);
        return true;
    }

    @Override // h8.g, h8.a
    public void A() {
        this.f81872s = false;
        this.f81871r = false;
        super.A();
    }

    @Override // h8.l1
    protected c0.b H(c0.b bVar) {
        return bVar.a(S(bVar.f81468a));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // h8.l1
    protected void O(t7.e0 e0Var) {
        long j15;
        c0.b bVarA;
        if (this.f81872s) {
            this.f81869p = this.f81869p.t(e0Var);
            y yVar = this.f81870q;
            if (yVar != null) {
                V(yVar.l());
            }
        } else {
            if (!e0Var.q()) {
                e0Var.n(0, this.f81867n);
                long jC = this.f81867n.c();
                Object obj = this.f81867n.f188153a;
                y yVar2 = this.f81870q;
                if (yVar2 != null) {
                    long jM = yVar2.m();
                    this.f81869p.h(this.f81870q.f81826a.f81468a, this.f81868o);
                    long jO = this.f81868o.o() + jM;
                    if (jO != this.f81869p.n(0, this.f81867n).c()) {
                        j15 = jO;
                    } else {
                        j15 = jC;
                    }
                } else {
                    j15 = jC;
                }
                Pair<Object, Long> pairJ = e0Var.j(this.f81867n, this.f81868o, 0, j15);
                Object obj2 = pairJ.first;
                long jLongValue = ((Long) pairJ.second).longValue();
                this.f81869p = this.f81873t ? this.f81869p.t(e0Var) : a.v(e0Var, obj, obj2);
                y yVar3 = this.f81870q;
                if (yVar3 != null && V(jLongValue)) {
                    c0.b bVar = yVar3.f81826a;
                    bVarA = bVar.a(T(bVar.f81468a));
                }
                this.f81873t = true;
                this.f81872s = true;
                z(this.f81869p);
                if (bVarA != null) {
                    ((y) zj.p.q(this.f81870q)).j(bVarA);
                }
            }
            this.f81869p = this.f81873t ? this.f81869p.t(e0Var) : a.v(e0Var, t7.e0.c.f188143q, a.f81874h);
        }
        bVarA = null;
        this.f81873t = true;
        this.f81872s = true;
        z(this.f81869p);
        if (bVarA != null) {
            ((y) zj.p.q(this.f81870q)).j(bVarA);
        }
    }

    @Override // h8.l1
    public void Q() {
        if (this.f81866m) {
            return;
        }
        this.f81871r = true;
        P();
    }

    @Override // h8.c0
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public y e(c0.b bVar, k8.b bVar2, long j15) {
        y yVar = new y(bVar, bVar2, j15);
        yVar.x(this.f81627k);
        if (this.f81872s) {
            yVar.j(bVar.a(T(bVar.f81468a)));
            return yVar;
        }
        this.f81870q = yVar;
        if (!this.f81871r) {
            this.f81871r = true;
            P();
        }
        return yVar;
    }

    public t7.e0 U() {
        return this.f81869p;
    }

    @Override // h8.l1, h8.c0
    public void c(t7.s sVar) {
        if (this.f81873t) {
            a aVar = this.f81869p;
            this.f81869p = aVar.t(h1.s(aVar.f81800e, sVar));
        } else {
            this.f81869p = a.u(sVar);
        }
        this.f81627k.c(sVar);
    }

    @Override // h8.c0
    public void p(b0 b0Var) {
        ((y) b0Var).v();
        if (b0Var == this.f81870q) {
            this.f81870q = null;
        }
    }
}
