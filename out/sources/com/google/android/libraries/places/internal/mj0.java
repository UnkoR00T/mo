package com.google.android.libraries.places.internal;

import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
final class mj0 extends i70 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final z60 f32950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f70 f32951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b50 f32952h = b50.IDLE;

    mj0(z60 z60Var) {
        this.f32950f = (z60) zj.p.r(z60Var, "helper");
    }

    private final void g(b50 b50Var, g70 g70Var) {
        this.f32952h = b50Var;
        this.f32950f.b(b50Var, g70Var);
    }

    @Override // com.google.android.libraries.places.internal.i70
    public final l90 a(e70 e70Var) {
        Boolean bool;
        List listC = e70Var.c();
        if (listC.isEmpty()) {
            l90 l90Var = l90.f32815m;
            String strValueOf = String.valueOf(e70Var.c());
            String strValueOf2 = String.valueOf(e70Var.d());
            StringBuilder sb5 = new StringBuilder(strValueOf.length() + 55 + strValueOf2.length());
            sb5.append("NameResolver returned no usable address. addrs=");
            sb5.append(strValueOf);
            sb5.append(", attrs=");
            sb5.append(strValueOf2);
            l90 l90VarE = l90Var.e(sb5.toString());
            b(l90VarE);
            return l90VarE;
        }
        if ((e70Var.e() instanceof jj0) && (bool = ((jj0) e70Var.e()).f32660a) != null && bool.booleanValue()) {
            listC = hj0.f(listC, new Random());
        }
        f70 f70Var = this.f32951g;
        if (f70Var == null) {
            z60 z60Var = this.f32950f;
            u60 u60VarD = w60.d();
            u60VarD.b(listC);
            f70 f70VarA = z60Var.a(u60VarD.c());
            f70VarA.a(new ij0(this, f70VarA));
            this.f32951g = f70VarA;
            g(b50.CONNECTING, new y60(b70.d()));
            f70VarA.c();
        } else {
            f70Var.d(listC);
        }
        return l90.f32807e;
    }

    @Override // com.google.android.libraries.places.internal.i70
    public final void b(l90 l90Var) {
        f70 f70Var = this.f32951g;
        if (f70Var != null) {
            f70Var.b();
            this.f32951g = null;
        }
        g(b50.TRANSIENT_FAILURE, new y60(b70.b(l90Var)));
    }

    @Override // com.google.android.libraries.places.internal.i70
    public final void c() {
        f70 f70Var = this.f32951g;
        if (f70Var != null) {
            f70Var.b();
        }
    }

    @Override // com.google.android.libraries.places.internal.i70
    public final void d() {
        f70 f70Var = this.f32951g;
        if (f70Var != null) {
            f70Var.c();
        }
    }

    final /* synthetic */ void e(f70 f70Var, c50 c50Var) {
        g70 y60Var;
        b50 b50VarC = c50Var.c();
        if (b50VarC == b50.SHUTDOWN) {
            return;
        }
        b50 b50Var = b50.TRANSIENT_FAILURE;
        if (b50VarC == b50Var || b50VarC == b50.IDLE) {
            this.f32950f.c();
        }
        if (this.f32952h == b50Var) {
            if (b50VarC == b50.CONNECTING) {
                return;
            }
            if (b50VarC == b50.IDLE) {
                d();
                return;
            }
        }
        int iOrdinal = b50VarC.ordinal();
        if (iOrdinal == 0) {
            y60Var = new y60(b70.d());
        } else if (iOrdinal == 1) {
            y60Var = new y60(b70.a(f70Var, null));
        } else if (iOrdinal == 2) {
            y60Var = new y60(b70.b(c50Var.d()));
        } else {
            if (iOrdinal != 3) {
                throw new IllegalArgumentException("Unsupported state:".concat(String.valueOf(b50VarC)));
            }
            y60Var = new lj0(this, null);
        }
        g(b50VarC, y60Var);
    }

    final /* synthetic */ z60 f() {
        return this.f32950f;
    }
}
