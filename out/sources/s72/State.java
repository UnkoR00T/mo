package s72;

import d72.HydroWarningArea;
import java.util.List;
import p071kotlin.Metadata;
import vy.Coordinates;

/* JADX INFO: renamed from: s72.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJN\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b!\u0010\u001aR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b\u001f\u0010#¨\u0006$"}, d2 = {"Ls72/b;", "", "Lvy/c;", "userCurrentPosition", "", "isGpsEnabled", "isGpsPermissionGranted", "mapViewCoordinates", "", "Ld72/c;", "hydroWarningAreas", "<init>", "(Lvy/c;ZZLvy/c;Ljava/util/List;)V", "a", "(Lvy/c;ZZLvy/c;Ljava/util/List;)Ls72/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lvy/c;", "e", "()Lvy/c;", "b", "Z", "f", "()Z", "c", "g", "d", "Ljava/util/List;", "()Ljava/util/List;", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates userCurrentPosition;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isGpsEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isGpsPermissionGranted;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates mapViewCoordinates;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HydroWarningArea> hydroWarningAreas;

    public State() {
        this(null, false, false, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, Coordinates coordinates, boolean z15, boolean z16, Coordinates coordinates2, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            coordinates = state.userCurrentPosition;
        }
        if ((i15 & 2) != 0) {
            z15 = state.isGpsEnabled;
        }
        if ((i15 & 4) != 0) {
            z16 = state.isGpsPermissionGranted;
        }
        if ((i15 & 8) != 0) {
            coordinates2 = state.mapViewCoordinates;
        }
        if ((i15 & 16) != 0) {
            list = state.hydroWarningAreas;
        }
        List list2 = list;
        boolean z17 = z16;
        return state.a(coordinates, z15, z17, coordinates2, list2);
    }

    public final State a(Coordinates userCurrentPosition, boolean isGpsEnabled, boolean isGpsPermissionGranted, Coordinates mapViewCoordinates, List<HydroWarningArea> hydroWarningAreas) {
        return new State(userCurrentPosition, isGpsEnabled, isGpsPermissionGranted, mapViewCoordinates, hydroWarningAreas);
    }

    public final List<HydroWarningArea> c() {
        return this.hydroWarningAreas;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Coordinates getMapViewCoordinates() {
        return this.mapViewCoordinates;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Coordinates getUserCurrentPosition() {
        return this.userCurrentPosition;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.userCurrentPosition, state.userCurrentPosition) && this.isGpsEnabled == state.isGpsEnabled && this.isGpsPermissionGranted == state.isGpsPermissionGranted && fr.t.c(this.mapViewCoordinates, state.mapViewCoordinates) && fr.t.c(this.hydroWarningAreas, state.hydroWarningAreas);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsGpsEnabled() {
        return this.isGpsEnabled;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsGpsPermissionGranted() {
        return this.isGpsPermissionGranted;
    }

    public int hashCode() {
        Coordinates coordinates = this.userCurrentPosition;
        int iHashCode = (((((coordinates == null ? 0 : coordinates.hashCode()) * 31) + Boolean.hashCode(this.isGpsEnabled)) * 31) + Boolean.hashCode(this.isGpsPermissionGranted)) * 31;
        Coordinates coordinates2 = this.mapViewCoordinates;
        int iHashCode2 = (iHashCode + (coordinates2 == null ? 0 : coordinates2.hashCode())) * 31;
        List<HydroWarningArea> list = this.hydroWarningAreas;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "State(userCurrentPosition=" + this.userCurrentPosition + ", isGpsEnabled=" + this.isGpsEnabled + ", isGpsPermissionGranted=" + this.isGpsPermissionGranted + ", mapViewCoordinates=" + this.mapViewCoordinates + ", hydroWarningAreas=" + this.hydroWarningAreas + ')';
    }

    public State(Coordinates coordinates, boolean z15, boolean z16, Coordinates coordinates2, List<HydroWarningArea> list) {
        this.userCurrentPosition = coordinates;
        this.isGpsEnabled = z15;
        this.isGpsPermissionGranted = z16;
        this.mapViewCoordinates = coordinates2;
        this.hydroWarningAreas = list;
    }

    public /* synthetic */ State(Coordinates coordinates, boolean z15, boolean z16, Coordinates coordinates2, List list, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : coordinates, (i15 & 2) != 0 ? false : z15, (i15 & 4) != 0 ? false : z16, (i15 & 8) != 0 ? null : coordinates2, (i15 & 16) != 0 ? null : list);
    }
}
