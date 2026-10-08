package z82;

import d1.a3;
import d1.e0;
import d1.h0;
import d1.r3;
import er.p;
import h30.q;
import mx.Label;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p036e4.w0;
import p046f2.ad;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p088nul.q0;
import q4.TextStyle;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\r\"\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u0017²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lz82/d;", "viewModel", "Loq/i0;", "g", "(Lz82/d;Lm2/r;I)V", "Lz82/d$a;", "data", "j", "(Lz82/d$a;Lm2/r;I)V", "Lmx/a;", AnnotatedPrivateKey.LABEL, "value", "e", "(Lmx/a;Lmx/a;Lm2/r;I)V", "Lc5/h;", "a", "F", "getOUTRO_TOP_PADDING", "()F", "OUTRO_TOP_PADDING", "b", "getOUTRO_ICON_SIZE", "OUTRO_ICON_SIZE", "gios_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f233348a = c5.h.n(182);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f233349b = c5.h.n(70);

    private static final void e(final Label label, Label label2, r rVar, final int i15) {
        int i16;
        r rVar2;
        final Label label3 = label2;
        r rVarH = rVar.h(1678240636);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(label) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(label3) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(1678240636, i16, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.outro.GiosOutroDetailsRow (GiosOutroScreen.kt:94)");
            }
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            TextStyle textStyleB = aVar.f(rVarH, i17).b();
            long jB = aVar.a(rVarH, i17).getNeutral().b();
            b5.j.Companion companion = b5.j.INSTANCE;
            int iA = companion.a();
            f3.m.Companion companion2 = f3.m.INSTANCE;
            j70.h.g(a3.p(companion2, aVar.b(rVarH, i17).getSpacing250(), 0.0f, 2, null), null, label, null, null, jB, 0L, null, null, null, 0L, null, b5.j.h(iA), 0L, 0, false, 0, 0, null, textStyleB, null, null, false, false, null, rVarH, (i16 << 6) & 896, 0, 0, 33026010);
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            j70.h.g(a3.p(companion2, aVar.b(rVarH, i17).getSpacing250(), 0.0f, 2, null), null, label2, null, null, aVar.a(rVarH, i17).getNeutral().i(), 0L, null, null, null, 0L, null, b5.j.h(companion.a()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).p(), null, null, false, false, null, rVarH, (i16 << 3) & 896, 0, 0, 33026010);
            label3 = label2;
            rVar2 = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVar2, i17).getSpacing300()), rVar2, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: z82.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.f(label, label3, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Label label, Label label2, int i15, r rVar, int i16) {
        e(label, label2, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final d dVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1172704168);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1172704168, i16, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.outro.GiosOutroScreen (GiosOutroScreen.kt:36)");
            }
            j(h(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: z82.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.i(dVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.Data h(f6<d.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(d dVar, int i15, r rVar, int i16) {
        g(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void j(d.Data data, r rVar, final int i15) {
        int i16;
        final d.Data data2;
        r rVarH = rVar.h(-795528491);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(data) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-795528491, i16, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.outro.GiosOutroScreenContent (GiosOutroScreen.kt:44)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarN = a3.n(w0.i.d(mVarF, aVar.a(rVarH, i17).getBase().a(), null, 2, null), aVar.b(rVarH, i17).getSpacing200());
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarN);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            f3.m mVarP = a3.p(h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null), aVar.b(rVarH, i17).getSpacing200(), 0.0f, 2, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.g(), rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarP);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
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
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            r3.a(androidx.compose.foundation.layout.d.i(companion, f233348a), rVarH, 6);
            androidx.compose.ui.graphics.painter.a aVarC = l4.c.c(jz.a.f106738b2, rVarH, 0);
            float f15 = f233349b;
            ad.d(aVarC, null, androidx.compose.foundation.layout.d.y(androidx.compose.foundation.layout.d.i(companion, f15), f15), aVar.a(rVarH, i17).getSupport().d(), rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 432, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            j70.h.g(null, null, data.getTitle(), null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).q(), null, null, false, false, null, rVarH, 0, 0, 0, 33026043);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing600()), rVarH, 0);
            e(data.getReportNumberLabel(), data.getReportNumber(), rVarH, 0);
            e(data.getReportDestinationLabel(), data.getReportDestination(), rVarH, 0);
            rVarH.x();
            q.p(data.getFinishButtonData(), false, null, rVarH, 0, 6);
            rVarH.x();
            boolean z15 = (i16 & 14) == 4;
            Object objE = rVarH.E();
            if (z15 || objE == r.INSTANCE.a()) {
                data2 = data;
                objE = new er.a() { // from class: z82.f
                    @Override // er.a
                    public final Object a() {
                        return i.k(data2);
                    }
                };
                rVarH.v(objE);
            } else {
                data2 = data;
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            data2 = data;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: z82.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.l(data2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(d.Data data) {
        data.b().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(d.Data data, int i15, r rVar, int i16) {
        j(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
