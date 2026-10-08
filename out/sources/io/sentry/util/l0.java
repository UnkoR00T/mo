package io.sentry.util;

import io.sentry.j1;
import java.net.URI;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f95812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f95813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f95814c;

        public a(String str, String str2, String str3) {
            this.f95812a = str;
            this.f95813b = str2;
            this.f95814c = str3;
        }

        public void a(io.sentry.protocol.m mVar) {
            if (mVar == null) {
                return;
            }
            mVar.t(this.f95812a);
            mVar.r(this.f95813b);
            mVar.o(this.f95814c);
        }

        public void b(j1 j1Var) {
            if (j1Var == null) {
                return;
            }
            String str = this.f95813b;
            if (str != null) {
                j1Var.m("http.query", str);
            }
            String str2 = this.f95814c;
            if (str2 != null) {
                j1Var.m("http.fragment", str2);
            }
        }

        public String c() {
            return this.f95814c;
        }

        public String d() {
            return this.f95813b;
        }

        public String e() {
            return this.f95812a;
        }

        public String f() {
            String str = this.f95812a;
            return str == null ? "unknown" : str;
        }
    }

    private static String a(String str) {
        if (!str.contains("@")) {
            return str;
        }
        if (str.startsWith("@")) {
            return "[Filtered]" + str;
        }
        return (str.substring(0, str.indexOf(64)).contains(":") ? "[Filtered]:[Filtered]" : "[Filtered]") + str.substring(str.indexOf(64));
    }

    private static boolean b(URI uri) {
        try {
            uri.toURL();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static a c(String str) {
        String str2;
        try {
            URI uri = new URI(str);
            if (uri.isAbsolute() && !b(uri)) {
                return new a(null, null, null);
            }
            String rawPath = "";
            if (uri.getScheme() == null) {
                str2 = "";
            } else {
                str2 = uri.getScheme() + "://";
            }
            String rawAuthority = uri.getRawAuthority() == null ? "" : uri.getRawAuthority();
            if (uri.getRawPath() != null) {
                rawPath = uri.getRawPath();
            }
            return new a(str2 + a(rawAuthority) + rawPath, uri.getRawQuery(), uri.getRawFragment());
        } catch (Exception unused) {
            return new a(null, null, null);
        }
    }
}
