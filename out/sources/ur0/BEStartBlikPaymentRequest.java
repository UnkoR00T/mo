package ur0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ur0.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lur0/e;", "", "", "", "paymentsIds", "blikCode", "", "paymentPackageId", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "c", "Ljava/lang/Long;", "getPaymentPackageId", "()Ljava/lang/Long;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEStartBlikPaymentRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> paymentsIds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String blikCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long paymentPackageId;

    public BEStartBlikPaymentRequest(List<String> list, String str, Long l15) {
        this.paymentsIds = list;
        this.blikCode = str;
        this.paymentPackageId = l15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBlikCode() {
        return this.blikCode;
    }

    public final List<String> b() {
        return this.paymentsIds;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEStartBlikPaymentRequest)) {
            return false;
        }
        BEStartBlikPaymentRequest bEStartBlikPaymentRequest = (BEStartBlikPaymentRequest) other;
        return t.c(this.paymentsIds, bEStartBlikPaymentRequest.paymentsIds) && t.c(this.blikCode, bEStartBlikPaymentRequest.blikCode) && t.c(this.paymentPackageId, bEStartBlikPaymentRequest.paymentPackageId);
    }

    public int hashCode() {
        int iHashCode = ((this.paymentsIds.hashCode() * 31) + this.blikCode.hashCode()) * 31;
        Long l15 = this.paymentPackageId;
        return iHashCode + (l15 == null ? 0 : l15.hashCode());
    }

    public String toString() {
        return "BEStartBlikPaymentRequest(paymentsIds=" + this.paymentsIds + ", blikCode=" + this.blikCode + ", paymentPackageId=" + this.paymentPackageId + ")";
    }
}
