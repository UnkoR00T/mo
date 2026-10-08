package j74;

import c74.WKAuthSigningParams;
import oq.y;
import p071kotlin.Metadata;
import pq.v0;
import qp0.JWSSigningParams;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqp0/a;", "Lc74/b;", "b", "(Lqp0/a;)Lc74/b;", "wk_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final WKAuthSigningParams b(JWSSigningParams jWSSigningParams) {
        return new WKAuthSigningParams(v0.f(y.a("challenge", jWSSigningParams.getChallenge())), jWSSigningParams.getEncryptionKey(), jWSSigningParams.getEncryptionKeyId(), jWSSigningParams.d(), jWSSigningParams.getTokenTtl(), null);
    }
}
