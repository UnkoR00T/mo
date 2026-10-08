package c5;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0017¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0002*\u00020\u0003H\u0017¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8&X§\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lc5/l;", "", "Lc5/h;", "Lc5/v;", "Z", "(F)J", "h0", "(J)F", "", "i2", "()F", "getFontScale$annotations", "()V", "fontScale", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface l {
    default long Z(float f15) {
        d5.b bVar = d5.b.f40006a;
        if (!bVar.f(getFontScale())) {
            return w.f(f15 / getFontScale());
        }
        d5.a aVarB = bVar.b(getFontScale());
        return w.f(aVarB != null ? aVarB.a(f15) : f15 / getFontScale());
    }

    default float h0(long j15) {
        if (!x.g(v.g(j15), x.INSTANCE.b())) {
            m.b("Only Sp can convert to Px");
        }
        d5.b bVar = d5.b.f40006a;
        if (!bVar.f(getFontScale())) {
            return h.n(v.h(j15) * getFontScale());
        }
        d5.a aVarB = bVar.b(getFontScale());
        float fH = v.h(j15);
        return aVarB == null ? h.n(fH * getFontScale()) : h.n(aVarB.b(fH));
    }

    /* JADX INFO: renamed from: i2 */
    float getFontScale();
}
