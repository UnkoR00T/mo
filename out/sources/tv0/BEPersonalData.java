package tv0;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;
import xw.PhoneNumber;

/* JADX INFO: renamed from: tv0.f, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJL\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b\"\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001e\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010&\u001a\u0004\b#\u0010'¨\u0006("}, d2 = {"Ltv0/f;", "", "Liy/b0;", "firstName", "lastname", "Lxw/h;", "phoneNumber", "email", "Ltv0/d;", "address", "", "externalDataFetched", "<init>", "(Liy/b0;Liy/b0;Lxw/h;Liy/b0;Ltv0/d;Z)V", "a", "(Liy/b0;Liy/b0;Lxw/h;Liy/b0;Ltv0/d;Z)Ltv0/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Liy/b0;", "f", "()Liy/b0;", "b", "g", "c", "Lxw/h;", "h", "()Lxw/h;", "d", "e", "Ltv0/d;", "()Ltv0/d;", "Z", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEPersonalData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 firstName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 lastname;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final PhoneNumber phoneNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 email;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEContactDetailsAddress address;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean externalDataFetched;

    public BEPersonalData(b0 b0Var, b0 b0Var2, PhoneNumber phoneNumber, b0 b0Var3, BEContactDetailsAddress bEContactDetailsAddress, boolean z15) {
        this.firstName = b0Var;
        this.lastname = b0Var2;
        this.phoneNumber = phoneNumber;
        this.email = b0Var3;
        this.address = bEContactDetailsAddress;
        this.externalDataFetched = z15;
    }

    public static /* synthetic */ BEPersonalData b(BEPersonalData bEPersonalData, b0 b0Var, b0 b0Var2, PhoneNumber phoneNumber, b0 b0Var3, BEContactDetailsAddress bEContactDetailsAddress, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            b0Var = bEPersonalData.firstName;
        }
        if ((i15 & 2) != 0) {
            b0Var2 = bEPersonalData.lastname;
        }
        if ((i15 & 4) != 0) {
            phoneNumber = bEPersonalData.phoneNumber;
        }
        if ((i15 & 8) != 0) {
            b0Var3 = bEPersonalData.email;
        }
        if ((i15 & 16) != 0) {
            bEContactDetailsAddress = bEPersonalData.address;
        }
        if ((i15 & 32) != 0) {
            z15 = bEPersonalData.externalDataFetched;
        }
        BEContactDetailsAddress bEContactDetailsAddress2 = bEContactDetailsAddress;
        boolean z16 = z15;
        return bEPersonalData.a(b0Var, b0Var2, phoneNumber, b0Var3, bEContactDetailsAddress2, z16);
    }

    public final BEPersonalData a(b0 firstName, b0 lastname, PhoneNumber phoneNumber, b0 email, BEContactDetailsAddress address, boolean externalDataFetched) {
        return new BEPersonalData(firstName, lastname, phoneNumber, email, address, externalDataFetched);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BEContactDetailsAddress getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getExternalDataFetched() {
        return this.externalDataFetched;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEPersonalData)) {
            return false;
        }
        BEPersonalData bEPersonalData = (BEPersonalData) other;
        return t.c(this.firstName, bEPersonalData.firstName) && t.c(this.lastname, bEPersonalData.lastname) && t.c(this.phoneNumber, bEPersonalData.phoneNumber) && t.c(this.email, bEPersonalData.email) && t.c(this.address, bEPersonalData.address) && this.externalDataFetched == bEPersonalData.externalDataFetched;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b0 getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final b0 getLastname() {
        return this.lastname;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        return (((((((((this.firstName.hashCode() * 31) + this.lastname.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.email.hashCode()) * 31) + this.address.hashCode()) * 31) + Boolean.hashCode(this.externalDataFetched);
    }

    public String toString() {
        return "BEPersonalData(firstName=" + this.firstName + ", lastname=" + this.lastname + ", phoneNumber=" + this.phoneNumber + ", email=" + this.email + ", address=" + this.address + ", externalDataFetched=" + this.externalDataFetched + ")";
    }

    public /* synthetic */ BEPersonalData(b0 b0Var, b0 b0Var2, PhoneNumber phoneNumber, b0 b0Var3, BEContactDetailsAddress bEContactDetailsAddress, boolean z15, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? b0.INSTANCE.a() : b0Var, (i15 & 2) != 0 ? b0.INSTANCE.a() : b0Var2, (i15 & 4) != 0 ? PhoneNumber.INSTANCE.a() : phoneNumber, (i15 & 8) != 0 ? b0.INSTANCE.a() : b0Var3, (i15 & 16) != 0 ? BEContactDetailsAddress.INSTANCE.a() : bEContactDetailsAddress, z15);
    }
}
