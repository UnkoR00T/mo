package ig;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class t0 extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ o.a f92279e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t0(o.a aVar, j jVar, gg.c[] cVarArr, boolean z15, int i15) {
        super(jVar, cVarArr, z15, i15);
        Objects.requireNonNull(aVar);
        this.f92279e = aVar;
    }

    @Override // ig.n
    protected final void d(hg.a.b bVar, vh.m<Void> mVar) {
        this.f92279e.h().accept(bVar, mVar);
    }
}
