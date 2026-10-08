package t14;

import fr.t;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lt14/c;", "La14/m;", "", "packageName", "Lkx/d;", "intentActionManager", "Lmx/c;", "labelProvider", "<init>", "(Ljava/lang/String;Lkx/d;Lmx/c;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b$c;", "Loq/i0;", "b", "(Lgz/b$a$a;)Ldx/i;", "a", "Ljava/lang/String;", "Lkx/d;", "c", "Lmx/c;", "d", "Ldx/b$c;", "defaultError", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements a14.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String packageName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kx.d intentActionManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business defaultError;

    public c(String str, kx.d dVar, mx.c cVar) {
        this.packageName = str;
        this.intentActionManager = dVar;
        this.labelProvider = cVar;
        this.defaultError = new dx.b.Business(null, null, cVar.c(s04.b.f177239r0), cVar.c(s04.b.V0), null, cVar.c(s04.b.f177233p0), null, 83, null);
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public dx.i<dx.b.Business, i0> a(gz.b.a.C1792a params) {
        kx.f fVarA = this.intentActionManager.a(new kx.a.GoToApplicationDetailsSettings(this.packageName));
        if (t.c(fVarA, kx.f.a.f112942a)) {
            return new dx.i.Left(this.defaultError);
        }
        if (t.c(fVarA, kx.f.b.f112943a)) {
            return new dx.i.Left(dx.b.Business.b(this.defaultError, null, null, null, this.labelProvider.c(s04.b.f177221l0), null, null, null, 119, null));
        }
        if (t.c(fVarA, kx.f.c.f112944a)) {
            return new dx.i.Right(i0.f148189a);
        }
        throw new p();
    }
}
