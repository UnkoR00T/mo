package f44;

import fv.v;
import gz.b;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lf44/a;", "Lpl/gov/coi/common/network/k;", "Lc44/a;", "getBaseUrlUseCase", "<init>", "(Lc44/a;)V", "Lfv/v;", "a", "()Lfv/v;", "Lc44/a;", "dynamicbaseurl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c44.a getBaseUrlUseCase;

    public a(c44.a aVar) {
        this.getBaseUrlUseCase = aVar;
    }

    @Override // pl.gov.coi.common.network.k
    public v a() {
        return v.INSTANCE.d(this.getBaseUrlUseCase.a(b.a.C1792a.f78542a));
    }
}
