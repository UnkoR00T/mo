package fh2;

import d70.QrScannerBottomSheetData;
import e70.CameraPermissionNotGrantedData;
import f70.QrScannerData;
import g30.ModalBottomSheetData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lfh2/e;", "Ll00/e;", "Lfh2/e$a;", "a", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lfh2/e$a;", "", "c", "a", "b", "Lfh2/e$a$b;", "Lfh2/e$a$c;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: fh2.e$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013¨\u0006\u0015"}, d2 = {"Lfh2/e$a$a;", "", "", "show", "showKeyBoard", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getShow", "()Z", "b", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class BottomSheetDialog {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean show;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean showKeyBoard;

            public BottomSheetDialog(boolean z15, boolean z16) {
                this.show = z15;
                this.showKeyBoard = z16;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getShowKeyBoard() {
                return this.showKeyBoard;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BottomSheetDialog)) {
                    return false;
                }
                BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) other;
                return this.show == bottomSheetDialog.show && this.showKeyBoard == bottomSheetDialog.showKeyBoard;
            }

            public int hashCode() {
                return (Boolean.hashCode(this.show) * 31) + Boolean.hashCode(this.showKeyBoard);
            }

            public String toString() {
                return "BottomSheetDialog(show=" + this.show + ", showKeyBoard=" + this.showKeyBoard + ')';
            }
        }

        /* JADX INFO: renamed from: fh2.e$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lfh2/e$a$b;", "Lfh2/e$a;", "Lhb4/c;", "adapter", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c adapter;

            public Error(hb4.c cVar) {
                this.adapter = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getAdapter() {
                return this.adapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.adapter, ((Error) other).adapter);
            }

            public int hashCode() {
                return this.adapter.hashCode();
            }

            public String toString() {
                return "Error(adapter=" + this.adapter + ')';
            }
        }

        /* JADX INFO: renamed from: fh2.e$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b*\u00107R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b,\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b;\u0010AR#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b=\u00108\u001a\u0004\b?\u0010:R\u0017\u0010\u0016\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b0\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bC\u0010E\u001a\u0004\b.\u0010FR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b5\u0010I¨\u0006J"}, d2 = {"Lfh2/e$a$c;", "Lfh2/e$a;", "Li50/a;", "baseScaffoldData", "Lmx/a;", "description", "Lf70/c;", "qrScannerData", "Lh30/a;", "codeButtonData", "Lfh2/e$a$a;", "bottomSheetDialog", "Lkotlin/Function1;", "", "Loq/i0;", "showCodeBottomSheet", "Ld70/e;", "qrScannerBottomSheetData", "Lg30/n;", "modalBottomSheetData", "Ld60/c;", "onConfirmCode", "isCameraPermissionGranted", "Le70/a;", "cameraPermissionNotGrantedData", "Lsz/d;", "connector", "<init>", "(Li50/a;Lmx/a;Lf70/c;Lh30/a;Lfh2/e$a$a;Ler/l;Ld70/e;Lg30/n;Ler/l;ZLe70/a;Lsz/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lmx/a;", "f", "()Lmx/a;", "c", "Lf70/c;", "j", "()Lf70/c;", "d", "Lh30/a;", "()Lh30/a;", "e", "Lfh2/e$a$a;", "()Lfh2/e$a$a;", "Ler/l;", "getShowCodeBottomSheet", "()Ler/l;", "g", "Ld70/e;", "i", "()Ld70/e;", "h", "Lg30/n;", "()Lg30/n;", "Z", "k", "()Z", "Le70/a;", "()Le70/a;", "l", "Lsz/d;", "()Lsz/d;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ScannerQrCode implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final QrScannerData qrScannerData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData codeButtonData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final BottomSheetDialog bottomSheetDialog;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.l<Boolean, oq.i0> showCodeBottomSheet;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final QrScannerBottomSheetData qrScannerBottomSheetData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final ModalBottomSheetData modalBottomSheetData;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.l<d60.c, oq.i0> onConfirmCode;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isCameraPermissionGranted;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final CameraPermissionNotGrantedData cameraPermissionNotGrantedData;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final sz.d connector;

            /* JADX WARN: Multi-variable type inference failed */
            public ScannerQrCode(BaseScaffoldData baseScaffoldData, Label label, QrScannerData qrScannerData, ButtonData buttonData, BottomSheetDialog bottomSheetDialog, er.l<? super Boolean, oq.i0> lVar, QrScannerBottomSheetData qrScannerBottomSheetData, ModalBottomSheetData modalBottomSheetData, er.l<? super d60.c, oq.i0> lVar2, boolean z15, CameraPermissionNotGrantedData cameraPermissionNotGrantedData, sz.d dVar) {
                this.baseScaffoldData = baseScaffoldData;
                this.description = label;
                this.qrScannerData = qrScannerData;
                this.codeButtonData = buttonData;
                this.bottomSheetDialog = bottomSheetDialog;
                this.showCodeBottomSheet = lVar;
                this.qrScannerBottomSheetData = qrScannerBottomSheetData;
                this.modalBottomSheetData = modalBottomSheetData;
                this.onConfirmCode = lVar2;
                this.isCameraPermissionGranted = z15;
                this.cameraPermissionNotGrantedData = cameraPermissionNotGrantedData;
                this.connector = dVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BottomSheetDialog getBottomSheetDialog() {
                return this.bottomSheetDialog;
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
                if (!(other instanceof ScannerQrCode)) {
                    return false;
                }
                ScannerQrCode scannerQrCode = (ScannerQrCode) other;
                return fr.t.c(this.baseScaffoldData, scannerQrCode.baseScaffoldData) && fr.t.c(this.description, scannerQrCode.description) && fr.t.c(this.qrScannerData, scannerQrCode.qrScannerData) && fr.t.c(this.codeButtonData, scannerQrCode.codeButtonData) && fr.t.c(this.bottomSheetDialog, scannerQrCode.bottomSheetDialog) && fr.t.c(this.showCodeBottomSheet, scannerQrCode.showCodeBottomSheet) && fr.t.c(this.qrScannerBottomSheetData, scannerQrCode.qrScannerBottomSheetData) && fr.t.c(this.modalBottomSheetData, scannerQrCode.modalBottomSheetData) && fr.t.c(this.onConfirmCode, scannerQrCode.onConfirmCode) && this.isCameraPermissionGranted == scannerQrCode.isCameraPermissionGranted && fr.t.c(this.cameraPermissionNotGrantedData, scannerQrCode.cameraPermissionNotGrantedData) && fr.t.c(this.connector, scannerQrCode.connector);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Label getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final ModalBottomSheetData getModalBottomSheetData() {
                return this.modalBottomSheetData;
            }

            public final er.l<d60.c, oq.i0> h() {
                return this.onConfirmCode;
            }

            public int hashCode() {
                return (((((((((((((((((((((this.baseScaffoldData.hashCode() * 31) + this.description.hashCode()) * 31) + this.qrScannerData.hashCode()) * 31) + this.codeButtonData.hashCode()) * 31) + this.bottomSheetDialog.hashCode()) * 31) + this.showCodeBottomSheet.hashCode()) * 31) + this.qrScannerBottomSheetData.hashCode()) * 31) + this.modalBottomSheetData.hashCode()) * 31) + this.onConfirmCode.hashCode()) * 31) + Boolean.hashCode(this.isCameraPermissionGranted)) * 31) + this.cameraPermissionNotGrantedData.hashCode()) * 31) + this.connector.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final QrScannerBottomSheetData getQrScannerBottomSheetData() {
                return this.qrScannerBottomSheetData;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final QrScannerData getQrScannerData() {
                return this.qrScannerData;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final boolean getIsCameraPermissionGranted() {
                return this.isCameraPermissionGranted;
            }

            public String toString() {
                return "ScannerQrCode(baseScaffoldData=" + this.baseScaffoldData + ", description=" + this.description + ", qrScannerData=" + this.qrScannerData + ", codeButtonData=" + this.codeButtonData + ", bottomSheetDialog=" + this.bottomSheetDialog + ", showCodeBottomSheet=" + this.showCodeBottomSheet + ", qrScannerBottomSheetData=" + this.qrScannerBottomSheetData + ", modalBottomSheetData=" + this.modalBottomSheetData + ", onConfirmCode=" + this.onConfirmCode + ", isCameraPermissionGranted=" + this.isCameraPermissionGranted + ", cameraPermissionNotGrantedData=" + this.cameraPermissionNotGrantedData + ", connector=" + this.connector + ')';
            }
        }
    }
}
