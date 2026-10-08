package e9;

import java.nio.ByteBuffer;
import t7.v;
import w7.b0;
import w7.c0;
import w7.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends x8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f48666a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b0 f48667b = new b0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k0 f48668c;

    @Override // x8.d
    protected v b(x8.b bVar, ByteBuffer byteBuffer) {
        v.a eVar;
        k0 k0Var = this.f48668c;
        if (k0Var == null || bVar.f217303k != k0Var.f()) {
            k0 k0Var2 = new k0(bVar.f233230f);
            this.f48668c = k0Var2;
            k0Var2.a(bVar.f233230f - bVar.f217303k);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f48666a.d0(bArrArray, iLimit);
        this.f48667b.o(bArrArray, iLimit);
        this.f48667b.r(39);
        long jH = (((long) this.f48667b.h(1)) << 32) | ((long) this.f48667b.h(32));
        this.f48667b.r(20);
        int iH = this.f48667b.h(12);
        int iH2 = this.f48667b.h(8);
        this.f48666a.g0(14);
        if (iH2 == 0) {
            eVar = new e();
        } else if (iH2 == 255) {
            eVar = a.d(this.f48666a, iH, jH);
        } else if (iH2 == 4) {
            eVar = f.d(this.f48666a);
        } else if (iH2 != 5) {
            eVar = iH2 != 6 ? null : g.d(this.f48666a, jH, this.f48668c);
        } else {
            eVar = d.d(this.f48666a, jH, this.f48668c);
        }
        return eVar == null ? new v(new v.a[0]) : new v(eVar);
    }
}
