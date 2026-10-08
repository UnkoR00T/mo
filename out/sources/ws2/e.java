package ws2;

import fr.t;
import java.time.LocalDate;
import oq.r;
import oq.y;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0014\u000e\f\u0018B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0013\u0010\u000f\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u000b*\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u000b*\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0010J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, d2 = {"Lws2/e;", "Lgz/a;", "Lws2/e$b;", "Lws2/e$d;", "Lez/a;", "currentTimeProvider", "<init>", "(Lez/a;)V", "Ljava/time/LocalDate;", "pickedFromDate", "pickedToDate", "Lws2/e$c;", "c", "(Ljava/time/LocalDate;Ljava/time/LocalDate;)Lws2/e$c;", "d", "g", "(Ljava/time/LocalDate;)Ljava/time/LocalDate;", "e", "(Lws2/e$c;)Lws2/e$c;", "f", "b", "params", "h", "(Lws2/e$b;)Lws2/e$d;", "a", "Lez/a;", "Ljava/time/LocalDate;", "registerRecordStartDate", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements gz.a<Params, Result> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f214885d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LocalDate registerRecordStartDate = LocalDate.of(2022, 10, 20);

    /* JADX INFO: renamed from: ws2.e$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lws2/e$b;", "Lgz/b$a;", "Ljava/time/LocalDate;", "pickedDateFrom", "pickedDateTo", "<init>", "(Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "b", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate pickedDateFrom;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate pickedDateTo;

        public Params(LocalDate localDate, LocalDate localDate2) {
            this.pickedDateFrom = localDate;
            this.pickedDateTo = localDate2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getPickedDateFrom() {
            return this.pickedDateFrom;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LocalDate getPickedDateTo() {
            return this.pickedDateTo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.pickedDateFrom, params.pickedDateFrom) && t.c(this.pickedDateTo, params.pickedDateTo);
        }

        public int hashCode() {
            LocalDate localDate = this.pickedDateFrom;
            int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
            LocalDate localDate2 = this.pickedDateTo;
            return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
        }

        public String toString() {
            return "Params(pickedDateFrom=" + this.pickedDateFrom + ", pickedDateTo=" + this.pickedDateTo + ')';
        }
    }

    /* JADX INFO: renamed from: ws2.e$c, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, d2 = {"Lws2/e$c;", "", "Ljava/time/LocalDate;", "currentDate", "minDate", "maxDate", "<init>", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "a", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;)Lws2/e$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/LocalDate;", "c", "()Ljava/time/LocalDate;", "b", "e", "d", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PickerValues {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate currentDate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate minDate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate maxDate;

        public PickerValues(LocalDate localDate, LocalDate localDate2, LocalDate localDate3) {
            this.currentDate = localDate;
            this.minDate = localDate2;
            this.maxDate = localDate3;
        }

        public static /* synthetic */ PickerValues b(PickerValues pickerValues, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                localDate = pickerValues.currentDate;
            }
            if ((i15 & 2) != 0) {
                localDate2 = pickerValues.minDate;
            }
            if ((i15 & 4) != 0) {
                localDate3 = pickerValues.maxDate;
            }
            return pickerValues.a(localDate, localDate2, localDate3);
        }

        public final PickerValues a(LocalDate currentDate, LocalDate minDate, LocalDate maxDate) {
            return new PickerValues(currentDate, minDate, maxDate);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final LocalDate getCurrentDate() {
            return this.currentDate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final LocalDate getMaxDate() {
            return this.maxDate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final LocalDate getMinDate() {
            return this.minDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PickerValues)) {
                return false;
            }
            PickerValues pickerValues = (PickerValues) other;
            return t.c(this.currentDate, pickerValues.currentDate) && t.c(this.minDate, pickerValues.minDate) && t.c(this.maxDate, pickerValues.maxDate);
        }

        public int hashCode() {
            return (((this.currentDate.hashCode() * 31) + this.minDate.hashCode()) * 31) + this.maxDate.hashCode();
        }

        public String toString() {
            return "PickerValues(currentDate=" + this.currentDate + ", minDate=" + this.minDate + ", maxDate=" + this.maxDate + ')';
        }
    }

    /* JADX INFO: renamed from: ws2.e$d, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001d"}, d2 = {"Lws2/e$d;", "", "Ljava/time/LocalDate;", "fromCurrentDate", "fromMinDate", "fromMaxDate", "toCurrentDate", "toMinDate", "toMaxDate", "<init>", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "b", "c", "d", "e", "f", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate fromCurrentDate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate fromMinDate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate fromMaxDate;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate toCurrentDate;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate toMinDate;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate toMaxDate;

        public Result(LocalDate localDate, LocalDate localDate2, LocalDate localDate3, LocalDate localDate4, LocalDate localDate5, LocalDate localDate6) {
            this.fromCurrentDate = localDate;
            this.fromMinDate = localDate2;
            this.fromMaxDate = localDate3;
            this.toCurrentDate = localDate4;
            this.toMinDate = localDate5;
            this.toMaxDate = localDate6;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getFromCurrentDate() {
            return this.fromCurrentDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LocalDate getFromMaxDate() {
            return this.fromMaxDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final LocalDate getFromMinDate() {
            return this.fromMinDate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final LocalDate getToCurrentDate() {
            return this.toCurrentDate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final LocalDate getToMaxDate() {
            return this.toMaxDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return t.c(this.fromCurrentDate, result.fromCurrentDate) && t.c(this.fromMinDate, result.fromMinDate) && t.c(this.fromMaxDate, result.fromMaxDate) && t.c(this.toCurrentDate, result.toCurrentDate) && t.c(this.toMinDate, result.toMinDate) && t.c(this.toMaxDate, result.toMaxDate);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final LocalDate getToMinDate() {
            return this.toMinDate;
        }

        public int hashCode() {
            return (((((((((this.fromCurrentDate.hashCode() * 31) + this.fromMinDate.hashCode()) * 31) + this.fromMaxDate.hashCode()) * 31) + this.toCurrentDate.hashCode()) * 31) + this.toMinDate.hashCode()) * 31) + this.toMaxDate.hashCode();
        }

        public String toString() {
            return "Result(fromCurrentDate=" + this.fromCurrentDate + ", fromMinDate=" + this.fromMinDate + ", fromMaxDate=" + this.fromMaxDate + ", toCurrentDate=" + this.toCurrentDate + ", toMinDate=" + this.toMinDate + ", toMaxDate=" + this.toMaxDate + ')';
        }
    }

    public e(ez.a aVar) {
        this.currentTimeProvider = aVar;
    }

    private final LocalDate b(LocalDate localDate) {
        return LocalDate.of(localDate.getYear(), 1, 1);
    }

    private final PickerValues c(LocalDate pickedFromDate, LocalDate pickedToDate) {
        if (pickedFromDate == null) {
            pickedFromDate = this.currentTimeProvider.c().minusDays(10L);
        }
        LocalDate localDate = this.registerRecordStartDate;
        if (pickedToDate == null) {
            pickedToDate = this.currentTimeProvider.c();
        }
        return new PickerValues(pickedFromDate, localDate, pickedToDate);
    }

    private final PickerValues d(LocalDate pickedFromDate, LocalDate pickedToDate) {
        LocalDate localDateMinusDays;
        if (pickedToDate == null) {
            pickedToDate = this.currentTimeProvider.c();
        }
        if (pickedFromDate == null || (localDateMinusDays = g(pickedFromDate)) == null) {
            localDateMinusDays = this.currentTimeProvider.c().minusDays(10L);
        }
        return new PickerValues(pickedToDate, localDateMinusDays, this.currentTimeProvider.c());
    }

    private final PickerValues e(PickerValues pickerValues) {
        LocalDate currentDate;
        if (pickerValues.getCurrentDate().isAfter(pickerValues.getMaxDate())) {
            currentDate = pickerValues.getCurrentDate().getYear() == pickerValues.getMaxDate().getYear() ? b(pickerValues.getCurrentDate()) : pickerValues.getMaxDate();
        } else {
            currentDate = pickerValues.getCurrentDate();
        }
        return PickerValues.b(pickerValues, currentDate, null, null, 6, null);
    }

    private final PickerValues f(PickerValues pickerValues) {
        PickerValues pickerValuesB = PickerValues.b(pickerValues, pickerValues.getMaxDate(), null, null, 6, null);
        if (!pickerValues.getCurrentDate().isAfter(pickerValues.getMaxDate())) {
            pickerValuesB = null;
        }
        return pickerValuesB == null ? pickerValues : pickerValuesB;
    }

    private final LocalDate g(LocalDate localDate) {
        LocalDate localDateB = b(localDate);
        if (!localDate.isAfter(this.currentTimeProvider.c())) {
            localDateB = null;
        }
        return localDateB == null ? localDate : localDateB;
    }

    public Result h(Params params) {
        r rVarA = y.a(e(c(params.getPickedDateFrom(), params.getPickedDateTo())), f(d(params.getPickedDateFrom(), params.getPickedDateTo())));
        PickerValues pickerValues = (PickerValues) rVarA.a();
        PickerValues pickerValues2 = (PickerValues) rVarA.b();
        return new Result(pickerValues.getCurrentDate(), pickerValues.getMinDate(), pickerValues.getMaxDate(), pickerValues2.getCurrentDate(), pickerValues2.getMinDate(), pickerValues2.getMaxDate());
    }
}
