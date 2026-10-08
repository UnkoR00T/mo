package uw;

import fr.t;
import java.time.LocalDate;
import java.time.YearMonth;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Luw/j;", "", "b", "a", "Luw/j$a;", "Luw/j$b;", "dialog_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j {

    /* JADX INFO: renamed from: uw.j$b, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006#"}, d2 = {"Luw/j$b;", "Luw/j;", "Lmx/a;", "title", "Ljava/time/LocalDate;", "initialDate", "Lkotlin/Function1;", "Loq/i0;", "onDateChanged", "minimumDate", "maximumDate", "<init>", "(Lmx/a;Ljava/time/LocalDate;Ler/l;Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "e", "()Lmx/a;", "b", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "c", "Ler/l;", "d", "()Ler/l;", "dialog_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Single implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate initialDate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<LocalDate, i0> onDateChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate minimumDate;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate maximumDate;

        /* JADX WARN: Multi-variable type inference failed */
        public Single(Label label, LocalDate localDate, er.l<? super LocalDate, i0> lVar, LocalDate localDate2, LocalDate localDate3) {
            this.title = label;
            this.initialDate = localDate;
            this.onDateChanged = lVar;
            this.minimumDate = localDate2;
            this.maximumDate = localDate3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getInitialDate() {
            return this.initialDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LocalDate getMaximumDate() {
            return this.maximumDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final LocalDate getMinimumDate() {
            return this.minimumDate;
        }

        public final er.l<LocalDate, i0> d() {
            return this.onDateChanged;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Single)) {
                return false;
            }
            Single single = (Single) other;
            return t.c(this.title, single.title) && t.c(this.initialDate, single.initialDate) && t.c(this.onDateChanged, single.onDateChanged) && t.c(this.minimumDate, single.minimumDate) && t.c(this.maximumDate, single.maximumDate);
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            LocalDate localDate = this.initialDate;
            int iHashCode2 = (((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31) + this.onDateChanged.hashCode()) * 31;
            LocalDate localDate2 = this.minimumDate;
            int iHashCode3 = (iHashCode2 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
            LocalDate localDate3 = this.maximumDate;
            return iHashCode3 + (localDate3 != null ? localDate3.hashCode() : 0);
        }

        public String toString() {
            return "Single(title=" + this.title + ", initialDate=" + this.initialDate + ", onDateChanged=" + this.onDateChanged + ", minimumDate=" + this.minimumDate + ", maximumDate=" + this.maximumDate + ')';
        }

        public /* synthetic */ Single(Label label, LocalDate localDate, er.l lVar, LocalDate localDate2, LocalDate localDate3, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? c70.a.f23835a.a().g0() : label, (i15 & 2) != 0 ? null : localDate, lVar, (i15 & 8) != 0 ? null : localDate2, (i15 & 16) != 0 ? null : localDate3);
        }
    }

    /* JADX INFO: renamed from: uw.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001b\u0010$R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b%\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010)\u001a\u0004\b\"\u0010*¨\u0006+"}, d2 = {"Luw/j$a;", "Luw/j;", "Lmx/a;", "title", "Lfz/e$a;", "initialRange", "Lfz/b$i;", "initialDisplayedYearMonth", "Lkotlin/Function1;", "Loq/i0;", "onRangeChanged", "Ljava/time/LocalDate;", "minimumDate", "maximumDate", "<init>", "(Lmx/a;Lfz/e$a;Lfz/b$i;Ler/l;Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "f", "()Lmx/a;", "b", "Lfz/e$a;", "()Lfz/e$a;", "c", "Lfz/b$i;", "()Lfz/b$i;", "d", "Ler/l;", "e", "()Ler/l;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "dialog_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Range implements j {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f201831g = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.e.LocalDate initialRange;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.b.YearMonth initialDisplayedYearMonth;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<fz.e.LocalDate, i0> onRangeChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate minimumDate;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate maximumDate;

        /* JADX WARN: Multi-variable type inference failed */
        public Range(Label label, fz.e.LocalDate localDate, fz.b.YearMonth yearMonth, er.l<? super fz.e.LocalDate, i0> lVar, LocalDate localDate2, LocalDate localDate3) {
            this.title = label;
            this.initialRange = localDate;
            this.initialDisplayedYearMonth = yearMonth;
            this.onRangeChanged = lVar;
            this.minimumDate = localDate2;
            this.maximumDate = localDate3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final fz.b.YearMonth getInitialDisplayedYearMonth() {
            return this.initialDisplayedYearMonth;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final fz.e.LocalDate getInitialRange() {
            return this.initialRange;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final LocalDate getMaximumDate() {
            return this.maximumDate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final LocalDate getMinimumDate() {
            return this.minimumDate;
        }

        public final er.l<fz.e.LocalDate, i0> e() {
            return this.onRangeChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Range)) {
                return false;
            }
            Range range = (Range) other;
            return t.c(this.title, range.title) && t.c(this.initialRange, range.initialRange) && t.c(this.initialDisplayedYearMonth, range.initialDisplayedYearMonth) && t.c(this.onRangeChanged, range.onRangeChanged) && t.c(this.minimumDate, range.minimumDate) && t.c(this.maximumDate, range.maximumDate);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            fz.e.LocalDate localDate = this.initialRange;
            int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
            fz.b.YearMonth yearMonth = this.initialDisplayedYearMonth;
            int iHashCode3 = (((iHashCode2 + (yearMonth == null ? 0 : yearMonth.hashCode())) * 31) + this.onRangeChanged.hashCode()) * 31;
            LocalDate localDate2 = this.minimumDate;
            int iHashCode4 = (iHashCode3 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
            LocalDate localDate3 = this.maximumDate;
            return iHashCode4 + (localDate3 != null ? localDate3.hashCode() : 0);
        }

        public String toString() {
            return "Range(title=" + this.title + ", initialRange=" + this.initialRange + ", initialDisplayedYearMonth=" + this.initialDisplayedYearMonth + ", onRangeChanged=" + this.onRangeChanged + ", minimumDate=" + this.minimumDate + ", maximumDate=" + this.maximumDate + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Range(Label label, fz.e.LocalDate localDate, fz.b.YearMonth yearMonth, er.l lVar, LocalDate localDate2, LocalDate localDate3, int i15, fr.k kVar) {
            LocalDate start;
            label = (i15 & 1) != 0 ? c70.a.f23835a.a().L0() : label;
            localDate = (i15 & 2) != 0 ? null : localDate;
            this(label, localDate, (i15 & 4) != 0 ? (localDate == null || (start = localDate.getStart()) == null) ? null : new fz.b.YearMonth(YearMonth.from(start)) : yearMonth, lVar, (i15 & 16) != 0 ? null : localDate2, (i15 & 32) != 0 ? null : localDate3);
        }
    }
}
