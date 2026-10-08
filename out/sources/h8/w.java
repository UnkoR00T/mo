package h8;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
final class w implements y7.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y7.f f81802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f81803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f81804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f81805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f81806e;

    public interface a {
        void a(w7.c0 c0Var);
    }

    public w(y7.f fVar, int i15, a aVar) {
        zj.p.d(i15 > 0);
        this.f81802a = fVar;
        this.f81803b = i15;
        this.f81804c = aVar;
        this.f81805d = new byte[1];
        this.f81806e = i15;
    }

    private boolean q() {
        if (this.f81802a.read(this.f81805d, 0, 1) == -1) {
            return false;
        }
        int i15 = (this.f81805d[0] & GF2Field.MASK) << 4;
        if (i15 == 0) {
            return true;
        }
        byte[] bArr = new byte[i15];
        int i16 = i15;
        int i17 = 0;
        while (i16 > 0) {
            int i18 = this.f81802a.read(bArr, i17, i16);
            if (i18 == -1) {
                return false;
            }
            i17 += i18;
            i16 -= i18;
        }
        while (i15 > 0 && bArr[i15 - 1] == 0) {
            i15--;
        }
        if (i15 > 0) {
            this.f81804c.a(new w7.c0(bArr, i15));
        }
        return true;
    }

    @Override // y7.f
    public Uri c() {
        return this.f81802a.c();
    }

    @Override // y7.f
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // y7.f
    public Map<String, List<String>> f() {
        return this.f81802a.f();
    }

    @Override // y7.f
    public long i(y7.j jVar) {
        throw new UnsupportedOperationException();
    }

    @Override // y7.f
    public void m(y7.x xVar) {
        zj.p.q(xVar);
        this.f81802a.m(xVar);
    }

    @Override // t7.h
    public int read(byte[] bArr, int i15, int i16) {
        if (this.f81806e == 0) {
            if (!q()) {
                return -1;
            }
            this.f81806e = this.f81803b;
        }
        int i17 = this.f81802a.read(bArr, i15, Math.min(this.f81806e, i16));
        if (i17 != -1) {
            this.f81806e -= i17;
        }
        return i17;
    }
}
