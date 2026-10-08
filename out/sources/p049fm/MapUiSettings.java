package p049fm;

import fr.k;
import java.util.Objects;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fm.i2, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b \u0010\u001aR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b!\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b#\u0010\u001a¨\u0006$"}, d2 = {"Lfm/i2;", "", "", "compassEnabled", "indoorLevelPickerEnabled", "mapToolbarEnabled", "myLocationButtonEnabled", "rotationGesturesEnabled", "scrollGesturesEnabled", "scrollGesturesEnabledDuringRotateOrZoom", "tiltGesturesEnabled", "zoomControlsEnabled", "zoomGesturesEnabled", "<init>", "(ZZZZZZZZZZ)V", "", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Z", "()Z", "b", "c", "d", "e", "f", "g", "h", "i", "j", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MapUiSettings {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f65123k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean compassEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean indoorLevelPickerEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean mapToolbarEnabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean myLocationButtonEnabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean rotationGesturesEnabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean scrollGesturesEnabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean scrollGesturesEnabledDuringRotateOrZoom;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean tiltGesturesEnabled;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean zoomControlsEnabled;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean zoomGesturesEnabled;

    public MapUiSettings() {
        this(false, false, false, false, false, false, false, false, false, false, 1023, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCompassEnabled() {
        return this.compassEnabled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIndoorLevelPickerEnabled() {
        return this.indoorLevelPickerEnabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getMapToolbarEnabled() {
        return this.mapToolbarEnabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getMyLocationButtonEnabled() {
        return this.myLocationButtonEnabled;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getRotationGesturesEnabled() {
        return this.rotationGesturesEnabled;
    }

    public boolean equals(Object other) {
        if (!(other instanceof MapUiSettings)) {
            return false;
        }
        MapUiSettings mapUiSettings = (MapUiSettings) other;
        return this.compassEnabled == mapUiSettings.compassEnabled && this.indoorLevelPickerEnabled == mapUiSettings.indoorLevelPickerEnabled && this.mapToolbarEnabled == mapUiSettings.mapToolbarEnabled && this.myLocationButtonEnabled == mapUiSettings.myLocationButtonEnabled && this.rotationGesturesEnabled == mapUiSettings.rotationGesturesEnabled && this.scrollGesturesEnabled == mapUiSettings.scrollGesturesEnabled && this.scrollGesturesEnabledDuringRotateOrZoom == mapUiSettings.scrollGesturesEnabledDuringRotateOrZoom && this.tiltGesturesEnabled == mapUiSettings.tiltGesturesEnabled && this.zoomControlsEnabled == mapUiSettings.zoomControlsEnabled && this.zoomGesturesEnabled == mapUiSettings.zoomGesturesEnabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getScrollGesturesEnabled() {
        return this.scrollGesturesEnabled;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getScrollGesturesEnabledDuringRotateOrZoom() {
        return this.scrollGesturesEnabledDuringRotateOrZoom;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getTiltGesturesEnabled() {
        return this.tiltGesturesEnabled;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.compassEnabled), Boolean.valueOf(this.indoorLevelPickerEnabled), Boolean.valueOf(this.mapToolbarEnabled), Boolean.valueOf(this.myLocationButtonEnabled), Boolean.valueOf(this.rotationGesturesEnabled), Boolean.valueOf(this.scrollGesturesEnabled), Boolean.valueOf(this.scrollGesturesEnabledDuringRotateOrZoom), Boolean.valueOf(this.tiltGesturesEnabled), Boolean.valueOf(this.zoomControlsEnabled), Boolean.valueOf(this.zoomGesturesEnabled));
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getZoomControlsEnabled() {
        return this.zoomControlsEnabled;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getZoomGesturesEnabled() {
        return this.zoomGesturesEnabled;
    }

    public String toString() {
        return "MapUiSettings(compassEnabled=" + this.compassEnabled + ", indoorLevelPickerEnabled=" + this.indoorLevelPickerEnabled + ", mapToolbarEnabled=" + this.mapToolbarEnabled + ", myLocationButtonEnabled=" + this.myLocationButtonEnabled + ", rotationGesturesEnabled=" + this.rotationGesturesEnabled + ", scrollGesturesEnabled=" + this.scrollGesturesEnabled + ", scrollGesturesEnabledDuringRotateOrZoom=" + this.scrollGesturesEnabledDuringRotateOrZoom + ", tiltGesturesEnabled=" + this.tiltGesturesEnabled + ", zoomControlsEnabled=" + this.zoomControlsEnabled + ", zoomGesturesEnabled=" + this.zoomGesturesEnabled + ')';
    }

    public MapUiSettings(boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29) {
        this.compassEnabled = z15;
        this.indoorLevelPickerEnabled = z16;
        this.mapToolbarEnabled = z17;
        this.myLocationButtonEnabled = z18;
        this.rotationGesturesEnabled = z19;
        this.scrollGesturesEnabled = z25;
        this.scrollGesturesEnabledDuringRotateOrZoom = z26;
        this.tiltGesturesEnabled = z27;
        this.zoomControlsEnabled = z28;
        this.zoomGesturesEnabled = z29;
    }

    public /* synthetic */ MapUiSettings(boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, int i15, k kVar) {
        this((i15 & 1) != 0 ? true : z15, (i15 & 2) != 0 ? true : z16, (i15 & 4) != 0 ? true : z17, (i15 & 8) != 0 ? true : z18, (i15 & 16) != 0 ? true : z19, (i15 & 32) != 0 ? true : z25, (i15 & 64) != 0 ? true : z26, (i15 & 128) != 0 ? true : z27, (i15 & 256) != 0 ? true : z28, (i15 & 512) != 0 ? true : z29);
    }
}
