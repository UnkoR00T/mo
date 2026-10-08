package oc;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import ju.a2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import qc.SourceFetchResult;
import vv.k0;
import zc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0003\u0013\u0019\u0016B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, d2 = {"Loc/c;", "Loc/i;", "Loc/s;", "source", "Lzc/n;", "options", "Lsu/h;", "parallelismLock", "Loc/o;", "exifOrientationStrategy", "<init>", "(Loc/s;Lzc/n;Lsu/h;Loc/o;)V", "Landroid/graphics/BitmapFactory$Options;", "Loc/g;", "e", "(Landroid/graphics/BitmapFactory$Options;)Loc/g;", "Loc/j;", "exifData", "Loq/i0;", "c", "(Landroid/graphics/BitmapFactory$Options;Loc/j;)V", "d", "a", "(Ltq/e;)Ljava/lang/Object;", "Loc/s;", "b", "Lzc/n;", "Lsu/h;", "Loc/o;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s source;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Options options;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final su.h parallelismLock;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final o exifOrientationStrategy;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR4\u0010\u0013\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Loc/c$b;", "Lvv/n;", "Lvv/k0;", "delegate", "<init>", "(Lvv/k0;)V", "Lvv/e;", "sink", "", "byteCount", "k3", "(Lvv/e;J)J", "Ljava/lang/Exception;", "Lkotlin/Exception;", "value", "b", "Ljava/lang/Exception;", "h", "()Ljava/lang/Exception;", "exception", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b extends vv.n {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Exception exception;

        public b(k0 k0Var) {
            super(k0Var);
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }

        @Override // vv.n, vv.k0
        public long k3(vv.e sink, long byteCount) throws Exception {
            try {
                return super.k3(sink, byteCount);
            } catch (Exception e15) {
                this.exception = e15;
                throw e15;
            }
        }
    }

    /* JADX INFO: renamed from: oc.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Loc/c$c;", "Loc/i$a;", "Lsu/h;", "parallelismLock", "Loc/o;", "exifOrientationStrategy", "<init>", "(Lsu/h;Loc/o;)V", "Lqc/o;", "result", "Lzc/n;", "options", "Lkc/s;", "imageLoader", "Loc/i;", "a", "(Lqc/o;Lzc/n;Lkc/s;)Loc/i;", "Lsu/h;", "b", "Loc/o;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C3586c implements i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final su.h parallelismLock;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final o exifOrientationStrategy;

        public C3586c(su.h hVar, o oVar) {
            this.parallelismLock = hVar;
            this.exifOrientationStrategy = oVar;
        }

        @Override // oc.i.a
        public i a(SourceFetchResult result, Options options, kc.s imageLoader) {
            return new c(result.getSource(), options, this.parallelismLock, this.exifOrientationStrategy);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f144518d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f144519e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f144521g;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f144519e = obj;
            this.f144521g |= PKIFailureInfo.systemUnavail;
            return c.this.a(this);
        }
    }

    public c(s sVar, Options options, su.h hVar, o oVar) {
        this.source = sVar;
        this.options = options;
        this.parallelismLock = hVar;
        this.exifOrientationStrategy = oVar;
    }

    private final void c(BitmapFactory.Options options, j jVar) {
        Bitmap.Config configF = zc.h.f(this.options);
        if (jVar.getIsFlipped() || q.a(jVar)) {
            configF = ed.b.e(configF);
        }
        if (zc.h.d(this.options) && configF == Bitmap.Config.ARGB_8888 && fr.t.c(options.outMimeType, "image/jpeg")) {
            configF = Bitmap.Config.RGB_565;
        }
        Bitmap.Config config = options.outConfig;
        Bitmap.Config config2 = Bitmap.Config.RGBA_F16;
        if (config == config2 && configF != Bitmap.Config.HARDWARE) {
            configF = config2;
        }
        options.inPreferredConfig = configF;
    }

    private final void d(BitmapFactory.Options options, j jVar) {
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            options.inSampleSize = 1;
            options.inScaled = false;
            return;
        }
        int i15 = q.b(jVar) ? options.outHeight : options.outWidth;
        int i16 = q.b(jVar) ? options.outWidth : options.outHeight;
        long jB = h.b(i15, i16, this.options.getSize(), this.options.getScale(), zc.g.d(this.options));
        int iC = ed.q.c(jB);
        int iD = ed.q.d(jB);
        int iA = h.a(i15, i16, iC, iD, this.options.getScale());
        options.inSampleSize = iA;
        double dC = h.c(((double) i15) / ((double) iA), ((double) i16) / ((double) iA), iC, iD, this.options.getScale(), zc.g.d(this.options));
        if (this.options.getPrecision() == ad.c.INEXACT) {
            dC = lr.m.h(dC, 1.0d);
        }
        boolean z15 = dC == 1.0d;
        options.inScaled = !z15;
        if (z15) {
            return;
        }
        if (dC > 1.0d) {
            options.inDensity = hr.a.c(((double) Integer.MAX_VALUE) / dC);
            options.inTargetDensity = Integer.MAX_VALUE;
        } else {
            options.inDensity = Integer.MAX_VALUE;
            options.inTargetDensity = hr.a.c(((double) Integer.MAX_VALUE) * dC);
        }
    }

    private final DecodeResult e(BitmapFactory.Options options) throws Exception {
        b bVar = new b(this.source.W3());
        vv.g gVarC = vv.v.c(bVar);
        boolean z15 = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(gVarC.peek().f4(), null, options);
        Exception exception = bVar.getException();
        if (exception != null) {
            throw exception;
        }
        options.inJustDecodeBounds = false;
        p pVar = p.f144546a;
        j jVarA = pVar.a(options.outMimeType, gVarC, this.exifOrientationStrategy);
        Exception exception2 = bVar.getException();
        if (exception2 != null) {
            throw exception2;
        }
        options.inMutable = false;
        if (zc.h.h(this.options) != null) {
            options.inPreferredColorSpace = zc.h.h(this.options);
        }
        options.inPremultiplied = zc.h.j(this.options);
        c(options, jVarA);
        d(options, jVarA);
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(gVarC.f4(), null, options);
            ar.b.a(gVarC, null);
            Exception exception3 = bVar.getException();
            if (exception3 != null) {
                throw exception3;
            }
            if (bitmapDecodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            bitmapDecodeStream.setDensity(this.options.getContext().getResources().getDisplayMetrics().densityDpi);
            kc.n nVarC = kc.v.c(new BitmapDrawable(this.options.getContext().getResources(), pVar.b(bitmapDecodeStream, jVarA)));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z15 = false;
            }
            return new DecodeResult(nVarC, z15);
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                ar.b.a(gVarC, th4);
                throw th5;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DecodeResult f(c cVar) {
        return cVar.e(new BitmapFactory.Options());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // oc.i
    public Object a(tq.e<? super DecodeResult> eVar) throws Throwable {
        d dVar;
        su.h hVar;
        su.h hVar2;
        Throwable th4;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f144521g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f144521g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f144519e;
        Object objE = uq.b.e();
        int i16 = dVar.f144521g;
        try {
            if (i16 == 0) {
                oq.u.b(obj);
                hVar = this.parallelismLock;
                dVar.f144518d = hVar;
                dVar.f144521g = 1;
                if (hVar.c(dVar) != objE) {
                }
                return objE;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hVar2 = (su.h) dVar.f144518d;
                try {
                    oq.u.b(obj);
                    DecodeResult decodeResult = (DecodeResult) obj;
                    hVar2.b();
                    return decodeResult;
                } catch (Throwable th5) {
                    th4 = th5;
                    hVar2.b();
                    throw th4;
                }
            }
            su.h hVar3 = (su.h) dVar.f144518d;
            oq.u.b(obj);
            hVar = hVar3;
            er.a aVar = new er.a() { // from class: oc.b
                @Override // er.a
                public final Object a() {
                    return c.f(this.f144509a);
                }
            };
            dVar.f144518d = hVar;
            dVar.f144521g = 2;
            Object objC = a2.c(null, aVar, dVar, 1, null);
            if (objC != objE) {
                hVar2 = hVar;
                obj = objC;
                DecodeResult decodeResult2 = (DecodeResult) obj;
                hVar2.b();
                return decodeResult2;
            }
            return objE;
        } catch (Throwable th6) {
            hVar2 = hVar;
            th4 = th6;
            hVar2.b();
            throw th4;
        }
    }
}
