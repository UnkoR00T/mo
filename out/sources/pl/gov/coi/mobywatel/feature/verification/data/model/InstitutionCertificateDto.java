package pl.gov.coi.mobywatel.feature.verification.data.model;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lpl/gov/coi/mobywatel/feature/verification/data/model/InstitutionCertificateDto;", "", "issuer", "", "serialNumber", "subjectDistinguishedName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIssuer", "()Ljava/lang/String;", "getSerialNumber", "getSubjectDistinguishedName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstitutionCertificateDto {
    public static final int $stable = 0;

    @c("issuer")
    private final String issuer;

    @c("sn")
    private final String serialNumber;

    @c("dn")
    private final String subjectDistinguishedName;

    public InstitutionCertificateDto(String str, String str2, String str3) {
        this.issuer = str;
        this.serialNumber = str2;
        this.subjectDistinguishedName = str3;
    }

    public static /* synthetic */ InstitutionCertificateDto copy$default(InstitutionCertificateDto institutionCertificateDto, String str, String str2, String str3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = institutionCertificateDto.issuer;
        }
        if ((i15 & 2) != 0) {
            str2 = institutionCertificateDto.serialNumber;
        }
        if ((i15 & 4) != 0) {
            str3 = institutionCertificateDto.subjectDistinguishedName;
        }
        return institutionCertificateDto.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIssuer() {
        return this.issuer;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSerialNumber() {
        return this.serialNumber;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubjectDistinguishedName() {
        return this.subjectDistinguishedName;
    }

    public final InstitutionCertificateDto copy(String issuer, String serialNumber, String subjectDistinguishedName) {
        return new InstitutionCertificateDto(issuer, serialNumber, subjectDistinguishedName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstitutionCertificateDto)) {
            return false;
        }
        InstitutionCertificateDto institutionCertificateDto = (InstitutionCertificateDto) other;
        return t.c(this.issuer, institutionCertificateDto.issuer) && t.c(this.serialNumber, institutionCertificateDto.serialNumber) && t.c(this.subjectDistinguishedName, institutionCertificateDto.subjectDistinguishedName);
    }

    public final String getIssuer() {
        return this.issuer;
    }

    public final String getSerialNumber() {
        return this.serialNumber;
    }

    public final String getSubjectDistinguishedName() {
        return this.subjectDistinguishedName;
    }

    public int hashCode() {
        return (((this.issuer.hashCode() * 31) + this.serialNumber.hashCode()) * 31) + this.subjectDistinguishedName.hashCode();
    }

    public String toString() {
        return "InstitutionCertificateDto(issuer=" + this.issuer + ", serialNumber=" + this.serialNumber + ", subjectDistinguishedName=" + this.subjectDistinguishedName + ')';
    }
}
