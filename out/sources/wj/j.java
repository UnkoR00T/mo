package wj;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vh.m f213724a;

    j() {
        this.f213724a = null;
    }

    protected abstract void a();

    final vh.m b() {
        return this.f213724a;
    }

    public final void c(Exception exc) {
        vh.m mVar = this.f213724a;
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

    public j(vh.m mVar) {
        this.f213724a = mVar;
    }
}
