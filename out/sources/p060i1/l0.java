package p060i1;

import er.p;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p056h1.j1;
import p056h1.n;
import p056h1.o0;
import p056h1.r0;
import p056h1.z;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import y2.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0014\u0010$\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001b¨\u0006%"}, d2 = {"Li1/l0;", "Lh1/o0;", "Li1/i1;", "state", "Lh1/z;", "Li1/y;", "intervalContent", "Lh1/r0;", "keyIndexMap", "<init>", "(Li1/i1;Lh1/z;Lh1/r0;)V", "", "index", "", "key", "Loq/i0;", "h", "(ILjava/lang/Object;Lm2/r;I)V", "d", "(I)Ljava/lang/Object;", "c", "(Ljava/lang/Object;)I", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Li1/i1;", "b", "Lh1/z;", "Lh1/r0;", "Li1/w0;", "Li1/w0;", "pagerScopeImpl", "itemCount", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i1 state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z<y> intervalContent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final r0 keyIndexMap;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final w0 pagerScopeImpl = w0.f88069a;

    public l0(i1 i1Var, z<y> zVar, r0 r0Var) {
        this.state = i1Var;
        this.intervalContent = zVar;
        this.keyIndexMap = r0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(l0 l0Var, int i15, r rVar, int i16) {
        if (rVar.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1142237095, i16, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item.<anonymous> (LazyLayoutPager.kt:221)");
            }
            n.a aVar = l0Var.intervalContent.l().get(i15);
            ((y) aVar.c()).a().g(l0Var.pagerScopeImpl, Integer.valueOf(i15 - aVar.getStartIndex()), rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(l0 l0Var, int i15, Object obj, int i16, r rVar, int i17) {
        l0Var.h(i15, obj, rVar, g4.a(i16 | 1));
        return i0.f148189a;
    }

    @Override // p056h1.o0
    public int a() {
        return this.intervalContent.m();
    }

    @Override // p056h1.o0
    public int c(Object key) {
        return this.keyIndexMap.c(key);
    }

    @Override // p056h1.o0
    public Object d(int index) {
        Object objD = this.keyIndexMap.d(index);
        return objD == null ? this.intervalContent.n(index) : objD;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof l0) {
            return fr.t.c(this.intervalContent, ((l0) other).intervalContent);
        }
        return false;
    }

    @Override // p056h1.o0
    public void h(final int i15, Object obj, r rVar, final int i16) {
        int i17;
        final int i18;
        final Object obj2;
        r rVarH = rVar.h(-1201380429);
        if ((i16 & 6) == 0) {
            i17 = (rVarH.c(i15) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= rVarH.G(obj) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.W(this) ? 256 : 128;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            if (t.k()) {
                t.o(-1201380429, i17, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item (LazyLayoutPager.kt:219)");
            }
            i18 = i15;
            obj2 = obj;
            j1.c(obj2, i18, this.state.getPinnedPages(), m.d(1142237095, true, new p() { // from class: i1.j0
                @Override // er.p
                public final Object B(Object obj3, Object obj4) {
                    return l0.l(this.f87931a, i15, (r) obj3, ((Integer) obj4).intValue());
                }
            }, rVarH, 54), rVarH, ((i17 >> 3) & 14) | 3072 | ((i17 << 3) & 112));
            if (t.k()) {
                t.n();
            }
        } else {
            i18 = i15;
            obj2 = obj;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: i1.k0
                @Override // er.p
                public final Object B(Object obj3, Object obj4) {
                    return l0.m(this.f87943a, i18, obj2, i16, (r) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }
}
