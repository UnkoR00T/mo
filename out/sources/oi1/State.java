package oi1;

import fr.t;
import iq0.DashboardServiceEntry;
import java.util.List;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: oi1.d, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ2\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Loi1/d;", "", "", "Lah1/g;", "enabledServiceWidgets", "", "Liq0/p;", "loadedServices", "<init>", "(Ljava/util/Set;Ljava/util/List;)V", "a", "(Ljava/util/Set;Ljava/util/List;)Loi1/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Set;", "c", "()Ljava/util/Set;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<ah1.g> enabledServiceWidgets;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DashboardServiceEntry> loadedServices;

    /* JADX WARN: Multi-variable type inference failed */
    public State(Set<? extends ah1.g> set, List<DashboardServiceEntry> list) {
        this.enabledServiceWidgets = set;
        this.loadedServices = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, Set set, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            set = state.enabledServiceWidgets;
        }
        if ((i15 & 2) != 0) {
            list = state.loadedServices;
        }
        return state.a(set, list);
    }

    public final State a(Set<? extends ah1.g> enabledServiceWidgets, List<DashboardServiceEntry> loadedServices) {
        return new State(enabledServiceWidgets, loadedServices);
    }

    public final Set<ah1.g> c() {
        return this.enabledServiceWidgets;
    }

    public final List<DashboardServiceEntry> d() {
        return this.loadedServices;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return t.c(this.enabledServiceWidgets, state.enabledServiceWidgets) && t.c(this.loadedServices, state.loadedServices);
    }

    public int hashCode() {
        int iHashCode = this.enabledServiceWidgets.hashCode() * 31;
        List<DashboardServiceEntry> list = this.loadedServices;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "State(enabledServiceWidgets=" + this.enabledServiceWidgets + ", loadedServices=" + this.loadedServices + ')';
    }
}
