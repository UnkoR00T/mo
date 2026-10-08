package i24;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: i24.n, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Li24/n;", "", "", "changeStatusCode", "changeStatusDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DrivingLicenceStatusChangedReason {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String changeStatusCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String changeStatusDescription;

    public DrivingLicenceStatusChangedReason(String str, String str2) {
        this.changeStatusCode = str;
        this.changeStatusDescription = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getChangeStatusCode() {
        return this.changeStatusCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getChangeStatusDescription() {
        return this.changeStatusDescription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrivingLicenceStatusChangedReason)) {
            return false;
        }
        DrivingLicenceStatusChangedReason drivingLicenceStatusChangedReason = (DrivingLicenceStatusChangedReason) other;
        return fr.t.c(this.changeStatusCode, drivingLicenceStatusChangedReason.changeStatusCode) && fr.t.c(this.changeStatusDescription, drivingLicenceStatusChangedReason.changeStatusDescription);
    }

    public int hashCode() {
        String str = this.changeStatusCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.changeStatusDescription;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DrivingLicenceStatusChangedReason(changeStatusCode=" + this.changeStatusCode + ", changeStatusDescription=" + this.changeStatusDescription + ")";
    }
}
