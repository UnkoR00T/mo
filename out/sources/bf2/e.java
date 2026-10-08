package bf2;

import com.google.android.gms.maps.model.LatLng;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lbf2/e;", "Ll00/e;", "Lbf2/e$a;", "Lmu/g;", "Li70/p;", "j", "()Lmu/g;", "snackBarVisibilityState", "a", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<Data> {
    mu.g<i70.p> j();

    /* JADX INFO: renamed from: bf2.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\"\u00100R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b&\u00100R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b1\u00108R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b$\u00107\u001a\u0004\b9\u00108R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b4\u0010:\u001a\u0004\b-\u0010;R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b(\u0010<\u001a\u0004\b6\u0010=R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b>\u0010<\u001a\u0004\b2\u0010=¨\u0006?"}, d2 = {"Lbf2/e$a;", "", "Li50/a;", "scaffoldData", "", "isMyLocationEnabled", "Lcom/google/android/gms/maps/model/LatLng;", "cameraPosition", "markerPosition", "Lmx/a;", "address", "bottomSheetTitle", "", "zoomMap", "Lh30/a;", "navigationButtonData", "confirmButtonData", "Lcb4/i;", "dialogVMSAdapter", "Lkotlin/Function0;", "Loq/i0;", "onSnackBarHidden", "onBackClick", "<init>", "(Li50/a;ZLcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;Lmx/a;Lmx/a;FLh30/a;Lh30/a;Lcb4/i;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "i", "()Li50/a;", "b", "Z", "k", "()Z", "c", "Lcom/google/android/gms/maps/model/LatLng;", "()Lcom/google/android/gms/maps/model/LatLng;", "d", "e", "Lmx/a;", "()Lmx/a;", "f", "g", "F", "j", "()F", "h", "Lh30/a;", "()Lh30/a;", "getConfirmButtonData", "Lcb4/i;", "()Lcb4/i;", "Ler/a;", "()Ler/a;", "l", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        private final ButtonData navigationButtonData;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData confirmButtonData;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i dialogVMSAdapter;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSnackBarHidden;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        public Data(BaseScaffoldData baseScaffoldData, boolean z15, LatLng latLng, LatLng latLng2, Label label, Label label2, float f15, ButtonData buttonData, ButtonData buttonData2, cb4.i iVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.scaffoldData = baseScaffoldData;
            this.isMyLocationEnabled = z15;
            this.cameraPosition = latLng;
            this.markerPosition = latLng2;
            this.address = label;
            this.bottomSheetTitle = label2;
            this.zoomMap = f15;
            this.navigationButtonData = buttonData;
            this.confirmButtonData = buttonData2;
            this.dialogVMSAdapter = iVar;
            this.onSnackBarHidden = aVar;
            this.onBackClick = aVar2;
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
        public final cb4.i getDialogVMSAdapter() {
            return this.dialogVMSAdapter;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final LatLng getMarkerPosition() {
            return this.markerPosition;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.scaffoldData, data.scaffoldData) && this.isMyLocationEnabled == data.isMyLocationEnabled && fr.t.c(this.cameraPosition, data.cameraPosition) && fr.t.c(this.markerPosition, data.markerPosition) && fr.t.c(this.address, data.address) && fr.t.c(this.bottomSheetTitle, data.bottomSheetTitle) && Float.compare(this.zoomMap, data.zoomMap) == 0 && fr.t.c(this.navigationButtonData, data.navigationButtonData) && fr.t.c(this.confirmButtonData, data.confirmButtonData) && fr.t.c(this.dialogVMSAdapter, data.dialogVMSAdapter) && fr.t.c(this.onSnackBarHidden, data.onSnackBarHidden) && fr.t.c(this.onBackClick, data.onBackClick);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final ButtonData getNavigationButtonData() {
            return this.navigationButtonData;
        }

        public final er.a<i0> g() {
            return this.onBackClick;
        }

        public final er.a<i0> h() {
            return this.onSnackBarHidden;
        }

        public int hashCode() {
            int iHashCode = ((this.scaffoldData.hashCode() * 31) + Boolean.hashCode(this.isMyLocationEnabled)) * 31;
            LatLng latLng = this.cameraPosition;
            int iHashCode2 = (iHashCode + (latLng == null ? 0 : latLng.hashCode())) * 31;
            LatLng latLng2 = this.markerPosition;
            int iHashCode3 = (((((((((((iHashCode2 + (latLng2 == null ? 0 : latLng2.hashCode())) * 31) + this.address.hashCode()) * 31) + this.bottomSheetTitle.hashCode()) * 31) + Float.hashCode(this.zoomMap)) * 31) + this.navigationButtonData.hashCode()) * 31) + this.confirmButtonData.hashCode()) * 31;
            cb4.i iVar = this.dialogVMSAdapter;
            return ((((iHashCode3 + (iVar != null ? iVar.hashCode() : 0)) * 31) + this.onSnackBarHidden.hashCode()) * 31) + this.onBackClick.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final float getZoomMap() {
            return this.zoomMap;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getIsMyLocationEnabled() {
            return this.isMyLocationEnabled;
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", isMyLocationEnabled=" + this.isMyLocationEnabled + ", cameraPosition=" + this.cameraPosition + ", markerPosition=" + this.markerPosition + ", address=" + this.address + ", bottomSheetTitle=" + this.bottomSheetTitle + ", zoomMap=" + this.zoomMap + ", navigationButtonData=" + this.navigationButtonData + ", confirmButtonData=" + this.confirmButtonData + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ", onSnackBarHidden=" + this.onSnackBarHidden + ", onBackClick=" + this.onBackClick + ')';
        }

        public /* synthetic */ Data(BaseScaffoldData baseScaffoldData, boolean z15, LatLng latLng, LatLng latLng2, Label label, Label label2, float f15, ButtonData buttonData, ButtonData buttonData2, cb4.i iVar, er.a aVar, er.a aVar2, int i15, fr.k kVar) {
            this(baseScaffoldData, z15, latLng, latLng2, label, label2, (i15 & 64) != 0 ? 15.0f : f15, buttonData, buttonData2, (i15 & 512) != 0 ? null : iVar, aVar, aVar2);
        }
    }
}
