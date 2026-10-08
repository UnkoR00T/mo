package w5;

/* JADX INFO: loaded from: classes.dex */
final class l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final l f210267k = k(b.f210233c, (float) ((((double) b.h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f210268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f210269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f210270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f210271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f210272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f210273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f210274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f210275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f210276i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f210277j;

    private l(float f15, float f16, float f17, float f18, float f19, float f25, float[] fArr, float f26, float f27, float f28) {
        this.f210273f = f15;
        this.f210268a = f16;
        this.f210269b = f17;
        this.f210270c = f18;
        this.f210271d = f19;
        this.f210272e = f25;
        this.f210274g = fArr;
        this.f210275h = f26;
        this.f210276i = f27;
        this.f210277j = f28;
    }

    static l k(float[] fArr, float f15, float f16, float f17, boolean z15) {
        float[][] fArr2 = b.f210231a;
        float f18 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f19 = fArr3[0] * f18;
        float f25 = fArr[1];
        float f26 = f19 + (fArr3[1] * f25);
        float f27 = fArr[2];
        float f28 = f26 + (fArr3[2] * f27);
        float[] fArr4 = fArr2[1];
        float f29 = (fArr4[0] * f18) + (fArr4[1] * f25) + (fArr4[2] * f27);
        float[] fArr5 = fArr2[2];
        float f35 = (f18 * fArr5[0]) + (f25 * fArr5[1]) + (f27 * fArr5[2]);
        float f36 = (f17 / 10.0f) + 0.8f;
        float fD = ((double) f36) >= 0.9d ? b.d(0.59f, 0.69f, (f36 - 0.9f) * 10.0f) : b.d(0.525f, 0.59f, (f36 - 0.8f) * 10.0f);
        float fExp = z15 ? 1.0f : (1.0f - (((float) Math.exp(((-f15) - 42.0f) / 92.0f)) * 0.2777778f)) * f36;
        double d15 = fExp;
        if (d15 > 1.0d) {
            fExp = 1.0f;
        } else if (d15 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f28) * fExp) + 1.0f) - fExp, (((100.0f / f29) * fExp) + 1.0f) - fExp, (((100.0f / f35) * fExp) + 1.0f) - fExp};
        float f37 = 1.0f / ((5.0f * f15) + 1.0f);
        float f38 = f37 * f37 * f37 * f37;
        float f39 = 1.0f - f38;
        float fCbrt = (f38 * f15) + (0.1f * f39 * f39 * ((float) Math.cbrt(((double) f15) * 5.0d)));
        float fH = b.h(f16) / fArr[1];
        double d16 = fH;
        float fSqrt = ((float) Math.sqrt(d16)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d16, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f28)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f29)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f35)) / 100.0d, 0.42d)};
        float f45 = fArr7[0];
        float f46 = (f45 * 400.0f) / (f45 + 27.13f);
        float f47 = fArr7[1];
        float f48 = (f47 * 400.0f) / (f47 + 27.13f);
        float f49 = fArr7[2];
        float[] fArr8 = {f46, f48, (400.0f * f49) / (f49 + 27.13f)};
        return new l(fH, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * fPow, fPow, fPow, fD, f36, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    float a() {
        return this.f210268a;
    }

    float b() {
        return this.f210271d;
    }

    float c() {
        return this.f210275h;
    }

    float d() {
        return this.f210276i;
    }

    float e() {
        return this.f210273f;
    }

    float f() {
        return this.f210269b;
    }

    float g() {
        return this.f210272e;
    }

    float h() {
        return this.f210270c;
    }

    float[] i() {
        return this.f210274g;
    }

    float j() {
        return this.f210277j;
    }
}
