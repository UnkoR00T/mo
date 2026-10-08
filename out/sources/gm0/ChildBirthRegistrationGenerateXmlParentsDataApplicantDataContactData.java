package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.r0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lgm0/r0;", "", "Lgm0/s0;", "applicationContactType", "", "email", "Lgm0/t0;", "fullPhoneNumber", "<init>", "(Lgm0/s0;Ljava/lang/String;Lgm0/t0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgm0/s0;", "getApplicationContactType", "()Lgm0/s0;", "b", "Ljava/lang/String;", "getEmail", "c", "Lgm0/t0;", "getFullPhoneNumber", "()Lgm0/t0;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildBirthRegistrationGenerateXmlParentsDataApplicantDataContactData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("applicationContactType")
    private final s0 applicationContactType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("email")
    private final String email;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fullPhoneNumber")
    private final ChildBirthRegistrationGenerateXmlParentsDataApplicantDataContactDataFullPhoneNumber fullPhoneNumber;

    public ChildBirthRegistrationGenerateXmlParentsDataApplicantDataContactData(s0 s0Var, String str, ChildBirthRegistrationGenerateXmlParentsDataApplicantDataContactDataFullPhoneNumber childBirthRegistrationGenerateXmlParentsDataApplicantDataContactDataFullPhoneNumber) {
        this.applicationContactType = s0Var;
        this.email = str;
        this.fullPhoneNumber = childBirthRegistrationGenerateXmlParentsDataApplicantDataContactDataFullPhoneNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildBirthRegistrationGenerateXmlParentsDataApplicantDataContactData)) {
            return false;
        }
        ChildBirthRegistrationGenerateXmlParentsDataApplicantDataContactData childBirthRegistrationGenerateXmlParentsDataApplicantDataContactData = (ChildBirthRegistrationGenerateXmlParentsDataApplicantDataContactData) other;
        return this.applicationContactType == childBirthRegistrationGenerateXmlParentsDataApplicantDataContactData.applicationContactType && fr.t.c(this.email, childBirthRegistrationGenerateXmlParentsDataApplicantDataContactData.email) && fr.t.c(this.fullPhoneNumber, childBirthRegistrationGenerateXmlParentsDataApplicantDataContactData.fullPhoneNumber);
    }

    public int hashCode() {
        int iHashCode = this.applicationContactType.hashCode() * 31;
        String str = this.email;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ChildBirthRegistrationGenerateXmlParentsDataApplicantDataContactDataFullPhoneNumber childBirthRegistrationGenerateXmlParentsDataApplicantDataContactDataFullPhoneNumber = this.fullPhoneNumber;
        return iHashCode2 + (childBirthRegistrationGenerateXmlParentsDataApplicantDataContactDataFullPhoneNumber != null ? childBirthRegistrationGenerateXmlParentsDataApplicantDataContactDataFullPhoneNumber.hashCode() : 0);
    }

    public String toString() {
        return "ChildBirthRegistrationGenerateXmlParentsDataApplicantDataContactData(applicationContactType=" + this.applicationContactType + ", email=" + this.email + ", fullPhoneNumber=" + this.fullPhoneNumber + ')';
    }

    public /* synthetic */ ChildBirthRegistrationGenerateXmlParentsDataApplicantDataContactData(s0 s0Var, String str, ChildBirthRegistrationGenerateXmlParentsDataApplicantDataContactDataFullPhoneNumber childBirthRegistrationGenerateXmlParentsDataApplicantDataContactDataFullPhoneNumber, int i15, fr.k kVar) {
        this(s0Var, (i15 & 2) != 0 ? null : str, (i15 & 4) != 0 ? null : childBirthRegistrationGenerateXmlParentsDataApplicantDataContactDataFullPhoneNumber);
    }
}
