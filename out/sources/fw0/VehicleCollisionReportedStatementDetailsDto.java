package fw0;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.f3, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0017\u0010\u0004¨\u0006\u001a"}, d2 = {"Lfw0/f3;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "insurerId", "c", "insurerName", "Ljava/time/OffsetDateTime;", "Ljava/time/OffsetDateTime;", "e", "()Ljava/time/OffsetDateTime;", "reportAcceptanceDate", "d", "fillFormClaimUrl", "phoneNumber", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleCollisionReportedStatementDetailsDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("insurerId")
    private final String insurerId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("insurerName")
    private final String insurerName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("reportAcceptanceDate")
    private final OffsetDateTime reportAcceptanceDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fillFormClaimUrl")
    private final String fillFormClaimUrl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("phoneNumber")
    private final String phoneNumber;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFillFormClaimUrl() {
        return this.fillFormClaimUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInsurerId() {
        return this.insurerId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getInsurerName() {
        return this.insurerName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final OffsetDateTime getReportAcceptanceDate() {
        return this.reportAcceptanceDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleCollisionReportedStatementDetailsDto)) {
            return false;
        }
        VehicleCollisionReportedStatementDetailsDto vehicleCollisionReportedStatementDetailsDto = (VehicleCollisionReportedStatementDetailsDto) other;
        return fr.t.c(this.insurerId, vehicleCollisionReportedStatementDetailsDto.insurerId) && fr.t.c(this.insurerName, vehicleCollisionReportedStatementDetailsDto.insurerName) && fr.t.c(this.reportAcceptanceDate, vehicleCollisionReportedStatementDetailsDto.reportAcceptanceDate) && fr.t.c(this.fillFormClaimUrl, vehicleCollisionReportedStatementDetailsDto.fillFormClaimUrl) && fr.t.c(this.phoneNumber, vehicleCollisionReportedStatementDetailsDto.phoneNumber);
    }

    public int hashCode() {
        int iHashCode = ((((this.insurerId.hashCode() * 31) + this.insurerName.hashCode()) * 31) + this.reportAcceptanceDate.hashCode()) * 31;
        String str = this.fillFormClaimUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phoneNumber;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VehicleCollisionReportedStatementDetailsDto(insurerId=" + this.insurerId + ", insurerName=" + this.insurerName + ", reportAcceptanceDate=" + this.reportAcceptanceDate + ", fillFormClaimUrl=" + this.fillFormClaimUrl + ", phoneNumber=" + this.phoneNumber + ')';
    }
}
