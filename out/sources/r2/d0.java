package r2;

import java.util.ArrayList;
import java.util.Iterator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0016R\u0016\u0010$\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0016¨\u0006%"}, d2 = {"Lr2/d0;", "", "Le3/n;", "Lr2/o;", "table", "", "parent", "Lr2/k;", "group", "Lr2/e0;", "path", "<init>", "(Lr2/o;ILr2/k;Lr2/e0;)V", "", "hasNext", "()Z", "a", "()Le3/n;", "Lr2/o;", "getTable", "()Lr2/o;", "b", "I", "getParent", "()I", "c", "Lr2/k;", "getGroup", "()Lr2/k;", "d", "Lr2/e0;", "getPath", "()Lr2/e0;", "e", "version", "f", "index", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d0 implements Iterator<e3.n>, gr.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o table;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int parent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k group;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e0 path;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int version;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int index;

    public d0(o oVar, int i15, k kVar, e0 e0Var) {
        this.table = oVar;
        this.parent = i15;
        this.group = kVar;
        this.path = e0Var;
        this.version = oVar.getVersion();
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
        if (obj instanceof i) {
            return new x(this.table, ((i) obj).getAddress(), this.version);
        }
        if (obj instanceof k) {
            return new f0(this.table, this.parent, (k) obj, new m(this.path, this.index - 1));
        }
        p076m2.t.c("Unexpected group information structure");
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
