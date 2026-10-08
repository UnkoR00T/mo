package t31;

import fr.t;
import java.util.Iterator;
import java.util.List;
import k40.EmptyStateData;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: t31.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u001d"}, d2 = {"Lt31/b;", "", "Lk40/a;", "noSearchResultsEmptyStateData", "", "Lt31/b$a;", "cardGroupsData", "<init>", "(Lk40/a;Ljava/util/List;)V", "", "d", "()Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lk40/a;", "c", "()Lk40/a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "allItemsCount", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SearchScreenModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final EmptyStateData noSearchResultsEmptyStateData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CardGroup> cardGroupsData;

    /* JADX INFO: renamed from: t31.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lt31/b$a;", "", "Lmx/a;", "title", "Ln30/b;", "cardListData", "<init>", "(Lmx/a;Ln30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "Ln30/b;", "()Ln30/b;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardGroup {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData cardListData;

        public CardGroup(Label label, CardListData cardListData) {
            this.title = label;
            this.cardListData = cardListData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CardListData getCardListData() {
            return this.cardListData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardGroup)) {
                return false;
            }
            CardGroup cardGroup = (CardGroup) other;
            return t.c(this.title, cardGroup.title) && t.c(this.cardListData, cardGroup.cardListData);
        }

        public int hashCode() {
            Label label = this.title;
            return ((label == null ? 0 : label.hashCode()) * 31) + this.cardListData.hashCode();
        }

        public String toString() {
            return "CardGroup(title=" + this.title + ", cardListData=" + this.cardListData + ')';
        }
    }

    public SearchScreenModel(EmptyStateData emptyStateData, List<CardGroup> list) {
        this.noSearchResultsEmptyStateData = emptyStateData;
        this.cardGroupsData = list;
    }

    public final int a() {
        Iterator<T> it = this.cardGroupsData.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((CardGroup) it.next()).getCardListData().d().size();
        }
        return size;
    }

    public final List<CardGroup> b() {
        return this.cardGroupsData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EmptyStateData getNoSearchResultsEmptyStateData() {
        return this.noSearchResultsEmptyStateData;
    }

    public final boolean d() {
        Iterator<T> it = this.cardGroupsData.iterator();
        while (it.hasNext()) {
            if (!((CardGroup) it.next()).getCardListData().d().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchScreenModel)) {
            return false;
        }
        SearchScreenModel searchScreenModel = (SearchScreenModel) other;
        return t.c(this.noSearchResultsEmptyStateData, searchScreenModel.noSearchResultsEmptyStateData) && t.c(this.cardGroupsData, searchScreenModel.cardGroupsData);
    }

    public int hashCode() {
        return (this.noSearchResultsEmptyStateData.hashCode() * 31) + this.cardGroupsData.hashCode();
    }

    public String toString() {
        return "SearchScreenModel(noSearchResultsEmptyStateData=" + this.noSearchResultsEmptyStateData + ", cardGroupsData=" + this.cardGroupsData + ')';
    }
}
