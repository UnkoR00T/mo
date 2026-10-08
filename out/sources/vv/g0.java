package vv;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\u0017B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B1\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0002\u0010\fJ\r\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u001d\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0016\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006#"}, d2 = {"Lvv/g0;", "", "<init>", "()V", "", "data", "", "pos", "limit", "", "shared", "owner", "([BIIZZ)V", "d", "()Lvv/g0;", "b", "segment", "c", "(Lvv/g0;)Lvv/g0;", "byteCount", "e", "(I)Lvv/g0;", "Loq/i0;", "a", "sink", "f", "(Lvv/g0;I)V", "[B", "I", "Z", "Lvv/g0;", "next", "g", "prev", "h", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final byte[] data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int pos;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int limit;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean shared;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean owner;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public g0 next;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public g0 prev;

    public g0() {
        this.data = new byte[PKIFailureInfo.certRevoked];
        this.owner = true;
        this.shared = false;
    }

    public final void a() {
        g0 g0Var = this.prev;
        if (g0Var == this) {
            throw new IllegalStateException("cannot compact");
        }
        if (g0Var.owner) {
            int i15 = this.limit - this.pos;
            if (i15 > (8192 - g0Var.limit) + (g0Var.shared ? 0 : g0Var.pos)) {
                return;
            }
            f(g0Var, i15);
            b();
            h0.b(this);
        }
    }

    public final g0 b() {
        g0 g0Var = this.next;
        g0 g0Var2 = g0Var != this ? g0Var : null;
        g0 g0Var3 = this.prev;
        g0Var3.next = g0Var;
        this.next.prev = g0Var3;
        this.next = null;
        this.prev = null;
        return g0Var2;
    }

    public final g0 c(g0 segment) {
        segment.prev = this;
        segment.next = this.next;
        this.next.prev = segment;
        this.next = segment;
        return segment;
    }

    public final g0 d() {
        this.shared = true;
        return new g0(this.data, this.pos, this.limit, true, false);
    }

    public final g0 e(int byteCount) {
        g0 g0VarC;
        if (byteCount <= 0 || byteCount > this.limit - this.pos) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (byteCount >= 1024) {
            g0VarC = d();
        } else {
            g0VarC = h0.c();
            byte[] bArr = this.data;
            byte[] bArr2 = g0VarC.data;
            int i15 = this.pos;
            pq.n.o(bArr, bArr2, 0, i15, i15 + byteCount, 2, null);
        }
        g0VarC.limit = g0VarC.pos + byteCount;
        this.pos += byteCount;
        this.prev.c(g0VarC);
        return g0VarC;
    }

    public final void f(g0 sink, int byteCount) {
        if (!sink.owner) {
            throw new IllegalStateException("only owner can write");
        }
        int i15 = sink.limit;
        if (i15 + byteCount > 8192) {
            if (sink.shared) {
                throw new IllegalArgumentException();
            }
            int i16 = sink.pos;
            if ((i15 + byteCount) - i16 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.data;
            pq.n.o(bArr, bArr, 0, i16, i15, 2, null);
            sink.limit -= sink.pos;
            sink.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = sink.data;
        int i17 = sink.limit;
        int i18 = this.pos;
        pq.n.i(bArr2, bArr3, i17, i18, i18 + byteCount);
        sink.limit += byteCount;
        this.pos += byteCount;
    }

    public g0(byte[] bArr, int i15, int i16, boolean z15, boolean z16) {
        this.data = bArr;
        this.pos = i15;
        this.limit = i16;
        this.shared = z15;
        this.owner = z16;
    }
}
