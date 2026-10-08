package nv3;

import dx.i;
import iy.b0;
import ov3.CentralTokens;
import ov3.JWSSigningParams;
import ov3.OwTokens;
import ov3.OwnerAddress;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u00022\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lnv3/a;", "", "Ldx/i;", "Ldx/b;", "Lov3/f;", "e", "(Ltq/e;)Ljava/lang/Object;", "Liy/b0;", "mobileIdentityToken", "Lov3/c;", "d", "(Liy/b0;Ltq/e;)Ljava/lang/Object;", "", "edorAddress", "Lov3/c$a;", "centralAccessToken", "Lov3/g;", "a", "(Ljava/lang/String;Lov3/c$a;Ltq/e;)Ljava/lang/Object;", "Lov3/g$c;", "owRefreshToken", "c", "(Ljava/lang/String;Lov3/g$c;Ltq/e;)Ljava/lang/Object;", "Lov3/h;", "b", "(Lov3/c$a;Ltq/e;)Ljava/lang/Object;", "edorauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object a(String str, CentralTokens.Access access, e<? super i<? extends dx.b, OwTokens>> eVar);

    Object b(CentralTokens.Access access, e<? super i<? extends dx.b, OwnerAddress>> eVar);

    Object c(String str, OwTokens.Refresh refresh, e<? super i<? extends dx.b, OwTokens>> eVar);

    Object d(b0 b0Var, e<? super i<? extends dx.b, CentralTokens>> eVar);

    Object e(e<? super i<? extends dx.b, JWSSigningParams>> eVar);
}
