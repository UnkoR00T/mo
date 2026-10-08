package kn;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f111460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f111461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f111462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f111463d;

    public e(CharSequence charSequence, int i15, int i16) {
        this.f111460a = charSequence;
        this.f111462c = i15;
        this.f111461b = i16;
        byte[] bArr = new byte[i15 * i16];
        this.f111463d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    private void a(int i15) {
        f(this.f111461b - 1, 0, i15, 1);
        f(this.f111461b - 1, 1, i15, 2);
        f(this.f111461b - 1, 2, i15, 3);
        f(0, this.f111462c - 2, i15, 4);
        f(0, this.f111462c - 1, i15, 5);
        f(1, this.f111462c - 1, i15, 6);
        f(2, this.f111462c - 1, i15, 7);
        f(3, this.f111462c - 1, i15, 8);
    }

    private void b(int i15) {
        f(this.f111461b - 3, 0, i15, 1);
        f(this.f111461b - 2, 0, i15, 2);
        f(this.f111461b - 1, 0, i15, 3);
        f(0, this.f111462c - 4, i15, 4);
        f(0, this.f111462c - 3, i15, 5);
        f(0, this.f111462c - 2, i15, 6);
        f(0, this.f111462c - 1, i15, 7);
        f(1, this.f111462c - 1, i15, 8);
    }

    private void c(int i15) {
        f(this.f111461b - 3, 0, i15, 1);
        f(this.f111461b - 2, 0, i15, 2);
        f(this.f111461b - 1, 0, i15, 3);
        f(0, this.f111462c - 2, i15, 4);
        f(0, this.f111462c - 1, i15, 5);
        f(1, this.f111462c - 1, i15, 6);
        f(2, this.f111462c - 1, i15, 7);
        f(3, this.f111462c - 1, i15, 8);
    }

    private void d(int i15) {
        f(this.f111461b - 1, 0, i15, 1);
        f(this.f111461b - 1, this.f111462c - 1, i15, 2);
        f(0, this.f111462c - 3, i15, 3);
        f(0, this.f111462c - 2, i15, 4);
        f(0, this.f111462c - 1, i15, 5);
        f(1, this.f111462c - 3, i15, 6);
        f(1, this.f111462c - 2, i15, 7);
        f(1, this.f111462c - 1, i15, 8);
    }

    private void f(int i15, int i16, int i17, int i18) {
        if (i15 < 0) {
            int i19 = this.f111461b;
            i15 += i19;
            i16 += 4 - ((i19 + 4) % 8);
        }
        if (i16 < 0) {
            int i25 = this.f111462c;
            i16 += i25;
            i15 += 4 - ((i25 + 4) % 8);
        }
        i(i16, i15, (this.f111460a.charAt(i17) & (1 << (8 - i18))) != 0);
    }

    private boolean g(int i15, int i16) {
        return this.f111463d[(i16 * this.f111462c) + i15] < 0;
    }

    private void i(int i15, int i16, boolean z15) {
        this.f111463d[(i16 * this.f111462c) + i15] = z15 ? (byte) 1 : (byte) 0;
    }

    private void j(int i15, int i16, int i17) {
        int i18 = i15 - 2;
        int i19 = i16 - 2;
        f(i18, i19, i17, 1);
        int i25 = i16 - 1;
        f(i18, i25, i17, 2);
        int i26 = i15 - 1;
        f(i26, i19, i17, 3);
        f(i26, i25, i17, 4);
        f(i26, i16, i17, 5);
        f(i15, i19, i17, 6);
        f(i15, i25, i17, 7);
        f(i15, i16, i17, 8);
    }

    public final boolean e(int i15, int i16) {
        return this.f111463d[(i16 * this.f111462c) + i15] == 1;
    }

    public final void h() {
        int i15;
        int i16;
        int i17 = 0;
        int i18 = 0;
        int i19 = 4;
        while (true) {
            if (i19 == this.f111461b && i17 == 0) {
                a(i18);
                i18++;
            }
            if (i19 == this.f111461b - 2 && i17 == 0 && this.f111462c % 4 != 0) {
                b(i18);
                i18++;
            }
            if (i19 == this.f111461b - 2 && i17 == 0 && this.f111462c % 8 == 4) {
                c(i18);
                i18++;
            }
            if (i19 == this.f111461b + 4 && i17 == 2 && this.f111462c % 8 == 0) {
                d(i18);
                i18++;
            }
            while (true) {
                if (i19 < this.f111461b && i17 >= 0 && g(i17, i19)) {
                    j(i19, i17, i18);
                    i18++;
                }
                int i25 = i19 - 2;
                int i26 = i17 + 2;
                if (i25 < 0 || i26 >= this.f111462c) {
                    break;
                }
                i19 = i25;
                i17 = i26;
            }
            int i27 = i19 - 1;
            int i28 = i17 + 5;
            while (true) {
                if (i27 >= 0 && i28 < this.f111462c && g(i28, i27)) {
                    j(i27, i28, i18);
                    i18++;
                }
                int i29 = i27 + 2;
                int i35 = i28 - 2;
                i15 = this.f111461b;
                if (i29 >= i15 || i35 < 0) {
                    break;
                }
                i27 = i29;
                i28 = i35;
            }
            i19 = i27 + 5;
            i17 = i28 - 1;
            if (i19 >= i15 && i17 >= (i16 = this.f111462c)) {
                break;
            }
        }
        if (g(i16 - 1, i15 - 1)) {
            i(this.f111462c - 1, this.f111461b - 1, true);
            i(this.f111462c - 2, this.f111461b - 2, true);
        }
    }
}
