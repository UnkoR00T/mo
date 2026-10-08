package so;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f182802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f182803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f182804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f182805d;

    private static class b implements Comparator<int[]>, c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f182806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int[][] f182807b;

        private b() {
        }

        @Override // so.t.c
        public void a(i0 i0Var) {
            int iN = i0Var.N();
            this.f182806a = i0Var.N() / 6;
            i0Var.N();
            i0Var.N();
            this.f182807b = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iN, 3);
            for (int i15 = 0; i15 < iN; i15++) {
                int iN2 = i0Var.N();
                int iN3 = i0Var.N();
                short sE = i0Var.E();
                int[] iArr = this.f182807b[i15];
                iArr[0] = iN2;
                iArr[1] = iN3;
                iArr[2] = sE;
            }
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            int i15 = iArr[0];
            int i16 = iArr2[0];
            if (i15 < i16) {
                return -1;
            }
            if (i15 > i16) {
                return 1;
            }
            int i17 = iArr[1];
            int i18 = iArr2[1];
            if (i17 < i18) {
                return -1;
            }
            return i17 > i18 ? 1 : 0;
        }
    }

    private interface c {
        void a(i0 i0Var);
    }

    t() {
    }

    private static int a(int i15, int i16, int i17) {
        return (i15 & i16) >> i17;
    }

    private static boolean b(int i15, int i16, int i17) {
        return a(i15, i16, i17) != 0;
    }

    private void d(i0 i0Var) throws IOException {
        if (i0Var.N() != 0) {
            return;
        }
        int iN = i0Var.N();
        if (iN < 6) {
            throw new IOException("Kerning sub-table too short, got " + iN + " bytes, expect 6 or more.");
        }
        int iN2 = i0Var.N();
        if (b(iN2, 1, 0)) {
            this.f182802a = true;
        }
        if (b(iN2, 2, 1)) {
            this.f182803b = true;
        }
        if (b(iN2, 4, 2)) {
            this.f182804c = true;
        }
        int iA = a(iN2, 65280, 8);
        if (iA == 0) {
            e(i0Var);
        } else if (iA == 2) {
            f(i0Var);
        }
    }

    private void e(i0 i0Var) {
        b bVar = new b();
        this.f182805d = bVar;
        bVar.a(i0Var);
    }

    private void f(i0 i0Var) {
    }

    private void g(i0 i0Var) {
    }

    void c(i0 i0Var, int i15) throws IOException {
        if (i15 == 0) {
            d(i0Var);
        } else {
            if (i15 != 1) {
                throw new IllegalStateException();
            }
            g(i0Var);
        }
    }
}
