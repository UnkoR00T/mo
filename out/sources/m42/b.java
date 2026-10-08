package m42;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lm42/b;", "", "a", "b", "Lm42/b$a;", "Lm42/b$b;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: m42.b$a, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lm42/b$a;", "Lm42/b;", "", "sourcePaymentId", "paymentTitle", "amountWithCurrency", "", "paymentIds", "institutionId", "", "shouldBackToDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "d", "c", "Ljava/util/List;", "()Ljava/util/List;", "e", "Z", "()Z", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentCards implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sourcePaymentId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String paymentTitle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String amountWithCurrency;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> paymentIds;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String institutionId;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldBackToDetails;

        public PaymentCards(String str, String str2, String str3, List<String> list, String str4, boolean z15) {
            this.sourcePaymentId = str;
            this.paymentTitle = str2;
            this.amountWithCurrency = str3;
            this.paymentIds = list;
            this.institutionId = str4;
            this.shouldBackToDetails = z15;
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
        public final boolean getShouldBackToDetails() {
            return this.shouldBackToDetails;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentCards)) {
                return false;
            }
            PaymentCards paymentCards = (PaymentCards) other;
            return t.c(this.sourcePaymentId, paymentCards.sourcePaymentId) && t.c(this.paymentTitle, paymentCards.paymentTitle) && t.c(this.amountWithCurrency, paymentCards.amountWithCurrency) && t.c(this.paymentIds, paymentCards.paymentIds) && t.c(this.institutionId, paymentCards.institutionId) && this.shouldBackToDetails == paymentCards.shouldBackToDetails;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSourcePaymentId() {
            return this.sourcePaymentId;
        }

        public int hashCode() {
            return (((((((((this.sourcePaymentId.hashCode() * 31) + this.paymentTitle.hashCode()) * 31) + this.amountWithCurrency.hashCode()) * 31) + this.paymentIds.hashCode()) * 31) + this.institutionId.hashCode()) * 31) + Boolean.hashCode(this.shouldBackToDetails);
        }

        public String toString() {
            return "PaymentCards(sourcePaymentId=" + this.sourcePaymentId + ", paymentTitle=" + this.paymentTitle + ", amountWithCurrency=" + this.amountWithCurrency + ", paymentIds=" + this.paymentIds + ", institutionId=" + this.institutionId + ", shouldBackToDetails=" + this.shouldBackToDetails + ')';
        }
    }

    /* JADX INFO: renamed from: m42.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lm42/b$b;", "Lm42/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C3026b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3026b f123756a = new C3026b();

        private C3026b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C3026b);
        }

        public int hashCode() {
            return 205697843;
        }

        public String toString() {
            return "YourCards";
        }
    }
}
