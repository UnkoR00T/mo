package m00;

import fv.d0;
import fv.v;
import ge4.x;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lge4/x;", "Lm00/a;", "b", "(Lge4/x;)Lm00/a;", "Lfv/d0;", "a", "(Lfv/d0;)Lm00/a;", "network_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final a a(d0 d0Var) {
        v url = d0Var.getRequest().getUrl();
        int code = d0Var.getCode();
        String message = d0Var.getMessage();
        d0 d0Var2 = !d0Var.isSuccessful() ? d0Var : null;
        return new a(url, code, message, d0Var2 != null ? d0Var2.getBody() : null, c.INSTANCE.a(d0Var.getHeaders()));
    }

    public static final a b(x<?> xVar) {
        return new a(xVar.h().getRequest().getUrl(), xVar.b(), xVar.g(), xVar.d(), c.INSTANCE.a(xVar.e()));
    }
}
