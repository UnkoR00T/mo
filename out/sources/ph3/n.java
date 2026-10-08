package ph3;

import androidx.compose.ui.platform.g1;
import d1.d3;
import d1.h0;
import d1.r3;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.j0;
import p036e4.v0;
import p036e4.w0;
import p036e4.x0;
import p036e4.y0;
import p047f5.a0;
import p047f5.e0;
import p047f5.f0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.x5;
import w0.i1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\b\u001a\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011²\u0006\f\u0010\u0010\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lph3/g;", "viewModel", "Loq/i0;", "i", "(Lph3/g;Lm2/r;I)V", "Lph3/g$a;", "data", "n", "(Lph3/g$a;Lm2/r;I)V", "l", "Lf3/m;", "modifier", "Lh30/a;", "buttonData", "g", "(Lf3/m;Lh30/a;Lm2/r;I)V", "state", "vehiclecollision_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Le4/y0;", "", "Le4/v0;", "measurables", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;"}, k = 3, mv = {2, 2, 0})
    public static final class a implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a3 f157807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f157808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p047f5.p f157809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f157810d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ a3 f157811e;

        /* JADX INFO: renamed from: ph3.n$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 2, 0})
        static final class C3913a extends fr.w implements er.l<a2.a, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a0 f157812b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f157813c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Map f157814d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3913a(a0 a0Var, List list, Map map) {
                super(1);
                this.f157812b = a0Var;
                this.f157813c = list;
                this.f157814d = map;
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
                c(aVar);
                return i0.f148189a;
            }

            public final void c(a2.a aVar) {
                this.f157812b.h(aVar, this.f157813c, this.f157814d);
            }
        }

        public a(a3 a3Var, a0 a0Var, p047f5.p pVar, int i15, a3 a3Var2) {
            this.f157807a = a3Var;
            this.f157808b = a0Var;
            this.f157809c = pVar;
            this.f157810d = i15;
            this.f157811e = a3Var2;
        }

        @Override // p036e4.w0
        public final x0 e(y0 y0Var, List<? extends v0> list, long j15) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.f157807a.getValue();
            long jI = this.f157808b.i(j15, y0Var.getLayoutDirection(), this.f157809c, list, linkedHashMap, this.f157810d);
            this.f157811e.getValue();
            return y0.j2(y0Var, c5.r.g(jI), c5.r.f(jI), null, new C3913a(this.f157808b, list, linkedHashMap), 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 2, 0})
    static final class b extends fr.w implements er.a<i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a3 f157815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p047f5.p f157816c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a3 a3Var, p047f5.p pVar) {
            super(0);
            this.f157815b = a3Var;
            this.f157816c = pVar;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            a3 a3Var = this.f157815b;
            a3Var.setValue(Boolean.valueOf(!((Boolean) a3Var.getValue()).booleanValue()));
            this.f157816c.j(true);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln4/i0;", "Loq/i0;", "c", "(Ln4/i0;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends fr.w implements er.l<n4.i0, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f157817b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a0 a0Var) {
            super(1);
            this.f157817b = a0Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(n4.i0 i0Var) {
            c(i0Var);
            return i0.f148189a;
        }

        public final void c(n4.i0 i0Var) {
            e0.a(i0Var, this.f157817b);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "(Lm2/r;I)V"}, k = 3, mv = {2, 2, 0})
    public static final class d extends fr.w implements er.p<p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a3 f157818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p047f5.l f157819c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ er.a f157820d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ph3.g.Data f157821e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a3 a3Var, p047f5.l lVar, er.a aVar, ph3.g.Data data) {
            super(2);
            this.f157818b = a3Var;
            this.f157819c = lVar;
            this.f157820d = aVar;
            this.f157821e = data;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            float zero;
            k70.a aVar;
            p047f5.f fVar;
            int i16;
            f3.m.Companion companion;
            float spacing200;
            p047f5.f fVar2;
            float f15;
            if ((i15 & 3) == 2 && rVar.i()) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(1200550679, i15, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
            }
            this.f157818b.setValue(i0.f148189a);
            int helpersHashCode = this.f157819c.getHelpersHashCode();
            this.f157819c.f();
            p047f5.l lVar = this.f157819c;
            rVar.X(500905321);
            f5.l.b bVarJ = lVar.j();
            p047f5.f fVarA = bVarJ.a();
            p047f5.f fVarE = bVarJ.e();
            p047f5.f fVarF = bVarJ.f();
            p047f5.f fVarG = bVarJ.g();
            p047f5.f fVarH = bVarJ.h();
            p047f5.f fVarI = bVarJ.i();
            p047f5.f fVarJ = bVarJ.j();
            p047f5.f fVarK = bVarJ.k();
            p047f5.f fVarL = bVarJ.l();
            p047f5.f fVarB = bVarJ.b();
            p047f5.f fVarC = bVarJ.c();
            p047f5.f fVarD = bVarJ.d();
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            float spacing600 = aVar2.b(rVar, i17).getSpacing600();
            f3.m.Companion companion2 = f3.m.INSTANCE;
            Object objE = rVar.E();
            p076m2.r.Companion companion3 = p076m2.r.INSTANCE;
            if (objE == companion3.a()) {
                objE = e.f157822a;
                rVar.v(objE);
            }
            f3.m mVarH = lVar.h(companion2, fVarA, (er.l) objE);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarH);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            d1.x xVar = d1.x.f39368a;
            Integer vehicleImageRes = this.f157821e.getVehicleImageRes();
            if (vehicleImageRes == null) {
                rVar.X(-1228526977);
                rVar.R();
                fVar = fVarC;
                aVar = aVar2;
                i16 = i17;
                companion = companion2;
            } else {
                rVar.X(-1228526976);
                int iIntValue = vehicleImageRes.intValue();
                float spacing700 = aVar2.b(rVar, i17).getSpacing700();
                if (this.f157821e.getIsTopSpaceOfImageRequired()) {
                    rVar.X(-1953747205);
                    rVar.R();
                    zero = spacing700;
                } else {
                    rVar.X(-1953745966);
                    zero = aVar2.b(rVar, i17).getZero();
                    rVar.R();
                }
                aVar = aVar2;
                fVar = fVarC;
                i16 = i17;
                companion = companion2;
                i1.c(l4.c.c(iIntValue, rVar, 0), null, d1.a3.q(companion2, spacing700, zero, spacing700, spacing700), null, null, 0.0f, null, rVar, androidx.compose.ui.graphics.painter.a.f9956g | 48, 120);
                rVar.R();
            }
            rVar.x();
            f3.m mVarH2 = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            if (this.f157821e.getIsTopSpaceOfImageRequired()) {
                rVar.X(2094400514);
                spacing200 = aVar.b(rVar, i16).getZero();
                rVar.R();
            } else {
                rVar.X(2094401960);
                spacing200 = aVar.b(rVar, i16).getSpacing200();
                rVar.R();
            }
            f3.m mVarI = androidx.compose.foundation.layout.d.i(mVarH2, spacing200);
            Object objE2 = rVar.E();
            if (objE2 == companion3.a()) {
                objE2 = j.f157831a;
                rVar.v(objE2);
            }
            r3.a(lVar.h(mVarI, fVarE, (er.l) objE2), rVar, 0);
            boolean zW = rVar.W(fVarE);
            Object objE3 = rVar.E();
            if (zW || objE3 == companion3.a()) {
                objE3 = new k(fVarE);
                rVar.v(objE3);
            }
            d1.r.b(lVar.h(companion, fVarF, (er.l) objE3), rVar, 0);
            Map<sv0.v0, ButtonData> mapC = this.f157821e.c();
            ButtonData buttonData = mapC != null ? mapC.get(sv0.v0.FRONT_DAMAGE) : null;
            if (buttonData == null) {
                rVar.X(502460155);
                rVar.R();
                fVar2 = fVarA;
            } else {
                rVar.X(502460156);
                fVar2 = fVarA;
                boolean zW2 = rVar.W(fVarF) | rVar.W(fVar2);
                Object objE4 = rVar.E();
                if (zW2 || objE4 == companion3.a()) {
                    objE4 = new l(fVarF, fVar2);
                    rVar.v(objE4);
                }
                n.g(lVar.h(companion, fVarG, (er.l) objE4), buttonData, rVar, 0);
                rVar.R();
            }
            Map<sv0.v0, ButtonData> mapC2 = this.f157821e.c();
            ButtonData buttonData2 = mapC2 != null ? mapC2.get(sv0.v0.BACK_DAMAGE) : null;
            if (buttonData2 == null) {
                rVar.X(502782214);
            } else {
                rVar.X(502782215);
                boolean zW3 = rVar.W(fVar2);
                Object objE5 = rVar.E();
                if (zW3 || objE5 == companion3.a()) {
                    objE5 = new m(fVar2);
                    rVar.v(objE5);
                }
                n.g(lVar.h(companion, fVarH, (er.l) objE5), buttonData2, rVar, 0);
            }
            rVar.R();
            Map<sv0.v0, ButtonData> mapC3 = this.f157821e.c();
            ButtonData buttonData3 = mapC3 != null ? mapC3.get(sv0.v0.LEFT_FRONT_DAMAGE) : null;
            if (buttonData3 == null) {
                rVar.X(503100646);
                rVar.R();
                f15 = spacing600;
            } else {
                rVar.X(503100647);
                f15 = r17;
                boolean zW4 = rVar.W(fVarF) | rVar.b(f15) | rVar.W(fVar2);
                Object objE6 = rVar.E();
                if (zW4 || objE6 == companion3.a()) {
                    objE6 = new C3914n(fVarF, f15, fVar2);
                    rVar.v(objE6);
                }
                n.g(lVar.h(companion, fVarI, (er.l) objE6), buttonData3, rVar, 0);
                rVar.R();
            }
            Map<sv0.v0, ButtonData> mapC4 = this.f157821e.c();
            ButtonData buttonData4 = mapC4 != null ? mapC4.get(sv0.v0.RIGHT_FRONT_DAMAGE) : null;
            if (buttonData4 == null) {
                rVar.X(503450729);
            } else {
                rVar.X(503450730);
                boolean zW5 = rVar.W(fVarF) | rVar.b(f15) | rVar.W(fVar2);
                Object objE7 = rVar.E();
                if (zW5 || objE7 == companion3.a()) {
                    objE7 = new o(fVarF, f15, fVar2);
                    rVar.v(objE7);
                }
                n.g(lVar.h(companion, fVarJ, (er.l) objE7), buttonData4, rVar, 0);
            }
            rVar.R();
            Map<sv0.v0, ButtonData> mapC5 = this.f157821e.c();
            ButtonData buttonData5 = mapC5 != null ? mapC5.get(sv0.v0.LEFT_SIDE_DAMAGE) : null;
            if (buttonData5 == null) {
                rVar.X(503795666);
            } else {
                rVar.X(503795667);
                boolean zW6 = rVar.W(fVar2) | rVar.W(fVarF);
                Object objE8 = rVar.E();
                if (zW6 || objE8 == companion3.a()) {
                    objE8 = new p(fVar2, fVarF);
                    rVar.v(objE8);
                }
                n.g(lVar.h(companion, fVarK, (er.l) objE8), buttonData5, rVar, 0);
            }
            rVar.R();
            Map<sv0.v0, ButtonData> mapC6 = this.f157821e.c();
            ButtonData buttonData6 = mapC6 != null ? mapC6.get(sv0.v0.TOP_DAMAGE) : null;
            if (buttonData6 == null) {
                rVar.X(504126126);
            } else {
                rVar.X(504126127);
                boolean zW7 = rVar.W(fVarF) | rVar.W(fVar2);
                Object objE9 = rVar.E();
                if (zW7 || objE9 == companion3.a()) {
                    objE9 = new f(fVarF, fVar2);
                    rVar.v(objE9);
                }
                n.g(lVar.h(companion, fVarL, (er.l) objE9), buttonData6, rVar, 0);
            }
            rVar.R();
            Map<sv0.v0, ButtonData> mapC7 = this.f157821e.c();
            ButtonData buttonData7 = mapC7 != null ? mapC7.get(sv0.v0.RIGHT_SIDE_DAMAGE) : null;
            if (buttonData7 == null) {
                rVar.X(504467157);
            } else {
                rVar.X(504467158);
                boolean zW8 = rVar.W(fVar2) | rVar.W(fVarF);
                Object objE10 = rVar.E();
                if (zW8 || objE10 == companion3.a()) {
                    objE10 = new g(fVar2, fVarF);
                    rVar.v(objE10);
                }
                n.g(lVar.h(companion, fVarB, (er.l) objE10), buttonData7, rVar, 0);
            }
            rVar.R();
            Map<sv0.v0, ButtonData> mapC8 = this.f157821e.c();
            ButtonData buttonData8 = mapC8 != null ? mapC8.get(sv0.v0.LEFT_BACK_DAMAGE) : null;
            if (buttonData8 == null) {
                rVar.X(504800469);
            } else {
                rVar.X(504800470);
                boolean zW9 = rVar.W(fVar2) | rVar.b(f15);
                Object objE11 = rVar.E();
                if (zW9 || objE11 == companion3.a()) {
                    objE11 = new h(fVar2, f15);
                    rVar.v(objE11);
                }
                n.g(lVar.h(companion, fVar, (er.l) objE11), buttonData8, rVar, 0);
            }
            rVar.R();
            Map<sv0.v0, ButtonData> mapC9 = this.f157821e.c();
            ButtonData buttonData9 = mapC9 != null ? mapC9.get(sv0.v0.RIGHT_BACK_DAMAGE) : null;
            if (buttonData9 == null) {
                rVar.X(505134680);
            } else {
                rVar.X(505134681);
                boolean zW10 = rVar.W(fVar2) | rVar.b(f15);
                Object objE12 = rVar.E();
                if (zW10 || objE12 == companion3.a()) {
                    objE12 = new i(fVar2, f15);
                    rVar.v(objE12);
                }
                n.g(lVar.h(companion, fVarD, (er.l) objE12), buttonData9, rVar, 0);
            }
            rVar.R();
            rVar.R();
            if (this.f157819c.getHelpersHashCode() != helpersHashCode) {
                Function0.g(this.f157820d, rVar, 6);
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f157822a = new e();

        e() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.e.b(eVar, eVar.getParent(), 0.0f, 2, null);
            p047f5.e.d(eVar, eVar.getParent(), 0.0f, 2, null);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f157823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p047f5.f f157824b;

        f(p047f5.f fVar, p047f5.f fVar2) {
            this.f157823a = fVar;
            this.f157824b = fVar2;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.e.d(eVar, this.f157823a, 0.0f, 2, null);
            p047f5.e.b(eVar, this.f157824b, 0.0f, 2, null);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f157825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p047f5.f f157826b;

        g(p047f5.f fVar, p047f5.f fVar2) {
            this.f157825a = fVar;
            this.f157826b = fVar2;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            f0.b(eVar.getEnd(), this.f157825a.getEnd(), 0.0f, 0.0f, 6, null);
            p047f5.e.d(eVar, this.f157826b, 0.0f, 2, null);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f157827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f157828b;

        h(p047f5.f fVar, float f15) {
            this.f157827a = fVar;
            this.f157828b = f15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.w.a(eVar.getBottom(), this.f157827a.getBottom(), this.f157828b, 0.0f, 4, null);
            f0.b(eVar.getStart(), this.f157827a.getStart(), 0.0f, 0.0f, 6, null);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f157829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f157830b;

        i(p047f5.f fVar, float f15) {
            this.f157829a = fVar;
            this.f157830b = f15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.w.a(eVar.getBottom(), this.f157829a.getBottom(), this.f157830b, 0.0f, 4, null);
            f0.b(eVar.getEnd(), this.f157829a.getEnd(), 0.0f, 0.0f, 6, null);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class j implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f157831a = new j();

        j() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.w.a(eVar.getTop(), eVar.getParent().getTop(), 0.0f, 0.0f, 6, null);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f157832a;

        k(p047f5.f fVar) {
            this.f157832a = fVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.w.a(eVar.getTop(), this.f157832a.getBottom(), 0.0f, 0.0f, 6, null);
            p047f5.w.a(eVar.getBottom(), eVar.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            p047f5.t.Companion companion = p047f5.t.INSTANCE;
            eVar.q(companion.a());
            eVar.o(companion.a());
            p047f5.e.b(eVar, eVar.getParent(), 0.0f, 2, null);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class l implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f157833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p047f5.f f157834b;

        l(p047f5.f fVar, p047f5.f fVar2) {
            this.f157833a = fVar;
            this.f157834b = fVar2;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.w.a(eVar.getTop(), this.f157833a.getTop(), 0.0f, 0.0f, 6, null);
            p047f5.e.b(eVar, this.f157834b, 0.0f, 2, null);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class m implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f157835a;

        m(p047f5.f fVar) {
            this.f157835a = fVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.w.a(eVar.getBottom(), this.f157835a.getBottom(), 0.0f, 0.0f, 6, null);
            p047f5.e.b(eVar, this.f157835a, 0.0f, 2, null);
        }
    }

    /* JADX INFO: renamed from: ph3.n$n, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3914n implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f157836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f157837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p047f5.f f157838c;

        C3914n(p047f5.f fVar, float f15, p047f5.f fVar2) {
            this.f157836a = fVar;
            this.f157837b = f15;
            this.f157838c = fVar2;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.w.a(eVar.getTop(), this.f157836a.getTop(), this.f157837b, 0.0f, 4, null);
            f0.b(eVar.getStart(), this.f157838c.getStart(), 0.0f, 0.0f, 6, null);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class o implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f157839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f157840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p047f5.f f157841c;

        o(p047f5.f fVar, float f15, p047f5.f fVar2) {
            this.f157839a = fVar;
            this.f157840b = f15;
            this.f157841c = fVar2;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.w.a(eVar.getTop(), this.f157839a.getTop(), this.f157840b, 0.0f, 4, null);
            f0.b(eVar.getEnd(), this.f157841c.getEnd(), 0.0f, 0.0f, 6, null);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class p implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f157842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p047f5.f f157843b;

        p(p047f5.f fVar, p047f5.f fVar2) {
            this.f157842a = fVar;
            this.f157843b = fVar2;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            f0.b(eVar.getStart(), this.f157842a.getStart(), 0.0f, 0.0f, 6, null);
            p047f5.e.d(eVar, this.f157843b, 0.0f, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(final f3.m mVar, ButtonData buttonData, p076m2.r rVar, final int i15) {
        int i16;
        final ButtonData buttonData2;
        p076m2.r rVarH = rVar.h(-393207580);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(buttonData) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-393207580, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehicledamagedetails.DamageBoxButton (VehicleDamageDetailsScreen.kt:250)");
            }
            float f15 = 48;
            f3.m mVarI = androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.y(mVar, c5.h.n(f15)), c5.h.n(f15));
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.e(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarI);
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
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            buttonData2 = buttonData;
            h30.q.p(buttonData2, false, null, rVarH, (i16 >> 3) & 14, 6);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            buttonData2 = buttonData;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ph3.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.h(mVar, buttonData2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(f3.m mVar, ButtonData buttonData, int i15, p076m2.r rVar, int i16) {
        g(mVar, buttonData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void i(final ph3.g gVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(619707504);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(619707504, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehicledamagedetails.VehicleDamageDetailsScreen (VehicleDamageDetailsScreen.kt:43)");
            }
            n(j(m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ph3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.k(gVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final ph3.g.Data j(f6<ph3.g.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(ph3.g gVar, int i15, p076m2.r rVar, int i16) {
        i(gVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void l(final ph3.g.Data data, p076m2.r rVar, final int i15) {
        int i16;
        Object aVar;
        p076m2.r rVarH = rVar.h(-1091860203);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1091860203, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehicledamagedetails.VehicleDamageDetailsView (VehicleDamageDetailsScreen.kt:97)");
            }
            f3.m mVarF = androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null);
            rVarH.X(-1003410150);
            rVarH.X(212064437);
            rVarH.R();
            c5.d dVar = (c5.d) rVarH.N(g1.f());
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new a0(dVar);
                rVarH.v(objE);
            }
            a0 a0Var = (a0) objE;
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = new p047f5.l();
                rVarH.v(objE2);
            }
            p047f5.l lVar = (p047f5.l) objE2;
            Object objE3 = rVarH.E();
            if (objE3 == companion.a()) {
                objE3 = c6.e(Boolean.FALSE, null, 2, null);
                rVarH.v(objE3);
            }
            a3 a3Var = (a3) objE3;
            Object objE4 = rVarH.E();
            if (objE4 == companion.a()) {
                objE4 = new p047f5.p(lVar);
                rVarH.v(objE4);
            }
            p047f5.p pVar = (p047f5.p) objE4;
            Object objE5 = rVarH.E();
            if (objE5 == companion.a()) {
                objE5 = x5.i(i0.f148189a, x5.k());
                rVarH.v(objE5);
            }
            a3 a3Var2 = (a3) objE5;
            boolean zG = rVarH.G(a0Var) | rVarH.c(257);
            Object objE6 = rVarH.E();
            if (zG || objE6 == companion.a()) {
                aVar = new a(a3Var2, a0Var, pVar, 257, a3Var);
                rVarH.v(aVar);
            } else {
                aVar = objE6;
            }
            w0 w0Var = (w0) aVar;
            Object objE7 = rVarH.E();
            if (objE7 == companion.a()) {
                objE7 = new b(a3Var, pVar);
                rVarH.v(objE7);
            }
            er.a aVar2 = (er.a) objE7;
            boolean zG2 = rVarH.G(a0Var);
            Object objE8 = rVarH.E();
            if (zG2 || objE8 == companion.a()) {
                objE8 = new c(a0Var);
                rVarH.v(objE8);
            }
            j0.a(n4.v.d(mVarF, false, (er.l) objE8, 1, null), y2.m.d(1200550679, true, new d(a3Var2, lVar, aVar2, data), rVarH, 54), w0Var, rVarH, 48, 0);
            rVarH.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ph3.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.m(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(ph3.g.Data data, int i15, p076m2.r rVar, int i16) {
        l(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void n(final ph3.g.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1930454256);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1930454256, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehicledamagedetails.VehicleDetailsContent (VehicleDamageDetailsScreen.kt:55)");
            }
            rVar2 = rVarH;
            i50.s.r(data.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(307801149, true, new er.q() { // from class: ph3.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return n.o(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ph3.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.q(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(final ph3.g.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(307801149, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehicledamagedetails.VehicleDetailsContent.<anonymous> (VehicleDamageDetailsScreen.kt:59)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = d1.a3.l(companion, d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarN = t70.s.n(androidx.compose.foundation.layout.d.f(w0.i.d(mVarL, aVar.a(rVar, i17).getBase().a(), null, 2, null), 0.0f, 1, null), rVar, 0);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarD = iVar.d();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarD, companion2.k(), rVar, 6);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            f3.m mVarS = t70.i.S(h0.b(d1.i0.f39176a, androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), 1.0f, false, 2, null), null, rVar, 0, 1);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarS);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            p076m2.r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            j70.h.g(null, null, data.getHeader(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            l(data, rVar, 0);
            if (data.getValidationState() instanceof hz.b.Invalid) {
                rVar.X(448350738);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
                d60.m.c(ph3.e.f157784a, y2.m.d(1037950288, true, new er.p() { // from class: ph3.k
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return n.p(data, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar, 54), rVar, 54);
            } else {
                rVar.X(445044185);
            }
            rVar.R();
            rVar.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            h30.q.p(data.getButtonNextData(), false, null, rVar, 0, 6);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(ph3.g.Data data, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1037950288, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehicledamagedetails.VehicleDetailsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleDamageDetailsScreen.kt:84)");
            }
            l40.d.d(null, ((hz.b.Invalid) data.getValidationState()).getMessage(), false, rVar, 0, 5);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(ph3.g.Data data, int i15, p076m2.r rVar, int i16) {
        n(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
