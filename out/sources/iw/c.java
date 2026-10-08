package iw;

import er.l;
import fr.k;
import fr.t;
import fr.w;
import fu.o;
import fu.r;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \t2\u00020\u0001:\u0002\u000b\tB\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Liw/c;", "", "", "", "Liw/c$b;", "map", "<init>", "(Ljava/util/Map;)V", AnnotatedPrivateKey.LABEL, "b", "(Ljava/lang/CharSequence;)Liw/c$b;", "a", "Ljava/util/Map;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o f97211c = new o("\\s+");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<CharSequence, LinkInfo> map;

    /* JADX INFO: renamed from: iw.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\rR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Liw/c$a;", "", "<init>", "()V", "", "s", "", "", "boundQuotes", "b", "(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/lang/CharSequence;", AnnotatedPrivateKey.LABEL, "d", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "Lzv/a;", "root", "text", "Liw/c;", "a", "(Lzv/a;Ljava/lang/CharSequence;)Liw/c;", "", "processEscapes", "c", "(Ljava/lang/CharSequence;Z)Ljava/lang/CharSequence;", "e", "Lfu/o;", "SPACES_REGEX", "Lfu/o;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: iw.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"iw/c$a$a", "Lbw/a;", "Lzv/a;", "node", "Loq/i0;", "a", "(Lzv/a;)V", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class C2278a extends bw.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CharSequence f97213a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ HashMap<CharSequence, LinkInfo> f97214b;

            C2278a(CharSequence charSequence, HashMap<CharSequence, LinkInfo> map) {
                this.f97213a = charSequence;
                this.f97214b = map;
            }

            @Override // bw.a, bw.b
            public void a(zv.a node) {
                if (!t.c(node.getType(), yv.c.LINK_DEFINITION)) {
                    super.a(node);
                    return;
                }
                Companion companion = c.INSTANCE;
                for (zv.a aVar : node.getChildren()) {
                    if (t.c(aVar.getType(), yv.c.LINK_LABEL)) {
                        CharSequence charSequenceD = companion.d(zv.e.b(aVar, this.f97213a));
                        if (this.f97214b.containsKey(charSequenceD)) {
                            return;
                        }
                        this.f97214b.put(charSequenceD, LinkInfo.INSTANCE.a(node, this.f97213a));
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }

        /* JADX INFO: renamed from: iw.c$a$b */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "code", "Loq/i0;", "c", "(I)V"}, k = 3, mv = {1, 7, 0})
        static final class b extends w implements l<Integer, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ StringBuilder f97215b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(StringBuilder sb5) {
                super(1);
                this.f97215b = sb5;
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(Integer num) {
                c(num.intValue());
                return i0.f148189a;
            }

            public final void c(int i15) {
                char c15 = (char) i15;
                if (i15 == 32) {
                    this.f97215b.append("%20");
                } else if (i15 < 32 || i15 >= 128 || r.c0("\".<>\\^_`{|}", c15, false, 2, null)) {
                    this.f97215b.append(p053fw.c.d(hw.a.f86718a.c(i15)));
                } else {
                    this.f97215b.append(c15);
                }
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final CharSequence b(CharSequence s15, String... boundQuotes) {
            if (s15.length() == 0) {
                return s15;
            }
            for (String str : boundQuotes) {
                if (s15.charAt(0) == str.charAt(0) && s15.charAt(s15.length() - 1) == str.charAt(1)) {
                    return s15.subSequence(1, s15.length() - 1);
                }
            }
            return s15;
        }

        public final c a(zv.a root, CharSequence text) {
            HashMap map = new HashMap();
            zv.d.a(root, new C2278a(text, map));
            return new c(map);
        }

        public final CharSequence c(CharSequence s15, boolean processEscapes) {
            String strB = gw.b.f77346a.b(b(s15, "<>"), true, processEscapes);
            StringBuilder sb5 = new StringBuilder();
            hw.a.f86718a.d(strB, new b(sb5));
            return sb5.toString();
        }

        public final CharSequence d(CharSequence label) {
            return c.f97211c.h(label, " ").toLowerCase(Locale.ROOT);
        }

        public final CharSequence e(CharSequence s15) {
            return gw.b.f77346a.b(b(s15, "\"\"", "''", "()"), true, true);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: iw.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0013B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001c"}, d2 = {"Liw/c$b;", "", "Lzv/a;", "node", "", "destination", "title", "<init>", "(Lzv/a;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzv/a;", "getNode", "()Lzv/a;", "b", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "c", "d", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class LinkInfo {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final zv.a node;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final CharSequence destination;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final CharSequence title;

        /* JADX INFO: renamed from: iw.c$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Liw/c$b$a;", "", "<init>", "()V", "Lzv/a;", "node", "", "fileText", "Liw/c$b;", "a", "(Lzv/a;Ljava/lang/CharSequence;)Liw/c$b;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final LinkInfo a(zv.a node, CharSequence fileText) {
                CharSequence charSequenceE;
                Object next;
                CharSequence charSequenceB;
                Companion companion = c.INSTANCE;
                for (zv.a aVar : node.getChildren()) {
                    if (t.c(aVar.getType(), yv.c.LINK_DESTINATION)) {
                        CharSequence charSequenceC = companion.c(zv.e.b(aVar, fileText), true);
                        Iterator<T> it = node.getChildren().iterator();
                        do {
                            charSequenceE = null;
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!t.c(((zv.a) next).getType(), yv.c.LINK_TITLE));
                        zv.a aVar2 = (zv.a) next;
                        if (aVar2 != null && (charSequenceB = zv.e.b(aVar2, fileText)) != null) {
                            charSequenceE = c.INSTANCE.e(charSequenceB);
                        }
                        return new LinkInfo(node, charSequenceC, charSequenceE);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }

            private Companion() {
            }
        }

        public LinkInfo(zv.a aVar, CharSequence charSequence, CharSequence charSequence2) {
            this.node = aVar;
            this.destination = charSequence;
            this.title = charSequence2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CharSequence getDestination() {
            return this.destination;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final CharSequence getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LinkInfo)) {
                return false;
            }
            LinkInfo linkInfo = (LinkInfo) other;
            return t.c(this.node, linkInfo.node) && t.c(this.destination, linkInfo.destination) && t.c(this.title, linkInfo.title);
        }

        public int hashCode() {
            int iHashCode = ((this.node.hashCode() * 31) + this.destination.hashCode()) * 31;
            CharSequence charSequence = this.title;
            return iHashCode + (charSequence == null ? 0 : charSequence.hashCode());
        }

        public String toString() {
            return "LinkInfo(node=" + this.node + ", destination=" + ((Object) this.destination) + ", title=" + ((Object) this.title) + ')';
        }
    }

    public c(Map<CharSequence, LinkInfo> map) {
        this.map = map;
    }

    public final LinkInfo b(CharSequence label) {
        return this.map.get(INSTANCE.d(label));
    }
}
