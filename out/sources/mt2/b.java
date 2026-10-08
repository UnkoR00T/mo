package mt2;

import fr.t;
import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lmt2/b;", "", "b", "a", "Lmt2/b$a;", "Lmt2/b$b;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: mt2.b$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lmt2/b$a;", "Lmt2/b;", "Lit2/a;", "peselRestrictionHistoryControllerState", "Ljava/time/LocalDate;", "filterDateFrom", "filterDateTo", "<init>", "(Lit2/a;Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lit2/a;", "c", "()Lit2/a;", "b", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FromFilter implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final it2.a peselRestrictionHistoryControllerState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate filterDateFrom;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate filterDateTo;

        public FromFilter(it2.a aVar, LocalDate localDate, LocalDate localDate2) {
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
            if (!(other instanceof FromFilter)) {
                return false;
            }
            FromFilter fromFilter = (FromFilter) other;
            return this.peselRestrictionHistoryControllerState == fromFilter.peselRestrictionHistoryControllerState && t.c(this.filterDateFrom, fromFilter.filterDateFrom) && t.c(this.filterDateTo, fromFilter.filterDateTo);
        }

        public int hashCode() {
            int iHashCode = this.peselRestrictionHistoryControllerState.hashCode() * 31;
            LocalDate localDate = this.filterDateFrom;
            int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
            LocalDate localDate2 = this.filterDateTo;
            return iHashCode2 + (localDate2 != null ? localDate2.hashCode() : 0);
        }

        public String toString() {
            return "FromFilter(peselRestrictionHistoryControllerState=" + this.peselRestrictionHistoryControllerState + ", filterDateFrom=" + this.filterDateFrom + ", filterDateTo=" + this.filterDateTo + ')';
        }
    }

    /* JADX INFO: renamed from: mt2.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lmt2/b$b;", "Lmt2/b;", "Lit2/a;", "peselRestrictionHistoryControllerState", "<init>", "(Lit2/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lit2/a;", "()Lit2/a;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FromRestrictionStatus implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final it2.a peselRestrictionHistoryControllerState;

        public FromRestrictionStatus(it2.a aVar) {
            this.peselRestrictionHistoryControllerState = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final it2.a getPeselRestrictionHistoryControllerState() {
            return this.peselRestrictionHistoryControllerState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FromRestrictionStatus) && this.peselRestrictionHistoryControllerState == ((FromRestrictionStatus) other).peselRestrictionHistoryControllerState;
        }

        public int hashCode() {
            return this.peselRestrictionHistoryControllerState.hashCode();
        }

        public String toString() {
            return "FromRestrictionStatus(peselRestrictionHistoryControllerState=" + this.peselRestrictionHistoryControllerState + ')';
        }
    }
}
