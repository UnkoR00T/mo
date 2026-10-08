package a54;

import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"La54/d;", "Ls44/d;", "Lx44/b;", "googlePayManager", "<init>", "(Lx44/b;)V", "Ls44/d$a;", "params", "Loq/i0;", "d", "(Ls44/d$a;Ltq/e;)Ljava/lang/Object;", "a", "Lx44/b;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements s44.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x44.b googlePayManager;

    public d(x44.b bVar) {
        this.googlePayManager = bVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(s44.d.Params params, e<? super i0> eVar) {
        this.googlePayManager.b(params.getGateway(), params.getGatewayMerchantId(), params.getTotalAmount(), params.getMerchantName());
        return i0.f148189a;
    }
}
