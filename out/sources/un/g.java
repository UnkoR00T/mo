package un;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f199280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f199281b;

    public g(byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(bArr);
        this.f199280a = bArr;
        Objects.requireNonNull(bArr2);
        this.f199281b = bArr2;
    }

    public byte[] a() {
        return this.f199281b;
    }

    public byte[] b() {
        return this.f199280a;
    }
}
