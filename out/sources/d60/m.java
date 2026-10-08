package d60;

import d1.e0;
import er.p;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.r0;
import p076m2.s0;
import p076m2.t;
import pq.v;
import t70.z;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0000*\u00020\u0007*\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"FIELD_INDEX", "fieldIndex", "Lkotlin/Function0;", "Loq/i0;", "content", "c", "(Ljava/lang/Object;Ler/p;Lm2/r;I)V", "", "Lf3/m;", "e", "(Lf3/m;Ljava/lang/Object;Lm2/r;I)Lf3/m;", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"d60/m$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f40072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f40073b;

        public a(f fVar, Object obj) {
            this.f40072a = fVar;
            this.f40073b = obj;
        }

        @Override // p076m2.r0
        public void j() {
            this.f40072a.d(this.f40073b);
        }
    }

    public static final <FIELD_INDEX> void c(final FIELD_INDEX field_index, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1367716570);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(field_index) : rVarH.G(field_index) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1367716570, i16, -1, "pl.gov.coi.common.ui.focus.ScrollTarget (ScrollTarget.kt:22)");
            }
            f3.m mVarE = e(f3.m.INSTANCE, field_index, rVarH, ((i16 & 8) << 3) | 6 | ((i16 << 3) & 112));
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarE);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE2, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            pVar.B(rVarH, Integer.valueOf((i16 >> 3) & 14));
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: d60.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return m.d(field_index, pVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(Object obj, p pVar, int i15, r rVar, int i16) {
        c(obj, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final <FIELD_INDEX> f3.m e(f3.m mVar, final FIELD_INDEX field_index, r rVar, int i15) {
        rVar.X(1998110941);
        if (t.k()) {
            t.o(1998110941, i15, -1, "pl.gov.coi.common.ui.focus.scrollTarget (ScrollTarget.kt:29)");
        }
        if (field_index == null) {
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return mVar;
        }
        Object objN = rVar.N(i.c());
        final f fVar = objN instanceof f ? (f) objN : null;
        if (fVar == null) {
            px.f.f163100a.b("Could not register scroll target: " + field_index + ". LocalScrollController for this <FIELD_INDEX> was not found.", v.e(z.f188762a.c()));
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return mVar;
        }
        int i16 = (i15 & 112) ^ 48;
        boolean zW = ((i16 > 32 && rVar.W(field_index)) || (i15 & 48) == 32) | rVar.W(fVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = fVar.b(field_index);
            rVar.v(objE);
        }
        j1.a aVar = (j1.a) objE;
        boolean zG = rVar.G(fVar) | ((i16 > 32 && rVar.G(field_index)) || (i15 & 48) == 32);
        Object objE2 = rVar.E();
        if (zG || objE2 == r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: d60.l
                @Override // er.l
                public final Object b(Object obj) {
                    return m.f(fVar, field_index, (s0) obj);
                }
            };
            rVar.v(objE2);
        }
        Function0.b(field_index, fVar, (er.l) objE2, rVar, (i15 >> 3) & 14);
        f3.m mVarB = j1.e.b(mVar, aVar);
        if (t.k()) {
            t.n();
        }
        rVar.R();
        return mVarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 f(f fVar, Object obj, s0 s0Var) {
        return new a(fVar, obj);
    }
}
