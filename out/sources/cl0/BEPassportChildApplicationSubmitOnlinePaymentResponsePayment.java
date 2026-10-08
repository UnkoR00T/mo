package cl0;

import java.math.BigDecimal;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: cl0.c0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b$\u0010\u0011R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b%\u0010\u0011R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b&\u0010\u0011¨\u0006'"}, d2 = {"Lcl0/c0;", "", "Ljava/math/BigDecimal;", "amount", "", "Lcl0/a;", "availablePaymentMethods", "Lcl0/e;", "currency", "", "description", "institutionId", "institutionName", "paymentId", "<init>", "(Ljava/math/BigDecimal;Ljava/util/List;Lcl0/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Lcl0/e;", "()Lcl0/e;", "d", "Ljava/lang/String;", "e", "f", "g", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEPassportChildApplicationSubmitOnlinePaymentResponsePayment {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BigDecimal amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<a> availablePaymentMethods;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final e currency;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String institutionId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String institutionName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentId;

    /* JADX WARN: Multi-variable type inference failed */
    public BEPassportChildApplicationSubmitOnlinePaymentResponsePayment(BigDecimal bigDecimal, List<? extends a> list, e eVar, String str, String str2, String str3, String str4) {
        this.amount = bigDecimal;
        this.availablePaymentMethods = list;
        this.currency = eVar;
        this.description = str;
        this.institutionId = str2;
        this.institutionName = str3;
        this.paymentId = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final List<a> b() {
        return this.availablePaymentMethods;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getInstitutionId() {
        return this.institutionId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEPassportChildApplicationSubmitOnlinePaymentResponsePayment)) {
            return false;
        }
        BEPassportChildApplicationSubmitOnlinePaymentResponsePayment bEPassportChildApplicationSubmitOnlinePaymentResponsePayment = (BEPassportChildApplicationSubmitOnlinePaymentResponsePayment) other;
        return fr.t.c(this.amount, bEPassportChildApplicationSubmitOnlinePaymentResponsePayment.amount) && fr.t.c(this.availablePaymentMethods, bEPassportChildApplicationSubmitOnlinePaymentResponsePayment.availablePaymentMethods) && this.currency == bEPassportChildApplicationSubmitOnlinePaymentResponsePayment.currency && fr.t.c(this.description, bEPassportChildApplicationSubmitOnlinePaymentResponsePayment.description) && fr.t.c(this.institutionId, bEPassportChildApplicationSubmitOnlinePaymentResponsePayment.institutionId) && fr.t.c(this.institutionName, bEPassportChildApplicationSubmitOnlinePaymentResponsePayment.institutionName) && fr.t.c(this.paymentId, bEPassportChildApplicationSubmitOnlinePaymentResponsePayment.paymentId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getInstitutionName() {
        return this.institutionName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    public int hashCode() {
        return (((((((((((this.amount.hashCode() * 31) + this.availablePaymentMethods.hashCode()) * 31) + this.currency.hashCode()) * 31) + this.description.hashCode()) * 31) + this.institutionId.hashCode()) * 31) + this.institutionName.hashCode()) * 31) + this.paymentId.hashCode();
    }

    public String toString() {
        return "BEPassportChildApplicationSubmitOnlinePaymentResponsePayment(amount=" + this.amount + ", availablePaymentMethods=" + this.availablePaymentMethods + ", currency=" + this.currency + ", description=" + this.description + ", institutionId=" + this.institutionId + ", institutionName=" + this.institutionName + ", paymentId=" + this.paymentId + ")";
    }
}
