package zt3;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zt3.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ`\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b'\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010$\u001a\u0004\b!\u0010&R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b\u001f\u0010&R\u0017\u0010*\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b#\u0010)¨\u0006+"}, d2 = {"Lzt3/b;", "", "Lzt3/c;", "province", "county", "community", "city", "Lzt3/e;", "postalCode", "street", "buildingNumber", "apartmentNumber", "<init>", "(Lzt3/c;Lzt3/c;Lzt3/c;Lzt3/c;Lzt3/e;Lzt3/c;Lzt3/e;Lzt3/e;)V", "a", "(Lzt3/c;Lzt3/c;Lzt3/c;Lzt3/c;Lzt3/e;Lzt3/c;Lzt3/e;Lzt3/e;)Lzt3/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lzt3/c;", "j", "()Lzt3/c;", "b", "h", "c", "g", "d", "f", "e", "Lzt3/e;", "i", "()Lzt3/e;", "k", "Z", "()Z", "canToggleStreet", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddressState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DropDown province;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DropDown county;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final DropDown community;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final DropDown city;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Regular postalCode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final DropDown street;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Regular buildingNumber;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Regular apartmentNumber;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean canToggleStreet;

    public AddressState() {
        this(null, null, null, null, null, null, null, null, GF2Field.MASK, null);
    }

    public static /* synthetic */ AddressState b(AddressState addressState, DropDown dropDown, DropDown dropDown2, DropDown dropDown3, DropDown dropDown4, Regular regular, DropDown dropDown5, Regular regular2, Regular regular3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            dropDown = addressState.province;
        }
        if ((i15 & 2) != 0) {
            dropDown2 = addressState.county;
        }
        if ((i15 & 4) != 0) {
            dropDown3 = addressState.community;
        }
        if ((i15 & 8) != 0) {
            dropDown4 = addressState.city;
        }
        if ((i15 & 16) != 0) {
            regular = addressState.postalCode;
        }
        if ((i15 & 32) != 0) {
            dropDown5 = addressState.street;
        }
        if ((i15 & 64) != 0) {
            regular2 = addressState.buildingNumber;
        }
        if ((i15 & 128) != 0) {
            regular3 = addressState.apartmentNumber;
        }
        Regular regular4 = regular2;
        Regular regular5 = regular3;
        Regular regular6 = regular;
        DropDown dropDown6 = dropDown5;
        return addressState.a(dropDown, dropDown2, dropDown3, dropDown4, regular6, dropDown6, regular4, regular5);
    }

    public final AddressState a(DropDown province, DropDown county, DropDown community, DropDown city, Regular postalCode, DropDown street, Regular buildingNumber, Regular apartmentNumber) {
        return new AddressState(province, county, community, city, postalCode, street, buildingNumber, apartmentNumber);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Regular getApartmentNumber() {
        return this.apartmentNumber;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Regular getBuildingNumber() {
        return this.buildingNumber;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getCanToggleStreet() {
        return this.canToggleStreet;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressState)) {
            return false;
        }
        AddressState addressState = (AddressState) other;
        return fr.t.c(this.province, addressState.province) && fr.t.c(this.county, addressState.county) && fr.t.c(this.community, addressState.community) && fr.t.c(this.city, addressState.city) && fr.t.c(this.postalCode, addressState.postalCode) && fr.t.c(this.street, addressState.street) && fr.t.c(this.buildingNumber, addressState.buildingNumber) && fr.t.c(this.apartmentNumber, addressState.apartmentNumber);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final DropDown getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final DropDown getCommunity() {
        return this.community;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final DropDown getCounty() {
        return this.county;
    }

    public int hashCode() {
        return (((((((((((((this.province.hashCode() * 31) + this.county.hashCode()) * 31) + this.community.hashCode()) * 31) + this.city.hashCode()) * 31) + this.postalCode.hashCode()) * 31) + this.street.hashCode()) * 31) + this.buildingNumber.hashCode()) * 31) + this.apartmentNumber.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Regular getPostalCode() {
        return this.postalCode;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final DropDown getProvince() {
        return this.province;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final DropDown getStreet() {
        return this.street;
    }

    public String toString() {
        return "AddressState(province=" + this.province + ", county=" + this.county + ", community=" + this.community + ", city=" + this.city + ", postalCode=" + this.postalCode + ", street=" + this.street + ", buildingNumber=" + this.buildingNumber + ", apartmentNumber=" + this.apartmentNumber + ')';
    }

    public AddressState(DropDown dropDown, DropDown dropDown2, DropDown dropDown3, DropDown dropDown4, Regular regular, DropDown dropDown5, Regular regular2, Regular regular3) {
        this.province = dropDown;
        this.county = dropDown2;
        this.community = dropDown3;
        this.city = dropDown4;
        this.postalCode = regular;
        this.street = dropDown5;
        this.buildingNumber = regular2;
        this.apartmentNumber = regular3;
        d state = dropDown5.getState();
        this.canToggleStreet = (state instanceof d.Enabled) || (state instanceof d.c);
    }

    public /* synthetic */ AddressState(DropDown dropDown, DropDown dropDown2, DropDown dropDown3, DropDown dropDown4, Regular regular, DropDown dropDown5, Regular regular2, Regular regular3, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? new DropDown(null, null, new d.Enabled(null, 1, null), m1.PROVINCE, 3, null) : dropDown, (i15 & 2) != 0 ? new DropDown(null, null, null, m1.COUNTY, 7, null) : dropDown2, (i15 & 4) != 0 ? new DropDown(null, null, null, m1.COMMUNITY, 7, null) : dropDown3, (i15 & 8) != 0 ? new DropDown(null, null, null, m1.CITY, 7, null) : dropDown4, (i15 & 16) != 0 ? new Regular(null, null, 3, null) : regular, (i15 & 32) != 0 ? new DropDown(null, null, null, m1.STREET, 7, null) : dropDown5, (i15 & 64) != 0 ? new Regular(null, null, 3, null) : regular2, (i15 & 128) != 0 ? new Regular(null, null, 3, null) : regular3);
    }
}
