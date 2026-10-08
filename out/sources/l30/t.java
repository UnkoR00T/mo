package l30;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.g1;
import d1.c0;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import d1.x;
import f1.b0;
import f1.b1;
import f1.y0;
import j30.ButtonTextData;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.TextStyle;
import java.util.Locale;
import ju.p0;
import mx.Label;
import n3.y2;
import n4.f0;
import n4.g0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.a5;
import p046f2.h5;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.x5;
import p143z0.e1;
import w0.q0;
import w0.r1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a;\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\r\u0010\u0004\u001aE\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a[\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\"\u0014\u0010!\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \"\u0014\u0010#\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 \"\u0014\u0010%\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010 ¨\u0006&"}, d2 = {"Ll30/a;", "data", "Loq/i0;", "s", "(Ll30/a;Lm2/r;I)V", "", "testTagParam", "headlineLabel", "Lkotlin/Function0;", "onTodayClick", "onChangeClick", "B", "(Ljava/lang/String;Ljava/lang/String;Ler/a;Ler/a;Lm2/r;I)V", "I", "Lc5/h;", "screenWidth", "dayWidth", "Ljava/time/LocalDate;", "firstDayOfWeekDate", "onDayFocused", "E", "(Ll30/a;Ljava/lang/String;FFLjava/time/LocalDate;Ler/a;Lm2/r;I)V", "testTag", AnnotatedPrivateKey.LABEL, "dayContentDescription", "dayValue", "Ll30/v;", "dayState", "onClick", "v", "(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll30/v;Ler/a;Ler/a;Lm2/r;I)V", "a", "F", "MAX_DAY_CIRCLE_SIZE", "b", "MIN_DAY_SPACING", "c", "SCREEN_WIDTH_MIN_THRESHOLD", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f115729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f115730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f115731c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f115732e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f6<Boolean> f115733f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f115734g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f6<Boolean> f6Var, er.a<i0> aVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f115733f = f6Var;
            this.f115734g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f115732e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (this.f115733f.getValue().booleanValue()) {
                this.f115734g.a();
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f115733f, this.f115734g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f115735e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f115736f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f115737g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f115738h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ CalendarData f115739j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ y0 f115740k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CalendarData calendarData, y0 y0Var, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f115739j = calendarData;
            this.f115740k = y0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f115738h;
            if (i15 == 0) {
                oq.u.b(obj);
                w scrollTrigger = this.f115739j.getScrollTrigger();
                if (scrollTrigger != null) {
                    y0 y0Var = this.f115740k;
                    int weekOffset = scrollTrigger.getWeekOffset() + 1073741823;
                    this.f115735e = vq.j.a(scrollTrigger);
                    this.f115736f = 0;
                    this.f115737g = weekOffset;
                    this.f115738h = 1;
                    if (y0.r(y0Var, weekOffset, 0, this, 2, null) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f115739j, this.f115740k, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f115741e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f115742f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ CalendarData f115743g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CalendarData f115744a;

            a(CalendarData calendarData) {
                this.f115744a = calendarData;
            }

            @Override // mu.h
            public /* bridge */ /* synthetic */ Object F(Object obj, tq.e eVar) {
                return a(((Number) obj).intValue(), eVar);
            }

            public final Object a(int i15, tq.e<? super i0> eVar) {
                this.f115744a.f().b(new fz.b.LocalDate(this.f115744a.getFirstDayOfCurrentWeekDate().getDate().plusWeeks(i15 - 1073741823)));
                return i0.f148189a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b implements mu.g<Integer> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.g f115745a;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a<T> implements mu.h {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ mu.h f115746a;

                /* JADX INFO: renamed from: l30.t$c$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class C2788a extends vq.d {

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    /* synthetic */ Object f115747d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    int f115748e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    Object f115749f;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    Object f115751h;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    Object f115752j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    Object f115753k;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    int f115754l;

                    public C2788a(tq.e eVar) {
                        super(eVar);
                    }

                    @Override // vq.a
                    public final Object J(Object obj) {
                        this.f115747d = obj;
                        this.f115748e |= PKIFailureInfo.systemUnavail;
                        return a.this.F(null, this);
                    }
                }

                public a(mu.h hVar) {
                    this.f115746a = hVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // mu.h
                public final Object F(Object obj, tq.e eVar) throws Throwable {
                    C2788a c2788a;
                    if (eVar instanceof C2788a) {
                        c2788a = (C2788a) eVar;
                        int i15 = c2788a.f115748e;
                        if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                            c2788a.f115748e = i15 - PKIFailureInfo.systemUnavail;
                        } else {
                            c2788a = new C2788a(eVar);
                        }
                    } else {
                        c2788a = new C2788a(eVar);
                    }
                    Object obj2 = c2788a.f115747d;
                    Object objE = uq.b.e();
                    int i16 = c2788a.f115748e;
                    if (i16 == 0) {
                        oq.u.b(obj2);
                        mu.h hVar = this.f115746a;
                        f1.q qVar = (f1.q) pq.v.z0(((b0) obj).j());
                        Integer numE = qVar != null ? vq.b.e(qVar.getIndex()) : null;
                        c2788a.f115749f = vq.j.a(obj);
                        c2788a.f115751h = vq.j.a(c2788a);
                        c2788a.f115752j = vq.j.a(obj);
                        c2788a.f115753k = vq.j.a(hVar);
                        c2788a.f115754l = 0;
                        c2788a.f115748e = 1;
                        if (hVar.F(numE, c2788a) == objE) {
                            return objE;
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oq.u.b(obj2);
                    }
                    return i0.f148189a;
                }
            }

            public b(mu.g gVar) {
                this.f115745a = gVar;
            }

            @Override // mu.g
            public Object a(mu.h<? super Integer> hVar, tq.e eVar) {
                Object objA = this.f115745a.a(new a(hVar), eVar);
                return objA == uq.b.e() ? objA : i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y0 y0Var, CalendarData calendarData, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f115742f = y0Var;
            this.f115743g = calendarData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b0 O(y0 y0Var) {
            return y0Var.C();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f115741e;
            if (i15 == 0) {
                oq.u.b(obj);
                final y0 y0Var = this.f115742f;
                mu.g gVarP = mu.i.p(mu.i.x(new b(x5.q(new er.a() { // from class: l30.u
                    @Override // er.a
                    public final Object a() {
                        return t.c.O(y0Var);
                    }
                }))));
                a aVar = new a(this.f115743g);
                this.f115741e = 1;
                if (gVarP.a(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f115742f, this.f115743g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f115755e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f115756f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f115757g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(y0 y0Var, int i15, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f115756f = y0Var;
            this.f115757g = i15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f115755e;
            if (i15 == 0) {
                oq.u.b(obj);
                y0 y0Var = this.f115756f;
                int i16 = this.f115757g;
                this.f115755e = 1;
                if (y0.r(y0Var, i16, 0, this, 2, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
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
            return new d(this.f115756f, this.f115757g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f115758a;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.Selected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.Unselected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.Today.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f115758a = iArr;
        }
    }

    static {
        float fN = c5.h.n(44);
        f115729a = fN;
        float fN2 = c5.h.n(2);
        f115730b = fN2;
        f115731c = c5.h.n(c5.h.n(7 * fN) + c5.h.n(6 * fN2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(String str, float f15, String str2, String str3, String str4, v vVar, er.a aVar, er.a aVar2, int i15, p076m2.r rVar, int i16) {
        v(str, f15, str2, str3, str4, vVar, aVar, aVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void B(final String str, final String str2, final er.a<i0> aVar, final er.a<i0> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-722893133);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(str) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(str2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(aVar2) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-722893133, i16, -1, "pl.gov.coi.common.ui.ds.calendar.Headline (Calendar.kt:109)");
            }
            f3.c.Companion companion = f3.c.INSTANCE;
            f3.c.InterfaceC1317c interfaceC1317cI = companion.i();
            f3.m.Companion companion2 = f3.m.INSTANCE;
            d1.i iVar = d1.i.f39152a;
            w0 w0VarB = m3.b(iVar.j(), interfaceC1317cI, rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion2);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarB, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            f3.m mVarC = p3.c(q3.f39261a, companion2, 1.0f, false, 2, null);
            boolean z15 = (i16 & 14) == 4;
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: l30.l
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t.C(str, (n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f3.m mVarD = n4.v.d(mVarC, false, (er.l) objE, 1, null);
            Label labelB = mx.b.b(str2, str + "_Headline");
            k70.a aVar3 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(mVarD, null, labelB, null, null, aVar3.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVarH, i17).m(), null, null, false, false, null, rVarH, 0, 0, 0, 33030106);
            rVarH = rVarH;
            w0 w0VarB2 = m3.b(iVar.j(), companion.i(), rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, companion2);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarB2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            r3.a(androidx.compose.foundation.layout.d.y(companion2, aVar3.b(rVarH, i17).getSpacing300()), rVarH, 0);
            c70.a aVar4 = c70.a.f23835a;
            j30.f.e(null, new ButtonTextData(str + "_TodayButton", aVar4.a().z(), null, null, aVar, 12, null), false, rVarH, MLKEMEngine.KyberPolyBytes, 1);
            r3.a(androidx.compose.foundation.layout.d.y(companion2, aVar3.b(rVarH, i17).getSpacing200()), rVarH, 0);
            j30.f.e(null, new ButtonTextData(str + "_ChangeButton", aVar4.a().x(), null, null, aVar2, 12, null), false, rVarH, MLKEMEngine.KyberPolyBytes, 1);
            rVarH.x();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: l30.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.D(str, str2, aVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(String str, n4.i0 i0Var) {
        g0.a(i0Var, true);
        f0.y0(i0Var, str + "_Headline");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(String str, String str2, er.a aVar, er.a aVar2, int i15, p076m2.r rVar, int i16) {
        B(str, str2, aVar, aVar2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void E(final CalendarData calendarData, final String str, final float f15, final float f16, final LocalDate localDate, final er.a<i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        float f17;
        p076m2.r rVar2;
        v vVar;
        final String str2 = str;
        p076m2.r rVarH = rVar.h(-425896375);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(calendarData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(str2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.b(f15) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            f17 = f16;
            i16 |= rVarH.b(f17) ? 2048 : 1024;
        } else {
            f17 = f16;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.G(localDate) ? 16384 : PKIFailureInfo.certRevoked;
        }
        er.a<i0> aVar2 = aVar;
        if ((196608 & i15) == 0) {
            i16 |= rVarH.G(aVar2) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if (rVarH.r((74899 & i16) != 74898, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-425896375, i16, -1, "pl.gov.coi.common.ui.ds.calendar.Week (Calendar.kt:240)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = a5.l(a5.f55133a, null, null, null, 7, null);
                rVarH.v(objE);
            }
            h5 h5Var = (h5) objE;
            Locale platformLocale = ((x4.c) rVarH.N(g1.m())).getPlatformLocale();
            d1.i.f fVarH = d1.i.f39152a.h();
            f3.c.InterfaceC1317c interfaceC1317cI = f3.c.INSTANCE.i();
            f3.m.Companion companion2 = f3.m.INSTANCE;
            int i17 = i16;
            boolean z15 = (i17 & 112) == 32;
            Object objE2 = rVarH.E();
            if (z15 || objE2 == companion.a()) {
                objE2 = new er.l() { // from class: l30.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t.F(str2, (n4.i0) obj);
                    }
                };
                rVarH.v(objE2);
            }
            f3.m mVarS = androidx.compose.foundation.layout.d.s(n4.v.d(companion2, false, (er.l) objE2, 1, null), f15);
            w0 w0VarB = m3.b(fVarH, interfaceC1317cI, rVarH, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarS);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarB, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            q3 q3Var = q3.f39261a;
            rVarH.X(1135312964);
            int i18 = 0;
            while (i18 < 7) {
                final LocalDate localDatePlusDays = localDate.plusDays(i18);
                String strB = h5Var.b(Long.valueOf(localDatePlusDays.atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli()), platformLocale, true);
                if (strB == null) {
                    strB = "";
                }
                String str3 = strB;
                if (fr.t.c(localDatePlusDays, calendarData.getSelectedDate().getDate())) {
                    vVar = v.Selected;
                } else {
                    vVar = fr.t.c(localDatePlusDays, calendarData.getCurrentDate().getDate()) ? v.Today : v.Unselected;
                }
                v vVar2 = vVar;
                String str4 = str2 + "_Day" + i18;
                String displayName = localDatePlusDays.getDayOfWeek().getDisplayName(TextStyle.SHORT_STANDALONE, platformLocale);
                String strValueOf = String.valueOf(localDatePlusDays.getDayOfMonth());
                h5 h5Var2 = h5Var;
                boolean zG = ((i17 & 14) == 4) | rVarH.G(localDatePlusDays);
                Object objE3 = rVarH.E();
                if (zG || objE3 == p076m2.r.INSTANCE.a()) {
                    objE3 = new er.a() { // from class: l30.d
                        @Override // er.a
                        public final Object a() {
                            return t.G(calendarData, localDatePlusDays);
                        }
                    };
                    rVarH.v(objE3);
                }
                p076m2.r rVar3 = rVarH;
                v(str4, f17, displayName, str3, strValueOf, vVar2, (er.a) objE3, aVar2, rVar3, ((i17 >> 6) & 112) | ((i17 << 6) & 29360128));
                i18++;
                str2 = str;
                f17 = f16;
                aVar2 = aVar;
                platformLocale = platformLocale;
                rVarH = rVar3;
                h5Var = h5Var2;
            }
            rVar2 = rVarH;
            rVar2.R();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: l30.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.H(calendarData, str, f15, f16, localDate, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(String str, n4.i0 i0Var) {
        g0.a(i0Var, true);
        f0.y0(i0Var, str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(CalendarData calendarData, LocalDate localDate) {
        calendarData.e().b(new fz.b.LocalDate(localDate));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(CalendarData calendarData, String str, float f15, float f16, LocalDate localDate, er.a aVar, int i15, p076m2.r rVar, int i16) {
        E(calendarData, str, f15, f16, localDate, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void I(final CalendarData calendarData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(285833394);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(calendarData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(285833394, i16, -1, "pl.gov.coi.common.ui.ds.calendar.WeeksCarousel (Calendar.kt:150)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            boolean z15 = (i16 & 14) == 4;
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: l30.n
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t.J(calendarData, (n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f3.m mVarC = n4.v.c(companion, true, (er.l) objE);
            l3.g.Companion companion2 = l3.g.INSTANCE;
            d1.b0.d(androidx.compose.foundation.layout.d.h(q0.a(t70.i.E(t70.i.F(mVarC, companion2.h(), rVarH, 0), companion2.a(), rVarH, 0)), 0.0f, 1, null), null, false, y2.m.d(2120468488, true, new er.q() { // from class: l30.o
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return t.K(calendarData, (c0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 3072, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: l30.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.O(calendarData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(CalendarData calendarData, n4.i0 i0Var) {
        g0.a(i0Var, true);
        f0.y0(i0Var, calendarData.getTestTag() + "_Container");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(final CalendarData calendarData, final c0 c0Var, p076m2.r rVar, int i15) {
        c0 c0Var2;
        int i16;
        float fN;
        float fN2;
        y0 y0Var;
        if ((i15 & 6) == 0) {
            c0Var2 = c0Var;
            i16 = i15 | (rVar.W(c0Var2) ? 4 : 2);
        } else {
            c0Var2 = c0Var;
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2120468488, i16, -1, "pl.gov.coi.common.ui.ds.calendar.WeeksCarousel.<anonymous> (Calendar.kt:162)");
            }
            boolean zB = rVar.b(c0Var2.a());
            Object objE = rVar.E();
            if (zB || objE == p076m2.r.INSTANCE.a()) {
                boolean z15 = c5.h.l(c0Var2.a(), f115731c) > 0;
                if (z15) {
                    fN = f115729a;
                } else {
                    if (z15) {
                        throw new oq.p();
                    }
                    fN = c5.h.n(c5.h.n(c0Var2.a() - c5.h.n(f115730b * 6)) / 7);
                }
                objE = c5.h.j(fN);
                rVar.v(objE);
            }
            final float value = ((c5.h) objE).getValue();
            boolean zB2 = rVar.b(c0Var2.a());
            Object objE2 = rVar.E();
            if (zB2 || objE2 == p076m2.r.INSTANCE.a()) {
                boolean z16 = c5.h.l(c0Var2.a(), f115731c) > 0;
                if (z16) {
                    fN2 = c5.h.n(c5.h.n(c0Var2.a() - c5.h.n(7 * value)) / 6);
                } else {
                    if (z16) {
                        throw new oq.p();
                    }
                    fN2 = f115730b;
                }
                objE2 = c5.h.j(fN2);
                rVar.v(objE2);
            }
            float value2 = ((c5.h) objE2).getValue();
            final y0 y0VarC = b1.c(1073741823, 0, rVar, 6, 2);
            e1 e1VarE = a1.f.e(y0VarC, a1.o.b.f1227a, rVar, 48, 0);
            Object objE3 = rVar.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE3 == companion.a()) {
                objE3 = Function0.i(tq.j.f191408a, rVar);
                rVar.v(objE3);
            }
            final p0 p0Var = (p0) objE3;
            w scrollTrigger = calendarData.getScrollTrigger();
            boolean zW = rVar.W(calendarData) | rVar.W(y0VarC);
            Object objE4 = rVar.E();
            if (zW || objE4 == companion.a()) {
                objE4 = new b(calendarData, y0VarC, null);
                rVar.v(objE4);
            }
            Function0.d(scrollTrigger, (er.p) objE4, rVar, 0);
            boolean zW2 = rVar.W(y0VarC) | rVar.W(calendarData);
            Object objE5 = rVar.E();
            if (zW2 || objE5 == companion.a()) {
                objE5 = new c(y0VarC, calendarData, null);
                rVar.v(objE5);
            }
            Function0.d(y0VarC, (er.p) objE5, rVar, 0);
            d1.i.f fVarR = d1.i.f39152a.r(value2);
            f3.c.InterfaceC1317c interfaceC1317cI = f3.c.INSTANCE.i();
            f3.m mVarH = androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null);
            boolean zW3 = rVar.W(calendarData) | ((i16 & 14) == 4) | rVar.b(value) | rVar.G(p0Var) | rVar.W(y0VarC);
            Object objE6 = rVar.E();
            if (zW3 || objE6 == companion.a()) {
                Object obj = new er.l() { // from class: l30.q
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.L(calendarData, c0Var, value, p0Var, y0VarC, (f1.q0) obj2);
                    }
                };
                y0Var = y0VarC;
                rVar.v(obj);
                objE6 = obj;
            } else {
                y0Var = y0VarC;
            }
            f1.d.e(mVarH, y0Var, null, false, fVarR, interfaceC1317cI, e1VarE, false, null, (er.l) objE6, rVar, 196614, 396);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(final CalendarData calendarData, final c0 c0Var, final float f15, final p0 p0Var, final y0 y0Var, f1.q0 q0Var) {
        f1.q0.e(q0Var, Integer.MAX_VALUE, null, null, y2.m.b(452373212, true, new er.r() { // from class: l30.r
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return t.M(calendarData, c0Var, f15, p0Var, y0Var, (f1.e) obj, ((Integer) obj2).intValue(), (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 6, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(CalendarData calendarData, c0 c0Var, float f15, final p0 p0Var, final y0 y0Var, f1.e eVar, final int i15, p076m2.r rVar, int i16) {
        int i17;
        if ((i16 & 48) == 0) {
            i17 = i16 | (rVar.c(i15) ? 32 : 16);
        } else {
            i17 = i16;
        }
        if (rVar.r((i17 & 145) != 144, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(452373212, i17, -1, "pl.gov.coi.common.ui.ds.calendar.WeeksCarousel.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Calendar.kt:215)");
            }
            int i18 = i15 - 1073741823;
            LocalDate localDatePlusWeeks = calendarData.getFirstDayOfCurrentWeekDate().getDate().plusWeeks(i18);
            String str = calendarData.getTestTag() + "_Week" + i18;
            float fA = c0Var.a();
            boolean zG = rVar.G(p0Var) | rVar.W(y0Var) | ((i17 & 112) == 32);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: l30.s
                    @Override // er.a
                    public final Object a() {
                        return t.N(p0Var, y0Var, i15);
                    }
                };
                rVar.v(objE);
            }
            E(calendarData, str, fA, f15, localDatePlusWeeks, (er.a) objE, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(p0 p0Var, y0 y0Var, int i15) {
        ju.k.d(p0Var, null, null, new d(y0Var, i15, null), 3, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(CalendarData calendarData, int i15, p076m2.r rVar, int i16) {
        I(calendarData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void s(final CalendarData calendarData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1093939187);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(calendarData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1093939187, i16, -1, "pl.gov.coi.common.ui.ds.calendar.Calendar (Calendar.kt:89)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            String testTag = calendarData.getTestTag();
            String headlineLabel = calendarData.getHeadlineLabel();
            int i17 = i16 & 14;
            boolean z15 = i17 == 4;
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: l30.b
                    @Override // er.a
                    public final Object a() {
                        return t.t(calendarData);
                    }
                };
                rVarH.v(objE);
            }
            B(testTag, headlineLabel, (er.a) objE, calendarData.d(), rVarH, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing300()), rVarH, 0);
            I(calendarData, rVarH, i17);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: l30.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.u(calendarData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(CalendarData calendarData) {
        calendarData.e().b(calendarData.getCurrentDate());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(CalendarData calendarData, int i15, p076m2.r rVar, int i16) {
        s(calendarData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void v(String str, final float f15, final String str2, final String str3, final String str4, final v vVar, final er.a<i0> aVar, final er.a<i0> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        int i17;
        final String str5;
        p076m2.r rVar2;
        long jG;
        long primary;
        p076m2.r rVarH = rVar.h(-787252440);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(str) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.b(f15) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.W(str2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.W(str3) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.W(str4) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i16 |= rVarH.c(vVar.ordinal()) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        int i18 = i16;
        if ((1572864 & i15) == 0) {
            i17 = i18 | (rVarH.G(aVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        } else {
            i17 = i18;
        }
        if ((i15 & 12582912) == 0) {
            i17 |= rVarH.G(aVar2) ? 8388608 : 4194304;
        }
        if (rVarH.r((i17 & 4793491) != 4793490, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-787252440, i17, -1, "pl.gov.coi.common.ui.ds.calendar.Day (Calendar.kt:300)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = t70.s.I();
                rVarH.v(objE);
            }
            final cx.a aVar3 = (cx.a) objE;
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = b1.k.a();
                rVarH.v(objE2);
            }
            b1.l lVar = (b1.l) objE2;
            f6<Boolean> f6VarA = b1.f.a(lVar, rVarH, 6);
            Boolean value = f6VarA.getValue();
            boolean zW = rVarH.W(f6VarA) | ((i17 & 29360128) == 8388608);
            Object objE3 = rVarH.E();
            int i19 = i17;
            if (zW || objE3 == companion.a()) {
                objE3 = new a(f6VarA, aVar2, null);
                rVarH.v(objE3);
            }
            Function0.d(value, (er.p) objE3, rVarH, 0);
            f3.c.b bVarG = f3.c.INSTANCE.g();
            f3.m.Companion companion2 = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), bVarG, rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion2);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label labelB = mx.b.b(str2, str + "_Label");
            k70.a aVar4 = k70.a.f108864a;
            int i25 = k70.a.f108865b;
            j70.h.g(null, null, labelB, null, null, aVar4.a(rVarH, i25).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar4.f(rVarH, i25).f(), null, null, false, true, null, rVarH, 0, 0, 3072, 24637403);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar4.b(rVarH, i25).getSpacing100()), rVarH, 0);
            boolean z15 = ((458752 & i19) == 131072) | ((i19 & 7168) == 2048);
            Object objE4 = rVarH.E();
            if (z15 || objE4 == companion.a()) {
                objE4 = new er.l() { // from class: l30.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t.w(str3, vVar, (n4.i0) obj);
                    }
                };
                rVarH.v(objE4);
            }
            f3.m mVarA = k3.f.a(t70.s.o(n4.v.d(companion2, false, (er.l) objE4, 1, null), f6VarA, c5.h.j(c5.h.n(f15 / 2))), l1.h.i());
            r1 r1VarE = t70.s.E(0.0f, rVarH, 0, 1);
            boolean zG = rVarH.G(aVar3) | ((3670016 & i19) == 1048576);
            Object objE5 = rVarH.E();
            if (zG || objE5 == companion.a()) {
                objE5 = new er.a() { // from class: l30.g
                    @Override // er.a
                    public final Object a() {
                        return t.x(aVar3, aVar);
                    }
                };
                rVarH.v(objE5);
            }
            f3.m mVarL = androidx.compose.foundation.b.l(mVarA, lVar, r1VarE, false, null, null, (er.a) objE5, 28, null);
            float strokeWidth = aVar4.b(rVarH, i25).getStrokeWidth();
            y2 radius500 = aVar4.e(rVarH, i25).getRadius500();
            int[] iArr = e.f115758a;
            int i26 = iArr[vVar.ordinal()];
            if (i26 == 1) {
                rVarH.X(4797757);
                rVarH.R();
                jG = Color.INSTANCE.g();
            } else if (i26 == 2) {
                rVarH.X(4799453);
                rVarH.R();
                jG = Color.INSTANCE.g();
            } else {
                if (i26 != 3) {
                    rVarH.X(4796114);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(4801465);
                jG = aVar4.a(rVarH, i25).getBase().getPrimary();
                rVarH.R();
            }
            f3.m mVarO = androidx.compose.foundation.layout.d.o(w0.o.h(mVarL, strokeWidth, jG, radius500), f15);
            y2 radius501 = aVar4.e(rVarH, i25).getRadius500();
            int i27 = iArr[vVar.ordinal()];
            if (i27 == 1) {
                rVarH.X(4807449);
                primary = aVar4.a(rVarH, i25).getBase().getPrimary();
                rVarH.R();
            } else if (i27 == 2) {
                rVarH.X(4809466);
                primary = aVar4.a(rVarH, i25).getSurface().a();
                rVarH.R();
            } else {
                if (i27 != 3) {
                    rVarH.X(4805472);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(4811354);
                primary = aVar4.a(rVarH, i25).getSurface().a();
                rVarH.R();
            }
            long j15 = primary;
            str5 = str;
            androidx.compose.material3.l.g(mVarO, radius501, j15, 0L, 0.0f, 0.0f, null, y2.m.d(-1285081417, true, new er.p() { // from class: l30.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.z(str4, str5, vVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 12582912, 120);
            rVar2 = rVarH;
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            str5 = str;
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            final String str6 = str5;
            d5VarM.a(new er.p() { // from class: l30.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.A(str6, f15, str2, str3, str4, vVar, aVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(String str, v vVar, n4.i0 i0Var) {
        f0.r0(i0Var, n4.l.INSTANCE.a());
        f0.c0(i0Var, str);
        f0.s0(i0Var, vVar == v.Selected);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(cx.a aVar, final er.a aVar2) {
        cx.a.a(aVar, 0L, new er.a() { // from class: l30.j
            @Override // er.a
            public final Object a() {
                return t.y(aVar2);
            }
        }, 1, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(er.a aVar) {
        aVar.a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(String str, String str2, v vVar, p076m2.r rVar, int i15) {
        long jD;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1285081417, i15, -1, "pl.gov.coi.common.ui.ds.calendar.Day.<anonymous>.<anonymous> (Calendar.kt:359)");
            }
            f3.c cVarE = f3.c.INSTANCE.e();
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarI = d1.r.i(cVarE, false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            x xVar = x.f39368a;
            Label labelB = mx.b.b(str, str2 + "_Value");
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            q4.TextStyle textStyleB = aVar.f(rVar, i16).b();
            int i17 = e.f115758a[vVar.ordinal()];
            if (i17 == 1) {
                rVar.X(1333439430);
                jD = aVar.a(rVar, i16).getBase().d();
                rVar.R();
            } else if (i17 == 2) {
                rVar.X(1333441639);
                jD = aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i();
                rVar.R();
            } else {
                if (i17 != 3) {
                    rVar.X(1333437339);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(1333443620);
                jD = aVar.a(rVar, i16).getBase().getPrimary();
                rVar.R();
            }
            j70.h.g(null, null, labelB, null, null, jD, 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, textStyleB, null, null, false, true, null, rVar, 0, 0, 3072, 24637403);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }
}
