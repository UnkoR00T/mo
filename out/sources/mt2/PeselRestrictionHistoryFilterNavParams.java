package mt2;

import fr.t;
import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: mt2.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lmt2/a;", "", "Lit2/a;", "peselRestrictionHistoryControllerState", "Ljava/time/LocalDate;", "filterDateFrom", "filterDateTo", "<init>", "(Lit2/a;Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lit2/a;", "c", "()Lit2/a;", "b", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PeselRestrictionHistoryFilterNavParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final it2.a peselRestrictionHistoryControllerState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate filterDateFrom;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate filterDateTo;

    public PeselRestrictionHistoryFilterNavParams(it2.a aVar, LocalDate localDate, LocalDate localDate2) {
        this.peselRestrictionHistoryControllerState = aVar;
        this.filterDateFrom = localDate;
        this.filterDateTo = localDate2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getFilterDateFrom() {
        return this.filterDateFrom;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getFilterDateTo() {
        return this.filterDateTo;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final it2.a getPeselRestrictionHistoryControllerState() {
        return this.peselRestrictionHistoryControllerState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PeselRestrictionHistoryFilterNavParams)) {
            return false;
        }
        PeselRestrictionHistoryFilterNavParams peselRestrictionHistoryFilterNavParams = (PeselRestrictionHistoryFilterNavParams) other;
        return this.peselRestrictionHistoryControllerState == peselRestrictionHistoryFilterNavParams.peselRestrictionHistoryControllerState && t.c(this.filterDateFrom, peselRestrictionHistoryFilterNavParams.filterDateFrom) && t.c(this.filterDateTo, peselRestrictionHistoryFilterNavParams.filterDateTo);
    }

    public int hashCode() {
        int iHashCode = this.peselRestrictionHistoryControllerState.hashCode() * 31;
        LocalDate localDate = this.filterDateFrom;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.filterDateTo;
        return iHashCode2 + (localDate2 != null ? localDate2.hashCode() : 0);
    }

    public String toString() {
        return "PeselRestrictionHistoryFilterNavParams(peselRestrictionHistoryControllerState=" + this.peselRestrictionHistoryControllerState + ", filterDateFrom=" + this.filterDateFrom + ", filterDateTo=" + this.filterDateTo + ')';
    }
}
