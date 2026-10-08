package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

/* JADX INFO: loaded from: classes4.dex */
public class b extends d {

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final String f36991m1 = "XML-1.00";

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final String f36992n1 = "HTML-3.2";

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final String f36993o1 = "HTML-4.01";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final String f36994p1 = "OEB-1.00";

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final String f36995q1 = "RTF-1.05";

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final String f36996r1 = "CSS-1.00";

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final String f36997s1 = "CSS-2.00";

    public b(String str) {
        k(str);
    }

    public String A1() {
        return q("Scope");
    }

    public String B1() {
        return x("Summary");
    }

    public void C1(int i15) {
        E("ColSpan", i15);
    }

    public void E1(String[] strArr) {
        B("Headers", strArr);
    }

    public void F1(String str) {
        F("ListNumbering", str);
    }

    public void G1(int i15) {
        E("RowSpan", i15);
    }

    public void H1(String str) {
        F("Scope", str);
    }

    public void I1(String str) {
        I("Summary", str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d, com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a
    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(super.toString());
        if (y("ListNumbering")) {
            sb5.append(", ListNumbering=");
            sb5.append(y1());
        }
        if (y("RowSpan")) {
            sb5.append(", RowSpan=");
            sb5.append(z1());
        }
        if (y("ColSpan")) {
            sb5.append(", ColSpan=");
            sb5.append(w1());
        }
        if (y("Headers")) {
            sb5.append(", Headers=");
            sb5.append(com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a.c(x1()));
        }
        if (y("Scope")) {
            sb5.append(", Scope=");
            sb5.append(A1());
        }
        if (y("Summary")) {
            sb5.append(", Summary=");
            sb5.append(B1());
        }
        return sb5.toString();
    }

    public int w1() {
        return p("ColSpan", 1);
    }

    public String[] x1() {
        return m("Headers");
    }

    public String y1() {
        return r("ListNumbering", "None");
    }

    public int z1() {
        return p("RowSpan", 1);
    }

    public b(bp.d dVar) {
        super(dVar);
    }
}
