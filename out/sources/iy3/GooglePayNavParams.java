package iy3;

import fr.t;
import mx.Label;
import p071kotlin.Metadata;
import xr0.BEGooglePaySendPaymentTokenRequestModel;

/* JADX INFO: renamed from: iy3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Liy3/a;", "", "", "paymentId", "Lmx/a;", "paymentTitle", "paymentAmount", "Lxr0/c;", "googlePaySendPaymentTokenRequestModel", "<init>", "(Ljava/lang/String;Lmx/a;Lmx/a;Lxr0/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lmx/a;", "d", "()Lmx/a;", "Lxr0/c;", "()Lxr0/c;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GooglePayNavParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label paymentTitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label paymentAmount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEGooglePaySendPaymentTokenRequestModel googlePaySendPaymentTokenRequestModel;

    public GooglePayNavParams(String str, Label label, Label label2, BEGooglePaySendPaymentTokenRequestModel bEGooglePaySendPaymentTokenRequestModel) {
        this.paymentId = str;
        this.paymentTitle = label;
        this.paymentAmount = label2;
        this.googlePaySendPaymentTokenRequestModel = bEGooglePaySendPaymentTokenRequestModel;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BEGooglePaySendPaymentTokenRequestModel getGooglePaySendPaymentTokenRequestModel() {
        return this.googlePaySendPaymentTokenRequestModel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getPaymentAmount() {
        return this.paymentAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getPaymentTitle() {
        return this.paymentTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GooglePayNavParams)) {
            return false;
        }
        GooglePayNavParams googlePayNavParams = (GooglePayNavParams) other;
        return t.c(this.paymentId, googlePayNavParams.paymentId) && t.c(this.paymentTitle, googlePayNavParams.paymentTitle) && t.c(this.paymentAmount, googlePayNavParams.paymentAmount) && t.c(this.googlePaySendPaymentTokenRequestModel, googlePayNavParams.googlePaySendPaymentTokenRequestModel);
    }

    public int hashCode() {
        return (((((this.paymentId.hashCode() * 31) + this.paymentTitle.hashCode()) * 31) + this.paymentAmount.hashCode()) * 31) + this.googlePaySendPaymentTokenRequestModel.hashCode();
    }

    public String toString() {
        return "GooglePayNavParams(paymentId=" + this.paymentId + ", paymentTitle=" + this.paymentTitle + ", paymentAmount=" + this.paymentAmount + ", googlePaySendPaymentTokenRequestModel=" + this.googlePaySendPaymentTokenRequestModel + ')';
    }
}
