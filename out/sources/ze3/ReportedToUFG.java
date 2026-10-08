package ze3;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ze3.f, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b$\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b \u0010+R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b)\u0010'R\u001a\u0010\n\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b(\u0010+R\u001a\u0010\u000b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b/\u0010'R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b.\u0010+R\u001a\u0010\r\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b0\u0010'R\u001a\u0010\u000e\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010*\u001a\u0004\b1\u0010+R\u001a\u0010\u000f\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b2\u0010'R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b0\u00103\u001a\u0004\b,\u00104R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b-\u00107¨\u00068"}, d2 = {"Lze3/f;", "", "Li50/a;", "scaffoldData", "Lmx/a;", "title", "damageReportSubtitle", "Ln30/b;", "damageReport", "detailsSubtitle", "detailsCardList", "perpetratorSubtitle", "perpetratorDataCardList", "victimSubtitle", "victimDetailsCardList", "statementDescription", "Ln50/k;", "downloadStatementButton", "Lh30/a;", "fillDataButton", "<init>", "(Li50/a;Lmx/a;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln50/k;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "i", "()Li50/a;", "b", "Lmx/a;", "j", "()Lmx/a;", "c", "d", "Ln30/b;", "()Ln30/b;", "e", "f", "g", "h", "l", "k", "getStatementDescription", "Ln50/k;", "()Ln50/k;", "m", "Lh30/a;", "()Lh30/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReportedToUFG implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BaseScaffoldData scaffoldData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label damageReportSubtitle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final CardListData damageReport;

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
    private final Label statementDescription;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final n50.k downloadStatementButton;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonData fillDataButton;

    public ReportedToUFG(BaseScaffoldData baseScaffoldData, Label label, Label label2, CardListData cardListData, Label label3, CardListData cardListData2, Label label4, CardListData cardListData3, Label label5, CardListData cardListData4, Label label6, n50.k kVar, ButtonData buttonData) {
        this.scaffoldData = baseScaffoldData;
        this.title = label;
        this.damageReportSubtitle = label2;
        this.damageReport = cardListData;
        this.detailsSubtitle = label3;
        this.detailsCardList = cardListData2;
        this.perpetratorSubtitle = label4;
        this.perpetratorDataCardList = cardListData3;
        this.victimSubtitle = label5;
        this.victimDetailsCardList = cardListData4;
        this.statementDescription = label6;
        this.downloadStatementButton = kVar;
        this.fillDataButton = buttonData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CardListData getDamageReport() {
        return this.damageReport;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getDamageReportSubtitle() {
        return this.damageReportSubtitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public CardListData getDetailsCardList() {
        return this.detailsCardList;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public Label getDetailsSubtitle() {
        return this.detailsSubtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final n50.k getDownloadStatementButton() {
        return this.downloadStatementButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportedToUFG)) {
            return false;
        }
        ReportedToUFG reportedToUFG = (ReportedToUFG) other;
        return fr.t.c(this.scaffoldData, reportedToUFG.scaffoldData) && fr.t.c(this.title, reportedToUFG.title) && fr.t.c(this.damageReportSubtitle, reportedToUFG.damageReportSubtitle) && fr.t.c(this.damageReport, reportedToUFG.damageReport) && fr.t.c(this.detailsSubtitle, reportedToUFG.detailsSubtitle) && fr.t.c(this.detailsCardList, reportedToUFG.detailsCardList) && fr.t.c(this.perpetratorSubtitle, reportedToUFG.perpetratorSubtitle) && fr.t.c(this.perpetratorDataCardList, reportedToUFG.perpetratorDataCardList) && fr.t.c(this.victimSubtitle, reportedToUFG.victimSubtitle) && fr.t.c(this.victimDetailsCardList, reportedToUFG.victimDetailsCardList) && fr.t.c(this.statementDescription, reportedToUFG.statementDescription) && fr.t.c(this.downloadStatementButton, reportedToUFG.downloadStatementButton) && fr.t.c(this.fillDataButton, reportedToUFG.fillDataButton);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ButtonData getFillDataButton() {
        return this.fillDataButton;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public CardListData getPerpetratorDataCardList() {
        return this.perpetratorDataCardList;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public Label getPerpetratorSubtitle() {
        return this.perpetratorSubtitle;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((this.scaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.damageReportSubtitle.hashCode()) * 31) + this.damageReport.hashCode()) * 31) + this.detailsSubtitle.hashCode()) * 31) + this.detailsCardList.hashCode()) * 31) + this.perpetratorSubtitle.hashCode()) * 31) + this.perpetratorDataCardList.hashCode()) * 31) + this.victimSubtitle.hashCode()) * 31) + this.victimDetailsCardList.hashCode()) * 31) + this.statementDescription.hashCode()) * 31;
        n50.k kVar = this.downloadStatementButton;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        ButtonData buttonData = this.fillDataButton;
        return iHashCode2 + (buttonData != null ? buttonData.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public BaseScaffoldData getScaffoldData() {
        return this.scaffoldData;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public Label getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public CardListData getVictimDetailsCardList() {
        return this.victimDetailsCardList;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public Label getVictimSubtitle() {
        return this.victimSubtitle;
    }

    public String toString() {
        return "ReportedToUFG(scaffoldData=" + this.scaffoldData + ", title=" + this.title + ", damageReportSubtitle=" + this.damageReportSubtitle + ", damageReport=" + this.damageReport + ", detailsSubtitle=" + this.detailsSubtitle + ", detailsCardList=" + this.detailsCardList + ", perpetratorSubtitle=" + this.perpetratorSubtitle + ", perpetratorDataCardList=" + this.perpetratorDataCardList + ", victimSubtitle=" + this.victimSubtitle + ", victimDetailsCardList=" + this.victimDetailsCardList + ", statementDescription=" + this.statementDescription + ", downloadStatementButton=" + this.downloadStatementButton + ", fillDataButton=" + this.fillDataButton + ')';
    }
}
