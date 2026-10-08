package a93;

import i50.BaseScaffoldData;
import j50.SearchBarData;
import java.util.List;
import java.util.Map;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"La93/i;", "Ll00/e;", "La93/i$a;", "a", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i extends l00.e<Data> {

    /* JADX INFO: renamed from: a93.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R)\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b \u0010%R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b\u001c\u0010*¨\u0006+"}, d2 = {"La93/i$a;", "", "Li50/a;", "scaffoldData", "Lkotlin/Function0;", "Loq/i0;", "onBack", "", "Lmx/a;", "", "Ln50/k;", "items", "Lj50/e;", "searchBarData", "La93/g;", "activeSearchContent", "<init>", "(Li50/a;Ler/a;Ljava/util/Map;Lj50/e;La93/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "d", "()Li50/a;", "b", "Ler/a;", "c", "()Ler/a;", "Ljava/util/Map;", "()Ljava/util/Map;", "Lj50/e;", "e", "()Lj50/e;", "La93/g;", "()La93/g;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<Label, List<n50.k>> items;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final SearchBarData searchBarData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final g activeSearchContent;

        /* JADX WARN: Multi-variable type inference failed */
        public Data(BaseScaffoldData baseScaffoldData, er.a<i0> aVar, Map<Label, ? extends List<? extends n50.k>> map, SearchBarData searchBarData, g gVar) {
            this.scaffoldData = baseScaffoldData;
            this.onBack = aVar;
            this.items = map;
            this.searchBarData = searchBarData;
            this.activeSearchContent = gVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final g getActiveSearchContent() {
            return this.activeSearchContent;
        }

        public final Map<Label, List<n50.k>> b() {
            return this.items;
        }

        public final er.a<i0> c() {
            return this.onBack;
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
            return fr.t.c(this.scaffoldData, data.scaffoldData) && fr.t.c(this.onBack, data.onBack) && fr.t.c(this.items, data.items) && fr.t.c(this.searchBarData, data.searchBarData) && fr.t.c(this.activeSearchContent, data.activeSearchContent);
        }

        public int hashCode() {
            int iHashCode = ((((((this.scaffoldData.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.items.hashCode()) * 31) + this.searchBarData.hashCode()) * 31;
            g gVar = this.activeSearchContent;
            return iHashCode + (gVar == null ? 0 : gVar.hashCode());
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", onBack=" + this.onBack + ", items=" + this.items + ", searchBarData=" + this.searchBarData + ", activeSearchContent=" + this.activeSearchContent + ')';
        }
    }
}
