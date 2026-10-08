package qt3;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: qt3.d, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\f\u0010\"R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\r\u001a\u0004\b%\u0010\u0004R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\r\u001a\u0004\b(\u0010\u0004¨\u0006*"}, d2 = {"Lqt3/d;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "name", "b", "getSurname", "surname", "c", "getPesel", "pesel", "d", "getCardNumber", "cardNumber", "e", "getIssuer", "issuer", "f", "getQrCode", "qrCode", "Ljava/time/LocalDate;", "g", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "expirationDate", "h", "getDisabilityLevel", "disabilityLevel", "i", "getDisabilityReasonCode", "disabilityReasonCode", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DisabledPersonDataContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("name")
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("surname")
    private final String surname;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pesel")
    private final String pesel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("cardNumber")
    private final String cardNumber;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("issuer")
    private final String issuer;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("qrCode")
    private final String qrCode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("expirationDate")
    private final LocalDate expirationDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("disabilityLevel")
    private final String disabilityLevel;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("disabilityReasonCode")
    private final String disabilityReasonCode;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisabledPersonDataContainer)) {
            return false;
        }
        DisabledPersonDataContainer disabledPersonDataContainer = (DisabledPersonDataContainer) other;
        return fr.t.c(this.name, disabledPersonDataContainer.name) && fr.t.c(this.surname, disabledPersonDataContainer.surname) && fr.t.c(this.pesel, disabledPersonDataContainer.pesel) && fr.t.c(this.cardNumber, disabledPersonDataContainer.cardNumber) && fr.t.c(this.issuer, disabledPersonDataContainer.issuer) && fr.t.c(this.qrCode, disabledPersonDataContainer.qrCode) && fr.t.c(this.expirationDate, disabledPersonDataContainer.expirationDate) && fr.t.c(this.disabilityLevel, disabledPersonDataContainer.disabilityLevel) && fr.t.c(this.disabilityReasonCode, disabledPersonDataContainer.disabilityReasonCode);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.name.hashCode() * 31) + this.surname.hashCode()) * 31) + this.pesel.hashCode()) * 31) + this.cardNumber.hashCode()) * 31) + this.issuer.hashCode()) * 31) + this.qrCode.hashCode()) * 31;
        LocalDate localDate = this.expirationDate;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str = this.disabilityLevel;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.disabilityReasonCode;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DisabledPersonDataContainer(name=" + this.name + ", surname=" + this.surname + ", pesel=" + this.pesel + ", cardNumber=" + this.cardNumber + ", issuer=" + this.issuer + ", qrCode=" + this.qrCode + ", expirationDate=" + this.expirationDate + ", disabilityLevel=" + this.disabilityLevel + ", disabilityReasonCode=" + this.disabilityReasonCode + ')';
    }
}
