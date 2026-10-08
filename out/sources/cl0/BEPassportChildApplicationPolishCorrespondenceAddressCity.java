package cl0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: cl0.w, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcl0/w;", "", "Liy/b0;", "community", "name", "territorialCode", "<init>", "(Liy/b0;Liy/b0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEPassportChildApplicationPolishCorrespondenceAddressCity {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 community;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 territorialCode;

    public BEPassportChildApplicationPolishCorrespondenceAddressCity(iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3) {
        this.community = b0Var;
        this.name = b0Var2;
        this.territorialCode = b0Var3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final iy.b0 getCommunity() {
        return this.community;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final iy.b0 getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final iy.b0 getTerritorialCode() {
        return this.territorialCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEPassportChildApplicationPolishCorrespondenceAddressCity)) {
            return false;
        }
        BEPassportChildApplicationPolishCorrespondenceAddressCity bEPassportChildApplicationPolishCorrespondenceAddressCity = (BEPassportChildApplicationPolishCorrespondenceAddressCity) other;
        return fr.t.c(this.community, bEPassportChildApplicationPolishCorrespondenceAddressCity.community) && fr.t.c(this.name, bEPassportChildApplicationPolishCorrespondenceAddressCity.name) && fr.t.c(this.territorialCode, bEPassportChildApplicationPolishCorrespondenceAddressCity.territorialCode);
    }

    public int hashCode() {
        return (((this.community.hashCode() * 31) + this.name.hashCode()) * 31) + this.territorialCode.hashCode();
    }

    public String toString() {
        return "BEPassportChildApplicationPolishCorrespondenceAddressCity(community=" + this.community + ", name=" + this.name + ", territorialCode=" + this.territorialCode + ")";
    }
}
