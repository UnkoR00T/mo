package d1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u000b\u0010\u0007R\"\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ld1/k0;", "Ld1/r1;", "Lkotlin/Function1;", "Ld1/c4;", "Loq/i0;", "block", "<init>", "(Ler/l;)V", "ancestorConsumedInsets", "p3", "(Ld1/c4;)Ld1/c4;", "x3", "t", "Ler/l;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class k0 extends r1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private er.l<? super c4, oq.i0> block;

    public k0(er.l<? super c4, oq.i0> lVar) {
        this.block = lVar;
    }

    @Override // d1.r1
    public c4 p3(c4 ancestorConsumedInsets) {
        this.block.b(ancestorConsumedInsets);
        return ancestorConsumedInsets;
    }

    public final void x3(er.l<? super c4, oq.i0> block) {
        if (block != this.block) {
            this.block = block;
        }
    }
}
