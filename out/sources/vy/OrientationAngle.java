package vy;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: vy.k, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lvy/k;", "", "", "azimuthDegrees", "pitchDegrees", "rollDegrees", "<init>", "(DDD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", ip.a.f96138c, "()D", "b", "c", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrientationAngle {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final double azimuthDegrees;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double pitchDegrees;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double rollDegrees;

    public OrientationAngle(double d15, double d16, double d17) {
        this.azimuthDegrees = d15;
        this.pitchDegrees = d16;
        this.rollDegrees = d17;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getAzimuthDegrees() {
        return this.azimuthDegrees;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getPitchDegrees() {
        return this.pitchDegrees;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getRollDegrees() {
        return this.rollDegrees;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrientationAngle)) {
            return false;
        }
        OrientationAngle orientationAngle = (OrientationAngle) other;
        return Double.compare(this.azimuthDegrees, orientationAngle.azimuthDegrees) == 0 && Double.compare(this.pitchDegrees, orientationAngle.pitchDegrees) == 0 && Double.compare(this.rollDegrees, orientationAngle.rollDegrees) == 0;
    }

    public int hashCode() {
        return (((Double.hashCode(this.azimuthDegrees) * 31) + Double.hashCode(this.pitchDegrees)) * 31) + Double.hashCode(this.rollDegrees);
    }

    public String toString() {
        return "OrientationAngle(azimuthDegrees=" + this.azimuthDegrees + ", pitchDegrees=" + this.pitchDegrees + ", rollDegrees=" + this.rollDegrees + ")";
    }
}
