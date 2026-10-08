package i11;

import i50.BaseScaffoldData;
import j11.PageIndicatorData;
import java.util.List;
import l11.CasesTimelineItem;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Li11/c;", "Ll00/e;", "Li11/c$a;", "a", "cases_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Li11/c$a;", "", "b", "a", "c", "Li11/c$a$a;", "Li11/c$a$b;", "Li11/c$a$c;", "cases_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: i11.c$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Li11/c$a$a;", "Li11/c$a;", "Li50/a;", "baseScaffoldData", "Lq40/g;", "Loq/i0;", "iconPageData", "<init>", "(Li50/a;Lq40/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lq40/g;", "()Lq40/g;", "cases_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Empty implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f88208c = IconPageData.f164667h | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final IconPageData<i0, i0> iconPageData;

            public Empty(BaseScaffoldData baseScaffoldData, IconPageData<i0, i0> iconPageData) {
                this.baseScaffoldData = baseScaffoldData;
                this.iconPageData = iconPageData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            public final IconPageData<i0, i0> b() {
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
                return fr.t.c(this.baseScaffoldData, empty.baseScaffoldData) && fr.t.c(this.iconPageData, empty.iconPageData);
            }

            public int hashCode() {
                return (this.baseScaffoldData.hashCode() * 31) + this.iconPageData.hashCode();
            }

            public String toString() {
                return "Empty(baseScaffoldData=" + this.baseScaffoldData + ", iconPageData=" + this.iconPageData + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Li11/c$a$b;", "Li11/c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cases_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f88211a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1667747812;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: i11.c$a$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u001d\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b&\u0010,R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b+\u0010.\u001a\u0004\b-\u0010/¨\u00060"}, d2 = {"Li11/c$a$c;", "Li11/c$a;", "Li50/a;", "baseScaffoldData", "Lc30/b$c;", "alertData", "", "Ll11/a;", "casesTimelineList", "Lkotlin/Function0;", "Loq/i0;", "loadNextItems", "", "showInfoBanner", "endReached", "Lj11/a;", "pageIndicatorData", "<init>", "(Li50/a;Lc30/b$c;Ljava/util/List;Ler/a;ZZLj11/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lc30/b$c;", "()Lc30/b$c;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Ler/a;", "e", "()Ler/a;", "Z", "g", "()Z", "f", "Lj11/a;", "()Lj11/a;", "cases_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b.c alertData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<CasesTimelineItem> casesTimelineList;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> loadNextItems;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean showInfoBanner;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean endReached;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final PageIndicatorData pageIndicatorData;

            public Initialized(BaseScaffoldData baseScaffoldData, c30.b.c cVar, List<CasesTimelineItem> list, er.a<i0> aVar, boolean z15, boolean z16, PageIndicatorData pageIndicatorData) {
                this.baseScaffoldData = baseScaffoldData;
                this.alertData = cVar;
                this.casesTimelineList = list;
                this.loadNextItems = aVar;
                this.showInfoBanner = z15;
                this.endReached = z16;
                this.pageIndicatorData = pageIndicatorData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final c30.b.c getAlertData() {
                return this.alertData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            public final List<CasesTimelineItem> c() {
                return this.casesTimelineList;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final boolean getEndReached() {
                return this.endReached;
            }

            public final er.a<i0> e() {
                return this.loadNextItems;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.alertData, initialized.alertData) && fr.t.c(this.casesTimelineList, initialized.casesTimelineList) && fr.t.c(this.loadNextItems, initialized.loadNextItems) && this.showInfoBanner == initialized.showInfoBanner && this.endReached == initialized.endReached && fr.t.c(this.pageIndicatorData, initialized.pageIndicatorData);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final PageIndicatorData getPageIndicatorData() {
                return this.pageIndicatorData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final boolean getShowInfoBanner() {
                return this.showInfoBanner;
            }

            public int hashCode() {
                return (((((((((((this.baseScaffoldData.hashCode() * 31) + this.alertData.hashCode()) * 31) + this.casesTimelineList.hashCode()) * 31) + this.loadNextItems.hashCode()) * 31) + Boolean.hashCode(this.showInfoBanner)) * 31) + Boolean.hashCode(this.endReached)) * 31) + this.pageIndicatorData.hashCode();
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", alertData=" + this.alertData + ", casesTimelineList=" + this.casesTimelineList + ", loadNextItems=" + this.loadNextItems + ", showInfoBanner=" + this.showInfoBanner + ", endReached=" + this.endReached + ", pageIndicatorData=" + this.pageIndicatorData + ')';
            }
        }
    }
}
