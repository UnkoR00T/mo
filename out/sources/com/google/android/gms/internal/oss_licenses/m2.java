package com.google.android.gms.internal.oss_licenses;

import android.os.Build;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
final class m2 extends e2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final boolean f30829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f30830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final boolean f30831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicReference f30832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicLong f30833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ConcurrentLinkedQueue f30834h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile q1 f30835b;

    static {
        String str = Build.FINGERPRINT;
        f30829c = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        f30830d = "goldfish".equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        f30831e = "eng".equals(str3) || "userdebug".equals(str3);
        f30832f = new AtomicReference();
        f30833g = new AtomicLong();
        f30834h = new ConcurrentLinkedQueue();
    }

    private m2(String str) {
        super(str);
        if (f30829c || f30830d) {
            this.f30835b = new f2().a(a());
        } else if (f30831e) {
            this.f30835b = p2.b().b(false).a(a());
        } else {
            this.f30835b = null;
        }
    }

    public static q1 b(String str) {
        char cCharAt;
        AtomicReference atomicReference = f30832f;
        if (atomicReference.get() != null) {
            return ((g2) atomicReference.get()).a(str);
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
        m2 m2Var = new m2(str);
        ConcurrentLinkedQueue concurrentLinkedQueue = k2.f30812a;
        concurrentLinkedQueue.offer(m2Var);
        if (atomicReference.get() != null) {
            while (true) {
                m2 m2Var2 = (m2) concurrentLinkedQueue.poll();
                if (m2Var2 == null) {
                    break;
                }
                m2Var2.f30835b = ((g2) atomicReference.get()).a(m2Var2.a());
            }
            if (((l2) f30834h.poll()) != null) {
                f30833g.getAndDecrement();
                throw null;
            }
        }
        return m2Var;
    }
}
