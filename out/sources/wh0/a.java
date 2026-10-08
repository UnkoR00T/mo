package wh0;

import ay.Challenge;
import fr.t;
import fz.b;
import iy.c0;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import th0.AppActivationChallengeWithBeKeys;
import th0.AsyncAppActivationWithKeysResponse;
import th0.AsyncDocumentToGenerate;
import th0.BEChallengeResponse;
import th0.CertContainer;
import th0.ExternalCert;
import th0.GenerateActivationChallengeByPersonalSignatureRequest;
import th0.GenerateCertResponse;
import th0.GenerateCertificateSignedRequest;
import th0.InitExternalAuthInput;
import th0.InitExternalAuthMobileResponse;
import th0.IssuerDnMobileApi;
import th0.Jwt;
import th0.RefreshMainDocumentAsyncResponse;
import th0.RevokeUserCertificateMobileApiRequest;
import th0.RevokeUserCertificateMobileApiResponse;
import th0.UserCertificateMobileApi;
import th0.UserDnMobileApi;
import th0.q;
import xh0.AppActivationChallengeWithKeysResponseDto;
import xh0.AsyncAppActivationWithKeysResponseDto;
import xh0.CertContainerDtoDto;
import xh0.ChallengeDtoDto;
import xh0.DocumentToGenerateDtoDto;
import xh0.ExternalDomainCertDtoDto;
import xh0.GenerateActivationChallengeByPersonalSignatureRequestDtoDto;
import xh0.GenerateCertResponseDto;
import xh0.GenerateCertificateSignedRequestDto;
import xh0.InitExternalAuthInputDto;
import xh0.InitExternalAuthnMobileResponseDto;
import xh0.IssuerDnMobileApiDtoDto;
import xh0.JwtDtoDto;
import xh0.RefreshMobileIdCardAsyncResponseDto;
import xh0.RefreshRefugeeDocumentScopesAsyncResponseDto;
import xh0.RevokeUserCertificateMobileApiRequestDto;
import xh0.RevokedCertificateMobileApiDtoDto;
import xh0.UserCertificateMobileApiDtoDto;
import xh0.UserDnMobileApiDtoDto;
import xh0.b0;
import xh0.c;
import xh0.e;
import xh0.f;
import xh0.g;
import xh0.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000´\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010\"\u001a\u00020!*\u00020 ¢\u0006\u0004\b\"\u0010#J\u0011\u0010&\u001a\u00020%*\u00020$¢\u0006\u0004\b&\u0010'J\u0011\u0010*\u001a\u00020)*\u00020(¢\u0006\u0004\b*\u0010+J\u0011\u0010.\u001a\u00020-*\u00020,¢\u0006\u0004\b.\u0010/J\u0011\u00102\u001a\u000201*\u000200¢\u0006\u0004\b2\u00103J\u0011\u00105\u001a\u000201*\u000204¢\u0006\u0004\b5\u00106J\u0011\u00109\u001a\u000208*\u000207¢\u0006\u0004\b9\u0010:J\u0011\u0010=\u001a\u00020<*\u00020;¢\u0006\u0004\b=\u0010>J\u0011\u0010A\u001a\u00020@*\u00020?¢\u0006\u0004\bA\u0010BJ\u0011\u0010E\u001a\u00020D*\u00020C¢\u0006\u0004\bE\u0010FJ\u0011\u0010I\u001a\u00020H*\u00020G¢\u0006\u0004\bI\u0010JJ\u0011\u0010M\u001a\u00020L*\u00020K¢\u0006\u0004\bM\u0010NJ\u0011\u0010Q\u001a\u00020P*\u00020O¢\u0006\u0004\bQ\u0010RJ\u0011\u0010U\u001a\u00020T*\u00020S¢\u0006\u0004\bU\u0010VJ\u0011\u0010Y\u001a\u00020X*\u00020W¢\u0006\u0004\bY\u0010ZJ\u0011\u0010]\u001a\u00020\\*\u00020[¢\u0006\u0004\b]\u0010^J\u0011\u0010a\u001a\u00020`*\u00020_¢\u0006\u0004\ba\u0010bJ\u0011\u0010e\u001a\u00020d*\u00020c¢\u0006\u0004\be\u0010f¨\u0006g"}, d2 = {"Lwh0/a;", "", "<init>", "()V", "", "Lth0/u$a;", "t", "(Ljava/lang/String;)Lth0/u$a;", "Lxh0/h;", "Lth0/e;", "d", "(Lxh0/h;)Lth0/e;", "Lth0/k;", "Lxh0/p;", "x", "(Lth0/k;)Lxh0/p;", "Lxh0/q;", "Lth0/l;", "i", "(Lxh0/q;)Lth0/l;", "Lxh0/k;", "Lth0/g;", "g", "(Lxh0/k;)Lth0/g;", "Lxh0/j;", "Lth0/g$a;", "f", "(Lxh0/j;)Lth0/g$a;", "Lth0/k$a;", "Lxh0/f;", "u", "(Lth0/k$a;)Lxh0/f;", "Lth0/j;", "Lxh0/o;", "w", "(Lth0/j;)Lxh0/o;", "Lxh0/n;", "Lth0/i;", "h", "(Lxh0/n;)Lth0/i;", "Lxh0/d;", "Lth0/f;", "e", "(Lxh0/d;)Lth0/f;", "Lxh0/a;", "Lth0/b;", "a", "(Lxh0/a;)Lth0/b;", "Lxh0/u;", "Lth0/p;", "l", "(Lxh0/u;)Lth0/p;", "Lxh0/v;", "m", "(Lxh0/v;)Lth0/p;", "Lxh0/s;", "Lth0/n;", "k", "(Lxh0/s;)Lth0/n;", "Lxh0/r;", "Lth0/m;", "j", "(Lxh0/r;)Lth0/m;", "Lxh0/c0;", "Lth0/u;", "s", "(Lxh0/c0;)Lth0/u;", "Lxh0/g;", "Lth0/t$b;", "q", "(Lxh0/g;)Lth0/t$b;", "Lxh0/b0;", "Lth0/t$a;", "p", "(Lxh0/b0;)Lth0/t$a;", "Lxh0/e;", "Lth0/q;", "n", "(Lxh0/e;)Lth0/q;", "Lxh0/a0;", "Lth0/t;", "r", "(Lxh0/a0;)Lth0/t;", "Lth0/r;", "Lxh0/w;", "y", "(Lth0/r;)Lxh0/w;", "Lxh0/y;", "Lth0/s;", "o", "(Lxh0/y;)Lth0/s;", "Lxh0/i;", "Lth0/d;", "c", "(Lxh0/i;)Lth0/d;", "Lth0/h;", "Lxh0/l;", "v", "(Lth0/h;)Lxh0/l;", "Lxh0/b;", "Lth0/c;", "b", "(Lxh0/b;)Lth0/c;", "authenticationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f213304a = new a();

    /* JADX INFO: renamed from: wh0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C5635a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f213305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f213306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f213307c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f213308d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f213309e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f213310f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f213311g;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.WK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.PZ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f213305a = iArr;
            int[] iArr2 = new int[f.values().length];
            try {
                iArr2[f.DIIA_PL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[f.MOBILE_ID_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[f.PHYSICAL_CARD_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[f.SCHOOL_STUDENT_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[f.UNIVERSITY_STUDENT_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f213306b = iArr2;
            int[] iArr3 = new int[InitExternalAuthInput.a.values().length];
            try {
                iArr3[InitExternalAuthInput.a.DIIA_PL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[InitExternalAuthInput.a.MOBILE_ID_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[InitExternalAuthInput.a.PHYSICAL_CARD_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[InitExternalAuthInput.a.SCHOOL_STUDENT_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[InitExternalAuthInput.a.UNIVERSITY_STUDENT_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[InitExternalAuthInput.a.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f213307c = iArr3;
            int[] iArr4 = new int[c.values().length];
            try {
                iArr4[c.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[c.CONFIRMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[c.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[c.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[c.TIMED_OUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[c.REJECTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[c.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            f213308d = iArr4;
            int[] iArr5 = new int[g.values().length];
            try {
                iArr5[g.CITIZEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[g.REFUGEE.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[g.UNIVERSITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[g.SCHOOL.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            f213309e = iArr5;
            int[] iArr6 = new int[b0.values().length];
            try {
                iArr6[b0.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr6[b0.REVOKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr6[b0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused28) {
            }
            f213310f = iArr6;
            int[] iArr7 = new int[e.values().length];
            try {
                iArr7[e.USER_REVOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr7[e.CERTIFICATES_LIMIT_REACHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr7[e.CERTIFICATE_EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[e.USER_DEATH.ordinal()] = 4;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr7[e.USER_PERSONAL_DATA_CHANGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[e.ADMIN_REVOCATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr7[e.CALL_CENTER_REVOCATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr7[e.VALID_PERIOD_EXCEEDED.ordinal()] = 8;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr7[e.MANUALLY_UPDATE.ordinal()] = 9;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr7[e.ID_CARD_INVALIDATED_REFRESH.ordinal()] = 10;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr7[e.ID_CARD_INVALIDATED_SUBSCRIPTION.ordinal()] = 11;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr7[e.STUDENT_USER_REVOCATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr7[e.USER_SUBSCRIPTION_CANCELLED.ordinal()] = 13;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr7[e.USER_UKR_STATUS_LOSS.ordinal()] = 14;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr7[e.USER_PESEL_CHANGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr7[e.MOBILE_APP_UNINSTALLED.ordinal()] = 16;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr7[e.UNKNOWN.ordinal()] = 17;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr7[e.CERTIFICATE_ACTIVATION_ERROR.ordinal()] = 18;
            } catch (NoSuchFieldError unused46) {
            }
            f213311g = iArr7;
        }
    }

    private a() {
    }

    private final UserDnMobileApi.a t(String str) {
        if (!t.c(str, "PL") && t.c(str, "UA")) {
            return UserDnMobileApi.a.UA;
        }
        return UserDnMobileApi.a.PL;
    }

    public final AppActivationChallengeWithBeKeys a(AppActivationChallengeWithKeysResponseDto appActivationChallengeWithKeysResponseDto) {
        return new AppActivationChallengeWithBeKeys(c0.g(appActivationChallengeWithKeysResponseDto.getActivationChallenge()), appActivationChallengeWithKeysResponseDto.getActiveDeviceName());
    }

    public final AsyncAppActivationWithKeysResponse b(AsyncAppActivationWithKeysResponseDto asyncAppActivationWithKeysResponseDto) {
        return new AsyncAppActivationWithKeysResponse(c(asyncAppActivationWithKeysResponseDto.getDocumentToGenerate()), c0.g(asyncAppActivationWithKeysResponseDto.getPeselTicket()), c0.g(asyncAppActivationWithKeysResponseDto.getSourceDocumentAccessToken()), e(asyncAppActivationWithKeysResponseDto.getUserCertificateWithKeys()));
    }

    public final AsyncDocumentToGenerate c(DocumentToGenerateDtoDto documentToGenerateDtoDto) {
        return new AsyncDocumentToGenerate(documentToGenerateDtoDto.getAsyncDownloadTerminationInterval(), documentToGenerateDtoDto.getDocumentId(), documentToGenerateDtoDto.getTaskId());
    }

    public final BEChallengeResponse d(ChallengeDtoDto challengeDtoDto) {
        return new BEChallengeResponse(new Challenge(c0.g(challengeDtoDto.getChallenge())), new b.OffsetDateTime(challengeDtoDto.getServerCurrentTime()));
    }

    public final CertContainer e(CertContainerDtoDto certContainerDtoDto) {
        return new CertContainer(certContainerDtoDto.getCertPKCS12Base64(), certContainerDtoDto.getCertPKCS12AESSecretKeyBase64(), certContainerDtoDto.getPublicCertBase64(), certContainerDtoDto.getPasswordPKCS12Base64());
    }

    public final ExternalCert.a f(j jVar) {
        int i15 = C5635a.f213305a[jVar.ordinal()];
        if (i15 == 1) {
            return ExternalCert.a.WK;
        }
        if (i15 == 2) {
            return ExternalCert.a.PZ;
        }
        if (i15 == 3) {
            return ExternalCert.a.UNKNOWN;
        }
        throw new p();
    }

    public final ExternalCert g(ExternalDomainCertDtoDto externalDomainCertDtoDto) {
        return new ExternalCert(f(externalDomainCertDtoDto.getType()), externalDomainCertDtoDto.getUrl(), externalDomainCertDtoDto.getCert());
    }

    public final GenerateCertResponse h(GenerateCertResponseDto generateCertResponseDto) {
        return new GenerateCertResponse(e(generateCertResponseDto.getUserCertificate()), generateCertResponseDto.getPeselTicket());
    }

    public final InitExternalAuthMobileResponse i(InitExternalAuthnMobileResponseDto initExternalAuthnMobileResponseDto) {
        iy.b0 b0VarG = c0.g(initExternalAuthnMobileResponseDto.getExternalToken());
        List<ExternalDomainCertDtoDto> listA = initExternalAuthnMobileResponseDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(f213304a.g((ExternalDomainCertDtoDto) it.next()));
        }
        return new InitExternalAuthMobileResponse(b0VarG, arrayList, initExternalAuthnMobileResponseDto.getSuccessRedirectUrl());
    }

    public final IssuerDnMobileApi j(IssuerDnMobileApiDtoDto issuerDnMobileApiDtoDto) {
        return new IssuerDnMobileApi(issuerDnMobileApiDtoDto.getC(), issuerDnMobileApiDtoDto.getCn(), issuerDnMobileApiDtoDto.getO());
    }

    public final Jwt k(JwtDtoDto jwtDtoDto) {
        return new Jwt(c0.g(jwtDtoDto.getToken()), jwtDtoDto.getValidityInSeconds(), jwtDtoDto.getCertificateRenewalRequired(), jwtDtoDto.getCertificateExpiryDate());
    }

    public final RefreshMainDocumentAsyncResponse l(RefreshMobileIdCardAsyncResponseDto refreshMobileIdCardAsyncResponseDto) {
        return new RefreshMainDocumentAsyncResponse(c(refreshMobileIdCardAsyncResponseDto.getDocumentToGenerate()), c0.g(refreshMobileIdCardAsyncResponseDto.getSourceDocumentAccessToken()));
    }

    public final RefreshMainDocumentAsyncResponse m(RefreshRefugeeDocumentScopesAsyncResponseDto refreshRefugeeDocumentScopesAsyncResponseDto) {
        return new RefreshMainDocumentAsyncResponse(c(refreshRefugeeDocumentScopesAsyncResponseDto.getDocumentToGenerate()), c0.g(refreshRefugeeDocumentScopesAsyncResponseDto.getSourceDocumentAccessToken()));
    }

    public final q n(e eVar) {
        switch (C5635a.f213311g[eVar.ordinal()]) {
            case 1:
                return q.USER_REVOCATION;
            case 2:
                return q.CERTIFICATES_LIMIT_REACHED;
            case 3:
                return q.CERTIFICATE_EXPIRED;
            case 4:
                return q.USER_DEATH;
            case 5:
                return q.USER_PERSONAL_DATA_CHANGE;
            case 6:
                return q.ADMIN_REVOCATION;
            case 7:
                return q.CALL_CENTER_REVOCATION;
            case 8:
                return q.VALID_PERIOD_EXCEEDED;
            case 9:
                return q.MANUALLY_UPDATE;
            case 10:
                return q.ID_CARD_INVALIDATED_REFRESH;
            case 11:
                return q.ID_CARD_INVALIDATED_SUBSCRIPTION;
            case 12:
                return q.STUDENT_USER_REVOCATION;
            case 13:
                return q.USER_SUBSCRIPTION_CANCELLED;
            case 14:
                return q.USER_UKR_STATUS_LOSS;
            case 15:
                return q.USER_PESEL_CHANGE;
            case 16:
            case 17:
            case 18:
                return q.UNKNOWN;
            default:
                throw new p();
        }
    }

    public final RevokeUserCertificateMobileApiResponse o(RevokedCertificateMobileApiDtoDto revokedCertificateMobileApiDtoDto) {
        return new RevokeUserCertificateMobileApiResponse(c0.g(revokedCertificateMobileApiDtoDto.getSerialNumber()), n(revokedCertificateMobileApiDtoDto.getReason()), revokedCertificateMobileApiDtoDto.getRevokeDate());
    }

    public final UserCertificateMobileApi.a p(b0 b0Var) {
        int i15 = C5635a.f213310f[b0Var.ordinal()];
        if (i15 == 1) {
            return UserCertificateMobileApi.a.ACTIVE;
        }
        if (i15 == 2) {
            return UserCertificateMobileApi.a.REVOKED;
        }
        if (i15 == 3) {
            return UserCertificateMobileApi.a.UNKNOWN;
        }
        throw new p();
    }

    public final UserCertificateMobileApi.b q(g gVar) {
        int i15 = C5635a.f213309e[gVar.ordinal()];
        if (i15 == 1) {
            return UserCertificateMobileApi.b.CITIZEN;
        }
        if (i15 == 2) {
            return UserCertificateMobileApi.b.REFUGEE;
        }
        if (i15 != 3) {
            return i15 != 4 ? UserCertificateMobileApi.b.UNKNOWN : UserCertificateMobileApi.b.SCHOOL;
        }
        return UserCertificateMobileApi.b.UNIVERSITY;
    }

    public final UserCertificateMobileApi r(UserCertificateMobileApiDtoDto userCertificateMobileApiDtoDto) {
        String pesel = userCertificateMobileApiDtoDto.getPesel();
        String givenNames = userCertificateMobileApiDtoDto.getGivenNames();
        String lastName = userCertificateMobileApiDtoDto.getLastName();
        String serialNumber = userCertificateMobileApiDtoDto.getSerialNumber();
        String dn4 = userCertificateMobileApiDtoDto.getDn();
        UserDnMobileApi userDnMobileApiS = s(userCertificateMobileApiDtoDto.getDecodedDn());
        OffsetDateTime validFrom = userCertificateMobileApiDtoDto.getValidFrom();
        OffsetDateTime validTo = userCertificateMobileApiDtoDto.getValidTo();
        String issuerCertDn = userCertificateMobileApiDtoDto.getIssuerCertDn();
        IssuerDnMobileApi issuerDnMobileApiJ = j(userCertificateMobileApiDtoDto.getDecodedIssuerCertDn());
        String deviceName = userCertificateMobileApiDtoDto.getDeviceName();
        OffsetDateTime revokeDate = userCertificateMobileApiDtoDto.getRevokeDate();
        UserCertificateMobileApi.b bVarQ = q(userCertificateMobileApiDtoDto.getType());
        UserCertificateMobileApi.a aVarP = p(userCertificateMobileApiDtoDto.getStatus());
        e revokeReason = userCertificateMobileApiDtoDto.getRevokeReason();
        return new UserCertificateMobileApi(pesel, givenNames, lastName, serialNumber, dn4, userDnMobileApiS, validFrom, validTo, issuerCertDn, issuerDnMobileApiJ, deviceName, revokeDate, bVarQ, aVarP, revokeReason != null ? n(revokeReason) : null);
    }

    public final UserDnMobileApi s(UserDnMobileApiDtoDto userDnMobileApiDtoDto) {
        String country = userDnMobileApiDtoDto.getCountry();
        return new UserDnMobileApi(country != null ? t(country) : null, userDnMobileApiDtoDto.getSerialNumber(), userDnMobileApiDtoDto.getLastName(), userDnMobileApiDtoDto.getGivenNames(), userDnMobileApiDtoDto.getCn());
    }

    public final f u(InitExternalAuthInput.a aVar) {
        switch (C5635a.f213307c[aVar.ordinal()]) {
            case 1:
                return f.DIIA_PL;
            case 2:
                return f.MOBILE_ID_CARD;
            case 3:
                return f.PHYSICAL_CARD_ID;
            case 4:
                return f.SCHOOL_STUDENT_CARD;
            case 5:
                return f.UNIVERSITY_STUDENT_CARD;
            case 6:
                throw new IllegalArgumentException("Cannot parse UNKNOWN to Dto");
            default:
                throw new p();
        }
    }

    public final GenerateActivationChallengeByPersonalSignatureRequestDtoDto v(GenerateActivationChallengeByPersonalSignatureRequest generateActivationChallengeByPersonalSignatureRequest) {
        return new GenerateActivationChallengeByPersonalSignatureRequestDtoDto(generateActivationChallengeByPersonalSignatureRequest.getTokenSignedByPersonalId());
    }

    public final GenerateCertificateSignedRequestDto w(GenerateCertificateSignedRequest generateCertificateSignedRequest) {
        iy.b0 signedRequest = generateCertificateSignedRequest.getSignedRequest();
        return new GenerateCertificateSignedRequestDto(signedRequest != null ? c0.e(signedRequest) : null);
    }

    public final InitExternalAuthInputDto x(InitExternalAuthInput initExternalAuthInput) {
        return new InitExternalAuthInputDto(u(initExternalAuthInput.getCertificateSourceDocumentType()));
    }

    public final RevokeUserCertificateMobileApiRequestDto y(RevokeUserCertificateMobileApiRequest revokeUserCertificateMobileApiRequest) {
        return new RevokeUserCertificateMobileApiRequestDto(c0.e(revokeUserCertificateMobileApiRequest.getChallenge()), c0.e(revokeUserCertificateMobileApiRequest.getValue()));
    }
}
