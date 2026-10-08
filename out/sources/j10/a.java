package j10;

import android.os.Bundle;
import com.google.android.gms.maps.model.LatLng;
import p071kotlin.Metadata;
import vy.Address;
import vy.Coordinates;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/location/Address;", "Lvy/a;", "b", "(Landroid/location/Address;)Lvy/a;", "Lvy/c;", "Lcom/google/android/gms/maps/model/LatLng;", "c", "(Lvy/c;)Lcom/google/android/gms/maps/model/LatLng;", "a", "(Lcom/google/android/gms/maps/model/LatLng;)Lvy/c;", "sensor_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final Coordinates a(LatLng latLng) {
        return new Coordinates(latLng.f31423a, latLng.f31424b);
    }

    public static final Address b(android.location.Address address) {
        String string;
        String postalCode = address.getPostalCode();
        String locality = address.getLocality();
        String adminArea = address.getAdminArea();
        String countryName = address.getCountryName();
        String countryCode = address.getCountryCode();
        String thoroughfare = address.getThoroughfare();
        String subThoroughfare = address.getSubThoroughfare();
        String premises = address.getPremises();
        String subAdminArea = address.getSubAdminArea();
        String featureName = address.getFeatureName();
        Bundle extras = address.getExtras();
        if (extras == null || (string = extras.toString()) == null) {
            string = "";
        }
        return new Address(postalCode, locality, adminArea, countryName, countryCode, thoroughfare, subThoroughfare, (address.hasLatitude() && address.hasLongitude()) ? new Coordinates(address.getLatitude(), address.getLongitude()) : null, premises, subAdminArea, featureName, string);
    }

    public static final LatLng c(Coordinates coordinates) {
        return new LatLng(coordinates.getLatitude(), coordinates.getLongitude());
    }
}
