package pn3;

import bn3.VehicleDocumentsFullData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lpn3/o;", "", "c", "b", "a", "Lpn3/o$a;", "Lpn3/o$b;", "Lpn3/o$c;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface o {

    /* JADX INFO: renamed from: pn3.o$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, d2 = {"Lpn3/o$a;", "Lpn3/o;", "Lbn3/j;", "vehicles", "", "shortName", "<init>", "(Lbn3/j;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbn3/j;", "b", "()Lbn3/j;", "Ljava/lang/String;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DataLoaded implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final VehicleDocumentsFullData vehicles;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String shortName;

        public DataLoaded(VehicleDocumentsFullData vehicleDocumentsFullData, String str) {
            this.vehicles = vehicleDocumentsFullData;
            this.shortName = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getShortName() {
            return this.shortName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final VehicleDocumentsFullData getVehicles() {
            return this.vehicles;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DataLoaded)) {
                return false;
            }
            DataLoaded dataLoaded = (DataLoaded) other;
            return fr.t.c(this.vehicles, dataLoaded.vehicles) && fr.t.c(this.shortName, dataLoaded.shortName);
        }

        public int hashCode() {
            int iHashCode = this.vehicles.hashCode() * 31;
            String str = this.shortName;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "DataLoaded(vehicles=" + this.vehicles + ", shortName=" + this.shortName + ')';
        }
    }

    /* JADX INFO: renamed from: pn3.o$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lpn3/o$b;", "Lpn3/o;", "", "shortName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Empty implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String shortName;

        public Empty(String str) {
            this.shortName = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getShortName() {
            return this.shortName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Empty) && fr.t.c(this.shortName, ((Empty) other).shortName);
        }

        public int hashCode() {
            String str = this.shortName;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Empty(shortName=" + this.shortName + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpn3/o$c;", "Lpn3/o;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f161275a = new c();

        private c() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return 8469820;
        }

        public String toString() {
            return "Initial";
        }
    }
}
