package mn;

import en.c;
import en.g;
import en.h;
import hn.b;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;
import nn.d;
import nn.e;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements g {
    private static b b(byte[][] bArr, int i15) {
        int i16 = i15 * 2;
        b bVar = new b(bArr[0].length + i16, bArr.length + i16);
        bVar.c();
        int i17 = (bVar.i() - i15) - 1;
        int i18 = 0;
        while (i18 < bArr.length) {
            byte[] bArr2 = bArr[i18];
            for (int i19 = 0; i19 < bArr[0].length; i19++) {
                if (bArr2[i19] == 1) {
                    bVar.l(i19 + i15, i17);
                }
            }
            i18++;
            i17--;
        }
        return bVar;
    }

    private static b c(e eVar, String str, int i15, int i16, int i17, int i18, boolean z15) throws h {
        boolean z16;
        eVar.e(str, i15, z15);
        byte[][] bArrB = eVar.f().b(1, 4);
        if ((i17 > i16) != (bArrB[0].length < bArrB.length)) {
            bArrB = d(bArrB);
            z16 = true;
        } else {
            z16 = false;
        }
        int iMin = Math.min(i16 / bArrB[0].length, i17 / bArrB.length);
        if (iMin <= 1) {
            return b(bArrB, i18);
        }
        byte[][] bArrB2 = eVar.f().b(iMin, iMin * 4);
        if (z16) {
            bArrB2 = d(bArrB2);
        }
        return b(bArrB2, i18);
    }

    private static byte[][] d(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i15 = 0; i15 < bArr.length; i15++) {
            int length = (bArr.length - i15) - 1;
            for (int i16 = 0; i16 < bArr[0].length; i16++) {
                bArr2[i16][length] = bArr[i15][i16];
            }
        }
        return bArr2;
    }

    @Override // en.g
    public b a(String str, en.a aVar, int i15, int i16, Map<c, ?> map) {
        if (aVar != en.a.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got " + aVar);
        }
        e eVar = new e();
        boolean z15 = false;
        int i17 = 30;
        int i18 = 2;
        if (map != null) {
            c cVar = c.PDF417_COMPACT;
            if (map.containsKey(cVar)) {
                eVar.h(Boolean.parseBoolean(map.get(cVar).toString()));
            }
            c cVar2 = c.PDF417_COMPACTION;
            if (map.containsKey(cVar2)) {
                eVar.i(nn.c.valueOf(map.get(cVar2).toString()));
            }
            c cVar3 = c.PDF417_DIMENSIONS;
            if (map.containsKey(cVar3)) {
                d dVar = (d) map.get(cVar3);
                eVar.j(dVar.a(), dVar.c(), dVar.b(), dVar.d());
            }
            c cVar4 = c.MARGIN;
            i17 = map.containsKey(cVar4) ? Integer.parseInt(map.get(cVar4).toString()) : 30;
            c cVar5 = c.ERROR_CORRECTION;
            i18 = map.containsKey(cVar5) ? Integer.parseInt(map.get(cVar5).toString()) : 2;
            c cVar6 = c.CHARACTER_SET;
            if (map.containsKey(cVar6)) {
                eVar.k(Charset.forName(map.get(cVar6).toString()));
            }
            c cVar7 = c.PDF417_AUTO_ECI;
            if (map.containsKey(cVar7) && Boolean.parseBoolean(map.get(cVar7).toString())) {
                z15 = true;
            }
        }
        return c(eVar, str, i18, i15, i16, i17, z15);
    }
}
