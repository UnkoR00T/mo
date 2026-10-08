package jd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import fd.d0;
import fd.e0;
import fd.j0;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import ju.g1;
import ju.p0;
import oq.i0;
import oq.t;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.c6;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ao\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022*\b\u0002\u0010\r\u001a$\b\u0001\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aN\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015\u001a9\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a \u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0082@¢\u0006\u0004\b\u001b\u0010\u001c\u001a*\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0082@¢\u0006\u0004\b\u001f\u0010 \u001a)\u0010#\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b#\u0010$\u001a\u0017\u0010%\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010&\u001a2\u0010'\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b'\u0010(\u001a1\u0010+\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010,\u001a!\u00100\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101\u001a\u0017\u00102\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b2\u00103\u001a\u0013\u00104\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b4\u00103¨\u00067²\u0006\f\u00106\u001a\u0002058\nX\u008a\u0084\u0002"}, d2 = {"Ljd/n;", "spec", "", "imageAssetsFolder", "fontAssetsFolder", "fontFileExtension", "cacheKey", "Lkotlin/Function3;", "", "", "Ltq/e;", "", "", "onRetry", "Ljd/l;", "q", "(Ljd/n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ler/q;Lm2/r;II)Ljd/l;", "Landroid/content/Context;", "context", "Lfd/f;", "l", "(Landroid/content/Context;Ljd/n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "isWarmingCache", "Lfd/j0;", "m", "(Landroid/content/Context;Ljd/n;Ljava/lang/String;Z)Lfd/j0;", "T", "g", "(Lfd/j0;Ltq/e;)Ljava/lang/Object;", "composition", "Loq/i0;", "k", "(Landroid/content/Context;Lfd/f;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lfd/d0;", "asset", "o", "(Landroid/content/Context;Lfd/d0;Ljava/lang/String;)V", "n", "(Lfd/d0;)V", "j", "(Landroid/content/Context;Lfd/f;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lmd/c;", "font", "p", "(Landroid/content/Context;Lmd/c;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/graphics/Typeface;", "typeface", "style", "s", "(Landroid/graphics/Typeface;Ljava/lang/String;)Landroid/graphics/Typeface;", "i", "(Ljava/lang/String;)Ljava/lang/String;", "h", "Ljd/m;", "result", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class r {

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "kotlin.jvm.PlatformType", "c", "Loq/i0;", "onResult", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class a<T> implements e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ju.n<T> f101823a;

        /* JADX WARN: Multi-variable type inference failed */
        a(ju.n<? super T> nVar) {
            this.f101823a = nVar;
        }

        @Override // fd.e0
        public final void onResult(T t15) {
            if (this.f101823a.r()) {
                return;
            }
            this.f101823a.i(t.b(t15));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "kotlin.jvm.PlatformType", "e", "Loq/i0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    static final class b<T> implements e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ju.n<T> f101824a;

        /* JADX WARN: Multi-variable type inference failed */
        b(ju.n<? super T> nVar) {
            this.f101824a = nVar;
        }

        @Override // fd.e0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onResult(Throwable th4) {
            if (this.f101824a.r()) {
                return;
            }
            ju.n<T> nVar = this.f101824a;
            t.Companion companion = t.INSTANCE;
            nVar.i(t.b(u.a(th4)));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ fd.f f101826f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f101827g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f101828h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f101829j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(fd.f fVar, Context context, String str, String str2, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f101826f = fVar;
            this.f101827g = context;
            this.f101828h = str;
            this.f101829j = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f101825e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            Iterator<md.c> it = this.f101826f.g().values().iterator();
            while (it.hasNext()) {
                r.p(this.f101827g, it.next(), this.f101828h, this.f101829j);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f101826f, this.f101827g, this.f101828h, this.f101829j, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101830e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ fd.f f101831f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f101832g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f101833h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(fd.f fVar, Context context, String str, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f101831f = fVar;
            this.f101832g = context;
            this.f101833h = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f101830e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            for (d0 d0Var : this.f101831f.j().values()) {
                r.n(d0Var);
                r.o(this.f101832g, d0Var, this.f101833h);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new d(this.f101831f, this.f101832g, this.f101833h, eVar);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f101834d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f101835e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f101836f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f101837g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f101838h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f101839j;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f101838h = obj;
            this.f101839j |= PKIFailureInfo.systemUnavail;
            return r.l(null, null, null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class f extends vq.k implements er.q<Integer, Throwable, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101840e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f101840e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return vq.b.a(false);
        }

        public final Object M(int i15, Throwable th4, tq.e<? super Boolean> eVar) {
            return new f(eVar).J(i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(Integer num, Throwable th4, tq.e<? super Boolean> eVar) {
            return M(num.intValue(), th4, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {1, 9, 0})
    static final class g extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f101841e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f101842f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f101843g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.q<Integer, Throwable, tq.e<? super Boolean>, Object> f101844h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Context f101845j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ n f101846k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f101847l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f101848m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f101849n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f101850p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ a3<m> f101851q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(er.q<? super Integer, ? super Throwable, ? super tq.e<? super Boolean>, ? extends Object> qVar, Context context, n nVar, String str, String str2, String str3, String str4, a3<m> a3Var, tq.e<? super g> eVar) {
            super(2, eVar);
            this.f101844h = qVar;
            this.f101845j = context;
            this.f101846k = nVar;
            this.f101847l = str;
            this.f101848m = str2;
            this.f101849n = str3;
            this.f101850p = str4;
            this.f101851q = a3Var;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(5:23|43|25|26|27) */
        /* JADX WARN: Code duplicated, block: B:17:0x0046 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:18:0x0048  */
        /* JADX WARN: Code duplicated, block: B:20:0x005a  */
        /* JADX WARN: Code duplicated, block: B:21:0x005c A[PHI: r0 r4 r14
          0x005c: PHI (r0v7 int) = (r0v8 int), (r0v12 int) binds: [B:19:0x0058, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE]
          0x005c: PHI (r4v6 java.lang.Throwable) = (r4v7 java.lang.Throwable), (r4v11 java.lang.Throwable) binds: [B:19:0x0058, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE]
          0x005c: PHI (r14v14 java.lang.Object) = (r14v21 java.lang.Object), (r14v0 java.lang.Object) binds: [B:19:0x0058, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:23:0x0064 A[PHI: r0 r4
          0x0064: PHI (r0v4 int) = (r0v7 int), (r0v8 int) binds: [B:22:0x0062, B:17:0x0046] A[DONT_GENERATE, DONT_INLINE]
          0x0064: PHI (r4v4 java.lang.Throwable) = (r4v6 java.lang.Throwable), (r4v7 java.lang.Throwable) binds: [B:22:0x0062, B:17:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:39:0x00b7 A[ADDED_TO_REGION] */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
        
            if (((java.lang.Boolean) r14).booleanValue() != false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
        
            if (r14 == r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x008d -> B:47:0x0090). Please report as a decompilation issue!!! */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r14) throws java.lang.Throwable {
            /*
                r13 = this;
                java.lang.Object r1 = uq.b.e()
                int r0 = r13.f101843g
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L34
                if (r0 == r3) goto L2a
                if (r0 != r2) goto L22
                int r4 = r13.f101842f
                java.lang.Object r0 = r13.f101841e
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                oq.u.b(r14)     // Catch: java.lang.Throwable -> L1a
                r11 = r13
                goto L90
            L1a:
                r0 = move-exception
                r14 = r0
                r11 = r4
                r4 = r14
                r14 = r11
                r11 = r13
                goto La8
            L22:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L2a:
                int r0 = r13.f101842f
                java.lang.Object r4 = r13.f101841e
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                oq.u.b(r14)
                goto L5c
            L34:
                oq.u.b(r14)
                r14 = 0
                r0 = 0
                r4 = r14
            L3a:
                m2.a3<jd.m> r14 = r13.f101851q
                jd.m r14 = jd.r.f(r14)
                boolean r14 = r14.z()
                if (r14 != 0) goto L68
                if (r0 == 0) goto L64
                er.q<java.lang.Integer, java.lang.Throwable, tq.e<? super java.lang.Boolean>, java.lang.Object> r14 = r13.f101844h
                java.lang.Integer r5 = vq.b.e(r0)
                r13.f101841e = r4
                r13.f101842f = r0
                r13.f101843g = r3
                java.lang.Object r14 = r14.w(r5, r4, r13)
                if (r14 != r1) goto L5c
                r11 = r13
                goto L8f
            L5c:
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                boolean r14 = r14.booleanValue()
                if (r14 == 0) goto L68
            L64:
                r12 = r4
                r4 = r0
                r0 = r12
                goto L6a
            L68:
                r11 = r13
                goto Lab
            L6a:
                android.content.Context r5 = r13.f101845j     // Catch: java.lang.Throwable -> La5
                jd.n r6 = r13.f101846k     // Catch: java.lang.Throwable -> La5
                java.lang.String r14 = r13.f101847l     // Catch: java.lang.Throwable -> La5
                java.lang.String r7 = jd.r.b(r14)     // Catch: java.lang.Throwable -> La5
                java.lang.String r14 = r13.f101848m     // Catch: java.lang.Throwable -> La5
                java.lang.String r8 = jd.r.b(r14)     // Catch: java.lang.Throwable -> La5
                java.lang.String r14 = r13.f101849n     // Catch: java.lang.Throwable -> La5
                java.lang.String r9 = jd.r.a(r14)     // Catch: java.lang.Throwable -> La5
                java.lang.String r10 = r13.f101850p     // Catch: java.lang.Throwable -> La5
                r13.f101841e = r0     // Catch: java.lang.Throwable -> La5
                r13.f101842f = r4     // Catch: java.lang.Throwable -> La5
                r13.f101843g = r2     // Catch: java.lang.Throwable -> La5
                r11 = r13
                java.lang.Object r14 = jd.r.l(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L9f
                if (r14 != r1) goto L90
            L8f:
                return r1
            L90:
                fd.f r14 = (fd.f) r14     // Catch: java.lang.Throwable -> L9f
                m2.a3<jd.m> r5 = r11.f101851q     // Catch: java.lang.Throwable -> L9f
                jd.m r5 = jd.r.f(r5)     // Catch: java.lang.Throwable -> L9f
                r5.k(r14)     // Catch: java.lang.Throwable -> L9f
                r12 = r4
                r4 = r0
                r0 = r12
                goto L3a
            L9f:
                r0 = move-exception
            La0:
                r14 = r0
                r12 = r4
                r4 = r14
                r14 = r12
                goto La8
            La5:
                r0 = move-exception
                r11 = r13
                goto La0
            La8:
                int r0 = r14 + 1
                goto L3a
            Lab:
                m2.a3<jd.m> r14 = r11.f101851q
                jd.m r14 = jd.r.f(r14)
                boolean r14 = r14.y()
                if (r14 != 0) goto Lc2
                if (r4 == 0) goto Lc2
                m2.a3<jd.m> r14 = r11.f101851q
                jd.m r14 = jd.r.f(r14)
                r14.l(r4)
            Lc2:
                oq.i0 r14 = oq.i0.f148189a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: jd.r.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((g) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new g(this.f101844h, this.f101845j, this.f101846k, this.f101847l, this.f101848m, this.f101849n, this.f101850p, this.f101851q, eVar);
        }
    }

    private static final <T> Object g(j0<T> j0Var, tq.e<? super T> eVar) {
        ju.p pVar = new ju.p(uq.b.c(eVar), 1);
        pVar.D();
        j0Var.d(new a(pVar)).c(new b(pVar));
        Object objX = pVar.x();
        if (objX == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(String str) {
        if (fu.r.t0(str) || fu.r.V(str, ".", false, 2, null)) {
            return str;
        }
        return "." + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(String str) {
        if (str == null || fu.r.t0(str)) {
            return null;
        }
        if (fu.r.g0(str, '/', false, 2, null)) {
            return str;
        }
        return str + "/";
    }

    private static final Object j(Context context, fd.f fVar, String str, String str2, tq.e<? super i0> eVar) {
        Object objG;
        return (!fVar.g().isEmpty() && (objG = ju.i.g(g1.b(), new c(fVar, context, str, str2, null), eVar)) == uq.b.e()) ? objG : i0.f148189a;
    }

    private static final Object k(Context context, fd.f fVar, String str, tq.e<? super i0> eVar) {
        Object objG;
        return (fVar.r() && (objG = ju.i.g(g1.b(), new d(fVar, context, str, null), eVar)) == uq.b.e()) ? objG : i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object l(Context context, n nVar, String str, String str2, String str3, String str4, tq.e<? super fd.f> eVar) throws Throwable {
        e eVar2;
        String str5;
        Context context2;
        fd.f fVar;
        String str6;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f101839j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f101839j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objG = eVar2.f101838h;
        Object objE = uq.b.e();
        int i16 = eVar2.f101839j;
        if (i16 == 0) {
            u.b(objG);
            j0<fd.f> j0VarM = m(context, nVar, str4, false);
            if (j0VarM == null) {
                throw new IllegalArgumentException(("Unable to create parsing task for " + nVar + ".").toString());
            }
            eVar2.f101834d = context;
            eVar2.f101835e = str;
            eVar2.f101836f = str2;
            eVar2.f101837g = str3;
            eVar2.f101839j = 1;
            objG = g(j0VarM, eVar2);
            if (objG != objE) {
            }
            return objE;
        }
        if (i16 == 1) {
            str3 = (String) eVar2.f101837g;
            str2 = (String) eVar2.f101836f;
            str = (String) eVar2.f101835e;
            context = (Context) eVar2.f101834d;
            u.b(objG);
        } else {
            if (i16 != 2) {
                if (i16 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fd.f fVar2 = (fd.f) eVar2.f101834d;
                u.b(objG);
                return fVar2;
            }
            fVar = (fd.f) eVar2.f101837g;
            str6 = (String) eVar2.f101836f;
            str5 = (String) eVar2.f101835e;
            context2 = (Context) eVar2.f101834d;
            u.b(objG);
        }
        eVar2.f101834d = fVar;
        eVar2.f101835e = null;
        eVar2.f101836f = null;
        eVar2.f101837g = null;
        eVar2.f101839j = 3;
        if (j(context2, fVar, str5, str6, eVar2) != objE) {
            return objE;
        }
        return fVar;
        fd.f fVar3 = (fd.f) objG;
        eVar2.f101834d = context;
        eVar2.f101835e = str2;
        eVar2.f101836f = str3;
        eVar2.f101837g = fVar3;
        eVar2.f101839j = 2;
        if (k(context, fVar3, str, eVar2) != objE) {
            str5 = str2;
            context2 = context;
            fVar = fVar3;
            str6 = str3;
            eVar2.f101834d = fVar;
            eVar2.f101835e = null;
            eVar2.f101836f = null;
            eVar2.f101837g = null;
            eVar2.f101839j = 3;
            if (j(context2, fVar, str5, str6, eVar2) != objE) {
                return fVar;
            }
        }
        return objE;
    }

    private static final j0<fd.f> m(Context context, n nVar, String str, boolean z15) throws FileNotFoundException {
        if (nVar instanceof n.e) {
            return fr.t.c(str, "__LottieInternalDefaultCacheKey__") ? fd.r.C(context, ((n.e) nVar).getResId()) : fd.r.D(context, ((n.e) nVar).getResId(), str);
        }
        if (nVar instanceof n.f) {
            return fr.t.c(str, "__LottieInternalDefaultCacheKey__") ? fd.r.F(context, ((n.f) nVar).a()) : fd.r.G(context, ((n.f) nVar).a(), str);
        }
        if (nVar instanceof n.c) {
            if (z15) {
                return null;
            }
            n.c cVar = (n.c) nVar;
            String strA = cVar.a();
            FileInputStream fileInputStreamC = io.sentry.instrumentation.file.h.b.c(new FileInputStream(strA), strA);
            if (fr.t.c(str, "__LottieInternalDefaultCacheKey__")) {
                str = cVar.a();
            }
            if (fu.r.F(cVar.a(), "zip", false, 2, null)) {
                return fd.r.I(new ZipInputStream(fileInputStreamC), str);
            }
            return fu.r.F(cVar.a(), "tgs", false, 2, null) ? fd.r.s(new GZIPInputStream(fileInputStreamC), str) : fd.r.s(fileInputStreamC, str);
        }
        if (nVar instanceof n.a) {
            return fr.t.c(str, "__LottieInternalDefaultCacheKey__") ? fd.r.n(context, ((n.a) nVar).a()) : fd.r.o(context, ((n.a) nVar).a(), str);
        }
        if (nVar instanceof n.d) {
            if (fr.t.c(str, "__LottieInternalDefaultCacheKey__")) {
                str = String.valueOf(((n.d) nVar).a().hashCode());
            }
            return fd.r.A(((n.d) nVar).a(), str);
        }
        if (!(nVar instanceof n.b)) {
            throw new oq.p();
        }
        n.b bVar = (n.b) nVar;
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(bVar.a());
        if (fr.t.c(str, "__LottieInternalDefaultCacheKey__")) {
            str = bVar.a().toString();
        }
        return fd.r.q(context, inputStreamOpenInputStream, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(d0 d0Var) {
        if (d0Var.b() != null) {
            return;
        }
        String strC = d0Var.c();
        if (!fu.r.V(strC, "data:", false, 2, null) || fu.r.r0(strC, "base64,", 0, false, 6, null) <= 0) {
            return;
        }
        try {
            byte[] bArrDecode = Base64.decode(strC.substring(fu.r.q0(strC, ',', 0, false, 6, null) + 1), 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = true;
            options.inDensity = 160;
            d0Var.g(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
        } catch (IllegalArgumentException e15) {
            td.e.d("data URL did not have correct base64 format.", e15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(Context context, d0 d0Var, String str) {
        if (d0Var.b() != null || str == null) {
            return;
        }
        String strC = d0Var.c();
        try {
            InputStream inputStreamOpen = context.getAssets().open(str + strC);
            Bitmap bitmapDecodeStream = null;
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen, null, options);
            } catch (IllegalArgumentException e15) {
                td.e.d("Unable to decode image.", e15);
            }
            if (bitmapDecodeStream != null) {
                d0Var.g(td.m.l(bitmapDecodeStream, d0Var.f(), d0Var.d()));
            }
        } catch (IOException e16) {
            td.e.d("Unable to open asset.", e16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(Context context, md.c cVar, String str, String str2) {
        String str3 = str + cVar.a() + str2;
        try {
            try {
                cVar.e(s(Typeface.createFromAsset(context.getAssets(), str3), cVar.c()));
            } catch (Exception e15) {
                td.e.b("Failed to create " + cVar.a() + " typeface with style=" + cVar.c() + "!", e15);
            }
        } catch (Exception e16) {
            td.e.b("Failed to find typeface in assets with path " + str3 + ".", e16);
        }
    }

    public static final l q(n nVar, String str, String str2, String str3, String str4, er.q<? super Integer, ? super Throwable, ? super tq.e<? super Boolean>, ? extends Object> qVar, p076m2.r rVar, int i15, int i16) throws FileNotFoundException {
        rVar.C(-1248473602);
        String str5 = (i16 & 2) != 0 ? null : str;
        String str6 = (i16 & 4) != 0 ? "fonts/" : str2;
        String str7 = (i16 & 8) != 0 ? ".ttf" : str3;
        String str8 = (i16 & 16) != 0 ? "__LottieInternalDefaultCacheKey__" : str4;
        er.q<? super Integer, ? super Throwable, ? super tq.e<? super Boolean>, ? extends Object> fVar = (i16 & 32) != 0 ? new f(null) : qVar;
        if (p076m2.t.k()) {
            p076m2.t.o(-1248473602, i15, -1, "com.airbnb.lottie.compose.rememberLottieComposition (rememberLottieComposition.kt:83)");
        }
        Context context = (Context) rVar.N(AndroidCompositionLocals_androidKt.c());
        rVar.C(1388713953);
        int i17 = i15 & 14;
        int i18 = i17 ^ 6;
        boolean z15 = (i18 > 4 && rVar.W(nVar)) || (i15 & 6) == 4;
        Object objE = rVar.E();
        if (z15 || objE == p076m2.r.INSTANCE.a()) {
            objE = c6.e(new m(), null, 2, null);
            rVar.v(objE);
        }
        a3 a3Var = (a3) objE;
        rVar.V();
        rVar.C(1388714244);
        boolean z16 = ((i18 > 4 && rVar.W(nVar)) || (i15 & 6) == 4) | ((((57344 & i15) ^ 24576) > 16384 && rVar.W(str8)) || (i15 & 24576) == 16384);
        Object objE2 = rVar.E();
        if (z16 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = m(context, nVar, str8, true);
            rVar.v(objE2);
        }
        rVar.V();
        Function0.e(nVar, str8, new g(fVar, context, nVar, str5, str6, str7, str8, a3Var, null), rVar, i17 | 512 | ((i15 >> 9) & 112));
        m mVarR = r(a3Var);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.V();
        return mVarR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m r(a3<m> a3Var) {
        return a3Var.getValue();
    }

    private static final Typeface s(Typeface typeface, String str) {
        int i15 = 0;
        boolean zD0 = fu.r.d0(str, "Italic", false, 2, null);
        boolean zD1 = fu.r.d0(str, "Bold", false, 2, null);
        if (zD0 && zD1) {
            i15 = 3;
        } else if (zD0) {
            i15 = 2;
        } else if (zD1) {
            i15 = 1;
        }
        return typeface.getStyle() == i15 ? typeface : Typeface.create(typeface, i15);
    }
}
