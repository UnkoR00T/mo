package cv2;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: cv2.f, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\r¨\u0006\u001e"}, d2 = {"Lcv2/f;", "", "Lfv2/a;", "selectedRadioButtonId", "Ljava/time/LocalDate;", "selectedDate", "", "selectedDateLabel", "<init>", "(Lfv2/a;Ljava/time/LocalDate;Ljava/lang/String;)V", "a", "(Lfv2/a;Ljava/time/LocalDate;Ljava/lang/String;)Lcv2/f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lfv2/a;", "e", "()Lfv2/a;", "b", "Ljava/time/LocalDate;", "c", "()Ljava/time/LocalDate;", "Ljava/lang/String;", "d", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final fv2.a selectedRadioButtonId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate selectedDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String selectedDateLabel;

    public State(fv2.a aVar, LocalDate localDate, String str) {
        this.selectedRadioButtonId = aVar;
        this.selectedDate = localDate;
        this.selectedDateLabel = str;
    }

    public static /* synthetic */ State b(State state, fv2.a aVar, LocalDate localDate, String str, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            aVar = state.selectedRadioButtonId;
        }
        if ((i15 & 2) != 0) {
            localDate = state.selectedDate;
        }
        if ((i15 & 4) != 0) {
            str = state.selectedDateLabel;
        }
        return state.a(aVar, localDate, str);
    }

    public final State a(fv2.a selectedRadioButtonId, LocalDate selectedDate, String selectedDateLabel) {
        return new State(selectedRadioButtonId, selectedDate, selectedDateLabel);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getSelectedDate() {
        return this.selectedDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSelectedDateLabel() {
        return this.selectedDateLabel;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final fv2.a getSelectedRadioButtonId() {
        return this.selectedRadioButtonId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.selectedRadioButtonId, state.selectedRadioButtonId) && fr.t.c(this.selectedDate, state.selectedDate) && fr.t.c(this.selectedDateLabel, state.selectedDateLabel);
    }

    public int hashCode() {
        int iHashCode = this.selectedRadioButtonId.hashCode() * 31;
        LocalDate localDate = this.selectedDate;
        return ((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31) + this.selectedDateLabel.hashCode();
    }

    public String toString() {
        return "State(selectedRadioButtonId=" + this.selectedRadioButtonId + ", selectedDate=" + this.selectedDate + ", selectedDateLabel=" + this.selectedDateLabel + ')';
    }
}
