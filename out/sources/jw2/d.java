package jw2;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n40.FilePickerData;
import oq.i0;
import p071kotlin.Metadata;
import u30.CheckBoxGroupData;
import x40.LinkData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ljw2/d;", "Ll00/e;", "Ljw2/d$a;", "a", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<Data> {

    /* JADX INFO: renamed from: jw2.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b3\u00104R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b%\u0010(R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b!\u0010(R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b3\u00108\u001a\u0004\b+\u00109R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b'\u0010:\u001a\u0004\b)\u0010;¨\u0006<"}, d2 = {"Ljw2/d$a;", "", "Li50/a;", "scaffoldData", "Lmx/a;", "title", "description", "Lx40/a;", "photoRequirementsLinkData", "Ln40/c;", "imagePickerData", "", "scrollToImageSection", "Lkotlin/Function0;", "Loq/i0;", "onScrolledToImageSection", "additionalAttachmentsTitle", "additionalAttachmentsDescription", "Lu30/a;", "checkBoxData", "Lh30/a;", "button", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lx40/a;Ln40/c;ZLer/a;Lmx/a;Lmx/a;Lu30/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "i", "()Li50/a;", "b", "Lmx/a;", "k", "()Lmx/a;", "c", "e", "d", "Lx40/a;", "h", "()Lx40/a;", "Ln40/c;", "f", "()Ln40/c;", "Z", "j", "()Z", "g", "Ler/a;", "()Ler/a;", "Lu30/a;", "()Lu30/a;", "Lh30/a;", "()Lh30/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f106292l = ((CheckBoxGroupData.f194954g | FilePickerData.f131319k) | LinkData.f216731g) | BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label description;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final LinkData photoRequirementsLinkData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final FilePickerData imagePickerData;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean scrollToImageSection;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToImageSection;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label additionalAttachmentsTitle;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label additionalAttachmentsDescription;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final CheckBoxGroupData checkBoxData;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData button;

        public Data(BaseScaffoldData baseScaffoldData, Label label, Label label2, LinkData linkData, FilePickerData filePickerData, boolean z15, er.a<i0> aVar, Label label3, Label label4, CheckBoxGroupData checkBoxGroupData, ButtonData buttonData) {
            this.scaffoldData = baseScaffoldData;
            this.title = label;
            this.description = label2;
            this.photoRequirementsLinkData = linkData;
            this.imagePickerData = filePickerData;
            this.scrollToImageSection = z15;
            this.onScrolledToImageSection = aVar;
            this.additionalAttachmentsTitle = label3;
            this.additionalAttachmentsDescription = label4;
            this.checkBoxData = checkBoxGroupData;
            this.button = buttonData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getAdditionalAttachmentsDescription() {
            return this.additionalAttachmentsDescription;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getAdditionalAttachmentsTitle() {
            return this.additionalAttachmentsTitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ButtonData getButton() {
            return this.button;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final CheckBoxGroupData getCheckBoxData() {
            return this.checkBoxData;
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
            return fr.t.c(this.scaffoldData, data.scaffoldData) && fr.t.c(this.title, data.title) && fr.t.c(this.description, data.description) && fr.t.c(this.photoRequirementsLinkData, data.photoRequirementsLinkData) && fr.t.c(this.imagePickerData, data.imagePickerData) && this.scrollToImageSection == data.scrollToImageSection && fr.t.c(this.onScrolledToImageSection, data.onScrolledToImageSection) && fr.t.c(this.additionalAttachmentsTitle, data.additionalAttachmentsTitle) && fr.t.c(this.additionalAttachmentsDescription, data.additionalAttachmentsDescription) && fr.t.c(this.checkBoxData, data.checkBoxData) && fr.t.c(this.button, data.button);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final FilePickerData getImagePickerData() {
            return this.imagePickerData;
        }

        public final er.a<i0> g() {
            return this.onScrolledToImageSection;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final LinkData getPhotoRequirementsLinkData() {
            return this.photoRequirementsLinkData;
        }

        public int hashCode() {
            return (((((((((((((((((((this.scaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.photoRequirementsLinkData.hashCode()) * 31) + this.imagePickerData.hashCode()) * 31) + Boolean.hashCode(this.scrollToImageSection)) * 31) + this.onScrolledToImageSection.hashCode()) * 31) + this.additionalAttachmentsTitle.hashCode()) * 31) + this.additionalAttachmentsDescription.hashCode()) * 31) + this.checkBoxData.hashCode()) * 31) + this.button.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getScrollToImageSection() {
            return this.scrollToImageSection;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", title=" + this.title + ", description=" + this.description + ", photoRequirementsLinkData=" + this.photoRequirementsLinkData + ", imagePickerData=" + this.imagePickerData + ", scrollToImageSection=" + this.scrollToImageSection + ", onScrolledToImageSection=" + this.onScrolledToImageSection + ", additionalAttachmentsTitle=" + this.additionalAttachmentsTitle + ", additionalAttachmentsDescription=" + this.additionalAttachmentsDescription + ", checkBoxData=" + this.checkBoxData + ", button=" + this.button + ')';
        }
    }
}
