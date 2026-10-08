package pj3;

import fr.k;
import fr.t;
import iy.b0;
import java.time.LocalDate;
import p071kotlin.Metadata;
import uv0.d;
import uv0.v;

/* JADX INFO: renamed from: pj3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f¨\u0006 "}, d2 = {"Lpj3/a;", "", "Luv0/d;", "plate", "Luv0/v;", "vin", "", "skipForm", "Ljava/time/LocalDate;", "firstRegistrationDate", "<init>", "(Ljava/lang/String;Liy/b0;ZLjava/time/LocalDate;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Liy/b0;", "d", "()Liy/b0;", "c", "Z", "()Z", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleIdentificationPayload {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f158028e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String plate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 vin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean skipForm;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate firstRegistrationDate;

    public /* synthetic */ VehicleIdentificationPayload(String str, b0 b0Var, boolean z15, LocalDate localDate, k kVar) {
        this(str, b0Var, z15, localDate);
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
    public final b0 getVin() {
        return this.vin;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleIdentificationPayload)) {
            return false;
        }
        VehicleIdentificationPayload vehicleIdentificationPayload = (VehicleIdentificationPayload) other;
        return d.e(this.plate, vehicleIdentificationPayload.plate) && v.f(this.vin, vehicleIdentificationPayload.vin) && this.skipForm == vehicleIdentificationPayload.skipForm && t.c(this.firstRegistrationDate, vehicleIdentificationPayload.firstRegistrationDate);
    }

    public int hashCode() {
        return (((((d.f(this.plate) * 31) + v.g(this.vin)) * 31) + Boolean.hashCode(this.skipForm)) * 31) + this.firstRegistrationDate.hashCode();
    }

    public String toString() {
        return "VehicleIdentificationPayload(plate=" + ((Object) d.h(this.plate)) + ", vin=" + ((Object) v.i(this.vin)) + ", skipForm=" + this.skipForm + ", firstRegistrationDate=" + this.firstRegistrationDate + ')';
    }

    private VehicleIdentificationPayload(String str, b0 b0Var, boolean z15, LocalDate localDate) {
        this.plate = str;
        this.vin = b0Var;
        this.skipForm = z15;
        this.firstRegistrationDate = localDate;
    }
}
