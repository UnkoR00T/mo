package us0;

import fr.k;
import fr.t;
import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lus0/g;", "", "Lus0/g$a;", "Lts0/o;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g extends gz.b {

    /* JADX INFO: renamed from: us0.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lus0/g$a;", "Lgz/b$a;", "Ljava/time/LocalDate;", "dateFrom", "dateTo", "<init>", "(Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate dateFrom;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate dateTo;

        /* JADX WARN: Multi-variable type inference failed */
        public Params() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getDateFrom() {
            return this.dateFrom;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LocalDate getDateTo() {
            return this.dateTo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.dateFrom, params.dateFrom) && t.c(this.dateTo, params.dateTo);
        }

        public int hashCode() {
            LocalDate localDate = this.dateFrom;
            int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
            LocalDate localDate2 = this.dateTo;
            return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
        }

        public String toString() {
            return "Params(dateFrom=" + this.dateFrom + ", dateTo=" + this.dateTo + ")";
        }

        public Params(LocalDate localDate, LocalDate localDate2) {
            this.dateFrom = localDate;
            this.dateTo = localDate2;
        }

        public /* synthetic */ Params(LocalDate localDate, LocalDate localDate2, int i15, k kVar) {
            this((i15 & 1) != 0 ? null : localDate, (i15 & 2) != 0 ? null : localDate2);
        }
    }
}
