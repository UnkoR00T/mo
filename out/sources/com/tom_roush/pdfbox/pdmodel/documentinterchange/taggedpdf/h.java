package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

/* JADX INFO: loaded from: classes4.dex */
public class h extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f37065d = "Table";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final String f37066e = "RowSpan";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final String f37067f = "ColSpan";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static final String f37068g = "Headers";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected static final String f37069h = "Scope";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected static final String f37070j = "Summary";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f37071k = "Both";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f37072l = "Column";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f37073m = "Row";

    public h() {
        k("Table");
    }

    public int J() {
        return p(f37067f, 1);
    }

    public String[] K() {
        return m(f37068g);
    }

    public int L() {
        return p(f37066e, 1);
    }

    public String M() {
        return q(f37069h);
    }

    public String N() {
        return x(f37070j);
    }

    public void O(int i15) {
        E(f37067f, i15);
    }

    public void P(String[] strArr) {
        B(f37068g, strArr);
    }

    public void Q(int i15) {
        E(f37066e, i15);
    }

    public void R(String str) {
        F(f37069h, str);
    }

    public void S(String str) {
        I(f37070j, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a
    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(super.toString());
        if (y(f37066e)) {
            sb5.append(", RowSpan=");
            sb5.append(L());
        }
        if (y(f37067f)) {
            sb5.append(", ColSpan=");
            sb5.append(J());
        }
        if (y(f37068g)) {
            sb5.append(", Headers=");
            sb5.append(com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.a.c(K()));
        }
        if (y(f37069h)) {
            sb5.append(", Scope=");
            sb5.append(M());
        }
        if (y(f37070j)) {
            sb5.append(", Summary=");
            sb5.append(N());
        }
        return sb5.toString();
    }

    public h(bp.d dVar) {
        super(dVar);
    }
}
