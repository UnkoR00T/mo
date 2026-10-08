package xl0;

import al0.GroupedPassports;
import al0.InvalidatePassportRequest;
import al0.InvalidatedPassportResponse;
import al0.PassportDiplomaticData;
import al0.PassportRevocationData;
import al0.PassportVisualization;
import al0.m0;
import al0.o0;
import al0.q0;
import al0.r0;
import al0.s0;
import gm0.GroupedPassportV2Response;
import gm0.InvalidatePassportRequestV2Dto;
import gm0.InvalidatedPassportResponseDto;
import gm0.PassportDiplomaticDataV2Dto;
import gm0.PassportVisualizationRevocationV2Dto;
import gm0.PassportVisualizationV2Dto;
import gm0.g2;
import gm0.g5;
import gm0.i5;
import gm0.k5;
import gm0.l5;
import gm0.n5;
import iy.b0;
import iy.c0;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import oq.p;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004*\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t*\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0011\u0010\u0013\u001a\u00020\u0012*\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0011\u0010\u0017\u001a\u00020\u0016*\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0011\u0010\u001b\u001a\u00020\u001a*\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001f\u001a\u00020\u001e*\u00020\u001d¢\u0006\u0004\b\u001f\u0010 \u001a\u0011\u0010#\u001a\u00020\"*\u00020!¢\u0006\u0004\b#\u0010$\u001a\u0011\u0010'\u001a\u00020&*\u00020%¢\u0006\u0004\b'\u0010(\u001a\u0011\u0010+\u001a\u00020**\u00020)¢\u0006\u0004\b+\u0010,\u001a\u0011\u0010/\u001a\u00020.*\u00020-¢\u0006\u0004\b/\u00100¨\u00061"}, d2 = {"Lgm0/n2;", "Lal0/a0;", "a", "(Lgm0/n2;)Lal0/a0;", "", "Lgm0/p5;", "Lal0/t0;", "j", "(Ljava/util/List;)Ljava/util/List;", "Ldx/i;", "Ldx/b;", "i", "(Lgm0/p5;)Ldx/i;", "Lgm0/h5;", "Lal0/n0;", "d", "(Lgm0/h5;)Lal0/n0;", "Lgm0/o5;", "Lal0/p0;", "e", "(Lgm0/o5;)Lal0/p0;", "Lgm0/k5;", "Lal0/q0;", "f", "(Lgm0/k5;)Lal0/q0;", "Lgm0/g5;", "Lal0/m0;", "c", "(Lgm0/g5;)Lal0/m0;", "Lgm0/l5;", "Lal0/r0;", "g", "(Lgm0/l5;)Lal0/r0;", "Lgm0/n5;", "Lal0/s0;", "h", "(Lgm0/n5;)Lal0/s0;", "Lal0/o0;", "Lgm0/i5;", "l", "(Lal0/o0;)Lgm0/i5;", "Lal0/g0;", "Lgm0/r2;", "k", "(Lal0/g0;)Lgm0/r2;", "Lgm0/s2;", "Lal0/h0;", "b", "(Lgm0/s2;)Lal0/h0;", "documentmanagementservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f219300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f219301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f219302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f219303d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f219304e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f219305f;

        static {
            int[] iArr = new int[g2.values().length];
            try {
                iArr[g2.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g2.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g2.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f219300a = iArr;
            int[] iArr2 = new int[k5.values().length];
            try {
                iArr2[k5.PERSONALIZATION_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[k5.INVALIDITY_DECLARATION_CITIZENSHIP_MISSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[k5.INVALIDITY_DECLARATION_FORGERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[k5.INVALIDITY_DECLARATION_OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[k5.INVALIDITY_DECLARATION_WRONG_DATA.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[k5.INVALIDITY_DECLARATION_PERSONALIZATION_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[k5.UNAUTHORIZED_USING_PERSONAL_DATA.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[k5.CITIZEN_REQUEST.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[k5.OFFICE_REQUEST.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[k5.INVALID_DATA.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[k5.THIRD_PARTY_FOUND_DOCUMENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[k5.COMPLIANT.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[k5.EXPIRED.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[k5.DAMAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[k5.LOSS.ordinal()] = 15;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[k5.RENUNCIATION_OF_CITIZENSHIP.ordinal()] = 16;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[k5.LOSS_RIGHT_FOR_USING_PASSPORT.ordinal()] = 17;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[k5.TECHNICAL_FAULTS.ordinal()] = 18;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[k5.ISSUING_NEW_PASSPORT.ordinal()] = 19;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[k5.DIED.ordinal()] = 20;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[k5.DATA_CHANGED.ordinal()] = 21;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[k5.DATA_MIGRATION.ordinal()] = 22;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[k5.UNKNOWN.ordinal()] = 23;
            } catch (NoSuchFieldError unused26) {
            }
            f219301b = iArr2;
            int[] iArr3 = new int[g5.values().length];
            try {
                iArr3[g5.POL.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[g5.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            f219302c = iArr3;
            int[] iArr4 = new int[l5.values().length];
            try {
                iArr4[l5.REVOKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr4[l5.ISSUED_TO_CITIZEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr4[l5.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused31) {
            }
            f219303d = iArr4;
            int[] iArr5 = new int[n5.values().length];
            try {
                iArr5[n5.BIOMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr5[n5.BUSINESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr5[n5.DIPLOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr5[n5.TEMPORARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr5[n5.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused36) {
            }
            f219304e = iArr5;
            int[] iArr6 = new int[o0.values().length];
            try {
                iArr6[o0.Lost.ordinal()] = 1;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr6[o0.Damage.ordinal()] = 2;
            } catch (NoSuchFieldError unused38) {
            }
            f219305f = iArr6;
        }
    }

    public static final GroupedPassports a(GroupedPassportV2Response groupedPassportV2Response) {
        return new GroupedPassports(j(groupedPassportV2Response.b()), j(groupedPassportV2Response.a()));
    }

    public static final InvalidatedPassportResponse b(InvalidatedPassportResponseDto invalidatedPassportResponseDto) {
        return new InvalidatedPassportResponse(new fz.b.LocalDate(invalidatedPassportResponseDto.getInvalidationDate()), invalidatedPassportResponseDto.getNumber());
    }

    public static final m0 c(g5 g5Var) {
        int i15 = a.f219302c[g5Var.ordinal()];
        if (i15 == 1) {
            return m0.POL;
        }
        if (i15 == 2) {
            return m0.UNKNOWN;
        }
        throw new p();
    }

    public static final PassportDiplomaticData d(PassportDiplomaticDataV2Dto passportDiplomaticDataV2Dto) {
        String title = passportDiplomaticDataV2Dto.getTitle();
        String body = passportDiplomaticDataV2Dto.getBody();
        String number = passportDiplomaticDataV2Dto.getNumber();
        LocalDate personalizationDate = passportDiplomaticDataV2Dto.getPersonalizationDate();
        return new PassportDiplomaticData(title, body, number, personalizationDate != null ? new fz.b.LocalDate(personalizationDate) : null, passportDiplomaticDataV2Dto.getCityAndDate());
    }

    public static final PassportRevocationData e(PassportVisualizationRevocationV2Dto passportVisualizationRevocationV2Dto) {
        OffsetDateTime revocationDate = passportVisualizationRevocationV2Dto.getRevocationDate();
        fz.b.OffsetDateTime offsetDateTime = revocationDate != null ? new fz.b.OffsetDateTime(revocationDate) : null;
        k5 revocationReason = passportVisualizationRevocationV2Dto.getRevocationReason();
        return new PassportRevocationData(offsetDateTime, revocationReason != null ? f(revocationReason) : null);
    }

    public static final q0 f(k5 k5Var) {
        switch (a.f219301b[k5Var.ordinal()]) {
            case 1:
                return q0.PERSONALIZATION_ERROR;
            case 2:
                return q0.INVALIDITY_DECLARATION_CITIZENSHIP_MISSING;
            case 3:
                return q0.INVALIDITY_DECLARATION_FORGERY;
            case 4:
                return q0.INVALIDITY_DECLARATION_OTHER;
            case 5:
                return q0.INVALIDITY_DECLARATION_WRONG_DATA;
            case 6:
                return q0.INVALIDITY_DECLARATION_PERSONALIZATION_ERROR;
            case 7:
                return q0.UNAUTHORIZED_USING_PERSONAL_DATA;
            case 8:
                return q0.CITIZEN_REQUEST;
            case 9:
                return q0.OFFICE_REQUEST;
            case 10:
                return q0.INVALID_DATA;
            case 11:
                return q0.THIRD_PARTY_FOUND_DOCUMENT;
            case 12:
                return q0.COMPLIANT;
            case 13:
                return q0.EXPIRED;
            case 14:
                return q0.DAMAGE;
            case 15:
                return q0.LOSS;
            case 16:
                return q0.RENUNCIATION_OF_CITIZENSHIP;
            case 17:
                return q0.LOSS_RIGHT_FOR_USING_PASSPORT;
            case 18:
                return q0.TECHNICAL_FAULTS;
            case 19:
                return q0.ISSUING_NEW_PASSPORT;
            case 20:
                return q0.DIED;
            case 21:
                return q0.DATA_CHANGED;
            case 22:
                return q0.DATA_MIGRATION;
            case 23:
                return q0.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final r0 g(l5 l5Var) {
        int i15 = a.f219303d[l5Var.ordinal()];
        if (i15 == 1) {
            return r0.REVOKED;
        }
        if (i15 == 2) {
            return r0.ISSUED_TO_CITIZEN;
        }
        if (i15 == 3) {
            return r0.UNKNOWN;
        }
        throw new p();
    }

    public static final s0 h(n5 n5Var) {
        int i15 = a.f219304e[n5Var.ordinal()];
        if (i15 == 1) {
            return s0.BIOMETRIC;
        }
        if (i15 == 2) {
            return s0.BUSINESS;
        }
        if (i15 == 3) {
            return s0.DIPLOMATIC;
        }
        if (i15 == 4) {
            return s0.TEMPORARY;
        }
        if (i15 == 5) {
            return s0.UNKNOWN;
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007f A[Catch: Exception -> 0x0017, c -> 0x001a, CancellationException -> 0x001d, TryCatch #2 {Exception -> 0x0017, blocks: (B:3:0x0006, B:5:0x0011, B:13:0x0021, B:15:0x0040, B:17:0x0047, B:33:0x0071, B:35:0x007f, B:37:0x0086, B:39:0x0090, B:41:0x0097, B:43:0x00a5, B:45:0x00ac, B:47:0x00ba, B:49:0x00c3, B:51:0x00d9, B:53:0x00e2, B:55:0x00e8, B:57:0x00f1, B:58:0x0108, B:60:0x010e, B:61:0x011c, B:63:0x0122, B:66:0x012b, B:28:0x0062, B:29:0x0069, B:30:0x006a, B:32:0x006e, B:20:0x004f, B:68:0x013a, B:69:0x0147), top: B:85:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    /* JADX WARN: Code duplicated, block: B:39:0x0090 A[Catch: Exception -> 0x0017, c -> 0x001a, CancellationException -> 0x001d, TryCatch #2 {Exception -> 0x0017, blocks: (B:3:0x0006, B:5:0x0011, B:13:0x0021, B:15:0x0040, B:17:0x0047, B:33:0x0071, B:35:0x007f, B:37:0x0086, B:39:0x0090, B:41:0x0097, B:43:0x00a5, B:45:0x00ac, B:47:0x00ba, B:49:0x00c3, B:51:0x00d9, B:53:0x00e2, B:55:0x00e8, B:57:0x00f1, B:58:0x0108, B:60:0x010e, B:61:0x011c, B:63:0x0122, B:66:0x012b, B:28:0x0062, B:29:0x0069, B:30:0x006a, B:32:0x006e, B:20:0x004f, B:68:0x013a, B:69:0x0147), top: B:85:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0096  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a5 A[Catch: Exception -> 0x0017, c -> 0x001a, CancellationException -> 0x001d, TryCatch #2 {Exception -> 0x0017, blocks: (B:3:0x0006, B:5:0x0011, B:13:0x0021, B:15:0x0040, B:17:0x0047, B:33:0x0071, B:35:0x007f, B:37:0x0086, B:39:0x0090, B:41:0x0097, B:43:0x00a5, B:45:0x00ac, B:47:0x00ba, B:49:0x00c3, B:51:0x00d9, B:53:0x00e2, B:55:0x00e8, B:57:0x00f1, B:58:0x0108, B:60:0x010e, B:61:0x011c, B:63:0x0122, B:66:0x012b, B:28:0x0062, B:29:0x0069, B:30:0x006a, B:32:0x006e, B:20:0x004f, B:68:0x013a, B:69:0x0147), top: B:85:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ba A[Catch: Exception -> 0x0017, c -> 0x001a, CancellationException -> 0x001d, TryCatch #2 {Exception -> 0x0017, blocks: (B:3:0x0006, B:5:0x0011, B:13:0x0021, B:15:0x0040, B:17:0x0047, B:33:0x0071, B:35:0x007f, B:37:0x0086, B:39:0x0090, B:41:0x0097, B:43:0x00a5, B:45:0x00ac, B:47:0x00ba, B:49:0x00c3, B:51:0x00d9, B:53:0x00e2, B:55:0x00e8, B:57:0x00f1, B:58:0x0108, B:60:0x010e, B:61:0x011c, B:63:0x0122, B:66:0x012b, B:28:0x0062, B:29:0x0069, B:30:0x006a, B:32:0x006e, B:20:0x004f, B:68:0x013a, B:69:0x0147), top: B:85:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9 A[Catch: Exception -> 0x0017, c -> 0x001a, CancellationException -> 0x001d, TryCatch #2 {Exception -> 0x0017, blocks: (B:3:0x0006, B:5:0x0011, B:13:0x0021, B:15:0x0040, B:17:0x0047, B:33:0x0071, B:35:0x007f, B:37:0x0086, B:39:0x0090, B:41:0x0097, B:43:0x00a5, B:45:0x00ac, B:47:0x00ba, B:49:0x00c3, B:51:0x00d9, B:53:0x00e2, B:55:0x00e8, B:57:0x00f1, B:58:0x0108, B:60:0x010e, B:61:0x011c, B:63:0x0122, B:66:0x012b, B:28:0x0062, B:29:0x0069, B:30:0x006a, B:32:0x006e, B:20:0x004f, B:68:0x013a, B:69:0x0147), top: B:85:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e8 A[Catch: Exception -> 0x0017, c -> 0x001a, CancellationException -> 0x001d, TryCatch #2 {Exception -> 0x0017, blocks: (B:3:0x0006, B:5:0x0011, B:13:0x0021, B:15:0x0040, B:17:0x0047, B:33:0x0071, B:35:0x007f, B:37:0x0086, B:39:0x0090, B:41:0x0097, B:43:0x00a5, B:45:0x00ac, B:47:0x00ba, B:49:0x00c3, B:51:0x00d9, B:53:0x00e2, B:55:0x00e8, B:57:0x00f1, B:58:0x0108, B:60:0x010e, B:61:0x011c, B:63:0x0122, B:66:0x012b, B:28:0x0062, B:29:0x0069, B:30:0x006a, B:32:0x006e, B:20:0x004f, B:68:0x013a, B:69:0x0147), top: B:85:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:60:0x010e A[Catch: Exception -> 0x0017, c -> 0x001a, CancellationException -> 0x001d, LOOP:0: B:58:0x0108->B:60:0x010e, LOOP_END, TryCatch #2 {Exception -> 0x0017, blocks: (B:3:0x0006, B:5:0x0011, B:13:0x0021, B:15:0x0040, B:17:0x0047, B:33:0x0071, B:35:0x007f, B:37:0x0086, B:39:0x0090, B:41:0x0097, B:43:0x00a5, B:45:0x00ac, B:47:0x00ba, B:49:0x00c3, B:51:0x00d9, B:53:0x00e2, B:55:0x00e8, B:57:0x00f1, B:58:0x0108, B:60:0x010e, B:61:0x011c, B:63:0x0122, B:66:0x012b, B:28:0x0062, B:29:0x0069, B:30:0x006a, B:32:0x006e, B:20:0x004f, B:68:0x013a, B:69:0x0147), top: B:85:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0122 A[Catch: Exception -> 0x0017, c -> 0x001a, CancellationException -> 0x001d, TryCatch #2 {Exception -> 0x0017, blocks: (B:3:0x0006, B:5:0x0011, B:13:0x0021, B:15:0x0040, B:17:0x0047, B:33:0x0071, B:35:0x007f, B:37:0x0086, B:39:0x0090, B:41:0x0097, B:43:0x00a5, B:45:0x00ac, B:47:0x00ba, B:49:0x00c3, B:51:0x00d9, B:53:0x00e2, B:55:0x00e8, B:57:0x00f1, B:58:0x0108, B:60:0x010e, B:61:0x011c, B:63:0x0122, B:66:0x012b, B:28:0x0062, B:29:0x0069, B:30:0x006a, B:32:0x006e, B:20:0x004f, B:68:0x013a, B:69:0x0147), top: B:85:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0129  */
    public static final dx.i<dx.b, PassportVisualization> i(PassportVisualizationV2Dto passportVisualizationV2Dto) {
        Object objB;
        xw.e eVar;
        xw.e eVar2;
        OffsetDateTime issueDate;
        fz.b.OffsetDateTime offsetDateTime;
        String nameFirstLine;
        b0 b0VarG;
        String pesel;
        b0 b0VarG2;
        String surnameFirstLine;
        b0 b0VarG3;
        String nameSecondLine;
        b0 b0VarG4;
        String surnameSecondLine;
        b0 b0VarG5;
        ArrayList arrayList;
        Iterator<T> it;
        PassportVisualizationRevocationV2Dto revocationData;
        PassportRevocationData passportRevocationDataE;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    LocalDate birthDate = passportVisualizationV2Dto.getBirthDate();
                    fz.b.LocalDate localDate = birthDate != null ? new fz.b.LocalDate(birthDate) : null;
                    String birthPlaceFirstLine = passportVisualizationV2Dto.getBirthPlaceFirstLine();
                    String citizenship = passportVisualizationV2Dto.getCitizenship();
                    m0 m0VarC = c(passportVisualizationV2Dto.getCountryCode());
                    fz.b.OffsetDateTime offsetDateTime2 = new fz.b.OffsetDateTime(passportVisualizationV2Dto.getExecutionDate());
                    LocalDate expiryDate = passportVisualizationV2Dto.getExpiryDate();
                    fz.b.LocalDate localDate2 = expiryDate != null ? new fz.b.LocalDate(expiryDate) : null;
                    g2 gender = passportVisualizationV2Dto.getGender();
                    int i15 = gender == null ? -1 : a.f219300a[gender.ordinal()];
                    if (i15 != 1) {
                        if (i15 == 2) {
                            eVar = xw.e.FEMALE;
                        } else {
                            if (i15 == 3) {
                                throw new IllegalArgumentException("Cannot parse UNKNOWN to toDomain");
                            }
                            eVar2 = null;
                        }
                        b0 b0VarG6 = c0.g(passportVisualizationV2Dto.getId());
                        issueDate = passportVisualizationV2Dto.getIssueDate();
                        if (issueDate != null) {
                            offsetDateTime = new fz.b.OffsetDateTime(issueDate);
                        } else {
                            offsetDateTime = null;
                        }
                        String issuerNameFirstLine = passportVisualizationV2Dto.getIssuerNameFirstLine();
                        nameFirstLine = passportVisualizationV2Dto.getNameFirstLine();
                        if (nameFirstLine != null) {
                            b0VarG = c0.g(nameFirstLine);
                        } else {
                            b0VarG = null;
                        }
                        b0 b0VarG7 = c0.g(passportVisualizationV2Dto.getNumber());
                        pesel = passportVisualizationV2Dto.getPesel();
                        if (pesel != null) {
                            b0VarG2 = c0.g(pesel);
                        } else {
                            b0VarG2 = null;
                        }
                        r0 r0VarG = g(passportVisualizationV2Dto.getStatus());
                        surnameFirstLine = passportVisualizationV2Dto.getSurnameFirstLine();
                        if (surnameFirstLine != null) {
                            b0VarG3 = c0.g(surnameFirstLine);
                        } else {
                            b0VarG3 = null;
                        }
                        s0 s0VarH = h(passportVisualizationV2Dto.getType());
                        String birthPlaceSecondLine = passportVisualizationV2Dto.getBirthPlaceSecondLine();
                        String issuerNameSecondLine = passportVisualizationV2Dto.getIssuerNameSecondLine();
                        nameSecondLine = passportVisualizationV2Dto.getNameSecondLine();
                        if (nameSecondLine != null) {
                            b0VarG4 = c0.g(nameSecondLine);
                        } else {
                            b0VarG4 = null;
                        }
                        surnameSecondLine = passportVisualizationV2Dto.getSurnameSecondLine();
                        if (surnameSecondLine != null) {
                            b0VarG5 = c0.g(surnameSecondLine);
                        } else {
                            b0VarG5 = null;
                        }
                        List<PassportDiplomaticDataV2Dto> listF = passportVisualizationV2Dto.f();
                        fz.b.LocalDate localDate3 = localDate;
                        arrayList = new ArrayList(v.y(listF, 10));
                        it = listF.iterator();
                        while (it.hasNext()) {
                            arrayList.add(d((PassportDiplomaticDataV2Dto) it.next()));
                        }
                        revocationData = passportVisualizationV2Dto.getRevocationData();
                        if (revocationData != null) {
                            passportRevocationDataE = e(revocationData);
                        } else {
                            passportRevocationDataE = null;
                        }
                        return new dx.i.Right(new PassportVisualization(localDate3, birthPlaceFirstLine, citizenship, m0VarC, offsetDateTime2, localDate2, eVar2, b0VarG6, offsetDateTime, issuerNameFirstLine, b0VarG, b0VarG7, b0VarG2, r0VarG, b0VarG3, s0VarH, birthPlaceSecondLine, issuerNameSecondLine, b0VarG4, b0VarG5, arrayList, passportRevocationDataE));
                    }
                    eVar = xw.e.MALE;
                    eVar2 = eVar;
                    b0 b0VarG8 = c0.g(passportVisualizationV2Dto.getId());
                    issueDate = passportVisualizationV2Dto.getIssueDate();
                    if (issueDate != null) {
                        offsetDateTime = new fz.b.OffsetDateTime(issueDate);
                    } else {
                        offsetDateTime = null;
                    }
                    String issuerNameFirstLine2 = passportVisualizationV2Dto.getIssuerNameFirstLine();
                    nameFirstLine = passportVisualizationV2Dto.getNameFirstLine();
                    if (nameFirstLine != null) {
                        b0VarG = c0.g(nameFirstLine);
                    } else {
                        b0VarG = null;
                    }
                    b0 b0VarG9 = c0.g(passportVisualizationV2Dto.getNumber());
                    pesel = passportVisualizationV2Dto.getPesel();
                    if (pesel != null) {
                        b0VarG2 = c0.g(pesel);
                    } else {
                        b0VarG2 = null;
                    }
                    r0 r0VarG2 = g(passportVisualizationV2Dto.getStatus());
                    surnameFirstLine = passportVisualizationV2Dto.getSurnameFirstLine();
                    if (surnameFirstLine != null) {
                        b0VarG3 = c0.g(surnameFirstLine);
                    } else {
                        b0VarG3 = null;
                    }
                    s0 s0VarH2 = h(passportVisualizationV2Dto.getType());
                    String birthPlaceSecondLine2 = passportVisualizationV2Dto.getBirthPlaceSecondLine();
                    String issuerNameSecondLine2 = passportVisualizationV2Dto.getIssuerNameSecondLine();
                    nameSecondLine = passportVisualizationV2Dto.getNameSecondLine();
                    if (nameSecondLine != null) {
                        b0VarG4 = c0.g(nameSecondLine);
                    } else {
                        b0VarG4 = null;
                    }
                    surnameSecondLine = passportVisualizationV2Dto.getSurnameSecondLine();
                    if (surnameSecondLine != null) {
                        b0VarG5 = c0.g(surnameSecondLine);
                    } else {
                        b0VarG5 = null;
                    }
                    List<PassportDiplomaticDataV2Dto> listF2 = passportVisualizationV2Dto.f();
                    fz.b.LocalDate localDate4 = localDate;
                    arrayList = new ArrayList(v.y(listF2, 10));
                    it = listF2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(d((PassportDiplomaticDataV2Dto) it.next()));
                    }
                    revocationData = passportVisualizationV2Dto.getRevocationData();
                    if (revocationData != null) {
                        passportRevocationDataE = e(revocationData);
                    } else {
                        passportRevocationDataE = null;
                    }
                    return new dx.i.Right(new PassportVisualization(localDate4, birthPlaceFirstLine, citizenship, m0VarC, offsetDateTime2, localDate2, eVar2, b0VarG8, offsetDateTime, issuerNameFirstLine2, b0VarG, b0VarG9, b0VarG2, r0VarG2, b0VarG3, s0VarH2, birthPlaceSecondLine2, issuerNameSecondLine2, b0VarG4, b0VarG5, arrayList, passportRevocationDataE));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final List<PassportVisualization> j(List<PassportVisualizationV2Dto> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            PassportVisualization passportVisualizationA = i((PassportVisualizationV2Dto) it.next()).a();
            if (passportVisualizationA != null) {
                arrayList.add(passportVisualizationA);
            }
        }
        return arrayList;
    }

    public static final InvalidatePassportRequestV2Dto k(InvalidatePassportRequest invalidatePassportRequest) {
        return new InvalidatePassportRequestV2Dto(invalidatePassportRequest.getId(), c0.e(invalidatePassportRequest.getIdentityToken()), l(invalidatePassportRequest.getInvalidationReason()), invalidatePassportRequest.getNumber());
    }

    public static final i5 l(o0 o0Var) {
        int i15 = a.f219305f[o0Var.ordinal()];
        if (i15 == 1) {
            return i5.LOSS;
        }
        if (i15 == 2) {
            return i5.DAMAGE;
        }
        throw new p();
    }
}
