package lj0;

import ge4.x;
import ie4.o;
import ie4.s;
import ie4.t;
import java.time.LocalDate;
import java.util.List;
import nj0.AccessibleZusEVisitDepartmentsDto;
import nj0.AllZusEVisitSummaryDto;
import nj0.BookZusEVisitDto;
import nj0.BookedZusEVisitSummaryDto;
import nj0.ZusEVisitCollectiveDepartmentsDto;
import nj0.ZusEVisitDetailsDto;
import nj0.ZusEVisitTermDto;
import nj0.ZusEVisitTopicDto;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\bH§@¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004H§@¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004H§@¢\u0006\u0004\b\u0012\u0010\u0010J:\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u0013H§@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00170\u0004H§@¢\u0006\u0004\b \u0010\u0010¨\u0006!À\u0006\u0003"}, d2 = {"Llj0/h;", "", "Lnj0/d;", "bookZusEVisitDto", "Lge4/x;", "Lnj0/e;", "e", "(Lnj0/d;Ltq/e;)Ljava/lang/Object;", "", "topicId", "postcode", "Lnj0/a;", "f", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lnj0/c;", "b", "(Ltq/e;)Ljava/lang/Object;", "Lnj0/p0;", "a", "", "departmentId", "Ljava/time/LocalDate;", "visitDate", "", "Lnj0/v0;", "g", "(Ljava/lang/String;JLjava/time/LocalDate;Ltq/e;)Ljava/lang/Object;", "visitId", "Lnj0/r0;", "d", "(JLtq/e;)Ljava/lang/Object;", "Lnj0/w0;", "c", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h {
    @ie4.f("citizen/mobile/api/zus/e-visits/departments")
    Object a(tq.e<? super x<ZusEVisitCollectiveDepartmentsDto>> eVar);

    @ie4.f("citizen/mobile/api/zus/e-visits")
    Object b(tq.e<? super x<AllZusEVisitSummaryDto>> eVar);

    @ie4.f("citizen/mobile/api/zus/e-visits/topics")
    Object c(tq.e<? super x<List<ZusEVisitTopicDto>>> eVar);

    @ie4.f("citizen/mobile/api/zus/e-visits/{visitId}")
    Object d(@s("visitId") long j15, tq.e<? super x<ZusEVisitDetailsDto>> eVar);

    @o("citizen/mobile/api/zus/e-visits/booking")
    Object e(@ie4.a BookZusEVisitDto bookZusEVisitDto, tq.e<? super x<BookedZusEVisitSummaryDto>> eVar);

    @ie4.f("citizen/mobile/api/zus/e-visits/topics/{topicId}/departments")
    Object f(@s("topicId") String str, @t("postcode") String str2, tq.e<? super x<AccessibleZusEVisitDepartmentsDto>> eVar);

    @ie4.f("citizen/mobile/api/zus/e-visits/v2/topics/{topicId}/departments/{departmentId}")
    Object g(@s("topicId") String str, @s("departmentId") long j15, @t("visitDate") LocalDate localDate, tq.e<? super x<List<ZusEVisitTermDto>>> eVar);
}
