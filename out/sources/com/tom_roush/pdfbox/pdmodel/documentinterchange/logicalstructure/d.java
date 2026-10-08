package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

/* JADX INFO: loaded from: classes4.dex */
public class d implements hp.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f36975b = "MCR";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bp.d f36976a;

    public d() {
        bp.d dVar = new bp.d();
        this.f36976a = dVar;
        dVar.d5(bp.i.f20732e9, f36975b);
    }

    @Override // hp.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bp.d D1() {
        return this.f36976a;
    }

    public int b() {
        return D1().x4(bp.i.f20946z5);
    }

    public gp.e c() {
        bp.d dVar = (bp.d) D1().p4(bp.i.U6);
        if (dVar != null) {
            return new gp.e(dVar);
        }
        return null;
    }

    public void d(int i15) {
        D1().W4(bp.i.f20946z5, i15);
    }

    public void e(gp.e eVar) {
        D1().Z4(bp.i.U6, eVar);
    }

    public String toString() {
        return "mcid=" + b();
    }

    public d(bp.d dVar) {
        this.f36976a = dVar;
    }
}
