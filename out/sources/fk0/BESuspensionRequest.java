package fk0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fk0.h1, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u001d\u0010\"¨\u0006#"}, d2 = {"Lfk0/h1;", "", "Lfk0/s0;", "applicant", "Lfk0/v0;", "applicationManagement", "Lfk0/t0;", "company", "", "Lfk0/d;", "attachments", "<init>", "(Lfk0/s0;Lfk0/v0;Lfk0/t0;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfk0/s0;", "()Lfk0/s0;", "b", "Lfk0/v0;", "()Lfk0/v0;", "c", "Lfk0/t0;", "d", "()Lfk0/t0;", "Ljava/util/List;", "()Ljava/util/List;", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BESuspensionRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEManagementApplicantDetails applicant;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEManagementDetails applicationManagement;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEManagementCompanyDetails company;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEApplicationAttachment> attachments;

    public BESuspensionRequest(BEManagementApplicantDetails bEManagementApplicantDetails, BEManagementDetails bEManagementDetails, BEManagementCompanyDetails bEManagementCompanyDetails, List<BEApplicationAttachment> list) {
        this.applicant = bEManagementApplicantDetails;
        this.applicationManagement = bEManagementDetails;
        this.company = bEManagementCompanyDetails;
        this.attachments = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BEManagementApplicantDetails getApplicant() {
        return this.applicant;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BEManagementDetails getApplicationManagement() {
        return this.applicationManagement;
    }

    public final List<BEApplicationAttachment> c() {
        return this.attachments;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BEManagementCompanyDetails getCompany() {
        return this.company;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BESuspensionRequest)) {
            return false;
        }
        BESuspensionRequest bESuspensionRequest = (BESuspensionRequest) other;
        return fr.t.c(this.applicant, bESuspensionRequest.applicant) && fr.t.c(this.applicationManagement, bESuspensionRequest.applicationManagement) && fr.t.c(this.company, bESuspensionRequest.company) && fr.t.c(this.attachments, bESuspensionRequest.attachments);
    }

    public int hashCode() {
        int iHashCode = ((((this.applicant.hashCode() * 31) + this.applicationManagement.hashCode()) * 31) + this.company.hashCode()) * 31;
        List<BEApplicationAttachment> list = this.attachments;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "BESuspensionRequest(applicant=" + this.applicant + ", applicationManagement=" + this.applicationManagement + ", company=" + this.company + ", attachments=" + this.attachments + ')';
    }
}
