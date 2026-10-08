package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f34985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f34986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f34987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f34988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f34989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f34990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f34991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final float f34992h;

    public a(int i15, float f15, float f16, float f17, int i16, float f18, int i17, float f19, int i18, float f25) {
        this.f34985a = i15;
        this.f34986b = c6.a.a(f15, f16, f17);
        this.f34987c = i16;
        this.f34989e = f18;
        this.f34988d = i17;
        this.f34990f = f19;
        this.f34991g = i18;
        d(f25, f16, f17, f19);
        this.f34992h = b(f19);
    }

    private float a(float f15, int i15, float f16, int i16, int i17) {
        if (i15 <= 0) {
            f16 = 0.0f;
        }
        float f17 = i16 / 2.0f;
        return (f15 - ((i15 + f17) * f16)) / (i17 + f17);
    }

    private float b(float f15) {
        if (g()) {
            return Math.abs(f15 - this.f34990f) * this.f34985a;
        }
        return Float.MAX_VALUE;
    }

    public static a c(float f15, float f16, float f17, float f18, int[] iArr, float f19, int[] iArr2, float f25, int[] iArr3) {
        a aVar = null;
        int i15 = 1;
        for (int i16 : iArr3) {
            int length = iArr2.length;
            int i17 = 0;
            while (i17 < length) {
                int i18 = iArr2[i17];
                int length2 = iArr.length;
                int i19 = 0;
                while (i19 < length2) {
                    int i25 = length;
                    int i26 = i17;
                    int i27 = i15;
                    int i28 = length2;
                    int i29 = i19;
                    a aVar2 = new a(i27, f16, f17, f18, iArr[i19], f19, i18, f25, i16, f15);
                    if (aVar == null || aVar2.f34992h < aVar.f34992h) {
                        if (aVar2.f34992h == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    int i35 = i27 + 1;
                    i19 = i29 + 1;
                    i17 = i26;
                    i15 = i35;
                    length = i25;
                    length2 = i28;
                }
                i17++;
                i15 = i15;
                length = length;
            }
        }
        return aVar;
    }

    private void d(float f15, float f16, float f17, float f18) {
        float f19 = f15 - f();
        int i15 = this.f34987c;
        if (i15 > 0 && f19 > 0.0f) {
            float f25 = this.f34986b;
            this.f34986b = f25 + Math.min(f19 / i15, f17 - f25);
        } else if (i15 > 0 && f19 < 0.0f) {
            float f26 = this.f34986b;
            this.f34986b = f26 + Math.max(f19 / i15, f16 - f26);
        }
        int i16 = this.f34987c;
        float f27 = i16 > 0 ? this.f34986b : 0.0f;
        this.f34986b = f27;
        float fA = a(f15, i16, f27, this.f34988d, this.f34991g);
        this.f34990f = fA;
        float f28 = (this.f34986b + fA) / 2.0f;
        this.f34989e = f28;
        int i17 = this.f34988d;
        if (i17 <= 0 || fA == f18) {
            return;
        }
        float f29 = (f18 - fA) * this.f34991g;
        float fMin = Math.min(Math.abs(f29), f28 * 0.1f * i17);
        if (f29 > 0.0f) {
            this.f34989e -= fMin / this.f34988d;
            this.f34990f += fMin / this.f34991g;
        } else {
            this.f34989e += fMin / this.f34988d;
            this.f34990f -= fMin / this.f34991g;
        }
    }

    private float f() {
        return (this.f34990f * this.f34991g) + (this.f34989e * this.f34988d) + (this.f34986b * this.f34987c);
    }

    private boolean g() {
        int i15 = this.f34991g;
        if (i15 <= 0 || this.f34987c <= 0 || this.f34988d <= 0) {
            return i15 <= 0 || this.f34987c <= 0 || this.f34990f > this.f34986b;
        }
        float f15 = this.f34990f;
        float f16 = this.f34989e;
        return f15 > f16 && f16 > this.f34986b;
    }

    int e() {
        return this.f34987c + this.f34988d + this.f34991g;
    }

    public String toString() {
        return "Arrangement [priority=" + this.f34985a + ", smallCount=" + this.f34987c + ", smallSize=" + this.f34986b + ", mediumCount=" + this.f34988d + ", mediumSize=" + this.f34989e + ", largeCount=" + this.f34991g + ", largeSize=" + this.f34990f + ", cost=" + this.f34992h + "]";
    }
}
