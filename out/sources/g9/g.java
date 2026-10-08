package g9;

import o8.q;

/* JADX INFO: loaded from: classes3.dex */
final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f71364d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f71365a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f71366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f71367c;

    public static long a(byte[] bArr, int i15, boolean z15) {
        long j15 = ((long) bArr[0]) & 255;
        if (z15) {
            j15 &= ~f71364d[i15 - 1];
        }
        for (int i16 = 1; i16 < i15; i16++) {
            j15 = (j15 << 8) | (((long) bArr[i16]) & 255);
        }
        return j15;
    }

    public static int c(int i15) {
        int i16 = 0;
        while (true) {
            long[] jArr = f71364d;
            if (i16 >= jArr.length) {
                return -1;
            }
            if ((jArr[i16] & ((long) i15)) != 0) {
                return i16 + 1;
            }
            i16++;
        }
    }

    public int b() {
        return this.f71367c;
    }

    public long d(q qVar, boolean z15, boolean z16, int i15) {
        if (this.f71366b == 0) {
            if (!qVar.h(this.f71365a, 0, 1, z15)) {
                return -1L;
            }
            int iC = c(this.f71365a[0] & 255);
            this.f71367c = iC;
            if (iC == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f71366b = 1;
        }
        int i16 = this.f71367c;
        if (i16 > i15) {
            this.f71366b = 0;
            return -2L;
        }
        if (i16 != 1) {
            qVar.readFully(this.f71365a, 1, i16 - 1);
        }
        this.f71366b = 0;
        return a(this.f71365a, this.f71367c, z16);
    }

    public void e() {
        this.f71366b = 0;
        this.f71367c = 0;
    }
}
