package ch1;

import ah1.FavouriteServices;
import iq0.DashboardServiceEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lch1/p0;", "Lgz/b;", "Lch1/p0$a;", "Loq/i0;", "Lbh1/d;", "servicesDataStoreRepository", "<init>", "(Lbh1/d;)V", "params", "d", "(Lch1/p0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lbh1/d;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p0 implements gz.b<Params, oq.i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bh1.d servicesDataStoreRepository;

    /* JADX INFO: renamed from: ch1.p0$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lch1/p0$a;", "Lgz/b$a;", "", "Liq0/p;", "favouriteServices", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<DashboardServiceEntry> favouriteServices;

        public Params(List<DashboardServiceEntry> list) {
            this.favouriteServices = list;
        }

        public final List<DashboardServiceEntry> a() {
            return this.favouriteServices;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.favouriteServices, ((Params) other).favouriteServices);
        }

        public int hashCode() {
            return this.favouriteServices.hashCode();
        }

        public String toString() {
            return "Params(favouriteServices=" + this.favouriteServices + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f27003d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f27004e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f27006g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f27004e = obj;
            this.f27006g |= PKIFailureInfo.systemUnavail;
            return p0.this.d(null, this);
        }
    }

    public p0(bh1.d dVar) {
        this.servicesDataStoreRepository = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(Params params, tq.e<? super oq.i0> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f27006g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f27006g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f27004e;
        Object objE = uq.b.e();
        int i16 = bVar.f27006g;
        if (i16 == 0) {
            oq.u.b(obj);
            bh1.d dVar = this.servicesDataStoreRepository;
            List<DashboardServiceEntry> listA = params.a();
            ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(((DashboardServiceEntry) it.next()).getType().name());
            }
            FavouriteServices favouriteServices = new FavouriteServices(arrayList);
            bVar.f27003d = vq.j.a(params);
            bVar.f27006g = 1;
            if (dVar.b(favouriteServices, bVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
        }
        return oq.i0.f148189a;
    }
}
