package pf1;

import fr.t;
import java.util.List;
import ld1.StatementAttachment;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: pf1.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\u001a\u0010\"¨\u0006#"}, d2 = {"Lpf1/a;", "", "Lpf1/d;", "applicantDetails", "Lpf1/f;", "managementDetails", "Lpf1/e;", "companyDetails", "", "Lld1/n;", "attachments", "<init>", "(Lpf1/d;Lpf1/f;Lpf1/e;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpf1/d;", "()Lpf1/d;", "b", "Lpf1/f;", "d", "()Lpf1/f;", "c", "Lpf1/e;", "()Lpf1/e;", "Ljava/util/List;", "()Ljava/util/List;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CompanyManagementApplication {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final SuspensionApplicantDetails applicantDetails;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final SuspensionManagementDetails managementDetails;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final SuspensionCompanyDetails companyDetails;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<StatementAttachment> attachments;

    public CompanyManagementApplication(SuspensionApplicantDetails suspensionApplicantDetails, SuspensionManagementDetails suspensionManagementDetails, SuspensionCompanyDetails suspensionCompanyDetails, List<StatementAttachment> list) {
        this.applicantDetails = suspensionApplicantDetails;
        this.managementDetails = suspensionManagementDetails;
        this.companyDetails = suspensionCompanyDetails;
        this.attachments = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final SuspensionApplicantDetails getApplicantDetails() {
        return this.applicantDetails;
    }

    public final List<StatementAttachment> b() {
        return this.attachments;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final SuspensionCompanyDetails getCompanyDetails() {
        return this.companyDetails;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final SuspensionManagementDetails getManagementDetails() {
        return this.managementDetails;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanyManagementApplication)) {
            return false;
        }
        CompanyManagementApplication companyManagementApplication = (CompanyManagementApplication) other;
        return t.c(this.applicantDetails, companyManagementApplication.applicantDetails) && t.c(this.managementDetails, companyManagementApplication.managementDetails) && t.c(this.companyDetails, companyManagementApplication.companyDetails) && t.c(this.attachments, companyManagementApplication.attachments);
    }

    public int hashCode() {
        int iHashCode = ((((this.applicantDetails.hashCode() * 31) + this.managementDetails.hashCode()) * 31) + this.companyDetails.hashCode()) * 31;
        List<StatementAttachment> list = this.attachments;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "CompanyManagementApplication(applicantDetails=" + this.applicantDetails + ", managementDetails=" + this.managementDetails + ", companyDetails=" + this.companyDetails + ", attachments=" + this.attachments + ')';
    }
}
