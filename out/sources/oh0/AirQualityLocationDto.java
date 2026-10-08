package oh0;

import fr.t;
import java.math.BigDecimal;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: oh0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001c\u0010\u0004¨\u0006\u001e"}, d2 = {"Loh0/a;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "city", "b", "id", "Ljava/math/BigDecimal;", "c", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "latitude", "d", "longitude", "e", "name", "f", "postcode", "g", "street", "airqualityservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AirQualityLocationDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("city")
    private final String city;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("id")
    private final String id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("latitude")
    private final BigDecimal latitude;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("longitude")
    private final BigDecimal longitude;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("name")
    private final String name;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("postcode")
    private final String postcode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("street")
    private final String street;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BigDecimal getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AirQualityLocationDto)) {
            return false;
        }
        AirQualityLocationDto airQualityLocationDto = (AirQualityLocationDto) other;
        return t.c(this.city, airQualityLocationDto.city) && t.c(this.id, airQualityLocationDto.id) && t.c(this.latitude, airQualityLocationDto.latitude) && t.c(this.longitude, airQualityLocationDto.longitude) && t.c(this.name, airQualityLocationDto.name) && t.c(this.postcode, airQualityLocationDto.postcode) && t.c(this.street, airQualityLocationDto.street);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPostcode() {
        return this.postcode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.city.hashCode() * 31) + this.id.hashCode()) * 31) + this.latitude.hashCode()) * 31) + this.longitude.hashCode()) * 31) + this.name.hashCode()) * 31) + this.postcode.hashCode()) * 31;
        String str = this.street;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AirQualityLocationDto(city=" + this.city + ", id=" + this.id + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", name=" + this.name + ", postcode=" + this.postcode + ", street=" + this.street + ')';
    }
}
