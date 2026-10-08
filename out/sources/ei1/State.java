package ei1;

import iq0.DashboardServiceEntry;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ei1.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lei1/b;", "", "", "Liq0/p;", "favourites", "all", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "a", "(Ljava/util/List;Ljava/util/List;)Lei1/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "c", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DashboardServiceEntry> favourites;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DashboardServiceEntry> all;

    public State(List<DashboardServiceEntry> list, List<DashboardServiceEntry> list2) {
        this.favourites = list;
        this.all = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, List list, List list2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            list = state.favourites;
        }
        if ((i15 & 2) != 0) {
            list2 = state.all;
        }
        return state.a(list, list2);
    }

    public final State a(List<DashboardServiceEntry> favourites, List<DashboardServiceEntry> all) {
        return new State(favourites, all);
    }

    public final List<DashboardServiceEntry> c() {
        return this.all;
    }

    public final List<DashboardServiceEntry> d() {
        return this.favourites;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.favourites, state.favourites) && fr.t.c(this.all, state.all);
    }

    public int hashCode() {
        return (this.favourites.hashCode() * 31) + this.all.hashCode();
    }

    public String toString() {
        return "State(favourites=" + this.favourites + ", all=" + this.all + ')';
    }
}
