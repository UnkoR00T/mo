package tv0;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: tv0.d, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0016B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJD\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Ltv0/d;", "", "Liy/b0;", "city", "postcode", "street", "buildingNumber", "flatNumber", "<init>", "(Liy/b0;Liy/b0;Liy/b0;Liy/b0;Liy/b0;)V", "b", "(Liy/b0;Liy/b0;Liy/b0;Liy/b0;Liy/b0;)Ltv0/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "e", "()Liy/b0;", "g", "c", "h", "d", "f", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEContactDetailsAddress {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final BEContactDetailsAddress f192382g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 city;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 postcode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 street;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 buildingNumber;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 flatNumber;

    /* JADX INFO: renamed from: tv0.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ltv0/d$a;", "", "<init>", "()V", "Ltv0/d;", "DEFAULT", "Ltv0/d;", "a", "()Ltv0/d;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final BEContactDetailsAddress a() {
            return BEContactDetailsAddress.f192382g;
        }

        private Companion() {
        }
    }

    static {
        b0.Companion companion = b0.INSTANCE;
        f192382g = new BEContactDetailsAddress(companion.a(), companion.a(), companion.a(), companion.a(), null);
    }

    public BEContactDetailsAddress(b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, b0 b0Var5) {
        this.city = b0Var;
        this.postcode = b0Var2;
        this.street = b0Var3;
        this.buildingNumber = b0Var4;
        this.flatNumber = b0Var5;
    }

    public static /* synthetic */ BEContactDetailsAddress c(BEContactDetailsAddress bEContactDetailsAddress, b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, b0 b0Var5, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            b0Var = bEContactDetailsAddress.city;
        }
        if ((i15 & 2) != 0) {
            b0Var2 = bEContactDetailsAddress.postcode;
        }
        if ((i15 & 4) != 0) {
            b0Var3 = bEContactDetailsAddress.street;
        }
        if ((i15 & 8) != 0) {
            b0Var4 = bEContactDetailsAddress.buildingNumber;
        }
        if ((i15 & 16) != 0) {
            b0Var5 = bEContactDetailsAddress.flatNumber;
        }
        b0 b0Var6 = b0Var5;
        b0 b0Var7 = b0Var3;
        return bEContactDetailsAddress.b(b0Var, b0Var2, b0Var7, b0Var4, b0Var6);
    }

    public final BEContactDetailsAddress b(b0 city, b0 postcode, b0 street, b0 buildingNumber, b0 flatNumber) {
        return new BEContactDetailsAddress(city, postcode, street, buildingNumber, flatNumber);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getBuildingNumber() {
        return this.buildingNumber;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b0 getCity() {
        return this.city;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEContactDetailsAddress)) {
            return false;
        }
        BEContactDetailsAddress bEContactDetailsAddress = (BEContactDetailsAddress) other;
        return t.c(this.city, bEContactDetailsAddress.city) && t.c(this.postcode, bEContactDetailsAddress.postcode) && t.c(this.street, bEContactDetailsAddress.street) && t.c(this.buildingNumber, bEContactDetailsAddress.buildingNumber) && t.c(this.flatNumber, bEContactDetailsAddress.flatNumber);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b0 getFlatNumber() {
        return this.flatNumber;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final b0 getPostcode() {
        return this.postcode;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final b0 getStreet() {
        return this.street;
    }

    public int hashCode() {
        int iHashCode = ((((((this.city.hashCode() * 31) + this.postcode.hashCode()) * 31) + this.street.hashCode()) * 31) + this.buildingNumber.hashCode()) * 31;
        b0 b0Var = this.flatNumber;
        return iHashCode + (b0Var == null ? 0 : b0Var.hashCode());
    }

    public String toString() {
        return "BEContactDetailsAddress(city=" + this.city + ", postcode=" + this.postcode + ", street=" + this.street + ", buildingNumber=" + this.buildingNumber + ", flatNumber=" + this.flatNumber + ")";
    }
}
