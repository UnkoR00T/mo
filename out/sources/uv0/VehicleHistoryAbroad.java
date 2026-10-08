package uv0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: uv0.n, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Luv0/n;", "", "Luv0/f;", "carfax", "Luv0/c;", "autoDna", "Luv0/e;", "carVertical", "<init>", "(Luv0/f;Luv0/c;Luv0/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Luv0/f;", "b", "()Luv0/f;", "Luv0/c;", "()Luv0/c;", "c", "Luv0/e;", "getCarVertical", "()Luv0/e;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleHistoryAbroad {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Carfax carfax;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AutoDna autoDna;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final CarVertical carVertical;

    public VehicleHistoryAbroad(Carfax carfax, AutoDna autoDna, CarVertical carVertical) {
        this.carfax = carfax;
        this.autoDna = autoDna;
        this.carVertical = carVertical;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AutoDna getAutoDna() {
        return this.autoDna;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Carfax getCarfax() {
        return this.carfax;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleHistoryAbroad)) {
            return false;
        }
        VehicleHistoryAbroad vehicleHistoryAbroad = (VehicleHistoryAbroad) other;
        return fr.t.c(this.carfax, vehicleHistoryAbroad.carfax) && fr.t.c(this.autoDna, vehicleHistoryAbroad.autoDna) && fr.t.c(this.carVertical, vehicleHistoryAbroad.carVertical);
    }

    public int hashCode() {
        return (((this.carfax.hashCode() * 31) + this.autoDna.hashCode()) * 31) + this.carVertical.hashCode();
    }

    public String toString() {
        return "VehicleHistoryAbroad(carfax=" + this.carfax + ", autoDna=" + this.autoDna + ", carVertical=" + this.carVertical + ")";
    }
}
