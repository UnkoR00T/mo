package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.u6, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\f¨\u0006!"}, d2 = {"Lgm0/u6;", "", "Lgm0/o2;", "action", "", "seriesAndNumber", "Lgm0/u1;", "contactDetailsDto", "epuapAddress", "<init>", "(Lgm0/o2;Ljava/lang/String;Lgm0/u1;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgm0/o2;", "getAction", "()Lgm0/o2;", "b", "Ljava/lang/String;", "getSeriesAndNumber", "c", "Lgm0/u1;", "getContactDetailsDto", "()Lgm0/u1;", "d", "getEpuapAddress", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PhysicalIdCardSuspensionV3Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("action")
    private final o2 action;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("seriesAndNumber")
    private final String seriesAndNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("contactDetailsDto")
    private final ContactDetailsDto contactDetailsDto;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("epuapAddress")
    private final String epuapAddress;

    public PhysicalIdCardSuspensionV3Request(o2 o2Var, String str, ContactDetailsDto contactDetailsDto, String str2) {
        this.action = o2Var;
        this.seriesAndNumber = str;
        this.contactDetailsDto = contactDetailsDto;
        this.epuapAddress = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhysicalIdCardSuspensionV3Request)) {
            return false;
        }
        PhysicalIdCardSuspensionV3Request physicalIdCardSuspensionV3Request = (PhysicalIdCardSuspensionV3Request) other;
        return this.action == physicalIdCardSuspensionV3Request.action && fr.t.c(this.seriesAndNumber, physicalIdCardSuspensionV3Request.seriesAndNumber) && fr.t.c(this.contactDetailsDto, physicalIdCardSuspensionV3Request.contactDetailsDto) && fr.t.c(this.epuapAddress, physicalIdCardSuspensionV3Request.epuapAddress);
    }

    public int hashCode() {
        int iHashCode = ((this.action.hashCode() * 31) + this.seriesAndNumber.hashCode()) * 31;
        ContactDetailsDto contactDetailsDto = this.contactDetailsDto;
        int iHashCode2 = (iHashCode + (contactDetailsDto == null ? 0 : contactDetailsDto.hashCode())) * 31;
        String str = this.epuapAddress;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "PhysicalIdCardSuspensionV3Request(action=" + this.action + ", seriesAndNumber=" + this.seriesAndNumber + ", contactDetailsDto=" + this.contactDetailsDto + ", epuapAddress=" + this.epuapAddress + ')';
    }

    public /* synthetic */ PhysicalIdCardSuspensionV3Request(o2 o2Var, String str, ContactDetailsDto contactDetailsDto, String str2, int i15, fr.k kVar) {
        this(o2Var, str, (i15 & 4) != 0 ? null : contactDetailsDto, (i15 & 8) != 0 ? null : str2);
    }
}
