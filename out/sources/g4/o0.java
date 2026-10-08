package g4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aO\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001aW\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001aW\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001c\u001a?\u0010$\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0016H\u0000¢\u0006\u0004\b$\u0010%\u001a#\u0010&\u001a\u00020\n*\u00020\u00162\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0000H\u0002¢\u0006\u0004\b&\u0010(¨\u0006)"}, d2 = {"", "oldSize", "newSize", "Lg4/n;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.f37058j, "Lg4/v;", "d", "(IILg4/n;)Lg4/v;", "diagonals", "callback", "Loq/i0;", "b", "(Lg4/v;Lg4/n;)V", "e", "(IILg4/n;)V", "oldStart", "oldEnd", "newStart", "newEnd", "Lg4/d;", "forward", "backward", "", "snake", "", "h", "(IIIILg4/n;[I[I[I)Z", "g", "(IIIILg4/n;[I[II[I)Z", "c", "startX", "startY", "endX", "endY", "reverse", "data", "f", "(IIIIZ[I)V", "i", "j", "([III)V", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o0 {
    private static final void b(v vVar, n nVar) {
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < vVar.getLastIndex()) {
            int i18 = i15 + 2;
            int iB = vVar.b(i15) - vVar.b(i18);
            int iB2 = vVar.b(i15 + 1) - vVar.b(i18);
            int iB3 = vVar.b(i18);
            i15 += 3;
            while (i16 < iB) {
                nVar.b(i17, i16);
                i16++;
            }
            while (i17 < iB2) {
                nVar.d(i17);
                i17++;
            }
            while (true) {
                int i19 = iB3 - 1;
                if (iB3 > 0) {
                    nVar.e(i16, i17);
                    i16++;
                    i17++;
                    iB3 = i19;
                }
            }
        }
    }

    private static final boolean c(int i15, int i16, int i17, int i18, n nVar, int[] iArr, int[] iArr2, int i19, int[] iArr3) {
        int iB;
        int i25;
        int i26;
        int i27 = (i16 - i15) - (i18 - i17);
        boolean z15 = (i27 & 1) == 0;
        int i28 = -i19;
        for (int i29 = i28; i29 <= i19; i29 += 2) {
            if (i29 == i28 || (i29 != i19 && d.b(iArr2, i29 + 1) < d.b(iArr2, i29 - 1))) {
                iB = d.b(iArr2, i29 + 1);
                i25 = iB;
            } else {
                iB = d.b(iArr2, i29 - 1);
                i25 = iB - 1;
            }
            int i35 = i18 - ((i16 - i25) - i29);
            int i36 = ((i19 != 0 ? 1 : 0) & (i25 == iB ? 1 : 0)) + i35;
            while (true) {
                if (i25 <= i15 || i35 <= i17) {
                    break;
                }
                if (!nVar.c(i25 - 1, i35 - 1)) {
                    break;
                }
                i25--;
                i35--;
            }
            d.d(iArr2, i29, i25);
            if (z15 && (i26 = i27 - i29) >= i28 && i26 <= i19) {
                if (d.b(iArr, i26) >= i25) {
                    f(i25, i35, iB, i36, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final v d(int i15, int i16, n nVar) {
        char c15 = 1;
        int i17 = ((i15 + i16) + 1) / 2;
        v vVar = new v(i17 * 3);
        v vVar2 = new v(i17 * 4);
        vVar2.h(0, i15, 0, i16);
        int i18 = (i17 * 2) + 1;
        int[] iArrA = d.a(new int[i18]);
        int[] iArrA2 = d.a(new int[i18]);
        int[] iArrB = k1.b(new int[5]);
        while (vVar2.d()) {
            int iF = vVar2.f();
            int iF2 = vVar2.f();
            int iF3 = vVar2.f();
            int iF4 = vVar2.f();
            iArrB = iArrB;
            if (h(iF4, iF3, iF2, iF, nVar, iArrA, iArrA2, iArrB)) {
                char c16 = c15;
                if (Math.min(iArrB[2] - iArrB[0], iArrB[3] - iArrB[c15]) > 0) {
                    k1.a(iArrB, vVar);
                }
                vVar2.h(iF4, iArrB[0], iF2, iArrB[c16]);
                vVar2.h(iArrB[2], iF3, iArrB[3], iF);
                c15 = c16;
            }
        }
        vVar.k();
        vVar.g(i15, i16, 0);
        return vVar;
    }

    public static final void e(int i15, int i16, n nVar) {
        b(d(i15, i16, nVar), nVar);
    }

    public static final void f(int i15, int i16, int i17, int i18, boolean z15, int[] iArr) {
        if (iArr.length < 5) {
            return;
        }
        iArr[0] = i15;
        iArr[1] = i16;
        iArr[2] = i17;
        iArr[3] = i18;
        iArr[4] = z15 ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean g(int i15, int i16, int i17, int i18, n nVar, int[] iArr, int[] iArr2, int i19, int[] iArr3) {
        int iB;
        int i25;
        boolean z15;
        int i26 = (i16 - i15) - (i18 - i17);
        boolean z16 = true;
        boolean z17 = (Math.abs(i26) & 1) == 1;
        int i27 = -i19;
        int i28 = i27;
        while (i28 <= i19) {
            if (i28 == i27 || (i28 != i19 && d.b(iArr, i28 + 1) > d.b(iArr, i28 - 1))) {
                iB = d.b(iArr, i28 + 1);
                i25 = iB;
            } else {
                iB = d.b(iArr, i28 - 1);
                i25 = iB + 1;
            }
            int i29 = (i17 + (i25 - i15)) - i28;
            int i35 = i29 - ((i19 != 0 ? z16 : 0) & (i25 == iB ? z16 : 0));
            while (true) {
                if (i25 < i16 && i29 < i18) {
                    if (!nVar.c(i25, i29)) {
                        break;
                    }
                    i25++;
                    i29++;
                } else {
                    break;
                }
            }
            d.d(iArr, i28, i25);
            if (z17) {
                int i36 = i26 - i28;
                z15 = z16;
                if (i36 >= i27 + 1 && i36 <= i19 - 1) {
                    if (d.b(iArr2, i36) <= i25) {
                        f(iB, i35, i25, i29, false, iArr3);
                        return z15;
                    }
                }
                i28 += 2;
                z16 = z15;
            } else {
                z15 = z16;
            }
            i28 += 2;
            z16 = z15;
        }
        return false;
    }

    private static final boolean h(int i15, int i16, int i17, int i18, n nVar, int[] iArr, int[] iArr2, int[] iArr3) {
        int i19 = i16 - i15;
        int i25 = i18 - i17;
        if (i19 >= 1 && i25 >= 1) {
            int i26 = ((i19 + i25) + 1) / 2;
            int[] iArr4 = iArr;
            d.d(iArr4, 1, i15);
            int[] iArr5 = iArr2;
            d.d(iArr5, 1, i16);
            int i27 = 0;
            while (i27 < i26) {
                if (g(i15, i16, i17, i18, nVar, iArr4, iArr5, i27, iArr3) || c(i15, i16, i17, i18, nVar, iArr, iArr2, i27, iArr3)) {
                    return true;
                }
                i27++;
                iArr4 = iArr;
                iArr5 = iArr2;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(int[] iArr, int i15, int i16) {
        int i17 = iArr[i15];
        iArr[i15] = iArr[i16];
        iArr[i16] = i17;
    }
}
