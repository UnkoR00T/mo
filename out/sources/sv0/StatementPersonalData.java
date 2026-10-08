package sv0;

import p071kotlin.Metadata;
import xw.PhoneNumber;

/* JADX INFO: renamed from: sv0.e0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\u0017\u0010\u001e¨\u0006\""}, d2 = {"Lsv0/e0;", "", "Lxw/h;", "phoneNumber", "Liy/b0;", "email", "postCode", "city", "street", "houseNumber", "apartmentNumber", "<init>", "(Lxw/h;Liy/b0;Liy/b0;Liy/b0;Liy/b0;Liy/b0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxw/h;", "e", "()Lxw/h;", "b", "Liy/b0;", "c", "()Liy/b0;", "f", "d", "g", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StatementPersonalData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final PhoneNumber phoneNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 email;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 postCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 city;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 street;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 houseNumber;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 apartmentNumber;

    public StatementPersonalData(PhoneNumber phoneNumber, iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3, iy.b0 b0Var4, iy.b0 b0Var5, iy.b0 b0Var6) {
        this.phoneNumber = phoneNumber;
        this.email = b0Var;
        this.postCode = b0Var2;
        this.city = b0Var3;
        this.street = b0Var4;
        this.houseNumber = b0Var5;
        this.apartmentNumber = b0Var6;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final iy.b0 getApartmentNumber() {
        return this.apartmentNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final iy.b0 getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final iy.b0 getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final iy.b0 getHouseNumber() {
        return this.houseNumber;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatementPersonalData)) {
            return false;
        }
        StatementPersonalData statementPersonalData = (StatementPersonalData) other;
        return fr.t.c(this.phoneNumber, statementPersonalData.phoneNumber) && fr.t.c(this.email, statementPersonalData.email) && fr.t.c(this.postCode, statementPersonalData.postCode) && fr.t.c(this.city, statementPersonalData.city) && fr.t.c(this.street, statementPersonalData.street) && fr.t.c(this.houseNumber, statementPersonalData.houseNumber) && fr.t.c(this.apartmentNumber, statementPersonalData.apartmentNumber);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final iy.b0 getPostCode() {
        return this.postCode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final iy.b0 getStreet() {
        return this.street;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.phoneNumber.hashCode() * 31) + this.email.hashCode()) * 31) + this.postCode.hashCode()) * 31) + this.city.hashCode()) * 31) + this.street.hashCode()) * 31) + this.houseNumber.hashCode()) * 31;
        iy.b0 b0Var = this.apartmentNumber;
        return iHashCode + (b0Var == null ? 0 : b0Var.hashCode());
    }

    public String toString() {
        return "StatementPersonalData(phoneNumber=" + this.phoneNumber + ", email=" + this.email + ", postCode=" + this.postCode + ", city=" + this.city + ", street=" + this.street + ", houseNumber=" + this.houseNumber + ", apartmentNumber=" + this.apartmentNumber + ")";
    }
}
