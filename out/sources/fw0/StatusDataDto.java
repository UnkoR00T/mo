package fw0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.u1, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001a\u0010\u000e¨\u0006\u001c"}, d2 = {"Lfw0/u1;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "civilLiabilityInsurance", "Lfw0/m1;", "b", "Lfw0/m1;", "()Lfw0/m1;", "registrationStatus", "Lfw0/n1;", "c", "Lfw0/n1;", "()Lfw0/n1;", "reportStatus", "d", "validVehicleTechnicalInspection", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StatusDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("civilLiabilityInsurance")
    private final boolean civilLiabilityInsurance;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("registrationStatus")
    private final m1 registrationStatus;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("reportStatus")
    private final n1 reportStatus;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("validVehicleTechnicalInspection")
    private final boolean validVehicleTechnicalInspection;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCivilLiabilityInsurance() {
        return this.civilLiabilityInsurance;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final m1 getRegistrationStatus() {
        return this.registrationStatus;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final n1 getReportStatus() {
        return this.reportStatus;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getValidVehicleTechnicalInspection() {
        return this.validVehicleTechnicalInspection;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusDataDto)) {
            return false;
        }
        StatusDataDto statusDataDto = (StatusDataDto) other;
        return this.civilLiabilityInsurance == statusDataDto.civilLiabilityInsurance && this.registrationStatus == statusDataDto.registrationStatus && this.reportStatus == statusDataDto.reportStatus && this.validVehicleTechnicalInspection == statusDataDto.validVehicleTechnicalInspection;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.civilLiabilityInsurance) * 31) + this.registrationStatus.hashCode()) * 31) + this.reportStatus.hashCode()) * 31) + Boolean.hashCode(this.validVehicleTechnicalInspection);
    }

    public String toString() {
        return "StatusDataDto(civilLiabilityInsurance=" + this.civilLiabilityInsurance + ", registrationStatus=" + this.registrationStatus + ", reportStatus=" + this.reportStatus + ", validVehicleTechnicalInspection=" + this.validVehicleTechnicalInspection + ')';
    }
}
