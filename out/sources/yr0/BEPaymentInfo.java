package yr0;

import fr.t;
import java.math.BigDecimal;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yr0.h, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b\u001a\u0010!R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\"\u0010(R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b&\u0010+¨\u0006,"}, d2 = {"Lyr0/h;", "", "", "paymentId", "institutionName", "description", "Ljava/math/BigDecimal;", "amount", "currencyCode", "Lyr0/m;", "paymentStatus", "Lyr0/j;", "paymentPackageSummary", "Lyr0/n;", "paymentType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Lyr0/m;Lyr0/j;Lyr0/n;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "getInstitutionName", "c", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "e", "f", "Lyr0/m;", "()Lyr0/m;", "g", "Lyr0/j;", "()Lyr0/j;", "h", "Lyr0/n;", "()Lyr0/n;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEPaymentInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String institutionName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final BigDecimal amount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currencyCode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final m paymentStatus;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPaymentPackageSummary paymentPackageSummary;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final n paymentType;

    public BEPaymentInfo(String str, String str2, String str3, BigDecimal bigDecimal, String str4, m mVar, BEPaymentPackageSummary bEPaymentPackageSummary, n nVar) {
        this.paymentId = str;
        this.institutionName = str2;
        this.description = str3;
        this.amount = bigDecimal;
        this.currencyCode = str4;
        this.paymentStatus = mVar;
        this.paymentPackageSummary = bEPaymentPackageSummary;
        this.paymentType = nVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final BEPaymentPackageSummary getPaymentPackageSummary() {
        return this.paymentPackageSummary;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEPaymentInfo)) {
            return false;
        }
        BEPaymentInfo bEPaymentInfo = (BEPaymentInfo) other;
        return t.c(this.paymentId, bEPaymentInfo.paymentId) && t.c(this.institutionName, bEPaymentInfo.institutionName) && t.c(this.description, bEPaymentInfo.description) && t.c(this.amount, bEPaymentInfo.amount) && t.c(this.currencyCode, bEPaymentInfo.currencyCode) && this.paymentStatus == bEPaymentInfo.paymentStatus && t.c(this.paymentPackageSummary, bEPaymentInfo.paymentPackageSummary) && this.paymentType == bEPaymentInfo.paymentType;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final m getPaymentStatus() {
        return this.paymentStatus;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final n getPaymentType() {
        return this.paymentType;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.paymentId.hashCode() * 31) + this.institutionName.hashCode()) * 31) + this.description.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.currencyCode.hashCode()) * 31) + this.paymentStatus.hashCode()) * 31;
        BEPaymentPackageSummary bEPaymentPackageSummary = this.paymentPackageSummary;
        return ((iHashCode + (bEPaymentPackageSummary == null ? 0 : bEPaymentPackageSummary.hashCode())) * 31) + this.paymentType.hashCode();
    }

    public String toString() {
        return "BEPaymentInfo(paymentId=" + this.paymentId + ", institutionName=" + this.institutionName + ", description=" + this.description + ", amount=" + this.amount + ", currencyCode=" + this.currencyCode + ", paymentStatus=" + this.paymentStatus + ", paymentPackageSummary=" + this.paymentPackageSummary + ", paymentType=" + this.paymentType + ")";
    }
}
