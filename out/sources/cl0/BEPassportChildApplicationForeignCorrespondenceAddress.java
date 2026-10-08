package cl0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: cl0.p, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcl0/p;", "", "Liy/b0;", "address", "country", "isoCode", "<init>", "(Liy/b0;Liy/b0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEPassportChildApplicationForeignCorrespondenceAddress {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 address;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 country;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 isoCode;

    public BEPassportChildApplicationForeignCorrespondenceAddress(iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3) {
        this.address = b0Var;
        this.country = b0Var2;
        this.isoCode = b0Var3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final iy.b0 getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final iy.b0 getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final iy.b0 getIsoCode() {
        return this.isoCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEPassportChildApplicationForeignCorrespondenceAddress)) {
            return false;
        }
        BEPassportChildApplicationForeignCorrespondenceAddress bEPassportChildApplicationForeignCorrespondenceAddress = (BEPassportChildApplicationForeignCorrespondenceAddress) other;
        return fr.t.c(this.address, bEPassportChildApplicationForeignCorrespondenceAddress.address) && fr.t.c(this.country, bEPassportChildApplicationForeignCorrespondenceAddress.country) && fr.t.c(this.isoCode, bEPassportChildApplicationForeignCorrespondenceAddress.isoCode);
    }

    public int hashCode() {
        return (((this.address.hashCode() * 31) + this.country.hashCode()) * 31) + this.isoCode.hashCode();
    }

    public String toString() {
        return "BEPassportChildApplicationForeignCorrespondenceAddress(address=" + this.address + ", country=" + this.country + ", isoCode=" + this.isoCode + ")";
    }
}
