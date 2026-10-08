package ym;

import eh.ba;
import eh.be;
import eh.da;
import eh.ea;
import eh.qd;
import eh.td;
import eh.ua;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class a extends wm.e<List<xm.a>> implements xm.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final xm.e f227877j = new xm.e.a().a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f227878h;

    /* JADX WARN: Illegal instructions before constructor call */
    /* synthetic */ a(i iVar, pm.d dVar, xm.e eVar, e eVar2) {
        Executor executorA = dVar.a(eVar.f());
        qd qdVarB = be.b(k.b());
        super(iVar, executorA);
        boolean zD = k.d();
        this.f227878h = zD;
        ea eaVar = new ea();
        eaVar.e(zD ? ba.TYPE_THICK : ba.TYPE_THIN);
        ua uaVar = new ua();
        uaVar.e(k.a(eVar));
        eaVar.g(uaVar.i());
        qdVarB.d(td.f(eaVar, 1), da.ON_DEVICE_FACE_CREATE);
    }

    @Override // hg.g
    public final gg.c[] b() {
        return this.f227878h ? pm.m.f160848a : new gg.c[]{pm.m.f160851d};
    }

    @Override // xm.d
    public final vh.l<List<xm.a>> x(vm.a aVar) {
        return super.h(aVar);
    }
}
