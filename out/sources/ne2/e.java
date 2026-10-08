package ne2;

import com.google.android.gms.maps.model.LatLng;
import h30.ButtonData;
import i50.BaseScaffoldData;
import oq.i0;
import p071kotlin.Metadata;
import pe2.SelectedAddress;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lne2/e;", "Ll00/e;", "Lne2/e$a;", "Lmu/g;", "Li70/p;", "j", "()Lmu/g;", "snackBarVisibilityState", "a", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<Data> {

    /* JADX INFO: renamed from: ne2.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00100\u000f\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b(\u0010.R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b/\u0010.R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b,\u0010:R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b;\u0010=R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b>\u0010<\u001a\u0004\b>\u0010=R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00148\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b?\u0010AR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b2\u0010B\u001a\u0004\b0\u0010CR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00148\u0006¢\u0006\f\n\u0004\b*\u0010@\u001a\u0004\b8\u0010AR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u00148\u0006¢\u0006\f\n\u0004\b6\u0010@\u001a\u0004\b4\u0010A¨\u0006D"}, d2 = {"Lne2/e$a;", "", "Li50/a;", "baseScaffoldData", "", "showMyLocalization", "Lcom/google/android/gms/maps/model/LatLng;", "cameraPosition", "markerCoordinates", "Lpe2/a;", "selectedAddress", "", "zoomMap", "Lcb4/i;", "dialogVMS", "Lkotlin/Function1;", "Loq/i0;", "onMapClick", "Lnh/k;", "onPOIClick", "Lkotlin/Function0;", "onSnackBarHidden", "Lh30/a;", "navigationButtonData", "onCameraMoved", "onBackClick", "<init>", "(Li50/a;ZLcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;Lpe2/a;FLcb4/i;Ler/l;Ler/l;Ler/a;Lh30/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Z", "l", "()Z", "c", "Lcom/google/android/gms/maps/model/LatLng;", "()Lcom/google/android/gms/maps/model/LatLng;", "d", "e", "Lpe2/a;", "k", "()Lpe2/a;", "f", "F", "m", "()F", "g", "Lcb4/i;", "()Lcb4/i;", "h", "Ler/l;", "()Ler/l;", "i", "j", "Ler/a;", "()Ler/a;", "Lh30/a;", "()Lh30/a;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showMyLocalization;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final LatLng cameraPosition;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final LatLng markerCoordinates;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final SelectedAddress selectedAddress;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final float zoomMap;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i dialogVMS;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<LatLng, i0> onMapClick;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<nh.k, i0> onPOIClick;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSnackBarHidden;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData navigationButtonData;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCameraMoved;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Data(BaseScaffoldData baseScaffoldData, boolean z15, LatLng latLng, LatLng latLng2, SelectedAddress selectedAddress, float f15, cb4.i iVar, er.l<? super LatLng, i0> lVar, er.l<? super nh.k, i0> lVar2, er.a<i0> aVar, ButtonData buttonData, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.baseScaffoldData = baseScaffoldData;
            this.showMyLocalization = z15;
            this.cameraPosition = latLng;
            this.markerCoordinates = latLng2;
            this.selectedAddress = selectedAddress;
            this.zoomMap = f15;
            this.dialogVMS = iVar;
            this.onMapClick = lVar;
            this.onPOIClick = lVar2;
            this.onSnackBarHidden = aVar;
            this.navigationButtonData = buttonData;
            this.onCameraMoved = aVar2;
            this.onBackClick = aVar3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LatLng getCameraPosition() {
            return this.cameraPosition;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final cb4.i getDialogVMS() {
            return this.dialogVMS;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final LatLng getMarkerCoordinates() {
            return this.markerCoordinates;
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
            return fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && this.showMyLocalization == data.showMyLocalization && fr.t.c(this.cameraPosition, data.cameraPosition) && fr.t.c(this.markerCoordinates, data.markerCoordinates) && fr.t.c(this.selectedAddress, data.selectedAddress) && Float.compare(this.zoomMap, data.zoomMap) == 0 && fr.t.c(this.dialogVMS, data.dialogVMS) && fr.t.c(this.onMapClick, data.onMapClick) && fr.t.c(this.onPOIClick, data.onPOIClick) && fr.t.c(this.onSnackBarHidden, data.onSnackBarHidden) && fr.t.c(this.navigationButtonData, data.navigationButtonData) && fr.t.c(this.onCameraMoved, data.onCameraMoved) && fr.t.c(this.onBackClick, data.onBackClick);
        }

        public final er.a<i0> f() {
            return this.onBackClick;
        }

        public final er.a<i0> g() {
            return this.onCameraMoved;
        }

        public final er.l<LatLng, i0> h() {
            return this.onMapClick;
        }

        public int hashCode() {
            int iHashCode = ((this.baseScaffoldData.hashCode() * 31) + Boolean.hashCode(this.showMyLocalization)) * 31;
            LatLng latLng = this.cameraPosition;
            int iHashCode2 = (iHashCode + (latLng == null ? 0 : latLng.hashCode())) * 31;
            LatLng latLng2 = this.markerCoordinates;
            int iHashCode3 = (iHashCode2 + (latLng2 == null ? 0 : latLng2.hashCode())) * 31;
            SelectedAddress selectedAddress = this.selectedAddress;
            int iHashCode4 = (((iHashCode3 + (selectedAddress == null ? 0 : selectedAddress.hashCode())) * 31) + Float.hashCode(this.zoomMap)) * 31;
            cb4.i iVar = this.dialogVMS;
            return ((((((((((((iHashCode4 + (iVar != null ? iVar.hashCode() : 0)) * 31) + this.onMapClick.hashCode()) * 31) + this.onPOIClick.hashCode()) * 31) + this.onSnackBarHidden.hashCode()) * 31) + this.navigationButtonData.hashCode()) * 31) + this.onCameraMoved.hashCode()) * 31) + this.onBackClick.hashCode();
        }

        public final er.l<nh.k, i0> i() {
            return this.onPOIClick;
        }

        public final er.a<i0> j() {
            return this.onSnackBarHidden;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final SelectedAddress getSelectedAddress() {
            return this.selectedAddress;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final boolean getShowMyLocalization() {
            return this.showMyLocalization;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final float getZoomMap() {
            return this.zoomMap;
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", showMyLocalization=" + this.showMyLocalization + ", cameraPosition=" + this.cameraPosition + ", markerCoordinates=" + this.markerCoordinates + ", selectedAddress=" + this.selectedAddress + ", zoomMap=" + this.zoomMap + ", dialogVMS=" + this.dialogVMS + ", onMapClick=" + this.onMapClick + ", onPOIClick=" + this.onPOIClick + ", onSnackBarHidden=" + this.onSnackBarHidden + ", navigationButtonData=" + this.navigationButtonData + ", onCameraMoved=" + this.onCameraMoved + ", onBackClick=" + this.onBackClick + ')';
        }
    }

    mu.g<i70.p> j();
}
