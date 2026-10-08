package p053fw;

import fr.k;
import fr.t;
import fu.r;
import java.net.URI;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import zv.a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000 \u001b2\u00020\u0001:\u0002\u0011\u001eB!\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0011\u001a\u00020\u00102\n\u0010\u000b\u001a\u00060\tR\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0004¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0019\u001a\u00020\u00102\n\u0010\u000b\u001a\u00060\tR\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u0004\u0018\u00010\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u001b\u0010\u001cR\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lfw/l;", "Lfw/e;", "Ljava/net/URI;", "Lorg/intellij/markdown/html/URI;", "baseURI", "", "resolveAnchors", "<init>", "(Ljava/net/URI;Z)V", "Lfw/g$c;", "Lfw/g;", "visitor", "", "text", "Lzv/a;", "node", "Loq/i0;", "a", "(Lfw/g$c;Ljava/lang/String;Lzv/a;)V", "", "destination", "e", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "Lfw/l$b;", "info", "f", "(Lfw/g$c;Ljava/lang/String;Lzv/a;Lfw/l$b;)V", "c", "(Ljava/lang/String;Lzv/a;)Lfw/l$b;", "Ljava/net/URI;", "b", "()Ljava/net/URI;", "Z", "d", "()Z", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public abstract class l implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final r f67665d = new r(0, 0, 3, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final r f67666e = new r(1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final URI baseURI;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean resolveAnchors;

    /* JADX INFO: renamed from: fw.l$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lfw/l$b;", "", "Lzv/a;", AnnotatedPrivateKey.LABEL, "", "destination", "title", "<init>", "(Lzv/a;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "a", "(Lzv/a;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Lfw/l$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lzv/a;", "d", "()Lzv/a;", "b", "Ljava/lang/CharSequence;", "c", "()Ljava/lang/CharSequence;", "e", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class RenderInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final a label;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final CharSequence destination;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final CharSequence title;

        public RenderInfo(a aVar, CharSequence charSequence, CharSequence charSequence2) {
            this.label = aVar;
            this.destination = charSequence;
            this.title = charSequence2;
        }

        public static /* synthetic */ RenderInfo b(RenderInfo renderInfo, a aVar, CharSequence charSequence, CharSequence charSequence2, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                aVar = renderInfo.label;
            }
            if ((i15 & 2) != 0) {
                charSequence = renderInfo.destination;
            }
            if ((i15 & 4) != 0) {
                charSequence2 = renderInfo.title;
            }
            return renderInfo.a(aVar, charSequence, charSequence2);
        }

        public final RenderInfo a(a label, CharSequence destination, CharSequence title) {
            return new RenderInfo(label, destination, title);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final CharSequence getDestination() {
            return this.destination;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final a getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final CharSequence getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RenderInfo)) {
                return false;
            }
            RenderInfo renderInfo = (RenderInfo) other;
            return t.c(this.label, renderInfo.label) && t.c(this.destination, renderInfo.destination) && t.c(this.title, renderInfo.title);
        }

        public int hashCode() {
            int iHashCode = ((this.label.hashCode() * 31) + this.destination.hashCode()) * 31;
            CharSequence charSequence = this.title;
            return iHashCode + (charSequence == null ? 0 : charSequence.hashCode());
        }

        public String toString() {
            return "RenderInfo(label=" + this.label + ", destination=" + ((Object) this.destination) + ", title=" + ((Object) this.title) + ')';
        }
    }

    public l(URI uri, boolean z15) {
        this.baseURI = uri;
        this.resolveAnchors = z15;
    }

    @Override // p053fw.e
    public final void a(g.c visitor, String text, a node) {
        RenderInfo renderInfoC = c(text, node);
        if (renderInfoC == null) {
            f67665d.a(visitor, text, node);
        } else {
            f(visitor, text, node, renderInfoC);
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final URI getBaseURI() {
        return this.baseURI;
    }

    public abstract RenderInfo c(String text, a node);

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getResolveAnchors() {
        return this.resolveAnchors;
    }

    protected final CharSequence e(CharSequence destination) {
        URI uri;
        String strA;
        return ((!this.resolveAnchors && r.Y0(destination, '#', false, 2, null)) || (uri = this.baseURI) == null || (strA = d.a(uri, destination.toString())) == null) ? destination : strA;
    }

    public void f(g.c visitor, String text, a node, RenderInfo info) {
        String str;
        String str2 = "href=\"" + ((Object) e(info.getDestination())) + '\"';
        CharSequence title = info.getTitle();
        if (title != null) {
            str = "title=\"" + ((Object) title) + '\"';
        } else {
            str = null;
        }
        g.c.e(visitor, node, "a", new CharSequence[]{str2, str}, false, 8, null);
        f67666e.a(visitor, text, info.getLabel());
        visitor.c("a");
    }

    public /* synthetic */ l(URI uri, boolean z15, int i15, k kVar) {
        this(uri, (i15 & 2) != 0 ? false : z15);
    }
}
