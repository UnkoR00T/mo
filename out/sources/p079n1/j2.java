package p079n1;

import a4.k0;
import android.view.KeyEvent;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.g1;
import androidx.compose.ui.platform.n3;
import androidx.compose.ui.platform.r2;
import androidx.compose.ui.platform.v2;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.l;
import er.p;
import er.q;
import f3.j;
import f3.m;
import fr.t;
import java.util.List;
import ju.p0;
import ju.q0;
import l3.d0;
import l3.l0;
import l3.o;
import m3.e;
import oq.i0;
import oq.u;
import oq.x;
import oq.y;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.a2;
import p036e4.b0;
import p036e4.v;
import p036e4.w;
import p036e4.w0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d4;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.r0;
import p076m2.s0;
import p076m2.x5;
import p143z0.b3;
import p3.c;
import p3.f;
import q4.TextLayoutResult;
import q4.TextStyle;
import q4.z3;
import v4.ImeOptions;
import v4.TextFieldValue;
import v4.TransformedText;
import v4.a0;
import v4.b1;
import v4.e1;
import v4.v0;
import vq.k;
import w0.g0;
import x1.CoreTextFieldSemanticsModifier;
import x1.h1;
import x1.k1;
import x1.l1;
import z1.SelectionColors;
import z1.SelectionHandleInfo;
import z1.a1;
import z1.c1;
import z1.c2;
import z1.c3;
import z1.f0;
import z1.g3;
import z1.p2;
import z1.t1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aã\u0001\u0010 \u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00112\u001a\b\u0002\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001c\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0001¢\u0006\u0004\b \u0010!\u001a-\u0010%\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u001cH\u0003¢\u0006\u0004\b%\u0010&\u001a#\u0010)\u001a\u00020\u0005*\u00020\u00052\u0006\u0010(\u001a\u00020'2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b)\u0010*\u001a'\u0010.\u001a\u00020\u00032\u0006\u0010(\u001a\u00020'2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0011H\u0000¢\u0006\u0004\b.\u0010/\u001a7\u00104\u001a\u00020\u00032\u0006\u00101\u001a\u0002002\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105\u001a\u0017\u00106\u001a\u00020\u00032\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b6\u00107\u001a4\u0010<\u001a\u00020\u0003*\u0002082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\u000b2\u0006\u00103\u001a\u000202H\u0080@¢\u0006\u0004\b<\u0010=\u001a\u001f\u0010?\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"2\u0006\u0010>\u001a\u00020\u0011H\u0003¢\u0006\u0004\b?\u0010@\u001a\u0017\u0010A\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\bA\u0010B\u001a+\u0010C\u001a\u00020\u0005*\u00020\u00052\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00103\u001a\u000202H\u0000¢\u0006\u0004\bC\u0010D\u001a'\u0010E\u001a\u00020\u00032\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\bE\u0010F\u001a#\u0010J\u001a\u00020\u0005*\u00020\u00052\u0006\u0010G\u001a\u00020\"2\u0006\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bJ\u0010K¨\u0006M²\u0006\f\u0010L\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"Lv4/t0;", "value", "Lkotlin/Function1;", "Loq/i0;", "onValueChange", "Lf3/m;", "modifier", "Lq4/b4;", "textStyle", "Lv4/e1;", "visualTransformation", "Lq4/t3;", "onTextLayout", "Lb1/l;", "interactionSource", "Landroidx/compose/ui/graphics/c;", "cursorBrush", "", "softWrap", "", "maxLines", "minLines", "Lv4/u;", "imeOptions", "Ln1/l3;", "keyboardActions", "enabled", "readOnly", "Lkotlin/Function0;", "decorationBox", "Ln1/a6;", "textScrollerPosition", "w", "(Lv4/t0;Ler/l;Lf3/m;Lq4/b4;Lv4/e1;Ler/l;Lb1/l;Landroidx/compose/ui/graphics/c;ZIILv4/u;Ln1/l3;ZZLer/q;Ln1/a6;Lm2/r;III)V", "Lz1/c2;", "manager", "content", i.f37086m, "(Lf3/m;Lz1/c2;Ler/p;Lm2/r;I)V", "Ln1/s3;", "state", "g0", "(Lf3/m;Ln1/s3;Lz1/c2;)Lf3/m;", "Ll3/d0;", "focusRequester", "allowKeyboard", "h0", "(Ln1/s3;Ll3/d0;Z)V", "Lv4/v0;", "textInputService", "Lv4/i0;", "offsetMapping", "i0", "(Lv4/v0;Ln1/s3;Lv4/t0;Lv4/u;Lv4/i0;)V", "e0", "(Ln1/s3;)V", "Lj1/a;", "Ln1/j4;", "textDelegate", "textLayoutResult", "b0", "(Lj1/a;Lv4/t0;Ln1/j4;Lq4/t3;Lv4/i0;Ltq/e;)Ljava/lang/Object;", "show", "R", "(Lz1/c2;ZLm2/r;I)V", "T", "(Lz1/c2;Lm2/r;I)V", "c0", "(Lf3/m;Ln1/s3;Lv4/t0;Lv4/i0;)Lf3/m;", "f0", "(Ln1/s3;Lv4/t0;Lv4/i0;)V", "textFieldSelectionManager", "Lju/p0;", "coroutineScope", "a0", "(Lf3/m;Lz1/c2;Lju/p0;)Lf3/m;", "writeable", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j2 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f130114e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ s3 f130115f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f6<Boolean> f130116g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ v0 f130117h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ c2 f130118j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ ImeOptions f130119k;

        /* JADX INFO: renamed from: n1.j2$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class C3236a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ s3 f130120a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v0 f130121b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ c2 f130122c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ImeOptions f130123d;

            C3236a(s3 s3Var, v0 v0Var, c2 c2Var, ImeOptions imeOptions) {
                this.f130120a = s3Var;
                this.f130121b = v0Var;
                this.f130122c = c2Var;
                this.f130123d = imeOptions;
            }

            @Override // mu.h
            public /* bridge */ /* synthetic */ Object F(Object obj, tq.e eVar) {
                return a(((Boolean) obj).booleanValue(), eVar);
            }

            public final Object a(boolean z15, tq.e<? super i0> eVar) {
                if (z15 && this.f130120a.h()) {
                    j2.i0(this.f130121b, this.f130120a, this.f130122c.p0(), this.f130123d, this.f130122c.getOffsetMapping());
                } else {
                    j2.e0(this.f130120a);
                }
                return i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s3 s3Var, f6<Boolean> f6Var, v0 v0Var, c2 c2Var, ImeOptions imeOptions, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f130115f = s3Var;
            this.f130116g = f6Var;
            this.f130117h = v0Var;
            this.f130118j = c2Var;
            this.f130119k = imeOptions;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean O(f6 f6Var) {
            return j2.C(f6Var);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f130114e;
            try {
                if (i15 == 0) {
                    u.b(obj);
                    final f6<Boolean> f6Var = this.f130116g;
                    mu.g gVarQ = x5.q(new er.a() { // from class: n1.i2
                        @Override // er.a
                        public final Object a() {
                            return Boolean.valueOf(j2.a.O(f6Var));
                        }
                    });
                    C3236a c3236a = new C3236a(this.f130115f, this.f130117h, this.f130118j, this.f130119k);
                    this.f130114e = 1;
                    if (gVarQ.a(c3236a, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                j2.e0(this.f130115f);
                return i0.f148189a;
            } catch (Throwable th4) {
                j2.e0(this.f130115f);
                throw th4;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f130115f, this.f130116g, this.f130117h, this.f130118j, this.f130119k, eVar);
        }
    }

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"n1/j2$b", "Le4/w0;", "Le4/y0;", "", "Le4/v0;", "measurables", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;", "Le4/w;", "Le4/v;", "", "height", "i", "(Le4/w;Ljava/util/List;I)I", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s3 f130124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<TextLayoutResult, i0> f130125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f130126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ v4.i0 f130127d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c5.d f130128e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f130129f;

        /* JADX WARN: Multi-variable type inference failed */
        b(s3 s3Var, l<? super TextLayoutResult, i0> lVar, TextFieldValue textFieldValue, v4.i0 i0Var, c5.d dVar, int i15) {
            this.f130124a = s3Var;
            this.f130125b = lVar;
            this.f130126c = textFieldValue;
            this.f130127d = i0Var;
            this.f130128e = dVar;
            this.f130129f = i15;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 b(a2.a aVar) {
            return i0.f148189a;
        }

        @Override // p036e4.w0
        public x0 e(y0 y0Var, List<? extends p036e4.v0> list, long j15) {
            c3.l.Companion companion = c3.l.INSTANCE;
            s3 s3Var = this.f130124a;
            c3.l lVarD = companion.d();
            l<Object, i0> lVarG = lVarD != null ? lVarD.g() : null;
            c3.l lVarE = companion.e(lVarD);
            try {
                k6 k6VarN = s3Var.n();
                companion.l(lVarD, lVarE, lVarG);
                TextLayoutResult value = k6VarN != null ? k6VarN.getValue() : null;
                x<Integer, Integer, TextLayoutResult> xVarF = s4.INSTANCE.f(this.f130124a.getTextDelegate(), j15, y0Var.getLayoutDirection(), value);
                int iIntValue = xVarF.a().intValue();
                int iIntValue2 = xVarF.b().intValue();
                TextLayoutResult textLayoutResultC = xVarF.c();
                if (!t.c(value, textLayoutResultC)) {
                    this.f130124a.Q(new k6(textLayoutResultC, null, k6VarN != null ? k6VarN.getDecorationBoxCoordinates() : null, 2, null));
                    this.f130125b.b(textLayoutResultC);
                    j2.f0(this.f130124a, this.f130126c, this.f130127d);
                }
                this.f130124a.R(this.f130128e.b2(this.f130129f == 1 ? k4.a(textLayoutResultC.m(0)) : 0));
                return y0Var.x1(iIntValue, iIntValue2, pq.v0.l(y.a(p036e4.b.a(), Integer.valueOf(Math.round(textLayoutResultC.getFirstBaseline()))), y.a(p036e4.b.b(), Integer.valueOf(Math.round(textLayoutResultC.getLastBaseline())))), new l() { // from class: n1.k2
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j2.b.b((a2.a) obj);
                    }
                });
            } catch (Throwable th4) {
                companion.l(lVarD, lVarE, lVarG);
                throw th4;
            }
        }

        @Override // p036e4.w0
        public int i(w wVar, List<? extends v> list, int i15) {
            this.f130124a.getTextDelegate().m(wVar.getLayoutDirection());
            return this.f130124a.getTextDelegate().c();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f130130e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ j1.a f130131f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f130132g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ s3 f130133h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ k6 f130134j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ v4.i0 f130135k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(j1.a aVar, TextFieldValue textFieldValue, s3 s3Var, k6 k6Var, v4.i0 i0Var, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f130131f = aVar;
            this.f130132g = textFieldValue;
            this.f130133h = s3Var;
            this.f130134j = k6Var;
            this.f130135k = i0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f130130e;
            if (i15 == 0) {
                u.b(obj);
                j1.a aVar = this.f130131f;
                TextFieldValue textFieldValue = this.f130132g;
                j4 textDelegate = this.f130133h.getTextDelegate();
                TextLayoutResult value = this.f130134j.getValue();
                v4.i0 i0Var = this.f130135k;
                this.f130130e = 1;
                if (j2.b0(aVar, textFieldValue, textDelegate, value, i0Var, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f130131f, this.f130132g, this.f130133h, this.f130134j, this.f130135k, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"n1/j2$d", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c2 f130136a;

        public d(c2 c2Var) {
            this.f130136a = c2Var;
        }

        @Override // p076m2.r0
        public void j() {
            this.f130136a.r0();
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"n1/j2$e", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements r0 {
        @Override // p076m2.r0
        public void j() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements z1.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f130137a;

        f(long j15) {
            this.f130137a = j15;
        }

        @Override // z1.w
        public final long a() {
            return this.f130137a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l4 f130138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c2 f130139b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends k implements p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f130140e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f130141f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k0 f130142g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ l4 f130143h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ c2 f130144j;

            /* JADX INFO: renamed from: n1.j2$g$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
            static final class C3237a extends k implements p<p0, tq.e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f130145e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ k0 f130146f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ l4 f130147g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C3237a(k0 k0Var, l4 l4Var, tq.e<? super C3237a> eVar) {
                    super(2, eVar);
                    this.f130146f = k0Var;
                    this.f130147g = l4Var;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f130145e;
                    if (i15 == 0) {
                        u.b(obj);
                        k0 k0Var = this.f130146f;
                        l4 l4Var = this.f130147g;
                        this.f130145e = 1;
                        if (a4.g(k0Var, l4Var, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        u.b(obj);
                    }
                    return i0.f148189a;
                }

                @Override // er.p
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                    return ((C3237a) v(p0Var, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    return new C3237a(this.f130146f, this.f130147g, eVar);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
            static final class b extends k implements p<p0, tq.e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f130148e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ k0 f130149f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ c2 f130150g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(k0 k0Var, c2 c2Var, tq.e<? super b> eVar) {
                    super(2, eVar);
                    this.f130149f = k0Var;
                    this.f130150g = c2Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final i0 O(c2 c2Var, m3.e eVar) {
                    c2Var.V0();
                    return i0.f148189a;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f130148e;
                    if (i15 == 0) {
                        u.b(obj);
                        k0 k0Var = this.f130149f;
                        final c2 c2Var = this.f130150g;
                        l lVar = new l() { // from class: n1.l2
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return j2.g.a.b.O(c2Var, (e) obj2);
                            }
                        };
                        this.f130148e = 1;
                        if (b3.i(k0Var, null, null, null, lVar, this, 7, null) == objE) {
                            return objE;
                        }
                    } else {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        u.b(obj);
                    }
                    return i0.f148189a;
                }

                @Override // er.p
                /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
                public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                    return ((b) v(p0Var, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    return new b(this.f130149f, this.f130150g, eVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k0 k0Var, l4 l4Var, c2 c2Var, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f130142g = k0Var;
                this.f130143h = l4Var;
                this.f130144j = c2Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f130140e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                p0 p0Var = (p0) this.f130141f;
                ju.r0 r0Var = ju.r0.UNDISPATCHED;
                ju.k.d(p0Var, null, r0Var, new C3237a(this.f130142g, this.f130143h, null), 1, null);
                ju.k.d(p0Var, null, r0Var, new b(this.f130142g, this.f130144j, null), 1, null);
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f130142g, this.f130143h, this.f130144j, eVar);
                aVar.f130141f = obj;
                return aVar;
            }
        }

        g(l4 l4Var, c2 c2Var) {
            this.f130138a = l4Var;
            this.f130139b = c2Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(k0 k0Var, tq.e<? super i0> eVar) {
            Object objE = q0.e(new a(k0Var, this.f130138a, this.f130139b, null), eVar);
            return objE == uq.b.e() ? objE : i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements l<y3.b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s3 f130151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c2 f130152b;

        h(s3 s3Var, c2 c2Var) {
            this.f130151a = s3Var;
            this.f130152b = c2Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Boolean b(y3.b bVar) {
            return c(bVar.getNativeKeyEvent());
        }

        public final Boolean c(KeyEvent keyEvent) {
            boolean z15;
            if (this.f130151a.g() == r2.Selection && d3.a(keyEvent)) {
                z15 = true;
                c2.L(this.f130152b, null, 1, null);
            } else {
                z15 = false;
            }
            return Boolean.valueOf(z15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q4.e A(c2 c2Var) {
        return c2Var.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(s3 s3Var, boolean z15, boolean z16, v0 v0Var, TextFieldValue textFieldValue, ImeOptions imeOptions, v4.i0 i0Var, c2 c2Var, p0 p0Var, j1.a aVar, l0 l0Var) {
        k6 k6VarN;
        if (s3Var.h() == l0Var.b()) {
            return i0.f148189a;
        }
        s3Var.L(l0Var.b());
        if (s3Var.h() && z15 && !z16) {
            i0(v0Var, s3Var, textFieldValue, imeOptions, i0Var);
        } else {
            e0(s3Var);
        }
        if (l0Var.b() && (k6VarN = s3Var.n()) != null) {
            ju.k.d(p0Var, null, null, new c(aVar, textFieldValue, s3Var, k6VarN, i0Var, null), 3, null);
        }
        if (!l0Var.b()) {
            c2.L(c2Var, null, 1, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C(f6<Boolean> f6Var) {
        return f6Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(s3 s3Var, boolean z15, n3 n3Var, c2 c2Var, TextFieldValue textFieldValue, v4.i0 i0Var, b0 b0Var) {
        b1 inputSession;
        s3Var.P(b0Var);
        k6 k6VarN = s3Var.n();
        if (k6VarN != null) {
            k6VarN.i(b0Var);
        }
        if (z15) {
            if (s3Var.g() == r2.Selection) {
                if (s3Var.w() && n3Var.b()) {
                    c2Var.V0();
                } else {
                    c2Var.r0();
                }
                s3Var.W(c3.y(c2Var, true));
                s3Var.V(c3.y(c2Var, false));
                s3Var.T(z3.h(textFieldValue.getSelection()));
            } else if (s3Var.g() == r2.Cursor) {
                s3Var.T(c3.y(c2Var, true));
            }
            f0(s3Var, textFieldValue, i0Var);
            k6 k6VarN2 = s3Var.n();
            if (k6VarN2 != null && (inputSession = s3Var.getInputSession()) != null && s3Var.h()) {
                s4.INSTANCE.o(inputSession, textFieldValue, i0Var, k6VarN2);
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 E(c2 c2Var, s0 s0Var) {
        return new d(c2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 F(s3 s3Var, v0 v0Var, TextFieldValue textFieldValue, ImeOptions imeOptions, s0 s0Var) {
        if (s3Var.h()) {
            s3Var.N(s4.INSTANCE.l(v0Var, textFieldValue, s3Var.getProcessor(), imeOptions, s3Var.r(), s3Var.p()));
        }
        return new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(boolean z15, k1 k1Var) {
        if (z15) {
            k1Var.k();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(s3 s3Var, androidx.compose.ui.graphics.c cVar, p3.c cVar2) {
        cVar2.H2();
        if (s3Var.e() || s3Var.k()) {
            p3.f.F1(cVar2, cVar, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(s3 s3Var, b0 b0Var) {
        k6 k6VarN = s3Var.n();
        if (k6VarN != null) {
            k6VarN.h(b0Var);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(q qVar, final s3 s3Var, final TextStyle textStyle, final boolean z15, final int i15, final int i16, final a6 a6Var, final TextFieldValue textFieldValue, final e1 e1Var, final m mVar, final m mVar2, final m mVar3, final m mVar4, final j1.a aVar, final c2 c2Var, final boolean z16, final boolean z17, final l lVar, final v4.i0 i0Var, final c5.d dVar, r rVar, int i17) {
        if (rVar.r((i17 & 3) != 2, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-814563849, i17, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:548)");
            }
            qVar.w(y2.m.d(-44346382, true, new p() { // from class: n1.x1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j2.K(s3Var, textStyle, z15, i15, i16, a6Var, textFieldValue, e1Var, mVar, mVar2, mVar3, mVar4, aVar, c2Var, z16, z17, lVar, i0Var, dVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(final s3 s3Var, TextStyle textStyle, boolean z15, int i15, final int i16, a6 a6Var, final TextFieldValue textFieldValue, e1 e1Var, m mVar, m mVar2, m mVar3, m mVar4, j1.a aVar, final c2 c2Var, final boolean z16, final boolean z17, final l lVar, final v4.i0 i0Var, final c5.d dVar, r rVar, int i17) {
        if (rVar.r((i17 & 3) != 2, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-44346382, i17, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:551)");
            }
            m mVarB = u2.b(androidx.compose.foundation.layout.d.k(m.INSTANCE, s3Var.o(), 0.0f, 2, null), textStyle, z15, i15, i16);
            boolean zG = rVar.G(s3Var);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: n1.b2
                    @Override // er.a
                    public final Object a() {
                        return j2.L(s3Var);
                    }
                };
                rVar.v(objE);
            }
            t1.b(j1.e.b(g6.i(x5.b(mVarB, a6Var, textFieldValue, e1Var, (er.a) objE).u(mVar).u(mVar2), textStyle).u(mVar3).u(mVar4), aVar), y2.m.d(1412697320, true, new p() { // from class: n1.c2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j2.M(c2Var, s3Var, z16, z17, lVar, textFieldValue, i0Var, dVar, i16, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, 48, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k6 L(s3 s3Var) {
        return s3Var.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(c2 c2Var, s3 s3Var, boolean z15, boolean z16, l lVar, TextFieldValue textFieldValue, v4.i0 i0Var, c5.d dVar, int i15, r rVar, int i16) {
        if (rVar.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1412697320, i16, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:577)");
            }
            b bVar = new b(s3Var, lVar, textFieldValue, i0Var, dVar, i15);
            m.Companion companion = m.INSTANCE;
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, companion);
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
            r rVarC = n6.c(rVar);
            n6.i(rVarC, bVar, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            rVar.x();
            R(c2Var, s3Var.g() != r2.None && s3Var.m() != null && s3Var.m().c() && z15, rVar, 0);
            if (s3Var.g() == r2.Cursor && !z16 && z15) {
                rVar.X(-714666198);
                T(c2Var, rVar, 0);
                rVar.R();
            } else {
                rVar.X(-714589318);
                rVar.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(TextFieldValue textFieldValue, l lVar, m mVar, TextStyle textStyle, e1 e1Var, l lVar2, b1.l lVar3, androidx.compose.ui.graphics.c cVar, boolean z15, int i15, int i16, ImeOptions imeOptions, l3 l3Var, boolean z16, boolean z17, q qVar, a6 a6Var, int i17, int i18, int i19, r rVar, int i25) {
        w(textFieldValue, lVar, mVar, textStyle, e1Var, lVar2, lVar3, cVar, z15, i15, i16, imeOptions, l3Var, z16, z17, qVar, a6Var, rVar, g4.a(i17 | 1), g4.a(i18), i19);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a6 O(p143z0.a2 a2Var) {
        return new a6(a2Var, 0.0f, 2, null);
    }

    private static final void P(final m mVar, final c2 c2Var, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(2036174316);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(c2Var) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(pVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2036174316, i16, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:666)");
            }
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), true);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVar);
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
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            l1.b(c2Var, pVar, rVarH, (i16 >> 3) & 126);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: n1.m1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j2.Q(mVar, c2Var, pVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q(m mVar, c2 c2Var, p pVar, int i15, r rVar, int i16) {
        P(mVar, c2Var, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void R(final c2 c2Var, final boolean z15, r rVar, final int i15) {
        int i16;
        k6 k6VarN;
        TextLayoutResult value;
        r rVarH = rVar.h(626339208);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(c2Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.a(z15) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(626339208, i16, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1019)");
            }
            if (z15) {
                rVarH.X(1530097388);
                s3 state = c2Var.getState();
                TextLayoutResult textLayoutResult = null;
                if (state != null && (k6VarN = state.n()) != null && (value = k6VarN.getValue()) != null) {
                    s3 state2 = c2Var.getState();
                    if (!(state2 != null ? state2.getIsLayoutResultStale() : true)) {
                        textLayoutResult = value;
                    }
                }
                if (textLayoutResult == null) {
                    rVarH.X(1530097387);
                    rVarH.R();
                } else {
                    rVarH.X(1530097388);
                    if (z3.h(c2Var.p0().getSelection())) {
                        rVarH.X(2110860558);
                        rVarH.R();
                    } else {
                        rVarH.X(2109807302);
                        int iE = c2Var.getOffsetMapping().e(z3.n(c2Var.p0().getSelection()));
                        int iE2 = c2Var.getOffsetMapping().e(z3.i(c2Var.p0().getSelection()));
                        b5.i iVarC = textLayoutResult.c(iE);
                        b5.i iVarC2 = textLayoutResult.c(Math.max(iE2 - 1, 0));
                        s3 state3 = c2Var.getState();
                        if (state3 == null || !state3.y()) {
                            rVarH.X(2110490542);
                            rVarH.R();
                        } else {
                            rVarH.X(2110225306);
                            p2.h(true, iVarC, c2Var, rVarH, ((i16 << 6) & 896) | 6);
                            rVarH.R();
                        }
                        s3 state4 = c2Var.getState();
                        if (state4 == null || !state4.x()) {
                            rVarH.X(2110838734);
                            rVarH.R();
                        } else {
                            rVarH.X(2110574459);
                            p2.h(false, iVarC2, c2Var, rVarH, ((i16 << 6) & 896) | 6);
                            rVarH.R();
                        }
                        rVarH.R();
                    }
                    s3 state5 = c2Var.getState();
                    if (state5 != null) {
                        if (c2Var.t0()) {
                            state5.U(false);
                        }
                        if (state5.h()) {
                            if (state5.w()) {
                                c2Var.V0();
                            } else {
                                c2Var.r0();
                            }
                        }
                        i0 i0Var = i0.f148189a;
                    }
                    rVarH.R();
                }
                rVarH.R();
            } else {
                rVarH.X(1989076778);
                rVarH.R();
                c2Var.r0();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: n1.f2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j2.S(c2Var, z15, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(c2 c2Var, boolean z15, int i15, r rVar, int i16) {
        R(c2Var, z15, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void T(final c2 c2Var, r rVar, final int i15) {
        int i16;
        q4.e eVarO0;
        r rVarH = rVar.h(-1436003720);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(c2Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1436003720, i16, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1066)");
            }
            s3 state = c2Var.getState();
            if (state == null || !state.v() || (eVarO0 = c2Var.o0()) == null || eVarO0.length() <= 0) {
                rVarH.X(-2111042550);
                rVarH.R();
            } else {
                rVarH.X(-2112351432);
                boolean zW = rVarH.W(c2Var);
                Object objE = rVarH.E();
                if (zW || objE == r.INSTANCE.a()) {
                    objE = c2Var.H();
                    rVarH.v(objE);
                }
                l4 l4Var = (l4) objE;
                final long jV = c2Var.V((c5.d) rVarH.N(g1.f()));
                boolean zD = rVarH.d(jV);
                Object objE2 = rVarH.E();
                if (zD || objE2 == r.INSTANCE.a()) {
                    objE2 = new f(jV);
                    rVarH.v(objE2);
                }
                z1.w wVar = (z1.w) objE2;
                m.Companion companion = m.INSTANCE;
                boolean zG = rVarH.G(l4Var) | rVarH.G(c2Var);
                Object objE3 = rVarH.E();
                if (zG || objE3 == r.INSTANCE.a()) {
                    objE3 = new g(l4Var, c2Var);
                    rVarH.v(objE3);
                }
                m mVarC = a4.w0.c(companion, l4Var, (PointerInputEventHandler) objE3);
                boolean zD2 = rVarH.d(jV);
                Object objE4 = rVarH.E();
                if (zD2 || objE4 == r.INSTANCE.a()) {
                    objE4 = new l() { // from class: n1.d2
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.U(jV, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE4);
                }
                p079n1.g.g(wVar, n4.v.d(mVarC, false, (l) objE4, 1, null), 0L, rVarH, 0, 4);
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: n1.e2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j2.V(c2Var, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U(long j15, n4.i0 i0Var) {
        i0Var.e(c1.d(), new SelectionHandleInfo(q2.Cursor, j15, a1.Middle, true, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V(c2 c2Var, int i15, r rVar, int i16) {
        T(c2Var, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final m a0(m mVar, c2 c2Var, p0 p0Var) {
        return g0.isNewContextMenuEnabled ? c3.m(mVar, c2Var, p0Var) : mVar;
    }

    public static final Object b0(j1.a aVar, TextFieldValue textFieldValue, j4 j4Var, TextLayoutResult textLayoutResult, v4.i0 i0Var, tq.e<? super i0> eVar) {
        m3.g gVarD;
        int iE = i0Var.e(z3.k(textFieldValue.getSelection()));
        if (iE < textLayoutResult.getLayoutInput().getText().length()) {
            gVarD = textLayoutResult.d(iE);
        } else {
            gVarD = iE != 0 ? textLayoutResult.d(iE - 1) : new m3.g(0.0f, 0.0f, 1.0f, (int) (t4.b(j4Var.getStyle(), j4Var.getDensity(), j4Var.getFontFamilyResolver(), null, 0, 24, null) & BodyPartID.bodyIdMax));
        }
        Object objB = aVar.b(gVarD, eVar);
        return objB == uq.b.e() ? objB : i0.f148189a;
    }

    public static final m c0(m mVar, final s3 s3Var, final TextFieldValue textFieldValue, final v4.i0 i0Var) {
        return k3.k.b(mVar, new l() { // from class: n1.a2
            @Override // er.l
            public final Object b(Object obj) {
                return j2.d0(s3Var, textFieldValue, i0Var, (f) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d0(s3 s3Var, TextFieldValue textFieldValue, v4.i0 i0Var, p3.f fVar) {
        k6 k6VarN = s3Var.n();
        if (k6VarN != null) {
            s4.INSTANCE.d(fVar.getDrawContext().f(), textFieldValue, s3Var.u(), s3Var.f(), i0Var, k6VarN.getValue(), s3Var.getHighlightPaint(), s3Var.getSelectionBackgroundColor());
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(s3 s3Var) {
        b1 inputSession = s3Var.getInputSession();
        if (inputSession != null) {
            s4.INSTANCE.i(inputSession, s3Var.getProcessor(), s3Var.r());
        }
        s3Var.N(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(s3 s3Var, TextFieldValue textFieldValue, v4.i0 i0Var) {
        c3.l.Companion companion = c3.l.INSTANCE;
        c3.l lVarD = companion.d();
        l<Object, i0> lVarG = lVarD != null ? lVarD.g() : null;
        c3.l lVarE = companion.e(lVarD);
        try {
            k6 k6VarN = s3Var.n();
            if (k6VarN == null) {
                return;
            }
            b1 inputSession = s3Var.getInputSession();
            if (inputSession == null) {
                return;
            }
            b0 b0VarM = s3Var.m();
            if (b0VarM == null) {
                return;
            }
            s4.INSTANCE.g(textFieldValue, s3Var.getTextDelegate(), k6VarN.getValue(), b0VarM, inputSession, s3Var.h(), i0Var);
            i0 i0Var2 = i0.f148189a;
        } finally {
            companion.l(lVarD, lVarE, lVarG);
        }
    }

    private static final m g0(m mVar, s3 s3Var, c2 c2Var) {
        return y3.f.b(mVar, new h(s3Var, c2Var));
    }

    public static final void h0(s3 s3Var, d0 d0Var, boolean z15) {
        r2 keyboardController;
        if (!s3Var.h()) {
            d0.f(d0Var, 0, 1, null);
        } else {
            if (!z15 || (keyboardController = s3Var.getKeyboardController()) == null) {
                return;
            }
            keyboardController.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i0(v0 v0Var, s3 s3Var, TextFieldValue textFieldValue, ImeOptions imeOptions, v4.i0 i0Var) {
        s3Var.N(s4.INSTANCE.k(v0Var, textFieldValue, s3Var.getProcessor(), imeOptions, s3Var.r(), s3Var.p()));
        f0(s3Var, textFieldValue, i0Var);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0126  */
    /* JADX WARN: Code duplicated, block: B:104:0x012e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0137  */
    /* JADX WARN: Code duplicated, block: B:107:0x013b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0145  */
    /* JADX WARN: Code duplicated, block: B:110:0x0148  */
    /* JADX WARN: Code duplicated, block: B:112:0x014d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0157  */
    /* JADX WARN: Code duplicated, block: B:117:0x015b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0166 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x016f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0178  */
    /* JADX WARN: Code duplicated, block: B:128:0x017b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0181  */
    /* JADX WARN: Code duplicated, block: B:132:0x0189  */
    /* JADX WARN: Code duplicated, block: B:133:0x018c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0193  */
    /* JADX WARN: Code duplicated, block: B:138:0x019d  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:148:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:151:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:155:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:163:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:164:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:168:0x0200  */
    /* JADX WARN: Code duplicated, block: B:169:0x0205  */
    /* JADX WARN: Code duplicated, block: B:171:0x020b  */
    /* JADX WARN: Code duplicated, block: B:173:0x0211  */
    /* JADX WARN: Code duplicated, block: B:174:0x0214  */
    /* JADX WARN: Code duplicated, block: B:178:0x0224  */
    /* JADX WARN: Code duplicated, block: B:182:0x0231  */
    /* JADX WARN: Code duplicated, block: B:185:0x023a  */
    /* JADX WARN: Code duplicated, block: B:187:0x0242  */
    /* JADX WARN: Code duplicated, block: B:194:0x026c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:195:0x026e  */
    /* JADX WARN: Code duplicated, block: B:197:0x0273  */
    /* JADX WARN: Code duplicated, block: B:198:0x027a  */
    /* JADX WARN: Code duplicated, block: B:200:0x027d  */
    /* JADX WARN: Code duplicated, block: B:202:0x0286  */
    /* JADX WARN: Code duplicated, block: B:204:0x0292  */
    /* JADX WARN: Code duplicated, block: B:207:0x029f  */
    /* JADX WARN: Code duplicated, block: B:209:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:211:0x02af  */
    /* JADX WARN: Code duplicated, block: B:212:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:214:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:215:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:217:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:218:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:221:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:222:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:224:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:225:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:227:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:228:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:230:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:231:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:233:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:234:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:236:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:238:0x0308  */
    /* JADX WARN: Code duplicated, block: B:241:0x031b  */
    /* JADX WARN: Code duplicated, block: B:244:0x0331  */
    /* JADX WARN: Code duplicated, block: B:247:0x0347  */
    /* JADX WARN: Code duplicated, block: B:250:0x035c  */
    /* JADX WARN: Code duplicated, block: B:253:0x03b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:257:0x03be  */
    /* JADX WARN: Code duplicated, block: B:259:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:261:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:263:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:265:0x0405  */
    /* JADX WARN: Code duplicated, block: B:268:0x041e  */
    /* JADX WARN: Code duplicated, block: B:270:0x042e  */
    /* JADX WARN: Code duplicated, block: B:271:0x0431  */
    /* JADX WARN: Code duplicated, block: B:274:0x043e  */
    /* JADX WARN: Code duplicated, block: B:276:0x0443  */
    /* JADX WARN: Code duplicated, block: B:277:0x0445  */
    /* JADX WARN: Code duplicated, block: B:280:0x044f  */
    /* JADX WARN: Code duplicated, block: B:281:0x0451  */
    /* JADX WARN: Code duplicated, block: B:284:0x0459  */
    /* JADX WARN: Code duplicated, block: B:288:0x0463  */
    /* JADX WARN: Code duplicated, block: B:290:0x0471  */
    /* JADX WARN: Code duplicated, block: B:293:0x0480  */
    /* JADX WARN: Code duplicated, block: B:294:0x0482  */
    /* JADX WARN: Code duplicated, block: B:299:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:303:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:306:0x051e  */
    /* JADX WARN: Code duplicated, block: B:307:0x052c  */
    /* JADX WARN: Code duplicated, block: B:310:0x054d  */
    /* JADX WARN: Code duplicated, block: B:313:0x0564  */
    /* JADX WARN: Code duplicated, block: B:316:0x0579  */
    /* JADX WARN: Code duplicated, block: B:319:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:320:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:323:0x0614  */
    /* JADX WARN: Code duplicated, block: B:324:0x0616  */
    /* JADX WARN: Code duplicated, block: B:327:0x0623  */
    /* JADX WARN: Code duplicated, block: B:328:0x0625  */
    /* JADX WARN: Code duplicated, block: B:331:0x0630  */
    /* JADX WARN: Code duplicated, block: B:332:0x0632  */
    /* JADX WARN: Code duplicated, block: B:335:0x063e  */
    /* JADX WARN: Code duplicated, block: B:339:0x0648  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:341:0x064e A[PHI: r52
      0x064e: PHI (r52v12 v4.v0) = (r52v4 v4.v0), (r52v13 v4.v0) binds: [B:340:0x064c, B:338:0x0645] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:342:0x0650  */
    /* JADX WARN: Code duplicated, block: B:345:0x066d  */
    /* JADX WARN: Code duplicated, block: B:349:0x0680  */
    /* JADX WARN: Code duplicated, block: B:352:0x06b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:355:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:358:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:362:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:364:0x06fb A[PHI: r54
      0x06fb: PHI (r54v12 v4.u) = (r54v4 v4.u), (r54v13 v4.u) binds: [B:363:0x06f9, B:361:0x06f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:365:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:368:0x0706  */
    /* JADX WARN: Code duplicated, block: B:372:0x0712  */
    /* JADX WARN: Code duplicated, block: B:375:0x077b  */
    /* JADX WARN: Code duplicated, block: B:376:0x077d  */
    /* JADX WARN: Code duplicated, block: B:379:0x0793  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:380:0x0795  */
    /* JADX WARN: Code duplicated, block: B:383:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:385:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:388:0x07f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:395:0x0809  */
    /* JADX WARN: Code duplicated, block: B:398:0x082a  */
    /* JADX WARN: Code duplicated, block: B:400:0x0830  */
    /* JADX WARN: Code duplicated, block: B:403:0x084a  */
    /* JADX WARN: Code duplicated, block: B:404:0x084c  */
    /* JADX WARN: Code duplicated, block: B:407:0x0852  */
    /* JADX WARN: Code duplicated, block: B:409:0x0858  */
    /* JADX WARN: Code duplicated, block: B:415:0x0866  */
    /* JADX WARN: Code duplicated, block: B:417:0x086c  */
    /* JADX WARN: Code duplicated, block: B:420:0x0886  */
    /* JADX WARN: Code duplicated, block: B:421:0x0888  */
    /* JADX WARN: Code duplicated, block: B:424:0x08b9  */
    /* JADX WARN: Code duplicated, block: B:427:0x08c9  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:430:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:432:0x08ec  */
    /* JADX WARN: Code duplicated, block: B:435:0x092d  */
    /* JADX WARN: Code duplicated, block: B:437:0x0933  */
    /* JADX WARN: Code duplicated, block: B:440:0x0987  */
    /* JADX WARN: Code duplicated, block: B:447:0x099c  */
    /* JADX WARN: Code duplicated, block: B:449:0x09a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:451:0x09a6  */
    /* JADX WARN: Code duplicated, block: B:454:0x09ee  */
    /* JADX WARN: Code duplicated, block: B:456:0x0a0f  */
    /* JADX WARN: Code duplicated, block: B:459:0x0a31  */
    /* JADX WARN: Code duplicated, block: B:461:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:88:0x0101  */
    /* JADX WARN: Code duplicated, block: B:89:0x0104  */
    /* JADX WARN: Code duplicated, block: B:93:0x010e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0115  */
    /* JADX WARN: Code duplicated, block: B:97:0x0119  */
    /* JADX WARN: Code duplicated, block: B:99:0x0123  */
    public static final void w(final TextFieldValue textFieldValue, final l<? super TextFieldValue, i0> lVar, m mVar, TextStyle textStyle, e1 e1Var, l<? super TextLayoutResult, i0> lVar2, b1.l lVar3, androidx.compose.ui.graphics.c cVar, boolean z15, int i15, int i16, ImeOptions imeOptions, l3 l3Var, boolean z16, boolean z17, q<? super p<? super r, ? super Integer, i0>, ? super r, ? super Integer, i0> qVar, a6 a6Var, r rVar, final int i17, final int i18, final int i19) {
        int i25;
        m mVar2;
        int i26;
        TextStyle textStyle2;
        int i27;
        int i28;
        int i29;
        e1 e1VarC;
        int i35;
        int i36;
        l<? super TextLayoutResult, i0> lVar4;
        int i37;
        int i38;
        final b1.l lVar5;
        int i39;
        int i45;
        final androidx.compose.ui.graphics.c solidColor;
        int i46;
        int i47;
        int i48;
        int i49;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        int i65;
        int i66;
        int i67;
        int i68;
        int i69;
        int i75;
        int i76;
        int i77;
        int i78;
        int i79;
        int i85;
        int i86;
        int i87;
        boolean z18;
        final boolean z19;
        final ImeOptions imeOptions2;
        final l3 l3Var2;
        final q<? super p<? super r, ? super Integer, i0>, ? super r, ? super Integer, i0> qVar2;
        final a6 a6Var2;
        r rVar2;
        final TextStyle textStyle3;
        final l<? super TextLayoutResult, i0> lVar6;
        final e1 e1Var2;
        final m mVar3;
        final int i88;
        final int i89;
        final boolean z25;
        final boolean z26;
        d5 d5VarM;
        TextStyle textStyleA;
        boolean z27;
        int i95;
        int i96;
        ImeOptions imeOptionsA;
        l3 l3VarA;
        boolean z28;
        boolean z29;
        q<? super p<? super r, ? super Integer, i0>, ? super r, ? super Integer, i0> qVarB;
        a6 a6Var3;
        final l<? super TextLayoutResult, i0> lVar7;
        ImeOptions imeOptions3;
        boolean z35;
        m mVar4;
        boolean z36;
        final boolean z37;
        Object objE;
        final boolean z38;
        Object objE2;
        r.Companion companion;
        d0 d0Var;
        Object objE3;
        int i97;
        final k1 k1Var;
        Object objE4;
        androidx.compose.ui.graphics.c cVar2;
        v0 v0Var;
        final c5.d dVar;
        u4.l.b bVar;
        long selectionBackgroundColor;
        o oVar;
        final n3 n3Var;
        final TextStyle textStyle4;
        r2 r2Var;
        final int i98;
        final p143z0.a2 a2Var;
        a6 a6Var4;
        int i99;
        boolean z39;
        boolean z45;
        boolean z46;
        Object objE5;
        TransformedText transformedTextC;
        z3 composition;
        a6 a6Var5;
        TransformedText transformedTextC2;
        q4.e text;
        v4.i0 offsetMapping;
        d4 d4VarC;
        boolean zW;
        Object objE6;
        final s3 s3Var;
        Object objE7;
        i7 i7Var;
        Object objE8;
        final p0 p0Var;
        Object objE9;
        final j1.a aVar;
        Object objE10;
        final c2 c2Var;
        m.Companion companion2;
        int i100;
        int i101;
        boolean z47;
        boolean z48;
        boolean z49;
        int i102;
        final v0 v0Var2;
        boolean z55;
        boolean zG;
        Object objE11;
        final v4.i0 i0Var;
        boolean z56;
        TextFieldValue textFieldValue2;
        ImeOptions imeOptions4;
        c2 c2Var2;
        p0 p0Var2;
        j1.a aVar2;
        boolean z57;
        final boolean z58;
        f6 f6VarP;
        ImeOptions imeOptions5;
        boolean z59;
        boolean z65;
        Object objE12;
        ImeOptions imeOptions6;
        final ImeOptions imeOptions7;
        final c2 c2Var3;
        final v4.i0 i0Var2;
        boolean z66;
        boolean z67;
        boolean zG2;
        Object objE13;
        boolean z68;
        boolean zG3;
        Object objE14;
        boolean z69;
        boolean z75;
        Object objE15;
        final int i103;
        boolean z76;
        int keyboardType;
        a0.Companion companion3;
        final boolean z77;
        boolean zA;
        Object objE16;
        final androidx.compose.ui.graphics.c cVarE;
        boolean zG4;
        Object objE17;
        final boolean z78;
        m mVarZ;
        String str;
        boolean zC;
        Object objE18;
        r rVarH = rVar.h(31062401);
        if ((i17 & 6) == 0) {
            i25 = (rVarH.W(textFieldValue) ? 4 : 2) | i17;
        } else {
            i25 = i17;
        }
        if ((i17 & 48) == 0) {
            i25 |= rVarH.G(lVar) ? 32 : 16;
        }
        int i104 = i19 & 4;
        if (i104 == 0) {
            if ((i17 & MLKEMEngine.KyberPolyBytes) == 0) {
                mVar2 = mVar;
                i25 |= rVarH.W(mVar2) ? 256 : 128;
            }
            i26 = i19 & 8;
            if (i26 != 0) {
                if ((i17 & 3072) == 0) {
                    textStyle2 = textStyle;
                    if (rVarH.W(textStyle2)) {
                        i27 = 2048;
                    } else {
                        i27 = 1024;
                    }
                    i25 |= i27;
                }
                i28 = i19 & 16;
                i29 = PKIFailureInfo.certRevoked;
                if (i28 != 0) {
                    if ((i17 & 24576) == 0) {
                        e1VarC = e1Var;
                        if (rVarH.W(e1VarC)) {
                            i35 = 16384;
                        } else {
                            i35 = 8192;
                        }
                        i25 |= i35;
                    }
                    i36 = i19 & 32;
                    if (i36 != 0) {
                        i25 |= 196608;
                        lVar4 = lVar2;
                    } else {
                        lVar4 = lVar2;
                        if ((i17 & 196608) == 0) {
                            if (rVarH.G(lVar4)) {
                                i37 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i37 = 65536;
                            }
                            i25 |= i37;
                        }
                    }
                    i38 = i19 & 64;
                    if (i38 != 0) {
                        i25 |= 1572864;
                        lVar5 = lVar3;
                    } else {
                        lVar5 = lVar3;
                        if ((i17 & 1572864) == 0) {
                            if (rVarH.W(lVar5)) {
                                i39 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i39 = PKIFailureInfo.signerNotTrusted;
                            }
                            i25 |= i39;
                        }
                    }
                    i45 = i19 & 128;
                    if (i45 != 0) {
                        i25 |= 12582912;
                        solidColor = cVar;
                    } else {
                        solidColor = cVar;
                        if ((i17 & 12582912) == 0) {
                            if (rVarH.W(solidColor)) {
                                i46 = 8388608;
                            } else {
                                i46 = 4194304;
                            }
                            i25 |= i46;
                        }
                    }
                    i47 = i19 & 256;
                    if (i47 != 0) {
                        i25 |= 100663296;
                    } else if ((i17 & 100663296) == 0) {
                        if (rVarH.a(z15)) {
                            i48 = 67108864;
                        } else {
                            i48 = 33554432;
                        }
                        i25 |= i48;
                    }
                    i49 = i19 & 512;
                    if (i49 != 0) {
                        if ((i17 & 805306368) == 0) {
                            if (rVarH.c(i15)) {
                                i55 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i55 = 268435456;
                            }
                            i25 |= i55;
                        }
                        i56 = i19 & 1024;
                        if (i56 != 0) {
                            i57 = i18 | 6;
                        } else if ((i18 & 6) == 0) {
                            if (rVarH.c(i16)) {
                                i58 = 4;
                            } else {
                                i58 = 2;
                            }
                            i57 = i18 | i58;
                        } else {
                            i57 = i18;
                        }
                        if ((i18 & 48) != 0) {
                            i57 |= ((i19 & 2048) == 0 || !rVarH.W(imeOptions)) ? 16 : 32;
                        }
                        i59 = i57;
                        i65 = i19 & PKIFailureInfo.certConfirmed;
                        if (i65 != 0) {
                            i66 = i59 | MLKEMEngine.KyberPolyBytes;
                        } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                            if (rVarH.W(l3Var)) {
                                i67 = 256;
                            } else {
                                i67 = 128;
                            }
                            i66 = i59 | i67;
                        } else {
                            i66 = i59;
                        }
                        i68 = i19 & PKIFailureInfo.certRevoked;
                        if (i68 != 0) {
                            i75 = i66 | 3072;
                        } else {
                            i69 = i66;
                            if ((i18 & 3072) == 0) {
                                i75 = i69 | (rVarH.a(z16) ? 2048 : 1024);
                            } else {
                                i75 = i69;
                            }
                        }
                        i76 = i19 & 16384;
                        if (i76 != 0) {
                            i78 = i75 | 24576;
                        } else {
                            i77 = i75;
                            if ((i18 & 24576) == 0) {
                                if (rVarH.a(z17)) {
                                    i29 = 16384;
                                }
                                i78 = i77 | i29;
                            } else {
                                i78 = i77;
                            }
                        }
                        i79 = i19 & 32768;
                        if (i79 != 0) {
                            i78 |= 196608;
                        } else if ((i18 & 196608) == 0) {
                            if (rVarH.G(qVar)) {
                                i85 = PKIFailureInfo.unsupportedVersion;
                            } else {
                                i85 = 65536;
                            }
                            i78 |= i85;
                        }
                        i86 = i19 & PKIFailureInfo.notAuthorized;
                        if (i86 != 0) {
                            i78 |= 1572864;
                        } else if ((i18 & 1572864) == 0) {
                            if (rVarH.W(a6Var)) {
                                i87 = PKIFailureInfo.badCertTemplate;
                            } else {
                                i87 = PKIFailureInfo.signerNotTrusted;
                            }
                            i78 |= i87;
                        }
                        if ((i25 & 306783379) == 306783378 || (i78 & 599187) != 599186) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (rVarH.r(z18, i25 & 1)) {
                            rVarH.I();
                            if ((i17 & 1) != 0 || rVarH.Q()) {
                                if (i104 != 0) {
                                    mVar2 = m.INSTANCE;
                                }
                                if (i26 != 0) {
                                    textStyleA = TextStyle.INSTANCE.a();
                                } else {
                                    textStyleA = textStyle2;
                                }
                                if (i28 != 0) {
                                    e1VarC = e1.INSTANCE.c();
                                }
                                if (i36 != 0) {
                                    objE = rVarH.E();
                                    if (objE == r.INSTANCE.a()) {
                                        objE = new l() { // from class: n1.g2
                                            @Override // er.l
                                            public final Object b(Object obj) {
                                                return j2.x((TextLayoutResult) obj);
                                            }
                                        };
                                        rVarH.v(objE);
                                    }
                                    lVar4 = (l) objE;
                                }
                                if (i38 != 0) {
                                    lVar5 = null;
                                }
                                if (i45 != 0) {
                                    solidColor = new SolidColor(Color.INSTANCE.h(), null);
                                }
                                if (i47 != 0) {
                                    z27 = true;
                                } else {
                                    z27 = z15;
                                }
                                if (i49 != 0) {
                                    i95 = Integer.MAX_VALUE;
                                } else {
                                    i95 = i15;
                                }
                                if (i56 != 0) {
                                    i96 = 1;
                                } else {
                                    i96 = i16;
                                }
                                if ((i19 & 2048) != 0) {
                                    imeOptionsA = ImeOptions.INSTANCE.a();
                                    i78 &= -113;
                                } else {
                                    imeOptionsA = imeOptions;
                                }
                                if (i65 != 0) {
                                    l3VarA = l3.INSTANCE.a();
                                } else {
                                    l3VarA = l3Var;
                                }
                                if (i68 != 0) {
                                    z28 = true;
                                } else {
                                    z28 = z16;
                                }
                                if (i76 != 0) {
                                    z29 = false;
                                } else {
                                    z29 = z17;
                                }
                                if (i79 != 0) {
                                    qVarB = g1.f130036a.b();
                                } else {
                                    qVarB = qVar;
                                }
                                if (i86 != 0) {
                                    a6Var3 = null;
                                } else {
                                    a6Var3 = a6Var;
                                }
                                lVar7 = lVar4;
                                imeOptions3 = imeOptionsA;
                                z35 = z27;
                                textStyle2 = textStyleA;
                                mVar4 = mVar2;
                                z36 = z28;
                                z37 = z29;
                            } else {
                                rVarH.O();
                                if ((i19 & 2048) != 0) {
                                    i78 &= -113;
                                }
                                z35 = z15;
                                i95 = i15;
                                i96 = i16;
                                z37 = z17;
                                qVarB = qVar;
                                a6Var3 = a6Var;
                                lVar7 = lVar4;
                                e1VarC = e1VarC;
                                mVar4 = mVar2;
                                i78 = i78;
                                imeOptions3 = imeOptions;
                                l3VarA = l3Var;
                                z36 = z16;
                            }
                            rVarH.y();
                            z38 = z35;
                            if (p076m2.t.k()) {
                                p076m2.t.o(31062401, i25, i78, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                            }
                            objE2 = rVarH.E();
                            companion = r.INSTANCE;
                            if (objE2 == companion.a()) {
                                objE2 = new d0();
                                rVarH.v(objE2);
                            }
                            d0Var = (d0) objE2;
                            objE3 = rVarH.E();
                            i97 = i25;
                            if (objE3 == companion.a()) {
                                objE3 = l1.b();
                                rVarH.v(objE3);
                            }
                            k1Var = (k1) objE3;
                            objE4 = rVarH.E();
                            cVar2 = solidColor;
                            if (objE4 == companion.a()) {
                                objE4 = new v0(k1Var);
                                rVarH.v(objE4);
                            }
                            v0Var = (v0) objE4;
                            dVar = (c5.d) rVarH.N(g1.f());
                            bVar = (u4.l.b) rVarH.N(g1.h());
                            selectionBackgroundColor = ((SelectionColors) rVarH.N(g3.c())).getSelectionBackgroundColor();
                            oVar = (o) rVarH.N(g1.g());
                            n3Var = (n3) rVarH.N(g1.v());
                            textStyle4 = textStyle2;
                            r2Var = (r2) rVarH.N(g1.r());
                            i98 = i96;
                            if (i95 == 1 || z38 || !imeOptions3.getSingleLine()) {
                                a2Var = p143z0.a2.Vertical;
                            } else {
                                a2Var = p143z0.a2.Horizontal;
                            }
                            if (a6Var3 == null) {
                                rVarH.X(-213744626);
                                Object[] objArr = {a2Var};
                                b3.x<a6, Object> xVarA = a6.INSTANCE.a();
                                zC = rVarH.c(a2Var.ordinal());
                                objE18 = rVarH.E();
                                if (zC || objE18 == companion.a()) {
                                    objE18 = new er.a() { // from class: n1.q1
                                        @Override // er.a
                                        public final Object a() {
                                            return j2.O(a2Var);
                                        }
                                    };
                                    rVarH.v(objE18);
                                }
                                a6Var4 = (a6) b3.f.i(objArr, xVarA, (er.a) objE18, rVarH, 0);
                                rVarH.R();
                            } else {
                                rVarH.X(-213745742);
                                rVarH.R();
                                a6Var4 = a6Var3;
                            }
                            if (a6Var4.j() != a2Var) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("Mismatching scroller orientation; ");
                                if (a2Var == p143z0.a2.Vertical) {
                                    str = "only single-line, non-wrap text fields can scroll horizontally";
                                } else {
                                    str = "single-line, non-wrap text fields can only scroll horizontally";
                                }
                                sb5.append(str);
                                throw new IllegalArgumentException(sb5.toString());
                            }
                            i99 = i97 & 14;
                            if (i99 == 4) {
                                z39 = true;
                            } else {
                                z39 = false;
                            }
                            if ((i97 & 57344) == 16384) {
                                z45 = true;
                            } else {
                                z45 = false;
                            }
                            z46 = z39 | z45;
                            objE5 = rVarH.E();
                            if (!z46 || objE5 == companion.a()) {
                                transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                                composition = textFieldValue.getComposition();
                                if (composition != null) {
                                    a6Var5 = a6Var4;
                                    transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                    if (transformedTextC2 != null) {
                                        objE5 = transformedTextC2;
                                    }
                                    rVarH.v(objE5);
                                } else {
                                    a6Var5 = a6Var4;
                                }
                                objE5 = transformedTextC;
                                rVarH.v(objE5);
                            } else {
                                a6Var5 = a6Var4;
                            }
                            TransformedText transformedText = (TransformedText) objE5;
                            text = transformedText.getText();
                            offsetMapping = transformedText.getOffsetMapping();
                            d4VarC = p076m2.m.c(rVarH, 0);
                            zW = rVarH.W(r2Var);
                            objE6 = rVarH.E();
                            if (zW || objE6 == companion.a()) {
                                objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                                rVarH.v(objE6);
                            }
                            s3Var = (s3) objE6;
                            s3Var.X(textFieldValue.getText(), text, textStyle4, z38, r55, bVar, lVar, l3VarA, oVar, selectionBackgroundColor);
                            s3Var.getProcessor().e(textFieldValue, s3Var.getInputSession());
                            objE7 = rVarH.E();
                            if (objE7 == companion.a()) {
                                objE7 = new i7(0, 1, null);
                                rVarH.v(objE7);
                            }
                            i7Var = (i7) objE7;
                            i7.f(i7Var, textFieldValue, 0L, 2, null);
                            objE8 = rVarH.E();
                            if (objE8 == companion.a()) {
                                objE8 = Function0.i(tq.j.f191408a, rVarH);
                                rVarH.v(objE8);
                            }
                            p0Var = (p0) objE8;
                            objE9 = rVarH.E();
                            if (objE9 == companion.a()) {
                                objE9 = j1.e.a();
                                rVarH.v(objE9);
                            }
                            aVar = (j1.a) objE9;
                            objE10 = rVarH.E();
                            b1.l lVar8 = lVar5;
                            if (objE10 == companion.a()) {
                                objE10 = new c2(i7Var);
                                rVarH.v(objE10);
                            }
                            c2Var = (c2) objE10;
                            c2Var.L0(offsetMapping);
                            c2Var.U0(e1VarC);
                            c2Var.M0(s3Var.r());
                            c2Var.Q0(s3Var);
                            c2Var.T0(textFieldValue);
                            c2Var.z0((androidx.compose.ui.platform.b1) rVarH.N(g1.d()));
                            c2Var.A0(p0Var);
                            c2Var.R0((v2) rVarH.N(g1.s()));
                            c2Var.I0((v3.a) rVarH.N(g1.j()));
                            c2Var.G0(d0Var);
                            c2Var.E0(!z37);
                            c2Var.F0(z36);
                            if (g0.isSmartSelectionEnabled) {
                                rVarH.X(1966756105);
                                c2Var.N0(f0.h(z1.i0.EditableText, textStyle4.w(), rVarH, 6));
                                rVarH.R();
                            } else {
                                rVarH.X(1966902177);
                                rVarH.R();
                            }
                            s3Var.h();
                            new l() { // from class: n1.r1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.y(c2Var, (q4.e) obj);
                                }
                            };
                            new er.a() { // from class: n1.s1
                                @Override // er.a
                                public final Object a() {
                                    return j2.z(c2Var);
                                }
                            };
                            new er.a() { // from class: n1.t1
                                @Override // er.a
                                public final Object a() {
                                    return j2.A(c2Var);
                                }
                            };
                            companion2 = m.INSTANCE;
                            boolean zG5 = rVarH.G(s3Var);
                            i100 = i78 & 7168;
                            i101 = i78;
                            if (i100 == 2048) {
                                z47 = true;
                            } else {
                                z47 = false;
                            }
                            boolean z79 = z47 | zG5;
                            if ((i101 & 57344) == 16384) {
                                z48 = true;
                            } else {
                                z48 = false;
                            }
                            boolean zG6 = z79 | z48 | rVarH.G(v0Var);
                            if (i99 == 4) {
                                z49 = true;
                            } else {
                                z49 = false;
                            }
                            boolean z85 = zG6 | z49;
                            i102 = (i101 & 112) ^ 48;
                            if (i102 > 32 || !rVarH.W(imeOptions3)) {
                                v0Var2 = v0Var;
                                if ((i101 & 48) != 32) {
                                    z55 = false;
                                }
                                zG = z85 | z55 | rVarH.G(offsetMapping) | rVarH.G(p0Var) | rVarH.G(aVar) | rVarH.G(c2Var);
                                objE11 = rVarH.E();
                                if (!zG || objE11 == companion.a()) {
                                    final ImeOptions imeOptions8 = imeOptions3;
                                    i0Var = offsetMapping;
                                    final boolean z86 = z36;
                                    final boolean z87 = z37;
                                    objE11 = new l() { // from class: n1.u1
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return j2.B(s3Var, z86, z87, v0Var2, textFieldValue, imeOptions8, i0Var, c2Var, p0Var, aVar, (l0) obj);
                                        }
                                    };
                                    z56 = z86;
                                    textFieldValue2 = textFieldValue;
                                    imeOptions4 = imeOptions8;
                                    c2Var2 = c2Var;
                                    p0Var2 = p0Var;
                                    aVar2 = aVar;
                                    rVarH.v(objE11);
                                } else {
                                    i0Var = offsetMapping;
                                    z56 = z36;
                                    c2Var2 = c2Var;
                                    aVar2 = aVar;
                                    textFieldValue2 = textFieldValue;
                                    p0Var2 = p0Var;
                                    imeOptions4 = imeOptions3;
                                }
                                final j1.a aVar3 = aVar2;
                                m mVarA = v4.a(companion2, z56, d0Var, lVar8, (l) objE11);
                                if (z56 || z37) {
                                    z57 = false;
                                } else {
                                    z57 = true;
                                }
                                Boolean boolValueOf = Boolean.valueOf(z57);
                                z58 = z56;
                                f6VarP = x5.p(boolValueOf, rVarH, 0);
                                i0 i0Var3 = i0.f148189a;
                                boolean zW2 = rVarH.W(f6VarP) | rVarH.G(s3Var) | rVarH.G(v0Var2) | rVarH.G(c2Var2);
                                if (i102 > 32 || !rVarH.W(imeOptions4)) {
                                    imeOptions5 = imeOptions4;
                                    if ((i101 & 48) != 32) {
                                        z59 = false;
                                    }
                                    z65 = zW2 | z59;
                                    objE12 = rVarH.E();
                                    if (!z65 || objE12 == companion.a()) {
                                        ImeOptions imeOptions9 = imeOptions5;
                                        objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions9, null);
                                        imeOptions6 = imeOptions9;
                                        rVarH.v(objE12);
                                    } else {
                                        imeOptions6 = imeOptions5;
                                    }
                                    imeOptions7 = imeOptions6;
                                    Function0.d(i0Var3, (p) objE12, rVarH, 6);
                                    int i105 = i101 >> 3;
                                    c2Var3 = c2Var2;
                                    m mVarA2 = k5.a(companion2, c2Var3, z58, lVar8, s3Var, d0Var, z37, i0Var, rVarH, (i105 & 896) | 196614 | ((i97 >> 9) & 7168) | ((i101 << 6) & 3670016));
                                    i0Var2 = i0Var;
                                    final m mVarB = m2.b(companion2, s3Var, textFieldValue2, i0Var2);
                                    boolean zG7 = rVarH.G(s3Var);
                                    if (i100 == 2048) {
                                        z66 = true;
                                    } else {
                                        z66 = false;
                                    }
                                    boolean zW3 = zG7 | z66 | rVarH.W(n3Var) | rVarH.G(c2Var3);
                                    if (i99 == 4) {
                                        z67 = true;
                                    } else {
                                        z67 = false;
                                    }
                                    zG2 = zW3 | z67 | rVarH.G(i0Var2);
                                    objE13 = rVarH.E();
                                    if (zG2 || objE13 == companion.a()) {
                                        final TextFieldValue textFieldValue3 = textFieldValue2;
                                        objE13 = new l() { // from class: n1.v1
                                            @Override // er.l
                                            public final Object b(Object obj) {
                                                return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue3, i0Var2, (b0) obj);
                                            }
                                        };
                                        rVarH.v(objE13);
                                    }
                                    final m mVarA3 = p036e4.l1.a(companion2, (l) objE13);
                                    CoreTextFieldSemanticsModifier hVar = new CoreTextFieldSemanticsModifier(transformedText, textFieldValue, s3Var, z37, z58, e1VarC instanceof v4.k0, i0Var2, c2Var3, imeOptions7, d0Var);
                                    if (z58 || z37 || !n3Var.b() || s3Var.B()) {
                                        z68 = false;
                                    } else {
                                        z68 = true;
                                    }
                                    final m mVarA4 = m2.a(companion2, s3Var, textFieldValue, i0Var2, cVar2, z68);
                                    zG3 = rVarH.G(c2Var3);
                                    final e1 e1Var3 = e1VarC;
                                    objE14 = rVarH.E();
                                    if (zG3 || objE14 == companion.a()) {
                                        objE14 = new l() { // from class: n1.w1
                                            @Override // er.l
                                            public final Object b(Object obj) {
                                                return j2.E(c2Var3, (s0) obj);
                                            }
                                        };
                                        rVarH.v(objE14);
                                    }
                                    Function0.a(c2Var3, (l) objE14, rVarH, 0);
                                    boolean zG8 = rVarH.G(s3Var) | rVarH.G(v0Var2);
                                    if (i99 == 4) {
                                        z69 = true;
                                    } else {
                                        z69 = false;
                                    }
                                    z75 = z69 | zG8 | ((i102 <= 32 && rVarH.W(imeOptions7)) || (i101 & 48) == 32);
                                    objE15 = rVarH.E();
                                    if (z75 || objE15 == companion.a()) {
                                        objE15 = new l() { // from class: n1.y1
                                            @Override // er.l
                                            public final Object b(Object obj) {
                                                return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                                            }
                                        };
                                        rVarH.v(objE15);
                                    }
                                    Function0.a(imeOptions7, (l) objE15, rVarH, i105 & 14);
                                    l<TextFieldValue, i0> lVarR = s3Var.r();
                                    boolean z88 = !z37;
                                    i103 = i95;
                                    if (i103 == 1) {
                                        z76 = true;
                                    } else {
                                        z76 = false;
                                    }
                                    m mVarB2 = i5.b(companion2, s3Var, c2Var3, textFieldValue, lVarR, z88, z76, i0Var2, i7Var, imeOptions7.getImeAction());
                                    keyboardType = imeOptions7.getKeyboardType();
                                    companion3 = a0.INSTANCE;
                                    if (!a0.n(keyboardType, companion3.f()) || a0.n(imeOptions7.getKeyboardType(), companion3.e())) {
                                        z77 = false;
                                    } else {
                                        z77 = true;
                                    }
                                    boolean zC2 = C(f6VarP);
                                    zA = rVarH.a(z77) | rVarH.G(k1Var);
                                    objE16 = rVarH.E();
                                    if (zA || objE16 == companion.a()) {
                                        objE16 = new er.a() { // from class: n1.z1
                                            @Override // er.a
                                            public final Object a() {
                                                return j2.G(z77, k1Var);
                                            }
                                        };
                                        rVarH.v(objE16);
                                    }
                                    m mVarB3 = v1.b.b(companion2, zC2, z77, (er.a) objE16);
                                    cVarE = l.e((androidx.compose.ui.graphics.c) rVarH.N(l.c()), ((Color) rVarH.N(l.d())).m20unboximpl(), m.a());
                                    zG4 = rVarH.G(s3Var) | rVarH.W(cVarE);
                                    objE17 = rVarH.E();
                                    if (zG4 || objE17 == companion.a()) {
                                        objE17 = new l() { // from class: n1.h2
                                            @Override // er.l
                                            public final Object b(Object obj) {
                                                return j2.H(s3Var, cVarE, (c) obj);
                                            }
                                        };
                                        rVarH.v(objE17);
                                    }
                                    m mVarD = k3.k.d(companion2, (l) objE17);
                                    m mVar5 = mVar4;
                                    final a6 a6Var6 = a6Var5;
                                    m mVarA0 = a0(p036e4.l1.a(u5.f(g0(u4.b(h1.a(mVar5.u(mVarD), k1Var, s3Var, c2Var3).u(mVarB3).u(mVarA), s3Var, oVar), s3Var, c2Var3).u(mVarB2), a6Var6, lVar8, z58, x5.a(rVarH, 0)).u(mVarA2).u(hVar), new l() { // from class: n1.n1
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return j2.I(s3Var, (b0) obj);
                                        }
                                    }), c2Var3, p0Var2);
                                    if (!z58 && s3Var.h() && s3Var.C() && n3Var.b()) {
                                        z78 = true;
                                    } else {
                                        z78 = false;
                                    }
                                    if (z78) {
                                        mVarZ = c3.z(companion2, c2Var3);
                                    } else {
                                        mVarZ = companion2;
                                    }
                                    final m mVar6 = mVarZ;
                                    final q<? super p<? super r, ? super Integer, i0>, ? super r, ? super Integer, i0> qVar3 = qVarB;
                                    P(mVarA0, c2Var3, y2.m.d(-814563849, true, new p() { // from class: n1.o1
                                        @Override // er.p
                                        public final Object B(Object obj, Object obj2) {
                                            return j2.J(qVar3, s3Var, textStyle4, z38, i98, i103, a6Var6, textFieldValue, e1Var3, mVarA4, mVarB, mVarA3, mVar6, aVar3, c2Var3, z78, z37, lVar7, i0Var2, dVar, (r) obj, ((Integer) obj2).intValue());
                                        }
                                    }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes);
                                    if (p076m2.t.k()) {
                                        p076m2.t.n();
                                    }
                                    qVar2 = qVar3;
                                    i89 = i98;
                                    rVar2 = rVarH;
                                    e1Var2 = e1Var3;
                                    z26 = z37;
                                    lVar6 = lVar7;
                                    z25 = z58;
                                    a6Var2 = a6Var3;
                                    solidColor = cVar2;
                                    lVar5 = lVar8;
                                    l3Var2 = l3VarA;
                                    mVar3 = mVar5;
                                    i88 = i103;
                                    imeOptions2 = imeOptions7;
                                    z19 = z38;
                                    textStyle3 = textStyle4;
                                } else {
                                    imeOptions5 = imeOptions4;
                                }
                                z59 = true;
                                z65 = zW2 | z59;
                                objE12 = rVarH.E();
                                if (z65) {
                                    ImeOptions imeOptions10 = imeOptions5;
                                    objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions10, null);
                                    imeOptions6 = imeOptions10;
                                    rVarH.v(objE12);
                                } else {
                                    ImeOptions imeOptions11 = imeOptions5;
                                    objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions11, null);
                                    imeOptions6 = imeOptions11;
                                    rVarH.v(objE12);
                                }
                                imeOptions7 = imeOptions6;
                                Function0.d(i0Var3, (p) objE12, rVarH, 6);
                                int i106 = i101 >> 3;
                                c2Var3 = c2Var2;
                                m mVarA5 = k5.a(companion2, c2Var3, z58, lVar8, s3Var, d0Var, z37, i0Var, rVarH, (i106 & 896) | 196614 | ((i97 >> 9) & 7168) | ((i101 << 6) & 3670016));
                                i0Var2 = i0Var;
                                final m mVarB4 = m2.b(companion2, s3Var, textFieldValue2, i0Var2);
                                boolean zG9 = rVarH.G(s3Var);
                                if (i100 == 2048) {
                                    z66 = true;
                                } else {
                                    z66 = false;
                                }
                                boolean zW4 = zG9 | z66 | rVarH.W(n3Var) | rVarH.G(c2Var3);
                                if (i99 == 4) {
                                    z67 = true;
                                } else {
                                    z67 = false;
                                }
                                zG2 = zW4 | z67 | rVarH.G(i0Var2);
                                objE13 = rVarH.E();
                                if (zG2) {
                                    final TextFieldValue textFieldValue4 = textFieldValue2;
                                    objE13 = new l() { // from class: n1.v1
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue4, i0Var2, (b0) obj);
                                        }
                                    };
                                    rVarH.v(objE13);
                                } else {
                                    final TextFieldValue textFieldValue5 = textFieldValue2;
                                    objE13 = new l() { // from class: n1.v1
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue5, i0Var2, (b0) obj);
                                        }
                                    };
                                    rVarH.v(objE13);
                                }
                                final m mVarA6 = p036e4.l1.a(companion2, (l) objE13);
                                CoreTextFieldSemanticsModifier hVar2 = new CoreTextFieldSemanticsModifier(transformedText, textFieldValue, s3Var, z37, z58, e1VarC instanceof v4.k0, i0Var2, c2Var3, imeOptions7, d0Var);
                                if (z58) {
                                    z68 = false;
                                } else {
                                    z68 = false;
                                }
                                final m mVarA7 = m2.a(companion2, s3Var, textFieldValue, i0Var2, cVar2, z68);
                                zG3 = rVarH.G(c2Var3);
                                final e1 e1Var4 = e1VarC;
                                objE14 = rVarH.E();
                                if (zG3) {
                                    objE14 = new l() { // from class: n1.w1
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return j2.E(c2Var3, (s0) obj);
                                        }
                                    };
                                    rVarH.v(objE14);
                                } else {
                                    objE14 = new l() { // from class: n1.w1
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return j2.E(c2Var3, (s0) obj);
                                        }
                                    };
                                    rVarH.v(objE14);
                                }
                                Function0.a(c2Var3, (l) objE14, rVarH, 0);
                                boolean zG10 = rVarH.G(s3Var) | rVarH.G(v0Var2);
                                if (i99 == 4) {
                                    z69 = true;
                                } else {
                                    z69 = false;
                                }
                                z75 = z69 | zG10 | ((i102 <= 32 && rVarH.W(imeOptions7)) || (i101 & 48) == 32);
                                objE15 = rVarH.E();
                                if (z75) {
                                    objE15 = new l() { // from class: n1.y1
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                                        }
                                    };
                                    rVarH.v(objE15);
                                } else {
                                    objE15 = new l() { // from class: n1.y1
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                                        }
                                    };
                                    rVarH.v(objE15);
                                }
                                Function0.a(imeOptions7, (l) objE15, rVarH, i106 & 14);
                                l<TextFieldValue, i0> lVarR2 = s3Var.r();
                                boolean z89 = !z37;
                                i103 = i95;
                                if (i103 == 1) {
                                    z76 = true;
                                } else {
                                    z76 = false;
                                }
                                m mVarB5 = i5.b(companion2, s3Var, c2Var3, textFieldValue, lVarR2, z89, z76, i0Var2, i7Var, imeOptions7.getImeAction());
                                keyboardType = imeOptions7.getKeyboardType();
                                companion3 = a0.INSTANCE;
                                if (a0.n(keyboardType, companion3.f())) {
                                    z77 = false;
                                } else {
                                    z77 = false;
                                }
                                boolean zC3 = C(f6VarP);
                                zA = rVarH.a(z77) | rVarH.G(k1Var);
                                objE16 = rVarH.E();
                                if (zA) {
                                    objE16 = new er.a() { // from class: n1.z1
                                        @Override // er.a
                                        public final Object a() {
                                            return j2.G(z77, k1Var);
                                        }
                                    };
                                    rVarH.v(objE16);
                                } else {
                                    objE16 = new er.a() { // from class: n1.z1
                                        @Override // er.a
                                        public final Object a() {
                                            return j2.G(z77, k1Var);
                                        }
                                    };
                                    rVarH.v(objE16);
                                }
                                m mVarB6 = v1.b.b(companion2, zC3, z77, (er.a) objE16);
                                cVarE = l.e((androidx.compose.ui.graphics.c) rVarH.N(l.c()), ((Color) rVarH.N(l.d())).m20unboximpl(), m.a());
                                zG4 = rVarH.G(s3Var) | rVarH.W(cVarE);
                                objE17 = rVarH.E();
                                if (zG4) {
                                    objE17 = new l() { // from class: n1.h2
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return j2.H(s3Var, cVarE, (c) obj);
                                        }
                                    };
                                    rVarH.v(objE17);
                                } else {
                                    objE17 = new l() { // from class: n1.h2
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return j2.H(s3Var, cVarE, (c) obj);
                                        }
                                    };
                                    rVarH.v(objE17);
                                }
                                m mVarD2 = k3.k.d(companion2, (l) objE17);
                                m mVar7 = mVar4;
                                final a6 a6Var7 = a6Var5;
                                m mVarA1 = a0(p036e4.l1.a(u5.f(g0(u4.b(h1.a(mVar7.u(mVarD2), k1Var, s3Var, c2Var3).u(mVarB6).u(mVarA), s3Var, oVar), s3Var, c2Var3).u(mVarB5), a6Var7, lVar8, z58, x5.a(rVarH, 0)).u(mVarA5).u(hVar2), new l() { // from class: n1.n1
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j2.I(s3Var, (b0) obj);
                                    }
                                }), c2Var3, p0Var2);
                                if (!z58) {
                                    z78 = false;
                                } else {
                                    z78 = false;
                                }
                                if (z78) {
                                    mVarZ = c3.z(companion2, c2Var3);
                                } else {
                                    mVarZ = companion2;
                                }
                                final m mVar8 = mVarZ;
                                final q qVar4 = qVarB;
                                P(mVarA1, c2Var3, y2.m.d(-814563849, true, new p() { // from class: n1.o1
                                    @Override // er.p
                                    public final Object B(Object obj, Object obj2) {
                                        return j2.J(qVar4, s3Var, textStyle4, z38, i98, i103, a6Var7, textFieldValue, e1Var4, mVarA7, mVarB4, mVarA6, mVar8, aVar3, c2Var3, z78, z37, lVar7, i0Var2, dVar, (r) obj, ((Integer) obj2).intValue());
                                    }
                                }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes);
                                if (p076m2.t.k()) {
                                    p076m2.t.n();
                                }
                                qVar2 = qVar4;
                                i89 = i98;
                                rVar2 = rVarH;
                                e1Var2 = e1Var4;
                                z26 = z37;
                                lVar6 = lVar7;
                                z25 = z58;
                                a6Var2 = a6Var3;
                                solidColor = cVar2;
                                lVar5 = lVar8;
                                l3Var2 = l3VarA;
                                mVar3 = mVar7;
                                i88 = i103;
                                imeOptions2 = imeOptions7;
                                z19 = z38;
                                textStyle3 = textStyle4;
                            } else {
                                v0Var2 = v0Var;
                            }
                            z55 = true;
                            zG = z85 | z55 | rVarH.G(offsetMapping) | rVarH.G(p0Var) | rVarH.G(aVar) | rVarH.G(c2Var);
                            objE11 = rVarH.E();
                            if (zG) {
                                final ImeOptions imeOptions12 = imeOptions3;
                                i0Var = offsetMapping;
                                final boolean z810 = z36;
                                final boolean z811 = z37;
                                objE11 = new l() { // from class: n1.u1
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j2.B(s3Var, z810, z811, v0Var2, textFieldValue, imeOptions12, i0Var, c2Var, p0Var, aVar, (l0) obj);
                                    }
                                };
                                z56 = z810;
                                textFieldValue2 = textFieldValue;
                                imeOptions4 = imeOptions12;
                                c2Var2 = c2Var;
                                p0Var2 = p0Var;
                                aVar2 = aVar;
                                rVarH.v(objE11);
                            } else {
                                final ImeOptions imeOptions13 = imeOptions3;
                                i0Var = offsetMapping;
                                final boolean z812 = z36;
                                final boolean z813 = z37;
                                objE11 = new l() { // from class: n1.u1
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j2.B(s3Var, z812, z813, v0Var2, textFieldValue, imeOptions13, i0Var, c2Var, p0Var, aVar, (l0) obj);
                                    }
                                };
                                z56 = z812;
                                textFieldValue2 = textFieldValue;
                                imeOptions4 = imeOptions13;
                                c2Var2 = c2Var;
                                p0Var2 = p0Var;
                                aVar2 = aVar;
                                rVarH.v(objE11);
                            }
                            final j1.a aVar4 = aVar2;
                            m mVarA8 = v4.a(companion2, z56, d0Var, lVar8, (l) objE11);
                            if (z56) {
                                z57 = false;
                            } else {
                                z57 = false;
                            }
                            Boolean boolValueOf2 = Boolean.valueOf(z57);
                            z58 = z56;
                            f6VarP = x5.p(boolValueOf2, rVarH, 0);
                            i0 i0Var4 = i0.f148189a;
                            boolean zW5 = rVarH.W(f6VarP) | rVarH.G(s3Var) | rVarH.G(v0Var2) | rVarH.G(c2Var2);
                            if (i102 > 32) {
                                imeOptions5 = imeOptions4;
                                if ((i101 & 48) != 32) {
                                    z59 = true;
                                } else {
                                    z59 = false;
                                }
                            } else {
                                imeOptions5 = imeOptions4;
                                if ((i101 & 48) != 32) {
                                    z59 = true;
                                } else {
                                    z59 = false;
                                }
                            }
                            z65 = zW5 | z59;
                            objE12 = rVarH.E();
                            if (z65) {
                                ImeOptions imeOptions14 = imeOptions5;
                                objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions14, null);
                                imeOptions6 = imeOptions14;
                                rVarH.v(objE12);
                            } else {
                                ImeOptions imeOptions15 = imeOptions5;
                                objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions15, null);
                                imeOptions6 = imeOptions15;
                                rVarH.v(objE12);
                            }
                            imeOptions7 = imeOptions6;
                            Function0.d(i0Var4, (p) objE12, rVarH, 6);
                            int i107 = i101 >> 3;
                            c2Var3 = c2Var2;
                            m mVarA9 = k5.a(companion2, c2Var3, z58, lVar8, s3Var, d0Var, z37, i0Var, rVarH, (i107 & 896) | 196614 | ((i97 >> 9) & 7168) | ((i101 << 6) & 3670016));
                            i0Var2 = i0Var;
                            final m mVarB7 = m2.b(companion2, s3Var, textFieldValue2, i0Var2);
                            boolean zG11 = rVarH.G(s3Var);
                            if (i100 == 2048) {
                                z66 = true;
                            } else {
                                z66 = false;
                            }
                            boolean zW6 = zG11 | z66 | rVarH.W(n3Var) | rVarH.G(c2Var3);
                            if (i99 == 4) {
                                z67 = true;
                            } else {
                                z67 = false;
                            }
                            zG2 = zW6 | z67 | rVarH.G(i0Var2);
                            objE13 = rVarH.E();
                            if (zG2) {
                                final TextFieldValue textFieldValue6 = textFieldValue2;
                                objE13 = new l() { // from class: n1.v1
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue6, i0Var2, (b0) obj);
                                    }
                                };
                                rVarH.v(objE13);
                            } else {
                                final TextFieldValue textFieldValue7 = textFieldValue2;
                                objE13 = new l() { // from class: n1.v1
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue7, i0Var2, (b0) obj);
                                    }
                                };
                                rVarH.v(objE13);
                            }
                            final m mVarA10 = p036e4.l1.a(companion2, (l) objE13);
                            CoreTextFieldSemanticsModifier hVar3 = new CoreTextFieldSemanticsModifier(transformedText, textFieldValue, s3Var, z37, z58, e1VarC instanceof v4.k0, i0Var2, c2Var3, imeOptions7, d0Var);
                            if (z58) {
                                z68 = false;
                            } else {
                                z68 = false;
                            }
                            final m mVarA11 = m2.a(companion2, s3Var, textFieldValue, i0Var2, cVar2, z68);
                            zG3 = rVarH.G(c2Var3);
                            final e1 e1Var5 = e1VarC;
                            objE14 = rVarH.E();
                            if (zG3) {
                                objE14 = new l() { // from class: n1.w1
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j2.E(c2Var3, (s0) obj);
                                    }
                                };
                                rVarH.v(objE14);
                            } else {
                                objE14 = new l() { // from class: n1.w1
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j2.E(c2Var3, (s0) obj);
                                    }
                                };
                                rVarH.v(objE14);
                            }
                            Function0.a(c2Var3, (l) objE14, rVarH, 0);
                            boolean zG12 = rVarH.G(s3Var) | rVarH.G(v0Var2);
                            if (i99 == 4) {
                                z69 = true;
                            } else {
                                z69 = false;
                            }
                            z75 = z69 | zG12 | ((i102 <= 32 && rVarH.W(imeOptions7)) || (i101 & 48) == 32);
                            objE15 = rVarH.E();
                            if (z75) {
                                objE15 = new l() { // from class: n1.y1
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                                    }
                                };
                                rVarH.v(objE15);
                            } else {
                                objE15 = new l() { // from class: n1.y1
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                                    }
                                };
                                rVarH.v(objE15);
                            }
                            Function0.a(imeOptions7, (l) objE15, rVarH, i107 & 14);
                            l<TextFieldValue, i0> lVarR3 = s3Var.r();
                            boolean z814 = !z37;
                            i103 = i95;
                            if (i103 == 1) {
                                z76 = true;
                            } else {
                                z76 = false;
                            }
                            m mVarB8 = i5.b(companion2, s3Var, c2Var3, textFieldValue, lVarR3, z814, z76, i0Var2, i7Var, imeOptions7.getImeAction());
                            keyboardType = imeOptions7.getKeyboardType();
                            companion3 = a0.INSTANCE;
                            if (a0.n(keyboardType, companion3.f())) {
                                z77 = false;
                            } else {
                                z77 = false;
                            }
                            boolean zC4 = C(f6VarP);
                            zA = rVarH.a(z77) | rVarH.G(k1Var);
                            objE16 = rVarH.E();
                            if (zA) {
                                objE16 = new er.a() { // from class: n1.z1
                                    @Override // er.a
                                    public final Object a() {
                                        return j2.G(z77, k1Var);
                                    }
                                };
                                rVarH.v(objE16);
                            } else {
                                objE16 = new er.a() { // from class: n1.z1
                                    @Override // er.a
                                    public final Object a() {
                                        return j2.G(z77, k1Var);
                                    }
                                };
                                rVarH.v(objE16);
                            }
                            m mVarB9 = v1.b.b(companion2, zC4, z77, (er.a) objE16);
                            cVarE = l.e((androidx.compose.ui.graphics.c) rVarH.N(l.c()), ((Color) rVarH.N(l.d())).m20unboximpl(), m.a());
                            zG4 = rVarH.G(s3Var) | rVarH.W(cVarE);
                            objE17 = rVarH.E();
                            if (zG4) {
                                objE17 = new l() { // from class: n1.h2
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j2.H(s3Var, cVarE, (c) obj);
                                    }
                                };
                                rVarH.v(objE17);
                            } else {
                                objE17 = new l() { // from class: n1.h2
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j2.H(s3Var, cVarE, (c) obj);
                                    }
                                };
                                rVarH.v(objE17);
                            }
                            m mVarD3 = k3.k.d(companion2, (l) objE17);
                            m mVar9 = mVar4;
                            final a6 a6Var8 = a6Var5;
                            m mVarA12 = a0(p036e4.l1.a(u5.f(g0(u4.b(h1.a(mVar9.u(mVarD3), k1Var, s3Var, c2Var3).u(mVarB9).u(mVarA8), s3Var, oVar), s3Var, c2Var3).u(mVarB8), a6Var8, lVar8, z58, x5.a(rVarH, 0)).u(mVarA9).u(hVar3), new l() { // from class: n1.n1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.I(s3Var, (b0) obj);
                                }
                            }), c2Var3, p0Var2);
                            if (!z58) {
                                z78 = false;
                            } else {
                                z78 = false;
                            }
                            if (z78) {
                                mVarZ = c3.z(companion2, c2Var3);
                            } else {
                                mVarZ = companion2;
                            }
                            final m mVar10 = mVarZ;
                            final q qVar5 = qVarB;
                            P(mVarA12, c2Var3, y2.m.d(-814563849, true, new p() { // from class: n1.o1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return j2.J(qVar5, s3Var, textStyle4, z38, i98, i103, a6Var8, textFieldValue, e1Var5, mVarA11, mVarB7, mVarA10, mVar10, aVar4, c2Var3, z78, z37, lVar7, i0Var2, dVar, (r) obj, ((Integer) obj2).intValue());
                                }
                            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes);
                            if (p076m2.t.k()) {
                                p076m2.t.n();
                            }
                            qVar2 = qVar5;
                            i89 = i98;
                            rVar2 = rVarH;
                            e1Var2 = e1Var5;
                            z26 = z37;
                            lVar6 = lVar7;
                            z25 = z58;
                            a6Var2 = a6Var3;
                            solidColor = cVar2;
                            lVar5 = lVar8;
                            l3Var2 = l3VarA;
                            mVar3 = mVar9;
                            i88 = i103;
                            imeOptions2 = imeOptions7;
                            z19 = z38;
                            textStyle3 = textStyle4;
                        } else {
                            rVarH.O();
                            z19 = z15;
                            imeOptions2 = imeOptions;
                            l3Var2 = l3Var;
                            qVar2 = qVar;
                            a6Var2 = a6Var;
                            rVar2 = rVarH;
                            textStyle3 = textStyle2;
                            lVar6 = lVar4;
                            e1Var2 = e1VarC;
                            mVar3 = mVar2;
                            i88 = i15;
                            i89 = i16;
                            z25 = z16;
                            z26 = z17;
                        }
                        d5VarM = rVar2.m();
                        if (d5VarM != null) {
                            d5VarM.a(new p() { // from class: n1.p1
                                @Override // er.p
                                public final Object B(Object obj, Object obj2) {
                                    return j2.N(textFieldValue, lVar, mVar3, textStyle3, e1Var2, lVar6, lVar5, solidColor, z19, i88, i89, imeOptions2, l3Var2, z25, z26, qVar2, a6Var2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i25 |= 805306368;
                    i56 = i19 & 1024;
                    if (i56 != 0) {
                        i57 = i18 | 6;
                    } else if ((i18 & 6) == 0) {
                        if (rVarH.c(i16)) {
                            i58 = 4;
                        } else {
                            i58 = 2;
                        }
                        i57 = i18 | i58;
                    } else {
                        i57 = i18;
                    }
                    if ((i18 & 48) != 0) {
                        i57 |= ((i19 & 2048) == 0 || !rVarH.W(imeOptions)) ? 16 : 32;
                    }
                    i59 = i57;
                    i65 = i19 & PKIFailureInfo.certConfirmed;
                    if (i65 != 0) {
                        i66 = i59 | MLKEMEngine.KyberPolyBytes;
                    } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                        if (rVarH.W(l3Var)) {
                            i67 = 256;
                        } else {
                            i67 = 128;
                        }
                        i66 = i59 | i67;
                    } else {
                        i66 = i59;
                    }
                    i68 = i19 & PKIFailureInfo.certRevoked;
                    if (i68 != 0) {
                        i75 = i66 | 3072;
                    } else {
                        i69 = i66;
                        if ((i18 & 3072) == 0) {
                            i75 = i69 | (rVarH.a(z16) ? 2048 : 1024);
                        } else {
                            i75 = i69;
                        }
                    }
                    i76 = i19 & 16384;
                    if (i76 != 0) {
                        i78 = i75 | 24576;
                    } else {
                        i77 = i75;
                        if ((i18 & 24576) == 0) {
                            if (rVarH.a(z17)) {
                                i29 = 16384;
                            }
                            i78 = i77 | i29;
                        } else {
                            i78 = i77;
                        }
                    }
                    i79 = i19 & 32768;
                    if (i79 != 0) {
                        i78 |= 196608;
                    } else if ((i18 & 196608) == 0) {
                        if (rVarH.G(qVar)) {
                            i85 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i85 = 65536;
                        }
                        i78 |= i85;
                    }
                    i86 = i19 & PKIFailureInfo.notAuthorized;
                    if (i86 != 0) {
                        i78 |= 1572864;
                    } else if ((i18 & 1572864) == 0) {
                        if (rVarH.W(a6Var)) {
                            i87 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i87 = PKIFailureInfo.signerNotTrusted;
                        }
                        i78 |= i87;
                    }
                    if ((i25 & 306783379) == 306783378) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if (rVarH.r(z18, i25 & 1)) {
                        rVarH.I();
                        if ((i17 & 1) != 0) {
                            if (i104 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i26 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i28 != 0) {
                                e1VarC = e1.INSTANCE.c();
                            }
                            if (i36 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: n1.g2
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return j2.x((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar4 = (l) objE;
                            }
                            if (i38 != 0) {
                                lVar5 = null;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.h(), null);
                            }
                            if (i47 != 0) {
                                z27 = true;
                            } else {
                                z27 = z15;
                            }
                            if (i49 != 0) {
                                i95 = Integer.MAX_VALUE;
                            } else {
                                i95 = i15;
                            }
                            if (i56 != 0) {
                                i96 = 1;
                            } else {
                                i96 = i16;
                            }
                            if ((i19 & 2048) != 0) {
                                imeOptionsA = ImeOptions.INSTANCE.a();
                                i78 &= -113;
                            } else {
                                imeOptionsA = imeOptions;
                            }
                            if (i65 != 0) {
                                l3VarA = l3.INSTANCE.a();
                            } else {
                                l3VarA = l3Var;
                            }
                            if (i68 != 0) {
                                z28 = true;
                            } else {
                                z28 = z16;
                            }
                            if (i76 != 0) {
                                z29 = false;
                            } else {
                                z29 = z17;
                            }
                            if (i79 != 0) {
                                qVarB = g1.f130036a.b();
                            } else {
                                qVarB = qVar;
                            }
                            if (i86 != 0) {
                                a6Var3 = null;
                            } else {
                                a6Var3 = a6Var;
                            }
                            lVar7 = lVar4;
                            imeOptions3 = imeOptionsA;
                            z35 = z27;
                            textStyle2 = textStyleA;
                            mVar4 = mVar2;
                            z36 = z28;
                            z37 = z29;
                        } else {
                            if (i104 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i26 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i28 != 0) {
                                e1VarC = e1.INSTANCE.c();
                            }
                            if (i36 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: n1.g2
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return j2.x((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar4 = (l) objE;
                            }
                            if (i38 != 0) {
                                lVar5 = null;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.h(), null);
                            }
                            if (i47 != 0) {
                                z27 = true;
                            } else {
                                z27 = z15;
                            }
                            if (i49 != 0) {
                                i95 = Integer.MAX_VALUE;
                            } else {
                                i95 = i15;
                            }
                            if (i56 != 0) {
                                i96 = 1;
                            } else {
                                i96 = i16;
                            }
                            if ((i19 & 2048) != 0) {
                                imeOptionsA = ImeOptions.INSTANCE.a();
                                i78 &= -113;
                            } else {
                                imeOptionsA = imeOptions;
                            }
                            if (i65 != 0) {
                                l3VarA = l3.INSTANCE.a();
                            } else {
                                l3VarA = l3Var;
                            }
                            if (i68 != 0) {
                                z28 = true;
                            } else {
                                z28 = z16;
                            }
                            if (i76 != 0) {
                                z29 = false;
                            } else {
                                z29 = z17;
                            }
                            if (i79 != 0) {
                                qVarB = g1.f130036a.b();
                            } else {
                                qVarB = qVar;
                            }
                            if (i86 != 0) {
                                a6Var3 = null;
                            } else {
                                a6Var3 = a6Var;
                            }
                            lVar7 = lVar4;
                            imeOptions3 = imeOptionsA;
                            z35 = z27;
                            textStyle2 = textStyleA;
                            mVar4 = mVar2;
                            z36 = z28;
                            z37 = z29;
                        }
                        rVarH.y();
                        z38 = z35;
                        if (p076m2.t.k()) {
                            p076m2.t.o(31062401, i25, i78, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                        }
                        objE2 = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE2 == companion.a()) {
                            objE2 = new d0();
                            rVarH.v(objE2);
                        }
                        d0Var = (d0) objE2;
                        objE3 = rVarH.E();
                        i97 = i25;
                        if (objE3 == companion.a()) {
                            objE3 = l1.b();
                            rVarH.v(objE3);
                        }
                        k1Var = (k1) objE3;
                        objE4 = rVarH.E();
                        cVar2 = solidColor;
                        if (objE4 == companion.a()) {
                            objE4 = new v0(k1Var);
                            rVarH.v(objE4);
                        }
                        v0Var = (v0) objE4;
                        dVar = (c5.d) rVarH.N(g1.f());
                        bVar = (u4.l.b) rVarH.N(g1.h());
                        selectionBackgroundColor = ((SelectionColors) rVarH.N(g3.c())).getSelectionBackgroundColor();
                        oVar = (o) rVarH.N(g1.g());
                        n3Var = (n3) rVarH.N(g1.v());
                        textStyle4 = textStyle2;
                        r2Var = (r2) rVarH.N(g1.r());
                        i98 = i96;
                        if (i95 == 1) {
                            a2Var = p143z0.a2.Vertical;
                        } else {
                            a2Var = p143z0.a2.Vertical;
                        }
                        if (a6Var3 == null) {
                            rVarH.X(-213744626);
                            Object[] objArr2 = {a2Var};
                            b3.x<a6, Object> xVarA2 = a6.INSTANCE.a();
                            zC = rVarH.c(a2Var.ordinal());
                            objE18 = rVarH.E();
                            if (zC) {
                                objE18 = new er.a() { // from class: n1.q1
                                    @Override // er.a
                                    public final Object a() {
                                        return j2.O(a2Var);
                                    }
                                };
                                rVarH.v(objE18);
                            } else {
                                objE18 = new er.a() { // from class: n1.q1
                                    @Override // er.a
                                    public final Object a() {
                                        return j2.O(a2Var);
                                    }
                                };
                                rVarH.v(objE18);
                            }
                            a6Var4 = (a6) b3.f.i(objArr2, xVarA2, (er.a) objE18, rVarH, 0);
                            rVarH.R();
                        } else {
                            rVarH.X(-213745742);
                            rVarH.R();
                            a6Var4 = a6Var3;
                        }
                        if (a6Var4.j() != a2Var) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("Mismatching scroller orientation; ");
                            if (a2Var == p143z0.a2.Vertical) {
                                str = "only single-line, non-wrap text fields can scroll horizontally";
                            } else {
                                str = "single-line, non-wrap text fields can only scroll horizontally";
                            }
                            sb6.append(str);
                            throw new IllegalArgumentException(sb6.toString());
                        }
                        i99 = i97 & 14;
                        if (i99 == 4) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        if ((i97 & 57344) == 16384) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        z46 = z39 | z45;
                        objE5 = rVarH.E();
                        if (z46) {
                            transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                            composition = textFieldValue.getComposition();
                            if (composition != null) {
                                a6Var5 = a6Var4;
                                transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                if (transformedTextC2 != null) {
                                    objE5 = transformedTextC2;
                                }
                                rVarH.v(objE5);
                            } else {
                                a6Var5 = a6Var4;
                            }
                            objE5 = transformedTextC;
                            rVarH.v(objE5);
                        } else {
                            transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                            composition = textFieldValue.getComposition();
                            if (composition != null) {
                                a6Var5 = a6Var4;
                                transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                if (transformedTextC2 != null) {
                                    objE5 = transformedTextC2;
                                }
                                rVarH.v(objE5);
                            } else {
                                a6Var5 = a6Var4;
                            }
                            objE5 = transformedTextC;
                            rVarH.v(objE5);
                        }
                        TransformedText transformedText2 = (TransformedText) objE5;
                        text = transformedText2.getText();
                        offsetMapping = transformedText2.getOffsetMapping();
                        d4VarC = p076m2.m.c(rVarH, 0);
                        zW = rVarH.W(r2Var);
                        objE6 = rVarH.E();
                        if (zW) {
                            objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                            rVarH.v(objE6);
                        } else {
                            objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                            rVarH.v(objE6);
                        }
                        s3Var = (s3) objE6;
                        s3Var.X(textFieldValue.getText(), text, textStyle4, z38, r55, bVar, lVar, l3VarA, oVar, selectionBackgroundColor);
                        s3Var.getProcessor().e(textFieldValue, s3Var.getInputSession());
                        objE7 = rVarH.E();
                        if (objE7 == companion.a()) {
                            objE7 = new i7(0, 1, null);
                            rVarH.v(objE7);
                        }
                        i7Var = (i7) objE7;
                        i7.f(i7Var, textFieldValue, 0L, 2, null);
                        objE8 = rVarH.E();
                        if (objE8 == companion.a()) {
                            objE8 = Function0.i(tq.j.f191408a, rVarH);
                            rVarH.v(objE8);
                        }
                        p0Var = (p0) objE8;
                        objE9 = rVarH.E();
                        if (objE9 == companion.a()) {
                            objE9 = j1.e.a();
                            rVarH.v(objE9);
                        }
                        aVar = (j1.a) objE9;
                        objE10 = rVarH.E();
                        b1.l lVar9 = lVar5;
                        if (objE10 == companion.a()) {
                            objE10 = new c2(i7Var);
                            rVarH.v(objE10);
                        }
                        c2Var = (c2) objE10;
                        c2Var.L0(offsetMapping);
                        c2Var.U0(e1VarC);
                        c2Var.M0(s3Var.r());
                        c2Var.Q0(s3Var);
                        c2Var.T0(textFieldValue);
                        c2Var.z0((androidx.compose.ui.platform.b1) rVarH.N(g1.d()));
                        c2Var.A0(p0Var);
                        c2Var.R0((v2) rVarH.N(g1.s()));
                        c2Var.I0((v3.a) rVarH.N(g1.j()));
                        c2Var.G0(d0Var);
                        c2Var.E0(!z37);
                        c2Var.F0(z36);
                        if (g0.isSmartSelectionEnabled) {
                            rVarH.X(1966756105);
                            c2Var.N0(f0.h(z1.i0.EditableText, textStyle4.w(), rVarH, 6));
                            rVarH.R();
                        } else {
                            rVarH.X(1966902177);
                            rVarH.R();
                        }
                        s3Var.h();
                        new l() { // from class: n1.r1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.y(c2Var, (q4.e) obj);
                            }
                        };
                        new er.a() { // from class: n1.s1
                            @Override // er.a
                            public final Object a() {
                                return j2.z(c2Var);
                            }
                        };
                        new er.a() { // from class: n1.t1
                            @Override // er.a
                            public final Object a() {
                                return j2.A(c2Var);
                            }
                        };
                        companion2 = m.INSTANCE;
                        boolean zG13 = rVarH.G(s3Var);
                        i100 = i78 & 7168;
                        i101 = i78;
                        if (i100 == 2048) {
                            z47 = true;
                        } else {
                            z47 = false;
                        }
                        boolean z710 = z47 | zG13;
                        if ((i101 & 57344) == 16384) {
                            z48 = true;
                        } else {
                            z48 = false;
                        }
                        boolean zG14 = z710 | z48 | rVarH.G(v0Var);
                        if (i99 == 4) {
                            z49 = true;
                        } else {
                            z49 = false;
                        }
                        boolean z815 = zG14 | z49;
                        i102 = (i101 & 112) ^ 48;
                        if (i102 > 32) {
                            v0Var2 = v0Var;
                            if ((i101 & 48) != 32) {
                                z55 = true;
                            } else {
                                z55 = false;
                            }
                        } else {
                            v0Var2 = v0Var;
                            if ((i101 & 48) != 32) {
                                z55 = true;
                            } else {
                                z55 = false;
                            }
                        }
                        zG = z815 | z55 | rVarH.G(offsetMapping) | rVarH.G(p0Var) | rVarH.G(aVar) | rVarH.G(c2Var);
                        objE11 = rVarH.E();
                        if (zG) {
                            final ImeOptions imeOptions16 = imeOptions3;
                            i0Var = offsetMapping;
                            final boolean z816 = z36;
                            final boolean z817 = z37;
                            objE11 = new l() { // from class: n1.u1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.B(s3Var, z816, z817, v0Var2, textFieldValue, imeOptions16, i0Var, c2Var, p0Var, aVar, (l0) obj);
                                }
                            };
                            z56 = z816;
                            textFieldValue2 = textFieldValue;
                            imeOptions4 = imeOptions16;
                            c2Var2 = c2Var;
                            p0Var2 = p0Var;
                            aVar2 = aVar;
                            rVarH.v(objE11);
                        } else {
                            final ImeOptions imeOptions17 = imeOptions3;
                            i0Var = offsetMapping;
                            final boolean z818 = z36;
                            final boolean z819 = z37;
                            objE11 = new l() { // from class: n1.u1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.B(s3Var, z818, z819, v0Var2, textFieldValue, imeOptions17, i0Var, c2Var, p0Var, aVar, (l0) obj);
                                }
                            };
                            z56 = z818;
                            textFieldValue2 = textFieldValue;
                            imeOptions4 = imeOptions17;
                            c2Var2 = c2Var;
                            p0Var2 = p0Var;
                            aVar2 = aVar;
                            rVarH.v(objE11);
                        }
                        final j1.a aVar5 = aVar2;
                        m mVarA13 = v4.a(companion2, z56, d0Var, lVar9, (l) objE11);
                        if (z56) {
                            z57 = false;
                        } else {
                            z57 = false;
                        }
                        Boolean boolValueOf3 = Boolean.valueOf(z57);
                        z58 = z56;
                        f6VarP = x5.p(boolValueOf3, rVarH, 0);
                        i0 i0Var5 = i0.f148189a;
                        boolean zW7 = rVarH.W(f6VarP) | rVarH.G(s3Var) | rVarH.G(v0Var2) | rVarH.G(c2Var2);
                        if (i102 > 32) {
                            imeOptions5 = imeOptions4;
                            if ((i101 & 48) != 32) {
                                z59 = true;
                            } else {
                                z59 = false;
                            }
                        } else {
                            imeOptions5 = imeOptions4;
                            if ((i101 & 48) != 32) {
                                z59 = true;
                            } else {
                                z59 = false;
                            }
                        }
                        z65 = zW7 | z59;
                        objE12 = rVarH.E();
                        if (z65) {
                            ImeOptions imeOptions18 = imeOptions5;
                            objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions18, null);
                            imeOptions6 = imeOptions18;
                            rVarH.v(objE12);
                        } else {
                            ImeOptions imeOptions19 = imeOptions5;
                            objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions19, null);
                            imeOptions6 = imeOptions19;
                            rVarH.v(objE12);
                        }
                        imeOptions7 = imeOptions6;
                        Function0.d(i0Var5, (p) objE12, rVarH, 6);
                        int i108 = i101 >> 3;
                        c2Var3 = c2Var2;
                        m mVarA14 = k5.a(companion2, c2Var3, z58, lVar9, s3Var, d0Var, z37, i0Var, rVarH, (i108 & 896) | 196614 | ((i97 >> 9) & 7168) | ((i101 << 6) & 3670016));
                        i0Var2 = i0Var;
                        final m mVarB10 = m2.b(companion2, s3Var, textFieldValue2, i0Var2);
                        boolean zG15 = rVarH.G(s3Var);
                        if (i100 == 2048) {
                            z66 = true;
                        } else {
                            z66 = false;
                        }
                        boolean zW8 = zG15 | z66 | rVarH.W(n3Var) | rVarH.G(c2Var3);
                        if (i99 == 4) {
                            z67 = true;
                        } else {
                            z67 = false;
                        }
                        zG2 = zW8 | z67 | rVarH.G(i0Var2);
                        objE13 = rVarH.E();
                        if (zG2) {
                            final TextFieldValue textFieldValue8 = textFieldValue2;
                            objE13 = new l() { // from class: n1.v1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue8, i0Var2, (b0) obj);
                                }
                            };
                            rVarH.v(objE13);
                        } else {
                            final TextFieldValue textFieldValue9 = textFieldValue2;
                            objE13 = new l() { // from class: n1.v1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue9, i0Var2, (b0) obj);
                                }
                            };
                            rVarH.v(objE13);
                        }
                        final m mVarA15 = p036e4.l1.a(companion2, (l) objE13);
                        CoreTextFieldSemanticsModifier hVar4 = new CoreTextFieldSemanticsModifier(transformedText2, textFieldValue, s3Var, z37, z58, e1VarC instanceof v4.k0, i0Var2, c2Var3, imeOptions7, d0Var);
                        if (z58) {
                            z68 = false;
                        } else {
                            z68 = false;
                        }
                        final m mVarA16 = m2.a(companion2, s3Var, textFieldValue, i0Var2, cVar2, z68);
                        zG3 = rVarH.G(c2Var3);
                        final e1 e1Var6 = e1VarC;
                        objE14 = rVarH.E();
                        if (zG3) {
                            objE14 = new l() { // from class: n1.w1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.E(c2Var3, (s0) obj);
                                }
                            };
                            rVarH.v(objE14);
                        } else {
                            objE14 = new l() { // from class: n1.w1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.E(c2Var3, (s0) obj);
                                }
                            };
                            rVarH.v(objE14);
                        }
                        Function0.a(c2Var3, (l) objE14, rVarH, 0);
                        boolean zG16 = rVarH.G(s3Var) | rVarH.G(v0Var2);
                        if (i99 == 4) {
                            z69 = true;
                        } else {
                            z69 = false;
                        }
                        z75 = z69 | zG16 | ((i102 <= 32 && rVarH.W(imeOptions7)) || (i101 & 48) == 32);
                        objE15 = rVarH.E();
                        if (z75) {
                            objE15 = new l() { // from class: n1.y1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                                }
                            };
                            rVarH.v(objE15);
                        } else {
                            objE15 = new l() { // from class: n1.y1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                                }
                            };
                            rVarH.v(objE15);
                        }
                        Function0.a(imeOptions7, (l) objE15, rVarH, i108 & 14);
                        l<TextFieldValue, i0> lVarR4 = s3Var.r();
                        boolean z8110 = !z37;
                        i103 = i95;
                        if (i103 == 1) {
                            z76 = true;
                        } else {
                            z76 = false;
                        }
                        m mVarB11 = i5.b(companion2, s3Var, c2Var3, textFieldValue, lVarR4, z8110, z76, i0Var2, i7Var, imeOptions7.getImeAction());
                        keyboardType = imeOptions7.getKeyboardType();
                        companion3 = a0.INSTANCE;
                        if (a0.n(keyboardType, companion3.f())) {
                            z77 = false;
                        } else {
                            z77 = false;
                        }
                        boolean zC5 = C(f6VarP);
                        zA = rVarH.a(z77) | rVarH.G(k1Var);
                        objE16 = rVarH.E();
                        if (zA) {
                            objE16 = new er.a() { // from class: n1.z1
                                @Override // er.a
                                public final Object a() {
                                    return j2.G(z77, k1Var);
                                }
                            };
                            rVarH.v(objE16);
                        } else {
                            objE16 = new er.a() { // from class: n1.z1
                                @Override // er.a
                                public final Object a() {
                                    return j2.G(z77, k1Var);
                                }
                            };
                            rVarH.v(objE16);
                        }
                        m mVarB12 = v1.b.b(companion2, zC5, z77, (er.a) objE16);
                        cVarE = l.e((androidx.compose.ui.graphics.c) rVarH.N(l.c()), ((Color) rVarH.N(l.d())).m20unboximpl(), m.a());
                        zG4 = rVarH.G(s3Var) | rVarH.W(cVarE);
                        objE17 = rVarH.E();
                        if (zG4) {
                            objE17 = new l() { // from class: n1.h2
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.H(s3Var, cVarE, (c) obj);
                                }
                            };
                            rVarH.v(objE17);
                        } else {
                            objE17 = new l() { // from class: n1.h2
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.H(s3Var, cVarE, (c) obj);
                                }
                            };
                            rVarH.v(objE17);
                        }
                        m mVarD4 = k3.k.d(companion2, (l) objE17);
                        m mVar11 = mVar4;
                        final a6 a6Var9 = a6Var5;
                        m mVarA17 = a0(p036e4.l1.a(u5.f(g0(u4.b(h1.a(mVar11.u(mVarD4), k1Var, s3Var, c2Var3).u(mVarB12).u(mVarA13), s3Var, oVar), s3Var, c2Var3).u(mVarB11), a6Var9, lVar9, z58, x5.a(rVarH, 0)).u(mVarA14).u(hVar4), new l() { // from class: n1.n1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.I(s3Var, (b0) obj);
                            }
                        }), c2Var3, p0Var2);
                        if (!z58) {
                            z78 = false;
                        } else {
                            z78 = false;
                        }
                        if (z78) {
                            mVarZ = c3.z(companion2, c2Var3);
                        } else {
                            mVarZ = companion2;
                        }
                        final m mVar12 = mVarZ;
                        final q qVar6 = qVarB;
                        P(mVarA17, c2Var3, y2.m.d(-814563849, true, new p() { // from class: n1.o1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j2.J(qVar6, s3Var, textStyle4, z38, i98, i103, a6Var9, textFieldValue, e1Var6, mVarA16, mVarB10, mVarA15, mVar12, aVar5, c2Var3, z78, z37, lVar7, i0Var2, dVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        qVar2 = qVar6;
                        i89 = i98;
                        rVar2 = rVarH;
                        e1Var2 = e1Var6;
                        z26 = z37;
                        lVar6 = lVar7;
                        z25 = z58;
                        a6Var2 = a6Var3;
                        solidColor = cVar2;
                        lVar5 = lVar9;
                        l3Var2 = l3VarA;
                        mVar3 = mVar11;
                        i88 = i103;
                        imeOptions2 = imeOptions7;
                        z19 = z38;
                        textStyle3 = textStyle4;
                    } else {
                        rVarH.O();
                        z19 = z15;
                        imeOptions2 = imeOptions;
                        l3Var2 = l3Var;
                        qVar2 = qVar;
                        a6Var2 = a6Var;
                        rVar2 = rVarH;
                        textStyle3 = textStyle2;
                        lVar6 = lVar4;
                        e1Var2 = e1VarC;
                        mVar3 = mVar2;
                        i88 = i15;
                        i89 = i16;
                        z25 = z16;
                        z26 = z17;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: n1.p1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j2.N(textFieldValue, lVar, mVar3, textStyle3, e1Var2, lVar6, lVar5, solidColor, z19, i88, i89, imeOptions2, l3Var2, z25, z26, qVar2, a6Var2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i25 |= 24576;
                e1VarC = e1Var;
                i36 = i19 & 32;
                if (i36 != 0) {
                    i25 |= 196608;
                    lVar4 = lVar2;
                } else {
                    lVar4 = lVar2;
                    if ((i17 & 196608) == 0) {
                        if (rVarH.G(lVar4)) {
                            i37 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i37 = 65536;
                        }
                        i25 |= i37;
                    }
                }
                i38 = i19 & 64;
                if (i38 != 0) {
                    i25 |= 1572864;
                    lVar5 = lVar3;
                } else {
                    lVar5 = lVar3;
                    if ((i17 & 1572864) == 0) {
                        if (rVarH.W(lVar5)) {
                            i39 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i39 = PKIFailureInfo.signerNotTrusted;
                        }
                        i25 |= i39;
                    }
                }
                i45 = i19 & 128;
                if (i45 != 0) {
                    i25 |= 12582912;
                    solidColor = cVar;
                } else {
                    solidColor = cVar;
                    if ((i17 & 12582912) == 0) {
                        if (rVarH.W(solidColor)) {
                            i46 = 8388608;
                        } else {
                            i46 = 4194304;
                        }
                        i25 |= i46;
                    }
                }
                i47 = i19 & 256;
                if (i47 != 0) {
                    i25 |= 100663296;
                } else if ((i17 & 100663296) == 0) {
                    if (rVarH.a(z15)) {
                        i48 = 67108864;
                    } else {
                        i48 = 33554432;
                    }
                    i25 |= i48;
                }
                i49 = i19 & 512;
                if (i49 != 0) {
                    if ((i17 & 805306368) == 0) {
                        if (rVarH.c(i15)) {
                            i55 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i55 = 268435456;
                        }
                        i25 |= i55;
                    }
                    i56 = i19 & 1024;
                    if (i56 != 0) {
                        i57 = i18 | 6;
                    } else if ((i18 & 6) == 0) {
                        if (rVarH.c(i16)) {
                            i58 = 4;
                        } else {
                            i58 = 2;
                        }
                        i57 = i18 | i58;
                    } else {
                        i57 = i18;
                    }
                    if ((i18 & 48) != 0) {
                        i57 |= ((i19 & 2048) == 0 || !rVarH.W(imeOptions)) ? 16 : 32;
                    }
                    i59 = i57;
                    i65 = i19 & PKIFailureInfo.certConfirmed;
                    if (i65 != 0) {
                        i66 = i59 | MLKEMEngine.KyberPolyBytes;
                    } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                        if (rVarH.W(l3Var)) {
                            i67 = 256;
                        } else {
                            i67 = 128;
                        }
                        i66 = i59 | i67;
                    } else {
                        i66 = i59;
                    }
                    i68 = i19 & PKIFailureInfo.certRevoked;
                    if (i68 != 0) {
                        i75 = i66 | 3072;
                    } else {
                        i69 = i66;
                        if ((i18 & 3072) == 0) {
                            i75 = i69 | (rVarH.a(z16) ? 2048 : 1024);
                        } else {
                            i75 = i69;
                        }
                    }
                    i76 = i19 & 16384;
                    if (i76 != 0) {
                        i78 = i75 | 24576;
                    } else {
                        i77 = i75;
                        if ((i18 & 24576) == 0) {
                            if (rVarH.a(z17)) {
                                i29 = 16384;
                            }
                            i78 = i77 | i29;
                        } else {
                            i78 = i77;
                        }
                    }
                    i79 = i19 & 32768;
                    if (i79 != 0) {
                        i78 |= 196608;
                    } else if ((i18 & 196608) == 0) {
                        if (rVarH.G(qVar)) {
                            i85 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i85 = 65536;
                        }
                        i78 |= i85;
                    }
                    i86 = i19 & PKIFailureInfo.notAuthorized;
                    if (i86 != 0) {
                        i78 |= 1572864;
                    } else if ((i18 & 1572864) == 0) {
                        if (rVarH.W(a6Var)) {
                            i87 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i87 = PKIFailureInfo.signerNotTrusted;
                        }
                        i78 |= i87;
                    }
                    if ((i25 & 306783379) == 306783378) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if (rVarH.r(z18, i25 & 1)) {
                        rVarH.I();
                        if ((i17 & 1) != 0) {
                            if (i104 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i26 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i28 != 0) {
                                e1VarC = e1.INSTANCE.c();
                            }
                            if (i36 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: n1.g2
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return j2.x((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar4 = (l) objE;
                            }
                            if (i38 != 0) {
                                lVar5 = null;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.h(), null);
                            }
                            if (i47 != 0) {
                                z27 = true;
                            } else {
                                z27 = z15;
                            }
                            if (i49 != 0) {
                                i95 = Integer.MAX_VALUE;
                            } else {
                                i95 = i15;
                            }
                            if (i56 != 0) {
                                i96 = 1;
                            } else {
                                i96 = i16;
                            }
                            if ((i19 & 2048) != 0) {
                                imeOptionsA = ImeOptions.INSTANCE.a();
                                i78 &= -113;
                            } else {
                                imeOptionsA = imeOptions;
                            }
                            if (i65 != 0) {
                                l3VarA = l3.INSTANCE.a();
                            } else {
                                l3VarA = l3Var;
                            }
                            if (i68 != 0) {
                                z28 = true;
                            } else {
                                z28 = z16;
                            }
                            if (i76 != 0) {
                                z29 = false;
                            } else {
                                z29 = z17;
                            }
                            if (i79 != 0) {
                                qVarB = g1.f130036a.b();
                            } else {
                                qVarB = qVar;
                            }
                            if (i86 != 0) {
                                a6Var3 = null;
                            } else {
                                a6Var3 = a6Var;
                            }
                            lVar7 = lVar4;
                            imeOptions3 = imeOptionsA;
                            z35 = z27;
                            textStyle2 = textStyleA;
                            mVar4 = mVar2;
                            z36 = z28;
                            z37 = z29;
                        } else {
                            if (i104 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i26 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i28 != 0) {
                                e1VarC = e1.INSTANCE.c();
                            }
                            if (i36 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: n1.g2
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return j2.x((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar4 = (l) objE;
                            }
                            if (i38 != 0) {
                                lVar5 = null;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.h(), null);
                            }
                            if (i47 != 0) {
                                z27 = true;
                            } else {
                                z27 = z15;
                            }
                            if (i49 != 0) {
                                i95 = Integer.MAX_VALUE;
                            } else {
                                i95 = i15;
                            }
                            if (i56 != 0) {
                                i96 = 1;
                            } else {
                                i96 = i16;
                            }
                            if ((i19 & 2048) != 0) {
                                imeOptionsA = ImeOptions.INSTANCE.a();
                                i78 &= -113;
                            } else {
                                imeOptionsA = imeOptions;
                            }
                            if (i65 != 0) {
                                l3VarA = l3.INSTANCE.a();
                            } else {
                                l3VarA = l3Var;
                            }
                            if (i68 != 0) {
                                z28 = true;
                            } else {
                                z28 = z16;
                            }
                            if (i76 != 0) {
                                z29 = false;
                            } else {
                                z29 = z17;
                            }
                            if (i79 != 0) {
                                qVarB = g1.f130036a.b();
                            } else {
                                qVarB = qVar;
                            }
                            if (i86 != 0) {
                                a6Var3 = null;
                            } else {
                                a6Var3 = a6Var;
                            }
                            lVar7 = lVar4;
                            imeOptions3 = imeOptionsA;
                            z35 = z27;
                            textStyle2 = textStyleA;
                            mVar4 = mVar2;
                            z36 = z28;
                            z37 = z29;
                        }
                        rVarH.y();
                        z38 = z35;
                        if (p076m2.t.k()) {
                            p076m2.t.o(31062401, i25, i78, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                        }
                        objE2 = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE2 == companion.a()) {
                            objE2 = new d0();
                            rVarH.v(objE2);
                        }
                        d0Var = (d0) objE2;
                        objE3 = rVarH.E();
                        i97 = i25;
                        if (objE3 == companion.a()) {
                            objE3 = l1.b();
                            rVarH.v(objE3);
                        }
                        k1Var = (k1) objE3;
                        objE4 = rVarH.E();
                        cVar2 = solidColor;
                        if (objE4 == companion.a()) {
                            objE4 = new v0(k1Var);
                            rVarH.v(objE4);
                        }
                        v0Var = (v0) objE4;
                        dVar = (c5.d) rVarH.N(g1.f());
                        bVar = (u4.l.b) rVarH.N(g1.h());
                        selectionBackgroundColor = ((SelectionColors) rVarH.N(g3.c())).getSelectionBackgroundColor();
                        oVar = (o) rVarH.N(g1.g());
                        n3Var = (n3) rVarH.N(g1.v());
                        textStyle4 = textStyle2;
                        r2Var = (r2) rVarH.N(g1.r());
                        i98 = i96;
                        if (i95 == 1) {
                            a2Var = p143z0.a2.Vertical;
                        } else {
                            a2Var = p143z0.a2.Vertical;
                        }
                        if (a6Var3 == null) {
                            rVarH.X(-213744626);
                            Object[] objArr3 = {a2Var};
                            b3.x<a6, Object> xVarA3 = a6.INSTANCE.a();
                            zC = rVarH.c(a2Var.ordinal());
                            objE18 = rVarH.E();
                            if (zC) {
                                objE18 = new er.a() { // from class: n1.q1
                                    @Override // er.a
                                    public final Object a() {
                                        return j2.O(a2Var);
                                    }
                                };
                                rVarH.v(objE18);
                            } else {
                                objE18 = new er.a() { // from class: n1.q1
                                    @Override // er.a
                                    public final Object a() {
                                        return j2.O(a2Var);
                                    }
                                };
                                rVarH.v(objE18);
                            }
                            a6Var4 = (a6) b3.f.i(objArr3, xVarA3, (er.a) objE18, rVarH, 0);
                            rVarH.R();
                        } else {
                            rVarH.X(-213745742);
                            rVarH.R();
                            a6Var4 = a6Var3;
                        }
                        if (a6Var4.j() != a2Var) {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("Mismatching scroller orientation; ");
                            if (a2Var == p143z0.a2.Vertical) {
                                str = "only single-line, non-wrap text fields can scroll horizontally";
                            } else {
                                str = "single-line, non-wrap text fields can only scroll horizontally";
                            }
                            sb7.append(str);
                            throw new IllegalArgumentException(sb7.toString());
                        }
                        i99 = i97 & 14;
                        if (i99 == 4) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        if ((i97 & 57344) == 16384) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        z46 = z39 | z45;
                        objE5 = rVarH.E();
                        if (z46) {
                            transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                            composition = textFieldValue.getComposition();
                            if (composition != null) {
                                a6Var5 = a6Var4;
                                transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                if (transformedTextC2 != null) {
                                    objE5 = transformedTextC2;
                                }
                                rVarH.v(objE5);
                            } else {
                                a6Var5 = a6Var4;
                            }
                            objE5 = transformedTextC;
                            rVarH.v(objE5);
                        } else {
                            transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                            composition = textFieldValue.getComposition();
                            if (composition != null) {
                                a6Var5 = a6Var4;
                                transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                if (transformedTextC2 != null) {
                                    objE5 = transformedTextC2;
                                }
                                rVarH.v(objE5);
                            } else {
                                a6Var5 = a6Var4;
                            }
                            objE5 = transformedTextC;
                            rVarH.v(objE5);
                        }
                        TransformedText transformedText3 = (TransformedText) objE5;
                        text = transformedText3.getText();
                        offsetMapping = transformedText3.getOffsetMapping();
                        d4VarC = p076m2.m.c(rVarH, 0);
                        zW = rVarH.W(r2Var);
                        objE6 = rVarH.E();
                        if (zW) {
                            objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                            rVarH.v(objE6);
                        } else {
                            objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                            rVarH.v(objE6);
                        }
                        s3Var = (s3) objE6;
                        s3Var.X(textFieldValue.getText(), text, textStyle4, z38, r55, bVar, lVar, l3VarA, oVar, selectionBackgroundColor);
                        s3Var.getProcessor().e(textFieldValue, s3Var.getInputSession());
                        objE7 = rVarH.E();
                        if (objE7 == companion.a()) {
                            objE7 = new i7(0, 1, null);
                            rVarH.v(objE7);
                        }
                        i7Var = (i7) objE7;
                        i7.f(i7Var, textFieldValue, 0L, 2, null);
                        objE8 = rVarH.E();
                        if (objE8 == companion.a()) {
                            objE8 = Function0.i(tq.j.f191408a, rVarH);
                            rVarH.v(objE8);
                        }
                        p0Var = (p0) objE8;
                        objE9 = rVarH.E();
                        if (objE9 == companion.a()) {
                            objE9 = j1.e.a();
                            rVarH.v(objE9);
                        }
                        aVar = (j1.a) objE9;
                        objE10 = rVarH.E();
                        b1.l lVar10 = lVar5;
                        if (objE10 == companion.a()) {
                            objE10 = new c2(i7Var);
                            rVarH.v(objE10);
                        }
                        c2Var = (c2) objE10;
                        c2Var.L0(offsetMapping);
                        c2Var.U0(e1VarC);
                        c2Var.M0(s3Var.r());
                        c2Var.Q0(s3Var);
                        c2Var.T0(textFieldValue);
                        c2Var.z0((androidx.compose.ui.platform.b1) rVarH.N(g1.d()));
                        c2Var.A0(p0Var);
                        c2Var.R0((v2) rVarH.N(g1.s()));
                        c2Var.I0((v3.a) rVarH.N(g1.j()));
                        c2Var.G0(d0Var);
                        c2Var.E0(!z37);
                        c2Var.F0(z36);
                        if (g0.isSmartSelectionEnabled) {
                            rVarH.X(1966756105);
                            c2Var.N0(f0.h(z1.i0.EditableText, textStyle4.w(), rVarH, 6));
                            rVarH.R();
                        } else {
                            rVarH.X(1966902177);
                            rVarH.R();
                        }
                        s3Var.h();
                        new l() { // from class: n1.r1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.y(c2Var, (q4.e) obj);
                            }
                        };
                        new er.a() { // from class: n1.s1
                            @Override // er.a
                            public final Object a() {
                                return j2.z(c2Var);
                            }
                        };
                        new er.a() { // from class: n1.t1
                            @Override // er.a
                            public final Object a() {
                                return j2.A(c2Var);
                            }
                        };
                        companion2 = m.INSTANCE;
                        boolean zG17 = rVarH.G(s3Var);
                        i100 = i78 & 7168;
                        i101 = i78;
                        if (i100 == 2048) {
                            z47 = true;
                        } else {
                            z47 = false;
                        }
                        boolean z711 = z47 | zG17;
                        if ((i101 & 57344) == 16384) {
                            z48 = true;
                        } else {
                            z48 = false;
                        }
                        boolean zG18 = z711 | z48 | rVarH.G(v0Var);
                        if (i99 == 4) {
                            z49 = true;
                        } else {
                            z49 = false;
                        }
                        boolean z8111 = zG18 | z49;
                        i102 = (i101 & 112) ^ 48;
                        if (i102 > 32) {
                            v0Var2 = v0Var;
                            if ((i101 & 48) != 32) {
                                z55 = true;
                            } else {
                                z55 = false;
                            }
                        } else {
                            v0Var2 = v0Var;
                            if ((i101 & 48) != 32) {
                                z55 = true;
                            } else {
                                z55 = false;
                            }
                        }
                        zG = z8111 | z55 | rVarH.G(offsetMapping) | rVarH.G(p0Var) | rVarH.G(aVar) | rVarH.G(c2Var);
                        objE11 = rVarH.E();
                        if (zG) {
                            final ImeOptions imeOptions110 = imeOptions3;
                            i0Var = offsetMapping;
                            final boolean z8112 = z36;
                            final boolean z8113 = z37;
                            objE11 = new l() { // from class: n1.u1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.B(s3Var, z8112, z8113, v0Var2, textFieldValue, imeOptions110, i0Var, c2Var, p0Var, aVar, (l0) obj);
                                }
                            };
                            z56 = z8112;
                            textFieldValue2 = textFieldValue;
                            imeOptions4 = imeOptions110;
                            c2Var2 = c2Var;
                            p0Var2 = p0Var;
                            aVar2 = aVar;
                            rVarH.v(objE11);
                        } else {
                            final ImeOptions imeOptions111 = imeOptions3;
                            i0Var = offsetMapping;
                            final boolean z8114 = z36;
                            final boolean z8115 = z37;
                            objE11 = new l() { // from class: n1.u1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.B(s3Var, z8114, z8115, v0Var2, textFieldValue, imeOptions111, i0Var, c2Var, p0Var, aVar, (l0) obj);
                                }
                            };
                            z56 = z8114;
                            textFieldValue2 = textFieldValue;
                            imeOptions4 = imeOptions111;
                            c2Var2 = c2Var;
                            p0Var2 = p0Var;
                            aVar2 = aVar;
                            rVarH.v(objE11);
                        }
                        final j1.a aVar6 = aVar2;
                        m mVarA18 = v4.a(companion2, z56, d0Var, lVar10, (l) objE11);
                        if (z56) {
                            z57 = false;
                        } else {
                            z57 = false;
                        }
                        Boolean boolValueOf4 = Boolean.valueOf(z57);
                        z58 = z56;
                        f6VarP = x5.p(boolValueOf4, rVarH, 0);
                        i0 i0Var6 = i0.f148189a;
                        boolean zW9 = rVarH.W(f6VarP) | rVarH.G(s3Var) | rVarH.G(v0Var2) | rVarH.G(c2Var2);
                        if (i102 > 32) {
                            imeOptions5 = imeOptions4;
                            if ((i101 & 48) != 32) {
                                z59 = true;
                            } else {
                                z59 = false;
                            }
                        } else {
                            imeOptions5 = imeOptions4;
                            if ((i101 & 48) != 32) {
                                z59 = true;
                            } else {
                                z59 = false;
                            }
                        }
                        z65 = zW9 | z59;
                        objE12 = rVarH.E();
                        if (z65) {
                            ImeOptions imeOptions112 = imeOptions5;
                            objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions112, null);
                            imeOptions6 = imeOptions112;
                            rVarH.v(objE12);
                        } else {
                            ImeOptions imeOptions113 = imeOptions5;
                            objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions113, null);
                            imeOptions6 = imeOptions113;
                            rVarH.v(objE12);
                        }
                        imeOptions7 = imeOptions6;
                        Function0.d(i0Var6, (p) objE12, rVarH, 6);
                        int i109 = i101 >> 3;
                        c2Var3 = c2Var2;
                        m mVarA19 = k5.a(companion2, c2Var3, z58, lVar10, s3Var, d0Var, z37, i0Var, rVarH, (i109 & 896) | 196614 | ((i97 >> 9) & 7168) | ((i101 << 6) & 3670016));
                        i0Var2 = i0Var;
                        final m mVarB13 = m2.b(companion2, s3Var, textFieldValue2, i0Var2);
                        boolean zG19 = rVarH.G(s3Var);
                        if (i100 == 2048) {
                            z66 = true;
                        } else {
                            z66 = false;
                        }
                        boolean zW10 = zG19 | z66 | rVarH.W(n3Var) | rVarH.G(c2Var3);
                        if (i99 == 4) {
                            z67 = true;
                        } else {
                            z67 = false;
                        }
                        zG2 = zW10 | z67 | rVarH.G(i0Var2);
                        objE13 = rVarH.E();
                        if (zG2) {
                            final TextFieldValue textFieldValue10 = textFieldValue2;
                            objE13 = new l() { // from class: n1.v1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue10, i0Var2, (b0) obj);
                                }
                            };
                            rVarH.v(objE13);
                        } else {
                            final TextFieldValue textFieldValue11 = textFieldValue2;
                            objE13 = new l() { // from class: n1.v1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue11, i0Var2, (b0) obj);
                                }
                            };
                            rVarH.v(objE13);
                        }
                        final m mVarA110 = p036e4.l1.a(companion2, (l) objE13);
                        CoreTextFieldSemanticsModifier hVar5 = new CoreTextFieldSemanticsModifier(transformedText3, textFieldValue, s3Var, z37, z58, e1VarC instanceof v4.k0, i0Var2, c2Var3, imeOptions7, d0Var);
                        if (z58) {
                            z68 = false;
                        } else {
                            z68 = false;
                        }
                        final m mVarA111 = m2.a(companion2, s3Var, textFieldValue, i0Var2, cVar2, z68);
                        zG3 = rVarH.G(c2Var3);
                        final e1 e1Var7 = e1VarC;
                        objE14 = rVarH.E();
                        if (zG3) {
                            objE14 = new l() { // from class: n1.w1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.E(c2Var3, (s0) obj);
                                }
                            };
                            rVarH.v(objE14);
                        } else {
                            objE14 = new l() { // from class: n1.w1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.E(c2Var3, (s0) obj);
                                }
                            };
                            rVarH.v(objE14);
                        }
                        Function0.a(c2Var3, (l) objE14, rVarH, 0);
                        boolean zG110 = rVarH.G(s3Var) | rVarH.G(v0Var2);
                        if (i99 == 4) {
                            z69 = true;
                        } else {
                            z69 = false;
                        }
                        z75 = z69 | zG110 | ((i102 <= 32 && rVarH.W(imeOptions7)) || (i101 & 48) == 32);
                        objE15 = rVarH.E();
                        if (z75) {
                            objE15 = new l() { // from class: n1.y1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                                }
                            };
                            rVarH.v(objE15);
                        } else {
                            objE15 = new l() { // from class: n1.y1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                                }
                            };
                            rVarH.v(objE15);
                        }
                        Function0.a(imeOptions7, (l) objE15, rVarH, i109 & 14);
                        l<TextFieldValue, i0> lVarR5 = s3Var.r();
                        boolean z8116 = !z37;
                        i103 = i95;
                        if (i103 == 1) {
                            z76 = true;
                        } else {
                            z76 = false;
                        }
                        m mVarB14 = i5.b(companion2, s3Var, c2Var3, textFieldValue, lVarR5, z8116, z76, i0Var2, i7Var, imeOptions7.getImeAction());
                        keyboardType = imeOptions7.getKeyboardType();
                        companion3 = a0.INSTANCE;
                        if (a0.n(keyboardType, companion3.f())) {
                            z77 = false;
                        } else {
                            z77 = false;
                        }
                        boolean zC6 = C(f6VarP);
                        zA = rVarH.a(z77) | rVarH.G(k1Var);
                        objE16 = rVarH.E();
                        if (zA) {
                            objE16 = new er.a() { // from class: n1.z1
                                @Override // er.a
                                public final Object a() {
                                    return j2.G(z77, k1Var);
                                }
                            };
                            rVarH.v(objE16);
                        } else {
                            objE16 = new er.a() { // from class: n1.z1
                                @Override // er.a
                                public final Object a() {
                                    return j2.G(z77, k1Var);
                                }
                            };
                            rVarH.v(objE16);
                        }
                        m mVarB15 = v1.b.b(companion2, zC6, z77, (er.a) objE16);
                        cVarE = l.e((androidx.compose.ui.graphics.c) rVarH.N(l.c()), ((Color) rVarH.N(l.d())).m20unboximpl(), m.a());
                        zG4 = rVarH.G(s3Var) | rVarH.W(cVarE);
                        objE17 = rVarH.E();
                        if (zG4) {
                            objE17 = new l() { // from class: n1.h2
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.H(s3Var, cVarE, (c) obj);
                                }
                            };
                            rVarH.v(objE17);
                        } else {
                            objE17 = new l() { // from class: n1.h2
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.H(s3Var, cVarE, (c) obj);
                                }
                            };
                            rVarH.v(objE17);
                        }
                        m mVarD5 = k3.k.d(companion2, (l) objE17);
                        m mVar13 = mVar4;
                        final a6 a6Var10 = a6Var5;
                        m mVarA112 = a0(p036e4.l1.a(u5.f(g0(u4.b(h1.a(mVar13.u(mVarD5), k1Var, s3Var, c2Var3).u(mVarB15).u(mVarA18), s3Var, oVar), s3Var, c2Var3).u(mVarB14), a6Var10, lVar10, z58, x5.a(rVarH, 0)).u(mVarA19).u(hVar5), new l() { // from class: n1.n1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.I(s3Var, (b0) obj);
                            }
                        }), c2Var3, p0Var2);
                        if (!z58) {
                            z78 = false;
                        } else {
                            z78 = false;
                        }
                        if (z78) {
                            mVarZ = c3.z(companion2, c2Var3);
                        } else {
                            mVarZ = companion2;
                        }
                        final m mVar14 = mVarZ;
                        final q qVar7 = qVarB;
                        P(mVarA112, c2Var3, y2.m.d(-814563849, true, new p() { // from class: n1.o1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j2.J(qVar7, s3Var, textStyle4, z38, i98, i103, a6Var10, textFieldValue, e1Var7, mVarA111, mVarB13, mVarA110, mVar14, aVar6, c2Var3, z78, z37, lVar7, i0Var2, dVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        qVar2 = qVar7;
                        i89 = i98;
                        rVar2 = rVarH;
                        e1Var2 = e1Var7;
                        z26 = z37;
                        lVar6 = lVar7;
                        z25 = z58;
                        a6Var2 = a6Var3;
                        solidColor = cVar2;
                        lVar5 = lVar10;
                        l3Var2 = l3VarA;
                        mVar3 = mVar13;
                        i88 = i103;
                        imeOptions2 = imeOptions7;
                        z19 = z38;
                        textStyle3 = textStyle4;
                    } else {
                        rVarH.O();
                        z19 = z15;
                        imeOptions2 = imeOptions;
                        l3Var2 = l3Var;
                        qVar2 = qVar;
                        a6Var2 = a6Var;
                        rVar2 = rVarH;
                        textStyle3 = textStyle2;
                        lVar6 = lVar4;
                        e1Var2 = e1VarC;
                        mVar3 = mVar2;
                        i88 = i15;
                        i89 = i16;
                        z25 = z16;
                        z26 = z17;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: n1.p1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j2.N(textFieldValue, lVar, mVar3, textStyle3, e1Var2, lVar6, lVar5, solidColor, z19, i88, i89, imeOptions2, l3Var2, z25, z26, qVar2, a6Var2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i25 |= 805306368;
                i56 = i19 & 1024;
                if (i56 != 0) {
                    i57 = i18 | 6;
                } else if ((i18 & 6) == 0) {
                    if (rVarH.c(i16)) {
                        i58 = 4;
                    } else {
                        i58 = 2;
                    }
                    i57 = i18 | i58;
                } else {
                    i57 = i18;
                }
                if ((i18 & 48) != 0) {
                    i57 |= ((i19 & 2048) == 0 || !rVarH.W(imeOptions)) ? 16 : 32;
                }
                i59 = i57;
                i65 = i19 & PKIFailureInfo.certConfirmed;
                if (i65 != 0) {
                    i66 = i59 | MLKEMEngine.KyberPolyBytes;
                } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                    if (rVarH.W(l3Var)) {
                        i67 = 256;
                    } else {
                        i67 = 128;
                    }
                    i66 = i59 | i67;
                } else {
                    i66 = i59;
                }
                i68 = i19 & PKIFailureInfo.certRevoked;
                if (i68 != 0) {
                    i75 = i66 | 3072;
                } else {
                    i69 = i66;
                    if ((i18 & 3072) == 0) {
                        i75 = i69 | (rVarH.a(z16) ? 2048 : 1024);
                    } else {
                        i75 = i69;
                    }
                }
                i76 = i19 & 16384;
                if (i76 != 0) {
                    i78 = i75 | 24576;
                } else {
                    i77 = i75;
                    if ((i18 & 24576) == 0) {
                        if (rVarH.a(z17)) {
                            i29 = 16384;
                        }
                        i78 = i77 | i29;
                    } else {
                        i78 = i77;
                    }
                }
                i79 = i19 & 32768;
                if (i79 != 0) {
                    i78 |= 196608;
                } else if ((i18 & 196608) == 0) {
                    if (rVarH.G(qVar)) {
                        i85 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i85 = 65536;
                    }
                    i78 |= i85;
                }
                i86 = i19 & PKIFailureInfo.notAuthorized;
                if (i86 != 0) {
                    i78 |= 1572864;
                } else if ((i18 & 1572864) == 0) {
                    if (rVarH.W(a6Var)) {
                        i87 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i87 = PKIFailureInfo.signerNotTrusted;
                    }
                    i78 |= i87;
                }
                if ((i25 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (rVarH.r(z18, i25 & 1)) {
                    rVarH.I();
                    if ((i17 & 1) != 0) {
                        if (i104 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i28 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        }
                        if (i36 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.g2
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j2.x((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar4 = (l) objE;
                        }
                        if (i38 != 0) {
                            lVar5 = null;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.h(), null);
                        }
                        if (i47 != 0) {
                            z27 = true;
                        } else {
                            z27 = z15;
                        }
                        if (i49 != 0) {
                            i95 = Integer.MAX_VALUE;
                        } else {
                            i95 = i15;
                        }
                        if (i56 != 0) {
                            i96 = 1;
                        } else {
                            i96 = i16;
                        }
                        if ((i19 & 2048) != 0) {
                            imeOptionsA = ImeOptions.INSTANCE.a();
                            i78 &= -113;
                        } else {
                            imeOptionsA = imeOptions;
                        }
                        if (i65 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var;
                        }
                        if (i68 != 0) {
                            z28 = true;
                        } else {
                            z28 = z16;
                        }
                        if (i76 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if (i79 != 0) {
                            qVarB = g1.f130036a.b();
                        } else {
                            qVarB = qVar;
                        }
                        if (i86 != 0) {
                            a6Var3 = null;
                        } else {
                            a6Var3 = a6Var;
                        }
                        lVar7 = lVar4;
                        imeOptions3 = imeOptionsA;
                        z35 = z27;
                        textStyle2 = textStyleA;
                        mVar4 = mVar2;
                        z36 = z28;
                        z37 = z29;
                    } else {
                        if (i104 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i28 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        }
                        if (i36 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.g2
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j2.x((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar4 = (l) objE;
                        }
                        if (i38 != 0) {
                            lVar5 = null;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.h(), null);
                        }
                        if (i47 != 0) {
                            z27 = true;
                        } else {
                            z27 = z15;
                        }
                        if (i49 != 0) {
                            i95 = Integer.MAX_VALUE;
                        } else {
                            i95 = i15;
                        }
                        if (i56 != 0) {
                            i96 = 1;
                        } else {
                            i96 = i16;
                        }
                        if ((i19 & 2048) != 0) {
                            imeOptionsA = ImeOptions.INSTANCE.a();
                            i78 &= -113;
                        } else {
                            imeOptionsA = imeOptions;
                        }
                        if (i65 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var;
                        }
                        if (i68 != 0) {
                            z28 = true;
                        } else {
                            z28 = z16;
                        }
                        if (i76 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if (i79 != 0) {
                            qVarB = g1.f130036a.b();
                        } else {
                            qVarB = qVar;
                        }
                        if (i86 != 0) {
                            a6Var3 = null;
                        } else {
                            a6Var3 = a6Var;
                        }
                        lVar7 = lVar4;
                        imeOptions3 = imeOptionsA;
                        z35 = z27;
                        textStyle2 = textStyleA;
                        mVar4 = mVar2;
                        z36 = z28;
                        z37 = z29;
                    }
                    rVarH.y();
                    z38 = z35;
                    if (p076m2.t.k()) {
                        p076m2.t.o(31062401, i25, i78, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                    }
                    objE2 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE2 == companion.a()) {
                        objE2 = new d0();
                        rVarH.v(objE2);
                    }
                    d0Var = (d0) objE2;
                    objE3 = rVarH.E();
                    i97 = i25;
                    if (objE3 == companion.a()) {
                        objE3 = l1.b();
                        rVarH.v(objE3);
                    }
                    k1Var = (k1) objE3;
                    objE4 = rVarH.E();
                    cVar2 = solidColor;
                    if (objE4 == companion.a()) {
                        objE4 = new v0(k1Var);
                        rVarH.v(objE4);
                    }
                    v0Var = (v0) objE4;
                    dVar = (c5.d) rVarH.N(g1.f());
                    bVar = (u4.l.b) rVarH.N(g1.h());
                    selectionBackgroundColor = ((SelectionColors) rVarH.N(g3.c())).getSelectionBackgroundColor();
                    oVar = (o) rVarH.N(g1.g());
                    n3Var = (n3) rVarH.N(g1.v());
                    textStyle4 = textStyle2;
                    r2Var = (r2) rVarH.N(g1.r());
                    i98 = i96;
                    if (i95 == 1) {
                        a2Var = p143z0.a2.Vertical;
                    } else {
                        a2Var = p143z0.a2.Vertical;
                    }
                    if (a6Var3 == null) {
                        rVarH.X(-213744626);
                        Object[] objArr4 = {a2Var};
                        b3.x<a6, Object> xVarA4 = a6.INSTANCE.a();
                        zC = rVarH.c(a2Var.ordinal());
                        objE18 = rVarH.E();
                        if (zC) {
                            objE18 = new er.a() { // from class: n1.q1
                                @Override // er.a
                                public final Object a() {
                                    return j2.O(a2Var);
                                }
                            };
                            rVarH.v(objE18);
                        } else {
                            objE18 = new er.a() { // from class: n1.q1
                                @Override // er.a
                                public final Object a() {
                                    return j2.O(a2Var);
                                }
                            };
                            rVarH.v(objE18);
                        }
                        a6Var4 = (a6) b3.f.i(objArr4, xVarA4, (er.a) objE18, rVarH, 0);
                        rVarH.R();
                    } else {
                        rVarH.X(-213745742);
                        rVarH.R();
                        a6Var4 = a6Var3;
                    }
                    if (a6Var4.j() != a2Var) {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("Mismatching scroller orientation; ");
                        if (a2Var == p143z0.a2.Vertical) {
                            str = "only single-line, non-wrap text fields can scroll horizontally";
                        } else {
                            str = "single-line, non-wrap text fields can only scroll horizontally";
                        }
                        sb8.append(str);
                        throw new IllegalArgumentException(sb8.toString());
                    }
                    i99 = i97 & 14;
                    if (i99 == 4) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    if ((i97 & 57344) == 16384) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    z46 = z39 | z45;
                    objE5 = rVarH.E();
                    if (z46) {
                        transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                        composition = textFieldValue.getComposition();
                        if (composition != null) {
                            a6Var5 = a6Var4;
                            transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                            if (transformedTextC2 != null) {
                                objE5 = transformedTextC2;
                            }
                            rVarH.v(objE5);
                        } else {
                            a6Var5 = a6Var4;
                        }
                        objE5 = transformedTextC;
                        rVarH.v(objE5);
                    } else {
                        transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                        composition = textFieldValue.getComposition();
                        if (composition != null) {
                            a6Var5 = a6Var4;
                            transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                            if (transformedTextC2 != null) {
                                objE5 = transformedTextC2;
                            }
                            rVarH.v(objE5);
                        } else {
                            a6Var5 = a6Var4;
                        }
                        objE5 = transformedTextC;
                        rVarH.v(objE5);
                    }
                    TransformedText transformedText4 = (TransformedText) objE5;
                    text = transformedText4.getText();
                    offsetMapping = transformedText4.getOffsetMapping();
                    d4VarC = p076m2.m.c(rVarH, 0);
                    zW = rVarH.W(r2Var);
                    objE6 = rVarH.E();
                    if (zW) {
                        objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                        rVarH.v(objE6);
                    } else {
                        objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                        rVarH.v(objE6);
                    }
                    s3Var = (s3) objE6;
                    s3Var.X(textFieldValue.getText(), text, textStyle4, z38, r55, bVar, lVar, l3VarA, oVar, selectionBackgroundColor);
                    s3Var.getProcessor().e(textFieldValue, s3Var.getInputSession());
                    objE7 = rVarH.E();
                    if (objE7 == companion.a()) {
                        objE7 = new i7(0, 1, null);
                        rVarH.v(objE7);
                    }
                    i7Var = (i7) objE7;
                    i7.f(i7Var, textFieldValue, 0L, 2, null);
                    objE8 = rVarH.E();
                    if (objE8 == companion.a()) {
                        objE8 = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE8);
                    }
                    p0Var = (p0) objE8;
                    objE9 = rVarH.E();
                    if (objE9 == companion.a()) {
                        objE9 = j1.e.a();
                        rVarH.v(objE9);
                    }
                    aVar = (j1.a) objE9;
                    objE10 = rVarH.E();
                    b1.l lVar11 = lVar5;
                    if (objE10 == companion.a()) {
                        objE10 = new c2(i7Var);
                        rVarH.v(objE10);
                    }
                    c2Var = (c2) objE10;
                    c2Var.L0(offsetMapping);
                    c2Var.U0(e1VarC);
                    c2Var.M0(s3Var.r());
                    c2Var.Q0(s3Var);
                    c2Var.T0(textFieldValue);
                    c2Var.z0((androidx.compose.ui.platform.b1) rVarH.N(g1.d()));
                    c2Var.A0(p0Var);
                    c2Var.R0((v2) rVarH.N(g1.s()));
                    c2Var.I0((v3.a) rVarH.N(g1.j()));
                    c2Var.G0(d0Var);
                    c2Var.E0(!z37);
                    c2Var.F0(z36);
                    if (g0.isSmartSelectionEnabled) {
                        rVarH.X(1966756105);
                        c2Var.N0(f0.h(z1.i0.EditableText, textStyle4.w(), rVarH, 6));
                        rVarH.R();
                    } else {
                        rVarH.X(1966902177);
                        rVarH.R();
                    }
                    s3Var.h();
                    new l() { // from class: n1.r1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.y(c2Var, (q4.e) obj);
                        }
                    };
                    new er.a() { // from class: n1.s1
                        @Override // er.a
                        public final Object a() {
                            return j2.z(c2Var);
                        }
                    };
                    new er.a() { // from class: n1.t1
                        @Override // er.a
                        public final Object a() {
                            return j2.A(c2Var);
                        }
                    };
                    companion2 = m.INSTANCE;
                    boolean zG111 = rVarH.G(s3Var);
                    i100 = i78 & 7168;
                    i101 = i78;
                    if (i100 == 2048) {
                        z47 = true;
                    } else {
                        z47 = false;
                    }
                    boolean z712 = z47 | zG111;
                    if ((i101 & 57344) == 16384) {
                        z48 = true;
                    } else {
                        z48 = false;
                    }
                    boolean zG112 = z712 | z48 | rVarH.G(v0Var);
                    if (i99 == 4) {
                        z49 = true;
                    } else {
                        z49 = false;
                    }
                    boolean z8117 = zG112 | z49;
                    i102 = (i101 & 112) ^ 48;
                    if (i102 > 32) {
                        v0Var2 = v0Var;
                        if ((i101 & 48) != 32) {
                            z55 = true;
                        } else {
                            z55 = false;
                        }
                    } else {
                        v0Var2 = v0Var;
                        if ((i101 & 48) != 32) {
                            z55 = true;
                        } else {
                            z55 = false;
                        }
                    }
                    zG = z8117 | z55 | rVarH.G(offsetMapping) | rVarH.G(p0Var) | rVarH.G(aVar) | rVarH.G(c2Var);
                    objE11 = rVarH.E();
                    if (zG) {
                        final ImeOptions imeOptions114 = imeOptions3;
                        i0Var = offsetMapping;
                        final boolean z8118 = z36;
                        final boolean z8119 = z37;
                        objE11 = new l() { // from class: n1.u1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.B(s3Var, z8118, z8119, v0Var2, textFieldValue, imeOptions114, i0Var, c2Var, p0Var, aVar, (l0) obj);
                            }
                        };
                        z56 = z8118;
                        textFieldValue2 = textFieldValue;
                        imeOptions4 = imeOptions114;
                        c2Var2 = c2Var;
                        p0Var2 = p0Var;
                        aVar2 = aVar;
                        rVarH.v(objE11);
                    } else {
                        final ImeOptions imeOptions115 = imeOptions3;
                        i0Var = offsetMapping;
                        final boolean z81110 = z36;
                        final boolean z81111 = z37;
                        objE11 = new l() { // from class: n1.u1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.B(s3Var, z81110, z81111, v0Var2, textFieldValue, imeOptions115, i0Var, c2Var, p0Var, aVar, (l0) obj);
                            }
                        };
                        z56 = z81110;
                        textFieldValue2 = textFieldValue;
                        imeOptions4 = imeOptions115;
                        c2Var2 = c2Var;
                        p0Var2 = p0Var;
                        aVar2 = aVar;
                        rVarH.v(objE11);
                    }
                    final j1.a aVar7 = aVar2;
                    m mVarA113 = v4.a(companion2, z56, d0Var, lVar11, (l) objE11);
                    if (z56) {
                        z57 = false;
                    } else {
                        z57 = false;
                    }
                    Boolean boolValueOf5 = Boolean.valueOf(z57);
                    z58 = z56;
                    f6VarP = x5.p(boolValueOf5, rVarH, 0);
                    i0 i0Var7 = i0.f148189a;
                    boolean zW11 = rVarH.W(f6VarP) | rVarH.G(s3Var) | rVarH.G(v0Var2) | rVarH.G(c2Var2);
                    if (i102 > 32) {
                        imeOptions5 = imeOptions4;
                        if ((i101 & 48) != 32) {
                            z59 = true;
                        } else {
                            z59 = false;
                        }
                    } else {
                        imeOptions5 = imeOptions4;
                        if ((i101 & 48) != 32) {
                            z59 = true;
                        } else {
                            z59 = false;
                        }
                    }
                    z65 = zW11 | z59;
                    objE12 = rVarH.E();
                    if (z65) {
                        ImeOptions imeOptions116 = imeOptions5;
                        objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions116, null);
                        imeOptions6 = imeOptions116;
                        rVarH.v(objE12);
                    } else {
                        ImeOptions imeOptions117 = imeOptions5;
                        objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions117, null);
                        imeOptions6 = imeOptions117;
                        rVarH.v(objE12);
                    }
                    imeOptions7 = imeOptions6;
                    Function0.d(i0Var7, (p) objE12, rVarH, 6);
                    int i1010 = i101 >> 3;
                    c2Var3 = c2Var2;
                    m mVarA114 = k5.a(companion2, c2Var3, z58, lVar11, s3Var, d0Var, z37, i0Var, rVarH, (i1010 & 896) | 196614 | ((i97 >> 9) & 7168) | ((i101 << 6) & 3670016));
                    i0Var2 = i0Var;
                    final m mVarB16 = m2.b(companion2, s3Var, textFieldValue2, i0Var2);
                    boolean zG113 = rVarH.G(s3Var);
                    if (i100 == 2048) {
                        z66 = true;
                    } else {
                        z66 = false;
                    }
                    boolean zW12 = zG113 | z66 | rVarH.W(n3Var) | rVarH.G(c2Var3);
                    if (i99 == 4) {
                        z67 = true;
                    } else {
                        z67 = false;
                    }
                    zG2 = zW12 | z67 | rVarH.G(i0Var2);
                    objE13 = rVarH.E();
                    if (zG2) {
                        final TextFieldValue textFieldValue12 = textFieldValue2;
                        objE13 = new l() { // from class: n1.v1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue12, i0Var2, (b0) obj);
                            }
                        };
                        rVarH.v(objE13);
                    } else {
                        final TextFieldValue textFieldValue13 = textFieldValue2;
                        objE13 = new l() { // from class: n1.v1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue13, i0Var2, (b0) obj);
                            }
                        };
                        rVarH.v(objE13);
                    }
                    final m mVarA115 = p036e4.l1.a(companion2, (l) objE13);
                    CoreTextFieldSemanticsModifier hVar6 = new CoreTextFieldSemanticsModifier(transformedText4, textFieldValue, s3Var, z37, z58, e1VarC instanceof v4.k0, i0Var2, c2Var3, imeOptions7, d0Var);
                    if (z58) {
                        z68 = false;
                    } else {
                        z68 = false;
                    }
                    final m mVarA116 = m2.a(companion2, s3Var, textFieldValue, i0Var2, cVar2, z68);
                    zG3 = rVarH.G(c2Var3);
                    final e1 e1Var8 = e1VarC;
                    objE14 = rVarH.E();
                    if (zG3) {
                        objE14 = new l() { // from class: n1.w1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.E(c2Var3, (s0) obj);
                            }
                        };
                        rVarH.v(objE14);
                    } else {
                        objE14 = new l() { // from class: n1.w1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.E(c2Var3, (s0) obj);
                            }
                        };
                        rVarH.v(objE14);
                    }
                    Function0.a(c2Var3, (l) objE14, rVarH, 0);
                    boolean zG114 = rVarH.G(s3Var) | rVarH.G(v0Var2);
                    if (i99 == 4) {
                        z69 = true;
                    } else {
                        z69 = false;
                    }
                    z75 = z69 | zG114 | ((i102 <= 32 && rVarH.W(imeOptions7)) || (i101 & 48) == 32);
                    objE15 = rVarH.E();
                    if (z75) {
                        objE15 = new l() { // from class: n1.y1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                            }
                        };
                        rVarH.v(objE15);
                    } else {
                        objE15 = new l() { // from class: n1.y1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                            }
                        };
                        rVarH.v(objE15);
                    }
                    Function0.a(imeOptions7, (l) objE15, rVarH, i1010 & 14);
                    l<TextFieldValue, i0> lVarR6 = s3Var.r();
                    boolean z81112 = !z37;
                    i103 = i95;
                    if (i103 == 1) {
                        z76 = true;
                    } else {
                        z76 = false;
                    }
                    m mVarB17 = i5.b(companion2, s3Var, c2Var3, textFieldValue, lVarR6, z81112, z76, i0Var2, i7Var, imeOptions7.getImeAction());
                    keyboardType = imeOptions7.getKeyboardType();
                    companion3 = a0.INSTANCE;
                    if (a0.n(keyboardType, companion3.f())) {
                        z77 = false;
                    } else {
                        z77 = false;
                    }
                    boolean zC7 = C(f6VarP);
                    zA = rVarH.a(z77) | rVarH.G(k1Var);
                    objE16 = rVarH.E();
                    if (zA) {
                        objE16 = new er.a() { // from class: n1.z1
                            @Override // er.a
                            public final Object a() {
                                return j2.G(z77, k1Var);
                            }
                        };
                        rVarH.v(objE16);
                    } else {
                        objE16 = new er.a() { // from class: n1.z1
                            @Override // er.a
                            public final Object a() {
                                return j2.G(z77, k1Var);
                            }
                        };
                        rVarH.v(objE16);
                    }
                    m mVarB18 = v1.b.b(companion2, zC7, z77, (er.a) objE16);
                    cVarE = l.e((androidx.compose.ui.graphics.c) rVarH.N(l.c()), ((Color) rVarH.N(l.d())).m20unboximpl(), m.a());
                    zG4 = rVarH.G(s3Var) | rVarH.W(cVarE);
                    objE17 = rVarH.E();
                    if (zG4) {
                        objE17 = new l() { // from class: n1.h2
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.H(s3Var, cVarE, (c) obj);
                            }
                        };
                        rVarH.v(objE17);
                    } else {
                        objE17 = new l() { // from class: n1.h2
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.H(s3Var, cVarE, (c) obj);
                            }
                        };
                        rVarH.v(objE17);
                    }
                    m mVarD6 = k3.k.d(companion2, (l) objE17);
                    m mVar15 = mVar4;
                    final a6 a6Var11 = a6Var5;
                    m mVarA117 = a0(p036e4.l1.a(u5.f(g0(u4.b(h1.a(mVar15.u(mVarD6), k1Var, s3Var, c2Var3).u(mVarB18).u(mVarA113), s3Var, oVar), s3Var, c2Var3).u(mVarB17), a6Var11, lVar11, z58, x5.a(rVarH, 0)).u(mVarA114).u(hVar6), new l() { // from class: n1.n1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.I(s3Var, (b0) obj);
                        }
                    }), c2Var3, p0Var2);
                    if (!z58) {
                        z78 = false;
                    } else {
                        z78 = false;
                    }
                    if (z78) {
                        mVarZ = c3.z(companion2, c2Var3);
                    } else {
                        mVarZ = companion2;
                    }
                    final m mVar16 = mVarZ;
                    final q qVar8 = qVarB;
                    P(mVarA117, c2Var3, y2.m.d(-814563849, true, new p() { // from class: n1.o1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j2.J(qVar8, s3Var, textStyle4, z38, i98, i103, a6Var11, textFieldValue, e1Var8, mVarA116, mVarB16, mVarA115, mVar16, aVar7, c2Var3, z78, z37, lVar7, i0Var2, dVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    qVar2 = qVar8;
                    i89 = i98;
                    rVar2 = rVarH;
                    e1Var2 = e1Var8;
                    z26 = z37;
                    lVar6 = lVar7;
                    z25 = z58;
                    a6Var2 = a6Var3;
                    solidColor = cVar2;
                    lVar5 = lVar11;
                    l3Var2 = l3VarA;
                    mVar3 = mVar15;
                    i88 = i103;
                    imeOptions2 = imeOptions7;
                    z19 = z38;
                    textStyle3 = textStyle4;
                } else {
                    rVarH.O();
                    z19 = z15;
                    imeOptions2 = imeOptions;
                    l3Var2 = l3Var;
                    qVar2 = qVar;
                    a6Var2 = a6Var;
                    rVar2 = rVarH;
                    textStyle3 = textStyle2;
                    lVar6 = lVar4;
                    e1Var2 = e1VarC;
                    mVar3 = mVar2;
                    i88 = i15;
                    i89 = i16;
                    z25 = z16;
                    z26 = z17;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: n1.p1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j2.N(textFieldValue, lVar, mVar3, textStyle3, e1Var2, lVar6, lVar5, solidColor, z19, i88, i89, imeOptions2, l3Var2, z25, z26, qVar2, a6Var2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i25 |= 3072;
            textStyle2 = textStyle;
            i28 = i19 & 16;
            i29 = PKIFailureInfo.certRevoked;
            if (i28 != 0) {
                if ((i17 & 24576) == 0) {
                    e1VarC = e1Var;
                    if (rVarH.W(e1VarC)) {
                        i35 = 16384;
                    } else {
                        i35 = 8192;
                    }
                    i25 |= i35;
                }
                i36 = i19 & 32;
                if (i36 != 0) {
                    i25 |= 196608;
                    lVar4 = lVar2;
                } else {
                    lVar4 = lVar2;
                    if ((i17 & 196608) == 0) {
                        if (rVarH.G(lVar4)) {
                            i37 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i37 = 65536;
                        }
                        i25 |= i37;
                    }
                }
                i38 = i19 & 64;
                if (i38 != 0) {
                    i25 |= 1572864;
                    lVar5 = lVar3;
                } else {
                    lVar5 = lVar3;
                    if ((i17 & 1572864) == 0) {
                        if (rVarH.W(lVar5)) {
                            i39 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i39 = PKIFailureInfo.signerNotTrusted;
                        }
                        i25 |= i39;
                    }
                }
                i45 = i19 & 128;
                if (i45 != 0) {
                    i25 |= 12582912;
                    solidColor = cVar;
                } else {
                    solidColor = cVar;
                    if ((i17 & 12582912) == 0) {
                        if (rVarH.W(solidColor)) {
                            i46 = 8388608;
                        } else {
                            i46 = 4194304;
                        }
                        i25 |= i46;
                    }
                }
                i47 = i19 & 256;
                if (i47 != 0) {
                    i25 |= 100663296;
                } else if ((i17 & 100663296) == 0) {
                    if (rVarH.a(z15)) {
                        i48 = 67108864;
                    } else {
                        i48 = 33554432;
                    }
                    i25 |= i48;
                }
                i49 = i19 & 512;
                if (i49 != 0) {
                    if ((i17 & 805306368) == 0) {
                        if (rVarH.c(i15)) {
                            i55 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i55 = 268435456;
                        }
                        i25 |= i55;
                    }
                    i56 = i19 & 1024;
                    if (i56 != 0) {
                        i57 = i18 | 6;
                    } else if ((i18 & 6) == 0) {
                        if (rVarH.c(i16)) {
                            i58 = 4;
                        } else {
                            i58 = 2;
                        }
                        i57 = i18 | i58;
                    } else {
                        i57 = i18;
                    }
                    if ((i18 & 48) != 0) {
                        i57 |= ((i19 & 2048) == 0 || !rVarH.W(imeOptions)) ? 16 : 32;
                    }
                    i59 = i57;
                    i65 = i19 & PKIFailureInfo.certConfirmed;
                    if (i65 != 0) {
                        i66 = i59 | MLKEMEngine.KyberPolyBytes;
                    } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                        if (rVarH.W(l3Var)) {
                            i67 = 256;
                        } else {
                            i67 = 128;
                        }
                        i66 = i59 | i67;
                    } else {
                        i66 = i59;
                    }
                    i68 = i19 & PKIFailureInfo.certRevoked;
                    if (i68 != 0) {
                        i75 = i66 | 3072;
                    } else {
                        i69 = i66;
                        if ((i18 & 3072) == 0) {
                            i75 = i69 | (rVarH.a(z16) ? 2048 : 1024);
                        } else {
                            i75 = i69;
                        }
                    }
                    i76 = i19 & 16384;
                    if (i76 != 0) {
                        i78 = i75 | 24576;
                    } else {
                        i77 = i75;
                        if ((i18 & 24576) == 0) {
                            if (rVarH.a(z17)) {
                                i29 = 16384;
                            }
                            i78 = i77 | i29;
                        } else {
                            i78 = i77;
                        }
                    }
                    i79 = i19 & 32768;
                    if (i79 != 0) {
                        i78 |= 196608;
                    } else if ((i18 & 196608) == 0) {
                        if (rVarH.G(qVar)) {
                            i85 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i85 = 65536;
                        }
                        i78 |= i85;
                    }
                    i86 = i19 & PKIFailureInfo.notAuthorized;
                    if (i86 != 0) {
                        i78 |= 1572864;
                    } else if ((i18 & 1572864) == 0) {
                        if (rVarH.W(a6Var)) {
                            i87 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i87 = PKIFailureInfo.signerNotTrusted;
                        }
                        i78 |= i87;
                    }
                    if ((i25 & 306783379) == 306783378) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if (rVarH.r(z18, i25 & 1)) {
                        rVarH.I();
                        if ((i17 & 1) != 0) {
                            if (i104 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i26 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i28 != 0) {
                                e1VarC = e1.INSTANCE.c();
                            }
                            if (i36 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: n1.g2
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return j2.x((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar4 = (l) objE;
                            }
                            if (i38 != 0) {
                                lVar5 = null;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.h(), null);
                            }
                            if (i47 != 0) {
                                z27 = true;
                            } else {
                                z27 = z15;
                            }
                            if (i49 != 0) {
                                i95 = Integer.MAX_VALUE;
                            } else {
                                i95 = i15;
                            }
                            if (i56 != 0) {
                                i96 = 1;
                            } else {
                                i96 = i16;
                            }
                            if ((i19 & 2048) != 0) {
                                imeOptionsA = ImeOptions.INSTANCE.a();
                                i78 &= -113;
                            } else {
                                imeOptionsA = imeOptions;
                            }
                            if (i65 != 0) {
                                l3VarA = l3.INSTANCE.a();
                            } else {
                                l3VarA = l3Var;
                            }
                            if (i68 != 0) {
                                z28 = true;
                            } else {
                                z28 = z16;
                            }
                            if (i76 != 0) {
                                z29 = false;
                            } else {
                                z29 = z17;
                            }
                            if (i79 != 0) {
                                qVarB = g1.f130036a.b();
                            } else {
                                qVarB = qVar;
                            }
                            if (i86 != 0) {
                                a6Var3 = null;
                            } else {
                                a6Var3 = a6Var;
                            }
                            lVar7 = lVar4;
                            imeOptions3 = imeOptionsA;
                            z35 = z27;
                            textStyle2 = textStyleA;
                            mVar4 = mVar2;
                            z36 = z28;
                            z37 = z29;
                        } else {
                            if (i104 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i26 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i28 != 0) {
                                e1VarC = e1.INSTANCE.c();
                            }
                            if (i36 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: n1.g2
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return j2.x((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar4 = (l) objE;
                            }
                            if (i38 != 0) {
                                lVar5 = null;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.h(), null);
                            }
                            if (i47 != 0) {
                                z27 = true;
                            } else {
                                z27 = z15;
                            }
                            if (i49 != 0) {
                                i95 = Integer.MAX_VALUE;
                            } else {
                                i95 = i15;
                            }
                            if (i56 != 0) {
                                i96 = 1;
                            } else {
                                i96 = i16;
                            }
                            if ((i19 & 2048) != 0) {
                                imeOptionsA = ImeOptions.INSTANCE.a();
                                i78 &= -113;
                            } else {
                                imeOptionsA = imeOptions;
                            }
                            if (i65 != 0) {
                                l3VarA = l3.INSTANCE.a();
                            } else {
                                l3VarA = l3Var;
                            }
                            if (i68 != 0) {
                                z28 = true;
                            } else {
                                z28 = z16;
                            }
                            if (i76 != 0) {
                                z29 = false;
                            } else {
                                z29 = z17;
                            }
                            if (i79 != 0) {
                                qVarB = g1.f130036a.b();
                            } else {
                                qVarB = qVar;
                            }
                            if (i86 != 0) {
                                a6Var3 = null;
                            } else {
                                a6Var3 = a6Var;
                            }
                            lVar7 = lVar4;
                            imeOptions3 = imeOptionsA;
                            z35 = z27;
                            textStyle2 = textStyleA;
                            mVar4 = mVar2;
                            z36 = z28;
                            z37 = z29;
                        }
                        rVarH.y();
                        z38 = z35;
                        if (p076m2.t.k()) {
                            p076m2.t.o(31062401, i25, i78, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                        }
                        objE2 = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE2 == companion.a()) {
                            objE2 = new d0();
                            rVarH.v(objE2);
                        }
                        d0Var = (d0) objE2;
                        objE3 = rVarH.E();
                        i97 = i25;
                        if (objE3 == companion.a()) {
                            objE3 = l1.b();
                            rVarH.v(objE3);
                        }
                        k1Var = (k1) objE3;
                        objE4 = rVarH.E();
                        cVar2 = solidColor;
                        if (objE4 == companion.a()) {
                            objE4 = new v0(k1Var);
                            rVarH.v(objE4);
                        }
                        v0Var = (v0) objE4;
                        dVar = (c5.d) rVarH.N(g1.f());
                        bVar = (u4.l.b) rVarH.N(g1.h());
                        selectionBackgroundColor = ((SelectionColors) rVarH.N(g3.c())).getSelectionBackgroundColor();
                        oVar = (o) rVarH.N(g1.g());
                        n3Var = (n3) rVarH.N(g1.v());
                        textStyle4 = textStyle2;
                        r2Var = (r2) rVarH.N(g1.r());
                        i98 = i96;
                        if (i95 == 1) {
                            a2Var = p143z0.a2.Vertical;
                        } else {
                            a2Var = p143z0.a2.Vertical;
                        }
                        if (a6Var3 == null) {
                            rVarH.X(-213744626);
                            Object[] objArr5 = {a2Var};
                            b3.x<a6, Object> xVarA5 = a6.INSTANCE.a();
                            zC = rVarH.c(a2Var.ordinal());
                            objE18 = rVarH.E();
                            if (zC) {
                                objE18 = new er.a() { // from class: n1.q1
                                    @Override // er.a
                                    public final Object a() {
                                        return j2.O(a2Var);
                                    }
                                };
                                rVarH.v(objE18);
                            } else {
                                objE18 = new er.a() { // from class: n1.q1
                                    @Override // er.a
                                    public final Object a() {
                                        return j2.O(a2Var);
                                    }
                                };
                                rVarH.v(objE18);
                            }
                            a6Var4 = (a6) b3.f.i(objArr5, xVarA5, (er.a) objE18, rVarH, 0);
                            rVarH.R();
                        } else {
                            rVarH.X(-213745742);
                            rVarH.R();
                            a6Var4 = a6Var3;
                        }
                        if (a6Var4.j() != a2Var) {
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append("Mismatching scroller orientation; ");
                            if (a2Var == p143z0.a2.Vertical) {
                                str = "only single-line, non-wrap text fields can scroll horizontally";
                            } else {
                                str = "single-line, non-wrap text fields can only scroll horizontally";
                            }
                            sb9.append(str);
                            throw new IllegalArgumentException(sb9.toString());
                        }
                        i99 = i97 & 14;
                        if (i99 == 4) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        if ((i97 & 57344) == 16384) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        z46 = z39 | z45;
                        objE5 = rVarH.E();
                        if (z46) {
                            transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                            composition = textFieldValue.getComposition();
                            if (composition != null) {
                                a6Var5 = a6Var4;
                                transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                if (transformedTextC2 != null) {
                                    objE5 = transformedTextC2;
                                }
                                rVarH.v(objE5);
                            } else {
                                a6Var5 = a6Var4;
                            }
                            objE5 = transformedTextC;
                            rVarH.v(objE5);
                        } else {
                            transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                            composition = textFieldValue.getComposition();
                            if (composition != null) {
                                a6Var5 = a6Var4;
                                transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                if (transformedTextC2 != null) {
                                    objE5 = transformedTextC2;
                                }
                                rVarH.v(objE5);
                            } else {
                                a6Var5 = a6Var4;
                            }
                            objE5 = transformedTextC;
                            rVarH.v(objE5);
                        }
                        TransformedText transformedText5 = (TransformedText) objE5;
                        text = transformedText5.getText();
                        offsetMapping = transformedText5.getOffsetMapping();
                        d4VarC = p076m2.m.c(rVarH, 0);
                        zW = rVarH.W(r2Var);
                        objE6 = rVarH.E();
                        if (zW) {
                            objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                            rVarH.v(objE6);
                        } else {
                            objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                            rVarH.v(objE6);
                        }
                        s3Var = (s3) objE6;
                        s3Var.X(textFieldValue.getText(), text, textStyle4, z38, r55, bVar, lVar, l3VarA, oVar, selectionBackgroundColor);
                        s3Var.getProcessor().e(textFieldValue, s3Var.getInputSession());
                        objE7 = rVarH.E();
                        if (objE7 == companion.a()) {
                            objE7 = new i7(0, 1, null);
                            rVarH.v(objE7);
                        }
                        i7Var = (i7) objE7;
                        i7.f(i7Var, textFieldValue, 0L, 2, null);
                        objE8 = rVarH.E();
                        if (objE8 == companion.a()) {
                            objE8 = Function0.i(tq.j.f191408a, rVarH);
                            rVarH.v(objE8);
                        }
                        p0Var = (p0) objE8;
                        objE9 = rVarH.E();
                        if (objE9 == companion.a()) {
                            objE9 = j1.e.a();
                            rVarH.v(objE9);
                        }
                        aVar = (j1.a) objE9;
                        objE10 = rVarH.E();
                        b1.l lVar12 = lVar5;
                        if (objE10 == companion.a()) {
                            objE10 = new c2(i7Var);
                            rVarH.v(objE10);
                        }
                        c2Var = (c2) objE10;
                        c2Var.L0(offsetMapping);
                        c2Var.U0(e1VarC);
                        c2Var.M0(s3Var.r());
                        c2Var.Q0(s3Var);
                        c2Var.T0(textFieldValue);
                        c2Var.z0((androidx.compose.ui.platform.b1) rVarH.N(g1.d()));
                        c2Var.A0(p0Var);
                        c2Var.R0((v2) rVarH.N(g1.s()));
                        c2Var.I0((v3.a) rVarH.N(g1.j()));
                        c2Var.G0(d0Var);
                        c2Var.E0(!z37);
                        c2Var.F0(z36);
                        if (g0.isSmartSelectionEnabled) {
                            rVarH.X(1966756105);
                            c2Var.N0(f0.h(z1.i0.EditableText, textStyle4.w(), rVarH, 6));
                            rVarH.R();
                        } else {
                            rVarH.X(1966902177);
                            rVarH.R();
                        }
                        s3Var.h();
                        new l() { // from class: n1.r1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.y(c2Var, (q4.e) obj);
                            }
                        };
                        new er.a() { // from class: n1.s1
                            @Override // er.a
                            public final Object a() {
                                return j2.z(c2Var);
                            }
                        };
                        new er.a() { // from class: n1.t1
                            @Override // er.a
                            public final Object a() {
                                return j2.A(c2Var);
                            }
                        };
                        companion2 = m.INSTANCE;
                        boolean zG115 = rVarH.G(s3Var);
                        i100 = i78 & 7168;
                        i101 = i78;
                        if (i100 == 2048) {
                            z47 = true;
                        } else {
                            z47 = false;
                        }
                        boolean z713 = z47 | zG115;
                        if ((i101 & 57344) == 16384) {
                            z48 = true;
                        } else {
                            z48 = false;
                        }
                        boolean zG116 = z713 | z48 | rVarH.G(v0Var);
                        if (i99 == 4) {
                            z49 = true;
                        } else {
                            z49 = false;
                        }
                        boolean z81113 = zG116 | z49;
                        i102 = (i101 & 112) ^ 48;
                        if (i102 > 32) {
                            v0Var2 = v0Var;
                            if ((i101 & 48) != 32) {
                                z55 = true;
                            } else {
                                z55 = false;
                            }
                        } else {
                            v0Var2 = v0Var;
                            if ((i101 & 48) != 32) {
                                z55 = true;
                            } else {
                                z55 = false;
                            }
                        }
                        zG = z81113 | z55 | rVarH.G(offsetMapping) | rVarH.G(p0Var) | rVarH.G(aVar) | rVarH.G(c2Var);
                        objE11 = rVarH.E();
                        if (zG) {
                            final ImeOptions imeOptions118 = imeOptions3;
                            i0Var = offsetMapping;
                            final boolean z81114 = z36;
                            final boolean z81115 = z37;
                            objE11 = new l() { // from class: n1.u1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.B(s3Var, z81114, z81115, v0Var2, textFieldValue, imeOptions118, i0Var, c2Var, p0Var, aVar, (l0) obj);
                                }
                            };
                            z56 = z81114;
                            textFieldValue2 = textFieldValue;
                            imeOptions4 = imeOptions118;
                            c2Var2 = c2Var;
                            p0Var2 = p0Var;
                            aVar2 = aVar;
                            rVarH.v(objE11);
                        } else {
                            final ImeOptions imeOptions119 = imeOptions3;
                            i0Var = offsetMapping;
                            final boolean z81116 = z36;
                            final boolean z81117 = z37;
                            objE11 = new l() { // from class: n1.u1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.B(s3Var, z81116, z81117, v0Var2, textFieldValue, imeOptions119, i0Var, c2Var, p0Var, aVar, (l0) obj);
                                }
                            };
                            z56 = z81116;
                            textFieldValue2 = textFieldValue;
                            imeOptions4 = imeOptions119;
                            c2Var2 = c2Var;
                            p0Var2 = p0Var;
                            aVar2 = aVar;
                            rVarH.v(objE11);
                        }
                        final j1.a aVar8 = aVar2;
                        m mVarA118 = v4.a(companion2, z56, d0Var, lVar12, (l) objE11);
                        if (z56) {
                            z57 = false;
                        } else {
                            z57 = false;
                        }
                        Boolean boolValueOf6 = Boolean.valueOf(z57);
                        z58 = z56;
                        f6VarP = x5.p(boolValueOf6, rVarH, 0);
                        i0 i0Var8 = i0.f148189a;
                        boolean zW13 = rVarH.W(f6VarP) | rVarH.G(s3Var) | rVarH.G(v0Var2) | rVarH.G(c2Var2);
                        if (i102 > 32) {
                            imeOptions5 = imeOptions4;
                            if ((i101 & 48) != 32) {
                                z59 = true;
                            } else {
                                z59 = false;
                            }
                        } else {
                            imeOptions5 = imeOptions4;
                            if ((i101 & 48) != 32) {
                                z59 = true;
                            } else {
                                z59 = false;
                            }
                        }
                        z65 = zW13 | z59;
                        objE12 = rVarH.E();
                        if (z65) {
                            ImeOptions imeOptions1110 = imeOptions5;
                            objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions1110, null);
                            imeOptions6 = imeOptions1110;
                            rVarH.v(objE12);
                        } else {
                            ImeOptions imeOptions1111 = imeOptions5;
                            objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions1111, null);
                            imeOptions6 = imeOptions1111;
                            rVarH.v(objE12);
                        }
                        imeOptions7 = imeOptions6;
                        Function0.d(i0Var8, (p) objE12, rVarH, 6);
                        int i1011 = i101 >> 3;
                        c2Var3 = c2Var2;
                        m mVarA119 = k5.a(companion2, c2Var3, z58, lVar12, s3Var, d0Var, z37, i0Var, rVarH, (i1011 & 896) | 196614 | ((i97 >> 9) & 7168) | ((i101 << 6) & 3670016));
                        i0Var2 = i0Var;
                        final m mVarB19 = m2.b(companion2, s3Var, textFieldValue2, i0Var2);
                        boolean zG117 = rVarH.G(s3Var);
                        if (i100 == 2048) {
                            z66 = true;
                        } else {
                            z66 = false;
                        }
                        boolean zW14 = zG117 | z66 | rVarH.W(n3Var) | rVarH.G(c2Var3);
                        if (i99 == 4) {
                            z67 = true;
                        } else {
                            z67 = false;
                        }
                        zG2 = zW14 | z67 | rVarH.G(i0Var2);
                        objE13 = rVarH.E();
                        if (zG2) {
                            final TextFieldValue textFieldValue14 = textFieldValue2;
                            objE13 = new l() { // from class: n1.v1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue14, i0Var2, (b0) obj);
                                }
                            };
                            rVarH.v(objE13);
                        } else {
                            final TextFieldValue textFieldValue15 = textFieldValue2;
                            objE13 = new l() { // from class: n1.v1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue15, i0Var2, (b0) obj);
                                }
                            };
                            rVarH.v(objE13);
                        }
                        final m mVarA1110 = p036e4.l1.a(companion2, (l) objE13);
                        CoreTextFieldSemanticsModifier hVar7 = new CoreTextFieldSemanticsModifier(transformedText5, textFieldValue, s3Var, z37, z58, e1VarC instanceof v4.k0, i0Var2, c2Var3, imeOptions7, d0Var);
                        if (z58) {
                            z68 = false;
                        } else {
                            z68 = false;
                        }
                        final m mVarA1111 = m2.a(companion2, s3Var, textFieldValue, i0Var2, cVar2, z68);
                        zG3 = rVarH.G(c2Var3);
                        final e1 e1Var9 = e1VarC;
                        objE14 = rVarH.E();
                        if (zG3) {
                            objE14 = new l() { // from class: n1.w1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.E(c2Var3, (s0) obj);
                                }
                            };
                            rVarH.v(objE14);
                        } else {
                            objE14 = new l() { // from class: n1.w1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.E(c2Var3, (s0) obj);
                                }
                            };
                            rVarH.v(objE14);
                        }
                        Function0.a(c2Var3, (l) objE14, rVarH, 0);
                        boolean zG118 = rVarH.G(s3Var) | rVarH.G(v0Var2);
                        if (i99 == 4) {
                            z69 = true;
                        } else {
                            z69 = false;
                        }
                        z75 = z69 | zG118 | ((i102 <= 32 && rVarH.W(imeOptions7)) || (i101 & 48) == 32);
                        objE15 = rVarH.E();
                        if (z75) {
                            objE15 = new l() { // from class: n1.y1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                                }
                            };
                            rVarH.v(objE15);
                        } else {
                            objE15 = new l() { // from class: n1.y1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                                }
                            };
                            rVarH.v(objE15);
                        }
                        Function0.a(imeOptions7, (l) objE15, rVarH, i1011 & 14);
                        l<TextFieldValue, i0> lVarR7 = s3Var.r();
                        boolean z81118 = !z37;
                        i103 = i95;
                        if (i103 == 1) {
                            z76 = true;
                        } else {
                            z76 = false;
                        }
                        m mVarB110 = i5.b(companion2, s3Var, c2Var3, textFieldValue, lVarR7, z81118, z76, i0Var2, i7Var, imeOptions7.getImeAction());
                        keyboardType = imeOptions7.getKeyboardType();
                        companion3 = a0.INSTANCE;
                        if (a0.n(keyboardType, companion3.f())) {
                            z77 = false;
                        } else {
                            z77 = false;
                        }
                        boolean zC8 = C(f6VarP);
                        zA = rVarH.a(z77) | rVarH.G(k1Var);
                        objE16 = rVarH.E();
                        if (zA) {
                            objE16 = new er.a() { // from class: n1.z1
                                @Override // er.a
                                public final Object a() {
                                    return j2.G(z77, k1Var);
                                }
                            };
                            rVarH.v(objE16);
                        } else {
                            objE16 = new er.a() { // from class: n1.z1
                                @Override // er.a
                                public final Object a() {
                                    return j2.G(z77, k1Var);
                                }
                            };
                            rVarH.v(objE16);
                        }
                        m mVarB111 = v1.b.b(companion2, zC8, z77, (er.a) objE16);
                        cVarE = l.e((androidx.compose.ui.graphics.c) rVarH.N(l.c()), ((Color) rVarH.N(l.d())).m20unboximpl(), m.a());
                        zG4 = rVarH.G(s3Var) | rVarH.W(cVarE);
                        objE17 = rVarH.E();
                        if (zG4) {
                            objE17 = new l() { // from class: n1.h2
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.H(s3Var, cVarE, (c) obj);
                                }
                            };
                            rVarH.v(objE17);
                        } else {
                            objE17 = new l() { // from class: n1.h2
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.H(s3Var, cVarE, (c) obj);
                                }
                            };
                            rVarH.v(objE17);
                        }
                        m mVarD7 = k3.k.d(companion2, (l) objE17);
                        m mVar17 = mVar4;
                        final a6 a6Var12 = a6Var5;
                        m mVarA1112 = a0(p036e4.l1.a(u5.f(g0(u4.b(h1.a(mVar17.u(mVarD7), k1Var, s3Var, c2Var3).u(mVarB111).u(mVarA118), s3Var, oVar), s3Var, c2Var3).u(mVarB110), a6Var12, lVar12, z58, x5.a(rVarH, 0)).u(mVarA119).u(hVar7), new l() { // from class: n1.n1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.I(s3Var, (b0) obj);
                            }
                        }), c2Var3, p0Var2);
                        if (!z58) {
                            z78 = false;
                        } else {
                            z78 = false;
                        }
                        if (z78) {
                            mVarZ = c3.z(companion2, c2Var3);
                        } else {
                            mVarZ = companion2;
                        }
                        final m mVar18 = mVarZ;
                        final q qVar9 = qVarB;
                        P(mVarA1112, c2Var3, y2.m.d(-814563849, true, new p() { // from class: n1.o1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j2.J(qVar9, s3Var, textStyle4, z38, i98, i103, a6Var12, textFieldValue, e1Var9, mVarA1111, mVarB19, mVarA1110, mVar18, aVar8, c2Var3, z78, z37, lVar7, i0Var2, dVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        qVar2 = qVar9;
                        i89 = i98;
                        rVar2 = rVarH;
                        e1Var2 = e1Var9;
                        z26 = z37;
                        lVar6 = lVar7;
                        z25 = z58;
                        a6Var2 = a6Var3;
                        solidColor = cVar2;
                        lVar5 = lVar12;
                        l3Var2 = l3VarA;
                        mVar3 = mVar17;
                        i88 = i103;
                        imeOptions2 = imeOptions7;
                        z19 = z38;
                        textStyle3 = textStyle4;
                    } else {
                        rVarH.O();
                        z19 = z15;
                        imeOptions2 = imeOptions;
                        l3Var2 = l3Var;
                        qVar2 = qVar;
                        a6Var2 = a6Var;
                        rVar2 = rVarH;
                        textStyle3 = textStyle2;
                        lVar6 = lVar4;
                        e1Var2 = e1VarC;
                        mVar3 = mVar2;
                        i88 = i15;
                        i89 = i16;
                        z25 = z16;
                        z26 = z17;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: n1.p1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j2.N(textFieldValue, lVar, mVar3, textStyle3, e1Var2, lVar6, lVar5, solidColor, z19, i88, i89, imeOptions2, l3Var2, z25, z26, qVar2, a6Var2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i25 |= 805306368;
                i56 = i19 & 1024;
                if (i56 != 0) {
                    i57 = i18 | 6;
                } else if ((i18 & 6) == 0) {
                    if (rVarH.c(i16)) {
                        i58 = 4;
                    } else {
                        i58 = 2;
                    }
                    i57 = i18 | i58;
                } else {
                    i57 = i18;
                }
                if ((i18 & 48) != 0) {
                    i57 |= ((i19 & 2048) == 0 || !rVarH.W(imeOptions)) ? 16 : 32;
                }
                i59 = i57;
                i65 = i19 & PKIFailureInfo.certConfirmed;
                if (i65 != 0) {
                    i66 = i59 | MLKEMEngine.KyberPolyBytes;
                } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                    if (rVarH.W(l3Var)) {
                        i67 = 256;
                    } else {
                        i67 = 128;
                    }
                    i66 = i59 | i67;
                } else {
                    i66 = i59;
                }
                i68 = i19 & PKIFailureInfo.certRevoked;
                if (i68 != 0) {
                    i75 = i66 | 3072;
                } else {
                    i69 = i66;
                    if ((i18 & 3072) == 0) {
                        i75 = i69 | (rVarH.a(z16) ? 2048 : 1024);
                    } else {
                        i75 = i69;
                    }
                }
                i76 = i19 & 16384;
                if (i76 != 0) {
                    i78 = i75 | 24576;
                } else {
                    i77 = i75;
                    if ((i18 & 24576) == 0) {
                        if (rVarH.a(z17)) {
                            i29 = 16384;
                        }
                        i78 = i77 | i29;
                    } else {
                        i78 = i77;
                    }
                }
                i79 = i19 & 32768;
                if (i79 != 0) {
                    i78 |= 196608;
                } else if ((i18 & 196608) == 0) {
                    if (rVarH.G(qVar)) {
                        i85 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i85 = 65536;
                    }
                    i78 |= i85;
                }
                i86 = i19 & PKIFailureInfo.notAuthorized;
                if (i86 != 0) {
                    i78 |= 1572864;
                } else if ((i18 & 1572864) == 0) {
                    if (rVarH.W(a6Var)) {
                        i87 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i87 = PKIFailureInfo.signerNotTrusted;
                    }
                    i78 |= i87;
                }
                if ((i25 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (rVarH.r(z18, i25 & 1)) {
                    rVarH.I();
                    if ((i17 & 1) != 0) {
                        if (i104 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i28 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        }
                        if (i36 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.g2
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j2.x((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar4 = (l) objE;
                        }
                        if (i38 != 0) {
                            lVar5 = null;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.h(), null);
                        }
                        if (i47 != 0) {
                            z27 = true;
                        } else {
                            z27 = z15;
                        }
                        if (i49 != 0) {
                            i95 = Integer.MAX_VALUE;
                        } else {
                            i95 = i15;
                        }
                        if (i56 != 0) {
                            i96 = 1;
                        } else {
                            i96 = i16;
                        }
                        if ((i19 & 2048) != 0) {
                            imeOptionsA = ImeOptions.INSTANCE.a();
                            i78 &= -113;
                        } else {
                            imeOptionsA = imeOptions;
                        }
                        if (i65 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var;
                        }
                        if (i68 != 0) {
                            z28 = true;
                        } else {
                            z28 = z16;
                        }
                        if (i76 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if (i79 != 0) {
                            qVarB = g1.f130036a.b();
                        } else {
                            qVarB = qVar;
                        }
                        if (i86 != 0) {
                            a6Var3 = null;
                        } else {
                            a6Var3 = a6Var;
                        }
                        lVar7 = lVar4;
                        imeOptions3 = imeOptionsA;
                        z35 = z27;
                        textStyle2 = textStyleA;
                        mVar4 = mVar2;
                        z36 = z28;
                        z37 = z29;
                    } else {
                        if (i104 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i28 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        }
                        if (i36 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.g2
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j2.x((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar4 = (l) objE;
                        }
                        if (i38 != 0) {
                            lVar5 = null;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.h(), null);
                        }
                        if (i47 != 0) {
                            z27 = true;
                        } else {
                            z27 = z15;
                        }
                        if (i49 != 0) {
                            i95 = Integer.MAX_VALUE;
                        } else {
                            i95 = i15;
                        }
                        if (i56 != 0) {
                            i96 = 1;
                        } else {
                            i96 = i16;
                        }
                        if ((i19 & 2048) != 0) {
                            imeOptionsA = ImeOptions.INSTANCE.a();
                            i78 &= -113;
                        } else {
                            imeOptionsA = imeOptions;
                        }
                        if (i65 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var;
                        }
                        if (i68 != 0) {
                            z28 = true;
                        } else {
                            z28 = z16;
                        }
                        if (i76 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if (i79 != 0) {
                            qVarB = g1.f130036a.b();
                        } else {
                            qVarB = qVar;
                        }
                        if (i86 != 0) {
                            a6Var3 = null;
                        } else {
                            a6Var3 = a6Var;
                        }
                        lVar7 = lVar4;
                        imeOptions3 = imeOptionsA;
                        z35 = z27;
                        textStyle2 = textStyleA;
                        mVar4 = mVar2;
                        z36 = z28;
                        z37 = z29;
                    }
                    rVarH.y();
                    z38 = z35;
                    if (p076m2.t.k()) {
                        p076m2.t.o(31062401, i25, i78, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                    }
                    objE2 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE2 == companion.a()) {
                        objE2 = new d0();
                        rVarH.v(objE2);
                    }
                    d0Var = (d0) objE2;
                    objE3 = rVarH.E();
                    i97 = i25;
                    if (objE3 == companion.a()) {
                        objE3 = l1.b();
                        rVarH.v(objE3);
                    }
                    k1Var = (k1) objE3;
                    objE4 = rVarH.E();
                    cVar2 = solidColor;
                    if (objE4 == companion.a()) {
                        objE4 = new v0(k1Var);
                        rVarH.v(objE4);
                    }
                    v0Var = (v0) objE4;
                    dVar = (c5.d) rVarH.N(g1.f());
                    bVar = (u4.l.b) rVarH.N(g1.h());
                    selectionBackgroundColor = ((SelectionColors) rVarH.N(g3.c())).getSelectionBackgroundColor();
                    oVar = (o) rVarH.N(g1.g());
                    n3Var = (n3) rVarH.N(g1.v());
                    textStyle4 = textStyle2;
                    r2Var = (r2) rVarH.N(g1.r());
                    i98 = i96;
                    if (i95 == 1) {
                        a2Var = p143z0.a2.Vertical;
                    } else {
                        a2Var = p143z0.a2.Vertical;
                    }
                    if (a6Var3 == null) {
                        rVarH.X(-213744626);
                        Object[] objArr6 = {a2Var};
                        b3.x<a6, Object> xVarA6 = a6.INSTANCE.a();
                        zC = rVarH.c(a2Var.ordinal());
                        objE18 = rVarH.E();
                        if (zC) {
                            objE18 = new er.a() { // from class: n1.q1
                                @Override // er.a
                                public final Object a() {
                                    return j2.O(a2Var);
                                }
                            };
                            rVarH.v(objE18);
                        } else {
                            objE18 = new er.a() { // from class: n1.q1
                                @Override // er.a
                                public final Object a() {
                                    return j2.O(a2Var);
                                }
                            };
                            rVarH.v(objE18);
                        }
                        a6Var4 = (a6) b3.f.i(objArr6, xVarA6, (er.a) objE18, rVarH, 0);
                        rVarH.R();
                    } else {
                        rVarH.X(-213745742);
                        rVarH.R();
                        a6Var4 = a6Var3;
                    }
                    if (a6Var4.j() != a2Var) {
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append("Mismatching scroller orientation; ");
                        if (a2Var == p143z0.a2.Vertical) {
                            str = "only single-line, non-wrap text fields can scroll horizontally";
                        } else {
                            str = "single-line, non-wrap text fields can only scroll horizontally";
                        }
                        sb10.append(str);
                        throw new IllegalArgumentException(sb10.toString());
                    }
                    i99 = i97 & 14;
                    if (i99 == 4) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    if ((i97 & 57344) == 16384) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    z46 = z39 | z45;
                    objE5 = rVarH.E();
                    if (z46) {
                        transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                        composition = textFieldValue.getComposition();
                        if (composition != null) {
                            a6Var5 = a6Var4;
                            transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                            if (transformedTextC2 != null) {
                                objE5 = transformedTextC2;
                            }
                            rVarH.v(objE5);
                        } else {
                            a6Var5 = a6Var4;
                        }
                        objE5 = transformedTextC;
                        rVarH.v(objE5);
                    } else {
                        transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                        composition = textFieldValue.getComposition();
                        if (composition != null) {
                            a6Var5 = a6Var4;
                            transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                            if (transformedTextC2 != null) {
                                objE5 = transformedTextC2;
                            }
                            rVarH.v(objE5);
                        } else {
                            a6Var5 = a6Var4;
                        }
                        objE5 = transformedTextC;
                        rVarH.v(objE5);
                    }
                    TransformedText transformedText6 = (TransformedText) objE5;
                    text = transformedText6.getText();
                    offsetMapping = transformedText6.getOffsetMapping();
                    d4VarC = p076m2.m.c(rVarH, 0);
                    zW = rVarH.W(r2Var);
                    objE6 = rVarH.E();
                    if (zW) {
                        objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                        rVarH.v(objE6);
                    } else {
                        objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                        rVarH.v(objE6);
                    }
                    s3Var = (s3) objE6;
                    s3Var.X(textFieldValue.getText(), text, textStyle4, z38, r55, bVar, lVar, l3VarA, oVar, selectionBackgroundColor);
                    s3Var.getProcessor().e(textFieldValue, s3Var.getInputSession());
                    objE7 = rVarH.E();
                    if (objE7 == companion.a()) {
                        objE7 = new i7(0, 1, null);
                        rVarH.v(objE7);
                    }
                    i7Var = (i7) objE7;
                    i7.f(i7Var, textFieldValue, 0L, 2, null);
                    objE8 = rVarH.E();
                    if (objE8 == companion.a()) {
                        objE8 = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE8);
                    }
                    p0Var = (p0) objE8;
                    objE9 = rVarH.E();
                    if (objE9 == companion.a()) {
                        objE9 = j1.e.a();
                        rVarH.v(objE9);
                    }
                    aVar = (j1.a) objE9;
                    objE10 = rVarH.E();
                    b1.l lVar13 = lVar5;
                    if (objE10 == companion.a()) {
                        objE10 = new c2(i7Var);
                        rVarH.v(objE10);
                    }
                    c2Var = (c2) objE10;
                    c2Var.L0(offsetMapping);
                    c2Var.U0(e1VarC);
                    c2Var.M0(s3Var.r());
                    c2Var.Q0(s3Var);
                    c2Var.T0(textFieldValue);
                    c2Var.z0((androidx.compose.ui.platform.b1) rVarH.N(g1.d()));
                    c2Var.A0(p0Var);
                    c2Var.R0((v2) rVarH.N(g1.s()));
                    c2Var.I0((v3.a) rVarH.N(g1.j()));
                    c2Var.G0(d0Var);
                    c2Var.E0(!z37);
                    c2Var.F0(z36);
                    if (g0.isSmartSelectionEnabled) {
                        rVarH.X(1966756105);
                        c2Var.N0(f0.h(z1.i0.EditableText, textStyle4.w(), rVarH, 6));
                        rVarH.R();
                    } else {
                        rVarH.X(1966902177);
                        rVarH.R();
                    }
                    s3Var.h();
                    new l() { // from class: n1.r1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.y(c2Var, (q4.e) obj);
                        }
                    };
                    new er.a() { // from class: n1.s1
                        @Override // er.a
                        public final Object a() {
                            return j2.z(c2Var);
                        }
                    };
                    new er.a() { // from class: n1.t1
                        @Override // er.a
                        public final Object a() {
                            return j2.A(c2Var);
                        }
                    };
                    companion2 = m.INSTANCE;
                    boolean zG119 = rVarH.G(s3Var);
                    i100 = i78 & 7168;
                    i101 = i78;
                    if (i100 == 2048) {
                        z47 = true;
                    } else {
                        z47 = false;
                    }
                    boolean z714 = z47 | zG119;
                    if ((i101 & 57344) == 16384) {
                        z48 = true;
                    } else {
                        z48 = false;
                    }
                    boolean zG1110 = z714 | z48 | rVarH.G(v0Var);
                    if (i99 == 4) {
                        z49 = true;
                    } else {
                        z49 = false;
                    }
                    boolean z81119 = zG1110 | z49;
                    i102 = (i101 & 112) ^ 48;
                    if (i102 > 32) {
                        v0Var2 = v0Var;
                        if ((i101 & 48) != 32) {
                            z55 = true;
                        } else {
                            z55 = false;
                        }
                    } else {
                        v0Var2 = v0Var;
                        if ((i101 & 48) != 32) {
                            z55 = true;
                        } else {
                            z55 = false;
                        }
                    }
                    zG = z81119 | z55 | rVarH.G(offsetMapping) | rVarH.G(p0Var) | rVarH.G(aVar) | rVarH.G(c2Var);
                    objE11 = rVarH.E();
                    if (zG) {
                        final ImeOptions imeOptions1112 = imeOptions3;
                        i0Var = offsetMapping;
                        final boolean z811110 = z36;
                        final boolean z811111 = z37;
                        objE11 = new l() { // from class: n1.u1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.B(s3Var, z811110, z811111, v0Var2, textFieldValue, imeOptions1112, i0Var, c2Var, p0Var, aVar, (l0) obj);
                            }
                        };
                        z56 = z811110;
                        textFieldValue2 = textFieldValue;
                        imeOptions4 = imeOptions1112;
                        c2Var2 = c2Var;
                        p0Var2 = p0Var;
                        aVar2 = aVar;
                        rVarH.v(objE11);
                    } else {
                        final ImeOptions imeOptions1113 = imeOptions3;
                        i0Var = offsetMapping;
                        final boolean z811112 = z36;
                        final boolean z811113 = z37;
                        objE11 = new l() { // from class: n1.u1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.B(s3Var, z811112, z811113, v0Var2, textFieldValue, imeOptions1113, i0Var, c2Var, p0Var, aVar, (l0) obj);
                            }
                        };
                        z56 = z811112;
                        textFieldValue2 = textFieldValue;
                        imeOptions4 = imeOptions1113;
                        c2Var2 = c2Var;
                        p0Var2 = p0Var;
                        aVar2 = aVar;
                        rVarH.v(objE11);
                    }
                    final j1.a aVar9 = aVar2;
                    m mVarA1113 = v4.a(companion2, z56, d0Var, lVar13, (l) objE11);
                    if (z56) {
                        z57 = false;
                    } else {
                        z57 = false;
                    }
                    Boolean boolValueOf7 = Boolean.valueOf(z57);
                    z58 = z56;
                    f6VarP = x5.p(boolValueOf7, rVarH, 0);
                    i0 i0Var9 = i0.f148189a;
                    boolean zW15 = rVarH.W(f6VarP) | rVarH.G(s3Var) | rVarH.G(v0Var2) | rVarH.G(c2Var2);
                    if (i102 > 32) {
                        imeOptions5 = imeOptions4;
                        if ((i101 & 48) != 32) {
                            z59 = true;
                        } else {
                            z59 = false;
                        }
                    } else {
                        imeOptions5 = imeOptions4;
                        if ((i101 & 48) != 32) {
                            z59 = true;
                        } else {
                            z59 = false;
                        }
                    }
                    z65 = zW15 | z59;
                    objE12 = rVarH.E();
                    if (z65) {
                        ImeOptions imeOptions1114 = imeOptions5;
                        objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions1114, null);
                        imeOptions6 = imeOptions1114;
                        rVarH.v(objE12);
                    } else {
                        ImeOptions imeOptions1115 = imeOptions5;
                        objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions1115, null);
                        imeOptions6 = imeOptions1115;
                        rVarH.v(objE12);
                    }
                    imeOptions7 = imeOptions6;
                    Function0.d(i0Var9, (p) objE12, rVarH, 6);
                    int i1012 = i101 >> 3;
                    c2Var3 = c2Var2;
                    m mVarA1114 = k5.a(companion2, c2Var3, z58, lVar13, s3Var, d0Var, z37, i0Var, rVarH, (i1012 & 896) | 196614 | ((i97 >> 9) & 7168) | ((i101 << 6) & 3670016));
                    i0Var2 = i0Var;
                    final m mVarB112 = m2.b(companion2, s3Var, textFieldValue2, i0Var2);
                    boolean zG1111 = rVarH.G(s3Var);
                    if (i100 == 2048) {
                        z66 = true;
                    } else {
                        z66 = false;
                    }
                    boolean zW16 = zG1111 | z66 | rVarH.W(n3Var) | rVarH.G(c2Var3);
                    if (i99 == 4) {
                        z67 = true;
                    } else {
                        z67 = false;
                    }
                    zG2 = zW16 | z67 | rVarH.G(i0Var2);
                    objE13 = rVarH.E();
                    if (zG2) {
                        final TextFieldValue textFieldValue16 = textFieldValue2;
                        objE13 = new l() { // from class: n1.v1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue16, i0Var2, (b0) obj);
                            }
                        };
                        rVarH.v(objE13);
                    } else {
                        final TextFieldValue textFieldValue17 = textFieldValue2;
                        objE13 = new l() { // from class: n1.v1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue17, i0Var2, (b0) obj);
                            }
                        };
                        rVarH.v(objE13);
                    }
                    final m mVarA1115 = p036e4.l1.a(companion2, (l) objE13);
                    CoreTextFieldSemanticsModifier hVar8 = new CoreTextFieldSemanticsModifier(transformedText6, textFieldValue, s3Var, z37, z58, e1VarC instanceof v4.k0, i0Var2, c2Var3, imeOptions7, d0Var);
                    if (z58) {
                        z68 = false;
                    } else {
                        z68 = false;
                    }
                    final m mVarA1116 = m2.a(companion2, s3Var, textFieldValue, i0Var2, cVar2, z68);
                    zG3 = rVarH.G(c2Var3);
                    final e1 e1Var10 = e1VarC;
                    objE14 = rVarH.E();
                    if (zG3) {
                        objE14 = new l() { // from class: n1.w1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.E(c2Var3, (s0) obj);
                            }
                        };
                        rVarH.v(objE14);
                    } else {
                        objE14 = new l() { // from class: n1.w1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.E(c2Var3, (s0) obj);
                            }
                        };
                        rVarH.v(objE14);
                    }
                    Function0.a(c2Var3, (l) objE14, rVarH, 0);
                    boolean zG1112 = rVarH.G(s3Var) | rVarH.G(v0Var2);
                    if (i99 == 4) {
                        z69 = true;
                    } else {
                        z69 = false;
                    }
                    z75 = z69 | zG1112 | ((i102 <= 32 && rVarH.W(imeOptions7)) || (i101 & 48) == 32);
                    objE15 = rVarH.E();
                    if (z75) {
                        objE15 = new l() { // from class: n1.y1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                            }
                        };
                        rVarH.v(objE15);
                    } else {
                        objE15 = new l() { // from class: n1.y1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                            }
                        };
                        rVarH.v(objE15);
                    }
                    Function0.a(imeOptions7, (l) objE15, rVarH, i1012 & 14);
                    l<TextFieldValue, i0> lVarR8 = s3Var.r();
                    boolean z811114 = !z37;
                    i103 = i95;
                    if (i103 == 1) {
                        z76 = true;
                    } else {
                        z76 = false;
                    }
                    m mVarB113 = i5.b(companion2, s3Var, c2Var3, textFieldValue, lVarR8, z811114, z76, i0Var2, i7Var, imeOptions7.getImeAction());
                    keyboardType = imeOptions7.getKeyboardType();
                    companion3 = a0.INSTANCE;
                    if (a0.n(keyboardType, companion3.f())) {
                        z77 = false;
                    } else {
                        z77 = false;
                    }
                    boolean zC9 = C(f6VarP);
                    zA = rVarH.a(z77) | rVarH.G(k1Var);
                    objE16 = rVarH.E();
                    if (zA) {
                        objE16 = new er.a() { // from class: n1.z1
                            @Override // er.a
                            public final Object a() {
                                return j2.G(z77, k1Var);
                            }
                        };
                        rVarH.v(objE16);
                    } else {
                        objE16 = new er.a() { // from class: n1.z1
                            @Override // er.a
                            public final Object a() {
                                return j2.G(z77, k1Var);
                            }
                        };
                        rVarH.v(objE16);
                    }
                    m mVarB114 = v1.b.b(companion2, zC9, z77, (er.a) objE16);
                    cVarE = l.e((androidx.compose.ui.graphics.c) rVarH.N(l.c()), ((Color) rVarH.N(l.d())).m20unboximpl(), m.a());
                    zG4 = rVarH.G(s3Var) | rVarH.W(cVarE);
                    objE17 = rVarH.E();
                    if (zG4) {
                        objE17 = new l() { // from class: n1.h2
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.H(s3Var, cVarE, (c) obj);
                            }
                        };
                        rVarH.v(objE17);
                    } else {
                        objE17 = new l() { // from class: n1.h2
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.H(s3Var, cVarE, (c) obj);
                            }
                        };
                        rVarH.v(objE17);
                    }
                    m mVarD8 = k3.k.d(companion2, (l) objE17);
                    m mVar19 = mVar4;
                    final a6 a6Var13 = a6Var5;
                    m mVarA1117 = a0(p036e4.l1.a(u5.f(g0(u4.b(h1.a(mVar19.u(mVarD8), k1Var, s3Var, c2Var3).u(mVarB114).u(mVarA1113), s3Var, oVar), s3Var, c2Var3).u(mVarB113), a6Var13, lVar13, z58, x5.a(rVarH, 0)).u(mVarA1114).u(hVar8), new l() { // from class: n1.n1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.I(s3Var, (b0) obj);
                        }
                    }), c2Var3, p0Var2);
                    if (!z58) {
                        z78 = false;
                    } else {
                        z78 = false;
                    }
                    if (z78) {
                        mVarZ = c3.z(companion2, c2Var3);
                    } else {
                        mVarZ = companion2;
                    }
                    final m mVar110 = mVarZ;
                    final q qVar10 = qVarB;
                    P(mVarA1117, c2Var3, y2.m.d(-814563849, true, new p() { // from class: n1.o1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j2.J(qVar10, s3Var, textStyle4, z38, i98, i103, a6Var13, textFieldValue, e1Var10, mVarA1116, mVarB112, mVarA1115, mVar110, aVar9, c2Var3, z78, z37, lVar7, i0Var2, dVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    qVar2 = qVar10;
                    i89 = i98;
                    rVar2 = rVarH;
                    e1Var2 = e1Var10;
                    z26 = z37;
                    lVar6 = lVar7;
                    z25 = z58;
                    a6Var2 = a6Var3;
                    solidColor = cVar2;
                    lVar5 = lVar13;
                    l3Var2 = l3VarA;
                    mVar3 = mVar19;
                    i88 = i103;
                    imeOptions2 = imeOptions7;
                    z19 = z38;
                    textStyle3 = textStyle4;
                } else {
                    rVarH.O();
                    z19 = z15;
                    imeOptions2 = imeOptions;
                    l3Var2 = l3Var;
                    qVar2 = qVar;
                    a6Var2 = a6Var;
                    rVar2 = rVarH;
                    textStyle3 = textStyle2;
                    lVar6 = lVar4;
                    e1Var2 = e1VarC;
                    mVar3 = mVar2;
                    i88 = i15;
                    i89 = i16;
                    z25 = z16;
                    z26 = z17;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: n1.p1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j2.N(textFieldValue, lVar, mVar3, textStyle3, e1Var2, lVar6, lVar5, solidColor, z19, i88, i89, imeOptions2, l3Var2, z25, z26, qVar2, a6Var2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i25 |= 24576;
            e1VarC = e1Var;
            i36 = i19 & 32;
            if (i36 != 0) {
                i25 |= 196608;
                lVar4 = lVar2;
            } else {
                lVar4 = lVar2;
                if ((i17 & 196608) == 0) {
                    if (rVarH.G(lVar4)) {
                        i37 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i37 = 65536;
                    }
                    i25 |= i37;
                }
            }
            i38 = i19 & 64;
            if (i38 != 0) {
                i25 |= 1572864;
                lVar5 = lVar3;
            } else {
                lVar5 = lVar3;
                if ((i17 & 1572864) == 0) {
                    if (rVarH.W(lVar5)) {
                        i39 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i39 = PKIFailureInfo.signerNotTrusted;
                    }
                    i25 |= i39;
                }
            }
            i45 = i19 & 128;
            if (i45 != 0) {
                i25 |= 12582912;
                solidColor = cVar;
            } else {
                solidColor = cVar;
                if ((i17 & 12582912) == 0) {
                    if (rVarH.W(solidColor)) {
                        i46 = 8388608;
                    } else {
                        i46 = 4194304;
                    }
                    i25 |= i46;
                }
            }
            i47 = i19 & 256;
            if (i47 != 0) {
                i25 |= 100663296;
            } else if ((i17 & 100663296) == 0) {
                if (rVarH.a(z15)) {
                    i48 = 67108864;
                } else {
                    i48 = 33554432;
                }
                i25 |= i48;
            }
            i49 = i19 & 512;
            if (i49 != 0) {
                if ((i17 & 805306368) == 0) {
                    if (rVarH.c(i15)) {
                        i55 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i55 = 268435456;
                    }
                    i25 |= i55;
                }
                i56 = i19 & 1024;
                if (i56 != 0) {
                    i57 = i18 | 6;
                } else if ((i18 & 6) == 0) {
                    if (rVarH.c(i16)) {
                        i58 = 4;
                    } else {
                        i58 = 2;
                    }
                    i57 = i18 | i58;
                } else {
                    i57 = i18;
                }
                if ((i18 & 48) != 0) {
                    i57 |= ((i19 & 2048) == 0 || !rVarH.W(imeOptions)) ? 16 : 32;
                }
                i59 = i57;
                i65 = i19 & PKIFailureInfo.certConfirmed;
                if (i65 != 0) {
                    i66 = i59 | MLKEMEngine.KyberPolyBytes;
                } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                    if (rVarH.W(l3Var)) {
                        i67 = 256;
                    } else {
                        i67 = 128;
                    }
                    i66 = i59 | i67;
                } else {
                    i66 = i59;
                }
                i68 = i19 & PKIFailureInfo.certRevoked;
                if (i68 != 0) {
                    i75 = i66 | 3072;
                } else {
                    i69 = i66;
                    if ((i18 & 3072) == 0) {
                        i75 = i69 | (rVarH.a(z16) ? 2048 : 1024);
                    } else {
                        i75 = i69;
                    }
                }
                i76 = i19 & 16384;
                if (i76 != 0) {
                    i78 = i75 | 24576;
                } else {
                    i77 = i75;
                    if ((i18 & 24576) == 0) {
                        if (rVarH.a(z17)) {
                            i29 = 16384;
                        }
                        i78 = i77 | i29;
                    } else {
                        i78 = i77;
                    }
                }
                i79 = i19 & 32768;
                if (i79 != 0) {
                    i78 |= 196608;
                } else if ((i18 & 196608) == 0) {
                    if (rVarH.G(qVar)) {
                        i85 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i85 = 65536;
                    }
                    i78 |= i85;
                }
                i86 = i19 & PKIFailureInfo.notAuthorized;
                if (i86 != 0) {
                    i78 |= 1572864;
                } else if ((i18 & 1572864) == 0) {
                    if (rVarH.W(a6Var)) {
                        i87 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i87 = PKIFailureInfo.signerNotTrusted;
                    }
                    i78 |= i87;
                }
                if ((i25 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (rVarH.r(z18, i25 & 1)) {
                    rVarH.I();
                    if ((i17 & 1) != 0) {
                        if (i104 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i28 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        }
                        if (i36 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.g2
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j2.x((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar4 = (l) objE;
                        }
                        if (i38 != 0) {
                            lVar5 = null;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.h(), null);
                        }
                        if (i47 != 0) {
                            z27 = true;
                        } else {
                            z27 = z15;
                        }
                        if (i49 != 0) {
                            i95 = Integer.MAX_VALUE;
                        } else {
                            i95 = i15;
                        }
                        if (i56 != 0) {
                            i96 = 1;
                        } else {
                            i96 = i16;
                        }
                        if ((i19 & 2048) != 0) {
                            imeOptionsA = ImeOptions.INSTANCE.a();
                            i78 &= -113;
                        } else {
                            imeOptionsA = imeOptions;
                        }
                        if (i65 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var;
                        }
                        if (i68 != 0) {
                            z28 = true;
                        } else {
                            z28 = z16;
                        }
                        if (i76 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if (i79 != 0) {
                            qVarB = g1.f130036a.b();
                        } else {
                            qVarB = qVar;
                        }
                        if (i86 != 0) {
                            a6Var3 = null;
                        } else {
                            a6Var3 = a6Var;
                        }
                        lVar7 = lVar4;
                        imeOptions3 = imeOptionsA;
                        z35 = z27;
                        textStyle2 = textStyleA;
                        mVar4 = mVar2;
                        z36 = z28;
                        z37 = z29;
                    } else {
                        if (i104 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i28 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        }
                        if (i36 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.g2
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j2.x((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar4 = (l) objE;
                        }
                        if (i38 != 0) {
                            lVar5 = null;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.h(), null);
                        }
                        if (i47 != 0) {
                            z27 = true;
                        } else {
                            z27 = z15;
                        }
                        if (i49 != 0) {
                            i95 = Integer.MAX_VALUE;
                        } else {
                            i95 = i15;
                        }
                        if (i56 != 0) {
                            i96 = 1;
                        } else {
                            i96 = i16;
                        }
                        if ((i19 & 2048) != 0) {
                            imeOptionsA = ImeOptions.INSTANCE.a();
                            i78 &= -113;
                        } else {
                            imeOptionsA = imeOptions;
                        }
                        if (i65 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var;
                        }
                        if (i68 != 0) {
                            z28 = true;
                        } else {
                            z28 = z16;
                        }
                        if (i76 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if (i79 != 0) {
                            qVarB = g1.f130036a.b();
                        } else {
                            qVarB = qVar;
                        }
                        if (i86 != 0) {
                            a6Var3 = null;
                        } else {
                            a6Var3 = a6Var;
                        }
                        lVar7 = lVar4;
                        imeOptions3 = imeOptionsA;
                        z35 = z27;
                        textStyle2 = textStyleA;
                        mVar4 = mVar2;
                        z36 = z28;
                        z37 = z29;
                    }
                    rVarH.y();
                    z38 = z35;
                    if (p076m2.t.k()) {
                        p076m2.t.o(31062401, i25, i78, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                    }
                    objE2 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE2 == companion.a()) {
                        objE2 = new d0();
                        rVarH.v(objE2);
                    }
                    d0Var = (d0) objE2;
                    objE3 = rVarH.E();
                    i97 = i25;
                    if (objE3 == companion.a()) {
                        objE3 = l1.b();
                        rVarH.v(objE3);
                    }
                    k1Var = (k1) objE3;
                    objE4 = rVarH.E();
                    cVar2 = solidColor;
                    if (objE4 == companion.a()) {
                        objE4 = new v0(k1Var);
                        rVarH.v(objE4);
                    }
                    v0Var = (v0) objE4;
                    dVar = (c5.d) rVarH.N(g1.f());
                    bVar = (u4.l.b) rVarH.N(g1.h());
                    selectionBackgroundColor = ((SelectionColors) rVarH.N(g3.c())).getSelectionBackgroundColor();
                    oVar = (o) rVarH.N(g1.g());
                    n3Var = (n3) rVarH.N(g1.v());
                    textStyle4 = textStyle2;
                    r2Var = (r2) rVarH.N(g1.r());
                    i98 = i96;
                    if (i95 == 1) {
                        a2Var = p143z0.a2.Vertical;
                    } else {
                        a2Var = p143z0.a2.Vertical;
                    }
                    if (a6Var3 == null) {
                        rVarH.X(-213744626);
                        Object[] objArr7 = {a2Var};
                        b3.x<a6, Object> xVarA7 = a6.INSTANCE.a();
                        zC = rVarH.c(a2Var.ordinal());
                        objE18 = rVarH.E();
                        if (zC) {
                            objE18 = new er.a() { // from class: n1.q1
                                @Override // er.a
                                public final Object a() {
                                    return j2.O(a2Var);
                                }
                            };
                            rVarH.v(objE18);
                        } else {
                            objE18 = new er.a() { // from class: n1.q1
                                @Override // er.a
                                public final Object a() {
                                    return j2.O(a2Var);
                                }
                            };
                            rVarH.v(objE18);
                        }
                        a6Var4 = (a6) b3.f.i(objArr7, xVarA7, (er.a) objE18, rVarH, 0);
                        rVarH.R();
                    } else {
                        rVarH.X(-213745742);
                        rVarH.R();
                        a6Var4 = a6Var3;
                    }
                    if (a6Var4.j() != a2Var) {
                        StringBuilder sb11 = new StringBuilder();
                        sb11.append("Mismatching scroller orientation; ");
                        if (a2Var == p143z0.a2.Vertical) {
                            str = "only single-line, non-wrap text fields can scroll horizontally";
                        } else {
                            str = "single-line, non-wrap text fields can only scroll horizontally";
                        }
                        sb11.append(str);
                        throw new IllegalArgumentException(sb11.toString());
                    }
                    i99 = i97 & 14;
                    if (i99 == 4) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    if ((i97 & 57344) == 16384) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    z46 = z39 | z45;
                    objE5 = rVarH.E();
                    if (z46) {
                        transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                        composition = textFieldValue.getComposition();
                        if (composition != null) {
                            a6Var5 = a6Var4;
                            transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                            if (transformedTextC2 != null) {
                                objE5 = transformedTextC2;
                            }
                            rVarH.v(objE5);
                        } else {
                            a6Var5 = a6Var4;
                        }
                        objE5 = transformedTextC;
                        rVarH.v(objE5);
                    } else {
                        transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                        composition = textFieldValue.getComposition();
                        if (composition != null) {
                            a6Var5 = a6Var4;
                            transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                            if (transformedTextC2 != null) {
                                objE5 = transformedTextC2;
                            }
                            rVarH.v(objE5);
                        } else {
                            a6Var5 = a6Var4;
                        }
                        objE5 = transformedTextC;
                        rVarH.v(objE5);
                    }
                    TransformedText transformedText7 = (TransformedText) objE5;
                    text = transformedText7.getText();
                    offsetMapping = transformedText7.getOffsetMapping();
                    d4VarC = p076m2.m.c(rVarH, 0);
                    zW = rVarH.W(r2Var);
                    objE6 = rVarH.E();
                    if (zW) {
                        objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                        rVarH.v(objE6);
                    } else {
                        objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                        rVarH.v(objE6);
                    }
                    s3Var = (s3) objE6;
                    s3Var.X(textFieldValue.getText(), text, textStyle4, z38, r55, bVar, lVar, l3VarA, oVar, selectionBackgroundColor);
                    s3Var.getProcessor().e(textFieldValue, s3Var.getInputSession());
                    objE7 = rVarH.E();
                    if (objE7 == companion.a()) {
                        objE7 = new i7(0, 1, null);
                        rVarH.v(objE7);
                    }
                    i7Var = (i7) objE7;
                    i7.f(i7Var, textFieldValue, 0L, 2, null);
                    objE8 = rVarH.E();
                    if (objE8 == companion.a()) {
                        objE8 = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE8);
                    }
                    p0Var = (p0) objE8;
                    objE9 = rVarH.E();
                    if (objE9 == companion.a()) {
                        objE9 = j1.e.a();
                        rVarH.v(objE9);
                    }
                    aVar = (j1.a) objE9;
                    objE10 = rVarH.E();
                    b1.l lVar14 = lVar5;
                    if (objE10 == companion.a()) {
                        objE10 = new c2(i7Var);
                        rVarH.v(objE10);
                    }
                    c2Var = (c2) objE10;
                    c2Var.L0(offsetMapping);
                    c2Var.U0(e1VarC);
                    c2Var.M0(s3Var.r());
                    c2Var.Q0(s3Var);
                    c2Var.T0(textFieldValue);
                    c2Var.z0((androidx.compose.ui.platform.b1) rVarH.N(g1.d()));
                    c2Var.A0(p0Var);
                    c2Var.R0((v2) rVarH.N(g1.s()));
                    c2Var.I0((v3.a) rVarH.N(g1.j()));
                    c2Var.G0(d0Var);
                    c2Var.E0(!z37);
                    c2Var.F0(z36);
                    if (g0.isSmartSelectionEnabled) {
                        rVarH.X(1966756105);
                        c2Var.N0(f0.h(z1.i0.EditableText, textStyle4.w(), rVarH, 6));
                        rVarH.R();
                    } else {
                        rVarH.X(1966902177);
                        rVarH.R();
                    }
                    s3Var.h();
                    new l() { // from class: n1.r1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.y(c2Var, (q4.e) obj);
                        }
                    };
                    new er.a() { // from class: n1.s1
                        @Override // er.a
                        public final Object a() {
                            return j2.z(c2Var);
                        }
                    };
                    new er.a() { // from class: n1.t1
                        @Override // er.a
                        public final Object a() {
                            return j2.A(c2Var);
                        }
                    };
                    companion2 = m.INSTANCE;
                    boolean zG1113 = rVarH.G(s3Var);
                    i100 = i78 & 7168;
                    i101 = i78;
                    if (i100 == 2048) {
                        z47 = true;
                    } else {
                        z47 = false;
                    }
                    boolean z715 = z47 | zG1113;
                    if ((i101 & 57344) == 16384) {
                        z48 = true;
                    } else {
                        z48 = false;
                    }
                    boolean zG1114 = z715 | z48 | rVarH.G(v0Var);
                    if (i99 == 4) {
                        z49 = true;
                    } else {
                        z49 = false;
                    }
                    boolean z811115 = zG1114 | z49;
                    i102 = (i101 & 112) ^ 48;
                    if (i102 > 32) {
                        v0Var2 = v0Var;
                        if ((i101 & 48) != 32) {
                            z55 = true;
                        } else {
                            z55 = false;
                        }
                    } else {
                        v0Var2 = v0Var;
                        if ((i101 & 48) != 32) {
                            z55 = true;
                        } else {
                            z55 = false;
                        }
                    }
                    zG = z811115 | z55 | rVarH.G(offsetMapping) | rVarH.G(p0Var) | rVarH.G(aVar) | rVarH.G(c2Var);
                    objE11 = rVarH.E();
                    if (zG) {
                        final ImeOptions imeOptions1116 = imeOptions3;
                        i0Var = offsetMapping;
                        final boolean z811116 = z36;
                        final boolean z811117 = z37;
                        objE11 = new l() { // from class: n1.u1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.B(s3Var, z811116, z811117, v0Var2, textFieldValue, imeOptions1116, i0Var, c2Var, p0Var, aVar, (l0) obj);
                            }
                        };
                        z56 = z811116;
                        textFieldValue2 = textFieldValue;
                        imeOptions4 = imeOptions1116;
                        c2Var2 = c2Var;
                        p0Var2 = p0Var;
                        aVar2 = aVar;
                        rVarH.v(objE11);
                    } else {
                        final ImeOptions imeOptions1117 = imeOptions3;
                        i0Var = offsetMapping;
                        final boolean z811118 = z36;
                        final boolean z811119 = z37;
                        objE11 = new l() { // from class: n1.u1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.B(s3Var, z811118, z811119, v0Var2, textFieldValue, imeOptions1117, i0Var, c2Var, p0Var, aVar, (l0) obj);
                            }
                        };
                        z56 = z811118;
                        textFieldValue2 = textFieldValue;
                        imeOptions4 = imeOptions1117;
                        c2Var2 = c2Var;
                        p0Var2 = p0Var;
                        aVar2 = aVar;
                        rVarH.v(objE11);
                    }
                    final j1.a aVar10 = aVar2;
                    m mVarA1118 = v4.a(companion2, z56, d0Var, lVar14, (l) objE11);
                    if (z56) {
                        z57 = false;
                    } else {
                        z57 = false;
                    }
                    Boolean boolValueOf8 = Boolean.valueOf(z57);
                    z58 = z56;
                    f6VarP = x5.p(boolValueOf8, rVarH, 0);
                    i0 i0Var10 = i0.f148189a;
                    boolean zW17 = rVarH.W(f6VarP) | rVarH.G(s3Var) | rVarH.G(v0Var2) | rVarH.G(c2Var2);
                    if (i102 > 32) {
                        imeOptions5 = imeOptions4;
                        if ((i101 & 48) != 32) {
                            z59 = true;
                        } else {
                            z59 = false;
                        }
                    } else {
                        imeOptions5 = imeOptions4;
                        if ((i101 & 48) != 32) {
                            z59 = true;
                        } else {
                            z59 = false;
                        }
                    }
                    z65 = zW17 | z59;
                    objE12 = rVarH.E();
                    if (z65) {
                        ImeOptions imeOptions1118 = imeOptions5;
                        objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions1118, null);
                        imeOptions6 = imeOptions1118;
                        rVarH.v(objE12);
                    } else {
                        ImeOptions imeOptions1119 = imeOptions5;
                        objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions1119, null);
                        imeOptions6 = imeOptions1119;
                        rVarH.v(objE12);
                    }
                    imeOptions7 = imeOptions6;
                    Function0.d(i0Var10, (p) objE12, rVarH, 6);
                    int i1013 = i101 >> 3;
                    c2Var3 = c2Var2;
                    m mVarA1119 = k5.a(companion2, c2Var3, z58, lVar14, s3Var, d0Var, z37, i0Var, rVarH, (i1013 & 896) | 196614 | ((i97 >> 9) & 7168) | ((i101 << 6) & 3670016));
                    i0Var2 = i0Var;
                    final m mVarB115 = m2.b(companion2, s3Var, textFieldValue2, i0Var2);
                    boolean zG1115 = rVarH.G(s3Var);
                    if (i100 == 2048) {
                        z66 = true;
                    } else {
                        z66 = false;
                    }
                    boolean zW18 = zG1115 | z66 | rVarH.W(n3Var) | rVarH.G(c2Var3);
                    if (i99 == 4) {
                        z67 = true;
                    } else {
                        z67 = false;
                    }
                    zG2 = zW18 | z67 | rVarH.G(i0Var2);
                    objE13 = rVarH.E();
                    if (zG2) {
                        final TextFieldValue textFieldValue18 = textFieldValue2;
                        objE13 = new l() { // from class: n1.v1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue18, i0Var2, (b0) obj);
                            }
                        };
                        rVarH.v(objE13);
                    } else {
                        final TextFieldValue textFieldValue19 = textFieldValue2;
                        objE13 = new l() { // from class: n1.v1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue19, i0Var2, (b0) obj);
                            }
                        };
                        rVarH.v(objE13);
                    }
                    final m mVarA11110 = p036e4.l1.a(companion2, (l) objE13);
                    CoreTextFieldSemanticsModifier hVar9 = new CoreTextFieldSemanticsModifier(transformedText7, textFieldValue, s3Var, z37, z58, e1VarC instanceof v4.k0, i0Var2, c2Var3, imeOptions7, d0Var);
                    if (z58) {
                        z68 = false;
                    } else {
                        z68 = false;
                    }
                    final m mVarA11111 = m2.a(companion2, s3Var, textFieldValue, i0Var2, cVar2, z68);
                    zG3 = rVarH.G(c2Var3);
                    final e1 e1Var11 = e1VarC;
                    objE14 = rVarH.E();
                    if (zG3) {
                        objE14 = new l() { // from class: n1.w1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.E(c2Var3, (s0) obj);
                            }
                        };
                        rVarH.v(objE14);
                    } else {
                        objE14 = new l() { // from class: n1.w1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.E(c2Var3, (s0) obj);
                            }
                        };
                        rVarH.v(objE14);
                    }
                    Function0.a(c2Var3, (l) objE14, rVarH, 0);
                    boolean zG1116 = rVarH.G(s3Var) | rVarH.G(v0Var2);
                    if (i99 == 4) {
                        z69 = true;
                    } else {
                        z69 = false;
                    }
                    z75 = z69 | zG1116 | ((i102 <= 32 && rVarH.W(imeOptions7)) || (i101 & 48) == 32);
                    objE15 = rVarH.E();
                    if (z75) {
                        objE15 = new l() { // from class: n1.y1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                            }
                        };
                        rVarH.v(objE15);
                    } else {
                        objE15 = new l() { // from class: n1.y1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                            }
                        };
                        rVarH.v(objE15);
                    }
                    Function0.a(imeOptions7, (l) objE15, rVarH, i1013 & 14);
                    l<TextFieldValue, i0> lVarR9 = s3Var.r();
                    boolean z8111110 = !z37;
                    i103 = i95;
                    if (i103 == 1) {
                        z76 = true;
                    } else {
                        z76 = false;
                    }
                    m mVarB116 = i5.b(companion2, s3Var, c2Var3, textFieldValue, lVarR9, z8111110, z76, i0Var2, i7Var, imeOptions7.getImeAction());
                    keyboardType = imeOptions7.getKeyboardType();
                    companion3 = a0.INSTANCE;
                    if (a0.n(keyboardType, companion3.f())) {
                        z77 = false;
                    } else {
                        z77 = false;
                    }
                    boolean zC10 = C(f6VarP);
                    zA = rVarH.a(z77) | rVarH.G(k1Var);
                    objE16 = rVarH.E();
                    if (zA) {
                        objE16 = new er.a() { // from class: n1.z1
                            @Override // er.a
                            public final Object a() {
                                return j2.G(z77, k1Var);
                            }
                        };
                        rVarH.v(objE16);
                    } else {
                        objE16 = new er.a() { // from class: n1.z1
                            @Override // er.a
                            public final Object a() {
                                return j2.G(z77, k1Var);
                            }
                        };
                        rVarH.v(objE16);
                    }
                    m mVarB117 = v1.b.b(companion2, zC10, z77, (er.a) objE16);
                    cVarE = l.e((androidx.compose.ui.graphics.c) rVarH.N(l.c()), ((Color) rVarH.N(l.d())).m20unboximpl(), m.a());
                    zG4 = rVarH.G(s3Var) | rVarH.W(cVarE);
                    objE17 = rVarH.E();
                    if (zG4) {
                        objE17 = new l() { // from class: n1.h2
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.H(s3Var, cVarE, (c) obj);
                            }
                        };
                        rVarH.v(objE17);
                    } else {
                        objE17 = new l() { // from class: n1.h2
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.H(s3Var, cVarE, (c) obj);
                            }
                        };
                        rVarH.v(objE17);
                    }
                    m mVarD9 = k3.k.d(companion2, (l) objE17);
                    m mVar111 = mVar4;
                    final a6 a6Var14 = a6Var5;
                    m mVarA11112 = a0(p036e4.l1.a(u5.f(g0(u4.b(h1.a(mVar111.u(mVarD9), k1Var, s3Var, c2Var3).u(mVarB117).u(mVarA1118), s3Var, oVar), s3Var, c2Var3).u(mVarB116), a6Var14, lVar14, z58, x5.a(rVarH, 0)).u(mVarA1119).u(hVar9), new l() { // from class: n1.n1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.I(s3Var, (b0) obj);
                        }
                    }), c2Var3, p0Var2);
                    if (!z58) {
                        z78 = false;
                    } else {
                        z78 = false;
                    }
                    if (z78) {
                        mVarZ = c3.z(companion2, c2Var3);
                    } else {
                        mVarZ = companion2;
                    }
                    final m mVar112 = mVarZ;
                    final q qVar11 = qVarB;
                    P(mVarA11112, c2Var3, y2.m.d(-814563849, true, new p() { // from class: n1.o1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j2.J(qVar11, s3Var, textStyle4, z38, i98, i103, a6Var14, textFieldValue, e1Var11, mVarA11111, mVarB115, mVarA11110, mVar112, aVar10, c2Var3, z78, z37, lVar7, i0Var2, dVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    qVar2 = qVar11;
                    i89 = i98;
                    rVar2 = rVarH;
                    e1Var2 = e1Var11;
                    z26 = z37;
                    lVar6 = lVar7;
                    z25 = z58;
                    a6Var2 = a6Var3;
                    solidColor = cVar2;
                    lVar5 = lVar14;
                    l3Var2 = l3VarA;
                    mVar3 = mVar111;
                    i88 = i103;
                    imeOptions2 = imeOptions7;
                    z19 = z38;
                    textStyle3 = textStyle4;
                } else {
                    rVarH.O();
                    z19 = z15;
                    imeOptions2 = imeOptions;
                    l3Var2 = l3Var;
                    qVar2 = qVar;
                    a6Var2 = a6Var;
                    rVar2 = rVarH;
                    textStyle3 = textStyle2;
                    lVar6 = lVar4;
                    e1Var2 = e1VarC;
                    mVar3 = mVar2;
                    i88 = i15;
                    i89 = i16;
                    z25 = z16;
                    z26 = z17;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: n1.p1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j2.N(textFieldValue, lVar, mVar3, textStyle3, e1Var2, lVar6, lVar5, solidColor, z19, i88, i89, imeOptions2, l3Var2, z25, z26, qVar2, a6Var2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i25 |= 805306368;
            i56 = i19 & 1024;
            if (i56 != 0) {
                i57 = i18 | 6;
            } else if ((i18 & 6) == 0) {
                if (rVarH.c(i16)) {
                    i58 = 4;
                } else {
                    i58 = 2;
                }
                i57 = i18 | i58;
            } else {
                i57 = i18;
            }
            if ((i18 & 48) != 0) {
                i57 |= ((i19 & 2048) == 0 || !rVarH.W(imeOptions)) ? 16 : 32;
            }
            i59 = i57;
            i65 = i19 & PKIFailureInfo.certConfirmed;
            if (i65 != 0) {
                i66 = i59 | MLKEMEngine.KyberPolyBytes;
            } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                if (rVarH.W(l3Var)) {
                    i67 = 256;
                } else {
                    i67 = 128;
                }
                i66 = i59 | i67;
            } else {
                i66 = i59;
            }
            i68 = i19 & PKIFailureInfo.certRevoked;
            if (i68 != 0) {
                i75 = i66 | 3072;
            } else {
                i69 = i66;
                if ((i18 & 3072) == 0) {
                    i75 = i69 | (rVarH.a(z16) ? 2048 : 1024);
                } else {
                    i75 = i69;
                }
            }
            i76 = i19 & 16384;
            if (i76 != 0) {
                i78 = i75 | 24576;
            } else {
                i77 = i75;
                if ((i18 & 24576) == 0) {
                    if (rVarH.a(z17)) {
                        i29 = 16384;
                    }
                    i78 = i77 | i29;
                } else {
                    i78 = i77;
                }
            }
            i79 = i19 & 32768;
            if (i79 != 0) {
                i78 |= 196608;
            } else if ((i18 & 196608) == 0) {
                if (rVarH.G(qVar)) {
                    i85 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i85 = 65536;
                }
                i78 |= i85;
            }
            i86 = i19 & PKIFailureInfo.notAuthorized;
            if (i86 != 0) {
                i78 |= 1572864;
            } else if ((i18 & 1572864) == 0) {
                if (rVarH.W(a6Var)) {
                    i87 = PKIFailureInfo.badCertTemplate;
                } else {
                    i87 = PKIFailureInfo.signerNotTrusted;
                }
                i78 |= i87;
            }
            if ((i25 & 306783379) == 306783378) {
                z18 = true;
            } else {
                z18 = true;
            }
            if (rVarH.r(z18, i25 & 1)) {
                rVarH.I();
                if ((i17 & 1) != 0) {
                    if (i104 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i26 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i28 != 0) {
                        e1VarC = e1.INSTANCE.c();
                    }
                    if (i36 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: n1.g2
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.x((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar4 = (l) objE;
                    }
                    if (i38 != 0) {
                        lVar5 = null;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.h(), null);
                    }
                    if (i47 != 0) {
                        z27 = true;
                    } else {
                        z27 = z15;
                    }
                    if (i49 != 0) {
                        i95 = Integer.MAX_VALUE;
                    } else {
                        i95 = i15;
                    }
                    if (i56 != 0) {
                        i96 = 1;
                    } else {
                        i96 = i16;
                    }
                    if ((i19 & 2048) != 0) {
                        imeOptionsA = ImeOptions.INSTANCE.a();
                        i78 &= -113;
                    } else {
                        imeOptionsA = imeOptions;
                    }
                    if (i65 != 0) {
                        l3VarA = l3.INSTANCE.a();
                    } else {
                        l3VarA = l3Var;
                    }
                    if (i68 != 0) {
                        z28 = true;
                    } else {
                        z28 = z16;
                    }
                    if (i76 != 0) {
                        z29 = false;
                    } else {
                        z29 = z17;
                    }
                    if (i79 != 0) {
                        qVarB = g1.f130036a.b();
                    } else {
                        qVarB = qVar;
                    }
                    if (i86 != 0) {
                        a6Var3 = null;
                    } else {
                        a6Var3 = a6Var;
                    }
                    lVar7 = lVar4;
                    imeOptions3 = imeOptionsA;
                    z35 = z27;
                    textStyle2 = textStyleA;
                    mVar4 = mVar2;
                    z36 = z28;
                    z37 = z29;
                } else {
                    if (i104 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i26 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i28 != 0) {
                        e1VarC = e1.INSTANCE.c();
                    }
                    if (i36 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: n1.g2
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.x((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar4 = (l) objE;
                    }
                    if (i38 != 0) {
                        lVar5 = null;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.h(), null);
                    }
                    if (i47 != 0) {
                        z27 = true;
                    } else {
                        z27 = z15;
                    }
                    if (i49 != 0) {
                        i95 = Integer.MAX_VALUE;
                    } else {
                        i95 = i15;
                    }
                    if (i56 != 0) {
                        i96 = 1;
                    } else {
                        i96 = i16;
                    }
                    if ((i19 & 2048) != 0) {
                        imeOptionsA = ImeOptions.INSTANCE.a();
                        i78 &= -113;
                    } else {
                        imeOptionsA = imeOptions;
                    }
                    if (i65 != 0) {
                        l3VarA = l3.INSTANCE.a();
                    } else {
                        l3VarA = l3Var;
                    }
                    if (i68 != 0) {
                        z28 = true;
                    } else {
                        z28 = z16;
                    }
                    if (i76 != 0) {
                        z29 = false;
                    } else {
                        z29 = z17;
                    }
                    if (i79 != 0) {
                        qVarB = g1.f130036a.b();
                    } else {
                        qVarB = qVar;
                    }
                    if (i86 != 0) {
                        a6Var3 = null;
                    } else {
                        a6Var3 = a6Var;
                    }
                    lVar7 = lVar4;
                    imeOptions3 = imeOptionsA;
                    z35 = z27;
                    textStyle2 = textStyleA;
                    mVar4 = mVar2;
                    z36 = z28;
                    z37 = z29;
                }
                rVarH.y();
                z38 = z35;
                if (p076m2.t.k()) {
                    p076m2.t.o(31062401, i25, i78, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                }
                objE2 = rVarH.E();
                companion = r.INSTANCE;
                if (objE2 == companion.a()) {
                    objE2 = new d0();
                    rVarH.v(objE2);
                }
                d0Var = (d0) objE2;
                objE3 = rVarH.E();
                i97 = i25;
                if (objE3 == companion.a()) {
                    objE3 = l1.b();
                    rVarH.v(objE3);
                }
                k1Var = (k1) objE3;
                objE4 = rVarH.E();
                cVar2 = solidColor;
                if (objE4 == companion.a()) {
                    objE4 = new v0(k1Var);
                    rVarH.v(objE4);
                }
                v0Var = (v0) objE4;
                dVar = (c5.d) rVarH.N(g1.f());
                bVar = (u4.l.b) rVarH.N(g1.h());
                selectionBackgroundColor = ((SelectionColors) rVarH.N(g3.c())).getSelectionBackgroundColor();
                oVar = (o) rVarH.N(g1.g());
                n3Var = (n3) rVarH.N(g1.v());
                textStyle4 = textStyle2;
                r2Var = (r2) rVarH.N(g1.r());
                i98 = i96;
                if (i95 == 1) {
                    a2Var = p143z0.a2.Vertical;
                } else {
                    a2Var = p143z0.a2.Vertical;
                }
                if (a6Var3 == null) {
                    rVarH.X(-213744626);
                    Object[] objArr8 = {a2Var};
                    b3.x<a6, Object> xVarA8 = a6.INSTANCE.a();
                    zC = rVarH.c(a2Var.ordinal());
                    objE18 = rVarH.E();
                    if (zC) {
                        objE18 = new er.a() { // from class: n1.q1
                            @Override // er.a
                            public final Object a() {
                                return j2.O(a2Var);
                            }
                        };
                        rVarH.v(objE18);
                    } else {
                        objE18 = new er.a() { // from class: n1.q1
                            @Override // er.a
                            public final Object a() {
                                return j2.O(a2Var);
                            }
                        };
                        rVarH.v(objE18);
                    }
                    a6Var4 = (a6) b3.f.i(objArr8, xVarA8, (er.a) objE18, rVarH, 0);
                    rVarH.R();
                } else {
                    rVarH.X(-213745742);
                    rVarH.R();
                    a6Var4 = a6Var3;
                }
                if (a6Var4.j() != a2Var) {
                    StringBuilder sb12 = new StringBuilder();
                    sb12.append("Mismatching scroller orientation; ");
                    if (a2Var == p143z0.a2.Vertical) {
                        str = "only single-line, non-wrap text fields can scroll horizontally";
                    } else {
                        str = "single-line, non-wrap text fields can only scroll horizontally";
                    }
                    sb12.append(str);
                    throw new IllegalArgumentException(sb12.toString());
                }
                i99 = i97 & 14;
                if (i99 == 4) {
                    z39 = true;
                } else {
                    z39 = false;
                }
                if ((i97 & 57344) == 16384) {
                    z45 = true;
                } else {
                    z45 = false;
                }
                z46 = z39 | z45;
                objE5 = rVarH.E();
                if (z46) {
                    transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                    composition = textFieldValue.getComposition();
                    if (composition != null) {
                        a6Var5 = a6Var4;
                        transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                        if (transformedTextC2 != null) {
                            objE5 = transformedTextC2;
                        }
                        rVarH.v(objE5);
                    } else {
                        a6Var5 = a6Var4;
                    }
                    objE5 = transformedTextC;
                    rVarH.v(objE5);
                } else {
                    transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                    composition = textFieldValue.getComposition();
                    if (composition != null) {
                        a6Var5 = a6Var4;
                        transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                        if (transformedTextC2 != null) {
                            objE5 = transformedTextC2;
                        }
                        rVarH.v(objE5);
                    } else {
                        a6Var5 = a6Var4;
                    }
                    objE5 = transformedTextC;
                    rVarH.v(objE5);
                }
                TransformedText transformedText8 = (TransformedText) objE5;
                text = transformedText8.getText();
                offsetMapping = transformedText8.getOffsetMapping();
                d4VarC = p076m2.m.c(rVarH, 0);
                zW = rVarH.W(r2Var);
                objE6 = rVarH.E();
                if (zW) {
                    objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                    rVarH.v(objE6);
                } else {
                    objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                    rVarH.v(objE6);
                }
                s3Var = (s3) objE6;
                s3Var.X(textFieldValue.getText(), text, textStyle4, z38, r55, bVar, lVar, l3VarA, oVar, selectionBackgroundColor);
                s3Var.getProcessor().e(textFieldValue, s3Var.getInputSession());
                objE7 = rVarH.E();
                if (objE7 == companion.a()) {
                    objE7 = new i7(0, 1, null);
                    rVarH.v(objE7);
                }
                i7Var = (i7) objE7;
                i7.f(i7Var, textFieldValue, 0L, 2, null);
                objE8 = rVarH.E();
                if (objE8 == companion.a()) {
                    objE8 = Function0.i(tq.j.f191408a, rVarH);
                    rVarH.v(objE8);
                }
                p0Var = (p0) objE8;
                objE9 = rVarH.E();
                if (objE9 == companion.a()) {
                    objE9 = j1.e.a();
                    rVarH.v(objE9);
                }
                aVar = (j1.a) objE9;
                objE10 = rVarH.E();
                b1.l lVar15 = lVar5;
                if (objE10 == companion.a()) {
                    objE10 = new c2(i7Var);
                    rVarH.v(objE10);
                }
                c2Var = (c2) objE10;
                c2Var.L0(offsetMapping);
                c2Var.U0(e1VarC);
                c2Var.M0(s3Var.r());
                c2Var.Q0(s3Var);
                c2Var.T0(textFieldValue);
                c2Var.z0((androidx.compose.ui.platform.b1) rVarH.N(g1.d()));
                c2Var.A0(p0Var);
                c2Var.R0((v2) rVarH.N(g1.s()));
                c2Var.I0((v3.a) rVarH.N(g1.j()));
                c2Var.G0(d0Var);
                c2Var.E0(!z37);
                c2Var.F0(z36);
                if (g0.isSmartSelectionEnabled) {
                    rVarH.X(1966756105);
                    c2Var.N0(f0.h(z1.i0.EditableText, textStyle4.w(), rVarH, 6));
                    rVarH.R();
                } else {
                    rVarH.X(1966902177);
                    rVarH.R();
                }
                s3Var.h();
                new l() { // from class: n1.r1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j2.y(c2Var, (q4.e) obj);
                    }
                };
                new er.a() { // from class: n1.s1
                    @Override // er.a
                    public final Object a() {
                        return j2.z(c2Var);
                    }
                };
                new er.a() { // from class: n1.t1
                    @Override // er.a
                    public final Object a() {
                        return j2.A(c2Var);
                    }
                };
                companion2 = m.INSTANCE;
                boolean zG1117 = rVarH.G(s3Var);
                i100 = i78 & 7168;
                i101 = i78;
                if (i100 == 2048) {
                    z47 = true;
                } else {
                    z47 = false;
                }
                boolean z716 = z47 | zG1117;
                if ((i101 & 57344) == 16384) {
                    z48 = true;
                } else {
                    z48 = false;
                }
                boolean zG1118 = z716 | z48 | rVarH.G(v0Var);
                if (i99 == 4) {
                    z49 = true;
                } else {
                    z49 = false;
                }
                boolean z8111111 = zG1118 | z49;
                i102 = (i101 & 112) ^ 48;
                if (i102 > 32) {
                    v0Var2 = v0Var;
                    if ((i101 & 48) != 32) {
                        z55 = true;
                    } else {
                        z55 = false;
                    }
                } else {
                    v0Var2 = v0Var;
                    if ((i101 & 48) != 32) {
                        z55 = true;
                    } else {
                        z55 = false;
                    }
                }
                zG = z8111111 | z55 | rVarH.G(offsetMapping) | rVarH.G(p0Var) | rVarH.G(aVar) | rVarH.G(c2Var);
                objE11 = rVarH.E();
                if (zG) {
                    final ImeOptions imeOptions11110 = imeOptions3;
                    i0Var = offsetMapping;
                    final boolean z8111112 = z36;
                    final boolean z8111113 = z37;
                    objE11 = new l() { // from class: n1.u1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.B(s3Var, z8111112, z8111113, v0Var2, textFieldValue, imeOptions11110, i0Var, c2Var, p0Var, aVar, (l0) obj);
                        }
                    };
                    z56 = z8111112;
                    textFieldValue2 = textFieldValue;
                    imeOptions4 = imeOptions11110;
                    c2Var2 = c2Var;
                    p0Var2 = p0Var;
                    aVar2 = aVar;
                    rVarH.v(objE11);
                } else {
                    final ImeOptions imeOptions11111 = imeOptions3;
                    i0Var = offsetMapping;
                    final boolean z8111114 = z36;
                    final boolean z8111115 = z37;
                    objE11 = new l() { // from class: n1.u1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.B(s3Var, z8111114, z8111115, v0Var2, textFieldValue, imeOptions11111, i0Var, c2Var, p0Var, aVar, (l0) obj);
                        }
                    };
                    z56 = z8111114;
                    textFieldValue2 = textFieldValue;
                    imeOptions4 = imeOptions11111;
                    c2Var2 = c2Var;
                    p0Var2 = p0Var;
                    aVar2 = aVar;
                    rVarH.v(objE11);
                }
                final j1.a aVar11 = aVar2;
                m mVarA11113 = v4.a(companion2, z56, d0Var, lVar15, (l) objE11);
                if (z56) {
                    z57 = false;
                } else {
                    z57 = false;
                }
                Boolean boolValueOf9 = Boolean.valueOf(z57);
                z58 = z56;
                f6VarP = x5.p(boolValueOf9, rVarH, 0);
                i0 i0Var11 = i0.f148189a;
                boolean zW19 = rVarH.W(f6VarP) | rVarH.G(s3Var) | rVarH.G(v0Var2) | rVarH.G(c2Var2);
                if (i102 > 32) {
                    imeOptions5 = imeOptions4;
                    if ((i101 & 48) != 32) {
                        z59 = true;
                    } else {
                        z59 = false;
                    }
                } else {
                    imeOptions5 = imeOptions4;
                    if ((i101 & 48) != 32) {
                        z59 = true;
                    } else {
                        z59 = false;
                    }
                }
                z65 = zW19 | z59;
                objE12 = rVarH.E();
                if (z65) {
                    ImeOptions imeOptions11112 = imeOptions5;
                    objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions11112, null);
                    imeOptions6 = imeOptions11112;
                    rVarH.v(objE12);
                } else {
                    ImeOptions imeOptions11113 = imeOptions5;
                    objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions11113, null);
                    imeOptions6 = imeOptions11113;
                    rVarH.v(objE12);
                }
                imeOptions7 = imeOptions6;
                Function0.d(i0Var11, (p) objE12, rVarH, 6);
                int i1014 = i101 >> 3;
                c2Var3 = c2Var2;
                m mVarA11114 = k5.a(companion2, c2Var3, z58, lVar15, s3Var, d0Var, z37, i0Var, rVarH, (i1014 & 896) | 196614 | ((i97 >> 9) & 7168) | ((i101 << 6) & 3670016));
                i0Var2 = i0Var;
                final m mVarB118 = m2.b(companion2, s3Var, textFieldValue2, i0Var2);
                boolean zG1119 = rVarH.G(s3Var);
                if (i100 == 2048) {
                    z66 = true;
                } else {
                    z66 = false;
                }
                boolean zW110 = zG1119 | z66 | rVarH.W(n3Var) | rVarH.G(c2Var3);
                if (i99 == 4) {
                    z67 = true;
                } else {
                    z67 = false;
                }
                zG2 = zW110 | z67 | rVarH.G(i0Var2);
                objE13 = rVarH.E();
                if (zG2) {
                    final TextFieldValue textFieldValue110 = textFieldValue2;
                    objE13 = new l() { // from class: n1.v1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue110, i0Var2, (b0) obj);
                        }
                    };
                    rVarH.v(objE13);
                } else {
                    final TextFieldValue textFieldValue111 = textFieldValue2;
                    objE13 = new l() { // from class: n1.v1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue111, i0Var2, (b0) obj);
                        }
                    };
                    rVarH.v(objE13);
                }
                final m mVarA11115 = p036e4.l1.a(companion2, (l) objE13);
                CoreTextFieldSemanticsModifier hVar10 = new CoreTextFieldSemanticsModifier(transformedText8, textFieldValue, s3Var, z37, z58, e1VarC instanceof v4.k0, i0Var2, c2Var3, imeOptions7, d0Var);
                if (z58) {
                    z68 = false;
                } else {
                    z68 = false;
                }
                final m mVarA11116 = m2.a(companion2, s3Var, textFieldValue, i0Var2, cVar2, z68);
                zG3 = rVarH.G(c2Var3);
                final e1 e1Var12 = e1VarC;
                objE14 = rVarH.E();
                if (zG3) {
                    objE14 = new l() { // from class: n1.w1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.E(c2Var3, (s0) obj);
                        }
                    };
                    rVarH.v(objE14);
                } else {
                    objE14 = new l() { // from class: n1.w1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.E(c2Var3, (s0) obj);
                        }
                    };
                    rVarH.v(objE14);
                }
                Function0.a(c2Var3, (l) objE14, rVarH, 0);
                boolean zG11110 = rVarH.G(s3Var) | rVarH.G(v0Var2);
                if (i99 == 4) {
                    z69 = true;
                } else {
                    z69 = false;
                }
                z75 = z69 | zG11110 | ((i102 <= 32 && rVarH.W(imeOptions7)) || (i101 & 48) == 32);
                objE15 = rVarH.E();
                if (z75) {
                    objE15 = new l() { // from class: n1.y1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                        }
                    };
                    rVarH.v(objE15);
                } else {
                    objE15 = new l() { // from class: n1.y1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                        }
                    };
                    rVarH.v(objE15);
                }
                Function0.a(imeOptions7, (l) objE15, rVarH, i1014 & 14);
                l<TextFieldValue, i0> lVarR10 = s3Var.r();
                boolean z8111116 = !z37;
                i103 = i95;
                if (i103 == 1) {
                    z76 = true;
                } else {
                    z76 = false;
                }
                m mVarB119 = i5.b(companion2, s3Var, c2Var3, textFieldValue, lVarR10, z8111116, z76, i0Var2, i7Var, imeOptions7.getImeAction());
                keyboardType = imeOptions7.getKeyboardType();
                companion3 = a0.INSTANCE;
                if (a0.n(keyboardType, companion3.f())) {
                    z77 = false;
                } else {
                    z77 = false;
                }
                boolean zC11 = C(f6VarP);
                zA = rVarH.a(z77) | rVarH.G(k1Var);
                objE16 = rVarH.E();
                if (zA) {
                    objE16 = new er.a() { // from class: n1.z1
                        @Override // er.a
                        public final Object a() {
                            return j2.G(z77, k1Var);
                        }
                    };
                    rVarH.v(objE16);
                } else {
                    objE16 = new er.a() { // from class: n1.z1
                        @Override // er.a
                        public final Object a() {
                            return j2.G(z77, k1Var);
                        }
                    };
                    rVarH.v(objE16);
                }
                m mVarB1110 = v1.b.b(companion2, zC11, z77, (er.a) objE16);
                cVarE = l.e((androidx.compose.ui.graphics.c) rVarH.N(l.c()), ((Color) rVarH.N(l.d())).m20unboximpl(), m.a());
                zG4 = rVarH.G(s3Var) | rVarH.W(cVarE);
                objE17 = rVarH.E();
                if (zG4) {
                    objE17 = new l() { // from class: n1.h2
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.H(s3Var, cVarE, (c) obj);
                        }
                    };
                    rVarH.v(objE17);
                } else {
                    objE17 = new l() { // from class: n1.h2
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.H(s3Var, cVarE, (c) obj);
                        }
                    };
                    rVarH.v(objE17);
                }
                m mVarD10 = k3.k.d(companion2, (l) objE17);
                m mVar113 = mVar4;
                final a6 a6Var15 = a6Var5;
                m mVarA11117 = a0(p036e4.l1.a(u5.f(g0(u4.b(h1.a(mVar113.u(mVarD10), k1Var, s3Var, c2Var3).u(mVarB1110).u(mVarA11113), s3Var, oVar), s3Var, c2Var3).u(mVarB119), a6Var15, lVar15, z58, x5.a(rVarH, 0)).u(mVarA11114).u(hVar10), new l() { // from class: n1.n1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j2.I(s3Var, (b0) obj);
                    }
                }), c2Var3, p0Var2);
                if (!z58) {
                    z78 = false;
                } else {
                    z78 = false;
                }
                if (z78) {
                    mVarZ = c3.z(companion2, c2Var3);
                } else {
                    mVarZ = companion2;
                }
                final m mVar114 = mVarZ;
                final q qVar12 = qVarB;
                P(mVarA11117, c2Var3, y2.m.d(-814563849, true, new p() { // from class: n1.o1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j2.J(qVar12, s3Var, textStyle4, z38, i98, i103, a6Var15, textFieldValue, e1Var12, mVarA11116, mVarB118, mVarA11115, mVar114, aVar11, c2Var3, z78, z37, lVar7, i0Var2, dVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                qVar2 = qVar12;
                i89 = i98;
                rVar2 = rVarH;
                e1Var2 = e1Var12;
                z26 = z37;
                lVar6 = lVar7;
                z25 = z58;
                a6Var2 = a6Var3;
                solidColor = cVar2;
                lVar5 = lVar15;
                l3Var2 = l3VarA;
                mVar3 = mVar113;
                i88 = i103;
                imeOptions2 = imeOptions7;
                z19 = z38;
                textStyle3 = textStyle4;
            } else {
                rVarH.O();
                z19 = z15;
                imeOptions2 = imeOptions;
                l3Var2 = l3Var;
                qVar2 = qVar;
                a6Var2 = a6Var;
                rVar2 = rVarH;
                textStyle3 = textStyle2;
                lVar6 = lVar4;
                e1Var2 = e1VarC;
                mVar3 = mVar2;
                i88 = i15;
                i89 = i16;
                z25 = z16;
                z26 = z17;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: n1.p1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j2.N(textFieldValue, lVar, mVar3, textStyle3, e1Var2, lVar6, lVar5, solidColor, z19, i88, i89, imeOptions2, l3Var2, z25, z26, qVar2, a6Var2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i25 |= MLKEMEngine.KyberPolyBytes;
        mVar2 = mVar;
        i26 = i19 & 8;
        if (i26 != 0) {
            if ((i17 & 3072) == 0) {
                textStyle2 = textStyle;
                if (rVarH.W(textStyle2)) {
                    i27 = 2048;
                } else {
                    i27 = 1024;
                }
                i25 |= i27;
            }
            i28 = i19 & 16;
            i29 = PKIFailureInfo.certRevoked;
            if (i28 != 0) {
                if ((i17 & 24576) == 0) {
                    e1VarC = e1Var;
                    if (rVarH.W(e1VarC)) {
                        i35 = 16384;
                    } else {
                        i35 = 8192;
                    }
                    i25 |= i35;
                }
                i36 = i19 & 32;
                if (i36 != 0) {
                    i25 |= 196608;
                    lVar4 = lVar2;
                } else {
                    lVar4 = lVar2;
                    if ((i17 & 196608) == 0) {
                        if (rVarH.G(lVar4)) {
                            i37 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i37 = 65536;
                        }
                        i25 |= i37;
                    }
                }
                i38 = i19 & 64;
                if (i38 != 0) {
                    i25 |= 1572864;
                    lVar5 = lVar3;
                } else {
                    lVar5 = lVar3;
                    if ((i17 & 1572864) == 0) {
                        if (rVarH.W(lVar5)) {
                            i39 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i39 = PKIFailureInfo.signerNotTrusted;
                        }
                        i25 |= i39;
                    }
                }
                i45 = i19 & 128;
                if (i45 != 0) {
                    i25 |= 12582912;
                    solidColor = cVar;
                } else {
                    solidColor = cVar;
                    if ((i17 & 12582912) == 0) {
                        if (rVarH.W(solidColor)) {
                            i46 = 8388608;
                        } else {
                            i46 = 4194304;
                        }
                        i25 |= i46;
                    }
                }
                i47 = i19 & 256;
                if (i47 != 0) {
                    i25 |= 100663296;
                } else if ((i17 & 100663296) == 0) {
                    if (rVarH.a(z15)) {
                        i48 = 67108864;
                    } else {
                        i48 = 33554432;
                    }
                    i25 |= i48;
                }
                i49 = i19 & 512;
                if (i49 != 0) {
                    if ((i17 & 805306368) == 0) {
                        if (rVarH.c(i15)) {
                            i55 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i55 = 268435456;
                        }
                        i25 |= i55;
                    }
                    i56 = i19 & 1024;
                    if (i56 != 0) {
                        i57 = i18 | 6;
                    } else if ((i18 & 6) == 0) {
                        if (rVarH.c(i16)) {
                            i58 = 4;
                        } else {
                            i58 = 2;
                        }
                        i57 = i18 | i58;
                    } else {
                        i57 = i18;
                    }
                    if ((i18 & 48) != 0) {
                        i57 |= ((i19 & 2048) == 0 || !rVarH.W(imeOptions)) ? 16 : 32;
                    }
                    i59 = i57;
                    i65 = i19 & PKIFailureInfo.certConfirmed;
                    if (i65 != 0) {
                        i66 = i59 | MLKEMEngine.KyberPolyBytes;
                    } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                        if (rVarH.W(l3Var)) {
                            i67 = 256;
                        } else {
                            i67 = 128;
                        }
                        i66 = i59 | i67;
                    } else {
                        i66 = i59;
                    }
                    i68 = i19 & PKIFailureInfo.certRevoked;
                    if (i68 != 0) {
                        i75 = i66 | 3072;
                    } else {
                        i69 = i66;
                        if ((i18 & 3072) == 0) {
                            i75 = i69 | (rVarH.a(z16) ? 2048 : 1024);
                        } else {
                            i75 = i69;
                        }
                    }
                    i76 = i19 & 16384;
                    if (i76 != 0) {
                        i78 = i75 | 24576;
                    } else {
                        i77 = i75;
                        if ((i18 & 24576) == 0) {
                            if (rVarH.a(z17)) {
                                i29 = 16384;
                            }
                            i78 = i77 | i29;
                        } else {
                            i78 = i77;
                        }
                    }
                    i79 = i19 & 32768;
                    if (i79 != 0) {
                        i78 |= 196608;
                    } else if ((i18 & 196608) == 0) {
                        if (rVarH.G(qVar)) {
                            i85 = PKIFailureInfo.unsupportedVersion;
                        } else {
                            i85 = 65536;
                        }
                        i78 |= i85;
                    }
                    i86 = i19 & PKIFailureInfo.notAuthorized;
                    if (i86 != 0) {
                        i78 |= 1572864;
                    } else if ((i18 & 1572864) == 0) {
                        if (rVarH.W(a6Var)) {
                            i87 = PKIFailureInfo.badCertTemplate;
                        } else {
                            i87 = PKIFailureInfo.signerNotTrusted;
                        }
                        i78 |= i87;
                    }
                    if ((i25 & 306783379) == 306783378) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if (rVarH.r(z18, i25 & 1)) {
                        rVarH.I();
                        if ((i17 & 1) != 0) {
                            if (i104 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i26 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i28 != 0) {
                                e1VarC = e1.INSTANCE.c();
                            }
                            if (i36 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: n1.g2
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return j2.x((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar4 = (l) objE;
                            }
                            if (i38 != 0) {
                                lVar5 = null;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.h(), null);
                            }
                            if (i47 != 0) {
                                z27 = true;
                            } else {
                                z27 = z15;
                            }
                            if (i49 != 0) {
                                i95 = Integer.MAX_VALUE;
                            } else {
                                i95 = i15;
                            }
                            if (i56 != 0) {
                                i96 = 1;
                            } else {
                                i96 = i16;
                            }
                            if ((i19 & 2048) != 0) {
                                imeOptionsA = ImeOptions.INSTANCE.a();
                                i78 &= -113;
                            } else {
                                imeOptionsA = imeOptions;
                            }
                            if (i65 != 0) {
                                l3VarA = l3.INSTANCE.a();
                            } else {
                                l3VarA = l3Var;
                            }
                            if (i68 != 0) {
                                z28 = true;
                            } else {
                                z28 = z16;
                            }
                            if (i76 != 0) {
                                z29 = false;
                            } else {
                                z29 = z17;
                            }
                            if (i79 != 0) {
                                qVarB = g1.f130036a.b();
                            } else {
                                qVarB = qVar;
                            }
                            if (i86 != 0) {
                                a6Var3 = null;
                            } else {
                                a6Var3 = a6Var;
                            }
                            lVar7 = lVar4;
                            imeOptions3 = imeOptionsA;
                            z35 = z27;
                            textStyle2 = textStyleA;
                            mVar4 = mVar2;
                            z36 = z28;
                            z37 = z29;
                        } else {
                            if (i104 != 0) {
                                mVar2 = m.INSTANCE;
                            }
                            if (i26 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i28 != 0) {
                                e1VarC = e1.INSTANCE.c();
                            }
                            if (i36 != 0) {
                                objE = rVarH.E();
                                if (objE == r.INSTANCE.a()) {
                                    objE = new l() { // from class: n1.g2
                                        @Override // er.l
                                        public final Object b(Object obj) {
                                            return j2.x((TextLayoutResult) obj);
                                        }
                                    };
                                    rVarH.v(objE);
                                }
                                lVar4 = (l) objE;
                            }
                            if (i38 != 0) {
                                lVar5 = null;
                            }
                            if (i45 != 0) {
                                solidColor = new SolidColor(Color.INSTANCE.h(), null);
                            }
                            if (i47 != 0) {
                                z27 = true;
                            } else {
                                z27 = z15;
                            }
                            if (i49 != 0) {
                                i95 = Integer.MAX_VALUE;
                            } else {
                                i95 = i15;
                            }
                            if (i56 != 0) {
                                i96 = 1;
                            } else {
                                i96 = i16;
                            }
                            if ((i19 & 2048) != 0) {
                                imeOptionsA = ImeOptions.INSTANCE.a();
                                i78 &= -113;
                            } else {
                                imeOptionsA = imeOptions;
                            }
                            if (i65 != 0) {
                                l3VarA = l3.INSTANCE.a();
                            } else {
                                l3VarA = l3Var;
                            }
                            if (i68 != 0) {
                                z28 = true;
                            } else {
                                z28 = z16;
                            }
                            if (i76 != 0) {
                                z29 = false;
                            } else {
                                z29 = z17;
                            }
                            if (i79 != 0) {
                                qVarB = g1.f130036a.b();
                            } else {
                                qVarB = qVar;
                            }
                            if (i86 != 0) {
                                a6Var3 = null;
                            } else {
                                a6Var3 = a6Var;
                            }
                            lVar7 = lVar4;
                            imeOptions3 = imeOptionsA;
                            z35 = z27;
                            textStyle2 = textStyleA;
                            mVar4 = mVar2;
                            z36 = z28;
                            z37 = z29;
                        }
                        rVarH.y();
                        z38 = z35;
                        if (p076m2.t.k()) {
                            p076m2.t.o(31062401, i25, i78, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                        }
                        objE2 = rVarH.E();
                        companion = r.INSTANCE;
                        if (objE2 == companion.a()) {
                            objE2 = new d0();
                            rVarH.v(objE2);
                        }
                        d0Var = (d0) objE2;
                        objE3 = rVarH.E();
                        i97 = i25;
                        if (objE3 == companion.a()) {
                            objE3 = l1.b();
                            rVarH.v(objE3);
                        }
                        k1Var = (k1) objE3;
                        objE4 = rVarH.E();
                        cVar2 = solidColor;
                        if (objE4 == companion.a()) {
                            objE4 = new v0(k1Var);
                            rVarH.v(objE4);
                        }
                        v0Var = (v0) objE4;
                        dVar = (c5.d) rVarH.N(g1.f());
                        bVar = (u4.l.b) rVarH.N(g1.h());
                        selectionBackgroundColor = ((SelectionColors) rVarH.N(g3.c())).getSelectionBackgroundColor();
                        oVar = (o) rVarH.N(g1.g());
                        n3Var = (n3) rVarH.N(g1.v());
                        textStyle4 = textStyle2;
                        r2Var = (r2) rVarH.N(g1.r());
                        i98 = i96;
                        if (i95 == 1) {
                            a2Var = p143z0.a2.Vertical;
                        } else {
                            a2Var = p143z0.a2.Vertical;
                        }
                        if (a6Var3 == null) {
                            rVarH.X(-213744626);
                            Object[] objArr9 = {a2Var};
                            b3.x<a6, Object> xVarA9 = a6.INSTANCE.a();
                            zC = rVarH.c(a2Var.ordinal());
                            objE18 = rVarH.E();
                            if (zC) {
                                objE18 = new er.a() { // from class: n1.q1
                                    @Override // er.a
                                    public final Object a() {
                                        return j2.O(a2Var);
                                    }
                                };
                                rVarH.v(objE18);
                            } else {
                                objE18 = new er.a() { // from class: n1.q1
                                    @Override // er.a
                                    public final Object a() {
                                        return j2.O(a2Var);
                                    }
                                };
                                rVarH.v(objE18);
                            }
                            a6Var4 = (a6) b3.f.i(objArr9, xVarA9, (er.a) objE18, rVarH, 0);
                            rVarH.R();
                        } else {
                            rVarH.X(-213745742);
                            rVarH.R();
                            a6Var4 = a6Var3;
                        }
                        if (a6Var4.j() != a2Var) {
                            StringBuilder sb13 = new StringBuilder();
                            sb13.append("Mismatching scroller orientation; ");
                            if (a2Var == p143z0.a2.Vertical) {
                                str = "only single-line, non-wrap text fields can scroll horizontally";
                            } else {
                                str = "single-line, non-wrap text fields can only scroll horizontally";
                            }
                            sb13.append(str);
                            throw new IllegalArgumentException(sb13.toString());
                        }
                        i99 = i97 & 14;
                        if (i99 == 4) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        if ((i97 & 57344) == 16384) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        z46 = z39 | z45;
                        objE5 = rVarH.E();
                        if (z46) {
                            transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                            composition = textFieldValue.getComposition();
                            if (composition != null) {
                                a6Var5 = a6Var4;
                                transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                if (transformedTextC2 != null) {
                                    objE5 = transformedTextC2;
                                }
                                rVarH.v(objE5);
                            } else {
                                a6Var5 = a6Var4;
                            }
                            objE5 = transformedTextC;
                            rVarH.v(objE5);
                        } else {
                            transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                            composition = textFieldValue.getComposition();
                            if (composition != null) {
                                a6Var5 = a6Var4;
                                transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                                if (transformedTextC2 != null) {
                                    objE5 = transformedTextC2;
                                }
                                rVarH.v(objE5);
                            } else {
                                a6Var5 = a6Var4;
                            }
                            objE5 = transformedTextC;
                            rVarH.v(objE5);
                        }
                        TransformedText transformedText9 = (TransformedText) objE5;
                        text = transformedText9.getText();
                        offsetMapping = transformedText9.getOffsetMapping();
                        d4VarC = p076m2.m.c(rVarH, 0);
                        zW = rVarH.W(r2Var);
                        objE6 = rVarH.E();
                        if (zW) {
                            objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                            rVarH.v(objE6);
                        } else {
                            objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                            rVarH.v(objE6);
                        }
                        s3Var = (s3) objE6;
                        s3Var.X(textFieldValue.getText(), text, textStyle4, z38, r55, bVar, lVar, l3VarA, oVar, selectionBackgroundColor);
                        s3Var.getProcessor().e(textFieldValue, s3Var.getInputSession());
                        objE7 = rVarH.E();
                        if (objE7 == companion.a()) {
                            objE7 = new i7(0, 1, null);
                            rVarH.v(objE7);
                        }
                        i7Var = (i7) objE7;
                        i7.f(i7Var, textFieldValue, 0L, 2, null);
                        objE8 = rVarH.E();
                        if (objE8 == companion.a()) {
                            objE8 = Function0.i(tq.j.f191408a, rVarH);
                            rVarH.v(objE8);
                        }
                        p0Var = (p0) objE8;
                        objE9 = rVarH.E();
                        if (objE9 == companion.a()) {
                            objE9 = j1.e.a();
                            rVarH.v(objE9);
                        }
                        aVar = (j1.a) objE9;
                        objE10 = rVarH.E();
                        b1.l lVar16 = lVar5;
                        if (objE10 == companion.a()) {
                            objE10 = new c2(i7Var);
                            rVarH.v(objE10);
                        }
                        c2Var = (c2) objE10;
                        c2Var.L0(offsetMapping);
                        c2Var.U0(e1VarC);
                        c2Var.M0(s3Var.r());
                        c2Var.Q0(s3Var);
                        c2Var.T0(textFieldValue);
                        c2Var.z0((androidx.compose.ui.platform.b1) rVarH.N(g1.d()));
                        c2Var.A0(p0Var);
                        c2Var.R0((v2) rVarH.N(g1.s()));
                        c2Var.I0((v3.a) rVarH.N(g1.j()));
                        c2Var.G0(d0Var);
                        c2Var.E0(!z37);
                        c2Var.F0(z36);
                        if (g0.isSmartSelectionEnabled) {
                            rVarH.X(1966756105);
                            c2Var.N0(f0.h(z1.i0.EditableText, textStyle4.w(), rVarH, 6));
                            rVarH.R();
                        } else {
                            rVarH.X(1966902177);
                            rVarH.R();
                        }
                        s3Var.h();
                        new l() { // from class: n1.r1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.y(c2Var, (q4.e) obj);
                            }
                        };
                        new er.a() { // from class: n1.s1
                            @Override // er.a
                            public final Object a() {
                                return j2.z(c2Var);
                            }
                        };
                        new er.a() { // from class: n1.t1
                            @Override // er.a
                            public final Object a() {
                                return j2.A(c2Var);
                            }
                        };
                        companion2 = m.INSTANCE;
                        boolean zG11111 = rVarH.G(s3Var);
                        i100 = i78 & 7168;
                        i101 = i78;
                        if (i100 == 2048) {
                            z47 = true;
                        } else {
                            z47 = false;
                        }
                        boolean z717 = z47 | zG11111;
                        if ((i101 & 57344) == 16384) {
                            z48 = true;
                        } else {
                            z48 = false;
                        }
                        boolean zG11112 = z717 | z48 | rVarH.G(v0Var);
                        if (i99 == 4) {
                            z49 = true;
                        } else {
                            z49 = false;
                        }
                        boolean z8111117 = zG11112 | z49;
                        i102 = (i101 & 112) ^ 48;
                        if (i102 > 32) {
                            v0Var2 = v0Var;
                            if ((i101 & 48) != 32) {
                                z55 = true;
                            } else {
                                z55 = false;
                            }
                        } else {
                            v0Var2 = v0Var;
                            if ((i101 & 48) != 32) {
                                z55 = true;
                            } else {
                                z55 = false;
                            }
                        }
                        zG = z8111117 | z55 | rVarH.G(offsetMapping) | rVarH.G(p0Var) | rVarH.G(aVar) | rVarH.G(c2Var);
                        objE11 = rVarH.E();
                        if (zG) {
                            final ImeOptions imeOptions11114 = imeOptions3;
                            i0Var = offsetMapping;
                            final boolean z8111118 = z36;
                            final boolean z8111119 = z37;
                            objE11 = new l() { // from class: n1.u1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.B(s3Var, z8111118, z8111119, v0Var2, textFieldValue, imeOptions11114, i0Var, c2Var, p0Var, aVar, (l0) obj);
                                }
                            };
                            z56 = z8111118;
                            textFieldValue2 = textFieldValue;
                            imeOptions4 = imeOptions11114;
                            c2Var2 = c2Var;
                            p0Var2 = p0Var;
                            aVar2 = aVar;
                            rVarH.v(objE11);
                        } else {
                            final ImeOptions imeOptions11115 = imeOptions3;
                            i0Var = offsetMapping;
                            final boolean z81111110 = z36;
                            final boolean z81111111 = z37;
                            objE11 = new l() { // from class: n1.u1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.B(s3Var, z81111110, z81111111, v0Var2, textFieldValue, imeOptions11115, i0Var, c2Var, p0Var, aVar, (l0) obj);
                                }
                            };
                            z56 = z81111110;
                            textFieldValue2 = textFieldValue;
                            imeOptions4 = imeOptions11115;
                            c2Var2 = c2Var;
                            p0Var2 = p0Var;
                            aVar2 = aVar;
                            rVarH.v(objE11);
                        }
                        final j1.a aVar12 = aVar2;
                        m mVarA11118 = v4.a(companion2, z56, d0Var, lVar16, (l) objE11);
                        if (z56) {
                            z57 = false;
                        } else {
                            z57 = false;
                        }
                        Boolean boolValueOf10 = Boolean.valueOf(z57);
                        z58 = z56;
                        f6VarP = x5.p(boolValueOf10, rVarH, 0);
                        i0 i0Var12 = i0.f148189a;
                        boolean zW111 = rVarH.W(f6VarP) | rVarH.G(s3Var) | rVarH.G(v0Var2) | rVarH.G(c2Var2);
                        if (i102 > 32) {
                            imeOptions5 = imeOptions4;
                            if ((i101 & 48) != 32) {
                                z59 = true;
                            } else {
                                z59 = false;
                            }
                        } else {
                            imeOptions5 = imeOptions4;
                            if ((i101 & 48) != 32) {
                                z59 = true;
                            } else {
                                z59 = false;
                            }
                        }
                        z65 = zW111 | z59;
                        objE12 = rVarH.E();
                        if (z65) {
                            ImeOptions imeOptions11116 = imeOptions5;
                            objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions11116, null);
                            imeOptions6 = imeOptions11116;
                            rVarH.v(objE12);
                        } else {
                            ImeOptions imeOptions11117 = imeOptions5;
                            objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions11117, null);
                            imeOptions6 = imeOptions11117;
                            rVarH.v(objE12);
                        }
                        imeOptions7 = imeOptions6;
                        Function0.d(i0Var12, (p) objE12, rVarH, 6);
                        int i1015 = i101 >> 3;
                        c2Var3 = c2Var2;
                        m mVarA11119 = k5.a(companion2, c2Var3, z58, lVar16, s3Var, d0Var, z37, i0Var, rVarH, (i1015 & 896) | 196614 | ((i97 >> 9) & 7168) | ((i101 << 6) & 3670016));
                        i0Var2 = i0Var;
                        final m mVarB1111 = m2.b(companion2, s3Var, textFieldValue2, i0Var2);
                        boolean zG11113 = rVarH.G(s3Var);
                        if (i100 == 2048) {
                            z66 = true;
                        } else {
                            z66 = false;
                        }
                        boolean zW112 = zG11113 | z66 | rVarH.W(n3Var) | rVarH.G(c2Var3);
                        if (i99 == 4) {
                            z67 = true;
                        } else {
                            z67 = false;
                        }
                        zG2 = zW112 | z67 | rVarH.G(i0Var2);
                        objE13 = rVarH.E();
                        if (zG2) {
                            final TextFieldValue textFieldValue112 = textFieldValue2;
                            objE13 = new l() { // from class: n1.v1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue112, i0Var2, (b0) obj);
                                }
                            };
                            rVarH.v(objE13);
                        } else {
                            final TextFieldValue textFieldValue113 = textFieldValue2;
                            objE13 = new l() { // from class: n1.v1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue113, i0Var2, (b0) obj);
                                }
                            };
                            rVarH.v(objE13);
                        }
                        final m mVarA111110 = p036e4.l1.a(companion2, (l) objE13);
                        CoreTextFieldSemanticsModifier hVar11 = new CoreTextFieldSemanticsModifier(transformedText9, textFieldValue, s3Var, z37, z58, e1VarC instanceof v4.k0, i0Var2, c2Var3, imeOptions7, d0Var);
                        if (z58) {
                            z68 = false;
                        } else {
                            z68 = false;
                        }
                        final m mVarA111111 = m2.a(companion2, s3Var, textFieldValue, i0Var2, cVar2, z68);
                        zG3 = rVarH.G(c2Var3);
                        final e1 e1Var13 = e1VarC;
                        objE14 = rVarH.E();
                        if (zG3) {
                            objE14 = new l() { // from class: n1.w1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.E(c2Var3, (s0) obj);
                                }
                            };
                            rVarH.v(objE14);
                        } else {
                            objE14 = new l() { // from class: n1.w1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.E(c2Var3, (s0) obj);
                                }
                            };
                            rVarH.v(objE14);
                        }
                        Function0.a(c2Var3, (l) objE14, rVarH, 0);
                        boolean zG11114 = rVarH.G(s3Var) | rVarH.G(v0Var2);
                        if (i99 == 4) {
                            z69 = true;
                        } else {
                            z69 = false;
                        }
                        z75 = z69 | zG11114 | ((i102 <= 32 && rVarH.W(imeOptions7)) || (i101 & 48) == 32);
                        objE15 = rVarH.E();
                        if (z75) {
                            objE15 = new l() { // from class: n1.y1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                                }
                            };
                            rVarH.v(objE15);
                        } else {
                            objE15 = new l() { // from class: n1.y1
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                                }
                            };
                            rVarH.v(objE15);
                        }
                        Function0.a(imeOptions7, (l) objE15, rVarH, i1015 & 14);
                        l<TextFieldValue, i0> lVarR11 = s3Var.r();
                        boolean z81111112 = !z37;
                        i103 = i95;
                        if (i103 == 1) {
                            z76 = true;
                        } else {
                            z76 = false;
                        }
                        m mVarB1112 = i5.b(companion2, s3Var, c2Var3, textFieldValue, lVarR11, z81111112, z76, i0Var2, i7Var, imeOptions7.getImeAction());
                        keyboardType = imeOptions7.getKeyboardType();
                        companion3 = a0.INSTANCE;
                        if (a0.n(keyboardType, companion3.f())) {
                            z77 = false;
                        } else {
                            z77 = false;
                        }
                        boolean zC12 = C(f6VarP);
                        zA = rVarH.a(z77) | rVarH.G(k1Var);
                        objE16 = rVarH.E();
                        if (zA) {
                            objE16 = new er.a() { // from class: n1.z1
                                @Override // er.a
                                public final Object a() {
                                    return j2.G(z77, k1Var);
                                }
                            };
                            rVarH.v(objE16);
                        } else {
                            objE16 = new er.a() { // from class: n1.z1
                                @Override // er.a
                                public final Object a() {
                                    return j2.G(z77, k1Var);
                                }
                            };
                            rVarH.v(objE16);
                        }
                        m mVarB1113 = v1.b.b(companion2, zC12, z77, (er.a) objE16);
                        cVarE = l.e((androidx.compose.ui.graphics.c) rVarH.N(l.c()), ((Color) rVarH.N(l.d())).m20unboximpl(), m.a());
                        zG4 = rVarH.G(s3Var) | rVarH.W(cVarE);
                        objE17 = rVarH.E();
                        if (zG4) {
                            objE17 = new l() { // from class: n1.h2
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.H(s3Var, cVarE, (c) obj);
                                }
                            };
                            rVarH.v(objE17);
                        } else {
                            objE17 = new l() { // from class: n1.h2
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.H(s3Var, cVarE, (c) obj);
                                }
                            };
                            rVarH.v(objE17);
                        }
                        m mVarD11 = k3.k.d(companion2, (l) objE17);
                        m mVar115 = mVar4;
                        final a6 a6Var16 = a6Var5;
                        m mVarA111112 = a0(p036e4.l1.a(u5.f(g0(u4.b(h1.a(mVar115.u(mVarD11), k1Var, s3Var, c2Var3).u(mVarB1113).u(mVarA11118), s3Var, oVar), s3Var, c2Var3).u(mVarB1112), a6Var16, lVar16, z58, x5.a(rVarH, 0)).u(mVarA11119).u(hVar11), new l() { // from class: n1.n1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.I(s3Var, (b0) obj);
                            }
                        }), c2Var3, p0Var2);
                        if (!z58) {
                            z78 = false;
                        } else {
                            z78 = false;
                        }
                        if (z78) {
                            mVarZ = c3.z(companion2, c2Var3);
                        } else {
                            mVarZ = companion2;
                        }
                        final m mVar116 = mVarZ;
                        final q qVar13 = qVarB;
                        P(mVarA111112, c2Var3, y2.m.d(-814563849, true, new p() { // from class: n1.o1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j2.J(qVar13, s3Var, textStyle4, z38, i98, i103, a6Var16, textFieldValue, e1Var13, mVarA111111, mVarB1111, mVarA111110, mVar116, aVar12, c2Var3, z78, z37, lVar7, i0Var2, dVar, (r) obj, ((Integer) obj2).intValue());
                            }
                        }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                        qVar2 = qVar13;
                        i89 = i98;
                        rVar2 = rVarH;
                        e1Var2 = e1Var13;
                        z26 = z37;
                        lVar6 = lVar7;
                        z25 = z58;
                        a6Var2 = a6Var3;
                        solidColor = cVar2;
                        lVar5 = lVar16;
                        l3Var2 = l3VarA;
                        mVar3 = mVar115;
                        i88 = i103;
                        imeOptions2 = imeOptions7;
                        z19 = z38;
                        textStyle3 = textStyle4;
                    } else {
                        rVarH.O();
                        z19 = z15;
                        imeOptions2 = imeOptions;
                        l3Var2 = l3Var;
                        qVar2 = qVar;
                        a6Var2 = a6Var;
                        rVar2 = rVarH;
                        textStyle3 = textStyle2;
                        lVar6 = lVar4;
                        e1Var2 = e1VarC;
                        mVar3 = mVar2;
                        i88 = i15;
                        i89 = i16;
                        z25 = z16;
                        z26 = z17;
                    }
                    d5VarM = rVar2.m();
                    if (d5VarM != null) {
                        d5VarM.a(new p() { // from class: n1.p1
                            @Override // er.p
                            public final Object B(Object obj, Object obj2) {
                                return j2.N(textFieldValue, lVar, mVar3, textStyle3, e1Var2, lVar6, lVar5, solidColor, z19, i88, i89, imeOptions2, l3Var2, z25, z26, qVar2, a6Var2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i25 |= 805306368;
                i56 = i19 & 1024;
                if (i56 != 0) {
                    i57 = i18 | 6;
                } else if ((i18 & 6) == 0) {
                    if (rVarH.c(i16)) {
                        i58 = 4;
                    } else {
                        i58 = 2;
                    }
                    i57 = i18 | i58;
                } else {
                    i57 = i18;
                }
                if ((i18 & 48) != 0) {
                    i57 |= ((i19 & 2048) == 0 || !rVarH.W(imeOptions)) ? 16 : 32;
                }
                i59 = i57;
                i65 = i19 & PKIFailureInfo.certConfirmed;
                if (i65 != 0) {
                    i66 = i59 | MLKEMEngine.KyberPolyBytes;
                } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                    if (rVarH.W(l3Var)) {
                        i67 = 256;
                    } else {
                        i67 = 128;
                    }
                    i66 = i59 | i67;
                } else {
                    i66 = i59;
                }
                i68 = i19 & PKIFailureInfo.certRevoked;
                if (i68 != 0) {
                    i75 = i66 | 3072;
                } else {
                    i69 = i66;
                    if ((i18 & 3072) == 0) {
                        i75 = i69 | (rVarH.a(z16) ? 2048 : 1024);
                    } else {
                        i75 = i69;
                    }
                }
                i76 = i19 & 16384;
                if (i76 != 0) {
                    i78 = i75 | 24576;
                } else {
                    i77 = i75;
                    if ((i18 & 24576) == 0) {
                        if (rVarH.a(z17)) {
                            i29 = 16384;
                        }
                        i78 = i77 | i29;
                    } else {
                        i78 = i77;
                    }
                }
                i79 = i19 & 32768;
                if (i79 != 0) {
                    i78 |= 196608;
                } else if ((i18 & 196608) == 0) {
                    if (rVarH.G(qVar)) {
                        i85 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i85 = 65536;
                    }
                    i78 |= i85;
                }
                i86 = i19 & PKIFailureInfo.notAuthorized;
                if (i86 != 0) {
                    i78 |= 1572864;
                } else if ((i18 & 1572864) == 0) {
                    if (rVarH.W(a6Var)) {
                        i87 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i87 = PKIFailureInfo.signerNotTrusted;
                    }
                    i78 |= i87;
                }
                if ((i25 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (rVarH.r(z18, i25 & 1)) {
                    rVarH.I();
                    if ((i17 & 1) != 0) {
                        if (i104 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i28 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        }
                        if (i36 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.g2
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j2.x((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar4 = (l) objE;
                        }
                        if (i38 != 0) {
                            lVar5 = null;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.h(), null);
                        }
                        if (i47 != 0) {
                            z27 = true;
                        } else {
                            z27 = z15;
                        }
                        if (i49 != 0) {
                            i95 = Integer.MAX_VALUE;
                        } else {
                            i95 = i15;
                        }
                        if (i56 != 0) {
                            i96 = 1;
                        } else {
                            i96 = i16;
                        }
                        if ((i19 & 2048) != 0) {
                            imeOptionsA = ImeOptions.INSTANCE.a();
                            i78 &= -113;
                        } else {
                            imeOptionsA = imeOptions;
                        }
                        if (i65 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var;
                        }
                        if (i68 != 0) {
                            z28 = true;
                        } else {
                            z28 = z16;
                        }
                        if (i76 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if (i79 != 0) {
                            qVarB = g1.f130036a.b();
                        } else {
                            qVarB = qVar;
                        }
                        if (i86 != 0) {
                            a6Var3 = null;
                        } else {
                            a6Var3 = a6Var;
                        }
                        lVar7 = lVar4;
                        imeOptions3 = imeOptionsA;
                        z35 = z27;
                        textStyle2 = textStyleA;
                        mVar4 = mVar2;
                        z36 = z28;
                        z37 = z29;
                    } else {
                        if (i104 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i28 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        }
                        if (i36 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.g2
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j2.x((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar4 = (l) objE;
                        }
                        if (i38 != 0) {
                            lVar5 = null;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.h(), null);
                        }
                        if (i47 != 0) {
                            z27 = true;
                        } else {
                            z27 = z15;
                        }
                        if (i49 != 0) {
                            i95 = Integer.MAX_VALUE;
                        } else {
                            i95 = i15;
                        }
                        if (i56 != 0) {
                            i96 = 1;
                        } else {
                            i96 = i16;
                        }
                        if ((i19 & 2048) != 0) {
                            imeOptionsA = ImeOptions.INSTANCE.a();
                            i78 &= -113;
                        } else {
                            imeOptionsA = imeOptions;
                        }
                        if (i65 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var;
                        }
                        if (i68 != 0) {
                            z28 = true;
                        } else {
                            z28 = z16;
                        }
                        if (i76 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if (i79 != 0) {
                            qVarB = g1.f130036a.b();
                        } else {
                            qVarB = qVar;
                        }
                        if (i86 != 0) {
                            a6Var3 = null;
                        } else {
                            a6Var3 = a6Var;
                        }
                        lVar7 = lVar4;
                        imeOptions3 = imeOptionsA;
                        z35 = z27;
                        textStyle2 = textStyleA;
                        mVar4 = mVar2;
                        z36 = z28;
                        z37 = z29;
                    }
                    rVarH.y();
                    z38 = z35;
                    if (p076m2.t.k()) {
                        p076m2.t.o(31062401, i25, i78, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                    }
                    objE2 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE2 == companion.a()) {
                        objE2 = new d0();
                        rVarH.v(objE2);
                    }
                    d0Var = (d0) objE2;
                    objE3 = rVarH.E();
                    i97 = i25;
                    if (objE3 == companion.a()) {
                        objE3 = l1.b();
                        rVarH.v(objE3);
                    }
                    k1Var = (k1) objE3;
                    objE4 = rVarH.E();
                    cVar2 = solidColor;
                    if (objE4 == companion.a()) {
                        objE4 = new v0(k1Var);
                        rVarH.v(objE4);
                    }
                    v0Var = (v0) objE4;
                    dVar = (c5.d) rVarH.N(g1.f());
                    bVar = (u4.l.b) rVarH.N(g1.h());
                    selectionBackgroundColor = ((SelectionColors) rVarH.N(g3.c())).getSelectionBackgroundColor();
                    oVar = (o) rVarH.N(g1.g());
                    n3Var = (n3) rVarH.N(g1.v());
                    textStyle4 = textStyle2;
                    r2Var = (r2) rVarH.N(g1.r());
                    i98 = i96;
                    if (i95 == 1) {
                        a2Var = p143z0.a2.Vertical;
                    } else {
                        a2Var = p143z0.a2.Vertical;
                    }
                    if (a6Var3 == null) {
                        rVarH.X(-213744626);
                        Object[] objArr10 = {a2Var};
                        b3.x<a6, Object> xVarA10 = a6.INSTANCE.a();
                        zC = rVarH.c(a2Var.ordinal());
                        objE18 = rVarH.E();
                        if (zC) {
                            objE18 = new er.a() { // from class: n1.q1
                                @Override // er.a
                                public final Object a() {
                                    return j2.O(a2Var);
                                }
                            };
                            rVarH.v(objE18);
                        } else {
                            objE18 = new er.a() { // from class: n1.q1
                                @Override // er.a
                                public final Object a() {
                                    return j2.O(a2Var);
                                }
                            };
                            rVarH.v(objE18);
                        }
                        a6Var4 = (a6) b3.f.i(objArr10, xVarA10, (er.a) objE18, rVarH, 0);
                        rVarH.R();
                    } else {
                        rVarH.X(-213745742);
                        rVarH.R();
                        a6Var4 = a6Var3;
                    }
                    if (a6Var4.j() != a2Var) {
                        StringBuilder sb14 = new StringBuilder();
                        sb14.append("Mismatching scroller orientation; ");
                        if (a2Var == p143z0.a2.Vertical) {
                            str = "only single-line, non-wrap text fields can scroll horizontally";
                        } else {
                            str = "single-line, non-wrap text fields can only scroll horizontally";
                        }
                        sb14.append(str);
                        throw new IllegalArgumentException(sb14.toString());
                    }
                    i99 = i97 & 14;
                    if (i99 == 4) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    if ((i97 & 57344) == 16384) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    z46 = z39 | z45;
                    objE5 = rVarH.E();
                    if (z46) {
                        transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                        composition = textFieldValue.getComposition();
                        if (composition != null) {
                            a6Var5 = a6Var4;
                            transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                            if (transformedTextC2 != null) {
                                objE5 = transformedTextC2;
                            }
                            rVarH.v(objE5);
                        } else {
                            a6Var5 = a6Var4;
                        }
                        objE5 = transformedTextC;
                        rVarH.v(objE5);
                    } else {
                        transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                        composition = textFieldValue.getComposition();
                        if (composition != null) {
                            a6Var5 = a6Var4;
                            transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                            if (transformedTextC2 != null) {
                                objE5 = transformedTextC2;
                            }
                            rVarH.v(objE5);
                        } else {
                            a6Var5 = a6Var4;
                        }
                        objE5 = transformedTextC;
                        rVarH.v(objE5);
                    }
                    TransformedText transformedText10 = (TransformedText) objE5;
                    text = transformedText10.getText();
                    offsetMapping = transformedText10.getOffsetMapping();
                    d4VarC = p076m2.m.c(rVarH, 0);
                    zW = rVarH.W(r2Var);
                    objE6 = rVarH.E();
                    if (zW) {
                        objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                        rVarH.v(objE6);
                    } else {
                        objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                        rVarH.v(objE6);
                    }
                    s3Var = (s3) objE6;
                    s3Var.X(textFieldValue.getText(), text, textStyle4, z38, r55, bVar, lVar, l3VarA, oVar, selectionBackgroundColor);
                    s3Var.getProcessor().e(textFieldValue, s3Var.getInputSession());
                    objE7 = rVarH.E();
                    if (objE7 == companion.a()) {
                        objE7 = new i7(0, 1, null);
                        rVarH.v(objE7);
                    }
                    i7Var = (i7) objE7;
                    i7.f(i7Var, textFieldValue, 0L, 2, null);
                    objE8 = rVarH.E();
                    if (objE8 == companion.a()) {
                        objE8 = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE8);
                    }
                    p0Var = (p0) objE8;
                    objE9 = rVarH.E();
                    if (objE9 == companion.a()) {
                        objE9 = j1.e.a();
                        rVarH.v(objE9);
                    }
                    aVar = (j1.a) objE9;
                    objE10 = rVarH.E();
                    b1.l lVar17 = lVar5;
                    if (objE10 == companion.a()) {
                        objE10 = new c2(i7Var);
                        rVarH.v(objE10);
                    }
                    c2Var = (c2) objE10;
                    c2Var.L0(offsetMapping);
                    c2Var.U0(e1VarC);
                    c2Var.M0(s3Var.r());
                    c2Var.Q0(s3Var);
                    c2Var.T0(textFieldValue);
                    c2Var.z0((androidx.compose.ui.platform.b1) rVarH.N(g1.d()));
                    c2Var.A0(p0Var);
                    c2Var.R0((v2) rVarH.N(g1.s()));
                    c2Var.I0((v3.a) rVarH.N(g1.j()));
                    c2Var.G0(d0Var);
                    c2Var.E0(!z37);
                    c2Var.F0(z36);
                    if (g0.isSmartSelectionEnabled) {
                        rVarH.X(1966756105);
                        c2Var.N0(f0.h(z1.i0.EditableText, textStyle4.w(), rVarH, 6));
                        rVarH.R();
                    } else {
                        rVarH.X(1966902177);
                        rVarH.R();
                    }
                    s3Var.h();
                    new l() { // from class: n1.r1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.y(c2Var, (q4.e) obj);
                        }
                    };
                    new er.a() { // from class: n1.s1
                        @Override // er.a
                        public final Object a() {
                            return j2.z(c2Var);
                        }
                    };
                    new er.a() { // from class: n1.t1
                        @Override // er.a
                        public final Object a() {
                            return j2.A(c2Var);
                        }
                    };
                    companion2 = m.INSTANCE;
                    boolean zG11115 = rVarH.G(s3Var);
                    i100 = i78 & 7168;
                    i101 = i78;
                    if (i100 == 2048) {
                        z47 = true;
                    } else {
                        z47 = false;
                    }
                    boolean z718 = z47 | zG11115;
                    if ((i101 & 57344) == 16384) {
                        z48 = true;
                    } else {
                        z48 = false;
                    }
                    boolean zG11116 = z718 | z48 | rVarH.G(v0Var);
                    if (i99 == 4) {
                        z49 = true;
                    } else {
                        z49 = false;
                    }
                    boolean z81111113 = zG11116 | z49;
                    i102 = (i101 & 112) ^ 48;
                    if (i102 > 32) {
                        v0Var2 = v0Var;
                        if ((i101 & 48) != 32) {
                            z55 = true;
                        } else {
                            z55 = false;
                        }
                    } else {
                        v0Var2 = v0Var;
                        if ((i101 & 48) != 32) {
                            z55 = true;
                        } else {
                            z55 = false;
                        }
                    }
                    zG = z81111113 | z55 | rVarH.G(offsetMapping) | rVarH.G(p0Var) | rVarH.G(aVar) | rVarH.G(c2Var);
                    objE11 = rVarH.E();
                    if (zG) {
                        final ImeOptions imeOptions11118 = imeOptions3;
                        i0Var = offsetMapping;
                        final boolean z81111114 = z36;
                        final boolean z81111115 = z37;
                        objE11 = new l() { // from class: n1.u1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.B(s3Var, z81111114, z81111115, v0Var2, textFieldValue, imeOptions11118, i0Var, c2Var, p0Var, aVar, (l0) obj);
                            }
                        };
                        z56 = z81111114;
                        textFieldValue2 = textFieldValue;
                        imeOptions4 = imeOptions11118;
                        c2Var2 = c2Var;
                        p0Var2 = p0Var;
                        aVar2 = aVar;
                        rVarH.v(objE11);
                    } else {
                        final ImeOptions imeOptions11119 = imeOptions3;
                        i0Var = offsetMapping;
                        final boolean z81111116 = z36;
                        final boolean z81111117 = z37;
                        objE11 = new l() { // from class: n1.u1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.B(s3Var, z81111116, z81111117, v0Var2, textFieldValue, imeOptions11119, i0Var, c2Var, p0Var, aVar, (l0) obj);
                            }
                        };
                        z56 = z81111116;
                        textFieldValue2 = textFieldValue;
                        imeOptions4 = imeOptions11119;
                        c2Var2 = c2Var;
                        p0Var2 = p0Var;
                        aVar2 = aVar;
                        rVarH.v(objE11);
                    }
                    final j1.a aVar13 = aVar2;
                    m mVarA111113 = v4.a(companion2, z56, d0Var, lVar17, (l) objE11);
                    if (z56) {
                        z57 = false;
                    } else {
                        z57 = false;
                    }
                    Boolean boolValueOf11 = Boolean.valueOf(z57);
                    z58 = z56;
                    f6VarP = x5.p(boolValueOf11, rVarH, 0);
                    i0 i0Var13 = i0.f148189a;
                    boolean zW113 = rVarH.W(f6VarP) | rVarH.G(s3Var) | rVarH.G(v0Var2) | rVarH.G(c2Var2);
                    if (i102 > 32) {
                        imeOptions5 = imeOptions4;
                        if ((i101 & 48) != 32) {
                            z59 = true;
                        } else {
                            z59 = false;
                        }
                    } else {
                        imeOptions5 = imeOptions4;
                        if ((i101 & 48) != 32) {
                            z59 = true;
                        } else {
                            z59 = false;
                        }
                    }
                    z65 = zW113 | z59;
                    objE12 = rVarH.E();
                    if (z65) {
                        ImeOptions imeOptions111110 = imeOptions5;
                        objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions111110, null);
                        imeOptions6 = imeOptions111110;
                        rVarH.v(objE12);
                    } else {
                        ImeOptions imeOptions111111 = imeOptions5;
                        objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions111111, null);
                        imeOptions6 = imeOptions111111;
                        rVarH.v(objE12);
                    }
                    imeOptions7 = imeOptions6;
                    Function0.d(i0Var13, (p) objE12, rVarH, 6);
                    int i1016 = i101 >> 3;
                    c2Var3 = c2Var2;
                    m mVarA111114 = k5.a(companion2, c2Var3, z58, lVar17, s3Var, d0Var, z37, i0Var, rVarH, (i1016 & 896) | 196614 | ((i97 >> 9) & 7168) | ((i101 << 6) & 3670016));
                    i0Var2 = i0Var;
                    final m mVarB1114 = m2.b(companion2, s3Var, textFieldValue2, i0Var2);
                    boolean zG11117 = rVarH.G(s3Var);
                    if (i100 == 2048) {
                        z66 = true;
                    } else {
                        z66 = false;
                    }
                    boolean zW114 = zG11117 | z66 | rVarH.W(n3Var) | rVarH.G(c2Var3);
                    if (i99 == 4) {
                        z67 = true;
                    } else {
                        z67 = false;
                    }
                    zG2 = zW114 | z67 | rVarH.G(i0Var2);
                    objE13 = rVarH.E();
                    if (zG2) {
                        final TextFieldValue textFieldValue114 = textFieldValue2;
                        objE13 = new l() { // from class: n1.v1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue114, i0Var2, (b0) obj);
                            }
                        };
                        rVarH.v(objE13);
                    } else {
                        final TextFieldValue textFieldValue115 = textFieldValue2;
                        objE13 = new l() { // from class: n1.v1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue115, i0Var2, (b0) obj);
                            }
                        };
                        rVarH.v(objE13);
                    }
                    final m mVarA111115 = p036e4.l1.a(companion2, (l) objE13);
                    CoreTextFieldSemanticsModifier hVar12 = new CoreTextFieldSemanticsModifier(transformedText10, textFieldValue, s3Var, z37, z58, e1VarC instanceof v4.k0, i0Var2, c2Var3, imeOptions7, d0Var);
                    if (z58) {
                        z68 = false;
                    } else {
                        z68 = false;
                    }
                    final m mVarA111116 = m2.a(companion2, s3Var, textFieldValue, i0Var2, cVar2, z68);
                    zG3 = rVarH.G(c2Var3);
                    final e1 e1Var14 = e1VarC;
                    objE14 = rVarH.E();
                    if (zG3) {
                        objE14 = new l() { // from class: n1.w1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.E(c2Var3, (s0) obj);
                            }
                        };
                        rVarH.v(objE14);
                    } else {
                        objE14 = new l() { // from class: n1.w1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.E(c2Var3, (s0) obj);
                            }
                        };
                        rVarH.v(objE14);
                    }
                    Function0.a(c2Var3, (l) objE14, rVarH, 0);
                    boolean zG11118 = rVarH.G(s3Var) | rVarH.G(v0Var2);
                    if (i99 == 4) {
                        z69 = true;
                    } else {
                        z69 = false;
                    }
                    z75 = z69 | zG11118 | ((i102 <= 32 && rVarH.W(imeOptions7)) || (i101 & 48) == 32);
                    objE15 = rVarH.E();
                    if (z75) {
                        objE15 = new l() { // from class: n1.y1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                            }
                        };
                        rVarH.v(objE15);
                    } else {
                        objE15 = new l() { // from class: n1.y1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                            }
                        };
                        rVarH.v(objE15);
                    }
                    Function0.a(imeOptions7, (l) objE15, rVarH, i1016 & 14);
                    l<TextFieldValue, i0> lVarR12 = s3Var.r();
                    boolean z81111118 = !z37;
                    i103 = i95;
                    if (i103 == 1) {
                        z76 = true;
                    } else {
                        z76 = false;
                    }
                    m mVarB1115 = i5.b(companion2, s3Var, c2Var3, textFieldValue, lVarR12, z81111118, z76, i0Var2, i7Var, imeOptions7.getImeAction());
                    keyboardType = imeOptions7.getKeyboardType();
                    companion3 = a0.INSTANCE;
                    if (a0.n(keyboardType, companion3.f())) {
                        z77 = false;
                    } else {
                        z77 = false;
                    }
                    boolean zC13 = C(f6VarP);
                    zA = rVarH.a(z77) | rVarH.G(k1Var);
                    objE16 = rVarH.E();
                    if (zA) {
                        objE16 = new er.a() { // from class: n1.z1
                            @Override // er.a
                            public final Object a() {
                                return j2.G(z77, k1Var);
                            }
                        };
                        rVarH.v(objE16);
                    } else {
                        objE16 = new er.a() { // from class: n1.z1
                            @Override // er.a
                            public final Object a() {
                                return j2.G(z77, k1Var);
                            }
                        };
                        rVarH.v(objE16);
                    }
                    m mVarB1116 = v1.b.b(companion2, zC13, z77, (er.a) objE16);
                    cVarE = l.e((androidx.compose.ui.graphics.c) rVarH.N(l.c()), ((Color) rVarH.N(l.d())).m20unboximpl(), m.a());
                    zG4 = rVarH.G(s3Var) | rVarH.W(cVarE);
                    objE17 = rVarH.E();
                    if (zG4) {
                        objE17 = new l() { // from class: n1.h2
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.H(s3Var, cVarE, (c) obj);
                            }
                        };
                        rVarH.v(objE17);
                    } else {
                        objE17 = new l() { // from class: n1.h2
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.H(s3Var, cVarE, (c) obj);
                            }
                        };
                        rVarH.v(objE17);
                    }
                    m mVarD12 = k3.k.d(companion2, (l) objE17);
                    m mVar117 = mVar4;
                    final a6 a6Var17 = a6Var5;
                    m mVarA111117 = a0(p036e4.l1.a(u5.f(g0(u4.b(h1.a(mVar117.u(mVarD12), k1Var, s3Var, c2Var3).u(mVarB1116).u(mVarA111113), s3Var, oVar), s3Var, c2Var3).u(mVarB1115), a6Var17, lVar17, z58, x5.a(rVarH, 0)).u(mVarA111114).u(hVar12), new l() { // from class: n1.n1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.I(s3Var, (b0) obj);
                        }
                    }), c2Var3, p0Var2);
                    if (!z58) {
                        z78 = false;
                    } else {
                        z78 = false;
                    }
                    if (z78) {
                        mVarZ = c3.z(companion2, c2Var3);
                    } else {
                        mVarZ = companion2;
                    }
                    final m mVar118 = mVarZ;
                    final q qVar14 = qVarB;
                    P(mVarA111117, c2Var3, y2.m.d(-814563849, true, new p() { // from class: n1.o1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j2.J(qVar14, s3Var, textStyle4, z38, i98, i103, a6Var17, textFieldValue, e1Var14, mVarA111116, mVarB1114, mVarA111115, mVar118, aVar13, c2Var3, z78, z37, lVar7, i0Var2, dVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    qVar2 = qVar14;
                    i89 = i98;
                    rVar2 = rVarH;
                    e1Var2 = e1Var14;
                    z26 = z37;
                    lVar6 = lVar7;
                    z25 = z58;
                    a6Var2 = a6Var3;
                    solidColor = cVar2;
                    lVar5 = lVar17;
                    l3Var2 = l3VarA;
                    mVar3 = mVar117;
                    i88 = i103;
                    imeOptions2 = imeOptions7;
                    z19 = z38;
                    textStyle3 = textStyle4;
                } else {
                    rVarH.O();
                    z19 = z15;
                    imeOptions2 = imeOptions;
                    l3Var2 = l3Var;
                    qVar2 = qVar;
                    a6Var2 = a6Var;
                    rVar2 = rVarH;
                    textStyle3 = textStyle2;
                    lVar6 = lVar4;
                    e1Var2 = e1VarC;
                    mVar3 = mVar2;
                    i88 = i15;
                    i89 = i16;
                    z25 = z16;
                    z26 = z17;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: n1.p1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j2.N(textFieldValue, lVar, mVar3, textStyle3, e1Var2, lVar6, lVar5, solidColor, z19, i88, i89, imeOptions2, l3Var2, z25, z26, qVar2, a6Var2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i25 |= 24576;
            e1VarC = e1Var;
            i36 = i19 & 32;
            if (i36 != 0) {
                i25 |= 196608;
                lVar4 = lVar2;
            } else {
                lVar4 = lVar2;
                if ((i17 & 196608) == 0) {
                    if (rVarH.G(lVar4)) {
                        i37 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i37 = 65536;
                    }
                    i25 |= i37;
                }
            }
            i38 = i19 & 64;
            if (i38 != 0) {
                i25 |= 1572864;
                lVar5 = lVar3;
            } else {
                lVar5 = lVar3;
                if ((i17 & 1572864) == 0) {
                    if (rVarH.W(lVar5)) {
                        i39 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i39 = PKIFailureInfo.signerNotTrusted;
                    }
                    i25 |= i39;
                }
            }
            i45 = i19 & 128;
            if (i45 != 0) {
                i25 |= 12582912;
                solidColor = cVar;
            } else {
                solidColor = cVar;
                if ((i17 & 12582912) == 0) {
                    if (rVarH.W(solidColor)) {
                        i46 = 8388608;
                    } else {
                        i46 = 4194304;
                    }
                    i25 |= i46;
                }
            }
            i47 = i19 & 256;
            if (i47 != 0) {
                i25 |= 100663296;
            } else if ((i17 & 100663296) == 0) {
                if (rVarH.a(z15)) {
                    i48 = 67108864;
                } else {
                    i48 = 33554432;
                }
                i25 |= i48;
            }
            i49 = i19 & 512;
            if (i49 != 0) {
                if ((i17 & 805306368) == 0) {
                    if (rVarH.c(i15)) {
                        i55 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i55 = 268435456;
                    }
                    i25 |= i55;
                }
                i56 = i19 & 1024;
                if (i56 != 0) {
                    i57 = i18 | 6;
                } else if ((i18 & 6) == 0) {
                    if (rVarH.c(i16)) {
                        i58 = 4;
                    } else {
                        i58 = 2;
                    }
                    i57 = i18 | i58;
                } else {
                    i57 = i18;
                }
                if ((i18 & 48) != 0) {
                    i57 |= ((i19 & 2048) == 0 || !rVarH.W(imeOptions)) ? 16 : 32;
                }
                i59 = i57;
                i65 = i19 & PKIFailureInfo.certConfirmed;
                if (i65 != 0) {
                    i66 = i59 | MLKEMEngine.KyberPolyBytes;
                } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                    if (rVarH.W(l3Var)) {
                        i67 = 256;
                    } else {
                        i67 = 128;
                    }
                    i66 = i59 | i67;
                } else {
                    i66 = i59;
                }
                i68 = i19 & PKIFailureInfo.certRevoked;
                if (i68 != 0) {
                    i75 = i66 | 3072;
                } else {
                    i69 = i66;
                    if ((i18 & 3072) == 0) {
                        i75 = i69 | (rVarH.a(z16) ? 2048 : 1024);
                    } else {
                        i75 = i69;
                    }
                }
                i76 = i19 & 16384;
                if (i76 != 0) {
                    i78 = i75 | 24576;
                } else {
                    i77 = i75;
                    if ((i18 & 24576) == 0) {
                        if (rVarH.a(z17)) {
                            i29 = 16384;
                        }
                        i78 = i77 | i29;
                    } else {
                        i78 = i77;
                    }
                }
                i79 = i19 & 32768;
                if (i79 != 0) {
                    i78 |= 196608;
                } else if ((i18 & 196608) == 0) {
                    if (rVarH.G(qVar)) {
                        i85 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i85 = 65536;
                    }
                    i78 |= i85;
                }
                i86 = i19 & PKIFailureInfo.notAuthorized;
                if (i86 != 0) {
                    i78 |= 1572864;
                } else if ((i18 & 1572864) == 0) {
                    if (rVarH.W(a6Var)) {
                        i87 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i87 = PKIFailureInfo.signerNotTrusted;
                    }
                    i78 |= i87;
                }
                if ((i25 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (rVarH.r(z18, i25 & 1)) {
                    rVarH.I();
                    if ((i17 & 1) != 0) {
                        if (i104 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i28 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        }
                        if (i36 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.g2
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j2.x((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar4 = (l) objE;
                        }
                        if (i38 != 0) {
                            lVar5 = null;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.h(), null);
                        }
                        if (i47 != 0) {
                            z27 = true;
                        } else {
                            z27 = z15;
                        }
                        if (i49 != 0) {
                            i95 = Integer.MAX_VALUE;
                        } else {
                            i95 = i15;
                        }
                        if (i56 != 0) {
                            i96 = 1;
                        } else {
                            i96 = i16;
                        }
                        if ((i19 & 2048) != 0) {
                            imeOptionsA = ImeOptions.INSTANCE.a();
                            i78 &= -113;
                        } else {
                            imeOptionsA = imeOptions;
                        }
                        if (i65 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var;
                        }
                        if (i68 != 0) {
                            z28 = true;
                        } else {
                            z28 = z16;
                        }
                        if (i76 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if (i79 != 0) {
                            qVarB = g1.f130036a.b();
                        } else {
                            qVarB = qVar;
                        }
                        if (i86 != 0) {
                            a6Var3 = null;
                        } else {
                            a6Var3 = a6Var;
                        }
                        lVar7 = lVar4;
                        imeOptions3 = imeOptionsA;
                        z35 = z27;
                        textStyle2 = textStyleA;
                        mVar4 = mVar2;
                        z36 = z28;
                        z37 = z29;
                    } else {
                        if (i104 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i28 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        }
                        if (i36 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.g2
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j2.x((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar4 = (l) objE;
                        }
                        if (i38 != 0) {
                            lVar5 = null;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.h(), null);
                        }
                        if (i47 != 0) {
                            z27 = true;
                        } else {
                            z27 = z15;
                        }
                        if (i49 != 0) {
                            i95 = Integer.MAX_VALUE;
                        } else {
                            i95 = i15;
                        }
                        if (i56 != 0) {
                            i96 = 1;
                        } else {
                            i96 = i16;
                        }
                        if ((i19 & 2048) != 0) {
                            imeOptionsA = ImeOptions.INSTANCE.a();
                            i78 &= -113;
                        } else {
                            imeOptionsA = imeOptions;
                        }
                        if (i65 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var;
                        }
                        if (i68 != 0) {
                            z28 = true;
                        } else {
                            z28 = z16;
                        }
                        if (i76 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if (i79 != 0) {
                            qVarB = g1.f130036a.b();
                        } else {
                            qVarB = qVar;
                        }
                        if (i86 != 0) {
                            a6Var3 = null;
                        } else {
                            a6Var3 = a6Var;
                        }
                        lVar7 = lVar4;
                        imeOptions3 = imeOptionsA;
                        z35 = z27;
                        textStyle2 = textStyleA;
                        mVar4 = mVar2;
                        z36 = z28;
                        z37 = z29;
                    }
                    rVarH.y();
                    z38 = z35;
                    if (p076m2.t.k()) {
                        p076m2.t.o(31062401, i25, i78, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                    }
                    objE2 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE2 == companion.a()) {
                        objE2 = new d0();
                        rVarH.v(objE2);
                    }
                    d0Var = (d0) objE2;
                    objE3 = rVarH.E();
                    i97 = i25;
                    if (objE3 == companion.a()) {
                        objE3 = l1.b();
                        rVarH.v(objE3);
                    }
                    k1Var = (k1) objE3;
                    objE4 = rVarH.E();
                    cVar2 = solidColor;
                    if (objE4 == companion.a()) {
                        objE4 = new v0(k1Var);
                        rVarH.v(objE4);
                    }
                    v0Var = (v0) objE4;
                    dVar = (c5.d) rVarH.N(g1.f());
                    bVar = (u4.l.b) rVarH.N(g1.h());
                    selectionBackgroundColor = ((SelectionColors) rVarH.N(g3.c())).getSelectionBackgroundColor();
                    oVar = (o) rVarH.N(g1.g());
                    n3Var = (n3) rVarH.N(g1.v());
                    textStyle4 = textStyle2;
                    r2Var = (r2) rVarH.N(g1.r());
                    i98 = i96;
                    if (i95 == 1) {
                        a2Var = p143z0.a2.Vertical;
                    } else {
                        a2Var = p143z0.a2.Vertical;
                    }
                    if (a6Var3 == null) {
                        rVarH.X(-213744626);
                        Object[] objArr11 = {a2Var};
                        b3.x<a6, Object> xVarA11 = a6.INSTANCE.a();
                        zC = rVarH.c(a2Var.ordinal());
                        objE18 = rVarH.E();
                        if (zC) {
                            objE18 = new er.a() { // from class: n1.q1
                                @Override // er.a
                                public final Object a() {
                                    return j2.O(a2Var);
                                }
                            };
                            rVarH.v(objE18);
                        } else {
                            objE18 = new er.a() { // from class: n1.q1
                                @Override // er.a
                                public final Object a() {
                                    return j2.O(a2Var);
                                }
                            };
                            rVarH.v(objE18);
                        }
                        a6Var4 = (a6) b3.f.i(objArr11, xVarA11, (er.a) objE18, rVarH, 0);
                        rVarH.R();
                    } else {
                        rVarH.X(-213745742);
                        rVarH.R();
                        a6Var4 = a6Var3;
                    }
                    if (a6Var4.j() != a2Var) {
                        StringBuilder sb15 = new StringBuilder();
                        sb15.append("Mismatching scroller orientation; ");
                        if (a2Var == p143z0.a2.Vertical) {
                            str = "only single-line, non-wrap text fields can scroll horizontally";
                        } else {
                            str = "single-line, non-wrap text fields can only scroll horizontally";
                        }
                        sb15.append(str);
                        throw new IllegalArgumentException(sb15.toString());
                    }
                    i99 = i97 & 14;
                    if (i99 == 4) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    if ((i97 & 57344) == 16384) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    z46 = z39 | z45;
                    objE5 = rVarH.E();
                    if (z46) {
                        transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                        composition = textFieldValue.getComposition();
                        if (composition != null) {
                            a6Var5 = a6Var4;
                            transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                            if (transformedTextC2 != null) {
                                objE5 = transformedTextC2;
                            }
                            rVarH.v(objE5);
                        } else {
                            a6Var5 = a6Var4;
                        }
                        objE5 = transformedTextC;
                        rVarH.v(objE5);
                    } else {
                        transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                        composition = textFieldValue.getComposition();
                        if (composition != null) {
                            a6Var5 = a6Var4;
                            transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                            if (transformedTextC2 != null) {
                                objE5 = transformedTextC2;
                            }
                            rVarH.v(objE5);
                        } else {
                            a6Var5 = a6Var4;
                        }
                        objE5 = transformedTextC;
                        rVarH.v(objE5);
                    }
                    TransformedText transformedText11 = (TransformedText) objE5;
                    text = transformedText11.getText();
                    offsetMapping = transformedText11.getOffsetMapping();
                    d4VarC = p076m2.m.c(rVarH, 0);
                    zW = rVarH.W(r2Var);
                    objE6 = rVarH.E();
                    if (zW) {
                        objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                        rVarH.v(objE6);
                    } else {
                        objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                        rVarH.v(objE6);
                    }
                    s3Var = (s3) objE6;
                    s3Var.X(textFieldValue.getText(), text, textStyle4, z38, r55, bVar, lVar, l3VarA, oVar, selectionBackgroundColor);
                    s3Var.getProcessor().e(textFieldValue, s3Var.getInputSession());
                    objE7 = rVarH.E();
                    if (objE7 == companion.a()) {
                        objE7 = new i7(0, 1, null);
                        rVarH.v(objE7);
                    }
                    i7Var = (i7) objE7;
                    i7.f(i7Var, textFieldValue, 0L, 2, null);
                    objE8 = rVarH.E();
                    if (objE8 == companion.a()) {
                        objE8 = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE8);
                    }
                    p0Var = (p0) objE8;
                    objE9 = rVarH.E();
                    if (objE9 == companion.a()) {
                        objE9 = j1.e.a();
                        rVarH.v(objE9);
                    }
                    aVar = (j1.a) objE9;
                    objE10 = rVarH.E();
                    b1.l lVar18 = lVar5;
                    if (objE10 == companion.a()) {
                        objE10 = new c2(i7Var);
                        rVarH.v(objE10);
                    }
                    c2Var = (c2) objE10;
                    c2Var.L0(offsetMapping);
                    c2Var.U0(e1VarC);
                    c2Var.M0(s3Var.r());
                    c2Var.Q0(s3Var);
                    c2Var.T0(textFieldValue);
                    c2Var.z0((androidx.compose.ui.platform.b1) rVarH.N(g1.d()));
                    c2Var.A0(p0Var);
                    c2Var.R0((v2) rVarH.N(g1.s()));
                    c2Var.I0((v3.a) rVarH.N(g1.j()));
                    c2Var.G0(d0Var);
                    c2Var.E0(!z37);
                    c2Var.F0(z36);
                    if (g0.isSmartSelectionEnabled) {
                        rVarH.X(1966756105);
                        c2Var.N0(f0.h(z1.i0.EditableText, textStyle4.w(), rVarH, 6));
                        rVarH.R();
                    } else {
                        rVarH.X(1966902177);
                        rVarH.R();
                    }
                    s3Var.h();
                    new l() { // from class: n1.r1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.y(c2Var, (q4.e) obj);
                        }
                    };
                    new er.a() { // from class: n1.s1
                        @Override // er.a
                        public final Object a() {
                            return j2.z(c2Var);
                        }
                    };
                    new er.a() { // from class: n1.t1
                        @Override // er.a
                        public final Object a() {
                            return j2.A(c2Var);
                        }
                    };
                    companion2 = m.INSTANCE;
                    boolean zG11119 = rVarH.G(s3Var);
                    i100 = i78 & 7168;
                    i101 = i78;
                    if (i100 == 2048) {
                        z47 = true;
                    } else {
                        z47 = false;
                    }
                    boolean z719 = z47 | zG11119;
                    if ((i101 & 57344) == 16384) {
                        z48 = true;
                    } else {
                        z48 = false;
                    }
                    boolean zG111110 = z719 | z48 | rVarH.G(v0Var);
                    if (i99 == 4) {
                        z49 = true;
                    } else {
                        z49 = false;
                    }
                    boolean z81111119 = zG111110 | z49;
                    i102 = (i101 & 112) ^ 48;
                    if (i102 > 32) {
                        v0Var2 = v0Var;
                        if ((i101 & 48) != 32) {
                            z55 = true;
                        } else {
                            z55 = false;
                        }
                    } else {
                        v0Var2 = v0Var;
                        if ((i101 & 48) != 32) {
                            z55 = true;
                        } else {
                            z55 = false;
                        }
                    }
                    zG = z81111119 | z55 | rVarH.G(offsetMapping) | rVarH.G(p0Var) | rVarH.G(aVar) | rVarH.G(c2Var);
                    objE11 = rVarH.E();
                    if (zG) {
                        final ImeOptions imeOptions111112 = imeOptions3;
                        i0Var = offsetMapping;
                        final boolean z811111110 = z36;
                        final boolean z811111111 = z37;
                        objE11 = new l() { // from class: n1.u1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.B(s3Var, z811111110, z811111111, v0Var2, textFieldValue, imeOptions111112, i0Var, c2Var, p0Var, aVar, (l0) obj);
                            }
                        };
                        z56 = z811111110;
                        textFieldValue2 = textFieldValue;
                        imeOptions4 = imeOptions111112;
                        c2Var2 = c2Var;
                        p0Var2 = p0Var;
                        aVar2 = aVar;
                        rVarH.v(objE11);
                    } else {
                        final ImeOptions imeOptions111113 = imeOptions3;
                        i0Var = offsetMapping;
                        final boolean z811111112 = z36;
                        final boolean z811111113 = z37;
                        objE11 = new l() { // from class: n1.u1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.B(s3Var, z811111112, z811111113, v0Var2, textFieldValue, imeOptions111113, i0Var, c2Var, p0Var, aVar, (l0) obj);
                            }
                        };
                        z56 = z811111112;
                        textFieldValue2 = textFieldValue;
                        imeOptions4 = imeOptions111113;
                        c2Var2 = c2Var;
                        p0Var2 = p0Var;
                        aVar2 = aVar;
                        rVarH.v(objE11);
                    }
                    final j1.a aVar14 = aVar2;
                    m mVarA111118 = v4.a(companion2, z56, d0Var, lVar18, (l) objE11);
                    if (z56) {
                        z57 = false;
                    } else {
                        z57 = false;
                    }
                    Boolean boolValueOf12 = Boolean.valueOf(z57);
                    z58 = z56;
                    f6VarP = x5.p(boolValueOf12, rVarH, 0);
                    i0 i0Var14 = i0.f148189a;
                    boolean zW115 = rVarH.W(f6VarP) | rVarH.G(s3Var) | rVarH.G(v0Var2) | rVarH.G(c2Var2);
                    if (i102 > 32) {
                        imeOptions5 = imeOptions4;
                        if ((i101 & 48) != 32) {
                            z59 = true;
                        } else {
                            z59 = false;
                        }
                    } else {
                        imeOptions5 = imeOptions4;
                        if ((i101 & 48) != 32) {
                            z59 = true;
                        } else {
                            z59 = false;
                        }
                    }
                    z65 = zW115 | z59;
                    objE12 = rVarH.E();
                    if (z65) {
                        ImeOptions imeOptions111114 = imeOptions5;
                        objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions111114, null);
                        imeOptions6 = imeOptions111114;
                        rVarH.v(objE12);
                    } else {
                        ImeOptions imeOptions111115 = imeOptions5;
                        objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions111115, null);
                        imeOptions6 = imeOptions111115;
                        rVarH.v(objE12);
                    }
                    imeOptions7 = imeOptions6;
                    Function0.d(i0Var14, (p) objE12, rVarH, 6);
                    int i1017 = i101 >> 3;
                    c2Var3 = c2Var2;
                    m mVarA111119 = k5.a(companion2, c2Var3, z58, lVar18, s3Var, d0Var, z37, i0Var, rVarH, (i1017 & 896) | 196614 | ((i97 >> 9) & 7168) | ((i101 << 6) & 3670016));
                    i0Var2 = i0Var;
                    final m mVarB1117 = m2.b(companion2, s3Var, textFieldValue2, i0Var2);
                    boolean zG111111 = rVarH.G(s3Var);
                    if (i100 == 2048) {
                        z66 = true;
                    } else {
                        z66 = false;
                    }
                    boolean zW116 = zG111111 | z66 | rVarH.W(n3Var) | rVarH.G(c2Var3);
                    if (i99 == 4) {
                        z67 = true;
                    } else {
                        z67 = false;
                    }
                    zG2 = zW116 | z67 | rVarH.G(i0Var2);
                    objE13 = rVarH.E();
                    if (zG2) {
                        final TextFieldValue textFieldValue116 = textFieldValue2;
                        objE13 = new l() { // from class: n1.v1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue116, i0Var2, (b0) obj);
                            }
                        };
                        rVarH.v(objE13);
                    } else {
                        final TextFieldValue textFieldValue117 = textFieldValue2;
                        objE13 = new l() { // from class: n1.v1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue117, i0Var2, (b0) obj);
                            }
                        };
                        rVarH.v(objE13);
                    }
                    final m mVarA1111110 = p036e4.l1.a(companion2, (l) objE13);
                    CoreTextFieldSemanticsModifier hVar13 = new CoreTextFieldSemanticsModifier(transformedText11, textFieldValue, s3Var, z37, z58, e1VarC instanceof v4.k0, i0Var2, c2Var3, imeOptions7, d0Var);
                    if (z58) {
                        z68 = false;
                    } else {
                        z68 = false;
                    }
                    final m mVarA1111111 = m2.a(companion2, s3Var, textFieldValue, i0Var2, cVar2, z68);
                    zG3 = rVarH.G(c2Var3);
                    final e1 e1Var15 = e1VarC;
                    objE14 = rVarH.E();
                    if (zG3) {
                        objE14 = new l() { // from class: n1.w1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.E(c2Var3, (s0) obj);
                            }
                        };
                        rVarH.v(objE14);
                    } else {
                        objE14 = new l() { // from class: n1.w1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.E(c2Var3, (s0) obj);
                            }
                        };
                        rVarH.v(objE14);
                    }
                    Function0.a(c2Var3, (l) objE14, rVarH, 0);
                    boolean zG111112 = rVarH.G(s3Var) | rVarH.G(v0Var2);
                    if (i99 == 4) {
                        z69 = true;
                    } else {
                        z69 = false;
                    }
                    z75 = z69 | zG111112 | ((i102 <= 32 && rVarH.W(imeOptions7)) || (i101 & 48) == 32);
                    objE15 = rVarH.E();
                    if (z75) {
                        objE15 = new l() { // from class: n1.y1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                            }
                        };
                        rVarH.v(objE15);
                    } else {
                        objE15 = new l() { // from class: n1.y1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                            }
                        };
                        rVarH.v(objE15);
                    }
                    Function0.a(imeOptions7, (l) objE15, rVarH, i1017 & 14);
                    l<TextFieldValue, i0> lVarR13 = s3Var.r();
                    boolean z811111114 = !z37;
                    i103 = i95;
                    if (i103 == 1) {
                        z76 = true;
                    } else {
                        z76 = false;
                    }
                    m mVarB1118 = i5.b(companion2, s3Var, c2Var3, textFieldValue, lVarR13, z811111114, z76, i0Var2, i7Var, imeOptions7.getImeAction());
                    keyboardType = imeOptions7.getKeyboardType();
                    companion3 = a0.INSTANCE;
                    if (a0.n(keyboardType, companion3.f())) {
                        z77 = false;
                    } else {
                        z77 = false;
                    }
                    boolean zC14 = C(f6VarP);
                    zA = rVarH.a(z77) | rVarH.G(k1Var);
                    objE16 = rVarH.E();
                    if (zA) {
                        objE16 = new er.a() { // from class: n1.z1
                            @Override // er.a
                            public final Object a() {
                                return j2.G(z77, k1Var);
                            }
                        };
                        rVarH.v(objE16);
                    } else {
                        objE16 = new er.a() { // from class: n1.z1
                            @Override // er.a
                            public final Object a() {
                                return j2.G(z77, k1Var);
                            }
                        };
                        rVarH.v(objE16);
                    }
                    m mVarB1119 = v1.b.b(companion2, zC14, z77, (er.a) objE16);
                    cVarE = l.e((androidx.compose.ui.graphics.c) rVarH.N(l.c()), ((Color) rVarH.N(l.d())).m20unboximpl(), m.a());
                    zG4 = rVarH.G(s3Var) | rVarH.W(cVarE);
                    objE17 = rVarH.E();
                    if (zG4) {
                        objE17 = new l() { // from class: n1.h2
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.H(s3Var, cVarE, (c) obj);
                            }
                        };
                        rVarH.v(objE17);
                    } else {
                        objE17 = new l() { // from class: n1.h2
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.H(s3Var, cVarE, (c) obj);
                            }
                        };
                        rVarH.v(objE17);
                    }
                    m mVarD13 = k3.k.d(companion2, (l) objE17);
                    m mVar119 = mVar4;
                    final a6 a6Var18 = a6Var5;
                    m mVarA1111112 = a0(p036e4.l1.a(u5.f(g0(u4.b(h1.a(mVar119.u(mVarD13), k1Var, s3Var, c2Var3).u(mVarB1119).u(mVarA111118), s3Var, oVar), s3Var, c2Var3).u(mVarB1118), a6Var18, lVar18, z58, x5.a(rVarH, 0)).u(mVarA111119).u(hVar13), new l() { // from class: n1.n1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.I(s3Var, (b0) obj);
                        }
                    }), c2Var3, p0Var2);
                    if (!z58) {
                        z78 = false;
                    } else {
                        z78 = false;
                    }
                    if (z78) {
                        mVarZ = c3.z(companion2, c2Var3);
                    } else {
                        mVarZ = companion2;
                    }
                    final m mVar1110 = mVarZ;
                    final q qVar15 = qVarB;
                    P(mVarA1111112, c2Var3, y2.m.d(-814563849, true, new p() { // from class: n1.o1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j2.J(qVar15, s3Var, textStyle4, z38, i98, i103, a6Var18, textFieldValue, e1Var15, mVarA1111111, mVarB1117, mVarA1111110, mVar1110, aVar14, c2Var3, z78, z37, lVar7, i0Var2, dVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    qVar2 = qVar15;
                    i89 = i98;
                    rVar2 = rVarH;
                    e1Var2 = e1Var15;
                    z26 = z37;
                    lVar6 = lVar7;
                    z25 = z58;
                    a6Var2 = a6Var3;
                    solidColor = cVar2;
                    lVar5 = lVar18;
                    l3Var2 = l3VarA;
                    mVar3 = mVar119;
                    i88 = i103;
                    imeOptions2 = imeOptions7;
                    z19 = z38;
                    textStyle3 = textStyle4;
                } else {
                    rVarH.O();
                    z19 = z15;
                    imeOptions2 = imeOptions;
                    l3Var2 = l3Var;
                    qVar2 = qVar;
                    a6Var2 = a6Var;
                    rVar2 = rVarH;
                    textStyle3 = textStyle2;
                    lVar6 = lVar4;
                    e1Var2 = e1VarC;
                    mVar3 = mVar2;
                    i88 = i15;
                    i89 = i16;
                    z25 = z16;
                    z26 = z17;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: n1.p1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j2.N(textFieldValue, lVar, mVar3, textStyle3, e1Var2, lVar6, lVar5, solidColor, z19, i88, i89, imeOptions2, l3Var2, z25, z26, qVar2, a6Var2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i25 |= 805306368;
            i56 = i19 & 1024;
            if (i56 != 0) {
                i57 = i18 | 6;
            } else if ((i18 & 6) == 0) {
                if (rVarH.c(i16)) {
                    i58 = 4;
                } else {
                    i58 = 2;
                }
                i57 = i18 | i58;
            } else {
                i57 = i18;
            }
            if ((i18 & 48) != 0) {
                i57 |= ((i19 & 2048) == 0 || !rVarH.W(imeOptions)) ? 16 : 32;
            }
            i59 = i57;
            i65 = i19 & PKIFailureInfo.certConfirmed;
            if (i65 != 0) {
                i66 = i59 | MLKEMEngine.KyberPolyBytes;
            } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                if (rVarH.W(l3Var)) {
                    i67 = 256;
                } else {
                    i67 = 128;
                }
                i66 = i59 | i67;
            } else {
                i66 = i59;
            }
            i68 = i19 & PKIFailureInfo.certRevoked;
            if (i68 != 0) {
                i75 = i66 | 3072;
            } else {
                i69 = i66;
                if ((i18 & 3072) == 0) {
                    i75 = i69 | (rVarH.a(z16) ? 2048 : 1024);
                } else {
                    i75 = i69;
                }
            }
            i76 = i19 & 16384;
            if (i76 != 0) {
                i78 = i75 | 24576;
            } else {
                i77 = i75;
                if ((i18 & 24576) == 0) {
                    if (rVarH.a(z17)) {
                        i29 = 16384;
                    }
                    i78 = i77 | i29;
                } else {
                    i78 = i77;
                }
            }
            i79 = i19 & 32768;
            if (i79 != 0) {
                i78 |= 196608;
            } else if ((i18 & 196608) == 0) {
                if (rVarH.G(qVar)) {
                    i85 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i85 = 65536;
                }
                i78 |= i85;
            }
            i86 = i19 & PKIFailureInfo.notAuthorized;
            if (i86 != 0) {
                i78 |= 1572864;
            } else if ((i18 & 1572864) == 0) {
                if (rVarH.W(a6Var)) {
                    i87 = PKIFailureInfo.badCertTemplate;
                } else {
                    i87 = PKIFailureInfo.signerNotTrusted;
                }
                i78 |= i87;
            }
            if ((i25 & 306783379) == 306783378) {
                z18 = true;
            } else {
                z18 = true;
            }
            if (rVarH.r(z18, i25 & 1)) {
                rVarH.I();
                if ((i17 & 1) != 0) {
                    if (i104 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i26 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i28 != 0) {
                        e1VarC = e1.INSTANCE.c();
                    }
                    if (i36 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: n1.g2
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.x((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar4 = (l) objE;
                    }
                    if (i38 != 0) {
                        lVar5 = null;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.h(), null);
                    }
                    if (i47 != 0) {
                        z27 = true;
                    } else {
                        z27 = z15;
                    }
                    if (i49 != 0) {
                        i95 = Integer.MAX_VALUE;
                    } else {
                        i95 = i15;
                    }
                    if (i56 != 0) {
                        i96 = 1;
                    } else {
                        i96 = i16;
                    }
                    if ((i19 & 2048) != 0) {
                        imeOptionsA = ImeOptions.INSTANCE.a();
                        i78 &= -113;
                    } else {
                        imeOptionsA = imeOptions;
                    }
                    if (i65 != 0) {
                        l3VarA = l3.INSTANCE.a();
                    } else {
                        l3VarA = l3Var;
                    }
                    if (i68 != 0) {
                        z28 = true;
                    } else {
                        z28 = z16;
                    }
                    if (i76 != 0) {
                        z29 = false;
                    } else {
                        z29 = z17;
                    }
                    if (i79 != 0) {
                        qVarB = g1.f130036a.b();
                    } else {
                        qVarB = qVar;
                    }
                    if (i86 != 0) {
                        a6Var3 = null;
                    } else {
                        a6Var3 = a6Var;
                    }
                    lVar7 = lVar4;
                    imeOptions3 = imeOptionsA;
                    z35 = z27;
                    textStyle2 = textStyleA;
                    mVar4 = mVar2;
                    z36 = z28;
                    z37 = z29;
                } else {
                    if (i104 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i26 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i28 != 0) {
                        e1VarC = e1.INSTANCE.c();
                    }
                    if (i36 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: n1.g2
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.x((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar4 = (l) objE;
                    }
                    if (i38 != 0) {
                        lVar5 = null;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.h(), null);
                    }
                    if (i47 != 0) {
                        z27 = true;
                    } else {
                        z27 = z15;
                    }
                    if (i49 != 0) {
                        i95 = Integer.MAX_VALUE;
                    } else {
                        i95 = i15;
                    }
                    if (i56 != 0) {
                        i96 = 1;
                    } else {
                        i96 = i16;
                    }
                    if ((i19 & 2048) != 0) {
                        imeOptionsA = ImeOptions.INSTANCE.a();
                        i78 &= -113;
                    } else {
                        imeOptionsA = imeOptions;
                    }
                    if (i65 != 0) {
                        l3VarA = l3.INSTANCE.a();
                    } else {
                        l3VarA = l3Var;
                    }
                    if (i68 != 0) {
                        z28 = true;
                    } else {
                        z28 = z16;
                    }
                    if (i76 != 0) {
                        z29 = false;
                    } else {
                        z29 = z17;
                    }
                    if (i79 != 0) {
                        qVarB = g1.f130036a.b();
                    } else {
                        qVarB = qVar;
                    }
                    if (i86 != 0) {
                        a6Var3 = null;
                    } else {
                        a6Var3 = a6Var;
                    }
                    lVar7 = lVar4;
                    imeOptions3 = imeOptionsA;
                    z35 = z27;
                    textStyle2 = textStyleA;
                    mVar4 = mVar2;
                    z36 = z28;
                    z37 = z29;
                }
                rVarH.y();
                z38 = z35;
                if (p076m2.t.k()) {
                    p076m2.t.o(31062401, i25, i78, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                }
                objE2 = rVarH.E();
                companion = r.INSTANCE;
                if (objE2 == companion.a()) {
                    objE2 = new d0();
                    rVarH.v(objE2);
                }
                d0Var = (d0) objE2;
                objE3 = rVarH.E();
                i97 = i25;
                if (objE3 == companion.a()) {
                    objE3 = l1.b();
                    rVarH.v(objE3);
                }
                k1Var = (k1) objE3;
                objE4 = rVarH.E();
                cVar2 = solidColor;
                if (objE4 == companion.a()) {
                    objE4 = new v0(k1Var);
                    rVarH.v(objE4);
                }
                v0Var = (v0) objE4;
                dVar = (c5.d) rVarH.N(g1.f());
                bVar = (u4.l.b) rVarH.N(g1.h());
                selectionBackgroundColor = ((SelectionColors) rVarH.N(g3.c())).getSelectionBackgroundColor();
                oVar = (o) rVarH.N(g1.g());
                n3Var = (n3) rVarH.N(g1.v());
                textStyle4 = textStyle2;
                r2Var = (r2) rVarH.N(g1.r());
                i98 = i96;
                if (i95 == 1) {
                    a2Var = p143z0.a2.Vertical;
                } else {
                    a2Var = p143z0.a2.Vertical;
                }
                if (a6Var3 == null) {
                    rVarH.X(-213744626);
                    Object[] objArr12 = {a2Var};
                    b3.x<a6, Object> xVarA12 = a6.INSTANCE.a();
                    zC = rVarH.c(a2Var.ordinal());
                    objE18 = rVarH.E();
                    if (zC) {
                        objE18 = new er.a() { // from class: n1.q1
                            @Override // er.a
                            public final Object a() {
                                return j2.O(a2Var);
                            }
                        };
                        rVarH.v(objE18);
                    } else {
                        objE18 = new er.a() { // from class: n1.q1
                            @Override // er.a
                            public final Object a() {
                                return j2.O(a2Var);
                            }
                        };
                        rVarH.v(objE18);
                    }
                    a6Var4 = (a6) b3.f.i(objArr12, xVarA12, (er.a) objE18, rVarH, 0);
                    rVarH.R();
                } else {
                    rVarH.X(-213745742);
                    rVarH.R();
                    a6Var4 = a6Var3;
                }
                if (a6Var4.j() != a2Var) {
                    StringBuilder sb16 = new StringBuilder();
                    sb16.append("Mismatching scroller orientation; ");
                    if (a2Var == p143z0.a2.Vertical) {
                        str = "only single-line, non-wrap text fields can scroll horizontally";
                    } else {
                        str = "single-line, non-wrap text fields can only scroll horizontally";
                    }
                    sb16.append(str);
                    throw new IllegalArgumentException(sb16.toString());
                }
                i99 = i97 & 14;
                if (i99 == 4) {
                    z39 = true;
                } else {
                    z39 = false;
                }
                if ((i97 & 57344) == 16384) {
                    z45 = true;
                } else {
                    z45 = false;
                }
                z46 = z39 | z45;
                objE5 = rVarH.E();
                if (z46) {
                    transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                    composition = textFieldValue.getComposition();
                    if (composition != null) {
                        a6Var5 = a6Var4;
                        transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                        if (transformedTextC2 != null) {
                            objE5 = transformedTextC2;
                        }
                        rVarH.v(objE5);
                    } else {
                        a6Var5 = a6Var4;
                    }
                    objE5 = transformedTextC;
                    rVarH.v(objE5);
                } else {
                    transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                    composition = textFieldValue.getComposition();
                    if (composition != null) {
                        a6Var5 = a6Var4;
                        transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                        if (transformedTextC2 != null) {
                            objE5 = transformedTextC2;
                        }
                        rVarH.v(objE5);
                    } else {
                        a6Var5 = a6Var4;
                    }
                    objE5 = transformedTextC;
                    rVarH.v(objE5);
                }
                TransformedText transformedText12 = (TransformedText) objE5;
                text = transformedText12.getText();
                offsetMapping = transformedText12.getOffsetMapping();
                d4VarC = p076m2.m.c(rVarH, 0);
                zW = rVarH.W(r2Var);
                objE6 = rVarH.E();
                if (zW) {
                    objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                    rVarH.v(objE6);
                } else {
                    objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                    rVarH.v(objE6);
                }
                s3Var = (s3) objE6;
                s3Var.X(textFieldValue.getText(), text, textStyle4, z38, r55, bVar, lVar, l3VarA, oVar, selectionBackgroundColor);
                s3Var.getProcessor().e(textFieldValue, s3Var.getInputSession());
                objE7 = rVarH.E();
                if (objE7 == companion.a()) {
                    objE7 = new i7(0, 1, null);
                    rVarH.v(objE7);
                }
                i7Var = (i7) objE7;
                i7.f(i7Var, textFieldValue, 0L, 2, null);
                objE8 = rVarH.E();
                if (objE8 == companion.a()) {
                    objE8 = Function0.i(tq.j.f191408a, rVarH);
                    rVarH.v(objE8);
                }
                p0Var = (p0) objE8;
                objE9 = rVarH.E();
                if (objE9 == companion.a()) {
                    objE9 = j1.e.a();
                    rVarH.v(objE9);
                }
                aVar = (j1.a) objE9;
                objE10 = rVarH.E();
                b1.l lVar19 = lVar5;
                if (objE10 == companion.a()) {
                    objE10 = new c2(i7Var);
                    rVarH.v(objE10);
                }
                c2Var = (c2) objE10;
                c2Var.L0(offsetMapping);
                c2Var.U0(e1VarC);
                c2Var.M0(s3Var.r());
                c2Var.Q0(s3Var);
                c2Var.T0(textFieldValue);
                c2Var.z0((androidx.compose.ui.platform.b1) rVarH.N(g1.d()));
                c2Var.A0(p0Var);
                c2Var.R0((v2) rVarH.N(g1.s()));
                c2Var.I0((v3.a) rVarH.N(g1.j()));
                c2Var.G0(d0Var);
                c2Var.E0(!z37);
                c2Var.F0(z36);
                if (g0.isSmartSelectionEnabled) {
                    rVarH.X(1966756105);
                    c2Var.N0(f0.h(z1.i0.EditableText, textStyle4.w(), rVarH, 6));
                    rVarH.R();
                } else {
                    rVarH.X(1966902177);
                    rVarH.R();
                }
                s3Var.h();
                new l() { // from class: n1.r1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j2.y(c2Var, (q4.e) obj);
                    }
                };
                new er.a() { // from class: n1.s1
                    @Override // er.a
                    public final Object a() {
                        return j2.z(c2Var);
                    }
                };
                new er.a() { // from class: n1.t1
                    @Override // er.a
                    public final Object a() {
                        return j2.A(c2Var);
                    }
                };
                companion2 = m.INSTANCE;
                boolean zG111113 = rVarH.G(s3Var);
                i100 = i78 & 7168;
                i101 = i78;
                if (i100 == 2048) {
                    z47 = true;
                } else {
                    z47 = false;
                }
                boolean z7110 = z47 | zG111113;
                if ((i101 & 57344) == 16384) {
                    z48 = true;
                } else {
                    z48 = false;
                }
                boolean zG111114 = z7110 | z48 | rVarH.G(v0Var);
                if (i99 == 4) {
                    z49 = true;
                } else {
                    z49 = false;
                }
                boolean z811111115 = zG111114 | z49;
                i102 = (i101 & 112) ^ 48;
                if (i102 > 32) {
                    v0Var2 = v0Var;
                    if ((i101 & 48) != 32) {
                        z55 = true;
                    } else {
                        z55 = false;
                    }
                } else {
                    v0Var2 = v0Var;
                    if ((i101 & 48) != 32) {
                        z55 = true;
                    } else {
                        z55 = false;
                    }
                }
                zG = z811111115 | z55 | rVarH.G(offsetMapping) | rVarH.G(p0Var) | rVarH.G(aVar) | rVarH.G(c2Var);
                objE11 = rVarH.E();
                if (zG) {
                    final ImeOptions imeOptions111116 = imeOptions3;
                    i0Var = offsetMapping;
                    final boolean z811111116 = z36;
                    final boolean z811111117 = z37;
                    objE11 = new l() { // from class: n1.u1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.B(s3Var, z811111116, z811111117, v0Var2, textFieldValue, imeOptions111116, i0Var, c2Var, p0Var, aVar, (l0) obj);
                        }
                    };
                    z56 = z811111116;
                    textFieldValue2 = textFieldValue;
                    imeOptions4 = imeOptions111116;
                    c2Var2 = c2Var;
                    p0Var2 = p0Var;
                    aVar2 = aVar;
                    rVarH.v(objE11);
                } else {
                    final ImeOptions imeOptions111117 = imeOptions3;
                    i0Var = offsetMapping;
                    final boolean z811111118 = z36;
                    final boolean z811111119 = z37;
                    objE11 = new l() { // from class: n1.u1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.B(s3Var, z811111118, z811111119, v0Var2, textFieldValue, imeOptions111117, i0Var, c2Var, p0Var, aVar, (l0) obj);
                        }
                    };
                    z56 = z811111118;
                    textFieldValue2 = textFieldValue;
                    imeOptions4 = imeOptions111117;
                    c2Var2 = c2Var;
                    p0Var2 = p0Var;
                    aVar2 = aVar;
                    rVarH.v(objE11);
                }
                final j1.a aVar15 = aVar2;
                m mVarA1111113 = v4.a(companion2, z56, d0Var, lVar19, (l) objE11);
                if (z56) {
                    z57 = false;
                } else {
                    z57 = false;
                }
                Boolean boolValueOf13 = Boolean.valueOf(z57);
                z58 = z56;
                f6VarP = x5.p(boolValueOf13, rVarH, 0);
                i0 i0Var15 = i0.f148189a;
                boolean zW117 = rVarH.W(f6VarP) | rVarH.G(s3Var) | rVarH.G(v0Var2) | rVarH.G(c2Var2);
                if (i102 > 32) {
                    imeOptions5 = imeOptions4;
                    if ((i101 & 48) != 32) {
                        z59 = true;
                    } else {
                        z59 = false;
                    }
                } else {
                    imeOptions5 = imeOptions4;
                    if ((i101 & 48) != 32) {
                        z59 = true;
                    } else {
                        z59 = false;
                    }
                }
                z65 = zW117 | z59;
                objE12 = rVarH.E();
                if (z65) {
                    ImeOptions imeOptions111118 = imeOptions5;
                    objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions111118, null);
                    imeOptions6 = imeOptions111118;
                    rVarH.v(objE12);
                } else {
                    ImeOptions imeOptions111119 = imeOptions5;
                    objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions111119, null);
                    imeOptions6 = imeOptions111119;
                    rVarH.v(objE12);
                }
                imeOptions7 = imeOptions6;
                Function0.d(i0Var15, (p) objE12, rVarH, 6);
                int i1018 = i101 >> 3;
                c2Var3 = c2Var2;
                m mVarA1111114 = k5.a(companion2, c2Var3, z58, lVar19, s3Var, d0Var, z37, i0Var, rVarH, (i1018 & 896) | 196614 | ((i97 >> 9) & 7168) | ((i101 << 6) & 3670016));
                i0Var2 = i0Var;
                final m mVarB11110 = m2.b(companion2, s3Var, textFieldValue2, i0Var2);
                boolean zG111115 = rVarH.G(s3Var);
                if (i100 == 2048) {
                    z66 = true;
                } else {
                    z66 = false;
                }
                boolean zW118 = zG111115 | z66 | rVarH.W(n3Var) | rVarH.G(c2Var3);
                if (i99 == 4) {
                    z67 = true;
                } else {
                    z67 = false;
                }
                zG2 = zW118 | z67 | rVarH.G(i0Var2);
                objE13 = rVarH.E();
                if (zG2) {
                    final TextFieldValue textFieldValue118 = textFieldValue2;
                    objE13 = new l() { // from class: n1.v1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue118, i0Var2, (b0) obj);
                        }
                    };
                    rVarH.v(objE13);
                } else {
                    final TextFieldValue textFieldValue119 = textFieldValue2;
                    objE13 = new l() { // from class: n1.v1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue119, i0Var2, (b0) obj);
                        }
                    };
                    rVarH.v(objE13);
                }
                final m mVarA1111115 = p036e4.l1.a(companion2, (l) objE13);
                CoreTextFieldSemanticsModifier hVar14 = new CoreTextFieldSemanticsModifier(transformedText12, textFieldValue, s3Var, z37, z58, e1VarC instanceof v4.k0, i0Var2, c2Var3, imeOptions7, d0Var);
                if (z58) {
                    z68 = false;
                } else {
                    z68 = false;
                }
                final m mVarA1111116 = m2.a(companion2, s3Var, textFieldValue, i0Var2, cVar2, z68);
                zG3 = rVarH.G(c2Var3);
                final e1 e1Var16 = e1VarC;
                objE14 = rVarH.E();
                if (zG3) {
                    objE14 = new l() { // from class: n1.w1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.E(c2Var3, (s0) obj);
                        }
                    };
                    rVarH.v(objE14);
                } else {
                    objE14 = new l() { // from class: n1.w1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.E(c2Var3, (s0) obj);
                        }
                    };
                    rVarH.v(objE14);
                }
                Function0.a(c2Var3, (l) objE14, rVarH, 0);
                boolean zG111116 = rVarH.G(s3Var) | rVarH.G(v0Var2);
                if (i99 == 4) {
                    z69 = true;
                } else {
                    z69 = false;
                }
                z75 = z69 | zG111116 | ((i102 <= 32 && rVarH.W(imeOptions7)) || (i101 & 48) == 32);
                objE15 = rVarH.E();
                if (z75) {
                    objE15 = new l() { // from class: n1.y1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                        }
                    };
                    rVarH.v(objE15);
                } else {
                    objE15 = new l() { // from class: n1.y1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                        }
                    };
                    rVarH.v(objE15);
                }
                Function0.a(imeOptions7, (l) objE15, rVarH, i1018 & 14);
                l<TextFieldValue, i0> lVarR14 = s3Var.r();
                boolean z8111111110 = !z37;
                i103 = i95;
                if (i103 == 1) {
                    z76 = true;
                } else {
                    z76 = false;
                }
                m mVarB11111 = i5.b(companion2, s3Var, c2Var3, textFieldValue, lVarR14, z8111111110, z76, i0Var2, i7Var, imeOptions7.getImeAction());
                keyboardType = imeOptions7.getKeyboardType();
                companion3 = a0.INSTANCE;
                if (a0.n(keyboardType, companion3.f())) {
                    z77 = false;
                } else {
                    z77 = false;
                }
                boolean zC15 = C(f6VarP);
                zA = rVarH.a(z77) | rVarH.G(k1Var);
                objE16 = rVarH.E();
                if (zA) {
                    objE16 = new er.a() { // from class: n1.z1
                        @Override // er.a
                        public final Object a() {
                            return j2.G(z77, k1Var);
                        }
                    };
                    rVarH.v(objE16);
                } else {
                    objE16 = new er.a() { // from class: n1.z1
                        @Override // er.a
                        public final Object a() {
                            return j2.G(z77, k1Var);
                        }
                    };
                    rVarH.v(objE16);
                }
                m mVarB11112 = v1.b.b(companion2, zC15, z77, (er.a) objE16);
                cVarE = l.e((androidx.compose.ui.graphics.c) rVarH.N(l.c()), ((Color) rVarH.N(l.d())).m20unboximpl(), m.a());
                zG4 = rVarH.G(s3Var) | rVarH.W(cVarE);
                objE17 = rVarH.E();
                if (zG4) {
                    objE17 = new l() { // from class: n1.h2
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.H(s3Var, cVarE, (c) obj);
                        }
                    };
                    rVarH.v(objE17);
                } else {
                    objE17 = new l() { // from class: n1.h2
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.H(s3Var, cVarE, (c) obj);
                        }
                    };
                    rVarH.v(objE17);
                }
                m mVarD14 = k3.k.d(companion2, (l) objE17);
                m mVar1111 = mVar4;
                final a6 a6Var19 = a6Var5;
                m mVarA1111117 = a0(p036e4.l1.a(u5.f(g0(u4.b(h1.a(mVar1111.u(mVarD14), k1Var, s3Var, c2Var3).u(mVarB11112).u(mVarA1111113), s3Var, oVar), s3Var, c2Var3).u(mVarB11111), a6Var19, lVar19, z58, x5.a(rVarH, 0)).u(mVarA1111114).u(hVar14), new l() { // from class: n1.n1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j2.I(s3Var, (b0) obj);
                    }
                }), c2Var3, p0Var2);
                if (!z58) {
                    z78 = false;
                } else {
                    z78 = false;
                }
                if (z78) {
                    mVarZ = c3.z(companion2, c2Var3);
                } else {
                    mVarZ = companion2;
                }
                final m mVar1112 = mVarZ;
                final q qVar16 = qVarB;
                P(mVarA1111117, c2Var3, y2.m.d(-814563849, true, new p() { // from class: n1.o1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j2.J(qVar16, s3Var, textStyle4, z38, i98, i103, a6Var19, textFieldValue, e1Var16, mVarA1111116, mVarB11110, mVarA1111115, mVar1112, aVar15, c2Var3, z78, z37, lVar7, i0Var2, dVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                qVar2 = qVar16;
                i89 = i98;
                rVar2 = rVarH;
                e1Var2 = e1Var16;
                z26 = z37;
                lVar6 = lVar7;
                z25 = z58;
                a6Var2 = a6Var3;
                solidColor = cVar2;
                lVar5 = lVar19;
                l3Var2 = l3VarA;
                mVar3 = mVar1111;
                i88 = i103;
                imeOptions2 = imeOptions7;
                z19 = z38;
                textStyle3 = textStyle4;
            } else {
                rVarH.O();
                z19 = z15;
                imeOptions2 = imeOptions;
                l3Var2 = l3Var;
                qVar2 = qVar;
                a6Var2 = a6Var;
                rVar2 = rVarH;
                textStyle3 = textStyle2;
                lVar6 = lVar4;
                e1Var2 = e1VarC;
                mVar3 = mVar2;
                i88 = i15;
                i89 = i16;
                z25 = z16;
                z26 = z17;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: n1.p1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j2.N(textFieldValue, lVar, mVar3, textStyle3, e1Var2, lVar6, lVar5, solidColor, z19, i88, i89, imeOptions2, l3Var2, z25, z26, qVar2, a6Var2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i25 |= 3072;
        textStyle2 = textStyle;
        i28 = i19 & 16;
        i29 = PKIFailureInfo.certRevoked;
        if (i28 != 0) {
            if ((i17 & 24576) == 0) {
                e1VarC = e1Var;
                if (rVarH.W(e1VarC)) {
                    i35 = 16384;
                } else {
                    i35 = 8192;
                }
                i25 |= i35;
            }
            i36 = i19 & 32;
            if (i36 != 0) {
                i25 |= 196608;
                lVar4 = lVar2;
            } else {
                lVar4 = lVar2;
                if ((i17 & 196608) == 0) {
                    if (rVarH.G(lVar4)) {
                        i37 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i37 = 65536;
                    }
                    i25 |= i37;
                }
            }
            i38 = i19 & 64;
            if (i38 != 0) {
                i25 |= 1572864;
                lVar5 = lVar3;
            } else {
                lVar5 = lVar3;
                if ((i17 & 1572864) == 0) {
                    if (rVarH.W(lVar5)) {
                        i39 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i39 = PKIFailureInfo.signerNotTrusted;
                    }
                    i25 |= i39;
                }
            }
            i45 = i19 & 128;
            if (i45 != 0) {
                i25 |= 12582912;
                solidColor = cVar;
            } else {
                solidColor = cVar;
                if ((i17 & 12582912) == 0) {
                    if (rVarH.W(solidColor)) {
                        i46 = 8388608;
                    } else {
                        i46 = 4194304;
                    }
                    i25 |= i46;
                }
            }
            i47 = i19 & 256;
            if (i47 != 0) {
                i25 |= 100663296;
            } else if ((i17 & 100663296) == 0) {
                if (rVarH.a(z15)) {
                    i48 = 67108864;
                } else {
                    i48 = 33554432;
                }
                i25 |= i48;
            }
            i49 = i19 & 512;
            if (i49 != 0) {
                if ((i17 & 805306368) == 0) {
                    if (rVarH.c(i15)) {
                        i55 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i55 = 268435456;
                    }
                    i25 |= i55;
                }
                i56 = i19 & 1024;
                if (i56 != 0) {
                    i57 = i18 | 6;
                } else if ((i18 & 6) == 0) {
                    if (rVarH.c(i16)) {
                        i58 = 4;
                    } else {
                        i58 = 2;
                    }
                    i57 = i18 | i58;
                } else {
                    i57 = i18;
                }
                if ((i18 & 48) != 0) {
                    i57 |= ((i19 & 2048) == 0 || !rVarH.W(imeOptions)) ? 16 : 32;
                }
                i59 = i57;
                i65 = i19 & PKIFailureInfo.certConfirmed;
                if (i65 != 0) {
                    i66 = i59 | MLKEMEngine.KyberPolyBytes;
                } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                    if (rVarH.W(l3Var)) {
                        i67 = 256;
                    } else {
                        i67 = 128;
                    }
                    i66 = i59 | i67;
                } else {
                    i66 = i59;
                }
                i68 = i19 & PKIFailureInfo.certRevoked;
                if (i68 != 0) {
                    i75 = i66 | 3072;
                } else {
                    i69 = i66;
                    if ((i18 & 3072) == 0) {
                        i75 = i69 | (rVarH.a(z16) ? 2048 : 1024);
                    } else {
                        i75 = i69;
                    }
                }
                i76 = i19 & 16384;
                if (i76 != 0) {
                    i78 = i75 | 24576;
                } else {
                    i77 = i75;
                    if ((i18 & 24576) == 0) {
                        if (rVarH.a(z17)) {
                            i29 = 16384;
                        }
                        i78 = i77 | i29;
                    } else {
                        i78 = i77;
                    }
                }
                i79 = i19 & 32768;
                if (i79 != 0) {
                    i78 |= 196608;
                } else if ((i18 & 196608) == 0) {
                    if (rVarH.G(qVar)) {
                        i85 = PKIFailureInfo.unsupportedVersion;
                    } else {
                        i85 = 65536;
                    }
                    i78 |= i85;
                }
                i86 = i19 & PKIFailureInfo.notAuthorized;
                if (i86 != 0) {
                    i78 |= 1572864;
                } else if ((i18 & 1572864) == 0) {
                    if (rVarH.W(a6Var)) {
                        i87 = PKIFailureInfo.badCertTemplate;
                    } else {
                        i87 = PKIFailureInfo.signerNotTrusted;
                    }
                    i78 |= i87;
                }
                if ((i25 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (rVarH.r(z18, i25 & 1)) {
                    rVarH.I();
                    if ((i17 & 1) != 0) {
                        if (i104 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i28 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        }
                        if (i36 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.g2
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j2.x((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar4 = (l) objE;
                        }
                        if (i38 != 0) {
                            lVar5 = null;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.h(), null);
                        }
                        if (i47 != 0) {
                            z27 = true;
                        } else {
                            z27 = z15;
                        }
                        if (i49 != 0) {
                            i95 = Integer.MAX_VALUE;
                        } else {
                            i95 = i15;
                        }
                        if (i56 != 0) {
                            i96 = 1;
                        } else {
                            i96 = i16;
                        }
                        if ((i19 & 2048) != 0) {
                            imeOptionsA = ImeOptions.INSTANCE.a();
                            i78 &= -113;
                        } else {
                            imeOptionsA = imeOptions;
                        }
                        if (i65 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var;
                        }
                        if (i68 != 0) {
                            z28 = true;
                        } else {
                            z28 = z16;
                        }
                        if (i76 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if (i79 != 0) {
                            qVarB = g1.f130036a.b();
                        } else {
                            qVarB = qVar;
                        }
                        if (i86 != 0) {
                            a6Var3 = null;
                        } else {
                            a6Var3 = a6Var;
                        }
                        lVar7 = lVar4;
                        imeOptions3 = imeOptionsA;
                        z35 = z27;
                        textStyle2 = textStyleA;
                        mVar4 = mVar2;
                        z36 = z28;
                        z37 = z29;
                    } else {
                        if (i104 != 0) {
                            mVar2 = m.INSTANCE;
                        }
                        if (i26 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i28 != 0) {
                            e1VarC = e1.INSTANCE.c();
                        }
                        if (i36 != 0) {
                            objE = rVarH.E();
                            if (objE == r.INSTANCE.a()) {
                                objE = new l() { // from class: n1.g2
                                    @Override // er.l
                                    public final Object b(Object obj) {
                                        return j2.x((TextLayoutResult) obj);
                                    }
                                };
                                rVarH.v(objE);
                            }
                            lVar4 = (l) objE;
                        }
                        if (i38 != 0) {
                            lVar5 = null;
                        }
                        if (i45 != 0) {
                            solidColor = new SolidColor(Color.INSTANCE.h(), null);
                        }
                        if (i47 != 0) {
                            z27 = true;
                        } else {
                            z27 = z15;
                        }
                        if (i49 != 0) {
                            i95 = Integer.MAX_VALUE;
                        } else {
                            i95 = i15;
                        }
                        if (i56 != 0) {
                            i96 = 1;
                        } else {
                            i96 = i16;
                        }
                        if ((i19 & 2048) != 0) {
                            imeOptionsA = ImeOptions.INSTANCE.a();
                            i78 &= -113;
                        } else {
                            imeOptionsA = imeOptions;
                        }
                        if (i65 != 0) {
                            l3VarA = l3.INSTANCE.a();
                        } else {
                            l3VarA = l3Var;
                        }
                        if (i68 != 0) {
                            z28 = true;
                        } else {
                            z28 = z16;
                        }
                        if (i76 != 0) {
                            z29 = false;
                        } else {
                            z29 = z17;
                        }
                        if (i79 != 0) {
                            qVarB = g1.f130036a.b();
                        } else {
                            qVarB = qVar;
                        }
                        if (i86 != 0) {
                            a6Var3 = null;
                        } else {
                            a6Var3 = a6Var;
                        }
                        lVar7 = lVar4;
                        imeOptions3 = imeOptionsA;
                        z35 = z27;
                        textStyle2 = textStyleA;
                        mVar4 = mVar2;
                        z36 = z28;
                        z37 = z29;
                    }
                    rVarH.y();
                    z38 = z35;
                    if (p076m2.t.k()) {
                        p076m2.t.o(31062401, i25, i78, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                    }
                    objE2 = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE2 == companion.a()) {
                        objE2 = new d0();
                        rVarH.v(objE2);
                    }
                    d0Var = (d0) objE2;
                    objE3 = rVarH.E();
                    i97 = i25;
                    if (objE3 == companion.a()) {
                        objE3 = l1.b();
                        rVarH.v(objE3);
                    }
                    k1Var = (k1) objE3;
                    objE4 = rVarH.E();
                    cVar2 = solidColor;
                    if (objE4 == companion.a()) {
                        objE4 = new v0(k1Var);
                        rVarH.v(objE4);
                    }
                    v0Var = (v0) objE4;
                    dVar = (c5.d) rVarH.N(g1.f());
                    bVar = (u4.l.b) rVarH.N(g1.h());
                    selectionBackgroundColor = ((SelectionColors) rVarH.N(g3.c())).getSelectionBackgroundColor();
                    oVar = (o) rVarH.N(g1.g());
                    n3Var = (n3) rVarH.N(g1.v());
                    textStyle4 = textStyle2;
                    r2Var = (r2) rVarH.N(g1.r());
                    i98 = i96;
                    if (i95 == 1) {
                        a2Var = p143z0.a2.Vertical;
                    } else {
                        a2Var = p143z0.a2.Vertical;
                    }
                    if (a6Var3 == null) {
                        rVarH.X(-213744626);
                        Object[] objArr13 = {a2Var};
                        b3.x<a6, Object> xVarA13 = a6.INSTANCE.a();
                        zC = rVarH.c(a2Var.ordinal());
                        objE18 = rVarH.E();
                        if (zC) {
                            objE18 = new er.a() { // from class: n1.q1
                                @Override // er.a
                                public final Object a() {
                                    return j2.O(a2Var);
                                }
                            };
                            rVarH.v(objE18);
                        } else {
                            objE18 = new er.a() { // from class: n1.q1
                                @Override // er.a
                                public final Object a() {
                                    return j2.O(a2Var);
                                }
                            };
                            rVarH.v(objE18);
                        }
                        a6Var4 = (a6) b3.f.i(objArr13, xVarA13, (er.a) objE18, rVarH, 0);
                        rVarH.R();
                    } else {
                        rVarH.X(-213745742);
                        rVarH.R();
                        a6Var4 = a6Var3;
                    }
                    if (a6Var4.j() != a2Var) {
                        StringBuilder sb17 = new StringBuilder();
                        sb17.append("Mismatching scroller orientation; ");
                        if (a2Var == p143z0.a2.Vertical) {
                            str = "only single-line, non-wrap text fields can scroll horizontally";
                        } else {
                            str = "single-line, non-wrap text fields can only scroll horizontally";
                        }
                        sb17.append(str);
                        throw new IllegalArgumentException(sb17.toString());
                    }
                    i99 = i97 & 14;
                    if (i99 == 4) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    if ((i97 & 57344) == 16384) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    z46 = z39 | z45;
                    objE5 = rVarH.E();
                    if (z46) {
                        transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                        composition = textFieldValue.getComposition();
                        if (composition != null) {
                            a6Var5 = a6Var4;
                            transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                            if (transformedTextC2 != null) {
                                objE5 = transformedTextC2;
                            }
                            rVarH.v(objE5);
                        } else {
                            a6Var5 = a6Var4;
                        }
                        objE5 = transformedTextC;
                        rVarH.v(objE5);
                    } else {
                        transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                        composition = textFieldValue.getComposition();
                        if (composition != null) {
                            a6Var5 = a6Var4;
                            transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                            if (transformedTextC2 != null) {
                                objE5 = transformedTextC2;
                            }
                            rVarH.v(objE5);
                        } else {
                            a6Var5 = a6Var4;
                        }
                        objE5 = transformedTextC;
                        rVarH.v(objE5);
                    }
                    TransformedText transformedText13 = (TransformedText) objE5;
                    text = transformedText13.getText();
                    offsetMapping = transformedText13.getOffsetMapping();
                    d4VarC = p076m2.m.c(rVarH, 0);
                    zW = rVarH.W(r2Var);
                    objE6 = rVarH.E();
                    if (zW) {
                        objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                        rVarH.v(objE6);
                    } else {
                        objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                        rVarH.v(objE6);
                    }
                    s3Var = (s3) objE6;
                    s3Var.X(textFieldValue.getText(), text, textStyle4, z38, r55, bVar, lVar, l3VarA, oVar, selectionBackgroundColor);
                    s3Var.getProcessor().e(textFieldValue, s3Var.getInputSession());
                    objE7 = rVarH.E();
                    if (objE7 == companion.a()) {
                        objE7 = new i7(0, 1, null);
                        rVarH.v(objE7);
                    }
                    i7Var = (i7) objE7;
                    i7.f(i7Var, textFieldValue, 0L, 2, null);
                    objE8 = rVarH.E();
                    if (objE8 == companion.a()) {
                        objE8 = Function0.i(tq.j.f191408a, rVarH);
                        rVarH.v(objE8);
                    }
                    p0Var = (p0) objE8;
                    objE9 = rVarH.E();
                    if (objE9 == companion.a()) {
                        objE9 = j1.e.a();
                        rVarH.v(objE9);
                    }
                    aVar = (j1.a) objE9;
                    objE10 = rVarH.E();
                    b1.l lVar110 = lVar5;
                    if (objE10 == companion.a()) {
                        objE10 = new c2(i7Var);
                        rVarH.v(objE10);
                    }
                    c2Var = (c2) objE10;
                    c2Var.L0(offsetMapping);
                    c2Var.U0(e1VarC);
                    c2Var.M0(s3Var.r());
                    c2Var.Q0(s3Var);
                    c2Var.T0(textFieldValue);
                    c2Var.z0((androidx.compose.ui.platform.b1) rVarH.N(g1.d()));
                    c2Var.A0(p0Var);
                    c2Var.R0((v2) rVarH.N(g1.s()));
                    c2Var.I0((v3.a) rVarH.N(g1.j()));
                    c2Var.G0(d0Var);
                    c2Var.E0(!z37);
                    c2Var.F0(z36);
                    if (g0.isSmartSelectionEnabled) {
                        rVarH.X(1966756105);
                        c2Var.N0(f0.h(z1.i0.EditableText, textStyle4.w(), rVarH, 6));
                        rVarH.R();
                    } else {
                        rVarH.X(1966902177);
                        rVarH.R();
                    }
                    s3Var.h();
                    new l() { // from class: n1.r1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.y(c2Var, (q4.e) obj);
                        }
                    };
                    new er.a() { // from class: n1.s1
                        @Override // er.a
                        public final Object a() {
                            return j2.z(c2Var);
                        }
                    };
                    new er.a() { // from class: n1.t1
                        @Override // er.a
                        public final Object a() {
                            return j2.A(c2Var);
                        }
                    };
                    companion2 = m.INSTANCE;
                    boolean zG111117 = rVarH.G(s3Var);
                    i100 = i78 & 7168;
                    i101 = i78;
                    if (i100 == 2048) {
                        z47 = true;
                    } else {
                        z47 = false;
                    }
                    boolean z7111 = z47 | zG111117;
                    if ((i101 & 57344) == 16384) {
                        z48 = true;
                    } else {
                        z48 = false;
                    }
                    boolean zG111118 = z7111 | z48 | rVarH.G(v0Var);
                    if (i99 == 4) {
                        z49 = true;
                    } else {
                        z49 = false;
                    }
                    boolean z8111111111 = zG111118 | z49;
                    i102 = (i101 & 112) ^ 48;
                    if (i102 > 32) {
                        v0Var2 = v0Var;
                        if ((i101 & 48) != 32) {
                            z55 = true;
                        } else {
                            z55 = false;
                        }
                    } else {
                        v0Var2 = v0Var;
                        if ((i101 & 48) != 32) {
                            z55 = true;
                        } else {
                            z55 = false;
                        }
                    }
                    zG = z8111111111 | z55 | rVarH.G(offsetMapping) | rVarH.G(p0Var) | rVarH.G(aVar) | rVarH.G(c2Var);
                    objE11 = rVarH.E();
                    if (zG) {
                        final ImeOptions imeOptions1111110 = imeOptions3;
                        i0Var = offsetMapping;
                        final boolean z8111111112 = z36;
                        final boolean z8111111113 = z37;
                        objE11 = new l() { // from class: n1.u1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.B(s3Var, z8111111112, z8111111113, v0Var2, textFieldValue, imeOptions1111110, i0Var, c2Var, p0Var, aVar, (l0) obj);
                            }
                        };
                        z56 = z8111111112;
                        textFieldValue2 = textFieldValue;
                        imeOptions4 = imeOptions1111110;
                        c2Var2 = c2Var;
                        p0Var2 = p0Var;
                        aVar2 = aVar;
                        rVarH.v(objE11);
                    } else {
                        final ImeOptions imeOptions1111111 = imeOptions3;
                        i0Var = offsetMapping;
                        final boolean z8111111114 = z36;
                        final boolean z8111111115 = z37;
                        objE11 = new l() { // from class: n1.u1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.B(s3Var, z8111111114, z8111111115, v0Var2, textFieldValue, imeOptions1111111, i0Var, c2Var, p0Var, aVar, (l0) obj);
                            }
                        };
                        z56 = z8111111114;
                        textFieldValue2 = textFieldValue;
                        imeOptions4 = imeOptions1111111;
                        c2Var2 = c2Var;
                        p0Var2 = p0Var;
                        aVar2 = aVar;
                        rVarH.v(objE11);
                    }
                    final j1.a aVar16 = aVar2;
                    m mVarA1111118 = v4.a(companion2, z56, d0Var, lVar110, (l) objE11);
                    if (z56) {
                        z57 = false;
                    } else {
                        z57 = false;
                    }
                    Boolean boolValueOf14 = Boolean.valueOf(z57);
                    z58 = z56;
                    f6VarP = x5.p(boolValueOf14, rVarH, 0);
                    i0 i0Var16 = i0.f148189a;
                    boolean zW119 = rVarH.W(f6VarP) | rVarH.G(s3Var) | rVarH.G(v0Var2) | rVarH.G(c2Var2);
                    if (i102 > 32) {
                        imeOptions5 = imeOptions4;
                        if ((i101 & 48) != 32) {
                            z59 = true;
                        } else {
                            z59 = false;
                        }
                    } else {
                        imeOptions5 = imeOptions4;
                        if ((i101 & 48) != 32) {
                            z59 = true;
                        } else {
                            z59 = false;
                        }
                    }
                    z65 = zW119 | z59;
                    objE12 = rVarH.E();
                    if (z65) {
                        ImeOptions imeOptions1111112 = imeOptions5;
                        objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions1111112, null);
                        imeOptions6 = imeOptions1111112;
                        rVarH.v(objE12);
                    } else {
                        ImeOptions imeOptions1111113 = imeOptions5;
                        objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions1111113, null);
                        imeOptions6 = imeOptions1111113;
                        rVarH.v(objE12);
                    }
                    imeOptions7 = imeOptions6;
                    Function0.d(i0Var16, (p) objE12, rVarH, 6);
                    int i1019 = i101 >> 3;
                    c2Var3 = c2Var2;
                    m mVarA1111119 = k5.a(companion2, c2Var3, z58, lVar110, s3Var, d0Var, z37, i0Var, rVarH, (i1019 & 896) | 196614 | ((i97 >> 9) & 7168) | ((i101 << 6) & 3670016));
                    i0Var2 = i0Var;
                    final m mVarB11113 = m2.b(companion2, s3Var, textFieldValue2, i0Var2);
                    boolean zG111119 = rVarH.G(s3Var);
                    if (i100 == 2048) {
                        z66 = true;
                    } else {
                        z66 = false;
                    }
                    boolean zW1110 = zG111119 | z66 | rVarH.W(n3Var) | rVarH.G(c2Var3);
                    if (i99 == 4) {
                        z67 = true;
                    } else {
                        z67 = false;
                    }
                    zG2 = zW1110 | z67 | rVarH.G(i0Var2);
                    objE13 = rVarH.E();
                    if (zG2) {
                        final TextFieldValue textFieldValue1110 = textFieldValue2;
                        objE13 = new l() { // from class: n1.v1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue1110, i0Var2, (b0) obj);
                            }
                        };
                        rVarH.v(objE13);
                    } else {
                        final TextFieldValue textFieldValue1111 = textFieldValue2;
                        objE13 = new l() { // from class: n1.v1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue1111, i0Var2, (b0) obj);
                            }
                        };
                        rVarH.v(objE13);
                    }
                    final m mVarA11111110 = p036e4.l1.a(companion2, (l) objE13);
                    CoreTextFieldSemanticsModifier hVar15 = new CoreTextFieldSemanticsModifier(transformedText13, textFieldValue, s3Var, z37, z58, e1VarC instanceof v4.k0, i0Var2, c2Var3, imeOptions7, d0Var);
                    if (z58) {
                        z68 = false;
                    } else {
                        z68 = false;
                    }
                    final m mVarA11111111 = m2.a(companion2, s3Var, textFieldValue, i0Var2, cVar2, z68);
                    zG3 = rVarH.G(c2Var3);
                    final e1 e1Var17 = e1VarC;
                    objE14 = rVarH.E();
                    if (zG3) {
                        objE14 = new l() { // from class: n1.w1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.E(c2Var3, (s0) obj);
                            }
                        };
                        rVarH.v(objE14);
                    } else {
                        objE14 = new l() { // from class: n1.w1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.E(c2Var3, (s0) obj);
                            }
                        };
                        rVarH.v(objE14);
                    }
                    Function0.a(c2Var3, (l) objE14, rVarH, 0);
                    boolean zG1111110 = rVarH.G(s3Var) | rVarH.G(v0Var2);
                    if (i99 == 4) {
                        z69 = true;
                    } else {
                        z69 = false;
                    }
                    z75 = z69 | zG1111110 | ((i102 <= 32 && rVarH.W(imeOptions7)) || (i101 & 48) == 32);
                    objE15 = rVarH.E();
                    if (z75) {
                        objE15 = new l() { // from class: n1.y1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                            }
                        };
                        rVarH.v(objE15);
                    } else {
                        objE15 = new l() { // from class: n1.y1
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                            }
                        };
                        rVarH.v(objE15);
                    }
                    Function0.a(imeOptions7, (l) objE15, rVarH, i1019 & 14);
                    l<TextFieldValue, i0> lVarR15 = s3Var.r();
                    boolean z8111111116 = !z37;
                    i103 = i95;
                    if (i103 == 1) {
                        z76 = true;
                    } else {
                        z76 = false;
                    }
                    m mVarB11114 = i5.b(companion2, s3Var, c2Var3, textFieldValue, lVarR15, z8111111116, z76, i0Var2, i7Var, imeOptions7.getImeAction());
                    keyboardType = imeOptions7.getKeyboardType();
                    companion3 = a0.INSTANCE;
                    if (a0.n(keyboardType, companion3.f())) {
                        z77 = false;
                    } else {
                        z77 = false;
                    }
                    boolean zC16 = C(f6VarP);
                    zA = rVarH.a(z77) | rVarH.G(k1Var);
                    objE16 = rVarH.E();
                    if (zA) {
                        objE16 = new er.a() { // from class: n1.z1
                            @Override // er.a
                            public final Object a() {
                                return j2.G(z77, k1Var);
                            }
                        };
                        rVarH.v(objE16);
                    } else {
                        objE16 = new er.a() { // from class: n1.z1
                            @Override // er.a
                            public final Object a() {
                                return j2.G(z77, k1Var);
                            }
                        };
                        rVarH.v(objE16);
                    }
                    m mVarB11115 = v1.b.b(companion2, zC16, z77, (er.a) objE16);
                    cVarE = l.e((androidx.compose.ui.graphics.c) rVarH.N(l.c()), ((Color) rVarH.N(l.d())).m20unboximpl(), m.a());
                    zG4 = rVarH.G(s3Var) | rVarH.W(cVarE);
                    objE17 = rVarH.E();
                    if (zG4) {
                        objE17 = new l() { // from class: n1.h2
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.H(s3Var, cVarE, (c) obj);
                            }
                        };
                        rVarH.v(objE17);
                    } else {
                        objE17 = new l() { // from class: n1.h2
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.H(s3Var, cVarE, (c) obj);
                            }
                        };
                        rVarH.v(objE17);
                    }
                    m mVarD15 = k3.k.d(companion2, (l) objE17);
                    m mVar1113 = mVar4;
                    final a6 a6Var110 = a6Var5;
                    m mVarA11111112 = a0(p036e4.l1.a(u5.f(g0(u4.b(h1.a(mVar1113.u(mVarD15), k1Var, s3Var, c2Var3).u(mVarB11115).u(mVarA1111118), s3Var, oVar), s3Var, c2Var3).u(mVarB11114), a6Var110, lVar110, z58, x5.a(rVarH, 0)).u(mVarA1111119).u(hVar15), new l() { // from class: n1.n1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.I(s3Var, (b0) obj);
                        }
                    }), c2Var3, p0Var2);
                    if (!z58) {
                        z78 = false;
                    } else {
                        z78 = false;
                    }
                    if (z78) {
                        mVarZ = c3.z(companion2, c2Var3);
                    } else {
                        mVarZ = companion2;
                    }
                    final m mVar1114 = mVarZ;
                    final q qVar17 = qVarB;
                    P(mVarA11111112, c2Var3, y2.m.d(-814563849, true, new p() { // from class: n1.o1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j2.J(qVar17, s3Var, textStyle4, z38, i98, i103, a6Var110, textFieldValue, e1Var17, mVarA11111111, mVarB11113, mVarA11111110, mVar1114, aVar16, c2Var3, z78, z37, lVar7, i0Var2, dVar, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    qVar2 = qVar17;
                    i89 = i98;
                    rVar2 = rVarH;
                    e1Var2 = e1Var17;
                    z26 = z37;
                    lVar6 = lVar7;
                    z25 = z58;
                    a6Var2 = a6Var3;
                    solidColor = cVar2;
                    lVar5 = lVar110;
                    l3Var2 = l3VarA;
                    mVar3 = mVar1113;
                    i88 = i103;
                    imeOptions2 = imeOptions7;
                    z19 = z38;
                    textStyle3 = textStyle4;
                } else {
                    rVarH.O();
                    z19 = z15;
                    imeOptions2 = imeOptions;
                    l3Var2 = l3Var;
                    qVar2 = qVar;
                    a6Var2 = a6Var;
                    rVar2 = rVarH;
                    textStyle3 = textStyle2;
                    lVar6 = lVar4;
                    e1Var2 = e1VarC;
                    mVar3 = mVar2;
                    i88 = i15;
                    i89 = i16;
                    z25 = z16;
                    z26 = z17;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: n1.p1
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return j2.N(textFieldValue, lVar, mVar3, textStyle3, e1Var2, lVar6, lVar5, solidColor, z19, i88, i89, imeOptions2, l3Var2, z25, z26, qVar2, a6Var2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i25 |= 805306368;
            i56 = i19 & 1024;
            if (i56 != 0) {
                i57 = i18 | 6;
            } else if ((i18 & 6) == 0) {
                if (rVarH.c(i16)) {
                    i58 = 4;
                } else {
                    i58 = 2;
                }
                i57 = i18 | i58;
            } else {
                i57 = i18;
            }
            if ((i18 & 48) != 0) {
                i57 |= ((i19 & 2048) == 0 || !rVarH.W(imeOptions)) ? 16 : 32;
            }
            i59 = i57;
            i65 = i19 & PKIFailureInfo.certConfirmed;
            if (i65 != 0) {
                i66 = i59 | MLKEMEngine.KyberPolyBytes;
            } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                if (rVarH.W(l3Var)) {
                    i67 = 256;
                } else {
                    i67 = 128;
                }
                i66 = i59 | i67;
            } else {
                i66 = i59;
            }
            i68 = i19 & PKIFailureInfo.certRevoked;
            if (i68 != 0) {
                i75 = i66 | 3072;
            } else {
                i69 = i66;
                if ((i18 & 3072) == 0) {
                    i75 = i69 | (rVarH.a(z16) ? 2048 : 1024);
                } else {
                    i75 = i69;
                }
            }
            i76 = i19 & 16384;
            if (i76 != 0) {
                i78 = i75 | 24576;
            } else {
                i77 = i75;
                if ((i18 & 24576) == 0) {
                    if (rVarH.a(z17)) {
                        i29 = 16384;
                    }
                    i78 = i77 | i29;
                } else {
                    i78 = i77;
                }
            }
            i79 = i19 & 32768;
            if (i79 != 0) {
                i78 |= 196608;
            } else if ((i18 & 196608) == 0) {
                if (rVarH.G(qVar)) {
                    i85 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i85 = 65536;
                }
                i78 |= i85;
            }
            i86 = i19 & PKIFailureInfo.notAuthorized;
            if (i86 != 0) {
                i78 |= 1572864;
            } else if ((i18 & 1572864) == 0) {
                if (rVarH.W(a6Var)) {
                    i87 = PKIFailureInfo.badCertTemplate;
                } else {
                    i87 = PKIFailureInfo.signerNotTrusted;
                }
                i78 |= i87;
            }
            if ((i25 & 306783379) == 306783378) {
                z18 = true;
            } else {
                z18 = true;
            }
            if (rVarH.r(z18, i25 & 1)) {
                rVarH.I();
                if ((i17 & 1) != 0) {
                    if (i104 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i26 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i28 != 0) {
                        e1VarC = e1.INSTANCE.c();
                    }
                    if (i36 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: n1.g2
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.x((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar4 = (l) objE;
                    }
                    if (i38 != 0) {
                        lVar5 = null;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.h(), null);
                    }
                    if (i47 != 0) {
                        z27 = true;
                    } else {
                        z27 = z15;
                    }
                    if (i49 != 0) {
                        i95 = Integer.MAX_VALUE;
                    } else {
                        i95 = i15;
                    }
                    if (i56 != 0) {
                        i96 = 1;
                    } else {
                        i96 = i16;
                    }
                    if ((i19 & 2048) != 0) {
                        imeOptionsA = ImeOptions.INSTANCE.a();
                        i78 &= -113;
                    } else {
                        imeOptionsA = imeOptions;
                    }
                    if (i65 != 0) {
                        l3VarA = l3.INSTANCE.a();
                    } else {
                        l3VarA = l3Var;
                    }
                    if (i68 != 0) {
                        z28 = true;
                    } else {
                        z28 = z16;
                    }
                    if (i76 != 0) {
                        z29 = false;
                    } else {
                        z29 = z17;
                    }
                    if (i79 != 0) {
                        qVarB = g1.f130036a.b();
                    } else {
                        qVarB = qVar;
                    }
                    if (i86 != 0) {
                        a6Var3 = null;
                    } else {
                        a6Var3 = a6Var;
                    }
                    lVar7 = lVar4;
                    imeOptions3 = imeOptionsA;
                    z35 = z27;
                    textStyle2 = textStyleA;
                    mVar4 = mVar2;
                    z36 = z28;
                    z37 = z29;
                } else {
                    if (i104 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i26 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i28 != 0) {
                        e1VarC = e1.INSTANCE.c();
                    }
                    if (i36 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: n1.g2
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.x((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar4 = (l) objE;
                    }
                    if (i38 != 0) {
                        lVar5 = null;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.h(), null);
                    }
                    if (i47 != 0) {
                        z27 = true;
                    } else {
                        z27 = z15;
                    }
                    if (i49 != 0) {
                        i95 = Integer.MAX_VALUE;
                    } else {
                        i95 = i15;
                    }
                    if (i56 != 0) {
                        i96 = 1;
                    } else {
                        i96 = i16;
                    }
                    if ((i19 & 2048) != 0) {
                        imeOptionsA = ImeOptions.INSTANCE.a();
                        i78 &= -113;
                    } else {
                        imeOptionsA = imeOptions;
                    }
                    if (i65 != 0) {
                        l3VarA = l3.INSTANCE.a();
                    } else {
                        l3VarA = l3Var;
                    }
                    if (i68 != 0) {
                        z28 = true;
                    } else {
                        z28 = z16;
                    }
                    if (i76 != 0) {
                        z29 = false;
                    } else {
                        z29 = z17;
                    }
                    if (i79 != 0) {
                        qVarB = g1.f130036a.b();
                    } else {
                        qVarB = qVar;
                    }
                    if (i86 != 0) {
                        a6Var3 = null;
                    } else {
                        a6Var3 = a6Var;
                    }
                    lVar7 = lVar4;
                    imeOptions3 = imeOptionsA;
                    z35 = z27;
                    textStyle2 = textStyleA;
                    mVar4 = mVar2;
                    z36 = z28;
                    z37 = z29;
                }
                rVarH.y();
                z38 = z35;
                if (p076m2.t.k()) {
                    p076m2.t.o(31062401, i25, i78, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                }
                objE2 = rVarH.E();
                companion = r.INSTANCE;
                if (objE2 == companion.a()) {
                    objE2 = new d0();
                    rVarH.v(objE2);
                }
                d0Var = (d0) objE2;
                objE3 = rVarH.E();
                i97 = i25;
                if (objE3 == companion.a()) {
                    objE3 = l1.b();
                    rVarH.v(objE3);
                }
                k1Var = (k1) objE3;
                objE4 = rVarH.E();
                cVar2 = solidColor;
                if (objE4 == companion.a()) {
                    objE4 = new v0(k1Var);
                    rVarH.v(objE4);
                }
                v0Var = (v0) objE4;
                dVar = (c5.d) rVarH.N(g1.f());
                bVar = (u4.l.b) rVarH.N(g1.h());
                selectionBackgroundColor = ((SelectionColors) rVarH.N(g3.c())).getSelectionBackgroundColor();
                oVar = (o) rVarH.N(g1.g());
                n3Var = (n3) rVarH.N(g1.v());
                textStyle4 = textStyle2;
                r2Var = (r2) rVarH.N(g1.r());
                i98 = i96;
                if (i95 == 1) {
                    a2Var = p143z0.a2.Vertical;
                } else {
                    a2Var = p143z0.a2.Vertical;
                }
                if (a6Var3 == null) {
                    rVarH.X(-213744626);
                    Object[] objArr14 = {a2Var};
                    b3.x<a6, Object> xVarA14 = a6.INSTANCE.a();
                    zC = rVarH.c(a2Var.ordinal());
                    objE18 = rVarH.E();
                    if (zC) {
                        objE18 = new er.a() { // from class: n1.q1
                            @Override // er.a
                            public final Object a() {
                                return j2.O(a2Var);
                            }
                        };
                        rVarH.v(objE18);
                    } else {
                        objE18 = new er.a() { // from class: n1.q1
                            @Override // er.a
                            public final Object a() {
                                return j2.O(a2Var);
                            }
                        };
                        rVarH.v(objE18);
                    }
                    a6Var4 = (a6) b3.f.i(objArr14, xVarA14, (er.a) objE18, rVarH, 0);
                    rVarH.R();
                } else {
                    rVarH.X(-213745742);
                    rVarH.R();
                    a6Var4 = a6Var3;
                }
                if (a6Var4.j() != a2Var) {
                    StringBuilder sb18 = new StringBuilder();
                    sb18.append("Mismatching scroller orientation; ");
                    if (a2Var == p143z0.a2.Vertical) {
                        str = "only single-line, non-wrap text fields can scroll horizontally";
                    } else {
                        str = "single-line, non-wrap text fields can only scroll horizontally";
                    }
                    sb18.append(str);
                    throw new IllegalArgumentException(sb18.toString());
                }
                i99 = i97 & 14;
                if (i99 == 4) {
                    z39 = true;
                } else {
                    z39 = false;
                }
                if ((i97 & 57344) == 16384) {
                    z45 = true;
                } else {
                    z45 = false;
                }
                z46 = z39 | z45;
                objE5 = rVarH.E();
                if (z46) {
                    transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                    composition = textFieldValue.getComposition();
                    if (composition != null) {
                        a6Var5 = a6Var4;
                        transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                        if (transformedTextC2 != null) {
                            objE5 = transformedTextC2;
                        }
                        rVarH.v(objE5);
                    } else {
                        a6Var5 = a6Var4;
                    }
                    objE5 = transformedTextC;
                    rVarH.v(objE5);
                } else {
                    transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                    composition = textFieldValue.getComposition();
                    if (composition != null) {
                        a6Var5 = a6Var4;
                        transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                        if (transformedTextC2 != null) {
                            objE5 = transformedTextC2;
                        }
                        rVarH.v(objE5);
                    } else {
                        a6Var5 = a6Var4;
                    }
                    objE5 = transformedTextC;
                    rVarH.v(objE5);
                }
                TransformedText transformedText14 = (TransformedText) objE5;
                text = transformedText14.getText();
                offsetMapping = transformedText14.getOffsetMapping();
                d4VarC = p076m2.m.c(rVarH, 0);
                zW = rVarH.W(r2Var);
                objE6 = rVarH.E();
                if (zW) {
                    objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                    rVarH.v(objE6);
                } else {
                    objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                    rVarH.v(objE6);
                }
                s3Var = (s3) objE6;
                s3Var.X(textFieldValue.getText(), text, textStyle4, z38, r55, bVar, lVar, l3VarA, oVar, selectionBackgroundColor);
                s3Var.getProcessor().e(textFieldValue, s3Var.getInputSession());
                objE7 = rVarH.E();
                if (objE7 == companion.a()) {
                    objE7 = new i7(0, 1, null);
                    rVarH.v(objE7);
                }
                i7Var = (i7) objE7;
                i7.f(i7Var, textFieldValue, 0L, 2, null);
                objE8 = rVarH.E();
                if (objE8 == companion.a()) {
                    objE8 = Function0.i(tq.j.f191408a, rVarH);
                    rVarH.v(objE8);
                }
                p0Var = (p0) objE8;
                objE9 = rVarH.E();
                if (objE9 == companion.a()) {
                    objE9 = j1.e.a();
                    rVarH.v(objE9);
                }
                aVar = (j1.a) objE9;
                objE10 = rVarH.E();
                b1.l lVar111 = lVar5;
                if (objE10 == companion.a()) {
                    objE10 = new c2(i7Var);
                    rVarH.v(objE10);
                }
                c2Var = (c2) objE10;
                c2Var.L0(offsetMapping);
                c2Var.U0(e1VarC);
                c2Var.M0(s3Var.r());
                c2Var.Q0(s3Var);
                c2Var.T0(textFieldValue);
                c2Var.z0((androidx.compose.ui.platform.b1) rVarH.N(g1.d()));
                c2Var.A0(p0Var);
                c2Var.R0((v2) rVarH.N(g1.s()));
                c2Var.I0((v3.a) rVarH.N(g1.j()));
                c2Var.G0(d0Var);
                c2Var.E0(!z37);
                c2Var.F0(z36);
                if (g0.isSmartSelectionEnabled) {
                    rVarH.X(1966756105);
                    c2Var.N0(f0.h(z1.i0.EditableText, textStyle4.w(), rVarH, 6));
                    rVarH.R();
                } else {
                    rVarH.X(1966902177);
                    rVarH.R();
                }
                s3Var.h();
                new l() { // from class: n1.r1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j2.y(c2Var, (q4.e) obj);
                    }
                };
                new er.a() { // from class: n1.s1
                    @Override // er.a
                    public final Object a() {
                        return j2.z(c2Var);
                    }
                };
                new er.a() { // from class: n1.t1
                    @Override // er.a
                    public final Object a() {
                        return j2.A(c2Var);
                    }
                };
                companion2 = m.INSTANCE;
                boolean zG1111111 = rVarH.G(s3Var);
                i100 = i78 & 7168;
                i101 = i78;
                if (i100 == 2048) {
                    z47 = true;
                } else {
                    z47 = false;
                }
                boolean z7112 = z47 | zG1111111;
                if ((i101 & 57344) == 16384) {
                    z48 = true;
                } else {
                    z48 = false;
                }
                boolean zG1111112 = z7112 | z48 | rVarH.G(v0Var);
                if (i99 == 4) {
                    z49 = true;
                } else {
                    z49 = false;
                }
                boolean z8111111117 = zG1111112 | z49;
                i102 = (i101 & 112) ^ 48;
                if (i102 > 32) {
                    v0Var2 = v0Var;
                    if ((i101 & 48) != 32) {
                        z55 = true;
                    } else {
                        z55 = false;
                    }
                } else {
                    v0Var2 = v0Var;
                    if ((i101 & 48) != 32) {
                        z55 = true;
                    } else {
                        z55 = false;
                    }
                }
                zG = z8111111117 | z55 | rVarH.G(offsetMapping) | rVarH.G(p0Var) | rVarH.G(aVar) | rVarH.G(c2Var);
                objE11 = rVarH.E();
                if (zG) {
                    final ImeOptions imeOptions1111114 = imeOptions3;
                    i0Var = offsetMapping;
                    final boolean z8111111118 = z36;
                    final boolean z8111111119 = z37;
                    objE11 = new l() { // from class: n1.u1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.B(s3Var, z8111111118, z8111111119, v0Var2, textFieldValue, imeOptions1111114, i0Var, c2Var, p0Var, aVar, (l0) obj);
                        }
                    };
                    z56 = z8111111118;
                    textFieldValue2 = textFieldValue;
                    imeOptions4 = imeOptions1111114;
                    c2Var2 = c2Var;
                    p0Var2 = p0Var;
                    aVar2 = aVar;
                    rVarH.v(objE11);
                } else {
                    final ImeOptions imeOptions1111115 = imeOptions3;
                    i0Var = offsetMapping;
                    final boolean z81111111110 = z36;
                    final boolean z81111111111 = z37;
                    objE11 = new l() { // from class: n1.u1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.B(s3Var, z81111111110, z81111111111, v0Var2, textFieldValue, imeOptions1111115, i0Var, c2Var, p0Var, aVar, (l0) obj);
                        }
                    };
                    z56 = z81111111110;
                    textFieldValue2 = textFieldValue;
                    imeOptions4 = imeOptions1111115;
                    c2Var2 = c2Var;
                    p0Var2 = p0Var;
                    aVar2 = aVar;
                    rVarH.v(objE11);
                }
                final j1.a aVar17 = aVar2;
                m mVarA11111113 = v4.a(companion2, z56, d0Var, lVar111, (l) objE11);
                if (z56) {
                    z57 = false;
                } else {
                    z57 = false;
                }
                Boolean boolValueOf15 = Boolean.valueOf(z57);
                z58 = z56;
                f6VarP = x5.p(boolValueOf15, rVarH, 0);
                i0 i0Var17 = i0.f148189a;
                boolean zW1111 = rVarH.W(f6VarP) | rVarH.G(s3Var) | rVarH.G(v0Var2) | rVarH.G(c2Var2);
                if (i102 > 32) {
                    imeOptions5 = imeOptions4;
                    if ((i101 & 48) != 32) {
                        z59 = true;
                    } else {
                        z59 = false;
                    }
                } else {
                    imeOptions5 = imeOptions4;
                    if ((i101 & 48) != 32) {
                        z59 = true;
                    } else {
                        z59 = false;
                    }
                }
                z65 = zW1111 | z59;
                objE12 = rVarH.E();
                if (z65) {
                    ImeOptions imeOptions1111116 = imeOptions5;
                    objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions1111116, null);
                    imeOptions6 = imeOptions1111116;
                    rVarH.v(objE12);
                } else {
                    ImeOptions imeOptions1111117 = imeOptions5;
                    objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions1111117, null);
                    imeOptions6 = imeOptions1111117;
                    rVarH.v(objE12);
                }
                imeOptions7 = imeOptions6;
                Function0.d(i0Var17, (p) objE12, rVarH, 6);
                int i10110 = i101 >> 3;
                c2Var3 = c2Var2;
                m mVarA11111114 = k5.a(companion2, c2Var3, z58, lVar111, s3Var, d0Var, z37, i0Var, rVarH, (i10110 & 896) | 196614 | ((i97 >> 9) & 7168) | ((i101 << 6) & 3670016));
                i0Var2 = i0Var;
                final m mVarB11116 = m2.b(companion2, s3Var, textFieldValue2, i0Var2);
                boolean zG1111113 = rVarH.G(s3Var);
                if (i100 == 2048) {
                    z66 = true;
                } else {
                    z66 = false;
                }
                boolean zW1112 = zG1111113 | z66 | rVarH.W(n3Var) | rVarH.G(c2Var3);
                if (i99 == 4) {
                    z67 = true;
                } else {
                    z67 = false;
                }
                zG2 = zW1112 | z67 | rVarH.G(i0Var2);
                objE13 = rVarH.E();
                if (zG2) {
                    final TextFieldValue textFieldValue1112 = textFieldValue2;
                    objE13 = new l() { // from class: n1.v1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue1112, i0Var2, (b0) obj);
                        }
                    };
                    rVarH.v(objE13);
                } else {
                    final TextFieldValue textFieldValue1113 = textFieldValue2;
                    objE13 = new l() { // from class: n1.v1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue1113, i0Var2, (b0) obj);
                        }
                    };
                    rVarH.v(objE13);
                }
                final m mVarA11111115 = p036e4.l1.a(companion2, (l) objE13);
                CoreTextFieldSemanticsModifier hVar16 = new CoreTextFieldSemanticsModifier(transformedText14, textFieldValue, s3Var, z37, z58, e1VarC instanceof v4.k0, i0Var2, c2Var3, imeOptions7, d0Var);
                if (z58) {
                    z68 = false;
                } else {
                    z68 = false;
                }
                final m mVarA11111116 = m2.a(companion2, s3Var, textFieldValue, i0Var2, cVar2, z68);
                zG3 = rVarH.G(c2Var3);
                final e1 e1Var18 = e1VarC;
                objE14 = rVarH.E();
                if (zG3) {
                    objE14 = new l() { // from class: n1.w1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.E(c2Var3, (s0) obj);
                        }
                    };
                    rVarH.v(objE14);
                } else {
                    objE14 = new l() { // from class: n1.w1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.E(c2Var3, (s0) obj);
                        }
                    };
                    rVarH.v(objE14);
                }
                Function0.a(c2Var3, (l) objE14, rVarH, 0);
                boolean zG1111114 = rVarH.G(s3Var) | rVarH.G(v0Var2);
                if (i99 == 4) {
                    z69 = true;
                } else {
                    z69 = false;
                }
                z75 = z69 | zG1111114 | ((i102 <= 32 && rVarH.W(imeOptions7)) || (i101 & 48) == 32);
                objE15 = rVarH.E();
                if (z75) {
                    objE15 = new l() { // from class: n1.y1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                        }
                    };
                    rVarH.v(objE15);
                } else {
                    objE15 = new l() { // from class: n1.y1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                        }
                    };
                    rVarH.v(objE15);
                }
                Function0.a(imeOptions7, (l) objE15, rVarH, i10110 & 14);
                l<TextFieldValue, i0> lVarR16 = s3Var.r();
                boolean z81111111112 = !z37;
                i103 = i95;
                if (i103 == 1) {
                    z76 = true;
                } else {
                    z76 = false;
                }
                m mVarB11117 = i5.b(companion2, s3Var, c2Var3, textFieldValue, lVarR16, z81111111112, z76, i0Var2, i7Var, imeOptions7.getImeAction());
                keyboardType = imeOptions7.getKeyboardType();
                companion3 = a0.INSTANCE;
                if (a0.n(keyboardType, companion3.f())) {
                    z77 = false;
                } else {
                    z77 = false;
                }
                boolean zC17 = C(f6VarP);
                zA = rVarH.a(z77) | rVarH.G(k1Var);
                objE16 = rVarH.E();
                if (zA) {
                    objE16 = new er.a() { // from class: n1.z1
                        @Override // er.a
                        public final Object a() {
                            return j2.G(z77, k1Var);
                        }
                    };
                    rVarH.v(objE16);
                } else {
                    objE16 = new er.a() { // from class: n1.z1
                        @Override // er.a
                        public final Object a() {
                            return j2.G(z77, k1Var);
                        }
                    };
                    rVarH.v(objE16);
                }
                m mVarB11118 = v1.b.b(companion2, zC17, z77, (er.a) objE16);
                cVarE = l.e((androidx.compose.ui.graphics.c) rVarH.N(l.c()), ((Color) rVarH.N(l.d())).m20unboximpl(), m.a());
                zG4 = rVarH.G(s3Var) | rVarH.W(cVarE);
                objE17 = rVarH.E();
                if (zG4) {
                    objE17 = new l() { // from class: n1.h2
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.H(s3Var, cVarE, (c) obj);
                        }
                    };
                    rVarH.v(objE17);
                } else {
                    objE17 = new l() { // from class: n1.h2
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.H(s3Var, cVarE, (c) obj);
                        }
                    };
                    rVarH.v(objE17);
                }
                m mVarD16 = k3.k.d(companion2, (l) objE17);
                m mVar1115 = mVar4;
                final a6 a6Var111 = a6Var5;
                m mVarA11111117 = a0(p036e4.l1.a(u5.f(g0(u4.b(h1.a(mVar1115.u(mVarD16), k1Var, s3Var, c2Var3).u(mVarB11118).u(mVarA11111113), s3Var, oVar), s3Var, c2Var3).u(mVarB11117), a6Var111, lVar111, z58, x5.a(rVarH, 0)).u(mVarA11111114).u(hVar16), new l() { // from class: n1.n1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j2.I(s3Var, (b0) obj);
                    }
                }), c2Var3, p0Var2);
                if (!z58) {
                    z78 = false;
                } else {
                    z78 = false;
                }
                if (z78) {
                    mVarZ = c3.z(companion2, c2Var3);
                } else {
                    mVarZ = companion2;
                }
                final m mVar1116 = mVarZ;
                final q qVar18 = qVarB;
                P(mVarA11111117, c2Var3, y2.m.d(-814563849, true, new p() { // from class: n1.o1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j2.J(qVar18, s3Var, textStyle4, z38, i98, i103, a6Var111, textFieldValue, e1Var18, mVarA11111116, mVarB11116, mVarA11111115, mVar1116, aVar17, c2Var3, z78, z37, lVar7, i0Var2, dVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                qVar2 = qVar18;
                i89 = i98;
                rVar2 = rVarH;
                e1Var2 = e1Var18;
                z26 = z37;
                lVar6 = lVar7;
                z25 = z58;
                a6Var2 = a6Var3;
                solidColor = cVar2;
                lVar5 = lVar111;
                l3Var2 = l3VarA;
                mVar3 = mVar1115;
                i88 = i103;
                imeOptions2 = imeOptions7;
                z19 = z38;
                textStyle3 = textStyle4;
            } else {
                rVarH.O();
                z19 = z15;
                imeOptions2 = imeOptions;
                l3Var2 = l3Var;
                qVar2 = qVar;
                a6Var2 = a6Var;
                rVar2 = rVarH;
                textStyle3 = textStyle2;
                lVar6 = lVar4;
                e1Var2 = e1VarC;
                mVar3 = mVar2;
                i88 = i15;
                i89 = i16;
                z25 = z16;
                z26 = z17;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: n1.p1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j2.N(textFieldValue, lVar, mVar3, textStyle3, e1Var2, lVar6, lVar5, solidColor, z19, i88, i89, imeOptions2, l3Var2, z25, z26, qVar2, a6Var2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i25 |= 24576;
        e1VarC = e1Var;
        i36 = i19 & 32;
        if (i36 != 0) {
            i25 |= 196608;
            lVar4 = lVar2;
        } else {
            lVar4 = lVar2;
            if ((i17 & 196608) == 0) {
                if (rVarH.G(lVar4)) {
                    i37 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i37 = 65536;
                }
                i25 |= i37;
            }
        }
        i38 = i19 & 64;
        if (i38 != 0) {
            i25 |= 1572864;
            lVar5 = lVar3;
        } else {
            lVar5 = lVar3;
            if ((i17 & 1572864) == 0) {
                if (rVarH.W(lVar5)) {
                    i39 = PKIFailureInfo.badCertTemplate;
                } else {
                    i39 = PKIFailureInfo.signerNotTrusted;
                }
                i25 |= i39;
            }
        }
        i45 = i19 & 128;
        if (i45 != 0) {
            i25 |= 12582912;
            solidColor = cVar;
        } else {
            solidColor = cVar;
            if ((i17 & 12582912) == 0) {
                if (rVarH.W(solidColor)) {
                    i46 = 8388608;
                } else {
                    i46 = 4194304;
                }
                i25 |= i46;
            }
        }
        i47 = i19 & 256;
        if (i47 != 0) {
            i25 |= 100663296;
        } else if ((i17 & 100663296) == 0) {
            if (rVarH.a(z15)) {
                i48 = 67108864;
            } else {
                i48 = 33554432;
            }
            i25 |= i48;
        }
        i49 = i19 & 512;
        if (i49 != 0) {
            if ((i17 & 805306368) == 0) {
                if (rVarH.c(i15)) {
                    i55 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i55 = 268435456;
                }
                i25 |= i55;
            }
            i56 = i19 & 1024;
            if (i56 != 0) {
                i57 = i18 | 6;
            } else if ((i18 & 6) == 0) {
                if (rVarH.c(i16)) {
                    i58 = 4;
                } else {
                    i58 = 2;
                }
                i57 = i18 | i58;
            } else {
                i57 = i18;
            }
            if ((i18 & 48) != 0) {
                i57 |= ((i19 & 2048) == 0 || !rVarH.W(imeOptions)) ? 16 : 32;
            }
            i59 = i57;
            i65 = i19 & PKIFailureInfo.certConfirmed;
            if (i65 != 0) {
                i66 = i59 | MLKEMEngine.KyberPolyBytes;
            } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
                if (rVarH.W(l3Var)) {
                    i67 = 256;
                } else {
                    i67 = 128;
                }
                i66 = i59 | i67;
            } else {
                i66 = i59;
            }
            i68 = i19 & PKIFailureInfo.certRevoked;
            if (i68 != 0) {
                i75 = i66 | 3072;
            } else {
                i69 = i66;
                if ((i18 & 3072) == 0) {
                    i75 = i69 | (rVarH.a(z16) ? 2048 : 1024);
                } else {
                    i75 = i69;
                }
            }
            i76 = i19 & 16384;
            if (i76 != 0) {
                i78 = i75 | 24576;
            } else {
                i77 = i75;
                if ((i18 & 24576) == 0) {
                    if (rVarH.a(z17)) {
                        i29 = 16384;
                    }
                    i78 = i77 | i29;
                } else {
                    i78 = i77;
                }
            }
            i79 = i19 & 32768;
            if (i79 != 0) {
                i78 |= 196608;
            } else if ((i18 & 196608) == 0) {
                if (rVarH.G(qVar)) {
                    i85 = PKIFailureInfo.unsupportedVersion;
                } else {
                    i85 = 65536;
                }
                i78 |= i85;
            }
            i86 = i19 & PKIFailureInfo.notAuthorized;
            if (i86 != 0) {
                i78 |= 1572864;
            } else if ((i18 & 1572864) == 0) {
                if (rVarH.W(a6Var)) {
                    i87 = PKIFailureInfo.badCertTemplate;
                } else {
                    i87 = PKIFailureInfo.signerNotTrusted;
                }
                i78 |= i87;
            }
            if ((i25 & 306783379) == 306783378) {
                z18 = true;
            } else {
                z18 = true;
            }
            if (rVarH.r(z18, i25 & 1)) {
                rVarH.I();
                if ((i17 & 1) != 0) {
                    if (i104 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i26 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i28 != 0) {
                        e1VarC = e1.INSTANCE.c();
                    }
                    if (i36 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: n1.g2
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.x((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar4 = (l) objE;
                    }
                    if (i38 != 0) {
                        lVar5 = null;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.h(), null);
                    }
                    if (i47 != 0) {
                        z27 = true;
                    } else {
                        z27 = z15;
                    }
                    if (i49 != 0) {
                        i95 = Integer.MAX_VALUE;
                    } else {
                        i95 = i15;
                    }
                    if (i56 != 0) {
                        i96 = 1;
                    } else {
                        i96 = i16;
                    }
                    if ((i19 & 2048) != 0) {
                        imeOptionsA = ImeOptions.INSTANCE.a();
                        i78 &= -113;
                    } else {
                        imeOptionsA = imeOptions;
                    }
                    if (i65 != 0) {
                        l3VarA = l3.INSTANCE.a();
                    } else {
                        l3VarA = l3Var;
                    }
                    if (i68 != 0) {
                        z28 = true;
                    } else {
                        z28 = z16;
                    }
                    if (i76 != 0) {
                        z29 = false;
                    } else {
                        z29 = z17;
                    }
                    if (i79 != 0) {
                        qVarB = g1.f130036a.b();
                    } else {
                        qVarB = qVar;
                    }
                    if (i86 != 0) {
                        a6Var3 = null;
                    } else {
                        a6Var3 = a6Var;
                    }
                    lVar7 = lVar4;
                    imeOptions3 = imeOptionsA;
                    z35 = z27;
                    textStyle2 = textStyleA;
                    mVar4 = mVar2;
                    z36 = z28;
                    z37 = z29;
                } else {
                    if (i104 != 0) {
                        mVar2 = m.INSTANCE;
                    }
                    if (i26 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i28 != 0) {
                        e1VarC = e1.INSTANCE.c();
                    }
                    if (i36 != 0) {
                        objE = rVarH.E();
                        if (objE == r.INSTANCE.a()) {
                            objE = new l() { // from class: n1.g2
                                @Override // er.l
                                public final Object b(Object obj) {
                                    return j2.x((TextLayoutResult) obj);
                                }
                            };
                            rVarH.v(objE);
                        }
                        lVar4 = (l) objE;
                    }
                    if (i38 != 0) {
                        lVar5 = null;
                    }
                    if (i45 != 0) {
                        solidColor = new SolidColor(Color.INSTANCE.h(), null);
                    }
                    if (i47 != 0) {
                        z27 = true;
                    } else {
                        z27 = z15;
                    }
                    if (i49 != 0) {
                        i95 = Integer.MAX_VALUE;
                    } else {
                        i95 = i15;
                    }
                    if (i56 != 0) {
                        i96 = 1;
                    } else {
                        i96 = i16;
                    }
                    if ((i19 & 2048) != 0) {
                        imeOptionsA = ImeOptions.INSTANCE.a();
                        i78 &= -113;
                    } else {
                        imeOptionsA = imeOptions;
                    }
                    if (i65 != 0) {
                        l3VarA = l3.INSTANCE.a();
                    } else {
                        l3VarA = l3Var;
                    }
                    if (i68 != 0) {
                        z28 = true;
                    } else {
                        z28 = z16;
                    }
                    if (i76 != 0) {
                        z29 = false;
                    } else {
                        z29 = z17;
                    }
                    if (i79 != 0) {
                        qVarB = g1.f130036a.b();
                    } else {
                        qVarB = qVar;
                    }
                    if (i86 != 0) {
                        a6Var3 = null;
                    } else {
                        a6Var3 = a6Var;
                    }
                    lVar7 = lVar4;
                    imeOptions3 = imeOptionsA;
                    z35 = z27;
                    textStyle2 = textStyleA;
                    mVar4 = mVar2;
                    z36 = z28;
                    z37 = z29;
                }
                rVarH.y();
                z38 = z35;
                if (p076m2.t.k()) {
                    p076m2.t.o(31062401, i25, i78, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
                }
                objE2 = rVarH.E();
                companion = r.INSTANCE;
                if (objE2 == companion.a()) {
                    objE2 = new d0();
                    rVarH.v(objE2);
                }
                d0Var = (d0) objE2;
                objE3 = rVarH.E();
                i97 = i25;
                if (objE3 == companion.a()) {
                    objE3 = l1.b();
                    rVarH.v(objE3);
                }
                k1Var = (k1) objE3;
                objE4 = rVarH.E();
                cVar2 = solidColor;
                if (objE4 == companion.a()) {
                    objE4 = new v0(k1Var);
                    rVarH.v(objE4);
                }
                v0Var = (v0) objE4;
                dVar = (c5.d) rVarH.N(g1.f());
                bVar = (u4.l.b) rVarH.N(g1.h());
                selectionBackgroundColor = ((SelectionColors) rVarH.N(g3.c())).getSelectionBackgroundColor();
                oVar = (o) rVarH.N(g1.g());
                n3Var = (n3) rVarH.N(g1.v());
                textStyle4 = textStyle2;
                r2Var = (r2) rVarH.N(g1.r());
                i98 = i96;
                if (i95 == 1) {
                    a2Var = p143z0.a2.Vertical;
                } else {
                    a2Var = p143z0.a2.Vertical;
                }
                if (a6Var3 == null) {
                    rVarH.X(-213744626);
                    Object[] objArr15 = {a2Var};
                    b3.x<a6, Object> xVarA15 = a6.INSTANCE.a();
                    zC = rVarH.c(a2Var.ordinal());
                    objE18 = rVarH.E();
                    if (zC) {
                        objE18 = new er.a() { // from class: n1.q1
                            @Override // er.a
                            public final Object a() {
                                return j2.O(a2Var);
                            }
                        };
                        rVarH.v(objE18);
                    } else {
                        objE18 = new er.a() { // from class: n1.q1
                            @Override // er.a
                            public final Object a() {
                                return j2.O(a2Var);
                            }
                        };
                        rVarH.v(objE18);
                    }
                    a6Var4 = (a6) b3.f.i(objArr15, xVarA15, (er.a) objE18, rVarH, 0);
                    rVarH.R();
                } else {
                    rVarH.X(-213745742);
                    rVarH.R();
                    a6Var4 = a6Var3;
                }
                if (a6Var4.j() != a2Var) {
                    StringBuilder sb19 = new StringBuilder();
                    sb19.append("Mismatching scroller orientation; ");
                    if (a2Var == p143z0.a2.Vertical) {
                        str = "only single-line, non-wrap text fields can scroll horizontally";
                    } else {
                        str = "single-line, non-wrap text fields can only scroll horizontally";
                    }
                    sb19.append(str);
                    throw new IllegalArgumentException(sb19.toString());
                }
                i99 = i97 & 14;
                if (i99 == 4) {
                    z39 = true;
                } else {
                    z39 = false;
                }
                if ((i97 & 57344) == 16384) {
                    z45 = true;
                } else {
                    z45 = false;
                }
                z46 = z39 | z45;
                objE5 = rVarH.E();
                if (z46) {
                    transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                    composition = textFieldValue.getComposition();
                    if (composition != null) {
                        a6Var5 = a6Var4;
                        transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                        if (transformedTextC2 != null) {
                            objE5 = transformedTextC2;
                        }
                        rVarH.v(objE5);
                    } else {
                        a6Var5 = a6Var4;
                    }
                    objE5 = transformedTextC;
                    rVarH.v(objE5);
                } else {
                    transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                    composition = textFieldValue.getComposition();
                    if (composition != null) {
                        a6Var5 = a6Var4;
                        transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                        if (transformedTextC2 != null) {
                            objE5 = transformedTextC2;
                        }
                        rVarH.v(objE5);
                    } else {
                        a6Var5 = a6Var4;
                    }
                    objE5 = transformedTextC;
                    rVarH.v(objE5);
                }
                TransformedText transformedText15 = (TransformedText) objE5;
                text = transformedText15.getText();
                offsetMapping = transformedText15.getOffsetMapping();
                d4VarC = p076m2.m.c(rVarH, 0);
                zW = rVarH.W(r2Var);
                objE6 = rVarH.E();
                if (zW) {
                    objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                    rVarH.v(objE6);
                } else {
                    objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                    rVarH.v(objE6);
                }
                s3Var = (s3) objE6;
                s3Var.X(textFieldValue.getText(), text, textStyle4, z38, r55, bVar, lVar, l3VarA, oVar, selectionBackgroundColor);
                s3Var.getProcessor().e(textFieldValue, s3Var.getInputSession());
                objE7 = rVarH.E();
                if (objE7 == companion.a()) {
                    objE7 = new i7(0, 1, null);
                    rVarH.v(objE7);
                }
                i7Var = (i7) objE7;
                i7.f(i7Var, textFieldValue, 0L, 2, null);
                objE8 = rVarH.E();
                if (objE8 == companion.a()) {
                    objE8 = Function0.i(tq.j.f191408a, rVarH);
                    rVarH.v(objE8);
                }
                p0Var = (p0) objE8;
                objE9 = rVarH.E();
                if (objE9 == companion.a()) {
                    objE9 = j1.e.a();
                    rVarH.v(objE9);
                }
                aVar = (j1.a) objE9;
                objE10 = rVarH.E();
                b1.l lVar112 = lVar5;
                if (objE10 == companion.a()) {
                    objE10 = new c2(i7Var);
                    rVarH.v(objE10);
                }
                c2Var = (c2) objE10;
                c2Var.L0(offsetMapping);
                c2Var.U0(e1VarC);
                c2Var.M0(s3Var.r());
                c2Var.Q0(s3Var);
                c2Var.T0(textFieldValue);
                c2Var.z0((androidx.compose.ui.platform.b1) rVarH.N(g1.d()));
                c2Var.A0(p0Var);
                c2Var.R0((v2) rVarH.N(g1.s()));
                c2Var.I0((v3.a) rVarH.N(g1.j()));
                c2Var.G0(d0Var);
                c2Var.E0(!z37);
                c2Var.F0(z36);
                if (g0.isSmartSelectionEnabled) {
                    rVarH.X(1966756105);
                    c2Var.N0(f0.h(z1.i0.EditableText, textStyle4.w(), rVarH, 6));
                    rVarH.R();
                } else {
                    rVarH.X(1966902177);
                    rVarH.R();
                }
                s3Var.h();
                new l() { // from class: n1.r1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j2.y(c2Var, (q4.e) obj);
                    }
                };
                new er.a() { // from class: n1.s1
                    @Override // er.a
                    public final Object a() {
                        return j2.z(c2Var);
                    }
                };
                new er.a() { // from class: n1.t1
                    @Override // er.a
                    public final Object a() {
                        return j2.A(c2Var);
                    }
                };
                companion2 = m.INSTANCE;
                boolean zG1111115 = rVarH.G(s3Var);
                i100 = i78 & 7168;
                i101 = i78;
                if (i100 == 2048) {
                    z47 = true;
                } else {
                    z47 = false;
                }
                boolean z7113 = z47 | zG1111115;
                if ((i101 & 57344) == 16384) {
                    z48 = true;
                } else {
                    z48 = false;
                }
                boolean zG1111116 = z7113 | z48 | rVarH.G(v0Var);
                if (i99 == 4) {
                    z49 = true;
                } else {
                    z49 = false;
                }
                boolean z81111111113 = zG1111116 | z49;
                i102 = (i101 & 112) ^ 48;
                if (i102 > 32) {
                    v0Var2 = v0Var;
                    if ((i101 & 48) != 32) {
                        z55 = true;
                    } else {
                        z55 = false;
                    }
                } else {
                    v0Var2 = v0Var;
                    if ((i101 & 48) != 32) {
                        z55 = true;
                    } else {
                        z55 = false;
                    }
                }
                zG = z81111111113 | z55 | rVarH.G(offsetMapping) | rVarH.G(p0Var) | rVarH.G(aVar) | rVarH.G(c2Var);
                objE11 = rVarH.E();
                if (zG) {
                    final ImeOptions imeOptions1111118 = imeOptions3;
                    i0Var = offsetMapping;
                    final boolean z81111111114 = z36;
                    final boolean z81111111115 = z37;
                    objE11 = new l() { // from class: n1.u1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.B(s3Var, z81111111114, z81111111115, v0Var2, textFieldValue, imeOptions1111118, i0Var, c2Var, p0Var, aVar, (l0) obj);
                        }
                    };
                    z56 = z81111111114;
                    textFieldValue2 = textFieldValue;
                    imeOptions4 = imeOptions1111118;
                    c2Var2 = c2Var;
                    p0Var2 = p0Var;
                    aVar2 = aVar;
                    rVarH.v(objE11);
                } else {
                    final ImeOptions imeOptions1111119 = imeOptions3;
                    i0Var = offsetMapping;
                    final boolean z81111111116 = z36;
                    final boolean z81111111117 = z37;
                    objE11 = new l() { // from class: n1.u1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.B(s3Var, z81111111116, z81111111117, v0Var2, textFieldValue, imeOptions1111119, i0Var, c2Var, p0Var, aVar, (l0) obj);
                        }
                    };
                    z56 = z81111111116;
                    textFieldValue2 = textFieldValue;
                    imeOptions4 = imeOptions1111119;
                    c2Var2 = c2Var;
                    p0Var2 = p0Var;
                    aVar2 = aVar;
                    rVarH.v(objE11);
                }
                final j1.a aVar18 = aVar2;
                m mVarA11111118 = v4.a(companion2, z56, d0Var, lVar112, (l) objE11);
                if (z56) {
                    z57 = false;
                } else {
                    z57 = false;
                }
                Boolean boolValueOf16 = Boolean.valueOf(z57);
                z58 = z56;
                f6VarP = x5.p(boolValueOf16, rVarH, 0);
                i0 i0Var18 = i0.f148189a;
                boolean zW1113 = rVarH.W(f6VarP) | rVarH.G(s3Var) | rVarH.G(v0Var2) | rVarH.G(c2Var2);
                if (i102 > 32) {
                    imeOptions5 = imeOptions4;
                    if ((i101 & 48) != 32) {
                        z59 = true;
                    } else {
                        z59 = false;
                    }
                } else {
                    imeOptions5 = imeOptions4;
                    if ((i101 & 48) != 32) {
                        z59 = true;
                    } else {
                        z59 = false;
                    }
                }
                z65 = zW1113 | z59;
                objE12 = rVarH.E();
                if (z65) {
                    ImeOptions imeOptions11111110 = imeOptions5;
                    objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions11111110, null);
                    imeOptions6 = imeOptions11111110;
                    rVarH.v(objE12);
                } else {
                    ImeOptions imeOptions11111111 = imeOptions5;
                    objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions11111111, null);
                    imeOptions6 = imeOptions11111111;
                    rVarH.v(objE12);
                }
                imeOptions7 = imeOptions6;
                Function0.d(i0Var18, (p) objE12, rVarH, 6);
                int i10111 = i101 >> 3;
                c2Var3 = c2Var2;
                m mVarA11111119 = k5.a(companion2, c2Var3, z58, lVar112, s3Var, d0Var, z37, i0Var, rVarH, (i10111 & 896) | 196614 | ((i97 >> 9) & 7168) | ((i101 << 6) & 3670016));
                i0Var2 = i0Var;
                final m mVarB11119 = m2.b(companion2, s3Var, textFieldValue2, i0Var2);
                boolean zG1111117 = rVarH.G(s3Var);
                if (i100 == 2048) {
                    z66 = true;
                } else {
                    z66 = false;
                }
                boolean zW1114 = zG1111117 | z66 | rVarH.W(n3Var) | rVarH.G(c2Var3);
                if (i99 == 4) {
                    z67 = true;
                } else {
                    z67 = false;
                }
                zG2 = zW1114 | z67 | rVarH.G(i0Var2);
                objE13 = rVarH.E();
                if (zG2) {
                    final TextFieldValue textFieldValue1114 = textFieldValue2;
                    objE13 = new l() { // from class: n1.v1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue1114, i0Var2, (b0) obj);
                        }
                    };
                    rVarH.v(objE13);
                } else {
                    final TextFieldValue textFieldValue1115 = textFieldValue2;
                    objE13 = new l() { // from class: n1.v1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue1115, i0Var2, (b0) obj);
                        }
                    };
                    rVarH.v(objE13);
                }
                final m mVarA111111110 = p036e4.l1.a(companion2, (l) objE13);
                CoreTextFieldSemanticsModifier hVar17 = new CoreTextFieldSemanticsModifier(transformedText15, textFieldValue, s3Var, z37, z58, e1VarC instanceof v4.k0, i0Var2, c2Var3, imeOptions7, d0Var);
                if (z58) {
                    z68 = false;
                } else {
                    z68 = false;
                }
                final m mVarA111111111 = m2.a(companion2, s3Var, textFieldValue, i0Var2, cVar2, z68);
                zG3 = rVarH.G(c2Var3);
                final e1 e1Var19 = e1VarC;
                objE14 = rVarH.E();
                if (zG3) {
                    objE14 = new l() { // from class: n1.w1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.E(c2Var3, (s0) obj);
                        }
                    };
                    rVarH.v(objE14);
                } else {
                    objE14 = new l() { // from class: n1.w1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.E(c2Var3, (s0) obj);
                        }
                    };
                    rVarH.v(objE14);
                }
                Function0.a(c2Var3, (l) objE14, rVarH, 0);
                boolean zG1111118 = rVarH.G(s3Var) | rVarH.G(v0Var2);
                if (i99 == 4) {
                    z69 = true;
                } else {
                    z69 = false;
                }
                z75 = z69 | zG1111118 | ((i102 <= 32 && rVarH.W(imeOptions7)) || (i101 & 48) == 32);
                objE15 = rVarH.E();
                if (z75) {
                    objE15 = new l() { // from class: n1.y1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                        }
                    };
                    rVarH.v(objE15);
                } else {
                    objE15 = new l() { // from class: n1.y1
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                        }
                    };
                    rVarH.v(objE15);
                }
                Function0.a(imeOptions7, (l) objE15, rVarH, i10111 & 14);
                l<TextFieldValue, i0> lVarR17 = s3Var.r();
                boolean z81111111118 = !z37;
                i103 = i95;
                if (i103 == 1) {
                    z76 = true;
                } else {
                    z76 = false;
                }
                m mVarB111110 = i5.b(companion2, s3Var, c2Var3, textFieldValue, lVarR17, z81111111118, z76, i0Var2, i7Var, imeOptions7.getImeAction());
                keyboardType = imeOptions7.getKeyboardType();
                companion3 = a0.INSTANCE;
                if (a0.n(keyboardType, companion3.f())) {
                    z77 = false;
                } else {
                    z77 = false;
                }
                boolean zC18 = C(f6VarP);
                zA = rVarH.a(z77) | rVarH.G(k1Var);
                objE16 = rVarH.E();
                if (zA) {
                    objE16 = new er.a() { // from class: n1.z1
                        @Override // er.a
                        public final Object a() {
                            return j2.G(z77, k1Var);
                        }
                    };
                    rVarH.v(objE16);
                } else {
                    objE16 = new er.a() { // from class: n1.z1
                        @Override // er.a
                        public final Object a() {
                            return j2.G(z77, k1Var);
                        }
                    };
                    rVarH.v(objE16);
                }
                m mVarB111111 = v1.b.b(companion2, zC18, z77, (er.a) objE16);
                cVarE = l.e((androidx.compose.ui.graphics.c) rVarH.N(l.c()), ((Color) rVarH.N(l.d())).m20unboximpl(), m.a());
                zG4 = rVarH.G(s3Var) | rVarH.W(cVarE);
                objE17 = rVarH.E();
                if (zG4) {
                    objE17 = new l() { // from class: n1.h2
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.H(s3Var, cVarE, (c) obj);
                        }
                    };
                    rVarH.v(objE17);
                } else {
                    objE17 = new l() { // from class: n1.h2
                        @Override // er.l
                        public final Object b(Object obj) {
                            return j2.H(s3Var, cVarE, (c) obj);
                        }
                    };
                    rVarH.v(objE17);
                }
                m mVarD17 = k3.k.d(companion2, (l) objE17);
                m mVar1117 = mVar4;
                final a6 a6Var112 = a6Var5;
                m mVarA111111112 = a0(p036e4.l1.a(u5.f(g0(u4.b(h1.a(mVar1117.u(mVarD17), k1Var, s3Var, c2Var3).u(mVarB111111).u(mVarA11111118), s3Var, oVar), s3Var, c2Var3).u(mVarB111110), a6Var112, lVar112, z58, x5.a(rVarH, 0)).u(mVarA11111119).u(hVar17), new l() { // from class: n1.n1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j2.I(s3Var, (b0) obj);
                    }
                }), c2Var3, p0Var2);
                if (!z58) {
                    z78 = false;
                } else {
                    z78 = false;
                }
                if (z78) {
                    mVarZ = c3.z(companion2, c2Var3);
                } else {
                    mVarZ = companion2;
                }
                final m mVar1118 = mVarZ;
                final q qVar19 = qVarB;
                P(mVarA111111112, c2Var3, y2.m.d(-814563849, true, new p() { // from class: n1.o1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j2.J(qVar19, s3Var, textStyle4, z38, i98, i103, a6Var112, textFieldValue, e1Var19, mVarA111111111, mVarB11119, mVarA111111110, mVar1118, aVar18, c2Var3, z78, z37, lVar7, i0Var2, dVar, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                qVar2 = qVar19;
                i89 = i98;
                rVar2 = rVarH;
                e1Var2 = e1Var19;
                z26 = z37;
                lVar6 = lVar7;
                z25 = z58;
                a6Var2 = a6Var3;
                solidColor = cVar2;
                lVar5 = lVar112;
                l3Var2 = l3VarA;
                mVar3 = mVar1117;
                i88 = i103;
                imeOptions2 = imeOptions7;
                z19 = z38;
                textStyle3 = textStyle4;
            } else {
                rVarH.O();
                z19 = z15;
                imeOptions2 = imeOptions;
                l3Var2 = l3Var;
                qVar2 = qVar;
                a6Var2 = a6Var;
                rVar2 = rVarH;
                textStyle3 = textStyle2;
                lVar6 = lVar4;
                e1Var2 = e1VarC;
                mVar3 = mVar2;
                i88 = i15;
                i89 = i16;
                z25 = z16;
                z26 = z17;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: n1.p1
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return j2.N(textFieldValue, lVar, mVar3, textStyle3, e1Var2, lVar6, lVar5, solidColor, z19, i88, i89, imeOptions2, l3Var2, z25, z26, qVar2, a6Var2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i25 |= 805306368;
        i56 = i19 & 1024;
        if (i56 != 0) {
            i57 = i18 | 6;
        } else if ((i18 & 6) == 0) {
            if (rVarH.c(i16)) {
                i58 = 4;
            } else {
                i58 = 2;
            }
            i57 = i18 | i58;
        } else {
            i57 = i18;
        }
        if ((i18 & 48) != 0) {
            i57 |= ((i19 & 2048) == 0 || !rVarH.W(imeOptions)) ? 16 : 32;
        }
        i59 = i57;
        i65 = i19 & PKIFailureInfo.certConfirmed;
        if (i65 != 0) {
            i66 = i59 | MLKEMEngine.KyberPolyBytes;
        } else if ((i18 & MLKEMEngine.KyberPolyBytes) == 0) {
            if (rVarH.W(l3Var)) {
                i67 = 256;
            } else {
                i67 = 128;
            }
            i66 = i59 | i67;
        } else {
            i66 = i59;
        }
        i68 = i19 & PKIFailureInfo.certRevoked;
        if (i68 != 0) {
            i75 = i66 | 3072;
        } else {
            i69 = i66;
            if ((i18 & 3072) == 0) {
                i75 = i69 | (rVarH.a(z16) ? 2048 : 1024);
            } else {
                i75 = i69;
            }
        }
        i76 = i19 & 16384;
        if (i76 != 0) {
            i78 = i75 | 24576;
        } else {
            i77 = i75;
            if ((i18 & 24576) == 0) {
                if (rVarH.a(z17)) {
                    i29 = 16384;
                }
                i78 = i77 | i29;
            } else {
                i78 = i77;
            }
        }
        i79 = i19 & 32768;
        if (i79 != 0) {
            i78 |= 196608;
        } else if ((i18 & 196608) == 0) {
            if (rVarH.G(qVar)) {
                i85 = PKIFailureInfo.unsupportedVersion;
            } else {
                i85 = 65536;
            }
            i78 |= i85;
        }
        i86 = i19 & PKIFailureInfo.notAuthorized;
        if (i86 != 0) {
            i78 |= 1572864;
        } else if ((i18 & 1572864) == 0) {
            if (rVarH.W(a6Var)) {
                i87 = PKIFailureInfo.badCertTemplate;
            } else {
                i87 = PKIFailureInfo.signerNotTrusted;
            }
            i78 |= i87;
        }
        if ((i25 & 306783379) == 306783378) {
            z18 = true;
        } else {
            z18 = true;
        }
        if (rVarH.r(z18, i25 & 1)) {
            rVarH.I();
            if ((i17 & 1) != 0) {
                if (i104 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i26 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i28 != 0) {
                    e1VarC = e1.INSTANCE.c();
                }
                if (i36 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new l() { // from class: n1.g2
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.x((TextLayoutResult) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    lVar4 = (l) objE;
                }
                if (i38 != 0) {
                    lVar5 = null;
                }
                if (i45 != 0) {
                    solidColor = new SolidColor(Color.INSTANCE.h(), null);
                }
                if (i47 != 0) {
                    z27 = true;
                } else {
                    z27 = z15;
                }
                if (i49 != 0) {
                    i95 = Integer.MAX_VALUE;
                } else {
                    i95 = i15;
                }
                if (i56 != 0) {
                    i96 = 1;
                } else {
                    i96 = i16;
                }
                if ((i19 & 2048) != 0) {
                    imeOptionsA = ImeOptions.INSTANCE.a();
                    i78 &= -113;
                } else {
                    imeOptionsA = imeOptions;
                }
                if (i65 != 0) {
                    l3VarA = l3.INSTANCE.a();
                } else {
                    l3VarA = l3Var;
                }
                if (i68 != 0) {
                    z28 = true;
                } else {
                    z28 = z16;
                }
                if (i76 != 0) {
                    z29 = false;
                } else {
                    z29 = z17;
                }
                if (i79 != 0) {
                    qVarB = g1.f130036a.b();
                } else {
                    qVarB = qVar;
                }
                if (i86 != 0) {
                    a6Var3 = null;
                } else {
                    a6Var3 = a6Var;
                }
                lVar7 = lVar4;
                imeOptions3 = imeOptionsA;
                z35 = z27;
                textStyle2 = textStyleA;
                mVar4 = mVar2;
                z36 = z28;
                z37 = z29;
            } else {
                if (i104 != 0) {
                    mVar2 = m.INSTANCE;
                }
                if (i26 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i28 != 0) {
                    e1VarC = e1.INSTANCE.c();
                }
                if (i36 != 0) {
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new l() { // from class: n1.g2
                            @Override // er.l
                            public final Object b(Object obj) {
                                return j2.x((TextLayoutResult) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    lVar4 = (l) objE;
                }
                if (i38 != 0) {
                    lVar5 = null;
                }
                if (i45 != 0) {
                    solidColor = new SolidColor(Color.INSTANCE.h(), null);
                }
                if (i47 != 0) {
                    z27 = true;
                } else {
                    z27 = z15;
                }
                if (i49 != 0) {
                    i95 = Integer.MAX_VALUE;
                } else {
                    i95 = i15;
                }
                if (i56 != 0) {
                    i96 = 1;
                } else {
                    i96 = i16;
                }
                if ((i19 & 2048) != 0) {
                    imeOptionsA = ImeOptions.INSTANCE.a();
                    i78 &= -113;
                } else {
                    imeOptionsA = imeOptions;
                }
                if (i65 != 0) {
                    l3VarA = l3.INSTANCE.a();
                } else {
                    l3VarA = l3Var;
                }
                if (i68 != 0) {
                    z28 = true;
                } else {
                    z28 = z16;
                }
                if (i76 != 0) {
                    z29 = false;
                } else {
                    z29 = z17;
                }
                if (i79 != 0) {
                    qVarB = g1.f130036a.b();
                } else {
                    qVarB = qVar;
                }
                if (i86 != 0) {
                    a6Var3 = null;
                } else {
                    a6Var3 = a6Var;
                }
                lVar7 = lVar4;
                imeOptions3 = imeOptionsA;
                z35 = z27;
                textStyle2 = textStyleA;
                mVar4 = mVar2;
                z36 = z28;
                z37 = z29;
            }
            rVarH.y();
            z38 = z35;
            if (p076m2.t.k()) {
                p076m2.t.o(31062401, i25, i78, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:208)");
            }
            objE2 = rVarH.E();
            companion = r.INSTANCE;
            if (objE2 == companion.a()) {
                objE2 = new d0();
                rVarH.v(objE2);
            }
            d0Var = (d0) objE2;
            objE3 = rVarH.E();
            i97 = i25;
            if (objE3 == companion.a()) {
                objE3 = l1.b();
                rVarH.v(objE3);
            }
            k1Var = (k1) objE3;
            objE4 = rVarH.E();
            cVar2 = solidColor;
            if (objE4 == companion.a()) {
                objE4 = new v0(k1Var);
                rVarH.v(objE4);
            }
            v0Var = (v0) objE4;
            dVar = (c5.d) rVarH.N(g1.f());
            bVar = (u4.l.b) rVarH.N(g1.h());
            selectionBackgroundColor = ((SelectionColors) rVarH.N(g3.c())).getSelectionBackgroundColor();
            oVar = (o) rVarH.N(g1.g());
            n3Var = (n3) rVarH.N(g1.v());
            textStyle4 = textStyle2;
            r2Var = (r2) rVarH.N(g1.r());
            i98 = i96;
            if (i95 == 1) {
                a2Var = p143z0.a2.Vertical;
            } else {
                a2Var = p143z0.a2.Vertical;
            }
            if (a6Var3 == null) {
                rVarH.X(-213744626);
                Object[] objArr16 = {a2Var};
                b3.x<a6, Object> xVarA16 = a6.INSTANCE.a();
                zC = rVarH.c(a2Var.ordinal());
                objE18 = rVarH.E();
                if (zC) {
                    objE18 = new er.a() { // from class: n1.q1
                        @Override // er.a
                        public final Object a() {
                            return j2.O(a2Var);
                        }
                    };
                    rVarH.v(objE18);
                } else {
                    objE18 = new er.a() { // from class: n1.q1
                        @Override // er.a
                        public final Object a() {
                            return j2.O(a2Var);
                        }
                    };
                    rVarH.v(objE18);
                }
                a6Var4 = (a6) b3.f.i(objArr16, xVarA16, (er.a) objE18, rVarH, 0);
                rVarH.R();
            } else {
                rVarH.X(-213745742);
                rVarH.R();
                a6Var4 = a6Var3;
            }
            if (a6Var4.j() != a2Var) {
                StringBuilder sb110 = new StringBuilder();
                sb110.append("Mismatching scroller orientation; ");
                if (a2Var == p143z0.a2.Vertical) {
                    str = "only single-line, non-wrap text fields can scroll horizontally";
                } else {
                    str = "single-line, non-wrap text fields can only scroll horizontally";
                }
                sb110.append(str);
                throw new IllegalArgumentException(sb110.toString());
            }
            i99 = i97 & 14;
            if (i99 == 4) {
                z39 = true;
            } else {
                z39 = false;
            }
            if ((i97 & 57344) == 16384) {
                z45 = true;
            } else {
                z45 = false;
            }
            z46 = z39 | z45;
            objE5 = rVarH.E();
            if (z46) {
                transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                composition = textFieldValue.getComposition();
                if (composition != null) {
                    a6Var5 = a6Var4;
                    transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                    if (transformedTextC2 != null) {
                        objE5 = transformedTextC2;
                    }
                    rVarH.v(objE5);
                } else {
                    a6Var5 = a6Var4;
                }
                objE5 = transformedTextC;
                rVarH.v(objE5);
            } else {
                transformedTextC = m7.c(e1VarC, textFieldValue.getText());
                composition = textFieldValue.getComposition();
                if (composition != null) {
                    a6Var5 = a6Var4;
                    transformedTextC2 = s4.INSTANCE.c(composition.getPackedValue(), transformedTextC);
                    if (transformedTextC2 != null) {
                        objE5 = transformedTextC2;
                    }
                    rVarH.v(objE5);
                } else {
                    a6Var5 = a6Var4;
                }
                objE5 = transformedTextC;
                rVarH.v(objE5);
            }
            TransformedText transformedText16 = (TransformedText) objE5;
            text = transformedText16.getText();
            offsetMapping = transformedText16.getOffsetMapping();
            d4VarC = p076m2.m.c(rVarH, 0);
            zW = rVarH.W(r2Var);
            objE6 = rVarH.E();
            if (zW) {
                objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                rVarH.v(objE6);
            } else {
                objE6 = new s3(new j4(text, textStyle4, 0, 0, z38, 0, dVar, bVar, null, 300, null), d4VarC, r2Var);
                rVarH.v(objE6);
            }
            s3Var = (s3) objE6;
            s3Var.X(textFieldValue.getText(), text, textStyle4, z38, r55, bVar, lVar, l3VarA, oVar, selectionBackgroundColor);
            s3Var.getProcessor().e(textFieldValue, s3Var.getInputSession());
            objE7 = rVarH.E();
            if (objE7 == companion.a()) {
                objE7 = new i7(0, 1, null);
                rVarH.v(objE7);
            }
            i7Var = (i7) objE7;
            i7.f(i7Var, textFieldValue, 0L, 2, null);
            objE8 = rVarH.E();
            if (objE8 == companion.a()) {
                objE8 = Function0.i(tq.j.f191408a, rVarH);
                rVarH.v(objE8);
            }
            p0Var = (p0) objE8;
            objE9 = rVarH.E();
            if (objE9 == companion.a()) {
                objE9 = j1.e.a();
                rVarH.v(objE9);
            }
            aVar = (j1.a) objE9;
            objE10 = rVarH.E();
            b1.l lVar113 = lVar5;
            if (objE10 == companion.a()) {
                objE10 = new c2(i7Var);
                rVarH.v(objE10);
            }
            c2Var = (c2) objE10;
            c2Var.L0(offsetMapping);
            c2Var.U0(e1VarC);
            c2Var.M0(s3Var.r());
            c2Var.Q0(s3Var);
            c2Var.T0(textFieldValue);
            c2Var.z0((androidx.compose.ui.platform.b1) rVarH.N(g1.d()));
            c2Var.A0(p0Var);
            c2Var.R0((v2) rVarH.N(g1.s()));
            c2Var.I0((v3.a) rVarH.N(g1.j()));
            c2Var.G0(d0Var);
            c2Var.E0(!z37);
            c2Var.F0(z36);
            if (g0.isSmartSelectionEnabled) {
                rVarH.X(1966756105);
                c2Var.N0(f0.h(z1.i0.EditableText, textStyle4.w(), rVarH, 6));
                rVarH.R();
            } else {
                rVarH.X(1966902177);
                rVarH.R();
            }
            s3Var.h();
            new l() { // from class: n1.r1
                @Override // er.l
                public final Object b(Object obj) {
                    return j2.y(c2Var, (q4.e) obj);
                }
            };
            new er.a() { // from class: n1.s1
                @Override // er.a
                public final Object a() {
                    return j2.z(c2Var);
                }
            };
            new er.a() { // from class: n1.t1
                @Override // er.a
                public final Object a() {
                    return j2.A(c2Var);
                }
            };
            companion2 = m.INSTANCE;
            boolean zG1111119 = rVarH.G(s3Var);
            i100 = i78 & 7168;
            i101 = i78;
            if (i100 == 2048) {
                z47 = true;
            } else {
                z47 = false;
            }
            boolean z7114 = z47 | zG1111119;
            if ((i101 & 57344) == 16384) {
                z48 = true;
            } else {
                z48 = false;
            }
            boolean zG11111110 = z7114 | z48 | rVarH.G(v0Var);
            if (i99 == 4) {
                z49 = true;
            } else {
                z49 = false;
            }
            boolean z81111111119 = zG11111110 | z49;
            i102 = (i101 & 112) ^ 48;
            if (i102 > 32) {
                v0Var2 = v0Var;
                if ((i101 & 48) != 32) {
                    z55 = true;
                } else {
                    z55 = false;
                }
            } else {
                v0Var2 = v0Var;
                if ((i101 & 48) != 32) {
                    z55 = true;
                } else {
                    z55 = false;
                }
            }
            zG = z81111111119 | z55 | rVarH.G(offsetMapping) | rVarH.G(p0Var) | rVarH.G(aVar) | rVarH.G(c2Var);
            objE11 = rVarH.E();
            if (zG) {
                final ImeOptions imeOptions11111112 = imeOptions3;
                i0Var = offsetMapping;
                final boolean z811111111110 = z36;
                final boolean z811111111111 = z37;
                objE11 = new l() { // from class: n1.u1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j2.B(s3Var, z811111111110, z811111111111, v0Var2, textFieldValue, imeOptions11111112, i0Var, c2Var, p0Var, aVar, (l0) obj);
                    }
                };
                z56 = z811111111110;
                textFieldValue2 = textFieldValue;
                imeOptions4 = imeOptions11111112;
                c2Var2 = c2Var;
                p0Var2 = p0Var;
                aVar2 = aVar;
                rVarH.v(objE11);
            } else {
                final ImeOptions imeOptions11111113 = imeOptions3;
                i0Var = offsetMapping;
                final boolean z811111111112 = z36;
                final boolean z811111111113 = z37;
                objE11 = new l() { // from class: n1.u1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j2.B(s3Var, z811111111112, z811111111113, v0Var2, textFieldValue, imeOptions11111113, i0Var, c2Var, p0Var, aVar, (l0) obj);
                    }
                };
                z56 = z811111111112;
                textFieldValue2 = textFieldValue;
                imeOptions4 = imeOptions11111113;
                c2Var2 = c2Var;
                p0Var2 = p0Var;
                aVar2 = aVar;
                rVarH.v(objE11);
            }
            final j1.a aVar19 = aVar2;
            m mVarA111111113 = v4.a(companion2, z56, d0Var, lVar113, (l) objE11);
            if (z56) {
                z57 = false;
            } else {
                z57 = false;
            }
            Boolean boolValueOf17 = Boolean.valueOf(z57);
            z58 = z56;
            f6VarP = x5.p(boolValueOf17, rVarH, 0);
            i0 i0Var19 = i0.f148189a;
            boolean zW1115 = rVarH.W(f6VarP) | rVarH.G(s3Var) | rVarH.G(v0Var2) | rVarH.G(c2Var2);
            if (i102 > 32) {
                imeOptions5 = imeOptions4;
                if ((i101 & 48) != 32) {
                    z59 = true;
                } else {
                    z59 = false;
                }
            } else {
                imeOptions5 = imeOptions4;
                if ((i101 & 48) != 32) {
                    z59 = true;
                } else {
                    z59 = false;
                }
            }
            z65 = zW1115 | z59;
            objE12 = rVarH.E();
            if (z65) {
                ImeOptions imeOptions11111114 = imeOptions5;
                objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions11111114, null);
                imeOptions6 = imeOptions11111114;
                rVarH.v(objE12);
            } else {
                ImeOptions imeOptions11111115 = imeOptions5;
                objE12 = new a(s3Var, f6VarP, v0Var2, c2Var2, imeOptions11111115, null);
                imeOptions6 = imeOptions11111115;
                rVarH.v(objE12);
            }
            imeOptions7 = imeOptions6;
            Function0.d(i0Var19, (p) objE12, rVarH, 6);
            int i10112 = i101 >> 3;
            c2Var3 = c2Var2;
            m mVarA111111114 = k5.a(companion2, c2Var3, z58, lVar113, s3Var, d0Var, z37, i0Var, rVarH, (i10112 & 896) | 196614 | ((i97 >> 9) & 7168) | ((i101 << 6) & 3670016));
            i0Var2 = i0Var;
            final m mVarB111112 = m2.b(companion2, s3Var, textFieldValue2, i0Var2);
            boolean zG11111111 = rVarH.G(s3Var);
            if (i100 == 2048) {
                z66 = true;
            } else {
                z66 = false;
            }
            boolean zW1116 = zG11111111 | z66 | rVarH.W(n3Var) | rVarH.G(c2Var3);
            if (i99 == 4) {
                z67 = true;
            } else {
                z67 = false;
            }
            zG2 = zW1116 | z67 | rVarH.G(i0Var2);
            objE13 = rVarH.E();
            if (zG2) {
                final TextFieldValue textFieldValue1116 = textFieldValue2;
                objE13 = new l() { // from class: n1.v1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue1116, i0Var2, (b0) obj);
                    }
                };
                rVarH.v(objE13);
            } else {
                final TextFieldValue textFieldValue1117 = textFieldValue2;
                objE13 = new l() { // from class: n1.v1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j2.D(s3Var, z58, n3Var, c2Var3, textFieldValue1117, i0Var2, (b0) obj);
                    }
                };
                rVarH.v(objE13);
            }
            final m mVarA111111115 = p036e4.l1.a(companion2, (l) objE13);
            CoreTextFieldSemanticsModifier hVar18 = new CoreTextFieldSemanticsModifier(transformedText16, textFieldValue, s3Var, z37, z58, e1VarC instanceof v4.k0, i0Var2, c2Var3, imeOptions7, d0Var);
            if (z58) {
                z68 = false;
            } else {
                z68 = false;
            }
            final m mVarA111111116 = m2.a(companion2, s3Var, textFieldValue, i0Var2, cVar2, z68);
            zG3 = rVarH.G(c2Var3);
            final e1 e1Var110 = e1VarC;
            objE14 = rVarH.E();
            if (zG3) {
                objE14 = new l() { // from class: n1.w1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j2.E(c2Var3, (s0) obj);
                    }
                };
                rVarH.v(objE14);
            } else {
                objE14 = new l() { // from class: n1.w1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j2.E(c2Var3, (s0) obj);
                    }
                };
                rVarH.v(objE14);
            }
            Function0.a(c2Var3, (l) objE14, rVarH, 0);
            boolean zG11111112 = rVarH.G(s3Var) | rVarH.G(v0Var2);
            if (i99 == 4) {
                z69 = true;
            } else {
                z69 = false;
            }
            z75 = z69 | zG11111112 | ((i102 <= 32 && rVarH.W(imeOptions7)) || (i101 & 48) == 32);
            objE15 = rVarH.E();
            if (z75) {
                objE15 = new l() { // from class: n1.y1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                    }
                };
                rVarH.v(objE15);
            } else {
                objE15 = new l() { // from class: n1.y1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j2.F(s3Var, v0Var2, textFieldValue, imeOptions7, (s0) obj);
                    }
                };
                rVarH.v(objE15);
            }
            Function0.a(imeOptions7, (l) objE15, rVarH, i10112 & 14);
            l<TextFieldValue, i0> lVarR18 = s3Var.r();
            boolean z811111111114 = !z37;
            i103 = i95;
            if (i103 == 1) {
                z76 = true;
            } else {
                z76 = false;
            }
            m mVarB111113 = i5.b(companion2, s3Var, c2Var3, textFieldValue, lVarR18, z811111111114, z76, i0Var2, i7Var, imeOptions7.getImeAction());
            keyboardType = imeOptions7.getKeyboardType();
            companion3 = a0.INSTANCE;
            if (a0.n(keyboardType, companion3.f())) {
                z77 = false;
            } else {
                z77 = false;
            }
            boolean zC19 = C(f6VarP);
            zA = rVarH.a(z77) | rVarH.G(k1Var);
            objE16 = rVarH.E();
            if (zA) {
                objE16 = new er.a() { // from class: n1.z1
                    @Override // er.a
                    public final Object a() {
                        return j2.G(z77, k1Var);
                    }
                };
                rVarH.v(objE16);
            } else {
                objE16 = new er.a() { // from class: n1.z1
                    @Override // er.a
                    public final Object a() {
                        return j2.G(z77, k1Var);
                    }
                };
                rVarH.v(objE16);
            }
            m mVarB111114 = v1.b.b(companion2, zC19, z77, (er.a) objE16);
            cVarE = l.e((androidx.compose.ui.graphics.c) rVarH.N(l.c()), ((Color) rVarH.N(l.d())).m20unboximpl(), m.a());
            zG4 = rVarH.G(s3Var) | rVarH.W(cVarE);
            objE17 = rVarH.E();
            if (zG4) {
                objE17 = new l() { // from class: n1.h2
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j2.H(s3Var, cVarE, (c) obj);
                    }
                };
                rVarH.v(objE17);
            } else {
                objE17 = new l() { // from class: n1.h2
                    @Override // er.l
                    public final Object b(Object obj) {
                        return j2.H(s3Var, cVarE, (c) obj);
                    }
                };
                rVarH.v(objE17);
            }
            m mVarD18 = k3.k.d(companion2, (l) objE17);
            m mVar1119 = mVar4;
            final a6 a6Var113 = a6Var5;
            m mVarA111111117 = a0(p036e4.l1.a(u5.f(g0(u4.b(h1.a(mVar1119.u(mVarD18), k1Var, s3Var, c2Var3).u(mVarB111114).u(mVarA111111113), s3Var, oVar), s3Var, c2Var3).u(mVarB111113), a6Var113, lVar113, z58, x5.a(rVarH, 0)).u(mVarA111111114).u(hVar18), new l() { // from class: n1.n1
                @Override // er.l
                public final Object b(Object obj) {
                    return j2.I(s3Var, (b0) obj);
                }
            }), c2Var3, p0Var2);
            if (!z58) {
                z78 = false;
            } else {
                z78 = false;
            }
            if (z78) {
                mVarZ = c3.z(companion2, c2Var3);
            } else {
                mVarZ = companion2;
            }
            final m mVar11110 = mVarZ;
            final q qVar110 = qVarB;
            P(mVarA111111117, c2Var3, y2.m.d(-814563849, true, new p() { // from class: n1.o1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j2.J(qVar110, s3Var, textStyle4, z38, i98, i103, a6Var113, textFieldValue, e1Var110, mVarA111111116, mVarB111112, mVarA111111115, mVar11110, aVar19, c2Var3, z78, z37, lVar7, i0Var2, dVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            qVar2 = qVar110;
            i89 = i98;
            rVar2 = rVarH;
            e1Var2 = e1Var110;
            z26 = z37;
            lVar6 = lVar7;
            z25 = z58;
            a6Var2 = a6Var3;
            solidColor = cVar2;
            lVar5 = lVar113;
            l3Var2 = l3VarA;
            mVar3 = mVar1119;
            i88 = i103;
            imeOptions2 = imeOptions7;
            z19 = z38;
            textStyle3 = textStyle4;
        } else {
            rVarH.O();
            z19 = z15;
            imeOptions2 = imeOptions;
            l3Var2 = l3Var;
            qVar2 = qVar;
            a6Var2 = a6Var;
            rVar2 = rVarH;
            textStyle3 = textStyle2;
            lVar6 = lVar4;
            e1Var2 = e1VarC;
            mVar3 = mVar2;
            i88 = i15;
            i89 = i16;
            z25 = z16;
            z26 = z17;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: n1.p1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j2.N(textFieldValue, lVar, mVar3, textStyle3, e1Var2, lVar6, lVar5, solidColor, z19, i88, i89, imeOptions2, l3Var2, z25, z26, qVar2, a6Var2, i17, i18, i19, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(TextLayoutResult textLayoutResult) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(c2 c2Var, q4.e eVar) {
        c2Var.x0(eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q4.e z(c2 c2Var) {
        return c2.F(c2Var, false, 1, null);
    }
}
