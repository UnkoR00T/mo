package lw;

import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006R\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000b2\n\u0010\u000e\u001a\u00060\u0006R\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u000e\u001a\u00060\u0006R\u00020\u0007H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u00020\u00182\n\u0010\u000e\u001a\u00060\u0006R\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u0016\u0010!\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Llw/c;", "Lkw/c;", "Ljw/b;", "myConstraints", "Liw/h;", "productionHolder", "Liw/d$a;", "Liw/d;", "startPosition", "<init>", "(Ljw/b;Liw/h;Liw/d$a;)V", "", "e", "()Z", "pos", "d", "(Liw/d$a;)Z", "", "g", "(Liw/d$a;)I", "Lkw/b$a;", "j", "()Lkw/b$a;", "currentConstraints", "Lkw/b$c;", "h", "(Liw/d$a;Ljw/b;)Lkw/b$c;", "Lyv/a;", "k", "()Lyv/a;", "Liw/h;", "f", "I", "realInterestingOffset", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class c extends kw.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final iw.h productionHolder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int realInterestingOffset;

    public c(jw.b bVar, iw.h hVar, iw.d.a aVar) {
        super(bVar, hVar.e());
        this.productionHolder = hVar;
        hVar.b(v.e(new nw.f.Node(new lr.i(aVar.getGlobalPos(), aVar.g()), yv.e.f229922c)));
        this.realInterestingOffset = -1;
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
        if (pos.getGlobalPos() >= this.realInterestingOffset && pos.getLocalPos() == -1) {
            hw.a aVar = hw.a.f86718a;
            if (!(pos.getLocalPos() == -1)) {
                throw new yv.d("");
            }
            kw.a aVar2 = kw.a.f112851a;
            iw.d.a aVarB = aVar2.b(i(), pos);
            if (aVarB == null) {
                return kw.b.c.INSTANCE.b();
            }
            jw.b bVarA = jw.c.a(i(), aVarB);
            iw.d.a aVarM = aVarB.m(jw.c.f(bVarA, aVarB.getCurrentLine()) + 1);
            if (aVarM != null) {
                Integer numA = aVarM.a();
                iw.d.a aVarM2 = aVarM.m(numA != null ? numA.intValue() : 0);
                if (aVarM2 != null) {
                    if (!aVar2.d(aVarM2, bVarA)) {
                        return kw.b.c.INSTANCE.b();
                    }
                    lr.i iVar = new lr.i(pos.getGlobalPos() + 1 + jw.c.f(jw.c.a(i(), pos), pos.getCurrentLine()), pos.g());
                    if (iVar.getLast() - iVar.getFirst() > 0) {
                        this.productionHolder.b(v.e(new nw.f.Node(iVar, yv.e.f229922c)));
                    }
                    this.realInterestingOffset = pos.g();
                    return kw.b.c.INSTANCE.a();
                }
            }
            return kw.b.c.INSTANCE.b();
        }
        return kw.b.c.INSTANCE.a();
    }

    @Override // kw.c
    protected kw.b.a j() {
        return kw.b.a.f112853a;
    }

    @Override // kw.c
    /* JADX INFO: renamed from: k */
    public yv.a getNodeType() {
        return yv.c.CODE_BLOCK;
    }
}
