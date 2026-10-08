package iy;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J4\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\f\u0010\u000bJ4\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0011\u0010\u0010J,\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0014\u0010\u000bJ4\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0016H¦@¢\u0006\u0004\b\u0017\u0010\u0018J4\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0016H¦@¢\u0006\u0004\b\u001a\u0010\u001bR\u001e\u0010!\u001a\u0004\u0018\u00010\u001c8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010'\u001a\u00020\"8&@&X¦\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006(À\u0006\u0003"}, d2 = {"Liy/g;", "", "", "data", "Ljavax/crypto/SecretKey;", "key", "Liy/h$a;", "algorithm", "Ldx/i;", "Ldx/b;", "f", "([BLjavax/crypto/SecretKey;Liy/h$a;Ltq/e;)Ljava/lang/Object;", "d", "Ljavax/crypto/Cipher;", "initializedCipher", "g", "([BLjavax/crypto/Cipher;Liy/h$a;Ltq/e;)Ljava/lang/Object;", "h", "i", "(Ljavax/crypto/SecretKey;Liy/h$a;Ltq/e;)Ljava/lang/Object;", "e", "wrappingKey", "Liy/h$a$c;", "c", "(Ljavax/crypto/SecretKey;Ljavax/crypto/SecretKey;Liy/h$a$c;Ltq/e;)Ljava/lang/Object;", "wrappedKey", "j", "([BLjavax/crypto/SecretKey;Liy/h$a$c;Ltq/e;)Ljava/lang/Object;", "", "getExplicitProvider", "()Ljava/lang/String;", "a", "(Ljava/lang/String;)V", "explicitProvider", "", "getDebuggable", "()Z", "b", "(Z)V", "debuggable", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g {
    void a(String str);

    void b(boolean z15);

    Object c(SecretKey secretKey, SecretKey secretKey2, h.a.c cVar, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar);

    Object d(byte[] bArr, SecretKey secretKey, h.a aVar, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar);

    Object e(byte[] bArr, SecretKey secretKey, h.a aVar, tq.e<? super dx.i<? extends dx.b, ? extends Cipher>> eVar);

    Object f(byte[] bArr, SecretKey secretKey, h.a aVar, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar);

    Object g(byte[] bArr, Cipher cipher, h.a aVar, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar);

    Object h(byte[] bArr, Cipher cipher, h.a aVar, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar);

    Object i(SecretKey secretKey, h.a aVar, tq.e<? super dx.i<? extends dx.b, ? extends Cipher>> eVar);

    Object j(byte[] bArr, SecretKey secretKey, h.a.c cVar, tq.e<? super dx.i<? extends dx.b, ? extends SecretKey>> eVar);
}
