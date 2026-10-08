package f83;

import e70.CameraPermissionNotGrantedData;
import f70.QrScannerData;
import g30.ModalBottomSheetData;
import h30.ButtonData;
import h83.BottomSheetContentData;
import h83.FrameData;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lf83/c;", "Ll00/e;", "Lf83/c$a;", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<Data> {

    /* JADX INFO: renamed from: f83.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00150\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b)\u00103R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b%\u00106R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b4\u00109R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b1\u0010<R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b'\u0010=\u001a\u0004\b-\u0010>R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b/\u0010?\u001a\u0004\b7\u0010@R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b+\u0010A\u001a\u0004\b:\u0010BR#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00150\u00178\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lf83/c$a;", "", "Li50/a;", "scaffoldData", "Lmx/a;", "topText", "Lf70/c;", "scannerData", "Lg30/n;", "bottomSheetData", "Lh83/a;", "bottomSheetContentData", "Lsz/d;", "connector", "Lh30/a;", "codeButtonData", "Le70/a;", "cameraPermissionNotGrantedData", "Lh83/b;", "frame", "Lkotlin/Function0;", "Loq/i0;", "onConfirmBottomDialogClick", "Lkotlin/Function1;", "", "showCodeBottomSheet", "<init>", "(Li50/a;Lmx/a;Lf70/c;Lg30/n;Lh83/a;Lsz/d;Lh30/a;Le70/a;Lh83/b;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "h", "()Li50/a;", "b", "Lmx/a;", "j", "()Lmx/a;", "c", "Lf70/c;", "i", "()Lf70/c;", "d", "Lg30/n;", "()Lg30/n;", "e", "Lh83/a;", "()Lh83/a;", "f", "Lsz/d;", "()Lsz/d;", "g", "Lh30/a;", "()Lh30/a;", "Le70/a;", "()Le70/a;", "Lh83/b;", "()Lh83/b;", "Ler/a;", "()Ler/a;", "k", "Ler/l;", "getShowCodeBottomSheet", "()Ler/l;", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label topText;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final QrScannerData scannerData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final ModalBottomSheetData bottomSheetData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final BottomSheetContentData bottomSheetContentData;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final sz.d connector;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData codeButtonData;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final CameraPermissionNotGrantedData cameraPermissionNotGrantedData;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final FrameData frame;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onConfirmBottomDialogClick;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> showCodeBottomSheet;

        /* JADX WARN: Multi-variable type inference failed */
        public Data(BaseScaffoldData baseScaffoldData, Label label, QrScannerData qrScannerData, ModalBottomSheetData modalBottomSheetData, BottomSheetContentData bottomSheetContentData, sz.d dVar, ButtonData buttonData, CameraPermissionNotGrantedData cameraPermissionNotGrantedData, FrameData frameData, er.a<i0> aVar, er.l<? super Boolean, i0> lVar) {
            this.scaffoldData = baseScaffoldData;
            this.topText = label;
            this.scannerData = qrScannerData;
            this.bottomSheetData = modalBottomSheetData;
            this.bottomSheetContentData = bottomSheetContentData;
            this.connector = dVar;
            this.codeButtonData = buttonData;
            this.cameraPermissionNotGrantedData = cameraPermissionNotGrantedData;
            this.frame = frameData;
            this.onConfirmBottomDialogClick = aVar;
            this.showCodeBottomSheet = lVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BottomSheetContentData getBottomSheetContentData() {
            return this.bottomSheetContentData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ModalBottomSheetData getBottomSheetData() {
            return this.bottomSheetData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final CameraPermissionNotGrantedData getCameraPermissionNotGrantedData() {
            return this.cameraPermissionNotGrantedData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ButtonData getCodeButtonData() {
            return this.codeButtonData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final sz.d getConnector() {
            return this.connector;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.scaffoldData, data.scaffoldData) && fr.t.c(this.topText, data.topText) && fr.t.c(this.scannerData, data.scannerData) && fr.t.c(this.bottomSheetData, data.bottomSheetData) && fr.t.c(this.bottomSheetContentData, data.bottomSheetContentData) && fr.t.c(this.connector, data.connector) && fr.t.c(this.codeButtonData, data.codeButtonData) && fr.t.c(this.cameraPermissionNotGrantedData, data.cameraPermissionNotGrantedData) && fr.t.c(this.frame, data.frame) && fr.t.c(this.onConfirmBottomDialogClick, data.onConfirmBottomDialogClick) && fr.t.c(this.showCodeBottomSheet, data.showCodeBottomSheet);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final FrameData getFrame() {
            return this.frame;
        }

        public final er.a<i0> g() {
            return this.onConfirmBottomDialogClick;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.scaffoldData.hashCode() * 31) + this.topText.hashCode()) * 31) + this.scannerData.hashCode()) * 31) + this.bottomSheetData.hashCode()) * 31) + this.bottomSheetContentData.hashCode()) * 31) + this.connector.hashCode()) * 31;
            ButtonData buttonData = this.codeButtonData;
            int iHashCode2 = (iHashCode + (buttonData == null ? 0 : buttonData.hashCode())) * 31;
            CameraPermissionNotGrantedData cameraPermissionNotGrantedData = this.cameraPermissionNotGrantedData;
            int iHashCode3 = (iHashCode2 + (cameraPermissionNotGrantedData == null ? 0 : cameraPermissionNotGrantedData.hashCode())) * 31;
            FrameData frameData = this.frame;
            return ((((iHashCode3 + (frameData != null ? frameData.hashCode() : 0)) * 31) + this.onConfirmBottomDialogClick.hashCode()) * 31) + this.showCodeBottomSheet.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final QrScannerData getScannerData() {
            return this.scannerData;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final Label getTopText() {
            return this.topText;
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", topText=" + this.topText + ", scannerData=" + this.scannerData + ", bottomSheetData=" + this.bottomSheetData + ", bottomSheetContentData=" + this.bottomSheetContentData + ", connector=" + this.connector + ", codeButtonData=" + this.codeButtonData + ", cameraPermissionNotGrantedData=" + this.cameraPermissionNotGrantedData + ", frame=" + this.frame + ", onConfirmBottomDialogClick=" + this.onConfirmBottomDialogClick + ", showCodeBottomSheet=" + this.showCodeBottomSheet + ')';
        }
    }

    oz.j a();
}
