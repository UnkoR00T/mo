package g8;

import a8.a3;
import a8.y1;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import h8.c0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import t7.p;
import t7.v;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends a8.b implements Handler.Callback {
    private x8.a A;
    private boolean B;
    private boolean C;
    private long D;
    private v E;
    private long F;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final a f71173v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final b f71174w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Handler f71175x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final x8.b f71176y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final boolean f71177z;

    public c(b bVar, Looper looper) {
        this(bVar, looper, a.f71172a);
    }

    private void A0() {
        if (this.B || this.E != null) {
            return;
        }
        this.f71176y.l();
        y1 y1VarY = Y();
        int iS0 = s0(y1VarY, this.f71176y, 0);
        if (iS0 != -4) {
            if (iS0 == -5) {
                this.D = ((p) zj.p.q(y1VarY.f4794b)).f188386u;
                return;
            }
            return;
        }
        if (this.f71176y.p()) {
            this.B = true;
            return;
        }
        if (this.f71176y.f233230f >= a0()) {
            x8.b bVar = this.f71176y;
            bVar.f217303k = this.D;
            bVar.y();
            v vVarA = ((x8.a) o0.h(this.A)).a(this.f71176y);
            if (vVarA != null) {
                ArrayList arrayList = new ArrayList(vVarA.j());
                v0(vVarA, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.E = new v(w0(this.f71176y.f233230f), arrayList);
            }
        }
    }

    private void v0(v vVar, List<v.a> list) {
        for (int i15 = 0; i15 < vVar.j(); i15++) {
            p pVarA = vVar.e(i15).a();
            if (pVarA == null || !this.f71173v.a(pVarA)) {
                list.add(vVar.e(i15));
            } else {
                x8.a aVarB = this.f71173v.b(pVarA);
                byte[] bArr = (byte[]) zj.p.q(vVar.e(i15).b());
                this.f71176y.l();
                this.f71176y.x(bArr.length);
                ((ByteBuffer) o0.h(this.f71176y.f233228d)).put(bArr);
                this.f71176y.y();
                v vVarA = aVarB.a(this.f71176y);
                if (vVarA != null) {
                    v0(vVarA, list);
                }
            }
        }
    }

    private long w0(long j15) {
        zj.p.w(j15 != -9223372036854775807L);
        zj.p.w(this.F != -9223372036854775807L);
        return j15 - this.F;
    }

    private void x0(v vVar) {
        Handler handler = this.f71175x;
        if (handler != null) {
            handler.obtainMessage(1, vVar).sendToTarget();
        } else {
            y0(vVar);
        }
    }

    private void y0(v vVar) {
        this.f71174w.A(vVar);
    }

    private boolean z0(long j15) {
        boolean z15;
        v vVar = this.E;
        if (vVar == null || (!this.f71177z && vVar.f188642b > w0(j15))) {
            z15 = false;
        } else {
            x0(this.E);
            this.E = null;
            z15 = true;
        }
        if (this.B && this.E == null) {
            this.C = true;
        }
        return z15;
    }

    @Override // a8.a3
    public int a(p pVar) {
        if (this.f71173v.a(pVar)) {
            return a3.y(pVar.Q == 0 ? 4 : 2);
        }
        return a3.y(0);
    }

    @Override // a8.z2
    public boolean e() {
        return this.C;
    }

    @Override // a8.z2
    public boolean f() {
        return true;
    }

    @Override // a8.z2, a8.a3
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // a8.z2
    public void h(long j15, long j16) {
        boolean zZ0 = true;
        while (zZ0) {
            A0();
            zZ0 = z0(j15);
        }
    }

    @Override // a8.b
    protected void h0() {
        this.E = null;
        this.A = null;
        this.F = -9223372036854775807L;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        y0((v) message.obj);
        return true;
    }

    @Override // a8.b
    protected void k0(long j15, boolean z15, boolean z16) {
        this.E = null;
        this.B = false;
        this.C = false;
    }

    @Override // a8.b
    protected void q0(p[] pVarArr, long j15, long j16, c0.b bVar) {
        this.A = this.f71173v.b(pVarArr[0]);
        v vVar = this.E;
        if (vVar != null) {
            this.E = vVar.c((vVar.f188642b + this.F) - j16);
        }
        this.F = j16;
    }

    public c(b bVar, Looper looper, a aVar) {
        this(bVar, looper, aVar, false);
    }

    public c(b bVar, Looper looper, a aVar, boolean z15) {
        super(5);
        this.f71174w = (b) zj.p.q(bVar);
        this.f71175x = looper == null ? null : o0.y(looper, this);
        this.f71173v = (a) zj.p.q(aVar);
        this.f71177z = z15;
        this.f71176y = new x8.b();
        this.F = -9223372036854775807L;
    }
}
