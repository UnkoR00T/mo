package ct0;

import et0.AutocompleteRequest;
import et0.AutocompleteResponse;
import et0.GeocodeLocationResponse;
import et0.PlaceDetailsResponse;
import ge4.x;
import ie4.f;
import ie4.i;
import ie4.o;
import ie4.s;
import ie4.t;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\nH§@¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lct0/a;", "", "Let0/c;", "autocompleteRequest", "", "externalSessionToken", "Lge4/x;", "Let0/d;", "c", "(Let0/c;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "latitude", "longitude", "Let0/f;", "a", "(DDLtq/e;)Ljava/lang/Object;", "placeId", "Let0/h;", "b", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "places_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @f("abroad-travel/mobile/api/places/geocode/location")
    Object a(@t("latitude") double d15, @t("longitude") double d16, e<? super x<GeocodeLocationResponse>> eVar);

    @f("abroad-travel/mobile/api/places/details/{placeId}")
    Object b(@s("placeId") String str, @i("External-Session-Token") String str2, e<? super x<PlaceDetailsResponse>> eVar);

    @o("abroad-travel/mobile/api/places/autocomplete")
    Object c(@ie4.a AutocompleteRequest autocompleteRequest, @i("External-Session-Token") String str, e<? super x<AutocompleteResponse>> eVar);
}
