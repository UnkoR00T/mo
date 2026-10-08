package com.google.firebase.messaging;

import android.text.TextUtils;
import io.sentry.android.core.c2;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
final class z0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f36627d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f36630c;

    private z0(String str, String str2) {
        this.f36628a = d(str2, str);
        this.f36629b = str;
        this.f36630c = str + "!" + str2;
    }

    static z0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new z0(strArrSplit[0], strArrSplit[1]);
    }

    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            c2.g("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f36627d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public String b() {
        return this.f36629b;
    }

    public String c() {
        return this.f36628a;
    }

    public String e() {
        return this.f36630c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.f36628a.equals(z0Var.f36628a) && this.f36629b.equals(z0Var.f36629b);
    }

    public int hashCode() {
        return jg.r.b(this.f36629b, this.f36628a);
    }
}
