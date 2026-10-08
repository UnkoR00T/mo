package zy0;

import fr.t;
import java.util.List;
import kh0.BEBasicMeasurementPoint;
import kh0.l;
import p071kotlin.Metadata;
import vy.Coordinates;

/* JADX INFO: renamed from: zy0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJJ\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010%\u001a\u0004\b#\u0010&¨\u0006'"}, d2 = {"Lzy0/a;", "", "", "Lkh0/c;", "listOfPoints", "Lvy/c;", "userCurrentPosition", "", "isGpsEnabled", "isGpsPermissionGranted", "Lkh0/l;", "openedPointQuality", "<init>", "(Ljava/util/List;Lvy/c;ZZLkh0/l;)V", "a", "(Ljava/util/List;Lvy/c;ZZLkh0/l;)Lzy0/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lvy/c;", "e", "()Lvy/c;", "Z", "f", "()Z", "d", "g", "Lkh0/l;", "()Lkh0/l;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InitializedModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEBasicMeasurementPoint> listOfPoints;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates userCurrentPosition;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isGpsEnabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isGpsPermissionGranted;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final l openedPointQuality;

    public InitializedModel(List<BEBasicMeasurementPoint> list, Coordinates coordinates, boolean z15, boolean z16, l lVar) {
        this.listOfPoints = list;
        this.userCurrentPosition = coordinates;
        this.isGpsEnabled = z15;
        this.isGpsPermissionGranted = z16;
        this.openedPointQuality = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InitializedModel b(InitializedModel initializedModel, List list, Coordinates coordinates, boolean z15, boolean z16, l lVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            list = initializedModel.listOfPoints;
        }
        if ((i15 & 2) != 0) {
            coordinates = initializedModel.userCurrentPosition;
        }
        if ((i15 & 4) != 0) {
            z15 = initializedModel.isGpsEnabled;
        }
        if ((i15 & 8) != 0) {
            z16 = initializedModel.isGpsPermissionGranted;
        }
        if ((i15 & 16) != 0) {
            lVar = initializedModel.openedPointQuality;
        }
        l lVar2 = lVar;
        boolean z17 = z15;
        return initializedModel.a(list, coordinates, z17, z16, lVar2);
    }

    public final InitializedModel a(List<BEBasicMeasurementPoint> listOfPoints, Coordinates userCurrentPosition, boolean isGpsEnabled, boolean isGpsPermissionGranted, l openedPointQuality) {
        return new InitializedModel(listOfPoints, userCurrentPosition, isGpsEnabled, isGpsPermissionGranted, openedPointQuality);
    }

    public final List<BEBasicMeasurementPoint> c() {
        return this.listOfPoints;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final l getOpenedPointQuality() {
        return this.openedPointQuality;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Coordinates getUserCurrentPosition() {
        return this.userCurrentPosition;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitializedModel)) {
            return false;
        }
        InitializedModel initializedModel = (InitializedModel) other;
        return t.c(this.listOfPoints, initializedModel.listOfPoints) && t.c(this.userCurrentPosition, initializedModel.userCurrentPosition) && this.isGpsEnabled == initializedModel.isGpsEnabled && this.isGpsPermissionGranted == initializedModel.isGpsPermissionGranted && this.openedPointQuality == initializedModel.openedPointQuality;
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
        int iHashCode = this.listOfPoints.hashCode() * 31;
        Coordinates coordinates = this.userCurrentPosition;
        return ((((((iHashCode + (coordinates == null ? 0 : coordinates.hashCode())) * 31) + Boolean.hashCode(this.isGpsEnabled)) * 31) + Boolean.hashCode(this.isGpsPermissionGranted)) * 31) + this.openedPointQuality.hashCode();
    }

    public String toString() {
        return "InitializedModel(listOfPoints=" + this.listOfPoints + ", userCurrentPosition=" + this.userCurrentPosition + ", isGpsEnabled=" + this.isGpsEnabled + ", isGpsPermissionGranted=" + this.isGpsPermissionGranted + ", openedPointQuality=" + this.openedPointQuality + ')';
    }
}
