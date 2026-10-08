package f10;

import dx.i;
import iy.a0;
import javax.crypto.SecretKey;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J4\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\t\u0010\nJ4\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lf10/e;", "", "Ljavax/crypto/SecretKey;", "masterKey", "passwordKey", "deviceKey", "Ldx/i;", "Ldx/b;", "Lqy/b;", "a", "(Ljavax/crypto/SecretKey;Ljavax/crypto/SecretKey;Ljavax/crypto/SecretKey;Ltq/e;)Ljava/lang/Object;", "wrappedMasterKey", "b", "(Liy/a0;Ljavax/crypto/SecretKey;Ljavax/crypto/SecretKey;Ltq/e;)Ljava/lang/Object;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {
    Object a(SecretKey secretKey, SecretKey secretKey2, SecretKey secretKey3, tq.e<? super i<? extends dx.b, qy.b>> eVar);

    Object b(a0 a0Var, SecretKey secretKey, SecretKey secretKey2, tq.e<? super i<? extends dx.b, ? extends SecretKey>> eVar);
}
