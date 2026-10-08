package iw;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u001eB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u000bJ)\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b \u0010\u0013J-\u0010!\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b!\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010$¨\u0006%"}, d2 = {"Liw/e;", "", "Lcw/a;", "flavour", "", "assertionsEnabled", "Liw/a;", "cancellationToken", "<init>", "(Lcw/a;ZLiw/a;)V", "(Lcw/a;)V", "(Lcw/a;Z)V", "Lyv/a;", "root", "", "text", "parseInlines", "Lzv/a;", "b", "(Lyv/a;Ljava/lang/String;Z)Lzv/a;", "", "", "textStart", "textEnd", "c", "(Lyv/a;Ljava/lang/CharSequence;II)Lzv/a;", "g", "(Lyv/a;Ljava/lang/String;)Lzv/a;", "d", "(Lyv/a;II)Lzv/a;", "a", "(Ljava/lang/String;)Lzv/a;", "e", "f", "Lcw/a;", "Z", "Liw/a;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final cw.a flavour;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean assertionsEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iw.a cancellationToken;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Liw/e$a;", "Lzv/b;", "", "text", "<init>", "(Liw/e;Ljava/lang/CharSequence;)V", "Lyv/a;", "type", "", "startOffset", "endOffset", "", "Lzv/a;", "b", "(Lyv/a;II)Ljava/util/List;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    private final class a extends zv.b {
        public a(CharSequence charSequence) {
            super(charSequence);
        }

        @Override // zv.b
        public List<zv.a> b(yv.a type, int startOffset, int endOffset) {
            return t.c(type, yv.c.PARAGRAPH) ? true : t.c(type, yv.e.f229939t) ? true : t.c(type, yv.e.f229942w) ? true : t.c(type, ew.a.CELL) ? v.e(e.this.f(type, getText(), startOffset, endOffset)) : super.b(type, startOffset, endOffset);
        }
    }

    public e(cw.a aVar, boolean z15, iw.a aVar2) {
        this.flavour = aVar;
        this.assertionsEnabled = z15;
        this.cancellationToken = aVar2;
    }

    private final zv.a b(yv.a root, String text, boolean parseInlines) {
        h hVar = new h();
        f<?> fVarA = this.flavour.b().a(hVar);
        h.a aVarE = hVar.e();
        for (d.a startPosition = new d(text).getStartPosition(); startPosition != null; startPosition = fVarA.o(startPosition)) {
            this.cancellationToken.a();
            hVar.f(startPosition.getGlobalPos());
        }
        hVar.f(text.length());
        fVarA.f();
        aVarE.a(root);
        return new i(parseInlines ? new a(text) : new zv.b(text)).a(hVar.d());
    }

    private final zv.a c(yv.a root, CharSequence text, int textStart, int textEnd) {
        hw.d dVarC = this.flavour.c();
        hw.d.m(dVarC, text, textStart, textEnd, 0, 8, null);
        nw.c cVar = new nw.c(dVarC);
        lr.i iVar = new lr.i(0, cVar.b().size());
        return new b(new zv.b(text, this.cancellationToken), cVar, this.cancellationToken).a(v.L0(this.flavour.a().b(cVar, nw.h.INSTANCE.a(cVar, iVar), this.cancellationToken), v.e(new nw.f.Node(iVar, root))));
    }

    private final zv.a d(yv.a root, int textStart, int textEnd) {
        return new zv.f(root, v.e(new zv.g(yv.e.f229921b, textStart, textEnd)));
    }

    private final zv.a g(yv.a root, String text) {
        return new zv.f(root, v.e(d(yv.c.PARAGRAPH, 0, text.length())));
    }

    public final zv.a a(String text) {
        return e(yv.c.MARKDOWN_FILE, text, true);
    }

    public final zv.a e(yv.a root, String text, boolean parseInlines) {
        try {
            return b(root, text, parseInlines);
        } catch (yv.d e15) {
            if (this.assertionsEnabled) {
                throw e15;
            }
            return g(root, text);
        }
    }

    public final zv.a f(yv.a root, CharSequence text, int textStart, int textEnd) {
        try {
            return c(root, text, textStart, textEnd);
        } catch (yv.d e15) {
            if (this.assertionsEnabled) {
                throw e15;
            }
            return d(root, textStart, textEnd);
        }
    }

    public e(cw.a aVar) {
        this(aVar, true);
    }

    public e(cw.a aVar, boolean z15) {
        this(aVar, z15, iw.a.C2277a.f97207a);
    }
}
