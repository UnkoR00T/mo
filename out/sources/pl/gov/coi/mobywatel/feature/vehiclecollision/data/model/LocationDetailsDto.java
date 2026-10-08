package pl.gov.coi.mobywatel.feature.vehiclecollision.data.model;

import androidx.annotation.Keep;
import fr.k;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/LocationDetailsDto;", "", "placeOfName", "", "streetNameAndNumber", "cityName", "postalCode", "voivodeshipName", "country", "latitude", "", "longitude", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V", "getPlaceOfName", "()Ljava/lang/String;", "getStreetNameAndNumber", "getCityName", "getPostalCode", "getVoivodeshipName", "getCountry", "getLatitude", "()D", "getLongitude", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LocationDetailsDto {
    public static final int $stable = 0;

    @c("cityName")
    private final String cityName;

    @c("country")
    private final String country;

    @c("latitude")
    private final double latitude;

    @c("longitude")
    private final double longitude;

    @c("placeOfName")
    private final String placeOfName;

    @c("postalCode")
    private final String postalCode;

    @c("streetNameAndNumber")
    private final String streetNameAndNumber;

    @c("voivodeshipName")
    private final String voivodeshipName;

    public LocationDetailsDto(String str, String str2, String str3, String str4, String str5, String str6, double d15, double d16) {
        this.placeOfName = str;
        this.streetNameAndNumber = str2;
        this.cityName = str3;
        this.postalCode = str4;
        this.voivodeshipName = str5;
        this.country = str6;
        this.latitude = d15;
        this.longitude = d16;
    }

    public final String getCityName() {
        return this.cityName;
    }

    public final String getCountry() {
        return this.country;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final String getPlaceOfName() {
        return this.placeOfName;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getStreetNameAndNumber() {
        return this.streetNameAndNumber;
    }

    public final String getVoivodeshipName() {
        return this.voivodeshipName;
    }

    public /* synthetic */ LocationDetailsDto(String str, String str2, String str3, String str4, String str5, String str6, double d15, double d16, int i15, k kVar) {
        this(str, str2, str3, str4, str5, (i15 & 32) != 0 ? "" : str6, d15, d16);
    }
}
