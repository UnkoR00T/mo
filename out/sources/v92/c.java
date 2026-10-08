package v92;

import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lv92/c;", "Ll00/e;", "Lv92/c$a;", "Li70/n;", "a", "heatingsupplement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a>, i70.n {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lv92/c$a;", "", "b", "a", "Lv92/c$a$a;", "Lv92/c$a$b;", "heatingsupplement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: v92.c$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b\u001c\u0010#R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b \u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010(R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010'\u001a\u0004\b&\u0010(R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\"\u0010*\u001a\u0004\b)\u0010+¨\u0006,"}, d2 = {"Lv92/c$a$a;", "Lv92/c$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "title", "infoFirstPoint", "infoSecondPoint", "Lt40/b;", "infoSecondPointRows", "infoThirdPoint", "infoThirdPointRows", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lmx/a;Lt40/b;Lmx/a;Lt40/b;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "g", "()Li50/a;", "b", "Lmx/a;", "h", "()Lmx/a;", "c", "d", "e", "Lt40/b;", "()Lt40/b;", "f", "Ler/a;", "()Ler/a;", "heatingsupplement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InfoPage implements a {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final int f205490i = InfoRowListData.f187643b | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label infoFirstPoint;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label infoSecondPoint;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final InfoRowListData infoSecondPointRows;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label infoThirdPoint;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final InfoRowListData infoThirdPointRows;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackAction;

            public InfoPage(BaseScaffoldData baseScaffoldData, Label label, Label label2, Label label3, InfoRowListData infoRowListData, Label label4, InfoRowListData infoRowListData2, er.a<i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.title = label;
                this.infoFirstPoint = label2;
                this.infoSecondPoint = label3;
                this.infoSecondPointRows = infoRowListData;
                this.infoThirdPoint = label4;
                this.infoThirdPointRows = infoRowListData2;
                this.onBackAction = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Label getInfoFirstPoint() {
                return this.infoFirstPoint;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getInfoSecondPoint() {
                return this.infoSecondPoint;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final InfoRowListData getInfoSecondPointRows() {
                return this.infoSecondPointRows;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getInfoThirdPoint() {
                return this.infoThirdPoint;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final InfoRowListData getInfoThirdPointRows() {
                return this.infoThirdPointRows;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InfoPage)) {
                    return false;
                }
                InfoPage infoPage = (InfoPage) other;
                return fr.t.c(this.scaffoldData, infoPage.scaffoldData) && fr.t.c(this.title, infoPage.title) && fr.t.c(this.infoFirstPoint, infoPage.infoFirstPoint) && fr.t.c(this.infoSecondPoint, infoPage.infoSecondPoint) && fr.t.c(this.infoSecondPointRows, infoPage.infoSecondPointRows) && fr.t.c(this.infoThirdPoint, infoPage.infoThirdPoint) && fr.t.c(this.infoThirdPointRows, infoPage.infoThirdPointRows) && fr.t.c(this.onBackAction, infoPage.onBackAction);
            }

            public final er.a<i0> f() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public int hashCode() {
                return (((((((((((((this.scaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.infoFirstPoint.hashCode()) * 31) + this.infoSecondPoint.hashCode()) * 31) + this.infoSecondPointRows.hashCode()) * 31) + this.infoThirdPoint.hashCode()) * 31) + this.infoThirdPointRows.hashCode()) * 31) + this.onBackAction.hashCode();
            }

            public String toString() {
                return "InfoPage(scaffoldData=" + this.scaffoldData + ", title=" + this.title + ", infoFirstPoint=" + this.infoFirstPoint + ", infoSecondPoint=" + this.infoSecondPoint + ", infoSecondPointRows=" + this.infoSecondPointRows + ", infoThirdPoint=" + this.infoThirdPoint + ", infoThirdPointRows=" + this.infoThirdPointRows + ", onBackAction=" + this.onBackAction + ')';
            }
        }

        /* JADX INFO: renamed from: v92.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001b\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010)\u001a\u0004\b#\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b!\u0010+\u001a\u0004\b\u001f\u0010,¨\u0006-"}, d2 = {"Lv92/c$a$b;", "Lv92/c$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "title", "Lt40/b;", "descriptionRows", "Lj30/a;", "moreInfoButton", "Lc30/b;", "moreInfo", "Lh30/a;", "goToApplicationButton", "<init>", "(Li50/a;Lmx/a;Lt40/b;Lj30/a;Lc30/b;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "e", "()Li50/a;", "b", "Lmx/a;", "f", "()Lmx/a;", "c", "Lt40/b;", "()Lt40/b;", "d", "Lj30/a;", "()Lj30/a;", "Lc30/b;", "()Lc30/b;", "Lh30/a;", "()Lh30/a;", "heatingsupplement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class WelcomePage implements a {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f205499g = ((c30.b.f22944i | ButtonTextData.f99099f) | InfoRowListData.f187643b) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final InfoRowListData descriptionRows;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonTextData moreInfoButton;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b moreInfo;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData goToApplicationButton;

            public WelcomePage(BaseScaffoldData baseScaffoldData, Label label, InfoRowListData infoRowListData, ButtonTextData buttonTextData, c30.b bVar, ButtonData buttonData) {
                this.scaffoldData = baseScaffoldData;
                this.title = label;
                this.descriptionRows = infoRowListData;
                this.moreInfoButton = buttonTextData;
                this.moreInfo = bVar;
                this.goToApplicationButton = buttonData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InfoRowListData getDescriptionRows() {
                return this.descriptionRows;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final ButtonData getGoToApplicationButton() {
                return this.goToApplicationButton;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final c30.b getMoreInfo() {
                return this.moreInfo;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final ButtonTextData getMoreInfoButton() {
                return this.moreInfoButton;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof WelcomePage)) {
                    return false;
                }
                WelcomePage welcomePage = (WelcomePage) other;
                return fr.t.c(this.scaffoldData, welcomePage.scaffoldData) && fr.t.c(this.title, welcomePage.title) && fr.t.c(this.descriptionRows, welcomePage.descriptionRows) && fr.t.c(this.moreInfoButton, welcomePage.moreInfoButton) && fr.t.c(this.moreInfo, welcomePage.moreInfo) && fr.t.c(this.goToApplicationButton, welcomePage.goToApplicationButton);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public int hashCode() {
                return (((((((((this.scaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.descriptionRows.hashCode()) * 31) + this.moreInfoButton.hashCode()) * 31) + this.moreInfo.hashCode()) * 31) + this.goToApplicationButton.hashCode();
            }

            public String toString() {
                return "WelcomePage(scaffoldData=" + this.scaffoldData + ", title=" + this.title + ", descriptionRows=" + this.descriptionRows + ", moreInfoButton=" + this.moreInfoButton + ", moreInfo=" + this.moreInfo + ", goToApplicationButton=" + this.goToApplicationButton + ')';
            }
        }
    }
}
