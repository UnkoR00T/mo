package zo3;

import e70.CameraPermissionNotGrantedData;
import f70.QrScannerData;
import g30.ModalBottomSheetData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lzo3/c;", "Ll00/e;", "Lzo3/c$a;", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lzo3/c$a;", "", "a", "b", "Lzo3/c$a$a;", "Lzo3/c$a$b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: zo3.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lzo3/c$a$a;", "Lzo3/c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C6379a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C6379a f235934a = new C6379a();

            private C6379a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C6379a);
            }

            public int hashCode() {
                return -273158365;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: zo3.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b2\u00101\u001a\u0004\b4\u00103R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b+\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b'\u00108\u001a\u0004\b)\u00109R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b6\u0010:\u001a\u0004\b0\u0010;R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b%\u0010>¨\u0006?"}, d2 = {"Lzo3/c$a$b;", "Lzo3/c$a;", "Li50/a;", "baseScaffoldData", "Lmx/a;", "title", "Lf70/c;", "qrScannerData", "Lh30/a;", "codeButtonData", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "hideBottomSheet", "", "isCameraPermissionGranted", "Le70/a;", "cameraPermissionNotGrantedData", "Lsz/d;", "connector", "Lzo3/c$a$b$a;", "bottomSheetData", "<init>", "(Li50/a;Lmx/a;Lf70/c;Lh30/a;Ler/a;Ler/a;ZLe70/a;Lsz/d;Lzo3/c$a$b$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lmx/a;", "h", "()Lmx/a;", "c", "Lf70/c;", "g", "()Lf70/c;", "d", "Lh30/a;", "()Lh30/a;", "e", "Ler/a;", "f", "()Ler/a;", "getHideBottomSheet", "Z", "i", "()Z", "Le70/a;", "()Le70/a;", "Lsz/d;", "()Lsz/d;", "j", "Lzo3/c$a$b$a;", "()Lzo3/c$a$b$a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final QrScannerData qrScannerData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData codeButtonData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackClick;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> hideBottomSheet;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isCameraPermissionGranted;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final CameraPermissionNotGrantedData cameraPermissionNotGrantedData;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final sz.d connector;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final BottomSheetContentData bottomSheetData;

            /* JADX INFO: renamed from: zo3.c$a$b$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"Lzo3/c$a$b$a;", "", "Lg30/n;", "modalSheetData", "Lmx/a;", "description", "Lv50/c;", "codeInputData", "Lh30/a;", "nextButtonData", "<init>", "(Lg30/n;Lmx/a;Lv50/c;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lg30/n;", "c", "()Lg30/n;", "b", "Lmx/a;", "()Lmx/a;", "Lv50/c;", "()Lv50/c;", "d", "Lh30/a;", "()Lh30/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class BottomSheetContentData {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public static final int f235945e = v50.c.f203957t | ModalBottomSheetData.f70192e;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final ModalBottomSheetData modalSheetData;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label description;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final v50.c codeInputData;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                private final ButtonData nextButtonData;

                public BottomSheetContentData(ModalBottomSheetData modalBottomSheetData, Label label, v50.c cVar, ButtonData buttonData) {
                    this.modalSheetData = modalBottomSheetData;
                    this.description = label;
                    this.codeInputData = cVar;
                    this.nextButtonData = buttonData;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final v50.c getCodeInputData() {
                    return this.codeInputData;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final Label getDescription() {
                    return this.description;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final ModalBottomSheetData getModalSheetData() {
                    return this.modalSheetData;
                }

                /* JADX INFO: renamed from: d, reason: from getter */
                public final ButtonData getNextButtonData() {
                    return this.nextButtonData;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof BottomSheetContentData)) {
                        return false;
                    }
                    BottomSheetContentData bottomSheetContentData = (BottomSheetContentData) other;
                    return fr.t.c(this.modalSheetData, bottomSheetContentData.modalSheetData) && fr.t.c(this.description, bottomSheetContentData.description) && fr.t.c(this.codeInputData, bottomSheetContentData.codeInputData) && fr.t.c(this.nextButtonData, bottomSheetContentData.nextButtonData);
                }

                public int hashCode() {
                    return (((((this.modalSheetData.hashCode() * 31) + this.description.hashCode()) * 31) + this.codeInputData.hashCode()) * 31) + this.nextButtonData.hashCode();
                }

                public String toString() {
                    return "BottomSheetContentData(modalSheetData=" + this.modalSheetData + ", description=" + this.description + ", codeInputData=" + this.codeInputData + ", nextButtonData=" + this.nextButtonData + ')';
                }
            }

            public Initialized(BaseScaffoldData baseScaffoldData, Label label, QrScannerData qrScannerData, ButtonData buttonData, er.a<i0> aVar, er.a<i0> aVar2, boolean z15, CameraPermissionNotGrantedData cameraPermissionNotGrantedData, sz.d dVar, BottomSheetContentData bottomSheetContentData) {
                this.baseScaffoldData = baseScaffoldData;
                this.title = label;
                this.qrScannerData = qrScannerData;
                this.codeButtonData = buttonData;
                this.onBackClick = aVar;
                this.hideBottomSheet = aVar2;
                this.isCameraPermissionGranted = z15;
                this.cameraPermissionNotGrantedData = cameraPermissionNotGrantedData;
                this.connector = dVar;
                this.bottomSheetData = bottomSheetContentData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BottomSheetContentData getBottomSheetData() {
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
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.title, initialized.title) && fr.t.c(this.qrScannerData, initialized.qrScannerData) && fr.t.c(this.codeButtonData, initialized.codeButtonData) && fr.t.c(this.onBackClick, initialized.onBackClick) && fr.t.c(this.hideBottomSheet, initialized.hideBottomSheet) && this.isCameraPermissionGranted == initialized.isCameraPermissionGranted && fr.t.c(this.cameraPermissionNotGrantedData, initialized.cameraPermissionNotGrantedData) && fr.t.c(this.connector, initialized.connector) && fr.t.c(this.bottomSheetData, initialized.bottomSheetData);
            }

            public final er.a<i0> f() {
                return this.onBackClick;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final QrScannerData getQrScannerData() {
                return this.qrScannerData;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public int hashCode() {
                return (((((((((((((((((this.baseScaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.qrScannerData.hashCode()) * 31) + this.codeButtonData.hashCode()) * 31) + this.onBackClick.hashCode()) * 31) + this.hideBottomSheet.hashCode()) * 31) + Boolean.hashCode(this.isCameraPermissionGranted)) * 31) + this.cameraPermissionNotGrantedData.hashCode()) * 31) + this.connector.hashCode()) * 31) + this.bottomSheetData.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final boolean getIsCameraPermissionGranted() {
                return this.isCameraPermissionGranted;
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", title=" + this.title + ", qrScannerData=" + this.qrScannerData + ", codeButtonData=" + this.codeButtonData + ", onBackClick=" + this.onBackClick + ", hideBottomSheet=" + this.hideBottomSheet + ", isCameraPermissionGranted=" + this.isCameraPermissionGranted + ", cameraPermissionNotGrantedData=" + this.cameraPermissionNotGrantedData + ", connector=" + this.connector + ", bottomSheetData=" + this.bottomSheetData + ')';
            }
        }
    }

    oz.j a();
}
