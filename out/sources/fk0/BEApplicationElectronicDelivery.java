package fk0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fk0.i, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lfk0/i;", "", "Lfk0/y0;", "nonPublicSupplierInput", "Lfk0/a1;", "publicSupplierInput", "<init>", "(Lfk0/y0;Lfk0/a1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfk0/y0;", "()Lfk0/y0;", "b", "Lfk0/a1;", "()Lfk0/a1;", "companyservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEApplicationElectronicDelivery {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BENonPublicSupplierInput nonPublicSupplierInput;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPublicSupplierInput publicSupplierInput;

    public BEApplicationElectronicDelivery(BENonPublicSupplierInput bENonPublicSupplierInput, BEPublicSupplierInput bEPublicSupplierInput) {
        this.nonPublicSupplierInput = bENonPublicSupplierInput;
        this.publicSupplierInput = bEPublicSupplierInput;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BENonPublicSupplierInput getNonPublicSupplierInput() {
        return this.nonPublicSupplierInput;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BEPublicSupplierInput getPublicSupplierInput() {
        return this.publicSupplierInput;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEApplicationElectronicDelivery)) {
            return false;
        }
        BEApplicationElectronicDelivery bEApplicationElectronicDelivery = (BEApplicationElectronicDelivery) other;
        return fr.t.c(this.nonPublicSupplierInput, bEApplicationElectronicDelivery.nonPublicSupplierInput) && fr.t.c(this.publicSupplierInput, bEApplicationElectronicDelivery.publicSupplierInput);
    }

    public int hashCode() {
        BENonPublicSupplierInput bENonPublicSupplierInput = this.nonPublicSupplierInput;
        int iHashCode = (bENonPublicSupplierInput == null ? 0 : bENonPublicSupplierInput.hashCode()) * 31;
        BEPublicSupplierInput bEPublicSupplierInput = this.publicSupplierInput;
        return iHashCode + (bEPublicSupplierInput != null ? bEPublicSupplierInput.hashCode() : 0);
    }

    public String toString() {
        return "BEApplicationElectronicDelivery(nonPublicSupplierInput=" + this.nonPublicSupplierInput + ", publicSupplierInput=" + this.publicSupplierInput + ')';
    }
}
