package p053fw;

import java.util.List;
import p071kotlin.Metadata;
import zv.a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000b\u001a\u00060\tR\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0012\u001a\u00020\u000f2\n\u0010\u000b\u001a\u00060\tR\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lfw/p;", "Lfw/j;", "", "tagName", "", "renderFrom", "renderTo", "<init>", "(Ljava/lang/String;II)V", "Lfw/g$c;", "Lfw/g;", "visitor", "text", "Lzv/a;", "node", "Loq/i0;", "c", "(Lfw/g$c;Ljava/lang/String;Lzv/a;)V", "b", "", "d", "(Lzv/a;)Ljava/util/List;", "a", "Ljava/lang/String;", "getTagName", "()Ljava/lang/String;", "I", "getRenderFrom", "()I", "getRenderTo", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class p extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String tagName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int renderFrom;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int renderTo;

    public p(String str, int i15, int i16) {
        this.tagName = str;
        this.renderFrom = i15;
        this.renderTo = i16;
    }

    @Override // p053fw.n
    public void b(g.c visitor, String text, a node) {
        visitor.c(this.tagName);
    }

    @Override // p053fw.n
    public void c(g.c visitor, String text, a node) {
        g.c.e(visitor, node, this.tagName, new CharSequence[0], false, 8, null);
    }

    @Override // p053fw.j
    public List<a> d(a node) {
        return node.getChildren().subList(this.renderFrom, node.getChildren().size() + this.renderTo);
    }
}
