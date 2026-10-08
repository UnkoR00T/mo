package p053fw;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;
import yv.e;
import zv.a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\f\u001a\u00020\u000b2\n\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000e\u001a\u00020\u000b2\n\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lfw/s;", "Lfw/j;", "<init>", "()V", "Lfw/g$c;", "Lfw/g;", "visitor", "", "text", "Lzv/a;", "node", "Loq/i0;", "c", "(Lfw/g$c;Ljava/lang/String;Lzv/a;)V", "b", "", "d", "(Lzv/a;)Ljava/util/List;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class s extends j {
    @Override // p053fw.n
    public void b(g.c visitor, String text, a node) {
    }

    @Override // p053fw.n
    public void c(g.c visitor, String text, a node) {
    }

    @Override // p053fw.j
    public List<a> d(a node) {
        List<a> children = node.getChildren();
        int i15 = 0;
        while (i15 < children.size() && t.c(children.get(i15).getType(), e.N)) {
            i15++;
        }
        int size = children.size();
        while (size > i15 && t.c(children.get(size - 1).getType(), e.N)) {
            size--;
        }
        return children.subList(i15, size);
    }
}
