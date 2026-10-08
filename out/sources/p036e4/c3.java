package p036e4;

import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.p5;
import p076m2.x2;
import p076m2.x3;
import p076m2.z2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R+\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR+\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00128V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010!\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u001a8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010%\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00128V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001a\u0010*\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u0013\u0010)R\u001a\u0010+\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b\"\u0010)R\"\u0010/\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010-\u001a\u0004\b\b\u0010\u001e\"\u0004\b.\u0010 R\"\u00101\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010-\u001a\u0004\b\u000e\u0010\u001e\"\u0004\b0\u0010 R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010-\u001a\u0004\b\u001b\u0010\u001e\"\u0004\b2\u0010 R\"\u00105\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010-\u001a\u0004\b'\u0010\u001e\"\u0004\b4\u0010 ¨\u00066"}, d2 = {"Le4/c3;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "", "<set-?>", "a", "Lm2/a3;", "isVisible", "()Z", "p", "(Z)V", "b", "g", "i", "isAnimating", "", "c", "Lm2/x2;", "getFraction", "()F", "l", "(F)V", "fraction", "", "d", "Lm2/z2;", "getDurationMillis", "()J", "k", "(J)V", "durationMillis", "e", "getAlpha", "h", "alpha", "Le4/c2;", "f", "Le4/c2;", "()Le4/c2;", "source", "target", "Le4/u2;", "J", "j", "current", "m", "maximum", "n", "sourceValueInsets", "o", "targetValueInsets", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final c2 source;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final c2 target;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a3 isVisible = c6.e(Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a3 isAnimating = c6.e(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x2 fraction = x3.a(0.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final z2 durationMillis = p5.a(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final x2 alpha = x3.a(1.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long current = v2.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private long maximum = v2.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long sourceValueInsets = v2.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private long targetValueInsets = v2.a();

    public c3(String str) {
        this.source = e2.a(str + " source");
        this.target = e2.a(str + " target");
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCurrent() {
        return this.current;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getMaximum() {
        return this.maximum;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public c2 getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getSourceValueInsets() {
        return this.sourceValueInsets;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public c2 getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getTargetValueInsets() {
        return this.targetValueInsets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean g() {
        return ((Boolean) this.isAnimating.getValue()).booleanValue();
    }

    public void h(float f15) {
        this.alpha.p(f15);
    }

    public void i(boolean z15) {
        this.isAnimating.setValue(Boolean.valueOf(z15));
    }

    public final void j(long j15) {
        this.current = j15;
    }

    public void k(long j15) {
        this.durationMillis.w(j15);
    }

    public void l(float f15) {
        this.fraction.p(f15);
    }

    public final void m(long j15) {
        this.maximum = j15;
    }

    public final void n(long j15) {
        this.sourceValueInsets = j15;
    }

    public final void o(long j15) {
        this.targetValueInsets = j15;
    }

    public void p(boolean z15) {
        this.isVisible.setValue(Boolean.valueOf(z15));
    }
}
