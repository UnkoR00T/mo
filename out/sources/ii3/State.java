package ii3;

import p071kotlin.Metadata;
import vy.Coordinates;

/* JADX INFO: renamed from: ii3.f, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJP\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b \u0010$¨\u0006%"}, d2 = {"Lii3/f;", "", "", "isMyLocationEnabled", "", "address", "hasPermission", "enabledGps", "Lvy/c;", "markerCoordinates", "cameraPosition", "<init>", "(ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lvy/c;Lvy/c;)V", "a", "(ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lvy/c;Lvy/c;)Lii3/f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "f", "()Z", "b", "Ljava/lang/String;", "c", "Ljava/lang/Boolean;", "getHasPermission", "()Ljava/lang/Boolean;", "d", "getEnabledGps", "e", "Lvy/c;", "()Lvy/c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f92918g = Coordinates.f208679c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMyLocationEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String address;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean hasPermission;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean enabledGps;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates markerCoordinates;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates cameraPosition;

    public State(boolean z15, String str, Boolean bool, Boolean bool2, Coordinates coordinates, Coordinates coordinates2) {
        this.isMyLocationEnabled = z15;
        this.address = str;
        this.hasPermission = bool;
        this.enabledGps = bool2;
        this.markerCoordinates = coordinates;
        this.cameraPosition = coordinates2;
    }

    public static /* synthetic */ State b(State state, boolean z15, String str, Boolean bool, Boolean bool2, Coordinates coordinates, Coordinates coordinates2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = state.isMyLocationEnabled;
        }
        if ((i15 & 2) != 0) {
            str = state.address;
        }
        if ((i15 & 4) != 0) {
            bool = state.hasPermission;
        }
        if ((i15 & 8) != 0) {
            bool2 = state.enabledGps;
        }
        if ((i15 & 16) != 0) {
            coordinates = state.markerCoordinates;
        }
        if ((i15 & 32) != 0) {
            coordinates2 = state.cameraPosition;
        }
        Coordinates coordinates3 = coordinates;
        Coordinates coordinates4 = coordinates2;
        return state.a(z15, str, bool, bool2, coordinates3, coordinates4);
    }

    public final State a(boolean isMyLocationEnabled, String address, Boolean hasPermission, Boolean enabledGps, Coordinates markerCoordinates, Coordinates cameraPosition) {
        return new State(isMyLocationEnabled, address, hasPermission, enabledGps, markerCoordinates, cameraPosition);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Coordinates getCameraPosition() {
        return this.cameraPosition;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Coordinates getMarkerCoordinates() {
        return this.markerCoordinates;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.isMyLocationEnabled == state.isMyLocationEnabled && fr.t.c(this.address, state.address) && fr.t.c(this.hasPermission, state.hasPermission) && fr.t.c(this.enabledGps, state.enabledGps) && fr.t.c(this.markerCoordinates, state.markerCoordinates) && fr.t.c(this.cameraPosition, state.cameraPosition);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsMyLocationEnabled() {
        return this.isMyLocationEnabled;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isMyLocationEnabled) * 31) + this.address.hashCode()) * 31;
        Boolean bool = this.hasPermission;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.enabledGps;
        return ((((iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + this.markerCoordinates.hashCode()) * 31) + this.cameraPosition.hashCode();
    }

    public String toString() {
        return "State(isMyLocationEnabled=" + this.isMyLocationEnabled + ", address=" + this.address + ", hasPermission=" + this.hasPermission + ", enabledGps=" + this.enabledGps + ", markerCoordinates=" + this.markerCoordinates + ", cameraPosition=" + this.cameraPosition + ')';
    }

    public /* synthetic */ State(boolean z15, String str, Boolean bool, Boolean bool2, Coordinates coordinates, Coordinates coordinates2, int i15, fr.k kVar) {
        this(z15, str, (i15 & 4) != 0 ? null : bool, (i15 & 8) != 0 ? null : bool2, coordinates, coordinates2);
    }
}
