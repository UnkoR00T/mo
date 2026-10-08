package h2;

import androidx.compose.ui.graphics.Color;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.Typography;
import p046f2.fg;
import p046f2.h4;
import p046f2.hd;
import p046f2.hn;
import p046f2.of;
import p046f2.sn;
import p046f2.tn;
import p046f2.un;
import p071kotlin.Metadata;
import p076m2.c6;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.x5;
import p114t0.Function1;
import q4.TextStyle;
import q4.c4;
import u0.s3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\b\u001aé\u0001\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001ay\u0010+\u001a\u00020\u00052\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\tH\u0003¢\u0006\u0004\b+\u0010,\u001a-\u00100\u001a\u00020\u00052\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020'2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b0\u00101\u001a%\u00102\u001a\u00020\u00052\u0006\u0010.\u001a\u00020-2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b2\u00103\u001a#\u00107\u001a\u000204*\u0002042\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0004\b7\u00108\u001a!\u0010;\u001a\u000204*\u0002042\f\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u0004H\u0000¢\u0006\u0004\b;\u0010<\u001a'\u0010>\u001a\b\u0012\u0004\u0012\u00020 0\u001f*\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010=\u001a\u00020\u0012H\u0003¢\u0006\u0004\b>\u0010?\u001a'\u0010@\u001a\b\u0012\u0004\u0012\u00020 0\u001f*\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010=\u001a\u00020\u0012H\u0003¢\u0006\u0004\b@\u0010?\u001a'\u0010A\u001a\b\u0012\u0004\u0012\u00020 0\u001f*\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010=\u001a\u00020\u0012H\u0003¢\u0006\u0004\bA\u0010?\u001a/\u0010D\u001a\b\u0012\u0004\u0012\u00020-0\u001f*\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010B\u001a\u00020-2\u0006\u0010C\u001a\u00020-H\u0003¢\u0006\u0004\bD\u0010E\u001a'\u0010G\u001a\b\u0012\u0004\u0012\u00020-0\u001f*\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010F\u001a\u00020-H\u0003¢\u0006\u0004\bG\u0010H\u001a\u000f\u0010I\u001a\u000209H\u0001¢\u0006\u0004\bI\u0010J\u001a\u000f\u0010K\u001a\u000209H\u0001¢\u0006\u0004\bK\u0010J\"\u001a\u0010P\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u001a\u0010S\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\bQ\u0010M\u001a\u0004\bR\u0010O\"\u001a\u0010V\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010M\u001a\u0004\bU\u0010O\"\u001a\u0010Y\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\bW\u0010M\u001a\u0004\bX\u0010O\"\u001a\u0010\\\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010M\u001a\u0004\b[\u0010O\"\u001a\u0010_\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b]\u0010M\u001a\u0004\b^\u0010O\"\u001a\u0010b\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b`\u0010M\u001a\u0004\ba\u0010O\"\u001a\u0010e\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\bc\u0010M\u001a\u0004\bd\u0010O\"\u0018\u0010=\u001a\u00020\u0012*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bf\u0010g\"\u0018\u0010k\u001a\u00020h*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bi\u0010j\"\u0018\u0010m\u001a\u00020h*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bl\u0010j¨\u0006p²\u0006\f\u0010n\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\f\u0010o\u001a\u00020\u00128\nX\u008a\u0084\u0002"}, d2 = {"Lh2/h3;", "type", "", "visualText", "Lkotlin/Function0;", "Loq/i0;", "innerTextField", "Lf2/tn;", "labelPosition", "Lkotlin/Function1;", "Lf2/un;", AnnotatedPrivateKey.LABEL, "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "", "singleLine", "enabled", "isError", "Lb1/j;", "interactionSource", "Ld1/d3;", "contentPadding", "Lf2/hn;", "colors", "container", "C", "(Lh2/h3;Ljava/lang/CharSequence;Ler/p;Lf2/tn;Ler/q;Ler/p;Ler/p;Ler/p;Ler/p;Ler/p;Ler/p;ZZZLb1/j;Ld1/d3;Lf2/hn;Ler/p;Lm2/r;II)V", "Lm2/f6;", "", "labelProgress", "isFocused", "overrideLabelTextStyleColor", "Lu0/k2;", "Lh2/k1;", "transition", "Lq4/b4;", "bodySmall", "bodyLarge", "content", "V", "(Lm2/f6;Lf2/hn;ZZZZLu0/k2;Lq4/b4;Lq4/b4;Ler/q;Lm2/r;I)V", "Landroidx/compose/ui/graphics/Color;", "contentColor", "textStyle", "Y", "(JLq4/b4;Ler/p;Lm2/r;I)V", "Z", "(JLer/p;Lm2/r;I)V", "Lf3/m;", "", "defaultErrorMessage", "e0", "(Lf3/m;ZLjava/lang/String;)Lf3/m;", "Lc5/h;", "minHeight", "B0", "(Lf3/m;Ler/a;)Lf3/m;", "showExpandedLabel", "t0", "(Lu0/k2;ZLm2/r;I)Lm2/f6;", "y0", "c0", "focusedLabelTextStyleColor", "unfocusedLabelTextStyleColor", "v0", "(Lu0/k2;JJLm2/r;I)Lm2/f6;", "labelColor", "r0", "(Lu0/k2;JLm2/r;I)Lm2/f6;", "A0", "(Lm2/r;I)F", "x0", "a", "F", "q0", "()F", "TextFieldPadding", "b", "h0", "AboveLabelHorizontalPadding", "c", "g0", "AboveLabelBottomPadding", "d", "p0", "SupportingTopPadding", "e", "n0", "PrefixSuffixTextPadding", "f", "l0", "MinTextLineHeight", "g", "j0", "MinFocusedLabelLineHeight", "h", "k0", "MinSupportingTextLineHeight", "o0", "(Lf2/tn;)Z", "Lf3/c$b;", "m0", "(Lf2/tn;)Lf3/c$b;", "minimizedAlignment", "i0", "expandedAlignment", "showPlaceholder", "showAffix", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f79775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f79776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f79777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f79778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f79779e = c5.h.n(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f79780f = c5.h.n(24);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f79781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f79782h;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"h2/g3$b", "Lf2/un;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements un {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f6<Float> f79783a;

        b(f6<Float> f6Var) {
            this.f79783a = f6Var;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f79784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f79785b;

        static {
            int[] iArr = new int[h3.values().length];
            try {
                iArr[h3.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h3.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f79784a = iArr;
            int[] iArr2 = new int[k1.values().length];
            try {
                iArr2[k1.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[k1.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[k1.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f79785b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d implements er.a<k1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u0.k2 f79786a;

        public d(u0.k2 k2Var) {
            this.f79786a = k2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [h2.k1, java.lang.Object] */
        @Override // er.a
        public final k1 a() {
            return this.f79786a.w();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class e implements er.a<u0.k2.b<k1>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u0.k2 f79787a;

        public e(u0.k2 k2Var) {
            this.f79787a = k2Var;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final u0.k2.b<k1> a() {
            return this.f79787a.u();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class f implements er.a<k1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u0.k2 f79788a;

        public f(u0.k2 k2Var) {
            this.f79788a = k2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [h2.k1, java.lang.Object] */
        @Override // er.a
        public final k1 a() {
            return this.f79788a.w();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class g implements er.a<u0.k2.b<k1>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u0.k2 f79789a;

        public g(u0.k2 k2Var) {
            this.f79789a = k2Var;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final u0.k2.b<k1> a() {
            return this.f79789a.u();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class h implements er.a<k1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u0.k2 f79790a;

        public h(u0.k2 k2Var) {
            this.f79790a = k2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [h2.k1, java.lang.Object] */
        @Override // er.a
        public final k1 a() {
            return this.f79790a.w();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class i implements er.a<u0.k2.b<k1>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u0.k2 f79791a;

        public i(u0.k2 k2Var) {
            this.f79791a = k2Var;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final u0.k2.b<k1> a() {
            return this.f79791a.u();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class j implements er.a<k1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u0.k2 f79792a;

        public j(u0.k2 k2Var) {
            this.f79792a = k2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [h2.k1, java.lang.Object] */
        @Override // er.a
        public final k1 a() {
            return this.f79792a.w();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class k implements er.a<u0.k2.b<k1>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u0.k2 f79793a;

        public k(u0.k2 k2Var) {
            this.f79793a = k2Var;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final u0.k2.b<k1> a() {
            return this.f79793a.u();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class l implements er.a<k1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u0.k2 f79794a;

        public l(u0.k2 k2Var) {
            this.f79794a = k2Var;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [h2.k1, java.lang.Object] */
        @Override // er.a
        public final k1 a() {
            return this.f79794a.w();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class m implements er.a<u0.k2.b<k1>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u0.k2 f79795a;

        public m(u0.k2 k2Var) {
            this.f79795a = k2Var;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final u0.k2.b<k1> a() {
            return this.f79795a.u();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class n implements h1, fr.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ er.a f79796a;

        n(er.a aVar) {
            this.f79796a = aVar;
        }

        @Override // h2.h1
        public final /* synthetic */ float a() {
            return ((Number) this.f79796a.a()).floatValue();
        }

        @Override // fr.n
        public final oq.e<?> b() {
            return this.f79796a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof h1) && (obj instanceof fr.n)) {
                return fr.t.c(b(), ((fr.n) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    static {
        float f15 = 16;
        f79775a = c5.h.n(f15);
        float f16 = 4;
        f79776b = c5.h.n(f16);
        f79777c = c5.h.n(f16);
        f79778d = c5.h.n(f16);
        f79781g = c5.h.n(f15);
        f79782h = c5.h.n(f15);
    }

    public static final float A0(p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1986450462, i15, -1, "androidx.compose.material3.internal.textFieldHorizontalIconPadding (TextFieldImpl.kt:505)");
        }
        float value = ((c5.h) rVar.N(hd.f())).getValue();
        if (Float.isNaN(value)) {
            value = c5.h.n(0);
        }
        float fN = c5.h.n(lr.m.d(c5.h.n(c5.h.n(value - l2.a1.f114275a.d()) / 2), c5.h.n(0)));
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return fN;
    }

    public static final f3.m B0(f3.m mVar, final er.a<c5.h> aVar) {
        return p036e4.m0.a(mVar, new er.q() { // from class: h2.u2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return g3.C0(aVar, (p036e4.y0) obj, (p036e4.v0) obj2, (c5.b) obj3);
            }
        });
    }

    public static final void C(final h3 h3Var, final CharSequence charSequence, final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar, final tn tnVar, final er.q<? super un, ? super p076m2.r, ? super Integer, oq.i0> qVar, final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar2, final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar3, final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar4, final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar5, final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar6, final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar7, final boolean z15, final boolean z16, final boolean z17, final b1.j jVar, final d1.d3 d3Var, final hn hnVar, final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar8, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        int i18;
        int i19;
        p076m2.r rVar2;
        k1 k1Var;
        int i25;
        final f6<Float> f6VarT0;
        final f6<Float> f6VarY0;
        f6<Float> f6VarC0;
        p076m2.r rVar3;
        final boolean z18;
        boolean z19;
        final hn hnVar2;
        y2.f fVar;
        y2.f fVarD;
        y2.f fVarD2;
        y2.f fVar2;
        y2.f fVarD3;
        y2.f fVarD4;
        y2.f fVar3;
        p076m2.r rVarH = rVar.h(546805032);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.c(h3Var.ordinal()) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 = i17 | (rVarH.G(charSequence) ? 32 : 16);
        } else {
            i18 = i17;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i18 |= rVarH.G(pVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i18 |= rVarH.W(tnVar) ? 2048 : 1024;
        }
        int i26 = i15 & 24576;
        int i27 = PKIFailureInfo.certRevoked;
        if (i26 == 0) {
            i18 |= rVarH.G(qVar) ? 16384 : 8192;
        }
        int i28 = i15 & 196608;
        int i29 = PKIFailureInfo.notAuthorized;
        if (i28 == 0) {
            i18 |= rVarH.G(pVar2) ? 131072 : 65536;
        }
        int i35 = i15 & 1572864;
        int i36 = PKIFailureInfo.signerNotTrusted;
        if (i35 == 0) {
            i18 |= rVarH.G(pVar3) ? 1048576 : 524288;
        }
        if ((i15 & 12582912) == 0) {
            i18 |= rVarH.G(pVar4) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i18 |= rVarH.G(pVar5) ? 67108864 : 33554432;
        }
        if ((i15 & 805306368) == 0) {
            i18 |= rVarH.G(pVar6) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i37 = i18;
        if ((i16 & 6) == 0) {
            i19 = i16 | (rVarH.G(pVar7) ? 4 : 2);
        } else {
            i19 = i16;
        }
        if ((i16 & 48) == 0) {
            i19 |= rVarH.a(z15) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i19 |= rVarH.a(z16) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i19 |= rVarH.a(z17) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            if (rVarH.W(jVar)) {
                i27 = 16384;
            }
            i19 |= i27;
        }
        if ((i16 & 196608) == 0) {
            if (rVarH.W(d3Var)) {
                i29 = 131072;
            }
            i19 |= i29;
        }
        if ((i16 & 1572864) == 0) {
            if (rVarH.W(hnVar)) {
                i36 = 1048576;
            }
            i19 |= i36;
        }
        if ((i16 & 12582912) == 0) {
            i19 |= rVarH.G(pVar8) ? 8388608 : 4194304;
        }
        int i38 = i19;
        if (rVarH.r(((i37 & 306783379) == 306783378 && (4793491 & i38) == 4793490) ? false : true, i37 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(546805032, i37, i38, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:94)");
            }
            boolean zBooleanValue = b1.f.a(jVar, rVarH, (i38 >> 12) & 14).getValue().booleanValue();
            if (zBooleanValue) {
                k1Var = k1.Focused;
            } else {
                k1Var = charSequence.length() == 0 ? k1.UnfocusedEmpty : k1.UnfocusedNotEmpty;
            }
            Typography typographyE = androidx.compose.material3.d.f9816a.e(rVarH, 6);
            final TextStyle bodyLarge = typographyE.getBodyLarge();
            final TextStyle bodySmall = typographyE.getBodySmall();
            long j15 = bodyLarge.j();
            Color.Companion companion = Color.INSTANCE;
            final boolean z25 = (Color.m11equalsimpl0(j15, companion.h()) && !Color.m11equalsimpl0(bodySmall.j(), companion.h())) || (!Color.m11equalsimpl0(bodyLarge.j(), companion.h()) && Color.m11equalsimpl0(bodySmall.j(), companion.h()));
            final u0.k2 k2VarX = u0.v2.x(k1Var, "TextFieldInputState", rVarH, 48, 0);
            boolean z26 = qVar != null && o0(tnVar);
            if (qVar != null) {
                rVarH.X(-940723593);
                i25 = 0;
                f6VarT0 = t0(k2VarX, z26, rVarH, 0);
                rVarH.R();
            } else {
                i25 = 0;
                rVarH.X(-940652386);
                rVarH.R();
                f6VarT0 = null;
            }
            if (pVar2 != null) {
                rVarH.X(-940561742);
                f6VarY0 = y0(k2VarX, z26, rVarH, i25);
                rVarH.R();
            } else {
                rVarH.X(-940485730);
                rVarH.R();
                f6VarY0 = null;
            }
            if (pVar5 == null && pVar6 == null) {
                rVarH.X(-940318082);
                rVarH.R();
                f6VarC0 = null;
            } else {
                rVarH.X(-940388328);
                f6VarC0 = c0(k2VarX, z26, rVarH, 0);
                rVarH.R();
            }
            if (qVar == null) {
                rVarH.X(-940231841);
                rVarH.R();
                rVar3 = rVarH;
                z18 = zBooleanValue;
                fVar = null;
                z19 = false;
                hnVar2 = hnVar;
            } else {
                rVarH.X(-940231840);
                rVar3 = rVarH;
                z18 = zBooleanValue;
                z19 = false;
                hnVar2 = hnVar;
                y2.f fVarD5 = y2.m.d(1632654811, true, new er.p() { // from class: h2.e2
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return g3.D(f6VarT0, hnVar2, z16, z17, z18, z25, k2VarX, bodySmall, bodyLarge, qVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar3, 54);
                rVar3.R();
                fVar = fVarD5;
            }
            final f6<Float> f6Var = f6VarC0;
            final long jK = hnVar2.k(r13, r14, z18);
            Object objE = rVar3.E();
            p076m2.r.Companion companion2 = p076m2.r.INSTANCE;
            y2.f fVar4 = fVar;
            if (objE == companion2.a()) {
                objE = x5.e(x5.r(), new er.a() { // from class: h2.d3
                    @Override // er.a
                    public final Object a() {
                        return Boolean.valueOf(g3.E(f6VarY0));
                    }
                });
                rVar3.v(objE);
            }
            f6 f6Var2 = (f6) objE;
            if (pVar2 != null && charSequence.length() == 0 && N(f6Var2)) {
                rVar3.X(-939160356);
                fVarD = y2.m.d(-720601610, true, new er.q() { // from class: h2.e3
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return g3.O(jK, bodyLarge, pVar2, (f3.m) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVar3, 54);
                rVar3.R();
            } else {
                rVar3.X(-938848683);
                rVar3.R();
                fVarD = null;
            }
            final long jL = hnVar2.l(r13, r14, z18);
            Object objE2 = rVar3.E();
            if (objE2 == companion2.a()) {
                objE2 = x5.e(x5.r(), new er.a() { // from class: h2.f3
                    @Override // er.a
                    public final Object a() {
                        return Boolean.valueOf(g3.P(f6Var));
                    }
                });
                rVar3.v(objE2);
            }
            f6 f6Var3 = (f6) objE2;
            if (pVar5 == null || !Q(f6Var3)) {
                rVar3.X(-938405259);
                rVar3.R();
                fVarD2 = null;
            } else {
                rVar3.X(-938552601);
                fVarD2 = y2.m.d(-1271185508, true, new er.p() { // from class: h2.f2
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return g3.R(jL, bodyLarge, pVar5, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar3, 54);
                rVar3.R();
            }
            y2.f fVar5 = fVarD;
            final long jM = hnVar2.m(r13, r14, z18);
            if (pVar6 == null || !Q(f6Var3)) {
                rVar3.X(-938084843);
                rVar3.R();
                fVar2 = null;
            } else {
                rVar3.X(-938232185);
                y2.f fVarD6 = y2.m.d(123777469, true, new er.p() { // from class: h2.g2
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return g3.S(jM, bodyLarge, pVar6, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar3, 54);
                rVar3.R();
                fVar2 = fVarD6;
            }
            final long j16 = hnVar2.j(r13, r14, z18);
            if (pVar3 == null) {
                rVar3.X(-937922124);
                rVar3.R();
                fVarD3 = null;
            } else {
                rVar3.X(-937922123);
                fVarD3 = y2.m.d(-906968406, true, new er.p() { // from class: h2.h2
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return g3.T(j16, pVar3, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar3, 54);
                rVar3.R();
            }
            final long jQ = hnVar2.q(r13, r14, z18);
            if (pVar4 == null) {
                rVar3.X(-937662189);
                rVar3.R();
                fVarD4 = null;
            } else {
                rVar3.X(-937662188);
                fVarD4 = y2.m.d(-1287792574, true, new er.p() { // from class: h2.i2
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return g3.U(jQ, pVar4, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar3, 54);
                rVar3.R();
            }
            final long jN = hnVar2.n(z16, z17, z18);
            if (pVar7 == null) {
                rVar3.X(-937391714);
                rVar3.R();
                fVar3 = null;
            } else {
                rVar3.X(-937391713);
                y2.f fVarD7 = y2.m.d(-1612592437, true, new er.p() { // from class: h2.j2
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return g3.F(jN, bodySmall, pVar7, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar3, 54);
                rVar3.R();
                fVar3 = fVarD7;
            }
            final f6<Float> f6Var4 = f6VarT0;
            boolean zW = rVar3.W(f6Var4);
            Object objE3 = rVar3.E();
            if (zW || objE3 == companion2.a()) {
                objE3 = new er.a() { // from class: h2.k2
                    @Override // er.a
                    public final Object a() {
                        return Float.valueOf(g3.G(f6Var4));
                    }
                };
                rVar3.v(objE3);
            }
            final er.a aVar = (er.a) objE3;
            boolean zW2 = rVar3.W(f6VarY0);
            Object objE4 = rVar3.E();
            if (zW2 || objE4 == companion2.a()) {
                objE4 = new er.a() { // from class: h2.p2
                    @Override // er.a
                    public final Object a() {
                        return Float.valueOf(g3.H(f6VarY0));
                    }
                };
                rVar3.v(objE4);
            }
            er.a aVar2 = (er.a) objE4;
            boolean zW3 = rVar3.W(f6Var);
            Object objE5 = rVar3.E();
            if (zW3 || objE5 == companion2.a()) {
                objE5 = new er.a() { // from class: h2.y2
                    @Override // er.a
                    public final Object a() {
                        return Float.valueOf(g3.I(f6Var));
                    }
                };
                rVar3.v(objE5);
            }
            er.a aVar3 = (er.a) objE5;
            int i39 = c.f79784a[h3Var.ordinal()];
            if (i39 == 1) {
                rVar3.X(-936973554);
                p076m2.r rVar4 = rVar3;
                sn.c(f3.m.INSTANCE, pVar, fVar4, fVar5, fVarD3, fVarD4, fVarD2, fVar2, z15, tnVar, new n(aVar), new n(aVar2), new n(aVar3), y2.m.d(-358432442, true, new er.p() { // from class: h2.z2
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return g3.J(pVar8, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar3, 54), fVar3, d3Var, rVar4, ((i37 >> 3) & 112) | 6 | ((i38 << 21) & 234881024) | ((i37 << 18) & 1879048192), (i38 & 458752) | 3072);
                rVar2 = rVar4;
                rVar2.R();
                oq.i0 i0Var = oq.i0.f148189a;
            } else {
                if (i39 != 2) {
                    rVar3.X(1493796415);
                    rVar3.R();
                    throw new oq.p();
                }
                rVar3.X(-935939642);
                Object objE6 = rVar3.E();
                if (objE6 == companion2.a()) {
                    objE6 = c6.e(m3.k.c(m3.k.INSTANCE.b()), null, 2, null);
                    rVar3.v(objE6);
                }
                final p076m2.a3 a3Var = (p076m2.a3) objE6;
                y2.f fVar6 = fVarD2;
                y2.f fVar7 = fVar2;
                y2.f fVarD8 = y2.m.d(-403938615, true, new er.p() { // from class: h2.a3
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return g3.K(a3Var, tnVar, d3Var, pVar8, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar3, 54);
                f3.m.Companion companion3 = f3.m.INSTANCE;
                n nVar = new n(aVar);
                n nVar2 = new n(aVar2);
                n nVar3 = new n(aVar3);
                boolean zW4 = rVar3.W(aVar) | ((i37 & 7168) == 2048 ? true : z19);
                Object objE7 = rVar3.E();
                if (zW4 || objE7 == companion2.a()) {
                    objE7 = new er.l() { // from class: h2.b3
                        @Override // er.l
                        public final Object b(Object obj) {
                            return g3.L(tnVar, aVar, a3Var, (m3.k) obj);
                        }
                    };
                    rVar3.v(objE7);
                }
                p076m2.r rVar5 = rVar3;
                fg.o(companion3, pVar, fVar5, fVar4, fVarD3, fVarD4, fVar6, fVar7, z15, tnVar, nVar, nVar2, nVar3, (er.l) objE7, fVarD8, fVar3, d3Var, rVar5, ((i37 >> 3) & 112) | 6 | ((i38 << 21) & 234881024) | ((i37 << 18) & 1879048192), (3670016 & (i38 << 3)) | 24576);
                rVar2 = rVar5;
                rVar2.R();
                oq.i0 i0Var2 = oq.i0.f148189a;
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: h2.c3
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g3.M(h3Var, charSequence, pVar, tnVar, qVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, z15, z16, z17, jVar, d3Var, hnVar, pVar8, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p036e4.x0 C0(er.a aVar, p036e4.y0 y0Var, p036e4.v0 v0Var, c5.b bVar) {
        float value = ((c5.h) aVar.a()).getValue();
        final p036e4.a2 a2VarO0 = v0Var.o0(c5.b.d(bVar.getValue(), 0, 0, c5.c.f(bVar.getValue(), !c5.h.p(value, c5.h.INSTANCE.c()) ? y0Var.X0(value) : 0), 0, 11, null));
        return p036e4.y0.j2(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight(), null, new er.l() { // from class: h2.w2
            @Override // er.l
            public final Object b(Object obj) {
                return g3.D0(a2VarO0, (e4.a2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(f6 f6Var, hn hnVar, boolean z15, boolean z16, boolean z17, boolean z18, u0.k2 k2Var, TextStyle textStyle, TextStyle textStyle2, er.q qVar, p076m2.r rVar, int i15) throws Throwable {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1632654811, i15, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:138)");
            }
            V(f6Var, hnVar, z15, z16, z17, z18, k2Var, textStyle, textStyle2, qVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D0(p036e4.a2 a2Var, e4.a2.a aVar) {
        e4.a2.a.E(aVar, a2Var, 0, 0, 0.0f, 4, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E(f6 f6Var) {
        return (f6Var != null ? ((Number) f6Var.getValue()).floatValue() : 0.0f) > 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(long j15, TextStyle textStyle, er.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1612592437, i15, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:207)");
            }
            Y(j15, textStyle, pVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float G(f6 f6Var) {
        if (f6Var != null) {
            return ((Number) f6Var.getValue()).floatValue();
        }
        return 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float H(f6 f6Var) {
        if (f6Var != null) {
            return ((Number) f6Var.getValue()).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float I(f6 f6Var) {
        if (f6Var != null) {
            return ((Number) f6Var.getValue()).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J(er.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-358432442, i15, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:217)");
            }
            f3.m mVarB = p036e4.f0.b(f3.m.INSTANCE, "Container");
            p036e4.w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), true);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarB);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            pVar.B(rVar, 0);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(p076m2.a3 a3Var, tn tnVar, d1.d3 d3Var, er.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-403938615, i15, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:243)");
            }
            f3.m mVarR = fg.r(p036e4.f0.b(f3.m.INSTANCE, "Container"), new fr.z(a3Var) { // from class: h2.g3.a
                @Override // mr.m
                public Object get() {
                    return ((p076m2.a3) this.f66391b).getValue();
                }
            }, m0(tnVar), d3Var);
            p036e4.w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), true);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            pVar.B(rVar, 0);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(tn tnVar, er.a aVar, p076m2.a3 a3Var, m3.k kVar) {
        if (tnVar instanceof tn.a) {
            return oq.i0.f148189a;
        }
        float fFloatValue = ((Number) aVar.a()).floatValue();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (kVar.getPackedValue() >> 32)) * fFloatValue;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (kVar.getPackedValue() & BodyPartID.bodyIdMax)) * fFloatValue;
        if (Float.intBitsToFloat((int) (((m3.k) a3Var.getValue()).getPackedValue() >> 32)) != fIntBitsToFloat || Float.intBitsToFloat((int) (((m3.k) a3Var.getValue()).getPackedValue() & BodyPartID.bodyIdMax)) != fIntBitsToFloat2) {
            a3Var.setValue(m3.k.c(m3.k.d((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & BodyPartID.bodyIdMax))));
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M(h3 h3Var, CharSequence charSequence, er.p pVar, tn tnVar, er.q qVar, er.p pVar2, er.p pVar3, er.p pVar4, er.p pVar5, er.p pVar6, er.p pVar7, boolean z15, boolean z16, boolean z17, b1.j jVar, d1.d3 d3Var, hn hnVar, er.p pVar8, int i15, int i16, p076m2.r rVar, int i17) {
        C(h3Var, charSequence, pVar, tnVar, qVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, z15, z16, z17, jVar, d3Var, hnVar, pVar8, rVar, g4.a(i15 | 1), g4.a(i16));
        return oq.i0.f148189a;
    }

    private static final boolean N(f6<Boolean> f6Var) {
        return f6Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(long j15, TextStyle textStyle, er.p pVar, f3.m mVar, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(mVar) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-720601610, i15, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:162)");
            }
            p036e4.w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVar);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            Y(j15, textStyle, pVar, rVar, 0);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean P(f6 f6Var) {
        return (f6Var != null ? ((Number) f6Var.getValue()).floatValue() : 0.0f) > 0.0f;
    }

    private static final boolean Q(f6<Boolean> f6Var) {
        return f6Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(long j15, TextStyle textStyle, er.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1271185508, i15, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:179)");
            }
            Y(j15, textStyle, pVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S(long j15, TextStyle textStyle, er.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(123777469, i15, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:187)");
            }
            Y(j15, textStyle, pVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T(long j15, er.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-906968406, i15, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:194)");
            }
            Z(j15, pVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(long j15, er.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1287792574, i15, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:200)");
            }
            Z(j15, pVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    private static final void V(final f6<Float> f6Var, final hn hnVar, final boolean z15, final boolean z16, final boolean z17, final boolean z18, u0.k2<k1> k2Var, final TextStyle textStyle, final TextStyle textStyle2, final er.q<? super un, ? super p076m2.r, ? super Integer, oq.i0> qVar, p076m2.r rVar, final int i15) throws Throwable {
        int i16;
        f6<Color> f6VarV0;
        u0.k2<k1> k2Var2 = k2Var;
        p076m2.r rVarH = rVar.h(376119213);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(f6Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(hnVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.a(z15) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.a(z16) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.a(z17) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i16 |= rVarH.a(z18) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((1572864 & i15) == 0) {
            i16 |= rVarH.W(k2Var2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i15) == 0) {
            i16 |= rVarH.W(textStyle) ? 8388608 : 4194304;
        }
        if ((100663296 & i15) == 0) {
            i16 |= rVarH.W(textStyle2) ? 67108864 : 33554432;
        }
        if ((805306368 & i15) == 0) {
            i16 |= rVarH.G(qVar) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if (rVarH.r((306783379 & i16) != 306783378, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(376119213, i16, -1, "androidx.compose.material3.internal.DecoratedLabel (TextFieldImpl.kt:304)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new b(f6Var);
                rVarH.v(objE);
            }
            final b bVar = (b) objE;
            long jI = hnVar.i(z15, z16, z17);
            if (z18) {
                rVarH.X(-601510006);
                long j15 = textStyle.j();
                if (z18 && j15 == 16) {
                    j15 = jI;
                }
                long j16 = textStyle2.j();
                if (z18 && j16 == 16) {
                    j16 = jI;
                }
                f6VarV0 = v0(k2Var2, j15, j16, rVarH, (i16 >> 18) & 14);
                rVarH = rVarH;
                rVarH.R();
            } else {
                rVarH.X(-601031335);
                rVarH.R();
                f6VarV0 = null;
            }
            f6<Color> f6VarR0 = r0(k2Var2, jI, rVarH, (i16 >> 18) & 14);
            TextStyle textStyleC = c4.c(textStyle2, textStyle, f6Var != null ? f6Var.getValue().floatValue() : 1.0f);
            if (z18) {
                textStyleC = TextStyle.e(textStyleC, f6VarV0.getValue().m20unboximpl(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            }
            Y(f6VarR0.getValue().m20unboximpl(), textStyleC, y2.m.d(57043598, true, new er.p() { // from class: h2.n2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g3.W(qVar, bVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            k2Var2 = k2Var2;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            final u0.k2<k1> k2Var3 = k2Var2;
            d5VarM.a(new er.p() { // from class: h2.o2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g3.X(f6Var, hnVar, z15, z16, z17, z18, k2Var3, textStyle, textStyle2, qVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W(er.q qVar, b bVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(57043598, i15, -1, "androidx.compose.material3.internal.DecoratedLabel.<anonymous> (TextFieldImpl.kt:337)");
            }
            qVar.w(bVar, rVar, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X(f6 f6Var, hn hnVar, boolean z15, boolean z16, boolean z17, boolean z18, u0.k2 k2Var, TextStyle textStyle, TextStyle textStyle2, er.q qVar, int i15, p076m2.r rVar, int i16) throws Throwable {
        V(f6Var, hnVar, z15, z16, z17, z18, k2Var, textStyle, textStyle2, qVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void Y(long j15, TextStyle textStyle, er.p<? super p076m2.r, ? super Integer, oq.i0> pVar, p076m2.r rVar, final int i15) {
        int i16;
        final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar2;
        final TextStyle textStyle2;
        final long j16;
        p076m2.r rVarH = rVar.h(396611577);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.d(j15) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(textStyle) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(pVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(396611577, i16, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:362)");
            }
            y1.b(j15, textStyle, pVar, rVarH, i16 & 1022);
            j16 = j15;
            textStyle2 = textStyle;
            pVar2 = pVar;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            pVar2 = pVar;
            textStyle2 = textStyle;
            j16 = j15;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: h2.r2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g3.a0(j16, textStyle2, pVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Z(final long j15, final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(590397809);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.d(j15) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(590397809, i16, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:367)");
            }
            p076m2.d0.c(h4.a().d(Color.m0boximpl(j15)), pVar, rVarH, (i16 & 112) | p076m2.c4.f122821i);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: h2.s2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g3.b0(j15, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a0(long j15, TextStyle textStyle, er.p pVar, int i15, p076m2.r rVar, int i16) {
        Y(j15, textStyle, pVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b0(long j15, er.p pVar, int i15, p076m2.r rVar, int i16) {
        Z(j15, pVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final f6<Float> c0(u0.k2<k1> k2Var, boolean z15, p076m2.r rVar, int i15) throws Throwable {
        Object objP;
        float f15;
        if (p076m2.t.k()) {
            p076m2.t.o(-1040715446, i15, -1, "androidx.compose.material3.internal.affixOpacity (TextFieldImpl.kt:441)");
        }
        final u0.j0 j0VarB = of.b(l2.k0.FastEffects, rVar, 6);
        er.q qVar = new er.q() { // from class: h2.l2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return g3.d0(j0VarB, (u0.k2.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        };
        int i16 = (i15 & 14) | MLKEMEngine.KyberPolyBytes;
        u0.y2<Float, u0.p> y2VarP = s3.P(fr.m.f66405a);
        int i17 = (i16 & 14) | 3072;
        boolean z16 = true;
        if (k2Var.B()) {
            rVar.X(1666827533);
            rVar.R();
            objP = k2Var.p();
        } else {
            rVar.X(1666573488);
            boolean z17 = (((i17 & 14) ^ 6) > 4 && rVar.W(k2Var)) || (i17 & 6) == 4;
            objP = rVar.E();
            if (z17 || objP == p076m2.r.INSTANCE.a()) {
                c3.l.Companion companion = c3.l.INSTANCE;
                c3.l lVarD = companion.d();
                er.l<Object, oq.i0> lVarG = lVarD != null ? lVarD.g() : null;
                c3.l lVarE = companion.e(lVarD);
                try {
                    k1 k1VarP = k2Var.p();
                    companion.l(lVarD, lVarE, lVarG);
                    rVar.v(k1VarP);
                    objP = k1VarP;
                } catch (Throwable th4) {
                    companion.l(lVarD, lVarE, lVarG);
                    throw th4;
                }
            }
            rVar.R();
        }
        k1 k1Var = (k1) objP;
        rVar.X(-2144425951);
        if (p076m2.t.k()) {
            p076m2.t.o(-2144425951, 0, -1, "androidx.compose.material3.internal.affixOpacity.<anonymous> (TextFieldImpl.kt:447)");
        }
        int[] iArr = c.f79785b;
        int i18 = iArr[k1Var.ordinal()];
        float f16 = 1.0f;
        if (i18 == 1) {
            f15 = 1.0f;
        } else {
            if (i18 != 2) {
                if (i18 != 3) {
                    throw new oq.p();
                }
            } else if (z15) {
                f15 = 0.0f;
            }
            f15 = 1.0f;
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        Float fValueOf = Float.valueOf(f15);
        int i19 = i17 & 14;
        int i25 = i19 ^ 6;
        boolean z18 = (i25 > 4 && rVar.W(k2Var)) || (i17 & 6) == 4;
        Object objE = rVar.E();
        if (z18 || objE == p076m2.r.INSTANCE.a()) {
            objE = x5.d(new d(k2Var));
            rVar.v(objE);
        }
        k1 k1Var2 = (k1) ((f6) objE).getValue();
        rVar.X(-2144425951);
        if (p076m2.t.k()) {
            p076m2.t.o(-2144425951, 0, -1, "androidx.compose.material3.internal.affixOpacity.<anonymous> (TextFieldImpl.kt:447)");
        }
        int i26 = iArr[k1Var2.ordinal()];
        if (i26 != 1) {
            if (i26 != 2) {
                if (i26 != 3) {
                    throw new oq.p();
                }
            } else if (z15) {
                f16 = 0.0f;
            }
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        Float fValueOf2 = Float.valueOf(f16);
        if ((i25 <= 4 || !rVar.W(k2Var)) && (i17 & 6) != 4) {
            z16 = false;
        }
        Object objE2 = rVar.E();
        if (z16 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = x5.d(new e(k2Var));
            rVar.v(objE2);
        }
        f6<Float> f6VarR = u0.v2.r(k2Var, fValueOf, fValueOf2, (u0.j0) qVar.w(((f6) objE2).getValue(), rVar, 0), y2VarP, "PrefixSuffixOpacity", rVar, i19 | 196608);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return f6VarR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u0.j0 d0(u0.j0 j0Var, u0.k2.b bVar, p076m2.r rVar, int i15) {
        rVar.X(-735253059);
        if (p076m2.t.k()) {
            p076m2.t.o(-735253059, i15, -1, "androidx.compose.material3.internal.affixOpacity.<anonymous> (TextFieldImpl.kt:445)");
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        return j0Var;
    }

    public static final f3.m e0(f3.m mVar, boolean z15, final String str) {
        return z15 ? n4.v.d(mVar, false, new er.l() { // from class: h2.x2
            @Override // er.l
            public final Object b(Object obj) {
                return g3.f0(str, (n4.i0) obj);
            }
        }, 1, null) : mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f0(String str, n4.i0 i0Var) {
        n4.f0.m(i0Var, str);
        return oq.i0.f148189a;
    }

    public static final float g0() {
        return f79777c;
    }

    public static final float h0() {
        return f79776b;
    }

    public static final f3.c.b i0(tn tnVar) {
        if (tnVar instanceof tn.a) {
            return ((tn.a) tnVar).a();
        }
        if (tnVar instanceof tn.Attached) {
            return ((tn.Attached) tnVar).getExpandedAlignment();
        }
        throw new IllegalArgumentException("Unknown position: " + tnVar);
    }

    public static final float j0() {
        return f79781g;
    }

    public static final float k0() {
        return f79782h;
    }

    public static final float l0() {
        return f79780f;
    }

    public static final f3.c.b m0(tn tnVar) {
        if (tnVar instanceof tn.a) {
            return ((tn.a) tnVar).a();
        }
        if (tnVar instanceof tn.Attached) {
            return ((tn.Attached) tnVar).getMinimizedAlignment();
        }
        throw new IllegalArgumentException("Unknown position: " + tnVar);
    }

    public static final float n0() {
        return f79779e;
    }

    private static final boolean o0(tn tnVar) {
        return (tnVar instanceof tn.Attached) && !((tn.Attached) tnVar).getAlwaysMinimize();
    }

    public static final float p0() {
        return f79778d;
    }

    public static final float q0() {
        return f79775a;
    }

    private static final f6<Color> r0(u0.k2<k1> k2Var, long j15, p076m2.r rVar, int i15) throws Throwable {
        Object objP;
        if (p076m2.t.k()) {
            p076m2.t.o(-1365844622, i15, -1, "androidx.compose.material3.internal.labelContentColor (TextFieldImpl.kt:470)");
        }
        final u0.j0 j0VarB = of.b(l2.k0.FastEffects, rVar, 6);
        er.q qVar = new er.q() { // from class: h2.v2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return g3.s0(j0VarB, (u0.k2.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        };
        int i16 = (i15 & 14) | MLKEMEngine.KyberPolyBytes;
        k2Var.w();
        rVar.X(1139343725);
        if (p076m2.t.k()) {
            p076m2.t.o(1139343725, 0, -1, "androidx.compose.material3.internal.labelContentColor.<anonymous> (TextFieldImpl.kt:476)");
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        o3.c cVarM14getColorSpaceimpl = Color.m14getColorSpaceimpl(j15);
        boolean zW = rVar.W(cVarM14getColorSpaceimpl);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = (u0.y2) Function1.a(Color.INSTANCE).b(cVarM14getColorSpaceimpl);
            rVar.v(objE);
        }
        u0.y2 y2Var = (u0.y2) objE;
        int i17 = (i16 & 14) | 3072;
        boolean z15 = true;
        if (k2Var.B()) {
            rVar.X(1666827533);
            rVar.R();
            objP = k2Var.p();
        } else {
            rVar.X(1666573488);
            boolean z16 = (((i17 & 14) ^ 6) > 4 && rVar.W(k2Var)) || (i17 & 6) == 4;
            objP = rVar.E();
            if (z16 || objP == p076m2.r.INSTANCE.a()) {
                c3.l.Companion companion = c3.l.INSTANCE;
                c3.l lVarD = companion.d();
                er.l<Object, oq.i0> lVarG = lVarD != null ? lVarD.g() : null;
                c3.l lVarE = companion.e(lVarD);
                try {
                    k1 k1VarP = k2Var.p();
                    companion.l(lVarD, lVarE, lVarG);
                    rVar.v(k1VarP);
                    objP = k1VarP;
                } catch (Throwable th4) {
                    companion.l(lVarD, lVarE, lVarG);
                    throw th4;
                }
            }
            rVar.R();
        }
        rVar.X(1139343725);
        if (p076m2.t.k()) {
            p076m2.t.o(1139343725, 0, -1, "androidx.compose.material3.internal.labelContentColor.<anonymous> (TextFieldImpl.kt:476)");
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        Color colorM0boximpl = Color.m0boximpl(j15);
        int i18 = i17 & 14;
        int i19 = i18 ^ 6;
        boolean z17 = (i19 > 4 && rVar.W(k2Var)) || (i17 & 6) == 4;
        Object objE2 = rVar.E();
        if (z17 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = x5.d(new f(k2Var));
            rVar.v(objE2);
        }
        rVar.X(1139343725);
        if (p076m2.t.k()) {
            p076m2.t.o(1139343725, 0, -1, "androidx.compose.material3.internal.labelContentColor.<anonymous> (TextFieldImpl.kt:476)");
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        Color colorM0boximpl2 = Color.m0boximpl(j15);
        if ((i19 <= 4 || !rVar.W(k2Var)) && (i17 & 6) != 4) {
            z15 = false;
        }
        Object objE3 = rVar.E();
        if (z15 || objE3 == p076m2.r.INSTANCE.a()) {
            objE3 = x5.d(new g(k2Var));
            rVar.v(objE3);
        }
        f6<Color> f6VarR = u0.v2.r(k2Var, colorM0boximpl, colorM0boximpl2, (u0.j0) qVar.w(((f6) objE3).getValue(), rVar, 0), y2Var, "LabelContentColor", rVar, i18 | 196608);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return f6VarR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u0.j0 s0(u0.j0 j0Var, u0.k2.b bVar, p076m2.r rVar, int i15) {
        rVar.X(-1207102280);
        if (p076m2.t.k()) {
            p076m2.t.o(-1207102280, i15, -1, "androidx.compose.material3.internal.labelContentColor.<anonymous> (TextFieldImpl.kt:474)");
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        return j0Var;
    }

    private static final f6<Float> t0(u0.k2<k1> k2Var, boolean z15, p076m2.r rVar, int i15) throws Throwable {
        Object objP;
        float f15;
        if (p076m2.t.k()) {
            p076m2.t.o(927190202, i15, -1, "androidx.compose.material3.internal.labelProgress (TextFieldImpl.kt:402)");
        }
        final u0.j0 j0VarB = of.b(l2.k0.FastSpatial, rVar, 6);
        er.q qVar = new er.q() { // from class: h2.m2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return g3.u0(j0VarB, (u0.k2.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        };
        int i16 = (i15 & 14) | MLKEMEngine.KyberPolyBytes;
        u0.y2<Float, u0.p> y2VarP = s3.P(fr.m.f66405a);
        int i17 = (i16 & 14) | 3072;
        boolean z16 = true;
        if (k2Var.B()) {
            rVar.X(1666827533);
            rVar.R();
            objP = k2Var.p();
        } else {
            rVar.X(1666573488);
            boolean z17 = (((i17 & 14) ^ 6) > 4 && rVar.W(k2Var)) || (i17 & 6) == 4;
            objP = rVar.E();
            if (z17 || objP == p076m2.r.INSTANCE.a()) {
                c3.l.Companion companion = c3.l.INSTANCE;
                c3.l lVarD = companion.d();
                er.l<Object, oq.i0> lVarG = lVarD != null ? lVarD.g() : null;
                c3.l lVarE = companion.e(lVarD);
                try {
                    k1 k1VarP = k2Var.p();
                    companion.l(lVarD, lVarE, lVarG);
                    rVar.v(k1VarP);
                    objP = k1VarP;
                } catch (Throwable th4) {
                    companion.l(lVarD, lVarE, lVarG);
                    throw th4;
                }
            }
            rVar.R();
        }
        k1 k1Var = (k1) objP;
        rVar.X(1071902915);
        if (p076m2.t.k()) {
            p076m2.t.o(1071902915, 0, -1, "androidx.compose.material3.internal.labelProgress.<anonymous> (TextFieldImpl.kt:405)");
        }
        int[] iArr = c.f79785b;
        int i18 = iArr[k1Var.ordinal()];
        float f16 = 1.0f;
        if (i18 == 1) {
            f15 = 1.0f;
        } else {
            if (i18 != 2) {
                if (i18 != 3) {
                    throw new oq.p();
                }
            } else if (z15) {
                f15 = 0.0f;
            }
            f15 = 1.0f;
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        Float fValueOf = Float.valueOf(f15);
        int i19 = i17 & 14;
        int i25 = i19 ^ 6;
        boolean z18 = (i25 > 4 && rVar.W(k2Var)) || (i17 & 6) == 4;
        Object objE = rVar.E();
        if (z18 || objE == p076m2.r.INSTANCE.a()) {
            objE = x5.d(new h(k2Var));
            rVar.v(objE);
        }
        k1 k1Var2 = (k1) ((f6) objE).getValue();
        rVar.X(1071902915);
        if (p076m2.t.k()) {
            p076m2.t.o(1071902915, 0, -1, "androidx.compose.material3.internal.labelProgress.<anonymous> (TextFieldImpl.kt:405)");
        }
        int i26 = iArr[k1Var2.ordinal()];
        if (i26 != 1) {
            if (i26 != 2) {
                if (i26 != 3) {
                    throw new oq.p();
                }
            } else if (z15) {
                f16 = 0.0f;
            }
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        Float fValueOf2 = Float.valueOf(f16);
        if ((i25 <= 4 || !rVar.W(k2Var)) && (i17 & 6) != 4) {
            z16 = false;
        }
        Object objE2 = rVar.E();
        if (z16 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = x5.d(new i(k2Var));
            rVar.v(objE2);
        }
        f6<Float> f6VarR = u0.v2.r(k2Var, fValueOf, fValueOf2, (u0.j0) qVar.w(((f6) objE2).getValue(), rVar, 0), y2VarP, "LabelProgress", rVar, i19 | 196608);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return f6VarR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u0.j0 u0(u0.j0 j0Var, u0.k2.b bVar, p076m2.r rVar, int i15) {
        rVar.X(1806589607);
        if (p076m2.t.k()) {
            p076m2.t.o(1806589607, i15, -1, "androidx.compose.material3.internal.labelProgress.<anonymous> (TextFieldImpl.kt:404)");
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        return j0Var;
    }

    private static final f6<Color> v0(u0.k2<k1> k2Var, long j15, long j16, p076m2.r rVar, int i15) throws Throwable {
        Object objP;
        if (p076m2.t.k()) {
            p076m2.t.o(-182681442, i15, -1, "androidx.compose.material3.internal.labelTextStyleColor (TextFieldImpl.kt:459)");
        }
        final u0.j0 j0VarB = of.b(l2.k0.FastEffects, rVar, 6);
        er.q qVar = new er.q() { // from class: h2.t2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return g3.w0(j0VarB, (u0.k2.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        };
        int i16 = (i15 & 14) | MLKEMEngine.KyberPolyBytes;
        k1 k1VarW = k2Var.w();
        rVar.X(-759924327);
        if (p076m2.t.k()) {
            p076m2.t.o(-759924327, 0, -1, "androidx.compose.material3.internal.labelTextStyleColor.<anonymous> (TextFieldImpl.kt:462)");
        }
        int[] iArr = c.f79785b;
        boolean z15 = true;
        long j17 = iArr[k1VarW.ordinal()] == 1 ? j15 : j16;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        o3.c cVarM14getColorSpaceimpl = Color.m14getColorSpaceimpl(j17);
        boolean zW = rVar.W(cVarM14getColorSpaceimpl);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = (u0.y2) Function1.a(Color.INSTANCE).b(cVarM14getColorSpaceimpl);
            rVar.v(objE);
        }
        u0.y2 y2Var = (u0.y2) objE;
        int i17 = (i16 & 14) | 3072;
        if (k2Var.B()) {
            rVar.X(1666827533);
            rVar.R();
            objP = k2Var.p();
        } else {
            rVar.X(1666573488);
            boolean z16 = (((i17 & 14) ^ 6) > 4 && rVar.W(k2Var)) || (i17 & 6) == 4;
            objP = rVar.E();
            if (z16 || objP == p076m2.r.INSTANCE.a()) {
                c3.l.Companion companion = c3.l.INSTANCE;
                c3.l lVarD = companion.d();
                er.l<Object, oq.i0> lVarG = lVarD != null ? lVarD.g() : null;
                c3.l lVarE = companion.e(lVarD);
                try {
                    k1 k1VarP = k2Var.p();
                    companion.l(lVarD, lVarE, lVarG);
                    rVar.v(k1VarP);
                    objP = k1VarP;
                } catch (Throwable th4) {
                    companion.l(lVarD, lVarE, lVarG);
                    throw th4;
                }
            }
            rVar.R();
        }
        k1 k1Var = (k1) objP;
        rVar.X(-759924327);
        if (p076m2.t.k()) {
            p076m2.t.o(-759924327, 0, -1, "androidx.compose.material3.internal.labelTextStyleColor.<anonymous> (TextFieldImpl.kt:462)");
        }
        long j18 = iArr[k1Var.ordinal()] == 1 ? j15 : j16;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        Color colorM0boximpl = Color.m0boximpl(j18);
        int i18 = i17 & 14;
        int i19 = i18 ^ 6;
        boolean z17 = (i19 > 4 && rVar.W(k2Var)) || (i17 & 6) == 4;
        Object objE2 = rVar.E();
        if (z17 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = x5.d(new j(k2Var));
            rVar.v(objE2);
        }
        k1 k1Var2 = (k1) ((f6) objE2).getValue();
        rVar.X(-759924327);
        if (p076m2.t.k()) {
            p076m2.t.o(-759924327, 0, -1, "androidx.compose.material3.internal.labelTextStyleColor.<anonymous> (TextFieldImpl.kt:462)");
        }
        long j19 = iArr[k1Var2.ordinal()] == 1 ? j15 : j16;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        Color colorM0boximpl2 = Color.m0boximpl(j19);
        if ((i19 <= 4 || !rVar.W(k2Var)) && (i17 & 6) != 4) {
            z15 = false;
        }
        Object objE3 = rVar.E();
        if (z15 || objE3 == p076m2.r.INSTANCE.a()) {
            objE3 = x5.d(new k(k2Var));
            rVar.v(objE3);
        }
        f6<Color> f6VarR = u0.v2.r(k2Var, colorM0boximpl, colorM0boximpl2, (u0.j0) qVar.w(((f6) objE3).getValue(), rVar, 0), y2Var, "LabelTextStyleColor", rVar, i18 | 196608);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return f6VarR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u0.j0 w0(u0.j0 j0Var, u0.k2.b bVar, p076m2.r rVar, int i15) {
        rVar.X(1730286052);
        if (p076m2.t.k()) {
            p076m2.t.o(1730286052, i15, -1, "androidx.compose.material3.internal.labelTextStyleColor.<anonymous> (TextFieldImpl.kt:461)");
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        return j0Var;
    }

    public static final float x0(p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1251545215, i15, -1, "androidx.compose.material3.internal.minimizedLabelHalfHeight (TextFieldImpl.kt:512)");
        }
        long jU = androidx.compose.material3.d.f9816a.e(rVar, 6).getBodySmall().u();
        long jA = l2.i1.f114717a.A();
        if (!c5.v.j(jU)) {
            jU = jA;
        }
        float fN = c5.h.n(((c5.d) rVar.N(androidx.compose.ui.platform.g1.f())).h0(jU) / 2);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return fN;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
    private static final f6<Float> y0(u0.k2<k1> k2Var, boolean z15, p076m2.r rVar, int i15) throws Throwable {
        Object objP;
        float f15;
        if (p076m2.t.k()) {
            p076m2.t.o(-1386921849, i15, -1, "androidx.compose.material3.internal.placeholderOpacity (TextFieldImpl.kt:414)");
        }
        final u0.j0 j0VarB = of.b(l2.k0.FastEffects, rVar, 6);
        final u0.j0 j0VarB2 = of.b(l2.k0.SlowEffects, rVar, 6);
        er.q qVar = new er.q() { // from class: h2.q2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return g3.z0(j0VarB, j0VarB2, (u0.k2.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        };
        int i16 = (i15 & 14) | MLKEMEngine.KyberPolyBytes;
        u0.y2<Float, u0.p> y2VarP = s3.P(fr.m.f66405a);
        int i17 = (i16 & 14) | 3072;
        boolean z16 = true;
        if (k2Var.B()) {
            rVar.X(1666827533);
            rVar.R();
            objP = k2Var.p();
        } else {
            rVar.X(1666573488);
            boolean z17 = (((i17 & 14) ^ 6) > 4 && rVar.W(k2Var)) || (i17 & 6) == 4;
            objP = rVar.E();
            if (z17 || objP == p076m2.r.INSTANCE.a()) {
                c3.l.Companion companion = c3.l.INSTANCE;
                c3.l lVarD = companion.d();
                er.l<Object, oq.i0> lVarG = lVarD != null ? lVarD.g() : null;
                c3.l lVarE = companion.e(lVarD);
                try {
                    k1 k1VarP = k2Var.p();
                    companion.l(lVarD, lVarE, lVarG);
                    rVar.v(k1VarP);
                    objP = k1VarP;
                } catch (Throwable th4) {
                    companion.l(lVarD, lVarE, lVarG);
                    throw th4;
                }
            }
            rVar.R();
        }
        k1 k1Var = (k1) objP;
        rVar.X(-2037958114);
        if (p076m2.t.k()) {
            p076m2.t.o(-2037958114, 0, -1, "androidx.compose.material3.internal.placeholderOpacity.<anonymous> (TextFieldImpl.kt:432)");
        }
        int[] iArr = c.f79785b;
        int i18 = iArr[k1Var.ordinal()];
        float f16 = 1.0f;
        if (i18 == 1) {
            f15 = 1.0f;
        } else {
            if (i18 != 2) {
                if (i18 != 3) {
                    throw new oq.p();
                }
            } else if (!z15) {
                f15 = 1.0f;
            }
            f15 = 0.0f;
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        Float fValueOf = Float.valueOf(f15);
        int i19 = i17 & 14;
        int i25 = i19 ^ 6;
        boolean z18 = (i25 > 4 && rVar.W(k2Var)) || (i17 & 6) == 4;
        Object objE = rVar.E();
        if (z18 || objE == p076m2.r.INSTANCE.a()) {
            objE = x5.d(new l(k2Var));
            rVar.v(objE);
        }
        k1 k1Var2 = (k1) ((f6) objE).getValue();
        rVar.X(-2037958114);
        if (p076m2.t.k()) {
            p076m2.t.o(-2037958114, 0, -1, "androidx.compose.material3.internal.placeholderOpacity.<anonymous> (TextFieldImpl.kt:432)");
        }
        int i26 = iArr[k1Var2.ordinal()];
        if (i26 != 1) {
            if (i26 != 2) {
                if (i26 != 3) {
                    throw new oq.p();
                }
            } else if (z15) {
            }
            f16 = 0.0f;
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        Float fValueOf2 = Float.valueOf(f16);
        if ((i25 <= 4 || !rVar.W(k2Var)) && (i17 & 6) != 4) {
            z16 = false;
        }
        Object objE2 = rVar.E();
        if (z16 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = x5.d(new m(k2Var));
            rVar.v(objE2);
        }
        f6<Float> f6VarR = u0.v2.r(k2Var, fValueOf, fValueOf2, (u0.j0) qVar.w(((f6) objE2).getValue(), rVar, 0), y2VarP, "PlaceholderOpacity", rVar, i19 | 196608);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return f6VarR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u0.j0 z0(u0.j0 j0Var, u0.j0 j0Var2, u0.k2.b bVar, p076m2.r rVar, int i15) {
        rVar.X(-1370891590);
        if (p076m2.t.k()) {
            p076m2.t.o(-1370891590, i15, -1, "androidx.compose.material3.internal.placeholderOpacity.<anonymous> (TextFieldImpl.kt:420)");
        }
        k1 k1Var = k1.Focused;
        k1 k1Var2 = k1.UnfocusedEmpty;
        if (!bVar.c(k1Var, k1Var2) && (bVar.c(k1Var2, k1Var) || bVar.c(k1.UnfocusedNotEmpty, k1Var2))) {
            j0Var = j0Var2;
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        return j0Var;
    }
}
