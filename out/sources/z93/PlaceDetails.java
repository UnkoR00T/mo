package z93;

import fr.t;
import p071kotlin.Metadata;
import vy.Coordinates;

/* JADX INFO: renamed from: z93.d, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0017\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u000f¨\u0006\""}, d2 = {"Lz93/d;", "", "Lvy/c;", "coordinates", "", "fullAddress", "Lz93/e;", "placeId", "Lz93/d$a;", "administrativeDivision", "countryIso", "countryName", "<init>", "(Lvy/c;Ljava/lang/String;Ljava/lang/String;Lz93/d$a;Ljava/lang/String;Ljava/lang/String;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvy/c;", "b", "()Lvy/c;", "Ljava/lang/String;", "e", "c", "f", "d", "Lz93/d$a;", "()Lz93/d$a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlaceDetails {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f233714g = Coordinates.f208679c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates coordinates;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fullAddress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String placeId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AdministrativeDivision administrativeDivision;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryIso;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryName;

    /* JADX INFO: renamed from: z93.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lz93/d$a;", "", "", "division1", "division2", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdministrativeDivision {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String division1;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String division2;

        public AdministrativeDivision(String str, String str2) {
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
            if (!(other instanceof AdministrativeDivision)) {
                return false;
            }
            AdministrativeDivision administrativeDivision = (AdministrativeDivision) other;
            return t.c(this.division1, administrativeDivision.division1) && t.c(this.division2, administrativeDivision.division2);
        }

        public int hashCode() {
            String str = this.division1;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.division2;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "AdministrativeDivision(division1=" + this.division1 + ", division2=" + this.division2 + ')';
        }
    }

    public /* synthetic */ PlaceDetails(Coordinates coordinates, String str, String str2, AdministrativeDivision administrativeDivision, String str3, String str4, fr.k kVar) {
        this(coordinates, str, str2, administrativeDivision, str3, str4);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AdministrativeDivision getAdministrativeDivision() {
        return this.administrativeDivision;
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
        if (!(other instanceof PlaceDetails)) {
            return false;
        }
        PlaceDetails placeDetails = (PlaceDetails) other;
        return t.c(this.coordinates, placeDetails.coordinates) && t.c(this.fullAddress, placeDetails.fullAddress) && e.b(this.placeId, placeDetails.placeId) && t.c(this.administrativeDivision, placeDetails.administrativeDivision) && t.c(this.countryIso, placeDetails.countryIso) && t.c(this.countryName, placeDetails.countryName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPlaceId() {
        return this.placeId;
    }

    public int hashCode() {
        int iHashCode = ((((this.coordinates.hashCode() * 31) + this.fullAddress.hashCode()) * 31) + e.c(this.placeId)) * 31;
        AdministrativeDivision administrativeDivision = this.administrativeDivision;
        int iHashCode2 = (iHashCode + (administrativeDivision == null ? 0 : administrativeDivision.hashCode())) * 31;
        String str = this.countryIso;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.countryName;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "PlaceDetails(coordinates=" + this.coordinates + ", fullAddress=" + this.fullAddress + ", placeId=" + ((Object) e.d(this.placeId)) + ", administrativeDivision=" + this.administrativeDivision + ", countryIso=" + this.countryIso + ", countryName=" + this.countryName + ')';
    }

    private PlaceDetails(Coordinates coordinates, String str, String str2, AdministrativeDivision administrativeDivision, String str3, String str4) {
        this.coordinates = coordinates;
        this.fullAddress = str;
        this.placeId = str2;
        this.administrativeDivision = administrativeDivision;
        this.countryIso = str3;
        this.countryName = str4;
    }
}
