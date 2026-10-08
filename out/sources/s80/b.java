package s80;

import dx.i;
import ge4.x;
import jt3.AttendanceStatusDetailsDto;
import jt3.AttendanceSummaryDto;
import oq.i0;
import oq.k;
import oq.l;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import u80.BEAttendanceStatusDetails;
import u80.BEAttendanceSummary;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Ls80/b;", "Lv80/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ldx/i;", "Ldx/b;", "Lu80/e;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lu80/b;", "attendanceStatus", "", "semesterId", "Lu80/c;", "b", "(Lu80/b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/w;", "Lpl/gov/coi/common/network/g0;", "Lit3/a;", "c", "Loq/k;", "f", "()Lit3/a;", "attendanceApi", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements v80.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w httpServiceFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k attendanceApi = l.a(new er.a() { // from class: s80.a
        @Override // er.a
        public final Object a() {
            return b.e(this.f178906a);
        }
    });

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f178910d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f178911e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f178912f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f178914h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f178912f = obj;
            this.f178914h |= PKIFailureInfo.systemUnavail;
            return b.this.b(null, null, this);
        }
    }

    /* JADX INFO: renamed from: s80.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljt3/c;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C4593b extends vq.k implements er.l<tq.e<? super x<AttendanceStatusDetailsDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178915e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ u80.b f178917g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f178918h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4593b(u80.b bVar, String str, tq.e<? super C4593b> eVar) {
            super(1, eVar);
            this.f178917g = bVar;
            this.f178918h = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f178915e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            it3.a aVarF = b.this.f();
            jt3.b bVarM = r80.a.M(this.f178917g);
            String str = this.f178918h;
            this.f178915e = 1;
            Object objB = aVarF.b(bVarM, str, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new C4593b(this.f178917g, this.f178918h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<AttendanceStatusDetailsDto>> eVar) {
            return ((C4593b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f178919d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f178921f;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f178919d = obj;
            this.f178921f |= PKIFailureInfo.systemUnavail;
            return b.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljt3/e;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super x<AttendanceSummaryDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178922e;

        d(tq.e<? super d> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f178922e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            it3.a aVarF = b.this.f();
            this.f178922e = 1;
            Object objA = aVarF.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new d(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<AttendanceSummaryDto>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    public b(w wVar, g0 g0Var) {
        this.httpServiceFactory = wVar;
        this.networkCallMediator = g0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final it3.a e(b bVar) {
        return (it3.a) w.b(bVar.httpServiceFactory, null, it3.a.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final it3.a f() {
        return (it3.a) this.attendanceApi.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // v80.a
    public Object a(tq.e<? super i<? extends dx.b, BEAttendanceSummary>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f178921f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f178921f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f178919d;
        Object objE = uq.b.e();
        int i16 = cVar.f178921f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(null);
            cVar.f178921f = 1;
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
            return new i.Right(r80.a.e((AttendanceSummaryDto) ((i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // v80.a
    public Object b(u80.b bVar, String str, tq.e<? super i<? extends dx.b, BEAttendanceStatusDetails>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f178914h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f178914h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f178912f;
        Object objE = uq.b.e();
        int i16 = aVar.f178914h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C4593b c4593b = new C4593b(bVar, str, null);
            aVar.f178910d = j.a(bVar);
            aVar.f178911e = j.a(str);
            aVar.f178914h = 1;
            objB = g0Var.b(c4593b, aVar);
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
            return new i.Right(r80.a.c((AttendanceStatusDetailsDto) ((i.Right) iVar).b()));
        }
        throw new p();
    }
}
