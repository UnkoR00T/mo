package sf3;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: sf3.d, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ@\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"Lsf3/d;", "", "Lyd3/a$a;", "data", "", "isApproveSelected", "showError", "Ld60/j;", "Lsf3/b;", "scrollInstance", "<init>", "(Lyd3/a$a;ZZLd60/j;)V", "a", "(Lyd3/a$a;ZZLd60/j;)Lsf3/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lyd3/a$a;", "c", "()Lyd3/a$a;", "b", "Z", "f", "()Z", "e", "d", "Ld60/j;", "()Ld60/j;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final yd3.a.OfAuthor data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isApproveSelected;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showError;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final d60.j<b> scrollInstance;

    public State(yd3.a.OfAuthor ofAuthor, boolean z15, boolean z16, d60.j<b> jVar) {
        this.data = ofAuthor;
        this.isApproveSelected = z15;
        this.showError = z16;
        this.scrollInstance = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, yd3.a.OfAuthor ofAuthor, boolean z15, boolean z16, d60.j jVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            ofAuthor = state.data;
        }
        if ((i15 & 2) != 0) {
            z15 = state.isApproveSelected;
        }
        if ((i15 & 4) != 0) {
            z16 = state.showError;
        }
        if ((i15 & 8) != 0) {
            jVar = state.scrollInstance;
        }
        return state.a(ofAuthor, z15, z16, jVar);
    }

    public final State a(yd3.a.OfAuthor data, boolean isApproveSelected, boolean showError, d60.j<b> scrollInstance) {
        return new State(data, isApproveSelected, showError, scrollInstance);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final yd3.a.OfAuthor getData() {
        return this.data;
    }

    public final d60.j<b> d() {
        return this.scrollInstance;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShowError() {
        return this.showError;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.data, state.data) && this.isApproveSelected == state.isApproveSelected && this.showError == state.showError && fr.t.c(this.scrollInstance, state.scrollInstance);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsApproveSelected() {
        return this.isApproveSelected;
    }

    public int hashCode() {
        int iHashCode = ((((this.data.hashCode() * 31) + Boolean.hashCode(this.isApproveSelected)) * 31) + Boolean.hashCode(this.showError)) * 31;
        d60.j<b> jVar = this.scrollInstance;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public String toString() {
        return "State(data=" + this.data + ", isApproveSelected=" + this.isApproveSelected + ", showError=" + this.showError + ", scrollInstance=" + this.scrollInstance + ')';
    }

    public /* synthetic */ State(yd3.a.OfAuthor ofAuthor, boolean z15, boolean z16, d60.j jVar, int i15, fr.k kVar) {
        this(ofAuthor, z15, z16, (i15 & 8) != 0 ? null : jVar);
    }
}
