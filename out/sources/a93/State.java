package a93;

import java.util.List;
import oo0.CategoryTopics;
import oo0.Topic;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: a93.h, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ@\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"La93/h;", "", "", "searchQuery", "", "isSearchActive", "", "Loo0/d;", "categories", "Loo0/u$b;", "selectedTopic", "<init>", "(Ljava/lang/String;ZLjava/util/List;Loo0/u$b;)V", "a", "(Ljava/lang/String;ZLjava/util/List;Loo0/u$b;)La93/h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Z", "f", "()Z", "c", "Ljava/util/List;", "()Ljava/util/List;", "Loo0/u$b;", "e", "()Loo0/u$b;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String searchQuery;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSearchActive;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CategoryTopics> categories;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Topic.b selectedTopic;

    public State(String str, boolean z15, List<CategoryTopics> list, Topic.b bVar) {
        this.searchQuery = str;
        this.isSearchActive = z15;
        this.categories = list;
        this.selectedTopic = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, String str, boolean z15, List list, Topic.b bVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = state.searchQuery;
        }
        if ((i15 & 2) != 0) {
            z15 = state.isSearchActive;
        }
        if ((i15 & 4) != 0) {
            list = state.categories;
        }
        if ((i15 & 8) != 0) {
            bVar = state.selectedTopic;
        }
        return state.a(str, z15, list, bVar);
    }

    public final State a(String searchQuery, boolean isSearchActive, List<CategoryTopics> categories, Topic.b selectedTopic) {
        return new State(searchQuery, isSearchActive, categories, selectedTopic);
    }

    public final List<CategoryTopics> c() {
        return this.categories;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSearchQuery() {
        return this.searchQuery;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Topic.b getSelectedTopic() {
        return this.selectedTopic;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.searchQuery, state.searchQuery) && this.isSearchActive == state.isSearchActive && fr.t.c(this.categories, state.categories) && this.selectedTopic == state.selectedTopic;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsSearchActive() {
        return this.isSearchActive;
    }

    public int hashCode() {
        int iHashCode = ((((this.searchQuery.hashCode() * 31) + Boolean.hashCode(this.isSearchActive)) * 31) + this.categories.hashCode()) * 31;
        Topic.b bVar = this.selectedTopic;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        return "State(searchQuery=" + this.searchQuery + ", isSearchActive=" + this.isSearchActive + ", categories=" + this.categories + ", selectedTopic=" + this.selectedTopic + ')';
    }
}
