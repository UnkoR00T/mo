package w04;

import fr.t;
import p071kotlin.Metadata;
import vy.Coordinates;

/* JADX INFO: renamed from: w04.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lw04/a;", "", "Lvy/c;", "coordinates", "", "isMyLocationEnabled", "hadGpsPermission", "<init>", "(Lvy/c;ZZ)V", "a", "(Lvy/c;ZZ)Lw04/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lvy/c;", "c", "()Lvy/c;", "b", "Z", "e", "()Z", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LocationCoordinates {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates coordinates;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMyLocationEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hadGpsPermission;

    public LocationCoordinates(Coordinates coordinates, boolean z15, boolean z16) {
        this.coordinates = coordinates;
        this.isMyLocationEnabled = z15;
        this.hadGpsPermission = z16;
    }

    public static /* synthetic */ LocationCoordinates b(LocationCoordinates locationCoordinates, Coordinates coordinates, boolean z15, boolean z16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            coordinates = locationCoordinates.coordinates;
        }
        if ((i15 & 2) != 0) {
            z15 = locationCoordinates.isMyLocationEnabled;
        }
        if ((i15 & 4) != 0) {
            z16 = locationCoordinates.hadGpsPermission;
        }
        return locationCoordinates.a(coordinates, z15, z16);
    }

    public final LocationCoordinates a(Coordinates coordinates, boolean isMyLocationEnabled, boolean hadGpsPermission) {
        return new LocationCoordinates(coordinates, isMyLocationEnabled, hadGpsPermission);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getHadGpsPermission() {
        return this.hadGpsPermission;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsMyLocationEnabled() {
        return this.isMyLocationEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationCoordinates)) {
            return false;
        }
        LocationCoordinates locationCoordinates = (LocationCoordinates) other;
        return t.c(this.coordinates, locationCoordinates.coordinates) && this.isMyLocationEnabled == locationCoordinates.isMyLocationEnabled && this.hadGpsPermission == locationCoordinates.hadGpsPermission;
    }

    public int hashCode() {
        return (((this.coordinates.hashCode() * 31) + Boolean.hashCode(this.isMyLocationEnabled)) * 31) + Boolean.hashCode(this.hadGpsPermission);
    }

    public String toString() {
        return "LocationCoordinates(coordinates=" + this.coordinates + ", isMyLocationEnabled=" + this.isMyLocationEnabled + ", hadGpsPermission=" + this.hadGpsPermission + ")";
    }
}
