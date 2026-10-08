package ph3;

import java.util.Set;
import p071kotlin.Metadata;
import sv0.v0;

/* JADX INFO: renamed from: ph3.f, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJF\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%¨\u0006&"}, d2 = {"Lph3/f;", "", "", "showValidation", "Lyd3/h;", "vehicleDamageDetailsType", "", "Lsv0/v0;", "damages", "Ld60/j;", "Lph3/e;", "scrollInstance", "<init>", "(ZLyd3/h;Ljava/util/Set;Ld60/j;)V", "a", "(ZLyd3/h;Ljava/util/Set;Ld60/j;)Lph3/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "e", "()Z", "b", "Lyd3/h;", "f", "()Lyd3/h;", "c", "Ljava/util/Set;", "()Ljava/util/Set;", "d", "Ld60/j;", "()Ld60/j;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showValidation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final yd3.h vehicleDamageDetailsType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<v0> damages;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final d60.j<e> scrollInstance;

    /* JADX WARN: Multi-variable type inference failed */
    public State(boolean z15, yd3.h hVar, Set<? extends v0> set, d60.j<e> jVar) {
        this.showValidation = z15;
        this.vehicleDamageDetailsType = hVar;
        this.damages = set;
        this.scrollInstance = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, boolean z15, yd3.h hVar, Set set, d60.j jVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = state.showValidation;
        }
        if ((i15 & 2) != 0) {
            hVar = state.vehicleDamageDetailsType;
        }
        if ((i15 & 4) != 0) {
            set = state.damages;
        }
        if ((i15 & 8) != 0) {
            jVar = state.scrollInstance;
        }
        return state.a(z15, hVar, set, jVar);
    }

    public final State a(boolean showValidation, yd3.h vehicleDamageDetailsType, Set<? extends v0> damages, d60.j<e> scrollInstance) {
        return new State(showValidation, vehicleDamageDetailsType, damages, scrollInstance);
    }

    public final Set<v0> c() {
        return this.damages;
    }

    public final d60.j<e> d() {
        return this.scrollInstance;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShowValidation() {
        return this.showValidation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.showValidation == state.showValidation && this.vehicleDamageDetailsType == state.vehicleDamageDetailsType && fr.t.c(this.damages, state.damages) && fr.t.c(this.scrollInstance, state.scrollInstance);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final yd3.h getVehicleDamageDetailsType() {
        return this.vehicleDamageDetailsType;
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.showValidation) * 31) + this.vehicleDamageDetailsType.hashCode()) * 31) + this.damages.hashCode()) * 31;
        d60.j<e> jVar = this.scrollInstance;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public String toString() {
        return "State(showValidation=" + this.showValidation + ", vehicleDamageDetailsType=" + this.vehicleDamageDetailsType + ", damages=" + this.damages + ", scrollInstance=" + this.scrollInstance + ')';
    }

    public /* synthetic */ State(boolean z15, yd3.h hVar, Set set, d60.j jVar, int i15, fr.k kVar) {
        this(z15, hVar, set, (i15 & 8) != 0 ? null : jVar);
    }
}
