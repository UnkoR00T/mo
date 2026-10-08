package dt0;

import et0.AdministrativeAreaDto;
import et0.AutocompleteDataDto;
import et0.AutocompleteResponse;
import et0.CoordinatesDto;
import et0.GeocodeLocationResponse;
import et0.PlaceDetailsDto;
import et0.PlaceDetailsResponse;
import ht0.BEPlaceDetails;
import ht0.BEPlaceSuggestion;
import ht0.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import vy.Coordinates;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u00020\u0002*\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\r\u001a\u00020\t*\u00020\f¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u0010\u001a\u00020\t*\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Let0/d;", "", "Lht0/c;", "f", "(Let0/d;)Ljava/util/List;", "Let0/b;", "e", "(Let0/b;)Lht0/c;", "Let0/g;", "Lht0/a;", "c", "(Let0/g;)Lht0/a;", "Let0/h;", "d", "(Let0/h;)Lht0/a;", "Let0/f;", "b", "(Let0/f;)Lht0/a;", "Let0/e;", "Lvy/c;", "g", "(Let0/e;)Lvy/c;", "Let0/a;", "Lht0/a$a;", "a", "(Let0/a;)Lht0/a$a;", "places_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    private static final BEPlaceDetails.AdministrativeDivision a(AdministrativeAreaDto administrativeAreaDto) {
        return new BEPlaceDetails.AdministrativeDivision(administrativeAreaDto.getAdministrativeDivision1(), administrativeAreaDto.getAdministrativeDivision2());
    }

    public static final BEPlaceDetails b(GeocodeLocationResponse geocodeLocationResponse) {
        return c(geocodeLocationResponse.getPlaceDetails());
    }

    private static final BEPlaceDetails c(PlaceDetailsDto placeDetailsDto) {
        Coordinates coordinatesG = g(placeDetailsDto.getCoordinates());
        String fullAddress = placeDetailsDto.getFullAddress();
        String strA = b.a(placeDetailsDto.getPlaceId());
        AdministrativeAreaDto administrativeDivision = placeDetailsDto.getAdministrativeDivision();
        return new BEPlaceDetails(coordinatesG, fullAddress, strA, administrativeDivision != null ? a(administrativeDivision) : null, placeDetailsDto.getCountryISO(), placeDetailsDto.getCountryName(), null);
    }

    public static final BEPlaceDetails d(PlaceDetailsResponse placeDetailsResponse) {
        return c(placeDetailsResponse.getPlaceDetails());
    }

    private static final BEPlaceSuggestion e(AutocompleteDataDto autocompleteDataDto) {
        return new BEPlaceSuggestion(b.a(autocompleteDataDto.getPlaceId()), autocompleteDataDto.getSuggestedAddress(), null);
    }

    public static final List<BEPlaceSuggestion> f(AutocompleteResponse autocompleteResponse) {
        List<AutocompleteDataDto> listA = autocompleteResponse.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(e((AutocompleteDataDto) it.next()));
        }
        return arrayList;
    }

    private static final Coordinates g(CoordinatesDto coordinatesDto) {
        return new Coordinates(coordinatesDto.getLatitude(), coordinatesDto.getLongitude());
    }
}
