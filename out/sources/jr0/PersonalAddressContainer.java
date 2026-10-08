package jr0;

import fr.t;
import iy.b0;
import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jr0.k, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b$\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b\u001a\u0010\u001d¨\u0006("}, d2 = {"Ljr0/k;", "", "Liy/b0;", "streetPrefix", "streetName", "houseNumber", "postalCode", "localityTerritoryCode", "locality", "municipality", "voivodeship", "Ljava/time/LocalDate;", "permanentAddressRegistrationDate", "apartmentNumber", "<init>", "(Liy/b0;Liy/b0;Liy/b0;Liy/b0;Liy/b0;Liy/b0;Liy/b0;Liy/b0;Ljava/time/LocalDate;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "i", "()Liy/b0;", "b", "h", "c", "d", "g", "e", "f", "j", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonalAddressContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 streetPrefix;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 streetName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 houseNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 postalCode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 localityTerritoryCode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 locality;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 municipality;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 voivodeship;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate permanentAddressRegistrationDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 apartmentNumber;

    public PersonalAddressContainer(b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, b0 b0Var5, b0 b0Var6, b0 b0Var7, b0 b0Var8, LocalDate localDate, b0 b0Var9) {
        this.streetPrefix = b0Var;
        this.streetName = b0Var2;
        this.houseNumber = b0Var3;
        this.postalCode = b0Var4;
        this.localityTerritoryCode = b0Var5;
        this.locality = b0Var6;
        this.municipality = b0Var7;
        this.voivodeship = b0Var8;
        this.permanentAddressRegistrationDate = localDate;
        this.apartmentNumber = b0Var9;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getApartmentNumber() {
        return this.apartmentNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getHouseNumber() {
        return this.houseNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getLocality() {
        return this.locality;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getLocalityTerritoryCode() {
        return this.localityTerritoryCode;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b0 getMunicipality() {
        return this.municipality;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalAddressContainer)) {
            return false;
        }
        PersonalAddressContainer personalAddressContainer = (PersonalAddressContainer) other;
        return t.c(this.streetPrefix, personalAddressContainer.streetPrefix) && t.c(this.streetName, personalAddressContainer.streetName) && t.c(this.houseNumber, personalAddressContainer.houseNumber) && t.c(this.postalCode, personalAddressContainer.postalCode) && t.c(this.localityTerritoryCode, personalAddressContainer.localityTerritoryCode) && t.c(this.locality, personalAddressContainer.locality) && t.c(this.municipality, personalAddressContainer.municipality) && t.c(this.voivodeship, personalAddressContainer.voivodeship) && t.c(this.permanentAddressRegistrationDate, personalAddressContainer.permanentAddressRegistrationDate) && t.c(this.apartmentNumber, personalAddressContainer.apartmentNumber);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final LocalDate getPermanentAddressRegistrationDate() {
        return this.permanentAddressRegistrationDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final b0 getPostalCode() {
        return this.postalCode;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final b0 getStreetName() {
        return this.streetName;
    }

    public int hashCode() {
        b0 b0Var = this.streetPrefix;
        int iHashCode = (b0Var == null ? 0 : b0Var.hashCode()) * 31;
        b0 b0Var2 = this.streetName;
        int iHashCode2 = (iHashCode + (b0Var2 == null ? 0 : b0Var2.hashCode())) * 31;
        b0 b0Var3 = this.houseNumber;
        int iHashCode3 = (iHashCode2 + (b0Var3 == null ? 0 : b0Var3.hashCode())) * 31;
        b0 b0Var4 = this.postalCode;
        int iHashCode4 = (iHashCode3 + (b0Var4 == null ? 0 : b0Var4.hashCode())) * 31;
        b0 b0Var5 = this.localityTerritoryCode;
        int iHashCode5 = (iHashCode4 + (b0Var5 == null ? 0 : b0Var5.hashCode())) * 31;
        b0 b0Var6 = this.locality;
        int iHashCode6 = (iHashCode5 + (b0Var6 == null ? 0 : b0Var6.hashCode())) * 31;
        b0 b0Var7 = this.municipality;
        int iHashCode7 = (iHashCode6 + (b0Var7 == null ? 0 : b0Var7.hashCode())) * 31;
        b0 b0Var8 = this.voivodeship;
        int iHashCode8 = (iHashCode7 + (b0Var8 == null ? 0 : b0Var8.hashCode())) * 31;
        LocalDate localDate = this.permanentAddressRegistrationDate;
        int iHashCode9 = (iHashCode8 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        b0 b0Var9 = this.apartmentNumber;
        return iHashCode9 + (b0Var9 != null ? b0Var9.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final b0 getStreetPrefix() {
        return this.streetPrefix;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final b0 getVoivodeship() {
        return this.voivodeship;
    }

    public String toString() {
        return "PersonalAddressContainer(streetPrefix=" + this.streetPrefix + ", streetName=" + this.streetName + ", houseNumber=" + this.houseNumber + ", postalCode=" + this.postalCode + ", localityTerritoryCode=" + this.localityTerritoryCode + ", locality=" + this.locality + ", municipality=" + this.municipality + ", voivodeship=" + this.voivodeship + ", permanentAddressRegistrationDate=" + this.permanentAddressRegistrationDate + ", apartmentNumber=" + this.apartmentNumber + ")";
    }
}
