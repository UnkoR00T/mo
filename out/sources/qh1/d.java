package qh1;

import i50.BaseScaffoldData;
import j50.SearchBarData;
import java.util.List;
import k40.EmptyStateData;
import mx.Label;
import n30.CardListData;
import o50.SmallCardData;
import p071kotlin.Metadata;
import rh1.SearchRowListData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lqh1/d;", "Ll00/e;", "Lqh1/d$a;", "a", "b", "c", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lqh1/d$a;", "", "c", "b", "a", "Lqh1/d$a$a;", "Lqh1/d$a$b;", "Lqh1/d$a$c;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: qh1.d$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lqh1/d$a$a;", "Lqh1/d$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(hb4.c cVar) {
                this.errorVMS = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getErrorVMS() {
                return this.errorVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.errorVMS, ((Error) other).errorVMS);
            }

            public int hashCode() {
                return this.errorVMS.hashCode();
            }

            public String toString() {
                return "Error(errorVMS=" + this.errorVMS + ')';
            }
        }

        /* JADX INFO: renamed from: qh1.d$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00132\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b$\u0010*R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b4\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b7\u00109\u001a\u0004\b+\u0010:R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b-\u0010;\u001a\u0004\b/\u0010<R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b1\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b>\u0010=\u001a\u0004\b@\u0010?R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b(\u0010B¨\u0006C"}, d2 = {"Lqh1/d$a$b;", "Lqh1/d$a;", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Li50/a;", "baseScaffoldData", "Lqh1/d$b;", "sectionNewsData", "Lqh1/d$c;", "sectionPopularData", "Lj50/e;", "searchBarData", "Ln30/b;", "searchItems", "Lrh1/a;", "lastSearchedItemsData", "Lk40/a;", "noResultsEmptyStateData", "", "isLoading", "isQueryEmpty", "Lcb4/i;", "dialogVMS", "<init>", "(Ler/a;Li50/a;Lqh1/d$b;Lqh1/d$c;Lj50/e;Ln30/b;Lrh1/a;Lk40/a;ZZLcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "e", "()Ler/a;", "b", "Li50/a;", "()Li50/a;", "c", "Lqh1/d$b;", "h", "()Lqh1/d$b;", "d", "Lqh1/d$c;", "i", "()Lqh1/d$c;", "Lj50/e;", "f", "()Lj50/e;", "Ln30/b;", "g", "()Ln30/b;", "Lrh1/a;", "()Lrh1/a;", "Lk40/a;", "()Lk40/a;", "Z", "j", "()Z", "k", "Lcb4/i;", "()Lcb4/i;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBack;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final SectionNewsData sectionNewsData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final SectionPopularData sectionPopularData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final SearchBarData searchBarData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData searchItems;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final SearchRowListData lastSearchedItemsData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final EmptyStateData noResultsEmptyStateData;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isLoading;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isQueryEmpty;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMS;

            public Initialized(er.a<oq.i0> aVar, BaseScaffoldData baseScaffoldData, SectionNewsData sectionNewsData, SectionPopularData sectionPopularData, SearchBarData searchBarData, CardListData cardListData, SearchRowListData searchRowListData, EmptyStateData emptyStateData, boolean z15, boolean z16, cb4.i iVar) {
                this.onBack = aVar;
                this.baseScaffoldData = baseScaffoldData;
                this.sectionNewsData = sectionNewsData;
                this.sectionPopularData = sectionPopularData;
                this.searchBarData = searchBarData;
                this.searchItems = cardListData;
                this.lastSearchedItemsData = searchRowListData;
                this.noResultsEmptyStateData = emptyStateData;
                this.isLoading = z15;
                this.isQueryEmpty = z16;
                this.dialogVMS = iVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final cb4.i getDialogVMS() {
                return this.dialogVMS;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final SearchRowListData getLastSearchedItemsData() {
                return this.lastSearchedItemsData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final EmptyStateData getNoResultsEmptyStateData() {
                return this.noResultsEmptyStateData;
            }

            public final er.a<oq.i0> e() {
                return this.onBack;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.onBack, initialized.onBack) && fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.sectionNewsData, initialized.sectionNewsData) && fr.t.c(this.sectionPopularData, initialized.sectionPopularData) && fr.t.c(this.searchBarData, initialized.searchBarData) && fr.t.c(this.searchItems, initialized.searchItems) && fr.t.c(this.lastSearchedItemsData, initialized.lastSearchedItemsData) && fr.t.c(this.noResultsEmptyStateData, initialized.noResultsEmptyStateData) && this.isLoading == initialized.isLoading && this.isQueryEmpty == initialized.isQueryEmpty && fr.t.c(this.dialogVMS, initialized.dialogVMS);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final SearchBarData getSearchBarData() {
                return this.searchBarData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final CardListData getSearchItems() {
                return this.searchItems;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final SectionNewsData getSectionNewsData() {
                return this.sectionNewsData;
            }

            public int hashCode() {
                int iHashCode = ((this.onBack.hashCode() * 31) + this.baseScaffoldData.hashCode()) * 31;
                SectionNewsData sectionNewsData = this.sectionNewsData;
                int iHashCode2 = (iHashCode + (sectionNewsData == null ? 0 : sectionNewsData.hashCode())) * 31;
                SectionPopularData sectionPopularData = this.sectionPopularData;
                int iHashCode3 = (((((iHashCode2 + (sectionPopularData == null ? 0 : sectionPopularData.hashCode())) * 31) + this.searchBarData.hashCode()) * 31) + this.searchItems.hashCode()) * 31;
                SearchRowListData searchRowListData = this.lastSearchedItemsData;
                int iHashCode4 = (((((((iHashCode3 + (searchRowListData == null ? 0 : searchRowListData.hashCode())) * 31) + this.noResultsEmptyStateData.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isQueryEmpty)) * 31;
                cb4.i iVar = this.dialogVMS;
                return iHashCode4 + (iVar != null ? iVar.hashCode() : 0);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final SectionPopularData getSectionPopularData() {
                return this.sectionPopularData;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final boolean getIsLoading() {
                return this.isLoading;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final boolean getIsQueryEmpty() {
                return this.isQueryEmpty;
            }

            public String toString() {
                return "Initialized(onBack=" + this.onBack + ", baseScaffoldData=" + this.baseScaffoldData + ", sectionNewsData=" + this.sectionNewsData + ", sectionPopularData=" + this.sectionPopularData + ", searchBarData=" + this.searchBarData + ", searchItems=" + this.searchItems + ", lastSearchedItemsData=" + this.lastSearchedItemsData + ", noResultsEmptyStateData=" + this.noResultsEmptyStateData + ", isLoading=" + this.isLoading + ", isQueryEmpty=" + this.isQueryEmpty + ", dialogVMS=" + this.dialogVMS + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lqh1/d$a$c;", "Lqh1/d$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f166498a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 652376370;
            }

            public String toString() {
                return "Loading";
            }
        }
    }

    /* JADX INFO: renamed from: qh1.d$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lqh1/d$b;", "", "Lmx/a;", "title", "", "Lo50/a;", "listSmallCardData", "<init>", "(Lmx/a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "Ljava/util/List;", "()Ljava/util/List;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SectionNewsData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<SmallCardData> listSmallCardData;

        public SectionNewsData(Label label, List<SmallCardData> list) {
            this.title = label;
            this.listSmallCardData = list;
        }

        public final List<SmallCardData> a() {
            return this.listSmallCardData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SectionNewsData)) {
                return false;
            }
            SectionNewsData sectionNewsData = (SectionNewsData) other;
            return fr.t.c(this.title, sectionNewsData.title) && fr.t.c(this.listSmallCardData, sectionNewsData.listSmallCardData);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.listSmallCardData.hashCode();
        }

        public String toString() {
            return "SectionNewsData(title=" + this.title + ", listSmallCardData=" + this.listSmallCardData + ')';
        }
    }

    /* JADX INFO: renamed from: qh1.d$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lqh1/d$c;", "", "Lmx/a;", "title", "Ln30/b;", "cardListData", "<init>", "(Lmx/a;Ln30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "Ln30/b;", "()Ln30/b;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SectionPopularData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData cardListData;

        public SectionPopularData(Label label, CardListData cardListData) {
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
            if (!(other instanceof SectionPopularData)) {
                return false;
            }
            SectionPopularData sectionPopularData = (SectionPopularData) other;
            return fr.t.c(this.title, sectionPopularData.title) && fr.t.c(this.cardListData, sectionPopularData.cardListData);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.cardListData.hashCode();
        }

        public String toString() {
            return "SectionPopularData(title=" + this.title + ", cardListData=" + this.cardListData + ')';
        }
    }
}
