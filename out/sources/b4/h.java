package b4;

import a4.PointerInputChange;
import p071kotlin.Metadata;
import pq.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\u0012\u001a\u00020\u0003*\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a9\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a/\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u001b\u0010\"\u001a\u00020\u0010*\u00020\u00142\u0006\u0010!\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\"\u0010#\"(\u0010+\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b!\u0010$\u0012\u0004\b)\u0010*\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(*\f\b\u0002\u0010,\"\u00020\u00142\u00020\u0014*\u0018\b\u0002\u0010-\"\b\u0012\u0004\u0012\u00020\u00140\n2\b\u0012\u0004\u0012\u00020\u00140\n¨\u0006."}, d2 = {"Lb4/g;", "La4/b0;", "event", "Loq/i0;", "c", "(Lb4/g;La4/b0;)V", "Lm3/e;", "offset", "d", "(Lb4/g;La4/b0;J)V", "", "Lb4/a;", "", "index", "", "time", "", "dataPoint", "i", "([Lb4/a;IJF)V", "", "x", "y", "sampleCount", "degree", "coefficients", "h", "([F[FII[F)[F", "dataPoints", "", "isDataDifferential", "e", "([F[FIZ)F", "a", "f", "([F[F)F", "Z", "g", "()Z", "setVelocityTrackerAddPointsFix", "(Z)V", "getVelocityTrackerAddPointsFix$annotations", "()V", "VelocityTrackerAddPointsFix", "Vector", "Matrix", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f16492a = true;

    public static final void c(g gVar, PointerInputChange pointerInputChange) {
        d(gVar, pointerInputChange, m3.e.INSTANCE.c());
    }

    public static final void d(g gVar, PointerInputChange pointerInputChange, long j15) {
        gVar.getPlatformVelocityTracker().d(pointerInputChange, j15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(float[] fArr, float[] fArr2, int i15, boolean z15) {
        int i16 = i15 - 1;
        float f15 = fArr2[i16];
        float fSignum = 0.0f;
        int i17 = i16;
        while (i17 > 0) {
            int i18 = i17 - 1;
            float f16 = fArr2[i18];
            if (f15 != f16) {
                float f17 = (z15 ? -fArr[i18] : fArr[i17] - fArr[i18]) / (f15 - f16);
                fSignum += (f17 - (Math.signum(fSignum) * ((float) Math.sqrt(2 * Math.abs(fSignum))))) * Math.abs(f17);
                if (i17 == i16) {
                    fSignum *= 0.5f;
                }
            }
            i17--;
            f15 = f16;
        }
        return Math.signum(fSignum) * ((float) Math.sqrt(2 * Math.abs(fSignum)));
    }

    private static final float f(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f15 = 0.0f;
        for (int i15 = 0; i15 < length; i15++) {
            f15 += fArr[i15] * fArr2[i15];
        }
        return f15;
    }

    public static final boolean g() {
        return f16492a;
    }

    public static final float[] h(float[] fArr, float[] fArr2, int i15, int i16, float[] fArr3) {
        int i17 = i16;
        if (i17 < 1) {
            d4.a.a("The degree must be at positive integer");
        }
        if (i15 == 0) {
            d4.a.a("At least one point must be provided");
        }
        if (i17 >= i15) {
            i17 = i15 - 1;
        }
        int i18 = i17 + 1;
        float[][] fArr4 = new float[i18][];
        for (int i19 = 0; i19 < i18; i19++) {
            fArr4[i19] = new float[i15];
        }
        for (int i25 = 0; i25 < i15; i25++) {
            fArr4[0][i25] = 1.0f;
            for (int i26 = 1; i26 < i18; i26++) {
                fArr4[i26][i25] = fArr4[i26 - 1][i25] * fArr[i25];
            }
        }
        float[][] fArr5 = new float[i18][];
        for (int i27 = 0; i27 < i18; i27++) {
            fArr5[i27] = new float[i15];
        }
        float[][] fArr6 = new float[i18][];
        for (int i28 = 0; i28 < i18; i28++) {
            fArr6[i28] = new float[i18];
        }
        int i29 = 0;
        while (i29 < i18) {
            float[] fArr7 = fArr5[i29];
            n.k(fArr4[i29], fArr7, 0, 0, i15);
            for (int i35 = 0; i35 < i29; i35++) {
                float[] fArr8 = fArr5[i35];
                float f15 = f(fArr7, fArr8);
                for (int i36 = 0; i36 < i15; i36++) {
                    fArr7[i36] = fArr7[i36] - (fArr8[i36] * f15);
                }
            }
            float fSqrt = (float) Math.sqrt(f(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f16 = 1.0f / fSqrt;
            for (int i37 = 0; i37 < i15; i37++) {
                fArr7[i37] = fArr7[i37] * f16;
            }
            float[] fArr9 = fArr6[i29];
            int i38 = 0;
            while (i38 < i18) {
                fArr9[i38] = i38 < i29 ? 0.0f : f(fArr7, fArr4[i38]);
                i38++;
            }
            i29++;
        }
        for (int i39 = i17; -1 < i39; i39--) {
            float f17 = f(fArr5[i39], fArr2);
            float[] fArr10 = fArr6[i39];
            int i45 = i39 + 1;
            if (i45 <= i17) {
                int i46 = i17;
                while (true) {
                    f17 -= fArr10[i46] * fArr3[i46];
                    if (i46 != i45) {
                        i46--;
                    }
                }
            }
            fArr3[i39] = f17 / fArr10[i39];
        }
        return fArr3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(DataPointAtTime[] dataPointAtTimeArr, int i15, long j15, float f15) {
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i15];
        if (dataPointAtTime == null) {
            dataPointAtTimeArr[i15] = new DataPointAtTime(j15, f15);
        } else {
            dataPointAtTime.d(j15);
            dataPointAtTime.c(f15);
        }
    }
}
