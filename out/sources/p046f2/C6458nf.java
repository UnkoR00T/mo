package p046f2;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.g1;
import b3.f;
import c5.d;
import c5.t;
import d1.x;
import er.l;
import er.p;
import f3.c;
import f3.j;
import java.util.UUID;
import n3.o1;
import n4.f0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.m;
import p076m2.n6;
import p076m2.r;
import p076m2.r0;
import p076m2.s0;
import p076m2.v;
import p076m2.x5;

/* JADX INFO: renamed from: f2.nf, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001aA\u0010\b\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u000b*\u00020\u0003H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011²\u0006\u0012\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "onDismissRequest", "Landroidx/compose/ui/graphics/Color;", "contentColor", "Lf2/ef;", "properties", "content", "h", "(Ler/a;JLf2/ef;Ler/p;Lm2/r;II)V", "Landroid/view/View;", "", "r", "(Landroid/view/View;)Z", "q", "(J)Z", "currentContent", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class C6458nf {

    /* JADX INFO: renamed from: f2.nf$a */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"f2/nf$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ re f57044a;

        public a(re reVar) {
            this.f57044a = reVar;
        }

        @Override // p076m2.r0
        public void j() {
            this.f57044a.dismiss();
            this.f57044a.m();
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:107:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:110:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:112:0x0201  */
    /* JADX WARN: Code duplicated, block: B:115:0x020e  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:68:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:74:0x0128  */
    /* JADX WARN: Code duplicated, block: B:77:0x014b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0157  */
    /* JADX WARN: Code duplicated, block: B:84:0x0186  */
    /* JADX WARN: Code duplicated, block: B:86:0x018c  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01bd  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void h(er.a<i0> aVar, long j15, ef efVar, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15, final int i16) {
        er.a<i0> aVar2;
        int i17;
        long jE;
        ef efVar2;
        boolean z15;
        boolean z16;
        er.a<i0> aVar3;
        final long j16;
        final ef efVar3;
        d5 d5VarM;
        er.a<i0> aVar4;
        ef efVar4;
        long j17;
        Object objE;
        View view;
        d dVar;
        final t tVar;
        v vVarE;
        final f6 f6VarP;
        Object objE2;
        r.Companion companion;
        UUID uuid;
        boolean zW;
        Object obj;
        final re reVar;
        boolean zG;
        Object objE3;
        boolean z17;
        boolean z18;
        boolean zC;
        Object objE4;
        int i18;
        r rVarH = rVar.h(-85756322);
        int i19 = i16 & 1;
        if (i19 != 0) {
            i17 = i15 | 6;
            aVar2 = aVar;
        } else if ((i15 & 6) == 0) {
            aVar2 = aVar;
            i17 = (rVarH.G(aVar2) ? 4 : 2) | i15;
        } else {
            aVar2 = aVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            jE = j15;
            i17 |= ((i16 & 2) == 0 && rVarH.d(jE)) ? 32 : 16;
        } else {
            jE = j15;
        }
        int i25 = i16 & 4;
        if (i25 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                efVar2 = efVar;
                i17 |= rVarH.W(efVar2) ? 256 : 128;
            }
            if ((i15 & 3072) == 0) {
                if (rVarH.G(pVar)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i17 |= i18;
            }
            z15 = true;
            if ((i17 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (rVarH.r(z16, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0 || rVarH.Q()) {
                    if (i19 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new er.a() { // from class: f2.ff
                                @Override // er.a
                                public final Object a() {
                                    return C6458nf.i();
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar4 = (er.a) objE;
                    } else {
                        aVar4 = aVar2;
                    }
                    if ((i16 & 2) != 0) {
                        jE = g2.e(n0.f56958a.i(rVarH, 6), rVarH, 0);
                        i17 &= -113;
                    }
                    if (i25 != 0) {
                        aVar3 = aVar4;
                        efVar4 = new ef(false, false, 3, null);
                        j17 = jE;
                    } else {
                        aVar3 = aVar4;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(-85756322, i17, -1, "androidx.compose.material3.ModalBottomSheetDialog (ModalBottomSheet.android.kt:229)");
                    }
                    view = (View) rVarH.N(AndroidCompositionLocals_androidKt.g());
                    dVar = (d) rVarH.N(g1.f());
                    tVar = (t) rVarH.N(g1.l());
                    vVarE = m.e(rVarH, 0);
                    f6VarP = x5.p(pVar, rVarH, (i17 >> 9) & 14);
                    Object[] objArr = new Object[0];
                    objE2 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE2 == companion.a()) {
                        objE2 = new er.a() { // from class: f2.gf
                            @Override // er.a
                            public final Object a() {
                                return C6458nf.k();
                            }
                        };
                        rVarH.v(objE2);
                    }
                    uuid = (UUID) f.k(objArr, (er.a) objE2, rVarH, 48);
                    zW = rVarH.W(view) | rVarH.W(dVar);
                    Object objE5 = rVarH.E();
                    if (!zW || objE5 == companion.a()) {
                        re reVar2 = new re(aVar3, efVar4, j17, view, tVar, dVar, uuid, null);
                        reVar2.n(vVarE, y2.m.b(1379699857, true, new p() { // from class: f2.hf
                            @Override // er.p
                            public final Object B(Object obj2, Object obj3) {
                                return C6458nf.l(f6VarP, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }));
                        rVarH.v(reVar2);
                        obj = reVar2;
                    } else {
                        obj = objE5;
                    }
                    reVar = (re) obj;
                    zG = rVarH.G(reVar);
                    objE3 = rVarH.E();
                    if (zG || objE3 == companion.a()) {
                        objE3 = new l() { // from class: f2.jf
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return C6458nf.n(reVar, (s0) obj2);
                            }
                        };
                        rVarH.v(objE3);
                    }
                    Function0.a(reVar, (l) objE3, rVarH, 0);
                    boolean zG2 = rVarH.G(reVar);
                    if ((i17 & 14) == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z19 = zG2 | z17;
                    if ((i17 & 896) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean z25 = z19 | z18;
                    if ((((i17 & 112) ^ 48) > 32 || !rVarH.d(j17)) && (i17 & 48) != 32) {
                    }
                    zC = z25 | z15 | rVarH.c(tVar.ordinal());
                    objE4 = rVarH.E();
                    if (zC || objE4 == companion.a()) {
                        final long j18 = j17;
                        final ef efVar5 = efVar4;
                        final er.a<i0> aVar5 = aVar3;
                        objE4 = new er.a() { // from class: f2.kf
                            @Override // er.a
                            public final Object a() {
                                return C6458nf.o(reVar, aVar5, efVar5, j18, tVar);
                            }
                        };
                        aVar3 = aVar5;
                        efVar4 = efVar5;
                        rVarH.v(objE4);
                    }
                    Function0.g((er.a) objE4, rVarH, 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    j16 = j17;
                    efVar3 = efVar4;
                } else {
                    rVarH.O();
                    if ((i16 & 2) != 0) {
                        i17 &= -113;
                    }
                    aVar3 = aVar2;
                }
                j17 = jE;
                efVar4 = efVar2;
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(-85756322, i17, -1, "androidx.compose.material3.ModalBottomSheetDialog (ModalBottomSheet.android.kt:229)");
                }
                view = (View) rVarH.N(AndroidCompositionLocals_androidKt.g());
                dVar = (d) rVarH.N(g1.f());
                tVar = (t) rVarH.N(g1.l());
                vVarE = m.e(rVarH, 0);
                f6VarP = x5.p(pVar, rVarH, (i17 >> 9) & 14);
                Object[] objArr2 = new Object[0];
                objE2 = rVarH.E();
                companion = r.INSTANCE;
                if (objE2 == companion.a()) {
                    objE2 = new er.a() { // from class: f2.gf
                        @Override // er.a
                        public final Object a() {
                            return C6458nf.k();
                        }
                    };
                    rVarH.v(objE2);
                }
                uuid = (UUID) f.k(objArr2, (er.a) objE2, rVarH, 48);
                zW = rVarH.W(view) | rVarH.W(dVar);
                Object objE6 = rVarH.E();
                if (zW) {
                    re reVar3 = new re(aVar3, efVar4, j17, view, tVar, dVar, uuid, null);
                    reVar3.n(vVarE, y2.m.b(1379699857, true, new p() { // from class: f2.hf
                        @Override // er.p
                        public final Object B(Object obj2, Object obj3) {
                            return C6458nf.l(f6VarP, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }));
                    rVarH.v(reVar3);
                    obj = reVar3;
                } else {
                    re reVar4 = new re(aVar3, efVar4, j17, view, tVar, dVar, uuid, null);
                    reVar4.n(vVarE, y2.m.b(1379699857, true, new p() { // from class: f2.hf
                        @Override // er.p
                        public final Object B(Object obj2, Object obj3) {
                            return C6458nf.l(f6VarP, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }));
                    rVarH.v(reVar4);
                    obj = reVar4;
                }
                reVar = (re) obj;
                zG = rVarH.G(reVar);
                objE3 = rVarH.E();
                if (zG) {
                    objE3 = new l() { // from class: f2.jf
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return C6458nf.n(reVar, (s0) obj2);
                        }
                    };
                    rVarH.v(objE3);
                } else {
                    objE3 = new l() { // from class: f2.jf
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return C6458nf.n(reVar, (s0) obj2);
                        }
                    };
                    rVarH.v(objE3);
                }
                Function0.a(reVar, (l) objE3, rVarH, 0);
                boolean zG3 = rVarH.G(reVar);
                if ((i17 & 14) == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z110 = zG3 | z17;
                if ((i17 & 896) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z26 = z110 | z18;
                z15 = ((i17 & 112) ^ 48) > 32 ? false : false;
                zC = z26 | z15 | rVarH.c(tVar.ordinal());
                objE4 = rVarH.E();
                if (zC) {
                    final long j19 = j17;
                    final ef efVar6 = efVar4;
                    final er.a aVar6 = aVar3;
                    objE4 = new er.a() { // from class: f2.kf
                        @Override // er.a
                        public final Object a() {
                            return C6458nf.o(reVar, aVar6, efVar6, j19, tVar);
                        }
                    };
                    aVar3 = aVar6;
                    efVar4 = efVar6;
                    rVarH.v(objE4);
                } else {
                    final long j110 = j17;
                    final ef efVar7 = efVar4;
                    final er.a aVar7 = aVar3;
                    objE4 = new er.a() { // from class: f2.kf
                        @Override // er.a
                        public final Object a() {
                            return C6458nf.o(reVar, aVar7, efVar7, j110, tVar);
                        }
                    };
                    aVar3 = aVar7;
                    efVar4 = efVar7;
                    rVarH.v(objE4);
                }
                Function0.g((er.a) objE4, rVarH, 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                j16 = j17;
                efVar3 = efVar4;
            } else {
                rVarH.O();
                aVar3 = aVar2;
                j16 = jE;
                efVar3 = efVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final er.a<i0> aVar8 = aVar3;
                d5VarM.a(new p() { // from class: f2.lf
                    @Override // er.p
                    public final Object B(Object obj2, Object obj3) {
                        return C6458nf.p(aVar8, j16, efVar3, pVar, i15, i16, (r) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        efVar2 = efVar;
        if ((i15 & 3072) == 0) {
            if (rVarH.G(pVar)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i17 |= i18;
        }
        z15 = true;
        if ((i17 & 1171) != 1170) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (rVarH.r(z16, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i19 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new er.a() { // from class: f2.ff
                            @Override // er.a
                            public final Object a() {
                                return C6458nf.i();
                            }
                        };
                        rVarH.v(objE);
                    }
                    aVar4 = (er.a) objE;
                } else {
                    aVar4 = aVar2;
                }
                if ((i16 & 2) != 0) {
                    jE = g2.e(n0.f56958a.i(rVarH, 6), rVarH, 0);
                    i17 &= -113;
                }
                if (i25 != 0) {
                    aVar3 = aVar4;
                    efVar4 = new ef(false, false, 3, null);
                    j17 = jE;
                } else {
                    aVar3 = aVar4;
                    j17 = jE;
                    efVar4 = efVar2;
                }
            } else {
                if (i19 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new er.a() { // from class: f2.ff
                            @Override // er.a
                            public final Object a() {
                                return C6458nf.i();
                            }
                        };
                        rVarH.v(objE);
                    }
                    aVar4 = (er.a) objE;
                } else {
                    aVar4 = aVar2;
                }
                if ((i16 & 2) != 0) {
                    jE = g2.e(n0.f56958a.i(rVarH, 6), rVarH, 0);
                    i17 &= -113;
                }
                if (i25 != 0) {
                    aVar3 = aVar4;
                    efVar4 = new ef(false, false, 3, null);
                    j17 = jE;
                } else {
                    aVar3 = aVar4;
                    j17 = jE;
                    efVar4 = efVar2;
                }
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(-85756322, i17, -1, "androidx.compose.material3.ModalBottomSheetDialog (ModalBottomSheet.android.kt:229)");
            }
            view = (View) rVarH.N(AndroidCompositionLocals_androidKt.g());
            dVar = (d) rVarH.N(g1.f());
            tVar = (t) rVarH.N(g1.l());
            vVarE = m.e(rVarH, 0);
            f6VarP = x5.p(pVar, rVarH, (i17 >> 9) & 14);
            Object[] objArr3 = new Object[0];
            objE2 = rVarH.E();
            companion = r.INSTANCE;
            if (objE2 == companion.a()) {
                objE2 = new er.a() { // from class: f2.gf
                    @Override // er.a
                    public final Object a() {
                        return C6458nf.k();
                    }
                };
                rVarH.v(objE2);
            }
            uuid = (UUID) f.k(objArr3, (er.a) objE2, rVarH, 48);
            zW = rVarH.W(view) | rVarH.W(dVar);
            Object objE7 = rVarH.E();
            if (zW) {
                re reVar5 = new re(aVar3, efVar4, j17, view, tVar, dVar, uuid, null);
                reVar5.n(vVarE, y2.m.b(1379699857, true, new p() { // from class: f2.hf
                    @Override // er.p
                    public final Object B(Object obj2, Object obj3) {
                        return C6458nf.l(f6VarP, (r) obj2, ((Integer) obj3).intValue());
                    }
                }));
                rVarH.v(reVar5);
                obj = reVar5;
            } else {
                re reVar6 = new re(aVar3, efVar4, j17, view, tVar, dVar, uuid, null);
                reVar6.n(vVarE, y2.m.b(1379699857, true, new p() { // from class: f2.hf
                    @Override // er.p
                    public final Object B(Object obj2, Object obj3) {
                        return C6458nf.l(f6VarP, (r) obj2, ((Integer) obj3).intValue());
                    }
                }));
                rVarH.v(reVar6);
                obj = reVar6;
            }
            reVar = (re) obj;
            zG = rVarH.G(reVar);
            objE3 = rVarH.E();
            if (zG) {
                objE3 = new l() { // from class: f2.jf
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return C6458nf.n(reVar, (s0) obj2);
                    }
                };
                rVarH.v(objE3);
            } else {
                objE3 = new l() { // from class: f2.jf
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return C6458nf.n(reVar, (s0) obj2);
                    }
                };
                rVarH.v(objE3);
            }
            Function0.a(reVar, (l) objE3, rVarH, 0);
            boolean zG4 = rVarH.G(reVar);
            if ((i17 & 14) == 4) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z111 = zG4 | z17;
            if ((i17 & 896) == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z27 = z111 | z18;
            if (((i17 & 112) ^ 48) > 32) {
            }
            zC = z27 | z15 | rVarH.c(tVar.ordinal());
            objE4 = rVarH.E();
            if (zC) {
                final long j111 = j17;
                final ef efVar8 = efVar4;
                final er.a aVar9 = aVar3;
                objE4 = new er.a() { // from class: f2.kf
                    @Override // er.a
                    public final Object a() {
                        return C6458nf.o(reVar, aVar9, efVar8, j111, tVar);
                    }
                };
                aVar3 = aVar9;
                efVar4 = efVar8;
                rVarH.v(objE4);
            } else {
                final long j112 = j17;
                final ef efVar9 = efVar4;
                final er.a aVar10 = aVar3;
                objE4 = new er.a() { // from class: f2.kf
                    @Override // er.a
                    public final Object a() {
                        return C6458nf.o(reVar, aVar10, efVar9, j112, tVar);
                    }
                };
                aVar3 = aVar10;
                efVar4 = efVar9;
                rVarH.v(objE4);
            }
            Function0.g((er.a) objE4, rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            j16 = j17;
            efVar3 = efVar4;
        } else {
            rVarH.O();
            aVar3 = aVar2;
            j16 = jE;
            efVar3 = efVar2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            final er.a aVar11 = aVar3;
            d5VarM.a(new p() { // from class: f2.lf
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return C6458nf.p(aVar11, j16, efVar3, pVar, i15, i16, (r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i() {
        return i0.f148189a;
    }

    private static final p<r, Integer, i0> j(f6<? extends p<? super r, ? super Integer, i0>> f6Var) {
        return (p) f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID k() {
        return UUID.randomUUID();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(f6 f6Var, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1379699857, i15, -1, "androidx.compose.material3.ModalBottomSheetDialog.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:249)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = new l() { // from class: f2.mf
                    @Override // er.l
                    public final Object b(Object obj) {
                        return C6458nf.m((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarD = n4.v.d(companion, false, (l) objE, 1, null);
            w0 w0VarI = d1.r.i(c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = j.e(rVar, mVarD);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            x xVar = x.f39368a;
            j(f6Var).B(rVar, 0);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(n4.i0 i0Var) {
        f0.i(i0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 n(re reVar, s0 s0Var) {
        reVar.show();
        return new a(reVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(re reVar, er.a aVar, ef efVar, long j15, t tVar) {
        reVar.t(aVar, efVar, j15, tVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(er.a aVar, long j15, ef efVar, p pVar, int i15, int i16, r rVar, int i17) {
        h(aVar, j15, efVar, pVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    public static final boolean q(long j15) {
        return !Color.m11equalsimpl0(j15, Color.INSTANCE.g()) && ((double) o1.i(j15)) <= 0.5d;
    }

    public static final boolean r(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & PKIFailureInfo.certRevoked) == 0) ? false : true;
    }
}
