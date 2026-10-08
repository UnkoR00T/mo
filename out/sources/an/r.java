package an;

import fh.ak;
import fh.he;
import fh.je;
import fh.ke;
import fh.ph;
import fh.th;
import fh.xj;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends wm.e implements zm.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final zm.d f7927h;

    r(d dVar, Executor executor, xj xjVar, zm.d dVar2) {
        super(dVar, executor);
        this.f7927h = dVar2;
        ke keVar = new ke();
        keVar.e(dVar2.c() ? he.TYPE_THICK : he.TYPE_THIN);
        ph phVar = new ph();
        th thVar = new th();
        thVar.a(a.a(dVar2.h()));
        phVar.e(thVar.c());
        keVar.h(phVar.f());
        xjVar.d(ak.f(keVar, 1), je.ON_DEVICE_TEXT_CREATE);
    }

    @Override // hg.g
    public final gg.c[] b() {
        return b.a(this.f7927h);
    }

    @Override // zm.c
    public final vh.l<zm.a> x(vm.a aVar) {
        return super.h(aVar);
    }
}
