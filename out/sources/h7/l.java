package h7;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\t\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a4\u0010\u000e\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\r\u001a\u00060\u0005j\u0002`\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001e\u0010\u0010\u001a\u00060\u0005j\u0002`\u0006*\u00060\u0005j\u0002`\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\u001e\u0010\u001c\u001a\u00060\u0005j\u0002`\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u001a\u0010 \u001a\u00020\u00008\u0000X\u0080D¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u001a\u0010\"\u001a\u00020\u00008\u0000X\u0080D¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b!\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"", "x", "y", "c", "(FF)F", "Lr0/g;", "Landroidx/graphics/shapes/Point;", "b", "(FF)J", "angleRadians", "a", "(F)J", "radius", "center", "f", "(FFJ)J", "h", "(J)J", "i", "(F)F", "start", "stop", "fraction", "e", "(FFF)F", "J", "getZero", "()J", "Zero", "F", "d", "()F", "FloatPi", "getTwoPi", "TwoPi", "graphics-shapes_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f81321a = r0.g.b(0.0f, 0.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f81322b = 3.1415927f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f81323c = 6.2831855f;

    public static final long a(float f15) {
        double d15 = f15;
        return r0.g.b((float) Math.cos(d15), (float) Math.sin(d15));
    }

    public static final long b(float f15, float f16) {
        float fC = c(f15, f16);
        if (fC > 0.0f) {
            return r0.g.b(f15 / fC, f16 / fC);
        }
        throw new IllegalArgumentException("Required distance greater than zero");
    }

    public static final float c(float f15, float f16) {
        return (float) Math.sqrt((f15 * f15) + (f16 * f16));
    }

    public static final float d() {
        return f81322b;
    }

    public static final float e(float f15, float f16, float f17) {
        return ((1 - f17) * f15) + (f17 * f16);
    }

    public static final long f(float f15, float f16, long j15) {
        return f.k(f.l(a(f16), f15), j15);
    }

    public static /* synthetic */ long g(float f15, float f16, long j15, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            j15 = f81321a;
        }
        return f(f15, f16, j15);
    }

    public static final long h(long j15) {
        return r0.g.b(-f.h(j15), f.g(j15));
    }

    public static final float i(float f15) {
        return f15 * f15;
    }
}
