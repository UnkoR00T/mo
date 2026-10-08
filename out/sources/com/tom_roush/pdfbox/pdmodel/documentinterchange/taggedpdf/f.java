package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

/* JADX INFO: loaded from: classes4.dex */
public class f extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f37053d = "PrintField";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f37054e = "Role";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f37055f = "checked";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f37056g = "Desc";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f37057h = "rb";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f37058j = "cb";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f37059k = "pb";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f37060l = "tv";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f37061m = "on";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f37062n = "off";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f37063p = "neutral";

    public f() {
        k(f37053d);
    }

    public String J() {
        return x(f37056g);
    }

    public String K() {
        return r(f37055f, f37062n);
    }

    public String L() {
        return q(f37054e);
    }

    public void M(String str) {
        I(f37056g, str);
    }

    public void N(String str) {
        F(f37055f, str);
    }

    public void O(String str) {
        F(f37054e, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a
    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(super.toString());
        if (y(f37054e)) {
            sb5.append(", Role=");
            sb5.append(L());
        }
        if (y(f37055f)) {
            sb5.append(", Checked=");
            sb5.append(K());
        }
        if (y(f37056g)) {
            sb5.append(", Desc=");
            sb5.append(J());
        }
        return sb5.toString();
    }

    public f(bp.d dVar) {
        super(dVar);
    }
}
