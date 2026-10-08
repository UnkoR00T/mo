package ck0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ck0.y, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lck0/y;", "", "Lck0/q;", "applicant", "Lck0/t;", "applicationManagement", "Lck0/s;", "company", "", "Lck0/f;", "attachments", "<init>", "(Lck0/q;Lck0/t;Lck0/s;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lck0/q;", "getApplicant", "()Lck0/q;", "b", "Lck0/t;", "getApplicationManagement", "()Lck0/t;", "c", "Lck0/s;", "getCompany", "()Lck0/s;", "d", "Ljava/util/List;", "getAttachments", "()Ljava/util/List;", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CompanyApplicationResumptionV2Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("applicant")
    private final CompanyApplicationManagementApplicantDetailsInputDto applicant;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("applicationManagement")
    private final CompanyApplicationManagementDetailsDto applicationManagement;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("company")
    private final CompanyApplicationManagementCompanyDetailsInputV2Dto company;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("attachments")
    private final List<CompanyApplicationAttachmentInputDto> attachments;

    public CompanyApplicationResumptionV2Request(CompanyApplicationManagementApplicantDetailsInputDto companyApplicationManagementApplicantDetailsInputDto, CompanyApplicationManagementDetailsDto companyApplicationManagementDetailsDto, CompanyApplicationManagementCompanyDetailsInputV2Dto companyApplicationManagementCompanyDetailsInputV2Dto, List<CompanyApplicationAttachmentInputDto> list) {
        this.applicant = companyApplicationManagementApplicantDetailsInputDto;
        this.applicationManagement = companyApplicationManagementDetailsDto;
        this.company = companyApplicationManagementCompanyDetailsInputV2Dto;
        this.attachments = list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanyApplicationResumptionV2Request)) {
            return false;
        }
        CompanyApplicationResumptionV2Request companyApplicationResumptionV2Request = (CompanyApplicationResumptionV2Request) other;
        return fr.t.c(this.applicant, companyApplicationResumptionV2Request.applicant) && fr.t.c(this.applicationManagement, companyApplicationResumptionV2Request.applicationManagement) && fr.t.c(this.company, companyApplicationResumptionV2Request.company) && fr.t.c(this.attachments, companyApplicationResumptionV2Request.attachments);
    }

    public int hashCode() {
        int iHashCode = ((((this.applicant.hashCode() * 31) + this.applicationManagement.hashCode()) * 31) + this.company.hashCode()) * 31;
        List<CompanyApplicationAttachmentInputDto> list = this.attachments;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "CompanyApplicationResumptionV2Request(applicant=" + this.applicant + ", applicationManagement=" + this.applicationManagement + ", company=" + this.company + ", attachments=" + this.attachments + ')';
    }
}
