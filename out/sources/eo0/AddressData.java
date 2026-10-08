package eo0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: eo0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f¨\u0006 "}, d2 = {"Leo0/b;", "", "Liy/b0;", "edorAddress", "", "epuapId", "Leo0/p;", "status", "Leo0/c;", "addressType", "<init>", "(Liy/b0;Ljava/lang/String;Leo0/p;Leo0/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "b", "()Liy/b0;", "Ljava/lang/String;", "c", "Leo0/p;", "d", "()Leo0/p;", "Leo0/c;", "()Leo0/c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddressData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 edorAddress;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String epuapId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final p status;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final c addressType;

    public AddressData(iy.b0 b0Var, String str, p pVar, c cVar) {
        this.edorAddress = b0Var;
        this.epuapId = str;
        this.status = pVar;
        this.addressType = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getAddressType() {
        return this.addressType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final iy.b0 getEdorAddress() {
        return this.edorAddress;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEpuapId() {
        return this.epuapId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final p getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressData)) {
            return false;
        }
        AddressData addressData = (AddressData) other;
        return fr.t.c(this.edorAddress, addressData.edorAddress) && fr.t.c(this.epuapId, addressData.epuapId) && this.status == addressData.status && this.addressType == addressData.addressType;
    }

    public int hashCode() {
        iy.b0 b0Var = this.edorAddress;
        return ((((((b0Var == null ? 0 : b0Var.hashCode()) * 31) + this.epuapId.hashCode()) * 31) + this.status.hashCode()) * 31) + this.addressType.hashCode();
    }

    public String toString() {
        return "AddressData(edorAddress=" + this.edorAddress + ", epuapId=" + this.epuapId + ", status=" + this.status + ", addressType=" + this.addressType + ")";
    }
}
