package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class pi0 implements oe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oi0 f33323a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private wm0 f33325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33326d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final xm0 f33330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final im0 f33331i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f33332j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f33333k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f33335m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33324b = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private x40 f33327e = v40.f34024a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ni0 f33328f = new ni0(this, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ByteBuffer f33329g = ByteBuffer.allocate(5);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f33334l = -1;

    public pi0(oi0 oi0Var, xm0 xm0Var, im0 im0Var) {
        this.f33323a = (oi0) zj.p.r(oi0Var, "sink");
        this.f33330h = (xm0) zj.p.r(xm0Var, "bufferAllocator");
        this.f33331i = (im0) zj.p.r(im0Var, "statsTraceCtx");
    }

    private final void h(mi0 mi0Var, boolean z15) {
        int iB = mi0Var.b();
        int i15 = this.f33324b;
        if (i15 >= 0 && iB > i15) {
            throw new p90(l90.f32812j.e(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iB), Integer.valueOf(this.f33324b))), null);
        }
        ByteBuffer byteBuffer = this.f33329g;
        byteBuffer.clear();
        byteBuffer.put(z15 ? (byte) 1 : (byte) 0).putInt(iB);
        wm0 wm0VarB = this.f33330h.b(5);
        wm0VarB.b(byteBuffer.array(), 0, byteBuffer.position());
        if (iB == 0) {
            this.f33325c = wm0VarB;
            return;
        }
        oi0 oi0Var = this.f33323a;
        oi0Var.c(wm0VarB, false, false, this.f33333k - 1);
        this.f33333k = 1;
        List listH = mi0Var.h();
        for (int i16 = 0; i16 < listH.size() - 1; i16++) {
            oi0Var.c((wm0) listH.get(i16), false, false, 0);
        }
        this.f33325c = (wm0) listH.get(listH.size() - 1);
        this.f33335m = iB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int i(InputStream inputStream, OutputStream outputStream) {
        return ((o50) inputStream).b(outputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void f(byte[] bArr, int i15, int i16) {
        while (i16 > 0) {
            wm0 wm0Var = this.f33325c;
            if (wm0Var != null && wm0Var.a() == 0) {
                k(false, false);
            }
            if (this.f33325c == null) {
                zj.p.x(this.f33326d > 0, "knownLengthPendingAllocation reached 0");
                wm0 wm0VarB = this.f33330h.b(this.f33326d);
                this.f33325c = wm0VarB;
                int i17 = this.f33326d;
                this.f33326d = i17 - Math.min(i17, wm0VarB.a());
            }
            int iMin = Math.min(i16, this.f33325c.a());
            this.f33325c.b(bArr, i15, iMin);
            i15 += iMin;
            i16 -= iMin;
        }
    }

    private final void k(boolean z15, boolean z16) {
        wm0 wm0Var = this.f33325c;
        this.f33325c = null;
        this.f33323a.c(wm0Var, z15, z16, this.f33333k);
        this.f33333k = 0;
    }

    @Override // com.google.android.libraries.places.internal.oe0
    public final boolean a() {
        return this.f33332j;
    }

    @Override // com.google.android.libraries.places.internal.oe0
    public final void b(int i15) {
        zj.p.x(this.f33324b == -1, "max size already set");
        this.f33324b = i15;
    }

    @Override // com.google.android.libraries.places.internal.oe0
    public final void c() {
        if (this.f33332j) {
            return;
        }
        this.f33332j = true;
        wm0 wm0Var = this.f33325c;
        if (wm0Var != null && wm0Var.c() == 0) {
            this.f33325c = null;
        }
        k(true, true);
    }

    @Override // com.google.android.libraries.places.internal.oe0
    public final /* bridge */ /* synthetic */ oe0 d(x40 x40Var) {
        this.f33327e = (x40) zj.p.r(x40Var, "Can't pass an empty compressor");
        return this;
    }

    @Override // com.google.android.libraries.places.internal.oe0
    public final void e(InputStream inputStream) {
        int i15;
        if (this.f33332j) {
            throw new IllegalStateException("Framer already closed");
        }
        this.f33333k++;
        int i16 = this.f33334l + 1;
        this.f33334l = i16;
        this.f33335m = 0L;
        this.f33331i.f(i16);
        x40 x40Var = this.f33327e;
        w40 w40Var = v40.f34024a;
        try {
            int iAvailable = inputStream.available();
            if (iAvailable != 0 && x40Var != w40Var) {
                mi0 mi0Var = new mi0(this, null);
                OutputStream outputStreamA = this.f33327e.a(mi0Var);
                try {
                    i15 = i(inputStream, outputStreamA);
                    outputStreamA.close();
                    int i17 = this.f33324b;
                    if (i17 >= 0 && i15 > i17) {
                        throw new p90(l90.f32812j.e(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(i15), Integer.valueOf(this.f33324b))), null);
                    }
                    h(mi0Var, true);
                } catch (Throwable th4) {
                    outputStreamA.close();
                    throw th4;
                }
            } else if (iAvailable != -1) {
                this.f33335m = iAvailable;
                int i18 = this.f33324b;
                if (i18 >= 0 && iAvailable > i18) {
                    throw new p90(l90.f32812j.e(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iAvailable), Integer.valueOf(this.f33324b))), null);
                }
                ByteBuffer byteBuffer = this.f33329g;
                byteBuffer.clear();
                byteBuffer.put((byte) 0).putInt(iAvailable);
                this.f33326d = iAvailable + 5;
                f(byteBuffer.array(), 0, byteBuffer.position());
                i15 = i(inputStream, this.f33328f);
            } else {
                mi0 mi0Var2 = new mi0(this, null);
                i15 = i(inputStream, mi0Var2);
                h(mi0Var2, false);
            }
            if (iAvailable != -1 && i15 != iAvailable) {
                throw new p90(l90.f32814l.e(String.format("Message length inaccurate %s != %s", Integer.valueOf(i15), Integer.valueOf(iAvailable))), null);
            }
            im0 im0Var = this.f33331i;
            long j15 = i15;
            im0Var.j(j15);
            im0Var.k(this.f33335m);
            im0Var.h(this.f33334l, this.f33335m, j15);
        } catch (p90 e15) {
            throw e15;
        } catch (IOException e16) {
            throw new p90(l90.f32814l.e("Failed to frame message").d(e16), null);
        } catch (RuntimeException e17) {
            throw new p90(l90.f32814l.e("Failed to frame message").d(e17), null);
        }
    }

    final /* synthetic */ xm0 g() {
        return this.f33330h;
    }

    @Override // com.google.android.libraries.places.internal.oe0
    public final void zzb() {
        wm0 wm0Var = this.f33325c;
        if (wm0Var == null || wm0Var.c() <= 0) {
            return;
        }
        k(false, true);
    }
}
