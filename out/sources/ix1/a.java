package ix1;

import java.time.Instant;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkx1/a;", "Lah0/a;", "a", "(Lkx1/a;)Lah0/a;", "b", "(Lah0/a;)Lkx1/a;", "eidservices_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final ah0.a a(kx1.a aVar) {
        return ah0.a.a().e(aVar.getSigningTime()).d(aVar.getPreparedPdf()).b(aVar.getCertificate()).c(aVar.getCmsHashToSignHex()).a();
    }

    public static final kx1.a b(ah0.a aVar) {
        Instant instantE = aVar.e();
        return new kx1.a(aVar.d(), aVar.c(), aVar.b(), instantE);
    }
}
