package zc;

import ad.Size;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import ed.b0;
import ed.g0;
import java.util.Map;
import ju.d2;
import kc.BitmapImage;
import kc.Extras;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u0015*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001b\u001a\u00020\u001a*\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020 2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J'\u0010-\u001a\u00020,2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020 H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00107\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010:R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010<¨\u0006>"}, d2 = {"Lzc/a;", "Lzc/p;", "Lkc/s;", "imageLoader", "Led/b0;", "systemCallbacks", "Led/t;", "logger", "<init>", "(Lkc/s;Led/b0;Led/t;)V", "Lzc/f;", "Landroidx/lifecycle/j;", "f", "(Lzc/f;)Landroidx/lifecycle/j;", "Lad/i;", "m", "(Lzc/f;)Lad/i;", "Lad/f;", "l", "(Lzc/f;)Lad/f;", "sizeResolver", "Lad/c;", "k", "(Lzc/f;Lad/i;)Lad/c;", "Lad/g;", "size", "Lkc/l;", "j", "(Lzc/f;Lad/g;)Lkc/l;", "request", "Landroid/graphics/Bitmap$Config;", "requestedConfig", "", "i", "(Lzc/f;Landroid/graphics/Bitmap$Config;)Z", "g", "(Lzc/f;Lad/g;)Z", "Lzc/n;", "options", "h", "(Lzc/n;)Z", "Lju/d2;", "job", "findLifecycle", "Lzc/o;", "d", "(Lzc/f;Lju/d2;Z)Lzc/o;", "a", "(Lzc/f;)Lzc/f;", "b", "(Lzc/f;Lad/g;)Lzc/n;", "c", "(Lzc/n;)Lzc/n;", "Luc/d$c;", "cacheValue", "e", "(Lzc/f;Luc/d$c;)Z", "Lkc/s;", "Led/b0;", "Led/n;", "Led/n;", "hardwareBitmapService", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final kc.s imageLoader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b0 systemCallbacks;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ed.n hardwareBitmapService = ed.o.a(null);

    public a(kc.s sVar, b0 b0Var, ed.t tVar) {
        this.imageLoader = sVar;
        this.systemCallbacks = b0Var;
    }

    private final androidx.p016lifecycle.j f(ImageRequest imageRequest) {
        bd.a target = imageRequest.getTarget();
        return ed.d.e(target instanceof bd.b ? ((bd.b) target).m().getContext() : imageRequest.getContext());
    }

    private final boolean g(ImageRequest request, Size size) {
        return (g.e(request).isEmpty() || pq.n.f0(g0.f(), h.e(request))) && (!ed.b.d(h.e(request)) || (i(request, h.e(request)) && this.hardwareBitmapService.b(size)));
    }

    private final boolean h(Options options) {
        return !ed.b.d(h.f(options)) || this.hardwareBitmapService.getAllowHardware();
    }

    private final boolean i(ImageRequest request, Bitmap.Config requestedConfig) {
        if (!ed.b.d(requestedConfig)) {
            return true;
        }
        if (!h.a(request)) {
            return false;
        }
        bd.a target = request.getTarget();
        if (target instanceof bd.b) {
            View viewM = ((bd.b) target).m();
            if (viewM.isAttachedToWindow() && !viewM.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    private final Extras j(ImageRequest imageRequest, Size size) {
        Bitmap.Config configE = h.e(imageRequest);
        boolean zC = h.c(imageRequest);
        if (!g(imageRequest, size)) {
            configE = Bitmap.Config.ARGB_8888;
        }
        boolean z15 = zC && g.e(imageRequest).isEmpty() && configE != Bitmap.Config.ALPHA_8;
        Extras.a aVar = new Extras.a((Map<Extras.c<?>, ? extends Object>) v0.o(imageRequest.getDefaults().getExtras().b(), imageRequest.getExtras().b()));
        if (configE != h.e(imageRequest)) {
            aVar = aVar.b(h.g(Extras.c.INSTANCE), configE);
        }
        if (z15 != h.c(imageRequest)) {
            aVar = aVar.b(h.b(Extras.c.INSTANCE), Boolean.valueOf(z15));
        }
        return aVar.a();
    }

    private final ad.c k(ImageRequest imageRequest, ad.i iVar) {
        if (imageRequest.getDefined().getSizeResolver() == null && fr.t.c(iVar, ad.i.f5431b)) {
            return ad.c.INEXACT;
        }
        return ((imageRequest.getTarget() instanceof bd.b) && (iVar instanceof ad.k) && (((bd.b) imageRequest.getTarget()).m() instanceof ImageView) && ((bd.b) imageRequest.getTarget()).m() == ((ad.k) iVar).m()) ? ad.c.INEXACT : ad.c.EXACT;
    }

    private final ad.f l(ImageRequest imageRequest) {
        bd.a target = imageRequest.getTarget();
        bd.b bVar = target instanceof bd.b ? (bd.b) target : null;
        View viewM = bVar != null ? bVar.m() : null;
        ImageView imageView = viewM instanceof ImageView ? (ImageView) viewM : null;
        return imageView != null ? g0.e(imageView) : imageRequest.getScale();
    }

    private final ad.i m(ImageRequest imageRequest) {
        ImageView.ScaleType scaleType;
        if (!(imageRequest.getTarget() instanceof bd.b)) {
            return ad.i.f5431b;
        }
        View viewM = ((bd.b) imageRequest.getTarget()).m();
        return ((viewM instanceof ImageView) && ((scaleType = ((ImageView) viewM).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) ? ad.i.f5431b : ad.l.b(viewM, false, 2, null);
    }

    @Override // zc.p
    public ImageRequest a(ImageRequest request) {
        ImageRequest.a aVarD = ImageRequest.A(request, null, 1, null).d(this.imageLoader.b());
        ad.i sizeResolver = request.getDefined().getSizeResolver();
        if (sizeResolver == null) {
            sizeResolver = m(request);
            aVarD.g(sizeResolver);
        }
        if (request.getDefined().getScale() == null) {
            aVarD.f(l(request));
        }
        if (request.getDefined().getPrecision() == null) {
            aVarD.e(k(request, sizeResolver));
        }
        return aVarD.a();
    }

    @Override // zc.p
    public Options b(ImageRequest request, Size size) {
        return new Options(request.getContext(), size, request.getScale(), request.getPrecision(), request.getDiskCacheKey(), request.getFileSystem(), request.getMemoryCachePolicy(), request.getDiskCachePolicy(), request.getNetworkCachePolicy(), j(request, size));
    }

    @Override // zc.p
    public Options c(Options options) {
        boolean z15;
        Extras extras = options.getExtras();
        if (h(options)) {
            z15 = false;
        } else {
            extras = extras.d().b(h.g(Extras.c.INSTANCE), Bitmap.Config.ARGB_8888).a();
            z15 = true;
        }
        return z15 ? Options.b(options, null, null, null, null, null, null, null, null, null, extras, 511, null) : options;
    }

    @Override // zc.p
    public o d(ImageRequest request, d2 job, boolean findLifecycle) {
        bd.a target = request.getTarget();
        if (target instanceof bd.b) {
            androidx.p016lifecycle.j jVarI = h.i(request);
            if (jVarI == null) {
                jVarI = f(request);
            }
            return new t(this.imageLoader, request, (bd.b) target, jVarI, job);
        }
        androidx.p016lifecycle.j jVarI2 = h.i(request);
        if (jVarI2 == null) {
            jVarI2 = findLifecycle ? f(request) : null;
        }
        return jVarI2 != null ? new j(jVarI2, job) : b.d(b.e(job));
    }

    @Override // zc.p
    public boolean e(ImageRequest request, uc.d.Value cacheValue) {
        kc.n image = cacheValue.getImage();
        BitmapImage bitmapImage = image instanceof BitmapImage ? (BitmapImage) image : null;
        if (bitmapImage == null) {
            return true;
        }
        return i(request, ed.b.c(bitmapImage.getBitmap()));
    }
}
