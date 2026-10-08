package com.google.android.libraries.places.internal;

import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class x90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34243b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f34245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f34246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f34247f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f34248g;

    private x90() {
    }

    public final x90 a(String str) {
        b(str.toLowerCase(Locale.ROOT));
        return this;
    }

    final x90 b(String str) {
        if (!str.isEmpty()) {
            if (y90.f34359i.get(str.charAt(0))) {
                for (int i15 = 0; i15 < str.length(); i15++) {
                    if (!y90.f34360j.get(str.charAt(i15))) {
                        StringBuilder sb5 = new StringBuilder(String.valueOf(i15).length() + 37);
                        sb5.append("Invalid character in scheme at index ");
                        sb5.append(i15);
                        throw new IllegalArgumentException(sb5.toString());
                    }
                }
                this.f34242a = str;
                return this;
            }
        }
        throw new IllegalArgumentException("Scheme must start with an alphabetic char");
    }

    public final x90 c(String str) {
        zj.p.e(true, "Path can be empty but not null");
        this.f34243b = y90.n(str, y90.f34365o);
        return this;
    }

    public final x90 d(String str) {
        zj.p.e(str != null, "Path can be empty but not null");
        y90.i(str, null);
        this.f34243b = str;
        return this;
    }

    final x90 e(String str) {
        y90.l(str, "query", y90.f34366p, null);
        this.f34244c = str;
        return this;
    }

    final x90 f(String str) {
        y90.l(str, "fragment", y90.f34367q, null);
        this.f34245d = str;
        return this;
    }

    final x90 g(String str) {
        y90.l(str, "userInfo", y90.f34363m, null);
        this.f34246e = str;
        return this;
    }

    public final x90 h(String str) {
        this.f34247f = y90.n("".toLowerCase(Locale.ROOT), y90.f34362l);
        return this;
    }

    final x90 i(String str) {
        int iIndexOf;
        if (str.startsWith("[") && str.endsWith("]") && (iIndexOf = str.indexOf(37)) > 0) {
            y90.l(str.substring(iIndexOf, str.length() - 1), "scope", y90.f34361k, null);
        }
        if (!dk.b.h(str)) {
            y90.l(str, "host", y90.f34362l, null);
        }
        this.f34247f = str;
        return this;
    }

    final x90 j(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                Integer.parseInt(str);
            } catch (NumberFormatException e15) {
                throw new IllegalArgumentException("Invalid port", e15);
            }
        }
        this.f34248g = str;
        return this;
    }

    public final y90 k() {
        zj.p.x(this.f34242a != null, "Missing required scheme.");
        if (this.f34247f == null) {
            zj.p.x(this.f34248g == null, "Cannot set port without host.");
            zj.p.x(this.f34246e == null, "Cannot set userInfo without host.");
        }
        return new y90(this, null);
    }

    final /* synthetic */ String l() {
        return this.f34242a;
    }

    final /* synthetic */ String m() {
        return this.f34243b;
    }

    final /* synthetic */ String n() {
        return this.f34244c;
    }

    final /* synthetic */ String o() {
        return this.f34245d;
    }

    final /* synthetic */ String p() {
        return this.f34246e;
    }

    final /* synthetic */ String q() {
        return this.f34247f;
    }

    final /* synthetic */ String r() {
        return this.f34248g;
    }

    /* synthetic */ x90(byte[] bArr) {
    }
}
