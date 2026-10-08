package u0;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0005R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R*\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\r\u0010\u0010\"\u0004\b\u0017\u0010\u0005R$\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0019\u0010\u0005¨\u0006\u001b"}, d2 = {"Lu0/p1;", "", "", "finalPosition", "<init>", "(F)V", "lastDisplacement", "lastVelocity", "", "timeElapsed", "Lu0/c1;", "f", "(FFJ)J", "a", "F", "getFinalPosition", "()F", "d", "", "b", ip.a.f96138c, "naturalFreq", "value", "c", "dampingRatio", "e", "stiffness", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float finalPosition;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private double naturalFreq = Math.sqrt(50.0d);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float dampingRatio = 1.0f;

    public p1(float f15) {
        this.finalPosition = f15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float b() {
        double d15 = this.naturalFreq;
        return (float) (d15 * d15);
    }

    public final void c(float f15) {
        if (f15 < 0.0f) {
            h1.a("Damping ratio must be non-negative");
        }
        this.dampingRatio = f15;
    }

    public final void d(float f15) {
        this.finalPosition = f15;
    }

    public final void e(float f15) {
        if (b() <= 0.0f) {
            h1.a("Spring stiffness constant must be positive.");
        }
        this.naturalFreq = Math.sqrt(f15);
    }

    public final long f(float lastDisplacement, float lastVelocity, long timeElapsed) {
        double dExp;
        double dExp2;
        float f15 = lastDisplacement - this.finalPosition;
        double d15 = timeElapsed / 1000.0d;
        float f16 = this.dampingRatio;
        double d16 = ((double) f16) * ((double) f16);
        double d17 = this.naturalFreq;
        double d18 = ((double) (-f16)) * d17;
        if (f16 > 1.0f) {
            double dSqrt = d17 * Math.sqrt(d16 - ((double) 1));
            double d19 = d18 + dSqrt;
            double d25 = d18 - dSqrt;
            double d26 = f15;
            double d27 = ((d25 * d26) - ((double) lastVelocity)) / (d25 - d19);
            double d28 = d26 - d27;
            double d29 = d25 * d15;
            double d35 = d15 * d19;
            dExp2 = (Math.exp(d29) * d28) + (Math.exp(d35) * d27);
            dExp = (d28 * d25 * Math.exp(d29)) + (d27 * d19 * Math.exp(d35));
        } else if (f16 == 1.0f) {
            double d36 = f15;
            double d37 = ((double) lastVelocity) + (d17 * d36);
            double d38 = (-d17) * d15;
            double d39 = d36 + (d15 * d37);
            dExp2 = d39 * Math.exp(d38);
            dExp = (d39 * Math.exp(d38) * (-this.naturalFreq)) + (d37 * Math.exp(d38));
        } else {
            double d45 = 1;
            double dSqrt2 = d17 * Math.sqrt(d45 - d16);
            double d46 = f15;
            double d47 = (d45 / dSqrt2) * (((-d18) * d46) + ((double) lastVelocity));
            double d48 = dSqrt2 * d15;
            double d49 = d15 * d18;
            double dExp3 = Math.exp(d49) * ((Math.cos(d48) * d46) + (Math.sin(d48) * d47));
            dExp = (d18 * dExp3) + (Math.exp(d49) * (((-dSqrt2) * d46 * Math.sin(d48)) + (dSqrt2 * d47 * Math.cos(d48))));
            dExp2 = dExp3;
        }
        return c1.a((((long) Float.floatToRawIntBits((float) dExp)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits((float) (dExp2 + ((double) this.finalPosition))) << 32));
    }
}
