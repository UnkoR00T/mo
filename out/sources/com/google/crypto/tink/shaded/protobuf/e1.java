package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes4.dex */
final class e1 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0 f36048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f36050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f36051d;

    e1(r0 r0Var, String str, Object[] objArr) {
        this.f36048a = r0Var;
        this.f36049b = str;
        this.f36050c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f36051d = cCharAt;
            return;
        }
        int i15 = cCharAt & 8191;
        int i16 = 13;
        int i17 = 1;
        while (true) {
            int i18 = i17 + 1;
            char cCharAt2 = str.charAt(i17);
            if (cCharAt2 < 55296) {
                this.f36051d = i15 | (cCharAt2 << i16);
                return;
            } else {
                i15 |= (cCharAt2 & 8191) << i16;
                i16 += 13;
                i17 = i18;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.p0
    public boolean a() {
        return (this.f36051d & 2) == 2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.p0
    public r0 b() {
        return this.f36048a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.p0
    public b1 c() {
        return (this.f36051d & 1) == 1 ? b1.PROTO2 : b1.PROTO3;
    }

    Object[] d() {
        return this.f36050c;
    }

    String e() {
        return this.f36049b;
    }
}
