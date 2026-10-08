package pr0;

import fr0.BEAsyncDocumentGenerationResponse;
import ge4.x;
import ir0.RefugeeChildPersonalInfo;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import oq.i0;
import oq.p;
import oq.u;
import or0.AsyncDocumentGenerationResponseDto;
import or0.LoadRefugeeKidDataOutputDtoDto;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lpr0/o;", "Lrr0/g;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ldx/i;", "Ldx/b;", "", "Lir0/a;", "b", "(Ltq/e;)Ljava/lang/Object;", "", "Liy/b0;", "kidsPesel", "Lfr0/c;", "a", "(Ljava/util/Set;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lmr0/g;", "Loq/k;", "f", "()Lmr0/g;", "client", "offlinedocumentsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o implements rr0.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f162112d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f162113e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f162115g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f162113e = obj;
            this.f162115g |= PKIFailureInfo.systemUnavail;
            return o.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lor0/c;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<AsyncDocumentGenerationResponseDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162116e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Set<b0> f162118g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set<b0> set, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f162118g = set;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f162116e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mr0.g gVarF = o.this.f();
            Set<b0> set = this.f162118g;
            ArrayList arrayList = new ArrayList(v.y(set, 10));
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(c0.e((b0) it.next()));
            }
            Set<String> setK1 = v.k1(arrayList);
            this.f162116e = 1;
            Object objA = gVarF.a(setK1, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return o.this.new b(this.f162118g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<AsyncDocumentGenerationResponseDto>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f162119d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f162121f;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f162119d = obj;
            this.f162121f |= PKIFailureInfo.systemUnavail;
            return o.this.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lor0/v0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super x<LoadRefugeeKidDataOutputDtoDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162122e;

        d(tq.e<? super d> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f162122e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mr0.g gVarF = o.this.f();
            this.f162122e = 1;
            Object objB = gVarF.b(this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return o.this.new d(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<LoadRefugeeKidDataOutputDtoDto>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    public o(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: pr0.n
            @Override // er.a
            public final Object a() {
                return o.e(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mr0.g e(w wVar) {
        return (mr0.g) w.b(wVar, null, mr0.g.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mr0.g f() {
        return (mr0.g) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rr0.g
    public Object a(Set<b0> set, tq.e<? super dx.i<? extends dx.b, BEAsyncDocumentGenerationResponse>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f162115g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f162115g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f162113e;
        Object objE = uq.b.e();
        int i16 = aVar.f162115g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(set, null);
            aVar.f162112d = vq.j.a(set);
            aVar.f162115g = 1;
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
            return new dx.i.Right(nr0.b.b((AsyncDocumentGenerationResponseDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rr0.g
    public Object b(tq.e<? super dx.i<? extends dx.b, ? extends List<RefugeeChildPersonalInfo>>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f162121f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f162121f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f162119d;
        Object objE = uq.b.e();
        int i16 = cVar.f162121f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(null);
            cVar.f162121f = 1;
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
            return new dx.i.Right(nr0.b.e((LoadRefugeeKidDataOutputDtoDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }
}
