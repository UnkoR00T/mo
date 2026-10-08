package p053fw;

import fu.o;
import fu.q;
import fu.r;
import java.net.URI;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\n¨\u0006\r"}, d2 = {"", "s", "b", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "Lfw/l;", "", "useSafeLinks", "a", "(Lfw/l;Z)Lfw/l;", "Lfu/o;", "Lfu/o;", "UNSAFE_LINK_REGEX", "ALLOWED_DATA_LINK_REGEX", "markdown"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o f67678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o f67679b;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\f\u001a\u00020\u000b2\n\u0010\u0004\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"fw/t$a", "Lfw/l;", "Lfw/g$c;", "Lfw/g;", "visitor", "", "text", "Lzv/a;", "node", "Lfw/l$b;", "info", "Loq/i0;", "f", "(Lfw/g$c;Ljava/lang/String;Lzv/a;Lfw/l$b;)V", "c", "(Ljava/lang/String;Lzv/a;)Lfw/l$b;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class a extends l {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ l f67680f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l lVar, URI uri, boolean z15) {
            super(uri, z15);
            this.f67680f = lVar;
        }

        @Override // p053fw.l
        public l.RenderInfo c(String text, zv.a node) {
            l.RenderInfo renderInfoC = this.f67680f.c(text, node);
            if (renderInfoC != null) {
                return l.RenderInfo.b(renderInfoC, null, t.b(renderInfoC.getDestination()), null, 5, null);
            }
            return null;
        }

        @Override // p053fw.l
        public void f(g.c visitor, String text, zv.a node, l.RenderInfo info) {
            this.f67680f.f(visitor, text, node, info);
        }
    }

    static {
        q qVar = q.IGNORE_CASE;
        f67678a = new o("^(vbscript|javascript|file|data):", qVar);
        f67679b = new o("^data:image/(gif|png|jpeg|webp);", qVar);
    }

    public static final l a(l lVar, boolean z15) {
        return !z15 ? lVar : new a(lVar, lVar.getBaseURI(), lVar.getResolveAnchors());
    }

    public static final CharSequence b(CharSequence charSequence) {
        if (!(f67678a.a(r.u1(charSequence)) ? f67679b.a(r.u1(charSequence)) : true)) {
            charSequence = null;
        }
        return charSequence == null ? "#" : charSequence;
    }
}
