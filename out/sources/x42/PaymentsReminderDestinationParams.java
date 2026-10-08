package x42;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: x42.d, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b!\u0010\u0012R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b\u001a\u0010$¨\u0006("}, d2 = {"Lx42/d;", "", "", "sourcePaymentId", "Lx42/c;", "origin", "", "Lx42/a;", "paymentSummaries", "", "paymentPackageId", "institutionId", "institutionName", "Lyr0/a;", "availablePaymentMethods", "<init>", "(Ljava/lang/String;Lx42/c;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "b", "Lx42/c;", "d", "()Lx42/c;", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "Ljava/lang/Long;", "e", "()Ljava/lang/Long;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentsReminderDestinationParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sourcePaymentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final c origin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PaymentSummary> paymentSummaries;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long paymentPackageId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String institutionId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String institutionName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<yr0.a> availablePaymentMethods;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentsReminderDestinationParams(String str, c cVar, List<PaymentSummary> list, Long l15, String str2, String str3, List<? extends yr0.a> list2) {
        this.sourcePaymentId = str;
        this.origin = cVar;
        this.paymentSummaries = list;
        this.paymentPackageId = l15;
        this.institutionId = str2;
        this.institutionName = str3;
        this.availablePaymentMethods = list2;
    }

    public final List<yr0.a> a() {
        return this.availablePaymentMethods;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInstitutionId() {
        return this.institutionId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getInstitutionName() {
        return this.institutionName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getOrigin() {
        return this.origin;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getPaymentPackageId() {
        return this.paymentPackageId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentsReminderDestinationParams)) {
            return false;
        }
        PaymentsReminderDestinationParams paymentsReminderDestinationParams = (PaymentsReminderDestinationParams) other;
        return t.c(this.sourcePaymentId, paymentsReminderDestinationParams.sourcePaymentId) && this.origin == paymentsReminderDestinationParams.origin && t.c(this.paymentSummaries, paymentsReminderDestinationParams.paymentSummaries) && t.c(this.paymentPackageId, paymentsReminderDestinationParams.paymentPackageId) && t.c(this.institutionId, paymentsReminderDestinationParams.institutionId) && t.c(this.institutionName, paymentsReminderDestinationParams.institutionName) && t.c(this.availablePaymentMethods, paymentsReminderDestinationParams.availablePaymentMethods);
    }

    public final List<PaymentSummary> f() {
        return this.paymentSummaries;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSourcePaymentId() {
        return this.sourcePaymentId;
    }

    public int hashCode() {
        int iHashCode = ((((this.sourcePaymentId.hashCode() * 31) + this.origin.hashCode()) * 31) + this.paymentSummaries.hashCode()) * 31;
        Long l15 = this.paymentPackageId;
        return ((((((iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31) + this.institutionId.hashCode()) * 31) + this.institutionName.hashCode()) * 31) + this.availablePaymentMethods.hashCode();
    }

    public String toString() {
        return "PaymentsReminderDestinationParams(sourcePaymentId=" + this.sourcePaymentId + ", origin=" + this.origin + ", paymentSummaries=" + this.paymentSummaries + ", paymentPackageId=" + this.paymentPackageId + ", institutionId=" + this.institutionId + ", institutionName=" + this.institutionName + ", availablePaymentMethods=" + this.availablePaymentMethods + ')';
    }
}
