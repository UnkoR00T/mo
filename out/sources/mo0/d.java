package mo0;

import eo0.CentralTokens;
import eo0.OwTokens;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lmo0/d;", "", "Liy/b0;", "mobileIdentityToken", "Ldx/i;", "Ldx/b;", "Leo0/k;", "b", "(Liy/b0;Ltq/e;)Ljava/lang/Object;", "", "electronicDeliveryAddress", "Leo0/k$a;", "centralAccessToken", "Leo0/i0;", "a", "(Ljava/lang/String;Leo0/k$a;Ltq/e;)Ljava/lang/Object;", "Leo0/i0$c;", "owRefreshToken", "c", "(Ljava/lang/String;Leo0/i0$c;Ltq/e;)Ljava/lang/Object;", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {
    Object a(String str, CentralTokens.Access access, tq.e<? super dx.i<? extends dx.b, OwTokens>> eVar);

    Object b(b0 b0Var, tq.e<? super dx.i<? extends dx.b, CentralTokens>> eVar);

    Object c(String str, OwTokens.Refresh refresh, tq.e<? super dx.i<? extends dx.b, OwTokens>> eVar);
}
