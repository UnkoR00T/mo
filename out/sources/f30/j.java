package f30;

import androidx.compose.material3.l;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.g1;
import b1.k;
import c5.w;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import d1.x;
import er.p;
import f3.m;
import l3.d0;
import l3.g0;
import mx.Label;
import n3.o1;
import n4.f0;
import n4.v;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import q4.TextStyle;
import t70.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0099\u0001\u0010\u001d\u001a\u00020\u0004*\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\"\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lf30/a;", "data", "Ll3/d0;", "focusRequester", "Loq/i0;", "h", "(Lf30/a;Ll3/d0;Lm2/r;II)V", "Ld1/p3;", "", "testTag", "", "selected", "Lkotlin/Function0;", "onClick", "", "unselectedIconResId", "selectedIconResId", "Lf3/m;", "modifier", "enabled", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Lb1/l;", "interactionSource", "Landroidx/compose/ui/graphics/Color;", "selectedContentColor", "unselectedContentColor", "selectedIconBackground", "unselectedIconBackground", "m", "(Ld1/p3;Ljava/lang/String;ZLer/a;IILf3/m;ZLmx/a;Lb1/l;JJJJLm2/r;III)V", "Lc5/h;", "a", "F", "getBottomNavigationHeight", "()F", "bottomNavigationHeight", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f58867a = c5.h.n(80);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f58868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f58869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f58870c;

        a(boolean z15, long j15, long j16) {
            this.f58868a = z15;
            this.f58869b = j15;
            this.f58870c = j16;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1941585729);
            if (t.k()) {
                t.o(1941585729, i15, -1, "pl.gov.coi.common.ui.ds.bottomnavigation.BottomNavigationItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomNavigation.kt:158)");
            }
            long j15 = this.f58868a ? this.f58869b : this.f58870c;
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return j15;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    public static final void h(final BottomNavigationData bottomNavigationData, d0 d0Var, r rVar, final int i15, final int i16) {
        int i17;
        d0 d0Var2;
        boolean z15;
        final d0 d0Var3;
        d5 d5VarM;
        final d0 d0Var4;
        r rVarH = rVar.h(-971371645);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(bottomNavigationData) ? 4 : 2) | i15;
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
                    d0Var4 = null;
                } else {
                    d0Var4 = d0Var2;
                }
                if (t.k()) {
                    t.o(-971371645, i17, -1, "pl.gov.coi.common.ui.ds.bottomnavigation.BottomNavigation (BottomNavigation.kt:62)");
                }
                k70.a aVar = k70.a.f108864a;
                int i19 = k70.a.f108865b;
                long jA = aVar.a(rVarH, i19).getBase().a();
                long jA2 = aVar.a(rVarH, i19).getBase().a();
                d0Var3 = d0Var4;
                l.g(m.INSTANCE, null, jA, jA2, 0.0f, 0.0f, null, y2.m.d(1112359646, true, new p() { // from class: f30.c
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j.i(bottomNavigationData, d0Var4, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, 12582918, 114);
                if (t.k()) {
                    t.n();
                }
            } else {
                rVarH.O();
                d0Var3 = d0Var2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f30.d
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j.l(bottomNavigationData, d0Var3, i15, i16, (r) obj, ((Integer) obj2).intValue());
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
                d0Var4 = null;
            } else {
                d0Var4 = d0Var2;
            }
            if (t.k()) {
                t.o(-971371645, i17, -1, "pl.gov.coi.common.ui.ds.bottomnavigation.BottomNavigation (BottomNavigation.kt:62)");
            }
            k70.a aVar2 = k70.a.f108864a;
            int i110 = k70.a.f108865b;
            long jA3 = aVar2.a(rVarH, i110).getBase().a();
            long jA4 = aVar2.a(rVarH, i110).getBase().a();
            d0Var3 = d0Var4;
            l.g(m.INSTANCE, null, jA3, jA4, 0.0f, 0.0f, null, y2.m.d(1112359646, true, new p() { // from class: f30.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.i(bottomNavigationData, d0Var4, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 12582918, 114);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
            d0Var3 = d0Var2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f30.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.l(bottomNavigationData, d0Var3, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(BottomNavigationData bottomNavigationData, d0 d0Var, r rVar, int i15) {
        boolean z15;
        boolean z16;
        r rVar2 = rVar;
        boolean z17 = false;
        boolean z18 = true;
        if (rVar2.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1112359646, i15, -1, "pl.gov.coi.common.ui.ds.bottomnavigation.BottomNavigation.<anonymous> (BottomNavigation.kt:68)");
            }
            m mVarH = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.i(m.INSTANCE, f58867a), 0.0f, 1, null);
            Object objE = rVar2.E();
            if (objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: f30.e
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j.j((n4.i0) obj);
                    }
                };
                rVar2.v(objE);
            }
            m mVarD = v.d(mVarH, false, (er.l) objE, 1, null);
            w0 w0VarB = m3.b(d1.i.f39152a.i(), f3.c.INSTANCE.i(), rVar2, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            e0 e0VarT = rVar2.t();
            m mVarE = f3.j.e(rVar2, mVarD);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB);
            } else {
                rVar2.u();
            }
            r rVarC = n6.c(rVar2);
            n6.i(rVarC, w0VarB, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            q3 q3Var = q3.f39261a;
            rVar2.X(1845560942);
            int i16 = 0;
            for (Object obj : bottomNavigationData.a()) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    pq.v.x();
                }
                final BottomNavigationItem bottomNavigationItem = (BottomNavigationItem) obj;
                m mVarA = (i16 != pq.v.p(bottomNavigationData.a()) || d0Var == null) ? m.INSTANCE : g0.a(m.INSTANCE, d0Var);
                q3 q3Var2 = q3Var;
                String testTag = bottomNavigationItem.getTestTag();
                if (bottomNavigationData.getSelectedItemIndex() == i16) {
                    z16 = z17;
                    z15 = z18;
                } else {
                    z15 = z17;
                    z16 = z15;
                }
                int unselectedIconResId = bottomNavigationItem.getUnselectedIconResId();
                boolean z19 = z18;
                int selectedIconResId = bottomNavigationItem.getSelectedIconResId();
                boolean z25 = z16;
                Label label = bottomNavigationItem.getLabel();
                boolean zW = rVar2.W(bottomNavigationItem);
                Object objE2 = rVar2.E();
                if (zW || objE2 == r.INSTANCE.a()) {
                    objE2 = new er.a() { // from class: f30.f
                        @Override // er.a
                        public final Object a() {
                            return j.k(bottomNavigationItem);
                        }
                    };
                    rVar2.v(objE2);
                }
                m(q3Var2, testTag, z15, (er.a) objE2, unselectedIconResId, selectedIconResId, mVarA, false, label, null, 0L, 0L, 0L, 0L, rVar, 6, 0, 8000);
                q3Var = q3Var2;
                i16 = i17;
                z17 = z25;
                z18 = z19;
                rVar2 = rVar;
            }
            rVar.R();
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
    public static final i0 j(n4.i0 i0Var) {
        f0.H0(i0Var, true);
        f0.Y(i0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(BottomNavigationItem bottomNavigationItem) {
        bottomNavigationItem.b().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(BottomNavigationData bottomNavigationData, d0 d0Var, int i15, int i16, r rVar, int i17) {
        h(bottomNavigationData, d0Var, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:179:0x024c  */
    /* JADX WARN: Code duplicated, block: B:182:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:185:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:186:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:189:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:190:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:195:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:198:0x0306  */
    /* JADX WARN: Code duplicated, block: B:201:0x0312  */
    /* JADX WARN: Code duplicated, block: B:202:0x0316  */
    /* JADX WARN: Code duplicated, block: B:205:0x0373  */
    /* JADX WARN: Code duplicated, block: B:208:0x037f  */
    /* JADX WARN: Code duplicated, block: B:209:0x0383  */
    /* JADX WARN: Code duplicated, block: B:212:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:213:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:215:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:216:0x0426  */
    /* JADX WARN: Code duplicated, block: B:219:0x0479  */
    /* JADX WARN: Code duplicated, block: B:222:0x0485  */
    /* JADX WARN: Code duplicated, block: B:223:0x0489  */
    /* JADX WARN: Code duplicated, block: B:226:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:227:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:229:0x04db  */
    /* JADX WARN: Code duplicated, block: B:230:0x04de  */
    /* JADX WARN: Code duplicated, block: B:233:0x051d  */
    /* JADX WARN: Code duplicated, block: B:235:0x0554  */
    /* JADX WARN: Code duplicated, block: B:236:0x0567  */
    /* JADX WARN: Code duplicated, block: B:239:0x0576  */
    /* JADX WARN: Code duplicated, block: B:240:0x0579  */
    /* JADX WARN: Code duplicated, block: B:243:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:246:0x05db  */
    /* JADX WARN: Instruction removed from duplicated block: B:226:0x04c3, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:235:0x0554, please report this as an issue */
    private static final void m(final p3 p3Var, final String str, final boolean z15, final er.a<i0> aVar, final int i15, final int i16, m mVar, boolean z16, Label label, b1.l lVar, long j15, long j16, long j17, long j18, r rVar, final int i17, final int i18, final int i19) {
        int i25;
        er.a<i0> aVar2;
        m mVar2;
        boolean z17;
        Label label2;
        int i26;
        long secondary;
        int i27;
        int i28;
        r rVar2;
        final b1.l lVar2;
        final long j19;
        final long j25;
        final m mVar3;
        final Label label3;
        final boolean z18;
        final long j26;
        final long j27;
        b1.l lVar3;
        long primary;
        long jB;
        long j28;
        final Label label4;
        long jB2;
        f6<Boolean> f6VarA;
        Object objE;
        r.Companion companion;
        boolean z19;
        boolean z25;
        boolean z26;
        Object objE2;
        er.a<androidx.compose.ui.node.c> aVarB;
        m.Companion companion2;
        er.a<androidx.compose.ui.node.c> aVarB2;
        k70.a aVar3;
        int i29;
        long jM9copywmQWz5c$default;
        er.a<androidx.compose.ui.node.c> aVarB3;
        String str2;
        int i35;
        long j29;
        long j35;
        String str3;
        long j36;
        r rVarH = rVar.h(1748483224);
        if ((i17 & 6) == 0) {
            i25 = (rVarH.W(p3Var) ? 4 : 2) | i17;
        } else {
            i25 = i17;
        }
        if ((i17 & 48) == 0) {
            i25 |= rVarH.W(str) ? 32 : 16;
        }
        if ((i17 & MLKEMEngine.KyberPolyBytes) == 0) {
            i25 |= rVarH.a(z15) ? 256 : 128;
        }
        if ((i17 & 3072) == 0) {
            aVar2 = aVar;
            i25 |= rVarH.G(aVar2) ? 2048 : 1024;
        } else {
            aVar2 = aVar;
        }
        if ((i17 & 24576) == 0) {
            i25 |= rVarH.c(i15) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i17 & 196608) == 0) {
            i25 |= rVarH.c(i16) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        int i36 = i19 & 32;
        if (i36 != 0) {
            i25 |= 1572864;
            mVar2 = mVar;
        } else {
            mVar2 = mVar;
            if ((i17 & 1572864) == 0) {
                i25 |= rVarH.W(mVar2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            }
        }
        int i37 = i19 & 64;
        if (i37 != 0) {
            i25 |= 12582912;
            z17 = z16;
        } else {
            z17 = z16;
            if ((i17 & 12582912) == 0) {
                i25 |= rVarH.a(z17) ? 8388608 : 4194304;
            }
        }
        int i38 = i19 & 128;
        if (i38 != 0) {
            i25 |= 100663296;
            label2 = label;
        } else {
            label2 = label;
            if ((i17 & 100663296) == 0) {
                i25 |= rVarH.W(label2) ? 67108864 : 33554432;
            }
        }
        int i39 = i19 & 256;
        if (i39 != 0) {
            i25 |= 805306368;
        } else if ((i17 & 805306368) == 0) {
            i25 |= rVarH.W(lVar) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i18 & 6) == 0) {
            i26 = i18 | (((i19 & 512) == 0 && rVarH.d(j15)) ? 4 : 2);
        } else {
            i26 = i18;
        }
        if ((i18 & 48) == 0) {
            i26 |= ((i19 & 1024) == 0 && rVarH.d(j16)) ? 32 : 16;
        }
        int i45 = i26;
        if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
            secondary = j17;
            i27 = i45 | (((i19 & 2048) == 0 && rVarH.d(secondary)) ? 256 : 128);
        } else {
            secondary = j17;
            i27 = i45;
        }
        int i46 = i19 & PKIFailureInfo.certConfirmed;
        if (i46 != 0) {
            i28 = i27 | 3072;
        } else {
            int i47 = i27;
            if ((i18 & 3072) == 0) {
                i28 = i47 | (rVarH.d(j18) ? 2048 : 1024);
            } else {
                i28 = i47;
            }
        }
        if (rVarH.r(((306783379 & i25) == 306783378 && (i28 & 1171) == 1170) ? false : true, i25 & 1)) {
            rVarH.I();
            if ((i17 & 1) == 0 || rVarH.Q()) {
                if (i36 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i37 != 0) {
                    z17 = true;
                }
                if (i38 != 0) {
                    label2 = null;
                }
                if (i39 != 0) {
                    Object objE3 = rVarH.E();
                    if (objE3 == r.INSTANCE.a()) {
                        objE3 = k.a();
                        rVarH.v(objE3);
                    }
                    lVar3 = (b1.l) objE3;
                } else {
                    lVar3 = lVar;
                }
                if ((i19 & 512) != 0) {
                    primary = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().getPrimary();
                    i28 &= -15;
                } else {
                    primary = j15;
                }
                if ((i19 & 1024) != 0) {
                    jB = k70.a.f108864a.a(rVarH, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
                    i28 &= -113;
                } else {
                    jB = j16;
                }
                if ((i19 & 2048) != 0) {
                    secondary = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().getSecondary();
                    i28 &= -897;
                }
                if (i46 != 0) {
                    j28 = secondary;
                    label4 = label2;
                    jB2 = o1.b(0);
                }
                rVarH.y();
                if (t.k()) {
                    t.o(1748483224, i25, i28, "pl.gov.coi.common.ui.ds.bottomnavigation.BottomNavigationItem (BottomNavigation.kt:116)");
                }
                f6VarA = b1.f.a(lVar3, rVarH, (i25 >> 27) & 14);
                b1.l lVar4 = lVar3;
                m mVar4 = mVar2;
                boolean z27 = z17;
                m mVarC = p3.c(p3Var, k1.d.a(mVar4, z15, lVar4, null, z27, n4.l.j(n4.l.INSTANCE.h()), aVar2), 1.0f, false, 2, null);
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = new er.l() { // from class: f30.g
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j.n((n4.i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                m mVarD = v.d(mVarC, false, (er.l) objE, 1, null);
                if ((i25 & 112) == 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if ((234881024 & i25) == 67108864) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = z19 | z25;
                objE2 = rVarH.E();
                if (z26 || objE2 == companion.a()) {
                    objE2 = new er.l() { // from class: f30.h
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j.o(str, label4, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE2);
                }
                m mVarD2 = v.d(mVarD, false, (er.l) objE2, 1, null);
                f3.c.Companion companion3 = f3.c.INSTANCE;
                w0 w0VarI = d1.r.i(companion3.e(), false);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT = rVarH.t();
                m mVarE = f3.j.e(rVarH, mVarD2);
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
                r rVarC = n6.c(rVarH);
                n6.i(rVarC, w0VarI, companion4.d());
                n6.i(rVarC, e0VarT, companion4.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
                n6.g(rVarC, companion4.a());
                n6.i(rVarC, mVarE, companion4.e());
                x xVar = x.f39368a;
                companion2 = m.INSTANCE;
                w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), companion3.k(), rVarH, 0);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT2 = rVarH.t();
                m mVarE2 = f3.j.e(rVarH, companion2);
                aVarB2 = companion4.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB2);
                } else {
                    rVarH.u();
                }
                r rVarC2 = n6.c(rVarH);
                n6.i(rVarC2, w0VarA, companion4.d());
                n6.i(rVarC2, e0VarT2, companion4.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
                n6.g(rVarC2, companion4.a());
                n6.i(rVarC2, mVarE2, companion4.e());
                m mVarC2 = d1.i0.f39176a.c(companion2, companion3.g());
                aVar3 = k70.a.f108864a;
                i29 = k70.a.f108865b;
                m mVarA = k3.f.a(s.w(mVarC2, f6VarA, aVar3.b(rVarH, i29).getSpacing300(), 0.0f, 4, null), l1.h.i());
                if (z15) {
                    rVarH.X(1228084330);
                    rVarH.R();
                    jM9copywmQWz5c$default = j28;
                } else if (f6VarA.getValue().booleanValue()) {
                    rVarH.X(1228087238);
                    jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(aVar3.a(rVarH, i29).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                    rVarH.R();
                } else {
                    rVarH.X(1228088556);
                    rVarH.R();
                    jM9copywmQWz5c$default = jB2;
                }
                m mVarV = androidx.compose.foundation.layout.d.v(w0.i.d(mVarA, jM9copywmQWz5c$default, null, 2, null), c5.h.n(64), c5.h.n(32));
                w0 w0VarI2 = d1.r.i(companion3.o(), false);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT3 = rVarH.t();
                m mVarE3 = f3.j.e(rVarH, mVarV);
                aVarB3 = companion4.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB3);
                } else {
                    rVarH.u();
                }
                r rVarC3 = n6.c(rVarH);
                n6.i(rVarC3, w0VarI2, companion4.d());
                n6.i(rVarC3, e0VarT3, companion4.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
                n6.g(rVarC3, companion4.a());
                n6.i(rVarC3, mVarE3, companion4.e());
                m mVarD3 = xVar.d(companion2, companion3.e());
                if (str != null) {
                    str2 = str + "Icon";
                } else {
                    str2 = null;
                }
                if (z15) {
                    i35 = i16;
                } else {
                    i35 = i15;
                }
                j29 = primary;
                j35 = jB;
                d40.h.f(mVarD3, new d40.b.C0864b(str2, i35, d40.i.f.f39709e, new a(z15, j29, j35), Label.INSTANCE.c(), null, 32, null), false, rVarH, 0, 4);
                rVar2 = rVarH;
                rVar2.x();
                if (label4 != null) {
                    rVar2.X(-583347401);
                    r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar3.b(rVar2, i29).getSpacing25()), rVar2, 0);
                    float fH = c5.v.h(aVar3.f(rVar2, i29).e().n()) / ((c5.d) rVar2.N(g1.f())).getFontScale();
                    if (str != null) {
                        str3 = str + "Text";
                    } else {
                        str3 = null;
                    }
                    long jF = w.f(fH);
                    TextStyle textStyleE = aVar3.f(rVar2, i29).e();
                    if (z15) {
                        j36 = j29;
                    } else {
                        j36 = j35;
                    }
                    j70.h.g(androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null), str3, label4, null, null, j36, jF, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, b5.v.INSTANCE.e(), false, 0, 0, null, textStyleE, null, null, false, false, null, rVar2, ((i25 >> 18) & 896) | 6, 221184, 0, 32976792);
                } else {
                    rVar2.X(-589362610);
                }
                rVar2.R();
                rVar2.x();
                rVar2.x();
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar4;
                label3 = label4;
                j25 = j28;
                j19 = jB2;
                z18 = z27;
                lVar2 = lVar4;
                j26 = j29;
                j27 = j35;
            } else {
                rVarH.O();
                if ((i19 & 512) != 0) {
                    i28 &= -15;
                }
                if ((i19 & 1024) != 0) {
                    i28 &= -113;
                }
                if ((i19 & 2048) != 0) {
                    i28 &= -897;
                }
                lVar3 = lVar;
                primary = j15;
                jB = j16;
            }
            jB2 = j18;
            j28 = secondary;
            label4 = label2;
            rVarH.y();
            if (t.k()) {
                t.o(1748483224, i25, i28, "pl.gov.coi.common.ui.ds.bottomnavigation.BottomNavigationItem (BottomNavigation.kt:116)");
            }
            f6VarA = b1.f.a(lVar3, rVarH, (i25 >> 27) & 14);
            b1.l lVar5 = lVar3;
            m mVar5 = mVar2;
            boolean z28 = z17;
            m mVarC3 = p3.c(p3Var, k1.d.a(mVar5, z15, lVar5, null, z28, n4.l.j(n4.l.INSTANCE.h()), aVar2), 1.0f, false, 2, null);
            objE = rVarH.E();
            companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = new er.l() { // from class: f30.g
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j.n((n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            m mVarD4 = v.d(mVarC3, false, (er.l) objE, 1, null);
            if ((i25 & 112) == 32) {
                z19 = true;
            } else {
                z19 = false;
            }
            if ((234881024 & i25) == 67108864) {
                z25 = true;
            } else {
                z25 = false;
            }
            z26 = z19 | z25;
            objE2 = rVarH.E();
            if (z26) {
                objE2 = new er.l() { // from class: f30.h
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j.o(str, label4, (n4.i0) obj);
                    }
                };
                rVarH.v(objE2);
            } else {
                objE2 = new er.l() { // from class: f30.h
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j.o(str, label4, (n4.i0) obj);
                    }
                };
                rVarH.v(objE2);
            }
            m mVarD5 = v.d(mVarD4, false, (er.l) objE2, 1, null);
            f3.c.Companion companion5 = f3.c.INSTANCE;
            w0 w0VarI3 = d1.r.i(companion5.e(), false);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT4 = rVarH.t();
            m mVarE4 = f3.j.e(rVarH, mVarD5);
            androidx.compose.ui.node.c.Companion companion6 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion6.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC4 = n6.c(rVarH);
            n6.i(rVarC4, w0VarI3, companion6.d());
            n6.i(rVarC4, e0VarT4, companion6.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion6.c());
            n6.g(rVarC4, companion6.a());
            n6.i(rVarC4, mVarE4, companion6.e());
            x xVar2 = x.f39368a;
            companion2 = m.INSTANCE;
            w0 w0VarA2 = d1.e0.a(d1.i.f39152a.k(), companion5.k(), rVarH, 0);
            int iHashCode5 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT5 = rVarH.t();
            m mVarE5 = f3.j.e(rVarH, companion2);
            aVarB2 = companion6.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC5 = n6.c(rVarH);
            n6.i(rVarC5, w0VarA2, companion6.d());
            n6.i(rVarC5, e0VarT5, companion6.f());
            n6.i(rVarC5, Integer.valueOf(iHashCode5), companion6.c());
            n6.g(rVarC5, companion6.a());
            n6.i(rVarC5, mVarE5, companion6.e());
            m mVarC4 = d1.i0.f39176a.c(companion2, companion5.g());
            aVar3 = k70.a.f108864a;
            i29 = k70.a.f108865b;
            m mVarA2 = k3.f.a(s.w(mVarC4, f6VarA, aVar3.b(rVarH, i29).getSpacing300(), 0.0f, 4, null), l1.h.i());
            if (z15) {
                rVarH.X(1228084330);
                rVarH.R();
                jM9copywmQWz5c$default = j28;
            } else if (f6VarA.getValue().booleanValue()) {
                rVarH.X(1228087238);
                jM9copywmQWz5c$default = Color.m9copywmQWz5c$default(aVar3.a(rVarH, i29).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
                rVarH.R();
            } else {
                rVarH.X(1228088556);
                rVarH.R();
                jM9copywmQWz5c$default = jB2;
            }
            m mVarV2 = androidx.compose.foundation.layout.d.v(w0.i.d(mVarA2, jM9copywmQWz5c$default, null, 2, null), c5.h.n(64), c5.h.n(32));
            w0 w0VarI4 = d1.r.i(companion5.o(), false);
            int iHashCode6 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT6 = rVarH.t();
            m mVarE6 = f3.j.e(rVarH, mVarV2);
            aVarB3 = companion6.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB3);
            } else {
                rVarH.u();
            }
            r rVarC6 = n6.c(rVarH);
            n6.i(rVarC6, w0VarI4, companion6.d());
            n6.i(rVarC6, e0VarT6, companion6.f());
            n6.i(rVarC6, Integer.valueOf(iHashCode6), companion6.c());
            n6.g(rVarC6, companion6.a());
            n6.i(rVarC6, mVarE6, companion6.e());
            m mVarD6 = xVar2.d(companion2, companion5.e());
            if (str != null) {
                str2 = str + "Icon";
            } else {
                str2 = null;
            }
            if (z15) {
                i35 = i16;
            } else {
                i35 = i15;
            }
            j29 = primary;
            j35 = jB;
            d40.h.f(mVarD6, new d40.b.C0864b(str2, i35, d40.i.f.f39709e, new a(z15, j29, j35), Label.INSTANCE.c(), null, 32, null), false, rVarH, 0, 4);
            rVar2 = rVarH;
            rVar2.x();
            if (label4 != null) {
                rVar2.X(-583347401);
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar3.b(rVar2, i29).getSpacing25()), rVar2, 0);
                float fH2 = c5.v.h(aVar3.f(rVar2, i29).e().n()) / ((c5.d) rVar2.N(g1.f())).getFontScale();
                if (str != null) {
                    str3 = str + "Text";
                } else {
                    str3 = null;
                }
                long jF2 = w.f(fH2);
                TextStyle textStyleE2 = aVar3.f(rVar2, i29).e();
                if (z15) {
                    j36 = j29;
                } else {
                    j36 = j35;
                }
                j70.h.g(androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null), str3, label4, null, null, j36, jF2, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, b5.v.INSTANCE.e(), false, 0, 0, null, textStyleE2, null, null, false, false, null, rVar2, ((i25 >> 18) & 896) | 6, 221184, 0, 32976792);
            } else {
                rVar2.X(-589362610);
            }
            rVar2.R();
            rVar2.x();
            rVar2.x();
            if (t.k()) {
                t.n();
            }
            mVar3 = mVar5;
            label3 = label4;
            j25 = j28;
            j19 = jB2;
            z18 = z28;
            lVar2 = lVar5;
            j26 = j29;
            j27 = j35;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            lVar2 = lVar;
            j19 = j18;
            j25 = secondary;
            mVar3 = mVar2;
            label3 = label2;
            z18 = z17;
            j26 = j15;
            j27 = j16;
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f30.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.p(p3Var, str, z15, aVar, i15, i16, mVar3, z18, label3, lVar2, j26, j27, j25, j19, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(n4.i0 i0Var) {
        n4.g0.a(i0Var, true);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(String str, Label label, n4.i0 i0Var) {
        String tag;
        if (str == null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("navigationItem");
            if (label == null || (tag = label.getTag()) == null) {
                tag = "Undefined";
            }
            sb5.append(tag);
            str = sb5.toString();
        }
        f0.y0(i0Var, str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(p3 p3Var, String str, boolean z15, er.a aVar, int i15, int i16, m mVar, boolean z16, Label label, b1.l lVar, long j15, long j16, long j17, long j18, int i17, int i18, int i19, r rVar, int i25) {
        m(p3Var, str, z15, aVar, i15, i16, mVar, z16, label, lVar, j15, j16, j17, j18, rVar, g4.a(i17 | 1), g4.a(i18), i19);
        return i0.f148189a;
    }
}
