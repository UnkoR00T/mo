package p079n1;

import er.a;
import oq.i0;
import p071kotlin.Metadata;
import y0.ContextMenuState;
import y0.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
public final class z0 implements a<i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a<i0> f130568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ContextMenuState f130569b;

    public z0(a<i0> aVar, ContextMenuState contextMenuState) {
        this.f130568a = aVar;
        this.f130569b = contextMenuState;
    }

    @Override // er.a
    public /* bridge */ /* synthetic */ i0 a() {
        c();
        return i0.f148189a;
    }

    public final void c() {
        this.f130568a.a();
        u.a(this.f130569b);
    }
}
