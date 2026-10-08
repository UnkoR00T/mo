package t14;

import a14.c0;
import fr.t;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0017"}, d2 = {"Lt14/l;", "La14/c0;", "Lmx/c;", "labelProvider", "Lkx/d;", "intentActionManager", "<init>", "(Lmx/c;Lkx/d;)V", "La14/c0$a;", "params", "Ldx/i;", "Ldx/b$c;", "Loq/i0;", "d", "(La14/c0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmx/c;", "b", "Lkx/d;", "c", "Ldx/b$c;", "defaultError", "serviceNotFoundError", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kx.d intentActionManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business defaultError;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business serviceNotFoundError;

    public l(mx.c cVar, kx.d dVar) {
        this.labelProvider = cVar;
        this.intentActionManager = dVar;
        this.defaultError = new dx.b.Business(null, null, cVar.c(s04.b.f177239r0), cVar.c(s04.b.V0), null, cVar.c(s04.b.f177233p0), null, 83, null);
        this.serviceNotFoundError = new dx.b.Business(null, null, cVar.c(s04.b.f177239r0), cVar.c(s04.b.H0), null, cVar.c(s04.b.f177233p0), null, 83, null);
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(c0.Params params, tq.e<? super dx.i<dx.b.Business, i0>> eVar) {
        kx.f fVarA = this.intentActionManager.a(new kx.a.SharePdf(params.getUri()));
        if (t.c(fVarA, kx.f.a.f112942a)) {
            return new dx.i.Left(this.defaultError);
        }
        if (t.c(fVarA, kx.f.b.f112943a)) {
            return new dx.i.Left(this.serviceNotFoundError);
        }
        if (t.c(fVarA, kx.f.c.f112944a)) {
            return new dx.i.Right(i0.f148189a);
        }
        throw new p();
    }
}
