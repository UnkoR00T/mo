package d72;

import com.google.android.gms.maps.model.LatLng;
import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: d72.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u0019"}, d2 = {"Ld72/a;", "", "", "Lcom/google/android/gms/maps/model/LatLng;", "outline", "holes", "", "color", "<init>", "(Ljava/util/List;Ljava/util/List;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "I", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HydroArea {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<LatLng> outline;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<List<LatLng>> holes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int color;

    /* JADX WARN: Multi-variable type inference failed */
    public HydroArea(List<LatLng> list, List<? extends List<LatLng>> list2, int i15) {
        this.outline = list;
        this.holes = list2;
        this.color = i15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    public final List<List<LatLng>> b() {
        return this.holes;
    }

    public final List<LatLng> c() {
        return this.outline;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HydroArea)) {
            return false;
        }
        HydroArea hydroArea = (HydroArea) other;
        return t.c(this.outline, hydroArea.outline) && t.c(this.holes, hydroArea.holes) && this.color == hydroArea.color;
    }

    public int hashCode() {
        return (((this.outline.hashCode() * 31) + this.holes.hashCode()) * 31) + Integer.hashCode(this.color);
    }

    public String toString() {
        return "HydroArea(outline=" + this.outline + ", holes=" + this.holes + ", color=" + this.color + ')';
    }
}
