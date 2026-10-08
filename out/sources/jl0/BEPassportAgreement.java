package jl0;

import al0.s0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jl0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001b\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b\u001f\u0010\u0010¨\u0006'"}, d2 = {"Ljl0/a;", "", "", "agreementNumber", "Ljl0/m;", "agreementStatus", "firstName", "lastName", "Lal0/s0;", "passportType", "Lfz/b$f;", "registrationDate", "mobywatelAgreementId", "<init>", "(Ljava/lang/String;Ljl0/m;Ljava/lang/String;Ljava/lang/String;Lal0/s0;Lfz/b$f;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAgreementNumber", "b", "Ljl0/m;", "()Ljl0/m;", "c", "d", "e", "Lal0/s0;", "()Lal0/s0;", "f", "Lfz/b$f;", "()Lfz/b$f;", "g", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEPassportAgreement {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String agreementNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final m agreementStatus;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final s0 passportType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.OffsetDateTime registrationDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mobywatelAgreementId;

    public BEPassportAgreement(String str, m mVar, String str2, String str3, s0 s0Var, fz.b.OffsetDateTime offsetDateTime, String str4) {
        this.agreementNumber = str;
        this.agreementStatus = mVar;
        this.firstName = str2;
        this.lastName = str3;
        this.passportType = s0Var;
        this.registrationDate = offsetDateTime;
        this.mobywatelAgreementId = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final m getAgreementStatus() {
        return this.agreementStatus;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMobywatelAgreementId() {
        return this.mobywatelAgreementId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final s0 getPassportType() {
        return this.passportType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEPassportAgreement)) {
            return false;
        }
        BEPassportAgreement bEPassportAgreement = (BEPassportAgreement) other;
        return fr.t.c(this.agreementNumber, bEPassportAgreement.agreementNumber) && this.agreementStatus == bEPassportAgreement.agreementStatus && fr.t.c(this.firstName, bEPassportAgreement.firstName) && fr.t.c(this.lastName, bEPassportAgreement.lastName) && this.passportType == bEPassportAgreement.passportType && fr.t.c(this.registrationDate, bEPassportAgreement.registrationDate) && fr.t.c(this.mobywatelAgreementId, bEPassportAgreement.mobywatelAgreementId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final fz.b.OffsetDateTime getRegistrationDate() {
        return this.registrationDate;
    }

    public int hashCode() {
        int iHashCode = ((this.agreementNumber.hashCode() * 31) + this.agreementStatus.hashCode()) * 31;
        String str = this.firstName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastName;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.passportType.hashCode()) * 31) + this.registrationDate.hashCode()) * 31;
        String str3 = this.mobywatelAgreementId;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "BEPassportAgreement(agreementNumber=" + this.agreementNumber + ", agreementStatus=" + this.agreementStatus + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", passportType=" + this.passportType + ", registrationDate=" + this.registrationDate + ", mobywatelAgreementId=" + this.mobywatelAgreementId + ")";
    }
}
