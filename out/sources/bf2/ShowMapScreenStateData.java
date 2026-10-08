package bf2;

import p071kotlin.Metadata;
import vy.Coordinates;

/* JADX INFO: renamed from: bf2.c, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJP\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b!\u0010\u001d¨\u0006$"}, d2 = {"Lbf2/c;", "", "", "isMyLocationEnabled", "Lvy/c;", "address", "hasPermission", "enabledGps", "markerCoordinates", "cameraPosition", "<init>", "(ZLvy/c;Ljava/lang/Boolean;Ljava/lang/Boolean;Lvy/c;Lvy/c;)V", "a", "(ZLvy/c;Ljava/lang/Boolean;Ljava/lang/Boolean;Lvy/c;Lvy/c;)Lbf2/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "f", "()Z", "b", "Lvy/c;", "c", "()Lvy/c;", "Ljava/lang/Boolean;", "getHasPermission", "()Ljava/lang/Boolean;", "d", "getEnabledGps", "e", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShowMapScreenStateData {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f19135g = Coordinates.f208679c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMyLocationEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates address;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean hasPermission;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean enabledGps;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates markerCoordinates;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates cameraPosition;

    public ShowMapScreenStateData(boolean z15, Coordinates coordinates, Boolean bool, Boolean bool2, Coordinates coordinates2, Coordinates coordinates3) {
        this.isMyLocationEnabled = z15;
        this.address = coordinates;
        this.hasPermission = bool;
        this.enabledGps = bool2;
        this.markerCoordinates = coordinates2;
        this.cameraPosition = coordinates3;
    }

    public static /* synthetic */ ShowMapScreenStateData b(ShowMapScreenStateData showMapScreenStateData, boolean z15, Coordinates coordinates, Boolean bool, Boolean bool2, Coordinates coordinates2, Coordinates coordinates3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = showMapScreenStateData.isMyLocationEnabled;
        }
        if ((i15 & 2) != 0) {
            coordinates = showMapScreenStateData.address;
        }
        if ((i15 & 4) != 0) {
            bool = showMapScreenStateData.hasPermission;
        }
        if ((i15 & 8) != 0) {
            bool2 = showMapScreenStateData.enabledGps;
        }
        if ((i15 & 16) != 0) {
            coordinates2 = showMapScreenStateData.markerCoordinates;
        }
        if ((i15 & 32) != 0) {
            coordinates3 = showMapScreenStateData.cameraPosition;
        }
        Coordinates coordinates4 = coordinates2;
        Coordinates coordinates5 = coordinates3;
        return showMapScreenStateData.a(z15, coordinates, bool, bool2, coordinates4, coordinates5);
    }

    public final ShowMapScreenStateData a(boolean isMyLocationEnabled, Coordinates address, Boolean hasPermission, Boolean enabledGps, Coordinates markerCoordinates, Coordinates cameraPosition) {
        return new ShowMapScreenStateData(isMyLocationEnabled, address, hasPermission, enabledGps, markerCoordinates, cameraPosition);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Coordinates getAddress() {
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
        if (!(other instanceof ShowMapScreenStateData)) {
            return false;
        }
        ShowMapScreenStateData showMapScreenStateData = (ShowMapScreenStateData) other;
        return this.isMyLocationEnabled == showMapScreenStateData.isMyLocationEnabled && fr.t.c(this.address, showMapScreenStateData.address) && fr.t.c(this.hasPermission, showMapScreenStateData.hasPermission) && fr.t.c(this.enabledGps, showMapScreenStateData.enabledGps) && fr.t.c(this.markerCoordinates, showMapScreenStateData.markerCoordinates) && fr.t.c(this.cameraPosition, showMapScreenStateData.cameraPosition);
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
        return "ShowMapScreenStateData(isMyLocationEnabled=" + this.isMyLocationEnabled + ", address=" + this.address + ", hasPermission=" + this.hasPermission + ", enabledGps=" + this.enabledGps + ", markerCoordinates=" + this.markerCoordinates + ", cameraPosition=" + this.cameraPosition + ')';
    }

    public /* synthetic */ ShowMapScreenStateData(boolean z15, Coordinates coordinates, Boolean bool, Boolean bool2, Coordinates coordinates2, Coordinates coordinates3, int i15, fr.k kVar) {
        this(z15, coordinates, (i15 & 4) != 0 ? null : bool, (i15 & 8) != 0 ? null : bool2, coordinates2, coordinates3);
    }
}
