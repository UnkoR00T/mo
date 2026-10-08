package c51;

import g30.ModalBottomSheetData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;
import q40.IconPageData;
import w30.CheckBoxSingleData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lc51/d;", "Ll00/e;", "Lc51/d$a;", "a", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lc51/d$a;", "", "c", "a", "b", "Lc51/d$a$a;", "Lc51/d$a$b;", "Lc51/d$a$c;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: c51.d$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lc51/d$a$a;", "Lc51/d$a;", "Li50/a;", "baseScaffoldData", "Lq40/g;", "Loq/i0;", "iconPageData", "<init>", "(Li50/a;Lq40/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lq40/g;", "()Lq40/g;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Empty implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f23563c = IconPageData.f164667h | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final IconPageData<oq.i0, oq.i0> iconPageData;

            public Empty(BaseScaffoldData baseScaffoldData, IconPageData<oq.i0, oq.i0> iconPageData) {
                this.baseScaffoldData = baseScaffoldData;
                this.iconPageData = iconPageData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            public final IconPageData<oq.i0, oq.i0> b() {
                return this.iconPageData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Empty)) {
                    return false;
                }
                Empty empty = (Empty) other;
                return fr.t.c(this.baseScaffoldData, empty.baseScaffoldData) && fr.t.c(this.iconPageData, empty.iconPageData);
            }

            public int hashCode() {
                return (this.baseScaffoldData.hashCode() * 31) + this.iconPageData.hashCode();
            }

            public String toString() {
                return "Empty(baseScaffoldData=" + this.baseScaffoldData + ", iconPageData=" + this.iconPageData + ')';
            }
        }

        /* JADX INFO: renamed from: c51.d$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b5\u00100R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b+\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b-\u0010BR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b>\u0010=\u001a\u0004\b1\u0010?R\u0017\u0010\u0014\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b7\u0010:\u001a\u0004\b&\u0010;R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b5\u0010:\u001a\u0004\bC\u0010;R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b/\u0010D\u001a\u0004\b<\u0010ER\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\bF\u0010D\u001a\u0004\b@\u0010E¨\u0006G"}, d2 = {"Lc51/d$a$b;", "Lc51/d$a;", "Li50/a;", "baseScaffoldData", "Lg30/n;", "modalBottomSheetData", "Lmx/a;", "title", "Ln30/b;", "cardListData", "statementTitle", "Lw30/a;", "statementCheckBox", "Lh30/a;", "nextButtonData", "", "shouldScrollToStatementSection", "Lv50/c;", "bottomSheetInputData", "bottomSheetInputShouldBeFocused", "addSecondNameButtonData", "addNextNameButtonData", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onResetScrollRequests", "<init>", "(Li50/a;Lg30/n;Lmx/a;Ln30/b;Lmx/a;Lw30/a;Lh30/a;ZLv50/c;ZLh30/a;Lh30/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lg30/n;", "f", "()Lg30/n;", "c", "Lmx/a;", "m", "()Lmx/a;", "d", "Ln30/b;", "e", "()Ln30/b;", "l", "Lw30/a;", "k", "()Lw30/a;", "g", "Lh30/a;", "()Lh30/a;", "h", "Z", "j", "()Z", "i", "Lv50/c;", "()Lv50/c;", "getAddNextNameButtonData", "Ler/a;", "()Ler/a;", "n", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public static final int f23566o = ((v50.c.f203957t | CheckBoxSingleData.f210090f) | ModalBottomSheetData.f70192e) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final ModalBottomSheetData modalBottomSheetData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData cardListData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label statementTitle;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final CheckBoxSingleData statementCheckBox;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButtonData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean shouldScrollToStatementSection;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final v50.c bottomSheetInputData;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean bottomSheetInputShouldBeFocused;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData addSecondNameButtonData;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData addNextNameButtonData;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBack;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onResetScrollRequests;

            public Initialized(BaseScaffoldData baseScaffoldData, ModalBottomSheetData modalBottomSheetData, Label label, CardListData cardListData, Label label2, CheckBoxSingleData checkBoxSingleData, ButtonData buttonData, boolean z15, v50.c cVar, boolean z16, ButtonData buttonData2, ButtonData buttonData3, er.a<oq.i0> aVar, er.a<oq.i0> aVar2) {
                this.baseScaffoldData = baseScaffoldData;
                this.modalBottomSheetData = modalBottomSheetData;
                this.title = label;
                this.cardListData = cardListData;
                this.statementTitle = label2;
                this.statementCheckBox = checkBoxSingleData;
                this.nextButtonData = buttonData;
                this.shouldScrollToStatementSection = z15;
                this.bottomSheetInputData = cVar;
                this.bottomSheetInputShouldBeFocused = z16;
                this.addSecondNameButtonData = buttonData2;
                this.addNextNameButtonData = buttonData3;
                this.onBack = aVar;
                this.onResetScrollRequests = aVar2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ButtonData getAddSecondNameButtonData() {
                return this.addSecondNameButtonData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final v50.c getBottomSheetInputData() {
                return this.bottomSheetInputData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final boolean getBottomSheetInputShouldBeFocused() {
                return this.bottomSheetInputShouldBeFocused;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final CardListData getCardListData() {
                return this.cardListData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.modalBottomSheetData, initialized.modalBottomSheetData) && fr.t.c(this.title, initialized.title) && fr.t.c(this.cardListData, initialized.cardListData) && fr.t.c(this.statementTitle, initialized.statementTitle) && fr.t.c(this.statementCheckBox, initialized.statementCheckBox) && fr.t.c(this.nextButtonData, initialized.nextButtonData) && this.shouldScrollToStatementSection == initialized.shouldScrollToStatementSection && fr.t.c(this.bottomSheetInputData, initialized.bottomSheetInputData) && this.bottomSheetInputShouldBeFocused == initialized.bottomSheetInputShouldBeFocused && fr.t.c(this.addSecondNameButtonData, initialized.addSecondNameButtonData) && fr.t.c(this.addNextNameButtonData, initialized.addNextNameButtonData) && fr.t.c(this.onBack, initialized.onBack) && fr.t.c(this.onResetScrollRequests, initialized.onResetScrollRequests);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final ModalBottomSheetData getModalBottomSheetData() {
                return this.modalBottomSheetData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final ButtonData getNextButtonData() {
                return this.nextButtonData;
            }

            public final er.a<oq.i0> h() {
                return this.onBack;
            }

            public int hashCode() {
                return (((((((((((((((((((((((((this.baseScaffoldData.hashCode() * 31) + this.modalBottomSheetData.hashCode()) * 31) + this.title.hashCode()) * 31) + this.cardListData.hashCode()) * 31) + this.statementTitle.hashCode()) * 31) + this.statementCheckBox.hashCode()) * 31) + this.nextButtonData.hashCode()) * 31) + Boolean.hashCode(this.shouldScrollToStatementSection)) * 31) + this.bottomSheetInputData.hashCode()) * 31) + Boolean.hashCode(this.bottomSheetInputShouldBeFocused)) * 31) + this.addSecondNameButtonData.hashCode()) * 31) + this.addNextNameButtonData.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onResetScrollRequests.hashCode();
            }

            public final er.a<oq.i0> i() {
                return this.onResetScrollRequests;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final boolean getShouldScrollToStatementSection() {
                return this.shouldScrollToStatementSection;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final CheckBoxSingleData getStatementCheckBox() {
                return this.statementCheckBox;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final Label getStatementTitle() {
                return this.statementTitle;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", modalBottomSheetData=" + this.modalBottomSheetData + ", title=" + this.title + ", cardListData=" + this.cardListData + ", statementTitle=" + this.statementTitle + ", statementCheckBox=" + this.statementCheckBox + ", nextButtonData=" + this.nextButtonData + ", shouldScrollToStatementSection=" + this.shouldScrollToStatementSection + ", bottomSheetInputData=" + this.bottomSheetInputData + ", bottomSheetInputShouldBeFocused=" + this.bottomSheetInputShouldBeFocused + ", addSecondNameButtonData=" + this.addSecondNameButtonData + ", addNextNameButtonData=" + this.addNextNameButtonData + ", onBack=" + this.onBack + ", onResetScrollRequests=" + this.onResetScrollRequests + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lc51/d$a$c;", "Lc51/d$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f23581a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -2018972306;
            }

            public String toString() {
                return "Loading";
            }
        }
    }
}
