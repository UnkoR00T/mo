package zs;

import fu.o;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f236652a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o f236653b = new o("[^\\p{L}\\p{Digit}]");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f236654c = "$context_receiver";

    private g() {
    }

    public static final f a(int i15) {
        return f.l(f236654c + '_' + i15);
    }

    public static final String b(String str) {
        return f236653b.h(str, "_");
    }
}
