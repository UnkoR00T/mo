package fj3;

import p071kotlin.Metadata;
import tj3.AbroadDetailsPayload;

/* JADX INFO: renamed from: fj3.e, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lfj3/e;", "", "Ltj3/a;", "abroadDetailsPayload", "", "isTechnicalDataExpanded", "isOdometerDataExpanded", "<init>", "(Ltj3/a;ZZ)V", "a", "(Ltj3/a;ZZ)Lfj3/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ltj3/a;", "c", "()Ltj3/a;", "b", "Z", "e", "()Z", "d", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbroadDetailsPayload abroadDetailsPayload;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isTechnicalDataExpanded;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOdometerDataExpanded;

    public State(AbroadDetailsPayload abroadDetailsPayload, boolean z15, boolean z16) {
        this.abroadDetailsPayload = abroadDetailsPayload;
        this.isTechnicalDataExpanded = z15;
        this.isOdometerDataExpanded = z16;
    }

    public static /* synthetic */ State b(State state, AbroadDetailsPayload abroadDetailsPayload, boolean z15, boolean z16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            abroadDetailsPayload = state.abroadDetailsPayload;
        }
        if ((i15 & 2) != 0) {
            z15 = state.isTechnicalDataExpanded;
        }
        if ((i15 & 4) != 0) {
            z16 = state.isOdometerDataExpanded;
        }
        return state.a(abroadDetailsPayload, z15, z16);
    }

    public final State a(AbroadDetailsPayload abroadDetailsPayload, boolean isTechnicalDataExpanded, boolean isOdometerDataExpanded) {
        return new State(abroadDetailsPayload, isTechnicalDataExpanded, isOdometerDataExpanded);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbroadDetailsPayload getAbroadDetailsPayload() {
        return this.abroadDetailsPayload;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsOdometerDataExpanded() {
        return this.isOdometerDataExpanded;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsTechnicalDataExpanded() {
        return this.isTechnicalDataExpanded;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.abroadDetailsPayload, state.abroadDetailsPayload) && this.isTechnicalDataExpanded == state.isTechnicalDataExpanded && this.isOdometerDataExpanded == state.isOdometerDataExpanded;
    }

    public int hashCode() {
        return (((this.abroadDetailsPayload.hashCode() * 31) + Boolean.hashCode(this.isTechnicalDataExpanded)) * 31) + Boolean.hashCode(this.isOdometerDataExpanded);
    }

    public String toString() {
        return "State(abroadDetailsPayload=" + this.abroadDetailsPayload + ", isTechnicalDataExpanded=" + this.isTechnicalDataExpanded + ", isOdometerDataExpanded=" + this.isOdometerDataExpanded + ')';
    }
}
