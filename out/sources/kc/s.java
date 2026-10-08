package kc;

import android.content.Context;
import ju.g1;
import ju.n2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import zc.ImageRequest;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0017J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Lkc/s;", "", "Lzc/f;", "request", "Lzc/d;", "c", "(Lzc/f;)Lzc/d;", "Lzc/i;", "d", "(Lzc/f;Ltq/e;)Ljava/lang/Object;", "Lzc/f$b;", "b", "()Lzc/f$b;", "defaults", "Lkc/h;", "getComponents", "()Lkc/h;", "components", "Luc/d;", "e", "()Luc/d;", "memoryCache", "Lpc/a;", "a", "()Lpc/a;", "diskCache", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface s {

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\f\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0014R \u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0017\u0010'\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006("}, d2 = {"Lkc/s$a;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "<init>", "(Landroid/content/Context;)V", "Lkc/s;", "d", "()Lkc/s;", "a", "Landroid/content/Context;", "application", "Lzc/f$b;", "b", "Lzc/f$b;", "defaults", "Loq/k;", "Ltq/i;", "c", "Loq/k;", "mainCoroutineContextLazy", "Luc/d;", "memoryCacheLazy", "Lpc/a;", "e", "diskCacheLazy", "Lkc/j$c;", "f", "Lkc/j$c;", "eventListenerFactory", "Lkc/h;", "g", "Lkc/h;", "componentRegistry", "Lkc/l$a;", "h", "Lkc/l$a;", "()Lkc/l$a;", "extras", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Context application;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private ImageRequest.Defaults defaults = ImageRequest.Defaults.f234139p;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private oq.k<? extends tq.i> mainCoroutineContextLazy = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private oq.k<? extends uc.d> memoryCacheLazy = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private oq.k<? extends pc.a> diskCacheLazy = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private j.c eventListenerFactory = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private h componentRegistry = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final Extras.a extras = new Extras.a();

        public a(Context context) {
            this.application = ed.d.b(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n2 e() {
            return g1.c().d2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uc.d f(a aVar) {
            return uc.d.a.d(new uc.d.a(), aVar.application, 0.0d, 2, null).b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final pc.a g() {
            return pc.g.d();
        }

        public final s d() {
            Context context = this.application;
            ImageRequest.Defaults defaults = this.defaults;
            ImageRequest.Defaults defaultsA = defaults.a((8191 & 1) != 0 ? defaults.fileSystem : null, (8191 & 2) != 0 ? defaults.interceptorCoroutineContext : null, (8191 & 4) != 0 ? defaults.fetcherCoroutineContext : null, (8191 & 8) != 0 ? defaults.decoderCoroutineContext : null, (8191 & 16) != 0 ? defaults.memoryCachePolicy : null, (8191 & 32) != 0 ? defaults.diskCachePolicy : null, (8191 & 64) != 0 ? defaults.networkCachePolicy : null, (8191 & 128) != 0 ? defaults.placeholderFactory : null, (8191 & 256) != 0 ? defaults.errorFactory : null, (8191 & 512) != 0 ? defaults.fallbackFactory : null, (8191 & 1024) != 0 ? defaults.sizeResolver : null, (8191 & 2048) != 0 ? defaults.scale : null, (8191 & PKIFailureInfo.certConfirmed) != 0 ? defaults.precision : null, (8191 & PKIFailureInfo.certRevoked) != 0 ? defaults.extras : this.extras.a());
            oq.k<? extends tq.i> kVarA = this.mainCoroutineContextLazy;
            if (kVarA == null) {
                kVarA = oq.l.a(new er.a() { // from class: kc.p
                    @Override // er.a
                    public final Object a() {
                        return s.a.e();
                    }
                });
            }
            oq.k<? extends uc.d> kVarA2 = this.memoryCacheLazy;
            if (kVarA2 == null) {
                kVarA2 = oq.l.a(new er.a() { // from class: kc.q
                    @Override // er.a
                    public final Object a() {
                        return s.a.f(this.f109838a);
                    }
                });
            }
            oq.k<? extends pc.a> kVarA3 = this.diskCacheLazy;
            if (kVarA3 == null) {
                kVarA3 = oq.l.a(new er.a() { // from class: kc.r
                    @Override // er.a
                    public final Object a() {
                        return s.a.g();
                    }
                });
            }
            j.c cVar = this.eventListenerFactory;
            if (cVar == null) {
                cVar = j.c.f109829b;
            }
            h hVar = this.componentRegistry;
            if (hVar == null) {
                hVar = new h();
            }
            return new w(new w.Options(context, defaultsA, kVarA, kVarA2, kVarA3, cVar, hVar, null));
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final Extras.a getExtras() {
            return this.extras;
        }
    }

    pc.a a();

    ImageRequest.Defaults b();

    zc.d c(ImageRequest request);

    Object d(ImageRequest imageRequest, tq.e<? super zc.i> eVar);

    uc.d e();

    h getComponents();
}
