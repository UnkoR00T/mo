package io.sentry;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class y7 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f95985d = Pattern.compile("^[ \\t]*([0-9a-f]{32})-([0-9a-f]{16})(-[01])?[ \\t]*$", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.protocol.v f95986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s8 f95987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Boolean f95988c;

    public y7(io.sentry.protocol.v vVar, s8 s8Var, Boolean bool) {
        this.f95986a = vVar;
        this.f95987b = s8Var;
        this.f95988c = bool;
    }

    public String a() {
        return "sentry-trace";
    }

    public String b() {
        Boolean bool = this.f95988c;
        if (bool != null) {
            return String.format("%s-%s-%s", this.f95986a, this.f95987b, bool.booleanValue() ? "1" : com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1);
        }
        return String.format("%s-%s", this.f95986a, this.f95987b);
    }

    public Boolean c() {
        return this.f95988c;
    }
}
