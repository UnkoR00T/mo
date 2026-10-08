package rp;

import bp.d;
import bp.i;

/* JADX INFO: loaded from: classes4.dex */
public class a extends com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.b {
    public a(d dVar) {
        super(dVar);
        bp.b bVarC4 = dVar.C4(i.f20732e9);
        i iVar = i.f20709c6;
        if (bVarC4.equals(iVar)) {
            return;
        }
        throw new IllegalArgumentException("Provided dictionary is not of type '" + iVar + "'");
    }

    public String c() {
        return this.f36990a.L4(i.M5);
    }

    public String toString() {
        return super.toString() + " (" + c() + ")";
    }
}
