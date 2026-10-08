package gc4;

import fr.t;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lgc4/g;", "Lac4/j;", "Lmx/c;", "labelProvider", "Lkx/d;", "intentActionManager", "<init>", "(Lmx/c;Lkx/d;)V", "Lac4/j$a;", "params", "Ldx/i;", "Ldx/b$c;", "Loq/i0;", "d", "(Lac4/j$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmx/c;", "b", "Lkx/d;", "c", "Ldx/b$c;", "defaultError", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements ac4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kx.d intentActionManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business defaultError;

    public g(mx.c cVar, kx.d dVar) {
        this.labelProvider = cVar;
        this.intentActionManager = dVar;
        this.defaultError = new dx.b.Business(null, null, cVar.c(xb4.a.f217905c), cVar.c(xb4.a.f217926x), null, cVar.c(xb4.a.f217904b), null, 83, null);
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(ac4.j.Params params, tq.e<? super dx.i<dx.b.Business, i0>> eVar) {
        kx.f fVarA = this.intentActionManager.a(new kx.a.GoToStore(true, params.getPackageName()));
        kx.f.c cVar = kx.f.c.f112944a;
        if (t.c(fVarA, cVar)) {
            return new dx.i.Right(i0.f148189a);
        }
        kx.f.b bVar = kx.f.b.f112943a;
        if (!t.c(fVarA, bVar) && !t.c(fVarA, kx.f.a.f112942a)) {
            throw new oq.p();
        }
        kx.f fVarA2 = this.intentActionManager.a(new kx.a.GoToStore(false, params.getPackageName()));
        if (t.c(fVarA2, cVar)) {
            return new dx.i.Right(i0.f148189a);
        }
        return t.c(fVarA2, bVar) ? new dx.i.Left(dx.b.Business.b(this.defaultError, null, null, null, this.labelProvider.c(xb4.a.f217923u), null, null, null, 119, null)) : new dx.i.Left(this.defaultError);
    }
}
