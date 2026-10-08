package ms0;

import dx.i;
import java.io.InputStream;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import yr0.BEPaymentDetails;
import yr0.BEPaymentInfo;
import yr0.BEPaymentWidgetDataResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0012\u0010\bJ$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0014\u0010\bJ$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0015\u0010\bJ$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0016\u0010\bJ\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00170\u0004H¦@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lms0/e;", "", "", "paymentId", "Ldx/i;", "Ldx/b;", "Ljava/io/InputStream;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lyr0/g;", "paymentGroup", "", "pageNumber", "", "Lyr0/h;", "f", "(Lyr0/g;ILtq/e;)Ljava/lang/Object;", "Lyr0/e;", "e", "Loq/i0;", "c", "b", "g", "Lyr0/p;", "d", "(Ltq/e;)Ljava/lang/Object;", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {
    Object a(String str, tq.e<? super i<? extends dx.b, ? extends InputStream>> eVar);

    Object b(String str, tq.e<? super i<? extends dx.b, i0>> eVar);

    Object c(String str, tq.e<? super i<? extends dx.b, i0>> eVar);

    Object d(tq.e<? super i<? extends dx.b, BEPaymentWidgetDataResponse>> eVar);

    Object e(String str, tq.e<? super i<? extends dx.b, BEPaymentDetails>> eVar);

    Object f(yr0.g gVar, int i15, tq.e<? super i<? extends dx.b, ? extends List<BEPaymentInfo>>> eVar);

    Object g(String str, tq.e<? super i<? extends dx.b, i0>> eVar);
}
