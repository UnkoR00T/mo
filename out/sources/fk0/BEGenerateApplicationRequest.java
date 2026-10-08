package fk0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fk0.o0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"Lfk0/o0;", "", "Lfk0/c;", "applicant", "Lfk0/e;", "company", "", "Lfk0/d;", "attachments", "", "useNewContactFormat", "<init>", "(Lfk0/c;Lfk0/e;Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lfk0/c;", "()Lfk0/c;", "b", "Lfk0/e;", "c", "()Lfk0/e;", "Ljava/util/List;", "()Ljava/util/List;", "d", "Z", "()Z", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEGenerateApplicationRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEApplicationApplicantDetails applicant;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEApplicationCompanyDetails company;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEApplicationAttachment> attachments;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean useNewContactFormat;

    public BEGenerateApplicationRequest(BEApplicationApplicantDetails bEApplicationApplicantDetails, BEApplicationCompanyDetails bEApplicationCompanyDetails, List<BEApplicationAttachment> list, boolean z15) {
        this.applicant = bEApplicationApplicantDetails;
        this.company = bEApplicationCompanyDetails;
        this.attachments = list;
        this.useNewContactFormat = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BEApplicationApplicantDetails getApplicant() {
        return this.applicant;
    }

    public final List<BEApplicationAttachment> b() {
        return this.attachments;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BEApplicationCompanyDetails getCompany() {
        return this.company;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getUseNewContactFormat() {
        return this.useNewContactFormat;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEGenerateApplicationRequest)) {
            return false;
        }
        BEGenerateApplicationRequest bEGenerateApplicationRequest = (BEGenerateApplicationRequest) other;
        return fr.t.c(this.applicant, bEGenerateApplicationRequest.applicant) && fr.t.c(this.company, bEGenerateApplicationRequest.company) && fr.t.c(this.attachments, bEGenerateApplicationRequest.attachments) && this.useNewContactFormat == bEGenerateApplicationRequest.useNewContactFormat;
    }

    public int hashCode() {
        int iHashCode = ((this.applicant.hashCode() * 31) + this.company.hashCode()) * 31;
        List<BEApplicationAttachment> list = this.attachments;
        return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.useNewContactFormat);
    }

    public String toString() {
        return "BEGenerateApplicationRequest(applicant=" + this.applicant + ", company=" + this.company + ", attachments=" + this.attachments + ", useNewContactFormat=" + this.useNewContactFormat + ')';
    }
}
