package as0;

import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: as0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f¨\u0006 "}, d2 = {"Las0/a;", "", "", "transactionId", "Las0/e;", "paymentDetailsPaymentMethod", "Las0/f;", "transactionStatus", "Ljava/time/OffsetDateTime;", "createdAt", "<init>", "(Ljava/lang/String;Las0/e;Las0/f;Ljava/time/OffsetDateTime;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Las0/e;", "()Las0/e;", "Las0/f;", "d", "()Las0/f;", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BETransaction {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String transactionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final e paymentDetailsPaymentMethod;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final f transactionStatus;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime createdAt;

    public BETransaction(String str, e eVar, f fVar, OffsetDateTime offsetDateTime) {
        this.transactionId = str;
        this.paymentDetailsPaymentMethod = eVar;
        this.transactionStatus = fVar;
        this.createdAt = offsetDateTime;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e getPaymentDetailsPaymentMethod() {
        return this.paymentDetailsPaymentMethod;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final f getTransactionStatus() {
        return this.transactionStatus;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BETransaction)) {
            return false;
        }
        BETransaction bETransaction = (BETransaction) other;
        return t.c(this.transactionId, bETransaction.transactionId) && this.paymentDetailsPaymentMethod == bETransaction.paymentDetailsPaymentMethod && this.transactionStatus == bETransaction.transactionStatus && t.c(this.createdAt, bETransaction.createdAt);
    }

    public int hashCode() {
        return (((((this.transactionId.hashCode() * 31) + this.paymentDetailsPaymentMethod.hashCode()) * 31) + this.transactionStatus.hashCode()) * 31) + this.createdAt.hashCode();
    }

    public String toString() {
        return "BETransaction(transactionId=" + this.transactionId + ", paymentDetailsPaymentMethod=" + this.paymentDetailsPaymentMethod + ", transactionStatus=" + this.transactionStatus + ", createdAt=" + this.createdAt + ")";
    }
}
