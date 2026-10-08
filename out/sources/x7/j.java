package x7;

import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f217265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f217266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f217267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f217268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f217269e;

    public j(byte[] bArr, int i15, int i16) {
        j(bArr, i15, i16);
    }

    private void a() {
        int i15;
        int i16 = this.f217268d;
        p.w(i16 >= 0 && (i16 < (i15 = this.f217266b) || (i16 == i15 && this.f217269e == 0)));
    }

    private int g() {
        int i15 = 0;
        while (!e()) {
            i15++;
        }
        return ((1 << i15) - 1) + (i15 > 0 ? f(i15) : 0);
    }

    private boolean k(int i15) {
        int i16 = i15 - 2;
        if (this.f217267c > i16 || i15 >= this.f217266b) {
            return false;
        }
        byte[] bArr = this.f217265a;
        return bArr[i15] == 3 && bArr[i16] == 0 && bArr[i15 - 1] == 0;
    }

    public void b() {
        int i15 = this.f217269e;
        if (i15 > 0) {
            m(8 - i15);
        }
    }

    public boolean c(int i15) {
        int i16 = this.f217268d;
        int i17 = i15 / 8;
        int i18 = i16 + i17;
        int i19 = (this.f217269e + i15) - (i17 * 8);
        if (i19 > 7) {
            i18++;
            i19 -= 8;
        }
        while (true) {
            i16++;
            if (i16 > i18 || i18 > this.f217266b) {
                break;
            }
            if (k(i16)) {
                i18++;
                i16 += 2;
            }
        }
        int i25 = this.f217266b;
        if (i18 >= i25) {
            return i18 == i25 && i19 == 0;
        }
        return true;
    }

    public boolean d() {
        int i15 = this.f217268d;
        int i16 = this.f217269e;
        int i17 = 0;
        while (this.f217268d < this.f217266b && !e()) {
            i17++;
        }
        boolean z15 = this.f217268d == this.f217266b;
        this.f217268d = i15;
        this.f217269e = i16;
        return !z15 && c((i17 * 2) + 1);
    }

    public boolean e() {
        boolean z15 = (this.f217265a[this.f217268d] & (128 >> this.f217269e)) != 0;
        l();
        return z15;
    }

    public int f(int i15) {
        int i16;
        this.f217269e += i15;
        int i17 = 0;
        while (true) {
            i16 = this.f217269e;
            int i18 = 2;
            if (i16 <= 8) {
                break;
            }
            int i19 = i16 - 8;
            this.f217269e = i19;
            byte[] bArr = this.f217265a;
            int i25 = this.f217268d;
            i17 |= (bArr[i25] & 255) << i19;
            if (!k(i25 + 1)) {
                i18 = 1;
            }
            this.f217268d = i25 + i18;
        }
        byte[] bArr2 = this.f217265a;
        int i26 = this.f217268d;
        int i27 = ((-1) >>> (32 - i15)) & (i17 | ((bArr2[i26] & 255) >> (8 - i16)));
        if (i16 == 8) {
            this.f217269e = 0;
            this.f217268d = i26 + (k(i26 + 1) ? 2 : 1);
        }
        a();
        return i27;
    }

    public int h() {
        int iG = g();
        return (iG % 2 == 0 ? -1 : 1) * ((iG + 1) / 2);
    }

    public int i() {
        return g();
    }

    public void j(byte[] bArr, int i15, int i16) {
        this.f217265a = bArr;
        this.f217267c = i15;
        this.f217268d = i15;
        this.f217266b = i16;
        this.f217269e = 0;
        a();
    }

    public void l() {
        int i15 = this.f217269e + 1;
        this.f217269e = i15;
        if (i15 == 8) {
            this.f217269e = 0;
            int i16 = this.f217268d;
            this.f217268d = i16 + (k(i16 + 1) ? 2 : 1);
        }
        a();
    }

    public void m(int i15) {
        int i16 = this.f217268d;
        int i17 = i15 / 8;
        int i18 = i16 + i17;
        this.f217268d = i18;
        int i19 = this.f217269e + (i15 - (i17 * 8));
        this.f217269e = i19;
        if (i19 > 7) {
            this.f217268d = i18 + 1;
            this.f217269e = i19 - 8;
        }
        while (true) {
            i16++;
            if (i16 > this.f217268d) {
                a();
                return;
            } else if (k(i16)) {
                this.f217268d++;
                i16 += 2;
            }
        }
    }
}
