package qb0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: qb0.l, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lqb0/l;", "", "Lhb4/c;", "errorVMSAdapter", "Lqb0/k$b;", "data", "<init>", "(Lhb4/c;Lqb0/k$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "b", "()Lhb4/c;", "Lqb0/k$b;", "()Lqb0/k$b;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ErrorDeleting implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final hb4.c errorVMSAdapter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final k.DocumentData data;

    public ErrorDeleting(hb4.c cVar, k.DocumentData documentData) {
        this.errorVMSAdapter = cVar;
        this.data = documentData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final k.DocumentData getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public hb4.c getErrorVMSAdapter() {
        return this.errorVMSAdapter;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorDeleting)) {
            return false;
        }
        ErrorDeleting errorDeleting = (ErrorDeleting) other;
        return fr.t.c(this.errorVMSAdapter, errorDeleting.errorVMSAdapter) && fr.t.c(this.data, errorDeleting.data);
    }

    public int hashCode() {
        return (this.errorVMSAdapter.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        return "ErrorDeleting(errorVMSAdapter=" + this.errorVMSAdapter + ", data=" + this.data + ')';
    }
}
