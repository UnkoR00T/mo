package h8;

import a8.b2;
import a8.f3;
import a8.y1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class d1 implements b0, k8.l.b<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y7.j f81503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y7.f.a f81504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y7.x f81505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k8.j f81506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j0.a f81507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j1 f81508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList<b> f81509g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f81510h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final k8.l f81511j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final t7.p f81512k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final boolean f81513l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f81514m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    byte[] f81515n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f81516p;

    private final class b implements z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f81517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f81518b;

        private b() {
        }

        private void d() {
            if (this.f81518b) {
                return;
            }
            d1.this.f81507e.i(t7.w.f(d1.this.f81512k.f188381p), d1.this.f81512k, 0, null, 0L);
            this.f81518b = true;
        }

        @Override // h8.z0
        public void a() throws IOException {
            d1 d1Var = d1.this;
            if (d1Var.f81513l) {
                return;
            }
            d1Var.f81511j.j();
        }

        @Override // h8.z0
        public int b(y1 y1Var, z7.f fVar, int i15) {
            d();
            d1 d1Var = d1.this;
            boolean z15 = d1Var.f81514m;
            if (z15 && d1Var.f81515n == null) {
                this.f81517a = 2;
            }
            int i16 = this.f81517a;
            if (i16 == 2) {
                fVar.k(4);
                return -4;
            }
            if ((i15 & 2) != 0 || i16 == 0) {
                y1Var.f4794b = d1Var.f81512k;
                this.f81517a = 1;
                return -5;
            }
            if (!z15) {
                return -3;
            }
            zj.p.q(d1Var.f81515n);
            fVar.k(1);
            fVar.f233230f = 0L;
            if ((i15 & 4) == 0) {
                fVar.x(d1.this.f81516p);
                ByteBuffer byteBuffer = fVar.f233228d;
                d1 d1Var2 = d1.this;
                byteBuffer.put(d1Var2.f81515n, 0, d1Var2.f81516p);
            }
            if ((i15 & 1) == 0) {
                this.f81517a = 2;
            }
            return -4;
        }

        @Override // h8.z0
        public int c(long j15) {
            d();
            if (j15 <= 0 || this.f81517a == 2) {
                return 0;
            }
            this.f81517a = 2;
            return 1;
        }

        public void e() {
            if (this.f81517a == 2) {
                this.f81517a = 1;
            }
        }

        @Override // h8.z0
        public boolean f() {
            return d1.this.f81514m;
        }
    }

    static final class c implements k8.l.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f81520a = x.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y7.j f81521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final y7.w f81522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f81523d;

        public c(y7.j jVar, y7.f fVar) {
            this.f81521b = jVar;
            this.f81522c = new y7.w(fVar);
        }

        @Override // k8.l.e
        public void b() {
            this.f81522c.t();
            try {
                this.f81522c.i(this.f81521b);
                int i15 = 0;
                while (i15 != -1) {
                    int iQ = (int) this.f81522c.q();
                    byte[] bArr = this.f81523d;
                    if (bArr == null) {
                        this.f81523d = new byte[1024];
                    } else if (iQ == bArr.length) {
                        this.f81523d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    y7.w wVar = this.f81522c;
                    byte[] bArr2 = this.f81523d;
                    i15 = wVar.read(bArr2, iQ, bArr2.length - iQ);
                }
            } finally {
                y7.i.a(this.f81522c);
            }
        }

        @Override // k8.l.e
        public void c() {
        }
    }

    public d1(y7.j jVar, y7.f.a aVar, y7.x xVar, t7.p pVar, long j15, k8.j jVar2, j0.a aVar2, boolean z15, l8.a aVar3) {
        this.f81503a = jVar;
        this.f81504b = aVar;
        this.f81505c = xVar;
        this.f81512k = pVar;
        this.f81510h = j15;
        this.f81506d = jVar2;
        this.f81507e = aVar2;
        this.f81513l = z15;
        this.f81508f = new j1(new t7.f0(pVar));
        this.f81511j = aVar3 != null ? new k8.l(aVar3) : new k8.l("SingleSampleMediaPeriod");
    }

    @Override // h8.b0, h8.a1
    public long a() {
        return (this.f81514m || this.f81511j.i()) ? Long.MIN_VALUE : 0L;
    }

    @Override // h8.b0, h8.a1
    public boolean b() {
        return this.f81511j.i();
    }

    @Override // h8.b0, h8.a1
    public boolean c(b2 b2Var) {
        if (this.f81514m || this.f81511j.i() || this.f81511j.h()) {
            return false;
        }
        y7.f fVarA = this.f81504b.a();
        y7.x xVar = this.f81505c;
        if (xVar != null) {
            fVarA.m(xVar);
        }
        this.f81511j.n(new c(this.f81503a, fVarA), this, this.f81506d.b(1));
        return true;
    }

    @Override // h8.b0, h8.a1
    public long d() {
        return this.f81514m ? Long.MIN_VALUE : 0L;
    }

    @Override // h8.b0, h8.a1
    public void e(long j15) {
    }

    @Override // h8.b0
    public long h(long j15, f3 f3Var) {
        return j15;
    }

    @Override // h8.b0
    public long i(long j15) {
        for (int i15 = 0; i15 < this.f81509g.size(); i15++) {
            this.f81509g.get(i15).e();
        }
        return j15;
    }

    @Override // k8.l.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void g(c cVar, long j15, long j16, boolean z15) {
        y7.w wVar = cVar.f81522c;
        x xVar = new x(cVar.f81520a, cVar.f81521b, wVar.r(), wVar.s(), j15, j16, wVar.q());
        this.f81506d.c(cVar.f81520a);
        this.f81507e.k(xVar, 1, -1, null, 0, null, 0L, this.f81510h);
    }

    @Override // h8.b0
    public long k() {
        return -9223372036854775807L;
    }

    @Override // k8.l.b
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void r(c cVar, long j15, long j16) {
        this.f81516p = (int) cVar.f81522c.q();
        this.f81515n = (byte[]) zj.p.q(cVar.f81523d);
        this.f81514m = true;
        y7.w wVar = cVar.f81522c;
        x xVar = new x(cVar.f81520a, cVar.f81521b, wVar.r(), wVar.s(), j15, j16, this.f81516p);
        this.f81506d.c(cVar.f81520a);
        this.f81507e.m(xVar, 1, -1, this.f81512k, 0, null, 0L, this.f81510h);
    }

    @Override // h8.b0
    public void p(b0.a aVar, long j15) {
        aVar.f(this);
    }

    @Override // h8.b0
    public void q() {
    }

    @Override // k8.l.b
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public k8.l.c l(c cVar, long j15, long j16, IOException iOException, int i15) {
        k8.l.c cVarG;
        y7.w wVar = cVar.f81522c;
        x xVar = new x(cVar.f81520a, cVar.f81521b, wVar.r(), wVar.s(), j15, j16, wVar.q());
        long jA = this.f81506d.a(new k8.j.a(xVar, new a0(1, -1, this.f81512k, 0, null, 0L, w7.o0.g1(this.f81510h)), iOException, i15));
        boolean z15 = jA == -9223372036854775807L || i15 >= this.f81506d.b(1);
        if (this.f81513l && z15) {
            w7.t.i("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f81514m = true;
            cVarG = k8.l.f109101f;
        } else {
            cVarG = jA != -9223372036854775807L ? k8.l.g(false, jA) : k8.l.f109102g;
        }
        k8.l.c cVar2 = cVarG;
        boolean zC = cVar2.c();
        this.f81507e.o(xVar, 1, -1, this.f81512k, 0, null, 0L, this.f81510h, iOException, !zC);
        if (!zC) {
            this.f81506d.c(cVar.f81520a);
        }
        return cVar2;
    }

    @Override // h8.b0
    public j1 t() {
        return this.f81508f;
    }

    @Override // h8.b0
    public long u(j8.r[] rVarArr, boolean[] zArr, z0[] z0VarArr, boolean[] zArr2, long j15) {
        for (int i15 = 0; i15 < rVarArr.length; i15++) {
            z0 z0Var = z0VarArr[i15];
            if (z0Var != null && (rVarArr[i15] == null || !zArr[i15])) {
                this.f81509g.remove(z0Var);
                z0VarArr[i15] = null;
            }
            if (z0VarArr[i15] == null && rVarArr[i15] != null) {
                b bVar = new b();
                this.f81509g.add(bVar);
                z0VarArr[i15] = bVar;
                zArr2[i15] = true;
            }
        }
        return j15;
    }

    @Override // k8.l.b
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m(c cVar, long j15, long j16, int i15) {
        y7.w wVar = cVar.f81522c;
        this.f81507e.q(i15 == 0 ? new x(cVar.f81520a, cVar.f81521b, j15) : new x(cVar.f81520a, cVar.f81521b, wVar.r(), wVar.s(), j15, j16, wVar.q()), 1, -1, this.f81512k, 0, null, 0L, this.f81510h, i15);
    }

    @Override // h8.b0
    public void w(long j15, boolean z15) {
    }

    public void x() {
        this.f81511j.l();
    }
}
