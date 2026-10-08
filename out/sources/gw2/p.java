package gw2;

import g30.ModalBottomSheetData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n40.FilePickerData;
import p071kotlin.Metadata;
import z30.FileBottomSheetItemData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lgw2/p;", "Ll00/e;", "Lgw2/p$a;", "a", "b", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface p extends l00.e<Data> {

    /* JADX INFO: renamed from: gw2.p$a, reason: from toString */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001d\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b*\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b$\u0010-R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010.\u001a\u0004\b+\u0010/¨\u00060"}, d2 = {"Lgw2/p$a;", "", "Li50/a;", "scaffoldData", "Lg30/n;", "bottomSheetData", "", "Lz30/a;", "bottomSheetContentData", "Lgw2/p$b;", "coveringFaceSection", "glassesSection", "Lh30/a;", "buttonData", "Lkotlin/Function0;", "Loq/i0;", "onBack", "<init>", "(Li50/a;Lg30/n;Ljava/util/List;Lgw2/p$b;Lgw2/p$b;Lh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "g", "()Li50/a;", "b", "Lg30/n;", "()Lg30/n;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Lgw2/p$b;", "()Lgw2/p$b;", "e", "f", "Lh30/a;", "()Lh30/a;", "Ler/a;", "()Ler/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ModalBottomSheetData bottomSheetData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<FileBottomSheetItemData> bottomSheetContentData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final FilePickerSectionData coveringFaceSection;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final FilePickerSectionData glassesSection;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData buttonData;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onBack;

        public Data(BaseScaffoldData baseScaffoldData, ModalBottomSheetData modalBottomSheetData, List<FileBottomSheetItemData> list, FilePickerSectionData filePickerSectionData, FilePickerSectionData filePickerSectionData2, ButtonData buttonData, er.a<oq.i0> aVar) {
            this.scaffoldData = baseScaffoldData;
            this.bottomSheetData = modalBottomSheetData;
            this.bottomSheetContentData = list;
            this.coveringFaceSection = filePickerSectionData;
            this.glassesSection = filePickerSectionData2;
            this.buttonData = buttonData;
            this.onBack = aVar;
        }

        public final List<FileBottomSheetItemData> a() {
            return this.bottomSheetContentData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ModalBottomSheetData getBottomSheetData() {
            return this.bottomSheetData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ButtonData getButtonData() {
            return this.buttonData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final FilePickerSectionData getCoveringFaceSection() {
            return this.coveringFaceSection;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final FilePickerSectionData getGlassesSection() {
            return this.glassesSection;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.scaffoldData, data.scaffoldData) && fr.t.c(this.bottomSheetData, data.bottomSheetData) && fr.t.c(this.bottomSheetContentData, data.bottomSheetContentData) && fr.t.c(this.coveringFaceSection, data.coveringFaceSection) && fr.t.c(this.glassesSection, data.glassesSection) && fr.t.c(this.buttonData, data.buttonData) && fr.t.c(this.onBack, data.onBack);
        }

        public final er.a<oq.i0> f() {
            return this.onBack;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        public int hashCode() {
            int iHashCode = ((((this.scaffoldData.hashCode() * 31) + this.bottomSheetData.hashCode()) * 31) + this.bottomSheetContentData.hashCode()) * 31;
            FilePickerSectionData filePickerSectionData = this.coveringFaceSection;
            int iHashCode2 = (iHashCode + (filePickerSectionData == null ? 0 : filePickerSectionData.hashCode())) * 31;
            FilePickerSectionData filePickerSectionData2 = this.glassesSection;
            return ((((iHashCode2 + (filePickerSectionData2 != null ? filePickerSectionData2.hashCode() : 0)) * 31) + this.buttonData.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", bottomSheetData=" + this.bottomSheetData + ", bottomSheetContentData=" + this.bottomSheetContentData + ", coveringFaceSection=" + this.coveringFaceSection + ", glassesSection=" + this.glassesSection + ", buttonData=" + this.buttonData + ", onBack=" + this.onBack + ')';
        }
    }

    /* JADX INFO: renamed from: gw2.p$b, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u0017\u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b\u001c\u0010#¨\u0006$"}, d2 = {"Lgw2/p$b;", "", "Lmx/a;", "title", "description", "Ln40/c;", "pickerData", "", "bringIntoViewRequest", "Lkotlin/Function0;", "Loq/i0;", "onBringIntoViewRequestHandled", "<init>", "(Lmx/a;Lmx/a;Ln40/c;ZLer/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "e", "()Lmx/a;", "b", "c", "Ln40/c;", "d", "()Ln40/c;", "Z", "()Z", "Ler/a;", "()Ler/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FilePickerSectionData {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f78151f = FilePickerData.f131319k;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final FilePickerData pickerData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean bringIntoViewRequest;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onBringIntoViewRequestHandled;

        public FilePickerSectionData(Label label, Label label2, FilePickerData filePickerData, boolean z15, er.a<oq.i0> aVar) {
            this.title = label;
            this.description = label2;
            this.pickerData = filePickerData;
            this.bringIntoViewRequest = z15;
            this.onBringIntoViewRequestHandled = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getBringIntoViewRequest() {
            return this.bringIntoViewRequest;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getDescription() {
            return this.description;
        }

        public final er.a<oq.i0> c() {
            return this.onBringIntoViewRequestHandled;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final FilePickerData getPickerData() {
            return this.pickerData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FilePickerSectionData)) {
                return false;
            }
            FilePickerSectionData filePickerSectionData = (FilePickerSectionData) other;
            return fr.t.c(this.title, filePickerSectionData.title) && fr.t.c(this.description, filePickerSectionData.description) && fr.t.c(this.pickerData, filePickerSectionData.pickerData) && this.bringIntoViewRequest == filePickerSectionData.bringIntoViewRequest && fr.t.c(this.onBringIntoViewRequestHandled, filePickerSectionData.onBringIntoViewRequestHandled);
        }

        public int hashCode() {
            return (((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.pickerData.hashCode()) * 31) + Boolean.hashCode(this.bringIntoViewRequest)) * 31) + this.onBringIntoViewRequestHandled.hashCode();
        }

        public String toString() {
            return "FilePickerSectionData(title=" + this.title + ", description=" + this.description + ", pickerData=" + this.pickerData + ", bringIntoViewRequest=" + this.bringIntoViewRequest + ", onBringIntoViewRequestHandled=" + this.onBringIntoViewRequestHandled + ')';
        }
    }
}
