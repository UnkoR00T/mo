package lw;

import fr.t;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\b2\n\u0010\r\u001a\u00060\u000bR\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\r\u001a\u00060\u000bR\u00020\fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001b\u001a\u00020\u001a2\n\u0010\r\u001a\u00060\u000bR\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0018\u0010!\u001a\u00060\u001eR\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\"¨\u0006$"}, d2 = {"Llw/k;", "Lkw/c;", "Ljw/b;", "myConstraints", "Liw/h;", "productionHolder", "<init>", "(Ljw/b;Liw/h;)V", "", "e", "()Z", "Liw/d$a;", "Liw/d;", "pos", "d", "(Liw/d$a;)Z", "", "g", "(Liw/d$a;)I", "Lyv/a;", "k", "()Lyv/a;", "Lkw/b$a;", "j", "()Lkw/b$a;", "currentConstraints", "Lkw/b$c;", "h", "(Liw/d$a;Ljw/b;)Lkw/b$c;", "Liw/h;", "Liw/h$a;", "f", "Liw/h$a;", "contentMarker", "Lyv/a;", "nodeType", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class k extends kw.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final iw.h productionHolder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final iw.h.a contentMarker;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private yv.a nodeType;

    public k(jw.b bVar, iw.h hVar) {
        super(bVar, hVar.e());
        this.productionHolder = hVar;
        this.contentMarker = hVar.e();
        this.nodeType = yv.c.SETEXT_1;
    }

    @Override // kw.b
    public boolean d(iw.d.a pos) {
        return pos.getLocalPos() == -1;
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
        Integer numA = pos.a();
        if (numA == null) {
            kw.b.a aVar = kw.b.a.f112854b;
            return new kw.b.c(aVar, aVar, kw.b.EnumC2732b.PROPAGATE);
        }
        iw.d.a aVarM = pos.m(numA.intValue());
        if (aVarM != null && aVarM.b() == '-') {
            this.nodeType = yv.c.SETEXT_2;
        }
        int globalPos = aVarM != null ? aVarM.getGlobalPos() : pos.getGlobalPos();
        yv.a aVar2 = t.c(this.nodeType, yv.c.SETEXT_2) ? yv.e.f229941v : yv.e.f229940u;
        this.contentMarker.a(yv.e.f229942w);
        this.productionHolder.b(v.e(new nw.f.Node(new lr.i(globalPos, pos.g()), aVar2)));
        int iG = pos.g();
        kw.b.c.Companion companion = kw.b.c.INSTANCE;
        l(iG, companion.b());
        return companion.a();
    }

    @Override // kw.c
    protected kw.b.a j() {
        return kw.b.a.f112853a;
    }

    @Override // kw.c
    /* JADX INFO: renamed from: k, reason: from getter */
    public yv.a getNodeType() {
        return this.nodeType;
    }
}
