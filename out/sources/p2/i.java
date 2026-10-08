package p2;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"Lp2/i;", "Lp2/q;", "parent", "", "index", "<init>", "(Lp2/q;I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Lp2/q;", "getParent", "()Lp2/q;", "b", "I", "getIndex", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class i extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q parent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int index;

    public i(q qVar, int i15) {
        super(null);
        this.parent = qVar;
        this.index = i15;
    }

    public boolean equals(Object other) {
        if (!(other instanceof i)) {
            return false;
        }
        i iVar = (i) other;
        return t.c(iVar.parent, this.parent) && iVar.index == this.index;
    }

    public int hashCode() {
        return (this.index * 31) + this.parent.hashCode();
    }
}
