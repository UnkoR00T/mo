package wj;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class p extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ IBinder f213732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ r f213733c;

    p(r rVar, IBinder iBinder) {
        this.f213732b = iBinder;
        this.f213733c = rVar;
    }

    @Override // wj.j
    public final void a() {
        this.f213733c.f213735a.f213749m = e.m3(this.f213732b);
        t.q(this.f213733c.f213735a);
        this.f213733c.f213735a.f213743g = false;
        Iterator it = this.f213733c.f213735a.f213740d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f213733c.f213735a.f213740d.clear();
    }
}
