package b00;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.concurrent.CancellationException;
import ju.g2;
import ju.p0;
import ju.q0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JM\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u00120\u0010*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u00120\u0010*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u0010*\u00020\b2\u0006\u0010\u0017\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u00120\u0010*\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\tH\u0096@¢\u0006\u0004\b!\u0010\u0019J \u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\tH\u0096@¢\u0006\u0004\b#\u0010\u0019J,\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\"0\u00102\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010%\u001a\u00020$H\u0096@¢\u0006\u0004\b&\u0010\u001dJ$\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010(\u001a\u00020'H\u0096@¢\u0006\u0004\b)\u0010*J,\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010,\u001a\u00020+2\u0006\u0010\u0017\u001a\u00020\tH\u0096@¢\u0006\u0004\b-\u0010.J$\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010/\u001a\u00020 H\u0096@¢\u0006\u0004\b0\u00101J$\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u00102\u0006\u00102\u001a\u00020\"H\u0096@¢\u0006\u0004\b3\u00104JF\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\"0\u00102\u0006\u00102\u001a\u00020\"2\u0006\u00105\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010$H\u0096@¢\u0006\u0004\b6\u00107J1\u00109\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u00120\u00102\u0006\u0010\u001e\u001a\u00020\b2\u0006\u00108\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b9\u0010\u001dJ2\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\u001e\u001a\u00020\b2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:H\u0096@¢\u0006\u0004\b=\u0010>J1\u0010@\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u00120\u00102\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010?\u001a\u00020;H\u0096@¢\u0006\u0004\b@\u0010AR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010D¨\u0006E"}, d2 = {"Lb00/d;", "Lb00/c;", "Landroid/content/Context;", "applicationContext", "Lxw/d;", "dispatcherProvider", "<init>", "(Landroid/content/Context;Lxw/d;)V", "Landroid/graphics/Bitmap;", "", "left", "top", "width", "height", "Landroid/graphics/Matrix;", "matrix", "Ldx/i;", "Ldx/b;", "Lkotlin/jvm/internal/EnhancedNullability;", "n", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Ltq/e;)Ljava/lang/Object;", "q", "(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Ltq/e;)Ljava/lang/Object;", "imageMaxSide", "o", "(Landroid/graphics/Bitmap;ILtq/e;)Ljava/lang/Object;", "", "degrees", "p", "(Landroid/graphics/Bitmap;FLtq/e;)Ljava/lang/Object;", "bitmap", "imageQuality", "", "l", "", "i", "Lxw/a;", "maxSize", "c", "Landroid/net/Uri;", "uri", "g", "(Landroid/net/Uri;Ltq/e;)Ljava/lang/Object;", "Ljava/io/File;", "file", "k", "(Ljava/io/File;ILtq/e;)Ljava/lang/Object;", "base64String", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "bytes", "h", "([BLtq/e;)Ljava/lang/Object;", "photoOrientation", "e", "([BFIILxw/a;Ltq/e;)Ljava/lang/Object;", "scale", "d", "", "Lb00/f;", "transformations", "j", "(Landroid/graphics/Bitmap;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "transformation", "f", "(Landroid/graphics/Bitmap;Lb00/f;Ltq/e;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "Lxw/d;", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements b00.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xw.d dispatcherProvider;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Landroid/graphics/Bitmap;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b, ? extends Bitmap>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15655e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Bitmap f15656f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f15657g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f15658h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f15659j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f15660k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ Matrix f15661l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Bitmap bitmap, int i15, int i16, int i17, int i18, Matrix matrix, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f15656f = bitmap;
            this.f15657g = i15;
            this.f15658h = i16;
            this.f15659j = i17;
            this.f15660k = i18;
            this.f15661l = matrix;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            uq.b.e();
            if (this.f15655e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            Bitmap bitmap = this.f15656f;
            int i15 = this.f15657g;
            int i16 = this.f15658h;
            int i17 = this.f15659j;
            int i18 = this.f15660k;
            Matrix matrix = this.f15661l;
            dx.j<dx.b> jVarA = xw.c.f221622a.a();
            try {
                try {
                    try {
                        new ex.a();
                        return new dx.i.Right(Bitmap.createBitmap(bitmap, i15, i16, i17, i18, matrix, true));
                    } catch (Exception e15) {
                        px.f fVar = px.f.f163100a;
                        String message = e15.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e15, px.c.a(jVarA));
                        Object objA = jVarA.a(e15);
                        if (objA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                        } else {
                            if (!(objA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) objA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } catch (ex.c e16) {
                    return new dx.i.Left((dx.b) ex.d.a(e16));
                } catch (CancellationException e17) {
                    throw e17;
                }
            } catch (CancellationException e18) {
                throw e18;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f15656f, this.f15657g, this.f15658h, this.f15659j, this.f15660k, this.f15661l, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b, ? extends Bitmap>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15662e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Bitmap f15663f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f15664g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Bitmap bitmap, int i15, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f15663f = bitmap;
            this.f15664g = i15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            uq.b.e();
            if (this.f15662e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            Bitmap bitmapCreateScaledBitmap = this.f15663f;
            int i15 = this.f15664g;
            dx.j<dx.b> jVarA = xw.c.f221622a.a();
            try {
                try {
                    try {
                        new ex.a();
                        int iMax = Math.max(bitmapCreateScaledBitmap.getHeight(), bitmapCreateScaledBitmap.getWidth());
                        if (iMax > i15) {
                            float f15 = i15 / iMax;
                            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, hr.a.d(bitmapCreateScaledBitmap.getWidth() * f15), hr.a.d(bitmapCreateScaledBitmap.getHeight() * f15), true);
                        }
                        return new dx.i.Right(bitmapCreateScaledBitmap);
                    } catch (CancellationException e15) {
                        throw e15;
                    }
                } catch (ex.c e16) {
                    return new dx.i.Left((dx.b) ex.d.a(e16));
                } catch (CancellationException e17) {
                    throw e17;
                }
            } catch (Exception e18) {
                px.f fVar = px.f.f163100a;
                String message = e18.getMessage();
                if (message == null) {
                    message = "";
                }
                fVar.d(message, e18, px.c.a(jVarA));
                Object objA = jVarA.a(e18);
                if (objA instanceof dx.i.Left) {
                    objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                } else {
                    if (!(objA instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    objB = ((dx.i.Right) objA).b();
                }
                return new dx.i.Left(objB);
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f15663f, this.f15664g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Landroid/graphics/Bitmap;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b, ? extends Bitmap>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15665e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Bitmap f15666f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f15667g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Bitmap bitmap, float f15, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f15666f = bitmap;
            this.f15667g = f15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            uq.b.e();
            if (this.f15665e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            Bitmap bitmap = this.f15666f;
            float f15 = this.f15667g;
            dx.j<dx.b> jVarA = xw.c.f221622a.a();
            try {
                try {
                    try {
                        new ex.a();
                        return new dx.i.Right(Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * f15), (int) (bitmap.getHeight() * f15), true));
                    } catch (CancellationException e15) {
                        throw e15;
                    }
                } catch (ex.c e16) {
                    return new dx.i.Left((dx.b) ex.d.a(e16));
                } catch (CancellationException e17) {
                    throw e17;
                }
            } catch (Exception e18) {
                px.f fVar = px.f.f163100a;
                String message = e18.getMessage();
                if (message == null) {
                    message = "";
                }
                fVar.d(message, e18, px.c.a(jVarA));
                Object objA = jVarA.a(e18);
                if (objA instanceof dx.i.Left) {
                    objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                } else {
                    if (!(objA instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    objB = ((dx.i.Right) objA).b();
                }
                return new dx.i.Left(objB);
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f15666f, this.f15667g, eVar);
        }
    }

    /* JADX INFO: renamed from: b00.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C0367d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f15668d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15669e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15670f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f15672h;

        C0367d(tq.e<? super C0367d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f15670f = obj;
            this.f15672h |= PKIFailureInfo.systemUnavail;
            return d.this.l(null, 0, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<p0, tq.e<? super String>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15673e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Bitmap f15674f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f15675g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Bitmap bitmap, int i15, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f15674f = bitmap;
            this.f15675g = i15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f15673e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f15674f.compress(Bitmap.CompressFormat.JPEG, this.f15675g, byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super String> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new e(this.f15674f, this.f15675g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b, ? extends Bitmap>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15676e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Uri f15678g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Uri uri, tq.e<? super f> eVar) {
            super(2, eVar);
            this.f15678g = uri;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            uq.b.e();
            if (this.f15676e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            d dVar = d.this;
            Uri uri = this.f15678g;
            dx.j<dx.b> jVarA = xw.c.f221622a.a();
            try {
                try {
                    try {
                        ex.a aVar = new ex.a();
                        Bitmap bitmapDecodeBitmap = Build.VERSION.SDK_INT >= 28 ? ImageDecoder.decodeBitmap(ImageDecoder.createSource(dVar.applicationContext.getContentResolver(), uri)) : MediaStore.Images.Media.getBitmap(dVar.applicationContext.getContentResolver(), uri);
                        if (bitmapDecodeBitmap != null) {
                            return new dx.i.Right(bitmapDecodeBitmap);
                        }
                        aVar.b(dx.g.f45096a);
                        throw new oq.g();
                    } catch (Exception e15) {
                        px.f fVar = px.f.f163100a;
                        String message = e15.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e15, px.c.a(jVarA));
                        Object objA = jVarA.a(e15);
                        if (objA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                        } else {
                            if (!(objA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) objA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } catch (ex.c e16) {
                    return new dx.i.Left((dx.b) ex.d.a(e16));
                } catch (CancellationException e17) {
                    throw e17;
                }
            } catch (CancellationException e18) {
                throw e18;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar) {
            return ((f) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return d.this.new f(this.f15678g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b, ? extends Bitmap>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15679e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ File f15680f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f15681g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(File file, int i15, tq.e<? super g> eVar) {
            super(2, eVar);
            this.f15680f = file;
            this.f15681g = i15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            uq.b.e();
            if (this.f15679e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            File file = this.f15680f;
            int i15 = this.f15681g;
            dx.j<dx.b> jVarA = xw.c.f221622a.a();
            try {
                try {
                    try {
                        ex.a aVar = new ex.a();
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        int i16 = 1;
                        try {
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                            int i17 = options.outHeight;
                            if (i17 > i15 || options.outWidth > i15) {
                                int i18 = i17 / 2;
                                int i19 = options.outWidth / 2;
                                while (i18 / i16 >= i15 && i19 / i16 >= i15) {
                                    i16 *= 2;
                                }
                            }
                            options.inSampleSize = vq.b.e(i16).intValue();
                            options.inJustDecodeBounds = false;
                            return new dx.i.Right(BitmapFactory.decodeFile(file.getAbsolutePath(), options));
                        } catch (IllegalArgumentException e15) {
                            aVar.b(new dx.b.Generic(e15));
                            throw new oq.g();
                        }
                    } catch (CancellationException e16) {
                        throw e16;
                    }
                } catch (ex.c e17) {
                    return new dx.i.Left((dx.b) ex.d.a(e17));
                } catch (CancellationException e18) {
                    throw e18;
                }
            } catch (Exception e19) {
                px.f fVar = px.f.f163100a;
                String message = e19.getMessage();
                if (message == null) {
                    message = "";
                }
                fVar.d(message, e19, px.c.a(jVarA));
                Object objA = jVarA.a(e19);
                if (objA instanceof dx.i.Left) {
                    objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                } else {
                    if (!(objA instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    objB = ((dx.i.Right) objA).b();
                }
                return new dx.i.Left(objB);
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar) {
            return ((g) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new g(this.f15680f, this.f15681g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b, ? extends Bitmap>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15682e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f15683f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, tq.e<? super h> eVar) {
            super(2, eVar);
            this.f15683f = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            uq.b.e();
            if (this.f15682e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            String str = this.f15683f;
            dx.j<dx.b> jVarA = xw.c.f221622a.a();
            try {
                try {
                    try {
                        ex.a aVar = new ex.a();
                        byte[] bArrDecode = Base64.decode(str, 2);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                        if (bitmapDecodeByteArray != null) {
                            return new dx.i.Right(bitmapDecodeByteArray);
                        }
                        aVar.b(dx.g.f45096a);
                        throw new oq.g();
                    } catch (Exception e15) {
                        px.f fVar = px.f.f163100a;
                        String message = e15.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e15, px.c.a(jVarA));
                        Object objA = jVarA.a(e15);
                        if (objA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                        } else {
                            if (!(objA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) objA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } catch (ex.c e16) {
                    return new dx.i.Left((dx.b) ex.d.a(e16));
                } catch (CancellationException e17) {
                    throw e17;
                }
            } catch (CancellationException e18) {
                throw e18;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar) {
            return ((h) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new h(this.f15683f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b, ? extends Bitmap>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15684e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ byte[] f15685f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(byte[] bArr, tq.e<? super i> eVar) {
            super(2, eVar);
            this.f15685f = bArr;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            uq.b.e();
            if (this.f15684e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            byte[] bArr = this.f15685f;
            dx.j<dx.b> jVarA = xw.c.f221622a.a();
            try {
                try {
                    try {
                        ex.a aVar = new ex.a();
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                        if (bitmapDecodeByteArray != null) {
                            return new dx.i.Right(bitmapDecodeByteArray);
                        }
                        aVar.b(dx.g.f45096a);
                        throw new oq.g();
                    } catch (CancellationException e15) {
                        throw e15;
                    }
                } catch (ex.c e16) {
                    return new dx.i.Left((dx.b) ex.d.a(e16));
                } catch (CancellationException e17) {
                    throw e17;
                }
            } catch (Exception e18) {
                px.f fVar = px.f.f163100a;
                String message = e18.getMessage();
                if (message == null) {
                    message = "";
                }
                fVar.d(message, e18, px.c.a(jVarA));
                Object objA = jVarA.a(e18);
                if (objA instanceof dx.i.Left) {
                    objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                } else {
                    if (!(objA instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    objB = ((dx.i.Right) objA).b();
                }
                return new dx.i.Left(objB);
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar) {
            return ((i) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new i(this.f15685f, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class j extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f15686d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15687e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f15688f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f15690h;

        j(tq.e<? super j> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f15688f = obj;
            this.f15690h |= PKIFailureInfo.systemUnavail;
            return d.this.i(null, 0, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Lju/p0;)[B"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<p0, tq.e<? super byte[]>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15691e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Bitmap f15692f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f15693g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Bitmap bitmap, int i15, tq.e<? super k> eVar) {
            super(2, eVar);
            this.f15692f = bitmap;
            this.f15693g = i15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f15691e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f15692f.compress(Bitmap.CompressFormat.JPEG, this.f15693g, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super byte[]> eVar) {
            return ((k) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new k(this.f15692f, this.f15693g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b, ? extends byte[]>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f15694e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f15695f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f15696g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f15697h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f15698j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f15699k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f15700l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f15701m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f15702n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f15703p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f15704q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f15705r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f15706s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f15707t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f15708v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private /* synthetic */ Object f15709w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ float f15710x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ d f15711y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ Bitmap f15712z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(float f15, d dVar, Bitmap bitmap, tq.e<? super l> eVar) {
            super(2, eVar);
            this.f15710x = f15;
            this.f15711y = dVar;
            this.f15712z = bitmap;
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:38:0x00d9 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:39:0x00db A[Catch: Exception -> 0x00c7, c -> 0x00ca, CancellationException -> 0x00cd, TryCatch #5 {c -> 0x00ca, CancellationException -> 0x00cd, Exception -> 0x00c7, blocks: (B:26:0x00bd, B:23:0x0086, B:39:0x00db, B:40:0x00e3, B:41:0x00f2, B:42:0x00f3, B:43:0x0102), top: B:63:0x00bd }] */
        /* JADX WARN: Code duplicated, block: B:40:0x00e3 A[Catch: Exception -> 0x00c7, c -> 0x00ca, CancellationException -> 0x00cd, TryCatch #5 {c -> 0x00ca, CancellationException -> 0x00cd, Exception -> 0x00c7, blocks: (B:26:0x00bd, B:23:0x0086, B:39:0x00db, B:40:0x00e3, B:41:0x00f2, B:42:0x00f3, B:43:0x0102), top: B:63:0x00bd }] */
        /* JADX WARN: Code duplicated, block: B:42:0x00f3 A[Catch: Exception -> 0x00c7, c -> 0x00ca, CancellationException -> 0x00cd, TryCatch #5 {c -> 0x00ca, CancellationException -> 0x00cd, Exception -> 0x00c7, blocks: (B:26:0x00bd, B:23:0x0086, B:39:0x00db, B:40:0x00e3, B:41:0x00f2, B:42:0x00f3, B:43:0x0102), top: B:63:0x00bd }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00ba -> B:63:0x00bd). Please report as a decompilation issue!!! */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            d dVar;
            Bitmap bitmap;
            float length;
            float f15;
            ex.b aVar;
            ex.b bVar;
            int i15;
            dx.j<dx.b> jVar;
            byte[] bArr;
            int i16;
            int i17;
            int i18;
            int i19;
            int i25;
            boolean z15;
            Object objI;
            p0 p0Var = (p0) this.f15709w;
            Object objE = uq.b.e();
            int i26 = this.f15708v;
            try {
                try {
                    try {
                        try {
                            if (i26 == 0) {
                                oq.u.b(obj);
                                float f16 = this.f15710x;
                                dVar = this.f15711y;
                                bitmap = this.f15712z;
                                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                                length = Float.MAX_VALUE;
                                f15 = f16;
                                aVar = new ex.a();
                                bVar = aVar;
                                i15 = 100;
                                jVar = jVarA;
                                bArr = null;
                                i16 = 0;
                                i17 = 0;
                                i18 = 0;
                                i19 = 0;
                                i25 = 0;
                                if (i15 >= 10 || length <= f15) {
                                    if (length <= f15) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (z15) {
                                        aVar.b(new dx.b.Generic(null, 1, null));
                                        throw new oq.g();
                                    }
                                    if (bArr != null) {
                                        return new dx.i.Right(bArr);
                                    }
                                    aVar.b(new dx.b.Generic(null, 1, null));
                                    throw new oq.g();
                                }
                                g2.j(p0Var.getCoroutineContext());
                                this.f15709w = p0Var;
                                this.f15694e = dVar;
                                this.f15695f = bitmap;
                                this.f15696g = jVar;
                                this.f15697h = vq.j.a(bVar);
                                this.f15698j = aVar;
                                this.f15699k = vq.j.a(bArr);
                                this.f15700l = f15;
                                this.f15702n = i25;
                                this.f15703p = i19;
                                this.f15704q = i18;
                                this.f15705r = i17;
                                this.f15706s = i16;
                                this.f15701m = length;
                                this.f15707t = i15;
                                this.f15708v = 1;
                                objI = dVar.i(bitmap, i15, this);
                                if (objI == objE) {
                                    return objE;
                                }
                            } else {
                                if (i26 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                i15 = this.f15707t;
                                i16 = this.f15706s;
                                int i27 = this.f15705r;
                                int i28 = this.f15704q;
                                int i29 = this.f15703p;
                                int i35 = this.f15702n;
                                float f17 = this.f15700l;
                                ex.b bVar2 = (ex.b) this.f15698j;
                                ex.b bVar3 = (ex.b) this.f15697h;
                                dx.j<dx.b> jVar2 = (dx.j) this.f15696g;
                                bitmap = (Bitmap) this.f15695f;
                                dVar = (d) this.f15694e;
                                oq.u.b(obj);
                                bVar = bVar3;
                                jVar = jVar2;
                                aVar = bVar2;
                                f15 = f17;
                                i25 = i35;
                                i19 = i29;
                                i18 = i28;
                                i17 = i27;
                                objI = obj;
                            }
                            byte[] bArr2 = (byte[]) objI;
                            i15 -= 10;
                            bArr = bArr2;
                            length = bArr2.length;
                            if (i15 >= 10) {
                            }
                            if (length <= f15) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z15) {
                                aVar.b(new dx.b.Generic(null, 1, null));
                                throw new oq.g();
                            }
                            if (bArr != null) {
                                return new dx.i.Right(bArr);
                            }
                            aVar.b(new dx.b.Generic(null, 1, null));
                            throw new oq.g();
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            dx.j<dx.b> jVar3 = jVar;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(jVar3));
                            dx.i iVarA = jVar3.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } catch (CancellationException e18) {
                        throw e18;
                    }
                } catch (Exception e19) {
                    e = e19;
                }
            } catch (ex.c e25) {
                e = e25;
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar) {
            return ((l) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            l lVar = new l(this.f15710x, this.f15711y, this.f15712z, eVar);
            lVar.f15709w = obj;
            return lVar;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class m extends vq.d {
        /* synthetic */ Object A;
        int C;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f15713d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f15714e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f15715f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f15716g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f15717h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f15718j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f15719k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f15720l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f15721m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f15722n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f15723p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f15724q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f15725r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f15726s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f15727t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f15728v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f15729w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f15730x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f15731y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f15732z;

        m(tq.e<? super m> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.A = obj;
            this.C |= PKIFailureInfo.systemUnavail;
            return d.this.j(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Landroid/graphics/Bitmap;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b, ? extends Bitmap>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f15733e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Bitmap f15734f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Matrix f15735g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Bitmap bitmap, Matrix matrix, tq.e<? super n> eVar) {
            super(2, eVar);
            this.f15734f = bitmap;
            this.f15735g = matrix;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            uq.b.e();
            if (this.f15733e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            Bitmap bitmap = this.f15734f;
            Matrix matrix = this.f15735g;
            dx.j<dx.b> jVarA = xw.c.f221622a.a();
            try {
                try {
                    try {
                        new ex.a();
                        return new dx.i.Right(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true));
                    } catch (CancellationException e15) {
                        throw e15;
                    }
                } catch (ex.c e16) {
                    return new dx.i.Left((dx.b) ex.d.a(e16));
                } catch (CancellationException e17) {
                    throw e17;
                }
            } catch (Exception e18) {
                px.f fVar = px.f.f163100a;
                String message = e18.getMessage();
                if (message == null) {
                    message = "";
                }
                fVar.d(message, e18, px.c.a(jVarA));
                Object objA = jVarA.a(e18);
                if (objA instanceof dx.i.Left) {
                    objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                } else {
                    if (!(objA instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    objB = ((dx.i.Right) objA).b();
                }
                return new dx.i.Left(objB);
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar) {
            return ((n) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new n(this.f15734f, this.f15735g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class o extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f15736d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f15737e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f15738f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f15739g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f15740h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f15741j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f15742k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f15743l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f15744m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f15745n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f15746p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f15747q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f15748r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f15749s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f15750t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f15752w;

        o(tq.e<? super o> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f15750t = obj;
            this.f15752w |= PKIFailureInfo.systemUnavail;
            return d.this.e(null, 0.0f, 0, 0, null, this);
        }
    }

    public d(Context context, xw.d dVar) {
        this.applicationContext = context;
        this.dispatcherProvider = dVar;
    }

    private final Object n(Bitmap bitmap, int i15, int i16, int i17, int i18, Matrix matrix, tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar) {
        return this.dispatcherProvider.d(new a(bitmap, i15, i16, i17, i18, matrix, null), eVar);
    }

    private final Object o(Bitmap bitmap, int i15, tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar) {
        return this.dispatcherProvider.d(new b(bitmap, i15, null), eVar);
    }

    private final Object p(Bitmap bitmap, float f15, tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f15);
        i0 i0Var = i0.f148189a;
        return q(bitmap, matrix, eVar);
    }

    private final Object q(Bitmap bitmap, Matrix matrix, tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar) {
        return this.dispatcherProvider.d(new n(bitmap, matrix, null), eVar);
    }

    @Override // b00.c
    public Object b(String str, tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar) {
        return this.dispatcherProvider.d(new h(str, null), eVar);
    }

    @Override // b00.c
    public Object c(Bitmap bitmap, float f15, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar) {
        return q0.e(new l(f15, this, bitmap, null), eVar);
    }

    @Override // b00.c
    public Object d(Bitmap bitmap, float f15, tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar) {
        return this.dispatcherProvider.d(new c(bitmap, f15, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0168 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0169  */
    /* JADX WARN: Code duplicated, block: B:37:0x016d  */
    /* JADX WARN: Code duplicated, block: B:40:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:45:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:52:0x0211  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0205, code lost:
    
        if (r1 == r3) goto L47;
     */
    @Override // b00.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(byte[] r20, float r21, int r22, int r23, xw.a r24, tq.e<? super dx.i<? extends dx.b, byte[]>> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b00.d.e(byte[], float, int, int, xw.a, tq.e):java.lang.Object");
    }

    @Override // b00.c
    public Object f(Bitmap bitmap, b00.f fVar, tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar) {
        if (fVar instanceof b00.f.Crop) {
            b00.f.Crop crop = (b00.f.Crop) fVar;
            return n(bitmap, crop.getLeft(), crop.getTop(), crop.getWidth(), crop.getHeight(), crop.getMatrix(), eVar);
        }
        if (fVar instanceof b00.f.Matrix) {
            return q(bitmap, ((b00.f.Matrix) fVar).getMatrix(), eVar);
        }
        if (fVar instanceof b00.f.ReduceDimension) {
            return o(bitmap, ((b00.f.ReduceDimension) fVar).getMaxSide(), eVar);
        }
        if (fVar instanceof b00.f.Rotate) {
            return p(bitmap, ((b00.f.Rotate) fVar).getDegrees(), eVar);
        }
        throw new oq.p();
    }

    @Override // b00.c
    public Object g(Uri uri, tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar) {
        return this.dispatcherProvider.d(new f(uri, null), eVar);
    }

    @Override // b00.c
    public Object h(byte[] bArr, tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar) {
        return this.dispatcherProvider.d(new i(bArr, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // b00.c
    public Object i(Bitmap bitmap, int i15, tq.e<? super byte[]> eVar) throws Throwable {
        j jVar;
        if (eVar instanceof j) {
            jVar = (j) eVar;
            int i16 = jVar.f15690h;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                jVar.f15690h = i16 - PKIFailureInfo.systemUnavail;
            } else {
                jVar = new j(eVar);
            }
        } else {
            jVar = new j(eVar);
        }
        Object objA = jVar.f15688f;
        Object objE = uq.b.e();
        int i17 = jVar.f15690h;
        if (i17 == 0) {
            oq.u.b(objA);
            xw.d dVar = this.dispatcherProvider;
            k kVar = new k(bitmap, i15, null);
            jVar.f15686d = vq.j.a(bitmap);
            jVar.f15687e = i15;
            jVar.f15690h = 1;
            objA = dVar.a(kVar, jVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i17 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objA);
        }
        return objA;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00cc A[Catch: Exception -> 0x015c, c -> 0x015e, CancellationException -> 0x0162, TryCatch #5 {c -> 0x015e, CancellationException -> 0x0162, Exception -> 0x015c, blocks: (B:31:0x0144, B:25:0x00c6, B:27:0x00cc, B:38:0x0166), top: B:59:0x0144 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0135 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0136  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x0089: MOVE (r2 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]), block:B:15:0x0089 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0136 -> B:59:0x0144). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // b00.c
    public java.lang.Object j(android.graphics.Bitmap r21, java.util.List<? extends b00.f> r22, tq.e<? super dx.i<? extends dx.b, android.graphics.Bitmap>> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b00.d.j(android.graphics.Bitmap, java.util.List, tq.e):java.lang.Object");
    }

    @Override // b00.c
    public Object k(File file, int i15, tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar) {
        return this.dispatcherProvider.d(new g(file, i15, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // b00.c
    public Object l(Bitmap bitmap, int i15, tq.e<? super String> eVar) throws Throwable {
        C0367d c0367d;
        if (eVar instanceof C0367d) {
            c0367d = (C0367d) eVar;
            int i16 = c0367d.f15672h;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                c0367d.f15672h = i16 - PKIFailureInfo.systemUnavail;
            } else {
                c0367d = new C0367d(eVar);
            }
        } else {
            c0367d = new C0367d(eVar);
        }
        Object objD = c0367d.f15670f;
        Object objE = uq.b.e();
        int i17 = c0367d.f15672h;
        if (i17 == 0) {
            oq.u.b(objD);
            xw.d dVar = this.dispatcherProvider;
            e eVar2 = new e(bitmap, i15, null);
            c0367d.f15668d = vq.j.a(bitmap);
            c0367d.f15669e = i15;
            c0367d.f15672h = 1;
            objD = dVar.d(eVar2, c0367d);
            if (objD == objE) {
                return objE;
            }
        } else {
            if (i17 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objD);
        }
        return objD;
    }
}
