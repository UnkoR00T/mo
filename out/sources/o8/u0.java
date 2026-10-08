package o8;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f143203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f143204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f143205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f143206d;

    public u0(byte[] bArr) {
        this.f143203a = bArr;
        this.f143204b = bArr.length;
    }

    private void a() {
        int i15;
        int i16 = this.f143205c;
        zj.p.w(i16 >= 0 && (i16 < (i15 = this.f143204b) || (i16 == i15 && this.f143206d == 0)));
    }

    public int b() {
        return (this.f143205c * 8) + this.f143206d;
    }

    public boolean c() {
        boolean z15 = (((this.f143203a[this.f143205c] & 255) >> this.f143206d) & 1) == 1;
        e(1);
        return z15;
    }

    public int d(int i15) {
        int i16 = this.f143205c;
        int iMin = Math.min(i15, 8 - this.f143206d);
        int i17 = i16 + 1;
        int i18 = ((this.f143203a[i16] & 255) >> this.f143206d) & (GF2Field.MASK >> (8 - iMin));
        while (iMin < i15) {
            i18 |= (this.f143203a[i17] & 255) << iMin;
            iMin += 8;
            i17++;
        }
        int i19 = i18 & ((-1) >>> (32 - i15));
        e(i15);
        return i19;
    }

    public void e(int i15) {
        int i16 = i15 / 8;
        int i17 = this.f143205c + i16;
        this.f143205c = i17;
        int i18 = this.f143206d + (i15 - (i16 * 8));
        this.f143206d = i18;
        if (i18 > 7) {
            this.f143205c = i17 + 1;
            this.f143206d = i18 - 8;
        }
        a();
    }
}
