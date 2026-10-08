package bm1;

import al0.ParentOrGuardData;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: bm1.g, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, d2 = {"Lbm1/g;", "", "Lbm1/d$a;", "Lkk1/a;", "type", "Lhb4/c;", "vmsAdapter", "Lal0/j0;", "parentOrGuardData", "<init>", "(Lkk1/a;Lhb4/c;Lal0/j0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkk1/a;", "getType", "()Lkk1/a;", "b", "Lhb4/c;", "()Lhb4/c;", "c", "Lal0/j0;", "()Lal0/j0;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Error implements d, d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final kk1.a type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final hb4.c vmsAdapter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ParentOrGuardData parentOrGuardData;

    public Error(kk1.a aVar, hb4.c cVar, ParentOrGuardData parentOrGuardData) {
        this.type = aVar;
        this.vmsAdapter = cVar;
        this.parentOrGuardData = parentOrGuardData;
    }

    @Override // bm1.d.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public hb4.c getVmsAdapter() {
        return this.vmsAdapter;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ParentOrGuardData getParentOrGuardData() {
        return this.parentOrGuardData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Error)) {
            return false;
        }
        Error error = (Error) other;
        return this.type == error.type && fr.t.c(this.vmsAdapter, error.vmsAdapter) && fr.t.c(this.parentOrGuardData, error.parentOrGuardData);
    }

    @Override // bm1.d
    public kk1.a getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.vmsAdapter.hashCode()) * 31) + this.parentOrGuardData.hashCode();
    }

    public String toString() {
        return "Error(type=" + this.type + ", vmsAdapter=" + this.vmsAdapter + ", parentOrGuardData=" + this.parentOrGuardData + ')';
    }
}
