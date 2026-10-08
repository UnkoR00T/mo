package m91;

import fr.t;
import i61.r;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: m91.d, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lm91/d;", "", "Li61/r;", "pickupMethod", "", "savedAddress", "<init>", "(Li61/r;Ljava/lang/String;)V", "a", "(Li61/r;Ljava/lang/String;)Lm91/d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Li61/r;", "c", "()Li61/r;", "b", "Ljava/lang/String;", "d", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final r pickupMethod;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String savedAddress;

    public State(r rVar, String str) {
        this.pickupMethod = rVar;
        this.savedAddress = str;
    }

    public static /* synthetic */ State b(State state, r rVar, String str, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            rVar = state.pickupMethod;
        }
        if ((i15 & 2) != 0) {
            str = state.savedAddress;
        }
        return state.a(rVar, str);
    }

    public final State a(r pickupMethod, String savedAddress) {
        return new State(pickupMethod, savedAddress);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final r getPickupMethod() {
        return this.pickupMethod;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSavedAddress() {
        return this.savedAddress;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.pickupMethod == state.pickupMethod && t.c(this.savedAddress, state.savedAddress);
    }

    public int hashCode() {
        return (this.pickupMethod.hashCode() * 31) + this.savedAddress.hashCode();
    }

    public String toString() {
        return "State(pickupMethod=" + this.pickupMethod + ", savedAddress=" + this.savedAddress + ')';
    }
}
