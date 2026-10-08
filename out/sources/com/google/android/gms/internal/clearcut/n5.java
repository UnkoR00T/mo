package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes3.dex */
public final class n5 extends s4<n5> implements Cloneable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile n5[] f29473e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29474c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f29475d = "";

    public n5() {
        this.f29537b = null;
        this.f29584a = -1;
    }

    public static n5[] l() {
        if (f29473e == null) {
            synchronized (v4.f29567c) {
                try {
                    if (f29473e == null) {
                        f29473e = new n5[0];
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        return f29473e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.s4, com.google.android.gms.internal.clearcut.w4
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final n5 clone() {
        try {
            return (n5) super.clone();
        } catch (CloneNotSupportedException e15) {
            throw new AssertionError(e15);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.s4, com.google.android.gms.internal.clearcut.w4
    public final void b(q4 q4Var) throws r4 {
        String str = this.f29474c;
        if (str != null && !str.equals("")) {
            q4Var.c(1, this.f29474c);
        }
        String str2 = this.f29475d;
        if (str2 != null && !str2.equals("")) {
            q4Var.c(2, this.f29475d);
        }
        super.b(q4Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n5)) {
            return false;
        }
        n5 n5Var = (n5) obj;
        String str = this.f29474c;
        if (str == null) {
            if (n5Var.f29474c != null) {
                return false;
            }
        } else if (!str.equals(n5Var.f29474c)) {
            return false;
        }
        String str2 = this.f29475d;
        if (str2 == null) {
            if (n5Var.f29475d != null) {
                return false;
            }
        } else if (!str2.equals(n5Var.f29475d)) {
            return false;
        }
        t4 t4Var = this.f29537b;
        if (t4Var != null && !t4Var.b()) {
            return this.f29537b.equals(n5Var.f29537b);
        }
        t4 t4Var2 = n5Var.f29537b;
        return t4Var2 == null || t4Var2.b();
    }

    @Override // com.google.android.gms.internal.clearcut.s4, com.google.android.gms.internal.clearcut.w4
    protected final int g() {
        int iG = super.g();
        String str = this.f29474c;
        if (str != null && !str.equals("")) {
            iG += q4.h(1, this.f29474c);
        }
        String str2 = this.f29475d;
        return (str2 == null || str2.equals("")) ? iG : iG + q4.h(2, this.f29475d);
    }

    public final int hashCode() {
        int iHashCode = (n5.class.getName().hashCode() + 527) * 31;
        String str = this.f29474c;
        int iHashCode2 = 0;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f29475d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        t4 t4Var = this.f29537b;
        if (t4Var != null && !t4Var.b()) {
            iHashCode2 = this.f29537b.hashCode();
        }
        return iHashCode4 + iHashCode2;
    }

    @Override // com.google.android.gms.internal.clearcut.s4, com.google.android.gms.internal.clearcut.w4
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ w4 clone() {
        return (n5) clone();
    }

    @Override // com.google.android.gms.internal.clearcut.s4
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ s4 clone() {
        return (n5) clone();
    }
}
