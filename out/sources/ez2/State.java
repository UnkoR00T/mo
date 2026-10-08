package ez2;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ez2.i, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lez2/i;", "", "Lez2/g;", "canData", "Lhz/b;", "validationState", "<init>", "(Lez2/g;Lhz/b;)V", "a", "(Lez2/g;Lhz/b;)Lez2/i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lez2/g;", "c", "()Lez2/g;", "b", "Lhz/b;", "d", "()Lhz/b;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f54399c = hz.b.f86845b | b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final CanSharedData canData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b validationState;

    public State(CanSharedData canSharedData, hz.b bVar) {
        this.canData = canSharedData;
        this.validationState = bVar;
    }

    public static /* synthetic */ State b(State state, CanSharedData canSharedData, hz.b bVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            canSharedData = state.canData;
        }
        if ((i15 & 2) != 0) {
            bVar = state.validationState;
        }
        return state.a(canSharedData, bVar);
    }

    public final State a(CanSharedData canData, hz.b validationState) {
        return new State(canData, validationState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final CanSharedData getCanData() {
        return this.canData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final hz.b getValidationState() {
        return this.validationState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return t.c(this.canData, state.canData) && t.c(this.validationState, state.validationState);
    }

    public int hashCode() {
        return (this.canData.hashCode() * 31) + this.validationState.hashCode();
    }

    public String toString() {
        return "State(canData=" + this.canData + ", validationState=" + this.validationState + ')';
    }

    public /* synthetic */ State(CanSharedData canSharedData, hz.b bVar, int i15, fr.k kVar) {
        this(canSharedData, (i15 & 2) != 0 ? hz.b.C2039b.f86846c : bVar);
    }
}
