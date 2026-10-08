package com.google.android.gms.internal.oss_licenses;

/* JADX INFO: loaded from: classes3.dex */
public class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final o f30868d = o.a(Boolean.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f30869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r0.l1 f30870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f30871c = false;

    /* synthetic */ q(q qVar, r0.l1 l1Var, byte[] bArr) {
        if (qVar != null) {
            g0.a(qVar.f30871c);
        }
        this.f30869a = qVar;
        this.f30870b = l1Var;
    }

    final q a() {
        if (this.f30871c) {
            throw new IllegalStateException("Already frozen");
        }
        this.f30871c = true;
        q qVar = this.f30869a;
        return (qVar == null || !this.f30870b.isEmpty()) ? this : qVar;
    }

    final boolean b(o oVar) {
        if (this.f30870b.containsKey(oVar)) {
            return true;
        }
        q qVar = this.f30869a;
        return qVar != null && qVar.b(oVar);
    }

    final boolean c() {
        return this.f30871c;
    }

    final /* synthetic */ r0.l1 e() {
        return this.f30870b;
    }

    final /* synthetic */ boolean f() {
        return this.f30871c;
    }

    public final String toString() {
        StringBuilder sb5 = new StringBuilder("SpanExtras<");
        for (q qVar = this; qVar != null; qVar = qVar.f30869a) {
            for (int i15 = 0; i15 < qVar.f30870b.getSize(); i15++) {
                sb5.append("[");
                sb5.append(this.f30870b.k(i15));
                sb5.append("], ");
            }
        }
        sb5.append(">");
        return sb5.toString();
    }
}
