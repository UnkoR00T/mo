package j8;

import a8.a3;
import a8.b3;
import android.util.Pair;
import h8.c0;
import h8.j1;
import java.util.Arrays;
import java.util.Objects;
import t7.e0;
import t7.f0;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f100141c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f100142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f100143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f100144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final j1[] f100145d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f100146e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[][][] f100147f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final j1 f100148g;

        a(String[] strArr, int[] iArr, j1[] j1VarArr, int[] iArr2, int[][][] iArr3, j1 j1Var) {
            this.f100143b = strArr;
            this.f100144c = iArr;
            this.f100145d = j1VarArr;
            this.f100147f = iArr3;
            this.f100146e = iArr2;
            this.f100148g = j1Var;
            this.f100142a = iArr.length;
        }

        public int a(int i15, int i16, boolean z15) {
            int i17 = this.f100145d[i15].b(i16).f188177a;
            int[] iArr = new int[i17];
            int i18 = 0;
            for (int i19 = 0; i19 < i17; i19++) {
                int iG = g(i15, i16, i19);
                if (iG == 4 || (z15 && iG == 3)) {
                    iArr[i18] = i19;
                    i18++;
                }
            }
            return b(i15, i16, Arrays.copyOf(iArr, i18));
        }

        public int b(int i15, int i16, int[] iArr) {
            int i17 = 0;
            int iMin = 16;
            String str = null;
            boolean z15 = false;
            int i18 = 0;
            while (i17 < iArr.length) {
                String str2 = this.f100145d[i15].b(i16).a(iArr[i17]).f188381p;
                int i19 = i18 + 1;
                if (i18 == 0) {
                    str = str2;
                } else {
                    z15 |= !Objects.equals(str, str2);
                }
                iMin = Math.min(iMin, a3.x(this.f100147f[i15][i16][i17]));
                i17++;
                i18 = i19;
            }
            return z15 ? Math.min(iMin, this.f100146e[i15]) : iMin;
        }

        public int c(int i15, int i16, int i17) {
            return this.f100147f[i15][i16][i17];
        }

        public int d() {
            return this.f100142a;
        }

        public int e(int i15) {
            return this.f100144c[i15];
        }

        public j1 f(int i15) {
            return this.f100145d[i15];
        }

        public int g(int i15, int i16, int i17) {
            return a3.T(c(i15, i16, i17));
        }

        public j1 h() {
            return this.f100148g;
        }
    }

    private static int l(a3[] a3VarArr, f0 f0Var, int[] iArr, boolean z15) {
        int length = a3VarArr.length;
        int i15 = 0;
        boolean z16 = true;
        for (int i16 = 0; i16 < a3VarArr.length; i16++) {
            a3 a3Var = a3VarArr[i16];
            int iMax = 0;
            for (int i17 = 0; i17 < f0Var.f188177a; i17++) {
                iMax = Math.max(iMax, a3.T(a3Var.a(f0Var.a(i17))));
            }
            boolean z17 = iArr[i16] == 0;
            if (iMax > i15 || (iMax == i15 && z15 && !z16 && z17)) {
                length = i16;
                z16 = z17;
                i15 = iMax;
            }
        }
        return length;
    }

    private static int[] m(a3 a3Var, f0 f0Var) {
        int[] iArr = new int[f0Var.f188177a];
        for (int i15 = 0; i15 < f0Var.f188177a; i15++) {
            iArr[i15] = a3Var.a(f0Var.a(i15));
        }
        return iArr;
    }

    private static int[] n(a3[] a3VarArr) {
        int length = a3VarArr.length;
        int[] iArr = new int[length];
        for (int i15 = 0; i15 < length; i15++) {
            iArr[i15] = a3VarArr[i15].Q();
        }
        return iArr;
    }

    @Override // j8.x
    public final void h(Object obj) {
        this.f100141c = (a) obj;
    }

    @Override // j8.x
    public final y j(a3[] a3VarArr, j1 j1Var, c0.b bVar, e0 e0Var) {
        int[] iArr = new int[a3VarArr.length + 1];
        int length = a3VarArr.length + 1;
        f0[][] f0VarArr = new f0[length][];
        int[][][] iArr2 = new int[a3VarArr.length + 1][][];
        for (int i15 = 0; i15 < length; i15++) {
            int i16 = j1Var.f81616a;
            f0VarArr[i15] = new f0[i16];
            iArr2[i15] = new int[i16][];
        }
        int[] iArrN = n(a3VarArr);
        for (int i17 = 0; i17 < j1Var.f81616a; i17++) {
            f0 f0VarB = j1Var.b(i17);
            int iL = l(a3VarArr, f0VarB, iArr, f0VarB.f188179c == 5);
            int[] iArrM = iL == a3VarArr.length ? new int[f0VarB.f188177a] : m(a3VarArr[iL], f0VarB);
            int i18 = iArr[iL];
            f0VarArr[iL][i18] = f0VarB;
            iArr2[iL][i18] = iArrM;
            iArr[iL] = i18 + 1;
        }
        j1[] j1VarArr = new j1[a3VarArr.length];
        String[] strArr = new String[a3VarArr.length];
        int[] iArr3 = new int[a3VarArr.length];
        for (int i19 = 0; i19 < a3VarArr.length; i19++) {
            int i25 = iArr[i19];
            j1VarArr[i19] = new j1((f0[]) o0.O0(f0VarArr[i19], i25));
            iArr2[i19] = (int[][]) o0.O0(iArr2[i19], i25);
            strArr[i19] = a3VarArr[i19].getName();
            iArr3[i19] = a3VarArr[i19].g();
        }
        a aVar = new a(strArr, iArr3, j1VarArr, iArrN, iArr2, new j1((f0[]) o0.O0(f0VarArr[a3VarArr.length], iArr[a3VarArr.length])));
        Pair<b3[], r[]> pairO = o(aVar, iArr2, iArrN, bVar, e0Var);
        return new y((b3[]) pairO.first, (r[]) pairO.second, w.a(aVar, (v[]) pairO.second), aVar);
    }

    protected abstract Pair<b3[], r[]> o(a aVar, int[][][] iArr, int[] iArr2, c0.b bVar, e0 e0Var);
}
