package cv2;

import java.time.LocalDate;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcv2/a;", "", "a", "b", "Lcv2/a$a;", "Lcv2/a$b;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: cv2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcv2/a$a;", "Lcv2/a;", "Ljava/time/LocalDate;", "currentDate", "minDate", "maxDate", "Lkotlin/Function1;", "Loq/i0;", "setDate", "<init>", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "b", "c", "d", "Ler/l;", "()Ler/l;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenDatePicker implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate currentDate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate minDate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate maxDate;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<LocalDate, i0> setDate;

        /* JADX WARN: Multi-variable type inference failed */
        public OpenDatePicker(LocalDate localDate, LocalDate localDate2, LocalDate localDate3, er.l<? super LocalDate, i0> lVar) {
            this.currentDate = localDate;
            this.minDate = localDate2;
            this.maxDate = localDate3;
            this.setDate = lVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getCurrentDate() {
            return this.currentDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LocalDate getMaxDate() {
            return this.maxDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final LocalDate getMinDate() {
            return this.minDate;
        }

        public final er.l<LocalDate, i0> d() {
            return this.setDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenDatePicker)) {
                return false;
            }
            OpenDatePicker openDatePicker = (OpenDatePicker) other;
            return fr.t.c(this.currentDate, openDatePicker.currentDate) && fr.t.c(this.minDate, openDatePicker.minDate) && fr.t.c(this.maxDate, openDatePicker.maxDate) && fr.t.c(this.setDate, openDatePicker.setDate);
        }

        public int hashCode() {
            return (((((this.currentDate.hashCode() * 31) + this.minDate.hashCode()) * 31) + this.maxDate.hashCode()) * 31) + this.setDate.hashCode();
        }

        public String toString() {
            return "OpenDatePicker(currentDate=" + this.currentDate + ", minDate=" + this.minDate + ", maxDate=" + this.maxDate + ", setDate=" + this.setDate + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcv2/a$b;", "Lcv2/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f38266a = new b();

        private b() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return 1650797602;
        }

        public String toString() {
            return "ToSummary";
        }
    }
}
