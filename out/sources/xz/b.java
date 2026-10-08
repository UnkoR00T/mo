package xz;

import android.content.Context;
import er.l;
import ju.n;
import mg.g;
import mg.h;
import oq.i0;
import oq.k;
import oq.p;
import oq.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u000f\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u00020\u0010*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lxz/b;", "Ltx/b;", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "Ltx/a;", "module", "Ltx/b$a;", "a", "(Ltx/a;Ltq/e;)Ljava/lang/Object;", "Lmg/d;", "Loq/k;", "g", "()Lmg/d;", "client", "Lxm/d;", "f", "(Ltx/a;)Lxm/d;", "api", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements tx.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f222412a;

        static {
            int[] iArr = new int[tx.a.values().length];
            try {
                iArr[tx.a.FACE_DETECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f222412a = iArr;
        }
    }

    /* JADX INFO: renamed from: xz.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5948b implements l<g, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n<tx.b.a> f222413a;

        /* JADX WARN: Multi-variable type inference failed */
        C5948b(n<? super tx.b.a> nVar) {
            this.f222413a = nVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(g gVar) {
            c(gVar);
            return i0.f148189a;
        }

        public final void c(g gVar) {
            if (gVar.h()) {
                n<tx.b.a> nVar = this.f222413a;
                t.Companion companion = t.INSTANCE;
                nVar.i(t.b(tx.b.a.C5034b.f192526a));
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements vh.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n<tx.b.a> f222414a;

        /* JADX WARN: Multi-variable type inference failed */
        c(n<? super tx.b.a> nVar) {
            this.f222414a = nVar;
        }

        @Override // vh.g
        public final void c(Exception exc) {
            n<tx.b.a> nVar = this.f222414a;
            t.Companion companion = t.INSTANCE;
            nVar.i(t.b(tx.b.a.C5033a.f192525a));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements l<Throwable, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ xm.d f222416b;

        d(xm.d dVar) {
            this.f222416b = dVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Throwable th4) {
            c(th4);
            return i0.f148189a;
        }

        public final void c(Throwable th4) {
            b.this.g().f(this.f222416b);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"xz/b$e", "Lmg/a;", "Lmg/h;", "status", "Loq/i0;", "a", "(Lmg/h;)V", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements mg.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n<tx.b.a> f222418b;

        /* JADX WARN: Multi-variable type inference failed */
        e(n<? super tx.b.a> nVar) {
            this.f222418b = nVar;
        }

        @Override // mg.a
        public void a(h status) {
            int iM = status.m();
            if (iM != 3) {
                if (iM == 4) {
                    b.this.g().e(this);
                    n<tx.b.a> nVar = this.f222418b;
                    t.Companion companion = t.INSTANCE;
                    nVar.i(t.b(tx.b.a.C5034b.f192526a));
                    return;
                }
                if (iM != 5) {
                    return;
                }
            }
            b.this.g().e(this);
            n<tx.b.a> nVar2 = this.f222418b;
            t.Companion companion2 = t.INSTANCE;
            nVar2.i(t.b(tx.b.a.C5033a.f192525a));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f implements vh.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f222419a;

        f(l lVar) {
            this.f222419a = lVar;
        }

        @Override // vh.h
        public final /* synthetic */ void a(Object obj) {
            this.f222419a.b(obj);
        }
    }

    public b(final Context context) {
        this.client = oq.l.a(new er.a() { // from class: xz.a
            @Override // er.a
            public final Object a() {
                return b.e(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mg.d e(Context context) {
        return mg.c.a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xm.d f(tx.a aVar) {
        if (a.f222412a[aVar.ordinal()] == 1) {
            return xm.c.a();
        }
        throw new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mg.d g() {
        return (mg.d) this.client.getValue();
    }

    @Override // tx.b
    public Object a(tx.a aVar, tq.e<? super tx.b.a> eVar) {
        ju.p pVar = new ju.p(uq.b.c(eVar), 1);
        pVar.D();
        xm.d dVarF = f(aVar);
        g().d(mg.f.d().c(new e(pVar)).a(dVarF).b()).g(new f(new C5948b(pVar))).e(new c(pVar));
        pVar.E(new d(dVarF));
        Object objX = pVar.x();
        if (objX == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objX;
    }
}
