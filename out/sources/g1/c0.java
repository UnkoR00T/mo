package g1;

import android.os.Trace;
import d1.a3;
import d1.d3;
import java.util.ArrayList;
import java.util.List;
import n3.x1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.a2;
import p056h1.e3;
import p056h1.s2;
import p056h1.t1;
import p056h1.u1;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.g4;
import p143z0.k2;
import w0.g2;
import w0.h3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0085\u0001\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001as\u0010$\u001a\u00020#2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0003¢\u0006\u0004\b$\u0010%\u001a1\u0010.\u001a\u00020\u0016*\u00020&2\u0006\u0010(\u001a\u00020'2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/¨\u00060"}, d2 = {"Lf3/m;", "modifier", "Lg1/e1;", "state", "Lg1/w0;", "slots", "Ld1/d3;", "contentPadding", "", "reverseLayout", "isVertical", "Lz0/e1;", "flingBehavior", "userScrollEnabled", "Lw0/g2;", "overscrollEffect", "Ld1/i$n;", "verticalArrangement", "Ld1/i$e;", "horizontalArrangement", "Lkotlin/Function1;", "Lg1/t0;", "Loq/i0;", "content", "b", "(Lf3/m;Lg1/e1;Lg1/w0;Ld1/d3;ZZLz0/e1;ZLw0/g2;Ld1/i$n;Ld1/i$e;Ler/l;Lm2/r;III)V", "Lkotlin/Function0;", "Lg1/o;", "itemProviderLambda", "Lju/p0;", "coroutineScope", "Ln3/x1;", "graphicsContext", "Lh1/e3;", "stickyItemsScrollBehavior", "Lh1/y0;", "f", "(Ler/a;Lg1/e1;Lg1/w0;Ld1/d3;ZZLd1/i$e;Ld1/i$n;Lju/p0;Ln3/x1;Lh1/e3;Lm2/r;II)Lh1/y0;", "Lh1/i;", "Lz0/a2;", "orientation", "", "Lg1/l0;", "visibleItemsList", "Lg1/o0;", "measuredLineProvider", "e", "(Lh1/i;Lz0/a2;Ljava/util/List;Lg1/o0;)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p056h1.y0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e1 f69249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f69250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d3 f69251c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f69252d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ er.a<o> f69253e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ w0 f69254f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ d1.i.n f69255g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ d1.i.e f69256h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ ju.p0 f69257i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ x1 f69258j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ e3 f69259k;

        /* JADX INFO: renamed from: g1.c0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J_\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"g1/c0$a$a", "Lg1/m0;", "", "index", "", "key", CMSAttributeTableGenerator.CONTENT_TYPE, "crossAxisSize", "mainAxisSpacing", "", "Le4/a2;", "placeables", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "lane", "span", "Lg1/l0;", "c", "(ILjava/lang/Object;Ljava/lang/Object;IILjava/util/List;JII)Lg1/l0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C1555a extends m0 {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ p056h1.z0 f69260e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ e1 f69261f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f69262g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f69263h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f69264i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f69265j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ long f69266k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1555a(o oVar, p056h1.z0 z0Var, int i15, e1 e1Var, boolean z15, boolean z16, int i16, int i17, long j15) {
                super(oVar, z0Var, i15);
                this.f69260e = z0Var;
                this.f69261f = e1Var;
                this.f69262g = z15;
                this.f69263h = z16;
                this.f69264i = i16;
                this.f69265j = i17;
                this.f69266k = j15;
            }

            @Override // g1.m0
            public l0 c(int index, Object key, Object contentType, int crossAxisSize, int mainAxisSpacing, List<? extends a2> placeables, long constraints, int lane, int span) {
                return new l0(index, key, this.f69262g, crossAxisSize, mainAxisSpacing, this.f69263h, this.f69260e.getLayoutDirection(), this.f69264i, this.f69265j, placeables, this.f69266k, contentType, this.f69261f.z(), constraints, lane, span, null);
            }
        }

        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J;\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"g1/c0$a$b", "Lg1/o0;", "", "index", "", "Lg1/l0;", "items", "", "Lg1/c;", "spans", "mainAxisSpacing", "Lg1/n0;", "b", "(I[Lg1/l0;Ljava/util/List;I)Lg1/n0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends o0 {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f69267g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ v0 f69268h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(boolean z15, v0 v0Var, int i15, int i16, C1555a c1555a, z0 z0Var) {
                super(z15, v0Var, i15, i16, c1555a, z0Var);
                this.f69267g = z15;
                this.f69268h = v0Var;
            }

            @Override // g1.o0
            public n0 b(int index, l0[] items, List<c> spans, int mainAxisSpacing) {
                return new n0(index, items, this.f69268h, spans, this.f69267g, mainAxisSpacing);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(e1 e1Var, boolean z15, d3 d3Var, boolean z16, er.a<? extends o> aVar, w0 w0Var, d1.i.n nVar, d1.i.e eVar, ju.p0 p0Var, x1 x1Var, e3 e3Var) {
            this.f69249a = e1Var;
            this.f69250b = z15;
            this.f69251c = d3Var;
            this.f69252d = z16;
            this.f69253e = aVar;
            this.f69254f = w0Var;
            this.f69255g = nVar;
            this.f69256h = eVar;
            this.f69257i = p0Var;
            this.f69258j = x1Var;
            this.f69259k = e3Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ArrayList e(z0 z0Var, b bVar, int i15) {
            z0.c cVarD = z0Var.d(i15);
            int firstItemIndex = cVarD.getFirstItemIndex();
            ArrayList arrayList = new ArrayList(cVarD.b().size());
            List<c> listB = cVarD.b();
            int size = listB.size();
            int i16 = 0;
            for (int i17 = 0; i17 < size; i17++) {
                int iD = c.d(listB.get(i17).getPackedValue());
                arrayList.add(oq.y.a(Integer.valueOf(firstItemIndex), c5.b.a(bVar.a(i16, iD))));
                firstItemIndex++;
                i16 += iD;
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int f(z0 z0Var, int i15) {
            return z0Var.e(i15);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p036e4.x0 g(p056h1.z0 z0Var, long j15, int i15, int i16, int i17, int i18, er.l lVar) {
            return z0Var.x1(c5.c.g(j15, i17 + i15), c5.c.f(j15, i18 + i16), pq.v0.i(), lVar);
        }

        /* JADX WARN: Type inference failed for: r5v9, types: [g1.a0] */
        @Override // p056h1.y0
        public final p036e4.x0 a(final p056h1.z0 z0Var, final long j15) {
            float spacing;
            long jD;
            int iE;
            int iW;
            s2.a(this.f69249a.B());
            boolean z15 = this.f69249a.getHasLookaheadOccurred() || z0Var.J0();
            w0.a0.a(j15, this.f69250b ? p143z0.a2.Vertical : p143z0.a2.Horizontal);
            int iX0 = this.f69250b ? z0Var.X0(this.f69251c.c(z0Var.getLayoutDirection())) : z0Var.X0(a3.k(this.f69251c, z0Var.getLayoutDirection()));
            int iX1 = this.f69250b ? z0Var.X0(this.f69251c.b(z0Var.getLayoutDirection())) : z0Var.X0(a3.j(this.f69251c, z0Var.getLayoutDirection()));
            int iX2 = z0Var.X0(this.f69251c.getTop());
            int iX3 = z0Var.X0(this.f69251c.getBottom());
            final int i15 = iX2 + iX3;
            final int i16 = iX0 + iX1;
            boolean z16 = this.f69250b;
            int i17 = z16 ? i15 : i16;
            if (z16 && !this.f69252d) {
                iX1 = iX2;
            } else if (z16 && this.f69252d) {
                iX1 = iX3;
            } else if (!z16 && !this.f69252d) {
                iX1 = iX0;
            }
            int i18 = i17 - iX1;
            long jI = c5.c.i(j15, -i16, -i15);
            o oVarA = this.f69253e.a();
            final z0 z0VarI = oVarA.i();
            v0 v0VarA = this.f69254f.a(z0Var, jI);
            int length = v0VarA.getSizes().length;
            z0VarI.j(length);
            if (this.f69250b) {
                d1.i.n nVar = this.f69255g;
                if (nVar == null) {
                    c1.e.b("null verticalArrangement when isVertical == true");
                    throw new oq.g();
                }
                spacing = nVar.getSpacing();
            } else {
                d1.i.e eVar = this.f69256h;
                if (eVar == null) {
                    c1.e.b("null horizontalArrangement when isVertical == false");
                    throw new oq.g();
                }
                spacing = eVar.getSpacing();
            }
            int iX4 = z0Var.X0(spacing);
            int iA = oVarA.a();
            int iK = this.f69250b ? c5.b.k(j15) - i15 : c5.b.l(j15) - i16;
            int i19 = iX1;
            if (!this.f69252d || iK > 0) {
                jD = c5.n.d((((long) iX0) << 32) | (((long) iX2) & BodyPartID.bodyIdMax));
            } else {
                boolean z17 = this.f69250b;
                if (!z17) {
                    iX0 += iK;
                }
                if (z17) {
                    iX2 += iK;
                }
                jD = c5.n.d((((long) iX0) << 32) | (((long) iX2) & BodyPartID.bodyIdMax));
            }
            C1555a c1555a = new C1555a(oVarA, z0Var, iX4, this.f69249a, this.f69250b, this.f69252d, i19, i18, jD);
            final b bVar = new b(this.f69250b, v0VarA, iA, iX4, c1555a, z0VarI);
            er.l lVar = new er.l() { // from class: g1.z
                @Override // er.l
                public final Object b(Object obj) {
                    return c0.a.e(z0VarI, bVar, ((Integer) obj).intValue());
                }
            };
            ?? r15 = new er.l() { // from class: g1.a0
                @Override // er.l
                public final Object b(Object obj) {
                    return Integer.valueOf(c0.a.f(z0VarI, ((Integer) obj).intValue()));
                }
            };
            c3.l.Companion companion = c3.l.INSTANCE;
            e1 e1Var = this.f69249a;
            c3.l lVarD = companion.d();
            er.l<Object, oq.i0> lVarG = lVarD != null ? lVarD.g() : null;
            c3.l lVarE = companion.e(lVarD);
            try {
                int iT = e1Var.T(oVarA, e1Var.v());
                if (iT < iA || iA <= 0) {
                    iE = z0VarI.e(iT);
                    iW = e1Var.w();
                } else {
                    iE = z0VarI.e(iA - 1);
                    iW = 0;
                }
                oq.i0 i0Var = oq.i0.f148189a;
                companion.l(lVarD, lVarE, lVarG);
                k0 k0VarI = j0.i(iA, bVar, c1555a, iK, i19, i18, iX4, iE, iW, (z0Var.J0() || !z15) ? this.f69249a.getScrollToBeConsumed() : this.f69249a.I(), jI, this.f69250b, this.f69255g, this.f69256h, this.f69252d, z0Var, this.f69249a.z(), length, p056h1.x.a(oVarA, this.f69249a.getPinnedItems(), this.f69249a.getBeyondBoundsInfo()), z15, z0Var.J0(), this.f69249a.getApproachLayoutInfo(), this.f69257i, this.f69249a.E(), this.f69258j, lVar, r15, this.f69259k, new er.q() { // from class: g1.b0
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return c0.a.g(z0Var, j15, i16, i15, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), (er.l) obj3);
                    }
                });
                e1.r(this.f69249a, k0VarI, z0Var.J0(), false, 4, null);
                Object prefetchStrategy = this.f69249a.getPrefetchStrategy();
                p056h1.i iVar = prefetchStrategy instanceof p056h1.i ? (p056h1.i) prefetchStrategy : null;
                if (iVar != null) {
                    c0.e(iVar, k0VarI.getOrientation(), k0VarI.j(), bVar);
                }
                return k0VarI;
            } catch (Throwable th4) {
                companion.l(lVarD, lVarE, lVarG);
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011a  */
    /* JADX WARN: Code duplicated, block: B:102:0x0120  */
    /* JADX WARN: Code duplicated, block: B:103:0x0123  */
    /* JADX WARN: Code duplicated, block: B:107:0x0136  */
    /* JADX WARN: Code duplicated, block: B:111:0x013f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0148  */
    /* JADX WARN: Code duplicated, block: B:116:0x0152  */
    /* JADX WARN: Code duplicated, block: B:124:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x016a  */
    /* JADX WARN: Code duplicated, block: B:126:0x016d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0170  */
    /* JADX WARN: Code duplicated, block: B:131:0x017c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0181  */
    /* JADX WARN: Code duplicated, block: B:135:0x018e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0199  */
    /* JADX WARN: Code duplicated, block: B:141:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:144:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:148:0x0220  */
    /* JADX WARN: Code duplicated, block: B:150:0x0224  */
    /* JADX WARN: Code duplicated, block: B:152:0x0229  */
    /* JADX WARN: Code duplicated, block: B:154:0x0242  */
    /* JADX WARN: Code duplicated, block: B:157:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:159:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:162:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x0106  */
    /* JADX WARN: Code duplicated, block: B:94:0x010c  */
    /* JADX WARN: Code duplicated, block: B:95:0x010f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0114  */
    public static final void b(f3.m mVar, final e1 e1Var, final w0 w0Var, d3 d3Var, boolean z15, final boolean z16, p143z0.e1 e1Var2, final boolean z17, final g2 g2Var, final d1.i.n nVar, final d1.i.e eVar, final er.l<? super t0, oq.i0> lVar, p076m2.r rVar, final int i15, final int i16, final int i17) {
        f3.m mVar2;
        int i18;
        d3 d3VarE;
        int i19;
        boolean z18;
        int i25;
        p143z0.e1 e1Var3;
        int i26;
        int i27;
        boolean z19;
        final d3 d3Var2;
        final boolean z25;
        final f3.m mVar3;
        final p143z0.e1 e1Var4;
        d5 d5VarM;
        f3.m mVar4;
        boolean z26;
        d3 d3Var3;
        p143z0.e1 e1VarA;
        int i28;
        int i29;
        Object objE;
        e3 e3VarA;
        boolean z27;
        p143z0.a2 a2Var;
        p143z0.a2 a2Var2;
        f3.m mVarB;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i45;
        int i46;
        p076m2.r rVarH = rVar.h(708740370);
        int i47 = i17 & 1;
        if (i47 != 0) {
            i18 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i18 = (rVarH.W(mVar2) ? 4 : 2) | i15;
        } else {
            mVar2 = mVar;
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= rVarH.W(e1Var) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i18 |= (i15 & 512) == 0 ? rVarH.W(w0Var) : rVarH.G(w0Var) ? 256 : 128;
        }
        int i48 = i17 & 8;
        if (i48 == 0) {
            if ((i15 & 3072) == 0) {
                d3VarE = d3Var;
                i18 |= rVarH.W(d3VarE) ? 2048 : 1024;
            }
            i19 = i17 & 16;
            if (i19 != 0) {
                if ((i15 & 24576) == 0) {
                    z18 = z15;
                    if (rVarH.a(z18)) {
                        i25 = 16384;
                    } else {
                        i25 = PKIFailureInfo.certRevoked;
                    }
                    i18 |= i25;
                }
                if ((i15 & 196608) == 0) {
                    if (rVarH.a(z16)) {
                        i46 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i46 = PKIFailureInfo.notAuthorized;
                    }
                    i18 |= i46;
                }
                if ((i15 & 1572864) == 0) {
                    e1Var3 = e1Var2;
                    if ((i17 & 64) == 0 || !rVarH.W(e1Var3)) {
                        i45 = PKIFailureInfo.signerNotTrusted;
                    } else {
                        i45 = PKIFailureInfo.badCertTemplate;
                    }
                    i18 |= i45;
                } else {
                    e1Var3 = e1Var2;
                }
                if ((i15 & 12582912) == 0) {
                    if (rVarH.a(z17)) {
                        i39 = 8388608;
                    } else {
                        i39 = 4194304;
                    }
                    i18 |= i39;
                }
                if ((i15 & 100663296) == 0) {
                    if (rVarH.W(g2Var)) {
                        i38 = 67108864;
                    } else {
                        i38 = 33554432;
                    }
                    i18 |= i38;
                }
                if ((i15 & 805306368) == 0) {
                    if (rVarH.W(nVar)) {
                        i37 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i37 = 268435456;
                    }
                    i18 |= i37;
                }
                if ((i16 & 6) == 0) {
                    if (rVarH.W(eVar)) {
                        i36 = 4;
                    } else {
                        i36 = 2;
                    }
                    i26 = i16 | i36;
                } else {
                    i26 = i16;
                }
                if ((i16 & 48) == 0) {
                    if (rVarH.G(lVar)) {
                        i35 = 32;
                    } else {
                        i35 = 16;
                    }
                    i26 |= i35;
                }
                i27 = i26;
                if ((i18 & 306783379) == 306783378 || (i27 & 19) != 18) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (rVarH.r(z19, i18 & 1)) {
                    rVarH.I();
                    if ((i15 & 1) != 0 || rVarH.Q()) {
                        if (i47 != 0) {
                            mVar4 = f3.m.INSTANCE;
                        } else {
                            mVar4 = mVar2;
                        }
                        if (i48 != 0) {
                            d3VarE = a3.e(c5.h.n(0));
                        }
                        z26 = i19 == 0 ? z18 : false;
                        if ((i17 & 64) != 0) {
                            d3Var3 = d3VarE;
                            e1VarA = k2.f231404a.a(rVarH, 6);
                            i28 = i18 & (-3670017);
                        } else {
                            d3Var3 = d3VarE;
                        }
                        rVarH.y();
                        if (p076m2.t.k()) {
                            p076m2.t.o(708740370, i28, i27, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
                        }
                        i29 = (i28 >> 3) & 14;
                        er.a<o> aVarC = u.c(e1Var, lVar, rVarH, (i27 & 112) | i29);
                        int i49 = i28 >> 9;
                        t1 t1VarA = k1.a(e1Var, z26, rVarH, (i49 & 112) | i29);
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = Function0.i(tq.j.f191408a, rVarH);
                            rVarH.v(objE);
                        }
                        ju.p0 p0Var = (ju.p0) objE;
                        x1 x1Var = (x1) rVarH.N(androidx.compose.ui.platform.g1.i());
                        if (((Boolean) rVarH.N(androidx.compose.ui.platform.g1.q())).booleanValue()) {
                            e3VarA = null;
                        } else {
                            e3VarA = e3.INSTANCE.a();
                        }
                        f3.m mVar5 = mVar4;
                        int i55 = i28;
                        p056h1.y0 y0VarF = f(aVarC, e1Var, w0Var, d3Var3, z26, z16, eVar, nVar, p0Var, x1Var, e3VarA, rVarH, (i28 & 524272) | ((i27 << 18) & 3670016) | ((i28 >> 6) & 29360128), 0);
                        z27 = z26;
                        d3 d3Var4 = d3Var3;
                        if (z16) {
                            a2Var = p143z0.a2.Vertical;
                        } else {
                            a2Var = p143z0.a2.Horizontal;
                        }
                        a2Var2 = a2Var;
                        if (z17) {
                            rVarH.X(27281635);
                            mVarB = p056h1.t.b(f3.m.INSTANCE, e.a(e1Var, rVarH, i29), e1Var.getBeyondBoundsInfo(), z27, a2Var2);
                            rVarH.R();
                        } else {
                            rVarH.X(27577840);
                            rVarH.R();
                            mVarB = f3.m.INSTANCE;
                        }
                        p143z0.e1 e1Var5 = e1VarA;
                        p056h1.Function0.f(aVarC, h3.c(u1.c(mVar5.u(e1Var.getRemeasurementModifier()).u(e1Var.getAwaitLayoutModifier()), aVarC, t1VarA, a2Var2, z17, z27, rVarH, (i49 & 57344) | (458752 & (i55 << 3))).u(mVarB).u(e1Var.z().getModifier()), e1Var, a2Var2, g2Var, z17, z27, e1Var5, e1Var.getInternalInteractionSource(), null, 128, null), e1Var.getPrefetchState(), y0VarF, rVarH, 0, 0);
                        rVarH = rVarH;
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        z25 = z27;
                        e1Var4 = e1Var5;
                        d3Var2 = d3Var4;
                        mVar3 = mVar5;
                    } else {
                        rVarH.O();
                        if ((i17 & 64) != 0) {
                            i18 &= -3670017;
                        }
                        d3Var3 = d3VarE;
                        z26 = z18;
                        mVar4 = mVar2;
                    }
                    i28 = i18;
                    e1VarA = e1Var3;
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(708740370, i28, i27, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
                    }
                    i29 = (i28 >> 3) & 14;
                    er.a<o> aVarC2 = u.c(e1Var, lVar, rVarH, (i27 & 112) | i29);
                    int i410 = i28 >> 9;
                    t1 t1VarA2 = k1.a(e1Var, z26, rVarH, (i410 & 112) | i29);
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE);
                    }
                    ju.p0 p0Var2 = (ju.p0) objE;
                    x1 x1Var2 = (x1) rVarH.N(androidx.compose.ui.platform.g1.i());
                    if (((Boolean) rVarH.N(androidx.compose.ui.platform.g1.q())).booleanValue()) {
                        e3VarA = e3.INSTANCE.a();
                    } else {
                        e3VarA = null;
                    }
                    f3.m mVar6 = mVar4;
                    int i56 = i28;
                    p056h1.y0 y0VarF2 = f(aVarC2, e1Var, w0Var, d3Var3, z26, z16, eVar, nVar, p0Var2, x1Var2, e3VarA, rVarH, (i28 & 524272) | ((i27 << 18) & 3670016) | ((i28 >> 6) & 29360128), 0);
                    z27 = z26;
                    d3 d3Var5 = d3Var3;
                    if (z16) {
                        a2Var = p143z0.a2.Vertical;
                    } else {
                        a2Var = p143z0.a2.Horizontal;
                    }
                    a2Var2 = a2Var;
                    if (z17) {
                        rVarH.X(27281635);
                        mVarB = p056h1.t.b(f3.m.INSTANCE, e.a(e1Var, rVarH, i29), e1Var.getBeyondBoundsInfo(), z27, a2Var2);
                        rVarH.R();
                    } else {
                        rVarH.X(27577840);
                        rVarH.R();
                        mVarB = f3.m.INSTANCE;
                    }
                    p143z0.e1 e1Var6 = e1VarA;
                    p056h1.Function0.f(aVarC2, h3.c(u1.c(mVar6.u(e1Var.getRemeasurementModifier()).u(e1Var.getAwaitLayoutModifier()), aVarC2, t1VarA2, a2Var2, z17, z27, rVarH, (i410 & 57344) | (458752 & (i56 << 3))).u(mVarB).u(e1Var.z().getModifier()), e1Var, a2Var2, g2Var, z17, z27, e1Var6, e1Var.getInternalInteractionSource(), null, 128, null), e1Var.getPrefetchState(), y0VarF2, rVarH, 0, 0);
                    rVarH = rVarH;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    z25 = z27;
                    e1Var4 = e1Var6;
                    d3Var2 = d3Var5;
                    mVar3 = mVar6;
                } else {
                    rVarH.O();
                    d3Var2 = d3VarE;
                    z25 = z18;
                    mVar3 = mVar2;
                    e1Var4 = e1Var3;
                }
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: g1.y
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return c0.c(mVar3, e1Var, w0Var, d3Var2, z25, z16, e1Var4, z17, g2Var, nVar, eVar, lVar, i15, i16, i17, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i18 |= 24576;
            z18 = z15;
            if ((i15 & 196608) == 0) {
                if (rVarH.a(z16)) {
                    i46 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i46 = PKIFailureInfo.notAuthorized;
                }
                i18 |= i46;
            }
            if ((i15 & 1572864) == 0) {
                e1Var3 = e1Var2;
                if ((i17 & 64) == 0) {
                    i45 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i45 = PKIFailureInfo.signerNotTrusted;
                }
                i18 |= i45;
            } else {
                e1Var3 = e1Var2;
            }
            if ((i15 & 12582912) == 0) {
                if (rVarH.a(z17)) {
                    i39 = 8388608;
                } else {
                    i39 = 4194304;
                }
                i18 |= i39;
            }
            if ((i15 & 100663296) == 0) {
                if (rVarH.W(g2Var)) {
                    i38 = 67108864;
                } else {
                    i38 = 33554432;
                }
                i18 |= i38;
            }
            if ((i15 & 805306368) == 0) {
                if (rVarH.W(nVar)) {
                    i37 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i37 = 268435456;
                }
                i18 |= i37;
            }
            if ((i16 & 6) == 0) {
                if (rVarH.W(eVar)) {
                    i36 = 4;
                } else {
                    i36 = 2;
                }
                i26 = i16 | i36;
            } else {
                i26 = i16;
            }
            if ((i16 & 48) == 0) {
                if (rVarH.G(lVar)) {
                    i35 = 32;
                } else {
                    i35 = 16;
                }
                i26 |= i35;
            }
            i27 = i26;
            if ((i18 & 306783379) == 306783378) {
                z19 = true;
            } else {
                z19 = true;
            }
            if (rVarH.r(z19, i18 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i47 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i48 != 0) {
                        d3VarE = a3.e(c5.h.n(0));
                    }
                    if (i19 == 0) {
                    }
                    if ((i17 & 64) != 0) {
                        d3Var3 = d3VarE;
                        e1VarA = k2.f231404a.a(rVarH, 6);
                        i28 = i18 & (-3670017);
                    } else {
                        d3Var3 = d3VarE;
                        i28 = i18;
                        e1VarA = e1Var3;
                    }
                } else {
                    if (i47 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i48 != 0) {
                        d3VarE = a3.e(c5.h.n(0));
                    }
                    if (i19 == 0) {
                    }
                    if ((i17 & 64) != 0) {
                        d3Var3 = d3VarE;
                        e1VarA = k2.f231404a.a(rVarH, 6);
                        i28 = i18 & (-3670017);
                    } else {
                        d3Var3 = d3VarE;
                        i28 = i18;
                        e1VarA = e1Var3;
                    }
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(708740370, i28, i27, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
                }
                i29 = (i28 >> 3) & 14;
                er.a<o> aVarC3 = u.c(e1Var, lVar, rVarH, (i27 & 112) | i29);
                int i411 = i28 >> 9;
                t1 t1VarA3 = k1.a(e1Var, z26, rVarH, (i411 & 112) | i29);
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = Function0.i(tq.j.f191408a, rVarH);
                    rVarH.v(objE);
                }
                ju.p0 p0Var3 = (ju.p0) objE;
                x1 x1Var3 = (x1) rVarH.N(androidx.compose.ui.platform.g1.i());
                if (((Boolean) rVarH.N(androidx.compose.ui.platform.g1.q())).booleanValue()) {
                    e3VarA = e3.INSTANCE.a();
                } else {
                    e3VarA = null;
                }
                f3.m mVar7 = mVar4;
                int i57 = i28;
                p056h1.y0 y0VarF3 = f(aVarC3, e1Var, w0Var, d3Var3, z26, z16, eVar, nVar, p0Var3, x1Var3, e3VarA, rVarH, (i28 & 524272) | ((i27 << 18) & 3670016) | ((i28 >> 6) & 29360128), 0);
                z27 = z26;
                d3 d3Var6 = d3Var3;
                if (z16) {
                    a2Var = p143z0.a2.Vertical;
                } else {
                    a2Var = p143z0.a2.Horizontal;
                }
                a2Var2 = a2Var;
                if (z17) {
                    rVarH.X(27281635);
                    mVarB = p056h1.t.b(f3.m.INSTANCE, e.a(e1Var, rVarH, i29), e1Var.getBeyondBoundsInfo(), z27, a2Var2);
                    rVarH.R();
                } else {
                    rVarH.X(27577840);
                    rVarH.R();
                    mVarB = f3.m.INSTANCE;
                }
                p143z0.e1 e1Var7 = e1VarA;
                p056h1.Function0.f(aVarC3, h3.c(u1.c(mVar7.u(e1Var.getRemeasurementModifier()).u(e1Var.getAwaitLayoutModifier()), aVarC3, t1VarA3, a2Var2, z17, z27, rVarH, (i411 & 57344) | (458752 & (i57 << 3))).u(mVarB).u(e1Var.z().getModifier()), e1Var, a2Var2, g2Var, z17, z27, e1Var7, e1Var.getInternalInteractionSource(), null, 128, null), e1Var.getPrefetchState(), y0VarF3, rVarH, 0, 0);
                rVarH = rVarH;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                z25 = z27;
                e1Var4 = e1Var7;
                d3Var2 = d3Var6;
                mVar3 = mVar7;
            } else {
                rVarH.O();
                d3Var2 = d3VarE;
                z25 = z18;
                mVar3 = mVar2;
                e1Var4 = e1Var3;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: g1.y
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return c0.c(mVar3, e1Var, w0Var, d3Var2, z25, z16, e1Var4, z17, g2Var, nVar, eVar, lVar, i15, i16, i17, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 3072;
        d3VarE = d3Var;
        i19 = i17 & 16;
        if (i19 != 0) {
            if ((i15 & 24576) == 0) {
                z18 = z15;
                if (rVarH.a(z18)) {
                    i25 = 16384;
                } else {
                    i25 = PKIFailureInfo.certRevoked;
                }
                i18 |= i25;
            }
            if ((i15 & 196608) == 0) {
                if (rVarH.a(z16)) {
                    i46 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i46 = PKIFailureInfo.notAuthorized;
                }
                i18 |= i46;
            }
            if ((i15 & 1572864) == 0) {
                e1Var3 = e1Var2;
                if ((i17 & 64) == 0) {
                    i45 = PKIFailureInfo.signerNotTrusted;
                } else {
                    i45 = PKIFailureInfo.signerNotTrusted;
                }
                i18 |= i45;
            } else {
                e1Var3 = e1Var2;
            }
            if ((i15 & 12582912) == 0) {
                if (rVarH.a(z17)) {
                    i39 = 8388608;
                } else {
                    i39 = 4194304;
                }
                i18 |= i39;
            }
            if ((i15 & 100663296) == 0) {
                if (rVarH.W(g2Var)) {
                    i38 = 67108864;
                } else {
                    i38 = 33554432;
                }
                i18 |= i38;
            }
            if ((i15 & 805306368) == 0) {
                if (rVarH.W(nVar)) {
                    i37 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i37 = 268435456;
                }
                i18 |= i37;
            }
            if ((i16 & 6) == 0) {
                if (rVarH.W(eVar)) {
                    i36 = 4;
                } else {
                    i36 = 2;
                }
                i26 = i16 | i36;
            } else {
                i26 = i16;
            }
            if ((i16 & 48) == 0) {
                if (rVarH.G(lVar)) {
                    i35 = 32;
                } else {
                    i35 = 16;
                }
                i26 |= i35;
            }
            i27 = i26;
            if ((i18 & 306783379) == 306783378) {
                z19 = true;
            } else {
                z19 = true;
            }
            if (rVarH.r(z19, i18 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0) {
                    if (i47 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i48 != 0) {
                        d3VarE = a3.e(c5.h.n(0));
                    }
                    if (i19 == 0) {
                    }
                    if ((i17 & 64) != 0) {
                        d3Var3 = d3VarE;
                        e1VarA = k2.f231404a.a(rVarH, 6);
                        i28 = i18 & (-3670017);
                    } else {
                        d3Var3 = d3VarE;
                        i28 = i18;
                        e1VarA = e1Var3;
                    }
                } else {
                    if (i47 != 0) {
                        mVar4 = f3.m.INSTANCE;
                    } else {
                        mVar4 = mVar2;
                    }
                    if (i48 != 0) {
                        d3VarE = a3.e(c5.h.n(0));
                    }
                    if (i19 == 0) {
                    }
                    if ((i17 & 64) != 0) {
                        d3Var3 = d3VarE;
                        e1VarA = k2.f231404a.a(rVarH, 6);
                        i28 = i18 & (-3670017);
                    } else {
                        d3Var3 = d3VarE;
                        i28 = i18;
                        e1VarA = e1Var3;
                    }
                }
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(708740370, i28, i27, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
                }
                i29 = (i28 >> 3) & 14;
                er.a<o> aVarC4 = u.c(e1Var, lVar, rVarH, (i27 & 112) | i29);
                int i412 = i28 >> 9;
                t1 t1VarA4 = k1.a(e1Var, z26, rVarH, (i412 & 112) | i29);
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = Function0.i(tq.j.f191408a, rVarH);
                    rVarH.v(objE);
                }
                ju.p0 p0Var4 = (ju.p0) objE;
                x1 x1Var4 = (x1) rVarH.N(androidx.compose.ui.platform.g1.i());
                if (((Boolean) rVarH.N(androidx.compose.ui.platform.g1.q())).booleanValue()) {
                    e3VarA = e3.INSTANCE.a();
                } else {
                    e3VarA = null;
                }
                f3.m mVar8 = mVar4;
                int i58 = i28;
                p056h1.y0 y0VarF4 = f(aVarC4, e1Var, w0Var, d3Var3, z26, z16, eVar, nVar, p0Var4, x1Var4, e3VarA, rVarH, (i28 & 524272) | ((i27 << 18) & 3670016) | ((i28 >> 6) & 29360128), 0);
                z27 = z26;
                d3 d3Var7 = d3Var3;
                if (z16) {
                    a2Var = p143z0.a2.Vertical;
                } else {
                    a2Var = p143z0.a2.Horizontal;
                }
                a2Var2 = a2Var;
                if (z17) {
                    rVarH.X(27281635);
                    mVarB = p056h1.t.b(f3.m.INSTANCE, e.a(e1Var, rVarH, i29), e1Var.getBeyondBoundsInfo(), z27, a2Var2);
                    rVarH.R();
                } else {
                    rVarH.X(27577840);
                    rVarH.R();
                    mVarB = f3.m.INSTANCE;
                }
                p143z0.e1 e1Var8 = e1VarA;
                p056h1.Function0.f(aVarC4, h3.c(u1.c(mVar8.u(e1Var.getRemeasurementModifier()).u(e1Var.getAwaitLayoutModifier()), aVarC4, t1VarA4, a2Var2, z17, z27, rVarH, (i412 & 57344) | (458752 & (i58 << 3))).u(mVarB).u(e1Var.z().getModifier()), e1Var, a2Var2, g2Var, z17, z27, e1Var8, e1Var.getInternalInteractionSource(), null, 128, null), e1Var.getPrefetchState(), y0VarF4, rVarH, 0, 0);
                rVarH = rVarH;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                z25 = z27;
                e1Var4 = e1Var8;
                d3Var2 = d3Var7;
                mVar3 = mVar8;
            } else {
                rVarH.O();
                d3Var2 = d3VarE;
                z25 = z18;
                mVar3 = mVar2;
                e1Var4 = e1Var3;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: g1.y
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return c0.c(mVar3, e1Var, w0Var, d3Var2, z25, z16, e1Var4, z17, g2Var, nVar, eVar, lVar, i15, i16, i17, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i18 |= 24576;
        z18 = z15;
        if ((i15 & 196608) == 0) {
            if (rVarH.a(z16)) {
                i46 = PKIFailureInfo.unsupportedVersion;
            } else {
                i46 = PKIFailureInfo.notAuthorized;
            }
            i18 |= i46;
        }
        if ((i15 & 1572864) == 0) {
            e1Var3 = e1Var2;
            if ((i17 & 64) == 0) {
                i45 = PKIFailureInfo.signerNotTrusted;
            } else {
                i45 = PKIFailureInfo.signerNotTrusted;
            }
            i18 |= i45;
        } else {
            e1Var3 = e1Var2;
        }
        if ((i15 & 12582912) == 0) {
            if (rVarH.a(z17)) {
                i39 = 8388608;
            } else {
                i39 = 4194304;
            }
            i18 |= i39;
        }
        if ((i15 & 100663296) == 0) {
            if (rVarH.W(g2Var)) {
                i38 = 67108864;
            } else {
                i38 = 33554432;
            }
            i18 |= i38;
        }
        if ((i15 & 805306368) == 0) {
            if (rVarH.W(nVar)) {
                i37 = PKIFailureInfo.duplicateCertReq;
            } else {
                i37 = 268435456;
            }
            i18 |= i37;
        }
        if ((i16 & 6) == 0) {
            if (rVarH.W(eVar)) {
                i36 = 4;
            } else {
                i36 = 2;
            }
            i26 = i16 | i36;
        } else {
            i26 = i16;
        }
        if ((i16 & 48) == 0) {
            if (rVarH.G(lVar)) {
                i35 = 32;
            } else {
                i35 = 16;
            }
            i26 |= i35;
        }
        i27 = i26;
        if ((i18 & 306783379) == 306783378) {
            z19 = true;
        } else {
            z19 = true;
        }
        if (rVarH.r(z19, i18 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i47 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i48 != 0) {
                    d3VarE = a3.e(c5.h.n(0));
                }
                if (i19 == 0) {
                }
                if ((i17 & 64) != 0) {
                    d3Var3 = d3VarE;
                    e1VarA = k2.f231404a.a(rVarH, 6);
                    i28 = i18 & (-3670017);
                } else {
                    d3Var3 = d3VarE;
                    i28 = i18;
                    e1VarA = e1Var3;
                }
            } else {
                if (i47 != 0) {
                    mVar4 = f3.m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (i48 != 0) {
                    d3VarE = a3.e(c5.h.n(0));
                }
                if (i19 == 0) {
                }
                if ((i17 & 64) != 0) {
                    d3Var3 = d3VarE;
                    e1VarA = k2.f231404a.a(rVarH, 6);
                    i28 = i18 & (-3670017);
                } else {
                    d3Var3 = d3VarE;
                    i28 = i18;
                    e1VarA = e1Var3;
                }
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(708740370, i28, i27, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
            }
            i29 = (i28 >> 3) & 14;
            er.a<o> aVarC5 = u.c(e1Var, lVar, rVarH, (i27 & 112) | i29);
            int i413 = i28 >> 9;
            t1 t1VarA5 = k1.a(e1Var, z26, rVarH, (i413 & 112) | i29);
            objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = Function0.i(tq.j.f191408a, rVarH);
                rVarH.v(objE);
            }
            ju.p0 p0Var5 = (ju.p0) objE;
            x1 x1Var5 = (x1) rVarH.N(androidx.compose.ui.platform.g1.i());
            if (((Boolean) rVarH.N(androidx.compose.ui.platform.g1.q())).booleanValue()) {
                e3VarA = e3.INSTANCE.a();
            } else {
                e3VarA = null;
            }
            f3.m mVar9 = mVar4;
            int i59 = i28;
            p056h1.y0 y0VarF5 = f(aVarC5, e1Var, w0Var, d3Var3, z26, z16, eVar, nVar, p0Var5, x1Var5, e3VarA, rVarH, (i28 & 524272) | ((i27 << 18) & 3670016) | ((i28 >> 6) & 29360128), 0);
            z27 = z26;
            d3 d3Var8 = d3Var3;
            if (z16) {
                a2Var = p143z0.a2.Vertical;
            } else {
                a2Var = p143z0.a2.Horizontal;
            }
            a2Var2 = a2Var;
            if (z17) {
                rVarH.X(27281635);
                mVarB = p056h1.t.b(f3.m.INSTANCE, e.a(e1Var, rVarH, i29), e1Var.getBeyondBoundsInfo(), z27, a2Var2);
                rVarH.R();
            } else {
                rVarH.X(27577840);
                rVarH.R();
                mVarB = f3.m.INSTANCE;
            }
            p143z0.e1 e1Var9 = e1VarA;
            p056h1.Function0.f(aVarC5, h3.c(u1.c(mVar9.u(e1Var.getRemeasurementModifier()).u(e1Var.getAwaitLayoutModifier()), aVarC5, t1VarA5, a2Var2, z17, z27, rVarH, (i413 & 57344) | (458752 & (i59 << 3))).u(mVarB).u(e1Var.z().getModifier()), e1Var, a2Var2, g2Var, z17, z27, e1Var9, e1Var.getInternalInteractionSource(), null, 128, null), e1Var.getPrefetchState(), y0VarF5, rVarH, 0, 0);
            rVarH = rVarH;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            z25 = z27;
            e1Var4 = e1Var9;
            d3Var2 = d3Var8;
            mVar3 = mVar9;
        } else {
            rVarH.O();
            d3Var2 = d3VarE;
            z25 = z18;
            mVar3 = mVar2;
            e1Var4 = e1Var3;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g1.y
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c0.c(mVar3, e1Var, w0Var, d3Var2, z25, z16, e1Var4, z17, g2Var, nVar, eVar, lVar, i15, i16, i17, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(f3.m mVar, e1 e1Var, w0 w0Var, d3 d3Var, boolean z15, boolean z16, p143z0.e1 e1Var2, boolean z17, g2 g2Var, d1.i.n nVar, d1.i.e eVar, er.l lVar, int i15, int i16, int i17, p076m2.r rVar, int i18) {
        b(mVar, e1Var, w0Var, d3Var, z15, z16, e1Var2, z17, g2Var, nVar, eVar, lVar, rVar, g4.a(i15 | 1), g4.a(i16), i17);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(p056h1.i iVar, p143z0.a2 a2Var, List<l0> list, o0 o0Var) {
        Trace.beginSection("compose:lazy:cache_window:keepAroundItems");
        try {
            if (iVar.n() && !list.isEmpty()) {
                int iA = n.a((m) pq.v.l0(list), a2Var);
                int iA2 = n.a((m) pq.v.x0(list), a2Var);
                for (int iM = iVar.getPrefetchWindowStartLine(); iM < iA; iM++) {
                    o0Var.d(iM);
                }
                int i15 = iA2 + 1;
                int iL = iVar.getPrefetchWindowEndLine();
                if (i15 <= iL) {
                    while (true) {
                        o0Var.d(i15);
                        if (i15 == iL) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
            }
            oq.i0 i0Var = oq.i0.f148189a;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008f A[PHI: r3
      0x008f: PHI (r3v23 boolean) = (r3v21 boolean), (r3v24 boolean) binds: [B:44:0x008d, B:40:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x00da  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f4  */
    private static final p056h1.y0 f(er.a<? extends o> aVar, e1 e1Var, w0 w0Var, d3 d3Var, boolean z15, boolean z16, d1.i.e eVar, d1.i.n nVar, ju.p0 p0Var, x1 x1Var, e3 e3Var, p076m2.r rVar, int i15, int i16) {
        boolean z17;
        boolean z18;
        boolean zW;
        Object objE;
        if (p076m2.t.k()) {
            p076m2.t.o(-1030995717, i15, i16, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:179)");
        }
        boolean z19 = ((((i15 & 112) ^ 48) > 32 && rVar.W(e1Var)) || (i15 & 48) == 32) | ((((i15 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && rVar.W(w0Var)) || (i15 & MLKEMEngine.KyberPolyBytes) == 256) | ((((i15 & 7168) ^ 3072) > 2048 && rVar.W(d3Var)) || (i15 & 3072) == 2048) | ((((57344 & i15) ^ 24576) > 16384 && rVar.a(z15)) || (i15 & 24576) == 16384);
        if (((458752 & i15) ^ 196608) > 131072) {
            z17 = z16;
            if (rVar.a(z17)) {
                z18 = true;
            }
            zW = z19 | z18 | ((((3670016 & i15) ^ 1572864) <= 1048576 && rVar.W(eVar)) || (i15 & 1572864) == 1048576) | ((((29360128 & i15) ^ 12582912) <= 8388608 && rVar.W(nVar)) || (i15 & 12582912) == 8388608) | rVar.W(x1Var);
            objE = rVar.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                a aVar2 = new a(e1Var, z17, d3Var, z15, aVar, w0Var, nVar, eVar, p0Var, x1Var, e3Var);
                rVar.v(aVar2);
                objE = aVar2;
            }
            p056h1.y0 y0Var = (p056h1.y0) objE;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            return y0Var;
        }
        z17 = z16;
        if ((196608 & i15) == 131072) {
            z18 = true;
        } else {
            z18 = false;
        }
        zW = z19 | z18 | ((((3670016 & i15) ^ 1572864) <= 1048576 && rVar.W(eVar)) || (i15 & 1572864) == 1048576) | ((((29360128 & i15) ^ 12582912) <= 8388608 && rVar.W(nVar)) || (i15 & 12582912) == 8388608) | rVar.W(x1Var);
        objE = rVar.E();
        if (zW) {
            a aVar3 = new a(e1Var, z17, d3Var, z15, aVar, w0Var, nVar, eVar, p0Var, x1Var, e3Var);
            rVar.v(aVar3);
            objE = aVar3;
        } else {
            a aVar4 = new a(e1Var, z17, d3Var, z15, aVar, w0Var, nVar, eVar, p0Var, x1Var, e3Var);
            rVar.v(aVar4);
            objE = aVar4;
        }
        p056h1.y0 y0Var2 = (p056h1.y0) objE;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return y0Var2;
    }
}
