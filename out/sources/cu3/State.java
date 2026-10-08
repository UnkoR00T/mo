package cu3;

import java.util.List;
import p071kotlin.Metadata;
import tt3.AddressSearchData;
import tt3.AddressSearchItemData;

/* JADX INFO: renamed from: cu3.e, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcu3/e;", "", "", "query", "", "isActive", "Ltt3/b;", "addressSearchData", "", "Ltt3/e;", "searchedItems", "<init>", "(Ljava/lang/String;ZLtt3/b;Ljava/util/List;)V", "a", "(Ljava/lang/String;ZLtt3/b;Ljava/util/List;)Lcu3/e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Z", "f", "()Z", "c", "Ltt3/b;", "()Ltt3/b;", "Ljava/util/List;", "e", "()Ljava/util/List;", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String query;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isActive;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressSearchData addressSearchData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AddressSearchItemData> searchedItems;

    public State(String str, boolean z15, AddressSearchData addressSearchData, List<AddressSearchItemData> list) {
        this.query = str;
        this.isActive = z15;
        this.addressSearchData = addressSearchData;
        this.searchedItems = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, String str, boolean z15, AddressSearchData addressSearchData, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = state.query;
        }
        if ((i15 & 2) != 0) {
            z15 = state.isActive;
        }
        if ((i15 & 4) != 0) {
            addressSearchData = state.addressSearchData;
        }
        if ((i15 & 8) != 0) {
            list = state.searchedItems;
        }
        return state.a(str, z15, addressSearchData, list);
    }

    public final State a(String query, boolean isActive, AddressSearchData addressSearchData, List<AddressSearchItemData> searchedItems) {
        return new State(query, isActive, addressSearchData, searchedItems);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AddressSearchData getAddressSearchData() {
        return this.addressSearchData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    public final List<AddressSearchItemData> e() {
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
        return fr.t.c(this.query, state.query) && this.isActive == state.isActive && fr.t.c(this.addressSearchData, state.addressSearchData) && fr.t.c(this.searchedItems, state.searchedItems);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public int hashCode() {
        return (((((this.query.hashCode() * 31) + Boolean.hashCode(this.isActive)) * 31) + this.addressSearchData.hashCode()) * 31) + this.searchedItems.hashCode();
    }

    public String toString() {
        return "State(query=" + this.query + ", isActive=" + this.isActive + ", addressSearchData=" + this.addressSearchData + ", searchedItems=" + this.searchedItems + ')';
    }
}
