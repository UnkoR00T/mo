package com.google.android.libraries.places.internal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.google.android.libraries.places.internal.b61[], still in use, count: 1, list:
  (r0v1 com.google.android.libraries.places.internal.b61[]) from 0x002a: INVOKE (r0v1 com.google.android.libraries.places.internal.b61[]) STATIC call: wq.b.a(java.lang.Enum[]):wq.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):wq.a<E extends java.lang.Enum<E>> (m)]
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
public final class b61 {
    WHITE(0, fi.b.f64027c),
    GRAY(1, fi.b.f64026b),
    BLACK(2, fi.b.f64025a);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f31756b;

    static {
        wq.b.a(b61VarArr);
    }

    private b61(int i15, int i16) {
        super(str, i);
        this.f31755a = i15;
        this.f31756b = i16;
    }

    public static b61 valueOf(String str) {
        return (b61) Enum.valueOf(b61.class, str);
    }

    public static b61[] values() {
        return (b61[]) f31754f.clone();
    }

    public final int b() {
        return this.f31756b;
    }

    public final int zza() {
        return this.f31755a;
    }
}
