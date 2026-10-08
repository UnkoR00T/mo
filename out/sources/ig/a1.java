package ig;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class a1 extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ s.a f92138d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a1(s.a aVar, gg.c[] cVarArr, boolean z15, int i15) {
        super(cVarArr, z15, i15);
        Objects.requireNonNull(aVar);
        this.f92138d = aVar;
    }

    @Override // ig.s
    protected final void b(hg.a.b bVar, vh.m mVar) {
        this.f92138d.f().accept(bVar, mVar);
    }
}
