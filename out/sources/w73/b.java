package w73;

import ib4.c;
import jb4.ErrorActionData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lw73/b;", "Lib4/c;", "Lmx/c;", "labelProvider", "genericDomainErrorMapper", "<init>", "(Lmx/c;Lib4/c;)V", "Lib4/c$a;", "params", "Ljb4/b;", "e", "(Lib4/c$a;)Ljb4/b;", "a", "Lmx/c;", "b", "Lib4/c;", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c genericDomainErrorMapper;

    public b(mx.c cVar, c cVar2) {
        this.labelProvider = cVar;
        this.genericDomainErrorMapper = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(c.Params params) {
        params.c().b(c.b.AbstractC2161b.a.f90859a);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public jb4.b b(final c.Params params) {
        return params.getDomainError() instanceof dx.b.Business ? this.genericDomainErrorMapper.b(params) : new jb4.b.Failure(this.labelProvider.c(n73.a.f133451c0), this.labelProvider.c(n73.a.f133449b0), null, new ErrorActionData(this.labelProvider.c(n73.a.f133448b), new er.a() { // from class: w73.a
            @Override // er.a
            public final Object a() {
                return b.f(params);
            }
        }), null, null, null, 116, null);
    }
}
