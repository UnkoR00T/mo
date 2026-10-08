package ig;

import io.sentry.android.core.c2;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class h0 implements jg.c.InterfaceC2422c, y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hg.a.f f92199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f92200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private jg.l f92201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set f92202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f92203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ e f92204f;

    public h0(e eVar, hg.a.f fVar, b bVar) {
        Objects.requireNonNull(eVar);
        this.f92204f = eVar;
        this.f92201c = null;
        this.f92202d = null;
        this.f92203e = false;
        this.f92199a = fVar;
        this.f92200b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void e() {
        jg.l lVar;
        if (!this.f92203e || (lVar = this.f92201c) == null) {
            return;
        }
        this.f92199a.j(lVar, this.f92202d);
    }

    @Override // ig.y0
    public final void a(jg.l lVar, Set set) {
        if (lVar == null || set == null) {
            c2.k("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            b(new gg.a(4));
        } else {
            this.f92201c = lVar;
            this.f92202d = set;
            e();
        }
    }

    @Override // ig.y0
    public final void b(gg.a aVar) {
        e0 e0Var = (e0) this.f92204f.c().get(this.f92200b);
        if (e0Var != null) {
            e0Var.p(aVar);
        }
    }

    @Override // ig.y0
    public final void c(int i15) {
        e0 e0Var = (e0) this.f92204f.c().get(this.f92200b);
        if (e0Var != null) {
            if (e0Var.b()) {
                e0Var.p(new gg.a(17));
            } else {
                e0Var.onConnectionSuspended(i15);
            }
        }
    }

    @Override // jg.c.InterfaceC2422c
    public final void d(gg.a aVar) {
        this.f92204f.f().post(new g0(this, aVar));
    }

    final /* synthetic */ hg.a.f f() {
        return this.f92199a;
    }

    final /* synthetic */ b g() {
        return this.f92200b;
    }

    final /* synthetic */ void h(boolean z15) {
        this.f92203e = true;
    }
}
