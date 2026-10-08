package g30;

import android.content.res.Configuration;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d1.a3;
import d1.d3;
import d1.h0;
import d1.r3;
import d1.x;
import i30.ButtonIconData;
import i50.BaseScaffoldData;
import ju.p0;
import l1.RoundedCornerShape;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.C6454df;
import p046f2.hj;
import p046f2.ij;
import p046f2.vb;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.x5;
import p143z0.v2;
import w0.q0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001ay\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lg30/n;", "bottomSheetData", "Li50/a;", "baseScaffoldData", "Lc5/h;", "horizontalSheetPadding", "Lz0/v2;", "scrollableState", "Lkotlin/Function0;", "Loq/i0;", "snackBarHost", "bottomBarContent", "bottomSheetContent", "Lkotlin/Function1;", "Ld1/d3;", "innerContent", "j", "(Lg30/n;Li50/a;FLz0/v2;Ler/p;Ler/p;Ler/p;Ler/q;Lm2/r;II)V", "data", "p", "(Lg30/n;Ler/p;FLm2/r;I)V", "h", "(Lm2/r;I)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f70183e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ hj f70184f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f70185g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ModalBottomSheetData f70186h;

        /* JADX INFO: renamed from: g30.m$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf2/ij;", "it", "", "<anonymous>", "(Lf2/ij;)Z"}, k = 3, mv = {2, 2, 0})
        static final class C1593a extends vq.k implements er.p<ij, tq.e<? super Boolean>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f70187e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f70188f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1593a(boolean z15, tq.e<? super C1593a> eVar) {
                super(2, eVar);
                this.f70188f = z15;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f70187e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return vq.b.a(!this.f70188f);
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ij ijVar, tq.e<? super Boolean> eVar) {
                return ((C1593a) v(ijVar, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new C1593a(this.f70188f, eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ModalBottomSheetData f70189a;

            /* JADX INFO: renamed from: g30.m$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C1594a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f70190a;

                static {
                    int[] iArr = new int[ij.values().length];
                    try {
                        iArr[ij.Hidden.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ij.Expanded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ij.PartiallyExpanded.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f70190a = iArr;
                }
            }

            b(ModalBottomSheetData modalBottomSheetData) {
                this.f70189a = modalBottomSheetData;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(ij ijVar, tq.e<? super i0> eVar) {
                int i15 = C1594a.f70190a[ijVar.ordinal()];
                if (i15 == 1) {
                    this.f70189a.getSheetState().a().b(v.HIDDEN);
                } else if (i15 == 2) {
                    this.f70189a.getSheetState().a().b(v.EXPANDED);
                } else {
                    if (i15 != 3) {
                        throw new oq.p();
                    }
                    this.f70189a.getSheetState().a().b(v.HALF_EXPANDED);
                }
                return i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(hj hjVar, boolean z15, ModalBottomSheetData modalBottomSheetData, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f70184f = hjVar;
            this.f70185g = z15;
            this.f70186h = modalBottomSheetData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ij O(hj hjVar) {
            return hjVar.f();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f70183e;
            if (i15 == 0) {
                oq.u.b(obj);
                final hj hjVar = this.f70184f;
                mu.g gVarS = mu.i.s(mu.i.p(x5.q(new er.a() { // from class: g30.l
                    @Override // er.a
                    public final Object a() {
                        return m.a.O(hjVar);
                    }
                })), new C1593a(this.f70185g, null));
                b bVar = new b(this.f70186h);
                this.f70183e = 1;
                if (gVarS.a(bVar, this) == objE) {
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
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f70184f, this.f70185g, this.f70186h, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f70191a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(1829855754);
            if (p076m2.t.k()) {
                p076m2.t.o(1829855754, i15, -1, "pl.gov.coi.common.ui.ds.bottomsheet.SheetContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet3.kt:170)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public static final void h(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(-583177421);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-583177421, i15, -1, "pl.gov.coi.common.ui.ds.bottomsheet.BottomSheetDragHandle (ModalBottomSheet3.kt:194)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = b1.k.a();
                rVarH.v(objE);
            }
            b1.l lVar = (b1.l) objE;
            f6<Boolean> f6VarA = b1.f.a(lVar, rVarH, 6);
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.e(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarH);
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
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            x xVar = x.f39368a;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            vb.h(androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.y(w0.i.d(k3.f.a(q0.c(t70.s.w(a3.r(companion, 0.0f, aVar.b(rVarH, i16).getSpacing100(), 0.0f, aVar.b(rVarH, i16).getSpacing100(), 5, null), f6VarA, aVar.b(rVarH, i16).getSpacing50(), 0.0f, 4, null), false, lVar, 1, null), l1.h.f(c5.h.n(2))), aVar.a(rVarH, i16).getNeutral().g(), null, 2, null), aVar.b(rVarH, i16).getSpacing400()), aVar.b(rVarH, i16).getSpacing50()), 0.0f, 0L, rVarH, 0, 6);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g30.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.i(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(int i15, p076m2.r rVar, int i16) {
        h(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x012c  */
    /* JADX WARN: Code duplicated, block: B:105:0x014b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0153  */
    /* JADX WARN: Code duplicated, block: B:109:0x015f  */
    /* JADX WARN: Code duplicated, block: B:113:0x016e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0197  */
    /* JADX WARN: Code duplicated, block: B:118:0x0199  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:126:0x020f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0218  */
    /* JADX WARN: Code duplicated, block: B:132:0x0227  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x008d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f5 A[PHI: r2 r5 r8 r12
      0x00f5: PHI (r2v34 int) = (r2v15 int), (r2v13 int), (r2v35 int) binds: [B:98:0x011b, B:88:0x00f1, B:89:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r5v24 float) = (r5v5 float), (r5v3 float), (r5v3 float) binds: [B:98:0x011b, B:88:0x00f1, B:89:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r8v8 z0.v2) = (r8v4 z0.v2), (r8v2 z0.v2), (r8v2 z0.v2) binds: [B:98:0x011b, B:88:0x00f1, B:89:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r12v7 er.p<? super m2.r, ? super java.lang.Integer, oq.i0>) = 
      (r12v4 er.p<? super m2.r, ? super java.lang.Integer, oq.i0>)
      (r12v2 er.p<? super m2.r, ? super java.lang.Integer, oq.i0>)
      (r12v2 er.p<? super m2.r, ? super java.lang.Integer, oq.i0>)
     binds: [B:98:0x011b, B:88:0x00f1, B:89:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x0100  */
    /* JADX WARN: Code duplicated, block: B:95:0x0111  */
    /* JADX WARN: Code duplicated, block: B:97:0x0114  */
    /* JADX WARN: Code duplicated, block: B:99:0x011d  */
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
    public static final void j(final ModalBottomSheetData modalBottomSheetData, final BaseScaffoldData baseScaffoldData, float f15, v2 v2Var, er.p<? super p076m2.r, ? super Integer, i0> pVar, er.p<? super p076m2.r, ? super Integer, i0> pVar2, final er.p<? super p076m2.r, ? super Integer, i0> pVar3, final er.q<? super d3, ? super p076m2.r, ? super Integer, i0> qVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        float spacing200;
        v2 v2Var2;
        int i18;
        er.p<? super p076m2.r, ? super Integer, i0> pVarD;
        int i19;
        int i25;
        er.p<? super p076m2.r, ? super Integer, i0> pVar4;
        int i26;
        er.p<? super p076m2.r, ? super Integer, i0> pVar5;
        boolean z15;
        p076m2.r rVar2;
        final float f16;
        final v2 v2Var3;
        final er.p<? super p076m2.r, ? super Integer, i0> pVar6;
        final er.p<? super p076m2.r, ? super Integer, i0> pVar7;
        d5 d5VarM;
        int i27;
        final float f17;
        v2 v2Var4;
        int i28;
        final er.p<? super p076m2.r, ? super Integer, i0> pVar8;
        boolean zC;
        Object objE;
        boolean z16;
        final boolean zBooleanValue;
        final hj hjVarY;
        boolean z17;
        boolean z18;
        Object objE2;
        int i29;
        int i35;
        p076m2.r rVarH = rVar.h(-750369464);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(modalBottomSheetData) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(baseScaffoldData) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i16 & 4) == 0) {
                spacing200 = f15;
                int i36 = rVarH.b(spacing200) ? 256 : 128;
                i17 |= i36;
            } else {
                spacing200 = f15;
            }
            i17 |= i36;
        } else {
            spacing200 = f15;
        }
        int i37 = i16 & 8;
        if (i37 == 0) {
            if ((i15 & 3072) == 0) {
                v2Var2 = v2Var;
                i17 |= rVarH.G(v2Var2) ? 2048 : 1024;
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
                        pVar4 = pVar2;
                        if (rVarH.G(pVar4)) {
                            i26 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i26 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i26;
                    }
                    if ((1572864 & i15) == 0) {
                        pVar5 = pVar3;
                        if (rVarH.G(pVar5)) {
                            i35 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i35 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i35;
                    } else {
                        pVar5 = pVar3;
                    }
                    if ((i15 & 12582912) == 0) {
                        if (rVarH.G(qVar)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i17 |= i29;
                    }
                    if ((i17 & 4793491) != 4793490) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (rVarH.r(z15, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0 || rVarH.Q()) {
                            if ((i16 & 4) != 0) {
                                i17 &= -897;
                                spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                            }
                            if (i37 != 0) {
                                v2Var2 = null;
                            }
                            if (i18 != 0) {
                                pVarD = d.f70152a.d();
                            }
                            if (i25 != 0) {
                                i27 = i17;
                                f17 = spacing200;
                                v2Var4 = v2Var2;
                                i28 = 2;
                                pVar8 = null;
                            }
                            rVarH.y();
                            if (p076m2.t.k()) {
                                p076m2.t.o(-750369464, i27, -1, "pl.gov.coi.common.ui.ds.bottomsheet.ModalBottomSheet3 (ModalBottomSheet3.kt:60)");
                            }
                            zC = rVarH.c(modalBottomSheetData.getSheetState().getValue().ordinal());
                            objE = rVarH.E();
                            if (zC || objE == p076m2.r.INSTANCE.a()) {
                                if (modalBottomSheetData.getSheetState().getValue() != v.EXPANDED || modalBottomSheetData.getSheetState().getValue() == v.HALF_EXPANDED) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                objE = Boolean.valueOf(z16);
                                rVarH.v(objE);
                            }
                            zBooleanValue = ((Boolean) objE).booleanValue();
                            hjVarY = C6454df.y(modalBottomSheetData.getSheetState().getSkipHalfExpanded(), null, rVarH, 0, i28);
                            boolean zW = rVarH.W(hjVarY) | rVarH.a(zBooleanValue);
                            if ((i27 & 14) == 4) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = zW | z17;
                            objE2 = rVarH.E();
                            if (z18 || objE2 == p076m2.r.INSTANCE.a()) {
                                objE2 = new a(hjVarY, zBooleanValue, modalBottomSheetData, null);
                                rVarH.v(objE2);
                            }
                            Function0.d(hjVarY, (er.p) objE2, rVarH, 0);
                            final er.p<? super p076m2.r, ? super Integer, i0> pVar9 = pVar5;
                            rVar2 = rVarH;
                            i50.s.r(baseScaffoldData, y2.m.d(858326717, true, new er.p() { // from class: g30.e
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return m.k(pVar8, (p076m2.r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), pVarD, 0, 0L, null, v2Var4, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1835766453, true, new er.q() { // from class: g30.f
                                @Override // er.q
                                public final Object w(Object obj, Object obj2, Object obj3) {
                                    return m.l(qVar, zBooleanValue, modalBottomSheetData, hjVarY, pVar9, f17, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                                }
                            }, rVarH, 54), rVar2, ((i27 >> 3) & 14) | 48 | ((i27 >> 6) & 896) | ((i27 << 9) & 3670016), 196608, 32696);
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            f16 = f17;
                            pVar6 = pVar8;
                            v2Var3 = v2Var4;
                        } else {
                            rVarH.O();
                            if ((i16 & 4) != 0) {
                                i17 &= -897;
                            }
                        }
                        i27 = i17;
                        f17 = spacing200;
                        v2Var4 = v2Var2;
                        pVar8 = pVar4;
                        i28 = 2;
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(-750369464, i27, -1, "pl.gov.coi.common.ui.ds.bottomsheet.ModalBottomSheet3 (ModalBottomSheet3.kt:60)");
                        }
                        zC = rVarH.c(modalBottomSheetData.getSheetState().getValue().ordinal());
                        objE = rVarH.E();
                        if (zC) {
                            if (modalBottomSheetData.getSheetState().getValue() != v.EXPANDED) {
                                z16 = true;
                            } else {
                                z16 = true;
                            }
                            objE = Boolean.valueOf(z16);
                            rVarH.v(objE);
                        } else {
                            if (modalBottomSheetData.getSheetState().getValue() != v.EXPANDED) {
                                z16 = true;
                            } else {
                                z16 = true;
                            }
                            objE = Boolean.valueOf(z16);
                            rVarH.v(objE);
                        }
                        zBooleanValue = ((Boolean) objE).booleanValue();
                        hjVarY = C6454df.y(modalBottomSheetData.getSheetState().getSkipHalfExpanded(), null, rVarH, 0, i28);
                        boolean zW2 = rVarH.W(hjVarY) | rVarH.a(zBooleanValue);
                        if ((i27 & 14) == 4) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = zW2 | z17;
                        objE2 = rVarH.E();
                        if (z18) {
                            objE2 = new a(hjVarY, zBooleanValue, modalBottomSheetData, null);
                            rVarH.v(objE2);
                        } else {
                            objE2 = new a(hjVarY, zBooleanValue, modalBottomSheetData, null);
                            rVarH.v(objE2);
                        }
                        Function0.d(hjVarY, (er.p) objE2, rVarH, 0);
                        final er.p pVar10 = pVar5;
                        rVar2 = rVarH;
                        i50.s.r(baseScaffoldData, y2.m.d(858326717, true, new er.p() { // from class: g30.e
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return m.k(pVar8, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), pVarD, 0, 0L, null, v2Var4, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1835766453, true, new er.q() { // from class: g30.f
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return m.l(qVar, zBooleanValue, modalBottomSheetData, hjVarY, pVar10, f17, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54), rVar2, ((i27 >> 3) & 14) | 48 | ((i27 >> 6) & 896) | ((i27 << 9) & 3670016), 196608, 32696);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        f16 = f17;
                        pVar6 = pVar8;
                        v2Var3 = v2Var4;
                    } else {
                        rVar2 = rVarH;
                        rVar2.O();
                        f16 = spacing200;
                        v2Var3 = v2Var2;
                        pVar6 = pVar4;
                    }
                    pVar7 = pVarD;
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new er.p() { // from class: g30.g
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return m.o(modalBottomSheetData, baseScaffoldData, f16, v2Var3, pVar7, pVar6, pVar3, qVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 196608;
                pVar4 = pVar2;
                if ((1572864 & i15) == 0) {
                    pVar5 = pVar3;
                    if (rVarH.G(pVar5)) {
                        i35 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i35 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i35;
                } else {
                    pVar5 = pVar3;
                }
                if ((i15 & 12582912) == 0) {
                    if (rVarH.G(qVar)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i17 |= i29;
                }
                if ((i17 & 4793491) != 4793490) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if ((i16 & 4) != 0) {
                            i17 &= -897;
                            spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                        }
                        if (i37 != 0) {
                            v2Var2 = null;
                        }
                        if (i18 != 0) {
                            pVarD = d.f70152a.d();
                        }
                        if (i25 != 0) {
                            i27 = i17;
                            f17 = spacing200;
                            v2Var4 = v2Var2;
                            i28 = 2;
                            pVar8 = null;
                        } else {
                            i27 = i17;
                            f17 = spacing200;
                            v2Var4 = v2Var2;
                            pVar8 = pVar4;
                            i28 = 2;
                        }
                    } else {
                        if ((i16 & 4) != 0) {
                            i17 &= -897;
                            spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                        }
                        if (i37 != 0) {
                            v2Var2 = null;
                        }
                        if (i18 != 0) {
                            pVarD = d.f70152a.d();
                        }
                        if (i25 != 0) {
                            i27 = i17;
                            f17 = spacing200;
                            v2Var4 = v2Var2;
                            i28 = 2;
                            pVar8 = null;
                        } else {
                            i27 = i17;
                            f17 = spacing200;
                            v2Var4 = v2Var2;
                            pVar8 = pVar4;
                            i28 = 2;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(-750369464, i27, -1, "pl.gov.coi.common.ui.ds.bottomsheet.ModalBottomSheet3 (ModalBottomSheet3.kt:60)");
                    }
                    zC = rVarH.c(modalBottomSheetData.getSheetState().getValue().ordinal());
                    objE = rVarH.E();
                    if (zC) {
                        if (modalBottomSheetData.getSheetState().getValue() != v.EXPANDED) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        objE = Boolean.valueOf(z16);
                        rVarH.v(objE);
                    } else {
                        if (modalBottomSheetData.getSheetState().getValue() != v.EXPANDED) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        objE = Boolean.valueOf(z16);
                        rVarH.v(objE);
                    }
                    zBooleanValue = ((Boolean) objE).booleanValue();
                    hjVarY = C6454df.y(modalBottomSheetData.getSheetState().getSkipHalfExpanded(), null, rVarH, 0, i28);
                    boolean zW3 = rVarH.W(hjVarY) | rVarH.a(zBooleanValue);
                    if ((i27 & 14) == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = zW3 | z17;
                    objE2 = rVarH.E();
                    if (z18) {
                        objE2 = new a(hjVarY, zBooleanValue, modalBottomSheetData, null);
                        rVarH.v(objE2);
                    } else {
                        objE2 = new a(hjVarY, zBooleanValue, modalBottomSheetData, null);
                        rVarH.v(objE2);
                    }
                    Function0.d(hjVarY, (er.p) objE2, rVarH, 0);
                    final er.p pVar11 = pVar5;
                    rVar2 = rVarH;
                    i50.s.r(baseScaffoldData, y2.m.d(858326717, true, new er.p() { // from class: g30.e
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return m.k(pVar8, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), pVarD, 0, 0L, null, v2Var4, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1835766453, true, new er.q() { // from class: g30.f
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return m.l(qVar, zBooleanValue, modalBottomSheetData, hjVarY, pVar11, f17, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), rVar2, ((i27 >> 3) & 14) | 48 | ((i27 >> 6) & 896) | ((i27 << 9) & 3670016), 196608, 32696);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    f16 = f17;
                    pVar6 = pVar8;
                    v2Var3 = v2Var4;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    f16 = spacing200;
                    v2Var3 = v2Var2;
                    pVar6 = pVar4;
                }
                pVar7 = pVarD;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: g30.g
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return m.o(modalBottomSheetData, baseScaffoldData, f16, v2Var3, pVar7, pVar6, pVar3, qVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            pVarD = pVar;
            i25 = i16 & 32;
            if (i25 != 0) {
                if ((196608 & i15) == 0) {
                    pVar4 = pVar2;
                    if (rVarH.G(pVar4)) {
                        i26 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i26 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i26;
                }
                if ((1572864 & i15) == 0) {
                    pVar5 = pVar3;
                    if (rVarH.G(pVar5)) {
                        i35 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i35 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i35;
                } else {
                    pVar5 = pVar3;
                }
                if ((i15 & 12582912) == 0) {
                    if (rVarH.G(qVar)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i17 |= i29;
                }
                if ((i17 & 4793491) != 4793490) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if ((i16 & 4) != 0) {
                            i17 &= -897;
                            spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                        }
                        if (i37 != 0) {
                            v2Var2 = null;
                        }
                        if (i18 != 0) {
                            pVarD = d.f70152a.d();
                        }
                        if (i25 != 0) {
                            i27 = i17;
                            f17 = spacing200;
                            v2Var4 = v2Var2;
                            i28 = 2;
                            pVar8 = null;
                        } else {
                            i27 = i17;
                            f17 = spacing200;
                            v2Var4 = v2Var2;
                            pVar8 = pVar4;
                            i28 = 2;
                        }
                    } else {
                        if ((i16 & 4) != 0) {
                            i17 &= -897;
                            spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                        }
                        if (i37 != 0) {
                            v2Var2 = null;
                        }
                        if (i18 != 0) {
                            pVarD = d.f70152a.d();
                        }
                        if (i25 != 0) {
                            i27 = i17;
                            f17 = spacing200;
                            v2Var4 = v2Var2;
                            i28 = 2;
                            pVar8 = null;
                        } else {
                            i27 = i17;
                            f17 = spacing200;
                            v2Var4 = v2Var2;
                            pVar8 = pVar4;
                            i28 = 2;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(-750369464, i27, -1, "pl.gov.coi.common.ui.ds.bottomsheet.ModalBottomSheet3 (ModalBottomSheet3.kt:60)");
                    }
                    zC = rVarH.c(modalBottomSheetData.getSheetState().getValue().ordinal());
                    objE = rVarH.E();
                    if (zC) {
                        if (modalBottomSheetData.getSheetState().getValue() != v.EXPANDED) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        objE = Boolean.valueOf(z16);
                        rVarH.v(objE);
                    } else {
                        if (modalBottomSheetData.getSheetState().getValue() != v.EXPANDED) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        objE = Boolean.valueOf(z16);
                        rVarH.v(objE);
                    }
                    zBooleanValue = ((Boolean) objE).booleanValue();
                    hjVarY = C6454df.y(modalBottomSheetData.getSheetState().getSkipHalfExpanded(), null, rVarH, 0, i28);
                    boolean zW4 = rVarH.W(hjVarY) | rVarH.a(zBooleanValue);
                    if ((i27 & 14) == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = zW4 | z17;
                    objE2 = rVarH.E();
                    if (z18) {
                        objE2 = new a(hjVarY, zBooleanValue, modalBottomSheetData, null);
                        rVarH.v(objE2);
                    } else {
                        objE2 = new a(hjVarY, zBooleanValue, modalBottomSheetData, null);
                        rVarH.v(objE2);
                    }
                    Function0.d(hjVarY, (er.p) objE2, rVarH, 0);
                    final er.p pVar12 = pVar5;
                    rVar2 = rVarH;
                    i50.s.r(baseScaffoldData, y2.m.d(858326717, true, new er.p() { // from class: g30.e
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return m.k(pVar8, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), pVarD, 0, 0L, null, v2Var4, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1835766453, true, new er.q() { // from class: g30.f
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return m.l(qVar, zBooleanValue, modalBottomSheetData, hjVarY, pVar12, f17, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), rVar2, ((i27 >> 3) & 14) | 48 | ((i27 >> 6) & 896) | ((i27 << 9) & 3670016), 196608, 32696);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    f16 = f17;
                    pVar6 = pVar8;
                    v2Var3 = v2Var4;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    f16 = spacing200;
                    v2Var3 = v2Var2;
                    pVar6 = pVar4;
                }
                pVar7 = pVarD;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: g30.g
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return m.o(modalBottomSheetData, baseScaffoldData, f16, v2Var3, pVar7, pVar6, pVar3, qVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            pVar4 = pVar2;
            if ((1572864 & i15) == 0) {
                pVar5 = pVar3;
                if (rVarH.G(pVar5)) {
                    i35 = PKIFailureInfo.badCertTemplate;
                } else {
                    i35 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i35;
            } else {
                pVar5 = pVar3;
            }
            if ((i15 & 12582912) == 0) {
                if (rVarH.G(qVar)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i17 |= i29;
            }
            if ((i17 & 4793491) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                        spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                    }
                    if (i37 != 0) {
                        v2Var2 = null;
                    }
                    if (i18 != 0) {
                        pVarD = d.f70152a.d();
                    }
                    if (i25 != 0) {
                        i27 = i17;
                        f17 = spacing200;
                        v2Var4 = v2Var2;
                        i28 = 2;
                        pVar8 = null;
                    } else {
                        i27 = i17;
                        f17 = spacing200;
                        v2Var4 = v2Var2;
                        pVar8 = pVar4;
                        i28 = 2;
                    }
                } else {
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                        spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                    }
                    if (i37 != 0) {
                        v2Var2 = null;
                    }
                    if (i18 != 0) {
                        pVarD = d.f70152a.d();
                    }
                    if (i25 != 0) {
                        i27 = i17;
                        f17 = spacing200;
                        v2Var4 = v2Var2;
                        i28 = 2;
                        pVar8 = null;
                    } else {
                        i27 = i17;
                        f17 = spacing200;
                        v2Var4 = v2Var2;
                        pVar8 = pVar4;
                        i28 = 2;
                    }
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(-750369464, i27, -1, "pl.gov.coi.common.ui.ds.bottomsheet.ModalBottomSheet3 (ModalBottomSheet3.kt:60)");
                }
                zC = rVarH.c(modalBottomSheetData.getSheetState().getValue().ordinal());
                objE = rVarH.E();
                if (zC) {
                    if (modalBottomSheetData.getSheetState().getValue() != v.EXPANDED) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    objE = Boolean.valueOf(z16);
                    rVarH.v(objE);
                } else {
                    if (modalBottomSheetData.getSheetState().getValue() != v.EXPANDED) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    objE = Boolean.valueOf(z16);
                    rVarH.v(objE);
                }
                zBooleanValue = ((Boolean) objE).booleanValue();
                hjVarY = C6454df.y(modalBottomSheetData.getSheetState().getSkipHalfExpanded(), null, rVarH, 0, i28);
                boolean zW5 = rVarH.W(hjVarY) | rVarH.a(zBooleanValue);
                if ((i27 & 14) == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zW5 | z17;
                objE2 = rVarH.E();
                if (z18) {
                    objE2 = new a(hjVarY, zBooleanValue, modalBottomSheetData, null);
                    rVarH.v(objE2);
                } else {
                    objE2 = new a(hjVarY, zBooleanValue, modalBottomSheetData, null);
                    rVarH.v(objE2);
                }
                Function0.d(hjVarY, (er.p) objE2, rVarH, 0);
                final er.p pVar13 = pVar5;
                rVar2 = rVarH;
                i50.s.r(baseScaffoldData, y2.m.d(858326717, true, new er.p() { // from class: g30.e
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return m.k(pVar8, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), pVarD, 0, 0L, null, v2Var4, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1835766453, true, new er.q() { // from class: g30.f
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return m.l(qVar, zBooleanValue, modalBottomSheetData, hjVarY, pVar13, f17, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVar2, ((i27 >> 3) & 14) | 48 | ((i27 >> 6) & 896) | ((i27 << 9) & 3670016), 196608, 32696);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                f16 = f17;
                pVar6 = pVar8;
                v2Var3 = v2Var4;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                f16 = spacing200;
                v2Var3 = v2Var2;
                pVar6 = pVar4;
            }
            pVar7 = pVarD;
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: g30.g
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return m.o(modalBottomSheetData, baseScaffoldData, f16, v2Var3, pVar7, pVar6, pVar3, qVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        v2Var2 = v2Var;
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
                    pVar4 = pVar2;
                    if (rVarH.G(pVar4)) {
                        i26 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i26 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i26;
                }
                if ((1572864 & i15) == 0) {
                    pVar5 = pVar3;
                    if (rVarH.G(pVar5)) {
                        i35 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i35 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i35;
                } else {
                    pVar5 = pVar3;
                }
                if ((i15 & 12582912) == 0) {
                    if (rVarH.G(qVar)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i17 |= i29;
                }
                if ((i17 & 4793491) != 4793490) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if ((i16 & 4) != 0) {
                            i17 &= -897;
                            spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                        }
                        if (i37 != 0) {
                            v2Var2 = null;
                        }
                        if (i18 != 0) {
                            pVarD = d.f70152a.d();
                        }
                        if (i25 != 0) {
                            i27 = i17;
                            f17 = spacing200;
                            v2Var4 = v2Var2;
                            i28 = 2;
                            pVar8 = null;
                        } else {
                            i27 = i17;
                            f17 = spacing200;
                            v2Var4 = v2Var2;
                            pVar8 = pVar4;
                            i28 = 2;
                        }
                    } else {
                        if ((i16 & 4) != 0) {
                            i17 &= -897;
                            spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                        }
                        if (i37 != 0) {
                            v2Var2 = null;
                        }
                        if (i18 != 0) {
                            pVarD = d.f70152a.d();
                        }
                        if (i25 != 0) {
                            i27 = i17;
                            f17 = spacing200;
                            v2Var4 = v2Var2;
                            i28 = 2;
                            pVar8 = null;
                        } else {
                            i27 = i17;
                            f17 = spacing200;
                            v2Var4 = v2Var2;
                            pVar8 = pVar4;
                            i28 = 2;
                        }
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(-750369464, i27, -1, "pl.gov.coi.common.ui.ds.bottomsheet.ModalBottomSheet3 (ModalBottomSheet3.kt:60)");
                    }
                    zC = rVarH.c(modalBottomSheetData.getSheetState().getValue().ordinal());
                    objE = rVarH.E();
                    if (zC) {
                        if (modalBottomSheetData.getSheetState().getValue() != v.EXPANDED) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        objE = Boolean.valueOf(z16);
                        rVarH.v(objE);
                    } else {
                        if (modalBottomSheetData.getSheetState().getValue() != v.EXPANDED) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        objE = Boolean.valueOf(z16);
                        rVarH.v(objE);
                    }
                    zBooleanValue = ((Boolean) objE).booleanValue();
                    hjVarY = C6454df.y(modalBottomSheetData.getSheetState().getSkipHalfExpanded(), null, rVarH, 0, i28);
                    boolean zW6 = rVarH.W(hjVarY) | rVarH.a(zBooleanValue);
                    if ((i27 & 14) == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = zW6 | z17;
                    objE2 = rVarH.E();
                    if (z18) {
                        objE2 = new a(hjVarY, zBooleanValue, modalBottomSheetData, null);
                        rVarH.v(objE2);
                    } else {
                        objE2 = new a(hjVarY, zBooleanValue, modalBottomSheetData, null);
                        rVarH.v(objE2);
                    }
                    Function0.d(hjVarY, (er.p) objE2, rVarH, 0);
                    final er.p pVar14 = pVar5;
                    rVar2 = rVarH;
                    i50.s.r(baseScaffoldData, y2.m.d(858326717, true, new er.p() { // from class: g30.e
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return m.k(pVar8, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), pVarD, 0, 0L, null, v2Var4, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1835766453, true, new er.q() { // from class: g30.f
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return m.l(qVar, zBooleanValue, modalBottomSheetData, hjVarY, pVar14, f17, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), rVar2, ((i27 >> 3) & 14) | 48 | ((i27 >> 6) & 896) | ((i27 << 9) & 3670016), 196608, 32696);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    f16 = f17;
                    pVar6 = pVar8;
                    v2Var3 = v2Var4;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    f16 = spacing200;
                    v2Var3 = v2Var2;
                    pVar6 = pVar4;
                }
                pVar7 = pVarD;
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: g30.g
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return m.o(modalBottomSheetData, baseScaffoldData, f16, v2Var3, pVar7, pVar6, pVar3, qVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 196608;
            pVar4 = pVar2;
            if ((1572864 & i15) == 0) {
                pVar5 = pVar3;
                if (rVarH.G(pVar5)) {
                    i35 = PKIFailureInfo.badCertTemplate;
                } else {
                    i35 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i35;
            } else {
                pVar5 = pVar3;
            }
            if ((i15 & 12582912) == 0) {
                if (rVarH.G(qVar)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i17 |= i29;
            }
            if ((i17 & 4793491) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                        spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                    }
                    if (i37 != 0) {
                        v2Var2 = null;
                    }
                    if (i18 != 0) {
                        pVarD = d.f70152a.d();
                    }
                    if (i25 != 0) {
                        i27 = i17;
                        f17 = spacing200;
                        v2Var4 = v2Var2;
                        i28 = 2;
                        pVar8 = null;
                    } else {
                        i27 = i17;
                        f17 = spacing200;
                        v2Var4 = v2Var2;
                        pVar8 = pVar4;
                        i28 = 2;
                    }
                } else {
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                        spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                    }
                    if (i37 != 0) {
                        v2Var2 = null;
                    }
                    if (i18 != 0) {
                        pVarD = d.f70152a.d();
                    }
                    if (i25 != 0) {
                        i27 = i17;
                        f17 = spacing200;
                        v2Var4 = v2Var2;
                        i28 = 2;
                        pVar8 = null;
                    } else {
                        i27 = i17;
                        f17 = spacing200;
                        v2Var4 = v2Var2;
                        pVar8 = pVar4;
                        i28 = 2;
                    }
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(-750369464, i27, -1, "pl.gov.coi.common.ui.ds.bottomsheet.ModalBottomSheet3 (ModalBottomSheet3.kt:60)");
                }
                zC = rVarH.c(modalBottomSheetData.getSheetState().getValue().ordinal());
                objE = rVarH.E();
                if (zC) {
                    if (modalBottomSheetData.getSheetState().getValue() != v.EXPANDED) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    objE = Boolean.valueOf(z16);
                    rVarH.v(objE);
                } else {
                    if (modalBottomSheetData.getSheetState().getValue() != v.EXPANDED) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    objE = Boolean.valueOf(z16);
                    rVarH.v(objE);
                }
                zBooleanValue = ((Boolean) objE).booleanValue();
                hjVarY = C6454df.y(modalBottomSheetData.getSheetState().getSkipHalfExpanded(), null, rVarH, 0, i28);
                boolean zW7 = rVarH.W(hjVarY) | rVarH.a(zBooleanValue);
                if ((i27 & 14) == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zW7 | z17;
                objE2 = rVarH.E();
                if (z18) {
                    objE2 = new a(hjVarY, zBooleanValue, modalBottomSheetData, null);
                    rVarH.v(objE2);
                } else {
                    objE2 = new a(hjVarY, zBooleanValue, modalBottomSheetData, null);
                    rVarH.v(objE2);
                }
                Function0.d(hjVarY, (er.p) objE2, rVarH, 0);
                final er.p pVar15 = pVar5;
                rVar2 = rVarH;
                i50.s.r(baseScaffoldData, y2.m.d(858326717, true, new er.p() { // from class: g30.e
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return m.k(pVar8, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), pVarD, 0, 0L, null, v2Var4, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1835766453, true, new er.q() { // from class: g30.f
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return m.l(qVar, zBooleanValue, modalBottomSheetData, hjVarY, pVar15, f17, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVar2, ((i27 >> 3) & 14) | 48 | ((i27 >> 6) & 896) | ((i27 << 9) & 3670016), 196608, 32696);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                f16 = f17;
                pVar6 = pVar8;
                v2Var3 = v2Var4;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                f16 = spacing200;
                v2Var3 = v2Var2;
                pVar6 = pVar4;
            }
            pVar7 = pVarD;
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: g30.g
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return m.o(modalBottomSheetData, baseScaffoldData, f16, v2Var3, pVar7, pVar6, pVar3, qVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        pVarD = pVar;
        i25 = i16 & 32;
        if (i25 != 0) {
            if ((196608 & i15) == 0) {
                pVar4 = pVar2;
                if (rVarH.G(pVar4)) {
                    i26 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i26 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i26;
            }
            if ((1572864 & i15) == 0) {
                pVar5 = pVar3;
                if (rVarH.G(pVar5)) {
                    i35 = PKIFailureInfo.badCertTemplate;
                } else {
                    i35 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i35;
            } else {
                pVar5 = pVar3;
            }
            if ((i15 & 12582912) == 0) {
                if (rVarH.G(qVar)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i17 |= i29;
            }
            if ((i17 & 4793491) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                        spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                    }
                    if (i37 != 0) {
                        v2Var2 = null;
                    }
                    if (i18 != 0) {
                        pVarD = d.f70152a.d();
                    }
                    if (i25 != 0) {
                        i27 = i17;
                        f17 = spacing200;
                        v2Var4 = v2Var2;
                        i28 = 2;
                        pVar8 = null;
                    } else {
                        i27 = i17;
                        f17 = spacing200;
                        v2Var4 = v2Var2;
                        pVar8 = pVar4;
                        i28 = 2;
                    }
                } else {
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                        spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                    }
                    if (i37 != 0) {
                        v2Var2 = null;
                    }
                    if (i18 != 0) {
                        pVarD = d.f70152a.d();
                    }
                    if (i25 != 0) {
                        i27 = i17;
                        f17 = spacing200;
                        v2Var4 = v2Var2;
                        i28 = 2;
                        pVar8 = null;
                    } else {
                        i27 = i17;
                        f17 = spacing200;
                        v2Var4 = v2Var2;
                        pVar8 = pVar4;
                        i28 = 2;
                    }
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(-750369464, i27, -1, "pl.gov.coi.common.ui.ds.bottomsheet.ModalBottomSheet3 (ModalBottomSheet3.kt:60)");
                }
                zC = rVarH.c(modalBottomSheetData.getSheetState().getValue().ordinal());
                objE = rVarH.E();
                if (zC) {
                    if (modalBottomSheetData.getSheetState().getValue() != v.EXPANDED) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    objE = Boolean.valueOf(z16);
                    rVarH.v(objE);
                } else {
                    if (modalBottomSheetData.getSheetState().getValue() != v.EXPANDED) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    objE = Boolean.valueOf(z16);
                    rVarH.v(objE);
                }
                zBooleanValue = ((Boolean) objE).booleanValue();
                hjVarY = C6454df.y(modalBottomSheetData.getSheetState().getSkipHalfExpanded(), null, rVarH, 0, i28);
                boolean zW8 = rVarH.W(hjVarY) | rVarH.a(zBooleanValue);
                if ((i27 & 14) == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zW8 | z17;
                objE2 = rVarH.E();
                if (z18) {
                    objE2 = new a(hjVarY, zBooleanValue, modalBottomSheetData, null);
                    rVarH.v(objE2);
                } else {
                    objE2 = new a(hjVarY, zBooleanValue, modalBottomSheetData, null);
                    rVarH.v(objE2);
                }
                Function0.d(hjVarY, (er.p) objE2, rVarH, 0);
                final er.p pVar16 = pVar5;
                rVar2 = rVarH;
                i50.s.r(baseScaffoldData, y2.m.d(858326717, true, new er.p() { // from class: g30.e
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return m.k(pVar8, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), pVarD, 0, 0L, null, v2Var4, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1835766453, true, new er.q() { // from class: g30.f
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return m.l(qVar, zBooleanValue, modalBottomSheetData, hjVarY, pVar16, f17, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVar2, ((i27 >> 3) & 14) | 48 | ((i27 >> 6) & 896) | ((i27 << 9) & 3670016), 196608, 32696);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                f16 = f17;
                pVar6 = pVar8;
                v2Var3 = v2Var4;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                f16 = spacing200;
                v2Var3 = v2Var2;
                pVar6 = pVar4;
            }
            pVar7 = pVarD;
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: g30.g
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return m.o(modalBottomSheetData, baseScaffoldData, f16, v2Var3, pVar7, pVar6, pVar3, qVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 196608;
        pVar4 = pVar2;
        if ((1572864 & i15) == 0) {
            pVar5 = pVar3;
            if (rVarH.G(pVar5)) {
                i35 = PKIFailureInfo.badCertTemplate;
            } else {
                i35 = PKIFailureInfo.signerNotTrusted;
            }
            i17 |= i35;
        } else {
            pVar5 = pVar3;
        }
        if ((i15 & 12582912) == 0) {
            if (rVarH.G(qVar)) {
                i29 = 8388608;
            } else {
                i29 = 4194304;
            }
            i17 |= i29;
        }
        if ((i17 & 4793491) != 4793490) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if ((i16 & 4) != 0) {
                    i17 &= -897;
                    spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                }
                if (i37 != 0) {
                    v2Var2 = null;
                }
                if (i18 != 0) {
                    pVarD = d.f70152a.d();
                }
                if (i25 != 0) {
                    i27 = i17;
                    f17 = spacing200;
                    v2Var4 = v2Var2;
                    i28 = 2;
                    pVar8 = null;
                } else {
                    i27 = i17;
                    f17 = spacing200;
                    v2Var4 = v2Var2;
                    pVar8 = pVar4;
                    i28 = 2;
                }
            } else {
                if ((i16 & 4) != 0) {
                    i17 &= -897;
                    spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                }
                if (i37 != 0) {
                    v2Var2 = null;
                }
                if (i18 != 0) {
                    pVarD = d.f70152a.d();
                }
                if (i25 != 0) {
                    i27 = i17;
                    f17 = spacing200;
                    v2Var4 = v2Var2;
                    i28 = 2;
                    pVar8 = null;
                } else {
                    i27 = i17;
                    f17 = spacing200;
                    v2Var4 = v2Var2;
                    pVar8 = pVar4;
                    i28 = 2;
                }
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(-750369464, i27, -1, "pl.gov.coi.common.ui.ds.bottomsheet.ModalBottomSheet3 (ModalBottomSheet3.kt:60)");
            }
            zC = rVarH.c(modalBottomSheetData.getSheetState().getValue().ordinal());
            objE = rVarH.E();
            if (zC) {
                if (modalBottomSheetData.getSheetState().getValue() != v.EXPANDED) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                objE = Boolean.valueOf(z16);
                rVarH.v(objE);
            } else {
                if (modalBottomSheetData.getSheetState().getValue() != v.EXPANDED) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                objE = Boolean.valueOf(z16);
                rVarH.v(objE);
            }
            zBooleanValue = ((Boolean) objE).booleanValue();
            hjVarY = C6454df.y(modalBottomSheetData.getSheetState().getSkipHalfExpanded(), null, rVarH, 0, i28);
            boolean zW9 = rVarH.W(hjVarY) | rVarH.a(zBooleanValue);
            if ((i27 & 14) == 4) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = zW9 | z17;
            objE2 = rVarH.E();
            if (z18) {
                objE2 = new a(hjVarY, zBooleanValue, modalBottomSheetData, null);
                rVarH.v(objE2);
            } else {
                objE2 = new a(hjVarY, zBooleanValue, modalBottomSheetData, null);
                rVarH.v(objE2);
            }
            Function0.d(hjVarY, (er.p) objE2, rVarH, 0);
            final er.p pVar17 = pVar5;
            rVar2 = rVarH;
            i50.s.r(baseScaffoldData, y2.m.d(858326717, true, new er.p() { // from class: g30.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.k(pVar8, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), pVarD, 0, 0L, null, v2Var4, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1835766453, true, new er.q() { // from class: g30.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return m.l(qVar, zBooleanValue, modalBottomSheetData, hjVarY, pVar17, f17, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, ((i27 >> 3) & 14) | 48 | ((i27 >> 6) & 896) | ((i27 << 9) & 3670016), 196608, 32696);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            f16 = f17;
            pVar6 = pVar8;
            v2Var3 = v2Var4;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            f16 = spacing200;
            v2Var3 = v2Var2;
            pVar6 = pVar4;
        }
        pVar7 = pVarD;
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g30.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.o(modalBottomSheetData, baseScaffoldData, f16, v2Var3, pVar7, pVar6, pVar3, qVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(er.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(858326717, i15, -1, "pl.gov.coi.common.ui.ds.bottomsheet.ModalBottomSheet3.<anonymous> (ModalBottomSheet3.kt:92)");
            }
            if (pVar == null) {
                rVar.X(-1824028196);
            } else {
                rVar.X(218255045);
                pVar.B(rVar, 0);
            }
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(er.q qVar, boolean z15, final ModalBottomSheetData modalBottomSheetData, hj hjVar, final er.p pVar, final float f15, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        p076m2.r rVar2 = rVar;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar2.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar2.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1835766453, i16, -1, "pl.gov.coi.common.ui.ds.bottomsheet.ModalBottomSheet3.<anonymous> (ModalBottomSheet3.kt:95)");
            }
            qVar.w(d3Var, rVar2, Integer.valueOf(i16 & 14));
            if (z15) {
                rVar2.X(1499936739);
                k70.a aVar = k70.a.f108864a;
                int i17 = k70.a.f108865b;
                RoundedCornerShape roundedCornerShapeH = l1.h.h(aVar.b(rVar2, i17).getSpacing200(), aVar.b(rVar2, i17).getSpacing200(), 0.0f, 0.0f, 12, null);
                long jM20unboximpl = modalBottomSheetData.a().B(rVar2, 0).m20unboximpl();
                float level1 = aVar.c(rVar2, i17).getLevel1();
                boolean zW = rVar2.W(modalBottomSheetData);
                Object objE = rVar2.E();
                if (zW || objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.a() { // from class: g30.h
                        @Override // er.a
                        public final Object a() {
                            return m.m(modalBottomSheetData);
                        }
                    };
                    rVar2.v(objE);
                }
                C6454df.l((er.a) objE, null, hjVar, 0.0f, false, roundedCornerShapeH, jM20unboximpl, 0L, level1, 0L, d.f70152a.e(), null, null, y2.m.d(-727231122, true, new er.q() { // from class: g30.i
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return m.n(modalBottomSheetData, pVar, f15, (h0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVar2, 54), rVar2, 0, 3078, 6810);
                rVar2 = rVar2;
            } else {
                rVar2.X(1495699597);
            }
            rVar2.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(ModalBottomSheetData modalBottomSheetData) {
        modalBottomSheetData.getSheetState().a().b(v.HIDDEN);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(ModalBottomSheetData modalBottomSheetData, er.p pVar, float f15, h0 h0Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-727231122, i15, -1, "pl.gov.coi.common.ui.ds.bottomsheet.ModalBottomSheet3.<anonymous>.<anonymous> (ModalBottomSheet3.kt:110)");
            }
            p(modalBottomSheetData, pVar, f15, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(ModalBottomSheetData modalBottomSheetData, BaseScaffoldData baseScaffoldData, float f15, v2 v2Var, er.p pVar, er.p pVar2, er.p pVar3, er.q qVar, int i15, int i16, p076m2.r rVar, int i17) {
        j(modalBottomSheetData, baseScaffoldData, f15, v2Var, pVar, pVar2, pVar3, qVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    private static final void p(final ModalBottomSheetData modalBottomSheetData, er.p<? super p076m2.r, ? super Integer, i0> pVar, float f15, p076m2.r rVar, final int i15) {
        int i16;
        final er.p<? super p076m2.r, ? super Integer, i0> pVar2;
        final float f16;
        int i17;
        f3.m.Companion companion;
        int i18;
        x xVar;
        ?? r15;
        p076m2.r rVarH = rVar.h(923905841);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(modalBottomSheetData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.b(f15) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(923905841, i16, -1, "pl.gov.coi.common.ui.ds.bottomsheet.SheetContent (ModalBottomSheet3.kt:129)");
            }
            float fN = c5.h.n(c5.h.n(((Configuration) rVarH.N(AndroidCompositionLocals_androidKt.b())).screenHeightDp) * 0.9f);
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarK = androidx.compose.foundation.layout.d.k(companion2, 0.0f, fN, 1, null);
            f3.c.Companion companion3 = f3.c.INSTANCE;
            f3.c.b bVarG = companion3.g();
            d1.i iVar = d1.i.f39152a;
            w0 w0VarA = d1.e0.a(iVar.k(), bVarG, rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarK);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
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
            d1.i0 i0Var = d1.i0.f39176a;
            k70.a aVar = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            f3.m mVarP = a3.p(companion2, aVar.b(rVarH, i19).getSpacing200(), 0.0f, 2, null);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion3.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarP);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
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
            n6.i(rVarC2, w0VarA2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null);
            w0 w0VarI = d1.r.i(companion3.o(), false);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, mVarH);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB3);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarI, companion4.d());
            n6.i(rVarC3, e0VarT3, companion4.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
            n6.g(rVarC3, companion4.a());
            n6.i(rVarC3, mVarE3, companion4.e());
            x xVar2 = x.f39368a;
            Label title = modalBottomSheetData.getTitle();
            if (title == null) {
                rVarH.X(-1316605574);
                rVarH.R();
                i17 = i16;
                i18 = i19;
                companion = companion2;
                xVar = xVar2;
                r15 = 0;
            } else {
                rVarH.X(-1316605573);
                i17 = i16;
                companion = companion2;
                i18 = i19;
                xVar = xVar2;
                r15 = 0;
                j70.h.g(a3.r(androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null), aVar.b(rVarH, i19).getSpacing400(), 0.0f, aVar.b(rVarH, i19).getSpacing400(), 0.0f, 10, null), null, title, null, null, aVar.a(rVarH, i19).getNeutral().i(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i19).p(), null, null, false, false, null, rVarH, 0, 0, 0, 33026010);
                rVarH = rVarH;
                i0 i0Var2 = i0.f148189a;
                rVarH.R();
            }
            er.a<i0> aVarB4 = modalBottomSheetData.b();
            if (aVarB4 == null) {
                rVarH.X(-1316126376);
            } else {
                rVarH.X(-1316126375);
                f3.m mVarD = xVar.d(companion, companion3.n());
                w0 w0VarI2 = d1.r.i(companion3.o(), r15);
                int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, r15));
                e0 e0VarT4 = rVarH.t();
                f3.m mVarE4 = f3.j.e(rVarH, mVarD);
                er.a<androidx.compose.ui.node.c> aVarB5 = companion4.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB5);
                } else {
                    rVarH.u();
                }
                p076m2.r rVarC4 = n6.c(rVarH);
                n6.i(rVarC4, w0VarI2, companion4.d());
                n6.i(rVarC4, e0VarT4, companion4.f());
                n6.i(rVarC4, Integer.valueOf(iHashCode4), companion4.c());
                n6.g(rVarC4, companion4.a());
                n6.i(rVarC4, mVarE4, companion4.e());
                i30.g.f(new ButtonIconData("CloseModalBottomSheet", jz.a.Y, b.f70191a, null, c70.a.f23835a.a().r0(), aVarB4, 8, null), false, false, rVarH, 0, 6);
                rVarH.x();
                i0 i0Var3 = i0.f148189a;
            }
            rVarH.R();
            rVarH.x();
            if (modalBottomSheetData.getTitle() == null && modalBottomSheetData.b() == null) {
                rVarH.X(-1829603579);
            } else {
                rVarH.X(-1822867992);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i18).getSpacing100()), rVarH, r15);
            }
            rVarH.R();
            rVarH.x();
            f16 = f15;
            f3.m mVarP2 = a3.p(companion, f16, 0.0f, 2, null);
            w0 w0VarI3 = d1.r.i(companion3.o(), r15);
            int iHashCode5 = Long.hashCode(p076m2.m.b(rVarH, r15));
            e0 e0VarT5 = rVarH.t();
            f3.m mVarE5 = f3.j.e(rVarH, mVarP2);
            er.a<androidx.compose.ui.node.c> aVarB6 = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB6);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC5 = n6.c(rVarH);
            n6.i(rVarC5, w0VarI3, companion4.d());
            n6.i(rVarC5, e0VarT5, companion4.f());
            n6.i(rVarC5, Integer.valueOf(iHashCode5), companion4.c());
            n6.g(rVarC5, companion4.a());
            n6.i(rVarC5, mVarE5, companion4.e());
            pVar2 = pVar;
            pVar2.B(rVarH, Integer.valueOf((i17 >> 3) & 14));
            rVarH.x();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            pVar2 = pVar;
            f16 = f15;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g30.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.q(modalBottomSheetData, pVar2, f16, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(ModalBottomSheetData modalBottomSheetData, er.p pVar, float f15, int i15, p076m2.r rVar, int i16) {
        p(modalBottomSheetData, pVar, f15, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
