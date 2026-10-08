package io.sentry;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f94662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d2 f94663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Callable<byte[]> f94664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f94665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f94666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f94667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f94668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f94669h;

    public b(byte[] bArr, String str, String str2, boolean z15) {
        this(bArr, str, str2, "event.attachment", z15);
    }

    public static b a(Callable<byte[]> callable, String str, String str2, boolean z15) {
        return new b(callable, str, str2, "event.attachment", z15);
    }

    public static b b(byte[] bArr) {
        return new b(bArr, "thread-dump.txt", "text/plain", false);
    }

    public static b c(io.sentry.protocol.h0 h0Var) {
        return new b((d2) h0Var, "view-hierarchy.json", "application/json", "event.view_hierarchy", false);
    }

    public String d() {
        return this.f94669h;
    }

    public Callable<byte[]> e() {
        return this.f94664c;
    }

    public byte[] f() {
        return this.f94662a;
    }

    public String g() {
        return this.f94667f;
    }

    public String h() {
        return this.f94666e;
    }

    public String i() {
        return this.f94665d;
    }

    public d2 j() {
        return this.f94663b;
    }

    boolean k() {
        return this.f94668g;
    }

    public b(byte[] bArr, String str, String str2, String str3, boolean z15) {
        this.f94662a = bArr;
        this.f94663b = null;
        this.f94664c = null;
        this.f94666e = str;
        this.f94667f = str2;
        this.f94669h = str3;
        this.f94668g = z15;
    }

    public b(d2 d2Var, String str, String str2, String str3, boolean z15) {
        this.f94662a = null;
        this.f94663b = d2Var;
        this.f94664c = null;
        this.f94666e = str;
        this.f94667f = str2;
        this.f94669h = str3;
        this.f94668g = z15;
    }

    public b(Callable<byte[]> callable, String str, String str2, String str3, boolean z15) {
        this.f94662a = null;
        this.f94663b = null;
        this.f94664c = callable;
        this.f94666e = str;
        this.f94667f = str2;
        this.f94669h = str3;
        this.f94668g = z15;
    }
}
