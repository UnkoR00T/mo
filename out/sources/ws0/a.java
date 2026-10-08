package ws0;

import iy.b0;
import iy.c0;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import ts0.DisableRestrictionRequest;
import ts0.Institution;
import ts0.PeselRestrictionAddress;
import ts0.PlanedRestriction;
import ts0.Restriction;
import ts0.RestrictionCheck;
import ts0.RestrictionCheckStatus;
import ts0.RestrictionCheckSummary;
import ts0.RestrictionChecksPage;
import ts0.RestrictionLock;
import ts0.RestrictionStatusChange;
import ts0.RestrictionStatusChangeSummary;
import ts0.RestrictionStatusChangesPage;
import ts0.RestrictionVerification;
import ts0.RestrictionsVerificationList;
import ts0.VerifyingInstitution;
import ts0.VerifyingInstitutionAddress;
import ts0.l;
import ts0.q;
import ts0.s;
import xs0.AuthorizedRequest;
import xs0.DisableRestrictionRequestDto;
import xs0.InstitutionAddressDto;
import xs0.InstitutionDto;
import xs0.PlanedRestrictionDto;
import xs0.RestrictionCheckDto;
import xs0.RestrictionCheckStatusDto;
import xs0.RestrictionCheckSummaryDto;
import xs0.RestrictionChecksPageDto;
import xs0.RestrictionDto;
import xs0.RestrictionLockDto;
import xs0.RestrictionStatusChangeDto;
import xs0.RestrictionStatusChangeSummaryDto;
import xs0.RestrictionStatusChangesPageDto;
import xs0.RestrictionVerificationDto;
import xs0.RestrictionsVerificationListDto;
import xs0.VerifyPeselRequest;
import xs0.VerifyingInstitutionAddressDto;
import xs0.VerifyingInstitutionDto;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010!\u001a\u00020\u0005*\u00020 ¢\u0006\u0004\b!\u0010\"\u001a\u0011\u0010%\u001a\u00020$*\u00020#¢\u0006\u0004\b%\u0010&\u001a\u0011\u0010)\u001a\u00020(*\u00020'¢\u0006\u0004\b)\u0010*\u001a\u0011\u0010-\u001a\u00020,*\u00020+¢\u0006\u0004\b-\u0010.\u001a\u0011\u00101\u001a\u000200*\u00020/¢\u0006\u0004\b1\u00102\u001a\u0011\u00105\u001a\u000204*\u000203¢\u0006\u0004\b5\u00106\u001a\u0011\u00108\u001a\u00020\u0005*\u000207¢\u0006\u0004\b8\u00109\u001a\u0011\u0010<\u001a\u00020;*\u00020:¢\u0006\u0004\b<\u0010=\u001a\u0011\u0010@\u001a\u00020?*\u00020>¢\u0006\u0004\b@\u0010A\u001a\u0011\u0010D\u001a\u00020C*\u00020B¢\u0006\u0004\bD\u0010E\u001a\u0011\u0010G\u001a\u00020\u0005*\u00020F¢\u0006\u0004\bG\u0010H\u001a\u0011\u0010K\u001a\u00020J*\u00020I¢\u0006\u0004\bK\u0010L\u001a\u0011\u0010O\u001a\u00020N*\u00020M¢\u0006\u0004\bO\u0010P\u001a\u0011\u0010S\u001a\u00020R*\u00020Q¢\u0006\u0004\bS\u0010T\u001a\u0011\u0010W\u001a\u00020V*\u00020U¢\u0006\u0004\bW\u0010X\u001a\u0011\u0010[\u001a\u00020Z*\u00020Y¢\u0006\u0004\b[\u0010\\¨\u0006]"}, d2 = {"Lxs0/j;", "Lts0/f;", "d", "(Lxs0/j;)Lts0/f;", "Lxs0/j$a;", "Lts0/l;", "k", "(Lxs0/j$a;)Lts0/l;", "Lxs0/k;", "Lts0/k;", "i", "(Lxs0/k;)Lts0/k;", "Lxs0/e;", "Lts0/e;", "c", "(Lxs0/e;)Lts0/e;", "Lxs0/h;", "Lts0/i;", "g", "(Lxs0/h;)Lts0/i;", "Lxs0/m;", "Lts0/n;", "o", "(Lxs0/m;)Lts0/n;", "Lxs0/f;", "Lts0/g;", "e", "(Lxs0/f;)Lts0/g;", "Lxs0/g;", "Lts0/h;", "f", "(Lxs0/g;)Lts0/h;", "Lxs0/g$a;", "j", "(Lxs0/g$a;)Lts0/l;", "Lxs0/d;", "Lts0/c;", "a", "(Lxs0/d;)Lts0/c;", "Lxs0/c;", "Lts0/d;", "b", "(Lxs0/c;)Lts0/d;", "Lxs0/i;", "Lts0/j;", "h", "(Lxs0/i;)Lts0/j;", "Lxs0/n;", "Lts0/o;", "p", "(Lxs0/n;)Lts0/o;", "Lxs0/l;", "Lts0/m;", "n", "(Lxs0/l;)Lts0/m;", "Lxs0/l$a;", "l", "(Lxs0/l$a;)Lts0/l;", "Lxs0/p;", "Lts0/r;", "s", "(Lxs0/p;)Lts0/r;", "Lxs0/o;", "Lts0/p;", "q", "(Lxs0/o;)Lts0/p;", "Lxs0/p$a;", "Lts0/q;", "r", "(Lxs0/p$a;)Lts0/q;", "Lxs0/o$a;", "m", "(Lxs0/o$a;)Lts0/l;", "Lts0/b;", "Lxs0/b;", "u", "(Lts0/b;)Lxs0/b;", "Lts0/a;", "Lxs0/a;", "t", "(Lts0/a;)Lxs0/a;", "Lts0/s;", "Lxs0/q;", "v", "(Lts0/s;)Lxs0/q;", "Lts0/t;", "Lxs0/s;", "x", "(Lts0/t;)Lxs0/s;", "Lts0/u;", "Lxs0/r;", "w", "(Lts0/u;)Lxs0/r;", "peselrestrictionservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: ws0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C5704a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f214772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f214773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f214774c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f214775d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f214776e;

        static {
            int[] iArr = new int[RestrictionDto.a.values().length];
            try {
                iArr[RestrictionDto.a.RESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RestrictionDto.a.UNRESTRICTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RestrictionDto.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f214772a = iArr;
            int[] iArr2 = new int[RestrictionCheckStatusDto.a.values().length];
            try {
                iArr2[RestrictionCheckStatusDto.a.RESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RestrictionCheckStatusDto.a.UNRESTRICTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[RestrictionCheckStatusDto.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f214773b = iArr2;
            int[] iArr3 = new int[RestrictionStatusChangeDto.a.values().length];
            try {
                iArr3[RestrictionStatusChangeDto.a.RESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[RestrictionStatusChangeDto.a.UNRESTRICTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[RestrictionStatusChangeDto.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f214774c = iArr3;
            int[] iArr4 = new int[RestrictionsVerificationListDto.a.values().length];
            try {
                iArr4[RestrictionsVerificationListDto.a.VERIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[RestrictionsVerificationListDto.a.NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[RestrictionsVerificationListDto.a.INVALID_INPUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[RestrictionsVerificationListDto.a.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            f214775d = iArr4;
            int[] iArr5 = new int[RestrictionVerificationDto.a.values().length];
            try {
                iArr5[RestrictionVerificationDto.a.RESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[RestrictionVerificationDto.a.UNRESTRICTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[RestrictionVerificationDto.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            f214776e = iArr5;
        }
    }

    public static final Institution a(InstitutionDto institutionDto) {
        String name = institutionDto.getName();
        InstitutionAddressDto address = institutionDto.getAddress();
        return new Institution(name, address != null ? b(address) : null, institutionDto.getKrs(), institutionDto.getNip(), institutionDto.getRegon());
    }

    public static final PeselRestrictionAddress b(InstitutionAddressDto institutionAddressDto) {
        return new PeselRestrictionAddress(institutionAddressDto.getBuildingNumber(), institutionAddressDto.getCity(), institutionAddressDto.getPostalCode(), institutionAddressDto.getStreet(), institutionAddressDto.getApartmentNumber());
    }

    public static final PlanedRestriction c(PlanedRestrictionDto planedRestrictionDto) {
        return new PlanedRestriction(planedRestrictionDto.getDateFrom());
    }

    public static final Restriction d(RestrictionDto restrictionDto) {
        l lVarK = k(restrictionDto.getStatus());
        RestrictionLockDto restrictionLock = restrictionDto.getRestrictionLock();
        RestrictionLock restrictionLockI = restrictionLock != null ? i(restrictionLock) : null;
        PlanedRestrictionDto planedRestriction = restrictionDto.getPlanedRestriction();
        PlanedRestriction planedRestrictionC = planedRestriction != null ? c(planedRestriction) : null;
        RestrictionCheckSummaryDto latestRestrictionCheck = restrictionDto.getLatestRestrictionCheck();
        RestrictionCheckSummary restrictionCheckSummaryG = latestRestrictionCheck != null ? g(latestRestrictionCheck) : null;
        RestrictionStatusChangeSummaryDto latestRestrictionStatusChange = restrictionDto.getLatestRestrictionStatusChange();
        return new Restriction(lVarK, restrictionLockI, planedRestrictionC, restrictionCheckSummaryG, latestRestrictionStatusChange != null ? o(latestRestrictionStatusChange) : null);
    }

    public static final RestrictionCheck e(RestrictionCheckDto restrictionCheckDto) {
        b0 b0VarG = c0.g(restrictionCheckDto.getPesel());
        OffsetDateTime verifiedAt = restrictionCheckDto.getVerifiedAt();
        List<RestrictionCheckStatusDto> listE = restrictionCheckDto.e();
        ArrayList arrayList = new ArrayList(v.y(listE, 10));
        Iterator<T> it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(f((RestrictionCheckStatusDto) it.next()));
        }
        boolean privatePersonVerification = restrictionCheckDto.getPrivatePersonVerification();
        String reason = restrictionCheckDto.getReason();
        LocalDate verifiedForDate = restrictionCheckDto.getVerifiedForDate();
        InstitutionDto institution = restrictionCheckDto.getInstitution();
        return new RestrictionCheck(b0VarG, verifiedAt, arrayList, privatePersonVerification, reason, verifiedForDate, institution != null ? a(institution) : null);
    }

    public static final RestrictionCheckStatus f(RestrictionCheckStatusDto restrictionCheckStatusDto) {
        RestrictionCheckStatusDto.a status = restrictionCheckStatusDto.getStatus();
        return new RestrictionCheckStatus(status != null ? j(status) : null, restrictionCheckStatusDto.getStatusStartDate());
    }

    public static final RestrictionCheckSummary g(RestrictionCheckSummaryDto restrictionCheckSummaryDto) {
        return new RestrictionCheckSummary(restrictionCheckSummaryDto.getVerifiedAt());
    }

    public static final RestrictionChecksPage h(RestrictionChecksPageDto restrictionChecksPageDto) {
        List<RestrictionCheckDto> listA = restrictionChecksPageDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(e((RestrictionCheckDto) it.next()));
        }
        return new RestrictionChecksPage(arrayList, restrictionChecksPageDto.getNextPageId());
    }

    public static final RestrictionLock i(RestrictionLockDto restrictionLockDto) {
        return new RestrictionLock(restrictionLockDto.getDateFrom(), restrictionLockDto.getDateTo());
    }

    public static final l j(RestrictionCheckStatusDto.a aVar) {
        int i15 = C5704a.f214773b[aVar.ordinal()];
        if (i15 == 1) {
            return l.RESTRICTED;
        }
        if (i15 == 2) {
            return l.UNRESTRICTED;
        }
        if (i15 == 3) {
            return l.UNKNOWN;
        }
        throw new p();
    }

    public static final l k(RestrictionDto.a aVar) {
        int i15 = C5704a.f214772a[aVar.ordinal()];
        if (i15 == 1) {
            return l.RESTRICTED;
        }
        if (i15 == 2) {
            return l.UNRESTRICTED;
        }
        if (i15 == 3) {
            return l.UNKNOWN;
        }
        throw new p();
    }

    public static final l l(RestrictionStatusChangeDto.a aVar) {
        int i15 = C5704a.f214774c[aVar.ordinal()];
        if (i15 == 1) {
            return l.RESTRICTED;
        }
        if (i15 == 2) {
            return l.UNRESTRICTED;
        }
        if (i15 == 3) {
            return l.UNKNOWN;
        }
        throw new p();
    }

    public static final l m(RestrictionVerificationDto.a aVar) {
        int i15 = C5704a.f214776e[aVar.ordinal()];
        if (i15 == 1) {
            return l.RESTRICTED;
        }
        if (i15 == 2) {
            return l.UNRESTRICTED;
        }
        if (i15 == 3) {
            return l.UNKNOWN;
        }
        throw new p();
    }

    public static final RestrictionStatusChange n(RestrictionStatusChangeDto restrictionStatusChangeDto) {
        b0 b0VarG = c0.g(restrictionStatusChangeDto.getPesel());
        OffsetDateTime changeDate = restrictionStatusChangeDto.getChangeDate();
        RestrictionStatusChangeDto.a status = restrictionStatusChangeDto.getStatus();
        return new RestrictionStatusChange(b0VarG, changeDate, status != null ? l(status) : null, restrictionStatusChangeDto.getSubject());
    }

    public static final RestrictionStatusChangeSummary o(RestrictionStatusChangeSummaryDto restrictionStatusChangeSummaryDto) {
        return new RestrictionStatusChangeSummary(restrictionStatusChangeSummaryDto.getChangeDate());
    }

    public static final RestrictionStatusChangesPage p(RestrictionStatusChangesPageDto restrictionStatusChangesPageDto) {
        List<RestrictionStatusChangeDto> listA = restrictionStatusChangesPageDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(n((RestrictionStatusChangeDto) it.next()));
        }
        return new RestrictionStatusChangesPage(arrayList, restrictionStatusChangesPageDto.getNextPageId());
    }

    public static final RestrictionVerification q(RestrictionVerificationDto restrictionVerificationDto) {
        RestrictionVerificationDto.a status = restrictionVerificationDto.getStatus();
        return new RestrictionVerification(status != null ? m(status) : null, restrictionVerificationDto.getStatusStartDate());
    }

    public static final q r(RestrictionsVerificationListDto.a aVar) {
        int i15 = C5704a.f214775d[aVar.ordinal()];
        if (i15 == 1) {
            return q.VERIFIED;
        }
        if (i15 == 2) {
            return q.NOT_FOUND;
        }
        if (i15 == 3) {
            return q.INVALID_INPUT;
        }
        if (i15 == 4) {
            return q.UNKNOWN;
        }
        throw new p();
    }

    public static final RestrictionsVerificationList s(RestrictionsVerificationListDto restrictionsVerificationListDto) {
        List<RestrictionVerificationDto> listA = restrictionsVerificationListDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(q((RestrictionVerificationDto) it.next()));
        }
        OffsetDateTime verificationDate = restrictionsVerificationListDto.getVerificationDate();
        RestrictionsVerificationListDto.a status = restrictionsVerificationListDto.getStatus();
        return new RestrictionsVerificationList(arrayList, verificationDate, status != null ? r(status) : null);
    }

    public static final AuthorizedRequest t(ts0.AuthorizedRequest authorizedRequest) {
        return new AuthorizedRequest(c0.e(authorizedRequest.getSignedRequest()));
    }

    public static final DisableRestrictionRequestDto u(DisableRestrictionRequest disableRestrictionRequest) {
        return new DisableRestrictionRequestDto(c0.e(disableRestrictionRequest.getChallenge()), disableRestrictionRequest.getValue());
    }

    public static final VerifyPeselRequest v(s sVar) {
        String pesel = sVar.getPesel();
        String verificationReason = sVar.getVerificationReason();
        String seriesAndId = sVar.getSeriesAndId();
        LocalDate date = sVar.getDate();
        VerifyingInstitution verifyingInstitution = sVar.getVerifyingInstitution();
        return new VerifyPeselRequest(pesel, seriesAndId, verificationReason, date, verifyingInstitution != null ? x(verifyingInstitution) : null);
    }

    public static final VerifyingInstitutionAddressDto w(VerifyingInstitutionAddress verifyingInstitutionAddress) {
        String city = verifyingInstitutionAddress.getCity();
        String postalCode = verifyingInstitutionAddress.getPostalCode();
        return new VerifyingInstitutionAddressDto(verifyingInstitutionAddress.getBuildingNumber(), city, postalCode, verifyingInstitutionAddress.getApartmentNumber(), verifyingInstitutionAddress.getStreet());
    }

    public static final VerifyingInstitutionDto x(VerifyingInstitution verifyingInstitution) {
        String name = verifyingInstitution.getName();
        return new VerifyingInstitutionDto(w(verifyingInstitution.getAddress()), name, verifyingInstitution.getKrs(), verifyingInstitution.getNip(), verifyingInstitution.getRegon());
    }
}
