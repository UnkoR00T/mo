package jh1;

import android.annotation.SuppressLint;
import c40.DocumentRowData;
import d1.d3;
import d1.m3;
import d1.o2;
import d1.p3;
import d1.q3;
import d1.r3;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.Iterator;
import java.util.List;
import ju.z0;
import lh1.DocumentsEmptyScreenData;
import lh1.DocumentsListScreenModel;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import s20.DocumentRefreshCardData;
import w0.f3;
import w0.u2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00102\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u0018\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00172\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001ac\u0010&\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"H\u0003¢\u0006\u0004\b&\u0010'\"\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*\"\u0014\u0010-\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*¨\u00068²\u0006\f\u0010/\u001a\u00020.8\nX\u008a\u0084\u0002²\u0006\f\u00100\u001a\u00020(8\nX\u008a\u0084\u0002²\u0006\f\u00101\u001a\u00020(8\nX\u008a\u0084\u0002²\u0006\f\u00102\u001a\u00020(8\nX\u008a\u0084\u0002²\u0006\u0010\u00104\u001a\u0004\u0018\u0001038\n@\nX\u008a\u008e\u0002²\u0006\u0010\u00105\u001a\u0004\u0018\u0001038\n@\nX\u008a\u008e\u0002²\u0006\f\u00107\u001a\u0002068\nX\u008a\u0084\u0002"}, d2 = {"Ljh1/w;", "viewModel", "Ll3/d0;", "parentFocusRequester", "Loq/i0;", "Q", "(Ljh1/w;Ll3/d0;Lm2/r;II)V", "Llh1/d;", "documentsListScreenModel", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Llh1/d;Ll3/d0;Lm2/r;II)V", "Llh1/c$b;", "layoutData", "previousFocusRequester", "K", "(Llh1/c$b;Ll3/d0;Lm2/r;II)V", "Llh1/c$c;", "U", "(Llh1/c$c;Ll3/d0;Lm2/r;II)V", "Llh1/b;", "model", "X", "(Llh1/b;Lm2/r;I)V", "Llh1/c$a;", "w", "(Llh1/c$a;Ll3/d0;Lm2/r;II)V", "Lf3/m;", "modifier", "Ls20/b;", "documentRefreshCardData", "Lkotlin/Function0;", "onDoubleClick", "onClick", "onAutoClick", "", "isElevated", "isLayoutExpanded", "shouldRunAutoClick", "s", "(Lf3/m;Ls20/b;Ler/a;Ler/a;Ler/a;ZZZLm2/r;II)V", "Lc5/h;", "a", "F", "EXPANDED_CARDS_SPACING", "b", "ENTER_ANIMATION_PADDING", "Ljh1/w$a;", "data", "animatedPadding", "cardsSpacing", "animatedCardsSpacing", "", "elevatedCardIndex", "autoClickCardIndex", "Lc5/n;", "animatedOffset", "dashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f102918a = c5.h.n(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f102919b = c5.h.n(800);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102920e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f102921f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.a<oq.i0> f102922g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z15, er.a<oq.i0> aVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f102921f = z15;
            this.f102922g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f102920e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (this.f102921f) {
                    this.f102920e = 1;
                    if (z0.b(200L, this) == objE) {
                        return objE;
                    }
                }
                return oq.i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f102922g.a();
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f102921f, this.f102922g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102923e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ lh1.c.BIG f102924f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(lh1.c.BIG big, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f102924f = big;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f102923e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f102924f.d().a();
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f102924f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102925e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f3 f102926f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f3 f3Var, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f102926f = f3Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f102925e;
            if (i15 == 0) {
                oq.u.b(obj);
                f3 f3Var = this.f102926f;
                this.f102925e = 1;
                if (f3Var.v(0, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((c) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f102926f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f102927e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ w f102928f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(w wVar, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f102928f = wVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f102927e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f102928f.n();
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((d) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new d(this.f102928f, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102929a;

        static {
            int[] iArr = new int[lh1.a.values().length];
            try {
                iArr[lh1.a.COLLAPSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lh1.a.EXPANDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f102929a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(l3.d0 d0Var, l3.v vVar) {
        vVar.f(d0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(lh1.c.BIG big, a3 a3Var) {
        if (big.getBigCardsState() == lh1.a.COLLAPSED) {
            G(a3Var, null);
        }
        big.b().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(int i15, a3 a3Var, a3 a3Var2) {
        G(a3Var, Integer.valueOf(i15));
        I(a3Var2, Integer.valueOf(i15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(DocumentRefreshCardData documentRefreshCardData, a3 a3Var) {
        I(a3Var, null);
        documentRefreshCardData.f().a();
        return oq.i0.f148189a;
    }

    private static final float E(f6<c5.h> f6Var) {
        return f6Var.getValue().getValue();
    }

    private static final Integer F(a3<Integer> a3Var) {
        return a3Var.getValue();
    }

    private static final void G(a3<Integer> a3Var, Integer num) {
        a3Var.setValue(num);
    }

    private static final Integer H(a3<Integer> a3Var) {
        return a3Var.getValue();
    }

    private static final void I(a3<Integer> a3Var, Integer num) {
        a3Var.setValue(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J(lh1.c.BIG big, l3.d0 d0Var, int i15, int i16, p076m2.r rVar, int i17) {
        w(big, d0Var, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:39:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:59:0x0124  */
    /* JADX WARN: Code duplicated, block: B:63:0x0162  */
    /* JADX WARN: Code duplicated, block: B:64:0x0166  */
    /* JADX WARN: Code duplicated, block: B:67:0x0170  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    private static final void K(final lh1.c.LIST list, l3.d0 d0Var, p076m2.r rVar, final int i15, final int i16) {
        l3.d0 d0Var2;
        boolean z15;
        final l3.d0 d0Var3;
        d5 d5VarM;
        er.a<androidx.compose.ui.node.c> aVarB;
        int i17;
        f3.m mVarA;
        p076m2.r rVarH = rVar.h(576946241);
        int i18 = (i15 & 6) == 0 ? (rVarH.G(list) ? 4 : 2) | i15 : i15;
        int i19 = i16 & 2;
        if (i19 == 0) {
            if ((i15 & 48) == 0) {
                d0Var2 = d0Var;
                i18 |= rVarH.W(d0Var2) ? 32 : 16;
            }
            if ((i18 & 19) != 18) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i18 & 1)) {
                if (i19 != 0) {
                    d0Var3 = null;
                } else {
                    d0Var3 = d0Var2;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(576946241, i18, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documents.DocumentsListContent (DocumentsListScreen.kt:178)");
                }
                f3.m.Companion companion = f3.m.INSTANCE;
                p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                f3.m mVarE = f3.j.e(rVarH, companion);
                androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion2.b();
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
                rVarH.X(-1007988283);
                i17 = 0;
                for (Object obj : list.a()) {
                    int i25 = i17 + 1;
                    if (i17 < 0) {
                        pq.v.x();
                    }
                    DocumentRowData documentRowData = (DocumentRowData) obj;
                    if (i17 == 0 || d0Var3 == null) {
                        rVarH.X(-1303298541);
                        rVarH.R();
                        mVarA = f3.m.INSTANCE;
                    } else {
                        rVarH.X(-1303382179);
                        f3.m.Companion companion3 = f3.m.INSTANCE;
                        boolean z16 = (i18 & 112) == 32;
                        Object objE = rVarH.E();
                        if (z16 || objE == p076m2.r.INSTANCE.a()) {
                            objE = new er.l() { // from class: jh1.b
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return s.O(d0Var3, (l3.v) obj2);
                                }
                            };
                            rVarH.v(objE);
                        }
                        mVarA = l3.y.a(companion3, (er.l) objE);
                        rVarH.R();
                    }
                    c40.h.i(mVarA, documentRowData, rVarH, DocumentRowData.f23100j << 3, 0);
                    r3.a(d1.a3.r(f3.m.INSTANCE, 0.0f, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100(), 0.0f, 0.0f, 13, null), rVarH, 0);
                    i17 = i25;
                }
                rVarH.R();
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVarH.O();
                d0Var3 = d0Var2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: jh1.c
                    @Override // er.p
                    public final Object B(Object obj2, Object obj3) {
                        return s.P(list, d0Var3, i15, i16, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i18 |= 48;
        d0Var2 = d0Var;
        if ((i18 & 19) != 18) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i18 & 1)) {
            if (i19 != 0) {
                d0Var3 = null;
            } else {
                d0Var3 = d0Var2;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(576946241, i18, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documents.DocumentsListContent (DocumentsListScreen.kt:178)");
            }
            f3.m.Companion companion4 = f3.m.INSTANCE;
            p036e4.w0 w0VarA2 = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, companion4);
            androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion5.b();
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
            n6.i(rVarC2, w0VarA2, companion5.d());
            n6.i(rVarC2, e0VarT2, companion5.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion5.c());
            n6.g(rVarC2, companion5.a());
            n6.i(rVarC2, mVarE2, companion5.e());
            d1.i0 i0Var2 = d1.i0.f39176a;
            rVarH.X(-1007988283);
            i17 = 0;
            while (r3.hasNext()) {
                int i26 = i17 + 1;
                if (i17 < 0) {
                    pq.v.x();
                }
                DocumentRowData documentRowData2 = (DocumentRowData) obj;
                if (i17 == 0) {
                    rVarH.X(-1303298541);
                    rVarH.R();
                    mVarA = f3.m.INSTANCE;
                } else {
                    rVarH.X(-1303298541);
                    rVarH.R();
                    mVarA = f3.m.INSTANCE;
                }
                c40.h.i(mVarA, documentRowData2, rVarH, DocumentRowData.f23100j << 3, 0);
                r3.a(d1.a3.r(f3.m.INSTANCE, 0.0f, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100(), 0.0f, 0.0f, 13, null), rVarH, 0);
                i17 = i26;
            }
            rVarH.R();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
            d0Var3 = d0Var2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: jh1.c
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return s.P(list, d0Var3, i15, i16, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x009f  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:53:0x0112  */
    /* JADX WARN: Code duplicated, block: B:54:0x0116  */
    /* JADX WARN: Code duplicated, block: B:57:0x0122  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    public static final void L(final DocumentsListScreenModel documentsListScreenModel, l3.d0 d0Var, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        l3.d0 d0Var2;
        boolean z15;
        p076m2.r rVar2;
        final l3.d0 d0Var3;
        d5 d5VarM;
        final f3 f3VarB;
        boolean zW;
        Object objE;
        Object objE2;
        p076m2.r.Companion companion;
        Object objE3;
        Object objE4;
        p076m2.r rVarH = rVar.h(1315940810);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(documentsListScreenModel) : rVarH.G(documentsListScreenModel) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 == 0) {
            if ((i15 & 48) == 0) {
                d0Var2 = d0Var;
                i17 |= rVarH.W(d0Var2) ? 32 : 16;
            }
            if ((i17 & 19) != 18) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i18 != 0) {
                    d0Var3 = null;
                } else {
                    d0Var3 = d0Var2;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(1315940810, i17, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documents.DocumentsListContent (DocumentsListScreen.kt:110)");
                }
                f3VarB = u2.b(0, rVarH, 0, 1);
                Boolean boolValueOf = Boolean.valueOf(documentsListScreenModel.getLayoutChanged());
                zW = rVarH.W(f3VarB);
                objE = rVarH.E();
                if (zW || objE == p076m2.r.INSTANCE.a()) {
                    objE = new c(f3VarB, null);
                    rVarH.v(objE);
                }
                Function0.d(boolValueOf, (er.p) objE, rVarH, 0);
                objE2 = rVarH.E();
                companion = p076m2.r.INSTANCE;
                if (objE2 == companion.a()) {
                    objE2 = new l3.d0();
                    rVarH.v(objE2);
                }
                final l3.d0 d0Var4 = (l3.d0) objE2;
                objE3 = rVarH.E();
                if (objE3 == companion.a()) {
                    objE3 = new l3.d0();
                    rVarH.v(objE3);
                }
                final l3.d0 d0Var5 = (l3.d0) objE3;
                BaseScaffoldData scaffoldData = documentsListScreenModel.getScaffoldData();
                objE4 = rVarH.E();
                if (objE4 == companion.a()) {
                    objE4 = new l3.d0();
                    rVarH.v(objE4);
                }
                rVar2 = rVarH;
                i50.s.r(scaffoldData, null, null, 0, 0L, null, null, false, (l3.d0) objE4, d0Var3, d0Var5, d0Var4, false, 0.0f, 0.0f, y2.m.d(-515745417, true, new er.q() { // from class: jh1.k
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return s.M(f3VarB, documentsListScreenModel, d0Var5, d0Var4, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVar2, 100663296 | BaseScaffoldData.f89350g | ((i17 << 24) & 1879048192), 197046, 24830);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVar2 = rVarH;
                rVar2.O();
                d0Var3 = d0Var2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: jh1.l
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return s.N(documentsListScreenModel, d0Var3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        d0Var2 = d0Var;
        if ((i17 & 19) != 18) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i18 != 0) {
                d0Var3 = null;
            } else {
                d0Var3 = d0Var2;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(1315940810, i17, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documents.DocumentsListContent (DocumentsListScreen.kt:110)");
            }
            f3VarB = u2.b(0, rVarH, 0, 1);
            Boolean boolValueOf2 = Boolean.valueOf(documentsListScreenModel.getLayoutChanged());
            zW = rVarH.W(f3VarB);
            objE = rVarH.E();
            if (zW) {
                objE = new c(f3VarB, null);
                rVarH.v(objE);
            } else {
                objE = new c(f3VarB, null);
                rVarH.v(objE);
            }
            Function0.d(boolValueOf2, (er.p) objE, rVarH, 0);
            objE2 = rVarH.E();
            companion = p076m2.r.INSTANCE;
            if (objE2 == companion.a()) {
                objE2 = new l3.d0();
                rVarH.v(objE2);
            }
            final l3.d0 d0Var6 = (l3.d0) objE2;
            objE3 = rVarH.E();
            if (objE3 == companion.a()) {
                objE3 = new l3.d0();
                rVarH.v(objE3);
            }
            final l3.d0 d0Var7 = (l3.d0) objE3;
            BaseScaffoldData scaffoldData2 = documentsListScreenModel.getScaffoldData();
            objE4 = rVarH.E();
            if (objE4 == companion.a()) {
                objE4 = new l3.d0();
                rVarH.v(objE4);
            }
            rVar2 = rVarH;
            i50.s.r(scaffoldData2, null, null, 0, 0L, null, null, false, (l3.d0) objE4, d0Var3, d0Var7, d0Var6, false, 0.0f, 0.0f, y2.m.d(-515745417, true, new er.q() { // from class: jh1.k
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return s.M(f3VarB, documentsListScreenModel, d0Var7, d0Var6, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, 100663296 | BaseScaffoldData.f89350g | ((i17 << 24) & 1879048192), 197046, 24830);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
            d0Var3 = d0Var2;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: jh1.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.N(documentsListScreenModel, d0Var3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M(f3 f3Var, DocumentsListScreenModel documentsListScreenModel, l3.d0 d0Var, l3.d0 d0Var2, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-515745417, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documents.DocumentsListContent.<anonymous> (DocumentsListScreen.kt:125)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(t70.i.S(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), f3Var, rVar, 6, 0), 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarN = t70.s.n(d1.a3.l(p114t0.n.b(w0.i.d(mVarH, aVar.a(rVar, i17).getBase().a(), null, 2, null), null, null, 3, null), d3Var), rVar, 0);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            c30.b.a studentCardAlert = documentsListScreenModel.getStudentCardAlert();
            if (studentCardAlert == null) {
                rVar.X(-1388364092);
            } else {
                rVar.X(-1388364091);
                c30.e.c(null, studentCardAlert, rVar, c30.b.a.f22953l << 3, 1);
                lh1.c documentsLayoutData = documentsListScreenModel.getDocumentsLayoutData();
                if (documentsLayoutData instanceof lh1.c.BIG) {
                    rVar.X(42415131);
                    rVar.R();
                } else {
                    if (!(documentsLayoutData instanceof lh1.c.SMALL) && !(documentsLayoutData instanceof lh1.c.LIST)) {
                        rVar.X(1109744154);
                        rVar.R();
                        throw new oq.p();
                    }
                    rVar.X(1109750375);
                    r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
                    rVar.R();
                }
            }
            rVar.R();
            lh1.c documentsLayoutData2 = documentsListScreenModel.getDocumentsLayoutData();
            if (documentsLayoutData2 instanceof lh1.c.BIG) {
                rVar.X(-598960971);
                w((lh1.c.BIG) documentsLayoutData2, d0Var, rVar, 48, 0);
                rVar.R();
            } else if (documentsLayoutData2 instanceof lh1.c.SMALL) {
                rVar.X(-598955273);
                U((lh1.c.SMALL) documentsLayoutData2, d0Var, rVar, 48, 0);
                rVar.R();
            } else {
                if (!(documentsLayoutData2 instanceof lh1.c.LIST)) {
                    rVar.X(-598963989);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(-598949551);
                K((lh1.c.LIST) documentsLayoutData2, d0Var, rVar, 48, 0);
                rVar.R();
            }
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            f3.m mVarA = l3.g0.a(companion, d0Var2);
            l3.g.Companion companion3 = l3.g.INSTANCE;
            j30.f.e(t70.i.E(t70.i.F(mVarA, companion3.h(), rVar, 0), companion3.a(), rVar, 0), documentsListScreenModel.getCustomizeButtonData(), false, rVar, ButtonTextData.f99099f << 3, 4);
            r3.a(androidx.compose.foundation.layout.d.i(companion, c5.h.n(aVar.b(rVar, i17).getSpacing600() + aVar.b(rVar, i17).getSpacing300())), rVar, 0);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N(DocumentsListScreenModel documentsListScreenModel, l3.d0 d0Var, int i15, int i16, p076m2.r rVar, int i17) {
        L(documentsListScreenModel, d0Var, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(l3.d0 d0Var, l3.v vVar) {
        vVar.f(d0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P(lh1.c.LIST list, l3.d0 d0Var, int i15, int i16, p076m2.r rVar, int i17) {
        K(list, d0Var, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0090  */
    /* JADX WARN: Code duplicated, block: B:42:0x0094  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00da  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:74:0x0114  */
    /* JADX WARN: Code duplicated, block: B:77:0x0128  */
    /* JADX WARN: Code duplicated, block: B:78:0x012c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0136  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    public static final void Q(final w wVar, l3.d0 d0Var, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        l3.d0 d0Var2;
        int i18;
        boolean z15;
        boolean z16;
        final l3.d0 d0Var3;
        d5 d5VarM;
        w.a aVarR;
        int i19;
        boolean z17;
        Object objE;
        Object objE2;
        p076m2.r rVarH = rVar.h(-1016330692);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(wVar) : rVarH.G(wVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i25 = i16 & 2;
        if (i25 == 0) {
            if ((i15 & 48) == 0) {
                d0Var2 = d0Var;
                i17 |= rVarH.W(d0Var2) ? 32 : 16;
            }
            i18 = i17;
            z15 = true;
            if ((i18 & 19) != 18) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i18 & 1)) {
                if (i25 != 0) {
                    d0Var2 = null;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-1016330692, i18, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documents.DocumentsListScreen (DocumentsListScreen.kt:81)");
                }
                d0Var3 = d0Var2;
                aVarR = R(m7.b.c(wVar.getState(), null, null, null, rVarH, 0, 7));
                if (aVarR instanceof w.a.b) {
                    rVarH.X(-1736209882);
                    x70.f.g(x70.a.b.f217282c, rVarH, x70.a.b.f217283d);
                    rVarH.R();
                } else if (aVarR instanceof w.a.Empty) {
                    rVarH.X(-1736206756);
                    X(((w.a.Empty) aVarR).getEmptyScreenData(), rVarH, BaseScaffoldData.f89350g);
                    rVarH.R();
                } else {
                    if (aVarR instanceof w.a.Initialized) {
                        rVarH.X(-1736202448);
                        L(((w.a.Initialized) aVarR).getDocumentsModel(), d0Var3, rVarH, i18 & 112, 0);
                    } else {
                        rVarH.X(2007635942);
                    }
                    rVarH.R();
                }
                i19 = i18 & 14;
                if (i19 != 4 || ((i18 & 8) != 0 && rVarH.G(wVar))) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objE = rVarH.E();
                if (z17 || objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.a() { // from class: jh1.a
                        @Override // er.a
                        public final Object a() {
                            return s.S(wVar);
                        }
                    };
                    rVarH.v(objE);
                }
                p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
                oq.i0 i0Var = oq.i0.f148189a;
                if (i19 != 4 && ((i18 & 8) == 0 || !rVarH.G(wVar))) {
                    z15 = false;
                }
                objE2 = rVarH.E();
                if (z15 || objE2 == p076m2.r.INSTANCE.a()) {
                    objE2 = new d(wVar, null);
                    rVarH.v(objE2);
                }
                Function0.d(i0Var, (er.p) objE2, rVarH, 6);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVarH.O();
                d0Var3 = d0Var2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: jh1.j
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return s.T(wVar, d0Var3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        d0Var2 = d0Var;
        i18 = i17;
        z15 = true;
        if ((i18 & 19) != 18) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (rVarH.r(z16, i18 & 1)) {
            if (i25 != 0) {
                d0Var2 = null;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-1016330692, i18, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documents.DocumentsListScreen (DocumentsListScreen.kt:81)");
            }
            d0Var3 = d0Var2;
            aVarR = R(m7.b.c(wVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarR instanceof w.a.b) {
                rVarH.X(-1736209882);
                x70.f.g(x70.a.b.f217282c, rVarH, x70.a.b.f217283d);
                rVarH.R();
            } else if (aVarR instanceof w.a.Empty) {
                rVarH.X(-1736206756);
                X(((w.a.Empty) aVarR).getEmptyScreenData(), rVarH, BaseScaffoldData.f89350g);
                rVarH.R();
            } else {
                if (aVarR instanceof w.a.Initialized) {
                    rVarH.X(-1736202448);
                    L(((w.a.Initialized) aVarR).getDocumentsModel(), d0Var3, rVarH, i18 & 112, 0);
                } else {
                    rVarH.X(2007635942);
                }
                rVarH.R();
            }
            i19 = i18 & 14;
            if (i19 != 4) {
                z17 = true;
            } else {
                z17 = true;
            }
            objE = rVarH.E();
            if (z17) {
                objE = new er.a() { // from class: jh1.a
                    @Override // er.a
                    public final Object a() {
                        return s.S(wVar);
                    }
                };
                rVarH.v(objE);
            } else {
                objE = new er.a() { // from class: jh1.a
                    @Override // er.a
                    public final Object a() {
                        return s.S(wVar);
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
            oq.i0 i0Var2 = oq.i0.f148189a;
            if (i19 != 4) {
                z15 = false;
            }
            objE2 = rVarH.E();
            if (z15) {
                objE2 = new d(wVar, null);
                rVarH.v(objE2);
            } else {
                objE2 = new d(wVar, null);
                rVarH.v(objE2);
            }
            Function0.d(i0Var2, (er.p) objE2, rVarH, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
            d0Var3 = d0Var2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: jh1.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.T(wVar, d0Var3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final w.a R(f6<? extends w.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S(w wVar) {
        wVar.d();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T(w wVar, l3.d0 d0Var, int i15, int i16, p076m2.r rVar, int i17) {
        Q(wVar, d0Var, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:47:0x012e  */
    /* JADX WARN: Code duplicated, block: B:50:0x013a  */
    /* JADX WARN: Code duplicated, block: B:51:0x013e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0179  */
    /* JADX WARN: Code duplicated, block: B:55:0x0186  */
    /* JADX WARN: Code duplicated, block: B:68:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x0204  */
    /* JADX WARN: Code duplicated, block: B:73:0x0211  */
    /* JADX WARN: Code duplicated, block: B:75:0x0234  */
    /* JADX WARN: Code duplicated, block: B:76:0x024e  */
    /* JADX WARN: Code duplicated, block: B:80:0x026c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0270  */
    /* JADX WARN: Code duplicated, block: B:84:0x0279  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    private static final void U(final lh1.c.SMALL small, l3.d0 d0Var, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        final l3.d0 d0Var2;
        int i18;
        boolean z15;
        d5 d5VarM;
        er.a<androidx.compose.ui.node.c> aVarB;
        Iterator it;
        int i19;
        f3.m.Companion companion;
        er.a<androidx.compose.ui.node.c> aVarB2;
        q3 q3Var;
        DocumentRefreshCardData documentRefreshCardData;
        f3.m mVarA;
        int i25;
        DocumentRefreshCardData documentRefreshCardData2;
        f3.m.Companion companion2;
        oq.i0 i0Var;
        p076m2.r rVarH = rVar.h(-1995508354);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(small) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i26 = i16 & 2;
        if (i26 == 0) {
            if ((i15 & 48) == 0) {
                d0Var2 = d0Var;
                i17 |= rVarH.W(d0Var2) ? 32 : 16;
            }
            i18 = 0;
            if ((i17 & 19) != 18) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i26 != 0) {
                    d0Var2 = null;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(-1995508354, i17, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documents.DocumentsSmallCardsContent (DocumentsListScreen.kt:196)");
                }
                d1.i.f fVarR = d1.i.f39152a.r(k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100());
                f3.m.Companion companion3 = f3.m.INSTANCE;
                p036e4.w0 w0VarA = d1.e0.a(fVarR, f3.c.INSTANCE.k(), rVarH, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                f3.m mVarE = f3.j.e(rVarH, companion3);
                androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion4.b();
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
                n6.i(rVarC, w0VarA, companion4.d());
                n6.i(rVarC, e0VarT, companion4.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
                n6.g(rVarC, companion4.a());
                n6.i(rVarC, mVarE, companion4.e());
                d1.i0 i0Var2 = d1.i0.f39176a;
                rVarH.X(-153793792);
                it = pq.v.b0(small.a(), 2).iterator();
                i19 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i27 = i19 + 1;
                    if (i19 < 0) {
                        pq.v.x();
                    }
                    List list = (List) next;
                    companion = f3.m.INSTANCE;
                    p036e4.w0 w0VarB = m3.b(d1.i.f39152a.j(), f3.c.INSTANCE.l(), rVarH, i18);
                    int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, i18));
                    p076m2.e0 e0VarT2 = rVarH.t();
                    f3.m mVarE2 = f3.j.e(rVarH, companion);
                    androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB2 = companion5.b();
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
                    Iterator it4 = it;
                    n6.i(rVarC2, w0VarB, companion5.d());
                    n6.i(rVarC2, e0VarT2, companion5.f());
                    n6.i(rVarC2, Integer.valueOf(iHashCode2), companion5.c());
                    n6.g(rVarC2, companion5.a());
                    n6.i(rVarC2, mVarE2, companion5.e());
                    q3Var = q3.f39261a;
                    documentRefreshCardData = (DocumentRefreshCardData) pq.v.o0(list, 0);
                    if (documentRefreshCardData == null) {
                        rVarH.X(-607350498);
                        rVarH.R();
                        i25 = 0;
                    } else {
                        rVarH.X(-607350497);
                        f3.m mVarC = p3.c(q3Var, companion, 1.0f, false, 2, null);
                        if (i19 == 0 || d0Var2 == null) {
                            rVarH.X(301370978);
                            rVarH.R();
                            mVarA = companion;
                        } else {
                            rVarH.X(301271468);
                            boolean z16 = (i17 & 112) == 32;
                            Object objE = rVarH.E();
                            if (z16 || objE == p076m2.r.INSTANCE.a()) {
                                objE = new er.l() { // from class: jh1.q
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return s.V(d0Var2, (l3.v) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            mVarA = l3.y.a(companion, (er.l) objE);
                            rVarH.R();
                        }
                        i25 = 0;
                        r20.j.d(mVarC.u(mVarA), documentRefreshCardData, rVarH, DocumentRefreshCardData.f177612i << 3, 0);
                        rVarH.R();
                    }
                    r3.a(androidx.compose.foundation.layout.d.y(companion, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100()), rVarH, i25);
                    documentRefreshCardData2 = (DocumentRefreshCardData) pq.v.o0(list, 1);
                    if (documentRefreshCardData2 == null) {
                        rVarH.X(-606853413);
                        rVarH.R();
                        companion2 = companion;
                        i0Var = null;
                    } else {
                        rVarH.X(-606853412);
                        companion2 = companion;
                        r20.j.d(p3.c(q3Var, companion2, 1.0f, false, 2, null), documentRefreshCardData2, rVarH, DocumentRefreshCardData.f177612i << 3, 0);
                        rVarH.R();
                        i0Var = oq.i0.f148189a;
                    }
                    if (i0Var == null) {
                        rVarH.X(-1543592591);
                        i18 = 0;
                        r3.a(p3.c(q3Var, companion2, 1.0f, false, 2, null), rVarH, 0);
                        rVarH.R();
                    } else {
                        i18 = 0;
                        rVarH.X(-1543597241);
                        rVarH.R();
                    }
                    rVarH.x();
                    it = it4;
                    i19 = i27;
                }
                rVarH.R();
                rVarH.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVarH.O();
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: jh1.r
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return s.W(small, d0Var2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        d0Var2 = d0Var;
        i18 = 0;
        if ((i17 & 19) != 18) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i26 != 0) {
                d0Var2 = null;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-1995508354, i17, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documents.DocumentsSmallCardsContent (DocumentsListScreen.kt:196)");
            }
            d1.i.f fVarR2 = d1.i.f39152a.r(k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100());
            f3.m.Companion companion6 = f3.m.INSTANCE;
            p036e4.w0 w0VarA2 = d1.e0.a(fVarR2, f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, companion6);
            androidx.compose.ui.node.c.Companion companion7 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion7.b();
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
            n6.i(rVarC3, w0VarA2, companion7.d());
            n6.i(rVarC3, e0VarT3, companion7.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion7.c());
            n6.g(rVarC3, companion7.a());
            n6.i(rVarC3, mVarE3, companion7.e());
            d1.i0 i0Var3 = d1.i0.f39176a;
            rVarH.X(-153793792);
            it = pq.v.b0(small.a(), 2).iterator();
            i19 = 0;
            while (it.hasNext()) {
                Object next2 = it.next();
                int i28 = i19 + 1;
                if (i19 < 0) {
                    pq.v.x();
                }
                List list2 = (List) next2;
                companion = f3.m.INSTANCE;
                p036e4.w0 w0VarB2 = m3.b(d1.i.f39152a.j(), f3.c.INSTANCE.l(), rVarH, i18);
                int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, i18));
                p076m2.e0 e0VarT4 = rVarH.t();
                f3.m mVarE4 = f3.j.e(rVarH, companion);
                androidx.compose.ui.node.c.Companion companion8 = androidx.compose.ui.node.c.INSTANCE;
                aVarB2 = companion8.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB2);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC4 = n6.c(rVarH);
                Iterator it5 = it;
                n6.i(rVarC4, w0VarB2, companion8.d());
                n6.i(rVarC4, e0VarT4, companion8.f());
                n6.i(rVarC4, Integer.valueOf(iHashCode4), companion8.c());
                n6.g(rVarC4, companion8.a());
                n6.i(rVarC4, mVarE4, companion8.e());
                q3Var = q3.f39261a;
                documentRefreshCardData = (DocumentRefreshCardData) pq.v.o0(list2, 0);
                if (documentRefreshCardData == null) {
                    rVarH.X(-607350498);
                    rVarH.R();
                    i25 = 0;
                } else {
                    rVarH.X(-607350497);
                    f3.m mVarC2 = p3.c(q3Var, companion, 1.0f, false, 2, null);
                    if (i19 == 0) {
                        rVarH.X(301370978);
                        rVarH.R();
                        mVarA = companion;
                    } else {
                        rVarH.X(301370978);
                        rVarH.R();
                        mVarA = companion;
                    }
                    i25 = 0;
                    r20.j.d(mVarC2.u(mVarA), documentRefreshCardData, rVarH, DocumentRefreshCardData.f177612i << 3, 0);
                    rVarH.R();
                }
                r3.a(androidx.compose.foundation.layout.d.y(companion, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100()), rVarH, i25);
                documentRefreshCardData2 = (DocumentRefreshCardData) pq.v.o0(list2, 1);
                if (documentRefreshCardData2 == null) {
                    rVarH.X(-606853413);
                    rVarH.R();
                    companion2 = companion;
                    i0Var = null;
                } else {
                    rVarH.X(-606853412);
                    companion2 = companion;
                    r20.j.d(p3.c(q3Var, companion2, 1.0f, false, 2, null), documentRefreshCardData2, rVarH, DocumentRefreshCardData.f177612i << 3, 0);
                    rVarH.R();
                    i0Var = oq.i0.f148189a;
                }
                if (i0Var == null) {
                    rVarH.X(-1543592591);
                    i18 = 0;
                    r3.a(p3.c(q3Var, companion2, 1.0f, false, 2, null), rVarH, 0);
                    rVarH.R();
                } else {
                    i18 = 0;
                    rVarH.X(-1543597241);
                    rVarH.R();
                }
                rVarH.x();
                it = it5;
                i19 = i28;
            }
            rVarH.R();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: jh1.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.W(small, d0Var2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V(l3.d0 d0Var, l3.v vVar) {
        vVar.f(d0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W(lh1.c.SMALL small, l3.d0 d0Var, int i15, int i16, p076m2.r rVar, int i17) {
        U(small, d0Var, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    public static final void X(final DocumentsEmptyScreenData documentsEmptyScreenData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(335057716);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(documentsEmptyScreenData) : rVarH.G(documentsEmptyScreenData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(335057716, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documents.EmptyScreen (DocumentsListScreen.kt:226)");
            }
            rVar2 = rVarH;
            i50.s.r(documentsEmptyScreenData.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1069991455, true, new er.q() { // from class: jh1.m
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return s.Y(documentsEmptyScreenData, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196992, 28670);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: jh1.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.Z(documentsEmptyScreenData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y(DocumentsEmptyScreenData documentsEmptyScreenData, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1069991455, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documents.EmptyScreen.<anonymous> (DocumentsListScreen.kt:231)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(d1.a3.l(companion, d3Var), 0.0f, 1, null), null, rVar, 0, 1);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = d1.a3.r(d1.a3.p(d1.a3.r(mVarS, 0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, 0.0f, 13, null), aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, i50.s.N(), 7, null);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            j70.h.g(null, null, documentsEmptyScreenData.getTitle(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).k(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, documentsEmptyScreenData.getDescriptionFirst(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            j70.h.g(null, null, documentsEmptyScreenData.getSubtitle(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, documentsEmptyScreenData.getDescriptionSecond(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z(DocumentsEmptyScreenData documentsEmptyScreenData, int i15, p076m2.r rVar, int i16) {
        X(documentsEmptyScreenData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void s(f3.m mVar, final DocumentRefreshCardData documentRefreshCardData, final er.a<oq.i0> aVar, final er.a<oq.i0> aVar2, final er.a<oq.i0> aVar3, final boolean z15, final boolean z16, final boolean z17, p076m2.r rVar, final int i15, final int i16) {
        f3.m mVar2;
        int i17;
        p076m2.r rVar2;
        final f3.m mVar3;
        p076m2.r rVarH = rVar.h(1378151331);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i17 = (rVarH.W(mVar2) ? 4 : 2) | i15;
        } else {
            mVar2 = mVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= (i15 & 64) == 0 ? rVarH.W(documentRefreshCardData) : rVarH.G(documentRefreshCardData) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.G(aVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= rVarH.G(aVar2) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i17 |= rVarH.G(aVar3) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i17 |= rVarH.a(z15) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((1572864 & i15) == 0) {
            i17 |= rVarH.a(z16) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i15) == 0) {
            i17 |= rVarH.a(z17) ? 8388608 : 4194304;
        }
        if (rVarH.r((4793491 & i17) != 4793490, i17 & 1)) {
            f3.m mVar4 = i18 != 0 ? f3.m.INSTANCE : mVar2;
            if (p076m2.t.k()) {
                p076m2.t.o(1378151331, i17, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documents.BigCardData (DocumentsListScreen.kt:351)");
            }
            int i19 = i17;
            f3.m mVar5 = mVar4;
            final f6<c5.n> f6VarF = u0.f.f(z15 ? c5.n.d((((long) 0) << 32) | (((long) (-45)) & BodyPartID.bodyIdMax)) : c5.n.INSTANCE.b(), u0.m.l(300, 0, null, 6, null), null, null, rVarH, 48, 12);
            boolean zW = rVarH.W(f6VarF);
            Object objE = rVarH.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: jh1.h
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s.u(f6VarF, (c5.d) obj);
                    }
                };
                rVarH.v(objE);
            }
            boolean z18 = false;
            rVar2 = rVarH;
            r20.f.d(o2.c(mVar5, (er.l) objE), DocumentRefreshCardData.b(documentRefreshCardData, null, null, null, null, null, (z16 || z15) ? documentRefreshCardData.f() : aVar2, aVar, null, 159, null), rVar2, DocumentRefreshCardData.f177612i << 3, 0);
            Boolean boolValueOf = Boolean.valueOf(z17);
            boolean z19 = (i19 & 29360128) == 8388608;
            if ((i19 & 57344) == 16384) {
                z18 = true;
            }
            boolean z25 = z19 | z18;
            Object objE2 = rVar2.E();
            if (z25 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new a(z17, aVar3, null);
                rVar2.v(objE2);
            }
            Function0.d(boolValueOf, (er.p) objE2, rVar2, (i19 >> 21) & 14);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            mVar3 = mVar5;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            mVar3 = mVar2;
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: jh1.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.v(mVar3, documentRefreshCardData, aVar, aVar2, aVar3, z15, z16, z17, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final long t(f6<c5.n> f6Var) {
        return f6Var.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5.n u(f6 f6Var, c5.d dVar) {
        return c5.n.c(t(f6Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(f3.m mVar, DocumentRefreshCardData documentRefreshCardData, er.a aVar, er.a aVar2, er.a aVar3, boolean z15, boolean z16, boolean z17, int i15, int i16, p076m2.r rVar, int i17) {
        s(mVar, documentRefreshCardData, aVar, aVar2, aVar3, z15, z16, z17, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    @SuppressLint({"UnusedBoxWithConstraintsScope"})
    public static final void w(final lh1.c.BIG big, final l3.d0 d0Var, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        p076m2.r rVarH = rVar.h(40126768);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(big) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= rVarH.W(d0Var) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            if (i18 != 0) {
                d0Var = null;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(40126768, i17, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documents.DocumentsBigCardsContent (DocumentsListScreen.kt:273)");
            }
            final f6<c5.h> f6VarD = u0.f.d(big.getShouldPlayEnterAnimation() ? f102919b : c5.h.n(0), u0.m.l(1000, 0, null, 6, null), null, null, rVarH, 48, 12);
            oq.i0 i0Var = oq.i0.f148189a;
            boolean zG = rVarH.G(big);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new b(big, null);
                rVarH.v(objE);
            }
            Function0.d(i0Var, (er.p) objE, rVarH, 6);
            d1.b0.d(null, null, false, y2.m.d(1732482202, true, new er.q() { // from class: jh1.o
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return s.y(big, f6VarD, d0Var, (d1.c0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 3072, 7);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: jh1.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.J(big, d0Var, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float x(f6<c5.h> f6Var) {
        return f6Var.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final oq.i0 y(final lh1.c.BIG big, f6 f6Var, final l3.d0 d0Var, d1.c0 c0Var, p076m2.r rVar, int i15) {
        d1.c0 c0Var2;
        int i16;
        f3.m mVarA;
        p076m2.r rVar2 = rVar;
        if ((i15 & 6) == 0) {
            c0Var2 = c0Var;
            i16 = i15 | (rVar2.W(c0Var2) ? 4 : 2);
        } else {
            c0Var2 = c0Var;
            i16 = i15;
        }
        if (rVar2.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1732482202, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documents.DocumentsBigCardsContent.<anonymous> (DocumentsListScreen.kt:284)");
            }
            float fN = c5.h.n((float) (((double) c0Var2.a()) * 0.65d * (-0.7d)));
            boolean zC = rVar2.c(big.getBigCardsState().ordinal());
            Object objE = rVar2.E();
            if (zC || objE == p076m2.r.INSTANCE.a()) {
                int i17 = e.f102929a[big.getBigCardsState().ordinal()];
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new oq.p();
                    }
                    fN = f102918a;
                }
                objE = c6.e(c5.h.j(fN), null, 2, null);
                rVar2.v(objE);
            }
            f6<c5.h> f6VarD = u0.f.d(z((a3) objE), u0.m.l(500, 0, null, 6, null), null, null, rVar2, 48, 12);
            boolean zB = rVar2.b(E(f6VarD));
            Object objE2 = rVar2.E();
            if (zB || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = d1.i.f39152a.r(E(f6VarD));
                rVar2.v(objE2);
            }
            d1.i.f fVar = (d1.i.f) objE2;
            Object objE3 = rVar2.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE3 == companion.a()) {
                objE3 = c6.e(null, null, 2, null);
                rVar2.v(objE3);
            }
            final a3 a3Var = (a3) objE3;
            Object objE4 = rVar2.E();
            if (objE4 == companion.a()) {
                objE4 = c6.e(null, null, 2, null);
                rVar2.v(objE4);
            }
            final a3 a3Var2 = (a3) objE4;
            f3.m mVarR = d1.a3.r(d1.a3.p(f3.m.INSTANCE, 0.0f, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing200(), 1, null), 0.0f, x(f6Var), 0.0f, 0.0f, 13, null);
            p036e4.w0 w0VarA = d1.e0.a(fVar, f3.c.INSTANCE.k(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarR);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC = n6.c(rVar2);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            rVar2.X(-1357522656);
            final int i18 = 0;
            for (Object obj : big.c()) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    pq.v.x();
                }
                final DocumentRefreshCardData documentRefreshCardData = (DocumentRefreshCardData) obj;
                if (i18 != 0 || d0Var == null) {
                    rVar2.X(920972233);
                    rVar2.R();
                    mVarA = f3.m.INSTANCE;
                } else {
                    rVar2.X(920880659);
                    f3.m.Companion companion3 = f3.m.INSTANCE;
                    boolean zW = rVar2.W(d0Var);
                    Object objE5 = rVar2.E();
                    if (zW || objE5 == p076m2.r.INSTANCE.a()) {
                        objE5 = new er.l() { // from class: jh1.d
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return s.A(d0Var, (l3.v) obj2);
                            }
                        };
                        rVar2.v(objE5);
                    }
                    mVarA = l3.y.a(companion3, (er.l) objE5);
                    rVar2.R();
                }
                boolean zG = rVar2.G(big);
                Object objE6 = rVar2.E();
                if (zG || objE6 == p076m2.r.INSTANCE.a()) {
                    objE6 = new er.a() { // from class: jh1.e
                        @Override // er.a
                        public final Object a() {
                            return s.B(big, a3Var);
                        }
                    };
                    rVar2.v(objE6);
                }
                er.a aVar = (er.a) objE6;
                boolean zC2 = rVar2.c(i18);
                Object objE7 = rVar2.E();
                if (zC2 || objE7 == p076m2.r.INSTANCE.a()) {
                    objE7 = new er.a() { // from class: jh1.f
                        @Override // er.a
                        public final Object a() {
                            return s.C(i18, a3Var, a3Var2);
                        }
                    };
                    rVar2.v(objE7);
                }
                er.a aVar2 = (er.a) objE7;
                boolean zG2 = rVar2.G(documentRefreshCardData);
                Object objE8 = rVar2.E();
                if (zG2 || objE8 == p076m2.r.INSTANCE.a()) {
                    objE8 = new er.a() { // from class: jh1.g
                        @Override // er.a
                        public final Object a() {
                            return s.D(documentRefreshCardData, a3Var2);
                        }
                    };
                    rVar2.v(objE8);
                }
                er.a aVar3 = (er.a) objE8;
                Integer numF = F(a3Var);
                boolean z15 = numF != null && numF.intValue() == i18;
                boolean z16 = big.getBigCardsState() == lh1.a.EXPANDED;
                Integer numH = H(a3Var2);
                s(mVarA, documentRefreshCardData, aVar, aVar2, aVar3, z15, z16, numH != null && numH.intValue() == i18, rVar2, DocumentRefreshCardData.f177612i << 3, 0);
                rVar2 = rVar;
                i18 = i19;
                a3Var2 = a3Var2;
            }
            rVar.R();
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    private static final float z(a3<c5.h> a3Var) {
        return a3Var.getValue().getValue();
    }
}
