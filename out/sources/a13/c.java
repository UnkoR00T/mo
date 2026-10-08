package a13;

import fr.t;
import h30.ButtonData;
import i20.ScannerViewData;
import i30.ButtonIconData;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"La13/c;", "Ll00/e;", "La13/c$a;", "a", "safebus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<Data> {

    /* JADX INFO: renamed from: a13.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b\u001f\u0010\"R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b(\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b#\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b%\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b'\u00100¨\u00061"}, d2 = {"La13/c$a;", "", "Li50/a;", "baseScaffoldData", "Lmx/a;", "message", "Li20/i;", "scannerViewData", "bottomMessage", "scannedResult", "Lh30/a;", "button", "Li30/a;", "mainButtonData", "Lsz/d;", "cameraPreviewViewConnector", "<init>", "(Li50/a;Lmx/a;Li20/i;Lmx/a;Lmx/a;Lh30/a;Li30/a;Lsz/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lmx/a;", "e", "()Lmx/a;", "c", "Li20/i;", "g", "()Li20/i;", "d", "f", "Lh30/a;", "()Lh30/a;", "Li30/a;", "getMainButtonData", "()Li30/a;", "h", "Lsz/d;", "()Lsz/d;", "safebus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label message;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ScannerViewData scannerViewData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label bottomMessage;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label scannedResult;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData button;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonIconData mainButtonData;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final sz.d cameraPreviewViewConnector;

        public Data(BaseScaffoldData baseScaffoldData, Label label, ScannerViewData scannerViewData, Label label2, Label label3, ButtonData buttonData, ButtonIconData buttonIconData, sz.d dVar) {
            this.baseScaffoldData = baseScaffoldData;
            this.message = label;
            this.scannerViewData = scannerViewData;
            this.bottomMessage = label2;
            this.scannedResult = label3;
            this.button = buttonData;
            this.mainButtonData = buttonIconData;
            this.cameraPreviewViewConnector = dVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getBottomMessage() {
            return this.bottomMessage;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ButtonData getButton() {
            return this.button;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final sz.d getCameraPreviewViewConnector() {
            return this.cameraPreviewViewConnector;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Label getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.baseScaffoldData, data.baseScaffoldData) && t.c(this.message, data.message) && t.c(this.scannerViewData, data.scannerViewData) && t.c(this.bottomMessage, data.bottomMessage) && t.c(this.scannedResult, data.scannedResult) && t.c(this.button, data.button) && t.c(this.mainButtonData, data.mainButtonData) && t.c(this.cameraPreviewViewConnector, data.cameraPreviewViewConnector);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Label getScannedResult() {
            return this.scannedResult;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final ScannerViewData getScannerViewData() {
            return this.scannerViewData;
        }

        public int hashCode() {
            return (((((((((((((this.baseScaffoldData.hashCode() * 31) + this.message.hashCode()) * 31) + this.scannerViewData.hashCode()) * 31) + this.bottomMessage.hashCode()) * 31) + this.scannedResult.hashCode()) * 31) + this.button.hashCode()) * 31) + this.mainButtonData.hashCode()) * 31) + this.cameraPreviewViewConnector.hashCode();
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", message=" + this.message + ", scannerViewData=" + this.scannerViewData + ", bottomMessage=" + this.bottomMessage + ", scannedResult=" + this.scannedResult + ", button=" + this.button + ", mainButtonData=" + this.mainButtonData + ", cameraPreviewViewConnector=" + this.cameraPreviewViewConnector + ')';
        }

        public /* synthetic */ Data(BaseScaffoldData baseScaffoldData, Label label, ScannerViewData scannerViewData, Label label2, Label label3, ButtonData buttonData, ButtonIconData buttonIconData, sz.d dVar, int i15, fr.k kVar) {
            this(baseScaffoldData, label, (i15 & 4) != 0 ? new ScannerViewData(ScannerViewData.b.FIT_CENTER, ScannerViewData.a.RECT) : scannerViewData, label2, label3, buttonData, buttonIconData, dVar);
        }
    }
}
