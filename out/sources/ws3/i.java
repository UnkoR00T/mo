package ws3;

import h30.ButtonData;
import mx.Label;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;
import w30.CheckBoxSingleData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lws3/i;", "Ll00/e;", "Lws3/i$a;", "Li70/n;", "a", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i extends l00.e<a>, i70.n {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lws3/i$a;", "", "b", "a", "Lws3/i$a$a;", "Lws3/i$a$b;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: ws3.i$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b.\u0010'R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b/\u0010-R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u0010'R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b(\u0010-R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b4\u0010'R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b*\u0010-R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010&\u001a\u0004\b7\u0010'R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b8\u0010'R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010&\u001a\u0004\b6\u0010'R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b)\u00109\u001a\u0004\b5\u0010:R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b.\u0010;\u001a\u0004\b3\u0010<R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b0\u0010?R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b2\u0010B¨\u0006C"}, d2 = {"Lws3/i$a$a;", "Lws3/i$a;", "Lmx/a;", "headline", "subtitleVisitData", "Ln30/b;", "itemsVisitData", "subtitleYourData", "itemsYourData", "subtitleCaregiverData", "itemsCaregiverData", "subtitleTranslatorData", "itemsTranslatorData", "nameValue", "surnameValue", "statementSectionTitle", "Lw30/a;", "statementCheckBoxData", "", "shouldScrollToStatementSection", "Lh30/a;", "nextButtonData", "Lkotlin/Function0;", "Loq/i0;", "onResetScrollRequests", "<init>", "(Lmx/a;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Lmx/a;Lmx/a;Lw30/a;ZLh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "b", "m", "c", "Ln30/b;", "d", "()Ln30/b;", "n", "e", "f", "k", "g", "h", "l", "i", "j", "getNameValue", "getSurnameValue", "Lw30/a;", "()Lw30/a;", "Z", "()Z", "o", "Lh30/a;", "()Lh30/a;", "p", "Ler/a;", "()Ler/a;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DisplayedScreenData implements a {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public static final int f214938q = CheckBoxSingleData.f210090f;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label headline;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label subtitleVisitData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData itemsVisitData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label subtitleYourData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData itemsYourData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label subtitleCaregiverData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData itemsCaregiverData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label subtitleTranslatorData;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData itemsTranslatorData;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label nameValue;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label surnameValue;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label statementSectionTitle;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final CheckBoxSingleData statementCheckBoxData;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean shouldScrollToStatementSection;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButtonData;

            /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onResetScrollRequests;

            public DisplayedScreenData(Label label, Label label2, CardListData cardListData, Label label3, CardListData cardListData2, Label label4, CardListData cardListData3, Label label5, CardListData cardListData4, Label label6, Label label7, Label label8, CheckBoxSingleData checkBoxSingleData, boolean z15, ButtonData buttonData, er.a<i0> aVar) {
                this.headline = label;
                this.subtitleVisitData = label2;
                this.itemsVisitData = cardListData;
                this.subtitleYourData = label3;
                this.itemsYourData = cardListData2;
                this.subtitleCaregiverData = label4;
                this.itemsCaregiverData = cardListData3;
                this.subtitleTranslatorData = label5;
                this.itemsTranslatorData = cardListData4;
                this.nameValue = label6;
                this.surnameValue = label7;
                this.statementSectionTitle = label8;
                this.statementCheckBoxData = checkBoxSingleData;
                this.shouldScrollToStatementSection = z15;
                this.nextButtonData = buttonData;
                this.onResetScrollRequests = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Label getHeadline() {
                return this.headline;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final CardListData getItemsCaregiverData() {
                return this.itemsCaregiverData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final CardListData getItemsTranslatorData() {
                return this.itemsTranslatorData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final CardListData getItemsVisitData() {
                return this.itemsVisitData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final CardListData getItemsYourData() {
                return this.itemsYourData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DisplayedScreenData)) {
                    return false;
                }
                DisplayedScreenData displayedScreenData = (DisplayedScreenData) other;
                return fr.t.c(this.headline, displayedScreenData.headline) && fr.t.c(this.subtitleVisitData, displayedScreenData.subtitleVisitData) && fr.t.c(this.itemsVisitData, displayedScreenData.itemsVisitData) && fr.t.c(this.subtitleYourData, displayedScreenData.subtitleYourData) && fr.t.c(this.itemsYourData, displayedScreenData.itemsYourData) && fr.t.c(this.subtitleCaregiverData, displayedScreenData.subtitleCaregiverData) && fr.t.c(this.itemsCaregiverData, displayedScreenData.itemsCaregiverData) && fr.t.c(this.subtitleTranslatorData, displayedScreenData.subtitleTranslatorData) && fr.t.c(this.itemsTranslatorData, displayedScreenData.itemsTranslatorData) && fr.t.c(this.nameValue, displayedScreenData.nameValue) && fr.t.c(this.surnameValue, displayedScreenData.surnameValue) && fr.t.c(this.statementSectionTitle, displayedScreenData.statementSectionTitle) && fr.t.c(this.statementCheckBoxData, displayedScreenData.statementCheckBoxData) && this.shouldScrollToStatementSection == displayedScreenData.shouldScrollToStatementSection && fr.t.c(this.nextButtonData, displayedScreenData.nextButtonData) && fr.t.c(this.onResetScrollRequests, displayedScreenData.onResetScrollRequests);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final ButtonData getNextButtonData() {
                return this.nextButtonData;
            }

            public final er.a<i0> g() {
                return this.onResetScrollRequests;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final boolean getShouldScrollToStatementSection() {
                return this.shouldScrollToStatementSection;
            }

            public int hashCode() {
                return (((((((((((((((((((((((((((((this.headline.hashCode() * 31) + this.subtitleVisitData.hashCode()) * 31) + this.itemsVisitData.hashCode()) * 31) + this.subtitleYourData.hashCode()) * 31) + this.itemsYourData.hashCode()) * 31) + this.subtitleCaregiverData.hashCode()) * 31) + this.itemsCaregiverData.hashCode()) * 31) + this.subtitleTranslatorData.hashCode()) * 31) + this.itemsTranslatorData.hashCode()) * 31) + this.nameValue.hashCode()) * 31) + this.surnameValue.hashCode()) * 31) + this.statementSectionTitle.hashCode()) * 31) + this.statementCheckBoxData.hashCode()) * 31) + Boolean.hashCode(this.shouldScrollToStatementSection)) * 31) + this.nextButtonData.hashCode()) * 31) + this.onResetScrollRequests.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final CheckBoxSingleData getStatementCheckBoxData() {
                return this.statementCheckBoxData;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final Label getStatementSectionTitle() {
                return this.statementSectionTitle;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final Label getSubtitleCaregiverData() {
                return this.subtitleCaregiverData;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final Label getSubtitleTranslatorData() {
                return this.subtitleTranslatorData;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public final Label getSubtitleVisitData() {
                return this.subtitleVisitData;
            }

            /* JADX INFO: renamed from: n, reason: from getter */
            public final Label getSubtitleYourData() {
                return this.subtitleYourData;
            }

            public String toString() {
                return "DisplayedScreenData(headline=" + this.headline + ", subtitleVisitData=" + this.subtitleVisitData + ", itemsVisitData=" + this.itemsVisitData + ", subtitleYourData=" + this.subtitleYourData + ", itemsYourData=" + this.itemsYourData + ", subtitleCaregiverData=" + this.subtitleCaregiverData + ", itemsCaregiverData=" + this.itemsCaregiverData + ", subtitleTranslatorData=" + this.subtitleTranslatorData + ", itemsTranslatorData=" + this.itemsTranslatorData + ", nameValue=" + this.nameValue + ", surnameValue=" + this.surnameValue + ", statementSectionTitle=" + this.statementSectionTitle + ", statementCheckBoxData=" + this.statementCheckBoxData + ", shouldScrollToStatementSection=" + this.shouldScrollToStatementSection + ", nextButtonData=" + this.nextButtonData + ", onResetScrollRequests=" + this.onResetScrollRequests + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lws3/i$a$b;", "Lws3/i$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f214955a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1724258303;
            }

            public String toString() {
                return "Initial";
            }
        }
    }
}
