package dv;

import org.bouncycastle.asn1.x509.DisplayText;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v29 dv.b[], still in use, count: 1, list:
  (r0v29 dv.b[]) from 0x01e4: INVOKE (r0v29 dv.b[]) STATIC call: wq.b.a(java.lang.Enum[]):wq.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):wq.a<E extends java.lang.Enum<E>> (m)]
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
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    /* JADX INFO: Fake field, exist only in values array */
    ValueOnlyNumeric(1),
    /* JADX INFO: Fake field, exist only in values array */
    PinLengthDiffersFrom46(2),
    /* JADX INFO: Fake field, exist only in values array */
    PukLengthDiffersFrom8(3),
    /* JADX INFO: Fake field, exist only in values array */
    InitWithoutData(5),
    /* JADX INFO: Fake field, exist only in values array */
    InitWithoutCan(6),
    /* JADX INFO: Fake field, exist only in values array */
    DataIncorrectFormat(7),
    /* JADX INFO: Fake field, exist only in values array */
    CertificateTypeCannotBeEmpty(8),
    /* JADX INFO: Fake field, exist only in values array */
    WrongPinLengthForAuthenticationCertType(9),
    /* JADX INFO: Fake field, exist only in values array */
    WrongPinLengthForAuthorizationCertType(10),
    IncorrectCan(11),
    Interrupted(12),
    IncorrectPin(13),
    PinBlocked(14),
    CertificateInactive(15),
    CertificateMissing(16),
    DataMissing(17),
    /* JADX INFO: Fake field, exist only in values array */
    DataIncorrectFormat(18),
    /* JADX INFO: Fake field, exist only in values array */
    ValueOnlyNumeric(19),
    DocumentNotSupported(20),
    /* JADX INFO: Fake field, exist only in values array */
    ValueOnlyNumeric(21),
    /* JADX INFO: Fake field, exist only in values array */
    DataIncorrectFormat(22),
    /* JADX INFO: Fake field, exist only in values array */
    ValueOnlyNumeric(24),
    /* JADX INFO: Fake field, exist only in values array */
    DataIncorrectFormat(25),
    UnexpectedError(99),
    /* JADX INFO: Fake field, exist only in values array */
    ProcessInitiated(100),
    /* JADX INFO: Fake field, exist only in values array */
    CanSet(101),
    /* JADX INFO: Fake field, exist only in values array */
    PinSet(102),
    /* JADX INFO: Fake field, exist only in values array */
    PukSet(103),
    /* JADX INFO: Fake field, exist only in values array */
    DataSet(104),
    /* JADX INFO: Fake field, exist only in values array */
    PaceSetSuccessfully(105),
    /* JADX INFO: Fake field, exist only in values array */
    SessionCancelSuccessfully(106),
    /* JADX INFO: Fake field, exist only in values array */
    Signing(108),
    /* JADX INFO: Fake field, exist only in values array */
    ChangingPin(109),
    /* JADX INFO: Fake field, exist only in values array */
    ResettingPin(110),
    /* JADX INFO: Fake field, exist only in values array */
    ProcessProgress(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE),
    /* JADX INFO: Fake field, exist only in values array */
    ProcessFinished(300);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44622a;

    static {
        wq.b.a(bVarArr);
    }

    public b(int i15) {
        super(str, i);
        this.f44622a = i15;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f44621l.clone();
    }

    public final int b() {
        return this.f44622a;
    }
}
