package p046f2;

import b3.x;
import c5.h;
import c5.n;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import d1.a3;
import d1.d3;
import d1.e0;
import er.l;
import er.p;
import f1.b1;
import f1.q0;
import f1.y0;
import f3.j;
import f3.m;
import h2.CalendarDate;
import h2.CalendarMonth;
import h2.a2;
import h2.b2;
import h2.l0;
import h2.o0;
import java.util.List;
import java.util.Locale;
import ju.p0;
import l2.k0;
import l2.q;
import l3.d0;
import n4.CustomAccessibilityAction;
import n4.ScrollAxisRange;
import n4.f0;
import n4.v;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p114t0.w;
import q4.TextStyle;
import tq.e;
import u0.j0;
import vq.k;
import y2.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ao\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aQ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0097\u0001\u0010(\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u00122\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00182\u001c\u0010#\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\t0\"2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0$2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0003¢\u0006\u0004\b(\u0010)\u001a\u0085\u0001\u0010*\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u00122\u0006\u0010 \u001a\u00020\u00122\u001c\u0010#\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\t0\"2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0$2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b*\u0010+\u001a\u0085\u0001\u0010.\u001a\u00020\t2\u0006\u0010-\u001a\u00020,2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u00122\u001c\u0010#\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\t0\"2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0$2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b.\u0010/\u001aI\u00103\u001a\u00020\t2\u0006\u00100\u001a\u00020\u00122\b\u00101\u001a\u0004\u0018\u00010\u00122\b\u00102\u001a\u0004\u0018\u00010\u00122\u001c\u0010#\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\t0\"H\u0002¢\u0006\u0004\b3\u00104\u001a#\u0010:\u001a\u00020\t*\u0002052\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0000¢\u0006\u0004\b:\u0010;\u001a5\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A2\u0006\u0010\u0001\u001a\u00020,2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020>H\u0002¢\u0006\u0004\bC\u0010D\"\u001a\u0010J\u001a\u00020E8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0014\u0010L\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010G\"\u0014\u0010N\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010G\"\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006S"}, d2 = {"Lf2/ja;", "state", "Lf3/m;", "modifier", "Lf2/h5;", "dateFormatter", "Lf2/w4;", "colors", "Lkotlin/Function0;", "Loq/i0;", "title", "headline", "", "showModeToggle", "Ll3/d0;", "focusRequester", "A", "(Lf2/ja;Lf3/m;Lf2/h5;Lf2/w4;Ler/p;Ler/p;ZLl3/d0;Lm2/r;II)V", "", "initialSelectedStartDateMillis", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "Llr/i;", "yearRange", "Lf2/ob;", "initialDisplayMode", "Lf2/pi;", "selectableDates", "f0", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llr/i;ILf2/pi;Lm2/r;II)Lf2/ja;", "selectedStartDateMillis", "selectedEndDateMillis", "displayedMonthMillis", "displayMode", "Lkotlin/Function2;", "onDatesSelectionChange", "Lkotlin/Function1;", "onDisplayedMonthChange", "Lh2/l0;", "calendarModel", i.f37094u, "(Ljava/lang/Long;Ljava/lang/Long;JILer/p;Ler/l;Lh2/l0;Llr/i;Lf2/h5;Lf2/pi;Lf2/w4;Ll3/d0;Lm2/r;II)V", "J", "(Ljava/lang/Long;Ljava/lang/Long;JLer/p;Ler/l;Lh2/l0;Llr/i;Lf2/h5;Lf2/pi;Lf2/w4;Lm2/r;I)V", "Lf1/y0;", "lazyListState", i.f37086m, "(Lf1/y0;Ljava/lang/Long;Ljava/lang/Long;Ler/p;Ler/l;Lh2/l0;Llr/i;Lf2/h5;Lf2/pi;Lf2/w4;Lm2/r;I)V", "dateInMillis", "currentStartDateMillis", "currentEndDateMillis", "h0", "(JLjava/lang/Long;Ljava/lang/Long;Ler/p;)V", "Lp3/c;", "Lf2/qi;", "selectedRangeInfo", "Landroidx/compose/ui/graphics/Color;", "color", "e0", "(Lp3/c;Lf2/qi;J)V", "Lju/p0;", "coroutineScope", "", "scrollUpLabel", "scrollDownLabel", "", "Ln4/g;", "b0", "(Lf1/y0;Lju/p0;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Ld1/d3;", "a", "Ld1/d3;", "getCalendarMonthSubheadPadding", "()Ld1/d3;", "CalendarMonthSubheadPadding", "b", "DateRangePickerTitlePadding", "c", "DateRangePickerHeadlinePadding", "Lc5/h;", "d", "F", "HeaderHeightOffset", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ia {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d3 f56271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d3 f56272c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d3 f56270a = a3.i(h.n(24), h.n(20), 0.0f, h.n(8), 4, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f56273d = h.n(60);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56274e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f56275f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f56276g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0 y0Var, int i15, e<? super a> eVar) {
            super(2, eVar);
            this.f56275f = y0Var;
            this.f56276g = i15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f56274e;
            if (i15 == 0) {
                u.b(obj);
                int iX = this.f56275f.x();
                int i16 = this.f56276g;
                if (iX != i16) {
                    y0 y0Var = this.f56275f;
                    this.f56274e = 1;
                    if (y0.R(y0Var, i16, 0, this, 2, null) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new a(this.f56275f, this.f56276g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56277e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f56278f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ l<Long, i0> f56279g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ l0 f56280h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ lr.i f56281j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(y0 y0Var, l<? super Long, i0> lVar, l0 l0Var, lr.i iVar, e<? super b> eVar) {
            super(2, eVar);
            this.f56278f = y0Var;
            this.f56279g = lVar;
            this.f56280h = l0Var;
            this.f56281j = iVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f56277e;
            if (i15 == 0) {
                u.b(obj);
                y0 y0Var = this.f56278f;
                l<Long, i0> lVar = this.f56279g;
                l0 l0Var = this.f56280h;
                lr.i iVar = this.f56281j;
                this.f56277e = 1;
                if (i8.J2(y0Var, lVar, l0Var, iVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new b(this.f56278f, this.f56279g, this.f56280h, this.f56281j, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56282e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f56283f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y0 y0Var, e<? super c> eVar) {
            super(2, eVar);
            this.f56283f = y0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f56282e;
            if (i15 == 0) {
                u.b(obj);
                y0 y0Var = this.f56283f;
                int iX = y0Var.x() + 1;
                this.f56282e = 1;
                if (y0.R(y0Var, iX, 0, this, 2, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new c(this.f56283f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f56284e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y0 f56285f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(y0 y0Var, e<? super d> eVar) {
            super(2, eVar);
            this.f56285f = y0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f56284e;
            if (i15 == 0) {
                u.b(obj);
                y0 y0Var = this.f56285f;
                int iX = y0Var.x() - 1;
                this.f56284e = 1;
                if (y0.R(y0Var, iX, 0, this, 2, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new d(this.f56285f, eVar);
        }
    }

    static {
        float f15 = 64;
        float f16 = 12;
        f56271b = a3.i(h.n(f15), 0.0f, h.n(f16), 0.0f, 10, null);
        f56272c = a3.i(h.n(f15), 0.0f, h.n(f16), h.n(f16), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0126 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0128  */
    /* JADX WARN: Code duplicated, block: B:109:0x012f  */
    /* JADX WARN: Code duplicated, block: B:111:0x013b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0153  */
    /* JADX WARN: Code duplicated, block: B:116:0x0159  */
    /* JADX WARN: Code duplicated, block: B:117:0x0162  */
    /* JADX WARN: Code duplicated, block: B:119:0x0165  */
    /* JADX WARN: Code duplicated, block: B:120:0x017a  */
    /* JADX WARN: Code duplicated, block: B:122:0x017f  */
    /* JADX WARN: Code duplicated, block: B:123:0x018c  */
    /* JADX WARN: Code duplicated, block: B:125:0x018f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0192  */
    /* JADX WARN: Code duplicated, block: B:129:0x019e  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:137:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:139:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:141:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:147:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:149:0x021a  */
    /* JADX WARN: Code duplicated, block: B:152:0x027e  */
    /* JADX WARN: Code duplicated, block: B:155:0x0289  */
    /* JADX WARN: Code duplicated, block: B:158:0x029d  */
    /* JADX WARN: Code duplicated, block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x009c  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:95:0x0105  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A(final ja jaVar, m mVar, h5 h5Var, w4 w4Var, p<? super r, ? super Integer, i0> pVar, p<? super r, ? super Integer, i0> pVar2, boolean z15, d0 d0Var, r rVar, final int i15, final int i16) {
        int i17;
        m mVar2;
        w4 w4Var2;
        int i18;
        p<? super r, ? super Integer, i0> pVarD;
        int i19;
        int i25;
        p<? super r, ? super Integer, i0> pVar3;
        int i26;
        int i27;
        boolean z16;
        int i28;
        int i29;
        int i35;
        boolean z17;
        r rVar2;
        final h5 h5Var2;
        final d0 d0Var2;
        final m mVar3;
        final w4 w4Var3;
        final p<? super r, ? super Integer, i0> pVar4;
        final boolean z18;
        final p<? super r, ? super Integer, i0> pVar5;
        d5 d5VarM;
        final h5 h5Var3;
        final w4 w4VarI;
        boolean z19;
        int i36;
        p<? super r, ? super Integer, i0> pVarD2;
        p<? super r, ? super Integer, i0> pVar6;
        boolean z25;
        final w4 w4Var4;
        m mVar4;
        int i37;
        d0 d0Var3;
        Object objE;
        Object objE2;
        boolean zW;
        Object objE3;
        l0 l0VarA;
        f fVarD;
        int i38;
        boolean zG;
        r rVarH = rVar.h(1969726368);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(jaVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i39 = i16 & 2;
        if (i39 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i17 |= rVarH.W(mVar2) ? 32 : 16;
            }
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                if ((i16 & 4) != 0) {
                    i38 = 128;
                } else {
                    if ((i15 & 512) == 0) {
                        zG = rVarH.W(h5Var);
                    } else {
                        zG = rVarH.G(h5Var);
                    }
                    if (zG) {
                        i38 = 256;
                    } else {
                        i38 = 128;
                    }
                }
                i17 |= i38;
            }
            if ((i15 & 3072) == 0) {
                if ((i16 & 8) == 0) {
                    w4Var2 = w4Var;
                    int i45 = rVarH.W(w4Var2) ? 2048 : 1024;
                    i17 |= i45;
                } else {
                    w4Var2 = w4Var;
                }
                i17 |= i45;
            } else {
                w4Var2 = w4Var;
            }
            i18 = i16 & 16;
            if (i18 != 0) {
                if ((i15 & 24576) == 0) {
                    pVarD = pVar;
                    if (rVarH.G(pVarD)) {
                        i19 = 16384;
                    } else {
                        i19 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 32;
                if (i25 != 0) {
                    if ((196608 & i15) == 0) {
                        pVar3 = pVar2;
                        if (rVarH.G(pVar3)) {
                            i26 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i26 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i26;
                    }
                    i27 = i16 & 64;
                    if (i27 != 0) {
                        if ((1572864 & i15) == 0) {
                            z16 = z15;
                            if (rVarH.a(z16)) {
                                i28 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i28 = PKIFailureInfo.signerNotTrusted;
                            }
                            i17 |= i28;
                        }
                        i29 = i16 & 128;
                        if (i29 != 0) {
                            i17 |= 12582912;
                        } else if ((i15 & 12582912) == 0) {
                            if (rVarH.W(d0Var)) {
                                i35 = 8388608;
                            } else {
                                i35 = 4194304;
                            }
                            i17 |= i35;
                        }
                        if ((i17 & 4793491) != 4793490) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if (rVarH.r(z17, i17 & 1)) {
                            rVarH.I();
                            if ((i15 & 1) != 0 || rVarH.Q()) {
                                if (i39 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if ((i16 & 4) != 0) {
                                    objE2 = rVarH.E();
                                    if (objE2 == r.INSTANCE.a()) {
                                        objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                        rVarH.v(objE2);
                                    }
                                    h5Var3 = (h5) objE2;
                                    i17 &= -897;
                                } else {
                                    h5Var3 = h5Var;
                                }
                                if ((i16 & 8) != 0) {
                                    w4VarI = a5.f55133a.i(rVarH, 6);
                                    i17 &= -7169;
                                } else {
                                    w4VarI = w4Var2;
                                }
                                if (i18 != 0) {
                                    z19 = true;
                                    pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                                        @Override // er.p
                                        public final Object B(Object obj, Object obj2) {
                                            return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                        }
                                    }, rVarH, 54);
                                    i36 = 54;
                                } else {
                                    z19 = true;
                                    i36 = 54;
                                }
                                if (i25 != 0) {
                                    pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                                        @Override // er.p
                                        public final Object B(Object obj, Object obj2) {
                                            return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                        }
                                    }, rVarH, i36);
                                } else {
                                    pVarD2 = pVar3;
                                }
                                if (i27 != 0) {
                                    z16 = true;
                                }
                                if (i29 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = new d0();
                                        rVarH.v(objE);
                                    }
                                    int i46 = i17;
                                    d0Var3 = (d0) objE;
                                    z25 = z16;
                                    w4Var4 = w4VarI;
                                    i37 = i46;
                                    pVar3 = pVarD2;
                                    pVar6 = pVarD;
                                    mVar4 = mVar2;
                                } else {
                                    pVar3 = pVarD2;
                                    pVar6 = pVarD;
                                    z25 = z16;
                                    w4Var4 = w4VarI;
                                    mVar4 = mVar2;
                                    i37 = i17;
                                    d0Var3 = d0Var;
                                }
                            } else {
                                rVarH.O();
                                if ((i16 & 4) != 0) {
                                    i17 &= -897;
                                }
                                if ((i16 & 8) != 0) {
                                    i17 &= -7169;
                                }
                                h5Var3 = h5Var;
                                i37 = i17;
                                pVar6 = pVarD;
                                z25 = z16;
                                d0Var3 = d0Var;
                                mVar4 = mVar2;
                                w4Var4 = w4Var2;
                            }
                            rVarH.y();
                            if (t.k()) {
                                t.o(1969726368, i37, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                            }
                            zW = rVarH.W(jaVar.g());
                            objE3 = rVarH.E();
                            if (zW || objE3 == r.INSTANCE.a()) {
                                if (jaVar instanceof h0) {
                                    l0VarA = ((h0) jaVar).getCalendarModel();
                                } else {
                                    l0VarA = o0.a(jaVar.g());
                                }
                                objE3 = l0VarA;
                                rVarH.v(objE3);
                            }
                            final l0 l0Var = (l0) objE3;
                            if (z25) {
                                rVarH.X(-2018450762);
                                fVarD = y2.m.d(1343236786, true, new p() { // from class: f2.ba
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return ia.D(jaVar, w4Var4, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54);
                                rVarH.R();
                            } else {
                                rVarH.X(-2018063138);
                                rVarH.R();
                                fVarD = null;
                            }
                            f fVar = fVarD;
                            q qVar = q.f115154a;
                            TextStyle textStyleE = ds.e(qVar.w(), rVarH, 6);
                            float fN = h.n(qVar.v() - f56273d);
                            final d0 d0Var4 = d0Var3;
                            final w4 w4Var5 = w4Var4;
                            p pVar7 = new p() { // from class: f2.ca
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.F(jaVar, l0Var, h5Var3, w4Var5, d0Var4, (r) obj, ((Integer) obj2).intValue());
                                }
                            };
                            h5 h5Var4 = h5Var3;
                            int i47 = i37 >> 9;
                            rVar2 = rVarH;
                            i8.z0(mVar4, pVar6, pVar3, fVar, w4Var4, textStyleE, fN, y2.m.d(684885105, true, pVar7, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i47 & 112) | (i47 & 896) | ((i37 << 3) & 57344));
                            if (t.k()) {
                                t.n();
                            }
                            h5Var2 = h5Var4;
                            d0Var2 = d0Var4;
                            z18 = z25;
                            mVar3 = mVar4;
                            pVar4 = pVar6;
                            w4Var3 = w4Var4;
                        } else {
                            rVar2 = rVarH;
                            rVar2.O();
                            h5Var2 = h5Var;
                            d0Var2 = d0Var;
                            mVar3 = mVar2;
                            w4Var3 = w4Var2;
                            pVar4 = pVarD;
                            z18 = z16;
                        }
                        pVar5 = pVar3;
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: f2.da
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.I(jaVar, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 1572864;
                    z16 = z15;
                    i29 = i16 & 128;
                    if (i29 != 0) {
                        i17 |= 12582912;
                    } else if ((i15 & 12582912) == 0) {
                        if (rVarH.W(d0Var)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i17 |= i35;
                    }
                    if ((i17 & 4793491) != 4793490) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i39 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if ((i16 & 4) != 0) {
                                objE2 = rVarH.E();
                                if (objE2 == r.INSTANCE.a()) {
                                    objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                    rVarH.v(objE2);
                                }
                                h5Var3 = (h5) objE2;
                                i17 &= -897;
                            } else {
                                h5Var3 = h5Var;
                            }
                            if ((i16 & 8) != 0) {
                                w4VarI = a5.f55133a.i(rVarH, 6);
                                i17 &= -7169;
                            } else {
                                w4VarI = w4Var2;
                            }
                            if (i18 != 0) {
                                z19 = true;
                                pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54);
                                i36 = 54;
                            } else {
                                z19 = true;
                                i36 = 54;
                            }
                            if (i25 != 0) {
                                pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, i36);
                            } else {
                                pVarD2 = pVar3;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                int i48 = i17;
                                d0Var3 = (d0) objE;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                i37 = i48;
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                mVar4 = mVar2;
                            } else {
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                mVar4 = mVar2;
                                i37 = i17;
                                d0Var3 = d0Var;
                            }
                        } else {
                            if (i39 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if ((i16 & 4) != 0) {
                                objE2 = rVarH.E();
                                if (objE2 == r.INSTANCE.a()) {
                                    objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                    rVarH.v(objE2);
                                }
                                h5Var3 = (h5) objE2;
                                i17 &= -897;
                            } else {
                                h5Var3 = h5Var;
                            }
                            if ((i16 & 8) != 0) {
                                w4VarI = a5.f55133a.i(rVarH, 6);
                                i17 &= -7169;
                            } else {
                                w4VarI = w4Var2;
                            }
                            if (i18 != 0) {
                                z19 = true;
                                pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54);
                                i36 = 54;
                            } else {
                                z19 = true;
                                i36 = 54;
                            }
                            if (i25 != 0) {
                                pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, i36);
                            } else {
                                pVarD2 = pVar3;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                int i49 = i17;
                                d0Var3 = (d0) objE;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                i37 = i49;
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                mVar4 = mVar2;
                            } else {
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                mVar4 = mVar2;
                                i37 = i17;
                                d0Var3 = d0Var;
                            }
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1969726368, i37, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                        }
                        zW = rVarH.W(jaVar.g());
                        objE3 = rVarH.E();
                        if (zW) {
                            if (jaVar instanceof h0) {
                                l0VarA = ((h0) jaVar).getCalendarModel();
                            } else {
                                l0VarA = o0.a(jaVar.g());
                            }
                            objE3 = l0VarA;
                            rVarH.v(objE3);
                        } else {
                            if (jaVar instanceof h0) {
                                l0VarA = ((h0) jaVar).getCalendarModel();
                            } else {
                                l0VarA = o0.a(jaVar.g());
                            }
                            objE3 = l0VarA;
                            rVarH.v(objE3);
                        }
                        final l0 l0Var2 = (l0) objE3;
                        if (z25) {
                            rVarH.X(-2018450762);
                            fVarD = y2.m.d(1343236786, true, new p() { // from class: f2.ba
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.D(jaVar, w4Var4, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            rVarH.R();
                        } else {
                            rVarH.X(-2018063138);
                            rVarH.R();
                            fVarD = null;
                        }
                        f fVar2 = fVarD;
                        q qVar2 = q.f115154a;
                        TextStyle textStyleE2 = ds.e(qVar2.w(), rVarH, 6);
                        float fN2 = h.n(qVar2.v() - f56273d);
                        final d0 d0Var5 = d0Var3;
                        final w4 w4Var6 = w4Var4;
                        p pVar8 = new p() { // from class: f2.ca
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.F(jaVar, l0Var2, h5Var3, w4Var6, d0Var5, (r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        h5 h5Var5 = h5Var3;
                        int i410 = i37 >> 9;
                        rVar2 = rVarH;
                        i8.z0(mVar4, pVar6, pVar3, fVar2, w4Var4, textStyleE2, fN2, y2.m.d(684885105, true, pVar8, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i410 & 112) | (i410 & 896) | ((i37 << 3) & 57344));
                        if (t.k()) {
                            t.n();
                        }
                        h5Var2 = h5Var5;
                        d0Var2 = d0Var5;
                        z18 = z25;
                        mVar3 = mVar4;
                        pVar4 = pVar6;
                        w4Var3 = w4Var4;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        h5Var2 = h5Var;
                        d0Var2 = d0Var;
                        mVar3 = mVar2;
                        w4Var3 = w4Var2;
                        pVar4 = pVarD;
                        z18 = z16;
                    }
                    pVar5 = pVar3;
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.da
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.I(jaVar, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 196608;
                pVar3 = pVar2;
                i27 = i16 & 64;
                if (i27 != 0) {
                    if ((1572864 & i15) == 0) {
                        z16 = z15;
                        if (rVarH.a(z16)) {
                            i28 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i28 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i28;
                    }
                    i29 = i16 & 128;
                    if (i29 != 0) {
                        i17 |= 12582912;
                    } else if ((i15 & 12582912) == 0) {
                        if (rVarH.W(d0Var)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i17 |= i35;
                    }
                    if ((i17 & 4793491) != 4793490) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i39 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if ((i16 & 4) != 0) {
                                objE2 = rVarH.E();
                                if (objE2 == r.INSTANCE.a()) {
                                    objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                    rVarH.v(objE2);
                                }
                                h5Var3 = (h5) objE2;
                                i17 &= -897;
                            } else {
                                h5Var3 = h5Var;
                            }
                            if ((i16 & 8) != 0) {
                                w4VarI = a5.f55133a.i(rVarH, 6);
                                i17 &= -7169;
                            } else {
                                w4VarI = w4Var2;
                            }
                            if (i18 != 0) {
                                z19 = true;
                                pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54);
                                i36 = 54;
                            } else {
                                z19 = true;
                                i36 = 54;
                            }
                            if (i25 != 0) {
                                pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, i36);
                            } else {
                                pVarD2 = pVar3;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                int i411 = i17;
                                d0Var3 = (d0) objE;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                i37 = i411;
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                mVar4 = mVar2;
                            } else {
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                mVar4 = mVar2;
                                i37 = i17;
                                d0Var3 = d0Var;
                            }
                        } else {
                            if (i39 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if ((i16 & 4) != 0) {
                                objE2 = rVarH.E();
                                if (objE2 == r.INSTANCE.a()) {
                                    objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                    rVarH.v(objE2);
                                }
                                h5Var3 = (h5) objE2;
                                i17 &= -897;
                            } else {
                                h5Var3 = h5Var;
                            }
                            if ((i16 & 8) != 0) {
                                w4VarI = a5.f55133a.i(rVarH, 6);
                                i17 &= -7169;
                            } else {
                                w4VarI = w4Var2;
                            }
                            if (i18 != 0) {
                                z19 = true;
                                pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54);
                                i36 = 54;
                            } else {
                                z19 = true;
                                i36 = 54;
                            }
                            if (i25 != 0) {
                                pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, i36);
                            } else {
                                pVarD2 = pVar3;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                int i412 = i17;
                                d0Var3 = (d0) objE;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                i37 = i412;
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                mVar4 = mVar2;
                            } else {
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                mVar4 = mVar2;
                                i37 = i17;
                                d0Var3 = d0Var;
                            }
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1969726368, i37, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                        }
                        zW = rVarH.W(jaVar.g());
                        objE3 = rVarH.E();
                        if (zW) {
                            if (jaVar instanceof h0) {
                                l0VarA = ((h0) jaVar).getCalendarModel();
                            } else {
                                l0VarA = o0.a(jaVar.g());
                            }
                            objE3 = l0VarA;
                            rVarH.v(objE3);
                        } else {
                            if (jaVar instanceof h0) {
                                l0VarA = ((h0) jaVar).getCalendarModel();
                            } else {
                                l0VarA = o0.a(jaVar.g());
                            }
                            objE3 = l0VarA;
                            rVarH.v(objE3);
                        }
                        final l0 l0Var3 = (l0) objE3;
                        if (z25) {
                            rVarH.X(-2018450762);
                            fVarD = y2.m.d(1343236786, true, new p() { // from class: f2.ba
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.D(jaVar, w4Var4, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            rVarH.R();
                        } else {
                            rVarH.X(-2018063138);
                            rVarH.R();
                            fVarD = null;
                        }
                        f fVar3 = fVarD;
                        q qVar3 = q.f115154a;
                        TextStyle textStyleE3 = ds.e(qVar3.w(), rVarH, 6);
                        float fN3 = h.n(qVar3.v() - f56273d);
                        final d0 d0Var6 = d0Var3;
                        final w4 w4Var7 = w4Var4;
                        p pVar9 = new p() { // from class: f2.ca
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.F(jaVar, l0Var3, h5Var3, w4Var7, d0Var6, (r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        h5 h5Var6 = h5Var3;
                        int i413 = i37 >> 9;
                        rVar2 = rVarH;
                        i8.z0(mVar4, pVar6, pVar3, fVar3, w4Var4, textStyleE3, fN3, y2.m.d(684885105, true, pVar9, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i413 & 112) | (i413 & 896) | ((i37 << 3) & 57344));
                        if (t.k()) {
                            t.n();
                        }
                        h5Var2 = h5Var6;
                        d0Var2 = d0Var6;
                        z18 = z25;
                        mVar3 = mVar4;
                        pVar4 = pVar6;
                        w4Var3 = w4Var4;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        h5Var2 = h5Var;
                        d0Var2 = d0Var;
                        mVar3 = mVar2;
                        w4Var3 = w4Var2;
                        pVar4 = pVarD;
                        z18 = z16;
                    }
                    pVar5 = pVar3;
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.da
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.I(jaVar, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 1572864;
                z16 = z15;
                i29 = i16 & 128;
                if (i29 != 0) {
                    i17 |= 12582912;
                } else if ((i15 & 12582912) == 0) {
                    if (rVarH.W(d0Var)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i17 |= i35;
                }
                if ((i17 & 4793491) != 4793490) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i39 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                rVarH.v(objE2);
                            }
                            h5Var3 = (h5) objE2;
                            i17 &= -897;
                        } else {
                            h5Var3 = h5Var;
                        }
                        if ((i16 & 8) != 0) {
                            w4VarI = a5.f55133a.i(rVarH, 6);
                            i17 &= -7169;
                        } else {
                            w4VarI = w4Var2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                            pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            i36 = 54;
                        } else {
                            z19 = true;
                            i36 = 54;
                        }
                        if (i25 != 0) {
                            pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, i36);
                        } else {
                            pVarD2 = pVar3;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            int i414 = i17;
                            d0Var3 = (d0) objE;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            i37 = i414;
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            mVar4 = mVar2;
                        } else {
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            mVar4 = mVar2;
                            i37 = i17;
                            d0Var3 = d0Var;
                        }
                    } else {
                        if (i39 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                rVarH.v(objE2);
                            }
                            h5Var3 = (h5) objE2;
                            i17 &= -897;
                        } else {
                            h5Var3 = h5Var;
                        }
                        if ((i16 & 8) != 0) {
                            w4VarI = a5.f55133a.i(rVarH, 6);
                            i17 &= -7169;
                        } else {
                            w4VarI = w4Var2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                            pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            i36 = 54;
                        } else {
                            z19 = true;
                            i36 = 54;
                        }
                        if (i25 != 0) {
                            pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, i36);
                        } else {
                            pVarD2 = pVar3;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            int i415 = i17;
                            d0Var3 = (d0) objE;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            i37 = i415;
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            mVar4 = mVar2;
                        } else {
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            mVar4 = mVar2;
                            i37 = i17;
                            d0Var3 = d0Var;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1969726368, i37, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                    }
                    zW = rVarH.W(jaVar.g());
                    objE3 = rVarH.E();
                    if (zW) {
                        if (jaVar instanceof h0) {
                            l0VarA = ((h0) jaVar).getCalendarModel();
                        } else {
                            l0VarA = o0.a(jaVar.g());
                        }
                        objE3 = l0VarA;
                        rVarH.v(objE3);
                    } else {
                        if (jaVar instanceof h0) {
                            l0VarA = ((h0) jaVar).getCalendarModel();
                        } else {
                            l0VarA = o0.a(jaVar.g());
                        }
                        objE3 = l0VarA;
                        rVarH.v(objE3);
                    }
                    final l0 l0Var4 = (l0) objE3;
                    if (z25) {
                        rVarH.X(-2018450762);
                        fVarD = y2.m.d(1343236786, true, new p() { // from class: f2.ba
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.D(jaVar, w4Var4, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        rVarH.R();
                    } else {
                        rVarH.X(-2018063138);
                        rVarH.R();
                        fVarD = null;
                    }
                    f fVar4 = fVarD;
                    q qVar4 = q.f115154a;
                    TextStyle textStyleE4 = ds.e(qVar4.w(), rVarH, 6);
                    float fN4 = h.n(qVar4.v() - f56273d);
                    final d0 d0Var7 = d0Var3;
                    final w4 w4Var8 = w4Var4;
                    p pVar10 = new p() { // from class: f2.ca
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ia.F(jaVar, l0Var4, h5Var3, w4Var8, d0Var7, (r) obj, ((Integer) obj2).intValue());
                        }
                    };
                    h5 h5Var7 = h5Var3;
                    int i416 = i37 >> 9;
                    rVar2 = rVarH;
                    i8.z0(mVar4, pVar6, pVar3, fVar4, w4Var4, textStyleE4, fN4, y2.m.d(684885105, true, pVar10, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i416 & 112) | (i416 & 896) | ((i37 << 3) & 57344));
                    if (t.k()) {
                        t.n();
                    }
                    h5Var2 = h5Var7;
                    d0Var2 = d0Var7;
                    z18 = z25;
                    mVar3 = mVar4;
                    pVar4 = pVar6;
                    w4Var3 = w4Var4;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    h5Var2 = h5Var;
                    d0Var2 = d0Var;
                    mVar3 = mVar2;
                    w4Var3 = w4Var2;
                    pVar4 = pVarD;
                    z18 = z16;
                }
                pVar5 = pVar3;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.da
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ia.I(jaVar, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            pVarD = pVar;
            i25 = i16 & 32;
            if (i25 != 0) {
                if ((196608 & i15) == 0) {
                    pVar3 = pVar2;
                    if (rVarH.G(pVar3)) {
                        i26 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i26 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 64;
                if (i27 != 0) {
                    if ((1572864 & i15) == 0) {
                        z16 = z15;
                        if (rVarH.a(z16)) {
                            i28 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i28 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i28;
                    }
                    i29 = i16 & 128;
                    if (i29 != 0) {
                        i17 |= 12582912;
                    } else if ((i15 & 12582912) == 0) {
                        if (rVarH.W(d0Var)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i17 |= i35;
                    }
                    if ((i17 & 4793491) != 4793490) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i39 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if ((i16 & 4) != 0) {
                                objE2 = rVarH.E();
                                if (objE2 == r.INSTANCE.a()) {
                                    objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                    rVarH.v(objE2);
                                }
                                h5Var3 = (h5) objE2;
                                i17 &= -897;
                            } else {
                                h5Var3 = h5Var;
                            }
                            if ((i16 & 8) != 0) {
                                w4VarI = a5.f55133a.i(rVarH, 6);
                                i17 &= -7169;
                            } else {
                                w4VarI = w4Var2;
                            }
                            if (i18 != 0) {
                                z19 = true;
                                pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54);
                                i36 = 54;
                            } else {
                                z19 = true;
                                i36 = 54;
                            }
                            if (i25 != 0) {
                                pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, i36);
                            } else {
                                pVarD2 = pVar3;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                int i417 = i17;
                                d0Var3 = (d0) objE;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                i37 = i417;
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                mVar4 = mVar2;
                            } else {
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                mVar4 = mVar2;
                                i37 = i17;
                                d0Var3 = d0Var;
                            }
                        } else {
                            if (i39 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if ((i16 & 4) != 0) {
                                objE2 = rVarH.E();
                                if (objE2 == r.INSTANCE.a()) {
                                    objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                    rVarH.v(objE2);
                                }
                                h5Var3 = (h5) objE2;
                                i17 &= -897;
                            } else {
                                h5Var3 = h5Var;
                            }
                            if ((i16 & 8) != 0) {
                                w4VarI = a5.f55133a.i(rVarH, 6);
                                i17 &= -7169;
                            } else {
                                w4VarI = w4Var2;
                            }
                            if (i18 != 0) {
                                z19 = true;
                                pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54);
                                i36 = 54;
                            } else {
                                z19 = true;
                                i36 = 54;
                            }
                            if (i25 != 0) {
                                pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, i36);
                            } else {
                                pVarD2 = pVar3;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                int i418 = i17;
                                d0Var3 = (d0) objE;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                i37 = i418;
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                mVar4 = mVar2;
                            } else {
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                mVar4 = mVar2;
                                i37 = i17;
                                d0Var3 = d0Var;
                            }
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1969726368, i37, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                        }
                        zW = rVarH.W(jaVar.g());
                        objE3 = rVarH.E();
                        if (zW) {
                            if (jaVar instanceof h0) {
                                l0VarA = ((h0) jaVar).getCalendarModel();
                            } else {
                                l0VarA = o0.a(jaVar.g());
                            }
                            objE3 = l0VarA;
                            rVarH.v(objE3);
                        } else {
                            if (jaVar instanceof h0) {
                                l0VarA = ((h0) jaVar).getCalendarModel();
                            } else {
                                l0VarA = o0.a(jaVar.g());
                            }
                            objE3 = l0VarA;
                            rVarH.v(objE3);
                        }
                        final l0 l0Var5 = (l0) objE3;
                        if (z25) {
                            rVarH.X(-2018450762);
                            fVarD = y2.m.d(1343236786, true, new p() { // from class: f2.ba
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.D(jaVar, w4Var4, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            rVarH.R();
                        } else {
                            rVarH.X(-2018063138);
                            rVarH.R();
                            fVarD = null;
                        }
                        f fVar5 = fVarD;
                        q qVar5 = q.f115154a;
                        TextStyle textStyleE5 = ds.e(qVar5.w(), rVarH, 6);
                        float fN5 = h.n(qVar5.v() - f56273d);
                        final d0 d0Var8 = d0Var3;
                        final w4 w4Var9 = w4Var4;
                        p pVar11 = new p() { // from class: f2.ca
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.F(jaVar, l0Var5, h5Var3, w4Var9, d0Var8, (r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        h5 h5Var8 = h5Var3;
                        int i419 = i37 >> 9;
                        rVar2 = rVarH;
                        i8.z0(mVar4, pVar6, pVar3, fVar5, w4Var4, textStyleE5, fN5, y2.m.d(684885105, true, pVar11, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i419 & 112) | (i419 & 896) | ((i37 << 3) & 57344));
                        if (t.k()) {
                            t.n();
                        }
                        h5Var2 = h5Var8;
                        d0Var2 = d0Var8;
                        z18 = z25;
                        mVar3 = mVar4;
                        pVar4 = pVar6;
                        w4Var3 = w4Var4;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        h5Var2 = h5Var;
                        d0Var2 = d0Var;
                        mVar3 = mVar2;
                        w4Var3 = w4Var2;
                        pVar4 = pVarD;
                        z18 = z16;
                    }
                    pVar5 = pVar3;
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.da
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.I(jaVar, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 1572864;
                z16 = z15;
                i29 = i16 & 128;
                if (i29 != 0) {
                    i17 |= 12582912;
                } else if ((i15 & 12582912) == 0) {
                    if (rVarH.W(d0Var)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i17 |= i35;
                }
                if ((i17 & 4793491) != 4793490) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i39 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                rVarH.v(objE2);
                            }
                            h5Var3 = (h5) objE2;
                            i17 &= -897;
                        } else {
                            h5Var3 = h5Var;
                        }
                        if ((i16 & 8) != 0) {
                            w4VarI = a5.f55133a.i(rVarH, 6);
                            i17 &= -7169;
                        } else {
                            w4VarI = w4Var2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                            pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            i36 = 54;
                        } else {
                            z19 = true;
                            i36 = 54;
                        }
                        if (i25 != 0) {
                            pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, i36);
                        } else {
                            pVarD2 = pVar3;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            int i4110 = i17;
                            d0Var3 = (d0) objE;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            i37 = i4110;
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            mVar4 = mVar2;
                        } else {
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            mVar4 = mVar2;
                            i37 = i17;
                            d0Var3 = d0Var;
                        }
                    } else {
                        if (i39 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                rVarH.v(objE2);
                            }
                            h5Var3 = (h5) objE2;
                            i17 &= -897;
                        } else {
                            h5Var3 = h5Var;
                        }
                        if ((i16 & 8) != 0) {
                            w4VarI = a5.f55133a.i(rVarH, 6);
                            i17 &= -7169;
                        } else {
                            w4VarI = w4Var2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                            pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            i36 = 54;
                        } else {
                            z19 = true;
                            i36 = 54;
                        }
                        if (i25 != 0) {
                            pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, i36);
                        } else {
                            pVarD2 = pVar3;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            int i4111 = i17;
                            d0Var3 = (d0) objE;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            i37 = i4111;
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            mVar4 = mVar2;
                        } else {
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            mVar4 = mVar2;
                            i37 = i17;
                            d0Var3 = d0Var;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1969726368, i37, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                    }
                    zW = rVarH.W(jaVar.g());
                    objE3 = rVarH.E();
                    if (zW) {
                        if (jaVar instanceof h0) {
                            l0VarA = ((h0) jaVar).getCalendarModel();
                        } else {
                            l0VarA = o0.a(jaVar.g());
                        }
                        objE3 = l0VarA;
                        rVarH.v(objE3);
                    } else {
                        if (jaVar instanceof h0) {
                            l0VarA = ((h0) jaVar).getCalendarModel();
                        } else {
                            l0VarA = o0.a(jaVar.g());
                        }
                        objE3 = l0VarA;
                        rVarH.v(objE3);
                    }
                    final l0 l0Var6 = (l0) objE3;
                    if (z25) {
                        rVarH.X(-2018450762);
                        fVarD = y2.m.d(1343236786, true, new p() { // from class: f2.ba
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.D(jaVar, w4Var4, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        rVarH.R();
                    } else {
                        rVarH.X(-2018063138);
                        rVarH.R();
                        fVarD = null;
                    }
                    f fVar6 = fVarD;
                    q qVar6 = q.f115154a;
                    TextStyle textStyleE6 = ds.e(qVar6.w(), rVarH, 6);
                    float fN6 = h.n(qVar6.v() - f56273d);
                    final d0 d0Var9 = d0Var3;
                    final w4 w4Var10 = w4Var4;
                    p pVar12 = new p() { // from class: f2.ca
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ia.F(jaVar, l0Var6, h5Var3, w4Var10, d0Var9, (r) obj, ((Integer) obj2).intValue());
                        }
                    };
                    h5 h5Var9 = h5Var3;
                    int i4112 = i37 >> 9;
                    rVar2 = rVarH;
                    i8.z0(mVar4, pVar6, pVar3, fVar6, w4Var4, textStyleE6, fN6, y2.m.d(684885105, true, pVar12, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i4112 & 112) | (i4112 & 896) | ((i37 << 3) & 57344));
                    if (t.k()) {
                        t.n();
                    }
                    h5Var2 = h5Var9;
                    d0Var2 = d0Var9;
                    z18 = z25;
                    mVar3 = mVar4;
                    pVar4 = pVar6;
                    w4Var3 = w4Var4;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    h5Var2 = h5Var;
                    d0Var2 = d0Var;
                    mVar3 = mVar2;
                    w4Var3 = w4Var2;
                    pVar4 = pVarD;
                    z18 = z16;
                }
                pVar5 = pVar3;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.da
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ia.I(jaVar, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            pVar3 = pVar2;
            i27 = i16 & 64;
            if (i27 != 0) {
                if ((1572864 & i15) == 0) {
                    z16 = z15;
                    if (rVarH.a(z16)) {
                        i28 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i28 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i28;
                }
                i29 = i16 & 128;
                if (i29 != 0) {
                    i17 |= 12582912;
                } else if ((i15 & 12582912) == 0) {
                    if (rVarH.W(d0Var)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i17 |= i35;
                }
                if ((i17 & 4793491) != 4793490) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i39 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                rVarH.v(objE2);
                            }
                            h5Var3 = (h5) objE2;
                            i17 &= -897;
                        } else {
                            h5Var3 = h5Var;
                        }
                        if ((i16 & 8) != 0) {
                            w4VarI = a5.f55133a.i(rVarH, 6);
                            i17 &= -7169;
                        } else {
                            w4VarI = w4Var2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                            pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            i36 = 54;
                        } else {
                            z19 = true;
                            i36 = 54;
                        }
                        if (i25 != 0) {
                            pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, i36);
                        } else {
                            pVarD2 = pVar3;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            int i4113 = i17;
                            d0Var3 = (d0) objE;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            i37 = i4113;
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            mVar4 = mVar2;
                        } else {
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            mVar4 = mVar2;
                            i37 = i17;
                            d0Var3 = d0Var;
                        }
                    } else {
                        if (i39 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                rVarH.v(objE2);
                            }
                            h5Var3 = (h5) objE2;
                            i17 &= -897;
                        } else {
                            h5Var3 = h5Var;
                        }
                        if ((i16 & 8) != 0) {
                            w4VarI = a5.f55133a.i(rVarH, 6);
                            i17 &= -7169;
                        } else {
                            w4VarI = w4Var2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                            pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            i36 = 54;
                        } else {
                            z19 = true;
                            i36 = 54;
                        }
                        if (i25 != 0) {
                            pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, i36);
                        } else {
                            pVarD2 = pVar3;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            int i4114 = i17;
                            d0Var3 = (d0) objE;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            i37 = i4114;
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            mVar4 = mVar2;
                        } else {
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            mVar4 = mVar2;
                            i37 = i17;
                            d0Var3 = d0Var;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1969726368, i37, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                    }
                    zW = rVarH.W(jaVar.g());
                    objE3 = rVarH.E();
                    if (zW) {
                        if (jaVar instanceof h0) {
                            l0VarA = ((h0) jaVar).getCalendarModel();
                        } else {
                            l0VarA = o0.a(jaVar.g());
                        }
                        objE3 = l0VarA;
                        rVarH.v(objE3);
                    } else {
                        if (jaVar instanceof h0) {
                            l0VarA = ((h0) jaVar).getCalendarModel();
                        } else {
                            l0VarA = o0.a(jaVar.g());
                        }
                        objE3 = l0VarA;
                        rVarH.v(objE3);
                    }
                    final l0 l0Var7 = (l0) objE3;
                    if (z25) {
                        rVarH.X(-2018450762);
                        fVarD = y2.m.d(1343236786, true, new p() { // from class: f2.ba
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.D(jaVar, w4Var4, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        rVarH.R();
                    } else {
                        rVarH.X(-2018063138);
                        rVarH.R();
                        fVarD = null;
                    }
                    f fVar7 = fVarD;
                    q qVar7 = q.f115154a;
                    TextStyle textStyleE7 = ds.e(qVar7.w(), rVarH, 6);
                    float fN7 = h.n(qVar7.v() - f56273d);
                    final d0 d0Var10 = d0Var3;
                    final w4 w4Var11 = w4Var4;
                    p pVar13 = new p() { // from class: f2.ca
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ia.F(jaVar, l0Var7, h5Var3, w4Var11, d0Var10, (r) obj, ((Integer) obj2).intValue());
                        }
                    };
                    h5 h5Var10 = h5Var3;
                    int i4115 = i37 >> 9;
                    rVar2 = rVarH;
                    i8.z0(mVar4, pVar6, pVar3, fVar7, w4Var4, textStyleE7, fN7, y2.m.d(684885105, true, pVar13, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i4115 & 112) | (i4115 & 896) | ((i37 << 3) & 57344));
                    if (t.k()) {
                        t.n();
                    }
                    h5Var2 = h5Var10;
                    d0Var2 = d0Var10;
                    z18 = z25;
                    mVar3 = mVar4;
                    pVar4 = pVar6;
                    w4Var3 = w4Var4;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    h5Var2 = h5Var;
                    d0Var2 = d0Var;
                    mVar3 = mVar2;
                    w4Var3 = w4Var2;
                    pVar4 = pVarD;
                    z18 = z16;
                }
                pVar5 = pVar3;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.da
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ia.I(jaVar, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 1572864;
            z16 = z15;
            i29 = i16 & 128;
            if (i29 != 0) {
                i17 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (rVarH.W(d0Var)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i17 |= i35;
            }
            if ((i17 & 4793491) != 4793490) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i39 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i16 & 4) != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                            rVarH.v(objE2);
                        }
                        h5Var3 = (h5) objE2;
                        i17 &= -897;
                    } else {
                        h5Var3 = h5Var;
                    }
                    if ((i16 & 8) != 0) {
                        w4VarI = a5.f55133a.i(rVarH, 6);
                        i17 &= -7169;
                    } else {
                        w4VarI = w4Var2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                        pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        i36 = 54;
                    } else {
                        z19 = true;
                        i36 = 54;
                    }
                    if (i25 != 0) {
                        pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, i36);
                    } else {
                        pVarD2 = pVar3;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if (i29 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        int i4116 = i17;
                        d0Var3 = (d0) objE;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        i37 = i4116;
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        mVar4 = mVar2;
                    } else {
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        mVar4 = mVar2;
                        i37 = i17;
                        d0Var3 = d0Var;
                    }
                } else {
                    if (i39 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i16 & 4) != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                            rVarH.v(objE2);
                        }
                        h5Var3 = (h5) objE2;
                        i17 &= -897;
                    } else {
                        h5Var3 = h5Var;
                    }
                    if ((i16 & 8) != 0) {
                        w4VarI = a5.f55133a.i(rVarH, 6);
                        i17 &= -7169;
                    } else {
                        w4VarI = w4Var2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                        pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        i36 = 54;
                    } else {
                        z19 = true;
                        i36 = 54;
                    }
                    if (i25 != 0) {
                        pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, i36);
                    } else {
                        pVarD2 = pVar3;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if (i29 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        int i4117 = i17;
                        d0Var3 = (d0) objE;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        i37 = i4117;
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        mVar4 = mVar2;
                    } else {
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        mVar4 = mVar2;
                        i37 = i17;
                        d0Var3 = d0Var;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(1969726368, i37, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                }
                zW = rVarH.W(jaVar.g());
                objE3 = rVarH.E();
                if (zW) {
                    if (jaVar instanceof h0) {
                        l0VarA = ((h0) jaVar).getCalendarModel();
                    } else {
                        l0VarA = o0.a(jaVar.g());
                    }
                    objE3 = l0VarA;
                    rVarH.v(objE3);
                } else {
                    if (jaVar instanceof h0) {
                        l0VarA = ((h0) jaVar).getCalendarModel();
                    } else {
                        l0VarA = o0.a(jaVar.g());
                    }
                    objE3 = l0VarA;
                    rVarH.v(objE3);
                }
                final l0 l0Var8 = (l0) objE3;
                if (z25) {
                    rVarH.X(-2018450762);
                    fVarD = y2.m.d(1343236786, true, new p() { // from class: f2.ba
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ia.D(jaVar, w4Var4, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54);
                    rVarH.R();
                } else {
                    rVarH.X(-2018063138);
                    rVarH.R();
                    fVarD = null;
                }
                f fVar8 = fVarD;
                q qVar8 = q.f115154a;
                TextStyle textStyleE8 = ds.e(qVar8.w(), rVarH, 6);
                float fN8 = h.n(qVar8.v() - f56273d);
                final d0 d0Var11 = d0Var3;
                final w4 w4Var12 = w4Var4;
                p pVar14 = new p() { // from class: f2.ca
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return ia.F(jaVar, l0Var8, h5Var3, w4Var12, d0Var11, (r) obj, ((Integer) obj2).intValue());
                    }
                };
                h5 h5Var11 = h5Var3;
                int i4118 = i37 >> 9;
                rVar2 = rVarH;
                i8.z0(mVar4, pVar6, pVar3, fVar8, w4Var4, textStyleE8, fN8, y2.m.d(684885105, true, pVar14, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i4118 & 112) | (i4118 & 896) | ((i37 << 3) & 57344));
                if (t.k()) {
                    t.n();
                }
                h5Var2 = h5Var11;
                d0Var2 = d0Var11;
                z18 = z25;
                mVar3 = mVar4;
                pVar4 = pVar6;
                w4Var3 = w4Var4;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                h5Var2 = h5Var;
                d0Var2 = d0Var;
                mVar3 = mVar2;
                w4Var3 = w4Var2;
                pVar4 = pVarD;
                z18 = z16;
            }
            pVar5 = pVar3;
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.da
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return ia.I(jaVar, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        mVar2 = mVar;
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i16 & 4) != 0) {
                i38 = 128;
            } else {
                if ((i15 & 512) == 0) {
                    zG = rVarH.W(h5Var);
                } else {
                    zG = rVarH.G(h5Var);
                }
                if (zG) {
                    i38 = 256;
                } else {
                    i38 = 128;
                }
            }
            i17 |= i38;
        }
        if ((i15 & 3072) == 0) {
            if ((i16 & 8) == 0) {
                w4Var2 = w4Var;
                if (rVarH.W(w4Var2)) {
                }
                i17 |= i45;
            } else {
                w4Var2 = w4Var;
            }
            i17 |= i45;
        } else {
            w4Var2 = w4Var;
        }
        i18 = i16 & 16;
        if (i18 != 0) {
            if ((i15 & 24576) == 0) {
                pVarD = pVar;
                if (rVarH.G(pVarD)) {
                    i19 = 16384;
                } else {
                    i19 = PKIFailureInfo.certRevoked;
                }
                i17 |= i19;
            }
            i25 = i16 & 32;
            if (i25 != 0) {
                if ((196608 & i15) == 0) {
                    pVar3 = pVar2;
                    if (rVarH.G(pVar3)) {
                        i26 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i26 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 64;
                if (i27 != 0) {
                    if ((1572864 & i15) == 0) {
                        z16 = z15;
                        if (rVarH.a(z16)) {
                            i28 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i28 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i28;
                    }
                    i29 = i16 & 128;
                    if (i29 != 0) {
                        i17 |= 12582912;
                    } else if ((i15 & 12582912) == 0) {
                        if (rVarH.W(d0Var)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i17 |= i35;
                    }
                    if ((i17 & 4793491) != 4793490) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0) {
                            if (i39 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if ((i16 & 4) != 0) {
                                objE2 = rVarH.E();
                                if (objE2 == r.INSTANCE.a()) {
                                    objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                    rVarH.v(objE2);
                                }
                                h5Var3 = (h5) objE2;
                                i17 &= -897;
                            } else {
                                h5Var3 = h5Var;
                            }
                            if ((i16 & 8) != 0) {
                                w4VarI = a5.f55133a.i(rVarH, 6);
                                i17 &= -7169;
                            } else {
                                w4VarI = w4Var2;
                            }
                            if (i18 != 0) {
                                z19 = true;
                                pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54);
                                i36 = 54;
                            } else {
                                z19 = true;
                                i36 = 54;
                            }
                            if (i25 != 0) {
                                pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, i36);
                            } else {
                                pVarD2 = pVar3;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                int i4119 = i17;
                                d0Var3 = (d0) objE;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                i37 = i4119;
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                mVar4 = mVar2;
                            } else {
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                mVar4 = mVar2;
                                i37 = i17;
                                d0Var3 = d0Var;
                            }
                        } else {
                            if (i39 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if ((i16 & 4) != 0) {
                                objE2 = rVarH.E();
                                if (objE2 == r.INSTANCE.a()) {
                                    objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                    rVarH.v(objE2);
                                }
                                h5Var3 = (h5) objE2;
                                i17 &= -897;
                            } else {
                                h5Var3 = h5Var;
                            }
                            if ((i16 & 8) != 0) {
                                w4VarI = a5.f55133a.i(rVarH, 6);
                                i17 &= -7169;
                            } else {
                                w4VarI = w4Var2;
                            }
                            if (i18 != 0) {
                                z19 = true;
                                pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54);
                                i36 = 54;
                            } else {
                                z19 = true;
                                i36 = 54;
                            }
                            if (i25 != 0) {
                                pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, i36);
                            } else {
                                pVarD2 = pVar3;
                            }
                            if (i27 != 0) {
                                z16 = true;
                            }
                            if (i29 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                int i41110 = i17;
                                d0Var3 = (d0) objE;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                i37 = i41110;
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                mVar4 = mVar2;
                            } else {
                                pVar3 = pVarD2;
                                pVar6 = pVarD;
                                z25 = z16;
                                w4Var4 = w4VarI;
                                mVar4 = mVar2;
                                i37 = i17;
                                d0Var3 = d0Var;
                            }
                        }
                        rVarH.y();
                        if (t.k()) {
                            t.o(1969726368, i37, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                        }
                        zW = rVarH.W(jaVar.g());
                        objE3 = rVarH.E();
                        if (zW) {
                            if (jaVar instanceof h0) {
                                l0VarA = ((h0) jaVar).getCalendarModel();
                            } else {
                                l0VarA = o0.a(jaVar.g());
                            }
                            objE3 = l0VarA;
                            rVarH.v(objE3);
                        } else {
                            if (jaVar instanceof h0) {
                                l0VarA = ((h0) jaVar).getCalendarModel();
                            } else {
                                l0VarA = o0.a(jaVar.g());
                            }
                            objE3 = l0VarA;
                            rVarH.v(objE3);
                        }
                        final l0 l0Var9 = (l0) objE3;
                        if (z25) {
                            rVarH.X(-2018450762);
                            fVarD = y2.m.d(1343236786, true, new p() { // from class: f2.ba
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.D(jaVar, w4Var4, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            rVarH.R();
                        } else {
                            rVarH.X(-2018063138);
                            rVarH.R();
                            fVarD = null;
                        }
                        f fVar9 = fVarD;
                        q qVar9 = q.f115154a;
                        TextStyle textStyleE9 = ds.e(qVar9.w(), rVarH, 6);
                        float fN9 = h.n(qVar9.v() - f56273d);
                        final d0 d0Var12 = d0Var3;
                        final w4 w4Var13 = w4Var4;
                        p pVar15 = new p() { // from class: f2.ca
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.F(jaVar, l0Var9, h5Var3, w4Var13, d0Var12, (r) obj, ((Integer) obj2).intValue());
                            }
                        };
                        h5 h5Var12 = h5Var3;
                        int i41111 = i37 >> 9;
                        rVar2 = rVarH;
                        i8.z0(mVar4, pVar6, pVar3, fVar9, w4Var4, textStyleE9, fN9, y2.m.d(684885105, true, pVar15, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i41111 & 112) | (i41111 & 896) | ((i37 << 3) & 57344));
                        if (t.k()) {
                            t.n();
                        }
                        h5Var2 = h5Var12;
                        d0Var2 = d0Var12;
                        z18 = z25;
                        mVar3 = mVar4;
                        pVar4 = pVar6;
                        w4Var3 = w4Var4;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        h5Var2 = h5Var;
                        d0Var2 = d0Var;
                        mVar3 = mVar2;
                        w4Var3 = w4Var2;
                        pVar4 = pVarD;
                        z18 = z16;
                    }
                    pVar5 = pVar3;
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: f2.da
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.I(jaVar, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 1572864;
                z16 = z15;
                i29 = i16 & 128;
                if (i29 != 0) {
                    i17 |= 12582912;
                } else if ((i15 & 12582912) == 0) {
                    if (rVarH.W(d0Var)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i17 |= i35;
                }
                if ((i17 & 4793491) != 4793490) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i39 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                rVarH.v(objE2);
                            }
                            h5Var3 = (h5) objE2;
                            i17 &= -897;
                        } else {
                            h5Var3 = h5Var;
                        }
                        if ((i16 & 8) != 0) {
                            w4VarI = a5.f55133a.i(rVarH, 6);
                            i17 &= -7169;
                        } else {
                            w4VarI = w4Var2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                            pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            i36 = 54;
                        } else {
                            z19 = true;
                            i36 = 54;
                        }
                        if (i25 != 0) {
                            pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, i36);
                        } else {
                            pVarD2 = pVar3;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            int i41112 = i17;
                            d0Var3 = (d0) objE;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            i37 = i41112;
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            mVar4 = mVar2;
                        } else {
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            mVar4 = mVar2;
                            i37 = i17;
                            d0Var3 = d0Var;
                        }
                    } else {
                        if (i39 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                rVarH.v(objE2);
                            }
                            h5Var3 = (h5) objE2;
                            i17 &= -897;
                        } else {
                            h5Var3 = h5Var;
                        }
                        if ((i16 & 8) != 0) {
                            w4VarI = a5.f55133a.i(rVarH, 6);
                            i17 &= -7169;
                        } else {
                            w4VarI = w4Var2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                            pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            i36 = 54;
                        } else {
                            z19 = true;
                            i36 = 54;
                        }
                        if (i25 != 0) {
                            pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, i36);
                        } else {
                            pVarD2 = pVar3;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            int i41113 = i17;
                            d0Var3 = (d0) objE;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            i37 = i41113;
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            mVar4 = mVar2;
                        } else {
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            mVar4 = mVar2;
                            i37 = i17;
                            d0Var3 = d0Var;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1969726368, i37, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                    }
                    zW = rVarH.W(jaVar.g());
                    objE3 = rVarH.E();
                    if (zW) {
                        if (jaVar instanceof h0) {
                            l0VarA = ((h0) jaVar).getCalendarModel();
                        } else {
                            l0VarA = o0.a(jaVar.g());
                        }
                        objE3 = l0VarA;
                        rVarH.v(objE3);
                    } else {
                        if (jaVar instanceof h0) {
                            l0VarA = ((h0) jaVar).getCalendarModel();
                        } else {
                            l0VarA = o0.a(jaVar.g());
                        }
                        objE3 = l0VarA;
                        rVarH.v(objE3);
                    }
                    final l0 l0Var10 = (l0) objE3;
                    if (z25) {
                        rVarH.X(-2018450762);
                        fVarD = y2.m.d(1343236786, true, new p() { // from class: f2.ba
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.D(jaVar, w4Var4, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        rVarH.R();
                    } else {
                        rVarH.X(-2018063138);
                        rVarH.R();
                        fVarD = null;
                    }
                    f fVar10 = fVarD;
                    q qVar10 = q.f115154a;
                    TextStyle textStyleE10 = ds.e(qVar10.w(), rVarH, 6);
                    float fN10 = h.n(qVar10.v() - f56273d);
                    final d0 d0Var13 = d0Var3;
                    final w4 w4Var14 = w4Var4;
                    p pVar16 = new p() { // from class: f2.ca
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ia.F(jaVar, l0Var10, h5Var3, w4Var14, d0Var13, (r) obj, ((Integer) obj2).intValue());
                        }
                    };
                    h5 h5Var13 = h5Var3;
                    int i41114 = i37 >> 9;
                    rVar2 = rVarH;
                    i8.z0(mVar4, pVar6, pVar3, fVar10, w4Var4, textStyleE10, fN10, y2.m.d(684885105, true, pVar16, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i41114 & 112) | (i41114 & 896) | ((i37 << 3) & 57344));
                    if (t.k()) {
                        t.n();
                    }
                    h5Var2 = h5Var13;
                    d0Var2 = d0Var13;
                    z18 = z25;
                    mVar3 = mVar4;
                    pVar4 = pVar6;
                    w4Var3 = w4Var4;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    h5Var2 = h5Var;
                    d0Var2 = d0Var;
                    mVar3 = mVar2;
                    w4Var3 = w4Var2;
                    pVar4 = pVarD;
                    z18 = z16;
                }
                pVar5 = pVar3;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.da
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ia.I(jaVar, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            pVar3 = pVar2;
            i27 = i16 & 64;
            if (i27 != 0) {
                if ((1572864 & i15) == 0) {
                    z16 = z15;
                    if (rVarH.a(z16)) {
                        i28 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i28 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i28;
                }
                i29 = i16 & 128;
                if (i29 != 0) {
                    i17 |= 12582912;
                } else if ((i15 & 12582912) == 0) {
                    if (rVarH.W(d0Var)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i17 |= i35;
                }
                if ((i17 & 4793491) != 4793490) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i39 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                rVarH.v(objE2);
                            }
                            h5Var3 = (h5) objE2;
                            i17 &= -897;
                        } else {
                            h5Var3 = h5Var;
                        }
                        if ((i16 & 8) != 0) {
                            w4VarI = a5.f55133a.i(rVarH, 6);
                            i17 &= -7169;
                        } else {
                            w4VarI = w4Var2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                            pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            i36 = 54;
                        } else {
                            z19 = true;
                            i36 = 54;
                        }
                        if (i25 != 0) {
                            pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, i36);
                        } else {
                            pVarD2 = pVar3;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            int i41115 = i17;
                            d0Var3 = (d0) objE;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            i37 = i41115;
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            mVar4 = mVar2;
                        } else {
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            mVar4 = mVar2;
                            i37 = i17;
                            d0Var3 = d0Var;
                        }
                    } else {
                        if (i39 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                rVarH.v(objE2);
                            }
                            h5Var3 = (h5) objE2;
                            i17 &= -897;
                        } else {
                            h5Var3 = h5Var;
                        }
                        if ((i16 & 8) != 0) {
                            w4VarI = a5.f55133a.i(rVarH, 6);
                            i17 &= -7169;
                        } else {
                            w4VarI = w4Var2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                            pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            i36 = 54;
                        } else {
                            z19 = true;
                            i36 = 54;
                        }
                        if (i25 != 0) {
                            pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, i36);
                        } else {
                            pVarD2 = pVar3;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            int i41116 = i17;
                            d0Var3 = (d0) objE;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            i37 = i41116;
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            mVar4 = mVar2;
                        } else {
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            mVar4 = mVar2;
                            i37 = i17;
                            d0Var3 = d0Var;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1969726368, i37, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                    }
                    zW = rVarH.W(jaVar.g());
                    objE3 = rVarH.E();
                    if (zW) {
                        if (jaVar instanceof h0) {
                            l0VarA = ((h0) jaVar).getCalendarModel();
                        } else {
                            l0VarA = o0.a(jaVar.g());
                        }
                        objE3 = l0VarA;
                        rVarH.v(objE3);
                    } else {
                        if (jaVar instanceof h0) {
                            l0VarA = ((h0) jaVar).getCalendarModel();
                        } else {
                            l0VarA = o0.a(jaVar.g());
                        }
                        objE3 = l0VarA;
                        rVarH.v(objE3);
                    }
                    final l0 l0Var11 = (l0) objE3;
                    if (z25) {
                        rVarH.X(-2018450762);
                        fVarD = y2.m.d(1343236786, true, new p() { // from class: f2.ba
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.D(jaVar, w4Var4, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        rVarH.R();
                    } else {
                        rVarH.X(-2018063138);
                        rVarH.R();
                        fVarD = null;
                    }
                    f fVar11 = fVarD;
                    q qVar11 = q.f115154a;
                    TextStyle textStyleE11 = ds.e(qVar11.w(), rVarH, 6);
                    float fN11 = h.n(qVar11.v() - f56273d);
                    final d0 d0Var14 = d0Var3;
                    final w4 w4Var15 = w4Var4;
                    p pVar17 = new p() { // from class: f2.ca
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ia.F(jaVar, l0Var11, h5Var3, w4Var15, d0Var14, (r) obj, ((Integer) obj2).intValue());
                        }
                    };
                    h5 h5Var14 = h5Var3;
                    int i41117 = i37 >> 9;
                    rVar2 = rVarH;
                    i8.z0(mVar4, pVar6, pVar3, fVar11, w4Var4, textStyleE11, fN11, y2.m.d(684885105, true, pVar17, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i41117 & 112) | (i41117 & 896) | ((i37 << 3) & 57344));
                    if (t.k()) {
                        t.n();
                    }
                    h5Var2 = h5Var14;
                    d0Var2 = d0Var14;
                    z18 = z25;
                    mVar3 = mVar4;
                    pVar4 = pVar6;
                    w4Var3 = w4Var4;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    h5Var2 = h5Var;
                    d0Var2 = d0Var;
                    mVar3 = mVar2;
                    w4Var3 = w4Var2;
                    pVar4 = pVarD;
                    z18 = z16;
                }
                pVar5 = pVar3;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.da
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ia.I(jaVar, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 1572864;
            z16 = z15;
            i29 = i16 & 128;
            if (i29 != 0) {
                i17 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (rVarH.W(d0Var)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i17 |= i35;
            }
            if ((i17 & 4793491) != 4793490) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i39 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i16 & 4) != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                            rVarH.v(objE2);
                        }
                        h5Var3 = (h5) objE2;
                        i17 &= -897;
                    } else {
                        h5Var3 = h5Var;
                    }
                    if ((i16 & 8) != 0) {
                        w4VarI = a5.f55133a.i(rVarH, 6);
                        i17 &= -7169;
                    } else {
                        w4VarI = w4Var2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                        pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        i36 = 54;
                    } else {
                        z19 = true;
                        i36 = 54;
                    }
                    if (i25 != 0) {
                        pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, i36);
                    } else {
                        pVarD2 = pVar3;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if (i29 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        int i41118 = i17;
                        d0Var3 = (d0) objE;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        i37 = i41118;
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        mVar4 = mVar2;
                    } else {
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        mVar4 = mVar2;
                        i37 = i17;
                        d0Var3 = d0Var;
                    }
                } else {
                    if (i39 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i16 & 4) != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                            rVarH.v(objE2);
                        }
                        h5Var3 = (h5) objE2;
                        i17 &= -897;
                    } else {
                        h5Var3 = h5Var;
                    }
                    if ((i16 & 8) != 0) {
                        w4VarI = a5.f55133a.i(rVarH, 6);
                        i17 &= -7169;
                    } else {
                        w4VarI = w4Var2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                        pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        i36 = 54;
                    } else {
                        z19 = true;
                        i36 = 54;
                    }
                    if (i25 != 0) {
                        pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, i36);
                    } else {
                        pVarD2 = pVar3;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if (i29 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        int i41119 = i17;
                        d0Var3 = (d0) objE;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        i37 = i41119;
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        mVar4 = mVar2;
                    } else {
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        mVar4 = mVar2;
                        i37 = i17;
                        d0Var3 = d0Var;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(1969726368, i37, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                }
                zW = rVarH.W(jaVar.g());
                objE3 = rVarH.E();
                if (zW) {
                    if (jaVar instanceof h0) {
                        l0VarA = ((h0) jaVar).getCalendarModel();
                    } else {
                        l0VarA = o0.a(jaVar.g());
                    }
                    objE3 = l0VarA;
                    rVarH.v(objE3);
                } else {
                    if (jaVar instanceof h0) {
                        l0VarA = ((h0) jaVar).getCalendarModel();
                    } else {
                        l0VarA = o0.a(jaVar.g());
                    }
                    objE3 = l0VarA;
                    rVarH.v(objE3);
                }
                final l0 l0Var12 = (l0) objE3;
                if (z25) {
                    rVarH.X(-2018450762);
                    fVarD = y2.m.d(1343236786, true, new p() { // from class: f2.ba
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ia.D(jaVar, w4Var4, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54);
                    rVarH.R();
                } else {
                    rVarH.X(-2018063138);
                    rVarH.R();
                    fVarD = null;
                }
                f fVar12 = fVarD;
                q qVar12 = q.f115154a;
                TextStyle textStyleE12 = ds.e(qVar12.w(), rVarH, 6);
                float fN12 = h.n(qVar12.v() - f56273d);
                final d0 d0Var15 = d0Var3;
                final w4 w4Var16 = w4Var4;
                p pVar18 = new p() { // from class: f2.ca
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return ia.F(jaVar, l0Var12, h5Var3, w4Var16, d0Var15, (r) obj, ((Integer) obj2).intValue());
                    }
                };
                h5 h5Var15 = h5Var3;
                int i411110 = i37 >> 9;
                rVar2 = rVarH;
                i8.z0(mVar4, pVar6, pVar3, fVar12, w4Var4, textStyleE12, fN12, y2.m.d(684885105, true, pVar18, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i411110 & 112) | (i411110 & 896) | ((i37 << 3) & 57344));
                if (t.k()) {
                    t.n();
                }
                h5Var2 = h5Var15;
                d0Var2 = d0Var15;
                z18 = z25;
                mVar3 = mVar4;
                pVar4 = pVar6;
                w4Var3 = w4Var4;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                h5Var2 = h5Var;
                d0Var2 = d0Var;
                mVar3 = mVar2;
                w4Var3 = w4Var2;
                pVar4 = pVarD;
                z18 = z16;
            }
            pVar5 = pVar3;
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.da
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return ia.I(jaVar, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        pVarD = pVar;
        i25 = i16 & 32;
        if (i25 != 0) {
            if ((196608 & i15) == 0) {
                pVar3 = pVar2;
                if (rVarH.G(pVar3)) {
                    i26 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i26 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i26;
            }
            i27 = i16 & 64;
            if (i27 != 0) {
                if ((1572864 & i15) == 0) {
                    z16 = z15;
                    if (rVarH.a(z16)) {
                        i28 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i28 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i28;
                }
                i29 = i16 & 128;
                if (i29 != 0) {
                    i17 |= 12582912;
                } else if ((i15 & 12582912) == 0) {
                    if (rVarH.W(d0Var)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i17 |= i35;
                }
                if ((i17 & 4793491) != 4793490) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if (i39 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                rVarH.v(objE2);
                            }
                            h5Var3 = (h5) objE2;
                            i17 &= -897;
                        } else {
                            h5Var3 = h5Var;
                        }
                        if ((i16 & 8) != 0) {
                            w4VarI = a5.f55133a.i(rVarH, 6);
                            i17 &= -7169;
                        } else {
                            w4VarI = w4Var2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                            pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            i36 = 54;
                        } else {
                            z19 = true;
                            i36 = 54;
                        }
                        if (i25 != 0) {
                            pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, i36);
                        } else {
                            pVarD2 = pVar3;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            int i411111 = i17;
                            d0Var3 = (d0) objE;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            i37 = i411111;
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            mVar4 = mVar2;
                        } else {
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            mVar4 = mVar2;
                            i37 = i17;
                            d0Var3 = d0Var;
                        }
                    } else {
                        if (i39 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i16 & 4) != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == r.INSTANCE.a()) {
                                objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                                rVarH.v(objE2);
                            }
                            h5Var3 = (h5) objE2;
                            i17 &= -897;
                        } else {
                            h5Var3 = h5Var;
                        }
                        if ((i16 & 8) != 0) {
                            w4VarI = a5.f55133a.i(rVarH, 6);
                            i17 &= -7169;
                        } else {
                            w4VarI = w4Var2;
                        }
                        if (i18 != 0) {
                            z19 = true;
                            pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54);
                            i36 = 54;
                        } else {
                            z19 = true;
                            i36 = 54;
                        }
                        if (i25 != 0) {
                            pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, i36);
                        } else {
                            pVarD2 = pVar3;
                        }
                        if (i27 != 0) {
                            z16 = true;
                        }
                        if (i29 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            int i411112 = i17;
                            d0Var3 = (d0) objE;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            i37 = i411112;
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            mVar4 = mVar2;
                        } else {
                            pVar3 = pVarD2;
                            pVar6 = pVarD;
                            z25 = z16;
                            w4Var4 = w4VarI;
                            mVar4 = mVar2;
                            i37 = i17;
                            d0Var3 = d0Var;
                        }
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(1969726368, i37, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                    }
                    zW = rVarH.W(jaVar.g());
                    objE3 = rVarH.E();
                    if (zW) {
                        if (jaVar instanceof h0) {
                            l0VarA = ((h0) jaVar).getCalendarModel();
                        } else {
                            l0VarA = o0.a(jaVar.g());
                        }
                        objE3 = l0VarA;
                        rVarH.v(objE3);
                    } else {
                        if (jaVar instanceof h0) {
                            l0VarA = ((h0) jaVar).getCalendarModel();
                        } else {
                            l0VarA = o0.a(jaVar.g());
                        }
                        objE3 = l0VarA;
                        rVarH.v(objE3);
                    }
                    final l0 l0Var13 = (l0) objE3;
                    if (z25) {
                        rVarH.X(-2018450762);
                        fVarD = y2.m.d(1343236786, true, new p() { // from class: f2.ba
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.D(jaVar, w4Var4, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        rVarH.R();
                    } else {
                        rVarH.X(-2018063138);
                        rVarH.R();
                        fVarD = null;
                    }
                    f fVar13 = fVarD;
                    q qVar13 = q.f115154a;
                    TextStyle textStyleE13 = ds.e(qVar13.w(), rVarH, 6);
                    float fN13 = h.n(qVar13.v() - f56273d);
                    final d0 d0Var16 = d0Var3;
                    final w4 w4Var17 = w4Var4;
                    p pVar19 = new p() { // from class: f2.ca
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ia.F(jaVar, l0Var13, h5Var3, w4Var17, d0Var16, (r) obj, ((Integer) obj2).intValue());
                        }
                    };
                    h5 h5Var16 = h5Var3;
                    int i411113 = i37 >> 9;
                    rVar2 = rVarH;
                    i8.z0(mVar4, pVar6, pVar3, fVar13, w4Var4, textStyleE13, fN13, y2.m.d(684885105, true, pVar19, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i411113 & 112) | (i411113 & 896) | ((i37 << 3) & 57344));
                    if (t.k()) {
                        t.n();
                    }
                    h5Var2 = h5Var16;
                    d0Var2 = d0Var16;
                    z18 = z25;
                    mVar3 = mVar4;
                    pVar4 = pVar6;
                    w4Var3 = w4Var4;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    h5Var2 = h5Var;
                    d0Var2 = d0Var;
                    mVar3 = mVar2;
                    w4Var3 = w4Var2;
                    pVar4 = pVarD;
                    z18 = z16;
                }
                pVar5 = pVar3;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: f2.da
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ia.I(jaVar, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 1572864;
            z16 = z15;
            i29 = i16 & 128;
            if (i29 != 0) {
                i17 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (rVarH.W(d0Var)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i17 |= i35;
            }
            if ((i17 & 4793491) != 4793490) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i39 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i16 & 4) != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                            rVarH.v(objE2);
                        }
                        h5Var3 = (h5) objE2;
                        i17 &= -897;
                    } else {
                        h5Var3 = h5Var;
                    }
                    if ((i16 & 8) != 0) {
                        w4VarI = a5.f55133a.i(rVarH, 6);
                        i17 &= -7169;
                    } else {
                        w4VarI = w4Var2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                        pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        i36 = 54;
                    } else {
                        z19 = true;
                        i36 = 54;
                    }
                    if (i25 != 0) {
                        pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, i36);
                    } else {
                        pVarD2 = pVar3;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if (i29 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        int i411114 = i17;
                        d0Var3 = (d0) objE;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        i37 = i411114;
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        mVar4 = mVar2;
                    } else {
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        mVar4 = mVar2;
                        i37 = i17;
                        d0Var3 = d0Var;
                    }
                } else {
                    if (i39 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i16 & 4) != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                            rVarH.v(objE2);
                        }
                        h5Var3 = (h5) objE2;
                        i17 &= -897;
                    } else {
                        h5Var3 = h5Var;
                    }
                    if ((i16 & 8) != 0) {
                        w4VarI = a5.f55133a.i(rVarH, 6);
                        i17 &= -7169;
                    } else {
                        w4VarI = w4Var2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                        pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        i36 = 54;
                    } else {
                        z19 = true;
                        i36 = 54;
                    }
                    if (i25 != 0) {
                        pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, i36);
                    } else {
                        pVarD2 = pVar3;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if (i29 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        int i411115 = i17;
                        d0Var3 = (d0) objE;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        i37 = i411115;
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        mVar4 = mVar2;
                    } else {
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        mVar4 = mVar2;
                        i37 = i17;
                        d0Var3 = d0Var;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(1969726368, i37, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                }
                zW = rVarH.W(jaVar.g());
                objE3 = rVarH.E();
                if (zW) {
                    if (jaVar instanceof h0) {
                        l0VarA = ((h0) jaVar).getCalendarModel();
                    } else {
                        l0VarA = o0.a(jaVar.g());
                    }
                    objE3 = l0VarA;
                    rVarH.v(objE3);
                } else {
                    if (jaVar instanceof h0) {
                        l0VarA = ((h0) jaVar).getCalendarModel();
                    } else {
                        l0VarA = o0.a(jaVar.g());
                    }
                    objE3 = l0VarA;
                    rVarH.v(objE3);
                }
                final l0 l0Var14 = (l0) objE3;
                if (z25) {
                    rVarH.X(-2018450762);
                    fVarD = y2.m.d(1343236786, true, new p() { // from class: f2.ba
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ia.D(jaVar, w4Var4, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54);
                    rVarH.R();
                } else {
                    rVarH.X(-2018063138);
                    rVarH.R();
                    fVarD = null;
                }
                f fVar14 = fVarD;
                q qVar14 = q.f115154a;
                TextStyle textStyleE14 = ds.e(qVar14.w(), rVarH, 6);
                float fN14 = h.n(qVar14.v() - f56273d);
                final d0 d0Var17 = d0Var3;
                final w4 w4Var18 = w4Var4;
                p pVar110 = new p() { // from class: f2.ca
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return ia.F(jaVar, l0Var14, h5Var3, w4Var18, d0Var17, (r) obj, ((Integer) obj2).intValue());
                    }
                };
                h5 h5Var17 = h5Var3;
                int i411116 = i37 >> 9;
                rVar2 = rVarH;
                i8.z0(mVar4, pVar6, pVar3, fVar14, w4Var4, textStyleE14, fN14, y2.m.d(684885105, true, pVar110, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i411116 & 112) | (i411116 & 896) | ((i37 << 3) & 57344));
                if (t.k()) {
                    t.n();
                }
                h5Var2 = h5Var17;
                d0Var2 = d0Var17;
                z18 = z25;
                mVar3 = mVar4;
                pVar4 = pVar6;
                w4Var3 = w4Var4;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                h5Var2 = h5Var;
                d0Var2 = d0Var;
                mVar3 = mVar2;
                w4Var3 = w4Var2;
                pVar4 = pVarD;
                z18 = z16;
            }
            pVar5 = pVar3;
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.da
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return ia.I(jaVar, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 196608;
        pVar3 = pVar2;
        i27 = i16 & 64;
        if (i27 != 0) {
            if ((1572864 & i15) == 0) {
                z16 = z15;
                if (rVarH.a(z16)) {
                    i28 = PKIFailureInfo.badCertTemplate;
                } else {
                    i28 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i28;
            }
            i29 = i16 & 128;
            if (i29 != 0) {
                i17 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (rVarH.W(d0Var)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i17 |= i35;
            }
            if ((i17 & 4793491) != 4793490) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i39 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i16 & 4) != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                            rVarH.v(objE2);
                        }
                        h5Var3 = (h5) objE2;
                        i17 &= -897;
                    } else {
                        h5Var3 = h5Var;
                    }
                    if ((i16 & 8) != 0) {
                        w4VarI = a5.f55133a.i(rVarH, 6);
                        i17 &= -7169;
                    } else {
                        w4VarI = w4Var2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                        pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        i36 = 54;
                    } else {
                        z19 = true;
                        i36 = 54;
                    }
                    if (i25 != 0) {
                        pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, i36);
                    } else {
                        pVarD2 = pVar3;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if (i29 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        int i411117 = i17;
                        d0Var3 = (d0) objE;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        i37 = i411117;
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        mVar4 = mVar2;
                    } else {
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        mVar4 = mVar2;
                        i37 = i17;
                        d0Var3 = d0Var;
                    }
                } else {
                    if (i39 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i16 & 4) != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == r.INSTANCE.a()) {
                            objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                            rVarH.v(objE2);
                        }
                        h5Var3 = (h5) objE2;
                        i17 &= -897;
                    } else {
                        h5Var3 = h5Var;
                    }
                    if ((i16 & 8) != 0) {
                        w4VarI = a5.f55133a.i(rVarH, 6);
                        i17 &= -7169;
                    } else {
                        w4VarI = w4Var2;
                    }
                    if (i18 != 0) {
                        z19 = true;
                        pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        i36 = 54;
                    } else {
                        z19 = true;
                        i36 = 54;
                    }
                    if (i25 != 0) {
                        pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, i36);
                    } else {
                        pVarD2 = pVar3;
                    }
                    if (i27 != 0) {
                        z16 = true;
                    }
                    if (i29 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        int i411118 = i17;
                        d0Var3 = (d0) objE;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        i37 = i411118;
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        mVar4 = mVar2;
                    } else {
                        pVar3 = pVarD2;
                        pVar6 = pVarD;
                        z25 = z16;
                        w4Var4 = w4VarI;
                        mVar4 = mVar2;
                        i37 = i17;
                        d0Var3 = d0Var;
                    }
                }
                rVarH.y();
                if (t.k()) {
                    t.o(1969726368, i37, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                }
                zW = rVarH.W(jaVar.g());
                objE3 = rVarH.E();
                if (zW) {
                    if (jaVar instanceof h0) {
                        l0VarA = ((h0) jaVar).getCalendarModel();
                    } else {
                        l0VarA = o0.a(jaVar.g());
                    }
                    objE3 = l0VarA;
                    rVarH.v(objE3);
                } else {
                    if (jaVar instanceof h0) {
                        l0VarA = ((h0) jaVar).getCalendarModel();
                    } else {
                        l0VarA = o0.a(jaVar.g());
                    }
                    objE3 = l0VarA;
                    rVarH.v(objE3);
                }
                final l0 l0Var15 = (l0) objE3;
                if (z25) {
                    rVarH.X(-2018450762);
                    fVarD = y2.m.d(1343236786, true, new p() { // from class: f2.ba
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ia.D(jaVar, w4Var4, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54);
                    rVarH.R();
                } else {
                    rVarH.X(-2018063138);
                    rVarH.R();
                    fVarD = null;
                }
                f fVar15 = fVarD;
                q qVar15 = q.f115154a;
                TextStyle textStyleE15 = ds.e(qVar15.w(), rVarH, 6);
                float fN15 = h.n(qVar15.v() - f56273d);
                final d0 d0Var18 = d0Var3;
                final w4 w4Var19 = w4Var4;
                p pVar111 = new p() { // from class: f2.ca
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return ia.F(jaVar, l0Var15, h5Var3, w4Var19, d0Var18, (r) obj, ((Integer) obj2).intValue());
                    }
                };
                h5 h5Var18 = h5Var3;
                int i411119 = i37 >> 9;
                rVar2 = rVarH;
                i8.z0(mVar4, pVar6, pVar3, fVar15, w4Var4, textStyleE15, fN15, y2.m.d(684885105, true, pVar111, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i411119 & 112) | (i411119 & 896) | ((i37 << 3) & 57344));
                if (t.k()) {
                    t.n();
                }
                h5Var2 = h5Var18;
                d0Var2 = d0Var18;
                z18 = z25;
                mVar3 = mVar4;
                pVar4 = pVar6;
                w4Var3 = w4Var4;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                h5Var2 = h5Var;
                d0Var2 = d0Var;
                mVar3 = mVar2;
                w4Var3 = w4Var2;
                pVar4 = pVarD;
                z18 = z16;
            }
            pVar5 = pVar3;
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.da
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return ia.I(jaVar, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 1572864;
        z16 = z15;
        i29 = i16 & 128;
        if (i29 != 0) {
            i17 |= 12582912;
        } else if ((i15 & 12582912) == 0) {
            if (rVarH.W(d0Var)) {
                i35 = 8388608;
            } else {
                i35 = 4194304;
            }
            i17 |= i35;
        }
        if ((i17 & 4793491) != 4793490) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i39 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if ((i16 & 4) != 0) {
                    objE2 = rVarH.E();
                    if (objE2 == r.INSTANCE.a()) {
                        objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                        rVarH.v(objE2);
                    }
                    h5Var3 = (h5) objE2;
                    i17 &= -897;
                } else {
                    h5Var3 = h5Var;
                }
                if ((i16 & 8) != 0) {
                    w4VarI = a5.f55133a.i(rVarH, 6);
                    i17 &= -7169;
                } else {
                    w4VarI = w4Var2;
                }
                if (i18 != 0) {
                    z19 = true;
                    pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54);
                    i36 = 54;
                } else {
                    z19 = true;
                    i36 = 54;
                }
                if (i25 != 0) {
                    pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, i36);
                } else {
                    pVarD2 = pVar3;
                }
                if (i27 != 0) {
                    z16 = true;
                }
                if (i29 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new d0();
                        rVarH.v(objE);
                    }
                    int i4111110 = i17;
                    d0Var3 = (d0) objE;
                    z25 = z16;
                    w4Var4 = w4VarI;
                    i37 = i4111110;
                    pVar3 = pVarD2;
                    pVar6 = pVarD;
                    mVar4 = mVar2;
                } else {
                    pVar3 = pVarD2;
                    pVar6 = pVarD;
                    z25 = z16;
                    w4Var4 = w4VarI;
                    mVar4 = mVar2;
                    i37 = i17;
                    d0Var3 = d0Var;
                }
            } else {
                if (i39 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if ((i16 & 4) != 0) {
                    objE2 = rVarH.E();
                    if (objE2 == r.INSTANCE.a()) {
                        objE2 = a5.l(a5.f55133a, null, null, null, 7, null);
                        rVarH.v(objE2);
                    }
                    h5Var3 = (h5) objE2;
                    i17 &= -897;
                } else {
                    h5Var3 = h5Var;
                }
                if ((i16 & 8) != 0) {
                    w4VarI = a5.f55133a.i(rVarH, 6);
                    i17 &= -7169;
                } else {
                    w4VarI = w4Var2;
                }
                if (i18 != 0) {
                    z19 = true;
                    pVarD = y2.m.d(-803011924, true, new p() { // from class: f2.t9
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ia.B(jaVar, w4VarI, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54);
                    i36 = 54;
                } else {
                    z19 = true;
                    i36 = 54;
                }
                if (i25 != 0) {
                    pVarD2 = y2.m.d(-331385278, z19, new p() { // from class: f2.aa
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return ia.C(jaVar, h5Var3, w4VarI, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, i36);
                } else {
                    pVarD2 = pVar3;
                }
                if (i27 != 0) {
                    z16 = true;
                }
                if (i29 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new d0();
                        rVarH.v(objE);
                    }
                    int i4111111 = i17;
                    d0Var3 = (d0) objE;
                    z25 = z16;
                    w4Var4 = w4VarI;
                    i37 = i4111111;
                    pVar3 = pVarD2;
                    pVar6 = pVarD;
                    mVar4 = mVar2;
                } else {
                    pVar3 = pVarD2;
                    pVar6 = pVarD;
                    z25 = z16;
                    w4Var4 = w4VarI;
                    mVar4 = mVar2;
                    i37 = i17;
                    d0Var3 = d0Var;
                }
            }
            rVarH.y();
            if (t.k()) {
                t.o(1969726368, i37, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
            }
            zW = rVarH.W(jaVar.g());
            objE3 = rVarH.E();
            if (zW) {
                if (jaVar instanceof h0) {
                    l0VarA = ((h0) jaVar).getCalendarModel();
                } else {
                    l0VarA = o0.a(jaVar.g());
                }
                objE3 = l0VarA;
                rVarH.v(objE3);
            } else {
                if (jaVar instanceof h0) {
                    l0VarA = ((h0) jaVar).getCalendarModel();
                } else {
                    l0VarA = o0.a(jaVar.g());
                }
                objE3 = l0VarA;
                rVarH.v(objE3);
            }
            final l0 l0Var16 = (l0) objE3;
            if (z25) {
                rVarH.X(-2018450762);
                fVarD = y2.m.d(1343236786, true, new p() { // from class: f2.ba
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return ia.D(jaVar, w4Var4, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54);
                rVarH.R();
            } else {
                rVarH.X(-2018063138);
                rVarH.R();
                fVarD = null;
            }
            f fVar16 = fVarD;
            q qVar16 = q.f115154a;
            TextStyle textStyleE16 = ds.e(qVar16.w(), rVarH, 6);
            float fN16 = h.n(qVar16.v() - f56273d);
            final d0 d0Var19 = d0Var3;
            final w4 w4Var110 = w4Var4;
            p pVar112 = new p() { // from class: f2.ca
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return ia.F(jaVar, l0Var16, h5Var3, w4Var110, d0Var19, (r) obj, ((Integer) obj2).intValue());
                }
            };
            h5 h5Var19 = h5Var3;
            int i4111112 = i37 >> 9;
            rVar2 = rVarH;
            i8.z0(mVar4, pVar6, pVar3, fVar16, w4Var4, textStyleE16, fN16, y2.m.d(684885105, true, pVar112, rVarH, 54), rVar2, ((i37 >> 3) & 14) | 14155776 | (i4111112 & 112) | (i4111112 & 896) | ((i37 << 3) & 57344));
            if (t.k()) {
                t.n();
            }
            h5Var2 = h5Var19;
            d0Var2 = d0Var19;
            z18 = z25;
            mVar3 = mVar4;
            pVar4 = pVar6;
            w4Var3 = w4Var4;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            h5Var2 = h5Var;
            d0Var2 = d0Var;
            mVar3 = mVar2;
            w4Var3 = w4Var2;
            pVar4 = pVarD;
            z18 = z16;
        }
        pVar5 = pVar3;
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.da
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return ia.I(jaVar, mVar3, h5Var2, w4Var3, pVar4, pVar5, z18, d0Var2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(ja jaVar, w4 w4Var, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-803011924, i15, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:105)");
            }
            h9.f56070a.p(jaVar.e(), a3.l(m.INSTANCE, f56271b), w4Var.getTitleContentColor(), rVar, 3120, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(ja jaVar, h5 h5Var, w4 w4Var, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-331385278, i15, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:112)");
            }
            h9.f56070a.i(jaVar.k(), jaVar.h(), jaVar.e(), h5Var, a3.l(m.INSTANCE, f56272c), w4Var.getHeadlineContentColor(), rVar, 1597440, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(final ja jaVar, w4 w4Var, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1343236786, i15, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:139)");
            }
            m mVarL = a3.l(m.INSTANCE, i8.v2());
            int iE = jaVar.e();
            boolean zW = rVar.W(jaVar);
            Object objE = rVar.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: f2.ga
                    @Override // er.l
                    public final Object b(Object obj) {
                        return ia.E(jaVar, (ob) obj);
                    }
                };
                rVar.v(objE);
            }
            i8.k1(mVarL, iE, (l) objE, w4Var, rVar, 6);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(ja jaVar, ob obVar) {
        jaVar.d(obVar.getValue());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(final ja jaVar, l0 l0Var, h5 h5Var, w4 w4Var, d0 d0Var, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(684885105, i15, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:154)");
            }
            Long lK = jaVar.k();
            Long lH = jaVar.h();
            long jF = jaVar.f();
            int iE = jaVar.e();
            boolean zW = rVar.W(jaVar);
            Object objE = rVar.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new p() { // from class: f2.ea
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return ia.G(jaVar, (Long) obj, (Long) obj2);
                    }
                };
                rVar.v(objE);
            }
            p pVar = (p) objE;
            boolean zW2 = rVar.W(jaVar);
            Object objE2 = rVar.E();
            if (zW2 || objE2 == r.INSTANCE.a()) {
                objE2 = new l() { // from class: f2.fa
                    @Override // er.l
                    public final Object b(Object obj) {
                        return ia.H(jaVar, ((Long) obj).longValue());
                    }
                };
                rVar.v(objE2);
            }
            L(lK, lH, jF, iE, pVar, (l) objE2, l0Var, jaVar.c(), h5Var, jaVar.b(), w4Var, d0Var, rVar, 0, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(ja jaVar, Long l15, Long l16) {
        try {
            jaVar.i(l15, l16);
        } catch (IllegalArgumentException unused) {
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(ja jaVar, long j15) {
        jaVar.a(j15);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(ja jaVar, m mVar, h5 h5Var, w4 w4Var, p pVar, p pVar2, boolean z15, d0 d0Var, int i15, int i16, r rVar, int i17) {
        A(jaVar, mVar, h5Var, w4Var, pVar, pVar2, z15, d0Var, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final void J(final Long l15, final Long l16, final long j15, final p<? super Long, ? super Long, i0> pVar, final l<? super Long, i0> lVar, final l0 l0Var, final lr.i iVar, final h5 h5Var, final pi piVar, final w4 w4Var, r rVar, final int i15) {
        int i16;
        Long l17;
        p<? super Long, ? super Long, i0> pVar2;
        l<? super Long, i0> lVar2;
        pi piVar2;
        Object obj;
        r rVarH = rVar.h(-787063721);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(l15) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            l17 = l16;
            i16 |= rVarH.W(l17) ? 32 : 16;
        } else {
            l17 = l16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.d(j15) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            pVar2 = pVar;
            i16 |= rVarH.G(pVar2) ? 2048 : 1024;
        } else {
            pVar2 = pVar;
        }
        if ((i15 & 24576) == 0) {
            lVar2 = lVar;
            i16 |= rVarH.G(lVar2) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            lVar2 = lVar;
        }
        if ((196608 & i15) == 0) {
            i16 |= rVarH.G(l0Var) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((1572864 & i15) == 0) {
            i16 |= rVarH.G(iVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i15) == 0) {
            i16 |= (16777216 & i15) == 0 ? rVarH.W(h5Var) : rVarH.G(h5Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i15) == 0) {
            piVar2 = piVar;
            i16 |= rVarH.W(piVar2) ? 67108864 : 33554432;
        } else {
            piVar2 = piVar;
        }
        if ((i15 & 805306368) == 0) {
            i16 |= rVarH.W(w4Var) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if (rVarH.r((i16 & 306783379) != 306783378, i16 & 1)) {
            if (t.k()) {
                t.o(-787063721, i16, -1, "androidx.compose.material3.DateRangePickerContent (DateRangePicker.kt:764)");
            }
            int iE = lr.m.e(l0Var.h(j15).g(iVar), 0);
            y0 y0VarC = b1.c(iE, 0, rVarH, 0, 2);
            Integer numValueOf = Integer.valueOf(iE);
            boolean zW = rVarH.W(y0VarC) | rVarH.c(iE);
            Object objE = rVarH.E();
            if (zW || objE == r.INSTANCE.a()) {
                obj = null;
                objE = new a(y0VarC, iE, null);
                rVarH.v(objE);
            } else {
                obj = null;
            }
            Function0.d(numValueOf, (p) objE, rVarH, 0);
            m mVarP = a3.p(m.INSTANCE, i8.u2(), 0.0f, 2, obj);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarP);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            i8.W1(w4Var, l0Var, rVarH, ((i16 >> 27) & 14) | ((i16 >> 12) & 112));
            P(y0VarC, l15, l17, pVar2, lVar2, l0Var, iVar, h5Var, piVar2, w4Var, rVarH, ((i16 << 3) & 1008) | (i16 & 7168) | (57344 & i16) | (458752 & i16) | (3670016 & i16) | (29360128 & i16) | (234881024 & i16) | (1879048192 & i16));
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.l9
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return ia.K(l15, l16, j15, pVar, lVar, l0Var, iVar, h5Var, piVar, w4Var, i15, (r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(Long l15, Long l16, long j15, p pVar, l lVar, l0 l0Var, lr.i iVar, h5 h5Var, pi piVar, w4 w4Var, int i15, r rVar, int i16) {
        J(l15, l16, j15, pVar, lVar, l0Var, iVar, h5Var, piVar, w4Var, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void L(final Long l15, final Long l16, final long j15, final int i15, final p<? super Long, ? super Long, i0> pVar, final l<? super Long, i0> lVar, final l0 l0Var, final lr.i iVar, final h5 h5Var, final pi piVar, final w4 w4Var, final d0 d0Var, r rVar, final int i16, final int i17) {
        int i18;
        Long l17;
        p<? super Long, ? super Long, i0> pVar2;
        l<? super Long, i0> lVar2;
        int i19;
        r rVar2;
        r rVarH = rVar.h(621028059);
        if ((i16 & 6) == 0) {
            i18 = (rVarH.W(l15) ? 4 : 2) | i16;
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            l17 = l16;
            i18 |= rVarH.W(l17) ? 32 : 16;
        } else {
            l17 = l16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i18 |= rVarH.d(j15) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i18 |= rVarH.c(i15) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            pVar2 = pVar;
            i18 |= rVarH.G(pVar2) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            pVar2 = pVar;
        }
        if ((196608 & i16) == 0) {
            lVar2 = lVar;
            i18 |= rVarH.G(lVar2) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        } else {
            lVar2 = lVar;
        }
        if ((i16 & 1572864) == 0) {
            i18 |= rVarH.G(l0Var) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i16 & 12582912) == 0) {
            i18 |= rVarH.G(iVar) ? 8388608 : 4194304;
        }
        if ((i16 & 100663296) == 0) {
            i18 |= (i16 & 134217728) == 0 ? rVarH.W(h5Var) : rVarH.G(h5Var) ? 67108864 : 33554432;
        }
        if ((i16 & 805306368) == 0) {
            i18 |= rVarH.W(piVar) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i17 & 6) == 0) {
            i19 = i17 | (rVarH.W(w4Var) ? 4 : 2);
        } else {
            i19 = i17;
        }
        if ((i17 & 48) == 0) {
            i19 |= rVarH.W(d0Var) ? 32 : 16;
        }
        int i25 = i19;
        if (rVarH.r(((i18 & 306783379) == 306783378 && (i25 & 19) == 18) ? false : true, i18 & 1)) {
            if (t.k()) {
                t.o(621028059, i18, i25, "androidx.compose.material3.SwitchableDateEntryContent (DateRangePicker.kt:708)");
            }
            j0 j0VarB = of.b(k0.FastEffects, rVarH, 6);
            m.Companion companion = m.INSTANCE;
            Object objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = new l() { // from class: f2.ha
                    @Override // er.l
                    public final Object b(Object obj) {
                        return ia.M((n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            final Long l18 = l17;
            final p<? super Long, ? super Long, i0> pVar3 = pVar2;
            final l<? super Long, i0> lVar3 = lVar2;
            rVar2 = rVarH;
            w.a(ob.c(i15), v.d(companion, false, (l) objE, 1, null), j0VarB, null, y2.m.d(-773828161, true, new er.q() { // from class: f2.j9
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return ia.N(l15, l18, j15, pVar3, lVar3, l0Var, iVar, h5Var, piVar, w4Var, d0Var, (ob) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, ((i18 >> 9) & 14) | 24576, 8);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.k9
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return ia.O(l15, l16, j15, i15, pVar, lVar, l0Var, iVar, h5Var, piVar, w4Var, d0Var, i16, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(n4.i0 i0Var) {
        f0.a0(i0Var, true);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(Long l15, Long l16, long j15, p pVar, l lVar, l0 l0Var, lr.i iVar, h5 h5Var, pi piVar, w4 w4Var, d0 d0Var, ob obVar, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.c(obVar.getValue()) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-773828161, i16, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DateRangePicker.kt:721)");
            }
            int value = obVar.getValue();
            ob.Companion companion = ob.INSTANCE;
            if (ob.f(value, companion.b())) {
                rVar.X(-619517270);
                J(l15, l16, j15, pVar, lVar, l0Var, iVar, h5Var, piVar, w4Var, rVar, 0);
                rVar.R();
            } else if (ob.f(value, companion.a())) {
                rVar.X(-619495944);
                z8.l(l15, l16, pVar, l0Var, iVar, h5Var, piVar, w4Var, d0Var, rVar, 0);
                rVar.R();
            } else {
                rVar.X(-2023979101);
                rVar.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(Long l15, Long l16, long j15, int i15, p pVar, l lVar, l0 l0Var, lr.i iVar, h5 h5Var, pi piVar, w4 w4Var, d0 d0Var, int i16, int i17, r rVar, int i18) {
        L(l15, l16, j15, i15, pVar, lVar, l0Var, iVar, h5Var, piVar, w4Var, d0Var, rVar, g4.a(i16 | 1), g4.a(i17));
        return i0.f148189a;
    }

    private static final void P(y0 y0Var, final Long l15, final Long l16, final p<? super Long, ? super Long, i0> pVar, final l<? super Long, i0> lVar, final l0 l0Var, final lr.i iVar, final h5 h5Var, final pi piVar, final w4 w4Var, r rVar, final int i15) {
        int i16;
        Long l17;
        Long l18;
        Object objG;
        Object bVar;
        final y0 y0Var2 = y0Var;
        r rVarH = rVar.h(1257365001);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(y0Var2) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            l17 = l15;
            i16 |= rVarH.W(l17) ? 32 : 16;
        } else {
            l17 = l15;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            l18 = l16;
            i16 |= rVarH.W(l18) ? 256 : 128;
        } else {
            l18 = l16;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(pVar) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.G(lVar) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i16 |= rVarH.G(l0Var) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((1572864 & i15) == 0) {
            i16 |= rVarH.G(iVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i15) == 0) {
            i16 |= (16777216 & i15) == 0 ? rVarH.W(h5Var) : rVarH.G(h5Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i15) == 0) {
            i16 |= rVarH.W(piVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i15) == 0) {
            i16 |= rVarH.W(w4Var) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if (rVarH.r((i16 & 306783379) != 306783378, i16 & 1)) {
            if (t.k()) {
                t.o(1257365001, i16, -1, "androidx.compose.material3.VerticalMonthsList (DateRangePicker.kt:812)");
            }
            final CalendarDate calendarDateJ = l0Var.j();
            boolean zW = rVarH.W(iVar);
            Object objE = rVarH.E();
            if (zW || objE == r.INSTANCE.a()) {
                objG = l0Var.g(iVar.getFirst(), 1);
                rVarH.v(objG);
            } else {
                objG = objE;
            }
            final CalendarMonth calendarMonth = (CalendarMonth) objG;
            int i17 = i16;
            final Long l19 = l18;
            final Long l25 = l17;
            oo.h(ds.e(q.f115154a.h(), rVarH, 6), y2.m.d(1090773432, true, new p() { // from class: f2.m9
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return ia.Q(l25, l19, pVar, y0Var2, iVar, l0Var, calendarMonth, h5Var, w4Var, calendarDateJ, piVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 48);
            int i18 = i17 & 14;
            boolean zG = (i18 == 4) | ((i17 & 57344) == 16384) | rVarH.G(l0Var) | rVarH.G(iVar);
            Object objE2 = rVarH.E();
            if (zG || objE2 == r.INSTANCE.a()) {
                y0Var2 = y0Var;
                bVar = new b(y0Var2, lVar, l0Var, iVar, null);
                rVarH.v(bVar);
            } else {
                bVar = objE2;
                y0Var2 = y0Var;
            }
            Function0.d(y0Var2, (p) bVar, rVarH, i18);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.n9
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return ia.a0(y0Var2, l15, l16, pVar, lVar, l0Var, iVar, h5Var, piVar, w4Var, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q(final Long l15, final Long l16, final p pVar, final y0 y0Var, final lr.i iVar, final l0 l0Var, final CalendarMonth calendarMonth, final h5 h5Var, final w4 w4Var, final CalendarDate calendarDate, final pi piVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1090773432, i15, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous> (DateRangePicker.kt:822)");
            }
            Object objE = rVar.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = Function0.i(tq.j.f191408a, rVar);
                rVar.v(objE);
            }
            p0 p0Var = (p0) objE;
            a2.Companion companion2 = a2.INSTANCE;
            String strB = b2.b(a2.a(ih.F), rVar, 0);
            String strB2 = b2.b(a2.a(ih.E), rVar, 0);
            boolean zW = rVar.W(l15) | rVar.W(l16) | rVar.W(pVar);
            Object objE2 = rVar.E();
            if (zW || objE2 == companion.a()) {
                objE2 = new l() { // from class: f2.o9
                    @Override // er.l
                    public final Object b(Object obj) {
                        return ia.R(l15, l16, pVar, ((Long) obj).longValue());
                    }
                };
                rVar.v(objE2);
            }
            final l lVar = (l) objE2;
            final List<CustomAccessibilityAction> listB0 = b0(y0Var, p0Var, strB, strB2);
            m.Companion companion3 = m.INSTANCE;
            Object objE3 = rVar.E();
            if (objE3 == companion.a()) {
                objE3 = new l() { // from class: f2.p9
                    @Override // er.l
                    public final Object b(Object obj) {
                        return ia.S((n4.i0) obj);
                    }
                };
                rVar.v(objE3);
            }
            m mVarD = v.d(companion3, false, (l) objE3, 1, null);
            boolean zG = rVar.G(iVar) | rVar.G(l0Var) | rVar.W(calendarMonth) | rVar.G(h5Var) | rVar.G(listB0) | rVar.W(w4Var) | rVar.W(l15) | rVar.W(l16) | rVar.W(lVar) | rVar.W(calendarDate) | rVar.W(piVar) | rVar.W(y0Var);
            Object objE4 = rVar.E();
            if (zG || objE4 == companion.a()) {
                objE4 = new l() { // from class: f2.q9
                    @Override // er.l
                    public final Object b(Object obj) {
                        return ia.V(iVar, l0Var, calendarMonth, l15, l16, lVar, calendarDate, h5Var, piVar, w4Var, y0Var, listB0, (q0) obj);
                    }
                };
                rVar.v(objE4);
            }
            f1.d.c(mVarD, y0Var, null, false, null, null, null, false, null, (l) objE4, rVar, 0, 508);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(Long l15, Long l16, p pVar, long j15) {
        h0(j15, l15, l16, pVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(n4.i0 i0Var) {
        f0.J0(i0Var, new ScrollAxisRange(new er.a() { // from class: f2.v9
            @Override // er.a
            public final Object a() {
                return Float.valueOf(ia.T());
            }
        }, new er.a() { // from class: f2.w9
            @Override // er.a
            public final Object a() {
                return Float.valueOf(ia.U());
            }
        }, false, 4, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float T() {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float U() {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V(lr.i iVar, final l0 l0Var, final CalendarMonth calendarMonth, final Long l15, final Long l16, final l lVar, final CalendarDate calendarDate, final h5 h5Var, final pi piVar, final w4 w4Var, final y0 y0Var, final List list, q0 q0Var) {
        q0.e(q0Var, i8.G2(iVar), null, null, y2.m.b(682334170, true, new er.r() { // from class: f2.u9
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return ia.W(l0Var, calendarMonth, l15, l16, lVar, calendarDate, h5Var, piVar, w4Var, y0Var, list, (f1.e) obj, ((Integer) obj2).intValue(), (r) obj3, ((Integer) obj4).intValue());
            }
        }), 6, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W(final l0 l0Var, CalendarMonth calendarMonth, Long l15, Long l16, l lVar, CalendarDate calendarDate, final h5 h5Var, pi piVar, final w4 w4Var, y0 y0Var, final List list, f1.e eVar, int i15, r rVar, int i16) {
        int i17;
        if ((i16 & 6) == 0) {
            i17 = i16 | (rVar.W(eVar) ? 4 : 2);
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= rVar.c(i15) ? 32 : 16;
        }
        if (rVar.r((i17 & 147) != 146, i17 & 1)) {
            if (t.k()) {
                t.o(682334170, i17, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:855)");
            }
            final CalendarMonth calendarMonthM = l0Var.m(calendarMonth, i15);
            qi qiVar = null;
            m mVarC = f1.e.c(eVar, m.INSTANCE, 0.0f, 1, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, mVarC);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            oo.h(ds.e(q.f115154a.y(), rVar, 6), y2.m.d(-577031469, true, new p() { // from class: f2.x9
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return ia.X(h5Var, calendarMonthM, l0Var, list, w4Var, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, 48);
            if (l15 == null || l16 == null) {
                rVar.X(186488258);
                rVar.R();
            } else {
                rVar.X(185956701);
                boolean zD = rVar.d(l15.longValue()) | rVar.d(l16.longValue());
                Object objE = rVar.E();
                if (zD || objE == r.INSTANCE.a()) {
                    objE = qi.INSTANCE.a(calendarMonthM, l0Var.b(l15.longValue()), l0Var.b(l16.longValue()));
                    rVar.v(objE);
                }
                qiVar = (qi) objE;
                rVar.R();
            }
            qi qiVar2 = qiVar;
            long utcTimeMillis = calendarDate.getUtcTimeMillis();
            Locale locale = l0Var.getLocale();
            Object objE2 = rVar.E();
            if (objE2 == r.INSTANCE.a()) {
                objE2 = new er.a() { // from class: f2.y9
                    @Override // er.a
                    public final Object a() {
                        return ia.Z();
                    }
                };
                rVar.v(objE2);
            }
            i8.D1(calendarMonthM, lVar, utcTimeMillis, l15, l16, qiVar2, h5Var, piVar, w4Var, locale, y0Var, null, (er.a) objE2, rVar, 0, 432);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X(h5 h5Var, CalendarMonth calendarMonth, l0 l0Var, final List list, w4 w4Var, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-577031469, i15, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:858)");
            }
            String strA = h5Var.a(Long.valueOf(calendarMonth.getStartUtcTimeMillis()), l0Var.getLocale());
            if (strA == null) {
                strA = "-";
            }
            m mVarL = a3.l(m.INSTANCE, f56270a);
            boolean zG = rVar.G(list);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: f2.z9
                    @Override // er.l
                    public final Object b(Object obj) {
                        return ia.Y(list, (n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            oo.j(strA, v.d(mVarL, false, (l) objE, 1, null), w4Var.getSubheadContentColor(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 262136);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y(List list, n4.i0 i0Var) {
        f0.e0(i0Var, list);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 a0(y0 y0Var, Long l15, Long l16, p pVar, l lVar, l0 l0Var, lr.i iVar, h5 h5Var, pi piVar, w4 w4Var, int i15, r rVar, int i16) {
        P(y0Var, l15, l16, pVar, lVar, l0Var, iVar, h5Var, piVar, w4Var, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final List<CustomAccessibilityAction> b0(final y0 y0Var, final p0 p0Var, String str, String str2) {
        return pq.v.q(new CustomAccessibilityAction(str, new er.a() { // from class: f2.r9
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(ia.c0(y0Var, p0Var));
            }
        }), new CustomAccessibilityAction(str2, new er.a() { // from class: f2.s9
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(ia.d0(y0Var, p0Var));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c0(y0 y0Var, p0 p0Var) {
        if (!y0Var.d()) {
            return false;
        }
        ju.k.d(p0Var, null, null, new d(y0Var, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d0(y0 y0Var, p0 p0Var) {
        if (!y0Var.e()) {
            return false;
        }
        ju.k.d(p0Var, null, null, new c(y0Var, null), 3, null);
        return true;
    }

    public static final void e0(p3.c cVar, qi qiVar, long j15) {
        float fL2 = cVar.l2(i8.y2());
        float fL3 = cVar.l2(i8.y2());
        float fL4 = cVar.l2(q.f115154a.k());
        float f15 = 2;
        float f16 = (fL3 - fL4) / f15;
        float f17 = 7;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (cVar.a() >> 32)) - (f17 * fL2)) / f17;
        long gridStartCoordinates = qiVar.getGridStartCoordinates();
        int i15 = n.i(gridStartCoordinates);
        int iJ = n.j(gridStartCoordinates);
        long gridEndCoordinates = qiVar.getGridEndCoordinates();
        int i16 = n.i(gridEndCoordinates);
        int iJ2 = n.j(gridEndCoordinates);
        float f18 = fL2 + fIntBitsToFloat;
        float f19 = fIntBitsToFloat / f15;
        float fIntBitsToFloat2 = (i15 * f18) + (qiVar.getFirstIsSelectionStart() ? fL2 / f15 : 0.0f) + f19;
        float f25 = (iJ * fL3) + f16;
        float f26 = i16 * f18;
        if (qiVar.getLastIsSelectionEnd()) {
            fL2 /= f15;
        }
        float fIntBitsToFloat3 = f26 + fL2 + f19;
        float f27 = (iJ2 * fL3) + f16;
        boolean z15 = cVar.getLayoutDirection() == c5.t.Rtl;
        if (z15) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (cVar.a() >> 32)) - fIntBitsToFloat2;
            fIntBitsToFloat3 = Float.intBitsToFloat((int) (cVar.a() >> 32)) - fIntBitsToFloat3;
        }
        float fIntBitsToFloat4 = fIntBitsToFloat3;
        p3.f.c2(cVar, j15, m3.e.e((((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(f25)) & BodyPartID.bodyIdMax)), m3.k.d((((long) Float.floatToRawIntBits(iJ == iJ2 ? fIntBitsToFloat4 - fIntBitsToFloat2 : z15 ? -fIntBitsToFloat2 : Float.intBitsToFloat((int) (cVar.a() >> 32)) - fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fL4)) & BodyPartID.bodyIdMax)), 0.0f, null, null, 0, 120, null);
        if (iJ != iJ2) {
            for (int i17 = (iJ2 - iJ) - 1; i17 > 0; i17--) {
                p3.f.c2(cVar, j15, m3.e.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f25 + (i17 * fL3))) & BodyPartID.bodyIdMax)), m3.k.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cVar.a() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fL4)) & BodyPartID.bodyIdMax)), 0.0f, null, null, 0, 120, null);
            }
            long jE = m3.e.e((((long) Float.floatToRawIntBits(cVar.getLayoutDirection() != c5.t.Ltr ? Float.intBitsToFloat((int) (cVar.a() >> 32)) : 0.0f)) << 32) | (((long) Float.floatToRawIntBits(f27)) & BodyPartID.bodyIdMax));
            if (z15) {
                fIntBitsToFloat4 -= Float.intBitsToFloat((int) (cVar.a() >> 32));
            }
            p3.f.c2(cVar, j15, jE, m3.k.d((((long) Float.floatToRawIntBits(fIntBitsToFloat4)) << 32) | (((long) Float.floatToRawIntBits(fL4)) & BodyPartID.bodyIdMax)), 0.0f, null, null, 0, 120, null);
        }
    }

    public static final ja f0(Long l15, Long l16, Long l17, lr.i iVar, int i15, pi piVar, r rVar, int i16, int i17) {
        final Long l18 = (i17 & 1) != 0 ? null : l15;
        final Long l19 = (i17 & 2) != 0 ? null : l16;
        final Long l25 = (i17 & 4) != 0 ? l18 : l17;
        final lr.i iVarQ = (i17 & 8) != 0 ? a5.f55133a.q() : iVar;
        final int iB = (i17 & 16) != 0 ? ob.INSTANCE.b() : i15;
        final pi piVarM = (i17 & 32) != 0 ? a5.f55133a.m() : piVar;
        if (t.k()) {
            t.o(-2012087461, i16, -1, "androidx.compose.material3.rememberDateRangePickerState (DateRangePicker.kt:283)");
        }
        final Locale localeA = v1.a(rVar, 0);
        Object[] objArr = new Object[0];
        x<ma, Object> xVarC = ma.INSTANCE.c(piVarM, localeA);
        boolean z15 = true;
        boolean zG = ((((i16 & 112) ^ 48) > 32 && rVar.W(l19)) || (i16 & 48) == 32) | ((((i16 & 14) ^ 6) > 4 && rVar.W(l18)) || (i16 & 6) == 4) | ((((i16 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && rVar.W(l25)) || (i16 & MLKEMEngine.KyberPolyBytes) == 256) | rVar.G(iVarQ) | ((((57344 & i16) ^ 24576) > 16384 && rVar.c(iB)) || (i16 & 24576) == 16384);
        if ((((458752 & i16) ^ 196608) <= 131072 || !rVar.W(piVarM)) && (i16 & 196608) != 131072) {
            z15 = false;
        }
        boolean zW = zG | z15 | rVar.W(localeA);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            Object obj = new er.a() { // from class: f2.i9
                @Override // er.a
                public final Object a() {
                    return ia.g0(l18, l19, l25, iVarQ, iB, piVarM, localeA);
                }
            };
            rVar.v(obj);
            objE = obj;
        }
        ma maVar = (ma) b3.f.i(objArr, xVarC, (er.a) objE, rVar, 0);
        maVar.n(piVarM);
        if (t.k()) {
            t.n();
        }
        return maVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ma g0(Long l15, Long l16, Long l17, lr.i iVar, int i15, pi piVar, Locale locale) {
        return new ma(l15, l16, l17, iVar, i15, piVar, locale, null);
    }

    private static final void h0(long j15, Long l15, Long l16, p<? super Long, ? super Long, i0> pVar) {
        if ((l15 == null && l16 == null) || (l15 != null && l16 != null)) {
            pVar.B(Long.valueOf(j15), null);
        } else if (l15 == null || j15 < l15.longValue()) {
            pVar.B(Long.valueOf(j15), null);
        } else {
            pVar.B(l15, Long.valueOf(j15));
        }
    }
}
