package kh0;

import fr.t;
import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import vy.Coordinates;

/* JADX INFO: renamed from: kh0.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u001d\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b)\u0010.R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010.R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b,\u00103R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b\u0012\u00103¨\u00065"}, d2 = {"Lkh0/e;", "", "", "id", "Lvy/c;", "coordinates", "Lkh0/j;", "place", "Lkh0/f;", "quality", "", "Lkh0/c;", "closePoints", "Ljava/time/OffsetDateTime;", "timestamp", "expirationTimestamp", "", "isFavourite", "isExpired", "<init>", "(Ljava/lang/String;Lvy/c;Lkh0/j;Lkh0/f;Ljava/util/List;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lvy/c;", "getCoordinates", "()Lvy/c;", "c", "Lkh0/j;", "()Lkh0/j;", "d", "Lkh0/f;", "()Lkh0/f;", "e", "Ljava/util/List;", "()Ljava/util/List;", "f", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "g", "getExpirationTimestamp", "h", "Z", "()Z", "i", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEExtendedMeasurementPoint {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates coordinates;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPlace place;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEExtendedQuality quality;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEBasicMeasurementPoint> closePoints;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime timestamp;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime expirationTimestamp;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFavourite;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isExpired;

    public BEExtendedMeasurementPoint(String str, Coordinates coordinates, BEPlace bEPlace, BEExtendedQuality bEExtendedQuality, List<BEBasicMeasurementPoint> list, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, boolean z15, boolean z16) {
        this.id = str;
        this.coordinates = coordinates;
        this.place = bEPlace;
        this.quality = bEExtendedQuality;
        this.closePoints = list;
        this.timestamp = offsetDateTime;
        this.expirationTimestamp = offsetDateTime2;
        this.isFavourite = z15;
        this.isExpired = z16;
    }

    public final List<BEBasicMeasurementPoint> a() {
        return this.closePoints;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BEPlace getPlace() {
        return this.place;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BEExtendedQuality getQuality() {
        return this.quality;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final OffsetDateTime getTimestamp() {
        return this.timestamp;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEExtendedMeasurementPoint)) {
            return false;
        }
        BEExtendedMeasurementPoint bEExtendedMeasurementPoint = (BEExtendedMeasurementPoint) other;
        return t.c(this.id, bEExtendedMeasurementPoint.id) && t.c(this.coordinates, bEExtendedMeasurementPoint.coordinates) && t.c(this.place, bEExtendedMeasurementPoint.place) && t.c(this.quality, bEExtendedMeasurementPoint.quality) && t.c(this.closePoints, bEExtendedMeasurementPoint.closePoints) && t.c(this.timestamp, bEExtendedMeasurementPoint.timestamp) && t.c(this.expirationTimestamp, bEExtendedMeasurementPoint.expirationTimestamp) && this.isFavourite == bEExtendedMeasurementPoint.isFavourite && this.isExpired == bEExtendedMeasurementPoint.isExpired;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsFavourite() {
        return this.isFavourite;
    }

    public int hashCode() {
        return (((((((((((((((this.id.hashCode() * 31) + this.coordinates.hashCode()) * 31) + this.place.hashCode()) * 31) + this.quality.hashCode()) * 31) + this.closePoints.hashCode()) * 31) + this.timestamp.hashCode()) * 31) + this.expirationTimestamp.hashCode()) * 31) + Boolean.hashCode(this.isFavourite)) * 31) + Boolean.hashCode(this.isExpired);
    }

    public String toString() {
        return "BEExtendedMeasurementPoint(id=" + this.id + ", coordinates=" + this.coordinates + ", place=" + this.place + ", quality=" + this.quality + ", closePoints=" + this.closePoints + ", timestamp=" + this.timestamp + ", expirationTimestamp=" + this.expirationTimestamp + ", isFavourite=" + this.isFavourite + ", isExpired=" + this.isExpired + ")";
    }

    public /* synthetic */ BEExtendedMeasurementPoint(String str, Coordinates coordinates, BEPlace bEPlace, BEExtendedQuality bEExtendedQuality, List list, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, boolean z15, boolean z16, int i15, fr.k kVar) {
        this(str, coordinates, bEPlace, bEExtendedQuality, (i15 & 16) != 0 ? v.n() : list, offsetDateTime, offsetDateTime2, z15, z16);
    }
}
