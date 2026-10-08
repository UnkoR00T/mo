package wd1;

import a50.RadioButtonData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import t40.InfoRowListData;
import x40.LinkData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lwd1/i;", "Ll00/e;", "Lwd1/i$a;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lwd1/i$a;", "", "b", "a", "Lwd1/i$a$a;", "Lwd1/i$a$b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: wd1.i$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b(\u0010'R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010'R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b!\u0010,R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b-\u0010'R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b/\u0010'R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010,R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b2\u0010'R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b1\u00103\u001a\u0004\b.\u00104R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b/\u00105\u001a\u0004\b0\u00106¨\u00067"}, d2 = {"Lwd1/i$a$a;", "Lwd1/i$a;", "Li50/a;", "baseScaffoldData", "Lmx/a;", "aboutSubtitle", "descriptionNo1", "descriptionNo2", "descriptionNo3", "Lt40/b;", "aboutInfoRowListData", "descriptionNo4", "rememberSubtitle", "rememberInfoRowListData", "rememberDescription", "Lx40/a;", "linkData", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lt40/b;Lmx/a;Lmx/a;Lt40/b;Lmx/a;Lx40/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "c", "()Li50/a;", "b", "Lmx/a;", "()Lmx/a;", "d", "e", "f", "Lt40/b;", "()Lt40/b;", "g", "h", "l", "i", "k", "j", "Lx40/a;", "()Lx40/a;", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InfoPage implements a {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final int f212390m;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label aboutSubtitle;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label descriptionNo1;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label descriptionNo2;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label descriptionNo3;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final InfoRowListData aboutInfoRowListData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label descriptionNo4;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label rememberSubtitle;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final InfoRowListData rememberInfoRowListData;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label rememberDescription;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final LinkData linkData;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackAction;

            static {
                int i15 = LinkData.f216731g;
                int i16 = InfoRowListData.f187643b;
                f212390m = i15 | i16 | i16 | BaseScaffoldData.f89350g;
            }

            public InfoPage(BaseScaffoldData baseScaffoldData, Label label, Label label2, Label label3, Label label4, InfoRowListData infoRowListData, Label label5, Label label6, InfoRowListData infoRowListData2, Label label7, LinkData linkData, er.a<i0> aVar) {
                this.baseScaffoldData = baseScaffoldData;
                this.aboutSubtitle = label;
                this.descriptionNo1 = label2;
                this.descriptionNo2 = label3;
                this.descriptionNo3 = label4;
                this.aboutInfoRowListData = infoRowListData;
                this.descriptionNo4 = label5;
                this.rememberSubtitle = label6;
                this.rememberInfoRowListData = infoRowListData2;
                this.rememberDescription = label7;
                this.linkData = linkData;
                this.onBackAction = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InfoRowListData getAboutInfoRowListData() {
                return this.aboutInfoRowListData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getAboutSubtitle() {
                return this.aboutSubtitle;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getDescriptionNo1() {
                return this.descriptionNo1;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Label getDescriptionNo2() {
                return this.descriptionNo2;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InfoPage)) {
                    return false;
                }
                InfoPage infoPage = (InfoPage) other;
                return fr.t.c(this.baseScaffoldData, infoPage.baseScaffoldData) && fr.t.c(this.aboutSubtitle, infoPage.aboutSubtitle) && fr.t.c(this.descriptionNo1, infoPage.descriptionNo1) && fr.t.c(this.descriptionNo2, infoPage.descriptionNo2) && fr.t.c(this.descriptionNo3, infoPage.descriptionNo3) && fr.t.c(this.aboutInfoRowListData, infoPage.aboutInfoRowListData) && fr.t.c(this.descriptionNo4, infoPage.descriptionNo4) && fr.t.c(this.rememberSubtitle, infoPage.rememberSubtitle) && fr.t.c(this.rememberInfoRowListData, infoPage.rememberInfoRowListData) && fr.t.c(this.rememberDescription, infoPage.rememberDescription) && fr.t.c(this.linkData, infoPage.linkData) && fr.t.c(this.onBackAction, infoPage.onBackAction);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Label getDescriptionNo3() {
                return this.descriptionNo3;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final Label getDescriptionNo4() {
                return this.descriptionNo4;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final LinkData getLinkData() {
                return this.linkData;
            }

            public int hashCode() {
                return (((((((((((((((((((((this.baseScaffoldData.hashCode() * 31) + this.aboutSubtitle.hashCode()) * 31) + this.descriptionNo1.hashCode()) * 31) + this.descriptionNo2.hashCode()) * 31) + this.descriptionNo3.hashCode()) * 31) + this.aboutInfoRowListData.hashCode()) * 31) + this.descriptionNo4.hashCode()) * 31) + this.rememberSubtitle.hashCode()) * 31) + this.rememberInfoRowListData.hashCode()) * 31) + this.rememberDescription.hashCode()) * 31) + this.linkData.hashCode()) * 31) + this.onBackAction.hashCode();
            }

            public final er.a<i0> i() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final Label getRememberDescription() {
                return this.rememberDescription;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final InfoRowListData getRememberInfoRowListData() {
                return this.rememberInfoRowListData;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final Label getRememberSubtitle() {
                return this.rememberSubtitle;
            }

            public String toString() {
                return "InfoPage(baseScaffoldData=" + this.baseScaffoldData + ", aboutSubtitle=" + this.aboutSubtitle + ", descriptionNo1=" + this.descriptionNo1 + ", descriptionNo2=" + this.descriptionNo2 + ", descriptionNo3=" + this.descriptionNo3 + ", aboutInfoRowListData=" + this.aboutInfoRowListData + ", descriptionNo4=" + this.descriptionNo4 + ", rememberSubtitle=" + this.rememberSubtitle + ", rememberInfoRowListData=" + this.rememberInfoRowListData + ", rememberDescription=" + this.rememberDescription + ", linkData=" + this.linkData + ", onBackAction=" + this.onBackAction + ')';
            }
        }

        /* JADX INFO: renamed from: wd1.i$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b\u001d\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b!\u0010(R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010,\u001a\u0004\b&\u0010-R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\b%\u0010/¨\u00060"}, d2 = {"Lwd1/i$a$b;", "Lwd1/i$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "title", "description", "Lj30/a;", "moreInfoButtonData", "La50/a;", "radioButtonData", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lh30/a;", "nextButton", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lj30/a;La50/a;Ler/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "f", "()Li50/a;", "b", "Lmx/a;", "g", "()Lmx/a;", "c", "d", "Lj30/a;", "()Lj30/a;", "e", "La50/a;", "()La50/a;", "Ler/a;", "()Ler/a;", "Lh30/a;", "()Lh30/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f212403h = (RadioButtonData.f3462h | ButtonTextData.f99099f) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonTextData moreInfoButtonData;

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
                this.moreInfoButtonData = buttonTextData;
                this.radioButtonData = radioButtonData;
                this.onBackAction = aVar;
                this.nextButton = buttonData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Label getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final ButtonTextData getMoreInfoButtonData() {
                return this.moreInfoButtonData;
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
                return fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.title, initialized.title) && fr.t.c(this.description, initialized.description) && fr.t.c(this.moreInfoButtonData, initialized.moreInfoButtonData) && fr.t.c(this.radioButtonData, initialized.radioButtonData) && fr.t.c(this.onBackAction, initialized.onBackAction) && fr.t.c(this.nextButton, initialized.nextButton);
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
                return (((((((((((this.scaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.moreInfoButtonData.hashCode()) * 31) + this.radioButtonData.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.nextButton.hashCode();
            }

            public String toString() {
                return "Initialized(scaffoldData=" + this.scaffoldData + ", title=" + this.title + ", description=" + this.description + ", moreInfoButtonData=" + this.moreInfoButtonData + ", radioButtonData=" + this.radioButtonData + ", onBackAction=" + this.onBackAction + ", nextButton=" + this.nextButton + ')';
            }
        }
    }
}
