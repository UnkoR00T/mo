package js0;

import java.math.BigDecimal;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: js0.c0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u001c\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0004R\u001a\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0012\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010&\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b \u0010%R\u001a\u0010+\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b#\u0010*R \u00100\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010\u0012\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u0004R\u001c\u00103\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u000e\u001a\u0004\b2\u0010\u000fR\u001c\u00108\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b\u001d\u00107¨\u00069"}, d2 = {"Ljs0/c0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "amount", "b", "Ljava/lang/String;", "currency", "c", "description", "d", "id", "e", "Z", "getInstant", "()Z", "instant", "f", "getInstitutionId", "institutionId", "g", "institutionName", "Ljs0/i0;", "h", "Ljs0/i0;", "()Ljs0/i0;", "paymentType", "Ljs0/g0;", "i", "Ljs0/g0;", "()Ljs0/g0;", "status", "j", "getTitle", "getTitle$annotations", "()V", "title", "k", "getBaseAmount", "baseAmount", "Ljs0/e0;", "l", "Ljs0/e0;", "()Ljs0/e0;", "paymentPackageSummary", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("amount")
    private final BigDecimal amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("currency")
    private final String currency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("description")
    private final String description;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("id")
    private final String id;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("instant")
    private final boolean instant;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("institutionId")
    private final String institutionId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("institutionName")
    private final String institutionName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("paymentType")
    private final i0 paymentType;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("status")
    private final g0 status;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("title")
    private final String title;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("baseAmount")
    private final BigDecimal baseAmount;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("paymentPackageSummary")
    private final PaymentPackageSummaryDto paymentPackageSummary;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getInstitutionName() {
        return this.institutionName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentDto)) {
            return false;
        }
        PaymentDto paymentDto = (PaymentDto) other;
        return fr.t.c(this.amount, paymentDto.amount) && fr.t.c(this.currency, paymentDto.currency) && fr.t.c(this.description, paymentDto.description) && fr.t.c(this.id, paymentDto.id) && this.instant == paymentDto.instant && fr.t.c(this.institutionId, paymentDto.institutionId) && fr.t.c(this.institutionName, paymentDto.institutionName) && this.paymentType == paymentDto.paymentType && this.status == paymentDto.status && fr.t.c(this.title, paymentDto.title) && fr.t.c(this.baseAmount, paymentDto.baseAmount) && fr.t.c(this.paymentPackageSummary, paymentDto.paymentPackageSummary);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final PaymentPackageSummaryDto getPaymentPackageSummary() {
        return this.paymentPackageSummary;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final i0 getPaymentType() {
        return this.paymentType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final g0 getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((this.amount.hashCode() * 31) + this.currency.hashCode()) * 31) + this.description.hashCode()) * 31) + this.id.hashCode()) * 31) + Boolean.hashCode(this.instant)) * 31) + this.institutionId.hashCode()) * 31) + this.institutionName.hashCode()) * 31) + this.paymentType.hashCode()) * 31) + this.status.hashCode()) * 31) + this.title.hashCode()) * 31;
        BigDecimal bigDecimal = this.baseAmount;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        PaymentPackageSummaryDto paymentPackageSummaryDto = this.paymentPackageSummary;
        return iHashCode2 + (paymentPackageSummaryDto != null ? paymentPackageSummaryDto.hashCode() : 0);
    }

    public String toString() {
        return "PaymentDto(amount=" + this.amount + ", currency=" + this.currency + ", description=" + this.description + ", id=" + this.id + ", instant=" + this.instant + ", institutionId=" + this.institutionId + ", institutionName=" + this.institutionName + ", paymentType=" + this.paymentType + ", status=" + this.status + ", title=" + this.title + ", baseAmount=" + this.baseAmount + ", paymentPackageSummary=" + this.paymentPackageSummary + ')';
    }
}
