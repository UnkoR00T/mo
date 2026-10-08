package ck0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ck0.e1, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lck0/e1;", "", "Lck0/a0;", "applicant", "Lck0/h;", "company", "", "Lck0/f;", "attachments", "<init>", "(Lck0/a0;Lck0/h;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lck0/a0;", "getApplicant", "()Lck0/a0;", "b", "Lck0/h;", "getCompany", "()Lck0/h;", "c", "Ljava/util/List;", "getAttachments", "()Ljava/util/List;", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GenerateApplicationSetupV2Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("applicant")
    private final CompanyApplicationSetupApplicantDetailsInputDto applicant;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("company")
    private final CompanyApplicationCompanyDetailsInputV2Dto company;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("attachments")
    private final List<CompanyApplicationAttachmentInputDto> attachments;

    public GenerateApplicationSetupV2Request(CompanyApplicationSetupApplicantDetailsInputDto companyApplicationSetupApplicantDetailsInputDto, CompanyApplicationCompanyDetailsInputV2Dto companyApplicationCompanyDetailsInputV2Dto, List<CompanyApplicationAttachmentInputDto> list) {
        this.applicant = companyApplicationSetupApplicantDetailsInputDto;
        this.company = companyApplicationCompanyDetailsInputV2Dto;
        this.attachments = list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenerateApplicationSetupV2Request)) {
            return false;
        }
        GenerateApplicationSetupV2Request generateApplicationSetupV2Request = (GenerateApplicationSetupV2Request) other;
        return fr.t.c(this.applicant, generateApplicationSetupV2Request.applicant) && fr.t.c(this.company, generateApplicationSetupV2Request.company) && fr.t.c(this.attachments, generateApplicationSetupV2Request.attachments);
    }

    public int hashCode() {
        int iHashCode = ((this.applicant.hashCode() * 31) + this.company.hashCode()) * 31;
        List<CompanyApplicationAttachmentInputDto> list = this.attachments;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "GenerateApplicationSetupV2Request(applicant=" + this.applicant + ", company=" + this.company + ", attachments=" + this.attachments + ')';
    }
}
