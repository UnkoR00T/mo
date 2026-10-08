package ph0;

import ge4.x;
import java.util.List;
import kh0.BEAirQualityWidgetPoint;
import kh0.BEBasicMeasurementPoint;
import kh0.BEExtendedMeasurementPoint;
import kh0.BEFavoritePointsContainer;
import oh0.AirQualityWidgetPointDto;
import oh0.FavouritePointWithDictionaryContainerDto;
import oh0.SaveFavouritePointsRequest;
import oh0.SmogMeasurementPointContainerDto;
import oh0.SmogMeasurementPointDetailsDtoExtended;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00150\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0019\u0010\u0012J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u001a\u0010\u0012J\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001b0\bH\u0096@¢\u0006\u0004\b\u001c\u0010\rJ\u000f\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH\u0096@¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\"R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b%\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010(¨\u0006*"}, d2 = {"Lph0/b;", "Lrh0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ldx/i;", "Ldx/b;", "", "Lkh0/c;", "f", "(Ltq/e;)Ljava/lang/Object;", "", "id", "Lkh0/e;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "refresh", "Lkh0/h;", "h", "(ZLtq/e;)Ljava/lang/Object;", "Loq/i0;", "c", "a", "Lkh0/b;", "e", "g", "()V", "favouritePointsIdList", "d", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "Lpl/gov/coi/common/network/g0;", "Lmh0/a;", "Loq/k;", "l", "()Lmh0/a;", "client", "Lkh0/h;", "favoritePointsContainer", "airqualityservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements rh0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private BEFavoritePointsContainer favoritePointsContainer;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157645e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f157647g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f157647g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f157645e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mh0.a aVarL = b.this.l();
            String str = this.f157647g;
            this.f157645e = 1;
            Object objE2 = aVarL.e(str, this);
            return objE2 == objE ? objE : objE2;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new a(this.f157647g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: ph0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3905b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f157648d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f157650f;

        C3905b(tq.e<? super C3905b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f157648d = obj;
            this.f157650f |= PKIFailureInfo.systemUnavail;
            return b.this.e(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loh0/c;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.l<tq.e<? super x<AirQualityWidgetPointDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157651e;

        c(tq.e<? super c> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f157651e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mh0.a aVarL = b.this.l();
            this.f157651e = 1;
            Object objC = aVarL.c(this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new c(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<AirQualityWidgetPointDto>> eVar) {
            return ((c) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f157653d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f157655f;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f157653d = obj;
            this.f157655f |= PKIFailureInfo.systemUnavail;
            return b.this.f(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loh0/k;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.l<tq.e<? super x<SmogMeasurementPointContainerDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157656e;

        e(tq.e<? super e> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f157656e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mh0.a aVarL = b.this.l();
            this.f157656e = 1;
            Object objB = aVarL.b(this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new e(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<SmogMeasurementPointContainerDto>> eVar) {
            return ((e) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f157658d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f157659e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f157661g;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f157659e = obj;
            this.f157661g |= PKIFailureInfo.systemUnavail;
            return b.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loh0/m;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.l<tq.e<? super x<SmogMeasurementPointDetailsDtoExtended>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157662e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f157664g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, tq.e<? super g> eVar) {
            super(1, eVar);
            this.f157664g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f157662e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mh0.a aVarL = b.this.l();
            String str = this.f157664g;
            this.f157662e = 1;
            Object objG = aVarL.g(str, this);
            return objG == objE ? objE : objG;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new g(this.f157664g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<SmogMeasurementPointDetailsDtoExtended>> eVar) {
            return ((g) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f157665d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f157666e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f157668g;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f157666e = obj;
            this.f157668g |= PKIFailureInfo.systemUnavail;
            return b.this.h(false, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loh0/d;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.l<tq.e<? super x<FavouritePointWithDictionaryContainerDto>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157669e;

        i(tq.e<? super i> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f157669e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mh0.a aVarL = b.this.l();
            this.f157669e = 1;
            Object objD = aVarL.d(this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new i(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<FavouritePointWithDictionaryContainerDto>> eVar) {
            return ((i) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157671e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f157673g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, tq.e<? super j> eVar) {
            super(1, eVar);
            this.f157673g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f157671e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mh0.a aVarL = b.this.l();
            String str = this.f157673g;
            this.f157671e = 1;
            Object objA = aVarL.a(str, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new j(this.f157673g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((j) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f157674d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f157675e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f157677g;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f157675e = obj;
            this.f157677g |= PKIFailureInfo.systemUnavail;
            return b.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f157678e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<String> f157680g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(List<String> list, tq.e<? super l> eVar) {
            super(1, eVar);
            this.f157680g = list;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f157678e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mh0.a aVarL = b.this.l();
            SaveFavouritePointsRequest saveFavouritePointsRequest = new SaveFavouritePointsRequest(this.f157680g, null, 2, null);
            this.f157678e = 1;
            Object objF = aVarL.f(saveFavouritePointsRequest, this);
            return objF == objE ? objE : objF;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return b.this.new l(this.f157680g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((l) M(eVar)).J(i0.f148189a);
        }
    }

    public b(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.client = oq.l.a(new er.a() { // from class: ph0.a
            @Override // er.a
            public final Object a() {
                return b.k(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mh0.a k(w wVar) {
        return (mh0.a) w.b(wVar, null, mh0.a.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mh0.a l() {
        return (mh0.a) this.client.getValue();
    }

    @Override // rh0.a
    public Object a(String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new j(str, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rh0.a
    public Object b(String str, tq.e<? super dx.i<? extends dx.b, BEExtendedMeasurementPoint>> eVar) throws Throwable {
        f fVar;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f157661g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f157661g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object objB = fVar.f157659e;
        Object objE = uq.b.e();
        int i16 = fVar.f157661g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            g gVar = new g(str, null);
            fVar.f157658d = vq.j.a(str);
            fVar.f157661g = 1;
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
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(nh0.a.g((SmogMeasurementPointDetailsDtoExtended) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    @Override // rh0.a
    public Object c(String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new a(str, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rh0.a
    public Object d(List<String> list, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        k kVar;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i15 = kVar.f157677g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f157677g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        Object objB = kVar.f157675e;
        Object objE = uq.b.e();
        int i16 = kVar.f157677g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            l lVar = new l(list, null);
            kVar.f157674d = vq.j.a(list);
            kVar.f157677g = 1;
            objB = g0Var.b(lVar, kVar);
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
            return new dx.i.Left((dx.b) ((dx.i.Left) iVar).b());
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new p();
        }
        return new dx.i.Right(i0.f148189a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rh0.a
    public Object e(tq.e<? super dx.i<? extends dx.b, BEAirQualityWidgetPoint>> eVar) throws Throwable {
        C3905b c3905b;
        if (eVar instanceof C3905b) {
            c3905b = (C3905b) eVar;
            int i15 = c3905b.f157650f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c3905b.f157650f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c3905b = new C3905b(eVar);
            }
        } else {
            c3905b = new C3905b(eVar);
        }
        Object objB = c3905b.f157648d;
        Object objE = uq.b.e();
        int i16 = c3905b.f157650f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            c cVar = new c(null);
            c3905b.f157650f = 1;
            objB = g0Var.b(cVar, c3905b);
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
            return new dx.i.Left((dx.b) ((dx.i.Left) iVar).b());
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(nh0.a.e((AirQualityWidgetPointDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rh0.a
    public Object f(tq.e<? super dx.i<? extends dx.b, ? extends List<BEBasicMeasurementPoint>>> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f157655f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f157655f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objB = dVar.f157653d;
        Object objE = uq.b.e();
        int i16 = dVar.f157655f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            e eVar2 = new e(null);
            dVar.f157655f = 1;
            objB = g0Var.b(eVar2, dVar);
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
            return new dx.i.Right(nh0.a.c((SmogMeasurementPointContainerDto) ((dx.i.Right) iVar).b()));
        }
        throw new p();
    }

    @Override // rh0.a
    public void g() {
        this.favoritePointsContainer = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rh0.a
    public Object h(boolean z15, tq.e<? super dx.i<? extends dx.b, BEFavoritePointsContainer>> eVar) throws Throwable {
        h hVar;
        if (eVar instanceof h) {
            hVar = (h) eVar;
            int i15 = hVar.f157668g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                hVar.f157668g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                hVar = new h(eVar);
            }
        } else {
            hVar = new h(eVar);
        }
        Object objB = hVar.f157666e;
        Object objE = uq.b.e();
        int i16 = hVar.f157668g;
        if (i16 == 0) {
            u.b(objB);
            if (!z15) {
                return new dx.i.Right(this.favoritePointsContainer);
            }
            g0 g0Var = this.networkCallMediator;
            i iVar = new i(null);
            hVar.f157665d = z15;
            hVar.f157668g = 1;
            objB = g0Var.b(iVar, hVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar2 = (dx.i) objB;
        if (iVar2 instanceof dx.i.Left) {
            return new dx.i.Left((dx.b) ((dx.i.Left) iVar2).b());
        }
        if (!(iVar2 instanceof dx.i.Right)) {
            throw new p();
        }
        BEFavoritePointsContainer bEFavoritePointsContainerI = nh0.a.i((FavouritePointWithDictionaryContainerDto) ((dx.i.Right) iVar2).b());
        this.favoritePointsContainer = bEFavoritePointsContainerI;
        return new dx.i.Right(bEFavoritePointsContainerI);
    }
}
