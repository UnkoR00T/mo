package em0;

import al0.PassportChildAgreementGetChildData;
import al0.s0;
import cl0.BEPassportChildApplicationOfficeDictionary;
import cl0.g0;
import gm0.PassportChildAgreementAttachmentConfigOutput;
import gm0.PassportChildAgreementGetChildDataResponse;
import gm0.PassportChildApplicationChildData;
import gm0.PassportChildApplicationOfficeDictionaryDto;
import gm0.j5;
import gm0.n5;
import iy.b0;
import iy.c0;
import jl0.PassportChildAgreementAttachmentConfigOutputModel;
import oq.p;
import p071kotlin.Metadata;
import xw.g;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\f\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0012\u001a\u00020\u0011*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lgm0/d4;", "Lal0/l0;", "b", "(Lgm0/d4;)Lal0/l0;", "Lal0/s0;", "Lgm0/n5;", "g", "(Lal0/s0;)Lgm0/n5;", "c", "(Lgm0/n5;)Lal0/s0;", "Lgm0/r3;", "Lal0/k0;", "a", "(Lgm0/r3;)Lal0/k0;", "Lgm0/m3;", "Lez/a;", "currentTimeProvider", "Ljl0/s;", "e", "(Lgm0/m3;Lez/a;)Ljl0/s;", "Lcl0/g0;", "Lgm0/j5;", "f", "(Lcl0/g0;)Lgm0/j5;", "Lgm0/o4;", "Lcl0/q;", "d", "(Lgm0/o4;)Lcl0/q;", "documentmanagementservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: em0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C1229a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f51928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f51929c;

        static {
            int[] iArr = new int[s0.values().length];
            try {
                iArr[s0.BIOMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s0.TEMPORARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s0.BUSINESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s0.DIPLOMATIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s0.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f51927a = iArr;
            int[] iArr2 = new int[n5.values().length];
            try {
                iArr2[n5.BIOMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[n5.TEMPORARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[n5.BUSINESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[n5.DIPLOMATIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[n5.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            f51928b = iArr2;
            int[] iArr3 = new int[g0.values().length];
            try {
                iArr3[g0.POLAND.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[g0.ABROAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[g0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            f51929c = iArr3;
        }
    }

    public static final PassportChildAgreementGetChildData a(PassportChildAgreementGetChildDataResponse passportChildAgreementGetChildDataResponse) {
        boolean agreementAlreadyExists = passportChildAgreementGetChildDataResponse.getAgreementAlreadyExists();
        PassportChildApplicationChildData childData = passportChildAgreementGetChildDataResponse.getChildData();
        return new PassportChildAgreementGetChildData(agreementAlreadyExists, childData != null ? b(childData) : null);
    }

    public static final al0.PassportChildApplicationChildData b(PassportChildApplicationChildData passportChildApplicationChildData) {
        b0 b0VarG = c0.g(passportChildApplicationChildData.getFirstName());
        String secondName = passportChildApplicationChildData.getSecondName();
        b0 b0VarG2 = secondName != null ? c0.g(secondName) : null;
        String anotherNames = passportChildApplicationChildData.getAnotherNames();
        b0 b0VarG3 = anotherNames != null ? c0.g(anotherNames) : null;
        b0 b0VarG4 = c0.g(passportChildApplicationChildData.getSurname());
        b0 b0VarC = g.c(c0.g(passportChildApplicationChildData.getPesel()));
        fz.b.LocalDate localDate = new fz.b.LocalDate(passportChildApplicationChildData.getDateOfBirth());
        String placeOfBirth = passportChildApplicationChildData.getPlaceOfBirth();
        return new al0.PassportChildApplicationChildData(b0VarG, b0VarG2, b0VarG4, b0VarG3, b0VarC, localDate, placeOfBirth != null ? c0.g(placeOfBirth) : null, c0.g(passportChildApplicationChildData.getChecksum()), null);
    }

    public static final s0 c(n5 n5Var) {
        int i15 = C1229a.f51928b[n5Var.ordinal()];
        if (i15 == 1) {
            return s0.BIOMETRIC;
        }
        if (i15 == 2) {
            return s0.TEMPORARY;
        }
        if (i15 == 3) {
            return s0.BUSINESS;
        }
        if (i15 == 4) {
            return s0.DIPLOMATIC;
        }
        if (i15 == 5) {
            return s0.UNKNOWN;
        }
        throw new p();
    }

    public static final BEPassportChildApplicationOfficeDictionary d(PassportChildApplicationOfficeDictionaryDto passportChildApplicationOfficeDictionaryDto) {
        return new BEPassportChildApplicationOfficeDictionary(passportChildApplicationOfficeDictionaryDto.getOfficeName(), passportChildApplicationOfficeDictionaryDto.getOnlinePaymentSupported(), passportChildApplicationOfficeDictionaryDto.getUnitCode(), passportChildApplicationOfficeDictionaryDto.getUnitName());
    }

    public static final PassportChildAgreementAttachmentConfigOutputModel e(PassportChildAgreementAttachmentConfigOutput passportChildAgreementAttachmentConfigOutput, ez.a aVar) {
        return new PassportChildAgreementAttachmentConfigOutputModel(passportChildAgreementAttachmentConfigOutput.getUrlToFileUpload(), c0.g(passportChildAgreementAttachmentConfigOutput.getJwtFileServiceToken().getValue()), ry.a.b(c0.g(passportChildAgreementAttachmentConfigOutput.getFileEncryptionKey())), new fz.b.OffsetDateTime(aVar.f().plusSeconds(passportChildAgreementAttachmentConfigOutput.getJwtFileServiceToken().getValidityInSeconds())), ry.a.b(c0.g(passportChildAgreementAttachmentConfigOutput.getSslPinningCert())), null);
    }

    public static final j5 f(g0 g0Var) {
        int i15 = C1229a.f51929c[g0Var.ordinal()];
        if (i15 == 1) {
            return j5.POLAND;
        }
        if (i15 == 2) {
            return j5.ABROAD;
        }
        if (i15 == 3) {
            return j5.UNKNOWN;
        }
        throw new p();
    }

    public static final n5 g(s0 s0Var) {
        int i15 = C1229a.f51927a[s0Var.ordinal()];
        if (i15 == 1) {
            return n5.BIOMETRIC;
        }
        if (i15 == 2) {
            return n5.TEMPORARY;
        }
        if (i15 == 3) {
            return n5.BUSINESS;
        }
        if (i15 == 4) {
            return n5.DIPLOMATIC;
        }
        if (i15 == 5) {
            return n5.UNKNOWN;
        }
        throw new p();
    }
}
