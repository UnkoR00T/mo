package p053fw;

import er.q;
import fr.k;
import fr.t;
import fu.r;
import java.util.Arrays;
import java.util.Map;
import oq.i0;
import p071kotlin.Metadata;
import pq.n;
import yv.e;
import zv.a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 !2\u00020\u0001:\u0004\u0015\u0017\u0019\u001bB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u00060\u001dj\u0002`\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001f¨\u0006\""}, d2 = {"Lfw/g;", "", "", "markdownText", "Lzv/a;", "root", "", "Lyv/a;", "Lfw/e;", "providers", "", "includeSrcPositions", "<init>", "(Ljava/lang/String;Lzv/a;Ljava/util/Map;Z)V", "Lcw/a;", "flavour", "(Ljava/lang/String;Lzv/a;Lcw/a;Z)V", "Lfw/g$d;", "tagRenderer", "e", "(Lfw/g$d;)Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "Lzv/a;", "c", "Ljava/util/Map;", "d", "Z", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "htmlString", "f", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f67648g = "md-src-pos";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String markdownText;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a root;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<yv.a, e> providers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean includeSrcPositions;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final StringBuilder htmlString;

    /* JADX INFO: renamed from: fw.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lfw/g$a;", "", "<init>", "()V", "", "text", "Lzv/a;", "node", "", "replaceEscapesAndEntities", "", "c", "(Ljava/lang/String;Lzv/a;Z)Ljava/lang/CharSequence;", "b", "(Lzv/a;)Ljava/lang/CharSequence;", "", "indent", "e", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "SRC_ATTRIBUTE_NAME", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ CharSequence d(Companion companion, String str, a aVar, boolean z15, int i15, Object obj) {
            if ((i15 & 4) != 0) {
                z15 = true;
            }
            return companion.c(str, aVar, z15);
        }

        public final String a() {
            return g.f67648g;
        }

        public final CharSequence b(a node) {
            return a() + "=\"" + node.getStartOffset() + ".." + node.getEndOffset() + '\"';
        }

        public final CharSequence c(String text, a node, boolean replaceEscapesAndEntities) {
            return t.c(node.getType(), e.f229923d) ? "" : gw.b.f77346a.b(zv.e.b(node, text), replaceEscapesAndEntities, replaceEscapesAndEntities);
        }

        public final CharSequence e(CharSequence text, int indent) {
            if (indent == 0) {
                return text;
            }
            StringBuilder sb5 = new StringBuilder();
            int i15 = 0;
            int i16 = 0;
            while (i15 < text.length()) {
                if (i15 == 0 || text.charAt(i15 - 1) == '\n') {
                    sb5.append(text.subSequence(i16, i15));
                    int i17 = 0;
                    while (i17 < indent && i15 < text.length()) {
                        char cCharAt = text.charAt(i15);
                        if (cCharAt != ' ') {
                            if (cCharAt != '\t') {
                                break;
                            }
                            i17 += 4 - (i17 % 4);
                        } else {
                            i17++;
                        }
                        i15++;
                    }
                    if (i17 > indent) {
                        sb5.append(r.L(" ", i17 - indent));
                    }
                    i16 = i15;
                }
                i15++;
            }
            sb5.append(text.subSequence(i16, text.length()));
            return sb5;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001BC\u00122\u0010\u0007\u001a.\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00050\u0002j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00042\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u000e\"\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0014RF\u0010\u0007\u001a.\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00050\u0002j\u0002`\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lfw/g$b;", "Lfw/g$d;", "Lkotlin/Function3;", "Lzv/a;", "", "", "Lorg/intellij/markdown/html/AttributesCustomizer;", "customizer", "", "includeSrcPositions", "<init>", "(Ler/q;Z)V", "node", "tagName", "", "attributes", "autoClose", "c", "(Lzv/a;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;Z)Ljava/lang/CharSequence;", "a", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "html", "b", "Ler/q;", "getCustomizer", "()Ler/q;", "Z", "getIncludeSrcPositions", "()Z", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final q<a, CharSequence, Iterable<? extends CharSequence>, Iterable<CharSequence>> customizer;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean includeSrcPositions;

        /* JADX WARN: Multi-variable type inference failed */
        public b(q<? super a, ? super CharSequence, ? super Iterable<? extends CharSequence>, ? extends Iterable<? extends CharSequence>> qVar, boolean z15) {
            this.customizer = qVar;
            this.includeSrcPositions = z15;
        }

        @Override // fw.g.d
        public CharSequence a(CharSequence tagName) {
            return "</" + ((Object) tagName) + '>';
        }

        @Override // fw.g.d
        public CharSequence b(CharSequence html) {
            return html;
        }

        @Override // fw.g.d
        public CharSequence c(a node, CharSequence tagName, CharSequence[] attributes, boolean autoClose) {
            StringBuilder sb5 = new StringBuilder();
            StringBuilder sb6 = new StringBuilder();
            sb6.append('<');
            sb6.append((Object) tagName);
            sb5.append(sb6.toString());
            for (CharSequence charSequence : this.customizer.w(node, tagName, n.Z(attributes))) {
                if (charSequence != null) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(' ');
                    sb7.append((Object) charSequence);
                    sb5.append(sb7.toString());
                }
            }
            if (this.includeSrcPositions) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(' ');
                sb8.append((Object) g.INSTANCE.b(node));
                sb5.append(sb8.toString());
            }
            if (autoClose) {
                sb5.append(" />");
            } else {
                sb5.append(">");
            }
            return sb5.toString();
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ?\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\f0\u000e\"\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018¨\u0006\u0019"}, d2 = {"Lfw/g$c;", "Lbw/a;", "Lfw/g$d;", "tagRenderer", "<init>", "(Lfw/g;Lfw/g$d;)V", "Lzv/a;", "node", "Loq/i0;", "a", "(Lzv/a;)V", "f", "", "tagName", "", "attributes", "", "autoClose", "d", "(Lzv/a;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;Z)V", "c", "(Ljava/lang/CharSequence;)V", "html", "b", "Lfw/g$d;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public final class c extends bw.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final d tagRenderer;

        public c(d dVar) {
            this.tagRenderer = dVar;
        }

        public static /* synthetic */ void e(c cVar, a aVar, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z15, int i15, Object obj) {
            if ((i15 & 8) != 0) {
                z15 = false;
            }
            cVar.d(aVar, charSequence, charSequenceArr, z15);
        }

        @Override // bw.a, bw.b
        public void a(a node) {
            i0 i0Var;
            e eVar = (e) g.this.providers.get(node.getType());
            if (eVar != null) {
                eVar.a(this, g.this.markdownText, node);
                i0Var = i0.f148189a;
            } else {
                i0Var = null;
            }
            if (i0Var == null) {
                zv.d.b(node, this);
            }
        }

        public final void b(CharSequence html) {
            g.this.htmlString.append(this.tagRenderer.b(html));
        }

        public final void c(CharSequence tagName) {
            g.this.htmlString.append(this.tagRenderer.a(tagName));
        }

        public final void d(a node, CharSequence tagName, CharSequence[] attributes, boolean autoClose) {
            g.this.htmlString.append(this.tagRenderer.c(node, tagName, (CharSequence[]) Arrays.copyOf(attributes, attributes.length), autoClose));
        }

        public final void f(a node) {
            i0 i0Var;
            e eVar = (e) g.this.providers.get(node.getType());
            if (eVar != null) {
                eVar.a(this, g.this.markdownText, node);
                i0Var = i0.f148189a;
            } else {
                i0Var = null;
            }
            if (i0Var == null) {
                b(Companion.d(g.INSTANCE, g.this.markdownText, node, false, 4, null));
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001JA\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0006\"\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H&¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lfw/g$d;", "", "Lzv/a;", "node", "", "tagName", "", "attributes", "", "autoClose", "c", "(Lzv/a;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;Z)Ljava/lang/CharSequence;", "a", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "html", "b", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public interface d {
        CharSequence a(CharSequence tagName);

        CharSequence b(CharSequence html);

        CharSequence c(a node, CharSequence tagName, CharSequence[] attributes, boolean autoClose);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(String str, a aVar, Map<yv.a, ? extends e> map, boolean z15) {
        this.markdownText = str;
        this.root = aVar;
        this.providers = map;
        this.includeSrcPositions = z15;
        this.htmlString = new StringBuilder();
    }

    public static /* synthetic */ String f(g gVar, d dVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            dVar = new b(Function3.a(), gVar.includeSrcPositions);
        }
        return gVar.e(dVar);
    }

    public final String e(d tagRenderer) {
        new c(tagRenderer).a(this.root);
        return this.htmlString.toString();
    }

    public /* synthetic */ g(String str, a aVar, cw.a aVar2, boolean z15, int i15, k kVar) {
        this(str, aVar, aVar2, (i15 & 8) != 0 ? false : z15);
    }

    public g(String str, a aVar, cw.a aVar2, boolean z15) {
        this(str, aVar, aVar2.d(iw.c.INSTANCE.a(aVar, str), null), z15);
    }
}
