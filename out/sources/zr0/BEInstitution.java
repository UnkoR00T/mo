package zr0;

import fr.t;
import p071kotlin.Metadata;
import wr0.BEPaymentAddress;

/* JADX INFO: renamed from: zr0.c, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lzr0/c;", "", "Lwr0/a;", "address", "", "id", "name", "<init>", "(Lwr0/a;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwr0/a;", "()Lwr0/a;", "b", "Ljava/lang/String;", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEInstitution {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPaymentAddress address;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    public BEInstitution(BEPaymentAddress bEPaymentAddress, String str, String str2) {
        this.address = bEPaymentAddress;
        this.id = str;
        this.name = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BEPaymentAddress getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEInstitution)) {
            return false;
        }
        BEInstitution bEInstitution = (BEInstitution) other;
        return t.c(this.address, bEInstitution.address) && t.c(this.id, bEInstitution.id) && t.c(this.name, bEInstitution.name);
    }

    public int hashCode() {
        return (((this.address.hashCode() * 31) + this.id.hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "BEInstitution(address=" + this.address + ", id=" + this.id + ", name=" + this.name + ")";
    }
}
