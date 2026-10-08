package tt0;

import p071kotlin.Metadata;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0002\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Ltt0/s;", "", "e", "h", "d", "g", "c", "f", "a", "b", "Ltt0/s$e;", "Ltt0/s$h;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface s {

    /* JADX INFO: renamed from: tt0.s$a, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u0013R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b\u001b\u0010\u0013R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u0013R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u0013R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b'\u0010\u0013R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001c\u001a\u0004\b(\u0010\u0013¨\u0006)"}, d2 = {"Ltt0/s$a;", "", "", "city", "cityId", "community", "communityId", "district", "districtId", "province", "provinceId", "buildingNumber", "localNumber", "postalCode", "street", "streetId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "e", "f", "g", "j", "h", "k", "i", "l", "m", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Address {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String city;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String cityId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String community;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String communityId;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String district;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String districtId;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String province;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String provinceId;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String buildingNumber;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String localNumber;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final String postalCode;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final String street;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final String streetId;

        public Address(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
            this.city = str;
            this.cityId = str2;
            this.community = str3;
            this.communityId = str4;
            this.district = str5;
            this.districtId = str6;
            this.province = str7;
            this.provinceId = str8;
            this.buildingNumber = str9;
            this.localNumber = str10;
            this.postalCode = str11;
            this.street = str12;
            this.streetId = str13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBuildingNumber() {
            return this.buildingNumber;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCity() {
            return this.city;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCityId() {
            return this.cityId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getCommunity() {
            return this.community;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getCommunityId() {
            return this.communityId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Address)) {
                return false;
            }
            Address address = (Address) other;
            return fr.t.c(this.city, address.city) && fr.t.c(this.cityId, address.cityId) && fr.t.c(this.community, address.community) && fr.t.c(this.communityId, address.communityId) && fr.t.c(this.district, address.district) && fr.t.c(this.districtId, address.districtId) && fr.t.c(this.province, address.province) && fr.t.c(this.provinceId, address.provinceId) && fr.t.c(this.buildingNumber, address.buildingNumber) && fr.t.c(this.localNumber, address.localNumber) && fr.t.c(this.postalCode, address.postalCode) && fr.t.c(this.street, address.street) && fr.t.c(this.streetId, address.streetId);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDistrict() {
            return this.district;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getDistrictId() {
            return this.districtId;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getLocalNumber() {
            return this.localNumber;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((this.city.hashCode() * 31) + this.cityId.hashCode()) * 31) + this.community.hashCode()) * 31) + this.communityId.hashCode()) * 31) + this.district.hashCode()) * 31) + this.districtId.hashCode()) * 31) + this.province.hashCode()) * 31) + this.provinceId.hashCode()) * 31;
            String str = this.buildingNumber;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.localNumber;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.postalCode;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.street;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.streetId;
            return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getPostalCode() {
            return this.postalCode;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getProvince() {
            return this.province;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getProvinceId() {
            return this.provinceId;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getStreet() {
            return this.street;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getStreetId() {
            return this.streetId;
        }

        public String toString() {
            return "Address(city=" + this.city + ", cityId=" + this.cityId + ", community=" + this.community + ", communityId=" + this.communityId + ", district=" + this.district + ", districtId=" + this.districtId + ", province=" + this.province + ", provinceId=" + this.provinceId + ", buildingNumber=" + this.buildingNumber + ", localNumber=" + this.localNumber + ", postalCode=" + this.postalCode + ", street=" + this.street + ", streetId=" + this.streetId + ")";
        }
    }

    /* JADX INFO: renamed from: tt0.s$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0017\u0010\f¨\u0006\u001c"}, d2 = {"Ltt0/s$b;", "", "", "firstName", "lastName", "edorAddress", "Lxw/h;", "phoneNumber", "email", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxw/h;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "Lxw/h;", "e", "()Lxw/h;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ApplicantData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String firstName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String lastName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String edorAddress;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final PhoneNumber phoneNumber;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String email;

        public ApplicantData(String str, String str2, String str3, PhoneNumber phoneNumber, String str4) {
            this.firstName = str;
            this.lastName = str2;
            this.edorAddress = str3;
            this.phoneNumber = phoneNumber;
            this.email = str4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEdorAddress() {
            return this.edorAddress;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFirstName() {
            return this.firstName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getLastName() {
            return this.lastName;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final PhoneNumber getPhoneNumber() {
            return this.phoneNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApplicantData)) {
                return false;
            }
            ApplicantData applicantData = (ApplicantData) other;
            return fr.t.c(this.firstName, applicantData.firstName) && fr.t.c(this.lastName, applicantData.lastName) && fr.t.c(this.edorAddress, applicantData.edorAddress) && fr.t.c(this.phoneNumber, applicantData.phoneNumber) && fr.t.c(this.email, applicantData.email);
        }

        public int hashCode() {
            int iHashCode = ((this.firstName.hashCode() * 31) + this.lastName.hashCode()) * 31;
            String str = this.edorAddress;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            PhoneNumber phoneNumber = this.phoneNumber;
            int iHashCode3 = (iHashCode2 + (phoneNumber == null ? 0 : phoneNumber.hashCode())) * 31;
            String str2 = this.email;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "ApplicantData(firstName=" + this.firstName + ", lastName=" + this.lastName + ", edorAddress=" + this.edorAddress + ", phoneNumber=" + this.phoneNumber + ", email=" + this.email + ")";
        }
    }

    /* JADX INFO: renamed from: tt0.s$c, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Ltt0/s$c;", "", "", "nameOrPlace", "Ltt0/s$a;", "address", "<init>", "(Ljava/lang/String;Ltt0/s$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ltt0/s$a;", "()Ltt0/s$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BusinessDetailsData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String nameOrPlace;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Address address;

        public BusinessDetailsData(String str, Address address) {
            this.nameOrPlace = str;
            this.address = address;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Address getAddress() {
            return this.address;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getNameOrPlace() {
            return this.nameOrPlace;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BusinessDetailsData)) {
                return false;
            }
            BusinessDetailsData businessDetailsData = (BusinessDetailsData) other;
            return fr.t.c(this.nameOrPlace, businessDetailsData.nameOrPlace) && fr.t.c(this.address, businessDetailsData.address);
        }

        public int hashCode() {
            String str = this.nameOrPlace;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.address.hashCode();
        }

        public String toString() {
            return "BusinessDetailsData(nameOrPlace=" + this.nameOrPlace + ", address=" + this.address + ")";
        }
    }

    /* JADX INFO: renamed from: tt0.s$d, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001c"}, d2 = {"Ltt0/s$d;", "", "", "isCarriageRelated", "", "locationName", "carriageName", "Ltt0/s$a;", "address", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ltt0/s$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "Ljava/lang/String;", "c", "Ltt0/s$a;", "()Ltt0/s$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LocationData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isCarriageRelated;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String locationName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String carriageName;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Address address;

        public LocationData(boolean z15, String str, String str2, Address address) {
            this.isCarriageRelated = z15;
            this.locationName = str;
            this.carriageName = str2;
            this.address = address;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Address getAddress() {
            return this.address;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCarriageName() {
            return this.carriageName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getLocationName() {
            return this.locationName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsCarriageRelated() {
            return this.isCarriageRelated;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocationData)) {
                return false;
            }
            LocationData locationData = (LocationData) other;
            return this.isCarriageRelated == locationData.isCarriageRelated && fr.t.c(this.locationName, locationData.locationName) && fr.t.c(this.carriageName, locationData.carriageName) && fr.t.c(this.address, locationData.address);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isCarriageRelated) * 31;
            String str = this.locationName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.carriageName;
            return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.address.hashCode();
        }

        public String toString() {
            return "LocationData(isCarriageRelated=" + this.isCarriageRelated + ", locationName=" + this.locationName + ", carriageName=" + this.carriageName + ", address=" + this.address + ")";
        }
    }

    /* JADX INFO: renamed from: tt0.s$e, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010*\u001a\u0004\b%\u0010+R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001e\u0010,\u001a\u0004\b#\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b!\u0010.\u001a\u0004\b\u001c\u0010/¨\u00060"}, d2 = {"Ltt0/s$e;", "Ltt0/s;", "", "subCategoryCode", "", "wasOtherReportSentToAuthorities", "otherReportAuthorityName", "otherReportCaseNumber", "Lfz/b$c;", "otherReportDate", "Lfz/b$f;", "occurrenceDate", "description", "Ltt0/s$d;", "locationData", "Ltt0/s$b;", "applicantData", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lfz/b$c;Lfz/b$f;Ljava/lang/String;Ltt0/s$d;Ltt0/s$b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "Z", "i", "()Z", "c", "e", "d", "f", "Lfz/b$c;", "g", "()Lfz/b$c;", "Lfz/b$f;", "()Lfz/b$f;", "Ltt0/s$d;", "()Ltt0/s$d;", "Ltt0/s$b;", "()Ltt0/s$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ObjectRequest implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String subCategoryCode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean wasOtherReportSentToAuthorities;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String otherReportAuthorityName;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String otherReportCaseNumber;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.b.LocalDate otherReportDate;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.b.OffsetDateTime occurrenceDate;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String description;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocationData locationData;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final ApplicantData applicantData;

        public ObjectRequest(String str, boolean z15, String str2, String str3, fz.b.LocalDate localDate, fz.b.OffsetDateTime offsetDateTime, String str4, LocationData locationData, ApplicantData applicantData) {
            this.subCategoryCode = str;
            this.wasOtherReportSentToAuthorities = z15;
            this.otherReportAuthorityName = str2;
            this.otherReportCaseNumber = str3;
            this.otherReportDate = localDate;
            this.occurrenceDate = offsetDateTime;
            this.description = str4;
            this.locationData = locationData;
            this.applicantData = applicantData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ApplicantData getApplicantData() {
            return this.applicantData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final LocationData getLocationData() {
            return this.locationData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public fz.b.OffsetDateTime getOccurrenceDate() {
            return this.occurrenceDate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public String getOtherReportAuthorityName() {
            return this.otherReportAuthorityName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ObjectRequest)) {
                return false;
            }
            ObjectRequest objectRequest = (ObjectRequest) other;
            return fr.t.c(this.subCategoryCode, objectRequest.subCategoryCode) && this.wasOtherReportSentToAuthorities == objectRequest.wasOtherReportSentToAuthorities && fr.t.c(this.otherReportAuthorityName, objectRequest.otherReportAuthorityName) && fr.t.c(this.otherReportCaseNumber, objectRequest.otherReportCaseNumber) && fr.t.c(this.otherReportDate, objectRequest.otherReportDate) && fr.t.c(this.occurrenceDate, objectRequest.occurrenceDate) && fr.t.c(this.description, objectRequest.description) && fr.t.c(this.locationData, objectRequest.locationData) && fr.t.c(this.applicantData, objectRequest.applicantData);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public String getOtherReportCaseNumber() {
            return this.otherReportCaseNumber;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public fz.b.LocalDate getOtherReportDate() {
            return this.otherReportDate;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getSubCategoryCode() {
            return this.subCategoryCode;
        }

        public int hashCode() {
            int iHashCode = ((this.subCategoryCode.hashCode() * 31) + Boolean.hashCode(this.wasOtherReportSentToAuthorities)) * 31;
            String str = this.otherReportAuthorityName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.otherReportCaseNumber;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            fz.b.LocalDate localDate = this.otherReportDate;
            int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
            fz.b.OffsetDateTime offsetDateTime = this.occurrenceDate;
            int iHashCode5 = (((((iHashCode4 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31) + this.description.hashCode()) * 31) + this.locationData.hashCode()) * 31;
            ApplicantData applicantData = this.applicantData;
            return iHashCode5 + (applicantData != null ? applicantData.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public boolean getWasOtherReportSentToAuthorities() {
            return this.wasOtherReportSentToAuthorities;
        }

        public String toString() {
            return "ObjectRequest(subCategoryCode=" + this.subCategoryCode + ", wasOtherReportSentToAuthorities=" + this.wasOtherReportSentToAuthorities + ", otherReportAuthorityName=" + this.otherReportAuthorityName + ", otherReportCaseNumber=" + this.otherReportCaseNumber + ", otherReportDate=" + this.otherReportDate + ", occurrenceDate=" + this.occurrenceDate + ", description=" + this.description + ", locationData=" + this.locationData + ", applicantData=" + this.applicantData + ")";
        }
    }

    /* JADX INFO: renamed from: tt0.s$f, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Ltt0/s$f;", "", "", "nameOrPlace", "Ltt0/s$a;", "address", "url", "<init>", "(Ljava/lang/String;Ltt0/s$a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ltt0/s$a;", "()Ltt0/s$a;", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OnlineBusinessDetailsData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String nameOrPlace;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Address address;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        public OnlineBusinessDetailsData(String str, Address address, String str2) {
            this.nameOrPlace = str;
            this.address = address;
            this.url = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Address getAddress() {
            return this.address;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getNameOrPlace() {
            return this.nameOrPlace;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnlineBusinessDetailsData)) {
                return false;
            }
            OnlineBusinessDetailsData onlineBusinessDetailsData = (OnlineBusinessDetailsData) other;
            return fr.t.c(this.nameOrPlace, onlineBusinessDetailsData.nameOrPlace) && fr.t.c(this.address, onlineBusinessDetailsData.address) && fr.t.c(this.url, onlineBusinessDetailsData.url);
        }

        public int hashCode() {
            String str = this.nameOrPlace;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Address address = this.address;
            int iHashCode2 = (iHashCode + (address == null ? 0 : address.hashCode())) * 31;
            String str2 = this.url;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "OnlineBusinessDetailsData(nameOrPlace=" + this.nameOrPlace + ", address=" + this.address + ", url=" + this.url + ")";
        }
    }

    /* JADX INFO: renamed from: tt0.s$g, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001b\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b$\u0010\u0010¨\u0006%"}, d2 = {"Ltt0/s$g;", "", "", "onlinePurchase", "", "batchNumber", "expiryDate", "Ltt0/s$c;", "manufacturerDetails", "offlinePurchaseDetails", "Ltt0/s$f;", "onlinePurchaseDetails", "tradeName", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ltt0/s$c;Ltt0/s$c;Ltt0/s$f;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "e", "()Z", "b", "Ljava/lang/String;", "c", "d", "Ltt0/s$c;", "()Ltt0/s$c;", "f", "Ltt0/s$f;", "()Ltt0/s$f;", "g", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductIntervention {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean onlinePurchase;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String batchNumber;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String expiryDate;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final BusinessDetailsData manufacturerDetails;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final BusinessDetailsData offlinePurchaseDetails;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final OnlineBusinessDetailsData onlinePurchaseDetails;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String tradeName;

        public ProductIntervention(boolean z15, String str, String str2, BusinessDetailsData businessDetailsData, BusinessDetailsData businessDetailsData2, OnlineBusinessDetailsData onlineBusinessDetailsData, String str3) {
            this.onlinePurchase = z15;
            this.batchNumber = str;
            this.expiryDate = str2;
            this.manufacturerDetails = businessDetailsData;
            this.offlinePurchaseDetails = businessDetailsData2;
            this.onlinePurchaseDetails = onlineBusinessDetailsData;
            this.tradeName = str3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBatchNumber() {
            return this.batchNumber;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getExpiryDate() {
            return this.expiryDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final BusinessDetailsData getManufacturerDetails() {
            return this.manufacturerDetails;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final BusinessDetailsData getOfflinePurchaseDetails() {
            return this.offlinePurchaseDetails;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getOnlinePurchase() {
            return this.onlinePurchase;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductIntervention)) {
                return false;
            }
            ProductIntervention productIntervention = (ProductIntervention) other;
            return this.onlinePurchase == productIntervention.onlinePurchase && fr.t.c(this.batchNumber, productIntervention.batchNumber) && fr.t.c(this.expiryDate, productIntervention.expiryDate) && fr.t.c(this.manufacturerDetails, productIntervention.manufacturerDetails) && fr.t.c(this.offlinePurchaseDetails, productIntervention.offlinePurchaseDetails) && fr.t.c(this.onlinePurchaseDetails, productIntervention.onlinePurchaseDetails) && fr.t.c(this.tradeName, productIntervention.tradeName);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final OnlineBusinessDetailsData getOnlinePurchaseDetails() {
            return this.onlinePurchaseDetails;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getTradeName() {
            return this.tradeName;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.onlinePurchase) * 31;
            String str = this.batchNumber;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.expiryDate;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            BusinessDetailsData businessDetailsData = this.manufacturerDetails;
            int iHashCode4 = (iHashCode3 + (businessDetailsData == null ? 0 : businessDetailsData.hashCode())) * 31;
            BusinessDetailsData businessDetailsData2 = this.offlinePurchaseDetails;
            int iHashCode5 = (iHashCode4 + (businessDetailsData2 == null ? 0 : businessDetailsData2.hashCode())) * 31;
            OnlineBusinessDetailsData onlineBusinessDetailsData = this.onlinePurchaseDetails;
            int iHashCode6 = (iHashCode5 + (onlineBusinessDetailsData == null ? 0 : onlineBusinessDetailsData.hashCode())) * 31;
            String str3 = this.tradeName;
            return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "ProductIntervention(onlinePurchase=" + this.onlinePurchase + ", batchNumber=" + this.batchNumber + ", expiryDate=" + this.expiryDate + ", manufacturerDetails=" + this.manufacturerDetails + ", offlinePurchaseDetails=" + this.offlinePurchaseDetails + ", onlinePurchaseDetails=" + this.onlinePurchaseDetails + ", tradeName=" + this.tradeName + ")";
        }
    }

    /* JADX INFO: renamed from: tt0.s$h, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b \u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b%\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b&\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b!\u0010,R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001f\u0010-\u001a\u0004\b*\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b#\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b\u001d\u00101¨\u00063"}, d2 = {"Ltt0/s$h;", "Ltt0/s;", "", "subCategoryCode", "description", "", "wasOtherReportSentToAuthorities", "otherReportAuthorityName", "otherReportCaseNumber", "Lfz/b$c;", "otherReportDate", "Lfz/b$f;", "occurrenceDate", "Ltt0/s$g;", "productDetails", "Ltt0/s$b;", "applicant", "applicantData", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lfz/b$c;Lfz/b$f;Ltt0/s$g;Ltt0/s$b;Ltt0/s$b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "c", "Z", "i", "()Z", "d", "e", "f", "Lfz/b$c;", "()Lfz/b$c;", "g", "Lfz/b$f;", "()Lfz/b$f;", "Ltt0/s$g;", "()Ltt0/s$g;", "Ltt0/s$b;", "getApplicant", "()Ltt0/s$b;", "j", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductRequest implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String subCategoryCode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean wasOtherReportSentToAuthorities;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String otherReportAuthorityName;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String otherReportCaseNumber;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.b.LocalDate otherReportDate;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.b.OffsetDateTime occurrenceDate;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProductIntervention productDetails;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final ApplicantData applicant;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final ApplicantData applicantData;

        public ProductRequest(String str, String str2, boolean z15, String str3, String str4, fz.b.LocalDate localDate, fz.b.OffsetDateTime offsetDateTime, ProductIntervention productIntervention, ApplicantData applicantData, ApplicantData applicantData2) {
            this.subCategoryCode = str;
            this.description = str2;
            this.wasOtherReportSentToAuthorities = z15;
            this.otherReportAuthorityName = str3;
            this.otherReportCaseNumber = str4;
            this.otherReportDate = localDate;
            this.occurrenceDate = offsetDateTime;
            this.productDetails = productIntervention;
            this.applicant = applicantData;
            this.applicantData = applicantData2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ApplicantData getApplicantData() {
            return this.applicantData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public fz.b.OffsetDateTime getOccurrenceDate() {
            return this.occurrenceDate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public String getOtherReportAuthorityName() {
            return this.otherReportAuthorityName;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public String getOtherReportCaseNumber() {
            return this.otherReportCaseNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductRequest)) {
                return false;
            }
            ProductRequest productRequest = (ProductRequest) other;
            return fr.t.c(this.subCategoryCode, productRequest.subCategoryCode) && fr.t.c(this.description, productRequest.description) && this.wasOtherReportSentToAuthorities == productRequest.wasOtherReportSentToAuthorities && fr.t.c(this.otherReportAuthorityName, productRequest.otherReportAuthorityName) && fr.t.c(this.otherReportCaseNumber, productRequest.otherReportCaseNumber) && fr.t.c(this.otherReportDate, productRequest.otherReportDate) && fr.t.c(this.occurrenceDate, productRequest.occurrenceDate) && fr.t.c(this.productDetails, productRequest.productDetails) && fr.t.c(this.applicant, productRequest.applicant) && fr.t.c(this.applicantData, productRequest.applicantData);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public fz.b.LocalDate getOtherReportDate() {
            return this.otherReportDate;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final ProductIntervention getProductDetails() {
            return this.productDetails;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getSubCategoryCode() {
            return this.subCategoryCode;
        }

        public int hashCode() {
            int iHashCode = ((((this.subCategoryCode.hashCode() * 31) + this.description.hashCode()) * 31) + Boolean.hashCode(this.wasOtherReportSentToAuthorities)) * 31;
            String str = this.otherReportAuthorityName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.otherReportCaseNumber;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            fz.b.LocalDate localDate = this.otherReportDate;
            int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
            fz.b.OffsetDateTime offsetDateTime = this.occurrenceDate;
            int iHashCode5 = (((iHashCode4 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31) + this.productDetails.hashCode()) * 31;
            ApplicantData applicantData = this.applicant;
            int iHashCode6 = (iHashCode5 + (applicantData == null ? 0 : applicantData.hashCode())) * 31;
            ApplicantData applicantData2 = this.applicantData;
            return iHashCode6 + (applicantData2 != null ? applicantData2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public boolean getWasOtherReportSentToAuthorities() {
            return this.wasOtherReportSentToAuthorities;
        }

        public String toString() {
            return "ProductRequest(subCategoryCode=" + this.subCategoryCode + ", description=" + this.description + ", wasOtherReportSentToAuthorities=" + this.wasOtherReportSentToAuthorities + ", otherReportAuthorityName=" + this.otherReportAuthorityName + ", otherReportCaseNumber=" + this.otherReportCaseNumber + ", otherReportDate=" + this.otherReportDate + ", occurrenceDate=" + this.occurrenceDate + ", productDetails=" + this.productDetails + ", applicant=" + this.applicant + ", applicantData=" + this.applicantData + ")";
        }

        public /* synthetic */ ProductRequest(String str, String str2, boolean z15, String str3, String str4, fz.b.LocalDate localDate, fz.b.OffsetDateTime offsetDateTime, ProductIntervention productIntervention, ApplicantData applicantData, ApplicantData applicantData2, int i15, fr.k kVar) {
            this(str, str2, z15, str3, str4, localDate, offsetDateTime, productIntervention, (i15 & 256) != 0 ? null : applicantData, applicantData2);
        }
    }
}
