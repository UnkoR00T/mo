package zr3;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: zr3.o, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lzr3/o;", "", "", "backNavigationVisible", "topContentVisible", "<init>", "(ZZ)V", "a", "(ZZ)Lzr3/o;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "c", "()Z", "b", "d", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean backNavigationVisible;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean topContentVisible;

    /* JADX WARN: Illegal instructions before constructor call */
    public State() {
        boolean z15 = false;
        this(z15, z15, 3, null);
    }

    public static /* synthetic */ State b(State state, boolean z15, boolean z16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = state.backNavigationVisible;
        }
        if ((i15 & 2) != 0) {
            z16 = state.topContentVisible;
        }
        return state.a(z15, z16);
    }

    public final State a(boolean backNavigationVisible, boolean topContentVisible) {
        return new State(backNavigationVisible, topContentVisible);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getBackNavigationVisible() {
        return this.backNavigationVisible;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getTopContentVisible() {
        return this.topContentVisible;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.backNavigationVisible == state.backNavigationVisible && this.topContentVisible == state.topContentVisible;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.backNavigationVisible) * 31) + Boolean.hashCode(this.topContentVisible);
    }

    public String toString() {
        return "State(backNavigationVisible=" + this.backNavigationVisible + ", topContentVisible=" + this.topContentVisible + ')';
    }

    public State(boolean z15, boolean z16) {
        this.backNavigationVisible = z15;
        this.topContentVisible = z16;
    }

    public /* synthetic */ State(boolean z15, boolean z16, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? false : z15, (i15 & 2) != 0 ? true : z16);
    }
}
