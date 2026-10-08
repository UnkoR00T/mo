package o8;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f143000a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f143001b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f143002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f143003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f143004c;

        private b(int i15, int i16, String str) {
            this.f143002a = i15;
            this.f143003b = i16;
            this.f143004c = str;
        }
    }

    public static byte[] a(int i15, int i16, int i17) {
        return new byte[]{(byte) (((i15 << 3) & 248) | ((i16 >> 1) & 7)), (byte) (((i16 << 7) & 128) | ((i17 << 3) & 120))};
    }

    private static int b(w7.b0 b0Var) {
        int iH = b0Var.h(5);
        return iH == 31 ? b0Var.h(6) + 32 : iH;
    }

    private static int c(w7.b0 b0Var) throws t7.x {
        int iH = b0Var.h(4);
        if (iH == 15) {
            if (b0Var.b() >= 24) {
                return b0Var.h(24);
            }
            throw t7.x.a("AAC header insufficient data", null);
        }
        if (iH < 13) {
            return f143000a[iH];
        }
        throw t7.x.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static b d(w7.b0 b0Var, boolean z15) throws t7.x {
        int iB = b(b0Var);
        int iC = c(b0Var);
        int iH = b0Var.h(4);
        String str = "mp4a.40." + iB;
        if (iB == 5 || iB == 29) {
            iC = c(b0Var);
            iB = b(b0Var);
            if (iB == 22) {
                iH = b0Var.h(4);
            }
        }
        if (z15) {
            if (iB != 1 && iB != 2 && iB != 3 && iB != 4 && iB != 6 && iB != 7 && iB != 17) {
                switch (iB) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw t7.x.c("Unsupported audio object type: " + iB);
                }
            }
            f(b0Var, iB, iH);
            switch (iB) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iH2 = b0Var.h(2);
                    if (iH2 == 2 || iH2 == 3) {
                        throw t7.x.c("Unsupported epConfig: " + iH2);
                    }
                    break;
            }
        }
        int i15 = f143001b[iH];
        if (i15 != -1) {
            return new b(iC, i15, str);
        }
        throw t7.x.a(null, null);
    }

    public static b e(byte[] bArr) {
        return d(new w7.b0(bArr), false);
    }

    private static void f(w7.b0 b0Var, int i15, int i16) {
        if (b0Var.g()) {
            w7.t.h("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (b0Var.g()) {
            b0Var.r(14);
        }
        boolean zG = b0Var.g();
        if (i16 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i15 == 6 || i15 == 20) {
            b0Var.r(3);
        }
        if (zG) {
            if (i15 == 22) {
                b0Var.r(16);
            }
            if (i15 == 17 || i15 == 19 || i15 == 20 || i15 == 23) {
                b0Var.r(3);
            }
            b0Var.r(1);
        }
    }
}
