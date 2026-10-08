package w82;

import com.google.android.gms.maps.model.LatLng;
import h30.ButtonData;
import oq.i0;
import p071kotlin.Metadata;
import w04.LocationCoordinates;
import w04.LocationDetails;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lw82/c;", "Ll00/e;", "Lw82/c$a;", "Lmu/g;", "Li70/p;", "j", "()Lmu/g;", "snackBarVisibilityState", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<Data> {

    /* JADX INFO: renamed from: w82.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b&\u0010,R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010'\u001a\u0004\b6\u0010)R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b3\u0010:\u001a\u0004\b1\u0010;R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00128\u0006¢\u0006\f\n\u0004\b(\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b8\u0010?\u001a\u0004\b*\u0010@R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00128\u0006¢\u0006\f\n\u0004\bA\u0010<\u001a\u0004\b5\u0010>R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\b-\u0010@¨\u0006C"}, d2 = {"Lw82/c$a;", "", "Lw04/a;", "locationCoordinates", "", "showBottomAddress", "Lcom/google/android/gms/maps/model/LatLng;", "markerLatLng", "Lw04/c;", "address", "Lw82/z;", "selectedAddress", "pinChosenByUser", "", "zoomMap", "Lkotlin/Function1;", "Loq/i0;", "onMapClick", "Lkotlin/Function0;", "getLocation", "Lh30/a;", "navigationButtonData", "onSnackBarHidden", "nextButtonData", "<init>", "(Lw04/a;ZLcom/google/android/gms/maps/model/LatLng;Lw04/c;Lw82/z;ZFLer/l;Ler/a;Lh30/a;Ler/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lw04/a;", "()Lw04/a;", "b", "Z", "i", "()Z", "c", "Lcom/google/android/gms/maps/model/LatLng;", "()Lcom/google/android/gms/maps/model/LatLng;", "d", "Lw04/c;", "getAddress", "()Lw04/c;", "e", "Lw82/z;", "h", "()Lw82/z;", "f", "g", "F", "j", "()F", "Ler/l;", "()Ler/l;", "Ler/a;", "getGetLocation", "()Ler/a;", "Lh30/a;", "()Lh30/a;", "k", "l", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocationCoordinates locationCoordinates;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showBottomAddress;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final LatLng markerLatLng;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocationDetails address;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final SelectedAddress selectedAddress;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean pinChosenByUser;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final float zoomMap;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<LatLng, i0> onMapClick;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> getLocation;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData navigationButtonData;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSnackBarHidden;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData nextButtonData;

        /* JADX WARN: Multi-variable type inference failed */
        public Data(LocationCoordinates locationCoordinates, boolean z15, LatLng latLng, LocationDetails locationDetails, SelectedAddress selectedAddress, boolean z16, float f15, er.l<? super LatLng, i0> lVar, er.a<i0> aVar, ButtonData buttonData, er.a<i0> aVar2, ButtonData buttonData2) {
            this.locationCoordinates = locationCoordinates;
            this.showBottomAddress = z15;
            this.markerLatLng = latLng;
            this.address = locationDetails;
            this.selectedAddress = selectedAddress;
            this.pinChosenByUser = z16;
            this.zoomMap = f15;
            this.onMapClick = lVar;
            this.getLocation = aVar;
            this.navigationButtonData = buttonData;
            this.onSnackBarHidden = aVar2;
            this.nextButtonData = buttonData2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocationCoordinates getLocationCoordinates() {
            return this.locationCoordinates;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LatLng getMarkerLatLng() {
            return this.markerLatLng;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ButtonData getNavigationButtonData() {
            return this.navigationButtonData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ButtonData getNextButtonData() {
            return this.nextButtonData;
        }

        public final er.l<LatLng, i0> e() {
            return this.onMapClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.locationCoordinates, data.locationCoordinates) && this.showBottomAddress == data.showBottomAddress && fr.t.c(this.markerLatLng, data.markerLatLng) && fr.t.c(this.address, data.address) && fr.t.c(this.selectedAddress, data.selectedAddress) && this.pinChosenByUser == data.pinChosenByUser && Float.compare(this.zoomMap, data.zoomMap) == 0 && fr.t.c(this.onMapClick, data.onMapClick) && fr.t.c(this.getLocation, data.getLocation) && fr.t.c(this.navigationButtonData, data.navigationButtonData) && fr.t.c(this.onSnackBarHidden, data.onSnackBarHidden) && fr.t.c(this.nextButtonData, data.nextButtonData);
        }

        public final er.a<i0> f() {
            return this.onSnackBarHidden;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getPinChosenByUser() {
            return this.pinChosenByUser;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final SelectedAddress getSelectedAddress() {
            return this.selectedAddress;
        }

        public int hashCode() {
            LocationCoordinates locationCoordinates = this.locationCoordinates;
            int iHashCode = (((locationCoordinates == null ? 0 : locationCoordinates.hashCode()) * 31) + Boolean.hashCode(this.showBottomAddress)) * 31;
            LatLng latLng = this.markerLatLng;
            return ((((((((((((((((((iHashCode + (latLng != null ? latLng.hashCode() : 0)) * 31) + this.address.hashCode()) * 31) + this.selectedAddress.hashCode()) * 31) + Boolean.hashCode(this.pinChosenByUser)) * 31) + Float.hashCode(this.zoomMap)) * 31) + this.onMapClick.hashCode()) * 31) + this.getLocation.hashCode()) * 31) + this.navigationButtonData.hashCode()) * 31) + this.onSnackBarHidden.hashCode()) * 31) + this.nextButtonData.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getShowBottomAddress() {
            return this.showBottomAddress;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final float getZoomMap() {
            return this.zoomMap;
        }

        public String toString() {
            return "Data(locationCoordinates=" + this.locationCoordinates + ", showBottomAddress=" + this.showBottomAddress + ", markerLatLng=" + this.markerLatLng + ", address=" + this.address + ", selectedAddress=" + this.selectedAddress + ", pinChosenByUser=" + this.pinChosenByUser + ", zoomMap=" + this.zoomMap + ", onMapClick=" + this.onMapClick + ", getLocation=" + this.getLocation + ", navigationButtonData=" + this.navigationButtonData + ", onSnackBarHidden=" + this.onSnackBarHidden + ", nextButtonData=" + this.nextButtonData + ')';
        }
    }

    oz.j a();

    mu.g<i70.p> j();
}
