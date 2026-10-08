package com.google.android.libraries.places.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class ze0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f34493a = Logger.getLogger(ze0.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f34494b = Collections.unmodifiableSet(EnumSet.of(i90.OK, i90.INVALID_ARGUMENT, i90.NOT_FOUND, i90.ALREADY_EXISTS, i90.FAILED_PRECONDITION, i90.ABORTED, i90.OUT_OF_RANGE, i90.DATA_LOSS));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w70 f34495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w70 f34496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w70 f34497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final w70 f34498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final w70 f34499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final w70 f34500h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final w70 f34501i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final w70 f34502j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final w70 f34503k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f34504l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d90 f34505m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final e40 f34506n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final s40 f34507o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final em0 f34508p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final em0 f34509q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final zj.w f34510r;

    static {
        Charset.forName("US-ASCII");
        f34495c = w70.c("grpc-timeout", new ye0());
        v70 v70Var = a80.f31574d;
        f34496d = w70.c("grpc-encoding", v70Var);
        f34497e = p60.a("grpc-accept-encoding", new we0(null));
        f34498f = w70.c("content-encoding", v70Var);
        f34499g = p60.a("accept-encoding", new we0(null));
        f34500h = w70.c("content-length", v70Var);
        f34501i = w70.c("content-type", v70Var);
        f34502j = w70.c("te", v70Var);
        f34503k = w70.c("user-agent", v70Var);
        zj.t.e(',').j();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f34504l = timeUnit.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        timeUnit.toNanos(20L);
        f34505m = new rj0();
        f34506n = e40.a("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        f34507o = new re0();
        f34508p = new te0();
        f34509q = new ue0();
        f34510r = new ve0();
    }

    private ze0() {
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0029  */
    /* JADX WARN: Code duplicated, block: B:25:0x0035  */
    public static l90 a(int i15) {
        i90 i90Var;
        if ((i15 >= 100 && i15 < 200) || i15 == 400) {
            i90Var = i90.INTERNAL;
        } else if (i15 == 401) {
            i90Var = i90.UNAUTHENTICATED;
        } else if (i15 == 403) {
            i90Var = i90.PERMISSION_DENIED;
        } else if (i15 == 404) {
            i90Var = i90.UNIMPLEMENTED;
        } else if (i15 == 429) {
            i90Var = i90.UNAVAILABLE;
        } else if (i15 != 431) {
            switch (i15) {
                case 502:
                case 503:
                case 504:
                    i90Var = i90.UNAVAILABLE;
                    break;
                default:
                    i90Var = i90.UNKNOWN;
                    break;
            }
        } else {
            i90Var = i90.INTERNAL;
        }
        l90 l90VarB = i90Var.b();
        StringBuilder sb5 = new StringBuilder(String.valueOf(i15).length() + 17);
        sb5.append("HTTP status code ");
        sb5.append(i15);
        return l90VarB.e(sb5.toString());
    }

    public static URI b(String str) {
        String str2;
        zj.p.r(str, "authority");
        try {
            str2 = str;
            try {
                return new URI(null, str2, null, null, null);
            } catch (URISyntaxException e15) {
                e = e15;
                throw new IllegalArgumentException("Invalid authority: ".concat(String.valueOf(str2)), e);
            }
        } catch (URISyntaxException e16) {
            e = e16;
            str2 = str;
        }
    }

    public static String c(String str, int i15) {
        String str2;
        try {
            str2 = str;
            try {
                return new URI(null, null, str2, 443, null, null, null).getAuthority();
            } catch (URISyntaxException e15) {
                e = e15;
                URISyntaxException uRISyntaxException = e;
                StringBuilder sb5 = new StringBuilder(str2.length() + 26);
                sb5.append("Invalid host or port: ");
                sb5.append(str2);
                sb5.append(" 443");
                throw new IllegalArgumentException(sb5.toString(), uRISyntaxException);
            }
        } catch (URISyntaxException e16) {
            e = e16;
            str2 = str;
        }
    }

    public static ThreadFactory d(String str, boolean z15) {
        return new com.google.common.util.concurrent.z().e(true).f(str).b();
    }

    static jb0 e(b70 b70Var, boolean z15) {
        f70 f70VarE = b70Var.e();
        jb0 jb0VarZza = f70VarE != null ? ((pm0) f70VarE.e()).zza() : null;
        if (jb0VarZza != null) {
            return jb0VarZza;
        }
        if (!b70Var.f().j()) {
            if (b70Var.g()) {
                return new fe0(i(b70Var.f()), hb0.DROPPED);
            }
            if (!z15) {
                return new fe0(i(b70Var.f()), hb0.PROCESSED);
            }
        }
        return null;
    }

    public static s40[] f(f40 f40Var, a80 a80Var, int i15, boolean z15, boolean z16) {
        List listG = f40Var.g();
        int size = listG.size();
        s40[] s40VarArr = new s40[size + 1];
        q40 q40VarA = r40.a();
        q40VarA.a(f40Var);
        q40VarA.b(i15);
        q40VarA.c(z15);
        q40VarA.d(z16);
        r40 r40VarE = q40VarA.e();
        for (int i16 = 0; i16 < listG.size(); i16++) {
            s40VarArr[i16] = ((p40) listG.get(i16)).a(r40VarE, a80Var);
        }
        s40VarArr[size] = f34507o;
        return s40VarArr;
    }

    static void g(km0 km0Var) {
        while (true) {
            InputStream inputStreamZza = km0Var.zza();
            if (inputStreamZza == null) {
                return;
            } else {
                h(inputStreamZza);
            }
        }
    }

    public static void h(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e15) {
            f34493a.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (Throwable) e15);
        }
    }

    public static l90 i(l90 l90Var) {
        zj.p.d(l90Var != null);
        if (!f34494b.contains(l90Var.g())) {
            return l90Var;
        }
        l90 l90Var2 = l90.f32814l;
        String strValueOf = String.valueOf(l90Var.g());
        String strH = l90Var.h();
        StringBuilder sb5 = new StringBuilder(strValueOf.length() + 47 + String.valueOf(strH).length());
        sb5.append("Inappropriate status code from control plane: ");
        sb5.append(strValueOf);
        sb5.append(" ");
        sb5.append(strH);
        return l90Var2.e(sb5.toString()).d(l90Var.i());
    }
}
