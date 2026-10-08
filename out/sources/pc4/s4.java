package pc4;

import f00.SharedDestinationSpec;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014JO\u0010 \u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0012H\u0007¢\u0006\u0004\b \u0010!J'\u0010$\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lpc4/s4;", "", "<init>", "()V", "Lay/j;", "jsonSerializer", "Ldx/a;", "deactivateDomainErrorFactory", "Lpl/gov/coi/common/network/l;", "c", "(Lay/j;Ldx/a;)Lpl/gov/coi/common/network/l;", "Lmx/c;", "labelProvider", "Lgb4/w0;", "g", "(Lmx/c;)Lgb4/w0;", "Lgx/d;", "globalEventManager", "Lgb4/a;", "a", "(Lmx/c;Lgx/d;)Lgb4/a;", "Liy/u;", "keyguardManager", "Lpx/d;", "remoteLogger", "Lib4/a;", "deactivateDomainErrorMapper", "Lib4/d;", "httpDomainErrorMapper", "integrityDomainErrorMapper", "appUpdateRequiredDomainErrorMapper", "Lib4/c;", "e", "(Liy/u;Lgx/d;Lmx/c;Lpx/d;Lib4/a;Lib4/d;Lgb4/w0;Lgb4/a;)Lib4/c;", "Lch1/b0;", "getRenewDocumentByIdentityTypeGlobalEventUC", "b", "(Lgx/d;Lmx/c;Lch1/b0;)Lib4/a;", "f", "(Lmx/c;)Lib4/d;", "Lhb4/d;", "d", "()Lhb4/d;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s4 {
    public s4() {
        f00.r.K().add(new SharedDestinationSpec(hb4.a.class, mb4.k.class, n2.f155291a.b()));
    }

    public final gb4.a a(mx.c labelProvider, gx.d globalEventManager) {
        return new dd4.d(labelProvider, globalEventManager);
    }

    public final ib4.a b(gx.d globalEventManager, mx.c labelProvider, ch1.b0 getRenewDocumentByIdentityTypeGlobalEventUC) {
        return new dd4.j(labelProvider, globalEventManager, getRenewDocumentByIdentityTypeGlobalEventUC);
    }

    public final pl.gov.coi.common.network.l c(ay.j jsonSerializer, dx.a deactivateDomainErrorFactory) {
        return new kb4.a(jsonSerializer, deactivateDomainErrorFactory);
    }

    public final hb4.d d() {
        return new nb4.g();
    }

    public final ib4.c e(iy.u keyguardManager, gx.d globalEventManager, mx.c labelProvider, px.d remoteLogger, ib4.a deactivateDomainErrorMapper, ib4.d httpDomainErrorMapper, gb4.w0 integrityDomainErrorMapper, gb4.a appUpdateRequiredDomainErrorMapper) {
        return new gb4.v0(keyguardManager, globalEventManager, labelProvider, remoteLogger, deactivateDomainErrorMapper, pq.v.e(httpDomainErrorMapper), integrityDomainErrorMapper, appUpdateRequiredDomainErrorMapper);
    }

    public final ib4.d f(mx.c labelProvider) {
        return new dd4.q(labelProvider);
    }

    public final gb4.w0 g(mx.c labelProvider) {
        return new dd4.m(labelProvider);
    }
}
