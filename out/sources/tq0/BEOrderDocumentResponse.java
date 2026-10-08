package tq0;

import java.math.BigDecimal;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: tq0.i, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001aBM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\u0012R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b\"\u0010\u0012R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b#\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b$\u0010\u0012R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b%\u0010\u0012R\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b&\u0010\u0012¨\u0006'"}, d2 = {"Ltq0/i;", "", "Ljava/math/BigDecimal;", "amount", "", "Ltq0/i$a;", "availablePaymentMethods", "", "currency", "description", "institutionId", "institutionName", "Ltq0/j;", "orderId", "paymentId", "<init>", "(Ljava/math/BigDecimal;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Ljava/lang/String;", "d", "e", "f", "g", "h", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEOrderDocumentResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BigDecimal amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<a> availablePaymentMethods;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currency;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String institutionId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String institutionName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentId;

    /* JADX INFO: renamed from: tq0.i$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Ltq0/i$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        BLIK_T6_CODE,
        BLIK_ONE_CLICK,
        CARD,
        WALLET_GP,
        WALLET_AP,
        UNKNOWN;


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ wq.a f191452h = wq.b.a(b());
    }

    public /* synthetic */ BEOrderDocumentResponse(BigDecimal bigDecimal, List list, String str, String str2, String str3, String str4, String str5, String str6, fr.k kVar) {
        this(bigDecimal, list, str, str2, str3, str4, str5, str6);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final List<a> b() {
        return this.availablePaymentMethods;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCurrency() {
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
        if (!(other instanceof BEOrderDocumentResponse)) {
            return false;
        }
        BEOrderDocumentResponse bEOrderDocumentResponse = (BEOrderDocumentResponse) other;
        return fr.t.c(this.amount, bEOrderDocumentResponse.amount) && fr.t.c(this.availablePaymentMethods, bEOrderDocumentResponse.availablePaymentMethods) && fr.t.c(this.currency, bEOrderDocumentResponse.currency) && fr.t.c(this.description, bEOrderDocumentResponse.description) && fr.t.c(this.institutionId, bEOrderDocumentResponse.institutionId) && fr.t.c(this.institutionName, bEOrderDocumentResponse.institutionName) && j.d(this.orderId, bEOrderDocumentResponse.orderId) && fr.t.c(this.paymentId, bEOrderDocumentResponse.paymentId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getInstitutionName() {
        return this.institutionName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    public int hashCode() {
        return (((((((((((((this.amount.hashCode() * 31) + this.availablePaymentMethods.hashCode()) * 31) + this.currency.hashCode()) * 31) + this.description.hashCode()) * 31) + this.institutionId.hashCode()) * 31) + this.institutionName.hashCode()) * 31) + j.e(this.orderId)) * 31) + this.paymentId.hashCode();
    }

    public String toString() {
        return "BEOrderDocumentResponse(amount=" + this.amount + ", availablePaymentMethods=" + this.availablePaymentMethods + ", currency=" + this.currency + ", description=" + this.description + ", institutionId=" + this.institutionId + ", institutionName=" + this.institutionName + ", orderId=" + j.f(this.orderId) + ", paymentId=" + this.paymentId + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private BEOrderDocumentResponse(BigDecimal bigDecimal, List<? extends a> list, String str, String str2, String str3, String str4, String str5, String str6) {
        this.amount = bigDecimal;
        this.availablePaymentMethods = list;
        this.currency = str;
        this.description = str2;
        this.institutionId = str3;
        this.institutionName = str4;
        this.orderId = str5;
        this.paymentId = str6;
    }
}
