package p114t0;

import c5.d;
import p071kotlin.Metadata;
import u0.c0;
import u0.e0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "splinePositions", "splineTimes", "", "nbSamples", "Loq/i0;", "b", "([F[FI)V", "T", "Lc5/d;", "density", "Lu0/c0;", "c", "(Lc5/d;)Lu0/c0;", "animation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(float[] fArr, float[] fArr2, int i15) {
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29 = 0.0f;
        int i16 = 0;
        float f35 = 0.0f;
        while (true) {
            float f36 = 1.0f;
            if (i16 >= i15) {
                fArr2[i15] = 1.0f;
                fArr[i15] = 1.0f;
                return;
            }
            float f37 = i16 / i15;
            float f38 = 1.0f;
            while (true) {
                f15 = ((f38 - f29) / 2.0f) + f29;
                f16 = f36 - f15;
                f17 = f15 * 3.0f * f16;
                f18 = f15 * f15 * f15;
                float f39 = (((f16 * 0.175f) + (f15 * 0.35000002f)) * f17) + f18;
                f19 = f36;
                if (Math.abs(f39 - f37) < 1.0E-5d) {
                    break;
                }
                if (f39 > f37) {
                    f38 = f15;
                } else {
                    f29 = f15;
                }
                f36 = f19;
            }
            float f45 = 0.5f;
            fArr[i16] = (f17 * ((f16 * 0.5f) + f15)) + f18;
            float f46 = f19;
            while (true) {
                f25 = ((f46 - f35) / 2.0f) + f35;
                f26 = f19 - f25;
                f27 = f25 * 3.0f * f26;
                f28 = f25 * f25 * f25;
                float f47 = (((f26 * f45) + f25) * f27) + f28;
                float f48 = f37;
                if (Math.abs(f47 - f37) >= 1.0E-5d) {
                    if (f47 > f48) {
                        f46 = f25;
                    } else {
                        f35 = f25;
                    }
                    f37 = f48;
                    f45 = 0.5f;
                }
            }
            fArr2[i16] = (f27 * ((f26 * 0.175f) + (f25 * 0.35000002f))) + f28;
            i16++;
        }
    }

    public static final <T> c0<T> c(d dVar) {
        return e0.d(new c1(dVar));
    }
}
