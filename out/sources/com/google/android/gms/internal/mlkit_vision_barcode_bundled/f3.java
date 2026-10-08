package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
final class f3 implements p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f3 f29715a = new f3();

    private f3() {
    }

    public static f3 c() {
        return f29715a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.p4
    public final boolean a(Class cls) {
        return l3.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.p4
    public final o4 b(Class cls) {
        if (!l3.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (o4) l3.l(cls.asSubclass(l3.class)).I(3, null, null);
        } catch (Exception e15) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e15);
        }
    }
}
