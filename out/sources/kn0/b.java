package kn0;

import dn0.VerificationResponse;
import dn0.f;
import dx.i;
import iy.b0;
import java.security.KeyPair;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J4\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lkn0/b;", "", "", "sessionId", "Liy/b0;", "secret", "Ljava/security/KeyPair;", "keyPair", "Ldx/i;", "Ldx/b;", "Ldn0/d;", "b", "(Ljava/lang/String;Liy/b0;Ljava/security/KeyPair;Ltq/e;)Ljava/lang/Object;", "encryptedData", "Loq/i0;", "c", "(Ljava/lang/String;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Ldn0/f;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "documentverificationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    Object a(String str, e<? super i<? extends dx.b, ? extends f>> eVar);

    Object b(String str, b0 b0Var, KeyPair keyPair, e<? super i<? extends dx.b, VerificationResponse>> eVar);

    Object c(String str, b0 b0Var, e<? super i<? extends dx.b, i0>> eVar);
}
