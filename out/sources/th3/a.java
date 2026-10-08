package th3;

import er.l;
import fr.t;
import java.util.List;
import mu.g;
import oq.i0;
import p071kotlin.Metadata;
import sv0.ProcessId;
import tq.e;
import tv0.BEVehicleDataWithType;
import tv0.BEVehiclesPages;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0001\u0016J$\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005H¦@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lth3/a;", "", "Lkotlin/Function1;", "Ltv0/m;", "pages", "Loq/i0;", "J3", "(Ler/l;Ltq/e;)Ljava/lang/Object;", "X5", "(Ltq/e;)Ljava/lang/Object;", "Ltv0/k;", "vehicle", "b4", "(Ltv0/k;Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "Lth3/a$a;", "M3", "()Lmu/g;", "vehicleListData", "O2", "()Lth3/a$a;", "currentVehicleListData", "a", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: th3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"Lth3/a$a;", "", "Lsv0/y;", "processId", "Ltv0/m;", "pages", "", "Ltv0/k;", "manuallyAddedVehicles", "selectedVehicle", "<init>", "(Lsv0/y;Ltv0/m;Ljava/util/List;Ltv0/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/y;", "c", "()Lsv0/y;", "b", "Ltv0/m;", "()Ltv0/m;", "Ljava/util/List;", "()Ljava/util/List;", "d", "Ltv0/k;", "()Ltv0/k;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProcessId processId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEVehiclesPages pages;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BEVehicleDataWithType> manuallyAddedVehicles;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEVehicleDataWithType selectedVehicle;

        public Data(ProcessId processId, BEVehiclesPages bEVehiclesPages, List<BEVehicleDataWithType> list, BEVehicleDataWithType bEVehicleDataWithType) {
            this.processId = processId;
            this.pages = bEVehiclesPages;
            this.manuallyAddedVehicles = list;
            this.selectedVehicle = bEVehicleDataWithType;
        }

        public final List<BEVehicleDataWithType> a() {
            return this.manuallyAddedVehicles;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BEVehiclesPages getPages() {
            return this.pages;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ProcessId getProcessId() {
            return this.processId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final BEVehicleDataWithType getSelectedVehicle() {
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
            return t.c(this.processId, data.processId) && t.c(this.pages, data.pages) && t.c(this.manuallyAddedVehicles, data.manuallyAddedVehicles) && t.c(this.selectedVehicle, data.selectedVehicle);
        }

        public int hashCode() {
            int iHashCode = ((((this.processId.hashCode() * 31) + this.pages.hashCode()) * 31) + this.manuallyAddedVehicles.hashCode()) * 31;
            BEVehicleDataWithType bEVehicleDataWithType = this.selectedVehicle;
            return iHashCode + (bEVehicleDataWithType == null ? 0 : bEVehicleDataWithType.hashCode());
        }

        public String toString() {
            return "Data(processId=" + this.processId + ", pages=" + this.pages + ", manuallyAddedVehicles=" + this.manuallyAddedVehicles + ", selectedVehicle=" + this.selectedVehicle + ')';
        }
    }

    Object J3(l<? super BEVehiclesPages, BEVehiclesPages> lVar, e<? super i0> eVar);

    g<Data> M3();

    Data O2();

    Object X5(e<? super i0> eVar);

    Object b4(BEVehicleDataWithType bEVehicleDataWithType, e<? super i0> eVar);
}
