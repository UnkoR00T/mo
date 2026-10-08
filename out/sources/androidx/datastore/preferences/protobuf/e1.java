package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes3.dex */
final class e1 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0 f11945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f11947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f11948d;

    e1(r0 r0Var, String str, Object[] objArr) {
        this.f11945a = r0Var;
        this.f11946b = str;
        this.f11947c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f11948d = cCharAt;
            return;
        }
        int i15 = cCharAt & 8191;
        int i16 = 13;
        int i17 = 1;
        while (true) {
            int i18 = i17 + 1;
            char cCharAt2 = str.charAt(i17);
            if (cCharAt2 < 55296) {
                this.f11948d = i15 | (cCharAt2 << i16);
                return;
            } else {
                i15 |= (cCharAt2 & 8191) << i16;
                i16 += 13;
                i17 = i18;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public boolean a() {
        return (this.f11948d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public r0 b() {
        return this.f11945a;
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public b1 c() {
        int i15 = this.f11948d;
        if ((i15 & 1) != 0) {
            return b1.PROTO2;
        }
        return (i15 & 4) == 4 ? b1.EDITIONS : b1.PROTO3;
    }

    Object[] d() {
        return this.f11947c;
    }

    String e() {
        return this.f11946b;
    }
}
