package r4;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lr4/d;", "", "<init>", "()V", "Lr4/j0;", "layout", "Landroid/graphics/RectF;", "rectF", "", "granularity", "Lkotlin/Function2;", "", "inclusionStrategy", "", "c", "(Lr4/j0;Landroid/graphics/RectF;ILer/p;)[I", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f171472a = new d();

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(er.p pVar, RectF rectF, RectF rectF2) {
        return ((Boolean) pVar.B(rectF, rectF2)).booleanValue();
    }

    public final int[] c(j0 layout, RectF rectF, int granularity, final er.p<? super RectF, ? super RectF, Boolean> inclusionStrategy) {
        SegmentFinder segmentFinderA;
        if (granularity == 1) {
            segmentFinderA = s4.a.f177809a.a(new s4.i(layout.G(), layout.I()));
        } else {
            b.a();
            segmentFinderA = a.a(layout.G(), layout.getTextPaint());
        }
        return layout.getLayout().getRangeForRect(rectF, segmentFinderA, new Layout.TextInclusionStrategy() { // from class: r4.c
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return d.b(inclusionStrategy, rectF2, rectF3);
            }
        });
    }
}
