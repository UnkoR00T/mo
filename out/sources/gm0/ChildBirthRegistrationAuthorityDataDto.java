package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.x, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lgm0/x;", "", "", "civilStatusOfficeNumber", "officeType", "place", "territorialCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildBirthRegistrationAuthorityDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("civilStatusOfficeNumber")
    private final String civilStatusOfficeNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("officeType")
    private final String officeType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("place")
    private final String place;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("territorialCode")
    private final String territorialCode;

    public ChildBirthRegistrationAuthorityDataDto() {
        this(null, null, null, null, 15, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCivilStatusOfficeNumber() {
        return this.civilStatusOfficeNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getOfficeType() {
        return this.officeType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPlace() {
        return this.place;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTerritorialCode() {
        return this.territorialCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildBirthRegistrationAuthorityDataDto)) {
            return false;
        }
        ChildBirthRegistrationAuthorityDataDto childBirthRegistrationAuthorityDataDto = (ChildBirthRegistrationAuthorityDataDto) other;
        return fr.t.c(this.civilStatusOfficeNumber, childBirthRegistrationAuthorityDataDto.civilStatusOfficeNumber) && fr.t.c(this.officeType, childBirthRegistrationAuthorityDataDto.officeType) && fr.t.c(this.place, childBirthRegistrationAuthorityDataDto.place) && fr.t.c(this.territorialCode, childBirthRegistrationAuthorityDataDto.territorialCode);
    }

    public int hashCode() {
        String str = this.civilStatusOfficeNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.officeType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.place;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.territorialCode;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "ChildBirthRegistrationAuthorityDataDto(civilStatusOfficeNumber=" + this.civilStatusOfficeNumber + ", officeType=" + this.officeType + ", place=" + this.place + ", territorialCode=" + this.territorialCode + ')';
    }

    public ChildBirthRegistrationAuthorityDataDto(String str, String str2, String str3, String str4) {
        this.civilStatusOfficeNumber = str;
        this.officeType = str2;
        this.place = str3;
        this.territorialCode = str4;
    }

    public /* synthetic */ ChildBirthRegistrationAuthorityDataDto(String str, String str2, String str3, String str4, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : str2, (i15 & 4) != 0 ? null : str3, (i15 & 8) != 0 ? null : str4);
    }
}
