package lw;

import fu.o;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0010\n\u001a\u00060\bR\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\r2\n\u0010\u0010\u001a\u00060\bR\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\u00172\n\u0010\u0010\u001a\u00060\bR\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0010\u001a\u00060\bR\u00020\tH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010 R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Llw/f;", "Lkw/c;", "Ljw/b;", "myConstraints", "Liw/h;", "productionHolder", "Lfu/o;", "endCheckingRegex", "Liw/d$a;", "Liw/d;", "startPosition", "<init>", "(Ljw/b;Liw/h;Lfu/o;Liw/d$a;)V", "", "e", "()Z", "pos", "d", "(Liw/d$a;)Z", "Lkw/b$a;", "j", "()Lkw/b$a;", "currentConstraints", "Lkw/b$c;", "h", "(Liw/d$a;Ljw/b;)Lkw/b$c;", "", "g", "(Liw/d$a;)I", "Lyv/a;", "k", "()Lyv/a;", "Liw/h;", "f", "Lfu/o;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class f extends kw.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final iw.h productionHolder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final o endCheckingRegex;

    public f(jw.b bVar, iw.h hVar, o oVar, iw.d.a aVar) {
        super(bVar, hVar.e());
        this.productionHolder = hVar;
        this.endCheckingRegex = oVar;
        hVar.b(v.e(new nw.f.Node(new lr.i(aVar.getGlobalPos(), aVar.g()), yv.e.f229924e)));
    }

    @Override // kw.b
    public boolean d(iw.d.a pos) {
        return true;
    }

    @Override // kw.b
    public boolean e() {
        return false;
    }

    @Override // kw.c
    protected int g(iw.d.a pos) {
        return pos.g();
    }

    @Override // kw.c
    protected kw.b.c h(iw.d.a pos, jw.b currentConstraints) {
        if (pos.getLocalPos() != -1) {
            return kw.b.c.INSTANCE.a();
        }
        String strK = pos.k();
        if (strK != null && jw.c.e(i().e(pos), i())) {
            if (this.endCheckingRegex == null && kw.a.f112851a.a(pos, i()) >= 2) {
                return kw.b.c.INSTANCE.b();
            }
            o oVar = this.endCheckingRegex;
            if (oVar != null && o.c(oVar, strK, 0, 2, null) != null) {
                return kw.b.c.INSTANCE.b();
            }
            if (pos.getCurrentLine().length() > 0) {
                this.productionHolder.b(v.e(new nw.f.Node(new lr.i(pos.getGlobalPos() + 1 + jw.c.f(i(), pos.getCurrentLine()), pos.g()), yv.e.f229924e)));
            }
            return kw.b.c.INSTANCE.a();
        }
        return kw.b.c.INSTANCE.b();
    }

    @Override // kw.c
    protected kw.b.a j() {
        return kw.b.a.f112853a;
    }

    @Override // kw.c
    /* JADX INFO: renamed from: k */
    public yv.a getNodeType() {
        return yv.c.HTML_BLOCK;
    }
}
