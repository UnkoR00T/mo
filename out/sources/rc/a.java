package rc;

import ad.Size;
import ed.b0;
import ed.f0;
import fr.t;
import java.util.concurrent.CancellationException;
import ju.p0;
import kc.j;
import kc.n;
import kc.s;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import qc.SourceFetchResult;
import qc.i;
import vq.k;
import zc.ImageRequest;
import zc.Options;
import zc.SuccessResult;
import zc.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 .2\u00020\u0001:\u0002&#B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J8\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ@\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lrc/a;", "Lrc/d;", "Lkc/s;", "imageLoader", "Led/b0;", "systemCallbacks", "Lzc/p;", "requestService", "Led/t;", "logger", "<init>", "(Lkc/s;Led/b0;Lzc/p;Led/t;)V", "Lzc/f;", "request", "", "mappedData", "Lzc/n;", "options", "Lkc/j;", "eventListener", "Lrc/a$b;", "h", "(Lzc/f;Ljava/lang/Object;Lzc/n;Lkc/j;Ltq/e;)Ljava/lang/Object;", "Lkc/h;", "components", "Lqc/i;", "i", "(Lkc/h;Lzc/f;Ljava/lang/Object;Lzc/n;Lkc/j;Ltq/e;)Ljava/lang/Object;", "Lqc/o;", "fetchResult", "g", "(Lqc/o;Lkc/h;Lzc/f;Ljava/lang/Object;Lzc/n;Lkc/j;Ltq/e;)Ljava/lang/Object;", "Lrc/d$a;", "chain", "Lzc/i;", "a", "(Lrc/d$a;Ltq/e;)Ljava/lang/Object;", "Lkc/s;", "b", "Led/b0;", "c", "Lzc/p;", "Luc/e;", "d", "Luc/e;", "memoryCacheService", "e", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements rc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s imageLoader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b0 systemCallbacks;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p requestService;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final uc.e memoryCacheService;

    /* JADX INFO: renamed from: rc.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\u000f¨\u0006\""}, d2 = {"Lrc/a$b;", "", "Lkc/n;", "image", "", "isSampled", "Loc/f;", "dataSource", "", "diskCacheKey", "<init>", "(Lkc/n;ZLoc/f;Ljava/lang/String;)V", "a", "(Lkc/n;ZLoc/f;Ljava/lang/String;)Lrc/a$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lkc/n;", "e", "()Lkc/n;", "b", "Z", "f", "()Z", "c", "Loc/f;", "()Loc/f;", "d", "Ljava/lang/String;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ExecuteResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final n image;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isSampled;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final oc.f dataSource;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String diskCacheKey;

        public ExecuteResult(n nVar, boolean z15, oc.f fVar, String str) {
            this.image = nVar;
            this.isSampled = z15;
            this.dataSource = fVar;
            this.diskCacheKey = str;
        }

        public static /* synthetic */ ExecuteResult b(ExecuteResult executeResult, n nVar, boolean z15, oc.f fVar, String str, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                nVar = executeResult.image;
            }
            if ((i15 & 2) != 0) {
                z15 = executeResult.isSampled;
            }
            if ((i15 & 4) != 0) {
                fVar = executeResult.dataSource;
            }
            if ((i15 & 8) != 0) {
                str = executeResult.diskCacheKey;
            }
            return executeResult.a(nVar, z15, fVar, str);
        }

        public final ExecuteResult a(n image, boolean isSampled, oc.f dataSource, String diskCacheKey) {
            return new ExecuteResult(image, isSampled, dataSource, diskCacheKey);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final oc.f getDataSource() {
            return this.dataSource;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDiskCacheKey() {
            return this.diskCacheKey;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final n getImage() {
            return this.image;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExecuteResult)) {
                return false;
            }
            ExecuteResult executeResult = (ExecuteResult) other;
            return t.c(this.image, executeResult.image) && this.isSampled == executeResult.isSampled && this.dataSource == executeResult.dataSource && t.c(this.diskCacheKey, executeResult.diskCacheKey);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsSampled() {
            return this.isSampled;
        }

        public int hashCode() {
            int iHashCode = ((((this.image.hashCode() * 31) + Boolean.hashCode(this.isSampled)) * 31) + this.dataSource.hashCode()) * 31;
            String str = this.diskCacheKey;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ExecuteResult(image=" + this.image + ", isSampled=" + this.isSampled + ", dataSource=" + this.dataSource + ", diskCacheKey=" + this.diskCacheKey + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f173024d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f173025e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f173026f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f173027g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f173028h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f173029j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f173030k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f173031l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f173032m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f173034p;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f173032m = obj;
            this.f173034p |= PKIFailureInfo.systemUnavail;
            return a.this.g(null, null, null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f173035d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f173036e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f173037f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f173038g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f173039h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f173040j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f173041k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f173042l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f173044n;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f173042l = obj;
            this.f173044n |= PKIFailureInfo.systemUnavail;
            return a.this.h(null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lrc/a$b;", "<anonymous>", "(Lju/p0;)Lrc/a$b;"}, k = 3, mv = {2, 1, 0})
    static final class e extends k implements er.p<p0, tq.e<? super ExecuteResult>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173045e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ fr.p0<i> f173047g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ fr.p0<kc.h> f173048h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ ImageRequest f173049j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Object f173050k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ fr.p0<Options> f173051l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ j f173052m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(fr.p0<i> p0Var, fr.p0<kc.h> p0Var2, ImageRequest imageRequest, Object obj, fr.p0<Options> p0Var3, j jVar, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f173047g = p0Var;
            this.f173048h = p0Var2;
            this.f173049j = imageRequest;
            this.f173050k = obj;
            this.f173051l = p0Var3;
            this.f173052m = jVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f173045e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            a aVar = a.this;
            SourceFetchResult sourceFetchResult = (SourceFetchResult) this.f173047g.f66410a;
            kc.h hVar = this.f173048h.f66410a;
            ImageRequest imageRequest = this.f173049j;
            Object obj2 = this.f173050k;
            Options options = this.f173051l.f66410a;
            j jVar = this.f173052m;
            this.f173045e = 1;
            Object objG = aVar.g(sourceFetchResult, hVar, imageRequest, obj2, options, jVar, this);
            return objG == objE ? objE : objG;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super ExecuteResult> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a.this.new e(this.f173047g, this.f173048h, this.f173049j, this.f173050k, this.f173051l, this.f173052m, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f173053d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f173054e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f173055f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f173056g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f173057h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f173058j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f173059k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f173060l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f173062n;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f173060l = obj;
            this.f173062n |= PKIFailureInfo.systemUnavail;
            return a.this.i(null, null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f173063d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f173064e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f173066g;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f173064e = obj;
            this.f173066g |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lzc/r;", "<anonymous>", "(Lju/p0;)Lzc/r;"}, k = 3, mv = {2, 1, 0})
    static final class h extends k implements er.p<p0, tq.e<? super SuccessResult>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173067e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ImageRequest f173069g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Object f173070h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Options f173071j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ j f173072k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ uc.d.Key f173073l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ rc.d.a f173074m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ImageRequest imageRequest, Object obj, Options options, j jVar, uc.d.Key key, rc.d.a aVar, tq.e<? super h> eVar) {
            super(2, eVar);
            this.f173069g = imageRequest;
            this.f173070h = obj;
            this.f173071j = options;
            this.f173072k = jVar;
            this.f173073l = key;
            this.f173074m = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objH;
            Object objE = uq.b.e();
            int i15 = this.f173067e;
            if (i15 == 0) {
                u.b(obj);
                a aVar = a.this;
                ImageRequest imageRequest = this.f173069g;
                Object obj2 = this.f173070h;
                Options options = this.f173071j;
                j jVar = this.f173072k;
                this.f173067e = 1;
                objH = aVar.h(imageRequest, obj2, options, jVar, this);
                if (objH == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                objH = obj;
            }
            ExecuteResult executeResult = (ExecuteResult) objH;
            a.this.systemCallbacks.a();
            boolean zH = a.this.memoryCacheService.h(this.f173073l, this.f173069g, executeResult);
            n image = executeResult.getImage();
            ImageRequest imageRequest2 = this.f173069g;
            oc.f dataSource = executeResult.getDataSource();
            uc.d.Key key = this.f173073l;
            if (!zH) {
                key = null;
            }
            return new SuccessResult(image, imageRequest2, dataSource, key, executeResult.getDiskCacheKey(), executeResult.getIsSampled(), f0.o(this.f173074m));
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super SuccessResult> eVar) {
            return ((h) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a.this.new h(this.f173069g, this.f173070h, this.f173071j, this.f173072k, this.f173073l, this.f173074m, eVar);
        }
    }

    public a(s sVar, b0 b0Var, p pVar, ed.t tVar) {
        this.imageLoader = sVar;
        this.systemCallbacks = b0Var;
        this.requestService = pVar;
        this.memoryCacheService = new uc.e(sVar, pVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:19:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0090  */
    /* JADX WARN: Code duplicated, block: B:23:0x009e  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0090 -> B:21:0x0097). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object g(qc.SourceFetchResult r7, kc.h r8, zc.ImageRequest r9, java.lang.Object r10, zc.Options r11, kc.j r12, tq.e<? super rc.a.ExecuteResult> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.a.g(qc.o, kc.h, zc.f, java.lang.Object, zc.n, kc.j, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:56:0x016f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0172  */
    /* JADX WARN: Code duplicated, block: B:59:0x0175  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x019a, code lost:
    
        if (r0 == r9) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [T, zc.n] */
    /* JADX WARN: Type inference failed for: r2v18, types: [T, kc.h] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, kc.h] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(zc.ImageRequest r16, java.lang.Object r17, zc.Options r18, kc.j r19, tq.e<? super rc.a.ExecuteResult> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.a.h(zc.f, java.lang.Object, zc.n, kc.j, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0089 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x008a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008a -> B:21:0x008e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object i(kc.h r7, zc.ImageRequest r8, java.lang.Object r9, zc.Options r10, kc.j r11, tq.e<? super qc.i> r12) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.a.i(kc.h, zc.f, java.lang.Object, zc.n, kc.j, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rc.d
    public Object a(rc.d.a aVar, tq.e<? super zc.i> eVar) throws Throwable {
        g gVar;
        Throwable th4;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f173066g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f173066g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object obj = gVar.f173064e;
        Object objE = uq.b.e();
        int i16 = gVar.f173066g;
        try {
            if (i16 != 0) {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            try {
                ImageRequest imageRequestB = aVar.getRequest();
                Object data = imageRequestB.getData();
                Size size = aVar.getSize();
                j jVarL = f0.l(aVar);
                Options optionsB = this.requestService.b(imageRequestB, size);
                ad.f scale = optionsB.getScale();
                jVarL.l(imageRequestB, data);
                Object objJ = this.imageLoader.getComponents().j(data, optionsB);
                jVarL.k(imageRequestB, objJ);
                uc.d.Key keyF = this.memoryCacheService.f(imageRequestB, objJ, optionsB, jVarL);
                uc.d.Value valueA = keyF != null ? this.memoryCacheService.a(imageRequestB, keyF, size, scale) : null;
                if (valueA != null) {
                    return this.memoryCacheService.g(aVar, imageRequestB, keyF, valueA);
                }
                tq.i fetcherCoroutineContext = imageRequestB.getFetcherCoroutineContext();
                try {
                    h hVar = new h(imageRequestB, objJ, optionsB, jVarL, keyF, aVar, null);
                    gVar.f173063d = aVar;
                    gVar.f173066g = 1;
                    Object objG = ju.i.g(fetcherCoroutineContext, hVar, gVar);
                    return objG == objE ? objE : objG;
                } catch (Throwable th5) {
                    th4 = th5;
                    aVar = aVar;
                }
            } catch (Throwable th6) {
                th = th6;
                th4 = th;
            }
            if (th4 instanceof CancellationException) {
                throw th4;
            }
            return f0.c(aVar.getRequest(), th4);
        } catch (Throwable th7) {
            th = th7;
        }
    }
}
