package nc2;

import g30.ModalBottomSheetData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n40.FilePickerData;
import oq.i0;
import p071kotlin.Metadata;
import t50.TextAreaData;
import z30.FileBottomSheetItemData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lnc2/d;", "Ll00/e;", "Lnc2/d$a;", "a", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<Data> {

    /* JADX INFO: renamed from: nc2.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b'\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b1\u00100R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b6\u00108R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b%\u00109\u001a\u0004\b-\u0010:R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b#\u0010=R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b4\u0010>\u001a\u0004\b;\u0010?R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b/\u0010<\u001a\u0004\b2\u0010=¨\u0006@"}, d2 = {"Lnc2/d$a;", "", "Li50/a;", "scaffoldData", "Lg30/n;", "bottomSheetData", "", "Lz30/a;", "bottomSheetContentData", "Lmx/a;", "title", "description", "Lt50/d;", "textAreaData", "Lnc2/d$a$a;", "pickerSectionData", "Lh30/a;", "buttonData", "Lkotlin/Function0;", "Loq/i0;", "backAction", "", "scrollToField", "onScrolledToField", "<init>", "(Li50/a;Lg30/n;Ljava/util/List;Lmx/a;Lmx/a;Lt50/d;Lnc2/d$a$a;Lh30/a;Ler/a;ZLer/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "h", "()Li50/a;", "b", "Lg30/n;", "c", "()Lg30/n;", "Ljava/util/List;", "()Ljava/util/List;", "d", "Lmx/a;", "k", "()Lmx/a;", "e", "f", "Lt50/d;", "j", "()Lt50/d;", "g", "Lnc2/d$a$a;", "()Lnc2/d$a$a;", "Lh30/a;", "()Lh30/a;", "i", "Ler/a;", "()Ler/a;", "Z", "()Z", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        private final TextAreaData textAreaData;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final PickerSectionData pickerSectionData;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData buttonData;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean scrollToField;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToField;

        /* JADX INFO: renamed from: nc2.d$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lnc2/d$a$a;", "", "Lmx/a;", "title", "description", "Ln40/c;", "data", "<init>", "(Lmx/a;Lmx/a;Ln40/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "Ln40/c;", "()Ln40/c;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PickerSectionData {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f134068d = FilePickerData.f131319k;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final FilePickerData data;

            public PickerSectionData(Label label, Label label2, FilePickerData filePickerData) {
                this.title = label;
                this.description = label2;
                this.data = filePickerData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final FilePickerData getData() {
                return this.data;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PickerSectionData)) {
                    return false;
                }
                PickerSectionData pickerSectionData = (PickerSectionData) other;
                return fr.t.c(this.title, pickerSectionData.title) && fr.t.c(this.description, pickerSectionData.description) && fr.t.c(this.data, pickerSectionData.data);
            }

            public int hashCode() {
                return (((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.data.hashCode();
            }

            public String toString() {
                return "PickerSectionData(title=" + this.title + ", description=" + this.description + ", data=" + this.data + ')';
            }
        }

        public Data(BaseScaffoldData baseScaffoldData, ModalBottomSheetData modalBottomSheetData, List<FileBottomSheetItemData> list, Label label, Label label2, TextAreaData textAreaData, PickerSectionData pickerSectionData, ButtonData buttonData, er.a<i0> aVar, boolean z15, er.a<i0> aVar2) {
            this.scaffoldData = baseScaffoldData;
            this.bottomSheetData = modalBottomSheetData;
            this.bottomSheetContentData = list;
            this.title = label;
            this.description = label2;
            this.textAreaData = textAreaData;
            this.pickerSectionData = pickerSectionData;
            this.buttonData = buttonData;
            this.backAction = aVar;
            this.scrollToField = z15;
            this.onScrolledToField = aVar2;
        }

        public final er.a<i0> a() {
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
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.scaffoldData, data.scaffoldData) && fr.t.c(this.bottomSheetData, data.bottomSheetData) && fr.t.c(this.bottomSheetContentData, data.bottomSheetContentData) && fr.t.c(this.title, data.title) && fr.t.c(this.description, data.description) && fr.t.c(this.textAreaData, data.textAreaData) && fr.t.c(this.pickerSectionData, data.pickerSectionData) && fr.t.c(this.buttonData, data.buttonData) && fr.t.c(this.backAction, data.backAction) && this.scrollToField == data.scrollToField && fr.t.c(this.onScrolledToField, data.onScrolledToField);
        }

        public final er.a<i0> f() {
            return this.onScrolledToField;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final PickerSectionData getPickerSectionData() {
            return this.pickerSectionData;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        public int hashCode() {
            return (((((((((((((((((((this.scaffoldData.hashCode() * 31) + this.bottomSheetData.hashCode()) * 31) + this.bottomSheetContentData.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.textAreaData.hashCode()) * 31) + this.pickerSectionData.hashCode()) * 31) + this.buttonData.hashCode()) * 31) + this.backAction.hashCode()) * 31) + Boolean.hashCode(this.scrollToField)) * 31) + this.onScrolledToField.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getScrollToField() {
            return this.scrollToField;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final TextAreaData getTextAreaData() {
            return this.textAreaData;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", bottomSheetData=" + this.bottomSheetData + ", bottomSheetContentData=" + this.bottomSheetContentData + ", title=" + this.title + ", description=" + this.description + ", textAreaData=" + this.textAreaData + ", pickerSectionData=" + this.pickerSectionData + ", buttonData=" + this.buttonData + ", backAction=" + this.backAction + ", scrollToField=" + this.scrollToField + ", onScrolledToField=" + this.onScrolledToField + ')';
        }
    }
}
