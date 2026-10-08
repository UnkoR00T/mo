package g30;

import android.content.res.Configuration;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.r3;
import d1.x;
import i30.ButtonIconData;
import i50.BaseScaffoldData;
import ju.p0;
import ju.z0;
import l3.d0;
import l3.g0;
import l3.y;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p012a2.g3;
import p012a2.m3;
import p012a2.n3;
import p036e4.w0;
import p046f2.vb;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a[\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lg30/n;", "data", "Lc5/h;", "horizontalPadding", "", "focusOnExpand", "Ll3/d0;", "focusRequester", "previousFocusRequester", "Lkotlin/Function0;", "Loq/i0;", "bottomSheetContent", "innerContent", "f", "(Lg30/n;FZLl3/d0;Ll3/d0;Ler/p;Ler/p;Lm2/r;II)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class t {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f70227a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-616103695);
            if (p076m2.t.k()) {
                p076m2.t.o(-616103695, i15, -1, "pl.gov.coi.common.ui.ds.bottomsheet.ModalBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.kt:159)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f70228e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ m3 f70229f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ d0 f70230g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m3 m3Var, d0 d0Var, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f70229f = m3Var;
            this.f70230g = d0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f70228e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (this.f70229f.o()) {
                    this.f70228e = 1;
                    if (z0.b(30L, this) == objE) {
                        return objE;
                    }
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            d0.f(this.f70230g, 0, 1, null);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f70229f, this.f70230g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f70232b;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.HIDDEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.HALF_EXPANDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f70231a = iArr;
            int[] iArr2 = new int[n3.values().length];
            try {
                iArr2[n3.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[n3.Expanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[n3.HalfExpanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f70232b = iArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0127  */
    /* JADX WARN: Code duplicated, block: B:103:0x0137  */
    /* JADX WARN: Code duplicated, block: B:106:0x0143  */
    /* JADX WARN: Code duplicated, block: B:109:0x0174  */
    /* JADX WARN: Code duplicated, block: B:111:0x0177  */
    /* JADX WARN: Code duplicated, block: B:113:0x017a  */
    /* JADX WARN: Code duplicated, block: B:114:0x017d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0183  */
    /* JADX WARN: Code duplicated, block: B:117:0x0186  */
    /* JADX WARN: Code duplicated, block: B:120:0x0192  */
    /* JADX WARN: Code duplicated, block: B:122:0x019a  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:127:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:130:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:135:0x0206  */
    /* JADX WARN: Code duplicated, block: B:138:0x0269  */
    /* JADX WARN: Code duplicated, block: B:140:0x0272  */
    /* JADX WARN: Code duplicated, block: B:143:0x0280  */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x0077  */
    /* JADX WARN: Code duplicated, block: B:49:0x007b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0086  */
    /* JADX WARN: Code duplicated, block: B:56:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x009d  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:93:0x0102  */
    /* JADX WARN: Code duplicated, block: B:95:0x010e  */
    /* JADX WARN: Code duplicated, block: B:98:0x011b  */
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
    @oq.a
    public static final void f(final ModalBottomSheetData modalBottomSheetData, float f15, boolean z15, d0 d0Var, d0 d0Var2, final er.p<? super p076m2.r, ? super Integer, i0> pVar, final er.p<? super p076m2.r, ? super Integer, i0> pVar2, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        float f16;
        int i18;
        d0 d0Var3;
        int i19;
        int i25;
        d0 d0Var4;
        int i26;
        er.p<? super p076m2.r, ? super Integer, i0> pVar3;
        er.p<? super p076m2.r, ? super Integer, i0> pVar4;
        boolean z16;
        final boolean z17;
        final float f17;
        final d0 d0Var5;
        final d0 d0Var6;
        d5 d5VarM;
        float spacing200;
        boolean z18;
        d0 d0Var7;
        float f18;
        Object objE;
        Object objE2;
        int i27;
        n3 n3Var;
        boolean zW;
        Object objE3;
        final m3 m3VarJ;
        f3.m mVarA;
        Object objE4;
        p076m2.r.Companion companion;
        d0 d0Var8;
        boolean zG;
        Object objE5;
        int i28;
        int i29;
        p076m2.r rVarH = rVar.h(1136906864);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(modalBottomSheetData) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            if ((i16 & 2) == 0) {
                f16 = f15;
                int i35 = rVarH.b(f16) ? 32 : 16;
                i17 |= i35;
            } else {
                f16 = f15;
            }
            i17 |= i35;
        } else {
            f16 = f15;
        }
        int i36 = i16 & 4;
        if (i36 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                i17 |= rVarH.a(z15) ? 256 : 128;
            }
            i18 = i16 & 8;
            if (i18 != 0) {
                if ((i15 & 3072) == 0) {
                    d0Var3 = d0Var;
                    if (rVarH.W(d0Var3)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i17 |= i19;
                }
                i25 = i16 & 16;
                if (i25 != 0) {
                    if ((i15 & 24576) == 0) {
                        d0Var4 = d0Var2;
                        if (rVarH.W(d0Var4)) {
                            i26 = 16384;
                        } else {
                            i26 = PKIFailureInfo.certRevoked;
                        }
                        i17 |= i26;
                    }
                    if ((196608 & i15) == 0) {
                        pVar3 = pVar;
                        if (rVarH.G(pVar3)) {
                            i29 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i29 = PKIFailureInfo.notAuthorized;
                        }
                        i17 |= i29;
                    } else {
                        pVar3 = pVar;
                    }
                    if ((1572864 & i15) == 0) {
                        pVar4 = pVar2;
                        if (rVarH.G(pVar4)) {
                            i28 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i28 = PKIFailureInfo.signerNotTrusted;
                        }
                        i17 |= i28;
                    } else {
                        pVar4 = pVar2;
                    }
                    if ((599187 & i17) != 599186) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (rVarH.r(z16, i17 & 1)) {
                        rVarH.I();
                        if ((i15 & 1) != 0 || rVarH.Q()) {
                            if ((i16 & 2) != 0) {
                                spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                                i17 &= -113;
                            } else {
                                spacing200 = f16;
                            }
                            if (i36 != 0) {
                                z18 = true;
                            } else {
                                z18 = z15;
                            }
                            if (i18 != 0) {
                                objE2 = rVarH.E();
                                if (objE2 == p076m2.r.INSTANCE.a()) {
                                    objE2 = new d0();
                                    rVarH.v(objE2);
                                }
                                d0Var3 = (d0) objE2;
                            }
                            if (i25 != 0) {
                                objE = rVarH.E();
                                if (objE == p076m2.r.INSTANCE.a()) {
                                    objE = new d0();
                                    rVarH.v(objE);
                                }
                                d0Var4 = (d0) objE;
                            }
                            d0Var7 = d0Var3;
                            f18 = spacing200;
                        } else {
                            rVarH.O();
                            if ((i16 & 2) != 0) {
                                i17 &= -113;
                            }
                            z18 = z15;
                            d0Var7 = d0Var3;
                            f18 = f16;
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(1136906864, i17, -1, "pl.gov.coi.common.ui.ds.bottomsheet.ModalBottomSheet (ModalBottomSheet.kt:58)");
                        }
                        final float fN = c5.h.n(c5.h.n(((Configuration) rVarH.N(AndroidCompositionLocals_androidKt.b())).screenHeightDp) * 0.9f);
                        i27 = c.f70231a[modalBottomSheetData.getSheetState().getValue().ordinal()];
                        if (i27 != 1) {
                            n3Var = n3.Expanded;
                        } else if (i27 != 2) {
                            n3Var = n3.Hidden;
                        } else {
                            if (i27 == 3) {
                                throw new oq.p();
                            }
                            n3Var = n3.HalfExpanded;
                        }
                        zW = rVarH.W(modalBottomSheetData);
                        objE3 = rVarH.E();
                        if (zW || objE3 == p076m2.r.INSTANCE.a()) {
                            objE3 = new er.l() { // from class: g30.p
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return Boolean.valueOf(t.g(modalBottomSheetData, (n3) obj));
                                }
                            };
                            rVarH.v(objE3);
                        }
                        m3VarJ = g3.J(n3Var, null, (er.l) objE3, modalBottomSheetData.getSheetState().getSkipHalfExpanded(), rVarH, 0, 2);
                        if (z18) {
                            rVarH.X(1166494989);
                            objE4 = rVarH.E();
                            companion = p076m2.r.INSTANCE;
                            if (objE4 == companion.a()) {
                                objE4 = new d0();
                                rVarH.v(objE4);
                            }
                            d0Var8 = (d0) objE4;
                            Boolean boolValueOf = Boolean.valueOf(m3VarJ.o());
                            zG = rVarH.G(m3VarJ);
                            objE5 = rVarH.E();
                            if (zG || objE5 == companion.a()) {
                                objE5 = new b(m3VarJ, d0Var8, null);
                                rVarH.v(objE5);
                            }
                            Function0.d(boolValueOf, (er.p) objE5, rVarH, 0);
                            mVarA = g0.a(f3.m.INSTANCE, d0Var8);
                            rVarH.R();
                        } else {
                            rVarH.X(1166770579);
                            rVarH.R();
                            mVarA = f3.m.INSTANCE;
                        }
                        final f3.m mVar = mVarA;
                        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, null, null, null, null, null, 63, null);
                        final float f19 = f18;
                        final d0 d0Var9 = d0Var7;
                        final d0 d0Var10 = d0Var4;
                        final er.p<? super p076m2.r, ? super Integer, i0> pVar5 = pVar3;
                        final er.p<? super p076m2.r, ? super Integer, i0> pVar6 = pVar4;
                        y2.f fVarD = y2.m.d(-1286415894, true, new er.q() { // from class: g30.q
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return t.h(m3VarJ, pVar6, fN, modalBottomSheetData, f19, modalBottomSheetData, mVar, d0Var9, d0Var10, pVar5, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54);
                        rVarH = rVarH;
                        i50.s.r(baseScaffoldData, null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, fVarD, rVarH, 0, 196608, 32766);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        f17 = f19;
                        d0Var5 = d0Var9;
                        d0Var6 = d0Var10;
                        z17 = z18;
                    } else {
                        rVarH.O();
                        z17 = z15;
                        f17 = f16;
                        d0Var5 = d0Var3;
                        d0Var6 = d0Var4;
                    }
                    d5VarM = rVarH.m();
                    if (d5VarM != null) {
                        d5VarM.a(new er.p() { // from class: g30.r
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return t.k(modalBottomSheetData, f17, z17, d0Var5, d0Var6, pVar, pVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 24576;
                d0Var4 = d0Var2;
                if ((196608 & i15) == 0) {
                    pVar3 = pVar;
                    if (rVarH.G(pVar3)) {
                        i29 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i29 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i29;
                } else {
                    pVar3 = pVar;
                }
                if ((1572864 & i15) == 0) {
                    pVar4 = pVar2;
                    if (rVarH.G(pVar4)) {
                        i28 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i28 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i28;
                } else {
                    pVar4 = pVar2;
                }
                if ((599187 & i17) != 599186) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if ((i16 & 2) != 0) {
                            spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                            i17 &= -113;
                        } else {
                            spacing200 = f16;
                        }
                        if (i36 != 0) {
                            z18 = true;
                        } else {
                            z18 = z15;
                        }
                        if (i18 != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == p076m2.r.INSTANCE.a()) {
                                objE2 = new d0();
                                rVarH.v(objE2);
                            }
                            d0Var3 = (d0) objE2;
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            d0Var4 = (d0) objE;
                        }
                        d0Var7 = d0Var3;
                        f18 = spacing200;
                    } else {
                        if ((i16 & 2) != 0) {
                            spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                            i17 &= -113;
                        } else {
                            spacing200 = f16;
                        }
                        if (i36 != 0) {
                            z18 = true;
                        } else {
                            z18 = z15;
                        }
                        if (i18 != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == p076m2.r.INSTANCE.a()) {
                                objE2 = new d0();
                                rVarH.v(objE2);
                            }
                            d0Var3 = (d0) objE2;
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            d0Var4 = (d0) objE;
                        }
                        d0Var7 = d0Var3;
                        f18 = spacing200;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(1136906864, i17, -1, "pl.gov.coi.common.ui.ds.bottomsheet.ModalBottomSheet (ModalBottomSheet.kt:58)");
                    }
                    final float fN2 = c5.h.n(c5.h.n(((Configuration) rVarH.N(AndroidCompositionLocals_androidKt.b())).screenHeightDp) * 0.9f);
                    i27 = c.f70231a[modalBottomSheetData.getSheetState().getValue().ordinal()];
                    if (i27 != 1) {
                        n3Var = n3.Expanded;
                    } else if (i27 != 2) {
                        n3Var = n3.Hidden;
                    } else {
                        if (i27 == 3) {
                            throw new oq.p();
                        }
                        n3Var = n3.HalfExpanded;
                    }
                    zW = rVarH.W(modalBottomSheetData);
                    objE3 = rVarH.E();
                    if (zW) {
                        objE3 = new er.l() { // from class: g30.p
                            @Override // er.l
                            public final Object b(Object obj) {
                                return Boolean.valueOf(t.g(modalBottomSheetData, (n3) obj));
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new er.l() { // from class: g30.p
                            @Override // er.l
                            public final Object b(Object obj) {
                                return Boolean.valueOf(t.g(modalBottomSheetData, (n3) obj));
                            }
                        };
                        rVarH.v(objE3);
                    }
                    m3VarJ = g3.J(n3Var, null, (er.l) objE3, modalBottomSheetData.getSheetState().getSkipHalfExpanded(), rVarH, 0, 2);
                    if (z18) {
                        rVarH.X(1166494989);
                        objE4 = rVarH.E();
                        companion = p076m2.r.INSTANCE;
                        if (objE4 == companion.a()) {
                            objE4 = new d0();
                            rVarH.v(objE4);
                        }
                        d0Var8 = (d0) objE4;
                        Boolean boolValueOf2 = Boolean.valueOf(m3VarJ.o());
                        zG = rVarH.G(m3VarJ);
                        objE5 = rVarH.E();
                        if (zG) {
                            objE5 = new b(m3VarJ, d0Var8, null);
                            rVarH.v(objE5);
                        } else {
                            objE5 = new b(m3VarJ, d0Var8, null);
                            rVarH.v(objE5);
                        }
                        Function0.d(boolValueOf2, (er.p) objE5, rVarH, 0);
                        mVarA = g0.a(f3.m.INSTANCE, d0Var8);
                        rVarH.R();
                    } else {
                        rVarH.X(1166770579);
                        rVarH.R();
                        mVarA = f3.m.INSTANCE;
                    }
                    final f3.m mVar2 = mVarA;
                    BaseScaffoldData baseScaffoldData2 = new BaseScaffoldData(null, null, null, null, null, null, 63, null);
                    final float f110 = f18;
                    final d0 d0Var11 = d0Var7;
                    final d0 d0Var12 = d0Var4;
                    final er.p pVar7 = pVar3;
                    final er.p pVar8 = pVar4;
                    y2.f fVarD2 = y2.m.d(-1286415894, true, new er.q() { // from class: g30.q
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return t.h(m3VarJ, pVar8, fN2, modalBottomSheetData, f110, modalBottomSheetData, mVar2, d0Var11, d0Var12, pVar7, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54);
                    rVarH = rVarH;
                    i50.s.r(baseScaffoldData2, null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, fVarD2, rVarH, 0, 196608, 32766);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    f17 = f110;
                    d0Var5 = d0Var11;
                    d0Var6 = d0Var12;
                    z17 = z18;
                } else {
                    rVarH.O();
                    z17 = z15;
                    f17 = f16;
                    d0Var5 = d0Var3;
                    d0Var6 = d0Var4;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: g30.r
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return t.k(modalBottomSheetData, f17, z17, d0Var5, d0Var6, pVar, pVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            d0Var3 = d0Var;
            i25 = i16 & 16;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    d0Var4 = d0Var2;
                    if (rVarH.W(d0Var4)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                if ((196608 & i15) == 0) {
                    pVar3 = pVar;
                    if (rVarH.G(pVar3)) {
                        i29 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i29 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i29;
                } else {
                    pVar3 = pVar;
                }
                if ((1572864 & i15) == 0) {
                    pVar4 = pVar2;
                    if (rVarH.G(pVar4)) {
                        i28 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i28 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i28;
                } else {
                    pVar4 = pVar2;
                }
                if ((599187 & i17) != 599186) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if ((i16 & 2) != 0) {
                            spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                            i17 &= -113;
                        } else {
                            spacing200 = f16;
                        }
                        if (i36 != 0) {
                            z18 = true;
                        } else {
                            z18 = z15;
                        }
                        if (i18 != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == p076m2.r.INSTANCE.a()) {
                                objE2 = new d0();
                                rVarH.v(objE2);
                            }
                            d0Var3 = (d0) objE2;
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            d0Var4 = (d0) objE;
                        }
                        d0Var7 = d0Var3;
                        f18 = spacing200;
                    } else {
                        if ((i16 & 2) != 0) {
                            spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                            i17 &= -113;
                        } else {
                            spacing200 = f16;
                        }
                        if (i36 != 0) {
                            z18 = true;
                        } else {
                            z18 = z15;
                        }
                        if (i18 != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == p076m2.r.INSTANCE.a()) {
                                objE2 = new d0();
                                rVarH.v(objE2);
                            }
                            d0Var3 = (d0) objE2;
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            d0Var4 = (d0) objE;
                        }
                        d0Var7 = d0Var3;
                        f18 = spacing200;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(1136906864, i17, -1, "pl.gov.coi.common.ui.ds.bottomsheet.ModalBottomSheet (ModalBottomSheet.kt:58)");
                    }
                    final float fN3 = c5.h.n(c5.h.n(((Configuration) rVarH.N(AndroidCompositionLocals_androidKt.b())).screenHeightDp) * 0.9f);
                    i27 = c.f70231a[modalBottomSheetData.getSheetState().getValue().ordinal()];
                    if (i27 != 1) {
                        n3Var = n3.Expanded;
                    } else if (i27 != 2) {
                        n3Var = n3.Hidden;
                    } else {
                        if (i27 == 3) {
                            throw new oq.p();
                        }
                        n3Var = n3.HalfExpanded;
                    }
                    zW = rVarH.W(modalBottomSheetData);
                    objE3 = rVarH.E();
                    if (zW) {
                        objE3 = new er.l() { // from class: g30.p
                            @Override // er.l
                            public final Object b(Object obj) {
                                return Boolean.valueOf(t.g(modalBottomSheetData, (n3) obj));
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new er.l() { // from class: g30.p
                            @Override // er.l
                            public final Object b(Object obj) {
                                return Boolean.valueOf(t.g(modalBottomSheetData, (n3) obj));
                            }
                        };
                        rVarH.v(objE3);
                    }
                    m3VarJ = g3.J(n3Var, null, (er.l) objE3, modalBottomSheetData.getSheetState().getSkipHalfExpanded(), rVarH, 0, 2);
                    if (z18) {
                        rVarH.X(1166494989);
                        objE4 = rVarH.E();
                        companion = p076m2.r.INSTANCE;
                        if (objE4 == companion.a()) {
                            objE4 = new d0();
                            rVarH.v(objE4);
                        }
                        d0Var8 = (d0) objE4;
                        Boolean boolValueOf3 = Boolean.valueOf(m3VarJ.o());
                        zG = rVarH.G(m3VarJ);
                        objE5 = rVarH.E();
                        if (zG) {
                            objE5 = new b(m3VarJ, d0Var8, null);
                            rVarH.v(objE5);
                        } else {
                            objE5 = new b(m3VarJ, d0Var8, null);
                            rVarH.v(objE5);
                        }
                        Function0.d(boolValueOf3, (er.p) objE5, rVarH, 0);
                        mVarA = g0.a(f3.m.INSTANCE, d0Var8);
                        rVarH.R();
                    } else {
                        rVarH.X(1166770579);
                        rVarH.R();
                        mVarA = f3.m.INSTANCE;
                    }
                    final f3.m mVar3 = mVarA;
                    BaseScaffoldData baseScaffoldData3 = new BaseScaffoldData(null, null, null, null, null, null, 63, null);
                    final float f111 = f18;
                    final d0 d0Var13 = d0Var7;
                    final d0 d0Var14 = d0Var4;
                    final er.p pVar9 = pVar3;
                    final er.p pVar10 = pVar4;
                    y2.f fVarD3 = y2.m.d(-1286415894, true, new er.q() { // from class: g30.q
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return t.h(m3VarJ, pVar10, fN3, modalBottomSheetData, f111, modalBottomSheetData, mVar3, d0Var13, d0Var14, pVar9, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54);
                    rVarH = rVarH;
                    i50.s.r(baseScaffoldData3, null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, fVarD3, rVarH, 0, 196608, 32766);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    f17 = f111;
                    d0Var5 = d0Var13;
                    d0Var6 = d0Var14;
                    z17 = z18;
                } else {
                    rVarH.O();
                    z17 = z15;
                    f17 = f16;
                    d0Var5 = d0Var3;
                    d0Var6 = d0Var4;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: g30.r
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return t.k(modalBottomSheetData, f17, z17, d0Var5, d0Var6, pVar, pVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            d0Var4 = d0Var2;
            if ((196608 & i15) == 0) {
                pVar3 = pVar;
                if (rVarH.G(pVar3)) {
                    i29 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i29 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i29;
            } else {
                pVar3 = pVar;
            }
            if ((1572864 & i15) == 0) {
                pVar4 = pVar2;
                if (rVarH.G(pVar4)) {
                    i28 = PKIFailureInfo.badCertTemplate;
                } else {
                    i28 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i28;
            } else {
                pVar4 = pVar2;
            }
            if ((599187 & i17) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if ((i16 & 2) != 0) {
                        spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                        i17 &= -113;
                    } else {
                        spacing200 = f16;
                    }
                    if (i36 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    if (i18 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == p076m2.r.INSTANCE.a()) {
                            objE2 = new d0();
                            rVarH.v(objE2);
                        }
                        d0Var3 = (d0) objE2;
                    }
                    if (i25 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        d0Var4 = (d0) objE;
                    }
                    d0Var7 = d0Var3;
                    f18 = spacing200;
                } else {
                    if ((i16 & 2) != 0) {
                        spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                        i17 &= -113;
                    } else {
                        spacing200 = f16;
                    }
                    if (i36 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    if (i18 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == p076m2.r.INSTANCE.a()) {
                            objE2 = new d0();
                            rVarH.v(objE2);
                        }
                        d0Var3 = (d0) objE2;
                    }
                    if (i25 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        d0Var4 = (d0) objE;
                    }
                    d0Var7 = d0Var3;
                    f18 = spacing200;
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(1136906864, i17, -1, "pl.gov.coi.common.ui.ds.bottomsheet.ModalBottomSheet (ModalBottomSheet.kt:58)");
                }
                final float fN4 = c5.h.n(c5.h.n(((Configuration) rVarH.N(AndroidCompositionLocals_androidKt.b())).screenHeightDp) * 0.9f);
                i27 = c.f70231a[modalBottomSheetData.getSheetState().getValue().ordinal()];
                if (i27 != 1) {
                    n3Var = n3.Expanded;
                } else if (i27 != 2) {
                    n3Var = n3.Hidden;
                } else {
                    if (i27 == 3) {
                        throw new oq.p();
                    }
                    n3Var = n3.HalfExpanded;
                }
                zW = rVarH.W(modalBottomSheetData);
                objE3 = rVarH.E();
                if (zW) {
                    objE3 = new er.l() { // from class: g30.p
                        @Override // er.l
                        public final Object b(Object obj) {
                            return Boolean.valueOf(t.g(modalBottomSheetData, (n3) obj));
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new er.l() { // from class: g30.p
                        @Override // er.l
                        public final Object b(Object obj) {
                            return Boolean.valueOf(t.g(modalBottomSheetData, (n3) obj));
                        }
                    };
                    rVarH.v(objE3);
                }
                m3VarJ = g3.J(n3Var, null, (er.l) objE3, modalBottomSheetData.getSheetState().getSkipHalfExpanded(), rVarH, 0, 2);
                if (z18) {
                    rVarH.X(1166494989);
                    objE4 = rVarH.E();
                    companion = p076m2.r.INSTANCE;
                    if (objE4 == companion.a()) {
                        objE4 = new d0();
                        rVarH.v(objE4);
                    }
                    d0Var8 = (d0) objE4;
                    Boolean boolValueOf4 = Boolean.valueOf(m3VarJ.o());
                    zG = rVarH.G(m3VarJ);
                    objE5 = rVarH.E();
                    if (zG) {
                        objE5 = new b(m3VarJ, d0Var8, null);
                        rVarH.v(objE5);
                    } else {
                        objE5 = new b(m3VarJ, d0Var8, null);
                        rVarH.v(objE5);
                    }
                    Function0.d(boolValueOf4, (er.p) objE5, rVarH, 0);
                    mVarA = g0.a(f3.m.INSTANCE, d0Var8);
                    rVarH.R();
                } else {
                    rVarH.X(1166770579);
                    rVarH.R();
                    mVarA = f3.m.INSTANCE;
                }
                final f3.m mVar4 = mVarA;
                BaseScaffoldData baseScaffoldData4 = new BaseScaffoldData(null, null, null, null, null, null, 63, null);
                final float f112 = f18;
                final d0 d0Var15 = d0Var7;
                final d0 d0Var16 = d0Var4;
                final er.p pVar11 = pVar3;
                final er.p pVar12 = pVar4;
                y2.f fVarD4 = y2.m.d(-1286415894, true, new er.q() { // from class: g30.q
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return t.h(m3VarJ, pVar12, fN4, modalBottomSheetData, f112, modalBottomSheetData, mVar4, d0Var15, d0Var16, pVar11, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54);
                rVarH = rVarH;
                i50.s.r(baseScaffoldData4, null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, fVarD4, rVarH, 0, 196608, 32766);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                f17 = f112;
                d0Var5 = d0Var15;
                d0Var6 = d0Var16;
                z17 = z18;
            } else {
                rVarH.O();
                z17 = z15;
                f17 = f16;
                d0Var5 = d0Var3;
                d0Var6 = d0Var4;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: g30.r
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return t.k(modalBottomSheetData, f17, z17, d0Var5, d0Var6, pVar, pVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        i18 = i16 & 8;
        if (i18 != 0) {
            if ((i15 & 3072) == 0) {
                d0Var3 = d0Var;
                if (rVarH.W(d0Var3)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i17 |= i19;
            }
            i25 = i16 & 16;
            if (i25 != 0) {
                if ((i15 & 24576) == 0) {
                    d0Var4 = d0Var2;
                    if (rVarH.W(d0Var4)) {
                        i26 = 16384;
                    } else {
                        i26 = PKIFailureInfo.certRevoked;
                    }
                    i17 |= i26;
                }
                if ((196608 & i15) == 0) {
                    pVar3 = pVar;
                    if (rVarH.G(pVar3)) {
                        i29 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i29 = PKIFailureInfo.notAuthorized;
                    }
                    i17 |= i29;
                } else {
                    pVar3 = pVar;
                }
                if ((1572864 & i15) == 0) {
                    pVar4 = pVar2;
                    if (rVarH.G(pVar4)) {
                        i28 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i28 = PKIFailureInfo.signerNotTrusted;
                    }
                    i17 |= i28;
                } else {
                    pVar4 = pVar2;
                }
                if ((599187 & i17) != 599186) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (rVarH.r(z16, i17 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0) {
                        if ((i16 & 2) != 0) {
                            spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                            i17 &= -113;
                        } else {
                            spacing200 = f16;
                        }
                        if (i36 != 0) {
                            z18 = true;
                        } else {
                            z18 = z15;
                        }
                        if (i18 != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == p076m2.r.INSTANCE.a()) {
                                objE2 = new d0();
                                rVarH.v(objE2);
                            }
                            d0Var3 = (d0) objE2;
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            d0Var4 = (d0) objE;
                        }
                        d0Var7 = d0Var3;
                        f18 = spacing200;
                    } else {
                        if ((i16 & 2) != 0) {
                            spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                            i17 &= -113;
                        } else {
                            spacing200 = f16;
                        }
                        if (i36 != 0) {
                            z18 = true;
                        } else {
                            z18 = z15;
                        }
                        if (i18 != 0) {
                            objE2 = rVarH.E();
                            if (objE2 == p076m2.r.INSTANCE.a()) {
                                objE2 = new d0();
                                rVarH.v(objE2);
                            }
                            d0Var3 = (d0) objE2;
                        }
                        if (i25 != 0) {
                            objE = rVarH.E();
                            if (objE == p076m2.r.INSTANCE.a()) {
                                objE = new d0();
                                rVarH.v(objE);
                            }
                            d0Var4 = (d0) objE;
                        }
                        d0Var7 = d0Var3;
                        f18 = spacing200;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(1136906864, i17, -1, "pl.gov.coi.common.ui.ds.bottomsheet.ModalBottomSheet (ModalBottomSheet.kt:58)");
                    }
                    final float fN5 = c5.h.n(c5.h.n(((Configuration) rVarH.N(AndroidCompositionLocals_androidKt.b())).screenHeightDp) * 0.9f);
                    i27 = c.f70231a[modalBottomSheetData.getSheetState().getValue().ordinal()];
                    if (i27 != 1) {
                        n3Var = n3.Expanded;
                    } else if (i27 != 2) {
                        n3Var = n3.Hidden;
                    } else {
                        if (i27 == 3) {
                            throw new oq.p();
                        }
                        n3Var = n3.HalfExpanded;
                    }
                    zW = rVarH.W(modalBottomSheetData);
                    objE3 = rVarH.E();
                    if (zW) {
                        objE3 = new er.l() { // from class: g30.p
                            @Override // er.l
                            public final Object b(Object obj) {
                                return Boolean.valueOf(t.g(modalBottomSheetData, (n3) obj));
                            }
                        };
                        rVarH.v(objE3);
                    } else {
                        objE3 = new er.l() { // from class: g30.p
                            @Override // er.l
                            public final Object b(Object obj) {
                                return Boolean.valueOf(t.g(modalBottomSheetData, (n3) obj));
                            }
                        };
                        rVarH.v(objE3);
                    }
                    m3VarJ = g3.J(n3Var, null, (er.l) objE3, modalBottomSheetData.getSheetState().getSkipHalfExpanded(), rVarH, 0, 2);
                    if (z18) {
                        rVarH.X(1166494989);
                        objE4 = rVarH.E();
                        companion = p076m2.r.INSTANCE;
                        if (objE4 == companion.a()) {
                            objE4 = new d0();
                            rVarH.v(objE4);
                        }
                        d0Var8 = (d0) objE4;
                        Boolean boolValueOf5 = Boolean.valueOf(m3VarJ.o());
                        zG = rVarH.G(m3VarJ);
                        objE5 = rVarH.E();
                        if (zG) {
                            objE5 = new b(m3VarJ, d0Var8, null);
                            rVarH.v(objE5);
                        } else {
                            objE5 = new b(m3VarJ, d0Var8, null);
                            rVarH.v(objE5);
                        }
                        Function0.d(boolValueOf5, (er.p) objE5, rVarH, 0);
                        mVarA = g0.a(f3.m.INSTANCE, d0Var8);
                        rVarH.R();
                    } else {
                        rVarH.X(1166770579);
                        rVarH.R();
                        mVarA = f3.m.INSTANCE;
                    }
                    final f3.m mVar5 = mVarA;
                    BaseScaffoldData baseScaffoldData5 = new BaseScaffoldData(null, null, null, null, null, null, 63, null);
                    final float f113 = f18;
                    final d0 d0Var17 = d0Var7;
                    final d0 d0Var18 = d0Var4;
                    final er.p pVar13 = pVar3;
                    final er.p pVar14 = pVar4;
                    y2.f fVarD5 = y2.m.d(-1286415894, true, new er.q() { // from class: g30.q
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return t.h(m3VarJ, pVar14, fN5, modalBottomSheetData, f113, modalBottomSheetData, mVar5, d0Var17, d0Var18, pVar13, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54);
                    rVarH = rVarH;
                    i50.s.r(baseScaffoldData5, null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, fVarD5, rVarH, 0, 196608, 32766);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    f17 = f113;
                    d0Var5 = d0Var17;
                    d0Var6 = d0Var18;
                    z17 = z18;
                } else {
                    rVarH.O();
                    z17 = z15;
                    f17 = f16;
                    d0Var5 = d0Var3;
                    d0Var6 = d0Var4;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: g30.r
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return t.k(modalBottomSheetData, f17, z17, d0Var5, d0Var6, pVar, pVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 24576;
            d0Var4 = d0Var2;
            if ((196608 & i15) == 0) {
                pVar3 = pVar;
                if (rVarH.G(pVar3)) {
                    i29 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i29 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i29;
            } else {
                pVar3 = pVar;
            }
            if ((1572864 & i15) == 0) {
                pVar4 = pVar2;
                if (rVarH.G(pVar4)) {
                    i28 = PKIFailureInfo.badCertTemplate;
                } else {
                    i28 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i28;
            } else {
                pVar4 = pVar2;
            }
            if ((599187 & i17) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if ((i16 & 2) != 0) {
                        spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                        i17 &= -113;
                    } else {
                        spacing200 = f16;
                    }
                    if (i36 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    if (i18 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == p076m2.r.INSTANCE.a()) {
                            objE2 = new d0();
                            rVarH.v(objE2);
                        }
                        d0Var3 = (d0) objE2;
                    }
                    if (i25 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        d0Var4 = (d0) objE;
                    }
                    d0Var7 = d0Var3;
                    f18 = spacing200;
                } else {
                    if ((i16 & 2) != 0) {
                        spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                        i17 &= -113;
                    } else {
                        spacing200 = f16;
                    }
                    if (i36 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    if (i18 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == p076m2.r.INSTANCE.a()) {
                            objE2 = new d0();
                            rVarH.v(objE2);
                        }
                        d0Var3 = (d0) objE2;
                    }
                    if (i25 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        d0Var4 = (d0) objE;
                    }
                    d0Var7 = d0Var3;
                    f18 = spacing200;
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(1136906864, i17, -1, "pl.gov.coi.common.ui.ds.bottomsheet.ModalBottomSheet (ModalBottomSheet.kt:58)");
                }
                final float fN6 = c5.h.n(c5.h.n(((Configuration) rVarH.N(AndroidCompositionLocals_androidKt.b())).screenHeightDp) * 0.9f);
                i27 = c.f70231a[modalBottomSheetData.getSheetState().getValue().ordinal()];
                if (i27 != 1) {
                    n3Var = n3.Expanded;
                } else if (i27 != 2) {
                    n3Var = n3.Hidden;
                } else {
                    if (i27 == 3) {
                        throw new oq.p();
                    }
                    n3Var = n3.HalfExpanded;
                }
                zW = rVarH.W(modalBottomSheetData);
                objE3 = rVarH.E();
                if (zW) {
                    objE3 = new er.l() { // from class: g30.p
                        @Override // er.l
                        public final Object b(Object obj) {
                            return Boolean.valueOf(t.g(modalBottomSheetData, (n3) obj));
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new er.l() { // from class: g30.p
                        @Override // er.l
                        public final Object b(Object obj) {
                            return Boolean.valueOf(t.g(modalBottomSheetData, (n3) obj));
                        }
                    };
                    rVarH.v(objE3);
                }
                m3VarJ = g3.J(n3Var, null, (er.l) objE3, modalBottomSheetData.getSheetState().getSkipHalfExpanded(), rVarH, 0, 2);
                if (z18) {
                    rVarH.X(1166494989);
                    objE4 = rVarH.E();
                    companion = p076m2.r.INSTANCE;
                    if (objE4 == companion.a()) {
                        objE4 = new d0();
                        rVarH.v(objE4);
                    }
                    d0Var8 = (d0) objE4;
                    Boolean boolValueOf6 = Boolean.valueOf(m3VarJ.o());
                    zG = rVarH.G(m3VarJ);
                    objE5 = rVarH.E();
                    if (zG) {
                        objE5 = new b(m3VarJ, d0Var8, null);
                        rVarH.v(objE5);
                    } else {
                        objE5 = new b(m3VarJ, d0Var8, null);
                        rVarH.v(objE5);
                    }
                    Function0.d(boolValueOf6, (er.p) objE5, rVarH, 0);
                    mVarA = g0.a(f3.m.INSTANCE, d0Var8);
                    rVarH.R();
                } else {
                    rVarH.X(1166770579);
                    rVarH.R();
                    mVarA = f3.m.INSTANCE;
                }
                final f3.m mVar6 = mVarA;
                BaseScaffoldData baseScaffoldData6 = new BaseScaffoldData(null, null, null, null, null, null, 63, null);
                final float f114 = f18;
                final d0 d0Var19 = d0Var7;
                final d0 d0Var110 = d0Var4;
                final er.p pVar15 = pVar3;
                final er.p pVar16 = pVar4;
                y2.f fVarD6 = y2.m.d(-1286415894, true, new er.q() { // from class: g30.q
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return t.h(m3VarJ, pVar16, fN6, modalBottomSheetData, f114, modalBottomSheetData, mVar6, d0Var19, d0Var110, pVar15, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54);
                rVarH = rVarH;
                i50.s.r(baseScaffoldData6, null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, fVarD6, rVarH, 0, 196608, 32766);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                f17 = f114;
                d0Var5 = d0Var19;
                d0Var6 = d0Var110;
                z17 = z18;
            } else {
                rVarH.O();
                z17 = z15;
                f17 = f16;
                d0Var5 = d0Var3;
                d0Var6 = d0Var4;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: g30.r
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return t.k(modalBottomSheetData, f17, z17, d0Var5, d0Var6, pVar, pVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        d0Var3 = d0Var;
        i25 = i16 & 16;
        if (i25 != 0) {
            if ((i15 & 24576) == 0) {
                d0Var4 = d0Var2;
                if (rVarH.W(d0Var4)) {
                    i26 = 16384;
                } else {
                    i26 = PKIFailureInfo.certRevoked;
                }
                i17 |= i26;
            }
            if ((196608 & i15) == 0) {
                pVar3 = pVar;
                if (rVarH.G(pVar3)) {
                    i29 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i29 = PKIFailureInfo.notAuthorized;
                }
                i17 |= i29;
            } else {
                pVar3 = pVar;
            }
            if ((1572864 & i15) == 0) {
                pVar4 = pVar2;
                if (rVarH.G(pVar4)) {
                    i28 = PKIFailureInfo.badCertTemplate;
                } else {
                    i28 = PKIFailureInfo.signerNotTrusted;
                }
                i17 |= i28;
            } else {
                pVar4 = pVar2;
            }
            if ((599187 & i17) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if ((i16 & 2) != 0) {
                        spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                        i17 &= -113;
                    } else {
                        spacing200 = f16;
                    }
                    if (i36 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    if (i18 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == p076m2.r.INSTANCE.a()) {
                            objE2 = new d0();
                            rVarH.v(objE2);
                        }
                        d0Var3 = (d0) objE2;
                    }
                    if (i25 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        d0Var4 = (d0) objE;
                    }
                    d0Var7 = d0Var3;
                    f18 = spacing200;
                } else {
                    if ((i16 & 2) != 0) {
                        spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                        i17 &= -113;
                    } else {
                        spacing200 = f16;
                    }
                    if (i36 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    if (i18 != 0) {
                        objE2 = rVarH.E();
                        if (objE2 == p076m2.r.INSTANCE.a()) {
                            objE2 = new d0();
                            rVarH.v(objE2);
                        }
                        d0Var3 = (d0) objE2;
                    }
                    if (i25 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new d0();
                            rVarH.v(objE);
                        }
                        d0Var4 = (d0) objE;
                    }
                    d0Var7 = d0Var3;
                    f18 = spacing200;
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(1136906864, i17, -1, "pl.gov.coi.common.ui.ds.bottomsheet.ModalBottomSheet (ModalBottomSheet.kt:58)");
                }
                final float fN7 = c5.h.n(c5.h.n(((Configuration) rVarH.N(AndroidCompositionLocals_androidKt.b())).screenHeightDp) * 0.9f);
                i27 = c.f70231a[modalBottomSheetData.getSheetState().getValue().ordinal()];
                if (i27 != 1) {
                    n3Var = n3.Expanded;
                } else if (i27 != 2) {
                    n3Var = n3.Hidden;
                } else {
                    if (i27 == 3) {
                        throw new oq.p();
                    }
                    n3Var = n3.HalfExpanded;
                }
                zW = rVarH.W(modalBottomSheetData);
                objE3 = rVarH.E();
                if (zW) {
                    objE3 = new er.l() { // from class: g30.p
                        @Override // er.l
                        public final Object b(Object obj) {
                            return Boolean.valueOf(t.g(modalBottomSheetData, (n3) obj));
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new er.l() { // from class: g30.p
                        @Override // er.l
                        public final Object b(Object obj) {
                            return Boolean.valueOf(t.g(modalBottomSheetData, (n3) obj));
                        }
                    };
                    rVarH.v(objE3);
                }
                m3VarJ = g3.J(n3Var, null, (er.l) objE3, modalBottomSheetData.getSheetState().getSkipHalfExpanded(), rVarH, 0, 2);
                if (z18) {
                    rVarH.X(1166494989);
                    objE4 = rVarH.E();
                    companion = p076m2.r.INSTANCE;
                    if (objE4 == companion.a()) {
                        objE4 = new d0();
                        rVarH.v(objE4);
                    }
                    d0Var8 = (d0) objE4;
                    Boolean boolValueOf7 = Boolean.valueOf(m3VarJ.o());
                    zG = rVarH.G(m3VarJ);
                    objE5 = rVarH.E();
                    if (zG) {
                        objE5 = new b(m3VarJ, d0Var8, null);
                        rVarH.v(objE5);
                    } else {
                        objE5 = new b(m3VarJ, d0Var8, null);
                        rVarH.v(objE5);
                    }
                    Function0.d(boolValueOf7, (er.p) objE5, rVarH, 0);
                    mVarA = g0.a(f3.m.INSTANCE, d0Var8);
                    rVarH.R();
                } else {
                    rVarH.X(1166770579);
                    rVarH.R();
                    mVarA = f3.m.INSTANCE;
                }
                final f3.m mVar7 = mVarA;
                BaseScaffoldData baseScaffoldData7 = new BaseScaffoldData(null, null, null, null, null, null, 63, null);
                final float f115 = f18;
                final d0 d0Var111 = d0Var7;
                final d0 d0Var112 = d0Var4;
                final er.p pVar17 = pVar3;
                final er.p pVar18 = pVar4;
                y2.f fVarD7 = y2.m.d(-1286415894, true, new er.q() { // from class: g30.q
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return t.h(m3VarJ, pVar18, fN7, modalBottomSheetData, f115, modalBottomSheetData, mVar7, d0Var111, d0Var112, pVar17, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54);
                rVarH = rVarH;
                i50.s.r(baseScaffoldData7, null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, fVarD7, rVarH, 0, 196608, 32766);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                f17 = f115;
                d0Var5 = d0Var111;
                d0Var6 = d0Var112;
                z17 = z18;
            } else {
                rVarH.O();
                z17 = z15;
                f17 = f16;
                d0Var5 = d0Var3;
                d0Var6 = d0Var4;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: g30.r
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return t.k(modalBottomSheetData, f17, z17, d0Var5, d0Var6, pVar, pVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 24576;
        d0Var4 = d0Var2;
        if ((196608 & i15) == 0) {
            pVar3 = pVar;
            if (rVarH.G(pVar3)) {
                i29 = PKIFailureInfo.unsupportedVersion;
            } else {
                i29 = PKIFailureInfo.notAuthorized;
            }
            i17 |= i29;
        } else {
            pVar3 = pVar;
        }
        if ((1572864 & i15) == 0) {
            pVar4 = pVar2;
            if (rVarH.G(pVar4)) {
                i28 = PKIFailureInfo.badCertTemplate;
            } else {
                i28 = PKIFailureInfo.signerNotTrusted;
            }
            i17 |= i28;
        } else {
            pVar4 = pVar2;
        }
        if ((599187 & i17) != 599186) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (rVarH.r(z16, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if ((i16 & 2) != 0) {
                    spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                    i17 &= -113;
                } else {
                    spacing200 = f16;
                }
                if (i36 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                if (i18 != 0) {
                    objE2 = rVarH.E();
                    if (objE2 == p076m2.r.INSTANCE.a()) {
                        objE2 = new d0();
                        rVarH.v(objE2);
                    }
                    d0Var3 = (d0) objE2;
                }
                if (i25 != 0) {
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = new d0();
                        rVarH.v(objE);
                    }
                    d0Var4 = (d0) objE;
                }
                d0Var7 = d0Var3;
                f18 = spacing200;
            } else {
                if ((i16 & 2) != 0) {
                    spacing200 = k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200();
                    i17 &= -113;
                } else {
                    spacing200 = f16;
                }
                if (i36 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                if (i18 != 0) {
                    objE2 = rVarH.E();
                    if (objE2 == p076m2.r.INSTANCE.a()) {
                        objE2 = new d0();
                        rVarH.v(objE2);
                    }
                    d0Var3 = (d0) objE2;
                }
                if (i25 != 0) {
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = new d0();
                        rVarH.v(objE);
                    }
                    d0Var4 = (d0) objE;
                }
                d0Var7 = d0Var3;
                f18 = spacing200;
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(1136906864, i17, -1, "pl.gov.coi.common.ui.ds.bottomsheet.ModalBottomSheet (ModalBottomSheet.kt:58)");
            }
            final float fN8 = c5.h.n(c5.h.n(((Configuration) rVarH.N(AndroidCompositionLocals_androidKt.b())).screenHeightDp) * 0.9f);
            i27 = c.f70231a[modalBottomSheetData.getSheetState().getValue().ordinal()];
            if (i27 != 1) {
                n3Var = n3.Expanded;
            } else if (i27 != 2) {
                n3Var = n3.Hidden;
            } else {
                if (i27 == 3) {
                    throw new oq.p();
                }
                n3Var = n3.HalfExpanded;
            }
            zW = rVarH.W(modalBottomSheetData);
            objE3 = rVarH.E();
            if (zW) {
                objE3 = new er.l() { // from class: g30.p
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Boolean.valueOf(t.g(modalBottomSheetData, (n3) obj));
                    }
                };
                rVarH.v(objE3);
            } else {
                objE3 = new er.l() { // from class: g30.p
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Boolean.valueOf(t.g(modalBottomSheetData, (n3) obj));
                    }
                };
                rVarH.v(objE3);
            }
            m3VarJ = g3.J(n3Var, null, (er.l) objE3, modalBottomSheetData.getSheetState().getSkipHalfExpanded(), rVarH, 0, 2);
            if (z18) {
                rVarH.X(1166494989);
                objE4 = rVarH.E();
                companion = p076m2.r.INSTANCE;
                if (objE4 == companion.a()) {
                    objE4 = new d0();
                    rVarH.v(objE4);
                }
                d0Var8 = (d0) objE4;
                Boolean boolValueOf8 = Boolean.valueOf(m3VarJ.o());
                zG = rVarH.G(m3VarJ);
                objE5 = rVarH.E();
                if (zG) {
                    objE5 = new b(m3VarJ, d0Var8, null);
                    rVarH.v(objE5);
                } else {
                    objE5 = new b(m3VarJ, d0Var8, null);
                    rVarH.v(objE5);
                }
                Function0.d(boolValueOf8, (er.p) objE5, rVarH, 0);
                mVarA = g0.a(f3.m.INSTANCE, d0Var8);
                rVarH.R();
            } else {
                rVarH.X(1166770579);
                rVarH.R();
                mVarA = f3.m.INSTANCE;
            }
            final f3.m mVar8 = mVarA;
            BaseScaffoldData baseScaffoldData8 = new BaseScaffoldData(null, null, null, null, null, null, 63, null);
            final float f116 = f18;
            final d0 d0Var113 = d0Var7;
            final d0 d0Var114 = d0Var4;
            final er.p pVar19 = pVar3;
            final er.p pVar110 = pVar4;
            y2.f fVarD8 = y2.m.d(-1286415894, true, new er.q() { // from class: g30.q
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return t.h(m3VarJ, pVar110, fN8, modalBottomSheetData, f116, modalBottomSheetData, mVar8, d0Var113, d0Var114, pVar19, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54);
            rVarH = rVarH;
            i50.s.r(baseScaffoldData8, null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, fVarD8, rVarH, 0, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            f17 = f116;
            d0Var5 = d0Var113;
            d0Var6 = d0Var114;
            z17 = z18;
        } else {
            rVarH.O();
            z17 = z15;
            f17 = f16;
            d0Var5 = d0Var3;
            d0Var6 = d0Var4;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g30.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t.k(modalBottomSheetData, f17, z17, d0Var5, d0Var6, pVar, pVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(ModalBottomSheetData modalBottomSheetData, n3 n3Var) {
        int i15 = c.f70232b[n3Var.ordinal()];
        if (i15 == 1) {
            modalBottomSheetData.getSheetState().a().b(v.HIDDEN);
        } else if (i15 == 2) {
            modalBottomSheetData.getSheetState().a().b(v.EXPANDED);
        } else {
            if (i15 != 3) {
                throw new oq.p();
            }
            modalBottomSheetData.getSheetState().a().b(v.HALF_EXPANDED);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(m3 m3Var, er.p pVar, final float f15, final ModalBottomSheetData modalBottomSheetData, final float f16, final ModalBottomSheetData modalBottomSheetData2, final f3.m mVar, final d0 d0Var, final d0 d0Var2, final er.p pVar2, d3 d3Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1286415894, i15, -1, "pl.gov.coi.common.ui.ds.bottomsheet.ModalBottomSheet.<anonymous>.<anonymous> (ModalBottomSheet.kt:94)");
            }
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            g3.q(y2.m.d(824935704, true, new er.q() { // from class: g30.s
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return t.i(f15, modalBottomSheetData, f16, modalBottomSheetData2, mVar, d0Var, d0Var2, pVar2, (h0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), null, m3Var, false, l1.h.h(aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing200(), 0.0f, 0.0f, 12, null), aVar.c(rVar, i16).getLevel0(), 0L, 0L, 0L, pVar, rVar, (m3.f1790e << 6) | 6, 458);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v13 */
    public static final i0 i(float f15, ModalBottomSheetData modalBottomSheetData, float f16, ModalBottomSheetData modalBottomSheetData2, f3.m mVar, d0 d0Var, final d0 d0Var2, er.p pVar, h0 h0Var, p076m2.r rVar, int i15) {
        k70.a aVar;
        Integer num;
        f3.m.Companion companion;
        int i16;
        x xVar;
        ?? r15;
        p076m2.r rVar2 = rVar;
        if (rVar2.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(824935704, i15, -1, "pl.gov.coi.common.ui.ds.bottomsheet.ModalBottomSheet.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.kt:102)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarD = w0.i.d(androidx.compose.foundation.layout.d.k(androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null), 0.0f, f15, 1, null), modalBottomSheetData.a().B(rVar2, 0).m20unboximpl(), null, 2, null);
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarA = k3.f.a(mVarD, l1.h.h(aVar2.b(rVar2, i17).getSpacing50(), aVar2.b(rVar2, i17).getSpacing50(), 0.0f, 0.0f, 12, null));
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion3.k(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarA);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
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
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            d1.i0 i0Var = d1.i0.f39176a;
            f3.m mVarP = a3.p(companion2, aVar2.b(rVar2, i17).getSpacing200(), 0.0f, 2, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion3.g(), rVar2, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT2 = rVar2.t();
            f3.m mVarE2 = f3.j.e(rVar2, mVarP);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB2);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC2 = n6.c(rVar2);
            n6.i(rVarC2, w0VarA2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            vb.h(androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.y(w0.i.d(k3.f.a(a3.r(companion2, 0.0f, aVar2.b(rVar2, i17).getSpacing100(), 0.0f, aVar2.b(rVar2, i17).getSpacing100(), 5, null), l1.h.f(aVar2.b(rVar2, i17).getSpacing300())), aVar2.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().g(), null, 2, null), aVar2.b(rVar2, i17).getSpacing400()), aVar2.b(rVar2, i17).getSpacing50()), 0.0f, 0L, rVar2, 0, 6);
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null);
            w0 w0VarI = d1.r.i(companion3.o(), false);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT3 = rVar2.t();
            f3.m mVarE3 = f3.j.e(rVar2, mVarH);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB3);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC3 = n6.c(rVar2);
            n6.i(rVarC3, w0VarI, companion4.d());
            n6.i(rVarC3, e0VarT3, companion4.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
            n6.g(rVarC3, companion4.a());
            n6.i(rVarC3, mVarE3, companion4.e());
            x xVar2 = x.f39368a;
            Label title = modalBottomSheetData2.getTitle();
            if (title == null) {
                rVar2.X(627425357);
                rVar2.R();
                xVar = xVar2;
                num = 0;
                companion = companion2;
                aVar = aVar2;
                i16 = i17;
            } else {
                rVar2.X(627425358);
                aVar = aVar2;
                num = 0;
                companion = companion2;
                i16 = i17;
                xVar = xVar2;
                j70.h.g(a3.r(androidx.compose.foundation.layout.d.h(mVar, 0.0f, 1, null), aVar2.b(rVar2, i17).getSpacing400(), 0.0f, aVar2.b(rVar2, i17).getSpacing400(), 0.0f, 10, null), null, title, title, null, aVar2.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33026002);
                rVar2 = rVar;
                i0 i0Var2 = i0.f148189a;
                rVar2.R();
            }
            er.a<i0> aVarB4 = modalBottomSheetData2.b();
            if (aVarB4 == null) {
                rVar2.X(628042319);
                rVar2.R();
                r15 = 0;
            } else {
                rVar2.X(628042320);
                f3.m mVarA2 = g0.a(xVar.d(companion, companion3.n()), d0Var);
                boolean zW = rVar2.W(d0Var2);
                Object objE = rVar2.E();
                if (zW || objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.l() { // from class: g30.o
                        @Override // er.l
                        public final Object b(Object obj) {
                            return t.j(d0Var2, (l3.v) obj);
                        }
                    };
                    rVar2.v(objE);
                }
                f3.m mVarA3 = y.a(mVarA2, (er.l) objE);
                r15 = 0;
                w0 w0VarI2 = d1.r.i(companion3.o(), false);
                int iHashCode4 = Long.hashCode(p076m2.m.b(rVar2, 0));
                p076m2.e0 e0VarT4 = rVar2.t();
                f3.m mVarE4 = f3.j.e(rVar2, mVarA3);
                er.a<androidx.compose.ui.node.c> aVarB5 = companion4.b();
                if (rVar2.l() == null) {
                    p076m2.m.d();
                }
                rVar2.K();
                if (rVar2.getInserting()) {
                    rVar2.H(aVarB5);
                } else {
                    rVar2.u();
                }
                p076m2.r rVarC4 = n6.c(rVar2);
                n6.i(rVarC4, w0VarI2, companion4.d());
                n6.i(rVarC4, e0VarT4, companion4.f());
                n6.i(rVarC4, Integer.valueOf(iHashCode4), companion4.c());
                n6.g(rVarC4, companion4.a());
                n6.i(rVarC4, mVarE4, companion4.e());
                i30.g.f(new ButtonIconData("CloseModalBottomSheet", jz.a.Y, a.f70227a, null, c70.a.f23835a.a().r0(), aVarB4, 8, null), false, false, rVar, 0, 6);
                rVar2 = rVar;
                rVar2.x();
                i0 i0Var3 = i0.f148189a;
                rVar2.R();
            }
            rVar2.x();
            if (modalBottomSheetData2.getTitle() == null && modalBottomSheetData2.b() == null) {
                rVar2.X(891748126);
            } else {
                rVar2.X(898486069);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i16).getSpacing100()), rVar2, r15);
            }
            rVar2.R();
            rVar2.x();
            f3.m mVarP2 = a3.p(companion, f16, 0.0f, 2, null);
            w0 w0VarI3 = d1.r.i(companion3.o(), r15);
            int iHashCode5 = Long.hashCode(p076m2.m.b(rVar2, r15));
            p076m2.e0 e0VarT5 = rVar2.t();
            f3.m mVarE5 = f3.j.e(rVar2, mVarP2);
            er.a<androidx.compose.ui.node.c> aVarB6 = companion4.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB6);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC5 = n6.c(rVar2);
            n6.i(rVarC5, w0VarI3, companion4.d());
            n6.i(rVarC5, e0VarT5, companion4.f());
            n6.i(rVarC5, Integer.valueOf(iHashCode5), companion4.c());
            n6.g(rVarC5, companion4.a());
            n6.i(rVarC5, mVarE5, companion4.e());
            pVar.B(rVar2, num);
            rVar2.x();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(d0 d0Var, l3.v vVar) {
        vVar.f(d0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(ModalBottomSheetData modalBottomSheetData, float f15, boolean z15, d0 d0Var, d0 d0Var2, er.p pVar, er.p pVar2, int i15, int i16, p076m2.r rVar, int i17) {
        f(modalBottomSheetData, f15, z15, d0Var, d0Var2, pVar, pVar2, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
