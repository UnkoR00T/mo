package p046f2;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.t1;
import androidx.compose.ui.platform.v1;
import c5.h;
import c5.n;
import d1.o2;
import er.l;
import er.p;
import er.q;
import f3.c;
import f3.j;
import f3.m;
import fr.w;
import l2.k0;
import l2.q0;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import u0.f;
import w0.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u001b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006 ²\u0006\f\u0010\u001e\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\u001f\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lf2/wm;", "", "<init>", "()V", "Lf3/m;", "modifier", "Lc5/h;", "height", "Landroidx/compose/ui/graphics/Color;", "color", "Loq/i0;", "d", "(Lf3/m;FJLm2/r;II)V", "Lf2/sm;", "currentTabPosition", "h", "(Lf3/m;Lf2/sm;)Lf3/m;", "b", "F", "getScrollableTabRowMinTabWidth-D9Ej5fM", "()F", "ScrollableTabRowMinTabWidth", "c", "getScrollableTabRowEdgeStartPadding-D9Ej5fM", "ScrollableTabRowEdgeStartPadding", "f", "(Lm2/r;I)J", "primaryContainerColor", "g", "primaryContentColor", "currentTabWidth", "indicatorOffset", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class wm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wm f58234a = new wm();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float ScrollableTabRowMinTabWidth = h.n(90);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ScrollableTabRowEdgeStartPadding = h.n(52);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v1;", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/v1;)V"}, k = 3, mv = {2, 1, 0})
    public static final class a extends w implements l<v1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TabPosition f58237b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TabPosition tabPosition) {
            super(1);
            this.f58237b = tabPosition;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(v1 v1Var) {
            c(v1Var);
            return i0.f148189a;
        }

        public final void c(v1 v1Var) {
            v1Var.b("tabIndicatorOffset");
            v1Var.c(this.f58237b);
        }
    }

    private wm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(wm wmVar, m mVar, float f15, long j15, int i15, int i16, r rVar, int i17) {
        wmVar.d(mVar, f15, j15, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m i(TabPosition tabPosition, m mVar, r rVar, int i15) {
        rVar.X(-1541271084);
        if (t.k()) {
            t.o(-1541271084, i15, -1, "androidx.compose.material3.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:1110)");
        }
        float width = tabPosition.getWidth();
        k0 k0Var = k0.DefaultSpatial;
        f6<h> f6VarD = f.d(width, of.b(k0Var, rVar, 6), null, null, rVar, 0, 12);
        final f6<h> f6VarD2 = f.d(tabPosition.getLeft(), of.b(k0Var, rVar, 6), null, null, rVar, 0, 12);
        m mVarE = d.E(d.h(mVar, 0.0f, 1, null), c.INSTANCE.d(), false, 2, null);
        boolean zW = rVar.W(f6VarD2);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: f2.vm
                @Override // er.l
                public final Object b(Object obj) {
                    return wm.l(f6VarD2, (c5.d) obj);
                }
            };
            rVar.v(objE);
        }
        m mVarY = d.y(o2.c(mVarE, (l) objE), j(f6VarD));
        if (t.k()) {
            t.n();
        }
        rVar.R();
        return mVarY;
    }

    private static final float j(f6<h> f6Var) {
        return f6Var.getValue().getValue();
    }

    private static final float k(f6<h> f6Var) {
        return f6Var.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n l(f6 f6Var, c5.d dVar) {
        return n.c(n.d((((long) dVar.X0(k(f6Var))) << 32) | (((long) 0) & BodyPartID.bodyIdMax)));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b A[PHI: r2 r3 r4
      0x008b: PHI (r2v7 f3.m) = (r2v4 f3.m), (r2v9 f3.m) binds: [B:58:0x009f, B:49:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x008b: PHI (r3v11 float) = (r3v7 float), (r3v12 float) binds: [B:58:0x009f, B:49:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x008b: PHI (r4v16 int) = (r4v9 int), (r4v17 int) binds: [B:58:0x009f, B:49:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00db  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public final void d(m mVar, float f15, long j15, r rVar, final int i15, final int i16) {
        m mVar2;
        int i17;
        float f16;
        long j16;
        boolean z15;
        final m mVar3;
        final float fB;
        final long j17;
        d5 d5VarM;
        long jI;
        r rVarH = rVar.h(-1498258020);
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
        int i19 = i16 & 2;
        if (i19 == 0) {
            if ((i15 & 48) == 0) {
                f16 = f15;
                i17 |= rVarH.b(f16) ? 32 : 16;
            }
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                if ((i16 & 4) == 0) {
                    j16 = j15;
                    int i25 = rVarH.d(j16) ? 256 : 128;
                    i17 |= i25;
                } else {
                    j16 = j15;
                }
                i17 |= i25;
            } else {
                j16 = j15;
            }
            if ((i17 & 147) != 146) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0 || rVarH.Q()) {
                    if (i18 != 0) {
                        mVar3 = m.INSTANCE;
                    } else {
                        mVar3 = mVar2;
                    }
                    if (i19 != 0) {
                        fB = q0.f115180a.b();
                    } else {
                        fB = f16;
                    }
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                        jI = g2.i(q0.f115180a.a(), rVarH, 6);
                    }
                    rVarH.y();
                    if (t.k()) {
                        t.o(-1498258020, i17, -1, "androidx.compose.material3.TabRowDefaults.SecondaryIndicator (TabRow.kt:1083)");
                    }
                    d1.r.b(i.d(d.i(d.h(mVar3, 0.0f, 1, null), fB), jI, null, 2, null), rVarH, 0);
                    if (t.k()) {
                        t.n();
                    }
                    j17 = jI;
                } else {
                    rVarH.O();
                    if ((i16 & 4) != 0) {
                        i17 &= -897;
                    }
                    mVar3 = mVar2;
                    fB = f16;
                }
                jI = j16;
                rVarH.y();
                if (t.k()) {
                    t.o(-1498258020, i17, -1, "androidx.compose.material3.TabRowDefaults.SecondaryIndicator (TabRow.kt:1083)");
                }
                d1.r.b(i.d(d.i(d.h(mVar3, 0.0f, 1, null), fB), jI, null, 2, null), rVarH, 0);
                if (t.k()) {
                    t.n();
                }
                j17 = jI;
            } else {
                rVarH.O();
                mVar3 = mVar2;
                fB = f16;
                j17 = j16;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f2.um
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return wm.e(this.f58013a, mVar3, fB, j17, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        f16 = f15;
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i16 & 4) == 0) {
                j16 = j15;
                if (rVarH.d(j16)) {
                }
                i17 |= i25;
            } else {
                j16 = j15;
            }
            i17 |= i25;
        } else {
            j16 = j15;
        }
        if ((i17 & 147) != 146) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if (i18 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if (i19 != 0) {
                    fB = q0.f115180a.b();
                } else {
                    fB = f16;
                }
                if ((i16 & 4) != 0) {
                    i17 &= -897;
                    jI = g2.i(q0.f115180a.a(), rVarH, 6);
                } else {
                    jI = j16;
                }
            } else {
                if (i18 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if (i19 != 0) {
                    fB = q0.f115180a.b();
                } else {
                    fB = f16;
                }
                if ((i16 & 4) != 0) {
                    i17 &= -897;
                    jI = g2.i(q0.f115180a.a(), rVarH, 6);
                } else {
                    jI = j16;
                }
            }
            rVarH.y();
            if (t.k()) {
                t.o(-1498258020, i17, -1, "androidx.compose.material3.TabRowDefaults.SecondaryIndicator (TabRow.kt:1083)");
            }
            d1.r.b(i.d(d.i(d.h(mVar3, 0.0f, 1, null), fB), jI, null, 2, null), rVarH, 0);
            if (t.k()) {
                t.n();
            }
            j17 = jI;
        } else {
            rVarH.O();
            mVar3 = mVar2;
            fB = f16;
            j17 = j16;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.um
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return wm.e(this.f58013a, mVar3, fB, j17, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final long f(r rVar, int i15) {
        if (t.k()) {
            t.o(-2069154037, i15, -1, "androidx.compose.material3.TabRowDefaults.<get-primaryContainerColor> (TabRow.kt:1000)");
        }
        long jI = g2.i(q0.f115180a.d(), rVar, 6);
        if (t.k()) {
            t.n();
        }
        return jI;
    }

    public final long g(r rVar, int i15) {
        if (t.k()) {
            t.o(1410362619, i15, -1, "androidx.compose.material3.TabRowDefaults.<get-primaryContentColor> (TabRow.kt:1016)");
        }
        long jI = g2.i(q0.f115180a.c(), rVar, 6);
        if (t.k()) {
            t.n();
        }
        return jI;
    }

    @oq.a
    public final m h(m mVar, final TabPosition tabPosition) {
        return j.b(mVar, t1.b() ? new a(tabPosition) : t1.a(), new q() { // from class: f2.tm
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return wm.i(tabPosition, (m) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        });
    }
}
