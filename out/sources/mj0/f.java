package mj0;

import cj0.AccessibleZusEVisitDepartments;
import cj0.AdditionalParticipant;
import cj0.AllZusEVisitSummary;
import cj0.BookZusEVisit;
import cj0.BookedZusEVisitSummary;
import cj0.ZusEVisitCollectiveDepartments;
import cj0.ZusEVisitDepartment;
import cj0.ZusEVisitDetails;
import cj0.ZusEVisitGroupSummary;
import cj0.ZusEVisitHours;
import cj0.ZusEVisitTerm;
import cj0.ZusEVisitTopic;
import cj0.o;
import iy.b0;
import iy.c0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import lr.m;
import nj0.AccessibleZusEVisitDepartmentsDto;
import nj0.AdditionalParticipantDto;
import nj0.AllZusEVisitSummaryDto;
import nj0.BookZusEVisitDto;
import nj0.BookedZusEVisitSummaryDto;
import nj0.FullVisitDate;
import nj0.ZusEVisitCollectiveDepartmentsDto;
import nj0.ZusEVisitDepartmentDto;
import nj0.ZusEVisitDetailsDto;
import nj0.ZusEVisitGroupDetailsDto;
import nj0.ZusEVisitGroupSummaryDto;
import nj0.ZusEVisitTermDto;
import nj0.ZusEVisitTopicDto;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010\"\u001a\u00020!*\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010&\u001a\u00020%*\u00020$¢\u0006\u0004\b&\u0010'\u001a\u0011\u0010*\u001a\u00020)*\u00020(¢\u0006\u0004\b*\u0010+\u001a\u0011\u0010.\u001a\u00020-*\u00020,¢\u0006\u0004\b.\u0010/\u001a\u0011\u00102\u001a\u000201*\u000200¢\u0006\u0004\b2\u00103\u001a\u0011\u00106\u001a\u000205*\u000204¢\u0006\u0004\b6\u00107\u001a\u0011\u0010:\u001a\u000209*\u000208¢\u0006\u0004\b:\u0010;\u001a\u0011\u0010>\u001a\u00020=*\u00020<¢\u0006\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lnj0/w0;", "Lcj0/n;", "m", "(Lnj0/w0;)Lcj0/n;", "Lnj0/w0$a;", "Lcj0/n$a;", "l", "(Lnj0/w0$a;)Lcj0/n$a;", "Lnj0/a;", "Lcj0/a;", "b", "(Lnj0/a;)Lcj0/a;", "Lnj0/a$a;", "Lcj0/a$a;", "a", "(Lnj0/a$a;)Lcj0/a$a;", "Lnj0/q0;", "Lcj0/h;", "f", "(Lnj0/q0;)Lcj0/h;", "Lnj0/v0;", "Lcj0/m;", "k", "(Lnj0/v0;)Lcj0/m;", "Lnj0/u0;", "Lcj0/k;", "j", "(Lnj0/u0;)Lcj0/k;", "Lnj0/p0;", "Lcj0/g;", "e", "(Lnj0/p0;)Lcj0/g;", "Lnj0/c;", "Lcj0/c;", "c", "(Lnj0/c;)Lcj0/c;", "Lnj0/s0;", "Lcj0/j;", "i", "(Lnj0/s0;)Lcj0/j;", "Lcj0/d;", "Lnj0/d;", "o", "(Lcj0/d;)Lnj0/d;", "Lcj0/f;", "Lnj0/t;", "p", "(Lcj0/f;)Lnj0/t;", "Lnj0/e;", "Lcj0/e;", "d", "(Lnj0/e;)Lcj0/e;", "Lcj0/b;", "Lnj0/b;", "n", "(Lcj0/b;)Lnj0/b;", "Lnj0/r0;", "Lcj0/i;", "h", "(Lnj0/r0;)Lcj0/i;", "Lnj0/r0$a;", "Lcj0/i$a;", "g", "(Lnj0/r0$a;)Lcj0/i$a;", "citizenservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f126725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f126726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f126727c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f126728d;

        static {
            int[] iArr = new int[ZusEVisitTopicDto.a.values().length];
            try {
                iArr[ZusEVisitTopicDto.a.PUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ZusEVisitTopicDto.a.EIR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ZusEVisitTopicDto.a.EIR_MN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ZusEVisitTopicDto.a.ZAS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ZusEVisitTopicDto.a.UIU.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ZusEVisitTopicDto.a.FIP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ZusEVisitTopicDto.a.PJM_ZAS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ZusEVisitTopicDto.a.PJM_EIR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ZusEVisitTopicDto.a.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f126725a = iArr;
            int[] iArr2 = new int[AccessibleZusEVisitDepartmentsDto.EnumC3372a.values().length];
            try {
                iArr2[AccessibleZusEVisitDepartmentsDto.EnumC3372a.NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[AccessibleZusEVisitDepartmentsDto.EnumC3372a.FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[AccessibleZusEVisitDepartmentsDto.EnumC3372a.NOT_FOUND_VISIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[AccessibleZusEVisitDepartmentsDto.EnumC3372a.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[AccessibleZusEVisitDepartmentsDto.EnumC3372a.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            f126726b = iArr2;
            int[] iArr3 = new int[ZusEVisitGroupDetailsDto.a.values().length];
            try {
                iArr3[ZusEVisitGroupDetailsDto.a.CANCELED.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[ZusEVisitGroupDetailsDto.a.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[ZusEVisitGroupDetailsDto.a.ONGOING.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[ZusEVisitGroupDetailsDto.a.PLANNED.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[ZusEVisitGroupDetailsDto.a.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            f126727c = iArr3;
            int[] iArr4 = new int[ZusEVisitDetailsDto.a.values().length];
            try {
                iArr4[ZusEVisitDetailsDto.a.PLANNED.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[ZusEVisitDetailsDto.a.ONGOING.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[ZusEVisitDetailsDto.a.CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[ZusEVisitDetailsDto.a.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[ZusEVisitDetailsDto.a.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused24) {
            }
            f126728d = iArr4;
        }
    }

    public static final AccessibleZusEVisitDepartments.EnumC0702a a(AccessibleZusEVisitDepartmentsDto.EnumC3372a enumC3372a) {
        int i15 = a.f126726b[enumC3372a.ordinal()];
        if (i15 == 1) {
            return AccessibleZusEVisitDepartments.EnumC0702a.NOT_FOUND;
        }
        if (i15 == 2) {
            return AccessibleZusEVisitDepartments.EnumC0702a.FOUND;
        }
        if (i15 == 3) {
            return AccessibleZusEVisitDepartments.EnumC0702a.NOT_FOUND_VISIT;
        }
        if (i15 == 4) {
            return AccessibleZusEVisitDepartments.EnumC0702a.OTHER;
        }
        if (i15 == 5) {
            return AccessibleZusEVisitDepartments.EnumC0702a.UNKNOWN;
        }
        throw new p();
    }

    public static final AccessibleZusEVisitDepartments b(AccessibleZusEVisitDepartmentsDto accessibleZusEVisitDepartmentsDto) {
        AccessibleZusEVisitDepartments.EnumC0702a enumC0702aA = a(accessibleZusEVisitDepartmentsDto.getStatus());
        List<ZusEVisitDepartmentDto> listB = accessibleZusEVisitDepartmentsDto.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(f((ZusEVisitDepartmentDto) it.next()));
        }
        ZusEVisitDepartmentDto department = accessibleZusEVisitDepartmentsDto.getDepartment();
        return new AccessibleZusEVisitDepartments(enumC0702aA, arrayList, department != null ? f(department) : null);
    }

    public static final AllZusEVisitSummary c(AllZusEVisitSummaryDto allZusEVisitSummaryDto) {
        String defaultPostcode = allZusEVisitSummaryDto.getDefaultPostcode();
        b0 b0VarG = defaultPostcode != null ? c0.g(defaultPostcode) : null;
        boolean bookingAvailable = allZusEVisitSummaryDto.getBookingAvailable();
        List<ZusEVisitGroupSummaryDto> listA = allZusEVisitSummaryDto.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.e(v0.e(v.y(listA, 10)), 16));
        for (ZusEVisitGroupSummaryDto zusEVisitGroupSummaryDto : listA) {
            LocalDate visitDate = zusEVisitGroupSummaryDto.getVisitDate();
            List<ZusEVisitGroupDetailsDto> listA2 = zusEVisitGroupSummaryDto.a();
            ArrayList arrayList = new ArrayList(v.y(listA2, 10));
            Iterator<T> it = listA2.iterator();
            while (it.hasNext()) {
                arrayList.add(i((ZusEVisitGroupDetailsDto) it.next()));
            }
            linkedHashMap.put(visitDate, arrayList);
        }
        List<ZusEVisitGroupSummaryDto> listD = allZusEVisitSummaryDto.d();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(m.e(v0.e(v.y(listD, 10)), 16));
        for (ZusEVisitGroupSummaryDto zusEVisitGroupSummaryDto2 : listD) {
            LocalDate visitDate2 = zusEVisitGroupSummaryDto2.getVisitDate();
            List<ZusEVisitGroupDetailsDto> listA3 = zusEVisitGroupSummaryDto2.a();
            ArrayList arrayList2 = new ArrayList(v.y(listA3, 10));
            Iterator<T> it4 = listA3.iterator();
            while (it4.hasNext()) {
                arrayList2.add(i((ZusEVisitGroupDetailsDto) it4.next()));
            }
            linkedHashMap2.put(visitDate2, arrayList2);
        }
        return new AllZusEVisitSummary(b0VarG, bookingAvailable, linkedHashMap, linkedHashMap2);
    }

    public static final BookedZusEVisitSummary d(BookedZusEVisitSummaryDto bookedZusEVisitSummaryDto) {
        return new BookedZusEVisitSummary(bookedZusEVisitSummaryDto.getId(), new fz.b.OffsetDateTime(bookedZusEVisitSummaryDto.getFullVisitDate()), new fz.b.OffsetDateTime(bookedZusEVisitSummaryDto.getFullVisitEndDate()), bookedZusEVisitSummaryDto.getTopicDescription(), c0.g(bookedZusEVisitSummaryDto.getVisitUrl()), bookedZusEVisitSummaryDto.getDepartmentDescription());
    }

    public static final ZusEVisitCollectiveDepartments e(ZusEVisitCollectiveDepartmentsDto zusEVisitCollectiveDepartmentsDto) {
        List<ZusEVisitDepartmentDto> listA = zusEVisitCollectiveDepartmentsDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(f((ZusEVisitDepartmentDto) it.next()));
        }
        List<ZusEVisitDepartmentDto> listB = zusEVisitCollectiveDepartmentsDto.b();
        ArrayList arrayList2 = new ArrayList(v.y(listB, 10));
        Iterator<T> it4 = listB.iterator();
        while (it4.hasNext()) {
            arrayList2.add(f((ZusEVisitDepartmentDto) it4.next()));
        }
        return new ZusEVisitCollectiveDepartments(arrayList, arrayList2);
    }

    public static final ZusEVisitDepartment f(ZusEVisitDepartmentDto zusEVisitDepartmentDto) {
        return new ZusEVisitDepartment(zusEVisitDepartmentDto.getId(), zusEVisitDepartmentDto.getName(), zusEVisitDepartmentDto.getPostcode(), zusEVisitDepartmentDto.getCity(), zusEVisitDepartmentDto.getStreet(), zusEVisitDepartmentDto.getBuildingNumber());
    }

    public static final ZusEVisitDetails.a g(ZusEVisitDetailsDto.a aVar) {
        int i15 = a.f126728d[aVar.ordinal()];
        if (i15 == 1) {
            return ZusEVisitDetails.a.PLANNED;
        }
        if (i15 == 2) {
            return ZusEVisitDetails.a.ONGOING;
        }
        if (i15 == 3) {
            return ZusEVisitDetails.a.CANCELED;
        }
        if (i15 == 4) {
            return ZusEVisitDetails.a.FINISHED;
        }
        if (i15 == 5) {
            return ZusEVisitDetails.a.UNKNOWN;
        }
        throw new p();
    }

    public static final ZusEVisitDetails h(ZusEVisitDetailsDto zusEVisitDetailsDto) {
        return new ZusEVisitDetails(zusEVisitDetailsDto.getId(), new fz.b.OffsetDateTime(zusEVisitDetailsDto.getFullVisitDate()), new fz.b.OffsetDateTime(zusEVisitDetailsDto.getFullVisitEndDate()), g(zusEVisitDetailsDto.getStatus()), zusEVisitDetailsDto.getTopicDescription(), c0.g(zusEVisitDetailsDto.getVisitUrl()), c0.g(zusEVisitDetailsDto.getCancelUrl()), zusEVisitDetailsDto.getTopicId(), zusEVisitDetailsDto.getDepartmentId(), zusEVisitDetailsDto.getDepartmentDescription());
    }

    public static final ZusEVisitGroupSummary i(ZusEVisitGroupDetailsDto zusEVisitGroupDetailsDto) {
        o oVar;
        long id5 = zusEVisitGroupDetailsDto.getId();
        fz.b.OffsetDateTime offsetDateTime = new fz.b.OffsetDateTime(zusEVisitGroupDetailsDto.getFullVisitDate());
        String topicDescription = zusEVisitGroupDetailsDto.getTopicDescription();
        int i15 = a.f126727c[zusEVisitGroupDetailsDto.getStatus().ordinal()];
        if (i15 == 1) {
            oVar = o.CANCELED;
        } else if (i15 == 2) {
            oVar = o.FINISHED;
        } else if (i15 == 3) {
            oVar = o.ONGOING;
        } else if (i15 == 4) {
            oVar = o.PLANNED;
        } else {
            if (i15 != 5) {
                throw new p();
            }
            oVar = o.UNKNOWN;
        }
        return new ZusEVisitGroupSummary(id5, offsetDateTime, topicDescription, oVar);
    }

    public static final ZusEVisitHours j(nj0.ZusEVisitHours zusEVisitHours) {
        return new ZusEVisitHours(zusEVisitHours.getTimeFrom(), zusEVisitHours.getTimeTo());
    }

    public static final ZusEVisitTerm k(ZusEVisitTermDto zusEVisitTermDto) {
        LocalDate visitDate = zusEVisitTermDto.getVisitDate();
        List<nj0.ZusEVisitHours> listA = zusEVisitTermDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(j((nj0.ZusEVisitHours) it.next()));
        }
        return new ZusEVisitTerm(visitDate, arrayList);
    }

    public static final ZusEVisitTopic.a l(ZusEVisitTopicDto.a aVar) {
        switch (a.f126725a[aVar.ordinal()]) {
            case 1:
                return ZusEVisitTopic.a.PUE;
            case 2:
                return ZusEVisitTopic.a.EIR;
            case 3:
                return ZusEVisitTopic.a.EIR_MN;
            case 4:
                return ZusEVisitTopic.a.ZAS;
            case 5:
                return ZusEVisitTopic.a.UIU;
            case 6:
                return ZusEVisitTopic.a.FIP;
            case 7:
                return ZusEVisitTopic.a.PJM_ZAS;
            case 8:
                return ZusEVisitTopic.a.PJM_EIR;
            case 9:
                return ZusEVisitTopic.a.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final ZusEVisitTopic m(ZusEVisitTopicDto zusEVisitTopicDto) {
        return new ZusEVisitTopic(zusEVisitTopicDto.getId(), l(zusEVisitTopicDto.getCode()), zusEVisitTopicDto.getTitle(), zusEVisitTopicDto.getDescription());
    }

    public static final AdditionalParticipantDto n(AdditionalParticipant additionalParticipant) {
        boolean required = additionalParticipant.getRequired();
        b0 firstName = additionalParticipant.getFirstName();
        String strE = firstName != null ? c0.e(firstName) : null;
        b0 lastName = additionalParticipant.getLastName();
        return new AdditionalParticipantDto(required, strE, lastName != null ? c0.e(lastName) : null);
    }

    public static final BookZusEVisitDto o(BookZusEVisit bookZusEVisit) {
        String topicId = bookZusEVisit.getTopicId();
        String topicDescription = bookZusEVisit.getTopicDescription();
        long departmentId = bookZusEVisit.getDepartmentId();
        FullVisitDate fullVisitDateP = p(bookZusEVisit.getVisitDate());
        boolean dataProcessingAgreement = bookZusEVisit.getDataProcessingAgreement();
        boolean statementOfAwareness = bookZusEVisit.getStatementOfAwareness();
        String strE = c0.e(bookZusEVisit.getFirstName());
        String strE2 = c0.e(bookZusEVisit.getLastName());
        String strE3 = c0.e(bookZusEVisit.getEmail());
        String postcode = bookZusEVisit.getPostcode();
        AdditionalParticipantDto additionalParticipantDtoN = n(bookZusEVisit.getTranslator());
        AdditionalParticipantDto additionalParticipantDtoN2 = n(bookZusEVisit.getTranslator());
        String departmentDescription = bookZusEVisit.getDepartmentDescription();
        b0 phone = bookZusEVisit.getPhone();
        return new BookZusEVisitDto(dataProcessingAgreement, departmentId, strE3, strE, strE2, additionalParticipantDtoN2, statementOfAwareness, topicDescription, topicId, additionalParticipantDtoN, departmentDescription, fullVisitDateP, Boolean.valueOf(bookZusEVisit.getIncludePesel()), phone != null ? c0.e(phone) : null, postcode);
    }

    public static final FullVisitDate p(cj0.FullVisitDate fullVisitDate) {
        return new FullVisitDate(fullVisitDate.getDate().getDate(), fullVisitDate.getTime().getDate());
    }
}
