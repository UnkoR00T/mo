package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public class f81 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final d81 f32265d = d81.a(Boolean.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f81 f32266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r0.l1 f32267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f32268c = false;

    /* synthetic */ f81(f81 f81Var, r0.l1 l1Var, byte[] bArr) {
        if (f81Var != null) {
            zj.p.d(f81Var.f32268c);
        }
        this.f32266a = f81Var;
        this.f32267b = l1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static f81 a(f81 f81Var, f81 f81Var2) {
        if (f81Var.c()) {
            return f81Var2;
        }
        if (f81Var2.c()) {
            return f81Var;
        }
        ak.u0<f81> u0VarF = ak.u0.F(f81Var, f81Var2);
        if (u0VarF.isEmpty()) {
            return e81.f32170e;
        }
        if (u0VarF.size() == 1) {
            return (f81) u0VarF.iterator().next();
        }
        int size = 0;
        for (f81 f81Var3 : u0VarF) {
            do {
                size += f81Var3.f32267b.getSize();
                f81Var3 = f81Var3.f32266a;
            } while (f81Var3 != null);
        }
        if (size == 0) {
            return e81.f32170e;
        }
        r0.l1 l1Var = new r0.l1(size);
        for (f81 f81Var4 : u0VarF) {
            do {
                int i15 = 0;
                while (true) {
                    r0.l1 l1Var2 = f81Var4.f32267b;
                    if (i15 >= l1Var2.getSize()) {
                        break;
                    }
                    zj.p.l(l1Var.put((d81) l1Var2.f(i15), l1Var2.k(i15)) == null, "Duplicate bindings: %s", l1Var2.f(i15));
                    i15++;
                }
                f81Var4 = f81Var4.f32266a;
            } while (f81Var4 != null);
        }
        return new e81(null, l1Var, 0 == true ? 1 : 0).b();
    }

    final f81 b() {
        if (this.f32268c) {
            throw new IllegalStateException("Already frozen");
        }
        this.f32268c = true;
        f81 f81Var = this.f32266a;
        return (f81Var == null || !this.f32267b.isEmpty()) ? this : f81Var;
    }

    public final boolean c() {
        return this == e81.f32170e;
    }

    final boolean d(d81 d81Var) {
        if (this.f32267b.containsKey(d81Var)) {
            return true;
        }
        f81 f81Var = this.f32266a;
        return f81Var != null && f81Var.d(d81Var);
    }

    final boolean e() {
        return this.f32268c;
    }

    final /* synthetic */ r0.l1 g() {
        return this.f32267b;
    }

    final /* synthetic */ boolean h() {
        return this.f32268c;
    }

    public final String toString() {
        StringBuilder sb5 = new StringBuilder("SpanExtras<");
        for (f81 f81Var = this; f81Var != null; f81Var = f81Var.f32266a) {
            for (int i15 = 0; i15 < f81Var.f32267b.getSize(); i15++) {
                sb5.append("[");
                sb5.append(this.f32267b.k(i15));
                sb5.append("], ");
            }
        }
        sb5.append(">");
        return sb5.toString();
    }
}
