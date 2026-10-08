package z23;

import a50.RadioButtonData;
import g30.ModalBottomSheetData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n40.FilePickerData;
import p071kotlin.Metadata;
import t50.TextAreaData;
import z30.FileBottomSheetItemData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lz23/e;", "Ll00/e;", "Lz23/e$a;", "a", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lz23/e$a;", "", "b", "c", "a", "Lz23/e$a$a;", "Lz23/e$a$b;", "Lz23/e$a$c;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: z23.e$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b+\u00105R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b=\u00107\u001a\u0004\b>\u00109R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b?\u00107\u001a\u0004\b?\u00109R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b>\u0010@\u001a\u0004\b=\u0010AR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b8\u0010B\u001a\u0004\b3\u0010CR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b/\u0010FR\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bG\u00107\u001a\u0004\bD\u00109R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\b6\u0010JR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b;\u0010K\u001a\u0004\bG\u0010LR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bH\u0010O¨\u0006P"}, d2 = {"Lz23/e$a$a;", "Lz23/e$a;", "Lcb4/i;", "dialogVMSAdapter", "Ld60/j;", "Lz23/c;", "scrollInstance", "Li50/a;", "baseScaffoldData", "Lmx/a;", "headerDate", "La50/a;", "radioButtonDate", "filePickerTitle", "filePickerSubtitle", "Ln40/c;", "filePickerData", "Lg30/n;", "bottomSheetData", "", "Lz30/a;", "bottomSheetContentData", "headerTextArea", "Lt50/d;", "description", "Lh30/a;", "nextButtonData", "Lkotlin/Function0;", "Loq/i0;", "onBack", "<init>", "(Lcb4/i;Ld60/j;Li50/a;Lmx/a;La50/a;Lmx/a;Lmx/a;Ln40/c;Lg30/n;Ljava/util/List;Lmx/a;Lt50/d;Lh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcb4/i;", "e", "()Lcb4/i;", "b", "Ld60/j;", "getScrollInstance", "()Ld60/j;", "c", "Li50/a;", "()Li50/a;", "d", "Lmx/a;", "i", "()Lmx/a;", "La50/a;", "m", "()La50/a;", "f", "h", "g", "Ln40/c;", "()Ln40/c;", "Lg30/n;", "()Lg30/n;", "j", "Ljava/util/List;", "()Ljava/util/List;", "k", "l", "Lt50/d;", "()Lt50/d;", "Lh30/a;", "()Lh30/a;", "n", "Ler/a;", "()Ler/a;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Displayed implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMSAdapter;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final d60.j<c> scrollInstance;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label headerDate;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final RadioButtonData radioButtonDate;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label filePickerTitle;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label filePickerSubtitle;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final FilePickerData filePickerData;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final ModalBottomSheetData bottomSheetData;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<FileBottomSheetItemData> bottomSheetContentData;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label headerTextArea;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final TextAreaData description;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButtonData;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBack;

            public Displayed(cb4.i iVar, d60.j<c> jVar, BaseScaffoldData baseScaffoldData, Label label, RadioButtonData radioButtonData, Label label2, Label label3, FilePickerData filePickerData, ModalBottomSheetData modalBottomSheetData, List<FileBottomSheetItemData> list, Label label4, TextAreaData textAreaData, ButtonData buttonData, er.a<oq.i0> aVar) {
                this.dialogVMSAdapter = iVar;
                this.scrollInstance = jVar;
                this.baseScaffoldData = baseScaffoldData;
                this.headerDate = label;
                this.radioButtonDate = radioButtonData;
                this.filePickerTitle = label2;
                this.filePickerSubtitle = label3;
                this.filePickerData = filePickerData;
                this.bottomSheetData = modalBottomSheetData;
                this.bottomSheetContentData = list;
                this.headerTextArea = label4;
                this.description = textAreaData;
                this.nextButtonData = buttonData;
                this.onBack = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            public final List<FileBottomSheetItemData> b() {
                return this.bottomSheetContentData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ModalBottomSheetData getBottomSheetData() {
                return this.bottomSheetData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final TextAreaData getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final cb4.i getDialogVMSAdapter() {
                return this.dialogVMSAdapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Displayed)) {
                    return false;
                }
                Displayed displayed = (Displayed) other;
                return fr.t.c(this.dialogVMSAdapter, displayed.dialogVMSAdapter) && fr.t.c(this.scrollInstance, displayed.scrollInstance) && fr.t.c(this.baseScaffoldData, displayed.baseScaffoldData) && fr.t.c(this.headerDate, displayed.headerDate) && fr.t.c(this.radioButtonDate, displayed.radioButtonDate) && fr.t.c(this.filePickerTitle, displayed.filePickerTitle) && fr.t.c(this.filePickerSubtitle, displayed.filePickerSubtitle) && fr.t.c(this.filePickerData, displayed.filePickerData) && fr.t.c(this.bottomSheetData, displayed.bottomSheetData) && fr.t.c(this.bottomSheetContentData, displayed.bottomSheetContentData) && fr.t.c(this.headerTextArea, displayed.headerTextArea) && fr.t.c(this.description, displayed.description) && fr.t.c(this.nextButtonData, displayed.nextButtonData) && fr.t.c(this.onBack, displayed.onBack);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final FilePickerData getFilePickerData() {
                return this.filePickerData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final Label getFilePickerSubtitle() {
                return this.filePickerSubtitle;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final Label getFilePickerTitle() {
                return this.filePickerTitle;
            }

            public int hashCode() {
                cb4.i iVar = this.dialogVMSAdapter;
                int iHashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
                d60.j<c> jVar = this.scrollInstance;
                return ((((((((((((((((((((((((iHashCode + (jVar != null ? jVar.hashCode() : 0)) * 31) + this.baseScaffoldData.hashCode()) * 31) + this.headerDate.hashCode()) * 31) + this.radioButtonDate.hashCode()) * 31) + this.filePickerTitle.hashCode()) * 31) + this.filePickerSubtitle.hashCode()) * 31) + this.filePickerData.hashCode()) * 31) + this.bottomSheetData.hashCode()) * 31) + this.bottomSheetContentData.hashCode()) * 31) + this.headerTextArea.hashCode()) * 31) + this.description.hashCode()) * 31) + this.nextButtonData.hashCode()) * 31) + this.onBack.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final Label getHeaderDate() {
                return this.headerDate;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final Label getHeaderTextArea() {
                return this.headerTextArea;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final ButtonData getNextButtonData() {
                return this.nextButtonData;
            }

            public final er.a<oq.i0> l() {
                return this.onBack;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public final RadioButtonData getRadioButtonDate() {
                return this.radioButtonDate;
            }

            public String toString() {
                return "Displayed(dialogVMSAdapter=" + this.dialogVMSAdapter + ", scrollInstance=" + this.scrollInstance + ", baseScaffoldData=" + this.baseScaffoldData + ", headerDate=" + this.headerDate + ", radioButtonDate=" + this.radioButtonDate + ", filePickerTitle=" + this.filePickerTitle + ", filePickerSubtitle=" + this.filePickerSubtitle + ", filePickerData=" + this.filePickerData + ", bottomSheetData=" + this.bottomSheetData + ", bottomSheetContentData=" + this.bottomSheetContentData + ", headerTextArea=" + this.headerTextArea + ", description=" + this.description + ", nextButtonData=" + this.nextButtonData + ", onBack=" + this.onBack + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lz23/e$a$b;", "Lz23/e$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f232666a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -601690144;
            }

            public String toString() {
                return "Empty";
            }
        }

        /* JADX INFO: renamed from: z23.e$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lz23/e$a$c;", "Lz23/e$a;", "Lhb4/c;", "errorVMSAdapter", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMSAdapter;

            public Error(hb4.c cVar) {
                this.errorVMSAdapter = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getErrorVMSAdapter() {
                return this.errorVMSAdapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.errorVMSAdapter, ((Error) other).errorVMSAdapter);
            }

            public int hashCode() {
                return this.errorVMSAdapter.hashCode();
            }

            public String toString() {
                return "Error(errorVMSAdapter=" + this.errorVMSAdapter + ')';
            }
        }
    }
}
