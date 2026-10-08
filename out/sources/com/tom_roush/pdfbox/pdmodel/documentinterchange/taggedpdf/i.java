package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import io.sentry.android.core.c2;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class i {
    public static final String A = "TH";
    public static final String B = "TD";
    public static final String C = "THead";
    public static final String D = "TBody";
    public static final String E = "TFoot";
    public static final String F = "Span";
    public static final String G = "Quote";
    public static final String H = "Note";
    public static final String I = "Reference";
    public static final String J = "BibEntry";
    public static final String K = "Code";
    public static final String L = "Link";
    public static final String M = "Annot";
    public static final String N = "Ruby";
    public static final String O = "RB";
    public static final String P = "RT";
    public static final String Q = "RP";
    public static final String R = "Warichu";
    public static final String S = "WT";
    public static final String T = "WP";
    public static final String U = "Figure";
    public static final String V = "Formula";
    public static final String W = "Form";
    public static List<String> X = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f37074a = "Document";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f37075b = "Part";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f37076c = "Art";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f37077d = "Sect";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f37078e = "Div";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f37079f = "BlockQuote";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f37080g = "Caption";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f37081h = "TOC";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f37082i = "TOCI";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f37083j = "Index";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f37084k = "NonStruct";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f37085l = "Private";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f37086m = "P";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f37087n = "H";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f37088o = "H1";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f37089p = "H2";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f37090q = "H3";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f37091r = "H4";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f37092s = "H5";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f37093t = "H6";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f37094u = "L";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f37095v = "LI";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f37096w = "Lbl";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f37097x = "LBody";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f37098y = "Table";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f37099z = "TR";

    static {
        for (Field field : i.class.getFields()) {
            if (Modifier.isFinal(field.getModifiers())) {
                try {
                    X.add(field.get(null).toString());
                } catch (IllegalAccessException e15) {
                    c2.f("PdfBox-Android", e15.getMessage(), e15);
                } catch (IllegalArgumentException e16) {
                    c2.f("PdfBox-Android", e16.getMessage(), e16);
                }
            }
        }
        Collections.sort(X);
    }

    private i() {
    }
}
