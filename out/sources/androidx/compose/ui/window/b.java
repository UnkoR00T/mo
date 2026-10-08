package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.g1;
import java.util.List;
import java.util.UUID;
import ju.p0;
import n4.f0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.a2;
import p036e4.b0;
import p036e4.l1;
import p036e4.q1;
import p036e4.v0;
import p036e4.w0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.b4;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r0;
import p076m2.s0;
import p076m2.x5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u001aA\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0013\u001a\u00020\n*\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0016\u001a\u00020\u000f*\u00020\u00052\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\" \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 \" \u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 ¨\u0006&²\u0006\u0012\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/window/t;", "popupPositionProvider", "Lkotlin/Function0;", "Loq/i0;", "onDismissRequest", "Landroidx/compose/ui/window/u;", "properties", "content", "a", "(Landroidx/compose/ui/window/t;Ler/a;Landroidx/compose/ui/window/u;Ler/p;Lm2/r;II)V", "", "focusable", "Landroidx/compose/ui/window/v;", "securePolicy", "clippingEnabled", "", "g", "(ZLandroidx/compose/ui/window/v;Z)I", "Landroid/view/View;", "j", "(Landroid/view/View;)Z", "isParentFlagSecureEnabled", "h", "(Landroidx/compose/ui/window/u;Z)I", "Landroid/graphics/Rect;", "Lc5/p;", "k", "(Landroid/graphics/Rect;)Lc5/p;", "Lm2/b4;", "", "Lm2/b4;", "getLocalPopupTestTag", "()Lm2/b4;", "LocalPopupTestTag", "b", "i", "LocalIsInPopupLayout", "currentContent", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<String> f11045a = d0.h(null, C0244b.f11048b, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b4<Boolean> f11046b = d0.h(null, a.f11047b, 1, null);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.a<Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f11047b = new a();

        a() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean a() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.window.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
    static final class C0244b extends fr.w implements er.a<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0244b f11048b = new C0244b();

        C0244b() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String a() {
            return "DEFAULT_TEST_TAG";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm2/s0;", "Lm2/r0;", "c", "(Lm2/s0;)Lm2/r0;"}, k = 3, mv = {2, 1, 0})
    static final class c extends fr.w implements er.l<s0, r0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f11049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f11050c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ u f11051d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f11052e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c5.t f11053f;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/b$c$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements r0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n f11054a;

            public a(n nVar) {
                this.f11054a = nVar;
            }

            @Override // p076m2.r0
            public void j() {
                this.f11054a.h();
                this.f11054a.s();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n nVar, er.a<i0> aVar, u uVar, String str, c5.t tVar) {
            super(1);
            this.f11049b = nVar;
            this.f11050c = aVar;
            this.f11051d = uVar;
            this.f11052e = str;
            this.f11053f = tVar;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final r0 b(s0 s0Var) {
            this.f11049b.x();
            this.f11049b.z(this.f11050c, this.f11051d, this.f11052e, this.f11053f);
            return new a(this.f11049b);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class d extends fr.w implements er.a<i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f11055b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f11056c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ u f11057d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f11058e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c5.t f11059f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(n nVar, er.a<i0> aVar, u uVar, String str, c5.t tVar) {
            super(0);
            this.f11055b = nVar;
            this.f11056c = aVar;
            this.f11057d = uVar;
            this.f11058e = str;
            this.f11059f = tVar;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            this.f11055b.z(this.f11056c, this.f11057d, this.f11058e, this.f11059f);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm2/s0;", "Lm2/r0;", "c", "(Lm2/s0;)Lm2/r0;"}, k = 3, mv = {2, 1, 0})
    static final class e extends fr.w implements er.l<s0, r0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f11060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t f11061c;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/b$e$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements r0 {
            @Override // p076m2.r0
            public void j() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(n nVar, t tVar) {
            super(1);
            this.f11060b = nVar;
            this.f11061c = tVar;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final r0 b(s0 s0Var) {
            this.f11060b.setPositionProvider(this.f11061c);
            this.f11060b.D();
            return new a();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class f extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f11062e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f11063f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ n f11064g;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Loq/i0;", "c", "(J)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends fr.w implements er.l<Long, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f11065b = new a();

            a() {
                super(1);
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(Long l15) {
                c(l15.longValue());
                return i0.f148189a;
            }

            public final void c(long j15) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(n nVar, tq.e<? super f> eVar) {
            super(2, eVar);
            this.f11064g = nVar;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0029  */
        /* JADX WARN: Code duplicated, block: B:13:0x0035 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:14:0x0036). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r3.f11062e
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r3.f11063f
                ju.p0 r1 = (ju.p0) r1
                oq.u.b(r4)
                goto L36
            L13:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L1b:
                oq.u.b(r4)
                java.lang.Object r4 = r3.f11063f
                ju.p0 r4 = (ju.p0) r4
                r1 = r4
            L23:
                boolean r4 = ju.q0.g(r1)
                if (r4 == 0) goto L3c
                androidx.compose.ui.window.b$f$a r4 = androidx.compose.ui.window.b.f.a.f11065b
                r3.f11063f = r1
                r3.f11062e = r2
                java.lang.Object r4 = androidx.compose.ui.platform.r1.a(r4, r3)
                if (r4 != r0) goto L36
                return r0
            L36:
                androidx.compose.ui.window.n r4 = r3.f11064g
                r4.v()
                goto L23
            L3c:
                oq.i0 r4 = oq.i0.f148189a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.b.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((f) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = new f(this.f11064g, eVar);
            fVar.f11063f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le4/b0;", "childCoordinates", "Loq/i0;", "c", "(Le4/b0;)V"}, k = 3, mv = {2, 1, 0})
    static final class g extends fr.w implements er.l<b0, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f11066b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(n nVar) {
            super(1);
            this.f11066b = nVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(b0 b0Var) {
            c(b0Var);
            return i0.f148189a;
        }

        public final void c(b0 b0Var) {
            this.f11066b.B(b0Var.r0());
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Le4/y0;", "", "Le4/v0;", "<unused var>", "Lc5/b;", "Le4/x0;", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;"}, k = 3, mv = {2, 1, 0})
    static final class h implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f11067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c5.t f11068b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends fr.w implements er.l<a2.a, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f11069b = new a();

            a() {
                super(1);
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
                c(aVar);
                return i0.f148189a;
            }

            public final void c(a2.a aVar) {
            }
        }

        h(n nVar, c5.t tVar) {
            this.f11067a = nVar;
            this.f11068b = tVar;
        }

        @Override // p036e4.w0
        public final x0 e(y0 y0Var, List<? extends v0> list, long j15) {
            this.f11067a.setParentLayoutDirection(this.f11068b);
            return y0.j2(y0Var, 0, 0, null, a.f11069b, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i extends fr.w implements er.p<p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f11070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f11071c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ u f11072d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ er.p<p076m2.r, Integer, i0> f11073e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f11074f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f11075g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(t tVar, er.a<i0> aVar, u uVar, er.p<? super p076m2.r, ? super Integer, i0> pVar, int i15, int i16) {
            super(2);
            this.f11070b = tVar;
            this.f11071c = aVar;
            this.f11072d = uVar;
            this.f11073e = pVar;
            this.f11074f = i15;
            this.f11075g = i16;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            b.a(this.f11070b, this.f11071c, this.f11072d, this.f11073e, rVar, g4.a(this.f11074f | 1), this.f11075g);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/UUID;", "kotlin.jvm.PlatformType", "c", "()Ljava/util/UUID;"}, k = 3, mv = {2, 1, 0})
    static final class j extends fr.w implements er.a<UUID> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f11076b = new j();

        j() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final UUID a() {
            return UUID.randomUUID();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "(Lm2/r;I)V"}, k = 3, mv = {2, 1, 0})
    static final class k extends fr.w implements er.p<p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f11077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f6<er.p<p076m2.r, Integer, i0>> f11078c;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "(Lm2/r;I)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends fr.w implements er.p<p076m2.r, Integer, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f11079b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ f6<er.p<p076m2.r, Integer, i0>> f11080c;

            /* JADX INFO: renamed from: androidx.compose.ui.window.b$k$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln4/i0;", "Loq/i0;", "c", "(Ln4/i0;)V"}, k = 3, mv = {2, 1, 0})
            static final class C0245a extends fr.w implements er.l<n4.i0, i0> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final C0245a f11081b = new C0245a();

                C0245a() {
                    super(1);
                }

                @Override // er.l
                public /* bridge */ /* synthetic */ i0 b(n4.i0 i0Var) {
                    c(i0Var);
                    return i0.f148189a;
                }

                public final void c(n4.i0 i0Var) {
                    f0.Q(i0Var);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.ui.window.b$k$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc5/r;", "it", "Loq/i0;", "c", "(J)V"}, k = 3, mv = {2, 1, 0})
            static final class C0246b extends fr.w implements er.l<c5.r, i0> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ n f11082b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0246b(n nVar) {
                    super(1);
                    this.f11082b = nVar;
                }

                @Override // er.l
                public /* bridge */ /* synthetic */ i0 b(c5.r rVar) {
                    c(rVar.getPackedValue());
                    return i0.f148189a;
                }

                public final void c(long j15) {
                    this.f11082b.m29setPopupContentSizefhxjrPA(c5.r.b(j15));
                    this.f11082b.D();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(n nVar, f6<? extends er.p<? super p076m2.r, ? super Integer, i0>> f6Var) {
                super(2);
                this.f11079b = nVar;
                this.f11080c = f6Var;
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
                c(rVar, num.intValue());
                return i0.f148189a;
            }

            public final void c(p076m2.r rVar, int i15) {
                if (!rVar.r((i15 & 3) != 2, i15 & 1)) {
                    rVar.O();
                    return;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(1022273628, i15, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:441)");
                }
                f3.m.Companion companion = f3.m.INSTANCE;
                Object objE = rVar.E();
                p076m2.r.Companion companion2 = p076m2.r.INSTANCE;
                if (objE == companion2.a()) {
                    objE = C0245a.f11081b;
                    rVar.v(objE);
                }
                f3.m mVarD = n4.v.d(companion, false, (er.l) objE, 1, null);
                boolean zG = rVar.G(this.f11079b);
                n nVar = this.f11079b;
                Object objE2 = rVar.E();
                if (zG || objE2 == companion2.a()) {
                    objE2 = new C0246b(nVar);
                    rVar.v(objE2);
                }
                f3.m mVarA = k3.a.a(q1.a(mVarD, (er.l) objE2), this.f11079b.getCanCalculatePosition() ? 1.0f : 0.0f);
                er.p pVarB = b.b(this.f11080c);
                Object objE3 = rVar.E();
                if (objE3 == companion2.a()) {
                    objE3 = androidx.compose.ui.window.c.f11083a;
                    rVar.v(objE3);
                }
                w0 w0Var = (w0) objE3;
                int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
                e0 e0VarT = rVar.t();
                f3.m mVarE = f3.j.e(rVar, mVarA);
                androidx.compose.ui.node.c.Companion aVar = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB = aVar.b();
                if (rVar.l() == null) {
                    p076m2.m.d();
                }
                rVar.K();
                if (rVar.getInserting()) {
                    rVar.H(aVarB);
                } else {
                    rVar.u();
                }
                p076m2.r rVarC = n6.c(rVar);
                n6.i(rVarC, w0Var, aVar.d());
                n6.i(rVarC, e0VarT, aVar.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), aVar.c());
                n6.g(rVarC, aVar.a());
                n6.i(rVarC, mVarE, aVar.e());
                pVarB.B(rVar, 0);
                rVar.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(n nVar, f6<? extends er.p<? super p076m2.r, ? super Integer, i0>> f6Var) {
            super(2);
            this.f11077b = nVar;
            this.f11078c = f6Var;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            if (!rVar.r((i15 & 3) != 2, i15 & 1)) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-297523940, i15, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:440)");
            }
            d0.c(b.i().d(Boolean.TRUE), y2.m.d(1022273628, true, new a(this.f11077b, this.f11078c), rVar, 54), rVar, c4.f122821i | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0208  */
    /* JADX WARN: Code duplicated, block: B:103:0x020e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0229  */
    /* JADX WARN: Code duplicated, block: B:108:0x022f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0250  */
    /* JADX WARN: Code duplicated, block: B:113:0x0256  */
    /* JADX WARN: Code duplicated, block: B:116:0x027d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0289  */
    /* JADX WARN: Code duplicated, block: B:120:0x028d  */
    /* JADX WARN: Code duplicated, block: B:123:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:125:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:128:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:60:0x010e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0143  */
    /* JADX WARN: Code duplicated, block: B:64:0x0156  */
    /* JADX WARN: Code duplicated, block: B:65:0x0158  */
    /* JADX WARN: Code duplicated, block: B:68:0x0160  */
    /* JADX WARN: Code duplicated, block: B:69:0x0162  */
    /* JADX WARN: Code duplicated, block: B:72:0x0178  */
    /* JADX WARN: Code duplicated, block: B:74:0x017e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0198  */
    /* JADX WARN: Code duplicated, block: B:78:0x019a  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f1  */
    public static final void a(t tVar, er.a<i0> aVar, u uVar, er.p<? super p076m2.r, ? super Integer, i0> pVar, p076m2.r rVar, int i15, int i16) {
        int i17;
        er.a<i0> aVar2;
        int i18;
        u uVar2;
        int i19;
        boolean z15;
        er.a<i0> aVar3;
        u uVar3;
        d5 d5VarM;
        er.a<i0> aVar4;
        u uVar4;
        View view;
        c5.d dVar;
        String str;
        c5.t tVar2;
        p076m2.v vVarE;
        f6 f6VarP;
        Object objE;
        p076m2.r.Companion companion;
        UUID uuid;
        boolean zBooleanValue;
        Object objE2;
        boolean z16;
        String str2;
        int i25;
        n nVar;
        int i26;
        boolean z17;
        int i27;
        boolean z18;
        boolean zW;
        Object objE3;
        boolean z19;
        boolean z25;
        boolean zW2;
        Object objE4;
        int i28;
        boolean z26;
        boolean z27;
        Object objE5;
        boolean zG;
        Object objE6;
        boolean zG2;
        Object objE7;
        boolean zG3;
        Object objE8;
        er.a<androidx.compose.ui.node.c> aVarB;
        int i29;
        t tVar3 = tVar;
        p076m2.r rVarH = rVar.h(-1772091631);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(tVar3) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i35 = i16 & 2;
        if (i35 == 0) {
            if ((i15 & 48) == 0) {
                aVar2 = aVar;
                i17 |= rVarH.G(aVar2) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    uVar2 = uVar;
                    if (rVarH.W(uVar2)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                if ((i15 & 3072) == 0) {
                    if (rVarH.G(pVar)) {
                        i29 = 2048;
                    } else {
                        i29 = 1024;
                    }
                    i17 |= i29;
                }
                if ((i17 & 1171) != 1170) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i35 != 0) {
                        aVar4 = null;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i18 != 0) {
                        uVar4 = new u(false, false, false, false, false, 31, null);
                    } else {
                        uVar4 = uVar2;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(-1772091631, i17, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:417)");
                    }
                    view = (View) rVarH.N(AndroidCompositionLocals_androidKt.g());
                    dVar = (c5.d) rVarH.N(g1.f());
                    str = (String) rVarH.N(f11045a);
                    tVar2 = (c5.t) rVarH.N(g1.l());
                    vVarE = p076m2.m.e(rVarH, 0);
                    f6VarP = x5.p(pVar, rVarH, (i17 >> 9) & 14);
                    Object[] objArr = new Object[0];
                    objE = rVarH.E();
                    companion = p076m2.r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = j.f11076b;
                        rVarH.v(objE);
                    }
                    uuid = (UUID) b3.f.k(objArr, (er.a) objE, rVarH, 48);
                    zBooleanValue = ((Boolean) rVarH.N(f11046b)).booleanValue();
                    objE2 = rVarH.E();
                    if (objE2 == companion.a()) {
                        str2 = str;
                        i25 = 32;
                        n nVar2 = new n(aVar4, uVar4, str2, view, dVar, tVar3, uuid, zBooleanValue, null, 256, null);
                        tVar3 = tVar3;
                        z16 = true;
                        nVar2.w(vVarE, y2.m.b(-297523940, true, new k(nVar2, f6VarP)));
                        rVarH.v(nVar2);
                        objE2 = nVar2;
                    } else {
                        z16 = true;
                        str2 = str;
                        i25 = 32;
                    }
                    nVar = (n) objE2;
                    boolean zG4 = rVarH.G(nVar);
                    int i36 = i17;
                    i26 = i36 & 112;
                    if (i26 == i25) {
                        z17 = z16;
                    } else {
                        z17 = false;
                    }
                    boolean z28 = zG4 | z17;
                    i27 = i36 & 896;
                    if (i27 == 256) {
                        z18 = z16;
                    } else {
                        z18 = false;
                    }
                    zW = z28 | z18 | rVarH.W(str2) | rVarH.c(tVar2.ordinal());
                    objE3 = rVarH.E();
                    if (zW || objE3 == companion.a()) {
                        objE3 = new c(nVar, aVar4, uVar4, str2, tVar2);
                        rVarH.v(objE3);
                    }
                    Function0.a(nVar, (er.l) objE3, rVarH, 0);
                    boolean zG5 = rVarH.G(nVar);
                    if (i26 == i25) {
                        z19 = z16;
                    } else {
                        z19 = false;
                    }
                    boolean z29 = zG5 | z19;
                    if (i27 == 256) {
                        z25 = z16;
                    } else {
                        z25 = false;
                    }
                    zW2 = z29 | z25 | rVarH.W(str2) | rVarH.c(tVar2.ordinal());
                    objE4 = rVarH.E();
                    if (zW2 || objE4 == companion.a()) {
                        objE4 = new d(nVar, aVar4, uVar4, str2, tVar2);
                        rVarH.v(objE4);
                    }
                    Function0.g((er.a) objE4, rVarH, 0);
                    boolean zG6 = rVarH.G(nVar);
                    i28 = i36 & 14;
                    if (i28 == 4) {
                        z26 = z16;
                    } else {
                        z26 = false;
                    }
                    z27 = zG6 | z26;
                    objE5 = rVarH.E();
                    if (z27 || objE5 == companion.a()) {
                        objE5 = new e(nVar, tVar3);
                        rVarH.v(objE5);
                    }
                    Function0.a(tVar3, (er.l) objE5, rVarH, i28);
                    zG = rVarH.G(nVar);
                    objE6 = rVarH.E();
                    if (zG || objE6 == companion.a()) {
                        objE6 = new f(nVar, null);
                        rVarH.v(objE6);
                    }
                    Function0.d(nVar, (er.p) objE6, rVarH, 0);
                    f3.m.Companion companion2 = f3.m.INSTANCE;
                    zG2 = rVarH.G(nVar);
                    objE7 = rVarH.E();
                    if (zG2 || objE7 == companion.a()) {
                        objE7 = new g(nVar);
                        rVarH.v(objE7);
                    }
                    f3.m mVarA = l1.a(companion2, (er.l) objE7);
                    zG3 = rVarH.G(nVar) | rVarH.c(tVar2.ordinal());
                    objE8 = rVarH.E();
                    if (zG3 || objE8 == companion.a()) {
                        objE8 = new h(nVar, tVar2);
                        rVarH.v(objE8);
                    }
                    w0 w0Var = (w0) objE8;
                    int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT = rVarH.t();
                    f3.m mVarE = f3.j.e(rVarH, mVarA);
                    androidx.compose.ui.node.c.Companion aVar5 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = aVar5.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    p076m2.r rVarC = n6.c(rVarH);
                    n6.i(rVarC, w0Var, aVar5.d());
                    n6.i(rVarC, e0VarT, aVar5.f());
                    n6.i(rVarC, Integer.valueOf(iHashCode), aVar5.c());
                    n6.g(rVarC, aVar5.a());
                    n6.i(rVarC, mVarE, aVar5.e());
                    rVarH.x();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    aVar3 = aVar4;
                    uVar3 = uVar4;
                } else {
                    rVarH.O();
                    aVar3 = aVar2;
                    uVar3 = uVar2;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new i(tVar3, aVar3, uVar3, pVar, i15, i16));
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            uVar2 = uVar;
            if ((i15 & 3072) == 0) {
                if (rVarH.G(pVar)) {
                    i29 = 2048;
                } else {
                    i29 = 1024;
                }
                i17 |= i29;
            }
            if ((i17 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i35 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                if (i18 != 0) {
                    uVar4 = new u(false, false, false, false, false, 31, null);
                } else {
                    uVar4 = uVar2;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-1772091631, i17, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:417)");
                }
                view = (View) rVarH.N(AndroidCompositionLocals_androidKt.g());
                dVar = (c5.d) rVarH.N(g1.f());
                str = (String) rVarH.N(f11045a);
                tVar2 = (c5.t) rVarH.N(g1.l());
                vVarE = p076m2.m.e(rVarH, 0);
                f6VarP = x5.p(pVar, rVarH, (i17 >> 9) & 14);
                Object[] objArr2 = new Object[0];
                objE = rVarH.E();
                companion = p076m2.r.INSTANCE;
                if (objE == companion.a()) {
                    objE = j.f11076b;
                    rVarH.v(objE);
                }
                uuid = (UUID) b3.f.k(objArr2, (er.a) objE, rVarH, 48);
                zBooleanValue = ((Boolean) rVarH.N(f11046b)).booleanValue();
                objE2 = rVarH.E();
                if (objE2 == companion.a()) {
                    str2 = str;
                    i25 = 32;
                    n nVar3 = new n(aVar4, uVar4, str2, view, dVar, tVar3, uuid, zBooleanValue, null, 256, null);
                    tVar3 = tVar3;
                    z16 = true;
                    nVar3.w(vVarE, y2.m.b(-297523940, true, new k(nVar3, f6VarP)));
                    rVarH.v(nVar3);
                    objE2 = nVar3;
                } else {
                    z16 = true;
                    str2 = str;
                    i25 = 32;
                }
                nVar = (n) objE2;
                boolean zG7 = rVarH.G(nVar);
                int i37 = i17;
                i26 = i37 & 112;
                if (i26 == i25) {
                    z17 = z16;
                } else {
                    z17 = false;
                }
                boolean z210 = zG7 | z17;
                i27 = i37 & 896;
                if (i27 == 256) {
                    z18 = z16;
                } else {
                    z18 = false;
                }
                zW = z210 | z18 | rVarH.W(str2) | rVarH.c(tVar2.ordinal());
                objE3 = rVarH.E();
                if (zW) {
                    objE3 = new c(nVar, aVar4, uVar4, str2, tVar2);
                    rVarH.v(objE3);
                } else {
                    objE3 = new c(nVar, aVar4, uVar4, str2, tVar2);
                    rVarH.v(objE3);
                }
                Function0.a(nVar, (er.l) objE3, rVarH, 0);
                boolean zG8 = rVarH.G(nVar);
                if (i26 == i25) {
                    z19 = z16;
                } else {
                    z19 = false;
                }
                boolean z211 = zG8 | z19;
                if (i27 == 256) {
                    z25 = z16;
                } else {
                    z25 = false;
                }
                zW2 = z211 | z25 | rVarH.W(str2) | rVarH.c(tVar2.ordinal());
                objE4 = rVarH.E();
                if (zW2) {
                    objE4 = new d(nVar, aVar4, uVar4, str2, tVar2);
                    rVarH.v(objE4);
                } else {
                    objE4 = new d(nVar, aVar4, uVar4, str2, tVar2);
                    rVarH.v(objE4);
                }
                Function0.g((er.a) objE4, rVarH, 0);
                boolean zG9 = rVarH.G(nVar);
                i28 = i37 & 14;
                if (i28 == 4) {
                    z26 = z16;
                } else {
                    z26 = false;
                }
                z27 = zG9 | z26;
                objE5 = rVarH.E();
                if (z27) {
                    objE5 = new e(nVar, tVar3);
                    rVarH.v(objE5);
                } else {
                    objE5 = new e(nVar, tVar3);
                    rVarH.v(objE5);
                }
                Function0.a(tVar3, (er.l) objE5, rVarH, i28);
                zG = rVarH.G(nVar);
                objE6 = rVarH.E();
                if (zG) {
                    objE6 = new f(nVar, null);
                    rVarH.v(objE6);
                } else {
                    objE6 = new f(nVar, null);
                    rVarH.v(objE6);
                }
                Function0.d(nVar, (er.p) objE6, rVarH, 0);
                f3.m.Companion companion3 = f3.m.INSTANCE;
                zG2 = rVarH.G(nVar);
                objE7 = rVarH.E();
                if (zG2) {
                    objE7 = new g(nVar);
                    rVarH.v(objE7);
                } else {
                    objE7 = new g(nVar);
                    rVarH.v(objE7);
                }
                f3.m mVarA2 = l1.a(companion3, (er.l) objE7);
                zG3 = rVarH.G(nVar) | rVarH.c(tVar2.ordinal());
                objE8 = rVarH.E();
                if (zG3) {
                    objE8 = new h(nVar, tVar2);
                    rVarH.v(objE8);
                } else {
                    objE8 = new h(nVar, tVar2);
                    rVarH.v(objE8);
                }
                w0 w0Var2 = (w0) objE8;
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT2 = rVarH.t();
                f3.m mVarE2 = f3.j.e(rVarH, mVarA2);
                androidx.compose.ui.node.c.Companion aVar6 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = aVar6.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC2 = n6.c(rVarH);
                n6.i(rVarC2, w0Var2, aVar6.d());
                n6.i(rVarC2, e0VarT2, aVar6.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), aVar6.c());
                n6.g(rVarC2, aVar6.a());
                n6.i(rVarC2, mVarE2, aVar6.e());
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                aVar3 = aVar4;
                uVar3 = uVar4;
            } else {
                rVarH.O();
                aVar3 = aVar2;
                uVar3 = uVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new i(tVar3, aVar3, uVar3, pVar, i15, i16));
            }
        }
        i17 |= 48;
        aVar2 = aVar;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                uVar2 = uVar;
                if (rVarH.W(uVar2)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            if ((i15 & 3072) == 0) {
                if (rVarH.G(pVar)) {
                    i29 = 2048;
                } else {
                    i29 = 1024;
                }
                i17 |= i29;
            }
            if ((i17 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i35 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                if (i18 != 0) {
                    uVar4 = new u(false, false, false, false, false, 31, null);
                } else {
                    uVar4 = uVar2;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-1772091631, i17, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:417)");
                }
                view = (View) rVarH.N(AndroidCompositionLocals_androidKt.g());
                dVar = (c5.d) rVarH.N(g1.f());
                str = (String) rVarH.N(f11045a);
                tVar2 = (c5.t) rVarH.N(g1.l());
                vVarE = p076m2.m.e(rVarH, 0);
                f6VarP = x5.p(pVar, rVarH, (i17 >> 9) & 14);
                Object[] objArr3 = new Object[0];
                objE = rVarH.E();
                companion = p076m2.r.INSTANCE;
                if (objE == companion.a()) {
                    objE = j.f11076b;
                    rVarH.v(objE);
                }
                uuid = (UUID) b3.f.k(objArr3, (er.a) objE, rVarH, 48);
                zBooleanValue = ((Boolean) rVarH.N(f11046b)).booleanValue();
                objE2 = rVarH.E();
                if (objE2 == companion.a()) {
                    str2 = str;
                    i25 = 32;
                    n nVar4 = new n(aVar4, uVar4, str2, view, dVar, tVar3, uuid, zBooleanValue, null, 256, null);
                    tVar3 = tVar3;
                    z16 = true;
                    nVar4.w(vVarE, y2.m.b(-297523940, true, new k(nVar4, f6VarP)));
                    rVarH.v(nVar4);
                    objE2 = nVar4;
                } else {
                    z16 = true;
                    str2 = str;
                    i25 = 32;
                }
                nVar = (n) objE2;
                boolean zG10 = rVarH.G(nVar);
                int i38 = i17;
                i26 = i38 & 112;
                if (i26 == i25) {
                    z17 = z16;
                } else {
                    z17 = false;
                }
                boolean z212 = zG10 | z17;
                i27 = i38 & 896;
                if (i27 == 256) {
                    z18 = z16;
                } else {
                    z18 = false;
                }
                zW = z212 | z18 | rVarH.W(str2) | rVarH.c(tVar2.ordinal());
                objE3 = rVarH.E();
                if (zW) {
                    objE3 = new c(nVar, aVar4, uVar4, str2, tVar2);
                    rVarH.v(objE3);
                } else {
                    objE3 = new c(nVar, aVar4, uVar4, str2, tVar2);
                    rVarH.v(objE3);
                }
                Function0.a(nVar, (er.l) objE3, rVarH, 0);
                boolean zG11 = rVarH.G(nVar);
                if (i26 == i25) {
                    z19 = z16;
                } else {
                    z19 = false;
                }
                boolean z213 = zG11 | z19;
                if (i27 == 256) {
                    z25 = z16;
                } else {
                    z25 = false;
                }
                zW2 = z213 | z25 | rVarH.W(str2) | rVarH.c(tVar2.ordinal());
                objE4 = rVarH.E();
                if (zW2) {
                    objE4 = new d(nVar, aVar4, uVar4, str2, tVar2);
                    rVarH.v(objE4);
                } else {
                    objE4 = new d(nVar, aVar4, uVar4, str2, tVar2);
                    rVarH.v(objE4);
                }
                Function0.g((er.a) objE4, rVarH, 0);
                boolean zG12 = rVarH.G(nVar);
                i28 = i38 & 14;
                if (i28 == 4) {
                    z26 = z16;
                } else {
                    z26 = false;
                }
                z27 = zG12 | z26;
                objE5 = rVarH.E();
                if (z27) {
                    objE5 = new e(nVar, tVar3);
                    rVarH.v(objE5);
                } else {
                    objE5 = new e(nVar, tVar3);
                    rVarH.v(objE5);
                }
                Function0.a(tVar3, (er.l) objE5, rVarH, i28);
                zG = rVarH.G(nVar);
                objE6 = rVarH.E();
                if (zG) {
                    objE6 = new f(nVar, null);
                    rVarH.v(objE6);
                } else {
                    objE6 = new f(nVar, null);
                    rVarH.v(objE6);
                }
                Function0.d(nVar, (er.p) objE6, rVarH, 0);
                f3.m.Companion companion4 = f3.m.INSTANCE;
                zG2 = rVarH.G(nVar);
                objE7 = rVarH.E();
                if (zG2) {
                    objE7 = new g(nVar);
                    rVarH.v(objE7);
                } else {
                    objE7 = new g(nVar);
                    rVarH.v(objE7);
                }
                f3.m mVarA3 = l1.a(companion4, (er.l) objE7);
                zG3 = rVarH.G(nVar) | rVarH.c(tVar2.ordinal());
                objE8 = rVarH.E();
                if (zG3) {
                    objE8 = new h(nVar, tVar2);
                    rVarH.v(objE8);
                } else {
                    objE8 = new h(nVar, tVar2);
                    rVarH.v(objE8);
                }
                w0 w0Var3 = (w0) objE8;
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT3 = rVarH.t();
                f3.m mVarE3 = f3.j.e(rVarH, mVarA3);
                androidx.compose.ui.node.c.Companion aVar7 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = aVar7.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC3 = n6.c(rVarH);
                n6.i(rVarC3, w0Var3, aVar7.d());
                n6.i(rVarC3, e0VarT3, aVar7.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), aVar7.c());
                n6.g(rVarC3, aVar7.a());
                n6.i(rVarC3, mVarE3, aVar7.e());
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                aVar3 = aVar4;
                uVar3 = uVar4;
            } else {
                rVarH.O();
                aVar3 = aVar2;
                uVar3 = uVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new i(tVar3, aVar3, uVar3, pVar, i15, i16));
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        uVar2 = uVar;
        if ((i15 & 3072) == 0) {
            if (rVarH.G(pVar)) {
                i29 = 2048;
            } else {
                i29 = 1024;
            }
            i17 |= i29;
        }
        if ((i17 & 1171) != 1170) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i35 != 0) {
                aVar4 = null;
            } else {
                aVar4 = aVar2;
            }
            if (i18 != 0) {
                uVar4 = new u(false, false, false, false, false, 31, null);
            } else {
                uVar4 = uVar2;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-1772091631, i17, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:417)");
            }
            view = (View) rVarH.N(AndroidCompositionLocals_androidKt.g());
            dVar = (c5.d) rVarH.N(g1.f());
            str = (String) rVarH.N(f11045a);
            tVar2 = (c5.t) rVarH.N(g1.l());
            vVarE = p076m2.m.e(rVarH, 0);
            f6VarP = x5.p(pVar, rVarH, (i17 >> 9) & 14);
            Object[] objArr4 = new Object[0];
            objE = rVarH.E();
            companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = j.f11076b;
                rVarH.v(objE);
            }
            uuid = (UUID) b3.f.k(objArr4, (er.a) objE, rVarH, 48);
            zBooleanValue = ((Boolean) rVarH.N(f11046b)).booleanValue();
            objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                str2 = str;
                i25 = 32;
                n nVar5 = new n(aVar4, uVar4, str2, view, dVar, tVar3, uuid, zBooleanValue, null, 256, null);
                tVar3 = tVar3;
                z16 = true;
                nVar5.w(vVarE, y2.m.b(-297523940, true, new k(nVar5, f6VarP)));
                rVarH.v(nVar5);
                objE2 = nVar5;
            } else {
                z16 = true;
                str2 = str;
                i25 = 32;
            }
            nVar = (n) objE2;
            boolean zG13 = rVarH.G(nVar);
            int i39 = i17;
            i26 = i39 & 112;
            if (i26 == i25) {
                z17 = z16;
            } else {
                z17 = false;
            }
            boolean z214 = zG13 | z17;
            i27 = i39 & 896;
            if (i27 == 256) {
                z18 = z16;
            } else {
                z18 = false;
            }
            zW = z214 | z18 | rVarH.W(str2) | rVarH.c(tVar2.ordinal());
            objE3 = rVarH.E();
            if (zW) {
                objE3 = new c(nVar, aVar4, uVar4, str2, tVar2);
                rVarH.v(objE3);
            } else {
                objE3 = new c(nVar, aVar4, uVar4, str2, tVar2);
                rVarH.v(objE3);
            }
            Function0.a(nVar, (er.l) objE3, rVarH, 0);
            boolean zG14 = rVarH.G(nVar);
            if (i26 == i25) {
                z19 = z16;
            } else {
                z19 = false;
            }
            boolean z215 = zG14 | z19;
            if (i27 == 256) {
                z25 = z16;
            } else {
                z25 = false;
            }
            zW2 = z215 | z25 | rVarH.W(str2) | rVarH.c(tVar2.ordinal());
            objE4 = rVarH.E();
            if (zW2) {
                objE4 = new d(nVar, aVar4, uVar4, str2, tVar2);
                rVarH.v(objE4);
            } else {
                objE4 = new d(nVar, aVar4, uVar4, str2, tVar2);
                rVarH.v(objE4);
            }
            Function0.g((er.a) objE4, rVarH, 0);
            boolean zG15 = rVarH.G(nVar);
            i28 = i39 & 14;
            if (i28 == 4) {
                z26 = z16;
            } else {
                z26 = false;
            }
            z27 = zG15 | z26;
            objE5 = rVarH.E();
            if (z27) {
                objE5 = new e(nVar, tVar3);
                rVarH.v(objE5);
            } else {
                objE5 = new e(nVar, tVar3);
                rVarH.v(objE5);
            }
            Function0.a(tVar3, (er.l) objE5, rVarH, i28);
            zG = rVarH.G(nVar);
            objE6 = rVarH.E();
            if (zG) {
                objE6 = new f(nVar, null);
                rVarH.v(objE6);
            } else {
                objE6 = new f(nVar, null);
                rVarH.v(objE6);
            }
            Function0.d(nVar, (er.p) objE6, rVarH, 0);
            f3.m.Companion companion5 = f3.m.INSTANCE;
            zG2 = rVarH.G(nVar);
            objE7 = rVarH.E();
            if (zG2) {
                objE7 = new g(nVar);
                rVarH.v(objE7);
            } else {
                objE7 = new g(nVar);
                rVarH.v(objE7);
            }
            f3.m mVarA4 = l1.a(companion5, (er.l) objE7);
            zG3 = rVarH.G(nVar) | rVarH.c(tVar2.ordinal());
            objE8 = rVarH.E();
            if (zG3) {
                objE8 = new h(nVar, tVar2);
                rVarH.v(objE8);
            } else {
                objE8 = new h(nVar, tVar2);
                rVarH.v(objE8);
            }
            w0 w0Var4 = (w0) objE8;
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT4 = rVarH.t();
            f3.m mVarE4 = f3.j.e(rVarH, mVarA4);
            androidx.compose.ui.node.c.Companion aVar8 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = aVar8.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC4 = n6.c(rVarH);
            n6.i(rVarC4, w0Var4, aVar8.d());
            n6.i(rVarC4, e0VarT4, aVar8.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), aVar8.c());
            n6.g(rVarC4, aVar8.a());
            n6.i(rVarC4, mVarE4, aVar8.e());
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            aVar3 = aVar4;
            uVar3 = uVar4;
        } else {
            rVarH.O();
            aVar3 = aVar2;
            uVar3 = uVar2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new i(tVar3, aVar3, uVar3, pVar, i15, i16));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final er.p<p076m2.r, Integer, i0> b(f6<? extends er.p<? super p076m2.r, ? super Integer, i0>> f6Var) {
        return (er.p) f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(boolean z15, v vVar, boolean z16) {
        int i15 = !z15 ? 262152 : PKIFailureInfo.transactionIdInUse;
        if (vVar == v.SecureOn) {
            i15 |= PKIFailureInfo.certRevoked;
        }
        return !z16 ? i15 | 512 : i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(u uVar, boolean z15) {
        if (uVar.getInheritSecurePolicy() && z15) {
            return uVar.getFlags() | PKIFailureInfo.certRevoked;
        }
        return (!uVar.getInheritSecurePolicy() || z15) ? uVar.getFlags() : uVar.getFlags() & (-8193);
    }

    public static final b4<Boolean> i() {
        return f11046b;
    }

    public static final boolean j(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & PKIFailureInfo.certRevoked) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5.p k(Rect rect) {
        return new c5.p(rect.left, rect.top, rect.right, rect.bottom);
    }
}
