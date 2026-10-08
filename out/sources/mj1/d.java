package mj1;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;
import w30.CheckBoxSingleData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lmj1/d;", "Ll00/e;", "Lmj1/d$a;", "a", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lmj1/d$a;", "", "b", "a", "Lmj1/d$a$a;", "Lmj1/d$a$b;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: mj1.d$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lmj1/d$a$a;", "Lmj1/d$a;", "Lhb4/c;", "error", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c error;

            public Error(hb4.c cVar) {
                this.error = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getError() {
                return this.error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.error, ((Error) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Error(error=" + this.error + ')';
            }
        }

        /* JADX INFO: renamed from: mj1.d$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b.\u00101\u001a\u0004\b4\u00103R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b9\u00107R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u00101\u001a\u0004\b,\u00103R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u00101\u001a\u0004\b*\u00103R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b0\u0010;R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b&\u0010>R\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b?\u00101\u001a\u0004\b?\u00103R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b4\u0010@\u001a\u0004\b<\u0010AR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b2\u0010B\u001a\u0004\b8\u0010C¨\u0006D"}, d2 = {"Lmj1/d$a$b;", "Lmj1/d$a;", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "onPointerTouch", "Li50/a;", "baseScaffoldData", "Lmx/a;", "yourContactDetailsSubtitle", "yourContactDetailsDescription", "Lv50/c;", "emailInputData", "phoneInputData", "addChildrenSubtitle", "addChildrenDescription", "Ln30/b;", "addedChildrenCardList", "Ln50/k;", "addChildrenCardButton", "statementSubtitle", "Lw30/a;", "statementCheckBoxSingleData", "Lh30/a;", "nextButtonData", "<init>", "(Ler/a;Ler/a;Li50/a;Lmx/a;Lmx/a;Lv50/c;Lv50/c;Lmx/a;Lmx/a;Ln30/b;Ln50/k;Lmx/a;Lw30/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "h", "()Ler/a;", "b", "i", "c", "Li50/a;", "e", "()Li50/a;", "d", "Lmx/a;", "n", "()Lmx/a;", "m", "f", "Lv50/c;", "()Lv50/c;", "g", "j", "Ln30/b;", "()Ln30/b;", "k", "Ln50/k;", "()Ln50/k;", "l", "Lw30/a;", "()Lw30/a;", "Lh30/a;", "()Lh30/a;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackClick;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onPointerTouch;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label yourContactDetailsSubtitle;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label yourContactDetailsDescription;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final v50.c emailInputData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final v50.c phoneInputData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label addChildrenSubtitle;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label addChildrenDescription;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData addedChildrenCardList;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k addChildrenCardButton;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label statementSubtitle;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final CheckBoxSingleData statementCheckBoxSingleData;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButtonData;

            public Initialized(er.a<oq.i0> aVar, er.a<oq.i0> aVar2, BaseScaffoldData baseScaffoldData, Label label, Label label2, v50.c cVar, v50.c cVar2, Label label3, Label label4, CardListData cardListData, n50.k kVar, Label label5, CheckBoxSingleData checkBoxSingleData, ButtonData buttonData) {
                this.onBackClick = aVar;
                this.onPointerTouch = aVar2;
                this.baseScaffoldData = baseScaffoldData;
                this.yourContactDetailsSubtitle = label;
                this.yourContactDetailsDescription = label2;
                this.emailInputData = cVar;
                this.phoneInputData = cVar2;
                this.addChildrenSubtitle = label3;
                this.addChildrenDescription = label4;
                this.addedChildrenCardList = cardListData;
                this.addChildrenCardButton = kVar;
                this.statementSubtitle = label5;
                this.statementCheckBoxSingleData = checkBoxSingleData;
                this.nextButtonData = buttonData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final n50.k getAddChildrenCardButton() {
                return this.addChildrenCardButton;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getAddChildrenDescription() {
                return this.addChildrenDescription;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getAddChildrenSubtitle() {
                return this.addChildrenSubtitle;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final CardListData getAddedChildrenCardList() {
                return this.addedChildrenCardList;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.onBackClick, initialized.onBackClick) && fr.t.c(this.onPointerTouch, initialized.onPointerTouch) && fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.yourContactDetailsSubtitle, initialized.yourContactDetailsSubtitle) && fr.t.c(this.yourContactDetailsDescription, initialized.yourContactDetailsDescription) && fr.t.c(this.emailInputData, initialized.emailInputData) && fr.t.c(this.phoneInputData, initialized.phoneInputData) && fr.t.c(this.addChildrenSubtitle, initialized.addChildrenSubtitle) && fr.t.c(this.addChildrenDescription, initialized.addChildrenDescription) && fr.t.c(this.addedChildrenCardList, initialized.addedChildrenCardList) && fr.t.c(this.addChildrenCardButton, initialized.addChildrenCardButton) && fr.t.c(this.statementSubtitle, initialized.statementSubtitle) && fr.t.c(this.statementCheckBoxSingleData, initialized.statementCheckBoxSingleData) && fr.t.c(this.nextButtonData, initialized.nextButtonData);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final v50.c getEmailInputData() {
                return this.emailInputData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final ButtonData getNextButtonData() {
                return this.nextButtonData;
            }

            public final er.a<oq.i0> h() {
                return this.onBackClick;
            }

            public int hashCode() {
                return (((((((((((((((((((((((((this.onBackClick.hashCode() * 31) + this.onPointerTouch.hashCode()) * 31) + this.baseScaffoldData.hashCode()) * 31) + this.yourContactDetailsSubtitle.hashCode()) * 31) + this.yourContactDetailsDescription.hashCode()) * 31) + this.emailInputData.hashCode()) * 31) + this.phoneInputData.hashCode()) * 31) + this.addChildrenSubtitle.hashCode()) * 31) + this.addChildrenDescription.hashCode()) * 31) + this.addedChildrenCardList.hashCode()) * 31) + this.addChildrenCardButton.hashCode()) * 31) + this.statementSubtitle.hashCode()) * 31) + this.statementCheckBoxSingleData.hashCode()) * 31) + this.nextButtonData.hashCode();
            }

            public final er.a<oq.i0> i() {
                return this.onPointerTouch;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final v50.c getPhoneInputData() {
                return this.phoneInputData;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final CheckBoxSingleData getStatementCheckBoxSingleData() {
                return this.statementCheckBoxSingleData;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final Label getStatementSubtitle() {
                return this.statementSubtitle;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public final Label getYourContactDetailsDescription() {
                return this.yourContactDetailsDescription;
            }

            /* JADX INFO: renamed from: n, reason: from getter */
            public final Label getYourContactDetailsSubtitle() {
                return this.yourContactDetailsSubtitle;
            }

            public String toString() {
                return "Initialized(onBackClick=" + this.onBackClick + ", onPointerTouch=" + this.onPointerTouch + ", baseScaffoldData=" + this.baseScaffoldData + ", yourContactDetailsSubtitle=" + this.yourContactDetailsSubtitle + ", yourContactDetailsDescription=" + this.yourContactDetailsDescription + ", emailInputData=" + this.emailInputData + ", phoneInputData=" + this.phoneInputData + ", addChildrenSubtitle=" + this.addChildrenSubtitle + ", addChildrenDescription=" + this.addChildrenDescription + ", addedChildrenCardList=" + this.addedChildrenCardList + ", addChildrenCardButton=" + this.addChildrenCardButton + ", statementSubtitle=" + this.statementSubtitle + ", statementCheckBoxSingleData=" + this.statementCheckBoxSingleData + ", nextButtonData=" + this.nextButtonData + ')';
            }
        }
    }
}
