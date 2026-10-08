package sj;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vh.m f181987a;

    q() {
        this.f181987a = null;
    }

    protected abstract void a();

    final vh.m b() {
        return this.f181987a;
    }

    public final void c(Exception exc) {
        vh.m mVar = this.f181987a;
        if (mVar != null) {
            mVar.d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e15) {
            c(e15);
        }
    }

    public q(vh.m mVar) {
        this.f181987a = mVar;
    }
}
