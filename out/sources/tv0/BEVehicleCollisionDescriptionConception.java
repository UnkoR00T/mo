package tv0;

import fr.t;
import fu.r;
import iy.b0;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import p071kotlin.Metadata;
import pq.v;
import vy.Coordinates;

/* JADX INFO: renamed from: tv0.i, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\nB'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Ltv0/i;", "", "Lfz/b$d;", "date", "Ltv0/i$a;", "address", "Liy/b0;", "description", "<init>", "(Lfz/b$d;Ltv0/i$a;Liy/b0;)V", "a", "(Lfz/b$d;Ltv0/i$a;Liy/b0;)Ltv0/i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lfz/b$d;", "d", "()Lfz/b$d;", "b", "Ltv0/i$a;", "c", "()Ltv0/i$a;", "Liy/b0;", "e", "()Liy/b0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEVehicleCollisionDescriptionConception {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDateTime date;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocationDetails address;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 description;

    /* JADX INFO: renamed from: tv0.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJV\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001f\u0010'R\u0011\u0010(\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0011R\u0011\u0010)\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0011¨\u0006*"}, d2 = {"Ltv0/i$a;", "", "Lmx/a;", "placeOfName", "streetNameAndNumber", "cityName", "postalCode", "voivodeshipName", "", "country", "Lvy/c;", "coordinates", "<init>", "(Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Ljava/lang/String;Lvy/c;)V", "a", "(Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Ljava/lang/String;Lvy/c;)Ltv0/i$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmx/a;", "h", "()Lmx/a;", "b", "j", "c", "d", "i", "e", "k", "f", "Ljava/lang/String;", "g", "Lvy/c;", "()Lvy/c;", "fullAddress", "fullAddressWithPlaceName", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LocationDetails {

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
        private final Coordinates coordinates;

        public LocationDetails(Label label, Label label2, Label label3, Label label4, Label label5, String str, Coordinates coordinates) {
            this.placeOfName = label;
            this.streetNameAndNumber = label2;
            this.cityName = label3;
            this.postalCode = label4;
            this.voivodeshipName = label5;
            this.country = str;
            this.coordinates = coordinates;
        }

        public static /* synthetic */ LocationDetails b(LocationDetails locationDetails, Label label, Label label2, Label label3, Label label4, Label label5, String str, Coordinates coordinates, int i15, Object obj) {
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
                coordinates = locationDetails.coordinates;
            }
            String str2 = str;
            Coordinates coordinates2 = coordinates;
            Label label6 = label5;
            Label label7 = label3;
            return locationDetails.a(label, label2, label7, label4, label6, str2, coordinates2);
        }

        public final LocationDetails a(Label placeOfName, Label streetNameAndNumber, Label cityName, Label postalCode, Label voivodeshipName, String country, Coordinates coordinates) {
            return new LocationDetails(placeOfName, streetNameAndNumber, cityName, postalCode, voivodeshipName, country, coordinates);
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
            return t.c(this.placeOfName, locationDetails.placeOfName) && t.c(this.streetNameAndNumber, locationDetails.streetNameAndNumber) && t.c(this.cityName, locationDetails.cityName) && t.c(this.postalCode, locationDetails.postalCode) && t.c(this.voivodeshipName, locationDetails.voivodeshipName) && t.c(this.country, locationDetails.country) && t.c(this.coordinates, locationDetails.coordinates);
        }

        public final String f() {
            List listQ = v.q(this.streetNameAndNumber.getText(), this.postalCode.getText(), this.cityName.getText());
            ArrayList arrayList = new ArrayList();
            for (Object obj : listQ) {
                if (!r.t0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            return v.v0(arrayList, ", ", null, null, 0, null, null, 62, null);
        }

        public final String g() {
            List listQ = v.q(this.placeOfName.getText(), f());
            ArrayList arrayList = new ArrayList();
            for (Object obj : listQ) {
                if (!r.t0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            return v.v0(arrayList, ", ", null, null, 0, null, null, 62, null);
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final Label getPlaceOfName() {
            return this.placeOfName;
        }

        public int hashCode() {
            return (((((((((((this.placeOfName.hashCode() * 31) + this.streetNameAndNumber.hashCode()) * 31) + this.cityName.hashCode()) * 31) + this.postalCode.hashCode()) * 31) + this.voivodeshipName.hashCode()) * 31) + this.country.hashCode()) * 31) + this.coordinates.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final Label getPostalCode() {
            return this.postalCode;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final Label getStreetNameAndNumber() {
            return this.streetNameAndNumber;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final Label getVoivodeshipName() {
            return this.voivodeshipName;
        }

        public String toString() {
            return "LocationDetails(placeOfName=" + this.placeOfName + ", streetNameAndNumber=" + this.streetNameAndNumber + ", cityName=" + this.cityName + ", postalCode=" + this.postalCode + ", voivodeshipName=" + this.voivodeshipName + ", country=" + this.country + ", coordinates=" + this.coordinates + ")";
        }
    }

    public BEVehicleCollisionDescriptionConception() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ BEVehicleCollisionDescriptionConception b(BEVehicleCollisionDescriptionConception bEVehicleCollisionDescriptionConception, fz.b.LocalDateTime localDateTime, LocationDetails locationDetails, b0 b0Var, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            localDateTime = bEVehicleCollisionDescriptionConception.date;
        }
        if ((i15 & 2) != 0) {
            locationDetails = bEVehicleCollisionDescriptionConception.address;
        }
        if ((i15 & 4) != 0) {
            b0Var = bEVehicleCollisionDescriptionConception.description;
        }
        return bEVehicleCollisionDescriptionConception.a(localDateTime, locationDetails, b0Var);
    }

    public final BEVehicleCollisionDescriptionConception a(fz.b.LocalDateTime date, LocationDetails address, b0 description) {
        return new BEVehicleCollisionDescriptionConception(date, address, description);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocationDetails getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final fz.b.LocalDateTime getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b0 getDescription() {
        return this.description;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEVehicleCollisionDescriptionConception)) {
            return false;
        }
        BEVehicleCollisionDescriptionConception bEVehicleCollisionDescriptionConception = (BEVehicleCollisionDescriptionConception) other;
        return t.c(this.date, bEVehicleCollisionDescriptionConception.date) && t.c(this.address, bEVehicleCollisionDescriptionConception.address) && t.c(this.description, bEVehicleCollisionDescriptionConception.description);
    }

    public int hashCode() {
        int iHashCode = this.date.hashCode() * 31;
        LocationDetails locationDetails = this.address;
        return ((iHashCode + (locationDetails == null ? 0 : locationDetails.hashCode())) * 31) + this.description.hashCode();
    }

    public String toString() {
        return "BEVehicleCollisionDescriptionConception(date=" + this.date + ", address=" + this.address + ", description=" + this.description + ")";
    }

    public BEVehicleCollisionDescriptionConception(fz.b.LocalDateTime localDateTime, LocationDetails locationDetails, b0 b0Var) {
        this.date = localDateTime;
        this.address = locationDetails;
        this.description = b0Var;
    }

    public /* synthetic */ BEVehicleCollisionDescriptionConception(fz.b.LocalDateTime localDateTime, LocationDetails locationDetails, b0 b0Var, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? new fz.b.LocalDateTime(LocalDateTime.now()) : localDateTime, (i15 & 2) != 0 ? null : locationDetails, (i15 & 4) != 0 ? b0.INSTANCE.a() : b0Var);
    }
}
