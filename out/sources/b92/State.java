package b92;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: b92.f, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lb92/f;", "", "Lg30/v;", "bottomSheetValue", "Lc92/a;", "bottomSheetAction", "<init>", "(Lg30/v;Lc92/a;)V", "a", "(Lg30/v;Lc92/a;)Lb92/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lg30/v;", "c", "()Lg30/v;", "b", "Lc92/a;", "()Lc92/a;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final g30.v bottomSheetValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final c92.a bottomSheetAction;

    /* JADX WARN: Multi-variable type inference failed */
    public State() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final State a(g30.v bottomSheetValue, c92.a bottomSheetAction) {
        return new State(bottomSheetValue, bottomSheetAction);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c92.a getBottomSheetAction() {
        return this.bottomSheetAction;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g30.v getBottomSheetValue() {
        return this.bottomSheetValue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.bottomSheetValue == state.bottomSheetValue && fr.t.c(this.bottomSheetAction, state.bottomSheetAction);
    }

    public int hashCode() {
        int iHashCode = this.bottomSheetValue.hashCode() * 31;
        c92.a aVar = this.bottomSheetAction;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "State(bottomSheetValue=" + this.bottomSheetValue + ", bottomSheetAction=" + this.bottomSheetAction + ')';
    }

    public State(g30.v vVar, c92.a aVar) {
        this.bottomSheetValue = vVar;
        this.bottomSheetAction = aVar;
    }

    public /* synthetic */ State(g30.v vVar, c92.a aVar, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? g30.v.HIDDEN : vVar, (i15 & 2) != 0 ? null : aVar);
    }
}
