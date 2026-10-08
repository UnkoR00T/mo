package com.google.android.libraries.places.internal;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
final class pj0 {
    pj0() {
    }

    public static final PasswordAuthentication a(String str, InetAddress inetAddress, int i15, String str2, String str3, String str4) {
        URL url;
        try {
            url = new URL("https", str, i15, "");
        } catch (MalformedURLException unused) {
            int i16 = rj0.f33516e;
            rj0.f33513b.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", "failed to create URL for Authenticator: {0} {1}", new Object[]{"https", str});
            url = null;
        }
        return Authenticator.requestPasswordAuthentication(str, inetAddress, i15, "https", "", null, url, Authenticator.RequestorType.PROXY);
    }
}
