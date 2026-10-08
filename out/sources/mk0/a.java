package mk0;

import gu.d;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jk0.ExternalQualifiedSignatureAuthenticateRequest;
import jk0.ExternalQualifiedSignatureAuthenticateResponse;
import jk0.ExternalQualifiedSignatureAuthorizationResponse;
import jk0.ExternalQualifiedSignatureAuthorizationStatusResponse;
import jk0.ExternalQualifiedSignatureCompleteAuthorizationRequest;
import jk0.ExternalQualifiedSignatureGenerateProviderEntryUrlRequest;
import jk0.ExternalQualifiedSignatureProviderTemporaryInterruption;
import jk0.ExternalQualifiedSignatureStartAuthenticationRequest;
import jk0.ExternalQualifiedSignatureStartResponse;
import jk0.QualifiedSignatureInfo;
import jk0.QualifiedSignatureProviderEntryResponse;
import jk0.QualifiedSignatureProviderMobile;
import jk0.c;
import jk0.p;
import nk0.ExternalQualifiedSignatureAuthenticateRequestDto;
import nk0.ExternalQualifiedSignatureAuthenticateResponseDto;
import nk0.ExternalQualifiedSignatureAuthorizationResponseDto;
import nk0.ExternalQualifiedSignatureAuthorizationStatusResponseDto;
import nk0.ExternalQualifiedSignatureCompleteAuthorizationRequestDto;
import nk0.ExternalQualifiedSignatureGenerateProviderEntryUrlRequestDto;
import nk0.ExternalQualifiedSignatureGenerateProviderEntryUrlResponseDto;
import nk0.ExternalQualifiedSignatureProviderMobileDto;
import nk0.ExternalQualifiedSignatureProviderTemporaryInterruptionDto;
import nk0.ExternalQualifiedSignatureProvidersMobileInfoDto;
import nk0.ExternalQualifiedSignatureStartAuthenticationRequestDto;
import nk0.ExternalQualifiedSignatureStartResponseDto;
import nk0.e;
import nk0.m;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010\"\u001a\u00020!*\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010&\u001a\u00020%*\u00020$¢\u0006\u0004\b&\u0010'\u001a\u0011\u0010*\u001a\u00020)*\u00020(¢\u0006\u0004\b*\u0010+\u001a\u0011\u0010.\u001a\u00020-*\u00020,¢\u0006\u0004\b.\u0010/\u001a\u0011\u00102\u001a\u000201*\u000200¢\u0006\u0004\b2\u00103\u001a\u0011\u00106\u001a\u000205*\u000204¢\u0006\u0004\b6\u00107\u001a\u0011\u0010:\u001a\u000209*\u000208¢\u0006\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lnk0/l;", "Ljk0/m;", "g", "(Lnk0/l;)Ljk0/m;", "Lnk0/j;", "Ljk0/o;", "i", "(Lnk0/j;)Ljk0/o;", "Lnk0/k;", "Ljk0/i;", "e", "(Lnk0/k;)Ljk0/i;", "Ljk0/h;", "Lnk0/h;", "m", "(Ljk0/h;)Lnk0/h;", "Lnk0/i;", "Ljk0/n;", "h", "(Lnk0/i;)Ljk0/n;", "Lnk0/o;", "Ljk0/k;", "f", "(Lnk0/o;)Ljk0/k;", "Ljk0/j;", "Lnk0/n;", "o", "(Ljk0/j;)Lnk0/n;", "Ljk0/p;", "Lnk0/m;", "n", "(Ljk0/p;)Lnk0/m;", "Lnk0/b;", "Ljk0/b;", "a", "(Lnk0/b;)Ljk0/b;", "Ljk0/a;", "Lnk0/a;", "j", "(Ljk0/a;)Lnk0/a;", "Ljk0/c;", "Lnk0/c;", "k", "(Ljk0/c;)Lnk0/c;", "Ljk0/g;", "Lnk0/g;", "l", "(Ljk0/g;)Lnk0/g;", "Lnk0/f;", "Ljk0/f;", "d", "(Lnk0/f;)Ljk0/f;", "Lnk0/e;", "Ljk0/e;", "c", "(Lnk0/e;)Ljk0/e;", "Lnk0/d;", "Ljk0/d;", "b", "(Lnk0/d;)Ljk0/d;", "digitalservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: mk0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C3130a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f126960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f126961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f126962c;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.QR_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.DEEPLINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f126960a = iArr;
            int[] iArr2 = new int[c.values().length];
            try {
                iArr2[c.CONFIRM.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[c.REJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f126961b = iArr2;
            int[] iArr3 = new int[e.values().length];
            try {
                iArr3[e.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[e.NOT_PRESENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[e.CONFIRMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[e.REJECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[e.EXPIRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[e.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            f126962c = iArr3;
        }
    }

    public static final ExternalQualifiedSignatureAuthenticateResponse a(ExternalQualifiedSignatureAuthenticateResponseDto externalQualifiedSignatureAuthenticateResponseDto) {
        return new ExternalQualifiedSignatureAuthenticateResponse(externalQualifiedSignatureAuthenticateResponseDto.getProviderProcessUrl());
    }

    public static final ExternalQualifiedSignatureAuthorizationResponse b(ExternalQualifiedSignatureAuthorizationResponseDto externalQualifiedSignatureAuthorizationResponseDto) {
        return new ExternalQualifiedSignatureAuthorizationResponse(externalQualifiedSignatureAuthorizationResponseDto.getRedirectUrl());
    }

    public static final jk0.e c(e eVar) {
        switch (C3130a.f126962c[eVar.ordinal()]) {
            case 1:
                return jk0.e.ACTIVE;
            case 2:
                return jk0.e.NOT_PRESENT;
            case 3:
                return jk0.e.CONFIRMED;
            case 4:
                return jk0.e.REJECTED;
            case 5:
                return jk0.e.EXPIRED;
            case 6:
                return jk0.e.UNKNOWN;
            default:
                throw new oq.p();
        }
    }

    public static final ExternalQualifiedSignatureAuthorizationStatusResponse d(ExternalQualifiedSignatureAuthorizationStatusResponseDto externalQualifiedSignatureAuthorizationStatusResponseDto) {
        return new ExternalQualifiedSignatureAuthorizationStatusResponse(c(externalQualifiedSignatureAuthorizationStatusResponseDto.getStatus()), externalQualifiedSignatureAuthorizationStatusResponseDto.getExpirationDateTime());
    }

    public static final ExternalQualifiedSignatureProviderTemporaryInterruption e(ExternalQualifiedSignatureProviderTemporaryInterruptionDto externalQualifiedSignatureProviderTemporaryInterruptionDto) {
        return new ExternalQualifiedSignatureProviderTemporaryInterruption(externalQualifiedSignatureProviderTemporaryInterruptionDto.getMessage(), externalQualifiedSignatureProviderTemporaryInterruptionDto.getTitle());
    }

    public static final ExternalQualifiedSignatureStartResponse f(ExternalQualifiedSignatureStartResponseDto externalQualifiedSignatureStartResponseDto) {
        Map<String, String> mapA = externalQualifiedSignatureStartResponseDto.a();
        b0 b0VarG = c0.g(externalQualifiedSignatureStartResponseDto.getEncryptionKey());
        b0 b0VarG2 = c0.g(externalQualifiedSignatureStartResponseDto.getEncryptionKeyId());
        String providerName = externalQualifiedSignatureStartResponseDto.getProviderName();
        List<String> listE = externalQualifiedSignatureStartResponseDto.e();
        gu.b.Companion companion = gu.b.INSTANCE;
        return new ExternalQualifiedSignatureStartResponse(mapA, b0VarG, b0VarG2, providerName, listE, d.r(externalQualifiedSignatureStartResponseDto.getTokenTtlInSeconds(), gu.e.SECONDS), null);
    }

    public static final QualifiedSignatureInfo g(ExternalQualifiedSignatureProvidersMobileInfoDto externalQualifiedSignatureProvidersMobileInfoDto) {
        int availableFreeSignatures = externalQualifiedSignatureProvidersMobileInfoDto.getAvailableFreeSignatures();
        List<ExternalQualifiedSignatureProviderMobileDto> listB = externalQualifiedSignatureProvidersMobileInfoDto.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(i((ExternalQualifiedSignatureProviderMobileDto) it.next()));
        }
        return new QualifiedSignatureInfo(availableFreeSignatures, arrayList);
    }

    public static final QualifiedSignatureProviderEntryResponse h(ExternalQualifiedSignatureGenerateProviderEntryUrlResponseDto externalQualifiedSignatureGenerateProviderEntryUrlResponseDto) {
        return new QualifiedSignatureProviderEntryResponse(externalQualifiedSignatureGenerateProviderEntryUrlResponseDto.getProviderEntryUrl());
    }

    public static final QualifiedSignatureProviderMobile i(ExternalQualifiedSignatureProviderMobileDto externalQualifiedSignatureProviderMobileDto) {
        String icon = externalQualifiedSignatureProviderMobileDto.getIcon();
        String id5 = externalQualifiedSignatureProviderMobileDto.getId();
        String subtitle = externalQualifiedSignatureProviderMobileDto.getSubtitle();
        String title = externalQualifiedSignatureProviderMobileDto.getTitle();
        boolean pushAuthorizationEnabled = externalQualifiedSignatureProviderMobileDto.getPushAuthorizationEnabled();
        ExternalQualifiedSignatureProviderTemporaryInterruptionDto temporaryInterruption = externalQualifiedSignatureProviderMobileDto.getTemporaryInterruption();
        return new QualifiedSignatureProviderMobile(icon, id5, subtitle, title, pushAuthorizationEnabled, temporaryInterruption != null ? e(temporaryInterruption) : null);
    }

    public static final ExternalQualifiedSignatureAuthenticateRequestDto j(ExternalQualifiedSignatureAuthenticateRequest externalQualifiedSignatureAuthenticateRequest) {
        return new ExternalQualifiedSignatureAuthenticateRequestDto(c0.e(externalQualifiedSignatureAuthenticateRequest.getEncryptedMobileIdSignature()), c0.e(externalQualifiedSignatureAuthenticateRequest.getEncryptedPersonalIdSignature()));
    }

    public static final nk0.c k(c cVar) {
        int i15 = C3130a.f126961b[cVar.ordinal()];
        if (i15 == 1) {
            return nk0.c.CONFIRM;
        }
        if (i15 == 2) {
            return nk0.c.REJECT;
        }
        throw new oq.p();
    }

    public static final ExternalQualifiedSignatureCompleteAuthorizationRequestDto l(ExternalQualifiedSignatureCompleteAuthorizationRequest externalQualifiedSignatureCompleteAuthorizationRequest) {
        return new ExternalQualifiedSignatureCompleteAuthorizationRequestDto(c0.e(externalQualifiedSignatureCompleteAuthorizationRequest.getSignedDataToken()));
    }

    public static final ExternalQualifiedSignatureGenerateProviderEntryUrlRequestDto m(ExternalQualifiedSignatureGenerateProviderEntryUrlRequest externalQualifiedSignatureGenerateProviderEntryUrlRequest) {
        return new ExternalQualifiedSignatureGenerateProviderEntryUrlRequestDto(externalQualifiedSignatureGenerateProviderEntryUrlRequest.getProviderId());
    }

    public static final m n(p pVar) {
        int i15 = C3130a.f126960a[pVar.ordinal()];
        if (i15 == 1) {
            return m.QR_CODE;
        }
        if (i15 == 2) {
            return m.DEEPLINK;
        }
        if (i15 == 3) {
            return m.UNKNOWN;
        }
        throw new oq.p();
    }

    public static final ExternalQualifiedSignatureStartAuthenticationRequestDto o(ExternalQualifiedSignatureStartAuthenticationRequest externalQualifiedSignatureStartAuthenticationRequest) {
        return new ExternalQualifiedSignatureStartAuthenticationRequestDto(n(externalQualifiedSignatureStartAuthenticationRequest.getChannelType()), externalQualifiedSignatureStartAuthenticationRequest.getToken());
    }
}
