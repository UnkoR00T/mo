package tv0;

import fr.t;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;

/* JADX INFO: renamed from: tv0.m, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 \n2\u00020\u0001:\u0002\u0010\nB\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Ltv0/m;", "", "", "", "Ltv0/m$a;", "pages", "<init>", "(Ljava/util/Map;)V", "", "Ltv0/k;", "b", "()Ljava/util/List;", "", "d", "()Z", "pageWithTypes", "a", "(Ltv0/m$a;)Ltv0/m;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEVehiclesPages {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, BEVehiclesPageWithTypes> pages;

    /* JADX INFO: renamed from: tv0.m$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Ltv0/m$a;", "", "", "key", "nextPageKey", "", "Ltv0/k;", "vehiclesWithType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BEVehiclesPageWithTypes {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String key;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String nextPageKey;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BEVehicleDataWithType> vehiclesWithType;

        public BEVehiclesPageWithTypes(String str, String str2, List<BEVehicleDataWithType> list) {
            this.key = str;
            this.nextPageKey = str2;
            this.vehiclesWithType = list;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getNextPageKey() {
            return this.nextPageKey;
        }

        public final List<BEVehicleDataWithType> c() {
            return this.vehiclesWithType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BEVehiclesPageWithTypes)) {
                return false;
            }
            BEVehiclesPageWithTypes bEVehiclesPageWithTypes = (BEVehiclesPageWithTypes) other;
            return t.c(this.key, bEVehiclesPageWithTypes.key) && t.c(this.nextPageKey, bEVehiclesPageWithTypes.nextPageKey) && t.c(this.vehiclesWithType, bEVehiclesPageWithTypes.vehiclesWithType);
        }

        public int hashCode() {
            int iHashCode = this.key.hashCode() * 31;
            String str = this.nextPageKey;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.vehiclesWithType.hashCode();
        }

        public String toString() {
            return "BEVehiclesPageWithTypes(key=" + this.key + ", nextPageKey=" + this.nextPageKey + ", vehiclesWithType=" + this.vehiclesWithType + ")";
        }
    }

    /* JADX INFO: renamed from: tv0.m$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltv0/m$b;", "", "<init>", "()V", "Ltv0/m;", "a", "()Ltv0/m;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final BEVehiclesPages a() {
            return new BEVehiclesPages(v0.i());
        }

        private Companion() {
        }
    }

    public BEVehiclesPages(Map<String, BEVehiclesPageWithTypes> map) {
        this.pages = map;
    }

    public final BEVehiclesPages a(BEVehiclesPageWithTypes pageWithTypes) {
        Map mapW = v0.w(this.pages);
        mapW.put(pageWithTypes.getKey(), pageWithTypes);
        return new BEVehiclesPages(mapW);
    }

    public final List<BEVehicleDataWithType> b() {
        List<BEVehicleDataWithType> listC;
        BEVehiclesPageWithTypes bEVehiclesPageWithTypes = this.pages.get("INITIAL_PAGE");
        return (bEVehiclesPageWithTypes == null || (listC = bEVehiclesPageWithTypes.c()) == null) ? v.n() : listC;
    }

    public final Map<String, BEVehiclesPageWithTypes> c() {
        return this.pages;
    }

    public final boolean d() {
        return this.pages.isEmpty();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BEVehiclesPages) && t.c(this.pages, ((BEVehiclesPages) other).pages);
    }

    public int hashCode() {
        return this.pages.hashCode();
    }

    public String toString() {
        return "BEVehiclesPages(pages=" + this.pages + ")";
    }
}
