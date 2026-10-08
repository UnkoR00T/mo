package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import androidx.p016lifecycle.C6451z0;
import p071kotlin.Metadata;
import p076m2.p4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012\"&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\",\u0010\u001b\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0003\"\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u001e\u001a\u00020\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u001e\u0010#\u001a\u00020\u0010*\u00020\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Landroid/view/View;", "Lm2/v;", "e", "(Landroid/view/View;)Lm2/v;", "Landroid/content/Context;", "", "j", "(Landroid/content/Context;)F", "applicationContext", "Lmu/p0;", "f", "(Landroid/content/Context;)Lmu/p0;", "Ltq/i;", "coroutineContext", "Landroidx/lifecycle/j;", "lifecycle", "Lm2/p4;", "c", "(Landroid/view/View;Ltq/i;Landroidx/lifecycle/j;)Lm2/p4;", "Lr0/t0;", "a", "Lr0/t0;", "animationScale", "value", "g", "k", "(Landroid/view/View;Lm2/v;)V", "compositionContext", "h", "(Landroid/view/View;)Landroid/view/View;", "contentChild", "i", "(Landroid/view/View;)Lm2/p4;", "getWindowRecomposer$annotations", "(Landroid/view/View;)V", "windowRecomposer", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r0.t0<Context, mu.p0<Float>> f10755a = r0.g1.c();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/s3$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Loq/i0;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f10756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p4 f10757b;

        a(View view, p4 p4Var) {
            this.f10756a = view;
            this.f10757b = p4Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v15) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v15) {
            this.f10756a.removeOnAttachStateChangeListener(this);
            this.f10757b.m0();
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/s3$b", "Landroidx/lifecycle/n;", "Landroidx/lifecycle/q;", "source", "Landroidx/lifecycle/j$a;", "event", "Loq/i0;", "m", "(Landroidx/lifecycle/q;Landroidx/lifecycle/j$a;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements androidx.p016lifecycle.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ju.p0 f10758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p076m2.r3 f10759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p4 f10760c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ fr.p0<d2> f10761d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f10762a;

            static {
                int[] iArr = new int[androidx.lifecycle.j.a.values().length];
                try {
                    iArr[androidx.lifecycle.j.a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.lifecycle.j.a.ON_START.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[androidx.lifecycle.j.a.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[androidx.lifecycle.j.a.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[androidx.lifecycle.j.a.ON_PAUSE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[androidx.lifecycle.j.a.ON_RESUME.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[androidx.lifecycle.j.a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f10762a = iArr;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.platform.s3$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class C0228b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f10763e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ fr.p0<d2> f10764f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ p4 f10765g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ androidx.p016lifecycle.q f10766h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ b f10767j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0228b(fr.p0<d2> p0Var, p4 p4Var, androidx.p016lifecycle.q qVar, b bVar, tq.e<? super C0228b> eVar) {
                super(2, eVar);
                this.f10764f = p0Var;
                this.f10765g = p4Var;
                this.f10766h = qVar;
                this.f10767j = bVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f10763e;
                try {
                    if (i15 == 0) {
                        oq.u.b(obj);
                        d2 d2Var = this.f10764f.f66410a;
                        if (d2Var != null) {
                            d2Var.c(ju.q0.a(this.f10765g.getEffectCoroutineContext()));
                        }
                        p4 p4Var = this.f10765g;
                        this.f10763e = 1;
                        if (p4Var.X0(this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oq.u.b(obj);
                    }
                    this.f10766h.getLifecycle().d(this.f10767j);
                    return oq.i0.f148189a;
                } catch (Throwable th4) {
                    this.f10766h.getLifecycle().d(this.f10767j);
                    throw th4;
                }
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                return ((C0228b) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new C0228b(this.f10764f, this.f10765g, this.f10766h, this.f10767j, eVar);
            }
        }

        b(ju.p0 p0Var, p076m2.r3 r3Var, p4 p4Var, fr.p0<d2> p0Var2) {
            this.f10758a = p0Var;
            this.f10759b = r3Var;
            this.f10760c = p4Var;
            this.f10761d = p0Var2;
        }

        @Override // androidx.p016lifecycle.n
        public void m(androidx.p016lifecycle.q source, androidx.lifecycle.j.a event) {
            switch (a.f10762a[event.ordinal()]) {
                case 1:
                    ju.k.d(this.f10758a, null, ju.r0.UNDISPATCHED, new C0228b(this.f10761d, this.f10760c, source, this, null), 1, null);
                    return;
                case 2:
                    p076m2.r3 r3Var = this.f10759b;
                    if (r3Var != null) {
                        r3Var.b();
                    }
                    this.f10760c.W0();
                    return;
                case 3:
                    this.f10760c.G0();
                    return;
                case 4:
                    this.f10760c.m0();
                    return;
                case 5:
                case 6:
                case 7:
                    return;
                default:
                    throw new oq.p();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/h;", "", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements er.p<mu.h<? super Float>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f10768e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f10769f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f10770g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ContentResolver f10771h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Uri f10772j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ d f10773k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ lu.g<oq.i0> f10774l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Context f10775m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ContentResolver contentResolver, Uri uri, d dVar, lu.g<oq.i0> gVar, Context context, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f10771h = contentResolver;
            this.f10772j = uri;
            this.f10773k = dVar;
            this.f10774l = gVar;
            this.f10775m = context;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0054  */
        /* JADX WARN: Code duplicated, block: B:21:0x0055  */
        /* JADX WARN: Code duplicated, block: B:24:0x0060 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0016, B:18:0x0048, B:22:0x0058, B:24:0x0060, B:14:0x002d, B:17:0x0042), top: B:31:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x007a  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
        
            if (r4.F(r9, r8) == r0) goto L26;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0077 -> B:8:0x0019). Please report as a decompilation issue!!! */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r8.f10769f
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L31
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r8.f10768e
                lu.i r1 = (lu.i) r1
                java.lang.Object r4 = r8.f10770g
                mu.h r4 = (mu.h) r4
                oq.u.b(r9)     // Catch: java.lang.Throwable -> L1b
            L19:
                r9 = r4
                goto L48
            L1b:
                r9 = move-exception
                goto L84
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                java.lang.Object r1 = r8.f10768e
                lu.i r1 = (lu.i) r1
                java.lang.Object r4 = r8.f10770g
                mu.h r4 = (mu.h) r4
                oq.u.b(r9)     // Catch: java.lang.Throwable -> L1b
                goto L58
            L31:
                oq.u.b(r9)
                java.lang.Object r9 = r8.f10770g
                mu.h r9 = (mu.h) r9
                android.content.ContentResolver r1 = r8.f10771h
                android.net.Uri r4 = r8.f10772j
                r5 = 0
                androidx.compose.ui.platform.s3$d r6 = r8.f10773k
                r1.registerContentObserver(r4, r5, r6)
                lu.g<oq.i0> r1 = r8.f10774l     // Catch: java.lang.Throwable -> L1b
                lu.i r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
            L48:
                r8.f10770g = r9     // Catch: java.lang.Throwable -> L1b
                r8.f10768e = r1     // Catch: java.lang.Throwable -> L1b
                r8.f10769f = r3     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r4 = r1.a(r8)     // Catch: java.lang.Throwable -> L1b
                if (r4 != r0) goto L55
                goto L79
            L55:
                r7 = r4
                r4 = r9
                r9 = r7
            L58:
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L1b
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L1b
                if (r9 == 0) goto L7a
                r1.next()     // Catch: java.lang.Throwable -> L1b
                android.content.Context r9 = r8.f10775m     // Catch: java.lang.Throwable -> L1b
                float r9 = androidx.compose.ui.platform.s3.b(r9)     // Catch: java.lang.Throwable -> L1b
                java.lang.Float r9 = vq.b.d(r9)     // Catch: java.lang.Throwable -> L1b
                r8.f10770g = r4     // Catch: java.lang.Throwable -> L1b
                r8.f10768e = r1     // Catch: java.lang.Throwable -> L1b
                r8.f10769f = r2     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r9 = r4.F(r9, r8)     // Catch: java.lang.Throwable -> L1b
                if (r9 != r0) goto L19
            L79:
                return r0
            L7a:
                android.content.ContentResolver r9 = r8.f10771h
                androidx.compose.ui.platform.s3$d r0 = r8.f10773k
                r9.unregisterContentObserver(r0)
                oq.i0 r9 = oq.i0.f148189a
                return r9
            L84:
                android.content.ContentResolver r0 = r8.f10771h
                androidx.compose.ui.platform.s3$d r1 = r8.f10773k
                r0.unregisterContentObserver(r1)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.s3.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(mu.h<? super Float> hVar, tq.e<? super oq.i0> eVar) {
            return ((c) v(hVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = new c(this.f10771h, this.f10772j, this.f10773k, this.f10774l, this.f10775m, eVar);
            cVar.f10770g = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/s3$d", "Landroid/database/ContentObserver;", "", "selfChange", "Landroid/net/Uri;", "uri", "Loq/i0;", "onChange", "(ZLandroid/net/Uri;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ lu.g<oq.i0> f10776a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(lu.g<oq.i0> gVar, Handler handler) {
            super(handler);
            this.f10776a = gVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange, Uri uri) {
            this.f10776a.d(oq.i0.f148189a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [tq.i] */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, androidx.compose.ui.platform.d2] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r6v3, types: [tq.i] */
    public static final p4 c(View view, tq.i iVar, androidx.p016lifecycle.j jVar) {
        p076m2.r3 r3Var;
        tq.i iVar2;
        ?? d2Var;
        if (iVar.m(tq.f.INSTANCE) == null || iVar.m(p076m2.l2.INSTANCE) == null) {
            iVar = j0.INSTANCE.a().n0(iVar);
        }
        p076m2.l2 l2Var = (p076m2.l2) iVar.m(p076m2.l2.INSTANCE);
        if (l2Var != null) {
            r3Var = new p076m2.r3(l2Var);
            r3Var.a();
        } else {
            r3Var = null;
        }
        fr.p0 p0Var = new fr.p0();
        f3.o oVar = (f3.o) iVar.m(f3.o.INSTANCE);
        ?? r15 = oVar;
        if (oVar == null) {
            d2Var = new d2(view.getContext().getApplicationContext());
            p0Var.f66410a = d2Var;
        }
        if (r3Var != null) {
            r15 = d2Var;
            iVar2 = r3Var;
        } else {
            r15 = d2Var;
            iVar2 = tq.j.f191408a;
        }
        tq.i iVarN0 = iVar.n0(iVar2).n0(r15);
        p4 p4Var = new p4(iVarN0);
        p4Var.G0();
        ju.p0 p0VarA = ju.q0.a(iVarN0);
        if (jVar == null) {
            androidx.p016lifecycle.q qVarA = C6451z0.a(view);
            jVar = qVarA != null ? qVarA.getLifecycle() : null;
        }
        if (jVar != null) {
            view.addOnAttachStateChangeListener(new a(view, p4Var));
            jVar.a(new b(p0VarA, r3Var, p4Var, p0Var));
            return p4Var;
        }
        d4.a.d("ViewTreeLifecycleOwner not found from " + view);
        throw new oq.g();
    }

    public static /* synthetic */ p4 d(View view, tq.i iVar, androidx.p016lifecycle.j jVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            iVar = tq.j.f191408a;
        }
        if ((i15 & 2) != 0) {
            jVar = null;
        }
        return c(view, iVar, jVar);
    }

    public static final p076m2.v e(View view) {
        p076m2.v vVarG = g(view);
        if (vVarG != null) {
            return vVarG;
        }
        Object parent = view.getParent();
        while (vVarG == null && (parent instanceof View)) {
            View view2 = (View) parent;
            vVarG = g(view2);
            parent = o6.b.a(view2);
        }
        return vVarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mu.p0<Float> f(Context context) {
        mu.p0<Float> p0Var;
        r0.t0<Context, mu.p0<Float>> t0Var = f10755a;
        synchronized (t0Var) {
            try {
                mu.p0<Float> p0VarE = t0Var.e(context);
                if (p0VarE == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    lu.g gVarB = lu.j.b(-1, null, null, 6, null);
                    p0VarE = mu.i.b0(mu.i.I(new c(contentResolver, uriFor, new d(gVarB, e6.g.a(Looper.getMainLooper())), gVarB, context, null)), ju.q0.b(), mu.l0.Companion.b(mu.l0.INSTANCE, 0L, 0L, 3, null), Float.valueOf(j(context)));
                    t0Var.x(context, p0VarE);
                }
                p0Var = p0VarE;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return p0Var;
    }

    public static final p076m2.v g(View view) {
        Object tag = view.getTag(f3.p.H);
        if (tag instanceof p076m2.v) {
            return (p076m2.v) tag;
        }
        return null;
    }

    public static final View h(View view) {
        Object objA = o6.b.a(view);
        while (objA instanceof View) {
            View view2 = (View) objA;
            if (view2.getId() == 16908290) {
                break;
            }
            objA = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final p4 i(View view) {
        if (!view.isAttachedToWindow()) {
            d4.a.c("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        View viewH = h(view);
        p076m2.v vVarG = g(viewH);
        if (vVarG == null) {
            return r3.f10740a.a(viewH);
        }
        if (vVarG instanceof p4) {
            return (p4) vVarG;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float j(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static final void k(View view, p076m2.v vVar) {
        view.setTag(f3.p.H, vVar);
    }
}
