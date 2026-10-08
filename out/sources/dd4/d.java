package dd4;

import jb4.ErrorActionData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import pl.gov.mc.fringers.mobywatel.f0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ldd4/d;", "Lgb4/a;", "Lmx/c;", "labelProvider", "Lgx/d;", "globalEventManager", "<init>", "(Lmx/c;Lgx/d;)V", "Lgb4/a$a;", "params", "Ljb4/b$b;", "h", "(Lgb4/a$a;)Ljb4/b$b;", "a", "Lmx/c;", "b", "Lgx/d;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements gb4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gx.d globalEventManager;

    public d(mx.c cVar, gx.d dVar) {
        this.labelProvider = cVar;
        this.globalEventManager = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(d dVar) {
        dVar.globalEventManager.c(gx.a.c.f78192a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(d dVar) {
        dVar.globalEventManager.c(gx.a.b.f78191a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(d dVar) {
        dVar.globalEventManager.c(gx.a.b.f78191a);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public jb4.b.Failure b(gb4.a.Params params) {
        dx.b.AppUpdateRequired error = params.getError();
        Label title = error.getTitle();
        if (title == null) {
            title = this.labelProvider.c(f0.f160718k);
        }
        Label message = error.getMessage();
        if (message == null) {
            message = this.labelProvider.c(f0.R);
        }
        return new jb4.b.Failure(title, message, null, new ErrorActionData(this.labelProvider.c(f0.Q), new er.a() { // from class: dd4.a
            @Override // er.a
            public final Object a() {
                return d.i(this.f41063a);
            }
        }), new ErrorActionData(this.labelProvider.c(f0.f160716j), new er.a() { // from class: dd4.b
            @Override // er.a
            public final Object a() {
                return d.l(this.f41064a);
            }
        }), null, new ErrorActionData(this.labelProvider.c(f0.f160716j), new er.a() { // from class: dd4.c
            @Override // er.a
            public final Object a() {
                return d.m(this.f41065a);
            }
        }), 36, null);
    }
}
