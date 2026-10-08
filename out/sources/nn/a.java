package nn;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b[] f137275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f137276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f137277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f137278d;

    a(int i15, int i16) {
        b[] bVarArr = new b[i15];
        this.f137275a = bVarArr;
        int length = bVarArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            this.f137275a[i17] = new b(((i16 + 4) * 17) + 1);
        }
        this.f137278d = i16 * 17;
        this.f137277c = i15;
        this.f137276b = -1;
    }

    b a() {
        return this.f137275a[this.f137276b];
    }

    public byte[][] b(int i15, int i16) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.f137277c * i16, this.f137278d * i15);
        int i17 = this.f137277c * i16;
        for (int i18 = 0; i18 < i17; i18++) {
            bArr[(i17 - i18) - 1] = this.f137275a[i18 / i16].b(i15);
        }
        return bArr;
    }

    void c() {
        this.f137276b++;
    }
}
