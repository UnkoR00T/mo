package eq0;

import dq0.GroupedAvailableDefenceTrainingsResponse;
import dq0.RegisterForDefenceTrainingResponseDto;
import dq0.RegisterForDefenceTrainingSignedRequestDto;
import dq0.UnregisterFromDefenceTrainingSignedRequestDto;
import dq0.UserDefenceTrainingsRegistrationsSummaryDto;
import dx.i;
import er.l;
import ge4.x;
import iy.b0;
import iy.c0;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.k;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import vq.j;
import zp0.BEGroupedAvailableDefenceTrainingsResponse;
import zp0.BEUserRegisteredDefenceTraining;
import zp0.UserDefenceTrainingsRegistration;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\bH\u0096@¢\u0006\u0004\b\u000e\u0010\fJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Leq0/b;", "Lgq0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ldx/i;", "Ldx/b;", "Lzp0/d;", "d", "(Ltq/e;)Ljava/lang/Object;", "Lzp0/d0;", "a", "Liy/b0;", "signedRequest", "Lzp0/u;", "c", "(Liy/b0;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "b", "Lpl/gov/coi/common/network/g0;", "Lbq0/a;", "Loq/k;", "h", "()Lbq0/a;", "clientStep", "militaryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k clientStep;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f52709d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f52711f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f52709d = obj;
            this.f52711f |= PKIFailureInfo.systemUnavail;
            return b.this.d(this);
        }
    }

    /* JADX INFO: renamed from: eq0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ldq0/j;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C1241b extends vq.k implements l<tq.e<? super x<GroupedAvailableDefenceTrainingsResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f52712e;

        C1241b(tq.e<? super C1241b> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f52712e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            bq0.a aVarH = b.this.h();
            this.f52712e = 1;
            Object objC = aVarH.c(this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new C1241b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<GroupedAvailableDefenceTrainingsResponse>> eVar) {
            return ((C1241b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f52714d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f52716f;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f52714d = obj;
            this.f52716f |= PKIFailureInfo.systemUnavail;
            return b.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ldq0/r0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements l<tq.e<? super x<UserDefenceTrainingsRegistrationsSummaryDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f52717e;

        d(tq.e<? super d> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f52717e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            bq0.a aVarH = b.this.h();
            this.f52717e = 1;
            Object objA = aVarH.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new d(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<UserDefenceTrainingsRegistrationsSummaryDto>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f52719d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f52720e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f52722g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f52720e = obj;
            this.f52722g |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ldq0/p;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements l<tq.e<? super x<RegisterForDefenceTrainingResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f52723e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b0 f52725g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(b0 b0Var, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f52725g = b0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f52723e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            bq0.a aVarH = b.this.h();
            RegisterForDefenceTrainingSignedRequestDto registerForDefenceTrainingSignedRequestDto = new RegisterForDefenceTrainingSignedRequestDto(c0.e(this.f52725g));
            this.f52723e = 1;
            Object objB = aVarH.b(registerForDefenceTrainingSignedRequestDto, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new f(this.f52725g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<RegisterForDefenceTrainingResponseDto>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f52726e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b0 f52728g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(b0 b0Var, tq.e<? super g> eVar) {
            super(1, eVar);
            this.f52728g = b0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f52726e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            bq0.a aVarH = b.this.h();
            UnregisterFromDefenceTrainingSignedRequestDto unregisterFromDefenceTrainingSignedRequestDto = new UnregisterFromDefenceTrainingSignedRequestDto(c0.e(this.f52728g));
            this.f52726e = 1;
            Object objD = aVarH.d(unregisterFromDefenceTrainingSignedRequestDto, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new g(this.f52728g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((g) M(eVar)).J(i0.f148189a);
        }
    }

    public b(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.clientStep = oq.l.a(new er.a() { // from class: eq0.a
            @Override // er.a
            public final Object a() {
                return b.g(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bq0.a g(w wVar) {
        return (bq0.a) w.b(wVar, null, bq0.a.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bq0.a h() {
        return (bq0.a) this.clientStep.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gq0.a
    public Object a(tq.e<? super i<? extends dx.b, UserDefenceTrainingsRegistration>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f52716f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f52716f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f52714d;
        Object objE = uq.b.e();
        int i16 = cVar.f52716f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(null);
            cVar.f52716f = 1;
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
            return cq0.a.s((UserDefenceTrainingsRegistrationsSummaryDto) ((i.Right) iVar).b());
        }
        throw new p();
    }

    @Override // gq0.a
    public Object b(b0 b0Var, tq.e<? super i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new g(b0Var, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gq0.a
    public Object c(b0 b0Var, tq.e<? super i<? extends dx.b, BEUserRegisteredDefenceTraining>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f52722g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f52722g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f52720e;
        Object objE = uq.b.e();
        int i16 = eVar2.f52722g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            f fVar = new f(b0Var, null);
            eVar2.f52719d = j.a(b0Var);
            eVar2.f52722g = 1;
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
            return cq0.a.h((RegisterForDefenceTrainingResponseDto) ((i.Right) iVar).b());
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gq0.a
    public Object d(tq.e<? super i<? extends dx.b, BEGroupedAvailableDefenceTrainingsResponse>> eVar) throws Throwable {
        a aVar;
        Object objB;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f52711f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f52711f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB2 = aVar.f52709d;
        Object objE = uq.b.e();
        int i16 = aVar.f52711f;
        if (i16 == 0) {
            u.b(objB2);
            g0 g0Var = this.networkCallMediator;
            C1241b c1241b = new C1241b(null);
            aVar.f52711f = 1;
            objB2 = g0Var.b(c1241b, aVar);
            if (objB2 == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB2);
        }
        i iVar = (i) objB2;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        GroupedAvailableDefenceTrainingsResponse groupedAvailableDefenceTrainingsResponse = (GroupedAvailableDefenceTrainingsResponse) ((i.Right) iVar).b();
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    return new i.Right((BEGroupedAvailableDefenceTrainingsResponse) new ex.a().a(cq0.a.g(groupedAvailableDefenceTrainingsResponse)));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }
}
