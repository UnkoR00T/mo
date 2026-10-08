package cu3;

import i50.BaseScaffoldData;
import j50.SearchBarData;
import k40.EmptyStateData;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcu3/f;", "Ll00/e;", "Lcu3/f$a;", "a", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends l00.e<Data> {

    /* JADX INFO: renamed from: cu3.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b \u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b#\u0010'¨\u0006("}, d2 = {"Lcu3/f$a;", "", "Li50/a;", "baseScaffoldData", "Lj50/e;", "searchState", "Ln30/b;", "cardListData", "Lk40/a;", "emptyStateData", "Lkotlin/Function0;", "Loq/i0;", "onCloseClick", "<init>", "(Li50/a;Lj50/e;Ln30/b;Lk40/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lj50/e;", "e", "()Lj50/e;", "c", "Ln30/b;", "()Ln30/b;", "d", "Lk40/a;", "()Lk40/a;", "Ler/a;", "()Ler/a;", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f38047f = EmptyStateData.f108236d | BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final SearchBarData searchState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData cardListData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final EmptyStateData emptyStateData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        public Data(BaseScaffoldData baseScaffoldData, SearchBarData searchBarData, CardListData cardListData, EmptyStateData emptyStateData, er.a<i0> aVar) {
            this.baseScaffoldData = baseScaffoldData;
            this.searchState = searchBarData;
            this.cardListData = cardListData;
            this.emptyStateData = emptyStateData;
            this.onCloseClick = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final CardListData getCardListData() {
            return this.cardListData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EmptyStateData getEmptyStateData() {
            return this.emptyStateData;
        }

        public final er.a<i0> d() {
            return this.onCloseClick;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final SearchBarData getSearchState() {
            return this.searchState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.searchState, data.searchState) && fr.t.c(this.cardListData, data.cardListData) && fr.t.c(this.emptyStateData, data.emptyStateData) && fr.t.c(this.onCloseClick, data.onCloseClick);
        }

        public int hashCode() {
            return (((((((this.baseScaffoldData.hashCode() * 31) + this.searchState.hashCode()) * 31) + this.cardListData.hashCode()) * 31) + this.emptyStateData.hashCode()) * 31) + this.onCloseClick.hashCode();
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", searchState=" + this.searchState + ", cardListData=" + this.cardListData + ", emptyStateData=" + this.emptyStateData + ", onCloseClick=" + this.onCloseClick + ')';
        }
    }
}
