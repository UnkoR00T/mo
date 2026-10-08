package sj;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class w extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ IBinder f181995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ z f181996c;

    w(z zVar, IBinder iBinder) {
        this.f181996c = zVar;
        this.f181995b = iBinder;
    }

    @Override // sj.q
    public final void a() {
        this.f181996c.f181998a.f181970m = j.m3(this.f181995b);
        a0.q(this.f181996c.f181998a);
        this.f181996c.f181998a.f181964g = false;
        Iterator it = this.f181996c.f181998a.f181961d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f181996c.f181998a.f181961d.clear();
    }
}
