package p053fw;

import java.util.List;
import p071kotlin.Metadata;
import zv.a;
import zv.d;
import zv.g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000f\u001a\u00020\u000e2\n\u0010\u000b\u001a\u00060\tR\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lfw/j;", "Lfw/n;", "<init>", "()V", "Lzv/a;", "node", "", "d", "(Lzv/a;)Ljava/util/List;", "Lfw/g$c;", "Lfw/g;", "visitor", "", "text", "Loq/i0;", "a", "(Lfw/g$c;Ljava/lang/String;Lzv/a;)V", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public abstract class j extends n {
    @Override // p053fw.n, p053fw.e
    public void a(g.c visitor, String text, a node) {
        c(visitor, text, node);
        for (a aVar : d(node)) {
            if (aVar instanceof g) {
                visitor.f(aVar);
            } else {
                d.a(aVar, visitor);
            }
        }
        b(visitor, text, node);
    }

    public List<a> d(a node) {
        return node.getChildren();
    }
}
