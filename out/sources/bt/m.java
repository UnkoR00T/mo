package bt;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f21449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f21450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f21451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected volatile q f21452d;

    protected void a(q qVar) {
        if (this.f21452d != null) {
            return;
        }
        synchronized (this) {
            if (this.f21452d != null) {
                return;
            }
            try {
                if (this.f21449a != null) {
                    this.f21452d = qVar.j().d(this.f21449a, this.f21450b);
                } else {
                    this.f21452d = qVar;
                }
            } catch (IOException unused) {
            }
        }
    }

    public int b() {
        return this.f21451c ? this.f21452d.e() : this.f21449a.size();
    }

    public q c(q qVar) {
        a(qVar);
        return this.f21452d;
    }

    public q d(q qVar) {
        q qVar2 = this.f21452d;
        this.f21452d = qVar;
        this.f21449a = null;
        this.f21451c = true;
        return qVar2;
    }
}
