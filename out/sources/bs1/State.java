package bs1;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;
import vy.Address;
import vy.Coordinates;

/* JADX INFO: renamed from: bs1.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b \u0010\u000f¨\u0006!"}, d2 = {"Lbs1/b;", "", "", "searchText", "", "Lvy/a;", "list", "Lvy/c;", "center", "distance", "<init>", "(Ljava/lang/String;Ljava/util/List;Lvy/c;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Ljava/util/List;Lvy/c;Ljava/lang/String;)Lbs1/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "c", "Lvy/c;", "()Lvy/c;", "d", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String searchText;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Address> list;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates center;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String distance;

    public State(String str, List<Address> list, Coordinates coordinates, String str2) {
        this.searchText = str;
        this.list = list;
        this.center = coordinates;
        this.distance = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, String str, List list, Coordinates coordinates, String str2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = state.searchText;
        }
        if ((i15 & 2) != 0) {
            list = state.list;
        }
        if ((i15 & 4) != 0) {
            coordinates = state.center;
        }
        if ((i15 & 8) != 0) {
            str2 = state.distance;
        }
        return state.a(str, list, coordinates, str2);
    }

    public final State a(String searchText, List<Address> list, Coordinates center, String distance) {
        return new State(searchText, list, center, distance);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Coordinates getCenter() {
        return this.center;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDistance() {
        return this.distance;
    }

    public final List<Address> e() {
        return this.list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return t.c(this.searchText, state.searchText) && t.c(this.list, state.list) && t.c(this.center, state.center) && t.c(this.distance, state.distance);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSearchText() {
        return this.searchText;
    }

    public int hashCode() {
        return (((((this.searchText.hashCode() * 31) + this.list.hashCode()) * 31) + this.center.hashCode()) * 31) + this.distance.hashCode();
    }

    public String toString() {
        return "State(searchText=" + this.searchText + ", list=" + this.list + ", center=" + this.center + ", distance=" + this.distance + ')';
    }
}
