package m5;

import g5.d;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import n5.e;
import n5.f;
import n5.l;

/* JADX INFO: loaded from: classes.dex */
public class b extends l {

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    f f123768a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private e[] f123769b1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private int f123771d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private int f123772e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private int f123773f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private int f123774g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private float f123775h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private float f123776i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private String f123777j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private String f123778k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private String f123779l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private String f123780m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private int f123781n1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean[][] f123783p1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private int[][] f123785r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private int f123786s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private int[][] f123787t1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private boolean f123770c1 = false;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private int f123782o1 = 0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    Set<String> f123784q1 = new HashSet();

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private int f123788u1 = 0;

    public b() {
        A2();
        f2();
    }

    private void A2() {
        int i15;
        int i16 = this.f123772e1;
        if (i16 != 0 && (i15 = this.f123774g1) != 0) {
            this.f123771d1 = i16;
            this.f123773f1 = i15;
            return;
        }
        int i17 = this.f123774g1;
        if (i17 > 0) {
            this.f123773f1 = i17;
            this.f123771d1 = ((this.M0 + i17) - 1) / i17;
        } else if (i16 > 0) {
            this.f123771d1 = i16;
            this.f123773f1 = ((this.M0 + i16) - 1) / i16;
        } else {
            int iSqrt = (int) (Math.sqrt(this.M0) + 1.5d);
            this.f123771d1 = iSqrt;
            this.f123773f1 = ((this.M0 + iSqrt) - 1) / iSqrt;
        }
    }

    public static /* synthetic */ int S1(String str, String str2) {
        return Integer.parseInt(str.split(":")[0]) - Integer.parseInt(str2.split(":")[0]);
    }

