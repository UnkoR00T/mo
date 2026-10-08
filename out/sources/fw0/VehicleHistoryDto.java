package fw0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.t3, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006 "}, d2 = {"Lfw0/t3;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lfw0/r3;", "a", "Lfw0/r3;", "()Lfw0/r3;", "basicData", "Lfw0/s3;", "b", "Lfw0/s3;", "()Lfw0/s3;", "documentData", "Lfw0/w3;", "c", "Lfw0/w3;", "()Lfw0/w3;", "homologationData", "Lfw0/x3;", "d", "Lfw0/x3;", "()Lfw0/x3;", "technicalData", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleHistoryDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("basicData")
    private final VehicleHistoryBasicDataDto basicData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentData")
    private final VehicleHistoryDocumentDto documentData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("homologationData")
    private final VehicleHistoryHomologationDataDto homologationData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("technicalData")
    private final VehicleHistoryTechnicalDataDto technicalData;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final VehicleHistoryBasicDataDto getBasicData() {
        return this.basicData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final VehicleHistoryDocumentDto getDocumentData() {
        return this.documentData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final VehicleHistoryHomologationDataDto getHomologationData() {
        return this.homologationData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final VehicleHistoryTechnicalDataDto getTechnicalData() {
        return this.technicalData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleHistoryDto)) {
            return false;
        }
        VehicleHistoryDto vehicleHistoryDto = (VehicleHistoryDto) other;
        return fr.t.c(this.basicData, vehicleHistoryDto.basicData) && fr.t.c(this.documentData, vehicleHistoryDto.documentData) && fr.t.c(this.homologationData, vehicleHistoryDto.homologationData) && fr.t.c(this.technicalData, vehicleHistoryDto.technicalData);
    }

    public int hashCode() {
        return (((((this.basicData.hashCode() * 31) + this.documentData.hashCode()) * 31) + this.homologationData.hashCode()) * 31) + this.technicalData.hashCode();
    }

    public String toString() {
        return "VehicleHistoryDto(basicData=" + this.basicData + ", documentData=" + this.documentData + ", homologationData=" + this.homologationData + ", technicalData=" + this.technicalData + ')';
    }
}
