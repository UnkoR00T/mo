package js0;

import java.math.BigDecimal;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: js0.y0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u0018"}, d2 = {"Ljs0/y0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "gateway", "b", "gatewayMerchantId", "Ljava/math/BigDecimal;", "c", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "totalAmount", "d", "transactionId", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StartGooglePayPaymentResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("gateway")
    private final String gateway;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("gatewayMerchantId")
    private final String gatewayMerchantId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("totalAmount")
    private final BigDecimal totalAmount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("transactionId")
    private final String transactionId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getGateway() {
        return this.gateway;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getGatewayMerchantId() {
        return this.gatewayMerchantId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartGooglePayPaymentResponse)) {
            return false;
        }
        StartGooglePayPaymentResponse startGooglePayPaymentResponse = (StartGooglePayPaymentResponse) other;
        return fr.t.c(this.gateway, startGooglePayPaymentResponse.gateway) && fr.t.c(this.gatewayMerchantId, startGooglePayPaymentResponse.gatewayMerchantId) && fr.t.c(this.totalAmount, startGooglePayPaymentResponse.totalAmount) && fr.t.c(this.transactionId, startGooglePayPaymentResponse.transactionId);
    }

    public int hashCode() {
        return (((((this.gateway.hashCode() * 31) + this.gatewayMerchantId.hashCode()) * 31) + this.totalAmount.hashCode()) * 31) + this.transactionId.hashCode();
    }

    public String toString() {
        return "StartGooglePayPaymentResponse(gateway=" + this.gateway + ", gatewayMerchantId=" + this.gatewayMerchantId + ", totalAmount=" + this.totalAmount + ", transactionId=" + this.transactionId + ')';
    }
}
