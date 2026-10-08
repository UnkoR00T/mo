package p053fw;

import p071kotlin.Metadata;
import zv.a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0006R\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u000f\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0006R\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lfw/q;", "Lfw/n;", "", "tagName", "<init>", "(Ljava/lang/String;)V", "Lfw/g$c;", "Lfw/g;", "visitor", "text", "Lzv/a;", "node", "Loq/i0;", "c", "(Lfw/g$c;Ljava/lang/String;Lzv/a;)V", "b", "a", "Ljava/lang/String;", "getTagName", "()Ljava/lang/String;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class q extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String tagName;

    public q(String str) {
        this.tagName = str;
    }

    @Override // p053fw.n
    public void b(g.c visitor, String text, a node) {
        visitor.c(this.tagName);
    }

    @Override // p053fw.n
    public void c(g.c visitor, String text, a node) {
        g.c.e(visitor, node, this.tagName, new CharSequence[0], false, 8, null);
    }
}
