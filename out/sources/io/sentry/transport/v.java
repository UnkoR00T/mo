package io.sentry.transport;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* JADX INFO: loaded from: classes4.dex */
final class v extends Authenticator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f95777b;

    v(String str, String str2) {
        this.f95776a = (String) io.sentry.util.v.c(str, "user is required");
        this.f95777b = (String) io.sentry.util.v.c(str2, "password is required");
    }

    @Override // java.net.Authenticator
    protected PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() == Authenticator.RequestorType.PROXY) {
            return new PasswordAuthentication(this.f95776a, this.f95777b.toCharArray());
        }
        return null;
    }
}
