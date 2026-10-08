package s24;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Ls24/a;", "", "Lf24/c;", "mainCertificateType", "", "clearData", "hasAnyActiveCert", "Ldx/b;", "a", "(Lf24/c;ZZ)Ldx/b;", "b", "()Ldx/b;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    static /* synthetic */ dx.b c(a aVar, f24.c cVar, boolean z15, boolean z16, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCertificateDeactivatedError");
        }
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        if ((i15 & 4) != 0) {
            z16 = false;
        }
        return aVar.a(cVar, z15, z16);
    }

    dx.b a(f24.c mainCertificateType, boolean clearData, boolean hasAnyActiveCert);

    dx.b b();
}
