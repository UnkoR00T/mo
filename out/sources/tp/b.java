package tp;

import io.sentry.android.core.c2;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements hp.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bp.d f191379a;

    public b() {
        bp.d dVar = new bp.d();
        this.f191379a = dVar;
        dVar.Y4(bp.i.f20732e9, bp.i.C);
    }

    public static b a(bp.b bVar) throws IOException {
        if (!(bVar instanceof bp.d)) {
            throw new IOException("Error: Unknown annotation type " + bVar);
        }
        bp.d dVar = (bp.d) bVar;
        String strH4 = dVar.H4(bp.i.f20938y8);
        if ("FileAttachment".equals(strH4)) {
            return new c(dVar);
        }
        if ("Line".equals(strH4)) {
            return new d(dVar);
        }
        if (com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.L.equals(strH4)) {
            return new e(dVar);
        }
        if ("Popup".equals(strH4)) {
            return new g(dVar);
        }
        if ("Stamp".equals(strH4)) {
            return new h(dVar);
        }
        if (com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f37050m.equals(strH4) || com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f37044f.equals(strH4)) {
            return new i(dVar);
        }
        if ("Text".equals(strH4)) {
            return new j(dVar);
        }
        if ("Highlight".equals(strH4) || com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.S0.equals(strH4) || "Squiggly".equals(strH4) || "StrikeOut".equals(strH4)) {
            return new k(dVar);
        }
        if ("Widget".equals(strH4)) {
            return new m(dVar);
        }
        return ("FreeText".equals(strH4) || "Polygon".equals(strH4) || "PolyLine".equals(strH4) || "Caret".equals(strH4) || "Ink".equals(strH4) || "Sound".equals(strH4)) ? new f(dVar) : new l(dVar);
    }

    public o b() {
        bp.b bVarP4 = this.f191379a.p4(bp.i.H);
        if (bVarP4 instanceof bp.d) {
            return new o((bp.d) bVarP4);
        }
        return null;
    }

    public bp.i c() {
        return D1().l4(bp.i.P);
    }

    @Override // hp.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public bp.d D1() {
        return this.f191379a;
    }

    public q e() {
        p pVarB;
        o oVarB = b();
        if (oVarB == null || (pVarB = oVarB.b()) == null) {
            return null;
        }
        return pVarB.d() ? pVarB.b().get(c()) : pVarB.a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return ((b) obj).D1().equals(D1());
        }
        return false;
    }

    public hp.g f() {
        bp.a aVar = (bp.a) this.f191379a.p4(bp.i.f20893u7);
        if (aVar != null) {
            if (aVar.size() == 4 && (aVar.k4(0) instanceof bp.k) && (aVar.k4(1) instanceof bp.k) && (aVar.k4(2) instanceof bp.k) && (aVar.k4(3) instanceof bp.k)) {
                return new hp.g(aVar);
            }
            c2.g("PdfBox-Android", aVar + " is not a rectangle array, returning null");
        }
        return null;
    }

    public boolean g() {
        return D1().t4(bp.i.f20846q3, 2);
    }

    public boolean h() {
        return D1().t4(bp.i.f20846q3, 32);
    }

    public int hashCode() {
        return this.f191379a.hashCode();
    }

    public void i(o oVar) {
        this.f191379a.Z4(bp.i.H, oVar);
    }

    public void j(String str) {
        D1().d5(bp.i.P, str);
    }

    public void k(boolean z15) {
        D1().T4(bp.i.f20846q3, 128, z15);
    }

    public void l(gp.e eVar) {
        D1().Z4(bp.i.A6, eVar);
    }

    public void m(boolean z15) {
        D1().T4(bp.i.f20846q3, 4, z15);
    }

    public void n(hp.g gVar) {
        this.f191379a.Y4(bp.i.f20893u7, gVar.b());
    }

    public b(bp.d dVar) {
        this.f191379a = dVar;
        bp.i iVar = bp.i.f20732e9;
        bp.b bVarP4 = dVar.p4(iVar);
        if (bVarP4 == null) {
            dVar.Y4(iVar, bp.i.C);
            return;
        }
        if (bp.i.C.equals(bVarP4)) {
            return;
        }
        c2.g("PdfBox-Android", "Annotation has type " + bVarP4 + ", further mayhem may follow");
    }
}
