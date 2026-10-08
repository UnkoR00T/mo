package x44;

import java.math.BigDecimal;
import mu.g;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lx44/b;", "", "", "c", "(Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "Lq44/a;", "a", "()Lmu/g;", "", "gateway", "gatewayMerchantId", "Ljava/math/BigDecimal;", "totalAmount", "merchantName", "Loq/i0;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)V", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    g<q44.a> a();

    void b(String gateway, String gatewayMerchantId, BigDecimal totalAmount, String merchantName);

    Object c(e<? super Boolean> eVar);
}
