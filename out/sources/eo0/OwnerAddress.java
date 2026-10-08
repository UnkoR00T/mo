package eo0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: eo0.j0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Leo0/j0;", "", "Leo0/b;", "addressData", "Leo0/z;", "emptyState", "<init>", "(Leo0/b;Leo0/z;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/b;", "()Leo0/b;", "b", "Leo0/z;", "()Leo0/z;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OwnerAddress {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressData addressData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final EmptyState emptyState;

    public OwnerAddress(AddressData addressData, EmptyState emptyState) {
        this.addressData = addressData;
        this.emptyState = emptyState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AddressData getAddressData() {
        return this.addressData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EmptyState getEmptyState() {
        return this.emptyState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OwnerAddress)) {
            return false;
        }
        OwnerAddress ownerAddress = (OwnerAddress) other;
        return fr.t.c(this.addressData, ownerAddress.addressData) && fr.t.c(this.emptyState, ownerAddress.emptyState);
    }

    public int hashCode() {
        AddressData addressData = this.addressData;
        int iHashCode = (addressData == null ? 0 : addressData.hashCode()) * 31;
        EmptyState emptyState = this.emptyState;
        return iHashCode + (emptyState != null ? emptyState.hashCode() : 0);
    }

    public String toString() {
        return "OwnerAddress(addressData=" + this.addressData + ", emptyState=" + this.emptyState + ")";
    }
}
