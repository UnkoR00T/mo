package iz2;

import d70.QrScannerBottomSheetData;
import e70.CameraPermissionNotGrantedData;
import f70.QrScannerData;
import g30.ModalBottomSheetData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007À\u0006\u0003"}, d2 = {"Liz2/c;", "Ll00/e;", "Liz2/c$a;", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Liz2/c$a;", "", "b", "a", "Liz2/c$a$a;", "Liz2/c$a$b;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: iz2.c$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Liz2/c$a$a;", "Liz2/c$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(hb4.c cVar) {
                this.errorVMS = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getErrorVMS() {
                return this.errorVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.errorVMS, ((Error) other).errorVMS);
            }

            public int hashCode() {
                return this.errorVMS.hashCode();
            }

            public String toString() {
                return "Error(errorVMS=" + this.errorVMS + ')';
            }
        }

        /* JADX INFO: renamed from: iz2.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b,\u00102\u001a\u0004\b*\u00103R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b4\u00106R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00128\u0006¢\u0006\f\n\u0004\b=\u0010?\u001a\u0004\b;\u0010@R\u0017\u0010\u0014\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b0\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b(\u0010D\u001a\u0004\b&\u0010ER\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bB\u0010F\u001a\u0004\b.\u0010GR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00128\u0006¢\u0006\f\n\u0004\bH\u0010?\u001a\u0004\b7\u0010@¨\u0006I"}, d2 = {"Liz2/c$a$b;", "Liz2/c$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "description", "Lf70/c;", "qrScannerData", "Lh30/a;", "codeButtonData", "Lg30/n;", "modalBottomSheetData", "Lkotlin/Function1;", "", "Loq/i0;", "showCodeBottomSheet", "Ld70/e;", "qrScannerBottomSheetData", "Lkotlin/Function0;", "onConfirmCode", "isCameraPermissionGranted", "Le70/a;", "cameraPermissionNotGrantedData", "Lsz/d;", "connector", "onBackAction", "<init>", "(Li50/a;Lmx/a;Lf70/c;Lh30/a;Lg30/n;Ler/l;Ld70/e;Ler/a;ZLe70/a;Lsz/d;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "j", "()Li50/a;", "b", "Lmx/a;", "d", "()Lmx/a;", "c", "Lf70/c;", "i", "()Lf70/c;", "Lh30/a;", "()Lh30/a;", "e", "Lg30/n;", "()Lg30/n;", "f", "Ler/l;", "getShowCodeBottomSheet", "()Ler/l;", "g", "Ld70/e;", "h", "()Ld70/e;", "Ler/a;", "()Ler/a;", "Z", "k", "()Z", "Le70/a;", "()Le70/a;", "Lsz/d;", "()Lsz/d;", "l", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Scanner implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final QrScannerData qrScannerData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData codeButtonData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final ModalBottomSheetData modalBottomSheetData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.l<Boolean, oq.i0> showCodeBottomSheet;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final QrScannerBottomSheetData qrScannerBottomSheetData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onConfirmCode;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isCameraPermissionGranted;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final CameraPermissionNotGrantedData cameraPermissionNotGrantedData;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final sz.d connector;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackAction;

            /* JADX WARN: Multi-variable type inference failed */
            public Scanner(BaseScaffoldData baseScaffoldData, Label label, QrScannerData qrScannerData, ButtonData buttonData, ModalBottomSheetData modalBottomSheetData, er.l<? super Boolean, oq.i0> lVar, QrScannerBottomSheetData qrScannerBottomSheetData, er.a<oq.i0> aVar, boolean z15, CameraPermissionNotGrantedData cameraPermissionNotGrantedData, sz.d dVar, er.a<oq.i0> aVar2) {
                this.scaffoldData = baseScaffoldData;
                this.description = label;
                this.qrScannerData = qrScannerData;
                this.codeButtonData = buttonData;
                this.modalBottomSheetData = modalBottomSheetData;
                this.showCodeBottomSheet = lVar;
                this.qrScannerBottomSheetData = qrScannerBottomSheetData;
                this.onConfirmCode = aVar;
                this.isCameraPermissionGranted = z15;
                this.cameraPermissionNotGrantedData = cameraPermissionNotGrantedData;
                this.connector = dVar;
                this.onBackAction = aVar2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final CameraPermissionNotGrantedData getCameraPermissionNotGrantedData() {
                return this.cameraPermissionNotGrantedData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final ButtonData getCodeButtonData() {
                return this.codeButtonData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final sz.d getConnector() {
                return this.connector;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final ModalBottomSheetData getModalBottomSheetData() {
                return this.modalBottomSheetData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Scanner)) {
                    return false;
                }
                Scanner scanner = (Scanner) other;
                return fr.t.c(this.scaffoldData, scanner.scaffoldData) && fr.t.c(this.description, scanner.description) && fr.t.c(this.qrScannerData, scanner.qrScannerData) && fr.t.c(this.codeButtonData, scanner.codeButtonData) && fr.t.c(this.modalBottomSheetData, scanner.modalBottomSheetData) && fr.t.c(this.showCodeBottomSheet, scanner.showCodeBottomSheet) && fr.t.c(this.qrScannerBottomSheetData, scanner.qrScannerBottomSheetData) && fr.t.c(this.onConfirmCode, scanner.onConfirmCode) && this.isCameraPermissionGranted == scanner.isCameraPermissionGranted && fr.t.c(this.cameraPermissionNotGrantedData, scanner.cameraPermissionNotGrantedData) && fr.t.c(this.connector, scanner.connector) && fr.t.c(this.onBackAction, scanner.onBackAction);
            }

            public final er.a<oq.i0> f() {
                return this.onBackAction;
            }

            public final er.a<oq.i0> g() {
                return this.onConfirmCode;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final QrScannerBottomSheetData getQrScannerBottomSheetData() {
                return this.qrScannerBottomSheetData;
            }

            public int hashCode() {
                return (((((((((((((((((((((this.scaffoldData.hashCode() * 31) + this.description.hashCode()) * 31) + this.qrScannerData.hashCode()) * 31) + this.codeButtonData.hashCode()) * 31) + this.modalBottomSheetData.hashCode()) * 31) + this.showCodeBottomSheet.hashCode()) * 31) + this.qrScannerBottomSheetData.hashCode()) * 31) + this.onConfirmCode.hashCode()) * 31) + Boolean.hashCode(this.isCameraPermissionGranted)) * 31) + this.cameraPermissionNotGrantedData.hashCode()) * 31) + this.connector.hashCode()) * 31) + this.onBackAction.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final QrScannerData getQrScannerData() {
                return this.qrScannerData;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final boolean getIsCameraPermissionGranted() {
                return this.isCameraPermissionGranted;
            }

            public String toString() {
                return "Scanner(scaffoldData=" + this.scaffoldData + ", description=" + this.description + ", qrScannerData=" + this.qrScannerData + ", codeButtonData=" + this.codeButtonData + ", modalBottomSheetData=" + this.modalBottomSheetData + ", showCodeBottomSheet=" + this.showCodeBottomSheet + ", qrScannerBottomSheetData=" + this.qrScannerBottomSheetData + ", onConfirmCode=" + this.onConfirmCode + ", isCameraPermissionGranted=" + this.isCameraPermissionGranted + ", cameraPermissionNotGrantedData=" + this.cameraPermissionNotGrantedData + ", connector=" + this.connector + ", onBackAction=" + this.onBackAction + ')';
            }
        }
    }

    oz.j a();
}
