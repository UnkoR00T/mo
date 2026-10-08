package dw;

import fu.r;
import java.net.URI;
import java.util.List;
import java.util.Map;
import oq.y;
import p053fw.k;
import p053fw.m;
import p053fw.o;
import p053fw.p;
import p053fw.q;
import p053fw.s;
import p053fw.t;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u0018\u0010\u001cR\u001a\u0010!\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b\u0014\u0010 ¨\u0006\""}, d2 = {"Ldw/a;", "Lcw/a;", "", "useSafeLinks", "absolutizeAnchorLinks", "<init>", "(ZZ)V", "Lhw/d;", "c", "()Lhw/d;", "Liw/c;", "linkMap", "Ljava/net/URI;", "Lorg/intellij/markdown/html/URI;", "baseURI", "", "Lyv/a;", "Lfw/e;", "d", "(Liw/c;Ljava/net/URI;)Ljava/util/Map;", "a", "Z", "e", "()Z", "b", "getAbsolutizeAnchorLinks", "Liw/g;", "Liw/g;", "()Liw/g;", "markerProcessorFactory", "Lnw/g;", "Lnw/g;", "()Lnw/g;", "sequentialParserManager", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class a implements cw.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean useSafeLinks;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean absolutizeAnchorLinks;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iw.g markerProcessorFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final nw.g sequentialParserManager;

    /* JADX INFO: renamed from: dw.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\n\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"dw/a$a", "Lfw/e;", "Lfw/g$c;", "Lfw/g;", "visitor", "", "text", "Lzv/a;", "node", "Loq/i0;", "a", "(Lfw/g$c;Ljava/lang/String;Lzv/a;)V", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class C1018a implements p053fw.e {
        C1018a() {
        }

        @Override // p053fw.e
        public void a(fw.g.c visitor, String text, zv.a node) {
            visitor.b(zv.e.b(node, text));
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\n\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"dw/a$b", "Lfw/q;", "Lfw/g$c;", "Lfw/g;", "visitor", "", "text", "Lzv/a;", "node", "Loq/i0;", "c", "(Lfw/g$c;Ljava/lang/String;Lzv/a;)V", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class b extends q {
        b() {
            super("ol");
        }

        @Override // p053fw.q, p053fw.n
        public void c(fw.g.c visitor, String text, zv.a node) {
            zv.a aVarA;
            CharSequence charSequenceB;
            String string;
            String string2;
            zv.a aVarA2 = zv.e.a(node, yv.c.LIST_ITEM);
            String string3 = null;
            if (aVarA2 != null && (aVarA = zv.e.a(aVarA2, yv.e.D)) != null && (charSequenceB = zv.e.b(aVarA, text)) != null && (string = charSequenceB.toString()) != null && (string2 = r.u1(string).toString()) != null) {
                String strX1 = r.x1(string2.substring(0, string2.length() - 1), '0');
                if (!strX1.equals("1")) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("start=\"");
                    if (strX1.length() == 0) {
                        strX1 = com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1;
                    }
                    sb5.append(strX1);
                    sb5.append('\"');
                    string3 = sb5.toString();
                }
            }
            fw.g.c.e(visitor, node, "ol", new CharSequence[]{string3}, false, 8, null);
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\n\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"dw/a$c", "Lfw/e;", "Lfw/g$c;", "Lfw/g;", "visitor", "", "text", "Lzv/a;", "node", "Loq/i0;", "a", "(Lfw/g$c;Ljava/lang/String;Lzv/a;)V", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class c implements p053fw.e {
        c() {
        }

        @Override // p053fw.e
        public void a(fw.g.c visitor, String text, zv.a node) {
            CharSequence charSequenceB = zv.e.b(node, text);
            String strB = gw.b.f77346a.b(charSequenceB.subSequence(1, charSequenceB.length() - 1), true, false);
            CharSequence charSequenceC = iw.c.INSTANCE.c(charSequenceB, false);
            if (a.this.getUseSafeLinks()) {
                charSequenceC = t.b(charSequenceC);
            }
            fw.g.c.e(visitor, node, "a", new CharSequence[]{"href=\"" + ((Object) charSequenceC) + '\"'}, false, 8, null);
            visitor.b(strB);
            visitor.c("a");
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\n\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"dw/a$d", "Lfw/e;", "Lfw/g$c;", "Lfw/g;", "visitor", "", "text", "Lzv/a;", "node", "Loq/i0;", "a", "(Lfw/g$c;Ljava/lang/String;Lzv/a;)V", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class d implements p053fw.e {
        d() {
        }

        @Override // p053fw.e
        public void a(fw.g.c visitor, String text, zv.a node) {
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\n\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"dw/a$e", "Lfw/e;", "Lfw/g$c;", "Lfw/g;", "visitor", "", "text", "Lzv/a;", "node", "Loq/i0;", "a", "(Lfw/g$c;Ljava/lang/String;Lzv/a;)V", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class e implements p053fw.e {
        e() {
        }

        @Override // p053fw.e
        public void a(fw.g.c visitor, String text, zv.a node) {
            visitor.b("<pre>");
            fw.g.c.e(visitor, node, "code", new CharSequence[0], false, 8, null);
            for (zv.a aVar : node.getChildren()) {
                if (fr.t.c(aVar.getType(), yv.e.f229922c)) {
                    p053fw.g.Companion companion = p053fw.g.INSTANCE;
                    visitor.b(companion.e(companion.c(text, aVar, false), 4));
                } else if (fr.t.c(aVar.getType(), yv.e.f229936q)) {
                    visitor.b("\n");
                }
            }
            visitor.b("\n");
            visitor.c("code");
            visitor.b("</pre>");
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\n\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"dw/a$f", "Lfw/e;", "Lfw/g$c;", "Lfw/g;", "visitor", "", "text", "Lzv/a;", "node", "Loq/i0;", "a", "(Lfw/g$c;Ljava/lang/String;Lzv/a;)V", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class f implements p053fw.e {
        f() {
        }

        @Override // p053fw.e
        public void a(fw.g.c visitor, String text, zv.a node) {
            visitor.b("<hr />");
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\n\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"dw/a$g", "Lfw/e;", "Lfw/g$c;", "Lfw/g;", "visitor", "", "text", "Lzv/a;", "node", "Loq/i0;", "a", "(Lfw/g$c;Ljava/lang/String;Lzv/a;)V", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class g implements p053fw.e {
        g() {
        }

        @Override // p053fw.e
        public void a(fw.g.c visitor, String text, zv.a node) {
            visitor.b("<br />");
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J+\u0010\n\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\f\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"dw/a$h", "Lfw/s;", "Lfw/g$c;", "Lfw/g;", "visitor", "", "text", "Lzv/a;", "node", "Loq/i0;", "c", "(Lfw/g$c;Ljava/lang/String;Lzv/a;)V", "b", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class h extends s {
        h() {
        }

        @Override // p053fw.s, p053fw.n
        public void b(fw.g.c visitor, String text, zv.a node) {
            visitor.c("p");
        }

        @Override // p053fw.s, p053fw.n
        public void c(fw.g.c visitor, String text, zv.a node) {
            fw.g.c.e(visitor, node, "p", new CharSequence[0], false, 8, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"dw/a$i", "Lnw/g;", "", "Lnw/f;", "a", "()Ljava/util/List;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class i extends nw.g {
        i() {
        }

        @Override // nw.g
        public List<nw.f> a() {
            return v.q(new ow.a(v.e(yv.e.J)), new ow.b(), new ow.d(), new ow.e(), new ow.g(), new nw.b(new ow.c()));
        }
    }

    public a(boolean z15, boolean z16) {
        this.useSafeLinks = z15;
        this.absolutizeAnchorLinks = z16;
        this.markerProcessorFactory = dw.b.a.f44736a;
        this.sequentialParserManager = new i();
    }

    @Override // cw.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public nw.g getSequentialParserManager() {
        return this.sequentialParserManager;
    }

    @Override // cw.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public iw.g getMarkerProcessorFactory() {
        return this.markerProcessorFactory;
    }

    @Override // cw.a
    public hw.d c() {
        return new hw.d(new hw.g());
    }

    @Override // cw.a
    public Map<yv.a, p053fw.e> d(iw.c linkMap, URI baseURI) {
        return v0.k(y.a(yv.c.MARKDOWN_FILE, new q("body")), y.a(yv.c.HTML_BLOCK, new p053fw.f()), y.a(yv.e.L, new C1018a()), y.a(yv.c.BLOCK_QUOTE, new q("blockquote")), y.a(yv.c.ORDERED_LIST, new b()), y.a(yv.c.UNORDERED_LIST, new q("ul")), y.a(yv.c.LIST_ITEM, new m()), y.a(yv.e.f229942w, new s()), y.a(yv.c.SETEXT_1, new q("h1")), y.a(yv.c.SETEXT_2, new q("h2")), y.a(yv.e.f229939t, new s()), y.a(yv.c.ATX_1, new q("h1")), y.a(yv.c.ATX_2, new q("h2")), y.a(yv.c.ATX_3, new q("h3")), y.a(yv.c.ATX_4, new q("h4")), y.a(yv.c.ATX_5, new q("h5")), y.a(yv.c.ATX_6, new q("h6")), y.a(yv.c.AUTOLINK, new c()), y.a(yv.c.LINK_LABEL, new p053fw.r(0, 0, 3, null)), y.a(yv.c.LINK_TEXT, new p053fw.r(0, 0, 3, null)), y.a(yv.c.LINK_TITLE, new p053fw.r(0, 0, 3, null)), y.a(yv.c.INLINE_LINK, t.a(new k(baseURI, this.absolutizeAnchorLinks), this.useSafeLinks)), y.a(yv.c.FULL_REFERENCE_LINK, t.a(new o(linkMap, baseURI, this.absolutizeAnchorLinks), this.useSafeLinks)), y.a(yv.c.SHORT_REFERENCE_LINK, t.a(new o(linkMap, baseURI, this.absolutizeAnchorLinks), this.useSafeLinks)), y.a(yv.c.IMAGE, t.a(new p053fw.i(linkMap, baseURI), this.useSafeLinks)), y.a(yv.c.LINK_DEFINITION, new d()), y.a(yv.c.CODE_FENCE, new p053fw.a()), y.a(yv.c.CODE_BLOCK, new e()), y.a(yv.e.C, new f()), y.a(yv.e.f229935p, new g()), y.a(yv.c.PARAGRAPH, new h()), y.a(yv.c.EMPH, new p("em", 1, -1)), y.a(yv.c.STRONG, new p("strong", 2, -2)), y.a(yv.c.CODE_SPAN, new p053fw.b()));
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    protected final boolean getUseSafeLinks() {
        return this.useSafeLinks;
    }

    public /* synthetic */ a(boolean z15, boolean z16, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? true : z15, (i15 & 2) != 0 ? false : z16);
    }
}
