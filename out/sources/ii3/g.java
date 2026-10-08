package ii3;

import com.google.android.gms.maps.model.LatLng;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lii3/g;", "Ll00/e;", "Lii3/g$a;", "Lmu/g;", "Li70/p;", "j", "()Lmu/g;", "snackBarVisibilityState", "a", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g extends l00.e<Data> {
    mu.g<i70.p> j();

    /* JADX INFO: renamed from: ii3.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b*\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u001f\u0010-R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b#\u0010-R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b!\u0010/\u001a\u0004\b0\u00101R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b.\u00103R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b%\u00104\u001a\u0004\b+\u00105R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b7\u00105¨\u00068"}, d2 = {"Lii3/g$a;", "", "Li50/a;", "scaffoldData", "", "isMyLocationEnabled", "Lcom/google/android/gms/maps/model/LatLng;", "cameraPosition", "markerPosition", "Lmx/a;", "address", "bottomSheetTitle", "", "zoomMap", "Lkotlin/Function0;", "Loq/i0;", "onSnackBarHidden", "Lh30/a;", "navigationButtonData", "confirmButtonData", "<init>", "(Li50/a;ZLcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;Lmx/a;Lmx/a;FLer/a;Lh30/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "g", "()Li50/a;", "b", "Z", "i", "()Z", "c", "Lcom/google/android/gms/maps/model/LatLng;", "()Lcom/google/android/gms/maps/model/LatLng;", "d", "e", "Lmx/a;", "()Lmx/a;", "f", "F", "h", "()F", "Ler/a;", "()Ler/a;", "Lh30/a;", "()Lh30/a;", "j", "getConfirmButtonData", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isMyLocationEnabled;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final LatLng cameraPosition;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final LatLng markerPosition;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label address;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label bottomSheetTitle;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final float zoomMap;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSnackBarHidden;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData navigationButtonData;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData confirmButtonData;

        public Data(BaseScaffoldData baseScaffoldData, boolean z15, LatLng latLng, LatLng latLng2, Label label, Label label2, float f15, er.a<i0> aVar, ButtonData buttonData, ButtonData buttonData2) {
            this.scaffoldData = baseScaffoldData;
            this.isMyLocationEnabled = z15;
            this.cameraPosition = latLng;
            this.markerPosition = latLng2;
            this.address = label;
            this.bottomSheetTitle = label2;
            this.zoomMap = f15;
            this.onSnackBarHidden = aVar;
            this.navigationButtonData = buttonData;
            this.confirmButtonData = buttonData2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getAddress() {
            return this.address;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getBottomSheetTitle() {
            return this.bottomSheetTitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final LatLng getCameraPosition() {
            return this.cameraPosition;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final LatLng getMarkerPosition() {
            return this.markerPosition;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ButtonData getNavigationButtonData() {
            return this.navigationButtonData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.scaffoldData, data.scaffoldData) && this.isMyLocationEnabled == data.isMyLocationEnabled && fr.t.c(this.cameraPosition, data.cameraPosition) && fr.t.c(this.markerPosition, data.markerPosition) && fr.t.c(this.address, data.address) && fr.t.c(this.bottomSheetTitle, data.bottomSheetTitle) && Float.compare(this.zoomMap, data.zoomMap) == 0 && fr.t.c(this.onSnackBarHidden, data.onSnackBarHidden) && fr.t.c(this.navigationButtonData, data.navigationButtonData) && fr.t.c(this.confirmButtonData, data.confirmButtonData);
        }

        public final er.a<i0> f() {
            return this.onSnackBarHidden;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final float getZoomMap() {
            return this.zoomMap;
        }

        public int hashCode() {
            int iHashCode = ((this.scaffoldData.hashCode() * 31) + Boolean.hashCode(this.isMyLocationEnabled)) * 31;
            LatLng latLng = this.cameraPosition;
            int iHashCode2 = (iHashCode + (latLng == null ? 0 : latLng.hashCode())) * 31;
            LatLng latLng2 = this.markerPosition;
            return ((((((((((((iHashCode2 + (latLng2 != null ? latLng2.hashCode() : 0)) * 31) + this.address.hashCode()) * 31) + this.bottomSheetTitle.hashCode()) * 31) + Float.hashCode(this.zoomMap)) * 31) + this.onSnackBarHidden.hashCode()) * 31) + this.navigationButtonData.hashCode()) * 31) + this.confirmButtonData.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getIsMyLocationEnabled() {
            return this.isMyLocationEnabled;
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", isMyLocationEnabled=" + this.isMyLocationEnabled + ", cameraPosition=" + this.cameraPosition + ", markerPosition=" + this.markerPosition + ", address=" + this.address + ", bottomSheetTitle=" + this.bottomSheetTitle + ", zoomMap=" + this.zoomMap + ", onSnackBarHidden=" + this.onSnackBarHidden + ", navigationButtonData=" + this.navigationButtonData + ", confirmButtonData=" + this.confirmButtonData + ')';
        }

        public /* synthetic */ Data(BaseScaffoldData baseScaffoldData, boolean z15, LatLng latLng, LatLng latLng2, Label label, Label label2, float f15, er.a aVar, ButtonData buttonData, ButtonData buttonData2, int i15, fr.k kVar) {
            this(baseScaffoldData, z15, latLng, latLng2, label, label2, (i15 & 64) != 0 ? 15.0f : f15, aVar, buttonData, buttonData2);
        }
    }
}
