package qi;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.td;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f166674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f166675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private td f166676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f166677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f166678e;

    public final f0 a(byte[] bArr) {
        this.f166674a = bArr;
        return this;
    }

    public final f0 b(td tdVar) {
        this.f166676c = tdVar;
        return this;
    }

    public final f0 c(long j15) {
        this.f166675b = j15;
        return this;
    }

    public final g0 d() {
        return new g0(this.f166674a, this.f166675b, this.f166676c, this.f166677d, this.f166678e);
    }

    public final f0 e(int i15) {
        this.f166677d = 2;
        return this;
    }

    public final f0 f(int i15) {
        this.f166678e = i15;
        return this;
    }
}
