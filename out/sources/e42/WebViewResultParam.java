package e42;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: e42.c, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019¨\u0006\u001a"}, d2 = {"Le42/c;", "", "", "isSuccess", "", "referenceId", "Le42/b;", "paymentCardRequiredData", "<init>", "(ZLjava/lang/String;Le42/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Ljava/lang/String;", "Le42/b;", "()Le42/b;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WebViewResultParam {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSuccess;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String referenceId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentCardRequiredData paymentCardRequiredData;

    public WebViewResultParam(boolean z15, String str, PaymentCardRequiredData paymentCardRequiredData) {
        this.isSuccess = z15;
        this.referenceId = str;
        this.paymentCardRequiredData = paymentCardRequiredData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final PaymentCardRequiredData getPaymentCardRequiredData() {
        return this.paymentCardRequiredData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getReferenceId() {
        return this.referenceId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebViewResultParam)) {
            return false;
        }
        WebViewResultParam webViewResultParam = (WebViewResultParam) other;
        return this.isSuccess == webViewResultParam.isSuccess && t.c(this.referenceId, webViewResultParam.referenceId) && t.c(this.paymentCardRequiredData, webViewResultParam.paymentCardRequiredData);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isSuccess) * 31) + this.referenceId.hashCode()) * 31) + this.paymentCardRequiredData.hashCode();
    }

    public String toString() {
        return "WebViewResultParam(isSuccess=" + this.isSuccess + ", referenceId=" + this.referenceId + ", paymentCardRequiredData=" + this.paymentCardRequiredData + ')';
    }
}
