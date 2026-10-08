package q4;

import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: q4.s3, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001Bo\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bBe\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010!R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b7\u0010!R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b/\u00108\u001a\u0004\b)\u00109R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b5\u0010:\u001a\u0004\b1\u0010;R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b+\u0010<\u001a\u0004\b-\u0010=R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b'\u0010>\u001a\u0004\b%\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lq4/s3;", "", "Lq4/e;", "text", "Lq4/b4;", "style", "", "Lq4/e$d;", "Lq4/g0;", "placeholders", "", "maxLines", "", "softWrap", "Lb5/v;", "overflow", "Lc5/d;", "density", "Lc5/t;", "layoutDirection", "Lu4/k$b;", "resourceLoader", "Lu4/l$b;", "fontFamilyResolver", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "<init>", "(Lq4/e;Lq4/b4;Ljava/util/List;IZILc5/d;Lc5/t;Lu4/k$b;Lu4/l$b;J)V", "(Lq4/e;Lq4/b4;Ljava/util/List;IZILc5/d;Lc5/t;Lu4/l$b;JLfr/k;)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lq4/e;", "j", "()Lq4/e;", "b", "Lq4/b4;", "i", "()Lq4/b4;", "c", "Ljava/util/List;", "g", "()Ljava/util/List;", "d", "I", "e", "Z", "h", "()Z", "f", "Lc5/d;", "()Lc5/d;", "Lc5/t;", "()Lc5/t;", "Lu4/l$b;", "()Lu4/l$b;", "J", "()J", "k", "Lu4/k$b;", "_developerSuppliedResourceLoader", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextLayoutInput {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final e text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle style;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<e.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxLines;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean softWrap;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int overflow;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final c5.d density;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final c5.t layoutDirection;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final u4.l.b fontFamilyResolver;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final long constraints;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private u4.k.b _developerSuppliedResourceLoader;

    public /* synthetic */ TextLayoutInput(e eVar, TextStyle b4Var, List list, int i15, boolean z15, int i16, c5.d dVar, c5.t tVar, u4.l.b bVar, long j15, fr.k kVar) {
        this(eVar, b4Var, list, i15, z15, i16, dVar, tVar, bVar, j15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c5.d getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final u4.l.b getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c5.t getLayoutDirection() {
        return this.layoutDirection;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = (TextLayoutInput) other;
        return fr.t.c(this.text, textLayoutInput.text) && fr.t.c(this.style, textLayoutInput.style) && fr.t.c(this.placeholders, textLayoutInput.placeholders) && this.maxLines == textLayoutInput.maxLines && this.softWrap == textLayoutInput.softWrap && b5.v.g(this.overflow, textLayoutInput.overflow) && fr.t.c(this.density, textLayoutInput.density) && this.layoutDirection == textLayoutInput.layoutDirection && fr.t.c(this.fontFamilyResolver, textLayoutInput.fontFamilyResolver) && c5.b.f(this.constraints, textLayoutInput.constraints);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getOverflow() {
        return this.overflow;
    }

    public final List<e.Range<Placeholder>> g() {
        return this.placeholders;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    public int hashCode() {
        return (((((((((((((((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.placeholders.hashCode()) * 31) + this.maxLines) * 31) + Boolean.hashCode(this.softWrap)) * 31) + b5.v.h(this.overflow)) * 31) + this.density.hashCode()) * 31) + this.layoutDirection.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31) + c5.b.o(this.constraints);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final e getText() {
        return this.text;
    }

    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.text) + ", style=" + this.style + ", placeholders=" + this.placeholders + ", maxLines=" + this.maxLines + ", softWrap=" + this.softWrap + ", overflow=" + ((Object) b5.v.i(this.overflow)) + ", density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) c5.b.q(this.constraints)) + ')';
    }

    private TextLayoutInput(e eVar, TextStyle b4Var, List<e.Range<Placeholder>> list, int i15, boolean z15, int i16, c5.d dVar, c5.t tVar, u4.k.b bVar, u4.l.b bVar2, long j15) {
        this.text = eVar;
        this.style = b4Var;
        this.placeholders = list;
        this.maxLines = i15;
        this.softWrap = z15;
        this.overflow = i16;
        this.density = dVar;
        this.layoutDirection = tVar;
        this.fontFamilyResolver = bVar2;
        this.constraints = j15;
        this._developerSuppliedResourceLoader = bVar;
    }

    private TextLayoutInput(e eVar, TextStyle b4Var, List<e.Range<Placeholder>> list, int i15, boolean z15, int i16, c5.d dVar, c5.t tVar, u4.l.b bVar, long j15) {
        this(eVar, b4Var, list, i15, z15, i16, dVar, tVar, (u4.k.b) null, bVar, j15);
    }
}
