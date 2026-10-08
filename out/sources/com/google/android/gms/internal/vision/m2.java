package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes3.dex */
final class m2 implements v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m2 f31152a = new m2();

    private m2() {
    }

    public static m2 c() {
        return f31152a;
    }

    @Override // com.google.android.gms.internal.vision.v3
    public final boolean a(Class<?> cls) {
        return l2.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.vision.v3
    public final s3 b(Class<?> cls) {
        if (!l2.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (s3) l2.m(cls.asSubclass(l2.class)).o(l2.f.f31136c, null, null);
        } catch (Exception e15) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e15);
        }
    }
}
