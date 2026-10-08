package f1;

import android.os.Trace;
import androidx.compose.ui.platform.g1;
import d1.a3;
import d1.d3;
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
import w0.g2;
import w0.h3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u009f\u0001\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018H\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0087\u0001\u0010(\u001a\u00020'2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0003¢\u0006\u0004\b(\u0010)\u001a)\u00100\u001a\u00020\u001a*\u00020*2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101¨\u00062"}, d2 = {"Lf3/m;", "modifier", "Lf1/y0;", "state", "Ld1/d3;", "contentPadding", "", "reverseLayout", "isVertical", "Lz0/e1;", "flingBehavior", "userScrollEnabled", "Lw0/g2;", "overscrollEffect", "", "beyondBoundsItemCount", "Lf3/c$b;", "horizontalAlignment", "Ld1/i$n;", "verticalArrangement", "Lf3/c$c;", "verticalAlignment", "Ld1/i$e;", "horizontalArrangement", "Lkotlin/Function1;", "Lf1/q0;", "Loq/i0;", "content", "b", "(Lf3/m;Lf1/y0;Ld1/d3;ZZLz0/e1;ZLw0/g2;ILf3/c$b;Ld1/i$n;Lf3/c$c;Ld1/i$e;Ler/l;Lm2/r;III)V", "Lkotlin/Function0;", "Lf1/r;", "itemProviderLambda", "Lju/p0;", "coroutineScope", "Ln3/x1;", "graphicsContext", "Lh1/e3;", "stickyItemsPlacement", "Lh1/y0;", "f", "(Ler/a;Lf1/y0;Ld1/d3;ZZILf3/c$b;Lf3/c$c;Ld1/i$e;Ld1/i$n;Lju/p0;Ln3/x1;Lh1/e3;Lm2/r;II)Lh1/y0;", "Lh1/i;", "", "Lf1/j0;", "visibleItemsList", "Lf1/k0;", "measuredItemProvider", "e", "(Lh1/i;Ljava/util/List;Lf1/k0;)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p056h1.y0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y0 f54704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f54705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d3 f54706c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f54707d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ er.a<r> f54708e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d1.i.n f54709f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ d1.i.e f54710g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f54711h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ ju.p0 f54712i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ x1 f54713j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ e3 f54714k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ f3.c.b f54715l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ f3.c.InterfaceC1317c f54716m;

        /* JADX INFO: renamed from: f1.a0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J?\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"f1/a0$a$a", "Lf1/k0;", "", "index", "", "key", CMSAttributeTableGenerator.CONTENT_TYPE, "", "Le4/a2;", "placeables", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Lf1/j0;", "c", "(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;J)Lf1/j0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C1296a extends k0 {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f54717e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p056h1.z0 f54718f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f54719g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f54720h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ f3.c.b f54721i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ f3.c.InterfaceC1317c f54722j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ boolean f54723k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ int f54724l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ int f54725m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ long f54726n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ y0 f54727o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1296a(long j15, boolean z15, r rVar, p056h1.z0 z0Var, int i15, int i16, f3.c.b bVar, f3.c.InterfaceC1317c interfaceC1317c, boolean z16, int i17, int i18, long j16, y0 y0Var) {
                super(j15, z15, rVar, z0Var, null);
                this.f54717e = z15;
                this.f54718f = z0Var;
                this.f54719g = i15;
                this.f54720h = i16;
                this.f54721i = bVar;
                this.f54722j = interfaceC1317c;
                this.f54723k = z16;
                this.f54724l = i17;
                this.f54725m = i18;
                this.f54726n = j16;
                this.f54727o = y0Var;
            }

            @Override // f1.k0
            public j0 c(int index, Object key, Object contentType, List<? extends a2> placeables, long constraints) {
                return new j0(index, placeables, this.f54717e, this.f54721i, this.f54722j, this.f54718f.getLayoutDirection(), this.f54723k, this.f54724l, this.f54725m, index == this.f54719g + (-1) ? 0 : this.f54720h, this.f54726n, key, contentType, this.f54727o.B(), constraints, null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(y0 y0Var, boolean z15, d3 d3Var, boolean z16, er.a<? extends r> aVar, d1.i.n nVar, d1.i.e eVar, int i15, ju.p0 p0Var, x1 x1Var, e3 e3Var, f3.c.b bVar, f3.c.InterfaceC1317c interfaceC1317c) {
            this.f54704a = y0Var;
            this.f54705b = z15;
            this.f54706c = d3Var;
            this.f54707d = z16;
            this.f54708e = aVar;
            this.f54709f = nVar;
            this.f54710g = eVar;
            this.f54711h = i15;
            this.f54712i = p0Var;
            this.f54713j = x1Var;
            this.f54714k = e3Var;
            this.f54715l = bVar;
            this.f54716m = interfaceC1317c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p036e4.x0 c(p056h1.z0 z0Var, long j15, int i15, int i16, int i17, int i18, er.l lVar) {
            return z0Var.x1(c5.c.g(j15, i17 + i15), c5.c.f(j15, i18 + i16), pq.v0.i(), lVar);
        }

        @Override // p056h1.y0
        public final p036e4.x0 a(final p056h1.z0 z0Var, final long j15) {
            int i15;
            float spacing;
            long jD;
            s2.a(this.f54704a.D());
            boolean z15 = this.f54704a.getHasLookaheadOccurred() || z0Var.J0();
            w0.a0.a(j15, this.f54705b ? p143z0.a2.Vertical : p143z0.a2.Horizontal);
            int iX0 = this.f54705b ? z0Var.X0(this.f54706c.c(z0Var.getLayoutDirection())) : z0Var.X0(a3.k(this.f54706c, z0Var.getLayoutDirection()));
            int iX1 = this.f54705b ? z0Var.X0(this.f54706c.b(z0Var.getLayoutDirection())) : z0Var.X0(a3.j(this.f54706c, z0Var.getLayoutDirection()));
            int iX2 = z0Var.X0(this.f54706c.getTop());
            int iX3 = z0Var.X0(this.f54706c.getBottom());
            final int i16 = iX2 + iX3;
            final int i17 = iX0 + iX1;
            boolean z16 = this.f54705b;
            int i18 = z16 ? i16 : i17;
            if (z16 && !this.f54707d) {
                i15 = iX2;
            } else if (z16 && this.f54707d) {
                i15 = iX3;
            } else {
                i15 = (z16 || this.f54707d) ? iX1 : iX0;
            }
            int i19 = i18 - i15;
            long jI = c5.c.i(j15, -i17, -i16);
            r rVarA = this.f54708e.a();
            rVarA.getItemScope().e(c5.b.l(jI), c5.b.k(jI));
            if (this.f54705b) {
                d1.i.n nVar = this.f54709f;
                if (nVar == null) {
                    c1.e.b("null verticalArrangement when isVertical == true");
                    throw new oq.g();
                }
                spacing = nVar.getSpacing();
            } else {
                d1.i.e eVar = this.f54710g;
                if (eVar == null) {
                    c1.e.b("null horizontalAlignment when isVertical == false");
                    throw new oq.g();
                }
                spacing = eVar.getSpacing();
            }
            int iX4 = z0Var.X0(spacing);
            int iA = rVarA.a();
            int iK = this.f54705b ? c5.b.k(j15) - i16 : c5.b.l(j15) - i17;
            if (!this.f54707d || iK > 0) {
                jD = c5.n.d((((long) iX0) << 32) | (((long) iX2) & BodyPartID.bodyIdMax));
            } else {
                boolean z17 = this.f54705b;
                if (!z17) {
                    iX0 += iK;
                }
                if (z17) {
                    iX2 += iK;
                }
                jD = c5.n.d((((long) iX0) << 32) | (((long) iX2) & BodyPartID.bodyIdMax));
            }
            C1296a c1296a = new C1296a(jI, this.f54705b, rVarA, z0Var, iA, iX4, this.f54715l, this.f54716m, this.f54707d, i15, i19, jD, this.f54704a);
            c3.l.Companion companion = c3.l.INSTANCE;
            y0 y0Var = this.f54704a;
            c3.l lVarD = companion.d();
            er.l<Object, oq.i0> lVarG = lVarD != null ? lVarD.g() : null;
            c3.l lVarE = companion.e(lVarD);
            try {
                int iX = y0Var.X(rVarA, y0Var.x());
                int iY = y0Var.y();
                oq.i0 i0Var = oq.i0.f148189a;
                companion.l(lVarD, lVarE, lVarG);
                i0 i0VarI = h0.i(iA, c1296a, iK, i15, i19, iX4, iX, iY, (z0Var.J0() || !z15) ? this.f54704a.getScrollToBeConsumed() : this.f54704a.K(), jI, this.f54705b, this.f54709f, this.f54710g, this.f54707d, z0Var, this.f54704a.B(), this.f54711h, p056h1.x.a(rVarA, this.f54704a.getPinnedItems(), this.f54704a.getBeyondBoundsInfo()), z15, z0Var.J0(), this.f54712i, this.f54704a.G(), this.f54713j, this.f54714k, !this.f54704a.getSkipItemPlacementAnimation(), new er.q() { // from class: f1.z
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return a0.a.c(z0Var, j15, i17, i16, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), (er.l) obj3);
                    }
                });
                y0.t(this.f54704a, i0VarI, z0Var.J0(), false, 4, null);
                Object prefetchStrategy = this.f54704a.getPrefetchStrategy();
                p056h1.i iVar = prefetchStrategy instanceof p056h1.i ? (p056h1.i) prefetchStrategy : null;
                if (iVar != null) {
                    a0.e(iVar, i0VarI.j(), c1296a);
                }
                return i0VarI;
            } catch (Throwable th4) {
                companion.l(lVarD, lVarE, lVarG);
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0162  */
    /* JADX WARN: Code duplicated, block: B:119:0x0168  */
    /* JADX WARN: Code duplicated, block: B:127:0x0184  */
    /* JADX WARN: Code duplicated, block: B:130:0x018d  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b0 A[PHI: r4 r7 r8 r9 r11
      0x01b0: PHI (r4v19 int) = (r4v11 int), (r4v22 int) binds: [B:154:0x01d8, B:138:0x01a8] A[DONT_GENERATE, DONT_INLINE]
      0x01b0: PHI (r7v11 int) = (r7v5 int), (r7v12 int) binds: [B:154:0x01d8, B:138:0x01a8] A[DONT_GENERATE, DONT_INLINE]
      0x01b0: PHI (r8v7 f3.c$b) = (r8v2 f3.c$b), (r8v8 f3.c$b) binds: [B:154:0x01d8, B:138:0x01a8] A[DONT_GENERATE, DONT_INLINE]
      0x01b0: PHI (r9v9 f3.c$c) = (r9v4 f3.c$c), (r9v10 f3.c$c) binds: [B:154:0x01d8, B:138:0x01a8] A[DONT_GENERATE, DONT_INLINE]
      0x01b0: PHI (r11v12 d1.i$n) = (r11v7 d1.i$n), (r11v13 d1.i$n) binds: [B:154:0x01d8, B:138:0x01a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:140:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:143:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:155:0x01da  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:161:0x0213  */
    /* JADX WARN: Code duplicated, block: B:164:0x023a  */
    /* JADX WARN: Code duplicated, block: B:167:0x0283  */
    /* JADX WARN: Code duplicated, block: B:169:0x0287  */
    /* JADX WARN: Code duplicated, block: B:171:0x028c  */
    /* JADX WARN: Code duplicated, block: B:173:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:176:0x031b  */
    /* JADX WARN: Code duplicated, block: B:178:0x0328  */
    /* JADX WARN: Code duplicated, block: B:181:0x033a  */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:130:0x018d, please report this as an issue */
    public static final void b(final f3.m mVar, final y0 y0Var, final d3 d3Var, final boolean z15, final boolean z16, final p143z0.e1 e1Var, final boolean z17, final g2 g2Var, int i15, f3.c.b bVar, d1.i.n nVar, f3.c.InterfaceC1317c interfaceC1317c, d1.i.e eVar, final er.l<? super q0, oq.i0> lVar, p076m2.r rVar, final int i16, final int i17, final int i18) {
        int i19;
        d3 d3Var2;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z18;
        final f3.c.b bVar2;
        final d1.i.n nVar2;
        final d1.i.e eVar2;
        final int i29;
        final f3.c.InterfaceC1317c interfaceC1317c2;
        d5 d5VarM;
        int iA;
        f3.c.b bVar3;
        d1.i.n nVar3;
        f3.c.InterfaceC1317c interfaceC1317c3;
        f3.c.b bVar4;
        d1.i.n nVar4;
        f3.c.InterfaceC1317c interfaceC1317c4;
        int i35;
        int i36;
        d1.i.e eVar3;
        int i37;
        Object objE;
        int i38;
        int i39;
        p143z0.a2 a2Var;
        p143z0.a2 a2Var2;
        f3.m mVarB;
        p076m2.r rVarH = rVar.h(924924659);
        if ((i16 & 6) == 0) {
            i19 = (rVarH.W(mVar) ? 4 : 2) | i16;
        } else {
            i19 = i16;
        }
        if ((i16 & 48) == 0) {
            i19 |= rVarH.W(y0Var) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            d3Var2 = d3Var;
            i19 |= rVarH.W(d3Var2) ? 256 : 128;
        } else {
            d3Var2 = d3Var;
        }
        if ((i16 & 3072) == 0) {
            i19 |= rVarH.a(z15) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            i19 |= rVarH.a(z16) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i16) == 0) {
            i19 |= rVarH.W(e1Var) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((i16 & 1572864) == 0) {
            i19 |= rVarH.a(z17) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i16 & 12582912) == 0) {
            i19 |= rVarH.W(g2Var) ? 8388608 : 4194304;
        }
        if ((i16 & 100663296) == 0) {
            if ((i18 & 256) == 0) {
                i25 = i15;
                int i45 = rVarH.c(i25) ? 67108864 : 33554432;
                i19 |= i45;
            } else {
                i25 = i15;
            }
            i19 |= i45;
        } else {
            i25 = i15;
        }
        int i46 = i18 & 512;
        if (i46 != 0) {
            i19 |= 805306368;
        } else if ((i16 & 805306368) == 0) {
            i19 |= rVarH.W(bVar) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i47 = i18 & 1024;
        if (i47 != 0) {
            i26 = i17 | 6;
        } else if ((i17 & 6) == 0) {
            i26 = i17 | (rVarH.W(nVar) ? 4 : 2);
        } else {
            i26 = i17;
        }
        int i48 = i18 & 2048;
        if (i48 != 0) {
            i26 |= 48;
        } else if ((i17 & 48) == 0) {
            i26 |= rVarH.W(interfaceC1317c) ? 32 : 16;
        }
        int i49 = i26;
        int i55 = i18 & PKIFailureInfo.certConfirmed;
        if (i55 == 0) {
            i27 = i49;
            if ((i17 & MLKEMEngine.KyberPolyBytes) == 0) {
                i27 |= rVarH.W(eVar) ? 256 : 128;
            }
            if ((i17 & 3072) == 0) {
                i27 |= rVarH.G(lVar) ? 2048 : 1024;
            }
            i28 = i27;
            if ((i19 & 306783379) == 306783378 || (i28 & 1171) != 1170) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (rVarH.r(z18, i19 & 1)) {
                rVarH.I();
                if ((i16 & 1) != 0 || rVarH.Q()) {
                    if ((i18 & 256) != 0) {
                        iA = c1.a(rVarH, 0);
                        i19 &= -234881025;
                    } else {
                        iA = i25;
                    }
                    if (i46 != 0) {
                        bVar3 = null;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i47 != 0) {
                        nVar3 = null;
                    } else {
                        nVar3 = nVar;
                    }
                    if (i48 != 0) {
                        interfaceC1317c3 = null;
                    } else {
                        interfaceC1317c3 = interfaceC1317c;
                    }
                    bVar4 = bVar3;
                    nVar4 = nVar3;
                    interfaceC1317c4 = interfaceC1317c3;
                    i35 = iA;
                    i36 = i19;
                    if (i55 != 0) {
                        eVar3 = null;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(924924659, i36, i28, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:85)");
                    }
                    i37 = (i36 >> 3) & 14;
                    er.a<r> aVarC = x.c(y0Var, lVar, rVarH, i37 | ((i28 >> 6) & 112));
                    int i56 = i36 >> 9;
                    t1 t1VarA = t0.a(y0Var, z16, rVarH, i37 | (i56 & 112));
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE);
                    }
                    int i57 = (65520 & i36) | (i56 & 458752) | (i56 & 3670016);
                    int i58 = i28 << 18;
                    int i59 = i57 | (i58 & 29360128) | (i58 & 234881024) | ((i28 << 27) & 1879048192);
                    i38 = i36;
                    p056h1.y0 y0VarF = f(aVarC, y0Var, d3Var2, z15, z16, i35, bVar4, interfaceC1317c4, eVar3, nVar4, (ju.p0) objE, (x1) rVarH.N(g1.i()), ((Boolean) rVarH.N(g1.q())).booleanValue() ? null : e3.INSTANCE.a(), rVarH, i59, 0);
                    i39 = i35;
                    f3.c.b bVar5 = bVar4;
                    f3.c.InterfaceC1317c interfaceC1317c5 = interfaceC1317c4;
                    d1.i.e eVar4 = eVar3;
                    d1.i.n nVar5 = nVar4;
                    if (z16) {
                        a2Var = p143z0.a2.Vertical;
                    } else {
                        a2Var = p143z0.a2.Horizontal;
                    }
                    a2Var2 = a2Var;
                    if (z17) {
                        rVarH.X(-2077147368);
                        mVarB = p056h1.t.b(f3.m.INSTANCE, i.a(y0Var, i39, rVarH, i37 | ((i38 >> 21) & 112)), y0Var.getBeyondBoundsInfo(), z15, a2Var2);
                        rVarH.R();
                    } else {
                        rVarH.X(-2076718545);
                        rVarH.R();
                        mVarB = f3.m.INSTANCE;
                    }
                    p056h1.Function0.f(aVarC, h3.c(u1.c(mVar.u(y0Var.getRemeasurementModifier()).u(y0Var.getAwaitLayoutModifier()), aVarC, t1VarA, a2Var2, z17, z15, rVarH, ((i38 >> 6) & 57344) | ((i38 << 6) & 458752)).u(mVarB).u(y0Var.B().getModifier()), y0Var, a2Var2, g2Var, z17, z15, e1Var, y0Var.getInternalInteractionSource(), null, 128, null), y0Var.getPrefetchState(), y0VarF, rVarH, 0, 0);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    i29 = i39;
                    bVar2 = bVar5;
                    interfaceC1317c2 = interfaceC1317c5;
                    eVar2 = eVar4;
                    nVar2 = nVar5;
                } else {
                    rVarH.O();
                    if ((i18 & 256) != 0) {
                        i19 &= -234881025;
                    }
                    bVar4 = bVar;
                    nVar4 = nVar;
                    interfaceC1317c4 = interfaceC1317c;
                    i36 = i19;
                    i35 = i25;
                }
                eVar3 = eVar;
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(924924659, i36, i28, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:85)");
                }
                i37 = (i36 >> 3) & 14;
                er.a<r> aVarC2 = x.c(y0Var, lVar, rVarH, i37 | ((i28 >> 6) & 112));
                int i510 = i36 >> 9;
                t1 t1VarA2 = t0.a(y0Var, z16, rVarH, i37 | (i510 & 112));
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = Function0.i(tq.j.f191408a, rVarH);
                    rVarH.v(objE);
                }
                int i511 = (65520 & i36) | (i510 & 458752) | (i510 & 3670016);
                int i512 = i28 << 18;
                int i513 = i511 | (i512 & 29360128) | (i512 & 234881024) | ((i28 << 27) & 1879048192);
                i38 = i36;
                p056h1.y0 y0VarF2 = f(aVarC2, y0Var, d3Var2, z15, z16, i35, bVar4, interfaceC1317c4, eVar3, nVar4, (ju.p0) objE, (x1) rVarH.N(g1.i()), ((Boolean) rVarH.N(g1.q())).booleanValue() ? null : e3.INSTANCE.a(), rVarH, i513, 0);
                i39 = i35;
                f3.c.b bVar6 = bVar4;
                f3.c.InterfaceC1317c interfaceC1317c6 = interfaceC1317c4;
                d1.i.e eVar5 = eVar3;
                d1.i.n nVar6 = nVar4;
                if (z16) {
                    a2Var = p143z0.a2.Vertical;
                } else {
                    a2Var = p143z0.a2.Horizontal;
                }
                a2Var2 = a2Var;
                if (z17) {
                    rVarH.X(-2077147368);
                    mVarB = p056h1.t.b(f3.m.INSTANCE, i.a(y0Var, i39, rVarH, i37 | ((i38 >> 21) & 112)), y0Var.getBeyondBoundsInfo(), z15, a2Var2);
                    rVarH.R();
                } else {
                    rVarH.X(-2076718545);
                    rVarH.R();
                    mVarB = f3.m.INSTANCE;
                }
                p056h1.Function0.f(aVarC2, h3.c(u1.c(mVar.u(y0Var.getRemeasurementModifier()).u(y0Var.getAwaitLayoutModifier()), aVarC2, t1VarA2, a2Var2, z17, z15, rVarH, ((i38 >> 6) & 57344) | ((i38 << 6) & 458752)).u(mVarB).u(y0Var.B().getModifier()), y0Var, a2Var2, g2Var, z17, z15, e1Var, y0Var.getInternalInteractionSource(), null, 128, null), y0Var.getPrefetchState(), y0VarF2, rVarH, 0, 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                i29 = i39;
                bVar2 = bVar6;
                interfaceC1317c2 = interfaceC1317c6;
                eVar2 = eVar5;
                nVar2 = nVar6;
            } else {
                rVarH.O();
                bVar2 = bVar;
                nVar2 = nVar;
                eVar2 = eVar;
                i29 = i25;
                interfaceC1317c2 = interfaceC1317c;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: f1.y
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return a0.c(mVar, y0Var, d3Var, z15, z16, e1Var, z17, g2Var, i29, bVar2, nVar2, interfaceC1317c2, eVar2, lVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i27 = i49 | MLKEMEngine.KyberPolyBytes;
        if ((i17 & 3072) == 0) {
            i27 |= rVarH.G(lVar) ? 2048 : 1024;
        }
        i28 = i27;
        if ((i19 & 306783379) == 306783378) {
            z18 = true;
        } else {
            z18 = true;
        }
        if (rVarH.r(z18, i19 & 1)) {
            rVarH.I();
            if ((i16 & 1) != 0) {
                if ((i18 & 256) != 0) {
                    iA = c1.a(rVarH, 0);
                    i19 &= -234881025;
                } else {
                    iA = i25;
                }
                if (i46 != 0) {
                    bVar3 = null;
                } else {
                    bVar3 = bVar;
                }
                if (i47 != 0) {
                    nVar3 = null;
                } else {
                    nVar3 = nVar;
                }
                if (i48 != 0) {
                    interfaceC1317c3 = null;
                } else {
                    interfaceC1317c3 = interfaceC1317c;
                }
                bVar4 = bVar3;
                nVar4 = nVar3;
                interfaceC1317c4 = interfaceC1317c3;
                i35 = iA;
                i36 = i19;
                if (i55 != 0) {
                    eVar3 = null;
                } else {
                    eVar3 = eVar;
                }
            } else {
                if ((i18 & 256) != 0) {
                    iA = c1.a(rVarH, 0);
                    i19 &= -234881025;
                } else {
                    iA = i25;
                }
                if (i46 != 0) {
                    bVar3 = null;
                } else {
                    bVar3 = bVar;
                }
                if (i47 != 0) {
                    nVar3 = null;
                } else {
                    nVar3 = nVar;
                }
                if (i48 != 0) {
                    interfaceC1317c3 = null;
                } else {
                    interfaceC1317c3 = interfaceC1317c;
                }
                bVar4 = bVar3;
                nVar4 = nVar3;
                interfaceC1317c4 = interfaceC1317c3;
                i35 = iA;
                i36 = i19;
                if (i55 != 0) {
                    eVar3 = null;
                } else {
                    eVar3 = eVar;
                }
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(924924659, i36, i28, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:85)");
            }
            i37 = (i36 >> 3) & 14;
            er.a<r> aVarC3 = x.c(y0Var, lVar, rVarH, i37 | ((i28 >> 6) & 112));
            int i514 = i36 >> 9;
            t1 t1VarA3 = t0.a(y0Var, z16, rVarH, i37 | (i514 & 112));
            objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = Function0.i(tq.j.f191408a, rVarH);
                rVarH.v(objE);
            }
            int i515 = (65520 & i36) | (i514 & 458752) | (i514 & 3670016);
            int i516 = i28 << 18;
            int i517 = i515 | (i516 & 29360128) | (i516 & 234881024) | ((i28 << 27) & 1879048192);
            i38 = i36;
            p056h1.y0 y0VarF3 = f(aVarC3, y0Var, d3Var2, z15, z16, i35, bVar4, interfaceC1317c4, eVar3, nVar4, (ju.p0) objE, (x1) rVarH.N(g1.i()), ((Boolean) rVarH.N(g1.q())).booleanValue() ? null : e3.INSTANCE.a(), rVarH, i517, 0);
            i39 = i35;
            f3.c.b bVar7 = bVar4;
            f3.c.InterfaceC1317c interfaceC1317c7 = interfaceC1317c4;
            d1.i.e eVar6 = eVar3;
            d1.i.n nVar7 = nVar4;
            if (z16) {
                a2Var = p143z0.a2.Vertical;
            } else {
                a2Var = p143z0.a2.Horizontal;
            }
            a2Var2 = a2Var;
            if (z17) {
                rVarH.X(-2077147368);
                mVarB = p056h1.t.b(f3.m.INSTANCE, i.a(y0Var, i39, rVarH, i37 | ((i38 >> 21) & 112)), y0Var.getBeyondBoundsInfo(), z15, a2Var2);
                rVarH.R();
            } else {
                rVarH.X(-2076718545);
                rVarH.R();
                mVarB = f3.m.INSTANCE;
            }
            p056h1.Function0.f(aVarC3, h3.c(u1.c(mVar.u(y0Var.getRemeasurementModifier()).u(y0Var.getAwaitLayoutModifier()), aVarC3, t1VarA3, a2Var2, z17, z15, rVarH, ((i38 >> 6) & 57344) | ((i38 << 6) & 458752)).u(mVarB).u(y0Var.B().getModifier()), y0Var, a2Var2, g2Var, z17, z15, e1Var, y0Var.getInternalInteractionSource(), null, 128, null), y0Var.getPrefetchState(), y0VarF3, rVarH, 0, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            i29 = i39;
            bVar2 = bVar7;
            interfaceC1317c2 = interfaceC1317c7;
            eVar2 = eVar6;
            nVar2 = nVar7;
        } else {
            rVarH.O();
            bVar2 = bVar;
            nVar2 = nVar;
            eVar2 = eVar;
            i29 = i25;
            interfaceC1317c2 = interfaceC1317c;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: f1.y
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return a0.c(mVar, y0Var, d3Var, z15, z16, e1Var, z17, g2Var, i29, bVar2, nVar2, interfaceC1317c2, eVar2, lVar, i16, i17, i18, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(f3.m mVar, y0 y0Var, d3 d3Var, boolean z15, boolean z16, p143z0.e1 e1Var, boolean z17, g2 g2Var, int i15, f3.c.b bVar, d1.i.n nVar, f3.c.InterfaceC1317c interfaceC1317c, d1.i.e eVar, er.l lVar, int i16, int i17, int i18, p076m2.r rVar, int i19) {
        b(mVar, y0Var, d3Var, z15, z16, e1Var, z17, g2Var, i15, bVar, nVar, interfaceC1317c, eVar, lVar, rVar, g4.a(i16 | 1), g4.a(i17), i18);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(p056h1.i iVar, List<j0> list, k0 k0Var) {
        Trace.beginSection("compose:lazy:cache_window:keepAroundItems");
        try {
            if (iVar.n() && !list.isEmpty()) {
                int index = ((j0) pq.v.l0(list)).getIndex();
                int index2 = ((j0) pq.v.x0(list)).getIndex();
                for (int prefetchWindowStartLine = iVar.getPrefetchWindowStartLine(); prefetchWindowStartLine < index; prefetchWindowStartLine++) {
                    k0Var.j(prefetchWindowStartLine);
                }
                int i15 = index2 + 1;
                int prefetchWindowEndLine = iVar.getPrefetchWindowEndLine();
                if (i15 <= prefetchWindowEndLine) {
                    while (true) {
                        k0Var.j(i15);
                        if (i15 == prefetchWindowEndLine) {
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

    /* JADX WARN: Code duplicated, block: B:101:0x0133  */
    /* JADX WARN: Code duplicated, block: B:104:0x0153  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074 A[PHI: r4
      0x0074: PHI (r4v17 boolean) = (r4v15 boolean), (r4v18 boolean) binds: [B:36:0x0072, B:32:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x009c  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00aa A[PHI: r9
      0x00aa: PHI (r9v17 f3.c$b) = (r9v14 f3.c$b), (r9v18 f3.c$b) binds: [B:54:0x00a8, B:50:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c6 A[PHI: r12
      0x00c6: PHI (r12v13 f3.c$c) = (r12v10 f3.c$c), (r12v14 f3.c$c) binds: [B:64:0x00c4, B:60:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e2 A[PHI: r13
      0x00e2: PHI (r13v13 d1.i$e) = (r13v10 d1.i$e), (r13v14 d1.i$e) binds: [B:74:0x00e0, B:70:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fe A[PHI: r5
      0x00fe: PHI (r5v9 d1.i$n) = (r5v7 d1.i$n), (r5v10 d1.i$n) binds: [B:84:0x00fc, B:80:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0100  */
    /* JADX WARN: Code duplicated, block: B:89:0x010f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0118  */
    /* JADX WARN: Code duplicated, block: B:95:0x011e A[PHI: r6
      0x011e: PHI (r6v7 h1.e3) = (r6v5 h1.e3), (r6v8 h1.e3) binds: [B:94:0x011c, B:90:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x0121  */
    /* JADX WARN: Code duplicated, block: B:99:0x012b  */
    private static final p056h1.y0 f(er.a<? extends r> aVar, y0 y0Var, d3 d3Var, boolean z15, boolean z16, int i15, f3.c.b bVar, f3.c.InterfaceC1317c interfaceC1317c, d1.i.e eVar, d1.i.n nVar, ju.p0 p0Var, x1 x1Var, e3 e3Var, p076m2.r rVar, int i16, int i17) {
        boolean z17;
        boolean z18;
        f3.c.b bVar2;
        boolean z19;
        f3.c.InterfaceC1317c interfaceC1317c2;
        boolean z25;
        d1.i.e eVar2;
        boolean z26;
        d1.i.n nVar2;
        boolean z27;
        e3 e3Var2;
        boolean z28;
        boolean z29;
        Object objE;
        if (p076m2.t.k()) {
            p076m2.t.o(406165748, i16, i17, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:187)");
        }
        boolean z35 = ((((i16 & 112) ^ 48) > 32 && rVar.W(y0Var)) || (i16 & 48) == 32) | ((((i16 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && rVar.W(d3Var)) || (i16 & MLKEMEngine.KyberPolyBytes) == 256) | ((((i16 & 7168) ^ 3072) > 2048 && rVar.a(z15)) || (i16 & 3072) == 2048);
        if (((57344 & i16) ^ 24576) > 16384) {
            z17 = z16;
            if (rVar.a(z17)) {
                z18 = true;
            }
            boolean z36 = z35 | z18 | ((((458752 & i16) ^ 196608) <= 131072 && rVar.c(i15)) || (i16 & 196608) == 131072);
            if (((3670016 & i16) ^ 1572864) > 1048576) {
                bVar2 = bVar;
                if (!rVar.W(bVar2)) {
                    z19 = true;
                }
                boolean z37 = z36 | z19;
                if (((29360128 & i16) ^ 12582912) > 8388608) {
                    interfaceC1317c2 = interfaceC1317c;
                    if (!rVar.W(interfaceC1317c2)) {
                        z25 = true;
                    }
                    boolean z38 = z37 | z25;
                    if (((234881024 & i16) ^ 100663296) > 67108864) {
                        eVar2 = eVar;
                        if (!rVar.W(eVar2)) {
                            z26 = true;
                        }
                        boolean z39 = z38 | z26;
                        if (((1879048192 & i16) ^ 805306368) > 536870912) {
                            nVar2 = nVar;
                            if (!rVar.W(nVar2)) {
                                z27 = true;
                            }
                            boolean zW = z27 | z39 | rVar.W(x1Var);
                            if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                                e3Var2 = e3Var;
                                if (!rVar.W(e3Var2)) {
                                    z28 = true;
                                }
                                z29 = zW | z28;
                                objE = rVar.E();
                                if (z29 || objE == p076m2.r.INSTANCE.a()) {
                                    a aVar2 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                                    rVar.v(aVar2);
                                    objE = aVar2;
                                }
                                p056h1.y0 y0Var2 = (p056h1.y0) objE;
                                if (p076m2.t.k()) {
                                    p076m2.t.n();
                                }
                                return y0Var2;
                            }
                            e3Var2 = e3Var;
                            if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            z29 = zW | z28;
                            objE = rVar.E();
                            if (z29) {
                                a aVar3 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                                rVar.v(aVar3);
                                objE = aVar3;
                            } else {
                                a aVar4 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                                rVar.v(aVar4);
                                objE = aVar4;
                            }
                            p056h1.y0 y0Var3 = (p056h1.y0) objE;
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            return y0Var3;
                        }
                        nVar2 = nVar;
                        if ((i16 & 805306368) == 536870912) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        boolean zW2 = z27 | z39 | rVar.W(x1Var);
                        if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                            e3Var2 = e3Var;
                            if (!rVar.W(e3Var2)) {
                                z28 = true;
                            }
                            z29 = zW2 | z28;
                            objE = rVar.E();
                            if (z29) {
                                a aVar5 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                                rVar.v(aVar5);
                                objE = aVar5;
                            } else {
                                a aVar6 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                                rVar.v(aVar6);
                                objE = aVar6;
                            }
                            p056h1.y0 y0Var4 = (p056h1.y0) objE;
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            return y0Var4;
                        }
                        e3Var2 = e3Var;
                        if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        z29 = zW2 | z28;
                        objE = rVar.E();
                        if (z29) {
                            a aVar7 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar7);
                            objE = aVar7;
                        } else {
                            a aVar8 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar8);
                            objE = aVar8;
                        }
                        p056h1.y0 y0Var5 = (p056h1.y0) objE;
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        return y0Var5;
                    }
                    eVar2 = eVar;
                    if ((100663296 & i16) == 67108864) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean z310 = z38 | z26;
                    if (((1879048192 & i16) ^ 805306368) > 536870912) {
                        nVar2 = nVar;
                        if (!rVar.W(nVar2)) {
                            z27 = true;
                        }
                        boolean zW3 = z27 | z310 | rVar.W(x1Var);
                        if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                            e3Var2 = e3Var;
                            if (!rVar.W(e3Var2)) {
                                z28 = true;
                            }
                            z29 = zW3 | z28;
                            objE = rVar.E();
                            if (z29) {
                                a aVar9 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                                rVar.v(aVar9);
                                objE = aVar9;
                            } else {
                                a aVar10 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                                rVar.v(aVar10);
                                objE = aVar10;
                            }
                            p056h1.y0 y0Var6 = (p056h1.y0) objE;
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            return y0Var6;
                        }
                        e3Var2 = e3Var;
                        if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        z29 = zW3 | z28;
                        objE = rVar.E();
                        if (z29) {
                            a aVar11 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar11);
                            objE = aVar11;
                        } else {
                            a aVar12 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar12);
                            objE = aVar12;
                        }
                        p056h1.y0 y0Var7 = (p056h1.y0) objE;
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        return y0Var7;
                    }
                    nVar2 = nVar;
                    if ((i16 & 805306368) == 536870912) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    boolean zW4 = z27 | z310 | rVar.W(x1Var);
                    if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                        e3Var2 = e3Var;
                        if (!rVar.W(e3Var2)) {
                            z28 = true;
                        }
                        z29 = zW4 | z28;
                        objE = rVar.E();
                        if (z29) {
                            a aVar13 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar13);
                            objE = aVar13;
                        } else {
                            a aVar14 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar14);
                            objE = aVar14;
                        }
                        p056h1.y0 y0Var8 = (p056h1.y0) objE;
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        return y0Var8;
                    }
                    e3Var2 = e3Var;
                    if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = zW4 | z28;
                    objE = rVar.E();
                    if (z29) {
                        a aVar15 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar15);
                        objE = aVar15;
                    } else {
                        a aVar16 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar16);
                        objE = aVar16;
                    }
                    p056h1.y0 y0Var9 = (p056h1.y0) objE;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return y0Var9;
                }
                interfaceC1317c2 = interfaceC1317c;
                if ((12582912 & i16) == 8388608) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z311 = z37 | z25;
                if (((234881024 & i16) ^ 100663296) > 67108864) {
                    eVar2 = eVar;
                    if (!rVar.W(eVar2)) {
                        z26 = true;
                    }
                    boolean z312 = z311 | z26;
                    if (((1879048192 & i16) ^ 805306368) > 536870912) {
                        nVar2 = nVar;
                        if (!rVar.W(nVar2)) {
                            z27 = true;
                        }
                        boolean zW5 = z27 | z312 | rVar.W(x1Var);
                        if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                            e3Var2 = e3Var;
                            if (!rVar.W(e3Var2)) {
                                z28 = true;
                            }
                            z29 = zW5 | z28;
                            objE = rVar.E();
                            if (z29) {
                                a aVar17 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                                rVar.v(aVar17);
                                objE = aVar17;
                            } else {
                                a aVar18 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                                rVar.v(aVar18);
                                objE = aVar18;
                            }
                            p056h1.y0 y0Var10 = (p056h1.y0) objE;
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            return y0Var10;
                        }
                        e3Var2 = e3Var;
                        if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        z29 = zW5 | z28;
                        objE = rVar.E();
                        if (z29) {
                            a aVar19 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar19);
                            objE = aVar19;
                        } else {
                            a aVar110 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar110);
                            objE = aVar110;
                        }
                        p056h1.y0 y0Var11 = (p056h1.y0) objE;
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        return y0Var11;
                    }
                    nVar2 = nVar;
                    if ((i16 & 805306368) == 536870912) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    boolean zW6 = z27 | z312 | rVar.W(x1Var);
                    if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                        e3Var2 = e3Var;
                        if (!rVar.W(e3Var2)) {
                            z28 = true;
                        }
                        z29 = zW6 | z28;
                        objE = rVar.E();
                        if (z29) {
                            a aVar111 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar111);
                            objE = aVar111;
                        } else {
                            a aVar112 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar112);
                            objE = aVar112;
                        }
                        p056h1.y0 y0Var12 = (p056h1.y0) objE;
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        return y0Var12;
                    }
                    e3Var2 = e3Var;
                    if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = zW6 | z28;
                    objE = rVar.E();
                    if (z29) {
                        a aVar113 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar113);
                        objE = aVar113;
                    } else {
                        a aVar114 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar114);
                        objE = aVar114;
                    }
                    p056h1.y0 y0Var13 = (p056h1.y0) objE;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return y0Var13;
                }
                eVar2 = eVar;
                if ((100663296 & i16) == 67108864) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z313 = z311 | z26;
                if (((1879048192 & i16) ^ 805306368) > 536870912) {
                    nVar2 = nVar;
                    if (!rVar.W(nVar2)) {
                        z27 = true;
                    }
                    boolean zW7 = z27 | z313 | rVar.W(x1Var);
                    if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                        e3Var2 = e3Var;
                        if (!rVar.W(e3Var2)) {
                            z28 = true;
                        }
                        z29 = zW7 | z28;
                        objE = rVar.E();
                        if (z29) {
                            a aVar115 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar115);
                            objE = aVar115;
                        } else {
                            a aVar116 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar116);
                            objE = aVar116;
                        }
                        p056h1.y0 y0Var14 = (p056h1.y0) objE;
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        return y0Var14;
                    }
                    e3Var2 = e3Var;
                    if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = zW7 | z28;
                    objE = rVar.E();
                    if (z29) {
                        a aVar117 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar117);
                        objE = aVar117;
                    } else {
                        a aVar118 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar118);
                        objE = aVar118;
                    }
                    p056h1.y0 y0Var15 = (p056h1.y0) objE;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return y0Var15;
                }
                nVar2 = nVar;
                if ((i16 & 805306368) == 536870912) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean zW8 = z27 | z313 | rVar.W(x1Var);
                if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                    e3Var2 = e3Var;
                    if (!rVar.W(e3Var2)) {
                        z28 = true;
                    }
                    z29 = zW8 | z28;
                    objE = rVar.E();
                    if (z29) {
                        a aVar119 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar119);
                        objE = aVar119;
                    } else {
                        a aVar1110 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar1110);
                        objE = aVar1110;
                    }
                    p056h1.y0 y0Var16 = (p056h1.y0) objE;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return y0Var16;
                }
                e3Var2 = e3Var;
                if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = zW8 | z28;
                objE = rVar.E();
                if (z29) {
                    a aVar1111 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar1111);
                    objE = aVar1111;
                } else {
                    a aVar1112 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar1112);
                    objE = aVar1112;
                }
                p056h1.y0 y0Var17 = (p056h1.y0) objE;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                return y0Var17;
            }
            bVar2 = bVar;
            if ((1572864 & i16) == 1048576) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean z314 = z36 | z19;
            if (((29360128 & i16) ^ 12582912) > 8388608) {
                interfaceC1317c2 = interfaceC1317c;
                if (!rVar.W(interfaceC1317c2)) {
                    z25 = true;
                }
                boolean z315 = z314 | z25;
                if (((234881024 & i16) ^ 100663296) > 67108864) {
                    eVar2 = eVar;
                    if (!rVar.W(eVar2)) {
                        z26 = true;
                    }
                    boolean z316 = z315 | z26;
                    if (((1879048192 & i16) ^ 805306368) > 536870912) {
                        nVar2 = nVar;
                        if (!rVar.W(nVar2)) {
                            z27 = true;
                        }
                        boolean zW9 = z27 | z316 | rVar.W(x1Var);
                        if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                            e3Var2 = e3Var;
                            if (!rVar.W(e3Var2)) {
                                z28 = true;
                            }
                            z29 = zW9 | z28;
                            objE = rVar.E();
                            if (z29) {
                                a aVar1113 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                                rVar.v(aVar1113);
                                objE = aVar1113;
                            } else {
                                a aVar1114 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                                rVar.v(aVar1114);
                                objE = aVar1114;
                            }
                            p056h1.y0 y0Var18 = (p056h1.y0) objE;
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            return y0Var18;
                        }
                        e3Var2 = e3Var;
                        if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        z29 = zW9 | z28;
                        objE = rVar.E();
                        if (z29) {
                            a aVar1115 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar1115);
                            objE = aVar1115;
                        } else {
                            a aVar1116 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar1116);
                            objE = aVar1116;
                        }
                        p056h1.y0 y0Var19 = (p056h1.y0) objE;
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        return y0Var19;
                    }
                    nVar2 = nVar;
                    if ((i16 & 805306368) == 536870912) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    boolean zW10 = z27 | z316 | rVar.W(x1Var);
                    if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                        e3Var2 = e3Var;
                        if (!rVar.W(e3Var2)) {
                            z28 = true;
                        }
                        z29 = zW10 | z28;
                        objE = rVar.E();
                        if (z29) {
                            a aVar1117 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar1117);
                            objE = aVar1117;
                        } else {
                            a aVar1118 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar1118);
                            objE = aVar1118;
                        }
                        p056h1.y0 y0Var110 = (p056h1.y0) objE;
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        return y0Var110;
                    }
                    e3Var2 = e3Var;
                    if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = zW10 | z28;
                    objE = rVar.E();
                    if (z29) {
                        a aVar1119 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar1119);
                        objE = aVar1119;
                    } else {
                        a aVar11110 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar11110);
                        objE = aVar11110;
                    }
                    p056h1.y0 y0Var111 = (p056h1.y0) objE;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return y0Var111;
                }
                eVar2 = eVar;
                if ((100663296 & i16) == 67108864) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z317 = z315 | z26;
                if (((1879048192 & i16) ^ 805306368) > 536870912) {
                    nVar2 = nVar;
                    if (!rVar.W(nVar2)) {
                        z27 = true;
                    }
                    boolean zW11 = z27 | z317 | rVar.W(x1Var);
                    if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                        e3Var2 = e3Var;
                        if (!rVar.W(e3Var2)) {
                            z28 = true;
                        }
                        z29 = zW11 | z28;
                        objE = rVar.E();
                        if (z29) {
                            a aVar11111 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar11111);
                            objE = aVar11111;
                        } else {
                            a aVar11112 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar11112);
                            objE = aVar11112;
                        }
                        p056h1.y0 y0Var112 = (p056h1.y0) objE;
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        return y0Var112;
                    }
                    e3Var2 = e3Var;
                    if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = zW11 | z28;
                    objE = rVar.E();
                    if (z29) {
                        a aVar11113 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar11113);
                        objE = aVar11113;
                    } else {
                        a aVar11114 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar11114);
                        objE = aVar11114;
                    }
                    p056h1.y0 y0Var113 = (p056h1.y0) objE;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return y0Var113;
                }
                nVar2 = nVar;
                if ((i16 & 805306368) == 536870912) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean zW12 = z27 | z317 | rVar.W(x1Var);
                if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                    e3Var2 = e3Var;
                    if (!rVar.W(e3Var2)) {
                        z28 = true;
                    }
                    z29 = zW12 | z28;
                    objE = rVar.E();
                    if (z29) {
                        a aVar11115 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar11115);
                        objE = aVar11115;
                    } else {
                        a aVar11116 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar11116);
                        objE = aVar11116;
                    }
                    p056h1.y0 y0Var114 = (p056h1.y0) objE;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return y0Var114;
                }
                e3Var2 = e3Var;
                if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = zW12 | z28;
                objE = rVar.E();
                if (z29) {
                    a aVar11117 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar11117);
                    objE = aVar11117;
                } else {
                    a aVar11118 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar11118);
                    objE = aVar11118;
                }
                p056h1.y0 y0Var115 = (p056h1.y0) objE;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                return y0Var115;
            }
            interfaceC1317c2 = interfaceC1317c;
            if ((12582912 & i16) == 8388608) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z318 = z314 | z25;
            if (((234881024 & i16) ^ 100663296) > 67108864) {
                eVar2 = eVar;
                if (!rVar.W(eVar2)) {
                    z26 = true;
                }
                boolean z319 = z318 | z26;
                if (((1879048192 & i16) ^ 805306368) > 536870912) {
                    nVar2 = nVar;
                    if (!rVar.W(nVar2)) {
                        z27 = true;
                    }
                    boolean zW13 = z27 | z319 | rVar.W(x1Var);
                    if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                        e3Var2 = e3Var;
                        if (!rVar.W(e3Var2)) {
                            z28 = true;
                        }
                        z29 = zW13 | z28;
                        objE = rVar.E();
                        if (z29) {
                            a aVar11119 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar11119);
                            objE = aVar11119;
                        } else {
                            a aVar111110 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar111110);
                            objE = aVar111110;
                        }
                        p056h1.y0 y0Var116 = (p056h1.y0) objE;
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        return y0Var116;
                    }
                    e3Var2 = e3Var;
                    if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = zW13 | z28;
                    objE = rVar.E();
                    if (z29) {
                        a aVar111111 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar111111);
                        objE = aVar111111;
                    } else {
                        a aVar111112 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar111112);
                        objE = aVar111112;
                    }
                    p056h1.y0 y0Var117 = (p056h1.y0) objE;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return y0Var117;
                }
                nVar2 = nVar;
                if ((i16 & 805306368) == 536870912) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean zW14 = z27 | z319 | rVar.W(x1Var);
                if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                    e3Var2 = e3Var;
                    if (!rVar.W(e3Var2)) {
                        z28 = true;
                    }
                    z29 = zW14 | z28;
                    objE = rVar.E();
                    if (z29) {
                        a aVar111113 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar111113);
                        objE = aVar111113;
                    } else {
                        a aVar111114 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar111114);
                        objE = aVar111114;
                    }
                    p056h1.y0 y0Var118 = (p056h1.y0) objE;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return y0Var118;
                }
                e3Var2 = e3Var;
                if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = zW14 | z28;
                objE = rVar.E();
                if (z29) {
                    a aVar111115 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar111115);
                    objE = aVar111115;
                } else {
                    a aVar111116 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar111116);
                    objE = aVar111116;
                }
                p056h1.y0 y0Var119 = (p056h1.y0) objE;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                return y0Var119;
            }
            eVar2 = eVar;
            if ((100663296 & i16) == 67108864) {
                z26 = true;
            } else {
                z26 = false;
            }
            boolean z3110 = z318 | z26;
            if (((1879048192 & i16) ^ 805306368) > 536870912) {
                nVar2 = nVar;
                if (!rVar.W(nVar2)) {
                    z27 = true;
                }
                boolean zW15 = z27 | z3110 | rVar.W(x1Var);
                if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                    e3Var2 = e3Var;
                    if (!rVar.W(e3Var2)) {
                        z28 = true;
                    }
                    z29 = zW15 | z28;
                    objE = rVar.E();
                    if (z29) {
                        a aVar111117 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar111117);
                        objE = aVar111117;
                    } else {
                        a aVar111118 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar111118);
                        objE = aVar111118;
                    }
                    p056h1.y0 y0Var1110 = (p056h1.y0) objE;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return y0Var1110;
                }
                e3Var2 = e3Var;
                if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = zW15 | z28;
                objE = rVar.E();
                if (z29) {
                    a aVar111119 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar111119);
                    objE = aVar111119;
                } else {
                    a aVar1111110 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar1111110);
                    objE = aVar1111110;
                }
                p056h1.y0 y0Var1111 = (p056h1.y0) objE;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                return y0Var1111;
            }
            nVar2 = nVar;
            if ((i16 & 805306368) == 536870912) {
                z27 = true;
            } else {
                z27 = false;
            }
            boolean zW16 = z27 | z3110 | rVar.W(x1Var);
            if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                e3Var2 = e3Var;
                if (!rVar.W(e3Var2)) {
                    z28 = true;
                }
                z29 = zW16 | z28;
                objE = rVar.E();
                if (z29) {
                    a aVar1111111 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar1111111);
                    objE = aVar1111111;
                } else {
                    a aVar1111112 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar1111112);
                    objE = aVar1111112;
                }
                p056h1.y0 y0Var1112 = (p056h1.y0) objE;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                return y0Var1112;
            }
            e3Var2 = e3Var;
            if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                z28 = true;
            } else {
                z28 = false;
            }
            z29 = zW16 | z28;
            objE = rVar.E();
            if (z29) {
                a aVar1111113 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                rVar.v(aVar1111113);
                objE = aVar1111113;
            } else {
                a aVar1111114 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                rVar.v(aVar1111114);
                objE = aVar1111114;
            }
            p056h1.y0 y0Var1113 = (p056h1.y0) objE;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            return y0Var1113;
        }
        z17 = z16;
        if ((i16 & 24576) == 16384) {
            z18 = true;
        } else {
            z18 = false;
        }
        boolean z320 = z35 | z18 | ((((458752 & i16) ^ 196608) <= 131072 && rVar.c(i15)) || (i16 & 196608) == 131072);
        if (((3670016 & i16) ^ 1572864) > 1048576) {
            bVar2 = bVar;
            if (!rVar.W(bVar2)) {
                z19 = true;
            }
            boolean z3111 = z320 | z19;
            if (((29360128 & i16) ^ 12582912) > 8388608) {
                interfaceC1317c2 = interfaceC1317c;
                if (!rVar.W(interfaceC1317c2)) {
                    z25 = true;
                }
                boolean z3112 = z3111 | z25;
                if (((234881024 & i16) ^ 100663296) > 67108864) {
                    eVar2 = eVar;
                    if (!rVar.W(eVar2)) {
                        z26 = true;
                    }
                    boolean z3113 = z3112 | z26;
                    if (((1879048192 & i16) ^ 805306368) > 536870912) {
                        nVar2 = nVar;
                        if (!rVar.W(nVar2)) {
                            z27 = true;
                        }
                        boolean zW17 = z27 | z3113 | rVar.W(x1Var);
                        if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                            e3Var2 = e3Var;
                            if (!rVar.W(e3Var2)) {
                                z28 = true;
                            }
                            z29 = zW17 | z28;
                            objE = rVar.E();
                            if (z29) {
                                a aVar1111115 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                                rVar.v(aVar1111115);
                                objE = aVar1111115;
                            } else {
                                a aVar1111116 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                                rVar.v(aVar1111116);
                                objE = aVar1111116;
                            }
                            p056h1.y0 y0Var1114 = (p056h1.y0) objE;
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            return y0Var1114;
                        }
                        e3Var2 = e3Var;
                        if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        z29 = zW17 | z28;
                        objE = rVar.E();
                        if (z29) {
                            a aVar1111117 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar1111117);
                            objE = aVar1111117;
                        } else {
                            a aVar1111118 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar1111118);
                            objE = aVar1111118;
                        }
                        p056h1.y0 y0Var1115 = (p056h1.y0) objE;
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        return y0Var1115;
                    }
                    nVar2 = nVar;
                    if ((i16 & 805306368) == 536870912) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    boolean zW18 = z27 | z3113 | rVar.W(x1Var);
                    if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                        e3Var2 = e3Var;
                        if (!rVar.W(e3Var2)) {
                            z28 = true;
                        }
                        z29 = zW18 | z28;
                        objE = rVar.E();
                        if (z29) {
                            a aVar1111119 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar1111119);
                            objE = aVar1111119;
                        } else {
                            a aVar11111110 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar11111110);
                            objE = aVar11111110;
                        }
                        p056h1.y0 y0Var1116 = (p056h1.y0) objE;
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        return y0Var1116;
                    }
                    e3Var2 = e3Var;
                    if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = zW18 | z28;
                    objE = rVar.E();
                    if (z29) {
                        a aVar11111111 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar11111111);
                        objE = aVar11111111;
                    } else {
                        a aVar11111112 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar11111112);
                        objE = aVar11111112;
                    }
                    p056h1.y0 y0Var1117 = (p056h1.y0) objE;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return y0Var1117;
                }
                eVar2 = eVar;
                if ((100663296 & i16) == 67108864) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z3114 = z3112 | z26;
                if (((1879048192 & i16) ^ 805306368) > 536870912) {
                    nVar2 = nVar;
                    if (!rVar.W(nVar2)) {
                        z27 = true;
                    }
                    boolean zW19 = z27 | z3114 | rVar.W(x1Var);
                    if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                        e3Var2 = e3Var;
                        if (!rVar.W(e3Var2)) {
                            z28 = true;
                        }
                        z29 = zW19 | z28;
                        objE = rVar.E();
                        if (z29) {
                            a aVar11111113 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar11111113);
                            objE = aVar11111113;
                        } else {
                            a aVar11111114 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar11111114);
                            objE = aVar11111114;
                        }
                        p056h1.y0 y0Var1118 = (p056h1.y0) objE;
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        return y0Var1118;
                    }
                    e3Var2 = e3Var;
                    if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = zW19 | z28;
                    objE = rVar.E();
                    if (z29) {
                        a aVar11111115 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar11111115);
                        objE = aVar11111115;
                    } else {
                        a aVar11111116 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar11111116);
                        objE = aVar11111116;
                    }
                    p056h1.y0 y0Var1119 = (p056h1.y0) objE;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return y0Var1119;
                }
                nVar2 = nVar;
                if ((i16 & 805306368) == 536870912) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean zW110 = z27 | z3114 | rVar.W(x1Var);
                if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                    e3Var2 = e3Var;
                    if (!rVar.W(e3Var2)) {
                        z28 = true;
                    }
                    z29 = zW110 | z28;
                    objE = rVar.E();
                    if (z29) {
                        a aVar11111117 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar11111117);
                        objE = aVar11111117;
                    } else {
                        a aVar11111118 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar11111118);
                        objE = aVar11111118;
                    }
                    p056h1.y0 y0Var11110 = (p056h1.y0) objE;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return y0Var11110;
                }
                e3Var2 = e3Var;
                if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = zW110 | z28;
                objE = rVar.E();
                if (z29) {
                    a aVar11111119 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar11111119);
                    objE = aVar11111119;
                } else {
                    a aVar111111110 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar111111110);
                    objE = aVar111111110;
                }
                p056h1.y0 y0Var11111 = (p056h1.y0) objE;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                return y0Var11111;
            }
            interfaceC1317c2 = interfaceC1317c;
            if ((12582912 & i16) == 8388608) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z3115 = z3111 | z25;
            if (((234881024 & i16) ^ 100663296) > 67108864) {
                eVar2 = eVar;
                if (!rVar.W(eVar2)) {
                    z26 = true;
                }
                boolean z3116 = z3115 | z26;
                if (((1879048192 & i16) ^ 805306368) > 536870912) {
                    nVar2 = nVar;
                    if (!rVar.W(nVar2)) {
                        z27 = true;
                    }
                    boolean zW111 = z27 | z3116 | rVar.W(x1Var);
                    if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                        e3Var2 = e3Var;
                        if (!rVar.W(e3Var2)) {
                            z28 = true;
                        }
                        z29 = zW111 | z28;
                        objE = rVar.E();
                        if (z29) {
                            a aVar111111111 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar111111111);
                            objE = aVar111111111;
                        } else {
                            a aVar111111112 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar111111112);
                            objE = aVar111111112;
                        }
                        p056h1.y0 y0Var11112 = (p056h1.y0) objE;
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        return y0Var11112;
                    }
                    e3Var2 = e3Var;
                    if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = zW111 | z28;
                    objE = rVar.E();
                    if (z29) {
                        a aVar111111113 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar111111113);
                        objE = aVar111111113;
                    } else {
                        a aVar111111114 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar111111114);
                        objE = aVar111111114;
                    }
                    p056h1.y0 y0Var11113 = (p056h1.y0) objE;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return y0Var11113;
                }
                nVar2 = nVar;
                if ((i16 & 805306368) == 536870912) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean zW112 = z27 | z3116 | rVar.W(x1Var);
                if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                    e3Var2 = e3Var;
                    if (!rVar.W(e3Var2)) {
                        z28 = true;
                    }
                    z29 = zW112 | z28;
                    objE = rVar.E();
                    if (z29) {
                        a aVar111111115 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar111111115);
                        objE = aVar111111115;
                    } else {
                        a aVar111111116 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar111111116);
                        objE = aVar111111116;
                    }
                    p056h1.y0 y0Var11114 = (p056h1.y0) objE;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return y0Var11114;
                }
                e3Var2 = e3Var;
                if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = zW112 | z28;
                objE = rVar.E();
                if (z29) {
                    a aVar111111117 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar111111117);
                    objE = aVar111111117;
                } else {
                    a aVar111111118 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar111111118);
                    objE = aVar111111118;
                }
                p056h1.y0 y0Var11115 = (p056h1.y0) objE;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                return y0Var11115;
            }
            eVar2 = eVar;
            if ((100663296 & i16) == 67108864) {
                z26 = true;
            } else {
                z26 = false;
            }
            boolean z3117 = z3115 | z26;
            if (((1879048192 & i16) ^ 805306368) > 536870912) {
                nVar2 = nVar;
                if (!rVar.W(nVar2)) {
                    z27 = true;
                }
                boolean zW113 = z27 | z3117 | rVar.W(x1Var);
                if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                    e3Var2 = e3Var;
                    if (!rVar.W(e3Var2)) {
                        z28 = true;
                    }
                    z29 = zW113 | z28;
                    objE = rVar.E();
                    if (z29) {
                        a aVar111111119 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar111111119);
                        objE = aVar111111119;
                    } else {
                        a aVar1111111110 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar1111111110);
                        objE = aVar1111111110;
                    }
                    p056h1.y0 y0Var11116 = (p056h1.y0) objE;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return y0Var11116;
                }
                e3Var2 = e3Var;
                if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = zW113 | z28;
                objE = rVar.E();
                if (z29) {
                    a aVar1111111111 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar1111111111);
                    objE = aVar1111111111;
                } else {
                    a aVar1111111112 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar1111111112);
                    objE = aVar1111111112;
                }
                p056h1.y0 y0Var11117 = (p056h1.y0) objE;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                return y0Var11117;
            }
            nVar2 = nVar;
            if ((i16 & 805306368) == 536870912) {
                z27 = true;
            } else {
                z27 = false;
            }
            boolean zW114 = z27 | z3117 | rVar.W(x1Var);
            if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                e3Var2 = e3Var;
                if (!rVar.W(e3Var2)) {
                    z28 = true;
                }
                z29 = zW114 | z28;
                objE = rVar.E();
                if (z29) {
                    a aVar1111111113 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar1111111113);
                    objE = aVar1111111113;
                } else {
                    a aVar1111111114 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar1111111114);
                    objE = aVar1111111114;
                }
                p056h1.y0 y0Var11118 = (p056h1.y0) objE;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                return y0Var11118;
            }
            e3Var2 = e3Var;
            if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                z28 = true;
            } else {
                z28 = false;
            }
            z29 = zW114 | z28;
            objE = rVar.E();
            if (z29) {
                a aVar1111111115 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                rVar.v(aVar1111111115);
                objE = aVar1111111115;
            } else {
                a aVar1111111116 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                rVar.v(aVar1111111116);
                objE = aVar1111111116;
            }
            p056h1.y0 y0Var11119 = (p056h1.y0) objE;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            return y0Var11119;
        }
        bVar2 = bVar;
        if ((1572864 & i16) == 1048576) {
            z19 = true;
        } else {
            z19 = false;
        }
        boolean z3118 = z320 | z19;
        if (((29360128 & i16) ^ 12582912) > 8388608) {
            interfaceC1317c2 = interfaceC1317c;
            if (!rVar.W(interfaceC1317c2)) {
                z25 = true;
            }
            boolean z3119 = z3118 | z25;
            if (((234881024 & i16) ^ 100663296) > 67108864) {
                eVar2 = eVar;
                if (!rVar.W(eVar2)) {
                    z26 = true;
                }
                boolean z31110 = z3119 | z26;
                if (((1879048192 & i16) ^ 805306368) > 536870912) {
                    nVar2 = nVar;
                    if (!rVar.W(nVar2)) {
                        z27 = true;
                    }
                    boolean zW115 = z27 | z31110 | rVar.W(x1Var);
                    if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                        e3Var2 = e3Var;
                        if (!rVar.W(e3Var2)) {
                            z28 = true;
                        }
                        z29 = zW115 | z28;
                        objE = rVar.E();
                        if (z29) {
                            a aVar1111111117 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar1111111117);
                            objE = aVar1111111117;
                        } else {
                            a aVar1111111118 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                            rVar.v(aVar1111111118);
                            objE = aVar1111111118;
                        }
                        p056h1.y0 y0Var111110 = (p056h1.y0) objE;
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        return y0Var111110;
                    }
                    e3Var2 = e3Var;
                    if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = zW115 | z28;
                    objE = rVar.E();
                    if (z29) {
                        a aVar1111111119 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar1111111119);
                        objE = aVar1111111119;
                    } else {
                        a aVar11111111110 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar11111111110);
                        objE = aVar11111111110;
                    }
                    p056h1.y0 y0Var111111 = (p056h1.y0) objE;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return y0Var111111;
                }
                nVar2 = nVar;
                if ((i16 & 805306368) == 536870912) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean zW116 = z27 | z31110 | rVar.W(x1Var);
                if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                    e3Var2 = e3Var;
                    if (!rVar.W(e3Var2)) {
                        z28 = true;
                    }
                    z29 = zW116 | z28;
                    objE = rVar.E();
                    if (z29) {
                        a aVar11111111111 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar11111111111);
                        objE = aVar11111111111;
                    } else {
                        a aVar11111111112 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar11111111112);
                        objE = aVar11111111112;
                    }
                    p056h1.y0 y0Var111112 = (p056h1.y0) objE;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return y0Var111112;
                }
                e3Var2 = e3Var;
                if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = zW116 | z28;
                objE = rVar.E();
                if (z29) {
                    a aVar11111111113 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar11111111113);
                    objE = aVar11111111113;
                } else {
                    a aVar11111111114 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar11111111114);
                    objE = aVar11111111114;
                }
                p056h1.y0 y0Var111113 = (p056h1.y0) objE;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                return y0Var111113;
            }
            eVar2 = eVar;
            if ((100663296 & i16) == 67108864) {
                z26 = true;
            } else {
                z26 = false;
            }
            boolean z31111 = z3119 | z26;
            if (((1879048192 & i16) ^ 805306368) > 536870912) {
                nVar2 = nVar;
                if (!rVar.W(nVar2)) {
                    z27 = true;
                }
                boolean zW117 = z27 | z31111 | rVar.W(x1Var);
                if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                    e3Var2 = e3Var;
                    if (!rVar.W(e3Var2)) {
                        z28 = true;
                    }
                    z29 = zW117 | z28;
                    objE = rVar.E();
                    if (z29) {
                        a aVar11111111115 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar11111111115);
                        objE = aVar11111111115;
                    } else {
                        a aVar11111111116 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar11111111116);
                        objE = aVar11111111116;
                    }
                    p056h1.y0 y0Var111114 = (p056h1.y0) objE;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return y0Var111114;
                }
                e3Var2 = e3Var;
                if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = zW117 | z28;
                objE = rVar.E();
                if (z29) {
                    a aVar11111111117 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar11111111117);
                    objE = aVar11111111117;
                } else {
                    a aVar11111111118 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar11111111118);
                    objE = aVar11111111118;
                }
                p056h1.y0 y0Var111115 = (p056h1.y0) objE;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                return y0Var111115;
            }
            nVar2 = nVar;
            if ((i16 & 805306368) == 536870912) {
                z27 = true;
            } else {
                z27 = false;
            }
            boolean zW118 = z27 | z31111 | rVar.W(x1Var);
            if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                e3Var2 = e3Var;
                if (!rVar.W(e3Var2)) {
                    z28 = true;
                }
                z29 = zW118 | z28;
                objE = rVar.E();
                if (z29) {
                    a aVar11111111119 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar11111111119);
                    objE = aVar11111111119;
                } else {
                    a aVar111111111110 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar111111111110);
                    objE = aVar111111111110;
                }
                p056h1.y0 y0Var111116 = (p056h1.y0) objE;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                return y0Var111116;
            }
            e3Var2 = e3Var;
            if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                z28 = true;
            } else {
                z28 = false;
            }
            z29 = zW118 | z28;
            objE = rVar.E();
            if (z29) {
                a aVar111111111111 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                rVar.v(aVar111111111111);
                objE = aVar111111111111;
            } else {
                a aVar111111111112 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                rVar.v(aVar111111111112);
                objE = aVar111111111112;
            }
            p056h1.y0 y0Var111117 = (p056h1.y0) objE;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            return y0Var111117;
        }
        interfaceC1317c2 = interfaceC1317c;
        if ((12582912 & i16) == 8388608) {
            z25 = true;
        } else {
            z25 = false;
        }
        boolean z31112 = z3118 | z25;
        if (((234881024 & i16) ^ 100663296) > 67108864) {
            eVar2 = eVar;
            if (!rVar.W(eVar2)) {
                z26 = true;
            }
            boolean z31113 = z31112 | z26;
            if (((1879048192 & i16) ^ 805306368) > 536870912) {
                nVar2 = nVar;
                if (!rVar.W(nVar2)) {
                    z27 = true;
                }
                boolean zW119 = z27 | z31113 | rVar.W(x1Var);
                if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                    e3Var2 = e3Var;
                    if (!rVar.W(e3Var2)) {
                        z28 = true;
                    }
                    z29 = zW119 | z28;
                    objE = rVar.E();
                    if (z29) {
                        a aVar111111111113 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar111111111113);
                        objE = aVar111111111113;
                    } else {
                        a aVar111111111114 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                        rVar.v(aVar111111111114);
                        objE = aVar111111111114;
                    }
                    p056h1.y0 y0Var111118 = (p056h1.y0) objE;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    return y0Var111118;
                }
                e3Var2 = e3Var;
                if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = zW119 | z28;
                objE = rVar.E();
                if (z29) {
                    a aVar111111111115 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar111111111115);
                    objE = aVar111111111115;
                } else {
                    a aVar111111111116 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar111111111116);
                    objE = aVar111111111116;
                }
                p056h1.y0 y0Var111119 = (p056h1.y0) objE;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                return y0Var111119;
            }
            nVar2 = nVar;
            if ((i16 & 805306368) == 536870912) {
                z27 = true;
            } else {
                z27 = false;
            }
            boolean zW1110 = z27 | z31113 | rVar.W(x1Var);
            if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                e3Var2 = e3Var;
                if (!rVar.W(e3Var2)) {
                    z28 = true;
                }
                z29 = zW1110 | z28;
                objE = rVar.E();
                if (z29) {
                    a aVar111111111117 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar111111111117);
                    objE = aVar111111111117;
                } else {
                    a aVar111111111118 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar111111111118);
                    objE = aVar111111111118;
                }
                p056h1.y0 y0Var1111110 = (p056h1.y0) objE;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                return y0Var1111110;
            }
            e3Var2 = e3Var;
            if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                z28 = true;
            } else {
                z28 = false;
            }
            z29 = zW1110 | z28;
            objE = rVar.E();
            if (z29) {
                a aVar111111111119 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                rVar.v(aVar111111111119);
                objE = aVar111111111119;
            } else {
                a aVar1111111111110 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                rVar.v(aVar1111111111110);
                objE = aVar1111111111110;
            }
            p056h1.y0 y0Var1111111 = (p056h1.y0) objE;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            return y0Var1111111;
        }
        eVar2 = eVar;
        if ((100663296 & i16) == 67108864) {
            z26 = true;
        } else {
            z26 = false;
        }
        boolean z31114 = z31112 | z26;
        if (((1879048192 & i16) ^ 805306368) > 536870912) {
            nVar2 = nVar;
            if (!rVar.W(nVar2)) {
                z27 = true;
            }
            boolean zW1111 = z27 | z31114 | rVar.W(x1Var);
            if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                e3Var2 = e3Var;
                if (!rVar.W(e3Var2)) {
                    z28 = true;
                }
                z29 = zW1111 | z28;
                objE = rVar.E();
                if (z29) {
                    a aVar1111111111111 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar1111111111111);
                    objE = aVar1111111111111;
                } else {
                    a aVar1111111111112 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                    rVar.v(aVar1111111111112);
                    objE = aVar1111111111112;
                }
                p056h1.y0 y0Var1111112 = (p056h1.y0) objE;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                return y0Var1111112;
            }
            e3Var2 = e3Var;
            if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
                z28 = true;
            } else {
                z28 = false;
            }
            z29 = zW1111 | z28;
            objE = rVar.E();
            if (z29) {
                a aVar1111111111113 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                rVar.v(aVar1111111111113);
                objE = aVar1111111111113;
            } else {
                a aVar1111111111114 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                rVar.v(aVar1111111111114);
                objE = aVar1111111111114;
            }
            p056h1.y0 y0Var1111113 = (p056h1.y0) objE;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            return y0Var1111113;
        }
        nVar2 = nVar;
        if ((i16 & 805306368) == 536870912) {
            z27 = true;
        } else {
            z27 = false;
        }
        boolean zW1112 = z27 | z31114 | rVar.W(x1Var);
        if (((i17 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
            e3Var2 = e3Var;
            if (!rVar.W(e3Var2)) {
                z28 = true;
            }
            z29 = zW1112 | z28;
            objE = rVar.E();
            if (z29) {
                a aVar1111111111115 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                rVar.v(aVar1111111111115);
                objE = aVar1111111111115;
            } else {
                a aVar1111111111116 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
                rVar.v(aVar1111111111116);
                objE = aVar1111111111116;
            }
            p056h1.y0 y0Var1111114 = (p056h1.y0) objE;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            return y0Var1111114;
        }
        e3Var2 = e3Var;
        if ((i17 & MLKEMEngine.KyberPolyBytes) == 256) {
            z28 = true;
        } else {
            z28 = false;
        }
        z29 = zW1112 | z28;
        objE = rVar.E();
        if (z29) {
            a aVar1111111111117 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
            rVar.v(aVar1111111111117);
            objE = aVar1111111111117;
        } else {
            a aVar1111111111118 = new a(y0Var, z17, d3Var, z15, aVar, nVar2, eVar2, i15, p0Var, x1Var, e3Var2, bVar2, interfaceC1317c2);
            rVar.v(aVar1111111111118);
            objE = aVar1111111111118;
        }
        p056h1.y0 y0Var1111115 = (p056h1.y0) objE;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return y0Var1111115;
    }
}
