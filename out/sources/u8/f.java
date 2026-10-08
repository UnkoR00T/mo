package u8;

import o8.s0;
import t7.p;
import t7.x;
import w7.c0;
import x7.g;

/* JADX INFO: loaded from: classes3.dex */
final class f extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f196297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0 f196298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f196299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f196300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f196301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f196302g;

    public f(s0 s0Var) {
        super(s0Var);
        this.f196297b = new c0(g.f217160a);
        this.f196298c = new c0(4);
    }

    @Override // u8.e
    protected boolean b(c0 c0Var) throws e.a {
        int iQ = c0Var.Q();
        int i15 = (iQ >> 4) & 15;
        int i16 = iQ & 15;
        if (i16 == 7) {
            this.f196302g = i15;
            return i15 != 5;
        }
        throw new e.a("Video format not supported: " + i16);
    }

    @Override // u8.e
    protected boolean c(c0 c0Var, long j15) throws x {
        int iQ = c0Var.Q();
        long jA = j15 + (((long) c0Var.A()) * 1000);
        if (iQ == 0 && !this.f196300e) {
            c0 c0Var2 = new c0(new byte[c0Var.a()]);
            c0Var.u(c0Var2.f(), 0, c0Var.a());
            o8.d dVarB = o8.d.b(c0Var2);
            this.f196299d = dVarB.f143034b;
            this.f196296a.e(new p.b().X("video/x-flv").A0("video/avc").V(dVarB.f143044l).F0(dVarB.f143035c).i0(dVarB.f143036d).v0(dVarB.f143043k).l0(dVarB.f143033a).Q());
            this.f196300e = true;
            return false;
        }
        if (iQ != 1 || !this.f196300e) {
            return false;
        }
        int i15 = this.f196302g == 1 ? 1 : 0;
        if (!this.f196301f && i15 == 0) {
            return false;
        }
        byte[] bArrF = this.f196298c.f();
        bArrF[0] = 0;
        bArrF[1] = 0;
        bArrF[2] = 0;
        int i16 = 4 - this.f196299d;
        int i17 = 0;
        while (c0Var.a() > 0) {
            c0Var.u(this.f196298c.f(), i16, this.f196299d);
            this.f196298c.f0(0);
            int iU = this.f196298c.U();
            this.f196297b.f0(0);
            this.f196296a.a(this.f196297b, 4);
            this.f196296a.a(c0Var, iU);
            i17 = i17 + 4 + iU;
        }
        this.f196296a.c(jA, i15, i17, 0, null);
        this.f196301f = true;
        return true;
    }
}
