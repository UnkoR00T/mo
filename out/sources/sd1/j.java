package sd1;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;
import w30.CheckBoxSingleData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lsd1/j;", "Ll00/e;", "Lsd1/j$a;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lsd1/j$a;", "", "a", "Lsd1/j$a$a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: sd1.j$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b#\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b'\u0010,R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b)\u0010,R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b\u001f\u0010/R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b(\u00100\u001a\u0004\b*\u00101R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b%\u00102\u001a\u0004\b-\u00103¨\u00064"}, d2 = {"Lsd1/j$a$a;", "Lsd1/j$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "title", "subTitle", "consentTitle", "Lsd1/l;", "emailInputData", "emailRepeatedInputData", "Lsd1/k;", "checkboxData", "Lh30/a;", "nextButton", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lmx/a;Lsd1/l;Lsd1/l;Lsd1/k;Lh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "g", "()Li50/a;", "b", "Lmx/a;", "i", "()Lmx/a;", "c", "h", "d", "e", "Lsd1/l;", "()Lsd1/l;", "f", "Lsd1/k;", "()Lsd1/k;", "Lh30/a;", "()Lh30/a;", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DataDisplayed implements a {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final int f180311j;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label subTitle;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label consentTitle;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final TextInput emailInputData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final TextInput emailRepeatedInputData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final CheckBox checkboxData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButton;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackAction;

            static {
                int i15 = CheckBoxSingleData.f210090f;
                int i16 = v50.c.f203957t;
                f180311j = i15 | i16 | i16 | BaseScaffoldData.f89350g;
            }

            public DataDisplayed(BaseScaffoldData baseScaffoldData, Label label, Label label2, Label label3, TextInput textInput, TextInput textInput2, CheckBox checkBox, ButtonData buttonData, er.a<oq.i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.title = label;
                this.subTitle = label2;
                this.consentTitle = label3;
                this.emailInputData = textInput;
                this.emailRepeatedInputData = textInput2;
                this.checkboxData = checkBox;
                this.nextButton = buttonData;
                this.onBackAction = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final CheckBox getCheckboxData() {
                return this.checkboxData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getConsentTitle() {
                return this.consentTitle;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final TextInput getEmailInputData() {
                return this.emailInputData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final TextInput getEmailRepeatedInputData() {
                return this.emailRepeatedInputData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final ButtonData getNextButton() {
                return this.nextButton;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DataDisplayed)) {
                    return false;
                }
                DataDisplayed dataDisplayed = (DataDisplayed) other;
                return fr.t.c(this.scaffoldData, dataDisplayed.scaffoldData) && fr.t.c(this.title, dataDisplayed.title) && fr.t.c(this.subTitle, dataDisplayed.subTitle) && fr.t.c(this.consentTitle, dataDisplayed.consentTitle) && fr.t.c(this.emailInputData, dataDisplayed.emailInputData) && fr.t.c(this.emailRepeatedInputData, dataDisplayed.emailRepeatedInputData) && fr.t.c(this.checkboxData, dataDisplayed.checkboxData) && fr.t.c(this.nextButton, dataDisplayed.nextButton) && fr.t.c(this.onBackAction, dataDisplayed.onBackAction);
            }

            public final er.a<oq.i0> f() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final Label getSubTitle() {
                return this.subTitle;
            }

            public int hashCode() {
                return (((((((((((((((this.scaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.subTitle.hashCode()) * 31) + this.consentTitle.hashCode()) * 31) + this.emailInputData.hashCode()) * 31) + this.emailRepeatedInputData.hashCode()) * 31) + this.checkboxData.hashCode()) * 31) + this.nextButton.hashCode()) * 31) + this.onBackAction.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public String toString() {
                return "DataDisplayed(scaffoldData=" + this.scaffoldData + ", title=" + this.title + ", subTitle=" + this.subTitle + ", consentTitle=" + this.consentTitle + ", emailInputData=" + this.emailInputData + ", emailRepeatedInputData=" + this.emailRepeatedInputData + ", checkboxData=" + this.checkboxData + ", nextButton=" + this.nextButton + ", onBackAction=" + this.onBackAction + ')';
            }
        }
    }
}
