package jz1;

import i50.BaseScaffoldData;
import j50.SearchBarData;
import k40.EmptyStateData;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ljz1/f;", "Ll00/e;", "Ljz1/f$a;", "a", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends l00.e<Data> {

    /* JADX INFO: renamed from: jz1.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\u001d\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b\u0019\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010'\u001a\u0004\b!\u0010(¨\u0006)"}, d2 = {"Ljz1/f$a;", "", "Li50/a;", "scaffoldData", "Lmx/a;", "title", "description", "Lj50/e;", "searchBarData", "Ln30/b;", "committeeList", "Lk40/a;", "emptyStateData", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lj50/e;Ln30/b;Lk40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "d", "()Li50/a;", "b", "Lmx/a;", "f", "()Lmx/a;", "c", "Lj50/e;", "e", "()Lj50/e;", "Ln30/b;", "()Ln30/b;", "Lk40/a;", "()Lk40/a;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f106933g = EmptyStateData.f108236d | BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label description;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final SearchBarData searchBarData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData committeeList;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final EmptyStateData emptyStateData;

        public Data(BaseScaffoldData baseScaffoldData, Label label, Label label2, SearchBarData searchBarData, CardListData cardListData, EmptyStateData emptyStateData) {
            this.scaffoldData = baseScaffoldData;
            this.title = label;
            this.description = label2;
            this.searchBarData = searchBarData;
            this.committeeList = cardListData;
            this.emptyStateData = emptyStateData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CardListData getCommitteeList() {
            return this.committeeList;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EmptyStateData getEmptyStateData() {
            return this.emptyStateData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final SearchBarData getSearchBarData() {
            return this.searchBarData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.scaffoldData, data.scaffoldData) && fr.t.c(this.title, data.title) && fr.t.c(this.description, data.description) && fr.t.c(this.searchBarData, data.searchBarData) && fr.t.c(this.committeeList, data.committeeList) && fr.t.c(this.emptyStateData, data.emptyStateData);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.scaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.searchBarData.hashCode()) * 31) + this.committeeList.hashCode()) * 31;
            EmptyStateData emptyStateData = this.emptyStateData;
            return iHashCode + (emptyStateData == null ? 0 : emptyStateData.hashCode());
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", title=" + this.title + ", description=" + this.description + ", searchBarData=" + this.searchBarData + ", committeeList=" + this.committeeList + ", emptyStateData=" + this.emptyStateData + ')';
        }
    }
}
