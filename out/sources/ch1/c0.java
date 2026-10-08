package ch1;

import ah1.FavouriteServices;
import iq0.CategoryDashboardServices;
import iq0.DashboardServiceEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lch1/c0;", "", "Lgz/b$a$a;", "Lch1/c0$a;", "Lh64/k;", "getServicesCategoriesUseCase", "Lbh1/d;", "servicesDataStore", "<init>", "(Lh64/k;Lbh1/d;)V", "params", "Lmu/g;", "b", "(Lgz/b$a$a;)Lmu/g;", "a", "Lh64/k;", "Lbh1/d;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c0 implements gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h64.k getServicesCategoriesUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final bh1.d servicesDataStore;

    /* JADX INFO: renamed from: ch1.c0$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0017"}, d2 = {"Lch1/c0$a;", "", "", "Liq0/p;", "favouriteServices", "Liq0/o;", "categories", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ServicesResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<DashboardServiceEntry> favouriteServices;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<CategoryDashboardServices> categories;

        public ServicesResult(List<DashboardServiceEntry> list, List<CategoryDashboardServices> list2) {
            this.favouriteServices = list;
            this.categories = list2;
        }

        public final List<CategoryDashboardServices> a() {
            return this.categories;
        }

        public final List<DashboardServiceEntry> b() {
            return this.favouriteServices;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServicesResult)) {
                return false;
            }
            ServicesResult servicesResult = (ServicesResult) other;
            return fr.t.c(this.favouriteServices, servicesResult.favouriteServices) && fr.t.c(this.categories, servicesResult.categories);
        }

        public int hashCode() {
            return (this.favouriteServices.hashCode() * 31) + this.categories.hashCode();
        }

        public String toString() {
            return "ServicesResult(favouriteServices=" + this.favouriteServices + ", categories=" + this.categories + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Liq0/o;", "categories", "Lah1/d;", "favouriteServices", "Lch1/c0$a;", "<anonymous>", "(Ljava/util/List;Lah1/d;)Lch1/c0$a;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<List<? extends CategoryDashboardServices>, FavouriteServices, tq.e<? super ServicesResult>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f26796e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f26797f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f26798g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ArrayList arrayList;
            List<String> listA;
            Object next;
            List listN = (List) this.f26797f;
            FavouriteServices favouriteServices = (FavouriteServices) this.f26798g;
            uq.b.e();
            if (this.f26796e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            ArrayList arrayList2 = new ArrayList();
            if (listN != null) {
                arrayList = new ArrayList();
                Iterator it = listN.iterator();
                while (it.hasNext()) {
                    pq.v.D(arrayList, ((CategoryDashboardServices) it.next()).b());
                }
            } else {
                arrayList = null;
            }
            if (favouriteServices != null && (listA = favouriteServices.a()) != null) {
                for (String str : listA) {
                    if (arrayList != null) {
                        Iterator it4 = arrayList.iterator();
                        do {
                            if (!it4.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it4.next();
                        } while (!fr.t.c(((DashboardServiceEntry) next).getType().name(), str));
                        DashboardServiceEntry dashboardServiceEntry = (DashboardServiceEntry) next;
                        if (dashboardServiceEntry != null) {
                            arrayList2.add(dashboardServiceEntry);
                        }
                    }
                }
            }
            if (listN == null) {
                listN = pq.v.n();
            }
            return new ServicesResult(arrayList2, listN);
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(List<CategoryDashboardServices> list, FavouriteServices favouriteServices, tq.e<? super ServicesResult> eVar) {
            b bVar = new b(eVar);
            bVar.f26797f = list;
            bVar.f26798g = favouriteServices;
            return bVar.J(oq.i0.f148189a);
        }
    }

    public c0(h64.k kVar, bh1.d dVar) {
        this.getServicesCategoriesUseCase = kVar;
        this.servicesDataStore = dVar;
    }

    public mu.g<ServicesResult> b(gz.b.a.C1792a params) {
        return mu.i.J((mu.g) this.getServicesCategoriesUseCase.a(gz.b.a.C1792a.f78542a), this.servicesDataStore.c(), new b(null));
    }
}
