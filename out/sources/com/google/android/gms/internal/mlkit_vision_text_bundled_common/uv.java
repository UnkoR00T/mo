package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
final class uv implements hx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final uv f30650a = new uv();

    private uv() {
    }

    public static uv c() {
        return f30650a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.hx
    public final gx a(Class cls) {
        if (!bw.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (gx) bw.w(cls.asSubclass(bw.class)).p(3, null, null);
        } catch (Exception e15) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e15);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.hx
    public final boolean b(Class cls) {
        return bw.class.isAssignableFrom(cls);
    }
}
