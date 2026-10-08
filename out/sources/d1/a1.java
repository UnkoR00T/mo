package d1;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0014Ba\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0007\u0012\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\b2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R(\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR(\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c\u0082\u0001\u0001\u001e¨\u0006\u001f"}, d2 = {"Ld1/a1;", "", "Ld1/a1$a;", "type", "", "minLinesToShowCollapse", "minCrossAxisSizeToShowCollapse", "Lkotlin/Function1;", "Ld1/d1;", "Lkotlin/Function0;", "Loq/i0;", "seeMoreGetter", "collapseGetter", "<init>", "(Ld1/a1$a;IILer/l;Ler/l;)V", "b", "()Ld1/d1;", "state", "", "list", "a", "(Ld1/d1;Ljava/util/List;)V", "Ld1/a1$a;", "getType$foundation_layout", "()Ld1/a1$a;", "I", "c", "d", "Ler/l;", "e", "Ld1/k1;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
@oq.a
public abstract class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int minLinesToShowCollapse;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int minCrossAxisSizeToShowCollapse;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final er.l<FlowLayoutOverflowState, er.p<p076m2.r, Integer, oq.i0>> seeMoreGetter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final er.l<FlowLayoutOverflowState, er.p<p076m2.r, Integer, oq.i0>> collapseGetter;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Ld1/a1$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        Visible,
        Clip,
        ExpandIndicator,
        ExpandOrCollapseIndicator;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ wq.a f39018f = wq.b.a(b());
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39019a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.ExpandIndicator.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.ExpandOrCollapseIndicator.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f39019a = iArr;
        }
    }

    public /* synthetic */ a1(a aVar, int i15, int i16, er.l lVar, er.l lVar2, fr.k kVar) {
        this(aVar, i15, i16, lVar, lVar2);
    }

    public final void a(FlowLayoutOverflowState state, List<er.p<p076m2.r, Integer, oq.i0>> list) {
        er.l<FlowLayoutOverflowState, er.p<p076m2.r, Integer, oq.i0>> lVar = this.seeMoreGetter;
        er.p<p076m2.r, Integer, oq.i0> pVarB = lVar != null ? lVar.b(state) : null;
        er.l<FlowLayoutOverflowState, er.p<p076m2.r, Integer, oq.i0>> lVar2 = this.collapseGetter;
        er.p<p076m2.r, Integer, oq.i0> pVarB2 = lVar2 != null ? lVar2.b(state) : null;
        int i15 = b.f39019a[this.type.ordinal()];
        if (i15 == 1) {
            if (pVarB != null) {
                list.add(pVarB);
            }
        } else {
            if (i15 != 2) {
                return;
            }
            if (pVarB != null) {
                list.add(pVarB);
            }
            if (pVarB2 != null) {
                list.add(pVarB2);
            }
        }
    }

    public final FlowLayoutOverflowState b() {
        return new FlowLayoutOverflowState(this.type, this.minLinesToShowCollapse, this.minCrossAxisSizeToShowCollapse);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private a1(a aVar, int i15, int i16, er.l<? super FlowLayoutOverflowState, ? extends er.p<? super p076m2.r, ? super Integer, oq.i0>> lVar, er.l<? super FlowLayoutOverflowState, ? extends er.p<? super p076m2.r, ? super Integer, oq.i0>> lVar2) {
        this.type = aVar;
        this.minLinesToShowCollapse = i15;
        this.minCrossAxisSizeToShowCollapse = i16;
        this.seeMoreGetter = lVar;
        this.collapseGetter = lVar2;
    }
}
