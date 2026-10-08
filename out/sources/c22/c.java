package c22;

import eo0.r0;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc22/c;", "Lc22/b;", "<init>", "()V", "Leo0/r0;", "registry", "", "a", "(Leo0/r0;)Ljava/lang/Integer;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements b {
    @Override // c22.b
    public Integer a(r0 registry) {
        if (registry instanceof r0.KppId) {
            return Integer.valueOf(e02.a.S);
        }
        if (registry instanceof r0.Krs) {
            return Integer.valueOf(e02.a.T);
        }
        if (registry instanceof r0.Nip) {
            return Integer.valueOf(e02.a.Y);
        }
        if (registry instanceof r0.Pesel) {
            return Integer.valueOf(e02.a.f46509c0);
        }
        if (registry instanceof r0.Regon) {
            return Integer.valueOf(e02.a.f46545i0);
        }
        if (registry instanceof r0.Ue) {
            return Integer.valueOf(e02.a.C);
        }
        if (registry instanceof r0.Unknown) {
            return null;
        }
        throw new p();
    }
}
