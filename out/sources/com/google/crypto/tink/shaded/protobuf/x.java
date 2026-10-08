package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes4.dex */
class x implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final x f36316a = new x();

    private x() {
    }

    public static x c() {
        return f36316a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public p0 a(Class<?> cls) {
        if (!y.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (p0) y.y(cls.asSubclass(y.class)).n();
        } catch (Exception e15) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e15);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public boolean b(Class<?> cls) {
        return y.class.isAssignableFrom(cls);
    }
}
