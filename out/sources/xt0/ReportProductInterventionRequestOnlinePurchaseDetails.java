package xt0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: xt0.l0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\n¨\u0006\u001b"}, d2 = {"Lxt0/l0;", "", "Lxt0/h0;", "address", "", "productUrl", "sellerName", "<init>", "(Lxt0/h0;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxt0/h0;", "getAddress", "()Lxt0/h0;", "b", "Ljava/lang/String;", "getProductUrl", "c", "getSellerName", "sanitaryinspectorservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReportProductInterventionRequestOnlinePurchaseDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("address")
    private final ReportProductInterventionRequestAddressRequest address;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("productUrl")
    private final String productUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("sellerName")
    private final String sellerName;

    public ReportProductInterventionRequestOnlinePurchaseDetails() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportProductInterventionRequestOnlinePurchaseDetails)) {
            return false;
        }
        ReportProductInterventionRequestOnlinePurchaseDetails reportProductInterventionRequestOnlinePurchaseDetails = (ReportProductInterventionRequestOnlinePurchaseDetails) other;
        return fr.t.c(this.address, reportProductInterventionRequestOnlinePurchaseDetails.address) && fr.t.c(this.productUrl, reportProductInterventionRequestOnlinePurchaseDetails.productUrl) && fr.t.c(this.sellerName, reportProductInterventionRequestOnlinePurchaseDetails.sellerName);
    }

    public int hashCode() {
        ReportProductInterventionRequestAddressRequest reportProductInterventionRequestAddressRequest = this.address;
        int iHashCode = (reportProductInterventionRequestAddressRequest == null ? 0 : reportProductInterventionRequestAddressRequest.hashCode()) * 31;
        String str = this.productUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sellerName;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ReportProductInterventionRequestOnlinePurchaseDetails(address=" + this.address + ", productUrl=" + this.productUrl + ", sellerName=" + this.sellerName + ')';
    }

    public ReportProductInterventionRequestOnlinePurchaseDetails(ReportProductInterventionRequestAddressRequest reportProductInterventionRequestAddressRequest, String str, String str2) {
        this.address = reportProductInterventionRequestAddressRequest;
        this.productUrl = str;
        this.sellerName = str2;
    }

    public /* synthetic */ ReportProductInterventionRequestOnlinePurchaseDetails(ReportProductInterventionRequestAddressRequest reportProductInterventionRequestAddressRequest, String str, String str2, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : reportProductInterventionRequestAddressRequest, (i15 & 2) != 0 ? null : str, (i15 & 4) != 0 ? null : str2);
    }
}
