package ts0;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ts0.k, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0016"}, d2 = {"Lts0/k;", "", "Ljava/time/OffsetDateTime;", "dateFrom", "dateTo", "<init>", "(Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/OffsetDateTime;", "getDateFrom", "()Ljava/time/OffsetDateTime;", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RestrictionLock {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime dateFrom;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime dateTo;

    public RestrictionLock(OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2) {
        this.dateFrom = offsetDateTime;
        this.dateTo = offsetDateTime2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final OffsetDateTime getDateTo() {
        return this.dateTo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestrictionLock)) {
            return false;
        }
        RestrictionLock restrictionLock = (RestrictionLock) other;
        return fr.t.c(this.dateFrom, restrictionLock.dateFrom) && fr.t.c(this.dateTo, restrictionLock.dateTo);
    }

    public int hashCode() {
        return (this.dateFrom.hashCode() * 31) + this.dateTo.hashCode();
    }

    public String toString() {
        return "RestrictionLock(dateFrom=" + this.dateFrom + ", dateTo=" + this.dateTo + ")";
    }
}
