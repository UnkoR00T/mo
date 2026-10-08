package p053fw;

import p071kotlin.Metadata;
import pq.v;
import yv.e;
import zv.a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\f\u001a\u00020\u000b2\n\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lfw/f;", "Lfw/e;", "<init>", "()V", "Lfw/g$c;", "Lfw/g;", "visitor", "", "text", "Lzv/a;", "node", "Loq/i0;", "a", "(Lfw/g$c;Ljava/lang/String;Lzv/a;)V", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class f implements e {
    @Override // p053fw.e
    public void a(g.c visitor, String text, a node) {
        for (a aVar : node.getChildren()) {
            if (v.q(e.f229936q, e.f229924e).contains(aVar.getType())) {
                visitor.b(zv.e.b(aVar, text));
            }
        }
        visitor.b("\n");
    }
}
