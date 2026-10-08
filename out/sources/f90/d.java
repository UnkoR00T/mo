package f90;

import dx.i;
import er.l;
import ge4.x;
import h90.BENotificationSettingsUpdateEntry;
import h90.BENotificationsSettings;
import java.util.List;
import nt3.PushSettingsDto;
import nt3.PushSettingsPresentationDto;
import oq.i0;
import oq.k;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lf90/d;", "Li90/b;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ldx/i;", "Ldx/b;", "Lh90/d;", "a", "(Ltq/e;)Ljava/lang/Object;", "", "Lh90/c;", "settings", "Loq/i0;", "c", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lmt3/c;", "b", "Loq/k;", "e", "()Lmt3/c;", "httpService", "notificationsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements i90.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k httpService;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f60327d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f60329f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f60327d = obj;
            this.f60329f |= PKIFailureInfo.systemUnavail;
            return d.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lnt3/k;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements l<tq.e<? super x<PushSettingsPresentationDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f60330e;

        b(tq.e<? super b> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f60330e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mt3.c cVarE = d.this.e();
            this.f60330e = 1;
            Object objA = cVarE.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<PushSettingsPresentationDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f60332e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<BENotificationSettingsUpdateEntry> f60334g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<BENotificationSettingsUpdateEntry> list, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f60334g = list;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f60332e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mt3.c cVarE = d.this.e();
            PushSettingsDto pushSettingsDtoH = e90.a.h(this.f60334g);
            this.f60332e = 1;
            Object objB = cVarE.b(pushSettingsDtoH, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new c(this.f60334g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((c) M(eVar)).J(i0.f148189a);
        }
    }

    public d(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.httpService = oq.l.a(new er.a() { // from class: f90.c
            @Override // er.a
            public final Object a() {
                return d.f(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mt3.c e() {
        return (mt3.c) this.httpService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mt3.c f(w wVar) {
        return (mt3.c) w.b(wVar, null, mt3.c.class, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // i90.b
    public Object a(tq.e<? super i<? extends dx.b, BENotificationsSettings>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f60329f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f60329f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f60327d;
        Object objE = uq.b.e();
        int i16 = aVar.f60329f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(null);
            aVar.f60329f = 1;
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
            return new i.Right(e90.a.c((PushSettingsPresentationDto) ((i.Right) iVar).b()));
        }
        throw new p();
    }

    @Override // i90.b
    public Object c(List<BENotificationSettingsUpdateEntry> list, tq.e<? super i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new c(list, null), eVar);
    }
}
