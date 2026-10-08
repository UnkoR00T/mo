package io.sentry.internal.gestures;

import io.sentry.util.v;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WeakReference<Object> f95111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f95112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f95113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f95114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final String f95115e;

    public enum a {
        CLICKABLE,
        SCROLLABLE
    }

    public b(Object obj, String str, String str2, String str3, String str4) {
        this.f95111a = new WeakReference<>(obj);
        this.f95112b = str;
        this.f95113c = str2;
        this.f95114d = str3;
        this.f95115e = str4;
    }

    public String a() {
        return this.f95112b;
    }

    public String b() {
        String str = this.f95113c;
        return str != null ? str : (String) v.c(this.f95114d, "UiElement.tag can't be null");
    }

    public String c() {
        return this.f95115e;
    }

    public String d() {
        return this.f95113c;
    }

    public String e() {
        return this.f95114d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (v.a(this.f95112b, bVar.f95112b) && v.a(this.f95113c, bVar.f95113c) && v.a(this.f95114d, bVar.f95114d)) {
                return true;
            }
        }
        return false;
    }

    public Object f() {
        return this.f95111a.get();
    }

    public int hashCode() {
        return v.b(this.f95111a, this.f95113c, this.f95114d);
    }
}
