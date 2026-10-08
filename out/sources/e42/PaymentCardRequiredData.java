package e42;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: e42.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Le42/b;", "", "", "sourcePaymentId", "", "paymentIds", "institutionId", "paymentTitle", "amountWithCurrency", "", "shouldBackToPaymentDetails", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "e", "Z", "()Z", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentCardRequiredData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sourcePaymentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> paymentIds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String institutionId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentTitle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String amountWithCurrency;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldBackToPaymentDetails;

    public PaymentCardRequiredData(String str, List<String> list, String str2, String str3, String str4, boolean z15) {
        this.sourcePaymentId = str;
        this.paymentIds = list;
        this.institutionId = str2;
        this.paymentTitle = str3;
        this.amountWithCurrency = str4;
        this.shouldBackToPaymentDetails = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAmountWithCurrency() {
        return this.amountWithCurrency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInstitutionId() {
        return this.institutionId;
    }

    public final List<String> c() {
        return this.paymentIds;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPaymentTitle() {
        return this.paymentTitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShouldBackToPaymentDetails() {
        return this.shouldBackToPaymentDetails;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentCardRequiredData)) {
            return false;
        }
        PaymentCardRequiredData paymentCardRequiredData = (PaymentCardRequiredData) other;
        return t.c(this.sourcePaymentId, paymentCardRequiredData.sourcePaymentId) && t.c(this.paymentIds, paymentCardRequiredData.paymentIds) && t.c(this.institutionId, paymentCardRequiredData.institutionId) && t.c(this.paymentTitle, paymentCardRequiredData.paymentTitle) && t.c(this.amountWithCurrency, paymentCardRequiredData.amountWithCurrency) && this.shouldBackToPaymentDetails == paymentCardRequiredData.shouldBackToPaymentDetails;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSourcePaymentId() {
        return this.sourcePaymentId;
    }

    public int hashCode() {
        return (((((((((this.sourcePaymentId.hashCode() * 31) + this.paymentIds.hashCode()) * 31) + this.institutionId.hashCode()) * 31) + this.paymentTitle.hashCode()) * 31) + this.amountWithCurrency.hashCode()) * 31) + Boolean.hashCode(this.shouldBackToPaymentDetails);
    }

    public String toString() {
        return "PaymentCardRequiredData(sourcePaymentId=" + this.sourcePaymentId + ", paymentIds=" + this.paymentIds + ", institutionId=" + this.institutionId + ", paymentTitle=" + this.paymentTitle + ", amountWithCurrency=" + this.amountWithCurrency + ", shouldBackToPaymentDetails=" + this.shouldBackToPaymentDetails + ')';
    }
}
