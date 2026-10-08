package ce;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements a<byte[]> {
    @Override // ce.a
    public int a() {
        return 1;
    }

    @Override // ce.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int b(byte[] bArr) {
        return bArr.length;
    }

    @Override // ce.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public byte[] newArray(int i15) {
        return new byte[i15];
    }

    @Override // ce.a
    public String getTag() {
        return "ByteArrayPool";
    }
}
