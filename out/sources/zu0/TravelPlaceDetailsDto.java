package zu0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: zu0.u, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b \u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b!\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b%\u0010\u0010¨\u0006&"}, d2 = {"Lzu0/u;", "", "Lzu0/g;", "coordinates", "Lzu0/a;", "administrativeDivision", "", "countryIso", "countryName", "fullAddress", "Lzu0/k;", "googleMapsIdentifier", "placeId", "<init>", "(Lzu0/g;Lzu0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzu0/k;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzu0/g;", "b", "()Lzu0/g;", "Lzu0/a;", "()Lzu0/a;", "c", "Ljava/lang/String;", "d", "e", "f", "Lzu0/k;", "()Lzu0/k;", "g", "travelabroadservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelPlaceDetailsDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("coordinates")
    private final CoordinatesDto coordinates;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("administrativeDivision")
    private final AdministrativeAreaDto administrativeDivision;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("countryIso")
    private final String countryIso;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("countryName")
    private final String countryName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fullAddress")
    private final String fullAddress;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("googleMapsIdentifier")
    private final GoogleMapsIdentifierDto googleMapsIdentifier;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("placeId")
    private final String placeId;

    public TravelPlaceDetailsDto(CoordinatesDto coordinatesDto, AdministrativeAreaDto administrativeAreaDto, String str, String str2, String str3, GoogleMapsIdentifierDto googleMapsIdentifierDto, String str4) {
        this.coordinates = coordinatesDto;
        this.administrativeDivision = administrativeAreaDto;
        this.countryIso = str;
        this.countryName = str2;
        this.fullAddress = str3;
        this.googleMapsIdentifier = googleMapsIdentifierDto;
        this.placeId = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AdministrativeAreaDto getAdministrativeDivision() {
        return this.administrativeDivision;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CoordinatesDto getCoordinates() {
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
        if (!(other instanceof TravelPlaceDetailsDto)) {
            return false;
        }
        TravelPlaceDetailsDto travelPlaceDetailsDto = (TravelPlaceDetailsDto) other;
        return fr.t.c(this.coordinates, travelPlaceDetailsDto.coordinates) && fr.t.c(this.administrativeDivision, travelPlaceDetailsDto.administrativeDivision) && fr.t.c(this.countryIso, travelPlaceDetailsDto.countryIso) && fr.t.c(this.countryName, travelPlaceDetailsDto.countryName) && fr.t.c(this.fullAddress, travelPlaceDetailsDto.fullAddress) && fr.t.c(this.googleMapsIdentifier, travelPlaceDetailsDto.googleMapsIdentifier) && fr.t.c(this.placeId, travelPlaceDetailsDto.placeId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final GoogleMapsIdentifierDto getGoogleMapsIdentifier() {
        return this.googleMapsIdentifier;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPlaceId() {
        return this.placeId;
    }

    public int hashCode() {
        int iHashCode = this.coordinates.hashCode() * 31;
        AdministrativeAreaDto administrativeAreaDto = this.administrativeDivision;
        int iHashCode2 = (iHashCode + (administrativeAreaDto == null ? 0 : administrativeAreaDto.hashCode())) * 31;
        String str = this.countryIso;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.countryName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fullAddress;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        GoogleMapsIdentifierDto googleMapsIdentifierDto = this.googleMapsIdentifier;
        int iHashCode6 = (iHashCode5 + (googleMapsIdentifierDto == null ? 0 : googleMapsIdentifierDto.hashCode())) * 31;
        String str4 = this.placeId;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "TravelPlaceDetailsDto(coordinates=" + this.coordinates + ", administrativeDivision=" + this.administrativeDivision + ", countryIso=" + this.countryIso + ", countryName=" + this.countryName + ", fullAddress=" + this.fullAddress + ", googleMapsIdentifier=" + this.googleMapsIdentifier + ", placeId=" + this.placeId + ')';
    }
}
