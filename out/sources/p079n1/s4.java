package p079n1;

import androidx.compose.ui.graphics.Color;
import b5.TextGeometricTransform;
import b5.a;
import c5.r;
import c5.t;
import er.l;
import fr.k;
import fr.p0;
import java.util.List;
import n3.Shadow;
import n3.g2;
import n3.h1;
import n3.k2;
import oq.i0;
import oq.x;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.b0;
import p036e4.c0;
import p071kotlin.Metadata;
import p3.g;
import q4.SpanStyle;
import q4.TextLayoutResult;
import q4.a4;
import q4.e;
import q4.j0;
import q4.x3;
import q4.z3;
import u4.FontWeight;
import u4.y;
import u4.z;
import v4.ImeOptions;
import v4.TextFieldValue;
import v4.TransformedText;
import v4.b1;
import v4.j;
import v4.m;
import v4.v0;
import x4.LocaleList;
import z1.n1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ln1/s4;", "", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n1.s4$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\n0\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0004\b\u001a\u0010\u001bJO\u0010#\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010 \u001a\u00020\f2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b#\u0010$JG\u0010+\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b+\u0010,J/\u0010/\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\u0006\u0010-\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020.H\u0001¢\u0006\u0004\b/\u00100JC\u00109\u001a\u00020\u000e2\f\u00103\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00105\u001a\u0002042\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e062\b\u00108\u001a\u0004\u0018\u00010'H\u0001¢\u0006\u0004\b9\u0010:JC\u0010=\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020;2\u0006\u0010\u000b\u001a\u00020.2\u0006\u00105\u001a\u0002042\u0006\u0010\t\u001a\u00020\b2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e06H\u0001¢\u0006\u0004\b=\u0010>JW\u0010E\u001a\u00020'2\u0006\u0010@\u001a\u00020?2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00105\u001a\u0002042\u0006\u0010B\u001a\u00020A2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e062\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u000e06H\u0001¢\u0006\u0004\bE\u0010FJW\u0010G\u001a\u00020'2\u0006\u0010@\u001a\u00020?2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00105\u001a\u0002042\u0006\u0010B\u001a\u00020A2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e062\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u000e06H\u0001¢\u0006\u0004\bG\u0010FJ3\u0010H\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\u0006\u00105\u001a\u0002042\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000e06H\u0001¢\u0006\u0004\bH\u0010IJ\u001d\u0010M\u001a\u00020K2\u0006\u0010J\u001a\u00020\u00062\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bM\u0010N¨\u0006O"}, d2 = {"Ln1/s4$a;", "", "<init>", "()V", "Ln3/h1;", "canvas", "Lq4/z3;", "range", "Lv4/i0;", "offsetMapping", "Lq4/t3;", "textLayoutResult", "Ln3/k2;", "paint", "Loq/i0;", "e", "(Ln3/h1;JLv4/i0;Lq4/t3;Ln3/k2;)V", "Ln1/j4;", "textDelegate", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Lc5/t;", "layoutDirection", "prevResultText", "Loq/x;", "", "f", "(Ln1/j4;JLc5/t;Lq4/t3;)Loq/x;", "Lv4/t0;", "value", "selectionPreviewHighlightRange", "deletionPreviewHighlightRange", "highlightPaint", "Landroidx/compose/ui/graphics/Color;", "selectionBackgroundColor", "d", "(Ln3/h1;Lv4/t0;JJLv4/i0;Lq4/t3;Ln3/k2;J)V", "Le4/b0;", "layoutCoordinates", "Lv4/b1;", "textInputSession", "", "hasFocus", "g", "(Lv4/t0;Ln1/j4;Lq4/t3;Le4/b0;Lv4/b1;ZLv4/i0;)V", "textFieldValue", "Ln1/k6;", "o", "(Lv4/b1;Lv4/t0;Lv4/i0;Ln1/k6;)V", "", "Lv4/j;", "ops", "Lv4/m;", "editProcessor", "Lkotlin/Function1;", "onValueChange", "session", "j", "(Ljava/util/List;Lv4/m;Ler/l;Lv4/b1;)V", "Lm3/e;", "position", "n", "(JLn1/k6;Lv4/m;Lv4/i0;Ler/l;)V", "Lv4/v0;", "textInputService", "Lv4/u;", "imeOptions", "Lv4/t;", "onImeActionPerformed", "l", "(Lv4/v0;Lv4/t0;Lv4/m;Lv4/u;Ler/l;Ler/l;)Lv4/b1;", "k", "i", "(Lv4/b1;Lv4/m;Ler/l;)V", "compositionRange", "Lv4/c1;", "transformed", "c", "(JLv4/c1;)Lv4/c1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: n1.s4$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class C3240a implements l<g2, i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b0 f130415a;

            C3240a(b0 b0Var) {
                this.f130415a = b0Var;
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(g2 g2Var) {
                c(g2Var.getValues());
                return i0.f148189a;
            }

            public final void c(float[] fArr) {
                if (this.f130415a.c()) {
                    c0.e(this.f130415a).w0(this.f130415a, fArr);
                }
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final void e(h1 canvas, long range, v4.i0 offsetMapping, TextLayoutResult textLayoutResult, k2 paint) {
            int iE = offsetMapping.e(z3.l(range));
            int iE2 = offsetMapping.e(z3.k(range));
            if (iE != iE2) {
                canvas.u(textLayoutResult.z(iE, iE2), paint);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r h(j4 j4Var) {
            return r.b(t4.b(j4Var.getStyle(), j4Var.getDensity(), j4Var.getFontFamilyResolver(), null, 0, 24, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final i0 m(m mVar, l lVar, p0 p0Var, List list) {
            s4.INSTANCE.j(list, mVar, lVar, (b1) p0Var.f66410a);
            return i0.f148189a;
        }

        public final TransformedText c(long compositionRange, TransformedText transformed) {
            int iE = transformed.getOffsetMapping().e(z3.n(compositionRange));
            int iE2 = transformed.getOffsetMapping().e(z3.i(compositionRange));
            int iMin = Math.min(iE, iE2);
            int iMax = Math.max(iE, iE2);
            e.b bVar = new e.b(transformed.getText());
            bVar.b(new SpanStyle(0L, 0L, (FontWeight) null, (y) null, (z) null, (u4.l) null, (String) null, 0L, (a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, b5.k.INSTANCE.d(), (Shadow) null, (j0) null, (g) null, 61439, (k) null), iMin, iMax);
            return new TransformedText(bVar.p(), transformed.getOffsetMapping());
        }

        public final void d(h1 canvas, TextFieldValue value, long selectionPreviewHighlightRange, long deletionPreviewHighlightRange, v4.i0 offsetMapping, TextLayoutResult textLayoutResult, k2 highlightPaint, long selectionBackgroundColor) {
            if (!z3.h(selectionPreviewHighlightRange)) {
                highlightPaint.m(selectionBackgroundColor);
                e(canvas, selectionPreviewHighlightRange, offsetMapping, textLayoutResult, highlightPaint);
            } else if (!z3.h(deletionPreviewHighlightRange)) {
                Color colorM0boximpl = Color.m0boximpl(textLayoutResult.getLayoutInput().getStyle().j());
                if (colorM0boximpl.m20unboximpl() == 16) {
                    colorM0boximpl = null;
                }
                long jM20unboximpl = colorM0boximpl != null ? colorM0boximpl.m20unboximpl() : Color.INSTANCE.a();
                highlightPaint.m(Color.m9copywmQWz5c$default(jM20unboximpl, Color.m12getAlphaimpl(jM20unboximpl) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                e(canvas, deletionPreviewHighlightRange, offsetMapping, textLayoutResult, highlightPaint);
            } else if (!z3.h(value.getSelection())) {
                highlightPaint.m(selectionBackgroundColor);
                e(canvas, value.getSelection(), offsetMapping, textLayoutResult, highlightPaint);
            }
            x3.f164647a.a(canvas, textLayoutResult);
        }

        public final x<Integer, Integer, TextLayoutResult> f(j4 textDelegate, long constraints, t layoutDirection, TextLayoutResult prevResultText) {
            TextLayoutResult textLayoutResultL = textDelegate.l(constraints, layoutDirection, prevResultText);
            return new x<>(Integer.valueOf((int) (textLayoutResultL.getSize() >> 32)), Integer.valueOf((int) (textLayoutResultL.getSize() & BodyPartID.bodyIdMax)), textLayoutResultL);
        }

        public final void g(TextFieldValue value, final j4 textDelegate, TextLayoutResult textLayoutResult, b0 layoutCoordinates, b1 textInputSession, boolean hasFocus, v4.i0 offsetMapping) {
            if (hasFocus) {
                textInputSession.c(t4.c(textLayoutResult, layoutCoordinates, offsetMapping.e(z3.k(value.getSelection())), new er.a() { // from class: n1.q4
                    @Override // er.a
                    public final Object a() {
                        return s4.Companion.h(textDelegate);
                    }
                }));
            }
        }

        public final void i(b1 textInputSession, m editProcessor, l<? super TextFieldValue, i0> onValueChange) {
            onValueChange.b(TextFieldValue.i(editProcessor.getMBufferState(), null, 0L, null, 3, null));
            textInputSession.a();
        }

        public final void j(List<? extends j> ops, m editProcessor, l<? super TextFieldValue, i0> onValueChange, b1 session) {
            TextFieldValue textFieldValueB = editProcessor.b(ops);
            if (session != null) {
                session.d(null, textFieldValueB);
            }
            onValueChange.b(textFieldValueB);
        }

        public final b1 k(v0 textInputService, TextFieldValue value, m editProcessor, ImeOptions imeOptions, l<? super TextFieldValue, i0> onValueChange, l<? super v4.t, i0> onImeActionPerformed) {
            return l(textInputService, value, editProcessor, imeOptions, onValueChange, onImeActionPerformed);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, v4.b1] */
        public final b1 l(v0 textInputService, TextFieldValue value, final m editProcessor, ImeOptions imeOptions, final l<? super TextFieldValue, i0> onValueChange, l<? super v4.t, i0> onImeActionPerformed) {
            final p0 p0Var = new p0();
            ?? D = textInputService.d(value, imeOptions, new l() { // from class: n1.r4
                @Override // er.l
                public final Object b(Object obj) {
                    return s4.Companion.m(editProcessor, onValueChange, p0Var, (List) obj);
                }
            }, onImeActionPerformed);
            p0Var.f66410a = D;
            return D;
        }

        public final void n(long position, k6 textLayoutResult, m editProcessor, v4.i0 offsetMapping, l<? super TextFieldValue, i0> onValueChange) {
            onValueChange.b(TextFieldValue.i(editProcessor.getMBufferState(), null, a4.a(offsetMapping.b(k6.e(textLayoutResult, position, false, 2, null))), null, 5, null));
        }

        public final void o(b1 textInputSession, TextFieldValue textFieldValue, v4.i0 offsetMapping, k6 textLayoutResult) {
            b0 decorationBoxCoordinates;
            b0 innerTextFieldCoordinates = textLayoutResult.getInnerTextFieldCoordinates();
            if (innerTextFieldCoordinates == null || !innerTextFieldCoordinates.c() || (decorationBoxCoordinates = textLayoutResult.getDecorationBoxCoordinates()) == null) {
                return;
            }
            textInputSession.e(textFieldValue, offsetMapping, textLayoutResult.getValue(), new C3240a(innerTextFieldCoordinates), n1.b(innerTextFieldCoordinates), innerTextFieldCoordinates.Y(decorationBoxCoordinates, false));
        }

        private Companion() {
        }
    }
}
