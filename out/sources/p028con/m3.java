package p028con;

import wq.b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v25 con.m3[], still in use, count: 1, list:
  (r0v25 con.m3[]) from 0x0157: INVOKE (r0v25 con.m3[]) STATIC call: wq.b.a(java.lang.Enum[]):wq.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):wq.a<E extends java.lang.Enum<E>> (m)]
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
public final class m3 {
    Unrecognised(0),
    DataPending(24832),
    EndOfFileReached(25218),
    /* JADX INFO: Fake field, exist only in values array */
    AuthStepFailed(25344),
    /* JADX INFO: Fake field, exist only in values array */
    PasswordBlocked(25536),
    InactivePrivateKey(25219),
    /* JADX INFO: Fake field, exist only in values array */
    AuthState1(25537),
    /* JADX INFO: Fake field, exist only in values array */
    AuthState2(25538),
    /* JADX INFO: Fake field, exist only in values array */
    AuthState3(25539),
    WrongLength(26368),
    SecurityStatusNotSatisfied(27010),
    AuthMethodBlocked(27011),
    /* JADX INFO: Fake field, exist only in values array */
    ReferenceUnusable(27012),
    /* JADX INFO: Fake field, exist only in values array */
    ConditionsNotSatisfied(27013),
    /* JADX INFO: Fake field, exist only in values array */
    SmDataMissing(27015),
    /* JADX INFO: Fake field, exist only in values array */
    WeirdOk(27016),
    /* JADX INFO: Fake field, exist only in values array */
    ApplicationBlocked(27264),
    FileNotFound(27266),
    /* JADX INFO: Fake field, exist only in values array */
    ApplicationBlocked(27270),
    /* JADX INFO: Fake field, exist only in values array */
    WeirdOk(27904),
    /* JADX INFO: Fake field, exist only in values array */
    ApplicationBlocked(28160),
    /* JADX INFO: Fake field, exist only in values array */
    WeirdOk(28417),
    /* JADX INFO: Fake field, exist only in values array */
    ApplicationBlocked(28418),
    /* JADX INFO: Fake field, exist only in values array */
    WeirdOk(36866),
    Ok(36864);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l3 f37127b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37138a;

    static {
        b.a(m3VarArr);
        f37127b = new l3();
    }

    public m3(int i15) {
        super(str, i);
        this.f37138a = i15;
    }

    public static m3 valueOf(String str) {
        return (m3) Enum.valueOf(m3.class, str);
    }

    public static m3[] values() {
        return (m3[]) f37137m.clone();
    }
}
