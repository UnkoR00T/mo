package v24;

import dx.i;
import f24.CertificateData;
import f24.CertificateTypeStatus;
import f24.c;
import iy.b0;
import java.util.List;
import mu.g;
import oq.i0;
import p071kotlin.Metadata;
import ry.CertKeyPair;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J4\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00100\bH¦@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0013\u0010\u000fJ$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0015\u0010\u000fJ$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u0017\u001a\u00020\u0016H¦@¢\u0006\u0004\b\u0018\u0010\u0019J,\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH¦@¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001e\u0010\u000fJ$\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010 \u001a\u00020\u001fH¦@¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#H&¢\u0006\u0004\b%\u0010&¨\u0006'À\u0006\u0003"}, d2 = {"Lv24/a;", "", "Lf24/c;", "certificateType", "Lry/c;", "certKeyPair", "Liy/b0;", "peselTicket", "Ldx/i;", "Ldx/b;", "", "g", "(Lf24/c;Lry/c;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lf24/a;", "b", "(Lf24/c;Ltq/e;)Ljava/lang/Object;", "", "a", "(Ltq/e;)Ljava/lang/Object;", "h", "Loq/i0;", "c", "Lf24/i;", "parentDocumentType", "d", "(Lf24/i;Ltq/e;)Ljava/lang/Object;", "Lf24/b;", "newStatus", "i", "(Lf24/c;Lf24/b;Ltq/e;)Ljava/lang/Object;", "j", "", "onlyActive", "e", "(ZLtq/e;)Ljava/lang/Object;", "Lmu/g;", "Lf24/d;", "f", "()Lmu/g;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object a(e<? super i<? extends dx.b, ? extends List<CertificateData>>> eVar);

    Object b(c cVar, e<? super i<? extends dx.b, CertificateData>> eVar);

    Object c(c cVar, e<? super i<? extends dx.b, i0>> eVar);

    Object d(f24.i iVar, e<? super i<? extends dx.b, CertificateData>> eVar);

    Object e(boolean z15, e<? super i<? extends dx.b, ? extends c>> eVar);

    g<CertificateTypeStatus> f();

    Object g(c cVar, CertKeyPair certKeyPair, b0 b0Var, e<? super i<? extends dx.b, Integer>> eVar);

    Object h(c cVar, e<? super i<? extends dx.b, b0>> eVar);

    Object i(c cVar, f24.b bVar, e<? super i<? extends dx.b, i0>> eVar);

    Object j(c cVar, e<? super i<? extends dx.b, Integer>> eVar);
}
