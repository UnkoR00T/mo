package fa3;

import p071kotlin.Metadata;
import vy.Coordinates;
import w04.LocationDetails;
import z93.Place;
import z93.PlaceDetails;
import z93.PlaceSuggestion;
import z93.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lz93/d;", "Lz93/c;", "b", "(Lz93/d;)Lz93/c;", "Lw04/c;", "a", "(Lw04/c;)Lz93/c;", "Lz93/g;", "c", "(Lw04/c;)Lz93/g;", "travelabroad_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final Place a(LocationDetails locationDetails) {
        Coordinates coordinates = locationDetails.getCoordinates();
        String countryCode = locationDetails.getCountryCode();
        String strH = locationDetails.h();
        if (strH.length() == 0) {
            strH = null;
        }
        return new Place(null, coordinates, countryCode, strH, locationDetails.getCountry(), null);
    }

    public static final Place b(PlaceDetails placeDetails) {
        PlaceDetails.AdministrativeDivision administrativeDivision = placeDetails.getAdministrativeDivision();
        String division1 = administrativeDivision != null ? administrativeDivision.getDivision1() : null;
        PlaceDetails.AdministrativeDivision administrativeDivision2 = placeDetails.getAdministrativeDivision();
        Place.AdministrationDivision administrationDivision = new Place.AdministrationDivision(division1, administrativeDivision2 != null ? administrativeDivision2.getDivision2() : null);
        Coordinates coordinates = placeDetails.getCoordinates();
        String countryIso = placeDetails.getCountryIso();
        if (countryIso == null) {
            countryIso = "";
        }
        return new Place(administrationDivision, coordinates, countryIso, placeDetails.getFullAddress(), placeDetails.getCountryName(), new Place.Identifiers(placeDetails.getPlaceId(), null, null, null, null));
    }

    public static final PlaceSuggestion c(LocationDetails locationDetails) {
        return new PlaceSuggestion(e.a(""), locationDetails.h(), null);
    }
}
