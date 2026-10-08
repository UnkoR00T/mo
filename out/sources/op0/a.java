package op0;

import dx.i;
import fp0.GetPackageResponse;
import fp0.InstitutionCardAndCertData;
import fp0.d;
import iy.b0;
import oq.i0;
import p071kotlin.Metadata;
import ry.CertKeyPair;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\t\u0010\nJ4\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH¦@¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00120\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH¦@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lop0/a;", "", "Liy/b0;", "token", "Lfp0/e;", "institution", "Ldx/i;", "Ldx/b;", "Lfp0/c;", "c", "(Liy/b0;Lfp0/e;Ltq/e;)Ljava/lang/Object;", "Lry/c;", "certKeyPair", "Lfp0/d;", "identity", "Loq/i0;", "b", "(Liy/b0;Lry/c;Lfp0/d;Ltq/e;)Ljava/lang/Object;", "Lfp0/f;", "a", "(Lry/c;Lfp0/d;Ltq/e;)Ljava/lang/Object;", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object a(CertKeyPair certKeyPair, d dVar, e<? super i<? extends dx.b, InstitutionCardAndCertData>> eVar);

    Object b(b0 b0Var, CertKeyPair certKeyPair, d dVar, e<? super i<? extends dx.b, i0>> eVar);

    Object c(b0 b0Var, fp0.e eVar, e<? super i<? extends dx.b, GetPackageResponse>> eVar2);
}
