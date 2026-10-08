package fw0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.d4, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u000fR\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006!"}, d2 = {"Lfw0/d4;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lfw0/a4;", "a", "Lfw0/a4;", "()Lfw0/a4;", "insuranceVerificationDate", "b", "e", "vehicleIdentifier", "", "Lfw0/b4;", "c", "Ljava/util/List;", "()Ljava/util/List;", "insurances", "d", "Ljava/lang/String;", "queryUuid", "Lfw0/s1;", "Lfw0/s1;", "()Lfw0/s1;", "statement", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleInsuranceVerificationResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("insuranceVerificationDate")
    private final VehicleInsuranceDataDto insuranceVerificationDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("vehicleIdentifier")
    private final VehicleInsuranceDataDto vehicleIdentifier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("insurances")
    private final List<VehicleInsuranceDto> insurances;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("queryUuid")
    private final String queryUuid;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("statement")
    private final StatementDto statement;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final VehicleInsuranceDataDto getInsuranceVerificationDate() {
        return this.insuranceVerificationDate;
    }

    public final List<VehicleInsuranceDto> b() {
        return this.insurances;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getQueryUuid() {
        return this.queryUuid;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final StatementDto getStatement() {
        return this.statement;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final VehicleInsuranceDataDto getVehicleIdentifier() {
        return this.vehicleIdentifier;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleInsuranceVerificationResponse)) {
            return false;
        }
        VehicleInsuranceVerificationResponse vehicleInsuranceVerificationResponse = (VehicleInsuranceVerificationResponse) other;
        return fr.t.c(this.insuranceVerificationDate, vehicleInsuranceVerificationResponse.insuranceVerificationDate) && fr.t.c(this.vehicleIdentifier, vehicleInsuranceVerificationResponse.vehicleIdentifier) && fr.t.c(this.insurances, vehicleInsuranceVerificationResponse.insurances) && fr.t.c(this.queryUuid, vehicleInsuranceVerificationResponse.queryUuid) && fr.t.c(this.statement, vehicleInsuranceVerificationResponse.statement);
    }

    public int hashCode() {
        int iHashCode = ((this.insuranceVerificationDate.hashCode() * 31) + this.vehicleIdentifier.hashCode()) * 31;
        List<VehicleInsuranceDto> list = this.insurances;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.queryUuid;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        StatementDto statementDto = this.statement;
        return iHashCode3 + (statementDto != null ? statementDto.hashCode() : 0);
    }

    public String toString() {
        return "VehicleInsuranceVerificationResponse(insuranceVerificationDate=" + this.insuranceVerificationDate + ", vehicleIdentifier=" + this.vehicleIdentifier + ", insurances=" + this.insurances + ", queryUuid=" + this.queryUuid + ", statement=" + this.statement + ')';
    }
}
