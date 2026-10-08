package w24;

import java.util.concurrent.CancellationException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lw24/d;", "Lw24/c;", "Lq10/a;", "databaseRegistry", "Lp10/e;", "databaseProvider", "Lpx/d;", "remoteLogger", "<init>", "(Lq10/a;Lp10/e;Lpx/d;)V", "Lgz/b$a$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lq10/a;", "b", "Lp10/e;", "c", "Lpx/d;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q10.a databaseRegistry;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p10.e databaseProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    public d(q10.a aVar, p10.e eVar, px.d dVar) {
        this.databaseRegistry = aVar;
        this.databaseProvider = eVar;
        this.remoteLogger = dVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    for (String str : this.databaseRegistry.d()) {
                        this.databaseProvider.a(o10.b.b(str));
                        this.remoteLogger.F8("Removed database associated with main document: " + str, px.d.a.GENERAL);
                    }
                    this.databaseRegistry.b();
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }
}
