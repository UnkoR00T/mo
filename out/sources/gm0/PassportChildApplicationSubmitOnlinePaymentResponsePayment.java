package gm0;

import java.math.BigDecimal;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.z4, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0004R\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001f\u0010\u0004R\u001a\u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b!\u0010\u0004R\u001a\u0010$\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b#\u0010\u0004¨\u0006%"}, d2 = {"Lgm0/z4;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "amount", "", "Lgm0/j;", "b", "Ljava/util/List;", "()Ljava/util/List;", "availablePaymentMethods", "Lgm0/v1;", "c", "Lgm0/v1;", "()Lgm0/v1;", "currency", "d", "Ljava/lang/String;", "description", "e", "institutionId", "f", "institutionName", "g", "paymentId", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PassportChildApplicationSubmitOnlinePaymentResponsePayment {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("amount")
    private final BigDecimal amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("availablePaymentMethods")
    private final List<j> availablePaymentMethods;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("currency")
    private final v1 currency;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("description")
    private final String description;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("institutionId")
    private final String institutionId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("institutionName")
    private final String institutionName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("paymentId")
    private final String paymentId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final List<j> b() {
        return this.availablePaymentMethods;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final v1 getCurrency() {
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
        if (!(other instanceof PassportChildApplicationSubmitOnlinePaymentResponsePayment)) {
            return false;
        }
        PassportChildApplicationSubmitOnlinePaymentResponsePayment passportChildApplicationSubmitOnlinePaymentResponsePayment = (PassportChildApplicationSubmitOnlinePaymentResponsePayment) other;
        return fr.t.c(this.amount, passportChildApplicationSubmitOnlinePaymentResponsePayment.amount) && fr.t.c(this.availablePaymentMethods, passportChildApplicationSubmitOnlinePaymentResponsePayment.availablePaymentMethods) && this.currency == passportChildApplicationSubmitOnlinePaymentResponsePayment.currency && fr.t.c(this.description, passportChildApplicationSubmitOnlinePaymentResponsePayment.description) && fr.t.c(this.institutionId, passportChildApplicationSubmitOnlinePaymentResponsePayment.institutionId) && fr.t.c(this.institutionName, passportChildApplicationSubmitOnlinePaymentResponsePayment.institutionName) && fr.t.c(this.paymentId, passportChildApplicationSubmitOnlinePaymentResponsePayment.paymentId);
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
        return "PassportChildApplicationSubmitOnlinePaymentResponsePayment(amount=" + this.amount + ", availablePaymentMethods=" + this.availablePaymentMethods + ", currency=" + this.currency + ", description=" + this.description + ", institutionId=" + this.institutionId + ", institutionName=" + this.institutionName + ", paymentId=" + this.paymentId + ')';
    }
}
