package u0;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: u0.a0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0004\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018¨\u0006\u001d"}, d2 = {"Lu0/a0;", "Lu0/g0;", "", "a", "b", "c", "d", "<init>", "(FFFF)V", "fraction", "Loq/i0;", "(F)V", "(F)F", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "F", "e", "min", "f", "max", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CubicBezierEasing implements g0 {
    private final float a;
    private final float b;
    private final float c;
    private final float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float min;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float max;

    public CubicBezierEasing(float f15, float f16, float f17, float f18) {
        this.a = f15;
        this.b = f16;
        this.c = f17;
        this.d = f18;
        if (!((Float.isNaN(f15) || Float.isNaN(f16) || Float.isNaN(f17) || Float.isNaN(f18)) ? false : true)) {
            h1.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f15 + ", " + f16 + ", " + f17 + ", " + f18 + '.');
        }
        long jB = n3.z0.b(0.0f, f16, f18, 1.0f, new float[5], 0);
        this.min = Float.intBitsToFloat((int) (jB >> 32));
        this.max = Float.intBitsToFloat((int) (jB & BodyPartID.bodyIdMax));
    }

    private final void b(float fraction) {
        throw new IllegalArgumentException("The cubic curve with parameters (" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ") has no solution at " + fraction);
    }

    @Override // u0.g0
    public float a(float fraction) {
        if (fraction > 0.0f && fraction < 1.0f) {
            float fMax = Math.max(fraction, 1.1920929E-7f);
            float fE = n3.z0.e(0.0f - fMax, this.a - fMax, this.c - fMax, 1.0f - fMax);
            if (Float.isNaN(fE)) {
                b(fraction);
            }
            fraction = n3.z0.c(this.b, this.d, fE);
            float f15 = this.min;
            float f16 = this.max;
            if (fraction < f15) {
                fraction = f15;
            }
            if (fraction > f16) {
                return f16;
            }
        }
        return fraction;
    }

    public boolean equals(Object other) {
        if (!(other instanceof CubicBezierEasing)) {
            return false;
        }
        CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) other;
        return this.a == cubicBezierEasing.a && this.b == cubicBezierEasing.b && this.c == cubicBezierEasing.c && this.d == cubicBezierEasing.d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.a) * 31) + Float.hashCode(this.b)) * 31) + Float.hashCode(this.c)) * 31) + Float.hashCode(this.d);
    }

    public String toString() {
        return "CubicBezierEasing(a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ')';
    }
}
