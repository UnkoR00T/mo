package fk0;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fk0.g1, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lfk0/g1;", "", "Ljava/time/LocalDate;", "from", "to", "<init>", "(Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "b", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BESuspensionPeriod {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate from;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate to;

    public BESuspensionPeriod(LocalDate localDate, LocalDate localDate2) {
        this.from = localDate;
        this.to = localDate2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getFrom() {
        return this.from;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getTo() {
        return this.to;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BESuspensionPeriod)) {
            return false;
        }
        BESuspensionPeriod bESuspensionPeriod = (BESuspensionPeriod) other;
        return fr.t.c(this.from, bESuspensionPeriod.from) && fr.t.c(this.to, bESuspensionPeriod.to);
    }

    public int hashCode() {
        LocalDate localDate = this.from;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.to;
        return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
    }

    public String toString() {
        return "BESuspensionPeriod(from=" + this.from + ", to=" + this.to + ')';
    }
}
