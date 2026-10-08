package ch1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lch1/r0;", "Lug1/d;", "Lbh1/a;", "dashboardInMemoryDataSource", "<init>", "(Lbh1/a;)V", "Lug1/d$a;", "params", "Loq/i0;", "d", "(Lug1/d$a;Ltq/e;)Ljava/lang/Object;", "a", "Lbh1/a;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r0 implements ug1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bh1.a dashboardInMemoryDataSource;

    public r0(bh1.a aVar) {
        this.dashboardInMemoryDataSource = aVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(ug1.d.Params params, tq.e<? super oq.i0> eVar) {
        this.dashboardInMemoryDataSource.b(params.getDisplay());
        return oq.i0.f148189a;
    }
}
