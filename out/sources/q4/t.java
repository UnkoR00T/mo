package q4;

import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010#\u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b\"\u0010 R \u0010'\u001a\b\u0012\u0004\u0012\u00020$0\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010\u001bR\u0014\u0010*\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010)¨\u0006+"}, d2 = {"Lq4/t;", "Lq4/b0;", "Lq4/e;", "annotatedString", "Lq4/b4;", "style", "", "Lq4/e$d;", "Lq4/g0;", "placeholders", "Lc5/d;", "density", "Lu4/l$b;", "fontFamilyResolver", "<init>", "(Lq4/e;Lq4/b4;Ljava/util/List;Lc5/d;Lu4/l$b;)V", "Lq4/e0;", "defaultStyle", "l", "(Lq4/e0;Lq4/e0;)Lq4/e0;", "a", "Lq4/e;", "g", "()Lq4/e;", "b", "Ljava/util/List;", "i", "()Ljava/util/List;", "", "c", "Loq/k;", "f", "()F", "minIntrinsicWidth", "d", "maxIntrinsicWidth", "Lq4/a0;", "e", "h", "infoList", "", "()Z", "hasStaleResolvedFonts", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e annotatedString;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<e.Range<Placeholder>> placeholders;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k minIntrinsicWidth;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k maxIntrinsicWidth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<ParagraphIntrinsicInfo> infoList;

    public t(e eVar, TextStyle textStyle, List<e.Range<Placeholder>> list, c5.d dVar, u4.l.b bVar) {
        this.annotatedString = eVar;
        this.placeholders = list;
        oq.o oVar = oq.o.NONE;
        this.minIntrinsicWidth = oq.l.b(oVar, new er.a() { // from class: q4.r
            @Override // er.a
            public final Object a() {
                return Float.valueOf(t.k(this.f164578a));
            }
        });
        this.maxIntrinsicWidth = oq.l.b(oVar, new er.a() { // from class: q4.s
            @Override // er.a
            public final Object a() {
                return Float.valueOf(t.j(this.f164582a));
            }
        });
        ParagraphStyle paragraphStyle = textStyle.getParagraphStyle();
        List<e.Range<ParagraphStyle>> listK = g.k(eVar, paragraphStyle);
        ArrayList arrayList = new ArrayList(listK.size());
        int size = listK.size();
        for (int i15 = 0; i15 < size; i15++) {
            e.Range<ParagraphStyle> range = listK.get(i15);
            e eVarL = g.l(eVar, range.h(), range.f());
            ParagraphStyle paragraphStyleL = l(range.g(), paragraphStyle);
            String text = eVarL.getText();
            TextStyle textStyleK = textStyle.K(paragraphStyleL);
            List<e.Range<? extends e.a>> listC = eVarL.c();
            if (listC == null) {
                listC = pq.v.n();
            }
            arrayList.add(new ParagraphIntrinsicInfo(c0.a(text, textStyleK, listC, dVar, bVar, u.b(i(), range.h(), range.f())), range.h(), range.f()));
        }
        this.infoList = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float j(t tVar) {
        ParagraphIntrinsicInfo paragraphIntrinsicInfo;
        b0 intrinsics;
        List<ParagraphIntrinsicInfo> list = tVar.infoList;
        if (list.isEmpty()) {
            paragraphIntrinsicInfo = null;
        } else {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = list.get(0);
            float fD = paragraphIntrinsicInfo2.getIntrinsics().d();
            int iP = pq.v.p(list);
            int i15 = 1;
            if (1 <= iP) {
                while (true) {
                    ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = list.get(i15);
                    float fD2 = paragraphIntrinsicInfo3.getIntrinsics().d();
                    if (Float.compare(fD, fD2) < 0) {
                        paragraphIntrinsicInfo2 = paragraphIntrinsicInfo3;
                        fD = fD2;
                    }
                    if (i15 == iP) {
                        break;
                    }
                    i15++;
                }
            }
            paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
        }
        ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
        if (paragraphIntrinsicInfo4 == null || (intrinsics = paragraphIntrinsicInfo4.getIntrinsics()) == null) {
            return 0.0f;
        }
        return intrinsics.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float k(t tVar) {
        ParagraphIntrinsicInfo paragraphIntrinsicInfo;
        b0 intrinsics;
        List<ParagraphIntrinsicInfo> list = tVar.infoList;
        if (list.isEmpty()) {
            paragraphIntrinsicInfo = null;
        } else {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = list.get(0);
            float f15 = paragraphIntrinsicInfo2.getIntrinsics().f();
            int iP = pq.v.p(list);
            int i15 = 1;
            if (1 <= iP) {
                while (true) {
                    ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = list.get(i15);
                    float f16 = paragraphIntrinsicInfo3.getIntrinsics().f();
                    if (Float.compare(f15, f16) < 0) {
                        paragraphIntrinsicInfo2 = paragraphIntrinsicInfo3;
                        f15 = f16;
                    }
                    if (i15 == iP) {
                        break;
                    }
                    i15++;
                }
            }
            paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
        }
        ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
        if (paragraphIntrinsicInfo4 == null || (intrinsics = paragraphIntrinsicInfo4.getIntrinsics()) == null) {
            return 0.0f;
        }
        return intrinsics.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ParagraphStyle l(ParagraphStyle style, ParagraphStyle defaultStyle) {
        return !b5.l.j(style.getTextDirection(), b5.l.INSTANCE.f()) ? style : ParagraphStyle.b(style, 0, defaultStyle.getTextDirection(), 0L, null, null, null, 0, 0, null, 509, null);
    }

    @Override // q4.b0
    public boolean a() {
        List<ParagraphIntrinsicInfo> list = this.infoList;
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            if (list.get(i15).getIntrinsics().a()) {
                return true;
            }
        }
        return false;
    }

    @Override // q4.b0
    public float d() {
        return ((Number) this.maxIntrinsicWidth.getValue()).floatValue();
    }

    @Override // q4.b0
    public float f() {
        return ((Number) this.minIntrinsicWidth.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final e getAnnotatedString() {
        return this.annotatedString;
    }

    public final List<ParagraphIntrinsicInfo> h() {
        return this.infoList;
    }

    public final List<e.Range<Placeholder>> i() {
        return this.placeholders;
    }
}
