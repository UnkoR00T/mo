package p028con;

import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;
import wq.b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 con.j3[], still in use, count: 1, list:
  (r0v1 con.j3[]) from 0x003e: INVOKE (r0v1 con.j3[]) STATIC call: wq.b.a(java.lang.Enum[]):wq.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):wq.a<E extends java.lang.Enum<E>> (m)]
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
public final class j3 {
    SHA1("SHA-1"),
    /* JADX INFO: Fake field, exist only in values array */
    SHA224("SHA-224"),
    SHA256(XMSSKeyParameters.SHA_256),
    SHA384("SHA-384"),
    /* JADX INFO: Fake field, exist only in values array */
    SHA512(XMSSKeyParameters.SHA_512);

    static {
        b.a(j3VarArr);
    }

    public j3(String str) {
        super(str, i);
    }

    public static j3 valueOf(String str) {
        return (j3) Enum.valueOf(j3.class, str);
    }

    public static j3[] values() {
        return (j3[]) f37117d.clone();
    }
}
