package st3;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: st3.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\u0017BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b\u001b\u0010\u000f¨\u0006#"}, d2 = {"Lst3/b;", "", "Lst3/l;", "province", "county", "community", "city", "", "postalCode", "street", "buildingNumber", "apartmentNumber", "<init>", "(Lst3/l;Lst3/l;Lst3/l;Lst3/l;Ljava/lang/String;Lst3/l;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lst3/l;", "h", "()Lst3/l;", "b", "f", "c", "e", "d", "Ljava/lang/String;", "g", "i", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddressData {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AddressData f184283j = new AddressData(new AddressTerytDetail(AddressTerytDetail.a.a(""), "", null, null), new AddressTerytDetail(AddressTerytDetail.a.a(""), "", null, null), new AddressTerytDetail(AddressTerytDetail.a.a(""), "", null, null), new AddressTerytDetail(AddressTerytDetail.a.a(""), "", null, null), "", null, "", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressTerytDetail province;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressTerytDetail county;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressTerytDetail community;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressTerytDetail city;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postalCode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressTerytDetail street;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String buildingNumber;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String apartmentNumber;

    /* JADX INFO: renamed from: st3.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lst3/b$a;", "", "<init>", "()V", "Lst3/b;", "empty", "Lst3/b;", "a", "()Lst3/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final AddressData a() {
            return AddressData.f184283j;
        }

        private Companion() {
        }
    }

    public AddressData(AddressTerytDetail addressTerytDetail, AddressTerytDetail addressTerytDetail2, AddressTerytDetail addressTerytDetail3, AddressTerytDetail addressTerytDetail4, String str, AddressTerytDetail addressTerytDetail5, String str2, String str3) {
        this.province = addressTerytDetail;
        this.county = addressTerytDetail2;
        this.community = addressTerytDetail3;
        this.city = addressTerytDetail4;
        this.postalCode = str;
        this.street = addressTerytDetail5;
        this.buildingNumber = str2;
        this.apartmentNumber = str3;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getApartmentNumber() {
        return this.apartmentNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBuildingNumber() {
        return this.buildingNumber;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AddressTerytDetail getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AddressTerytDetail getCommunity() {
        return this.community;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressData)) {
            return false;
        }
        AddressData addressData = (AddressData) other;
        return t.c(this.province, addressData.province) && t.c(this.county, addressData.county) && t.c(this.community, addressData.community) && t.c(this.city, addressData.city) && t.c(this.postalCode, addressData.postalCode) && t.c(this.street, addressData.street) && t.c(this.buildingNumber, addressData.buildingNumber) && t.c(this.apartmentNumber, addressData.apartmentNumber);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AddressTerytDetail getCounty() {
        return this.county;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final AddressTerytDetail getProvince() {
        return this.province;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.province.hashCode() * 31) + this.county.hashCode()) * 31) + this.community.hashCode()) * 31) + this.city.hashCode()) * 31) + this.postalCode.hashCode()) * 31;
        AddressTerytDetail addressTerytDetail = this.street;
        return ((((iHashCode + (addressTerytDetail == null ? 0 : addressTerytDetail.hashCode())) * 31) + this.buildingNumber.hashCode()) * 31) + this.apartmentNumber.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final AddressTerytDetail getStreet() {
        return this.street;
    }

    public String toString() {
        return "AddressData(province=" + this.province + ", county=" + this.county + ", community=" + this.community + ", city=" + this.city + ", postalCode=" + this.postalCode + ", street=" + this.street + ", buildingNumber=" + this.buildingNumber + ", apartmentNumber=" + this.apartmentNumber + ")";
    }
}
