package t70;

import a4.PointerInputChange;
import a4.k0;
import a4.w0;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.g1;
import d1.a3;
import d1.d3;
import fr.n0;
import ja.u0;
import mx.Label;
import n3.y2;
import oq.i0;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.r0;
import p076m2.s0;
import p076m2.x5;
import p143z0.q0;
import p3.Stroke;
import q4.TextStyle;
import w0.n1;
import w0.r1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a)\u0010\u0018\u001a\u00020\u00062\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u000f\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010!\u001a\u00020\u0004*\u0004\u0018\u00010 ¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010#\u001a\u00020\u0004*\u0004\u0018\u00010\u0004¢\u0006\u0004\b#\u0010$\u001a#\u0010)\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b)\u0010*\u001a)\u0010,\u001a\u00020\u001a*\u00020\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0+2\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b,\u0010-\u001a3\u00100\u001a\u00020\u001a*\u00020\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0+2\b\b\u0002\u0010.\u001a\u00020\t2\b\b\u0002\u0010/\u001a\u00020\t¢\u0006\u0004\b0\u00101\u001a-\u00102\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010.\u001a\u00020\t2\b\b\u0002\u0010/\u001a\u00020\t¢\u0006\u0004\b2\u00103\u001a%\u00106\u001a\u00020\u001a*\u00020\u001a2\u0006\u00105\u001a\u0002042\b\b\u0002\u0010.\u001a\u00020\tH\u0007¢\u0006\u0004\b6\u00107\u001a+\u00109\u001a\u00020\u001a*\u00020\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0+2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b9\u0010:\u001a%\u0010;\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010&\u001a\u00020%2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b;\u0010<\u001a\u0019\u0010>\u001a\u00020=2\b\b\u0002\u0010.\u001a\u00020\tH\u0007¢\u0006\u0004\b>\u0010?\u001aK\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00010C\"\b\b\u0000\u0010A*\u00020@\"\b\b\u0001\u0010B*\u00020@*\b\u0012\u0004\u0012\u00028\u00000C2\u0018\u0010D\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014¢\u0006\u0004\bE\u0010F\u001a\u001b\u0010I\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010H\u001a\u00020GH\u0007¢\u0006\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lcx/a;", "I", "()Lcx/a;", "Landroid/content/Context;", "", "message", "Loq/i0;", "M", "(Landroid/content/Context;Ljava/lang/String;)V", "Lc5/h;", "", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(FLm2/r;I)F", "", "Lc5/v;", "K", "(ILm2/r;I)J", "Lq4/b4;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lq4/b4;Lm2/r;I)Lq4/b4;", "Lkotlin/Function2;", "Landroidx/lifecycle/q;", "Landroidx/lifecycle/j$a;", "onEvent", "j", "(Ler/p;Lm2/r;I)V", "Lf3/m;", "n", "(Lf3/m;Lm2/r;I)Lf3/m;", "Ld1/d3;", ip.a.f96138c, "(Lm2/r;I)Ld1/d3;", "Lmx/a;", "O", "(Lmx/a;)Ljava/lang/String;", "N", "(Ljava/lang/String;)Ljava/lang/String;", "", "isFocused", "Ln3/y2;", "shape", "C", "(Lf3/m;ZLn3/y2;Lm2/r;I)Lf3/m;", "Lm2/f6;", "B", "(Lf3/m;Lm2/f6;Ln3/y2;Lm2/r;I)Lf3/m;", "radius", "decreaseSizeByValue", "u", "(Lf3/m;Lm2/f6;FF)Lf3/m;", "v", "(Lf3/m;ZFF)Lf3/m;", "Lb1/j;", "interactionSource", "F", "(Lf3/m;Lb1/j;FLm2/r;II)Lf3/m;", "circleRadius", "o", "(Lf3/m;Lm2/f6;Lc5/h;)Lf3/m;", "p", "(Lf3/m;ZLc5/h;)Lf3/m;", "Lw0/r1;", "E", "(FLm2/r;II)Lw0/r1;", "", "T", "R", "Lja/n0;", "transform", "J", "(Lja/n0;Ler/p;)Lja/n0;", "Lz20/c;", "dragDropListState", "G", "(Lf3/m;Lz20/c;Lm2/r;I)Lf3/m;", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class s {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"t70/s$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.p016lifecycle.j f188750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.p016lifecycle.n f188751b;

        public a(androidx.p016lifecycle.j jVar, androidx.p016lifecycle.n nVar) {
            this.f188750a = jVar;
            this.f188751b = nVar;
        }

        @Override // p076m2.r0
        public void j() {
            this.f188750a.d(this.f188751b);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p144z20.c f188752a;

        b(p144z20.c cVar) {
            this.f188752a = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 e(p144z20.c cVar, m3.e eVar) {
            cVar.h(eVar.getPackedValue());
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 f(p144z20.c cVar) {
            cVar.g();
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 g(p144z20.c cVar) {
            cVar.g();
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 h(p144z20.c cVar, PointerInputChange pointerInputChange, m3.e eVar) {
            pointerInputChange.a();
            cVar.f(eVar.getPackedValue());
            return i0.f148189a;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(k0 k0Var, tq.e<? super i0> eVar) {
            final p144z20.c cVar = this.f188752a;
            er.l lVar = new er.l() { // from class: t70.t
                @Override // er.l
                public final Object b(Object obj) {
                    return s.b.e(cVar, (m3.e) obj);
                }
            };
            final p144z20.c cVar2 = this.f188752a;
            er.a aVar = new er.a() { // from class: t70.u
                @Override // er.a
                public final Object a() {
                    return s.b.f(cVar2);
                }
            };
            final p144z20.c cVar3 = this.f188752a;
            er.a aVar2 = new er.a() { // from class: t70.v
                @Override // er.a
                public final Object a() {
                    return s.b.g(cVar3);
                }
            };
            final p144z20.c cVar4 = this.f188752a;
            Object objM = q0.m(k0Var, lVar, aVar, aVar2, new er.p() { // from class: t70.w
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.b.h(cVar4, (PointerInputChange) obj, (m3.e) obj2);
                }
            }, eVar);
            return objM == uq.b.e() ? objM : i0.f148189a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u0002H\u0003H\n"}, d2 = {"<anonymous>", "R", "", "T", "item"}, k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c<R, T> extends vq.k implements er.p<T, tq.e<? super R>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f188753e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f188754f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.p<Integer, T, R> f188755g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ n0 f188756h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(er.p<? super Integer, ? super T, ? extends R> pVar, n0 n0Var, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f188755g = pVar;
            this.f188756h = n0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object obj2 = this.f188754f;
            uq.b.e();
            if (this.f188753e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            er.p<Integer, T, R> pVar = this.f188755g;
            n0 n0Var = this.f188756h;
            int i15 = n0Var.f66407a;
            n0Var.f66407a = i15 + 1;
            return pVar.B(vq.b.e(i15), (T) obj2);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(T t15, tq.e<? super R> eVar) {
            return ((c) v(t15, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = new c(this.f188755g, this.f188756h, eVar);
            cVar.f188754f = obj;
            return cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(boolean z15, float f15, float f16, float f17, float f18, long j15, long j16, p3.c cVar) {
        if (z15) {
            float f19 = (-f15) * 2;
            long jE = m3.e.e((((long) Float.floatToRawIntBits(cVar.l2(f16) + f19)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f19) << 32));
            float f25 = 4 * f15;
            long jD = m3.k.d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cVar.a() >> 32)) + f25)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (cVar.a() & BodyPartID.bodyIdMax)) + f25) - cVar.l2(f17))) & BodyPartID.bodyIdMax));
            long jB = m3.a.b((((long) Float.floatToRawIntBits(f18)) << 32) | (BodyPartID.bodyIdMax & ((long) Float.floatToRawIntBits(f18))));
            p3.f.w2(cVar, j15, jE, jD, jB, p3.j.f152592b, 0.0f, null, 0, BERTags.FLAGS, null);
            p3.f.w2(cVar, j16, jE, jD, jB, new Stroke(f15, 0.0f, 0, 0, null, 30, null), 0.0f, null, 0, BERTags.FLAGS, null);
        }
        cVar.H2();
        return i0.f148189a;
    }

    public static final f3.m B(f3.m mVar, f6<Boolean> f6Var, y2 y2Var, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(64041224, i15, -1, "pl.gov.coi.common.ui.utils.defaultBorderFocus (Extensions.kt:156)");
        }
        f3.m mVarC = C(mVar, f6Var.getValue().booleanValue(), y2Var, rVar, i15 & 910);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return mVarC;
    }

    public static final f3.m C(f3.m mVar, boolean z15, y2 y2Var, p076m2.r rVar, int i15) {
        long jG;
        long jG2;
        if (p076m2.t.k()) {
            p076m2.t.o(259888977, i15, -1, "pl.gov.coi.common.ui.utils.defaultBorderFocus (Extensions.kt:139)");
        }
        f3.m.Companion companion = f3.m.INSTANCE;
        k70.a aVar = k70.a.f108864a;
        int i16 = k70.a.f108865b;
        float spacing25 = aVar.b(rVar, i16).getSpacing25();
        if (z15) {
            rVar.X(645210427);
            jG = aVar.a(rVar, i16).getNeutral().i();
            rVar.R();
        } else {
            rVar.X(645211132);
            rVar.R();
            jG = Color.INSTANCE.g();
        }
        f3.m mVarH = w0.o.h(companion, spacing25, jG, y2Var);
        float spacing50 = aVar.b(rVar, i16).getSpacing50();
        if (z15) {
            rVar.X(645215641);
            jG2 = aVar.a(rVar, i16).getNeutral().c();
            rVar.R();
        } else {
            rVar.X(645216284);
            rVar.R();
            jG2 = Color.INSTANCE.g();
        }
        f3.m mVarU = mVar.u(k3.f.a(w0.o.h(mVarH, spacing50, jG2, y2Var), y2Var));
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return mVarU;
    }

    public static final d3 D(p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-354126132, i15, -1, "pl.gov.coi.common.ui.utils.defaultPaddingValues (Extensions.kt:120)");
        }
        k70.a aVar = k70.a.f108864a;
        int i16 = k70.a.f108865b;
        d3 d3VarH = a3.h(aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing100(), aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing200());
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return d3VarH;
    }

    public static final r1 E(float f15, p076m2.r rVar, int i15, int i16) {
        if ((i16 & 1) != 0) {
            f15 = c5.h.INSTANCE.c();
        }
        float f16 = f15;
        if (p076m2.t.k()) {
            p076m2.t.o(-397889855, i15, -1, "pl.gov.coi.common.ui.utils.defaultRememberRipple (Extensions.kt:266)");
        }
        r1 r1VarH = androidx.compose.material3.i.h(false, f16, Color.m9copywmQWz5c$default(k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().i(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, false, false, false, false, 249, null);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return r1VarH;
    }

    public static final f3.m F(f3.m mVar, b1.j jVar, float f15, p076m2.r rVar, int i15, int i16) {
        if ((i16 & 2) != 0) {
            f15 = c5.h.INSTANCE.c();
        }
        if (p076m2.t.k()) {
            p076m2.t.o(2116033664, i15, -1, "pl.gov.coi.common.ui.utils.defaultRippleEffect (Extensions.kt:218)");
        }
        f3.m mVarU = mVar.u(n1.e(f3.m.INSTANCE, jVar, E(f15, rVar, (i15 >> 6) & 14, 0)));
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return mVarU;
    }

    public static final f3.m G(f3.m mVar, p144z20.c cVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-481615416, i15, -1, "pl.gov.coi.common.ui.utils.detectDragGestures (Extensions.kt:283)");
        }
        f3.m.Companion companion = f3.m.INSTANCE;
        boolean zG = rVar.G(cVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new b(cVar);
            rVar.v(objE);
        }
        f3.m mVarU = mVar.u(w0.c(companion, cVar, (PointerInputEventHandler) objE));
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return mVarU;
    }

    public static final float H(float f15, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1282646318, i15, -1, "pl.gov.coi.common.ui.utils.dpToPx (Extensions.kt:84)");
        }
        float fL2 = ((c5.d) rVar.N(g1.f())).l2(f15);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return fL2;
    }

    public static final cx.a I() {
        return new cx.b();
    }

    public static final <T, R> ja.n0<R> J(ja.n0<T> n0Var, er.p<? super Integer, ? super T, ? extends R> pVar) {
        return u0.c(n0Var, new c(pVar, new n0(), null));
    }

    @oq.a
    public static final long K(int i15, p076m2.r rVar, int i16) {
        if (p076m2.t.k()) {
            p076m2.t.o(1478346595, i16, -1, "pl.gov.coi.common.ui.utils.nonScaledSp (Extensions.kt:88)");
        }
        long jF = c5.w.f(i15 / ((c5.d) rVar.N(g1.f())).getFontScale());
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return jF;
    }

    public static final TextStyle L(TextStyle textStyle, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1172518129, i15, -1, "pl.gov.coi.common.ui.utils.nonScaledSp (Extensions.kt:91)");
        }
        TextStyle textStyleE = TextStyle.e(textStyle, 0L, K((int) c5.v.h(textStyle.n()), rVar, 0), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, K((int) c5.v.h(textStyle.u()), rVar, 0), null, null, null, 0, 0, null, 16646141, null);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return textStyleE;
    }

    public static final void M(Context context, String str) {
        Toast.makeText(context, str, 0).show();
    }

    public static final String N(String str) {
        if (str == null || fu.r.t0(str)) {
            return "";
        }
        if (fu.r.F1(str) == '.') {
            return str + ' ';
        }
        return str + ". ";
    }

    public static final String O(Label label) {
        return N(label != null ? label.getText() : null);
    }

    public static final void j(final er.p<? super androidx.p016lifecycle.q, ? super androidx.lifecycle.j.a, i0> pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1027538232);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(pVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1027538232, i16, -1, "pl.gov.coi.common.ui.utils.OnLifecycleEvent (Extensions.kt:97)");
            }
            final f6 f6VarP = x5.p(pVar, rVarH, i16 & 14);
            final f6 f6VarP2 = x5.p(rVarH.N(m7.n.c()), rVarH, 0);
            Object value = f6VarP2.getValue();
            boolean zW = rVarH.W(f6VarP2) | rVarH.W(f6VarP);
            Object objE = rVarH.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: t70.j
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s.k(f6VarP2, f6VarP, (s0) obj);
                    }
                };
                rVarH.v(objE);
            }
            Function0.a(value, (er.l) objE, rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: t70.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.m(pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 k(f6 f6Var, final f6 f6Var2, s0 s0Var) {
        androidx.p016lifecycle.j lifecycleRegistry = ((androidx.p016lifecycle.q) f6Var.getValue()).getLifecycleRegistry();
        androidx.p016lifecycle.n nVar = new androidx.p016lifecycle.n() { // from class: t70.l
            @Override // androidx.p016lifecycle.n
            public final void m(androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar) {
                s.l(f6Var2, qVar, aVar);
            }
        };
        lifecycleRegistry.a(nVar);
        return new a(lifecycleRegistry, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(f6 f6Var, androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar) {
        ((er.p) f6Var.getValue()).B(qVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(er.p pVar, int i15, p076m2.r rVar, int i16) {
        j(pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final f3.m n(f3.m mVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1535162909, i15, -1, "pl.gov.coi.common.ui.utils.addDefaultPaddings (Extensions.kt:115)");
        }
        f3.m mVarU = mVar.u(a3.l(f3.m.INSTANCE, D(rVar, 0)));
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return mVarU;
    }

    public static final f3.m o(f3.m mVar, f6<Boolean> f6Var, c5.h hVar) {
        return p(mVar, f6Var.getValue().booleanValue(), hVar);
    }

    public static final f3.m p(f3.m mVar, final boolean z15, final c5.h hVar) {
        return f3.j.c(mVar, null, new er.q() { // from class: t70.n
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s.r(z15, hVar, (f3.m) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, 1, null);
    }

    public static /* synthetic */ f3.m q(f3.m mVar, boolean z15, c5.h hVar, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            hVar = null;
        }
        return p(mVar, z15, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f3.m r(final boolean z15, final c5.h hVar, f3.m mVar, p076m2.r rVar, int i15) {
        rVar.X(509085281);
        if (p076m2.t.k()) {
            p076m2.t.o(509085281, i15, -1, "pl.gov.coi.common.ui.utils.addFocusOuterCircleBorder.<anonymous> (Extensions.kt:238)");
        }
        k70.a aVar = k70.a.f108864a;
        int i16 = k70.a.f108865b;
        final float fH = H(aVar.b(rVar, i16).getSpacing25(), rVar, 0);
        final long jI = aVar.a(rVar, i16).getNeutral().i();
        final long jC = aVar.a(rVar, i16).getNeutral().c();
        boolean zA = rVar.a(z15) | rVar.W(hVar) | rVar.b(fH) | rVar.d(jC) | rVar.d(jI);
        Object objE = rVar.E();
        if (zA || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar = new er.l() { // from class: t70.p
                @Override // er.l
                public final Object b(Object obj) {
                    return s.s(z15, hVar, fH, jC, jI, (k3.e) obj);
                }
            };
            rVar.v(lVar);
            objE = lVar;
        }
        f3.m mVarC = k3.k.c(mVar, (er.l) objE);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        return mVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k3.l s(final boolean z15, final c5.h hVar, final float f15, final long j15, final long j16, k3.e eVar) {
        return eVar.e(new er.l() { // from class: t70.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.t(z15, hVar, f15, j15, j16, (p3.c) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(boolean z15, c5.h hVar, float f15, long j15, long j16, p3.c cVar) {
        p3.c cVar2;
        float fIntBitsToFloat;
        if (z15) {
            if (hVar != null) {
                cVar2 = cVar;
                fIntBitsToFloat = cVar2.l2(hVar.getValue());
            } else {
                cVar2 = cVar;
                fIntBitsToFloat = Float.intBitsToFloat((int) (cVar2.a() >> 32)) / 2;
            }
            float f16 = fIntBitsToFloat;
            p3.f.x2(cVar2, j15, f16, 0L, 0.0f, new Stroke(f15, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
            p3.f.x2(cVar, j16, f16 + f15, 0L, 0.0f, new Stroke(f15, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
        }
        cVar.H2();
        return i0.f148189a;
    }

    public static final f3.m u(f3.m mVar, f6<Boolean> f6Var, float f15, float f16) {
        return v(mVar, f6Var.getValue().booleanValue(), f15, f16);
    }

    public static final f3.m v(f3.m mVar, final boolean z15, final float f15, final float f16) {
        return f3.j.c(mVar, null, new er.q() { // from class: t70.m
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return s.y(f15, f16, z15, (f3.m) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, 1, null);
    }

    public static /* synthetic */ f3.m w(f3.m mVar, f6 f6Var, float f15, float f16, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            f15 = c5.h.INSTANCE.c();
        }
        if ((i15 & 4) != 0) {
            f16 = c5.h.n(0);
        }
        return u(mVar, f6Var, f15, f16);
    }

    public static /* synthetic */ f3.m x(f3.m mVar, boolean z15, float f15, float f16, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            f15 = c5.h.INSTANCE.c();
        }
        if ((i15 & 4) != 0) {
            f16 = c5.h.n(0);
        }
        return v(mVar, z15, f15, f16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f3.m y(float f15, final float f16, final boolean z15, f3.m mVar, p076m2.r rVar, int i15) {
        rVar.X(-1595250041);
        if (p076m2.t.k()) {
            p076m2.t.o(-1595250041, i15, -1, "pl.gov.coi.common.ui.utils.addFocusOuterRectBorder.<anonymous> (Extensions.kt:176)");
        }
        k70.a aVar = k70.a.f108864a;
        int i16 = k70.a.f108865b;
        final float fH = H(aVar.b(rVar, i16).getSpacing25(), rVar, 0);
        final long jI = aVar.a(rVar, i16).getNeutral().i();
        final long jC = aVar.a(rVar, i16).getNeutral().c();
        final float fH2 = H(c5.h.n(aVar.b(rVar, i16).getSpacing50() + f15), rVar, 0);
        final float fN = c5.h.n((int) c5.h.n(f16 / 2));
        boolean zA = rVar.a(z15) | rVar.b(fH) | rVar.b(fN) | rVar.b(f16) | rVar.b(fH2) | rVar.d(jC) | rVar.d(jI);
        Object objE = rVar.E();
        if (zA || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar = new er.l() { // from class: t70.o
                @Override // er.l
                public final Object b(Object obj) {
                    return s.z(z15, fH, fN, f16, fH2, jC, jI, (k3.e) obj);
                }
            };
            rVar.v(lVar);
            objE = lVar;
        }
        f3.m mVarC = k3.k.c(mVar, (er.l) objE);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        return mVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k3.l z(final boolean z15, final float f15, final float f16, final float f17, final float f18, final long j15, final long j16, k3.e eVar) {
        return eVar.e(new er.l() { // from class: t70.q
            @Override // er.l
            public final Object b(Object obj) {
                return s.A(z15, f15, f16, f17, f18, j15, j16, (p3.c) obj);
            }
        });
    }
}
