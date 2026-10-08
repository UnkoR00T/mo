package com.google.android.libraries.places.internal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.google.android.libraries.places.internal.o61[], still in use, count: 1, list:
  (r0v1 com.google.android.libraries.places.internal.o61[]) from 0x002e: INVOKE (r0v1 com.google.android.libraries.places.internal.o61[]) STATIC call: wq.b.a(java.lang.Enum[]):wq.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):wq.a<E extends java.lang.Enum<E>> (m)]
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
/* JADX INFO: loaded from: classes4.dex */
public final class o61 {
    REVIEWS_ARENT_VERIFIED,
    ABOUT_RESULTS,
    REVIEW_ORDERING,
    REPORT_BUSINESS_CONDUCT;

    static {
        wq.b.a(o61VarArr);
    }

    private o61() {
        super(str, i);
    }

    public static o61 valueOf(String str) {
        return (o61) Enum.valueOf(o61.class, str);
    }

    public static o61[] values() {
        return (o61[]) f33158e.clone();
    }
}
