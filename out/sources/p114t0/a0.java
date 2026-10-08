package p114t0;

import androidx.compose.ui.graphics.Color;
import er.l;
import n3.a2;
import n3.d3;
import n3.e3;
import n3.z1;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.f6;
import u0.g4;
import u0.j0;
import u0.k2;
import u0.q1;
import u0.s3;
import u0.v2;
import u0.y2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a)\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\u000f\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\u0012\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0017\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001a\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001aI\u0010!\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b!\u0010\"\u001aI\u0010%\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010#\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b%\u0010&\u001aI\u0010*\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010\u001d\u001a\u00020'2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b*\u0010+\u001aI\u0010.\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010\u001d\u001a\u00020,2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0014\b\u0002\u0010-\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b.\u0010/\u001aI\u00101\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010#\u001a\u00020'2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0014\b\u0002\u00100\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b1\u00102\u001aI\u00104\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\r0\u00002\b\b\u0002\u0010#\u001a\u00020,2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0014\b\u0002\u00103\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b4\u00105\u001a5\u00107\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0014\b\u0002\u00106\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b7\u0010\u0010\u001a5\u00109\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\u0014\b\u0002\u00108\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0\fH\u0007¢\u0006\u0004\b9\u0010\u0013\u001a\u0013\u0010:\u001a\u00020\u001c*\u00020'H\u0002¢\u0006\u0004\b:\u0010;\u001a\u0013\u0010<\u001a\u00020\u001c*\u00020,H\u0002¢\u0006\u0004\b<\u0010=\u001aK\u0010H\u001a\u00020G*\b\u0012\u0004\u0012\u00020?0>2\u0006\u0010@\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\b2\b\b\u0002\u0010B\u001a\u00020\u001e2\u000e\b\u0002\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001e0C2\u0006\u0010F\u001a\u00020EH\u0001¢\u0006\u0004\bH\u0010I\u001a!\u0010J\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020?0>2\u0006\u0010@\u001a\u00020\u0004H\u0001¢\u0006\u0004\bJ\u0010K\u001a!\u0010L\u001a\u00020\b*\b\u0012\u0004\u0012\u00020?0>2\u0006\u0010A\u001a\u00020\bH\u0001¢\u0006\u0004\bL\u0010M\u001a1\u0010O\u001a\u00020N*\b\u0012\u0004\u0012\u00020?0>2\u0006\u0010@\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\b2\u0006\u0010F\u001a\u00020EH\u0003¢\u0006\u0004\bO\u0010P\" \u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020R0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010T\"\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00010V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010X\"\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020Z0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010X\"\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\u000b0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010X\"\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020\r0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010X¨\u0006b²\u0006\u000e\u0010`\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010a\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lu0/j0;", "", "animationSpec", "initialAlpha", "Lt0/c0;", "n", "(Lu0/j0;F)Lt0/c0;", "targetAlpha", "Lt0/e0;", "p", "(Lu0/j0;F)Lt0/e0;", "Lc5/n;", "Lkotlin/Function1;", "Lc5/r;", "initialOffset", "B", "(Lu0/j0;Ler/l;)Lt0/c0;", "targetOffset", "E", "(Lu0/j0;Ler/l;)Lt0/e0;", "initialScale", "Ln3/d3;", "transformOrigin", "r", "(Lu0/j0;FJ)Lt0/c0;", "targetScale", "t", "(Lu0/j0;FJ)Lt0/e0;", "Lf3/c;", "expandFrom", "", "clip", "initialSize", "j", "(Lu0/j0;Lf3/c;ZLer/l;)Lt0/c0;", "shrinkTowards", "targetSize", "x", "(Lu0/j0;Lf3/c;ZLer/l;)Lt0/e0;", "Lf3/c$b;", "", "initialWidth", "h", "(Lu0/j0;Lf3/c$b;ZLer/l;)Lt0/c0;", "Lf3/c$c;", "initialHeight", "l", "(Lu0/j0;Lf3/c$c;ZLer/l;)Lt0/c0;", "targetWidth", "v", "(Lu0/j0;Lf3/c$b;ZLer/l;)Lt0/e0;", "targetHeight", "z", "(Lu0/j0;Lf3/c$c;ZLer/l;)Lt0/e0;", "initialOffsetY", "C", "targetOffsetY", "F", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lf3/c$b;)Lf3/c;", "I", "(Lf3/c$c;)Lf3/c;", "Lu0/k2;", "Lt0/x;", "enter", "exit", "trackActiveEnterExit", "Lkotlin/Function0;", "isEnabled", "", AnnotatedPrivateKey.LABEL, "Lf3/m;", "g", "(Lu0/k2;Lt0/c0;Lt0/e0;ZLer/a;Ljava/lang/String;Lm2/r;II)Lf3/m;", "J", "(Lu0/k2;Lt0/c0;Lm2/r;I)Lt0/c0;", "M", "(Lu0/k2;Lt0/e0;Lm2/r;I)Lt0/e0;", "Lt0/j0;", "e", "(Lu0/k2;Lt0/c0;Lt0/e0;Ljava/lang/String;Lm2/r;I)Lt0/j0;", "Lu0/y2;", "Lu0/q;", "a", "Lu0/y2;", "TransformOriginVectorConverter", "Lu0/q1;", "b", "Lu0/q1;", "DefaultAlphaAndScaleSpring", "Landroidx/compose/ui/graphics/Color;", "c", "DefaultColorAnimationSpec", "d", "DefaultOffsetAnimationSpec", "DefaultSizeAnimationSpec", "activeEnter", "activeExit", "animation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final y2<d3, u0.q> f186157a = s3.K(a.f186162b, b.f186163b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final q1<Float> f186158b = u0.m.j(0.0f, 400.0f, null, 5, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final q1<Color> f186159c = u0.m.j(0.0f, 400.0f, null, 5, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final q1<c5.n> f186160d = u0.m.j(0.0f, 400.0f, c5.n.c(g4.c(c5.n.INSTANCE)), 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final q1<c5.r> f186161e = u0.m.j(0.0f, 400.0f, c5.r.b(g4.d(c5.r.INSTANCE)), 1, null);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln3/d3;", "it", "Lu0/q;", "c", "(J)Lu0/q;"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.l<d3, u0.q> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f186162b = new a();

        a() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ u0.q b(d3 d3Var) {
            return c(d3Var.getPackedValue());
        }

        public final u0.q c(long j15) {
            return new u0.q(d3.f(j15), d3.g(j15));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu0/q;", "it", "Ln3/d3;", "c", "(Lu0/q;)J"}, k = 3, mv = {2, 1, 0})
    static final class b extends fr.w implements er.l<u0.q, d3> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f186163b = new b();

        b() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ d3 b(u0.q qVar) {
            return d3.b(c(qVar));
        }

        public final long c(u0.q qVar) {
            return e3.a(qVar.getV1(), qVar.getV2());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lu0/k2$b;", "Lt0/x;", "Lu0/j0;", "", "c", "(Lu0/k2$b;)Lu0/j0;"}, k = 3, mv = {2, 1, 0})
    static final class c extends fr.w implements er.l<k2.b<p114t0.x>, j0<Float>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f186164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e0 f186165c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(c0 c0Var, e0 e0Var) {
            super(1);
            this.f186164b = c0Var;
            this.f186165c = e0Var;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j0<Float> b(k2.b<p114t0.x> bVar) {
            j0<Float> j0VarB;
            j0<Float> j0VarB2;
            p114t0.x xVar = p114t0.x.PreEnter;
            p114t0.x xVar2 = p114t0.x.Visible;
            if (bVar.c(xVar, xVar2)) {
                Fade fade = this.f186164b.getData().getFade();
                return (fade == null || (j0VarB2 = fade.b()) == null) ? a0.f186158b : j0VarB2;
            }
            if (!bVar.c(xVar2, p114t0.x.PostExit)) {
                return a0.f186158b;
            }
            Fade fade2 = this.f186165c.getData().getFade();
            return (fade2 == null || (j0VarB = fade2.b()) == null) ? a0.f186158b : j0VarB;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt0/x;", "it", "", "c", "(Lt0/x;)Ljava/lang/Float;"}, k = 3, mv = {2, 1, 0})
    static final class d extends fr.w implements er.l<p114t0.x, Float> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f186166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e0 f186167c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f186168a;

            static {
                int[] iArr = new int[p114t0.x.values().length];
                try {
                    iArr[p114t0.x.Visible.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[p114t0.x.PreEnter.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[p114t0.x.PostExit.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f186168a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(c0 c0Var, e0 e0Var) {
            super(1);
            this.f186166b = c0Var;
            this.f186167c = e0Var;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float b(p114t0.x xVar) {
            int i15 = a.f186168a[xVar.ordinal()];
            float alpha = 1.0f;
            if (i15 != 1) {
                if (i15 == 2) {
                    Fade fade = this.f186166b.getData().getFade();
                    if (fade != null) {
                        alpha = fade.getAlpha();
                    }
                } else {
                    if (i15 != 3) {
                        throw new oq.p();
                    }
                    Fade fade2 = this.f186167c.getData().getFade();
                    if (fade2 != null) {
                        alpha = fade2.getAlpha();
                    }
                }
            }
            return Float.valueOf(alpha);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln3/a2;", "Loq/i0;", "c", "(Ln3/a2;)V"}, k = 3, mv = {2, 1, 0})
    static final class e extends fr.w implements er.l<a2, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f6<Float> f186169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f6<Float> f186170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f6<d3> f186171d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(f6<Float> f6Var, f6<Float> f6Var2, f6<d3> f6Var3) {
            super(1);
            this.f186169b = f6Var;
            this.f186170c = f6Var2;
            this.f186171d = f6Var3;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(a2 a2Var) {
            c(a2Var);
            return i0.f148189a;
        }

        public final void c(a2 a2Var) {
            f6<Float> f6Var = this.f186169b;
            a2Var.g(f6Var != null ? f6Var.getValue().floatValue() : 1.0f);
            f6<Float> f6Var2 = this.f186170c;
            a2Var.s(f6Var2 != null ? f6Var2.getValue().floatValue() : 1.0f);
            f6<Float> f6Var3 = this.f186170c;
            a2Var.D(f6Var3 != null ? f6Var3.getValue().floatValue() : 1.0f);
            f6<d3> f6Var4 = this.f186171d;
            a2Var.Y0(f6Var4 != null ? f6Var4.getValue().getPackedValue() : d3.INSTANCE.a());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lu0/k2$b;", "Lt0/x;", "Lu0/j0;", "", "c", "(Lu0/k2$b;)Lu0/j0;"}, k = 3, mv = {2, 1, 0})
    static final class f extends fr.w implements er.l<k2.b<p114t0.x>, j0<Float>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f186172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e0 f186173c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(c0 c0Var, e0 e0Var) {
            super(1);
            this.f186172b = c0Var;
            this.f186173c = e0Var;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j0<Float> b(k2.b<p114t0.x> bVar) {
            j0<Float> j0VarA;
            j0<Float> j0VarA2;
            p114t0.x xVar = p114t0.x.PreEnter;
            p114t0.x xVar2 = p114t0.x.Visible;
            if (bVar.c(xVar, xVar2)) {
                Scale scale = this.f186172b.getData().getScale();
                return (scale == null || (j0VarA2 = scale.a()) == null) ? a0.f186158b : j0VarA2;
            }
            if (!bVar.c(xVar2, p114t0.x.PostExit)) {
                return a0.f186158b;
            }
            Scale scale2 = this.f186173c.getData().getScale();
            return (scale2 == null || (j0VarA = scale2.a()) == null) ? a0.f186158b : j0VarA;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt0/x;", "it", "", "c", "(Lt0/x;)Ljava/lang/Float;"}, k = 3, mv = {2, 1, 0})
    static final class g extends fr.w implements er.l<p114t0.x, Float> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f186174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e0 f186175c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f186176a;

            static {
                int[] iArr = new int[p114t0.x.values().length];
                try {
                    iArr[p114t0.x.Visible.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[p114t0.x.PreEnter.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[p114t0.x.PostExit.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f186176a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(c0 c0Var, e0 e0Var) {
            super(1);
            this.f186174b = c0Var;
            this.f186175c = e0Var;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float b(p114t0.x xVar) {
            int i15 = a.f186176a[xVar.ordinal()];
            float scale = 1.0f;
            if (i15 != 1) {
                if (i15 == 2) {
                    Scale scale2 = this.f186174b.getData().getScale();
                    if (scale2 != null) {
                        scale = scale2.getScale();
                    }
                } else {
                    if (i15 != 3) {
                        throw new oq.p();
                    }
                    Scale scale3 = this.f186175c.getData().getScale();
                    if (scale3 != null) {
                        scale = scale3.getScale();
                    }
                }
            }
            return Float.valueOf(scale);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lu0/k2$b;", "Lt0/x;", "Lu0/j0;", "Ln3/d3;", "c", "(Lu0/k2$b;)Lu0/j0;"}, k = 3, mv = {2, 1, 0})
    static final class h extends fr.w implements er.l<k2.b<p114t0.x>, j0<d3>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f186177b = new h();

        h() {
            super(1);
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j0<d3> b(k2.b<p114t0.x> bVar) {
            return u0.m.j(0.0f, 0.0f, null, 7, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt0/x;", "it", "Ln3/d3;", "c", "(Lt0/x;)J"}, k = 3, mv = {2, 1, 0})
    static final class i extends fr.w implements er.l<p114t0.x, d3> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d3 f186178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0 f186179c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e0 f186180d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f186181a;

            static {
                int[] iArr = new int[p114t0.x.values().length];
                try {
                    iArr[p114t0.x.Visible.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[p114t0.x.PreEnter.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[p114t0.x.PostExit.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f186181a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(d3 d3Var, c0 c0Var, e0 e0Var) {
            super(1);
            this.f186178b = d3Var;
            this.f186179c = c0Var;
            this.f186180d = e0Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ d3 b(p114t0.x xVar) {
            return d3.b(c(xVar));
        }

        public final long c(p114t0.x xVar) {
            d3 d3VarB;
            int i15 = a.f186181a[xVar.ordinal()];
            if (i15 != 1) {
                d3VarB = null;
                if (i15 == 2) {
                    Scale scale = this.f186179c.getData().getScale();
                    if (scale != null || (scale = this.f186180d.getData().getScale()) != null) {
                        d3VarB = d3.b(scale.getTransformOrigin());
                    }
                } else {
                    if (i15 != 3) {
                        throw new oq.p();
                    }
                    Scale scale2 = this.f186180d.getData().getScale();
                    if (scale2 != null || (scale2 = this.f186179c.getData().getScale()) != null) {
                        d3VarB = d3.b(scale2.getTransformOrigin());
                    }
                }
            } else {
                d3VarB = this.f186178b;
            }
            return d3VarB != null ? d3VarB.getPackedValue() : d3.INSTANCE.a();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class j extends fr.w implements er.a<Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f186182b = new j();

        j() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean a() {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln3/a2;", "Loq/i0;", "c", "(Ln3/a2;)V"}, k = 3, mv = {2, 1, 0})
    static final class k extends fr.w implements er.l<a2, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f186183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ er.a<Boolean> f186184c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z15, er.a<Boolean> aVar) {
            super(1);
            this.f186183b = z15;
            this.f186184c = aVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(a2 a2Var) {
            c(a2Var);
            return i0.f148189a;
        }

        public final void c(a2 a2Var) {
            a2Var.u(!this.f186183b && this.f186184c.a().booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "c", "(I)Ljava/lang/Integer;"}, k = 3, mv = {2, 1, 0})
    public static final class l extends fr.w implements er.l<Integer, Integer> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l f186185b = new l();

        l() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Integer b(Integer num) {
            return c(num.intValue());
        }

        public final Integer c(int i15) {
            return 0;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc5/r;", "it", "c", "(J)J"}, k = 3, mv = {2, 1, 0})
    static final class m extends fr.w implements er.l<c5.r, c5.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.l<Integer, Integer> f186186b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m(er.l<? super Integer, Integer> lVar) {
            super(1);
            this.f186186b = lVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ c5.r b(c5.r rVar) {
            return c5.r.b(c(rVar.getPackedValue()));
        }

        public final long c(long j15) {
            int iIntValue = this.f186186b.b(Integer.valueOf((int) (j15 >> 32))).intValue();
            return c5.r.c((((long) ((int) (j15 & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (((long) iIntValue) << 32));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc5/r;", "it", "c", "(J)J"}, k = 3, mv = {2, 1, 0})
    static final class n extends fr.w implements er.l<c5.r, c5.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final n f186187b = new n();

        n() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ c5.r b(c5.r rVar) {
            return c5.r.b(c(rVar.getPackedValue()));
        }

        public final long c(long j15) {
            long j16 = 0;
            return c5.r.c((j16 & BodyPartID.bodyIdMax) | (j16 << 32));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "c", "(I)Ljava/lang/Integer;"}, k = 3, mv = {2, 1, 0})
    public static final class o extends fr.w implements er.l<Integer, Integer> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final o f186188b = new o();

        o() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Integer b(Integer num) {
            return c(num.intValue());
        }

        public final Integer c(int i15) {
            return 0;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc5/r;", "it", "c", "(J)J"}, k = 3, mv = {2, 1, 0})
    static final class p extends fr.w implements er.l<c5.r, c5.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.l<Integer, Integer> f186189b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p(er.l<? super Integer, Integer> lVar) {
            super(1);
            this.f186189b = lVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ c5.r b(c5.r rVar) {
            return c5.r.b(c(rVar.getPackedValue()));
        }

        public final long c(long j15) {
            int i15 = (int) (j15 >> 32);
            return c5.r.c((((long) this.f186189b.b(Integer.valueOf((int) (j15 & BodyPartID.bodyIdMax))).intValue()) & BodyPartID.bodyIdMax) | (((long) i15) << 32));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "c", "(I)Ljava/lang/Integer;"}, k = 3, mv = {2, 1, 0})
    public static final class q extends fr.w implements er.l<Integer, Integer> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q f186190b = new q();

        q() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Integer b(Integer num) {
            return c(num.intValue());
        }

        public final Integer c(int i15) {
            return 0;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc5/r;", "it", "c", "(J)J"}, k = 3, mv = {2, 1, 0})
    static final class r extends fr.w implements er.l<c5.r, c5.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.l<Integer, Integer> f186191b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        r(er.l<? super Integer, Integer> lVar) {
            super(1);
            this.f186191b = lVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ c5.r b(c5.r rVar) {
            return c5.r.b(c(rVar.getPackedValue()));
        }

        public final long c(long j15) {
            int iIntValue = this.f186191b.b(Integer.valueOf((int) (j15 >> 32))).intValue();
            return c5.r.c((((long) ((int) (j15 & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (((long) iIntValue) << 32));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc5/r;", "it", "c", "(J)J"}, k = 3, mv = {2, 1, 0})
    static final class s extends fr.w implements er.l<c5.r, c5.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final s f186192b = new s();

        s() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ c5.r b(c5.r rVar) {
            return c5.r.b(c(rVar.getPackedValue()));
        }

        public final long c(long j15) {
            long j16 = 0;
            return c5.r.c((j16 & BodyPartID.bodyIdMax) | (j16 << 32));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "c", "(I)Ljava/lang/Integer;"}, k = 3, mv = {2, 1, 0})
    public static final class t extends fr.w implements er.l<Integer, Integer> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final t f186193b = new t();

        t() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Integer b(Integer num) {
            return c(num.intValue());
        }

        public final Integer c(int i15) {
            return 0;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc5/r;", "it", "c", "(J)J"}, k = 3, mv = {2, 1, 0})
    static final class u extends fr.w implements er.l<c5.r, c5.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.l<Integer, Integer> f186194b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        u(er.l<? super Integer, Integer> lVar) {
            super(1);
            this.f186194b = lVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ c5.r b(c5.r rVar) {
            return c5.r.b(c(rVar.getPackedValue()));
        }

        public final long c(long j15) {
            int i15 = (int) (j15 >> 32);
            return c5.r.c((((long) this.f186194b.b(Integer.valueOf((int) (j15 & BodyPartID.bodyIdMax))).intValue()) & BodyPartID.bodyIdMax) | (((long) i15) << 32));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "c", "(I)Ljava/lang/Integer;"}, k = 3, mv = {2, 1, 0})
    public static final class v extends fr.w implements er.l<Integer, Integer> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final v f186195b = new v();

        v() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Integer b(Integer num) {
            return c(num.intValue());
        }

        public final Integer c(int i15) {
            return Integer.valueOf((-i15) / 2);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc5/r;", "it", "Lc5/n;", "c", "(J)J"}, k = 3, mv = {2, 1, 0})
    static final class w extends fr.w implements er.l<c5.r, c5.n> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.l<Integer, Integer> f186196b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        w(er.l<? super Integer, Integer> lVar) {
            super(1);
            this.f186196b = lVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ c5.n b(c5.r rVar) {
            return c5.n.c(c(rVar.getPackedValue()));
        }

        public final long c(long j15) {
            return c5.n.d((((long) this.f186196b.b(Integer.valueOf((int) (j15 & BodyPartID.bodyIdMax))).intValue()) & BodyPartID.bodyIdMax) | (((long) 0) << 32));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "c", "(I)Ljava/lang/Integer;"}, k = 3, mv = {2, 1, 0})
    public static final class x extends fr.w implements er.l<Integer, Integer> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final x f186197b = new x();

        x() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Integer b(Integer num) {
            return c(num.intValue());
        }

        public final Integer c(int i15) {
            return Integer.valueOf((-i15) / 2);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc5/r;", "it", "Lc5/n;", "c", "(J)J"}, k = 3, mv = {2, 1, 0})
    static final class y extends fr.w implements er.l<c5.r, c5.n> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.l<Integer, Integer> f186198b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        y(er.l<? super Integer, Integer> lVar) {
            super(1);
            this.f186198b = lVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ c5.n b(c5.r rVar) {
            return c5.n.c(c(rVar.getPackedValue()));
        }

        public final long c(long j15) {
            return c5.n.d((((long) this.f186198b.b(Integer.valueOf((int) (j15 & BodyPartID.bodyIdMax))).intValue()) & BodyPartID.bodyIdMax) | (((long) 0) << 32));
        }
    }

    public static /* synthetic */ e0 A(j0 j0Var, f3.c.InterfaceC1317c interfaceC1317c, boolean z15, er.l lVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            j0Var = u0.m.j(0.0f, 400.0f, c5.r.b(g4.d(c5.r.INSTANCE)), 1, null);
        }
        if ((i15 & 2) != 0) {
            interfaceC1317c = f3.c.INSTANCE.a();
        }
        if ((i15 & 4) != 0) {
            z15 = true;
        }
        if ((i15 & 8) != 0) {
            lVar = t.f186193b;
        }
        return z(j0Var, interfaceC1317c, z15, lVar);
    }

    public static final c0 B(j0<c5.n> j0Var, er.l<? super c5.r, c5.n> lVar) {
        return new d0(new TransitionData(null, new Slide(lVar, j0Var), null, null, null, false, null, 125, null));
    }

    public static final c0 C(j0<c5.n> j0Var, er.l<? super Integer, Integer> lVar) {
        return B(j0Var, new w(lVar));
    }

    public static /* synthetic */ c0 D(j0 j0Var, er.l lVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            j0Var = u0.m.j(0.0f, 400.0f, c5.n.c(g4.c(c5.n.INSTANCE)), 1, null);
        }
        if ((i15 & 2) != 0) {
            lVar = v.f186195b;
        }
        return C(j0Var, lVar);
    }

    public static final e0 E(j0<c5.n> j0Var, er.l<? super c5.r, c5.n> lVar) {
        return new f0(new TransitionData(null, new Slide(lVar, j0Var), null, null, null, false, null, 125, null));
    }

    public static final e0 F(j0<c5.n> j0Var, er.l<? super Integer, Integer> lVar) {
        return E(j0Var, new y(lVar));
    }

    public static /* synthetic */ e0 G(j0 j0Var, er.l lVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            j0Var = u0.m.j(0.0f, 400.0f, c5.n.c(g4.c(c5.n.INSTANCE)), 1, null);
        }
        if ((i15 & 2) != 0) {
            lVar = x.f186197b;
        }
        return F(j0Var, lVar);
    }

    private static final f3.c H(f3.c.b bVar) {
        f3.c.Companion companion = f3.c.INSTANCE;
        if (fr.t.c(bVar, companion.k())) {
            return companion.h();
        }
        return fr.t.c(bVar, companion.j()) ? companion.f() : companion.e();
    }

    private static final f3.c I(f3.c.InterfaceC1317c interfaceC1317c) {
        f3.c.Companion companion = f3.c.INSTANCE;
        if (fr.t.c(interfaceC1317c, companion.l())) {
            return companion.m();
        }
        return fr.t.c(interfaceC1317c, companion.a()) ? companion.b() : companion.e();
    }

    public static final c0 J(k2<p114t0.x> k2Var, c0 c0Var, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(21614502, i15, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:1004)");
        }
        boolean z15 = (((i15 & 14) ^ 6) > 4 && rVar.W(k2Var)) || (i15 & 6) == 4;
        Object objE = rVar.E();
        if (z15 || objE == p076m2.r.INSTANCE.a()) {
            objE = c6.e(c0Var, null, 2, null);
            rVar.v(objE);
        }
        a3 a3Var = (a3) objE;
        if (k2Var.p() == k2Var.w() && k2Var.p() == p114t0.x.Visible) {
            if (k2Var.B()) {
                L(a3Var, c0Var);
            } else {
                L(a3Var, c0.INSTANCE.a());
            }
        } else if (k2Var.w() == p114t0.x.Visible) {
            L(a3Var, K(a3Var).c(c0Var));
        }
        c0 c0VarK = K(a3Var);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return c0VarK;
    }

    private static final c0 K(a3<c0> a3Var) {
        return a3Var.getValue();
    }

    private static final void L(a3<c0> a3Var, c0 c0Var) {
        a3Var.setValue(c0Var);
    }

    public static final e0 M(k2<p114t0.x> k2Var, e0 e0Var, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1363864804, i15, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:1024)");
        }
        boolean z15 = (((i15 & 14) ^ 6) > 4 && rVar.W(k2Var)) || (i15 & 6) == 4;
        Object objE = rVar.E();
        if (z15 || objE == p076m2.r.INSTANCE.a()) {
            objE = c6.e(e0Var, null, 2, null);
            rVar.v(objE);
        }
        a3 a3Var = (a3) objE;
        if (k2Var.p() == k2Var.w() && k2Var.p() == p114t0.x.Visible) {
            if (k2Var.B()) {
                O(a3Var, e0Var);
            } else {
                O(a3Var, e0.INSTANCE.a());
            }
        } else if (k2Var.w() != p114t0.x.Visible) {
            O(a3Var, N(a3Var).c(e0Var));
        }
        e0 e0VarN = N(a3Var);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return e0VarN;
    }

    private static final e0 N(a3<e0> a3Var) {
        return a3Var.getValue();
    }

    private static final void O(a3<e0> a3Var, e0 e0Var) {
        a3Var.setValue(e0Var);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x011e A[PHI: r1
      0x011e: PHI (r1v11 t0.c0) = (r1v9 t0.c0), (r1v12 t0.c0) binds: [B:42:0x011c, B:38:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x012a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0133  */
    /* JADX WARN: Code duplicated, block: B:53:0x0139 A[PHI: r2
      0x0139: PHI (r2v10 t0.e0) = (r2v8 t0.e0), (r2v11 t0.e0) binds: [B:52:0x0137, B:48:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x013b  */
    /* JADX WARN: Code duplicated, block: B:57:0x014b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0151  */
    /* JADX WARN: Code duplicated, block: B:65:0x0163  */
    /* JADX WARN: Code duplicated, block: B:67:0x016b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0182  */
    private static final j0 e(final k2<p114t0.x> k2Var, c0 c0Var, e0 e0Var, String str, p076m2.r rVar, int i15) {
        final k2.a aVar;
        final k2.a aVar2;
        c0 c0Var2;
        boolean z15;
        e0 e0Var2;
        boolean z16;
        boolean zG;
        Object objE;
        p076m2.r rVar2 = rVar;
        if (p076m2.t.k()) {
            p076m2.t.o(642253525, i15, -1, "androidx.compose.animation.createGraphicsLayerBlock (EnterExitTransition.kt:1052)");
        }
        boolean z17 = true;
        boolean z18 = (c0Var.getData().getFade() == null && e0Var.getData().getFade() == null) ? false : true;
        boolean z19 = (c0Var.getData().getScale() == null && e0Var.getData().getScale() == null) ? false : true;
        k2.a aVarP = null;
        if (z18) {
            rVar2.X(-703879421);
            y2<Float, u0.p> y2VarP = s3.P(fr.m.f66405a);
            Object objE2 = rVar2.E();
            if (objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = str + " alpha";
                rVar2.v(objE2);
            }
            k2.a aVarP2 = v2.p(k2Var, y2VarP, (String) objE2, rVar2, (i15 & 14) | MLKEMEngine.KyberPolyBytes, 0);
            rVar2 = rVar2;
            rVar2.R();
            aVar = aVarP2;
        } else {
            rVar2.X(-703709976);
            rVar2.R();
            aVar = null;
        }
        if (z19) {
            rVar2.X(-703642333);
            y2<Float, u0.p> y2VarP2 = s3.P(fr.m.f66405a);
            Object objE3 = rVar2.E();
            if (objE3 == p076m2.r.INSTANCE.a()) {
                objE3 = str + " scale";
                rVar2.v(objE3);
            }
            k2.a aVarP3 = v2.p(k2Var, y2VarP2, (String) objE3, rVar2, (i15 & 14) | MLKEMEngine.KyberPolyBytes, 0);
            rVar2.R();
            aVar2 = aVarP3;
        } else {
            rVar2.X(-703472888);
            rVar2.R();
            aVar2 = null;
        }
        if (z19) {
            rVar2.X(-703395232);
            aVarP = v2.p(k2Var, f186157a, "TransformOriginInterruptionHandling", rVar2, (i15 & 14) | MLKEMEngine.KyberPolyBytes, 0);
            rVar2.R();
        } else {
            rVar2.X(-703222904);
            rVar2.R();
        }
        boolean zG2 = rVar2.G(aVar);
        if (((i15 & 112) ^ 48) > 32) {
            c0Var2 = c0Var;
            if (rVar2.W(c0Var2)) {
                z15 = true;
            }
            boolean z25 = zG2 | z15;
            if (((i15 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
                e0Var2 = e0Var;
                if (!rVar2.W(e0Var2)) {
                    z16 = true;
                }
                boolean zG3 = z25 | z16 | rVar2.G(aVar2);
                if ((((i15 & 14) ^ 6) > 4 || !rVar2.W(k2Var)) && (i15 & 6) != 4) {
                }
                zG = zG3 | z17 | rVar2.G(aVarP);
                objE = rVar2.E();
                if (zG || objE == p076m2.r.INSTANCE.a()) {
                    final c0 c0Var3 = c0Var2;
                    final e0 e0Var3 = e0Var2;
                    final k2.a aVar3 = aVarP;
                    j0 j0Var = new j0() { // from class: t0.z
                        @Override // p114t0.j0
                        public final l init() {
                            return a0.f(aVar, aVar2, k2Var, c0Var3, e0Var3, aVar3);
                        }
                    };
                    rVar2.v(j0Var);
                    objE = j0Var;
                }
                j0 j0Var2 = (j0) objE;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                return j0Var2;
            }
            e0Var2 = e0Var;
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 256) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean zG4 = z25 | z16 | rVar2.G(aVar2);
            z17 = ((i15 & 14) ^ 6) > 4 ? false : false;
            zG = zG4 | z17 | rVar2.G(aVarP);
            objE = rVar2.E();
            if (zG) {
                final c0 c0Var4 = c0Var2;
                final e0 e0Var4 = e0Var2;
                final k2.a aVar4 = aVarP;
                j0 j0Var3 = new j0() { // from class: t0.z
                    @Override // p114t0.j0
                    public final l init() {
                        return a0.f(aVar, aVar2, k2Var, c0Var4, e0Var4, aVar4);
                    }
                };
                rVar2.v(j0Var3);
                objE = j0Var3;
            } else {
                final c0 c0Var5 = c0Var2;
                final e0 e0Var5 = e0Var2;
                final k2.a aVar5 = aVarP;
                j0 j0Var4 = new j0() { // from class: t0.z
                    @Override // p114t0.j0
                    public final l init() {
                        return a0.f(aVar, aVar2, k2Var, c0Var5, e0Var5, aVar5);
                    }
                };
                rVar2.v(j0Var4);
                objE = j0Var4;
            }
            j0 j0Var5 = (j0) objE;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            return j0Var5;
        }
        c0Var2 = c0Var;
        if ((i15 & 48) == 32) {
            z15 = true;
        } else {
            z15 = false;
        }
        boolean z26 = zG2 | z15;
        if (((i15 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256) {
            e0Var2 = e0Var;
            if (!rVar2.W(e0Var2)) {
                z16 = true;
            }
            boolean zG5 = z26 | z16 | rVar2.G(aVar2);
            if (((i15 & 14) ^ 6) > 4) {
            }
            zG = zG5 | z17 | rVar2.G(aVarP);
            objE = rVar2.E();
            if (zG) {
                final c0 c0Var6 = c0Var2;
                final e0 e0Var6 = e0Var2;
                final k2.a aVar6 = aVarP;
                j0 j0Var6 = new j0() { // from class: t0.z
                    @Override // p114t0.j0
                    public final l init() {
                        return a0.f(aVar, aVar2, k2Var, c0Var6, e0Var6, aVar6);
                    }
                };
                rVar2.v(j0Var6);
                objE = j0Var6;
            } else {
                final c0 c0Var7 = c0Var2;
                final e0 e0Var7 = e0Var2;
                final k2.a aVar7 = aVarP;
                j0 j0Var7 = new j0() { // from class: t0.z
                    @Override // p114t0.j0
                    public final l init() {
                        return a0.f(aVar, aVar2, k2Var, c0Var7, e0Var7, aVar7);
                    }
                };
                rVar2.v(j0Var7);
                objE = j0Var7;
            }
            j0 j0Var8 = (j0) objE;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            return j0Var8;
        }
        e0Var2 = e0Var;
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 256) {
            z16 = true;
        } else {
            z16 = false;
        }
        boolean zG6 = z26 | z16 | rVar2.G(aVar2);
        if (((i15 & 14) ^ 6) > 4) {
        }
        zG = zG6 | z17 | rVar2.G(aVarP);
        objE = rVar2.E();
        if (zG) {
            final c0 c0Var8 = c0Var2;
            final e0 e0Var8 = e0Var2;
            final k2.a aVar8 = aVarP;
            j0 j0Var9 = new j0() { // from class: t0.z
                @Override // p114t0.j0
                public final l init() {
                    return a0.f(aVar, aVar2, k2Var, c0Var8, e0Var8, aVar8);
                }
            };
            rVar2.v(j0Var9);
            objE = j0Var9;
        } else {
            final c0 c0Var9 = c0Var2;
            final e0 e0Var9 = e0Var2;
            final k2.a aVar9 = aVarP;
            j0 j0Var10 = new j0() { // from class: t0.z
                @Override // p114t0.j0
                public final l init() {
                    return a0.f(aVar, aVar2, k2Var, c0Var9, e0Var9, aVar9);
                }
            };
            rVar2.v(j0Var10);
            objE = j0Var10;
        }
        j0 j0Var11 = (j0) objE;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return j0Var11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    public static final er.l f(k2.a aVar, k2.a aVar2, k2 k2Var, c0 c0Var, e0 e0Var, k2.a aVar3) {
        d3 d3VarB;
        f6 f6VarA = aVar != null ? aVar.a(new c(c0Var, e0Var), new d(c0Var, e0Var)) : null;
        f6 f6VarA2 = aVar2 != null ? aVar2.a(new f(c0Var, e0Var), new g(c0Var, e0Var)) : null;
        if (k2Var.p() == p114t0.x.PreEnter) {
            Scale scale = c0Var.getData().getScale();
            if (scale == null && (scale = e0Var.getData().getScale()) == null) {
                d3VarB = null;
            } else {
                d3VarB = d3.b(scale.getTransformOrigin());
            }
        } else {
            Scale scale2 = e0Var.getData().getScale();
            if (scale2 == null && (scale2 = c0Var.getData().getScale()) == null) {
                d3VarB = null;
            } else {
                d3VarB = d3.b(scale2.getTransformOrigin());
            }
        }
        return new e(f6VarA, f6VarA2, aVar3 != null ? aVar3.a(h.f186177b, new i(d3VarB, c0Var, e0Var)) : null);
    }

    public static final f3.m g(k2<p114t0.x> k2Var, c0 c0Var, e0 e0Var, boolean z15, er.a<Boolean> aVar, String str, p076m2.r rVar, int i15, int i16) {
        er.a<Boolean> aVar2;
        c0 c0Var2;
        e0 e0Var2;
        k2.a aVar3;
        k2.a aVar4;
        ChangeSize changeSize;
        boolean z16 = true;
        boolean z17 = (i16 & 4) != 0 ? true : z15;
        if ((i16 & 8) != 0) {
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = j.f186182b;
                rVar.v(objE);
            }
            aVar2 = (er.a) objE;
        } else {
            aVar2 = aVar;
        }
        if (p076m2.t.k()) {
            p076m2.t.o(-1899614022, i15, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:933)");
        }
        if (z17) {
            rVar.X(-167965831);
            c0 c0VarJ = J(k2Var, c0Var, rVar, i15 & 126);
            rVar.R();
            c0Var2 = c0VarJ;
        } else {
            rVar.X(-167964673);
            rVar.R();
            c0Var2 = c0Var;
        }
        if (z17) {
            rVar.X(-167962954);
            e0 e0VarM = M(k2Var, e0Var, rVar, (i15 & 14) | ((i15 >> 3) & 112));
            rVar.R();
            e0Var2 = e0VarM;
        } else {
            rVar.X(-167961890);
            rVar.R();
            e0Var2 = e0Var;
        }
        c0Var2.getData().g();
        e0Var2.getData().g();
        boolean z18 = (c0Var2.getData().getSlide() == null && e0Var2.getData().getSlide() == null) ? false : true;
        boolean z19 = (c0Var2.getData().getChangeSize() == null && e0Var2.getData().getChangeSize() == null) ? false : true;
        k2.a aVarP = null;
        if (z18) {
            rVar.X(-911488127);
            y2<c5.n, u0.q> y2VarN = s3.N(c5.n.INSTANCE);
            Object objE2 = rVar.E();
            if (objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = str + " slide";
                rVar.v(objE2);
            }
            k2.a aVarP2 = v2.p(k2Var, y2VarN, (String) objE2, rVar, (i15 & 14) | MLKEMEngine.KyberPolyBytes, 0);
            rVar.R();
            aVar3 = aVarP2;
        } else {
            rVar.X(-911382324);
            rVar.R();
            aVar3 = null;
        }
        if (z19) {
            rVar.X(-911290533);
            y2<c5.r, u0.q> y2VarO = s3.O(c5.r.INSTANCE);
            Object objE3 = rVar.E();
            if (objE3 == p076m2.r.INSTANCE.a()) {
                objE3 = str + " shrink/expand";
                rVar.v(objE3);
            }
            k2.a aVarP3 = v2.p(k2Var, y2VarO, (String) objE3, rVar, (i15 & 14) | MLKEMEngine.KyberPolyBytes, 0);
            rVar.R();
            aVar4 = aVarP3;
        } else {
            rVar.X(-911179709);
            rVar.R();
            aVar4 = null;
        }
        if (z19) {
            rVar.X(-911106083);
            y2<c5.n, u0.q> y2VarN2 = s3.N(c5.n.INSTANCE);
            Object objE4 = rVar.E();
            if (objE4 == p076m2.r.INSTANCE.a()) {
                objE4 = str + " InterruptionHandlingOffset";
                rVar.v(objE4);
            }
            aVarP = v2.p(k2Var, y2VarN2, (String) objE4, rVar, (i15 & 14) | MLKEMEngine.KyberPolyBytes, 0);
            rVar.R();
        } else {
            rVar.X(-910935677);
            rVar.R();
        }
        ChangeSize changeSize2 = c0Var2.getData().getChangeSize();
        boolean z25 = ((changeSize2 == null || changeSize2.getClip()) && ((changeSize = e0Var2.getData().getChangeSize()) == null || changeSize.getClip()) && z19) ? false : true;
        c0Var2.getData().g();
        c0Var2.getData().g();
        e0Var2.getData().g();
        e0Var2.getData().g();
        o3.k.f141750a.G();
        rVar.X(-910130296);
        rVar.R();
        f3.m.Companion companion = f3.m.INSTANCE;
        c0Var2.getData().g();
        e0Var2.getData().g();
        c0 c0Var3 = c0Var2;
        e0 e0Var3 = e0Var2;
        j0 j0VarE = e(k2Var, c0Var3, e0Var3, str, rVar, (i15 & 14) | ((i15 >> 6) & 7168));
        f3.m.Companion companion2 = f3.m.INSTANCE;
        boolean zA = rVar.a(z25);
        if ((((57344 & i15) ^ 24576) <= 16384 || !rVar.W(aVar2)) && (i15 & 24576) != 16384) {
            z16 = false;
        }
        boolean z26 = zA | z16;
        Object objE5 = rVar.E();
        if (z26 || objE5 == p076m2.r.INSTANCE.a()) {
            objE5 = new k(z25, aVar2);
            rVar.v(objE5);
        }
        f3.m mVarU = companion2.u(z1.c(companion2, (er.l) objE5)).u(new p114t0.y(k2Var, aVar4, aVarP, aVar3, c0Var3, e0Var3, aVar2, j0VarE)).u(companion);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return mVarU;
    }

    public static final c0 h(j0<c5.r> j0Var, f3.c.b bVar, boolean z15, er.l<? super Integer, Integer> lVar) {
        return j(j0Var, H(bVar), z15, new m(lVar));
    }

    public static /* synthetic */ c0 i(j0 j0Var, f3.c.b bVar, boolean z15, er.l lVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            j0Var = u0.m.j(0.0f, 400.0f, c5.r.b(g4.d(c5.r.INSTANCE)), 1, null);
        }
        if ((i15 & 2) != 0) {
            bVar = f3.c.INSTANCE.j();
        }
        if ((i15 & 4) != 0) {
            z15 = true;
        }
        if ((i15 & 8) != 0) {
            lVar = l.f186185b;
        }
        return h(j0Var, bVar, z15, lVar);
    }

    public static final c0 j(j0<c5.r> j0Var, f3.c cVar, boolean z15, er.l<? super c5.r, c5.r> lVar) {
        return new d0(new TransitionData(null, null, new ChangeSize(cVar, lVar, j0Var, z15), null, null, false, null, 123, null));
    }

    public static /* synthetic */ c0 k(j0 j0Var, f3.c cVar, boolean z15, er.l lVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            j0Var = u0.m.j(0.0f, 400.0f, c5.r.b(g4.d(c5.r.INSTANCE)), 1, null);
        }
        if ((i15 & 2) != 0) {
            cVar = f3.c.INSTANCE.c();
        }
        if ((i15 & 4) != 0) {
            z15 = true;
        }
        if ((i15 & 8) != 0) {
            lVar = n.f186187b;
        }
        return j(j0Var, cVar, z15, lVar);
    }

    public static final c0 l(j0<c5.r> j0Var, f3.c.InterfaceC1317c interfaceC1317c, boolean z15, er.l<? super Integer, Integer> lVar) {
        return j(j0Var, I(interfaceC1317c), z15, new p(lVar));
    }

    public static /* synthetic */ c0 m(j0 j0Var, f3.c.InterfaceC1317c interfaceC1317c, boolean z15, er.l lVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            j0Var = u0.m.j(0.0f, 400.0f, c5.r.b(g4.d(c5.r.INSTANCE)), 1, null);
        }
        if ((i15 & 2) != 0) {
            interfaceC1317c = f3.c.INSTANCE.a();
        }
        if ((i15 & 4) != 0) {
            z15 = true;
        }
        if ((i15 & 8) != 0) {
            lVar = o.f186188b;
        }
        return l(j0Var, interfaceC1317c, z15, lVar);
    }

    public static final c0 n(j0<Float> j0Var, float f15) {
        return new d0(new TransitionData(new Fade(f15, j0Var), null, null, null, null, false, null, 126, null));
    }

    public static /* synthetic */ c0 o(j0 j0Var, float f15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            j0Var = u0.m.j(0.0f, 400.0f, null, 5, null);
        }
        if ((i15 & 2) != 0) {
            f15 = 0.0f;
        }
        return n(j0Var, f15);
    }

    public static final e0 p(j0<Float> j0Var, float f15) {
        return new f0(new TransitionData(new Fade(f15, j0Var), null, null, null, null, false, null, 126, null));
    }

    public static /* synthetic */ e0 q(j0 j0Var, float f15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            j0Var = u0.m.j(0.0f, 400.0f, null, 5, null);
        }
        if ((i15 & 2) != 0) {
            f15 = 0.0f;
        }
        return p(j0Var, f15);
    }

    public static final c0 r(j0<Float> j0Var, float f15, long j15) {
        return new d0(new TransitionData(null, null, null, new Scale(f15, j15, j0Var, null), null, false, null, 119, null));
    }

    public static /* synthetic */ c0 s(j0 j0Var, float f15, long j15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            j0Var = u0.m.j(0.0f, 400.0f, null, 5, null);
        }
        if ((i15 & 2) != 0) {
            f15 = 0.0f;
        }
        if ((i15 & 4) != 0) {
            j15 = d3.INSTANCE.a();
        }
        return r(j0Var, f15, j15);
    }

    public static final e0 t(j0<Float> j0Var, float f15, long j15) {
        return new f0(new TransitionData(null, null, null, new Scale(f15, j15, j0Var, null), null, false, null, 119, null));
    }

    public static /* synthetic */ e0 u(j0 j0Var, float f15, long j15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            j0Var = u0.m.j(0.0f, 400.0f, null, 5, null);
        }
        if ((i15 & 2) != 0) {
            f15 = 0.0f;
        }
        if ((i15 & 4) != 0) {
            j15 = d3.INSTANCE.a();
        }
        return t(j0Var, f15, j15);
    }

    public static final e0 v(j0<c5.r> j0Var, f3.c.b bVar, boolean z15, er.l<? super Integer, Integer> lVar) {
        return x(j0Var, H(bVar), z15, new r(lVar));
    }

    public static /* synthetic */ e0 w(j0 j0Var, f3.c.b bVar, boolean z15, er.l lVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            j0Var = u0.m.j(0.0f, 400.0f, c5.r.b(g4.d(c5.r.INSTANCE)), 1, null);
        }
        if ((i15 & 2) != 0) {
            bVar = f3.c.INSTANCE.j();
        }
        if ((i15 & 4) != 0) {
            z15 = true;
        }
        if ((i15 & 8) != 0) {
            lVar = q.f186190b;
        }
        return v(j0Var, bVar, z15, lVar);
    }

    public static final e0 x(j0<c5.r> j0Var, f3.c cVar, boolean z15, er.l<? super c5.r, c5.r> lVar) {
        return new f0(new TransitionData(null, null, new ChangeSize(cVar, lVar, j0Var, z15), null, null, false, null, 123, null));
    }

    public static /* synthetic */ e0 y(j0 j0Var, f3.c cVar, boolean z15, er.l lVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            j0Var = u0.m.j(0.0f, 400.0f, c5.r.b(g4.d(c5.r.INSTANCE)), 1, null);
        }
        if ((i15 & 2) != 0) {
            cVar = f3.c.INSTANCE.c();
        }
        if ((i15 & 4) != 0) {
            z15 = true;
        }
        if ((i15 & 8) != 0) {
            lVar = s.f186192b;
        }
        return x(j0Var, cVar, z15, lVar);
    }

    public static final e0 z(j0<c5.r> j0Var, f3.c.InterfaceC1317c interfaceC1317c, boolean z15, er.l<? super Integer, Integer> lVar) {
        return x(j0Var, I(interfaceC1317c), z15, new u(lVar));
    }
}
