package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class mm0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p70 f32961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p70 f32962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p70 f32963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final q70 f32964e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i80 f32965a;

    static {
        h80 h80VarA = h80.a();
        f32961b = h80VarA.c("grpc.subchannel.disconnections", "EXPERIMENTAL. Number of times the selected subchannel becomes disconnected", "{disconnection}", ak.a1.i("grpc.target"), ak.a1.i("grpc.lb.backend_service", "grpc.lb.locality", "grpc.disconnect_error"), false);
        f32962c = h80VarA.c("grpc.subchannel.connection_attempts_succeeded", "EXPERIMENTAL. Number of successful connection attempts", "{attempt}", ak.a1.i("grpc.target"), ak.a1.i("grpc.lb.backend_service", "grpc.lb.locality"), false);
        f32963d = h80VarA.c("grpc.subchannel.connection_attempts_failed", "EXPERIMENTAL. Number of failed connection attempts", "{attempt}", ak.a1.i("grpc.target"), ak.a1.i("grpc.lb.backend_service", "grpc.lb.locality"), false);
        f32964e = h80VarA.d("grpc.subchannel.open_connections", "EXPERIMENTAL. Number of open connections.", "{connection}", ak.a1.i("grpc.target"), ak.a1.i("grpc.security_level", "grpc.lb.backend_service", "grpc.lb.locality"), false);
    }

    public mm0(i80 i80Var) {
        this.f32965a = i80Var;
    }

    public final void a(String str, String str2, String str3, String str4) {
        i80 i80Var = this.f32965a;
        i80Var.b(f32962c, 1L, ak.n0.E(str), ak.n0.F(str2, str3));
        i80Var.a(f32964e, 1L, ak.n0.E(str), ak.n0.G(str4, str2, str3));
    }

    public final void b(String str, String str2, String str3) {
        this.f32965a.b(f32963d, 1L, ak.n0.E(str), ak.n0.F(str2, str3));
    }

    public final void c(String str, String str2, String str3, String str4, String str5) {
        i80 i80Var = this.f32965a;
        i80Var.b(f32961b, 1L, ak.n0.E(str), ak.n0.G(str2, str3, str4));
        i80Var.a(f32964e, -1L, ak.n0.E(str), ak.n0.G(str5, str2, str3));
    }
}
