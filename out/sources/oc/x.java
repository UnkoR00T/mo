package oc;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.util.Size;
import fr.l0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import qc.SourceFetchResult;
import zc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Loc/x;", "Loc/i;", "Landroid/graphics/ImageDecoder$Source;", "source", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "Lzc/n;", "options", "Lsu/h;", "parallelismLock", "<init>", "(Landroid/graphics/ImageDecoder$Source;Ljava/lang/AutoCloseable;Lzc/n;Lsu/h;)V", "Landroid/graphics/ImageDecoder;", "Loq/i0;", "e", "(Landroid/graphics/ImageDecoder;)V", "Loc/g;", "a", "(Ltq/e;)Ljava/lang/Object;", "Landroid/graphics/ImageDecoder$Source;", "b", "Ljava/lang/AutoCloseable;", "c", "Lzc/n;", "d", "Lsu/h;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ImageDecoder.Source source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AutoCloseable closeable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Options options;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final su.h parallelismLock;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Loc/x$a;", "Loc/i$a;", "Lsu/h;", "parallelismLock", "<init>", "(Lsu/h;)V", "Lzc/n;", "options", "", "b", "(Lzc/n;)Z", "Lqc/o;", "result", "Lkc/s;", "imageLoader", "Loc/i;", "a", "(Lqc/o;Lzc/n;Lkc/s;)Loc/i;", "Lsu/h;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final su.h parallelismLock;

        public a(su.h hVar) {
            this.parallelismLock = hVar;
        }

        private final boolean b(Options options) {
            Bitmap.Config configF = zc.h.f(options);
            return configF == Bitmap.Config.ARGB_8888 || configF == Bitmap.Config.HARDWARE;
        }

        @Override // oc.i.a
        public i a(SourceFetchResult result, Options options, kc.s imageLoader) {
            ImageDecoder.Source sourceB;
            if (b(options) && (sourceB = z.b(result.getSource(), options, false)) != null) {
                return new x(sourceB, result.getSource(), options, this.parallelismLock);
            }
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f144570d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f144571e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f144573g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f144571e = obj;
            this.f144573g |= PKIFailureInfo.systemUnavail;
            return x.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/graphics/ImageDecoder;", "decoder", "Landroid/graphics/ImageDecoder$ImageInfo;", "info", "Landroid/graphics/ImageDecoder$Source;", "source", "Loq/i0;", "onHeaderDecoded", "(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c implements ImageDecoder$OnHeaderDecodedListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0 f144575b;

        public c(l0 l0Var) {
            this.f144575b = l0Var;
        }

        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            Size size = imageInfo.getSize();
            int width = size.getWidth();
            int height = size.getHeight();
            long jB = h.b(width, height, x.this.options.getSize(), x.this.options.getScale(), zc.g.d(x.this.options));
            int iC = ed.q.c(jB);
            int iD = ed.q.d(jB);
            if (width > 0 && height > 0 && (width != iC || height != iD)) {
                double d15 = h.d(width, height, iC, iD, x.this.options.getScale(), zc.g.d(x.this.options));
                l0 l0Var = this.f144575b;
                boolean z15 = d15 < 1.0d;
                l0Var.f66404a = z15;
                if (z15 || x.this.options.getPrecision() == ad.c.EXACT) {
                    imageDecoder.setTargetSize(hr.a.c(((double) width) * d15), hr.a.c(d15 * ((double) height)));
                }
            }
            x.this.e(imageDecoder);
        }
    }

    public x(ImageDecoder.Source source, AutoCloseable autoCloseable, Options options, su.h hVar) {
        this.source = source;
        this.closeable = autoCloseable;
        this.options = options;
        this.parallelismLock = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(ImageDecoder imageDecoder) {
        imageDecoder.setOnPartialImageListener(new ImageDecoder$OnPartialImageListener() { // from class: oc.w
            public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return x.f(decodeException);
            }
        });
        imageDecoder.setAllocator(ed.b.d(zc.h.f(this.options)) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!zc.h.d(this.options) ? 1 : 0);
        if (zc.h.h(this.options) != null) {
            imageDecoder.setTargetColorSpace(zc.h.h(this.options));
        }
        imageDecoder.setUnpremultipliedRequired(!zc.h.j(this.options));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(ImageDecoder.DecodeException decodeException) {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // oc.i
    public Object a(tq.e<? super DecodeResult> eVar) throws Throwable {
        b bVar;
        su.h hVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f144573g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f144573g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f144571e;
        Object objE = uq.b.e();
        int i16 = bVar.f144573g;
        if (i16 == 0) {
            oq.u.b(obj);
            su.h hVar2 = this.parallelismLock;
            bVar.f144570d = hVar2;
            bVar.f144573g = 1;
            if (hVar2.c(bVar) == objE) {
                return objE;
            }
            hVar = hVar2;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (su.h) bVar.f144570d;
            oq.u.b(obj);
        }
        try {
            AutoCloseable autoCloseable = this.closeable;
            try {
                l0 l0Var = new l0();
                DecodeResult decodeResult = new DecodeResult(kc.v.d(ImageDecoder.decodeBitmap(this.source, new c(l0Var)), false, 1, null), l0Var.f66404a);
                cr.a.a(autoCloseable, null);
                hVar.b();
                return decodeResult;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    cr.a.a(autoCloseable, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            hVar.b();
            throw th6;
        }
    }
}
