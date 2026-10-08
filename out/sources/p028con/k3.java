package p028con;

import wq.b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 con.k3[], still in use, count: 1, list:
  (r0v1 con.k3[]) from 0x004a: INVOKE (r0v1 con.k3[]) STATIC call: wq.b.a(java.lang.Enum[]):wq.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):wq.a<E extends java.lang.Enum<E>> (m)]
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
public final class k3 {
    Presence((byte) -120, (byte) -120, (byte) -120, (byte) 0),
    Authentication((byte) -118, (byte) -118, (byte) -127, (byte) 1),
    Authorization((byte) -117, (byte) -117, (byte) -126, (byte) 2),
    Puk((byte) -108, (byte) 9, (byte) -118, (byte) 4);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f37123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f37124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte f37125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte f37126d;

    static {
        b.a(k3VarArr);
    }

    public k3(byte b15, byte b16, byte b17, byte b18) {
        super(str, i);
        this.f37123a = b15;
        this.f37124b = b16;
        this.f37125c = b17;
        this.f37126d = b18;
    }

    public static k3 valueOf(String str) {
        return (k3) Enum.valueOf(k3.class, str);
    }

    public static k3[] values() {
        return (k3[]) f37122j.clone();
    }
}
