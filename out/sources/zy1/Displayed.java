package zy1;

import fr.t;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zy1.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u0016\u0010\u001d¨\u0006 "}, d2 = {"Lzy1/a;", "", "Lmx/a;", "displayElectionsAreasTitle", "Ln30/b;", "displayElectionsAreasList", "displayStatementsTitle", "displayStatementsList", "displayCitizenDataTitle", "displayCitizenDataList", "<init>", "(Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "d", "()Lmx/a;", "b", "Ln30/b;", "c", "()Ln30/b;", "f", "e", "electoralregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Displayed {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label displayElectionsAreasTitle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final CardListData displayElectionsAreasList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label displayStatementsTitle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final CardListData displayStatementsList;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label displayCitizenDataTitle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final CardListData displayCitizenDataList;

    public Displayed(Label label, CardListData cardListData, Label label2, CardListData cardListData2, Label label3, CardListData cardListData3) {
        this.displayElectionsAreasTitle = label;
        this.displayElectionsAreasList = cardListData;
        this.displayStatementsTitle = label2;
        this.displayStatementsList = cardListData2;
        this.displayCitizenDataTitle = label3;
        this.displayCitizenDataList = cardListData3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CardListData getDisplayCitizenDataList() {
        return this.displayCitizenDataList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getDisplayCitizenDataTitle() {
        return this.displayCitizenDataTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final CardListData getDisplayElectionsAreasList() {
        return this.displayElectionsAreasList;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getDisplayElectionsAreasTitle() {
        return this.displayElectionsAreasTitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final CardListData getDisplayStatementsList() {
        return this.displayStatementsList;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Displayed)) {
            return false;
        }
        Displayed displayed = (Displayed) other;
        return t.c(this.displayElectionsAreasTitle, displayed.displayElectionsAreasTitle) && t.c(this.displayElectionsAreasList, displayed.displayElectionsAreasList) && t.c(this.displayStatementsTitle, displayed.displayStatementsTitle) && t.c(this.displayStatementsList, displayed.displayStatementsList) && t.c(this.displayCitizenDataTitle, displayed.displayCitizenDataTitle) && t.c(this.displayCitizenDataList, displayed.displayCitizenDataList);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Label getDisplayStatementsTitle() {
        return this.displayStatementsTitle;
    }

    public int hashCode() {
        int iHashCode = this.displayElectionsAreasTitle.hashCode() * 31;
        CardListData cardListData = this.displayElectionsAreasList;
        int iHashCode2 = (((iHashCode + (cardListData == null ? 0 : cardListData.hashCode())) * 31) + this.displayStatementsTitle.hashCode()) * 31;
        CardListData cardListData2 = this.displayStatementsList;
        return ((((iHashCode2 + (cardListData2 != null ? cardListData2.hashCode() : 0)) * 31) + this.displayCitizenDataTitle.hashCode()) * 31) + this.displayCitizenDataList.hashCode();
    }

    public String toString() {
        return "Displayed(displayElectionsAreasTitle=" + this.displayElectionsAreasTitle + ", displayElectionsAreasList=" + this.displayElectionsAreasList + ", displayStatementsTitle=" + this.displayStatementsTitle + ", displayStatementsList=" + this.displayStatementsList + ", displayCitizenDataTitle=" + this.displayCitizenDataTitle + ", displayCitizenDataList=" + this.displayCitizenDataList + ')';
    }
}
