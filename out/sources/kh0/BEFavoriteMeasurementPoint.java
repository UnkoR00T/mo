package kh0;

import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;
import vy.Coordinates;

/* JADX INFO: renamed from: kh0.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001e\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b!\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\r\u0010)¨\u0006*"}, d2 = {"Lkh0/g;", "", "", "id", "Lvy/c;", "coordinates", "Lkh0/j;", "place", "Lkh0/l;", "quality", "Ljava/time/OffsetDateTime;", "timestamp", "", "isActive", "<init>", "(Ljava/lang/String;Lvy/c;Lkh0/j;Lkh0/l;Ljava/time/OffsetDateTime;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lvy/c;", "getCoordinates", "()Lvy/c;", "c", "Lkh0/j;", "()Lkh0/j;", "d", "Lkh0/l;", "()Lkh0/l;", "e", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "f", "Z", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEFavoriteMeasurementPoint {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates coordinates;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPlace place;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final l quality;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime timestamp;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isActive;

    public BEFavoriteMeasurementPoint(String str, Coordinates coordinates, BEPlace bEPlace, l lVar, OffsetDateTime offsetDateTime, boolean z15) {
        this.id = str;
        this.coordinates = coordinates;
        this.place = bEPlace;
        this.quality = lVar;
        this.timestamp = offsetDateTime;
        this.isActive = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BEPlace getPlace() {
        return this.place;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final l getQuality() {
        return this.quality;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final OffsetDateTime getTimestamp() {
        return this.timestamp;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEFavoriteMeasurementPoint)) {
            return false;
        }
        BEFavoriteMeasurementPoint bEFavoriteMeasurementPoint = (BEFavoriteMeasurementPoint) other;
        return t.c(this.id, bEFavoriteMeasurementPoint.id) && t.c(this.coordinates, bEFavoriteMeasurementPoint.coordinates) && t.c(this.place, bEFavoriteMeasurementPoint.place) && this.quality == bEFavoriteMeasurementPoint.quality && t.c(this.timestamp, bEFavoriteMeasurementPoint.timestamp) && this.isActive == bEFavoriteMeasurementPoint.isActive;
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.coordinates.hashCode()) * 31) + this.place.hashCode()) * 31) + this.quality.hashCode()) * 31;
        OffsetDateTime offsetDateTime = this.timestamp;
        return ((iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31) + Boolean.hashCode(this.isActive);
    }

    public String toString() {
        return "BEFavoriteMeasurementPoint(id=" + this.id + ", coordinates=" + this.coordinates + ", place=" + this.place + ", quality=" + this.quality + ", timestamp=" + this.timestamp + ", isActive=" + this.isActive + ")";
    }
}
