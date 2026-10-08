package xr0;

import fr.t;
import java.math.BigDecimal;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: xr0.h, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lxr0/h;", "", "", "gateway", "gatewayMerchantId", "Ljava/math/BigDecimal;", "totalAmount", "transactionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEStartGooglePayPaymentResponseModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String gateway;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String gatewayMerchantId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final BigDecimal totalAmount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionId;

    public BEStartGooglePayPaymentResponseModel(String str, String str2, BigDecimal bigDecimal, String str3) {
        this.gateway = str;
        this.gatewayMerchantId = str2;
        this.totalAmount = bigDecimal;
        this.transactionId = str3;
    }

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
        if (!(other instanceof BEStartGooglePayPaymentResponseModel)) {
            return false;
        }
        BEStartGooglePayPaymentResponseModel bEStartGooglePayPaymentResponseModel = (BEStartGooglePayPaymentResponseModel) other;
        return t.c(this.gateway, bEStartGooglePayPaymentResponseModel.gateway) && t.c(this.gatewayMerchantId, bEStartGooglePayPaymentResponseModel.gatewayMerchantId) && t.c(this.totalAmount, bEStartGooglePayPaymentResponseModel.totalAmount) && t.c(this.transactionId, bEStartGooglePayPaymentResponseModel.transactionId);
    }

    public int hashCode() {
        return (((((this.gateway.hashCode() * 31) + this.gatewayMerchantId.hashCode()) * 31) + this.totalAmount.hashCode()) * 31) + this.transactionId.hashCode();
    }

    public String toString() {
        return "BEStartGooglePayPaymentResponseModel(gateway=" + this.gateway + ", gatewayMerchantId=" + this.gatewayMerchantId + ", totalAmount=" + this.totalAmount + ", transactionId=" + this.transactionId + ")";
    }
}
