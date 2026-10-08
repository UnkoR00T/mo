package qh3;

import fr.t;
import mu.g;
import oq.i0;
import p071kotlin.Metadata;
import sv0.BEVehicleData;
import tq.e;
import tv0.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0001\u000fJ\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lqh3/a;", "", "Ltv0/h;", "damage", "Loq/i0;", "T0", "(Ltv0/h;Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "Lqh3/a$a;", "J5", "()Lmu/g;", "vehicleDamageDetailsData", "x6", "()Lqh3/a$a;", "currentVehicleDamageDetailsData", "a", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: qh3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lqh3/a$a;", "", "Ltv0/h;", "selectedDamage", "Lsv0/e;", "selectedVehicle", "<init>", "(Ltv0/h;Lsv0/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltv0/h;", "()Ltv0/h;", "b", "Lsv0/e;", "()Lsv0/e;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final h selectedDamage;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEVehicleData selectedVehicle;

        public Data(h hVar, BEVehicleData bEVehicleData) {
            this.selectedDamage = hVar;
            this.selectedVehicle = bEVehicleData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final h getSelectedDamage() {
            return this.selectedDamage;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BEVehicleData getSelectedVehicle() {
            return this.selectedVehicle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.selectedDamage, data.selectedDamage) && t.c(this.selectedVehicle, data.selectedVehicle);
        }

        public int hashCode() {
            h hVar = this.selectedDamage;
            int iHashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
            BEVehicleData bEVehicleData = this.selectedVehicle;
            return iHashCode + (bEVehicleData != null ? bEVehicleData.hashCode() : 0);
        }

        public String toString() {
            return "Data(selectedDamage=" + this.selectedDamage + ", selectedVehicle=" + this.selectedVehicle + ')';
        }
    }

    g<Data> J5();

    Object T0(h hVar, e<? super i0> eVar);

    Data x6();
}
