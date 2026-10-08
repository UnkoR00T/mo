package gh0;

import bh0.BETerytDetail;
import dx.i;
import er.l;
import er.p;
import fh0.TerytDetailsResponse;
import ge4.x;
import java.util.List;
import oq.i0;
import oq.k;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JL\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000f2(\u0010\u000e\u001a$\b\u0001\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\bH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000fH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ2\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001f\u0010 J*\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000f2\u0006\u0010!\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\"\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u001b\u0010'\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lgh0/d;", "Lih0/b;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Lkotlin/Function2;", "Ldh0/b;", "Ltq/e;", "Lge4/x;", "Lfh0/f;", "", "block", "Ldx/i;", "Ldx/b;", "", "Lbh0/a;", "k", "(Ler/p;Ltq/e;)Ljava/lang/Object;", "b", "(Ltq/e;)Ljava/lang/Object;", "Lbh0/a$b;", "provinceId", "d", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "countyId", "a", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "communityId", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "cityId", "c", "Lpl/gov/coi/common/network/g0;", "Loq/k;", "j", "()Ldh0/b;", "client", "addressservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements ih0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k client;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldh0/b;", "Lge4/x;", "Lfh0/f;", "<anonymous>", "(Ldh0/b;)Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements p<dh0.b, tq.e<? super x<TerytDetailsResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f72929e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f72930f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f72931g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f72932h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f72933j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2, String str3, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f72931g = str;
            this.f72932h = str2;
            this.f72933j = str3;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dh0.b bVar = (dh0.b) this.f72930f;
            Object objE = uq.b.e();
            int i15 = this.f72929e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            String str = this.f72931g;
            String str2 = this.f72932h;
            String str3 = this.f72933j;
            this.f72930f = j.a(bVar);
            this.f72929e = 1;
            Object objD = bVar.d(str, str2, str3, this);
            return objD == objE ? objE : objD;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(dh0.b bVar, tq.e<? super x<TerytDetailsResponse>> eVar) {
            return ((a) v(bVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f72931g, this.f72932h, this.f72933j, eVar);
            aVar.f72930f = obj;
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldh0/b;", "Lge4/x;", "Lfh0/f;", "<anonymous>", "(Ldh0/b;)Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements p<dh0.b, tq.e<? super x<TerytDetailsResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f72934e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f72935f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f72936g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f72937h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f72936g = str;
            this.f72937h = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dh0.b bVar = (dh0.b) this.f72935f;
            Object objE = uq.b.e();
            int i15 = this.f72934e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            String str = this.f72936g;
            String str2 = this.f72937h;
            this.f72935f = j.a(bVar);
            this.f72934e = 1;
            Object objE2 = bVar.e(str, str2, this);
            return objE2 == objE ? objE : objE2;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(dh0.b bVar, tq.e<? super x<TerytDetailsResponse>> eVar) {
            return ((b) v(bVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(this.f72936g, this.f72937h, eVar);
            bVar.f72935f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldh0/b;", "Lge4/x;", "Lfh0/f;", "<anonymous>", "(Ldh0/b;)Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements p<dh0.b, tq.e<? super x<TerytDetailsResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f72938e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f72939f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f72940g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f72940g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dh0.b bVar = (dh0.b) this.f72939f;
            Object objE = uq.b.e();
            int i15 = this.f72938e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            String str = this.f72940g;
            this.f72939f = j.a(bVar);
            this.f72938e = 1;
            Object objB = bVar.b(str, this);
            return objB == objE ? objE : objB;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(dh0.b bVar, tq.e<? super x<TerytDetailsResponse>> eVar) {
            return ((c) v(bVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = new c(this.f72940g, eVar);
            cVar.f72939f = obj;
            return cVar;
        }
    }

    /* JADX INFO: renamed from: gh0.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldh0/b;", "Lge4/x;", "Lfh0/f;", "<anonymous>", "(Ldh0/b;)Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C1668d extends vq.k implements p<dh0.b, tq.e<? super x<TerytDetailsResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f72941e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f72942f;

        C1668d(tq.e<? super C1668d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dh0.b bVar = (dh0.b) this.f72942f;
            Object objE = uq.b.e();
            int i15 = this.f72941e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            this.f72942f = j.a(bVar);
            this.f72941e = 1;
            Object objA = bVar.a(this);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(dh0.b bVar, tq.e<? super x<TerytDetailsResponse>> eVar) {
            return ((C1668d) v(bVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            C1668d c1668d = new C1668d(eVar);
            c1668d.f72942f = obj;
            return c1668d;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldh0/b;", "Lge4/x;", "Lfh0/f;", "<anonymous>", "(Ldh0/b;)Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements p<dh0.b, tq.e<? super x<TerytDetailsResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f72943e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f72944f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f72945g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f72945g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dh0.b bVar = (dh0.b) this.f72944f;
            Object objE = uq.b.e();
            int i15 = this.f72943e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            String str = this.f72945g;
            this.f72944f = j.a(bVar);
            this.f72943e = 1;
            Object objC = bVar.c(str, this);
            return objC == objE ? objE : objC;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(dh0.b bVar, tq.e<? super x<TerytDetailsResponse>> eVar) {
            return ((e) v(bVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = new e(this.f72945g, eVar);
            eVar2.f72944f = obj;
            return eVar2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f72946d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f72947e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f72949g;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f72947e = obj;
            this.f72949g |= PKIFailureInfo.systemUnavail;
            return d.this.k(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfh0/f;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements l<tq.e<? super x<TerytDetailsResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f72950e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p<dh0.b, tq.e<? super x<TerytDetailsResponse>>, Object> f72951f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ d f72952g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(p<? super dh0.b, ? super tq.e<? super x<TerytDetailsResponse>>, ? extends Object> pVar, d dVar, tq.e<? super g> eVar) {
            super(1, eVar);
            this.f72951f = pVar;
            this.f72952g = dVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f72950e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            p<dh0.b, tq.e<? super x<TerytDetailsResponse>>, Object> pVar = this.f72951f;
            dh0.b bVarJ = this.f72952g.j();
            this.f72950e = 1;
            Object objB = pVar.B(bVarJ, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return new g(this.f72951f, this.f72952g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<TerytDetailsResponse>> eVar) {
            return ((g) M(eVar)).J(i0.f148189a);
        }
    }

    public d(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: gh0.c
            @Override // er.a
            public final Object a() {
                return d.i(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dh0.b i(w wVar) {
        return (dh0.b) w.b(wVar, null, dh0.b.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dh0.b j() {
        return (dh0.b) this.client.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(p<? super dh0.b, ? super tq.e<? super x<TerytDetailsResponse>>, ? extends Object> pVar, tq.e<? super i<? extends dx.b, ? extends List<BETerytDetail>>> eVar) throws Throwable {
        f fVar;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f72949g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f72949g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object objB = fVar.f72947e;
        Object objE = uq.b.e();
        int i16 = fVar.f72949g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            g gVar = new g(pVar, this, null);
            fVar.f72946d = j.a(pVar);
            fVar.f72949g = 1;
            objB = g0Var.b(gVar, fVar);
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
            return new i.Right(eh0.b.b(((TerytDetailsResponse) ((i.Right) iVar).b()).a()));
        }
        throw new oq.p();
    }

    @Override // ih0.b
    public Object a(String str, String str2, tq.e<? super i<? extends dx.b, ? extends List<BETerytDetail>>> eVar) {
        return k(new b(str, str2, null), eVar);
    }

    @Override // ih0.b
    public Object b(tq.e<? super i<? extends dx.b, ? extends List<BETerytDetail>>> eVar) {
        return k(new C1668d(null), eVar);
    }

    @Override // ih0.b
    public Object c(String str, tq.e<? super i<? extends dx.b, ? extends List<BETerytDetail>>> eVar) {
        return k(new e(str, null), eVar);
    }

    @Override // ih0.b
    public Object d(String str, tq.e<? super i<? extends dx.b, ? extends List<BETerytDetail>>> eVar) {
        return k(new c(str, null), eVar);
    }

    @Override // ih0.b
    public Object e(String str, String str2, String str3, tq.e<? super i<? extends dx.b, ? extends List<BETerytDetail>>> eVar) {
        return k(new a(str, str2, str3, null), eVar);
    }
}
