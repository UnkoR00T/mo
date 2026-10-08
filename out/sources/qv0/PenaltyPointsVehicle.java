package qv0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: qv0.d, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0019"}, d2 = {"Lqv0/d;", "", "", "registrationNumber", "brand", "model", "type", "countryOfRegistration", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "e", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PenaltyPointsVehicle {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String registrationNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String brand;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String model;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryOfRegistration;

    public PenaltyPointsVehicle(String str, String str2, String str3, String str4, String str5) {
        this.registrationNumber = str;
        this.brand = str2;
        this.model = str3;
        this.type = str4;
        this.countryOfRegistration = str5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCountryOfRegistration() {
        return this.countryOfRegistration;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRegistrationNumber() {
        return this.registrationNumber;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PenaltyPointsVehicle)) {
            return false;
        }
        PenaltyPointsVehicle penaltyPointsVehicle = (PenaltyPointsVehicle) other;
        return t.c(this.registrationNumber, penaltyPointsVehicle.registrationNumber) && t.c(this.brand, penaltyPointsVehicle.brand) && t.c(this.model, penaltyPointsVehicle.model) && t.c(this.type, penaltyPointsVehicle.type) && t.c(this.countryOfRegistration, penaltyPointsVehicle.countryOfRegistration);
    }

    public int hashCode() {
        String str = this.registrationNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.brand;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.model;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.countryOfRegistration;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "PenaltyPointsVehicle(registrationNumber=" + this.registrationNumber + ", brand=" + this.brand + ", model=" + this.model + ", type=" + this.type + ", countryOfRegistration=" + this.countryOfRegistration + ")";
    }
}
