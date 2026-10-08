package fn;

import en.g;
import gn.c;
import hn.b;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements g {
    private static b b(String str, en.a aVar, int i15, int i16, Charset charset, int i17, int i18) {
        if (aVar == en.a.AZTEC) {
            return c(c.d(str, i17, i18, charset), i15, i16);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got " + aVar);
    }

    private static b c(gn.a aVar, int i15, int i16) {
        b bVarA = aVar.a();
        if (bVarA == null) {
            throw new IllegalStateException();
        }
        int iJ = bVarA.j();
        int i17 = bVarA.i();
        int iMax = Math.max(i15, iJ);
        int iMax2 = Math.max(i16, i17);
        int iMin = Math.min(iMax / iJ, iMax2 / i17);
        int i18 = (iMax - (iJ * iMin)) / 2;
        int i19 = (iMax2 - (i17 * iMin)) / 2;
        b bVar = new b(iMax, iMax2);
        int i25 = 0;
        while (i25 < i17) {
            int i26 = 0;
            int i27 = i18;
            while (i26 < iJ) {
                if (bVarA.g(i26, i25)) {
                    bVar.m(i27, i19, iMin, iMin);
                }
                i26++;
                i27 += iMin;
            }
            i25++;
            i19 += iMin;
        }
        return bVar;
    }

    @Override // en.g
    public b a(String str, en.a aVar, int i15, int i16, Map<en.c, ?> map) {
        Charset charsetForName = null;
        int i17 = 33;
        int i18 = 0;
        if (map != null) {
            en.c cVar = en.c.CHARACTER_SET;
            charsetForName = map.containsKey(cVar) ? Charset.forName(map.get(cVar).toString()) : null;
            en.c cVar2 = en.c.ERROR_CORRECTION;
            i17 = map.containsKey(cVar2) ? Integer.parseInt(map.get(cVar2).toString()) : 33;
            en.c cVar3 = en.c.AZTEC_LAYERS;
            if (map.containsKey(cVar3)) {
                i18 = Integer.parseInt(map.get(cVar3).toString());
            }
        }
        return b(str, aVar, i15, i16, charsetForName, i17, i18);
    }
}
