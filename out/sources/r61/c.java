package r61;

import g30.ModalBottomSheetData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n40.FilePickerData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lr61/c;", "Ll00/e;", "Lr61/c$a;", "a", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lr61/c$a;", "", "b", "c", "a", "Lr61/c$a$a;", "Lr61/c$a$b;", "Lr61/c$a$c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: r61.c$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lr61/c$a$a;", "Lr61/c$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lr61/c$a$b;", "Lr61/c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f172011a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1638238928;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: r61.c$a$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dBK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b$\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b \u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/¨\u00060"}, d2 = {"Lr61/c$a$c;", "Lr61/c$a;", "Li50/a;", "baseScaffoldData", "Lr61/c$a$c$a;", "faceCoverContent", "glassesContent", "Lg30/n;", "bottomSheetData", "Ls61/d;", "bottomSheetContentData", "Lh30/a;", "nextButton", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Li50/a;Lr61/c$a$c$a;Lr61/c$a$c$a;Lg30/n;Ls61/d;Lh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lr61/c$a$c$a;", "d", "()Lr61/c$a$c$a;", "c", "e", "Lg30/n;", "()Lg30/n;", "Ls61/d;", "()Ls61/d;", "f", "Lh30/a;", "()Lh30/a;", "g", "Ler/a;", "()Ler/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f172012h;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final ContentData faceCoverContent;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final ContentData glassesContent;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ModalBottomSheetData bottomSheetData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final s61.d bottomSheetContentData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButton;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackClick;

            /* JADX INFO: renamed from: r61.c$a$c$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lr61/c$a$c$a;", "", "Lmx/a;", "headerLabel", "messageLabel", "Ln40/c;", "filePickerData", "<init>", "(Lmx/a;Lmx/a;Ln40/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "c", "Ln40/c;", "()Ln40/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class ContentData {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public static final int f172020d = FilePickerData.f131319k;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label headerLabel;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label messageLabel;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final FilePickerData filePickerData;

                public ContentData(Label label, Label label2, FilePickerData filePickerData) {
                    this.headerLabel = label;
                    this.messageLabel = label2;
                    this.filePickerData = filePickerData;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final FilePickerData getFilePickerData() {
                    return this.filePickerData;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final Label getHeaderLabel() {
                    return this.headerLabel;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final Label getMessageLabel() {
                    return this.messageLabel;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ContentData)) {
                        return false;
                    }
                    ContentData contentData = (ContentData) other;
                    return fr.t.c(this.headerLabel, contentData.headerLabel) && fr.t.c(this.messageLabel, contentData.messageLabel) && fr.t.c(this.filePickerData, contentData.filePickerData);
                }

                public int hashCode() {
                    return (((this.headerLabel.hashCode() * 31) + this.messageLabel.hashCode()) * 31) + this.filePickerData.hashCode();
                }

                public String toString() {
                    return "ContentData(headerLabel=" + this.headerLabel + ", messageLabel=" + this.messageLabel + ", filePickerData=" + this.filePickerData + ')';
                }
            }

            static {
                int i15 = ModalBottomSheetData.f70192e;
                int i16 = FilePickerData.f131319k;
                f172012h = i15 | i16 | i16 | BaseScaffoldData.f89350g;
            }

            public Initialized(BaseScaffoldData baseScaffoldData, ContentData contentData, ContentData contentData2, ModalBottomSheetData modalBottomSheetData, s61.d dVar, ButtonData buttonData, er.a<oq.i0> aVar) {
                this.baseScaffoldData = baseScaffoldData;
                this.faceCoverContent = contentData;
                this.glassesContent = contentData2;
                this.bottomSheetData = modalBottomSheetData;
                this.bottomSheetContentData = dVar;
                this.nextButton = buttonData;
                this.onBackClick = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final s61.d getBottomSheetContentData() {
                return this.bottomSheetContentData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ModalBottomSheetData getBottomSheetData() {
                return this.bottomSheetData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final ContentData getFaceCoverContent() {
                return this.faceCoverContent;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final ContentData getGlassesContent() {
                return this.glassesContent;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.faceCoverContent, initialized.faceCoverContent) && fr.t.c(this.glassesContent, initialized.glassesContent) && fr.t.c(this.bottomSheetData, initialized.bottomSheetData) && fr.t.c(this.bottomSheetContentData, initialized.bottomSheetContentData) && fr.t.c(this.nextButton, initialized.nextButton) && fr.t.c(this.onBackClick, initialized.onBackClick);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final ButtonData getNextButton() {
                return this.nextButton;
            }

            public final er.a<oq.i0> g() {
                return this.onBackClick;
            }

            public int hashCode() {
                int iHashCode = this.baseScaffoldData.hashCode() * 31;
                ContentData contentData = this.faceCoverContent;
                int iHashCode2 = (iHashCode + (contentData == null ? 0 : contentData.hashCode())) * 31;
                ContentData contentData2 = this.glassesContent;
                int iHashCode3 = (((iHashCode2 + (contentData2 == null ? 0 : contentData2.hashCode())) * 31) + this.bottomSheetData.hashCode()) * 31;
                s61.d dVar = this.bottomSheetContentData;
                return ((((iHashCode3 + (dVar != null ? dVar.hashCode() : 0)) * 31) + this.nextButton.hashCode()) * 31) + this.onBackClick.hashCode();
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", faceCoverContent=" + this.faceCoverContent + ", glassesContent=" + this.glassesContent + ", bottomSheetData=" + this.bottomSheetData + ", bottomSheetContentData=" + this.bottomSheetContentData + ", nextButton=" + this.nextButton + ", onBackClick=" + this.onBackClick + ')';
            }
        }
    }
}
