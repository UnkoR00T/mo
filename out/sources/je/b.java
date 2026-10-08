package je;

import be.v;
import ve.k;

/* JADX INFO: loaded from: classes3.dex */
public class b implements v<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f102155a;

    public b(byte[] bArr) {
        this.f102155a = (byte[]) k.d(bArr);
    }

    @Override // be.v
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f102155a;
    }

    @Override // be.v
    public void c() {
    }

    @Override // be.v
    public Class<byte[]> d() {
        return byte[].class;
    }

    @Override // be.v
    public int getSize() {
        return this.f102155a.length;
    }
}
