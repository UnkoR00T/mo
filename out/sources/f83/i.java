package f83;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.g1;
import androidx.compose.ui.platform.u1;
import d1.d3;
import d1.r3;
import e70.CameraPermissionNotGrantedData;
import f70.QrScannerData;
import g30.ModalBottomSheetData;
import h30.ButtonData;
import h83.FrameData;
import i50.BaseScaffoldData;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ju.p0;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lf83/c;", "viewModel", "Loq/i0;", "f", "(Lf83/c;Lm2/r;I)V", "Lf83/c$a;", "data", "i", "(Lf83/c$a;Lm2/r;I)V", "studentschoolcardactivation_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f60182e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f83.c.Data f60183f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ d60.c f60184g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f83.c.Data data, d60.c cVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f60183f = data;
            this.f60184g = cVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f60182e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (this.f60183f.getBottomSheetContentData().getShowCodeBottomSheetDialog()) {
                this.f60184g.l();
            } else {
                this.f60184g.g();
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f60183f, this.f60184g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f60185a = new b();

        b() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.w.a(eVar.getTop(), eVar.getParent().getTop(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getStart(), eVar.getParent().getStart(), 0.0f, 0.0f, 6, null);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f60186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p047f5.f f60187b;

        c(p047f5.f fVar, p047f5.f fVar2) {
            this.f60186a = fVar;
            this.f60187b = fVar2;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.w.a(eVar.getTop(), this.f60186a.getBottom(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getEnd(), eVar.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getStart(), eVar.getParent().getStart(), 0.0f, 0.0f, 6, null);
            p047f5.w.a(eVar.getBottom(), this.f60187b.getTop(), 0.0f, 0.0f, 6, null);
            eVar.o(p047f5.t.INSTANCE.a());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f60188a;

        d(p047f5.f fVar) {
            this.f60188a = fVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.w.a(eVar.getTop(), this.f60188a.getTop(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getEnd(), this.f60188a.getEnd(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getStart(), this.f60188a.getStart(), 0.0f, 0.0f, 6, null);
            p047f5.w.a(eVar.getBottom(), this.f60188a.getBottom(), 0.0f, 0.0f, 6, null);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f60189a = new e();

        e() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            f0.b(eVar.getEnd(), eVar.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getStart(), eVar.getParent().getStart(), 0.0f, 0.0f, 6, null);
            p047f5.w.a(eVar.getBottom(), eVar.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Le4/y0;", "", "Le4/v0;", "measurables", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;"}, k = 3, mv = {2, 2, 0})
    public static final class f implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a3 f60190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f60191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p047f5.p f60192c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f60193d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ a3 f60194e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 2, 0})
        static final class a extends fr.w implements er.l<a2.a, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a0 f60195b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f60196c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Map f60197d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a0 a0Var, List list, Map map) {
                super(1);
                this.f60195b = a0Var;
                this.f60196c = list;
                this.f60197d = map;
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
                c(aVar);
                return i0.f148189a;
            }

            public final void c(a2.a aVar) {
                this.f60195b.h(aVar, this.f60196c, this.f60197d);
            }
        }

        public f(a3 a3Var, a0 a0Var, p047f5.p pVar, int i15, a3 a3Var2) {
            this.f60190a = a3Var;
            this.f60191b = a0Var;
            this.f60192c = pVar;
            this.f60193d = i15;
            this.f60194e = a3Var2;
        }

        @Override // p036e4.w0
        public final x0 e(y0 y0Var, List<? extends v0> list, long j15) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.f60190a.getValue();
            long jI = this.f60191b.i(j15, y0Var.getLayoutDirection(), this.f60192c, list, linkedHashMap, this.f60193d);
            this.f60194e.getValue();
            return y0.j2(y0Var, c5.r.g(jI), c5.r.f(jI), null, new a(this.f60191b, list, linkedHashMap), 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 2, 0})
    static final class g extends fr.w implements er.a<i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a3 f60198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p047f5.p f60199c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(a3 a3Var, p047f5.p pVar) {
            super(0);
            this.f60198b = a3Var;
            this.f60199c = pVar;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            a3 a3Var = this.f60198b;
            a3Var.setValue(Boolean.valueOf(!((Boolean) a3Var.getValue()).booleanValue()));
            this.f60199c.j(true);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln4/i0;", "Loq/i0;", "c", "(Ln4/i0;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends fr.w implements er.l<n4.i0, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f60200b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(a0 a0Var) {
            super(1);
            this.f60200b = a0Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(n4.i0 i0Var) {
            c(i0Var);
            return i0.f148189a;
        }

        public final void c(n4.i0 i0Var) {
            e0.a(i0Var, this.f60200b);
        }
    }

    /* JADX INFO: renamed from: f83.i$i, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "(Lm2/r;I)V"}, k = 3, mv = {2, 2, 0})
    public static final class C1358i extends fr.w implements er.p<p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a3 f60201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p047f5.l f60202c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ er.a f60203d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f83.c.Data f60204e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1358i(a3 a3Var, p047f5.l lVar, er.a aVar, f83.c.Data data) {
            super(2);
            this.f60201b = a3Var;
            this.f60202c = lVar;
            this.f60203d = aVar;
            this.f60204e = data;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            if ((i15 & 3) == 2 && rVar.i()) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(1200550679, i15, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
            }
            this.f60201b.setValue(i0.f148189a);
            int helpersHashCode = this.f60202c.getHelpersHashCode();
            this.f60202c.f();
            p047f5.l lVar = this.f60202c;
            rVar.X(1500009479);
            f5.l.b bVarJ = lVar.j();
            p047f5.f fVarA = bVarJ.a();
            p047f5.f fVarE = bVarJ.e();
            bVarJ.f();
            p047f5.f fVarG = bVarJ.g();
            p047f5.f fVarH = bVarJ.h();
            f3.m.Companion companion = f3.m.INSTANCE;
            Object objE = rVar.E();
            p076m2.r.Companion companion2 = p076m2.r.INSTANCE;
            if (objE == companion2.a()) {
                objE = b.f60185a;
                rVar.v(objE);
            }
            f3.m mVarH = lVar.h(companion, fVarA, (er.l) objE);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(d1.a3.r(mVarH, 0.0f, 0.0f, 0.0f, aVar.b(rVar, i16).getSpacing200(), 7, null), null, this.f60204e.getTopText(), null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.f()), 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar, 0, 0, 0, 33550330);
            p076m2.r rVar2 = rVar;
            boolean zW = rVar2.W(fVarA) | rVar2.W(fVarH);
            Object objE2 = rVar2.E();
            if (zW || objE2 == companion2.a()) {
                objE2 = new c(fVarA, fVarH);
                rVar2.v(objE2);
            }
            f3.m mVarD = w0.i.d(k3.f.a(lVar.h(companion, fVarE, (er.l) objE2), aVar.e(rVar2, i16).getRadius300()), Color.INSTANCE.a(), null, 2, null);
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion3.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarD);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC = n6.c(rVar2);
            n6.i(rVarC, w0VarI, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            d1.x xVar = d1.x.f39368a;
            if (this.f60204e.getCameraPermissionNotGrantedData() == null) {
                rVar2.X(1888831098);
                f70.b.b(this.f60204e.getScannerData(), this.f60204e.getConnector(), ((Boolean) rVar2.N(u1.a())).booleanValue(), rVar2, QrScannerData.f59729c, 0);
                rVar2.R();
            } else {
                rVar2.X(1889031823);
                f3.m mVarD2 = xVar.d(companion, companion3.e());
                w0 w0VarI2 = d1.r.i(companion3.o(), false);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar2, 0));
                p076m2.e0 e0VarT2 = rVar2.t();
                f3.m mVarE2 = f3.j.e(rVar2, mVarD2);
                er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
                if (rVar2.l() == null) {
                    p076m2.m.d();
                }
                rVar2.K();
                if (rVar2.getInserting()) {
                    rVar2.H(aVarB2);
                } else {
                    rVar2.u();
                }
                p076m2.r rVarC2 = n6.c(rVar2);
                n6.i(rVarC2, w0VarI2, companion4.d());
                n6.i(rVarC2, e0VarT2, companion4.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
                n6.g(rVarC2, companion4.a());
                n6.i(rVarC2, mVarE2, companion4.e());
                e70.c.b(this.f60204e.getCameraPermissionNotGrantedData(), rVar2, CameraPermissionNotGrantedData.f47914e);
                rVar2.x();
                rVar2.R();
            }
            rVar2.x();
            FrameData frame = this.f60204e.getFrame();
            if (frame == null) {
                rVar2.X(1501436562);
                rVar2.R();
            } else {
                rVar2.X(1501436563);
                boolean zW2 = rVar2.W(fVarE);
                Object objE3 = rVar2.E();
                if (zW2 || objE3 == companion2.a()) {
                    objE3 = new d(fVarE);
                    rVar2.v(objE3);
                }
                f3.m mVarH2 = lVar.h(companion, fVarG, (er.l) objE3);
                w0 w0VarI3 = d1.r.i(companion3.o(), false);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVar2, 0));
                p076m2.e0 e0VarT3 = rVar2.t();
                f3.m mVarE3 = f3.j.e(rVar2, mVarH2);
                er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
                if (rVar2.l() == null) {
                    p076m2.m.d();
                }
                rVar2.K();
                if (rVar2.getInserting()) {
                    rVar2.H(aVarB3);
                } else {
                    rVar2.u();
                }
                p076m2.r rVarC3 = n6.c(rVar2);
                n6.i(rVarC3, w0VarI3, companion4.d());
                n6.i(rVarC3, e0VarT3, companion4.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
                n6.g(rVarC3, companion4.a());
                n6.i(rVarC3, mVarE3, companion4.e());
                i1.c(l4.c.c(frame.getResId(), rVar2, 0), frame.getContentDescription().getText(), null, null, null, 0.0f, null, rVar, androidx.compose.ui.graphics.painter.a.f9956g, 124);
                rVar2 = rVar;
                rVar2.x();
                rVar2.R();
            }
            Object objE4 = rVar2.E();
            if (objE4 == companion2.a()) {
                objE4 = e.f60189a;
                rVar2.v(objE4);
            }
            f3.m mVarR = d1.a3.r(lVar.h(companion, fVarH, (er.l) objE4), 0.0f, aVar.b(rVar2, i16).getSpacing400(), 0.0f, 0.0f, 13, null);
            w0 w0VarI4 = d1.r.i(companion3.o(), r7);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT4 = rVar2.t();
            f3.m mVarE4 = f3.j.e(rVar2, mVarR);
            er.a<androidx.compose.ui.node.c> aVarB4 = companion4.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB4);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC4 = n6.c(rVar2);
            n6.i(rVarC4, w0VarI4, companion4.d());
            n6.i(rVarC4, e0VarT4, companion4.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion4.c());
            n6.g(rVarC4, companion4.a());
            n6.i(rVarC4, mVarE4, companion4.e());
            ButtonData codeButtonData = this.f60204e.getCodeButtonData();
            if (codeButtonData == null) {
                rVar2.X(1641977196);
            } else {
                rVar2.X(1641977197);
                h30.q.p(codeButtonData, false, null, rVar2, 0, 6);
            }
            rVar2.R();
            rVar2.x();
            rVar2.R();
            if (this.f60202c.getHelpersHashCode() != helpersHashCode) {
                Function0.g(this.f60203d, rVar2, 6);
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }
    }

    public static final void f(final f83.c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1391472024);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1391472024, i16, -1, "pl.gov.coi.mobywatel.feature.studentschoolcardactivation.presentation.scanner.ScannerScreen (ScannerScreen.kt:49)");
            }
            f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            oz.l.b(cVar.getLifecycleConnector(), rVarH, 0);
            i(g(f6VarC), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: f83.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.h(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final f83.c.Data g(f6<f83.c.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(f83.c cVar, int i15, p076m2.r rVar, int i16) {
        f(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void i(final f83.c.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-232795765);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-232795765, i16, -1, "pl.gov.coi.mobywatel.feature.studentschoolcardactivation.presentation.scanner.ScannerScreenContent (ScannerScreen.kt:58)");
            }
            g30.t.f(data.getBottomSheetData(), 0.0f, false, null, null, y2.m.d(1393560850, true, new er.p() { // from class: f83.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.j(data, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(1678696753, true, new er.p() { // from class: f83.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.k(data, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, ModalBottomSheetData.f70192e | 1769472, 30);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: f83.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.m(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(f83.c.Data data, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1393560850, i15, -1, "pl.gov.coi.mobywatel.feature.studentschoolcardactivation.presentation.scanner.ScannerScreenContent.<anonymous> (ScannerScreen.kt:62)");
            }
            d60.c cVarB = d60.e.b(false, null, rVar, 6, 2);
            Boolean boolValueOf = Boolean.valueOf(data.getBottomSheetContentData().getShowCodeBottomSheetDialog());
            boolean zG = rVar.G(data) | rVar.W(cVarB);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(data, cVarB, null);
                rVar.v(objE);
            }
            Function0.d(boolValueOf, (er.p) objE, rVar, 0);
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarR = d1.a3.r(k3.f.a(w0.i.d(companion, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().c(), null, 2, null), l1.h.h(aVar.b(rVar, i16).getSpacing50(), aVar.b(rVar, i16).getSpacing50(), 0.0f, 0.0f, 12, null)), 0.0f, 0.0f, 0.0f, aVar.b(rVar, i16).getSpacing200(), 7, null);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.g(), rVar, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            j70.h.g(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), null, data.getBottomSheetContentData().getBottomDialogLabel(), null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).d(), null, null, false, false, null, rVar, 6, 0, 0, 33026010);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            u50.v0.g(data.getBottomSheetContentData().getTextInputData(), cVarB, rVar, v50.c.f203957t, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing400()), rVar, 0);
            h30.q.p(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(data.getBottomSheetContentData().getBottomDialogButton(), null, 2, null), k30.d.a.f107773a, null, data.g(), 35, null), false, null, rVar, 0, 6);
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
    public static final i0 k(final f83.c.Data data, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1678696753, i15, -1, "pl.gov.coi.mobywatel.feature.studentschoolcardactivation.presentation.scanner.ScannerScreenContent.<anonymous> (ScannerScreen.kt:109)");
            }
            i50.s.r(data.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(530964772, true, new er.q() { // from class: f83.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.l(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(f83.c.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(530964772, i16, -1, "pl.gov.coi.mobywatel.feature.studentschoolcardactivation.presentation.scanner.ScannerScreenContent.<anonymous>.<anonymous> (ScannerScreen.kt:113)");
            }
            f3.m mVarL = d1.a3.l(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = d1.a3.p(d1.a3.r(mVarL, 0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null), aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null);
            rVar.X(-1003410150);
            rVar.X(212064437);
            rVar.R();
            c5.d dVar = (c5.d) rVar.N(g1.f());
            Object objE = rVar.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new a0(dVar);
                rVar.v(objE);
            }
            a0 a0Var = (a0) objE;
            Object objE2 = rVar.E();
            if (objE2 == companion.a()) {
                objE2 = new p047f5.l();
                rVar.v(objE2);
            }
            p047f5.l lVar = (p047f5.l) objE2;
            Object objE3 = rVar.E();
            if (objE3 == companion.a()) {
                objE3 = c6.e(Boolean.FALSE, null, 2, null);
                rVar.v(objE3);
            }
            a3 a3Var = (a3) objE3;
            Object objE4 = rVar.E();
            if (objE4 == companion.a()) {
                objE4 = new p047f5.p(lVar);
                rVar.v(objE4);
            }
            p047f5.p pVar = (p047f5.p) objE4;
            Object objE5 = rVar.E();
            if (objE5 == companion.a()) {
                objE5 = x5.i(i0.f148189a, x5.k());
                rVar.v(objE5);
            }
            a3 a3Var2 = (a3) objE5;
            boolean zG = rVar.G(a0Var) | rVar.c(257);
            Object objE6 = rVar.E();
            if (zG || objE6 == companion.a()) {
                Object fVar = new f(a3Var2, a0Var, pVar, 257, a3Var);
                rVar.v(fVar);
                objE6 = fVar;
            }
            w0 w0Var = (w0) objE6;
            Object objE7 = rVar.E();
            if (objE7 == companion.a()) {
                objE7 = new g(a3Var, pVar);
                rVar.v(objE7);
            }
            er.a aVar2 = (er.a) objE7;
            boolean zG2 = rVar.G(a0Var);
            Object objE8 = rVar.E();
            if (zG2 || objE8 == companion.a()) {
                objE8 = new h(a0Var);
                rVar.v(objE8);
            }
            j0.a(n4.v.d(mVarP, false, (er.l) objE8, 1, null), y2.m.d(1200550679, true, new C1358i(a3Var2, lVar, aVar2, data), rVar, 54), w0Var, rVar, 48, 0);
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(f83.c.Data data, int i15, p076m2.r rVar, int i16) {
        i(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
