package d1;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0087\u0001\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ld1/j3;", "", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "arrangementSpacingInt", "Le4/y0;", "measureScope", "", "Le4/v0;", "measurables", "", "Le4/a2;", "placeables", "startIndex", "endIndex", "", "crossAxisOffset", "currentLineIndex", "Le4/x0;", "a", "(Ld1/j3;IIIIILe4/y0;Ljava/util/List;[Le4/a2;II[II)Le4/x0;", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k3 {
    public static final p036e4.x0 a(j3 j3Var, int i15, int i16, int i17, int i18, int i19, p036e4.y0 y0Var, List<? extends p036e4.v0> list, p036e4.a2[] a2VarArr, int i25, int i26, int[] iArr, int i27) {
        int i28;
        char c15;
        char c16;
        int i29;
        int iMax;
        int iMax2;
        j3 j3Var2;
        int i35;
        int i36 = i18;
        long j15 = i19;
        int i37 = i26 - i25;
        int[] iArr2 = new int[i37];
        int i38 = 0;
        int i39 = i25;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        int i49 = 0;
        float f15 = 0.0f;
        while (true) {
            int i55 = 1;
            if (i39 >= i26) {
                break;
            }
            p036e4.v0 v0Var = list.get(i39);
            RowColumnParentData rowColumnParentDataC = i3.c(v0Var);
            float fE = i3.e(rowColumnParentDataC);
            if (i47 == 0 && !i3.f(rowColumnParentDataC)) {
                i55 = i38;
            }
            if (fE > 0.0f) {
                f15 += fE;
                i48++;
                i39 = i39;
                j15 = j15;
            } else {
                if (i36 != Integer.MAX_VALUE && rowColumnParentDataC != null) {
                    rowColumnParentDataC.c();
                }
                int i56 = i17 - i49;
                p036e4.a2 a2VarO0 = a2VarArr[i39];
                if (a2VarO0 == null) {
                    int i57 = i17 != Integer.MAX_VALUE ? i56 < 0 ? i38 : i56 : Integer.MAX_VALUE;
                    j3Var2 = j3Var;
                    i35 = i46;
                    a2VarO0 = v0Var.o0(j3.o(j3Var2, 0, 0, i57, i36, false, 16, null));
                } else {
                    j3Var2 = j3Var;
                    i35 = i46;
                }
                int iJ = j3Var2.j(a2VarO0);
                int iB = j3Var2.b(a2VarO0);
                iArr2[i39 - i25] = iJ;
                int i58 = i56 - iJ;
                if (i58 < 0) {
                    i58 = 0;
                }
                int iMin = Math.min(i19, i58);
                i49 += iJ + iMin;
                int iMax3 = Math.max(i35, iB);
                a2VarArr[i39] = a2VarO0;
                i46 = iMax3;
                i45 = iMin;
            }
            i39++;
            i47 = i55;
            j15 = j15;
            i38 = 0;
        }
        j3 j3Var3 = j3Var;
        long j16 = j15;
        int i59 = i46;
        if (i48 == 0) {
            i49 -= i45;
            i28 = 0;
        } else {
            long j17 = j16 * ((long) (i48 - 1));
            long jRound = ((long) ((i17 != Integer.MAX_VALUE ? i17 : i15) - i49)) - j17;
            if (jRound < 0) {
                jRound = 0;
            }
            float f16 = jRound / f15;
            for (int i65 = i25; i65 < i26; i65++) {
                jRound -= (long) Math.round(i3.e(i3.c(list.get(i65))) * f16);
            }
            int i66 = i25;
            int i67 = 0;
            while (i66 < i26) {
                if (a2VarArr[i66] == null) {
                    p036e4.v0 v0Var2 = list.get(i66);
                    RowColumnParentData rowColumnParentDataC2 = i3.c(v0Var2);
                    float fE2 = i3.e(rowColumnParentDataC2);
                    if (i36 != Integer.MAX_VALUE && rowColumnParentDataC2 != null) {
                        rowColumnParentDataC2.c();
                    }
                    if (!(fE2 > 0.0f)) {
                        e1.a.b("All weights <= 0 should have placeables");
                    }
                    int iB2 = hr.a.b(jRound);
                    long j18 = jRound - ((long) iB2);
                    int iMax4 = Math.max(0, Math.round(fE2 * f16) + iB2);
                    if (i3.b(rowColumnParentDataC2)) {
                        c15 = 65535;
                        if (iMax4 != Integer.MAX_VALUE) {
                            c16 = 65535;
                            i29 = iMax4;
                        }
                        j3Var3 = j3Var;
                        p036e4.a2 a2VarO1 = v0Var2.o0(j3Var3.d(i29, 0, iMax4, i36, true));
                        int iJ2 = j3Var3.j(a2VarO1);
                        int iB3 = j3Var3.b(a2VarO1);
                        iArr2[i66 - i25] = iJ2;
                        i67 += iJ2;
                        int iMax5 = Math.max(i59, iB3);
                        a2VarArr[i66] = a2VarO1;
                        i59 = iMax5;
                        jRound = j18;
                    } else {
                        c15 = 65535;
                    }
                    c16 = c15;
                    i29 = 0;
                    j3Var3 = j3Var;
                    p036e4.a2 a2VarO2 = v0Var2.o0(j3Var3.d(i29, 0, iMax4, i36, true));
                    int iJ3 = j3Var3.j(a2VarO2);
                    int iB4 = j3Var3.b(a2VarO2);
                    iArr2[i66 - i25] = iJ3;
                    i67 += iJ3;
                    int iMax6 = Math.max(i59, iB4);
                    a2VarArr[i66] = a2VarO2;
                    i59 = iMax6;
                    jRound = j18;
                }
                i66++;
                i36 = i18;
            }
            i28 = (int) (((long) i67) + j17);
            int i68 = i17 - i49;
            if (i28 < 0) {
                i28 = 0;
            }
            if (i28 > i68) {
                i28 = i68;
            }
        }
        int i69 = i59;
        if (i47 != 0) {
            iMax = 0;
            iMax2 = 0;
            for (int i75 = i25; i75 < i26; i75++) {
                p036e4.a2 a2Var = a2VarArr[i75];
                m0 m0VarA = i3.a(i3.d(a2Var));
                Integer numB = m0VarA != null ? m0VarA.b(a2Var) : null;
                if (numB != null) {
                    int iIntValue = numB.intValue();
                    int iB5 = j3Var3.b(a2Var);
                    iMax = Math.max(iMax, iIntValue != Integer.MIN_VALUE ? numB.intValue() : 0);
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = iB5;
                    }
                    iMax2 = Math.max(iMax2, iB5 - iIntValue);
                }
            }
        } else {
            iMax = 0;
            iMax2 = 0;
        }
        int i76 = i49 + i28;
        if (i76 < 0) {
            i76 = 0;
        }
        int iMax7 = Math.max(i76, i15);
        int iMax8 = Math.max(i69, Math.max(i16, iMax2 + iMax));
        int[] iArr3 = new int[i37];
        j3Var3.a(iMax7, iArr2, iArr3, y0Var);
        return j3Var3.k(a2VarArr, y0Var, iMax, iArr3, iMax7, iMax8, iArr, i27, i25, i26);
    }
}
