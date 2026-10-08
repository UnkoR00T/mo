package p2;

import fr.t;
import java.util.Iterator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0016¨\u0006 "}, d2 = {"Lp2/m;", "Le3/n;", "", "Lp2/l;", "table", "", "group", "version", "<init>", "(Lp2/l;II)V", "Loq/i0;", "e", "()V", "", "iterator", "()Ljava/util/Iterator;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Lp2/l;", "getTable", "()Lp2/l;", "b", "I", "getGroup", "c", "getVersion", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class m implements e3.n, Iterable<e3.n>, gr.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l table;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int group;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int version;

    public m(l lVar, int i15, int i16) {
        this.table = lVar;
        this.group = i15;
        this.version = i16;
    }

    private final void e() {
        if (this.table.getVersion() != this.version) {
            n.y();
        }
    }

    public boolean equals(Object other) {
        if (!(other instanceof m)) {
            return false;
        }
        m mVar = (m) other;
        return mVar.group == this.group && mVar.version == this.version && t.c(mVar.table, this.table);
    }

    public int hashCode() {
        return this.group + (this.table.hashCode() * 31);
    }

    @Override // java.lang.Iterable
    public Iterator<e3.n> iterator() {
        e();
        e eVarZ = this.table.Z(this.group);
        if (eVarZ != null) {
            l lVar = this.table;
            int i15 = this.group;
            return new p(lVar, i15, eVarZ, new a(i15));
        }
        l lVar2 = this.table;
        int i16 = this.group;
        return new f(lVar2, i16 + 1, i16 + n.s(lVar2.getGroups(), this.group));
    }
}
