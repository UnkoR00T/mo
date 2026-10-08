package qj1;

import p071kotlin.Metadata;
import vy.Coordinates;
import zp0.AvailableDefenceTrainings;
import zp0.BEUnitDefenceTrainingsByType;

/* JADX INFO: renamed from: qj1.f, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J^\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b+\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010,\u001a\u0004\b#\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b'\u0010/¨\u00060"}, d2 = {"Lqj1/f;", "", "Lzp0/s;", "listOfPoints", "Lqj1/i;", "trainingsByDistance", "Lvy/c;", "userCurrentPosition", "", "isGpsEnabled", "isGpsPermissionGranted", "Lzp0/a;", "lastSelectedLocationMap", "Lqj1/g;", "lastSelectedLocationMapPosition", "<init>", "(Lzp0/s;Lqj1/i;Lvy/c;ZZLzp0/a;Lqj1/g;)V", "a", "(Lzp0/s;Lqj1/i;Lvy/c;ZZLzp0/a;Lqj1/g;)Lqj1/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lzp0/s;", "e", "()Lzp0/s;", "b", "Lqj1/i;", "f", "()Lqj1/i;", "c", "Lvy/c;", "g", "()Lvy/c;", "d", "Z", "h", "()Z", "i", "Lzp0/a;", "()Lzp0/a;", "Lqj1/g;", "()Lqj1/g;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Form {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEUnitDefenceTrainingsByType listOfPoints;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TrainingsByDistance trainingsByDistance;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates userCurrentPosition;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isGpsEnabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isGpsPermissionGranted;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AvailableDefenceTrainings lastSelectedLocationMap;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final MapPosition lastSelectedLocationMapPosition;

    public Form(BEUnitDefenceTrainingsByType bEUnitDefenceTrainingsByType, TrainingsByDistance trainingsByDistance, Coordinates coordinates, boolean z15, boolean z16, AvailableDefenceTrainings availableDefenceTrainings, MapPosition mapPosition) {
        this.listOfPoints = bEUnitDefenceTrainingsByType;
        this.trainingsByDistance = trainingsByDistance;
        this.userCurrentPosition = coordinates;
        this.isGpsEnabled = z15;
        this.isGpsPermissionGranted = z16;
        this.lastSelectedLocationMap = availableDefenceTrainings;
        this.lastSelectedLocationMapPosition = mapPosition;
    }

    public static /* synthetic */ Form b(Form form, BEUnitDefenceTrainingsByType bEUnitDefenceTrainingsByType, TrainingsByDistance trainingsByDistance, Coordinates coordinates, boolean z15, boolean z16, AvailableDefenceTrainings availableDefenceTrainings, MapPosition mapPosition, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            bEUnitDefenceTrainingsByType = form.listOfPoints;
        }
        if ((i15 & 2) != 0) {
            trainingsByDistance = form.trainingsByDistance;
        }
        if ((i15 & 4) != 0) {
            coordinates = form.userCurrentPosition;
        }
        if ((i15 & 8) != 0) {
            z15 = form.isGpsEnabled;
        }
        if ((i15 & 16) != 0) {
            z16 = form.isGpsPermissionGranted;
        }
        if ((i15 & 32) != 0) {
            availableDefenceTrainings = form.lastSelectedLocationMap;
        }
        if ((i15 & 64) != 0) {
            mapPosition = form.lastSelectedLocationMapPosition;
        }
        AvailableDefenceTrainings availableDefenceTrainings2 = availableDefenceTrainings;
        MapPosition mapPosition2 = mapPosition;
        boolean z17 = z16;
        Coordinates coordinates2 = coordinates;
        return form.a(bEUnitDefenceTrainingsByType, trainingsByDistance, coordinates2, z15, z17, availableDefenceTrainings2, mapPosition2);
    }

    public final Form a(BEUnitDefenceTrainingsByType listOfPoints, TrainingsByDistance trainingsByDistance, Coordinates userCurrentPosition, boolean isGpsEnabled, boolean isGpsPermissionGranted, AvailableDefenceTrainings lastSelectedLocationMap, MapPosition lastSelectedLocationMapPosition) {
        return new Form(listOfPoints, trainingsByDistance, userCurrentPosition, isGpsEnabled, isGpsPermissionGranted, lastSelectedLocationMap, lastSelectedLocationMapPosition);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AvailableDefenceTrainings getLastSelectedLocationMap() {
        return this.lastSelectedLocationMap;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final MapPosition getLastSelectedLocationMapPosition() {
        return this.lastSelectedLocationMapPosition;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final BEUnitDefenceTrainingsByType getListOfPoints() {
        return this.listOfPoints;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Form)) {
            return false;
        }
        Form form = (Form) other;
        return fr.t.c(this.listOfPoints, form.listOfPoints) && fr.t.c(this.trainingsByDistance, form.trainingsByDistance) && fr.t.c(this.userCurrentPosition, form.userCurrentPosition) && this.isGpsEnabled == form.isGpsEnabled && this.isGpsPermissionGranted == form.isGpsPermissionGranted && fr.t.c(this.lastSelectedLocationMap, form.lastSelectedLocationMap) && fr.t.c(this.lastSelectedLocationMapPosition, form.lastSelectedLocationMapPosition);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TrainingsByDistance getTrainingsByDistance() {
        return this.trainingsByDistance;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Coordinates getUserCurrentPosition() {
        return this.userCurrentPosition;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsGpsEnabled() {
        return this.isGpsEnabled;
    }

    public int hashCode() {
        int iHashCode = this.listOfPoints.hashCode() * 31;
        TrainingsByDistance trainingsByDistance = this.trainingsByDistance;
        int iHashCode2 = (iHashCode + (trainingsByDistance == null ? 0 : trainingsByDistance.hashCode())) * 31;
        Coordinates coordinates = this.userCurrentPosition;
        int iHashCode3 = (((((iHashCode2 + (coordinates == null ? 0 : coordinates.hashCode())) * 31) + Boolean.hashCode(this.isGpsEnabled)) * 31) + Boolean.hashCode(this.isGpsPermissionGranted)) * 31;
        AvailableDefenceTrainings availableDefenceTrainings = this.lastSelectedLocationMap;
        int iHashCode4 = (iHashCode3 + (availableDefenceTrainings == null ? 0 : availableDefenceTrainings.hashCode())) * 31;
        MapPosition mapPosition = this.lastSelectedLocationMapPosition;
        return iHashCode4 + (mapPosition != null ? mapPosition.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsGpsPermissionGranted() {
        return this.isGpsPermissionGranted;
    }

    public String toString() {
        return "Form(listOfPoints=" + this.listOfPoints + ", trainingsByDistance=" + this.trainingsByDistance + ", userCurrentPosition=" + this.userCurrentPosition + ", isGpsEnabled=" + this.isGpsEnabled + ", isGpsPermissionGranted=" + this.isGpsPermissionGranted + ", lastSelectedLocationMap=" + this.lastSelectedLocationMap + ", lastSelectedLocationMapPosition=" + this.lastSelectedLocationMapPosition + ')';
    }

    public /* synthetic */ Form(BEUnitDefenceTrainingsByType bEUnitDefenceTrainingsByType, TrainingsByDistance trainingsByDistance, Coordinates coordinates, boolean z15, boolean z16, AvailableDefenceTrainings availableDefenceTrainings, MapPosition mapPosition, int i15, fr.k kVar) {
        this(bEUnitDefenceTrainingsByType, (i15 & 2) != 0 ? null : trainingsByDistance, (i15 & 4) != 0 ? null : coordinates, (i15 & 8) != 0 ? false : z15, (i15 & 16) != 0 ? false : z16, (i15 & 32) != 0 ? null : availableDefenceTrainings, (i15 & 64) != 0 ? null : mapPosition);
    }
}
