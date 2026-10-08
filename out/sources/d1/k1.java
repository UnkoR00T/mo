package d1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010Ba\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0007\u0012\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Ld1/k1;", "Ld1/a1;", "Ld1/a1$a;", "type", "", "minLinesToShowCollapse", "minCrossAxisSizeToShowCollapse", "Lkotlin/Function1;", "Ld1/d1;", "Lkotlin/Function0;", "Loq/i0;", "seeMoreGetter", "collapseGetter", "<init>", "(Ld1/a1$a;IILer/l;Ler/l;)V", "f", "a", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
@oq.a
public final class k1 extends a1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final k1 f39199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final k1 f39200h;

    /* JADX INFO: renamed from: d1.k1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ld1/k1$a;", "", "<init>", "()V", "Ld1/k1;", "Clip", "Ld1/k1;", "a", "()Ld1/k1;", "getClip$annotations", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final k1 a() {
            return k1.f39200h;
        }

        private Companion() {
        }
    }

    static {
        int i15 = 0;
        er.l lVar = null;
        f39199g = new k1(a1.a.Visible, 0, i15, null, lVar, 30, null);
        f39200h = new k1(a1.a.Clip, i15, 0, lVar, null, 30, null);
    }

    private k1(a1.a aVar, int i15, int i16, er.l<? super FlowLayoutOverflowState, ? extends er.p<? super p076m2.r, ? super Integer, oq.i0>> lVar, er.l<? super FlowLayoutOverflowState, ? extends er.p<? super p076m2.r, ? super Integer, oq.i0>> lVar2) {
        super(aVar, i15, i16, lVar, lVar2, null);
    }

    /* synthetic */ k1(a1.a aVar, int i15, int i16, er.l lVar, er.l lVar2, int i17, fr.k kVar) {
        this(aVar, (i17 & 2) != 0 ? 0 : i15, (i17 & 4) != 0 ? 0 : i16, (i17 & 8) != 0 ? null : lVar, (i17 & 16) != 0 ? null : lVar2);
    }
}
