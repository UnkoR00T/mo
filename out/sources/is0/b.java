package is0;

import fr.t;
import java.util.Iterator;
import js0.CheckWalletPaymentStatusResponse;
import js0.GooglePaySendPaymentTokenRequest;
import js0.GooglePaySendPaymentTokenResponse;
import js0.GooglePayTokenDTO;
import js0.IntermediateSigningKeyDTO;
import js0.StartGooglePayPaymentRequest;
import js0.StartGooglePayPaymentResponse;
import js0.g1;
import js0.s;
import oq.p;
import p071kotlin.Metadata;
import xr0.BECheckWalletPaymentStatus;
import xr0.BEGooglePaySendPaymentTokenRequestModel;
import xr0.BEGooglePaySendPaymentTokenResponseModel;
import xr0.BEGooglePayTokenModel;
import xr0.BEIntermediateSigningKeyModel;
import xr0.BEStartGooglePayPaymentRequestModel;
import xr0.BEStartGooglePayPaymentResponseModel;
import xr0.i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010\"\u001a\u00020!*\u00020 ¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lxr0/g;", "Ljs0/x0;", "i", "(Lxr0/g;)Ljs0/x0;", "Ljs0/y0;", "Lxr0/h;", "d", "(Ljs0/y0;)Lxr0/h;", "Lxr0/c;", "Ljs0/t;", "h", "(Lxr0/c;)Ljs0/t;", "Lxr0/e;", "Ljs0/v;", "f", "(Lxr0/e;)Ljs0/v;", "Lxr0/f;", "Ljs0/z;", "g", "(Lxr0/f;)Ljs0/z;", "Ljs0/u;", "Lxr0/d;", "c", "(Ljs0/u;)Lxr0/d;", "Ljs0/s;", "Lxr0/b;", "b", "(Ljs0/s;)Lxr0/b;", "Ljs0/p;", "Lxr0/a;", "a", "(Ljs0/p;)Lxr0/a;", "Ljs0/g1;", "Lxr0/i;", "e", "(Ljs0/g1;)Lxr0/i;", "paymentservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96875a;

        static {
            int[] iArr = new int[g1.values().length];
            try {
                iArr[g1.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g1.ACCEPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g1.REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g1.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g1.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f96875a = iArr;
        }
    }

    public static final BECheckWalletPaymentStatus a(CheckWalletPaymentStatusResponse checkWalletPaymentStatusResponse) {
        return new BECheckWalletPaymentStatus(e(checkWalletPaymentStatusResponse.getWalletPaymentStatus()));
    }

    public static final xr0.b b(s sVar) {
        xr0.b next;
        Iterator<xr0.b> it = xr0.b.e().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!t.c(next.getValue(), sVar.getValue()));
        xr0.b bVar = next;
        return bVar == null ? xr0.b.UNKNOWN : bVar;
    }

    public static final BEGooglePaySendPaymentTokenResponseModel c(GooglePaySendPaymentTokenResponse googlePaySendPaymentTokenResponse) {
        return new BEGooglePaySendPaymentTokenResponseModel(b(googlePaySendPaymentTokenResponse.getPaymentStatus()));
    }

    public static final BEStartGooglePayPaymentResponseModel d(StartGooglePayPaymentResponse startGooglePayPaymentResponse) {
        return new BEStartGooglePayPaymentResponseModel(startGooglePayPaymentResponse.getGateway(), startGooglePayPaymentResponse.getGatewayMerchantId(), startGooglePayPaymentResponse.getTotalAmount(), startGooglePayPaymentResponse.getTransactionId());
    }

    public static final i e(g1 g1Var) {
        int i15 = a.f96875a[g1Var.ordinal()];
        if (i15 == 1) {
            return i.PENDING;
        }
        if (i15 == 2) {
            return i.ACCEPTED;
        }
        if (i15 == 3) {
            return i.REJECTED;
        }
        if (i15 == 4) {
            return i.FAILED;
        }
        if (i15 == 5) {
            return i.UNKNOWN;
        }
        throw new p();
    }

    public static final GooglePayTokenDTO f(BEGooglePayTokenModel bEGooglePayTokenModel) {
        return new GooglePayTokenDTO(g(bEGooglePayTokenModel.getIntermediateSigningKey()), bEGooglePayTokenModel.getProtocolVersion(), bEGooglePayTokenModel.getSignature(), bEGooglePayTokenModel.getSignedMessage());
    }

    public static final IntermediateSigningKeyDTO g(BEIntermediateSigningKeyModel bEIntermediateSigningKeyModel) {
        return new IntermediateSigningKeyDTO(bEIntermediateSigningKeyModel.a(), bEIntermediateSigningKeyModel.getSignedKey());
    }

    public static final GooglePaySendPaymentTokenRequest h(BEGooglePaySendPaymentTokenRequestModel bEGooglePaySendPaymentTokenRequestModel) {
        return new GooglePaySendPaymentTokenRequest(f(bEGooglePaySendPaymentTokenRequestModel.getGooglePayToken()), bEGooglePaySendPaymentTokenRequestModel.getTransactionId());
    }

    public static final StartGooglePayPaymentRequest i(BEStartGooglePayPaymentRequestModel bEStartGooglePayPaymentRequestModel) {
        return new StartGooglePayPaymentRequest(bEStartGooglePayPaymentRequestModel.getInstitutionId(), bEStartGooglePayPaymentRequestModel.b());
    }
}
