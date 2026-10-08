package com.google.android.libraries.places.internal;

import android.os.Build;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
final class ya1 extends pa1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final boolean f34380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f34381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final boolean f34382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicReference f34383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicLong f34384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ConcurrentLinkedQueue f34385h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile aa1 f34386b;

    static {
        String str = Build.FINGERPRINT;
        f34380c = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        f34381d = "goldfish".equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        f34382e = "eng".equals(str3) || "userdebug".equals(str3);
        f34383f = new AtomicReference();
        f34384g = new AtomicLong();
        f34385h = new ConcurrentLinkedQueue();
    }

    private ya1(String str) {
        super(str);
        if (f34380c || f34381d) {
            this.f34386b = new qa1().a(a());
        } else if (f34382e) {
            this.f34386b = bb1.b().b(false).a(a());
        } else {
            this.f34386b = null;
        }
    }

    public static aa1 b(String str) {
        char cCharAt;
        AtomicReference atomicReference = f34383f;
        if (atomicReference.get() != null) {
            return ((ra1) atomicReference.get()).a(str);
        }
        int length = str.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
            cCharAt = str.charAt(length);
            if (cCharAt == '$') {
                str = str.replace('$', '.');
                break;
            }
        } while (cCharAt != '.');
        ya1 ya1Var = new ya1(str);
        ConcurrentLinkedQueue concurrentLinkedQueue = wa1.f34147a;
        concurrentLinkedQueue.offer(ya1Var);
        if (atomicReference.get() != null) {
            while (true) {
                ya1 ya1Var2 = (ya1) concurrentLinkedQueue.poll();
                if (ya1Var2 == null) {
                    break;
                }
                ya1Var2.f34386b = ((ra1) atomicReference.get()).a(ya1Var2.a());
            }
            c();
        }
        return ya1Var;
    }

    private static void c() {
        xa1 xa1Var = (xa1) f34385h.poll();
        if (xa1Var == null) {
            return;
        }
        f34384g.getAndDecrement();
        xa1Var.a();
        xa1Var.b();
        throw null;
    }
}
