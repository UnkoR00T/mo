package q44;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: q44.e, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Lq44/e;", "", "", "nextPaymentDescription", "Lq44/b;", "nextPaymentStatus", "Lfz/b$c;", "nextPaymentDate", "<init>", "(Ljava/lang/String;Lq44/b;Lfz/b$c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lq44/b;", "c", "()Lq44/b;", "Lfz/b$c;", "()Lfz/b$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class More implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nextPaymentDescription;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b nextPaymentStatus;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate nextPaymentDate;

    public More(String str, b bVar, fz.b.LocalDate localDate) {
        this.nextPaymentDescription = str;
        this.nextPaymentStatus = bVar;
        this.nextPaymentDate = localDate;
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

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof More)) {
            return false;
        }
        More more = (More) other;
        return t.c(this.nextPaymentDescription, more.nextPaymentDescription) && this.nextPaymentStatus == more.nextPaymentStatus && t.c(this.nextPaymentDate, more.nextPaymentDate);
    }

    public int hashCode() {
        return (((this.nextPaymentDescription.hashCode() * 31) + this.nextPaymentStatus.hashCode()) * 31) + this.nextPaymentDate.hashCode();
    }

    public String toString() {
        return "More(nextPaymentDescription=" + this.nextPaymentDescription + ", nextPaymentStatus=" + this.nextPaymentStatus + ", nextPaymentDate=" + this.nextPaymentDate + ")";
    }
}
