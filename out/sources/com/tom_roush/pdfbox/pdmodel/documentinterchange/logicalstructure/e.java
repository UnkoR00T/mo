package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import bp.o;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class e implements hp.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f36977b = "OBJR";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bp.d f36978a;

    public e() {
        bp.d dVar = new bp.d();
        this.f36978a = dVar;
        dVar.d5(bp.i.f20732e9, f36977b);
    }

    @Override // hp.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public bp.d D1() {
        return this.f36978a;
    }

    public hp.c b() {
        np.c cVarB;
        bp.b bVarP4 = D1().p4(bp.i.Z5);
        if (!(bVarP4 instanceof bp.d)) {
            return null;
        }
        try {
            if ((bVarP4 instanceof o) && (cVarB = np.c.b(bVarP4, null)) != null) {
                return cVarB;
            }
            bp.d dVar = (bp.d) bVarP4;
            tp.b bVarA = tp.b.a(bVarP4);
            if (!(bVarA instanceof tp.l) || bp.i.C.equals(dVar.p4(bp.i.f20732e9))) {
                return bVarA;
            }
        } catch (IOException unused) {
        }
        return null;
    }

    public void c(np.c cVar) {
        D1().Z4(bp.i.Z5, cVar);
    }

    public void d(tp.b bVar) {
        D1().Z4(bp.i.Z5, bVar);
    }

    public e(bp.d dVar) {
        this.f36978a = dVar;
    }
}
