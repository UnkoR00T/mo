package h52;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: h52.g, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lh52/g;", "", "", "query", "", "isSearchActive", "<init>", "(Ljava/lang/String;Z)V", "a", "(Ljava/lang/String;Z)Lh52/g;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Z", "d", "()Z", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String query;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSearchActive;

    public State(String str, boolean z15) {
        this.query = str;
        this.isSearchActive = z15;
    }

    public static /* synthetic */ State b(State state, String str, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = state.query;
        }
        if ((i15 & 2) != 0) {
            z15 = state.isSearchActive;
        }
        return state.a(str, z15);
    }

    public final State a(String query, boolean isSearchActive) {
        return new State(query, isSearchActive);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsSearchActive() {
        return this.isSearchActive;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.query, state.query) && this.isSearchActive == state.isSearchActive;
    }

    public int hashCode() {
        return (this.query.hashCode() * 31) + Boolean.hashCode(this.isSearchActive);
    }

    public String toString() {
        return "State(query=" + this.query + ", isSearchActive=" + this.isSearchActive + ')';
    }
}
