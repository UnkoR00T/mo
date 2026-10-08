package xj3;

import fr.t;
import iy.b0;
import java.time.LocalDate;
import p071kotlin.Metadata;
import uv0.VehicleHistory;
import uv0.v;

/* JADX INFO: renamed from: xj3.c, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010#\u001a\u0004\b\u0017\u0010$¨\u0006%"}, d2 = {"Lxj3/c;", "", "Luv0/d;", "plate", "Luv0/v;", "vin", "", "skipForm", "Luv0/m;", "vehicleHistory", "Ljava/time/LocalDate;", "firstRegistrationDate", "<init>", "(Ljava/lang/String;Liy/b0;ZLuv0/m;Ljava/time/LocalDate;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Liy/b0;", "e", "()Liy/b0;", "c", "Z", "()Z", "d", "Luv0/m;", "()Luv0/m;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String plate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 vin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean skipForm;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final VehicleHistory vehicleHistory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate firstRegistrationDate;

    public /* synthetic */ State(String str, b0 b0Var, boolean z15, VehicleHistory vehicleHistory, LocalDate localDate, fr.k kVar) {
        this(str, b0Var, z15, vehicleHistory, localDate);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getFirstRegistrationDate() {
        return this.firstRegistrationDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPlate() {
        return this.plate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getSkipForm() {
        return this.skipForm;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final VehicleHistory getVehicleHistory() {
        return this.vehicleHistory;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b0 getVin() {
        return this.vin;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return uv0.d.e(this.plate, state.plate) && v.f(this.vin, state.vin) && this.skipForm == state.skipForm && t.c(this.vehicleHistory, state.vehicleHistory) && t.c(this.firstRegistrationDate, state.firstRegistrationDate);
    }

    public int hashCode() {
        int iF = ((((((uv0.d.f(this.plate) * 31) + v.g(this.vin)) * 31) + Boolean.hashCode(this.skipForm)) * 31) + this.vehicleHistory.hashCode()) * 31;
        LocalDate localDate = this.firstRegistrationDate;
        return iF + (localDate == null ? 0 : localDate.hashCode());
    }

    public String toString() {
        return "State(plate=" + ((Object) uv0.d.h(this.plate)) + ", vin=" + ((Object) v.i(this.vin)) + ", skipForm=" + this.skipForm + ", vehicleHistory=" + this.vehicleHistory + ", firstRegistrationDate=" + this.firstRegistrationDate + ')';
    }

    private State(String str, b0 b0Var, boolean z15, VehicleHistory vehicleHistory, LocalDate localDate) {
        this.plate = str;
        this.vin = b0Var;
        this.skipForm = z15;
        this.vehicleHistory = vehicleHistory;
        this.firstRegistrationDate = localDate;
    }
}
