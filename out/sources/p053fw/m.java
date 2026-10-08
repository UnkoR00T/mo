package p053fw;

import aw.b;
import fr.t;
import p071kotlin.Metadata;
import yv.c;
import yv.d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\f\u001a\u00020\u000b2\n\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lfw/m;", "Lfw/q;", "<init>", "()V", "Lfw/g$c;", "Lfw/g;", "visitor", "", "text", "Lzv/a;", "node", "Loq/i0;", "a", "(Lfw/g$c;Ljava/lang/String;Lzv/a;)V", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class m extends q {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\f\u001a\u00020\u000b2\n\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000e\u001a\u00020\u000b2\n\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lfw/m$a;", "Lfw/j;", "<init>", "()V", "Lfw/g$c;", "Lfw/g;", "visitor", "", "text", "Lzv/a;", "node", "Loq/i0;", "c", "(Lfw/g$c;Ljava/lang/String;Lzv/a;)V", "b", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class a extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f67672a = new a();

        private a() {
        }

        @Override // p053fw.n
        public void b(g.c visitor, String text, zv.a node) {
        }

        @Override // p053fw.n
        public void c(g.c visitor, String text, zv.a node) {
        }
    }

    public m() {
        super("li");
    }

    @Override // p053fw.n, p053fw.e
    public void a(g.c visitor, String text, zv.a node) {
        hw.a aVar = hw.a.f86718a;
        if (!(node instanceof b)) {
            throw new d("");
        }
        c(visitor, text, node);
        zv.a parent = node.getParent();
        if (!(parent instanceof aw.a)) {
            throw new d("");
        }
        boolean zE = ((aw.a) parent).e();
        for (zv.a aVar2 : node.getChildren()) {
            if (!t.c(aVar2.getType(), c.PARAGRAPH) || zE) {
                zv.d.a(aVar2, visitor);
            } else {
                a.f67672a.a(visitor, text, aVar2);
            }
        }
        b(visitor, text, node);
    }
}
