package qt2;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lqt2/b;", "", "a", "b", "Lqt2/b$a;", "Lqt2/b$b;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lqt2/b$a;", "Lqt2/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f168541a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 91971376;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: qt2.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJL\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010'\u001a\u0004\b)\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lqt2/b$b;", "Lqt2/b;", "Ltt2/b;", "selectedRadioButtonId", "Ljava/time/LocalDate;", "selectedDate", "Ljava/time/OffsetTime;", "selectedTime", "Lhz/b;", "selectedDateValidationState", "selectedTimeValidationState", "Ljava/time/OffsetDateTime;", "nextAvailableDateTime", "<init>", "(Ltt2/b;Ljava/time/LocalDate;Ljava/time/OffsetTime;Lhz/b;Lhz/b;Ljava/time/OffsetDateTime;)V", "a", "(Ltt2/b;Ljava/time/LocalDate;Ljava/time/OffsetTime;Lhz/b;Lhz/b;Ljava/time/OffsetDateTime;)Lqt2/b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltt2/b;", "e", "()Ltt2/b;", "b", "Ljava/time/LocalDate;", "c", "()Ljava/time/LocalDate;", "Ljava/time/OffsetTime;", "f", "()Ljava/time/OffsetTime;", "d", "Lhz/b;", "()Lhz/b;", "g", "Ljava/time/OffsetDateTime;", "getNextAvailableDateTime", "()Ljava/time/OffsetDateTime;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final tt2.b selectedRadioButtonId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate selectedDate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final OffsetTime selectedTime;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b selectedDateValidationState;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b selectedTimeValidationState;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final OffsetDateTime nextAvailableDateTime;

        public Initialized(tt2.b bVar, LocalDate localDate, OffsetTime offsetTime, hz.b bVar2, hz.b bVar3, OffsetDateTime offsetDateTime) {
            this.selectedRadioButtonId = bVar;
            this.selectedDate = localDate;
            this.selectedTime = offsetTime;
            this.selectedDateValidationState = bVar2;
            this.selectedTimeValidationState = bVar3;
            this.nextAvailableDateTime = offsetDateTime;
        }

        public static /* synthetic */ Initialized b(Initialized initialized, tt2.b bVar, LocalDate localDate, OffsetTime offsetTime, hz.b bVar2, hz.b bVar3, OffsetDateTime offsetDateTime, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                bVar = initialized.selectedRadioButtonId;
            }
            if ((i15 & 2) != 0) {
                localDate = initialized.selectedDate;
            }
            if ((i15 & 4) != 0) {
                offsetTime = initialized.selectedTime;
            }
            if ((i15 & 8) != 0) {
                bVar2 = initialized.selectedDateValidationState;
            }
            if ((i15 & 16) != 0) {
                bVar3 = initialized.selectedTimeValidationState;
            }
            if ((i15 & 32) != 0) {
                offsetDateTime = initialized.nextAvailableDateTime;
            }
            hz.b bVar4 = bVar3;
            OffsetDateTime offsetDateTime2 = offsetDateTime;
            return initialized.a(bVar, localDate, offsetTime, bVar2, bVar4, offsetDateTime2);
        }

        public final Initialized a(tt2.b selectedRadioButtonId, LocalDate selectedDate, OffsetTime selectedTime, hz.b selectedDateValidationState, hz.b selectedTimeValidationState, OffsetDateTime nextAvailableDateTime) {
            return new Initialized(selectedRadioButtonId, selectedDate, selectedTime, selectedDateValidationState, selectedTimeValidationState, nextAvailableDateTime);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final LocalDate getSelectedDate() {
            return this.selectedDate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final hz.b getSelectedDateValidationState() {
            return this.selectedDateValidationState;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final tt2.b getSelectedRadioButtonId() {
            return this.selectedRadioButtonId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.selectedRadioButtonId, initialized.selectedRadioButtonId) && fr.t.c(this.selectedDate, initialized.selectedDate) && fr.t.c(this.selectedTime, initialized.selectedTime) && fr.t.c(this.selectedDateValidationState, initialized.selectedDateValidationState) && fr.t.c(this.selectedTimeValidationState, initialized.selectedTimeValidationState) && fr.t.c(this.nextAvailableDateTime, initialized.nextAvailableDateTime);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final OffsetTime getSelectedTime() {
            return this.selectedTime;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final hz.b getSelectedTimeValidationState() {
            return this.selectedTimeValidationState;
        }

        public int hashCode() {
            return (((((((((this.selectedRadioButtonId.hashCode() * 31) + this.selectedDate.hashCode()) * 31) + this.selectedTime.hashCode()) * 31) + this.selectedDateValidationState.hashCode()) * 31) + this.selectedTimeValidationState.hashCode()) * 31) + this.nextAvailableDateTime.hashCode();
        }

        public String toString() {
            return "Initialized(selectedRadioButtonId=" + this.selectedRadioButtonId + ", selectedDate=" + this.selectedDate + ", selectedTime=" + this.selectedTime + ", selectedDateValidationState=" + this.selectedDateValidationState + ", selectedTimeValidationState=" + this.selectedTimeValidationState + ", nextAvailableDateTime=" + this.nextAvailableDateTime + ')';
        }
    }
}
