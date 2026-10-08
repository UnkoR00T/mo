package jn;

import en.c;
import en.g;
import hn.b;
import java.nio.charset.Charset;
import java.util.Map;
import kn.e;
import kn.i;
import kn.j;
import kn.k;
import kn.l;
import kn.m;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements g {
    private static b b(qn.b bVar, int i15, int i16) {
        b bVar2;
        int iE = bVar.e();
        int iD = bVar.d();
        int iMax = Math.max(i15, iE);
        int iMax2 = Math.max(i16, iD);
        int iMin = Math.min(iMax / iE, iMax2 / iD);
        int i17 = (iMax - (iE * iMin)) / 2;
        int i18 = (iMax2 - (iD * iMin)) / 2;
        if (i16 < iD || i15 < iE) {
            bVar2 = new b(iE, iD);
            i17 = 0;
            i18 = 0;
        } else {
            bVar2 = new b(i15, i16);
        }
        bVar2.c();
        int i19 = 0;
        while (i19 < iD) {
            int i25 = i17;
            int i26 = 0;
            while (i26 < iE) {
                if (bVar.b(i26, i19) == 1) {
                    bVar2.m(i25, i18, iMin, iMin);
                }
                i26++;
                i25 += iMin;
            }
            i19++;
            i18 += iMin;
        }
        return bVar2;
    }

    private static b c(e eVar, l lVar, int i15, int i16) {
        int iH = lVar.h();
        int iG = lVar.g();
        qn.b bVar = new qn.b(lVar.j(), lVar.i());
        int i17 = 0;
        for (int i18 = 0; i18 < iG; i18++) {
            if (i18 % lVar.f111504e == 0) {
                int i19 = 0;
                for (int i25 = 0; i25 < lVar.j(); i25++) {
                    bVar.g(i19, i17, i25 % 2 == 0);
                    i19++;
                }
                i17++;
            }
            int i26 = 0;
            for (int i27 = 0; i27 < iH; i27++) {
                if (i27 % lVar.f111503d == 0) {
                    bVar.g(i26, i17, true);
                    i26++;
                }
                bVar.g(i26, i17, eVar.e(i27, i18));
                int i28 = i26 + 1;
                int i29 = lVar.f111503d;
                if (i27 % i29 == i29 - 1) {
                    bVar.g(i28, i17, i18 % 2 == 0);
                    i26 += 2;
                } else {
                    i26 = i28;
                }
            }
            int i35 = i17 + 1;
            int i36 = lVar.f111504e;
            if (i18 % i36 == i36 - 1) {
                int i37 = 0;
                for (int i38 = 0; i38 < lVar.j(); i38++) {
                    bVar.g(i37, i35, true);
                    i37++;
                }
                i17 += 2;
            } else {
                i17 = i35;
            }
        }
        return b(bVar, i15, i16);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    @Override // en.g
    public b a(String str, en.a aVar, int i15, int i16, Map<c, ?> map) {
        en.b bVar;
        en.b bVar2;
        String strB;
        c cVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (aVar != en.a.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got " + aVar);
        }
        if (i15 < 0 || i16 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i15 + 'x' + i16);
        }
        m mVar = m.FORCE_NONE;
        if (map != null) {
            m mVar2 = (m) map.get(c.DATA_MATRIX_SHAPE);
            if (mVar2 != null) {
                mVar = mVar2;
            }
            bVar = (en.b) map.get(c.MIN_SIZE);
            if (bVar == null) {
                bVar = null;
            }
            bVar2 = (en.b) map.get(c.MAX_SIZE);
            if (bVar2 == null) {
                bVar2 = null;
            }
        } else {
            bVar = null;
            bVar2 = null;
        }
        boolean z15 = false;
        if (map != null) {
            c cVar2 = c.DATA_MATRIX_COMPACT;
            if (map.containsKey(cVar2) && Boolean.parseBoolean(map.get(cVar2).toString())) {
                c cVar3 = c.GS1_FORMAT;
                if (map.containsKey(cVar3) && Boolean.parseBoolean(map.get(cVar3).toString())) {
                    z15 = true;
                }
                c cVar4 = c.CHARACTER_SET;
                strB = k.h(str, map.containsKey(cVar4) ? Charset.forName(map.get(cVar4).toString()) : null, z15 ? 29 : -1, mVar);
            } else {
                if (map != null) {
                    cVar = c.FORCE_C40;
                    if (map.containsKey(cVar) && Boolean.parseBoolean(map.get(cVar).toString())) {
                        z15 = true;
                    }
                }
                strB = j.b(str, mVar, bVar, bVar2, z15);
            }
        } else {
            if (map != null) {
                cVar = c.FORCE_C40;
                if (map.containsKey(cVar)) {
                    z15 = true;
                }
            }
            strB = j.b(str, mVar, bVar, bVar2, z15);
        }
        l lVarL = l.l(strB.length(), mVar, bVar, bVar2, true);
        e eVar = new e(i.b(strB, lVarL), lVarL.h(), lVarL.g());
        eVar.h();
        return c(eVar, lVarL, i15, i16);
    }
}
