package t14;

import a14.b0;
import fr.t;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096B¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lt14/k;", "La14/b0;", "Lkx/d;", "intentActionManager", "Lmx/c;", "labelProvider", "<init>", "(Lkx/d;Lmx/c;)V", "Lmx/a;", "appNotFoundErrorMessage", "Ldx/b$c;", "d", "(Lmx/a;)Ldx/b$c;", "La14/b0$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "e", "(La14/b0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lkx/d;", "b", "Lmx/c;", "c", "Ldx/b$c;", "generalError", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final kx.d intentActionManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business generalError;

    public k(kx.d dVar, mx.c cVar) {
        this.intentActionManager = dVar;
        this.labelProvider = cVar;
        this.generalError = new dx.b.Business(null, null, cVar.c(s04.b.f177239r0), null, null, cVar.c(s04.b.f177233p0), null, 91, null);
    }

    private final dx.b.Business d(Label appNotFoundErrorMessage) {
        Label labelC = this.labelProvider.c(s04.b.f177239r0);
        if (appNotFoundErrorMessage == null) {
            appNotFoundErrorMessage = this.labelProvider.c(s04.b.C0);
        }
        return new dx.b.Business(null, null, labelC, appNotFoundErrorMessage, null, this.labelProvider.c(s04.b.f177233p0), null, 83, null);
    }

    @Override // gz.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object c(b0.Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        kx.f fVarA = this.intentActionManager.a(new kx.a.SendEmail(params.getEmailAddress(), params.getEmailSubject(), params.getMailContent(), null));
        if (t.c(fVarA, kx.f.c.f112944a)) {
            return new dx.i.Right(i0.f148189a);
        }
        if (t.c(fVarA, kx.f.a.f112942a)) {
            return new dx.i.Left(this.generalError);
        }
        if (t.c(fVarA, kx.f.b.f112943a)) {
            return new dx.i.Left(d(params.getAppNotFoundErrorMessage()));
        }
        throw new p();
    }
}
