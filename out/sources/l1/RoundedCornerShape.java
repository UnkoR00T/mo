package l1;

import fr.t;
import m3.j;
import m3.l;
import n3.i2;
import n3.t2;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: l1.g, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001f\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Ll1/g;", "Ll1/a;", "Ll1/b;", "topStart", "topEnd", "bottomEnd", "bottomStart", "<init>", "(Ll1/b;Ll1/b;Ll1/b;Ll1/b;)V", "Lm3/k;", "size", "", "Lc5/t;", "layoutDirection", "Ln3/i2;", "e", "(JFFFFLc5/t;)Ln3/i2;", "j", "(Ll1/b;Ll1/b;Ll1/b;Ll1/b;)Ll1/g;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "t", "b", "(Ljava/lang/Object;F)Ljava/lang/Object;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RoundedCornerShape extends a {
    public RoundedCornerShape(b bVar, b bVar2, b bVar3, b bVar4) {
        super(bVar, bVar2, bVar3, bVar4);
    }

    @Override // l1.a, n3.f2
    public Object b(Object other, float t15) {
        if (t.c(other, t2.a()) || other == null) {
            other = h.a(0.0f);
        }
        if (other instanceof RoundedCornerShape) {
            return h.k(this, (RoundedCornerShape) other, t15);
        }
        return null;
    }

    @Override // l1.a
    public i2 e(long size, float topStart, float topEnd, float bottomEnd, float bottomStart, c5.t layoutDirection) {
        if (topStart + topEnd + bottomEnd + bottomStart == 0.0f) {
            return new i2.b(l.c(size));
        }
        m3.g gVarC = l.c(size);
        c5.t tVar = c5.t.Ltr;
        float f15 = layoutDirection == tVar ? topStart : topEnd;
        long jB = m3.a.b((((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f15)) & BodyPartID.bodyIdMax));
        float f16 = layoutDirection == tVar ? topEnd : topStart;
        long jB2 = m3.a.b((((long) Float.floatToRawIntBits(f16)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(f16)) << 32));
        float f17 = layoutDirection == tVar ? bottomEnd : bottomStart;
        long jB3 = m3.a.b((((long) Float.floatToRawIntBits(f17)) << 32) | (((long) Float.floatToRawIntBits(f17)) & BodyPartID.bodyIdMax));
        float f18 = layoutDirection == tVar ? bottomStart : bottomEnd;
        return new i2.c(j.c(gVarC, jB, jB2, jB3, m3.a.b((((long) Float.floatToRawIntBits(f18)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(f18)) << 32))));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundedCornerShape)) {
            return false;
        }
        RoundedCornerShape roundedCornerShape = (RoundedCornerShape) other;
        return t.c(getTopStart(), roundedCornerShape.getTopStart()) && t.c(getTopEnd(), roundedCornerShape.getTopEnd()) && t.c(getBottomEnd(), roundedCornerShape.getBottomEnd()) && t.c(getBottomStart(), roundedCornerShape.getBottomStart());
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    @Override // l1.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public RoundedCornerShape c(b topStart, b topEnd, b bottomEnd, b bottomStart) {
        return new RoundedCornerShape(topStart, topEnd, bottomEnd, bottomStart);
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ')';
    }
}
