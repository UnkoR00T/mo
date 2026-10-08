package fw0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.r1, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0007¨\u0006\u001b"}, d2 = {"Lfw0/r1;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lfw0/a3;", "a", "Lfw0/a3;", "()Lfw0/a3;", "collisionStatus", "b", "Z", "()Z", "descriptionAuthor", "c", "Ljava/lang/String;", "processId", "d", "I", "workingCopyValidityDaysLeft", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StartedUserVehicleCollisionDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("collisionStatus")
    private final a3 collisionStatus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("descriptionAuthor")
    private final boolean descriptionAuthor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("processId")
    private final String processId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("workingCopyValidityDaysLeft")
    private final int workingCopyValidityDaysLeft;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a3 getCollisionStatus() {
        return this.collisionStatus;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDescriptionAuthor() {
        return this.descriptionAuthor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getProcessId() {
        return this.processId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getWorkingCopyValidityDaysLeft() {
        return this.workingCopyValidityDaysLeft;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartedUserVehicleCollisionDataDto)) {
            return false;
        }
        StartedUserVehicleCollisionDataDto startedUserVehicleCollisionDataDto = (StartedUserVehicleCollisionDataDto) other;
        return this.collisionStatus == startedUserVehicleCollisionDataDto.collisionStatus && this.descriptionAuthor == startedUserVehicleCollisionDataDto.descriptionAuthor && fr.t.c(this.processId, startedUserVehicleCollisionDataDto.processId) && this.workingCopyValidityDaysLeft == startedUserVehicleCollisionDataDto.workingCopyValidityDaysLeft;
    }

    public int hashCode() {
        return (((((this.collisionStatus.hashCode() * 31) + Boolean.hashCode(this.descriptionAuthor)) * 31) + this.processId.hashCode()) * 31) + Integer.hashCode(this.workingCopyValidityDaysLeft);
    }

    public String toString() {
        return "StartedUserVehicleCollisionDataDto(collisionStatus=" + this.collisionStatus + ", descriptionAuthor=" + this.descriptionAuthor + ", processId=" + this.processId + ", workingCopyValidityDaysLeft=" + this.workingCopyValidityDaysLeft + ')';
    }
}
