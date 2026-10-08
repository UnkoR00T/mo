package u20;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.g1;
import androidx.compose.ui.platform.u1;
import androidx.p016lifecycle.j;
import androidx.p016lifecycle.q;
import d1.a3;
import d1.e0;
import d1.h0;
import d1.m3;
import d1.q3;
import d1.r3;
import fr.p0;
import h30.ButtonData;
import i30.ButtonIconData;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l60.KeyValueData;
import mx.Label;
import n3.l0;
import n3.y2;
import n4.g0;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.a2;
import p036e4.j0;
import p036e4.v0;
import p036e4.w0;
import p036e4.x0;
import p036e4.y0;
import p046f2.c2;
import p046f2.x1;
import p046f2.y1;
import p046f2.z1;
import p047f5.f0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.c6;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.x5;
import q4.TextStyle;
import w0.i1;
import w20.BaseDocumentScreenState;
import w20.DocumentGiloshData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a)\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lf3/m;", "modifier", "Lw20/d;", "data", "Lw20/a;", "screenData", "Loq/i0;", "g", "(Lf3/m;Lw20/d;Lw20/a;Lm2/r;II)V", "Ll60/c;", "keyValue", "Landroidx/compose/ui/graphics/Color;", "keyValueItemsColor", "", "index", "l", "(Ll60/c;Landroidx/compose/ui/graphics/Color;ILm2/r;I)V", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f194445a = new a();

        a() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.w.a(eVar.getTop(), eVar.getParent().getTop(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getStart(), eVar.getParent().getStart(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getEnd(), eVar.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            p047f5.w.a(eVar.getBottom(), eVar.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            p047f5.t.Companion companion = p047f5.t.INSTANCE;
            eVar.o(companion.a());
            eVar.q(companion.b());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f194446a;

        static {
            int[] iArr = new int[androidx.lifecycle.j.a.values().length];
            try {
                iArr[androidx.lifecycle.j.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.lifecycle.j.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f194446a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.l<n4.i0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BaseDocumentScreenState f194447a;

        b(BaseDocumentScreenState baseDocumentScreenState) {
            this.f194447a = baseDocumentScreenState;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(n4.i0 i0Var) {
            c(i0Var);
            return i0.f148189a;
        }

        public final void c(n4.i0 i0Var) {
            n4.f0.I0(i0Var, 4.0f);
            g0.a(i0Var, true);
            n4.f0.y0(i0Var, this.f194447a.getEmblemText().getTag());
            n4.f0.c0(i0Var, t70.s.O(this.f194447a.getEmblemText()));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f194448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f194449b;

        c(p047f5.f fVar, float f15) {
            this.f194448a = fVar;
            this.f194449b = f15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.w.a(eVar.getTop(), this.f194448a.getTop(), this.f194449b, 0.0f, 4, null);
            f0.b(eVar.getEnd(), this.f194448a.getEnd(), this.f194449b, 0.0f, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f194450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f194451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DocumentGiloshData f194452c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p047f5.f f194453d;

        d(p047f5.f fVar, float f15, DocumentGiloshData documentGiloshData, p047f5.f fVar2) {
            this.f194450a = fVar;
            this.f194451b = f15;
            this.f194452c = documentGiloshData;
            this.f194453d = fVar2;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.w.a(eVar.getTop(), this.f194450a.getTop(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getStart(), this.f194450a.getEnd(), this.f194451b, 0.0f, 4, null);
            if (this.f194452c.getCornerButtonIconData() != null) {
                f0.b(eVar.getEnd(), this.f194453d.getStart(), 0.0f, 0.0f, 6, null);
            } else {
                f0.b(eVar.getEnd(), eVar.getParent().getEnd(), this.f194451b, 0.0f, 4, null);
            }
            eVar.q(p047f5.t.INSTANCE.a());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements er.l<n4.i0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f194454a = new e();

        e() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(n4.i0 i0Var) {
            c(i0Var);
            return i0.f148189a;
        }

        public final void c(n4.i0 i0Var) {
            n4.f0.I0(i0Var, 0.0f);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f implements er.l<n4.i0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f194455a = new f();

        f() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(n4.i0 i0Var) {
            c(i0Var);
            return i0.f148189a;
        }

        public final void c(n4.i0 i0Var) {
            n4.f0.I0(i0Var, 1.0f);
        }
    }

    /* JADX INFO: renamed from: u20.g$g, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5061g implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f194456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f194457b;

        C5061g(p047f5.f fVar, float f15) {
            this.f194456a = fVar;
            this.f194457b = f15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.w.a(eVar.getTop(), this.f194456a.getBottom(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getStart(), this.f194456a.getStart(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getEnd(), eVar.getParent().getEnd(), this.f194457b, 0.0f, 4, null);
            eVar.q(p047f5.t.INSTANCE.a());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.i.HorizontalAnchor f194458a;

        h(p047f5.i.HorizontalAnchor horizontalAnchor) {
            this.f194458a = horizontalAnchor;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.e.m(eVar, this.f194458a, eVar.getParent().getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 60, null);
            f0.b(eVar.getStart(), eVar.getParent().getStart(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getEnd(), eVar.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            eVar.q(p047f5.t.INSTANCE.a());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i implements er.l<Context, u20.i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ DocumentGiloshData f194459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x20.h f194460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p0<u20.i> f194461c;

        i(DocumentGiloshData documentGiloshData, x20.h hVar, p0<u20.i> p0Var) {
            this.f194459a = documentGiloshData;
            this.f194460b = hVar;
            this.f194461c = p0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [T, u20.i, x20.d] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final u20.i b(Context context) {
            ?? iVar = new u20.i(context, this.f194459a.getForeground().intValue());
            x20.h hVar = this.f194460b;
            p0<u20.i> p0Var = this.f194461c;
            if (hVar != 0) {
                hVar.g(iVar);
            }
            iVar.e();
            p0Var.f66410a = iVar;
            return iVar;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class j implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f194462a = new j();

        j() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.w.a(eVar.getTop(), eVar.getParent().getTop(), 0.0f, 0.0f, 6, null);
            p047f5.w.a(eVar.getBottom(), eVar.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getStart(), eVar.getParent().getStart(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getEnd(), eVar.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            eVar.q(p047f5.t.INSTANCE.a());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k implements er.l<n4.i0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ DocumentGiloshData f194463a;

        k(DocumentGiloshData documentGiloshData) {
            this.f194463a = documentGiloshData;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(n4.i0 i0Var) {
            c(i0Var);
            return i0.f148189a;
        }

        public final void c(n4.i0 i0Var) {
            n4.f0.I0(i0Var, 5.0f);
            g0.a(i0Var, true);
            n4.f0.y0(i0Var, this.f194463a.getValidityMessage().getTag());
            n4.f0.c0(i0Var, t70.s.O(this.f194463a.getValidityMessage()));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class l implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f194464a;

        l(p047f5.f fVar) {
            this.f194464a = fVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.w.a(eVar.getTop(), this.f194464a.getTop(), 0.0f, 0.0f, 6, null);
            p047f5.w.a(eVar.getBottom(), this.f194464a.getBottom(), 0.0f, 0.0f, 6, null);
            f0.b(eVar.getEnd(), eVar.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            eVar.q(p047f5.t.INSTANCE.a());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class m implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f194465a;

        m(float f15) {
            this.f194465a = f15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.w.a(eVar.getTop(), eVar.getParent().getTop(), this.f194465a, 0.0f, 4, null);
            f0.b(eVar.getStart(), eVar.getParent().getStart(), this.f194465a, 0.0f, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class n implements er.l<n4.i0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f194466a = new n();

        n() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(n4.i0 i0Var) {
            c(i0Var);
            return i0.f148189a;
        }

        public final void c(n4.i0 i0Var) {
            n4.f0.I0(i0Var, 2.0f);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class o implements er.q<h0, p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ DocumentGiloshData f194467a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a implements er.l<n4.i0, i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ DocumentGiloshData f194468a;

            a(DocumentGiloshData documentGiloshData) {
                this.f194468a = documentGiloshData;
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(n4.i0 i0Var) {
                c(i0Var);
                return i0.f148189a;
            }

            public final void c(n4.i0 i0Var) {
                g0.a(i0Var, true);
                n4.f0.y0(i0Var, this.f194468a.getPhotoContentDescription().getTag());
                n4.f0.c0(i0Var, this.f194468a.getPhotoContentDescription().getText());
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b implements er.l<n4.i0, i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ DocumentGiloshData f194469a;

            b(DocumentGiloshData documentGiloshData) {
                this.f194469a = documentGiloshData;
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(n4.i0 i0Var) {
                c(i0Var);
                return i0.f148189a;
            }

            public final void c(n4.i0 i0Var) {
                g0.a(i0Var, true);
                n4.f0.c0(i0Var, t70.s.O(this.f194469a.getNoPhotoText()));
                n4.f0.y0(i0Var, this.f194469a.getNoPhotoText().getTag());
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c implements er.l<n4.i0, i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f194470a = new c();

            c() {
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(n4.i0 i0Var) {
                c(i0Var);
                return i0.f148189a;
            }

            public final void c(n4.i0 i0Var) {
                t70.i.A(i0Var);
            }
        }

        o(DocumentGiloshData documentGiloshData) {
            this.f194467a = documentGiloshData;
        }

        public final void c(h0 h0Var, p076m2.r rVar, int i15) {
            Object obj;
            p076m2.r rVar2;
            long jM20unboximpl;
            long jM20unboximpl2;
            long jM20unboximpl3;
            p076m2.r rVar3;
            if (!rVar.r((i15 & 17) != 16, i15 & 1)) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(442648536, i15, -1, "pl.gov.coi.common.ui.document.maincard.DocumentMainCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DocumentMainCard.kt:197)");
            }
            Bitmap photo = this.f194467a.getPhoto();
            i0 i0Var = null;
            if (photo == null) {
                rVar.X(1392977402);
                rVar.R();
                rVar2 = rVar;
                obj = null;
            } else {
                rVar.X(1392977403);
                DocumentGiloshData documentGiloshData = this.f194467a;
                f3.m mVarF = androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null);
                boolean zG = rVar.G(documentGiloshData);
                Object objE = rVar.E();
                if (zG || objE == p076m2.r.INSTANCE.a()) {
                    objE = new a(documentGiloshData);
                    rVar.v(objE);
                }
                obj = null;
                rVar2 = rVar;
                i1.g(l0.c(photo), null, n4.v.d(mVarF, false, (er.l) objE, 1, null), null, null, 0.0f, null, 0, rVar2, 48, 248);
                rVar2.R();
                i0Var = i0.f148189a;
            }
            if (i0Var == null) {
                rVar2.X(1393496715);
                Label noPhotoText = this.f194467a.getNoPhotoText();
                if (noPhotoText == null) {
                    rVar2.X(1393496714);
                    rVar2.R();
                    rVar3 = rVar2;
                } else {
                    rVar2.X(1393496715);
                    DocumentGiloshData documentGiloshData2 = this.f194467a;
                    f3.m.Companion companion = f3.m.INSTANCE;
                    f3.m mVarF2 = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, obj);
                    boolean zG2 = rVar2.G(documentGiloshData2);
                    Object objE2 = rVar2.E();
                    if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                        objE2 = new b(documentGiloshData2);
                        rVar2.v(objE2);
                    }
                    f3.m mVarC = n4.v.c(mVarF2, true, (er.l) objE2);
                    k70.a aVar = k70.a.f108864a;
                    int i16 = k70.a.f108865b;
                    float strokeWidth = aVar.b(rVar2, i16).getStrokeWidth();
                    Color noPhotoForegroundColor = documentGiloshData2.getNoPhotoForegroundColor();
                    if (noPhotoForegroundColor == null) {
                        rVar2.X(1917405161);
                        jM20unboximpl = aVar.a(rVar2, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().d();
                        rVar2.R();
                    } else {
                        rVar2.X(1917403456);
                        rVar2.R();
                        jM20unboximpl = noPhotoForegroundColor.m20unboximpl();
                    }
                    f3.m mVarG = w0.o.g(mVarC, w0.x.a(strokeWidth, jM20unboximpl), aVar.e(rVar2, i16).getRadius150());
                    w0 w0VarA = e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.g(), rVar2, 54);
                    int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
                    p076m2.e0 e0VarT = rVar2.t();
                    f3.m mVarE = f3.j.e(rVar2, mVarG);
                    androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                    er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
                    n6.i(rVarC, w0VarA, companion2.d());
                    n6.i(rVarC, e0VarT, companion2.f());
                    n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                    n6.g(rVarC, companion2.a());
                    n6.i(rVarC, mVarE, companion2.e());
                    d1.i0 i0Var2 = d1.i0.f39176a;
                    Object objE3 = rVar2.E();
                    if (objE3 == p076m2.r.INSTANCE.a()) {
                        objE3 = c.f194470a;
                        rVar2.v(objE3);
                    }
                    f3.m mVarD = n4.v.d(companion, false, (er.l) objE3, 1, obj);
                    Integer numValueOf = Integer.valueOf(c20.b.f22736z);
                    h60.g gVar = h60.g.MBig;
                    Color noPhotoForegroundColor2 = documentGiloshData2.getNoPhotoForegroundColor();
                    if (noPhotoForegroundColor2 == null) {
                        rVar2.X(-1197425825);
                        jM20unboximpl2 = aVar.a(rVar2, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().d();
                        rVar2.R();
                    } else {
                        rVar2.X(-1197427530);
                        rVar2.R();
                        jM20unboximpl2 = noPhotoForegroundColor2.m20unboximpl();
                    }
                    h60.f.e(mVarD, null, numValueOf, gVar, jM20unboximpl2, 0.0f, null, null, 0L, 0.0f, 0.0f, null, rVar, 3072, 0, 4066);
                    f3.m mVarR = a3.r(companion, 0.0f, aVar.b(rVar, i16).getSpacing150(), 0.0f, 0.0f, 13, null);
                    int iA = b5.j.INSTANCE.a();
                    long jG = c5.w.g(10);
                    TextStyle textStyleE = aVar.f(rVar, i16).e();
                    Color noPhotoForegroundColor3 = documentGiloshData2.getNoPhotoForegroundColor();
                    if (noPhotoForegroundColor3 == null) {
                        rVar.X(-1197412705);
                        jM20unboximpl3 = aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().d();
                        rVar.R();
                    } else {
                        rVar.X(-1197414410);
                        rVar.R();
                        jM20unboximpl3 = noPhotoForegroundColor3.m20unboximpl();
                    }
                    j70.h.g(mVarR, null, noPhotoText, null, null, jM20unboximpl3, jG, null, null, null, 0L, null, b5.j.h(iA), 0L, 0, false, 0, 0, null, textStyleE, null, null, false, true, null, rVar, 1572864, 0, 3072, 24637338);
                    rVar3 = rVar;
                    rVar3.x();
                    rVar3.R();
                    i0 i0Var3 = i0.f148189a;
                }
                rVar3.R();
            } else {
                p076m2.r rVar4 = rVar2;
                rVar4.X(183483432);
                rVar4.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ i0 w(h0 h0Var, p076m2.r rVar, Integer num) {
            c(h0Var, rVar, num.intValue());
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class p implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f194471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f194472b;

        p(p047f5.f fVar, float f15) {
            this.f194471a = fVar;
            this.f194472b = f15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.w.a(eVar.getTop(), this.f194471a.getBottom(), this.f194472b, 0.0f, 4, null);
            f0.b(eVar.getStart(), eVar.getParent().getStart(), this.f194472b, 0.0f, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class q implements er.l<n4.i0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ DocumentGiloshData f194473a;

        q(DocumentGiloshData documentGiloshData) {
            this.f194473a = documentGiloshData;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(n4.i0 i0Var) {
            c(i0Var);
            return i0.f148189a;
        }

        public final void c(n4.i0 i0Var) {
            g0.a(i0Var, true);
            n4.f0.y0(i0Var, this.f194473a.getLogoFlagContentDescription().getTag());
            n4.f0.I0(i0Var, 3.0f);
            n4.f0.c0(i0Var, t70.s.O(this.f194473a.getLogoFlagContentDescription()));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class r implements er.l<p047f5.e, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p047f5.f f194474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f194475b;

        r(p047f5.f fVar, float f15) {
            this.f194474a = fVar;
            this.f194475b = f15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p047f5.e eVar) {
            c(eVar);
            return i0.f148189a;
        }

        public final void c(p047f5.e eVar) {
            p047f5.w.a(eVar.getTop(), this.f194474a.getBottom(), this.f194475b, 0.0f, 4, null);
            f0.b(eVar.getStart(), eVar.getParent().getStart(), this.f194475b, 0.0f, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Le4/y0;", "", "Le4/v0;", "measurables", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;"}, k = 3, mv = {2, 2, 0})
    public static final class s implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p076m2.a3 f194476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p047f5.a0 f194477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p047f5.p f194478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f194479d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p076m2.a3 f194480e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 2, 0})
        static final class a extends fr.w implements er.l<a2.a, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p047f5.a0 f194481b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f194482c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Map f194483d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p047f5.a0 a0Var, List list, Map map) {
                super(1);
                this.f194481b = a0Var;
                this.f194482c = list;
                this.f194483d = map;
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
                c(aVar);
                return i0.f148189a;
            }

            public final void c(a2.a aVar) {
                this.f194481b.h(aVar, this.f194482c, this.f194483d);
            }
        }

        public s(p076m2.a3 a3Var, p047f5.a0 a0Var, p047f5.p pVar, int i15, p076m2.a3 a3Var2) {
            this.f194476a = a3Var;
            this.f194477b = a0Var;
            this.f194478c = pVar;
            this.f194479d = i15;
            this.f194480e = a3Var2;
        }

        @Override // p036e4.w0
        public final x0 e(y0 y0Var, List<? extends v0> list, long j15) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.f194476a.getValue();
            long jI = this.f194477b.i(j15, y0Var.getLayoutDirection(), this.f194478c, list, linkedHashMap, this.f194479d);
            this.f194480e.getValue();
            return y0.j2(y0Var, c5.r.g(jI), c5.r.f(jI), null, new a(this.f194477b, list, linkedHashMap), 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 2, 0})
    static final class t extends fr.w implements er.a<i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p076m2.a3 f194484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p047f5.p f194485c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(p076m2.a3 a3Var, p047f5.p pVar) {
            super(0);
            this.f194484b = a3Var;
            this.f194485c = pVar;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            p076m2.a3 a3Var = this.f194484b;
            a3Var.setValue(Boolean.valueOf(!((Boolean) a3Var.getValue()).booleanValue()));
            this.f194485c.j(true);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln4/i0;", "Loq/i0;", "c", "(Ln4/i0;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends fr.w implements er.l<n4.i0, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p047f5.a0 f194486b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(p047f5.a0 a0Var) {
            super(1);
            this.f194486b = a0Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(n4.i0 i0Var) {
            c(i0Var);
            return i0.f148189a;
        }

        public final void c(n4.i0 i0Var) {
            p047f5.e0.a(i0Var, this.f194486b);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "(Lm2/r;I)V"}, k = 3, mv = {2, 2, 0})
    public static final class v extends fr.w implements er.p<p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p076m2.a3 f194487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p047f5.l f194488c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ er.a f194489d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f194490e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f194491f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f194492g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ DocumentGiloshData f194493h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ BaseDocumentScreenState f194494j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ x20.h f194495k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ p0 f194496l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f194497m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ float f194498n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ float f194499p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ float f194500q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(p076m2.a3 a3Var, p047f5.l lVar, er.a aVar, float f15, float f16, float f17, DocumentGiloshData documentGiloshData, BaseDocumentScreenState baseDocumentScreenState, x20.h hVar, p0 p0Var, float f18, float f19, float f25, float f26) {
            super(2);
            this.f194487b = a3Var;
            this.f194488c = lVar;
            this.f194489d = aVar;
            this.f194490e = f15;
            this.f194491f = f16;
            this.f194492g = f17;
            this.f194493h = documentGiloshData;
            this.f194494j = baseDocumentScreenState;
            this.f194495k = hVar;
            this.f194496l = p0Var;
            this.f194497m = f18;
            this.f194498n = f19;
            this.f194499p = f25;
            this.f194500q = f26;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v17 */
        /* JADX WARN: Type inference failed for: r11v18, types: [int] */
        /* JADX WARN: Type inference failed for: r11v24 */
        /* JADX WARN: Type inference failed for: r9v11 */
        /* JADX WARN: Type inference failed for: r9v12, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r9v13 */
        public final void c(p076m2.r rVar, int i15) {
            long jI;
            p047f5.f fVar;
            int i16;
            p047f5.f fVar2;
            p047f5.l lVar;
            f3.m.Companion companion;
            ?? r15;
            k70.a aVar;
            int i17;
            if ((i15 & 3) == 2 && rVar.i()) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(1200550679, i15, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
            }
            p076m2.a3 a3Var = this.f194487b;
            i0 i0Var = i0.f148189a;
            a3Var.setValue(i0Var);
            int helpersHashCode = this.f194488c.getHelpersHashCode();
            this.f194488c.f();
            p047f5.l lVar2 = this.f194488c;
            rVar.X(1470250263);
            f5.l.b bVarJ = lVar2.j();
            p047f5.f fVarA = bVarJ.a();
            p047f5.f fVarE = bVarJ.e();
            p047f5.f fVarF = bVarJ.f();
            f5.l.b bVarJ2 = lVar2.j();
            p047f5.f fVarA2 = bVarJ2.a();
            p047f5.f fVarE2 = bVarJ2.e();
            p047f5.f fVarF2 = bVarJ2.f();
            f3.m.Companion companion2 = f3.m.INSTANCE;
            Object objE = rVar.E();
            p076m2.r.Companion companion3 = p076m2.r.INSTANCE;
            if (objE == companion3.a()) {
                objE = a.f194445a;
                rVar.v(objE);
            }
            f3.m mVarH = lVar2.h(companion2, fVarE2, (er.l) objE);
            f3.c.Companion companion4 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion4.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarH);
            androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion5.b();
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
            n6.i(rVarC, w0VarI, companion5.d());
            n6.i(rVarC, e0VarT, companion5.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion5.c());
            n6.g(rVarC, companion5.a());
            n6.i(rVarC, mVarE, companion5.e());
            d1.x xVar = d1.x.f39368a;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null);
            androidx.compose.ui.graphics.painter.a aVarC = l4.c.c(this.f194493h.getBackground(), rVar, 0);
            p036e4.l lVarB = p036e4.l.INSTANCE.b();
            int i18 = androidx.compose.ui.graphics.painter.a.f9956g;
            i0 i0Var2 = i0Var;
            i1.c(aVarC, null, mVarF, null, lVarB, 0.0f, null, rVar, i18 | 25008, 104);
            if (!this.f194493h.getEnabledAnimations() || this.f194493h.getForeground() == null) {
                rVar.X(-755544042);
            } else {
                rVar.X(-749455704);
                androidx.compose.ui.viewinterop.e.b(new i(this.f194493h, this.f194495k, this.f194496l), null, null, rVar, 0, 6);
            }
            rVar.R();
            rVar.x();
            f3.m mVarI = androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.y(companion2, this.f194490e), this.f194491f);
            boolean zB = rVar.b(this.f194492g);
            Object objE2 = rVar.E();
            if (zB || objE2 == companion3.a()) {
                objE2 = new m(this.f194492g);
                rVar.v(objE2);
            }
            f3.m mVarH2 = lVar2.h(mVarI, fVarA, (er.l) objE2);
            Object objE3 = rVar.E();
            if (objE3 == companion3.a()) {
                objE3 = n.f194466a;
                rVar.v(objE3);
            }
            f3.m mVarD = n4.v.d(mVarH2, false, (er.l) objE3, 1, null);
            y1 y1Var = y1.f58315a;
            int i19 = y1.f58316b;
            x1 x1VarA = y1Var.a(rVar, i19);
            if (this.f194493h.getPhoto() == null) {
                Color noPhotoBackgroundColor = this.f194493h.getNoPhotoBackgroundColor();
                jI = noPhotoBackgroundColor != null ? noPhotoBackgroundColor.m20unboximpl() : Color.INSTANCE.g();
            } else {
                jI = Color.INSTANCE.i();
            }
            x1 x1VarD = x1.d(x1VarA, jI, 0L, 0L, 0L, 14, null);
            k70.a aVar2 = k70.a.f108864a;
            int i25 = k70.a.f108865b;
            c2.c(mVarD, aVar2.e(rVar, i25).getRadius150(), x1VarD, y1Var.c(aVar2.c(rVar, i25).getLevel0(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVar, i19 << 18, 62), null, y2.m.d(442648536, true, new o(this.f194493h), rVar, 54), rVar, 196608, 16);
            p076m2.r rVar2 = rVar;
            boolean zW = rVar2.W(fVarA) | rVar2.b(this.f194492g);
            Object objE4 = rVar2.E();
            if (zW || objE4 == companion3.a()) {
                objE4 = new p(fVarA, this.f194492g);
                rVar2.v(objE4);
            }
            f3.m mVarH3 = lVar2.h(companion2, fVarE, (er.l) objE4);
            boolean zG = rVar2.G(this.f194493h);
            Object objE5 = rVar2.E();
            if (zG || objE5 == companion3.a()) {
                objE5 = new q(this.f194493h);
                rVar2.v(objE5);
            }
            f3.m mVarA = n4.v.a(mVarH3, (er.l) objE5);
            w0 w0VarI2 = d1.r.i(companion4.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT2 = rVar2.t();
            f3.m mVarE2 = f3.j.e(rVar2, mVarA);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion5.b();
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
            n6.i(rVarC2, w0VarI2, companion5.d());
            n6.i(rVarC2, e0VarT2, companion5.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion5.c());
            n6.g(rVarC2, companion5.a());
            n6.i(rVarC2, mVarE2, companion5.e());
            Integer logo = this.f194493h.getLogo();
            if (logo == null) {
                rVar2.X(1895372583);
                rVar2.R();
                fVar = fVarE;
                i0Var2 = null;
                i16 = 48;
            } else {
                rVar2.X(1895372584);
                int i26 = i18 | 48;
                fVar = fVarE;
                i16 = 48;
                i1.c(l4.c.c(logo.intValue(), rVar2, 0), null, null, null, null, 0.0f, null, rVar, i26, 124);
                rVar2 = rVar;
                rVar2.R();
            }
            if (i0Var2 == null) {
                rVar2.X(-1047232616);
                e20.c.c(this.f194493h.getFlag(), this.f194493h.getEnabledAnimations(), this.f194493h.getLogoFlagContentDescription(), rVar2, 0, 0);
                rVar2.R();
            } else {
                rVar2.X(-1047237762);
                rVar2.R();
            }
            rVar2.x();
            boolean zW2 = rVar2.W(fVar) | rVar2.b(this.f194492g);
            Object objE6 = rVar2.E();
            if (zW2 || objE6 == companion3.a()) {
                objE6 = new r(fVar, this.f194492g);
                rVar2.v(objE6);
            }
            f3.m mVarH4 = lVar2.h(companion2, fVarF, (er.l) objE6);
            boolean zG2 = rVar2.G(this.f194494j);
            Object objE7 = rVar2.E();
            if (zG2 || objE7 == companion3.a()) {
                objE7 = new b(this.f194494j);
                rVar2.v(objE7);
            }
            f3.m mVarC = n4.v.c(mVarH4, true, (er.l) objE7);
            f3.c.InterfaceC1317c interfaceC1317cI = companion4.i();
            d1.i iVar = d1.i.f39152a;
            w0 w0VarB = m3.b(iVar.j(), interfaceC1317cI, rVar2, i16);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT3 = rVar2.t();
            f3.m mVarE3 = f3.j.e(rVar2, mVarC);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion5.b();
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
            n6.i(rVarC3, w0VarB, companion5.d());
            n6.i(rVarC3, e0VarT3, companion5.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion5.c());
            n6.g(rVarC3, companion5.a());
            n6.i(rVarC3, mVarE3, companion5.e());
            q3 q3Var = q3.f39261a;
            g60.z.q(null, g60.a0.SMALL, this.f194494j.d(), this.f194493h.getEnabledAnimations(), rVar, 48, 1);
            r3.a(androidx.compose.foundation.layout.d.y(companion2, this.f194497m), rVar, 0);
            Label emblemText = this.f194494j.getEmblemText();
            TextStyle textStyleD = aVar2.f(rVar, i25).d();
            long jK = t70.s.K(14, rVar, 6);
            Color emblemTextColor = this.f194494j.getEmblemTextColor();
            j70.h.g(null, null, emblemText, null, null, emblemTextColor != null ? emblemTextColor.m20unboximpl() : Color.INSTANCE.h(), jK, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleD, null, null, false, true, null, rVar, 0, 0, 3072, 24641435);
            rVar.x();
            if (this.f194493h.getCornerButtonIconData() == null) {
                rVar.X(1476239244);
                rVar.R();
                fVar2 = fVarF2;
                lVar = lVar2;
                companion = companion2;
                r15 = 0;
            } else {
                rVar.X(1476239245);
                boolean zW3 = rVar.W(fVarE2) | rVar.b(this.f194498n);
                Object objE8 = rVar.E();
                if (zW3 || objE8 == companion3.a()) {
                    objE8 = new c(fVarE2, this.f194498n);
                    rVar.v(objE8);
                }
                fVar2 = fVarF2;
                lVar = lVar2;
                companion = companion2;
                f3.m mVarH5 = lVar.h(companion, fVar2, (er.l) objE8);
                r15 = 0;
                w0 w0VarI3 = d1.r.i(companion4.o(), false);
                int iHashCode4 = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT4 = rVar.t();
                f3.m mVarE4 = f3.j.e(rVar, mVarH5);
                er.a<androidx.compose.ui.node.c> aVarB4 = companion5.b();
                if (rVar.l() == null) {
                    p076m2.m.d();
                }
                rVar.K();
                if (rVar.getInserting()) {
                    rVar.H(aVarB4);
                } else {
                    rVar.u();
                }
                p076m2.r rVarC4 = n6.c(rVar);
                n6.i(rVarC4, w0VarI3, companion5.d());
                n6.i(rVarC4, e0VarT4, companion5.f());
                n6.i(rVarC4, Integer.valueOf(iHashCode4), companion5.c());
                n6.g(rVarC4, companion5.a());
                n6.i(rVarC4, mVarE4, companion5.e());
                i30.g.f(this.f194493h.getCornerButtonIconData(), false, false, rVar, ButtonIconData.f88935g, 6);
                rVar.x();
                rVar.R();
            }
            f5.l.b bVarJ3 = lVar.j();
            p047f5.f fVarA3 = bVarJ3.a();
            p047f5.f fVarE3 = bVarJ3.e();
            boolean zW4 = rVar.W(fVarA) | rVar.b(this.f194492g) | rVar.G(this.f194493h) | rVar.W(fVar2);
            Object objE9 = rVar.E();
            if (zW4 || objE9 == companion3.a()) {
                objE9 = new d(fVarA, this.f194492g, this.f194493h, fVar2);
                rVar.v(objE9);
            }
            f3.m mVarH6 = lVar.h(companion, fVarA3, (er.l) objE9);
            Object objE10 = rVar.E();
            if (objE10 == companion3.a()) {
                objE10 = e.f194454a;
                rVar.v(objE10);
            }
            f3.m mVarD2 = n4.v.d(mVarH6, r15, (er.l) objE10, 1, null);
            w0 w0VarA = e0.a(iVar.k(), companion4.k(), rVar, r15);
            int iHashCode5 = Long.hashCode(p076m2.m.b(rVar, r15));
            p076m2.e0 e0VarT5 = rVar.t();
            f3.m mVarE5 = f3.j.e(rVar, mVarD2);
            er.a<androidx.compose.ui.node.c> aVarB5 = companion5.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB5);
            } else {
                rVar.u();
            }
            p076m2.r rVarC5 = n6.c(rVar);
            n6.i(rVarC5, w0VarA, companion5.d());
            n6.i(rVarC5, e0VarT5, companion5.f());
            n6.i(rVarC5, Integer.valueOf(iHashCode5), companion5.c());
            n6.g(rVarC5, companion5.a());
            n6.i(rVarC5, mVarE5, companion5.e());
            d1.i0 i0Var3 = d1.i0.f39176a;
            KeyValueData firstKeyValueItem = this.f194493h.getKeyValuesGroup().getFirstKeyValueItem();
            if (firstKeyValueItem == null) {
                rVar.X(527453456);
                rVar.R();
                aVar = aVar2;
                i17 = i25;
            } else {
                rVar.X(527453457);
                g.l(firstKeyValueItem, this.f194493h.getKeyValueItemsColor(), r15, rVar, MLKEMEngine.KyberPolyBytes);
                if (this.f194493h.getKeyValuesGroup().b().isEmpty()) {
                    aVar = aVar2;
                    i17 = i25;
                    rVar.X(1819666457);
                } else {
                    rVar.X(1832670709);
                    aVar = aVar2;
                    i17 = i25;
                    r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing150()), rVar, r15);
                }
                rVar.R();
                rVar.R();
            }
            rVar.x();
            d1.i.f fVarR = iVar.r(aVar.b(rVar, i17).getSpacing150());
            Object objE11 = rVar.E();
            if (objE11 == companion3.a()) {
                objE11 = f.f194455a;
                rVar.v(objE11);
            }
            f3.m mVarD3 = n4.v.d(companion, r15, (er.l) objE11, 1, null);
            boolean zW5 = rVar.W(fVarA3) | rVar.b(this.f194492g);
            Object objE12 = rVar.E();
            if (zW5 || objE12 == companion3.a()) {
                objE12 = new C5061g(fVarA3, this.f194492g);
                rVar.v(objE12);
            }
            f3.m mVarH7 = lVar.h(mVarD3, fVarE3, (er.l) objE12);
            w0 w0VarA2 = e0.a(fVarR, companion4.k(), rVar, r15);
            int iHashCode6 = Long.hashCode(p076m2.m.b(rVar, r15));
            p076m2.e0 e0VarT6 = rVar.t();
            f3.m mVarE6 = f3.j.e(rVar, mVarH7);
            er.a<androidx.compose.ui.node.c> aVarB6 = companion5.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB6);
            } else {
                rVar.u();
            }
            p076m2.r rVarC6 = n6.c(rVar);
            n6.i(rVarC6, w0VarA2, companion5.d());
            n6.i(rVarC6, e0VarT6, companion5.f());
            n6.i(rVarC6, Integer.valueOf(iHashCode6), companion5.c());
            n6.g(rVarC6, companion5.a());
            n6.i(rVarC6, mVarE6, companion5.e());
            rVar.X(-109892362);
            ?? r16 = r15;
            for (Object obj : this.f194493h.getKeyValuesGroup().b()) {
                int i27 = r16 + 1;
                if (r16 < 0) {
                    pq.v.x();
                }
                g.l((KeyValueData) obj, this.f194493h.getKeyValueItemsColor(), i27, rVar, r15);
                r16 = i27;
            }
            rVar.R();
            rVar.x();
            p047f5.y[] yVarArr = new p047f5.y[2];
            yVarArr[r15] = fVarF;
            yVarArr[1] = fVarE3;
            p047f5.i.HorizontalAnchor horizontalAnchorC = lVar.c(yVarArr, this.f194492g);
            f3.m.Companion companion6 = f3.m.INSTANCE;
            f3.m mVarN = a3.n(w0.i.d(androidx.compose.foundation.layout.d.C(companion6, null, r15, 3, null), k70.a.f108864a.a(rVar, k70.a.f108865b).getSurface().a(), null, 2, null), this.f194492g);
            boolean zW6 = rVar.W(horizontalAnchorC);
            Object objE13 = rVar.E();
            if (zW6 || objE13 == p076m2.r.INSTANCE.a()) {
                objE13 = new h(horizontalAnchorC);
                rVar.v(objE13);
            }
            f3.m mVarH8 = lVar.h(mVarN, fVarA2, (er.l) objE13);
            w0 w0VarI4 = d1.r.i(f3.c.INSTANCE.o(), r15);
            int iHashCode7 = Long.hashCode(p076m2.m.b(rVar, r15));
            p076m2.e0 e0VarT7 = rVar.t();
            f3.m mVarE7 = f3.j.e(rVar, mVarH8);
            androidx.compose.ui.node.c.Companion companion7 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB7 = companion7.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB7);
            } else {
                rVar.u();
            }
            p076m2.r rVarC7 = n6.c(rVar);
            n6.i(rVarC7, w0VarI4, companion7.d());
            n6.i(rVarC7, e0VarT7, companion7.f());
            n6.i(rVarC7, Integer.valueOf(iHashCode7), companion7.c());
            n6.g(rVarC7, companion7.a());
            n6.i(rVarC7, mVarE7, companion7.e());
            d1.x xVar2 = d1.x.f39368a;
            f3.m mVarH9 = androidx.compose.foundation.layout.d.h(companion6, 0.0f, 1, null);
            rVar.X(-1003410150);
            rVar.X(212064437);
            rVar.R();
            c5.d dVar = (c5.d) rVar.N(g1.f());
            Object objE14 = rVar.E();
            p076m2.r.Companion companion8 = p076m2.r.INSTANCE;
            if (objE14 == companion8.a()) {
                objE14 = new p047f5.a0(dVar);
                rVar.v(objE14);
            }
            p047f5.a0 a0Var = (p047f5.a0) objE14;
            Object objE15 = rVar.E();
            if (objE15 == companion8.a()) {
                objE15 = new p047f5.l();
                rVar.v(objE15);
            }
            p047f5.l lVar3 = (p047f5.l) objE15;
            Object objE16 = rVar.E();
            if (objE16 == companion8.a()) {
                objE16 = c6.e(Boolean.FALSE, null, 2, null);
                rVar.v(objE16);
            }
            p076m2.a3 a3Var2 = (p076m2.a3) objE16;
            Object objE17 = rVar.E();
            if (objE17 == companion8.a()) {
                objE17 = new p047f5.p(lVar3);
                rVar.v(objE17);
            }
            p047f5.p pVar = (p047f5.p) objE17;
            Object objE18 = rVar.E();
            if (objE18 == companion8.a()) {
                objE18 = x5.i(i0.f148189a, x5.k());
                rVar.v(objE18);
            }
            p076m2.a3 a3Var3 = (p076m2.a3) objE18;
            boolean zG3 = rVar.G(a0Var) | rVar.c(257);
            Object objE19 = rVar.E();
            if (zG3 || objE19 == companion8.a()) {
                w wVar = new w(a3Var3, a0Var, pVar, 257, a3Var2);
                rVar.v(wVar);
                objE19 = wVar;
            }
            w0 w0Var = (w0) objE19;
            Object objE20 = rVar.E();
            if (objE20 == companion8.a()) {
                objE20 = new x(a3Var2, pVar);
                rVar.v(objE20);
            }
            er.a aVar3 = (er.a) objE20;
            boolean zG4 = rVar.G(a0Var);
            Object objE21 = rVar.E();
            if (zG4 || objE21 == companion8.a()) {
                objE21 = new y(a0Var);
                rVar.v(objE21);
            }
            j0.a(n4.v.d(mVarH9, r15, (er.l) objE21, 1, null), y2.m.d(1200550679, true, new z(a3Var3, lVar3, aVar3, this.f194493h, this.f194499p, this.f194500q), rVar, 54), w0Var, rVar, 48, 0);
            rVar.R();
            rVar.x();
            rVar.R();
            if (this.f194488c.getHelpersHashCode() != helpersHashCode) {
                Function0.g(this.f194489d, rVar, 6);
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Le4/y0;", "", "Le4/v0;", "measurables", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;"}, k = 3, mv = {2, 2, 0})
    public static final class w implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p076m2.a3 f194501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p047f5.a0 f194502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p047f5.p f194503c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f194504d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p076m2.a3 f194505e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 2, 0})
        static final class a extends fr.w implements er.l<a2.a, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p047f5.a0 f194506b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f194507c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Map f194508d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p047f5.a0 a0Var, List list, Map map) {
                super(1);
                this.f194506b = a0Var;
                this.f194507c = list;
                this.f194508d = map;
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
                c(aVar);
                return i0.f148189a;
            }

            public final void c(a2.a aVar) {
                this.f194506b.h(aVar, this.f194507c, this.f194508d);
            }
        }

        public w(p076m2.a3 a3Var, p047f5.a0 a0Var, p047f5.p pVar, int i15, p076m2.a3 a3Var2) {
            this.f194501a = a3Var;
            this.f194502b = a0Var;
            this.f194503c = pVar;
            this.f194504d = i15;
            this.f194505e = a3Var2;
        }

        @Override // p036e4.w0
        public final x0 e(y0 y0Var, List<? extends v0> list, long j15) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.f194501a.getValue();
            long jI = this.f194502b.i(j15, y0Var.getLayoutDirection(), this.f194503c, list, linkedHashMap, this.f194504d);
            this.f194505e.getValue();
            return y0.j2(y0Var, c5.r.g(jI), c5.r.f(jI), null, new a(this.f194502b, list, linkedHashMap), 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 2, 0})
    static final class x extends fr.w implements er.a<i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p076m2.a3 f194509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p047f5.p f194510c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(p076m2.a3 a3Var, p047f5.p pVar) {
            super(0);
            this.f194509b = a3Var;
            this.f194510c = pVar;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            p076m2.a3 a3Var = this.f194509b;
            a3Var.setValue(Boolean.valueOf(!((Boolean) a3Var.getValue()).booleanValue()));
            this.f194510c.j(true);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln4/i0;", "Loq/i0;", "c", "(Ln4/i0;)V"}, k = 3, mv = {2, 2, 0})
    static final class y extends fr.w implements er.l<n4.i0, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p047f5.a0 f194511b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(p047f5.a0 a0Var) {
            super(1);
            this.f194511b = a0Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(n4.i0 i0Var) {
            c(i0Var);
            return i0.f148189a;
        }

        public final void c(n4.i0 i0Var) {
            p047f5.e0.a(i0Var, this.f194511b);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "(Lm2/r;I)V"}, k = 3, mv = {2, 2, 0})
    public static final class z extends fr.w implements er.p<p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p076m2.a3 f194512b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p047f5.l f194513c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ er.a f194514d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ DocumentGiloshData f194515e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f194516f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f194517g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(p076m2.a3 a3Var, p047f5.l lVar, er.a aVar, DocumentGiloshData documentGiloshData, float f15, float f16) {
            super(2);
            this.f194512b = a3Var;
            this.f194513c = lVar;
            this.f194514d = aVar;
            this.f194515e = documentGiloshData;
            this.f194516f = f15;
            this.f194517g = f16;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            long jG;
            long jG2;
            if ((i15 & 3) == 2 && rVar.i()) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(1200550679, i15, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
            }
            this.f194512b.setValue(i0.f148189a);
            int helpersHashCode = this.f194513c.getHelpersHashCode();
            this.f194513c.f();
            p047f5.l lVar = this.f194513c;
            rVar.X(1197555438);
            f5.l.b bVarJ = lVar.j();
            p047f5.f fVarA = bVarJ.a();
            p047f5.f fVarE = bVarJ.e();
            f3.m.Companion companion = f3.m.INSTANCE;
            Object objE = rVar.E();
            p076m2.r.Companion companion2 = p076m2.r.INSTANCE;
            if (objE == companion2.a()) {
                objE = j.f194462a;
                rVar.v(objE);
            }
            f3.m mVarH = lVar.h(companion, fVarA, (er.l) objE);
            boolean zG = rVar.G(this.f194515e);
            Object objE2 = rVar.E();
            if (zG || objE2 == companion2.a()) {
                objE2 = new k(this.f194515e);
                rVar.v(objE2);
            }
            f3.m mVarC = n4.v.c(mVarH, true, (er.l) objE2);
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarB = m3.b(d1.i.f39152a.j(), companion3.i(), rVar, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarC);
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
            n6.i(rVarC, w0VarB, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            q3 q3Var = q3.f39261a;
            f3.m mVarT = androidx.compose.foundation.layout.d.t(companion, this.f194516f);
            int i16 = this.f194515e.getIsValid() ? c20.b.f22688k2 : c20.b.f22737z0;
            if (this.f194515e.getIsValid()) {
                rVar.X(197833587);
                jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().d();
                rVar.R();
            } else {
                rVar.X(197918837);
                jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
                rVar.R();
            }
            h60.f.e(mVarT, null, Integer.valueOf(i16), null, jG, 0.0f, null, null, 0L, 0.0f, 0.0f, null, rVar, 6, 48, 2026);
            r3.a(androidx.compose.foundation.layout.d.y(companion, this.f194517g), rVar, 0);
            Label validityMessage = this.f194515e.getValidityMessage();
            long jK = t70.s.K(14, rVar, 6);
            int iF = b5.j.INSTANCE.f();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            TextStyle textStyleC = aVar.f(rVar, i17).c();
            if (this.f194515e.getIsValid()) {
                rVar.X(198365299);
                jG2 = aVar.a(rVar, i17).getSupport().d();
                rVar.R();
            } else {
                rVar.X(198450549);
                jG2 = aVar.a(rVar, i17).getSupport().g();
                rVar.R();
            }
            j70.h.g(null, null, validityMessage, null, null, jG2, jK, null, null, null, 0L, null, b5.j.h(iF), 0L, 0, false, 0, 0, null, textStyleC, null, null, false, true, null, rVar, 0, 0, 3072, 24637339);
            r3.a(androidx.compose.foundation.layout.d.y(companion, this.f194517g), rVar, 0);
            rVar.x();
            if (this.f194515e.getUpdateButtonData() == null) {
                rVar.X(1199481280);
            } else {
                rVar.X(1199481281);
                boolean zW = rVar.W(fVarA);
                Object objE3 = rVar.E();
                if (zW || objE3 == companion2.a()) {
                    objE3 = new l(fVarA);
                    rVar.v(objE3);
                }
                f3.m mVarH2 = lVar.h(companion, fVarE, (er.l) objE3);
                w0 w0VarI = d1.r.i(companion3.o(), false);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT2 = rVar.t();
                f3.m mVarE2 = f3.j.e(rVar, mVarH2);
                er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
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
                n6.i(rVarC2, w0VarI, companion4.d());
                n6.i(rVarC2, e0VarT2, companion4.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
                n6.g(rVarC2, companion4.a());
                n6.i(rVarC2, mVarE2, companion4.e());
                d1.x xVar = d1.x.f39368a;
                h30.q.p(this.f194515e.getUpdateButtonData(), false, Float.valueOf(6.0f), rVar, MLKEMEngine.KyberPolyBytes, 2);
                rVar.x();
            }
            rVar.R();
            rVar.R();
            if (this.f194513c.getHelpersHashCode() != helpersHashCode) {
                Function0.g(this.f194514d, rVar, 6);
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [T, u20.i] */
    public static final void g(f3.m mVar, final DocumentGiloshData documentGiloshData, final BaseDocumentScreenState baseDocumentScreenState, p076m2.r rVar, final int i15, final int i16) {
        f3.m mVar2;
        int i17;
        final f3.m mVar3;
        final x20.h hVar;
        p076m2.r rVarH = rVar.h(2118491873);
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
            i17 |= rVarH.G(documentGiloshData) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.G(baseDocumentScreenState) ? 256 : 128;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            f3.m mVar4 = i18 != 0 ? f3.m.INSTANCE : mVar2;
            if (p076m2.t.k()) {
                p076m2.t.o(2118491873, i17, -1, "pl.gov.coi.common.ui.document.maincard.DocumentMainCard (DocumentMainCard.kt:78)");
            }
            final p0 p0Var = new p0();
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                rVarH.v(null);
                objE = null;
            }
            p0Var.f66410a = (u20.i) objE;
            if (((Boolean) rVarH.N(u1.a())).booleanValue()) {
                rVarH.X(1742301775);
                rVarH.R();
                hVar = null;
            } else {
                rVarH.X(1742215502);
                Object objE2 = rVarH.E();
                if (objE2 == companion.a()) {
                    objE2 = new x20.h(true);
                    rVarH.v(objE2);
                }
                hVar = (x20.h) objE2;
                rVarH.R();
            }
            k70.a aVar = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            final float spacing50 = aVar.b(rVarH, i19).getSpacing50();
            final float spacing150 = aVar.b(rVarH, i19).getSpacing150();
            final float spacing200 = aVar.b(rVarH, i19).getSpacing200();
            final float spacing250 = aVar.b(rVarH, i19).getSpacing250();
            final float fN = c5.h.n(440);
            final float fN2 = c5.h.n(125);
            final float fN3 = c5.h.n(167);
            final float fN4 = c5.h.n(36);
            t70.s.j(new er.p() { // from class: u20.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.h(p0Var, hVar, (q) obj, (j.a) obj2);
                }
            }, rVarH, 0);
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.g(), rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarH);
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
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            f3.m mVarC = androidx.compose.foundation.layout.d.C(androidx.compose.foundation.layout.d.h(mVar4, 0.0f, 1, null), null, false, 3, null);
            y1 y1Var = y1.f58315a;
            int i25 = y1.f58316b;
            x1 x1VarD = x1.d(y1Var.a(rVarH, i25), aVar.a(rVarH, i19).getSurface().a(), Color.INSTANCE.a(), 0L, 0L, 12, null);
            y2 radius150 = aVar.e(rVarH, i19).getRadius150();
            f3.m mVar5 = mVar4;
            final x20.h hVar2 = hVar;
            z1 z1VarC = y1Var.c(aVar.c(rVarH, i19).getLevel0(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, i25 << 18, 62);
            rVarH = rVarH;
            c2.c(mVarC, radius150, x1VarD, z1VarC, null, y2.m.d(43921097, true, new er.q() { // from class: u20.b
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return g.i(fN, fN2, fN3, spacing250, documentGiloshData, baseDocumentScreenState, hVar2, p0Var, spacing50, spacing150, fN4, spacing200, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 196608, 16);
            Label animationsButtonText = documentGiloshData.getAnimationsButtonText();
            if (animationsButtonText == null) {
                rVarH.X(1998447015);
            } else {
                rVarH.X(1998447016);
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVarH, i19).getSpacing200()), rVarH, 0);
                h30.q.p(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(animationsButtonText, null, 2, null), k30.d.a.f107773a, null, documentGiloshData.c(), 35, null), false, null, rVarH, 0, 6);
            }
            rVarH.R();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            mVar3 = mVar5;
        } else {
            rVarH.O();
            mVar3 = mVar2;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: u20.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.k(mVar3, documentGiloshData, baseDocumentScreenState, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 h(p0 p0Var, x20.h hVar, androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar) {
        int i15 = a0.f194446a[aVar.ordinal()];
        if (i15 == 1) {
            u20.i iVar = (u20.i) p0Var.f66410a;
            if (iVar != null) {
                iVar.e();
            }
            if (hVar != null) {
                hVar.h();
            }
        } else if (i15 == 2) {
            u20.i iVar2 = (u20.i) p0Var.f66410a;
            if (iVar2 != null) {
                iVar2.d();
            }
            if (hVar != null) {
                hVar.i();
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(float f15, float f16, float f17, float f18, DocumentGiloshData documentGiloshData, BaseDocumentScreenState baseDocumentScreenState, x20.h hVar, p0 p0Var, float f19, float f25, float f26, float f27, h0 h0Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(43921097, i15, -1, "pl.gov.coi.common.ui.document.maincard.DocumentMainCard.<anonymous>.<anonymous> (DocumentMainCard.kt:131)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
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
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.x xVar = d1.x.f39368a;
            f3.m mVarB = androidx.compose.foundation.layout.d.b(androidx.compose.foundation.layout.d.C(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), null, false, 3, null), 0.0f, f15, 1, null);
            Object objE = rVar.E();
            p076m2.r.Companion companion3 = p076m2.r.INSTANCE;
            if (objE == companion3.a()) {
                objE = new er.l() { // from class: u20.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return g.j((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarD = n4.v.d(mVarB, false, (er.l) objE, 1, null);
            rVar.X(-1003410150);
            rVar.X(212064437);
            rVar.R();
            c5.d dVar = (c5.d) rVar.N(g1.f());
            Object objE2 = rVar.E();
            if (objE2 == companion3.a()) {
                objE2 = new p047f5.a0(dVar);
                rVar.v(objE2);
            }
            p047f5.a0 a0Var = (p047f5.a0) objE2;
            Object objE3 = rVar.E();
            if (objE3 == companion3.a()) {
                objE3 = new p047f5.l();
                rVar.v(objE3);
            }
            p047f5.l lVar = (p047f5.l) objE3;
            Object objE4 = rVar.E();
            if (objE4 == companion3.a()) {
                objE4 = c6.e(Boolean.FALSE, null, 2, null);
                rVar.v(objE4);
            }
            p076m2.a3 a3Var = (p076m2.a3) objE4;
            Object objE5 = rVar.E();
            if (objE5 == companion3.a()) {
                objE5 = new p047f5.p(lVar);
                rVar.v(objE5);
            }
            p047f5.p pVar = (p047f5.p) objE5;
            Object objE6 = rVar.E();
            if (objE6 == companion3.a()) {
                objE6 = x5.i(i0.f148189a, x5.k());
                rVar.v(objE6);
            }
            p076m2.a3 a3Var2 = (p076m2.a3) objE6;
            boolean zG = rVar.G(a0Var) | rVar.c(257);
            Object objE7 = rVar.E();
            if (zG || objE7 == companion3.a()) {
                objE7 = new s(a3Var2, a0Var, pVar, 257, a3Var);
                rVar.v(objE7);
            }
            w0 w0Var = (w0) objE7;
            Object objE8 = rVar.E();
            if (objE8 == companion3.a()) {
                objE8 = new t(a3Var, pVar);
                rVar.v(objE8);
            }
            er.a aVar = (er.a) objE8;
            boolean zG2 = rVar.G(a0Var);
            Object objE9 = rVar.E();
            if (zG2 || objE9 == companion3.a()) {
                objE9 = new u(a0Var);
                rVar.v(objE9);
            }
            j0.a(n4.v.d(mVarD, false, (er.l) objE9, 1, null), y2.m.d(1200550679, true, new v(a3Var2, lVar, aVar, f16, f17, f18, documentGiloshData, baseDocumentScreenState, hVar, p0Var, f19, f25, f26, f27), rVar, 54), w0Var, rVar, 48, 0);
            rVar.R();
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
    public static final i0 j(n4.i0 i0Var) {
        n4.f0.H0(i0Var, true);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(f3.m mVar, DocumentGiloshData documentGiloshData, BaseDocumentScreenState baseDocumentScreenState, int i15, int i16, p076m2.r rVar, int i17) {
        g(mVar, documentGiloshData, baseDocumentScreenState, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    public static final void l(final KeyValueData keyValueData, final Color color, final int i15, p076m2.r rVar, final int i16) {
        int i17;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1823461567);
        if ((i16 & 6) == 0) {
            i17 = (rVarH.W(keyValueData) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= rVarH.W(color) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.c(i15) ? 256 : 128;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1823461567, i17, -1, "pl.gov.coi.common.ui.document.maincard.KeyValueItem (DocumentMainCard.kt:468)");
            }
            int i18 = i15 * 2;
            f3.m.Companion companion = f3.m.INSTANCE;
            boolean z15 = (i17 & 14) == 4;
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: u20.e
                    @Override // er.l
                    public final Object b(Object obj) {
                        return g.m(keyValueData, (n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f3.m mVarC = n4.v.c(companion, true, (er.l) objE);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarC);
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label labelD = keyValueData.d();
            k70.a aVar = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            j70.h.g(null, null, labelD, null, null, color != null ? color.m20unboximpl() : Color.INSTANCE.h(), t70.s.K(16, rVarH, 6), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i19).a(), null, Float.valueOf(i18 + 1), false, true, null, rVarH, 0, 0, 3072, 22544283);
            rVar2 = rVarH;
            j70.h.g(null, null, keyValueData.c(), null, null, color != null ? color.m20unboximpl() : Color.INSTANCE.h(), t70.s.K(12, rVarH, 6), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i19).f(), null, Float.valueOf(i18), false, true, null, rVar2, 0, 0, 3072, 22544283);
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: u20.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.n(keyValueData, color, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(KeyValueData keyValueData, n4.i0 i0Var) {
        String lowerCase;
        g0.a(i0Var, true);
        n4.f0.y0(i0Var, keyValueData.c().getTag() + '_' + keyValueData.d().getTag());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(t70.s.O(keyValueData.c()));
        boolean readLetterByLetter = keyValueData.getReadLetterByLetter();
        if (readLetterByLetter) {
            lowerCase = dz.e.g(keyValueData.d().getText(), 1, " ");
        } else {
            if (readLetterByLetter) {
                throw new oq.p();
            }
            lowerCase = t70.s.O(keyValueData.d()).toLowerCase(Locale.ROOT);
        }
        sb5.append(lowerCase);
        n4.f0.c0(i0Var, sb5.toString());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(KeyValueData keyValueData, Color color, int i15, int i16, p076m2.r rVar, int i17) {
        l(keyValueData, color, i15, rVar, g4.a(i16 | 1));
        return i0.f148189a;
    }
}
