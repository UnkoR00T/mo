package j8;

import ak.n0;
import android.graphics.Point;
import h8.j1;
import java.util.Arrays;
import java.util.List;
import t7.f0;
import t7.i0;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class w {
    public static i0 a(u.a aVar, v[] vVarArr) {
        List[] listArr = new List[vVarArr.length];
        for (int i15 = 0; i15 < vVarArr.length; i15++) {
            v vVar = vVarArr[i15];
            listArr[i15] = vVar != null ? n0.E(vVar) : n0.C();
        }
        return b(aVar, listArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    public static i0 b(u.a aVar, List<? extends v>[] listArr) {
        boolean z15;
        n0.a aVar2 = new n0.a();
        boolean z16 = false;
        int i15 = 0;
        while (i15 < aVar.d()) {
            j1 j1VarF = aVar.f(i15);
            int i16 = z16 ? 1 : 0;
            u.a aVar3 = aVar;
            boolean z17 = z16;
            while (i16 < j1VarF.f81616a) {
                f0 f0VarB = j1VarF.b(i16);
                boolean z18 = aVar3.a(i15, i16, z17) != 0 ? true : z17 ? 1 : 0;
                int i17 = f0VarB.f188177a;
                int[] iArr = new int[i17];
                boolean[] zArr = new boolean[i17];
                int i18 = z17 ? 1 : 0;
                u.a aVar4 = aVar3;
                boolean z19 = z17;
                while (i18 < f0VarB.f188177a) {
                    iArr[i18] = aVar4.g(i15, i16, i18);
                    int length = listArr.length;
                    int i19 = z19 ? 1 : 0;
                    boolean z25 = i19;
                    while (i19 < length) {
                        z15 = z19;
                        List<? extends v> list = listArr[i19];
                        for (?? r15 = z15; r15 < list.size(); r15++) {
                            v vVar = list.get(r15);
                            if (vVar.i().equals(f0VarB) && vVar.h(i18) != -1) {
                                z25 = true;
                                break;
                            }
                        }
                        i19++;
                        listArr = listArr;
                        z15 = false;
                        z25 = z25;
                    }
                    z15 = z19;
                    zArr[i18] = z25;
                    i18++;
                    aVar4 = aVar;
                    listArr = listArr;
                    z19 = false;
                }
                aVar2.a(new i0.a(f0VarB, z18, iArr, zArr));
                i16++;
                aVar3 = aVar;
                listArr = listArr;
                z17 = false;
            }
            i15++;
            z16 = false;
        }
        j1 j1VarH = aVar.h();
        for (int i25 = 0; i25 < j1VarH.f81616a; i25++) {
            f0 f0VarB2 = j1VarH.b(i25);
            int[] iArr2 = new int[f0VarB2.f188177a];
            Arrays.fill(iArr2, 0);
            aVar2.a(new i0.a(f0VarB2, false, iArr2, new boolean[f0VarB2.f188177a]));
        }
        return new i0(aVar2.k());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x000f  */
    public static Point c(boolean z15, int i15, int i16, int i17, int i18) {
        if (z15) {
            if ((i17 > i18) == (i15 > i16)) {
                i16 = i15;
                i15 = i16;
            }
        } else {
            i16 = i15;
            i15 = i16;
        }
        int i19 = i17 * i15;
        int i25 = i18 * i16;
        return i19 >= i25 ? new Point(i16, o0.j(i25, i17)) : new Point(o0.j(i19, i18), i15);
    }
}
