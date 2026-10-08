package com.google.gson;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f36643d = new e("", "", false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f36644e = new e("\n", "  ", true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f36647c;

    private e(String str, String str2, boolean z15) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f36645a = str;
        this.f36646b = str2;
        this.f36647c = z15;
    }

    public String a() {
        return this.f36646b;
    }

    public String b() {
        return this.f36645a;
    }

    public boolean c() {
        return this.f36647c;
    }
}
