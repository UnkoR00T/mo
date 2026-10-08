package uw1;

import aj0.ElectronicCapabilityData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Luw1/b;", "", "a", "c", "b", "d", "Luw1/b$a;", "Luw1/b$b;", "Luw1/b$c;", "Luw1/b$d;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Luw1/b$a;", "Luw1/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f201885a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 1973141822;
        }

        public String toString() {
            return "Empty";
        }
    }

    /* JADX INFO: renamed from: uw1.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Luw1/b$b;", "Luw1/b;", "Lww1/a;", "serviceType", "Lhb4/c;", "errorVMS", "<init>", "(Lww1/a;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lww1/a;", "b", "()Lww1/a;", "Lhb4/c;", "()Lhb4/c;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ww1.a serviceType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMS;

        public Error(ww1.a aVar, hb4.c cVar) {
            this.serviceType = aVar;
            this.errorVMS = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final hb4.c getErrorVMS() {
            return this.errorVMS;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ww1.a getServiceType() {
            return this.serviceType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return this.serviceType == error.serviceType && fr.t.c(this.errorVMS, error.errorVMS);
        }

        public int hashCode() {
            return (this.serviceType.hashCode() * 31) + this.errorVMS.hashCode();
        }

        public String toString() {
            return "Error(serviceType=" + this.serviceType + ", errorVMS=" + this.errorVMS + ')';
        }
    }

    /* JADX INFO: renamed from: uw1.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Luw1/b$c;", "Luw1/b;", "Lww1/a;", "serviceType", "<init>", "(Lww1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lww1/a;", "()Lww1/a;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GettingStatus implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ww1.a serviceType;

        public GettingStatus(ww1.a aVar) {
            this.serviceType = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ww1.a getServiceType() {
            return this.serviceType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GettingStatus) && this.serviceType == ((GettingStatus) other).serviceType;
        }

        public int hashCode() {
            return this.serviceType.hashCode();
        }

        public String toString() {
            return "GettingStatus(serviceType=" + this.serviceType + ')';
        }
    }

    /* JADX INFO: renamed from: uw1.b$d, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Luw1/b$d;", "Luw1/b;", "Lww1/a;", "serviceType", "Laj0/a;", "capabilityData", "<init>", "(Lww1/a;Laj0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lww1/a;", "b", "()Lww1/a;", "Laj0/a;", "()Laj0/a;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StatusUnavailable implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ww1.a serviceType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ElectronicCapabilityData capabilityData;

        public StatusUnavailable(ww1.a aVar, ElectronicCapabilityData electronicCapabilityData) {
            this.serviceType = aVar;
            this.capabilityData = electronicCapabilityData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ElectronicCapabilityData getCapabilityData() {
            return this.capabilityData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ww1.a getServiceType() {
            return this.serviceType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatusUnavailable)) {
                return false;
            }
            StatusUnavailable statusUnavailable = (StatusUnavailable) other;
            return this.serviceType == statusUnavailable.serviceType && fr.t.c(this.capabilityData, statusUnavailable.capabilityData);
        }

        public int hashCode() {
            return (this.serviceType.hashCode() * 31) + this.capabilityData.hashCode();
        }

        public String toString() {
            return "StatusUnavailable(serviceType=" + this.serviceType + ", capabilityData=" + this.capabilityData + ')';
        }
    }
}
