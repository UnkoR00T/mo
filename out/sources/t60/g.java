package t60;

import android.content.Context;
import androidx.compose.material3.l;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p016lifecycle.j;
import androidx.p016lifecycle.n;
import androidx.p016lifecycle.q;
import er.p;
import f3.m;
import fr.p0;
import java.util.List;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.r0;
import p076m2.s0;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lf3/m;", "modifier", "", "", "listResBitmap", "Lm60/a;", "typeShader", "", "isPreview", "Loq/i0;", "g", "(Lf3/m;Ljava/util/List;Lm60/a;ZLm2/r;II)V", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"t60/g$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f187983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f187984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p0 f187985c;

        public a(j jVar, n nVar, p0 p0Var) {
            this.f187983a = jVar;
            this.f187984b = nVar;
            this.f187985c = p0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p076m2.r0
        public void j() {
            this.f187983a.d(this.f187984b);
            h hVar = (h) this.f187985c.f66410a;
            if (hVar != null) {
                hVar.onPause();
            }
            this.f187985c.f66410a = null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f187986a;

        static {
            int[] iArr = new int[j.a.values().length];
            try {
                iArr[j.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f187986a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public static final void g(m mVar, final List<Integer> list, final m60.a aVar, boolean z15, r rVar, final int i15, final int i16) {
        final m mVar2;
        int i17;
        boolean z16;
        boolean z17;
        r rVar2;
        final boolean z18;
        final m mVar3;
        d5 d5VarM;
        Context context;
        Object objE;
        r rVarH = rVar.h(-1200236865);
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
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(list) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.c(aVar.ordinal()) ? 256 : 128;
        }
        int i19 = i16 & 8;
        if (i19 == 0) {
            if ((i15 & 3072) == 0) {
                z16 = z15;
                i17 |= rVarH.a(z16) ? 2048 : 1024;
            }
            if ((i17 & 1171) != 1170) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i18 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i19 != 0) {
                    z18 = false;
                } else {
                    z18 = z16;
                }
                if (t.k()) {
                    t.o(-1200236865, i17, -1, "pl.gov.coi.common.ui.opengl.view.DisplayComposeGL (DisplayCompose.kt:23)");
                }
                context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
                objE = rVarH.E();
                if (objE == r.INSTANCE.a()) {
                    objE = r60.b.f171973a.b(context, aVar, list);
                    rVarH.v(objE);
                }
                final n60.b bVar = (n60.b) objE;
                rVar2 = rVarH;
                l.g(mVar2, null, Color.INSTANCE.g(), 0L, 0.0f, 0.0f, null, y2.m.d(-306919548, true, new p() { // from class: t60.a
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return g.h(bVar, aVar, mVar2, z18, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVar2, (i17 & 14) | 12583296, 122);
                if (t.k()) {
                    t.n();
                }
            } else {
                rVar2 = rVarH;
                rVar2.O();
                z18 = z16;
            }
            mVar3 = mVar2;
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: t60.b
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return g.m(mVar3, list, aVar, z18, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        z16 = z15;
        if ((i17 & 1171) != 1170) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            if (i18 != 0) {
                mVar2 = m.INSTANCE;
            }
            if (i19 != 0) {
                z18 = false;
            } else {
                z18 = z16;
            }
            if (t.k()) {
                t.o(-1200236865, i17, -1, "pl.gov.coi.common.ui.opengl.view.DisplayComposeGL (DisplayCompose.kt:23)");
            }
            context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
            objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = r60.b.f171973a.b(context, aVar, list);
                rVarH.v(objE);
            }
            final n60.b bVar2 = (n60.b) objE;
            rVar2 = rVarH;
            l.g(mVar2, null, Color.INSTANCE.g(), 0L, 0.0f, 0.0f, null, y2.m.d(-306919548, true, new p() { // from class: t60.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.h(bVar2, aVar, mVar2, z18, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVar2, (i17 & 14) | 12583296, 122);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
            z18 = z16;
        }
        mVar3 = mVar2;
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: t60.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.m(mVar3, list, aVar, z18, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, t60.h] */
    public static final i0 h(final n60.b bVar, final m60.a aVar, m mVar, boolean z15, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-306919548, i15, -1, "pl.gov.coi.common.ui.opengl.view.DisplayComposeGL.<anonymous> (DisplayCompose.kt:39)");
            }
            final p0 p0Var = new p0();
            Object objE = rVar.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = null;
                rVar.v(null);
            }
            p0Var.f66410a = (h) objE;
            final j lifecycle = ((q) rVar.N(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycleRegistry();
            Function0.a(lifecycle, new er.l() { // from class: t60.c
                @Override // er.l
                public final Object b(Object obj) {
                    return g.i(lifecycle, p0Var, bVar, (s0) obj);
                }
            }, rVar, 0);
            boolean zG = rVar.G(bVar) | rVar.c(aVar.ordinal());
            Object objE2 = rVar.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new er.l() { // from class: t60.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return g.k(bVar, aVar, (Context) obj);
                    }
                };
                rVar.v(objE2);
            }
            androidx.compose.ui.viewinterop.e.b((er.l) objE2, mVar, new er.l() { // from class: t60.e
                @Override // er.l
                public final Object b(Object obj) {
                    return g.l(p0Var, (h) obj);
                }
            }, rVar, 0, 0);
            bVar.a(z15);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 i(j jVar, final p0 p0Var, final n60.b bVar, s0 s0Var) {
        n nVar = new n() { // from class: t60.f
            @Override // androidx.p016lifecycle.n
            public final void m(q qVar, j.a aVar) {
                g.j(p0Var, bVar, qVar, aVar);
            }
        };
        jVar.a(nVar);
        return new a(jVar, nVar, p0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(p0 p0Var, n60.b bVar, q qVar, j.a aVar) {
        int i15 = b.f187986a[aVar.ordinal()];
        if (i15 == 1) {
            h hVar = (h) p0Var.f66410a;
            if (hVar != null) {
                hVar.onResume();
            }
            bVar.s();
            return;
        }
        if (i15 != 2) {
            return;
        }
        h hVar2 = (h) p0Var.f66410a;
        if (hVar2 != null) {
            hVar2.onPause();
        }
        bVar.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h k(n60.b bVar, m60.a aVar, Context context) {
        return new h(context, bVar, aVar == m60.a.WavingBitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 l(p0 p0Var, h hVar) {
        p0Var.f66410a = hVar;
        hVar.setDebugFlags(1);
        hVar.setRenderMode(1);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(m mVar, List list, m60.a aVar, boolean z15, int i15, int i16, r rVar, int i17) {
        g(mVar, list, aVar, z15, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
