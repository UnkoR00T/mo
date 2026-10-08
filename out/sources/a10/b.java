package a10;

import iy.h;
import iy.r;
import javax.crypto.SecretKey;
import p071kotlin.Metadata;
import pq.v;
import py.KeyStoreKeySpec;
import py.i;
import tq.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"La10/b;", "La10/a;", "Lpy/i;", "keyStoreAesKeyGenerator", "<init>", "(Lpy/i;)V", "", "alias", "Ldx/i;", "Ldx/b;", "Ljavax/crypto/SecretKey;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lpy/i;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i keyStoreAesKeyGenerator;

    public b(i iVar) {
        this.keyStoreAesKeyGenerator = iVar;
    }

    @Override // a10.a
    public Object a(String str, e<? super dx.i<? extends dx.b, ? extends SecretKey>> eVar) {
        return this.keyStoreAesKeyGenerator.a(new KeyStoreKeySpec(str, new h.a.b(0, new r.a(0, 1, null), 0, 1, null), 0, null, v.e(py.h.ENCRYPT_AND_DECRYPT), null, false, null, 236, null), eVar);
    }
}
