package js0;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: js0.c1, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\rJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001a\u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\u0004R\u001a\u0010'\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u001c\u0010+\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010)\u001a\u0004\b\u0012\u0010*¨\u0006,"}, d2 = {"Ljs0/c1;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "amount", "Ljava/time/OffsetDateTime;", "b", "Ljava/time/OffsetDateTime;", "c", "()Ljava/time/OffsetDateTime;", "createdAt", "Z", "g", "()Z", "isEpoAvailable", "Ljs0/c1$a;", "d", "Ljs0/c1$a;", "()Ljs0/c1$a;", "paymentMethod", "e", "Ljava/lang/String;", "transactionId", "Ljs0/e1;", "f", "Ljs0/e1;", "()Ljs0/e1;", "transactionStatus", "Ljs0/b1;", "Ljs0/b1;", "()Ljs0/b1;", "cardDetails", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionDetailsDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("amount")
    private final BigDecimal amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("createdAt")
    private final OffsetDateTime createdAt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("isEpoAvailable")
    private final boolean isEpoAvailable;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("paymentMethod")
    private final a paymentMethod;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("transactionId")
    private final String transactionId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("transactionStatus")
    private final e1 transactionStatus;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("cardDetails")
    private final TransactionCardDetailsDto cardDetails;

    /* JADX INFO: renamed from: js0.c1$a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Ljs0/c1$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "b", "c", "d", "e", "f", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        BLIK("BLIK"),
        CARD("CARD"),
        WALLET_GP("WALLET_GP"),
        WALLET_AP("WALLET_AP"),
        UNKNOWN("UNKNOWN");


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ wq.a f104865h = wq.b.a(b());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        a(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TransactionCardDetailsDto getCardDetails() {
        return this.cardDetails;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a getPaymentMethod() {
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
        if (!(other instanceof TransactionDetailsDto)) {
            return false;
        }
        TransactionDetailsDto transactionDetailsDto = (TransactionDetailsDto) other;
        return fr.t.c(this.amount, transactionDetailsDto.amount) && fr.t.c(this.createdAt, transactionDetailsDto.createdAt) && this.isEpoAvailable == transactionDetailsDto.isEpoAvailable && this.paymentMethod == transactionDetailsDto.paymentMethod && fr.t.c(this.transactionId, transactionDetailsDto.transactionId) && this.transactionStatus == transactionDetailsDto.transactionStatus && fr.t.c(this.cardDetails, transactionDetailsDto.cardDetails);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final e1 getTransactionStatus() {
        return this.transactionStatus;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsEpoAvailable() {
        return this.isEpoAvailable;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.amount.hashCode() * 31) + this.createdAt.hashCode()) * 31) + Boolean.hashCode(this.isEpoAvailable)) * 31) + this.paymentMethod.hashCode()) * 31) + this.transactionId.hashCode()) * 31) + this.transactionStatus.hashCode()) * 31;
        TransactionCardDetailsDto transactionCardDetailsDto = this.cardDetails;
        return iHashCode + (transactionCardDetailsDto == null ? 0 : transactionCardDetailsDto.hashCode());
    }

    public String toString() {
        return "TransactionDetailsDto(amount=" + this.amount + ", createdAt=" + this.createdAt + ", isEpoAvailable=" + this.isEpoAvailable + ", paymentMethod=" + this.paymentMethod + ", transactionId=" + this.transactionId + ", transactionStatus=" + this.transactionStatus + ", cardDetails=" + this.cardDetails + ')';
    }
}
