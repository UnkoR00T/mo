package p036e4;

import androidx.compose.ui.node.g;
import er.l;
import er.p;
import f3.j;
import f3.m;
import fr.w;
import java.util.List;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "Lkotlin/Function0;", "Loq/i0;", "contents", "b", "(Ljava/util/List;)Ler/p;", "Lf3/m;", "modifier", "content", "Le4/w0;", "measurePolicy", "a", "(Lf3/m;Ler/p;Le4/w0;Lm2/r;II)V", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/node/g;", "Loq/i0;", "c", "(Landroidx/compose/ui/node/g;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends w implements l<g, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f47280b = new a();

        a() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(g gVar) {
            c(gVar);
            return i0.f148189a;
        }

        public final void c(g gVar) {
            gVar.U1(true);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends w implements p<r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f47281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<r, Integer, i0> f47282c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w0 f47283d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f47284e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f47285f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(m mVar, p<? super r, ? super Integer, i0> pVar, w0 w0Var, int i15, int i16) {
            super(2);
            this.f47281b = mVar;
            this.f47282c = pVar;
            this.f47283d = w0Var;
            this.f47284e = i15;
            this.f47285f = i16;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(r rVar, int i15) {
            j0.a(this.f47281b, this.f47282c, this.f47283d, rVar, g4.a(this.f47284e | 1), this.f47285f);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "(Lm2/r;I)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends w implements p<r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<p<r, Integer, i0>> f47286b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<? extends p<? super r, ? super Integer, i0>> list) {
            super(2);
            this.f47286b = list;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(r rVar, int i15) {
            if (!rVar.r((i15 & 3) != 2, i15 & 1)) {
                rVar.O();
                return;
            }
            if (t.k()) {
                t.o(1271844412, i15, -1, "androidx.compose.ui.layout.combineAsVirtualLayouts.<anonymous> (Layout.kt:180)");
            }
            List<p<r, Integer, i0>> list = this.f47286b;
            int size = list.size();
            for (int i16 = 0; i16 < size; i16++) {
                p<r, Integer, i0> pVar = list.get(i16);
                int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
                androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarG = companion.g();
                if (rVar.l() == null) {
                    p076m2.m.d();
                }
                rVar.K();
                if (rVar.getInserting()) {
                    rVar.H(aVarG);
                } else {
                    rVar.u();
                }
                n6.i(n6.c(rVar), Integer.valueOf(iHashCode), companion.c());
                pVar.B(rVar, 0);
                rVar.x();
            }
            if (t.k()) {
                t.n();
            }
        }
    }

    @oq.a
    public static final void a(m mVar, p<? super r, ? super Integer, i0> pVar, w0 w0Var, r rVar, int i15, int i16) {
        int i17;
        r rVarH = rVar.h(-1663319424);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.W(w0Var) ? 256 : 128;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            if (i18 != 0) {
                mVar = m.INSTANCE;
            }
            if (t.k()) {
                t.o(-1663319424, i17, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:241)");
            }
            int iHashCode = Integer.hashCode(p076m2.m.a(rVarH, 0));
            m mVarE = j.e(rVarH, mVar);
            e0 e0VarT = rVarH.t();
            er.a<g> aVarA = g.INSTANCE.a();
            int i19 = ((i17 << 3) & 896) | 6;
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarA);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            n6.i(rVarC, w0Var, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.d(rVarC, a.f47280b);
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            pVar.B(rVarH, Integer.valueOf((i19 >> 6) & 14));
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        m mVar2 = mVar;
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new b(mVar2, pVar, w0Var, i15, i16));
        }
    }

    public static final p<r, Integer, i0> b(List<? extends p<? super r, ? super Integer, i0>> list) {
        return y2.m.b(1271844412, true, new c(list));
    }
}
