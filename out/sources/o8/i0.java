package o8;

import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f143107a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f143108b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f143109c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f143110d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f143111e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f143112f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f143113g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f143114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f143115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f143116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f143117d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f143118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f143119f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f143120g;

        public a() {
        }

        public boolean a(int i15) {
            int i16;
            int i17;
            int i18;
            int i19;
            if (!i0.l(i15) || (i16 = (i15 >>> 19) & 3) == 1 || (i17 = (i15 >>> 17) & 3) == 0 || (i18 = (i15 >>> 12) & 15) == 0 || i18 == 15 || (i19 = (i15 >>> 10) & 3) == 3) {
                return false;
            }
            this.f143114a = i16;
            this.f143115b = i0.f143107a[3 - i17];
            int i25 = i0.f143108b[i19];
            this.f143117d = i25;
            if (i16 == 2) {
                this.f143117d = i25 / 2;
            } else if (i16 == 0) {
                this.f143117d = i25 / 4;
            }
            int i26 = (i15 >>> 9) & 1;
            this.f143120g = i0.k(i16, i17);
            if (i17 == 3) {
                int i27 = i16 == 3 ? i0.f143109c[i18 - 1] : i0.f143110d[i18 - 1];
                this.f143119f = i27;
                this.f143116c = (((i27 * 12) / this.f143117d) + i26) * 4;
            } else {
                if (i16 == 3) {
                    int i28 = i17 == 2 ? i0.f143111e[i18 - 1] : i0.f143112f[i18 - 1];
                    this.f143119f = i28;
                    this.f143116c = ((i28 * 144) / this.f143117d) + i26;
                } else {
                    int i29 = i0.f143113g[i18 - 1];
                    this.f143119f = i29;
                    this.f143116c = (((i17 == 1 ? 72 : 144) * i29) / this.f143117d) + i26;
                }
            }
            this.f143118e = ((i15 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }

        public a(a aVar) {
            this.f143114a = aVar.f143114a;
            this.f143115b = aVar.f143115b;
            this.f143116c = aVar.f143116c;
            this.f143117d = aVar.f143117d;
            this.f143118e = aVar.f143118e;
            this.f143119f = aVar.f143119f;
            this.f143120g = aVar.f143120g;
        }
    }

    public static int j(int i15) {
        int i16;
        int i17;
        int i18;
        int i19;
        int i25;
        if (!l(i15) || (i16 = (i15 >>> 19) & 3) == 1 || (i17 = (i15 >>> 17) & 3) == 0 || (i18 = (i15 >>> 12) & 15) == 0 || i18 == 15 || (i19 = (i15 >>> 10) & 3) == 3) {
            return -1;
        }
        int i26 = f143108b[i19];
        if (i16 == 2) {
            i26 /= 2;
        } else if (i16 == 0) {
            i26 /= 4;
        }
        int i27 = (i15 >>> 9) & 1;
        if (i17 == 3) {
            return ((((i16 == 3 ? f143109c[i18 - 1] : f143110d[i18 - 1]) * 12) / i26) + i27) * 4;
        }
        if (i16 == 3) {
            i25 = i17 == 2 ? f143111e[i18 - 1] : f143112f[i18 - 1];
        } else {
            i25 = f143113g[i18 - 1];
        }
        if (i16 == 3) {
            return ((i25 * 144) / i26) + i27;
        }
        return (((i17 == 1 ? 72 : 144) * i25) / i26) + i27;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i15, int i16) {
        if (i16 == 1) {
            return i15 == 3 ? 1152 : 576;
        }
        if (i16 == 2) {
            return 1152;
        }
        if (i16 == 3) {
            return MLKEMEngine.KyberPolyBytes;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(int i15) {
        return (i15 & (-2097152)) == -2097152;
    }

    public static int m(int i15) {
        int i16;
        int i17;
        if (!l(i15) || (i16 = (i15 >>> 19) & 3) == 1 || (i17 = (i15 >>> 17) & 3) == 0) {
            return -1;
        }
        int i18 = (i15 >>> 12) & 15;
        int i19 = (i15 >>> 10) & 3;
        if (i18 == 0 || i18 == 15 || i19 == 3) {
            return -1;
        }
        return k(i16, i17);
    }
}
