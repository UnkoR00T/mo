package w5;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f210222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f210223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f210224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f210225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f210226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f210227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f210228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f210229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f210230i;

    a(float f15, float f16, float f17, float f18, float f19, float f25, float f26, float f27, float f28) {
        this.f210222a = f15;
        this.f210223b = f16;
        this.f210224c = f17;
        this.f210225d = f18;
        this.f210226e = f19;
        this.f210227f = f25;
        this.f210228g = f26;
        this.f210229h = f27;
        this.f210230i = f28;
    }

    private static a b(float f15, float f16, float f17) {
        float f18 = 100.0f;
        float f19 = 1000.0f;
        float f25 = 0.0f;
        a aVar = null;
        float f26 = 1000.0f;
        while (Math.abs(f25 - f18) > 0.01f) {
            float f27 = ((f18 - f25) / 2.0f) + f25;
            int iP = e(f27, f16, f15).p();
            float fB = b.b(iP);
            float fAbs = Math.abs(f17 - fB);
            if (fAbs < 0.2f) {
                a aVarC = c(iP);
                float fA = aVarC.a(e(aVarC.k(), aVarC.i(), f15));
                if (fA <= 1.0f) {
                    aVar = aVarC;
                    f19 = fAbs;
                    f26 = fA;
                }
            }
            if (f19 == 0.0f && f26 == 0.0f) {
                return aVar;
            }
            if (fB < f17) {
                f25 = f27;
            } else {
                f18 = f27;
            }
        }
        return aVar;
    }

    static a c(int i15) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        d(i15, l.f210267k, fArr, fArr2);
        return new a(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    static void d(int i15, l lVar, float[] fArr, float[] fArr2) {
        b.f(i15, fArr2);
        float[][] fArr3 = b.f210231a;
        float f15 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f16 = fArr4[0] * f15;
        float f17 = fArr2[1];
        float f18 = f16 + (fArr4[1] * f17);
        float f19 = fArr2[2];
        float f25 = f18 + (fArr4[2] * f19);
        float[] fArr5 = fArr3[1];
        float f26 = (fArr5[0] * f15) + (fArr5[1] * f17) + (fArr5[2] * f19);
        float[] fArr6 = fArr3[2];
        float f27 = (f15 * fArr6[0]) + (f17 * fArr6[1]) + (f19 * fArr6[2]);
        float f28 = lVar.i()[0] * f25;
        float f29 = lVar.i()[1] * f26;
        float f35 = lVar.i()[2] * f27;
        float fPow = (float) Math.pow(((double) (lVar.c() * Math.abs(f28))) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (lVar.c() * Math.abs(f29))) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (lVar.c() * Math.abs(f35))) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f28) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f29) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f35) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d15 = fSignum3;
        float f36 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d15)) / 11.0f;
        float f37 = ((float) (((double) (fSignum + fSignum2)) - (d15 * 2.0d))) / 9.0f;
        float f38 = fSignum2 * 20.0f;
        float f39 = (((fSignum * 20.0f) + f38) + (21.0f * fSignum3)) / 20.0f;
        float f45 = (((fSignum * 40.0f) + f38) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f37, f36)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f46 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f45 * lVar.f()) / lVar.a(), lVar.b() * lVar.j())) * 100.0f;
        float fB = (4.0f / lVar.b()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (lVar.a() + 4.0f) * lVar.d();
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.g()) * lVar.h()) * ((float) Math.sqrt((f36 * f36) + (f37 * f37)))) / (f39 + 0.305f), 0.9d));
        float fSqrt = ((float) Math.sqrt(((double) fPow4) / 100.0d)) * fPow5;
        float fD = lVar.d() * fSqrt;
        float fSqrt2 = ((float) Math.sqrt((fPow5 * lVar.b()) / (lVar.a() + 4.0f))) * 50.0f;
        float f47 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fD) + 1.0f)) * 43.85965f;
        double d16 = f46;
        float fCos = ((float) Math.cos(d16)) * fLog;
        float fSin = fLog * ((float) Math.sin(d16));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = fB;
            fArr[2] = fD;
            fArr[3] = fSqrt2;
            fArr[4] = f47;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    private static a e(float f15, float f16, float f17) {
        return f(f15, f16, f17, l.f210267k);
    }

    private static a f(float f15, float f16, float f17, l lVar) {
        double d15 = ((double) f15) / 100.0d;
        float fB = (4.0f / lVar.b()) * ((float) Math.sqrt(d15)) * (lVar.a() + 4.0f) * lVar.d();
        float fD = lVar.d() * f16;
        float fSqrt = ((float) Math.sqrt(((f16 / ((float) Math.sqrt(d15))) * lVar.b()) / (lVar.a() + 4.0f))) * 50.0f;
        float f18 = (1.7f * f15) / ((0.007f * f15) + 1.0f);
        float fLog = ((float) Math.log((((double) fD) * 0.0228d) + 1.0d)) * 43.85965f;
        double d16 = (3.1415927f * f17) / 180.0f;
        return new a(f17, f16, f15, fB, fD, fSqrt, f18, ((float) Math.cos(d16)) * fLog, fLog * ((float) Math.sin(d16)));
    }

    public static int m(float f15, float f16, float f17) {
        return n(f15, f16, f17, l.f210267k);
    }

    static int n(float f15, float f16, float f17, l lVar) {
        if (f16 < 1.0d || Math.round(f17) <= 0.0d || Math.round(f17) >= 100.0d) {
            return b.a(f17);
        }
        float fMin = f15 < 0.0f ? 0.0f : Math.min(360.0f, f15);
        a aVar = null;
        boolean z15 = true;
        float f18 = 0.0f;
        float f19 = f16;
        while (Math.abs(f18 - f16) >= 0.4f) {
            a aVarB = b(fMin, f19, f17);
            if (!z15) {
                if (aVarB == null) {
                    f16 = f19;
                } else {
                    f18 = f19;
                    aVar = aVarB;
                }
                f19 = ((f16 - f18) / 2.0f) + f18;
            } else {
                if (aVarB != null) {
                    return aVarB.o(lVar);
                }
                f19 = ((f16 - f18) / 2.0f) + f18;
                z15 = false;
            }
        }
        return aVar == null ? b.a(f17) : aVar.o(lVar);
    }

    float a(a aVar) {
        float fL = l() - aVar.l();
        float fG = g() - aVar.g();
        float fH = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((fL * fL) + (fG * fG) + (fH * fH)), 0.63d) * 1.41d);
    }

    float g() {
        return this.f210229h;
    }

    float h() {
        return this.f210230i;
    }

    float i() {
        return this.f210223b;
    }

    float j() {
        return this.f210222a;
    }

    float k() {
        return this.f210224c;
    }

    float l() {
        return this.f210228g;
    }

    int o(l lVar) {
        float fPow = (float) Math.pow(((double) ((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(((double) k()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, lVar.e()), 0.73d), 1.1111111111111112d);
        double dJ = (j() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dJ) + 3.8d)) * 0.25f;
        float fA = lVar.a() * ((float) Math.pow(((double) k()) / 100.0d, (1.0d / ((double) lVar.b())) / ((double) lVar.j())));
        float fG = fCos * 3846.1538f * lVar.g() * lVar.h();
        float f15 = fA / lVar.f();
        float fSin = (float) Math.sin(dJ);
        float fCos2 = (float) Math.cos(dJ);
        float f16 = (((0.305f + f15) * 23.0f) * fPow) / (((fG * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f17 = fCos2 * f16;
        float f18 = f16 * fSin;
        float f19 = f15 * 460.0f;
        float f25 = (((451.0f * f17) + f19) + (288.0f * f18)) / 1403.0f;
        float f26 = ((f19 - (891.0f * f17)) - (261.0f * f18)) / 1403.0f;
        float f27 = ((f19 - (f17 * 220.0f)) - (f18 * 6300.0f)) / 1403.0f;
        float fSignum = Math.signum(f25) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f25)) * 27.13d) / (400.0d - ((double) Math.abs(f25)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f26) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f26)) * 27.13d) / (400.0d - ((double) Math.abs(f26)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f27) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f27)) * 27.13d) / (400.0d - ((double) Math.abs(f27)))), 2.380952380952381d));
        float f28 = fSignum / lVar.i()[0];
        float f29 = fSignum2 / lVar.i()[1];
        float f35 = fSignum3 / lVar.i()[2];
        float[][] fArr = b.f210232b;
        float[] fArr2 = fArr[0];
        float f36 = (fArr2[0] * f28) + (fArr2[1] * f29) + (fArr2[2] * f35);
        float[] fArr3 = fArr[1];
        float f37 = (fArr3[0] * f28) + (fArr3[1] * f29) + (fArr3[2] * f35);
        float[] fArr4 = fArr[2];
        return x5.c.b(f36, f37, (f28 * fArr4[0]) + (f29 * fArr4[1]) + (f35 * fArr4[2]));
    }

    int p() {
        return o(l.f210267k);
    }
}
