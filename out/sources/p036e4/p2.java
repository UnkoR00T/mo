package p036e4;

import androidx.compose.ui.node.g;
import er.p;
import f3.j;
import f3.m;
import fr.w;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p076m2.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003*\u0001\u000e\u001a3\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lf3/m;", "modifier", "Lkotlin/Function2;", "Le4/s2;", "Lc5/b;", "Le4/x0;", "measurePolicy", "Loq/i0;", "b", "(Lf3/m;Ler/p;Lm2/r;II)V", "Le4/r2;", "state", "a", "(Le4/r2;Lf3/m;Ler/p;Lm2/r;II)V", "e4/p2$a", "Le4/p2$a;", "ReusedSlotId", "", "Ljava/lang/Object;", "UnspecifiedSlotId", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f47391a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f47392b = new Object();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"e4/p2$a", "", "", "toString", "()Ljava/lang/String;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        a() {
        }

        public String toString() {
            return "ReusedSlotId";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends w implements p<r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f47393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<s2, c5.b, x0> f47394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f47395d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f47396e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(m mVar, p<? super s2, ? super c5.b, ? extends x0> pVar, int i15, int i16) {
            super(2);
            this.f47393b = mVar;
            this.f47394c = pVar;
            this.f47395d = i15;
            this.f47396e = i16;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(r rVar, int i15) {
            p2.b(this.f47393b, this.f47394c, rVar, g4.a(this.f47395d | 1), this.f47396e);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class c extends w implements er.a<i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r2 f47397b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(r2 r2Var) {
            super(0);
            this.f47397b = r2Var;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            this.f47397b.e();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d extends w implements p<r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r2 f47398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f47399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<s2, c5.b, x0> f47400d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f47401e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f47402f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(r2 r2Var, m mVar, p<? super s2, ? super c5.b, ? extends x0> pVar, int i15, int i16) {
            super(2);
            this.f47398b = r2Var;
            this.f47399c = mVar;
            this.f47400d = pVar;
            this.f47401e = i15;
            this.f47402f = i16;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(r rVar, int i15) {
            p2.a(this.f47398b, this.f47399c, this.f47400d, rVar, g4.a(this.f47401e | 1), this.f47402f);
        }
    }

    public static final void a(r2 r2Var, m mVar, p<? super s2, ? super c5.b, ? extends x0> pVar, r rVar, int i15, int i16) {
        int i17;
        r rVarH = rVar.h(-511989831);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(r2Var) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= rVarH.W(mVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.G(pVar) ? 256 : 128;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            if (i18 != 0) {
                mVar = m.INSTANCE;
            }
            if (t.k()) {
                t.o(-511989831, i17, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:128)");
            }
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            v vVarE = p076m2.m.e(rVarH, 0);
            m mVarE = j.e(rVarH, mVar);
            e0 e0VarT = rVarH.t();
            er.a<g> aVarA = g.INSTANCE.a();
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
            n6.i(rVarC, r2Var, r2Var.h());
            n6.i(rVarC, vVarE, r2Var.f());
            n6.i(rVarC, pVar, r2Var.g());
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            n6.i(rVarC, e0VarT, companion.f());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            rVarH.x();
            if (rVarH.i()) {
                rVarH.X(-1259187287);
                rVarH.R();
            } else {
                rVarH.X(-1259245908);
                boolean zG = rVarH.G(r2Var);
                Object objE = rVarH.E();
                if (zG || objE == r.INSTANCE.a()) {
                    objE = new c(r2Var);
                    rVarH.v(objE);
                }
                Function0.g((er.a) objE, rVarH, 0);
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        m mVar2 = mVar;
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new d(r2Var, mVar2, pVar, i15, i16));
        }
    }

    public static final void b(m mVar, p<? super s2, ? super c5.b, ? extends x0> pVar, r rVar, int i15, int i16) {
        int i17;
        p<? super s2, ? super c5.b, ? extends x0> pVar2;
        r rVarH = rVar.h(-1298353104);
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
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            if (i18 != 0) {
                mVar = m.INSTANCE;
            }
            m mVar2 = mVar;
            if (t.k()) {
                t.o(-1298353104, i17, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:95)");
            }
            Object objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = new r2();
                rVarH.v(objE);
            }
            pVar2 = pVar;
            a((r2) objE, mVar2, pVar2, rVarH, (i17 << 3) & 1008, 0);
            if (t.k()) {
                t.n();
            }
            mVar = mVar2;
        } else {
            pVar2 = pVar;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new b(mVar, pVar2, i15, i16));
        }
    }
}
