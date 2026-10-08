package u4;

import java.util.List;
import org.bouncycastle.asn1.x509.DisplayText;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: u4.d0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, d2 = {"Lu4/d0;", "", "", "weight", "<init>", "(I)V", "other", "o", "(Lu4/d0;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "p", "b", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FontWeight implements Comparable<FontWeight> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final FontWeight f195196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final FontWeight f195197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final FontWeight f195198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final FontWeight f195199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final FontWeight f195200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final FontWeight f195201h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final FontWeight f195202j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final FontWeight f195203k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final FontWeight f195204l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final FontWeight f195205m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final FontWeight f195206n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final FontWeight f195207p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final FontWeight f195208q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final FontWeight f195209r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final FontWeight f195210s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final FontWeight f195211t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final FontWeight f195212v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final FontWeight f195213w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final List<FontWeight> f195214x;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int weight;

    /* JADX INFO: renamed from: u4.d0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR \u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR \u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\b¨\u0006\u001c"}, d2 = {"Lu4/d0$a;", "", "<init>", "()V", "Lu4/d0;", "W400", "Lu4/d0;", "e", "()Lu4/d0;", "getW400$annotations", "W500", "f", "getW500$annotations", "W600", "g", "getW600$annotations", "Light", "b", "getLight$annotations", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.P0, "d", "getNormal$annotations", "Medium", "c", "getMedium$annotations", "Bold", "a", "getBold$annotations", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final FontWeight a() {
            return FontWeight.f195211t;
        }

        public final FontWeight b() {
            return FontWeight.f195207p;
        }

        public final FontWeight c() {
            return FontWeight.f195209r;
        }

        public final FontWeight d() {
            return FontWeight.f195208q;
        }

        public final FontWeight e() {
            return FontWeight.f195199f;
        }

        public final FontWeight f() {
            return FontWeight.f195200g;
        }

        public final FontWeight g() {
            return FontWeight.f195201h;
        }

        private Companion() {
        }
    }

    static {
        FontWeight fontWeight = new FontWeight(100);
        f195196c = fontWeight;
        FontWeight fontWeight2 = new FontWeight(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
        f195197d = fontWeight2;
        FontWeight fontWeight3 = new FontWeight(300);
        f195198e = fontWeight3;
        FontWeight fontWeight4 = new FontWeight(400);
        f195199f = fontWeight4;
        FontWeight fontWeight5 = new FontWeight(500);
        f195200g = fontWeight5;
        FontWeight fontWeight6 = new FontWeight(600);
        f195201h = fontWeight6;
        FontWeight fontWeight7 = new FontWeight(700);
        f195202j = fontWeight7;
        FontWeight fontWeight8 = new FontWeight(800);
        f195203k = fontWeight8;
        FontWeight fontWeight9 = new FontWeight(900);
        f195204l = fontWeight9;
        f195205m = fontWeight;
        f195206n = fontWeight2;
        f195207p = fontWeight3;
        f195208q = fontWeight4;
        f195209r = fontWeight5;
        f195210s = fontWeight6;
        f195211t = fontWeight7;
        f195212v = fontWeight8;
        f195213w = fontWeight9;
        f195214x = pq.v.q(fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8, fontWeight9);
    }

    public FontWeight(int i15) {
        this.weight = i15;
        boolean z15 = false;
        if (1 <= i15 && i15 < 1001) {
            z15 = true;
        }
        if (z15) {
            return;
        }
        w4.a.a("Font weight can be in range [1, 1000]. Current value: " + i15);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FontWeight) && this.weight == ((FontWeight) other).weight;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public int getWeight() {
        return this.weight;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public int compareTo(FontWeight other) {
        return fr.t.d(this.weight, other.weight);
    }

    public final int p() {
        return this.weight;
    }

    public String toString() {
        return "FontWeight(weight=" + this.weight + ')';
    }
}
