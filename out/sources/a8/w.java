package a8;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends t7.y {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f4669k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f4670l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f4671m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t7.p f4672n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f4673p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h8.c0.b f4674q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final boolean f4675r;

    private w(int i15, Throwable th4, int i16) {
        this(i15, th4, null, i16, null, -1, null, 4, null, false);
    }

    public static w b(Throwable th4, String str, int i15, t7.p pVar, int i16, h8.c0.b bVar, boolean z15, int i17) {
        if (pVar == null) {
            i16 = 4;
        }
        return new w(1, th4, null, i17, str, i15, pVar, i16, bVar, z15);
    }

    public static w c(IOException iOException, int i15) {
        return new w(0, iOException, i15);
    }

    public static w d(RuntimeException runtimeException, int i15) {
        return new w(2, runtimeException, i15);
    }

    private static String e(int i15, String str, String str2, int i16, t7.p pVar, int i17) {
        String str3;
        if (i15 == 0) {
            str3 = "Source error";
        } else if (i15 != 1) {
            str3 = i15 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i16 + ", format=" + pVar + ", format_supported=" + w7.o0.X(i17);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    w a(h8.c0.b bVar) {
        return new w((String) w7.o0.h(getMessage()), getCause(), this.f188657a, this.f4669k, this.f4670l, this.f4671m, this.f4672n, this.f4673p, bVar, this.f188658b, this.f4675r);
    }

    private w(int i15, Throwable th4, String str, int i16, String str2, int i17, t7.p pVar, int i18, h8.c0.b bVar, boolean z15) {
        this(e(i15, str, str2, i17, pVar, i18), th4, i16, i15, str2, i17, pVar, i18, bVar, SystemClock.elapsedRealtime(), z15);
    }

    private w(String str, Throwable th4, int i15, int i16, String str2, int i17, t7.p pVar, int i18, h8.c0.b bVar, long j15, boolean z15) {
        super(str, th4, i15, Bundle.EMPTY, j15);
        zj.p.d(!z15 || i16 == 1);
        zj.p.d(th4 != null || i16 == 3);
        this.f4669k = i16;
        this.f4670l = str2;
        this.f4671m = i17;
        this.f4672n = pVar;
        this.f4673p = i18;
        this.f4674q = bVar;
        this.f4675r = z15;
    }
}
