package ob3;

import p071kotlin.Metadata;
import vy.Coordinates;
import z93.Place;

/* JADX INFO: renamed from: ob3.n, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lob3/n;", "", "Lz93/c;", "selectedPlace", "Lkotlin/Function1;", "Loq/i0;", "onPlaceSelected", "<init>", "(Lz93/c;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz93/c;", "b", "()Lz93/c;", "Ler/l;", "()Ler/l;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetupData {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f144310c = Coordinates.f208679c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Place selectedPlace;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.l<Place, oq.i0> onPlaceSelected;

    /* JADX WARN: Multi-variable type inference failed */
    public SetupData(Place place, er.l<? super Place, oq.i0> lVar) {
        this.selectedPlace = place;
        this.onPlaceSelected = lVar;
    }

    public final er.l<Place, oq.i0> a() {
        return this.onPlaceSelected;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Place getSelectedPlace() {
        return this.selectedPlace;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetupData)) {
            return false;
        }
        SetupData setupData = (SetupData) other;
        return fr.t.c(this.selectedPlace, setupData.selectedPlace) && fr.t.c(this.onPlaceSelected, setupData.onPlaceSelected);
    }

    public int hashCode() {
        Place place = this.selectedPlace;
        return ((place == null ? 0 : place.hashCode()) * 31) + this.onPlaceSelected.hashCode();
    }

    public String toString() {
        return "SetupData(selectedPlace=" + this.selectedPlace + ", onPlaceSelected=" + this.onPlaceSelected + ')';
    }
}
