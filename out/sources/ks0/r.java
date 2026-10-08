package ks0;

import ge4.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import js0.CommitmentTypeDto;
import js0.CreateStampDutyRequestDto;
import js0.InstitutionDto;
import js0.StampDutyDto;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import pq.v;
import zr0.BECommitmentType;
import zr0.BECreateStampDutyRequest;
import zr0.BEInstitution;
import zr0.BEStampDuty;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000e0\f2\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00190\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010%\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lks0/r;", "Lms0/f;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "", "commitmentTypeName", "", "pageNumber", "Ldx/i;", "Ldx/b;", "", "Lzr0/a;", "b", "(Ljava/lang/String;ILtq/e;)Ljava/lang/Object;", "commitmentTypeCode", "city", "Lzr0/c;", "a", "(Ljava/lang/String;Ljava/lang/String;ILtq/e;)Ljava/lang/Object;", "Lzr0/b;", "createStampDutyRequest", "Lzr0/e;", "c", "(Lzr0/b;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lhs0/j;", "Loq/k;", "i", "()Lhs0/j;", "stampDutyClient", "Lhs0/g;", "h", "()Lhs0/g;", "institutionsClient", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r implements ms0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k stampDutyClient;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k institutionsClient;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f112534e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f112536g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112534e = obj;
            this.f112536g |= PKIFailureInfo.systemUnavail;
            return r.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljs0/r0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<StampDutyDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112537e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BECreateStampDutyRequest f112539g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(BECreateStampDutyRequest bECreateStampDutyRequest, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f112539g = bECreateStampDutyRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112537e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.j jVarI = r.this.i();
            CreateStampDutyRequestDto createStampDutyRequestDtoF = is0.d.f(this.f112539g);
            this.f112537e = 1;
            Object objB = jVarI.b(createStampDutyRequestDtoF, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return r.this.new b(this.f112539g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<StampDutyDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112540d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112541e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f112542f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f112544h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112542f = obj;
            this.f112544h |= PKIFailureInfo.systemUnavail;
            return r.this.b(null, 0, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lge4/x;", "", "Ljs0/q;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super x<List<? extends CommitmentTypeDto>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112545e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f112547g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f112548h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, int i15, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f112547g = str;
            this.f112548h = i15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112545e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.j jVarI = r.this.i();
            String str = this.f112547g;
            Integer numE = vq.b.e(this.f112548h);
            this.f112545e = 1;
            Object objC = jVarI.c(str, numE, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return r.this.new d(this.f112547g, this.f112548h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<List<CommitmentTypeDto>>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112549d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f112550e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f112551f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f112552g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f112554j;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112552g = obj;
            this.f112554j |= PKIFailureInfo.systemUnavail;
            return r.this.a(null, null, 0, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lge4/x;", "", "Ljs0/x;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super x<List<? extends InstitutionDto>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112555e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f112557g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f112558h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f112559j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, String str2, int i15, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f112557g = str;
            this.f112558h = str2;
            this.f112559j = i15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112555e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.g gVarH = r.this.h();
            String str = this.f112557g;
            String str2 = this.f112558h;
            Integer numE = vq.b.e(this.f112559j);
            this.f112555e = 1;
            Object objA = gVarH.a(str, str2, numE, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return r.this.new f(this.f112557g, this.f112558h, this.f112559j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<List<InstitutionDto>>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    public r(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.stampDutyClient = oq.l.a(new er.a() { // from class: ks0.p
            @Override // er.a
            public final Object a() {
                return r.k(wVar);
            }
        });
        this.institutionsClient = oq.l.a(new er.a() { // from class: ks0.q
            @Override // er.a
            public final Object a() {
                return r.j(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hs0.g h() {
        return (hs0.g) this.institutionsClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hs0.j i() {
        return (hs0.j) this.stampDutyClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs0.g j(w wVar) {
        return (hs0.g) w.b(wVar, null, hs0.g.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs0.j k(w wVar) {
        return (hs0.j) w.b(wVar, null, hs0.j.class, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.f
    public Object a(String str, String str2, int i15, tq.e<? super dx.i<? extends dx.b, ? extends List<BEInstitution>>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i16 = eVar2.f112554j;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f112554j = i16 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f112552g;
        Object objE = uq.b.e();
        int i17 = eVar2.f112554j;
        if (i17 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            f fVar = new f(str, str2, i15, null);
            eVar2.f112549d = vq.j.a(str);
            eVar2.f112550e = vq.j.a(str2);
            eVar2.f112551f = i15;
            eVar2.f112554j = 1;
            objB = g0Var.b(fVar, eVar2);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i17 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return new dx.i.Left((dx.b) ((dx.i.Left) iVar).b());
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        List list = (List) ((dx.i.Right) iVar).b();
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(is0.d.b((InstitutionDto) it.next()));
        }
        return new dx.i.Right(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.f
    public Object b(String str, int i15, tq.e<? super dx.i<? extends dx.b, ? extends List<BECommitmentType>>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i16 = cVar.f112544h;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f112544h = i16 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f112542f;
        Object objE = uq.b.e();
        int i17 = cVar.f112544h;
        if (i17 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(str, i15, null);
            cVar.f112540d = vq.j.a(str);
            cVar.f112541e = i15;
            cVar.f112544h = 1;
            objB = g0Var.b(dVar, cVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i17 != 1) {
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
            arrayList.add(is0.d.a((CommitmentTypeDto) it.next()));
        }
        return new dx.i.Right(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.f
    public Object c(BECreateStampDutyRequest bECreateStampDutyRequest, tq.e<? super dx.i<? extends dx.b, BEStampDuty>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f112536g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f112536g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f112534e;
        Object objE = uq.b.e();
        int i16 = aVar.f112536g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(bECreateStampDutyRequest, null);
            aVar.f112533d = vq.j.a(bECreateStampDutyRequest);
            aVar.f112536g = 1;
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
            return new dx.i.Right(is0.d.d((StampDutyDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }
}
