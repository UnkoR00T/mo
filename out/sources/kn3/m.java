package kn3;

import bn3.VehicleDocumentData;
import iq0.DashboardServiceEntry;
import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lkn3/m;", "", "<init>", "()V", "b", "a", "Lkn3/m$a;", "Lkn3/m$b;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class m {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkn3/m$b;", "Lkn3/m;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f111579a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return 879632180;
        }

        public String toString() {
            return "Initial";
        }
    }

    public /* synthetic */ m(fr.k kVar) {
        this();
    }

    private m() {
    }

    /* JADX INFO: renamed from: kn3.m$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ^\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b%\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b)\u0010\"R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010*\u001a\u0004\b#\u0010+¨\u0006,"}, d2 = {"Lkn3/m$a;", "Lkn3/m;", "Lbn3/h;", "vehicleDocumentData", "", "bottomSheetVisible", "expirationInsuranceAlertVisible", "expirationTechnicalExamAlertVisible", "Ljava/time/OffsetDateTime;", "currentDateTime", "vehicleDetailsAccordionState", "", "Liq0/p;", "availableServices", "<init>", "(Lbn3/h;ZZZLjava/time/OffsetDateTime;ZLjava/util/List;)V", "a", "(Lbn3/h;ZZZLjava/time/OffsetDateTime;ZLjava/util/List;)Lkn3/m$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lbn3/h;", "i", "()Lbn3/h;", "b", "Z", "d", "()Z", "c", "f", "g", "e", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "h", "Ljava/util/List;", "()Ljava/util/List;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DataLoaded extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final VehicleDocumentData vehicleDocumentData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean bottomSheetVisible;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean expirationInsuranceAlertVisible;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean expirationTechnicalExamAlertVisible;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final OffsetDateTime currentDateTime;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean vehicleDetailsAccordionState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<DashboardServiceEntry> availableServices;

        public DataLoaded(VehicleDocumentData vehicleDocumentData, boolean z15, boolean z16, boolean z17, OffsetDateTime offsetDateTime, boolean z18, List<DashboardServiceEntry> list) {
            super(null);
            this.vehicleDocumentData = vehicleDocumentData;
            this.bottomSheetVisible = z15;
            this.expirationInsuranceAlertVisible = z16;
            this.expirationTechnicalExamAlertVisible = z17;
            this.currentDateTime = offsetDateTime;
            this.vehicleDetailsAccordionState = z18;
            this.availableServices = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DataLoaded b(DataLoaded dataLoaded, VehicleDocumentData vehicleDocumentData, boolean z15, boolean z16, boolean z17, OffsetDateTime offsetDateTime, boolean z18, List list, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                vehicleDocumentData = dataLoaded.vehicleDocumentData;
            }
            if ((i15 & 2) != 0) {
                z15 = dataLoaded.bottomSheetVisible;
            }
            if ((i15 & 4) != 0) {
                z16 = dataLoaded.expirationInsuranceAlertVisible;
            }
            if ((i15 & 8) != 0) {
                z17 = dataLoaded.expirationTechnicalExamAlertVisible;
            }
            if ((i15 & 16) != 0) {
                offsetDateTime = dataLoaded.currentDateTime;
            }
            if ((i15 & 32) != 0) {
                z18 = dataLoaded.vehicleDetailsAccordionState;
            }
            if ((i15 & 64) != 0) {
                list = dataLoaded.availableServices;
            }
            boolean z19 = z18;
            List list2 = list;
            OffsetDateTime offsetDateTime2 = offsetDateTime;
            boolean z25 = z16;
            return dataLoaded.a(vehicleDocumentData, z15, z25, z17, offsetDateTime2, z19, list2);
        }

        public final DataLoaded a(VehicleDocumentData vehicleDocumentData, boolean bottomSheetVisible, boolean expirationInsuranceAlertVisible, boolean expirationTechnicalExamAlertVisible, OffsetDateTime currentDateTime, boolean vehicleDetailsAccordionState, List<DashboardServiceEntry> availableServices) {
            return new DataLoaded(vehicleDocumentData, bottomSheetVisible, expirationInsuranceAlertVisible, expirationTechnicalExamAlertVisible, currentDateTime, vehicleDetailsAccordionState, availableServices);
        }

        public final List<DashboardServiceEntry> c() {
            return this.availableServices;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getBottomSheetVisible() {
            return this.bottomSheetVisible;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final OffsetDateTime getCurrentDateTime() {
            return this.currentDateTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DataLoaded)) {
                return false;
            }
            DataLoaded dataLoaded = (DataLoaded) other;
            return fr.t.c(this.vehicleDocumentData, dataLoaded.vehicleDocumentData) && this.bottomSheetVisible == dataLoaded.bottomSheetVisible && this.expirationInsuranceAlertVisible == dataLoaded.expirationInsuranceAlertVisible && this.expirationTechnicalExamAlertVisible == dataLoaded.expirationTechnicalExamAlertVisible && fr.t.c(this.currentDateTime, dataLoaded.currentDateTime) && this.vehicleDetailsAccordionState == dataLoaded.vehicleDetailsAccordionState && fr.t.c(this.availableServices, dataLoaded.availableServices);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getExpirationInsuranceAlertVisible() {
            return this.expirationInsuranceAlertVisible;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getExpirationTechnicalExamAlertVisible() {
            return this.expirationTechnicalExamAlertVisible;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getVehicleDetailsAccordionState() {
            return this.vehicleDetailsAccordionState;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.vehicleDocumentData.hashCode() * 31) + Boolean.hashCode(this.bottomSheetVisible)) * 31) + Boolean.hashCode(this.expirationInsuranceAlertVisible)) * 31) + Boolean.hashCode(this.expirationTechnicalExamAlertVisible)) * 31) + this.currentDateTime.hashCode()) * 31) + Boolean.hashCode(this.vehicleDetailsAccordionState)) * 31;
            List<DashboardServiceEntry> list = this.availableServices;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final VehicleDocumentData getVehicleDocumentData() {
            return this.vehicleDocumentData;
        }

        public String toString() {
            return "DataLoaded(vehicleDocumentData=" + this.vehicleDocumentData + ", bottomSheetVisible=" + this.bottomSheetVisible + ", expirationInsuranceAlertVisible=" + this.expirationInsuranceAlertVisible + ", expirationTechnicalExamAlertVisible=" + this.expirationTechnicalExamAlertVisible + ", currentDateTime=" + this.currentDateTime + ", vehicleDetailsAccordionState=" + this.vehicleDetailsAccordionState + ", availableServices=" + this.availableServices + ')';
        }

        public /* synthetic */ DataLoaded(VehicleDocumentData vehicleDocumentData, boolean z15, boolean z16, boolean z17, OffsetDateTime offsetDateTime, boolean z18, List list, int i15, fr.k kVar) {
            this(vehicleDocumentData, (i15 & 2) != 0 ? false : z15, (i15 & 4) != 0 ? true : z16, (i15 & 8) != 0 ? true : z17, offsetDateTime, z18, list);
        }
    }
}
