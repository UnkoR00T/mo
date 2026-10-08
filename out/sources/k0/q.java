package k0;

import java.util.UUID;
import v.a2;
import v.m0;
import y.x;

/* JADX INFO: loaded from: classes.dex */
public class q extends a2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f107181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f107182c;

    q(m0 m0Var) {
        super(m0Var);
        this.f107181b = "virtual-" + m0Var.i() + "-" + UUID.randomUUID().toString();
    }

    @Override // v.a2, o.q
    public int A(int i15) {
        return x.v(super.A(i15) - this.f107182c);
    }

    void b(int i15) {
        this.f107182c = i15;
    }

    @Override // v.a2, o.q
    public int g() {
        return A(0);
    }

    @Override // v.a2, v.m0
    public String i() {
        return this.f107181b;
    }
}
