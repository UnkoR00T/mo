package as0;

import fr.t;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: as0.c, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010%\u001a\u0004\b!\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010'\u001a\u0004\b\u001a\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b\u001d\u0010-¨\u0006."}, d2 = {"Las0/c;", "", "", "transactionId", "Las0/d;", "paymentMethod", "Las0/f;", "transactionStatus", "Ljava/time/OffsetDateTime;", "createdAt", "Ljava/math/BigDecimal;", "amount", "", "isEpoAvailable", "Las0/b;", "cardDetails", "<init>", "(Ljava/lang/String;Las0/d;Las0/f;Ljava/time/OffsetDateTime;Ljava/math/BigDecimal;ZLas0/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Las0/d;", "d", "()Las0/d;", "c", "Las0/f;", "f", "()Las0/f;", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "Z", "g", "()Z", "Las0/b;", "()Las0/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BETransactionDetailsDomain {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final d paymentMethod;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final f transactionStatus;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime createdAt;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final BigDecimal amount;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEpoAvailable;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final BETransactionCardDetails cardDetails;

    public BETransactionDetailsDomain(String str, d dVar, f fVar, OffsetDateTime offsetDateTime, BigDecimal bigDecimal, boolean z15, BETransactionCardDetails bETransactionCardDetails) {
        this.transactionId = str;
        this.paymentMethod = dVar;
        this.transactionStatus = fVar;
        this.createdAt = offsetDateTime;
        this.amount = bigDecimal;
        this.isEpoAvailable = z15;
        this.cardDetails = bETransactionCardDetails;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BETransactionCardDetails getCardDetails() {
        return this.cardDetails;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BETransactionDetailsDomain)) {
            return false;
        }
        BETransactionDetailsDomain bETransactionDetailsDomain = (BETransactionDetailsDomain) other;
        return t.c(this.transactionId, bETransactionDetailsDomain.transactionId) && this.paymentMethod == bETransactionDetailsDomain.paymentMethod && this.transactionStatus == bETransactionDetailsDomain.transactionStatus && t.c(this.createdAt, bETransactionDetailsDomain.createdAt) && t.c(this.amount, bETransactionDetailsDomain.amount) && this.isEpoAvailable == bETransactionDetailsDomain.isEpoAvailable && t.c(this.cardDetails, bETransactionDetailsDomain.cardDetails);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final f getTransactionStatus() {
        return this.transactionStatus;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsEpoAvailable() {
        return this.isEpoAvailable;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.transactionId.hashCode() * 31) + this.paymentMethod.hashCode()) * 31) + this.transactionStatus.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.amount.hashCode()) * 31) + Boolean.hashCode(this.isEpoAvailable)) * 31;
        BETransactionCardDetails bETransactionCardDetails = this.cardDetails;
        return iHashCode + (bETransactionCardDetails == null ? 0 : bETransactionCardDetails.hashCode());
    }

    public String toString() {
        return "BETransactionDetailsDomain(transactionId=" + this.transactionId + ", paymentMethod=" + this.paymentMethod + ", transactionStatus=" + this.transactionStatus + ", createdAt=" + this.createdAt + ", amount=" + this.amount + ", isEpoAvailable=" + this.isEpoAvailable + ", cardDetails=" + this.cardDetails + ")";
    }
}
