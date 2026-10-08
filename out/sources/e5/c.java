package e5;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u001a%\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "start", "stop", "fraction", "b", "(FFF)F", "", "c", "(IIF)I", "x", "a", "(F)F", "ui-util"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    public static final float a(float f15) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f15)) & 8589934591L) / ((long) 3))) + 709952852);
        float f16 = fIntBitsToFloat - ((fIntBitsToFloat - (f15 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f16 - ((f16 - (f15 / (f16 * f16))) * 0.33333334f);
    }

    public static final float b(float f15, float f16, float f17) {
        return ((1 - f17) * f15) + (f17 * f16);
    }

    public static final int c(int i15, int i16, float f15) {
        return i15 + ((int) Math.round(((double) (i16 - i15)) * ((double) f15)));
    }
}
