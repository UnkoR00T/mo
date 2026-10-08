package w04;

import fr.k;
import fr.t;
import fu.r;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;
import pq.v;
import vy.Coordinates;

/* JADX INFO: renamed from: w04.c, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ`\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010\u0012R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b$\u0010\u0012R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b \u0010)R\u0011\u0010*\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0012R\u0011\u0010+\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0012R\u0011\u0010-\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0012¨\u0006."}, d2 = {"Lw04/c;", "", "Lmx/a;", "placeOfName", "streetNameAndNumber", "cityName", "postalCode", "voivodeshipName", "", "country", "countryCode", "Lvy/c;", "coordinates", "<init>", "(Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Ljava/lang/String;Ljava/lang/String;Lvy/c;)V", "a", "(Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Ljava/lang/String;Ljava/lang/String;Lvy/c;)Lw04/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmx/a;", "j", "()Lmx/a;", "b", "l", "c", "d", "k", "e", "m", "f", "Ljava/lang/String;", "g", "h", "Lvy/c;", "()Lvy/c;", "fullAddress", "fullAddressWithCountry", "i", "fullAddressWithPlaceName", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LocationDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label placeOfName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label streetNameAndNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label cityName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label postalCode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label voivodeshipName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String country;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryCode;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinates coordinates;

    public LocationDetails() {
        this(null, null, null, null, null, null, null, null, GF2Field.MASK, null);
    }

    public static /* synthetic */ LocationDetails b(LocationDetails locationDetails, Label label, Label label2, Label label3, Label label4, Label label5, String str, String str2, Coordinates coordinates, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            label = locationDetails.placeOfName;
        }
        if ((i15 & 2) != 0) {
            label2 = locationDetails.streetNameAndNumber;
        }
        if ((i15 & 4) != 0) {
            label3 = locationDetails.cityName;
        }
        if ((i15 & 8) != 0) {
            label4 = locationDetails.postalCode;
        }
        if ((i15 & 16) != 0) {
            label5 = locationDetails.voivodeshipName;
        }
        if ((i15 & 32) != 0) {
            str = locationDetails.country;
        }
        if ((i15 & 64) != 0) {
            str2 = locationDetails.countryCode;
        }
        if ((i15 & 128) != 0) {
            coordinates = locationDetails.coordinates;
        }
        String str3 = str2;
        Coordinates coordinates2 = coordinates;
        Label label6 = label5;
        String str4 = str;
        return locationDetails.a(label, label2, label3, label4, label6, str4, str3, coordinates2);
    }

    public final LocationDetails a(Label placeOfName, Label streetNameAndNumber, Label cityName, Label postalCode, Label voivodeshipName, String country, String countryCode, Coordinates coordinates) {
        return new LocationDetails(placeOfName, streetNameAndNumber, cityName, postalCode, voivodeshipName, country, countryCode, coordinates);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getCityName() {
        return this.cityName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationDetails)) {
            return false;
        }
        LocationDetails locationDetails = (LocationDetails) other;
        return t.c(this.placeOfName, locationDetails.placeOfName) && t.c(this.streetNameAndNumber, locationDetails.streetNameAndNumber) && t.c(this.cityName, locationDetails.cityName) && t.c(this.postalCode, locationDetails.postalCode) && t.c(this.voivodeshipName, locationDetails.voivodeshipName) && t.c(this.country, locationDetails.country) && t.c(this.countryCode, locationDetails.countryCode) && t.c(this.coordinates, locationDetails.coordinates);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String g() {
        List listQ = v.q(this.streetNameAndNumber.getText(), this.postalCode.getText(), this.cityName.getText());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQ) {
            if (!r.t0((String) obj)) {
                arrayList.add(obj);
            }
        }
        return v.v0(arrayList, ", ", null, null, 0, null, null, 62, null);
    }

    public final String h() {
        List listQ = v.q(this.streetNameAndNumber.getText(), this.postalCode.getText(), this.cityName.getText(), this.country);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQ) {
            if (!r.t0((String) obj)) {
                arrayList.add(obj);
            }
        }
        return v.v0(arrayList, ", ", null, null, 0, null, null, 62, null);
    }

    public int hashCode() {
        return (((((((((((((this.placeOfName.hashCode() * 31) + this.streetNameAndNumber.hashCode()) * 31) + this.cityName.hashCode()) * 31) + this.postalCode.hashCode()) * 31) + this.voivodeshipName.hashCode()) * 31) + this.country.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.coordinates.hashCode();
    }

    public final String i() {
        List listQ = v.q(this.placeOfName.getText(), g());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQ) {
            if (!r.t0((String) obj)) {
                arrayList.add(obj);
            }
        }
        return v.v0(arrayList, ", ", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Label getPlaceOfName() {
        return this.placeOfName;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Label getPostalCode() {
        return this.postalCode;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Label getStreetNameAndNumber() {
        return this.streetNameAndNumber;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Label getVoivodeshipName() {
        return this.voivodeshipName;
    }

    public String toString() {
        return "LocationDetails(placeOfName=" + this.placeOfName + ", streetNameAndNumber=" + this.streetNameAndNumber + ", cityName=" + this.cityName + ", postalCode=" + this.postalCode + ", voivodeshipName=" + this.voivodeshipName + ", country=" + this.country + ", countryCode=" + this.countryCode + ", coordinates=" + this.coordinates + ")";
    }

    public LocationDetails(Label label, Label label2, Label label3, Label label4, Label label5, String str, String str2, Coordinates coordinates) {
        this.placeOfName = label;
        this.streetNameAndNumber = label2;
        this.cityName = label3;
        this.postalCode = label4;
        this.voivodeshipName = label5;
        this.country = str;
        this.countryCode = str2;
        this.coordinates = coordinates;
    }

    public /* synthetic */ LocationDetails(Label label, Label label2, Label label3, Label label4, Label label5, String str, String str2, Coordinates coordinates, int i15, k kVar) {
        this((i15 & 1) != 0 ? Label.INSTANCE.c() : label, (i15 & 2) != 0 ? Label.INSTANCE.c() : label2, (i15 & 4) != 0 ? Label.INSTANCE.c() : label3, (i15 & 8) != 0 ? Label.INSTANCE.c() : label4, (i15 & 16) != 0 ? Label.INSTANCE.c() : label5, (i15 & 32) != 0 ? "" : str, (i15 & 64) != 0 ? "" : str2, (i15 & 128) != 0 ? t04.b.f186822a.b() : coordinates);
    }
}
