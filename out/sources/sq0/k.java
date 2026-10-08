package sq0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lsq0/k;", "", "Lsq0/j;", "deletedSubscriptionId", "Lsq0/i;", "modifiedSubscription", "<init>", "(Ljava/lang/String;Lsq0/i;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getDeletedSubscriptionId-Ua4ORss", "b", "Lsq0/i;", "()Lsq0/i;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String deletedSubscriptionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final BESubscription modifiedSubscription;

    public /* synthetic */ k(String str, BESubscription bESubscription, fr.k kVar) {
        this(str, bESubscription);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BESubscription getModifiedSubscription() {
        return this.modifiedSubscription;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public boolean equals(Object other) {
        boolean zB;
        if (this == other) {
            return true;
        }
        if (!(other instanceof k)) {
            return false;
        }
        k kVar = (k) other;
        String str = this.deletedSubscriptionId;
        String str2 = kVar.deletedSubscriptionId;
        if (str == null) {
            if (str2 == null) {
                zB = true;
            } else {
                zB = false;
            }
        } else if (str2 == null) {
            zB = false;
        } else {
            zB = j.b(str, str2);
        }
        return zB && t.c(this.modifiedSubscription, kVar.modifiedSubscription);
    }

    public int hashCode() {
        String str = this.deletedSubscriptionId;
        int iC = (str == null ? 0 : j.c(str)) * 31;
        BESubscription bESubscription = this.modifiedSubscription;
        return iC + (bESubscription != null ? bESubscription.hashCode() : 0);
    }

    public String toString() {
        String str = this.deletedSubscriptionId;
        return "BEUpdatedNationalCourtRegisterSubscriptionResponse(deletedSubscriptionId=" + (str == null ? "null" : j.d(str)) + ", modifiedSubscription=" + this.modifiedSubscription + ")";
    }

    private k(String str, BESubscription bESubscription) {
        this.deletedSubscriptionId = str;
        this.modifiedSubscription = bESubscription;
    }
}
