package w0;

import android.content.Context;
import android.widget.EdgeEffect;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0012J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0012J\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0012J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0012J\r\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0012J\r\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u0012J\r\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u0012J\r\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u0012J\r\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u0012J\r\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0012J\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010\u001fJ\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\u001fJ\r\u0010\"\u001a\u00020\n¢\u0006\u0004\b\"\u0010\u001fJ\r\u0010#\u001a\u00020\n¢\u0006\u0004\b#\u0010\u001fJ\r\u0010$\u001a\u00020\n¢\u0006\u0004\b$\u0010\u001fJ\r\u0010%\u001a\u00020\n¢\u0006\u0004\b%\u0010\u001fJ\r\u0010&\u001a\u00020\n¢\u0006\u0004\b&\u0010\u001fJ\u0015\u0010)\u001a\u00020\r2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00102R\u0018\u00106\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00102R\u0018\u00107\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00102R\u0018\u00108\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00102R\u0018\u00109\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00102R\u0018\u0010:\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00102R\u001a\u0010=\u001a\u00020\u0010*\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u001a\u0010?\u001a\u00020\u0010*\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010<¨\u0006@"}, d2 = {"Lw0/m0;", "", "Landroid/content/Context;", "context", "", "glowColor", "<init>", "(Landroid/content/Context;I)V", "Lz0/a2;", "orientation", "Landroid/widget/EdgeEffect;", "e", "(Lz0/a2;)Landroid/widget/EdgeEffect;", "Loq/i0;", "f", "()V", "", "B", "()Z", "r", "u", "x", "A", "q", "t", "w", "z", "p", "s", "v", "m", "()Landroid/widget/EdgeEffect;", "g", "i", "k", "n", "h", "j", "l", "Lc5/r;", "size", "C", "(J)V", "a", "Landroid/content/Context;", "b", "I", "c", "J", "d", "Landroid/widget/EdgeEffect;", "topEffect", "bottomEffect", "leftEffect", "rightEffect", "topEffectNegation", "bottomEffectNegation", "leftEffectNegation", "rightEffectNegation", "y", "(Landroid/widget/EdgeEffect;)Z", "isStretched", "o", "isAnimating", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int glowColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long size = c5.r.INSTANCE.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private EdgeEffect topEffect;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private EdgeEffect bottomEffect;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private EdgeEffect leftEffect;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private EdgeEffect rightEffect;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private EdgeEffect topEffectNegation;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private EdgeEffect bottomEffectNegation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private EdgeEffect leftEffectNegation;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private EdgeEffect rightEffectNegation;

    public m0(Context context, int i15) {
        this.context = context;
        this.glowColor = i15;
    }

    private final EdgeEffect e(p143z0.a2 orientation) {
        EdgeEffect edgeEffectB = k0.f208985a.b(this.context);
        edgeEffectB.setColor(this.glowColor);
        if (!c5.r.e(this.size, c5.r.INSTANCE.a())) {
            if (orientation == p143z0.a2.Vertical) {
                long j15 = this.size;
                edgeEffectB.setSize((int) (j15 >> 32), (int) (j15 & BodyPartID.bodyIdMax));
                return edgeEffectB;
            }
            long j16 = this.size;
            edgeEffectB.setSize((int) (j16 & BodyPartID.bodyIdMax), (int) (j16 >> 32));
        }
        return edgeEffectB;
    }

    private final boolean o(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    private final boolean y(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(k0.f208985a.c(edgeEffect) == 0.0f);
    }

    public final boolean A() {
        return y(this.topEffectNegation);
    }

    public final boolean B() {
        return y(this.topEffect);
    }

    public final void C(long size) {
        this.size = size;
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            edgeEffect.setSize((int) (size >> 32), (int) (size & BodyPartID.bodyIdMax));
        }
        EdgeEffect edgeEffect2 = this.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.setSize((int) (size >> 32), (int) (size & BodyPartID.bodyIdMax));
        }
        EdgeEffect edgeEffect3 = this.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.setSize((int) (size & BodyPartID.bodyIdMax), (int) (size >> 32));
        }
        EdgeEffect edgeEffect4 = this.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.setSize((int) (size & BodyPartID.bodyIdMax), (int) (size >> 32));
        }
        EdgeEffect edgeEffect5 = this.topEffectNegation;
        if (edgeEffect5 != null) {
            edgeEffect5.setSize((int) (size >> 32), (int) (size & BodyPartID.bodyIdMax));
        }
        EdgeEffect edgeEffect6 = this.bottomEffectNegation;
        if (edgeEffect6 != null) {
            edgeEffect6.setSize((int) (size >> 32), (int) (size & BodyPartID.bodyIdMax));
        }
        EdgeEffect edgeEffect7 = this.leftEffectNegation;
        if (edgeEffect7 != null) {
            edgeEffect7.setSize((int) (size & BodyPartID.bodyIdMax), (int) (size >> 32));
        }
        EdgeEffect edgeEffect8 = this.rightEffectNegation;
        if (edgeEffect8 != null) {
            edgeEffect8.setSize((int) (BodyPartID.bodyIdMax & size), (int) (size >> 32));
        }
    }

    public final void f() {
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            edgeEffect.finish();
        }
        EdgeEffect edgeEffect2 = this.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.finish();
        }
        EdgeEffect edgeEffect3 = this.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.finish();
        }
        EdgeEffect edgeEffect4 = this.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.finish();
        }
        EdgeEffect edgeEffect5 = this.topEffectNegation;
        if (edgeEffect5 != null) {
            edgeEffect5.finish();
        }
        EdgeEffect edgeEffect6 = this.bottomEffectNegation;
        if (edgeEffect6 != null) {
            edgeEffect6.finish();
        }
        EdgeEffect edgeEffect7 = this.leftEffectNegation;
        if (edgeEffect7 != null) {
            edgeEffect7.finish();
        }
        EdgeEffect edgeEffect8 = this.rightEffectNegation;
        if (edgeEffect8 != null) {
            edgeEffect8.finish();
        }
    }

    public final EdgeEffect g() {
        EdgeEffect edgeEffect = this.bottomEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e(p143z0.a2.Vertical);
        this.bottomEffect = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect h() {
        EdgeEffect edgeEffect = this.bottomEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e(p143z0.a2.Vertical);
        this.bottomEffectNegation = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect i() {
        EdgeEffect edgeEffect = this.leftEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e(p143z0.a2.Horizontal);
        this.leftEffect = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect j() {
        EdgeEffect edgeEffect = this.leftEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e(p143z0.a2.Horizontal);
        this.leftEffectNegation = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect k() {
        EdgeEffect edgeEffect = this.rightEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e(p143z0.a2.Horizontal);
        this.rightEffect = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect l() {
        EdgeEffect edgeEffect = this.rightEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e(p143z0.a2.Horizontal);
        this.rightEffectNegation = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect m() {
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e(p143z0.a2.Vertical);
        this.topEffect = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect n() {
        EdgeEffect edgeEffect = this.topEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e(p143z0.a2.Vertical);
        this.topEffectNegation = edgeEffectE;
        return edgeEffectE;
    }

    public final boolean p() {
        return o(this.bottomEffect);
    }

    public final boolean q() {
        return y(this.bottomEffectNegation);
    }

    public final boolean r() {
        return y(this.bottomEffect);
    }

    public final boolean s() {
        return o(this.leftEffect);
    }

    public final boolean t() {
        return y(this.leftEffectNegation);
    }

    public final boolean u() {
        return y(this.leftEffect);
    }

    public final boolean v() {
        return o(this.rightEffect);
    }

    public final boolean w() {
        return y(this.rightEffectNegation);
    }

    public final boolean x() {
        return y(this.rightEffect);
    }

    public final boolean z() {
        return o(this.topEffect);
    }
}
