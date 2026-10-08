package bd1;

import java.util.List;
import ld1.SearchModel;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: bd1.f, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lbd1/f;", "", "", "query", "Lld1/m;", "searchModel", "", "Lld1/m$a;", "searchedItems", "", "isActive", "<init>", "(Ljava/lang/String;Lld1/m;Ljava/util/List;Z)V", "a", "(Ljava/lang/String;Lld1/m;Ljava/util/List;Z)Lbd1/f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Lld1/m;", "d", "()Lld1/m;", "Ljava/util/List;", "e", "()Ljava/util/List;", "Z", "f", "()Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String query;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final SearchModel searchModel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<SearchModel.a> searchedItems;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isActive;

    public State(String str, SearchModel searchModel, List<SearchModel.a> list, boolean z15) {
        this.query = str;
        this.searchModel = searchModel;
        this.searchedItems = list;
        this.isActive = z15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, String str, SearchModel searchModel, List list, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = state.query;
        }
        if ((i15 & 2) != 0) {
            searchModel = state.searchModel;
        }
        if ((i15 & 4) != 0) {
            list = state.searchedItems;
        }
        if ((i15 & 8) != 0) {
            z15 = state.isActive;
        }
        return state.a(str, searchModel, list, z15);
    }

    public final State a(String query, SearchModel searchModel, List<SearchModel.a> searchedItems, boolean isActive) {
        return new State(query, searchModel, searchedItems, isActive);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final SearchModel getSearchModel() {
        return this.searchModel;
    }

    public final List<SearchModel.a> e() {
        return this.searchedItems;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.query, state.query) && fr.t.c(this.searchModel, state.searchModel) && fr.t.c(this.searchedItems, state.searchedItems) && this.isActive == state.isActive;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public int hashCode() {
        return (((((this.query.hashCode() * 31) + this.searchModel.hashCode()) * 31) + this.searchedItems.hashCode()) * 31) + Boolean.hashCode(this.isActive);
    }

    public String toString() {
        return "State(query=" + this.query + ", searchModel=" + this.searchModel + ", searchedItems=" + this.searchedItems + ", isActive=" + this.isActive + ')';
    }
}
