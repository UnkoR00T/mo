package yw3;

import e70.CameraPermissionNotGrantedData;
import fx.Rectangle;
import h30.ButtonData;
import i20.ScannerViewData;
import i50.BaseScaffoldData;
import jw3.MaskDefinition;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lyw3/f;", "Ll00/e;", "Lyw3/f$a;", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends l00.e<Data> {

    /* JADX INFO: renamed from: yw3.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b(\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b4\u00109\u001a\u0004\b&\u0010:R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0006¢\u0006\f\n\u0004\b,\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b7\u0010>\u001a\u0004\b*\u0010?R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b0\u0010@\u001a\u0004\b2\u0010AR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bD\u0010F\u001a\u0004\b.\u0010GR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bH\u0010>\u001a\u0004\bB\u0010?¨\u0006I"}, d2 = {"Lyw3/f$a;", "", "Lyw3/a;", "faceValidationVMS", "Lkotlin/Function1;", "Lfx/e;", "Loq/i0;", "onContainerChanged", "Li20/i;", "scannerData", "Ljw3/b;", "maskDefinition", "Li50/a;", "scaffoldData", "Lc30/b;", "alertData", "Lkotlin/Function0;", "onCloseClick", "Lh30/a;", "buttonData", "Lsz/d;", "connector", "", "isCameraPermissionGranted", "Le70/a;", "cameraPermissionNotGrantedData", "switchCameraButtonData", "<init>", "(Lyw3/a;Ler/l;Li20/i;Ljw3/b;Li50/a;Lc30/b;Ler/a;Lh30/a;Lsz/d;ZLe70/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lyw3/a;", "e", "()Lyw3/a;", "b", "Ler/l;", "g", "()Ler/l;", "c", "Li20/i;", "i", "()Li20/i;", "d", "Ljw3/b;", "f", "()Ljw3/b;", "Li50/a;", "h", "()Li50/a;", "Lc30/b;", "()Lc30/b;", "Ler/a;", "getOnCloseClick", "()Ler/a;", "Lh30/a;", "()Lh30/a;", "Lsz/d;", "()Lsz/d;", "j", "Z", "k", "()Z", "Le70/a;", "()Le70/a;", "l", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final a faceValidationVMS;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Rectangle, i0> onContainerChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ScannerViewData scannerData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final MaskDefinition maskDefinition;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final c30.b alertData;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData buttonData;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final sz.d connector;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isCameraPermissionGranted;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final CameraPermissionNotGrantedData cameraPermissionNotGrantedData;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData switchCameraButtonData;

        /* JADX WARN: Multi-variable type inference failed */
        public Data(a aVar, er.l<? super Rectangle, i0> lVar, ScannerViewData scannerViewData, MaskDefinition maskDefinition, BaseScaffoldData baseScaffoldData, c30.b bVar, er.a<i0> aVar2, ButtonData buttonData, sz.d dVar, boolean z15, CameraPermissionNotGrantedData cameraPermissionNotGrantedData, ButtonData buttonData2) {
            this.faceValidationVMS = aVar;
            this.onContainerChanged = lVar;
            this.scannerData = scannerViewData;
            this.maskDefinition = maskDefinition;
            this.scaffoldData = baseScaffoldData;
            this.alertData = bVar;
            this.onCloseClick = aVar2;
            this.buttonData = buttonData;
            this.connector = dVar;
            this.isCameraPermissionGranted = z15;
            this.cameraPermissionNotGrantedData = cameraPermissionNotGrantedData;
            this.switchCameraButtonData = buttonData2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c30.b getAlertData() {
            return this.alertData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ButtonData getButtonData() {
            return this.buttonData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final CameraPermissionNotGrantedData getCameraPermissionNotGrantedData() {
            return this.cameraPermissionNotGrantedData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final sz.d getConnector() {
            return this.connector;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final a getFaceValidationVMS() {
            return this.faceValidationVMS;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.faceValidationVMS, data.faceValidationVMS) && fr.t.c(this.onContainerChanged, data.onContainerChanged) && fr.t.c(this.scannerData, data.scannerData) && fr.t.c(this.maskDefinition, data.maskDefinition) && fr.t.c(this.scaffoldData, data.scaffoldData) && fr.t.c(this.alertData, data.alertData) && fr.t.c(this.onCloseClick, data.onCloseClick) && fr.t.c(this.buttonData, data.buttonData) && fr.t.c(this.connector, data.connector) && this.isCameraPermissionGranted == data.isCameraPermissionGranted && fr.t.c(this.cameraPermissionNotGrantedData, data.cameraPermissionNotGrantedData) && fr.t.c(this.switchCameraButtonData, data.switchCameraButtonData);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final MaskDefinition getMaskDefinition() {
            return this.maskDefinition;
        }

        public final er.l<Rectangle, i0> g() {
            return this.onContainerChanged;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        public int hashCode() {
            int iHashCode = ((((this.faceValidationVMS.hashCode() * 31) + this.onContainerChanged.hashCode()) * 31) + this.scannerData.hashCode()) * 31;
            MaskDefinition maskDefinition = this.maskDefinition;
            int iHashCode2 = (((((((((((((((iHashCode + (maskDefinition == null ? 0 : maskDefinition.hashCode())) * 31) + this.scaffoldData.hashCode()) * 31) + this.alertData.hashCode()) * 31) + this.onCloseClick.hashCode()) * 31) + this.buttonData.hashCode()) * 31) + this.connector.hashCode()) * 31) + Boolean.hashCode(this.isCameraPermissionGranted)) * 31) + this.cameraPermissionNotGrantedData.hashCode()) * 31;
            ButtonData buttonData = this.switchCameraButtonData;
            return iHashCode2 + (buttonData != null ? buttonData.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final ScannerViewData getScannerData() {
            return this.scannerData;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final ButtonData getSwitchCameraButtonData() {
            return this.switchCameraButtonData;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getIsCameraPermissionGranted() {
            return this.isCameraPermissionGranted;
        }

        public String toString() {
            return "Data(faceValidationVMS=" + this.faceValidationVMS + ", onContainerChanged=" + this.onContainerChanged + ", scannerData=" + this.scannerData + ", maskDefinition=" + this.maskDefinition + ", scaffoldData=" + this.scaffoldData + ", alertData=" + this.alertData + ", onCloseClick=" + this.onCloseClick + ", buttonData=" + this.buttonData + ", connector=" + this.connector + ", isCameraPermissionGranted=" + this.isCameraPermissionGranted + ", cameraPermissionNotGrantedData=" + this.cameraPermissionNotGrantedData + ", switchCameraButtonData=" + this.switchCameraButtonData + ')';
        }
    }

    oz.j a();
}
