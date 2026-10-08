package wu2;

import bu2.SummaryData;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: wu2.c, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Lwu2/c;", "", "Lbu2/c;", "summaryData", "", "responsibilityAccepted", "Lhz/b;", "checkBoxValidationState", "<init>", "(Lbu2/c;ZLhz/b;)V", "a", "(Lbu2/c;ZLhz/b;)Lwu2/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lbu2/c;", "e", "()Lbu2/c;", "b", "Z", "d", "()Z", "c", "Lhz/b;", "()Lhz/b;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final SummaryData summaryData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean responsibilityAccepted;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b checkBoxValidationState;

    public State(SummaryData summaryData, boolean z15, hz.b bVar) {
        this.summaryData = summaryData;
        this.responsibilityAccepted = z15;
        this.checkBoxValidationState = bVar;
    }

    public static /* synthetic */ State b(State state, SummaryData summaryData, boolean z15, hz.b bVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            summaryData = state.summaryData;
        }
        if ((i15 & 2) != 0) {
            z15 = state.responsibilityAccepted;
        }
        if ((i15 & 4) != 0) {
            bVar = state.checkBoxValidationState;
        }
        return state.a(summaryData, z15, bVar);
    }

    public final State a(SummaryData summaryData, boolean responsibilityAccepted, hz.b checkBoxValidationState) {
        return new State(summaryData, responsibilityAccepted, checkBoxValidationState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final hz.b getCheckBoxValidationState() {
        return this.checkBoxValidationState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getResponsibilityAccepted() {
        return this.responsibilityAccepted;
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
        return fr.t.c(this.summaryData, state.summaryData) && this.responsibilityAccepted == state.responsibilityAccepted && fr.t.c(this.checkBoxValidationState, state.checkBoxValidationState);
    }

    public int hashCode() {
        return (((this.summaryData.hashCode() * 31) + Boolean.hashCode(this.responsibilityAccepted)) * 31) + this.checkBoxValidationState.hashCode();
    }

    public String toString() {
        return "State(summaryData=" + this.summaryData + ", responsibilityAccepted=" + this.responsibilityAccepted + ", checkBoxValidationState=" + this.checkBoxValidationState + ')';
    }

    public /* synthetic */ State(SummaryData summaryData, boolean z15, hz.b bVar, int i15, fr.k kVar) {
        this(summaryData, z15, (i15 & 4) != 0 ? hz.b.C2039b.f86846c : bVar);
    }
}
