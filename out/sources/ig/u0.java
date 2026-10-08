package ig;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class u0 extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ o.a f92281b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u0(o.a aVar, j.a aVar2) {
        super(aVar2);
        Objects.requireNonNull(aVar);
        this.f92281b = aVar;
    }

    @Override // ig.u
    protected final void b(hg.a.b bVar, vh.m<Boolean> mVar) {
        this.f92281b.i().accept(bVar, mVar);
    }
}
