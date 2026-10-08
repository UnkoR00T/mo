package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes3.dex */
class w implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final w f12204a = new w();

    private w() {
    }

    public static w c() {
        return f12204a;
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public p0 a(Class<?> cls) {
        if (!x.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (p0) x.A(cls.asSubclass(x.class)).p();
        } catch (Exception e15) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e15);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public boolean b(Class<?> cls) {
        return x.class.isAssignableFrom(cls);
    }
}
