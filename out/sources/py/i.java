package py;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\n\u0010\b¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lpy/i;", "", "Lpy/j;", "spec", "Ldx/i;", "Ldx/b;", "Ljavax/crypto/SecretKey;", "a", "(Lpy/j;Ltq/e;)Ljava/lang/Object;", "Ljavax/crypto/KeyGenerator;", "b", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i {
    Object a(KeyStoreKeySpec keyStoreKeySpec, tq.e<? super dx.i<? extends dx.b, ? extends SecretKey>> eVar);

    Object b(KeyStoreKeySpec keyStoreKeySpec, tq.e<? super dx.i<? extends dx.b, ? extends KeyGenerator>> eVar);
}
