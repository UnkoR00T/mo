package r12;

import i50.BaseScaffoldData;
import ja.n0;
import p071kotlin.Metadata;
import q40.IconPageData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0005R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lr12/d;", "Ll00/e;", "Lr12/d$a;", "Li70/n;", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lmu/g;", "Lja/n0;", "Ln50/k;", "Z2", "()Lmu/g;", "messagesPagingData", "Lmu/f0;", "Lr12/b;", "q6", "()Lmu/f0;", "pagingEvents", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<a>, i70.n {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lr12/d$a;", "", "c", "b", "a", "Lr12/d$a$a;", "Lr12/d$a$b;", "Lr12/d$a$c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: r12.d$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lr12/d$a$a;", "Lr12/d$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "c", "()Lhb4/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(hb4.c cVar) {
                this.errorVMS = cVar;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
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

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\b\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lr12/d$a$b;", "Lr12/d$a;", "Li50/a;", "b", "()Li50/a;", "baseScaffoldData", "Lkotlin/Function0;", "Loq/i0;", "a", "()Ler/a;", "onBackClick", "Lr12/d$a$b$a;", "Lr12/d$a$b$b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface b extends a {

            /* JADX INFO: renamed from: r12.d$a$b$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Lr12/d$a$b$a;", "Lr12/d$a$b;", "Li50/a;", "baseScaffoldData", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lc30/b;", "alertData", "<init>", "(Li50/a;Ler/a;Lc30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Ler/a;", "()Ler/a;", "c", "Lc30/b;", "()Lc30/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Displaying implements b {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public static final int f170533d = c30.b.f22944i | BaseScaffoldData.f89350g;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final BaseScaffoldData baseScaffoldData;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final er.a<oq.i0> onBackClick;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final c30.b alertData;

                public Displaying(BaseScaffoldData baseScaffoldData, er.a<oq.i0> aVar, c30.b bVar) {
                    this.baseScaffoldData = baseScaffoldData;
                    this.onBackClick = aVar;
                    this.alertData = bVar;
                }

                @Override // r12.d.a.b
                public er.a<oq.i0> a() {
                    return this.onBackClick;
                }

                @Override // r12.d.a.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public BaseScaffoldData getBaseScaffoldData() {
                    return this.baseScaffoldData;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final c30.b getAlertData() {
                    return this.alertData;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Displaying)) {
                        return false;
                    }
                    Displaying displaying = (Displaying) other;
                    return fr.t.c(this.baseScaffoldData, displaying.baseScaffoldData) && fr.t.c(this.onBackClick, displaying.onBackClick) && fr.t.c(this.alertData, displaying.alertData);
                }

                public int hashCode() {
                    int iHashCode = ((this.baseScaffoldData.hashCode() * 31) + this.onBackClick.hashCode()) * 31;
                    c30.b bVar = this.alertData;
                    return iHashCode + (bVar == null ? 0 : bVar.hashCode());
                }

                public String toString() {
                    return "Displaying(baseScaffoldData=" + this.baseScaffoldData + ", onBackClick=" + this.onBackClick + ", alertData=" + this.alertData + ')';
                }
            }

            /* JADX INFO: renamed from: r12.d$a$b$b, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Lr12/d$a$b$b;", "Lr12/d$a$b;", "Li50/a;", "baseScaffoldData", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lq40/g;", "iconPageData", "<init>", "(Li50/a;Ler/a;Lq40/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Ler/a;", "()Ler/a;", "c", "Lq40/g;", "()Lq40/g;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Empty implements b {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public static final int f170537d = IconPageData.f164667h | BaseScaffoldData.f89350g;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final BaseScaffoldData baseScaffoldData;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final er.a<oq.i0> onBackClick;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final IconPageData<oq.i0, oq.i0> iconPageData;

                public Empty(BaseScaffoldData baseScaffoldData, er.a<oq.i0> aVar, IconPageData<oq.i0, oq.i0> iconPageData) {
                    this.baseScaffoldData = baseScaffoldData;
                    this.onBackClick = aVar;
                    this.iconPageData = iconPageData;
                }

                @Override // r12.d.a.b
                public er.a<oq.i0> a() {
                    return this.onBackClick;
                }

                @Override // r12.d.a.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public BaseScaffoldData getBaseScaffoldData() {
                    return this.baseScaffoldData;
                }

                public final IconPageData<oq.i0, oq.i0> c() {
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
                    return fr.t.c(this.baseScaffoldData, empty.baseScaffoldData) && fr.t.c(this.onBackClick, empty.onBackClick) && fr.t.c(this.iconPageData, empty.iconPageData);
                }

                public int hashCode() {
                    return (((this.baseScaffoldData.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.iconPageData.hashCode();
                }

                public String toString() {
                    return "Empty(baseScaffoldData=" + this.baseScaffoldData + ", onBackClick=" + this.onBackClick + ", iconPageData=" + this.iconPageData + ')';
                }
            }

            er.a<oq.i0> a();

            /* JADX INFO: renamed from: b */
            BaseScaffoldData getBaseScaffoldData();
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lr12/d$a$c;", "Lr12/d$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f170541a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 1530918529;
            }

            public String toString() {
                return "Loading";
            }
        }
    }

    mu.g<n0<n50.k>> Z2();

    oz.j a();

    mu.f0<b> q6();
}
