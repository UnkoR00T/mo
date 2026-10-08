package z93;

import fr.t;
import p071kotlin.Metadata;
import vy.Coordinates;

/* JADX INFO: renamed from: z93.c, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0017\u001aBA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b \u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006$"}, d2 = {"Lz93/c;", "", "Lz93/c$a;", "administrativeDivisions", "Lvy/c;", "coordinates", "", "countryIso", "fullAddress", "countryName", "Lz93/c$b;", "identifiers", "<init>", "(Lz93/c$a;Lvy/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lz93/c$b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz93/c$a;", "()Lz93/c$a;", "b", "Lvy/c;", "()Lvy/c;", "c", "Ljava/lang/String;", "d", "e", "f", "Lz93/c$b;", "()Lz93/c$b;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Place {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f233700g = Coordinates.f208679c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AdministrationDivision administrativeDivisions;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates coordinates;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryIso;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fullAddress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Identifiers identifiers;

    /* JADX INFO: renamed from: z93.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lz93/c$a;", "", "", "division1", "division2", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdministrationDivision {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String division1;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String division2;

        public AdministrationDivision(String str, String str2) {
            this.division1 = str;
            this.division2 = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDivision1() {
            return this.division1;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDivision2() {
            return this.division2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdministrationDivision)) {
                return false;
            }
            AdministrationDivision administrationDivision = (AdministrationDivision) other;
            return t.c(this.division1, administrationDivision.division1) && t.c(this.division2, administrationDivision.division2);
        }

        public int hashCode() {
            String str = this.division1;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.division2;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "AdministrationDivision(division1=" + this.division1 + ", division2=" + this.division2 + ')';
        }
    }

    /* JADX INFO: renamed from: z93.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lz93/c$b;", "", "", "placeId", "placeIdAdministrativeDivision1", "placeIdAdministrativeDivision2", "placeIdCity", "placeIdCountry", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "e", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Identifiers {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String placeId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String placeIdAdministrativeDivision1;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String placeIdAdministrativeDivision2;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String placeIdCity;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String placeIdCountry;

        public Identifiers(String str, String str2, String str3, String str4, String str5) {
            this.placeId = str;
            this.placeIdAdministrativeDivision1 = str2;
            this.placeIdAdministrativeDivision2 = str3;
            this.placeIdCity = str4;
            this.placeIdCountry = str5;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPlaceId() {
            return this.placeId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPlaceIdAdministrativeDivision1() {
            return this.placeIdAdministrativeDivision1;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPlaceIdAdministrativeDivision2() {
            return this.placeIdAdministrativeDivision2;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPlaceIdCity() {
            return this.placeIdCity;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPlaceIdCountry() {
            return this.placeIdCountry;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Identifiers)) {
                return false;
            }
            Identifiers identifiers = (Identifiers) other;
            return t.c(this.placeId, identifiers.placeId) && t.c(this.placeIdAdministrativeDivision1, identifiers.placeIdAdministrativeDivision1) && t.c(this.placeIdAdministrativeDivision2, identifiers.placeIdAdministrativeDivision2) && t.c(this.placeIdCity, identifiers.placeIdCity) && t.c(this.placeIdCountry, identifiers.placeIdCountry);
        }

        public int hashCode() {
            String str = this.placeId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.placeIdAdministrativeDivision1;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.placeIdAdministrativeDivision2;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.placeIdCity;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.placeIdCountry;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "Identifiers(placeId=" + this.placeId + ", placeIdAdministrativeDivision1=" + this.placeIdAdministrativeDivision1 + ", placeIdAdministrativeDivision2=" + this.placeIdAdministrativeDivision2 + ", placeIdCity=" + this.placeIdCity + ", placeIdCountry=" + this.placeIdCountry + ')';
        }
    }

    public Place(AdministrationDivision administrationDivision, Coordinates coordinates, String str, String str2, String str3, Identifiers identifiers) {
        this.administrativeDivisions = administrationDivision;
        this.coordinates = coordinates;
        this.countryIso = str;
        this.fullAddress = str2;
        this.countryName = str3;
        this.identifiers = identifiers;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AdministrationDivision getAdministrativeDivisions() {
        return this.administrativeDivisions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCountryIso() {
        return this.countryIso;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCountryName() {
        return this.countryName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getFullAddress() {
        return this.fullAddress;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Place)) {
            return false;
        }
        Place place = (Place) other;
        return t.c(this.administrativeDivisions, place.administrativeDivisions) && t.c(this.coordinates, place.coordinates) && t.c(this.countryIso, place.countryIso) && t.c(this.fullAddress, place.fullAddress) && t.c(this.countryName, place.countryName) && t.c(this.identifiers, place.identifiers);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Identifiers getIdentifiers() {
        return this.identifiers;
    }

    public int hashCode() {
        AdministrationDivision administrationDivision = this.administrativeDivisions;
        int iHashCode = (((administrationDivision == null ? 0 : administrationDivision.hashCode()) * 31) + this.coordinates.hashCode()) * 31;
        String str = this.countryIso;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fullAddress;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countryName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Identifiers identifiers = this.identifiers;
        return iHashCode4 + (identifiers != null ? identifiers.hashCode() : 0);
    }

    public String toString() {
        return "Place(administrativeDivisions=" + this.administrativeDivisions + ", coordinates=" + this.coordinates + ", countryIso=" + this.countryIso + ", fullAddress=" + this.fullAddress + ", countryName=" + this.countryName + ", identifiers=" + this.identifiers + ')';
    }
}
