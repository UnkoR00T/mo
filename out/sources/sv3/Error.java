package sv3;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: sv3.q, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lsv3/q;", "", "Lsv3/g$a;", "Lsv3/p;", "data", "Lhb4/c;", "errorVMSAdapter", "<init>", "(Lsv3/p;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv3/p;", "b", "()Lsv3/p;", "Lhb4/c;", "()Lhb4/c;", "edorauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Error implements g, g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Data data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final hb4.c errorVMSAdapter;

    public Error(Data data, hb4.c cVar) {
        this.data = data;
        this.errorVMSAdapter = cVar;
    }

    @Override // sv3.g.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public hb4.c getErrorVMSAdapter() {
        return this.errorVMSAdapter;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Error)) {
            return false;
        }
        Error error = (Error) other;
        return fr.t.c(this.data, error.data) && fr.t.c(this.errorVMSAdapter, error.errorVMSAdapter);
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + this.errorVMSAdapter.hashCode();
    }

    public String toString() {
        return "Error(data=" + this.data + ", errorVMSAdapter=" + this.errorVMSAdapter + ')';
    }
}
