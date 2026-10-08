package me1;

import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import j40.DropDownButtonData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import t40.InfoRowListData;
import x40.LinkData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lme1/k;", "Ll00/e;", "Lme1/k$a;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lme1/k$a;", "", "b", "a", "c", "Lme1/k$a$a;", "Lme1/k$a$b;", "Lme1/k$a$c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: me1.k$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b!\u0010'R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b(\u0010'R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010+\u001a\u0004\b%\u0010,R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010+\u001a\u0004\b\u001d\u0010,R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b*\u0010-\u001a\u0004\b)\u0010.¨\u0006/"}, d2 = {"Lme1/k$a$a;", "Lme1/k$a;", "Li50/a;", "scaffoldData", "Lt40/b;", "infoRowData", "Lmx/a;", "firstDescription", "secondDescription", "thirdDescription", "Lx40/a;", "govUrlButtonLinkData", "ceidgUrlButtonLinkData", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "<init>", "(Li50/a;Lt40/b;Lmx/a;Lmx/a;Lmx/a;Lx40/a;Lx40/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "f", "()Li50/a;", "b", "Lt40/b;", "d", "()Lt40/b;", "c", "Lmx/a;", "()Lmx/a;", "g", "e", "h", "Lx40/a;", "()Lx40/a;", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InfoPage implements a {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final int f126002i = (LinkData.f216731g | InfoRowListData.f187643b) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final InfoRowListData infoRowData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label firstDescription;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label secondDescription;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label thirdDescription;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final LinkData govUrlButtonLinkData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final LinkData ceidgUrlButtonLinkData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onCloseAction;

            public InfoPage(BaseScaffoldData baseScaffoldData, InfoRowListData infoRowListData, Label label, Label label2, Label label3, LinkData linkData, LinkData linkData2, er.a<i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.infoRowData = infoRowListData;
                this.firstDescription = label;
                this.secondDescription = label2;
                this.thirdDescription = label3;
                this.govUrlButtonLinkData = linkData;
                this.ceidgUrlButtonLinkData = linkData2;
                this.onCloseAction = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final LinkData getCeidgUrlButtonLinkData() {
                return this.ceidgUrlButtonLinkData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getFirstDescription() {
                return this.firstDescription;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final LinkData getGovUrlButtonLinkData() {
                return this.govUrlButtonLinkData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final InfoRowListData getInfoRowData() {
                return this.infoRowData;
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
                return fr.t.c(this.scaffoldData, infoPage.scaffoldData) && fr.t.c(this.infoRowData, infoPage.infoRowData) && fr.t.c(this.firstDescription, infoPage.firstDescription) && fr.t.c(this.secondDescription, infoPage.secondDescription) && fr.t.c(this.thirdDescription, infoPage.thirdDescription) && fr.t.c(this.govUrlButtonLinkData, infoPage.govUrlButtonLinkData) && fr.t.c(this.ceidgUrlButtonLinkData, infoPage.ceidgUrlButtonLinkData) && fr.t.c(this.onCloseAction, infoPage.onCloseAction);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final Label getSecondDescription() {
                return this.secondDescription;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final Label getThirdDescription() {
                return this.thirdDescription;
            }

            public int hashCode() {
                return (((((((((((((this.scaffoldData.hashCode() * 31) + this.infoRowData.hashCode()) * 31) + this.firstDescription.hashCode()) * 31) + this.secondDescription.hashCode()) * 31) + this.thirdDescription.hashCode()) * 31) + this.govUrlButtonLinkData.hashCode()) * 31) + this.ceidgUrlButtonLinkData.hashCode()) * 31) + this.onCloseAction.hashCode();
            }

            public String toString() {
                return "InfoPage(scaffoldData=" + this.scaffoldData + ", infoRowData=" + this.infoRowData + ", firstDescription=" + this.firstDescription + ", secondDescription=" + this.secondDescription + ", thirdDescription=" + this.thirdDescription + ", govUrlButtonLinkData=" + this.govUrlButtonLinkData + ", ceidgUrlButtonLinkData=" + this.ceidgUrlButtonLinkData + ", onCloseAction=" + this.onCloseAction + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lme1/k$a$b;", "Lme1/k$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f126011a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -932376741;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: me1.k$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\u001a\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001e\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b#\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b\"\u0010)¨\u0006*"}, d2 = {"Lme1/k$a$c;", "Lme1/k$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "title", "description", "Lj30/a;", "moreInfoButtonData", "Lj40/a;", "officeFieldData", "Lh30/a;", "nextButton", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lj30/a;Lj40/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "e", "()Li50/a;", "b", "Lmx/a;", "f", "()Lmx/a;", "c", "d", "Lj30/a;", "()Lj30/a;", "Lj40/a;", "()Lj40/a;", "Lh30/a;", "()Lh30/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f126012g = (DropDownButtonData.f99359i | ButtonTextData.f99099f) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonTextData moreInfoButtonData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final DropDownButtonData officeFieldData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButton;

            public Initialized(BaseScaffoldData baseScaffoldData, Label label, Label label2, ButtonTextData buttonTextData, DropDownButtonData dropDownButtonData, ButtonData buttonData) {
                this.scaffoldData = baseScaffoldData;
                this.title = label;
                this.description = label2;
                this.moreInfoButtonData = buttonTextData;
                this.officeFieldData = dropDownButtonData;
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

            /* JADX INFO: renamed from: d, reason: from getter */
            public final DropDownButtonData getOfficeFieldData() {
                return this.officeFieldData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.title, initialized.title) && fr.t.c(this.description, initialized.description) && fr.t.c(this.moreInfoButtonData, initialized.moreInfoButtonData) && fr.t.c(this.officeFieldData, initialized.officeFieldData) && fr.t.c(this.nextButton, initialized.nextButton);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public int hashCode() {
                return (((((((((this.scaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.moreInfoButtonData.hashCode()) * 31) + this.officeFieldData.hashCode()) * 31) + this.nextButton.hashCode();
            }

            public String toString() {
                return "Initialized(scaffoldData=" + this.scaffoldData + ", title=" + this.title + ", description=" + this.description + ", moreInfoButtonData=" + this.moreInfoButtonData + ", officeFieldData=" + this.officeFieldData + ", nextButton=" + this.nextButton + ')';
            }
        }
    }
}
