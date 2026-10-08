package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

/* JADX INFO: loaded from: classes4.dex */
public class e extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f37042d = "List";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final String f37043e = "ListNumbering";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f37044f = "Circle";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f37045g = "Decimal";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f37046h = "Disc";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f37047j = "LowerAlpha";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f37048k = "LowerRoman";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f37049l = "None";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f37050m = "Square";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f37051n = "UpperAlpha";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f37052p = "UpperRoman";

    public e() {
        k(f37042d);
    }

    public String J() {
        return r(f37043e, "None");
    }

    public void K(String str) {
        F(f37043e, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a
    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(super.toString());
        if (y(f37043e)) {
            sb5.append(", ListNumbering=");
            sb5.append(J());
        }
        return sb5.toString();
    }

    public e(bp.d dVar) {
        super(dVar);
    }
}
