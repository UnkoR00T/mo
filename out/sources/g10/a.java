package g10;

import dx.i;
import h10.DecodedPasswordKeyData;
import iy.a0;
import javax.crypto.SecretKey;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ6\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lg10/a;", "", "", "encryptedPasswordKeyData", "Ljavax/crypto/SecretKey;", "deviceKey", "", "saltLength", "Ldx/i;", "Ldx/b;", "Lh10/a;", "a", "([BLjavax/crypto/SecretKey;ILtq/e;)Ljava/lang/Object;", "iterationsCount", "Liy/a0;", "salt", "Lsy/a;", "b", "(Ljavax/crypto/SecretKey;ILiy/a0;ILtq/e;)Ljava/lang/Object;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.f69481a;

    /* JADX INFO: renamed from: g10.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg10/a$a;", "", "<init>", "()V", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f69481a = new Companion();

        private Companion() {
        }
    }

    static /* synthetic */ Object c(a aVar, byte[] bArr, SecretKey secretKey, int i15, e eVar, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrypt");
        }
        if ((i16 & 4) != 0) {
            i15 = 16;
        }
        return aVar.a(bArr, secretKey, i15, eVar);
    }

    static /* synthetic */ Object d(a aVar, SecretKey secretKey, int i15, a0 a0Var, int i16, e eVar, int i17, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encrypt");
        }
        if ((i17 & 8) != 0) {
            i16 = 16;
        }
        return aVar.b(secretKey, i15, a0Var, i16, eVar);
    }

    Object a(byte[] bArr, SecretKey secretKey, int i15, e<? super i<? extends dx.b, DecodedPasswordKeyData>> eVar);

    Object b(SecretKey secretKey, int i15, a0 a0Var, int i16, e<? super i<? extends dx.b, sy.a>> eVar);
}