    private void T1() {
        o2();
        n2();
        U1();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    private void U1() {
        int[][] iArr;
        int i15;
        for (int i16 = 0; i16 < this.M0; i16++) {
            if (!this.f123784q1.contains(this.L0[i16].f131867o)) {
                int iB2 = b2();
                int iC2 = c2(iB2);
                int iA2 = a2(iB2);
                if (iB2 == -1) {
                    return;
                }
                if (!i2() || (iArr = this.f123787t1) == null || (i15 = this.f123788u1) >= iArr.length) {
                    X1(this.L0[i16], iC2, iA2, 1, 1);
                } else {
                    int[] iArr2 = iArr[i15];
                    if (iArr2[0] == iB2) {
                        this.f123783p1[iC2][iA2] = true;
                        if (h2(iC2, iA2, iArr2[1], iArr2[2])) {
                            e eVar = this.L0[i16];
                            int[] iArr3 = this.f123787t1[this.f123788u1];
                            X1(eVar, iC2, iA2, iArr3[1], iArr3[2]);
                            this.f123788u1++;
                        }
                    } else {
                        X1(this.L0[i16], iC2, iA2, 1, 1);
                    }
                }
            }
        }
    }

    private void V1(e eVar) {
        eVar.U0(-1.0f);
        eVar.O.q();
        eVar.Q.q();
    }

    private void W1(e eVar) {
        eVar.l1(-1.0f);
        eVar.P.q();
        eVar.R.q();
        eVar.S.q();
    }

    private void X1(e eVar, int i15, int i16, int i17, int i18) {
        eVar.O.a(this.f123769b1[i16].O, 0);
        eVar.P.a(this.f123769b1[i15].P, 0);
        eVar.Q.a(this.f123769b1[(i16 + i18) - 1].Q, 0);
        eVar.R.a(this.f123769b1[(i15 + i17) - 1].R, 0);
    }

    private void Y1() {
        int iMax = Math.max(this.f123771d1, this.f123773f1);
        e[] eVarArr = this.f123769b1;
        int i15 = 0;
        if (eVarArr == null) {
            this.f123769b1 = new e[iMax];
            while (true) {
                e[] eVarArr2 = this.f123769b1;
                if (i15 >= eVarArr2.length) {
                    return;
                }
                eVarArr2[i15] = k2();
                i15++;
            }
        } else {
            if (iMax == eVarArr.length) {
                return;
            }
            e[] eVarArr3 = new e[iMax];
            while (i15 < iMax) {
                e[] eVarArr4 = this.f123769b1;
                if (i15 < eVarArr4.length) {
                    eVarArr3[i15] = eVarArr4[i15];
                } else {
                    eVarArr3[i15] = k2();
                }
                i15++;
            }
            while (true) {
                e[] eVarArr5 = this.f123769b1;
                if (iMax >= eVarArr5.length) {
                    this.f123769b1 = eVarArr3;
                    return;
                } else {
                    this.f123768a1.x1(eVarArr5[iMax]);
                    iMax++;
                }
            }
        }
    }

    private void Z1(boolean z15) {
        int[][] iArrL2;
        int[][] iArrL3;
        if (z15) {
            for (int i15 = 0; i15 < this.f123783p1.length; i15++) {
                int i16 = 0;
                while (true) {
                    boolean[][] zArr = this.f123783p1;
                    if (i16 < zArr[0].length) {
                        zArr[i15][i16] = true;
                        i16++;
                    }
                }
            }
            for (int i17 = 0; i17 < this.f123785r1.length; i17++) {
                int i18 = 0;
                while (true) {
                    int[][] iArr = this.f123785r1;
                    if (i18 < iArr[0].length) {
                        iArr[i17][i18] = -1;
                        i18++;
                    }
                }
            }
        }
        this.f123782o1 = 0;
        String str = this.f123780m1;
        if (str != null && !str.trim().isEmpty() && (iArrL3 = l2(this.f123780m1, false)) != null) {
            d2(iArrL3);
        }
        String str2 = this.f123779l1;
        if (str2 == null || str2.trim().isEmpty() || (iArrL2 = l2(this.f123779l1, true)) == null) {
            return;
        }
        e2(iArrL2);
    }

    private int a2(int i15) {
        return this.f123781n1 == 1 ? i15 / this.f123771d1 : i15 % this.f123773f1;
    }

    private int b2() {
        boolean z15 = false;
        int i15 = 0;
        while (!z15) {
            i15 = this.f123782o1;
            if (i15 >= this.f123771d1 * this.f123773f1) {
                return -1;
            }
            int iC2 = c2(i15);
            int iA2 = a2(this.f123782o1);
            boolean[] zArr = this.f123783p1[iC2];
            if (zArr[iA2]) {
                zArr[iA2] = false;
                z15 = true;
            }
            this.f123782o1++;
        }
        return i15;
    }

    private int c2(int i15) {
        return this.f123781n1 == 1 ? i15 % this.f123771d1 : i15 / this.f123773f1;
    }

    private void d2(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!h2(c2(iArr2[0]), a2(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    private void e2(int[][] iArr) {
        if (!i2()) {
            for (int i15 = 0; i15 < iArr.length; i15++) {
                int iC2 = c2(iArr[i15][0]);
                int iA2 = a2(iArr[i15][0]);
                int[] iArr2 = iArr[i15];
                if (!h2(iC2, iA2, iArr2[1], iArr2[2])) {
                    break;
                }
                e eVar = this.L0[i15];
                int[] iArr3 = iArr[i15];
                X1(eVar, iC2, iA2, iArr3[1], iArr3[2]);
                this.f123784q1.add(this.L0[i15].f131867o);
            }
        }
    }

    private void f2() {
        boolean[][] zArr;
        int[][] iArr = this.f123785r1;
        boolean z15 = false;
        if (iArr != null && iArr.length == this.M0 && (zArr = this.f123783p1) != null && zArr.length == this.f123771d1 && zArr[0].length == this.f123773f1) {
            z15 = true;
        }
        if (!z15) {
            g2();
        }
        Z1(z15);
    }

    private void g2() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.f123771d1, this.f123773f1);
        this.f123783p1 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i15 = this.M0;
        if (i15 > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i15, 4);
            this.f123785r1 = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    private boolean h2(int i15, int i16, int i17, int i18) {
        for (int i19 = i15; i19 < i15 + i17; i19++) {
            for (int i25 = i16; i25 < i16 + i18; i25++) {
                boolean[][] zArr = this.f123783p1;
                if (i19 < zArr.length && i25 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i19];
                    if (zArr2[i25]) {
                        zArr2[i25] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean i2() {
        return (this.f123786s1 & 2) > 0;
    }

    private boolean j2() {
        return (this.f123786s1 & 1) > 0;
    }

    private e k2() {
        e eVar = new e();
        e.b[] bVarArr = eVar.Z;
        e.b bVar = e.b.MATCH_CONSTRAINT;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        eVar.f131867o = String.valueOf(eVar.hashCode());
        return eVar;
    }

    private int[][] l2(String str, boolean z15) {
        try {
            String[] strArrSplit = str.split(",");
            Arrays.sort(strArrSplit, new Comparator() { // from class: m5.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return b.S1((String) obj, (String) obj2);
                }
            });
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
            if (this.f123771d1 != 1 && this.f123773f1 != 1) {
                for (int i15 = 0; i15 < strArrSplit.length; i15++) {
                    String[] strArrSplit2 = strArrSplit[i15].trim().split(":");
                    String[] strArrSplit3 = strArrSplit2[1].split("x");
                    iArr[i15][0] = Integer.parseInt(strArrSplit2[0]);
                    if (j2()) {
                        iArr[i15][1] = Integer.parseInt(strArrSplit3[1]);
                        iArr[i15][2] = Integer.parseInt(strArrSplit3[0]);
                    } else {
                        iArr[i15][1] = Integer.parseInt(strArrSplit3[0]);
                        iArr[i15][2] = Integer.parseInt(strArrSplit3[1]);
                    }
                }
                return iArr;
            }
            int i16 = 0;
            int i17 = 0;
            for (int i18 = 0; i18 < strArrSplit.length; i18++) {
                String[] strArrSplit4 = strArrSplit[i18].trim().split(":");
                iArr[i18][0] = Integer.parseInt(strArrSplit4[0]);
                int[] iArr2 = iArr[i18];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.f123773f1 == 1) {
                    iArr2[1] = Integer.parseInt(strArrSplit4[1]);
                    i16 += iArr[i18][1];
                    if (z15) {
                        i16--;
                    }
                }
                if (this.f123771d1 == 1) {
                    iArr[i18][2] = Integer.parseInt(strArrSplit4[1]);
                    i17 += iArr[i18][2];
                    if (z15) {
                        i17--;
                    }
                }
            }
            if (i16 != 0 && !this.f123770c1) {
                v2(this.f123771d1 + i16);
            }
            if (i17 != 0 && !this.f123770c1) {
                q2(this.f123773f1 + i17);
            }
            this.f123770c1 = true;
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    private float[] m2(int i15, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        float[] fArr = new float[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            if (i16 < strArrSplit.length) {
                try {
                    fArr[i16] = Float.parseFloat(strArrSplit[i16]);
                } catch (Exception e15) {
                    System.err.println("Error parsing `" + strArrSplit[i16] + "`: " + e15.getMessage());
                    fArr[i16] = 1.0f;
                }
            } else {
                fArr[i16] = 1.0f;
            }
        }
        return fArr;
    }

    private void n2() {
        int i15;
        int iMax = Math.max(this.f123771d1, this.f123773f1);
        e eVar = this.f123769b1[0];
        float[] fArrM2 = m2(this.f123773f1, this.f123778k1);
        if (this.f123773f1 == 1) {
            V1(eVar);
            eVar.O.a(this.O, 0);
            eVar.Q.a(this.Q, 0);
            return;
        }
        int i16 = 0;
        while (true) {
            i15 = this.f123773f1;
            if (i16 >= i15) {
                break;
            }
            e eVar2 = this.f123769b1[i16];
            V1(eVar2);
            if (fArrM2 != null) {
                eVar2.U0(fArrM2[i16]);
            }
            if (i16 > 0) {
                eVar2.O.a(this.f123769b1[i16 - 1].Q, 0);
            } else {
                eVar2.O.a(this.O, 0);
            }
            if (i16 < this.f123773f1 - 1) {
                eVar2.Q.a(this.f123769b1[i16 + 1].O, 0);
            } else {
                eVar2.Q.a(this.Q, 0);
            }
            if (i16 > 0) {
                eVar2.O.f131826g = (int) this.f123775h1;
            }
            i16++;
        }
        while (i15 < iMax) {
            e eVar3 = this.f123769b1[i15];
            V1(eVar3);
            eVar3.O.a(this.O, 0);
            eVar3.Q.a(this.Q, 0);
            i15++;
        }
    }

    private void o2() {
        int i15;
        int iMax = Math.max(this.f123771d1, this.f123773f1);
        e eVar = this.f123769b1[0];
        float[] fArrM2 = m2(this.f123771d1, this.f123777j1);
        if (this.f123771d1 == 1) {
            W1(eVar);
            eVar.P.a(this.P, 0);
            eVar.R.a(this.R, 0);
            return;
        }
        int i16 = 0;
        while (true) {
            i15 = this.f123771d1;
            if (i16 >= i15) {
                break;
            }
            e eVar2 = this.f123769b1[i16];
            W1(eVar2);
            if (fArrM2 != null) {
                eVar2.l1(fArrM2[i16]);
            }
            if (i16 > 0) {
                eVar2.P.a(this.f123769b1[i16 - 1].R, 0);
            } else {
                eVar2.P.a(this.P, 0);
            }
            if (i16 < this.f123771d1 - 1) {
                eVar2.R.a(this.f123769b1[i16 + 1].P, 0);
            } else {
                eVar2.R.a(this.R, 0);
            }
            if (i16 > 0) {
                eVar2.P.f131826g = (int) this.f123776i1;
            }
            i16++;
        }
        while (i15 < iMax) {
            e eVar3 = this.f123769b1[i15];
            W1(eVar3);
            eVar3.P.a(this.P, 0);
            eVar3.R.a(this.R, 0);
            i15++;
        }
    }

    private void z2(boolean z15) {
        int[][] iArrL2;
        if (this.f123771d1 < 1 || this.f123773f1 < 1) {
            return;
        }
        if (z15) {
            for (int i15 = 0; i15 < this.f123783p1.length; i15++) {
                int i16 = 0;
                while (true) {
                    boolean[][] zArr = this.f123783p1;
                    if (i16 < zArr[0].length) {
                        zArr[i15][i16] = true;
                        i16++;
                    }
                }
            }
            this.f123784q1.clear();
        }
        this.f123782o1 = 0;
        String str = this.f123780m1;
        if (str != null && !str.trim().isEmpty() && (iArrL2 = l2(this.f123780m1, false)) != null) {
            d2(iArrL2);
        }
        String str2 = this.f123779l1;
        if (str2 != null && !str2.trim().isEmpty()) {
            this.f123787t1 = l2(this.f123779l1, true);
        }
        Y1();
        int[][] iArr = this.f123787t1;
        if (iArr != null) {
            e2(iArr);
        }
    }

    @Override // n5.l
    public void F1(int i15, int i16, int i17, int i18) {
        super.F1(i15, i16, i17, i18);
        this.f123768a1 = (f) L();
        z2(false);
        this.f123768a1.u1(this.f123769b1);
    }

    @Override // n5.e
    public void g(d dVar, boolean z15) {
        super.g(dVar, z15);
        T1();
    }

    public void p2(String str) {
        String str2 = this.f123778k1;
        if (str2 == null || !str2.equals(str)) {
            this.f123778k1 = str;
        }
    }

    public void q2(int i15) {
        if (i15 <= 50 && this.f123774g1 != i15) {
            this.f123774g1 = i15;
            A2();
            g2();
        }
    }

    public void r2(int i15) {
        this.f123786s1 = i15;
    }

    public void s2(float f15) {
        if (f15 >= 0.0f && this.f123775h1 != f15) {
            this.f123775h1 = f15;
        }
    }

    public void t2(int i15) {
        if ((i15 == 0 || i15 == 1) && this.f123781n1 != i15) {
            this.f123781n1 = i15;
        }
    }

    public void u2(String str) {
        String str2 = this.f123777j1;
        if (str2 == null || !str2.equals(str)) {
            this.f123777j1 = str;
        }
    }

    public void v2(int i15) {
        if (i15 <= 50 && this.f123772e1 != i15) {
            this.f123772e1 = i15;
            A2();
            g2();
        }
    }

    public void w2(String str) {
        String str2 = this.f123780m1;
        if (str2 == null || !str2.equals(str)) {
            this.f123770c1 = false;
            this.f123780m1 = str;
        }
    }

    public void x2(CharSequence charSequence) {
        String str = this.f123779l1;
        if (str == null || !str.equals(charSequence.toString())) {
            this.f123770c1 = false;
            this.f123779l1 = charSequence.toString();
        }
    }

    public void y2(float f15) {
        if (f15 >= 0.0f && this.f123776i1 != f15) {
            this.f123776i1 = f15;
        }
    }
}
