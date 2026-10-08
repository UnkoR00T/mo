package em0;

import al0.s0;
import gm0.PassportAgreementDetailsAttachement;
import gm0.PassportAgreementDetailsParentSignature;
import gm0.PassportAgreementDetailsPassportChildApplicationChildData;
import gm0.PassportAgreementDetailsPassportChildApplicationParentData;
import gm0.PassportAgreementDetailsResponse;
import gm0.d3;
import gm0.f3;
import gm0.g3;
import gm0.h3;
import gm0.m5;
import gm0.t1;
import gm0.w2;
import gm0.y1;
import gm0.y2;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jl0.BEPassportAgreementDetails;
import jl0.BEPassportAgreementDetailsParentSignature;
import jl0.BEPassportAgreementDetailsPassportChildApplicationChildData;
import jl0.BEPassportAgreementDetailsPassportChildApplicationParentData;
import jl0.d;
import jl0.e;
import jl0.i;
import jl0.j;
import jl0.k;
import jl0.l;
import jl0.o;
import oq.p;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010\"\u001a\u00020!*\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010&\u001a\u00020%*\u00020$¢\u0006\u0004\b&\u0010'\u001a\u0011\u0010*\u001a\u00020)*\u00020(¢\u0006\u0004\b*\u0010+\u001a\u0011\u0010.\u001a\u00020-*\u00020,¢\u0006\u0004\b.\u0010/\u001a\u0011\u00102\u001a\u000201*\u000200¢\u0006\u0004\b2\u00103¨\u00064"}, d2 = {"Lgm0/c3;", "Ljl0/c;", "c", "(Lgm0/c3;)Ljl0/c;", "Lgm0/h3;", "Ljl0/l;", "l", "(Lgm0/h3;)Ljl0/l;", "Lgm0/d3;", "Ljl0/i;", "i", "(Lgm0/d3;)Ljl0/i;", "Lgm0/a3;", "Ljl0/g;", "g", "(Lgm0/a3;)Ljl0/g;", "Lgm0/b3;", "Ljl0/h;", "h", "(Lgm0/b3;)Ljl0/h;", "Lgm0/t1;", "Ljl0/o;", "m", "(Lgm0/t1;)Ljl0/o;", "Lgm0/y2;", "Ljl0/e;", "e", "(Lgm0/y2;)Ljl0/e;", "Lgm0/z2;", "Ljl0/f;", "f", "(Lgm0/z2;)Ljl0/f;", "Lgm0/g3;", "Ljl0/k;", "k", "(Lgm0/g3;)Ljl0/k;", "Lgm0/m5;", "Lal0/s0;", "a", "(Lgm0/m5;)Lal0/s0;", "Lgm0/x2;", "Ljl0/d;", "d", "(Lgm0/x2;)Ljl0/d;", "Lgm0/w2;", "Ljl0/b;", "b", "(Lgm0/w2;)Ljl0/b;", "Lgm0/f3;", "Ljl0/j;", "j", "(Lgm0/f3;)Ljl0/j;", "documentmanagementservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f51931b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f51932c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f51933d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f51934e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f51935f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f51936g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f51937h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ int[] f51938i;

        static {
            int[] iArr = new int[h3.values().length];
            try {
                iArr[h3.PERSONAL_APPEARANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h3.DOCUMENT_CONSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h3.ESERVICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h3.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f51930a = iArr;
            int[] iArr2 = new int[d3.values().length];
            try {
                iArr2[d3.REGISTERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[d3.REVOKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[d3.ASSIGNED_TO_APPLICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[d3.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f51931b = iArr2;
            int[] iArr3 = new int[t1.values().length];
            try {
                iArr3[t1.PARENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[t1.GUARDIAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[t1.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            f51932c = iArr3;
            int[] iArr4 = new int[y2.values().length];
            try {
                iArr4[y2.PHYSICAL_ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[y2.PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[y2.SRP_VERIFICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[y2.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[y2.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            f51933d = iArr4;
            int[] iArr5 = new int[y1.values().length];
            try {
                iArr5[y1.PHYSICAL_ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[y1.PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[y1.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[y1.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            f51934e = iArr5;
            int[] iArr6 = new int[g3.values().length];
            try {
                iArr6[g3.MISSING_SIGNATURE_MEDICAL_REASONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr6[g3.ESERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr6[g3.TECHNICAL_PROBLEMS_WITH_SIGNATURE_PAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr6[g3.CONSENT_WITH_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr6[g3.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused25) {
            }
            f51935f = iArr6;
            int[] iArr7 = new int[m5.values().length];
            try {
                iArr7[m5.BIOMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr7[m5.TEMPORARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr7[m5.BUSINESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr7[m5.DIPLOMATIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr7[m5.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused30) {
            }
            f51936g = iArr7;
            int[] iArr8 = new int[w2.values().length];
            try {
                iArr8[w2.DOCUMENT_WITH_CERTIFIED_SIGNATURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr8[w2.OTHER_DOCUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr8[w2.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            f51937h = iArr8;
            int[] iArr9 = new int[f3.values().length];
            try {
                iArr9[f3.INVALID_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr9[f3.WITHDRAWN_AT_CITIZENS_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr9[f3.CHANGE_OF_DATA_OF_THE_PERSON_GIVES_CONSENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr9[f3.CHANGE_IN_DATA_OF_THE_PERSON_FOR_WHICH_CONSENT_WAS_GIVEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr9[f3.DEATH_OF_THE_PERSON_FOR_WHICH_CONSENT_WAS_GIVEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr9[f3.DEATH_OF_THE_PERSON_FOR_WHOM_CONSENT_WAS_GIVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr9[f3.LOSS_OF_OR_RENUNCIATION_OF_THE_PERSON_FOR_WHICH_CONSENT_WAS_GIVEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr9[f3.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused41) {
            }
            f51938i = iArr9;
        }
    }

    public static final s0 a(m5 m5Var) {
        int i15 = a.f51936g[m5Var.ordinal()];
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

    public static final jl0.b b(w2 w2Var) {
        int i15 = a.f51937h[w2Var.ordinal()];
        if (i15 == 1) {
            return jl0.b.DOCUMENT_WITH_CERTIFIED_SIGNATURE;
        }
        if (i15 == 2) {
            return jl0.b.OTHER_DOCUMENT;
        }
        if (i15 == 3) {
            return jl0.b.UNKNOWN;
        }
        throw new p();
    }

    public static final BEPassportAgreementDetails c(PassportAgreementDetailsResponse passportAgreementDetailsResponse) {
        ArrayList arrayList;
        fz.b.LocalDate localDate = new fz.b.LocalDate(passportAgreementDetailsResponse.getAgreementDate());
        String agreementNumber = passportAgreementDetailsResponse.getAgreementNumber();
        l lVarL = l(passportAgreementDetailsResponse.getAgreementRegistrationMode());
        i iVarI = i(passportAgreementDetailsResponse.getAgreementStatus());
        boolean agreementWithdrawnFlag = passportAgreementDetailsResponse.getAgreementWithdrawnFlag();
        BEPassportAgreementDetailsPassportChildApplicationChildData bEPassportAgreementDetailsPassportChildApplicationChildDataG = g(passportAgreementDetailsResponse.getChildData());
        String mobywatelAgreementId = passportAgreementDetailsResponse.getMobywatelAgreementId();
        BEPassportAgreementDetailsPassportChildApplicationParentData bEPassportAgreementDetailsPassportChildApplicationParentDataH = h(passportAgreementDetailsResponse.getParentData());
        s0 s0VarA = a(passportAgreementDetailsResponse.getPassportType());
        String applicationNumber = passportAgreementDetailsResponse.getApplicationNumber();
        List<PassportAgreementDetailsAttachement> listG = passportAgreementDetailsResponse.g();
        if (listG != null) {
            List<PassportAgreementDetailsAttachement> list = listG;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(d((PassportAgreementDetailsAttachement) it.next()));
            }
        } else {
            arrayList = null;
        }
        LocalDate invalidationDate = passportAgreementDetailsResponse.getInvalidationDate();
        fz.b.LocalDate localDate2 = invalidationDate != null ? new fz.b.LocalDate(invalidationDate) : null;
        f3 invalidationReason = passportAgreementDetailsResponse.getInvalidationReason();
        return new BEPassportAgreementDetails(localDate, agreementNumber, lVarL, iVarI, agreementWithdrawnFlag, bEPassportAgreementDetailsPassportChildApplicationChildDataG, mobywatelAgreementId, bEPassportAgreementDetailsPassportChildApplicationParentDataH, s0VarA, applicationNumber, arrayList, localDate2, invalidationReason != null ? j(invalidationReason) : null);
    }

    public static final d d(PassportAgreementDetailsAttachement passportAgreementDetailsAttachement) {
        return new d(b(passportAgreementDetailsAttachement.getAttachementType()), passportAgreementDetailsAttachement.getAttachementName());
    }

    public static final e e(y2 y2Var) {
        int i15 = a.f51933d[y2Var.ordinal()];
        if (i15 == 1) {
            return e.PHYSICAL_ID_CARD;
        }
        if (i15 == 2) {
            return e.PASSPORT;
        }
        if (i15 == 3) {
            return e.SRP_VERIFICATION;
        }
        if (i15 == 4) {
            return e.OTHER;
        }
        if (i15 == 5) {
            return e.UNKNOWN;
        }
        throw new p();
    }

    public static final BEPassportAgreementDetailsParentSignature f(PassportAgreementDetailsParentSignature passportAgreementDetailsParentSignature) {
        g3 missingSignatureReason = passportAgreementDetailsParentSignature.getMissingSignatureReason();
        return new BEPassportAgreementDetailsParentSignature(missingSignatureReason != null ? k(missingSignatureReason) : null);
    }

    public static final BEPassportAgreementDetailsPassportChildApplicationChildData g(PassportAgreementDetailsPassportChildApplicationChildData passportAgreementDetailsPassportChildApplicationChildData) {
        return new BEPassportAgreementDetailsPassportChildApplicationChildData(new fz.b.LocalDate(passportAgreementDetailsPassportChildApplicationChildData.getDateOfBirth()), passportAgreementDetailsPassportChildApplicationChildData.getPlaceOfBirth(), passportAgreementDetailsPassportChildApplicationChildData.getAnotherNames(), passportAgreementDetailsPassportChildApplicationChildData.getFirstName(), passportAgreementDetailsPassportChildApplicationChildData.getPesel(), passportAgreementDetailsPassportChildApplicationChildData.getSecondName(), passportAgreementDetailsPassportChildApplicationChildData.getSurname());
    }

    public static final BEPassportAgreementDetailsPassportChildApplicationParentData h(PassportAgreementDetailsPassportChildApplicationParentData passportAgreementDetailsPassportChildApplicationParentData) {
        return new BEPassportAgreementDetailsPassportChildApplicationParentData(m(passportAgreementDetailsPassportChildApplicationParentData.getConsentingPersonParentalStatus()), passportAgreementDetailsPassportChildApplicationParentData.getFirstName(), e(passportAgreementDetailsPassportChildApplicationParentData.getIdentityVerificationMethod()), f(passportAgreementDetailsPassportChildApplicationParentData.getParentSignature()), passportAgreementDetailsPassportChildApplicationParentData.getPesel(), passportAgreementDetailsPassportChildApplicationParentData.getSeriesAndNumber(), passportAgreementDetailsPassportChildApplicationParentData.getSurname(), passportAgreementDetailsPassportChildApplicationParentData.getAnotherNames(), passportAgreementDetailsPassportChildApplicationParentData.getDocumentDescription(), passportAgreementDetailsPassportChildApplicationParentData.getSecondName());
    }

    public static final i i(d3 d3Var) {
        int i15 = a.f51931b[d3Var.ordinal()];
        if (i15 == 1) {
            return i.REGISTERED;
        }
        if (i15 == 2) {
            return i.REVOKED;
        }
        if (i15 == 3) {
            return i.ASSIGNED_TO_APPLICATION;
        }
        if (i15 == 4) {
            return i.UNKNOWN;
        }
        throw new p();
    }

    public static final j j(f3 f3Var) {
        switch (a.f51938i[f3Var.ordinal()]) {
            case 1:
                return j.INVALID_DATA;
            case 2:
                return j.WITHDRAWN_AT_CITIZENS_REQUEST;
            case 3:
                return j.CHANGE_OF_DATA_OF_THE_PERSON_GIVES_CONSENT;
            case 4:
                return j.CHANGE_IN_DATA_OF_THE_PERSON_FOR_WHICH_CONSENT_WAS_GIVEN;
            case 5:
                return j.DEATH_OF_THE_PERSON_FOR_WHICH_CONSENT_WAS_GIVEN;
            case 6:
                return j.DEATH_OF_THE_PERSON_FOR_WHOM_CONSENT_WAS_GIVEN;
            case 7:
                return j.LOSS_OF_OR_RENUNCIATION_OF_THE_PERSON_FOR_WHICH_CONSENT_WAS_GIVEN;
            case 8:
                return j.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final k k(g3 g3Var) {
        int i15 = a.f51935f[g3Var.ordinal()];
        if (i15 == 1) {
            return k.MISSING_SIGNATURE_MEDICAL_REASONS;
        }
        if (i15 == 2) {
            return k.ESERVICE;
        }
        if (i15 == 3) {
            return k.TECHNICAL_PROBLEMS_WITH_SIGNATURE_PAD;
        }
        if (i15 == 4) {
            return k.CONSENT_WITH_DOCUMENT;
        }
        if (i15 == 5) {
            return k.UNKNOWN;
        }
        throw new p();
    }

    public static final l l(h3 h3Var) {
        int i15 = a.f51930a[h3Var.ordinal()];
        if (i15 == 1) {
            return l.PERSONAL_APPEARANCE;
        }
        if (i15 == 2) {
            return l.DOCUMENT_CONSENT;
        }
        if (i15 == 3) {
            return l.ESERVICE;
        }
        if (i15 == 4) {
            return l.UNKNOWN;
        }
        throw new p();
    }

    public static final o m(t1 t1Var) {
        int i15 = a.f51932c[t1Var.ordinal()];
        if (i15 == 1) {
            return o.PARENT;
        }
        if (i15 == 2) {
            return o.GUARDIAN;
        }
        if (i15 == 3) {
            return o.UNKNOWN;
        }
        throw new p();
    }
}
