package com.google.android.gms.internal.clearcut;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class v5 implements eg.a.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Charset f29568b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p f29569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p f29570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ConcurrentHashMap<String, f<h5>> f29571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HashMap<String, f<String>> f29572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @VisibleForTesting
    private static Boolean f29573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @VisibleForTesting
    private static Long f29574h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @VisibleForTesting
    private static final f<Boolean> f29575i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f29576a;

    static {
        p pVarH = new p(qh.b.a("com.google.android.gms.clearcut.public")).f("gms:playlog:service:samplingrules_").h("LogSamplingRules__");
        f29569c = pVarH;
        f29570d = new p(qh.b.a("com.google.android.gms.clearcut.public")).f("gms:playlog:service:sampling_").h("LogSampling__");
        f29571e = new ConcurrentHashMap<>();
        f29572f = new HashMap<>();
        f29573g = null;
        f29574h = null;
        f29575i = pVarH.e("enable_log_sampling_rules", false);
    }

    public v5(Context context) {
        this.f29576a = context;
        if (context != null) {
            f.b(context);
        }
    }

    @VisibleForTesting
    private static long b(String str, long j15) {
        if (str == null || str.isEmpty()) {
            return q5.c(ByteBuffer.allocate(8).putLong(j15).array());
        }
        byte[] bytes = str.getBytes(f29568b);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length + 8);
        byteBufferAllocate.put(bytes);
        byteBufferAllocate.putLong(j15);
        return q5.c(byteBufferAllocate.array());
    }

    @VisibleForTesting
    private static h5.b c(String str) {
        String strSubstring;
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(44);
        int i15 = 0;
        if (iIndexOf >= 0) {
            i15 = iIndexOf + 1;
            strSubstring = str.substring(0, iIndexOf);
        } else {
            strSubstring = "";
        }
        int iIndexOf2 = str.indexOf(47, i15);
        if (iIndexOf2 <= 0) {
            io.sentry.android.core.c2.e("LogSamplerImpl", str.length() != 0 ? "Failed to parse the rule: ".concat(str) : new String("Failed to parse the rule: "));
            return null;
        }
        try {
            long j15 = Long.parseLong(str.substring(i15, iIndexOf2));
            long j16 = Long.parseLong(str.substring(iIndexOf2 + 1));
            if (j15 >= 0 && j16 >= 0) {
                return h5.b.z().t(strSubstring).v(j15).w(j16).s();
            }
            StringBuilder sb5 = new StringBuilder(72);
            sb5.append("negative values not supported: ");
            sb5.append(j15);
            sb5.append("/");
            sb5.append(j16);
            io.sentry.android.core.c2.e("LogSamplerImpl", sb5.toString());
            return null;
        } catch (NumberFormatException e15) {
            io.sentry.android.core.c2.f("LogSamplerImpl", str.length() != 0 ? "parseLong() failed while parsing: ".concat(str) : new String("parseLong() failed while parsing: "), e15);
            return null;
        }
    }

    @VisibleForTesting
    private static boolean d(long j15, long j16, long j17) {
        if (j16 < 0 || j17 <= 0) {
            return true;
        }
        return ((j15 > 0L ? 1 : (j15 == 0L ? 0 : -1)) >= 0 ? j15 % j17 : (((Long.MAX_VALUE % j17) + 1) + ((j15 & Long.MAX_VALUE) % j17)) % j17) < j16;
    }

    private static boolean e(Context context) {
        if (f29573g == null) {
            f29573g = Boolean.valueOf(qg.d.a(context).a("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return f29573g.booleanValue();
    }

    @VisibleForTesting
    private static long f(Context context) {
        if (f29574h == null) {
            if (context == null) {
                return 0L;
            }
            f29574h = Long.valueOf(e(context) ? z5.a(context.getContentResolver(), "android_id", 0L) : 0L);
        }
        return f29574h.longValue();
    }

    @Override // eg.a.b
    public final boolean a(eg.f fVar) {
        List<h5.b> listR;
        f<h5> fVarPutIfAbsent;
        x5 x5Var = fVar.f49953a;
        String strValueOf = x5Var.f29601g;
        int i15 = x5Var.f29597c;
        m5 m5Var = fVar.f49961j;
        int i16 = m5Var != null ? m5Var.f29438g : 0;
        String strA = null;
        if (!f29575i.a().booleanValue()) {
            if (strValueOf == null || strValueOf.isEmpty()) {
                strValueOf = i15 >= 0 ? String.valueOf(i15) : null;
            }
            if (strValueOf == null) {
                return true;
            }
            Context context = this.f29576a;
            if (context != null && e(context)) {
                HashMap<String, f<String>> map = f29572f;
                f<String> fVarB = map.get(strValueOf);
                if (fVarB == null) {
                    fVarB = f29570d.b(strValueOf, null);
                    map.put(strValueOf, fVarB);
                }
                strA = fVarB.a();
            }
            h5.b bVarC = c(strA);
            if (bVarC != null) {
                return d(b(bVarC.w(), f(this.f29576a)), bVarC.x(), bVarC.y());
            }
            return true;
        }
        if (strValueOf == null || strValueOf.isEmpty()) {
            strValueOf = i15 >= 0 ? String.valueOf(i15) : null;
        }
        if (strValueOf == null) {
            return true;
        }
        if (this.f29576a == null) {
            listR = Collections.EMPTY_LIST;
        } else {
            ConcurrentHashMap<String, f<h5>> concurrentHashMap = f29571e;
            f<h5> fVarA = concurrentHashMap.get(strValueOf);
            if (fVarA == null && (fVarPutIfAbsent = concurrentHashMap.putIfAbsent(strValueOf, (fVarA = f29569c.a(strValueOf, h5.s(), w5.f29585a)))) != null) {
                fVarA = fVarPutIfAbsent;
            }
            listR = fVarA.a().r();
        }
        for (h5.b bVar : listR) {
            if (!bVar.v() || bVar.r() == 0 || bVar.r() == i16) {
                if (!d(b(bVar.w(), f(this.f29576a)), bVar.x(), bVar.y())) {
                    return false;
                }
            }
        }
        return true;
    }
}
