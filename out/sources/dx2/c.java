package dx2;

import g30.ModalBottomSheetData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n40.FilePickerData;
import oq.i0;
import p071kotlin.Metadata;
import z30.FileBottomSheetItemData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ldx2/c;", "Ll00/e;", "Ldx2/c$a;", "a", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<Data> {

    /* JADX INFO: renamed from: dx2.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b!\u0010*R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b+\u0010.R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b2\u00104\u001a\u0004\b5\u00106R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b#\u00107\u001a\u0004\b0\u00108R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b5\u00109\u001a\u0004\b(\u0010:R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b-\u00107\u001a\u0004\b/\u00108¨\u0006;"}, d2 = {"Ldx2/c$a;", "", "Li50/a;", "scaffoldData", "Lg30/n;", "bottomSheetData", "", "Lz30/a;", "bottomSheetContentData", "Lmx/a;", "title", "description", "Ln40/c;", "pickerData", "", "scrollToPicker", "Lkotlin/Function0;", "Loq/i0;", "onScrolledToPicker", "Lh30/a;", "buttonData", "onBack", "<init>", "(Li50/a;Lg30/n;Ljava/util/List;Lmx/a;Lmx/a;Ln40/c;ZLer/a;Lh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "h", "()Li50/a;", "b", "Lg30/n;", "()Lg30/n;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Lmx/a;", "j", "()Lmx/a;", "e", "f", "Ln40/c;", "g", "()Ln40/c;", "Z", "i", "()Z", "Ler/a;", "()Ler/a;", "Lh30/a;", "()Lh30/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ModalBottomSheetData bottomSheetData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<FileBottomSheetItemData> bottomSheetContentData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label description;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final FilePickerData pickerData;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean scrollToPicker;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToPicker;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData buttonData;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        public Data(BaseScaffoldData baseScaffoldData, ModalBottomSheetData modalBottomSheetData, List<FileBottomSheetItemData> list, Label label, Label label2, FilePickerData filePickerData, boolean z15, er.a<i0> aVar, ButtonData buttonData, er.a<i0> aVar2) {
            this.scaffoldData = baseScaffoldData;
            this.bottomSheetData = modalBottomSheetData;
            this.bottomSheetContentData = list;
            this.title = label;
            this.description = label2;
            this.pickerData = filePickerData;
            this.scrollToPicker = z15;
            this.onScrolledToPicker = aVar;
            this.buttonData = buttonData;
            this.onBack = aVar2;
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
        public final Label getDescription() {
            return this.description;
        }

        public final er.a<i0> e() {
            return this.onBack;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.scaffoldData, data.scaffoldData) && fr.t.c(this.bottomSheetData, data.bottomSheetData) && fr.t.c(this.bottomSheetContentData, data.bottomSheetContentData) && fr.t.c(this.title, data.title) && fr.t.c(this.description, data.description) && fr.t.c(this.pickerData, data.pickerData) && this.scrollToPicker == data.scrollToPicker && fr.t.c(this.onScrolledToPicker, data.onScrolledToPicker) && fr.t.c(this.buttonData, data.buttonData) && fr.t.c(this.onBack, data.onBack);
        }

        public final er.a<i0> f() {
            return this.onScrolledToPicker;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final FilePickerData getPickerData() {
            return this.pickerData;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        public int hashCode() {
            return (((((((((((((((((this.scaffoldData.hashCode() * 31) + this.bottomSheetData.hashCode()) * 31) + this.bottomSheetContentData.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.pickerData.hashCode()) * 31) + Boolean.hashCode(this.scrollToPicker)) * 31) + this.onScrolledToPicker.hashCode()) * 31) + this.buttonData.hashCode()) * 31) + this.onBack.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getScrollToPicker() {
            return this.scrollToPicker;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", bottomSheetData=" + this.bottomSheetData + ", bottomSheetContentData=" + this.bottomSheetContentData + ", title=" + this.title + ", description=" + this.description + ", pickerData=" + this.pickerData + ", scrollToPicker=" + this.scrollToPicker + ", onScrolledToPicker=" + this.onScrolledToPicker + ", buttonData=" + this.buttonData + ", onBack=" + this.onBack + ')';
        }
    }
}
