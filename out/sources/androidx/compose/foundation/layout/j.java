package androidx.compose.foundation.layout;

import c5.n;
import c5.r;
import c5.t;
import d1.n0;
import er.p;
import g4.l0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Landroidx/compose/foundation/layout/j;", "Lg4/l0;", "Landroidx/compose/foundation/layout/l;", "Ld1/n0;", "direction", "", "unbounded", "Lkotlin/Function2;", "Lc5/r;", "Lc5/t;", "Lc5/n;", "alignmentCallback", "", "align", "", "inspectorName", "<init>", "(Ld1/n0;ZLer/p;Ljava/lang/Object;Ljava/lang/String;)V", "a", "()Landroidx/compose/foundation/layout/l;", "node", "Loq/i0;", "l", "(Landroidx/compose/foundation/layout/l;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Ld1/n0;", "e", "Z", "f", "Ler/p;", "g", "Ljava/lang/Object;", "h", "Ljava/lang/String;", "i", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j extends l0<l> {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final n0 direction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean unbounded;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p<r, t, n> alignmentCallback;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Object align;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String inspectorName;

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.j$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/layout/j$a;", "", "<init>", "()V", "Lf3/c$b;", "align", "", "unbounded", "Landroidx/compose/foundation/layout/j;", "h", "(Lf3/c$b;Z)Landroidx/compose/foundation/layout/j;", "Lf3/c$c;", "d", "(Lf3/c$c;Z)Landroidx/compose/foundation/layout/j;", "Lf3/c;", "f", "(Lf3/c;Z)Landroidx/compose/foundation/layout/j;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n e(f3.c.InterfaceC1317c interfaceC1317c, r rVar, t tVar) {
            return n.c(n.d((((long) 0) << 32) | (BodyPartID.bodyIdMax & ((long) interfaceC1317c.a(0, (int) (rVar.getPackedValue() & BodyPartID.bodyIdMax))))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n g(f3.c cVar, r rVar, t tVar) {
            return n.c(cVar.a(r.INSTANCE.a(), rVar.getPackedValue(), tVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final n i(f3.c.b bVar, r rVar, t tVar) {
            return n.c(n.d((((long) bVar.a(0, (int) (rVar.getPackedValue() >> 32), tVar)) << 32) | (((long) 0) & BodyPartID.bodyIdMax)));
        }

        public final j d(final f3.c.InterfaceC1317c align, boolean unbounded) {
            return new j(n0.Vertical, unbounded, new p() { // from class: d1.x4
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return androidx.compose.foundation.layout.j.Companion.e(align, (c5.r) obj, (c5.t) obj2);
                }
            }, align, "wrapContentHeight");
        }

        public final j f(final f3.c align, boolean unbounded) {
            return new j(n0.Both, unbounded, new p() { // from class: d1.y4
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return androidx.compose.foundation.layout.j.Companion.g(align, (c5.r) obj, (c5.t) obj2);
                }
            }, align, "wrapContentSize");
        }

        public final j h(final f3.c.b align, boolean unbounded) {
            return new j(n0.Horizontal, unbounded, new p() { // from class: d1.w4
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return androidx.compose.foundation.layout.j.Companion.i(align, (c5.r) obj, (c5.t) obj2);
                }
            }, align, "wrapContentWidth");
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(n0 n0Var, boolean z15, p<? super r, ? super t, n> pVar, Object obj, String str) {
        this.direction = n0Var;
        this.unbounded = z15;
        this.alignmentCallback = pVar;
        this.align = obj;
        this.inspectorName = str;
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public l create() {
        return new l(this.direction, this.unbounded, this.alignmentCallback);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || j.class != other.getClass()) {
            return false;
        }
        j jVar = (j) other;
        return this.direction == jVar.direction && this.unbounded == jVar.unbounded && fr.t.c(this.align, jVar.align);
    }

    public int hashCode() {
        return (((this.direction.hashCode() * 31) + Boolean.hashCode(this.unbounded)) * 31) + this.align.hashCode();
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(l node) {
        node.q3(this.direction);
        node.r3(this.unbounded);
        node.p3(this.alignmentCallback);
    }
}
