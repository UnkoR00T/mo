package com.google.android.libraries.places.internal;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public final class l90 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f32806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l90 f32807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l90 f32808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l90 f32809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l90 f32810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l90 f32811i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l90 f32812j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l90 f32813k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l90 f32814l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l90 f32815m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final w70 f32816n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final z70 f32817o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final w70 f32818p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i90 f32819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Throwable f32821c;

    static {
        TreeMap treeMap = new TreeMap();
        i90[] i90VarArrValues = i90.values();
        int length = i90VarArrValues.length;
        boolean z15 = false;
        int i15 = 0;
        while (true) {
            byte[] bArr = null;
            if (i15 >= length) {
                f32806d = Collections.unmodifiableList(new ArrayList(treeMap.values()));
                f32807e = i90.OK.b();
                f32808f = i90.CANCELLED.b();
                f32809g = i90.UNKNOWN.b();
                i90.INVALID_ARGUMENT.b();
                f32810h = i90.DEADLINE_EXCEEDED.b();
                i90.NOT_FOUND.b();
                i90.ALREADY_EXISTS.b();
                f32811i = i90.PERMISSION_DENIED.b();
                i90.UNAUTHENTICATED.b();
                f32812j = i90.RESOURCE_EXHAUSTED.b();
                f32813k = i90.FAILED_PRECONDITION.b();
                i90.ABORTED.b();
                i90.OUT_OF_RANGE.b();
                i90.UNIMPLEMENTED.b();
                f32814l = i90.INTERNAL.b();
                f32815m = i90.UNAVAILABLE.b();
                i90.DATA_LOSS.b();
                j90 j90Var = new j90(bArr);
                int i16 = w70.f34127e;
                f32816n = new y70("grpc-status", z15, j90Var, bArr);
                k90 k90Var = new k90(null);
                f32817o = k90Var;
                f32818p = new y70("grpc-message", z15, k90Var, bArr);
                return;
            }
            i90 i90Var = i90VarArrValues[i15];
            l90 l90Var = (l90) treeMap.put(Integer.valueOf(i90Var.zza()), new l90(i90Var, null, null));
            if (l90Var != null) {
                String strName = l90Var.f32819a.name();
                String strName2 = i90Var.name();
                StringBuilder sb5 = new StringBuilder(String.valueOf(strName).length() + 34 + String.valueOf(strName2).length());
                sb5.append("Code value duplication between ");
                sb5.append(strName);
                sb5.append(" & ");
                sb5.append(strName2);
                throw new IllegalStateException(sb5.toString());
            }
            i15++;
        }
    }

    private l90(i90 i90Var, String str, Throwable th4) {
        this.f32819a = (i90) zj.p.r(i90Var, "code");
        this.f32820b = str;
        this.f32821c = th4;
    }

    public static l90 a(int i15) {
        if (i15 >= 0) {
            List list = f32806d;
            if (i15 < list.size()) {
                return (l90) list.get(i15);
            }
        }
        l90 l90Var = f32809g;
        StringBuilder sb5 = new StringBuilder(String.valueOf(i15).length() + 13);
        sb5.append("Unknown code ");
        sb5.append(i15);
        return l90Var.e(sb5.toString());
    }

    public static l90 b(Throwable th4) {
        for (Throwable cause = (Throwable) zj.p.r(th4, "t"); cause != null; cause = cause.getCause()) {
            if (cause instanceof m90) {
                return ((m90) cause).a();
            }
            if (cause instanceof p90) {
                return ((p90) cause).a();
            }
        }
        return f32809g.d(th4);
    }

    static String c(l90 l90Var) {
        String str = l90Var.f32820b;
        i90 i90Var = l90Var.f32819a;
        if (str == null) {
            return i90Var.toString();
        }
        String strValueOf = String.valueOf(i90Var);
        StringBuilder sb5 = new StringBuilder(strValueOf.length() + 2 + str.length());
        sb5.append(strValueOf);
        sb5.append(": ");
        sb5.append(str);
        return sb5.toString();
    }

    static /* synthetic */ l90 k(byte[] bArr) {
        int i15;
        byte b15;
        int length = bArr.length;
        char c15 = 0;
        if (length == 1) {
            if (bArr[0] == 48) {
                return f32807e;
            }
            length = 1;
        }
        if (length != 1) {
            if (length == 2 && (b15 = bArr[0]) >= 48 && b15 <= 57) {
                i15 = (b15 - 48) * 10;
                c15 = 1;
            }
            return f32809g.e("Unknown code ".concat(new String(bArr, StandardCharsets.US_ASCII)));
        }
        i15 = 0;
        byte b16 = bArr[c15];
        if (b16 >= 48 && b16 <= 57) {
            int i16 = i15 + (b16 - 48);
            List list = f32806d;
            if (i16 < list.size()) {
                return (l90) list.get(i16);
            }
        }
        return f32809g.e("Unknown code ".concat(new String(bArr, StandardCharsets.US_ASCII)));
    }

    public final l90 d(Throwable th4) {
        return zj.l.a(this.f32821c, th4) ? this : new l90(this.f32819a, this.f32820b, th4);
    }

    public final l90 e(String str) {
        return zj.l.a(this.f32820b, str) ? this : new l90(this.f32819a, str, this.f32821c);
    }

    public final l90 f(String str) {
        String str2 = this.f32820b;
        if (str2 == null) {
            return new l90(this.f32819a, str, this.f32821c);
        }
        i90 i90Var = this.f32819a;
        StringBuilder sb5 = new StringBuilder(str2.length() + 1 + str.length());
        sb5.append(str2);
        sb5.append("\n");
        sb5.append(str);
        return new l90(i90Var, sb5.toString(), this.f32821c);
    }

    public final i90 g() {
        return this.f32819a;
    }

    public final String h() {
        return this.f32820b;
    }

    public final Throwable i() {
        return this.f32821c;
    }

    public final boolean j() {
        return i90.OK == this.f32819a;
    }

    public final String toString() {
        zj.j.b bVarD = zj.j.c(this).d("code", this.f32819a.name()).d("description", this.f32820b);
        Throwable th4 = this.f32821c;
        Object objE = th4;
        if (th4 != null) {
            objE = zj.z.e(th4);
        }
        return bVarD.d("cause", objE).toString();
    }
}
