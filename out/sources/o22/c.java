package o22;

import d12.NewMessageFieldData;
import g30.ModalBottomSheetData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n40.FilePickerData;
import p071kotlin.Metadata;
import z30.FileBottomSheetItemData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lo22/c;", "Ll00/e;", "Lo22/c$a;", "a", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<Data> {

    /* JADX INFO: renamed from: o22.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b&\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b(\u00100R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u00101\u001a\u0004\b2\u00103R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00068\u0006¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b5\u0010.R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b$\u00103R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b6\u00108R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b2\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b:\u0010<\u001a\u0004\b4\u0010=R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b>\u0010/\u001a\u0004\b>\u00100¨\u0006?"}, d2 = {"Lo22/c$a;", "", "Li50/a;", "baseScaffoldData", "Lg30/n;", "bottomSheetData", "", "Lz30/a;", "bottomSheetContentData", "Lkotlin/Function0;", "Loq/i0;", "backAction", "Lmx/a;", "formSectionHeaderLabel", "Ld12/b;", "fields", "attachmentsSectionHeaderLabel", "Ln40/c;", "filePickerData", "Lh30/a;", "nextButton", "Ld12/a;", "fieldTypeToScroll", "onScrollToField", "<init>", "(Li50/a;Lg30/n;Ljava/util/List;Ler/a;Lmx/a;Ljava/util/List;Lmx/a;Ln40/c;Lh30/a;Ld12/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "c", "()Li50/a;", "b", "Lg30/n;", "e", "()Lg30/n;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Ler/a;", "()Ler/a;", "Lmx/a;", "i", "()Lmx/a;", "f", "g", "h", "Ln40/c;", "()Ln40/c;", "Lh30/a;", "j", "()Lh30/a;", "Ld12/a;", "()Ld12/a;", "k", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ModalBottomSheetData bottomSheetData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<FileBottomSheetItemData> bottomSheetContentData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> backAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label formSectionHeaderLabel;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<NewMessageFieldData> fields;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label attachmentsSectionHeaderLabel;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final FilePickerData filePickerData;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData nextButton;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final d12.a fieldTypeToScroll;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onScrollToField;

        public Data(BaseScaffoldData baseScaffoldData, ModalBottomSheetData modalBottomSheetData, List<FileBottomSheetItemData> list, er.a<oq.i0> aVar, Label label, List<NewMessageFieldData> list2, Label label2, FilePickerData filePickerData, ButtonData buttonData, d12.a aVar2, er.a<oq.i0> aVar3) {
            this.baseScaffoldData = baseScaffoldData;
            this.bottomSheetData = modalBottomSheetData;
            this.bottomSheetContentData = list;
            this.backAction = aVar;
            this.formSectionHeaderLabel = label;
            this.fields = list2;
            this.attachmentsSectionHeaderLabel = label2;
            this.filePickerData = filePickerData;
            this.nextButton = buttonData;
            this.fieldTypeToScroll = aVar2;
            this.onScrollToField = aVar3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getAttachmentsSectionHeaderLabel() {
            return this.attachmentsSectionHeaderLabel;
        }

        public final er.a<oq.i0> b() {
            return this.backAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        public final List<FileBottomSheetItemData> d() {
            return this.bottomSheetContentData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ModalBottomSheetData getBottomSheetData() {
            return this.bottomSheetData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.bottomSheetData, data.bottomSheetData) && fr.t.c(this.bottomSheetContentData, data.bottomSheetContentData) && fr.t.c(this.backAction, data.backAction) && fr.t.c(this.formSectionHeaderLabel, data.formSectionHeaderLabel) && fr.t.c(this.fields, data.fields) && fr.t.c(this.attachmentsSectionHeaderLabel, data.attachmentsSectionHeaderLabel) && fr.t.c(this.filePickerData, data.filePickerData) && fr.t.c(this.nextButton, data.nextButton) && this.fieldTypeToScroll == data.fieldTypeToScroll && fr.t.c(this.onScrollToField, data.onScrollToField);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final d12.a getFieldTypeToScroll() {
            return this.fieldTypeToScroll;
        }

        public final List<NewMessageFieldData> g() {
            return this.fields;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final FilePickerData getFilePickerData() {
            return this.filePickerData;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((this.baseScaffoldData.hashCode() * 31) + this.bottomSheetData.hashCode()) * 31) + this.bottomSheetContentData.hashCode()) * 31) + this.backAction.hashCode()) * 31) + this.formSectionHeaderLabel.hashCode()) * 31) + this.fields.hashCode()) * 31) + this.attachmentsSectionHeaderLabel.hashCode()) * 31) + this.filePickerData.hashCode()) * 31) + this.nextButton.hashCode()) * 31;
            d12.a aVar = this.fieldTypeToScroll;
            return ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.onScrollToField.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final Label getFormSectionHeaderLabel() {
            return this.formSectionHeaderLabel;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final ButtonData getNextButton() {
            return this.nextButton;
        }

        public final er.a<oq.i0> k() {
            return this.onScrollToField;
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", bottomSheetData=" + this.bottomSheetData + ", bottomSheetContentData=" + this.bottomSheetContentData + ", backAction=" + this.backAction + ", formSectionHeaderLabel=" + this.formSectionHeaderLabel + ", fields=" + this.fields + ", attachmentsSectionHeaderLabel=" + this.attachmentsSectionHeaderLabel + ", filePickerData=" + this.filePickerData + ", nextButton=" + this.nextButton + ", fieldTypeToScroll=" + this.fieldTypeToScroll + ", onScrollToField=" + this.onScrollToField + ')';
        }
    }
}
