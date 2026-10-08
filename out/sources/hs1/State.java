package hs1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: hs1.f, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lhs1/f;", "", "Lhs1/y;", "secondStepData", "", "isFirstInputValid", "isSecondInputValid", "<init>", "(Lhs1/y;ZZ)V", "a", "(Lhs1/y;ZZ)Lhs1/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lhs1/y;", "c", "()Lhs1/y;", "b", "Z", "d", "()Z", "e", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final SecondStepData secondStepData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFirstInputValid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSecondInputValid;

    public State(SecondStepData secondStepData, boolean z15, boolean z16) {
        this.secondStepData = secondStepData;
        this.isFirstInputValid = z15;
        this.isSecondInputValid = z16;
    }

    public static /* synthetic */ State b(State state, SecondStepData secondStepData, boolean z15, boolean z16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            secondStepData = state.secondStepData;
        }
        if ((i15 & 2) != 0) {
            z15 = state.isFirstInputValid;
        }
        if ((i15 & 4) != 0) {
            z16 = state.isSecondInputValid;
        }
        return state.a(secondStepData, z15, z16);
    }

    public final State a(SecondStepData secondStepData, boolean isFirstInputValid, boolean isSecondInputValid) {
        return new State(secondStepData, isFirstInputValid, isSecondInputValid);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final SecondStepData getSecondStepData() {
        return this.secondStepData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsFirstInputValid() {
        return this.isFirstInputValid;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsSecondInputValid() {
        return this.isSecondInputValid;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.secondStepData, state.secondStepData) && this.isFirstInputValid == state.isFirstInputValid && this.isSecondInputValid == state.isSecondInputValid;
    }

    public int hashCode() {
        return (((this.secondStepData.hashCode() * 31) + Boolean.hashCode(this.isFirstInputValid)) * 31) + Boolean.hashCode(this.isSecondInputValid);
    }

    public String toString() {
        return "State(secondStepData=" + this.secondStepData + ", isFirstInputValid=" + this.isFirstInputValid + ", isSecondInputValid=" + this.isSecondInputValid + ')';
    }
}
