package ln3;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.g1;
import c5.r;
import d1.i;
import d1.m3;
import d1.q3;
import er.l;
import f3.j;
import f3.m;
import fr.w;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mx.Label;
import n4.v;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.a2;
import p036e4.j0;
import p036e4.v0;
import p036e4.w0;
import p036e4.x0;
import p036e4.y0;
import p047f5.a0;
import p047f5.e0;
import p047f5.f0;
import p047f5.p;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;
import p076m2.x5;
import q4.TextStyle;
import w0.i1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lf3/m;", "modifier", "Ldn3/a;", "validity", "upcomingValidity", "Loq/i0;", "e", "(Lf3/m;Ldn3/a;Ldn3/a;Lm2/r;II)V", "", "isUpcomingValidity", "c", "(Ldn3/a;ZLm2/r;I)V", "Ldn3/b;", "Landroidx/compose/ui/graphics/Color;", "h", "(Ldn3/b;Lm2/r;I)J", "vehicles_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Le4/y0;", "", "Le4/v0;", "measurables", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;"}, k = 3, mv = {2, 2, 0})
    public static final class a implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a3 f118990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f118991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f118992c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f118993d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ a3 f118994e;

        /* JADX INFO: renamed from: ln3.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 2, 0})
        static final class C2897a extends w implements l<a2.a, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a0 f118995b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f118996c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Map f118997d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2897a(a0 a0Var, List list, Map map) {
                super(1);
                this.f118995b = a0Var;
                this.f118996c = list;
                this.f118997d = map;
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
                c(aVar);
                return i0.f148189a;
            }

            public final void c(a2.a aVar) {
                this.f118995b.h(aVar, this.f118996c, this.f118997d);
            }
        }

        public a(a3 a3Var, a0 a0Var, p pVar, int i15, a3 a3Var2) {
            this.f118990a = a3Var;
            this.f118991b = a0Var;
            this.f118992c = pVar;
            this.f118993d = i15;
            this.f118994e = a3Var2;
        }

        @Override // p036e4.w0
        public final x0 e(y0 y0Var, List<? extends v0> list, long j15) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.f118990a.getValue();
            long jI = this.f118991b.i(j15, y0Var.getLayoutDirection(), this.f118992c, list, linkedHashMap, this.f118993d);
            this.f118994e.getValue();
            return y0.j2(y0Var, r.g(jI), r.f(jI), null, new C2897a(this.f118991b, list, linkedHashMap), 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 2, 0})
    static final class b extends w implements er.a<i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a3 f118998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f118999c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a3 a3Var, p pVar) {
            super(0);
            this.f118998b = a3Var;
            this.f118999c = pVar;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            a3 a3Var = this.f118998b;
            a3Var.setValue(Boolean.valueOf(!((Boolean) a3Var.getValue()).booleanValue()));
            this.f118999c.j(true);
        }
    }

    /* JADX INFO: renamed from: ln3.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln4/i0;", "Loq/i0;", "c", "(Ln4/i0;)V"}, k = 3, mv = {2, 2, 0})
    static final class C2898c extends w implements l<n4.i0, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f119000b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2898c(a0 a0Var) {
            super(1);
            this.f119000b = a0Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(n4.i0 i0Var) {
            c(i0Var);
            return i0.f148189a;
        }

        public final void c(n4.i0 i0Var) {
            e0.a(i0Var, this.f119000b);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "(Lm2/r;I)V"}, k = 3, mv = {2, 2, 0})
    public static final class d extends w implements er.p<p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a3 f119001b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p047f5.l f119002c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ er.a f119003d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ dn3.a f119004e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ dn3.a f119005f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a3 a3Var, p047f5.l lVar, er.a aVar, dn3.a aVar2, dn3.a aVar3) {
            super(2);
            this.f119001b = a3Var;
            this.f119002c = lVar;
            this.f119003d = aVar;
            this.f119004e = aVar2;
            this.f119005f = aVar3;
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
            if (t.k()) {
                t.o(1200550679, i15, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
            }
            this.f119001b.setValue(i0.f148189a);
            int helpersHashCode = this.f119002c.getHelpersHashCode();
            this.f119002c.f();
            p047f5.l lVar = this.f119002c;
            rVar.X(461020611);
            f5.l.b bVarJ = lVar.j();
            p047f5.f fVarA = bVarJ.a();
            p047f5.f fVarE = bVarJ.e();
            p047f5.f fVarF = bVarJ.f();
            androidx.compose.ui.graphics.painter.a aVarC = l4.c.c(this.f119004e.getStatus().getIconResId(), rVar, 0);
            m.Companion companion = m.INSTANCE;
            m mVarT = androidx.compose.foundation.layout.d.t(companion, h60.g.MSmall.getDimension());
            boolean zW = rVar.W(fVarE);
            Object objE = rVar.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new e(fVarE);
                rVar.v(objE);
            }
            i1.c(aVarC, null, lVar.h(mVarT, fVarA, (l) objE), null, null, 0.0f, null, rVar, androidx.compose.ui.graphics.painter.a.f9956g | 48, 120);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            m mVarR = d1.a3.r(companion, aVar.b(rVar, i16).getSpacing100(), 0.0f, 0.0f, 0.0f, 14, null);
            boolean zW2 = rVar.W(fVarA);
            Object objE2 = rVar.E();
            if (zW2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new f(fVarA);
                rVar.v(objE2);
            }
            j70.h.g(lVar.h(mVarR, fVarE, (l) objE2), null, this.f119004e.getTitle(), null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).h(), null, null, false, false, null, rVar, 0, 0, 0, 33030106);
            m mVarR2 = d1.a3.r(companion, aVar.b(rVar, i16).getSpacing100(), aVar.b(rVar, i16).getSpacing50(), 0.0f, 0.0f, 12, null);
            boolean zW3 = rVar.W(fVarE);
            Object objE3 = rVar.E();
            if (zW3 || objE3 == p076m2.r.INSTANCE.a()) {
                objE3 = new g(fVarE);
                rVar.v(objE3);
            }
            m mVarH = lVar.h(mVarR2, fVarF, (l) objE3);
            w0 w0VarA = d1.e0.a(i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, mVarH);
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
            c.c(this.f119004e, false, rVar, 48);
            dn3.a aVar2 = this.f119005f;
            if ((aVar2 != null ? aVar2.getDateLabel() : null) != null) {
                rVar.X(635508323);
                c.c(this.f119005f, true, rVar, 48);
            } else {
                rVar.X(633259862);
            }
            rVar.R();
            rVar.x();
            rVar.R();
            if (this.f119002c.getHelpersHashCode() != helpersHashCode) {
                Function0.g(this.f119003d, rVar, 6);
            }
            if (t.k()) {
                t.n();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f119006a;

        e(p047f5.f fVar) {
            this.f119006a = fVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.w.a(eVar.getTop(), this.f119006a.getTop(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getStart(), eVar.getParent().getStart(), 0.0f, 0.0f, 6, null);
            p047f5.w.a(eVar.getBottom(), this.f119006a.getBottom(), 0.0f, 0.0f, 6, null);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f implements l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f119007a;

        f(p047f5.f fVar) {
            this.f119007a = fVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.w.a(eVar.getTop(), eVar.getParent().getTop(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getStart(), this.f119007a.getEnd(), 0.0f, 0.0f, 6, null);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g implements l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f119008a;

        g(p047f5.f fVar) {
            this.f119008a = fVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.w.a(eVar.getTop(), this.f119008a.getBottom(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getStart(), this.f119008a.getStart(), 0.0f, 0.0f, 6, null);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f119009a;

        static {
            int[] iArr = new int[dn3.b.values().length];
            try {
                iArr[dn3.b.INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[dn3.b.VALID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[dn3.b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f119009a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final dn3.a aVar, final boolean z15, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        long jM20unboximpl;
        long jM20unboximpl2;
        p076m2.r rVarH = rVar.h(-1543034210);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.a(z15) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1543034210, i16, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.screens.vehicledetails.component.ValidLabel (ValidityInfo.kt:78)");
            }
            i iVar = i.f39152a;
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            i.f fVarR = iVar.r(aVar2.b(rVarH, i17).getSpacing50());
            m.Companion companion = m.INSTANCE;
            w0 w0VarB = m3.b(fVarR, f3.c.INSTANCE.l(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarB, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            q3 q3Var = q3.f39261a;
            Label label = aVar.getLabel();
            TextStyle textStyleF = aVar2.f(rVarH, i17).f();
            Color colorM0boximpl = Color.m0boximpl(h(aVar.getStatus(), rVarH, 0));
            colorM0boximpl.m20unboximpl();
            if (!z15) {
                colorM0boximpl = null;
            }
            if (colorM0boximpl == null) {
                rVarH.X(-1356130580);
                jM20unboximpl = aVar2.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
                rVarH.R();
            } else {
                rVarH.X(-1356133339);
                rVarH.R();
                jM20unboximpl = colorM0boximpl.m20unboximpl();
            }
            j70.h.g(null, null, label, null, null, jM20unboximpl, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleF, null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            Label dateLabel = aVar.getDateLabel();
            TextStyle textStyleE = aVar2.f(rVarH, i17).e();
            Color colorM0boximpl2 = Color.m0boximpl(h(aVar.getStatus(), rVarH, 0));
            colorM0boximpl2.m20unboximpl();
            Color color = z15 ? colorM0boximpl2 : null;
            if (color == null) {
                rVarH.X(-1356123796);
                jM20unboximpl2 = aVar2.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
                rVarH.R();
            } else {
                rVarH.X(-1356126555);
                rVarH.R();
                jM20unboximpl2 = color.m20unboximpl();
            }
            rVar2 = rVarH;
            j70.h.g(null, null, dateLabel, null, null, jM20unboximpl2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleE, null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ln3.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c.d(aVar, z15, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(dn3.a aVar, boolean z15, int i15, p076m2.r rVar, int i16) {
        c(aVar, z15, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void e(m mVar, final dn3.a aVar, dn3.a aVar2, p076m2.r rVar, final int i15, final int i16) {
        m mVar2;
        int i17;
        final dn3.a aVar3;
        final m mVar3;
        p076m2.r rVarH = rVar.h(-471255297);
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
            i17 |= (i15 & 64) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 32 : 16;
        }
        int i19 = i16 & 4;
        if (i19 != 0) {
            i17 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= (i15 & 512) == 0 ? rVarH.W(aVar2) : rVarH.G(aVar2) ? 256 : 128;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            m mVar4 = i18 != 0 ? m.INSTANCE : mVar2;
            dn3.a aVar4 = i19 != 0 ? null : aVar2;
            if (t.k()) {
                t.o(-471255297, i17, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.screens.vehicledetails.component.ValidityInfo (ValidityInfo.kt:25)");
            }
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
                objE4 = new p(lVar);
                rVarH.v(objE4);
            }
            p pVar = (p) objE4;
            Object objE5 = rVarH.E();
            if (objE5 == companion.a()) {
                objE5 = x5.i(i0.f148189a, x5.k());
                rVarH.v(objE5);
            }
            a3 a3Var2 = (a3) objE5;
            boolean zG = rVarH.G(a0Var) | rVarH.c(257);
            Object objE6 = rVarH.E();
            if (zG || objE6 == companion.a()) {
                a aVar5 = new a(a3Var2, a0Var, pVar, 257, a3Var);
                rVarH.v(aVar5);
                objE6 = aVar5;
            }
            w0 w0Var = (w0) objE6;
            Object objE7 = rVarH.E();
            if (objE7 == companion.a()) {
                objE7 = new b(a3Var, pVar);
                rVarH.v(objE7);
            }
            er.a aVar6 = (er.a) objE7;
            boolean zG2 = rVarH.G(a0Var);
            Object objE8 = rVarH.E();
            if (zG2 || objE8 == companion.a()) {
                objE8 = new C2898c(a0Var);
                rVarH.v(objE8);
            }
            j0.a(v.d(mVar4, false, (l) objE8, 1, null), y2.m.d(1200550679, true, new d(a3Var2, lVar, aVar6, aVar, aVar4), rVarH, 54), w0Var, rVarH, 48, 0);
            rVarH.R();
            if (t.k()) {
                t.n();
            }
            aVar3 = aVar4;
            mVar3 = mVar4;
        } else {
            rVarH.O();
            aVar3 = aVar2;
            mVar3 = mVar2;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ln3.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c.f(mVar3, aVar, aVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(m mVar, dn3.a aVar, dn3.a aVar2, int i15, int i16, p076m2.r rVar, int i17) {
        e(mVar, aVar, aVar2, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final long h(dn3.b bVar, p076m2.r rVar, int i15) {
        long jG;
        if (t.k()) {
            t.o(-877090462, i15, -1, "pl.gov.coi.mobywatel.feature.vehicles.presentation.screens.vehicledetails.component.getLabelColor (ValidityInfo.kt:95)");
        }
        int i16 = h.f119009a[bVar.ordinal()];
        if (i16 == 1) {
            rVar.X(-1070340530);
            jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            rVar.R();
        } else if (i16 == 2) {
            rVar.X(-1070338452);
            jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            rVar.R();
        } else {
            if (i16 != 3) {
                rVar.X(-1070342506);
                rVar.R();
                throw new oq.p();
            }
            rVar.X(-1070336372);
            jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i();
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return jG;
    }
}
