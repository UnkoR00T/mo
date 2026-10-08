package q8;

import ak.h2;
import java.util.ArrayList;
import l9.s;
import o8.j0;
import o8.k0;
import o8.l0;
import o8.p;
import o8.q;
import o8.r;
import o8.s0;
import t7.w;
import t7.x;
import w7.c0;
import w7.t;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f165238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f165239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f165240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s.a f165241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f165242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r f165243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private q8.c f165244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f165245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private e[] f165246i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f165247j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private e f165248k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f165249l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f165250m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f165251n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f165252o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f165253p;

    /* JADX INFO: renamed from: q8.b$b, reason: collision with other inner class name */
    private class C4115b implements l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f165254a;

        public C4115b(long j15) {
            this.f165254a = j15;
        }

        @Override // o8.l0
        public l0.a c(long j15) {
            l0.a aVarI = b.this.f165246i[0].i(j15);
            for (int i15 = 1; i15 < b.this.f165246i.length; i15++) {
                l0.a aVarI2 = b.this.f165246i[i15].i(j15);
                if (aVarI2.f143129a.f143159b < aVarI.f143129a.f143159b) {
                    aVarI = aVarI2;
                }
            }
            return aVarI;
        }

        @Override // o8.l0
        public boolean e() {
            return true;
        }

        @Override // o8.l0
        public long h() {
            return this.f165254a;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f165256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f165257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f165258c;

        private c() {
        }

        public void a(c0 c0Var) {
            this.f165256a = c0Var.D();
            this.f165257b = c0Var.D();
            this.f165258c = 0;
        }

        public void b(c0 c0Var) throws x {
            a(c0Var);
            if (this.f165256a == 1414744396) {
                this.f165258c = c0Var.D();
                return;
            }
            throw x.a("LIST expected, found: " + this.f165256a, null);
        }
    }

    public b(int i15, s.a aVar) {
        this.f165241d = aVar;
        this.f165240c = (i15 & 1) == 0;
        this.f165238a = new c0(12);
        this.f165239b = new c();
        this.f165243f = new j0();
        this.f165246i = new e[0];
        this.f165250m = -1L;
        this.f165251n = -1L;
        this.f165249l = -1;
        this.f165245h = -9223372036854775807L;
    }

    private static void i(q qVar) {
        if ((qVar.getPosition() & 1) == 1) {
            qVar.n(1);
        }
    }

    private e j(int i15) {
        for (e eVar : this.f165246i) {
            if (eVar.j(i15)) {
                return eVar;
            }
        }
        return null;
    }

    private void k(c0 c0Var) throws x {
        f fVarC = f.c(1819436136, c0Var);
        if (fVarC.getType() != 1819436136) {
            throw x.a("Unexpected header list type " + fVarC.getType(), null);
        }
        q8.c cVar = (q8.c) fVarC.b(q8.c.class);
        if (cVar == null) {
            throw x.a("AviHeader not found", null);
        }
        this.f165244g = cVar;
        this.f165245h = ((long) cVar.f165261c) * ((long) cVar.f165259a);
        ArrayList arrayList = new ArrayList();
        h2<q8.a> it = fVarC.f165284a.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            q8.a next = it.next();
            if (next.getType() == 1819440243) {
                int i16 = i15 + 1;
                e eVarN = n((f) next, i15);
                if (eVarN != null) {
                    arrayList.add(eVarN);
                }
                i15 = i16;
            }
        }
        this.f165246i = (e[]) arrayList.toArray(new e[0]);
        this.f165243f.s();
    }

    private void l(c0 c0Var) {
        int i15;
        long jM = m(c0Var);
        while (true) {
            if (c0Var.a() < 16) {
                break;
            }
            int iD = c0Var.D();
            int iD2 = c0Var.D();
            long jD = ((long) c0Var.D()) + jM;
            c0Var.g0(4);
            e eVarJ = j(iD);
            if (eVarJ != null) {
                eVarJ.b(jD, (iD2 & 16) == 16);
            }
        }
        for (e eVar : this.f165246i) {
            eVar.c();
        }
        this.f165253p = true;
        if (this.f165246i.length == 0) {
            this.f165243f.f(new l0.b(this.f165245h));
        } else {
            this.f165243f.f(new C4115b(this.f165245h));
        }
    }

    private long m(c0 c0Var) {
        if (c0Var.a() < 16) {
            return 0L;
        }
        int iG = c0Var.g();
        c0Var.g0(8);
        long jD = c0Var.D();
        long j15 = this.f165250m;
        long j16 = jD <= j15 ? j15 + 8 : 0L;
        c0Var.f0(iG);
        return j16;
    }

    private e n(f fVar, int i15) {
        d dVar = (d) fVar.b(d.class);
        g gVar = (g) fVar.b(g.class);
        if (dVar == null) {
            t.h("AviExtractor", "Missing Stream Header");
            return null;
        }
        if (gVar == null) {
            t.h("AviExtractor", "Missing Stream Format");
            return null;
        }
        long jA = dVar.a();
        t7.p pVar = gVar.f165286a;
        t7.p.b bVarB = pVar.b();
        bVarB.j0(i15);
        int i16 = dVar.f165268f;
        if (i16 != 0) {
            bVarB.p0(i16);
        }
        h hVar = (h) fVar.b(h.class);
        if (hVar != null) {
            bVarB.m0(hVar.f165287a);
        }
        int iF = w.f(pVar.f188381p);
        if (iF != 1 && iF != 2) {
            return null;
        }
        s0 s0VarV = this.f165243f.v(i15, iF);
        s0VarV.e(bVarB.Q());
        s0VarV.d(jA);
        this.f165245h = Math.max(this.f165245h, jA);
        return new e(i15, dVar, s0VarV);
    }

    private int o(q qVar) {
        if (qVar.getPosition() >= this.f165251n) {
            return -1;
        }
        e eVar = this.f165248k;
        if (eVar == null) {
            i(qVar);
            qVar.p(this.f165238a.f(), 0, 12);
            this.f165238a.f0(0);
            int iD = this.f165238a.D();
            if (iD == 1414744396) {
                this.f165238a.f0(8);
                qVar.n(this.f165238a.D() != 1769369453 ? 8 : 12);
                qVar.g();
                return 0;
            }
            int iD2 = this.f165238a.D();
            if (iD == 1263424842) {
                this.f165247j = qVar.getPosition() + ((long) iD2) + 8;
                return 0;
            }
            qVar.n(8);
            qVar.g();
            e eVarJ = j(iD);
            if (eVarJ == null) {
                this.f165247j = qVar.getPosition() + ((long) iD2);
                return 0;
            }
            eVarJ.n(iD2);
            this.f165248k = eVarJ;
        } else if (eVar.m(qVar)) {
            this.f165248k = null;
        }
        return 0;
    }

    private boolean p(q qVar, k0 k0Var) {
        boolean z15;
        if (this.f165247j != -1) {
            long position = qVar.getPosition();
            long j15 = this.f165247j;
            if (j15 < position || j15 > 262144 + position) {
                k0Var.f143128a = j15;
                z15 = true;
            } else {
                qVar.n((int) (j15 - position));
                z15 = false;
            }
        } else {
            z15 = false;
        }
        this.f165247j = -1L;
        return z15;
    }

    @Override // o8.p
    public void a(long j15, long j16) {
        this.f165247j = -1L;
        this.f165248k = null;
        for (e eVar : this.f165246i) {
            eVar.o(j15);
        }
        if (j15 != 0) {
            this.f165242e = 6;
        } else if (this.f165246i.length == 0) {
            this.f165242e = 0;
        } else {
            this.f165242e = 3;
        }
    }

    @Override // o8.p
    public void b() {
    }

    @Override // o8.p
    public boolean c(q qVar) {
        qVar.p(this.f165238a.f(), 0, 12);
        this.f165238a.f0(0);
        if (this.f165238a.D() != 1179011410) {
            return false;
        }
        this.f165238a.g0(4);
        return this.f165238a.D() == 541677121;
    }

    @Override // o8.p
    public void d(r rVar) {
        this.f165242e = 0;
        if (this.f165240c) {
            rVar = new l9.t(rVar, this.f165241d);
        }
        this.f165243f = rVar;
        this.f165247j = -1L;
    }

    @Override // o8.p
    public int g(q qVar, k0 k0Var) throws x {
        if (p(qVar, k0Var)) {
            return 1;
        }
        switch (this.f165242e) {
            case 0:
                if (!c(qVar)) {
                    throw x.a("AVI Header List not found", null);
                }
                qVar.n(12);
                this.f165242e = 1;
                return 0;
            case 1:
                qVar.readFully(this.f165238a.f(), 0, 12);
                this.f165238a.f0(0);
                this.f165239b.b(this.f165238a);
                c cVar = this.f165239b;
                if (cVar.f165258c == 1819436136) {
                    this.f165249l = cVar.f165257b;
                    this.f165242e = 2;
                    return 0;
                }
                throw x.a("hdrl expected, found: " + this.f165239b.f165258c, null);
            case 2:
                int i15 = this.f165249l - 4;
                c0 c0Var = new c0(i15);
                qVar.readFully(c0Var.f(), 0, i15);
                k(c0Var);
                this.f165242e = 3;
                return 0;
            case 3:
                if (this.f165250m != -1) {
                    long position = qVar.getPosition();
                    long j15 = this.f165250m;
                    if (position != j15) {
                        this.f165247j = j15;
                        return 0;
                    }
                }
                qVar.p(this.f165238a.f(), 0, 12);
                qVar.g();
                this.f165238a.f0(0);
                this.f165239b.a(this.f165238a);
                int iD = this.f165238a.D();
                int i16 = this.f165239b.f165256a;
                if (i16 == 1179011410) {
                    qVar.n(12);
                    return 0;
                }
                if (i16 != 1414744396 || iD != 1769369453) {
                    this.f165247j = qVar.getPosition() + ((long) this.f165239b.f165257b) + 8;
                    return 0;
                }
                long position2 = qVar.getPosition();
                this.f165250m = position2;
                this.f165251n = position2 + ((long) this.f165239b.f165257b) + 8;
                if (!this.f165253p) {
                    if (((q8.c) zj.p.q(this.f165244g)).a()) {
                        this.f165242e = 4;
                        this.f165247j = this.f165251n;
                        return 0;
                    }
                    this.f165243f.f(new l0.b(this.f165245h));
                    this.f165253p = true;
                }
                this.f165247j = qVar.getPosition() + 12;
                this.f165242e = 6;
                return 0;
            case 4:
                qVar.readFully(this.f165238a.f(), 0, 8);
                this.f165238a.f0(0);
                int iD2 = this.f165238a.D();
                int iD3 = this.f165238a.D();
                if (iD2 == 829973609) {
                    this.f165242e = 5;
                    this.f165252o = iD3;
                } else {
                    this.f165247j = qVar.getPosition() + ((long) iD3);
                }
                return 0;
            case 5:
                c0 c0Var2 = new c0(this.f165252o);
                qVar.readFully(c0Var2.f(), 0, this.f165252o);
                l(c0Var2);
                this.f165242e = 6;
                this.f165247j = this.f165250m;
                return 0;
            case 6:
                return o(qVar);
            default:
                throw new AssertionError();
        }
    }
}
