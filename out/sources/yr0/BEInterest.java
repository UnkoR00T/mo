package yr0;

import fr.t;
import java.math.BigDecimal;
import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yr0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lyr0/b;", "", "Ljava/math/BigDecimal;", "amount", "Ljava/time/LocalDate;", "dateFor", "<init>", "(Ljava/math/BigDecimal;Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "b", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEInterest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BigDecimal amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate dateFor;

    public BEInterest(BigDecimal bigDecimal, LocalDate localDate) {
        this.amount = bigDecimal;
        this.dateFor = localDate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getDateFor() {
        return this.dateFor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEInterest)) {
            return false;
        }
        BEInterest bEInterest = (BEInterest) other;
        return t.c(this.amount, bEInterest.amount) && t.c(this.dateFor, bEInterest.dateFor);
    }

    public int hashCode() {
        return (this.amount.hashCode() * 31) + this.dateFor.hashCode();
    }

    public String toString() {
        return "BEInterest(amount=" + this.amount + ", dateFor=" + this.dateFor + ")";
    }
}
