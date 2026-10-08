package id4;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: id4.m3, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001c"}, d2 = {"Lid4/m3;", "", "", "vin", "plate", "", "skipForm", "Ljava/time/LocalDate;", "firstRegistrationDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/time/LocalDate;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OpenVehicleHistory {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String vin;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String plate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean skipForm;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate firstRegistrationDate;

    public OpenVehicleHistory(String str, String str2, Boolean bool, LocalDate localDate) {
        this.vin = str;
        this.plate = str2;
        this.skipForm = bool;
        this.firstRegistrationDate = localDate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getFirstRegistrationDate() {
        return this.firstRegistrationDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPlate() {
        return this.plate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getSkipForm() {
        return this.skipForm;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getVin() {
        return this.vin;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenVehicleHistory)) {
            return false;
        }
        OpenVehicleHistory openVehicleHistory = (OpenVehicleHistory) other;
        return fr.t.c(this.vin, openVehicleHistory.vin) && fr.t.c(this.plate, openVehicleHistory.plate) && fr.t.c(this.skipForm, openVehicleHistory.skipForm) && fr.t.c(this.firstRegistrationDate, openVehicleHistory.firstRegistrationDate);
    }

    public int hashCode() {
        String str = this.vin;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.plate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.skipForm;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        LocalDate localDate = this.firstRegistrationDate;
        return iHashCode3 + (localDate != null ? localDate.hashCode() : 0);
    }

    public String toString() {
        return "OpenVehicleHistory(vin=" + this.vin + ", plate=" + this.plate + ", skipForm=" + this.skipForm + ", firstRegistrationDate=" + this.firstRegistrationDate + ')';
    }
}
