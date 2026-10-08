package m1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lf3/m;", "Lm1/w;", "styleState", "Lm1/g;", "style", "b", "(Lf3/m;Lm1/w;Lm1/g;)Lf3/m;", "Ly1/o;", "", "c", "(I)I", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {
    public static final f3.m b(f3.m mVar, w wVar, g gVar) {
        return gVar == g.INSTANCE ? mVar : mVar.u(new StyleElement(wVar, gVar)).u(j.f122415d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(int i15) {
        y1.o.Companion companion = y1.o.INSTANCE;
        if (y1.o.d(i15, companion.b())) {
            return 32;
        }
        return y1.o.d(i15, companion.a()) ? 64 : 96;
    }
}
