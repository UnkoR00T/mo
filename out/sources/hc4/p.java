package hc4;

import bc4.q;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0012"}, d2 = {"Lhc4/p;", "Lbc4/q;", "Lbc4/b;", "checkFileSizeUseCase", "Lbc4/a;", "checkAllFilesSizeUC", "<init>", "(Lbc4/b;Lbc4/a;)V", "Lbc4/q$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "b", "(Lbc4/q$a;)Ldx/i;", "a", "Lbc4/b;", "Lbc4/a;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bc4.b checkFileSizeUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final bc4.a checkAllFilesSizeUC;

    public p(bc4.b bVar, bc4.a aVar) {
        this.checkFileSizeUseCase = bVar;
        this.checkAllFilesSizeUC = aVar;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public dx.i<dx.b, i0> a(q.Params params) {
        dx.i<dx.b, i0> iVar = (dx.i) this.checkFileSizeUseCase.a(new bc4.b.Params(params.getCurrentFileSizeLimit().getCurrentSizeInBytes(), params.getCurrentFileSizeLimit().getMaxAllowedSizeInBytes()));
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return (dx.i) this.checkAllFilesSizeUC.a(new bc4.a.Params(params.getUploadedFilesSizeLimit(), params.getCurrentFileSizeLimit().getCurrentSizeInBytes()));
    }
}
