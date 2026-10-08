package n30;

import fr.t;
import java.util.List;
import n50.j0;
import n50.k;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: n30.b, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0017\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b\u001b\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b\u001f\u0010%¨\u0006&"}, d2 = {"Ln30/b;", "", "", "Ln50/k;", "singleCardList", "Ln50/j0;", "singleCardState", "", "animateSizeChange", "Ln30/a;", "cardListAccessibilityData", "fieldIndex", "<init>", "(Ljava/util/List;Ln50/j0;ZLn30/a;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Ln50/j0;", "e", "()Ln50/j0;", "c", "Z", "()Z", "Ln30/a;", "()Ln30/a;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardListData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<k> singleCardList;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final j0 singleCardState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean animateSizeChange;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final CardListAccessibilityData cardListAccessibilityData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Object fieldIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public CardListData(List<? extends k> list, j0 j0Var, boolean z15, CardListAccessibilityData cardListAccessibilityData, Object obj) {
        this.singleCardList = list;
        this.singleCardState = j0Var;
        this.animateSizeChange = z15;
        this.cardListAccessibilityData = cardListAccessibilityData;
        this.fieldIndex = obj;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAnimateSizeChange() {
        return this.animateSizeChange;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CardListAccessibilityData getCardListAccessibilityData() {
        return this.cardListAccessibilityData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object getFieldIndex() {
        return this.fieldIndex;
    }

    public final List<k> d() {
        return this.singleCardList;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final j0 getSingleCardState() {
        return this.singleCardState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardListData)) {
            return false;
        }
        CardListData cardListData = (CardListData) other;
        return t.c(this.singleCardList, cardListData.singleCardList) && t.c(this.singleCardState, cardListData.singleCardState) && this.animateSizeChange == cardListData.animateSizeChange && t.c(this.cardListAccessibilityData, cardListData.cardListAccessibilityData) && t.c(this.fieldIndex, cardListData.fieldIndex);
    }

    public int hashCode() {
        int iHashCode = ((((this.singleCardList.hashCode() * 31) + this.singleCardState.hashCode()) * 31) + Boolean.hashCode(this.animateSizeChange)) * 31;
        CardListAccessibilityData cardListAccessibilityData = this.cardListAccessibilityData;
        int iHashCode2 = (iHashCode + (cardListAccessibilityData == null ? 0 : cardListAccessibilityData.hashCode())) * 31;
        Object obj = this.fieldIndex;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "CardListData(singleCardList=" + this.singleCardList + ", singleCardState=" + this.singleCardState + ", animateSizeChange=" + this.animateSizeChange + ", cardListAccessibilityData=" + this.cardListAccessibilityData + ", fieldIndex=" + this.fieldIndex + ')';
    }

    public /* synthetic */ CardListData(List list, j0 j0Var, boolean z15, CardListAccessibilityData cardListAccessibilityData, Object obj, int i15, fr.k kVar) {
        this(list, (i15 & 2) != 0 ? j0.a.f132074a : j0Var, (i15 & 4) != 0 ? false : z15, (i15 & 8) != 0 ? null : cardListAccessibilityData, (i15 & 16) != 0 ? null : obj);
    }
}
