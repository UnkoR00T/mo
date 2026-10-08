package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.engines.AsconPermutationFriend;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class AsconCXof128 extends AsconXofBase {

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private final long f148965z0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    private final long f148966z1;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    private final long f148967z2;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private final long f148968z3;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    private final long f148969z4;

    public AsconCXof128() {
        this(new byte[0], 0, 0);
    }

    private void initState(byte[] bArr, int i15, int i16) {
        if (i16 == 0) {
            this.f148964p.set(5768210384618244584L, 6623958265790276749L, 4252419465292010770L, 1238191464582506891L, 56353695744608240L);
        } else {
            this.f148964p.set(7445901275803737603L, 4886737088792722364L, -1616759365661982283L, 3076320316797452470L, -8124743304765850554L);
            AsconPermutationFriend.AsconPermutation asconPermutation = this.f148964p;
            asconPermutation.f149016x0 ^= ((long) i16) << 3;
            asconPermutation.p(12);
            update(bArr, i15, i16);
            padAndAbsorb();
        }
        super.reset();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i15) {
        return super.doFinal(bArr, i15);
    }

    @Override // org.bouncycastle.crypto.digests.AsconXofBase, org.bouncycastle.crypto.Xof
    public /* bridge */ /* synthetic */ int doOutput(byte[] bArr, int i15, int i16) {
        return super.doOutput(bArr, i15, i16);
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.ExtendedDigest
    public /* bridge */ /* synthetic */ int getByteLength() {
        return super.getByteLength();
    }

    @Override // org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ int getDigestSize() {
        return super.getDigestSize();
    }

    @Override // org.bouncycastle.crypto.digests.AsconBaseDigest
    protected long loadBytes(byte[] bArr, int i15) {
        return Pack.littleEndianToLong(bArr, i15);
    }

    @Override // org.bouncycastle.crypto.digests.AsconBaseDigest
    protected long pad(int i15) {
        return 1 << (i15 << 3);
    }

    @Override // org.bouncycastle.crypto.digests.AsconXofBase, org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f148964p.set(this.f148965z0, this.f148966z1, this.f148967z2, this.f148968z3, this.f148969z4);
    }

    @Override // org.bouncycastle.crypto.digests.AsconBaseDigest
    protected void setBytes(long j15, byte[] bArr, int i15) {
        Pack.longToLittleEndian(j15, bArr, i15);
    }

    @Override // org.bouncycastle.crypto.digests.AsconXofBase, org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ void update(byte b15) {
        super.update(b15);
    }

    public AsconCXof128(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.crypto.digests.AsconXofBase, org.bouncycastle.crypto.Xof
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i15, int i16) {
        return super.doFinal(bArr, i15, i16);
    }

    @Override // org.bouncycastle.crypto.digests.AsconBaseDigest
    protected long loadBytes(byte[] bArr, int i15, int i16) {
        return Pack.littleEndianToLong(bArr, i15, i16);
    }

    @Override // org.bouncycastle.crypto.digests.AsconBaseDigest
    protected void setBytes(long j15, byte[] bArr, int i15, int i16) {
        Pack.longToLittleEndian(j15, bArr, i15, i16);
    }

    @Override // org.bouncycastle.crypto.digests.AsconXofBase, org.bouncycastle.crypto.digests.BufferBaseDigest, org.bouncycastle.crypto.Digest
    public /* bridge */ /* synthetic */ void update(byte[] bArr, int i15, int i16) {
        super.update(bArr, i15, i16);
    }

    public AsconCXof128(byte[] bArr, int i15, int i16) {
        this.algorithmName = "Ascon-CXOF128";
        ensureSufficientInputBuffer(bArr, i15, i16);
        if (i16 > 256) {
            throw new DataLengthException("customized string is too long");
        }
        initState(bArr, i15, i16);
        AsconPermutationFriend.AsconPermutation asconPermutation = this.f148964p;
        this.f148965z0 = asconPermutation.f149016x0;
        this.f148966z1 = asconPermutation.f149017x1;
        this.f148967z2 = asconPermutation.f149018x2;
        this.f148968z3 = asconPermutation.f149019x3;
        this.f148969z4 = asconPermutation.f149020x4;
    }
}
