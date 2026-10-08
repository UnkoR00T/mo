package kc;

import ad.Size;
import android.content.Context;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ju.g2;
import ju.p0;
import ju.q0;
import ju.w0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import zc.ErrorResult;
import zc.ImageRequest;
import zc.SuccessResult;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010*R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010-R\u001a\u00104\u001a\u00020/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00107\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u00106R\u001d\u0010<\u001a\u0004\u0018\u0001088VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b0\u00109*\u0004\b:\u0010;R\u001d\u0010@\u001a\u0004\u0018\u00010=8VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b!\u0010>*\u0004\b?\u0010;R\u000b\u0010B\u001a\u00020A8\u0002X\u0082\u0004¨\u0006C"}, d2 = {"Lkc/w;", "Lkc/s;", "Lkc/w$a;", "options", "<init>", "(Lkc/w$a;)V", "Lzc/f;", "initialRequest", "", "type", "Lzc/i;", "g", "(Lzc/f;ILtq/e;)Ljava/lang/Object;", "Lzc/r;", "result", "Lbd/a;", "target", "Lkc/j;", "eventListener", "Loq/i0;", "k", "(Lzc/r;Lbd/a;Lkc/j;)V", "Lzc/e;", "j", "(Lzc/e;Lbd/a;Lkc/j;)V", "request", "i", "(Lzc/f;Lkc/j;)V", "Lzc/d;", "c", "(Lzc/f;)Lzc/d;", "d", "(Lzc/f;Ltq/e;)Ljava/lang/Object;", "a", "Lkc/w$a;", "h", "()Lkc/w$a;", "Lju/p0;", "b", "Lju/p0;", "scope", "Led/b0;", "Led/b0;", "systemCallbacks", "Lzc/p;", "Lzc/p;", "requestService", "Lkc/h;", "e", "Lkc/h;", "getComponents", "()Lkc/h;", "components", "Lzc/f$b;", "()Lzc/f$b;", "defaults", "Luc/d;", "()Luc/d;", "getMemoryCache$delegate", "(Lkc/w;)Ljava/lang/Object;", "memoryCache", "Lpc/a;", "()Lpc/a;", "getDiskCache$delegate", "diskCache", "Liu/a;", "shutdown", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w implements s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f109852g = AtomicIntegerFieldUpdater.newUpdater(w.class, "f");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Options options;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p0 scope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ed.b0 systemCallbacks;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final zc.p requestService;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h components;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile /* synthetic */ int f109858f;

    /* JADX INFO: renamed from: kc.w$a, reason: from toString */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00078\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00078\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b,\u0010/R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b(\u00100\u001a\u0004\b#\u00101R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\b-\u00103¨\u00064"}, d2 = {"Lkc/w$a;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "application", "Lzc/f$b;", "defaults", "Loq/k;", "Ltq/i;", "mainCoroutineContextLazy", "Luc/d;", "memoryCacheLazy", "Lpc/a;", "diskCacheLazy", "Lkc/j$c;", "eventListenerFactory", "Lkc/h;", "componentRegistry", "Led/t;", "logger", "<init>", "(Landroid/content/Context;Lzc/f$b;Loq/k;Loq/k;Loq/k;Lkc/j$c;Lkc/h;Led/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/content/Context;", "()Landroid/content/Context;", "b", "Lzc/f$b;", "c", "()Lzc/f$b;", "Loq/k;", "g", "()Loq/k;", "d", "h", "e", "f", "Lkc/j$c;", "()Lkc/j$c;", "Lkc/h;", "()Lkc/h;", "Led/t;", "()Led/t;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Options {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Context application;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ImageRequest.Defaults defaults;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final oq.k<tq.i> mainCoroutineContextLazy;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final oq.k<uc.d> memoryCacheLazy;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final oq.k<pc.a> diskCacheLazy;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final j.c eventListenerFactory;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final h componentRegistry;

        /* JADX WARN: Multi-variable type inference failed */
        public Options(Context context, ImageRequest.Defaults defaults, oq.k<? extends tq.i> kVar, oq.k<? extends uc.d> kVar2, oq.k<? extends pc.a> kVar3, j.c cVar, h hVar, ed.t tVar) {
            this.application = context;
            this.defaults = defaults;
            this.mainCoroutineContextLazy = kVar;
            this.memoryCacheLazy = kVar2;
            this.diskCacheLazy = kVar3;
            this.eventListenerFactory = cVar;
            this.componentRegistry = hVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Context getApplication() {
            return this.application;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final h getComponentRegistry() {
            return this.componentRegistry;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ImageRequest.Defaults getDefaults() {
            return this.defaults;
        }

        public final oq.k<pc.a> d() {
            return this.diskCacheLazy;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final j.c getEventListenerFactory() {
            return this.eventListenerFactory;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Options)) {
                return false;
            }
            Options options = (Options) other;
            return fr.t.c(this.application, options.application) && fr.t.c(this.defaults, options.defaults) && fr.t.c(this.mainCoroutineContextLazy, options.mainCoroutineContextLazy) && fr.t.c(this.memoryCacheLazy, options.memoryCacheLazy) && fr.t.c(this.diskCacheLazy, options.diskCacheLazy) && fr.t.c(this.eventListenerFactory, options.eventListenerFactory) && fr.t.c(this.componentRegistry, options.componentRegistry) && fr.t.c(null, null);
        }

        public final ed.t f() {
            return null;
        }

        public final oq.k<tq.i> g() {
            return this.mainCoroutineContextLazy;
        }

        public final oq.k<uc.d> h() {
            return this.memoryCacheLazy;
        }

        public int hashCode() {
            return ((((((((((((this.application.hashCode() * 31) + this.defaults.hashCode()) * 31) + this.mainCoroutineContextLazy.hashCode()) * 31) + this.memoryCacheLazy.hashCode()) * 31) + this.diskCacheLazy.hashCode()) * 31) + this.eventListenerFactory.hashCode()) * 31) + this.componentRegistry.hashCode()) * 31;
        }

        public String toString() {
            return "Options(application=" + this.application + ", defaults=" + this.defaults + ", mainCoroutineContextLazy=" + this.mainCoroutineContextLazy + ", memoryCacheLazy=" + this.memoryCacheLazy + ", diskCacheLazy=" + this.diskCacheLazy + ", eventListenerFactory=" + this.eventListenerFactory + ", componentRegistry=" + this.componentRegistry + ", logger=" + ((Object) null) + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lzc/i;", "<anonymous>", "(Lju/p0;)Lzc/i;"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<p0, tq.e<? super zc.i>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109866e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ImageRequest f109868g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ImageRequest imageRequest, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f109868g = imageRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f109866e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            w wVar = w.this;
            ImageRequest imageRequest = this.f109868g;
            this.f109866e = 1;
            Object objG = wVar.g(imageRequest, 0, this);
            return objG == objE ? objE : objG;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super zc.i> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return w.this.new b(this.f109868g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lzc/i;", "<anonymous>", "(Lju/p0;)Lzc/i;"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements er.p<p0, tq.e<? super zc.i>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109869e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f109870f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ImageRequest f109872h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lzc/i;", "<anonymous>", "(Lju/p0;)Lzc/i;"}, k = 3, mv = {2, 1, 0})
        static final class a extends vq.k implements er.p<p0, tq.e<? super zc.i>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f109873e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ w f109874f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ ImageRequest f109875g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w wVar, ImageRequest imageRequest, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f109874f = wVar;
                this.f109875g = imageRequest;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f109873e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                w wVar = this.f109874f;
                ImageRequest imageRequest = this.f109875g;
                this.f109873e = 1;
                Object objG = wVar.g(imageRequest, 1, this);
                return objG == objE ? objE : objG;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super zc.i> eVar) {
                return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f109874f, this.f109875g, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ImageRequest imageRequest, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f109872h = imageRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f109869e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            w0<zc.i> w0VarA = a0.c(this.f109872h, ju.k.b((p0) this.f109870f, w.this.getOptions().g().getValue(), null, new a(w.this, this.f109872h, null), 2, null)).a();
            this.f109869e = 1;
            Object objI = w0VarA.I(this);
            return objI == objE ? objE : objI;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super zc.i> eVar) {
            return ((c) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = w.this.new c(this.f109872h, eVar);
            cVar.f109870f = obj;
            return cVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f109876d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f109877e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f109878f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f109879g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f109880h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f109882k;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f109880h = obj;
            this.f109882k |= PKIFailureInfo.systemUnavail;
            return w.this.g(null, 0, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lzc/i;", "<anonymous>", "(Lju/p0;)Lzc/i;"}, k = 3, mv = {2, 1, 0})
    static final class e extends vq.k implements er.p<p0, tq.e<? super zc.i>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f109883e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ImageRequest f109884f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ w f109885g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Size f109886h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ j f109887j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ n f109888k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ImageRequest imageRequest, w wVar, Size size, j jVar, n nVar, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f109884f = imageRequest;
            this.f109885g = wVar;
            this.f109886h = size;
            this.f109887j = jVar;
            this.f109888k = nVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f109883e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            rc.e eVar = new rc.e(this.f109884f, this.f109885g.getComponents().g(), 0, this.f109884f, this.f109886h, this.f109887j, this.f109888k != null);
            this.f109883e = 1;
            Object objG = eVar.g(this);
            return objG == objE ? objE : objG;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super zc.i> eVar) {
            return ((e) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new e(this.f109884f, this.f109885g, this.f109886h, this.f109887j, this.f109888k, eVar);
        }
    }

    public w(Options options) {
        this.options = options;
        options.f();
        this.scope = z.c(null);
        ed.b0 b0VarA = ed.c0.a(this);
        this.systemCallbacks = b0VarA;
        options.f();
        zc.p pVarA = zc.q.a(this, b0VarA, null);
        this.requestService = pVarA;
        options.h();
        options.d();
        h.a aVarE = z.e(c0.a(b0.a(a0.a(z.f(options.getComponentRegistry().k(), options), options), options), options));
        options.f();
        this.components = aVarE.i(new rc.a(this, b0VarA, pVarA, null)).p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:75:0x0154  */
    /* JADX WARN: Code duplicated, block: B:78:0x015e A[Catch: all -> 0x0044, TryCatch #3 {all -> 0x0044, blocks: (B:15:0x003f, B:76:0x0158, B:78:0x015e, B:79:0x0169, B:81:0x016d, B:84:0x017b, B:85:0x0180, B:22:0x005f), top: B:107:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0169 A[Catch: all -> 0x0044, TryCatch #3 {all -> 0x0044, blocks: (B:15:0x003f, B:76:0x0158, B:78:0x015e, B:79:0x0169, B:81:0x016d, B:84:0x017b, B:85:0x0180, B:22:0x005f), top: B:107:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x016d A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #3 {all -> 0x0044, blocks: (B:15:0x003f, B:76:0x0158, B:78:0x015e, B:79:0x0169, B:81:0x016d, B:84:0x017b, B:85:0x0180, B:22:0x005f), top: B:107:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x017b A[Catch: all -> 0x0044, TRY_ENTER, TryCatch #3 {all -> 0x0044, blocks: (B:15:0x003f, B:76:0x0158, B:78:0x015e, B:79:0x0169, B:81:0x016d, B:84:0x017b, B:85:0x0180, B:22:0x005f), top: B:107:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code duplicated, block: B:94:0x0193 A[Catch: all -> 0x01a2, TRY_LEAVE, TryCatch #2 {all -> 0x01a2, blocks: (B:92:0x018f, B:94:0x0193, B:99:0x01a4, B:100:0x01a7), top: B:106:0x018f }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01a4 A[Catch: all -> 0x01a2, TRY_ENTER, TryCatch #2 {all -> 0x01a2, blocks: (B:92:0x018f, B:94:0x0193, B:99:0x01a4, B:100:0x01a7), top: B:106:0x018f }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [kc.w] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, kc.j] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [kc.j] */
    /* JADX WARN: Type inference failed for: r3v21, types: [kc.j] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v4, types: [kc.j] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [zc.f] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kc.j] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [zc.o] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final Object g(ImageRequest imageRequest, int i15, tq.e<? super zc.i> eVar) throws Throwable {
        d dVar;
        zc.o oVarD;
        ImageRequest imageRequest2;
        ?? r15;
        zc.o oVar;
        n image;
        zc.o oVar2;
        ?? r16;
        ImageRequest imageRequest3;
        uc.d dVarE;
        uc.d.Value valueA;
        ImageRequest imageRequest4;
        Object objG;
        ?? r17;
        zc.o oVar3;
        ImageRequest imageRequest5;
        zc.i iVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i16 = dVar.f109882k;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f109882k = i16 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        d dVar2 = dVar;
        Object obj = dVar2.f109880h;
        Object objE = uq.b.e();
        ?? r18 = dVar2.f109882k;
        ?? r19 = 2;
        ?? r25 = 1;
        try {
            try {
                if (r18 == 0) {
                    oq.u.b(obj);
                    oVarD = this.requestService.d(imageRequest, g2.k(dVar2.getContext()), i15 == 0);
                    oVarD.c();
                    ImageRequest imageRequestA = this.requestService.a(imageRequest);
                    j jVarB = this.options.getEventListenerFactory().b(imageRequestA);
                    try {
                        if (fr.t.c(imageRequestA.getData(), zc.k.f234180a)) {
                            throw new zc.l();
                        }
                        oVarD.start();
                        if (i15 == 0) {
                            dVar2.f109876d = oVarD;
                            dVar2.f109877e = imageRequestA;
                            dVar2.f109878f = jVarB;
                            dVar2.f109882k = 1;
                            if (oVarD.a(dVar2) != objE) {
                                imageRequest2 = imageRequestA;
                                r15 = jVarB;
                                oVar = oVarD;
                                oVarD = oVar;
                                r18 = r15;
                            }
                        } else {
                            imageRequest2 = imageRequestA;
                            r18 = jVarB;
                        }
                        return objE;
                    } catch (Throwable th4) {
                        th = th4;
                        r25 = oVarD;
                        r19 = imageRequestA;
                        r18 = jVarB;
                        if (!(th instanceof CancellationException)) {
                            i(r19, r18);
                            throw th;
                        }
                        ErrorResult errorResultC = ed.f0.c(r19, th);
                        j(errorResultC, r19.getTarget(), r18);
                        r25.y();
                        return errorResultC;
                    }
                }
                if (r18 != 1) {
                    if (r18 == 2) {
                        image = (n) dVar2.f109879g;
                        j jVar = (j) dVar2.f109878f;
                        ImageRequest imageRequest6 = (ImageRequest) dVar2.f109877e;
                        zc.o oVar4 = (zc.o) dVar2.f109876d;
                        oq.u.b(obj);
                        r16 = jVar;
                        imageRequest3 = imageRequest6;
                        oVar2 = oVar4;
                        n nVar = image;
                        try {
                            Size size = (Size) obj;
                            r16.m(imageRequest3, size);
                            tq.i interceptorCoroutineContext = imageRequest3.getInterceptorCoroutineContext();
                            imageRequest4 = imageRequest3;
                            try {
                                e eVar2 = new e(imageRequest4, this, size, r16, nVar, null);
                                dVar2.f109876d = oVar2;
                                dVar2.f109877e = imageRequest4;
                                dVar2.f109878f = r16;
                                dVar2.f109879g = null;
                                dVar2.f109882k = 3;
                                objG = ju.i.g(interceptorCoroutineContext, eVar2, dVar2);
                                if (objG != objE) {
                                    r17 = r16;
                                    oVar3 = oVar2;
                                    imageRequest5 = imageRequest4;
                                    obj = objG;
                                }
                                return objE;
                            } catch (Throwable th5) {
                                th = th5;
                                r18 = r16;
                                r25 = oVar2;
                                r19 = imageRequest4;
                                try {
                                    if (!(th instanceof CancellationException)) {
                                        i(r19, r18);
                                        throw th;
                                    }
                                    ErrorResult errorResultC2 = ed.f0.c(r19, th);
                                    j(errorResultC2, r19.getTarget(), r18);
                                    r25.y();
                                    return errorResultC2;
                                } catch (Throwable th6) {
                                    r25.y();
                                    throw th6;
                                }
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            imageRequest4 = imageRequest3;
                        }
                    } else {
                        if (r18 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j jVar2 = (j) dVar2.f109878f;
                        imageRequest5 = (ImageRequest) dVar2.f109877e;
                        oVar3 = (zc.o) dVar2.f109876d;
                        oq.u.b(obj);
                        r17 = jVar2;
                    }
                    iVar = (zc.i) obj;
                    if (iVar instanceof SuccessResult) {
                        k((SuccessResult) iVar, imageRequest5.getTarget(), r17);
                    } else {
                        if (iVar instanceof ErrorResult) {
                            throw new oq.p();
                        }
                        j((ErrorResult) iVar, imageRequest5.getTarget(), r17);
                    }
                    oVar3.y();
                    return iVar;
                }
                r18 = (j) dVar2.f109878f;
                imageRequest2 = (ImageRequest) dVar2.f109877e;
                oVar = (zc.o) dVar2.f109876d;
                try {
                    oq.u.b(obj);
                    r15 = r18;
                    oVarD = oVar;
                    r18 = r15;
                } catch (Throwable th8) {
                    th = th8;
                    r19 = imageRequest2;
                    r25 = oVar;
                    if (!(th instanceof CancellationException)) {
                        i(r19, r18);
                        throw th;
                    }
                    ErrorResult errorResultC3 = ed.f0.c(r19, th);
                    j(errorResultC3, r19.getTarget(), r18);
                    r25.y();
                    return errorResultC3;
                }
                uc.d.Key placeholderMemoryCacheKey = imageRequest2.getPlaceholderMemoryCacheKey();
                image = (placeholderMemoryCacheKey == null || (dVarE = e()) == null || (valueA = dVarE.a(placeholderMemoryCacheKey)) == null) ? null : valueA.getImage();
                bd.a target = imageRequest2.getTarget();
                if (target != null) {
                    target.a(image == null ? imageRequest2.B() : image);
                }
                r18.b(imageRequest2);
                ImageRequest.d listener = imageRequest2.getListener();
                if (listener != null) {
                    listener.b(imageRequest2);
                }
                ad.i sizeResolver = imageRequest2.getSizeResolver();
                r18.n(imageRequest2, sizeResolver);
                dVar2.f109876d = oVarD;
                dVar2.f109877e = imageRequest2;
                dVar2.f109878f = r18;
                dVar2.f109879g = image;
                dVar2.f109882k = 2;
                Object objA = sizeResolver.a(dVar2);
                if (objA != objE) {
                    oVar2 = oVarD;
                    obj = objA;
                    r16 = r18;
                    imageRequest3 = imageRequest2;
                    n nVar2 = image;
                    Size size2 = (Size) obj;
                    r16.m(imageRequest3, size2);
                    tq.i interceptorCoroutineContext2 = imageRequest3.getInterceptorCoroutineContext();
                    imageRequest4 = imageRequest3;
                    e eVar3 = new e(imageRequest4, this, size2, r16, nVar2, null);
                    dVar2.f109876d = oVar2;
                    dVar2.f109877e = imageRequest4;
                    dVar2.f109878f = r16;
                    dVar2.f109879g = null;
                    dVar2.f109882k = 3;
                    objG = ju.i.g(interceptorCoroutineContext2, eVar3, dVar2);
                    if (objG != objE) {
                        r17 = r16;
                        oVar3 = oVar2;
                        imageRequest5 = imageRequest4;
                        obj = objG;
                        iVar = (zc.i) obj;
                        if (iVar instanceof SuccessResult) {
                            k((SuccessResult) iVar, imageRequest5.getTarget(), r17);
                        } else {
                            if (iVar instanceof ErrorResult) {
                                throw new oq.p();
                            }
                            j((ErrorResult) iVar, imageRequest5.getTarget(), r17);
                        }
                        oVar3.y();
                        return iVar;
                    }
                }
                return objE;
            } catch (Throwable th9) {
                th = th9;
                r19 = imageRequest2;
                r25 = oVarD;
                if (!(th instanceof CancellationException)) {
                    i(r19, r18);
                    throw th;
                }
                ErrorResult errorResultC4 = ed.f0.c(r19, th);
                j(errorResultC4, r19.getTarget(), r18);
                r25.y();
                return errorResultC4;
            }
        } catch (Throwable th10) {
            th = th10;
        }
    }

    private final void i(ImageRequest request, j eventListener) {
        this.options.f();
        eventListener.c(request);
        ImageRequest.d listener = request.getListener();
        if (listener != null) {
            listener.c(request);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    private final void j(ErrorResult result, bd.a target, j eventListener) {
        ImageRequest request = result.getRequest();
        this.options.f();
        if (target instanceof dd.d) {
            dd.c cVarA = zc.h.k(result.getRequest()).a((dd.d) target, result);
            if (cVarA instanceof dd.b) {
                target.c(result.getImage());
            } else {
                eventListener.r(result.getRequest(), cVarA);
                cVarA.a();
                eventListener.q(result.getRequest(), cVarA);
            }
        } else if (target != null) {
            target.c(result.getImage());
        }
        eventListener.d(request, result);
        ImageRequest.d listener = request.getListener();
        if (listener != null) {
            listener.d(request, result);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    private final void k(SuccessResult result, bd.a target, j eventListener) {
        ImageRequest request = result.getRequest();
        result.getDataSource();
        this.options.f();
        if (target instanceof dd.d) {
            dd.c cVarA = zc.h.k(result.getRequest()).a((dd.d) target, result);
            if (cVarA instanceof dd.b) {
                target.b(result.getImage());
            } else {
                eventListener.r(result.getRequest(), cVarA);
                cVarA.a();
                eventListener.q(result.getRequest(), cVarA);
            }
        } else if (target != null) {
            target.b(result.getImage());
        }
        eventListener.a(request, result);
        ImageRequest.d listener = request.getListener();
        if (listener != null) {
            listener.a(request, result);
        }
    }

    @Override // kc.s
    public pc.a a() {
        return this.options.d().getValue();
    }

    @Override // kc.s
    public ImageRequest.Defaults b() {
        return this.options.getDefaults();
    }

    @Override // kc.s
    public zc.d c(ImageRequest request) {
        return a0.c(request, ju.k.b(this.scope, this.options.g().getValue(), null, new b(request, null), 2, null));
    }

    @Override // kc.s
    public Object d(ImageRequest imageRequest, tq.e<? super zc.i> eVar) {
        return !a0.d(imageRequest) ? g(imageRequest, 1, eVar) : q0.e(new c(imageRequest, null), eVar);
    }

    @Override // kc.s
    public uc.d e() {
        return this.options.h().getValue();
    }

    @Override // kc.s
    public h getComponents() {
        return this.components;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Options getOptions() {
        return this.options;
    }
}
