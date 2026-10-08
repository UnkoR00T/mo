package rb3;

import com.google.android.gms.maps.model.LatLng;
import fr.t;
import h30.ButtonData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: rb3.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u0016\u0010\"¨\u0006#"}, d2 = {"Lrb3/a;", "", "Lmx/a;", "header", "description", "Lcom/google/android/gms/maps/model/LatLng;", "coordinates", "", "isSupported", "Lh30/a;", "button", "<init>", "(Lmx/a;Lmx/a;Lcom/google/android/gms/maps/model/LatLng;ZLh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "d", "()Lmx/a;", "b", "c", "Lcom/google/android/gms/maps/model/LatLng;", "()Lcom/google/android/gms/maps/model/LatLng;", "Z", "e", "()Z", "Lh30/a;", "()Lh30/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectedPlaceData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label header;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final LatLng coordinates;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSupported;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonData button;

    public SelectedPlaceData(Label label, Label label2, LatLng latLng, boolean z15, ButtonData buttonData) {
        this.header = label;
        this.description = label2;
        this.coordinates = latLng;
        this.isSupported = z15;
        this.button = buttonData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ButtonData getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LatLng getCoordinates() {
        return this.coordinates;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsSupported() {
        return this.isSupported;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectedPlaceData)) {
            return false;
        }
        SelectedPlaceData selectedPlaceData = (SelectedPlaceData) other;
        return t.c(this.header, selectedPlaceData.header) && t.c(this.description, selectedPlaceData.description) && t.c(this.coordinates, selectedPlaceData.coordinates) && this.isSupported == selectedPlaceData.isSupported && t.c(this.button, selectedPlaceData.button);
    }

    public int hashCode() {
        return (((((((this.header.hashCode() * 31) + this.description.hashCode()) * 31) + this.coordinates.hashCode()) * 31) + Boolean.hashCode(this.isSupported)) * 31) + this.button.hashCode();
    }

    public String toString() {
        return "SelectedPlaceData(header=" + this.header + ", description=" + this.description + ", coordinates=" + this.coordinates + ", isSupported=" + this.isSupported + ", button=" + this.button + ')';
    }
}
