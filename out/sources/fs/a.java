package fs;

import mr.j;
import mr.l;

/* JADX INFO: loaded from: classes4.dex */
public final class a<Node> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j<Node, Integer> f66789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f66790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f66791c;

    public a(j<Node, Integer> jVar, d dVar) {
        this.f66789a = jVar;
        this.f66790b = dVar;
        if (dVar.a() == 1 && dVar.c() == 1) {
            this.f66791c = 1 << dVar.b();
            return;
        }
        throw new IllegalArgumentException(("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but " + dVar + " was passed").toString());
    }

    public final boolean a(Node node, l<?> lVar) {
        return this.f66790b.d(this.f66789a.get(node).intValue());
    }

    public final void b(Node node, l<?> lVar, boolean z15) {
        int iIntValue = this.f66789a.get(node).intValue();
        this.f66789a.n(node, Integer.valueOf(z15 ? iIntValue | this.f66791c : iIntValue & (~this.f66791c)));
    }
}
