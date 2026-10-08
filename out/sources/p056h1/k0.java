package p056h1;

import b3.i;
import er.l;
import er.p;
import oq.i0;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.r;
import p076m2.r0;
import p076m2.s0;
import p076m2.t;
import r0.g1;
import r0.t0;
import y2.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0012B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00012\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\u0018R\u00020\u00000\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019¨\u0006\u001b"}, d2 = {"Lh1/k0;", "", "Lb3/i;", "saveableStateHolder", "Lkotlin/Function0;", "Lh1/o0;", "itemProvider", "<init>", "(Lb3/i;Ler/a;)V", "key", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "index", CMSAttributeTableGenerator.CONTENT_TYPE, "Loq/i0;", "b", "(ILjava/lang/Object;Ljava/lang/Object;)Ler/p;", "a", "Lb3/i;", "Ler/a;", "d", "()Ler/a;", "Lr0/t0;", "Lh1/k0$a;", "Lr0/t0;", "lambdasCache", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i saveableStateHolder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er.a<o0> itemProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t0<Object, a> lambdasCache = g1.c();

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001b"}, d2 = {"Lh1/k0$a;", "", "", "index", "key", CMSAttributeTableGenerator.CONTENT_TYPE, "<init>", "(Lh1/k0;ILjava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Function0;", "Loq/i0;", "d", "()Ler/p;", "a", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "b", "h", "value", "c", "I", "i", "()I", "Ler/p;", "_content", "g", "content", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Object key;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Object contentType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private p<? super r, ? super Integer, i0> _content;

        /* JADX INFO: renamed from: h1.k0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"h1/k0$a$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C1810a implements r0 {
            public C1810a() {
            }

            @Override // p076m2.r0
            public void j() {
                a.this._content = null;
            }
        }

        public a(int i15, Object obj, Object obj2) {
            this.key = obj;
            this.contentType = obj2;
            this.index = i15;
        }

        private final p<r, Integer, i0> d() {
            final k0 k0Var = k0.this;
            return m.b(818252804, true, new p() { // from class: h1.i0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k0.a.e(k0Var, this, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 e(k0 k0Var, final a aVar, r rVar, int i15) {
            r rVar2;
            if (rVar.r((i15 & 3) != 2, i15 & 1)) {
                if (t.k()) {
                    t.o(818252804, i15, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:85)");
                }
                o0 o0VarA = k0Var.d().a();
                int iC = aVar.index;
                if ((iC >= o0VarA.a() || !fr.t.c(o0VarA.d(iC), aVar.key)) && (iC = o0VarA.c(aVar.key)) != -1) {
                    aVar.index = iC;
                }
                int i16 = iC;
                if (i16 != -1) {
                    rVar.X(-1664741271);
                    rVar2 = rVar;
                    n0.c(o0VarA, d3.a(k0Var.saveableStateHolder), i16, d3.a(aVar.key), rVar2, 0);
                    rVar2.R();
                } else {
                    rVar2 = rVar;
                    rVar2.X(-1664505826);
                    rVar2.R();
                }
                Object obj = aVar.key;
                boolean zG = rVar2.G(aVar);
                Object objE = rVar2.E();
                if (zG || objE == r.INSTANCE.a()) {
                    objE = new l() { // from class: h1.j0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return k0.a.f(this.f79446a, (s0) obj2);
                        }
                    };
                    rVar2.v(objE);
                }
                Function0.a(obj, (l) objE, rVar2, 0);
                if (t.k()) {
                    t.n();
                }
            } else {
                rVar.O();
            }
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r0 f(a aVar, s0 s0Var) {
            return aVar.new C1810a();
        }

        public final p<r, Integer, i0> g() {
            p pVar = this._content;
            if (pVar != null) {
                return pVar;
            }
            p<r, Integer, i0> pVarD = d();
            this._content = pVarD;
            return pVarD;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final Object getContentType() {
            return this.contentType;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final int getIndex() {
            return this.index;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k0(i iVar, er.a<? extends o0> aVar) {
        this.saveableStateHolder = iVar;
        this.itemProvider = aVar;
    }

    public final p<r, Integer, i0> b(int index, Object key, Object contentType) {
        a aVarE = this.lambdasCache.e(key);
        if (aVarE != null && aVarE.getIndex() == index && fr.t.c(aVarE.getContentType(), contentType)) {
            return aVarE.g();
        }
        a aVar = new a(index, key, contentType);
        this.lambdasCache.x(key, aVar);
        return aVar.g();
    }

    public final Object c(Object key) {
        if (key == null) {
            return null;
        }
        a aVarE = this.lambdasCache.e(key);
        if (aVarE != null) {
            return aVarE.getContentType();
        }
        o0 o0VarA = this.itemProvider.a();
        int iC = o0VarA.c(key);
        if (iC != -1) {
            return o0VarA.f(iC);
        }
        return null;
    }

    public final er.a<o0> d() {
        return this.itemProvider;
    }
}
