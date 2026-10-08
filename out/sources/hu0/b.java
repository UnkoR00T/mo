package hu0;

import cu0.BadDomainReport;
import cu0.FraudReport;
import cu0.IllegalContentReport;
import cu0.IncidentId;
import cu0.OtherReport;
import cu0.ReportedIncidentReference;
import cu0.d;
import iu0.BadDomainReportDto;
import iu0.FraudReportDto;
import iu0.IllegalContentReportDto;
import iu0.IncidentIdDto;
import iu0.OtherReportDto;
import iu0.ReportedIncidentReferenceDto;
import iu0.i;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Liu0/j;", "Lcu0/e;", "a", "(Liu0/j;)Lcu0/e;", "Lcu0/b;", "Liu0/g;", "d", "(Lcu0/b;)Liu0/g;", "Liu0/l;", "Lcu0/g;", "b", "(Liu0/l;)Lcu0/g;", "Lcu0/a;", "Liu0/f;", "c", "(Lcu0/a;)Liu0/f;", "Lcu0/f;", "Liu0/k;", "g", "(Lcu0/f;)Liu0/k;", "Lcu0/c;", "Liu0/h;", "e", "(Lcu0/c;)Liu0/h;", "Lcu0/d;", "Liu0/i;", "f", "(Lcu0/d;)Liu0/i;", "securityincidentservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86677a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.CHILD_ABUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.EXTREME_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.RACISM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f86677a = iArr;
        }
    }

    public static final IncidentId a(IncidentIdDto incidentIdDto) {
        return new IncidentId(incidentIdDto.getIncidentId());
    }

    public static final ReportedIncidentReference b(ReportedIncidentReferenceDto reportedIncidentReferenceDto) {
        return new ReportedIncidentReference(reportedIncidentReferenceDto.getTicketId());
    }

    public static final BadDomainReportDto c(BadDomainReport badDomainReport) {
        return new BadDomainReportDto(badDomainReport.a(), badDomainReport.getReason(), badDomainReport.getEmail());
    }

    public static final FraudReportDto d(FraudReport fraudReport) {
        return new FraudReportDto(fraudReport.getDescription(), fraudReport.getEmail());
    }

    public static final IllegalContentReportDto e(IllegalContentReport illegalContentReport) {
        return new IllegalContentReportDto(illegalContentReport.b(), f(illegalContentReport.getType()), illegalContentReport.getDescription(), illegalContentReport.getEmail());
    }

    public static final i f(d dVar) {
        int i15 = a.f86677a[dVar.ordinal()];
        if (i15 == 1) {
            return i.CHILD_ABUSE;
        }
        if (i15 == 2) {
            return i.EXTREME_CONTENT;
        }
        if (i15 == 3) {
            return i.RACISM;
        }
        if (i15 == 4) {
            return i.OTHER;
        }
        if (i15 == 5) {
            return i.UNKNOWN;
        }
        throw new p();
    }

    public static final OtherReportDto g(OtherReport otherReport) {
        return new OtherReportDto(otherReport.getDescription(), otherReport.getEmail());
    }
}
