package io.sentry;

import java.net.URI;

/* JADX INFO: loaded from: classes4.dex */
final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f95948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f95949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f95950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final URI f95951e;

    x(String str) {
        try {
            io.sentry.util.v.c(str, "The DSN is required.");
            URI uriNormalize = new URI(str).normalize();
            String scheme = uriNormalize.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                throw new IllegalArgumentException("Invalid DSN scheme: " + scheme);
            }
            String userInfo = uriNormalize.getUserInfo();
            if (userInfo == null || userInfo.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            String[] strArrSplit = userInfo.split(":", -1);
            String str2 = strArrSplit[0];
            this.f95950d = str2;
            if (str2 == null || str2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            this.f95949c = strArrSplit.length > 1 ? strArrSplit[1] : null;
            String path = uriNormalize.getPath();
            path = path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
            int iLastIndexOf = path.lastIndexOf("/") + 1;
            String strSubstring = path.substring(0, iLastIndexOf);
            if (!strSubstring.endsWith("/")) {
                strSubstring = strSubstring + "/";
            }
            this.f95948b = strSubstring;
            String strSubstring2 = path.substring(iLastIndexOf);
            this.f95947a = strSubstring2;
            if (strSubstring2.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
            }
            String str3 = strSubstring;
            this.f95951e = new URI(scheme, null, uriNormalize.getHost(), uriNormalize.getPort(), str3 + "api/" + strSubstring2, null, null);
        } catch (Throwable th4) {
            throw new IllegalArgumentException(th4);
        }
    }

    public String a() {
        return this.f95950d;
    }

    public String b() {
        return this.f95949c;
    }

    URI c() {
        return this.f95951e;
    }
}
