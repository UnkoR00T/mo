package o61;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n40.FilePickerData;
import p071kotlin.Metadata;
import u30.CheckBoxGroupData;
import x40.LinkData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lo61/d;", "Ll00/e;", "Lo61/d$a;", "a", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lo61/d$a;", "", "<init>", "()V", "b", "a", "Lo61/d$a$a;", "Lo61/d$a$b;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: o61.d$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lo61/d$a$a;", "Lo61/d$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(hb4.c cVar) {
                super(null);
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

        /* JADX INFO: renamed from: o61.d$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u00101\u001a\u0004\b2\u00103R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u00104\u001a\u0004\b5\u00106R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010(\u001a\u0004\b'\u0010*R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b#\u0010*R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b%\u0010;\u001a\u0004\b-\u0010<R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b5\u0010=\u001a\u0004\b+\u0010>R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b)\u00108\u001a\u0004\b7\u0010:¨\u0006?"}, d2 = {"Lo61/d$a$b;", "Lo61/d$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "title", "description", "Lx40/a;", "photoRequirementsLinkData", "Ln40/c;", "imagePickerData", "", "scrollToImageSection", "Lkotlin/Function0;", "Loq/i0;", "onScrolledToImageSection", "additionalAttachmentsTitle", "additionalAttachmentsDescription", "Lu30/a;", "checkBoxData", "Lh30/a;", "button", "onBackClick", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lx40/a;Ln40/c;ZLer/a;Lmx/a;Lmx/a;Lu30/a;Lh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "j", "()Li50/a;", "b", "Lmx/a;", "l", "()Lmx/a;", "c", "e", "d", "Lx40/a;", "i", "()Lx40/a;", "Ln40/c;", "f", "()Ln40/c;", "Z", "k", "()Z", "g", "Ler/a;", "h", "()Ler/a;", "Lu30/a;", "()Lu30/a;", "Lh30/a;", "()Lh30/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Presenting extends a {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final int f142588m = ((CheckBoxGroupData.f194954g | FilePickerData.f131319k) | LinkData.f216731g) | BaseScaffoldData.f89350g;

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
            private final er.a<oq.i0> onScrolledToImageSection;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label additionalAttachmentsTitle;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label additionalAttachmentsDescription;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final CheckBoxGroupData checkBoxData;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData button;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackClick;

            public Presenting(BaseScaffoldData baseScaffoldData, Label label, Label label2, LinkData linkData, FilePickerData filePickerData, boolean z15, er.a<oq.i0> aVar, Label label3, Label label4, CheckBoxGroupData checkBoxGroupData, ButtonData buttonData, er.a<oq.i0> aVar2) {
                super(null);
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
                this.onBackClick = aVar2;
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
                if (!(other instanceof Presenting)) {
                    return false;
                }
                Presenting presenting = (Presenting) other;
                return fr.t.c(this.scaffoldData, presenting.scaffoldData) && fr.t.c(this.title, presenting.title) && fr.t.c(this.description, presenting.description) && fr.t.c(this.photoRequirementsLinkData, presenting.photoRequirementsLinkData) && fr.t.c(this.imagePickerData, presenting.imagePickerData) && this.scrollToImageSection == presenting.scrollToImageSection && fr.t.c(this.onScrolledToImageSection, presenting.onScrolledToImageSection) && fr.t.c(this.additionalAttachmentsTitle, presenting.additionalAttachmentsTitle) && fr.t.c(this.additionalAttachmentsDescription, presenting.additionalAttachmentsDescription) && fr.t.c(this.checkBoxData, presenting.checkBoxData) && fr.t.c(this.button, presenting.button) && fr.t.c(this.onBackClick, presenting.onBackClick);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final FilePickerData getImagePickerData() {
                return this.imagePickerData;
            }

            public final er.a<oq.i0> g() {
                return this.onBackClick;
            }

            public final er.a<oq.i0> h() {
                return this.onScrolledToImageSection;
            }

            public int hashCode() {
                return (((((((((((((((((((((this.scaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.photoRequirementsLinkData.hashCode()) * 31) + this.imagePickerData.hashCode()) * 31) + Boolean.hashCode(this.scrollToImageSection)) * 31) + this.onScrolledToImageSection.hashCode()) * 31) + this.additionalAttachmentsTitle.hashCode()) * 31) + this.additionalAttachmentsDescription.hashCode()) * 31) + this.checkBoxData.hashCode()) * 31) + this.button.hashCode()) * 31) + this.onBackClick.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final LinkData getPhotoRequirementsLinkData() {
                return this.photoRequirementsLinkData;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final boolean getScrollToImageSection() {
                return this.scrollToImageSection;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public String toString() {
                return "Presenting(scaffoldData=" + this.scaffoldData + ", title=" + this.title + ", description=" + this.description + ", photoRequirementsLinkData=" + this.photoRequirementsLinkData + ", imagePickerData=" + this.imagePickerData + ", scrollToImageSection=" + this.scrollToImageSection + ", onScrolledToImageSection=" + this.onScrolledToImageSection + ", additionalAttachmentsTitle=" + this.additionalAttachmentsTitle + ", additionalAttachmentsDescription=" + this.additionalAttachmentsDescription + ", checkBoxData=" + this.checkBoxData + ", button=" + this.button + ", onBackClick=" + this.onBackClick + ')';
            }
        }

        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }
}
