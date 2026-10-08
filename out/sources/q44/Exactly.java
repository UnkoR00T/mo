package q44;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: q44.d, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0014\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u000f¨\u0006\u001e"}, d2 = {"Lq44/d;", "", "", "nextPaymentDescription", "Lq44/b;", "nextPaymentStatus", "Lfz/b$c;", "nextPaymentDate", "", "paymentCount", "<init>", "(Ljava/lang/String;Lq44/b;Lfz/b$c;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lq44/b;", "c", "()Lq44/b;", "Lfz/b$c;", "()Lfz/b$c;", "d", "I", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Exactly implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nextPaymentDescription;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b nextPaymentStatus;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate nextPaymentDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int paymentCount;

    public Exactly(String str, b bVar, fz.b.LocalDate localDate, int i15) {
        this.nextPaymentDescription = str;
        this.nextPaymentStatus = bVar;
        this.nextPaymentDate = localDate;
        this.paymentCount = i15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public fz.b.LocalDate getNextPaymentDate() {
        return this.nextPaymentDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public String getNextPaymentDescription() {
        return this.nextPaymentDescription;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public b getNextPaymentStatus() {
        return this.nextPaymentStatus;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getPaymentCount() {
        return this.paymentCount;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Exactly)) {
            return false;
        }
        Exactly exactly = (Exactly) other;
        return t.c(this.nextPaymentDescription, exactly.nextPaymentDescription) && this.nextPaymentStatus == exactly.nextPaymentStatus && t.c(this.nextPaymentDate, exactly.nextPaymentDate) && this.paymentCount == exactly.paymentCount;
    }

    public int hashCode() {
        return (((((this.nextPaymentDescription.hashCode() * 31) + this.nextPaymentStatus.hashCode()) * 31) + this.nextPaymentDate.hashCode()) * 31) + Integer.hashCode(this.paymentCount);
    }

    public String toString() {
        return "Exactly(nextPaymentDescription=" + this.nextPaymentDescription + ", nextPaymentStatus=" + this.nextPaymentStatus + ", nextPaymentDate=" + this.nextPaymentDate + ", paymentCount=" + this.paymentCount + ")";
    }
}
