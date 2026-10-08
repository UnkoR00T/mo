package p053fw;

import fu.o;
import iw.c;
import java.net.URI;
import p071kotlin.Metadata;
import zv.a;
import zv.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 $2\u00020\u0001:\u0001%B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0018\u001a\u00020\u00172\n\u0010\u0015\u001a\u00060\u0013R\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u001a8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010#\u001a\u00020\u001f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lfw/i;", "Lfw/l;", "Liw/c;", "linkMap", "Ljava/net/URI;", "Lorg/intellij/markdown/html/URI;", "baseURI", "<init>", "(Liw/c;Ljava/net/URI;)V", "Lzv/a;", "node", "", "text", "", "g", "(Lzv/a;Ljava/lang/String;)Ljava/lang/CharSequence;", "Lfw/l$b;", "c", "(Ljava/lang/String;Lzv/a;)Lfw/l$b;", "Lfw/g$c;", "Lfw/g;", "visitor", "info", "Loq/i0;", "f", "(Lfw/g$c;Ljava/lang/String;Lzv/a;Lfw/l$b;)V", "Lfw/o;", "Lfw/o;", "getReferenceLinkProvider", "()Lfw/o;", "referenceLinkProvider", "Lfw/k;", "Lfw/k;", "getInlineLinkProvider", "()Lfw/k;", "inlineLinkProvider", "h", "a", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class i extends l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final o f67661i = new o("[^a-zA-Z0-9 ]");

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final o referenceLinkProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k inlineLinkProvider;

    public i(c cVar, URI uri) {
        super(uri, false, 2, null);
        this.referenceLinkProvider = new o(cVar, uri, false, 4, null);
        this.inlineLinkProvider = new k(uri, false, 2, null);
    }

    private final CharSequence g(a node, String text) {
        return f67661i.h(e.b(node, text), "");
    }

    @Override // p053fw.l
    public l.RenderInfo c(String text, a node) {
        a aVarA = e.a(node, yv.c.INLINE_LINK);
        if (aVarA != null) {
            return this.inlineLinkProvider.c(text, aVarA);
        }
        a aVarA2 = e.a(node, yv.c.FULL_REFERENCE_LINK);
        if (aVarA2 == null) {
            aVarA2 = e.a(node, yv.c.SHORT_REFERENCE_LINK);
        }
        if (aVarA2 != null) {
            return this.referenceLinkProvider.c(text, aVarA2);
        }
        return null;
    }

    @Override // p053fw.l
    public void f(g.c visitor, String text, a node, l.RenderInfo info) {
        String str;
        String str2 = "src=\"" + ((Object) e(info.getDestination())) + '\"';
        String str3 = "alt=\"" + ((Object) g(info.getLabel(), text)) + '\"';
        CharSequence title = info.getTitle();
        if (title != null) {
            str = "title=\"" + ((Object) title) + '\"';
        } else {
            str = null;
        }
        visitor.d(node, "img", new CharSequence[]{str2, str3, str}, true);
    }
}
