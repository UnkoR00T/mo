package on3;

import bn3.VehicleDocumentData;
import fr.k;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lon3/b;", "", "<init>", "()V", "a", "b", "Lon3/b$a;", "Lon3/b$b;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: on3.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lon3/b$a;", "Lon3/b;", "", "registrationNumber", "", "enteredFromDocumentUpdate", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RegistrationNo extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String registrationNumber;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean enteredFromDocumentUpdate;

        public RegistrationNo(String str, boolean z15) {
            super(null);
            this.registrationNumber = str;
            this.enteredFromDocumentUpdate = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getEnteredFromDocumentUpdate() {
            return this.enteredFromDocumentUpdate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getRegistrationNumber() {
            return this.registrationNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RegistrationNo)) {
                return false;
            }
            RegistrationNo registrationNo = (RegistrationNo) other;
            return t.c(this.registrationNumber, registrationNo.registrationNumber) && this.enteredFromDocumentUpdate == registrationNo.enteredFromDocumentUpdate;
        }

        public int hashCode() {
            String str = this.registrationNumber;
            return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.enteredFromDocumentUpdate);
        }

        public String toString() {
            return "RegistrationNo(registrationNumber=" + this.registrationNumber + ", enteredFromDocumentUpdate=" + this.enteredFromDocumentUpdate + ')';
        }
    }

    /* JADX INFO: renamed from: on3.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lon3/b$b;", "Lon3/b;", "Lbn3/h;", "vehicleData", "<init>", "(Lbn3/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbn3/h;", "()Lbn3/h;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VehicleData extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final VehicleDocumentData vehicleData;

        public VehicleData(VehicleDocumentData vehicleDocumentData) {
            super(null);
            this.vehicleData = vehicleDocumentData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final VehicleDocumentData getVehicleData() {
            return this.vehicleData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VehicleData) && t.c(this.vehicleData, ((VehicleData) other).vehicleData);
        }

        public int hashCode() {
            return this.vehicleData.hashCode();
        }

        public String toString() {
            return "VehicleData(vehicleData=" + this.vehicleData + ')';
        }
    }

    public /* synthetic */ b(k kVar) {
        this();
    }

    private b() {
    }
}
