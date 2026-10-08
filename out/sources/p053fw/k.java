package p053fw;

import java.net.URI;
import p071kotlin.Metadata;
import yv.c;
import zv.a;
import zv.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lfw/k;", "Lfw/l;", "Ljava/net/URI;", "Lorg/intellij/markdown/html/URI;", "baseURI", "", "resolveAnchors", "<init>", "(Ljava/net/URI;Z)V", "", "text", "Lzv/a;", "node", "Lfw/l$b;", "c", "(Ljava/lang/String;Lzv/a;)Lfw/l$b;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class k extends l {
    public /* synthetic */ k(URI uri, boolean z15, int i15, fr.k kVar) {
        this(uri, (i15 & 2) != 0 ? false : z15);
    }

    @Override // p053fw.l
    public l.RenderInfo c(String text, a node) {
        CharSequence charSequenceC;
        CharSequence charSequenceB;
        CharSequence charSequenceB2;
        a aVarA = e.a(node, c.LINK_TEXT);
        CharSequence charSequenceE = null;
        if (aVarA == null) {
            return null;
        }
        a aVarA2 = e.a(node, c.LINK_DESTINATION);
        if (aVarA2 == null || (charSequenceB2 = e.b(aVarA2, text)) == null || (charSequenceC = iw.c.INSTANCE.c(charSequenceB2, true)) == null) {
            charSequenceC = "";
        }
        a aVarA3 = e.a(node, c.LINK_TITLE);
        if (aVarA3 != null && (charSequenceB = e.b(aVarA3, text)) != null) {
            charSequenceE = iw.c.INSTANCE.e(charSequenceB);
        }
        return new l.RenderInfo(aVarA, charSequenceC, charSequenceE);
    }

    public k(URI uri, boolean z15) {
        super(uri, z15);
    }
}
