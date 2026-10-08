package es;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<e> f53219b;

    public u(int i15) {
        this.f53218a = i15;
        this.f53219b = new ArrayList(0);
    }

    public final List<e> a() {
        return this.f53219b;
    }

    public final int b() {
        return this.f53218a;
    }

    public final void c(int i15) {
        this.f53218a = i15;
    }

    public u() {
        this(0);
    }
}
