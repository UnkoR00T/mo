package ft0;

import dx.i;
import er.l;
import et0.AutocompleteRequest;
import et0.AutocompleteResponse;
import et0.GeocodeLocationResponse;
import et0.PlaceDetailsResponse;
import ge4.x;
import ht0.BEPlaceDetails;
import ht0.BEPlaceSuggestion;
import java.util.List;
import oq.i0;
import oq.k;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import vq.j;
import vy.Coordinates;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00140\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0015\u0010\u0011J$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00140\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lft0/b;", "Lit0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "", "query", "Lht0/d;", "sessionToken", "Ldx/i;", "Ldx/b;", "", "Lht0/c;", "c", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lht0/b;", "placeId", "Lht0/a;", "b", "Lvy/c;", "coordinates", "a", "(Lvy/c;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lct0/a;", "Loq/k;", "g", "()Lct0/a;", "client", "places_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements it0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f66981d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f66982e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66983f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f66985h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f66983f = obj;
            this.f66985h |= PKIFailureInfo.systemUnavail;
            return b.this.b(null, null, this);
        }
    }

    /* JADX INFO: renamed from: ft0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Let0/h;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C1500b extends vq.k implements l<tq.e<? super x<PlaceDetailsResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66986e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f66988g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f66989h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1500b(String str, String str2, tq.e<? super C1500b> eVar) {
            super(1, eVar);
            this.f66988g = str;
            this.f66989h = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f66986e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ct0.a aVarG = b.this.g();
            String str = this.f66988g;
            String str2 = this.f66989h;
            this.f66986e = 1;
            Object objB = aVarG.b(str, str2, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new C1500b(this.f66988g, this.f66989h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<PlaceDetailsResponse>> eVar) {
            return ((C1500b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f66990d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f66991e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f66993g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f66991e = obj;
            this.f66993g |= PKIFailureInfo.systemUnavail;
            return b.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Let0/f;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements l<tq.e<? super x<GeocodeLocationResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66994e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Coordinates f66996g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Coordinates coordinates, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f66996g = coordinates;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f66994e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ct0.a aVarG = b.this.g();
            double latitude = this.f66996g.getLatitude();
            double longitude = this.f66996g.getLongitude();
            this.f66994e = 1;
            Object objA = aVarG.a(latitude, longitude, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new d(this.f66996g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<GeocodeLocationResponse>> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f66997d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f66998e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66999f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f67001h;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f66999f = obj;
            this.f67001h |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Let0/d;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements l<tq.e<? super x<AutocompleteResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f67002e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f67004g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f67005h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, String str2, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f67004g = str;
            this.f67005h = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f67002e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ct0.a aVarG = b.this.g();
            AutocompleteRequest autocompleteRequest = new AutocompleteRequest(this.f67004g);
            String str = this.f67005h;
            this.f67002e = 1;
            Object objC = aVarG.c(autocompleteRequest, str, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new f(this.f67004g, this.f67005h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<AutocompleteResponse>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    public b(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: ft0.a
            @Override // er.a
            public final Object a() {
                return b.f(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ct0.a f(w wVar) {
        return (ct0.a) w.b(wVar, null, ct0.a.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ct0.a g() {
        return (ct0.a) this.client.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // it0.a
    public Object a(Coordinates coordinates, tq.e<? super i<? extends dx.b, BEPlaceDetails>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f66993g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f66993g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f66991e;
        Object objE = uq.b.e();
        int i16 = cVar.f66993g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            d dVar = new d(coordinates, null);
            cVar.f66990d = j.a(coordinates);
            cVar.f66993g = 1;
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
            return new i.Right(dt0.a.b((GeocodeLocationResponse) ((i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // it0.a
    public Object b(String str, String str2, tq.e<? super i<? extends dx.b, BEPlaceDetails>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f66985h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f66985h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f66983f;
        Object objE = uq.b.e();
        int i16 = aVar.f66985h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C1500b c1500b = new C1500b(str, str2, null);
            aVar.f66981d = j.a(str);
            aVar.f66982e = j.a(str2);
            aVar.f66985h = 1;
            objB = g0Var.b(c1500b, aVar);
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
            return new i.Right(dt0.a.d((PlaceDetailsResponse) ((i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // it0.a
    public Object c(String str, String str2, tq.e<? super i<? extends dx.b, ? extends List<BEPlaceSuggestion>>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f67001h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f67001h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f66999f;
        Object objE = uq.b.e();
        int i16 = eVar2.f67001h;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            f fVar = new f(str, str2, null);
            eVar2.f66997d = j.a(str);
            eVar2.f66998e = j.a(str2);
            eVar2.f67001h = 1;
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
            return new i.Right(dt0.a.f((AutocompleteResponse) ((i.Right) iVar).b()));
        }
        throw new p();
    }
}
