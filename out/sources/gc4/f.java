package gc4;

import fr.t;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lgc4/f;", "Lac4/i;", "Lkx/d;", "intentActionManager", "Lmx/c;", "labelProvider", "<init>", "(Lkx/d;Lmx/c;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b$c;", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lkx/d;", "b", "Lmx/c;", "c", "Ldx/b$c;", "defaultError", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements ac4.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final kx.d intentActionManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business defaultError;

    public f(kx.d dVar, mx.c cVar) {
        this.intentActionManager = dVar;
        this.labelProvider = cVar;
        this.defaultError = new dx.b.Business(null, null, cVar.c(xb4.a.f217905c), cVar.c(xb4.a.f217926x), null, cVar.c(xb4.a.f217904b), null, 83, null);
    }

    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<dx.b.Business, i0>> eVar) {
        kx.f fVarA = this.intentActionManager.a(kx.a.e.f112924a);
        if (t.c(fVarA, kx.f.a.f112942a)) {
            return new dx.i.Left(this.defaultError);
        }
        if (t.c(fVarA, kx.f.b.f112943a)) {
            return new dx.i.Left(dx.b.Business.b(this.defaultError, null, null, null, this.labelProvider.c(xb4.a.f217921s), null, null, null, 119, null));
        }
        if (t.c(fVarA, kx.f.c.f112944a)) {
            return new dx.i.Right(i0.f148189a);
        }
        throw new oq.p();
    }
}
