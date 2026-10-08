package m3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "", "digits", "", "a", "(FI)Ljava/lang/String;", "ui-geometry"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    public static final String a(float f15, int i15) {
        if (Float.isNaN(f15)) {
            return "NaN";
        }
        if (Float.isInfinite(f15)) {
            return f15 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(i15, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f16 = f15 * fPow;
        int i16 = (int) f16;
        if (f16 - i16 >= 0.5f) {
            i16++;
        }
        float f17 = i16 / fPow;
        return iMax > 0 ? String.valueOf(f17) : String.valueOf((int) f17);
    }
}
