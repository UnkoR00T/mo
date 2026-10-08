package lp;

import io.sentry.android.core.c2;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class t {
    static m a(bp.d dVar, a0 a0Var) throws IOException {
        bp.i iVar = bp.i.f20732e9;
        bp.i iVar2 = bp.i.H3;
        bp.i iVarM4 = dVar.m4(iVar, iVar2);
        if (!iVar2.equals(iVarM4)) {
            throw new IOException("Expected 'Font' dictionary but found '" + iVarM4.A3() + "'");
        }
        bp.i iVarL4 = dVar.l4(bp.i.f20938y8);
        if (bp.i.f20794l1.equals(iVarL4)) {
            return new n(dVar, a0Var);
        }
        if (bp.i.f20804m1.equals(iVarL4)) {
            return new o(dVar, a0Var);
        }
        throw new IOException("Invalid font type: " + iVarM4);
    }

    public static r b(bp.d dVar, gp.j jVar) throws IOException {
        bp.i iVar = bp.i.f20732e9;
        bp.i iVar2 = bp.i.H3;
        bp.i iVarM4 = dVar.m4(iVar, iVar2);
        if (!iVar2.equals(iVarM4)) {
            c2.e("PdfBox-Android", "Expected 'Font' dictionary but found '" + iVarM4.A3() + "'");
        }
        bp.i iVarL4 = dVar.l4(bp.i.f20938y8);
        if (bp.i.f20752g9.equals(iVarL4)) {
            bp.b bVarP4 = dVar.p4(bp.i.J3);
            return ((bVarP4 instanceof bp.d) && ((bp.d) bVarP4).J3(bp.i.N3)) ? new b0(dVar) : new c0(dVar);
        }
        if (bp.i.I5.equals(iVarL4)) {
            bp.b bVarP5 = dVar.p4(bp.i.J3);
            return ((bVarP5 instanceof bp.d) && ((bp.d) bVarP5).J3(bp.i.N3)) ? new b0(dVar) : new v(dVar);
        }
        if (bp.i.f20694a9.equals(iVarL4)) {
            return new z(dVar);
        }
        if (bp.i.f20763h9.equals(iVarL4)) {
            return new f0(dVar, jVar);
        }
        if (bp.i.f20742f9.equals(iVarL4)) {
            return new a0(dVar);
        }
        if (bp.i.f20794l1.equals(iVarL4)) {
            throw new IOException("Type 0 descendant font not allowed");
        }
        if (bp.i.f20804m1.equals(iVarL4)) {
            throw new IOException("Type 2 descendant font not allowed");
        }
        c2.g("PdfBox-Android", "Invalid font subtype '" + iVarL4 + "'");
        return new c0(dVar);
    }
}
