package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.logging.Level;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes4.dex */
final class yn0 implements Runnable, jp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eo0 f34417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final kp0 f34418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f34419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ao0 f34420d;

    yn0(ao0 ao0Var, kp0 kp0Var) {
        Objects.requireNonNull(ao0Var);
        this.f34420d = ao0Var;
        this.f34417a = new eo0(Level.FINE, ao0.class);
        this.f34419c = true;
        this.f34418b = kp0Var;
    }

    @Override // com.google.android.libraries.places.internal.jp0
    public final void S(int i15, ip0 ip0Var) {
        boolean z15 = true;
        this.f34417a.c(1, i15, ip0Var);
        l90 l90VarF = ao0.a0(ip0Var).f("Rst Stream");
        if (l90VarF.g() != i90.CANCELLED && l90VarF.g() != i90.DEADLINE_EXCEEDED) {
            z15 = false;
        }
        boolean z16 = z15;
        ao0 ao0Var = this.f34420d;
        synchronized (ao0Var.p()) {
            try {
                rn0 rn0Var = (rn0) ao0Var.q().get(Integer.valueOf(i15));
                if (rn0Var != null) {
                    rn0Var.J().O();
                    int i16 = fr0.f32341a;
                    ao0Var.X(i15, l90VarF, ip0Var == ip0.REFUSED_STREAM ? hb0.REFUSED : hb0.PROCESSED, z16, null, null);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.jp0
    public final void T(boolean z15, xp0 xp0Var) {
        boolean zA;
        this.f34417a.e(1, xp0Var);
        ao0 ao0Var = this.f34420d;
        synchronized (ao0Var.p()) {
            try {
                if (xp0Var.b(4)) {
                    ao0Var.E(xp0Var.c(4));
                }
                if (xp0Var.b(7)) {
                    zA = ao0Var.o().a(xp0Var.c(7));
                } else {
                    zA = false;
                }
                if (this.f34419c) {
                    gi0 gi0VarM = ao0Var.m();
                    b40 b40VarW = ao0Var.w();
                    gi0VarM.c(b40VarW);
                    ao0Var.x(b40VarW);
                    ao0Var.m().zzb();
                    this.f34419c = false;
                }
                ao0Var.n().J2(xp0Var);
                if (zA) {
                    ao0Var.o().f();
                }
                ao0Var.b0();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.jp0
    public final void U(boolean z15, boolean z16, int i15, int i16, List list, int i17) {
        boolean z17 = true;
        this.f34417a.b(1, i15, list, z16);
        ao0 ao0Var = this.f34420d;
        l90 l90VarE = null;
        if (ao0Var.J() != Integer.MAX_VALUE) {
            long jS = 0;
            for (int i18 = 0; i18 < list.size(); i18++) {
                mp0 mp0Var = (mp0) list.get(i18);
                jS += (long) (mp0Var.f32983a.s() + 32 + mp0Var.f32984b.s());
            }
            int iMin = (int) Math.min(jS, 2147483647L);
            if (iMin > ao0Var.J()) {
                l90VarE = l90.f32812j.e(String.format(Locale.US, "Response %s metadata larger than %d: %d", true != z16 ? "header" : "trailer", Integer.valueOf(ao0Var.J()), Integer.valueOf(iMin)));
            }
        }
        synchronized (ao0Var.p()) {
            try {
                rn0 rn0Var = (rn0) ao0Var.q().get(Integer.valueOf(i15));
                if (rn0Var == null) {
                    if (ao0Var.Y(i15)) {
                        ao0Var.n().S(i15, ip0.STREAM_CLOSED);
                    }
                } else if (l90VarE == null) {
                    rn0Var.J().O();
                    int i19 = fr0.f32341a;
                    rn0Var.J().M(list, z16);
                } else {
                    if (!z16) {
                        ao0Var.n().S(i15, ip0.CANCEL);
                    }
                    rn0Var.J().z(l90VarE, hb0.PROCESSED, false, new a80());
                }
                z17 = false;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (z17) {
            ao0 ao0Var2 = this.f34420d;
            ip0 ip0Var = ip0.PROTOCOL_ERROR;
            StringBuilder sb5 = new StringBuilder(String.valueOf(i15).length() + 36);
            sb5.append("Received header for unknown stream: ");
            sb5.append(i15);
            ao0Var2.d0(ip0Var, sb5.toString());
        }
    }

    @Override // com.google.android.libraries.places.internal.jp0
    public final void V(boolean z15, int i15, int i16) {
        this.f34417a.f(1, (((long) i15) << 32) | (((long) i16) & BodyPartID.bodyIdMax));
        if (!z15) {
            ao0 ao0Var = this.f34420d;
            synchronized (ao0Var.p()) {
                ao0Var.n().A1(true, i15, i16);
            }
            return;
        }
        ao0 ao0Var2 = this.f34420d;
        synchronized (ao0Var2.p()) {
            ao0Var2.z();
            ao0.Q.logp(Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "ping", "Received unexpected ping ack. No ping outstanding");
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.libraries.places.internal.jp0
    public final void W(int i15, long j15) {
        boolean z15 = true;
        this.f34417a.j(1, i15, j15);
        ao0 ao0Var = this.f34420d;
        synchronized (ao0Var.p()) {
            try {
                if (i15 == 0) {
                    ao0Var.o().b(null, (int) j15);
                    return;
                }
                rn0 rn0Var = (rn0) ao0Var.q().get(Integer.valueOf(i15));
                if (rn0Var == null) {
                    if (ao0Var.Y(i15)) {
                    }
                    if (z15) {
                        ao0 ao0Var2 = this.f34420d;
                        ip0 ip0Var = ip0.PROTOCOL_ERROR;
                        StringBuilder sb5 = new StringBuilder(String.valueOf(i15).length() + 43);
                        sb5.append("Received window_update for unknown stream: ");
                        sb5.append(i15);
                        ao0Var2.d0(ip0Var, sb5.toString());
                    }
                }
                ao0Var.o().b(rn0Var.J().Q(), (int) j15);
                z15 = false;
                if (z15) {
                    ao0 ao0Var3 = this.f34420d;
                    ip0 ip0Var2 = ip0.PROTOCOL_ERROR;
                    StringBuilder sb6 = new StringBuilder(String.valueOf(i15).length() + 43);
                    sb6.append("Received window_update for unknown stream: ");
                    sb6.append(i15);
                    ao0Var3.d0(ip0Var2, sb6.toString());
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.jp0
    public final void X(boolean z15, int i15, pr0 pr0Var, int i16, int i17) {
        this.f34417a.a(1, i15, pr0Var.d(), i16, z15);
        ao0 ao0Var = this.f34420d;
        rn0 rn0VarZ = ao0Var.Z(i15);
        if (rn0VarZ != null) {
            long j15 = i16;
            pr0Var.c2(j15);
            nr0 nr0Var = new nr0();
            nr0Var.q1(pr0Var.d(), j15);
            rn0VarZ.J().O();
            int i18 = fr0.f32341a;
            synchronized (this.f34420d.p()) {
                rn0VarZ.J().N(nr0Var, z15, i17 - i16);
            }
        } else {
            if (!ao0Var.Y(i15)) {
                ao0 ao0Var2 = this.f34420d;
                ip0 ip0Var = ip0.PROTOCOL_ERROR;
                StringBuilder sb5 = new StringBuilder(String.valueOf(i15).length() + 34);
                sb5.append("Received data for unknown stream: ");
                sb5.append(i15);
                ao0Var2.d0(ip0Var, sb5.toString());
                return;
            }
            synchronized (ao0Var.p()) {
                ao0Var.n().S(i15, ip0.STREAM_CLOSED);
            }
            pr0Var.e1(i16);
        }
        ao0 ao0Var3 = this.f34420d;
        ao0Var3.t(ao0Var3.s() + i17);
        if (ao0Var3.s() >= ao0Var3.k() * 0.5f) {
            synchronized (ao0Var3.p()) {
                ao0Var3.n().G2(0, ao0Var3.s());
            }
            this.f34420d.t(0);
        }
    }

    @Override // com.google.android.libraries.places.internal.jp0
    public final void Y(int i15, int i16, List list) {
        this.f34417a.h(1, i15, i16, list);
        ao0 ao0Var = this.f34420d;
        synchronized (ao0Var.p()) {
            ao0Var.n().S(i15, ip0.PROTOCOL_ERROR);
        }
    }

    @Override // com.google.android.libraries.places.internal.jp0
    public final void Z(int i15, ip0 ip0Var, rr0 rr0Var) {
        this.f34417a.i(1, i15, ip0Var, rr0Var);
        if (ip0Var == ip0.ENHANCE_YOUR_CALM) {
            String strK = rr0Var.k();
            boolean z15 = ao0.R;
            ao0.Q.logp(Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "goAway", String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", this, strK));
            if ("too_many_pings".equals(strK)) {
                this.f34420d.I().run();
            }
        }
        l90 l90VarF = xe0.e(ip0Var.f32605a).f("Received Goaway");
        if (rr0Var.s() > 0) {
            l90VarF = l90VarF.f(rr0Var.k());
        }
        this.f34420d.e0(i15, null, l90VarF);
    }

    @Override // java.lang.Runnable
    public final void run() {
        l90 l90VarY;
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName("OkHttpClientTransport");
        while (this.f34418b.E1(this)) {
            try {
                this.f34420d.H();
            } catch (Throwable th4) {
                try {
                    this.f34420d.e0(0, ip0.PROTOCOL_ERROR, l90.f32814l.e("error in frame handler").d(th4));
                } catch (Throwable th5) {
                    try {
                        this.f34418b.close();
                    } catch (IOException e15) {
                        ao0.Q.logp(Level.INFO, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "run", "Exception closing frame reader", (Throwable) e15);
                    } catch (RuntimeException e16) {
                        if (!"bio == null".equals(e16.getMessage())) {
                            throw e16;
                        }
                    }
                    this.f34420d.m().d();
                    Thread.currentThread().setName(name);
                    throw th5;
                }
            }
        }
        ao0 ao0Var = this.f34420d;
        synchronized (ao0Var.p()) {
            l90VarY = ao0Var.y();
        }
        if (l90VarY == null) {
            l90VarY = l90.f32815m.e("End of stream or IOException");
        }
        this.f34420d.e0(0, ip0.INTERNAL_ERROR, l90VarY);
        try {
            this.f34418b.close();
        } catch (IOException e17) {
            ao0.Q.logp(Level.INFO, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "run", "Exception closing frame reader", (Throwable) e17);
        } catch (RuntimeException e18) {
            if (!"bio == null".equals(e18.getMessage())) {
                throw e18;
            }
        }
        this.f34420d.m().d();
        Thread.currentThread().setName(name);
    }
}
