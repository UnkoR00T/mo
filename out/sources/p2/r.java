package p2;

import fr.t;
import java.util.Iterator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010*\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lp2/r;", "Le3/n;", "", "Lp2/l;", "table", "", "parent", "Lp2/e;", "sourceInformation", "Lp2/q;", "identityPath", "<init>", "(Lp2/l;ILp2/e;Lp2/q;)V", "", "iterator", "()Ljava/util/Iterator;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Lp2/l;", "getTable", "()Lp2/l;", "b", "I", "getParent", "c", "Lp2/e;", "getSourceInformation", "()Lp2/e;", "d", "Lp2/q;", "getIdentityPath", "()Lp2/q;", "e", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "f", "Ljava/lang/Iterable;", "getCompositionGroups", "()Ljava/lang/Iterable;", "compositionGroups", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class r implements e3.n, Iterable<e3.n>, gr.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l table;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int parent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e sourceInformation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q identityPath;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object key;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Iterable<e3.n> compositionGroups = this;

    public r(l lVar, int i15, e eVar, q qVar) {
        this.table = lVar;
        this.parent = i15;
        this.sourceInformation = eVar;
        this.identityPath = qVar;
        this.key = Integer.valueOf(eVar.getKey());
    }

    public boolean equals(Object other) {
        if (!(other instanceof r)) {
            return false;
        }
        r rVar = (r) other;
        return rVar.parent == this.parent && t.c(rVar.table, this.table) && t.c(rVar.identityPath, this.identityPath);
    }

    public int hashCode() {
        return (((this.parent * 31) + this.table.hashCode()) * 31) + this.identityPath.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<e3.n> iterator() {
        return new p(this.table, this.parent, this.sourceInformation, this.identityPath);
    }
}
