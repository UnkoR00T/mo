package kx;

import fr.t;
import p071kotlin.Metadata;
import vy.Coordinates;

/* JADX INFO: renamed from: kx.c, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"Lkx/c;", "", "Lvy/c;", "coordinates", "", "placeLabel", "<init>", "(Lvy/c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvy/c;", "()Lvy/c;", "b", "Ljava/lang/String;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ByCoordinates implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates coordinates;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String placeLabel;

    public ByCoordinates(Coordinates coordinates, String str) {
        this.coordinates = coordinates;
        this.placeLabel = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPlaceLabel() {
        return this.placeLabel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ByCoordinates)) {
            return false;
        }
        ByCoordinates byCoordinates = (ByCoordinates) other;
        return t.c(this.coordinates, byCoordinates.coordinates) && t.c(this.placeLabel, byCoordinates.placeLabel);
    }

    public int hashCode() {
        int iHashCode = this.coordinates.hashCode() * 31;
        String str = this.placeLabel;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ByCoordinates(coordinates=" + this.coordinates + ", placeLabel=" + this.placeLabel + ")";
    }
}
