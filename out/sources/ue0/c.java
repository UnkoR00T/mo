package ue0;

import d70.QrScannerBottomSheetData;
import e70.CameraPermissionNotGrantedData;
import f70.QrScannerData;
import g30.ModalBottomSheetData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lue0/c;", "Ll00/e;", "Lue0/c$a;", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lue0/c$a;", "", "b", "a", "Lue0/c$a$a;", "Lue0/c$a$b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: ue0.c$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lue0/c$a$a;", "Lue0/c$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        /* JADX INFO: renamed from: ue0.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b1\u00106\u001a\u0004\b+\u00107R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b4\u0010@\u001a\u0004\b<\u0010AR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138\u0006¢\u0006\f\n\u0004\b)\u0010B\u001a\u0004\b8\u0010CR\u0017\u0010\u0015\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bD\u00109\u001a\u0004\bD\u0010;R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b'\u0010GR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\b/\u0010JR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138\u0006¢\u0006\f\n\u0004\bK\u0010B\u001a\u0004\bL\u0010C¨\u0006M"}, d2 = {"Lue0/c$a$b;", "Lue0/c$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "description", "Lg30/n;", "modalBottomSheetData", "Lf70/c;", "qrScannerData", "Lh30/a;", "codeButtonData", "", "showCodeBottomSheetDialog", "Lkotlin/Function1;", "Loq/i0;", "showCodeBottomSheet", "Ld70/e;", "qrScannerBottomSheetData", "Lkotlin/Function0;", "onConfirmCode", "isCameraPermissionGranted", "Le70/a;", "cameraPermissionNotGrantedData", "Lsz/d;", "connector", "onClose", "<init>", "(Li50/a;Lmx/a;Lg30/n;Lf70/c;Lh30/a;ZLer/l;Ld70/e;Ler/a;ZLe70/a;Lsz/d;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "i", "()Li50/a;", "b", "Lmx/a;", "d", "()Lmx/a;", "c", "Lg30/n;", "e", "()Lg30/n;", "Lf70/c;", "h", "()Lf70/c;", "Lh30/a;", "()Lh30/a;", "f", "Z", "getShowCodeBottomSheetDialog", "()Z", "g", "Ler/l;", "getShowCodeBottomSheet", "()Ler/l;", "Ld70/e;", "()Ld70/e;", "Ler/a;", "()Ler/a;", "j", "k", "Le70/a;", "()Le70/a;", "l", "Lsz/d;", "()Lsz/d;", "m", "getOnClose", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Scanner implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final ModalBottomSheetData modalBottomSheetData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final QrScannerData qrScannerData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData codeButtonData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean showCodeBottomSheetDialog;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.l<Boolean, oq.i0> showCodeBottomSheet;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final QrScannerBottomSheetData qrScannerBottomSheetData;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onConfirmCode;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isCameraPermissionGranted;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final CameraPermissionNotGrantedData cameraPermissionNotGrantedData;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final sz.d connector;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onClose;

            /* JADX WARN: Multi-variable type inference failed */
            public Scanner(BaseScaffoldData baseScaffoldData, Label label, ModalBottomSheetData modalBottomSheetData, QrScannerData qrScannerData, ButtonData buttonData, boolean z15, er.l<? super Boolean, oq.i0> lVar, QrScannerBottomSheetData qrScannerBottomSheetData, er.a<oq.i0> aVar, boolean z16, CameraPermissionNotGrantedData cameraPermissionNotGrantedData, sz.d dVar, er.a<oq.i0> aVar2) {
                this.scaffoldData = baseScaffoldData;
                this.description = label;
                this.modalBottomSheetData = modalBottomSheetData;
                this.qrScannerData = qrScannerData;
                this.codeButtonData = buttonData;
                this.showCodeBottomSheetDialog = z15;
                this.showCodeBottomSheet = lVar;
                this.qrScannerBottomSheetData = qrScannerBottomSheetData;
                this.onConfirmCode = aVar;
                this.isCameraPermissionGranted = z16;
                this.cameraPermissionNotGrantedData = cameraPermissionNotGrantedData;
                this.connector = dVar;
                this.onClose = aVar2;
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
                return fr.t.c(this.scaffoldData, scanner.scaffoldData) && fr.t.c(this.description, scanner.description) && fr.t.c(this.modalBottomSheetData, scanner.modalBottomSheetData) && fr.t.c(this.qrScannerData, scanner.qrScannerData) && fr.t.c(this.codeButtonData, scanner.codeButtonData) && this.showCodeBottomSheetDialog == scanner.showCodeBottomSheetDialog && fr.t.c(this.showCodeBottomSheet, scanner.showCodeBottomSheet) && fr.t.c(this.qrScannerBottomSheetData, scanner.qrScannerBottomSheetData) && fr.t.c(this.onConfirmCode, scanner.onConfirmCode) && this.isCameraPermissionGranted == scanner.isCameraPermissionGranted && fr.t.c(this.cameraPermissionNotGrantedData, scanner.cameraPermissionNotGrantedData) && fr.t.c(this.connector, scanner.connector) && fr.t.c(this.onClose, scanner.onClose);
            }

            public final er.a<oq.i0> f() {
                return this.onConfirmCode;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final QrScannerBottomSheetData getQrScannerBottomSheetData() {
                return this.qrScannerBottomSheetData;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final QrScannerData getQrScannerData() {
                return this.qrScannerData;
            }

            public int hashCode() {
                return (((((((((((((((((((((((this.scaffoldData.hashCode() * 31) + this.description.hashCode()) * 31) + this.modalBottomSheetData.hashCode()) * 31) + this.qrScannerData.hashCode()) * 31) + this.codeButtonData.hashCode()) * 31) + Boolean.hashCode(this.showCodeBottomSheetDialog)) * 31) + this.showCodeBottomSheet.hashCode()) * 31) + this.qrScannerBottomSheetData.hashCode()) * 31) + this.onConfirmCode.hashCode()) * 31) + Boolean.hashCode(this.isCameraPermissionGranted)) * 31) + this.cameraPermissionNotGrantedData.hashCode()) * 31) + this.connector.hashCode()) * 31) + this.onClose.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final boolean getIsCameraPermissionGranted() {
                return this.isCameraPermissionGranted;
            }

            public String toString() {
                return "Scanner(scaffoldData=" + this.scaffoldData + ", description=" + this.description + ", modalBottomSheetData=" + this.modalBottomSheetData + ", qrScannerData=" + this.qrScannerData + ", codeButtonData=" + this.codeButtonData + ", showCodeBottomSheetDialog=" + this.showCodeBottomSheetDialog + ", showCodeBottomSheet=" + this.showCodeBottomSheet + ", qrScannerBottomSheetData=" + this.qrScannerBottomSheetData + ", onConfirmCode=" + this.onConfirmCode + ", isCameraPermissionGranted=" + this.isCameraPermissionGranted + ", cameraPermissionNotGrantedData=" + this.cameraPermissionNotGrantedData + ", connector=" + this.connector + ", onClose=" + this.onClose + ')';
            }
        }
    }

    oz.j a();
}
