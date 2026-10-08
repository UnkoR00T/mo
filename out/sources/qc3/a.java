package qc3;

import fr.t;
import iy.b0;
import iy.c0;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.p;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.feature.userdata.data.model.passports.GroupedPassportsDto;
import pl.gov.coi.mobywatel.feature.userdata.data.model.passports.PassportCountryCodeDto;
import pl.gov.coi.mobywatel.feature.userdata.data.model.passports.PassportDiplomaticDataDto;
import pl.gov.coi.mobywatel.feature.userdata.data.model.passports.PassportGenderDto;
import pl.gov.coi.mobywatel.feature.userdata.data.model.passports.PassportRevocationDataDto;
import pl.gov.coi.mobywatel.feature.userdata.data.model.passports.PassportRevocationReasonDto;
import pl.gov.coi.mobywatel.feature.userdata.data.model.passports.PassportStatusDto;
import pl.gov.coi.mobywatel.feature.userdata.data.model.passports.PassportTypeDto;
import pl.gov.coi.mobywatel.feature.userdata.data.model.passports.PassportVisualizationDto;
import pl.gov.coi.mobywatel.feature.userdata.data.model.passports.PassportsDataDto;
import pq.v;
import uc3.GroupedPassports;
import uc3.PassportDiplomaticData;
import uc3.PassportRevocationData;
import uc3.PassportVisualization;
import uc3.PassportsData;
import uc3.b;
import uc3.e;
import uc3.f;
import uc3.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010\"\u001a\u00020!*\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010&\u001a\u00020%*\u00020$¢\u0006\u0004\b&\u0010'\u001a\u0011\u0010(\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b(\u0010)\u001a\u0011\u0010*\u001a\u00020\u0004*\u00020\u0005¢\u0006\u0004\b*\u0010+\u001a\u0011\u0010,\u001a\u00020\b*\u00020\t¢\u0006\u0004\b,\u0010-\u001a\u0011\u0010.\u001a\u00020\f*\u00020\r¢\u0006\u0004\b.\u0010/\u001a\u0011\u00100\u001a\u00020\u0010*\u00020\u0011¢\u0006\u0004\b0\u00101\u001a\u0011\u00102\u001a\u00020\u0014*\u00020\u0015¢\u0006\u0004\b2\u00103\u001a\u0011\u00104\u001a\u00020\u0018*\u00020\u0019¢\u0006\u0004\b4\u00105\u001a\u0011\u00106\u001a\u00020\u001c*\u00020\u001d¢\u0006\u0004\b6\u00107\u001a\u0011\u00108\u001a\u00020 *\u00020!¢\u0006\u0004\b8\u00109\u001a\u0011\u0010:\u001a\u00020$*\u00020%¢\u0006\u0004\b:\u0010;¨\u0006<"}, d2 = {"Luc3/i;", "Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportsDataDto;", "t", "(Luc3/i;)Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportsDataDto;", "Luc3/a;", "Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/GroupedPassportsDto;", "k", "(Luc3/a;)Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/GroupedPassportsDto;", "Luc3/h;", "Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportVisualizationDto;", "s", "(Luc3/h;)Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportVisualizationDto;", "Luc3/c;", "Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportDiplomaticDataDto;", "m", "(Luc3/c;)Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportDiplomaticDataDto;", "Luc3/d;", "Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportRevocationDataDto;", "o", "(Luc3/d;)Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportRevocationDataDto;", "Luc3/e;", "Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportRevocationReasonDto;", "p", "(Luc3/e;)Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportRevocationReasonDto;", "Luc3/g;", "Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportTypeDto;", "r", "(Luc3/g;)Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportTypeDto;", "Luc3/f;", "Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportStatusDto;", "q", "(Luc3/f;)Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportStatusDto;", "Luc3/b;", "Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportCountryCodeDto;", "l", "(Luc3/b;)Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportCountryCodeDto;", "Lxw/e;", "Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportGenderDto;", "n", "(Lxw/e;)Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportGenderDto;", "i", "(Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportsDataDto;)Luc3/i;", "a", "(Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/GroupedPassportsDto;)Luc3/a;", "h", "(Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportVisualizationDto;)Luc3/h;", "c", "(Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportDiplomaticDataDto;)Luc3/c;", "d", "(Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportRevocationDataDto;)Luc3/d;", "e", "(Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportRevocationReasonDto;)Luc3/e;", "g", "(Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportTypeDto;)Luc3/g;", "f", "(Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportStatusDto;)Luc3/f;", "b", "(Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportCountryCodeDto;)Luc3/b;", "j", "(Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportGenderDto;)Lxw/e;", "userdata_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: qc3.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C4153a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f166053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f166054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f166055d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f166056e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f166057f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f166058g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f166059h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ int[] f166060i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ int[] f166061j;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.PERSONALIZATION_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.INVALIDITY_DECLARATION_CITIZENSHIP_MISSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.INVALIDITY_DECLARATION_FORGERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.INVALIDITY_DECLARATION_OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.INVALIDITY_DECLARATION_WRONG_DATA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[e.INVALIDITY_DECLARATION_PERSONALIZATION_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[e.UNAUTHORIZED_USING_PERSONAL_DATA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[e.CITIZEN_REQUEST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[e.OFFICE_REQUEST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[e.INVALID_DATA.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[e.THIRD_PARTY_FOUND_DOCUMENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[e.COMPLIANT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[e.EXPIRED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[e.DAMAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[e.LOSS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[e.RENUNCIATION_OF_CITIZENSHIP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[e.LOSS_RIGHT_FOR_USING_PASSPORT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[e.TECHNICAL_FAULTS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[e.ISSUING_NEW_PASSPORT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[e.DIED.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[e.DATA_CHANGED.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[e.DATA_MIGRATION.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[e.UNKNOWN.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            f166052a = iArr;
            int[] iArr2 = new int[g.values().length];
            try {
                iArr2[g.BIOMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[g.TEMPORARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[g.BUSINESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[g.DIPLOMATIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[g.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused28) {
            }
            f166053b = iArr2;
            int[] iArr3 = new int[f.values().length];
            try {
                iArr3[f.ISSUED_TO_CITIZEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr3[f.REVOKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr3[f.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused31) {
            }
            f166054c = iArr3;
            int[] iArr4 = new int[b.values().length];
            try {
                iArr4[b.POL.ordinal()] = 1;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr4[b.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused33) {
            }
            f166055d = iArr4;
            int[] iArr5 = new int[xw.e.values().length];
            try {
                iArr5[xw.e.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr5[xw.e.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused35) {
            }
            f166056e = iArr5;
            int[] iArr6 = new int[PassportRevocationReasonDto.values().length];
            try {
                iArr6[PassportRevocationReasonDto.PERSONALIZATION_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr6[PassportRevocationReasonDto.INVALIDITY_DECLARATION_CITIZENSHIP_MISSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr6[PassportRevocationReasonDto.INVALIDITY_DECLARATION_FORGERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr6[PassportRevocationReasonDto.INVALIDITY_DECLARATION_OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr6[PassportRevocationReasonDto.INVALIDITY_DECLARATION_WRONG_DATA.ordinal()] = 5;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr6[PassportRevocationReasonDto.INVALIDITY_DECLARATION_PERSONALIZATION_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr6[PassportRevocationReasonDto.UNAUTHORIZED_USING_PERSONAL_DATA.ordinal()] = 7;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr6[PassportRevocationReasonDto.CITIZEN_REQUEST.ordinal()] = 8;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr6[PassportRevocationReasonDto.OFFICE_REQUEST.ordinal()] = 9;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr6[PassportRevocationReasonDto.INVALID_DATA.ordinal()] = 10;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr6[PassportRevocationReasonDto.THIRD_PARTY_FOUND_DOCUMENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr6[PassportRevocationReasonDto.COMPLIANT.ordinal()] = 12;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr6[PassportRevocationReasonDto.EXPIRED.ordinal()] = 13;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr6[PassportRevocationReasonDto.DAMAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr6[PassportRevocationReasonDto.LOSS.ordinal()] = 15;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr6[PassportRevocationReasonDto.RENUNCIATION_OF_CITIZENSHIP.ordinal()] = 16;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr6[PassportRevocationReasonDto.LOSS_RIGHT_FOR_USING_PASSPORT.ordinal()] = 17;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr6[PassportRevocationReasonDto.TECHNICAL_FAULTS.ordinal()] = 18;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr6[PassportRevocationReasonDto.ISSUING_NEW_PASSPORT.ordinal()] = 19;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr6[PassportRevocationReasonDto.DIED.ordinal()] = 20;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr6[PassportRevocationReasonDto.DATA_CHANGED.ordinal()] = 21;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr6[PassportRevocationReasonDto.DATA_MIGRATION.ordinal()] = 22;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr6[PassportRevocationReasonDto.UNKNOWN.ordinal()] = 23;
            } catch (NoSuchFieldError unused58) {
            }
            f166057f = iArr6;
            int[] iArr7 = new int[PassportTypeDto.values().length];
            try {
                iArr7[PassportTypeDto.BIOMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr7[PassportTypeDto.TEMPORARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr7[PassportTypeDto.BUSINESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr7[PassportTypeDto.DIPLOMATIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr7[PassportTypeDto.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused63) {
            }
            f166058g = iArr7;
            int[] iArr8 = new int[PassportStatusDto.values().length];
            try {
                iArr8[PassportStatusDto.ISSUED_TO_CITIZEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr8[PassportStatusDto.REVOKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr8[PassportStatusDto.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused66) {
            }
            f166059h = iArr8;
            int[] iArr9 = new int[PassportCountryCodeDto.values().length];
            try {
                iArr9[PassportCountryCodeDto.POL.ordinal()] = 1;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr9[PassportCountryCodeDto.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused68) {
            }
            f166060i = iArr9;
            int[] iArr10 = new int[PassportGenderDto.values().length];
            try {
                iArr10[PassportGenderDto.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr10[PassportGenderDto.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused70) {
            }
            f166061j = iArr10;
        }
    }

    public static final GroupedPassports a(GroupedPassportsDto groupedPassportsDto) {
        List<PassportVisualizationDto> validPassports = groupedPassportsDto.getValidPassports();
        ArrayList arrayList = new ArrayList(v.y(validPassports, 10));
        Iterator<T> it = validPassports.iterator();
        while (it.hasNext()) {
            arrayList.add(h((PassportVisualizationDto) it.next()));
        }
        List<PassportVisualizationDto> revokedPassports = groupedPassportsDto.getRevokedPassports();
        ArrayList arrayList2 = new ArrayList(v.y(revokedPassports, 10));
        Iterator<T> it4 = revokedPassports.iterator();
        while (it4.hasNext()) {
            arrayList2.add(h((PassportVisualizationDto) it4.next()));
        }
        return new GroupedPassports(arrayList, arrayList2);
    }

    public static final b b(PassportCountryCodeDto passportCountryCodeDto) {
        int i15 = C4153a.f166060i[passportCountryCodeDto.ordinal()];
        if (i15 == 1) {
            return b.POL;
        }
        if (i15 == 2) {
            return b.UNKNOWN;
        }
        throw new p();
    }

    public static final PassportDiplomaticData c(PassportDiplomaticDataDto passportDiplomaticDataDto) {
        String number = passportDiplomaticDataDto.getNumber();
        LocalDate personalizationDate = passportDiplomaticDataDto.getPersonalizationDate();
        return new PassportDiplomaticData(passportDiplomaticDataDto.getTitle(), passportDiplomaticDataDto.getBody(), number, personalizationDate != null ? new fz.b.LocalDate(personalizationDate) : null, passportDiplomaticDataDto.getCityAndDate());
    }

    public static final PassportRevocationData d(PassportRevocationDataDto passportRevocationDataDto) {
        OffsetDateTime revocationDate = passportRevocationDataDto.getRevocationDate();
        fz.b.OffsetDateTime offsetDateTime = revocationDate != null ? new fz.b.OffsetDateTime(revocationDate) : null;
        PassportRevocationReasonDto revocationReason = passportRevocationDataDto.getRevocationReason();
        return new PassportRevocationData(offsetDateTime, revocationReason != null ? e(revocationReason) : null);
    }

    public static final e e(PassportRevocationReasonDto passportRevocationReasonDto) {
        switch (C4153a.f166057f[passportRevocationReasonDto.ordinal()]) {
            case 1:
                return e.PERSONALIZATION_ERROR;
            case 2:
                return e.INVALIDITY_DECLARATION_CITIZENSHIP_MISSING;
            case 3:
                return e.INVALIDITY_DECLARATION_FORGERY;
            case 4:
                return e.INVALIDITY_DECLARATION_OTHER;
            case 5:
                return e.INVALIDITY_DECLARATION_WRONG_DATA;
            case 6:
                return e.INVALIDITY_DECLARATION_PERSONALIZATION_ERROR;
            case 7:
                return e.UNAUTHORIZED_USING_PERSONAL_DATA;
            case 8:
                return e.CITIZEN_REQUEST;
            case 9:
                return e.OFFICE_REQUEST;
            case 10:
                return e.INVALID_DATA;
            case 11:
                return e.THIRD_PARTY_FOUND_DOCUMENT;
            case 12:
                return e.COMPLIANT;
            case 13:
                return e.EXPIRED;
            case 14:
                return e.DAMAGE;
            case 15:
                return e.LOSS;
            case 16:
                return e.RENUNCIATION_OF_CITIZENSHIP;
            case 17:
                return e.LOSS_RIGHT_FOR_USING_PASSPORT;
            case 18:
                return e.TECHNICAL_FAULTS;
            case 19:
                return e.ISSUING_NEW_PASSPORT;
            case 20:
                return e.DIED;
            case 21:
                return e.DATA_CHANGED;
            case 22:
                return e.DATA_MIGRATION;
            case 23:
                return e.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final f f(PassportStatusDto passportStatusDto) {
        int i15 = C4153a.f166059h[passportStatusDto.ordinal()];
        if (i15 == 1) {
            return f.ISSUED_TO_CITIZEN;
        }
        if (i15 == 2) {
            return f.REVOKED;
        }
        if (i15 == 3) {
            return f.UNKNOWN;
        }
        throw new p();
    }

    public static final g g(PassportTypeDto passportTypeDto) {
        int i15 = C4153a.f166058g[passportTypeDto.ordinal()];
        if (i15 == 1) {
            return g.BIOMETRIC;
        }
        if (i15 == 2) {
            return g.TEMPORARY;
        }
        if (i15 == 3) {
            return g.BUSINESS;
        }
        if (i15 == 4) {
            return g.DIPLOMATIC;
        }
        if (i15 == 5) {
            return g.UNKNOWN;
        }
        throw new p();
    }

    public static final PassportVisualization h(PassportVisualizationDto passportVisualizationDto) {
        LocalDate birthDate = passportVisualizationDto.getBirthDate();
        fz.b.LocalDate localDate = birthDate != null ? new fz.b.LocalDate(birthDate) : null;
        String birthPlaceFirstLine = passportVisualizationDto.getBirthPlaceFirstLine();
        String citizenship = passportVisualizationDto.getCitizenship();
        b bVarB = b(passportVisualizationDto.getCountryCode());
        fz.b.OffsetDateTime offsetDateTime = new fz.b.OffsetDateTime(passportVisualizationDto.getExecutionDate());
        LocalDate expiryDate = passportVisualizationDto.getExpiryDate();
        fz.b.LocalDate localDate2 = expiryDate != null ? new fz.b.LocalDate(expiryDate) : null;
        PassportGenderDto gender = passportVisualizationDto.getGender();
        xw.e eVarJ = gender != null ? j(gender) : null;
        b0 b0VarG = c0.g(passportVisualizationDto.getId());
        OffsetDateTime issueDate = passportVisualizationDto.getIssueDate();
        fz.b.OffsetDateTime offsetDateTime2 = issueDate != null ? new fz.b.OffsetDateTime(issueDate) : null;
        String issuerNameFirstLine = passportVisualizationDto.getIssuerNameFirstLine();
        String nameFirstLine = passportVisualizationDto.getNameFirstLine();
        b0 b0VarG2 = nameFirstLine != null ? c0.g(nameFirstLine) : null;
        b0 b0VarG3 = c0.g(passportVisualizationDto.getNumber());
        String pesel = passportVisualizationDto.getPesel();
        b0 b0VarG4 = pesel != null ? c0.g(pesel) : null;
        f fVarF = f(passportVisualizationDto.getStatus());
        String surnameFirstLine = passportVisualizationDto.getSurnameFirstLine();
        b0 b0VarG5 = surnameFirstLine != null ? c0.g(surnameFirstLine) : null;
        g gVarG = g(passportVisualizationDto.getType());
        String birthPlaceSecondLine = passportVisualizationDto.getBirthPlaceSecondLine();
        String issuerNameSecondLine = passportVisualizationDto.getIssuerNameSecondLine();
        String nameSecondLine = passportVisualizationDto.getNameSecondLine();
        b0 b0VarG6 = nameSecondLine != null ? c0.g(nameSecondLine) : null;
        String surnameSecondLine = passportVisualizationDto.getSurnameSecondLine();
        b0 b0VarG7 = surnameSecondLine != null ? c0.g(surnameSecondLine) : null;
        List<PassportDiplomaticDataDto> diplomaticData = passportVisualizationDto.getDiplomaticData();
        ArrayList arrayList = new ArrayList(v.y(diplomaticData, 10));
        Iterator<T> it = diplomaticData.iterator();
        while (it.hasNext()) {
            arrayList.add(c((PassportDiplomaticDataDto) it.next()));
        }
        PassportRevocationDataDto revocationData = passportVisualizationDto.getRevocationData();
        return new PassportVisualization(localDate, birthPlaceFirstLine, citizenship, bVarB, offsetDateTime, localDate2, eVarJ, b0VarG, offsetDateTime2, issuerNameFirstLine, b0VarG2, b0VarG3, b0VarG4, fVarF, b0VarG5, gVarG, birthPlaceSecondLine, issuerNameSecondLine, b0VarG6, b0VarG7, arrayList, revocationData != null ? d(revocationData) : null);
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.time.ZonedDateTime] */
    public static final PassportsData i(PassportsDataDto passportsDataDto) {
        return new PassportsData(new fz.b.OffsetDateTime(t.c(passportsDataDto.getDate().getOffset(), ZoneOffset.UTC) ? passportsDataDto.getDate().toLocalDateTime().atZone(ZoneId.systemDefault()).toOffsetDateTime() : passportsDataDto.getDate()), a(passportsDataDto.getGroupedPassports()));
    }

    public static final xw.e j(PassportGenderDto passportGenderDto) {
        int i15 = C4153a.f166061j[passportGenderDto.ordinal()];
        if (i15 == 1) {
            return xw.e.MALE;
        }
        if (i15 == 2) {
            return xw.e.FEMALE;
        }
        throw new p();
    }

    public static final GroupedPassportsDto k(GroupedPassports groupedPassports) {
        List<PassportVisualization> listC = groupedPassports.c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(s((PassportVisualization) it.next()));
        }
        List<PassportVisualization> listB = groupedPassports.b();
        ArrayList arrayList2 = new ArrayList(v.y(listB, 10));
        Iterator<T> it4 = listB.iterator();
        while (it4.hasNext()) {
            arrayList2.add(s((PassportVisualization) it4.next()));
        }
        return new GroupedPassportsDto(arrayList, arrayList2);
    }

    public static final PassportCountryCodeDto l(b bVar) {
        int i15 = C4153a.f166055d[bVar.ordinal()];
        if (i15 == 1) {
            return PassportCountryCodeDto.POL;
        }
        if (i15 == 2) {
            return PassportCountryCodeDto.UNKNOWN;
        }
        throw new p();
    }

    public static final PassportDiplomaticDataDto m(PassportDiplomaticData passportDiplomaticData) {
        String number = passportDiplomaticData.getNumber();
        fz.b.LocalDate personalizationDate = passportDiplomaticData.getPersonalizationDate();
        return new PassportDiplomaticDataDto(number, personalizationDate != null ? personalizationDate.getDate() : null, passportDiplomaticData.getBody(), passportDiplomaticData.getCityAndDate(), passportDiplomaticData.getTitle());
    }

    public static final PassportGenderDto n(xw.e eVar) {
        int i15 = C4153a.f166056e[eVar.ordinal()];
        if (i15 == 1) {
            return PassportGenderDto.MALE;
        }
        if (i15 == 2) {
            return PassportGenderDto.FEMALE;
        }
        throw new p();
    }

    public static final PassportRevocationDataDto o(PassportRevocationData passportRevocationData) {
        fz.b.OffsetDateTime revocationDate = passportRevocationData.getRevocationDate();
        OffsetDateTime date = revocationDate != null ? revocationDate.getDate() : null;
        e revocationReason = passportRevocationData.getRevocationReason();
        return new PassportRevocationDataDto(date, revocationReason != null ? p(revocationReason) : null);
    }

    public static final PassportRevocationReasonDto p(e eVar) {
        switch (C4153a.f166052a[eVar.ordinal()]) {
            case 1:
                return PassportRevocationReasonDto.PERSONALIZATION_ERROR;
            case 2:
                return PassportRevocationReasonDto.INVALIDITY_DECLARATION_CITIZENSHIP_MISSING;
            case 3:
                return PassportRevocationReasonDto.INVALIDITY_DECLARATION_FORGERY;
            case 4:
                return PassportRevocationReasonDto.INVALIDITY_DECLARATION_OTHER;
            case 5:
                return PassportRevocationReasonDto.INVALIDITY_DECLARATION_WRONG_DATA;
            case 6:
                return PassportRevocationReasonDto.INVALIDITY_DECLARATION_PERSONALIZATION_ERROR;
            case 7:
                return PassportRevocationReasonDto.UNAUTHORIZED_USING_PERSONAL_DATA;
            case 8:
                return PassportRevocationReasonDto.CITIZEN_REQUEST;
            case 9:
                return PassportRevocationReasonDto.OFFICE_REQUEST;
            case 10:
                return PassportRevocationReasonDto.INVALID_DATA;
            case 11:
                return PassportRevocationReasonDto.THIRD_PARTY_FOUND_DOCUMENT;
            case 12:
                return PassportRevocationReasonDto.COMPLIANT;
            case 13:
                return PassportRevocationReasonDto.EXPIRED;
            case 14:
                return PassportRevocationReasonDto.DAMAGE;
            case 15:
                return PassportRevocationReasonDto.LOSS;
            case 16:
                return PassportRevocationReasonDto.RENUNCIATION_OF_CITIZENSHIP;
            case 17:
                return PassportRevocationReasonDto.LOSS_RIGHT_FOR_USING_PASSPORT;
            case 18:
                return PassportRevocationReasonDto.TECHNICAL_FAULTS;
            case 19:
                return PassportRevocationReasonDto.ISSUING_NEW_PASSPORT;
            case 20:
                return PassportRevocationReasonDto.DIED;
            case 21:
                return PassportRevocationReasonDto.DATA_CHANGED;
            case 22:
                return PassportRevocationReasonDto.DATA_MIGRATION;
            case 23:
                return PassportRevocationReasonDto.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final PassportStatusDto q(f fVar) {
        int i15 = C4153a.f166054c[fVar.ordinal()];
        if (i15 == 1) {
            return PassportStatusDto.ISSUED_TO_CITIZEN;
        }
        if (i15 == 2) {
            return PassportStatusDto.REVOKED;
        }
        if (i15 == 3) {
            return PassportStatusDto.UNKNOWN;
        }
        throw new p();
    }

    public static final PassportTypeDto r(g gVar) {
        int i15 = C4153a.f166053b[gVar.ordinal()];
        if (i15 == 1) {
            return PassportTypeDto.BIOMETRIC;
        }
        if (i15 == 2) {
            return PassportTypeDto.TEMPORARY;
        }
        if (i15 == 3) {
            return PassportTypeDto.BUSINESS;
        }
        if (i15 == 4) {
            return PassportTypeDto.DIPLOMATIC;
        }
        if (i15 == 5) {
            return PassportTypeDto.UNKNOWN;
        }
        throw new p();
    }

    public static final PassportVisualizationDto s(PassportVisualization passportVisualization) {
        fz.b.LocalDate birthDate = passportVisualization.getBirthDate();
        LocalDate date = birthDate != null ? birthDate.getDate() : null;
        String birthPlaceFirstLine = passportVisualization.getBirthPlaceFirstLine();
        String citizenship = passportVisualization.getCitizenship();
        PassportCountryCodeDto passportCountryCodeDtoL = l(passportVisualization.getCountryCode());
        OffsetDateTime date2 = passportVisualization.getExecutionDate().getDate();
        fz.b.LocalDate expiryDate = passportVisualization.getExpiryDate();
        LocalDate date3 = expiryDate != null ? expiryDate.getDate() : null;
        xw.e gender = passportVisualization.getGender();
        PassportGenderDto passportGenderDtoN = gender != null ? n(gender) : null;
        String strE = c0.e(passportVisualization.getId());
        fz.b.OffsetDateTime issueDate = passportVisualization.getIssueDate();
        OffsetDateTime date4 = issueDate != null ? issueDate.getDate() : null;
        String issuerNameFirstLine = passportVisualization.getIssuerNameFirstLine();
        b0 nameFirstLine = passportVisualization.getNameFirstLine();
        String strE2 = nameFirstLine != null ? c0.e(nameFirstLine) : null;
        String strE3 = c0.e(passportVisualization.getNumber());
        b0 pesel = passportVisualization.getPesel();
        String strE4 = pesel != null ? c0.e(pesel) : null;
        PassportStatusDto passportStatusDtoQ = q(passportVisualization.getStatus());
        b0 surnameFirstLine = passportVisualization.getSurnameFirstLine();
        String strE5 = surnameFirstLine != null ? c0.e(surnameFirstLine) : null;
        PassportTypeDto passportTypeDtoR = r(passportVisualization.getType());
        String birthPlaceSecondLine = passportVisualization.getBirthPlaceSecondLine();
        String issuerNameSecondLine = passportVisualization.getIssuerNameSecondLine();
        b0 nameSecondLine = passportVisualization.getNameSecondLine();
        String strE6 = nameSecondLine != null ? c0.e(nameSecondLine) : null;
        b0 surnameSecondLine = passportVisualization.getSurnameSecondLine();
        String strE7 = surnameSecondLine != null ? c0.e(surnameSecondLine) : null;
        List<PassportDiplomaticData> listF = passportVisualization.f();
        ArrayList arrayList = new ArrayList(v.y(listF, 10));
        Iterator<T> it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(m((PassportDiplomaticData) it.next()));
        }
        PassportRevocationData revocationData = passportVisualization.getRevocationData();
        return new PassportVisualizationDto(passportCountryCodeDtoL, arrayList, date2, strE, strE3, passportStatusDtoQ, passportTypeDtoR, date, birthPlaceFirstLine, birthPlaceSecondLine, citizenship, date3, passportGenderDtoN, date4, issuerNameFirstLine, issuerNameSecondLine, strE2, strE6, strE4, revocationData != null ? o(revocationData) : null, strE5, strE7);
    }

    public static final PassportsDataDto t(PassportsData passportsData) {
        return new PassportsDataDto(passportsData.getDate().getDate(), k(passportsData.getGroupedPassports()));
    }
}
