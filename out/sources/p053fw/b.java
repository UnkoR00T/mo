package p053fw;

import er.l;
import fr.w;
import fu.r;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\f\u001a\u00020\u000b2\n\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lfw/b;", "Lfw/e;", "<init>", "()V", "Lfw/g$c;", "Lfw/g;", "visitor", "", "text", "Lzv/a;", "node", "Loq/i0;", "a", "(Lfw/g$c;Ljava/lang/String;Lzv/a;)V", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class b implements e {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzv/a;", "it", "", "c", "(Lzv/a;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 0})
    static final class a extends w implements l<zv.a, CharSequence> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f67646b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.f67646b = str;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final CharSequence b(zv.a aVar) {
            return g.INSTANCE.c(this.f67646b, aVar, false);
        }
    }

    @Override // p053fw.e
    public void a(g.c visitor, String text, zv.a node) {
        String string = r.u1(v.v0(node.getChildren().subList(1, node.getChildren().size() - 1), "", null, null, 0, null, new a(text), 30, null)).toString();
        g.c.e(visitor, node, "code", new CharSequence[0], false, 8, null);
        visitor.b(string);
        visitor.c("code");
    }
}
