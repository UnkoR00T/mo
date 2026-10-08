package j9;

import ak.n0;
import java.util.Arrays;
import java.util.List;
import o8.v0;
import t7.p;
import t7.v;
import w7.c0;

/* JADX INFO: loaded from: classes3.dex */
final class h extends i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f100375o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte[] f100376p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f100377n;

    h() {
    }

    private static boolean n(c0 c0Var, byte[] bArr) {
        if (c0Var.a() < bArr.length) {
            return false;
        }
        int iG = c0Var.g();
        byte[] bArr2 = new byte[bArr.length];
        c0Var.u(bArr2, 0, bArr.length);
        c0Var.f0(iG);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean o(c0 c0Var) {
        return n(c0Var, f100375o);
    }

    @Override // j9.i
    protected long f(c0 c0Var) {
        return c(x7.i.e(c0Var.f()));
    }

    @Override // j9.i
    protected boolean i(c0 c0Var, long j15, i.b bVar) {
        if (n(c0Var, f100375o)) {
            byte[] bArrCopyOf = Arrays.copyOf(c0Var.f(), c0Var.j());
            int iC = x7.i.c(bArrCopyOf);
            List<byte[]> listA = x7.i.a(bArrCopyOf);
            if (bVar.f100391a != null) {
                return true;
            }
            bVar.f100391a = new p.b().X("audio/ogg").A0("audio/opus").U(iC).B0(48000).l0(listA).Q();
            return true;
        }
        byte[] bArr = f100376p;
        if (!n(c0Var, bArr)) {
            zj.p.q(bVar.f100391a);
            return false;
        }
        zj.p.q(bVar.f100391a);
        if (this.f100377n) {
            return true;
        }
        this.f100377n = true;
        c0Var.g0(bArr.length);
        v vVarD = v0.d(n0.w(v0.k(c0Var, false, false).f143209b));
        if (vVarD == null) {
            return true;
        }
        bVar.f100391a = bVar.f100391a.b().s0(vVarD.b(bVar.f100391a.f188377l)).Q();
        return true;
    }

    @Override // j9.i
    protected void l(boolean z15) {
        super.l(z15);
        if (z15) {
            this.f100377n = false;
        }
    }
}
