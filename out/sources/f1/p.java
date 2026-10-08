package f1;

import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p056h1.o2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ]\u0010\u0011\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00042\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0013\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u0015\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lf1/p;", "Lh1/z;", "Lf1/k;", "Lf1/q0;", "Lkotlin/Function1;", "Loq/i0;", "content", "<init>", "(Ler/l;)V", "", "count", "", "key", CMSAttributeTableGenerator.CONTENT_TYPE, "Lkotlin/Function2;", "Lf1/e;", "itemContent", "j", "(ILer/l;Ler/l;Ler/r;)V", "b", "(Ljava/lang/Object;Ljava/lang/Object;Ler/q;)V", "f", "(Ljava/lang/Object;Ljava/lang/Object;Ler/r;)V", "Lh1/o2;", "a", "Lh1/o2;", "t", "()Lh1/o2;", "intervals", "Lr0/i0;", "Lr0/i0;", "_headerIndexes", "Lr0/o;", "s", "()Lr0/o;", "headerIndexes", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p extends p056h1.z<k> implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o2<k> intervals = new o2<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private r0.i0 _headerIndexes;

    public p(er.l<? super q0, oq.i0> lVar) {
        lVar.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object u(Object obj, int i15) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object v(Object obj, int i15) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(er.q qVar, e eVar, int i15, p076m2.r rVar, int i16) {
        if ((i16 & 6) == 0) {
            i16 |= rVar.W(eVar) ? 4 : 2;
        }
        if (rVar.r((i16 & 131) != 130, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-857469575, i16, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:56)");
            }
            qVar.w(eVar, rVar, Integer.valueOf(i16 & 14));
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(er.r rVar, int i15, e eVar, p076m2.r rVar2, int i16) {
        if ((i16 & 6) == 0) {
            i16 |= rVar2.W(eVar) ? 4 : 2;
        }
        if (rVar2.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1588696110, i16, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.stickyHeader.<anonymous> (LazyListIntervalContent.kt:70)");
            }
            rVar.g(eVar, Integer.valueOf(i15), rVar2, Integer.valueOf(i16 & 14));
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return oq.i0.f148189a;
    }

    @Override // f1.q0
    public void b(final Object key, final Object contentType, final er.q<? super e, ? super p076m2.r, ? super Integer, oq.i0> content) {
        l().b(1, new k(key != null ? new er.l() { // from class: f1.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.u(key, ((Integer) obj).intValue());
            }
        } : null, new er.l() { // from class: f1.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.v(contentType, ((Integer) obj).intValue());
            }
        }, y2.m.b(-857469575, true, new er.r() { // from class: f1.o
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return p.w(content, (e) obj, ((Integer) obj2).intValue(), (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        })));
    }

    @Override // f1.q0
    public void f(Object key, Object contentType, final er.r<? super e, ? super Integer, ? super p076m2.r, ? super Integer, oq.i0> content) {
        r0.i0 i0Var = this._headerIndexes;
        if (i0Var == null) {
            i0Var = new r0.i0(0, 1, null);
            this._headerIndexes = i0Var;
        }
        i0Var.k(l().getSize());
        final int size = l().getSize();
        b(key, contentType, y2.m.b(-1588696110, true, new er.q() { // from class: f1.l
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return p.x(content, size, (e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }));
    }

    @Override // f1.q0
    public void j(int count, er.l<? super Integer, ? extends Object> key, er.l<? super Integer, ? extends Object> contentType, er.r<? super e, ? super Integer, ? super p076m2.r, ? super Integer, oq.i0> itemContent) {
        l().b(count, new k(key, contentType, itemContent));
    }

    public final r0.o s() {
        r0.i0 i0Var = this._headerIndexes;
        return i0Var != null ? i0Var : r0.p.a();
    }

    @Override // p056h1.z
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public o2<k> l() {
        return this.intervals;
    }
}
