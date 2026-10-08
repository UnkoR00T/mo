package td;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
public class c {
    private static float a(float f15) {
        return f15 <= 0.04045f ? f15 / 12.92f : (float) Math.pow((f15 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float b(float f15) {
        return f15 <= 0.0031308f ? f15 * 12.92f : (float) ((Math.pow(f15, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int c(float f15, int i15, int i16) {
        if (i15 == i16 || f15 <= 0.0f) {
            return i15;
        }
        if (f15 >= 1.0f) {
            return i16;
        }
        float f16 = ((i15 >> 24) & GF2Field.MASK) / 255.0f;
        float f17 = ((i15 >> 16) & GF2Field.MASK) / 255.0f;
        float f18 = ((i15 >> 8) & GF2Field.MASK) / 255.0f;
        float f19 = (i15 & GF2Field.MASK) / 255.0f;
        float f25 = ((i16 >> 24) & GF2Field.MASK) / 255.0f;
        float f26 = ((i16 >> 16) & GF2Field.MASK) / 255.0f;
        float f27 = ((i16 >> 8) & GF2Field.MASK) / 255.0f;
        float f28 = (i16 & GF2Field.MASK) / 255.0f;
        float fA = a(f17);
        float fA2 = a(f18);
        float fA3 = a(f19);
        float fA4 = a(f26);
        float f29 = f16 + ((f25 - f16) * f15);
        float fA5 = fA2 + ((a(f27) - fA2) * f15);
        float fA6 = fA3 + (f15 * (a(f28) - fA3));
        return (Math.round(b(fA + ((fA4 - fA) * f15)) * 255.0f) << 16) | (Math.round(f29 * 255.0f) << 24) | (Math.round(b(fA5) * 255.0f) << 8) | Math.round(b(fA6) * 255.0f);
    }
}
