package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
final class l0 extends j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f29399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f29400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f29401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f29402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f29403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f29404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f29405j;

    private l0(byte[] bArr, int i15, int i16, boolean z15) {
        super();
        this.f29405j = Integer.MAX_VALUE;
        this.f29399d = bArr;
        this.f29401f = i16 + i15;
        this.f29403h = i15;
        this.f29404i = i15;
        this.f29400e = z15;
    }

    @Override // com.google.android.gms.internal.clearcut.j0
    public final int c() {
        return this.f29403h - this.f29404i;
    }

    @Override // com.google.android.gms.internal.clearcut.j0
    public final int d(int i15) throws l1 {
        if (i15 < 0) {
            throw new l1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iC = i15 + c();
        int i16 = this.f29405j;
        if (iC > i16) {
            throw l1.a();
        }
        this.f29405j = iC;
        int i17 = this.f29401f + this.f29402g;
        this.f29401f = i17;
        int i18 = i17 - this.f29404i;
        if (i18 <= iC) {
            this.f29402g = 0;
            return i16;
        }
        int i19 = i18 - iC;
        this.f29402g = i19;
        this.f29401f = i17 - i19;
        return i16;
    }
}
