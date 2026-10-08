package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.b0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lgm0/b0;", "", "", "registrationAuthorityPlace", "certificateNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getRegistrationAuthorityPlace", "b", "getCertificateNumber", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildBirthRegistrationGenerateXmlBirthCertificateData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("registrationAuthorityPlace")
    private final String registrationAuthorityPlace;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("certificateNumber")
    private final String certificateNumber;

    public ChildBirthRegistrationGenerateXmlBirthCertificateData(String str, String str2) {
        this.registrationAuthorityPlace = str;
        this.certificateNumber = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildBirthRegistrationGenerateXmlBirthCertificateData)) {
            return false;
        }
        ChildBirthRegistrationGenerateXmlBirthCertificateData childBirthRegistrationGenerateXmlBirthCertificateData = (ChildBirthRegistrationGenerateXmlBirthCertificateData) other;
        return fr.t.c(this.registrationAuthorityPlace, childBirthRegistrationGenerateXmlBirthCertificateData.registrationAuthorityPlace) && fr.t.c(this.certificateNumber, childBirthRegistrationGenerateXmlBirthCertificateData.certificateNumber);
    }

    public int hashCode() {
        int iHashCode = this.registrationAuthorityPlace.hashCode() * 31;
        String str = this.certificateNumber;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ChildBirthRegistrationGenerateXmlBirthCertificateData(registrationAuthorityPlace=" + this.registrationAuthorityPlace + ", certificateNumber=" + this.certificateNumber + ')';
    }
}
