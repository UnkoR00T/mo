package io.sentry;

import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pattern f95007b;

    public h0(String str) {
        Pattern patternCompile;
        this.f95006a = str;
        try {
            patternCompile = Pattern.compile(str);
        } catch (Throwable unused) {
            d5.r().s().getLogger().c(b7.DEBUG, "Only using filter string for String comparison as it could not be parsed as regex: %s", str);
            patternCompile = null;
        }
        this.f95007b = patternCompile;
    }

    public String a() {
        return this.f95006a;
    }

    public boolean b(String str) {
        Pattern pattern = this.f95007b;
        if (pattern == null) {
            return false;
        }
        return pattern.matcher(str).matches();
    }

    public boolean equals(Object obj) {
        if (obj == null || h0.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f95006a, ((h0) obj).f95006a);
    }

    public int hashCode() {
        return Objects.hash(this.f95006a);
    }
}
