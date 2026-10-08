package gn;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f74982a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int[] a(hn.a aVar, int i15, int i16) {
        int[] iArr = new int[i16];
        int iL = aVar.l() / i15;
        for (int i17 = 0; i17 < iL; i17++) {
            int i18 = 0;
            for (int i19 = 0; i19 < i15; i19++) {
                i18 |= aVar.j((i17 * i15) + i19) ? 1 << ((i15 - i19) - 1) : 0;
            }
            iArr[i17] = i18;
        }
        return iArr;
    }

    private static void b(hn.b bVar, int i15, int i16) {
        for (int i17 = 0; i17 < i16; i17 += 2) {
            int i18 = i15 - i17;
            int i19 = i18;
            while (true) {
                int i25 = i15 + i17;
                if (i19 <= i25) {
                    bVar.l(i19, i18);
                    bVar.l(i19, i25);
                    bVar.l(i18, i19);
                    bVar.l(i25, i19);
                    i19++;
                }
            }
        }
        int i26 = i15 - i16;
        bVar.l(i26, i26);
        int i27 = i26 + 1;
        bVar.l(i27, i26);
        bVar.l(i26, i27);
        int i28 = i15 + i16;
        bVar.l(i28, i26);
        bVar.l(i28, i27);
        bVar.l(i28, i28 - 1);
    }

    private static void c(hn.b bVar, boolean z15, int i15, hn.a aVar) {
        int i16 = i15 / 2;
        int i17 = 0;
        if (z15) {
            while (i17 < 7) {
                int i18 = (i16 - 3) + i17;
                if (aVar.j(i17)) {
                    bVar.l(i18, i16 - 5);
                }
                if (aVar.j(i17 + 7)) {
                    bVar.l(i16 + 5, i18);
                }
                if (aVar.j(20 - i17)) {
                    bVar.l(i18, i16 + 5);
                }
                if (aVar.j(27 - i17)) {
                    bVar.l(i16 - 5, i18);
                }
                i17++;
            }
            return;
        }
        while (i17 < 10) {
            int i19 = (i16 - 5) + i17 + (i17 / 5);
            if (aVar.j(i17)) {
                bVar.l(i19, i16 - 7);
            }
            if (aVar.j(i17 + 10)) {
                bVar.l(i16 + 7, i19);
            }
            if (aVar.j(29 - i17)) {
                bVar.l(i19, i16 + 7);
            }
            if (aVar.j(39 - i17)) {
                bVar.l(i16 - 7, i19);
            }
            i17++;
        }
    }

    public static a d(String str, int i15, int i16, Charset charset) {
        return e(str.getBytes(charset != null ? charset : StandardCharsets.ISO_8859_1), i15, i16, charset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a e(byte[] bArr, int i15, int i16, Charset charset) {
        hn.a aVarI;
        int i17;
        boolean z15;
        int iAbs;
        int iJ;
        int i18;
        hn.a aVarA = new d(bArr, charset).a();
        int iL = ((aVarA.l() * i15) / 100) + 11;
        int iL2 = aVarA.l() + iL;
        int i19 = 4;
        int i25 = 1;
        if (i16 != 0) {
            boolean z16 = i16 < 0;
            iAbs = Math.abs(i16);
            if (iAbs > (z16 ? 4 : 32)) {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i16)));
            }
            iJ = j(iAbs, z16);
            i17 = f74982a[iAbs];
            int i26 = iJ - (iJ % i17);
            aVarI = i(aVarA, i17);
            if (aVarI.l() + iL > i26) {
                z15 = z16;
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
            if (z16) {
                z15 = z16;
                if (aVarI.l() > i17 * 64) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            }
        } else {
            hn.a aVarI2 = null;
            int i27 = 0;
            int i28 = 0;
            while (true) {
                if (i27 > 32) {
                    throw new IllegalArgumentException("Data too large for an Aztec code");
                }
                boolean z17 = i27 <= 3 ? i25 : 0;
                int i29 = z17 != 0 ? i27 + 1 : i27;
                int iJ2 = j(i29, z17);
                if (iL2 <= iJ2) {
                    if (aVarI2 == null || i28 != f74982a[i29]) {
                        int i35 = f74982a[i29];
                        i28 = i35;
                        aVarI2 = i(aVarA, i35);
                    }
                    int i36 = iJ2 - (iJ2 % i28);
                    if ((z17 == 0 || aVarI2.l() <= i28 * 64) && aVarI2.l() + iL <= i36) {
                        aVarI = aVarI2;
                        i17 = i28;
                        z15 = z17;
                        iAbs = i29;
                        iJ = iJ2;
                        break;
                    }
                }
                i27++;
                i25 = i25;
                i19 = 4;
            }
        }
        hn.a aVarF = f(aVarI, iJ, i17);
        int iL3 = aVarI.l() / i17;
        hn.a aVarG = g(z15, iAbs, iL3);
        int i37 = (z15 ? 11 : 14) + (iAbs * 4);
        int[] iArr = new int[i37];
        int i38 = 2;
        if (z15) {
            for (int i39 = 0; i39 < i37; i39++) {
                iArr[i39] = i39;
            }
            i18 = i37;
        } else {
            int i45 = i37 / 2;
            i18 = i37 + 1 + (((i45 - 1) / 15) * 2);
            int i46 = i18 / 2;
            for (int i47 = 0; i47 < i45; i47++) {
                int i48 = (i47 / 15) + i47;
                iArr[(i45 - i47) - 1] = (i46 - i48) - 1;
                iArr[i45 + i47] = i48 + i46 + i25;
            }
        }
        hn.b bVar = new hn.b(i18);
        int i49 = 0;
        int i55 = 0;
        while (i49 < iAbs) {
            int i56 = ((iAbs - i49) * i19) + (z15 ? 9 : 12);
            for (int i57 = 0; i57 < i56; i57++) {
                int i58 = i57 * 2;
                int i59 = 0;
                while (i59 < i38) {
                    int i65 = i25;
                    if (aVarF.j(i55 + i58 + i59)) {
                        int i66 = i49 * 2;
                        bVar.l(iArr[i66 + i59], iArr[i66 + i57]);
                    }
                    if (aVarF.j((i56 * 2) + i55 + i58 + i59)) {
                        int i67 = i49 * 2;
                        bVar.l(iArr[i67 + i57], iArr[((i37 - 1) - i67) - i59]);
                    }
                    if (aVarF.j((i56 * 4) + i55 + i58 + i59)) {
                        int i68 = (i37 - 1) - (i49 * 2);
                        bVar.l(iArr[i68 - i59], iArr[i68 - i57]);
                    }
                    if (aVarF.j((i56 * 6) + i55 + i58 + i59)) {
                        int i69 = i49 * 2;
                        bVar.l(iArr[((i37 - 1) - i69) - i57], iArr[i69 + i59]);
                    }
                    i59++;
                    i38 = i38;
                    i25 = i65;
                }
            }
            i55 += i56 * 8;
            i49++;
            i19 = 4;
        }
        c(bVar, z15, i18, aVarG);
        if (z15) {
            b(bVar, i18 / 2, 5);
        } else {
            int i75 = i18 / 2;
            b(bVar, i75, 7);
            int i76 = 0;
            int i77 = 0;
            while (i77 < (i37 / 2) - 1) {
                for (int i78 = i75 & 1; i78 < i18; i78 += 2) {
                    int i79 = i75 - i76;
                    bVar.l(i79, i78);
                    int i85 = i75 + i76;
                    bVar.l(i85, i78);
                    bVar.l(i78, i79);
                    bVar.l(i78, i85);
                }
                i77 += 15;
                i76 += 16;
            }
        }
        a aVar = new a();
        aVar.c(z15);
        aVar.f(i18);
        aVar.d(iAbs);
        aVar.b(iL3);
        aVar.e(bVar);
        return aVar;
    }

    private static hn.a f(hn.a aVar, int i15, int i16) {
        int iL = aVar.l() / i16;
        in.c cVar = new in.c(h(i16));
        int i17 = i15 / i16;
        int[] iArrA = a(aVar, i16, i17);
        cVar.b(iArrA, i17 - iL);
        hn.a aVar2 = new hn.a();
        aVar2.e(0, i15 % i16);
        for (int i18 : iArrA) {
            aVar2.e(i18, i16);
        }
        return aVar2;
    }

    static hn.a g(boolean z15, int i15, int i16) {
        hn.a aVar = new hn.a();
        if (z15) {
            aVar.e(i15 - 1, 2);
            aVar.e(i16 - 1, 6);
            return f(aVar, 28, 4);
        }
        aVar.e(i15 - 1, 5);
        aVar.e(i16 - 1, 11);
        return f(aVar, 40, 4);
    }

    private static in.a h(int i15) {
        if (i15 == 4) {
            return in.a.f93487k;
        }
        if (i15 == 6) {
            return in.a.f93486j;
        }
        if (i15 == 8) {
            return in.a.f93490n;
        }
        if (i15 == 10) {
            return in.a.f93485i;
        }
        if (i15 == 12) {
            return in.a.f93484h;
        }
        throw new IllegalArgumentException("Unsupported word size " + i15);
    }

    static hn.a i(hn.a aVar, int i15) {
        hn.a aVar2 = new hn.a();
        int iL = aVar.l();
        int i16 = (1 << i15) - 2;
        int i17 = 0;
        while (i17 < iL) {
            int i18 = 0;
            for (int i19 = 0; i19 < i15; i19++) {
                int i25 = i17 + i19;
                if (i25 >= iL || aVar.j(i25)) {
                    i18 |= 1 << ((i15 - 1) - i19);
                }
            }
            int i26 = i18 & i16;
            if (i26 == i16) {
                aVar2.e(i26, i15);
            } else {
                if (i26 == 0) {
                    aVar2.e(i18 | 1, i15);
                } else {
                    aVar2.e(i18, i15);
                }
                i17 += i15;
            }
            i17--;
            i17 += i15;
        }
        return aVar2;
    }

    private static int j(int i15, boolean z15) {
        return ((z15 ? 88 : 112) + (i15 * 16)) * i15;
    }
}
