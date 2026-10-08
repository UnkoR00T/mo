package um;

import ch.cl;
import ch.mf;
import ch.nk;
import ch.of;
import ch.qk;
import ch.we;
import ch.ye;
import ch.ze;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends wm.e implements rm.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final rm.b f199023n = new rm.b.a().a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f199024h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final rm.b f199025j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final cl f199026k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f199027l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f199028m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(rm.b bVar, k kVar, Executor executor, nk nkVar, pm.i iVar) {
        super(kVar, executor);
        bVar.b();
        this.f199025j = bVar;
        boolean zF = b.f();
        this.f199024h = zF;
        mf mfVar = new mf();
        mfVar.i(b.c(bVar));
        of ofVarJ = mfVar.j();
        ze zeVar = new ze();
        zeVar.e(zF ? we.TYPE_THICK : we.TYPE_THIN);
        zeVar.g(ofVarJ);
        nkVar.d(qk.b(zeVar, 1), ye.ON_DEVICE_BARCODE_CREATE);
        this.f199026k = null;
    }

    private final vh.l y(vh.l lVar, final int i15, final int i16) {
        return lVar.s(new vh.k() { // from class: um.e
            @Override // vh.k
            public final vh.l a(Object obj) {
                return this.f199017a.u(i15, i16, (List) obj);
            }
        });
    }

    @Override // hg.g
    public final gg.c[] b() {
        return this.f199024h ? pm.m.f160848a : new gg.c[]{pm.m.f160849b};
    }

    @Override // wm.e, java.io.Closeable, java.lang.AutoCloseable, rm.a
    public final synchronized void close() {
        super.close();
    }

    final /* synthetic */ vh.l u(int i15, int i16, List list) {
        return vh.o.f(list);
    }

    @Override // rm.a
    public final vh.l<List<sm.a>> x(vm.a aVar) {
        return y(super.h(aVar), aVar.m(), aVar.i());
    }
}
