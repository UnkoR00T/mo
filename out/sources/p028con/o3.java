package p028con;

import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import wq.b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 con.o3[], still in use, count: 1, list:
  (r0v1 con.o3[]) from 0x003e: INVOKE (r0v1 con.o3[]) STATIC call: wq.b.a(java.lang.Enum[]):wq.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):wq.a<E extends java.lang.Enum<E>> (m)]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class o3 {
    /* JADX INFO: Fake field, exist only in values array */
    ECDSA_224(BERTags.FLAGS),
    ECDSA_256(256),
    /* JADX INFO: Fake field, exist only in values array */
    ECDSA_320(320),
    ECDSA_384(MLKEMEngine.KyberPolyBytes),
    RSA2048(2048);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37147a;

    static {
        b.a(o3VarArr);
    }

    public o3(int i15) {
        super(str, i);
        this.f37147a = i15;
    }

    public static o3 valueOf(String str) {
        return (o3) Enum.valueOf(o3.class, str);
    }

    public static o3[] values() {
        return (o3[]) f37146e.clone();
    }
}
