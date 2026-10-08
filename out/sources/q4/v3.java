package q4;

import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001#B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0087\u0001\u0010 \u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\b2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0012H\u0007¢\u0006\u0004\b \u0010!Jq\u0010#\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\"2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0012H\u0007¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Lq4/v3;", "", "Lu4/l$b;", "defaultFontFamilyResolver", "Lc5/d;", "defaultDensity", "Lc5/t;", "defaultLayoutDirection", "", "cacheSize", "<init>", "(Lu4/l$b;Lc5/d;Lc5/t;I)V", "Lq4/e;", "text", "Lq4/b4;", "style", "Lb5/v;", "overflow", "", "softWrap", "maxLines", "", "Lq4/e$d;", "Lq4/g0;", "placeholders", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "layoutDirection", "density", "fontFamilyResolver", "skipCache", "Lq4/t3;", "c", "(Lq4/e;Lq4/b4;IZILjava/util/List;JLc5/t;Lc5/d;Lu4/l$b;Z)Lq4/t3;", "", "a", "(Ljava/lang/String;Lq4/b4;IZIJLc5/t;Lc5/d;Lu4/l$b;Z)Lq4/t3;", "Lu4/l$b;", "b", "Lc5/d;", "Lc5/t;", "d", "I", "Lq4/r3;", "e", "Lq4/r3;", "textLayoutCache", "f", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u4.l.b defaultFontFamilyResolver;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c5.d defaultDensity;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c5.t defaultLayoutDirection;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int cacheSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final r3 textLayoutCache;

    /* JADX INFO: renamed from: q4.v3$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lq4/v3$a;", "", "<init>", "()V", "Lq4/s3;", "textLayoutInput", "Lq4/t3;", "b", "(Lq4/s3;)Lq4/t3;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TextLayoutResult b(TextLayoutInput textLayoutInput) {
            t tVar = new t(textLayoutInput.getText(), c4.d(textLayoutInput.getStyle(), textLayoutInput.getLayoutDirection()), textLayoutInput.g(), textLayoutInput.getDensity(), textLayoutInput.getFontFamilyResolver());
            int iN = c5.b.n(textLayoutInput.getConstraints());
            int iL = ((textLayoutInput.getSoftWrap() || w3.b(textLayoutInput.getOverflow())) && c5.b.h(textLayoutInput.getConstraints())) ? c5.b.l(textLayoutInput.getConstraints()) : Integer.MAX_VALUE;
            int maxLines = (textLayoutInput.getSoftWrap() || !w3.b(textLayoutInput.getOverflow())) ? textLayoutInput.getMaxLines() : 1;
            if (iN != iL) {
                iL = lr.m.n(d0.d(tVar.d()), iN, iL);
            }
            q qVar = new q(tVar, c5.b.INSTANCE.b(0, iL, 0, c5.b.k(textLayoutInput.getConstraints())), maxLines, textLayoutInput.getOverflow(), null);
            return new TextLayoutResult(textLayoutInput, qVar, c5.c.d(textLayoutInput.getConstraints(), c5.r.c((((long) ((int) Math.ceil(qVar.getWidth()))) << 32) | (((long) ((int) Math.ceil(qVar.getHeight()))) & BodyPartID.bodyIdMax))), null);
        }

        private Companion() {
        }
    }

    public v3(u4.l.b bVar, c5.d dVar, c5.t tVar, int i15) {
        this.defaultFontFamilyResolver = bVar;
        this.defaultDensity = dVar;
        this.defaultLayoutDirection = tVar;
        this.cacheSize = i15;
        this.textLayoutCache = i15 > 0 ? new r3(i15) : null;
    }

    public static /* synthetic */ TextLayoutResult b(v3 v3Var, String str, TextStyle textStyle, int i15, boolean z15, int i16, long j15, c5.t tVar, c5.d dVar, u4.l.b bVar, boolean z16, int i17, Object obj) {
        if ((i17 & 2) != 0) {
            textStyle = TextStyle.INSTANCE.a();
        }
        TextStyle textStyle2 = textStyle;
        if ((i17 & 4) != 0) {
            i15 = b5.v.INSTANCE.a();
        }
        return v3Var.a(str, textStyle2, i15, (i17 & 8) != 0 ? true : z15, (i17 & 16) != 0 ? Integer.MAX_VALUE : i16, (i17 & 32) != 0 ? c5.c.b(0, 0, 0, 0, 15, null) : j15, (i17 & 64) != 0 ? v3Var.defaultLayoutDirection : tVar, (i17 & 128) != 0 ? v3Var.defaultDensity : dVar, (i17 & 256) != 0 ? v3Var.defaultFontFamilyResolver : bVar, (i17 & 512) != 0 ? false : z16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextLayoutResult d(v3 v3Var, e eVar, TextStyle textStyle, int i15, boolean z15, int i16, List list, long j15, c5.t tVar, c5.d dVar, u4.l.b bVar, boolean z16, int i17, Object obj) {
        if ((i17 & 2) != 0) {
            textStyle = TextStyle.INSTANCE.a();
        }
        return v3Var.c(eVar, textStyle, (i17 & 4) != 0 ? b5.v.INSTANCE.a() : i15, (i17 & 8) != 0 ? true : z15, (i17 & 16) != 0 ? Integer.MAX_VALUE : i16, (i17 & 32) != 0 ? pq.v.n() : list, (i17 & 64) != 0 ? c5.c.b(0, 0, 0, 0, 15, null) : j15, (i17 & 128) != 0 ? v3Var.defaultLayoutDirection : tVar, (i17 & 256) != 0 ? v3Var.defaultDensity : dVar, (i17 & 512) != 0 ? v3Var.defaultFontFamilyResolver : bVar, (i17 & 1024) != 0 ? false : z16);
    }

    public final TextLayoutResult a(String text, TextStyle style, int overflow, boolean softWrap, int maxLines, long constraints, c5.t layoutDirection, c5.d density, u4.l.b fontFamilyResolver, boolean skipCache) {
        return d(this, new e(text, null, 2, null), style, overflow, softWrap, maxLines, null, constraints, layoutDirection, density, fontFamilyResolver, skipCache, 32, null);
    }

    public final TextLayoutResult c(e text, TextStyle style, int overflow, boolean softWrap, int maxLines, List<e.Range<Placeholder>> placeholders, long constraints, c5.t layoutDirection, c5.d density, u4.l.b fontFamilyResolver, boolean skipCache) {
        r3 r3Var;
        TextLayoutInput textLayoutInput = new TextLayoutInput(text, style, placeholders, maxLines, softWrap, overflow, density, layoutDirection, fontFamilyResolver, constraints, (fr.k) null);
        TextLayoutResult textLayoutResultA = (skipCache || (r3Var = this.textLayoutCache) == null) ? null : r3Var.a(textLayoutInput);
        if (textLayoutResultA != null) {
            return textLayoutResultA.a(textLayoutInput, c5.c.d(constraints, c5.r.c((((long) d0.d(textLayoutResultA.getMultiParagraph().getWidth())) << 32) | (((long) d0.d(textLayoutResultA.getMultiParagraph().getHeight())) & BodyPartID.bodyIdMax))));
        }
        TextLayoutResult textLayoutResultB = INSTANCE.b(textLayoutInput);
        r3 r3Var2 = this.textLayoutCache;
        if (r3Var2 != null) {
            r3Var2.b(textLayoutInput, textLayoutResultB);
        }
        return textLayoutResultB;
    }

    public /* synthetic */ v3(u4.l.b bVar, c5.d dVar, c5.t tVar, int i15, int i16, fr.k kVar) {
        this(bVar, dVar, tVar, (i16 & 8) != 0 ? 8 : i15);
    }
}
