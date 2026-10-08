package n3;

import android.graphics.Paint;
import android.graphics.Shader;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006R\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0005R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001e\u0010\u0014\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R.\u0010!\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010&\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010#\"\u0004\b$\u0010%R$\u0010(\u001a\u00020'2\u0006\u0010(\u001a\u00020'8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\r\u0010)\"\u0004\b*\u0010+R$\u0010/\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010,\"\u0004\b-\u0010.R$\u00103\u001a\u0002002\u0006\u0010\u001a\u001a\u0002008V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R$\u00106\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b4\u0010#\"\u0004\b5\u0010%R$\u0010:\u001a\u0002072\u0006\u0010\u001a\u001a\u0002078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b8\u0010,\"\u0004\b9\u0010.R$\u0010>\u001a\u00020;2\u0006\u0010\u001a\u001a\u00020;8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b<\u0010,\"\u0004\b=\u0010.R$\u0010A\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b?\u0010#\"\u0004\b@\u0010%R$\u0010E\u001a\u00020B2\u0006\u0010\u001a\u001a\u00020B8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bC\u0010,\"\u0004\bD\u0010.R4\u0010J\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\u000e\u0010\u001a\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR(\u0010M\u001a\u0004\u0018\u00010\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010K\"\u0004\b\u0016\u0010L¨\u0006N"}, d2 = {"Ln3/n0;", "Ln3/k2;", "Landroid/graphics/Paint;", "internalPaint", "<init>", "(Landroid/graphics/Paint;)V", "()V", "a", "Landroid/graphics/Paint;", "x", "()Landroid/graphics/Paint;", "setInternalPaint$ui_graphics", "Ln3/a1;", "b", "I", "_blendMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "c", "Landroid/graphics/Shader;", "internalShader", "Ln3/n1;", "d", "Ln3/n1;", "internalColorFilter", "Ln3/n2;", "value", "e", "Ln3/n2;", "n", "()Ln3/n2;", "h", "(Ln3/n2;)V", "pathEffect", "", "()F", "g", "(F)V", "alpha", "Landroidx/compose/ui/graphics/Color;", "color", "()J", "m", "(J)V", "()I", "f", "(I)V", "blendMode", "Ln3/l2;", "getStyle-TiuSbCo", "u", "style", "w", "v", "strokeWidth", "Ln3/a3;", "k", "i", "strokeCap", "Ln3/b3;", "o", "l", "strokeJoin", "p", "s", "strokeMiterLimit", "Ln3/v1;", "t", "j", "filterQuality", "r", "()Landroid/graphics/Shader;", "q", "(Landroid/graphics/Shader;)V", "shader", "()Ln3/n1;", "(Ln3/n1;)V", "colorFilter", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n0 implements k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Paint internalPaint;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int _blendMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Shader internalShader;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private n1 internalColorFilter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private n2 pathEffect;

    public n0(Paint paint) {
        this.internalPaint = paint;
        this._blendMode = a1.INSTANCE.B();
    }

    @Override // n3.k2
    public float a() {
        return o0.c(this.internalPaint);
    }

    @Override // n3.k2
    public long b() {
        return o0.d(this.internalPaint);
    }

    @Override // n3.k2
    /* JADX INFO: renamed from: c, reason: from getter */
    public n1 getInternalColorFilter() {
        return this.internalColorFilter;
    }

    @Override // n3.k2
    public void d(n1 n1Var) {
        this.internalColorFilter = n1Var;
        o0.o(this.internalPaint, n1Var);
    }

    @Override // n3.k2
    /* JADX INFO: renamed from: e, reason: from getter */
    public int get_blendMode() {
        return this._blendMode;
    }

    @Override // n3.k2
    public void f(int i15) {
        if (a1.E(this._blendMode, i15)) {
            return;
        }
        this._blendMode = i15;
        o0.m(this.internalPaint, i15);
    }

    @Override // n3.k2
    public void g(float f15) {
        o0.l(this.internalPaint, f15);
    }

    @Override // n3.k2
    public void h(n2 n2Var) {
        o0.q(this.internalPaint, n2Var);
        this.pathEffect = n2Var;
    }

    @Override // n3.k2
    public void i(int i15) {
        o0.s(this.internalPaint, i15);
    }

    @Override // n3.k2
    public void j(int i15) {
        o0.p(this.internalPaint, i15);
    }

    @Override // n3.k2
    public int k() {
        return o0.g(this.internalPaint);
    }

    @Override // n3.k2
    public void l(int i15) {
        o0.t(this.internalPaint, i15);
    }

    @Override // n3.k2
    public void m(long j15) {
        o0.n(this.internalPaint, j15);
    }

    @Override // n3.k2
    /* JADX INFO: renamed from: n, reason: from getter */
    public n2 getPathEffect() {
        return this.pathEffect;
    }

    @Override // n3.k2
    public int o() {
        return o0.h(this.internalPaint);
    }

    @Override // n3.k2
    public float p() {
        return o0.i(this.internalPaint);
    }

    @Override // n3.k2
    public void q(Shader shader) {
        this.internalShader = shader;
        o0.r(this.internalPaint, shader);
    }

    @Override // n3.k2
    /* JADX INFO: renamed from: r, reason: from getter */
    public Shader getInternalShader() {
        return this.internalShader;
    }

    @Override // n3.k2
    public void s(float f15) {
        o0.u(this.internalPaint, f15);
    }

    @Override // n3.k2
    public int t() {
        return o0.e(this.internalPaint);
    }

    @Override // n3.k2
    public void u(int i15) {
        o0.w(this.internalPaint, i15);
    }

    @Override // n3.k2
    public void v(float f15) {
        o0.v(this.internalPaint, f15);
    }

    @Override // n3.k2
    public float w() {
        return o0.j(this.internalPaint);
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final Paint getInternalPaint() {
        return this.internalPaint;
    }

    public n0() {
        this(o0.k());
    }
}
