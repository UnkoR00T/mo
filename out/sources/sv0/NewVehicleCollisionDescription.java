package sv0;

import p071kotlin.Metadata;
import vy.Coordinates;

/* JADX INFO: renamed from: sv0.w, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u0017\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b!\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b\u001b\u0010#¨\u0006$"}, d2 = {"Lsv0/w;", "", "Lsv0/y;", "processId", "Lfz/b$d;", "date", "Liy/b0;", "collisionDescription", "localizationDescription", "Lvy/c;", "coordinates", "<init>", "(Lsv0/y;Lfz/b$d;Liy/b0;Liy/b0;Lvy/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/y;", "e", "()Lsv0/y;", "b", "Lfz/b$d;", "c", "()Lfz/b$d;", "Liy/b0;", "()Liy/b0;", "d", "Lvy/c;", "()Lvy/c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NewVehicleCollisionDescription {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProcessId processId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDateTime date;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 collisionDescription;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 localizationDescription;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates coordinates;

    public NewVehicleCollisionDescription(ProcessId processId, fz.b.LocalDateTime localDateTime, iy.b0 b0Var, iy.b0 b0Var2, Coordinates coordinates) {
        this.processId = processId;
        this.date = localDateTime;
        this.collisionDescription = b0Var;
        this.localizationDescription = b0Var2;
        this.coordinates = coordinates;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final iy.b0 getCollisionDescription() {
        return this.collisionDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final fz.b.LocalDateTime getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final iy.b0 getLocalizationDescription() {
        return this.localizationDescription;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ProcessId getProcessId() {
        return this.processId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewVehicleCollisionDescription)) {
            return false;
        }
        NewVehicleCollisionDescription newVehicleCollisionDescription = (NewVehicleCollisionDescription) other;
        return fr.t.c(this.processId, newVehicleCollisionDescription.processId) && fr.t.c(this.date, newVehicleCollisionDescription.date) && fr.t.c(this.collisionDescription, newVehicleCollisionDescription.collisionDescription) && fr.t.c(this.localizationDescription, newVehicleCollisionDescription.localizationDescription) && fr.t.c(this.coordinates, newVehicleCollisionDescription.coordinates);
    }

    public int hashCode() {
        return (((((((this.processId.hashCode() * 31) + this.date.hashCode()) * 31) + this.collisionDescription.hashCode()) * 31) + this.localizationDescription.hashCode()) * 31) + this.coordinates.hashCode();
    }

    public String toString() {
        return "NewVehicleCollisionDescription(processId=" + this.processId + ", date=" + this.date + ", collisionDescription=" + this.collisionDescription + ", localizationDescription=" + this.localizationDescription + ", coordinates=" + this.coordinates + ")";
    }
}
