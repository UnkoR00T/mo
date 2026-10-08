package dh3;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;
import w30.CheckBoxSingleData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ldh3/c;", "Ll00/e;", "Ldh3/c$a;", "a", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<Data> {

    /* JADX INFO: renamed from: dh3.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010)\u001a\u0004\b$\u0010*R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b4\u0010.R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b5\u00103R\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b6\u0010.R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00103R\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b9\u0010,\u001a\u0004\b:\u0010.R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b+\u0010<R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b-\u0010=\u001a\u0004\b/\u0010>R\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b8\u0010=\u001a\u0004\b7\u0010>R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b6\u0010?\u001a\u0004\b9\u0010@¨\u0006A"}, d2 = {"Ldh3/c$a;", "", "Li50/a;", "baseScaffoldData", "Lc30/b;", "alertDataInfoTop", "alertDataInfoBottom", "Lmx/a;", "title", "detailsSubtitle", "Ln30/b;", "detailsCardList", "perpetratorSubtitle", "perpetratorDataCardList", "victimSubtitle", "victimDetailsCardList", "statementSubtitle", "Lw30/a;", "checkBoxData", "Lh30/a;", "confirmAndSignButtonData", "rejectDataButton", "Ldh3/b$a;", "scrollToStatement", "<init>", "(Li50/a;Lc30/b;Lc30/b;Lmx/a;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Lw30/a;Lh30/a;Lh30/a;Ldh3/b$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "c", "()Li50/a;", "b", "Lc30/b;", "()Lc30/b;", "d", "Lmx/a;", "m", "()Lmx/a;", "e", "g", "f", "Ln30/b;", "()Ln30/b;", "i", "h", "o", "j", "n", "k", "l", "Lw30/a;", "()Lw30/a;", "Lh30/a;", "()Lh30/a;", "Ldh3/b$a;", "()Ldh3/b$a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f42704p;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final c30.b alertDataInfoTop;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final c30.b alertDataInfoBottom;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label detailsSubtitle;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData detailsCardList;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label perpetratorSubtitle;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData perpetratorDataCardList;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label victimSubtitle;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData victimDetailsCardList;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label statementSubtitle;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final CheckBoxSingleData checkBoxData;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData confirmAndSignButtonData;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData rejectDataButton;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final State.a scrollToStatement;

        static {
            int i15 = CheckBoxSingleData.f210090f;
            int i16 = c30.b.f22944i;
            f42704p = i15 | i16 | i16 | BaseScaffoldData.f89350g;
        }

        public Data(BaseScaffoldData baseScaffoldData, c30.b bVar, c30.b bVar2, Label label, Label label2, CardListData cardListData, Label label3, CardListData cardListData2, Label label4, CardListData cardListData3, Label label5, CheckBoxSingleData checkBoxSingleData, ButtonData buttonData, ButtonData buttonData2, State.a aVar) {
            this.baseScaffoldData = baseScaffoldData;
            this.alertDataInfoTop = bVar;
            this.alertDataInfoBottom = bVar2;
            this.title = label;
            this.detailsSubtitle = label2;
            this.detailsCardList = cardListData;
            this.perpetratorSubtitle = label3;
            this.perpetratorDataCardList = cardListData2;
            this.victimSubtitle = label4;
            this.victimDetailsCardList = cardListData3;
            this.statementSubtitle = label5;
            this.checkBoxData = checkBoxSingleData;
            this.confirmAndSignButtonData = buttonData;
            this.rejectDataButton = buttonData2;
            this.scrollToStatement = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c30.b getAlertDataInfoBottom() {
            return this.alertDataInfoBottom;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final c30.b getAlertDataInfoTop() {
            return this.alertDataInfoTop;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final CheckBoxSingleData getCheckBoxData() {
            return this.checkBoxData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ButtonData getConfirmAndSignButtonData() {
            return this.confirmAndSignButtonData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.alertDataInfoTop, data.alertDataInfoTop) && fr.t.c(this.alertDataInfoBottom, data.alertDataInfoBottom) && fr.t.c(this.title, data.title) && fr.t.c(this.detailsSubtitle, data.detailsSubtitle) && fr.t.c(this.detailsCardList, data.detailsCardList) && fr.t.c(this.perpetratorSubtitle, data.perpetratorSubtitle) && fr.t.c(this.perpetratorDataCardList, data.perpetratorDataCardList) && fr.t.c(this.victimSubtitle, data.victimSubtitle) && fr.t.c(this.victimDetailsCardList, data.victimDetailsCardList) && fr.t.c(this.statementSubtitle, data.statementSubtitle) && fr.t.c(this.checkBoxData, data.checkBoxData) && fr.t.c(this.confirmAndSignButtonData, data.confirmAndSignButtonData) && fr.t.c(this.rejectDataButton, data.rejectDataButton) && fr.t.c(this.scrollToStatement, data.scrollToStatement);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final CardListData getDetailsCardList() {
            return this.detailsCardList;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Label getDetailsSubtitle() {
            return this.detailsSubtitle;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final CardListData getPerpetratorDataCardList() {
            return this.perpetratorDataCardList;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((this.baseScaffoldData.hashCode() * 31) + this.alertDataInfoTop.hashCode()) * 31) + this.alertDataInfoBottom.hashCode()) * 31) + this.title.hashCode()) * 31) + this.detailsSubtitle.hashCode()) * 31) + this.detailsCardList.hashCode()) * 31) + this.perpetratorSubtitle.hashCode()) * 31) + this.perpetratorDataCardList.hashCode()) * 31) + this.victimSubtitle.hashCode()) * 31) + this.victimDetailsCardList.hashCode()) * 31) + this.statementSubtitle.hashCode()) * 31) + this.checkBoxData.hashCode()) * 31) + this.confirmAndSignButtonData.hashCode()) * 31) + this.rejectDataButton.hashCode()) * 31) + this.scrollToStatement.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final Label getPerpetratorSubtitle() {
            return this.perpetratorSubtitle;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final ButtonData getRejectDataButton() {
            return this.rejectDataButton;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final State.a getScrollToStatement() {
            return this.scrollToStatement;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final Label getStatementSubtitle() {
            return this.statementSubtitle;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final CardListData getVictimDetailsCardList() {
            return this.victimDetailsCardList;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final Label getVictimSubtitle() {
            return this.victimSubtitle;
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", alertDataInfoTop=" + this.alertDataInfoTop + ", alertDataInfoBottom=" + this.alertDataInfoBottom + ", title=" + this.title + ", detailsSubtitle=" + this.detailsSubtitle + ", detailsCardList=" + this.detailsCardList + ", perpetratorSubtitle=" + this.perpetratorSubtitle + ", perpetratorDataCardList=" + this.perpetratorDataCardList + ", victimSubtitle=" + this.victimSubtitle + ", victimDetailsCardList=" + this.victimDetailsCardList + ", statementSubtitle=" + this.statementSubtitle + ", checkBoxData=" + this.checkBoxData + ", confirmAndSignButtonData=" + this.confirmAndSignButtonData + ", rejectDataButton=" + this.rejectDataButton + ", scrollToStatement=" + this.scrollToStatement + ')';
        }
    }
}
