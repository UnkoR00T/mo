package e92;

import fp0.SummaryData;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: e92.f, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001e"}, d2 = {"Le92/f;", "", "Lfp0/j;", "summaryData", "", "isIadChecked", "showIadError", "scrollToIad", "<init>", "(Lfp0/j;ZZZ)V", "a", "(Lfp0/j;ZZZ)Le92/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lfp0/j;", "e", "()Lfp0/j;", "b", "Z", "f", "()Z", "c", "d", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final SummaryData summaryData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isIadChecked;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showIadError;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean scrollToIad;

    public State(SummaryData summaryData, boolean z15, boolean z16, boolean z17) {
        this.summaryData = summaryData;
        this.isIadChecked = z15;
        this.showIadError = z16;
        this.scrollToIad = z17;
    }

    public static /* synthetic */ State b(State state, SummaryData summaryData, boolean z15, boolean z16, boolean z17, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            summaryData = state.summaryData;
        }
        if ((i15 & 2) != 0) {
            z15 = state.isIadChecked;
        }
        if ((i15 & 4) != 0) {
            z16 = state.showIadError;
        }
        if ((i15 & 8) != 0) {
            z17 = state.scrollToIad;
        }
        return state.a(summaryData, z15, z16, z17);
    }

    public final State a(SummaryData summaryData, boolean isIadChecked, boolean showIadError, boolean scrollToIad) {
        return new State(summaryData, isIadChecked, showIadError, scrollToIad);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getScrollToIad() {
        return this.scrollToIad;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getShowIadError() {
        return this.showIadError;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final SummaryData getSummaryData() {
        return this.summaryData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.summaryData, state.summaryData) && this.isIadChecked == state.isIadChecked && this.showIadError == state.showIadError && this.scrollToIad == state.scrollToIad;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsIadChecked() {
        return this.isIadChecked;
    }

    public int hashCode() {
        return (((((this.summaryData.hashCode() * 31) + Boolean.hashCode(this.isIadChecked)) * 31) + Boolean.hashCode(this.showIadError)) * 31) + Boolean.hashCode(this.scrollToIad);
    }

    public String toString() {
        return "State(summaryData=" + this.summaryData + ", isIadChecked=" + this.isIadChecked + ", showIadError=" + this.showIadError + ", scrollToIad=" + this.scrollToIad + ')';
    }
}
