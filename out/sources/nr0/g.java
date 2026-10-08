package nr0;

import er0.BEDocumentAndCertificateStatuses;
import er0.BEDocumentStatus;
import er0.BEDocumentToGenerate;
import er0.BEExtUserCertificateStatus;
import er0.h;
import fr0.BEDocumentConfigLabel;
import gr0.DocumentSchemaLabel;
import gr0.DocumentsGroup;
import hr0.MultiDocumentSelectorLabel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.p;
import or0.DocumentAndCertificateStatusesDtoDto;
import or0.DocumentSchemaLabelDtoDto;
import or0.DocumentStatusDtoDto;
import or0.DocumentsGroupDtoDto;
import or0.ExtUserCertificateStatusDtoDto;
import or0.LabelDtoDto;
import or0.MultiDocumentSelectorLabelDtoDto;
import or0.g0;
import or0.k;
import or0.m0;
import or0.o;
import or0.p0;
import or0.r;
import or0.u0;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.EACTags;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0010\u001a\u00020\f*\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0014\u001a\u00020\u0013*\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0018\u001a\u00020\u0017*\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0011\u0010\u001c\u001a\u00020\u001b*\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001d\u0010!\u001a\u0004\u0018\u00010\u001a*\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"\u001a\u001d\u0010#\u001a\u0004\u0018\u00010\u001a*\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b#\u0010$\u001a\u0011\u0010'\u001a\u00020&*\u00020%¢\u0006\u0004\b'\u0010(\u001a\u0011\u0010)\u001a\u00020%*\u00020&¢\u0006\u0004\b)\u0010*\u001a\u0011\u0010-\u001a\u00020,*\u00020+¢\u0006\u0004\b-\u0010.\u001a\u0011\u0010/\u001a\u00020+*\u00020,¢\u0006\u0004\b/\u00100*\f\b\u0002\u00102\"\u0002012\u000201*\f\b\u0002\u00104\"\u0002032\u000203¨\u00065"}, d2 = {"Lor0/f0;", "Ler0/c;", "b", "(Lor0/f0;)Ler0/c;", "Lor0/r0;", "Ler0/f;", "d", "(Lor0/r0;)Ler0/f;", "Lor0/l;", "Ler0/b;", "a", "(Lor0/l;)Ler0/b;", "Lor0/a1;", "Lhr0/b;", "g", "(Lor0/a1;)Lhr0/b;", "m", "(Lhr0/b;)Lor0/a1;", "Lfr0/f;", "Lor0/t0;", "n", "(Lfr0/f;)Lor0/t0;", "Lor0/r;", "Ler0/e$a;", "c", "(Lor0/r;)Ler0/e$a;", "Lrq0/b;", "Lor0/m0;", "j", "(Lrq0/b;)Lor0/m0;", "Lor0/o;", "", "subtype", "h", "(Lor0/o;Ljava/lang/String;)Lrq0/b;", "i", "(Lor0/m0;Ljava/lang/String;)Lrq0/b;", "Lor0/o0;", "Lgr0/q;", "f", "(Lor0/o0;)Lgr0/q;", "k", "(Lgr0/q;)Lor0/o0;", "Lor0/p0;", "Lgr0/q$a;", "e", "(Lor0/p0;)Lgr0/q$a;", "l", "(Lgr0/q$a;)Lor0/p0;", "Lrq0/b$d;", "StaticDocumentType", "Lrq0/b$b;", "DynamicDocumentType", "offlinedocumentsservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f137850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f137851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f137852c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f137853d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f137854e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f137855f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f137856g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f137857h;

        static {
            int[] iArr = new int[g0.values().length];
            try {
                iArr[g0.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g0.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f137850a = iArr;
            int[] iArr2 = new int[k.values().length];
            try {
                iArr2[k.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[k.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[k.REVOKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[k.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f137851b = iArr2;
            int[] iArr3 = new int[BEDocumentConfigLabel.a.values().length];
            try {
                iArr3[BEDocumentConfigLabel.a.PL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[BEDocumentConfigLabel.a.EN.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[BEDocumentConfigLabel.a.UK.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[BEDocumentConfigLabel.a.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            f137852c = iArr3;
            int[] iArr4 = new int[r.values().length];
            try {
                iArr4[r.CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[r.CREATING_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[r.SCOPES_CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[r.SCOPES_CREATING_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[r.SIGNED.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[r.SIGNING_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[r.READY_FOR_DOWNLOAD.ordinal()] = 7;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[r.ENCRYPTING_ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[r.DOWNLOADED.ordinal()] = 9;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[r.DOWNLOADING_ERROR.ordinal()] = 10;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[r.MULTI_DOCUMENT_GENERATION_FINISHED.ordinal()] = 11;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[r.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused23) {
            }
            f137853d = iArr4;
            int[] iArr5 = new int[o.values().length];
            try {
                iArr5[o.MOBILE_ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[o.DIIA_PL.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[o.DRIVING_LICENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr5[o.DEPUTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr5[o.NURSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr5[o.MIDWIFE.ordinal()] = 6;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr5[o.PENSIONER.ordinal()] = 7;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr5[o.DOCTOR.ordinal()] = 8;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr5[o.DENTIST.ordinal()] = 9;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr5[o.FAMILY_CARD.ordinal()] = 10;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr5[o.UNIVERSITY_STUDENT_CARD.ordinal()] = 11;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr5[o.SCHOOL_STUDENT_CARD.ordinal()] = 12;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr5[o.VEHICLE_CARD.ordinal()] = 13;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr5[o.ADVOCATE_DATA.ordinal()] = 14;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr5[o.ATTORNEY_AT_LAW.ordinal()] = 15;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr5[o.TRAINEE_ATTORNEY_AT_LAW.ordinal()] = 16;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr5[o.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 17;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr5[o.TEACHER.ordinal()] = 18;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr5[o.BAILIFF.ordinal()] = 19;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr5[o.ELECTRONIC_DIPLOMA_GRADUATION.ordinal()] = 20;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr5[o.ELECTRONIC_DIPLOMA_PHD.ordinal()] = 21;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr5[o.ELECTRONIC_DIPLOMA_DSC.ordinal()] = 22;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr5[o.UUT.ordinal()] = 23;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr5[o.CIVIL_ENGINEER.ordinal()] = 24;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr5[o.WRU_DATA.ordinal()] = 25;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr5[o.DIIA_PL_KID.ordinal()] = 26;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr5[o.TAX_ADVISOR.ordinal()] = 27;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr5[o.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP.ordinal()] = 28;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr5[o.UNKNOWN.ordinal()] = 29;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr5[o.AUDITOR.ordinal()] = 30;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr5[o.SOLIDARITY_CARD.ordinal()] = 31;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr5[o.PHD_STUDENT.ordinal()] = 32;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr5[o.PHYSIOTHERAPIST.ordinal()] = 33;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr5[o.PHARMACIST.ordinal()] = 34;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr5[o.SHOOTING_LICENCE.ordinal()] = 35;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr5[o.SPORT_SHOOTING_COMPETITOR_LICENCE.ordinal()] = 36;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr5[o.SPORT_SHOOTING_COACH_LICENCE.ordinal()] = 37;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr5[o.SPORT_SHOOTING_INSTRUCTOR_LICENCE.ordinal()] = 38;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr5[o.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING.ordinal()] = 39;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr5[o.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING.ordinal()] = 40;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr5[o.SPORT_SHOOTING_RANGE_OFFICER_LICENCE.ordinal()] = 41;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr5[o.JUNIOR_SCHOOL_CARD.ordinal()] = 42;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr5[o.LABORATORY_DIAGNOSTICIAN.ordinal()] = 43;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr5[o.PENSIONER_MSWIA.ordinal()] = 44;
            } catch (NoSuchFieldError unused67) {
            }
            f137854e = iArr5;
            int[] iArr6 = new int[m0.values().length];
            try {
                iArr6[m0.MOBILE_ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr6[m0.DIIA_PL.ordinal()] = 2;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr6[m0.TEMPORARY_DRIVING_LICENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr6[m0.DRIVING_LICENCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr6[m0.DEPUTY.ordinal()] = 5;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr6[m0.NURSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr6[m0.MIDWIFE.ordinal()] = 7;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr6[m0.PENSIONER.ordinal()] = 8;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr6[m0.DOCTOR.ordinal()] = 9;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr6[m0.DENTIST.ordinal()] = 10;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr6[m0.FAMILY_CARD.ordinal()] = 11;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr6[m0.UNIVERSITY_STUDENT_CARD.ordinal()] = 12;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr6[m0.SCHOOL_STUDENT_CARD.ordinal()] = 13;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr6[m0.VEHICLE_CARD.ordinal()] = 14;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr6[m0.ADVOCATE_DATA.ordinal()] = 15;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr6[m0.ATTORNEY_AT_LAW.ordinal()] = 16;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr6[m0.TRAINEE_ATTORNEY_AT_LAW.ordinal()] = 17;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr6[m0.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 18;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr6[m0.TEACHER.ordinal()] = 19;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr6[m0.BAILIFF.ordinal()] = 20;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr6[m0.ELECTRONIC_DIPLOMA_GRADUATION.ordinal()] = 21;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr6[m0.ELECTRONIC_DIPLOMA_PHD.ordinal()] = 22;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr6[m0.ELECTRONIC_DIPLOMA_DSC.ordinal()] = 23;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr6[m0.UUT.ordinal()] = 24;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr6[m0.CIVIL_ENGINEER.ordinal()] = 25;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr6[m0.WRU_DATA.ordinal()] = 26;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr6[m0.DIIA_PL_KID.ordinal()] = 27;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr6[m0.TAX_ADVISOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr6[m0.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP.ordinal()] = 29;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr6[m0.UNKNOWN.ordinal()] = 30;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr6[m0.AUDITOR.ordinal()] = 31;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr6[m0.SOLIDARITY_CARD.ordinal()] = 32;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr6[m0.PHD_STUDENT.ordinal()] = 33;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr6[m0.PHYSIOTHERAPIST.ordinal()] = 34;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr6[m0.PHARMACIST.ordinal()] = 35;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr6[m0.SHOOTING_LICENCE.ordinal()] = 36;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr6[m0.SPORT_SHOOTING_COMPETITOR_LICENCE.ordinal()] = 37;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr6[m0.SPORT_SHOOTING_COACH_LICENCE.ordinal()] = 38;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr6[m0.SPORT_SHOOTING_INSTRUCTOR_LICENCE.ordinal()] = 39;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                iArr6[m0.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING.ordinal()] = 40;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                iArr6[m0.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING.ordinal()] = 41;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                iArr6[m0.SPORT_SHOOTING_RANGE_OFFICER_LICENCE.ordinal()] = 42;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                iArr6[m0.LABORATORY_DIAGNOSTICIAN.ordinal()] = 43;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                iArr6[m0.JUNIOR_SCHOOL_CARD.ordinal()] = 44;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                iArr6[m0.PENSIONER_MSWIA.ordinal()] = 45;
            } catch (NoSuchFieldError unused112) {
            }
            f137855f = iArr6;
            int[] iArr7 = new int[p0.values().length];
            try {
                iArr7[p0.ASC.ordinal()] = 1;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                iArr7[p0.DESC.ordinal()] = 2;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                iArr7[p0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused115) {
            }
            f137856g = iArr7;
            int[] iArr8 = new int[DocumentsGroup.a.values().length];
            try {
                iArr8[DocumentsGroup.a.ASC.ordinal()] = 1;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                iArr8[DocumentsGroup.a.DESC.ordinal()] = 2;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                iArr8[DocumentsGroup.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused118) {
            }
            f137857h = iArr8;
        }
    }

    public static final BEDocumentAndCertificateStatuses a(DocumentAndCertificateStatusesDtoDto documentAndCertificateStatusesDtoDto) {
        List<DocumentStatusDtoDto> listB = documentAndCertificateStatusesDtoDto.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(b((DocumentStatusDtoDto) it.next()));
        }
        List<ExtUserCertificateStatusDtoDto> listA = documentAndCertificateStatusesDtoDto.a();
        ArrayList arrayList2 = new ArrayList(v.y(listA, 10));
        Iterator<T> it4 = listA.iterator();
        while (it4.hasNext()) {
            arrayList2.add(d((ExtUserCertificateStatusDtoDto) it4.next()));
        }
        return new BEDocumentAndCertificateStatuses(arrayList, arrayList2, documentAndCertificateStatusesDtoDto.getUpdateVehicleCardsRequired());
    }

    public static final BEDocumentStatus b(DocumentStatusDtoDto documentStatusDtoDto) {
        h hVar;
        String id5 = documentStatusDtoDto.getId();
        int i15 = a.f137850a[documentStatusDtoDto.getStatus().ordinal()];
        if (i15 == 1) {
            hVar = h.ACTIVE;
        } else if (i15 == 2) {
            hVar = h.INACTIVE;
        } else {
            if (i15 != 3) {
                throw new p();
            }
            hVar = h.UNKNOWN;
        }
        return new BEDocumentStatus(id5, hVar, documentStatusDtoDto.getUpdateRequired());
    }

    public static final BEDocumentToGenerate.a c(r rVar) {
        switch (a.f137853d[rVar.ordinal()]) {
            case 1:
                return BEDocumentToGenerate.a.CREATED;
            case 2:
                return BEDocumentToGenerate.a.CREATING_ERROR;
            case 3:
                return BEDocumentToGenerate.a.SCOPES_CREATED;
            case 4:
                return BEDocumentToGenerate.a.SCOPES_CREATING_ERROR;
            case 5:
                return BEDocumentToGenerate.a.SIGNED;
            case 6:
                return BEDocumentToGenerate.a.SIGNING_ERROR;
            case 7:
                return BEDocumentToGenerate.a.READY_FOR_DOWNLOAD;
            case 8:
                return BEDocumentToGenerate.a.ENCRYPTING_ERROR;
            case 9:
                return BEDocumentToGenerate.a.DOWNLOADED;
            case 10:
                return BEDocumentToGenerate.a.DOWNLOADING_ERROR;
            case 11:
                return BEDocumentToGenerate.a.MULTI_DOCUMENT_GENERATION_FINISHED;
            case 12:
                return BEDocumentToGenerate.a.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final BEExtUserCertificateStatus d(ExtUserCertificateStatusDtoDto extUserCertificateStatusDtoDto) {
        h hVar;
        String serialNumber = extUserCertificateStatusDtoDto.getSerialNumber();
        int i15 = a.f137851b[extUserCertificateStatusDtoDto.getStatus().ordinal()];
        if (i15 == 1) {
            hVar = h.ACTIVE;
        } else if (i15 == 2) {
            hVar = h.INACTIVE;
        } else if (i15 == 3) {
            hVar = h.REVOKED;
        } else {
            if (i15 != 4) {
                throw new p();
            }
            hVar = h.UNKNOWN;
        }
        return new BEExtUserCertificateStatus(serialNumber, hVar);
    }

    public static final DocumentsGroup.a e(p0 p0Var) {
        int i15 = a.f137856g[p0Var.ordinal()];
        if (i15 == 1) {
            return DocumentsGroup.a.ASC;
        }
        if (i15 == 2) {
            return DocumentsGroup.a.DESC;
        }
        if (i15 == 3) {
            return DocumentsGroup.a.UNKNOWN;
        }
        throw new p();
    }

    public static final DocumentsGroup f(DocumentsGroupDtoDto documentsGroupDtoDto) {
        DocumentsGroup.a aVarE = e(documentsGroupDtoDto.getSortOrder());
        List<DocumentSchemaLabelDtoDto> listA = documentsGroupDtoDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(d.n((DocumentSchemaLabelDtoDto) it.next()));
        }
        return new DocumentsGroup(aVarE, arrayList);
    }

    public static final MultiDocumentSelectorLabel g(MultiDocumentSelectorLabelDtoDto multiDocumentSelectorLabelDtoDto) {
        ArrayList arrayList;
        List<LabelDtoDto> listA = multiDocumentSelectorLabelDtoDto.a();
        ArrayList arrayList2 = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList2.add(e.c((LabelDtoDto) it.next()));
        }
        List<LabelDtoDto> listB = multiDocumentSelectorLabelDtoDto.b();
        ArrayList arrayList3 = new ArrayList(v.y(listB, 10));
        Iterator<T> it4 = listB.iterator();
        while (it4.hasNext()) {
            arrayList3.add(e.c((LabelDtoDto) it4.next()));
        }
        List<LabelDtoDto> listC = multiDocumentSelectorLabelDtoDto.c();
        if (listC != null) {
            List<LabelDtoDto> list = listC;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it5 = list.iterator();
            while (it5.hasNext()) {
                arrayList.add(e.c((LabelDtoDto) it5.next()));
            }
        } else {
            arrayList = null;
        }
        return new MultiDocumentSelectorLabel(arrayList2, arrayList3, arrayList);
    }

    public static final rq0.b h(o oVar, String str) {
        Integer numU;
        switch (a.f137854e[oVar.ordinal()]) {
            case 1:
                return rq0.b.d.ID_CARD;
            case 2:
                return rq0.b.d.DIIA_REFUGEE_CARD;
            case 3:
                return rq0.b.d.DRIVING_LICENCE;
            case 4:
                return rq0.b.d.DEPUTY_CARD;
            case 5:
                return rq0.b.d.NURSE_CARD;
            case 6:
                return rq0.b.d.MIDWIFE_CARD;
            case 7:
                return rq0.b.d.PENSIONER_CARD;
            case 8:
                return rq0.b.EnumC4479b.DOCTOR;
            case 9:
                return rq0.b.EnumC4479b.DENTIST;
            case 10:
                return rq0.b.d.FAMILY_CARD;
            case 11:
                return rq0.b.d.STUDENT_CARD;
            case 12:
                return rq0.b.d.SCHOOL_CARD;
            case 13:
                return rq0.b.d.VEHICLE_CARD;
            case 14:
                return rq0.b.d.ADVOCATE_CARD;
            case 15:
                return rq0.b.EnumC4479b.ATTORNEY_AT_LAW;
            case 16:
                return rq0.b.EnumC4479b.TRAINEE_ATTORNEY_AT_LAW;
            case 17:
                return rq0.b.c.DISABLED_PERSON_IDENTIFICATION_CARD;
            case 18:
                return rq0.b.c.TEACHER;
            case 19:
                return rq0.b.c.BAILIFF_CARD;
            case 20:
                return rq0.b.c.ELECTRONIC_DIPLOMA_GRADUATION;
            case 21:
                return rq0.b.c.ELECTRONIC_DIPLOMA_PHD;
            case 22:
                return rq0.b.c.ELECTRONIC_DIPLOMA_DSC;
            case 23:
                return rq0.b.d.RAILWAY_CARD;
            case 24:
                return rq0.b.EnumC4479b.CIVIL_ENGINEER;
            case 25:
                if (str == null || (numU = fu.r.u(str)) == null) {
                    return null;
                }
                return rq0.b.e.INSTANCE.a(numU.intValue());
            case 26:
                return rq0.b.d.DIIA_REFUGEE_CHILD_CARD;
            case 27:
                return rq0.b.EnumC4479b.TAX_ADVISOR;
            case 28:
                return rq0.b.EnumC4479b.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP;
            case 29:
                return null;
            case 30:
                return rq0.b.EnumC4479b.AUDITOR;
            case BERTags.DATE /* 31 */:
                return rq0.b.EnumC4479b.SOLIDARITY_CARD;
            case 32:
                return rq0.b.EnumC4479b.PHD_STUDENT;
            case 33:
                return rq0.b.EnumC4479b.PHYSIOTHERAPIST;
            case 34:
                return rq0.b.EnumC4479b.PHARMACIST;
            case 35:
                return rq0.b.EnumC4479b.SHOOTING_LICENCE;
            case 36:
                return rq0.b.EnumC4479b.SPORT_SHOOTING_COMPETITOR_LICENCE;
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                return rq0.b.EnumC4479b.SPORT_SHOOTING_COACH_LICENCE;
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                return rq0.b.EnumC4479b.SPORT_SHOOTING_INSTRUCTOR_LICENCE;
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                return rq0.b.EnumC4479b.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING;
            case 40:
                return rq0.b.EnumC4479b.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING;
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                return rq0.b.EnumC4479b.SPORT_SHOOTING_RANGE_OFFICER_LICENCE;
            case EACTags.CURRENCY_CODE /* 42 */:
                return null;
            case EACTags.DATE_OF_BIRTH /* 43 */:
                return rq0.b.EnumC4479b.LABORATORY_DIAGNOSTICIAN;
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                return rq0.b.EnumC4479b.PENSIONER_MSWIA;
            default:
                throw new p();
        }
    }

    public static final rq0.b i(m0 m0Var, String str) {
        Integer numU;
        switch (a.f137855f[m0Var.ordinal()]) {
            case 1:
                return rq0.b.d.ID_CARD;
            case 2:
                return rq0.b.d.DIIA_REFUGEE_CARD;
            case 3:
            case 4:
                return rq0.b.d.DRIVING_LICENCE;
            case 5:
                return rq0.b.d.DEPUTY_CARD;
            case 6:
                return rq0.b.d.NURSE_CARD;
            case 7:
                return rq0.b.d.MIDWIFE_CARD;
            case 8:
                return rq0.b.d.PENSIONER_CARD;
            case 9:
                return rq0.b.EnumC4479b.DOCTOR;
            case 10:
                return rq0.b.EnumC4479b.DENTIST;
            case 11:
                return rq0.b.d.FAMILY_CARD;
            case 12:
                return rq0.b.d.STUDENT_CARD;
            case 13:
                return rq0.b.d.SCHOOL_CARD;
            case 14:
                return rq0.b.d.VEHICLE_CARD;
            case 15:
                return rq0.b.d.ADVOCATE_CARD;
            case 16:
                return rq0.b.EnumC4479b.ATTORNEY_AT_LAW;
            case 17:
                return rq0.b.EnumC4479b.TRAINEE_ATTORNEY_AT_LAW;
            case 18:
                return rq0.b.c.DISABLED_PERSON_IDENTIFICATION_CARD;
            case 19:
                return rq0.b.c.TEACHER;
            case 20:
                return rq0.b.c.BAILIFF_CARD;
            case 21:
                return rq0.b.c.ELECTRONIC_DIPLOMA_GRADUATION;
            case 22:
                return rq0.b.c.ELECTRONIC_DIPLOMA_PHD;
            case 23:
                return rq0.b.c.ELECTRONIC_DIPLOMA_DSC;
            case 24:
                return rq0.b.d.RAILWAY_CARD;
            case 25:
                return rq0.b.EnumC4479b.CIVIL_ENGINEER;
            case 26:
                if (str == null || (numU = fu.r.u(str)) == null) {
                    return null;
                }
                return rq0.b.e.INSTANCE.a(numU.intValue());
            case 27:
                return rq0.b.d.DIIA_REFUGEE_CHILD_CARD;
            case 28:
                return rq0.b.EnumC4479b.TAX_ADVISOR;
            case 29:
                return rq0.b.EnumC4479b.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP;
            case 30:
                return null;
            case BERTags.DATE /* 31 */:
                return rq0.b.EnumC4479b.AUDITOR;
            case 32:
                return rq0.b.EnumC4479b.SOLIDARITY_CARD;
            case 33:
                return rq0.b.EnumC4479b.PHD_STUDENT;
            case 34:
                return rq0.b.EnumC4479b.PHYSIOTHERAPIST;
            case 35:
                return rq0.b.EnumC4479b.PHARMACIST;
            case 36:
                return rq0.b.EnumC4479b.SHOOTING_LICENCE;
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                return rq0.b.EnumC4479b.SPORT_SHOOTING_COMPETITOR_LICENCE;
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                return rq0.b.EnumC4479b.SPORT_SHOOTING_COACH_LICENCE;
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                return rq0.b.EnumC4479b.SPORT_SHOOTING_INSTRUCTOR_LICENCE;
            case 40:
                return rq0.b.EnumC4479b.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING;
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                return rq0.b.EnumC4479b.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING;
            case EACTags.CURRENCY_CODE /* 42 */:
                return rq0.b.EnumC4479b.SPORT_SHOOTING_RANGE_OFFICER_LICENCE;
            case EACTags.DATE_OF_BIRTH /* 43 */:
                return rq0.b.EnumC4479b.LABORATORY_DIAGNOSTICIAN;
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                return null;
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                return rq0.b.EnumC4479b.PENSIONER_MSWIA;
            default:
                throw new p();
        }
    }

    public static final m0 j(rq0.b bVar) {
        if (bVar == rq0.b.d.ID_CARD) {
            return m0.MOBILE_ID_CARD;
        }
        if (bVar == rq0.b.d.DRIVING_LICENCE) {
            return m0.DRIVING_LICENCE;
        }
        if (bVar == rq0.b.d.VEHICLE_CARD) {
            return m0.VEHICLE_CARD;
        }
        if (bVar == rq0.b.d.FAMILY_CARD) {
            return m0.FAMILY_CARD;
        }
        if (bVar == rq0.b.d.DIIA_REFUGEE_CARD) {
            return m0.DIIA_PL;
        }
        if (bVar == rq0.b.d.DIIA_REFUGEE_CHILD_CARD) {
            return m0.DIIA_PL_KID;
        }
        if (bVar == rq0.b.d.SCHOOL_CARD) {
            return m0.SCHOOL_STUDENT_CARD;
        }
        if (bVar == rq0.b.d.STUDENT_CARD) {
            return m0.UNIVERSITY_STUDENT_CARD;
        }
        if (bVar == rq0.b.d.PENSIONER_CARD) {
            return m0.PENSIONER;
        }
        if (bVar == rq0.b.d.DEPUTY_CARD) {
            return m0.DEPUTY;
        }
        if (bVar == rq0.b.d.ADVOCATE_CARD) {
            return m0.ADVOCATE_DATA;
        }
        if (bVar == rq0.b.d.MIDWIFE_CARD) {
            return m0.MIDWIFE;
        }
        if (bVar == rq0.b.d.NURSE_CARD) {
            return m0.NURSE;
        }
        if (bVar == rq0.b.d.RAILWAY_CARD) {
            return m0.UUT;
        }
        if (bVar == rq0.b.EnumC4479b.DENTIST) {
            return m0.DENTIST;
        }
        if (bVar == rq0.b.EnumC4479b.CIVIL_ENGINEER) {
            return m0.CIVIL_ENGINEER;
        }
        if (bVar == rq0.b.EnumC4479b.DOCTOR) {
            return m0.DOCTOR;
        }
        if (bVar == rq0.b.c.DISABLED_PERSON_IDENTIFICATION_CARD) {
            return m0.DISABLED_PERSON_IDENTIFICATION_CARD;
        }
        if (bVar == rq0.b.c.TEACHER) {
            return m0.TEACHER;
        }
        if (bVar == rq0.b.c.BAILIFF_CARD) {
            return m0.BAILIFF;
        }
        if (bVar == rq0.b.c.ELECTRONIC_DIPLOMA_GRADUATION) {
            return m0.ELECTRONIC_DIPLOMA_GRADUATION;
        }
        if (bVar == rq0.b.c.ELECTRONIC_DIPLOMA_PHD) {
            return m0.ELECTRONIC_DIPLOMA_PHD;
        }
        if (bVar == rq0.b.c.ELECTRONIC_DIPLOMA_DSC) {
            return m0.ELECTRONIC_DIPLOMA_DSC;
        }
        if (bVar == rq0.b.EnumC4479b.ATTORNEY_AT_LAW) {
            return m0.ATTORNEY_AT_LAW;
        }
        if (bVar == rq0.b.EnumC4479b.TRAINEE_ATTORNEY_AT_LAW) {
            return m0.TRAINEE_ATTORNEY_AT_LAW;
        }
        if (bVar instanceof rq0.b.e) {
            return m0.WRU_DATA;
        }
        if (bVar == rq0.b.EnumC4479b.TAX_ADVISOR) {
            return m0.TAX_ADVISOR;
        }
        if (bVar == rq0.b.EnumC4479b.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP) {
            return m0.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP;
        }
        if (bVar == rq0.b.EnumC4479b.AUDITOR) {
            return m0.AUDITOR;
        }
        if (bVar == rq0.b.EnumC4479b.SOLIDARITY_CARD) {
            return m0.SOLIDARITY_CARD;
        }
        if (bVar == rq0.b.EnumC4479b.PHD_STUDENT) {
            return m0.PHD_STUDENT;
        }
        if (bVar == rq0.b.EnumC4479b.PHYSIOTHERAPIST) {
            return m0.PHYSIOTHERAPIST;
        }
        if (bVar == rq0.b.EnumC4479b.PHARMACIST) {
            return m0.PHARMACIST;
        }
        if (bVar == rq0.b.EnumC4479b.SHOOTING_LICENCE) {
            return m0.SHOOTING_LICENCE;
        }
        if (bVar == rq0.b.EnumC4479b.SPORT_SHOOTING_COMPETITOR_LICENCE) {
            return m0.SPORT_SHOOTING_COMPETITOR_LICENCE;
        }
        if (bVar == rq0.b.EnumC4479b.SPORT_SHOOTING_COACH_LICENCE) {
            return m0.SPORT_SHOOTING_COACH_LICENCE;
        }
        if (bVar == rq0.b.EnumC4479b.SPORT_SHOOTING_INSTRUCTOR_LICENCE) {
            return m0.SPORT_SHOOTING_INSTRUCTOR_LICENCE;
        }
        if (bVar == rq0.b.EnumC4479b.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING) {
            return m0.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING;
        }
        if (bVar == rq0.b.EnumC4479b.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING) {
            return m0.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING;
        }
        if (bVar == rq0.b.EnumC4479b.SPORT_SHOOTING_RANGE_OFFICER_LICENCE) {
            return m0.SPORT_SHOOTING_RANGE_OFFICER_LICENCE;
        }
        if (bVar != rq0.b.EnumC4479b.DEFAULT && bVar != rq0.b.c.DEFAULT) {
            if (bVar == rq0.b.EnumC4479b.LABORATORY_DIAGNOSTICIAN) {
                return m0.LABORATORY_DIAGNOSTICIAN;
            }
            if (bVar == rq0.b.EnumC4479b.PENSIONER_MSWIA) {
                return m0.PENSIONER_MSWIA;
            }
            throw new p();
        }
        return m0.UNKNOWN;
    }

    public static final DocumentsGroupDtoDto k(DocumentsGroup documentsGroup) {
        p0 p0VarL = l(documentsGroup.getSortOrder());
        List<DocumentSchemaLabel> listA = documentsGroup.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(d.Y((DocumentSchemaLabel) it.next()));
        }
        return new DocumentsGroupDtoDto(arrayList, p0VarL);
    }

    public static final p0 l(DocumentsGroup.a aVar) {
        int i15 = a.f137857h[aVar.ordinal()];
        if (i15 == 1) {
            return p0.ASC;
        }
        if (i15 == 2) {
            return p0.DESC;
        }
        if (i15 == 3) {
            return p0.UNKNOWN;
        }
        throw new p();
    }

    public static final MultiDocumentSelectorLabelDtoDto m(MultiDocumentSelectorLabel multiDocumentSelectorLabel) {
        ArrayList arrayList;
        List<BEDocumentConfigLabel> listA = multiDocumentSelectorLabel.a();
        ArrayList arrayList2 = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList2.add(n((BEDocumentConfigLabel) it.next()));
        }
        List<BEDocumentConfigLabel> listB = multiDocumentSelectorLabel.b();
        ArrayList arrayList3 = new ArrayList(v.y(listB, 10));
        Iterator<T> it4 = listB.iterator();
        while (it4.hasNext()) {
            arrayList3.add(n((BEDocumentConfigLabel) it4.next()));
        }
        List<BEDocumentConfigLabel> listC = multiDocumentSelectorLabel.c();
        if (listC != null) {
            List<BEDocumentConfigLabel> list = listC;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it5 = list.iterator();
            while (it5.hasNext()) {
                arrayList.add(n((BEDocumentConfigLabel) it5.next()));
            }
        } else {
            arrayList = null;
        }
        return new MultiDocumentSelectorLabelDtoDto(arrayList2, arrayList3, arrayList);
    }

    public static final LabelDtoDto n(BEDocumentConfigLabel bEDocumentConfigLabel) {
        u0 u0Var;
        BEDocumentConfigLabel.a language = bEDocumentConfigLabel.getLanguage();
        int i15 = language == null ? -1 : a.f137852c[language.ordinal()];
        if (i15 == -1) {
            u0Var = u0.UNKNOWN;
        } else if (i15 == 1) {
            u0Var = u0.PL;
        } else if (i15 == 2) {
            u0Var = u0.EN;
        } else if (i15 != 3) {
            if (i15 != 4) {
                throw new p();
            }
            u0Var = u0.UNKNOWN;
        } else {
            u0Var = u0.UK;
        }
        String value = bEDocumentConfigLabel.getValue();
        if (value == null) {
            value = "";
        }
        return new LabelDtoDto(u0Var, value);
    }
}
