package r2;

import java.util.Iterator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0017¨\u0006!"}, d2 = {"Lr2/x;", "Le3/n;", "", "Lr2/o;", "table", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "group", "version", "<init>", "(Lr2/o;II)V", "Loq/i0;", "e", "()V", "", "iterator", "()Ljava/util/Iterator;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Lr2/o;", "getTable", "()Lr2/o;", "b", "I", "getGroup", "c", "getVersion", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class x implements e3.n, Iterable<e3.n>, gr.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o table;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int group;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int version;

    public x(o oVar, int i15, int i16) {
        this.table = oVar;
        this.group = i15;
        this.version = i16;
    }

    private final void e() {
        if (this.table.getVersion() != this.version) {
            a0.o();
        }
    }

    public boolean equals(Object other) {
        if (!(other instanceof x)) {
            return false;
        }
        x xVar = (x) other;
        return xVar.group == this.group && xVar.version == this.version && fr.t.c(xVar.table, this.table);
    }

    public int hashCode() {
        return this.group + (this.table.hashCode() * 31);
    }

    @Override // java.lang.Iterable
    public Iterator<e3.n> iterator() {
        e();
        k kVarF = this.table.getAddressSpace().F(this.group);
        if (kVarF == null) {
            o oVar = this.table;
            return new g(oVar, oVar.B(this.group));
        }
        o oVar2 = this.table;
        int i15 = this.group;
        return new d0(oVar2, i15, kVarF, new b(i15));
    }
}
