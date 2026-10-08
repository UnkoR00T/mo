package fp;

import bp.m;

/* JADX INFO: loaded from: classes4.dex */
public class c implements Comparable<c> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f65773e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f65774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private bp.b f65775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m f65776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f65777d = false;

    static {
        c cVar = new c(0L, null, new m(0L, 65535));
        f65773e = cVar;
        cVar.l(true);
    }

    public c(long j15, bp.b bVar, m mVar) {
        p(j15);
        o(bVar);
        n(mVar);
    }

    public static c g() {
        return f65773e;
    }

    private void n(m mVar) {
        this.f65776c = mVar;
    }

    private void o(bp.b bVar) {
        this.f65775b = bVar;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        if (cVar == null || e().g() < cVar.e().g()) {
            return -1;
        }
        return e().g() > cVar.e().g() ? 1 : 0;
    }

    public m e() {
        return this.f65776c;
    }

    public long j() {
        return this.f65774a;
    }

    public boolean k() {
        return this.f65777d;
    }

    public void l(boolean z15) {
        this.f65777d = z15;
    }

    public final void p(long j15) {
        this.f65774a = j15;
    }
}
