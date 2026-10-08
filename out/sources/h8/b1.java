package h8;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public interface b1 {

    public static class a implements b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Random f81461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f81462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f81463c;

        public a(int i15) {
            this(i15, new Random());
        }

        private static int[] i(int i15, Random random) {
            int[] iArr = new int[i15];
            int i16 = 0;
            while (i16 < i15) {
                int i17 = i16 + 1;
                int iNextInt = random.nextInt(i17);
                iArr[i16] = iArr[iNextInt];
                iArr[iNextInt] = i16;
                i16 = i17;
            }
            return iArr;
        }

        @Override // h8.b1
        public int a() {
            return this.f81462b.length;
        }

        @Override // h8.b1
        public int b(int i15) {
            int i16 = this.f81463c[i15] - 1;
            if (i16 >= 0) {
                return this.f81462b[i16];
            }
            return -1;
        }

        @Override // h8.b1
        public int c(int i15) {
            int i16 = this.f81463c[i15] + 1;
            int[] iArr = this.f81462b;
            if (i16 < iArr.length) {
                return iArr[i16];
            }
            return -1;
        }

        @Override // h8.b1
        public int d() {
            int[] iArr = this.f81462b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // h8.b1
        public b1 e() {
            return new a(0, new Random(this.f81461a.nextLong()));
        }

        @Override // h8.b1
        public int g() {
            int[] iArr = this.f81462b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // h8.b1
        public b1 h(int i15, int i16) {
            int[] iArr = new int[i16];
            int[] iArr2 = new int[i16];
            int i17 = 0;
            int i18 = 0;
            while (i18 < i16) {
                iArr[i18] = this.f81461a.nextInt(this.f81462b.length + 1);
                int i19 = i18 + 1;
                int iNextInt = this.f81461a.nextInt(i19);
                iArr2[i18] = iArr2[iNextInt];
                iArr2[iNextInt] = i18 + i15;
                i18 = i19;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f81462b.length + i16];
            int i25 = 0;
            int i26 = 0;
            while (true) {
                int[] iArr4 = this.f81462b;
                if (i17 >= iArr4.length + i16) {
                    return new a(iArr3, new Random(this.f81461a.nextLong()));
                }
                if (i25 >= i16 || i26 != iArr[i25]) {
                    int i27 = i26 + 1;
                    int i28 = iArr4[i26];
                    iArr3[i17] = i28;
                    if (i28 >= i15) {
                        iArr3[i17] = i28 + i16;
                    }
                    i26 = i27;
                } else {
                    iArr3[i17] = iArr2[i25];
                    i25++;
                }
                i17++;
            }
        }

        private a(int i15, Random random) {
            this(i(i15, random), random);
        }

        private a(int[] iArr, Random random) {
            this.f81462b = iArr;
            this.f81461a = random;
            this.f81463c = new int[iArr.length];
            for (int i15 = 0; i15 < iArr.length; i15++) {
                this.f81463c[iArr[i15]] = i15;
            }
        }
    }

    int a();

    int b(int i15);

    int c(int i15);

    int d();

    b1 e();

    default b1 f(int i15, int i16) {
        return e().h(0, i15);
    }

    int g();

    b1 h(int i15, int i16);
}
