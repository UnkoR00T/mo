package f90;

import dx.i;
import er.l;
import ge4.x;
import h90.BEPushHistory;
import nt3.NotDisplayedPushCountDto;
import nt3.PushHistoryDto;
import oq.i0;
import oq.k;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\bH\u0096@¢\u0006\u0004\b\u0013\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lf90/f;", "Li90/c;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ldx/i;", "Ldx/b;", "Lh90/e;", "c", "(Ltq/e;)Ljava/lang/Object;", "", "recordId", "Loq/i0;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "b", "Lpl/gov/coi/common/network/g0;", "Lmt3/b;", "Loq/k;", "f", "()Lmt3/b;", "httpService", "notificationsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements i90.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k httpService;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f60338d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f60340f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f60338d = obj;
            this.f60340f |= PKIFailureInfo.systemUnavail;
            return f.this.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnt3/c;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements l<tq.e<? super x<NotDisplayedPushCountDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f60341e;

        b(tq.e<? super b> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f60341e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mt3.b bVarF = f.this.f();
            this.f60341e = 1;
            Object objB = bVarF.b(this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<NotDisplayedPushCountDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f60343d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f60345f;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f60343d = obj;
            this.f60345f |= PKIFailureInfo.systemUnavail;
            return f.this.c(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnt3/e;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements l<tq.e<? super x<PushHistoryDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f60346e;

        d(tq.e<? super d> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f60346e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mt3.b bVarF = f.this.f();
            this.f60346e = 1;
            Object objC = bVarF.c(this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new d(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<PushHistoryDto>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f60348d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f60349e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f60351g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f60349e = obj;
            this.f60351g |= PKIFailureInfo.systemUnavail;
            return f.this.a(null, this);
        }
    }

    /* JADX INFO: renamed from: f90.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C1363f extends vq.k implements l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f60352e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f60354g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1363f(String str, tq.e<? super C1363f> eVar) {
            super(1, eVar);
            this.f60354g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f60352e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mt3.b bVarF = f.this.f();
            String str = this.f60354g;
            this.f60352e = 1;
            Object objA = bVarF.a(str, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return f.this.new C1363f(this.f60354g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((C1363f) M(eVar)).J(i0.f148189a);
        }
    }

    public f(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.httpService = oq.l.a(new er.a() { // from class: f90.e
            @Override // er.a
            public final Object a() {
                return f.g(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mt3.b f() {
        return (mt3.b) this.httpService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mt3.b g(w wVar) {
        return (mt3.b) w.b(wVar, null, mt3.b.class, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // i90.c
    public Object a(String str, tq.e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f60351g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f60351g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f60349e;
        Object objE = uq.b.e();
        int i16 = eVar2.f60351g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C1363f c1363f = new C1363f(str, null);
            eVar2.f60348d = j.a(str);
            eVar2.f60351g = 1;
            objB = g0Var.b(c1363f, eVar2);
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
        return new i.Right(i0.f148189a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // i90.c
    public Object b(tq.e<? super i<? extends dx.b, Long>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f60340f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f60340f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f60338d;
        Object objE = uq.b.e();
        int i16 = aVar.f60340f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(null);
            aVar.f60340f = 1;
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
            return new i.Right(vq.b.f(((NotDisplayedPushCountDto) ((i.Right) iVar).b()).getNotDisplayedPushCount()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // i90.c
    public Object c(tq.e<? super i<? extends dx.b, BEPushHistory>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f60345f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f60345f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f60343d;
        Object objE = uq.b.e();
        int i16 = cVar.f60345f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(null);
            cVar.f60345f = 1;
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
        if (iVar instanceof i.Right) {
            return new i.Right(e90.a.d((PushHistoryDto) ((i.Right) iVar).b()));
        }
        throw new p();
    }
}
