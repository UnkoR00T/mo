package wv0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: wv0.f, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001f\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b\"\u0010%¨\u0006&"}, d2 = {"Lwv0/f;", "", "Lwv0/b;", "insuranceVerificationDate", "Lwv0/e;", "vehicleIdentifier", "", "Lwv0/a;", "insurances", "", "queryUuid", "Lwv0/d;", "topAlertData", "<init>", "(Lwv0/b;Lwv0/e;Ljava/util/List;Ljava/lang/String;Lwv0/d;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwv0/b;", "()Lwv0/b;", "b", "Lwv0/e;", "e", "()Lwv0/e;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Ljava/lang/String;", "Lwv0/d;", "()Lwv0/d;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleInsuranceVerificationData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final InsuranceVerificationDateData insuranceVerificationDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final VehicleIdentifierData vehicleIdentifier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<InsuranceData> insurances;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String queryUuid;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final TopAlertData topAlertData;

    public VehicleInsuranceVerificationData(InsuranceVerificationDateData bVar, VehicleIdentifierData eVar, List<InsuranceData> list, String str, TopAlertData dVar) {
        this.insuranceVerificationDate = bVar;
        this.vehicleIdentifier = eVar;
        this.insurances = list;
        this.queryUuid = str;
        this.topAlertData = dVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InsuranceVerificationDateData getInsuranceVerificationDate() {
        return this.insuranceVerificationDate;
    }

    public final List<InsuranceData> b() {
        return this.insurances;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getQueryUuid() {
        return this.queryUuid;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TopAlertData getTopAlertData() {
        return this.topAlertData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final VehicleIdentifierData getVehicleIdentifier() {
        return this.vehicleIdentifier;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleInsuranceVerificationData)) {
            return false;
        }
        VehicleInsuranceVerificationData vehicleInsuranceVerificationData = (VehicleInsuranceVerificationData) other;
        return t.c(this.insuranceVerificationDate, vehicleInsuranceVerificationData.insuranceVerificationDate) && t.c(this.vehicleIdentifier, vehicleInsuranceVerificationData.vehicleIdentifier) && t.c(this.insurances, vehicleInsuranceVerificationData.insurances) && t.c(this.queryUuid, vehicleInsuranceVerificationData.queryUuid) && t.c(this.topAlertData, vehicleInsuranceVerificationData.topAlertData);
    }

    public int hashCode() {
        int iHashCode = ((((((this.insuranceVerificationDate.hashCode() * 31) + this.vehicleIdentifier.hashCode()) * 31) + this.insurances.hashCode()) * 31) + this.queryUuid.hashCode()) * 31;
        TopAlertData dVar = this.topAlertData;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public String toString() {
        return "VehicleInsuranceVerificationData(insuranceVerificationDate=" + this.insuranceVerificationDate + ", vehicleIdentifier=" + this.vehicleIdentifier + ", insurances=" + this.insurances + ", queryUuid=" + this.queryUuid + ", topAlertData=" + this.topAlertData + ")";
    }
}
