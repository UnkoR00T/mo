package et0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: et0.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\r\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001f"}, d2 = {"Let0/g;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Let0/e;", "a", "Let0/e;", "b", "()Let0/e;", "coordinates", "Ljava/lang/String;", "e", "fullAddress", "c", "f", "placeId", "Let0/a;", "d", "Let0/a;", "()Let0/a;", "administrativeDivision", "countryISO", "countryName", "places_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlaceDetailsDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("coordinates")
    private final CoordinatesDto coordinates;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fullAddress")
    private final String fullAddress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("placeId")
    private final String placeId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("administrativeDivision")
    private final AdministrativeAreaDto administrativeDivision;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("countryISO")
    private final String countryISO;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("countryName")
    private final String countryName;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AdministrativeAreaDto getAdministrativeDivision() {
        return this.administrativeDivision;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CoordinatesDto getCoordinates() {
        return this.coordinates;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCountryISO() {
        return this.countryISO;
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
        if (!(other instanceof PlaceDetailsDto)) {
            return false;
        }
        PlaceDetailsDto placeDetailsDto = (PlaceDetailsDto) other;
        return t.c(this.coordinates, placeDetailsDto.coordinates) && t.c(this.fullAddress, placeDetailsDto.fullAddress) && t.c(this.placeId, placeDetailsDto.placeId) && t.c(this.administrativeDivision, placeDetailsDto.administrativeDivision) && t.c(this.countryISO, placeDetailsDto.countryISO) && t.c(this.countryName, placeDetailsDto.countryName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPlaceId() {
        return this.placeId;
    }

    public int hashCode() {
        int iHashCode = ((((this.coordinates.hashCode() * 31) + this.fullAddress.hashCode()) * 31) + this.placeId.hashCode()) * 31;
        AdministrativeAreaDto administrativeAreaDto = this.administrativeDivision;
        int iHashCode2 = (iHashCode + (administrativeAreaDto == null ? 0 : administrativeAreaDto.hashCode())) * 31;
        String str = this.countryISO;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.countryName;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "PlaceDetailsDto(coordinates=" + this.coordinates + ", fullAddress=" + this.fullAddress + ", placeId=" + this.placeId + ", administrativeDivision=" + this.administrativeDivision + ", countryISO=" + this.countryISO + ", countryName=" + this.countryName + ')';
    }
}
