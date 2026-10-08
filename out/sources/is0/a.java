package is0;

import fr.t;
import java.util.Iterator;
import java.util.List;
import js0.CardPaymentProcessDto;
import js0.CardPaymentResponse;
import js0.CardRegistrationProcessDto;
import js0.CardRegistrationResponse;
import js0.CardTokenDto;
import js0.RedirectDto;
import js0.RedirectRequestInfoDto;
import js0.StartCardPaymentRequest;
import js0.StartCardPaymentResponse;
import js0.StartCardRegistrationRequest;
import js0.StartCardRegistrationResponse;
import js0.UserCardDto;
import js0.d0;
import js0.j;
import js0.k;
import js0.n;
import oq.p;
import p071kotlin.Metadata;
import vr0.BECardPaymentProcess;
import vr0.BECardPaymentResponse;
import vr0.BECardRegistrationProcess;
import vr0.BECardRegistrationResponse;
import vr0.BECardToken;
import vr0.BERedirect;
import vr0.BERedirectRequestInfo;
import vr0.BEStartCardPaymentRequest;
import vr0.BEStartCardPaymentResponseDomain;
import vr0.BEStartCardRegistrationRequest;
import vr0.BEStartCardRegistrationResponse;
import vr0.BEUserCard;
import vr0.e;
import vr0.h;
import yr0.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010\"\u001a\u00020!*\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010&\u001a\u00020%*\u00020$¢\u0006\u0004\b&\u0010'\u001a\u0011\u0010*\u001a\u00020)*\u00020(¢\u0006\u0004\b*\u0010+\u001a\u0011\u0010.\u001a\u00020-*\u00020,¢\u0006\u0004\b.\u0010/\u001a\u0013\u00102\u001a\u000201*\u0004\u0018\u000100¢\u0006\u0004\b2\u00103\u001a\u0011\u00106\u001a\u000205*\u000204¢\u0006\u0004\b6\u00107\u001a\u0011\u0010:\u001a\u000209*\u000208¢\u0006\u0004\b:\u0010;\u001a\u0011\u0010>\u001a\u00020=*\u00020<¢\u0006\u0004\b>\u0010?\u001a\u0013\u0010B\u001a\u0004\u0018\u00010A*\u00020@¢\u0006\u0004\bB\u0010C¨\u0006D"}, d2 = {"Ljs0/f1;", "Lvr0/p;", "l", "(Ljs0/f1;)Lvr0/p;", "Lvr0/n;", "Ljs0/v0;", "q", "(Lvr0/n;)Ljs0/v0;", "Lvr0/l;", "Ljs0/t0;", "p", "(Lvr0/l;)Ljs0/t0;", "Lvr0/k;", "Ljs0/o0;", "o", "(Lvr0/k;)Ljs0/o0;", "Lvr0/i;", "Ljs0/o;", "n", "(Lvr0/i;)Ljs0/o;", "Ljs0/m;", "Lvr0/g;", "g", "(Ljs0/m;)Lvr0/g;", "Ljs0/n;", "Lvr0/h;", "h", "(Ljs0/n;)Lvr0/h;", "Ljs0/w0;", "Lvr0/o;", "k", "(Ljs0/w0;)Lvr0/o;", "Ljs0/n0;", "Lvr0/j;", "i", "(Ljs0/n0;)Lvr0/j;", "Ljs0/i;", "Lvr0/c;", "c", "(Ljs0/i;)Lvr0/c;", "Ljs0/j;", "Lvr0/d;", "d", "(Ljs0/j;)Lvr0/d;", "Ljs0/u0;", "Lvr0/m;", "j", "(Ljs0/u0;)Lvr0/m;", "Ljs0/f1$a;", "Lvr0/a;", "a", "(Ljs0/f1$a;)Lvr0/a;", "Ljs0/k;", "Lvr0/e;", "e", "(Ljs0/k;)Lvr0/e;", "Ljs0/l;", "Lvr0/f;", "f", "(Ljs0/l;)Lvr0/f;", "Ljs0/h;", "Lvr0/b;", "b", "(Ljs0/h;)Lvr0/b;", "Ljs0/d0;", "Lyr0/f;", "m", "(Ljs0/d0;)Lyr0/f;", "paymentservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: is0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C2262a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f96873b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f96874c;

        static {
            int[] iArr = new int[UserCardDto.a.values().length];
            try {
                iArr[UserCardDto.a.VIS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserCardDto.a.MCI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserCardDto.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f96872a = iArr;
            int[] iArr2 = new int[k.values().length];
            try {
                iArr2[k.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[k.CARDS_LIMIT_EXCEEDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[k.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f96873b = iArr2;
            int[] iArr3 = new int[d0.values().length];
            try {
                iArr3[d0.BLIK.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[d0.CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[d0.EXTERNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[d0.WALLET_GP.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[d0.WALLET_AP.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[d0.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            f96874c = iArr3;
        }
    }

    public static final vr0.a a(UserCardDto.a aVar) {
        int i15 = aVar == null ? -1 : C2262a.f96872a[aVar.ordinal()];
        if (i15 != -1) {
            if (i15 == 1) {
                return vr0.a.VIS;
            }
            if (i15 == 2) {
                return vr0.a.MCI;
            }
            if (i15 != 3) {
                throw new p();
            }
        }
        return vr0.a.UNKNOWN;
    }

    public static final BECardPaymentProcess b(CardPaymentProcessDto cardPaymentProcessDto) {
        return new BECardPaymentProcess(cardPaymentProcessDto.getTransactionId(), i(cardPaymentProcessDto.getRedirectRequest()));
    }

    public static final BECardPaymentResponse c(CardPaymentResponse cardPaymentResponse) {
        return new BECardPaymentResponse(d(cardPaymentResponse.getStatus()));
    }

    public static final vr0.d d(j jVar) {
        vr0.d next;
        Iterator<vr0.d> it = vr0.d.e().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!t.c(jVar.getValue(), next.getValue()));
        vr0.d dVar = next;
        return dVar == null ? vr0.d.UNKNOWN : dVar;
    }

    public static final e e(k kVar) {
        int i15 = C2262a.f96873b[kVar.ordinal()];
        if (i15 == 1) {
            return e.SUCCESS;
        }
        if (i15 == 2) {
            return e.CARDS_LIMIT_EXCEEDED;
        }
        if (i15 == 3) {
            return e.UNKNOWN;
        }
        throw new p();
    }

    public static final BECardRegistrationProcess f(CardRegistrationProcessDto cardRegistrationProcessDto) {
        return new BECardRegistrationProcess(cardRegistrationProcessDto.getReferenceId(), i(cardRegistrationProcessDto.getRedirectRequest()));
    }

    public static final BECardRegistrationResponse g(CardRegistrationResponse cardRegistrationResponse) {
        return new BECardRegistrationResponse(h(cardRegistrationResponse.getStatus()));
    }

    public static final h h(n nVar) {
        h next;
        Iterator<h> it = h.e().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!t.c(nVar.getValue(), next.getValue()));
        h hVar = next;
        return hVar == null ? h.UNKNOWN : hVar;
    }

    public static final BERedirect i(RedirectDto redirectDto) {
        return new BERedirect(redirectDto.getContentType(), redirectDto.getRedirectUrl(), redirectDto.getRequestBody(), redirectDto.e(), redirectDto.b());
    }

    public static final BEStartCardPaymentResponseDomain j(StartCardPaymentResponse startCardPaymentResponse) {
        e eVarE = e(startCardPaymentResponse.getStatus());
        CardPaymentProcessDto process = startCardPaymentResponse.getProcess();
        return new BEStartCardPaymentResponseDomain(eVarE, process != null ? b(process) : null);
    }

    public static final BEStartCardRegistrationResponse k(StartCardRegistrationResponse startCardRegistrationResponse) {
        e eVarE = e(startCardRegistrationResponse.getStatus());
        CardRegistrationProcessDto process = startCardRegistrationResponse.getProcess();
        return new BEStartCardRegistrationResponse(eVarE, process != null ? f(process) : null);
    }

    public static final BEUserCard l(UserCardDto userCardDto) {
        return new BEUserCard(userCardDto.getActive(), userCardDto.getActiveUntil(), a(userCardDto.getCardBrand()), userCardDto.getCardNumberMasked(), userCardDto.getCardTokenId(), userCardDto.getTokenNumber());
    }

    public static final f m(d0 d0Var) {
        switch (C2262a.f96874c[d0Var.ordinal()]) {
            case 1:
                return f.BLIK;
            case 2:
                return f.CARD;
            case 3:
                return f.EXTERNAL;
            case 4:
                return f.WALLET_GP;
            case 5:
                return f.WALLET_AP;
            case 6:
                return null;
            default:
                throw new p();
        }
    }

    public static final CardTokenDto n(BECardToken bECardToken) {
        return new CardTokenDto(bECardToken.getCardTokenId(), bECardToken.getTokenNumber());
    }

    public static final RedirectRequestInfoDto o(BERedirectRequestInfo bERedirectRequestInfo) {
        return new RedirectRequestInfoDto(bERedirectRequestInfo.getHeaderAccept(), bERedirectRequestInfo.getHeaderUserAgent(), bERedirectRequestInfo.getJavaScriptEnabled(), bERedirectRequestInfo.getScreenColorDepth(), bERedirectRequestInfo.getScreenHeight(), bERedirectRequestInfo.getScreenWidth());
    }

    public static final StartCardPaymentRequest p(BEStartCardPaymentRequest bEStartCardPaymentRequest) {
        String institutionId = bEStartCardPaymentRequest.getInstitutionId();
        List<String> listC = bEStartCardPaymentRequest.c();
        RedirectRequestInfoDto redirectRequestInfoDtoO = o(bEStartCardPaymentRequest.getRedirectRequestInfo());
        BECardToken cardToken = bEStartCardPaymentRequest.getCardToken();
        return new StartCardPaymentRequest(institutionId, listC, redirectRequestInfoDtoO, cardToken != null ? n(cardToken) : null, bEStartCardPaymentRequest.getRegisterCardToken());
    }

    public static final StartCardRegistrationRequest q(BEStartCardRegistrationRequest bEStartCardRegistrationRequest) {
        return new StartCardRegistrationRequest(o(bEStartCardRegistrationRequest.getRedirectRequestInfo()));
    }
}
