package fw0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.p3, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001a\u0010$\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006%"}, d2 = {"Lfw0/p3;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lfw0/f;", "a", "Lfw0/f;", "()Lfw0/f;", "basicData", "Lfw0/t;", "b", "Lfw0/t;", "()Lfw0/t;", "datesData", "Lfw0/v0;", "c", "Lfw0/v0;", "()Lfw0/v0;", "homologationData", "Lfw0/u1;", "d", "Lfw0/u1;", "()Lfw0/u1;", "statusData", "Lfw0/w1;", "e", "Lfw0/w1;", "()Lfw0/w1;", "technicalData", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("basicData")
    private final BasicDataDto basicData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("datesData")
    private final DatesDataDto datesData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("homologationData")
    private final HomologationDataDto homologationData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("statusData")
    private final StatusDataDto statusData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("technicalData")
    private final TechnicalDataDto technicalData;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BasicDataDto getBasicData() {
        return this.basicData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DatesDataDto getDatesData() {
        return this.datesData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final HomologationDataDto getHomologationData() {
        return this.homologationData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final StatusDataDto getStatusData() {
        return this.statusData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TechnicalDataDto getTechnicalData() {
        return this.technicalData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleDto)) {
            return false;
        }
        VehicleDto vehicleDto = (VehicleDto) other;
        return fr.t.c(this.basicData, vehicleDto.basicData) && fr.t.c(this.datesData, vehicleDto.datesData) && fr.t.c(this.homologationData, vehicleDto.homologationData) && fr.t.c(this.statusData, vehicleDto.statusData) && fr.t.c(this.technicalData, vehicleDto.technicalData);
    }

    public int hashCode() {
        return (((((((this.basicData.hashCode() * 31) + this.datesData.hashCode()) * 31) + this.homologationData.hashCode()) * 31) + this.statusData.hashCode()) * 31) + this.technicalData.hashCode();
    }

    public String toString() {
        return "VehicleDto(basicData=" + this.basicData + ", datesData=" + this.datesData + ", homologationData=" + this.homologationData + ", statusData=" + this.statusData + ", technicalData=" + this.technicalData + ')';
    }
}
