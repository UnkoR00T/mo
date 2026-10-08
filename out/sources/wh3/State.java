package wh3;

import java.util.Map;
import p071kotlin.Metadata;
import zh3.CompanyFieldsData;
import zh3.PersonFieldsData;

/* JADX INFO: renamed from: wh3.p, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJL\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lwh3/p;", "", "Ltv0/l;", "vehicleOwnerDetails", "", "Ltv0/l$c$c;", "Lzh3/e;", "physicalOwnersFieldsData", "Lzh3/b;", "companyOwnerFieldsData", "Ld60/j;", "scrollInstance", "<init>", "(Ltv0/l;Ljava/util/Map;Lzh3/b;Ld60/j;)V", "a", "(Ltv0/l;Ljava/util/Map;Lzh3/b;Ld60/j;)Lwh3/p;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltv0/l;", "f", "()Ltv0/l;", "b", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "c", "Lzh3/b;", "()Lzh3/b;", "Ld60/j;", "e", "()Ld60/j;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final tv0.l vehicleOwnerDetails;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<tv0.l.PhysicalOwner.EnumC5029c, PersonFieldsData> physicalOwnersFieldsData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final CompanyFieldsData companyOwnerFieldsData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final d60.j<Object> scrollInstance;

    public State(tv0.l lVar, Map<tv0.l.PhysicalOwner.EnumC5029c, PersonFieldsData> map, CompanyFieldsData companyFieldsData, d60.j<Object> jVar) {
        this.vehicleOwnerDetails = lVar;
        this.physicalOwnersFieldsData = map;
        this.companyOwnerFieldsData = companyFieldsData;
        this.scrollInstance = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, tv0.l lVar, Map map, CompanyFieldsData companyFieldsData, d60.j jVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            lVar = state.vehicleOwnerDetails;
        }
        if ((i15 & 2) != 0) {
            map = state.physicalOwnersFieldsData;
        }
        if ((i15 & 4) != 0) {
            companyFieldsData = state.companyOwnerFieldsData;
        }
        if ((i15 & 8) != 0) {
            jVar = state.scrollInstance;
        }
        return state.a(lVar, map, companyFieldsData, jVar);
    }

    public final State a(tv0.l vehicleOwnerDetails, Map<tv0.l.PhysicalOwner.EnumC5029c, PersonFieldsData> physicalOwnersFieldsData, CompanyFieldsData companyOwnerFieldsData, d60.j<Object> scrollInstance) {
        return new State(vehicleOwnerDetails, physicalOwnersFieldsData, companyOwnerFieldsData, scrollInstance);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final CompanyFieldsData getCompanyOwnerFieldsData() {
        return this.companyOwnerFieldsData;
    }

    public final Map<tv0.l.PhysicalOwner.EnumC5029c, PersonFieldsData> d() {
        return this.physicalOwnersFieldsData;
    }

    public final d60.j<Object> e() {
        return this.scrollInstance;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.vehicleOwnerDetails, state.vehicleOwnerDetails) && fr.t.c(this.physicalOwnersFieldsData, state.physicalOwnersFieldsData) && fr.t.c(this.companyOwnerFieldsData, state.companyOwnerFieldsData) && fr.t.c(this.scrollInstance, state.scrollInstance);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final tv0.l getVehicleOwnerDetails() {
        return this.vehicleOwnerDetails;
    }

    public int hashCode() {
        int iHashCode = ((((this.vehicleOwnerDetails.hashCode() * 31) + this.physicalOwnersFieldsData.hashCode()) * 31) + this.companyOwnerFieldsData.hashCode()) * 31;
        d60.j<Object> jVar = this.scrollInstance;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public String toString() {
        return "State(vehicleOwnerDetails=" + this.vehicleOwnerDetails + ", physicalOwnersFieldsData=" + this.physicalOwnersFieldsData + ", companyOwnerFieldsData=" + this.companyOwnerFieldsData + ", scrollInstance=" + this.scrollInstance + ')';
    }

    public /* synthetic */ State(tv0.l lVar, Map map, CompanyFieldsData companyFieldsData, d60.j jVar, int i15, fr.k kVar) {
        this(lVar, (i15 & 2) != 0 ? pq.v0.i() : map, (i15 & 4) != 0 ? new CompanyFieldsData(null, null, null, null, 15, null) : companyFieldsData, (i15 & 8) != 0 ? null : jVar);
    }
}
