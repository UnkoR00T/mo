package p012a2;

import androidx.compose.ui.platform.g1;
import b3.f;
import b3.x;
import c5.b;
import c5.h;
import c5.y;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import er.l;
import er.p;
import er.q;
import f3.j;
import f3.m;
import java.util.ArrayList;
import java.util.List;
import ju.p0;
import n3.y2;
import n4.f0;
import n4.i0;
import oq.r;
import oq.u;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.a2;
import p036e4.c1;
import p036e4.e1;
import p036e4.j0;
import p036e4.v0;
import p036e4.w0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;
import pq.v;
import vq.k;
import z3.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a=\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aß\u0001\u0010*\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u00052\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020 2\b\b\u0002\u0010&\u001a\u00020\"2\b\b\u0002\u0010'\u001a\u00020\"2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00120\u0005H\u0007¢\u0006\u0004\b*\u0010+\u001ae\u0010-\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020 2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0005H\u0003¢\u0006\u0004\b-\u0010.\u001a\u007f\u00103\u001a\u00020\u00122\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120\u00172\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00120\u00172\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00172\u0006\u0010%\u001a\u00020 2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\bH\u0003¢\u0006\u0004\b3\u00104\u001a#\u00109\u001a\u0002082\n\u0010,\u001a\u0006\u0012\u0002\b\u0003052\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b9\u0010:\"\u0014\u0010=\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<\"\u0014\u0010?\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<\"\u0014\u0010A\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010<¨\u0006B"}, d2 = {"La2/q0;", "initialValue", "Lu0/l;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmStateChange", "La2/p0;", "M", "(La2/q0;Lu0/l;Ler/l;Lm2/r;II)La2/p0;", "bottomSheetState", "La2/i4;", "snackbarHostState", "La2/k0;", i.f37094u, "(La2/p0;La2/i4;Lm2/r;II)La2/k0;", "Ld1/h0;", "Loq/i0;", "sheetContent", "Lf3/m;", "modifier", "scaffoldState", "Lkotlin/Function0;", "topBar", "snackbarHost", "floatingActionButton", "La2/c2;", "floatingActionButtonPosition", "sheetGesturesEnabled", "Ln3/y2;", "sheetShape", "Lc5/h;", "sheetElevation", "Landroidx/compose/ui/graphics/Color;", "sheetBackgroundColor", "sheetContentColor", "sheetPeekHeight", "backgroundColor", "contentColor", "Ld1/d3;", "content", "r", "(Ler/q;Lf3/m;La2/k0;Ler/p;Ler/q;Ler/p;IZLn3/y2;FJJFJJLer/q;Lm2/r;III)V", "state", "q", "(La2/p0;ZLn3/y2;FJJFLf3/m;Ler/q;Lm2/r;II)V", "body", "bottomSheet", "sheetOffset", "sheetState", "s", "(Ler/p;Ler/p;Ler/p;Ler/p;Ler/p;FLer/a;ILa2/p0;Lm2/r;I)V", "La2/i;", "Lz0/a2;", "orientation", "Lz3/a;", i.f37087n, "(La2/i;Lz0/a2;)Lz3/a;", "a", "F", "FabSpacing", "b", "BottomSheetScaffoldPositionalThreshold", "c", "BottomSheetScaffoldVelocityThreshold", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f1673a = h.n(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f1674b = h.n(56);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f1675c = h.n(125);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class a extends k implements p<p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1676e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p0 f1677f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p0 p0Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f1677f = p0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f1676e;
            if (i15 == 0) {
                u.b(obj);
                p0 p0Var = this.f1677f;
                this.f1676e = 1;
                if (p0Var.f(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f1677f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class b extends k implements p<p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1678e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p0 f1679f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p0 p0Var, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f1679f = p0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f1678e;
            if (i15 == 0) {
                u.b(obj);
                p0 p0Var = this.f1679f;
                this.f1678e = 1;
                if (p0Var.e(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f1679f, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c implements c1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.a<Float> f1680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f1682c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p0 f1683d;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f1684a;

            static {
                int[] iArr = new int[q0.values().length];
                try {
                    iArr[q0.Collapsed.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[q0.Expanded.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f1684a = iArr;
            }
        }

        c(er.a<Float> aVar, int i15, float f15, p0 p0Var) {
            this.f1680a = aVar;
            this.f1681b = i15;
            this.f1682c = f15;
            this.f1683d = p0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 b(er.a aVar, int i15, y0 y0Var, int i16, int i17, float f15, int i18, int i19, p0 p0Var, int i25, int i26, List list, List list2, List list3, List list4, List list5, int i27, a2.a aVar2) {
            int i28;
            int iD = hr.a.d(((Number) aVar.a()).floatValue());
            c2.Companion companion = c2.INSTANCE;
            int iX0 = c2.e(i15, companion.c()) ? y0Var.X0(i0.f1673a) : c2.e(i15, companion.a()) ? (i16 - i17) / 2 : (i16 - i17) - y0Var.X0(i0.f1673a);
            int i29 = i18 / 2;
            int iX1 = y0Var.l2(f15) < ((float) i29) ? (iD - i18) - y0Var.X0(i0.f1673a) : iD - i29;
            int i35 = (i16 - i19) / 2;
            int i36 = a.f1684a[p0Var.h().ordinal()];
            if (i36 == 1) {
                i28 = iX1 - i25;
            } else {
                if (i36 != 2) {
                    throw new oq.p();
                }
                i28 = i26 - i25;
            }
            int size = list.size();
            for (int i37 = 0; i37 < size; i37++) {
                a2.a.I(aVar2, (a2) list.get(i37), 0, i27, 0.0f, 4, null);
            }
            int size2 = list2.size();
            for (int i38 = 0; i38 < size2; i38++) {
                a2.a.I(aVar2, (a2) list2.get(i38), 0, 0, 0.0f, 4, null);
            }
            int size3 = list3.size();
            for (int i39 = 0; i39 < size3; i39++) {
                a2.a.I(aVar2, (a2) list3.get(i39), 0, 0, 0.0f, 4, null);
            }
            int size4 = list4.size();
            for (int i45 = 0; i45 < size4; i45++) {
                a2.a.I(aVar2, (a2) list4.get(i45), iX0, iX1, 0.0f, 4, null);
            }
            int size5 = list5.size();
            for (int i46 = 0; i46 < size5; i46++) {
                a2.a.I(aVar2, (a2) list5.get(i46), i35, i28, 0.0f, 4, null);
            }
            return oq.i0.f148189a;
        }

        @Override // p036e4.c1
        public final x0 e(final y0 y0Var, List<? extends List<? extends v0>> list, long j15) {
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4;
            int height;
            Object obj5;
            List<? extends v0> list2 = list.get(0);
            List<? extends v0> list3 = list.get(1);
            List<? extends v0> list4 = list.get(2);
            List<? extends v0> list5 = list.get(3);
            List<? extends v0> list6 = list.get(4);
            final int iL = c5.b.l(j15);
            final int iK = c5.b.k(j15);
            long jD = c5.b.d(j15, 0, 0, 0, 0, 10, null);
            final ArrayList arrayList = new ArrayList(list4.size());
            int size = list4.size();
            for (int i15 = 0; i15 < size; i15++) {
                arrayList.add(list4.get(i15).o0(jD));
            }
            final ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i16 = 0; i16 < size2; i16++) {
                arrayList2.add(list2.get(i16).o0(jD));
            }
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(0);
                int height2 = ((a2) obj).getHeight();
                int iP = v.p(arrayList2);
                if (1 <= iP) {
                    int i17 = 1;
                    while (true) {
                        Object obj6 = arrayList2.get(i17);
                        int height3 = ((a2) obj6).getHeight();
                        if (height2 < height3) {
                            height2 = height3;
                            obj = obj6;
                        }
                        if (i17 == iP) {
                            break;
                        }
                        i17++;
                    }
                }
            } else {
                obj = null;
            }
            a2 a2Var = (a2) obj;
            final int height4 = a2Var != null ? a2Var.getHeight() : 0;
            long jD2 = c5.b.d(jD, 0, 0, 0, iK - height4, 7, null);
            final ArrayList arrayList3 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i18 = 0; i18 < size3; i18++) {
                arrayList3.add(list3.get(i18).o0(jD2));
            }
            final ArrayList arrayList4 = new ArrayList(list5.size());
            int size4 = list5.size();
            for (int i19 = 0; i19 < size4; i19++) {
                arrayList4.add(list5.get(i19).o0(jD));
            }
            if (!arrayList4.isEmpty()) {
                obj2 = arrayList4.get(0);
                int width = ((a2) obj2).getWidth();
                int iP2 = v.p(arrayList4);
                if (1 <= iP2) {
                    int i25 = 1;
                    while (true) {
                        Object obj7 = arrayList4.get(i25);
                        int width2 = ((a2) obj7).getWidth();
                        if (width < width2) {
                            obj2 = obj7;
                            width = width2;
                        }
                        if (i25 == iP2) {
                            break;
                        }
                        i25++;
                    }
                }
            } else {
                obj2 = null;
            }
            a2 a2Var2 = (a2) obj2;
            int width3 = a2Var2 != null ? a2Var2.getWidth() : 0;
            if (!arrayList4.isEmpty()) {
                obj3 = arrayList4.get(0);
                int height5 = ((a2) obj3).getHeight();
                int iP3 = v.p(arrayList4);
                if (1 <= iP3) {
                    int i26 = 1;
                    while (true) {
                        Object obj8 = arrayList4.get(i26);
                        int height6 = ((a2) obj8).getHeight();
                        if (height5 < height6) {
                            height5 = height6;
                            obj3 = obj8;
                        }
                        if (i26 == iP3) {
                            break;
                        }
                        i26++;
                    }
                }
            } else {
                obj3 = null;
            }
            a2 a2Var3 = (a2) obj3;
            final int height7 = a2Var3 != null ? a2Var3.getHeight() : 0;
            final ArrayList arrayList5 = new ArrayList(list6.size());
            int size5 = list6.size();
            for (int i27 = 0; i27 < size5; i27++) {
                arrayList5.add(list6.get(i27).o0(jD));
            }
            if (!arrayList5.isEmpty()) {
                obj4 = arrayList5.get(0);
                int width4 = ((a2) obj4).getWidth();
                int iP4 = v.p(arrayList5);
                if (1 <= iP4) {
                    int i28 = 1;
                    while (true) {
                        Object obj9 = arrayList5.get(i28);
                        int width5 = ((a2) obj9).getWidth();
                        if (width4 < width5) {
                            obj4 = obj9;
                            width4 = width5;
                        }
                        if (i28 == iP4) {
                            break;
                        }
                        i28++;
                    }
                }
            } else {
                obj4 = null;
            }
            a2 a2Var4 = (a2) obj4;
            final int width6 = a2Var4 != null ? a2Var4.getWidth() : 0;
            if (arrayList5.isEmpty()) {
                height = 0;
                obj5 = null;
            } else {
                height = 0;
                Object obj10 = arrayList5.get(0);
                int height8 = ((a2) obj10).getHeight();
                int iP5 = v.p(arrayList5);
                int i29 = 1;
                if (1 <= iP5) {
                    while (true) {
                        Object obj11 = arrayList5.get(i29);
                        int height9 = ((a2) obj11).getHeight();
                        if (height8 < height9) {
                            obj10 = obj11;
                            height8 = height9;
                        }
                        if (i29 == iP5) {
                            break;
                        }
                        i29++;
                    }
                }
                obj5 = obj10;
            }
            a2 a2Var5 = (a2) obj5;
            if (a2Var5 != null) {
                height = a2Var5.getHeight();
            }
            final int i35 = height;
            final er.a<Float> aVar = this.f1680a;
            final int i36 = this.f1681b;
            final float f15 = this.f1682c;
            final p0 p0Var = this.f1683d;
            final int i37 = width3;
            return y0.j2(y0Var, iL, iK, null, new l() { // from class: a2.j0
                @Override // er.l
                public final Object b(Object obj12) {
                    return i0.c.b(aVar, i36, y0Var, iL, i37, f15, height7, width6, p0Var, i35, iK, arrayList3, arrayList2, arrayList, arrayList4, arrayList5, height4, (a2.a) obj12);
                }
            }, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0002*\u00020\u0006H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0002*\u00020\u0003H\u0003¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"a2/i0$d", "Lz3/a;", "", "Lm3/e;", "b", "(F)J", "Lc5/y;", "c", "(J)F", "a", "available", "Lz3/g;", "source", "h2", "(JI)J", "consumed", "d1", "(JJI)J", "r2", "(JLtq/e;)Ljava/lang/Object;", "W0", "(JJLtq/e;)Ljava/lang/Object;", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements z3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i<?> f1685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p143z0.a2 f1686b;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            long f1687d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f1688e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f1690g;

            a(tq.e<? super a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f1688e = obj;
                this.f1690g |= PKIFailureInfo.systemUnavail;
                return d.this.W0(0L, 0L, this);
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            long f1691d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f1692e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f1694g;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f1692e = obj;
                this.f1694g |= PKIFailureInfo.systemUnavail;
                return d.this.r2(0L, this);
            }
        }

        d(i<?> iVar, p143z0.a2 a2Var) {
            this.f1685a = iVar;
            this.f1686b = a2Var;
        }

        private final float a(long j15) {
            return Float.intBitsToFloat((int) (this.f1686b == p143z0.a2.Horizontal ? j15 >> 32 : j15 & BodyPartID.bodyIdMax));
        }

        private final long b(float f15) {
            p143z0.a2 a2Var = this.f1686b;
            float f16 = a2Var == p143z0.a2.Horizontal ? f15 : 0.0f;
            if (a2Var != p143z0.a2.Vertical) {
                f15 = 0.0f;
            }
            return m3.e.e((((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f15)) & BodyPartID.bodyIdMax));
        }

        private final float c(long j15) {
            return this.f1686b == p143z0.a2.Horizontal ? y.h(j15) : y.i(j15);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // z3.a
        public Object W0(long j15, long j16, tq.e<? super y> eVar) throws Throwable {
            a aVar;
            if (eVar instanceof a) {
                aVar = (a) eVar;
                int i15 = aVar.f1690g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar.f1690g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar = new a(eVar);
                }
            } else {
                aVar = new a(eVar);
            }
            Object obj = aVar.f1688e;
            Object objE = uq.b.e();
            int i16 = aVar.f1690g;
            if (i16 == 0) {
                u.b(obj);
                i<?> iVar = this.f1685a;
                float fC = c(j16);
                aVar.f1687d = j16;
                aVar.f1690g = 1;
                if (iVar.I(fC, aVar) == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j16 = aVar.f1687d;
                u.b(obj);
            }
            return y.b(j16);
        }

        @Override // z3.a
        public long d1(long consumed, long available, int source) {
            return g.d(source, g.INSTANCE.b()) ? b(this.f1685a.o(a(available))) : m3.e.INSTANCE.c();
        }

        @Override // z3.a
        public long h2(long available, int source) {
            float fA = a(available);
            return (fA >= 0.0f || !g.d(source, g.INSTANCE.b())) ? m3.e.INSTANCE.c() : b(this.f1685a.o(fA));
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // z3.a
        public Object r2(long j15, tq.e<? super y> eVar) throws Throwable {
            b bVar;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f1694g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f1694g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object obj = bVar.f1692e;
            Object objE = uq.b.e();
            int i16 = bVar.f1694g;
            if (i16 == 0) {
                u.b(obj);
                float fC = c(j15);
                float fC2 = this.f1685a.C();
                if (fC >= 0.0f || fC2 <= this.f1685a.p().e()) {
                    j15 = y.INSTANCE.a();
                } else {
                    i<?> iVar = this.f1685a;
                    bVar.f1691d = j15;
                    bVar.f1694g = 1;
                    if (iVar.I(fC, bVar) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j15 = bVar.f1691d;
                u.b(obj);
            }
            return y.b(j15);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1695a;

        static {
            int[] iArr = new int[q0.values().length];
            try {
                iArr[q0.Collapsed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q0.Expanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f1695a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r A(p0 p0Var, final float f15, c5.r rVar, c5.b bVar) {
        q0 q0Var;
        final int iK = c5.b.k(bVar.getValue());
        final float packedValue = (int) (rVar.getPackedValue() & BodyPartID.bodyIdMax);
        r1 r1VarA = p012a2.c.a(new l() { // from class: a2.y
            @Override // er.l
            public final Object b(Object obj) {
                return i0.B(iK, f15, packedValue, (s1) obj);
            }
        });
        int i15 = e.f1695a[p0Var.g().y().ordinal()];
        if (i15 == 1) {
            q0Var = q0.Collapsed;
        } else {
            if (i15 != 2) {
                throw new oq.p();
            }
            q0Var = q0.Expanded;
            if (!r1VarA.d(q0Var)) {
                q0Var = q0.Collapsed;
            }
        }
        return oq.y.a(r1VarA, q0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(int i15, float f15, float f16, s1 s1Var) {
        float f17 = i15;
        s1Var.a(q0.Collapsed, f17 - f15);
        if (f16 > 0.0f && f16 != f15) {
            s1Var.a(q0.Expanded, f17 - f16);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(final p0 p0Var, final p0 p0Var2, n4.i0 i0Var) {
        if (p0Var.g().p().getSize() > 1) {
            if (p0Var.i()) {
                f0.o(i0Var, null, new er.a() { // from class: a2.w
                    @Override // er.a
                    public final Object a() {
                        return Boolean.valueOf(i0.D(p0Var, p0Var2));
                    }
                }, 1, null);
            } else {
                f0.d(i0Var, null, new er.a() { // from class: a2.x
                    @Override // er.a
                    public final Object a() {
                        return Boolean.valueOf(i0.E(p0Var, p0Var2));
                    }
                }, 1, null);
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D(p0 p0Var, p0 p0Var2) {
        if (!p0Var.g().s().b(q0.Expanded).booleanValue()) {
            return true;
        }
        ju.k.d(p0Var2, null, null, new a(p0Var, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E(p0 p0Var, p0 p0Var2) {
        if (!p0Var.g().s().b(q0.Collapsed).booleanValue()) {
            return true;
        }
        ju.k.d(p0Var2, null, null, new b(p0Var, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(q qVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1065607095, i15, -1, "androidx.compose.material.BottomSheet.<anonymous> (BottomSheetScaffold.kt:440)");
            }
            m.Companion companion = m.INSTANCE;
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iA = p076m2.m.a(rVar, 0);
            p076m2.e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, companion);
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
            n6.i(rVarC, w0VarA, aVar.d());
            n6.i(rVarC, e0VarT, aVar.f());
            p<androidx.compose.ui.node.c, Integer, oq.i0> pVarC = aVar.c();
            if (rVarC.getInserting() || !fr.t.c(rVarC.E(), Integer.valueOf(iA))) {
                rVarC.v(Integer.valueOf(iA));
                rVarC.j(Integer.valueOf(iA), pVarC);
            }
            n6.i(rVarC, mVarE, aVar.e());
            qVar.w(d1.i0.f39176a, rVar, 6);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G(p0 p0Var, boolean z15, y2 y2Var, float f15, long j15, long j16, float f16, m mVar, q qVar, int i15, int i16, p076m2.r rVar, int i17) {
        q(p0Var, z15, y2Var, f15, j15, j16, f16, mVar, qVar, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final z3.a H(i<?> iVar, p143z0.a2 a2Var) {
        return new d(iVar, a2Var);
    }

    public static final k0 L(p0 p0Var, i4 i4Var, p076m2.r rVar, int i15, int i16) {
        p076m2.r rVar2;
        if ((i16 & 1) != 0) {
            rVar2 = rVar;
            p0Var = M(q0.Collapsed, null, null, rVar2, 6, 6);
        } else {
            rVar2 = rVar;
        }
        if ((i16 & 2) != 0) {
            Object objE = rVar2.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new i4();
                rVar2.v(objE);
            }
            i4Var = (i4) objE;
        }
        if (t.k()) {
            t.o(-1022285988, i15, -1, "androidx.compose.material.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:266)");
        }
        boolean z15 = ((((i15 & 14) ^ 6) > 4 && rVar2.W(p0Var)) || (i15 & 6) == 4) | ((((i15 & 112) ^ 48) > 32 && rVar2.W(i4Var)) || (i15 & 48) == 32);
        Object objE2 = rVar2.E();
        if (z15 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new k0(p0Var, i4Var);
            rVar2.v(objE2);
        }
        k0 k0Var = (k0) objE2;
        if (t.k()) {
            t.n();
        }
        return k0Var;
    }

    public static final p0 M(final q0 q0Var, final u0.l<Float> lVar, final l<? super q0, Boolean> lVar2, p076m2.r rVar, int i15, int i16) {
        if ((i16 & 2) != 0) {
            lVar = r.f1893a.a();
        }
        if ((i16 & 4) != 0) {
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new l() { // from class: a2.s
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Boolean.valueOf(i0.N((q0) obj));
                    }
                };
                rVar.v(objE);
            }
            lVar2 = (l) objE;
        }
        if (t.k()) {
            t.o(1808153344, i15, -1, "androidx.compose.material.rememberBottomSheetState (BottomSheetScaffold.kt:224)");
        }
        final c5.d dVar = (c5.d) rVar.N(g1.f());
        Object[] objArr = {lVar};
        x<p0, ?> xVarC = p0.INSTANCE.c(lVar, lVar2, dVar);
        boolean z15 = true;
        boolean zW = ((((i15 & 14) ^ 6) > 4 && rVar.c(q0Var.ordinal())) || (i15 & 6) == 4) | rVar.W(dVar) | rVar.G(lVar);
        if ((((i15 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 || !rVar.W(lVar2)) && (i15 & MLKEMEngine.KyberPolyBytes) != 256) {
            z15 = false;
        }
        boolean z16 = zW | z15;
        Object objE2 = rVar.E();
        if (z16 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.a() { // from class: a2.z
                @Override // er.a
                public final Object a() {
                    return i0.O(q0Var, dVar, lVar, lVar2);
                }
            };
            rVar.v(objE2);
        }
        p0 p0Var = (p0) f.i(objArr, xVarC, (er.a) objE2, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return p0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean N(q0 q0Var) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p0 O(q0 q0Var, c5.d dVar, u0.l lVar, l lVar2) {
        return new p0(q0Var, dVar, lVar, lVar2);
    }

    private static final void q(final p0 p0Var, final boolean z15, final y2 y2Var, final float f15, final long j15, final long j16, final float f16, m mVar, final q<? super h0, ? super p076m2.r, ? super Integer, oq.i0> qVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        int i18;
        m mVar2;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-426833549);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(p0Var) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.a(z15) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.W(y2Var) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= rVarH.b(f15) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i17 |= rVarH.d(j15) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i17 |= rVarH.d(j16) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((i15 & 1572864) == 0) {
            i17 |= rVarH.b(f16) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        int i19 = i16 & 128;
        if (i19 != 0) {
            i17 |= 12582912;
            i18 = 1572864;
            mVar2 = mVar;
        } else {
            i18 = 1572864;
            mVar2 = mVar;
            if ((i15 & 12582912) == 0) {
                i17 |= rVarH.W(mVar2) ? 8388608 : 4194304;
            }
        }
        if ((i15 & 100663296) == 0) {
            i17 |= rVarH.G(qVar) ? 67108864 : 33554432;
        }
        if (rVarH.r((i17 & 38347923) != 38347922, i17 & 1)) {
            if (i19 != 0) {
                mVar2 = m.INSTANCE;
            }
            if (t.k()) {
                t.o(-426833549, i17, -1, "androidx.compose.material.BottomSheet (BottomSheetScaffold.kt:387)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = Function0.i(tq.j.f191408a, rVarH);
                rVarH.v(objE);
            }
            final p0 p0Var2 = (p0) objE;
            final float fL2 = ((c5.d) rVarH.N(g1.f())).l2(f16);
            i<q0> iVarG = p0Var.g();
            int i25 = i17;
            p143z0.a2 a2Var = p143z0.a2.Vertical;
            int i26 = i25 & 14;
            boolean zB = rVarH.b(fL2) | (i26 == 4);
            Object objE2 = rVarH.E();
            if (zB || objE2 == companion.a()) {
                objE2 = new p() { // from class: a2.h0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i0.A(p0Var, fL2, (c5.r) obj, (b) obj2);
                    }
                };
                rVarH.v(objE2);
            }
            m mVarE = p012a2.c.e(p012a2.c.h(mVar2, iVarG, a2Var, (p) objE2), p0Var.g(), a2Var, z15, false, null, false, 56, null);
            boolean zG = (i26 == 4) | rVarH.G(p0Var2);
            Object objE3 = rVarH.E();
            if (zG || objE3 == companion.a()) {
                objE3 = new l() { // from class: a2.t
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i0.C(p0Var, p0Var2, (i0) obj);
                    }
                };
                rVarH.v(objE3);
            }
            int i27 = i25 >> 6;
            int i28 = ((i25 >> 3) & 112) | i18 | (i27 & 896) | (i27 & 7168) | (458752 & (i25 << 6));
            rVar2 = rVarH;
            f5.f(n4.v.d(mVarE, false, (l) objE3, 1, null), y2Var, j15, j16, null, f15, y2.m.d(1065607095, true, new p() { // from class: a2.u
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i0.F(qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVar2, i28, 16);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            final m mVar3 = mVar2;
            d5VarM.a(new p() { // from class: a2.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i0.G(p0Var, z15, y2Var, f15, j15, j16, f16, mVar3, qVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0127 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x012e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0134  */
    /* JADX WARN: Code duplicated, block: B:110:0x013a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0143  */
    /* JADX WARN: Code duplicated, block: B:115:0x0148  */
    /* JADX WARN: Code duplicated, block: B:118:0x014f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0157  */
    /* JADX WARN: Code duplicated, block: B:123:0x0160  */
    /* JADX WARN: Code duplicated, block: B:125:0x0165  */
    /* JADX WARN: Code duplicated, block: B:128:0x016f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0173  */
    /* JADX WARN: Code duplicated, block: B:133:0x017e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x0185  */
    /* JADX WARN: Code duplicated, block: B:139:0x018d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0193  */
    /* JADX WARN: Code duplicated, block: B:145:0x019e  */
    /* JADX WARN: Code duplicated, block: B:148:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:150:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:153:0x01b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:158:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:160:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:161:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:165:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:169:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:172:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:174:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:203:0x024b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:204:0x024d  */
    /* JADX WARN: Code duplicated, block: B:207:0x0254  */
    /* JADX WARN: Code duplicated, block: B:209:0x025f  */
    /* JADX WARN: Code duplicated, block: B:210:0x0261  */
    /* JADX WARN: Code duplicated, block: B:212:0x0265  */
    /* JADX WARN: Code duplicated, block: B:214:0x026d  */
    /* JADX WARN: Code duplicated, block: B:216:0x0270  */
    /* JADX WARN: Code duplicated, block: B:217:0x0277  */
    /* JADX WARN: Code duplicated, block: B:219:0x027a  */
    /* JADX WARN: Code duplicated, block: B:222:0x0280  */
    /* JADX WARN: Code duplicated, block: B:223:0x0290  */
    /* JADX WARN: Code duplicated, block: B:226:0x0296  */
    /* JADX WARN: Code duplicated, block: B:227:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:230:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:231:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:234:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:236:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:239:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:240:0x02de  */
    /* JADX WARN: Code duplicated, block: B:243:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:244:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:247:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:249:0x0311  */
    /* JADX WARN: Code duplicated, block: B:252:0x0321  */
    /* JADX WARN: Code duplicated, block: B:253:0x032c  */
    /* JADX WARN: Code duplicated, block: B:256:0x0396  */
    /* JADX WARN: Code duplicated, block: B:258:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:261:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:263:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0109 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:97:0x0118  */
    /* JADX WARN: Code duplicated, block: B:99:0x011c  */
    public static final void r(final q<? super h0, ? super p076m2.r, ? super Integer, oq.i0> qVar, m mVar, k0 k0Var, p<? super p076m2.r, ? super Integer, oq.i0> pVar, q<? super i4, ? super p076m2.r, ? super Integer, oq.i0> qVar2, p<? super p076m2.r, ? super Integer, oq.i0> pVar2, int i15, boolean z15, y2 y2Var, float f15, long j15, long j16, float f16, long j17, long j18, final q<? super d3, ? super p076m2.r, ? super Integer, oq.i0> qVar3, p076m2.r rVar, final int i16, final int i17, final int i18) {
        int i19;
        m mVar2;
        k0 k0VarL;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        q<? super i4, ? super p076m2.r, ? super Integer, oq.i0> qVarF;
        int i35;
        int i36;
        p<? super p076m2.r, ? super Integer, oq.i0> pVar3;
        int i37;
        int i38;
        int i39;
        int i45;
        int i46;
        boolean z16;
        int i47;
        int i48;
        int i49;
        int i55;
        long jA;
        boolean z17;
        p076m2.r rVar2;
        final p<? super p076m2.r, ? super Integer, oq.i0> pVar4;
        final y2 y2Var2;
        final long j19;
        final long j25;
        final q<? super i4, ? super p076m2.r, ? super Integer, oq.i0> qVar4;
        final p<? super p076m2.r, ? super Integer, oq.i0> pVar5;
        final int i56;
        final m mVar3;
        final k0 k0Var2;
        final boolean z18;
        final float f17;
        final long j26;
        final long j27;
        final float f18;
        d5 d5VarM;
        p<? super p076m2.r, ? super Integer, oq.i0> pVar6;
        int iB;
        y2 y2VarA;
        final float fB;
        long jL;
        long jD;
        int i57;
        float fC;
        float f19;
        int i58;
        long j28;
        long j29;
        long j35;
        int i59;
        int i65;
        int i66;
        int i67;
        int i68;
        p076m2.r rVarH = rVar.h(194495313);
        if ((i16 & 6) == 0) {
            i19 = (rVarH.G(qVar) ? 4 : 2) | i16;
        } else {
            i19 = i16;
        }
        int i69 = i18 & 2;
        if (i69 == 0) {
            if ((i16 & 48) == 0) {
                mVar2 = mVar;
                i19 |= rVarH.W(mVar2) ? 32 : 16;
            }
            if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
                if ((i18 & 4) == 0) {
                    k0VarL = k0Var;
                    int i75 = rVarH.W(k0VarL) ? 256 : 128;
                    i19 |= i75;
                } else {
                    k0VarL = k0Var;
                }
                i19 |= i75;
            } else {
                k0VarL = k0Var;
            }
            i25 = i18 & 8;
            i26 = 1024;
            if (i25 != 0) {
                if ((i16 & 3072) == 0) {
                    if (rVarH.G(pVar)) {
                        i27 = 2048;
                    } else {
                        i27 = 1024;
                    }
                    i19 |= i27;
                }
                i28 = i18 & 16;
                i29 = PKIFailureInfo.certRevoked;
                if (i28 != 0) {
                    if ((i16 & 24576) == 0) {
                        qVarF = qVar2;
                        if (rVarH.G(qVarF)) {
                            i35 = 16384;
                        } else {
                            i35 = 8192;
                        }
                        i19 |= i35;
                    }
                    i36 = i18 & 32;
                    if (i36 != 0) {
                        i19 |= 196608;
                        pVar3 = pVar2;
                    } else {
                        pVar3 = pVar2;
                        if ((i16 & 196608) == 0) {
                            if (rVarH.G(pVar3)) {
                                i37 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i37 = PKIFailureInfo.notAuthorized;
                            }
                            i19 |= i37;
                        }
                    }
                    i38 = i18 & 64;
                    if (i38 != 0) {
                        i19 |= 1572864;
                        i39 = i15;
                    } else {
                        i39 = i15;
                        if ((i16 & 1572864) == 0) {
                            if (rVarH.c(i39)) {
                                i45 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i45 = PKIFailureInfo.signerNotTrusted;
                            }
                            i19 |= i45;
                        }
                    }
                    i46 = i18 & 128;
                    if (i46 != 0) {
                        i19 |= 12582912;
                        z16 = z15;
                    } else {
                        z16 = z15;
                        if ((i16 & 12582912) == 0) {
                            if (rVarH.a(z16)) {
                                i47 = 8388608;
                            } else {
                                i47 = 4194304;
                            }
                            i19 |= i47;
                        }
                    }
                    if ((i16 & 100663296) != 0) {
                        i19 |= ((i18 & 256) == 0 || !rVarH.W(y2Var)) ? 33554432 : 67108864;
                    }
                    if ((i16 & 805306368) != 0) {
                        i19 |= ((i18 & 512) == 0 || !rVarH.b(f15)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                    }
                    if ((i17 & 6) == 0) {
                        if ((i18 & 1024) == 0 || !rVarH.d(j15)) {
                            i68 = 2;
                        } else {
                            i68 = 4;
                        }
                        i48 = i17 | i68;
                    } else {
                        i48 = i17;
                    }
                    if ((i17 & 48) == 0) {
                        int i76 = i48;
                        if ((i18 & 2048) == 0 || !rVarH.d(j16)) {
                            i67 = 16;
                        } else {
                            i67 = 32;
                        }
                        i48 = i76 | i67;
                    }
                    i49 = i48;
                    if ((i17 & MLKEMEngine.KyberPolyBytes) == 0) {
                        i55 = i49 | (((i18 & PKIFailureInfo.certConfirmed) == 0 || !rVarH.b(f16)) ? 128 : 256);
                    } else {
                        i55 = i49;
                    }
                    if ((i17 & 3072) == 0) {
                        jA = j17;
                        if ((i18 & PKIFailureInfo.certRevoked) == 0 && rVarH.d(jA)) {
                            i26 = 2048;
                        }
                        i55 |= i26;
                    } else {
                        jA = j17;
                    }
                    if ((i17 & 24576) != 0) {
                        if ((i18 & 16384) == 0 && rVarH.d(j18)) {
                            i29 = 16384;
                        }
                        i55 |= i29;
                    }
                    if ((i17 & 196608) == 0) {
                        if (rVarH.G(qVar3)) {
                            i66 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i66 = PKIFailureInfo.notAuthorized;
                        }
                        i55 |= i66;
                    }
                    if ((306783379 & i19) == 306783378 || (i55 & 74899) != 74898) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (rVarH.r(z17, i19 & 1)) {
                        rVarH.I();
                        if ((i16 & 1) != 0 || rVarH.Q()) {
                            if (i69 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if ((i18 & 4) != 0) {
                                i19 &= -897;
                                k0VarL = L(null, null, rVarH, 0, 3);
                            }
                            if (i25 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar;
                            }
                            if (i28 != 0) {
                                qVarF = g1.f1556a.f();
                            }
                            if (i36 != 0) {
                                pVar3 = null;
                            }
                            if (i38 != 0) {
                                iB = c2.INSTANCE.b();
                            } else {
                                iB = i39;
                            }
                            if (i46 != 0) {
                                z16 = true;
                            }
                            if ((i18 & 256) != 0) {
                                y2VarA = m2.f1788a.b(rVarH, 6).getLarge();
                                i19 &= -234881025;
                            } else {
                                y2VarA = y2Var;
                            }
                            if ((i18 & 512) != 0) {
                                fB = r.f1893a.b();
                                i19 &= -1879048193;
                            } else {
                                fB = f15;
                            }
                            if ((i18 & 1024) != 0) {
                                i55 &= -15;
                                jL = m2.f1788a.a(rVarH, 6).l();
                            } else {
                                jL = j15;
                            }
                            if ((i18 & 2048) != 0) {
                                jD = c1.d(jL, rVarH, i55 & 14);
                                i55 &= -113;
                            } else {
                                jD = j16;
                            }
                            i57 = i55;
                            pVar = pVar6;
                            if ((i18 & PKIFailureInfo.certConfirmed) != 0) {
                                fC = r.f1893a.c();
                                i57 &= -897;
                            } else {
                                fC = f16;
                            }
                            f19 = fC;
                            if ((i18 & PKIFailureInfo.certRevoked) != 0) {
                                jA = m2.f1788a.a(rVarH, 6).a();
                                i58 = i57 & (-7169);
                            } else {
                                i58 = i57;
                            }
                            if ((i18 & 16384) != 0) {
                                long jD2 = c1.d(jA, rVarH, (i58 >> 9) & 14);
                                i58 &= -57345;
                                j28 = jD2;
                            } else {
                                j28 = j18;
                            }
                            j29 = jA;
                            j35 = jL;
                            z16 = z16;
                            i59 = i19;
                        } else {
                            rVarH.O();
                            if ((i18 & 4) != 0) {
                                i19 &= -897;
                            }
                            if ((i18 & 256) != 0) {
                                i19 &= -234881025;
                            }
                            if ((i18 & 512) != 0) {
                                i19 &= -1879048193;
                            }
                            if ((i18 & 1024) != 0) {
                                i55 &= -15;
                            }
                            if ((i18 & 2048) != 0) {
                                i55 &= -113;
                            }
                            i58 = i55;
                            if ((i18 & PKIFailureInfo.certConfirmed) != 0) {
                                i58 &= -897;
                            }
                            if ((i18 & PKIFailureInfo.certRevoked) != 0) {
                                i58 &= -7169;
                            }
                            if ((i18 & 16384) != 0) {
                                i58 &= -57345;
                            }
                            fB = f15;
                            jD = j16;
                            f19 = f16;
                            j28 = j18;
                            j29 = jA;
                            i59 = i19;
                            iB = i39;
                            y2VarA = y2Var;
                            j35 = j15;
                        }
                        i65 = i58;
                        final p<? super p076m2.r, ? super Integer, oq.i0> pVar7 = pVar;
                        rVarH.y();
                        if (t.k()) {
                            t.o(194495313, i59, i65, "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:336)");
                        }
                        m mVarF = androidx.compose.foundation.layout.d.f(mVar2, 0.0f, 1, null);
                        final float f25 = f19;
                        final long j36 = j35;
                        final q<? super i4, ? super p076m2.r, ? super Integer, oq.i0> qVar5 = qVarF;
                        final int i77 = iB;
                        final p<? super p076m2.r, ? super Integer, oq.i0> pVar8 = pVar3;
                        final y2 y2Var3 = y2VarA;
                        final k0 k0Var3 = k0VarL;
                        final boolean z19 = z16;
                        final long j37 = jD;
                        float f26 = fB;
                        y2.f fVarD = y2.m.d(-747577963, true, new p() { // from class: a2.a0
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i0.u(k0Var3, pVar7, pVar8, f25, i77, qVar3, z19, y2Var3, fB, j36, j37, qVar, qVar5, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54);
                        int i78 = i65 >> 3;
                        long j38 = j29;
                        long j39 = j28;
                        f5.f(mVarF, null, j38, j39, null, 0.0f, fVarD, rVarH, (i78 & 7168) | (i78 & 896) | 1572864, 50);
                        rVar2 = rVarH;
                        if (t.k()) {
                            t.n();
                        }
                        pVar4 = pVar7;
                        z18 = z16;
                        f18 = f25;
                        p<? super p076m2.r, ? super Integer, oq.i0> pVar9 = pVar3;
                        f17 = f26;
                        k0Var2 = k0VarL;
                        j27 = jD;
                        j19 = j39;
                        j25 = j38;
                        mVar3 = mVar2;
                        long j45 = j35;
                        qVar4 = qVarF;
                        i56 = iB;
                        pVar5 = pVar9;
                        y2Var2 = y2VarA;
                        j26 = j45;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        pVar4 = pVar;
                        y2Var2 = y2Var;
                        j19 = j18;
                        j25 = jA;
                        qVar4 = qVarF;
                        pVar5 = pVar3;
                        i56 = i39;
                        mVar3 = mVar2;
                        k0Var2 = k0VarL;
                        z18 = z16;
                        f17 = f15;
                        j26 = j15;
                        j27 = j16;
                        f18 = f16;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: a2.b0
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return i0.z(qVar, mVar3, k0Var2, pVar4, qVar4, pVar5, i56, z18, y2Var2, f17, j26, j27, f18, j25, j19, qVar3, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i19 |= 24576;
                qVarF = qVar2;
                i36 = i18 & 32;
                if (i36 != 0) {
                    i19 |= 196608;
                    pVar3 = pVar2;
                } else {
                    pVar3 = pVar2;
                    if ((i16 & 196608) == 0) {
                        if (rVarH.G(pVar3)) {
                            i37 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i37 = PKIFailureInfo.notAuthorized;
                        }
                        i19 |= i37;
                    }
                }
                i38 = i18 & 64;
                if (i38 != 0) {
                    i19 |= 1572864;
                    i39 = i15;
                } else {
                    i39 = i15;
                    if ((i16 & 1572864) == 0) {
                        if (rVarH.c(i39)) {
                            i45 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i45 = PKIFailureInfo.signerNotTrusted;
                        }
                        i19 |= i45;
                    }
                }
                i46 = i18 & 128;
                if (i46 != 0) {
                    i19 |= 12582912;
                    z16 = z15;
                } else {
                    z16 = z15;
                    if ((i16 & 12582912) == 0) {
                        if (rVarH.a(z16)) {
                            i47 = 8388608;
                        } else {
                            i47 = 4194304;
                        }
                        i19 |= i47;
                    }
                }
                if ((i16 & 100663296) != 0) {
                    i19 |= ((i18 & 256) == 0 || !rVarH.W(y2Var)) ? 33554432 : 67108864;
                }
                if ((i16 & 805306368) != 0) {
                    i19 |= ((i18 & 512) == 0 || !rVarH.b(f15)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i17 & 6) == 0) {
                    if ((i18 & 1024) == 0) {
                        i68 = 2;
                    } else {
                        i68 = 2;
                    }
                    i48 = i17 | i68;
                } else {
                    i48 = i17;
                }
                if ((i17 & 48) == 0) {
                    int i79 = i48;
                    if ((i18 & 2048) == 0) {
                        i67 = 16;
                    } else {
                        i67 = 16;
                    }
                    i48 = i79 | i67;
                }
                i49 = i48;
                if ((i17 & MLKEMEngine.KyberPolyBytes) == 0) {
                    i55 = i49 | (((i18 & PKIFailureInfo.certConfirmed) == 0 || !rVarH.b(f16)) ? 128 : 256);
                } else {
                    i55 = i49;
                }
                if ((i17 & 3072) == 0) {
                    jA = j17;
                    if ((i18 & PKIFailureInfo.certRevoked) == 0) {
                        i26 = 2048;
                    }
                    i55 |= i26;
                } else {
                    jA = j17;
                }
                if ((i17 & 24576) != 0) {
                    if ((i18 & 16384) == 0) {
                        i29 = 16384;
                    }
                    i55 |= i29;
                }
                if ((i17 & 196608) == 0) {
                    if (rVarH.G(qVar3)) {
                        i66 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i66 = PKIFailureInfo.notAuthorized;
                    }
                    i55 |= i66;
                }
                if ((306783379 & i19) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i19 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i69 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i18 & 4) != 0) {
                            i19 &= -897;
                            k0VarL = L(null, null, rVarH, 0, 3);
                        }
                        if (i25 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar;
                        }
                        if (i28 != 0) {
                            qVarF = g1.f1556a.f();
                        }
                        if (i36 != 0) {
                            pVar3 = null;
                        }
                        if (i38 != 0) {
                            iB = c2.INSTANCE.b();
                        } else {
                            iB = i39;
                        }
                        if (i46 != 0) {
                            z16 = true;
                        }
                        if ((i18 & 256) != 0) {
                            y2VarA = m2.f1788a.b(rVarH, 6).getLarge();
                            i19 &= -234881025;
                        } else {
                            y2VarA = y2Var;
                        }
                        if ((i18 & 512) != 0) {
                            fB = r.f1893a.b();
                            i19 &= -1879048193;
                        } else {
                            fB = f15;
                        }
                        if ((i18 & 1024) != 0) {
                            i55 &= -15;
                            jL = m2.f1788a.a(rVarH, 6).l();
                        } else {
                            jL = j15;
                        }
                        if ((i18 & 2048) != 0) {
                            jD = c1.d(jL, rVarH, i55 & 14);
                            i55 &= -113;
                        } else {
                            jD = j16;
                        }
                        i57 = i55;
                        pVar = pVar6;
                        if ((i18 & PKIFailureInfo.certConfirmed) != 0) {
                            fC = r.f1893a.c();
                            i57 &= -897;
                        } else {
                            fC = f16;
                        }
                        f19 = fC;
                        if ((i18 & PKIFailureInfo.certRevoked) != 0) {
                            jA = m2.f1788a.a(rVarH, 6).a();
                            i58 = i57 & (-7169);
                        } else {
                            i58 = i57;
                        }
                        if ((i18 & 16384) != 0) {
                            long jD3 = c1.d(jA, rVarH, (i58 >> 9) & 14);
                            i58 &= -57345;
                            j28 = jD3;
                        } else {
                            j28 = j18;
                        }
                        j29 = jA;
                        j35 = jL;
                        z16 = z16;
                        i59 = i19;
                    } else {
                        if (i69 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i18 & 4) != 0) {
                            i19 &= -897;
                            k0VarL = L(null, null, rVarH, 0, 3);
                        }
                        if (i25 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar;
                        }
                        if (i28 != 0) {
                            qVarF = g1.f1556a.f();
                        }
                        if (i36 != 0) {
                            pVar3 = null;
                        }
                        if (i38 != 0) {
                            iB = c2.INSTANCE.b();
                        } else {
                            iB = i39;
                        }
                        if (i46 != 0) {
                            z16 = true;
                        }
                        if ((i18 & 256) != 0) {
                            y2VarA = m2.f1788a.b(rVarH, 6).getLarge();
                            i19 &= -234881025;
                        } else {
                            y2VarA = y2Var;
                        }
                        if ((i18 & 512) != 0) {
                            fB = r.f1893a.b();
                            i19 &= -1879048193;
                        } else {
                            fB = f15;
                        }
                        if ((i18 & 1024) != 0) {
                            i55 &= -15;
                            jL = m2.f1788a.a(rVarH, 6).l();
                        } else {
                            jL = j15;
                        }
                        if ((i18 & 2048) != 0) {
                            jD = c1.d(jL, rVarH, i55 & 14);
                            i55 &= -113;
                        } else {
                            jD = j16;
                        }
                        i57 = i55;
                        pVar = pVar6;
                        if ((i18 & PKIFailureInfo.certConfirmed) != 0) {
                            fC = r.f1893a.c();
                            i57 &= -897;
                        } else {
                            fC = f16;
                        }
                        f19 = fC;
                        if ((i18 & PKIFailureInfo.certRevoked) != 0) {
                            jA = m2.f1788a.a(rVarH, 6).a();
                            i58 = i57 & (-7169);
                        } else {
                            i58 = i57;
                        }
                        if ((i18 & 16384) != 0) {
                            long jD4 = c1.d(jA, rVarH, (i58 >> 9) & 14);
                            i58 &= -57345;
                            j28 = jD4;
                        } else {
                            j28 = j18;
                        }
                        j29 = jA;
                        j35 = jL;
                        z16 = z16;
                        i59 = i19;
                    }
                    i65 = i58;
                    final p pVar10 = pVar;
                    rVarH.y();
                    if (t.k()) {
                        t.o(194495313, i59, i65, "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:336)");
                    }
                    m mVarF2 = androidx.compose.foundation.layout.d.f(mVar2, 0.0f, 1, null);
                    final float f27 = f19;
                    final long j310 = j35;
                    final q qVar6 = qVarF;
                    final int i710 = iB;
                    final p pVar11 = pVar3;
                    final y2 y2Var4 = y2VarA;
                    final k0 k0Var4 = k0VarL;
                    final boolean z110 = z16;
                    final long j311 = jD;
                    float f28 = fB;
                    y2.f fVarD2 = y2.m.d(-747577963, true, new p() { // from class: a2.a0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i0.u(k0Var4, pVar10, pVar11, f27, i710, qVar3, z110, y2Var4, fB, j310, j311, qVar, qVar6, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54);
                    int i711 = i65 >> 3;
                    long j312 = j29;
                    long j313 = j28;
                    f5.f(mVarF2, null, j312, j313, null, 0.0f, fVarD2, rVarH, (i711 & 7168) | (i711 & 896) | 1572864, 50);
                    rVar2 = rVarH;
                    if (t.k()) {
                        t.n();
                    }
                    pVar4 = pVar10;
                    z18 = z16;
                    f18 = f27;
                    p<? super p076m2.r, ? super Integer, oq.i0> pVar12 = pVar3;
                    f17 = f28;
                    k0Var2 = k0VarL;
                    j27 = jD;
                    j19 = j313;
                    j25 = j312;
                    mVar3 = mVar2;
                    long j46 = j35;
                    qVar4 = qVarF;
                    i56 = iB;
                    pVar5 = pVar12;
                    y2Var2 = y2VarA;
                    j26 = j46;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    pVar4 = pVar;
                    y2Var2 = y2Var;
                    j19 = j18;
                    j25 = jA;
                    qVar4 = qVarF;
                    pVar5 = pVar3;
                    i56 = i39;
                    mVar3 = mVar2;
                    k0Var2 = k0VarL;
                    z18 = z16;
                    f17 = f15;
                    j26 = j15;
                    j27 = j16;
                    f18 = f16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.b0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i0.z(qVar, mVar3, k0Var2, pVar4, qVar4, pVar5, i56, z18, y2Var2, f17, j26, j27, f18, j25, j19, qVar3, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 3072;
            i28 = i18 & 16;
            i29 = PKIFailureInfo.certRevoked;
            if (i28 != 0) {
                if ((i16 & 24576) == 0) {
                    qVarF = qVar2;
                    if (rVarH.G(qVarF)) {
                        i35 = 16384;
                    } else {
                        i35 = 8192;
                    }
                    i19 |= i35;
                }
                i36 = i18 & 32;
                if (i36 != 0) {
                    i19 |= 196608;
                    pVar3 = pVar2;
                } else {
                    pVar3 = pVar2;
                    if ((i16 & 196608) == 0) {
                        if (rVarH.G(pVar3)) {
                            i37 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i37 = PKIFailureInfo.notAuthorized;
                        }
                        i19 |= i37;
                    }
                }
                i38 = i18 & 64;
                if (i38 != 0) {
                    i19 |= 1572864;
                    i39 = i15;
                } else {
                    i39 = i15;
                    if ((i16 & 1572864) == 0) {
                        if (rVarH.c(i39)) {
                            i45 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i45 = PKIFailureInfo.signerNotTrusted;
                        }
                        i19 |= i45;
                    }
                }
                i46 = i18 & 128;
                if (i46 != 0) {
                    i19 |= 12582912;
                    z16 = z15;
                } else {
                    z16 = z15;
                    if ((i16 & 12582912) == 0) {
                        if (rVarH.a(z16)) {
                            i47 = 8388608;
                        } else {
                            i47 = 4194304;
                        }
                        i19 |= i47;
                    }
                }
                if ((i16 & 100663296) != 0) {
                    i19 |= ((i18 & 256) == 0 || !rVarH.W(y2Var)) ? 33554432 : 67108864;
                }
                if ((i16 & 805306368) != 0) {
                    i19 |= ((i18 & 512) == 0 || !rVarH.b(f15)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i17 & 6) == 0) {
                    if ((i18 & 1024) == 0) {
                        i68 = 2;
                    } else {
                        i68 = 2;
                    }
                    i48 = i17 | i68;
                } else {
                    i48 = i17;
                }
                if ((i17 & 48) == 0) {
                    int i712 = i48;
                    if ((i18 & 2048) == 0) {
                        i67 = 16;
                    } else {
                        i67 = 16;
                    }
                    i48 = i712 | i67;
                }
                i49 = i48;
                if ((i17 & MLKEMEngine.KyberPolyBytes) == 0) {
                    i55 = i49 | (((i18 & PKIFailureInfo.certConfirmed) == 0 || !rVarH.b(f16)) ? 128 : 256);
                } else {
                    i55 = i49;
                }
                if ((i17 & 3072) == 0) {
                    jA = j17;
                    if ((i18 & PKIFailureInfo.certRevoked) == 0) {
                        i26 = 2048;
                    }
                    i55 |= i26;
                } else {
                    jA = j17;
                }
                if ((i17 & 24576) != 0) {
                    if ((i18 & 16384) == 0) {
                        i29 = 16384;
                    }
                    i55 |= i29;
                }
                if ((i17 & 196608) == 0) {
                    if (rVarH.G(qVar3)) {
                        i66 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i66 = PKIFailureInfo.notAuthorized;
                    }
                    i55 |= i66;
                }
                if ((306783379 & i19) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i19 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i69 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i18 & 4) != 0) {
                            i19 &= -897;
                            k0VarL = L(null, null, rVarH, 0, 3);
                        }
                        if (i25 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar;
                        }
                        if (i28 != 0) {
                            qVarF = g1.f1556a.f();
                        }
                        if (i36 != 0) {
                            pVar3 = null;
                        }
                        if (i38 != 0) {
                            iB = c2.INSTANCE.b();
                        } else {
                            iB = i39;
                        }
                        if (i46 != 0) {
                            z16 = true;
                        }
                        if ((i18 & 256) != 0) {
                            y2VarA = m2.f1788a.b(rVarH, 6).getLarge();
                            i19 &= -234881025;
                        } else {
                            y2VarA = y2Var;
                        }
                        if ((i18 & 512) != 0) {
                            fB = r.f1893a.b();
                            i19 &= -1879048193;
                        } else {
                            fB = f15;
                        }
                        if ((i18 & 1024) != 0) {
                            i55 &= -15;
                            jL = m2.f1788a.a(rVarH, 6).l();
                        } else {
                            jL = j15;
                        }
                        if ((i18 & 2048) != 0) {
                            jD = c1.d(jL, rVarH, i55 & 14);
                            i55 &= -113;
                        } else {
                            jD = j16;
                        }
                        i57 = i55;
                        pVar = pVar6;
                        if ((i18 & PKIFailureInfo.certConfirmed) != 0) {
                            fC = r.f1893a.c();
                            i57 &= -897;
                        } else {
                            fC = f16;
                        }
                        f19 = fC;
                        if ((i18 & PKIFailureInfo.certRevoked) != 0) {
                            jA = m2.f1788a.a(rVarH, 6).a();
                            i58 = i57 & (-7169);
                        } else {
                            i58 = i57;
                        }
                        if ((i18 & 16384) != 0) {
                            long jD5 = c1.d(jA, rVarH, (i58 >> 9) & 14);
                            i58 &= -57345;
                            j28 = jD5;
                        } else {
                            j28 = j18;
                        }
                        j29 = jA;
                        j35 = jL;
                        z16 = z16;
                        i59 = i19;
                    } else {
                        if (i69 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i18 & 4) != 0) {
                            i19 &= -897;
                            k0VarL = L(null, null, rVarH, 0, 3);
                        }
                        if (i25 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar;
                        }
                        if (i28 != 0) {
                            qVarF = g1.f1556a.f();
                        }
                        if (i36 != 0) {
                            pVar3 = null;
                        }
                        if (i38 != 0) {
                            iB = c2.INSTANCE.b();
                        } else {
                            iB = i39;
                        }
                        if (i46 != 0) {
                            z16 = true;
                        }
                        if ((i18 & 256) != 0) {
                            y2VarA = m2.f1788a.b(rVarH, 6).getLarge();
                            i19 &= -234881025;
                        } else {
                            y2VarA = y2Var;
                        }
                        if ((i18 & 512) != 0) {
                            fB = r.f1893a.b();
                            i19 &= -1879048193;
                        } else {
                            fB = f15;
                        }
                        if ((i18 & 1024) != 0) {
                            i55 &= -15;
                            jL = m2.f1788a.a(rVarH, 6).l();
                        } else {
                            jL = j15;
                        }
                        if ((i18 & 2048) != 0) {
                            jD = c1.d(jL, rVarH, i55 & 14);
                            i55 &= -113;
                        } else {
                            jD = j16;
                        }
                        i57 = i55;
                        pVar = pVar6;
                        if ((i18 & PKIFailureInfo.certConfirmed) != 0) {
                            fC = r.f1893a.c();
                            i57 &= -897;
                        } else {
                            fC = f16;
                        }
                        f19 = fC;
                        if ((i18 & PKIFailureInfo.certRevoked) != 0) {
                            jA = m2.f1788a.a(rVarH, 6).a();
                            i58 = i57 & (-7169);
                        } else {
                            i58 = i57;
                        }
                        if ((i18 & 16384) != 0) {
                            long jD6 = c1.d(jA, rVarH, (i58 >> 9) & 14);
                            i58 &= -57345;
                            j28 = jD6;
                        } else {
                            j28 = j18;
                        }
                        j29 = jA;
                        j35 = jL;
                        z16 = z16;
                        i59 = i19;
                    }
                    i65 = i58;
                    final p pVar13 = pVar;
                    rVarH.y();
                    if (t.k()) {
                        t.o(194495313, i59, i65, "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:336)");
                    }
                    m mVarF3 = androidx.compose.foundation.layout.d.f(mVar2, 0.0f, 1, null);
                    final float f29 = f19;
                    final long j314 = j35;
                    final q qVar7 = qVarF;
                    final int i713 = iB;
                    final p pVar14 = pVar3;
                    final y2 y2Var5 = y2VarA;
                    final k0 k0Var5 = k0VarL;
                    final boolean z111 = z16;
                    final long j315 = jD;
                    float f210 = fB;
                    y2.f fVarD3 = y2.m.d(-747577963, true, new p() { // from class: a2.a0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i0.u(k0Var5, pVar13, pVar14, f29, i713, qVar3, z111, y2Var5, fB, j314, j315, qVar, qVar7, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54);
                    int i714 = i65 >> 3;
                    long j316 = j29;
                    long j317 = j28;
                    f5.f(mVarF3, null, j316, j317, null, 0.0f, fVarD3, rVarH, (i714 & 7168) | (i714 & 896) | 1572864, 50);
                    rVar2 = rVarH;
                    if (t.k()) {
                        t.n();
                    }
                    pVar4 = pVar13;
                    z18 = z16;
                    f18 = f29;
                    p<? super p076m2.r, ? super Integer, oq.i0> pVar15 = pVar3;
                    f17 = f210;
                    k0Var2 = k0VarL;
                    j27 = jD;
                    j19 = j317;
                    j25 = j316;
                    mVar3 = mVar2;
                    long j47 = j35;
                    qVar4 = qVarF;
                    i56 = iB;
                    pVar5 = pVar15;
                    y2Var2 = y2VarA;
                    j26 = j47;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    pVar4 = pVar;
                    y2Var2 = y2Var;
                    j19 = j18;
                    j25 = jA;
                    qVar4 = qVarF;
                    pVar5 = pVar3;
                    i56 = i39;
                    mVar3 = mVar2;
                    k0Var2 = k0VarL;
                    z18 = z16;
                    f17 = f15;
                    j26 = j15;
                    j27 = j16;
                    f18 = f16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.b0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i0.z(qVar, mVar3, k0Var2, pVar4, qVar4, pVar5, i56, z18, y2Var2, f17, j26, j27, f18, j25, j19, qVar3, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 24576;
            qVarF = qVar2;
            i36 = i18 & 32;
            if (i36 != 0) {
                i19 |= 196608;
                pVar3 = pVar2;
            } else {
                pVar3 = pVar2;
                if ((i16 & 196608) == 0) {
                    if (rVarH.G(pVar3)) {
                        i37 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i37 = PKIFailureInfo.notAuthorized;
                    }
                    i19 |= i37;
                }
            }
            i38 = i18 & 64;
            if (i38 != 0) {
                i19 |= 1572864;
                i39 = i15;
            } else {
                i39 = i15;
                if ((i16 & 1572864) == 0) {
                    if (rVarH.c(i39)) {
                        i45 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    }
                    i19 |= i45;
                }
            }
            i46 = i18 & 128;
            if (i46 != 0) {
                i19 |= 12582912;
                z16 = z15;
            } else {
                z16 = z15;
                if ((i16 & 12582912) == 0) {
                    if (rVarH.a(z16)) {
                        i47 = 8388608;
                    } else {
                        i47 = 4194304;
                    }
                    i19 |= i47;
                }
            }
            if ((i16 & 100663296) != 0) {
                i19 |= ((i18 & 256) == 0 || !rVarH.W(y2Var)) ? 33554432 : 67108864;
            }
            if ((i16 & 805306368) != 0) {
                i19 |= ((i18 & 512) == 0 || !rVarH.b(f15)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            if ((i17 & 6) == 0) {
                if ((i18 & 1024) == 0) {
                    i68 = 2;
                } else {
                    i68 = 2;
                }
                i48 = i17 | i68;
            } else {
                i48 = i17;
            }
            if ((i17 & 48) == 0) {
                int i715 = i48;
                if ((i18 & 2048) == 0) {
                    i67 = 16;
                } else {
                    i67 = 16;
                }
                i48 = i715 | i67;
            }
            i49 = i48;
            if ((i17 & MLKEMEngine.KyberPolyBytes) == 0) {
                i55 = i49 | (((i18 & PKIFailureInfo.certConfirmed) == 0 || !rVarH.b(f16)) ? 128 : 256);
            } else {
                i55 = i49;
            }
            if ((i17 & 3072) == 0) {
                jA = j17;
                if ((i18 & PKIFailureInfo.certRevoked) == 0) {
                    i26 = 2048;
                }
                i55 |= i26;
            } else {
                jA = j17;
            }
            if ((i17 & 24576) != 0) {
                if ((i18 & 16384) == 0) {
                    i29 = 16384;
                }
                i55 |= i29;
            }
            if ((i17 & 196608) == 0) {
                if (rVarH.G(qVar3)) {
                    i66 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i66 = PKIFailureInfo.notAuthorized;
                }
                i55 |= i66;
            }
            if ((306783379 & i19) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (rVarH.r(z17, i19 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0) {
                    if (i69 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i18 & 4) != 0) {
                        i19 &= -897;
                        k0VarL = L(null, null, rVarH, 0, 3);
                    }
                    if (i25 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar;
                    }
                    if (i28 != 0) {
                        qVarF = g1.f1556a.f();
                    }
                    if (i36 != 0) {
                        pVar3 = null;
                    }
                    if (i38 != 0) {
                        iB = c2.INSTANCE.b();
                    } else {
                        iB = i39;
                    }
                    if (i46 != 0) {
                        z16 = true;
                    }
                    if ((i18 & 256) != 0) {
                        y2VarA = m2.f1788a.b(rVarH, 6).getLarge();
                        i19 &= -234881025;
                    } else {
                        y2VarA = y2Var;
                    }
                    if ((i18 & 512) != 0) {
                        fB = r.f1893a.b();
                        i19 &= -1879048193;
                    } else {
                        fB = f15;
                    }
                    if ((i18 & 1024) != 0) {
                        i55 &= -15;
                        jL = m2.f1788a.a(rVarH, 6).l();
                    } else {
                        jL = j15;
                    }
                    if ((i18 & 2048) != 0) {
                        jD = c1.d(jL, rVarH, i55 & 14);
                        i55 &= -113;
                    } else {
                        jD = j16;
                    }
                    i57 = i55;
                    pVar = pVar6;
                    if ((i18 & PKIFailureInfo.certConfirmed) != 0) {
                        fC = r.f1893a.c();
                        i57 &= -897;
                    } else {
                        fC = f16;
                    }
                    f19 = fC;
                    if ((i18 & PKIFailureInfo.certRevoked) != 0) {
                        jA = m2.f1788a.a(rVarH, 6).a();
                        i58 = i57 & (-7169);
                    } else {
                        i58 = i57;
                    }
                    if ((i18 & 16384) != 0) {
                        long jD7 = c1.d(jA, rVarH, (i58 >> 9) & 14);
                        i58 &= -57345;
                        j28 = jD7;
                    } else {
                        j28 = j18;
                    }
                    j29 = jA;
                    j35 = jL;
                    z16 = z16;
                    i59 = i19;
                } else {
                    if (i69 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i18 & 4) != 0) {
                        i19 &= -897;
                        k0VarL = L(null, null, rVarH, 0, 3);
                    }
                    if (i25 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar;
                    }
                    if (i28 != 0) {
                        qVarF = g1.f1556a.f();
                    }
                    if (i36 != 0) {
                        pVar3 = null;
                    }
                    if (i38 != 0) {
                        iB = c2.INSTANCE.b();
                    } else {
                        iB = i39;
                    }
                    if (i46 != 0) {
                        z16 = true;
                    }
                    if ((i18 & 256) != 0) {
                        y2VarA = m2.f1788a.b(rVarH, 6).getLarge();
                        i19 &= -234881025;
                    } else {
                        y2VarA = y2Var;
                    }
                    if ((i18 & 512) != 0) {
                        fB = r.f1893a.b();
                        i19 &= -1879048193;
                    } else {
                        fB = f15;
                    }
                    if ((i18 & 1024) != 0) {
                        i55 &= -15;
                        jL = m2.f1788a.a(rVarH, 6).l();
                    } else {
                        jL = j15;
                    }
                    if ((i18 & 2048) != 0) {
                        jD = c1.d(jL, rVarH, i55 & 14);
                        i55 &= -113;
                    } else {
                        jD = j16;
                    }
                    i57 = i55;
                    pVar = pVar6;
                    if ((i18 & PKIFailureInfo.certConfirmed) != 0) {
                        fC = r.f1893a.c();
                        i57 &= -897;
                    } else {
                        fC = f16;
                    }
                    f19 = fC;
                    if ((i18 & PKIFailureInfo.certRevoked) != 0) {
                        jA = m2.f1788a.a(rVarH, 6).a();
                        i58 = i57 & (-7169);
                    } else {
                        i58 = i57;
                    }
                    if ((i18 & 16384) != 0) {
                        long jD8 = c1.d(jA, rVarH, (i58 >> 9) & 14);
                        i58 &= -57345;
                        j28 = jD8;
                    } else {
                        j28 = j18;
                    }
                    j29 = jA;
                    j35 = jL;
                    z16 = z16;
                    i59 = i19;
                }
                i65 = i58;
                final p pVar16 = pVar;
                rVarH.y();
                if (t.k()) {
                    t.o(194495313, i59, i65, "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:336)");
                }
                m mVarF4 = androidx.compose.foundation.layout.d.f(mVar2, 0.0f, 1, null);
                final float f211 = f19;
                final long j318 = j35;
                final q qVar8 = qVarF;
                final int i716 = iB;
                final p pVar17 = pVar3;
                final y2 y2Var6 = y2VarA;
                final k0 k0Var6 = k0VarL;
                final boolean z112 = z16;
                final long j319 = jD;
                float f212 = fB;
                y2.f fVarD4 = y2.m.d(-747577963, true, new p() { // from class: a2.a0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i0.u(k0Var6, pVar16, pVar17, f211, i716, qVar3, z112, y2Var6, fB, j318, j319, qVar, qVar8, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54);
                int i717 = i65 >> 3;
                long j3110 = j29;
                long j3111 = j28;
                f5.f(mVarF4, null, j3110, j3111, null, 0.0f, fVarD4, rVarH, (i717 & 7168) | (i717 & 896) | 1572864, 50);
                rVar2 = rVarH;
                if (t.k()) {
                    t.n();
                }
                pVar4 = pVar16;
                z18 = z16;
                f18 = f211;
                p<? super p076m2.r, ? super Integer, oq.i0> pVar18 = pVar3;
                f17 = f212;
                k0Var2 = k0VarL;
                j27 = jD;
                j19 = j3111;
                j25 = j3110;
                mVar3 = mVar2;
                long j48 = j35;
                qVar4 = qVarF;
                i56 = iB;
                pVar5 = pVar18;
                y2Var2 = y2VarA;
                j26 = j48;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                pVar4 = pVar;
                y2Var2 = y2Var;
                j19 = j18;
                j25 = jA;
                qVar4 = qVarF;
                pVar5 = pVar3;
                i56 = i39;
                mVar3 = mVar2;
                k0Var2 = k0VarL;
                z18 = z16;
                f17 = f15;
                j26 = j15;
                j27 = j16;
                f18 = f16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a2.b0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i0.z(qVar, mVar3, k0Var2, pVar4, qVar4, pVar5, i56, z18, y2Var2, f17, j26, j27, f18, j25, j19, qVar3, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 |= 48;
        mVar2 = mVar;
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i18 & 4) == 0) {
                k0VarL = k0Var;
                if (rVarH.W(k0VarL)) {
                }
                i19 |= i75;
            } else {
                k0VarL = k0Var;
            }
            i19 |= i75;
        } else {
            k0VarL = k0Var;
        }
        i25 = i18 & 8;
        i26 = 1024;
        if (i25 != 0) {
            if ((i16 & 3072) == 0) {
                if (rVarH.G(pVar)) {
                    i27 = 2048;
                } else {
                    i27 = 1024;
                }
                i19 |= i27;
            }
            i28 = i18 & 16;
            i29 = PKIFailureInfo.certRevoked;
            if (i28 != 0) {
                if ((i16 & 24576) == 0) {
                    qVarF = qVar2;
                    if (rVarH.G(qVarF)) {
                        i35 = 16384;
                    } else {
                        i35 = 8192;
                    }
                    i19 |= i35;
                }
                i36 = i18 & 32;
                if (i36 != 0) {
                    i19 |= 196608;
                    pVar3 = pVar2;
                } else {
                    pVar3 = pVar2;
                    if ((i16 & 196608) == 0) {
                        if (rVarH.G(pVar3)) {
                            i37 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i37 = PKIFailureInfo.notAuthorized;
                        }
                        i19 |= i37;
                    }
                }
                i38 = i18 & 64;
                if (i38 != 0) {
                    i19 |= 1572864;
                    i39 = i15;
                } else {
                    i39 = i15;
                    if ((i16 & 1572864) == 0) {
                        if (rVarH.c(i39)) {
                            i45 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i45 = PKIFailureInfo.signerNotTrusted;
                        }
                        i19 |= i45;
                    }
                }
                i46 = i18 & 128;
                if (i46 != 0) {
                    i19 |= 12582912;
                    z16 = z15;
                } else {
                    z16 = z15;
                    if ((i16 & 12582912) == 0) {
                        if (rVarH.a(z16)) {
                            i47 = 8388608;
                        } else {
                            i47 = 4194304;
                        }
                        i19 |= i47;
                    }
                }
                if ((i16 & 100663296) != 0) {
                    i19 |= ((i18 & 256) == 0 || !rVarH.W(y2Var)) ? 33554432 : 67108864;
                }
                if ((i16 & 805306368) != 0) {
                    i19 |= ((i18 & 512) == 0 || !rVarH.b(f15)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i17 & 6) == 0) {
                    if ((i18 & 1024) == 0) {
                        i68 = 2;
                    } else {
                        i68 = 2;
                    }
                    i48 = i17 | i68;
                } else {
                    i48 = i17;
                }
                if ((i17 & 48) == 0) {
                    int i718 = i48;
                    if ((i18 & 2048) == 0) {
                        i67 = 16;
                    } else {
                        i67 = 16;
                    }
                    i48 = i718 | i67;
                }
                i49 = i48;
                if ((i17 & MLKEMEngine.KyberPolyBytes) == 0) {
                    i55 = i49 | (((i18 & PKIFailureInfo.certConfirmed) == 0 || !rVarH.b(f16)) ? 128 : 256);
                } else {
                    i55 = i49;
                }
                if ((i17 & 3072) == 0) {
                    jA = j17;
                    if ((i18 & PKIFailureInfo.certRevoked) == 0) {
                        i26 = 2048;
                    }
                    i55 |= i26;
                } else {
                    jA = j17;
                }
                if ((i17 & 24576) != 0) {
                    if ((i18 & 16384) == 0) {
                        i29 = 16384;
                    }
                    i55 |= i29;
                }
                if ((i17 & 196608) == 0) {
                    if (rVarH.G(qVar3)) {
                        i66 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i66 = PKIFailureInfo.notAuthorized;
                    }
                    i55 |= i66;
                }
                if ((306783379 & i19) == 306783378) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                if (rVarH.r(z17, i19 & 1)) {
                    rVarH.I();
                    if ((i16 & 1) != 0) {
                        if (i69 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i18 & 4) != 0) {
                            i19 &= -897;
                            k0VarL = L(null, null, rVarH, 0, 3);
                        }
                        if (i25 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar;
                        }
                        if (i28 != 0) {
                            qVarF = g1.f1556a.f();
                        }
                        if (i36 != 0) {
                            pVar3 = null;
                        }
                        if (i38 != 0) {
                            iB = c2.INSTANCE.b();
                        } else {
                            iB = i39;
                        }
                        if (i46 != 0) {
                            z16 = true;
                        }
                        if ((i18 & 256) != 0) {
                            y2VarA = m2.f1788a.b(rVarH, 6).getLarge();
                            i19 &= -234881025;
                        } else {
                            y2VarA = y2Var;
                        }
                        if ((i18 & 512) != 0) {
                            fB = r.f1893a.b();
                            i19 &= -1879048193;
                        } else {
                            fB = f15;
                        }
                        if ((i18 & 1024) != 0) {
                            i55 &= -15;
                            jL = m2.f1788a.a(rVarH, 6).l();
                        } else {
                            jL = j15;
                        }
                        if ((i18 & 2048) != 0) {
                            jD = c1.d(jL, rVarH, i55 & 14);
                            i55 &= -113;
                        } else {
                            jD = j16;
                        }
                        i57 = i55;
                        pVar = pVar6;
                        if ((i18 & PKIFailureInfo.certConfirmed) != 0) {
                            fC = r.f1893a.c();
                            i57 &= -897;
                        } else {
                            fC = f16;
                        }
                        f19 = fC;
                        if ((i18 & PKIFailureInfo.certRevoked) != 0) {
                            jA = m2.f1788a.a(rVarH, 6).a();
                            i58 = i57 & (-7169);
                        } else {
                            i58 = i57;
                        }
                        if ((i18 & 16384) != 0) {
                            long jD9 = c1.d(jA, rVarH, (i58 >> 9) & 14);
                            i58 &= -57345;
                            j28 = jD9;
                        } else {
                            j28 = j18;
                        }
                        j29 = jA;
                        j35 = jL;
                        z16 = z16;
                        i59 = i19;
                    } else {
                        if (i69 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if ((i18 & 4) != 0) {
                            i19 &= -897;
                            k0VarL = L(null, null, rVarH, 0, 3);
                        }
                        if (i25 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar;
                        }
                        if (i28 != 0) {
                            qVarF = g1.f1556a.f();
                        }
                        if (i36 != 0) {
                            pVar3 = null;
                        }
                        if (i38 != 0) {
                            iB = c2.INSTANCE.b();
                        } else {
                            iB = i39;
                        }
                        if (i46 != 0) {
                            z16 = true;
                        }
                        if ((i18 & 256) != 0) {
                            y2VarA = m2.f1788a.b(rVarH, 6).getLarge();
                            i19 &= -234881025;
                        } else {
                            y2VarA = y2Var;
                        }
                        if ((i18 & 512) != 0) {
                            fB = r.f1893a.b();
                            i19 &= -1879048193;
                        } else {
                            fB = f15;
                        }
                        if ((i18 & 1024) != 0) {
                            i55 &= -15;
                            jL = m2.f1788a.a(rVarH, 6).l();
                        } else {
                            jL = j15;
                        }
                        if ((i18 & 2048) != 0) {
                            jD = c1.d(jL, rVarH, i55 & 14);
                            i55 &= -113;
                        } else {
                            jD = j16;
                        }
                        i57 = i55;
                        pVar = pVar6;
                        if ((i18 & PKIFailureInfo.certConfirmed) != 0) {
                            fC = r.f1893a.c();
                            i57 &= -897;
                        } else {
                            fC = f16;
                        }
                        f19 = fC;
                        if ((i18 & PKIFailureInfo.certRevoked) != 0) {
                            jA = m2.f1788a.a(rVarH, 6).a();
                            i58 = i57 & (-7169);
                        } else {
                            i58 = i57;
                        }
                        if ((i18 & 16384) != 0) {
                            long jD10 = c1.d(jA, rVarH, (i58 >> 9) & 14);
                            i58 &= -57345;
                            j28 = jD10;
                        } else {
                            j28 = j18;
                        }
                        j29 = jA;
                        j35 = jL;
                        z16 = z16;
                        i59 = i19;
                    }
                    i65 = i58;
                    final p pVar19 = pVar;
                    rVarH.y();
                    if (t.k()) {
                        t.o(194495313, i59, i65, "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:336)");
                    }
                    m mVarF5 = androidx.compose.foundation.layout.d.f(mVar2, 0.0f, 1, null);
                    final float f213 = f19;
                    final long j3112 = j35;
                    final q qVar9 = qVarF;
                    final int i719 = iB;
                    final p pVar110 = pVar3;
                    final y2 y2Var7 = y2VarA;
                    final k0 k0Var7 = k0VarL;
                    final boolean z113 = z16;
                    final long j3113 = jD;
                    float f214 = fB;
                    y2.f fVarD5 = y2.m.d(-747577963, true, new p() { // from class: a2.a0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i0.u(k0Var7, pVar19, pVar110, f213, i719, qVar3, z113, y2Var7, fB, j3112, j3113, qVar, qVar9, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54);
                    int i7110 = i65 >> 3;
                    long j3114 = j29;
                    long j3115 = j28;
                    f5.f(mVarF5, null, j3114, j3115, null, 0.0f, fVarD5, rVarH, (i7110 & 7168) | (i7110 & 896) | 1572864, 50);
                    rVar2 = rVarH;
                    if (t.k()) {
                        t.n();
                    }
                    pVar4 = pVar19;
                    z18 = z16;
                    f18 = f213;
                    p<? super p076m2.r, ? super Integer, oq.i0> pVar111 = pVar3;
                    f17 = f214;
                    k0Var2 = k0VarL;
                    j27 = jD;
                    j19 = j3115;
                    j25 = j3114;
                    mVar3 = mVar2;
                    long j49 = j35;
                    qVar4 = qVarF;
                    i56 = iB;
                    pVar5 = pVar111;
                    y2Var2 = y2VarA;
                    j26 = j49;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    pVar4 = pVar;
                    y2Var2 = y2Var;
                    j19 = j18;
                    j25 = jA;
                    qVar4 = qVarF;
                    pVar5 = pVar3;
                    i56 = i39;
                    mVar3 = mVar2;
                    k0Var2 = k0VarL;
                    z18 = z16;
                    f17 = f15;
                    j26 = j15;
                    j27 = j16;
                    f18 = f16;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: a2.b0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return i0.z(qVar, mVar3, k0Var2, pVar4, qVar4, pVar5, i56, z18, y2Var2, f17, j26, j27, f18, j25, j19, qVar3, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i19 |= 24576;
            qVarF = qVar2;
            i36 = i18 & 32;
            if (i36 != 0) {
                i19 |= 196608;
                pVar3 = pVar2;
            } else {
                pVar3 = pVar2;
                if ((i16 & 196608) == 0) {
                    if (rVarH.G(pVar3)) {
                        i37 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i37 = PKIFailureInfo.notAuthorized;
                    }
                    i19 |= i37;
                }
            }
            i38 = i18 & 64;
            if (i38 != 0) {
                i19 |= 1572864;
                i39 = i15;
            } else {
                i39 = i15;
                if ((i16 & 1572864) == 0) {
                    if (rVarH.c(i39)) {
                        i45 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    }
                    i19 |= i45;
                }
            }
            i46 = i18 & 128;
            if (i46 != 0) {
                i19 |= 12582912;
                z16 = z15;
            } else {
                z16 = z15;
                if ((i16 & 12582912) == 0) {
                    if (rVarH.a(z16)) {
                        i47 = 8388608;
                    } else {
                        i47 = 4194304;
                    }
                    i19 |= i47;
                }
            }
            if ((i16 & 100663296) != 0) {
                i19 |= ((i18 & 256) == 0 || !rVarH.W(y2Var)) ? 33554432 : 67108864;
            }
            if ((i16 & 805306368) != 0) {
                i19 |= ((i18 & 512) == 0 || !rVarH.b(f15)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            if ((i17 & 6) == 0) {
                if ((i18 & 1024) == 0) {
                    i68 = 2;
                } else {
                    i68 = 2;
                }
                i48 = i17 | i68;
            } else {
                i48 = i17;
            }
            if ((i17 & 48) == 0) {
                int i7111 = i48;
                if ((i18 & 2048) == 0) {
                    i67 = 16;
                } else {
                    i67 = 16;
                }
                i48 = i7111 | i67;
            }
            i49 = i48;
            if ((i17 & MLKEMEngine.KyberPolyBytes) == 0) {
                i55 = i49 | (((i18 & PKIFailureInfo.certConfirmed) == 0 || !rVarH.b(f16)) ? 128 : 256);
            } else {
                i55 = i49;
            }
            if ((i17 & 3072) == 0) {
                jA = j17;
                if ((i18 & PKIFailureInfo.certRevoked) == 0) {
                    i26 = 2048;
                }
                i55 |= i26;
            } else {
                jA = j17;
            }
            if ((i17 & 24576) != 0) {
                if ((i18 & 16384) == 0) {
                    i29 = 16384;
                }
                i55 |= i29;
            }
            if ((i17 & 196608) == 0) {
                if (rVarH.G(qVar3)) {
                    i66 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i66 = PKIFailureInfo.notAuthorized;
                }
                i55 |= i66;
            }
            if ((306783379 & i19) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (rVarH.r(z17, i19 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0) {
                    if (i69 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i18 & 4) != 0) {
                        i19 &= -897;
                        k0VarL = L(null, null, rVarH, 0, 3);
                    }
                    if (i25 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar;
                    }
                    if (i28 != 0) {
                        qVarF = g1.f1556a.f();
                    }
                    if (i36 != 0) {
                        pVar3 = null;
                    }
                    if (i38 != 0) {
                        iB = c2.INSTANCE.b();
                    } else {
                        iB = i39;
                    }
                    if (i46 != 0) {
                        z16 = true;
                    }
                    if ((i18 & 256) != 0) {
                        y2VarA = m2.f1788a.b(rVarH, 6).getLarge();
                        i19 &= -234881025;
                    } else {
                        y2VarA = y2Var;
                    }
                    if ((i18 & 512) != 0) {
                        fB = r.f1893a.b();
                        i19 &= -1879048193;
                    } else {
                        fB = f15;
                    }
                    if ((i18 & 1024) != 0) {
                        i55 &= -15;
                        jL = m2.f1788a.a(rVarH, 6).l();
                    } else {
                        jL = j15;
                    }
                    if ((i18 & 2048) != 0) {
                        jD = c1.d(jL, rVarH, i55 & 14);
                        i55 &= -113;
                    } else {
                        jD = j16;
                    }
                    i57 = i55;
                    pVar = pVar6;
                    if ((i18 & PKIFailureInfo.certConfirmed) != 0) {
                        fC = r.f1893a.c();
                        i57 &= -897;
                    } else {
                        fC = f16;
                    }
                    f19 = fC;
                    if ((i18 & PKIFailureInfo.certRevoked) != 0) {
                        jA = m2.f1788a.a(rVarH, 6).a();
                        i58 = i57 & (-7169);
                    } else {
                        i58 = i57;
                    }
                    if ((i18 & 16384) != 0) {
                        long jD11 = c1.d(jA, rVarH, (i58 >> 9) & 14);
                        i58 &= -57345;
                        j28 = jD11;
                    } else {
                        j28 = j18;
                    }
                    j29 = jA;
                    j35 = jL;
                    z16 = z16;
                    i59 = i19;
                } else {
                    if (i69 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i18 & 4) != 0) {
                        i19 &= -897;
                        k0VarL = L(null, null, rVarH, 0, 3);
                    }
                    if (i25 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar;
                    }
                    if (i28 != 0) {
                        qVarF = g1.f1556a.f();
                    }
                    if (i36 != 0) {
                        pVar3 = null;
                    }
                    if (i38 != 0) {
                        iB = c2.INSTANCE.b();
                    } else {
                        iB = i39;
                    }
                    if (i46 != 0) {
                        z16 = true;
                    }
                    if ((i18 & 256) != 0) {
                        y2VarA = m2.f1788a.b(rVarH, 6).getLarge();
                        i19 &= -234881025;
                    } else {
                        y2VarA = y2Var;
                    }
                    if ((i18 & 512) != 0) {
                        fB = r.f1893a.b();
                        i19 &= -1879048193;
                    } else {
                        fB = f15;
                    }
                    if ((i18 & 1024) != 0) {
                        i55 &= -15;
                        jL = m2.f1788a.a(rVarH, 6).l();
                    } else {
                        jL = j15;
                    }
                    if ((i18 & 2048) != 0) {
                        jD = c1.d(jL, rVarH, i55 & 14);
                        i55 &= -113;
                    } else {
                        jD = j16;
                    }
                    i57 = i55;
                    pVar = pVar6;
                    if ((i18 & PKIFailureInfo.certConfirmed) != 0) {
                        fC = r.f1893a.c();
                        i57 &= -897;
                    } else {
                        fC = f16;
                    }
                    f19 = fC;
                    if ((i18 & PKIFailureInfo.certRevoked) != 0) {
                        jA = m2.f1788a.a(rVarH, 6).a();
                        i58 = i57 & (-7169);
                    } else {
                        i58 = i57;
                    }
                    if ((i18 & 16384) != 0) {
                        long jD12 = c1.d(jA, rVarH, (i58 >> 9) & 14);
                        i58 &= -57345;
                        j28 = jD12;
                    } else {
                        j28 = j18;
                    }
                    j29 = jA;
                    j35 = jL;
                    z16 = z16;
                    i59 = i19;
                }
                i65 = i58;
                final p pVar112 = pVar;
                rVarH.y();
                if (t.k()) {
                    t.o(194495313, i59, i65, "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:336)");
                }
                m mVarF6 = androidx.compose.foundation.layout.d.f(mVar2, 0.0f, 1, null);
                final float f215 = f19;
                final long j3116 = j35;
                final q qVar10 = qVarF;
                final int i7112 = iB;
                final p pVar113 = pVar3;
                final y2 y2Var8 = y2VarA;
                final k0 k0Var8 = k0VarL;
                final boolean z114 = z16;
                final long j3117 = jD;
                float f216 = fB;
                y2.f fVarD6 = y2.m.d(-747577963, true, new p() { // from class: a2.a0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i0.u(k0Var8, pVar112, pVar113, f215, i7112, qVar3, z114, y2Var8, fB, j3116, j3117, qVar, qVar10, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54);
                int i7113 = i65 >> 3;
                long j3118 = j29;
                long j3119 = j28;
                f5.f(mVarF6, null, j3118, j3119, null, 0.0f, fVarD6, rVarH, (i7113 & 7168) | (i7113 & 896) | 1572864, 50);
                rVar2 = rVarH;
                if (t.k()) {
                    t.n();
                }
                pVar4 = pVar112;
                z18 = z16;
                f18 = f215;
                p<? super p076m2.r, ? super Integer, oq.i0> pVar114 = pVar3;
                f17 = f216;
                k0Var2 = k0VarL;
                j27 = jD;
                j19 = j3119;
                j25 = j3118;
                mVar3 = mVar2;
                long j410 = j35;
                qVar4 = qVarF;
                i56 = iB;
                pVar5 = pVar114;
                y2Var2 = y2VarA;
                j26 = j410;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                pVar4 = pVar;
                y2Var2 = y2Var;
                j19 = j18;
                j25 = jA;
                qVar4 = qVarF;
                pVar5 = pVar3;
                i56 = i39;
                mVar3 = mVar2;
                k0Var2 = k0VarL;
                z18 = z16;
                f17 = f15;
                j26 = j15;
                j27 = j16;
                f18 = f16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a2.b0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i0.z(qVar, mVar3, k0Var2, pVar4, qVar4, pVar5, i56, z18, y2Var2, f17, j26, j27, f18, j25, j19, qVar3, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 |= 3072;
        i28 = i18 & 16;
        i29 = PKIFailureInfo.certRevoked;
        if (i28 != 0) {
            if ((i16 & 24576) == 0) {
                qVarF = qVar2;
                if (rVarH.G(qVarF)) {
                    i35 = 16384;
                } else {
                    i35 = 8192;
                }
                i19 |= i35;
            }
            i36 = i18 & 32;
            if (i36 != 0) {
                i19 |= 196608;
                pVar3 = pVar2;
            } else {
                pVar3 = pVar2;
                if ((i16 & 196608) == 0) {
                    if (rVarH.G(pVar3)) {
                        i37 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i37 = PKIFailureInfo.notAuthorized;
                    }
                    i19 |= i37;
                }
            }
            i38 = i18 & 64;
            if (i38 != 0) {
                i19 |= 1572864;
                i39 = i15;
            } else {
                i39 = i15;
                if ((i16 & 1572864) == 0) {
                    if (rVarH.c(i39)) {
                        i45 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    }
                    i19 |= i45;
                }
            }
            i46 = i18 & 128;
            if (i46 != 0) {
                i19 |= 12582912;
                z16 = z15;
            } else {
                z16 = z15;
                if ((i16 & 12582912) == 0) {
                    if (rVarH.a(z16)) {
                        i47 = 8388608;
                    } else {
                        i47 = 4194304;
                    }
                    i19 |= i47;
                }
            }
            if ((i16 & 100663296) != 0) {
                i19 |= ((i18 & 256) == 0 || !rVarH.W(y2Var)) ? 33554432 : 67108864;
            }
            if ((i16 & 805306368) != 0) {
                i19 |= ((i18 & 512) == 0 || !rVarH.b(f15)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            if ((i17 & 6) == 0) {
                if ((i18 & 1024) == 0) {
                    i68 = 2;
                } else {
                    i68 = 2;
                }
                i48 = i17 | i68;
            } else {
                i48 = i17;
            }
            if ((i17 & 48) == 0) {
                int i7114 = i48;
                if ((i18 & 2048) == 0) {
                    i67 = 16;
                } else {
                    i67 = 16;
                }
                i48 = i7114 | i67;
            }
            i49 = i48;
            if ((i17 & MLKEMEngine.KyberPolyBytes) == 0) {
                i55 = i49 | (((i18 & PKIFailureInfo.certConfirmed) == 0 || !rVarH.b(f16)) ? 128 : 256);
            } else {
                i55 = i49;
            }
            if ((i17 & 3072) == 0) {
                jA = j17;
                if ((i18 & PKIFailureInfo.certRevoked) == 0) {
                    i26 = 2048;
                }
                i55 |= i26;
            } else {
                jA = j17;
            }
            if ((i17 & 24576) != 0) {
                if ((i18 & 16384) == 0) {
                    i29 = 16384;
                }
                i55 |= i29;
            }
            if ((i17 & 196608) == 0) {
                if (rVarH.G(qVar3)) {
                    i66 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i66 = PKIFailureInfo.notAuthorized;
                }
                i55 |= i66;
            }
            if ((306783379 & i19) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (rVarH.r(z17, i19 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0) {
                    if (i69 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i18 & 4) != 0) {
                        i19 &= -897;
                        k0VarL = L(null, null, rVarH, 0, 3);
                    }
                    if (i25 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar;
                    }
                    if (i28 != 0) {
                        qVarF = g1.f1556a.f();
                    }
                    if (i36 != 0) {
                        pVar3 = null;
                    }
                    if (i38 != 0) {
                        iB = c2.INSTANCE.b();
                    } else {
                        iB = i39;
                    }
                    if (i46 != 0) {
                        z16 = true;
                    }
                    if ((i18 & 256) != 0) {
                        y2VarA = m2.f1788a.b(rVarH, 6).getLarge();
                        i19 &= -234881025;
                    } else {
                        y2VarA = y2Var;
                    }
                    if ((i18 & 512) != 0) {
                        fB = r.f1893a.b();
                        i19 &= -1879048193;
                    } else {
                        fB = f15;
                    }
                    if ((i18 & 1024) != 0) {
                        i55 &= -15;
                        jL = m2.f1788a.a(rVarH, 6).l();
                    } else {
                        jL = j15;
                    }
                    if ((i18 & 2048) != 0) {
                        jD = c1.d(jL, rVarH, i55 & 14);
                        i55 &= -113;
                    } else {
                        jD = j16;
                    }
                    i57 = i55;
                    pVar = pVar6;
                    if ((i18 & PKIFailureInfo.certConfirmed) != 0) {
                        fC = r.f1893a.c();
                        i57 &= -897;
                    } else {
                        fC = f16;
                    }
                    f19 = fC;
                    if ((i18 & PKIFailureInfo.certRevoked) != 0) {
                        jA = m2.f1788a.a(rVarH, 6).a();
                        i58 = i57 & (-7169);
                    } else {
                        i58 = i57;
                    }
                    if ((i18 & 16384) != 0) {
                        long jD13 = c1.d(jA, rVarH, (i58 >> 9) & 14);
                        i58 &= -57345;
                        j28 = jD13;
                    } else {
                        j28 = j18;
                    }
                    j29 = jA;
                    j35 = jL;
                    z16 = z16;
                    i59 = i19;
                } else {
                    if (i69 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if ((i18 & 4) != 0) {
                        i19 &= -897;
                        k0VarL = L(null, null, rVarH, 0, 3);
                    }
                    if (i25 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar;
                    }
                    if (i28 != 0) {
                        qVarF = g1.f1556a.f();
                    }
                    if (i36 != 0) {
                        pVar3 = null;
                    }
                    if (i38 != 0) {
                        iB = c2.INSTANCE.b();
                    } else {
                        iB = i39;
                    }
                    if (i46 != 0) {
                        z16 = true;
                    }
                    if ((i18 & 256) != 0) {
                        y2VarA = m2.f1788a.b(rVarH, 6).getLarge();
                        i19 &= -234881025;
                    } else {
                        y2VarA = y2Var;
                    }
                    if ((i18 & 512) != 0) {
                        fB = r.f1893a.b();
                        i19 &= -1879048193;
                    } else {
                        fB = f15;
                    }
                    if ((i18 & 1024) != 0) {
                        i55 &= -15;
                        jL = m2.f1788a.a(rVarH, 6).l();
                    } else {
                        jL = j15;
                    }
                    if ((i18 & 2048) != 0) {
                        jD = c1.d(jL, rVarH, i55 & 14);
                        i55 &= -113;
                    } else {
                        jD = j16;
                    }
                    i57 = i55;
                    pVar = pVar6;
                    if ((i18 & PKIFailureInfo.certConfirmed) != 0) {
                        fC = r.f1893a.c();
                        i57 &= -897;
                    } else {
                        fC = f16;
                    }
                    f19 = fC;
                    if ((i18 & PKIFailureInfo.certRevoked) != 0) {
                        jA = m2.f1788a.a(rVarH, 6).a();
                        i58 = i57 & (-7169);
                    } else {
                        i58 = i57;
                    }
                    if ((i18 & 16384) != 0) {
                        long jD14 = c1.d(jA, rVarH, (i58 >> 9) & 14);
                        i58 &= -57345;
                        j28 = jD14;
                    } else {
                        j28 = j18;
                    }
                    j29 = jA;
                    j35 = jL;
                    z16 = z16;
                    i59 = i19;
                }
                i65 = i58;
                final p pVar115 = pVar;
                rVarH.y();
                if (t.k()) {
                    t.o(194495313, i59, i65, "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:336)");
                }
                m mVarF7 = androidx.compose.foundation.layout.d.f(mVar2, 0.0f, 1, null);
                final float f217 = f19;
                final long j31110 = j35;
                final q qVar11 = qVarF;
                final int i7115 = iB;
                final p pVar116 = pVar3;
                final y2 y2Var9 = y2VarA;
                final k0 k0Var9 = k0VarL;
                final boolean z115 = z16;
                final long j31111 = jD;
                float f218 = fB;
                y2.f fVarD7 = y2.m.d(-747577963, true, new p() { // from class: a2.a0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i0.u(k0Var9, pVar115, pVar116, f217, i7115, qVar3, z115, y2Var9, fB, j31110, j31111, qVar, qVar11, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54);
                int i7116 = i65 >> 3;
                long j31112 = j29;
                long j31113 = j28;
                f5.f(mVarF7, null, j31112, j31113, null, 0.0f, fVarD7, rVarH, (i7116 & 7168) | (i7116 & 896) | 1572864, 50);
                rVar2 = rVarH;
                if (t.k()) {
                    t.n();
                }
                pVar4 = pVar115;
                z18 = z16;
                f18 = f217;
                p<? super p076m2.r, ? super Integer, oq.i0> pVar117 = pVar3;
                f17 = f218;
                k0Var2 = k0VarL;
                j27 = jD;
                j19 = j31113;
                j25 = j31112;
                mVar3 = mVar2;
                long j411 = j35;
                qVar4 = qVarF;
                i56 = iB;
                pVar5 = pVar117;
                y2Var2 = y2VarA;
                j26 = j411;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                pVar4 = pVar;
                y2Var2 = y2Var;
                j19 = j18;
                j25 = jA;
                qVar4 = qVarF;
                pVar5 = pVar3;
                i56 = i39;
                mVar3 = mVar2;
                k0Var2 = k0VarL;
                z18 = z16;
                f17 = f15;
                j26 = j15;
                j27 = j16;
                f18 = f16;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a2.b0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return i0.z(qVar, mVar3, k0Var2, pVar4, qVar4, pVar5, i56, z18, y2Var2, f17, j26, j27, f18, j25, j19, qVar3, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i19 |= 24576;
        qVarF = qVar2;
        i36 = i18 & 32;
        if (i36 != 0) {
            i19 |= 196608;
            pVar3 = pVar2;
        } else {
            pVar3 = pVar2;
            if ((i16 & 196608) == 0) {
                if (rVarH.G(pVar3)) {
                    i37 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i37 = PKIFailureInfo.notAuthorized;
                }
                i19 |= i37;
            }
        }
        i38 = i18 & 64;
        if (i38 != 0) {
            i19 |= 1572864;
            i39 = i15;
        } else {
            i39 = i15;
            if ((i16 & 1572864) == 0) {
                if (rVarH.c(i39)) {
                    i45 = PKIFailureInfo.badCertTemplate;
                } else {
                    i45 = PKIFailureInfo.signerNotTrusted;
                }
                i19 |= i45;
            }
        }
        i46 = i18 & 128;
        if (i46 != 0) {
            i19 |= 12582912;
            z16 = z15;
        } else {
            z16 = z15;
            if ((i16 & 12582912) == 0) {
                if (rVarH.a(z16)) {
                    i47 = 8388608;
                } else {
                    i47 = 4194304;
                }
                i19 |= i47;
            }
        }
        if ((i16 & 100663296) != 0) {
            i19 |= ((i18 & 256) == 0 || !rVarH.W(y2Var)) ? 33554432 : 67108864;
        }
        if ((i16 & 805306368) != 0) {
            i19 |= ((i18 & 512) == 0 || !rVarH.b(f15)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
        }
        if ((i17 & 6) == 0) {
            if ((i18 & 1024) == 0) {
                i68 = 2;
            } else {
                i68 = 2;
            }
            i48 = i17 | i68;
        } else {
            i48 = i17;
        }
        if ((i17 & 48) == 0) {
            int i7117 = i48;
            if ((i18 & 2048) == 0) {
                i67 = 16;
            } else {
                i67 = 16;
            }
            i48 = i7117 | i67;
        }
        i49 = i48;
        if ((i17 & MLKEMEngine.KyberPolyBytes) == 0) {
            i55 = i49 | (((i18 & PKIFailureInfo.certConfirmed) == 0 || !rVarH.b(f16)) ? 128 : 256);
        } else {
            i55 = i49;
        }
        if ((i17 & 3072) == 0) {
            jA = j17;
            if ((i18 & PKIFailureInfo.certRevoked) == 0) {
                i26 = 2048;
            }
            i55 |= i26;
        } else {
            jA = j17;
        }
        if ((i17 & 24576) != 0) {
            if ((i18 & 16384) == 0) {
                i29 = 16384;
            }
            i55 |= i29;
        }
        if ((i17 & 196608) == 0) {
            if (rVarH.G(qVar3)) {
                i66 = PKIFailureInfo.unsupportedVersion;
            } else {
                i66 = PKIFailureInfo.notAuthorized;
            }
            i55 |= i66;
        }
        if ((306783379 & i19) == 306783378) {
            z17 = true;
        } else {
            z17 = true;
        }
        if (rVarH.r(z17, i19 & 1)) {
            rVarH.I();
            if ((i16 & 1) != 0) {
                if (i69 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if ((i18 & 4) != 0) {
                    i19 &= -897;
                    k0VarL = L(null, null, rVarH, 0, 3);
                }
                if (i25 != 0) {
                    pVar6 = null;
                } else {
                    pVar6 = pVar;
                }
                if (i28 != 0) {
                    qVarF = g1.f1556a.f();
                }
                if (i36 != 0) {
                    pVar3 = null;
                }
                if (i38 != 0) {
                    iB = c2.INSTANCE.b();
                } else {
                    iB = i39;
                }
                if (i46 != 0) {
                    z16 = true;
                }
                if ((i18 & 256) != 0) {
                    y2VarA = m2.f1788a.b(rVarH, 6).getLarge();
                    i19 &= -234881025;
                } else {
                    y2VarA = y2Var;
                }
                if ((i18 & 512) != 0) {
                    fB = r.f1893a.b();
                    i19 &= -1879048193;
                } else {
                    fB = f15;
                }
                if ((i18 & 1024) != 0) {
                    i55 &= -15;
                    jL = m2.f1788a.a(rVarH, 6).l();
                } else {
                    jL = j15;
                }
                if ((i18 & 2048) != 0) {
                    jD = c1.d(jL, rVarH, i55 & 14);
                    i55 &= -113;
                } else {
                    jD = j16;
                }
                i57 = i55;
                pVar = pVar6;
                if ((i18 & PKIFailureInfo.certConfirmed) != 0) {
                    fC = r.f1893a.c();
                    i57 &= -897;
                } else {
                    fC = f16;
                }
                f19 = fC;
                if ((i18 & PKIFailureInfo.certRevoked) != 0) {
                    jA = m2.f1788a.a(rVarH, 6).a();
                    i58 = i57 & (-7169);
                } else {
                    i58 = i57;
                }
                if ((i18 & 16384) != 0) {
                    long jD15 = c1.d(jA, rVarH, (i58 >> 9) & 14);
                    i58 &= -57345;
                    j28 = jD15;
                } else {
                    j28 = j18;
                }
                j29 = jA;
                j35 = jL;
                z16 = z16;
                i59 = i19;
            } else {
                if (i69 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if ((i18 & 4) != 0) {
                    i19 &= -897;
                    k0VarL = L(null, null, rVarH, 0, 3);
                }
                if (i25 != 0) {
                    pVar6 = null;
                } else {
                    pVar6 = pVar;
                }
                if (i28 != 0) {
                    qVarF = g1.f1556a.f();
                }
                if (i36 != 0) {
                    pVar3 = null;
                }
                if (i38 != 0) {
                    iB = c2.INSTANCE.b();
                } else {
                    iB = i39;
                }
                if (i46 != 0) {
                    z16 = true;
                }
                if ((i18 & 256) != 0) {
                    y2VarA = m2.f1788a.b(rVarH, 6).getLarge();
                    i19 &= -234881025;
                } else {
                    y2VarA = y2Var;
                }
                if ((i18 & 512) != 0) {
                    fB = r.f1893a.b();
                    i19 &= -1879048193;
                } else {
                    fB = f15;
                }
                if ((i18 & 1024) != 0) {
                    i55 &= -15;
                    jL = m2.f1788a.a(rVarH, 6).l();
                } else {
                    jL = j15;
                }
                if ((i18 & 2048) != 0) {
                    jD = c1.d(jL, rVarH, i55 & 14);
                    i55 &= -113;
                } else {
                    jD = j16;
                }
                i57 = i55;
                pVar = pVar6;
                if ((i18 & PKIFailureInfo.certConfirmed) != 0) {
                    fC = r.f1893a.c();
                    i57 &= -897;
                } else {
                    fC = f16;
                }
                f19 = fC;
                if ((i18 & PKIFailureInfo.certRevoked) != 0) {
                    jA = m2.f1788a.a(rVarH, 6).a();
                    i58 = i57 & (-7169);
                } else {
                    i58 = i57;
                }
                if ((i18 & 16384) != 0) {
                    long jD16 = c1.d(jA, rVarH, (i58 >> 9) & 14);
                    i58 &= -57345;
                    j28 = jD16;
                } else {
                    j28 = j18;
                }
                j29 = jA;
                j35 = jL;
                z16 = z16;
                i59 = i19;
            }
            i65 = i58;
            final p pVar118 = pVar;
            rVarH.y();
            if (t.k()) {
                t.o(194495313, i59, i65, "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:336)");
            }
            m mVarF8 = androidx.compose.foundation.layout.d.f(mVar2, 0.0f, 1, null);
            final float f219 = f19;
            final long j31114 = j35;
            final q qVar12 = qVarF;
            final int i7118 = iB;
            final p pVar119 = pVar3;
            final y2 y2Var10 = y2VarA;
            final k0 k0Var10 = k0VarL;
            final boolean z116 = z16;
            final long j31115 = jD;
            float f2110 = fB;
            y2.f fVarD8 = y2.m.d(-747577963, true, new p() { // from class: a2.a0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i0.u(k0Var10, pVar118, pVar119, f219, i7118, qVar3, z116, y2Var10, fB, j31114, j31115, qVar, qVar12, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54);
            int i7119 = i65 >> 3;
            long j31116 = j29;
            long j31117 = j28;
            f5.f(mVarF8, null, j31116, j31117, null, 0.0f, fVarD8, rVarH, (i7119 & 7168) | (i7119 & 896) | 1572864, 50);
            rVar2 = rVarH;
            if (t.k()) {
                t.n();
            }
            pVar4 = pVar118;
            z18 = z16;
            f18 = f219;
            p<? super p076m2.r, ? super Integer, oq.i0> pVar1110 = pVar3;
            f17 = f2110;
            k0Var2 = k0VarL;
            j27 = jD;
            j19 = j31117;
            j25 = j31116;
            mVar3 = mVar2;
            long j412 = j35;
            qVar4 = qVarF;
            i56 = iB;
            pVar5 = pVar1110;
            y2Var2 = y2VarA;
            j26 = j412;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            pVar4 = pVar;
            y2Var2 = y2Var;
            j19 = j18;
            j25 = jA;
            qVar4 = qVarF;
            pVar5 = pVar3;
            i56 = i39;
            mVar3 = mVar2;
            k0Var2 = k0VarL;
            z18 = z16;
            f17 = f15;
            j26 = j15;
            j27 = j16;
            f18 = f16;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a2.b0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i0.z(qVar, mVar3, k0Var2, pVar4, qVar4, pVar5, i56, z18, y2Var2, f17, j26, j27, f18, j25, j19, qVar3, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void s(final p<? super p076m2.r, ? super Integer, oq.i0> pVar, final p<? super p076m2.r, ? super Integer, oq.i0> pVar2, final p<? super p076m2.r, ? super Integer, oq.i0> pVar3, final p<? super p076m2.r, ? super Integer, oq.i0> pVar4, final p<? super p076m2.r, ? super Integer, oq.i0> pVar5, final float f15, final er.a<Float> aVar, final int i15, final p0 p0Var, p076m2.r rVar, final int i16) {
        int i17;
        p076m2.r rVarH = rVar.h(757616750);
        if ((i16 & 6) == 0) {
            i17 = (rVarH.G(pVar) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= rVarH.G(pVar2) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.G(pVar3) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i17 |= rVarH.G(pVar4) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            i17 |= rVarH.G(pVar5) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i16) == 0) {
            i17 |= rVarH.b(f15) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((1572864 & i16) == 0) {
            i17 |= rVarH.G(aVar) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i16) == 0) {
            i17 |= rVarH.c(i15) ? 8388608 : 4194304;
        }
        if ((100663296 & i16) == 0) {
            i17 |= rVarH.W(p0Var) ? 67108864 : 33554432;
        }
        if (rVarH.r((38347923 & i17) != 38347922, i17 & 1)) {
            if (t.k()) {
                t.o(757616750, i17, -1, "androidx.compose.material.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:469)");
            }
            List listQ = v.q(pVar == null ? g1.f1556a.d() : pVar, pVar2, pVar3, pVar4 == null ? g1.f1556a.e() : pVar4, pVar5);
            boolean z15 = ((3670016 & i17) == 1048576) | ((29360128 & i17) == 8388608) | ((458752 & i17) == 131072) | ((i17 & 234881024) == 67108864);
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new c(aVar, i15, f15, p0Var);
                rVarH.v(objE);
            }
            c1 c1Var = (c1) objE;
            m.Companion companion = m.INSTANCE;
            p<p076m2.r, Integer, oq.i0> pVarB = j0.b(listQ);
            boolean zW = rVarH.W(c1Var);
            Object objE2 = rVarH.E();
            if (zW || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = e1.a(c1Var);
                rVarH.v(objE2);
            }
            w0 w0Var = (w0) objE2;
            int iA = p076m2.m.a(rVarH, 0);
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, companion);
            androidx.compose.ui.node.c.Companion aVar2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = aVar2.b();
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
            n6.i(rVarC, w0Var, aVar2.d());
            n6.i(rVarC, e0VarT, aVar2.f());
            p<androidx.compose.ui.node.c, Integer, oq.i0> pVarC = aVar2.c();
            if (rVarC.getInserting() || !fr.t.c(rVarC.E(), Integer.valueOf(iA))) {
                rVarC.v(Integer.valueOf(iA));
                rVarC.j(Integer.valueOf(iA), pVarC);
            }
            n6.i(rVarC, mVarE, aVar2.e());
            pVarB.B(rVarH, 0);
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a2.g0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i0.t(pVar, pVar2, pVar3, pVar4, pVar5, f15, aVar, i15, p0Var, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(p pVar, p pVar2, p pVar3, p pVar4, p pVar5, float f15, er.a aVar, int i15, p0 p0Var, int i16, p076m2.r rVar, int i17) {
        s(pVar, pVar2, pVar3, pVar4, pVar5, f15, aVar, i15, p0Var, rVar, g4.a(i16 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(final k0 k0Var, p pVar, p pVar2, final float f15, int i15, final q qVar, final boolean z15, final y2 y2Var, final float f16, final long j15, final long j16, final q qVar2, final q qVar3, p076m2.r rVar, int i16) {
        if (rVar.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-747577963, i16, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:338)");
            }
            p0 p0VarA = k0Var.getBottomSheetState();
            y2.f fVarD = y2.m.d(601061661, true, new p() { // from class: a2.c0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i0.v(qVar, f15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54);
            y2.f fVarD2 = y2.m.d(1835125948, true, new p() { // from class: a2.d0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i0.w(z15, k0Var, f15, y2Var, f16, j15, j16, qVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54);
            y2.f fVarD3 = y2.m.d(8287226, true, new p() { // from class: a2.e0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i0.x(qVar3, k0Var, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54);
            boolean zW = rVar.W(k0Var);
            Object objE = rVar.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: a2.f0
                    @Override // er.a
                    public final Object a() {
                        return Float.valueOf(i0.y(k0Var));
                    }
                };
                rVar.v(objE);
            }
            s(pVar, fVarD, fVarD2, pVar2, fVarD3, f15, (er.a) objE, i15, p0VarA, rVar, 25008);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(q qVar, float f15, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(601061661, i15, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:340)");
            }
            qVar.w(a3.i(0.0f, 0.0f, 0.0f, f15, 7, null), rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(boolean z15, k0 k0Var, float f15, y2 y2Var, float f16, long j15, long j16, q qVar, p076m2.r rVar, int i15) {
        m mVarB;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1835125948, i15, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:342)");
            }
            if (z15) {
                rVar.X(-401495582);
                m.Companion companion = m.INSTANCE;
                boolean zW = rVar.W(k0Var.getBottomSheetState().g());
                Object objE = rVar.E();
                if (zW || objE == p076m2.r.INSTANCE.a()) {
                    objE = H(k0Var.getBottomSheetState().g(), p143z0.a2.Vertical);
                    rVar.v(objE);
                }
                mVarB = z3.d.b(companion, (z3.a) objE, null, 2, null);
                rVar.R();
            } else {
                rVar.X(-1675503260);
                rVar.R();
                mVarB = m.INSTANCE;
            }
            q(k0Var.getBottomSheetState(), z15, y2Var, f16, j15, j16, f15, androidx.compose.foundation.layout.d.n(androidx.compose.foundation.layout.d.h(mVarB, 0.0f, 1, null), f15, 0.0f, 2, null), qVar, rVar, 0, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(q qVar, k0 k0Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(8287226, i15, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:366)");
            }
            qVar.w(k0Var.getSnackbarHostState(), rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float y(k0 k0Var) {
        return k0Var.getBottomSheetState().k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(q qVar, m mVar, k0 k0Var, p pVar, q qVar2, p pVar2, int i15, boolean z15, y2 y2Var, float f15, long j15, long j16, float f16, long j17, long j18, q qVar3, int i16, int i17, int i18, p076m2.r rVar, int i19) {
        r(qVar, mVar, k0Var, pVar, qVar2, pVar2, i15, z15, y2Var, f15, j15, j16, f16, j17, j18, qVar3, rVar, g4.a(i16 | 1), g4.a(i17), i18);
        return oq.i0.f148189a;
    }
}
