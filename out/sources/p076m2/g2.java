package p076m2;

import fr.t;
import java.util.ArrayList;
import java.util.List;
import n2.b;
import oq.g;
import oq.i0;
import oq.r;
import oq.y;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import r0.i1;
import r0.t0;
import r0.u0;
import r2.b0;
import r2.f;
import r2.o;
import r2.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u0001H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aE\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u001a0\u0019*\u00020\u00122\n\u0010\u0014\u001a\u00060\u000fj\u0002`\u00132\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a!\u0010\u001d\u001a\u0004\u0018\u00010\u0016*\u00020\u00122\n\u0010\u0014\u001a\u00060\u000fj\u0002`\u0013H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a7\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"\"\b\b\u0000\u0010\u001f*\u00020\u0017\"\b\b\u0001\u0010 *\u00020\u00172\u0006\u0010!\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010$\u001a\u0013\u0010&\u001a\u00020\u000f*\u00020%H\u0002¢\u0006\u0004\b&\u0010'\u001a\u0013\u0010(\u001a\u00020%*\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010)\u001a/\u0010,\u001a\u00060\u0000j\u0002`\u0001*\u00020\f2\n\u0010*\u001a\u00060\u0000j\u0002`\u00012\n\u0010+\u001a\u00060\u0000j\u0002`\u0001H\u0002¢\u0006\u0004\b,\u0010-\u001a;\u00100\u001a\u00060\u000fj\u0002`\u0013*\u00020.2\n\u0010/\u001a\u00060\u000fj\u0002`\u00132\n\u0010*\u001a\u00060\u000fj\u0002`\u00132\n\u0010+\u001a\u00060\u000fj\u0002`\u0013H\u0002¢\u0006\u0004\b0\u00101\u001a'\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0019*\u00020\f2\n\u0010\u0014\u001a\u00060\u000fj\u0002`\u0013H\u0002¢\u0006\u0004\b2\u00103\"\u001c\u00107\u001a\u00020%*\u00060\u0000j\u0002`48BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106*\u0010\b\u0002\u00108\"\u0002`\u00012\u00060\u0000j\u0002`\u0001¨\u00069"}, d2 = {"", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "t", "(J)J", "Lm2/r;", "Lm2/f2;", "j", "(Lm2/r;)Lm2/f2;", "Lm2/v4;", "Lm2/j2;", "k", "(Lm2/v4;)Lm2/j2;", "Lr2/o;", "Lm2/v;", "context", "", "o", "(Lr2/o;Lm2/v;)Ljava/lang/Integer;", "Lr2/b0;", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "group", "Ln2/g;", "Lm2/f4;", "", "invalidations", "", "Loq/r;", "n", "(Lr2/b0;ILr0/t0;)Ljava/util/List;", "q", "(Lr2/b0;I)Lm2/f4;", "K", "V", "initialCapacity", "Ln2/b;", "s", "(I)Lr0/t0;", "", "i", "(Z)I", "h", "(I)Z", "a", "b", "p", "(Lr2/o;JJ)J", "Lr2/q;", "parent", "m", "(Lr2/q;III)I", "l", "(Lr2/o;I)Ljava/util/List;", "Landroidx/compose/runtime/VirtualGroupHandle;", "r", "(J)Z", "isInsertHandle", "VirtualGroupHandle", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(int i15) {
        return i15 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(boolean z15) {
        return z15 ? 1 : 0;
    }

    public static final f2 j(r rVar) {
        f2 f2Var = rVar instanceof f2 ? (f2) rVar : null;
        if (f2Var != null) {
            return f2Var;
        }
        t.c("Inconsistent composition");
        throw new g();
    }

    public static final j2 k(v4 v4Var) {
        j2 j2Var = v4Var instanceof j2 ? (j2) v4Var : null;
        if (j2Var != null) {
            return j2Var;
        }
        t.c("Inconsistent composition");
        throw new g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> l(o oVar, int i15) {
        boolean z15;
        int i16;
        ArrayList arrayList = new ArrayList();
        b0 b0VarY = oVar.Y();
        try {
            q qVar = b0VarY.addressSpace;
            if (i15 >= 0) {
                o1 o1Var = new o1();
                int[] groups = qVar.getGroups();
                int iG = i15;
                while (true) {
                    if (b0VarY.P(iG)) {
                        arrayList.add(b0VarY.S(iG));
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    if (iG != i15 && (i16 = groups[iG + 1]) >= 0) {
                        o1Var.i(i16);
                    }
                    iG = groups[iG + 3];
                    if (!z15 || iG < 0) {
                        if (o1Var.tos == 0) {
                            break;
                        }
                        iG = o1Var.g();
                    }
                }
            }
            i0 i0Var = i0.f148189a;
            return arrayList;
        } finally {
            b0VarY.d();
        }
    }

    private static final int m(q qVar, int i15, int i16, int i17) {
        if (i16 != -1) {
            if (i17 != -1) {
                int[] groups = qVar.getGroups();
                for (int i18 = groups[i15 + 3]; i18 > 0; i18 = groups[i18 + 1]) {
                    if (i18 != i16) {
                        if (i18 != i17) {
                        }
                    }
                }
                t.c("Unexpected slot table structure");
                throw new g();
            }
            return i16;
        }
        return i17;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a2 A[LOOP:1: B:26:0x005f->B:38:0x00a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a5 A[EDGE_INSN: B:47:0x00a5->B:39:0x00a5 BREAK  A[LOOP:1: B:26:0x005f->B:38:0x00a2], SYNTHETIC] */
    public static final List<r<f4, Object>> n(b0 b0Var, int i15, t0<Object, Object> t0Var) {
        int i16;
        if (n2.g.j(t0Var)) {
            return v.n();
        }
        List listC = v.c();
        u0 u0VarB = i1.b();
        q addressSpace = b0Var.getTable().getAddressSpace();
        if (i15 >= 0) {
            o1 o1Var = new o1();
            int[] groups = addressSpace.getGroups();
            int iG = i15;
            while (true) {
                f4 f4VarQ = q(b0Var, iG);
                if (f4VarQ != null) {
                    u0VarB.i(f4VarQ);
                }
                if (iG != i15 && (i16 = groups[iG + 1]) >= 0) {
                    o1Var.i(i16);
                }
                iG = groups[iG + 3];
                if (iG < 0) {
                    if (o1Var.tos == 0) {
                        break;
                    }
                    iG = o1Var.g();
                }
            }
        }
        Object[] objArr = t0Var.keys;
        Object[] objArr2 = t0Var.values;
        long[] jArr = t0Var.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i17 = 0;
            while (true) {
                long j15 = jArr[i17];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i17 != length) {
                        break;
                        break;
                    }
                    i17++;
                } else {
                    int i18 = 8 - ((~(i17 - length)) >>> 31);
                    for (int i19 = 0; i19 < i18; i19++) {
                        if ((255 & j15) < 128) {
                            int i25 = (i17 << 3) + i19;
                            Object obj = objArr[i25];
                            Object obj2 = objArr2[i25];
                            f4 f4Var = (f4) obj;
                            if (u0VarB.a(f4Var)) {
                                listC.add(y.a(f4Var, obj2));
                            }
                        }
                        j15 >>= 8;
                    }
                    if (i18 != 8) {
                        break;
                    }
                    if (i17 != length) {
                        break;
                    }
                    i17++;
                }
            }
        }
        return v.a(listC);
    }

    public static final Integer o(o oVar, v vVar) {
        int i15;
        b0 b0VarY = oVar.Y();
        try {
            int root = oVar.getRoot();
            int iH = b0VarY.h(root);
            loop0: while (iH != -1) {
                if ((oVar.S(iH) & 1073741824) == 1073741824 && (i15 = oVar.E()[iH + 5]) != -1) {
                    q addressSpace = oVar.getAddressSpace();
                    int iC = (i15 & 15) + 1;
                    int i16 = i15 >> 4;
                    if (iC > 15) {
                        iC = addressSpace.o().c(i16);
                    }
                    for (int i17 = 0; i17 < iC; i17++) {
                        Object obj = oVar.Q()[i16 + i17];
                        if (t.c(obj, r.INSTANCE.a())) {
                            break;
                        }
                        v4 v4Var = obj instanceof v4 ? (v4) obj : null;
                        u4 wrapped = v4Var != null ? v4Var.getWrapped() : null;
                        f2.a aVar = wrapped instanceof f2.a ? (f2.a) wrapped : null;
                        if (aVar != null && t.c(aVar.getRef(), vVar)) {
                            Integer numValueOf = Integer.valueOf(iH);
                            b0VarY.d();
                            return numValueOf;
                        }
                    }
                }
                int iH2 = b0VarY.h(iH);
                if (iH2 == -1 || (oVar.S(iH) & PKIFailureInfo.systemUnavail) != Integer.MIN_VALUE) {
                    int iU = iH;
                    iH = b0VarY.R(iH);
                    while (iH == -1) {
                        iU = b0VarY.U(iU);
                        if (iU == -1 || iU == root) {
                            break loop0;
                            break loop0;
                        }
                        iH = b0VarY.R(iU);
                    }
                } else {
                    iH = iH2;
                }
            }
            i0 i0Var = i0.f148189a;
            b0VarY.d();
            return null;
        } catch (Throwable th4) {
            b0VarY.d();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e4, code lost:
    
        if (r2 == r3) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fb, code lost:
    
        if (r3 == r2) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long p(r2.o r12, long r13, long r15) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p076m2.g2.p(r2.o, long, long):long");
    }

    public static final f4 q(b0 b0Var, int i15) {
        Object objT = b0Var.t(i15, 0);
        if (objT instanceof f4) {
            return (f4) objT;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(long j15) {
        return f.b(j15) < -8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> t0<Object, Object> s(int i15) {
        return b.d(new t0(i15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long t(long j15) {
        int iA = f.a(j15);
        return (((long) oq.b0.e((-10) - f.b(j15))) & BodyPartID.bodyIdMax) | (((long) iA) << 32);
    }
}
