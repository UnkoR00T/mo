package c8;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class g1 extends u7.n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f24229i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f24230j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f24231k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f24232l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f24233m = w7.o0.f210729f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f24234n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f24235o;

    @Override // u7.n, u7.l
    public ByteBuffer a() {
        int i15;
        if (super.e() && (i15 = this.f24234n) > 0) {
            o(i15).put(this.f24233m, 0, this.f24234n).flip();
            this.f24234n = 0;
        }
        return super.a();
    }

    @Override // u7.l
    public void c(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i15 = iLimit - iPosition;
        if (i15 == 0) {
            return;
        }
        int iMin = Math.min(i15, this.f24232l);
        this.f24235o += (long) (iMin / this.f195971b.f195967d);
        this.f24232l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f24232l > 0) {
            return;
        }
        int i16 = i15 - iMin;
        int length = (this.f24234n + i16) - this.f24233m.length;
        ByteBuffer byteBufferO = o(length);
        int iO = w7.o0.o(length, 0, this.f24234n);
        byteBufferO.put(this.f24233m, 0, iO);
        int iO2 = w7.o0.o(length - iO, 0, i16);
        byteBuffer.limit(byteBuffer.position() + iO2);
        byteBufferO.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i17 = i16 - iO2;
        int i18 = this.f24234n - iO;
        this.f24234n = i18;
        byte[] bArr = this.f24233m;
        System.arraycopy(bArr, iO, bArr, 0, i18);
        byteBuffer.get(this.f24233m, this.f24234n, i17);
        this.f24234n += i17;
        byteBufferO.flip();
    }

    @Override // u7.n, u7.l
    public boolean e() {
        return super.e() && this.f24234n == 0;
    }

    @Override // u7.l
    public long f(long j15) {
        return Math.max(0L, j15 - w7.o0.T0(this.f24230j + this.f24229i, this.f195971b.f195964a));
    }

    @Override // u7.n
    public u7.l.a j(u7.l.a aVar) throws u7.l.c {
        if (!w7.o0.y0(aVar.f195966c)) {
            throw new u7.l.c(aVar);
        }
        this.f24231k = true;
        return (this.f24229i == 0 && this.f24230j == 0) ? u7.l.a.f195963e : aVar;
    }

    @Override // u7.n
    protected void l(u7.l.b bVar) {
        if (this.f24231k) {
            this.f24231k = false;
            int i15 = this.f24230j;
            int i16 = this.f195971b.f195967d;
            this.f24233m = new byte[i15 * i16];
            this.f24232l = this.f24229i * i16;
        }
        this.f24234n = 0;
    }

    @Override // u7.n
    protected void m() {
        if (this.f24231k) {
            int i15 = this.f24234n;
            if (i15 > 0) {
                this.f24235o += (long) (i15 / this.f195971b.f195967d);
            }
            this.f24234n = 0;
        }
    }

    @Override // u7.n
    protected void n() {
        this.f24233m = w7.o0.f210729f;
    }

    public long p() {
        return this.f24235o;
    }

    public void q() {
        this.f24235o = 0L;
    }

    public void r(int i15, int i16) {
        this.f24229i = i15;
        this.f24230j = i16;
    }
}
