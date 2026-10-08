package p060i1;

import a1.o;
import android.os.Trace;
import c5.b;
import c5.n;
import d1.a3;
import d1.d3;
import er.l;
import er.q;
import f3.c;
import java.util.List;
import ju.p0;
import lr.m;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.x0;
import p056h1.i;
import p056h1.s2;
import p056h1.x;
import p056h1.y0;
import p056h1.z0;
import p071kotlin.Metadata;
import p076m2.t;
import p143z0.a2;
import pq.v;
import pq.v0;
import r0.r;
import w0.a0;

/* JADX INFO: renamed from: i1.t0, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0087\u0001\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0000H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a)\u0010$\u001a\u00020#*\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lkotlin/Function0;", "Li1/l0;", "itemProviderLambda", "Li1/i1;", "state", "Ld1/d3;", "contentPadding", "", "reverseLayout", "Lz0/a2;", "orientation", "", "beyondViewportPageCount", "Lc5/h;", "pageSpacing", "Li1/p;", "pageSize", "Lf3/c$b;", "horizontalAlignment", "Lf3/c$c;", "verticalAlignment", "La1/o;", "snapPosition", "Lju/p0;", "coroutineScope", "pageCount", "Lh1/y0;", "c", "(Ler/a;Li1/i1;Ld1/d3;ZLz0/a2;IFLi1/p;Lf3/c$b;Lf3/c$c;La1/o;Lju/p0;Ler/a;Lm2/r;II)Lh1/y0;", "Lh1/z0;", "Lh1/i;", "cacheWindowLogic", "", "Li1/o;", "visiblePagesList", "Loq/i0;", "b", "(Lh1/z0;Lh1/i;Ljava/util/List;)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class Function0 {

    /* JADX INFO: renamed from: i1.t0$a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements y0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1 f88026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a2 f88027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d3 f88028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f88029d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f88030e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p f88031f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.a<l0> f88032g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.a<Integer> f88033h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ c.InterfaceC1317c f88034i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ c.b f88035j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f88036k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ o f88037l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ p0 f88038m;

        a(i1 i1Var, a2 a2Var, d3 d3Var, boolean z15, float f15, p pVar, er.a<l0> aVar, er.a<Integer> aVar2, c.InterfaceC1317c interfaceC1317c, c.b bVar, int i15, o oVar, p0 p0Var) {
            this.f88026a = i1Var;
            this.f88027b = a2Var;
            this.f88028c = d3Var;
            this.f88029d = z15;
            this.f88030e = f15;
            this.f88031f = pVar;
            this.f88032g = aVar;
            this.f88033h = aVar2;
            this.f88034i = interfaceC1317c;
            this.f88035j = bVar;
            this.f88036k = i15;
            this.f88037l = oVar;
            this.f88038m = p0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x0 c(z0 z0Var, long j15, int i15, int i16, int i17, int i18, l lVar) {
            return z0Var.x1(c5.c.g(j15, i17 + i15), c5.c.f(j15, i18 + i16), v0.i(), lVar);
        }

        @Override // p056h1.y0
        public final x0 a(final z0 z0Var, final long j15) {
            int i15;
            long jD;
            s2.a(this.f88026a.K());
            a2 a2Var = this.f88027b;
            a2 a2Var2 = a2.Vertical;
            boolean z15 = a2Var == a2Var2;
            a0.a(j15, z15 ? a2Var2 : a2.Horizontal);
            int iX0 = z15 ? z0Var.X0(this.f88028c.c(z0Var.getLayoutDirection())) : z0Var.X0(a3.k(this.f88028c, z0Var.getLayoutDirection()));
            int iX1 = z15 ? z0Var.X0(this.f88028c.b(z0Var.getLayoutDirection())) : z0Var.X0(a3.j(this.f88028c, z0Var.getLayoutDirection()));
            int iX2 = z0Var.X0(this.f88028c.getTop());
            int iX3 = z0Var.X0(this.f88028c.getBottom());
            final int i16 = iX2 + iX3;
            final int i17 = iX0 + iX1;
            int i18 = z15 ? i16 : i17;
            if (z15 && !this.f88029d) {
                i15 = iX2;
            } else if (z15 && this.f88029d) {
                i15 = iX3;
            } else {
                i15 = (z15 || this.f88029d) ? iX1 : iX0;
            }
            int i19 = i18 - i15;
            long jI = c5.c.i(j15, -i17, -i16);
            this.f88026a.p0(z0Var);
            int iX4 = z0Var.X0(this.f88030e);
            int iK = z15 ? b.k(j15) - i16 : b.l(j15) - i17;
            if (!this.f88029d || iK > 0) {
                jD = n.d((((long) iX0) << 32) | (((long) iX2) & BodyPartID.bodyIdMax));
            } else {
                if (!z15) {
                    iX0 += iK;
                }
                if (z15) {
                    iX2 += iK;
                }
                jD = n.d((((long) iX2) & BodyPartID.bodyIdMax) | (((long) iX0) << 32));
            }
            long j16 = jD;
            int iE = m.e(this.f88031f.a(z0Var, iK, iX4), 0);
            this.f88026a.q0(c5.c.b(0, this.f88027b == a2Var2 ? b.l(jI) : iE, 0, this.f88027b != a2Var2 ? b.k(jI) : iE, 5, null));
            l0 l0VarA = this.f88032g.a();
            int i25 = iK + i15 + i19;
            c3.l.Companion companion = c3.l.INSTANCE;
            i1 i1Var = this.f88026a;
            o oVar = this.f88037l;
            c3.l lVarD = companion.d();
            l<Object, i0> lVarG = lVarD != null ? lVarD.g() : null;
            c3.l lVarE = companion.e(lVarD);
            try {
                int iD0 = i1Var.d0(l0VarA, i1Var.A());
                int i26 = f0.i(oVar, i25, iE, iX4, i15, i19, i1Var.A(), i1Var.B(), i1Var.N());
                i0 i0Var = i0.f148189a;
                companion.l(lVarD, lVarE, lVarG);
                int i27 = iK;
                int i28 = i15;
                u0 u0VarL = r0.l(z0Var, this.f88033h.a().intValue(), l0VarA, i27, i28, i19, iX4, iD0, i26, jI, this.f88027b, this.f88034i, this.f88035j, this.f88029d, j16, iE, this.f88036k, x.a(l0VarA, this.f88026a.getPinnedPages(), this.f88026a.getBeyondBoundsInfo()), this.f88037l, this.f88026a.S(), this.f88038m, z0Var, new q() { // from class: i1.s0
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return Function0.a.c(z0Var, j15, i17, i16, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), (l) obj3);
                    }
                }, r.c());
                i1.r(this.f88026a, u0VarL, z0Var.J0(), false, 4, null);
                Function0.b(z0Var, this.f88026a.getCacheWindowLogic(), u0VarL.j());
                return u0VarL;
            } catch (Throwable th4) {
                companion.l(lVarD, lVarE, lVarG);
                throw th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(z0 z0Var, i iVar, List<? extends o> list) {
        Trace.beginSection("compose:pager:cache_window:keepAroundItems");
        try {
            if (iVar.n() && !list.isEmpty()) {
                int index = ((o) v.l0(list)).getIndex();
                int index2 = ((o) v.x0(list)).getIndex();
                for (int prefetchWindowStartLine = iVar.getPrefetchWindowStartLine(); prefetchWindowStartLine < index; prefetchWindowStartLine++) {
                    z0Var.u2(prefetchWindowStartLine);
                }
                int i15 = index2 + 1;
                int prefetchWindowEndLine = iVar.getPrefetchWindowEndLine();
                if (i15 <= prefetchWindowEndLine) {
                    while (true) {
                        z0Var.u2(i15);
                        if (i15 == prefetchWindowEndLine) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
            }
            i0 i0Var = i0.f148189a;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0132 A[PHI: r3
      0x0132: PHI (r3v20 int) = (r3v18 int), (r3v21 int) binds: [B:102:0x0130, B:98:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:104:0x0134  */
    /* JADX WARN: Code duplicated, block: B:107:0x0144  */
    /* JADX WARN: Code duplicated, block: B:109:0x014c  */
    /* JADX WARN: Code duplicated, block: B:112:0x016b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0090 A[PHI: r4
      0x0090: PHI (r4v23 f3.c$b) = (r4v21 f3.c$b), (r4v24 f3.c$b) binds: [B:44:0x008e, B:40:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x009e  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ac A[PHI: r9
      0x00ac: PHI (r9v13 f3.c$c) = (r9v10 f3.c$c), (r9v14 f3.c$c) binds: [B:54:0x00aa, B:50:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c8 A[PHI: r12
      0x00c8: PHI (r12v11 float) = (r12v9 float), (r12v12 float) binds: [B:64:0x00c6, B:60:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00df  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e4 A[PHI: r13
      0x00e4: PHI (r13v11 i1.p) = (r13v9 i1.p), (r13v12 i1.p) binds: [B:74:0x00e2, B:70:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fe A[PHI: r14
      0x00fe: PHI (r14v11 a1.o) = (r14v8 a1.o), (r14v12 a1.o) binds: [B:84:0x00fc, B:80:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0100  */
    /* JADX WARN: Code duplicated, block: B:89:0x010a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0110  */
    /* JADX WARN: Code duplicated, block: B:97:0x0122  */
    public static final y0 c(er.a<l0> aVar, i1 i1Var, d3 d3Var, boolean z15, a2 a2Var, int i15, float f15, p pVar, c.b bVar, c.InterfaceC1317c interfaceC1317c, o oVar, p0 p0Var, er.a<Integer> aVar2, p076m2.r rVar, int i16, int i17) {
        c.b bVar2;
        boolean z16;
        c.InterfaceC1317c interfaceC1317c2;
        boolean z17;
        float f16;
        boolean z18;
        p pVar2;
        boolean z19;
        o oVar2;
        boolean z25;
        int i18;
        boolean z26;
        boolean zW;
        Object objE;
        if (t.k()) {
            t.o(-1294131537, i16, i17, "androidx.compose.foundation.pager.rememberPagerMeasurePolicy (PagerMeasurePolicy.kt:61)");
        }
        boolean z27 = ((((i16 & 112) ^ 48) > 32 && rVar.W(i1Var)) || (i16 & 48) == 32) | ((((i16 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && rVar.W(d3Var)) || (i16 & MLKEMEngine.KyberPolyBytes) == 256) | ((((i16 & 7168) ^ 3072) > 2048 && rVar.a(z15)) || (i16 & 3072) == 2048) | ((((57344 & i16) ^ 24576) > 16384 && rVar.c(a2Var.ordinal())) || (i16 & 24576) == 16384);
        if (((234881024 & i16) ^ 100663296) > 67108864) {
            bVar2 = bVar;
            if (rVar.W(bVar2)) {
                z16 = true;
            }
            boolean z28 = z27 | z16;
            if (((1879048192 & i16) ^ 805306368) > 536870912) {
                interfaceC1317c2 = interfaceC1317c;
                if (!rVar.W(interfaceC1317c2)) {
                    z17 = true;
                }
                boolean z29 = z28 | z17;
                if (((3670016 & i16) ^ 1572864) > 1048576) {
                    f16 = f15;
                    if (!rVar.b(f16)) {
                        z18 = true;
                    }
                    boolean z35 = z29 | z18;
                    if (((29360128 & i16) ^ 12582912) > 8388608) {
                        pVar2 = pVar;
                        if (!rVar.W(pVar2)) {
                            z19 = true;
                        }
                        boolean z36 = z35 | z19;
                        if (((i17 & 14) ^ 6) > 4) {
                            oVar2 = oVar;
                            if (!rVar.W(oVar2)) {
                                z25 = true;
                            }
                            boolean z37 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z36 | z25;
                            if (((458752 & i16) ^ 196608) > 131072) {
                                i18 = i15;
                                if (!rVar.c(i18)) {
                                    z26 = true;
                                }
                                zW = z37 | z26 | rVar.W(p0Var);
                                objE = rVar.E();
                                if (zW || objE == p076m2.r.INSTANCE.a()) {
                                    a aVar3 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                                    rVar.v(aVar3);
                                    objE = aVar3;
                                }
                                y0 y0Var = (y0) objE;
                                if (t.k()) {
                                    t.n();
                                }
                                return y0Var;
                            }
                            i18 = i15;
                            if ((i16 & 196608) == 131072) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            zW = z37 | z26 | rVar.W(p0Var);
                            objE = rVar.E();
                            if (zW) {
                                a aVar4 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                                rVar.v(aVar4);
                                objE = aVar4;
                            } else {
                                a aVar5 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                                rVar.v(aVar5);
                                objE = aVar5;
                            }
                            y0 y0Var2 = (y0) objE;
                            if (t.k()) {
                                t.n();
                            }
                            return y0Var2;
                        }
                        oVar2 = oVar;
                        if ((i17 & 6) == 4) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        boolean z38 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z36 | z25;
                        if (((458752 & i16) ^ 196608) > 131072) {
                            i18 = i15;
                            if (!rVar.c(i18)) {
                                z26 = true;
                            }
                            zW = z38 | z26 | rVar.W(p0Var);
                            objE = rVar.E();
                            if (zW) {
                                a aVar6 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                                rVar.v(aVar6);
                                objE = aVar6;
                            } else {
                                a aVar7 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                                rVar.v(aVar7);
                                objE = aVar7;
                            }
                            y0 y0Var3 = (y0) objE;
                            if (t.k()) {
                                t.n();
                            }
                            return y0Var3;
                        }
                        i18 = i15;
                        if ((i16 & 196608) == 131072) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        zW = z38 | z26 | rVar.W(p0Var);
                        objE = rVar.E();
                        if (zW) {
                            a aVar8 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar8);
                            objE = aVar8;
                        } else {
                            a aVar9 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar9);
                            objE = aVar9;
                        }
                        y0 y0Var4 = (y0) objE;
                        if (t.k()) {
                            t.n();
                        }
                        return y0Var4;
                    }
                    pVar2 = pVar;
                    if ((12582912 & i16) == 8388608) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z39 = z35 | z19;
                    if (((i17 & 14) ^ 6) > 4) {
                        oVar2 = oVar;
                        if (!rVar.W(oVar2)) {
                            z25 = true;
                        }
                        boolean z310 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z39 | z25;
                        if (((458752 & i16) ^ 196608) > 131072) {
                            i18 = i15;
                            if (!rVar.c(i18)) {
                                z26 = true;
                            }
                            zW = z310 | z26 | rVar.W(p0Var);
                            objE = rVar.E();
                            if (zW) {
                                a aVar10 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                                rVar.v(aVar10);
                                objE = aVar10;
                            } else {
                                a aVar11 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                                rVar.v(aVar11);
                                objE = aVar11;
                            }
                            y0 y0Var5 = (y0) objE;
                            if (t.k()) {
                                t.n();
                            }
                            return y0Var5;
                        }
                        i18 = i15;
                        if ((i16 & 196608) == 131072) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        zW = z310 | z26 | rVar.W(p0Var);
                        objE = rVar.E();
                        if (zW) {
                            a aVar12 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar12);
                            objE = aVar12;
                        } else {
                            a aVar13 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar13);
                            objE = aVar13;
                        }
                        y0 y0Var6 = (y0) objE;
                        if (t.k()) {
                            t.n();
                        }
                        return y0Var6;
                    }
                    oVar2 = oVar;
                    if ((i17 & 6) == 4) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z311 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z39 | z25;
                    if (((458752 & i16) ^ 196608) > 131072) {
                        i18 = i15;
                        if (!rVar.c(i18)) {
                            z26 = true;
                        }
                        zW = z311 | z26 | rVar.W(p0Var);
                        objE = rVar.E();
                        if (zW) {
                            a aVar14 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar14);
                            objE = aVar14;
                        } else {
                            a aVar15 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar15);
                            objE = aVar15;
                        }
                        y0 y0Var7 = (y0) objE;
                        if (t.k()) {
                            t.n();
                        }
                        return y0Var7;
                    }
                    i18 = i15;
                    if ((i16 & 196608) == 131072) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zW = z311 | z26 | rVar.W(p0Var);
                    objE = rVar.E();
                    if (zW) {
                        a aVar16 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar16);
                        objE = aVar16;
                    } else {
                        a aVar17 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar17);
                        objE = aVar17;
                    }
                    y0 y0Var8 = (y0) objE;
                    if (t.k()) {
                        t.n();
                    }
                    return y0Var8;
                }
                f16 = f15;
                if ((1572864 & i16) == 1048576) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z312 = z29 | z18;
                if (((29360128 & i16) ^ 12582912) > 8388608) {
                    pVar2 = pVar;
                    if (!rVar.W(pVar2)) {
                        z19 = true;
                    }
                    boolean z313 = z312 | z19;
                    if (((i17 & 14) ^ 6) > 4) {
                        oVar2 = oVar;
                        if (!rVar.W(oVar2)) {
                            z25 = true;
                        }
                        boolean z314 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z313 | z25;
                        if (((458752 & i16) ^ 196608) > 131072) {
                            i18 = i15;
                            if (!rVar.c(i18)) {
                                z26 = true;
                            }
                            zW = z314 | z26 | rVar.W(p0Var);
                            objE = rVar.E();
                            if (zW) {
                                a aVar18 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                                rVar.v(aVar18);
                                objE = aVar18;
                            } else {
                                a aVar19 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                                rVar.v(aVar19);
                                objE = aVar19;
                            }
                            y0 y0Var9 = (y0) objE;
                            if (t.k()) {
                                t.n();
                            }
                            return y0Var9;
                        }
                        i18 = i15;
                        if ((i16 & 196608) == 131072) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        zW = z314 | z26 | rVar.W(p0Var);
                        objE = rVar.E();
                        if (zW) {
                            a aVar110 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar110);
                            objE = aVar110;
                        } else {
                            a aVar111 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar111);
                            objE = aVar111;
                        }
                        y0 y0Var10 = (y0) objE;
                        if (t.k()) {
                            t.n();
                        }
                        return y0Var10;
                    }
                    oVar2 = oVar;
                    if ((i17 & 6) == 4) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z315 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z313 | z25;
                    if (((458752 & i16) ^ 196608) > 131072) {
                        i18 = i15;
                        if (!rVar.c(i18)) {
                            z26 = true;
                        }
                        zW = z315 | z26 | rVar.W(p0Var);
                        objE = rVar.E();
                        if (zW) {
                            a aVar112 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar112);
                            objE = aVar112;
                        } else {
                            a aVar113 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar113);
                            objE = aVar113;
                        }
                        y0 y0Var11 = (y0) objE;
                        if (t.k()) {
                            t.n();
                        }
                        return y0Var11;
                    }
                    i18 = i15;
                    if ((i16 & 196608) == 131072) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zW = z315 | z26 | rVar.W(p0Var);
                    objE = rVar.E();
                    if (zW) {
                        a aVar114 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar114);
                        objE = aVar114;
                    } else {
                        a aVar115 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar115);
                        objE = aVar115;
                    }
                    y0 y0Var12 = (y0) objE;
                    if (t.k()) {
                        t.n();
                    }
                    return y0Var12;
                }
                pVar2 = pVar;
                if ((12582912 & i16) == 8388608) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z316 = z312 | z19;
                if (((i17 & 14) ^ 6) > 4) {
                    oVar2 = oVar;
                    if (!rVar.W(oVar2)) {
                        z25 = true;
                    }
                    boolean z317 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z316 | z25;
                    if (((458752 & i16) ^ 196608) > 131072) {
                        i18 = i15;
                        if (!rVar.c(i18)) {
                            z26 = true;
                        }
                        zW = z317 | z26 | rVar.W(p0Var);
                        objE = rVar.E();
                        if (zW) {
                            a aVar116 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar116);
                            objE = aVar116;
                        } else {
                            a aVar117 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar117);
                            objE = aVar117;
                        }
                        y0 y0Var13 = (y0) objE;
                        if (t.k()) {
                            t.n();
                        }
                        return y0Var13;
                    }
                    i18 = i15;
                    if ((i16 & 196608) == 131072) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zW = z317 | z26 | rVar.W(p0Var);
                    objE = rVar.E();
                    if (zW) {
                        a aVar118 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar118);
                        objE = aVar118;
                    } else {
                        a aVar119 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar119);
                        objE = aVar119;
                    }
                    y0 y0Var14 = (y0) objE;
                    if (t.k()) {
                        t.n();
                    }
                    return y0Var14;
                }
                oVar2 = oVar;
                if ((i17 & 6) == 4) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z318 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z316 | z25;
                if (((458752 & i16) ^ 196608) > 131072) {
                    i18 = i15;
                    if (!rVar.c(i18)) {
                        z26 = true;
                    }
                    zW = z318 | z26 | rVar.W(p0Var);
                    objE = rVar.E();
                    if (zW) {
                        a aVar1110 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar1110);
                        objE = aVar1110;
                    } else {
                        a aVar1111 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar1111);
                        objE = aVar1111;
                    }
                    y0 y0Var15 = (y0) objE;
                    if (t.k()) {
                        t.n();
                    }
                    return y0Var15;
                }
                i18 = i15;
                if ((i16 & 196608) == 131072) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                zW = z318 | z26 | rVar.W(p0Var);
                objE = rVar.E();
                if (zW) {
                    a aVar1112 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar1112);
                    objE = aVar1112;
                } else {
                    a aVar1113 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar1113);
                    objE = aVar1113;
                }
                y0 y0Var16 = (y0) objE;
                if (t.k()) {
                    t.n();
                }
                return y0Var16;
            }
            interfaceC1317c2 = interfaceC1317c;
            if ((805306368 & i16) == 536870912) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z210 = z28 | z17;
            if (((3670016 & i16) ^ 1572864) > 1048576) {
                f16 = f15;
                if (!rVar.b(f16)) {
                    z18 = true;
                }
                boolean z319 = z210 | z18;
                if (((29360128 & i16) ^ 12582912) > 8388608) {
                    pVar2 = pVar;
                    if (!rVar.W(pVar2)) {
                        z19 = true;
                    }
                    boolean z3110 = z319 | z19;
                    if (((i17 & 14) ^ 6) > 4) {
                        oVar2 = oVar;
                        if (!rVar.W(oVar2)) {
                            z25 = true;
                        }
                        boolean z3111 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z3110 | z25;
                        if (((458752 & i16) ^ 196608) > 131072) {
                            i18 = i15;
                            if (!rVar.c(i18)) {
                                z26 = true;
                            }
                            zW = z3111 | z26 | rVar.W(p0Var);
                            objE = rVar.E();
                            if (zW) {
                                a aVar1114 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                                rVar.v(aVar1114);
                                objE = aVar1114;
                            } else {
                                a aVar1115 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                                rVar.v(aVar1115);
                                objE = aVar1115;
                            }
                            y0 y0Var17 = (y0) objE;
                            if (t.k()) {
                                t.n();
                            }
                            return y0Var17;
                        }
                        i18 = i15;
                        if ((i16 & 196608) == 131072) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        zW = z3111 | z26 | rVar.W(p0Var);
                        objE = rVar.E();
                        if (zW) {
                            a aVar1116 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar1116);
                            objE = aVar1116;
                        } else {
                            a aVar1117 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar1117);
                            objE = aVar1117;
                        }
                        y0 y0Var18 = (y0) objE;
                        if (t.k()) {
                            t.n();
                        }
                        return y0Var18;
                    }
                    oVar2 = oVar;
                    if ((i17 & 6) == 4) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z3112 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z3110 | z25;
                    if (((458752 & i16) ^ 196608) > 131072) {
                        i18 = i15;
                        if (!rVar.c(i18)) {
                            z26 = true;
                        }
                        zW = z3112 | z26 | rVar.W(p0Var);
                        objE = rVar.E();
                        if (zW) {
                            a aVar1118 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar1118);
                            objE = aVar1118;
                        } else {
                            a aVar1119 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar1119);
                            objE = aVar1119;
                        }
                        y0 y0Var19 = (y0) objE;
                        if (t.k()) {
                            t.n();
                        }
                        return y0Var19;
                    }
                    i18 = i15;
                    if ((i16 & 196608) == 131072) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zW = z3112 | z26 | rVar.W(p0Var);
                    objE = rVar.E();
                    if (zW) {
                        a aVar11110 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar11110);
                        objE = aVar11110;
                    } else {
                        a aVar11111 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar11111);
                        objE = aVar11111;
                    }
                    y0 y0Var110 = (y0) objE;
                    if (t.k()) {
                        t.n();
                    }
                    return y0Var110;
                }
                pVar2 = pVar;
                if ((12582912 & i16) == 8388608) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z3113 = z319 | z19;
                if (((i17 & 14) ^ 6) > 4) {
                    oVar2 = oVar;
                    if (!rVar.W(oVar2)) {
                        z25 = true;
                    }
                    boolean z3114 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z3113 | z25;
                    if (((458752 & i16) ^ 196608) > 131072) {
                        i18 = i15;
                        if (!rVar.c(i18)) {
                            z26 = true;
                        }
                        zW = z3114 | z26 | rVar.W(p0Var);
                        objE = rVar.E();
                        if (zW) {
                            a aVar11112 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar11112);
                            objE = aVar11112;
                        } else {
                            a aVar11113 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar11113);
                            objE = aVar11113;
                        }
                        y0 y0Var111 = (y0) objE;
                        if (t.k()) {
                            t.n();
                        }
                        return y0Var111;
                    }
                    i18 = i15;
                    if ((i16 & 196608) == 131072) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zW = z3114 | z26 | rVar.W(p0Var);
                    objE = rVar.E();
                    if (zW) {
                        a aVar11114 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar11114);
                        objE = aVar11114;
                    } else {
                        a aVar11115 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar11115);
                        objE = aVar11115;
                    }
                    y0 y0Var112 = (y0) objE;
                    if (t.k()) {
                        t.n();
                    }
                    return y0Var112;
                }
                oVar2 = oVar;
                if ((i17 & 6) == 4) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z3115 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z3113 | z25;
                if (((458752 & i16) ^ 196608) > 131072) {
                    i18 = i15;
                    if (!rVar.c(i18)) {
                        z26 = true;
                    }
                    zW = z3115 | z26 | rVar.W(p0Var);
                    objE = rVar.E();
                    if (zW) {
                        a aVar11116 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar11116);
                        objE = aVar11116;
                    } else {
                        a aVar11117 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar11117);
                        objE = aVar11117;
                    }
                    y0 y0Var113 = (y0) objE;
                    if (t.k()) {
                        t.n();
                    }
                    return y0Var113;
                }
                i18 = i15;
                if ((i16 & 196608) == 131072) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                zW = z3115 | z26 | rVar.W(p0Var);
                objE = rVar.E();
                if (zW) {
                    a aVar11118 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar11118);
                    objE = aVar11118;
                } else {
                    a aVar11119 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar11119);
                    objE = aVar11119;
                }
                y0 y0Var114 = (y0) objE;
                if (t.k()) {
                    t.n();
                }
                return y0Var114;
            }
            f16 = f15;
            if ((1572864 & i16) == 1048576) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z3116 = z210 | z18;
            if (((29360128 & i16) ^ 12582912) > 8388608) {
                pVar2 = pVar;
                if (!rVar.W(pVar2)) {
                    z19 = true;
                }
                boolean z3117 = z3116 | z19;
                if (((i17 & 14) ^ 6) > 4) {
                    oVar2 = oVar;
                    if (!rVar.W(oVar2)) {
                        z25 = true;
                    }
                    boolean z3118 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z3117 | z25;
                    if (((458752 & i16) ^ 196608) > 131072) {
                        i18 = i15;
                        if (!rVar.c(i18)) {
                            z26 = true;
                        }
                        zW = z3118 | z26 | rVar.W(p0Var);
                        objE = rVar.E();
                        if (zW) {
                            a aVar111110 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar111110);
                            objE = aVar111110;
                        } else {
                            a aVar111111 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar111111);
                            objE = aVar111111;
                        }
                        y0 y0Var115 = (y0) objE;
                        if (t.k()) {
                            t.n();
                        }
                        return y0Var115;
                    }
                    i18 = i15;
                    if ((i16 & 196608) == 131072) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zW = z3118 | z26 | rVar.W(p0Var);
                    objE = rVar.E();
                    if (zW) {
                        a aVar111112 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar111112);
                        objE = aVar111112;
                    } else {
                        a aVar111113 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar111113);
                        objE = aVar111113;
                    }
                    y0 y0Var116 = (y0) objE;
                    if (t.k()) {
                        t.n();
                    }
                    return y0Var116;
                }
                oVar2 = oVar;
                if ((i17 & 6) == 4) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z3119 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z3117 | z25;
                if (((458752 & i16) ^ 196608) > 131072) {
                    i18 = i15;
                    if (!rVar.c(i18)) {
                        z26 = true;
                    }
                    zW = z3119 | z26 | rVar.W(p0Var);
                    objE = rVar.E();
                    if (zW) {
                        a aVar111114 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar111114);
                        objE = aVar111114;
                    } else {
                        a aVar111115 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar111115);
                        objE = aVar111115;
                    }
                    y0 y0Var117 = (y0) objE;
                    if (t.k()) {
                        t.n();
                    }
                    return y0Var117;
                }
                i18 = i15;
                if ((i16 & 196608) == 131072) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                zW = z3119 | z26 | rVar.W(p0Var);
                objE = rVar.E();
                if (zW) {
                    a aVar111116 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar111116);
                    objE = aVar111116;
                } else {
                    a aVar111117 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar111117);
                    objE = aVar111117;
                }
                y0 y0Var118 = (y0) objE;
                if (t.k()) {
                    t.n();
                }
                return y0Var118;
            }
            pVar2 = pVar;
            if ((12582912 & i16) == 8388608) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean z31110 = z3116 | z19;
            if (((i17 & 14) ^ 6) > 4) {
                oVar2 = oVar;
                if (!rVar.W(oVar2)) {
                    z25 = true;
                }
                boolean z31111 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z31110 | z25;
                if (((458752 & i16) ^ 196608) > 131072) {
                    i18 = i15;
                    if (!rVar.c(i18)) {
                        z26 = true;
                    }
                    zW = z31111 | z26 | rVar.W(p0Var);
                    objE = rVar.E();
                    if (zW) {
                        a aVar111118 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar111118);
                        objE = aVar111118;
                    } else {
                        a aVar111119 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar111119);
                        objE = aVar111119;
                    }
                    y0 y0Var119 = (y0) objE;
                    if (t.k()) {
                        t.n();
                    }
                    return y0Var119;
                }
                i18 = i15;
                if ((i16 & 196608) == 131072) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                zW = z31111 | z26 | rVar.W(p0Var);
                objE = rVar.E();
                if (zW) {
                    a aVar1111110 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar1111110);
                    objE = aVar1111110;
                } else {
                    a aVar1111111 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar1111111);
                    objE = aVar1111111;
                }
                y0 y0Var1110 = (y0) objE;
                if (t.k()) {
                    t.n();
                }
                return y0Var1110;
            }
            oVar2 = oVar;
            if ((i17 & 6) == 4) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z31112 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z31110 | z25;
            if (((458752 & i16) ^ 196608) > 131072) {
                i18 = i15;
                if (!rVar.c(i18)) {
                    z26 = true;
                }
                zW = z31112 | z26 | rVar.W(p0Var);
                objE = rVar.E();
                if (zW) {
                    a aVar1111112 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar1111112);
                    objE = aVar1111112;
                } else {
                    a aVar1111113 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar1111113);
                    objE = aVar1111113;
                }
                y0 y0Var1111 = (y0) objE;
                if (t.k()) {
                    t.n();
                }
                return y0Var1111;
            }
            i18 = i15;
            if ((i16 & 196608) == 131072) {
                z26 = true;
            } else {
                z26 = false;
            }
            zW = z31112 | z26 | rVar.W(p0Var);
            objE = rVar.E();
            if (zW) {
                a aVar1111114 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                rVar.v(aVar1111114);
                objE = aVar1111114;
            } else {
                a aVar1111115 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                rVar.v(aVar1111115);
                objE = aVar1111115;
            }
            y0 y0Var1112 = (y0) objE;
            if (t.k()) {
                t.n();
            }
            return y0Var1112;
        }
        bVar2 = bVar;
        if ((100663296 & i16) == 67108864) {
            z16 = true;
        } else {
            z16 = false;
        }
        boolean z211 = z27 | z16;
        if (((1879048192 & i16) ^ 805306368) > 536870912) {
            interfaceC1317c2 = interfaceC1317c;
            if (!rVar.W(interfaceC1317c2)) {
                z17 = true;
            }
            boolean z212 = z211 | z17;
            if (((3670016 & i16) ^ 1572864) > 1048576) {
                f16 = f15;
                if (!rVar.b(f16)) {
                    z18 = true;
                }
                boolean z31113 = z212 | z18;
                if (((29360128 & i16) ^ 12582912) > 8388608) {
                    pVar2 = pVar;
                    if (!rVar.W(pVar2)) {
                        z19 = true;
                    }
                    boolean z31114 = z31113 | z19;
                    if (((i17 & 14) ^ 6) > 4) {
                        oVar2 = oVar;
                        if (!rVar.W(oVar2)) {
                            z25 = true;
                        }
                        boolean z31115 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z31114 | z25;
                        if (((458752 & i16) ^ 196608) > 131072) {
                            i18 = i15;
                            if (!rVar.c(i18)) {
                                z26 = true;
                            }
                            zW = z31115 | z26 | rVar.W(p0Var);
                            objE = rVar.E();
                            if (zW) {
                                a aVar1111116 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                                rVar.v(aVar1111116);
                                objE = aVar1111116;
                            } else {
                                a aVar1111117 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                                rVar.v(aVar1111117);
                                objE = aVar1111117;
                            }
                            y0 y0Var1113 = (y0) objE;
                            if (t.k()) {
                                t.n();
                            }
                            return y0Var1113;
                        }
                        i18 = i15;
                        if ((i16 & 196608) == 131072) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        zW = z31115 | z26 | rVar.W(p0Var);
                        objE = rVar.E();
                        if (zW) {
                            a aVar1111118 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar1111118);
                            objE = aVar1111118;
                        } else {
                            a aVar1111119 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar1111119);
                            objE = aVar1111119;
                        }
                        y0 y0Var1114 = (y0) objE;
                        if (t.k()) {
                            t.n();
                        }
                        return y0Var1114;
                    }
                    oVar2 = oVar;
                    if ((i17 & 6) == 4) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z31116 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z31114 | z25;
                    if (((458752 & i16) ^ 196608) > 131072) {
                        i18 = i15;
                        if (!rVar.c(i18)) {
                            z26 = true;
                        }
                        zW = z31116 | z26 | rVar.W(p0Var);
                        objE = rVar.E();
                        if (zW) {
                            a aVar11111110 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar11111110);
                            objE = aVar11111110;
                        } else {
                            a aVar11111111 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar11111111);
                            objE = aVar11111111;
                        }
                        y0 y0Var1115 = (y0) objE;
                        if (t.k()) {
                            t.n();
                        }
                        return y0Var1115;
                    }
                    i18 = i15;
                    if ((i16 & 196608) == 131072) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zW = z31116 | z26 | rVar.W(p0Var);
                    objE = rVar.E();
                    if (zW) {
                        a aVar11111112 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar11111112);
                        objE = aVar11111112;
                    } else {
                        a aVar11111113 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar11111113);
                        objE = aVar11111113;
                    }
                    y0 y0Var1116 = (y0) objE;
                    if (t.k()) {
                        t.n();
                    }
                    return y0Var1116;
                }
                pVar2 = pVar;
                if ((12582912 & i16) == 8388608) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z31117 = z31113 | z19;
                if (((i17 & 14) ^ 6) > 4) {
                    oVar2 = oVar;
                    if (!rVar.W(oVar2)) {
                        z25 = true;
                    }
                    boolean z31118 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z31117 | z25;
                    if (((458752 & i16) ^ 196608) > 131072) {
                        i18 = i15;
                        if (!rVar.c(i18)) {
                            z26 = true;
                        }
                        zW = z31118 | z26 | rVar.W(p0Var);
                        objE = rVar.E();
                        if (zW) {
                            a aVar11111114 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar11111114);
                            objE = aVar11111114;
                        } else {
                            a aVar11111115 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar11111115);
                            objE = aVar11111115;
                        }
                        y0 y0Var1117 = (y0) objE;
                        if (t.k()) {
                            t.n();
                        }
                        return y0Var1117;
                    }
                    i18 = i15;
                    if ((i16 & 196608) == 131072) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zW = z31118 | z26 | rVar.W(p0Var);
                    objE = rVar.E();
                    if (zW) {
                        a aVar11111116 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar11111116);
                        objE = aVar11111116;
                    } else {
                        a aVar11111117 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar11111117);
                        objE = aVar11111117;
                    }
                    y0 y0Var1118 = (y0) objE;
                    if (t.k()) {
                        t.n();
                    }
                    return y0Var1118;
                }
                oVar2 = oVar;
                if ((i17 & 6) == 4) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z31119 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z31117 | z25;
                if (((458752 & i16) ^ 196608) > 131072) {
                    i18 = i15;
                    if (!rVar.c(i18)) {
                        z26 = true;
                    }
                    zW = z31119 | z26 | rVar.W(p0Var);
                    objE = rVar.E();
                    if (zW) {
                        a aVar11111118 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar11111118);
                        objE = aVar11111118;
                    } else {
                        a aVar11111119 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar11111119);
                        objE = aVar11111119;
                    }
                    y0 y0Var1119 = (y0) objE;
                    if (t.k()) {
                        t.n();
                    }
                    return y0Var1119;
                }
                i18 = i15;
                if ((i16 & 196608) == 131072) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                zW = z31119 | z26 | rVar.W(p0Var);
                objE = rVar.E();
                if (zW) {
                    a aVar111111110 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar111111110);
                    objE = aVar111111110;
                } else {
                    a aVar111111111 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar111111111);
                    objE = aVar111111111;
                }
                y0 y0Var11110 = (y0) objE;
                if (t.k()) {
                    t.n();
                }
                return y0Var11110;
            }
            f16 = f15;
            if ((1572864 & i16) == 1048576) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z311110 = z212 | z18;
            if (((29360128 & i16) ^ 12582912) > 8388608) {
                pVar2 = pVar;
                if (!rVar.W(pVar2)) {
                    z19 = true;
                }
                boolean z311111 = z311110 | z19;
                if (((i17 & 14) ^ 6) > 4) {
                    oVar2 = oVar;
                    if (!rVar.W(oVar2)) {
                        z25 = true;
                    }
                    boolean z311112 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z311111 | z25;
                    if (((458752 & i16) ^ 196608) > 131072) {
                        i18 = i15;
                        if (!rVar.c(i18)) {
                            z26 = true;
                        }
                        zW = z311112 | z26 | rVar.W(p0Var);
                        objE = rVar.E();
                        if (zW) {
                            a aVar111111112 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar111111112);
                            objE = aVar111111112;
                        } else {
                            a aVar111111113 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar111111113);
                            objE = aVar111111113;
                        }
                        y0 y0Var11111 = (y0) objE;
                        if (t.k()) {
                            t.n();
                        }
                        return y0Var11111;
                    }
                    i18 = i15;
                    if ((i16 & 196608) == 131072) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zW = z311112 | z26 | rVar.W(p0Var);
                    objE = rVar.E();
                    if (zW) {
                        a aVar111111114 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar111111114);
                        objE = aVar111111114;
                    } else {
                        a aVar111111115 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar111111115);
                        objE = aVar111111115;
                    }
                    y0 y0Var11112 = (y0) objE;
                    if (t.k()) {
                        t.n();
                    }
                    return y0Var11112;
                }
                oVar2 = oVar;
                if ((i17 & 6) == 4) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z311113 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z311111 | z25;
                if (((458752 & i16) ^ 196608) > 131072) {
                    i18 = i15;
                    if (!rVar.c(i18)) {
                        z26 = true;
                    }
                    zW = z311113 | z26 | rVar.W(p0Var);
                    objE = rVar.E();
                    if (zW) {
                        a aVar111111116 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar111111116);
                        objE = aVar111111116;
                    } else {
                        a aVar111111117 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar111111117);
                        objE = aVar111111117;
                    }
                    y0 y0Var11113 = (y0) objE;
                    if (t.k()) {
                        t.n();
                    }
                    return y0Var11113;
                }
                i18 = i15;
                if ((i16 & 196608) == 131072) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                zW = z311113 | z26 | rVar.W(p0Var);
                objE = rVar.E();
                if (zW) {
                    a aVar111111118 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar111111118);
                    objE = aVar111111118;
                } else {
                    a aVar111111119 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar111111119);
                    objE = aVar111111119;
                }
                y0 y0Var11114 = (y0) objE;
                if (t.k()) {
                    t.n();
                }
                return y0Var11114;
            }
            pVar2 = pVar;
            if ((12582912 & i16) == 8388608) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean z311114 = z311110 | z19;
            if (((i17 & 14) ^ 6) > 4) {
                oVar2 = oVar;
                if (!rVar.W(oVar2)) {
                    z25 = true;
                }
                boolean z311115 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z311114 | z25;
                if (((458752 & i16) ^ 196608) > 131072) {
                    i18 = i15;
                    if (!rVar.c(i18)) {
                        z26 = true;
                    }
                    zW = z311115 | z26 | rVar.W(p0Var);
                    objE = rVar.E();
                    if (zW) {
                        a aVar1111111110 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar1111111110);
                        objE = aVar1111111110;
                    } else {
                        a aVar1111111111 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar1111111111);
                        objE = aVar1111111111;
                    }
                    y0 y0Var11115 = (y0) objE;
                    if (t.k()) {
                        t.n();
                    }
                    return y0Var11115;
                }
                i18 = i15;
                if ((i16 & 196608) == 131072) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                zW = z311115 | z26 | rVar.W(p0Var);
                objE = rVar.E();
                if (zW) {
                    a aVar1111111112 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar1111111112);
                    objE = aVar1111111112;
                } else {
                    a aVar1111111113 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar1111111113);
                    objE = aVar1111111113;
                }
                y0 y0Var11116 = (y0) objE;
                if (t.k()) {
                    t.n();
                }
                return y0Var11116;
            }
            oVar2 = oVar;
            if ((i17 & 6) == 4) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z311116 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z311114 | z25;
            if (((458752 & i16) ^ 196608) > 131072) {
                i18 = i15;
                if (!rVar.c(i18)) {
                    z26 = true;
                }
                zW = z311116 | z26 | rVar.W(p0Var);
                objE = rVar.E();
                if (zW) {
                    a aVar1111111114 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar1111111114);
                    objE = aVar1111111114;
                } else {
                    a aVar1111111115 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar1111111115);
                    objE = aVar1111111115;
                }
                y0 y0Var11117 = (y0) objE;
                if (t.k()) {
                    t.n();
                }
                return y0Var11117;
            }
            i18 = i15;
            if ((i16 & 196608) == 131072) {
                z26 = true;
            } else {
                z26 = false;
            }
            zW = z311116 | z26 | rVar.W(p0Var);
            objE = rVar.E();
            if (zW) {
                a aVar1111111116 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                rVar.v(aVar1111111116);
                objE = aVar1111111116;
            } else {
                a aVar1111111117 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                rVar.v(aVar1111111117);
                objE = aVar1111111117;
            }
            y0 y0Var11118 = (y0) objE;
            if (t.k()) {
                t.n();
            }
            return y0Var11118;
        }
        interfaceC1317c2 = interfaceC1317c;
        if ((805306368 & i16) == 536870912) {
            z17 = true;
        } else {
            z17 = false;
        }
        boolean z213 = z211 | z17;
        if (((3670016 & i16) ^ 1572864) > 1048576) {
            f16 = f15;
            if (!rVar.b(f16)) {
                z18 = true;
            }
            boolean z311117 = z213 | z18;
            if (((29360128 & i16) ^ 12582912) > 8388608) {
                pVar2 = pVar;
                if (!rVar.W(pVar2)) {
                    z19 = true;
                }
                boolean z311118 = z311117 | z19;
                if (((i17 & 14) ^ 6) > 4) {
                    oVar2 = oVar;
                    if (!rVar.W(oVar2)) {
                        z25 = true;
                    }
                    boolean z311119 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z311118 | z25;
                    if (((458752 & i16) ^ 196608) > 131072) {
                        i18 = i15;
                        if (!rVar.c(i18)) {
                            z26 = true;
                        }
                        zW = z311119 | z26 | rVar.W(p0Var);
                        objE = rVar.E();
                        if (zW) {
                            a aVar1111111118 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar1111111118);
                            objE = aVar1111111118;
                        } else {
                            a aVar1111111119 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                            rVar.v(aVar1111111119);
                            objE = aVar1111111119;
                        }
                        y0 y0Var11119 = (y0) objE;
                        if (t.k()) {
                            t.n();
                        }
                        return y0Var11119;
                    }
                    i18 = i15;
                    if ((i16 & 196608) == 131072) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zW = z311119 | z26 | rVar.W(p0Var);
                    objE = rVar.E();
                    if (zW) {
                        a aVar11111111110 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar11111111110);
                        objE = aVar11111111110;
                    } else {
                        a aVar11111111111 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar11111111111);
                        objE = aVar11111111111;
                    }
                    y0 y0Var111110 = (y0) objE;
                    if (t.k()) {
                        t.n();
                    }
                    return y0Var111110;
                }
                oVar2 = oVar;
                if ((i17 & 6) == 4) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z3111110 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z311118 | z25;
                if (((458752 & i16) ^ 196608) > 131072) {
                    i18 = i15;
                    if (!rVar.c(i18)) {
                        z26 = true;
                    }
                    zW = z3111110 | z26 | rVar.W(p0Var);
                    objE = rVar.E();
                    if (zW) {
                        a aVar11111111112 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar11111111112);
                        objE = aVar11111111112;
                    } else {
                        a aVar11111111113 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar11111111113);
                        objE = aVar11111111113;
                    }
                    y0 y0Var111111 = (y0) objE;
                    if (t.k()) {
                        t.n();
                    }
                    return y0Var111111;
                }
                i18 = i15;
                if ((i16 & 196608) == 131072) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                zW = z3111110 | z26 | rVar.W(p0Var);
                objE = rVar.E();
                if (zW) {
                    a aVar11111111114 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar11111111114);
                    objE = aVar11111111114;
                } else {
                    a aVar11111111115 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar11111111115);
                    objE = aVar11111111115;
                }
                y0 y0Var111112 = (y0) objE;
                if (t.k()) {
                    t.n();
                }
                return y0Var111112;
            }
            pVar2 = pVar;
            if ((12582912 & i16) == 8388608) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean z3111111 = z311117 | z19;
            if (((i17 & 14) ^ 6) > 4) {
                oVar2 = oVar;
                if (!rVar.W(oVar2)) {
                    z25 = true;
                }
                boolean z3111112 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z3111111 | z25;
                if (((458752 & i16) ^ 196608) > 131072) {
                    i18 = i15;
                    if (!rVar.c(i18)) {
                        z26 = true;
                    }
                    zW = z3111112 | z26 | rVar.W(p0Var);
                    objE = rVar.E();
                    if (zW) {
                        a aVar11111111116 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar11111111116);
                        objE = aVar11111111116;
                    } else {
                        a aVar11111111117 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar11111111117);
                        objE = aVar11111111117;
                    }
                    y0 y0Var111113 = (y0) objE;
                    if (t.k()) {
                        t.n();
                    }
                    return y0Var111113;
                }
                i18 = i15;
                if ((i16 & 196608) == 131072) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                zW = z3111112 | z26 | rVar.W(p0Var);
                objE = rVar.E();
                if (zW) {
                    a aVar11111111118 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar11111111118);
                    objE = aVar11111111118;
                } else {
                    a aVar11111111119 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar11111111119);
                    objE = aVar11111111119;
                }
                y0 y0Var111114 = (y0) objE;
                if (t.k()) {
                    t.n();
                }
                return y0Var111114;
            }
            oVar2 = oVar;
            if ((i17 & 6) == 4) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z3111113 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z3111111 | z25;
            if (((458752 & i16) ^ 196608) > 131072) {
                i18 = i15;
                if (!rVar.c(i18)) {
                    z26 = true;
                }
                zW = z3111113 | z26 | rVar.W(p0Var);
                objE = rVar.E();
                if (zW) {
                    a aVar111111111110 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar111111111110);
                    objE = aVar111111111110;
                } else {
                    a aVar111111111111 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar111111111111);
                    objE = aVar111111111111;
                }
                y0 y0Var111115 = (y0) objE;
                if (t.k()) {
                    t.n();
                }
                return y0Var111115;
            }
            i18 = i15;
            if ((i16 & 196608) == 131072) {
                z26 = true;
            } else {
                z26 = false;
            }
            zW = z3111113 | z26 | rVar.W(p0Var);
            objE = rVar.E();
            if (zW) {
                a aVar111111111112 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                rVar.v(aVar111111111112);
                objE = aVar111111111112;
            } else {
                a aVar111111111113 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                rVar.v(aVar111111111113);
                objE = aVar111111111113;
            }
            y0 y0Var111116 = (y0) objE;
            if (t.k()) {
                t.n();
            }
            return y0Var111116;
        }
        f16 = f15;
        if ((1572864 & i16) == 1048576) {
            z18 = true;
        } else {
            z18 = false;
        }
        boolean z3111114 = z213 | z18;
        if (((29360128 & i16) ^ 12582912) > 8388608) {
            pVar2 = pVar;
            if (!rVar.W(pVar2)) {
                z19 = true;
            }
            boolean z3111115 = z3111114 | z19;
            if (((i17 & 14) ^ 6) > 4) {
                oVar2 = oVar;
                if (!rVar.W(oVar2)) {
                    z25 = true;
                }
                boolean z3111116 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z3111115 | z25;
                if (((458752 & i16) ^ 196608) > 131072) {
                    i18 = i15;
                    if (!rVar.c(i18)) {
                        z26 = true;
                    }
                    zW = z3111116 | z26 | rVar.W(p0Var);
                    objE = rVar.E();
                    if (zW) {
                        a aVar111111111114 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar111111111114);
                        objE = aVar111111111114;
                    } else {
                        a aVar111111111115 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                        rVar.v(aVar111111111115);
                        objE = aVar111111111115;
                    }
                    y0 y0Var111117 = (y0) objE;
                    if (t.k()) {
                        t.n();
                    }
                    return y0Var111117;
                }
                i18 = i15;
                if ((i16 & 196608) == 131072) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                zW = z3111116 | z26 | rVar.W(p0Var);
                objE = rVar.E();
                if (zW) {
                    a aVar111111111116 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar111111111116);
                    objE = aVar111111111116;
                } else {
                    a aVar111111111117 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar111111111117);
                    objE = aVar111111111117;
                }
                y0 y0Var111118 = (y0) objE;
                if (t.k()) {
                    t.n();
                }
                return y0Var111118;
            }
            oVar2 = oVar;
            if ((i17 & 6) == 4) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z3111117 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z3111115 | z25;
            if (((458752 & i16) ^ 196608) > 131072) {
                i18 = i15;
                if (!rVar.c(i18)) {
                    z26 = true;
                }
                zW = z3111117 | z26 | rVar.W(p0Var);
                objE = rVar.E();
                if (zW) {
                    a aVar111111111118 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar111111111118);
                    objE = aVar111111111118;
                } else {
                    a aVar111111111119 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar111111111119);
                    objE = aVar111111111119;
                }
                y0 y0Var111119 = (y0) objE;
                if (t.k()) {
                    t.n();
                }
                return y0Var111119;
            }
            i18 = i15;
            if ((i16 & 196608) == 131072) {
                z26 = true;
            } else {
                z26 = false;
            }
            zW = z3111117 | z26 | rVar.W(p0Var);
            objE = rVar.E();
            if (zW) {
                a aVar1111111111110 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                rVar.v(aVar1111111111110);
                objE = aVar1111111111110;
            } else {
                a aVar1111111111111 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                rVar.v(aVar1111111111111);
                objE = aVar1111111111111;
            }
            y0 y0Var1111110 = (y0) objE;
            if (t.k()) {
                t.n();
            }
            return y0Var1111110;
        }
        pVar2 = pVar;
        if ((12582912 & i16) == 8388608) {
            z19 = true;
        } else {
            z19 = false;
        }
        boolean z3111118 = z3111114 | z19;
        if (((i17 & 14) ^ 6) > 4) {
            oVar2 = oVar;
            if (!rVar.W(oVar2)) {
                z25 = true;
            }
            boolean z3111119 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z3111118 | z25;
            if (((458752 & i16) ^ 196608) > 131072) {
                i18 = i15;
                if (!rVar.c(i18)) {
                    z26 = true;
                }
                zW = z3111119 | z26 | rVar.W(p0Var);
                objE = rVar.E();
                if (zW) {
                    a aVar1111111111112 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar1111111111112);
                    objE = aVar1111111111112;
                } else {
                    a aVar1111111111113 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                    rVar.v(aVar1111111111113);
                    objE = aVar1111111111113;
                }
                y0 y0Var1111111 = (y0) objE;
                if (t.k()) {
                    t.n();
                }
                return y0Var1111111;
            }
            i18 = i15;
            if ((i16 & 196608) == 131072) {
                z26 = true;
            } else {
                z26 = false;
            }
            zW = z3111119 | z26 | rVar.W(p0Var);
            objE = rVar.E();
            if (zW) {
                a aVar1111111111114 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                rVar.v(aVar1111111111114);
                objE = aVar1111111111114;
            } else {
                a aVar1111111111115 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                rVar.v(aVar1111111111115);
                objE = aVar1111111111115;
            }
            y0 y0Var1111112 = (y0) objE;
            if (t.k()) {
                t.n();
            }
            return y0Var1111112;
        }
        oVar2 = oVar;
        if ((i17 & 6) == 4) {
            z25 = true;
        } else {
            z25 = false;
        }
        boolean z31111110 = ((((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 && rVar.W(aVar2)) || (i17 & MLKEMEngine.KyberPolyBytes) == 256) | z3111118 | z25;
        if (((458752 & i16) ^ 196608) > 131072) {
            i18 = i15;
            if (!rVar.c(i18)) {
                z26 = true;
            }
            zW = z31111110 | z26 | rVar.W(p0Var);
            objE = rVar.E();
            if (zW) {
                a aVar1111111111116 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                rVar.v(aVar1111111111116);
                objE = aVar1111111111116;
            } else {
                a aVar1111111111117 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
                rVar.v(aVar1111111111117);
                objE = aVar1111111111117;
            }
            y0 y0Var1111113 = (y0) objE;
            if (t.k()) {
                t.n();
            }
            return y0Var1111113;
        }
        i18 = i15;
        if ((i16 & 196608) == 131072) {
            z26 = true;
        } else {
            z26 = false;
        }
        zW = z31111110 | z26 | rVar.W(p0Var);
        objE = rVar.E();
        if (zW) {
            a aVar1111111111118 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
            rVar.v(aVar1111111111118);
            objE = aVar1111111111118;
        } else {
            a aVar1111111111119 = new a(i1Var, a2Var, d3Var, z15, f16, pVar2, aVar, aVar2, interfaceC1317c2, bVar2, i18, oVar2, p0Var);
            rVar.v(aVar1111111111119);
            objE = aVar1111111111119;
        }
        y0 y0Var1111114 = (y0) objE;
        if (t.k()) {
            t.n();
        }
        return y0Var1111114;
    }
}
