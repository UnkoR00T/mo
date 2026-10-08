package og3;

import fe3.y4;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: og3.y, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Log3/y;", "", "Lfe3/y4;", "currentDestination", "", "workingCopyValidityDays", "<init>", "(Lfe3/y4;Ljava/lang/Integer;)V", "a", "(Lfe3/y4;Ljava/lang/Integer;)Log3/y;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lfe3/y4;", "c", "()Lfe3/y4;", "b", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final y4 currentDestination;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer workingCopyValidityDays;

    /* JADX WARN: Multi-variable type inference failed */
    public State() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ State b(State state, y4 y4Var, Integer num, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            y4Var = state.currentDestination;
        }
        if ((i15 & 2) != 0) {
            num = state.workingCopyValidityDays;
        }
        return state.a(y4Var, num);
    }

    public final State a(y4 currentDestination, Integer workingCopyValidityDays) {
        return new State(currentDestination, workingCopyValidityDays);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final y4 getCurrentDestination() {
        return this.currentDestination;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getWorkingCopyValidityDays() {
        return this.workingCopyValidityDays;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.currentDestination, state.currentDestination) && fr.t.c(this.workingCopyValidityDays, state.workingCopyValidityDays);
    }

    public int hashCode() {
        y4 y4Var = this.currentDestination;
        int iHashCode = (y4Var == null ? 0 : y4Var.hashCode()) * 31;
        Integer num = this.workingCopyValidityDays;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "State(currentDestination=" + this.currentDestination + ", workingCopyValidityDays=" + this.workingCopyValidityDays + ')';
    }

    public State(y4 y4Var, Integer num) {
        this.currentDestination = y4Var;
        this.workingCopyValidityDays = num;
    }

    public /* synthetic */ State(y4 y4Var, Integer num, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : y4Var, (i15 & 2) != 0 ? null : num);
    }
}
