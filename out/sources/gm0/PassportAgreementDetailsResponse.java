package gm0;

import java.time.LocalDate;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.c3, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001a\u0010!\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001a\u0010'\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0012\u001a\u0004\b)\u0010\u0004R\u001a\u0010/\u001a\u00020+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010,\u001a\u0004\b-\u0010.R\u001a\u00105\u001a\u0002008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\u0012\u001a\u0004\b#\u0010\u0004R\"\u0010<\u001a\n\u0012\u0004\u0012\u000209\u0018\u0001088\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010:\u001a\u0004\b(\u0010;R\u001c\u0010=\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u000e\u001a\u0004\b1\u0010\u000fR\u001c\u0010A\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010?\u001a\u0004\b6\u0010@¨\u0006B"}, d2 = {"Lgm0/c3;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/LocalDate;", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "agreementDate", "b", "Ljava/lang/String;", "agreementNumber", "Lgm0/h3;", "c", "Lgm0/h3;", "()Lgm0/h3;", "agreementRegistrationMode", "Lgm0/d3;", "d", "Lgm0/d3;", "()Lgm0/d3;", "agreementStatus", "e", "Z", "()Z", "agreementWithdrawnFlag", "Lgm0/a3;", "f", "Lgm0/a3;", "h", "()Lgm0/a3;", "childData", "g", "k", "mobywatelAgreementId", "Lgm0/b3;", "Lgm0/b3;", "l", "()Lgm0/b3;", "parentData", "Lgm0/m5;", "i", "Lgm0/m5;", "m", "()Lgm0/m5;", "passportType", "j", "applicationNumber", "", "Lgm0/x2;", "Ljava/util/List;", "()Ljava/util/List;", "attachements", "invalidationDate", "Lgm0/f3;", "Lgm0/f3;", "()Lgm0/f3;", "invalidationReason", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PassportAgreementDetailsResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("agreementDate")
    private final LocalDate agreementDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("agreementNumber")
    private final String agreementNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("agreementRegistrationMode")
    private final h3 agreementRegistrationMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("agreementStatus")
    private final d3 agreementStatus;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("agreementWithdrawnFlag")
    private final boolean agreementWithdrawnFlag;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("childData")
    private final PassportAgreementDetailsPassportChildApplicationChildData childData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("mobywatelAgreementId")
    private final String mobywatelAgreementId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("parentData")
    private final PassportAgreementDetailsPassportChildApplicationParentData parentData;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("passportType")
    private final m5 passportType;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("applicationNumber")
    private final String applicationNumber;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("attachements")
    private final List<PassportAgreementDetailsAttachement> attachements;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("invalidationDate")
    private final LocalDate invalidationDate;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("invalidationReason")
    private final f3 invalidationReason;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getAgreementDate() {
        return this.agreementDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAgreementNumber() {
        return this.agreementNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h3 getAgreementRegistrationMode() {
        return this.agreementRegistrationMode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d3 getAgreementStatus() {
        return this.agreementStatus;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getAgreementWithdrawnFlag() {
        return this.agreementWithdrawnFlag;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportAgreementDetailsResponse)) {
            return false;
        }
        PassportAgreementDetailsResponse passportAgreementDetailsResponse = (PassportAgreementDetailsResponse) other;
        return fr.t.c(this.agreementDate, passportAgreementDetailsResponse.agreementDate) && fr.t.c(this.agreementNumber, passportAgreementDetailsResponse.agreementNumber) && this.agreementRegistrationMode == passportAgreementDetailsResponse.agreementRegistrationMode && this.agreementStatus == passportAgreementDetailsResponse.agreementStatus && this.agreementWithdrawnFlag == passportAgreementDetailsResponse.agreementWithdrawnFlag && fr.t.c(this.childData, passportAgreementDetailsResponse.childData) && fr.t.c(this.mobywatelAgreementId, passportAgreementDetailsResponse.mobywatelAgreementId) && fr.t.c(this.parentData, passportAgreementDetailsResponse.parentData) && this.passportType == passportAgreementDetailsResponse.passportType && fr.t.c(this.applicationNumber, passportAgreementDetailsResponse.applicationNumber) && fr.t.c(this.attachements, passportAgreementDetailsResponse.attachements) && fr.t.c(this.invalidationDate, passportAgreementDetailsResponse.invalidationDate) && this.invalidationReason == passportAgreementDetailsResponse.invalidationReason;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getApplicationNumber() {
        return this.applicationNumber;
    }

    public final List<PassportAgreementDetailsAttachement> g() {
        return this.attachements;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final PassportAgreementDetailsPassportChildApplicationChildData getChildData() {
        return this.childData;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.agreementDate.hashCode() * 31) + this.agreementNumber.hashCode()) * 31) + this.agreementRegistrationMode.hashCode()) * 31) + this.agreementStatus.hashCode()) * 31) + Boolean.hashCode(this.agreementWithdrawnFlag)) * 31) + this.childData.hashCode()) * 31) + this.mobywatelAgreementId.hashCode()) * 31) + this.parentData.hashCode()) * 31) + this.passportType.hashCode()) * 31;
        String str = this.applicationNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<PassportAgreementDetailsAttachement> list = this.attachements;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        LocalDate localDate = this.invalidationDate;
        int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        f3 f3Var = this.invalidationReason;
        return iHashCode4 + (f3Var != null ? f3Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final LocalDate getInvalidationDate() {
        return this.invalidationDate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final f3 getInvalidationReason() {
        return this.invalidationReason;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getMobywatelAgreementId() {
        return this.mobywatelAgreementId;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final PassportAgreementDetailsPassportChildApplicationParentData getParentData() {
        return this.parentData;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final m5 getPassportType() {
        return this.passportType;
    }

    public String toString() {
        return "PassportAgreementDetailsResponse(agreementDate=" + this.agreementDate + ", agreementNumber=" + this.agreementNumber + ", agreementRegistrationMode=" + this.agreementRegistrationMode + ", agreementStatus=" + this.agreementStatus + ", agreementWithdrawnFlag=" + this.agreementWithdrawnFlag + ", childData=" + this.childData + ", mobywatelAgreementId=" + this.mobywatelAgreementId + ", parentData=" + this.parentData + ", passportType=" + this.passportType + ", applicationNumber=" + this.applicationNumber + ", attachements=" + this.attachements + ", invalidationDate=" + this.invalidationDate + ", invalidationReason=" + this.invalidationReason + ')';
    }
}
