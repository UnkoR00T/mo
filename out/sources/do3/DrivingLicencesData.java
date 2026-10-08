package do3;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: do3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Ldo3/a;", "", "", "hasDrivingLicence", "hasActiveTemporaryDrivingLicence", "hasInvalidatedTemporaryDrivingLicences", "<init>", "(ZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "c", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DrivingLicencesData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasDrivingLicence;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasActiveTemporaryDrivingLicence;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasInvalidatedTemporaryDrivingLicences;

    public DrivingLicencesData(boolean z15, boolean z16, boolean z17) {
        this.hasDrivingLicence = z15;
        this.hasActiveTemporaryDrivingLicence = z16;
        this.hasInvalidatedTemporaryDrivingLicences = z17;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getHasActiveTemporaryDrivingLicence() {
        return this.hasActiveTemporaryDrivingLicence;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getHasDrivingLicence() {
        return this.hasDrivingLicence;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getHasInvalidatedTemporaryDrivingLicences() {
        return this.hasInvalidatedTemporaryDrivingLicences;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrivingLicencesData)) {
            return false;
        }
        DrivingLicencesData drivingLicencesData = (DrivingLicencesData) other;
        return this.hasDrivingLicence == drivingLicencesData.hasDrivingLicence && this.hasActiveTemporaryDrivingLicence == drivingLicencesData.hasActiveTemporaryDrivingLicence && this.hasInvalidatedTemporaryDrivingLicences == drivingLicencesData.hasInvalidatedTemporaryDrivingLicences;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.hasDrivingLicence) * 31) + Boolean.hashCode(this.hasActiveTemporaryDrivingLicence)) * 31) + Boolean.hashCode(this.hasInvalidatedTemporaryDrivingLicences);
    }

    public String toString() {
        return "DrivingLicencesData(hasDrivingLicence=" + this.hasDrivingLicence + ", hasActiveTemporaryDrivingLicence=" + this.hasActiveTemporaryDrivingLicence + ", hasInvalidatedTemporaryDrivingLicences=" + this.hasInvalidatedTemporaryDrivingLicences + ')';
    }
}
