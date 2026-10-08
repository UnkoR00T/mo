package g9;

import o8.q;
import w7.c0;

/* JADX INFO: loaded from: classes3.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f71362a = new c0(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f71363b;

    private long a(q qVar) {
        int i15 = 0;
        qVar.p(this.f71362a.f(), 0, 1);
        int i16 = this.f71362a.f()[0] & 255;
        if (i16 == 0) {
            return Long.MIN_VALUE;
        }
        int i17 = 128;
        int i18 = 0;
        while ((i16 & i17) == 0) {
            i17 >>= 1;
            i18++;
        }
        int i19 = i16 & (~i17);
        qVar.p(this.f71362a.f(), 1, i18);
        while (i15 < i18) {
            i15++;
            i19 = (this.f71362a.f()[i15] & 255) + (i19 << 8);
        }
        this.f71363b += i18 + 1;
        return i19;
    }

    public boolean b(q qVar) {
        long jA = qVar.a();
        long j15 = 1024;
        if (jA != -1 && jA <= 1024) {
            j15 = jA;
        }
        int i15 = (int) j15;
        qVar.p(this.f71362a.f(), 0, 4);
        long jS = this.f71362a.S();
        this.f71363b = 4;
        while (jS != 440786851) {
            int i16 = this.f71363b + 1;
            this.f71363b = i16;
            if (i16 == i15) {
                return false;
            }
            qVar.p(this.f71362a.f(), 0, 1);
            jS = ((jS << 8) & (-256)) | ((long) (this.f71362a.f()[0] & 255));
        }
        long jA2 = a(qVar);
        long j16 = this.f71363b;
        if (jA2 != Long.MIN_VALUE && (jA == -1 || j16 + jA2 < jA)) {
            while (true) {
                int i17 = this.f71363b;
                long j17 = j16 + jA2;
                if (i17 < j17) {
                    if (a(qVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jA3 = a(qVar);
                    if (jA3 < 0 || jA3 > 2147483647L) {
                        return false;
                    }
                    if (jA3 != 0) {
                        int i18 = (int) jA3;
                        qVar.k(i18);
                        this.f71363b += i18;
                    }
                } else if (i17 == j17) {
                    return true;
                }
            }
        }
        return false;
    }
}
