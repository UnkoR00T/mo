package gs1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gs1.d, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lgs1/d;", "", "Lgs1/t;", "firstStepData", "", "isInputValid", "<init>", "(Lgs1/t;Z)V", "a", "(Lgs1/t;Z)Lgs1/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lgs1/t;", "c", "()Lgs1/t;", "b", "Z", "d", "()Z", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final FirstStepData firstStepData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isInputValid;

    public State(FirstStepData firstStepData, boolean z15) {
        this.firstStepData = firstStepData;
        this.isInputValid = z15;
    }

    public static /* synthetic */ State b(State state, FirstStepData firstStepData, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            firstStepData = state.firstStepData;
        }
        if ((i15 & 2) != 0) {
            z15 = state.isInputValid;
        }
        return state.a(firstStepData, z15);
    }

    public final State a(FirstStepData firstStepData, boolean isInputValid) {
        return new State(firstStepData, isInputValid);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final FirstStepData getFirstStepData() {
        return this.firstStepData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsInputValid() {
        return this.isInputValid;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.firstStepData, state.firstStepData) && this.isInputValid == state.isInputValid;
    }

    public int hashCode() {
        return (this.firstStepData.hashCode() * 31) + Boolean.hashCode(this.isInputValid);
    }

    public String toString() {
        return "State(firstStepData=" + this.firstStepData + ", isInputValid=" + this.isInputValid + ')';
    }
}
