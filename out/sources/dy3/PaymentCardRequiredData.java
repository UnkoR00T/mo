package dy3;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: dy3.c, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\f¨\u0006\u001c"}, d2 = {"Ldy3/c;", "", "", "sourcePaymentId", "", "paymentIds", "institutionId", "paymentTitle", "amountWithCurrency", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    public PaymentCardRequiredData(String str, List<String> list, String str2, String str3, String str4) {
        this.sourcePaymentId = str;
        this.paymentIds = list;
        this.institutionId = str2;
        this.paymentTitle = str3;
        this.amountWithCurrency = str4;
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
    public final String getSourcePaymentId() {
        return this.sourcePaymentId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentCardRequiredData)) {
            return false;
        }
        PaymentCardRequiredData paymentCardRequiredData = (PaymentCardRequiredData) other;
        return t.c(this.sourcePaymentId, paymentCardRequiredData.sourcePaymentId) && t.c(this.paymentIds, paymentCardRequiredData.paymentIds) && t.c(this.institutionId, paymentCardRequiredData.institutionId) && t.c(this.paymentTitle, paymentCardRequiredData.paymentTitle) && t.c(this.amountWithCurrency, paymentCardRequiredData.amountWithCurrency);
    }

    public int hashCode() {
        return (((((((this.sourcePaymentId.hashCode() * 31) + this.paymentIds.hashCode()) * 31) + this.institutionId.hashCode()) * 31) + this.paymentTitle.hashCode()) * 31) + this.amountWithCurrency.hashCode();
    }

    public String toString() {
        return "PaymentCardRequiredData(sourcePaymentId=" + this.sourcePaymentId + ", paymentIds=" + this.paymentIds + ", institutionId=" + this.institutionId + ", paymentTitle=" + this.paymentTitle + ", amountWithCurrency=" + this.amountWithCurrency + ')';
    }
}
