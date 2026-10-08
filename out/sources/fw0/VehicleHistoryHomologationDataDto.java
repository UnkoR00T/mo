package fw0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.w3, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lfw0/w3;", "", "", "homologationCategory", "homologationCertificateNumber", "homologationType", "homologationVariant", "homologationVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "e", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleHistoryHomologationDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("homologationCategory")
    private final String homologationCategory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("homologationCertificateNumber")
    private final String homologationCertificateNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("homologationType")
    private final String homologationType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("homologationVariant")
    private final String homologationVariant;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("homologationVersion")
    private final String homologationVersion;

    public VehicleHistoryHomologationDataDto() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getHomologationCategory() {
        return this.homologationCategory;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getHomologationCertificateNumber() {
        return this.homologationCertificateNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getHomologationType() {
        return this.homologationType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getHomologationVariant() {
        return this.homologationVariant;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getHomologationVersion() {
        return this.homologationVersion;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleHistoryHomologationDataDto)) {
            return false;
        }
        VehicleHistoryHomologationDataDto vehicleHistoryHomologationDataDto = (VehicleHistoryHomologationDataDto) other;
        return fr.t.c(this.homologationCategory, vehicleHistoryHomologationDataDto.homologationCategory) && fr.t.c(this.homologationCertificateNumber, vehicleHistoryHomologationDataDto.homologationCertificateNumber) && fr.t.c(this.homologationType, vehicleHistoryHomologationDataDto.homologationType) && fr.t.c(this.homologationVariant, vehicleHistoryHomologationDataDto.homologationVariant) && fr.t.c(this.homologationVersion, vehicleHistoryHomologationDataDto.homologationVersion);
    }

    public int hashCode() {
        String str = this.homologationCategory;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.homologationCertificateNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.homologationType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.homologationVariant;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.homologationVersion;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "VehicleHistoryHomologationDataDto(homologationCategory=" + this.homologationCategory + ", homologationCertificateNumber=" + this.homologationCertificateNumber + ", homologationType=" + this.homologationType + ", homologationVariant=" + this.homologationVariant + ", homologationVersion=" + this.homologationVersion + ')';
    }

    public VehicleHistoryHomologationDataDto(String str, String str2, String str3, String str4, String str5) {
        this.homologationCategory = str;
        this.homologationCertificateNumber = str2;
        this.homologationType = str3;
        this.homologationVariant = str4;
        this.homologationVersion = str5;
    }

    public /* synthetic */ VehicleHistoryHomologationDataDto(String str, String str2, String str3, String str4, String str5, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : str2, (i15 & 4) != 0 ? null : str3, (i15 & 8) != 0 ? null : str4, (i15 & 16) != 0 ? null : str5);
    }
}
