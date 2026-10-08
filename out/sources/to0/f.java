package to0;

import dx.i;
import er.l;
import ge4.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oo0.BEReportIssueReason;
import oo0.CategoryTopics;
import oo0.Topic;
import oq.i0;
import oq.k;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import pq.v;
import so0.CategorizedTopicsDtoDto;
import so0.ReportIssueReasonDtoDto;
import so0.ReportIssueReasonResponseDto;
import so0.b0;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\n0\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lto0/f;", "Lvo0/c;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ldx/i;", "Ldx/b;", "", "Loo0/d;", "a", "(Ltq/e;)Ljava/lang/Object;", "Loo0/u$b;", "topicType", "Loo0/b;", "b", "(Loo0/u$b;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lqo0/c;", "Loq/k;", "f", "()Lqo0/c;", "client", "feedbackservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements vo0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f191279d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f191281f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f191279d = obj;
            this.f191281f |= PKIFailureInfo.systemUnavail;
            return f.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lso0/c;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements l<tq.e<? super x<CategorizedTopicsDtoDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191282e;

        b(tq.e<? super b> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f191282e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            qo0.c cVarF = f.this.f();
            this.f191282e = 1;
            Object objA = cVarF.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<CategorizedTopicsDtoDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f191284d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f191285e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f191287g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f191285e = obj;
            this.f191287g |= PKIFailureInfo.systemUnavail;
            return f.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lso0/z;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements l<tq.e<? super x<ReportIssueReasonResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f191288e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Topic.b f191290g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Topic.b bVar, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f191290g = bVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f191288e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            qo0.c cVarF = f.this.f();
            b0 b0VarH = ro0.b.h(this.f191290g);
            this.f191288e = 1;
            Object objB = cVarF.b(b0VarH, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new d(this.f191290g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<ReportIssueReasonResponseDto>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    public f(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: to0.e
            @Override // er.a
            public final Object a() {
                return f.e(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qo0.c e(w wVar) {
        return (qo0.c) w.b(wVar, null, qo0.c.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qo0.c f() {
        return (qo0.c) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // vo0.c
    public Object a(tq.e<? super i<? extends dx.b, ? extends List<CategoryTopics>>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f191281f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f191281f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f191279d;
        Object objE = uq.b.e();
        int i16 = aVar.f191281f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(null);
            aVar.f191281f = 1;
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
        i iVar = (i) objB;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(ro0.b.b((CategorizedTopicsDtoDto) ((i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // vo0.c
    public Object b(Topic.b bVar, tq.e<? super i<? extends dx.b, ? extends List<BEReportIssueReason>>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f191287g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f191287g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f191285e;
        Object objE = uq.b.e();
        int i16 = cVar.f191287g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(bVar, null);
            cVar.f191284d = j.a(bVar);
            cVar.f191287g = 1;
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
        i iVar = (i) objB;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        List<ReportIssueReasonDtoDto> listA = ((ReportIssueReasonResponseDto) ((i.Right) iVar).b()).a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(ro0.b.d((ReportIssueReasonDtoDto) it.next()));
        }
        return new i.Right(arrayList);
    }
}
