package vh;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f206846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ w f206847b;

    v(w wVar, l lVar) {
        this.f206846a = lVar;
        Objects.requireNonNull(wVar);
        this.f206847b = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l lVar = this.f206846a;
        if (lVar.o()) {
            this.f206847b.b().x();
            return;
        }
        try {
            this.f206847b.b().t(this.f206847b.a().a(lVar));
        } catch (j e15) {
            if (!(e15.getCause() instanceof Exception)) {
                this.f206847b.b().v(e15);
                return;
            }
            w wVar = this.f206847b;
            wVar.b().v((Exception) e15.getCause());
        } catch (Exception e16) {
            this.f206847b.b().v(e16);
        }
    }
}
