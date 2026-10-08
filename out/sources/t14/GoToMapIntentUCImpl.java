package t14;

import a14.o;
import fr.t;
import kx.ByAddress;
import kx.ByCoordinates;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: t14.e, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lt14/e;", "La14/o;", "Lmx/c;", "labelProvider", "Lkx/d;", "intentActionManager", "<init>", "(Lmx/c;Lkx/d;)V", "La14/o$a;", "params", "Ldx/i;", "Ldx/b$c;", "Loq/i0;", "d", "(La14/o$a;Ltq/e;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/c;", "b", "Lkx/d;", "c", "Ldx/b$c;", "defaultError", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GoToMapIntentUCImpl implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final kx.d intentActionManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business defaultError;

    public GoToMapIntentUCImpl(mx.c cVar, kx.d dVar) {
        this.labelProvider = cVar;
        this.intentActionManager = dVar;
        this.defaultError = new dx.b.Business(null, null, cVar.c(s04.b.f177239r0), cVar.c(s04.b.V0), null, cVar.c(s04.b.f177233p0), null, 83, null);
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(o.a aVar, tq.e<? super dx.i<dx.b.Business, i0>> eVar) {
        kx.a byCoordinates;
        kx.d dVar = this.intentActionManager;
        if (aVar instanceof o.a.ByAddress) {
            byCoordinates = new ByAddress(((o.a.ByAddress) aVar).getAddress());
        } else {
            if (!(aVar instanceof o.a.ByCoordinates)) {
                throw new p();
            }
            o.a.ByCoordinates byCoordinates2 = (o.a.ByCoordinates) aVar;
            byCoordinates = new ByCoordinates(byCoordinates2.getCoordinates(), byCoordinates2.getPlaceLabel());
        }
        kx.f fVarA = dVar.a(byCoordinates);
        if (t.c(fVarA, kx.f.c.f112944a)) {
            return new dx.i.Right(i0.f148189a);
        }
        if (t.c(fVarA, kx.f.a.f112942a)) {
            return new dx.i.Left(this.defaultError);
        }
        if (t.c(fVarA, kx.f.b.f112943a)) {
            return new dx.i.Left(dx.b.Business.b(this.defaultError, null, null, null, this.labelProvider.c(s04.b.D0), null, null, null, 119, null));
        }
        throw new p();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoToMapIntentUCImpl)) {
            return false;
        }
        GoToMapIntentUCImpl goToMapIntentUCImpl = (GoToMapIntentUCImpl) other;
        return t.c(this.labelProvider, goToMapIntentUCImpl.labelProvider) && t.c(this.intentActionManager, goToMapIntentUCImpl.intentActionManager);
    }

    public int hashCode() {
        return (this.labelProvider.hashCode() * 31) + this.intentActionManager.hashCode();
    }

    public String toString() {
        return "GoToMapIntentUCImpl(labelProvider=" + this.labelProvider + ", intentActionManager=" + this.intentActionManager + ')';
    }
}
