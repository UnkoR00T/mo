package g1;

import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b\u001e\u0010!R\u0014\u0010\"\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lg1/r;", "Lg1/o;", "Lg1/e1;", "state", "Lg1/l;", "intervalContent", "Lh1/r0;", "keyIndexMap", "<init>", "(Lg1/e1;Lg1/l;Lh1/r0;)V", "", "index", "", "d", "(I)Ljava/lang/Object;", "f", "key", "Loq/i0;", "h", "(ILjava/lang/Object;Lm2/r;I)V", "c", "(Ljava/lang/Object;)I", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Lg1/e1;", "b", "Lg1/l;", "Lh1/r0;", "()Lh1/r0;", "itemCount", "Lr0/o;", "e", "()Lr0/o;", "headerIndexes", "Lg1/z0;", "i", "()Lg1/z0;", "spanLayoutProvider", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class r implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e1 state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l intervalContent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p056h1.r0 keyIndexMap;

    public r(e1 e1Var, l lVar, p056h1.r0 r0Var) {
        this.state = e1Var;
        this.intervalContent = lVar;
        this.keyIndexMap = r0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(r rVar, int i15, p076m2.r rVar2, int i16) {
        if (rVar2.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(726189336, i16, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item.<anonymous> (LazyGridItemProvider.kt:81)");
            }
            h1.n.a<j> aVar = rVar.intervalContent.l().get(i15);
            aVar.c().a().g(w.f69445a, Integer.valueOf(i15 - aVar.getStartIndex()), rVar2, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(r rVar, int i15, Object obj, int i16, p076m2.r rVar2, int i17) {
        rVar.h(i15, obj, rVar2, g4.a(i16 | 1));
        return oq.i0.f148189a;
    }

    @Override // p056h1.o0
    public int a() {
        return this.intervalContent.m();
    }

    @Override // g1.o
    /* JADX INFO: renamed from: b, reason: from getter */
    public p056h1.r0 getKeyIndexMap() {
        return this.keyIndexMap;
    }

    @Override // p056h1.o0
    public int c(Object key) {
        return getKeyIndexMap().c(key);
    }

    @Override // p056h1.o0
    public Object d(int index) {
        Object objD = getKeyIndexMap().d(index);
        return objD == null ? this.intervalContent.n(index) : objD;
    }

    @Override // g1.o
    public r0.o e() {
        return this.intervalContent.r();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof r) {
            return fr.t.c(this.intervalContent, ((r) other).intervalContent);
        }
        return false;
    }

    @Override // p056h1.o0
    public Object f(int index) {
        return this.intervalContent.k(index);
    }

    @Override // p056h1.o0
    public void h(final int i15, Object obj, p076m2.r rVar, final int i16) {
        int i17;
        final int i18;
        final Object obj2;
        p076m2.r rVarH = rVar.h(1493551140);
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
            if (p076m2.t.k()) {
                p076m2.t.o(1493551140, i17, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:79)");
            }
            i18 = i15;
            obj2 = obj;
            p056h1.j1.c(obj2, i18, this.state.getPinnedItems(), y2.m.d(726189336, true, new er.p() { // from class: g1.p
                @Override // er.p
                public final Object B(Object obj3, Object obj4) {
                    return r.l(this.f69423a, i15, (p076m2.r) obj3, ((Integer) obj4).intValue());
                }
            }, rVarH, 54), rVarH, ((i17 >> 3) & 14) | 3072 | ((i17 << 3) & 112));
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            i18 = i15;
            obj2 = obj;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g1.q
                @Override // er.p
                public final Object B(Object obj3, Object obj4) {
                    return r.m(this.f69427a, i18, obj2, i16, (p076m2.r) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }

    @Override // g1.o
    public z0 i() {
        return this.intervalContent.getSpanLayoutProvider();
    }
}
