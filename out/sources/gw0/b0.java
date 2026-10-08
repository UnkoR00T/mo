package gw0;

import fw0.VehicleHistoryAbroadDto;
import fw0.VehicleHistoryDto;
import fw0.VehicleHistoryTimelineDto;
import java.time.LocalDate;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import uv0.VehicleHistory;
import uv0.VehicleHistoryAbroad;
import uv0.VehicleHistoryTimeline;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b*\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ6\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J6\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00180\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u0019\u0010\u0017J6\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001a0\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u001b\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lgw0/b0;", "Ljw0/f;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lez/e;", "dateFormatter", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;Lez/e;)V", "Ljava/time/LocalDate;", "", "i", "(Ljava/time/LocalDate;)Ljava/lang/String;", "Luv0/d;", "numberPlate", "Luv0/v;", "vin", "firstRegistrationDate", "Ldx/i;", "Ldx/b;", "Luv0/m;", "b", "(Ljava/lang/String;Liy/b0;Ljava/time/LocalDate;Ltq/e;)Ljava/lang/Object;", "Luv0/n;", "c", "Luv0/t;", "a", "Lpl/gov/coi/common/network/g0;", "Lez/e;", "Ldw0/r;", "Loq/k;", "h", "()Ldw0/r;", "client", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b0 implements jw0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final pl.gov.coi.common.network.g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77370d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f77371e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f77372f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f77373g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f77375j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77373g = obj;
            this.f77375j |= PKIFailureInfo.systemUnavail;
            return b0.this.b(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/t3;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super ge4.x<VehicleHistoryDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77376e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f77378g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ iy.b0 f77379h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalDate f77380j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, iy.b0 b0Var, LocalDate localDate, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f77378g = str;
            this.f77379h = b0Var;
            this.f77380j = localDate;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77376e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.r rVarH = b0.this.h();
            String str = this.f77378g;
            String strE = iy.c0.e(this.f77379h);
            String strI = b0.this.i(this.f77380j);
            this.f77376e = 1;
            Object objA = rVarH.a(str, strE, strI, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b0.this.new b(this.f77378g, this.f77379h, this.f77380j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<VehicleHistoryDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77381d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f77382e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f77383f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f77384g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f77386j;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77384g = obj;
            this.f77386j |= PKIFailureInfo.systemUnavail;
            return b0.this.c(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/q3;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super ge4.x<VehicleHistoryAbroadDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77387e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f77389g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ iy.b0 f77390h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalDate f77391j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, iy.b0 b0Var, LocalDate localDate, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f77389g = str;
            this.f77390h = b0Var;
            this.f77391j = localDate;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77387e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.r rVarH = b0.this.h();
            String str = this.f77389g;
            String strE = iy.c0.e(this.f77390h);
            String strI = b0.this.i(this.f77391j);
            this.f77387e = 1;
            Object objC = rVarH.c(str, strE, strI, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b0.this.new d(this.f77389g, this.f77390h, this.f77391j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<VehicleHistoryAbroadDto>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77392d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f77393e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f77394f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f77395g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f77397j;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77395g = obj;
            this.f77397j |= PKIFailureInfo.systemUnavail;
            return b0.this.a(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfw0/y3;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super ge4.x<VehicleHistoryTimelineDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f77398e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f77400g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ iy.b0 f77401h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalDate f77402j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, iy.b0 b0Var, LocalDate localDate, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f77400g = str;
            this.f77401h = b0Var;
            this.f77402j = localDate;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f77398e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            dw0.r rVarH = b0.this.h();
            String str = this.f77400g;
            String strE = iy.c0.e(this.f77401h);
            String strI = b0.this.i(this.f77402j);
            this.f77398e = 1;
            Object objB = rVarH.b(str, strE, strI, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b0.this.new f(this.f77400g, this.f77401h, this.f77402j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super ge4.x<VehicleHistoryTimelineDto>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    public b0(final pl.gov.coi.common.network.w wVar, pl.gov.coi.common.network.g0 g0Var, ez.e eVar) {
        this.networkCallMediator = g0Var;
        this.dateFormatter = eVar;
        this.client = oq.l.a(new er.a() { // from class: gw0.a0
            @Override // er.a
            public final Object a() {
                return b0.g(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dw0.r g(pl.gov.coi.common.network.w wVar) {
        return (dw0.r) pl.gov.coi.common.network.w.b(wVar, null, dw0.r.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dw0.r h() {
        return (dw0.r) this.client.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String i(LocalDate localDate) {
        if (localDate != null) {
            return this.dateFormatter.d(new fz.b.LocalDate(localDate), fz.c.DASHED_REVERSED);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.f
    public Object a(String str, iy.b0 b0Var, LocalDate localDate, tq.e<? super dx.i<? extends dx.b, VehicleHistoryTimeline>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f77397j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f77397j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f77395g;
        Object objE = uq.b.e();
        int i16 = eVar2.f77397j;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            f fVar = new f(str, b0Var, localDate, null);
            eVar2.f77392d = vq.j.a(str);
            eVar2.f77393e = vq.j.a(b0Var);
            eVar2.f77394f = vq.j.a(localDate);
            eVar2.f77397j = 1;
            objB = g0Var.b(fVar, eVar2);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(ew0.e.s((VehicleHistoryTimelineDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.f
    public Object b(String str, iy.b0 b0Var, LocalDate localDate, tq.e<? super dx.i<? extends dx.b, VehicleHistory>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f77375j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f77375j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f77373g;
        Object objE = uq.b.e();
        int i16 = aVar.f77375j;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            b bVar = new b(str, b0Var, localDate, null);
            aVar.f77370d = vq.j.a(str);
            aVar.f77371e = vq.j.a(b0Var);
            aVar.f77372f = vq.j.a(localDate);
            aVar.f77375j = 1;
            objB = g0Var.b(bVar, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(ew0.e.o((VehicleHistoryDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jw0.f
    public Object c(String str, iy.b0 b0Var, LocalDate localDate, tq.e<? super dx.i<? extends dx.b, VehicleHistoryAbroad>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f77386j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f77386j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f77384g;
        Object objE = uq.b.e();
        int i16 = cVar.f77386j;
        if (i16 == 0) {
            oq.u.b(objB);
            pl.gov.coi.common.network.g0 g0Var = this.networkCallMediator;
            d dVar = new d(str, b0Var, localDate, null);
            cVar.f77381d = vq.j.a(str);
            cVar.f77382e = vq.j.a(b0Var);
            cVar.f77383f = vq.j.a(localDate);
            cVar.f77386j = 1;
            objB = g0Var.b(dVar, cVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(ew0.e.p((VehicleHistoryAbroadDto) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }
}
