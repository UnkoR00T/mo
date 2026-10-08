package rj0;

import cj0.AccessibleZusEVisitDepartments;
import cj0.AllZusEVisitSummary;
import cj0.BookZusEVisit;
import cj0.BookedZusEVisitSummary;
import cj0.ZusEVisitCollectiveDepartments;
import cj0.ZusEVisitDetails;
import cj0.ZusEVisitTerm;
import cj0.ZusEVisitTopic;
import dx.i;
import iy.b0;
import java.time.LocalDate;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u0004H¦@¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u0004H¦@¢\u0006\u0004\b\u0014\u0010\u0012J:\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H¦@¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001e0\u00042\u0006\u0010\u001d\u001a\u00020\u0015H¦@¢\u0006\u0004\b\u001f\u0010 J\"\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00190\u0004H¦@¢\u0006\u0004\b\"\u0010\u0012¨\u0006#À\u0006\u0003"}, d2 = {"Lrj0/h;", "", "Lcj0/d;", "bookZusEVisit", "Ldx/i;", "Ldx/b;", "Lcj0/e;", "f", "(Lcj0/d;Ltq/e;)Ljava/lang/Object;", "", "topicId", "Liy/b0;", "postcode", "Lcj0/a;", "e", "(Ljava/lang/String;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lcj0/c;", "b", "(Ltq/e;)Ljava/lang/Object;", "Lcj0/g;", "a", "", "departmentId", "Ljava/time/LocalDate;", "visitDate", "", "Lcj0/m;", "g", "(Ljava/lang/String;JLjava/time/LocalDate;Ltq/e;)Ljava/lang/Object;", "visitId", "Lcj0/i;", "d", "(JLtq/e;)Ljava/lang/Object;", "Lcj0/n;", "c", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h {
    Object a(tq.e<? super i<? extends dx.b, ZusEVisitCollectiveDepartments>> eVar);

    Object b(tq.e<? super i<? extends dx.b, AllZusEVisitSummary>> eVar);

    Object c(tq.e<? super i<? extends dx.b, ? extends List<ZusEVisitTopic>>> eVar);

    Object d(long j15, tq.e<? super i<? extends dx.b, ZusEVisitDetails>> eVar);

    Object e(String str, b0 b0Var, tq.e<? super i<? extends dx.b, AccessibleZusEVisitDepartments>> eVar);

    Object f(BookZusEVisit bookZusEVisit, tq.e<? super i<? extends dx.b, BookedZusEVisitSummary>> eVar);

    Object g(String str, long j15, LocalDate localDate, tq.e<? super i<? extends dx.b, ? extends List<ZusEVisitTerm>>> eVar);
}
