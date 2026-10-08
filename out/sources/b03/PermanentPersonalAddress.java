package b03;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: b03.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u001d"}, d2 = {"Lb03/a;", "", "Liy/b0;", "streetName", "houseNumber", "postalCode", "locality", "voivodeship", "apartmentNumber", "<init>", "(Liy/b0;Liy/b0;Liy/b0;Liy/b0;Liy/b0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "e", "()Liy/b0;", "b", "c", "d", "f", "registeredaddress_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PermanentPersonalAddress {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f15859g = b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 streetName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 houseNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 postalCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 locality;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 voivodeship;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 apartmentNumber;

    public PermanentPersonalAddress(b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, b0 b0Var5, b0 b0Var6) {
        this.streetName = b0Var;
        this.houseNumber = b0Var2;
        this.postalCode = b0Var3;
        this.locality = b0Var4;
        this.voivodeship = b0Var5;
        this.apartmentNumber = b0Var6;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getApartmentNumber() {
        return this.apartmentNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getHouseNumber() {
        return this.houseNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getLocality() {
        return this.locality;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getPostalCode() {
        return this.postalCode;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b0 getStreetName() {
        return this.streetName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermanentPersonalAddress)) {
            return false;
        }
        PermanentPersonalAddress permanentPersonalAddress = (PermanentPersonalAddress) other;
        return t.c(this.streetName, permanentPersonalAddress.streetName) && t.c(this.houseNumber, permanentPersonalAddress.houseNumber) && t.c(this.postalCode, permanentPersonalAddress.postalCode) && t.c(this.locality, permanentPersonalAddress.locality) && t.c(this.voivodeship, permanentPersonalAddress.voivodeship) && t.c(this.apartmentNumber, permanentPersonalAddress.apartmentNumber);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b0 getVoivodeship() {
        return this.voivodeship;
    }

    public int hashCode() {
        b0 b0Var = this.streetName;
        int iHashCode = (b0Var == null ? 0 : b0Var.hashCode()) * 31;
        b0 b0Var2 = this.houseNumber;
        int iHashCode2 = (iHashCode + (b0Var2 == null ? 0 : b0Var2.hashCode())) * 31;
        b0 b0Var3 = this.postalCode;
        int iHashCode3 = (iHashCode2 + (b0Var3 == null ? 0 : b0Var3.hashCode())) * 31;
        b0 b0Var4 = this.locality;
        int iHashCode4 = (iHashCode3 + (b0Var4 == null ? 0 : b0Var4.hashCode())) * 31;
        b0 b0Var5 = this.voivodeship;
        int iHashCode5 = (iHashCode4 + (b0Var5 == null ? 0 : b0Var5.hashCode())) * 31;
        b0 b0Var6 = this.apartmentNumber;
        return iHashCode5 + (b0Var6 != null ? b0Var6.hashCode() : 0);
    }

    public String toString() {
        return "PermanentPersonalAddress(streetName=" + this.streetName + ", houseNumber=" + this.houseNumber + ", postalCode=" + this.postalCode + ", locality=" + this.locality + ", voivodeship=" + this.voivodeship + ", apartmentNumber=" + this.apartmentNumber + ')';
    }
}
