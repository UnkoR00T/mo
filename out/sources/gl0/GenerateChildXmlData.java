package gl0;

import al0.BEContactDetailsData;
import al0.CommunityOffice;
import al0.IdCardSuspensionChildData;
import al0.ParentOrGuardData;
import al0.c0;
import fr.t;
import p071kotlin.Metadata;
import wx.i;

/* JADX INFO: renamed from: gl0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b$\u00100R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b,\u00101\u001a\u0004\b.\u00102R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105¨\u00066"}, d2 = {"Lgl0/b;", "", "Lal0/c0;", "action", "Lal0/j0;", "applicantData", "Lal0/d0;", "childData", "Lgl0/a;", "certDeliveryMethod", "Lal0/v;", "office", "Lwx/i;", "attachment", "Lal0/j;", "contactDetails", "Lgl0/c;", "processType", "<init>", "(Lal0/c0;Lal0/j0;Lal0/d0;Lgl0/a;Lal0/v;Lwx/i;Lal0/j;Lgl0/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/c0;", "()Lal0/c0;", "b", "Lal0/j0;", "()Lal0/j0;", "c", "Lal0/d0;", "e", "()Lal0/d0;", "d", "Lgl0/a;", "()Lgl0/a;", "Lal0/v;", "g", "()Lal0/v;", "f", "Lwx/i;", "()Lwx/i;", "Lal0/j;", "()Lal0/j;", "h", "Lgl0/c;", "()Lgl0/c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GenerateChildXmlData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final c0 action;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ParentOrGuardData applicantData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdCardSuspensionChildData childData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final a certDeliveryMethod;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final CommunityOffice office;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final i attachment;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEContactDetailsData contactDetails;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final c processType;

    public GenerateChildXmlData(c0 c0Var, ParentOrGuardData parentOrGuardData, IdCardSuspensionChildData idCardSuspensionChildData, a aVar, CommunityOffice communityOffice, i iVar, BEContactDetailsData bEContactDetailsData, c cVar) {
        this.action = c0Var;
        this.applicantData = parentOrGuardData;
        this.childData = idCardSuspensionChildData;
        this.certDeliveryMethod = aVar;
        this.office = communityOffice;
        this.attachment = iVar;
        this.contactDetails = bEContactDetailsData;
        this.processType = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c0 getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ParentOrGuardData getApplicantData() {
        return this.applicantData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final i getAttachment() {
        return this.attachment;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a getCertDeliveryMethod() {
        return this.certDeliveryMethod;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final IdCardSuspensionChildData getChildData() {
        return this.childData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenerateChildXmlData)) {
            return false;
        }
        GenerateChildXmlData generateChildXmlData = (GenerateChildXmlData) other;
        return this.action == generateChildXmlData.action && t.c(this.applicantData, generateChildXmlData.applicantData) && t.c(this.childData, generateChildXmlData.childData) && this.certDeliveryMethod == generateChildXmlData.certDeliveryMethod && t.c(this.office, generateChildXmlData.office) && t.c(this.attachment, generateChildXmlData.attachment) && t.c(this.contactDetails, generateChildXmlData.contactDetails) && t.c(this.processType, generateChildXmlData.processType);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final BEContactDetailsData getContactDetails() {
        return this.contactDetails;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final CommunityOffice getOffice() {
        return this.office;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final c getProcessType() {
        return this.processType;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.action.hashCode() * 31) + this.applicantData.hashCode()) * 31) + this.childData.hashCode()) * 31) + this.certDeliveryMethod.hashCode()) * 31) + this.office.hashCode()) * 31;
        i iVar = this.attachment;
        return ((((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31) + this.contactDetails.hashCode()) * 31) + this.processType.hashCode();
    }

    public String toString() {
        return "GenerateChildXmlData(action=" + this.action + ", applicantData=" + this.applicantData + ", childData=" + this.childData + ", certDeliveryMethod=" + this.certDeliveryMethod + ", office=" + this.office + ", attachment=" + this.attachment + ", contactDetails=" + this.contactDetails + ", processType=" + this.processType + ")";
    }
}
