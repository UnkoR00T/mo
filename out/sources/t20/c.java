package t20;

import android.graphics.Bitmap;
import androidx.compose.ui.platform.g1;
import b5.j;
import c5.h;
import d1.i;
import d1.m3;
import d1.q3;
import d1.r3;
import d1.x;
import er.l;
import f3.m;
import fu.r;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mx.Label;
import n3.l0;
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
import p047f5.t;
import p047f5.w;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.x5;
import q4.TextStyle;
import w0.i1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"", "text", "Landroid/graphics/Bitmap;", "image", "description", "Loq/i0;", "c", "(Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Lm2/r;II)V", "Lc5/h;", "a", "F", "LOGO_MAX_HEIGHT", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f187124a = h.n(42);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bitmap f187125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p047f5.f f187126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f187127c;

        a(Bitmap bitmap, p047f5.f fVar, String str) {
            this.f187125a = bitmap;
            this.f187126b = fVar;
            this.f187127c = str;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            w.a(eVar.getTop(), eVar.getParent().getTop(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getStart(), eVar.getParent().getStart(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getEnd(), this.f187125a == null ? eVar.getParent().getEnd() : this.f187126b.getStart(), 0.0f, 0.0f, 6, null);
            String str = this.f187127c;
            if (str == null || r.t0(str)) {
                w.a(eVar.getBottom(), eVar.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            }
            eVar.q(t.INSTANCE.a());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f187128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f187129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p047f5.f f187130c;

        b(p047f5.f fVar, Bitmap bitmap, p047f5.f fVar2) {
            this.f187128a = fVar;
            this.f187129b = bitmap;
            this.f187130c = fVar2;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            w.a(eVar.getTop(), this.f187128a.getBottom(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getStart(), eVar.getParent().getStart(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getEnd(), this.f187129b == null ? eVar.getParent().getEnd() : this.f187130c.getStart(), 0.0f, 0.0f, 6, null);
            eVar.q(t.INSTANCE.a());
        }
    }

    /* JADX INFO: renamed from: t20.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4861c implements l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C4861c f187131a = new C4861c();

        C4861c() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            w.a(eVar.getTop(), eVar.getParent().getTop(), 0.0f, 0.0f, 6, null);
            w.a(eVar.getBottom(), eVar.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getEnd(), eVar.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Le4/y0;", "", "Le4/v0;", "measurables", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;"}, k = 3, mv = {2, 2, 0})
    public static final class d implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a3 f187132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f187133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f187134c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f187135d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ a3 f187136e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 2, 0})
        static final class a extends fr.w implements l<a2.a, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a0 f187137b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f187138c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Map f187139d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a0 a0Var, List list, Map map) {
                super(1);
                this.f187137b = a0Var;
                this.f187138c = list;
                this.f187139d = map;
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
                c(aVar);
                return i0.f148189a;
            }

            public final void c(a2.a aVar) {
                this.f187137b.h(aVar, this.f187138c, this.f187139d);
            }
        }

        public d(a3 a3Var, a0 a0Var, p pVar, int i15, a3 a3Var2) {
            this.f187132a = a3Var;
            this.f187133b = a0Var;
            this.f187134c = pVar;
            this.f187135d = i15;
            this.f187136e = a3Var2;
        }

        @Override // p036e4.w0
        public final x0 e(y0 y0Var, List<? extends v0> list, long j15) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.f187132a.getValue();
            long jI = this.f187133b.i(j15, y0Var.getLayoutDirection(), this.f187134c, list, linkedHashMap, this.f187135d);
            this.f187136e.getValue();
            return y0.j2(y0Var, c5.r.g(jI), c5.r.f(jI), null, new a(this.f187133b, list, linkedHashMap), 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 2, 0})
    static final class e extends fr.w implements er.a<i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a3 f187140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f187141c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a3 a3Var, p pVar) {
            super(0);
            this.f187140b = a3Var;
            this.f187141c = pVar;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            a3 a3Var = this.f187140b;
            a3Var.setValue(Boolean.valueOf(!((Boolean) a3Var.getValue()).booleanValue()));
            this.f187141c.j(true);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln4/i0;", "Loq/i0;", "c", "(Ln4/i0;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends fr.w implements l<n4.i0, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f187142b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(a0 a0Var) {
            super(1);
            this.f187142b = a0Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(n4.i0 i0Var) {
            c(i0Var);
            return i0.f148189a;
        }

        public final void c(n4.i0 i0Var) {
            e0.a(i0Var, this.f187142b);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "(Lm2/r;I)V"}, k = 3, mv = {2, 2, 0})
    public static final class g extends fr.w implements er.p<p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a3 f187143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p047f5.l f187144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ er.a f187145d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Bitmap f187146e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f187147f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f187148g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(a3 a3Var, p047f5.l lVar, er.a aVar, Bitmap bitmap, String str, String str2) {
            super(2);
            this.f187143b = a3Var;
            this.f187144c = lVar;
            this.f187145d = aVar;
            this.f187146e = bitmap;
            this.f187147f = str;
            this.f187148g = str2;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            p047f5.l lVar;
            p047f5.f fVar;
            m.Companion companion;
            int i16;
            if ((i15 & 3) == 2 && rVar.i()) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(1200550679, i15, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
            }
            this.f187143b.setValue(i0.f148189a);
            int helpersHashCode = this.f187144c.getHelpersHashCode();
            this.f187144c.f();
            p047f5.l lVar2 = this.f187144c;
            rVar.X(1548595673);
            f5.l.b bVarJ = lVar2.j();
            p047f5.f fVarA = bVarJ.a();
            p047f5.f fVarE = bVarJ.e();
            p047f5.f fVarF = bVarJ.f();
            m.Companion companion2 = m.INSTANCE;
            boolean zG = rVar.G(this.f187146e) | rVar.W(fVarF) | rVar.W(this.f187147f);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(this.f187146e, fVarF, this.f187147f);
                rVar.v(objE);
            }
            m mVarH = lVar2.h(companion2, fVarA, (l) objE);
            Label labelB = mx.b.b(this.f187148g, "text");
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            long jI = aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i();
            TextStyle textStyleA = aVar.f(rVar, i17).a();
            j.Companion companion3 = j.INSTANCE;
            j70.h.g(mVarH, null, labelB, null, null, jI, 0L, null, null, null, 0L, null, j.h(companion3.f()), 0L, 0, false, 0, 0, null, textStyleA, null, null, false, false, null, rVar, 0, 0, 0, 33026010);
            p076m2.r rVar2 = rVar;
            String str = this.f187147f;
            if (str == null || r.t0(str)) {
                str = null;
            }
            if (str == null) {
                rVar2.X(1549336788);
                rVar2.R();
                lVar = lVar2;
                fVar = fVarF;
                companion = companion2;
                i16 = i17;
            } else {
                rVar2.X(1549336789);
                boolean zW = rVar2.W(fVarA) | rVar2.G(this.f187146e) | rVar2.W(fVarF);
                Object objE2 = rVar2.E();
                if (zW || objE2 == p076m2.r.INSTANCE.a()) {
                    objE2 = new b(fVarA, this.f187146e, fVarF);
                    rVar2.v(objE2);
                }
                lVar = lVar2;
                fVar = fVarF;
                companion = companion2;
                i16 = i17;
                j70.h.g(lVar2.h(companion2, fVarE, (l) objE2), null, mx.b.b(str, "description"), null, null, aVar.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, j.h(companion3.f()), 0L, 0, false, 0, 0, null, aVar.f(rVar2, i17).d(), null, null, false, false, null, rVar, 0, 0, 0, 33026010);
                rVar2 = rVar;
                rVar2.R();
            }
            if (this.f187146e == null) {
                rVar2.X(1549989121);
            } else {
                rVar2.X(1549989122);
                Object objE3 = rVar2.E();
                if (objE3 == p076m2.r.INSTANCE.a()) {
                    objE3 = C4861c.f187131a;
                    rVar2.v(objE3);
                }
                m.Companion companion4 = companion;
                m mVarH2 = lVar.h(companion4, fVar, (l) objE3);
                i.e eVarJ = i.f39152a.j();
                f3.c.Companion companion5 = f3.c.INSTANCE;
                w0 w0VarB = m3.b(eVarJ, companion5.l(), rVar2, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
                p076m2.e0 e0VarT = rVar2.t();
                m mVarE = f3.j.e(rVar2, mVarH2);
                androidx.compose.ui.node.c.Companion companion6 = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB = companion6.b();
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
                n6.i(rVarC, w0VarB, companion6.d());
                n6.i(rVarC, e0VarT, companion6.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion6.c());
                n6.g(rVarC, companion6.a());
                n6.i(rVarC, mVarE, companion6.e());
                q3 q3Var = q3.f39261a;
                r3.a(androidx.compose.foundation.layout.d.y(companion4, aVar.b(rVar2, i16).getSpacing100()), rVar2, 0);
                w0 w0VarI = d1.r.i(companion5.f(), false);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar2, 0));
                p076m2.e0 e0VarT2 = rVar2.t();
                m mVarE2 = f3.j.e(rVar2, companion4);
                er.a<androidx.compose.ui.node.c> aVarB2 = companion6.b();
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
                n6.i(rVarC2, w0VarI, companion6.d());
                n6.i(rVarC2, e0VarT2, companion6.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion6.c());
                n6.g(rVarC2, companion6.a());
                n6.i(rVarC2, mVarE2, companion6.e());
                x xVar = x.f39368a;
                i1.g(l0.c(this.f187146e), null, androidx.compose.foundation.layout.d.i(companion4, c.f187124a), null, null, 0.0f, null, 0, rVar2, 432, 248);
                rVar2.x();
                rVar2.x();
            }
            rVar2.R();
            rVar2.R();
            if (this.f187144c.getHelpersHashCode() != helpersHashCode) {
                Function0.g(this.f187145d, rVar2, 6);
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }
    }

    public static final void c(final String str, final Bitmap bitmap, final String str2, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        p076m2.r rVarH = rVar.h(1739762081);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(str) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= rVarH.G(bitmap) ? 32 : 16;
        }
        int i19 = i16 & 4;
        if (i19 != 0) {
            i17 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.W(str2) ? 256 : 128;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            if (i18 != 0) {
                bitmap = null;
            }
            if (i19 != 0) {
                str2 = null;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(1739762081, i17, -1, "pl.gov.coi.common.ui.document.logo.DocumentLogo (DocumentLogo.kt:31)");
            }
            x30.c.c(null, 0.0f, y2.m.d(119589728, true, new er.p() { // from class: t20.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c.d(bitmap, str2, str, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        final Bitmap bitmap2 = bitmap;
        final String str3 = str2;
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: t20.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c.e(str, bitmap2, str3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(Bitmap bitmap, String str, String str2, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(119589728, i15, -1, "pl.gov.coi.common.ui.document.logo.DocumentLogo.<anonymous> (DocumentLogo.kt:33)");
            }
            m mVarH = androidx.compose.foundation.layout.d.h(m.INSTANCE, 0.0f, 1, null);
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
                objE4 = new p(lVar);
                rVar.v(objE4);
            }
            p pVar = (p) objE4;
            Object objE5 = rVar.E();
            if (objE5 == companion.a()) {
                objE5 = x5.i(i0.f148189a, x5.k());
                rVar.v(objE5);
            }
            a3 a3Var2 = (a3) objE5;
            boolean zG = rVar.G(a0Var) | rVar.c(257);
            Object objE6 = rVar.E();
            if (zG || objE6 == companion.a()) {
                Object dVar2 = new d(a3Var2, a0Var, pVar, 257, a3Var);
                rVar.v(dVar2);
                objE6 = dVar2;
            }
            w0 w0Var = (w0) objE6;
            Object objE7 = rVar.E();
            if (objE7 == companion.a()) {
                objE7 = new e(a3Var, pVar);
                rVar.v(objE7);
            }
            er.a aVar = (er.a) objE7;
            boolean zG2 = rVar.G(a0Var);
            Object objE8 = rVar.E();
            if (zG2 || objE8 == companion.a()) {
                objE8 = new f(a0Var);
                rVar.v(objE8);
            }
            j0.a(v.d(mVarH, false, (l) objE8, 1, null), y2.m.d(1200550679, true, new g(a3Var2, lVar, aVar, bitmap, str, str2), rVar, 54), w0Var, rVar, 48, 0);
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
    public static final i0 e(String str, Bitmap bitmap, String str2, int i15, int i16, p076m2.r rVar, int i17) {
        c(str, bitmap, str2, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
