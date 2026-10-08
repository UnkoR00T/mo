package h92;

import a50.RadioButtonData;
import h30.ButtonData;
import mx.Label;
import n40.FilePickerData;
import oq.i0;
import p071kotlin.Metadata;
import t50.TextAreaData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lh92/c;", "Ll00/e;", "Lh92/c$a;", "a", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<Data> {

    /* JADX INFO: renamed from: h92.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\b\"\u0010/R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b&\u00105R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b$\u0010:\u001a\u0004\b3\u0010;R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b8\u0010:\u001a\u0004\b6\u0010;¨\u0006?"}, d2 = {"Lh92/c$a;", "", "La50/a;", "radioButtonData", "Lv50/c;", "entityTextInputData", "Lt50/d;", "caseDescriptionTextInputData", "Lmx/a;", "formTitle", "addPhotoTitle", "Ln40/c;", "imagePickerData", "Lh30/a;", "buttonNext", "", "isFocusRemoved", "Lkotlin/Function0;", "Loq/i0;", "onFocusRemoved", "Ll92/a;", "scrollToField", "onScrolledToField", "<init>", "(La50/a;Lv50/c;Lt50/d;Lmx/a;Lmx/a;Ln40/c;Lh30/a;ZLer/a;Ll92/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "La50/a;", "i", "()La50/a;", "b", "Lv50/c;", "d", "()Lv50/c;", "c", "Lt50/d;", "()Lt50/d;", "Lmx/a;", "e", "()Lmx/a;", "f", "Ln40/c;", "()Ln40/c;", "g", "Lh30/a;", "()Lh30/a;", "h", "Z", "k", "()Z", "Ler/a;", "()Ler/a;", "j", "Ll92/a;", "()Ll92/a;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f82041l = ((FilePickerData.f131319k | TextAreaData.f187694o) | v50.c.f203957t) | RadioButtonData.f3462h;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final RadioButtonData radioButtonData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c entityTextInputData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final TextAreaData caseDescriptionTextInputData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label formTitle;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label addPhotoTitle;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final FilePickerData imagePickerData;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData buttonNext;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFocusRemoved;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onFocusRemoved;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final l92.a scrollToField;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToField;

        public Data(RadioButtonData radioButtonData, v50.c cVar, TextAreaData textAreaData, Label label, Label label2, FilePickerData filePickerData, ButtonData buttonData, boolean z15, er.a<i0> aVar, l92.a aVar2, er.a<i0> aVar3) {
            this.radioButtonData = radioButtonData;
            this.entityTextInputData = cVar;
            this.caseDescriptionTextInputData = textAreaData;
            this.formTitle = label;
            this.addPhotoTitle = label2;
            this.imagePickerData = filePickerData;
            this.buttonNext = buttonData;
            this.isFocusRemoved = z15;
            this.onFocusRemoved = aVar;
            this.scrollToField = aVar2;
            this.onScrolledToField = aVar3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getAddPhotoTitle() {
            return this.addPhotoTitle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ButtonData getButtonNext() {
            return this.buttonNext;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextAreaData getCaseDescriptionTextInputData() {
            return this.caseDescriptionTextInputData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final v50.c getEntityTextInputData() {
            return this.entityTextInputData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Label getFormTitle() {
            return this.formTitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.radioButtonData, data.radioButtonData) && fr.t.c(this.entityTextInputData, data.entityTextInputData) && fr.t.c(this.caseDescriptionTextInputData, data.caseDescriptionTextInputData) && fr.t.c(this.formTitle, data.formTitle) && fr.t.c(this.addPhotoTitle, data.addPhotoTitle) && fr.t.c(this.imagePickerData, data.imagePickerData) && fr.t.c(this.buttonNext, data.buttonNext) && this.isFocusRemoved == data.isFocusRemoved && fr.t.c(this.onFocusRemoved, data.onFocusRemoved) && this.scrollToField == data.scrollToField && fr.t.c(this.onScrolledToField, data.onScrolledToField);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final FilePickerData getImagePickerData() {
            return this.imagePickerData;
        }

        public final er.a<i0> g() {
            return this.onFocusRemoved;
        }

        public final er.a<i0> h() {
            return this.onScrolledToField;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((this.radioButtonData.hashCode() * 31) + this.entityTextInputData.hashCode()) * 31) + this.caseDescriptionTextInputData.hashCode()) * 31) + this.formTitle.hashCode()) * 31) + this.addPhotoTitle.hashCode()) * 31) + this.imagePickerData.hashCode()) * 31) + this.buttonNext.hashCode()) * 31) + Boolean.hashCode(this.isFocusRemoved)) * 31) + this.onFocusRemoved.hashCode()) * 31;
            l92.a aVar = this.scrollToField;
            return ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.onScrolledToField.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final RadioButtonData getRadioButtonData() {
            return this.radioButtonData;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final l92.a getScrollToField() {
            return this.scrollToField;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getIsFocusRemoved() {
            return this.isFocusRemoved;
        }

        public String toString() {
            return "Data(radioButtonData=" + this.radioButtonData + ", entityTextInputData=" + this.entityTextInputData + ", caseDescriptionTextInputData=" + this.caseDescriptionTextInputData + ", formTitle=" + this.formTitle + ", addPhotoTitle=" + this.addPhotoTitle + ", imagePickerData=" + this.imagePickerData + ", buttonNext=" + this.buttonNext + ", isFocusRemoved=" + this.isFocusRemoved + ", onFocusRemoved=" + this.onFocusRemoved + ", scrollToField=" + this.scrollToField + ", onScrolledToField=" + this.onScrolledToField + ')';
        }
    }
}
