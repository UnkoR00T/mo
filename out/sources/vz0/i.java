package vz0;

import i50.BaseScaffoldData;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lvz0/i;", "Ll00/e;", "Lvz0/i$a;", "a", "applicationforms_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lvz0/i$a;", "", "b", "a", "c", "Lvz0/i$a$a;", "Lvz0/i$a$b;", "Lvz0/i$a$c;", "applicationforms_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: vz0.i$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, d2 = {"Lvz0/i$a$a;", "Lvz0/i$a;", "Li50/a;", "baseScaffoldData", "Lo40/a;", "headerData", "", "Ln50/k;", "categoryListCards", "<init>", "(Li50/a;Lo40/a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lo40/a;", "c", "()Lo40/a;", "Ljava/util/List;", "()Ljava/util/List;", "applicationforms_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DataLoaded implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final o40.a headerData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<n50.k> categoryListCards;

            /* JADX WARN: Multi-variable type inference failed */
            public DataLoaded(BaseScaffoldData baseScaffoldData, o40.a aVar, List<? extends n50.k> list) {
                this.baseScaffoldData = baseScaffoldData;
                this.headerData = aVar;
                this.categoryListCards = list;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            public final List<n50.k> b() {
                return this.categoryListCards;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final o40.a getHeaderData() {
                return this.headerData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DataLoaded)) {
                    return false;
                }
                DataLoaded dataLoaded = (DataLoaded) other;
                return fr.t.c(this.baseScaffoldData, dataLoaded.baseScaffoldData) && fr.t.c(this.headerData, dataLoaded.headerData) && fr.t.c(this.categoryListCards, dataLoaded.categoryListCards);
            }

            public int hashCode() {
                return (((this.baseScaffoldData.hashCode() * 31) + this.headerData.hashCode()) * 31) + this.categoryListCards.hashCode();
            }

            public String toString() {
                return "DataLoaded(baseScaffoldData=" + this.baseScaffoldData + ", headerData=" + this.headerData + ", categoryListCards=" + this.categoryListCards + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lvz0/i$a$b;", "Lvz0/i$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "applicationforms_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f208746a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1992028804;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: vz0.i$a$c, reason: from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lvz0/i$a$c;", "Lvz0/i$a;", "Li50/a;", "baseScaffoldData", "Lq40/g;", "Loq/i0;", "iconPageData", "<init>", "(Li50/a;Lq40/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lq40/g;", "()Lq40/g;", "applicationforms_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NoData implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f208747c = IconPageData.f164667h | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final IconPageData<i0, i0> iconPageData;

            public NoData(BaseScaffoldData baseScaffoldData, IconPageData<i0, i0> iconPageData) {
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
                if (!(other instanceof NoData)) {
                    return false;
                }
                NoData noData = (NoData) other;
                return fr.t.c(this.baseScaffoldData, noData.baseScaffoldData) && fr.t.c(this.iconPageData, noData.iconPageData);
            }

            public int hashCode() {
                return (this.baseScaffoldData.hashCode() * 31) + this.iconPageData.hashCode();
            }

            public String toString() {
                return "NoData(baseScaffoldData=" + this.baseScaffoldData + ", iconPageData=" + this.iconPageData + ')';
            }
        }
    }
}
