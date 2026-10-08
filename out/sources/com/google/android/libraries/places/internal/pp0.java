package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class pp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final rr0 f33348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final mp0[] f33349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f33350c;

    static {
        rr0 rr0Var = rr0.f33593d;
        f33348a = qr0.a(":");
        mp0 mp0Var = new mp0(mp0.f32982h, qr0.a(""));
        rr0 rr0Var2 = mp0.f32979e;
        mp0 mp0Var2 = new mp0(rr0Var2, qr0.a("GET"));
        mp0 mp0Var3 = new mp0(rr0Var2, qr0.a("POST"));
        rr0 rr0Var3 = mp0.f32980f;
        mp0 mp0Var4 = new mp0(rr0Var3, qr0.a("/"));
        mp0 mp0Var5 = new mp0(rr0Var3, qr0.a("/index.html"));
        rr0 rr0Var4 = mp0.f32981g;
        mp0 mp0Var6 = new mp0(rr0Var4, qr0.a("http"));
        mp0 mp0Var7 = new mp0(rr0Var4, qr0.a("https"));
        rr0 rr0Var5 = mp0.f32978d;
        f33349b = new mp0[]{mp0Var, mp0Var2, mp0Var3, mp0Var4, mp0Var5, mp0Var6, mp0Var7, new mp0(rr0Var5, qr0.a("200")), new mp0(rr0Var5, qr0.a("204")), new mp0(rr0Var5, qr0.a("206")), new mp0(rr0Var5, qr0.a("304")), new mp0(rr0Var5, qr0.a("400")), new mp0(rr0Var5, qr0.a("404")), new mp0(rr0Var5, qr0.a("500")), new mp0("accept-charset", ""), new mp0("accept-encoding", "gzip, deflate"), new mp0("accept-language", ""), new mp0("accept-ranges", ""), new mp0("accept", ""), new mp0("access-control-allow-origin", ""), new mp0("age", ""), new mp0("allow", ""), new mp0("authorization", ""), new mp0("cache-control", ""), new mp0("content-disposition", ""), new mp0("content-encoding", ""), new mp0("content-language", ""), new mp0("content-length", ""), new mp0("content-location", ""), new mp0("content-range", ""), new mp0("content-type", ""), new mp0("cookie", ""), new mp0("date", ""), new mp0("etag", ""), new mp0("expect", ""), new mp0("expires", ""), new mp0("from", ""), new mp0("host", ""), new mp0("if-match", ""), new mp0("if-modified-since", ""), new mp0("if-none-match", ""), new mp0("if-range", ""), new mp0("if-unmodified-since", ""), new mp0("last-modified", ""), new mp0("link", ""), new mp0("location", ""), new mp0("max-forwards", ""), new mp0("proxy-authenticate", ""), new mp0("proxy-authorization", ""), new mp0("range", ""), new mp0("referer", ""), new mp0("refresh", ""), new mp0("retry-after", ""), new mp0("server", ""), new mp0("set-cookie", ""), new mp0("strict-transport-security", ""), new mp0("transfer-encoding", ""), new mp0("user-agent", ""), new mp0("vary", ""), new mp0("via", ""), new mp0("www-authenticate", "")};
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        int i15 = 0;
        while (true) {
            mp0[] mp0VarArr = f33349b;
            int length = mp0VarArr.length;
            if (i15 >= 61) {
                f33350c = Collections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(mp0VarArr[i15].f32983a)) {
                    linkedHashMap.put(mp0VarArr[i15].f32983a, Integer.valueOf(i15));
                }
                i15++;
            }
        }
    }

    static /* synthetic */ rr0 a(rr0 rr0Var) throws IOException {
        int iS = rr0Var.s();
        for (int i15 = 0; i15 < iS; i15++) {
            byte bR = rr0Var.r(i15);
            if (bR >= 65 && bR <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(rr0Var.k()));
            }
        }
        return rr0Var;
    }
}
