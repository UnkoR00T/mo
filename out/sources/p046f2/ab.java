package p046f2;

import c5.d;
import c5.t;
import fr.k;
import n3.i2;
import n3.m2;
import n3.u0;
import n3.y2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lf2/ab;", "Ln3/y2;", "Lc5/k;", "caretSize", "<init>", "(JLfr/k;)V", "Lm3/k;", "size", "Lc5/t;", "layoutDirection", "Lc5/d;", "density", "Ln3/i2;", "a", "(JLc5/t;Lc5/d;)Ln3/i2;", "b", "J", "getCaretSize-MYxV2XQ", "()J", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ab implements y2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long caretSize;

    public /* synthetic */ ab(long j15, k kVar) {
        this(j15);
    }

    @Override // n3.y2
    public i2 a(long size, t layoutDirection, d density) {
        m2 m2VarA = u0.a();
        float fL2 = density.l2(c5.k.j(this.caretSize));
        float fL3 = density.l2(c5.k.i(this.caretSize));
        m2VarA.s(0.0f, 0.0f);
        float f15 = 2;
        m2VarA.x(fL2 / f15, 0.0f);
        m2VarA.x(0.0f, fL3);
        m2VarA.x((-fL2) / f15, 0.0f);
        m2VarA.close();
        return new i2.a(m2VarA);
    }

    private ab(long j15) {
        this.caretSize = j15;
    }
}
