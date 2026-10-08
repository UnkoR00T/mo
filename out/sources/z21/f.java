package z21;

import p071kotlin.Metadata;
import wv0.VehicleInsuranceVerificationData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lz21/f;", "", "Lwv0/f;", "a", "()Lwv0/f;", "insuranceData", "b", "Lz21/f$a;", "Lz21/f$b;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f {

    /* JADX INFO: renamed from: z21.f$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lz21/f$a;", "Lz21/f;", "Lcb4/i;", "dialogVmsAdapter", "Lwv0/f;", "insuranceData", "<init>", "(Lcb4/i;Lwv0/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcb4/i;", "b", "()Lcb4/i;", "Lwv0/f;", "()Lwv0/f;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Dialog implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i dialogVmsAdapter;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final VehicleInsuranceVerificationData insuranceData;

        public Dialog(cb4.i iVar, VehicleInsuranceVerificationData vehicleInsuranceVerificationData) {
            this.dialogVmsAdapter = iVar;
            this.insuranceData = vehicleInsuranceVerificationData;
        }

        @Override // z21.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public VehicleInsuranceVerificationData getInsuranceData() {
            return this.insuranceData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final cb4.i getDialogVmsAdapter() {
            return this.dialogVmsAdapter;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dialog)) {
                return false;
            }
            Dialog dialog = (Dialog) other;
            return fr.t.c(this.dialogVmsAdapter, dialog.dialogVmsAdapter) && fr.t.c(this.insuranceData, dialog.insuranceData);
        }

        public int hashCode() {
            return (this.dialogVmsAdapter.hashCode() * 31) + this.insuranceData.hashCode();
        }

        public String toString() {
            return "Dialog(dialogVmsAdapter=" + this.dialogVmsAdapter + ", insuranceData=" + this.insuranceData + ')';
        }
    }

    /* JADX INFO: renamed from: z21.f$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lz21/f$b;", "Lz21/f;", "Lwv0/f;", "insuranceData", "<init>", "(Lwv0/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwv0/f;", "()Lwv0/f;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final VehicleInsuranceVerificationData insuranceData;

        public Initialized(VehicleInsuranceVerificationData vehicleInsuranceVerificationData) {
            this.insuranceData = vehicleInsuranceVerificationData;
        }

        @Override // z21.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public VehicleInsuranceVerificationData getInsuranceData() {
            return this.insuranceData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initialized) && fr.t.c(this.insuranceData, ((Initialized) other).insuranceData);
        }

        public int hashCode() {
            return this.insuranceData.hashCode();
        }

        public String toString() {
            return "Initialized(insuranceData=" + this.insuranceData + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    VehicleInsuranceVerificationData getInsuranceData();
}
