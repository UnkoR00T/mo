package f1;

import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p056h1.j1;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b \u0010&R\u0014\u0010'\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lf1/u;", "Lf1/r;", "Lf1/y0;", "state", "Lf1/p;", "intervalContent", "Lf1/f;", "itemScope", "Lh1/r0;", "keyIndexMap", "<init>", "(Lf1/y0;Lf1/p;Lf1/f;Lh1/r0;)V", "", "index", "", "key", "Loq/i0;", "h", "(ILjava/lang/Object;Lm2/r;I)V", "d", "(I)Ljava/lang/Object;", "f", "c", "(Ljava/lang/Object;)I", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Lf1/y0;", "b", "Lf1/p;", "Lf1/f;", "g", "()Lf1/f;", "Lh1/r0;", "()Lh1/r0;", "itemCount", "Lr0/o;", "e", "()Lr0/o;", "headerIndexes", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class u implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y0 state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p intervalContent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f itemScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p056h1.r0 keyIndexMap;

    public u(y0 y0Var, p pVar, f fVar, p056h1.r0 r0Var) {
        this.state = y0Var;
        this.intervalContent = pVar;
        this.itemScope = fVar;
        this.keyIndexMap = r0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(u uVar, int i15, p076m2.r rVar, int i16) {
        if (rVar.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-824725566, i16, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:78)");
            }
            h1.n.a<k> aVar = uVar.intervalContent.l().get(i15);
            aVar.c().a().g(uVar.getItemScope(), Integer.valueOf(i15 - aVar.getStartIndex()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(u uVar, int i15, Object obj, int i16, p076m2.r rVar, int i17) {
        uVar.h(i15, obj, rVar, g4.a(i16 | 1));
        return oq.i0.f148189a;
    }

    @Override // p056h1.o0
    public int a() {
        return this.intervalContent.m();
    }

    @Override // f1.r
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

    @Override // f1.r
    public r0.o e() {
        return this.intervalContent.s();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof u) {
            return fr.t.c(this.intervalContent, ((u) other).intervalContent);
        }
        return false;
    }

    @Override // p056h1.o0
    public Object f(int index) {
        return this.intervalContent.k(index);
    }

    @Override // f1.r
    /* JADX INFO: renamed from: g, reason: from getter */
    public f getItemScope() {
        return this.itemScope;
    }

    @Override // p056h1.o0
    public void h(final int i15, Object obj, p076m2.r rVar, final int i16) {
        int i17;
        final int i18;
        final Object obj2;
        p076m2.r rVarH = rVar.h(-462424778);
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
                p076m2.t.o(-462424778, i17, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:76)");
            }
            i18 = i15;
            obj2 = obj;
            j1.c(obj2, i18, this.state.getPinnedItems(), y2.m.d(-824725566, true, new er.p() { // from class: f1.s
                @Override // er.p
                public final Object B(Object obj3, Object obj4) {
                    return u.l(this.f54848a, i15, (p076m2.r) obj3, ((Integer) obj4).intValue());
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
            d5VarM.a(new er.p() { // from class: f1.t
                @Override // er.p
                public final Object B(Object obj3, Object obj4) {
                    return u.m(this.f54852a, i18, obj2, i16, (p076m2.r) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }
}
