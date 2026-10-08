package u14;

import mx.Label;
import p071kotlin.Metadata;
import vy.Address;
import vy.Coordinates;
import w04.LocationDetails;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvy/a;", "Lw04/c;", "b", "(Lvy/a;)Lw04/c;", "common_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final LocationDetails b(Address address) {
        String strValueOf;
        Coordinates coordinatesB;
        if (address.getThoroughfare() == null || address.getSubThoroughfare() == null) {
            strValueOf = address.getThoroughfare() != null ? String.valueOf(address.getThoroughfare()) : "";
        } else {
            strValueOf = address.getThoroughfare() + ' ' + address.getSubThoroughfare();
        }
        Label labelB = mx.b.b(strValueOf, "streetNameAndNumber");
        String locality = address.getLocality();
        if (locality == null) {
            locality = "";
        }
        Label labelB2 = mx.b.b(locality, "cityName");
        String postalCode = address.getPostalCode();
        if (postalCode == null) {
            postalCode = "";
        }
        Label labelB3 = mx.b.b(postalCode, "postalCode");
        String adminArea = address.getAdminArea();
        if (adminArea == null) {
            adminArea = "";
        }
        Label labelB4 = mx.b.b(adminArea, "voivodeshipName");
        String countryName = address.getCountryName();
        String str = countryName == null ? "" : countryName;
        String countryCode = address.getCountryCode();
        String str2 = countryCode == null ? "" : countryCode;
        if (address.getCoordinates() == null || (coordinatesB = address.getCoordinates()) == null) {
            coordinatesB = t04.b.f186822a.b();
        }
        return new LocationDetails(null, labelB, labelB2, labelB3, labelB4, str, str2, coordinatesB, 1, null);
    }
}
