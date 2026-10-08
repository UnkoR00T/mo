package tq0;

import java.math.BigDecimal;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: tq0.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\f¨\u0006\u0016"}, d2 = {"Ltq0/e;", "", "Ljava/math/BigDecimal;", "amount", "", "total", "<init>", "(Ljava/math/BigDecimal;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "b", "I", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BELandRegisterDocumentCumulatedSubtypeFee {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BigDecimal amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int total;

    public BELandRegisterDocumentCumulatedSubtypeFee(BigDecimal bigDecimal, int i15) {
        this.amount = bigDecimal;
        this.total = i15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BELandRegisterDocumentCumulatedSubtypeFee)) {
            return false;
        }
        BELandRegisterDocumentCumulatedSubtypeFee bELandRegisterDocumentCumulatedSubtypeFee = (BELandRegisterDocumentCumulatedSubtypeFee) other;
        return fr.t.c(this.amount, bELandRegisterDocumentCumulatedSubtypeFee.amount) && this.total == bELandRegisterDocumentCumulatedSubtypeFee.total;
    }

    public int hashCode() {
        return (this.amount.hashCode() * 31) + Integer.hashCode(this.total);
    }

    public String toString() {
        return "BELandRegisterDocumentCumulatedSubtypeFee(amount=" + this.amount + ", total=" + this.total + ")";
    }
}
