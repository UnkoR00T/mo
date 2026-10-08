package x90;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lx90/b;", "", "b", "a", "Lx90/b$a;", "Lx90/b$b;", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: x90.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lx90/b$a;", "Lx90/b;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements b {

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

    /* JADX INFO: renamed from: x90.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJV\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b)\u0010!R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010*\u001a\u0004\b+\u0010\u0013¨\u0006,"}, d2 = {"Lx90/b$b;", "Lx90/b;", "", "showCodeBottomSheetDialog", "Liy/b0;", "code", "Lhz/b;", "codeValidationState", "isCameraPermissionGranted", "Lsz/d;", "connector", "lastScannedCode", "", "zpeUrl", "<init>", "(ZLiy/b0;Lhz/b;ZLsz/d;Liy/b0;Ljava/lang/String;)V", "a", "(ZLiy/b0;Lhz/b;ZLsz/d;Liy/b0;Ljava/lang/String;)Lx90/b$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "g", "()Z", "b", "Liy/b0;", "c", "()Liy/b0;", "Lhz/b;", "d", "()Lhz/b;", "i", "e", "Lsz/d;", "()Lsz/d;", "f", "Ljava/lang/String;", "h", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ScannerQrCode implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showCodeBottomSheetDialog;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 code;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b codeValidationState;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isCameraPermissionGranted;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final sz.d connector;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 lastScannedCode;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String zpeUrl;

        public ScannerQrCode(boolean z15, iy.b0 b0Var, hz.b bVar, boolean z16, sz.d dVar, iy.b0 b0Var2, String str) {
            this.showCodeBottomSheetDialog = z15;
            this.code = b0Var;
            this.codeValidationState = bVar;
            this.isCameraPermissionGranted = z16;
            this.connector = dVar;
            this.lastScannedCode = b0Var2;
            this.zpeUrl = str;
        }

        public static /* synthetic */ ScannerQrCode b(ScannerQrCode scannerQrCode, boolean z15, iy.b0 b0Var, hz.b bVar, boolean z16, sz.d dVar, iy.b0 b0Var2, String str, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                z15 = scannerQrCode.showCodeBottomSheetDialog;
            }
            if ((i15 & 2) != 0) {
                b0Var = scannerQrCode.code;
            }
            if ((i15 & 4) != 0) {
                bVar = scannerQrCode.codeValidationState;
            }
            if ((i15 & 8) != 0) {
                z16 = scannerQrCode.isCameraPermissionGranted;
            }
            if ((i15 & 16) != 0) {
                dVar = scannerQrCode.connector;
            }
            if ((i15 & 32) != 0) {
                b0Var2 = scannerQrCode.lastScannedCode;
            }
            if ((i15 & 64) != 0) {
                str = scannerQrCode.zpeUrl;
            }
            iy.b0 b0Var3 = b0Var2;
            String str2 = str;
            sz.d dVar2 = dVar;
            hz.b bVar2 = bVar;
            return scannerQrCode.a(z15, b0Var, bVar2, z16, dVar2, b0Var3, str2);
        }

        public final ScannerQrCode a(boolean showCodeBottomSheetDialog, iy.b0 code, hz.b codeValidationState, boolean isCameraPermissionGranted, sz.d connector, iy.b0 lastScannedCode, String zpeUrl) {
            return new ScannerQrCode(showCodeBottomSheetDialog, code, codeValidationState, isCameraPermissionGranted, connector, lastScannedCode, zpeUrl);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final iy.b0 getCode() {
            return this.code;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final hz.b getCodeValidationState() {
            return this.codeValidationState;
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
            return this.showCodeBottomSheetDialog == scannerQrCode.showCodeBottomSheetDialog && fr.t.c(this.code, scannerQrCode.code) && fr.t.c(this.codeValidationState, scannerQrCode.codeValidationState) && this.isCameraPermissionGranted == scannerQrCode.isCameraPermissionGranted && fr.t.c(this.connector, scannerQrCode.connector) && fr.t.c(this.lastScannedCode, scannerQrCode.lastScannedCode) && fr.t.c(this.zpeUrl, scannerQrCode.zpeUrl);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final iy.b0 getLastScannedCode() {
            return this.lastScannedCode;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getShowCodeBottomSheetDialog() {
            return this.showCodeBottomSheetDialog;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getZpeUrl() {
            return this.zpeUrl;
        }

        public int hashCode() {
            return (((((((((((Boolean.hashCode(this.showCodeBottomSheetDialog) * 31) + this.code.hashCode()) * 31) + this.codeValidationState.hashCode()) * 31) + Boolean.hashCode(this.isCameraPermissionGranted)) * 31) + this.connector.hashCode()) * 31) + this.lastScannedCode.hashCode()) * 31) + this.zpeUrl.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getIsCameraPermissionGranted() {
            return this.isCameraPermissionGranted;
        }

        public String toString() {
            return "ScannerQrCode(showCodeBottomSheetDialog=" + this.showCodeBottomSheetDialog + ", code=" + this.code + ", codeValidationState=" + this.codeValidationState + ", isCameraPermissionGranted=" + this.isCameraPermissionGranted + ", connector=" + this.connector + ", lastScannedCode=" + this.lastScannedCode + ", zpeUrl=" + this.zpeUrl + ')';
        }
    }
}
