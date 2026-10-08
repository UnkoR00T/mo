package p053fw;

import fr.k;
import fr.t;
import gw.b;
import iw.c;
import java.net.URI;
import java.util.Iterator;
import p071kotlin.Metadata;
import zv.a;
import zv.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lfw/o;", "Lfw/l;", "Liw/c;", "linkMap", "Ljava/net/URI;", "Lorg/intellij/markdown/html/URI;", "baseURI", "", "resolveAnchors", "<init>", "(Liw/c;Ljava/net/URI;Z)V", "", "text", "Lzv/a;", "node", "Lfw/l$b;", "c", "(Ljava/lang/String;Lzv/a;)Lfw/l$b;", "f", "Liw/c;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class o extends l {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final c linkMap;

    public /* synthetic */ o(c cVar, URI uri, boolean z15, int i15, k kVar) {
        this(cVar, uri, (i15 & 4) != 0 ? false : z15);
    }

    @Override // p053fw.l
    public l.RenderInfo c(String text, a node) {
        Object next;
        c.LinkInfo linkInfoB;
        Object next2;
        Iterator<T> it = node.getChildren().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!t.c(((a) next).getType(), yv.c.LINK_LABEL));
        a aVar = (a) next;
        if (aVar == null || (linkInfoB = this.linkMap.b(e.b(aVar, text))) == null) {
            return null;
        }
        Iterator<T> it4 = node.getChildren().iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (!t.c(((a) next2).getType(), yv.c.LINK_TEXT));
        a aVar2 = (a) next2;
        if (aVar2 != null) {
            aVar = aVar2;
        }
        b bVar = b.f77346a;
        String strB = bVar.b(linkInfoB.getDestination(), true, true);
        CharSequence title = linkInfoB.getTitle();
        return new l.RenderInfo(aVar, strB, title != null ? bVar.b(title, true, true) : null);
    }

    public o(c cVar, URI uri, boolean z15) {
        super(uri, z15);
        this.linkMap = cVar;
    }
}
