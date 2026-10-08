package fy0;

import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fy0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b\u001b\u0010&¨\u0006'"}, d2 = {"Lfy0/b;", "", "", "id", "Lfy0/a;", "coordinates", "Lfy0/c;", "place", "Lfy0/d;", "quality", "Ljava/time/OffsetDateTime;", "timestamp", "expirationTimestamp", "<init>", "(Ljava/lang/String;Lfy0/a;Lfy0/c;Lfy0/d;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lfy0/a;", "()Lfy0/a;", "Lfy0/c;", "d", "()Lfy0/c;", "Lfy0/d;", "e", "()Lfy0/d;", "Ljava/time/OffsetDateTime;", "f", "()Ljava/time/OffsetDateTime;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MeasurementPointEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final CoordinatesEntity coordinates;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final PlaceEntity place;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final QualityEntity quality;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime timestamp;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime expirationTimestamp;

    public MeasurementPointEntity(String str, CoordinatesEntity coordinatesEntity, PlaceEntity placeEntity, QualityEntity qualityEntity, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2) {
        this.id = str;
        this.coordinates = coordinatesEntity;
        this.place = placeEntity;
        this.quality = qualityEntity;
        this.timestamp = offsetDateTime;
        this.expirationTimestamp = offsetDateTime2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CoordinatesEntity getCoordinates() {
        return this.coordinates;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OffsetDateTime getExpirationTimestamp() {
        return this.expirationTimestamp;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final PlaceEntity getPlace() {
        return this.place;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final QualityEntity getQuality() {
        return this.quality;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MeasurementPointEntity)) {
            return false;
        }
        MeasurementPointEntity measurementPointEntity = (MeasurementPointEntity) other;
        return t.c(this.id, measurementPointEntity.id) && t.c(this.coordinates, measurementPointEntity.coordinates) && t.c(this.place, measurementPointEntity.place) && t.c(this.quality, measurementPointEntity.quality) && t.c(this.timestamp, measurementPointEntity.timestamp) && t.c(this.expirationTimestamp, measurementPointEntity.expirationTimestamp);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final OffsetDateTime getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.coordinates.hashCode()) * 31) + this.place.hashCode()) * 31) + this.quality.hashCode()) * 31) + this.timestamp.hashCode()) * 31) + this.expirationTimestamp.hashCode();
    }

    public String toString() {
        return "MeasurementPointEntity(id=" + this.id + ", coordinates=" + this.coordinates + ", place=" + this.place + ", quality=" + this.quality + ", timestamp=" + this.timestamp + ", expirationTimestamp=" + this.expirationTimestamp + ')';
    }
}
