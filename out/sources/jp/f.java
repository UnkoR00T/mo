package jp;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class f implements hp.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bp.d f104280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n f104281b;

    public f() {
        this.f104280a = new bp.d();
    }

    public void A(byte[] bArr) {
        this.f104280a.Y4(bp.i.R6, new bp.p(bArr));
    }

    public void B(byte[][] bArr) {
        bp.a aVar = new bp.a();
        for (byte[] bArr2 : bArr) {
            aVar.A3(new bp.p(bArr2));
        }
        this.f104280a.Y4(bp.i.f20883t7, aVar);
        aVar.A2(true);
    }

    public void C(int i15) {
        this.f104280a.W4(bp.i.f20800l7, i15);
    }

    public void D(e eVar) {
        eVar.D1().A2(true);
        t(bp.i.f20791k8, eVar);
    }

    public void E(bp.i iVar) {
        this.f104280a.Y4(bp.i.f20821n8, iVar);
    }

    public void F(bp.i iVar) {
        this.f104280a.Y4(bp.i.f20830o8, iVar);
    }

    public void G(String str) {
        this.f104280a.d5(bp.i.f20894u8, str);
    }

    public void H(byte[] bArr) {
        this.f104280a.Y4(bp.i.f20782j9, new bp.p(bArr));
    }

    public void I(byte[] bArr) {
        this.f104280a.Y4(bp.i.f20772i9, new bp.p(bArr));
    }

    public void J(int i15) {
        this.f104280a.W4(bp.i.f20863r9, i15);
    }

    @Override // hp.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bp.d D1() {
        return this.f104280a;
    }

    public e b(bp.i iVar) {
        bp.b bVarP4 = this.f104280a.p4(bp.i.f20724e1);
        if (!(bVarP4 instanceof bp.d)) {
            return null;
        }
        bp.b bVarP5 = ((bp.d) bVarP4).p4(iVar);
        if (bVarP5 instanceof bp.d) {
            return new e((bp.d) bVarP5);
        }
        return null;
    }

    public e c() {
        return b(bp.i.f20745g2);
    }

    public final String d() {
        return this.f104280a.H4(bp.i.f20933y3);
    }

    public int e() {
        return this.f104280a.y4(bp.i.f20699b5, 40);
    }

    public byte[] f() {
        bp.p pVar = (bp.p) this.f104280a.p4(bp.i.f20749g6);
        if (pVar != null) {
            return pVar.i3();
        }
        return null;
    }

    public byte[] g() {
        bp.p pVar = (bp.p) this.f104280a.p4(bp.i.Y5);
        if (pVar != null) {
            return pVar.i3();
        }
        return null;
    }

    public int h() {
        return this.f104280a.y4(bp.i.A6, 0);
    }

    public byte[] i() {
        bp.p pVar = (bp.p) this.f104280a.p4(bp.i.R6);
        if (pVar != null) {
            return pVar.i3();
        }
        return null;
    }

    public int j() {
        return this.f104280a.y4(bp.i.f20800l7, 0);
    }

    public n k() throws IOException {
        n nVar = this.f104281b;
        if (nVar != null) {
            return nVar;
        }
        throw new IOException("No security handler for filter " + d());
    }

    public e l() {
        return b(bp.i.f20791k8);
    }

    public bp.i m() {
        bp.i iVar = (bp.i) this.f104280a.p4(bp.i.f20821n8);
        return iVar == null ? bp.i.f20847q4 : iVar;
    }

    public bp.i n() {
        bp.i iVar = (bp.i) this.f104280a.p4(bp.i.f20830o8);
        return iVar == null ? bp.i.f20847q4 : iVar;
    }

    public byte[] o() {
        bp.p pVar = (bp.p) this.f104280a.p4(bp.i.f20782j9);
        if (pVar != null) {
            return pVar.i3();
        }
        return null;
    }

    public byte[] p() {
        bp.p pVar = (bp.p) this.f104280a.p4(bp.i.f20772i9);
        if (pVar != null) {
            return pVar.i3();
        }
        return null;
    }

    public int q() {
        return this.f104280a.y4(bp.i.f20863r9, 0);
    }

    public boolean r() {
        bp.b bVarP4 = this.f104280a.p4(bp.i.f20776j3);
        if (bVarP4 instanceof bp.c) {
            return ((bp.c) bVarP4).A3();
        }
        return true;
    }

    public void s() {
        this.f104280a.Y4(bp.i.f20724e1, null);
        this.f104280a.Y4(bp.i.f20821n8, null);
        this.f104280a.Y4(bp.i.f20830o8, null);
    }

    public void t(bp.i iVar, e eVar) {
        bp.d dVar = this.f104280a;
        bp.i iVar2 = bp.i.f20724e1;
        bp.d dVarK4 = dVar.k4(iVar2);
        if (dVarK4 == null) {
            dVarK4 = new bp.d();
            this.f104280a.Y4(iVar2, dVarK4);
        }
        dVarK4.A2(true);
        dVarK4.Y4(iVar, eVar.D1());
    }

    public void u(e eVar) {
        eVar.D1().A2(true);
        t(bp.i.f20745g2, eVar);
    }

    public void v(String str) {
        this.f104280a.Y4(bp.i.f20933y3, bp.i.J3(str));
    }

    public void w(int i15) {
        this.f104280a.W4(bp.i.f20699b5, i15);
    }

    public void x(byte[] bArr) {
        this.f104280a.Y4(bp.i.f20749g6, new bp.p(bArr));
    }

    public void y(byte[] bArr) {
        this.f104280a.Y4(bp.i.Y5, new bp.p(bArr));
    }

    public void z(int i15) {
        this.f104280a.W4(bp.i.A6, i15);
    }

    public f(bp.d dVar) {
        this.f104280a = dVar;
        this.f104281b = o.f104305c.b(d());
    }
}
