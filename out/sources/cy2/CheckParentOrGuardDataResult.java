package cy2;

import al0.ParentOrGuardData;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: cy2.d, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcy2/d;", "", "Lal0/j0;", "parentOrGuardData", "<init>", "(Lal0/j0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/j0;", "getParentOrGuardData", "()Lal0/j0;", "b", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "data", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CheckParentOrGuardDataResult implements h00.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ParentOrGuardData parentOrGuardData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object data;

    public CheckParentOrGuardDataResult(ParentOrGuardData parentOrGuardData) {
        this.parentOrGuardData = parentOrGuardData;
        this.data = parentOrGuardData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CheckParentOrGuardDataResult) && t.c(this.parentOrGuardData, ((CheckParentOrGuardDataResult) other).parentOrGuardData);
    }

    @Override // h00.b
    public Object getData() {
        return this.data;
    }

    public int hashCode() {
        return this.parentOrGuardData.hashCode();
    }

    public String toString() {
        return "CheckParentOrGuardDataResult(parentOrGuardData=" + this.parentOrGuardData + ')';
    }
}
