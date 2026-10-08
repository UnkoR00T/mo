package p114t0;

import c5.d;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016¨\u0006\u001b"}, d2 = {"Lt0/h0;", "", "", "friction", "Lc5/d;", "density", "<init>", "(FLc5/d;)V", "a", "(Lc5/d;)F", "velocity", "", "e", "(F)D", "", "c", "(F)J", "b", "(F)F", "Lt0/h0$a;", "d", "(F)Lt0/h0$a;", "F", "Lc5/d;", "getDensity", "()Lc5/d;", "magicPhysicalCoefficient", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float friction;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d density;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float magicPhysicalCoefficient;

    /* JADX INFO: renamed from: t0.h0$a, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lt0/h0$a;", "", "", "initialVelocity", "distance", "", "duration", "<init>", "(FFJ)V", "time", "a", "(J)F", "b", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getInitialVelocity", "()F", "getDistance", "c", "J", "getDuration", "()J", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FlingInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final float initialVelocity;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final float distance;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long duration;

        public FlingInfo(float f15, float f16, long j15) {
            this.initialVelocity = f15;
            this.distance = f16;
            this.duration = j15;
        }

        public final float a(long time) {
            long j15 = this.duration;
            return this.distance * Math.signum(this.initialVelocity) * a.f186151a.b(j15 > 0 ? time / j15 : 1.0f).getDistanceCoefficient();
        }

        public final float b(long time) {
            long j15 = this.duration;
            return (((a.f186151a.b(j15 > 0 ? time / j15 : 1.0f).getVelocityCoefficient() * Math.signum(this.initialVelocity)) * this.distance) / this.duration) * 1000.0f;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FlingInfo)) {
                return false;
            }
            FlingInfo flingInfo = (FlingInfo) other;
            return Float.compare(this.initialVelocity, flingInfo.initialVelocity) == 0 && Float.compare(this.distance, flingInfo.distance) == 0 && this.duration == flingInfo.duration;
        }

        public int hashCode() {
            return (((Float.hashCode(this.initialVelocity) * 31) + Float.hashCode(this.distance)) * 31) + Long.hashCode(this.duration);
        }

        public String toString() {
            return "FlingInfo(initialVelocity=" + this.initialVelocity + ", distance=" + this.distance + ", duration=" + this.duration + ')';
        }
    }

    public h0(float f15, d dVar) {
        this.friction = f15;
        this.density = dVar;
        this.magicPhysicalCoefficient = a(dVar);
    }

    private final float a(d density) {
        return i0.c(0.84f, density.getDensity());
    }

    private final double e(float velocity) {
        return a.f186151a.a(velocity, this.friction * this.magicPhysicalCoefficient);
    }

    public final float b(float velocity) {
        return (float) (((double) (this.friction * this.magicPhysicalCoefficient)) * Math.exp((((double) i0.f186321a) / (((double) i0.f186321a) - 1.0d)) * e(velocity)));
    }

    public final long c(float velocity) {
        return (long) (Math.exp(e(velocity) / (((double) i0.f186321a) - 1.0d)) * 1000.0d);
    }

    public final FlingInfo d(float velocity) {
        double dE = e(velocity);
        double d15 = ((double) i0.f186321a) - 1.0d;
        return new FlingInfo(velocity, (float) (((double) (this.friction * this.magicPhysicalCoefficient)) * Math.exp((((double) i0.f186321a) / d15) * dE)), (long) (Math.exp(dE / d15) * 1000.0d));
    }
}
