package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33016a;

    static {
        new n("");
        new n("<br>");
        new n("<!DOCTYPE html>");
    }

    n(String str) {
        str.getClass();
        this.f33016a = str;
    }

    public final String a() {
        return this.f33016a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f33016a.equals(((n) obj).f33016a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33016a.hashCode() ^ 867184553;
    }

    public final String toString() {
        String str = this.f33016a;
        StringBuilder sb5 = new StringBuilder(str.length() + 10);
        sb5.append("SafeHtml{");
        sb5.append(str);
        sb5.append("}");
        return sb5.toString();
    }
}
