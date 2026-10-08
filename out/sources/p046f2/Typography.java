package p046f2;

import fr.k;
import fr.t;
import ip.a;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q4.TextStyle;

/* JADX INFO: renamed from: f2.bs, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b#\b\u0007\u0018\u00002\u00020\u0001B³\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"B\u009f\u0001\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b!\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00101R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010/\u001a\u0004\b7\u00101R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010/\u001a\u0004\b9\u00101R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010/\u001a\u0004\b;\u00101R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010/\u001a\u0004\b<\u00101R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010/\u001a\u0004\b>\u00101R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b?\u00101R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010/\u001a\u0004\b.\u00101R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b4\u00101R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010/\u001a\u0004\b8\u00101R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010/\u001a\u0004\bB\u00101R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010/\u001a\u0004\bD\u00101R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u0010/\u001a\u0004\bE\u00101R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010/\u001a\u0004\b=\u00101R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010/\u001a\u0004\b@\u00101R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010/\u001a\u0004\bA\u00101R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010/\u001a\u0004\bC\u00101R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010/\u001a\u0004\bF\u00101R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010/\u001a\u0004\bG\u00101R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010/\u001a\u0004\bJ\u00101R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010/\u001a\u0004\bK\u00101R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bL\u0010/\u001a\u0004\bM\u00101R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010/\u001a\u0004\b2\u00101R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010/\u001a\u0004\b6\u00101R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010/\u001a\u0004\b:\u00101R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u0010/\u001a\u0004\bH\u00101R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010/\u001a\u0004\bI\u00101R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u0010/\u001a\u0004\bL\u00101¨\u0006N"}, d2 = {"Lf2/bs;", "", "Lq4/b4;", "displayLarge", "displayMedium", "displaySmall", "headlineLarge", "headlineMedium", "headlineSmall", "titleLarge", "titleMedium", "titleSmall", "bodyLarge", "bodyMedium", "bodySmall", "labelLarge", "labelMedium", "labelSmall", "displayLargeEmphasized", "displayMediumEmphasized", "displaySmallEmphasized", "headlineLargeEmphasized", "headlineMediumEmphasized", "headlineSmallEmphasized", "titleLargeEmphasized", "titleMediumEmphasized", "titleSmallEmphasized", "bodyLargeEmphasized", "bodyMediumEmphasized", "bodySmallEmphasized", "labelLargeEmphasized", "labelMediumEmphasized", "labelSmallEmphasized", "<init>", "(Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;)V", "(Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lq4/b4;", "g", "()Lq4/b4;", "b", "i", "c", "k", "d", "m", "e", "o", "f", "q", "y", "h", "A", "C", "j", "l", "s", "n", "u", "w", "p", "r", "t", "v", "z", "B", "x", a.f96138c, "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Typography {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
    private final TextStyle bodySmallEmphasized;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
    private final TextStyle labelLargeEmphasized;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
    private final TextStyle labelMediumEmphasized;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
    private final TextStyle labelSmallEmphasized;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle displayLarge;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle displayMedium;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final TextStyle displaySmall;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle headlineLarge;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle headlineMedium;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle headlineSmall;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle titleLarge;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle titleMedium;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle titleSmall;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle bodyLarge;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle bodyMedium;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle bodySmall;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle labelLarge;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle labelMedium;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle labelSmall;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle displayLargeEmphasized;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle displayMediumEmphasized;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle displaySmallEmphasized;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle headlineLargeEmphasized;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle headlineMediumEmphasized;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle headlineSmallEmphasized;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle titleLargeEmphasized;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle titleMediumEmphasized;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle titleSmallEmphasized;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle bodyLargeEmphasized;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle bodyMediumEmphasized;

    public Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, TextStyle textStyle16, TextStyle textStyle17, TextStyle textStyle18, TextStyle textStyle19, TextStyle textStyle20, TextStyle textStyle21, TextStyle textStyle22, TextStyle textStyle23, TextStyle textStyle24, TextStyle textStyle25, TextStyle textStyle26, TextStyle textStyle27, TextStyle textStyle28, TextStyle textStyle29, TextStyle textStyle30) {
        this.displayLarge = textStyle;
        this.displayMedium = textStyle2;
        this.displaySmall = textStyle3;
        this.headlineLarge = textStyle4;
        this.headlineMedium = textStyle5;
        this.headlineSmall = textStyle6;
        this.titleLarge = textStyle7;
        this.titleMedium = textStyle8;
        this.titleSmall = textStyle9;
        this.bodyLarge = textStyle10;
        this.bodyMedium = textStyle11;
        this.bodySmall = textStyle12;
        this.labelLarge = textStyle13;
        this.labelMedium = textStyle14;
        this.labelSmall = textStyle15;
        this.displayLargeEmphasized = textStyle16;
        this.displayMediumEmphasized = textStyle17;
        this.displaySmallEmphasized = textStyle18;
        this.headlineLargeEmphasized = textStyle19;
        this.headlineMediumEmphasized = textStyle20;
        this.headlineSmallEmphasized = textStyle21;
        this.titleLargeEmphasized = textStyle22;
        this.titleMediumEmphasized = textStyle23;
        this.titleSmallEmphasized = textStyle24;
        this.bodyLargeEmphasized = textStyle25;
        this.bodyMediumEmphasized = textStyle26;
        this.bodySmallEmphasized = textStyle27;
        this.labelLargeEmphasized = textStyle28;
        this.labelMediumEmphasized = textStyle29;
        this.labelSmallEmphasized = textStyle30;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final TextStyle getTitleMedium() {
        return this.titleMedium;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final TextStyle getTitleMediumEmphasized() {
        return this.titleMediumEmphasized;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final TextStyle getTitleSmall() {
        return this.titleSmall;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final TextStyle getTitleSmallEmphasized() {
        return this.titleSmallEmphasized;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextStyle getBodyLarge() {
        return this.bodyLarge;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextStyle getBodyLargeEmphasized() {
        return this.bodyLargeEmphasized;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextStyle getBodyMedium() {
        return this.bodyMedium;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextStyle getBodyMediumEmphasized() {
        return this.bodyMediumEmphasized;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextStyle getBodySmall() {
        return this.bodySmall;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) other;
        return t.c(this.displayLarge, typography.displayLarge) && t.c(this.displayMedium, typography.displayMedium) && t.c(this.displaySmall, typography.displaySmall) && t.c(this.headlineLarge, typography.headlineLarge) && t.c(this.headlineMedium, typography.headlineMedium) && t.c(this.headlineSmall, typography.headlineSmall) && t.c(this.titleLarge, typography.titleLarge) && t.c(this.titleMedium, typography.titleMedium) && t.c(this.titleSmall, typography.titleSmall) && t.c(this.bodyLarge, typography.bodyLarge) && t.c(this.bodyMedium, typography.bodyMedium) && t.c(this.bodySmall, typography.bodySmall) && t.c(this.labelLarge, typography.labelLarge) && t.c(this.labelMedium, typography.labelMedium) && t.c(this.labelSmall, typography.labelSmall) && t.c(this.displayLargeEmphasized, typography.displayLargeEmphasized) && t.c(this.displayMediumEmphasized, typography.displayMediumEmphasized) && t.c(this.displaySmallEmphasized, typography.displaySmallEmphasized) && t.c(this.headlineLargeEmphasized, typography.headlineLargeEmphasized) && t.c(this.headlineMediumEmphasized, typography.headlineMediumEmphasized) && t.c(this.headlineSmallEmphasized, typography.headlineSmallEmphasized) && t.c(this.titleLargeEmphasized, typography.titleLargeEmphasized) && t.c(this.titleMediumEmphasized, typography.titleMediumEmphasized) && t.c(this.titleSmallEmphasized, typography.titleSmallEmphasized) && t.c(this.bodyLargeEmphasized, typography.bodyLargeEmphasized) && t.c(this.bodyMediumEmphasized, typography.bodyMediumEmphasized) && t.c(this.bodySmallEmphasized, typography.bodySmallEmphasized) && t.c(this.labelLargeEmphasized, typography.labelLargeEmphasized) && t.c(this.labelMediumEmphasized, typography.labelMediumEmphasized) && t.c(this.labelSmallEmphasized, typography.labelSmallEmphasized);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextStyle getBodySmallEmphasized() {
        return this.bodySmallEmphasized;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextStyle getDisplayLarge() {
        return this.displayLarge;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextStyle getDisplayLargeEmphasized() {
        return this.displayLargeEmphasized;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.displayLarge.hashCode() * 31) + this.displayMedium.hashCode()) * 31) + this.displaySmall.hashCode()) * 31) + this.headlineLarge.hashCode()) * 31) + this.headlineMedium.hashCode()) * 31) + this.headlineSmall.hashCode()) * 31) + this.titleLarge.hashCode()) * 31) + this.titleMedium.hashCode()) * 31) + this.titleSmall.hashCode()) * 31) + this.bodyLarge.hashCode()) * 31) + this.bodyMedium.hashCode()) * 31) + this.bodySmall.hashCode()) * 31) + this.labelLarge.hashCode()) * 31) + this.labelMedium.hashCode()) * 31) + this.labelSmall.hashCode()) * 31) + this.displayLargeEmphasized.hashCode()) * 31) + this.displayMediumEmphasized.hashCode()) * 31) + this.displaySmallEmphasized.hashCode()) * 31) + this.headlineLargeEmphasized.hashCode()) * 31) + this.headlineMediumEmphasized.hashCode()) * 31) + this.headlineSmallEmphasized.hashCode()) * 31) + this.titleLargeEmphasized.hashCode()) * 31) + this.titleMediumEmphasized.hashCode()) * 31) + this.titleSmallEmphasized.hashCode()) * 31) + this.bodyLargeEmphasized.hashCode()) * 31) + this.bodyMediumEmphasized.hashCode()) * 31) + this.bodySmallEmphasized.hashCode()) * 31) + this.labelLargeEmphasized.hashCode()) * 31) + this.labelMediumEmphasized.hashCode()) * 31) + this.labelSmallEmphasized.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextStyle getDisplayMedium() {
        return this.displayMedium;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextStyle getDisplayMediumEmphasized() {
        return this.displayMediumEmphasized;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextStyle getDisplaySmall() {
        return this.displaySmall;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final TextStyle getDisplaySmallEmphasized() {
        return this.displaySmallEmphasized;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextStyle getHeadlineLarge() {
        return this.headlineLarge;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final TextStyle getHeadlineLargeEmphasized() {
        return this.headlineLargeEmphasized;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final TextStyle getHeadlineMedium() {
        return this.headlineMedium;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final TextStyle getHeadlineMediumEmphasized() {
        return this.headlineMediumEmphasized;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final TextStyle getHeadlineSmall() {
        return this.headlineSmall;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final TextStyle getHeadlineSmallEmphasized() {
        return this.headlineSmallEmphasized;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final TextStyle getLabelLarge() {
        return this.labelLarge;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final TextStyle getLabelLargeEmphasized() {
        return this.labelLargeEmphasized;
    }

    public String toString() {
        return "Typography(displayLarge=" + this.displayLarge + ", displayMedium=" + this.displayMedium + ",displaySmall=" + this.displaySmall + ", headlineLarge=" + this.headlineLarge + ", headlineMedium=" + this.headlineMedium + ", headlineSmall=" + this.headlineSmall + ", titleLarge=" + this.titleLarge + ", titleMedium=" + this.titleMedium + ", titleSmall=" + this.titleSmall + ", bodyLarge=" + this.bodyLarge + ", bodyMedium=" + this.bodyMedium + ", bodySmall=" + this.bodySmall + ", labelLarge=" + this.labelLarge + ", labelMedium=" + this.labelMedium + ", labelSmall=" + this.labelSmall + ", displayLargeEmphasized=" + this.displayLargeEmphasized + ", displayMediumEmphasized=" + this.displayMediumEmphasized + ", displaySmallEmphasized=" + this.displaySmallEmphasized + ", headlineLargeEmphasized=" + this.headlineLargeEmphasized + ", headlineMediumEmphasized=" + this.headlineMediumEmphasized + ", headlineSmallEmphasized=" + this.headlineSmallEmphasized + ", titleLargeEmphasized=" + this.titleLargeEmphasized + ", titleMediumEmphasized=" + this.titleMediumEmphasized + ", titleSmallEmphasized=" + this.titleSmallEmphasized + ", bodyLargeEmphasized=" + this.bodyLargeEmphasized + ", bodyMediumEmphasized=" + this.bodyMediumEmphasized + ", bodySmallEmphasized=" + this.bodySmallEmphasized + ", labelLargeEmphasized=" + this.labelLargeEmphasized + ", labelMediumEmphasized=" + this.labelMediumEmphasized + ", labelSmallEmphasized=" + this.labelSmallEmphasized + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final TextStyle getLabelMedium() {
        return this.labelMedium;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final TextStyle getLabelMediumEmphasized() {
        return this.labelMediumEmphasized;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final TextStyle getLabelSmall() {
        return this.labelSmall;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final TextStyle getLabelSmallEmphasized() {
        return this.labelSmallEmphasized;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final TextStyle getTitleLarge() {
        return this.titleLarge;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final TextStyle getTitleLargeEmphasized() {
        return this.titleLargeEmphasized;
    }

    public /* synthetic */ Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, int i15, k kVar) {
        this((i15 & 1) != 0 ? ds.f55682b.getDisplayLarge() : textStyle, (i15 & 2) != 0 ? ds.f55682b.getDisplayMedium() : textStyle2, (i15 & 4) != 0 ? ds.f55682b.getDisplaySmall() : textStyle3, (i15 & 8) != 0 ? ds.f55682b.getHeadlineLarge() : textStyle4, (i15 & 16) != 0 ? ds.f55682b.getHeadlineMedium() : textStyle5, (i15 & 32) != 0 ? ds.f55682b.getHeadlineSmall() : textStyle6, (i15 & 64) != 0 ? ds.f55682b.getTitleLarge() : textStyle7, (i15 & 128) != 0 ? ds.f55682b.getTitleMedium() : textStyle8, (i15 & 256) != 0 ? ds.f55682b.getTitleSmall() : textStyle9, (i15 & 512) != 0 ? ds.f55682b.getBodyLarge() : textStyle10, (i15 & 1024) != 0 ? ds.f55682b.getBodyMedium() : textStyle11, (i15 & 2048) != 0 ? ds.f55682b.getBodySmall() : textStyle12, (i15 & PKIFailureInfo.certConfirmed) != 0 ? ds.f55682b.getLabelLarge() : textStyle13, (i15 & PKIFailureInfo.certRevoked) != 0 ? ds.f55682b.getLabelMedium() : textStyle14, (i15 & 16384) != 0 ? ds.f55682b.getLabelSmall() : textStyle15);
    }

    public Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15) {
        this(textStyle, textStyle2, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, textStyle8, textStyle9, textStyle10, textStyle11, textStyle12, textStyle13, textStyle14, textStyle15, textStyle, textStyle2, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, textStyle8, textStyle9, textStyle10, textStyle11, textStyle12, textStyle13, textStyle14, textStyle15);
    }
}
