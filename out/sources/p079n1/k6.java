package p079n1;

import fr.k;
import m3.g;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p036e4.b0;
import p071kotlin.Metadata;
import q4.TextLayoutResult;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\t*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0015\u0010\u000bJ\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001a\u0010\u001d\"\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Ln1/k6;", "", "Lq4/t3;", "value", "Le4/b0;", "innerTextFieldCoordinates", "decorationBoxCoordinates", "<init>", "(Lq4/t3;Le4/b0;Le4/b0;)V", "Lm3/e;", "a", "(J)J", "position", "", "coerceInVisibleBounds", "", "d", "(JZ)I", "offset", "g", "(J)Z", "j", "k", "Lq4/t3;", "f", "()Lq4/t3;", "b", "Le4/b0;", "c", "()Le4/b0;", "i", "(Le4/b0;)V", "h", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TextLayoutResult value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private b0 innerTextFieldCoordinates;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private b0 decorationBoxCoordinates;

    public k6(TextLayoutResult textLayoutResult, b0 b0Var, b0 b0Var2) {
        this.value = textLayoutResult;
        this.innerTextFieldCoordinates = b0Var;
        this.decorationBoxCoordinates = b0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    private final long a(long j15) {
        g gVarA;
        b0 b0Var = this.innerTextFieldCoordinates;
        if (b0Var == null) {
            gVarA = g.INSTANCE.a();
        } else {
            if (b0Var.c()) {
                b0 b0Var2 = this.decorationBoxCoordinates;
                gVarA = null;
                if (b0Var2 != null) {
                    gVarA = b0.z0(b0Var2, b0Var, false, 2, null);
                }
            } else {
                gVarA = g.INSTANCE.a();
            }
            if (gVarA == null) {
                gVarA = g.INSTANCE.a();
            }
        }
        return l6.b(j15, gVarA);
    }

    public static /* synthetic */ int e(k6 k6Var, long j15, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = true;
        }
        return k6Var.d(j15, z15);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getDecorationBoxCoordinates() {
        return this.decorationBoxCoordinates;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getInnerTextFieldCoordinates() {
        return this.innerTextFieldCoordinates;
    }

    public final int d(long position, boolean coerceInVisibleBounds) {
        if (coerceInVisibleBounds) {
            position = a(position);
        }
        return this.value.x(j(position));
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextLayoutResult getValue() {
        return this.value;
    }

    public final boolean g(long offset) {
        long j15 = j(a(offset));
        int iR = this.value.r(Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & j15)));
        int i15 = (int) (j15 >> 32);
        return Float.intBitsToFloat(i15) >= this.value.s(iR) && Float.intBitsToFloat(i15) <= this.value.t(iR);
    }

    public final void h(b0 b0Var) {
        this.decorationBoxCoordinates = b0Var;
    }

    public final void i(b0 b0Var) {
        this.innerTextFieldCoordinates = b0Var;
    }

    public final long j(long offset) {
        b0 b0Var;
        b0 b0Var2 = this.innerTextFieldCoordinates;
        if (b0Var2 == null) {
            return offset;
        }
        if (!b0Var2.c()) {
            b0Var2 = null;
        }
        if (b0Var2 == null || (b0Var = this.decorationBoxCoordinates) == null) {
            return offset;
        }
        b0 b0Var3 = b0Var.c() ? b0Var : null;
        return b0Var3 == null ? offset : b0Var2.r(b0Var3, offset);
    }

    public final long k(long offset) {
        b0 b0Var;
        b0 b0Var2 = this.innerTextFieldCoordinates;
        if (b0Var2 == null) {
            return offset;
        }
        if (!b0Var2.c()) {
            b0Var2 = null;
        }
        if (b0Var2 == null || (b0Var = this.decorationBoxCoordinates) == null) {
            return offset;
        }
        b0 b0Var3 = b0Var.c() ? b0Var : null;
        return b0Var3 == null ? offset : b0Var3.r(b0Var2, offset);
    }

    public /* synthetic */ k6(TextLayoutResult textLayoutResult, b0 b0Var, b0 b0Var2, int i15, k kVar) {
        this(textLayoutResult, (i15 & 2) != 0 ? null : b0Var, (i15 & 4) != 0 ? null : b0Var2);
    }
}
