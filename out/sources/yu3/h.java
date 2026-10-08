package yu3;

import g30.ModalBottomSheetData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n40.FilePickerData;
import p071kotlin.Metadata;
import z30.FileBottomSheetItemData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lyu3/h;", "Ll00/e;", "Lyu3/h$a;", "a", "confirmationdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lyu3/h$a;", "", "b", "a", "Lyu3/h$a$a;", "Lyu3/h$a$b;", "confirmationdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: yu3.h$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lyu3/h$a$a;", "Lyu3/h$a;", "Lhb4/c;", "vmsAdapter", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "confirmationdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c vmsAdapter;

            public Error(hb4.c cVar) {
                this.vmsAdapter = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getVmsAdapter() {
                return this.vmsAdapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.vmsAdapter, ((Error) other).vmsAdapter);
            }

            public int hashCode() {
                return this.vmsAdapter.hashCode();
            }

            public String toString() {
                return "Error(vmsAdapter=" + this.vmsAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: yu3.h$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u00105\u001a\u0004\b6\u00107R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b8\u0010:R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b3\u0010;\u001a\u0004\b,\u0010<R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b*\u0010=\u001a\u0004\b(\u0010>R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b6\u0010?\u001a\u0004\b0\u0010@R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b.\u00109\u001a\u0004\b$\u0010:¨\u0006A"}, d2 = {"Lyu3/h$a$b;", "Lyu3/h$a;", "Lcb4/i;", "dialogVmsAdapter", "Li50/a;", "scaffoldData", "Lmx/a;", "title", "description", "Ln40/c;", "pickerData", "", "scrollToPicker", "Lkotlin/Function0;", "Loq/i0;", "onScrolledToPicker", "Lg30/n;", "bottomSheetData", "", "Lz30/a;", "bottomSheetContentData", "Lh30/a;", "buttonData", "backAction", "<init>", "(Lcb4/i;Li50/a;Lmx/a;Lmx/a;Ln40/c;ZLer/a;Lg30/n;Ljava/util/List;Lh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcb4/i;", "f", "()Lcb4/i;", "b", "Li50/a;", "i", "()Li50/a;", "c", "Lmx/a;", "k", "()Lmx/a;", "d", "e", "Ln40/c;", "h", "()Ln40/c;", "Z", "j", "()Z", "g", "Ler/a;", "()Ler/a;", "Lg30/n;", "()Lg30/n;", "Ljava/util/List;", "()Ljava/util/List;", "Lh30/a;", "()Lh30/a;", "confirmationdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVmsAdapter;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final FilePickerData pickerData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean scrollToPicker;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onScrolledToPicker;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final ModalBottomSheetData bottomSheetData;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<FileBottomSheetItemData> bottomSheetContentData;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData buttonData;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> backAction;

            public Initialized(cb4.i iVar, BaseScaffoldData baseScaffoldData, Label label, Label label2, FilePickerData filePickerData, boolean z15, er.a<oq.i0> aVar, ModalBottomSheetData modalBottomSheetData, List<FileBottomSheetItemData> list, ButtonData buttonData, er.a<oq.i0> aVar2) {
                this.dialogVmsAdapter = iVar;
                this.scaffoldData = baseScaffoldData;
                this.title = label;
                this.description = label2;
                this.pickerData = filePickerData;
                this.scrollToPicker = z15;
                this.onScrolledToPicker = aVar;
                this.bottomSheetData = modalBottomSheetData;
                this.bottomSheetContentData = list;
                this.buttonData = buttonData;
                this.backAction = aVar2;
            }

            public final er.a<oq.i0> a() {
                return this.backAction;
            }

            public final List<FileBottomSheetItemData> b() {
                return this.bottomSheetContentData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ModalBottomSheetData getBottomSheetData() {
                return this.bottomSheetData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final ButtonData getButtonData() {
                return this.buttonData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Label getDescription() {
                return this.description;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.dialogVmsAdapter, initialized.dialogVmsAdapter) && fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.title, initialized.title) && fr.t.c(this.description, initialized.description) && fr.t.c(this.pickerData, initialized.pickerData) && this.scrollToPicker == initialized.scrollToPicker && fr.t.c(this.onScrolledToPicker, initialized.onScrolledToPicker) && fr.t.c(this.bottomSheetData, initialized.bottomSheetData) && fr.t.c(this.bottomSheetContentData, initialized.bottomSheetContentData) && fr.t.c(this.buttonData, initialized.buttonData) && fr.t.c(this.backAction, initialized.backAction);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final cb4.i getDialogVmsAdapter() {
                return this.dialogVmsAdapter;
            }

            public final er.a<oq.i0> g() {
                return this.onScrolledToPicker;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final FilePickerData getPickerData() {
                return this.pickerData;
            }

            public int hashCode() {
                cb4.i iVar = this.dialogVmsAdapter;
                return ((((((((((((((((((((iVar == null ? 0 : iVar.hashCode()) * 31) + this.scaffoldData.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.pickerData.hashCode()) * 31) + Boolean.hashCode(this.scrollToPicker)) * 31) + this.onScrolledToPicker.hashCode()) * 31) + this.bottomSheetData.hashCode()) * 31) + this.bottomSheetContentData.hashCode()) * 31) + this.buttonData.hashCode()) * 31) + this.backAction.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final boolean getScrollToPicker() {
                return this.scrollToPicker;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public String toString() {
                return "Initialized(dialogVmsAdapter=" + this.dialogVmsAdapter + ", scaffoldData=" + this.scaffoldData + ", title=" + this.title + ", description=" + this.description + ", pickerData=" + this.pickerData + ", scrollToPicker=" + this.scrollToPicker + ", onScrolledToPicker=" + this.onScrolledToPicker + ", bottomSheetData=" + this.bottomSheetData + ", bottomSheetContentData=" + this.bottomSheetContentData + ", buttonData=" + this.buttonData + ", backAction=" + this.backAction + ')';
            }
        }
    }
}
