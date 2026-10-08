package ys0;

import dx.i;
import er.l;
import ge4.x;
import java.time.LocalDate;
import oq.i0;
import oq.k;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import ts0.RestrictionChecksPage;
import ts0.RestrictionStatusChangesPage;
import vq.j;
import xs0.RestrictionChecksPageDto;
import xs0.RestrictionStatusChangesPageDto;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00140\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\u0015\u0010\u000fJ$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00140\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lys0/d;", "Lat0/b;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ljava/time/LocalDate;", "dateFrom", "dateTo", "Ldx/i;", "Ldx/b;", "Lts0/j;", "b", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Ltq/e;)Ljava/lang/Object;", "", "pageId", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lts0/o;", "c", "d", "Lpl/gov/coi/common/network/g0;", "Lvs0/b;", "Loq/k;", "h", "()Lvs0/b;", "client", "peselrestrictionservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements at0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f229147d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f229148e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f229150g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f229148e = obj;
            this.f229150g |= PKIFailureInfo.systemUnavail;
            return d.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lxs0/i;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements l<tq.e<? super x<RestrictionChecksPageDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229151e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f229153g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f229153g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f229151e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            vs0.b bVarH = d.this.h();
            String str = this.f229153g;
            this.f229151e = 1;
            Object objA = bVarH.a(str, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new b(this.f229153g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<RestrictionChecksPageDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f229154d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f229155e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229156f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f229158h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f229156f = obj;
            this.f229158h |= PKIFailureInfo.systemUnavail;
            return d.this.b(null, null, this);
        }
    }

    /* JADX INFO: renamed from: ys0.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lxs0/i;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C6152d extends vq.k implements l<tq.e<? super x<RestrictionChecksPageDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229159e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalDate f229161g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ LocalDate f229162h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6152d(LocalDate localDate, LocalDate localDate2, tq.e<? super C6152d> eVar) {
            super(1, eVar);
            this.f229161g = localDate;
            this.f229162h = localDate2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f229159e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            vs0.b bVarH = d.this.h();
            LocalDate localDate = this.f229161g;
            LocalDate localDate2 = this.f229162h;
            this.f229159e = 1;
            Object objB = bVarH.b(localDate, localDate2, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new C6152d(this.f229161g, this.f229162h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<RestrictionChecksPageDto>> eVar) {
            return ((C6152d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f229163d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f229164e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f229166g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f229164e = obj;
            this.f229166g |= PKIFailureInfo.systemUnavail;
            return d.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lxs0/n;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements l<tq.e<? super x<RestrictionStatusChangesPageDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229167e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f229169g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f229169g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f229167e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            vs0.b bVarH = d.this.h();
            String str = this.f229169g;
            this.f229167e = 1;
            Object objD = bVarH.d(str, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new f(this.f229169g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<RestrictionStatusChangesPageDto>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f229170d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f229171e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f229172f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f229174h;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f229172f = obj;
            this.f229174h |= PKIFailureInfo.systemUnavail;
            return d.this.c(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lxs0/n;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements l<tq.e<? super x<RestrictionStatusChangesPageDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f229175e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalDate f229177g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ LocalDate f229178h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(LocalDate localDate, LocalDate localDate2, tq.e<? super h> eVar) {
            super(1, eVar);
            this.f229177g = localDate;
            this.f229178h = localDate2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f229175e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            vs0.b bVarH = d.this.h();
            LocalDate localDate = this.f229177g;
            LocalDate localDate2 = this.f229178h;
            this.f229175e = 1;
            Object objC = bVarH.c(localDate, localDate2, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new h(this.f229177g, this.f229178h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<RestrictionStatusChangesPageDto>> eVar) {
            return ((h) M(eVar)).J(i0.f148189a);
        }
    }

    public d(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: ys0.c
            @Override // er.a
            public final Object a() {
                return d.g(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vs0.b g(w wVar) {
        return (vs0.b) w.b(wVar, null, vs0.b.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vs0.b h() {
        return (vs0.b) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // at0.b
    public Object a(String str, tq.e<? super i<? extends dx.b, RestrictionChecksPage>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f229150g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f229150g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f229148e;
        Object objE = uq.b.e();
        int i16 = aVar.f229150g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(str, null);
            aVar.f229147d = j.a(str);
            aVar.f229150g = 1;
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
            return new i.Right(ws0.a.h((RestrictionChecksPageDto) ((i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // at0.b
    public Object b(LocalDate localDate, LocalDate localDate2, tq.e<? super i<? extends dx.b, RestrictionChecksPage>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f229158h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f229158h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f229156f;
        Object objE = uq.b.e();
        int i16 = cVar.f229158h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C6152d c6152d = new C6152d(localDate, localDate2, null);
            cVar.f229154d = j.a(localDate);
            cVar.f229155e = j.a(localDate2);
            cVar.f229158h = 1;
            objB = g0Var.b(c6152d, cVar);
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
            return new i.Right(ws0.a.h((RestrictionChecksPageDto) ((i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // at0.b
    public Object c(LocalDate localDate, LocalDate localDate2, tq.e<? super i<? extends dx.b, RestrictionStatusChangesPage>> eVar) throws Throwable {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f229174h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f229174h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objB = gVar.f229172f;
        Object objE = uq.b.e();
        int i16 = gVar.f229174h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            h hVar = new h(localDate, localDate2, null);
            gVar.f229170d = j.a(localDate);
            gVar.f229171e = j.a(localDate2);
            gVar.f229174h = 1;
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
        i iVar = (i) objB;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(ws0.a.p((RestrictionStatusChangesPageDto) ((i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // at0.b
    public Object d(String str, tq.e<? super i<? extends dx.b, RestrictionStatusChangesPage>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f229166g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f229166g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f229164e;
        Object objE = uq.b.e();
        int i16 = eVar2.f229166g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            f fVar = new f(str, null);
            eVar2.f229163d = j.a(str);
            eVar2.f229166g = 1;
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
        i iVar = (i) objB;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            return new i.Right(ws0.a.p((RestrictionStatusChangesPageDto) ((i.Right) iVar).b()));
        }
        throw new p();
    }
}
