package p049fm;

import com.google.android.gms.maps.model.LatLngBounds;
import fr.k;
import fr.t;
import java.util.Objects;
import nh.g;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fm.z1, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001b\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b\u001f\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u0010*\u001a\u0004\b!\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\"\u0010,\u001a\u0004\b#\u0010-R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b$\u0010,\u001a\u0004\b%\u0010-¨\u0006."}, d2 = {"Lfm/z1;", "", "", "isBuildingEnabled", "isIndoorEnabled", "isMyLocationEnabled", "isTrafficEnabled", "Lcom/google/android/gms/maps/model/LatLngBounds;", "latLngBoundsForCameraTarget", "Lnh/g;", "mapStyleOptions", "Lfm/h2;", "mapType", "", "maxZoomPreference", "minZoomPreference", "<init>", "(ZZZZLcom/google/android/gms/maps/model/LatLngBounds;Lnh/g;Lfm/h2;FF)V", "", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Z", "f", "()Z", "b", "g", "c", "h", "d", "i", "e", "Lcom/google/android/gms/maps/model/LatLngBounds;", "()Lcom/google/android/gms/maps/model/LatLngBounds;", "Lnh/g;", "()Lnh/g;", "Lfm/h2;", "()Lfm/h2;", "F", "()F", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MapProperties {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f65356j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isBuildingEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isIndoorEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMyLocationEnabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isTrafficEnabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final LatLngBounds latLngBoundsForCameraTarget;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final g mapStyleOptions;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final h2 mapType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final float maxZoomPreference;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final float minZoomPreference;

    public MapProperties() {
        this(false, false, false, false, null, null, null, 0.0f, 0.0f, 511, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.latLngBoundsForCameraTarget;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g getMapStyleOptions() {
        return this.mapStyleOptions;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h2 getMapType() {
        return this.mapType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getMaxZoomPreference() {
        return this.maxZoomPreference;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getMinZoomPreference() {
        return this.minZoomPreference;
    }

    public boolean equals(Object other) {
        if (!(other instanceof MapProperties)) {
            return false;
        }
        MapProperties mapProperties = (MapProperties) other;
        return this.isBuildingEnabled == mapProperties.isBuildingEnabled && this.isIndoorEnabled == mapProperties.isIndoorEnabled && this.isMyLocationEnabled == mapProperties.isMyLocationEnabled && this.isTrafficEnabled == mapProperties.isTrafficEnabled && t.c(this.latLngBoundsForCameraTarget, mapProperties.latLngBoundsForCameraTarget) && t.c(this.mapStyleOptions, mapProperties.mapStyleOptions) && this.mapType == mapProperties.mapType && this.maxZoomPreference == mapProperties.maxZoomPreference && this.minZoomPreference == mapProperties.minZoomPreference;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsBuildingEnabled() {
        return this.isBuildingEnabled;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsIndoorEnabled() {
        return this.isIndoorEnabled;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsMyLocationEnabled() {
        return this.isMyLocationEnabled;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.isBuildingEnabled), Boolean.valueOf(this.isIndoorEnabled), Boolean.valueOf(this.isMyLocationEnabled), Boolean.valueOf(this.isTrafficEnabled), this.latLngBoundsForCameraTarget, this.mapStyleOptions, this.mapType, Float.valueOf(this.maxZoomPreference), Float.valueOf(this.minZoomPreference));
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsTrafficEnabled() {
        return this.isTrafficEnabled;
    }

    public String toString() {
        return "MapProperties(isBuildingEnabled=" + this.isBuildingEnabled + ", isIndoorEnabled=" + this.isIndoorEnabled + ", isMyLocationEnabled=" + this.isMyLocationEnabled + ", isTrafficEnabled=" + this.isTrafficEnabled + ", latLngBoundsForCameraTarget=" + this.latLngBoundsForCameraTarget + ", mapStyleOptions=" + this.mapStyleOptions + ", mapType=" + this.mapType + ", maxZoomPreference=" + this.maxZoomPreference + ", minZoomPreference=" + this.minZoomPreference + ')';
    }

    public MapProperties(boolean z15, boolean z16, boolean z17, boolean z18, LatLngBounds latLngBounds, g gVar, h2 h2Var, float f15, float f16) {
        this.isBuildingEnabled = z15;
        this.isIndoorEnabled = z16;
        this.isMyLocationEnabled = z17;
        this.isTrafficEnabled = z18;
        this.latLngBoundsForCameraTarget = latLngBounds;
        this.mapStyleOptions = gVar;
        this.mapType = h2Var;
        this.maxZoomPreference = f15;
        this.minZoomPreference = f16;
    }

    public /* synthetic */ MapProperties(boolean z15, boolean z16, boolean z17, boolean z18, LatLngBounds latLngBounds, g gVar, h2 h2Var, float f15, float f16, int i15, k kVar) {
        this((i15 & 1) != 0 ? false : z15, (i15 & 2) != 0 ? false : z16, (i15 & 4) != 0 ? false : z17, (i15 & 8) != 0 ? false : z18, (i15 & 16) != 0 ? null : latLngBounds, (i15 & 32) != 0 ? null : gVar, (i15 & 64) != 0 ? h2.NORMAL : h2Var, (i15 & 128) != 0 ? 21.0f : f15, (i15 & 256) != 0 ? 3.0f : f16);
    }
}
