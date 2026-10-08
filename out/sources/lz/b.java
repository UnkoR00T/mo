package lz;

import android.content.Context;
import dx.i;
import oq.i0;
import oq.k;
import oq.l;
import oq.t;
import p071kotlin.Metadata;
import vh.h;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Llz/b;", "Ljx/b;", "Landroid/content/Context;", "context", "Lpx/d;", "remoteLogger", "<init>", "(Landroid/content/Context;Lpx/d;)V", "Ldx/i;", "Ldx/b;", "Ljx/b$a;", "a", "(Ltq/e;)Ljava/lang/Object;", "Landroid/content/Context;", "b", "Lpx/d;", "Lrj/b;", "c", "Loq/k;", "e", "()Lrj/b;", "appUpdateManager", "info_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements jx.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k appUpdateManager = l.a(new er.a() { // from class: lz.a
        @Override // er.a
        public final Object a() {
            return b.d(this.f121592a);
        }
    });

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.l<rj.a, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ tq.e<i<? extends dx.b, ? extends jx.b.a>> f121597b;

        /* JADX WARN: Multi-variable type inference failed */
        a(tq.e<? super i<? extends dx.b, ? extends jx.b.a>> eVar) {
            this.f121597b = eVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(rj.a aVar) {
            c(aVar);
            return i0.f148189a;
        }

        public final void c(rj.a aVar) {
            i.Right right;
            int iB = aVar.b();
            if (iB == 1) {
                right = new i.Right(jx.b.a.C2532b.f106454b);
            } else if (iB == 2 || iB == 3) {
                right = new i.Right(jx.b.a.C2531a.f106453b);
            } else {
                px.b.E7(b.this.remoteLogger, "Unexpected status: " + aVar.b() + " \nAvailable version code: " + aVar.a(), null, 2, null);
                right = new i.Right(jx.b.a.c.f106455b);
            }
            this.f121597b.i(t.b(right));
        }
    }

    /* JADX INFO: renamed from: lz.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C2979b implements vh.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ tq.e<i<? extends dx.b, ? extends jx.b.a>> f121599b;

        /* JADX WARN: Multi-variable type inference failed */
        C2979b(tq.e<? super i<? extends dx.b, ? extends jx.b.a>> eVar) {
            this.f121599b = eVar;
        }

        @Override // vh.g
        public final void c(Exception exc) {
            px.b.y5(b.this.remoteLogger, "Update check failed", exc, null, 4, null);
            tq.e<i<? extends dx.b, ? extends jx.b.a>> eVar = this.f121599b;
            t.Companion companion = t.INSTANCE;
            eVar.i(t.b(new i.Left(new dx.b.Generic(exc))));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ er.l f121600a;

        c(er.l lVar) {
            this.f121600a = lVar;
        }

        @Override // vh.h
        public final /* synthetic */ void a(Object obj) {
            this.f121600a.b(obj);
        }
    }

    public b(Context context, px.d dVar) {
        this.context = context;
        this.remoteLogger = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rj.b d(b bVar) {
        return rj.c.a(bVar.context);
    }

    private final rj.b e() {
        return (rj.b) this.appUpdateManager.getValue();
    }

    @Override // jx.b
    public Object a(tq.e<? super i<? extends dx.b, ? extends jx.b.a>> eVar) throws Throwable {
        tq.k kVar = new tq.k(uq.b.c(eVar));
        e().a().g(new c(new a(kVar))).e(new C2979b(kVar));
        Object objA = kVar.a();
        if (objA == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objA;
    }
}
