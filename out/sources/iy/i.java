package iy;

import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J6\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u000f\u0010\u0010J>\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H¦@¢\u0006\u0004\b\u0016\u0010\u0017J4\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u001a\u0010\u0010R\u001e\u0010 \u001a\u0004\u0018\u00010\u001b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!À\u0006\u0003"}, d2 = {"Liy/i;", "", "", "data", "Ljava/security/PublicKey;", "publicKey", "Liy/h$c;", "algorithm", "Ldx/i;", "Ldx/b;", "e", "([BLjava/security/PublicKey;Liy/h$c;Ltq/e;)Ljava/lang/Object;", "encryptedData", "Ljava/security/PrivateKey;", "privateKey", "c", "([BLjava/security/PrivateKey;Liy/h$c;Ltq/e;)Ljava/lang/Object;", "Ljava/security/Key;", "key", "wrappingKey", "Liy/h0;", "encoding", "d", "(Ljava/security/Key;Ljava/security/PublicKey;Liy/h$c;Liy/h0;Ltq/e;)Ljava/lang/Object;", "wrappedKey", "unwrappingKey", "b", "", "getExplicitProvider", "()Ljava/lang/String;", "a", "(Ljava/lang/String;)V", "explicitProvider", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i {
    void a(String str);

    Object b(byte[] bArr, PrivateKey privateKey, h.c cVar, tq.e<? super dx.i<? extends dx.b, ? extends Key>> eVar);

    Object c(byte[] bArr, PrivateKey privateKey, h.c cVar, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar);

    Object d(Key key, PublicKey publicKey, h.c cVar, h0 h0Var, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar);

    Object e(byte[] bArr, PublicKey publicKey, h.c cVar, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar);
}
