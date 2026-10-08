package kz;

import CON.p;
import oq.t;
import p071kotlin.Metadata;
import tq.e;
import tq.k;
import vh.f;
import vh.l;
import vj.c;
import vj.d;
import vq.g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lkz/a;", "Lix/a;", "Lkz/b;", "<init>", "()V", "LCON/p;", "activity", "Loq/i0;", "e", "(LCON/p;)V", "", "a", "(Ltq/e;)Ljava/lang/Object;", "LCON/p;", "inappreview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements ix.a, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private p activity;

    /* JADX INFO: renamed from: kz.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C2754a<TResult> implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e<Boolean> f113470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f113471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f113472c;

        /* JADX WARN: Multi-variable type inference failed */
        C2754a(e<? super Boolean> eVar, c cVar, p pVar) {
            this.f113470a = eVar;
            this.f113471b = cVar;
            this.f113472c = pVar;
        }

        @Override // vh.f
        public final void a(l<vj.b> lVar) {
            if (lVar.q()) {
                e<Boolean> eVar = this.f113470a;
                t.Companion companion = t.INSTANCE;
                eVar.i(t.b(Boolean.TRUE));
                this.f113471b.b(this.f113472c, lVar.m());
            }
        }
    }

    @Override // ix.a
    public Object a(e<? super Boolean> eVar) throws Throwable {
        p pVar = this.activity;
        if (pVar == null) {
            return vq.b.a(false);
        }
        c cVarA = d.a(pVar.getApplicationContext());
        l<vj.b> lVarA = cVarA.a();
        k kVar = new k(uq.b.c(eVar));
        lVarA.c(new C2754a(kVar, cVarA, pVar));
        Object objA = kVar.a();
        if (objA == uq.b.e()) {
            g.c(eVar);
        }
        return objA;
    }

    @Override // oz.c
    public void e(p activity) {
        this.activity = activity;
    }
}
