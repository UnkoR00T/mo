package ig;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0.a f92205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r0.a f92206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vh.m f92207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f92208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f92209e;

    public final Set a() {
        return this.f92205a.keySet();
    }

    public final void b(b bVar, gg.a aVar, String str) {
        r0.a aVar2 = this.f92205a;
        aVar2.put(bVar, aVar);
        r0.a aVar3 = this.f92206b;
        aVar3.put(bVar, str);
        this.f92208d--;
        if (!aVar.y()) {
            this.f92209e = true;
        }
        if (this.f92208d == 0) {
            if (!this.f92209e) {
                this.f92207c.c(aVar3);
            } else {
                this.f92207c.b(new hg.c(aVar2));
            }
        }
    }
}
