package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.c1, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lgm0/c1;", "", "", "certificateNumber", "Lgm0/x;", "registrationAuthority", "Lgm0/v2;", "status", "<init>", "(Ljava/lang/String;Lgm0/x;Lgm0/v2;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lgm0/x;", "()Lgm0/x;", "c", "Lgm0/v2;", "()Lgm0/v2;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildBirthRegistrationMaritalDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("certificateNumber")
    private final String certificateNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("registrationAuthority")
    private final ChildBirthRegistrationAuthorityDataDto registrationAuthority;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("status")
    private final v2 status;

    public ChildBirthRegistrationMaritalDataDto() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCertificateNumber() {
        return this.certificateNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ChildBirthRegistrationAuthorityDataDto getRegistrationAuthority() {
        return this.registrationAuthority;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final v2 getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildBirthRegistrationMaritalDataDto)) {
            return false;
        }
        ChildBirthRegistrationMaritalDataDto childBirthRegistrationMaritalDataDto = (ChildBirthRegistrationMaritalDataDto) other;
        return fr.t.c(this.certificateNumber, childBirthRegistrationMaritalDataDto.certificateNumber) && fr.t.c(this.registrationAuthority, childBirthRegistrationMaritalDataDto.registrationAuthority) && this.status == childBirthRegistrationMaritalDataDto.status;
    }

    public int hashCode() {
        String str = this.certificateNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ChildBirthRegistrationAuthorityDataDto childBirthRegistrationAuthorityDataDto = this.registrationAuthority;
        int iHashCode2 = (iHashCode + (childBirthRegistrationAuthorityDataDto == null ? 0 : childBirthRegistrationAuthorityDataDto.hashCode())) * 31;
        v2 v2Var = this.status;
        return iHashCode2 + (v2Var != null ? v2Var.hashCode() : 0);
    }

    public String toString() {
        return "ChildBirthRegistrationMaritalDataDto(certificateNumber=" + this.certificateNumber + ", registrationAuthority=" + this.registrationAuthority + ", status=" + this.status + ')';
    }

    public ChildBirthRegistrationMaritalDataDto(String str, ChildBirthRegistrationAuthorityDataDto childBirthRegistrationAuthorityDataDto, v2 v2Var) {
        this.certificateNumber = str;
        this.registrationAuthority = childBirthRegistrationAuthorityDataDto;
        this.status = v2Var;
    }

    public /* synthetic */ ChildBirthRegistrationMaritalDataDto(String str, ChildBirthRegistrationAuthorityDataDto childBirthRegistrationAuthorityDataDto, v2 v2Var, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : childBirthRegistrationAuthorityDataDto, (i15 & 4) != 0 ? null : v2Var);
    }
}
