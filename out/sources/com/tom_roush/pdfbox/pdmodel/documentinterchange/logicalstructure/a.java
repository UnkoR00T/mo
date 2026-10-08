package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends hp.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f36973b;

    public a() {
    }

    protected static String b(float[] fArr) {
        StringBuilder sb5 = new StringBuilder("[");
        for (int i15 = 0; i15 < fArr.length; i15++) {
            if (i15 > 0) {
                sb5.append(", ");
            }
            sb5.append(fArr[i15]);
        }
        sb5.append(']');
        return sb5.toString();
    }

    protected static String c(Object[] objArr) {
        StringBuilder sb5 = new StringBuilder("[");
        for (int i15 = 0; i15 < objArr.length; i15++) {
            if (i15 > 0) {
                sb5.append(", ");
            }
            sb5.append(objArr[i15]);
        }
        sb5.append(']');
        return sb5.toString();
    }

    public static a d(bp.d dVar) {
        String strH4 = dVar.H4(bp.i.Y5);
        if (j.f36983c.equals(strH4)) {
            return new j(dVar);
        }
        if (com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f37042d.equals(strH4)) {
            return new com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e(dVar);
        }
        if (com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.f37053d.equals(strH4)) {
            return new com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f(dVar);
        }
        if ("Table".equals(strH4)) {
            return new com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.h(dVar);
        }
        if (com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37002d.equals(strH4)) {
            return new com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d(dVar);
        }
        return (com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.b.f36991m1.equals(strH4) || com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.b.f36992n1.equals(strH4) || com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.b.f36993o1.equals(strH4) || com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.b.f36994p1.equals(strH4) || com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.b.f36995q1.equals(strH4) || com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.b.f36996r1.equals(strH4) || com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.b.f36997s1.equals(strH4)) ? new com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.b(dVar) : new b(dVar);
    }

    private g f() {
        return this.f36973b;
    }

    private boolean h(bp.b bVar, bp.b bVar2) {
        if (bVar == null) {
            return bVar2 != null;
        }
        return !bVar.equals(bVar2);
    }

    public String e() {
        return D1().H4(bp.i.Y5);
    }

    public boolean g() {
        return D1().size() == 1 && e() != null;
    }

    protected void i() {
        if (f() != null) {
            f().v(this);
        }
    }

    protected void j(bp.b bVar, bp.b bVar2) {
        if (h(bVar, bVar2)) {
            i();
        }
    }

    protected void k(String str) {
        D1().d5(bp.i.Y5, str);
    }

    protected void l(g gVar) {
        this.f36973b = gVar;
    }

    public String toString() {
        return "O=" + e();
    }

    public a(bp.d dVar) {
        super(dVar);
    }
}
