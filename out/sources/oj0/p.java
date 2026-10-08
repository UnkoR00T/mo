package oj0;

import cj0.AccessibleZusEVisitDepartments;
import cj0.AllZusEVisitSummary;
import cj0.BookZusEVisit;
import cj0.BookedZusEVisitSummary;
import cj0.ZusEVisitCollectiveDepartments;
import cj0.ZusEVisitDetails;
import cj0.ZusEVisitTerm;
import cj0.ZusEVisitTopic;
import ge4.x;
import iy.b0;
import iy.c0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nj0.AccessibleZusEVisitDepartmentsDto;
import nj0.AllZusEVisitSummaryDto;
import nj0.BookZusEVisitDto;
import nj0.BookedZusEVisitSummaryDto;
import nj0.ZusEVisitCollectiveDepartmentsDto;
import nj0.ZusEVisitDetailsDto;
import nj0.ZusEVisitTermDto;
import nj0.ZusEVisitTopicDto;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\nH\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00190\nH\u0096@¢\u0006\u0004\b\u001a\u0010\u0018J:\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b!\u0010\"J$\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020$0\n2\u0006\u0010#\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b%\u0010&J\"\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u001f0\nH\u0096@¢\u0006\u0004\b(\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010)R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Loj0/p;", "Lrj0/h;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Lcj0/d;", "bookZusEVisit", "Ldx/i;", "Ldx/b;", "Lcj0/e;", "f", "(Lcj0/d;Ltq/e;)Ljava/lang/Object;", "", "topicId", "Liy/b0;", "postcode", "Lcj0/a;", "e", "(Ljava/lang/String;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lcj0/c;", "b", "(Ltq/e;)Ljava/lang/Object;", "Lcj0/g;", "a", "", "departmentId", "Ljava/time/LocalDate;", "visitDate", "", "Lcj0/m;", "g", "(Ljava/lang/String;JLjava/time/LocalDate;Ltq/e;)Ljava/lang/Object;", "visitId", "Lcj0/i;", "d", "(JLtq/e;)Ljava/lang/Object;", "Lcj0/n;", "c", "Lpl/gov/coi/common/network/g0;", "Llj0/h;", "Loq/k;", "k", "()Llj0/h;", "client", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p implements rj0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f146253d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f146254e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f146256g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f146254e = obj;
            this.f146256g |= PKIFailureInfo.systemUnavail;
            return p.this.f(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnj0/e;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<BookedZusEVisitSummaryDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146257e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BookZusEVisit f146259g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(BookZusEVisit bookZusEVisit, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f146259g = bookZusEVisit;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146257e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lj0.h hVarK = p.this.k();
            BookZusEVisitDto bookZusEVisitDtoO = mj0.f.o(this.f146259g);
            this.f146257e = 1;
            Object objE2 = hVarK.e(bookZusEVisitDtoO, this);
            return objE2 == objE ? objE : objE2;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return p.this.new b(this.f146259g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<BookedZusEVisitSummaryDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f146260d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f146261e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f146262f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f146264h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f146262f = obj;
            this.f146264h |= PKIFailureInfo.systemUnavail;
            return p.this.e(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnj0/a;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super x<AccessibleZusEVisitDepartmentsDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146265e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f146267g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ b0 f146268h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, b0 b0Var, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f146267g = str;
            this.f146268h = b0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146265e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lj0.h hVarK = p.this.k();
            String str = this.f146267g;
            String strE = c0.e(this.f146268h);
            this.f146265e = 1;
            Object objF = hVarK.f(str, strE, this);
            return objF == objE ? objE : objF;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return p.this.new d(this.f146267g, this.f146268h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<AccessibleZusEVisitDepartmentsDto>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f146269d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f146271f;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f146269d = obj;
            this.f146271f |= PKIFailureInfo.systemUnavail;
            return p.this.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnj0/c;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super x<AllZusEVisitSummaryDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146272e;

        f(tq.e<? super f> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146272e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lj0.h hVarK = p.this.k();
            this.f146272e = 1;
            Object objB = hVarK.b(this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return p.this.new f(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<AllZusEVisitSummaryDto>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f146274d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f146276f;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f146274d = obj;
            this.f146276f |= PKIFailureInfo.systemUnavail;
            return p.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnj0/p0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.l<tq.e<? super x<ZusEVisitCollectiveDepartmentsDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146277e;

        h(tq.e<? super h> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146277e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lj0.h hVarK = p.this.k();
            this.f146277e = 1;
            Object objA = hVarK.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return p.this.new h(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ZusEVisitCollectiveDepartmentsDto>> eVar) {
            return ((h) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f146279d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f146280e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f146281f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f146282g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f146284j;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f146282g = obj;
            this.f146284j |= PKIFailureInfo.systemUnavail;
            return p.this.g(null, 0L, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lge4/x;", "", "Lnj0/v0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.l<tq.e<? super x<List<? extends ZusEVisitTermDto>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146285e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f146287g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f146288h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalDate f146289j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, long j15, LocalDate localDate, tq.e<? super j> eVar) {
            super(1, eVar);
            this.f146287g = str;
            this.f146288h = j15;
            this.f146289j = localDate;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146285e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lj0.h hVarK = p.this.k();
            String str = this.f146287g;
            long j15 = this.f146288h;
            LocalDate localDate = this.f146289j;
            this.f146285e = 1;
            Object objG = hVarK.g(str, j15, localDate, this);
            return objG == objE ? objE : objG;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return p.this.new j(this.f146287g, this.f146288h, this.f146289j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<List<ZusEVisitTermDto>>> eVar) {
            return ((j) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f146290d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f146291e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f146293g;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f146291e = obj;
            this.f146293g |= PKIFailureInfo.systemUnavail;
            return p.this.d(0L, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnj0/r0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.l<tq.e<? super x<ZusEVisitDetailsDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146294e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f146296g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(long j15, tq.e<? super l> eVar) {
            super(1, eVar);
            this.f146296g = j15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146294e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lj0.h hVarK = p.this.k();
            long j15 = this.f146296g;
            this.f146294e = 1;
            Object objD = hVarK.d(j15, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return p.this.new l(this.f146296g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ZusEVisitDetailsDto>> eVar) {
            return ((l) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class m extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f146297d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f146299f;

        m(tq.e<? super m> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f146297d = obj;
            this.f146299f |= PKIFailureInfo.systemUnavail;
            return p.this.c(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lge4/x;", "", "Lnj0/w0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.l<tq.e<? super x<List<? extends ZusEVisitTopicDto>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146300e;

        n(tq.e<? super n> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146300e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            lj0.h hVarK = p.this.k();
            this.f146300e = 1;
            Object objC = hVarK.c(this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return p.this.new n(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<List<ZusEVisitTopicDto>>> eVar) {
            return ((n) M(eVar)).J(i0.f148189a);
        }
    }

    public p(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: oj0.o
            @Override // er.a
            public final Object a() {
                return p.j(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lj0.h j(w wVar) {
        return (lj0.h) w.b(wVar, null, lj0.h.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lj0.h k() {
        return (lj0.h) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rj0.h
    public Object a(tq.e<? super dx.i<? extends dx.b, ZusEVisitCollectiveDepartments>> eVar) throws Throwable {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f146276f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f146276f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objB = gVar.f146274d;
        Object objE = uq.b.e();
        int i16 = gVar.f146276f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            h hVar = new h(null);
            gVar.f146276f = 1;
            objB = g0Var.b(hVar, gVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(mj0.f.e((ZusEVisitCollectiveDepartmentsDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rj0.h
    public Object b(tq.e<? super dx.i<? extends dx.b, AllZusEVisitSummary>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f146271f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f146271f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f146269d;
        Object objE = uq.b.e();
        int i16 = eVar2.f146271f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            f fVar = new f(null);
            eVar2.f146271f = 1;
            objB = g0Var.b(fVar, eVar2);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(mj0.f.c((AllZusEVisitSummaryDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rj0.h
    public Object c(tq.e<? super dx.i<? extends dx.b, ? extends List<ZusEVisitTopic>>> eVar) throws Throwable {
        m mVar;
        if (eVar instanceof m) {
            mVar = (m) eVar;
            int i15 = mVar.f146299f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                mVar.f146299f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                mVar = new m(eVar);
            }
        } else {
            mVar = new m(eVar);
        }
        Object objB = mVar.f146297d;
        Object objE = uq.b.e();
        int i16 = mVar.f146299f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            n nVar = new n(null);
            mVar.f146299f = 1;
            objB = g0Var.b(nVar, mVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        List list = (List) ((dx.i.Right) iVar).b();
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mj0.f.m((ZusEVisitTopicDto) it.next()));
        }
        return new dx.i.Right(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rj0.h
    public Object d(long j15, tq.e<? super dx.i<? extends dx.b, ZusEVisitDetails>> eVar) throws Throwable {
        k kVar;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i15 = kVar.f146293g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f146293g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        Object objB = kVar.f146291e;
        Object objE = uq.b.e();
        int i16 = kVar.f146293g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            l lVar = new l(j15, null);
            kVar.f146290d = j15;
            kVar.f146293g = 1;
            objB = g0Var.b(lVar, kVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(mj0.f.h((ZusEVisitDetailsDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rj0.h
    public Object e(String str, b0 b0Var, tq.e<? super dx.i<? extends dx.b, AccessibleZusEVisitDepartments>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f146264h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f146264h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f146262f;
        Object objE = uq.b.e();
        int i16 = cVar.f146264h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(str, b0Var, null);
            cVar.f146260d = vq.j.a(str);
            cVar.f146261e = vq.j.a(b0Var);
            cVar.f146264h = 1;
            objB = g0Var.b(dVar, cVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(mj0.f.b((AccessibleZusEVisitDepartmentsDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rj0.h
    public Object f(BookZusEVisit bookZusEVisit, tq.e<? super dx.i<? extends dx.b, BookedZusEVisitSummary>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f146256g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f146256g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f146254e;
        Object objE = uq.b.e();
        int i16 = aVar.f146256g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(bookZusEVisit, null);
            aVar.f146253d = vq.j.a(bookZusEVisit);
            aVar.f146256g = 1;
            objB = g0Var.b(bVar, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(mj0.f.d((BookedZusEVisitSummaryDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // rj0.h
    public Object g(String str, long j15, LocalDate localDate, tq.e<? super dx.i<? extends dx.b, ? extends List<ZusEVisitTerm>>> eVar) throws Throwable {
        i iVar;
        if (eVar instanceof i) {
            iVar = (i) eVar;
            int i15 = iVar.f146284j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f146284j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(eVar);
            }
        } else {
            iVar = new i(eVar);
        }
        i iVar2 = iVar;
        Object objB = iVar2.f146282g;
        Object objE = uq.b.e();
        int i16 = iVar2.f146284j;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            j jVar = new j(str, j15, localDate, null);
            iVar2.f146279d = vq.j.a(str);
            iVar2.f146280e = vq.j.a(localDate);
            iVar2.f146281f = j15;
            iVar2.f146284j = 1;
            objB = g0Var.b(jVar, iVar2);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar3 = (dx.i) objB;
        if (iVar3 instanceof dx.i.Left) {
            return iVar3;
        }
        if (!(iVar3 instanceof dx.i.Right)) {
            throw new oq.p();
        }
        List list = (List) ((dx.i.Right) iVar3).b();
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mj0.f.k((ZusEVisitTermDto) it.next()));
        }
        return new dx.i.Right(arrayList);
    }
}
