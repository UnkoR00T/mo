package jd;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c5.s;
import fd.a0;
import fd.b0;
import fd.m0;
import fr.w;
import java.util.Map;
import n3.f0;
import n3.h1;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p036e4.m2;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.g4;
import p076m2.t;
import w0.z;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÍ\u0001\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001f\u0010 \u001aý\u0001\u0010)\u001a\u00020\u001e2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010(\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b)\u0010*\u001a\u001f\u0010/\u001a\u00020.*\u00020+2\u0006\u0010-\u001a\u00020,H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00062²\u0006\u0010\u00101\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0004\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Lfd/f;", "composition", "Lkotlin/Function0;", "", "progress", "Lf3/m;", "modifier", "", "outlineMasksAndMattes", "applyOpacityToLayers", "applyShadowToLayers", "enableMergePaths", "Lfd/m0;", "renderMode", "maintainOriginalImageBounds", "Ljd/o;", "dynamicProperties", "Lf3/c;", "alignment", "Le4/l;", "contentScale", "clipToCompositionBounds", "clipTextToBoundingBox", "", "", "Landroid/graphics/Typeface;", "fontMap", "Lfd/a;", "asyncUpdates", "safeMode", "Loq/i0;", "a", "(Lfd/f;Ler/a;Lf3/m;ZZZZLfd/m0;ZLjd/o;Lf3/c;Le4/l;ZZLjava/util/Map;Lfd/a;ZLm2/r;III)V", "isPlaying", "restartOnPlay", "Ljd/k;", "clipSpec", "speed", "", "iterations", "reverseOnRepeat", "b", "(Lfd/f;Lf3/m;ZZLjd/k;FIZZZZLfd/m0;ZZLjd/o;Lf3/c;Le4/l;ZZLjava/util/Map;ZLfd/a;Lm2/r;IIII)V", "Lm3/k;", "Le4/m2;", "scale", "Lc5/r;", "j", "(JJ)J", "setDynamicProperties", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends w implements er.p<p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ fd.f f101704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ er.a<Float> f101705c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f3.m f101706d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f101707e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f101708f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f101709g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f101710h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ m0 f101711j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f101712k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ o f101713l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ f3.c f101714m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ p036e4.l f101715n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f101716p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f101717q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Map<String, Typeface> f101718r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ fd.a f101719s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f101720t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f101721v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f101722w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f101723x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(fd.f fVar, er.a<Float> aVar, f3.m mVar, boolean z15, boolean z16, boolean z17, boolean z18, m0 m0Var, boolean z19, o oVar, f3.c cVar, p036e4.l lVar, boolean z25, boolean z26, Map<String, ? extends Typeface> map, fd.a aVar2, boolean z27, int i15, int i16, int i17) {
            super(2);
            this.f101704b = fVar;
            this.f101705c = aVar;
            this.f101706d = mVar;
            this.f101707e = z15;
            this.f101708f = z16;
            this.f101709g = z17;
            this.f101710h = z18;
            this.f101711j = m0Var;
            this.f101712k = z19;
            this.f101713l = oVar;
            this.f101714m = cVar;
            this.f101715n = lVar;
            this.f101716p = z25;
            this.f101717q = z26;
            this.f101718r = map;
            this.f101719s = aVar2;
            this.f101720t = z27;
            this.f101721v = i15;
            this.f101722w = i16;
            this.f101723x = i17;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            e.a(this.f101704b, this.f101705c, this.f101706d, this.f101707e, this.f101708f, this.f101709g, this.f101710h, this.f101711j, this.f101712k, this.f101713l, this.f101714m, this.f101715n, this.f101716p, this.f101717q, this.f101718r, this.f101719s, this.f101720t, rVar, g4.a(this.f101721v | 1), g4.a(this.f101722w), this.f101723x);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp3/f;", "Loq/i0;", "c", "(Lp3/f;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends w implements er.l<p3.f, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Rect f101724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p036e4.l f101725c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f3.c f101726d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Matrix f101727e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ a0 f101728f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f101729g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f101730h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ m0 f101731j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ fd.a f101732k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ fd.f f101733l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Map<String, Typeface> f101734m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ o f101735n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f101736p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f101737q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f101738r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f101739s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f101740t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ boolean f101741v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ Context f101742w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ er.a<Float> f101743x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ a3<o> f101744y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Rect rect, p036e4.l lVar, f3.c cVar, Matrix matrix, a0 a0Var, boolean z15, boolean z16, m0 m0Var, fd.a aVar, fd.f fVar, Map<String, ? extends Typeface> map, o oVar, boolean z17, boolean z18, boolean z19, boolean z25, boolean z26, boolean z27, Context context, er.a<Float> aVar2, a3<o> a3Var) {
            super(1);
            this.f101724b = rect;
            this.f101725c = lVar;
            this.f101726d = cVar;
            this.f101727e = matrix;
            this.f101728f = a0Var;
            this.f101729g = z15;
            this.f101730h = z16;
            this.f101731j = m0Var;
            this.f101732k = aVar;
            this.f101733l = fVar;
            this.f101734m = map;
            this.f101735n = oVar;
            this.f101736p = z17;
            this.f101737q = z18;
            this.f101738r = z19;
            this.f101739s = z25;
            this.f101740t = z26;
            this.f101741v = z27;
            this.f101742w = context;
            this.f101743x = aVar2;
            this.f101744y = a3Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p3.f fVar) {
            c(fVar);
            return i0.f148189a;
        }

        public final void c(p3.f fVar) {
            Rect rect = this.f101724b;
            p036e4.l lVar = this.f101725c;
            f3.c cVar = this.f101726d;
            Matrix matrix = this.f101727e;
            a0 a0Var = this.f101728f;
            boolean z15 = this.f101729g;
            boolean z16 = this.f101730h;
            m0 m0Var = this.f101731j;
            fd.a aVar = this.f101732k;
            fd.f fVar2 = this.f101733l;
            Map<String, Typeface> map = this.f101734m;
            o oVar = this.f101735n;
            boolean z17 = this.f101736p;
            boolean z18 = this.f101737q;
            boolean z19 = this.f101738r;
            boolean z25 = this.f101739s;
            boolean z26 = this.f101740t;
            boolean z27 = this.f101741v;
            Context context = this.f101742w;
            er.a<Float> aVar2 = this.f101743x;
            a3<o> a3Var = this.f101744y;
            h1 h1VarF = fVar.getDrawContext().f();
            long jA = m3.l.a(rect.width(), rect.height());
            long jA2 = s.a(hr.a.d(m3.k.i(fVar.a())), hr.a.d(m3.k.g(fVar.a())));
            long jA3 = lVar.a(jA, fVar.a());
            long jA4 = cVar.a(e.j(jA, jA3), jA2, fVar.getLayoutDirection());
            matrix.reset();
            matrix.preTranslate(c5.n.i(jA4), c5.n.j(jA4));
            matrix.preScale(m2.b(jA3), m2.c(jA3));
            a0Var.s(b0.MergePathsApi19, z15);
            a0Var.n0(z16);
            a0Var.m0(m0Var);
            a0Var.d0(aVar);
            a0Var.g0(fVar2);
            a0Var.h0(map);
            if (oVar != e.c(a3Var)) {
                o oVarC = e.c(a3Var);
                if (oVarC != null) {
                    oVarC.b(a0Var);
                }
                if (oVar != null) {
                    oVar.a(a0Var);
                }
                e.d(a3Var, oVar);
            }
            a0Var.k0(z17);
            a0Var.b0(z18);
            a0Var.c0(z19);
            a0Var.j0(z25);
            a0Var.f0(z26);
            a0Var.e0(z27);
            md.h hVarG = a0Var.G();
            if (a0Var.j(context) || hVarG == null) {
                a0Var.l0(aVar2.a().floatValue());
            } else {
                a0Var.l0(hVarG.f125644b);
            }
            a0Var.setBounds(0, 0, rect.width(), rect.height());
            a0Var.p(f0.d(h1VarF), matrix);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends w implements er.p<p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ fd.f f101745b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ er.a<Float> f101746c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f3.m f101747d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f101748e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f101749f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f101750g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f101751h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ m0 f101752j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f101753k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ o f101754l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ f3.c f101755m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ p036e4.l f101756n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f101757p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f101758q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Map<String, Typeface> f101759r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ fd.a f101760s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f101761t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f101762v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f101763w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f101764x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(fd.f fVar, er.a<Float> aVar, f3.m mVar, boolean z15, boolean z16, boolean z17, boolean z18, m0 m0Var, boolean z19, o oVar, f3.c cVar, p036e4.l lVar, boolean z25, boolean z26, Map<String, ? extends Typeface> map, fd.a aVar2, boolean z27, int i15, int i16, int i17) {
            super(2);
            this.f101745b = fVar;
            this.f101746c = aVar;
            this.f101747d = mVar;
            this.f101748e = z15;
            this.f101749f = z16;
            this.f101750g = z17;
            this.f101751h = z18;
            this.f101752j = m0Var;
            this.f101753k = z19;
            this.f101754l = oVar;
            this.f101755m = cVar;
            this.f101756n = lVar;
            this.f101757p = z25;
            this.f101758q = z26;
            this.f101759r = map;
            this.f101760s = aVar2;
            this.f101761t = z27;
            this.f101762v = i15;
            this.f101763w = i16;
            this.f101764x = i17;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            e.a(this.f101745b, this.f101746c, this.f101747d, this.f101748e, this.f101749f, this.f101750g, this.f101751h, this.f101752j, this.f101753k, this.f101754l, this.f101755m, this.f101756n, this.f101757p, this.f101758q, this.f101759r, this.f101760s, this.f101761t, rVar, g4.a(this.f101762v | 1), g4.a(this.f101763w), this.f101764x);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    static final class d extends w implements er.a<Float> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f101765b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(i iVar) {
            super(0);
            this.f101765b = iVar;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float a() {
            return Float.valueOf(e.e(this.f101765b));
        }
    }

    /* JADX INFO: renamed from: jd.e$e, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class C2408e extends w implements er.p<p076m2.r, Integer, i0> {
        final /* synthetic */ int A;
        final /* synthetic */ int B;
        final /* synthetic */ int C;
        final /* synthetic */ int D;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ fd.f f101766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f3.m f101767c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f101768d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f101769e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ k f101770f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f101771g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f101772h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f101773j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f101774k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f101775l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f101776m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ m0 f101777n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f101778p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f101779q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ o f101780r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ f3.c f101781s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ p036e4.l f101782t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ boolean f101783v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ boolean f101784w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ Map<String, Typeface> f101785x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ boolean f101786y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ fd.a f101787z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2408e(fd.f fVar, f3.m mVar, boolean z15, boolean z16, k kVar, float f15, int i15, boolean z17, boolean z18, boolean z19, boolean z25, m0 m0Var, boolean z26, boolean z27, o oVar, f3.c cVar, p036e4.l lVar, boolean z28, boolean z29, Map<String, ? extends Typeface> map, boolean z35, fd.a aVar, int i16, int i17, int i18, int i19) {
            super(2);
            this.f101766b = fVar;
            this.f101767c = mVar;
            this.f101768d = z15;
            this.f101769e = z16;
            this.f101770f = kVar;
            this.f101771g = f15;
            this.f101772h = i15;
            this.f101773j = z17;
            this.f101774k = z18;
            this.f101775l = z19;
            this.f101776m = z25;
            this.f101777n = m0Var;
            this.f101778p = z26;
            this.f101779q = z27;
            this.f101780r = oVar;
            this.f101781s = cVar;
            this.f101782t = lVar;
            this.f101783v = z28;
            this.f101784w = z29;
            this.f101785x = map;
            this.f101786y = z35;
            this.f101787z = aVar;
            this.A = i16;
            this.B = i17;
            this.C = i18;
            this.D = i19;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            e.b(this.f101766b, this.f101767c, this.f101768d, this.f101769e, this.f101770f, this.f101771g, this.f101772h, this.f101773j, this.f101774k, this.f101775l, this.f101776m, this.f101777n, this.f101778p, this.f101779q, this.f101780r, this.f101781s, this.f101782t, this.f101783v, this.f101784w, this.f101785x, this.f101786y, this.f101787z, rVar, g4.a(this.A | 1), g4.a(this.B), g4.a(this.C), this.D);
        }
    }

    public static final void a(fd.f fVar, er.a<Float> aVar, f3.m mVar, boolean z15, boolean z16, boolean z17, boolean z18, m0 m0Var, boolean z19, o oVar, f3.c cVar, p036e4.l lVar, boolean z25, boolean z26, Map<String, ? extends Typeface> map, fd.a aVar2, boolean z27, p076m2.r rVar, int i15, int i16, int i17) {
        p076m2.r rVarH = rVar.h(382909894);
        f3.m mVar2 = (i17 & 4) != 0 ? f3.m.INSTANCE : mVar;
        boolean z28 = (i17 & 8) != 0 ? false : z15;
        boolean z29 = (i17 & 16) != 0 ? false : z16;
        boolean z35 = (i17 & 32) != 0 ? true : z17;
        boolean z36 = (i17 & 64) != 0 ? false : z18;
        m0 m0Var2 = (i17 & 128) != 0 ? m0.AUTOMATIC : m0Var;
        boolean z37 = (i17 & 256) != 0 ? false : z19;
        o oVar2 = (i17 & 512) != 0 ? null : oVar;
        f3.c cVarE = (i17 & 1024) != 0 ? f3.c.INSTANCE.e() : cVar;
        p036e4.l lVarE = (i17 & 2048) != 0 ? p036e4.l.INSTANCE.e() : lVar;
        boolean z38 = (i17 & PKIFailureInfo.certConfirmed) != 0 ? true : z25;
        boolean z39 = (i17 & PKIFailureInfo.certRevoked) != 0 ? false : z26;
        Map<String, ? extends Typeface> map2 = (i17 & 16384) != 0 ? null : map;
        fd.a aVar3 = (i17 & 32768) != 0 ? fd.a.AUTOMATIC : aVar2;
        boolean z45 = (i17 & PKIFailureInfo.notAuthorized) != 0 ? false : z27;
        if (t.k()) {
            t.o(382909894, i15, i16, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:97)");
        }
        rVarH.C(185152185);
        Object objE = rVarH.E();
        p076m2.r.Companion companion = p076m2.r.INSTANCE;
        if (objE == companion.a()) {
            objE = new a0();
            rVarH.v(objE);
        }
        a0 a0Var = (a0) objE;
        rVarH.V();
        rVarH.C(185152232);
        Object objE2 = rVarH.E();
        if (objE2 == companion.a()) {
            objE2 = new Matrix();
            rVarH.v(objE2);
        }
        Matrix matrix = (Matrix) objE2;
        rVarH.V();
        rVarH.C(185152312);
        boolean zW = rVarH.W(fVar);
        Object objE3 = rVarH.E();
        if (zW || objE3 == companion.a()) {
            objE3 = c6.e(null, null, 2, null);
            rVarH.v(objE3);
        }
        a3 a3Var = (a3) objE3;
        rVarH.V();
        rVarH.C(185152364);
        if (fVar == null || fVar.d() == 0.0f) {
            f3.m mVar3 = mVar2;
            p036e4.l lVar2 = lVarE;
            Map<String, ? extends Typeface> map3 = map2;
            m0 m0Var3 = m0Var2;
            o oVar3 = oVar2;
            boolean z46 = z28;
            boolean z47 = z29;
            f3.c cVar2 = cVarE;
            boolean z48 = z38;
            boolean z49 = z39;
            boolean z55 = z45;
            boolean z56 = z35;
            boolean z57 = z36;
            boolean z58 = z37;
            fd.a aVar4 = aVar3;
            d1.r.b(mVar3, rVarH, (i15 >> 6) & 14);
            rVarH.V();
            if (t.k()) {
                t.n();
            }
            d5 d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new a(fVar, aVar, mVar3, z46, z47, z56, z57, m0Var3, z58, oVar3, cVar2, lVar2, z48, z49, map3, aVar4, z55, i15, i16, i17));
                return;
            }
            return;
        }
        rVarH.V();
        Rect rectB = fVar.b();
        Context context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
        f3.m mVarA = h.a(mVar2, rectB.width(), rectB.height());
        f3.m mVar4 = mVar2;
        f3.c cVar3 = cVarE;
        boolean z59 = z35;
        boolean z65 = z36;
        fd.a aVar5 = aVar3;
        p036e4.l lVar3 = lVarE;
        boolean z66 = z45;
        o oVar4 = oVar2;
        Map<String, ? extends Typeface> map4 = map2;
        m0 m0Var4 = m0Var2;
        b bVar = new b(rectB, lVar3, cVar3, matrix, a0Var, z65, z66, m0Var4, aVar5, fVar, map4, oVar4, z28, z29, z59, z37, z38, z39, context, aVar, a3Var);
        boolean z67 = z37;
        boolean z68 = z28;
        boolean z69 = z29;
        boolean z75 = z38;
        boolean z76 = z39;
        z.b(mVarA, bVar, rVarH, 0);
        if (t.k()) {
            t.n();
        }
        d5 d5VarM2 = rVarH.m();
        if (d5VarM2 != null) {
            d5VarM2.a(new c(fVar, aVar, mVar4, z68, z69, z59, z65, m0Var4, z67, oVar4, cVar3, lVar3, z75, z76, map4, aVar5, z66, i15, i16, i17));
        }
    }

    public static final void b(fd.f fVar, f3.m mVar, boolean z15, boolean z16, k kVar, float f15, int i15, boolean z17, boolean z18, boolean z19, boolean z25, m0 m0Var, boolean z26, boolean z27, o oVar, f3.c cVar, p036e4.l lVar, boolean z28, boolean z29, Map<String, ? extends Typeface> map, boolean z35, fd.a aVar, p076m2.r rVar, int i16, int i17, int i18, int i19) {
        p076m2.r rVarH = rVar.h(1331239405);
        f3.m mVar2 = (i19 & 2) != 0 ? f3.m.INSTANCE : mVar;
        boolean z36 = (i19 & 4) != 0 ? true : z15;
        boolean z37 = (i19 & 8) != 0 ? true : z16;
        k kVar2 = (i19 & 16) != 0 ? null : kVar;
        float f16 = (i19 & 32) != 0 ? 1.0f : f15;
        int i25 = (i19 & 64) != 0 ? 1 : i15;
        boolean z38 = (i19 & 128) != 0 ? false : z17;
        boolean z39 = (i19 & 256) != 0 ? false : z18;
        boolean z45 = (i19 & 512) != 0 ? true : z19;
        boolean z46 = (i19 & 1024) != 0 ? false : z25;
        m0 m0Var2 = (i19 & 2048) != 0 ? m0.AUTOMATIC : m0Var;
        boolean z47 = (i19 & PKIFailureInfo.certConfirmed) != 0 ? false : z26;
        boolean z48 = (i19 & PKIFailureInfo.certRevoked) != 0 ? false : z27;
        o oVar2 = (i19 & 16384) != 0 ? null : oVar;
        f3.c cVarE = (i19 & 32768) != 0 ? f3.c.INSTANCE.e() : cVar;
        p036e4.l lVarE = (i19 & PKIFailureInfo.notAuthorized) != 0 ? p036e4.l.INSTANCE.e() : lVar;
        boolean z49 = (i19 & PKIFailureInfo.unsupportedVersion) != 0 ? true : z28;
        boolean z55 = (i19 & PKIFailureInfo.transactionIdInUse) != 0 ? false : z29;
        Map<String, ? extends Typeface> map2 = (i19 & PKIFailureInfo.signerNotTrusted) != 0 ? null : map;
        boolean z56 = (i19 & PKIFailureInfo.badCertTemplate) != 0 ? false : z35;
        fd.a aVar2 = (i19 & PKIFailureInfo.badSenderNonce) != 0 ? fd.a.AUTOMATIC : aVar;
        if (t.k()) {
            t.o(1331239405, i16, i17, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:224)");
        }
        int i26 = i16 >> 3;
        boolean z57 = z36;
        boolean z58 = z37;
        k kVar3 = kVar2;
        int i27 = i25;
        i iVarC = jd.a.c(fVar, z57, z58, z47, kVar3, f16, i27, null, false, false, rVarH, (i26 & 896) | (i26 & 112) | 8 | ((i17 << 3) & 7168) | (i16 & 57344) | (i16 & 458752) | (i16 & 3670016), 896);
        f3.m mVar3 = mVar2;
        boolean z59 = z45;
        boolean z65 = z38;
        rVarH.C(185157769);
        boolean zW = rVarH.W(iVarC);
        Object objE = rVarH.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new d(iVarC);
            rVarH.v(objE);
        }
        er.a aVar3 = (er.a) objE;
        rVarH.V();
        int i28 = i16 >> 12;
        int i29 = i17 << 18;
        int i35 = (i28 & 7168) | ((i16 << 3) & 896) | 1073741832 | (i28 & 57344) | (i28 & 458752) | (i29 & 3670016) | (i29 & 29360128) | ((i17 << 15) & 234881024);
        int i36 = i17 >> 15;
        o oVar3 = oVar2;
        boolean z66 = z46;
        boolean z67 = z39;
        f3.c cVar2 = cVarE;
        p036e4.l lVar2 = lVarE;
        boolean z68 = z49;
        boolean z69 = z55;
        Map<String, ? extends Typeface> map3 = map2;
        boolean z75 = z56;
        fd.a aVar4 = aVar2;
        a(fVar, aVar3, mVar3, z65, z67, z59, z66, m0Var2, z48, oVar3, cVar2, lVar2, z68, z69, map3, aVar4, z75, rVarH, i35, (i36 & 896) | (i36 & 14) | 32768 | (i36 & 112) | (i36 & 7168) | ((i18 << 12) & 458752) | ((i18 << 18) & 3670016), 0);
        float f17 = f16;
        if (t.k()) {
            t.n();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new C2408e(fVar, mVar3, z57, z58, kVar3, f17, i27, z65, z67, z59, z66, m0Var2, z47, z48, oVar3, cVar2, lVar2, z68, z69, map3, z75, aVar4, i16, i17, i18, i19));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o c(a3<o> a3Var) {
        return a3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(a3<o> a3Var, o oVar) {
        a3Var.setValue(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(i iVar) {
        return iVar.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(long j15, long j16) {
        return s.a((int) (m3.k.i(j15) * m2.b(j16)), (int) (m3.k.g(j15) * m2.c(j16)));
    }
}
