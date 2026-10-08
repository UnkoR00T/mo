package fs1;

import gs1.FirstStepData;
import hs1.SecondStepData;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fs1.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lfs1/e;", "", "Lgs1/t;", "firstStepData", "Lhs1/y;", "secondStepData", "<init>", "(Lgs1/t;Lhs1/y;)V", "a", "(Lgs1/t;Lhs1/y;)Lfs1/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lgs1/t;", "c", "()Lgs1/t;", "b", "Lhs1/y;", "d", "()Lhs1/y;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final FirstStepData firstStepData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final SecondStepData secondStepData;

    public State(FirstStepData firstStepData, SecondStepData secondStepData) {
        this.firstStepData = firstStepData;
        this.secondStepData = secondStepData;
    }

    public static /* synthetic */ State b(State state, FirstStepData firstStepData, SecondStepData secondStepData, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            firstStepData = state.firstStepData;
        }
        if ((i15 & 2) != 0) {
            secondStepData = state.secondStepData;
        }
        return state.a(firstStepData, secondStepData);
    }

    public final State a(FirstStepData firstStepData, SecondStepData secondStepData) {
        return new State(firstStepData, secondStepData);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final FirstStepData getFirstStepData() {
        return this.firstStepData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final SecondStepData getSecondStepData() {
        return this.secondStepData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.firstStepData, state.firstStepData) && fr.t.c(this.secondStepData, state.secondStepData);
    }

    public int hashCode() {
        return (this.firstStepData.hashCode() * 31) + this.secondStepData.hashCode();
    }

    public String toString() {
        return "State(firstStepData=" + this.firstStepData + ", secondStepData=" + this.secondStepData + ')';
    }
}
