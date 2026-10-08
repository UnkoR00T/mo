package p2;

import java.util.ArrayList;
import java.util.Iterator;
import p071kotlin.Metadata;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0016R\u0016\u0010$\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0016¨\u0006%"}, d2 = {"Lp2/p;", "", "Le3/n;", "Lp2/l;", "table", "", "parent", "Lp2/e;", "group", "Lp2/q;", "path", "<init>", "(Lp2/l;ILp2/e;Lp2/q;)V", "", "hasNext", "()Z", "a", "()Le3/n;", "Lp2/l;", "getTable", "()Lp2/l;", "b", "I", "getParent", "()I", "c", "Lp2/e;", "getGroup", "()Lp2/e;", "d", "Lp2/q;", "getPath", "()Lp2/q;", "e", "version", "f", "index", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class p implements Iterator<e3.n>, gr.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l table;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int parent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e group;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q path;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int version;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int index;

    public p(l lVar, int i15, e eVar, q qVar) {
        this.table = lVar;
        this.parent = i15;
        this.group = eVar;
        this.path = qVar;
        this.version = lVar.getVersion();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e3.n next() {
        Object obj;
        ArrayList<Object> arrayListB = this.group.b();
        if (arrayListB != null) {
            int i15 = this.index;
            this.index = i15 + 1;
            obj = arrayListB.get(i15);
        } else {
            obj = null;
        }
        if (obj instanceof c) {
            return new m(this.table, ((c) obj).getLocation(), this.version);
        }
        if (obj instanceof e) {
            return new r(this.table, this.parent, (e) obj, new i(this.path, this.index - 1));
        }
        t.c("Unexpected group information structure");
        throw new oq.g();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ArrayList<Object> arrayListB = this.group.b();
        return arrayListB != null && this.index < arrayListB.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
