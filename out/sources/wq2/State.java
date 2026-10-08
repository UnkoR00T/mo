package wq2;

import java.util.List;
import p071kotlin.Metadata;
import p127vq2.e0;

/* JADX INFO: renamed from: wq2.h, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ6\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0003\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lwq2/h;", "", "", "isFromUserData", "", "Lvq2/e0;", "initialSteps", "currentStep", "<init>", "(ZLjava/util/List;Lvq2/e0;)V", "a", "(ZLjava/util/List;Lvq2/e0;)Lwq2/h;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "Lvq2/e0;", "()Lvq2/e0;", "passportinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFromUserData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<e0> initialSteps;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final e0 currentStep;

    /* JADX WARN: Multi-variable type inference failed */
    public State(boolean z15, List<? extends e0> list, e0 e0Var) {
        this.isFromUserData = z15;
        this.initialSteps = list;
        this.currentStep = e0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, boolean z15, List list, e0 e0Var, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = state.isFromUserData;
        }
        if ((i15 & 2) != 0) {
            list = state.initialSteps;
        }
        if ((i15 & 4) != 0) {
            e0Var = state.currentStep;
        }
        return state.a(z15, list, e0Var);
    }

    public final State a(boolean isFromUserData, List<? extends e0> initialSteps, e0 currentStep) {
        return new State(isFromUserData, initialSteps, currentStep);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e0 getCurrentStep() {
        return this.currentStep;
    }

    public final List<e0> d() {
        return this.initialSteps;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.isFromUserData == state.isFromUserData && fr.t.c(this.initialSteps, state.initialSteps) && fr.t.c(this.currentStep, state.currentStep);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isFromUserData) * 31) + this.initialSteps.hashCode()) * 31;
        e0 e0Var = this.currentStep;
        return iHashCode + (e0Var == null ? 0 : e0Var.hashCode());
    }

    public String toString() {
        return "State(isFromUserData=" + this.isFromUserData + ", initialSteps=" + this.initialSteps + ", currentStep=" + this.currentStep + ')';
    }

    public /* synthetic */ State(boolean z15, List list, e0 e0Var, int i15, fr.k kVar) {
        this(z15, list, (i15 & 4) != 0 ? null : e0Var);
    }
}
