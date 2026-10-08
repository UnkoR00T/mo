package on;

import en.c;
import en.g;
import hn.b;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements g {
    public static b b(qn.g gVar, int i15, int i16, int i17) {
        qn.b bVarA = gVar.a();
        if (bVarA == null) {
            throw new IllegalStateException();
        }
        int iE = bVarA.e();
        int iD = bVarA.d();
        int i18 = i17 * 2;
        int i19 = iE + i18;
        int i25 = i18 + iD;
        int iMax = Math.max(i15, i19);
        int iMax2 = Math.max(i16, i25);
        int iMin = Math.min(iMax / i19, iMax2 / i25);
        int i26 = (iMax - (iE * iMin)) / 2;
        int i27 = (iMax2 - (iD * iMin)) / 2;
        b bVar = new b(iMax, iMax2);
        int i28 = 0;
        while (i28 < iD) {
            int i29 = 0;
            int i35 = i26;
            while (i29 < iE) {
                if (bVarA.b(i29, i28) == 1) {
                    bVar.m(i35, i27, iMin, iMin);
                }
                i29++;
                i35 += iMin;
            }
            i28++;
            i27 += iMin;
        }
        return bVar;
    }

    @Override // en.g
    public b a(String str, en.a aVar, int i15, int i16, Map<c, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (aVar != en.a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got " + aVar);
        }
        if (i15 < 0 || i16 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i15 + 'x' + i16);
        }
        pn.a aVarValueOf = pn.a.L;
        int i17 = 4;
        if (map != null) {
            c cVar = c.ERROR_CORRECTION;
            if (map.containsKey(cVar)) {
                aVarValueOf = pn.a.valueOf(map.get(cVar).toString());
            }
            c cVar2 = c.MARGIN;
            if (map.containsKey(cVar2)) {
                i17 = Integer.parseInt(map.get(cVar2).toString());
            }
        }
        return b(qn.c.n(str, aVarValueOf, map), i15, i16, i17);
    }
}
