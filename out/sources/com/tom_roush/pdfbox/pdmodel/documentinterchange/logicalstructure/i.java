package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import io.sentry.android.core.c2;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class i extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f36982b = "StructTreeRoot";

    public i() {
        super(f36982b);
    }

    public void A(Map<String, String> map) {
        bp.d dVar = new bp.d();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dVar.e5(entry.getKey(), entry.getValue());
        }
        D1().Y4(bp.i.C7, dVar);
    }

    public hp.e<g> q() {
        bp.b bVarP4 = D1().p4(bp.i.f20836p4);
        if (bVarP4 instanceof bp.d) {
            return new gp.i((bp.d) bVarP4);
        }
        return null;
    }

    public bp.b r() {
        return D1().p4(bp.i.N4);
    }

    @Deprecated
    public bp.a s() {
        bp.d dVarD1 = D1();
        bp.i iVar = bp.i.N4;
        bp.b bVarP4 = dVarD1.p4(iVar);
        if (!(bVarP4 instanceof bp.d)) {
            if (bVarP4 instanceof bp.a) {
                return (bp.a) bVarP4;
            }
            return null;
        }
        bp.b bVarP5 = ((bp.d) bVarP4).p4(iVar);
        if (bVarP5 instanceof bp.a) {
            return (bp.a) bVarP5;
        }
        return null;
    }

    public hp.f t() {
        bp.b bVarP4 = D1().p4(bp.i.K6);
        if (bVarP4 instanceof bp.d) {
            return new hp.f((bp.d) bVarP4, f.class);
        }
        return null;
    }

    public int u() {
        return D1().x4(bp.i.L6);
    }

    public Map<String, Object> v() {
        bp.b bVarP4 = D1().p4(bp.i.C7);
        if (bVarP4 instanceof bp.d) {
            try {
                return hp.b.a((bp.d) bVarP4);
            } catch (IOException e15) {
                c2.f("PdfBox-Android", e15.getMessage(), e15);
            }
        }
        return new HashMap();
    }

    public void w(hp.e<g> eVar) {
        D1().Z4(bp.i.f20836p4, eVar);
    }

    public void x(bp.b bVar) {
        D1().Y4(bp.i.N4, bVar);
    }

    public void y(hp.f fVar) {
        D1().Z4(bp.i.K6, fVar);
    }

    public void z(int i15) {
        D1().W4(bp.i.L6, i15);
    }

    public i(bp.d dVar) {
        super(dVar);
    }
}
