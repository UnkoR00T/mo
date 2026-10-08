package hc1;

import h30.ButtonData;
import mx.Label;
import p071kotlin.Metadata;
import w30.CheckBoxSingleData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lhc1/m;", "Ll00/e;", "Lhc1/m$a;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface m extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lhc1/m$a;", "", "a", "Lhc1/m$a$a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: hc1.m$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b'\u0010,\u001a\u0004\b%\u0010-R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b0\u0010-R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b1\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010,\u001a\u0004\b2\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b \u0010-R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b1\u00103\u001a\u0004\b.\u00104¨\u00065"}, d2 = {"Lhc1/m$a$a;", "Lhc1/m$a;", "Lmx/a;", "title", "description", "Lh30/a;", "nextButton", "Lhc1/o;", "emailTextInputData", "Lhc1/n;", "emailCheckBoxData", "phoneTextInputData", "phoneCheckBoxData", "websiteTextInputData", "websiteCheckBoxData", "ceidgCheckBoxData", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Lmx/a;Lmx/a;Lh30/a;Lhc1/o;Lhc1/n;Lhc1/o;Lhc1/n;Lhc1/o;Lhc1/n;Lhc1/n;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "i", "()Lmx/a;", "b", "c", "Lh30/a;", "e", "()Lh30/a;", "d", "Lhc1/o;", "()Lhc1/o;", "Lhc1/n;", "()Lhc1/n;", "f", "h", "g", "k", "j", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FormDisplayed implements a {

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public static final int f83211l;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButton;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final TextInput emailTextInputData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final CheckBox emailCheckBoxData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final TextInput phoneTextInputData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final CheckBox phoneCheckBoxData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final TextInput websiteTextInputData;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final CheckBox websiteCheckBoxData;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final CheckBox ceidgCheckBoxData;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackAction;

            static {
                int i15 = CheckBoxSingleData.f210090f;
                int i16 = v50.c.f203957t;
                f83211l = i15 | i15 | i16 | i15 | i16 | i16;
            }

            public FormDisplayed(Label label, Label label2, ButtonData buttonData, TextInput textInput, CheckBox checkBox, TextInput textInput2, CheckBox checkBox2, TextInput textInput3, CheckBox checkBox3, CheckBox checkBox4, er.a<oq.i0> aVar) {
                this.title = label;
                this.description = label2;
                this.nextButton = buttonData;
                this.emailTextInputData = textInput;
                this.emailCheckBoxData = checkBox;
                this.phoneTextInputData = textInput2;
                this.phoneCheckBoxData = checkBox2;
                this.websiteTextInputData = textInput3;
                this.websiteCheckBoxData = checkBox3;
                this.ceidgCheckBoxData = checkBox4;
                this.onBackAction = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final CheckBox getCeidgCheckBoxData() {
                return this.ceidgCheckBoxData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final CheckBox getEmailCheckBoxData() {
                return this.emailCheckBoxData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final TextInput getEmailTextInputData() {
                return this.emailTextInputData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final ButtonData getNextButton() {
                return this.nextButton;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FormDisplayed)) {
                    return false;
                }
                FormDisplayed formDisplayed = (FormDisplayed) other;
                return fr.t.c(this.title, formDisplayed.title) && fr.t.c(this.description, formDisplayed.description) && fr.t.c(this.nextButton, formDisplayed.nextButton) && fr.t.c(this.emailTextInputData, formDisplayed.emailTextInputData) && fr.t.c(this.emailCheckBoxData, formDisplayed.emailCheckBoxData) && fr.t.c(this.phoneTextInputData, formDisplayed.phoneTextInputData) && fr.t.c(this.phoneCheckBoxData, formDisplayed.phoneCheckBoxData) && fr.t.c(this.websiteTextInputData, formDisplayed.websiteTextInputData) && fr.t.c(this.websiteCheckBoxData, formDisplayed.websiteCheckBoxData) && fr.t.c(this.ceidgCheckBoxData, formDisplayed.ceidgCheckBoxData) && fr.t.c(this.onBackAction, formDisplayed.onBackAction);
            }

            public final er.a<oq.i0> f() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final CheckBox getPhoneCheckBoxData() {
                return this.phoneCheckBoxData;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final TextInput getPhoneTextInputData() {
                return this.phoneTextInputData;
            }

            public int hashCode() {
                int iHashCode = ((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.nextButton.hashCode()) * 31) + this.emailTextInputData.hashCode()) * 31;
                CheckBox checkBox = this.emailCheckBoxData;
                int iHashCode2 = (((iHashCode + (checkBox == null ? 0 : checkBox.hashCode())) * 31) + this.phoneTextInputData.hashCode()) * 31;
                CheckBox checkBox2 = this.phoneCheckBoxData;
                int iHashCode3 = (((iHashCode2 + (checkBox2 == null ? 0 : checkBox2.hashCode())) * 31) + this.websiteTextInputData.hashCode()) * 31;
                CheckBox checkBox3 = this.websiteCheckBoxData;
                int iHashCode4 = (iHashCode3 + (checkBox3 == null ? 0 : checkBox3.hashCode())) * 31;
                CheckBox checkBox4 = this.ceidgCheckBoxData;
                return ((iHashCode4 + (checkBox4 != null ? checkBox4.hashCode() : 0)) * 31) + this.onBackAction.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final CheckBox getWebsiteCheckBoxData() {
                return this.websiteCheckBoxData;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final TextInput getWebsiteTextInputData() {
                return this.websiteTextInputData;
            }

            public String toString() {
                return "FormDisplayed(title=" + this.title + ", description=" + this.description + ", nextButton=" + this.nextButton + ", emailTextInputData=" + this.emailTextInputData + ", emailCheckBoxData=" + this.emailCheckBoxData + ", phoneTextInputData=" + this.phoneTextInputData + ", phoneCheckBoxData=" + this.phoneCheckBoxData + ", websiteTextInputData=" + this.websiteTextInputData + ", websiteCheckBoxData=" + this.websiteCheckBoxData + ", ceidgCheckBoxData=" + this.ceidgCheckBoxData + ", onBackAction=" + this.onBackAction + ')';
            }
        }
    }
}
