package g34;

import dx.i;
import iy.a0;
import iy.b0;
import java.util.Map;
import k34.u;
import mu.g;
import oq.i0;
import p071kotlin.Metadata;
import ry.CertKeyPair;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u0004H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H¦@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0018\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0019\u0010\u001aJ<\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u00042\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001bH¦@¢\u0006\u0004\b \u0010!J$\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0018\u001a\u00020\u000eH¦@¢\u0006\u0004\b\"\u0010\u001aJ(\u0010$\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060#0\u0004H¦@¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010&\u001a\u0004\u0018\u00010\u000e2\u0006\u0010%\u001a\u00020\u000eH¦@¢\u0006\u0004\b&\u0010\u001aJ$\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b'\u0010\bJ\u0010\u0010(\u001a\u00020\u0015H¦@¢\u0006\u0004\b(\u0010\u0017J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00150)H&¢\u0006\u0004\b*\u0010+¨\u0006,À\u0006\u0003"}, d2 = {"Lg34/c;", "", "Lk34/u;", "identityType", "Ldx/i;", "Ldx/b;", "", "l", "(Lk34/u;Ltq/e;)Ljava/lang/Object;", "Lry/c;", "m", "(Lk34/u;)Ldx/i;", "", "withValidCert", "Lrq0/b;", "h", "(Z)Lrq0/b;", "g", "(Z)Ldx/i;", "c", "()Ldx/i;", "Loq/i0;", "k", "(Ltq/e;)Ljava/lang/Object;", "documentType", "j", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "Liy/b0;", "peselTicket", "Liy/a0;", "certPkcs12", "password", "i", "(Lrq0/b;Liy/b0;Liy/a0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "p", "", "d", "document", "f", "e", "a", "Lmu/g;", "n", "()Lmu/g;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {
    static /* synthetic */ i b(c cVar, boolean z15, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIdentityTypeForMainIdentity");
        }
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        return cVar.g(z15);
    }

    static /* synthetic */ rq0.b o(c cVar, boolean z15, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDocumentTypeForMainIdentity");
        }
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        return cVar.h(z15);
    }

    Object a(e<? super i0> eVar);

    i<dx.b, Boolean> c();

    Object d(e<? super i<? extends dx.b, ? extends Map<rq0.b, String>>> eVar);

    Object e(u uVar, e<? super i<? extends dx.b, String>> eVar);

    Object f(rq0.b bVar, e<? super rq0.b> eVar);

    i<dx.b, u> g(boolean withValidCert);

    rq0.b h(boolean withValidCert);

    Object i(rq0.b bVar, b0 b0Var, a0 a0Var, b0 b0Var2, e<? super i<? extends dx.b, i0>> eVar);

    Object j(rq0.b bVar, e<? super i<? extends dx.b, Boolean>> eVar);

    Object k(e<? super i0> eVar);

    Object l(u uVar, e<? super i<? extends dx.b, String>> eVar);

    i<dx.b, CertKeyPair> m(u identityType);

    g<i0> n();

    Object p(rq0.b bVar, e<? super i<? extends dx.b, String>> eVar);
}
