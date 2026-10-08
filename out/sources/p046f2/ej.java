package p046f2;

import androidx.compose.ui.platform.g1;
import b3.f;
import c5.h;
import c5.y;
import c5.z;
import d1.x;
import er.p;
import er.q;
import f3.c;
import f3.j;
import h2.b2;
import n3.e3;
import n3.z1;
import oq.u;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p143z0.a2;
import p143z0.e1;
import tq.e;
import u0.i0;
import u0.l;
import u0.m;
import vq.d;
import z3.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aW\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001f\u0010\u001e\" \u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0014\u0010)\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lf3/m;", "modifier", "Lkotlin/Function0;", "Loq/i0;", "content", "k", "(Lf3/m;Ler/p;Lm2/r;I)V", "Lf2/hj;", "sheetState", "Lz0/a2;", "orientation", "Lz0/e1;", "flingBehavior", "Lz3/a;", "j", "(Lf2/hj;Lz0/a2;Lz0/e1;)Lz3/a;", "", "skipPartiallyExpanded", "Lkotlin/Function1;", "Lf2/ij;", "confirmValueChange", "initialValue", "skipHiddenState", "Lc5/h;", "positionalThreshold", "velocityThreshold", "q", "(ZLer/l;Lf2/ij;ZFFLm2/r;II)Lf2/hj;", "state", "x", "(Lf3/m;Lf2/hj;)Lf3/m;", "v", "Lu0/l;", "", "a", "Lu0/l;", "p", "()Lu0/l;", "BottomSheetAnimationSpec", "b", "F", "DragHandleVerticalPadding", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l<Float> f55778a = m.l(300, 0, i0.d(), 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f55779b = h.n(22);

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0002*\u00020\u0006H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0002*\u00020\u0003H\u0003¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"f2/ej$a", "Lz3/a;", "", "Lm3/e;", "b", "(F)J", "Lc5/y;", "c", "(J)F", "a", "available", "Lz3/g;", "source", "h2", "(JI)J", "consumed", "d1", "(JJI)J", "r2", "(JLtq/e;)Ljava/lang/Object;", "W0", "(JJLtq/e;)Ljava/lang/Object;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements z3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ hj f55780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e1 f55781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a2 f55782c;

        /* JADX INFO: renamed from: f2.ej$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class C1302a extends d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            long f55783d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f55784e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f55786g;

            C1302a(e<? super C1302a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f55784e = obj;
                this.f55786g |= PKIFailureInfo.systemUnavail;
                return a.this.W0(0L, 0L, this);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b extends d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            long f55787d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f55788e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f55790g;

            b(e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f55788e = obj;
                this.f55790g |= PKIFailureInfo.systemUnavail;
                return a.this.r2(0L, this);
            }
        }

        a(hj hjVar, e1 e1Var, a2 a2Var) {
            this.f55780a = hjVar;
            this.f55781b = e1Var;
            this.f55782c = a2Var;
        }

        private final float a(long j15) {
            return Float.intBitsToFloat((int) (this.f55782c == a2.Horizontal ? j15 >> 32 : j15 & BodyPartID.bodyIdMax));
        }

        private final long b(float f15) {
            a2 a2Var = this.f55782c;
            float f16 = a2Var == a2.Horizontal ? f15 : 0.0f;
            if (a2Var != a2.Vertical) {
                f15 = 0.0f;
            }
            return m3.e.e((((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f15)) & BodyPartID.bodyIdMax));
        }

        private final float c(long j15) {
            return this.f55782c == a2.Horizontal ? y.h(j15) : y.i(j15);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // z3.a
        public Object W0(long j15, long j16, e<? super y> eVar) throws Throwable {
            C1302a c1302a;
            if (eVar instanceof C1302a) {
                c1302a = (C1302a) eVar;
                int i15 = c1302a.f55786g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c1302a.f55786g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c1302a = new C1302a(eVar);
                }
            } else {
                c1302a = new C1302a(eVar);
            }
            Object objA = c1302a.f55784e;
            Object objE = uq.b.e();
            int i16 = c1302a.f55786g;
            if (i16 == 0) {
                u.b(objA);
                float fC = c(j16);
                hj hjVar = this.f55780a;
                e1 e1Var = this.f55781b;
                c1302a.f55783d = j15;
                c1302a.f55786g = 1;
                objA = hjVar.a(e1Var, fC, c1302a);
                if (objA == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j15 = c1302a.f55783d;
                u.b(objA);
            }
            return y.b(z.a(y.h(j15), ((Number) objA).floatValue()));
        }

        @Override // z3.a
        public long d1(long consumed, long available, int source) {
            return g.d(source, g.INSTANCE.b()) ? b(this.f55780a.d().g(a(available))) : m3.e.INSTANCE.c();
        }

        @Override // z3.a
        public long h2(long available, int source) {
            float fA = a(available);
            return (fA >= 0.0f || !g.d(source, g.INSTANCE.b())) ? m3.e.INSTANCE.c() : b(this.f55780a.d().g(fA));
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // z3.a
        public Object r2(long j15, e<? super y> eVar) throws Throwable {
            b bVar;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f55790g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f55790g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object obj = bVar.f55788e;
            Object objE = uq.b.e();
            int i16 = bVar.f55790g;
            if (i16 == 0) {
                u.b(obj);
                float fC = c(j15);
                float fO = this.f55780a.o();
                float fE = this.f55780a.d().i().e();
                if (fC >= 0.0f || fO <= fE) {
                    j15 = y.INSTANCE.a();
                } else {
                    hj hjVar = this.f55780a;
                    e1 e1Var = this.f55781b;
                    bVar.f55787d = j15;
                    bVar.f55790g = 1;
                    if (hjVar.a(e1Var, fC, bVar) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j15 = bVar.f55787d;
                u.b(obj);
            }
            return y.b(j15);
        }
    }

    public static final z3.a j(hj hjVar, a2 a2Var, e1 e1Var) {
        return new a(hjVar, e1Var, a2Var);
    }

    public static final void k(final f3.m mVar, final p<? super r, ? super Integer, oq.i0> pVar, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(1361920385);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(1361920385, i16, -1, "androidx.compose.material3.DragHandleWithTooltip (SheetDefaults.kt:445)");
            }
            h2.a2.Companion companion = h2.a2.INSTANCE;
            final String strB = b2.b(h2.a2.a(ih.f56313c), rVarH, 0);
            f3.m mVarH = androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null);
            w0 w0VarI = d1.r.i(c.INSTANCE.e(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            f3.m mVarE = j.e(rVarH, mVarH);
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
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            x xVar = x.f39368a;
            rVar2 = rVarH;
            hr.t(rq.f57659a.e(pq.INSTANCE.a(), 0.0f, rVar2, 390, 2), y2.m.d(1497042086, true, new q() { // from class: f2.wi
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return ej.l(strB, (jr) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), hr.M(false, false, null, rVar2, 0, 7), mVar, null, false, false, false, pVar, rVarH, ((i16 << 9) & 7168) | 48 | ((i16 << 21) & 234881024), 240);
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.xi
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return ej.n(mVar, pVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(final String str, jr jrVar, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVar.W(jrVar) : rVar.G(jrVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(1497042086, i16, -1, "androidx.compose.material3.DragHandleWithTooltip.<anonymous>.<anonymous> (SheetDefaults.kt:452)");
            }
            hr.p(jrVar, null, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, y2.m.d(435848468, true, new p() { // from class: f2.zi
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return ej.m(str, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, (i16 & 14) | 805306368, GF2Field.MASK);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(String str, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(435848468, i15, -1, "androidx.compose.material3.DragHandleWithTooltip.<anonymous>.<anonymous>.<anonymous> (SheetDefaults.kt:452)");
            }
            oo.j(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 262142);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(f3.m mVar, p pVar, int i15, r rVar, int i16) {
        k(mVar, pVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final l<Float> p() {
        return f55778a;
    }

    public static final hj q(boolean z15, er.l<? super ij, Boolean> lVar, ij ijVar, boolean z16, float f15, float f16, r rVar, int i15, int i16) {
        final er.l<? super ij, Boolean> lVar2;
        final boolean z17 = (i16 & 1) != 0 ? false : z15;
        if ((i16 & 2) != 0) {
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: f2.aj
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Boolean.valueOf(ej.r((ij) obj));
                    }
                };
                rVar.v(objE);
            }
            lVar2 = (er.l) objE;
        } else {
            lVar2 = lVar;
        }
        final ij ijVar2 = (i16 & 4) != 0 ? ij.Hidden : ijVar;
        final boolean z18 = (i16 & 8) != 0 ? false : z16;
        final float fM = (i16 & 16) != 0 ? n0.f56958a.m() : f15;
        final float fQ = (i16 & 32) != 0 ? n0.f56958a.q() : f16;
        if (t.k()) {
            t.o(-20307384, i15, -1, "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:528)");
        }
        final c5.d dVar = (c5.d) rVar.N(g1.f());
        boolean z19 = true;
        boolean zW = rVar.W(dVar) | ((((57344 & i15) ^ 24576) > 16384 && rVar.b(fM)) || (i15 & 24576) == 16384);
        Object objE2 = rVar.E();
        if (zW || objE2 == r.INSTANCE.a()) {
            objE2 = new er.a() { // from class: f2.bj
                @Override // er.a
                public final Object a() {
                    return Float.valueOf(ej.s(dVar, fM));
                }
            };
            rVar.v(objE2);
        }
        final er.a<Float> aVar = (er.a) objE2;
        boolean zW2 = rVar.W(dVar) | ((((458752 & i15) ^ 196608) > 131072 && rVar.b(fQ)) || (i15 & 196608) == 131072);
        Object objE3 = rVar.E();
        if (zW2 || objE3 == r.INSTANCE.a()) {
            objE3 = new er.a() { // from class: f2.cj
                @Override // er.a
                public final Object a() {
                    return Float.valueOf(ej.t(dVar, fQ));
                }
            };
            rVar.v(objE3);
        }
        final er.a<Float> aVar2 = (er.a) objE3;
        Object[] objArr = {Boolean.valueOf(z17), lVar2, Boolean.valueOf(z18)};
        b3.x<hj, ij> xVarC = hj.INSTANCE.c(z17, aVar, aVar2, lVar2, z18);
        boolean zW3 = ((((i15 & 112) ^ 48) > 32 && rVar.W(lVar2)) || (i15 & 48) == 32) | ((((i15 & 14) ^ 6) > 4 && rVar.a(z17)) || (i15 & 6) == 4) | rVar.W(aVar) | rVar.W(aVar2) | ((((i15 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && rVar.c(ijVar2.ordinal())) || (i15 & MLKEMEngine.KyberPolyBytes) == 256);
        if ((((i15 & 7168) ^ 3072) <= 2048 || !rVar.a(z18)) && (i15 & 3072) != 2048) {
            z19 = false;
        }
        boolean z25 = zW3 | z19;
        Object objE4 = rVar.E();
        if (z25 || objE4 == r.INSTANCE.a()) {
            objE4 = new er.a() { // from class: f2.dj
                @Override // er.a
                public final Object a() {
                    return ej.u(z17, aVar, aVar2, ijVar2, lVar2, z18);
                }
            };
            rVar.v(objE4);
        }
        hj hjVar = (hj) f.i(objArr, xVarC, (er.a) objE4, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return hjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(ij ijVar) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float s(c5.d dVar, float f15) {
        return dVar.l2(f15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float t(c5.d dVar, float f15) {
        return dVar.l2(f15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hj u(boolean z15, er.a aVar, er.a aVar2, ij ijVar, er.l lVar, boolean z16) {
        return new hj(z15, aVar, aVar2, ijVar, lVar, z16);
    }

    public static final f3.m v(f3.m mVar, final hj hjVar) {
        return z1.c(mVar, new er.l() { // from class: f2.yi
            @Override // er.l
            public final Object b(Object obj) {
                return ej.w(hjVar, (n3.a2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(hj hjVar, n3.a2 a2Var) {
        float fL = hjVar.d().l();
        float fE = hjVar.d().i().e();
        float f15 = fL < fE ? fE - fL : 0.0f;
        a2Var.D(f15 > 0.0f ? 1 / ((Float.intBitsToFloat((int) (a2Var.getSize() & BodyPartID.bodyIdMax)) + f15) / Float.intBitsToFloat((int) (a2Var.getSize() & BodyPartID.bodyIdMax))) : 1.0f);
        a2Var.Y0(e3.a(0.5f, 0.0f));
        return oq.i0.f148189a;
    }

    public static final f3.m x(f3.m mVar, final hj hjVar) {
        return z1.c(mVar, new er.l() { // from class: f2.vi
            @Override // er.l
            public final Object b(Object obj) {
                return ej.y(hjVar, (n3.a2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(hj hjVar, n3.a2 a2Var) {
        float fL = hjVar.d().l();
        float fE = hjVar.d().i().e();
        float f15 = fL < fE ? fE - fL : 0.0f;
        a2Var.D(f15 > 0.0f ? (Float.intBitsToFloat((int) (a2Var.getSize() & BodyPartID.bodyIdMax)) + f15) / Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & a2Var.getSize())) : 1.0f);
        a2Var.Y0(e3.a(0.5f, 0.0f));
        return oq.i0.f148189a;
    }
}
