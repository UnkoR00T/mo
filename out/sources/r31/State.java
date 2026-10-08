package r31;

import p071kotlin.Metadata;
import t31.OfficeSearchItems;

/* JADX INFO: renamed from: r31.d, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lr31/d;", "", "Lt31/a;", "officeSearchItems", "", "searchQuery", "", "searchIsActive", "<init>", "(Lt31/a;Ljava/lang/String;Z)V", "a", "(Lt31/a;Ljava/lang/String;Z)Lr31/d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lt31/a;", "c", "()Lt31/a;", "b", "Ljava/lang/String;", "e", "Z", "d", "()Z", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final OfficeSearchItems officeSearchItems;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String searchQuery;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean searchIsActive;

    public State(OfficeSearchItems officeSearchItems, String str, boolean z15) {
        this.officeSearchItems = officeSearchItems;
        this.searchQuery = str;
        this.searchIsActive = z15;
    }

    public static /* synthetic */ State b(State state, OfficeSearchItems officeSearchItems, String str, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            officeSearchItems = state.officeSearchItems;
        }
        if ((i15 & 2) != 0) {
            str = state.searchQuery;
        }
        if ((i15 & 4) != 0) {
            z15 = state.searchIsActive;
        }
        return state.a(officeSearchItems, str, z15);
    }

    public final State a(OfficeSearchItems officeSearchItems, String searchQuery, boolean searchIsActive) {
        return new State(officeSearchItems, searchQuery, searchIsActive);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final OfficeSearchItems getOfficeSearchItems() {
        return this.officeSearchItems;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getSearchIsActive() {
        return this.searchIsActive;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSearchQuery() {
        return this.searchQuery;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.officeSearchItems, state.officeSearchItems) && fr.t.c(this.searchQuery, state.searchQuery) && this.searchIsActive == state.searchIsActive;
    }

    public int hashCode() {
        return (((this.officeSearchItems.hashCode() * 31) + this.searchQuery.hashCode()) * 31) + Boolean.hashCode(this.searchIsActive);
    }

    public String toString() {
        return "State(officeSearchItems=" + this.officeSearchItems + ", searchQuery=" + this.searchQuery + ", searchIsActive=" + this.searchIsActive + ')';
    }

    public /* synthetic */ State(OfficeSearchItems officeSearchItems, String str, boolean z15, int i15, fr.k kVar) {
        this(officeSearchItems, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? false : z15);
    }
}
