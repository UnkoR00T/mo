package ms0;

import dx.i;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import vr0.BECardPaymentResponse;
import vr0.BECardRegistrationResponse;
import vr0.BEStartCardPaymentRequest;
import vr0.BEStartCardPaymentResponseDomain;
import vr0.BEStartCardRegistrationRequest;
import vr0.BEStartCardRegistrationResponse;
import vr0.BEUserCard;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u000f\u001a\u00020\nH¦@¢\u0006\u0004\b\u0010\u0010\u000eJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u00042\u0006\u0010\u000f\u001a\u00020\nH¦@¢\u0006\u0004\b\u0012\u0010\u000eJ$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u00042\u0006\u0010\u0014\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0016\u0010\u0017J,\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH¦@¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c0\u00042\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH¦@¢\u0006\u0004\b\u001d\u0010\u001bJ$\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020 0\u00042\u0006\u0010\u001f\u001a\u00020\u001eH¦@¢\u0006\u0004\b!\u0010\"¨\u0006#À\u0006\u0003"}, d2 = {"Lms0/b;", "", "", "onlyActive", "Ldx/i;", "Ldx/b;", "", "Lvr0/p;", "h", "(ZLtq/e;)Ljava/lang/Object;", "", "cardTokenId", "Loq/i0;", "c", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "referenceId", "f", "Lvr0/g;", "b", "Lvr0/n;", "startCardRegistrationRequest", "Lvr0/o;", "d", "(Lvr0/n;Ltq/e;)Ljava/lang/Object;", "transactionId", "institutionId", "e", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lvr0/c;", "a", "Lvr0/l;", "startCardPaymentRequest", "Lvr0/m;", "g", "(Lvr0/l;Ltq/e;)Ljava/lang/Object;", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    Object a(String str, String str2, tq.e<? super i<? extends dx.b, BECardPaymentResponse>> eVar);

    Object b(String str, tq.e<? super i<? extends dx.b, BECardRegistrationResponse>> eVar);

    Object c(String str, tq.e<? super i<? extends dx.b, i0>> eVar);

    Object d(BEStartCardRegistrationRequest bEStartCardRegistrationRequest, tq.e<? super i<? extends dx.b, BEStartCardRegistrationResponse>> eVar);

    Object e(String str, String str2, tq.e<? super i<? extends dx.b, i0>> eVar);

    Object f(String str, tq.e<? super i<? extends dx.b, i0>> eVar);

    Object g(BEStartCardPaymentRequest bEStartCardPaymentRequest, tq.e<? super i<? extends dx.b, BEStartCardPaymentResponseDomain>> eVar);

    Object h(boolean z15, tq.e<? super i<? extends dx.b, ? extends List<BEUserCard>>> eVar);
}
