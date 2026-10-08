package w82;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;
import vy.Coordinates;
import w04.LocationCoordinates;
import w04.LocationDetails;

/* JADX INFO: renamed from: w82.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJR\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b'\u0010#¨\u0006("}, d2 = {"Lw82/b;", "", "Lw04/a;", "locationCoordinates", "Lvy/c;", "markerCoordinates", "cameraPosition", "", "showBottomAddress", "Lw04/c;", "violationAddress", "pinChosenByUser", "<init>", "(Lw04/a;Lvy/c;Lvy/c;ZLw04/c;Z)V", "a", "(Lw04/a;Lvy/c;Lvy/c;ZLw04/c;Z)Lw82/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lw04/a;", "c", "()Lw04/a;", "b", "Lvy/c;", "d", "()Lvy/c;", "getCameraPosition", "Z", "e", "()Z", "Lw04/c;", "f", "()Lw04/c;", "getPinChosenByUser", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocationCoordinates locationCoordinates;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates markerCoordinates;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates cameraPosition;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showBottomAddress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocationDetails violationAddress;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean pinChosenByUser;

    public State(LocationCoordinates locationCoordinates, Coordinates coordinates, Coordinates coordinates2, boolean z15, LocationDetails locationDetails, boolean z16) {
        this.locationCoordinates = locationCoordinates;
        this.markerCoordinates = coordinates;
        this.cameraPosition = coordinates2;
        this.showBottomAddress = z15;
        this.violationAddress = locationDetails;
        this.pinChosenByUser = z16;
    }

    public static /* synthetic */ State b(State state, LocationCoordinates locationCoordinates, Coordinates coordinates, Coordinates coordinates2, boolean z15, LocationDetails locationDetails, boolean z16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            locationCoordinates = state.locationCoordinates;
        }
        if ((i15 & 2) != 0) {
            coordinates = state.markerCoordinates;
        }
        if ((i15 & 4) != 0) {
            coordinates2 = state.cameraPosition;
        }
        if ((i15 & 8) != 0) {
            z15 = state.showBottomAddress;
        }
        if ((i15 & 16) != 0) {
            locationDetails = state.violationAddress;
        }
        if ((i15 & 32) != 0) {
            z16 = state.pinChosenByUser;
        }
        LocationDetails locationDetails2 = locationDetails;
        boolean z17 = z16;
        return state.a(locationCoordinates, coordinates, coordinates2, z15, locationDetails2, z17);
    }

    public final State a(LocationCoordinates locationCoordinates, Coordinates markerCoordinates, Coordinates cameraPosition, boolean showBottomAddress, LocationDetails violationAddress, boolean pinChosenByUser) {
        return new State(locationCoordinates, markerCoordinates, cameraPosition, showBottomAddress, violationAddress, pinChosenByUser);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocationCoordinates getLocationCoordinates() {
        return this.locationCoordinates;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Coordinates getMarkerCoordinates() {
        return this.markerCoordinates;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShowBottomAddress() {
        return this.showBottomAddress;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.locationCoordinates, state.locationCoordinates) && fr.t.c(this.markerCoordinates, state.markerCoordinates) && fr.t.c(this.cameraPosition, state.cameraPosition) && this.showBottomAddress == state.showBottomAddress && fr.t.c(this.violationAddress, state.violationAddress) && this.pinChosenByUser == state.pinChosenByUser;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final LocationDetails getViolationAddress() {
        return this.violationAddress;
    }

    public int hashCode() {
        LocationCoordinates locationCoordinates = this.locationCoordinates;
        int iHashCode = (locationCoordinates == null ? 0 : locationCoordinates.hashCode()) * 31;
        Coordinates coordinates = this.markerCoordinates;
        int iHashCode2 = (iHashCode + (coordinates == null ? 0 : coordinates.hashCode())) * 31;
        Coordinates coordinates2 = this.cameraPosition;
        return ((((((iHashCode2 + (coordinates2 != null ? coordinates2.hashCode() : 0)) * 31) + Boolean.hashCode(this.showBottomAddress)) * 31) + this.violationAddress.hashCode()) * 31) + Boolean.hashCode(this.pinChosenByUser);
    }

    public String toString() {
        return "State(locationCoordinates=" + this.locationCoordinates + ", markerCoordinates=" + this.markerCoordinates + ", cameraPosition=" + this.cameraPosition + ", showBottomAddress=" + this.showBottomAddress + ", violationAddress=" + this.violationAddress + ", pinChosenByUser=" + this.pinChosenByUser + ')';
    }

    public /* synthetic */ State(LocationCoordinates locationCoordinates, Coordinates coordinates, Coordinates coordinates2, boolean z15, LocationDetails locationDetails, boolean z16, int i15, fr.k kVar) {
        this(locationCoordinates, coordinates, coordinates2, z15, (i15 & 16) != 0 ? new LocationDetails(null, null, null, null, null, null, null, null, GF2Field.MASK, null) : locationDetails, z16);
    }
}
