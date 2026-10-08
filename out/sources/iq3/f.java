package iq3;

import h30.ButtonData;
import i50.BaseScaffoldData;
import j50.SearchBarData;
import k40.EmptyStateData;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Liq3/f;", "Ll00/e;", "Liq3/f$a;", "a", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Liq3/f$a;", "", "b", "a", "c", "Liq3/f$a$a;", "Liq3/f$a$b;", "Liq3/f$a$c;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: iq3.f$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, d2 = {"Liq3/f$a$a;", "Liq3/f$a;", "Lq40/g;", "Loq/i0;", "Lq40/f;", "iconPageData", "Li50/a;", "baseScaffoldData", "<init>", "(Lq40/g;Li50/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lq40/g;", "b", "()Lq40/g;", "Li50/a;", "()Li50/a;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Empty implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f96574c = (BaseScaffoldData.f89350g | IconPageBottomContentData.f164663d) | IconPageData.f164667h;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final IconPageData<oq.i0, IconPageBottomContentData> iconPageData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            public Empty(IconPageData<oq.i0, IconPageBottomContentData> iconPageData, BaseScaffoldData baseScaffoldData) {
                this.iconPageData = iconPageData;
                this.baseScaffoldData = baseScaffoldData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            public final IconPageData<oq.i0, IconPageBottomContentData> b() {
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
                return fr.t.c(this.iconPageData, empty.iconPageData) && fr.t.c(this.baseScaffoldData, empty.baseScaffoldData);
            }

            public int hashCode() {
                return (this.iconPageData.hashCode() * 31) + this.baseScaffoldData.hashCode();
            }

            public String toString() {
                return "Empty(iconPageData=" + this.iconPageData + ", baseScaffoldData=" + this.baseScaffoldData + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Liq3/f$a$b;", "Liq3/f$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f96577a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 2013927846;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: iq3.f$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b%\u0010*R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b-\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b/\u0010<R\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b=\u00104\u001a\u0004\b3\u00106R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b1\u00107\u001a\u0004\b+\u00109R\u0017\u0010\u0013\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b=\u0010.R\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b8\u0010,\u001a\u0004\b>\u0010.R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b:\u0010AR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b>\u0010B\u001a\u0004\b?\u0010C¨\u0006D"}, d2 = {"Liq3/f$a$c;", "Liq3/f$a;", "Li50/a;", "baseScaffoldData", "Lkotlin/Function0;", "Loq/i0;", "back", "Lmx/a;", "infoLabel", "Lj50/e;", "searchBarData", "Ln30/b;", "searchedIdeas", "Lk40/a;", "searchedNotFoundEmptyState", "Ly30/n$a;", "filters", "ideas", "emptyIdeasState", "roundVoteLabel", "voteDaysLeftLabel", "Lh30/a;", "resultsButtonData", "", "shouldShowNewContent", "<init>", "(Li50/a;Ler/a;Lmx/a;Lj50/e;Ln30/b;Lk40/a;Ly30/n$a;Ln30/b;Lk40/a;Lmx/a;Lmx/a;Lh30/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Ler/a;", "()Ler/a;", "c", "Lmx/a;", "f", "()Lmx/a;", "d", "Lj50/e;", "i", "()Lj50/e;", "e", "Ln30/b;", "j", "()Ln30/b;", "Lk40/a;", "k", "()Lk40/a;", "g", "Ly30/n$a;", "()Ly30/n$a;", "h", "m", "l", "Lh30/a;", "()Lh30/a;", "Z", "()Z", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final int f96578n;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> back;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label infoLabel;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final SearchBarData searchBarData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData searchedIdeas;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final EmptyStateData searchedNotFoundEmptyState;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final y30.n.Filter filters;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData ideas;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final EmptyStateData emptyIdeasState;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label roundVoteLabel;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label voteDaysLeftLabel;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData resultsButtonData;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean shouldShowNewContent;

            static {
                int i15 = EmptyStateData.f108236d;
                f96578n = i15 | y30.n.Filter.f223689d | i15 | BaseScaffoldData.f89350g;
            }

            public Initialized(BaseScaffoldData baseScaffoldData, er.a<oq.i0> aVar, Label label, SearchBarData searchBarData, CardListData cardListData, EmptyStateData emptyStateData, y30.n.Filter filter, CardListData cardListData2, EmptyStateData emptyStateData2, Label label2, Label label3, ButtonData buttonData, boolean z15) {
                this.baseScaffoldData = baseScaffoldData;
                this.back = aVar;
                this.infoLabel = label;
                this.searchBarData = searchBarData;
                this.searchedIdeas = cardListData;
                this.searchedNotFoundEmptyState = emptyStateData;
                this.filters = filter;
                this.ideas = cardListData2;
                this.emptyIdeasState = emptyStateData2;
                this.roundVoteLabel = label2;
                this.voteDaysLeftLabel = label3;
                this.resultsButtonData = buttonData;
                this.shouldShowNewContent = z15;
            }

            public final er.a<oq.i0> a() {
                return this.back;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final EmptyStateData getEmptyIdeasState() {
                return this.emptyIdeasState;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final y30.n.Filter getFilters() {
                return this.filters;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final CardListData getIdeas() {
                return this.ideas;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.back, initialized.back) && fr.t.c(this.infoLabel, initialized.infoLabel) && fr.t.c(this.searchBarData, initialized.searchBarData) && fr.t.c(this.searchedIdeas, initialized.searchedIdeas) && fr.t.c(this.searchedNotFoundEmptyState, initialized.searchedNotFoundEmptyState) && fr.t.c(this.filters, initialized.filters) && fr.t.c(this.ideas, initialized.ideas) && fr.t.c(this.emptyIdeasState, initialized.emptyIdeasState) && fr.t.c(this.roundVoteLabel, initialized.roundVoteLabel) && fr.t.c(this.voteDaysLeftLabel, initialized.voteDaysLeftLabel) && fr.t.c(this.resultsButtonData, initialized.resultsButtonData) && this.shouldShowNewContent == initialized.shouldShowNewContent;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Label getInfoLabel() {
                return this.infoLabel;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final ButtonData getResultsButtonData() {
                return this.resultsButtonData;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final Label getRoundVoteLabel() {
                return this.roundVoteLabel;
            }

            public int hashCode() {
                return (((((((((((((((((((((((this.baseScaffoldData.hashCode() * 31) + this.back.hashCode()) * 31) + this.infoLabel.hashCode()) * 31) + this.searchBarData.hashCode()) * 31) + this.searchedIdeas.hashCode()) * 31) + this.searchedNotFoundEmptyState.hashCode()) * 31) + this.filters.hashCode()) * 31) + this.ideas.hashCode()) * 31) + this.emptyIdeasState.hashCode()) * 31) + this.roundVoteLabel.hashCode()) * 31) + this.voteDaysLeftLabel.hashCode()) * 31) + this.resultsButtonData.hashCode()) * 31) + Boolean.hashCode(this.shouldShowNewContent);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final SearchBarData getSearchBarData() {
                return this.searchBarData;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final CardListData getSearchedIdeas() {
                return this.searchedIdeas;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final EmptyStateData getSearchedNotFoundEmptyState() {
                return this.searchedNotFoundEmptyState;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final boolean getShouldShowNewContent() {
                return this.shouldShowNewContent;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public final Label getVoteDaysLeftLabel() {
                return this.voteDaysLeftLabel;
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", back=" + this.back + ", infoLabel=" + this.infoLabel + ", searchBarData=" + this.searchBarData + ", searchedIdeas=" + this.searchedIdeas + ", searchedNotFoundEmptyState=" + this.searchedNotFoundEmptyState + ", filters=" + this.filters + ", ideas=" + this.ideas + ", emptyIdeasState=" + this.emptyIdeasState + ", roundVoteLabel=" + this.roundVoteLabel + ", voteDaysLeftLabel=" + this.voteDaysLeftLabel + ", resultsButtonData=" + this.resultsButtonData + ", shouldShowNewContent=" + this.shouldShowNewContent + ')';
            }
        }
    }
}
