package kh0;

import fr.t;
import p071kotlin.Metadata;
import vy.Coordinates;

/* JADX INFO: renamed from: kh0.c, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u000b\u0010$R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b\f\u0010$¨\u0006&"}, d2 = {"Lkh0/c;", "", "", "id", "Lvy/c;", "coordinates", "Lkh0/j;", "place", "Lkh0/l;", "quality", "", "isFavourite", "isExpired", "<init>", "(Ljava/lang/String;Lvy/c;Lkh0/j;Lkh0/l;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lvy/c;", "()Lvy/c;", "c", "Lkh0/j;", "()Lkh0/j;", "d", "Lkh0/l;", "()Lkh0/l;", "e", "Z", "()Z", "f", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEBasicMeasurementPoint {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates coordinates;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPlace place;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final l quality;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFavourite;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isExpired;

    public BEBasicMeasurementPoint(String str, Coordinates coordinates, BEPlace bEPlace, l lVar, boolean z15, boolean z16) {
        this.id = str;
        this.coordinates = coordinates;
        this.place = bEPlace;
        this.quality = lVar;
        this.isFavourite = z15;
        this.isExpired = z16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Coordinates getCoordinates() {
        return this.coordinates;
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
    public final l getQuality() {
        return this.quality;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEBasicMeasurementPoint)) {
            return false;
        }
        BEBasicMeasurementPoint bEBasicMeasurementPoint = (BEBasicMeasurementPoint) other;
        return t.c(this.id, bEBasicMeasurementPoint.id) && t.c(this.coordinates, bEBasicMeasurementPoint.coordinates) && t.c(this.place, bEBasicMeasurementPoint.place) && this.quality == bEBasicMeasurementPoint.quality && this.isFavourite == bEBasicMeasurementPoint.isFavourite && this.isExpired == bEBasicMeasurementPoint.isExpired;
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.coordinates.hashCode()) * 31) + this.place.hashCode()) * 31) + this.quality.hashCode()) * 31) + Boolean.hashCode(this.isFavourite)) * 31) + Boolean.hashCode(this.isExpired);
    }

    public String toString() {
        return "BEBasicMeasurementPoint(id=" + this.id + ", coordinates=" + this.coordinates + ", place=" + this.place + ", quality=" + this.quality + ", isFavourite=" + this.isFavourite + ", isExpired=" + this.isExpired + ")";
    }
}
