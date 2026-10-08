package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
final class e1 implements k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e1 f29295a = new e1();

    private e1() {
    }

    public static e1 c() {
        return f29295a;
    }

    @Override // com.google.android.gms.internal.clearcut.k2
    public final boolean a(Class<?> cls) {
        return f1.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.clearcut.k2
    public final j2 b(Class<?> cls) {
        if (!f1.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (j2) f1.q(cls.asSubclass(f1.class)).h(f1.e.f29322c, null, null);
        } catch (Exception e15) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e15);
        }
    }
}
