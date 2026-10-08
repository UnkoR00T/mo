package com.google.android.gms.internal.oss_licenses;

/* JADX INFO: loaded from: classes3.dex */
final class h3 extends f3 {
    /* synthetic */ h3(byte[] bArr) {
        super(null);
    }

    @Override // com.google.android.gms.internal.oss_licenses.f3
    final void a(k3 k3Var, Thread thread) {
        k3Var.f30814a = thread;
    }

    @Override // com.google.android.gms.internal.oss_licenses.f3
    final void b(k3 k3Var, k3 k3Var2) {
        k3Var.f30815b = k3Var2;
    }

    @Override // com.google.android.gms.internal.oss_licenses.f3
    final boolean c(l3 l3Var, k3 k3Var, k3 k3Var2) {
        synchronized (l3Var) {
            try {
                if (l3Var.f30823c != k3Var) {
                    return false;
                }
                l3Var.f30823c = k3Var2;
                return true;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // com.google.android.gms.internal.oss_licenses.f3
    final k3 d(l3 l3Var, k3 k3Var) {
        k3 k3Var2;
        synchronized (l3Var) {
            try {
                k3Var2 = l3Var.f30823c;
                if (k3Var2 != k3Var) {
                    l3Var.f30823c = k3Var;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return k3Var2;
    }

    @Override // com.google.android.gms.internal.oss_licenses.f3
    final d3 e(l3 l3Var, d3 d3Var) {
        d3 d3Var2;
        synchronized (l3Var) {
            try {
                d3Var2 = l3Var.f30822b;
                if (d3Var2 != d3Var) {
                    l3Var.f30822b = d3Var;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return d3Var2;
    }

    @Override // com.google.android.gms.internal.oss_licenses.f3
    final boolean f(l3 l3Var, Object obj, Object obj2) {
        synchronized (l3Var) {
            try {
                if (l3Var.f30821a != obj) {
                    return false;
                }
                l3Var.f30821a = obj2;
                return true;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
