package y4;

import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p071kotlin.Metadata;
import p076m2.f6;
import q4.Placeholder;
import q4.SpanStyle;
import q4.TextStyle;
import q4.b0;
import u4.FontWeight;
import u4.a1;
import u4.y;
import u4.z;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R%\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010-\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u00101\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010/\u001a\u0004\b \u00100R\u001a\u00106\u001a\u0002028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b)\u00105R\u0018\u00109\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010B\u001a\u00020>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b3\u0010AR\u0014\u0010E\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010DR\u0014\u0010F\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010DR\u0014\u0010H\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010G¨\u0006I"}, d2 = {"Ly4/e;", "Lq4/b0;", "", "text", "Lq4/b4;", "style", "", "Lq4/e$d;", "Lq4/e$a;", "annotations", "Lq4/g0;", "placeholders", "Lu4/l$b;", "fontFamilyResolver", "Lc5/d;", "density", "<init>", "(Ljava/lang/String;Lq4/b4;Ljava/util/List;Ljava/util/List;Lu4/l$b;Lc5/d;)V", "a", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "b", "Lq4/b4;", "h", "()Lq4/b4;", "c", "Ljava/util/List;", "getAnnotations", "()Ljava/util/List;", "d", "getPlaceholders", "e", "Lu4/l$b;", "getFontFamilyResolver", "()Lu4/l$b;", "f", "Lc5/d;", "getDensity", "()Lc5/d;", "Ly4/i;", "g", "Ly4/i;", "j", "()Ly4/i;", "textPaint", "", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "charSequence", "Lr4/s;", "i", "Lr4/s;", "()Lr4/s;", "layoutIntrinsics", "Ly4/u;", "Ly4/u;", "resolvedTypefaces", "", "k", "Z", "emojiCompatProcessed", "", "l", "I", "()I", "textDirectionHeuristic", "", "()F", "maxIntrinsicWidth", "minIntrinsicWidth", "()Z", "hasStaleResolvedFonts", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextStyle style;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<q4.e.Range<? extends q4.e.a>> annotations;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<q4.e.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final u4.l.b fontFamilyResolver;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final c5.d density;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i textPaint;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final CharSequence charSequence;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final r4.s layoutIntrinsics;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private u resolvedTypefaces;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean emojiCompatProcessed;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int textDirectionHeuristic;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List, java.util.List<? extends q4.e$d<? extends q4.e$a>>, java.util.List<q4.e$d<? extends q4.e$a>>] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List<q4.e$d<? extends q4.e$a>>] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    public e(String str, TextStyle textStyle, List<? extends q4.e.Range<? extends q4.e.a>> list, List<q4.e.Range<Placeholder>> list2, u4.l.b bVar, c5.d dVar) {
        Object obj;
        ?? arrayList;
        this.text = str;
        this.style = textStyle;
        this.annotations = list;
        this.placeholders = list2;
        this.fontFamilyResolver = bVar;
        this.density = dVar;
        i iVar = new i(1, dVar.getDensity());
        this.textPaint = iVar;
        this.emojiCompatProcessed = !f.c(textStyle) ? false : p.f223830a.a().getValue().booleanValue();
        this.textDirectionHeuristic = f.d(textStyle.D(), textStyle.w());
        er.r rVar = new er.r() { // from class: y4.d
            @Override // er.r
            public final Object g(Object obj2, Object obj3, Object obj4, Object obj5) {
                return e.c(this.f223800a, (u4.l) obj2, (FontWeight) obj3, (y) obj4, (z) obj5);
            }
        };
        z4.e.e(iVar, textStyle.G());
        SpanStyle spanStyleP = textStyle.P();
        int size = ((Collection) list).size();
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i15);
            if (((q4.e.Range) obj).g() instanceof SpanStyle) {
                break;
            } else {
                i15++;
            }
        }
        SpanStyle spanStyleA = z4.e.a(iVar, spanStyleP, rVar, dVar, obj != null);
        if (spanStyleA != null) {
            int size2 = this.annotations.size() + 1;
            arrayList = new ArrayList(size2);
            int i16 = 0;
            while (i16 < size2) {
                arrayList.add(i16 == 0 ? new q4.e.Range<>(spanStyleA, 0, this.text.length()) : this.annotations.get(i16 - 1));
                i16++;
            }
        } else {
            arrayList = this.annotations;
        }
        CharSequence charSequenceA = c.a(this.text, this.textPaint.getTextSize(), this.style, arrayList, this.placeholders, this.density, rVar, this.emojiCompatProcessed);
        this.charSequence = charSequenceA;
        this.layoutIntrinsics = new r4.s(charSequenceA, this.textPaint, this.textDirectionHeuristic);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface c(e eVar, u4.l lVar, FontWeight fontWeight, y yVar, z zVar) {
        f6<Object> f6VarA = eVar.fontFamilyResolver.a(lVar, fontWeight, yVar.getValue(), zVar.getValue());
        if (f6VarA instanceof a1.b) {
            return (Typeface) ((a1.b) f6VarA).getValue();
        }
        u uVar = new u(f6VarA, eVar.resolvedTypefaces);
        eVar.resolvedTypefaces = uVar;
        return uVar.a();
    }

    @Override // q4.b0
    public boolean a() {
        u uVar = this.resolvedTypefaces;
        if (uVar != null ? uVar.b() : false) {
            return true;
        }
        return !this.emojiCompatProcessed && f.c(this.style) && p.f223830a.a().getValue().booleanValue();
    }

    @Override // q4.b0
    public float d() {
        return this.layoutIntrinsics.g();
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final CharSequence getCharSequence() {
        return this.charSequence;
    }

    @Override // q4.b0
    public float f() {
        return this.layoutIntrinsics.h();
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final r4.s getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getTextDirectionHeuristic() {
        return this.textDirectionHeuristic;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final i getTextPaint() {
        return this.textPaint;
    }
}
