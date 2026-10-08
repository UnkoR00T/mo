package cn;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.tl;

/* JADX INFO: loaded from: classes4.dex */
final class c extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tl f28305b;

    c(int i15, tl tlVar) {
        this.f28304a = i15;
        this.f28305b = tlVar;
    }

    @Override // cn.p
    public final int a() {
        return this.f28304a;
    }

    @Override // cn.p
    public final tl b() {
        return this.f28305b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f28304a == pVar.a() && this.f28305b.equals(pVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f28304a ^ 1000003) * 1000003) ^ this.f28305b.hashCode();
    }

    public final String toString() {
        return "VkpStatus{exceptionType=" + this.f28304a + ", remoteException=" + this.f28305b.toString() + "}";
    }
}
