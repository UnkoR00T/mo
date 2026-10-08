package pc4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import uq2.PassportDiplomaticData;
import uq2.PassportRevocationData;
import uq2.PassportVisualization;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001d\u001a\u00020\u0001*\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010 \u001a\u00020\u0005*\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!\u001a\u0013\u0010#\u001a\u00020\t*\u00020\"H\u0002¢\u0006\u0004\b#\u0010$\u001a\u0013\u0010&\u001a\u00020\r*\u00020%H\u0002¢\u0006\u0004\b&\u0010'\u001a\u0013\u0010)\u001a\u00020\u0011*\u00020(H\u0002¢\u0006\u0004\b)\u0010*\u001a\u0013\u0010,\u001a\u00020\u0015*\u00020+H\u0002¢\u0006\u0004\b,\u0010-\u001a\u0013\u0010/\u001a\u00020\u0019*\u00020.H\u0002¢\u0006\u0004\b/\u00100¨\u00061"}, d2 = {"Luc3/h;", "Luq2/g;", "l", "(Luc3/h;)Luq2/g;", "Luc3/b;", "Luq2/a;", "i", "(Luc3/b;)Luq2/a;", "Luc3/f;", "Luq2/e;", "o", "(Luc3/f;)Luq2/e;", "Luc3/g;", "Luq2/f;", "p", "(Luc3/g;)Luq2/f;", "Luc3/c;", "Luq2/b;", "j", "(Luc3/c;)Luq2/b;", "Luc3/d;", "Luq2/c;", "m", "(Luc3/d;)Luq2/c;", "Luc3/e;", "Luq2/d;", "n", "(Luc3/e;)Luq2/d;", "Lal0/t0;", "k", "(Lal0/t0;)Luq2/g;", "Lal0/m0;", "c", "(Lal0/m0;)Luq2/a;", "Lal0/r0;", "g", "(Lal0/r0;)Luq2/e;", "Lal0/s0;", "h", "(Lal0/s0;)Luq2/f;", "Lal0/n0;", "d", "(Lal0/n0;)Luq2/b;", "Lal0/p0;", "e", "(Lal0/p0;)Luq2/c;", "Lal0/q0;", "f", "(Lal0/q0;)Luq2/d;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q6 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f155636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f155637c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f155638d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f155639e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f155640f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f155641g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f155642h;

        static {
            int[] iArr = new int[uc3.b.values().length];
            try {
                iArr[uc3.b.POL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[uc3.b.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f155635a = iArr;
            int[] iArr2 = new int[uc3.f.values().length];
            try {
                iArr2[uc3.f.ISSUED_TO_CITIZEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[uc3.f.REVOKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[uc3.f.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f155636b = iArr2;
            int[] iArr3 = new int[uc3.g.values().length];
            try {
                iArr3[uc3.g.BIOMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[uc3.g.TEMPORARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[uc3.g.BUSINESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[uc3.g.DIPLOMATIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[uc3.g.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            f155637c = iArr3;
            int[] iArr4 = new int[uc3.e.values().length];
            try {
                iArr4[uc3.e.PERSONALIZATION_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[uc3.e.INVALIDITY_DECLARATION_CITIZENSHIP_MISSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[uc3.e.INVALIDITY_DECLARATION_FORGERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[uc3.e.INVALIDITY_DECLARATION_OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[uc3.e.INVALIDITY_DECLARATION_WRONG_DATA.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[uc3.e.INVALIDITY_DECLARATION_PERSONALIZATION_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[uc3.e.UNAUTHORIZED_USING_PERSONAL_DATA.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[uc3.e.CITIZEN_REQUEST.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[uc3.e.OFFICE_REQUEST.ordinal()] = 9;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[uc3.e.INVALID_DATA.ordinal()] = 10;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[uc3.e.THIRD_PARTY_FOUND_DOCUMENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[uc3.e.COMPLIANT.ordinal()] = 12;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[uc3.e.EXPIRED.ordinal()] = 13;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[uc3.e.DAMAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[uc3.e.LOSS.ordinal()] = 15;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr4[uc3.e.RENUNCIATION_OF_CITIZENSHIP.ordinal()] = 16;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr4[uc3.e.LOSS_RIGHT_FOR_USING_PASSPORT.ordinal()] = 17;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr4[uc3.e.TECHNICAL_FAULTS.ordinal()] = 18;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr4[uc3.e.ISSUING_NEW_PASSPORT.ordinal()] = 19;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr4[uc3.e.DIED.ordinal()] = 20;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr4[uc3.e.DATA_CHANGED.ordinal()] = 21;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr4[uc3.e.DATA_MIGRATION.ordinal()] = 22;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr4[uc3.e.UNKNOWN.ordinal()] = 23;
            } catch (NoSuchFieldError unused33) {
            }
            f155638d = iArr4;
            int[] iArr5 = new int[al0.m0.values().length];
            try {
                iArr5[al0.m0.POL.ordinal()] = 1;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr5[al0.m0.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused35) {
            }
            f155639e = iArr5;
            int[] iArr6 = new int[al0.r0.values().length];
            try {
                iArr6[al0.r0.ISSUED_TO_CITIZEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr6[al0.r0.REVOKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr6[al0.r0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused38) {
            }
            f155640f = iArr6;
            int[] iArr7 = new int[al0.s0.values().length];
            try {
                iArr7[al0.s0.BIOMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr7[al0.s0.TEMPORARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr7[al0.s0.BUSINESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr7[al0.s0.DIPLOMATIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr7[al0.s0.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused43) {
            }
            f155641g = iArr7;
            int[] iArr8 = new int[al0.q0.values().length];
            try {
                iArr8[al0.q0.PERSONALIZATION_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr8[al0.q0.INVALIDITY_DECLARATION_CITIZENSHIP_MISSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr8[al0.q0.INVALIDITY_DECLARATION_FORGERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr8[al0.q0.INVALIDITY_DECLARATION_OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr8[al0.q0.INVALIDITY_DECLARATION_WRONG_DATA.ordinal()] = 5;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr8[al0.q0.INVALIDITY_DECLARATION_PERSONALIZATION_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr8[al0.q0.UNAUTHORIZED_USING_PERSONAL_DATA.ordinal()] = 7;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr8[al0.q0.CITIZEN_REQUEST.ordinal()] = 8;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr8[al0.q0.OFFICE_REQUEST.ordinal()] = 9;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr8[al0.q0.INVALID_DATA.ordinal()] = 10;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr8[al0.q0.THIRD_PARTY_FOUND_DOCUMENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr8[al0.q0.COMPLIANT.ordinal()] = 12;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr8[al0.q0.EXPIRED.ordinal()] = 13;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr8[al0.q0.DAMAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr8[al0.q0.LOSS.ordinal()] = 15;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr8[al0.q0.RENUNCIATION_OF_CITIZENSHIP.ordinal()] = 16;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr8[al0.q0.LOSS_RIGHT_FOR_USING_PASSPORT.ordinal()] = 17;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr8[al0.q0.TECHNICAL_FAULTS.ordinal()] = 18;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr8[al0.q0.ISSUING_NEW_PASSPORT.ordinal()] = 19;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr8[al0.q0.DIED.ordinal()] = 20;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr8[al0.q0.DATA_CHANGED.ordinal()] = 21;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr8[al0.q0.DATA_MIGRATION.ordinal()] = 22;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr8[al0.q0.UNKNOWN.ordinal()] = 23;
            } catch (NoSuchFieldError unused66) {
            }
            f155642h = iArr8;
        }
    }

    private static final uq2.a c(al0.m0 m0Var) {
        int i15 = a.f155639e[m0Var.ordinal()];
        if (i15 == 1) {
            return uq2.a.POL;
        }
        if (i15 == 2) {
            return uq2.a.UNKNOWN;
        }
        throw new oq.p();
    }

    private static final PassportDiplomaticData d(al0.PassportDiplomaticData passportDiplomaticData) {
        return new PassportDiplomaticData(passportDiplomaticData.getTitle(), passportDiplomaticData.getBody(), passportDiplomaticData.getNumber(), passportDiplomaticData.getPersonalizationDate(), passportDiplomaticData.getCityAndDate());
    }

    private static final PassportRevocationData e(al0.PassportRevocationData passportRevocationData) {
        fz.b.OffsetDateTime revocationDate = passportRevocationData.getRevocationDate();
        al0.q0 revocationReason = passportRevocationData.getRevocationReason();
        return new PassportRevocationData(revocationDate, revocationReason != null ? f(revocationReason) : null);
    }

    private static final uq2.d f(al0.q0 q0Var) {
        switch (a.f155642h[q0Var.ordinal()]) {
            case 1:
                return uq2.d.PERSONALIZATION_ERROR;
            case 2:
                return uq2.d.INVALIDITY_DECLARATION_CITIZENSHIP_MISSING;
            case 3:
                return uq2.d.INVALIDITY_DECLARATION_FORGERY;
            case 4:
                return uq2.d.INVALIDITY_DECLARATION_OTHER;
            case 5:
                return uq2.d.INVALIDITY_DECLARATION_WRONG_DATA;
            case 6:
                return uq2.d.INVALIDITY_DECLARATION_PERSONALIZATION_ERROR;
            case 7:
                return uq2.d.UNAUTHORIZED_USING_PERSONAL_DATA;
            case 8:
                return uq2.d.CITIZEN_REQUEST;
            case 9:
                return uq2.d.OFFICE_REQUEST;
            case 10:
                return uq2.d.INVALID_DATA;
            case 11:
                return uq2.d.THIRD_PARTY_FOUND_DOCUMENT;
            case 12:
                return uq2.d.COMPLIANT;
            case 13:
                return uq2.d.EXPIRED;
            case 14:
                return uq2.d.DAMAGE;
            case 15:
                return uq2.d.LOSS;
            case 16:
                return uq2.d.RENUNCIATION_OF_CITIZENSHIP;
            case 17:
                return uq2.d.LOSS_RIGHT_FOR_USING_PASSPORT;
            case 18:
                return uq2.d.TECHNICAL_FAULTS;
            case 19:
                return uq2.d.ISSUING_NEW_PASSPORT;
            case 20:
                return uq2.d.DIED;
            case 21:
                return uq2.d.DATA_CHANGED;
            case 22:
                return uq2.d.DATA_MIGRATION;
            case 23:
                return uq2.d.UNKNOWN;
            default:
                throw new oq.p();
        }
    }

    private static final uq2.e g(al0.r0 r0Var) {
        int i15 = a.f155640f[r0Var.ordinal()];
        if (i15 == 1) {
            return uq2.e.ISSUED_TO_CITIZEN;
        }
        if (i15 == 2) {
            return uq2.e.REVOKED;
        }
        if (i15 == 3) {
            return uq2.e.UNKNOWN;
        }
        throw new oq.p();
    }

    private static final uq2.f h(al0.s0 s0Var) {
        int i15 = a.f155641g[s0Var.ordinal()];
        if (i15 == 1) {
            return uq2.f.BIOMETRIC;
        }
        if (i15 == 2) {
            return uq2.f.TEMPORARY;
        }
        if (i15 == 3) {
            return uq2.f.BUSINESS;
        }
        if (i15 == 4) {
            return uq2.f.DIPLOMATIC;
        }
        if (i15 == 5) {
            return uq2.f.UNKNOWN;
        }
        throw new oq.p();
    }

    private static final uq2.a i(uc3.b bVar) {
        int i15 = a.f155635a[bVar.ordinal()];
        if (i15 == 1) {
            return uq2.a.POL;
        }
        if (i15 == 2) {
            return uq2.a.UNKNOWN;
        }
        throw new oq.p();
    }

    private static final PassportDiplomaticData j(uc3.PassportDiplomaticData passportDiplomaticData) {
        return new PassportDiplomaticData(passportDiplomaticData.getTitle(), passportDiplomaticData.getBody(), passportDiplomaticData.getNumber(), passportDiplomaticData.getPersonalizationDate(), passportDiplomaticData.getCityAndDate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PassportVisualization k(al0.PassportVisualization passportVisualization) {
        fz.b.LocalDate birthDate = passportVisualization.getBirthDate();
        String birthPlaceFirstLine = passportVisualization.getBirthPlaceFirstLine();
        String citizenship = passportVisualization.getCitizenship();
        uq2.a aVarC = c(passportVisualization.getCountryCode());
        fz.b.OffsetDateTime executionDate = passportVisualization.getExecutionDate();
        fz.b.LocalDate expiryDate = passportVisualization.getExpiryDate();
        xw.e gender = passportVisualization.getGender();
        iy.b0 id5 = passportVisualization.getId();
        fz.b.OffsetDateTime issueDate = passportVisualization.getIssueDate();
        String issuerNameFirstLine = passportVisualization.getIssuerNameFirstLine();
        iy.b0 nameFirstLine = passportVisualization.getNameFirstLine();
        iy.b0 number = passportVisualization.getNumber();
        iy.b0 pesel = passportVisualization.getPesel();
        uq2.e eVarG = g(passportVisualization.getStatus());
        iy.b0 surnameFirstLine = passportVisualization.getSurnameFirstLine();
        uq2.f fVarH = h(passportVisualization.getType());
        String birthPlaceSecondLine = passportVisualization.getBirthPlaceSecondLine();
        String issuerNameSecondLine = passportVisualization.getIssuerNameSecondLine();
        iy.b0 nameSecondLine = passportVisualization.getNameSecondLine();
        iy.b0 surnameSecondLine = passportVisualization.getSurnameSecondLine();
        List<al0.PassportDiplomaticData> listF = passportVisualization.f();
        ArrayList arrayList = new ArrayList(pq.v.y(listF, 10));
        Iterator<T> it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(d((al0.PassportDiplomaticData) it.next()));
        }
        al0.PassportRevocationData revocationData = passportVisualization.getRevocationData();
        return new PassportVisualization(birthDate, birthPlaceFirstLine, citizenship, aVarC, executionDate, expiryDate, gender, id5, issueDate, issuerNameFirstLine, nameFirstLine, number, pesel, eVarG, surnameFirstLine, fVarH, birthPlaceSecondLine, issuerNameSecondLine, nameSecondLine, surnameSecondLine, arrayList, revocationData != null ? e(revocationData) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PassportVisualization l(uc3.PassportVisualization passportVisualization) {
        fz.b.LocalDate birthDate = passportVisualization.getBirthDate();
        String birthPlaceFirstLine = passportVisualization.getBirthPlaceFirstLine();
        String citizenship = passportVisualization.getCitizenship();
        uq2.a aVarI = i(passportVisualization.getCountryCode());
        fz.b.OffsetDateTime executionDate = passportVisualization.getExecutionDate();
        fz.b.LocalDate expiryDate = passportVisualization.getExpiryDate();
        xw.e gender = passportVisualization.getGender();
        iy.b0 id5 = passportVisualization.getId();
        fz.b.OffsetDateTime issueDate = passportVisualization.getIssueDate();
        String issuerNameFirstLine = passportVisualization.getIssuerNameFirstLine();
        iy.b0 nameFirstLine = passportVisualization.getNameFirstLine();
        iy.b0 number = passportVisualization.getNumber();
        iy.b0 pesel = passportVisualization.getPesel();
        uq2.e eVarO = o(passportVisualization.getStatus());
        iy.b0 surnameFirstLine = passportVisualization.getSurnameFirstLine();
        uq2.f fVarP = p(passportVisualization.getType());
        String birthPlaceSecondLine = passportVisualization.getBirthPlaceSecondLine();
        String issuerNameSecondLine = passportVisualization.getIssuerNameSecondLine();
        iy.b0 nameSecondLine = passportVisualization.getNameSecondLine();
        iy.b0 surnameSecondLine = passportVisualization.getSurnameSecondLine();
        List<uc3.PassportDiplomaticData> listF = passportVisualization.f();
        ArrayList arrayList = new ArrayList(pq.v.y(listF, 10));
        Iterator<T> it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(j((uc3.PassportDiplomaticData) it.next()));
        }
        uc3.PassportRevocationData revocationData = passportVisualization.getRevocationData();
        return new PassportVisualization(birthDate, birthPlaceFirstLine, citizenship, aVarI, executionDate, expiryDate, gender, id5, issueDate, issuerNameFirstLine, nameFirstLine, number, pesel, eVarO, surnameFirstLine, fVarP, birthPlaceSecondLine, issuerNameSecondLine, nameSecondLine, surnameSecondLine, arrayList, revocationData != null ? m(revocationData) : null);
    }

    private static final PassportRevocationData m(uc3.PassportRevocationData passportRevocationData) {
        fz.b.OffsetDateTime revocationDate = passportRevocationData.getRevocationDate();
        uc3.e revocationReason = passportRevocationData.getRevocationReason();
        return new PassportRevocationData(revocationDate, revocationReason != null ? n(revocationReason) : null);
    }

    private static final uq2.d n(uc3.e eVar) {
        switch (a.f155638d[eVar.ordinal()]) {
            case 1:
                return uq2.d.PERSONALIZATION_ERROR;
            case 2:
                return uq2.d.INVALIDITY_DECLARATION_CITIZENSHIP_MISSING;
            case 3:
                return uq2.d.INVALIDITY_DECLARATION_FORGERY;
            case 4:
                return uq2.d.INVALIDITY_DECLARATION_OTHER;
            case 5:
                return uq2.d.INVALIDITY_DECLARATION_WRONG_DATA;
            case 6:
                return uq2.d.INVALIDITY_DECLARATION_PERSONALIZATION_ERROR;
            case 7:
                return uq2.d.UNAUTHORIZED_USING_PERSONAL_DATA;
            case 8:
                return uq2.d.CITIZEN_REQUEST;
            case 9:
                return uq2.d.OFFICE_REQUEST;
            case 10:
                return uq2.d.INVALID_DATA;
            case 11:
                return uq2.d.THIRD_PARTY_FOUND_DOCUMENT;
            case 12:
                return uq2.d.COMPLIANT;
            case 13:
                return uq2.d.EXPIRED;
            case 14:
                return uq2.d.DAMAGE;
            case 15:
                return uq2.d.LOSS;
            case 16:
                return uq2.d.RENUNCIATION_OF_CITIZENSHIP;
            case 17:
                return uq2.d.LOSS_RIGHT_FOR_USING_PASSPORT;
            case 18:
                return uq2.d.TECHNICAL_FAULTS;
            case 19:
                return uq2.d.ISSUING_NEW_PASSPORT;
            case 20:
                return uq2.d.DIED;
            case 21:
                return uq2.d.DATA_CHANGED;
            case 22:
                return uq2.d.DATA_MIGRATION;
            case 23:
                return uq2.d.UNKNOWN;
            default:
                throw new oq.p();
        }
    }

    private static final uq2.e o(uc3.f fVar) {
        int i15 = a.f155636b[fVar.ordinal()];
        if (i15 == 1) {
            return uq2.e.ISSUED_TO_CITIZEN;
        }
        if (i15 == 2) {
            return uq2.e.REVOKED;
        }
        if (i15 == 3) {
            return uq2.e.UNKNOWN;
        }
        throw new oq.p();
    }

    private static final uq2.f p(uc3.g gVar) {
        int i15 = a.f155637c[gVar.ordinal()];
        if (i15 == 1) {
            return uq2.f.BIOMETRIC;
        }
        if (i15 == 2) {
            return uq2.f.TEMPORARY;
        }
        if (i15 == 3) {
            return uq2.f.BUSINESS;
        }
        if (i15 == 4) {
            return uq2.f.DIPLOMATIC;
        }
        if (i15 == 5) {
            return uq2.f.UNKNOWN;
        }
        throw new oq.p();
    }
}
