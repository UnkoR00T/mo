package a24;

import iy.c0;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096B¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"La24/b;", "Lj14/a;", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "<init>", "(Lmx/c;Lhz/i;)V", "", "maxLengthOverride", "Lhz/h;", "d", "(Ljava/lang/Integer;)Lhz/h;", "Lj14/a$a;", "params", "Lhz/g;", "e", "(Lj14/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "b", "Lhz/i;", "getValidatorTextFactory", "()Lhz/i;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements j14.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hz.i validatorTextFactory;

    public b(mx.c cVar, hz.i iVar) {
        this.labelProvider = cVar;
        this.validatorTextFactory = iVar;
    }

    private final hz.h d(Integer maxLengthOverride) {
        return this.validatorTextFactory.a().M(this.labelProvider.c(s04.b.f177185a1)).y(maxLengthOverride != null ? maxLengthOverride.intValue() : GF2Field.MASK, this.labelProvider.c(s04.b.f177189b1)).A(this.labelProvider.c(s04.b.Z0));
    }

    @Override // gz.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object c(j14.a.Params params, tq.e<? super hz.g> eVar) {
        String strE = c0.e(params.getEmail());
        return (params.getIsRequired() || strE.length() != 0) ? d(params.getMaxLengthOverride()).a(strE) : hz.g.b.f86853b;
    }
}
