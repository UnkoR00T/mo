package ms0;

import dx.i;
import oq.i0;
import p071kotlin.Metadata;
import xr0.BECheckWalletPaymentStatus;
import xr0.BEGooglePaySendPaymentTokenRequestModel;
import xr0.BEGooglePaySendPaymentTokenResponseModel;
import xr0.BEStartGooglePayPaymentRequestModel;
import xr0.BEStartGooglePayPaymentResponseModel;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0014\u0010\u0012¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lms0/c;", "", "Lxr0/g;", "startGooglePayPaymentRequestModel", "Ldx/i;", "Ldx/b;", "Lxr0/h;", "c", "(Lxr0/g;Ltq/e;)Ljava/lang/Object;", "Lxr0/c;", "googlePaySendPaymentTokenRequestModel", "Lxr0/d;", "d", "(Lxr0/c;Ltq/e;)Ljava/lang/Object;", "", "transactionId", "Loq/i0;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lxr0/a;", "b", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {
    Object a(String str, tq.e<? super i<? extends dx.b, i0>> eVar);

    Object b(String str, tq.e<? super i<? extends dx.b, BECheckWalletPaymentStatus>> eVar);

    Object c(BEStartGooglePayPaymentRequestModel bEStartGooglePayPaymentRequestModel, tq.e<? super i<? extends dx.b, BEStartGooglePayPaymentResponseModel>> eVar);

    Object d(BEGooglePaySendPaymentTokenRequestModel bEGooglePaySendPaymentTokenRequestModel, tq.e<? super i<? extends dx.b, BEGooglePaySendPaymentTokenResponseModel>> eVar);
}
