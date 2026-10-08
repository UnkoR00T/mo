package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

/* JADX INFO: loaded from: classes4.dex */
public class a extends com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.a {
    public a(bp.d dVar) {
        super(bp.i.O, dVar);
    }

    private boolean p(String str) {
        bp.a aVar = (bp.a) k().p4(bp.i.f20754h0);
        if (aVar != null) {
            for (int i15 = 0; i15 < aVar.size(); i15++) {
                if (str.equals(aVar.i4(i15))) {
                    return true;
                }
            }
        }
        return false;
    }

    public hp.g m() {
        bp.a aVar = (bp.a) k().p4(bp.i.f20919x0);
        if (aVar != null) {
            return new hp.g(aVar);
        }
        return null;
    }

    public String n() {
        return k().H4(bp.i.f20938y8);
    }

    public String o() {
        return k().H4(bp.i.f20732e9);
    }

    public boolean q() {
        return p("Bottom");
    }

    public boolean r() {
        return p("Left");
    }

    public boolean s() {
        return p("Right");
    }

    public boolean t() {
        return p("Top");
    }
}
