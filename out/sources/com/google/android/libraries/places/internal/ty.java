package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class ty implements e00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ty f33823a = new ty();

    private ty() {
    }

    public static ty c() {
        return f33823a;
    }

    @Override // com.google.android.libraries.places.internal.e00
    public final d00 a(Class cls) {
        if (!az.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (d00) az.q(cls.asSubclass(az.class)).h(3, null, null);
        } catch (Exception e15) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e15);
        }
    }

    @Override // com.google.android.libraries.places.internal.e00
    public final boolean b(Class cls) {
        return az.class.isAssignableFrom(cls);
    }
}
