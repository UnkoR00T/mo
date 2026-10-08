package u4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "resId", "Lu4/d0;", "weight", "Lu4/y;", "style", "Lu4/w;", "loadingStrategy", "Lu4/k;", "a", "(ILu4/d0;II)Lu4/k;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class s {
    public static final k a(int i15, FontWeight fontWeight, int i16, int i17) {
        return new ResourceFont(i15, fontWeight, i16, new c0(new b0[0]), i17, null);
    }

    public static /* synthetic */ k b(int i15, FontWeight fontWeight, int i16, int i17, int i18, Object obj) {
        if ((i18 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.d();
        }
        if ((i18 & 4) != 0) {
            i16 = y.INSTANCE.b();
        }
        if ((i18 & 8) != 0) {
            i17 = w.INSTANCE.b();
        }
        return a(i15, fontWeight, i16, i17);
    }
}
