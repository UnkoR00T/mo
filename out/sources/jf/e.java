package jf;

import org.bouncycastle.asn1.x509.DisplayText;

/* JADX INFO: loaded from: classes3.dex */
abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final e f102323a = a().f(10485760).d(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE).b(10000).c(604800000).e(81920).a();

    static abstract class a {
        a() {
        }

        abstract e a();

        abstract a b(int i15);

        abstract a c(long j15);

        abstract a d(int i15);

        abstract a e(int i15);

        abstract a f(long j15);
    }

    e() {
    }

    static a a() {
        return new jf.a.b();
    }

    abstract int b();

    abstract long c();

    abstract int d();

    abstract int e();

    abstract long f();
}
