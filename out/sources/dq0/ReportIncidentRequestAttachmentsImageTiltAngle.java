package dq0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: dq0.z, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, d2 = {"Ldq0/z;", "", "", "pitch", "roll", "yaw", "<init>", "(DDD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", ip.a.f96138c, "getPitch", "()D", "b", "getRoll", "c", "getYaw", "militaryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReportIncidentRequestAttachmentsImageTiltAngle {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pitch")
    private final double pitch;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("roll")
    private final double roll;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("yaw")
    private final double yaw;

    public ReportIncidentRequestAttachmentsImageTiltAngle(double d15, double d16, double d17) {
        this.pitch = d15;
        this.roll = d16;
        this.yaw = d17;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportIncidentRequestAttachmentsImageTiltAngle)) {
            return false;
        }
        ReportIncidentRequestAttachmentsImageTiltAngle reportIncidentRequestAttachmentsImageTiltAngle = (ReportIncidentRequestAttachmentsImageTiltAngle) other;
        return Double.compare(this.pitch, reportIncidentRequestAttachmentsImageTiltAngle.pitch) == 0 && Double.compare(this.roll, reportIncidentRequestAttachmentsImageTiltAngle.roll) == 0 && Double.compare(this.yaw, reportIncidentRequestAttachmentsImageTiltAngle.yaw) == 0;
    }

    public int hashCode() {
        return (((Double.hashCode(this.pitch) * 31) + Double.hashCode(this.roll)) * 31) + Double.hashCode(this.yaw);
    }

    public String toString() {
        return "ReportIncidentRequestAttachmentsImageTiltAngle(pitch=" + this.pitch + ", roll=" + this.roll + ", yaw=" + this.yaw + ')';
    }
}
