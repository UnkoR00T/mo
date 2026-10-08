package x83;

import fr.k;
import fr.t;
import java.util.List;
import java.util.Map;
import oo0.BEReportIssueReason;
import oq.y;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;
import v83.Field;

/* JADX INFO: renamed from: x83.e, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001\u0012Bo\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011Jx\u0010\u0012\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00062\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b$\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00068\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b%\u0010#R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e8\u0006¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lx83/e;", "", "", "Lv83/c;", "Lhz/b;", "fieldsValidationMap", "Lv83/b;", "", "reportVehicleNumber", "vehicleUserNames", "Lx83/f;", "ownerStatus", "Loo0/b;", "issueReasonSelected", "", "vehicleCardReportReasons", "<init>", "(Ljava/util/Map;Lv83/b;Lv83/b;Lv83/b;Lv83/b;Ljava/util/List;)V", "a", "(Ljava/util/Map;Lv83/b;Lv83/b;Lv83/b;Lv83/b;Ljava/util/List;)Lx83/e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "b", "Lv83/b;", "f", "()Lv83/b;", "h", "d", "e", "Ljava/util/List;", "g", "()Ljava/util/List;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleCardInitializedData {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f217407h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map<v83.c, hz.b.C2039b> f217408i;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<v83.c, hz.b> fieldsValidationMap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Field<String> reportVehicleNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Field<String> vehicleUserNames;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Field<f> ownerStatus;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Field<BEReportIssueReason> issueReasonSelected;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEReportIssueReason> vehicleCardReportReasons;

    static {
        v83.c cVar = v83.c.OWNER_NAMES;
        hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
        f217408i = v0.l(y.a(cVar, c2039b), y.a(v83.c.VEHICLE_NUMBER, c2039b), y.a(v83.c.OWNERSHIP_STATUS, c2039b), y.a(v83.c.REPORT_REASON, c2039b));
    }

    public VehicleCardInitializedData() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VehicleCardInitializedData b(VehicleCardInitializedData vehicleCardInitializedData, Map map, Field field, Field field2, Field field3, Field field4, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            map = vehicleCardInitializedData.fieldsValidationMap;
        }
        if ((i15 & 2) != 0) {
            field = vehicleCardInitializedData.reportVehicleNumber;
        }
        if ((i15 & 4) != 0) {
            field2 = vehicleCardInitializedData.vehicleUserNames;
        }
        if ((i15 & 8) != 0) {
            field3 = vehicleCardInitializedData.ownerStatus;
        }
        if ((i15 & 16) != 0) {
            field4 = vehicleCardInitializedData.issueReasonSelected;
        }
        if ((i15 & 32) != 0) {
            list = vehicleCardInitializedData.vehicleCardReportReasons;
        }
        Field field5 = field4;
        List list2 = list;
        return vehicleCardInitializedData.a(map, field, field2, field3, field5, list2);
    }

    public final VehicleCardInitializedData a(Map<v83.c, ? extends hz.b> fieldsValidationMap, Field<String> reportVehicleNumber, Field<String> vehicleUserNames, Field<f> ownerStatus, Field<BEReportIssueReason> issueReasonSelected, List<BEReportIssueReason> vehicleCardReportReasons) {
        return new VehicleCardInitializedData(fieldsValidationMap, reportVehicleNumber, vehicleUserNames, ownerStatus, issueReasonSelected, vehicleCardReportReasons);
    }

    public final Map<v83.c, hz.b> c() {
        return this.fieldsValidationMap;
    }

    public final Field<BEReportIssueReason> d() {
        return this.issueReasonSelected;
    }

    public final Field<f> e() {
        return this.ownerStatus;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleCardInitializedData)) {
            return false;
        }
        VehicleCardInitializedData vehicleCardInitializedData = (VehicleCardInitializedData) other;
        return t.c(this.fieldsValidationMap, vehicleCardInitializedData.fieldsValidationMap) && t.c(this.reportVehicleNumber, vehicleCardInitializedData.reportVehicleNumber) && t.c(this.vehicleUserNames, vehicleCardInitializedData.vehicleUserNames) && t.c(this.ownerStatus, vehicleCardInitializedData.ownerStatus) && t.c(this.issueReasonSelected, vehicleCardInitializedData.issueReasonSelected) && t.c(this.vehicleCardReportReasons, vehicleCardInitializedData.vehicleCardReportReasons);
    }

    public final Field<String> f() {
        return this.reportVehicleNumber;
    }

    public final List<BEReportIssueReason> g() {
        return this.vehicleCardReportReasons;
    }

    public final Field<String> h() {
        return this.vehicleUserNames;
    }

    public int hashCode() {
        return (((((((((this.fieldsValidationMap.hashCode() * 31) + this.reportVehicleNumber.hashCode()) * 31) + this.vehicleUserNames.hashCode()) * 31) + this.ownerStatus.hashCode()) * 31) + this.issueReasonSelected.hashCode()) * 31) + this.vehicleCardReportReasons.hashCode();
    }

    public String toString() {
        return "VehicleCardInitializedData(fieldsValidationMap=" + this.fieldsValidationMap + ", reportVehicleNumber=" + this.reportVehicleNumber + ", vehicleUserNames=" + this.vehicleUserNames + ", ownerStatus=" + this.ownerStatus + ", issueReasonSelected=" + this.issueReasonSelected + ", vehicleCardReportReasons=" + this.vehicleCardReportReasons + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VehicleCardInitializedData(Map<v83.c, ? extends hz.b> map, Field<String> field, Field<String> field2, Field<f> field3, Field<BEReportIssueReason> field4, List<BEReportIssueReason> list) {
        this.fieldsValidationMap = map;
        this.reportVehicleNumber = field;
        this.vehicleUserNames = field2;
        this.ownerStatus = field3;
        this.issueReasonSelected = field4;
        this.vehicleCardReportReasons = list;
    }

    public /* synthetic */ VehicleCardInitializedData(Map map, Field field, Field field2, Field field3, Field field4, List list, int i15, k kVar) {
        this((i15 & 1) != 0 ? f217408i : map, (i15 & 2) != 0 ? new Field("", v83.c.VEHICLE_NUMBER) : field, (i15 & 4) != 0 ? new Field("", v83.c.OWNER_NAMES) : field2, (i15 & 8) != 0 ? new Field(f.UNKNOWN, v83.c.OWNERSHIP_STATUS) : field3, (i15 & 16) != 0 ? new Field(null, v83.c.REPORT_REASON) : field4, (i15 & 32) != 0 ? v.n() : list);
    }
}
