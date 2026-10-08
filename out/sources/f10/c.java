package f10;

import dx.i;
import iy.a0;
import iy.b0;
import javax.crypto.SecretKey;
import oq.i0;
import p071kotlin.Metadata;
import qy.MasterKeyModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J,\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJ<\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u0012\u0010\u0013J<\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u0015\u0010\u0013¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lf10/c;", "", "Ldx/i;", "Ldx/b;", "Loq/i0;", "c", "(Ltq/e;)Ljava/lang/Object;", "Liy/b0;", "password", "Ljavax/crypto/SecretKey;", "deviceKey", "Lqy/a;", "b", "(Liy/b0;Ljavax/crypto/SecretKey;Ltq/e;)Ljava/lang/Object;", "Lqy/b;", "wrappedMasterKey", "", "encryptedPasswordKeyData", "d", "(Liy/b0;Liy/a0;[BLjavax/crypto/SecretKey;Ltq/e;)Ljava/lang/Object;", "", "a", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {
    Object a(b0 b0Var, a0 a0Var, byte[] bArr, SecretKey secretKey, tq.e<? super i<? extends dx.b, Boolean>> eVar);

    Object b(b0 b0Var, SecretKey secretKey, tq.e<? super i<? extends dx.b, MasterKeyModel>> eVar);

    Object c(tq.e<? super i<? extends dx.b, i0>> eVar);

    Object d(b0 b0Var, a0 a0Var, byte[] bArr, SecretKey secretKey, tq.e<? super i<? extends dx.b, i0>> eVar);
}
