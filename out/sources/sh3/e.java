package sh3;

import p071kotlin.Metadata;
import tv0.BEVehicleDataWithType;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lsh3/e;", "", "c", "a", "b", "Lsh3/e$a;", "Lsh3/e$b;", "Lsh3/e$c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsh3/e$a;", "Lsh3/e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f181749a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 702232253;
        }

        public String toString() {
            return "Empty";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsh3/e$c;", "Lsh3/e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f181754a = new c();

        private c() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return 496151715;
        }

        public String toString() {
            return "Loader";
        }
    }

    /* JADX INFO: renamed from: sh3.e$b, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJP\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00078\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'¨\u0006("}, d2 = {"Lsh3/e$b;", "Lsh3/e;", "", "isAnyVehicleFromBackend", "", "Ltv0/k;", "manuallyAddedVehicles", "Lmu/g;", "Lja/n0;", "vehiclePager", "Lmu/a0;", "Lsh3/d;", "pagerCommandFlow", "<init>", "(ZLjava/util/List;Lmu/g;Lmu/a0;)V", "a", "(ZLjava/util/List;Lmu/g;Lmu/a0;)Lsh3/e$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "f", "()Z", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lmu/g;", "e", "()Lmu/g;", "d", "Lmu/a0;", "()Lmu/a0;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class List implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isAnyVehicleFromBackend;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final java.util.List<BEVehicleDataWithType> manuallyAddedVehicles;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final mu.g<ja.n0<BEVehicleDataWithType>> vehiclePager;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final mu.a0<d> pagerCommandFlow;

        public List(boolean z15, java.util.List<BEVehicleDataWithType> list, mu.g<ja.n0<BEVehicleDataWithType>> gVar, mu.a0<d> a0Var) {
            this.isAnyVehicleFromBackend = z15;
            this.manuallyAddedVehicles = list;
            this.vehiclePager = gVar;
            this.pagerCommandFlow = a0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ List b(List list, boolean z15, java.util.List list2, mu.g gVar, mu.a0 a0Var, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                z15 = list.isAnyVehicleFromBackend;
            }
            if ((i15 & 2) != 0) {
                list2 = list.manuallyAddedVehicles;
            }
            if ((i15 & 4) != 0) {
                gVar = list.vehiclePager;
            }
            if ((i15 & 8) != 0) {
                a0Var = list.pagerCommandFlow;
            }
            return list.a(z15, list2, gVar, a0Var);
        }

        public final List a(boolean isAnyVehicleFromBackend, java.util.List<BEVehicleDataWithType> manuallyAddedVehicles, mu.g<ja.n0<BEVehicleDataWithType>> vehiclePager, mu.a0<d> pagerCommandFlow) {
            return new List(isAnyVehicleFromBackend, manuallyAddedVehicles, vehiclePager, pagerCommandFlow);
        }

        public final java.util.List<BEVehicleDataWithType> c() {
            return this.manuallyAddedVehicles;
        }

        public final mu.a0<d> d() {
            return this.pagerCommandFlow;
        }

        public final mu.g<ja.n0<BEVehicleDataWithType>> e() {
            return this.vehiclePager;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof List)) {
                return false;
            }
            List list = (List) other;
            return this.isAnyVehicleFromBackend == list.isAnyVehicleFromBackend && fr.t.c(this.manuallyAddedVehicles, list.manuallyAddedVehicles) && fr.t.c(this.vehiclePager, list.vehiclePager) && fr.t.c(this.pagerCommandFlow, list.pagerCommandFlow);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsAnyVehicleFromBackend() {
            return this.isAnyVehicleFromBackend;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.isAnyVehicleFromBackend) * 31) + this.manuallyAddedVehicles.hashCode()) * 31) + this.vehiclePager.hashCode()) * 31) + this.pagerCommandFlow.hashCode();
        }

        public String toString() {
            return "List(isAnyVehicleFromBackend=" + this.isAnyVehicleFromBackend + ", manuallyAddedVehicles=" + this.manuallyAddedVehicles + ", vehiclePager=" + this.vehiclePager + ", pagerCommandFlow=" + this.pagerCommandFlow + ')';
        }

        public /* synthetic */ List(boolean z15, java.util.List list, mu.g gVar, mu.a0 a0Var, int i15, fr.k kVar) {
            this(z15, list, gVar, (i15 & 8) != 0 ? mu.h0.b(0, 0, null, 7, null) : a0Var);
        }
    }
}
