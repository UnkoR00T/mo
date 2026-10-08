package w24;

import f24.CertificateData;
import g24.DocumentSchema;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.cms.CMSSignedData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"Lw24/l2;", "Lk24/n;", "Lpx/d;", "remoteLogger", "Lv24/b;", "documentsContainerRepository", "Lv24/a;", "certificateRepository", "Lw24/g;", "decryptListOfScopesUC", "<init>", "(Lpx/d;Lv24/b;Lv24/a;Lw24/g;)V", "Lk24/n$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Lk24/n$a;Ltq/e;)Ljava/lang/Object;", "a", "Lpx/d;", "b", "Lv24/b;", "c", "Lv24/a;", "Lw24/g;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l2 implements k24.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v24.b documentsContainerRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v24.a certificateRepository;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g decryptListOfScopesUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f209775a;

        static {
            int[] iArr = new int[f24.i.values().length];
            try {
                iArr[f24.i.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f24.i.REFUGEE_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f24.i.REFUGEE_CHILD_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f24.i.RAILWAY_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f24.i.FAMILY_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[f24.i.DRIVING_LICENCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[f24.i.VEHICLE_CARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[f24.i.PENSIONER_CARD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[f24.i.DEPUTY_CARD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[f24.i.ADVOCATE_CARD.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[f24.i.MIDWIFE_CARD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[f24.i.NURSE_CARD.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[f24.i.RASKA_SENIOR_LICENCE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[f24.i.ZDUNSKOWOLSKA_RESIDENT_LICENCE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[f24.i.OLAWA_RESIDENT_LICENCE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[f24.i.OLAWA_FAMILY_LICENCE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[f24.i.OLAWA_SENIOR_LICENCE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[f24.i.ZDUNSKOWOLSKA_FAMILY_LICENCE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[f24.i.ZDUNSKOWOLSKA_SENIOR_LICENCE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[f24.i.SUCHY_LAS_FAMILY_LICENCE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[f24.i.MIEJSKA_AUGUSTOW_TOURIST_LICENCE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[f24.i.CHELM_FAMILY_LICENCE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[f24.i.CHELM_SENIOR_LICENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[f24.i.CHELM_RESIDENT_LICENCE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[f24.i.LODZ_SENIOR_LICENCE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[f24.i.LODZ_FAMILY_LICENCE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[f24.i.SENATOR_CARD.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[f24.i.RACIBORSKA_RESIDENT_LICENCE.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[f24.i.RACIBORSKA_SENIOR_LICENCE.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[f24.i.RACIBORSKA_FAMILY_LICENCE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[f24.i.GIZYCKA_RESIDENT_LICENCE.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[f24.i.PZPN_LICENCE.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[f24.i.KOBYLKA_RESIDENT_LICENCE.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[f24.i.WROCLAWSKA_SENIOR_LICENCE.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[f24.i.MIEKINIA_SENIOR_LICENCE.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[f24.i.MIEKINIA_FAMILY_LICENCE.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[f24.i.TOPR_LICENCE.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[f24.i.MAZOVIA_LICENCE.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[f24.i.GENERAL_COUNSEL_LICENCE.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[f24.i.OLECKO_RESIDENT_LICENCE.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[f24.i.BYDGOSZCZ_FAMILY_LICENCE.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[f24.i.WODZISLAW_FAMILY_LICENCE.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[f24.i.MICHALOWICE_RESIDENT_LICENCE.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[f24.i.KOLEJE_DOLNOSLASKIE_LICENCE.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[f24.i.WISLA_RESIDENT_LICENCE.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[f24.i.JASTRZEBIA_GORA_RESIDENT_LICENCE.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[f24.i.FIREFIGHTER_OSP_LICENCE.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[f24.i.DOCTOR.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[f24.i.DENTIST.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[f24.i.ATTORNEY_AT_LAW.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[f24.i.TRAINEE_ATTORNEY_AT_LAW.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[f24.i.CIVIL_ENGINEER.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[f24.i.TAX_ADVISOR.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[f24.i.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[f24.i.AUDITOR.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[f24.i.SOLIDARITY_CARD.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[f24.i.PHD_STUDENT.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[f24.i.PHYSIOTHERAPIST.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[f24.i.PHARMACIST.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[f24.i.SHOOTING_LICENCE.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[f24.i.SPORT_SHOOTING_COMPETITOR_LICENCE.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[f24.i.SPORT_SHOOTING_COACH_LICENCE.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[f24.i.SPORT_SHOOTING_INSTRUCTOR_LICENCE.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[f24.i.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[f24.i.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[f24.i.SPORT_SHOOTING_RANGE_OFFICER_LICENCE.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[f24.i.LABORATORY_DIAGNOSTICIAN.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[f24.i.PENSIONER_MSWIA.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[f24.i.ELECTRONIC_DIPLOMA_GRADUATION.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[f24.i.ELECTRONIC_DIPLOMA_PHD.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[f24.i.ELECTRONIC_DIPLOMA_DSC.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[f24.i.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[f24.i.TEACHER.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[f24.i.BAILIFF_CARD.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[f24.i.STUDENT_CARD.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            f209775a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f209776d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f209777e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f209778f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f209779g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f209780h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f209781j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f209782k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f209783l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f209784m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f209785n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f209786p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f209787q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f209788r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f209789s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f209790t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f209791v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f209793x;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f209791v = obj;
            this.f209793x |= PKIFailureInfo.systemUnavail;
            return l2.this.c(null, this);
        }
    }

    public l2(px.d dVar, v24.b bVar, v24.a aVar, g gVar) {
        this.remoteLogger = dVar;
        this.documentsContainerRepository = bVar;
        this.certificateRepository = aVar;
        this.decryptListOfScopesUC = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:105:0x03ff A[Catch: Exception -> 0x0258, c -> 0x025c, CancellationException -> 0x0260, TRY_ENTER, TryCatch #19 {c -> 0x025c, CancellationException -> 0x0260, Exception -> 0x0258, blocks: (B:153:0x0666, B:155:0x067c, B:63:0x024b, B:105:0x03ff, B:106:0x0404, B:107:0x0405, B:108:0x0419, B:109:0x041a, B:111:0x0439, B:113:0x043f, B:119:0x0491, B:120:0x04a3, B:121:0x04a4, B:122:0x04b6, B:123:0x04b7, B:125:0x04c0, B:131:0x0530, B:132:0x0542, B:133:0x0543, B:140:0x05af, B:145:0x060e, B:147:0x0616, B:149:0x061c, B:161:0x06e5, B:162:0x06f7, B:163:0x06f8, B:165:0x06ff, B:171:0x076f, B:172:0x0781), top: B:263:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0405 A[Catch: Exception -> 0x0258, c -> 0x025c, CancellationException -> 0x0260, TryCatch #19 {c -> 0x025c, CancellationException -> 0x0260, Exception -> 0x0258, blocks: (B:153:0x0666, B:155:0x067c, B:63:0x024b, B:105:0x03ff, B:106:0x0404, B:107:0x0405, B:108:0x0419, B:109:0x041a, B:111:0x0439, B:113:0x043f, B:119:0x0491, B:120:0x04a3, B:121:0x04a4, B:122:0x04b6, B:123:0x04b7, B:125:0x04c0, B:131:0x0530, B:132:0x0542, B:133:0x0543, B:140:0x05af, B:145:0x060e, B:147:0x0616, B:149:0x061c, B:161:0x06e5, B:162:0x06f7, B:163:0x06f8, B:165:0x06ff, B:171:0x076f, B:172:0x0781), top: B:263:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:109:0x041a A[Catch: Exception -> 0x0258, c -> 0x025c, CancellationException -> 0x0260, TryCatch #19 {c -> 0x025c, CancellationException -> 0x0260, Exception -> 0x0258, blocks: (B:153:0x0666, B:155:0x067c, B:63:0x024b, B:105:0x03ff, B:106:0x0404, B:107:0x0405, B:108:0x0419, B:109:0x041a, B:111:0x0439, B:113:0x043f, B:119:0x0491, B:120:0x04a3, B:121:0x04a4, B:122:0x04b6, B:123:0x04b7, B:125:0x04c0, B:131:0x0530, B:132:0x0542, B:133:0x0543, B:140:0x05af, B:145:0x060e, B:147:0x0616, B:149:0x061c, B:161:0x06e5, B:162:0x06f7, B:163:0x06f8, B:165:0x06ff, B:171:0x076f, B:172:0x0781), top: B:263:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0439 A[Catch: Exception -> 0x0258, c -> 0x025c, CancellationException -> 0x0260, TryCatch #19 {c -> 0x025c, CancellationException -> 0x0260, Exception -> 0x0258, blocks: (B:153:0x0666, B:155:0x067c, B:63:0x024b, B:105:0x03ff, B:106:0x0404, B:107:0x0405, B:108:0x0419, B:109:0x041a, B:111:0x0439, B:113:0x043f, B:119:0x0491, B:120:0x04a3, B:121:0x04a4, B:122:0x04b6, B:123:0x04b7, B:125:0x04c0, B:131:0x0530, B:132:0x0542, B:133:0x0543, B:140:0x05af, B:145:0x060e, B:147:0x0616, B:149:0x061c, B:161:0x06e5, B:162:0x06f7, B:163:0x06f8, B:165:0x06ff, B:171:0x076f, B:172:0x0781), top: B:263:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:113:0x043f A[Catch: Exception -> 0x0258, c -> 0x025c, CancellationException -> 0x0260, TRY_LEAVE, TryCatch #19 {c -> 0x025c, CancellationException -> 0x0260, Exception -> 0x0258, blocks: (B:153:0x0666, B:155:0x067c, B:63:0x024b, B:105:0x03ff, B:106:0x0404, B:107:0x0405, B:108:0x0419, B:109:0x041a, B:111:0x0439, B:113:0x043f, B:119:0x0491, B:120:0x04a3, B:121:0x04a4, B:122:0x04b6, B:123:0x04b7, B:125:0x04c0, B:131:0x0530, B:132:0x0542, B:133:0x0543, B:140:0x05af, B:145:0x060e, B:147:0x0616, B:149:0x061c, B:161:0x06e5, B:162:0x06f7, B:163:0x06f8, B:165:0x06ff, B:171:0x076f, B:172:0x0781), top: B:263:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0485  */
    /* JADX WARN: Code duplicated, block: B:119:0x0491 A[Catch: Exception -> 0x0258, c -> 0x025c, CancellationException -> 0x0260, TRY_ENTER, TryCatch #19 {c -> 0x025c, CancellationException -> 0x0260, Exception -> 0x0258, blocks: (B:153:0x0666, B:155:0x067c, B:63:0x024b, B:105:0x03ff, B:106:0x0404, B:107:0x0405, B:108:0x0419, B:109:0x041a, B:111:0x0439, B:113:0x043f, B:119:0x0491, B:120:0x04a3, B:121:0x04a4, B:122:0x04b6, B:123:0x04b7, B:125:0x04c0, B:131:0x0530, B:132:0x0542, B:133:0x0543, B:140:0x05af, B:145:0x060e, B:147:0x0616, B:149:0x061c, B:161:0x06e5, B:162:0x06f7, B:163:0x06f8, B:165:0x06ff, B:171:0x076f, B:172:0x0781), top: B:263:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:121:0x04a4 A[Catch: Exception -> 0x0258, c -> 0x025c, CancellationException -> 0x0260, TryCatch #19 {c -> 0x025c, CancellationException -> 0x0260, Exception -> 0x0258, blocks: (B:153:0x0666, B:155:0x067c, B:63:0x024b, B:105:0x03ff, B:106:0x0404, B:107:0x0405, B:108:0x0419, B:109:0x041a, B:111:0x0439, B:113:0x043f, B:119:0x0491, B:120:0x04a3, B:121:0x04a4, B:122:0x04b6, B:123:0x04b7, B:125:0x04c0, B:131:0x0530, B:132:0x0542, B:133:0x0543, B:140:0x05af, B:145:0x060e, B:147:0x0616, B:149:0x061c, B:161:0x06e5, B:162:0x06f7, B:163:0x06f8, B:165:0x06ff, B:171:0x076f, B:172:0x0781), top: B:263:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:123:0x04b7 A[Catch: Exception -> 0x0258, c -> 0x025c, CancellationException -> 0x0260, TryCatch #19 {c -> 0x025c, CancellationException -> 0x0260, Exception -> 0x0258, blocks: (B:153:0x0666, B:155:0x067c, B:63:0x024b, B:105:0x03ff, B:106:0x0404, B:107:0x0405, B:108:0x0419, B:109:0x041a, B:111:0x0439, B:113:0x043f, B:119:0x0491, B:120:0x04a3, B:121:0x04a4, B:122:0x04b6, B:123:0x04b7, B:125:0x04c0, B:131:0x0530, B:132:0x0542, B:133:0x0543, B:140:0x05af, B:145:0x060e, B:147:0x0616, B:149:0x061c, B:161:0x06e5, B:162:0x06f7, B:163:0x06f8, B:165:0x06ff, B:171:0x076f, B:172:0x0781), top: B:263:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:125:0x04c0 A[Catch: Exception -> 0x0258, c -> 0x025c, CancellationException -> 0x0260, TRY_LEAVE, TryCatch #19 {c -> 0x025c, CancellationException -> 0x0260, Exception -> 0x0258, blocks: (B:153:0x0666, B:155:0x067c, B:63:0x024b, B:105:0x03ff, B:106:0x0404, B:107:0x0405, B:108:0x0419, B:109:0x041a, B:111:0x0439, B:113:0x043f, B:119:0x0491, B:120:0x04a3, B:121:0x04a4, B:122:0x04b6, B:123:0x04b7, B:125:0x04c0, B:131:0x0530, B:132:0x0542, B:133:0x0543, B:140:0x05af, B:145:0x060e, B:147:0x0616, B:149:0x061c, B:161:0x06e5, B:162:0x06f7, B:163:0x06f8, B:165:0x06ff, B:171:0x076f, B:172:0x0781), top: B:263:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0524  */
    /* JADX WARN: Code duplicated, block: B:131:0x0530 A[Catch: Exception -> 0x0258, c -> 0x025c, CancellationException -> 0x0260, TRY_ENTER, TryCatch #19 {c -> 0x025c, CancellationException -> 0x0260, Exception -> 0x0258, blocks: (B:153:0x0666, B:155:0x067c, B:63:0x024b, B:105:0x03ff, B:106:0x0404, B:107:0x0405, B:108:0x0419, B:109:0x041a, B:111:0x0439, B:113:0x043f, B:119:0x0491, B:120:0x04a3, B:121:0x04a4, B:122:0x04b6, B:123:0x04b7, B:125:0x04c0, B:131:0x0530, B:132:0x0542, B:133:0x0543, B:140:0x05af, B:145:0x060e, B:147:0x0616, B:149:0x061c, B:161:0x06e5, B:162:0x06f7, B:163:0x06f8, B:165:0x06ff, B:171:0x076f, B:172:0x0781), top: B:263:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0543 A[Catch: Exception -> 0x0258, c -> 0x025c, CancellationException -> 0x0260, TRY_LEAVE, TryCatch #19 {c -> 0x025c, CancellationException -> 0x0260, Exception -> 0x0258, blocks: (B:153:0x0666, B:155:0x067c, B:63:0x024b, B:105:0x03ff, B:106:0x0404, B:107:0x0405, B:108:0x0419, B:109:0x041a, B:111:0x0439, B:113:0x043f, B:119:0x0491, B:120:0x04a3, B:121:0x04a4, B:122:0x04b6, B:123:0x04b7, B:125:0x04c0, B:131:0x0530, B:132:0x0542, B:133:0x0543, B:140:0x05af, B:145:0x060e, B:147:0x0616, B:149:0x061c, B:161:0x06e5, B:162:0x06f7, B:163:0x06f8, B:165:0x06ff, B:171:0x076f, B:172:0x0781), top: B:263:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:136:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:139:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:142:0x0607  */
    /* JADX WARN: Code duplicated, block: B:143:0x0609  */
    /* JADX WARN: Code duplicated, block: B:145:0x060e A[Catch: Exception -> 0x0258, c -> 0x025c, CancellationException -> 0x0260, TryCatch #19 {c -> 0x025c, CancellationException -> 0x0260, Exception -> 0x0258, blocks: (B:153:0x0666, B:155:0x067c, B:63:0x024b, B:105:0x03ff, B:106:0x0404, B:107:0x0405, B:108:0x0419, B:109:0x041a, B:111:0x0439, B:113:0x043f, B:119:0x0491, B:120:0x04a3, B:121:0x04a4, B:122:0x04b6, B:123:0x04b7, B:125:0x04c0, B:131:0x0530, B:132:0x0542, B:133:0x0543, B:140:0x05af, B:145:0x060e, B:147:0x0616, B:149:0x061c, B:161:0x06e5, B:162:0x06f7, B:163:0x06f8, B:165:0x06ff, B:171:0x076f, B:172:0x0781), top: B:263:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:147:0x0616 A[Catch: Exception -> 0x0258, c -> 0x025c, CancellationException -> 0x0260, TryCatch #19 {c -> 0x025c, CancellationException -> 0x0260, Exception -> 0x0258, blocks: (B:153:0x0666, B:155:0x067c, B:63:0x024b, B:105:0x03ff, B:106:0x0404, B:107:0x0405, B:108:0x0419, B:109:0x041a, B:111:0x0439, B:113:0x043f, B:119:0x0491, B:120:0x04a3, B:121:0x04a4, B:122:0x04b6, B:123:0x04b7, B:125:0x04c0, B:131:0x0530, B:132:0x0542, B:133:0x0543, B:140:0x05af, B:145:0x060e, B:147:0x0616, B:149:0x061c, B:161:0x06e5, B:162:0x06f7, B:163:0x06f8, B:165:0x06ff, B:171:0x076f, B:172:0x0781), top: B:263:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:149:0x061c A[Catch: Exception -> 0x0258, c -> 0x025c, CancellationException -> 0x0260, TryCatch #19 {c -> 0x025c, CancellationException -> 0x0260, Exception -> 0x0258, blocks: (B:153:0x0666, B:155:0x067c, B:63:0x024b, B:105:0x03ff, B:106:0x0404, B:107:0x0405, B:108:0x0419, B:109:0x041a, B:111:0x0439, B:113:0x043f, B:119:0x0491, B:120:0x04a3, B:121:0x04a4, B:122:0x04b6, B:123:0x04b7, B:125:0x04c0, B:131:0x0530, B:132:0x0542, B:133:0x0543, B:140:0x05af, B:145:0x060e, B:147:0x0616, B:149:0x061c, B:161:0x06e5, B:162:0x06f7, B:163:0x06f8, B:165:0x06ff, B:171:0x076f, B:172:0x0781), top: B:263:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0655  */
    /* JADX WARN: Code duplicated, block: B:152:0x0657  */
    /* JADX WARN: Code duplicated, block: B:154:0x0674  */
    /* JADX WARN: Code duplicated, block: B:158:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:161:0x06e5 A[Catch: Exception -> 0x0258, c -> 0x025c, CancellationException -> 0x0260, TRY_ENTER, TryCatch #19 {c -> 0x025c, CancellationException -> 0x0260, Exception -> 0x0258, blocks: (B:153:0x0666, B:155:0x067c, B:63:0x024b, B:105:0x03ff, B:106:0x0404, B:107:0x0405, B:108:0x0419, B:109:0x041a, B:111:0x0439, B:113:0x043f, B:119:0x0491, B:120:0x04a3, B:121:0x04a4, B:122:0x04b6, B:123:0x04b7, B:125:0x04c0, B:131:0x0530, B:132:0x0542, B:133:0x0543, B:140:0x05af, B:145:0x060e, B:147:0x0616, B:149:0x061c, B:161:0x06e5, B:162:0x06f7, B:163:0x06f8, B:165:0x06ff, B:171:0x076f, B:172:0x0781), top: B:263:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:163:0x06f8 A[Catch: Exception -> 0x0258, c -> 0x025c, CancellationException -> 0x0260, TryCatch #19 {c -> 0x025c, CancellationException -> 0x0260, Exception -> 0x0258, blocks: (B:153:0x0666, B:155:0x067c, B:63:0x024b, B:105:0x03ff, B:106:0x0404, B:107:0x0405, B:108:0x0419, B:109:0x041a, B:111:0x0439, B:113:0x043f, B:119:0x0491, B:120:0x04a3, B:121:0x04a4, B:122:0x04b6, B:123:0x04b7, B:125:0x04c0, B:131:0x0530, B:132:0x0542, B:133:0x0543, B:140:0x05af, B:145:0x060e, B:147:0x0616, B:149:0x061c, B:161:0x06e5, B:162:0x06f7, B:163:0x06f8, B:165:0x06ff, B:171:0x076f, B:172:0x0781), top: B:263:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:165:0x06ff A[Catch: Exception -> 0x0258, c -> 0x025c, CancellationException -> 0x0260, TRY_LEAVE, TryCatch #19 {c -> 0x025c, CancellationException -> 0x0260, Exception -> 0x0258, blocks: (B:153:0x0666, B:155:0x067c, B:63:0x024b, B:105:0x03ff, B:106:0x0404, B:107:0x0405, B:108:0x0419, B:109:0x041a, B:111:0x0439, B:113:0x043f, B:119:0x0491, B:120:0x04a3, B:121:0x04a4, B:122:0x04b6, B:123:0x04b7, B:125:0x04c0, B:131:0x0530, B:132:0x0542, B:133:0x0543, B:140:0x05af, B:145:0x060e, B:147:0x0616, B:149:0x061c, B:161:0x06e5, B:162:0x06f7, B:163:0x06f8, B:165:0x06ff, B:171:0x076f, B:172:0x0781), top: B:263:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:168:0x0763  */
    /* JADX WARN: Code duplicated, block: B:171:0x076f A[Catch: Exception -> 0x0258, c -> 0x025c, CancellationException -> 0x0260, TRY_ENTER, TryCatch #19 {c -> 0x025c, CancellationException -> 0x0260, Exception -> 0x0258, blocks: (B:153:0x0666, B:155:0x067c, B:63:0x024b, B:105:0x03ff, B:106:0x0404, B:107:0x0405, B:108:0x0419, B:109:0x041a, B:111:0x0439, B:113:0x043f, B:119:0x0491, B:120:0x04a3, B:121:0x04a4, B:122:0x04b6, B:123:0x04b7, B:125:0x04c0, B:131:0x0530, B:132:0x0542, B:133:0x0543, B:140:0x05af, B:145:0x060e, B:147:0x0616, B:149:0x061c, B:161:0x06e5, B:162:0x06f7, B:163:0x06f8, B:165:0x06ff, B:171:0x076f, B:172:0x0781), top: B:263:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:173:0x0782  */
    /* JADX WARN: Code duplicated, block: B:176:0x0789 A[Catch: Exception -> 0x07fc, c -> 0x0800, CancellationException -> 0x0804, TryCatch #14 {c -> 0x0800, CancellationException -> 0x0804, Exception -> 0x07fc, blocks: (B:174:0x0783, B:176:0x0789, B:178:0x078f), top: B:272:0x0783 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x078f A[Catch: Exception -> 0x07fc, c -> 0x0800, CancellationException -> 0x0804, TRY_LEAVE, TryCatch #14 {c -> 0x0800, CancellationException -> 0x0804, Exception -> 0x07fc, blocks: (B:174:0x0783, B:176:0x0789, B:178:0x078f), top: B:272:0x0783 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:183:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:199:0x0808  */
    /* JADX WARN: Code duplicated, block: B:203:0x0874  */
    /* JADX WARN: Code duplicated, block: B:212:0x088c  */
    /* JADX WARN: Code duplicated, block: B:215:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:221:0x0903  */
    /* JADX WARN: Code duplicated, block: B:243:0x0963  */
    /* JADX WARN: Code duplicated, block: B:246:0x0974  */
    /* JADX WARN: Code duplicated, block: B:247:0x0982  */
    /* JADX WARN: Code duplicated, block: B:249:0x0986  */
    /* JADX WARN: Code duplicated, block: B:252:0x0993  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:97:0x0363  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v106 */
    /* JADX WARN: Type inference failed for: r3v155 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v80 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(k24.n.Params params, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        b bVar;
        dx.j<dx.b> jVar;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar;
        dx.j<dx.b> jVar2;
        k24.n.Params params2;
        ex.b bVar2;
        ex.b bVar3;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        f24.c cVar;
        k24.n.Params params3;
        ex.b bVar4;
        ex.b bVar5;
        f24.c cVar2;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        dx.j<dx.b> jVar3;
        ex.b bVar6;
        CertificateData certificateData;
        ex.b bVar7;
        f24.c cVar3;
        Object objC;
        CertificateData certificateData2;
        dx.j<dx.b> jVar4;
        ex.b bVar8;
        ex.b bVar9;
        g.Result result;
        ex.b bVar10;
        dx.j<dx.b> jVar5;
        ex.b bVar11;
        k24.n.Params params4;
        CertificateData certificateData3;
        String parentDocumentId;
        dx.j<dx.b> jVar6;
        int i35;
        g.Result result2;
        CertificateData certificateData4;
        int i36;
        int i37;
        int i38;
        int i39;
        String str;
        Object objG;
        String str2;
        ex.b bVar12;
        k24.n.Params params5;
        f24.c cVar4;
        CertificateData certificateData5;
        int i45;
        int i46;
        CertificateData certificateData6;
        String parentDocumentId2;
        ex.b bVar13;
        CertificateData certificateData7;
        String parentDocumentId3;
        ex.b bVar14;
        int i47;
        int i48;
        int i49;
        int i55;
        int i56;
        String str3;
        Object objG2;
        String str4;
        k24.n.Params params6;
        g.Result result3;
        ex.b bVar15;
        int i57;
        ex.b bVar16;
        v24.b bVar17;
        String documentId;
        int certificateId;
        Map<String, CMSSignedData> mapA;
        f24.i documentType;
        fz.b.LocalDate documentExpirationDate;
        k24.n.Params params7;
        ex.b bVar18;
        CertificateData certificateData8;
        DocumentSchema documentSchema;
        ex.b bVar19;
        v24.b bVar20;
        String documentId2;
        int certificateId2;
        Map<String, CMSSignedData> mapA2;
        f24.i documentType2;
        CertificateData certificateData9;
        fz.b.LocalDate documentExpirationDate2;
        DocumentSchema documentSchema2;
        String parentDocumentId4;
        ex.b bVar21;
        ex.b bVar22;
        ex.b bVar23;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i58 = bVar.f209793x;
            if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f209793x = i58 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        b bVar24 = bVar;
        Object objE = bVar24.f209791v;
        Object objE2 = uq.b.e();
        ?? r15 = bVar24.f209793x;
        try {
            try {
                try {
                    try {
                        try {
                            switch (r15) {
                                case 0:
                                    oq.u.b(objE);
                                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                                    aVar = new ex.a();
                                    this.remoteLogger.F8("Saving " + params.getDocumentType() + " started", px.d.a.GENERAL);
                                    v24.a aVar2 = this.certificateRepository;
                                    bVar24.f209776d = params;
                                    bVar24.f209777e = jVarA;
                                    bVar24.f209778f = vq.j.a(aVar);
                                    bVar24.f209779g = aVar;
                                    bVar24.f209780h = aVar;
                                    bVar24.f209785n = 0;
                                    bVar24.f209786p = 0;
                                    bVar24.f209787q = 0;
                                    bVar24.f209788r = 0;
                                    bVar24.f209789s = 0;
                                    bVar24.f209793x = 1;
                                    objE = aVar2.e(true, bVar24);
                                    if (objE != objE2) {
                                        jVar2 = jVarA;
                                        params2 = params;
                                        bVar2 = aVar;
                                        bVar3 = bVar2;
                                        i15 = 0;
                                        i16 = 0;
                                        i17 = 0;
                                        i18 = 0;
                                        i19 = 0;
                                        cVar = (f24.c) aVar.a((dx.i) objE);
                                        v24.a aVar3 = this.certificateRepository;
                                        bVar24.f209776d = params2;
                                        bVar24.f209777e = jVar2;
                                        bVar24.f209778f = vq.j.a(bVar3);
                                        bVar24.f209779g = bVar2;
                                        bVar24.f209780h = bVar2;
                                        bVar24.f209781j = cVar;
                                        bVar24.f209785n = i19;
                                        bVar24.f209786p = i18;
                                        bVar24.f209787q = i17;
                                        bVar24.f209788r = i16;
                                        bVar24.f209789s = i15;
                                        bVar24.f209793x = 2;
                                        objE = aVar3.b(cVar, bVar24);
                                        if (objE != objE2) {
                                            params3 = params2;
                                            bVar4 = bVar3;
                                            bVar5 = bVar2;
                                            cVar2 = cVar;
                                            i25 = i19;
                                            i26 = i18;
                                            i27 = i17;
                                            i28 = i16;
                                            i29 = i15;
                                            jVar3 = jVar2;
                                            bVar6 = bVar5;
                                            certificateData = (CertificateData) bVar5.a((dx.i) objE);
                                            px.d dVar = this.remoteLogger;
                                            StringBuilder sb5 = new StringBuilder();
                                            bVar7 = bVar4;
                                            sb5.append("Got ");
                                            sb5.append(cVar2);
                                            sb5.append(" certificate");
                                            dVar.F8(sb5.toString(), px.d.a.GENERAL);
                                            g gVar = this.decryptListOfScopesUC;
                                            cVar3 = cVar2;
                                            g.Params params8 = new g.Params(params3.getDataScope(), certificateData.getCertKeyPair());
                                            bVar24.f209776d = params3;
                                            bVar24.f209777e = jVar3;
                                            bVar24.f209778f = vq.j.a(bVar7);
                                            bVar24.f209779g = bVar6;
                                            bVar24.f209780h = bVar6;
                                            bVar24.f209781j = vq.j.a(cVar3);
                                            bVar24.f209782k = certificateData;
                                            bVar24.f209785n = i25;
                                            bVar24.f209786p = i26;
                                            bVar24.f209787q = i27;
                                            bVar24.f209788r = i28;
                                            bVar24.f209789s = i29;
                                            bVar24.f209793x = 3;
                                            objC = gVar.c(params8, bVar24);
                                            if (objC != objE2) {
                                                certificateData2 = certificateData;
                                                objE = objC;
                                                jVar4 = jVar3;
                                                bVar8 = bVar6;
                                                bVar9 = bVar7;
                                                try {
                                                    result = (g.Result) bVar6.a((dx.i) objE);
                                                    bVar10 = bVar9;
                                                    this.remoteLogger.F8("DataScope decrypted successfully", px.d.a.GENERAL);
                                                    switch (a.f209775a[params3.getDocumentType().ordinal()]) {
                                                        case 1:
                                                        case 2:
                                                            CertificateData certificateData10 = certificateData2;
                                                            jVar5 = jVar4;
                                                            try {
                                                                v24.b bVar25 = this.documentsContainerRepository;
                                                                String documentId3 = params3.getDocumentId();
                                                                int certificateId3 = certificateData10.getCertificateId();
                                                                Map<String, CMSSignedData> mapA3 = result.a();
                                                                f24.i documentType3 = params3.getDocumentType();
                                                                fz.b.LocalDate documentExpirationDate3 = params3.getDocumentExpirationDate();
                                                                bVar24.f209776d = params3;
                                                                jVar = jVar5;
                                                                bVar24.f209777e = jVar;
                                                                bVar24.f209778f = vq.j.a(bVar10);
                                                                bVar24.f209779g = vq.j.a(bVar8);
                                                                bVar24.f209780h = bVar8;
                                                                bVar24.f209781j = vq.j.a(cVar3);
                                                                bVar24.f209782k = vq.j.a(certificateData10);
                                                                bVar24.f209783l = vq.j.a(result);
                                                                bVar24.f209785n = i25;
                                                                bVar24.f209786p = i26;
                                                                bVar24.f209787q = i27;
                                                                bVar24.f209788r = i28;
                                                                bVar24.f209789s = i29;
                                                                bVar24.f209793x = 4;
                                                                objE = bVar25.q(documentId3, certificateId3, mapA3, documentExpirationDate3, documentType3, bVar24);
                                                                if (objE != objE2) {
                                                                    bVar11 = bVar8;
                                                                    params4 = params3;
                                                                    bVar11.a((dx.i) objE);
                                                                    oq.i0 i0Var = oq.i0.f148189a;
                                                                    this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                                    return new dx.i.Right(oq.i0.f148189a);
                                                                }
                                                            } catch (ex.c e15) {
                                                                e = e15;
                                                                jVar = jVar5;
                                                                return new dx.i.Left((dx.b) ex.d.a(e));
                                                            } catch (CancellationException e16) {
                                                                e = e16;
                                                                jVar = jVar5;
                                                                throw e;
                                                            } catch (Exception e17) {
                                                                e = e17;
                                                                jVar = jVar5;
                                                                r15 = jVar;
                                                                px.f fVar = px.f.f163100a;
                                                                message = e.getMessage();
                                                                if (message == null) {
                                                                    message = "";
                                                                }
                                                                fVar.d(message, e, px.c.a(r15));
                                                                iVarA = r15.a(e);
                                                                if (iVarA instanceof dx.i.Left) {
                                                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                                                } else {
                                                                    if (!(iVarA instanceof dx.i.Right)) {
                                                                        throw new oq.p();
                                                                    }
                                                                    objB = ((dx.i.Right) iVarA).b();
                                                                }
                                                                return new dx.i.Left(objB);
                                                            }
                                                        case 3:
                                                            certificateData3 = certificateData2;
                                                            try {
                                                                parentDocumentId = params3.getParentDocumentId();
                                                                if (parentDocumentId != null) {
                                                                    bVar8.b(new dx.b.Generic(new NoSuchElementException("ParentId can not be null")));
                                                                    throw new oq.g();
                                                                }
                                                                if (params3.getDocumentTypeFirstEvent()) {
                                                                    jVar6 = jVar4;
                                                                    i35 = i25;
                                                                    result2 = result;
                                                                    certificateData4 = certificateData3;
                                                                    i36 = i26;
                                                                    i37 = 0;
                                                                    i38 = i27;
                                                                    i39 = i28;
                                                                    str = parentDocumentId;
                                                                    jVar = jVar6;
                                                                    v24.b bVar26 = this.documentsContainerRepository;
                                                                    String documentId4 = params3.getDocumentId();
                                                                    int certificateId4 = certificateData4.getCertificateId();
                                                                    Map<String, CMSSignedData> mapA4 = result2.a();
                                                                    f24.i documentType4 = params3.getDocumentType();
                                                                    fz.b.LocalDate documentExpirationDate4 = params3.getDocumentExpirationDate();
                                                                    bVar24.f209776d = params3;
                                                                    bVar24.f209777e = jVar;
                                                                    bVar24.f209778f = vq.j.a(bVar10);
                                                                    bVar24.f209779g = bVar8;
                                                                    bVar24.f209780h = vq.j.a(cVar3);
                                                                    bVar24.f209781j = vq.j.a(certificateData4);
                                                                    bVar24.f209782k = vq.j.a(result2);
                                                                    bVar24.f209783l = vq.j.a(str);
                                                                    bVar24.f209784m = bVar8;
                                                                    bVar24.f209785n = i35;
                                                                    bVar24.f209786p = i36;
                                                                    bVar24.f209787q = i38;
                                                                    bVar24.f209788r = i39;
                                                                    bVar24.f209789s = i29;
                                                                    bVar24.f209790t = i37;
                                                                    bVar24.f209793x = 6;
                                                                    objE = bVar26.F(documentId4, str, certificateId4, mapA4, documentExpirationDate4, documentType4, bVar24);
                                                                    if (objE != objE2) {
                                                                        bVar22 = bVar8;
                                                                        params4 = params3;
                                                                        bVar22.a((dx.i) objE);
                                                                        oq.i0 i0Var2 = oq.i0.f148189a;
                                                                        this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                                        return new dx.i.Right(oq.i0.f148189a);
                                                                    }
                                                                } else {
                                                                    v24.b bVar27 = this.documentsContainerRepository;
                                                                    f24.i iVar = f24.i.REFUGEE_CHILD_CARD;
                                                                    bVar24.f209776d = params3;
                                                                    bVar24.f209777e = jVar4;
                                                                    jVar6 = jVar4;
                                                                    bVar24.f209778f = vq.j.a(bVar10);
                                                                    bVar24.f209779g = bVar8;
                                                                    bVar24.f209780h = vq.j.a(cVar3);
                                                                    bVar24.f209781j = certificateData3;
                                                                    bVar24.f209782k = result;
                                                                    bVar24.f209783l = parentDocumentId;
                                                                    bVar24.f209784m = bVar8;
                                                                    bVar24.f209785n = i25;
                                                                    bVar24.f209786p = i26;
                                                                    bVar24.f209787q = i27;
                                                                    bVar24.f209788r = i28;
                                                                    bVar24.f209789s = i29;
                                                                    bVar24.f209790t = 0;
                                                                    bVar24.f209793x = 5;
                                                                    objG = bVar27.G(iVar, bVar24);
                                                                    if (objG == objE2) {
                                                                        str2 = parentDocumentId;
                                                                        bVar12 = bVar8;
                                                                        params5 = params3;
                                                                        cVar4 = cVar3;
                                                                        certificateData5 = certificateData3;
                                                                        i45 = i29;
                                                                        objE = objG;
                                                                        i35 = i25;
                                                                        i36 = i26;
                                                                        i38 = i27;
                                                                        i39 = i28;
                                                                        i46 = 0;
                                                                        ex.b bVar28 = bVar10;
                                                                        bVar8.a((dx.i) objE);
                                                                        bVar10 = bVar28;
                                                                        i37 = i46;
                                                                        str = str2;
                                                                        i29 = i45;
                                                                        bVar8 = bVar12;
                                                                        cVar3 = cVar4;
                                                                        result2 = result;
                                                                        certificateData4 = certificateData5;
                                                                        params3 = params5;
                                                                        jVar = jVar6;
                                                                        v24.b bVar29 = this.documentsContainerRepository;
                                                                        String documentId5 = params3.getDocumentId();
                                                                        int certificateId5 = certificateData4.getCertificateId();
                                                                        Map<String, CMSSignedData> mapA5 = result2.a();
                                                                        f24.i documentType5 = params3.getDocumentType();
                                                                        fz.b.LocalDate documentExpirationDate5 = params3.getDocumentExpirationDate();
                                                                        bVar24.f209776d = params3;
                                                                        bVar24.f209777e = jVar;
                                                                        bVar24.f209778f = vq.j.a(bVar10);
                                                                        bVar24.f209779g = bVar8;
                                                                        bVar24.f209780h = vq.j.a(cVar3);
                                                                        bVar24.f209781j = vq.j.a(certificateData4);
                                                                        bVar24.f209782k = vq.j.a(result2);
                                                                        bVar24.f209783l = vq.j.a(str);
                                                                        bVar24.f209784m = bVar8;
                                                                        bVar24.f209785n = i35;
                                                                        bVar24.f209786p = i36;
                                                                        bVar24.f209787q = i38;
                                                                        bVar24.f209788r = i39;
                                                                        bVar24.f209789s = i29;
                                                                        bVar24.f209790t = i37;
                                                                        bVar24.f209793x = 6;
                                                                        objE = bVar29.F(documentId5, str, certificateId5, mapA5, documentExpirationDate5, documentType5, bVar24);
                                                                        if (objE != objE2) {
                                                                            bVar22 = bVar8;
                                                                            params4 = params3;
                                                                            bVar22.a((dx.i) objE);
                                                                            oq.i0 i0Var3 = oq.i0.f148189a;
                                                                            this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                                            return new dx.i.Right(oq.i0.f148189a);
                                                                        }
                                                                    }
                                                                }
                                                            } catch (ex.c e18) {
                                                                e = e18;
                                                                return new dx.i.Left((dx.b) ex.d.a(e));
                                                            } catch (CancellationException e19) {
                                                                e = e19;
                                                                throw e;
                                                            } catch (Exception e25) {
                                                                e = e25;
                                                                dx.j<dx.b> jVar7 = jVar4;
                                                                r15 = jVar7;
                                                                px.f fVar2 = px.f.f163100a;
                                                                message = e.getMessage();
                                                                if (message == null) {
                                                                    message = "";
                                                                }
                                                                fVar2.d(message, e, px.c.a(r15));
                                                                iVarA = r15.a(e);
                                                                if (iVarA instanceof dx.i.Left) {
                                                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                                                } else {
                                                                    if (!(iVarA instanceof dx.i.Right)) {
                                                                        throw new oq.p();
                                                                    }
                                                                    objB = ((dx.i.Right) iVarA).b();
                                                                }
                                                                return new dx.i.Left(objB);
                                                            }
                                                            break;
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                            certificateData6 = certificateData2;
                                                            parentDocumentId2 = params3.getParentDocumentId();
                                                            if (parentDocumentId2 != null) {
                                                                bVar8.b(new dx.b.Generic(new NoSuchElementException("ParentId can not be null")));
                                                                throw new oq.g();
                                                            }
                                                            v24.b bVar30 = this.documentsContainerRepository;
                                                            String documentId6 = params3.getDocumentId();
                                                            int certificateId6 = certificateData6.getCertificateId();
                                                            Map<String, CMSSignedData> mapA6 = result.a();
                                                            f24.i documentType6 = params3.getDocumentType();
                                                            fz.b.LocalDate documentExpirationDate6 = params3.getDocumentExpirationDate();
                                                            bVar24.f209776d = params3;
                                                            bVar24.f209777e = jVar4;
                                                            bVar24.f209778f = vq.j.a(bVar10);
                                                            bVar24.f209779g = bVar8;
                                                            bVar24.f209780h = vq.j.a(cVar3);
                                                            bVar24.f209781j = vq.j.a(certificateData6);
                                                            bVar24.f209782k = vq.j.a(result);
                                                            bVar24.f209783l = vq.j.a(parentDocumentId2);
                                                            bVar24.f209784m = bVar8;
                                                            bVar24.f209785n = i25;
                                                            bVar24.f209786p = i26;
                                                            bVar24.f209787q = i27;
                                                            bVar24.f209788r = i28;
                                                            bVar24.f209789s = i29;
                                                            bVar24.f209790t = 0;
                                                            bVar24.f209793x = 7;
                                                            objE = bVar30.F(documentId6, parentDocumentId2, certificateId6, mapA6, documentExpirationDate6, documentType6, bVar24);
                                                            if (objE != objE2) {
                                                                bVar13 = bVar8;
                                                                params4 = params3;
                                                                bVar13.a((dx.i) objE);
                                                                oq.i0 i0Var4 = oq.i0.f148189a;
                                                                this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                                return new dx.i.Right(oq.i0.f148189a);
                                                            }
                                                            break;
                                                        case 7:
                                                            certificateData7 = certificateData2;
                                                            parentDocumentId3 = params3.getParentDocumentId();
                                                            if (parentDocumentId3 != null) {
                                                                bVar8.b(new dx.b.Generic(new NoSuchElementException("ParentId can not be null")));
                                                                throw new oq.g();
                                                            }
                                                            if (params3.getDocumentTypeFirstEvent()) {
                                                                v24.b bVar31 = this.documentsContainerRepository;
                                                                f24.i iVar2 = f24.i.VEHICLE_CARD;
                                                                bVar24.f209776d = params3;
                                                                bVar24.f209777e = jVar4;
                                                                bVar24.f209778f = vq.j.a(bVar10);
                                                                bVar24.f209779g = bVar8;
                                                                bVar24.f209780h = vq.j.a(cVar3);
                                                                bVar24.f209781j = certificateData7;
                                                                bVar24.f209782k = result;
                                                                bVar24.f209783l = parentDocumentId3;
                                                                bVar24.f209784m = bVar8;
                                                                bVar24.f209785n = i25;
                                                                bVar24.f209786p = i26;
                                                                bVar24.f209787q = i27;
                                                                bVar24.f209788r = i28;
                                                                bVar24.f209789s = i29;
                                                                bVar24.f209790t = 0;
                                                                bVar24.f209793x = 8;
                                                                objG2 = bVar31.G(iVar2, bVar24);
                                                                if (objG2 == objE2) {
                                                                    certificateData7 = certificateData7;
                                                                } else {
                                                                    certificateData7 = certificateData7;
                                                                    str4 = parentDocumentId3;
                                                                    objE = objG2;
                                                                    params6 = params3;
                                                                    result3 = result;
                                                                    i47 = i26;
                                                                    i48 = i25;
                                                                    bVar15 = bVar8;
                                                                    i49 = i28;
                                                                    i55 = i27;
                                                                    i56 = 0;
                                                                    i57 = i29;
                                                                    bVar16 = bVar10;
                                                                    bVar8.a((dx.i) objE);
                                                                    g.Result result4 = result3;
                                                                    params3 = params6;
                                                                    bVar14 = bVar16;
                                                                    i29 = i57;
                                                                    str3 = str4;
                                                                    result = result4;
                                                                    bVar8 = bVar15;
                                                                    v24.b bVar32 = this.documentsContainerRepository;
                                                                    String documentId7 = params3.getDocumentId();
                                                                    int certificateId7 = certificateData7.getCertificateId();
                                                                    Map<String, CMSSignedData> mapA7 = result.a();
                                                                    fz.b.LocalDate documentExpirationDate7 = params3.getDocumentExpirationDate();
                                                                    f24.i iVar3 = f24.i.VEHICLE_CARD;
                                                                    bVar24.f209776d = params3;
                                                                    bVar24.f209777e = jVar4;
                                                                    bVar24.f209778f = vq.j.a(bVar14);
                                                                    bVar24.f209779g = bVar8;
                                                                    bVar24.f209780h = vq.j.a(cVar3);
                                                                    bVar24.f209781j = vq.j.a(certificateData7);
                                                                    bVar24.f209782k = vq.j.a(result);
                                                                    bVar24.f209783l = vq.j.a(str3);
                                                                    bVar24.f209784m = bVar8;
                                                                    bVar24.f209785n = i48;
                                                                    bVar24.f209786p = i47;
                                                                    bVar24.f209787q = i55;
                                                                    bVar24.f209788r = i49;
                                                                    bVar24.f209789s = i29;
                                                                    bVar24.f209790t = i56;
                                                                    bVar24.f209793x = 9;
                                                                    objE = bVar32.F(documentId7, str3, certificateId7, mapA7, documentExpirationDate7, iVar3, bVar24);
                                                                    if (objE != objE2) {
                                                                        bVar23 = bVar8;
                                                                        params4 = params3;
                                                                        bVar23.a((dx.i) objE);
                                                                        oq.i0 i0Var5 = oq.i0.f148189a;
                                                                        this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                                        return new dx.i.Right(oq.i0.f148189a);
                                                                    }
                                                                }
                                                            } else {
                                                                bVar14 = bVar10;
                                                                i47 = i26;
                                                                i48 = i25;
                                                                i49 = i28;
                                                                i55 = i27;
                                                                i56 = 0;
                                                                str3 = parentDocumentId3;
                                                                v24.b bVar33 = this.documentsContainerRepository;
                                                                String documentId8 = params3.getDocumentId();
                                                                int certificateId8 = certificateData7.getCertificateId();
                                                                Map<String, CMSSignedData> mapA8 = result.a();
                                                                fz.b.LocalDate documentExpirationDate8 = params3.getDocumentExpirationDate();
                                                                f24.i iVar4 = f24.i.VEHICLE_CARD;
                                                                bVar24.f209776d = params3;
                                                                bVar24.f209777e = jVar4;
                                                                bVar24.f209778f = vq.j.a(bVar14);
                                                                bVar24.f209779g = bVar8;
                                                                bVar24.f209780h = vq.j.a(cVar3);
                                                                bVar24.f209781j = vq.j.a(certificateData7);
                                                                bVar24.f209782k = vq.j.a(result);
                                                                bVar24.f209783l = vq.j.a(str3);
                                                                bVar24.f209784m = bVar8;
                                                                bVar24.f209785n = i48;
                                                                bVar24.f209786p = i47;
                                                                bVar24.f209787q = i55;
                                                                bVar24.f209788r = i49;
                                                                bVar24.f209789s = i29;
                                                                bVar24.f209790t = i56;
                                                                bVar24.f209793x = 9;
                                                                objE = bVar33.F(documentId8, str3, certificateId8, mapA8, documentExpirationDate8, iVar4, bVar24);
                                                                if (objE != objE2) {
                                                                    bVar23 = bVar8;
                                                                    params4 = params3;
                                                                    bVar23.a((dx.i) objE);
                                                                    oq.i0 i0Var6 = oq.i0.f148189a;
                                                                    this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                                    return new dx.i.Right(oq.i0.f148189a);
                                                                }
                                                            }
                                                            break;
                                                            break;
                                                        case 8:
                                                        case 9:
                                                        case 10:
                                                        case 11:
                                                        case 12:
                                                            CertificateData certificateData11 = certificateData2;
                                                            bVar17 = this.documentsContainerRepository;
                                                            documentId = params3.getDocumentId();
                                                            certificateId = certificateData11.getCertificateId();
                                                            mapA = result.a();
                                                            documentType = params3.getDocumentType();
                                                            documentExpirationDate = params3.getDocumentExpirationDate();
                                                            bVar24.f209776d = params3;
                                                            bVar24.f209777e = jVar4;
                                                            bVar24.f209778f = vq.j.a(bVar10);
                                                            bVar24.f209779g = vq.j.a(bVar8);
                                                            bVar24.f209780h = vq.j.a(cVar3);
                                                            bVar24.f209781j = vq.j.a(certificateData11);
                                                            bVar24.f209782k = vq.j.a(result);
                                                            bVar24.f209785n = i25;
                                                            bVar24.f209786p = i26;
                                                            bVar24.f209787q = i27;
                                                            bVar24.f209788r = i28;
                                                            bVar24.f209789s = i29;
                                                            bVar24.f209793x = 10;
                                                            if (bVar17.v(documentId, certificateId, mapA, documentExpirationDate, documentType, bVar24) != objE2) {
                                                                params7 = params3;
                                                                params4 = params7;
                                                                this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                                return new dx.i.Right(oq.i0.f148189a);
                                                            }
                                                            break;
                                                            break;
                                                        case 13:
                                                        case 14:
                                                        case 15:
                                                        case 16:
                                                        case 17:
                                                        case 18:
                                                        case 19:
                                                        case 20:
                                                        case 21:
                                                        case 22:
                                                        case 23:
                                                        case 24:
                                                        case 25:
                                                        case 26:
                                                        case 27:
                                                        case 28:
                                                        case 29:
                                                        case 30:
                                                        case BERTags.DATE /* 31 */:
                                                        case 32:
                                                        case 33:
                                                        case 34:
                                                        case 35:
                                                        case 36:
                                                        case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                                                        case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                                                        case EACTags.INTERCHANGE_CONTROL /* 39 */:
                                                        case 40:
                                                        case EACTags.INTERCHANGE_PROFILE /* 41 */:
                                                        case EACTags.CURRENCY_CODE /* 42 */:
                                                        case EACTags.DATE_OF_BIRTH /* 43 */:
                                                        case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                                                        case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                                                        case 46:
                                                        case 47:
                                                            CertificateData certificateData12 = certificateData2;
                                                            v24.b bVar34 = this.documentsContainerRepository;
                                                            String documentId9 = params3.getDocumentId();
                                                            int certificateId9 = certificateData12.getCertificateId();
                                                            Map<String, CMSSignedData> mapA9 = result.a();
                                                            f24.i documentType7 = params3.getDocumentType();
                                                            fz.b.LocalDate documentExpirationDate9 = params3.getDocumentExpirationDate();
                                                            bVar24.f209776d = params3;
                                                            bVar24.f209777e = jVar4;
                                                            bVar24.f209778f = vq.j.a(bVar10);
                                                            bVar24.f209779g = vq.j.a(bVar8);
                                                            bVar24.f209780h = bVar8;
                                                            bVar24.f209781j = vq.j.a(cVar3);
                                                            bVar24.f209782k = vq.j.a(certificateData12);
                                                            bVar24.f209783l = vq.j.a(result);
                                                            bVar24.f209785n = i25;
                                                            bVar24.f209786p = i26;
                                                            bVar24.f209787q = i27;
                                                            bVar24.f209788r = i28;
                                                            bVar24.f209789s = i29;
                                                            bVar24.f209793x = 11;
                                                            objE = bVar34.t(documentId9, certificateId9, mapA9, documentExpirationDate9, documentType7, bVar24);
                                                            if (objE != objE2) {
                                                                bVar18 = bVar8;
                                                                params4 = params3;
                                                                bVar18.a((dx.i) objE);
                                                                oq.i0 i0Var7 = oq.i0.f148189a;
                                                                this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                                return new dx.i.Right(oq.i0.f148189a);
                                                            }
                                                            break;
                                                        case 48:
                                                        case 49:
                                                        case 50:
                                                        case EACTags.TRANSACTION_DATE /* 51 */:
                                                        case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                                                        case 53:
                                                        case EACTags.CURRENCY_EXPONENT /* 54 */:
                                                        case 55:
                                                        case 56:
                                                        case 57:
                                                        case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                                                        case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                                                        case 60:
                                                        case 61:
                                                        case 62:
                                                        case 63:
                                                        case 64:
                                                        case 65:
                                                        case 66:
                                                        case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                                                        case EACTags.APPLICATION_IMAGE /* 68 */:
                                                            certificateData8 = certificateData2;
                                                            documentSchema = params3.getDocumentSchema();
                                                            if (documentSchema != null) {
                                                                bVar8.b(new dx.b.Generic(new NoSuchElementException("Document schema can not be null")));
                                                                throw new oq.g();
                                                            }
                                                            v24.b bVar35 = this.documentsContainerRepository;
                                                            String documentId10 = params3.getDocumentId();
                                                            int certificateId10 = certificateData8.getCertificateId();
                                                            Map<String, CMSSignedData> mapA10 = result.a();
                                                            f24.i documentType8 = params3.getDocumentType();
                                                            fz.b.LocalDate documentExpirationDate10 = params3.getDocumentExpirationDate();
                                                            bVar24.f209776d = params3;
                                                            bVar24.f209777e = jVar4;
                                                            bVar24.f209778f = vq.j.a(bVar10);
                                                            bVar24.f209779g = bVar8;
                                                            bVar24.f209780h = vq.j.a(cVar3);
                                                            bVar24.f209781j = vq.j.a(certificateData8);
                                                            bVar24.f209782k = vq.j.a(result);
                                                            bVar24.f209783l = vq.j.a(documentSchema);
                                                            bVar24.f209784m = bVar8;
                                                            bVar24.f209785n = i25;
                                                            bVar24.f209786p = i26;
                                                            bVar24.f209787q = i27;
                                                            bVar24.f209788r = i28;
                                                            bVar24.f209789s = i29;
                                                            bVar24.f209790t = 0;
                                                            bVar24.f209793x = 12;
                                                            objE = bVar35.w(documentId10, documentSchema, certificateId10, mapA10, documentExpirationDate10, documentType8, bVar24);
                                                            if (objE != objE2) {
                                                                bVar19 = bVar8;
                                                                params4 = params3;
                                                                bVar19.a((dx.i) objE);
                                                                oq.i0 i0Var8 = oq.i0.f148189a;
                                                                this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                                return new dx.i.Right(oq.i0.f148189a);
                                                            }
                                                            break;
                                                        case EACTags.DISPLAY_IMAGE /* 69 */:
                                                        case 70:
                                                        case EACTags.MESSAGE_REFERENCE /* 71 */:
                                                        case 72:
                                                        case 73:
                                                        case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                                                            bVar20 = this.documentsContainerRepository;
                                                            documentId2 = params3.getDocumentId();
                                                            certificateId2 = certificateData2.getCertificateId();
                                                            mapA2 = result.a();
                                                            documentType2 = params3.getDocumentType();
                                                            certificateData9 = certificateData2;
                                                            documentExpirationDate2 = params3.getDocumentExpirationDate();
                                                            documentSchema2 = params3.getDocumentSchema();
                                                            if (documentSchema2 != null) {
                                                                bVar8.b(new dx.b.Generic(new NoSuchElementException("Document schema can not be null")));
                                                                throw new oq.g();
                                                            }
                                                            parentDocumentId4 = params3.getParentDocumentId();
                                                            if (parentDocumentId4 != null) {
                                                                bVar8.b(new dx.b.Generic(new NoSuchElementException("ParentId can not be null")));
                                                                throw new oq.g();
                                                            }
                                                            bVar24.f209776d = params3;
                                                            bVar24.f209777e = jVar4;
                                                            bVar24.f209778f = vq.j.a(bVar10);
                                                            bVar24.f209779g = vq.j.a(bVar8);
                                                            bVar24.f209780h = bVar8;
                                                            bVar24.f209781j = vq.j.a(cVar3);
                                                            bVar24.f209782k = vq.j.a(certificateData9);
                                                            bVar24.f209783l = vq.j.a(result);
                                                            bVar24.f209785n = i25;
                                                            bVar24.f209786p = i26;
                                                            bVar24.f209787q = i27;
                                                            bVar24.f209788r = i28;
                                                            bVar24.f209789s = i29;
                                                            bVar24.f209793x = 13;
                                                            objE = bVar20.l(documentId2, parentDocumentId4, documentSchema2, certificateId2, mapA2, documentExpirationDate2, documentType2, bVar24);
                                                            if (objE != objE2) {
                                                                bVar21 = bVar8;
                                                                params4 = params3;
                                                                bVar21.a((dx.i) objE);
                                                                oq.i0 i0Var9 = oq.i0.f148189a;
                                                                this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                                return new dx.i.Right(oq.i0.f148189a);
                                                            }
                                                            break;
                                                        case EACTags.DEPRECATED /* 75 */:
                                                            bVar8.b(new dx.b.Generic(new UnsupportedOperationException("Student card is not supported yet")));
                                                            throw new oq.g();
                                                        default:
                                                            throw new oq.p();
                                                    }
                                                } catch (ex.c e26) {
                                                    e = e26;
                                                    jVar = jVar4;
                                                } catch (CancellationException e27) {
                                                    e = e27;
                                                    jVar = jVar4;
                                                } catch (Exception e28) {
                                                    e = e28;
                                                    jVar = jVar4;
                                                }
                                            }
                                        }
                                    }
                                    return objE2;
                                case 1:
                                    i15 = bVar24.f209789s;
                                    i16 = bVar24.f209788r;
                                    i17 = bVar24.f209787q;
                                    i18 = bVar24.f209786p;
                                    i19 = bVar24.f209785n;
                                    aVar = (ex.b) bVar24.f209780h;
                                    bVar2 = (ex.b) bVar24.f209779g;
                                    bVar3 = (ex.b) bVar24.f209778f;
                                    jVar2 = (dx.j) bVar24.f209777e;
                                    params2 = (k24.n.Params) bVar24.f209776d;
                                    try {
                                        oq.u.b(objE);
                                        cVar = (f24.c) aVar.a((dx.i) objE);
                                        v24.a aVar4 = this.certificateRepository;
                                        bVar24.f209776d = params2;
                                        bVar24.f209777e = jVar2;
                                        bVar24.f209778f = vq.j.a(bVar3);
                                        bVar24.f209779g = bVar2;
                                        bVar24.f209780h = bVar2;
                                        bVar24.f209781j = cVar;
                                        bVar24.f209785n = i19;
                                        bVar24.f209786p = i18;
                                        bVar24.f209787q = i17;
                                        bVar24.f209788r = i16;
                                        bVar24.f209789s = i15;
                                        bVar24.f209793x = 2;
                                        objE = aVar4.b(cVar, bVar24);
                                        if (objE != objE2) {
                                            params3 = params2;
                                            bVar4 = bVar3;
                                            bVar5 = bVar2;
                                            cVar2 = cVar;
                                            i25 = i19;
                                            i26 = i18;
                                            i27 = i17;
                                            i28 = i16;
                                            i29 = i15;
                                            jVar3 = jVar2;
                                            bVar6 = bVar5;
                                            certificateData = (CertificateData) bVar5.a((dx.i) objE);
                                            px.d dVar2 = this.remoteLogger;
                                            StringBuilder sb6 = new StringBuilder();
                                            bVar7 = bVar4;
                                            sb6.append("Got ");
                                            sb6.append(cVar2);
                                            sb6.append(" certificate");
                                            dVar2.F8(sb6.toString(), px.d.a.GENERAL);
                                            g gVar2 = this.decryptListOfScopesUC;
                                            cVar3 = cVar2;
                                            g.Params params9 = new g.Params(params3.getDataScope(), certificateData.getCertKeyPair());
                                            bVar24.f209776d = params3;
                                            bVar24.f209777e = jVar3;
                                            bVar24.f209778f = vq.j.a(bVar7);
                                            bVar24.f209779g = bVar6;
                                            bVar24.f209780h = bVar6;
                                            bVar24.f209781j = vq.j.a(cVar3);
                                            bVar24.f209782k = certificateData;
                                            bVar24.f209785n = i25;
                                            bVar24.f209786p = i26;
                                            bVar24.f209787q = i27;
                                            bVar24.f209788r = i28;
                                            bVar24.f209789s = i29;
                                            bVar24.f209793x = 3;
                                            objC = gVar2.c(params9, bVar24);
                                            if (objC != objE2) {
                                                certificateData2 = certificateData;
                                                objE = objC;
                                                jVar4 = jVar3;
                                                bVar8 = bVar6;
                                                bVar9 = bVar7;
                                                result = (g.Result) bVar6.a((dx.i) objE);
                                                bVar10 = bVar9;
                                                this.remoteLogger.F8("DataScope decrypted successfully", px.d.a.GENERAL);
                                                switch (a.f209775a[params3.getDocumentType().ordinal()]) {
                                                    case 1:
                                                    case 2:
                                                        CertificateData certificateData13 = certificateData2;
                                                        jVar5 = jVar4;
                                                        v24.b bVar210 = this.documentsContainerRepository;
                                                        String documentId11 = params3.getDocumentId();
                                                        int certificateId11 = certificateData13.getCertificateId();
                                                        Map<String, CMSSignedData> mapA11 = result.a();
                                                        f24.i documentType9 = params3.getDocumentType();
                                                        fz.b.LocalDate documentExpirationDate11 = params3.getDocumentExpirationDate();
                                                        bVar24.f209776d = params3;
                                                        jVar = jVar5;
                                                        bVar24.f209777e = jVar;
                                                        bVar24.f209778f = vq.j.a(bVar10);
                                                        bVar24.f209779g = vq.j.a(bVar8);
                                                        bVar24.f209780h = bVar8;
                                                        bVar24.f209781j = vq.j.a(cVar3);
                                                        bVar24.f209782k = vq.j.a(certificateData13);
                                                        bVar24.f209783l = vq.j.a(result);
                                                        bVar24.f209785n = i25;
                                                        bVar24.f209786p = i26;
                                                        bVar24.f209787q = i27;
                                                        bVar24.f209788r = i28;
                                                        bVar24.f209789s = i29;
                                                        bVar24.f209793x = 4;
                                                        objE = bVar210.q(documentId11, certificateId11, mapA11, documentExpirationDate11, documentType9, bVar24);
                                                        if (objE != objE2) {
                                                            bVar11 = bVar8;
                                                            params4 = params3;
                                                            bVar11.a((dx.i) objE);
                                                            oq.i0 i0Var10 = oq.i0.f148189a;
                                                            this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                            return new dx.i.Right(oq.i0.f148189a);
                                                        }
                                                        break;
                                                    case 3:
                                                        certificateData3 = certificateData2;
                                                        parentDocumentId = params3.getParentDocumentId();
                                                        if (parentDocumentId != null) {
                                                            bVar8.b(new dx.b.Generic(new NoSuchElementException("ParentId can not be null")));
                                                            throw new oq.g();
                                                        }
                                                        if (params3.getDocumentTypeFirstEvent()) {
                                                            jVar6 = jVar4;
                                                            i35 = i25;
                                                            result2 = result;
                                                            certificateData4 = certificateData3;
                                                            i36 = i26;
                                                            i37 = 0;
                                                            i38 = i27;
                                                            i39 = i28;
                                                            str = parentDocumentId;
                                                            jVar = jVar6;
                                                            v24.b bVar211 = this.documentsContainerRepository;
                                                            String documentId12 = params3.getDocumentId();
                                                            int certificateId12 = certificateData4.getCertificateId();
                                                            Map<String, CMSSignedData> mapA12 = result2.a();
                                                            f24.i documentType10 = params3.getDocumentType();
                                                            fz.b.LocalDate documentExpirationDate12 = params3.getDocumentExpirationDate();
                                                            bVar24.f209776d = params3;
                                                            bVar24.f209777e = jVar;
                                                            bVar24.f209778f = vq.j.a(bVar10);
                                                            bVar24.f209779g = bVar8;
                                                            bVar24.f209780h = vq.j.a(cVar3);
                                                            bVar24.f209781j = vq.j.a(certificateData4);
                                                            bVar24.f209782k = vq.j.a(result2);
                                                            bVar24.f209783l = vq.j.a(str);
                                                            bVar24.f209784m = bVar8;
                                                            bVar24.f209785n = i35;
                                                            bVar24.f209786p = i36;
                                                            bVar24.f209787q = i38;
                                                            bVar24.f209788r = i39;
                                                            bVar24.f209789s = i29;
                                                            bVar24.f209790t = i37;
                                                            bVar24.f209793x = 6;
                                                            objE = bVar211.F(documentId12, str, certificateId12, mapA12, documentExpirationDate12, documentType10, bVar24);
                                                            if (objE != objE2) {
                                                                bVar22 = bVar8;
                                                                params4 = params3;
                                                                bVar22.a((dx.i) objE);
                                                                oq.i0 i0Var11 = oq.i0.f148189a;
                                                                this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                                return new dx.i.Right(oq.i0.f148189a);
                                                            }
                                                        } else {
                                                            v24.b bVar212 = this.documentsContainerRepository;
                                                            f24.i iVar5 = f24.i.REFUGEE_CHILD_CARD;
                                                            bVar24.f209776d = params3;
                                                            bVar24.f209777e = jVar4;
                                                            jVar6 = jVar4;
                                                            bVar24.f209778f = vq.j.a(bVar10);
                                                            bVar24.f209779g = bVar8;
                                                            bVar24.f209780h = vq.j.a(cVar3);
                                                            bVar24.f209781j = certificateData3;
                                                            bVar24.f209782k = result;
                                                            bVar24.f209783l = parentDocumentId;
                                                            bVar24.f209784m = bVar8;
                                                            bVar24.f209785n = i25;
                                                            bVar24.f209786p = i26;
                                                            bVar24.f209787q = i27;
                                                            bVar24.f209788r = i28;
                                                            bVar24.f209789s = i29;
                                                            bVar24.f209790t = 0;
                                                            bVar24.f209793x = 5;
                                                            objG = bVar212.G(iVar5, bVar24);
                                                            if (objG == objE2) {
                                                                str2 = parentDocumentId;
                                                                bVar12 = bVar8;
                                                                params5 = params3;
                                                                cVar4 = cVar3;
                                                                certificateData5 = certificateData3;
                                                                i45 = i29;
                                                                objE = objG;
                                                                i35 = i25;
                                                                i36 = i26;
                                                                i38 = i27;
                                                                i39 = i28;
                                                                i46 = 0;
                                                                ex.b bVar213 = bVar10;
                                                                bVar8.a((dx.i) objE);
                                                                bVar10 = bVar213;
                                                                i37 = i46;
                                                                str = str2;
                                                                i29 = i45;
                                                                bVar8 = bVar12;
                                                                cVar3 = cVar4;
                                                                result2 = result;
                                                                certificateData4 = certificateData5;
                                                                params3 = params5;
                                                                jVar = jVar6;
                                                                v24.b bVar214 = this.documentsContainerRepository;
                                                                String documentId13 = params3.getDocumentId();
                                                                int certificateId13 = certificateData4.getCertificateId();
                                                                Map<String, CMSSignedData> mapA13 = result2.a();
                                                                f24.i documentType11 = params3.getDocumentType();
                                                                fz.b.LocalDate documentExpirationDate13 = params3.getDocumentExpirationDate();
                                                                bVar24.f209776d = params3;
                                                                bVar24.f209777e = jVar;
                                                                bVar24.f209778f = vq.j.a(bVar10);
                                                                bVar24.f209779g = bVar8;
                                                                bVar24.f209780h = vq.j.a(cVar3);
                                                                bVar24.f209781j = vq.j.a(certificateData4);
                                                                bVar24.f209782k = vq.j.a(result2);
                                                                bVar24.f209783l = vq.j.a(str);
                                                                bVar24.f209784m = bVar8;
                                                                bVar24.f209785n = i35;
                                                                bVar24.f209786p = i36;
                                                                bVar24.f209787q = i38;
                                                                bVar24.f209788r = i39;
                                                                bVar24.f209789s = i29;
                                                                bVar24.f209790t = i37;
                                                                bVar24.f209793x = 6;
                                                                objE = bVar214.F(documentId13, str, certificateId13, mapA13, documentExpirationDate13, documentType11, bVar24);
                                                                if (objE != objE2) {
                                                                    bVar22 = bVar8;
                                                                    params4 = params3;
                                                                    bVar22.a((dx.i) objE);
                                                                    oq.i0 i0Var12 = oq.i0.f148189a;
                                                                    this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                                    return new dx.i.Right(oq.i0.f148189a);
                                                                }
                                                            }
                                                        }
                                                        break;
                                                        break;
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                        certificateData6 = certificateData2;
                                                        parentDocumentId2 = params3.getParentDocumentId();
                                                        if (parentDocumentId2 != null) {
                                                            bVar8.b(new dx.b.Generic(new NoSuchElementException("ParentId can not be null")));
                                                            throw new oq.g();
                                                        }
                                                        v24.b bVar36 = this.documentsContainerRepository;
                                                        String documentId14 = params3.getDocumentId();
                                                        int certificateId14 = certificateData6.getCertificateId();
                                                        Map<String, CMSSignedData> mapA14 = result.a();
                                                        f24.i documentType12 = params3.getDocumentType();
                                                        fz.b.LocalDate documentExpirationDate14 = params3.getDocumentExpirationDate();
                                                        bVar24.f209776d = params3;
                                                        bVar24.f209777e = jVar4;
                                                        bVar24.f209778f = vq.j.a(bVar10);
                                                        bVar24.f209779g = bVar8;
                                                        bVar24.f209780h = vq.j.a(cVar3);
                                                        bVar24.f209781j = vq.j.a(certificateData6);
                                                        bVar24.f209782k = vq.j.a(result);
                                                        bVar24.f209783l = vq.j.a(parentDocumentId2);
                                                        bVar24.f209784m = bVar8;
                                                        bVar24.f209785n = i25;
                                                        bVar24.f209786p = i26;
                                                        bVar24.f209787q = i27;
                                                        bVar24.f209788r = i28;
                                                        bVar24.f209789s = i29;
                                                        bVar24.f209790t = 0;
                                                        bVar24.f209793x = 7;
                                                        objE = bVar36.F(documentId14, parentDocumentId2, certificateId14, mapA14, documentExpirationDate14, documentType12, bVar24);
                                                        if (objE != objE2) {
                                                            bVar13 = bVar8;
                                                            params4 = params3;
                                                            bVar13.a((dx.i) objE);
                                                            oq.i0 i0Var13 = oq.i0.f148189a;
                                                            this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                            return new dx.i.Right(oq.i0.f148189a);
                                                        }
                                                        break;
                                                    case 7:
                                                        certificateData7 = certificateData2;
                                                        parentDocumentId3 = params3.getParentDocumentId();
                                                        if (parentDocumentId3 != null) {
                                                            bVar8.b(new dx.b.Generic(new NoSuchElementException("ParentId can not be null")));
                                                            throw new oq.g();
                                                        }
                                                        if (params3.getDocumentTypeFirstEvent()) {
                                                            v24.b bVar37 = this.documentsContainerRepository;
                                                            f24.i iVar6 = f24.i.VEHICLE_CARD;
                                                            bVar24.f209776d = params3;
                                                            bVar24.f209777e = jVar4;
                                                            bVar24.f209778f = vq.j.a(bVar10);
                                                            bVar24.f209779g = bVar8;
                                                            bVar24.f209780h = vq.j.a(cVar3);
                                                            bVar24.f209781j = certificateData7;
                                                            bVar24.f209782k = result;
                                                            bVar24.f209783l = parentDocumentId3;
                                                            bVar24.f209784m = bVar8;
                                                            bVar24.f209785n = i25;
                                                            bVar24.f209786p = i26;
                                                            bVar24.f209787q = i27;
                                                            bVar24.f209788r = i28;
                                                            bVar24.f209789s = i29;
                                                            bVar24.f209790t = 0;
                                                            bVar24.f209793x = 8;
                                                            objG2 = bVar37.G(iVar6, bVar24);
                                                            if (objG2 == objE2) {
                                                                certificateData7 = certificateData7;
                                                            } else {
                                                                certificateData7 = certificateData7;
                                                                str4 = parentDocumentId3;
                                                                objE = objG2;
                                                                params6 = params3;
                                                                result3 = result;
                                                                i47 = i26;
                                                                i48 = i25;
                                                                bVar15 = bVar8;
                                                                i49 = i28;
                                                                i55 = i27;
                                                                i56 = 0;
                                                                i57 = i29;
                                                                bVar16 = bVar10;
                                                                bVar8.a((dx.i) objE);
                                                                g.Result result5 = result3;
                                                                params3 = params6;
                                                                bVar14 = bVar16;
                                                                i29 = i57;
                                                                str3 = str4;
                                                                result = result5;
                                                                bVar8 = bVar15;
                                                                v24.b bVar38 = this.documentsContainerRepository;
                                                                String documentId15 = params3.getDocumentId();
                                                                int certificateId15 = certificateData7.getCertificateId();
                                                                Map<String, CMSSignedData> mapA15 = result.a();
                                                                fz.b.LocalDate documentExpirationDate15 = params3.getDocumentExpirationDate();
                                                                f24.i iVar7 = f24.i.VEHICLE_CARD;
                                                                bVar24.f209776d = params3;
                                                                bVar24.f209777e = jVar4;
                                                                bVar24.f209778f = vq.j.a(bVar14);
                                                                bVar24.f209779g = bVar8;
                                                                bVar24.f209780h = vq.j.a(cVar3);
                                                                bVar24.f209781j = vq.j.a(certificateData7);
                                                                bVar24.f209782k = vq.j.a(result);
                                                                bVar24.f209783l = vq.j.a(str3);
                                                                bVar24.f209784m = bVar8;
                                                                bVar24.f209785n = i48;
                                                                bVar24.f209786p = i47;
                                                                bVar24.f209787q = i55;
                                                                bVar24.f209788r = i49;
                                                                bVar24.f209789s = i29;
                                                                bVar24.f209790t = i56;
                                                                bVar24.f209793x = 9;
                                                                objE = bVar38.F(documentId15, str3, certificateId15, mapA15, documentExpirationDate15, iVar7, bVar24);
                                                                if (objE != objE2) {
                                                                    bVar23 = bVar8;
                                                                    params4 = params3;
                                                                    bVar23.a((dx.i) objE);
                                                                    oq.i0 i0Var14 = oq.i0.f148189a;
                                                                    this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                                    return new dx.i.Right(oq.i0.f148189a);
                                                                }
                                                            }
                                                        } else {
                                                            bVar14 = bVar10;
                                                            i47 = i26;
                                                            i48 = i25;
                                                            i49 = i28;
                                                            i55 = i27;
                                                            i56 = 0;
                                                            str3 = parentDocumentId3;
                                                            v24.b bVar39 = this.documentsContainerRepository;
                                                            String documentId16 = params3.getDocumentId();
                                                            int certificateId16 = certificateData7.getCertificateId();
                                                            Map<String, CMSSignedData> mapA16 = result.a();
                                                            fz.b.LocalDate documentExpirationDate16 = params3.getDocumentExpirationDate();
                                                            f24.i iVar8 = f24.i.VEHICLE_CARD;
                                                            bVar24.f209776d = params3;
                                                            bVar24.f209777e = jVar4;
                                                            bVar24.f209778f = vq.j.a(bVar14);
                                                            bVar24.f209779g = bVar8;
                                                            bVar24.f209780h = vq.j.a(cVar3);
                                                            bVar24.f209781j = vq.j.a(certificateData7);
                                                            bVar24.f209782k = vq.j.a(result);
                                                            bVar24.f209783l = vq.j.a(str3);
                                                            bVar24.f209784m = bVar8;
                                                            bVar24.f209785n = i48;
                                                            bVar24.f209786p = i47;
                                                            bVar24.f209787q = i55;
                                                            bVar24.f209788r = i49;
                                                            bVar24.f209789s = i29;
                                                            bVar24.f209790t = i56;
                                                            bVar24.f209793x = 9;
                                                            objE = bVar39.F(documentId16, str3, certificateId16, mapA16, documentExpirationDate16, iVar8, bVar24);
                                                            if (objE != objE2) {
                                                                bVar23 = bVar8;
                                                                params4 = params3;
                                                                bVar23.a((dx.i) objE);
                                                                oq.i0 i0Var15 = oq.i0.f148189a;
                                                                this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                                return new dx.i.Right(oq.i0.f148189a);
                                                            }
                                                        }
                                                        break;
                                                        break;
                                                    case 8:
                                                    case 9:
                                                    case 10:
                                                    case 11:
                                                    case 12:
                                                        CertificateData certificateData14 = certificateData2;
                                                        bVar17 = this.documentsContainerRepository;
                                                        documentId = params3.getDocumentId();
                                                        certificateId = certificateData14.getCertificateId();
                                                        mapA = result.a();
                                                        documentType = params3.getDocumentType();
                                                        documentExpirationDate = params3.getDocumentExpirationDate();
                                                        bVar24.f209776d = params3;
                                                        bVar24.f209777e = jVar4;
                                                        bVar24.f209778f = vq.j.a(bVar10);
                                                        bVar24.f209779g = vq.j.a(bVar8);
                                                        bVar24.f209780h = vq.j.a(cVar3);
                                                        bVar24.f209781j = vq.j.a(certificateData14);
                                                        bVar24.f209782k = vq.j.a(result);
                                                        bVar24.f209785n = i25;
                                                        bVar24.f209786p = i26;
                                                        bVar24.f209787q = i27;
                                                        bVar24.f209788r = i28;
                                                        bVar24.f209789s = i29;
                                                        bVar24.f209793x = 10;
                                                        if (bVar17.v(documentId, certificateId, mapA, documentExpirationDate, documentType, bVar24) != objE2) {
                                                            params7 = params3;
                                                            params4 = params7;
                                                            this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                            return new dx.i.Right(oq.i0.f148189a);
                                                        }
                                                        break;
                                                        break;
                                                    case 13:
                                                    case 14:
                                                    case 15:
                                                    case 16:
                                                    case 17:
                                                    case 18:
                                                    case 19:
                                                    case 20:
                                                    case 21:
                                                    case 22:
                                                    case 23:
                                                    case 24:
                                                    case 25:
                                                    case 26:
                                                    case 27:
                                                    case 28:
                                                    case 29:
                                                    case 30:
                                                    case BERTags.DATE /* 31 */:
                                                    case 32:
                                                    case 33:
                                                    case 34:
                                                    case 35:
                                                    case 36:
                                                    case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                                                    case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                                                    case EACTags.INTERCHANGE_CONTROL /* 39 */:
                                                    case 40:
                                                    case EACTags.INTERCHANGE_PROFILE /* 41 */:
                                                    case EACTags.CURRENCY_CODE /* 42 */:
                                                    case EACTags.DATE_OF_BIRTH /* 43 */:
                                                    case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                                                    case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                                                    case 46:
                                                    case 47:
                                                        CertificateData certificateData15 = certificateData2;
                                                        v24.b bVar310 = this.documentsContainerRepository;
                                                        String documentId17 = params3.getDocumentId();
                                                        int certificateId17 = certificateData15.getCertificateId();
                                                        Map<String, CMSSignedData> mapA17 = result.a();
                                                        f24.i documentType13 = params3.getDocumentType();
                                                        fz.b.LocalDate documentExpirationDate17 = params3.getDocumentExpirationDate();
                                                        bVar24.f209776d = params3;
                                                        bVar24.f209777e = jVar4;
                                                        bVar24.f209778f = vq.j.a(bVar10);
                                                        bVar24.f209779g = vq.j.a(bVar8);
                                                        bVar24.f209780h = bVar8;
                                                        bVar24.f209781j = vq.j.a(cVar3);
                                                        bVar24.f209782k = vq.j.a(certificateData15);
                                                        bVar24.f209783l = vq.j.a(result);
                                                        bVar24.f209785n = i25;
                                                        bVar24.f209786p = i26;
                                                        bVar24.f209787q = i27;
                                                        bVar24.f209788r = i28;
                                                        bVar24.f209789s = i29;
                                                        bVar24.f209793x = 11;
                                                        objE = bVar310.t(documentId17, certificateId17, mapA17, documentExpirationDate17, documentType13, bVar24);
                                                        if (objE != objE2) {
                                                            bVar18 = bVar8;
                                                            params4 = params3;
                                                            bVar18.a((dx.i) objE);
                                                            oq.i0 i0Var16 = oq.i0.f148189a;
                                                            this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                            return new dx.i.Right(oq.i0.f148189a);
                                                        }
                                                        break;
                                                    case 48:
                                                    case 49:
                                                    case 50:
                                                    case EACTags.TRANSACTION_DATE /* 51 */:
                                                    case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                                                    case 53:
                                                    case EACTags.CURRENCY_EXPONENT /* 54 */:
                                                    case 55:
                                                    case 56:
                                                    case 57:
                                                    case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                                                    case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                                                    case 60:
                                                    case 61:
                                                    case 62:
                                                    case 63:
                                                    case 64:
                                                    case 65:
                                                    case 66:
                                                    case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                                                    case EACTags.APPLICATION_IMAGE /* 68 */:
                                                        certificateData8 = certificateData2;
                                                        documentSchema = params3.getDocumentSchema();
                                                        if (documentSchema != null) {
                                                            bVar8.b(new dx.b.Generic(new NoSuchElementException("Document schema can not be null")));
                                                            throw new oq.g();
                                                        }
                                                        v24.b bVar311 = this.documentsContainerRepository;
                                                        String documentId18 = params3.getDocumentId();
                                                        int certificateId18 = certificateData8.getCertificateId();
                                                        Map<String, CMSSignedData> mapA18 = result.a();
                                                        f24.i documentType14 = params3.getDocumentType();
                                                        fz.b.LocalDate documentExpirationDate18 = params3.getDocumentExpirationDate();
                                                        bVar24.f209776d = params3;
                                                        bVar24.f209777e = jVar4;
                                                        bVar24.f209778f = vq.j.a(bVar10);
                                                        bVar24.f209779g = bVar8;
                                                        bVar24.f209780h = vq.j.a(cVar3);
                                                        bVar24.f209781j = vq.j.a(certificateData8);
                                                        bVar24.f209782k = vq.j.a(result);
                                                        bVar24.f209783l = vq.j.a(documentSchema);
                                                        bVar24.f209784m = bVar8;
                                                        bVar24.f209785n = i25;
                                                        bVar24.f209786p = i26;
                                                        bVar24.f209787q = i27;
                                                        bVar24.f209788r = i28;
                                                        bVar24.f209789s = i29;
                                                        bVar24.f209790t = 0;
                                                        bVar24.f209793x = 12;
                                                        objE = bVar311.w(documentId18, documentSchema, certificateId18, mapA18, documentExpirationDate18, documentType14, bVar24);
                                                        if (objE != objE2) {
                                                            bVar19 = bVar8;
                                                            params4 = params3;
                                                            bVar19.a((dx.i) objE);
                                                            oq.i0 i0Var17 = oq.i0.f148189a;
                                                            this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                            return new dx.i.Right(oq.i0.f148189a);
                                                        }
                                                        break;
                                                    case EACTags.DISPLAY_IMAGE /* 69 */:
                                                    case 70:
                                                    case EACTags.MESSAGE_REFERENCE /* 71 */:
                                                    case 72:
                                                    case 73:
                                                    case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                                                        bVar20 = this.documentsContainerRepository;
                                                        documentId2 = params3.getDocumentId();
                                                        certificateId2 = certificateData2.getCertificateId();
                                                        mapA2 = result.a();
                                                        documentType2 = params3.getDocumentType();
                                                        certificateData9 = certificateData2;
                                                        documentExpirationDate2 = params3.getDocumentExpirationDate();
                                                        documentSchema2 = params3.getDocumentSchema();
                                                        if (documentSchema2 != null) {
                                                            bVar8.b(new dx.b.Generic(new NoSuchElementException("Document schema can not be null")));
                                                            throw new oq.g();
                                                        }
                                                        parentDocumentId4 = params3.getParentDocumentId();
                                                        if (parentDocumentId4 != null) {
                                                            bVar8.b(new dx.b.Generic(new NoSuchElementException("ParentId can not be null")));
                                                            throw new oq.g();
                                                        }
                                                        bVar24.f209776d = params3;
                                                        bVar24.f209777e = jVar4;
                                                        bVar24.f209778f = vq.j.a(bVar10);
                                                        bVar24.f209779g = vq.j.a(bVar8);
                                                        bVar24.f209780h = bVar8;
                                                        bVar24.f209781j = vq.j.a(cVar3);
                                                        bVar24.f209782k = vq.j.a(certificateData9);
                                                        bVar24.f209783l = vq.j.a(result);
                                                        bVar24.f209785n = i25;
                                                        bVar24.f209786p = i26;
                                                        bVar24.f209787q = i27;
                                                        bVar24.f209788r = i28;
                                                        bVar24.f209789s = i29;
                                                        bVar24.f209793x = 13;
                                                        objE = bVar20.l(documentId2, parentDocumentId4, documentSchema2, certificateId2, mapA2, documentExpirationDate2, documentType2, bVar24);
                                                        if (objE != objE2) {
                                                            bVar21 = bVar8;
                                                            params4 = params3;
                                                            bVar21.a((dx.i) objE);
                                                            oq.i0 i0Var18 = oq.i0.f148189a;
                                                            this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                            return new dx.i.Right(oq.i0.f148189a);
                                                        }
                                                        break;
                                                    case EACTags.DEPRECATED /* 75 */:
                                                        bVar8.b(new dx.b.Generic(new UnsupportedOperationException("Student card is not supported yet")));
                                                        throw new oq.g();
                                                    default:
                                                        throw new oq.p();
                                                }
                                            }
                                        }
                                        return objE2;
                                    } catch (ex.c e29) {
                                        e = e29;
                                        return new dx.i.Left((dx.b) ex.d.a(e));
                                    } catch (CancellationException e35) {
                                        throw e35;
                                    } catch (Exception e36) {
                                        e = e36;
                                        r15 = jVar2;
                                        px.f fVar3 = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        fVar3.d(message, e, px.c.a(r15));
                                        iVarA = r15.a(e);
                                        if (iVarA instanceof dx.i.Left) {
                                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                        } else {
                                            if (!(iVarA instanceof dx.i.Right)) {
                                                throw new oq.p();
                                            }
                                            objB = ((dx.i.Right) iVarA).b();
                                        }
                                        return new dx.i.Left(objB);
                                    }
                                case 2:
                                    int i59 = bVar24.f209789s;
                                    int i65 = bVar24.f209788r;
                                    int i66 = bVar24.f209787q;
                                    int i67 = bVar24.f209786p;
                                    int i68 = bVar24.f209785n;
                                    f24.c cVar5 = (f24.c) bVar24.f209781j;
                                    ex.b bVar40 = (ex.b) bVar24.f209780h;
                                    ex.b bVar41 = (ex.b) bVar24.f209779g;
                                    ex.b bVar42 = (ex.b) bVar24.f209778f;
                                    dx.j<dx.b> jVar8 = (dx.j) bVar24.f209777e;
                                    params3 = (k24.n.Params) bVar24.f209776d;
                                    try {
                                        oq.u.b(objE);
                                        i29 = i59;
                                        jVar3 = jVar8;
                                        bVar4 = bVar42;
                                        bVar6 = bVar41;
                                        bVar5 = bVar40;
                                        cVar2 = cVar5;
                                        i25 = i68;
                                        i26 = i67;
                                        i27 = i66;
                                        i28 = i65;
                                        certificateData = (CertificateData) bVar5.a((dx.i) objE);
                                        px.d dVar3 = this.remoteLogger;
                                        StringBuilder sb7 = new StringBuilder();
                                        bVar7 = bVar4;
                                        sb7.append("Got ");
                                        sb7.append(cVar2);
                                        sb7.append(" certificate");
                                        dVar3.F8(sb7.toString(), px.d.a.GENERAL);
                                        g gVar3 = this.decryptListOfScopesUC;
                                        cVar3 = cVar2;
                                        g.Params params10 = new g.Params(params3.getDataScope(), certificateData.getCertKeyPair());
                                        bVar24.f209776d = params3;
                                        bVar24.f209777e = jVar3;
                                        bVar24.f209778f = vq.j.a(bVar7);
                                        bVar24.f209779g = bVar6;
                                        bVar24.f209780h = bVar6;
                                        bVar24.f209781j = vq.j.a(cVar3);
                                        bVar24.f209782k = certificateData;
                                        bVar24.f209785n = i25;
                                        bVar24.f209786p = i26;
                                        bVar24.f209787q = i27;
                                        bVar24.f209788r = i28;
                                        bVar24.f209789s = i29;
                                        bVar24.f209793x = 3;
                                        objC = gVar3.c(params10, bVar24);
                                        if (objC != objE2) {
                                            certificateData2 = certificateData;
                                            objE = objC;
                                            jVar4 = jVar3;
                                            bVar8 = bVar6;
                                            bVar9 = bVar7;
                                            result = (g.Result) bVar6.a((dx.i) objE);
                                            bVar10 = bVar9;
                                            this.remoteLogger.F8("DataScope decrypted successfully", px.d.a.GENERAL);
                                            switch (a.f209775a[params3.getDocumentType().ordinal()]) {
                                                case 1:
                                                case 2:
                                                    CertificateData certificateData16 = certificateData2;
                                                    jVar5 = jVar4;
                                                    v24.b bVar215 = this.documentsContainerRepository;
                                                    String documentId19 = params3.getDocumentId();
                                                    int certificateId19 = certificateData16.getCertificateId();
                                                    Map<String, CMSSignedData> mapA19 = result.a();
                                                    f24.i documentType15 = params3.getDocumentType();
                                                    fz.b.LocalDate documentExpirationDate19 = params3.getDocumentExpirationDate();
                                                    bVar24.f209776d = params3;
                                                    jVar = jVar5;
                                                    bVar24.f209777e = jVar;
                                                    bVar24.f209778f = vq.j.a(bVar10);
                                                    bVar24.f209779g = vq.j.a(bVar8);
                                                    bVar24.f209780h = bVar8;
                                                    bVar24.f209781j = vq.j.a(cVar3);
                                                    bVar24.f209782k = vq.j.a(certificateData16);
                                                    bVar24.f209783l = vq.j.a(result);
                                                    bVar24.f209785n = i25;
                                                    bVar24.f209786p = i26;
                                                    bVar24.f209787q = i27;
                                                    bVar24.f209788r = i28;
                                                    bVar24.f209789s = i29;
                                                    bVar24.f209793x = 4;
                                                    objE = bVar215.q(documentId19, certificateId19, mapA19, documentExpirationDate19, documentType15, bVar24);
                                                    if (objE != objE2) {
                                                        bVar11 = bVar8;
                                                        params4 = params3;
                                                        bVar11.a((dx.i) objE);
                                                        oq.i0 i0Var19 = oq.i0.f148189a;
                                                        this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                        return new dx.i.Right(oq.i0.f148189a);
                                                    }
                                                    break;
                                                case 3:
                                                    certificateData3 = certificateData2;
                                                    parentDocumentId = params3.getParentDocumentId();
                                                    if (parentDocumentId != null) {
                                                        bVar8.b(new dx.b.Generic(new NoSuchElementException("ParentId can not be null")));
                                                        throw new oq.g();
                                                    }
                                                    if (params3.getDocumentTypeFirstEvent()) {
                                                        jVar6 = jVar4;
                                                        i35 = i25;
                                                        result2 = result;
                                                        certificateData4 = certificateData3;
                                                        i36 = i26;
                                                        i37 = 0;
                                                        i38 = i27;
                                                        i39 = i28;
                                                        str = parentDocumentId;
                                                        jVar = jVar6;
                                                        v24.b bVar216 = this.documentsContainerRepository;
                                                        String documentId110 = params3.getDocumentId();
                                                        int certificateId110 = certificateData4.getCertificateId();
                                                        Map<String, CMSSignedData> mapA110 = result2.a();
                                                        f24.i documentType16 = params3.getDocumentType();
                                                        fz.b.LocalDate documentExpirationDate110 = params3.getDocumentExpirationDate();
                                                        bVar24.f209776d = params3;
                                                        bVar24.f209777e = jVar;
                                                        bVar24.f209778f = vq.j.a(bVar10);
                                                        bVar24.f209779g = bVar8;
                                                        bVar24.f209780h = vq.j.a(cVar3);
                                                        bVar24.f209781j = vq.j.a(certificateData4);
                                                        bVar24.f209782k = vq.j.a(result2);
                                                        bVar24.f209783l = vq.j.a(str);
                                                        bVar24.f209784m = bVar8;
                                                        bVar24.f209785n = i35;
                                                        bVar24.f209786p = i36;
                                                        bVar24.f209787q = i38;
                                                        bVar24.f209788r = i39;
                                                        bVar24.f209789s = i29;
                                                        bVar24.f209790t = i37;
                                                        bVar24.f209793x = 6;
                                                        objE = bVar216.F(documentId110, str, certificateId110, mapA110, documentExpirationDate110, documentType16, bVar24);
                                                        if (objE != objE2) {
                                                            bVar22 = bVar8;
                                                            params4 = params3;
                                                            bVar22.a((dx.i) objE);
                                                            oq.i0 i0Var110 = oq.i0.f148189a;
                                                            this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                            return new dx.i.Right(oq.i0.f148189a);
                                                        }
                                                    } else {
                                                        v24.b bVar217 = this.documentsContainerRepository;
                                                        f24.i iVar9 = f24.i.REFUGEE_CHILD_CARD;
                                                        bVar24.f209776d = params3;
                                                        bVar24.f209777e = jVar4;
                                                        jVar6 = jVar4;
                                                        bVar24.f209778f = vq.j.a(bVar10);
                                                        bVar24.f209779g = bVar8;
                                                        bVar24.f209780h = vq.j.a(cVar3);
                                                        bVar24.f209781j = certificateData3;
                                                        bVar24.f209782k = result;
                                                        bVar24.f209783l = parentDocumentId;
                                                        bVar24.f209784m = bVar8;
                                                        bVar24.f209785n = i25;
                                                        bVar24.f209786p = i26;
                                                        bVar24.f209787q = i27;
                                                        bVar24.f209788r = i28;
                                                        bVar24.f209789s = i29;
                                                        bVar24.f209790t = 0;
                                                        bVar24.f209793x = 5;
                                                        objG = bVar217.G(iVar9, bVar24);
                                                        if (objG == objE2) {
                                                            str2 = parentDocumentId;
                                                            bVar12 = bVar8;
                                                            params5 = params3;
                                                            cVar4 = cVar3;
                                                            certificateData5 = certificateData3;
                                                            i45 = i29;
                                                            objE = objG;
                                                            i35 = i25;
                                                            i36 = i26;
                                                            i38 = i27;
                                                            i39 = i28;
                                                            i46 = 0;
                                                            ex.b bVar218 = bVar10;
                                                            bVar8.a((dx.i) objE);
                                                            bVar10 = bVar218;
                                                            i37 = i46;
                                                            str = str2;
                                                            i29 = i45;
                                                            bVar8 = bVar12;
                                                            cVar3 = cVar4;
                                                            result2 = result;
                                                            certificateData4 = certificateData5;
                                                            params3 = params5;
                                                            jVar = jVar6;
                                                            v24.b bVar219 = this.documentsContainerRepository;
                                                            String documentId111 = params3.getDocumentId();
                                                            int certificateId111 = certificateData4.getCertificateId();
                                                            Map<String, CMSSignedData> mapA111 = result2.a();
                                                            f24.i documentType17 = params3.getDocumentType();
                                                            fz.b.LocalDate documentExpirationDate111 = params3.getDocumentExpirationDate();
                                                            bVar24.f209776d = params3;
                                                            bVar24.f209777e = jVar;
                                                            bVar24.f209778f = vq.j.a(bVar10);
                                                            bVar24.f209779g = bVar8;
                                                            bVar24.f209780h = vq.j.a(cVar3);
                                                            bVar24.f209781j = vq.j.a(certificateData4);
                                                            bVar24.f209782k = vq.j.a(result2);
                                                            bVar24.f209783l = vq.j.a(str);
                                                            bVar24.f209784m = bVar8;
                                                            bVar24.f209785n = i35;
                                                            bVar24.f209786p = i36;
                                                            bVar24.f209787q = i38;
                                                            bVar24.f209788r = i39;
                                                            bVar24.f209789s = i29;
                                                            bVar24.f209790t = i37;
                                                            bVar24.f209793x = 6;
                                                            objE = bVar219.F(documentId111, str, certificateId111, mapA111, documentExpirationDate111, documentType17, bVar24);
                                                            if (objE != objE2) {
                                                                bVar22 = bVar8;
                                                                params4 = params3;
                                                                bVar22.a((dx.i) objE);
                                                                oq.i0 i0Var111 = oq.i0.f148189a;
                                                                this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                                return new dx.i.Right(oq.i0.f148189a);
                                                            }
                                                        }
                                                    }
                                                    break;
                                                    break;
                                                case 4:
                                                case 5:
                                                case 6:
                                                    certificateData6 = certificateData2;
                                                    parentDocumentId2 = params3.getParentDocumentId();
                                                    if (parentDocumentId2 != null) {
                                                        bVar8.b(new dx.b.Generic(new NoSuchElementException("ParentId can not be null")));
                                                        throw new oq.g();
                                                    }
                                                    v24.b bVar312 = this.documentsContainerRepository;
                                                    String documentId112 = params3.getDocumentId();
                                                    int certificateId112 = certificateData6.getCertificateId();
                                                    Map<String, CMSSignedData> mapA112 = result.a();
                                                    f24.i documentType18 = params3.getDocumentType();
                                                    fz.b.LocalDate documentExpirationDate112 = params3.getDocumentExpirationDate();
                                                    bVar24.f209776d = params3;
                                                    bVar24.f209777e = jVar4;
                                                    bVar24.f209778f = vq.j.a(bVar10);
                                                    bVar24.f209779g = bVar8;
                                                    bVar24.f209780h = vq.j.a(cVar3);
                                                    bVar24.f209781j = vq.j.a(certificateData6);
                                                    bVar24.f209782k = vq.j.a(result);
                                                    bVar24.f209783l = vq.j.a(parentDocumentId2);
                                                    bVar24.f209784m = bVar8;
                                                    bVar24.f209785n = i25;
                                                    bVar24.f209786p = i26;
                                                    bVar24.f209787q = i27;
                                                    bVar24.f209788r = i28;
                                                    bVar24.f209789s = i29;
                                                    bVar24.f209790t = 0;
                                                    bVar24.f209793x = 7;
                                                    objE = bVar312.F(documentId112, parentDocumentId2, certificateId112, mapA112, documentExpirationDate112, documentType18, bVar24);
                                                    if (objE != objE2) {
                                                        bVar13 = bVar8;
                                                        params4 = params3;
                                                        bVar13.a((dx.i) objE);
                                                        oq.i0 i0Var112 = oq.i0.f148189a;
                                                        this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                        return new dx.i.Right(oq.i0.f148189a);
                                                    }
                                                    break;
                                                case 7:
                                                    certificateData7 = certificateData2;
                                                    parentDocumentId3 = params3.getParentDocumentId();
                                                    if (parentDocumentId3 != null) {
                                                        bVar8.b(new dx.b.Generic(new NoSuchElementException("ParentId can not be null")));
                                                        throw new oq.g();
                                                    }
                                                    if (params3.getDocumentTypeFirstEvent()) {
                                                        v24.b bVar313 = this.documentsContainerRepository;
                                                        f24.i iVar10 = f24.i.VEHICLE_CARD;
                                                        bVar24.f209776d = params3;
                                                        bVar24.f209777e = jVar4;
                                                        bVar24.f209778f = vq.j.a(bVar10);
                                                        bVar24.f209779g = bVar8;
                                                        bVar24.f209780h = vq.j.a(cVar3);
                                                        bVar24.f209781j = certificateData7;
                                                        bVar24.f209782k = result;
                                                        bVar24.f209783l = parentDocumentId3;
                                                        bVar24.f209784m = bVar8;
                                                        bVar24.f209785n = i25;
                                                        bVar24.f209786p = i26;
                                                        bVar24.f209787q = i27;
                                                        bVar24.f209788r = i28;
                                                        bVar24.f209789s = i29;
                                                        bVar24.f209790t = 0;
                                                        bVar24.f209793x = 8;
                                                        objG2 = bVar313.G(iVar10, bVar24);
                                                        if (objG2 == objE2) {
                                                            certificateData7 = certificateData7;
                                                        } else {
                                                            certificateData7 = certificateData7;
                                                            str4 = parentDocumentId3;
                                                            objE = objG2;
                                                            params6 = params3;
                                                            result3 = result;
                                                            i47 = i26;
                                                            i48 = i25;
                                                            bVar15 = bVar8;
                                                            i49 = i28;
                                                            i55 = i27;
                                                            i56 = 0;
                                                            i57 = i29;
                                                            bVar16 = bVar10;
                                                            bVar8.a((dx.i) objE);
                                                            g.Result result6 = result3;
                                                            params3 = params6;
                                                            bVar14 = bVar16;
                                                            i29 = i57;
                                                            str3 = str4;
                                                            result = result6;
                                                            bVar8 = bVar15;
                                                            v24.b bVar314 = this.documentsContainerRepository;
                                                            String documentId113 = params3.getDocumentId();
                                                            int certificateId113 = certificateData7.getCertificateId();
                                                            Map<String, CMSSignedData> mapA113 = result.a();
                                                            fz.b.LocalDate documentExpirationDate113 = params3.getDocumentExpirationDate();
                                                            f24.i iVar11 = f24.i.VEHICLE_CARD;
                                                            bVar24.f209776d = params3;
                                                            bVar24.f209777e = jVar4;
                                                            bVar24.f209778f = vq.j.a(bVar14);
                                                            bVar24.f209779g = bVar8;
                                                            bVar24.f209780h = vq.j.a(cVar3);
                                                            bVar24.f209781j = vq.j.a(certificateData7);
                                                            bVar24.f209782k = vq.j.a(result);
                                                            bVar24.f209783l = vq.j.a(str3);
                                                            bVar24.f209784m = bVar8;
                                                            bVar24.f209785n = i48;
                                                            bVar24.f209786p = i47;
                                                            bVar24.f209787q = i55;
                                                            bVar24.f209788r = i49;
                                                            bVar24.f209789s = i29;
                                                            bVar24.f209790t = i56;
                                                            bVar24.f209793x = 9;
                                                            objE = bVar314.F(documentId113, str3, certificateId113, mapA113, documentExpirationDate113, iVar11, bVar24);
                                                            if (objE != objE2) {
                                                                bVar23 = bVar8;
                                                                params4 = params3;
                                                                bVar23.a((dx.i) objE);
                                                                oq.i0 i0Var113 = oq.i0.f148189a;
                                                                this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                                return new dx.i.Right(oq.i0.f148189a);
                                                            }
                                                        }
                                                    } else {
                                                        bVar14 = bVar10;
                                                        i47 = i26;
                                                        i48 = i25;
                                                        i49 = i28;
                                                        i55 = i27;
                                                        i56 = 0;
                                                        str3 = parentDocumentId3;
                                                        v24.b bVar315 = this.documentsContainerRepository;
                                                        String documentId114 = params3.getDocumentId();
                                                        int certificateId114 = certificateData7.getCertificateId();
                                                        Map<String, CMSSignedData> mapA114 = result.a();
                                                        fz.b.LocalDate documentExpirationDate114 = params3.getDocumentExpirationDate();
                                                        f24.i iVar12 = f24.i.VEHICLE_CARD;
                                                        bVar24.f209776d = params3;
                                                        bVar24.f209777e = jVar4;
                                                        bVar24.f209778f = vq.j.a(bVar14);
                                                        bVar24.f209779g = bVar8;
                                                        bVar24.f209780h = vq.j.a(cVar3);
                                                        bVar24.f209781j = vq.j.a(certificateData7);
                                                        bVar24.f209782k = vq.j.a(result);
                                                        bVar24.f209783l = vq.j.a(str3);
                                                        bVar24.f209784m = bVar8;
                                                        bVar24.f209785n = i48;
                                                        bVar24.f209786p = i47;
                                                        bVar24.f209787q = i55;
                                                        bVar24.f209788r = i49;
                                                        bVar24.f209789s = i29;
                                                        bVar24.f209790t = i56;
                                                        bVar24.f209793x = 9;
                                                        objE = bVar315.F(documentId114, str3, certificateId114, mapA114, documentExpirationDate114, iVar12, bVar24);
                                                        if (objE != objE2) {
                                                            bVar23 = bVar8;
                                                            params4 = params3;
                                                            bVar23.a((dx.i) objE);
                                                            oq.i0 i0Var114 = oq.i0.f148189a;
                                                            this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                            return new dx.i.Right(oq.i0.f148189a);
                                                        }
                                                    }
                                                    break;
                                                    break;
                                                case 8:
                                                case 9:
                                                case 10:
                                                case 11:
                                                case 12:
                                                    CertificateData certificateData17 = certificateData2;
                                                    bVar17 = this.documentsContainerRepository;
                                                    documentId = params3.getDocumentId();
                                                    certificateId = certificateData17.getCertificateId();
                                                    mapA = result.a();
                                                    documentType = params3.getDocumentType();
                                                    documentExpirationDate = params3.getDocumentExpirationDate();
                                                    bVar24.f209776d = params3;
                                                    bVar24.f209777e = jVar4;
                                                    bVar24.f209778f = vq.j.a(bVar10);
                                                    bVar24.f209779g = vq.j.a(bVar8);
                                                    bVar24.f209780h = vq.j.a(cVar3);
                                                    bVar24.f209781j = vq.j.a(certificateData17);
                                                    bVar24.f209782k = vq.j.a(result);
                                                    bVar24.f209785n = i25;
                                                    bVar24.f209786p = i26;
                                                    bVar24.f209787q = i27;
                                                    bVar24.f209788r = i28;
                                                    bVar24.f209789s = i29;
                                                    bVar24.f209793x = 10;
                                                    if (bVar17.v(documentId, certificateId, mapA, documentExpirationDate, documentType, bVar24) != objE2) {
                                                        params7 = params3;
                                                        params4 = params7;
                                                        this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                        return new dx.i.Right(oq.i0.f148189a);
                                                    }
                                                    break;
                                                    break;
                                                case 13:
                                                case 14:
                                                case 15:
                                                case 16:
                                                case 17:
                                                case 18:
                                                case 19:
                                                case 20:
                                                case 21:
                                                case 22:
                                                case 23:
                                                case 24:
                                                case 25:
                                                case 26:
                                                case 27:
                                                case 28:
                                                case 29:
                                                case 30:
                                                case BERTags.DATE /* 31 */:
                                                case 32:
                                                case 33:
                                                case 34:
                                                case 35:
                                                case 36:
                                                case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                                                case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                                                case EACTags.INTERCHANGE_CONTROL /* 39 */:
                                                case 40:
                                                case EACTags.INTERCHANGE_PROFILE /* 41 */:
                                                case EACTags.CURRENCY_CODE /* 42 */:
                                                case EACTags.DATE_OF_BIRTH /* 43 */:
                                                case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                                                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                                                case 46:
                                                case 47:
                                                    CertificateData certificateData18 = certificateData2;
                                                    v24.b bVar316 = this.documentsContainerRepository;
                                                    String documentId115 = params3.getDocumentId();
                                                    int certificateId115 = certificateData18.getCertificateId();
                                                    Map<String, CMSSignedData> mapA115 = result.a();
                                                    f24.i documentType19 = params3.getDocumentType();
                                                    fz.b.LocalDate documentExpirationDate115 = params3.getDocumentExpirationDate();
                                                    bVar24.f209776d = params3;
                                                    bVar24.f209777e = jVar4;
                                                    bVar24.f209778f = vq.j.a(bVar10);
                                                    bVar24.f209779g = vq.j.a(bVar8);
                                                    bVar24.f209780h = bVar8;
                                                    bVar24.f209781j = vq.j.a(cVar3);
                                                    bVar24.f209782k = vq.j.a(certificateData18);
                                                    bVar24.f209783l = vq.j.a(result);
                                                    bVar24.f209785n = i25;
                                                    bVar24.f209786p = i26;
                                                    bVar24.f209787q = i27;
                                                    bVar24.f209788r = i28;
                                                    bVar24.f209789s = i29;
                                                    bVar24.f209793x = 11;
                                                    objE = bVar316.t(documentId115, certificateId115, mapA115, documentExpirationDate115, documentType19, bVar24);
                                                    if (objE != objE2) {
                                                        bVar18 = bVar8;
                                                        params4 = params3;
                                                        bVar18.a((dx.i) objE);
                                                        oq.i0 i0Var115 = oq.i0.f148189a;
                                                        this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                        return new dx.i.Right(oq.i0.f148189a);
                                                    }
                                                    break;
                                                case 48:
                                                case 49:
                                                case 50:
                                                case EACTags.TRANSACTION_DATE /* 51 */:
                                                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                                                case 53:
                                                case EACTags.CURRENCY_EXPONENT /* 54 */:
                                                case 55:
                                                case 56:
                                                case 57:
                                                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                                                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                                                case 60:
                                                case 61:
                                                case 62:
                                                case 63:
                                                case 64:
                                                case 65:
                                                case 66:
                                                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                                                case EACTags.APPLICATION_IMAGE /* 68 */:
                                                    certificateData8 = certificateData2;
                                                    documentSchema = params3.getDocumentSchema();
                                                    if (documentSchema != null) {
                                                        bVar8.b(new dx.b.Generic(new NoSuchElementException("Document schema can not be null")));
                                                        throw new oq.g();
                                                    }
                                                    v24.b bVar317 = this.documentsContainerRepository;
                                                    String documentId116 = params3.getDocumentId();
                                                    int certificateId116 = certificateData8.getCertificateId();
                                                    Map<String, CMSSignedData> mapA116 = result.a();
                                                    f24.i documentType110 = params3.getDocumentType();
                                                    fz.b.LocalDate documentExpirationDate116 = params3.getDocumentExpirationDate();
                                                    bVar24.f209776d = params3;
                                                    bVar24.f209777e = jVar4;
                                                    bVar24.f209778f = vq.j.a(bVar10);
                                                    bVar24.f209779g = bVar8;
                                                    bVar24.f209780h = vq.j.a(cVar3);
                                                    bVar24.f209781j = vq.j.a(certificateData8);
                                                    bVar24.f209782k = vq.j.a(result);
                                                    bVar24.f209783l = vq.j.a(documentSchema);
                                                    bVar24.f209784m = bVar8;
                                                    bVar24.f209785n = i25;
                                                    bVar24.f209786p = i26;
                                                    bVar24.f209787q = i27;
                                                    bVar24.f209788r = i28;
                                                    bVar24.f209789s = i29;
                                                    bVar24.f209790t = 0;
                                                    bVar24.f209793x = 12;
                                                    objE = bVar317.w(documentId116, documentSchema, certificateId116, mapA116, documentExpirationDate116, documentType110, bVar24);
                                                    if (objE != objE2) {
                                                        bVar19 = bVar8;
                                                        params4 = params3;
                                                        bVar19.a((dx.i) objE);
                                                        oq.i0 i0Var116 = oq.i0.f148189a;
                                                        this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                        return new dx.i.Right(oq.i0.f148189a);
                                                    }
                                                    break;
                                                case EACTags.DISPLAY_IMAGE /* 69 */:
                                                case 70:
                                                case EACTags.MESSAGE_REFERENCE /* 71 */:
                                                case 72:
                                                case 73:
                                                case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                                                    bVar20 = this.documentsContainerRepository;
                                                    documentId2 = params3.getDocumentId();
                                                    certificateId2 = certificateData2.getCertificateId();
                                                    mapA2 = result.a();
                                                    documentType2 = params3.getDocumentType();
                                                    certificateData9 = certificateData2;
                                                    documentExpirationDate2 = params3.getDocumentExpirationDate();
                                                    documentSchema2 = params3.getDocumentSchema();
                                                    if (documentSchema2 != null) {
                                                        bVar8.b(new dx.b.Generic(new NoSuchElementException("Document schema can not be null")));
                                                        throw new oq.g();
                                                    }
                                                    parentDocumentId4 = params3.getParentDocumentId();
                                                    if (parentDocumentId4 != null) {
                                                        bVar8.b(new dx.b.Generic(new NoSuchElementException("ParentId can not be null")));
                                                        throw new oq.g();
                                                    }
                                                    bVar24.f209776d = params3;
                                                    bVar24.f209777e = jVar4;
                                                    bVar24.f209778f = vq.j.a(bVar10);
                                                    bVar24.f209779g = vq.j.a(bVar8);
                                                    bVar24.f209780h = bVar8;
                                                    bVar24.f209781j = vq.j.a(cVar3);
                                                    bVar24.f209782k = vq.j.a(certificateData9);
                                                    bVar24.f209783l = vq.j.a(result);
                                                    bVar24.f209785n = i25;
                                                    bVar24.f209786p = i26;
                                                    bVar24.f209787q = i27;
                                                    bVar24.f209788r = i28;
                                                    bVar24.f209789s = i29;
                                                    bVar24.f209793x = 13;
                                                    objE = bVar20.l(documentId2, parentDocumentId4, documentSchema2, certificateId2, mapA2, documentExpirationDate2, documentType2, bVar24);
                                                    if (objE != objE2) {
                                                        bVar21 = bVar8;
                                                        params4 = params3;
                                                        bVar21.a((dx.i) objE);
                                                        oq.i0 i0Var117 = oq.i0.f148189a;
                                                        this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                        return new dx.i.Right(oq.i0.f148189a);
                                                    }
                                                    break;
                                                case EACTags.DEPRECATED /* 75 */:
                                                    bVar8.b(new dx.b.Generic(new UnsupportedOperationException("Student card is not supported yet")));
                                                    throw new oq.g();
                                                default:
                                                    throw new oq.p();
                                            }
                                        }
                                        return objE2;
                                    } catch (ex.c e37) {
                                        e = e37;
                                        return new dx.i.Left((dx.b) ex.d.a(e));
                                    } catch (CancellationException e38) {
                                        throw e38;
                                    } catch (Exception e39) {
                                        e = e39;
                                        r15 = jVar8;
                                        px.f fVar4 = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        fVar4.d(message, e, px.c.a(r15));
                                        iVarA = r15.a(e);
                                        if (iVarA instanceof dx.i.Left) {
                                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                        } else {
                                            if (!(iVarA instanceof dx.i.Right)) {
                                                throw new oq.p();
                                            }
                                            objB = ((dx.i.Right) iVarA).b();
                                        }
                                        return new dx.i.Left(objB);
                                    }
                                case 3:
                                    int i69 = bVar24.f209789s;
                                    i28 = bVar24.f209788r;
                                    i27 = bVar24.f209787q;
                                    i26 = bVar24.f209786p;
                                    i25 = bVar24.f209785n;
                                    certificateData2 = (CertificateData) bVar24.f209782k;
                                    f24.c cVar6 = (f24.c) bVar24.f209781j;
                                    bVar6 = (ex.b) bVar24.f209780h;
                                    bVar8 = (ex.b) bVar24.f209779g;
                                    ex.b bVar43 = (ex.b) bVar24.f209778f;
                                    jVar4 = (dx.j) bVar24.f209777e;
                                    k24.n.Params params11 = (k24.n.Params) bVar24.f209776d;
                                    try {
                                        oq.u.b(objE);
                                        i29 = i69;
                                        bVar9 = bVar43;
                                        params3 = params11;
                                        cVar3 = cVar6;
                                        result = (g.Result) bVar6.a((dx.i) objE);
                                        bVar10 = bVar9;
                                        this.remoteLogger.F8("DataScope decrypted successfully", px.d.a.GENERAL);
                                        switch (a.f209775a[params3.getDocumentType().ordinal()]) {
                                            case 1:
                                            case 2:
                                                CertificateData certificateData19 = certificateData2;
                                                jVar5 = jVar4;
                                                v24.b bVar2110 = this.documentsContainerRepository;
                                                String documentId117 = params3.getDocumentId();
                                                int certificateId117 = certificateData19.getCertificateId();
                                                Map<String, CMSSignedData> mapA117 = result.a();
                                                f24.i documentType111 = params3.getDocumentType();
                                                fz.b.LocalDate documentExpirationDate117 = params3.getDocumentExpirationDate();
                                                bVar24.f209776d = params3;
                                                jVar = jVar5;
                                                bVar24.f209777e = jVar;
                                                bVar24.f209778f = vq.j.a(bVar10);
                                                bVar24.f209779g = vq.j.a(bVar8);
                                                bVar24.f209780h = bVar8;
                                                bVar24.f209781j = vq.j.a(cVar3);
                                                bVar24.f209782k = vq.j.a(certificateData19);
                                                bVar24.f209783l = vq.j.a(result);
                                                bVar24.f209785n = i25;
                                                bVar24.f209786p = i26;
                                                bVar24.f209787q = i27;
                                                bVar24.f209788r = i28;
                                                bVar24.f209789s = i29;
                                                bVar24.f209793x = 4;
                                                objE = bVar2110.q(documentId117, certificateId117, mapA117, documentExpirationDate117, documentType111, bVar24);
                                                if (objE != objE2) {
                                                    bVar11 = bVar8;
                                                    params4 = params3;
                                                    bVar11.a((dx.i) objE);
                                                    oq.i0 i0Var118 = oq.i0.f148189a;
                                                    this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                    return new dx.i.Right(oq.i0.f148189a);
                                                }
                                                return objE2;
                                            case 3:
                                                certificateData3 = certificateData2;
                                                parentDocumentId = params3.getParentDocumentId();
                                                if (parentDocumentId != null) {
                                                    bVar8.b(new dx.b.Generic(new NoSuchElementException("ParentId can not be null")));
                                                    throw new oq.g();
                                                }
                                                if (params3.getDocumentTypeFirstEvent()) {
                                                    jVar6 = jVar4;
                                                    i35 = i25;
                                                    result2 = result;
                                                    certificateData4 = certificateData3;
                                                    i36 = i26;
                                                    i37 = 0;
                                                    i38 = i27;
                                                    i39 = i28;
                                                    str = parentDocumentId;
                                                    jVar = jVar6;
                                                    v24.b bVar2111 = this.documentsContainerRepository;
                                                    String documentId118 = params3.getDocumentId();
                                                    int certificateId118 = certificateData4.getCertificateId();
                                                    Map<String, CMSSignedData> mapA118 = result2.a();
                                                    f24.i documentType112 = params3.getDocumentType();
                                                    fz.b.LocalDate documentExpirationDate118 = params3.getDocumentExpirationDate();
                                                    bVar24.f209776d = params3;
                                                    bVar24.f209777e = jVar;
                                                    bVar24.f209778f = vq.j.a(bVar10);
                                                    bVar24.f209779g = bVar8;
                                                    bVar24.f209780h = vq.j.a(cVar3);
                                                    bVar24.f209781j = vq.j.a(certificateData4);
                                                    bVar24.f209782k = vq.j.a(result2);
                                                    bVar24.f209783l = vq.j.a(str);
                                                    bVar24.f209784m = bVar8;
                                                    bVar24.f209785n = i35;
                                                    bVar24.f209786p = i36;
                                                    bVar24.f209787q = i38;
                                                    bVar24.f209788r = i39;
                                                    bVar24.f209789s = i29;
                                                    bVar24.f209790t = i37;
                                                    bVar24.f209793x = 6;
                                                    objE = bVar2111.F(documentId118, str, certificateId118, mapA118, documentExpirationDate118, documentType112, bVar24);
                                                    if (objE != objE2) {
                                                        bVar22 = bVar8;
                                                        params4 = params3;
                                                        bVar22.a((dx.i) objE);
                                                        oq.i0 i0Var119 = oq.i0.f148189a;
                                                        this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                        return new dx.i.Right(oq.i0.f148189a);
                                                    }
                                                    break;
                                                } else {
                                                    v24.b bVar2112 = this.documentsContainerRepository;
                                                    f24.i iVar13 = f24.i.REFUGEE_CHILD_CARD;
                                                    bVar24.f209776d = params3;
                                                    bVar24.f209777e = jVar4;
                                                    jVar6 = jVar4;
                                                    bVar24.f209778f = vq.j.a(bVar10);
                                                    bVar24.f209779g = bVar8;
                                                    bVar24.f209780h = vq.j.a(cVar3);
                                                    bVar24.f209781j = certificateData3;
                                                    bVar24.f209782k = result;
                                                    bVar24.f209783l = parentDocumentId;
                                                    bVar24.f209784m = bVar8;
                                                    bVar24.f209785n = i25;
                                                    bVar24.f209786p = i26;
                                                    bVar24.f209787q = i27;
                                                    bVar24.f209788r = i28;
                                                    bVar24.f209789s = i29;
                                                    bVar24.f209790t = 0;
                                                    bVar24.f209793x = 5;
                                                    objG = bVar2112.G(iVar13, bVar24);
                                                    if (objG == objE2) {
                                                        str2 = parentDocumentId;
                                                        bVar12 = bVar8;
                                                        params5 = params3;
                                                        cVar4 = cVar3;
                                                        certificateData5 = certificateData3;
                                                        i45 = i29;
                                                        objE = objG;
                                                        i35 = i25;
                                                        i36 = i26;
                                                        i38 = i27;
                                                        i39 = i28;
                                                        i46 = 0;
                                                        ex.b bVar2113 = bVar10;
                                                        bVar8.a((dx.i) objE);
                                                        bVar10 = bVar2113;
                                                        i37 = i46;
                                                        str = str2;
                                                        i29 = i45;
                                                        bVar8 = bVar12;
                                                        cVar3 = cVar4;
                                                        result2 = result;
                                                        certificateData4 = certificateData5;
                                                        params3 = params5;
                                                        jVar = jVar6;
                                                        v24.b bVar2114 = this.documentsContainerRepository;
                                                        String documentId119 = params3.getDocumentId();
                                                        int certificateId119 = certificateData4.getCertificateId();
                                                        Map<String, CMSSignedData> mapA119 = result2.a();
                                                        f24.i documentType113 = params3.getDocumentType();
                                                        fz.b.LocalDate documentExpirationDate119 = params3.getDocumentExpirationDate();
                                                        bVar24.f209776d = params3;
                                                        bVar24.f209777e = jVar;
                                                        bVar24.f209778f = vq.j.a(bVar10);
                                                        bVar24.f209779g = bVar8;
                                                        bVar24.f209780h = vq.j.a(cVar3);
                                                        bVar24.f209781j = vq.j.a(certificateData4);
                                                        bVar24.f209782k = vq.j.a(result2);
                                                        bVar24.f209783l = vq.j.a(str);
                                                        bVar24.f209784m = bVar8;
                                                        bVar24.f209785n = i35;
                                                        bVar24.f209786p = i36;
                                                        bVar24.f209787q = i38;
                                                        bVar24.f209788r = i39;
                                                        bVar24.f209789s = i29;
                                                        bVar24.f209790t = i37;
                                                        bVar24.f209793x = 6;
                                                        objE = bVar2114.F(documentId119, str, certificateId119, mapA119, documentExpirationDate119, documentType113, bVar24);
                                                        if (objE != objE2) {
                                                            bVar22 = bVar8;
                                                            params4 = params3;
                                                            bVar22.a((dx.i) objE);
                                                            oq.i0 i0Var1110 = oq.i0.f148189a;
                                                            this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                            return new dx.i.Right(oq.i0.f148189a);
                                                        }
                                                        break;
                                                    }
                                                }
                                                return objE2;
                                            case 4:
                                            case 5:
                                            case 6:
                                                certificateData6 = certificateData2;
                                                parentDocumentId2 = params3.getParentDocumentId();
                                                if (parentDocumentId2 != null) {
                                                    bVar8.b(new dx.b.Generic(new NoSuchElementException("ParentId can not be null")));
                                                    throw new oq.g();
                                                }
                                                v24.b bVar318 = this.documentsContainerRepository;
                                                String documentId1110 = params3.getDocumentId();
                                                int certificateId1110 = certificateData6.getCertificateId();
                                                Map<String, CMSSignedData> mapA1110 = result.a();
                                                f24.i documentType114 = params3.getDocumentType();
                                                fz.b.LocalDate documentExpirationDate1110 = params3.getDocumentExpirationDate();
                                                bVar24.f209776d = params3;
                                                bVar24.f209777e = jVar4;
                                                bVar24.f209778f = vq.j.a(bVar10);
                                                bVar24.f209779g = bVar8;
                                                bVar24.f209780h = vq.j.a(cVar3);
                                                bVar24.f209781j = vq.j.a(certificateData6);
                                                bVar24.f209782k = vq.j.a(result);
                                                bVar24.f209783l = vq.j.a(parentDocumentId2);
                                                bVar24.f209784m = bVar8;
                                                bVar24.f209785n = i25;
                                                bVar24.f209786p = i26;
                                                bVar24.f209787q = i27;
                                                bVar24.f209788r = i28;
                                                bVar24.f209789s = i29;
                                                bVar24.f209790t = 0;
                                                bVar24.f209793x = 7;
                                                objE = bVar318.F(documentId1110, parentDocumentId2, certificateId1110, mapA1110, documentExpirationDate1110, documentType114, bVar24);
                                                if (objE != objE2) {
                                                    bVar13 = bVar8;
                                                    params4 = params3;
                                                    bVar13.a((dx.i) objE);
                                                    oq.i0 i0Var1111 = oq.i0.f148189a;
                                                    this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                    return new dx.i.Right(oq.i0.f148189a);
                                                }
                                                return objE2;
                                            case 7:
                                                certificateData7 = certificateData2;
                                                parentDocumentId3 = params3.getParentDocumentId();
                                                if (parentDocumentId3 != null) {
                                                    bVar8.b(new dx.b.Generic(new NoSuchElementException("ParentId can not be null")));
                                                    throw new oq.g();
                                                }
                                                if (params3.getDocumentTypeFirstEvent()) {
                                                    v24.b bVar319 = this.documentsContainerRepository;
                                                    f24.i iVar14 = f24.i.VEHICLE_CARD;
                                                    bVar24.f209776d = params3;
                                                    bVar24.f209777e = jVar4;
                                                    bVar24.f209778f = vq.j.a(bVar10);
                                                    bVar24.f209779g = bVar8;
                                                    bVar24.f209780h = vq.j.a(cVar3);
                                                    bVar24.f209781j = certificateData7;
                                                    bVar24.f209782k = result;
                                                    bVar24.f209783l = parentDocumentId3;
                                                    bVar24.f209784m = bVar8;
                                                    bVar24.f209785n = i25;
                                                    bVar24.f209786p = i26;
                                                    bVar24.f209787q = i27;
                                                    bVar24.f209788r = i28;
                                                    bVar24.f209789s = i29;
                                                    bVar24.f209790t = 0;
                                                    bVar24.f209793x = 8;
                                                    objG2 = bVar319.G(iVar14, bVar24);
                                                    if (objG2 == objE2) {
                                                        certificateData7 = certificateData7;
                                                    } else {
                                                        certificateData7 = certificateData7;
                                                        str4 = parentDocumentId3;
                                                        objE = objG2;
                                                        params6 = params3;
                                                        result3 = result;
                                                        i47 = i26;
                                                        i48 = i25;
                                                        bVar15 = bVar8;
                                                        i49 = i28;
                                                        i55 = i27;
                                                        i56 = 0;
                                                        i57 = i29;
                                                        bVar16 = bVar10;
                                                        bVar8.a((dx.i) objE);
                                                        g.Result result7 = result3;
                                                        params3 = params6;
                                                        bVar14 = bVar16;
                                                        i29 = i57;
                                                        str3 = str4;
                                                        result = result7;
                                                        bVar8 = bVar15;
                                                        v24.b bVar3110 = this.documentsContainerRepository;
                                                        String documentId1111 = params3.getDocumentId();
                                                        int certificateId1111 = certificateData7.getCertificateId();
                                                        Map<String, CMSSignedData> mapA1111 = result.a();
                                                        fz.b.LocalDate documentExpirationDate1111 = params3.getDocumentExpirationDate();
                                                        f24.i iVar15 = f24.i.VEHICLE_CARD;
                                                        bVar24.f209776d = params3;
                                                        bVar24.f209777e = jVar4;
                                                        bVar24.f209778f = vq.j.a(bVar14);
                                                        bVar24.f209779g = bVar8;
                                                        bVar24.f209780h = vq.j.a(cVar3);
                                                        bVar24.f209781j = vq.j.a(certificateData7);
                                                        bVar24.f209782k = vq.j.a(result);
                                                        bVar24.f209783l = vq.j.a(str3);
                                                        bVar24.f209784m = bVar8;
                                                        bVar24.f209785n = i48;
                                                        bVar24.f209786p = i47;
                                                        bVar24.f209787q = i55;
                                                        bVar24.f209788r = i49;
                                                        bVar24.f209789s = i29;
                                                        bVar24.f209790t = i56;
                                                        bVar24.f209793x = 9;
                                                        objE = bVar3110.F(documentId1111, str3, certificateId1111, mapA1111, documentExpirationDate1111, iVar15, bVar24);
                                                        if (objE != objE2) {
                                                            bVar23 = bVar8;
                                                            params4 = params3;
                                                            bVar23.a((dx.i) objE);
                                                            oq.i0 i0Var1112 = oq.i0.f148189a;
                                                            this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                            return new dx.i.Right(oq.i0.f148189a);
                                                        }
                                                    }
                                                } else {
                                                    bVar14 = bVar10;
                                                    i47 = i26;
                                                    i48 = i25;
                                                    i49 = i28;
                                                    i55 = i27;
                                                    i56 = 0;
                                                    str3 = parentDocumentId3;
                                                    v24.b bVar3111 = this.documentsContainerRepository;
                                                    String documentId1112 = params3.getDocumentId();
                                                    int certificateId1112 = certificateData7.getCertificateId();
                                                    Map<String, CMSSignedData> mapA1112 = result.a();
                                                    fz.b.LocalDate documentExpirationDate1112 = params3.getDocumentExpirationDate();
                                                    f24.i iVar16 = f24.i.VEHICLE_CARD;
                                                    bVar24.f209776d = params3;
                                                    bVar24.f209777e = jVar4;
                                                    bVar24.f209778f = vq.j.a(bVar14);
                                                    bVar24.f209779g = bVar8;
                                                    bVar24.f209780h = vq.j.a(cVar3);
                                                    bVar24.f209781j = vq.j.a(certificateData7);
                                                    bVar24.f209782k = vq.j.a(result);
                                                    bVar24.f209783l = vq.j.a(str3);
                                                    bVar24.f209784m = bVar8;
                                                    bVar24.f209785n = i48;
                                                    bVar24.f209786p = i47;
                                                    bVar24.f209787q = i55;
                                                    bVar24.f209788r = i49;
                                                    bVar24.f209789s = i29;
                                                    bVar24.f209790t = i56;
                                                    bVar24.f209793x = 9;
                                                    objE = bVar3111.F(documentId1112, str3, certificateId1112, mapA1112, documentExpirationDate1112, iVar16, bVar24);
                                                    if (objE != objE2) {
                                                        bVar23 = bVar8;
                                                        params4 = params3;
                                                        bVar23.a((dx.i) objE);
                                                        oq.i0 i0Var1113 = oq.i0.f148189a;
                                                        this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                        return new dx.i.Right(oq.i0.f148189a);
                                                    }
                                                }
                                                return objE2;
                                            case 8:
                                            case 9:
                                            case 10:
                                            case 11:
                                            case 12:
                                                CertificateData certificateData110 = certificateData2;
                                                bVar17 = this.documentsContainerRepository;
                                                documentId = params3.getDocumentId();
                                                certificateId = certificateData110.getCertificateId();
                                                mapA = result.a();
                                                documentType = params3.getDocumentType();
                                                documentExpirationDate = params3.getDocumentExpirationDate();
                                                bVar24.f209776d = params3;
                                                bVar24.f209777e = jVar4;
                                                bVar24.f209778f = vq.j.a(bVar10);
                                                bVar24.f209779g = vq.j.a(bVar8);
                                                bVar24.f209780h = vq.j.a(cVar3);
                                                bVar24.f209781j = vq.j.a(certificateData110);
                                                bVar24.f209782k = vq.j.a(result);
                                                bVar24.f209785n = i25;
                                                bVar24.f209786p = i26;
                                                bVar24.f209787q = i27;
                                                bVar24.f209788r = i28;
                                                bVar24.f209789s = i29;
                                                bVar24.f209793x = 10;
                                                if (bVar17.v(documentId, certificateId, mapA, documentExpirationDate, documentType, bVar24) != objE2) {
                                                    return objE2;
                                                }
                                                params7 = params3;
                                                params4 = params7;
                                                this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                return new dx.i.Right(oq.i0.f148189a);
                                            case 13:
                                            case 14:
                                            case 15:
                                            case 16:
                                            case 17:
                                            case 18:
                                            case 19:
                                            case 20:
                                            case 21:
                                            case 22:
                                            case 23:
                                            case 24:
                                            case 25:
                                            case 26:
                                            case 27:
                                            case 28:
                                            case 29:
                                            case 30:
                                            case BERTags.DATE /* 31 */:
                                            case 32:
                                            case 33:
                                            case 34:
                                            case 35:
                                            case 36:
                                            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                                            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                                            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                                            case 40:
                                            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                                            case EACTags.CURRENCY_CODE /* 42 */:
                                            case EACTags.DATE_OF_BIRTH /* 43 */:
                                            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                                            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                                            case 46:
                                            case 47:
                                                CertificateData certificateData111 = certificateData2;
                                                v24.b bVar3112 = this.documentsContainerRepository;
                                                String documentId1113 = params3.getDocumentId();
                                                int certificateId1113 = certificateData111.getCertificateId();
                                                Map<String, CMSSignedData> mapA1113 = result.a();
                                                f24.i documentType115 = params3.getDocumentType();
                                                fz.b.LocalDate documentExpirationDate1113 = params3.getDocumentExpirationDate();
                                                bVar24.f209776d = params3;
                                                bVar24.f209777e = jVar4;
                                                bVar24.f209778f = vq.j.a(bVar10);
                                                bVar24.f209779g = vq.j.a(bVar8);
                                                bVar24.f209780h = bVar8;
                                                bVar24.f209781j = vq.j.a(cVar3);
                                                bVar24.f209782k = vq.j.a(certificateData111);
                                                bVar24.f209783l = vq.j.a(result);
                                                bVar24.f209785n = i25;
                                                bVar24.f209786p = i26;
                                                bVar24.f209787q = i27;
                                                bVar24.f209788r = i28;
                                                bVar24.f209789s = i29;
                                                bVar24.f209793x = 11;
                                                objE = bVar3112.t(documentId1113, certificateId1113, mapA1113, documentExpirationDate1113, documentType115, bVar24);
                                                if (objE != objE2) {
                                                    bVar18 = bVar8;
                                                    params4 = params3;
                                                    bVar18.a((dx.i) objE);
                                                    oq.i0 i0Var1114 = oq.i0.f148189a;
                                                    this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                    return new dx.i.Right(oq.i0.f148189a);
                                                }
                                                return objE2;
                                            case 48:
                                            case 49:
                                            case 50:
                                            case EACTags.TRANSACTION_DATE /* 51 */:
                                            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                                            case 53:
                                            case EACTags.CURRENCY_EXPONENT /* 54 */:
                                            case 55:
                                            case 56:
                                            case 57:
                                            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                                            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                                            case 60:
                                            case 61:
                                            case 62:
                                            case 63:
                                            case 64:
                                            case 65:
                                            case 66:
                                            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                                            case EACTags.APPLICATION_IMAGE /* 68 */:
                                                certificateData8 = certificateData2;
                                                documentSchema = params3.getDocumentSchema();
                                                if (documentSchema != null) {
                                                    bVar8.b(new dx.b.Generic(new NoSuchElementException("Document schema can not be null")));
                                                    throw new oq.g();
                                                }
                                                v24.b bVar3113 = this.documentsContainerRepository;
                                                String documentId1114 = params3.getDocumentId();
                                                int certificateId1114 = certificateData8.getCertificateId();
                                                Map<String, CMSSignedData> mapA1114 = result.a();
                                                f24.i documentType116 = params3.getDocumentType();
                                                fz.b.LocalDate documentExpirationDate1114 = params3.getDocumentExpirationDate();
                                                bVar24.f209776d = params3;
                                                bVar24.f209777e = jVar4;
                                                bVar24.f209778f = vq.j.a(bVar10);
                                                bVar24.f209779g = bVar8;
                                                bVar24.f209780h = vq.j.a(cVar3);
                                                bVar24.f209781j = vq.j.a(certificateData8);
                                                bVar24.f209782k = vq.j.a(result);
                                                bVar24.f209783l = vq.j.a(documentSchema);
                                                bVar24.f209784m = bVar8;
                                                bVar24.f209785n = i25;
                                                bVar24.f209786p = i26;
                                                bVar24.f209787q = i27;
                                                bVar24.f209788r = i28;
                                                bVar24.f209789s = i29;
                                                bVar24.f209790t = 0;
                                                bVar24.f209793x = 12;
                                                objE = bVar3113.w(documentId1114, documentSchema, certificateId1114, mapA1114, documentExpirationDate1114, documentType116, bVar24);
                                                if (objE != objE2) {
                                                    bVar19 = bVar8;
                                                    params4 = params3;
                                                    bVar19.a((dx.i) objE);
                                                    oq.i0 i0Var1115 = oq.i0.f148189a;
                                                    this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                    return new dx.i.Right(oq.i0.f148189a);
                                                }
                                                return objE2;
                                            case EACTags.DISPLAY_IMAGE /* 69 */:
                                            case 70:
                                            case EACTags.MESSAGE_REFERENCE /* 71 */:
                                            case 72:
                                            case 73:
                                            case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                                                bVar20 = this.documentsContainerRepository;
                                                documentId2 = params3.getDocumentId();
                                                certificateId2 = certificateData2.getCertificateId();
                                                mapA2 = result.a();
                                                documentType2 = params3.getDocumentType();
                                                certificateData9 = certificateData2;
                                                documentExpirationDate2 = params3.getDocumentExpirationDate();
                                                documentSchema2 = params3.getDocumentSchema();
                                                if (documentSchema2 != null) {
                                                    bVar8.b(new dx.b.Generic(new NoSuchElementException("Document schema can not be null")));
                                                    throw new oq.g();
                                                }
                                                parentDocumentId4 = params3.getParentDocumentId();
                                                if (parentDocumentId4 != null) {
                                                    bVar8.b(new dx.b.Generic(new NoSuchElementException("ParentId can not be null")));
                                                    throw new oq.g();
                                                }
                                                bVar24.f209776d = params3;
                                                bVar24.f209777e = jVar4;
                                                bVar24.f209778f = vq.j.a(bVar10);
                                                bVar24.f209779g = vq.j.a(bVar8);
                                                bVar24.f209780h = bVar8;
                                                bVar24.f209781j = vq.j.a(cVar3);
                                                bVar24.f209782k = vq.j.a(certificateData9);
                                                bVar24.f209783l = vq.j.a(result);
                                                bVar24.f209785n = i25;
                                                bVar24.f209786p = i26;
                                                bVar24.f209787q = i27;
                                                bVar24.f209788r = i28;
                                                bVar24.f209789s = i29;
                                                bVar24.f209793x = 13;
                                                objE = bVar20.l(documentId2, parentDocumentId4, documentSchema2, certificateId2, mapA2, documentExpirationDate2, documentType2, bVar24);
                                                if (objE != objE2) {
                                                    bVar21 = bVar8;
                                                    params4 = params3;
                                                    bVar21.a((dx.i) objE);
                                                    oq.i0 i0Var1116 = oq.i0.f148189a;
                                                    this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                                    return new dx.i.Right(oq.i0.f148189a);
                                                }
                                                return objE2;
                                            case EACTags.DEPRECATED /* 75 */:
                                                bVar8.b(new dx.b.Generic(new UnsupportedOperationException("Student card is not supported yet")));
                                                throw new oq.g();
                                            default:
                                                throw new oq.p();
                                        }
                                    } catch (ex.c e45) {
                                        e = e45;
                                        return new dx.i.Left((dx.b) ex.d.a(e));
                                    } catch (CancellationException e46) {
                                        throw e46;
                                    } catch (Exception e47) {
                                        e = e47;
                                        r15 = jVar4;
                                        px.f fVar5 = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        fVar5.d(message, e, px.c.a(r15));
                                        iVarA = r15.a(e);
                                        if (iVarA instanceof dx.i.Left) {
                                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                        } else {
                                            if (!(iVarA instanceof dx.i.Right)) {
                                                throw new oq.p();
                                            }
                                            objB = ((dx.i.Right) iVarA).b();
                                        }
                                        return new dx.i.Left(objB);
                                    }
                                case 4:
                                    bVar11 = (ex.b) bVar24.f209780h;
                                    params4 = (k24.n.Params) bVar24.f209776d;
                                    oq.u.b(objE);
                                    bVar11.a((dx.i) objE);
                                    oq.i0 i0Var1117 = oq.i0.f148189a;
                                    this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                    return new dx.i.Right(oq.i0.f148189a);
                                case 5:
                                    int i75 = bVar24.f209790t;
                                    int i76 = bVar24.f209789s;
                                    int i77 = bVar24.f209788r;
                                    int i78 = bVar24.f209787q;
                                    int i79 = bVar24.f209786p;
                                    int i85 = bVar24.f209785n;
                                    ex.b bVar44 = (ex.b) bVar24.f209784m;
                                    str2 = (String) bVar24.f209783l;
                                    result = (g.Result) bVar24.f209782k;
                                    CertificateData certificateData20 = (CertificateData) bVar24.f209781j;
                                    f24.c cVar7 = (f24.c) bVar24.f209780h;
                                    ex.b bVar45 = (ex.b) bVar24.f209779g;
                                    i45 = i76;
                                    bVar10 = (ex.b) bVar24.f209778f;
                                    dx.j<dx.b> jVar9 = (dx.j) bVar24.f209777e;
                                    params5 = (k24.n.Params) bVar24.f209776d;
                                    try {
                                        oq.u.b(objE);
                                        jVar6 = jVar9;
                                        bVar12 = bVar45;
                                        cVar4 = cVar7;
                                        certificateData5 = certificateData20;
                                        bVar8 = bVar44;
                                        i35 = i85;
                                        i36 = i79;
                                        i38 = i78;
                                        i39 = i77;
                                        i46 = i75;
                                        ex.b bVar2115 = bVar10;
                                        bVar8.a((dx.i) objE);
                                        bVar10 = bVar2115;
                                        i37 = i46;
                                        str = str2;
                                        i29 = i45;
                                        bVar8 = bVar12;
                                        cVar3 = cVar4;
                                        result2 = result;
                                        certificateData4 = certificateData5;
                                        params3 = params5;
                                        jVar = jVar6;
                                        v24.b bVar2116 = this.documentsContainerRepository;
                                        String documentId1115 = params3.getDocumentId();
                                        int certificateId1115 = certificateData4.getCertificateId();
                                        Map<String, CMSSignedData> mapA1115 = result2.a();
                                        f24.i documentType117 = params3.getDocumentType();
                                        fz.b.LocalDate documentExpirationDate1115 = params3.getDocumentExpirationDate();
                                        bVar24.f209776d = params3;
                                        bVar24.f209777e = jVar;
                                        bVar24.f209778f = vq.j.a(bVar10);
                                        bVar24.f209779g = bVar8;
                                        bVar24.f209780h = vq.j.a(cVar3);
                                        bVar24.f209781j = vq.j.a(certificateData4);
                                        bVar24.f209782k = vq.j.a(result2);
                                        bVar24.f209783l = vq.j.a(str);
                                        bVar24.f209784m = bVar8;
                                        bVar24.f209785n = i35;
                                        bVar24.f209786p = i36;
                                        bVar24.f209787q = i38;
                                        bVar24.f209788r = i39;
                                        bVar24.f209789s = i29;
                                        bVar24.f209790t = i37;
                                        bVar24.f209793x = 6;
                                        objE = bVar2116.F(documentId1115, str, certificateId1115, mapA1115, documentExpirationDate1115, documentType117, bVar24);
                                        if (objE != objE2) {
                                            bVar22 = bVar8;
                                            params4 = params3;
                                            bVar22.a((dx.i) objE);
                                            oq.i0 i0Var1118 = oq.i0.f148189a;
                                            this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                            return new dx.i.Right(oq.i0.f148189a);
                                        }
                                        return objE2;
                                    } catch (ex.c e48) {
                                        e = e48;
                                        return new dx.i.Left((dx.b) ex.d.a(e));
                                    } catch (CancellationException e49) {
                                        throw e49;
                                    } catch (Exception e55) {
                                        e = e55;
                                        r15 = jVar9;
                                        px.f fVar6 = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        fVar6.d(message, e, px.c.a(r15));
                                        iVarA = r15.a(e);
                                        if (iVarA instanceof dx.i.Left) {
                                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                        } else {
                                            if (!(iVarA instanceof dx.i.Right)) {
                                                throw new oq.p();
                                            }
                                            objB = ((dx.i.Right) iVarA).b();
                                        }
                                        return new dx.i.Left(objB);
                                    }
                                case 6:
                                    bVar22 = (ex.b) bVar24.f209784m;
                                    params4 = (k24.n.Params) bVar24.f209776d;
                                    oq.u.b(objE);
                                    bVar22.a((dx.i) objE);
                                    oq.i0 i0Var1119 = oq.i0.f148189a;
                                    this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                    return new dx.i.Right(oq.i0.f148189a);
                                case 7:
                                    bVar13 = (ex.b) bVar24.f209784m;
                                    params4 = (k24.n.Params) bVar24.f209776d;
                                    oq.u.b(objE);
                                    bVar13.a((dx.i) objE);
                                    oq.i0 i0Var11110 = oq.i0.f148189a;
                                    this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                    return new dx.i.Right(oq.i0.f148189a);
                                case 8:
                                    int i86 = bVar24.f209790t;
                                    int i87 = bVar24.f209789s;
                                    int i88 = bVar24.f209788r;
                                    int i89 = bVar24.f209787q;
                                    int i95 = bVar24.f209786p;
                                    int i96 = bVar24.f209785n;
                                    ex.b bVar46 = (ex.b) bVar24.f209784m;
                                    String str5 = (String) bVar24.f209783l;
                                    g.Result result8 = (g.Result) bVar24.f209782k;
                                    CertificateData certificateData21 = (CertificateData) bVar24.f209781j;
                                    f24.c cVar8 = (f24.c) bVar24.f209780h;
                                    ex.b bVar47 = (ex.b) bVar24.f209779g;
                                    ex.b bVar48 = (ex.b) bVar24.f209778f;
                                    dx.j<dx.b> jVar10 = (dx.j) bVar24.f209777e;
                                    params6 = (k24.n.Params) bVar24.f209776d;
                                    try {
                                        oq.u.b(objE);
                                        certificateData7 = certificateData21;
                                        bVar15 = bVar47;
                                        jVar4 = jVar10;
                                        bVar8 = bVar46;
                                        cVar3 = cVar8;
                                        i47 = i95;
                                        result3 = result8;
                                        i49 = i88;
                                        str4 = str5;
                                        i57 = i87;
                                        i48 = i96;
                                        i55 = i89;
                                        i56 = i86;
                                        bVar16 = bVar48;
                                        bVar8.a((dx.i) objE);
                                        g.Result result9 = result3;
                                        params3 = params6;
                                        bVar14 = bVar16;
                                        i29 = i57;
                                        str3 = str4;
                                        result = result9;
                                        bVar8 = bVar15;
                                        v24.b bVar3114 = this.documentsContainerRepository;
                                        String documentId1116 = params3.getDocumentId();
                                        int certificateId1116 = certificateData7.getCertificateId();
                                        Map<String, CMSSignedData> mapA1116 = result.a();
                                        fz.b.LocalDate documentExpirationDate1116 = params3.getDocumentExpirationDate();
                                        f24.i iVar17 = f24.i.VEHICLE_CARD;
                                        bVar24.f209776d = params3;
                                        bVar24.f209777e = jVar4;
                                        bVar24.f209778f = vq.j.a(bVar14);
                                        bVar24.f209779g = bVar8;
                                        bVar24.f209780h = vq.j.a(cVar3);
                                        bVar24.f209781j = vq.j.a(certificateData7);
                                        bVar24.f209782k = vq.j.a(result);
                                        bVar24.f209783l = vq.j.a(str3);
                                        bVar24.f209784m = bVar8;
                                        bVar24.f209785n = i48;
                                        bVar24.f209786p = i47;
                                        bVar24.f209787q = i55;
                                        bVar24.f209788r = i49;
                                        bVar24.f209789s = i29;
                                        bVar24.f209790t = i56;
                                        bVar24.f209793x = 9;
                                        objE = bVar3114.F(documentId1116, str3, certificateId1116, mapA1116, documentExpirationDate1116, iVar17, bVar24);
                                        if (objE != objE2) {
                                            bVar23 = bVar8;
                                            params4 = params3;
                                            bVar23.a((dx.i) objE);
                                            oq.i0 i0Var11111 = oq.i0.f148189a;
                                            this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                            return new dx.i.Right(oq.i0.f148189a);
                                        }
                                        return objE2;
                                    } catch (ex.c e56) {
                                        e = e56;
                                        return new dx.i.Left((dx.b) ex.d.a(e));
                                    } catch (CancellationException e57) {
                                        throw e57;
                                    } catch (Exception e58) {
                                        e = e58;
                                        r15 = jVar10;
                                        px.f fVar7 = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        fVar7.d(message, e, px.c.a(r15));
                                        iVarA = r15.a(e);
                                        if (iVarA instanceof dx.i.Left) {
                                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                        } else {
                                            if (!(iVarA instanceof dx.i.Right)) {
                                                throw new oq.p();
                                            }
                                            objB = ((dx.i.Right) iVarA).b();
                                        }
                                        return new dx.i.Left(objB);
                                    }
                                case 9:
                                    bVar23 = (ex.b) bVar24.f209784m;
                                    params4 = (k24.n.Params) bVar24.f209776d;
                                    oq.u.b(objE);
                                    bVar23.a((dx.i) objE);
                                    oq.i0 i0Var11112 = oq.i0.f148189a;
                                    this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                    return new dx.i.Right(oq.i0.f148189a);
                                case 10:
                                    params7 = (k24.n.Params) bVar24.f209776d;
                                    oq.u.b(objE);
                                    params4 = params7;
                                    this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                    return new dx.i.Right(oq.i0.f148189a);
                                case 11:
                                    bVar18 = (ex.b) bVar24.f209780h;
                                    params4 = (k24.n.Params) bVar24.f209776d;
                                    oq.u.b(objE);
                                    bVar18.a((dx.i) objE);
                                    oq.i0 i0Var11113 = oq.i0.f148189a;
                                    this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                    return new dx.i.Right(oq.i0.f148189a);
                                case 12:
                                    bVar19 = (ex.b) bVar24.f209784m;
                                    params4 = (k24.n.Params) bVar24.f209776d;
                                    oq.u.b(objE);
                                    bVar19.a((dx.i) objE);
                                    oq.i0 i0Var11114 = oq.i0.f148189a;
                                    this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                    return new dx.i.Right(oq.i0.f148189a);
                                case 13:
                                    bVar21 = (ex.b) bVar24.f209780h;
                                    params4 = (k24.n.Params) bVar24.f209776d;
                                    oq.u.b(objE);
                                    bVar21.a((dx.i) objE);
                                    oq.i0 i0Var11115 = oq.i0.f148189a;
                                    this.remoteLogger.F8("Saved document data for " + params4.getDocumentType(), px.d.a.GENERAL);
                                    return new dx.i.Right(oq.i0.f148189a);
                                default:
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } catch (CancellationException e59) {
                            throw e59;
                        }
                    } catch (Exception e65) {
                        e = e65;
                    }
                } catch (ex.c e66) {
                    e = e66;
                } catch (CancellationException e67) {
                    throw e67;
                }
            } catch (ex.c e68) {
                e = e68;
            } catch (CancellationException e69) {
                e = e69;
            } catch (Exception e75) {
                e = e75;
            }
        } catch (ex.c e76) {
            e = e76;
        } catch (CancellationException e77) {
            e = e77;
        } catch (Exception e78) {
            e = e78;
        }
    }
}
