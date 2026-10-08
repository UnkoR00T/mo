package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.w3, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lgm0/w3;", "", "Lgm0/l3;", "applicant", "Lgm0/q3;", "child", "Lgm0/n1;", "childStatus", "Lgm0/n5;", "passportType", "Lgm0/p3;", "attachments", "", "parentalStatement", "<init>", "(Lgm0/l3;Lgm0/q3;Lgm0/n1;Lgm0/n5;Lgm0/p3;Ljava/lang/Boolean;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lgm0/l3;", "getApplicant", "()Lgm0/l3;", "b", "Lgm0/q3;", "getChild", "()Lgm0/q3;", "c", "Lgm0/n1;", "getChildStatus", "()Lgm0/n1;", "d", "Lgm0/n5;", "getPassportType", "()Lgm0/n5;", "e", "Lgm0/p3;", "getAttachments", "()Lgm0/p3;", "f", "Ljava/lang/Boolean;", "getParentalStatement", "()Ljava/lang/Boolean;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PassportChildAgreementXmlRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("applicant")
    private final PassportChildAgreementApplicantDto applicant;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("child")
    private final PassportChildAgreementChildDto child;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("childStatus")
    private final n1 childStatus;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("passportType")
    private final n5 passportType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("attachments")
    private final PassportChildAgreementAttachmentsDto attachments;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("parentalStatement")
    private final Boolean parentalStatement;

    public PassportChildAgreementXmlRequest(PassportChildAgreementApplicantDto passportChildAgreementApplicantDto, PassportChildAgreementChildDto passportChildAgreementChildDto, n1 n1Var, n5 n5Var, PassportChildAgreementAttachmentsDto passportChildAgreementAttachmentsDto, Boolean bool) {
        this.applicant = passportChildAgreementApplicantDto;
        this.child = passportChildAgreementChildDto;
        this.childStatus = n1Var;
        this.passportType = n5Var;
        this.attachments = passportChildAgreementAttachmentsDto;
        this.parentalStatement = bool;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportChildAgreementXmlRequest)) {
            return false;
        }
        PassportChildAgreementXmlRequest passportChildAgreementXmlRequest = (PassportChildAgreementXmlRequest) other;
        return fr.t.c(this.applicant, passportChildAgreementXmlRequest.applicant) && fr.t.c(this.child, passportChildAgreementXmlRequest.child) && this.childStatus == passportChildAgreementXmlRequest.childStatus && this.passportType == passportChildAgreementXmlRequest.passportType && fr.t.c(this.attachments, passportChildAgreementXmlRequest.attachments) && fr.t.c(this.parentalStatement, passportChildAgreementXmlRequest.parentalStatement);
    }

    public int hashCode() {
        int iHashCode = ((((((this.applicant.hashCode() * 31) + this.child.hashCode()) * 31) + this.childStatus.hashCode()) * 31) + this.passportType.hashCode()) * 31;
        PassportChildAgreementAttachmentsDto passportChildAgreementAttachmentsDto = this.attachments;
        int iHashCode2 = (iHashCode + (passportChildAgreementAttachmentsDto == null ? 0 : passportChildAgreementAttachmentsDto.hashCode())) * 31;
        Boolean bool = this.parentalStatement;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "PassportChildAgreementXmlRequest(applicant=" + this.applicant + ", child=" + this.child + ", childStatus=" + this.childStatus + ", passportType=" + this.passportType + ", attachments=" + this.attachments + ", parentalStatement=" + this.parentalStatement + ')';
    }
}
