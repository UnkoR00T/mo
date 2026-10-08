package fw0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.x1, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006 "}, d2 = {"Lfw0/x1;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lfw0/a3;", "a", "Lfw0/a3;", "()Lfw0/a3;", "collisionStatus", "b", "Ljava/lang/String;", "latitude", "c", "localizationDescription", "d", "longitude", "e", "processId", "f", "statementNumber", "g", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "workingCopyValidityDaysLeft", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserVehicleCollisionDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("collisionStatus")
    private final a3 collisionStatus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("latitude")
    private final String latitude;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("localizationDescription")
    private final String localizationDescription;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("longitude")
    private final String longitude;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("processId")
    private final String processId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("statementNumber")
    private final String statementNumber;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("workingCopyValidityDaysLeft")
    private final Integer workingCopyValidityDaysLeft;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a3 getCollisionStatus() {
        return this.collisionStatus;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLocalizationDescription() {
        return this.localizationDescription;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getProcessId() {
        return this.processId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserVehicleCollisionDataDto)) {
            return false;
        }
        UserVehicleCollisionDataDto userVehicleCollisionDataDto = (UserVehicleCollisionDataDto) other;
        return this.collisionStatus == userVehicleCollisionDataDto.collisionStatus && fr.t.c(this.latitude, userVehicleCollisionDataDto.latitude) && fr.t.c(this.localizationDescription, userVehicleCollisionDataDto.localizationDescription) && fr.t.c(this.longitude, userVehicleCollisionDataDto.longitude) && fr.t.c(this.processId, userVehicleCollisionDataDto.processId) && fr.t.c(this.statementNumber, userVehicleCollisionDataDto.statementNumber) && fr.t.c(this.workingCopyValidityDaysLeft, userVehicleCollisionDataDto.workingCopyValidityDaysLeft);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStatementNumber() {
        return this.statementNumber;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getWorkingCopyValidityDaysLeft() {
        return this.workingCopyValidityDaysLeft;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.collisionStatus.hashCode() * 31) + this.latitude.hashCode()) * 31) + this.localizationDescription.hashCode()) * 31) + this.longitude.hashCode()) * 31) + this.processId.hashCode()) * 31;
        String str = this.statementNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.workingCopyValidityDaysLeft;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "UserVehicleCollisionDataDto(collisionStatus=" + this.collisionStatus + ", latitude=" + this.latitude + ", localizationDescription=" + this.localizationDescription + ", longitude=" + this.longitude + ", processId=" + this.processId + ", statementNumber=" + this.statementNumber + ", workingCopyValidityDaysLeft=" + this.workingCopyValidityDaysLeft + ')';
    }
}
