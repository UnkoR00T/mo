package zy0;

import com.google.android.gms.maps.model.LatLng;
import fr.t;
import kh0.BEPlace;
import kh0.l;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zy0.c, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lzy0/c;", "Lbm/b;", "", "id", "Lcom/google/android/gms/maps/model/LatLng;", "itemPosition", "Lkh0/j;", "place", "Lkh0/l;", "quality", "<init>", "(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;Lkh0/j;Lkh0/l;)V", "getPosition", "()Lcom/google/android/gms/maps/model/LatLng;", "getTitle", "()Ljava/lang/String;", "b", "", "a", "()Ljava/lang/Float;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "Lcom/google/android/gms/maps/model/LatLng;", "d", "Lkh0/j;", "getPlace", "()Lkh0/j;", "Lkh0/l;", "e", "()Lkh0/l;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PointPinItem implements bm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final LatLng itemPosition;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPlace place;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final l quality;

    public PointPinItem(String str, LatLng latLng, BEPlace bEPlace, l lVar) {
        this.id = str;
        this.itemPosition = latLng;
        this.place = bEPlace;
        this.quality = lVar;
    }

    @Override // bm.b
    public Float a() {
        return Float.valueOf(0.0f);
    }

    @Override // bm.b
    public String b() {
        return null;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LatLng getItemPosition() {
        return this.itemPosition;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final l getQuality() {
        return this.quality;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointPinItem)) {
            return false;
        }
        PointPinItem pointPinItem = (PointPinItem) other;
        return t.c(this.id, pointPinItem.id) && t.c(this.itemPosition, pointPinItem.itemPosition) && t.c(this.place, pointPinItem.place) && this.quality == pointPinItem.quality;
    }

    @Override // bm.b
    public LatLng getPosition() {
        return this.itemPosition;
    }

    @Override // bm.b
    /* JADX INFO: renamed from: getTitle */
    public String getContentDescription() {
        return null;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.itemPosition.hashCode()) * 31) + this.place.hashCode()) * 31) + this.quality.hashCode();
    }

    public String toString() {
        return "PointPinItem(id=" + this.id + ", itemPosition=" + this.itemPosition + ", place=" + this.place + ", quality=" + this.quality + ')';
    }
}
