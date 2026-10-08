package u71;

import cl0.BEPassportChildApplicationCountryDictionary;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: u71.h, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJP\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b#\u0010\u001d¨\u0006$"}, d2 = {"Lu71/h;", "", "Lcl0/o;", "selectedCorrespondence", "", "countries", "", "query", "", "isSearchActive", "searchedCountries", "<init>", "(Lcl0/o;Ljava/util/List;Ljava/lang/String;ZLjava/util/List;)V", "a", "(Lcl0/o;Ljava/util/List;Ljava/lang/String;ZLjava/util/List;)Lu71/h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcl0/o;", "f", "()Lcl0/o;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ljava/lang/String;", "d", "Z", "g", "()Z", "e", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPassportChildApplicationCountryDictionary selectedCorrespondence;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEPassportChildApplicationCountryDictionary> countries;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String query;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSearchActive;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEPassportChildApplicationCountryDictionary> searchedCountries;

    public State(BEPassportChildApplicationCountryDictionary bEPassportChildApplicationCountryDictionary, List<BEPassportChildApplicationCountryDictionary> list, String str, boolean z15, List<BEPassportChildApplicationCountryDictionary> list2) {
        this.selectedCorrespondence = bEPassportChildApplicationCountryDictionary;
        this.countries = list;
        this.query = str;
        this.isSearchActive = z15;
        this.searchedCountries = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, BEPassportChildApplicationCountryDictionary bEPassportChildApplicationCountryDictionary, List list, String str, boolean z15, List list2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            bEPassportChildApplicationCountryDictionary = state.selectedCorrespondence;
        }
        if ((i15 & 2) != 0) {
            list = state.countries;
        }
        if ((i15 & 4) != 0) {
            str = state.query;
        }
        if ((i15 & 8) != 0) {
            z15 = state.isSearchActive;
        }
        if ((i15 & 16) != 0) {
            list2 = state.searchedCountries;
        }
        List list3 = list2;
        String str2 = str;
        return state.a(bEPassportChildApplicationCountryDictionary, list, str2, z15, list3);
    }

    public final State a(BEPassportChildApplicationCountryDictionary selectedCorrespondence, List<BEPassportChildApplicationCountryDictionary> countries, String query, boolean isSearchActive, List<BEPassportChildApplicationCountryDictionary> searchedCountries) {
        return new State(selectedCorrespondence, countries, query, isSearchActive, searchedCountries);
    }

    public final List<BEPassportChildApplicationCountryDictionary> c() {
        return this.countries;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    public final List<BEPassportChildApplicationCountryDictionary> e() {
        return this.searchedCountries;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.selectedCorrespondence, state.selectedCorrespondence) && fr.t.c(this.countries, state.countries) && fr.t.c(this.query, state.query) && this.isSearchActive == state.isSearchActive && fr.t.c(this.searchedCountries, state.searchedCountries);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final BEPassportChildApplicationCountryDictionary getSelectedCorrespondence() {
        return this.selectedCorrespondence;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsSearchActive() {
        return this.isSearchActive;
    }

    public int hashCode() {
        BEPassportChildApplicationCountryDictionary bEPassportChildApplicationCountryDictionary = this.selectedCorrespondence;
        return ((((((((bEPassportChildApplicationCountryDictionary == null ? 0 : bEPassportChildApplicationCountryDictionary.hashCode()) * 31) + this.countries.hashCode()) * 31) + this.query.hashCode()) * 31) + Boolean.hashCode(this.isSearchActive)) * 31) + this.searchedCountries.hashCode();
    }

    public String toString() {
        return "State(selectedCorrespondence=" + this.selectedCorrespondence + ", countries=" + this.countries + ", query=" + this.query + ", isSearchActive=" + this.isSearchActive + ", searchedCountries=" + this.searchedCountries + ')';
    }
}
