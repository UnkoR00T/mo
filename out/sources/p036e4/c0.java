package p036e4;

import androidx.compose.ui.node.NodeCoordinator;
import m3.e;
import m3.g;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u000b\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\r\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\r\u0010\u0003\u001a\u0011\u0010\u000e\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\b\u001a\u0011\u0010\u000f\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Le4/b0;", "Lm3/e;", "g", "(Le4/b0;)J", "h", "i", "Lm3/g;", "b", "(Le4/b0;)Lm3/g;", "", "clipBounds", "c", "(Le4/b0;Z)Lm3/g;", "f", "a", "e", "(Le4/b0;)Le4/b0;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c0 {
    public static final g a(b0 b0Var) {
        g gVarZ0;
        b0 b0VarR0 = b0Var.r0();
        return (b0VarR0 == null || (gVarZ0 = b0.z0(b0VarR0, b0Var, false, 2, null)) == null) ? new g(0.0f, 0.0f, (int) (b0Var.b() >> 32), (int) (b0Var.b() & BodyPartID.bodyIdMax)) : gVarZ0;
    }

    public static final g b(b0 b0Var) {
        return b0.z0(e(b0Var), b0Var, false, 2, null);
    }

    public static final g c(b0 b0Var, boolean z15) {
        b0 b0VarE = e(b0Var);
        float fB = (int) (b0VarE.b() >> 32);
        float fB2 = (int) (b0VarE.b() & BodyPartID.bodyIdMax);
        g gVarY = b0VarE.Y(b0Var, z15);
        float left = gVarY.getLeft();
        if (z15) {
            if (left < 0.0f) {
                left = 0.0f;
            }
            if (left > fB) {
                left = fB;
            }
        }
        float top = gVarY.getTop();
        if (z15) {
            if (top < 0.0f) {
                top = 0.0f;
            }
            if (top > fB2) {
                top = fB2;
            }
        }
        if (z15) {
            float right = gVarY.getRight();
            if (right < 0.0f) {
                right = 0.0f;
            }
            if (right <= fB) {
                fB = right;
            }
        } else {
            fB = gVarY.getRight();
        }
        if (z15) {
            float bottom = gVarY.getBottom();
            float f15 = bottom >= 0.0f ? bottom : 0.0f;
            if (f15 <= fB2) {
                fB2 = f15;
            }
        } else {
            fB2 = gVarY.getBottom();
        }
        if (left == fB || top == fB2) {
            return g.INSTANCE.a();
        }
        long jW = b0VarE.W(e.e((((long) Float.floatToRawIntBits(left)) << 32) | (((long) Float.floatToRawIntBits(top)) & BodyPartID.bodyIdMax)));
        long jW2 = b0VarE.W(e.e((((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(top)) & BodyPartID.bodyIdMax)));
        long jW3 = b0VarE.W(e.e((((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fB2)) & BodyPartID.bodyIdMax)));
        long jW4 = b0VarE.W(e.e((((long) Float.floatToRawIntBits(fB2)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(left)) << 32)));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jW >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jW2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jW4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jW3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jW & BodyPartID.bodyIdMax));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jW2 & BodyPartID.bodyIdMax));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jW4 & BodyPartID.bodyIdMax));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jW3 & BodyPartID.bodyIdMax));
        return new g(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static /* synthetic */ g d(b0 b0Var, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        return c(b0Var, z15);
    }

    public static final b0 e(b0 b0Var) {
        b0 b0Var2;
        b0 b0VarR0 = b0Var.r0();
        while (true) {
            b0 b0Var3 = b0VarR0;
            b0Var2 = b0Var;
            b0Var = b0Var3;
            if (b0Var == null) {
                break;
            }
            b0VarR0 = b0Var.r0();
        }
        NodeCoordinator nodeCoordinator = b0Var2 instanceof NodeCoordinator ? (NodeCoordinator) b0Var2 : null;
        if (nodeCoordinator == null) {
            return b0Var2;
        }
        NodeCoordinator wrappedBy = nodeCoordinator.getWrappedBy();
        while (true) {
            NodeCoordinator nodeCoordinator2 = wrappedBy;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator == null) {
                return nodeCoordinator3;
            }
            wrappedBy = nodeCoordinator.getWrappedBy();
        }
    }

    public static final long f(b0 b0Var) {
        b0 b0VarR0 = b0Var.r0();
        return b0VarR0 != null ? b0VarR0.r(b0Var, e.INSTANCE.c()) : e.INSTANCE.c();
    }

    public static final long g(b0 b0Var) {
        return b0Var.A0(e.INSTANCE.c());
    }

    public static final long h(b0 b0Var) {
        return b0Var.W(e.INSTANCE.c());
    }

    public static final long i(b0 b0Var) {
        return b0Var.k(e.INSTANCE.c());
    }
}
