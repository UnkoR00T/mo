package sc1;

import a50.RadioButtonData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import x40.LinkData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lsc1/r;", "Ll00/e;", "Lsc1/r$a;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface r extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lsc1/r$a;", "", "b", "a", "Lsc1/r$a$a;", "Lsc1/r$a$b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: sc1.r$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b*\u0010%R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b+\u0010%R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b\"\u0010%R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u001e\u0010-R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b*\u0010.\u001a\u0004\b(\u0010/¨\u00060"}, d2 = {"Lsc1/r$a$a;", "Lsc1/r$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "firstTaxationRuleTitle", "firstTaxationRuleDescription", "secondTaxationRuleTitle", "secondTaxationRuleDescription", "thirdTaxationRuleTitle", "thirdTaxationRuleDescription", "description", "Lx40/a;", "ceidgUrlButtonLinkData", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lx40/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "f", "()Li50/a;", "b", "Lmx/a;", "d", "()Lmx/a;", "c", "h", "e", "g", "j", "i", "Lx40/a;", "()Lx40/a;", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InfoPage implements a {

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static final int f180075k = LinkData.f216731g | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label firstTaxationRuleTitle;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label firstTaxationRuleDescription;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label secondTaxationRuleTitle;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label secondTaxationRuleDescription;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label thirdTaxationRuleTitle;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label thirdTaxationRuleDescription;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final LinkData ceidgUrlButtonLinkData;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onCloseAction;

            public InfoPage(BaseScaffoldData baseScaffoldData, Label label, Label label2, Label label3, Label label4, Label label5, Label label6, Label label7, LinkData linkData, er.a<i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.firstTaxationRuleTitle = label;
                this.firstTaxationRuleDescription = label2;
                this.secondTaxationRuleTitle = label3;
                this.secondTaxationRuleDescription = label4;
                this.thirdTaxationRuleTitle = label5;
                this.thirdTaxationRuleDescription = label6;
                this.description = label7;
                this.ceidgUrlButtonLinkData = linkData;
                this.onCloseAction = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final LinkData getCeidgUrlButtonLinkData() {
                return this.ceidgUrlButtonLinkData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getFirstTaxationRuleDescription() {
                return this.firstTaxationRuleDescription;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getFirstTaxationRuleTitle() {
                return this.firstTaxationRuleTitle;
            }

            public final er.a<i0> e() {
                return this.onCloseAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InfoPage)) {
                    return false;
                }
                InfoPage infoPage = (InfoPage) other;
                return fr.t.c(this.scaffoldData, infoPage.scaffoldData) && fr.t.c(this.firstTaxationRuleTitle, infoPage.firstTaxationRuleTitle) && fr.t.c(this.firstTaxationRuleDescription, infoPage.firstTaxationRuleDescription) && fr.t.c(this.secondTaxationRuleTitle, infoPage.secondTaxationRuleTitle) && fr.t.c(this.secondTaxationRuleDescription, infoPage.secondTaxationRuleDescription) && fr.t.c(this.thirdTaxationRuleTitle, infoPage.thirdTaxationRuleTitle) && fr.t.c(this.thirdTaxationRuleDescription, infoPage.thirdTaxationRuleDescription) && fr.t.c(this.description, infoPage.description) && fr.t.c(this.ceidgUrlButtonLinkData, infoPage.ceidgUrlButtonLinkData) && fr.t.c(this.onCloseAction, infoPage.onCloseAction);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final Label getSecondTaxationRuleDescription() {
                return this.secondTaxationRuleDescription;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final Label getSecondTaxationRuleTitle() {
                return this.secondTaxationRuleTitle;
            }

            public int hashCode() {
                return (((((((((((((((((this.scaffoldData.hashCode() * 31) + this.firstTaxationRuleTitle.hashCode()) * 31) + this.firstTaxationRuleDescription.hashCode()) * 31) + this.secondTaxationRuleTitle.hashCode()) * 31) + this.secondTaxationRuleDescription.hashCode()) * 31) + this.thirdTaxationRuleTitle.hashCode()) * 31) + this.thirdTaxationRuleDescription.hashCode()) * 31) + this.description.hashCode()) * 31) + this.ceidgUrlButtonLinkData.hashCode()) * 31) + this.onCloseAction.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final Label getThirdTaxationRuleDescription() {
                return this.thirdTaxationRuleDescription;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final Label getThirdTaxationRuleTitle() {
                return this.thirdTaxationRuleTitle;
            }

            public String toString() {
                return "InfoPage(scaffoldData=" + this.scaffoldData + ", firstTaxationRuleTitle=" + this.firstTaxationRuleTitle + ", firstTaxationRuleDescription=" + this.firstTaxationRuleDescription + ", secondTaxationRuleTitle=" + this.secondTaxationRuleTitle + ", secondTaxationRuleDescription=" + this.secondTaxationRuleDescription + ", thirdTaxationRuleTitle=" + this.thirdTaxationRuleTitle + ", thirdTaxationRuleDescription=" + this.thirdTaxationRuleDescription + ", description=" + this.description + ", ceidgUrlButtonLinkData=" + this.ceidgUrlButtonLinkData + ", onCloseAction=" + this.onCloseAction + ')';
            }
        }

        /* JADX INFO: renamed from: sc1.r$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b!\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001d\u0010(R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010,\u001a\u0004\b&\u0010-R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\b%\u0010/¨\u00060"}, d2 = {"Lsc1/r$a$b;", "Lsc1/r$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "title", "description", "Lj30/a;", "buttonTextData", "La50/a;", "radioButtonData", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lh30/a;", "nextButton", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lj30/a;La50/a;Ler/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "f", "()Li50/a;", "b", "Lmx/a;", "g", "()Lmx/a;", "c", "d", "Lj30/a;", "()Lj30/a;", "e", "La50/a;", "()La50/a;", "Ler/a;", "()Ler/a;", "Lh30/a;", "()Lh30/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f180086h = (RadioButtonData.f3462h | ButtonTextData.f99099f) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonTextData buttonTextData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final RadioButtonData radioButtonData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackAction;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButton;

            public Initialized(BaseScaffoldData baseScaffoldData, Label label, Label label2, ButtonTextData buttonTextData, RadioButtonData radioButtonData, er.a<i0> aVar, ButtonData buttonData) {
                this.scaffoldData = baseScaffoldData;
                this.title = label;
                this.description = label2;
                this.buttonTextData = buttonTextData;
                this.radioButtonData = radioButtonData;
                this.onBackAction = aVar;
                this.nextButton = buttonData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ButtonTextData getButtonTextData() {
                return this.buttonTextData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ButtonData getNextButton() {
                return this.nextButton;
            }

            public final er.a<i0> d() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final RadioButtonData getRadioButtonData() {
                return this.radioButtonData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.title, initialized.title) && fr.t.c(this.description, initialized.description) && fr.t.c(this.buttonTextData, initialized.buttonTextData) && fr.t.c(this.radioButtonData, initialized.radioButtonData) && fr.t.c(this.onBackAction, initialized.onBackAction) && fr.t.c(this.nextButton, initialized.nextButton);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public int hashCode() {
                return (((((((((((this.scaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.buttonTextData.hashCode()) * 31) + this.radioButtonData.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.nextButton.hashCode();
            }

            public String toString() {
                return "Initialized(scaffoldData=" + this.scaffoldData + ", title=" + this.title + ", description=" + this.description + ", buttonTextData=" + this.buttonTextData + ", radioButtonData=" + this.radioButtonData + ", onBackAction=" + this.onBackAction + ", nextButton=" + this.nextButton + ')';
            }
        }
    }
}
