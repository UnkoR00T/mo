package vh3;

import fr.t;
import he3.d;
import ja.n0;
import mu.g;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: vh3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lvh3/a;", "", "Lmx/a;", "title", "Lmu/g;", "Lja/n0;", "Lhe3/d;", "vehicleItems", "<init>", "(Lmx/a;Lmu/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "b", "Lmu/g;", "()Lmu/g;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleListAddedByPaging {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final g<n0<d>> vehicleItems;

    public VehicleListAddedByPaging(Label label, g<n0<d>> gVar) {
        this.title = label;
        this.vehicleItems = gVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public final g<n0<d>> b() {
        return this.vehicleItems;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleListAddedByPaging)) {
            return false;
        }
        VehicleListAddedByPaging vehicleListAddedByPaging = (VehicleListAddedByPaging) other;
        return t.c(this.title, vehicleListAddedByPaging.title) && t.c(this.vehicleItems, vehicleListAddedByPaging.vehicleItems);
    }

    public int hashCode() {
        Label label = this.title;
        return ((label == null ? 0 : label.hashCode()) * 31) + this.vehicleItems.hashCode();
    }

    public String toString() {
        return "VehicleListAddedByPaging(title=" + this.title + ", vehicleItems=" + this.vehicleItems + ')';
    }
}
