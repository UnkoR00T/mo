package lq0;

import ay.DomainCertificates;
import iq0.Announcement;
import iq0.Announcements;
import iq0.AnonymousFeatureFlag;
import iq0.AnonymousFeatureFlags;
import iq0.ApplicationFormServiceEntry;
import iq0.ApplicationFormServiceGroup;
import iq0.ApplicationFormServices;
import iq0.BESearchConfig;
import iq0.BESearchConfigSectionItem;
import iq0.BESearchSections;
import iq0.CategoryDashboardServices;
import iq0.DashboardServiceEntry;
import iq0.EnvironmentViolationImageSettings;
import iq0.FeatureEntry;
import iq0.FeatureFlag;
import iq0.MobileSettings;
import iq0.RateConfigurationEntry;
import iq0.SearchTags;
import iq0.SearchTagsForAppMenuType;
import iq0.SearchTagsForDocumentType;
import iq0.SearchTagsForServiceType;
import iq0.SearchTagsWithLanguage;
import iq0.TemporaryInterruption;
import iq0.TrustedCertificates;
import iq0.a0;
import iq0.e;
import iq0.h;
import iq0.i;
import iq0.y;
import iy.c0;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mq0.AnnouncementDto;
import mq0.AnnouncementsDto;
import mq0.AnonymousFeatureFlagDto;
import mq0.AnonymousFeatureFlagsDto;
import mq0.ApplicationFormServiceEntryDto;
import mq0.ApplicationFormServiceGroupDto;
import mq0.ApplicationFormServicesDto;
import mq0.CategoryDashboardServicesDto;
import mq0.DashboardServiceEntryDto;
import mq0.DomainCertificatesDto;
import mq0.EnvironmentViolationImageSettingsDto;
import mq0.FeatureEntryDto;
import mq0.FeatureFlagDto;
import mq0.MobileSettingsDto;
import mq0.RateConfigurationDto;
import mq0.SearchConfigDocumentOrService;
import mq0.SearchConfigDto;
import mq0.SearchTagsByDashboardServiceType;
import mq0.SearchTagsByDocumentType;
import mq0.SearchTagsByLanguage;
import mq0.SearchTagsByMobileAppMenuSearchTagType;
import mq0.SearchTagsDto;
import mq0.TemporaryInterruptionDto;
import mq0.TrustedCertificatesDto;
import mq0.b;
import mq0.n;
import mq0.s;
import mq0.t;
import mq0.w;
import mq0.z;
import oq.p;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.EACTags;
import p071kotlin.Metadata;
import pq.v;
import rq0.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000î\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010\"\u001a\u00020!*\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010&\u001a\u00020%*\u00020$¢\u0006\u0004\b&\u0010'\u001a\u0011\u0010*\u001a\u00020)*\u00020(¢\u0006\u0004\b*\u0010+\u001a\u0011\u0010.\u001a\u00020-*\u00020,¢\u0006\u0004\b.\u0010/\u001a\u0011\u00102\u001a\u000201*\u000200¢\u0006\u0004\b2\u00103\u001a\u0011\u00106\u001a\u000205*\u000204¢\u0006\u0004\b6\u00107\u001a\u0011\u0010:\u001a\u000209*\u000208¢\u0006\u0004\b:\u0010;\u001a\u0011\u0010>\u001a\u00020=*\u00020<¢\u0006\u0004\b>\u0010?\u001a\u0011\u0010B\u001a\u00020A*\u00020@¢\u0006\u0004\bB\u0010C\u001a\u0011\u0010F\u001a\u00020E*\u00020D¢\u0006\u0004\bF\u0010G\u001a\u0011\u0010J\u001a\u00020I*\u00020H¢\u0006\u0004\bJ\u0010K\u001a\u0011\u0010N\u001a\u00020M*\u00020L¢\u0006\u0004\bN\u0010O\u001a\u0011\u0010R\u001a\u00020Q*\u00020P¢\u0006\u0004\bR\u0010S\u001a\u0011\u0010V\u001a\u00020U*\u00020T¢\u0006\u0004\bV\u0010W\u001a\u0011\u0010Z\u001a\u00020Y*\u00020X¢\u0006\u0004\bZ\u0010[\u001a\u0019\u0010`\u001a\u00020_*\u00020\\2\u0006\u0010^\u001a\u00020]¢\u0006\u0004\b`\u0010a\u001a\u0011\u0010d\u001a\u00020c*\u00020b¢\u0006\u0004\bd\u0010e\u001a\u0011\u0010h\u001a\u00020g*\u00020f¢\u0006\u0004\bh\u0010i\u001a\u0011\u0010l\u001a\u00020k*\u00020j¢\u0006\u0004\bl\u0010m\u001a\u0011\u0010p\u001a\u00020o*\u00020n¢\u0006\u0004\bp\u0010q\u001a\u0011\u0010t\u001a\u00020s*\u00020r¢\u0006\u0004\bt\u0010u\u001a\u0011\u0010x\u001a\u00020w*\u00020v¢\u0006\u0004\bx\u0010y¨\u0006z"}, d2 = {"Lmq0/u;", "Liq0/w;", "r", "(Lmq0/u;)Liq0/w;", "Lmq0/q;", "Liq0/t;", "o", "(Lmq0/q;)Liq0/t;", "Lmq0/t;", "Liq0/v;", "q", "(Lmq0/t;)Liq0/v;", "Lmq0/w;", "Liq0/z;", "u", "(Lmq0/w;)Liq0/z;", "Lmq0/r;", "Liq0/u;", "p", "(Lmq0/r;)Liq0/u;", "Lmq0/s;", "Liq0/y;", "t", "(Lmq0/s;)Liq0/y;", "Lmq0/m;", "Liq0/p;", "m", "(Lmq0/m;)Liq0/p;", "Lmq0/l;", "Liq0/o;", "l", "(Lmq0/l;)Liq0/o;", "Lmq0/f0;", "Liq0/g0;", "B", "(Lmq0/f0;)Liq0/g0;", "Lmq0/n;", "Lrq0/c;", ip.a.f96138c, "(Lmq0/n;)Lrq0/c;", "Lmq0/v;", "Liq0/x;", "s", "(Lmq0/v;)Liq0/x;", "Lmq0/f;", "Liq0/f;", "f", "(Lmq0/f;)Liq0/f;", "Lmq0/d;", "Liq0/d;", "e", "(Lmq0/d;)Liq0/d;", "Lmq0/g0;", "Liq0/h0;", "C", "(Lmq0/g0;)Liq0/h0;", "Lmq0/o;", "Lay/f;", "a", "(Lmq0/o;)Lay/f;", "Lmq0/c;", "Liq0/c;", "d", "(Lmq0/c;)Liq0/c;", "Lmq0/a;", "Liq0/a;", "b", "(Lmq0/a;)Liq0/a;", "Lmq0/b;", "Liq0/b;", "c", "(Lmq0/b;)Liq0/b;", "Lmq0/k;", "Liq0/k;", "i", "(Lmq0/k;)Liq0/k;", "Lmq0/h;", "Liq0/j;", "h", "(Lmq0/h;)Liq0/j;", "Lmq0/g;", "Liq0/g;", "g", "(Lmq0/g;)Liq0/g;", "Lmq0/p;", "Liq0/s;", "n", "(Lmq0/p;)Liq0/s;", "Lmq0/y;", "Liq0/l;", "j", "(Lmq0/y;)Liq0/l;", "Lmq0/x;", "", "index", "Liq0/m;", "k", "(Lmq0/x;I)Liq0/m;", "Lmq0/e0;", "Liq0/b0;", "w", "(Lmq0/e0;)Liq0/b0;", "Lmq0/a0;", "Liq0/e0;", "z", "(Lmq0/a0;)Liq0/e0;", "Lmq0/b0;", "Liq0/d0;", "y", "(Lmq0/b0;)Liq0/d0;", "Lmq0/d0;", "Liq0/c0;", "x", "(Lmq0/d0;)Liq0/c0;", "Lmq0/c0;", "Liq0/f0;", "A", "(Lmq0/c0;)Liq0/f0;", "Lmq0/z;", "Liq0/a0;", "v", "(Lmq0/z;)Liq0/a0;", "mobilesettingsservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: lq0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C2905a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f119401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f119402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f119403c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f119404d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f119405e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f119406f;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.CHATBOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.CONTACT_DETAILS_REGISTRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.ELECTRONIC_DELIVERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t.REGISTERED_ADDRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[t.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f119401a = iArr;
            int[] iArr2 = new int[w.values().length];
            try {
                iArr2[w.DEPUTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[w.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f119402b = iArr2;
            int[] iArr3 = new int[s.values().length];
            try {
                iArr3[s.NEW_DASHBOARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[s.PAYMENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[s.DASHBOARD_PAYMENTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[s.RATE_CONFIGURATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[s.CHATBOT.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[s.SENTRY_MOBILE.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[s.SEND_IDEA.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[s.ELECTRONIC_DELIVERY.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[s.CONTACT_DETAILS_REGISTRY.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[s.WHATS_NEW_ANNOUNCEMENTS.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[s.NEW_PUSH.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[s.NIPIP_CARD.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[s.NIL_CARD.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[s.KIRP_CARD.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[s.PASSPORT_DATA.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[s.TEMPORARY_SERVICE_INTERRUPTIONS.ordinal()] = 16;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[s.VOTE_IDEA.ordinal()] = 17;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[s.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 18;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[s.NEW_COMPANY_APPLICATION.ordinal()] = 19;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[s.TEACHER.ordinal()] = 20;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[s.BAILIFF.ordinal()] = 21;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[s.SECURITY_KNOWLEDGE_BASE.ordinal()] = 22;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr3[s.CIVIL_ENGINEER.ordinal()] = 23;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr3[s.ASYNC_GENERATE_DOCUMENTS.ordinal()] = 24;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr3[s.DIIA_PL_PESEL_ZOOM.ordinal()] = 25;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr3[s.COMPANY_SUSPENSION.ordinal()] = 26;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr3[s.NEW_ONLINE_SERVICES.ordinal()] = 27;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr3[s.TAX_ADVISOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr3[s.STAMP_DUTY_PAYMENTS.ordinal()] = 29;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr3[s.VEHICLE_CARD_UPDATE.ordinal()] = 30;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr3[s.DOCUMENTS_PHOTO.ordinal()] = 31;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr3[s.VEHICLE_COLLISION_REPORT_DAMAGE.ordinal()] = 32;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr3[s.REGISTERED_ADDRESS.ordinal()] = 33;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr3[s.APP_UPDATE_INFO.ordinal()] = 34;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr3[s.CONTACT_DETAILS_REGISTRY_WK_AUTH.ordinal()] = 35;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr3[s.PHYSICAL_ID_INVALIDATION_IDENTITY_THEFT.ordinal()] = 36;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr3[s.NEW_LAYOUT_STUDENT_CARD.ordinal()] = 37;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr3[s.V2_CHILD_ID_CARD_SUSPENSION.ordinal()] = 38;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr3[s.QUALIFIED_SIGNATURE_QR_CODE_SCANNER.ordinal()] = 39;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr3[s.PASSPORT_INVALIDATION_WITHOUT_EPUAP.ordinal()] = 40;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr3[s.VEHICLE_INSURANCE_VERIFICATION.ordinal()] = 41;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr3[s.GOOGLE_PAY.ordinal()] = 42;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr3[s.CHATBOT_DISCLAIMER_VISIBILITY.ordinal()] = 43;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr3[s.WIDGET_AIR_QUALITY.ordinal()] = 44;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr3[s.WIDGET_EPL.ordinal()] = 45;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr3[s.PHYSICAL_ID_EDOR_COMMUNICATION.ordinal()] = 46;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr3[s.PASSPORT_CHILD_APPLICATION_ONLINE_PAYMENTS.ordinal()] = 47;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr3[s.NATIVE_LOGIN_EDOR_MODULE_ANDROID.ordinal()] = 48;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr3[s.NATIVE_LOGIN_APP_SERVICES_MODULE_ANDROID.ordinal()] = 49;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr3[s.COMPANY_REPRESENTATIVES.ordinal()] = 50;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr3[s.TRAVEL_REGISTRATION_CONFIRMATION.ordinal()] = 51;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr3[s.WIDGETS.ordinal()] = 52;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr3[s.VEHICLE_INSURANCE_VERIFICATION_CONFIRMATION.ordinal()] = 53;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr3[s.VEHICLE_REGISTRATION.ordinal()] = 54;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr3[s.COMPANY_EMAIL_COLLECTING.ordinal()] = 55;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr3[s.NATIVE_LOGIN_EDOR_MODULE_WITH_ALL_PROCESSES_IOS.ordinal()] = 56;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr3[s.APPLE_PAY.ordinal()] = 57;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr3[s.CHATBOT_STREAM_MESSAGES.ordinal()] = 58;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr3[s.UNKNOWN.ordinal()] = 59;
            } catch (NoSuchFieldError unused66) {
            }
            f119403c = iArr3;
            int[] iArr4 = new int[n.values().length];
            try {
                iArr4[n.MY_CASES.ordinal()] = 1;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr4[n.PENALTY_POINTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr4[n.TRAIN_TICKETS.ordinal()] = 3;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr4[n.GAS_SUPPLEMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr4[n.ABROAD_INFO.ordinal()] = 5;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr4[n.MEDICAL_PRESCRIPTIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr4[n.ENVIRONMENTAL_VIOLATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr4[n.COAL_SUPPLEMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr4[n.ENERGY_LIMIT_STATEMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr4[n.SAFE_BUS.ordinal()] = 10;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr4[n.PESEL_RESTRICTION.ordinal()] = 11;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr4[n.MKA_CARD.ordinal()] = 12;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr4[n.PAYMENTS.ordinal()] = 13;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr4[n.E_VISIT_ZUS.ordinal()] = 14;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr4[n.VEHICLE_HISTORY.ordinal()] = 15;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr4[n.AIR_QUALITY.ordinal()] = 16;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr4[n.ELECTORAL_REGISTER.ordinal()] = 17;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr4[n.GIVE_ELECTORAL_SUPPORT.ordinal()] = 18;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr4[n.FINES.ordinal()] = 19;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr4[n.PESEL_RESTRICTION_VERIFICATION.ordinal()] = 20;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr4[n.DOCUMENT_SIGN.ordinal()] = 21;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr4[n.COMPANY.ordinal()] = 22;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr4[n.VEHICLE_COLLISION.ordinal()] = 23;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr4[n.NETWORK_SECURITY_ISSUES.ordinal()] = 24;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr4[n.ENERGY_VOUCHER.ordinal()] = 25;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr4[n.FLOOD_ALERT.ordinal()] = 26;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr4[n.APPLICATION_FORM_SERVICES.ordinal()] = 27;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr4[n.DRIVER_QUALIFICATIONS.ordinal()] = 28;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr4[n.DOCUMENT_RESTRICTION.ordinal()] = 29;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr4[n.ID_CARD_VERIFICATION.ordinal()] = 30;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr4[n.ID_CARD_COLLECTING.ordinal()] = 31;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr4[n.MY_IKP.ordinal()] = 32;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr4[n.DEFENCE_TRAINING.ordinal()] = 33;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr4[n.QUALIFIED_SIGNATURE.ordinal()] = 34;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr4[n.VEHICLE_INSURANCE_VERIFICATION.ordinal()] = 35;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr4[n.LAND_REGISTER.ordinal()] = 36;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr4[n.KRS_DATA.ordinal()] = 37;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr4[n.MILITARY_ALERT.ordinal()] = 38;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr4[n.SAFETY_GUIDE.ordinal()] = 39;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr4[n.PASSPORT_PICKUP.ordinal()] = 40;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                iArr4[n.INTERNET_ACCESS.ordinal()] = 41;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                iArr4[n.TRAVEL_ABROAD.ordinal()] = 42;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                iArr4[n.JUNIOR_SCHOOL_EDUCATION.ordinal()] = 43;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                iArr4[n.SANITARY_VIOLATION.ordinal()] = 44;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                iArr4[n.VEHICLE_REGISTRATION.ordinal()] = 45;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                iArr4[n.EUROPE_READINESS.ordinal()] = 46;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                iArr4[n.RCB_ALERT.ordinal()] = 47;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                iArr4[n.UNKNOWN.ordinal()] = 48;
            } catch (NoSuchFieldError unused114) {
            }
            f119404d = iArr4;
            int[] iArr5 = new int[b.values().length];
            try {
                iArr5[b.PESEL_RESTRICTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                iArr5[b.AIR_QUALITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                iArr5[b.VEHICLE_HISTORY.ordinal()] = 3;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                iArr5[b.MY_CASES.ordinal()] = 4;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                iArr5[b.PESEL_RESTRICTION_VERIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                iArr5[b.MEDICAL_PRESCRIPTIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused120) {
            }
            try {
                iArr5[b.SAFE_BUS.ordinal()] = 7;
            } catch (NoSuchFieldError unused121) {
            }
            try {
                iArr5[b.ELECTORAL_REGISTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused122) {
            }
            try {
                iArr5[b.GIVE_ELECTORAL_SUPPORT.ordinal()] = 9;
            } catch (NoSuchFieldError unused123) {
            }
            try {
                iArr5[b.TRAIN_TICKETS.ordinal()] = 10;
            } catch (NoSuchFieldError unused124) {
            }
            try {
                iArr5[b.ENVIRONMENTAL_VIOLATION.ordinal()] = 11;
            } catch (NoSuchFieldError unused125) {
            }
            try {
                iArr5[b.ABROAD_INFO.ordinal()] = 12;
            } catch (NoSuchFieldError unused126) {
            }
            try {
                iArr5[b.PAYMENTS.ordinal()] = 13;
            } catch (NoSuchFieldError unused127) {
            }
            try {
                iArr5[b.GAS_SUPPLEMENT.ordinal()] = 14;
            } catch (NoSuchFieldError unused128) {
            }
            try {
                iArr5[b.ENERGY_LIMIT_STATEMENT.ordinal()] = 15;
            } catch (NoSuchFieldError unused129) {
            }
            try {
                iArr5[b.COAL_SUPPLEMENT.ordinal()] = 16;
            } catch (NoSuchFieldError unused130) {
            }
            try {
                iArr5[b.MKA_CARD.ordinal()] = 17;
            } catch (NoSuchFieldError unused131) {
            }
            try {
                iArr5[b.E_VISIT_ZUS.ordinal()] = 18;
            } catch (NoSuchFieldError unused132) {
            }
            try {
                iArr5[b.PENALTY_POINTS.ordinal()] = 19;
            } catch (NoSuchFieldError unused133) {
            }
            try {
                iArr5[b.FINES.ordinal()] = 20;
            } catch (NoSuchFieldError unused134) {
            }
            try {
                iArr5[b.MOBILE_ID_CARD.ordinal()] = 21;
            } catch (NoSuchFieldError unused135) {
            }
            try {
                iArr5[b.DRIVING_LICENCE.ordinal()] = 22;
            } catch (NoSuchFieldError unused136) {
            }
            try {
                iArr5[b.TEMPORARY_DRIVING_LICENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused137) {
            }
            try {
                iArr5[b.VEHICLE_CARD.ordinal()] = 24;
            } catch (NoSuchFieldError unused138) {
            }
            try {
                iArr5[b.FAMILY_CARD.ordinal()] = 25;
            } catch (NoSuchFieldError unused139) {
            }
            try {
                iArr5[b.DIIA.ordinal()] = 26;
            } catch (NoSuchFieldError unused140) {
            }
            try {
                iArr5[b.SCHOOL_STUDENT_CARD.ordinal()] = 27;
            } catch (NoSuchFieldError unused141) {
            }
            try {
                iArr5[b.UNIVERSITY_STUDENT_CARD.ordinal()] = 28;
            } catch (NoSuchFieldError unused142) {
            }
            try {
                iArr5[b.PENSIONER.ordinal()] = 29;
            } catch (NoSuchFieldError unused143) {
            }
            try {
                iArr5[b.UUT_CARD.ordinal()] = 30;
            } catch (NoSuchFieldError unused144) {
            }
            try {
                iArr5[b.DEPUTY.ordinal()] = 31;
            } catch (NoSuchFieldError unused145) {
            }
            try {
                iArr5[b.ADVOCATE.ordinal()] = 32;
            } catch (NoSuchFieldError unused146) {
            }
            try {
                iArr5[b.NURSE.ordinal()] = 33;
            } catch (NoSuchFieldError unused147) {
            }
            try {
                iArr5[b.DOCTOR.ordinal()] = 34;
            } catch (NoSuchFieldError unused148) {
            }
            try {
                iArr5[b.DENTIST.ordinal()] = 35;
            } catch (NoSuchFieldError unused149) {
            }
            try {
                iArr5[b.MIDWIFE.ordinal()] = 36;
            } catch (NoSuchFieldError unused150) {
            }
            try {
                iArr5[b.OTHER.ordinal()] = 37;
            } catch (NoSuchFieldError unused151) {
            }
            try {
                iArr5[b.DOCUMENT_SIGN.ordinal()] = 38;
            } catch (NoSuchFieldError unused152) {
            }
            try {
                iArr5[b.COMPANY.ordinal()] = 39;
            } catch (NoSuchFieldError unused153) {
            }
            try {
                iArr5[b.NETWORK_SECURITY_ISSUES.ordinal()] = 40;
            } catch (NoSuchFieldError unused154) {
            }
            try {
                iArr5[b.ENERGY_VOUCHER.ordinal()] = 41;
            } catch (NoSuchFieldError unused155) {
            }
            try {
                iArr5[b.VEHICLE_COLLISION.ordinal()] = 42;
            } catch (NoSuchFieldError unused156) {
            }
            try {
                iArr5[b.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 43;
            } catch (NoSuchFieldError unused157) {
            }
            try {
                iArr5[b.TEACHER.ordinal()] = 44;
            } catch (NoSuchFieldError unused158) {
            }
            try {
                iArr5[b.BAILIFF.ordinal()] = 45;
            } catch (NoSuchFieldError unused159) {
            }
            try {
                iArr5[b.APPLICATION_FORM_SERVICES.ordinal()] = 46;
            } catch (NoSuchFieldError unused160) {
            }
            try {
                iArr5[b.CIVIL_ENGINEER.ordinal()] = 47;
            } catch (NoSuchFieldError unused161) {
            }
            try {
                iArr5[b.FLOOD_ALERT.ordinal()] = 48;
            } catch (NoSuchFieldError unused162) {
            }
            try {
                iArr5[b.COVID_CERTIFICATE.ordinal()] = 49;
            } catch (NoSuchFieldError unused163) {
            }
            try {
                iArr5[b.QUALIFIED_SIGNATURE.ordinal()] = 50;
            } catch (NoSuchFieldError unused164) {
            }
            try {
                iArr5[b.ATTORNEY_AT_LAW.ordinal()] = 51;
            } catch (NoSuchFieldError unused165) {
            }
            try {
                iArr5[b.TRAINEE_ATTORNEY_AT_LAW.ordinal()] = 52;
            } catch (NoSuchFieldError unused166) {
            }
            try {
                iArr5[b.DRIVER_QUALIFICATIONS.ordinal()] = 53;
            } catch (NoSuchFieldError unused167) {
            }
            try {
                iArr5[b.TAX_ADVISOR.ordinal()] = 54;
            } catch (NoSuchFieldError unused168) {
            }
            try {
                iArr5[b.DOCUMENT_RESTRICTION.ordinal()] = 55;
            } catch (NoSuchFieldError unused169) {
            }
            try {
                iArr5[b.ID_CARD_VERIFICATION.ordinal()] = 56;
            } catch (NoSuchFieldError unused170) {
            }
            try {
                iArr5[b.ID_CARD_COLLECTING.ordinal()] = 57;
            } catch (NoSuchFieldError unused171) {
            }
            try {
                iArr5[b.AUDITOR.ordinal()] = 58;
            } catch (NoSuchFieldError unused172) {
            }
            try {
                iArr5[b.MY_IKP.ordinal()] = 59;
            } catch (NoSuchFieldError unused173) {
            }
            try {
                iArr5[b.DEFENCE_TRAINING.ordinal()] = 60;
            } catch (NoSuchFieldError unused174) {
            }
            try {
                iArr5[b.ELECTRONIC_DELIVERY.ordinal()] = 61;
            } catch (NoSuchFieldError unused175) {
            }
            try {
                iArr5[b.VEHICLE_INSURANCE_VERIFICATION.ordinal()] = 62;
            } catch (NoSuchFieldError unused176) {
            }
            try {
                iArr5[b.LAND_REGISTER.ordinal()] = 63;
            } catch (NoSuchFieldError unused177) {
            }
            try {
                iArr5[b.SOLIDARITY_CARD.ordinal()] = 64;
            } catch (NoSuchFieldError unused178) {
            }
            try {
                iArr5[b.KRS_DATA.ordinal()] = 65;
            } catch (NoSuchFieldError unused179) {
            }
            try {
                iArr5[b.MILITARY_ALERT.ordinal()] = 66;
            } catch (NoSuchFieldError unused180) {
            }
            try {
                iArr5[b.SAFETY_GUIDE.ordinal()] = 67;
            } catch (NoSuchFieldError unused181) {
            }
            try {
                iArr5[b.PASSPORT_PICKUP.ordinal()] = 68;
            } catch (NoSuchFieldError unused182) {
            }
            try {
                iArr5[b.PHD_STUDENT.ordinal()] = 69;
            } catch (NoSuchFieldError unused183) {
            }
            try {
                iArr5[b.INTERNET_ACCESS.ordinal()] = 70;
            } catch (NoSuchFieldError unused184) {
            }
            try {
                iArr5[b.TRAVEL_ABROAD.ordinal()] = 71;
            } catch (NoSuchFieldError unused185) {
            }
            try {
                iArr5[b.JUNIOR_SCHOOL_EDUCATION.ordinal()] = 72;
            } catch (NoSuchFieldError unused186) {
            }
            try {
                iArr5[b.PHYSIOTHERAPIST.ordinal()] = 73;
            } catch (NoSuchFieldError unused187) {
            }
            try {
                iArr5[b.PHARMACIST.ordinal()] = 74;
            } catch (NoSuchFieldError unused188) {
            }
            try {
                iArr5[b.SANITARY_VIOLATION.ordinal()] = 75;
            } catch (NoSuchFieldError unused189) {
            }
            try {
                iArr5[b.SHOOTING_LICENCE.ordinal()] = 76;
            } catch (NoSuchFieldError unused190) {
            }
            try {
                iArr5[b.SPORT_SHOOTING_COMPETITOR_LICENCE.ordinal()] = 77;
            } catch (NoSuchFieldError unused191) {
            }
            try {
                iArr5[b.SPORT_SHOOTING_COACH_LICENCE.ordinal()] = 78;
            } catch (NoSuchFieldError unused192) {
            }
            try {
                iArr5[b.SPORT_SHOOTING_INSTRUCTOR_LICENCE.ordinal()] = 79;
            } catch (NoSuchFieldError unused193) {
            }
            try {
                iArr5[b.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING.ordinal()] = 80;
            } catch (NoSuchFieldError unused194) {
            }
            try {
                iArr5[b.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING.ordinal()] = 81;
            } catch (NoSuchFieldError unused195) {
            }
            try {
                iArr5[b.SPORT_SHOOTING_RANGE_OFFICER_LICENCE.ordinal()] = 82;
            } catch (NoSuchFieldError unused196) {
            }
            try {
                iArr5[b.ELECTRONIC_DIPLOMA_GRADUATION.ordinal()] = 83;
            } catch (NoSuchFieldError unused197) {
            }
            try {
                iArr5[b.ELECTRONIC_DIPLOMA_PHD.ordinal()] = 84;
            } catch (NoSuchFieldError unused198) {
            }
            try {
                iArr5[b.ELECTRONIC_DIPLOMA_DSC.ordinal()] = 85;
            } catch (NoSuchFieldError unused199) {
            }
            try {
                iArr5[b.LABORATORY_DIAGNOSTICIAN.ordinal()] = 86;
            } catch (NoSuchFieldError unused200) {
            }
            try {
                iArr5[b.PENSIONER_MSWIA.ordinal()] = 87;
            } catch (NoSuchFieldError unused201) {
            }
            try {
                iArr5[b.VEHICLE_REGISTRATION.ordinal()] = 88;
            } catch (NoSuchFieldError unused202) {
            }
            try {
                iArr5[b.EUROPE_READINESS.ordinal()] = 89;
            } catch (NoSuchFieldError unused203) {
            }
            try {
                iArr5[b.RCB_ALERT.ordinal()] = 90;
            } catch (NoSuchFieldError unused204) {
            }
            try {
                iArr5[b.UNKNOWN.ordinal()] = 91;
            } catch (NoSuchFieldError unused205) {
            }
            f119405e = iArr5;
            int[] iArr6 = new int[z.values().length];
            try {
                iArr6[z.PL.ordinal()] = 1;
            } catch (NoSuchFieldError unused206) {
            }
            try {
                iArr6[z.EN.ordinal()] = 2;
            } catch (NoSuchFieldError unused207) {
            }
            try {
                iArr6[z.UK.ordinal()] = 3;
            } catch (NoSuchFieldError unused208) {
            }
            try {
                iArr6[z.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused209) {
            }
            f119406f = iArr6;
        }
    }

    public static final SearchTagsWithLanguage A(SearchTagsByLanguage searchTagsByLanguage) {
        return new SearchTagsWithLanguage(v(searchTagsByLanguage.getLanguage()), searchTagsByLanguage.b());
    }

    public static final TemporaryInterruption B(TemporaryInterruptionDto temporaryInterruptionDto) {
        return new TemporaryInterruption(temporaryInterruptionDto.getTitle(), temporaryInterruptionDto.getMessage(), temporaryInterruptionDto.getDisplayUntil());
    }

    public static final TrustedCertificates C(TrustedCertificatesDto trustedCertificatesDto) {
        List<DomainCertificatesDto> listA = trustedCertificatesDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(a((DomainCertificatesDto) it.next()));
        }
        return new TrustedCertificates(arrayList);
    }

    public static final c D(n nVar) {
        switch (C2905a.f119404d[nVar.ordinal()]) {
            case 1:
                return c.MY_CASES;
            case 2:
                return c.PENALTY_POINTS;
            case 3:
                return c.TRAIN_TICKETS;
            case 4:
                return c.GAS_SUPPLEMENT;
            case 5:
                return c.ABROAD_INFO;
            case 6:
                return c.MEDICAL_PRESCRIPTIONS;
            case 7:
                return c.GIOS;
            case 8:
                return c.COAL_SUPPLEMENT;
            case 9:
                return c.ENERGY_LIMIT_STATEMENT;
            case 10:
                return c.SAFE_BUS;
            case 11:
                return c.PESEL_RESTRICTION;
            case 12:
                return c.CRACOW_CITY_CARD;
            case 13:
                return c.E_PAYMENTS;
            case 14:
                return c.ZUS_VISIT;
            case 15:
                return c.VEHICLE_HISTORY;
            case 16:
                return c.AIR_QUALITY;
            case 17:
                return c.ELECTORAL_REGISTER;
            case 18:
                return c.GIVE_ELECTORAL_SUPPORT;
            case 19:
                return c.FINES;
            case 20:
                return c.PESEL_RESTRICTION_VERIFICATION;
            case 21:
                return c.DOCUMENT_SIGNING;
            case 22:
                return c.COMPANY;
            case 23:
                return c.VEHICLE_COLLISION;
            case 24:
                return c.NETWORK_SECURITY_ISSUES;
            case 25:
                return c.ENERGY_VOUCHER;
            case 26:
                return c.FLOOD_ALERT;
            case 27:
                return c.APPLICATION_FORM_SERVICES;
            case 28:
                return c.DRIVER_QUALIFICATIONS;
            case 29:
                return c.DOCUMENT_RESTRICTION;
            case 30:
                return c.ID_CARD_VERIFICATION;
            case BERTags.DATE /* 31 */:
                return c.ID_CARD_COLLECTING;
            case 32:
                return c.MY_IKP;
            case 33:
                return c.DEFENCE_TRAINING;
            case 34:
                return c.QUALIFIED_SIGNATURE;
            case 35:
                return c.CHECK_VEHICLE_INSURANCE;
            case 36:
                return c.LAND_REGISTRY;
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                return c.NATIONAL_COURT_REGISTER;
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                return c.MILITARY_ALERT;
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                return c.SAFETY_GUIDE;
            case 40:
                return c.PASSPORT_PICKUP;
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                return c.INTERNET_ACCESS;
            case EACTags.CURRENCY_CODE /* 42 */:
                return c.TRAVEL_ABROAD;
            case EACTags.DATE_OF_BIRTH /* 43 */:
                return c.JUNIOR_SCHOOL_EDUCATION;
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                return c.SANITARY_VIOLATION;
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                return c.VEHICLE_REGISTRATION;
            case 46:
                return c.EUROPE_READINESS;
            case 47:
            case 48:
                return c.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final DomainCertificates a(DomainCertificatesDto domainCertificatesDto) {
        String domain = domainCertificatesDto.getDomain();
        List<String> listA = domainCertificatesDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(ry.a.a(ry.a.b(c0.g((String) it.next()))));
        }
        return new DomainCertificates(domain, arrayList);
    }

    public static final Announcement b(AnnouncementDto announcementDto) {
        return new Announcement(announcementDto.getId(), announcementDto.getTitle(), announcementDto.getDescription(), c(announcementDto.getType()));
    }

    public static final iq0.b c(b bVar) {
        switch (C2905a.f119405e[bVar.ordinal()]) {
            case 1:
                return iq0.b.PESEL_RESTRICTION;
            case 2:
                return iq0.b.AIR_QUALITY;
            case 3:
                return iq0.b.VEHICLE_HISTORY;
            case 4:
                return iq0.b.MY_CASES;
            case 5:
                return iq0.b.PESEL_RESTRICTION_VERIFICATION;
            case 6:
                return iq0.b.MEDICAL_PRESCRIPTIONS;
            case 7:
                return iq0.b.SAFE_BUS;
            case 8:
                return iq0.b.ELECTORAL_REGISTER;
            case 9:
                return iq0.b.GIVE_ELECTORAL_SUPPORT;
            case 10:
                return iq0.b.TRAIN_TICKETS;
            case 11:
                return iq0.b.ENVIRONMENTAL_VIOLATION;
            case 12:
                return iq0.b.ABROAD_INFO;
            case 13:
                return iq0.b.PAYMENTS;
            case 14:
                return iq0.b.GAS_SUPPLEMENT;
            case 15:
                return iq0.b.ENERGY_LIMIT_STATEMENT;
            case 16:
                return iq0.b.COAL_SUPPLEMENT;
            case 17:
                return iq0.b.MKA_CARD;
            case 18:
                return iq0.b.E_VISIT_ZUS;
            case 19:
                return iq0.b.PENALTY_POINTS;
            case 20:
                return iq0.b.FINES;
            case 21:
                return iq0.b.MOBILE_ID_CARD;
            case 22:
                return iq0.b.DRIVING_LICENCE;
            case 23:
                return iq0.b.TEMPORARY_DRIVING_LICENCE;
            case 24:
                return iq0.b.VEHICLE_CARD;
            case 25:
                return iq0.b.FAMILY_CARD;
            case 26:
                return iq0.b.DIIA;
            case 27:
                return iq0.b.SCHOOL_STUDENT_CARD;
            case 28:
                return iq0.b.UNIVERSITY_STUDENT_CARD;
            case 29:
                return iq0.b.PENSIONER;
            case 30:
                return iq0.b.UUT_CARD;
            case BERTags.DATE /* 31 */:
                return iq0.b.DEPUTY;
            case 32:
                return iq0.b.ADVOCATE;
            case 33:
                return iq0.b.NURSE;
            case 34:
                return iq0.b.DOCTOR;
            case 35:
                return iq0.b.DENTIST;
            case 36:
                return iq0.b.MIDWIFE;
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                return iq0.b.OTHER;
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                return iq0.b.DOCUMENT_SIGN;
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                return iq0.b.COMPANY;
            case 40:
                return iq0.b.NETWORK_SECURITY_ISSUES;
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                return iq0.b.ENERGY_VOUCHER;
            case EACTags.CURRENCY_CODE /* 42 */:
                return iq0.b.VEHICLE_COLLISION;
            case EACTags.DATE_OF_BIRTH /* 43 */:
                return iq0.b.DISABLED_PERSON_IDENTIFICATION_CARD;
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                return iq0.b.TEACHER;
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                return iq0.b.BAILIFF;
            case 46:
                return iq0.b.APPLICATION_FORM_SERVICES;
            case 47:
                return iq0.b.CIVIL_ENGINEER;
            case 48:
                return iq0.b.FLOOD_ALERT;
            case 49:
                return iq0.b.UNKNOWN;
            case 50:
                return iq0.b.QUALIFIED_SIGNATURE;
            case EACTags.TRANSACTION_DATE /* 51 */:
                return iq0.b.ATTORNEY_AT_LAW;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                return iq0.b.TRAINEE_ATTORNEY_AT_LAW;
            case 53:
                return iq0.b.DRIVER_QUALIFICATIONS;
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                return iq0.b.TAX_ADVISOR;
            case 55:
                return iq0.b.DOCUMENT_RESTRICTION;
            case 56:
                return iq0.b.ID_CARD_VERIFICATION;
            case 57:
                return iq0.b.ID_CARD_COLLECTING;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                return iq0.b.AUDITOR;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                return iq0.b.MY_IKP;
            case 60:
                return iq0.b.DEFENCE_TRAINING;
            case 61:
                return iq0.b.ELECTRONIC_DELIVERY;
            case 62:
                return iq0.b.CHECK_VEHICLE_INSURANCE;
            case 63:
                return iq0.b.LAND_REGISTRY;
            case 64:
                return iq0.b.SOLIDARITY_CARD;
            case 65:
                return iq0.b.NATIONAL_COURT_REGISTER;
            case 66:
                return iq0.b.MILITARY_ALERT;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                return iq0.b.SAFETY_GUIDE;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                return iq0.b.PASSPORT_PICKUP;
            case EACTags.DISPLAY_IMAGE /* 69 */:
                return iq0.b.PHD_STUDENT;
            case 70:
                return iq0.b.INTERNET_ACCESS;
            case EACTags.MESSAGE_REFERENCE /* 71 */:
                return iq0.b.TRAVEL_ABROAD;
            case 72:
                return iq0.b.JUNIOR_SCHOOL_EDUCATION;
            case 73:
                return iq0.b.PHYSIOTHERAPIST;
            case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                return iq0.b.PHARMACIST;
            case EACTags.DEPRECATED /* 75 */:
                return iq0.b.SANITARY_VIOLATION;
            case 76:
                return iq0.b.SHOOTING_LICENCE;
            case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                return iq0.b.SPORT_SHOOTING_COMPETITOR_LICENCE;
            case 78:
                return iq0.b.SPORT_SHOOTING_COACH_LICENCE;
            case 79:
                return iq0.b.SPORT_SHOOTING_INSTRUCTOR_LICENCE;
            case EACTags.UNIFORM_RESOURCE_LOCATOR /* 80 */:
                return iq0.b.SPORT_SHOOTING_REFEREE_LICENCE_STATIC_SHOOTING;
            case EACTags.ANSWER_TO_RESET /* 81 */:
                return iq0.b.SPORT_SHOOTING_REFEREE_LICENCE_DYNAMIC_SHOOTING;
            case EACTags.HISTORICAL_BYTES /* 82 */:
                return iq0.b.SPORT_SHOOTING_RANGE_OFFICER_LICENCE;
            case 83:
                return iq0.b.ELECTRONIC_DIPLOMA_GRADUATION;
            case 84:
                return iq0.b.ELECTRONIC_DIPLOMA_PHD;
            case 85:
                return iq0.b.ELECTRONIC_DIPLOMA_DSC;
            case 86:
                return iq0.b.LABORATORY_DIAGNOSTICIAN;
            case 87:
                return iq0.b.PENSIONER_MSWIA;
            case 88:
                return iq0.b.VEHICLE_REGISTRATION;
            case 89:
                return iq0.b.EUROPE_READINESS;
            case 90:
            case 91:
                return iq0.b.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final Announcements d(AnnouncementsDto announcementsDto) {
        List<AnnouncementDto> listA = announcementsDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(b((AnnouncementDto) it.next()));
        }
        return new Announcements(arrayList);
    }

    public static final AnonymousFeatureFlag e(AnonymousFeatureFlagDto anonymousFeatureFlagDto) {
        return new AnonymousFeatureFlag(e.INSTANCE.a(anonymousFeatureFlagDto.getType().getValue()), anonymousFeatureFlagDto.getFeatureActive());
    }

    public static final AnonymousFeatureFlags f(AnonymousFeatureFlagsDto anonymousFeatureFlagsDto) {
        List<AnonymousFeatureFlagDto> listA = anonymousFeatureFlagsDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(e((AnonymousFeatureFlagDto) it.next()));
        }
        return new AnonymousFeatureFlags(arrayList);
    }

    public static final ApplicationFormServiceEntry g(ApplicationFormServiceEntryDto applicationFormServiceEntryDto) {
        String description = applicationFormServiceEntryDto.getDescription();
        String name = applicationFormServiceEntryDto.getName();
        i iVarA = i.INSTANCE.a(applicationFormServiceEntryDto.getType().getValue());
        mq0.i nativeType = applicationFormServiceEntryDto.getNativeType();
        return new ApplicationFormServiceEntry(description, name, iVarA, nativeType != null ? h.INSTANCE.a(nativeType.getValue()) : null, applicationFormServiceEntryDto.getSupplementOrigin(), applicationFormServiceEntryDto.getWebUrl());
    }

    public static final ApplicationFormServiceGroup h(ApplicationFormServiceGroupDto applicationFormServiceGroupDto) {
        String description = applicationFormServiceGroupDto.getDescription();
        String icon = applicationFormServiceGroupDto.getIcon();
        String name = applicationFormServiceGroupDto.getName();
        List<ApplicationFormServiceEntryDto> listD = applicationFormServiceGroupDto.d();
        ArrayList arrayList = new ArrayList(v.y(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(g((ApplicationFormServiceEntryDto) it.next()));
        }
        return new ApplicationFormServiceGroup(description, icon, name, arrayList);
    }

    public static final ApplicationFormServices i(ApplicationFormServicesDto applicationFormServicesDto) {
        List<ApplicationFormServiceGroupDto> listA = applicationFormServicesDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(h((ApplicationFormServiceGroupDto) it.next()));
        }
        return new ApplicationFormServices(arrayList);
    }

    public static final BESearchConfig j(SearchConfigDto searchConfigDto) {
        String searchTagsChecksum = searchConfigDto.getSearchTagsChecksum();
        List<SearchConfigDocumentOrService> listA = searchConfigDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        int i15 = 0;
        int i16 = 0;
        for (Object obj : listA) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                v.x();
            }
            arrayList.add(k((SearchConfigDocumentOrService) obj, i16));
            i16 = i17;
        }
        List<SearchConfigDocumentOrService> listB = searchConfigDto.b();
        ArrayList arrayList2 = new ArrayList(v.y(listB, 10));
        for (Object obj2 : listB) {
            int i18 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            arrayList2.add(k((SearchConfigDocumentOrService) obj2, i15));
            i15 = i18;
        }
        return new BESearchConfig(searchTagsChecksum, new BESearchSections(arrayList, arrayList2));
    }

    public static final BESearchConfigSectionItem k(SearchConfigDocumentOrService searchConfigDocumentOrService, int i15) {
        return new BESearchConfigSectionItem(i15, searchConfigDocumentOrService.getDashboardServiceType(), searchConfigDocumentOrService.getDocumentType(), searchConfigDocumentOrService.getSubtype());
    }

    public static final CategoryDashboardServices l(CategoryDashboardServicesDto categoryDashboardServicesDto) {
        String name = categoryDashboardServicesDto.getName();
        List<DashboardServiceEntryDto> listB = categoryDashboardServicesDto.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(m((DashboardServiceEntryDto) it.next()));
        }
        return new CategoryDashboardServices(name, arrayList);
    }

    public static final DashboardServiceEntry m(DashboardServiceEntryDto dashboardServiceEntryDto) {
        String name = dashboardServiceEntryDto.getName();
        c cVarD = D(dashboardServiceEntryDto.getType());
        String supplementOrigin = dashboardServiceEntryDto.getSupplementOrigin();
        String webUrl = dashboardServiceEntryDto.getWebUrl();
        TemporaryInterruptionDto temporaryInterruption = dashboardServiceEntryDto.getTemporaryInterruption();
        return new DashboardServiceEntry(name, cVarD, supplementOrigin, webUrl, null, temporaryInterruption != null ? B(temporaryInterruption) : null, 16, null);
    }

    public static final EnvironmentViolationImageSettings n(EnvironmentViolationImageSettingsDto environmentViolationImageSettingsDto) {
        return new EnvironmentViolationImageSettings(environmentViolationImageSettingsDto.getLongestSide(), environmentViolationImageSettingsDto.getQuality());
    }

    public static final FeatureEntry o(FeatureEntryDto featureEntryDto) {
        String name = featureEntryDto.getName();
        iq0.v vVarQ = q(featureEntryDto.getType());
        TemporaryInterruptionDto temporaryInterruption = featureEntryDto.getTemporaryInterruption();
        return new FeatureEntry(name, vVarQ, temporaryInterruption != null ? B(temporaryInterruption) : null);
    }

    public static final FeatureFlag p(FeatureFlagDto featureFlagDto) {
        return new FeatureFlag(t(featureFlagDto.getType()), featureFlagDto.getFeatureActive());
    }

    public static final iq0.v q(t tVar) {
        int i15 = C2905a.f119401a[tVar.ordinal()];
        if (i15 == 1) {
            return iq0.v.CHATBOT;
        }
        if (i15 == 2) {
            return iq0.v.CONTACT_DETAILS_REGISTRY;
        }
        if (i15 == 3) {
            return iq0.v.ELECTRONIC_DELIVERY;
        }
        if (i15 == 4) {
            return iq0.v.REGISTERED_ADDRESS;
        }
        if (i15 == 5) {
            return iq0.v.UNKNOWN;
        }
        throw new p();
    }

    public static final MobileSettings r(MobileSettingsDto mobileSettingsDto) {
        List listN;
        RateConfigurationEntry rateConfigurationEntryA;
        List<FeatureFlagDto> listA = mobileSettingsDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(p((FeatureFlagDto) it.next()));
        }
        List<CategoryDashboardServicesDto> listF = mobileSettingsDto.f();
        ArrayList arrayList2 = new ArrayList(v.y(listF, 10));
        Iterator<T> it4 = listF.iterator();
        while (it4.hasNext()) {
            arrayList2.add(l((CategoryDashboardServicesDto) it4.next()));
        }
        List<w> listD = mobileSettingsDto.d();
        if (listD != null) {
            List<w> list = listD;
            listN = new ArrayList(v.y(list, 10));
            Iterator<T> it5 = list.iterator();
            while (it5.hasNext()) {
                listN.add(u((w) it5.next()));
            }
        } else {
            listN = v.n();
        }
        RateConfigurationDto rateConfiguration = mobileSettingsDto.getRateConfiguration();
        if (rateConfiguration == null || (rateConfigurationEntryA = s(rateConfiguration)) == null) {
            rateConfigurationEntryA = RateConfigurationEntry.INSTANCE.a();
        }
        RateConfigurationEntry rateConfigurationEntry = rateConfigurationEntryA;
        Boolean updateRecommended = mobileSettingsDto.getUpdateRecommended();
        OffsetDateTime serverCurrentTime = mobileSettingsDto.getServerCurrentTime();
        List<FeatureEntryDto> listB = mobileSettingsDto.b();
        ArrayList arrayList3 = new ArrayList(v.y(listB, 10));
        Iterator<T> it6 = listB.iterator();
        while (it6.hasNext()) {
            arrayList3.add(o((FeatureEntryDto) it6.next()));
        }
        return new MobileSettings(arrayList, arrayList2, listN, rateConfigurationEntry, updateRecommended, serverCurrentTime, arrayList3);
    }

    public static final RateConfigurationEntry s(RateConfigurationDto rateConfigurationDto) {
        return new RateConfigurationEntry(rateConfigurationDto.getGracePeriodShort(), rateConfigurationDto.getGracePeriodMedium(), rateConfigurationDto.getGracePeriodLong(), rateConfigurationDto.getEmailAddress(), rateConfigurationDto.getRateSupported(), rateConfigurationDto.getNativeRateSupported());
    }

    public static final y t(s sVar) {
        switch (C2905a.f119403c[sVar.ordinal()]) {
            case 1:
                return y.NEW_DASHBOARD;
            case 2:
                return y.PAYMENTS;
            case 3:
                return y.DASHBOARD_PAYMENTS;
            case 4:
                return y.RATE_CONFIGURATION;
            case 5:
                return y.CHATBOT;
            case 6:
                return y.UNKNOWN;
            case 7:
                return y.SEND_IDEA;
            case 8:
                return y.ELECTRONIC_DELIVERY;
            case 9:
                return y.CONTACT_DETAILS_REGISTRY;
            case 10:
                return y.WHATS_NEW_ANNOUNCEMENTS;
            case 11:
                return y.UNKNOWN;
            case 12:
                return y.NIPIP_CARD;
            case 13:
                return y.NIL_CARD;
            case 14:
                return y.KIRP_CARD;
            case 15:
                return y.PASSPORT_DATA;
            case 16:
                return y.TEMPORARY_SERVICE_INTERRUPTIONS;
            case 17:
                return y.VOTE_IDEA;
            case 18:
                return y.DISABLED_PERSON_IDENTIFICATION_CARD;
            case 19:
                return y.NEW_COMPANY_APPLICATION;
            case 20:
                return y.TEACHER;
            case 21:
                return y.BAILIFF_CARD;
            case 22:
                return y.SECURITY_KNOWLEDGE_BASE;
            case 23:
                return y.CIVIL_ENGINEER;
            case 24:
                return y.ASYNC_GENERATE_DOCUMENTS;
            case 25:
                return y.DIIA_PL_PESEL_ZOOM;
            case 26:
                return y.COMPANY_SUSPENSION;
            case 27:
                return y.NEW_ONLINE_SERVICES;
            case 28:
                return y.TAX_ADVISOR;
            case 29:
                return y.STAMP_DUTY_PAYMENTS;
            case 30:
                return y.VEHICLE_CARD_UPDATE;
            case BERTags.DATE /* 31 */:
                return y.DOCUMENTS_PHOTO;
            case 32:
                return y.UNKNOWN;
            case 33:
                return y.REGISTERED_ADDRESS;
            case 34:
                return y.APP_UPDATE_INFO;
            case 35:
                return y.UNKNOWN;
            case 36:
                return y.PHYSICAL_ID_INVALIDATION_IDENTITY_THEFT;
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                return y.NEW_LAYOUT_STUDENT_CARD;
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                return y.V2_CHILD_ID_CARD_SUSPENSION;
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                return y.QUALIFIED_SIGNATURE_QR_CODE_SCANNER;
            case 40:
                return y.PASSPORT_INVALIDATION_WITHOUT_EPUAP;
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                return y.CHECK_VEHICLE_INSURANCE;
            case EACTags.CURRENCY_CODE /* 42 */:
                return y.GOOGLE_PAY;
            case EACTags.DATE_OF_BIRTH /* 43 */:
                return y.CHATBOT_DISCLAIMER_VISIBILITY;
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                return y.WIDGET_AIR_QUALITY;
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                return y.WIDGET_EPL;
            case 46:
                return y.PHYSICAL_ID_EDOR_COMMUNICATION;
            case 47:
                return y.PASSPORT_CHILD_APPLICATION_ONLINE_PAYMENTS;
            case 48:
                return y.NATIVE_LOGIN_EDOR_MODULE_ANDROID;
            case 49:
                return y.NATIVE_LOGIN_APP_SERVICES_MODULE_ANDROID;
            case 50:
                return y.COMPANY_REPRESENTATIVES;
            case EACTags.TRANSACTION_DATE /* 51 */:
                return y.TRAVEL_REGISTRATION_CONFIRMATION;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                return y.UNKNOWN;
            case 53:
                return y.VEHICLE_INSURANCE_VERIFICATION_CONFIRMATION;
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                return y.VEHICLE_REGISTRATION;
            case 55:
                return y.COMPANY_EMAIL_COLLECTING;
            case 56:
            case 57:
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                return y.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final iq0.z u(w wVar) {
        int i15 = C2905a.f119402b[wVar.ordinal()];
        if (i15 == 1) {
            return iq0.z.DEPUTY;
        }
        if (i15 == 2) {
            return iq0.z.UNKNOWN;
        }
        throw new p();
    }

    public static final a0 v(z zVar) {
        int i15 = C2905a.f119406f[zVar.ordinal()];
        if (i15 == 1) {
            return a0.PL;
        }
        if (i15 == 2) {
            return a0.EN;
        }
        if (i15 == 3) {
            return a0.UK;
        }
        if (i15 == 4) {
            return a0.UNKNOWN;
        }
        throw new p();
    }

    public static final SearchTags w(SearchTagsDto searchTagsDto) {
        String checksum = searchTagsDto.getChecksum();
        List<SearchTagsByDashboardServiceType> listB = searchTagsDto.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(z((SearchTagsByDashboardServiceType) it.next()));
        }
        List<SearchTagsByDocumentType> listC = searchTagsDto.c();
        ArrayList arrayList2 = new ArrayList(v.y(listC, 10));
        Iterator<T> it4 = listC.iterator();
        while (it4.hasNext()) {
            arrayList2.add(y((SearchTagsByDocumentType) it4.next()));
        }
        List<SearchTagsByMobileAppMenuSearchTagType> listD = searchTagsDto.d();
        ArrayList arrayList3 = new ArrayList(v.y(listD, 10));
        Iterator<T> it5 = listD.iterator();
        while (it5.hasNext()) {
            arrayList3.add(x((SearchTagsByMobileAppMenuSearchTagType) it5.next()));
        }
        return new SearchTags(checksum, arrayList, arrayList2, arrayList3);
    }

    public static final SearchTagsForAppMenuType x(SearchTagsByMobileAppMenuSearchTagType searchTagsByMobileAppMenuSearchTagType) {
        String type = searchTagsByMobileAppMenuSearchTagType.getType();
        List<SearchTagsByLanguage> listA = searchTagsByMobileAppMenuSearchTagType.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(A((SearchTagsByLanguage) it.next()));
        }
        return new SearchTagsForAppMenuType(type, arrayList);
    }

    public static final SearchTagsForDocumentType y(SearchTagsByDocumentType searchTagsByDocumentType) {
        String documentType = searchTagsByDocumentType.getDocumentType();
        List<SearchTagsByLanguage> listC = searchTagsByDocumentType.c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(A((SearchTagsByLanguage) it.next()));
        }
        return new SearchTagsForDocumentType(documentType, arrayList, searchTagsByDocumentType.getSubtype());
    }

    public static final SearchTagsForServiceType z(SearchTagsByDashboardServiceType searchTagsByDashboardServiceType) {
        String dashboardServiceType = searchTagsByDashboardServiceType.getDashboardServiceType();
        List<SearchTagsByLanguage> listB = searchTagsByDashboardServiceType.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(A((SearchTagsByLanguage) it.next()));
        }
        return new SearchTagsForServiceType(dashboardServiceType, arrayList);
    }
}
