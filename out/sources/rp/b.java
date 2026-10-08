package rp;

import bp.d;
import bp.i;

/* JADX INFO: loaded from: classes4.dex */
public class b extends com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.b {
    public b(d dVar) {
        super(dVar);
        bp.b bVarC4 = dVar.C4(i.f20732e9);
        i iVar = i.f20729e6;
        if (bVarC4.equals(iVar)) {
            return;
        }
        throw new IllegalArgumentException("Provided dictionary is not of type '" + iVar + "'");
    }
}
