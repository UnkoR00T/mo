package fw0;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.c4, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001e"}, d2 = {"Lfw0/c4;", "", "Ljava/time/OffsetDateTime;", "insuranceVerificationDate", "Lfw0/z3;", "vehicleIdentifierType", "", "vehicleIdentifierValue", "<init>", "(Ljava/time/OffsetDateTime;Lfw0/z3;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/OffsetDateTime;", "getInsuranceVerificationDate", "()Ljava/time/OffsetDateTime;", "b", "Lfw0/z3;", "getVehicleIdentifierType", "()Lfw0/z3;", "c", "Ljava/lang/String;", "getVehicleIdentifierValue", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleInsuranceVerificationRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("insuranceVerificationDate")
    private final OffsetDateTime insuranceVerificationDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("vehicleIdentifierType")
    private final z3 vehicleIdentifierType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("vehicleIdentifierValue")
    private final String vehicleIdentifierValue;

    public VehicleInsuranceVerificationRequest(OffsetDateTime offsetDateTime, z3 z3Var, String str) {
        this.insuranceVerificationDate = offsetDateTime;
        this.vehicleIdentifierType = z3Var;
        this.vehicleIdentifierValue = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleInsuranceVerificationRequest)) {
            return false;
        }
        VehicleInsuranceVerificationRequest vehicleInsuranceVerificationRequest = (VehicleInsuranceVerificationRequest) other;
        return fr.t.c(this.insuranceVerificationDate, vehicleInsuranceVerificationRequest.insuranceVerificationDate) && this.vehicleIdentifierType == vehicleInsuranceVerificationRequest.vehicleIdentifierType && fr.t.c(this.vehicleIdentifierValue, vehicleInsuranceVerificationRequest.vehicleIdentifierValue);
    }

    public int hashCode() {
        return (((this.insuranceVerificationDate.hashCode() * 31) + this.vehicleIdentifierType.hashCode()) * 31) + this.vehicleIdentifierValue.hashCode();
    }

    public String toString() {
        return "VehicleInsuranceVerificationRequest(insuranceVerificationDate=" + this.insuranceVerificationDate + ", vehicleIdentifierType=" + this.vehicleIdentifierType + ", vehicleIdentifierValue=" + this.vehicleIdentifierValue + ')';
    }
}
