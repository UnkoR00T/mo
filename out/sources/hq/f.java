package hq;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements cq.a, cq.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<kq.b.a> f86286a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f86287b = false;

    private void c() {
        if (this.f86287b) {
            throw new IllegalStateException("There was a race between the call to add/remove an OnClearedListener and onCleared(). This can happen when posting to the Main thread from a background thread, which is not supported.");
        }
    }

    @Override // kq.b
    public void a(kq.b.a aVar) {
        fq.b.a();
        c();
        this.f86286a.add(aVar);
    }

    public void b() {
        fq.b.a();
        this.f86287b = true;
        Iterator<kq.b.a> it = this.f86286a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }
}
