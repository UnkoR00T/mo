package xy1;

import c30.b;
import fr.t;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: xy1.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b\"\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b \u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b\u0018\u0010$¨\u0006%"}, d2 = {"Lxy1/a;", "", "Lmx/a;", "electionsDateTitle", "Ln30/b;", "electionsDateList", "votingPlaceTitle", "votingPlaceList", "residenceAddressTitle", "residenceAddressList", "Lc30/b;", "alertData", "<init>", "(Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lmx/a;Ln30/b;Lc30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "Ln30/b;", "()Ln30/b;", "g", "d", "f", "e", "Lc30/b;", "()Lc30/b;", "electoralregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ElectoralEventDetailsScreenData {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f222395h = b.f22944i;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label electionsDateTitle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final CardListData electionsDateList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label votingPlaceTitle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final CardListData votingPlaceList;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label residenceAddressTitle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final CardListData residenceAddressList;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final b alertData;

    public ElectoralEventDetailsScreenData(Label label, CardListData cardListData, Label label2, CardListData cardListData2, Label label3, CardListData cardListData3, b bVar) {
        this.electionsDateTitle = label;
        this.electionsDateList = cardListData;
        this.votingPlaceTitle = label2;
        this.votingPlaceList = cardListData2;
        this.residenceAddressTitle = label3;
        this.residenceAddressList = cardListData3;
        this.alertData = bVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getAlertData() {
        return this.alertData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CardListData getElectionsDateList() {
        return this.electionsDateList;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getElectionsDateTitle() {
        return this.electionsDateTitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final CardListData getResidenceAddressList() {
        return this.residenceAddressList;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Label getResidenceAddressTitle() {
        return this.residenceAddressTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ElectoralEventDetailsScreenData)) {
            return false;
        }
        ElectoralEventDetailsScreenData electoralEventDetailsScreenData = (ElectoralEventDetailsScreenData) other;
        return t.c(this.electionsDateTitle, electoralEventDetailsScreenData.electionsDateTitle) && t.c(this.electionsDateList, electoralEventDetailsScreenData.electionsDateList) && t.c(this.votingPlaceTitle, electoralEventDetailsScreenData.votingPlaceTitle) && t.c(this.votingPlaceList, electoralEventDetailsScreenData.votingPlaceList) && t.c(this.residenceAddressTitle, electoralEventDetailsScreenData.residenceAddressTitle) && t.c(this.residenceAddressList, electoralEventDetailsScreenData.residenceAddressList) && t.c(this.alertData, electoralEventDetailsScreenData.alertData);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final CardListData getVotingPlaceList() {
        return this.votingPlaceList;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Label getVotingPlaceTitle() {
        return this.votingPlaceTitle;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.electionsDateTitle.hashCode() * 31) + this.electionsDateList.hashCode()) * 31) + this.votingPlaceTitle.hashCode()) * 31) + this.votingPlaceList.hashCode()) * 31) + this.residenceAddressTitle.hashCode()) * 31;
        CardListData cardListData = this.residenceAddressList;
        int iHashCode2 = (iHashCode + (cardListData == null ? 0 : cardListData.hashCode())) * 31;
        b bVar = this.alertData;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ElectoralEventDetailsScreenData(electionsDateTitle=" + this.electionsDateTitle + ", electionsDateList=" + this.electionsDateList + ", votingPlaceTitle=" + this.votingPlaceTitle + ", votingPlaceList=" + this.votingPlaceList + ", residenceAddressTitle=" + this.residenceAddressTitle + ", residenceAddressList=" + this.residenceAddressList + ", alertData=" + this.alertData + ')';
    }
}
