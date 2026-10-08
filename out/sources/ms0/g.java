package ms0;

import as0.BETransaction;
import as0.BETransactionDetailsDomain;
import dx.i;
import java.io.InputStream;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J:\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0012\u0010\u0010¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lms0/g;", "", "", "paymentId", "", "pageNumber", "pageSize", "Ldx/i;", "Ldx/b;", "", "Las0/a;", "c", "(Ljava/lang/String;IILtq/e;)Ljava/lang/Object;", "transactionId", "Las0/c;", "a", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ljava/io/InputStream;", "b", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g {
    Object a(String str, String str2, tq.e<? super i<? extends dx.b, BETransactionDetailsDomain>> eVar);

    Object b(String str, String str2, tq.e<? super i<? extends dx.b, ? extends InputStream>> eVar);

    Object c(String str, int i15, int i16, tq.e<? super i<? extends dx.b, ? extends List<BETransaction>>> eVar);
}
