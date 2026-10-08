package iz2;

import f70.QrScannerData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\n\u0006\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Liz2/b;", "", "Liz2/b$c;", "data", "<init>", "(Liz2/b$c;)V", "a", "Liz2/b$c;", "getData", "()Liz2/b$c;", "b", "c", "Liz2/b$a;", "Liz2/b$b;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f98085b = hz.b.f86845b | QrScannerData.f59729c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final StateData data;

    /* JADX INFO: renamed from: iz2.b$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Liz2/b$a;", "Liz2/b;", "Liz2/b$c;", "data", "Lhb4/c;", "errorVMS", "<init>", "(Liz2/b$c;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Liz2/b$c;", "a", "()Liz2/b$c;", "d", "Lhb4/c;", "b", "()Lhb4/c;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final StateData data;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMS;

        public Error(StateData stateData, hb4.c cVar) {
            super(stateData, null);
            this.data = stateData;
            this.errorVMS = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public StateData getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final hb4.c getErrorVMS() {
            return this.errorVMS;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return fr.t.c(this.data, error.data) && fr.t.c(this.errorVMS, error.errorVMS);
        }

        public int hashCode() {
            return (this.data.hashCode() * 31) + this.errorVMS.hashCode();
        }

        public String toString() {
            return "Error(data=" + this.data + ", errorVMS=" + this.errorVMS + ')';
        }
    }

    /* JADX INFO: renamed from: iz2.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Liz2/b$b;", "Liz2/b;", "Liz2/b$c;", "data", "<init>", "(Liz2/b$c;)V", "a", "(Liz2/b$c;)Liz2/b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Liz2/b$c;", "b", "()Liz2/b$c;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ScannerQrCode extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f98089d;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final StateData data;

        static {
            int i15 = hz.b.f86845b;
            int i16 = QrScannerData.f59729c;
            f98089d = i15 | i15 | i16 | i16;
        }

        public ScannerQrCode(StateData stateData) {
            super(stateData, null);
            this.data = stateData;
        }

        public final ScannerQrCode a(StateData data) {
            return new ScannerQrCode(data);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public StateData getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ScannerQrCode) && fr.t.c(this.data, ((ScannerQrCode) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "ScannerQrCode(data=" + this.data + ')';
        }
    }

    public /* synthetic */ b(StateData stateData, fr.k kVar) {
        this(stateData);
    }

    private b(StateData stateData) {
        this.data = stateData;
    }

    /* JADX INFO: renamed from: iz2.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ`\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b$\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b%\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b!\u0010'R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b(\u0010\u001c¨\u0006*"}, d2 = {"Liz2/b$c;", "", "", "showCodeBottomSheetDialog", "Lf70/c;", "qrScannerData", "", "enteredCode", "scannedCode", "lastScannedCode", "Lhz/b;", "codeValidationState", "isCameraPermissionGranted", "isAlertVisible", "<init>", "(ZLf70/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhz/b;ZZ)V", "a", "(ZLf70/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhz/b;ZZ)Liz2/b$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "f", "()Z", "b", "Lf70/c;", "getQrScannerData", "()Lf70/c;", "c", "Ljava/lang/String;", "d", "getScannedCode", "e", "Lhz/b;", "()Lhz/b;", "g", "h", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StateData {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f98091i = hz.b.f86845b | QrScannerData.f59729c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showCodeBottomSheetDialog;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final QrScannerData qrScannerData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String enteredCode;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String scannedCode;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String lastScannedCode;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b codeValidationState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isCameraPermissionGranted;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isAlertVisible;

        public StateData(boolean z15, QrScannerData qrScannerData, String str, String str2, String str3, hz.b bVar, boolean z16, boolean z17) {
            this.showCodeBottomSheetDialog = z15;
            this.qrScannerData = qrScannerData;
            this.enteredCode = str;
            this.scannedCode = str2;
            this.lastScannedCode = str3;
            this.codeValidationState = bVar;
            this.isCameraPermissionGranted = z16;
            this.isAlertVisible = z17;
        }

        public static /* synthetic */ StateData b(StateData stateData, boolean z15, QrScannerData qrScannerData, String str, String str2, String str3, hz.b bVar, boolean z16, boolean z17, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                z15 = stateData.showCodeBottomSheetDialog;
            }
            if ((i15 & 2) != 0) {
                qrScannerData = stateData.qrScannerData;
            }
            if ((i15 & 4) != 0) {
                str = stateData.enteredCode;
            }
            if ((i15 & 8) != 0) {
                str2 = stateData.scannedCode;
            }
            if ((i15 & 16) != 0) {
                str3 = stateData.lastScannedCode;
            }
            if ((i15 & 32) != 0) {
                bVar = stateData.codeValidationState;
            }
            if ((i15 & 64) != 0) {
                z16 = stateData.isCameraPermissionGranted;
            }
            if ((i15 & 128) != 0) {
                z17 = stateData.isAlertVisible;
            }
            boolean z18 = z16;
            boolean z19 = z17;
            String str4 = str3;
            hz.b bVar2 = bVar;
            return stateData.a(z15, qrScannerData, str, str2, str4, bVar2, z18, z19);
        }

        public final StateData a(boolean showCodeBottomSheetDialog, QrScannerData qrScannerData, String enteredCode, String scannedCode, String lastScannedCode, hz.b codeValidationState, boolean isCameraPermissionGranted, boolean isAlertVisible) {
            return new StateData(showCodeBottomSheetDialog, qrScannerData, enteredCode, scannedCode, lastScannedCode, codeValidationState, isCameraPermissionGranted, isAlertVisible);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final hz.b getCodeValidationState() {
            return this.codeValidationState;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getEnteredCode() {
            return this.enteredCode;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getLastScannedCode() {
            return this.lastScannedCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StateData)) {
                return false;
            }
            StateData stateData = (StateData) other;
            return this.showCodeBottomSheetDialog == stateData.showCodeBottomSheetDialog && fr.t.c(this.qrScannerData, stateData.qrScannerData) && fr.t.c(this.enteredCode, stateData.enteredCode) && fr.t.c(this.scannedCode, stateData.scannedCode) && fr.t.c(this.lastScannedCode, stateData.lastScannedCode) && fr.t.c(this.codeValidationState, stateData.codeValidationState) && this.isCameraPermissionGranted == stateData.isCameraPermissionGranted && this.isAlertVisible == stateData.isAlertVisible;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getShowCodeBottomSheetDialog() {
            return this.showCodeBottomSheetDialog;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getIsAlertVisible() {
            return this.isAlertVisible;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getIsCameraPermissionGranted() {
            return this.isCameraPermissionGranted;
        }

        public int hashCode() {
            return (((((((((((((Boolean.hashCode(this.showCodeBottomSheetDialog) * 31) + this.qrScannerData.hashCode()) * 31) + this.enteredCode.hashCode()) * 31) + this.scannedCode.hashCode()) * 31) + this.lastScannedCode.hashCode()) * 31) + this.codeValidationState.hashCode()) * 31) + Boolean.hashCode(this.isCameraPermissionGranted)) * 31) + Boolean.hashCode(this.isAlertVisible);
        }

        public String toString() {
            return "StateData(showCodeBottomSheetDialog=" + this.showCodeBottomSheetDialog + ", qrScannerData=" + this.qrScannerData + ", enteredCode=" + this.enteredCode + ", scannedCode=" + this.scannedCode + ", lastScannedCode=" + this.lastScannedCode + ", codeValidationState=" + this.codeValidationState + ", isCameraPermissionGranted=" + this.isCameraPermissionGranted + ", isAlertVisible=" + this.isAlertVisible + ')';
        }

        public /* synthetic */ StateData(boolean z15, QrScannerData qrScannerData, String str, String str2, String str3, hz.b bVar, boolean z16, boolean z17, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? false : z15, qrScannerData, (i15 & 4) != 0 ? "" : str, (i15 & 8) != 0 ? "" : str2, (i15 & 16) != 0 ? "" : str3, (i15 & 32) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 64) != 0 ? false : z16, (i15 & 128) != 0 ? true : z17);
        }
    }
}
