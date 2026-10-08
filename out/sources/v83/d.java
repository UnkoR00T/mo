package v83;

import p071kotlin.Metadata;
import x83.CommonInitializedData;
import x83.VehicleCardInitializedData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lv83/d;", "", "a", "b", "Lv83/d$a;", "Lv83/d$b;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lv83/d$a;", "Lv83/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f204535a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return -715467101;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: v83.d$b, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lv83/d$b;", "Lv83/d;", "Lx83/a;", "commonFormData", "Lx83/e;", "vehicleCardData", "Lx83/c;", "drivingLicenceIssueType", "<init>", "(Lx83/a;Lx83/e;Lx83/c;)V", "a", "(Lx83/a;Lx83/e;Lx83/c;)Lv83/d$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lx83/a;", "c", "()Lx83/a;", "b", "Lx83/e;", "e", "()Lx83/e;", "Lx83/c;", "d", "()Lx83/c;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CommonInitializedData commonFormData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final VehicleCardInitializedData vehicleCardData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final x83.c drivingLicenceIssueType;

        public Initialized(CommonInitializedData commonInitializedData, VehicleCardInitializedData vehicleCardInitializedData, x83.c cVar) {
            this.commonFormData = commonInitializedData;
            this.vehicleCardData = vehicleCardInitializedData;
            this.drivingLicenceIssueType = cVar;
        }

        public static /* synthetic */ Initialized b(Initialized initialized, CommonInitializedData commonInitializedData, VehicleCardInitializedData vehicleCardInitializedData, x83.c cVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                commonInitializedData = initialized.commonFormData;
            }
            if ((i15 & 2) != 0) {
                vehicleCardInitializedData = initialized.vehicleCardData;
            }
            if ((i15 & 4) != 0) {
                cVar = initialized.drivingLicenceIssueType;
            }
            return initialized.a(commonInitializedData, vehicleCardInitializedData, cVar);
        }

        public final Initialized a(CommonInitializedData commonFormData, VehicleCardInitializedData vehicleCardData, x83.c drivingLicenceIssueType) {
            return new Initialized(commonFormData, vehicleCardData, drivingLicenceIssueType);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final CommonInitializedData getCommonFormData() {
            return this.commonFormData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final x83.c getDrivingLicenceIssueType() {
            return this.drivingLicenceIssueType;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final VehicleCardInitializedData getVehicleCardData() {
            return this.vehicleCardData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.commonFormData, initialized.commonFormData) && fr.t.c(this.vehicleCardData, initialized.vehicleCardData) && this.drivingLicenceIssueType == initialized.drivingLicenceIssueType;
        }

        public int hashCode() {
            return (((this.commonFormData.hashCode() * 31) + this.vehicleCardData.hashCode()) * 31) + this.drivingLicenceIssueType.hashCode();
        }

        public String toString() {
            return "Initialized(commonFormData=" + this.commonFormData + ", vehicleCardData=" + this.vehicleCardData + ", drivingLicenceIssueType=" + this.drivingLicenceIssueType + ')';
        }

        public /* synthetic */ Initialized(CommonInitializedData commonInitializedData, VehicleCardInitializedData vehicleCardInitializedData, x83.c cVar, int i15, fr.k kVar) {
            this(commonInitializedData, (i15 & 2) != 0 ? new VehicleCardInitializedData(null, null, null, null, null, null, 63, null) : vehicleCardInitializedData, (i15 & 4) != 0 ? x83.c.DATA_DISCREPANCY : cVar);
        }
    }
}
