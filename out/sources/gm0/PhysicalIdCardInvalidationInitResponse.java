package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.h6, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006 "}, d2 = {"Lgm0/h6;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lgm0/b6;", "a", "Lgm0/b6;", "()Lgm0/b6;", "applicantData", "Lgm0/i6;", "b", "Lgm0/i6;", "()Lgm0/i6;", "officeData", "Lgm0/j6;", "c", "Lgm0/j6;", "()Lgm0/j6;", "officeLink", "Lgm0/k6;", "d", "Lgm0/k6;", "()Lgm0/k6;", "parentsData", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PhysicalIdCardInvalidationInitResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("applicantData")
    private final PhysicalIdCardInvalidationApplicantInitDataDto applicantData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("officeData")
    private final PhysicalIdCardInvalidationOfficeDataDto officeData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("officeLink")
    private final PhysicalIdCardInvalidationOfficeLinkDto officeLink;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("parentsData")
    private final PhysicalIdCardInvalidationParentsDataDto parentsData;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final PhysicalIdCardInvalidationApplicantInitDataDto getApplicantData() {
        return this.applicantData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final PhysicalIdCardInvalidationOfficeDataDto getOfficeData() {
        return this.officeData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final PhysicalIdCardInvalidationOfficeLinkDto getOfficeLink() {
        return this.officeLink;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final PhysicalIdCardInvalidationParentsDataDto getParentsData() {
        return this.parentsData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhysicalIdCardInvalidationInitResponse)) {
            return false;
        }
        PhysicalIdCardInvalidationInitResponse physicalIdCardInvalidationInitResponse = (PhysicalIdCardInvalidationInitResponse) other;
        return fr.t.c(this.applicantData, physicalIdCardInvalidationInitResponse.applicantData) && fr.t.c(this.officeData, physicalIdCardInvalidationInitResponse.officeData) && fr.t.c(this.officeLink, physicalIdCardInvalidationInitResponse.officeLink) && fr.t.c(this.parentsData, physicalIdCardInvalidationInitResponse.parentsData);
    }

    public int hashCode() {
        return (((((this.applicantData.hashCode() * 31) + this.officeData.hashCode()) * 31) + this.officeLink.hashCode()) * 31) + this.parentsData.hashCode();
    }

    public String toString() {
        return "PhysicalIdCardInvalidationInitResponse(applicantData=" + this.applicantData + ", officeData=" + this.officeData + ", officeLink=" + this.officeLink + ", parentsData=" + this.parentsData + ')';
    }
}
